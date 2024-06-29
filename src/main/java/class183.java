import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class183 {

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "B")
    public byte field2412;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "Lfq;")
    public class214 field2399;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "Lvba;")
    public static class45 field2405 = new class45();

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public static int field2411 = 0;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "Lal;")
    public static class109 field2406;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "Lvca;")
    public class296 field2396;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "Lwm;")
    public class590 field2409;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Llj;")
    public class633 field2404;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Lpv;")
    public class78 field2403;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static final void method1237(int arg0) {
        if (arg0 != 8390) {
            field2406 = null;
        }
        for (int var1 = 0; var1 < class583.field7922; var1++) {
            class139.field1881[var1] = null;
        }
        field2400++;
        class583.field7922 = 0;
        for (int var2 = 0; var2 < class504.field7090; var2++) {
            for (int var42 = 0; var42 < class196.field2540; var42++) {
                for (int var43 = 0; var43 < class247.field3229; var43++) {
                    class194 var44 = class443.field6387[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field2530 > 0) {
                            var44.field2530 = (short) (var44.field2530 * -1);
                        }
                        if (var44.field2528 > 0) {
                            var44.field2528 = (short) (var44.field2528 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class504.field7090; var3++) {
            for (int var4 = 0; var4 < class196.field2540; var4++) {
                for (int var5 = 0; var5 < class247.field3229; var5++) {
                    class194 var6 = class443.field6387[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class443.field6387[0][var5][var4] != null && class443.field6387[0][var5][var4].field2526 != null;
                        if (var6.field2530 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class194 var12 = class443.field6387[var3][var5][var4 - 1];
                            int var13 = class648.field8748[var3].method1898(var4, var5, (byte) -38);
                            while (var8 > 0 && var12 != null && var12.field2530 < 0 && var6.field2530 == var12.field2530 && var6.field2518 == var12.field2518 && var13 == class648.field8748[var3].method1898(var8 - 1, var5, (byte) -93) && ((var8 - 1) <= 0 || class648.field8748[var3].method1898(var8 - 2, var5, (byte) -119) == var13)) {
                                var8--;
                                var12 = class443.field6387[var3][var5][var8 - 1];
                            }
                            for (class194 var14 = class443.field6387[var3][var5][var4 + 1]; var9 < class247.field3229 && var14 != null && var14.field2530 < 0 && var6.field2530 == var14.field2530 && var6.field2518 == var14.field2518 && class648.field8748[var3].method1898(var9 + 1, var5, (byte) -5) == var13 && (class247.field3229 <= var9 + 1 || var13 == class648.field8748[var3].method1898(var9 + 2, var5, (byte) -92)); var14 = class443.field6387[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class648.field8748[var7 ? var3 + 1 : var3].method1898(var8, var5, (byte) -76);
                            int var17 = var6.field2530 * var15 + var16;
                            int var18 = class648.field8748[var7 ? var3 + 1 : var3].method1898(var9 + 1, var5, (byte) -79);
                            int var19 = var18 + (var6.field2530 * var15);
                            int var20 = var5 << class478.field6717;
                            int var21 = var8 << class478.field6717;
                            int var22 = (var9 << class478.field6717) + class30.field299;
                            class139.field1881[class583.field7922++] = new class378(1, var3, var6.field2518 + var20, var6.field2518 + var20, var6.field2518 + var20, var6.field2518 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class443.field6387[var23][var5][var24].field2530 = (short) (class443.field6387[var23][var5][var24].field2530 * -1);
                                }
                            }
                        }
                        if (var6.field2528 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class194 var29 = class443.field6387[var3][var5 - 1][var4];
                            int var30 = class648.field8748[var3].method1898(var4, var5, (byte) -8);
                            while (var25 > 0 && var29 != null && var29.field2528 < 0 && var6.field2528 == var29.field2528 && var6.field2517 == var29.field2517 && class648.field8748[var3].method1898(var4, var25 - 1, (byte) -75) == var30 && (var25 - 1 <= 0 || var30 == class648.field8748[var3].method1898(var4, var25 - 2, (byte) -102))) {
                                var25--;
                                var29 = class443.field6387[var3][var25 - 1][var4];
                            }
                            for (class194 var31 = class443.field6387[var3][var5 + 1][var4]; var26 < class196.field2540 && var31 != null && var31.field2528 < 0 && var6.field2528 == var31.field2528 && var6.field2517 == var31.field2517 && var30 == class648.field8748[var3].method1898(var4, var26 + 1, (byte) -14) && ((var26 + 1) >= class196.field2540 || var30 == class648.field8748[var3].method1898(var4, var26 + 2, (byte) -29)); var31 = class443.field6387[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class648.field8748[var7 ? var3 + 1 : var3].method1898(var4, var25, (byte) -54);
                            int var34 = var6.field2528 * var32 + var33;
                            int var35 = class648.field8748[var7 ? var3 + 1 : var3].method1898(var4, var26 + 1, (byte) -119);
                            int var36 = var6.field2528 * var32 + var35;
                            int var37 = var25 << class478.field6717;
                            int var38 = (var26 << class478.field6717) + class30.field299;
                            int var39 = var4 << class478.field6717;
                            class139.field1881[class583.field7922++] = new class378(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field2517, var6.field2517 + var39, var39 + var6.field2517, var6.field2517 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class443.field6387[var40][var41][var4].field2528 = (short) (class443.field6387[var40][var41][var4].field2528 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class634.field8566 = true;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z")
    public final boolean method1238(int arg0) {
        if (arg0 != 0) {
            this.field2395 = -64;
        }
        field2397++;
        return this.field2412 == 2 || this.field2412 == 3;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
    public static void method1239(boolean arg0) {
        if (arg0) {
            method1239(false);
        }
        field2406 = null;
        field2405 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "()V")
    public static final void method1240() {
        if (class611.field8264 != null) {
            for (int var0 = 0; var0 < class611.field8264.length; var0++) {
                for (int var1 = 0; var1 < class196.field2540; var1++) {
                    for (int var2 = 0; var2 < class247.field3229; var2++) {
                        if (class611.field8264[var0][var1][var2] != null) {
                            class611.field8264[var0][var1][var2].method1283(-125);
                        }
                        class611.field8264[var0][var1][var2] = null;
                    }
                }
            }
        }
        class611.field8264 = null;
        class648.field8748 = null;
        if (class187.field2445 != null) {
            for (int var3 = 0; var3 < class187.field2445.length; var3++) {
                for (int var4 = 0; var4 < class196.field2540; var4++) {
                    for (int var5 = 0; var5 < class247.field3229; var5++) {
                        if (class187.field2445[var3][var4][var5] != null) {
                            class187.field2445[var3][var4][var5].method1283(-74);
                        }
                        class187.field2445[var3][var4][var5] = null;
                    }
                }
            }
        }
        class187.field2445 = null;
        class737.field10008 = null;
        class443.field6387 = null;
        class645.field8694 = null;
        class408.field5778 = null;
        class368.field5311 = null;
        class41.field434 = null;
        class767.field10529 = null;
        class281.field4064 = null;
        class284.method1844(0);
        if (class281.field4062 != null) {
            for (int var6 = 0; var6 < class25.field250; var6++) {
                class281.field4062[var6] = null;
            }
            class25.field250 = 0;
        }
        class737.field10005 = null;
        class151.field2056 = null;
        class570.field7774 = null;
        if (class98.field1437 != null) {
            for (int var7 = 0; var7 < class98.field1437.length; var7++) {
                class98.field1437[var7] = null;
            }
            class781.field10714 = 0;
        }
        if (class347.field4909 != null) {
            for (int var8 = 0; var8 < class347.field4909.length; var8++) {
                class347.field4909[var8] = null;
            }
            class683.field9124 = 0;
        }
        if (class82.field1135 != null) {
            for (int var9 = 0; var9 < class563.field7717; var9++) {
                class82.field1135[var9] = null;
            }
            for (int var10 = 0; var10 < class504.field7090; var10++) {
                for (int var11 = 0; var11 < class196.field2540; var11++) {
                    for (int var12 = 0; var12 < class247.field3229; var12++) {
                        class160.field2148[var10][var11][var12] = 0L;
                    }
                }
            }
            class563.field7717 = 0;
        }
        class102.method793((byte) -123);
        class627.field8492 = class627.field8497;
        class627.field8492.method2843(-127);
        class456.field6537 = null;
        class455.field6521 = null;
        class43.field462 = null;
        if (class97.field1384 != null) {
            class414.method2496();
            class34.field372.method495(1);
            class34.field372.method505(0);
        }
        if (class267.field3910 != null) {
            class267.field3910 = null;
        }
        class34.field372 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)I")
    public static final int method1241(byte arg0) {
        if (arg0 != 95) {
            field2411 = 86;
        }
        field2394++;
        return class647.field8729;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(BIIIIIILfq;)V")
    public class183(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class214 arg7) {
        this.field2408 = arg2;
        this.field2398 = arg1;
        this.field2395 = arg6;
        this.field2401 = arg5;
        this.field2412 = arg0;
        this.field2407 = arg4;
        this.field2402 = arg3;
        this.field2399 = arg7;
    }
}
