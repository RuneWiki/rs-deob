import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class164 implements Runnable {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field2474 = 0;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Z")
    private boolean field2477 = false;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    private int field2482 = 0;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Z")
    private boolean field2483 = false;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lul;")
    private class411 field2488;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field2480;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field2476;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2481;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Z")
    public static boolean field2484 = false;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Lgm;")
    private class81 field2486;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[B")
    private byte[] field2489;

    @OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2487++;
        this.method1186((byte) -124);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BII)V")
    public final void method1181(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2473++;
        if (this.field2477) {
            return;
        }
        if (this.field2483) {
            this.field2483 = false;
            throw new IOException();
        }
        if (this.field2489 == null) {
            this.field2489 = new byte[5000];
        }
        if (arg0 > -26) {
            this.run();
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2489[this.field2474] = arg1[arg3 + var6];
                this.field2474 = (this.field2474 + 1) % 5000;
                if (((this.field2482 + 4900) % 5000) == this.field2474) {
                    throw new IOException();
                }
            }
            if (this.field2486 == null) {
                this.field2486 = this.field2488.method2436(this, 24305, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public final int method1182(int arg0) throws IOException {
        field2471++;
        if (this.field2477) {
            return 0;
        } else {
            if (arg0 != -1) {
                this.field2483 = true;
            }
            return this.field2476.read();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public final void method1183(byte arg0) throws IOException {
        if (arg0 != -89) {
            return;
        }
        field2470++;
        if (!this.field2477 && this.field2483) {
            this.field2483 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I[BII)V")
    public final void method1184(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2472++;
        if (this.field2477) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2476.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
        if (arg0 != 0) {
            this.method1186((byte) 107);
        }
    }

    @OriginalMember(owner = "client!bj", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2482 == this.field2474) {
                            if (this.field2477) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2482;
                        if (this.field2482 > this.field2474) {
                            var3 = 5000 - this.field2482;
                        } else {
                            var3 = this.field2474 - this.field2482;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2481.write(this.field2489, var2, var3);
                    } catch (IOException var9) {
                        this.field2483 = true;
                    }
                    this.field2482 = (this.field2482 + var3) % 5000;
                    try {
                        if (this.field2482 == this.field2474) {
                            this.field2481.flush();
                        }
                    } catch (IOException var8) {
                        this.field2483 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2476 != null) {
                        this.field2476.close();
                    }
                    if (this.field2481 != null) {
                        this.field2481.close();
                    }
                    if (this.field2480 != null) {
                        this.field2480.close();
                    }
                } catch (IOException var7) {
                }
                this.field2489 = null;
                break;
            }
        } catch (Exception var12) {
            class266.method1710((byte) 81, var12, null);
        }
        field2479++;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public final void method1185(int arg0) {
        field2469++;
        if (this.field2477) {
            return;
        }
        if (arg0 != -31318) {
            this.field2474 = 64;
        }
        this.field2476 = new class283();
        this.field2481 = new class194();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public final void method1186(byte arg0) {
        field2485++;
        if (this.field2477) {
            return;
        }
        synchronized (this) {
            this.field2477 = true;
            this.notifyAll();
        }
        if (arg0 >= -110) {
            this.method1186((byte) 86);
        }
        if (this.field2486 != null) {
            while (this.field2486.field1314 == 0) {
                class477.method2826(1L, 0);
            }
            if (this.field2486.field1314 == 1) {
                try {
                    ((Thread) this.field2486.field1311).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2486 = null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I")
    public final int method1187(int arg0) throws IOException {
        field2475++;
        if (arg0 > -109) {
            this.field2480 = null;
        }
        return this.field2477 ? 0 : this.field2476.available();
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/net/Socket;Lul;)V")
    public class164(Socket arg0, class411 arg1) throws IOException {
        this.field2488 = arg1;
        this.field2480 = arg0;
        this.field2480.setSoTimeout(30000);
        this.field2480.setTcpNoDelay(true);
        this.field2476 = this.field2480.getInputStream();
        this.field2481 = this.field2480.getOutputStream();
    }
}
