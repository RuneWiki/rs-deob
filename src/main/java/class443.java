import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class443 implements Runnable {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    private int field6368 = 0;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Z")
    private boolean field6378 = false;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private int field6367 = 0;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Z")
    private boolean field6371 = false;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Lec;")
    private class248 field6386;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field6384;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field6374;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6383;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    private int field6377;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Ljb;")
    public static class519 field6372 = new class519(48, 6);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lth;")
    private class621 field6370;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "[B")
    private byte[] field6382;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "[[[Lvda;")
    public static class194[][][] field6387;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public final void method2643(boolean arg0) throws IOException {
        field6385++;
        if (this.field6371) {
            return;
        }
        if (this.field6378) {
            this.field6378 = false;
            throw new IOException();
        } else if (arg0) {
            this.field6386 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final int method2644(int arg0) throws IOException {
        field6375++;
        if (this.field6371) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field6367 = 84;
            }
            return this.field6374.read();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
    public final int method2645(byte arg0) throws IOException {
        if (arg0 <= 70) {
            this.field6374 = null;
        }
        field6388++;
        return this.field6371 ? 0 : this.field6374.available();
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method2646(int arg0) {
        field6381++;
        if (this.field6371) {
            return;
        }
        synchronized (this) {
            this.field6371 = true;
            this.notifyAll();
        }
        if (this.field6370 != null) {
            while (this.field6370.field8405 == 0) {
                class171.method1152(1L, false);
            }
            if (this.field6370.field8405 == 1) {
                try {
                    ((Thread) this.field6370.field8403).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6370 = null;
        if (arg0 != -1) {
            this.field6377 = 46;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public final void method2647(int arg0) {
        field6379++;
        if (this.field6371) {
            return;
        }
        this.field6374 = new class91();
        if (arg0 >= -115) {
            this.method2647(-49);
        }
        this.field6383 = new class544();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BIZ)V")
    public final void method2648(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field6376++;
        if (arg3) {
            this.field6383 = null;
        }
        if (this.field6371) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field6374.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!ij", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field6368 == this.field6367) {
                            if (this.field6371) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field6368;
                        if (this.field6368 <= this.field6367) {
                            var3 = this.field6367 - this.field6368;
                        } else {
                            var3 = this.field6377 - this.field6368;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field6383.write(this.field6382, var2, var3);
                    } catch (IOException var9) {
                        this.field6378 = true;
                    }
                    this.field6368 = (this.field6368 + var3) % this.field6377;
                    try {
                        if (this.field6368 == this.field6367) {
                            this.field6383.flush();
                        }
                    } catch (IOException var8) {
                        this.field6378 = true;
                    }
                    continue;
                }
                try {
                    if (this.field6374 != null) {
                        this.field6374.close();
                    }
                    if (this.field6383 != null) {
                        this.field6383.close();
                    }
                    if (this.field6384 != null) {
                        this.field6384.close();
                    }
                } catch (IOException var7) {
                }
                this.field6382 = null;
                break;
            }
        } catch (Exception var12) {
            class607.method3379(null, var12, true);
        }
        field6369++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI[BI)V")
    public final void method2649(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6380++;
        if (this.field6371) {
            return;
        }
        if (this.field6378) {
            this.field6378 = false;
            throw new IOException();
        }
        if (this.field6382 == null) {
            this.field6382 = new byte[this.field6377];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field6382[this.field6367] = arg2[arg3 + var6];
                this.field6367 = (this.field6367 + 1) % this.field6377;
                if ((this.field6368 + this.field6377 - 100) % this.field6377 == this.field6367) {
                    throw new IOException();
                }
            }
            if (this.field6370 == null) {
                this.field6370 = this.field6386.method1538(this, (byte) -105, 3);
            }
            this.notifyAll();
        }
        if (arg0) {
            this.field6367 = 2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public static void method2650(int arg0) {
        if (arg0 != 1) {
            field6387 = null;
        }
        field6372 = null;
        field6387 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/net/Socket;Lec;I)V")
    public class443(Socket arg0, class248 arg1, int arg2) throws IOException {
        this.field6386 = arg1;
        this.field6384 = arg0;
        this.field6384.setSoTimeout(30000);
        this.field6384.setTcpNoDelay(true);
        this.field6374 = this.field6384.getInputStream();
        this.field6383 = this.field6384.getOutputStream();
        this.field6377 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2646(-1);
        field6373++;
    }
}
