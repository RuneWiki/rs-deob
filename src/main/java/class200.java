import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class200 extends class132 {

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[B")
    public byte[] field3875;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lnd;")
    public static class127 field3872 = new class127(50);

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Ltg;")
    public static class184 field3877 = class135.method812("Verbindung abgebrochen)3", 3);

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
    public static int[] field3880 = new int[2048];

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Ltg;")
    public static class184 field3882 = class135.method812(":duelfriend:", 3);

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Ltg;")
    public static class184 field3881 = class135.method812(" )2> <col=ff9040>", 3);

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3878 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lud;")
    public static class190 field3884;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    public static int[] field3883;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
    public static final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3873++;
        if (class187.field3610 == 0 && !class209.field4013) {
            class201.field3888++;
            class198.method1277(class210.field4054, -128, class170.field3242, arg3 - arg2, (short) 42, arg4 - arg0, 0L);
        }
        long var5 = -1L;
        if (arg1 <= 100) {
            field3877 = null;
        }
        for (int var7 = 0; var7 < class140.field2554; var7++) {
            long var8 = class140.field2553[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = (int) var8 >> 29 & 0x3;
            int var12 = (int) var8 >> 7 & 0x7F;
            int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            if (var5 != var8) {
                var5 = var8;
                if (var11 == 2 && class74.method432(class47.field892, var10, var12, var8)) {
                    class58 var14 = class14.method88(70, var13);
                    if (var14.field1083 != null) {
                        var14 = var14.method316(-1);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class187.field3610 == 1) {
                        class198.method1277(class7.field127, -78, class144.method884(0, new class184[] { class150.field2689, class123.field2239, var14.field1090 }), var12, (short) 35, var10, var8);
                        class204.field3927++;
                    } else if (!class209.field4013) {
                        class184[] var15 = var14.field1077;
                        class6.field111++;
                        if (class100.field1861) {
                            var15 = class111.method684(var15, (byte) 67);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    class187.field3614++;
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 50;
                                    }
                                    if (var16 == 1) {
                                        var17 = 29;
                                    }
                                    if (var16 == 2) {
                                        var17 = 9;
                                    }
                                    if (var16 == 3) {
                                        var17 = 25;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1005;
                                    }
                                    class198.method1277(var15[var16], -76, class144.method884(0, new class184[] { class196.field3799, var14.field1090 }), var12, var17, var10, var8);
                                }
                            }
                        }
                        class198.method1277(class11.field198, -50, class144.method884(0, new class184[] { class196.field3799, var14.field1090 }), var12, (short) 1002, var10, (long) var14.field1052);
                    } else if ((class106.field1920 & 0x4) == 4) {
                        class78.field1413++;
                        class198.method1277(class14.field270, -32, class144.method884(0, new class184[] { class84.field1553, class123.field2239, var14.field1090 }), var12, (short) 8, var10, var8);
                    }
                }
                if (var11 == 1) {
                    class158 var18 = class52.field948[var13];
                    if (var18.field2832.field784 == 1 && (var18.field635 & 0x7F) == 64 && (var18.field614 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class38.field711; var19++) {
                            class158 var22 = class52.field948[class97.field1782[var19]];
                            if (var22 != null && var18 != var22 && var22.field2832.field784 == 1 && var18.field635 == var22.field635 && var18.field614 == var22.field614) {
                                class164.method981(var10, var22.field2832, var12, class97.field1782[var19], -115);
                            }
                        }
                        for (int var20 = 0; var20 < class26.field466; var20++) {
                            class67 var21 = class57.field1024[field3880[var20]];
                            if (var21 != null && var18.field635 == var21.field635 && var18.field614 == var21.field614) {
                                class198.method1274(-99, field3880[var20], var21, var10, var12);
                            }
                        }
                    }
                    class164.method981(var10, var18.field2832, var12, var13, -125);
                }
                if (var11 == 0) {
                    class67 var23 = class57.field1024[var13];
                    if ((var23.field635 & 0x7F) == 64 && (var23.field614 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class38.field711; var24++) {
                            class158 var27 = class52.field948[class97.field1782[var24]];
                            if (var27 != null && var27.field2832.field784 == 1 && var23.field635 == var27.field635 && var23.field614 == var27.field614) {
                                class164.method981(var10, var27.field2832, var12, class97.field1782[var24], -106);
                            }
                        }
                        for (int var25 = 0; var25 < class26.field466; var25++) {
                            class67 var26 = class57.field1024[field3880[var25]];
                            if (var26 != null && var23 != var26 && var23.field635 == var26.field635 && var23.field614 == var26.field614) {
                                class198.method1274(-118, field3880[var25], var26, var10, var12);
                            }
                        }
                    }
                    class198.method1274(-119, var13, var23, var10, var12);
                }
                if (var11 == 3) {
                    class69 var28 = class157.field2813[class47.field892][var10][var12];
                    if (var28 != null) {
                        for (class3 var29 = (class3) var28.method412(true); var29 != null; var29 = (class3) var28.method408(2)) {
                            class122 var30 = class60.method336(var29.field59, 10);
                            if (class187.field3610 == 1) {
                                class198.method1277(class7.field127, -33, class144.method884(0, new class184[] { class150.field2689, field3881, var30.field2233 }), var12, (short) 31, var10, (long) var29.field59);
                                class187.field3613++;
                            } else if (!class209.field4013) {
                                field3879++;
                                class184[] var31 = var30.field2193;
                                if (class100.field1861) {
                                    var31 = class111.method684(var31, (byte) 67);
                                }
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        class49.field912++;
                                        byte var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 15;
                                        }
                                        if (var32 == 1) {
                                            var33 = 38;
                                        }
                                        if (var32 == 2) {
                                            var33 = 32;
                                        }
                                        if (var32 == 3) {
                                            var33 = 20;
                                        }
                                        if (var32 == 4) {
                                            var33 = 28;
                                        }
                                        class198.method1277(var31[var32], -88, class144.method884(0, new class184[] { class26.field476, var30.field2233 }), var12, var33, var10, (long) var29.field59);
                                    } else if (var32 == 2) {
                                        class151.field2705++;
                                        class198.method1277(class60.field1113, -104, class144.method884(0, new class184[] { class26.field476, var30.field2233 }), var12, (short) 32, var10, (long) var29.field59);
                                    }
                                }
                                class198.method1277(class11.field198, -11, class144.method884(0, new class184[] { class26.field476, var30.field2233 }), var12, (short) 1001, var10, (long) var29.field59);
                            } else if ((class106.field1920 & 0x1) == 1) {
                                class198.method1277(class14.field270, -71, class144.method884(0, new class184[] { class84.field1553, field3881, var30.field2233 }), var12, (short) 11, var10, (long) var29.field59);
                                class116.field2107++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)V")
    public static final void method1279(int arg0, int arg1, int arg2) {
        class169.field3193 = true;
        class154.field2774 = arg0;
        class89.field1663 = arg1;
        class105.field1914 = arg2;
        class208.field3996 = -1;
        class173.field3272 = -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[[[I)V")
    public static final void method1280(int arg0, int arg1, int arg2, int[][][] arg3) {
        class87.field1608 = arg0;
        class8.field145 = arg1;
        class159.field2853 = arg2;
        class190.field3704 = new class90[arg0][arg1][arg2];
        class19.field372 = new int[arg0][arg1 + 1][arg2 + 1];
        class131.field2380 = arg3;
        class186.method1180();
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field3881 = null;
        field3884 = null;
        field3877 = null;
        field3883 = null;
        if (arg0 != -2) {
            method1278(-71, 25, -27, -49, -104);
        }
        field3882 = null;
        field3872 = null;
        field3880 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Lb;")
    public static final class11 method1282(byte arg0) {
        field3876++;
        try {
            int var1 = 79 / ((-arg0 - 10) / 52);
            return (class11) Class.forName("ch").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([B)V")
    public class200(byte[] arg0) {
        this.field3875 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static final void method1283(byte arg0) {
        class202.field3902 = null;
        int var1 = 75 / ((arg0 - 86) / 40);
        class83.field1479 = null;
        field3874++;
        class26.field472 = null;
        class177.field3387 = null;
        class184.field3535 = null;
        class83.field1481 = null;
    }
}
