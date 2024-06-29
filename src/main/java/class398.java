import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class398 extends class122 {

    @OriginalMember(owner = "client!fha", name = "w", descriptor = "I")
    private int field5942;

    @OriginalMember(owner = "client!fha", name = "r", descriptor = "I")
    private int field5948;

    @OriginalMember(owner = "client!fha", name = "s", descriptor = "I")
    private int field5939;

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
    private int field5944;

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5951 = new String[] { method3143(method3142("zsj/w4")), method3143(method3142("g5%/N")), method3143(method3142("rngm")), method3143(method3142("zsj/q4")), method3143(method3142("zsj/x4")), method3143(method3142("zsj/v4")), method3143(method3142("zsj/r4")), method3143(method3142("zsj/\u007f4")), method3143(method3142("zsj/~4")), method3143(method3142("zsj/\u000fuubu\r4")), method3143(method3142("zsj/p4")) };

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "Lup;")
    public static class290 field5941 = new class290();

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!fha", name = "t", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!fha", name = "x", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!fha", name = "u", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!fha", name = "v", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!fha", name = "o", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "Lfda;")
    public static class338 field5950;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLub;)V", line = 5)
    public static final void method3137(byte arg0, class22 arg1) {
        try {
            arg1.method1412(true, class315.field4987.method3636(-124));
            ++field5945;
            arg1.method1412(true, class95.field1072.method3636(53));
            arg1.method1412(true, class669.field9714.method3636(49));
            arg1.method1412(true, class72.field794.method3636(-124));
            arg1.method1412(true, class227.field3474.method3636(35));
            arg1.method1412(true, class550.field8195.method3636(-121));
            arg1.method1412(true, class232.field3503.method3636(-121));
            arg1.method1412(true, class589.field8661.method3636(120));
            arg1.method1412(true, class383.field5798.method3636(15));
            if (arg0 < 85) {
                method3140((byte) 106, -57);
            }
            arg1.method1412(true, class614.field8975.method3636(-123));
            arg1.method1412(true, class107.field1239.method3636(-117));
            arg1.method1412(true, class657.field9489.method3636(60));
            arg1.method1412(true, class743.field10810.method3636(30));
            arg1.method1412(true, class753.field10953.method3636(38));
            arg1.method1412(true, class571.field8452.method3636(-124));
            arg1.method1412(true, class647.field9368.method3636(-127));
            arg1.method1412(true, class234.field3531.method3636(-128));
            arg1.method1412(true, class489.field7024.method3636(65));
            arg1.method1412(true, class137.field1631.method3636(113));
            arg1.method1412(true, class411.field6075.method3636(-123));
            arg1.method1412(true, class604.field8851.method3636(-117));
            arg1.method1412(true, class122.field1440.method3636(-126));
            arg1.method1412(true, class304.field4754.method3636(16));
            arg1.method1412(true, class366.field5598.method3636(96));
            arg1.method1412(true, class85.field952.method3636(21));
            arg1.method1412(true, class729.field10586.method3636(81));
            arg1.method1412(true, class710.field10289.method3636(68));
            arg1.method1412(true, class630.field9209.method3636(-116));
            arg1.method1412(true, class443.field6513.method3636(-121));
            arg1.method1412(true, class523.field7639.method3636(-127));
            arg1.method1412(true, class342.field5319.method3636(-120));
            arg1.method1412(true, class426.field6273.method3636(28));
            arg1.method1412(true, class538.method4059(500));
            arg1.method1412(true, class474.method3599(-23166));
            arg1.method1412(true, class433.field6362.method3636(-118));
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5951[3] + arg0 + ',' + (arg1 != null ? field5951[1] : field5951[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)V", line = 50)
    public static final void method3138(boolean arg0) {
        try {
            if (arg0) {
                method3140((byte) 8, 40);
            }
            ++field5940;
            class178 var1 = class245.field3750;
            synchronized (class245.field3750) {
                class245.field3750.method1559(0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5951[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIB)V", line = 63)
    public final void method1056(int arg0, int arg1, byte arg2) {
        try {
            ++field5949;
            int var4 = this.field5944 * arg1 >> 12;
            int var5 = this.field5939 * arg1 >> 12;
            int var6 = this.field5948 * arg0 >> 12;
            int var7 = this.field5942 * arg0 >> 12;
            if (arg2 <= 59) {
                field5941 = null;
            }
            class223.method1933(var7, var5, (byte) 111, var4, super.field1435, super.field1434, var6);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5951[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)V", line = 83)
    public static void method3139(int arg0) {
        try {
            field5941 = null;
            int var1 = 72 % ((arg0 - 4) / 48);
            field5950 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5951[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(III)V", line = 95)
    public final void method1062(int arg0, int arg1, int arg2) {
        try {
            ++field5943;
            int var4 = this.field5944 * arg2 >> 12;
            int var5 = this.field5939 * arg2 >> 12;
            int var6 = this.field5948 * arg1 >> 12;
            int var7 = this.field5942 * arg1 >> 12;
            class320.method2717(var7, var4, super.field1434, super.field1437, var5, super.field1435, var6, (byte) -16);
            if (arg0 <= 0) {
                field5941 = null;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5951[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(BI)Z", line = 118)
    public static final boolean method3140(byte arg0, int arg1) {
        try {
            ++field5946;
            int var2 = 36 % ((arg0 - -79) / 47);
            return ~arg1 == -53 || arg1 == 17 || ~arg1 == -1005 || ~arg1 == -47 || arg1 == 47;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5951[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)I", line = 132)
    public static final int method3141(int arg0) {
        try {
            ++field5947;
            return class166.field2283 == arg0 ? class370.field5643 : 0;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5951[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIIIII)V", line = 146)
    public class398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        try {
            this.field5942 = arg3;
            this.field5948 = arg1;
            this.field5939 = arg2;
            this.field5944 = arg0;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5951[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZII)V", line = 157)
    public final void method1061(boolean arg0, int arg1, int arg2) {
        try {
            ++field5938;
            int var4 = this.field5944 * arg1 >> 12;
            int var5 = this.field5939 * arg1 >> 12;
            if (arg0) {
                this.method1061(true, 117, 56);
            }
            int var6 = this.field5948 * arg2 >> 12;
            int var7 = this.field5942 * arg2 >> 12;
            class350.method2873(super.field1437, var5, var6, (byte) 111, var7, var4);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5951[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3142(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3143(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
