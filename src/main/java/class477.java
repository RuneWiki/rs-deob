import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class477 implements Runnable {

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    private int field6533 = 0;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "Z")
    private boolean field6549 = false;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    private int field6547 = 0;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "Z")
    private boolean field6550 = false;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "Lkk;")
    private class192 field6542;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field6532;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field6539;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6538;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    private int field6545;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "Ltj;")
    private class198 field6543;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "[B")
    private byte[] field6536;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[BII)V", line = 4)
    public final void method2685(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6537++;
        if (this.field6550) {
            return;
        }
        if (arg0 != -5324) {
            this.field6549 = false;
        }
        if (this.field6549) {
            this.field6549 = false;
            throw new IOException();
        }
        if (this.field6536 == null) {
            this.field6536 = new byte[this.field6545];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field6536[this.field6533] = arg1[arg2 + var6];
                this.field6533 = (this.field6533 + 1) % this.field6545;
                if (((this.field6545 + this.field6547 - 100) % this.field6545) == this.field6533) {
                    throw new IOException();
                }
            }
            if (this.field6543 == null) {
                this.field6543 = this.field6542.method1311(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!oga", name = "run", descriptor = "()V", line = 56)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field6547 == this.field6533) {
                            if (this.field6550) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field6547;
                        if (this.field6533 >= this.field6547) {
                            var3 = this.field6533 - this.field6547;
                        } else {
                            var3 = this.field6545 - this.field6547;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field6538.write(this.field6536, var2, var3);
                    } catch (IOException var9) {
                        this.field6549 = true;
                    }
                    this.field6547 = (this.field6547 + var3) % this.field6545;
                    try {
                        if (this.field6547 == this.field6533) {
                            this.field6538.flush();
                        }
                    } catch (IOException var8) {
                        this.field6549 = true;
                    }
                    continue;
                }
                try {
                    if (this.field6539 != null) {
                        this.field6539.close();
                    }
                    if (this.field6538 != null) {
                        this.field6538.close();
                    }
                    if (this.field6532 != null) {
                        this.field6532.close();
                    }
                } catch (IOException var7) {
                }
                this.field6536 = null;
                break;
            }
        } catch (Exception var12) {
            class135.method1056(null, var12, 1);
        }
        field6552++;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLee;)V", line = 130)
    public static final void method2686(byte arg0, class677 arg1) {
        field6546++;
        if (arg0 != 61) {
            method2686((byte) 59, null);
        }
        byte[] var2 = new byte[24];
        if (class671.field9154 != null) {
            try {
                class671.field9154.method3138((byte) -66, 0L);
                class671.field9154.method3142(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method3827(0, (byte) -32, var2, 24);
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Ljava/net/Socket;Lkk;I)V", line = 355)
    public class477(Socket arg0, class192 arg1, int arg2) throws IOException {
        this.field6542 = arg1;
        this.field6532 = arg0;
        this.field6532.setSoTimeout(30000);
        this.field6532.setTcpNoDelay(true);
        this.field6539 = this.field6532.getInputStream();
        this.field6538 = this.field6532.getOutputStream();
        this.field6545 = arg2;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V", line = 179)
    public final void method2687(byte arg0) {
        field6540++;
        if (this.field6550) {
            return;
        }
        synchronized (this) {
            this.field6550 = true;
            this.notifyAll();
        }
        if (this.field6543 != null) {
            while (this.field6543.field2987 == 0) {
                class226.method1447((byte) -124, 1L);
            }
            if (this.field6543.field2987 == 1) {
                try {
                    ((Thread) this.field6543.field2986).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 != -85) {
            this.method2691(-36);
        }
        this.field6543 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 218)
    public final void method2688(int arg0) throws IOException {
        field6541++;
        if (arg0 == 0 && !this.field6550 && this.field6549) {
            this.field6549 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([BIIB)V", line = 244)
    public final void method2689(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field6548++;
        if (this.field6550) {
            return;
        }
        int var5 = 97 / ((arg3 - 5) / 43);
        while (arg1 > 0) {
            int var6 = this.field6539.read(arg0, arg2, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 -= var6;
            arg2 += var6;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Z", line = 270)
    public static final boolean method2690(int arg0, int arg1) {
        if (arg0 != 12459) {
            field6555 = -35;
        }
        field6544++;
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V", line = 284)
    public final void method2691(int arg0) {
        if (arg0 != 0) {
            this.finalize();
        }
        field6553++;
        if (!this.field6550) {
            this.field6539 = new class222();
            this.field6538 = new class168();
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)I", line = 301)
    public final int method2692(byte arg0) throws IOException {
        if (arg0 < 66) {
            this.field6539 = null;
        }
        field6551++;
        return this.field6550 ? 0 : this.field6539.read();
    }

    @OriginalMember(owner = "client!oga", name = "finalize", descriptor = "()V", line = 315)
    protected final void finalize() {
        this.method2687((byte) -85);
        field6535++;
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)I", line = 324)
    public final int method2693(byte arg0) throws IOException {
        field6554++;
        if (this.field6550) {
            return 0;
        } else {
            int var2 = 53 / (arg0 / 56);
            return this.field6539.available();
        }
    }
}
