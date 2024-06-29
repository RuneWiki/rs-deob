import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class550 implements Runnable {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    private int field7439 = 0;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    private int field7452 = 0;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    private int field7451;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field7442;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "[B")
    private byte[] field7448;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field7446;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "J")
    public static volatile long field7447 = 0L;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "J")
    public static long field7449 = 0L;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field7440;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 6)
    public final void method3022(int arg0) {
        if (arg0 == 0) {
            field7441++;
            this.field7442 = new class201();
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 24)
    public final void method3023(int arg0) {
        field7445++;
        synchronized (this) {
            if (this.field7440 == null) {
                this.field7440 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field7446.join();
            if (arg0 != 13593) {
                this.field7442 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!gl", name = "run", descriptor = "()V", line = 45)
    public final void run() {
        field7450++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7440 != null) {
                        return;
                    }
                    if (this.field7452 == 0) {
                        var2 = this.field7451 - this.field7439 - 1;
                    } else if (this.field7439 <= this.field7452) {
                        var2 = this.field7452 - (this.field7439 + 1);
                    } else {
                        var2 = this.field7451 - this.field7439;
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
                var3 = this.field7442.read(this.field7448, this.field7439, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7440 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7439 = (this.field7439 + var3) % this.field7451;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 106)
    public static final void method3024(int arg0, String arg1) {
        field7437++;
        if (arg0 < 114 || arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class200.method1347((byte) -117, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class261.field3711; var3++) {
            String var4 = client.field3854[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class200.method1347((byte) -122, var4);
            if (var5 != null && var5.equals(var2)) {
                class261.field3711--;
                for (int var6 = var3; var6 < class261.field3711; var6++) {
                    client.field3854[var6] = client.field3854[var6 + 1];
                    class272.field3836[var6] = class272.field3836[var6 + 1];
                    class325.field4809[var6] = class325.field4809[var6 + 1];
                    class24.field327[var6] = class24.field327[var6 + 1];
                    class357.field5121[var6] = class357.field5121[var6 + 1];
                }
                class426.field6000++;
                class200.field2957 = class93.field1231;
                class1.method5(1, class661.field9296);
                class288.field4014.method746((byte) -98, class499.method2790(arg1, 112));
                class288.field4014.method708(-124, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIB)Z", line = 169)
    public static final boolean method3025(int arg0, int arg1, byte arg2) {
        field7443++;
        if (arg2 == 79) {
            return class10.method50(arg0, arg1, -101) || class454.method2603(arg2 ^ 0x104F, arg0, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ[BI)I", line = 181)
    public final int method3026(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1) {
            field7447 = 20L;
        }
        field7438++;
        if (arg3 < 0 || arg0 < 0 || arg2.length < arg0 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field7452 <= this.field7439) {
                var6 = this.field7439 - this.field7452;
            } else {
                var6 = this.field7451 + this.field7439 - this.field7452;
            }
            if (arg3 > var6) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field7440 != null) {
                throw new IOException(this.field7440.toString());
            }
            if (this.field7451 < (this.field7452 + arg3)) {
                int var7 = this.field7451 - this.field7452;
                class282.method1706(this.field7448, this.field7452, arg2, arg0, var7);
                class282.method1706(this.field7448, 0, arg2, arg0 + var7, -var7 + arg3);
            } else {
                class282.method1706(this.field7448, this.field7452, arg2, arg0, arg3);
            }
            this.field7452 = (this.field7452 + arg3) % this.field7451;
            this.notifyAll();
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 237)
    public class550(InputStream arg0, int arg1) {
        this.field7451 = arg1 + 1;
        this.field7442 = arg0;
        this.field7448 = new byte[this.field7451];
        this.field7446 = new Thread(this);
        this.field7446.setDaemon(true);
        this.field7446.start();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Z", line = 255)
    public final boolean method3027(int arg0, int arg1) throws IOException {
        field7444++;
        if (arg1 <= arg0 || this.field7451 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field7439 >= this.field7452) {
                var4 = this.field7439 - this.field7452;
            } else {
                var4 = this.field7451 + this.field7439 - this.field7452;
            }
            if (var4 >= arg1) {
                return true;
            } else if (this.field7440 == null) {
                return false;
            } else {
                throw new IOException(this.field7440.toString());
            }
        }
    }
}
