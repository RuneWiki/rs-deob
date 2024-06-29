import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class168 extends class96 {

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
    private int field2185 = 819;

    @OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
    private int field2192 = 2048;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    private int field2186 = 1024;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
    private int field2182 = 0;

    @OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
    private int field2190 = 1024;

    @OriginalMember(owner = "client!ju", name = "cb", descriptor = "I")
    private int field2196 = 409;

    @OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
    private int field2193 = 1024;

    @OriginalMember(owner = "client!ju", name = "db", descriptor = "I")
    private int field2197 = 0;

    @OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
    private int field2198 = 1024;

    @OriginalMember(owner = "client!ju", name = "ab", descriptor = "[C")
    public static char[] field2194;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ju", name = "X", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ju", name = "bb", descriptor = "I")
    private int field2195;

    @OriginalMember(owner = "client!ju", name = "fb", descriptor = "Lia;")
    public static class142 field2199;

    @OriginalMember(owner = "client!ju", name = "V", descriptor = "Ldn;")
    public static class201 field2189;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIILjava/util/Random;I[[II)V")
    private final void method1120(int arg0, int arg1, int arg2, Random arg3, int arg4, int[][] arg5, int arg6) {
        ++field2181;
        int var8 = this.field2198 > 0 ? -class179.method1160(Integer.MIN_VALUE, arg3, this.field2198) + 4096 : 4096;
        int var9 = this.field2195 * this.field2186 >> 12;
        int var10 = 37 % ((-70 - arg1) / 44);
        int var11 = this.field2195 + -(var9 > 0 ? class179.method1160(Integer.MIN_VALUE, arg3, var9) : 0);
        if (~arg2 <= ~class269.field3403) {
            arg2 -= class269.field3403;
        }
        if (~var11 >= -1) {
            if (~class269.field3403 > ~(arg0 + arg2)) {
                int var12 = -arg2 + class269.field3403;
                for (int var13 = 0; arg4 > var13; ++var13) {
                    int[] var14 = arg5[arg6 - -var13];
                    class526.method3111(var14, arg2, var12, var8);
                    class526.method3111(var14, 0, -var12 + arg0, var8);
                }
            } else {
                for (int var15 = 0; ~arg4 < ~var15; ++var15) {
                    class526.method3111(arg5[arg6 + var15], arg2, arg0, var8);
                }
            }
        } else if (arg4 > 0 && ~arg0 < -1) {
            int var16 = arg0 / 2;
            int var17 = arg4 / 2;
            int var18 = var11 <= var16 ? var11 : var16;
            int var19 = ~var17 <= ~var11 ? var11 : var17;
            int var20 = arg2 + var18;
            int var21 = -(var18 * 2) + arg0;
            for (int var22 = 0; arg4 > var22; ++var22) {
                int[] var23 = arg5[var22 - -arg6];
                if (~var22 > ~var19) {
                    int var24 = var8 * var22 / var19;
                    if (~this.field2182 == -1) {
                        for (int var25 = 0; var25 < var18; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class60.method339(arg2 + var25, class292.field3781)] = var23[class60.method339(class292.field3781, -var25 + arg2 - -arg0 + -1)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var27 < var18; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class60.method339(arg2 + var27, class292.field3781)] = var23[class60.method339(class292.field3781, arg0 + arg2 + -var27 - 1)] = ~var29 > ~var24 ? var29 : var24;
                        }
                    }
                    if (class269.field3403 < var20 - -var21) {
                        int var28 = class269.field3403 - var20;
                        class526.method3111(var23, var20, var28, var24);
                        class526.method3111(var23, 0, -var28 + var21, var24);
                    } else {
                        class526.method3111(var23, var20, var21, var24);
                    }
                } else {
                    int var30 = arg4 + -1 + -var22;
                    if (var30 < var19) {
                        int var31 = var8 * var30 / var19;
                        if (this.field2182 == 0) {
                            for (int var32 = 0; var18 > var32; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class60.method339(class292.field3781, arg2 + var32)] = var23[class60.method339(class292.field3781, arg2 + -1 + arg0 + -var32)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; var18 > var34; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class60.method339(arg2 + var34, class292.field3781)] = var23[class60.method339(arg2 - -arg0 + -var34 + -1, class292.field3781)] = ~var36 > ~var31 ? var36 : var31;
                            }
                        }
                        if (var20 + var21 <= class269.field3403) {
                            class526.method3111(var23, var20, var21, var31);
                        } else {
                            int var35 = -var20 + class269.field3403;
                            class526.method3111(var23, var20, var35, var31);
                            class526.method3111(var23, 0, -var35 + var21, var31);
                        }
                    } else {
                        for (int var37 = 0; ~var37 > ~var18; ++var37) {
                            var23[class60.method339(arg2 + var37, class292.field3781)] = var23[class60.method339(-var37 + arg2 + arg0 + -1, class292.field3781)] = var8 * var37 / var18;
                        }
                        if (var20 + var21 > class269.field3403) {
                            int var38 = -var20 + class269.field3403;
                            class526.method3111(var23, var20, var38, var8);
                            class526.method3111(var23, 0, -var38 + var21, var8);
                        } else {
                            class526.method3111(var23, var20, var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        if (arg0 <= 15) {
            this.method31(126, 3, (class88) null);
        }
        ++field2180;
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(B)V")
    public static void method1121(byte arg0) {
        int var1 = 49 / ((-59 - arg0) / 47);
        field2189 = null;
        field2194 = null;
        field2199 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 != -1) {
            field2189 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field2198 = arg2.method568((byte) 110);
                                        }
                                    } else {
                                        this.field2186 = arg2.method568((byte) 110);
                                    }
                                } else {
                                    this.field2182 = arg2.method617(2);
                                }
                            } else {
                                this.field2190 = arg2.method568((byte) 110);
                            }
                        } else {
                            this.field2185 = arg2.method568((byte) 110);
                        }
                    } else {
                        this.field2196 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field2192 = arg2.method568((byte) 110);
                }
            } else {
                this.field2193 = arg2.method568((byte) 110);
            }
        } else {
            this.field2197 = arg2.method617(2);
        }
        ++field2188;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIB)V")
    public static final void method1122(int arg0, int arg1, byte arg2) {
        if (arg2 != 58) {
            method1121((byte) -87);
        }
        ++class283.field3616;
        ++field2184;
        class420.method2472((byte) -101, class426.field5851);
        class319.field4112.method566(-12633, arg0);
        class319.field4112.method572(-120, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2191;
        int var7 = class206.field2684;
        int[] var8 = class143.field1892;
        class379.field4915 = 0;
        int var9 = -89 % ((-12 - arg6) / 61);
        for (int var10 = 0; class16.field264 + var7 > var10; ++var10) {
            class10 var33 = null;
            class395 var34;
            if (~var7 < ~var10) {
                var34 = class76.field952[var8[var10]];
            } else {
                var34 = class527.field7791[class414.field5507[-var7 + var10]];
                var33 = ((class295) var34).field3831;
                if (var33.field111 != null) {
                    var33 = var33.method63(false, class198.field2555);
                    if (var33 == null) {
                        continue;
                    }
                }
            }
            if (~var34.field5218 <= -1 && (~class398.field5291 == ~var34.field5188 || ~class37.field573.field6220 == ~var34.field6220)) {
                class156.method1053(arg5, (byte) -65, var34.method1770((byte) -54), arg3 >> 1, arg0, var34, arg4 >> 1);
                if (~class267.field3388[0] <= -1) {
                    if (var34.field5229 != null && (var10 >= var7 || ~class467.field6867 == -1 || class467.field6867 == 3 || ~class467.field6867 == -2 && class212.method1358(((class518) var34).field7630, 0)) && class266.field3377 > class379.field4915) {
                        class266.field3374[class379.field4915] = class157.field2070.method1704((byte) 92, var34.field5229) / 2;
                        class266.field3375[class379.field4915] = class267.field3388[0];
                        class266.field3378[class379.field4915] = class267.field3388[1];
                        class266.field3372[class379.field4915] = var34.field5211;
                        class266.field3379[class379.field4915] = var34.field5231;
                        class266.field3376[class379.field4915] = var34.field5223;
                        class266.field3373[class379.field4915] = var34.field5229;
                        ++class379.field4915;
                    }
                    int var35 = class267.field3388[1] + arg2;
                    int var46;
                    if (!var34.field5184 && class264.field3353 < var34.field5151) {
                        boolean var36 = true;
                        byte var37 = 1;
                        int var38;
                        if (~var10 <= ~var7) {
                            var38 = var33.field168;
                            if (~var38 == 0) {
                                var38 = var34.method2347((byte) -121).field4817;
                            }
                        } else {
                            class518 var39 = class76.field952[var8[var10]];
                            var38 = var34.method2347((byte) -121).field4817;
                            if (var39.field7649) {
                                var37 = 2;
                            }
                        }
                        class404[] var40 = class271.field3446;
                        if (var38 != -1) {
                            class404[] var41 = (class404[]) class485.field7052.method78((long) var38, (byte) -92);
                            if (var41 == null) {
                                class136[] var42 = class136.method954(class391.field5121, var38, 0);
                                if (var42 != null) {
                                    var41 = new class404[var42.length];
                                    for (int var43 = 0; var43 < var42.length; ++var43) {
                                        var41[var43] = class512.field7538.method851(var42[var43], true);
                                    }
                                    class485.field7052.method88((long) var38, 32, var41);
                                }
                            }
                            if (var41 != null && ~var41.length <= -3) {
                                var40 = var41;
                            }
                        }
                        if (var40.length <= var37) {
                            var37 = 1;
                        }
                        class404 var44 = var40[0];
                        class404 var45 = var40[var37];
                        var46 = var35 - Math.max(class157.field2070.field3565, var44.method378());
                        int var47 = class267.field3388[0] + arg1 + -(var44.method375() >> 1);
                        int var48 = var44.method375() * var34.field5199 / 255;
                        if (var34.field5199 > 0 && var48 < 2) {
                            var48 = 2;
                        }
                        var44.method2406(var47, var46);
                        class512.field7538.method899(var47, var46, var47 - -var48, var44.method378() + var46);
                        var45.method2406(var47, var46);
                        class512.field7538.method925(arg1, arg2, arg1 - -arg3, arg2 + arg4);
                    } else {
                        var46 = var35 - Math.max(class157.field2070.field3565, class271.field3446[0].method378());
                    }
                    var46 -= 2;
                    if (!var34.field5184) {
                        if (~var34.field5214 < ~class264.field3353) {
                            class404 var49 = class347.field4436[!var34.field5189 ? 0 : 2];
                            class404 var50 = class347.field4436[var34.field5189 ? 3 : 1];
                            boolean var51 = true;
                            int var52;
                            if (var34 instanceof class295) {
                                var52 = var33.field169;
                                if (~var52 == 0) {
                                    var52 = var34.method2347((byte) -121).field4823;
                                }
                            } else {
                                var52 = var34.method2347((byte) -121).field4823;
                            }
                            if (var52 != -1) {
                                class404[] var53 = (class404[]) class452.field6297.method78((long) var52, (byte) -101);
                                if (var53 == null) {
                                    class136[] var54 = class136.method954(class391.field5121, var52, 0);
                                    if (var54 != null) {
                                        var53 = new class404[var54.length];
                                        for (int var55 = 0; var55 < var54.length; ++var55) {
                                            var53[var55] = class512.field7538.method851(var54[var55], true);
                                        }
                                        class452.field6297.method88((long) var52, 42, var53);
                                    }
                                }
                                if (var53 != null && ~var53.length == -5) {
                                    var49 = var53[!var34.field5189 ? 0 : 2];
                                    var50 = var53[var34.field5189 ? 3 : 1];
                                }
                            }
                            int var56 = -class264.field3353 + var34.field5214;
                            int var57;
                            if (~var56 >= ~var34.field5197) {
                                var57 = var49.method375();
                            } else {
                                int var58 = var56 - var34.field5197;
                                int var59 = ~var34.field5207 != -1 ? (-var58 + var34.field5210) / var34.field5207 * var34.field5207 : 0;
                                var57 = var59 * var49.method375() / var34.field5210;
                            }
                            int var60 = var49.method378();
                            var46 -= var60;
                            int var61 = arg1 - -class267.field3388[0] + -(var49.method375() >> 1);
                            var49.method2406(var61, var46);
                            class512.field7538.method899(var61, var46, var57 + var61, var46 - -var60);
                            var50.method2406(var61, var46);
                            var46 -= 2;
                            class512.field7538.method925(arg1, arg2, arg1 + arg3, arg2 + arg4);
                        }
                        if (var7 <= var10) {
                            if (var33.field163 >= 0 && var33.field163 < class303.field3927.length) {
                                class404 var62 = class303.field3927[var33.field163];
                                var46 -= 25;
                                var62.method2406(class267.field3388[0] + (arg1 - (var62.method375() >> 1)), var46);
                                var46 -= 2;
                            }
                        } else {
                            class518 var63 = (class518) var34;
                            if (var63.field7639 != -1) {
                                var46 -= 25;
                                class492.field7189[var63.field7639].method2406(class267.field3388[0] + arg1 + -12, var46);
                                var46 -= 2;
                            }
                            if (~var63.field7643 != 0) {
                                var46 -= 25;
                                class303.field3927[var63.field7643].method2406(arg1 + -12 - -class267.field3388[0], var46);
                                var46 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var34 instanceof class518) {
                        if (var10 >= 0) {
                            int var64 = 0;
                            class208[] var65 = class509.field7472;
                            for (int var66 = 0; var66 < var65.length; ++var66) {
                                class208 var68 = var65[var66];
                                if (var68 != null && var68.field2697 == 10 && ~var8[var10] == ~var68.field2693) {
                                    class404 var69 = class269.field3407[var68.field2703];
                                    if (var64 < var69.method378()) {
                                        var64 = var69.method378();
                                    }
                                    var69.method2406(arg1 + -12 - -class267.field3388[0], -var69.method378() + var46);
                                }
                            }
                            if (~var64 < -1) {
                                var10000 = var46 - (var64 + 2);
                            }
                        }
                    } else {
                        int var70 = 0;
                        class208[] var71 = class509.field7472;
                        for (int var72 = 0; ~var71.length < ~var72; ++var72) {
                            class208 var76 = var71[var72];
                            if (var76 != null && ~var76.field2697 == -2 && class414.field5507[-var7 + var10] == var76.field2693) {
                                class404 var77 = class269.field3407[var76.field2703];
                                if (~var77.method378() < ~var70) {
                                    var70 = var77.method378();
                                }
                                if (~(class264.field3353 % 20) > -11) {
                                    var77.method2406(arg1 - -class267.field3388[0] + -12, var46 + -var77.method378());
                                }
                            }
                        }
                        if (~var70 < -1) {
                            var10000 = var46 - (var70 + 2);
                        }
                    }
                    for (int var74 = 0; var74 < 4; ++var74) {
                        if (~class264.field3353 > ~var34.field5153[var74]) {
                            int var75 = var34.method1770((byte) -52) / 2;
                            class156.method1053(arg5, (byte) -65, var75, arg3 >> 1, arg0, var34, arg4 >> 1);
                            if (~class267.field3388[0] < 0) {
                                if (~var74 == -2) {
                                    class267.field3388[1] -= 20;
                                }
                                if (var74 == 2) {
                                    class267.field3388[0] -= 15;
                                    class267.field3388[1] -= 10;
                                }
                                if (~var74 == -4) {
                                    class267.field3388[0] += 15;
                                    class267.field3388[1] -= 10;
                                }
                                class9.field95[var34.field5220[var74]].method2406(class267.field3388[0] - 12 + arg1, arg2 + -12 - -class267.field3388[1]);
                                class254.field3211.method1105(Integer.toString(var34.field5173[var74]), class267.field3388[0] - 1 + arg1, arg2 + 3 + class267.field3388[1], (byte) -109, -1, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var11 = 0; ~var11 > ~class299.field3876; ++var11) {
            int var29 = class86.field1164[var11];
            class395 var30;
            if (var29 < 2048) {
                var30 = class76.field952[var29];
            } else {
                var30 = class527.field7791[var29 + -2048];
            }
            int var31 = class386.field5077[var11];
            class395 var32;
            if (~var31 <= -2049) {
                var32 = class527.field7791[var31 - 2048];
            } else {
                var32 = class76.field952[var31];
            }
            class97.method667(arg0, var30, var32, arg2, arg1, arg5, arg3, arg4, --var30.field5169, (byte) -108);
        }
        int var12 = class157.field2070.field3546 + 2 + class157.field2070.field3565;
        for (int var13 = 0; var13 < class379.field4915; ++var13) {
            int var14 = class266.field3375[var13];
            int var15 = class266.field3378[var13];
            int var16 = class266.field3374[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; ~var28 > ~var13; ++var28) {
                    if (~(var15 + 2) < ~(class266.field3378[var28] - var12) && -var12 + var15 < class266.field3378[var28] - -2 && ~(-var16 + var14) > ~(class266.field3375[var28] + class266.field3374[var28]) && ~(class266.field3375[var28] + -class266.field3374[var28]) > ~(var14 + var16) && class266.field3378[var28] + -var12 < var15) {
                        var17 = true;
                        var15 = class266.field3378[var28] + -var12;
                    }
                }
            }
            class266.field3378[var13] = var15;
            String var18 = class266.field3373[var13];
            if (~class357.field4600 != -1) {
                class200.field2590.method1105(var18, arg1 + var14, arg2 - -var15, (byte) -113, -256, -16777216);
            } else {
                int var19 = 16776960;
                if (~class266.field3372[var13] > -7) {
                    var19 = class338.field4313[class266.field3372[var13]];
                }
                if (class266.field3372[var13] == 6) {
                    var19 = ~(class398.field5291 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (~class266.field3372[var13] == -8) {
                    var19 = ~(class398.field5291 % 20) > -11 ? 255 : 65535;
                }
                if (~class266.field3372[var13] == -9) {
                    var19 = ~(class398.field5291 % 20) > -11 ? 45056 : 8454016;
                }
                if (class266.field3372[var13] == 9) {
                    int var20 = 150 - class266.field3376[var13];
                    if (~var20 > -51) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = -(var20 * 327680) - -16384000 + 16776960;
                    } else if (~var20 > -151) {
                        var19 = var20 * 5 - 500 + 65280;
                    }
                }
                if (class266.field3372[var13] == 10) {
                    int var21 = -class266.field3376[var13] + 150;
                    if (~var21 <= -51) {
                        if (var21 < 100) {
                            var19 = 33095935 - var21 * 327680;
                        } else if (var21 < 150) {
                            var19 = (var21 + -100) * 327680 + -((var21 - 100) * 5) + 255;
                        }
                    } else {
                        var19 = var21 * 5 + 16711680;
                    }
                }
                if (~class266.field3372[var13] == -12) {
                    int var22 = -class266.field3376[var13] + 150;
                    if (var22 >= 50) {
                        if (var22 < 100) {
                            var19 = var22 * 327685 + -16384250 + 65280;
                        } else if (var22 < 150) {
                            var19 = -((var22 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var19 = -(var22 * 327685) + 16777215;
                    }
                }
                int var23 = var19 | -16777216;
                if (class266.field3379[var13] == 0) {
                    class200.field2590.method1105(var18, arg1 + var14, arg2 + var15, (byte) -113, var23, -16777216);
                }
                if (~class266.field3379[var13] == -2) {
                    class200.field2590.method1112(arg1 + var14, arg2 + var15, class398.field5291, var23, -16777216, false, var18);
                }
                if (~class266.field3379[var13] == -3) {
                    class200.field2590.method1102(arg1 - -var14, class398.field5291, -16777216, var18, arg2 + var15, 0, var23);
                }
                if (class266.field3379[var13] == 3) {
                    class200.field2590.method1111(var18, (byte) 115, var23, -16777216, -class266.field3376[var13] + 150, class398.field5291, arg2 + var15, arg1 + var14);
                }
                if (class266.field3379[var13] == 4) {
                    int var24 = (-class266.field3376[var13] + 150) * (class157.field2070.method1704((byte) 113, var18) - -100) / 150;
                    class512.field7538.method899(arg1 + var14 + -50, arg2, arg1 + var14 - -50, arg2 + arg4);
                    class200.field2590.method1118(arg2 + var15, -var24 + 50 + arg1 + var14, -16777216, var23, -8634, var18);
                    class512.field7538.method925(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
                if (class266.field3379[var13] == 5) {
                    int var25 = -class266.field3376[var13] + 150;
                    int var26 = 0;
                    if (var25 >= 25) {
                        if (var25 > 125) {
                            var26 = var25 + -125;
                        }
                    } else {
                        var26 = var25 + -25;
                    }
                    int var27 = class157.field2070.field3565 + class157.field2070.field3546;
                    class512.field7538.method899(arg1, arg2 + var15 - var27 + -1, arg1 + arg3, var15 + 5 + arg2);
                    class200.field2590.method1105(var18, arg1 + var14, arg2 + var15 + var26, (byte) -128, var23, -16777216);
                    class512.field7538.method925(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field2183;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            return null;
        } else if (super.field1331.field863) {
            int[][] var4 = super.field1331.method398(12054);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class269.field3403 * this.field2193 >> 12;
            int var15 = class269.field3403 * this.field2192 >> 12;
            int var16 = class477.field6965 * this.field2196 >> 12;
            int var17 = class477.field6965 * this.field2185 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2195 = class269.field3403 / 8 * this.field2190 >> 12;
                int var18 = class269.field3403 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2197);
                while (true) {
                    while (true) {
                        int var22 = class179.method1160(Integer.MIN_VALUE, var21, -var14 + var15) + var14;
                        int var23 = var16 + class179.method1160(arg1 ^ -2147483393, var21, -var16 + var17);
                        int var24 = var8 + var22;
                        if (~var24 < ~class269.field3403) {
                            var24 = class269.field3403;
                            var22 = -var8 + class269.field3403;
                        }
                        int var10000;
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class269.field3403;
                            }
                            if (class269.field3403 < var28) {
                                var28 -= class269.field3403;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var30[0] >= ~var28 && ~var28 >= ~var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class269.field3403;
                                        }
                                        if (class269.field3403 < var31) {
                                            var31 -= class269.field3403;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var28) {
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class269.field3403;
                                                    } else {
                                                        var39 = Math.min(var28, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1120(var39 - var38, arg1 ^ -139, var7 + var38, var21, var29 - var35, var4, var35);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                var10000 = ~var12;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (class477.field6965 >= var23 + var29) {
                            var10 = false;
                        } else {
                            var23 = -var29 + class477.field6965;
                        }
                        if (class269.field3403 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var29;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method1120(var22, 76, var6 + var8, var21, var23, var4, var29);
                            var8 = var24;
                        } else {
                            this.method1120(var22, -127, var8 - -var6, var21, var23, var4, var29);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var29 - -var23;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class179.method1160(Integer.MIN_VALUE, var21, class269.field3403);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class269.field3403 + var5;
                            }
                            if (~class269.field3403 > ~var44) {
                                var44 -= class269.field3403;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var44 <= ~var45[0] && ~var44 >= ~var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    static {
        new class169((String) null, "geschickt werden.", (String) null, (String) null);
        field2194 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
    }
}
