import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class264 extends class87 {

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    private int field4233 = 4096;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "[I")
    private int[] field4229 = new int[3];

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    private int field4241 = 4096;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    private int field4235 = 4096;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "I")
    private int field4243 = 409;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field4230 = 0;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "[Lig;")
    public static class96[] field4232 = new class96[4];

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4239 = " from your friend list first.";

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "Lnk;")
    public static class300 field4236;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lnf;IIIIIIZ)V")
    public static final void method1820(class239 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3499.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field3499[var9] - class159.field2479;
            int var23 = arg0.field3504[var9] - class282.field4540;
            int var24 = arg0.field3505[var9] - class141.field2281;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3494 != null) {
                class239.field3510[var9] = var25;
                class239.field3489[var9] = var28;
                class239.field3500[var9] = var29;
            }
            class239.field3501[var9] = (var25 << 9) / var29 + class244.field3591;
            class239.field3508[var9] = (var28 << 9) / var29 + class244.field3598;
        }
        class244.field3602 = 0;
        int var10 = arg0.field3509.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field3509[var11];
            int var13 = arg0.field3497[var11];
            int var14 = arg0.field3493[var11];
            int var15 = class239.field3501[var12];
            int var16 = class239.field3501[var13];
            int var17 = class239.field3501[var14];
            int var18 = class239.field3508[var12];
            int var19 = class239.field3508[var13];
            int var20 = class239.field3508[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class32.field404 && class229.method1595(class255.field3853 + class244.field3591, class244.field3598 + class232.field3407, var18, var19, var20, var15, var16, var17)) {
                    class147.field2370 = arg5;
                    class302.field4889 = arg6;
                }
                if (!arg7) {
                    class244.field3594 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class244.field3586 || var16 > class244.field3586 || var17 > class244.field3586) {
                        class244.field3594 = true;
                    }
                    if (arg0.field3494 != null && arg0.field3494[var11] != -1) {
                        if (class69.field1112) {
                            if (arg0.field3498) {
                                class244.method1671(var18, var19, var20, var15, var16, var17, arg0.field3490[var11], arg0.field3503[var11], arg0.field3506[var11], class239.field3510[0], class239.field3510[1], class239.field3510[3], class239.field3489[0], class239.field3489[1], class239.field3489[3], class239.field3500[0], class239.field3500[1], class239.field3500[3], arg0.field3494[var11]);
                            } else {
                                class244.method1671(var18, var19, var20, var15, var16, var17, arg0.field3490[var11], arg0.field3503[var11], arg0.field3506[var11], class239.field3510[var12], class239.field3510[var13], class239.field3510[var14], class239.field3489[var12], class239.field3489[var13], class239.field3489[var14], class239.field3500[var12], class239.field3500[var13], class239.field3500[var14], arg0.field3494[var11]);
                            }
                        } else {
                            int var21 = class244.field3600.method531(arg0.field3494[var11], -8362);
                            class244.method1681(var18, var19, var20, var15, var16, var17, class8.method43(var21, arg0.field3490[var11]), class8.method43(var21, arg0.field3503[var11]), class8.method43(var21, arg0.field3506[var11]));
                        }
                    } else if (arg0.field3490[var11] != 12345678) {
                        class244.method1681(var18, var19, var20, var15, var16, var17, arg0.field3490[var11], arg0.field3503[var11], arg0.field3506[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field4229 = null;
        }
        int[][] var3 = super.field1390.method1902(-115, arg0);
        if (super.field1390.field4428) {
            int[][] var4 = this.method648(arg0, -127, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; class206.field3032 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4229[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field4243 < var13) {
                    var8[var11] = var12;
                    var6[var11] = var7[var11];
                    var10[var11] = var9[var11];
                } else {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field4229[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4243) {
                        var8[var11] = var12;
                        var6[var11] = var14;
                        var10[var11] = var9[var11];
                    } else {
                        int var16 = var9[var11];
                        int var17 = -this.field4229[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field4243) {
                            var8[var11] = var12;
                            var6[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4241 * var12 >> 12;
                            var6[var11] = this.field4235 * var14 >> 12;
                            var10[var11] = this.field4233 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field4237;
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V")
    public static final void method1821(int arg0) {
        int var1 = class169.field2571;
        int var2 = -class179.field2677 + class123.field2039 - var1;
        ++field4238;
        int var3 = class305.field4931;
        int var4 = -var3 + class40.field536 - class137.field2230;
        if (arg0 != -1) {
            field4239 = null;
        }
        if (var1 > 0 || var2 > 0 || ~var3 < -1 || var4 > 0) {
            try {
                int var5 = 0;
                Container var6;
                if (class268.field4312 == null) {
                    if (class195.field2881 != null) {
                        var6 = class195.field2881;
                    } else {
                        var6 = class273.field4426.field2020;
                    }
                } else {
                    var6 = class268.field4312;
                }
                int var7 = 0;
                if (class195.field2881 == var6) {
                    Insets var8 = class195.field2881.getInsets();
                    var5 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var6.getGraphics();
                var9.setColor(Color.black);
                if (~var1 < -1) {
                    var9.fillRect(var5, var7, var1, class40.field536);
                }
                if (var3 > 0) {
                    var9.fillRect(var5, var7, class123.field2039, var3);
                }
                if (~var2 < -1) {
                    var9.fillRect(-var2 + var5 + class123.field2039, var7, var2, class40.field536);
                }
                if (~var4 < -1) {
                    var9.fillRect(var5, -var4 + var7 + class40.field536, class123.field2039, var4);
                    return;
                }
            } catch (Exception var10) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(JI)V")
    public static final void method1822(long arg0, int arg1) {
        ++field4231;
        if (arg0 != 0L) {
            if ((class110.field1832 < 100 || class171.field2585) && class110.field1832 < 200) {
                String var3 = class121.method920(42, arg0);
                for (int var4 = 0; var4 < class110.field1832; ++var4) {
                    if (class245.field3605[var4] == arg0) {
                        class258.method1777(-1, 0, "", var3 + class241.field3542);
                        return;
                    }
                }
                for (int var5 = 0; ~var5 > ~class47.field659; ++var5) {
                    if (~class203.field3007[var5] == ~arg0) {
                        class258.method1777(-1, 0, "", class147.field2356 + var3 + class121.field2002);
                        return;
                    }
                }
                if (var3.equals(class213.field3139.field3069)) {
                    class258.method1777(-1, 0, "", class204.field3013);
                } else {
                    ++class74.field1169;
                    class223.field3268[class110.field1832] = var3;
                    class245.field3605[class110.field1832] = arg0;
                    class268.field4315[class110.field1832] = 0;
                    class258.field3980[class110.field1832] = "";
                    class292.field4637[class110.field1832] = 0;
                    class240.field3519[class110.field1832] = false;
                    ++class110.field1832;
                    class135.field2210 = class248.field3705;
                    class144.field2338.method683(true, 26);
                    class144.field2338.method382(902642416, arg0);
                    if (arg1 != -8002) {
                        field4236 = null;
                    }
                }
            } else {
                class258.method1777(-1, 0, "", class282.field4550);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V")
    public static final void method1823(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -23330) {
            if (~arg1 == -1) {
                class144.field2338.method683(true, 230);
                ++class289.field4615;
            }
            ++field4240;
            if (arg1 == 1) {
                class144.field2338.method683(true, 207);
                ++class151.field2397;
            }
            class144.field2338.method369((byte) -127, ++class252.field3799);
            class144.field2338.method360(class82.field1326[82] ? 1 : 0, 25759);
            class144.field2338.method376(arg2 - -class149.field2390, false);
            class144.field2338.method358(8117, arg3 - -class163.field2520);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Z")
    public static final boolean method1824(byte arg0, int arg1) {
        if (arg0 != 61) {
            field4230 = 91;
        }
        ++field4242;
        byte var2 = 0;
        byte var3 = 0;
        if (class297.field4772 == null) {
            if (class308.field4968 != null) {
                class297.field4772 = (class148) class308.field4968;
            } else {
                class297.field4772 = new class148(512, 512);
            }
            int[] var4 = class297.field4772.field2375;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; ++var6) {
                var4[var6] = 1;
            }
            for (int var7 = var3 - -1; ~var7 > ~(-var3 + 103); ++var7) {
                int var23 = (var3 + 103 + -var7) * 4 * 512 + 24628;
                for (int var24 = var2 - -1; ~(-var2 + 104 + -1) < ~var24; ++var24) {
                    if (~(class253.field3806[arg1][var24][var7] & 24) == -1) {
                        class236.method1630(var4, var23, 512, arg1, var24, var7);
                    }
                    if (arg1 < 3 && (class253.field3806[arg1 + 1][var24][var7] & 8) != 0) {
                        class236.method1630(var4, var23, 512, arg1 + 1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class99.field1680 = 0;
            for (int var8 = 0; var8 < 104; ++var8) {
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    long var10 = class91.method678(arg1, var8 - -var2, var9 - -var3);
                    if (~var10 == -1L) {
                        var10 = class238.method1637(arg1, var8 - -var2, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class205.method1455(arg1, var2 + var8, var9 - -var3);
                    }
                    if (~var10 == -1L) {
                        var10 = class210.method1481(arg1, var2 + var8, var3 + var9);
                    }
                    if (var10 != 0L) {
                        class93 var12 = class48.method297(false, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        if (!var12.field1556 || class255.field3857) {
                            int var13 = var12.field1571;
                            if (var12.field1528 != null) {
                                for (int var14 = 0; var12.field1528.length > var14; ++var14) {
                                    if (var12.field1528[var14] != -1) {
                                        class93 var15 = class48.method297(false, var12.field1528[var14]);
                                        if (var15.field1571 >= 0) {
                                            var13 = var15.field1571;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                class66 var16 = class206.method1458(var13, 22464);
                                boolean var17 = false;
                                if (var16 != null && var16.field1008) {
                                    var17 = true;
                                }
                                int var18 = var2 + var8;
                                int var19 = var9 - -var3;
                                if (var17) {
                                    int[][] var20 = class235.field3431[arg1].field3351;
                                    for (int var21 = 0; var21 < 10; ++var21) {
                                        int var22 = (int) (4.0D * Math.random());
                                        if (var22 == 0 && ~var18 < -1 && ~var18 < ~(var8 + -3) && (var20[var18 + -1][var19] & 2883848) == 0) {
                                            --var18;
                                        }
                                        if (~var22 == -2 && var18 < 103 && ~(var8 + 3) < ~var18 && ~(var20[var18 + 1][var19] & 2883968) == -1) {
                                            ++var18;
                                        }
                                        if (~var22 == -3 && ~var19 < -1 && var9 + -3 < var19 && ~(var20[var18][var19 + -1] & 2883842) == -1) {
                                            --var19;
                                        }
                                        if (~var22 == -4 && ~var19 > -104 && ~(var9 + 3) < ~var19 && (var20[var18][var19 + 1] & 2883872) == 0) {
                                            ++var19;
                                        }
                                    }
                                }
                                class40.field538[class99.field1680] = var12.field1505;
                                class301.field4875[class99.field1680] = -var2 + var18;
                                class209.field3098[class99.field1680] = var19 - var3;
                                ++class99.field1680;
                            }
                        }
                    }
                }
            }
        }
        class297.field4772.method1100();
        int var25 = (-10 + 238 + (int) (20.0D * Math.random()) << 8) + (-10 + (int) (20.0D * Math.random()) + 238 << 16) - (-((int) (20.0D * Math.random())) + -238) - 10;
        int var26 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
        for (int var27 = 1; ~var27 > -104; ++var27) {
            for (int var28 = 1; ~var28 > -104; ++var28) {
                if ((24 & class253.field3806[arg1][var2 + var28][var27 - -var3]) == 0 && !class243.method1665(var3, false, var25, var2, arg1, var28, var27, var26)) {
                    class112.field1865.method299(0);
                    return false;
                }
                if (~arg1 > -4 && (class253.field3806[arg1 - -1][var2 + var28][var27 - -var3] & 8) != 0 && !class243.method1665(var3, false, var25, var2, arg1 - -1, var28, var27, var26)) {
                    class112.field1865.method299(0);
                    return false;
                }
            }
        }
        class308.field4968 = class297.field4772;
        class112.field1865.method299(0);
        class297.field4772 = null;
        return true;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, false);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            method1824((byte) 22, -88);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method362(arg2 + -25649);
                            this.field4229[2] = class301.method2056(var5 >> 12, 0);
                            this.field4229[0] = class301.method2056(16711680, var5) << 4;
                            this.field4229[1] = class301.method2056(var5 >> 4, 4080);
                        }
                    } else {
                        this.field4241 = arg0.method331(-14);
                    }
                } else {
                    this.field4235 = arg0.method331(-76);
                }
            } else {
                this.field4233 = arg0.method331(-13);
            }
        } else {
            this.field4243 = arg0.method331(-7);
        }
        ++field4234;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
    public static void method1825(byte arg0) {
        if (arg0 > -30) {
            field4230 = 115;
        }
        field4239 = null;
        field4232 = null;
        field4236 = null;
    }
}
