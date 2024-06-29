import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class383 {

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[I")
    public static int[] field558 = new int[3];

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Ldq;")
    public static class493 field555 = new class493(91, 10);

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "Lhd;")
    public static class523 field561 = null;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Ll;")
    public static class16 field560;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "Lum;")
    public static class365 field563;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dl", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field564;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method446(byte arg0) {
        field560 = null;
        field561 = null;
        field563 = null;
        if (arg0 != 79) {
            method446((byte) -19);
        }
        field558 = null;
        field555 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZII[I)V")
    public final void method447(boolean arg0, int arg1, int arg2, int[] arg3) {
        if (arg0) {
            this.field543 = -100;
        }
        arg3[1] = this.field542 - (this.field556 - arg2);
        field548++;
        arg3[2] = this.field550 + arg1 - this.field551;
        arg3[0] = 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)Z")
    public final boolean method448(int arg0, int arg1, int arg2, int arg3) {
        field557++;
        if (arg2 != 4) {
            field555 = null;
        }
        return this.field559 == arg1 && arg3 >= this.field556 && this.field554 >= arg3 && this.field551 <= arg0 && this.field553 >= arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
    public final boolean method449(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field547++;
            return this.field542 <= arg2 && this.field543 >= arg2 && this.field550 <= arg0 && arg0 <= this.field552;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;ZJIIIZILjava/lang/String;ZZI)V")
    public static final void method450(String arg0, boolean arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, String arg8, boolean arg9, boolean arg10, int arg11) {
        field545++;
        if (arg1) {
            class498.method3006((byte) 69);
            if (class139.field1796.equals("")) {
                class45.field539 = 39;
                return;
            }
        }
        int[] var13 = new int[4];
        int var14 = 0;
        if (arg4 >= -108) {
            field563 = null;
        }
        while (var14 < 3) {
            var13[var14] = (int) (Math.random() * 9.9999999E7D);
            var14++;
        }
        class463 var15 = new class463(128);
        var15.method2729(10, false);
        var15.method2759((byte) -128, (arg9 ? 4 : 0) | (arg6 ? 1 : 0) | (arg10 ? 2 : 0));
        var15.method2760(arg2, -21);
        var15.method2777(var13[0], -11);
        var15.method2769(arg8, true);
        var15.method2777(var13[1], -11);
        var15.method2759((byte) -109, class18.field276);
        var15.method2729(arg11, false);
        var15.method2729(arg5, false);
        var15.method2777(var13[2], -11);
        var15.method2759((byte) -77, arg3);
        var15.method2759((byte) -44, arg7);
        var15.method2777(var13[3], -11);
        var15.method2732(774991200, class500.field7235, class26.field376);
        class463 var16 = new class463(366);
        var16.method2769(arg0, true);
        if (arg1) {
            var16.method2760(class250.method1516(class139.field1796, (byte) -67), 112);
            try {
                var16.method2760(Long.parseLong(class24.field345), 125);
            } catch (Exception var19) {
                class45.field539 = 39;
                return;
            }
        }
        int var17 = 8 - (var16.field6631 & 0x7);
        for (int var18 = 0; var18 < var17; var18++) {
            var16.method2729((int) (Math.random() * 255.0D), false);
        }
        var16.method2794(var13, (byte) -112);
        class40.field511.field6631 = 0;
        class40.field511.method2729(arg1 ? class266.field3369.field1865 : class266.field3366.field1865, false);
        class40.field511.method2759((byte) -49, 28 - (-var15.field6631 - var16.field6631));
        class40.field511.method2759((byte) -19, 593);
        class40.field511.method2729(class11.field177, false);
        class40.field511.method2729(class530.field7803.field2104, false);
        class40.method378((byte) -105, class40.field511);
        class40.field511.method2782(var15.field6631, var15.field6618, false, 0);
        class40.field511.method2782(var16.field6631, var16.field6618, false, 0);
        class533.field7846 = 1;
        class45.field539 = -3;
        class456.field6562 = 0;
        class312.field3984 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILya;I)Z")
    public static final boolean method451(int arg0, class38 arg1, int arg2) {
        field549++;
        int var3 = (class452.field6526 - 104) / 2;
        int var4 = (class440.field6307 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class471.method2842(var52, (byte) -79, var6, arg2, var51)) {
                        int var53 = var52;
                        if (class256.method1538(2, var6, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class120.method866(var51, -86, var53, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class297.field3820 = arg1.method299(var7, 0, 512, 512, 512);
        class69.method611((byte) 80);
        int var9 = -(-((int) (Math.random() * 20.0D)) - (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) - ((int) (Math.random() * 20.0D) + 238 + -10 << 8) - 238) - 10 | 0xFF000000;
        int var10 = ((((int) (Math.random() * 20.0D)) + 238) - 10 | 0xCE9FFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        if (arg0 != -1) {
            field563 = null;
        }
        boolean[][] var12 = new boolean[class19.field283][class19.field283];
        for (int var13 = var3; var13 < var3 + 104; var13 += class19.field283) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class19.field283) {
                arg1.method330(0, 0, class19.field283 * 4, class19.field283 * 4);
                arg1.method325(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class19.field283; var44++) {
                        for (int var50 = 0; var50 < class19.field283; var50++) {
                            var12[var44][var50] = class471.method2842(var37, (byte) -123, var13 + var44, arg2, var36 + var50);
                        }
                    }
                    class531.field7811[var37].method397(0, 0, 1024, var13, var36, class19.field283 + var13, class19.field283 + var36, var12);
                    if (!class233.field2970) {
                        for (int var45 = -4; var45 < class19.field283; var45++) {
                            for (int var46 = -4; var46 < class19.field283; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class471.method2842(var37, (byte) -119, var47, arg2, var48)) {
                                    int var49 = var37;
                                    if (class256.method1538(arg0 ^ 0xFFFFFFFD, var47, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class426.method2498(arg1, var45 * 4, var49, (class19.field283 - var46) * 4 - 4, var47, var9, var10, var48, (byte) -88);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class233.field2970) {
                    class348 var38 = class172.field2185[arg2];
                    for (int var39 = 0; var39 < class19.field283; var39++) {
                        for (int var40 = 0; var40 < class19.field283; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field4465[var41 - var38.field4478][var42 - var38.field4464];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method364(4, var39 * 4, 4, (class19.field283 - var40) * 4 - 4, (byte) -48, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method373(4, var39 * 4, 1, -1713569622, (class19.field283 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method323(4, 1, var39 * 4 + 3, (-var40 + class19.field283) * 4 - 4, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method373(4, var39 * 4, arg0 ^ 0xFFFFFFFE, -1713569622, (class19.field283 - var40) * 4 - 1);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method323(4, 1, var39 * 4, (class19.field283 - var40) * 4 - 4, -1713569622);
                            }
                        }
                    }
                }
                arg1.method308(0, 0, class19.field283 * 4, class19.field283 * 4, var11, 2);
                class297.field3820.method132((var13 - var3) * 4 + 48, -(class19.field283 * 4) + 464 + -((-var4 + var36) * 4), class19.field283 * 4, class19.field283 * 4, 0, 0);
            }
        }
        arg1.method318();
        arg1.method325(-16777215);
        class68.method604(arg0 ^ 0x23E7);
        class265.field3349 = 0;
        class21.field306.method154(7491);
        if (!class233.field2970) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg2; (arg2 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class471.method2842(var21, (byte) -106, var14, arg2, var20)) {
                            class41 var22 = (class41) class238.method1430(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class41) class212.method1314(var21, var14, var20, field564 == null ? (field564 = method454("fw")) : field564);
                            }
                            if (var22 == null) {
                                var22 = (class41) class20.method173(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class41) class140.method952(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class102 var23 = class315.field4017.method1958(arg0 - 10090, var22.method187(21067));
                                if (!var23.field1251 || class433.field6147) {
                                    int var24 = var23.field1263;
                                    if (var23.field1291 != null) {
                                        for (int var25 = 0; var25 < var23.field1291.length; var25++) {
                                            if (var23.field1291[var25] != -1) {
                                                class102 var26 = class315.field4017.method1958(arg0 ^ 0x276A, var23.field1291[var25]);
                                                if (var26.field1263 >= 0) {
                                                    var24 = var26.field1263;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class36 var28 = class505.field7281.method1620(var24, arg0 + 37);
                                            if (var28 != null && var28.field452) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class172.field2185[var21].field4465;
                                            int var32 = class172.field2185[var21].field4478;
                                            int var33 = class172.field2185[var21].field4464;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class404.field5753[class265.field3349] = var23.field1316;
                                        class169.field2168[class265.field3349] = var29;
                                        class532.field7834[class265.field3349] = var30;
                                        class265.field3349++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class452.field6528 != null) {
                class404.field5750.field586 = 1;
                class505.field7281.method1619(1024, -1, 64);
                for (int var15 = 0; var15 < class452.field6528.field855; var15++) {
                    int var16 = class452.field6528.field851[var15];
                    if ((var16 >> 28) == class23.field336.field2676) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class441.field6317;
                        int var18 = (var16 & 0x3FFF) - class320.field4064;
                        if (var17 >= 0 && class452.field6526 > var17 && var18 >= 0 && class440.field6307 > var18) {
                            class21.field306.method163(new class101(var15), 0);
                        } else {
                            class36 var19 = class505.field7281.method1620(class452.field6528.field856[var15], 36);
                            if (var19.field446 != null && var19.field470 + var17 >= 0 && class452.field6526 > var17 + var19.field445 && (var18 + var19.field465) >= 0 && (var19.field453 + var18) < class440.field6307) {
                                class21.field306.method163(new class101(var15), 0);
                            }
                        }
                    }
                }
                class505.field7281.method1619(128, arg0, 64);
                class404.field5750.field586 = 2;
                class404.field5750.method483(~arg0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)Z")
    public final boolean method452(byte arg0, int arg1, int arg2) {
        field546++;
        if (arg0 != -12) {
            field562 = 104;
        }
        return this.field556 <= arg2 && arg2 <= this.field554 && this.field551 <= arg1 && arg1 <= this.field553;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[II)V")
    public final void method453(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = this.field551 + arg1 - this.field550;
        if (arg0 > -53) {
            this.method447(false, 88, 31, null);
        }
        field544++;
        arg2[0] = this.field559;
        arg2[1] = -this.field542 - (-this.field556 - arg3);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field556 = arg1;
        this.field559 = arg0;
        this.field551 = arg2;
        this.field553 = arg4;
        this.field550 = arg6;
        this.field554 = arg3;
        this.field542 = arg5;
        this.field543 = arg7;
        this.field552 = arg8;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method454(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
