import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class133 implements class359 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lcb;")
    public static class631 field2140 = new class631(38, 8);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lla;")
    public static class422 field2142;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([IBJLln;)Ljava/lang/String;")
    public final String method1079(int[] arg0, byte arg1, long arg2, class472 arg3) {
        field2141++;
        if (class183.field3093 == arg3) {
            class150 var6 = class316.field4738.method1804(arg1 ^ 0x64, arg0[0]);
            return var6.method1141((int) arg2, 29683);
        } else if (class298.field4517 == arg3 || class710.field9994 == arg3) {
            class688 var7 = class556.field7917.method741(-108, (int) arg2);
            return var7.field9714;
        } else {
            if (arg1 != 102) {
                method1081(-26, -25, 54, -122, (byte) -114, -94, -64, 123, 41, 33);
            }
            return class549.field7829 == arg3 || class238.field3843 == arg3 || class64.field1034 == arg3 ? class316.field4738.method1804(2, arg0[0]).method1141((int) arg2, 29683) : null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2140 = null;
        if (arg0 != 0) {
            method1081(113, 95, 115, -22, (byte) 94, -55, 42, -42, -126, 30);
        }
        field2142 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1081(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2139++;
        if (arg2 == arg5 && arg0 == arg7 && arg8 == arg9 && arg1 == arg6) {
            class3.method6(arg8, arg2, arg3, arg1, arg0, false);
        } else {
            int var10 = arg2;
            int var11 = arg0;
            int var12 = arg2 * 3;
            int var13 = arg0 * 3;
            int var14 = arg5 * 3;
            int var15 = arg7 * 3;
            int var16 = arg9 * 3;
            int var17 = arg6 * 3;
            int var18 = arg8 + var14 - var16 - arg2;
            int var19 = arg1 - var17 - (-var15 + arg0);
            int var20 = var16 + var12 - var14 - var14;
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
                int var33 = arg2 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg0;
                class3.method6(var33, var10, arg3, var34, var11, false);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg4 != -5) {
            field2142 = null;
        }
    }
}
