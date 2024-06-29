import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class158 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field2355 = 0;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    private int field2366 = 0;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    private int field2363;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field2360;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[B")
    private byte[] field2362;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2358;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Leh;")
    public static class246 field2361 = new class246(89, -1);

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field2369 = -1;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/io/IOException;")
    private IOException field2367;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public final void method1012(byte arg0) {
        if (arg0 < 94) {
            this.field2366 = -59;
        }
        field2364++;
        this.field2360 = new class502();
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
    public final void run() {
        field2365++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2367 != null) {
                        return;
                    }
                    if (this.field2355 == 0) {
                        var2 = this.field2363 - (this.field2366 + 1);
                    } else if (this.field2366 <= this.field2355) {
                        var2 = this.field2355 - this.field2366 - 1;
                    } else {
                        var2 = this.field2363 - this.field2366;
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
                var3 = this.field2360.read(this.field2362, this.field2366, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2367 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2366 = (this.field2366 + var3) % this.field2363;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z")
    public final boolean method1013(int arg0, byte arg1) throws IOException {
        field2354++;
        if (arg0 <= 0 || arg0 >= this.field2363) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (arg1 < 92) {
                this.method1015((byte) -5);
            }
            int var4;
            if (this.field2355 <= this.field2366) {
                var4 = this.field2366 - this.field2355;
            } else {
                var4 = this.field2363 - (this.field2355 - this.field2366);
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field2367 == null) {
                return false;
            } else {
                throw new IOException(this.field2367.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBI)I")
    public static final int method1014(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        if (arg2 < 115) {
            field2368 = 13;
        }
        field2356++;
        return ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 5 << 7) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public final void method1015(byte arg0) {
        field2359++;
        synchronized (this) {
            if (arg0 > -14) {
                this.method1012((byte) 95);
            }
            if (this.field2367 == null) {
                this.field2367 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2358.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static void method1016(byte arg0) {
        field2361 = null;
        if (arg0 != 14) {
            method1016((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[BZI)I")
    public final int method1017(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field2357++;
        if (arg0 < 0 || arg3 < 0 || arg1.length < (arg0 + arg3)) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (!arg2) {
                this.field2367 = null;
            }
            int var6;
            if (this.field2366 < this.field2355) {
                var6 = this.field2363 + this.field2366 - this.field2355;
            } else {
                var6 = this.field2366 - this.field2355;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field2367 != null) {
                throw new IOException(this.field2367.toString());
            }
            if (this.field2363 < this.field2355 + arg0) {
                int var7 = this.field2363 - this.field2355;
                class182.method1135(this.field2362, this.field2355, arg1, arg3, var7);
                class182.method1135(this.field2362, 0, arg1, arg3 + var7, -var7 + arg0);
            } else {
                class182.method1135(this.field2362, this.field2355, arg1, arg3, arg0);
            }
            this.field2355 = (this.field2355 + arg0) % this.field2363;
            this.notifyAll();
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class158(InputStream arg0, int arg1) {
        this.field2363 = arg1 + 1;
        this.field2360 = arg0;
        this.field2362 = new byte[this.field2363];
        this.field2358 = new Thread(this);
        this.field2358.setDaemon(true);
        this.field2358.start();
    }
}
