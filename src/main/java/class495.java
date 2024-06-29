import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class495 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public int field7264 = 128;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public int field7272 = 128;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public int field7262;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public int field7265;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public int field7267;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public int field7261;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7274 = new String[] { method3815(method3814("} \u001f\u0007wf=E\u00056")), method3815(method3814("} \u001fy6")), method3815(method3814("} \u001fz6")), method3815(method3814("sz\u001f\u0015c")), method3815(method3814("f!]W")), method3815(method3814("} \u001fx6")) };

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "[I")
    public static int[] field7268 = new int[3];

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "J")
    public static long field7270 = -1L;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field7273 = -1;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public int field7259;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public int field7260;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public int field7263;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public int field7266;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public int field7271;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lut;I)V", line = 4)
    public final void method3811(class495 arg0, int arg1) {
        try {
            if (arg1 != 128) {
                field7270 = -21L;
            }
            field7269++;
            this.field7265 = arg0.field7265;
            this.field7267 = arg0.field7267;
            this.field7261 = arg0.field7261;
            this.field7264 = arg0.field7264;
            this.field7262 = arg0.field7262;
            this.field7272 = arg0.field7272;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7274[2] + (arg0 == null ? field7274[4] : field7274[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I)V", line = 65)
    public class495(int arg0) {
        try {
            this.field7262 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7274[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(IIIIII)V", line = 73)
    private class495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field7265 = arg3;
            this.field7264 = arg1;
            this.field7267 = arg5;
            this.field7261 = arg4;
            this.field7262 = arg0;
            this.field7272 = arg2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7274[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 32)
    public static void method3812(int arg0) {
        try {
            int var1 = 37 / ((arg0 - 16) / 59);
            field7268 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7274[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lut;", line = 47)
    public final class495 method3813(byte arg0) {
        try {
            field7258++;
            if (arg0 != -105) {
                method3812(-1);
            }
            return new class495(this.field7262, this.field7264, this.field7272, this.field7265, this.field7261, this.field7267);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7274[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3814(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3815(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
