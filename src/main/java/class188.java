import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class188 extends class136 {

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field2299;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "Ljk;")
    public static class585 field2294 = new class585(15, -1);

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "[F")
    public static float[] field2300 = new float[4];

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "Loe;")
    public static class183 field2301 = new class183();

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "Lrq;")
    public static class321 field2292;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Ljava/lang/Object;")
    public static Object field2291;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIZII)V", line = 5)
    public static final void method1164(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (~(arg4 ? class221.field2851.field4176 : class221.field2851.field4155) != arg3 && arg6 != 0 && class244.field3334 < 50 && arg2 != -1) {
            class465.field6487[class244.field3334++] = new class68((byte) (arg4 ? 3 : 2), arg2, arg6, arg1, arg0, 0, arg5, null);
        }
        field2298++;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lbe;Ljava/lang/Object;I)V", line = 22)
    public class188(class35 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2299 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 30)
    public final Object method906(int arg0) {
        field2295++;
        int var2 = -90 % ((-arg0 - 32) / 45);
        return this.field2299;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)Z", line = 41)
    public final boolean method904(byte arg0) {
        field2290++;
        if (arg0 > -21) {
            method1164(-103, 80, -57, 102, true, -104, 50);
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)V", line = 53)
    public static final void method1165(byte arg0) {
        for (int var1 = 0; var1 < class10.field100; var1++) {
            class436.field6246[var1] = null;
        }
        field2293++;
        class10.field100 = 0;
        for (int var2 = 0; var2 < class663.field9391; var2++) {
            for (int var47 = 0; var47 < class455.field6393; var47++) {
                for (int var48 = 0; var48 < class302.field4057; var48++) {
                    class433 var49 = class281.field3808[var2][var48][var47];
                    if (var49 != null) {
                        if (var49.field6215 > 0) {
                            var49.field6215 = (short) (var49.field6215 * -1);
                        }
                        if (var49.field6208 > 0) {
                            var49.field6208 = (short) (var49.field6208 * -1);
                        }
                    }
                }
            }
        }
        int var3 = 93 / ((-arg0 - 45) / 56);
        for (int var4 = 0; var4 < class663.field9391; var4++) {
            for (int var5 = 0; var5 < class455.field6393; var5++) {
                for (int var6 = 0; var6 < class302.field4057; var6++) {
                    class433 var7 = class281.field3808[var4][var6][var5];
                    if (var7 != null) {
                        boolean var8 = class281.field3808[0][var6][var5] != null && class281.field3808[0][var6][var5].field6207 != null;
                        if (var7.field6215 < 0) {
                            int var9 = var5;
                            int var10 = var5;
                            int var11 = var4;
                            int var12 = var4;
                            class433 var13 = class281.field3808[var4][var6][var5 - 1];
                            int var14 = class399.field5631[var4].method437(107, var5, var6);
                            while (var9 > 0 && var13 != null && var13.field6215 < 0 && var7.field6215 == var13.field6215 && var7.field6206 == var13.field6206 && class399.field5631[var4].method437(88, var9 - 1, var6) == var14 && (var9 - 1 <= 0 || class399.field5631[var4].method437(116, var9 - 2, var6) == var14)) {
                                var9--;
                                var13 = class281.field3808[var4][var6][var9 - 1];
                            }
                            for (class433 var15 = class281.field3808[var4][var6][var5 + 1]; class302.field4057 > var10 && var15 != null && var15.field6215 < 0 && var7.field6215 == var15.field6215 && var7.field6206 == var15.field6206 && var14 == class399.field5631[var4].method437(112, var10 + 1, var6) && (class302.field4057 <= var10 + 1 || class399.field5631[var4].method437(90, var10 + 2, var6) == var14); var15 = class281.field3808[var4][var6][var10 + 1]) {
                                var10++;
                            }
                            label300: while (var11 > 0) {
                                for (int var16 = var9; var16 <= var10; var16++) {
                                    if (class281.field3808[var11 - 1][var6][var16] == null || class281.field3808[var11 - 1][var6][var16].field6215 != var7.field6215 || class281.field3808[var11 - 1][var6][var16].field6206 != var7.field6206) {
                                        break label300;
                                    }
                                }
                                var11--;
                            }
                            label317: while ((class663.field9391 - 1) > var12) {
                                for (int var17 = var9; var17 <= var10; var17++) {
                                    if (class281.field3808[var12 + 1][var6][var17] == null || class281.field3808[var12 + 1][var6][var17].field6215 != var7.field6215 || class281.field3808[var12 + 1][var6][var17].field6206 != var7.field6206) {
                                        break label317;
                                    }
                                }
                                var12++;
                            }
                            int var18 = var12 + 1 - var11;
                            int var19 = class399.field5631[var8 ? var11 + 1 : var11].method437(127, var9, var6);
                            int var20 = var19 + (var7.field6215 * var18);
                            int var21 = class399.field5631[var8 ? var11 + 1 : var11].method437(98, var10 + 1, var6);
                            int var22 = var7.field6215 * var18 + var21;
                            int var23 = var6 << class295.field3981;
                            int var24 = var9 << class295.field3981;
                            int var25 = (var10 << class295.field3981) + class454.field6392;
                            class436.field6246[class10.field100++] = new class568(1, var12, var23 + var7.field6206, var7.field6206 + var23, var7.field6206 + var23, var7.field6206 + var23, var19, var21, var22, var20, var24, var25, var25, var24);
                            for (int var26 = var11; var26 <= var12; var26++) {
                                for (int var27 = var9; var27 <= var10; var27++) {
                                    class281.field3808[var26][var6][var27].field6215 = (short) (class281.field3808[var26][var6][var27].field6215 * -1);
                                }
                            }
                        }
                        if (var7.field6208 < 0) {
                            int var28 = var6;
                            int var29 = var6;
                            int var30 = var4;
                            int var31 = var4;
                            class433 var32 = class281.field3808[var4][var6 - 1][var5];
                            int var33 = class399.field5631[var4].method437(105, var5, var6);
                            while (var28 > 0 && var32 != null && var32.field6208 < 0 && var7.field6208 == var32.field6208 && var7.field6213 == var32.field6213 && var33 == class399.field5631[var4].method437(109, var5, var28 - 1) && (var28 - 1 <= 0 || class399.field5631[var4].method437(108, var5, var28 - 2) == var33)) {
                                var28--;
                                var32 = class281.field3808[var4][var28 - 1][var5];
                            }
                            for (class433 var34 = class281.field3808[var4][var6 + 1][var5]; var29 < class455.field6393 && var34 != null && var34.field6208 < 0 && var7.field6208 == var34.field6208 && var7.field6213 == var34.field6213 && var33 == class399.field5631[var4].method437(88, var5, var29 + 1) && ((var29 + 1) >= class455.field6393 || class399.field5631[var4].method437(94, var5, var29 + 2) == var33); var34 = class281.field3808[var4][var29 + 1][var5]) {
                                var29++;
                            }
                            label216: while (var30 > 0) {
                                for (int var35 = var28; var35 <= var29; var35++) {
                                    if (class281.field3808[var30 - 1][var35][var5] == null || class281.field3808[var30 - 1][var35][var5].field6208 != var7.field6208 || class281.field3808[var30 - 1][var35][var5].field6213 != var7.field6213) {
                                        break label216;
                                    }
                                }
                                var30--;
                            }
                            label201: while (class663.field9391 - 1 > var31) {
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    if (class281.field3808[var31 + 1][var36][var5] == null || class281.field3808[var31 + 1][var36][var5].field6208 != var7.field6208 || class281.field3808[var31 + 1][var36][var5].field6213 != var7.field6213) {
                                        break label201;
                                    }
                                }
                                var31++;
                            }
                            int var37 = var31 + 1 - var30;
                            int var38 = class399.field5631[var8 ? var30 + 1 : var30].method437(110, var5, var28);
                            int var39 = var7.field6208 * var37 + var38;
                            int var40 = class399.field5631[var8 ? var30 + 1 : var30].method437(107, var5, var29 + 1);
                            int var41 = var7.field6208 * var37 + var40;
                            int var42 = var28 << class295.field3981;
                            int var43 = (var29 << class295.field3981) + class454.field6392;
                            int var44 = var5 << class295.field3981;
                            class436.field6246[class10.field100++] = new class568(2, var31, var42, var43, var43, var42, var38, var40, var41, var39, var44 + var7.field6213, var7.field6213 + var44, var7.field6213 + var44, var7.field6213 + var44);
                            for (int var45 = var30; var45 <= var31; var45++) {
                                for (int var46 = var28; var46 <= var29; var46++) {
                                    class281.field3808[var45][var46][var5].field6208 = (short) (class281.field3808[var45][var46][var5].field6208 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class463.field6471 = true;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V", line = 340)
    public static void method1166(byte arg0) {
        field2301 = null;
        if (arg0 != 6) {
            field2300 = null;
        }
        field2294 = null;
        field2291 = null;
        field2300 = null;
        field2292 = null;
    }
}
