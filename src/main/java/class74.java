import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class74 implements Runnable {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    private int field1080 = 0;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    private int field1081 = 0;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field1088;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[B")
    private byte[] field1085;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1089;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Lmt;")
    public static class419 field1093 = new class419(13, 0, 1, 0);

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Ljw;")
    public static class581 field1097 = new class581(92, -2);

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "[I")
    public static int[] field1098 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "D")
    public static double field1099;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Laj;")
    public static class333 field1100;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Ljava/io/IOException;")
    private IOException field1094;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method657(byte arg0) {
        field1100 = null;
        field1098 = null;
        field1093 = null;
        field1097 = null;
        if (arg0 != 39) {
            field1093 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method658(int arg0) {
        this.field1088 = new class563();
        if (arg0 != 1160472800) {
            this.field1081 = -113;
        }
        field1090++;
    }

    @OriginalMember(owner = "client!qh", name = "run", descriptor = "()V")
    public final void run() {
        field1091++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1094 != null) {
                        return;
                    }
                    if (this.field1081 == 0) {
                        var2 = this.field1095 - this.field1080 - 1;
                    } else if (this.field1081 <= this.field1080) {
                        var2 = this.field1095 - this.field1080;
                    } else {
                        var2 = this.field1081 - this.field1080 - 1;
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
                var3 = this.field1088.read(this.field1085, this.field1080, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1094 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1080 = (this.field1080 + var3) % this.field1095;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public final void method659(boolean arg0) {
        synchronized (this) {
            if (this.field1094 == null) {
                this.field1094 = new IOException("");
            }
            this.notifyAll();
        }
        field1079++;
        try {
            this.field1089.join();
            if (arg0) {
                field1093 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZB)I")
    public static final int method660(boolean arg0, byte arg1) {
        field1086++;
        if (class383.field5611 == null) {
            return 0;
        } else if (arg0 || class174.field2339 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class383.field5611.length; var3++) {
                int var5 = class383.field5611[var3];
                if (class543.field7371.method2104(60, var5)) {
                    var2++;
                }
                if (class569.field7583.method2104(-101, var5)) {
                    var2++;
                }
            }
            int var4 = 72 / ((48 - arg1) / 37);
            return var2;
        } else {
            return class383.field5611.length * 2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
    public static final boolean method661(int arg0, int arg1, int arg2) {
        field1087++;
        if (arg0 >= 0 && arg1 >= 0 && arg0 < class66.field931[1].length && arg1 < class66.field931[1][arg0].length) {
            return (class66.field931[arg2][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
    public final boolean method662(int arg0, int arg1) throws IOException {
        field1083++;
        if (arg0 >= arg1 || this.field1095 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field1081 <= this.field1080) {
                var4 = this.field1080 - this.field1081;
            } else {
                var4 = this.field1095 + this.field1080 - this.field1081;
            }
            if (arg1 <= var4) {
                return true;
            } else if (this.field1094 == null) {
                this.notifyAll();
                return false;
            } else {
                throw new IOException(this.field1094.toString());
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBI)V")
    public static final void method663(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1092++;
        class16 var5 = class94.method753(19, 13175, (long) arg1 << 32 | (long) arg0);
        var5.method119(arg3 - 49);
        var5.field237 = arg2;
        if (arg3 == -63) {
            var5.field244 = arg4;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[BB)I")
    public final int method664(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field1096++;
        if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field1080 >= this.field1081) {
                var6 = this.field1080 - this.field1081;
            } else {
                var6 = this.field1095 + this.field1080 - this.field1081;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field1094 != null) {
                throw new IOException(this.field1094.toString());
            }
            if ((this.field1081 + arg1) > this.field1095) {
                int var7 = this.field1095 - this.field1081;
                class278.method1796(this.field1085, this.field1081, arg2, arg0, var7);
                class278.method1796(this.field1085, 0, arg2, arg0 + var7, -var7 + arg1);
            } else {
                class278.method1796(this.field1085, this.field1081, arg2, arg0, arg1);
            }
            this.field1081 = (this.field1081 + arg1) % this.field1095;
            this.notifyAll();
            return arg3 == -110 ? arg1 : -22;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IZIILdia;IB)Lme;")
    public static final class207 method665(int arg0, int[] arg1, boolean arg2, int arg3, int arg4, class246 arg5, int arg6, byte arg7) {
        field1084++;
        if (arg7 != -98) {
            return null;
        } else if (!arg5.field3609 && (!class117.method957(-6602, arg0) || !class117.method957(-6602, arg4))) {
            return arg5.field3653 ? new class207(arg5, 34037, arg0, arg4, arg2, arg1, arg3, arg6) : new class207(arg5, arg0, arg4, class719.method4014(arg0, (byte) -100), class719.method4014(arg4, (byte) -100), arg1);
        } else {
            return new class207(arg5, 3553, arg0, arg4, arg2, arg1, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class74(InputStream arg0, int arg1) {
        this.field1095 = arg1 + 1;
        this.field1088 = arg0;
        this.field1085 = new byte[this.field1095];
        this.field1089 = new Thread(this);
        this.field1089.setDaemon(true);
        this.field1089.start();
    }
}
