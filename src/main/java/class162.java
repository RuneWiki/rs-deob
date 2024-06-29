import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class162 extends class375 {

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Lin;")
    public class77 field2324;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "Lcfa;")
    public class152 field2318;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "Z")
    public static boolean field2328 = false;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "[I")
    public static int[] field2322 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "[I")
    public static int[] field2325 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Ljava/lang/Thread;")
    public static Thread field2317;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 3)
    public static void method1114(int arg0) {
        field2325 = null;
        field2317 = null;
        int var1 = 121 / ((-arg0 - 32) / 43);
        field2322 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIBI)V", line = 18)
    public static final void method1115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 < 120) {
            field2326 = -29;
        }
        field2320++;
        if (arg4 < 1 || arg0 < 1 || arg4 > class199.field2812 - 2 || (class232.field3611 - 2) < arg0) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class261.method1718(arg0, 1, arg4)) {
            var9 = arg2 + 1;
        }
        if (!class287.field4270.method2747(78, class328.field4859) && !class278.method1815(5, var9, arg0, class97.field1532, arg4)) {
            return;
        }
        if (class153.field2210 == null) {
            return;
        }
        class268.field4039.method613(arg0, class423.field6155[arg2], arg6, class282.field4228, 0, arg4, arg2);
        if (arg5 < 0) {
            return;
        }
        boolean var10 = class287.field4270.field3714;
        class287.field4270.field3714 = true;
        class268.field4039.method615(class423.field6155[arg2], arg8, var9, arg0, 50, arg5, arg3, class282.field4228, arg2, arg1, arg4);
        class287.field4270.field3714 = var10;
        return;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V", line = 75)
    public final void method1116(int arg0) {
        field2330++;
        this.field2323 = this.field2324.field1327;
        this.field2329 = this.field2324.field1330;
        this.field2331 = this.field2324.field1334;
        if (this.field2324.field1332 != null) {
            this.field2324.field1332.method238(this.field2318.field2194, this.field2318.field2200, this.field2318.field2197, class326.field4815);
        }
        this.field2327 = class326.field4815[0];
        if (arg0 != 24528) {
            this.field2329 = 67;
        }
        this.field2319 = class326.field4815[2];
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIII)V", line = 97)
    public static final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2321++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg7 - arg0;
        int var12 = arg4 - arg0;
        int var13 = arg7 * arg7;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (arg5 + var21) * var18;
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
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class651.field9125[arg3];
        class58.method623(arg1, arg6 - var11, 23309, var39, arg6 - arg7);
        class58.method623(arg2, arg6 + var11, arg5 ^ 0xFFFFA4F2, var39, arg6 - var11);
        class58.method623(arg1, arg6 + arg7, arg5 ^ 0xFFFFA4F2, var39, arg6 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var40) {
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
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var41 = arg3 - var9;
            int var42 = arg3 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class58.method623(arg1, var46, 23309, class651.field9125[var41], var44);
                class58.method623(arg2, var45, 23309, class651.field9125[var41], var46);
                class58.method623(arg1, var43, arg5 + 23310, class651.field9125[var41], var45);
                class58.method623(arg1, var46, arg5 + 23310, class651.field9125[var42], var44);
                class58.method623(arg2, var45, 23309, class651.field9125[var42], var46);
                class58.method623(arg1, var43, 23309, class651.field9125[var42], var45);
            } else {
                class58.method623(arg1, var43, 23309, class651.field9125[var41], var44);
                class58.method623(arg1, var43, 23309, class651.field9125[var42], var44);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lin;Lmca;)V", line = 263)
    public class162(class77 arg0, class29 arg1) {
        this.field2324 = arg0;
        this.field2318 = this.field2324.method713(true);
        this.method1116(24528);
    }
}
