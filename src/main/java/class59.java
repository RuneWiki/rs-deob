import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class59 extends class128 {

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "[S")
    private short[] field712 = new short[257];

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    private int field721 = 0;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    public static int field722 = -1;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "[I")
    public static int[] field723 = new int[25];

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    public static int field725 = 0;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "[I")
    public static int[] field711;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
    private int[] field717;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "[I")
    private int[] field719;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "[[I")
    private int[][] field720;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 6)
    public class59() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V", line = 15)
    public static final void method341(int arg0, int arg1) {
        field716++;
        int var2 = 112 / ((arg0 - 23) / 57);
        class96 var3 = class141.method935(arg1, 1, 126);
        var3.method582(-1);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(CILjava/lang/String;)I", line = 26)
    public static final int method342(char arg0, int arg1, String arg2) {
        field726++;
        if (arg1 != -6347) {
            return 54;
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V", line = 53)
    public static final void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class40.field481 = 0;
        int var7 = -1;
        if (arg2 != 327680) {
            method341(58, 125);
        }
        while (class204.field2864 + class127.field1735 > var7) {
            class170 var8;
            if (var7 == -1) {
                var8 = class118.field1664;
            } else if (class204.field2864 > var7) {
                var8 = class328.field5009[class180.field2612[var7]];
            } else {
                var8 = class223.field3159[class269.field4238[var7 - class204.field2864]];
            }
            if (var8 != null && var8.method744(8)) {
                label415: {
                    if (var8 instanceof class184) {
                        class282 var9 = ((class184) var8).field2657;
                        if (var9.field4401 != null) {
                            var9 = var9.method2021((byte) 22);
                        }
                        if (var9 == null) {
                            break label415;
                        }
                    }
                    if (var7 >= class204.field2864) {
                        class282 var15 = ((class184) var8).field2657;
                        if (var15.field4401 != null) {
                            var15 = var15.method2021((byte) 22);
                        }
                        if (var15.field4379 >= 0 && var15.field4379 < class48.field562.length) {
                            int var16;
                            if (var15.field4390 == -1) {
                                var16 = var8.method1110(arg2 ^ 0xFFFA9E4C) + 15;
                            } else {
                                var16 = var15.field4390 + 15;
                            }
                            class289.method2065(-3, arg1, arg3 >> 1, var16, var8, arg6 >> 1, arg0);
                            if (class242.field3642 > -1) {
                                class48.field562[var15.field4379].method531(arg5 + class242.field3642 - 12, field722 + arg4 - 30);
                            }
                        }
                        class219[] var17 = class167.field2328;
                        for (int var18 = 0; var18 < var17.length; var18++) {
                            class219 var19 = var17[var18];
                            if (var19 != null && var19.field3079 == 1 && class269.field4238[var7 - class204.field2864] == var19.field3077 && (class38.field463 % 20) < 10) {
                                int var20;
                                if (var15.field4390 == -1) {
                                    var20 = var8.method1110(-25012) + 15;
                                } else {
                                    var20 = var15.field4390 + 15;
                                }
                                class289.method2065(-3, arg1, arg3 >> 1, var20, var8, arg6 >> 1, arg0);
                                if (class242.field3642 > -1) {
                                    class141.field1970[var19.field3075].method531(class242.field3642 + arg5 - 12, arg4 + -28 + field722);
                                }
                            }
                        }
                    } else {
                        int var10 = 30;
                        class109 var11 = (class109) var8;
                        if (var11.field1518 != -1 || var11.field1512 != -1) {
                            class289.method2065(-3, arg1, arg3 >> 1, var8.method1110(-25012) + 15, var8, arg6 >> 1, arg0);
                            if (class242.field3642 > -1) {
                                if (var11.field1518 != -1) {
                                    class315.field4859[var11.field1518].method531(class242.field3642 + arg5 - 12, field722 + arg4 + -var10);
                                    var10 += 25;
                                }
                                if (var11.field1512 != -1) {
                                    class48.field562[var11.field1512].method531(class242.field3642 + arg5 - 12, arg4 - var10 + field722);
                                    var10 += 25;
                                }
                            }
                        }
                        if (var7 >= 0) {
                            class219[] var12 = class167.field2328;
                            for (int var13 = 0; var13 < var12.length; var13++) {
                                class219 var14 = var12[var13];
                                if (var14 != null && var14.field3079 == 10 && class180.field2612[var7] == var14.field3077) {
                                    class289.method2065(-3, arg1, arg3 >> 1, var8.method1110(-25012) + 15, var8, arg6 >> 1, arg0);
                                    if (class242.field3642 > -1) {
                                        class141.field1970[var14.field3075].method531(arg5 + class242.field3642 - 12, -var10 + field722 + arg4);
                                    }
                                }
                            }
                        }
                    }
                    if (var8.field2373 != null && (class204.field2864 <= var7 || class68.field898 == 0 || class68.field898 == 3 || class68.field898 == 1 && class58.method337(((class109) var8).field1496, -86))) {
                        class289.method2065(-3, arg1, arg3 >> 1, var8.method1110(arg2 - 352692), var8, arg6 >> 1, arg0);
                        if (class242.field3642 > -1 && class40.field481 < class164.field2270) {
                            class164.field2272[class40.field481] = class88.field1097.method80(var8.field2373) / 2;
                            class164.field2268[class40.field481] = class88.field1097.field159;
                            class164.field2265[class40.field481] = class242.field3642;
                            class164.field2267[class40.field481] = field722;
                            class164.field2269[class40.field481] = var8.field2400;
                            class164.field2263[class40.field481] = var8.field2409;
                            class164.field2266[class40.field481] = var8.field2437;
                            class164.field2264[class40.field481] = var8.field2373;
                            class40.field481++;
                        }
                    }
                    if (class38.field463 < var8.field2447) {
                        class91 var21 = class282.field4373[0];
                        class91 var22 = class282.field4373[1];
                        int var23;
                        if ((var8 instanceof class184)) {
                            class184 var24 = (class184) var8;
                            class91[] var25 = (class91[]) ((class91[]) class137.field1900.method1239((byte) -40, (long) var24.field2657.field4396));
                            if (var25 == null) {
                                var25 = class15.method105(0, class164.field2271, (byte) -44, var24.field2657.field4396);
                                if (var25 != null) {
                                    class137.field1900.method1243(var25, (long) var24.field2657.field4396, -29282);
                                }
                            }
                            class282 var26 = var24.field2657;
                            if (var25 != null && var25.length == 2) {
                                var22 = var25[1];
                                var21 = var25[0];
                            }
                            if (var26.field4390 == -1) {
                                var23 = var8.method1110(-25012);
                            } else {
                                var23 = var26.field4390;
                            }
                        } else {
                            var23 = var8.method1110(-25012);
                        }
                        class289.method2065(-3, arg1, arg3 >> 1, var21.field1144 + var23 + 10, var8, arg6 >> 1, arg0);
                        if (class242.field3642 > -1) {
                            int var27 = arg4 + field722 - 3;
                            int var28 = class242.field3642 + arg5 - (var21.field1136 >> 1);
                            var21.method531(var28, var27);
                            int var29 = var8.field2421 * var21.field1136 / 255;
                            int var30 = var21.field1144;
                            if (class250.field3787) {
                                class306.method2150(var28, var27, var28 + var29, var27 + var30);
                            } else {
                                class144.method967(var28, var27, var28 + var29, var27 + var30);
                            }
                            var22.method531(var28, var27);
                            if (class250.field3787) {
                                class306.method2149(arg5, arg4, arg5 + arg3, arg4 + arg6);
                            } else {
                                class144.method972(arg5, arg4, arg3 + arg5, arg4 + arg6);
                            }
                        }
                    }
                    for (int var31 = 0; var31 < 4; var31++) {
                        if (class38.field463 < var8.field2374[var31]) {
                            int var34;
                            if (var8 instanceof class184) {
                                class184 var32 = (class184) var8;
                                class282 var33 = var32.field2657;
                                if (var33.field4390 == -1) {
                                    var34 = var8.method1110(-25012) / 2;
                                } else {
                                    var34 = var33.field4390 / 2;
                                }
                            } else {
                                var34 = var8.method1110(-25012) / 2;
                            }
                            class289.method2065(-3, arg1, arg3 >> 1, var34, var8, arg6 >> 1, arg0);
                            if (class242.field3642 > -1) {
                                if (var31 == 1) {
                                    field722 -= 20;
                                }
                                if (var31 == 2) {
                                    field722 -= 10;
                                    class242.field3642 -= 15;
                                }
                                if (var31 == 3) {
                                    field722 -= 10;
                                    class242.field3642 += 15;
                                }
                                class38.field458[var8.field2367[var31]].method531(arg5 + class242.field3642 - 12, arg4 - -field722 + -12);
                                class276.field4292.method64(Integer.toString(var8.field2446[var31]), class242.field3642 + arg5 - 1, arg4 + 3 + field722, 16777215, 0);
                            }
                        }
                    }
                }
            }
            var7++;
        }
        for (int var35 = 0; var35 < class40.field481; var35++) {
            int var36 = class164.field2265[var35];
            int var37 = class164.field2267[var35];
            int var38 = class164.field2272[var35];
            int var39 = class164.field2268[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var37 + 2) > (class164.field2267[var41] - class164.field2268[var41]) && (var37 - var39) < (class164.field2267[var41] + 2) && (var36 - var38) < (class164.field2272[var41] + class164.field2265[var41]) && (var36 + var38) > (class164.field2265[var41] - class164.field2272[var41]) && var37 > (class164.field2267[var41] - class164.field2268[var41])) {
                        var37 = class164.field2267[var41] - class164.field2268[var41];
                        var40 = true;
                    }
                }
            }
            class242.field3642 = class164.field2265[var35];
            field722 = class164.field2267[var35] = var37;
            String var42 = class164.field2264[var35];
            if (class134.field1847 == 0) {
                int var43 = 16776960;
                if (class164.field2269[var35] < 6) {
                    var43 = class91.field1145[class164.field2269[var35]];
                }
                if (class164.field2269[var35] == 6) {
                    var43 = (class262.field3962 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class164.field2269[var35] == 7) {
                    var43 = class262.field3962 % 20 >= 10 ? 65535 : 255;
                }
                if (class164.field2269[var35] == 8) {
                    var43 = (class262.field3962 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class164.field2269[var35] == 9) {
                    int var44 = 150 - class164.field2266[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = ((var44 - 100) * 5) + 65280;
                    }
                }
                if (class164.field2269[var35] == 10) {
                    int var45 = 150 - class164.field2266[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 * 327680 - 16384000);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 - ((var45 - 100) * 5) - 32767745;
                    }
                }
                if (class164.field2269[var35] == 11) {
                    int var46 = 150 - class164.field2266[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 - 16318970;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class164.field2263[var35] == 0) {
                    class88.field1097.method64(var42, class242.field3642 + arg5, field722 + arg4, var43, 0);
                }
                if (class164.field2263[var35] == 1) {
                    class88.field1097.method65(var42, class242.field3642 + arg5, field722 + arg4, var43, 0, class262.field3962);
                }
                if (class164.field2263[var35] == 2) {
                    class88.field1097.method81(var42, class242.field3642 + arg5, arg4 - -field722, var43, 0, class262.field3962);
                }
                if (class164.field2263[var35] == 3) {
                    class88.field1097.method69(var42, class242.field3642 + arg5, field722 + arg4, var43, 0, class262.field3962, 150 - class164.field2266[var35]);
                }
                if (class164.field2263[var35] == 4) {
                    int var47 = (150 - class164.field2266[var35]) * (class88.field1097.method80(var42) + 100) / 150;
                    if (class250.field3787) {
                        class306.method2150(class242.field3642 + arg5 - 50, arg4, arg5 + class242.field3642 + 50, arg4 - -arg6);
                    } else {
                        class144.method967(class242.field3642 + arg5 - 50, arg4, class242.field3642 + arg5 + 50, arg4 + arg6);
                    }
                    class88.field1097.method58(var42, arg5 + class242.field3642 + 50 - var47, field722 + arg4, var43, 0);
                    if (class250.field3787) {
                        class306.method2149(arg5, arg4, arg5 + arg3, arg4 - -arg6);
                    } else {
                        class144.method972(arg5, arg4, arg3 + arg5, arg4 + arg6);
                    }
                }
                if (class164.field2263[var35] == 5) {
                    int var48 = 150 - class164.field2266[var35];
                    if (class250.field3787) {
                        class306.method2150(arg5, arg4 - (1 - field722) - class88.field1097.field159, arg5 - -arg3, field722 + arg4 + 5);
                    } else {
                        class144.method967(arg5, field722 + arg4 - class88.field1097.field159 - 1, arg3 + arg5, field722 + arg4 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class88.field1097.method64(var42, class242.field3642 + arg5, field722 + var49 + arg4, var43, 0);
                    if (class250.field3787) {
                        class306.method2149(arg5, arg4, arg3 + arg5, arg4 + arg6);
                    } else {
                        class144.method972(arg5, arg4, arg3 + arg5, arg4 - -arg6);
                    }
                }
            } else {
                class88.field1097.method64(var42, class242.field3642 + arg5, field722 + arg4, 16776960, 0);
            }
        }
        field713++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lp;II)V", line = 534)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            method344(59);
        }
        if (arg1 == 0) {
            this.field721 = arg0.method661(-1);
            this.field720 = new int[arg0.method661(-1)][2];
            for (int var4 = 0; var4 < this.field720.length; var4++) {
                this.field720[var4][0] = arg0.method624(14612);
                this.field720[var4][1] = arg0.method624(14612);
            }
        }
        field707++;
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V", line = 561)
    public static void method344(int arg0) {
        int var1 = -40 / ((arg0 - 56) / 54);
        field723 = null;
        field711 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)[I", line = 572)
    public final int[] method126(byte arg0, int arg1) {
        field709++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -80, 0, arg1);
            for (int var5 = 0; var5 < class10.field141; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field712[var6];
            }
        }
        if (arg0 <= 100) {
            this.method348(24);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLhc;)V", line = 615)
    public static final void method345(byte arg0, class184 arg1) {
        field715++;
        for (class298 var2 = (class298) class299.field4667.method2331((byte) 15); var2 != null; var2 = (class298) class299.field4667.method2332(-114)) {
            if (var2.field4656 == arg1) {
                if (var2.field4650 != null) {
                    class19.field255.method27(var2.field4650);
                    var2.field4650 = null;
                }
                var2.method2285(true);
                return;
            }
        }
        if (arg0 != 121) {
            field723 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IB)[I", line = 656)
    private final int[] method346(int arg0, byte arg1) {
        if (arg1 >= -56) {
            this.method130(false);
        }
        field710++;
        if (arg0 >= 0) {
            return this.field720.length <= arg0 ? this.field719 : this.field720[arg0];
        } else {
            return this.field717;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)Z", line = 677)
    public static final boolean method347(int arg0, int arg1) {
        field714++;
        byte var2 = 0;
        byte var3 = 0;
        if (class337.field5214 == null) {
            if (class250.field3787 || class191.field2730 == null) {
                class337.field5214 = new class189(512, 512);
            } else {
                class337.field5214 = (class189) class191.field2730;
            }
            int[] var4 = class337.field5214.field2717;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (103 - var3); var7++) {
                int var8 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var2 + 1; var9 < 104 - var2 - 1; var9++) {
                    if ((class264.field4163[arg0][var9][var7] & 0x18) == 0) {
                        class321.method2237(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class264.field4163[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class321.method2237(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class284.field4455 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class208.method1431(class138.field1940, var10 + var2, var3 + var11);
                    if (var12 != 0L) {
                        class238 var14 = class142.method951(Integer.MAX_VALUE & (int) (var12 >>> 32), 26915);
                        int var15 = var14.field3547;
                        if (var14.field3525 != null) {
                            for (int var16 = 0; var16 < var14.field3525.length; var16++) {
                                if (var14.field3525[var16] != -1) {
                                    class238 var17 = class142.method951(var14.field3525[var16], 26915);
                                    if (var17.field3547 >= 0) {
                                        var15 = var17.field3547;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var3 + var11;
                            int var19 = var2 + var10;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class149.field2072[class138.field1940].field282;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var19 > 0 && var19 > var10 - 3 && (var20[var19 - 1][var18] & 0x2C0108) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 1 && var19 < 103 && var19 < (var10 + 3) && (var20[var19 + 1][var18] & 0x2C0180) == 0) {
                                        var19++;
                                    }
                                    if (var22 == 2 && var18 > 0 && (var11 - 3) < var18 && (var20[var19][var18 - 1] & 0x2C0102) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 3 && var18 < 103 && (var11 + 3) > var18 && (var20[var19][var18 + 1] & 0x2C0120) == 0) {
                                        var18++;
                                    }
                                }
                            }
                            class137.field1918[class284.field4455] = var14.field3548;
                            class318.field4887[class284.field4455] = var19 - var2;
                            class232.field3394[class284.field4455] = var18 - var3;
                            class284.field4455++;
                        }
                    }
                }
            }
        }
        class337.field5214.method1306();
        int var23 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
        int var24 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class264.field4163[arg0][var2 + var26][var25 + var3] & 0x18) == 0 && !class150.method1008(var23, var3, var26, -18058, var2, var25, var24, arg0)) {
                    if (class250.field3787) {
                        class144.field2005 = null;
                    } else {
                        class72.field916.method904((byte) -28);
                    }
                    return false;
                }
                if (arg0 < 3 && (class264.field4163[arg0 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class150.method1008(var23, var3, var26, -18058, var2, var25, var24, arg0 + 1)) {
                    if (class250.field3787) {
                        class144.field2005 = null;
                    } else {
                        class72.field916.method904((byte) -28);
                    }
                    return false;
                }
            }
        }
        if (class250.field3787) {
            int[] var27 = class337.field5214.field2717;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class191.field2730 = new class202(class337.field5214);
        } else {
            class191.field2730 = class337.field5214;
        }
        int var30 = 114 / ((arg1 + 55) / 58);
        if (class250.field3787) {
            class144.field2005 = null;
        } else {
            class72.field916.method904((byte) -28);
        }
        class337.field5214 = null;
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V", line = 915)
    private final void method348(int arg0) {
        field708++;
        int var2 = this.field721;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field720.length - 1 > var22 && this.field720[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field720[var22];
                int[] var24 = this.field720[var22 - 1];
                int var25 = this.method346(var22 - 2, (byte) -114)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method346(var22 + 1, (byte) -78)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 + var26 - var27 - var25;
                int var33 = var27 - var25;
                int var34 = (var29 * var31 >> 12) * var30 >> 12;
                int var35 = var25 - var26 - var31;
                int var36 = var30 * var35 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var34 + var36 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field712[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field720.length - 1) && this.field720[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field720[var5];
                int[] var7 = this.field720[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - class276.field4298[(var8 & 0x1FFC) >> 5] >> 1;
                int var10 = 4096 - var9;
                int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field712[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; var14 < (this.field720.length - 1) && this.field720[var14][0] <= var13; var14++) {
                }
                int[] var15 = this.field720[var14 - 1];
                int[] var16 = this.field720[var14];
                int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var18 + (var16[1] * var17) >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field712[var12] = (short) var19;
            }
        }
        if (arg0 >= -38) {
            this.method130(true);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V", line = 1096)
    public final void method130(boolean arg0) {
        if (arg0) {
            method341(-52, -41);
        }
        if (this.field720 == null) {
            this.field720 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field724++;
        if (this.field720.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field721 == 2) {
            this.method349(0);
        }
        class78.method462(-1);
        this.method348(-120);
    }

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V", line = 1126)
    private final void method349(int arg0) {
        field718++;
        int[] var2 = this.field720[0];
        int[] var3 = this.field720[1];
        int[] var4 = this.field720[this.field720.length - 2];
        int[] var5 = this.field720[this.field720.length - 1];
        this.field717 = new int[] { var2[0] - (var3[arg0] - var2[0]), var2[1] - (var3[1] - var2[1]) };
        this.field719 = new int[] { var4[0] + var4[0] - var5[0], var4[1] - (var5[1] + -var4[1]) };
    }
}
