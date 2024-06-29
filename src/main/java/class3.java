import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 extends class276 {

    @OriginalMember(owner = "client!el", name = "u", descriptor = "F")
    public static float field25 = 1.0F;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Llo;")
    public static class306 field21 = new class306(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "J")
    public static long field31;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Lec;")
    public static class68 field27;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
    public int[] field19;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[I")
    public int[] field28;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "[I")
    public int[] field30;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[Lln;")
    public class169[] field20;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[Lln;")
    public class169[] field26;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "[[[B")
    public byte[][][] field22;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lft;", line = 11)
    public static final class219 method7(int arg0) {
        field29++;
        class219 var1 = (class219) class244.field4187.method564((byte) -76);
        if (var1 == null) {
            if (arg0 < 49) {
                method9(58);
            }
            return new class219();
        } else {
            class422.field6375--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V", line = 35)
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field23++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg3 - arg4;
        int var12 = arg5 - arg4;
        int var13 = arg3 * arg3;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - arg6) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        if (class29.field460 <= arg0 && arg0 <= class472.field6996) {
            int[] var38 = class209.field3294[arg0];
            int var39 = class52.method367(arg2 - arg3, class235.field4076, (byte) 15, class182.field2877);
            int var40 = class52.method367(arg2 + arg3, class235.field4076, (byte) -74, class182.field2877);
            int var41 = class52.method367(arg2 - var11, class235.field4076, (byte) -126, class182.field2877);
            int var42 = class52.method367(arg2 + var11, class235.field4076, (byte) 113, class182.field2877);
            class357.method2291(var39, arg7, var38, var41, -1);
            class357.method2291(var41, arg1, var38, var42, -1);
            class357.method2291(var42, arg7, var38, var40, arg6 ^ 0xFFFFFFFC);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class29.field460 <= var46 && class472.field6996 >= var45) {
                int var47 = class52.method367(arg2 + var8, class235.field4076, (byte) 127, class182.field2877);
                int var48 = class52.method367(arg2 - var8, class235.field4076, (byte) -34, class182.field2877);
                if (var44) {
                    int var49 = class52.method367(arg2 + var10, class235.field4076, (byte) 120, class182.field2877);
                    int var50 = class52.method367(arg2 - var10, class235.field4076, (byte) 127, class182.field2877);
                    if (class29.field460 <= var45) {
                        int[] var51 = class209.field3294[var45];
                        class357.method2291(var48, arg7, var51, var50, arg6 ^ 0xFFFFFFFC);
                        class357.method2291(var50, arg1, var51, var49, arg6 - 4);
                        class357.method2291(var49, arg7, var51, var47, -1);
                    }
                    if (var46 <= class472.field6996) {
                        int[] var52 = class209.field3294[var46];
                        class357.method2291(var48, arg7, var52, var50, -1);
                        class357.method2291(var50, arg1, var52, var49, -1);
                        class357.method2291(var49, arg7, var52, var47, -1);
                    }
                } else {
                    if (var45 >= class29.field460) {
                        class357.method2291(var48, arg7, class209.field3294[var45], var47, arg6 - 4);
                    }
                    if (class472.field6996 >= var46) {
                        class357.method2291(var48, arg7, class209.field3294[var46], var47, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 240)
    public static void method9(int arg0) {
        field21 = null;
        if (arg0 == -1) {
            field27 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V", line = 251)
    public static final void method10(int arg0) {
        field18++;
        class272 var1 = (class272) class216.field3765.method2538(-3);
        boolean var2 = class164.field2598 != null || class217.field3778 > 0;
        if (arg0 != 10150) {
            return;
        }
        if (var2) {
            class171.field2737 = 1;
        }
        if (class529.field7782 && class468.field6955.method1369(81, arg0 ^ 0x27BC) && class480.field7080 > 2) {
            if (var2) {
                class21.field234 = (class162) class108.field1934.field6207.field4530.field4530;
            } else {
                class48.method347(-2, var1.method386((byte) -51), (class162) class108.field1934.field6207.field4530.field4530, var1.method384((byte) -120));
            }
        } else if (var2) {
            class21.field234 = (class162) class108.field1934.field6207.field4530;
        } else {
            class48.method347(-2, var1.method386((byte) -87), (class162) class108.field1934.field6207.field4530, var1.method384((byte) -120));
        }
    }
}
