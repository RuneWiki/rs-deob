import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class707 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "S")
    public short field9881;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Z")
    public boolean field9879;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field9880;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field9876;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "B")
    public byte field9877;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "S")
    public short field9886;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "S")
    public short field9882;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "B")
    public byte field9878;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9887 = new String[] { method5069(method5068("4\u0019Y\u007f\u0015")), method5069(method5068("4\u0019Y\u0002T.\u0019\u0003\u0000\u0015")) };

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    public static boolean field9885 = false;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIIIIIII)V")
    public static final void method5067(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field9884++;
            if (arg2) {
                method5067(-18, 99, false, 52, -53, -46, 3, 39, 103, 3);
            }
            if (arg0 == arg1 && arg4 == arg6 && arg3 == arg9 && arg7 == arg8) {
                class721.method5221(arg5, arg0, arg9, arg4, 1531087756, arg7);
            } else {
                int var10 = arg0;
                int var11 = arg4;
                int var12 = arg0 * 3;
                int var13 = arg4 * 3;
                int var14 = arg1 * 3;
                int var15 = arg6 * 3;
                int var16 = arg3 * 3;
                int var17 = arg8 * 3;
                int var18 = arg9 - arg0 - (-var14 + var16);
                int var19 = arg7 + var15 - var17 - arg4;
                int var20 = var16 + var12 - var14 - var14;
                int var21 = var13 + var17 - var15 - var15;
                int var22 = var14 - var12;
                int var23 = var15 - var13;
                for (int var24 = 128; var24 <= 4096; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var26;
                    int var29 = var20 * var25;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = arg0 + (var27 + var29 + var31 >> 12);
                    int var34 = (var28 + var30 + var32 >> 12) + arg4;
                    class721.method5221(arg5, var10, var33, var11, 1531087756, var34);
                    var11 = var34;
                    var10 = var33;
                }
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field9887[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        try {
            this.field9881 = (short) arg6;
            this.field9879 = arg9;
            this.field9880 = arg0;
            this.field9876 = arg10;
            this.field9877 = (byte) arg7;
            this.field9886 = (short) arg5;
            this.field9882 = (short) arg4;
            this.field9878 = (byte) arg8;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field9887[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5068(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5069(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
