import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class211 implements Runnable {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private int field2524 = 0;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    private int field2531 = 0;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field2537;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[B")
    private byte[] field2534;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field2533;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lni;")
    public static class522 field2530;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field2525;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2530 = null;
        if (arg0 != 0) {
            field2526 = -71;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public final void method1176(byte arg0) {
        if (arg0 <= 85) {
            this.run();
        }
        field2532++;
        this.field2537 = new class456();
    }

    @OriginalMember(owner = "client!ik", name = "run", descriptor = "()V")
    public final void run() {
        field2535++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2525 != null) {
                        return;
                    }
                    if (this.field2524 == 0) {
                        var2 = this.field2536 - this.field2531 - 1;
                    } else if (this.field2524 >= this.field2531) {
                        var2 = this.field2524 - this.field2531 - 1;
                    } else {
                        var2 = this.field2536 - this.field2531;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field2537.read(this.field2534, this.field2531, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2525 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2531 = (this.field2531 + var3) % this.field2536;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public final void method1177(int arg0) {
        field2527++;
        synchronized (this) {
            if (this.field2525 == null) {
                this.field2525 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            if (arg0 <= 53) {
                field2526 = 123;
            }
            this.field2533.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[BIB)I")
    public final int method1178(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field2529++;
        if (arg2 < 0 || arg0 < 0 || arg1.length < (arg0 + arg2)) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field2531 < this.field2524) {
                var6 = this.field2536 + this.field2531 - this.field2524;
            } else {
                var6 = this.field2531 - this.field2524;
            }
            if (arg3 != 59) {
                this.method1177(-89);
            }
            if (arg2 > var6) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field2525 != null) {
                throw new IOException(this.field2525.toString());
            }
            if (this.field2536 >= this.field2524 + arg2) {
                class373.method2194(this.field2534, this.field2524, arg1, arg0, arg2);
            } else {
                int var7 = this.field2536 - this.field2524;
                class373.method2194(this.field2534, this.field2524, arg1, arg0, var7);
                class373.method2194(this.field2534, 0, arg1, arg0 + var7, arg2 - var7);
            }
            this.field2524 = (this.field2524 + arg2) % this.field2536;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)Z")
    public final boolean method1179(int arg0, byte arg1) throws IOException {
        field2528++;
        if (arg1 > -120) {
            field2530 = null;
        }
        if (arg0 <= 0 || arg0 >= this.field2536) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field2524 > this.field2531) {
                var4 = this.field2536 - (this.field2524 - this.field2531);
            } else {
                var4 = this.field2531 - this.field2524;
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field2525 == null) {
                return false;
            } else {
                throw new IOException(this.field2525.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class211(InputStream arg0, int arg1) {
        this.field2536 = arg1 + 1;
        this.field2537 = arg0;
        this.field2534 = new byte[this.field2536];
        this.field2533 = new Thread(this);
        this.field2533.setDaemon(true);
        this.field2533.start();
    }
}
