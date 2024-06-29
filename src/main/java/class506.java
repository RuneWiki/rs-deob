import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class506 extends class397 {

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Ltq;")
    public static class426 field7715 = new class426(8, 7);

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
    public static int[] field7721 = new int[50];

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "F")
    public static float field7722 = 0.0F;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field7720;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field7723;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
    public static final void method3040(int arg0, int arg1) {
        ++field7720;
        class505.field7704 = arg0;
        if (arg1 != -8229) {
            field7715 = null;
        }
        class507.field7737.method38((byte) -85);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field7716;
        if (~arg0 == -1) {
            super.field5859 = arg2.method941((byte) 123) == 1;
        }
        if (arg1 != 80) {
            field7722 = 1.1102796F;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class506() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field7717;
        int[][] var3 = super.field5848.method1692(arg1, 109);
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(arg1, -58, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class164.field2152 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (arg0 < 81) {
            this.method27(51, (byte) -94, (class156) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)I")
    public static final int method3041(int arg0, int arg1) {
        return class502.field7676 != null ? class502.field7676[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -780833076) {
            return null;
        } else {
            ++field7719;
            int[] var3 = super.field5854.method465(arg1, 103);
            if (super.field5854.field991) {
                int[] var4 = this.method2376(85, 0, arg1);
                for (int var5 = 0; ~class164.field2152 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V")
    public static void method3042(byte arg0) {
        field7715 = null;
        if (arg0 <= 102) {
            field7721 = null;
        }
        field7721 = null;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static final void method3043(int arg0) {
        ++field7718;
        for (class214 var1 = (class214) class317.field4637.method241(-98); var1 != null; var1 = (class214) class317.field4637.method241(96)) {
            class330.method1984(458752, var1);
        }
        if (arg0 >= -50) {
            field7721 = null;
        }
        int var2;
        int var3;
        if (!class118.field1533.method2961(class293.field4174, 29)) {
            var2 = class234.field3290;
            var3 = class234.field3290;
        } else {
            var2 = 3;
            var3 = 0;
        }
        client.method1193();
        for (int var4 = var3; var4 <= var2; ++var4) {
            client.method1184();
            client.method1190(var4);
            client.method1183(var4);
        }
        client.method1182();
        client.method1175();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILeq;)Z")
    public static final boolean method3044(int arg0, int arg1, class134 arg2) {
        ++field7714;
        int var3 = (class362.field5442 + -104) / 2;
        int var4 = (class203.field2813 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var3 + 104 > var6; ++var6) {
            for (int var51 = var4; ~var51 > ~(var4 + 104); ++var51) {
                for (int var52 = arg1; ~var52 >= -4; ++var52) {
                    if (class195.method1222(arg1, var6, var52, false, var51)) {
                        int var53 = var52;
                        if (class352.method2137(var51, 86, var6)) {
                            var53 = var52 - 1;
                        }
                        if (~var53 <= -1) {
                            var5 &= class150.method922((byte) 93, var53, var6, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            if (arg0 >= -115) {
                field7722 = 0.37632298F;
            }
            for (int var8 = 0; var8 < var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class278.field3965 = arg2.method784(var7, 0, 512, 512, 512);
            class360.method2184(6);
            int var9 = -16777216 | (int) (20.0D * Math.random()) - -238 - (10 - (-10 + (int) (20.0D * Math.random()) + 238 << 16) + -(238 + (int) (20.0D * Math.random()) + -10 << 8));
            int var10 = (-10 + (int) (Math.random() * 20.0D) + 238 | -843448576) << 16;
            int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class206.field2857][class206.field2857];
            for (int var13 = var3; var3 - -104 > var13; var13 += class206.field2857) {
                for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class206.field2857) {
                    arg2.method810(0, 0, class206.field2857 * 4, class206.field2857 * 4);
                    arg2.method811(-16777216);
                    for (int var37 = arg1; var37 <= 3; ++var37) {
                        for (int var44 = 0; class206.field2857 > var44; ++var44) {
                            for (int var50 = 0; var50 < class206.field2857; ++var50) {
                                var12[var44][var50] = class195.method1222(arg1, var13 + var44, var37, false, var36 + var50);
                            }
                        }
                        class459.field6685[var37].method852(0, 0, 1024, var13, var36, class206.field2857 + var13, class206.field2857 + var36, var12);
                        if (!class110.field1447) {
                            for (int var45 = -4; ~class206.field2857 < ~var45; ++var45) {
                                for (int var46 = -4; class206.field2857 > var46; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    if (~var47 <= ~var3 && var4 <= var48 && class195.method1222(arg1, var47, var37, false, var48)) {
                                        int var49 = var37;
                                        if (class352.method2137(var48, 77, var47)) {
                                            var49 = var37 - 1;
                                        }
                                        if (var49 >= 0) {
                                            class288.method1743(var9, var45 * 4, (-var46 + class206.field2857) * 4 - 4, arg2, var48, var10, (byte) -113, var49, var47);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class110.field1447) {
                        class19 var38 = class169.field2234[arg1];
                        for (int var39 = 0; class206.field2857 > var39; ++var39) {
                            for (int var40 = 0; ~var40 > ~class206.field2857; ++var40) {
                                int var41 = var13 + var39;
                                int var42 = var36 - -var40;
                                int var43 = var38.field275[-var38.field259 + var41][-var38.field258 + var42];
                                if ((var43 & 1076101120) != 0) {
                                    arg2.method801(-6625, 4, (-var40 + class206.field2857) * 4 + -4, -1713569622, var39 * 4, 4);
                                } else if ((var43 & 8388608) != 0) {
                                    arg2.method741(4, var39 * 4, (-var40 + class206.field2857) * 4 - 4, -1713569622, 1);
                                } else if ((33554432 & var43) == 0) {
                                    if ((134217728 & var43) != 0) {
                                        arg2.method741(4, var39 * 4, (-var40 + class206.field2857) * 4 + -4 + 3, -1713569622, 1);
                                    } else if (~(var43 & 536870912) != -1) {
                                        arg2.method754(var39 * 4, -27659, 4, -1713569622, (-var40 + class206.field2857) * 4 + -4);
                                    }
                                } else {
                                    arg2.method754(var39 * 4 + 3, -27659, 4, -1713569622, (-var40 + class206.field2857) * 4 + -4);
                                }
                            }
                        }
                    }
                    arg2.method770(0, 0, class206.field2857 * 4, class206.field2857 * 4, var11, 2);
                    class278.field3965.method1326((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + -(class206.field2857 * 4) + 464, class206.field2857 * 4, class206.field2857 * 4, 0, 0);
                }
            }
            arg2.method836();
            arg2.method811(-16777215);
            class176.method1103(0);
            class427.field6288 = 0;
            class289.field4130.method2089(328);
            if (!class110.field1447) {
                for (int var14 = var3; ~var14 > ~(var3 - -104); ++var14) {
                    for (int var20 = var4; var20 < var4 + 104; ++var20) {
                        for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; ++var21) {
                            if (class195.method1222(arg1, var14, var21, false, var20)) {
                                class113 var22 = (class113) class79.method515(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class113) class124.method701(var21, var14, var20, field7723 != null ? field7723 : (field7723 = method3045("sq")));
                                }
                                if (var22 == null) {
                                    var22 = (class113) class478.method2795(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class113) class305.method1832(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class486 var23 = class114.field1471.method2132((byte) 124, var22.method369((byte) 122));
                                    if (!var23.field7055 || class470.field6790) {
                                        int var24 = var23.field7040;
                                        if (var23.field7043 != null) {
                                            for (int var25 = 0; var25 < var23.field7043.length; ++var25) {
                                                if (var23.field7043[var25] != -1) {
                                                    class486 var26 = class114.field1471.method2132((byte) 123, var23.field7043[var25]);
                                                    if (var26.field7040 >= 0) {
                                                        var24 = var26.field7040;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class170 var28 = class96.field1295.method282(var24, 27);
                                                if (var28 != null && var28.field2247) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class169.field2234[var21].field275;
                                                int var32 = class169.field2234[var21].field259;
                                                int var33 = class169.field2234[var21].field258;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (~var35 == -1 && var3 < var29 && ~var29 < ~(var14 + -3) && ~(2883848 & var31[-var32 + -1 + var29][-var33 + var30]) == -1) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && var29 < var3 + 104 + -1 && ~(var14 + 3) < ~var29 && ~(2883968 & var31[var29 - var32 + 1][-var33 + var30]) == -1) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && var4 < var30 && var20 + -3 < var30 && (2883842 & var31[var29 - var32][var30 + -1 + -var33]) == 0) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && var4 - -104 + -1 > var30 && ~(var20 + 3) < ~var30 && ~(2883872 & var31[-var32 + var29][var30 + 1 + -var33]) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class454.field6605[class427.field6288] = var23.field7046;
                                            class160.field2083[class427.field6288] = var29;
                                            class411.field6034[class427.field6288] = var30;
                                            ++class427.field6288;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class191.field2706 != null) {
                    class235.field3308.field3355 = 1;
                    class96.field1295.method285((byte) -76, 1024, 64);
                    for (int var15 = 0; ~class191.field2706.field4014 < ~var15; ++var15) {
                        int var16 = class191.field2706.field4013[var15];
                        if (~(var16 >> 28) == ~class415.field6145.field2956) {
                            int var17 = (16383 & var16 >> 14) + -class455.field6637;
                            int var18 = (var16 & 16383) + -class223.field3158;
                            if (var17 >= 0 && var17 < class362.field5442 && var18 >= 0 && class203.field2813 > var18) {
                                class289.field4130.method2086((byte) -125, new class304(var15));
                            } else {
                                class170 var19 = class96.field1295.method282(class191.field2706.field4016[var15], 78);
                                if (var19.field2253 != null && ~(var19.field2261 + var17) <= -1 && var19.field2244 + var17 < class362.field5442 && ~(var19.field2235 + var18) <= -1 && ~class203.field2813 < ~(var19.field2248 + var18)) {
                                    class289.field4130.method2086((byte) -111, new class304(var15));
                                }
                            }
                        }
                    }
                    class96.field1295.method285((byte) -113, 128, 64);
                    class235.field3308.field3355 = 2;
                    class235.field3308.method1457(-3);
                }
            }
            return true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3045(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
