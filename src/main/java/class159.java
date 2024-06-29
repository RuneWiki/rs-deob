import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class159 {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public static int[] field2467 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2468 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
    public static int[] field2466 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2473 = 1;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "S")
    public short field2465;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Z")
    public boolean field2464;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Z")
    public boolean field2469;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Z")
    public boolean field2472;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Z")
    public boolean field2474;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1073(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2470++;
        int var8 = 0;
        int var9 = arg0;
        if (arg4 != -28) {
            method1074((class235) null, 10, 16, (byte) 36);
        }
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg1 * arg1;
        int var13 = arg0 - arg6;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 << 1;
        int var17 = var14 << 1;
        int var18 = var13 * var13;
        int var19 = var18 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var12 + var17;
        int var24 = var14 - ((var21 - 1) * var16);
        int var25 = var18 - ((var22 - 1) * var20);
        int var26 = (1 - var22) * var15 + var19;
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var18 << 2;
        int var30 = var15 << 2;
        int var31 = (var21 - 3) * var16;
        int var32 = var17 * 3;
        int var33 = var29;
        int var34 = (arg0 - 1) * var27;
        int var35 = var19 * 3;
        int[] var36 = class154.field2406[arg5];
        int var37 = (var22 - 3) * var20;
        class166.method1124(true, var36, arg3 - var11, arg7, arg3 - arg1);
        int var38 = (var13 - 1) * var30;
        int var39 = var28;
        class166.method1124(true, var36, arg3 + var11, arg2, arg3 - var11);
        class166.method1124(true, var36, arg3 + arg1, arg7, arg3 + var11);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var32;
                    var24 += var39;
                    var39 += var28;
                    var32 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var39;
                var23 += var32;
                var32 += var28;
                var8++;
                var39 += var28;
            }
            var24 += -var31;
            var23 += -var34;
            var31 -= var27;
            boolean var40 = var13 >= var9;
            var9--;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var25 += var33;
                        var26 += var35;
                        var33 += var29;
                        var10++;
                        var35 += var29;
                    }
                }
                if (var25 < 0) {
                    var25 += var33;
                    var26 += var35;
                    var33 += var29;
                    var10++;
                    var35 += var29;
                }
                var25 += -var37;
                var37 -= var30;
                var26 += -var38;
                var38 -= var30;
            }
            var34 -= var27;
            int var41 = arg5 + var9;
            int var42 = arg5 - var9;
            int var43 = arg3 - var8;
            int var44 = arg3 + var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class166.method1124(true, class154.field2406[var42], var46, arg7, var43);
                class166.method1124(true, class154.field2406[var42], var45, arg2, var46);
                class166.method1124(true, class154.field2406[var42], var44, arg7, var45);
                class166.method1124(true, class154.field2406[var41], var46, arg7, var43);
                class166.method1124(true, class154.field2406[var41], var45, arg2, var46);
                class166.method1124(true, class154.field2406[var41], var44, arg7, var45);
            } else {
                class166.method1124(true, class154.field2406[var42], var44, arg7, var43);
                class166.method1124(true, class154.field2406[var41], var44, arg7, var43);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhc;IIB)[Led;")
    public static final class186[] method1074(class235 arg0, int arg1, int arg2, byte arg3) {
        field2471++;
        if (class212.method1440(arg1, arg0, arg2, 41)) {
            return arg3 <= 83 ? null : class250.method1715(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field2466 = null;
        field2467 = null;
        int var1 = -98 / ((-arg0 - 56) / 47);
        field2468 = null;
    }
}
