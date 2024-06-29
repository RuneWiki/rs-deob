import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class264 extends IOException {

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4047 = new String[] { method2214(method2213("j\u0010s=k")), method2214(method2213("j\u0010s:k")), method2214(method2213("j\u0010s;k")) };

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
    public static int[] field4046 = new int[8];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 3)
    public static void method2209(byte arg0) {
        try {
            if (arg0 > -44) {
                method2209((byte) -92);
            }
            field4046 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4047[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lmia;", line = 14)
    public static final class69 method2210(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class69 var4 = var3.field1089;
            var3.field1089 = null;
            class645.method4748(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 27)
    public class264(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z", line = 30)
    public static final boolean method2211(int arg0, int arg1) {
        try {
            field4045++;
            if (arg0 != 31161) {
                field4046 = null;
            }
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4047[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZIIIIIII)V", line = 47)
    public static final void method2212(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field4043++;
            if (arg0 == arg6 && arg3 == arg5 && arg1 == arg4 && arg7 == arg9) {
                class316.method2658(arg8, arg0, arg1, -1767209748, arg5, arg7);
            } else {
                int var10 = arg0;
                int var11 = arg5;
                int var12 = arg0 * 3;
                int var13 = arg5 * 3;
                int var14 = arg6 * 3;
                int var15 = arg3 * 3;
                int var16 = arg4 * 3;
                int var17 = arg9 * 3;
                int var18 = arg1 + var14 - arg0 - var16;
                int var19 = arg7 + var15 - var17 - arg5;
                int var20 = var16 - var14 - (-var12 + var14);
                int var21 = var17 + var13 - var15 - var15;
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
                    int var33 = (var29 + var31 + var27 >> 12) + arg0;
                    int var34 = arg5 + (var28 - (-var30 - var32) >> 12);
                    class316.method2658(arg8, var10, var33, -1767209748, var11, var34);
                    var11 = var34;
                    var10 = var33;
                }
            }
            if (arg2) {
                field4046 = null;
            }
        } catch (RuntimeException var36) {
            throw class759.method5498(var36, field4047[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2213(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2214(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
