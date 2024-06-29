import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class288 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field4605 = 0;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lhc;")
    public static class179[] field4608 = new class179[8];

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4607 = -1;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lkj;")
    public static class114 field4603;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4604;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method1939(int arg0) {
        if (arg0 < -114) {
            field4608 = null;
            field4603 = null;
            field4604 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = 0;
        field4609++;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg3 * arg3;
        int var12 = arg3 - arg7;
        int var13 = arg0 * arg0;
        int var14 = arg0 - arg7;
        int var15 = var12 * var12;
        int var16 = var14 * var14;
        int var17 = var11 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var13 << 1;
        int var21 = arg0 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var21) * var11 + var20;
        int var24 = var13 - ((var21 - 1) * var17);
        int var25 = (1 - var22) * var15 + var18;
        if (arg6 != -74) {
            field4610 = 120;
        }
        int var26 = var16 - (var22 - 1) * var19;
        int var27 = var11 << 2;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var20 * 3;
        int var31 = (var22 - 3) * var19;
        int var32 = (var21 - 3) * var17;
        int var33 = var15 << 2;
        int var34 = (arg0 - 1) * var27;
        int var35 = var18 * 3;
        int var36 = var28;
        int var37 = var29;
        int[] var38 = class114.field1841[arg1];
        class224.method1504(arg5, arg2 - var12, -arg3 + arg2, var38, 7);
        class224.method1504(arg4, arg2 + var12, arg2 - var12, var38, 7);
        int var39 = (var14 - 1) * var33;
        class224.method1504(arg5, arg2 + arg3, arg2 + var12, var38, arg6 + 81);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var24 += var36;
                    var36 += var28;
                    var23 += var30;
                    var30 += var28;
                }
            }
            boolean var40 = var9 <= var14;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var35;
                        var10++;
                        var26 += var37;
                        var35 += var29;
                        var37 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var37;
                    var25 += var35;
                    var37 += var29;
                    var35 += var29;
                }
                var26 += -var31;
                var25 += -var39;
                var31 -= var33;
                var39 -= var33;
            }
            var9--;
            if (var24 < 0) {
                var8++;
                var24 += var36;
                var23 += var30;
                var36 += var28;
                var30 += var28;
            }
            int var41 = arg2 + var8;
            var24 += -var32;
            var32 -= var27;
            var23 += -var34;
            int var42 = arg1 - var9;
            int var43 = arg1 + var9;
            var34 -= var27;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class224.method1504(arg5, var46, var44, class114.field1841[var42], 7);
                class224.method1504(arg4, var45, var46, class114.field1841[var42], 7);
                class224.method1504(arg5, var41, var45, class114.field1841[var42], 7);
                class224.method1504(arg5, var46, var44, class114.field1841[var43], 7);
                class224.method1504(arg4, var45, var46, class114.field1841[var43], 7);
                class224.method1504(arg5, var41, var45, class114.field1841[var43], 7);
            } else {
                class224.method1504(arg5, var41, var44, class114.field1841[var42], arg6 + 81);
                class224.method1504(arg5, var41, var44, class114.field1841[var43], 7);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4611++;
        if (class279.method1878(0, arg8)) {
            if (arg4 <= 77) {
                field4607 = 112;
            }
            class185.method1287(arg2, arg3, arg6, class128.field2119[arg8], arg5, 1, arg1, -1, arg7, arg0);
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class118.field1991[var9] = true;
            }
        } else {
            class118.field1991[arg3] = true;
        }
    }
}
