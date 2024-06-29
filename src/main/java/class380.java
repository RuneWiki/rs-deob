import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class380 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lic;")
    private class491 field5772;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public int field5773;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Le;")
    public static class369 field5770 = new class369(2);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lri;")
    public static class73 field5774 = new class73(92, 8);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2325(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5771++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg4 - arg6;
        int var12 = arg2 - arg6;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        if (arg0 <= 75) {
            return;
        }
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (class37.field393 <= arg1 && class509.field7436 >= arg1) {
            int[] var38 = class339.field4800[arg1];
            int var39 = class42.method249(class494.field7297, arg7 - arg4, (byte) -72, class445.field6629);
            int var40 = class42.method249(class494.field7297, arg4 + arg7, (byte) -72, class445.field6629);
            int var41 = class42.method249(class494.field7297, arg7 - var11, (byte) -72, class445.field6629);
            int var42 = class42.method249(class494.field7297, arg7 + var11, (byte) -72, class445.field6629);
            class415.method2491(var41, var39, var38, arg3, -31541);
            class415.method2491(var42, var41, var38, arg5, -31541);
            class415.method2491(var40, var42, var38, arg3, -31541);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (var46 >= class37.field393 && class509.field7436 >= var45) {
                int var47 = class42.method249(class494.field7297, arg7 + var8, (byte) -72, class445.field6629);
                int var48 = class42.method249(class494.field7297, arg7 - var8, (byte) -72, class445.field6629);
                if (var44) {
                    int var49 = class42.method249(class494.field7297, arg7 + var10, (byte) -72, class445.field6629);
                    int var50 = class42.method249(class494.field7297, arg7 - var10, (byte) -72, class445.field6629);
                    if (var45 >= class37.field393) {
                        int[] var51 = class339.field4800[var45];
                        class415.method2491(var50, var48, var51, arg3, -31541);
                        class415.method2491(var49, var50, var51, arg5, -31541);
                        class415.method2491(var47, var49, var51, arg3, -31541);
                    }
                    if (var46 <= class509.field7436) {
                        int[] var52 = class339.field4800[var46];
                        class415.method2491(var50, var48, var52, arg3, -31541);
                        class415.method2491(var49, var50, var52, arg5, -31541);
                        class415.method2491(var47, var49, var52, arg3, -31541);
                    }
                } else {
                    if (var45 >= class37.field393) {
                        class415.method2491(var47, var48, class339.field4800[var45], arg3, -31541);
                    }
                    if (class509.field7436 >= var46) {
                        class415.method2491(var47, var48, class339.field4800[var46], arg3, -31541);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2326(int arg0) {
        if (arg0 != 0) {
            method2326(24);
        }
        field5770 = null;
        field5774 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lai;ILic;)V")
    public class380(class423 arg0, int arg1, class491 arg2) {
        new class226(64);
        this.field5772 = arg2;
        this.field5773 = this.field5772.method2942(false, 15);
    }
}
