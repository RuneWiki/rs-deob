import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 extends class249 {

    @OriginalMember(owner = "client!se", name = "Bc", descriptor = "Z")
    public boolean field153 = false;

    @OriginalMember(owner = "client!se", name = "Lc", descriptor = "I")
    public int field163 = 0;

    @OriginalMember(owner = "client!se", name = "Nc", descriptor = "I")
    public int field165 = -1;

    @OriginalMember(owner = "client!se", name = "Oc", descriptor = "I")
    private int field166 = 0;

    @OriginalMember(owner = "client!se", name = "Kc", descriptor = "I")
    public int field162 = -1;

    @OriginalMember(owner = "client!se", name = "Jc", descriptor = "I")
    public int field161 = -1;

    @OriginalMember(owner = "client!se", name = "Sc", descriptor = "I")
    public int field170 = 0;

    @OriginalMember(owner = "client!se", name = "Mc", descriptor = "I")
    public int field164 = -1;

    @OriginalMember(owner = "client!se", name = "Vc", descriptor = "I")
    public int field173 = -1;

    @OriginalMember(owner = "client!se", name = "Xc", descriptor = "I")
    public int field175 = 0;

    @OriginalMember(owner = "client!se", name = "bd", descriptor = "I")
    public int field179 = 0;

    @OriginalMember(owner = "client!se", name = "Gc", descriptor = "I")
    public int field158 = -1;

    @OriginalMember(owner = "client!se", name = "yc", descriptor = "I")
    public int field150 = 0;

    @OriginalMember(owner = "client!se", name = "Pc", descriptor = "I")
    public int field167 = -1;

    @OriginalMember(owner = "client!se", name = "Dc", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!se", name = "Rc", descriptor = "[I")
    public static int[] field169 = new int[99];

    @OriginalMember(owner = "client!se", name = "Qc", descriptor = "Lwm;")
    public static class152 field168 = class157.method1048("cross", 96);

    @OriginalMember(owner = "client!se", name = "ad", descriptor = "[I")
    public static int[] field178;

    @OriginalMember(owner = "client!se", name = "cd", descriptor = "Lwm;")
    public static class152 field180;

    @OriginalMember(owner = "client!se", name = "vc", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!se", name = "wc", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!se", name = "xc", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!se", name = "zc", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!se", name = "Ac", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!se", name = "Cc", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!se", name = "Ec", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!se", name = "Fc", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!se", name = "Hc", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!se", name = "Ic", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!se", name = "Tc", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!se", name = "Uc", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!se", name = "Wc", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!se", name = "Yc", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!se", name = "uc", descriptor = "Lwm;")
    public class152 field146;

    @OriginalMember(owner = "client!se", name = "Zc", descriptor = "Lgh;")
    public class227 field177;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBLw;III)Lw;", line = 7)
    private static final class271 method59(int arg0, int arg1, byte arg2, class271 arg3, int arg4, int arg5, int arg6) {
        field151++;
        long var7 = (long) arg5;
        class271 var9 = (class271) class284.field4831.method1620(true, var7);
        if (arg2 > -55) {
            return (class271) null;
        }
        if (var9 == null) {
            class220 var10 = class220.method1514(class201.field3236, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1521(64, 768, -50, -10, -50);
            class284.field4831.method1614(var9, var7, (byte) 78);
        }
        int var11 = arg3.method147();
        int var12 = arg3.method149();
        int var13 = arg3.method164();
        int var14 = arg3.method154();
        class271 var15 = var9.method140(true, true, true);
        if (arg1 != 0) {
            var15.method137(arg1);
        }
        if (class217.field3516) {
            class319 var18 = (class319) var15;
            if (class154.method1031(118, arg0 + var11, class23.field400, arg4 + var13) != arg6 || class154.method1031(56, arg0 + var12, class23.field400, arg4 + var14) != arg6) {
                for (int var19 = 0; var19 < var18.field5524; var19++) {
                    var18.field5520[var19] += class154.method1031(96, var18.field5510[var19] + arg0, class23.field400, var18.field5534[var19] + arg4) - arg6;
                }
                var18.field5536.field1499 = false;
                var18.field5544.field4423 = false;
            }
        } else {
            class21 var16 = (class21) var15;
            if (arg6 != class154.method1031(51, arg0 + var11, class23.field400, arg4 + var13) || arg6 != class154.method1031(109, arg0 + var12, class23.field400, arg4 + var14)) {
                for (int var17 = 0; var17 < var16.field281; var17++) {
                    var16.field297[var17] += class154.method1031(97, var16.field285[var17] + arg0, class23.field400, var16.field293[var17] + arg4) - arg6;
                }
                var16.field302 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIZ)V", line = 85)
    public final void method60(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != 3) {
            field168 = (class152) null;
        }
        super.method1711(this.method67(-4391), arg3, arg2, (byte) -108, arg1);
        field148++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILoe;I)V", line = 97)
    public static final void method61(int arg0, int arg1, int arg2, class127 arg3, int arg4) {
        class234.method1609(-128);
        field149++;
        if (class217.field3516) {
            class13.method76(arg0, arg1, arg3.field1876 + arg0, arg3.field1921 + arg1);
        } else {
            class96.method634(arg0, arg1, arg3.field1876 + arg0, arg3.field1921 + arg1);
        }
        if (class8.field111 != 2 && class8.field111 != 5 && class251.field4292 != null) {
            int var5 = class272.field4645 + class202.field3262 & 0x7FF;
            int var6 = class85.field1176.field4162 / 32 + 48;
            int var7 = 464 - class85.field1176.field4231 / 32;
            if (class217.field3516) {
                ((class68) class251.field4292).method440(arg0, arg1, arg3.field1876, arg3.field1921, var6, var7, var5, class130.field1980 + 256, (class68) arg3.method818(-1, false));
            } else {
                ((class109) class251.field4292).method519(arg0, arg1, arg3.field1876, arg3.field1921, var6, var7, var5, class130.field1980 + 256, arg3.field1776, arg3.field1825);
            }
            if (class201.field3247 != null) {
                for (int var8 = 0; var8 < class201.field3247.field4773; var8++) {
                    if (class201.field3247.method1903(var8, (byte) -62)) {
                        int var9 = (class201.field3247.field4774[var8] - class272.field4670) * 4 + 2 - (class85.field1176.field4162 / 32);
                        int var10 = class181.field2884[var5];
                        int var11 = var10 * 256 / (class130.field1980 + 256);
                        int var12 = (class201.field3247.field4768[var8] - class199.field3226) * 4 + (2 - class85.field1176.field4231 / 32);
                        int var13 = class181.field2886[var5];
                        int var14 = var13 * 256 / (class130.field1980 + 256);
                        int var15 = var9 * var14 + var11 * var12 >> 16;
                        int var16 = var12 * var14 - (var9 * var11) >> 16;
                        class171 var17 = class303.field5220;
                        if (class201.field3247.method1899(true, var8) == 1) {
                            var17 = class305.field5238;
                        }
                        if (class201.field3247.method1899(true, var8) == 2) {
                            var17 = class316.field5485;
                        }
                        int var18 = var17.method1141(class201.field3247.field4766[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg3.field1876 <= var19 && arg3.field1876 >= var19 && var16 >= (-arg3.field1921) && var16 <= arg3.field1921) {
                            int var20 = 16777215;
                            if (class201.field3247.field4764[var8] != -1) {
                                var20 = class201.field3247.field4764[var8];
                            }
                            if (class217.field3516) {
                                class13.method69((class68) arg3.method818(-1, false));
                            } else {
                                class96.method646(arg3.field1776, arg3.field1825);
                            }
                            var17.method1138(class201.field3247.field4766[var8], arg3.field1876 / 2 + var19 + arg0, arg3.field1921 / 2 + arg1 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class217.field3516) {
                                class13.method71();
                            } else {
                                class96.method637();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class236.field3868; var21++) {
                int var22 = class128.field1953[var21] * 4 + 2 - (class85.field1176.field4162 / 32);
                int var23 = class154.field2451[var21] * 4 + 2 - (class85.field1176.field4231 / 32);
                class270 var24 = class242.method1656(class200.field3234[var21], true);
                if (var24.field4592 != null) {
                    var24 = var24.method1845(true);
                    if (var24 == null || var24.field4606 == -1) {
                        continue;
                    }
                }
                class83.method538(arg0, class33.field543[var24.field4606], var23, (byte) -109, arg3, arg1, var22);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class183 var27 = class205.field3353[class23.field400][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - (class85.field1176.field4231 / 32);
                        int var29 = var25 * 4 + 2 - (class85.field1176.field4162 / 32);
                        class83.method538(arg0, class203.field3277[0], var28, (byte) -60, arg3, arg1, var29);
                    }
                }
            }
            for (int var30 = 0; var30 < class233.field3826; var30++) {
                class4 var31 = class40.field649[class97.field1403[var30]];
                if (var31 != null && var31.method18(-120)) {
                    class242 var32 = var31.field72;
                    if (var32 != null && var32.field4011 != null) {
                        var32 = var32.method1650(4);
                    }
                    if (var32 != null && var32.field3981 && var32.field4005) {
                        int var33 = var31.field4162 / 32 - (class85.field1176.field4162 / 32);
                        int var34 = var31.field4231 / 32 - (class85.field1176.field4231 / 32);
                        if (var32.field4010 == -1) {
                            class83.method538(arg0, class203.field3277[1], var34, (byte) -126, arg3, arg1, var33);
                        } else {
                            class83.method538(arg0, class33.field543[var32.field4010], var34, (byte) 123, arg3, arg1, var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class194.field3114; var35++) {
                class12 var36 = class22.field380[class325.field5670[var35]];
                if (var36 != null && var36.method18(78)) {
                    int var37 = var36.field4162 / 32 - (class85.field1176.field4162 / 32);
                    int var38 = var36.field4231 / 32 - (class85.field1176.field4231 / 32);
                    boolean var39 = false;
                    long var40 = var36.field146.method1013(-18674);
                    for (int var42 = 0; var42 < class199.field3206; var42++) {
                        if (class317.field5504[var42] == var40 && class179.field2863[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class167.field2631; var44++) {
                        if (class225.field3656[var44].field4689 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class85.field1176.field163 != 0 && var36.field163 != 0 && class85.field1176.field163 == var36.field163) {
                        var45 = true;
                    }
                    if (var39) {
                        class83.method538(arg0, class203.field3277[3], var38, (byte) 126, arg3, arg1, var37);
                    } else if (var43) {
                        class83.method538(arg0, class203.field3277[5], var38, (byte) 112, arg3, arg1, var37);
                    } else if (var45) {
                        class83.method538(arg0, class203.field3277[4], var38, (byte) -101, arg3, arg1, var37);
                    } else {
                        class83.method538(arg0, class203.field3277[2], var38, (byte) 75, arg3, arg1, var37);
                    }
                }
            }
            class268[] var46 = class194.field3094;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class268 var48 = var46[var47];
                if (var48 != null && var48.field4508 != 0 && (class142.field2187 % 20) < 10) {
                    if (var48.field4508 == 1 && var48.field4513 >= 0 && var48.field4513 < class40.field649.length) {
                        class4 var49 = class40.field649[var48.field4513];
                        if (var49 != null) {
                            int var50 = var49.field4162 / 32 - (class85.field1176.field4162 / 32);
                            int var51 = var49.field4231 / 32 - (class85.field1176.field4231 / 32);
                            class184.method1227(var51, arg1, arg0, arg3, var50, var48.field4511, (byte) -100);
                        }
                    }
                    if (var48.field4508 == 2) {
                        int var52 = (var48.field4510 - class272.field4670) * 4 + 2 - class85.field1176.field4162 / 32;
                        int var53 = (var48.field4506 - class199.field3226) * 4 + 2 - (class85.field1176.field4231 / 32);
                        class184.method1227(var53, arg1, arg0, arg3, var52, var48.field4511, (byte) -100);
                    }
                    if (var48.field4508 == 10 && var48.field4513 >= 0 && class22.field380.length > var48.field4513) {
                        class12 var54 = class22.field380[var48.field4513];
                        if (var54 != null) {
                            int var55 = var54.field4231 / 32 - class85.field1176.field4231 / 32;
                            int var56 = var54.field4162 / 32 - class85.field1176.field4162 / 32;
                            class184.method1227(var55, arg1, arg0, arg3, var56, var48.field4511, (byte) -100);
                        }
                    }
                }
            }
            if (class84.field1166 != 0) {
                int var57 = class84.field1166 * 4 + 2 - (class85.field1176.field4162 / 32);
                int var58 = class278.field4762 * 4 + 2 - class85.field1176.field4231 / 32;
                class83.method538(arg0, class169.field2642, var58, (byte) -54, arg3, arg1, var57);
            }
            if (class217.field3516) {
                class13.method78(arg3.field1876 / 2 + arg0 - 1, arg3.field1921 / 2 + arg1 + -1, 3, 3, 16777215);
            } else {
                class96.method635(arg0 + (arg3.field1876 / 2) - 1, arg3.field1921 / 2 + arg1 + -1, 3, 3, 16777215);
            }
        } else if (class217.field3516) {
            class203 var59 = arg3.method818(-1, false);
            if (var59 != null) {
                var59.method429(arg0, arg1);
            }
        } else {
            class96.method632(arg0, arg1, 0, arg3.field1776, arg3.field1825);
        }
        class206.field3360[arg2] = true;
        int var60 = -32 / ((arg4 - 70) / 40);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V", line = 445)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field171++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()I", line = 464)
    public final int method22() {
        field156++;
        return this.field4198;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 475)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field152++;
        if (this.field177 == null) {
            return;
        }
        class141 var13 = this.field4240 != -1 && this.field4216 == 0 ? class133.method851(this.field4240, 108) : null;
        class141 var14 = this.field4224 == -1 || this.field153 || this.field4224 == this.method1706((byte) 84).field4310 && var13 != null ? null : class133.method851(this.field4224, -79);
        class271 var15 = this.field177.method1568(this.field4218, this.field4174, this.field4258, var13, this.field4183, var14, this.field4163, true, false, this.field4199, this.field4257);
        int var16 = class87.method576(true);
        if (class217.field3516 && class6.field96 < 96 && var16 > 50) {
            class116.method764(true);
        }
        if (class128.field1960 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class28.field488) {
                class211.field3430[class28.field488] = new byte[102400];
                class28.field488++;
            }
            while (class28.field488 > var17) {
                class28.field488--;
                class211.field3430[class28.field488] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4198 = var15.method22();
        if (class33.field539 && (this.field177.field3688 == -1 || class98.method659(255, this.field177.field3688).field4012)) {
            class271 var18 = class305.method2129(0, this.field4231, 240, var14 == null ? this.field4258 : this.field4183, this.field4185, this.field4162, var14 == null ? var13 : var14, arg0, var15, 160, 1, 0, this.field4236, 0);
            if (class217.field3516) {
                float var19 = class217.method1466();
                float var20 = class217.method1489();
                class217.method1479();
                class217.method1465(var19, var20 - 150.0F);
                var18.method21(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class47) null);
                class217.method1461();
                class217.method1465(var19, var20);
            } else {
                var18.method21(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class47) null);
            }
        }
        if (class85.field1176 == this) {
            for (int var21 = class194.field3094.length - 1; var21 >= 0; var21--) {
                class268 var22 = class194.field3094[var21];
                if (var22 != null && var22.field4507 != -1) {
                    if (var22.field4508 == 1 && var22.field4513 >= 0 && var22.field4513 < class40.field649.length) {
                        class4 var23 = class40.field649[var22.field4513];
                        if (var23 != null) {
                            int var24 = var23.field4162 / 32 - (class85.field1176.field4162 / 32);
                            int var25 = var23.field4231 / 32 - (class85.field1176.field4231 / 32);
                            this.method66(var24, arg7, arg1, arg3, var15, arg9, var25, arg0, var22.field4507, arg2, arg5, -122, arg4, arg6, (class47) null);
                        }
                    }
                    if (var22.field4508 == 2) {
                        int var26 = (var22.field4510 - class272.field4670) * 4 + 2 - class85.field1176.field4162 / 32;
                        int var27 = (var22.field4506 - class199.field3226) * 4 + 2 - (class85.field1176.field4231 / 32);
                        this.method66(var26, arg7, arg1, arg3, var15, arg9, var27, arg0, var22.field4507, arg2, arg5, -28, arg4, arg6, (class47) null);
                    }
                    if (var22.field4508 == 10 && var22.field4513 >= 0 && var22.field4513 < class22.field380.length) {
                        class12 var28 = class22.field380[var22.field4513];
                        if (var28 != null) {
                            int var29 = var28.field4162 / 32 - (class85.field1176.field4162 / 32);
                            int var30 = var28.field4231 / 32 - (class85.field1176.field4231 / 32);
                            this.method66(var29, arg7, arg1, arg3, var15, arg9, var30, arg0, var22.field4507, arg2, arg5, -78, arg4, arg6, (class47) null);
                        }
                    }
                }
            }
        }
        this.method1707(var15, (byte) 117);
        this.method1705(22686, var15, arg0);
        class271 var31 = null;
        if (!this.field153 && this.field4182 != -1 && this.field4233 != -1) {
            class299 var32 = class189.method1255(this.field4182, (byte) 120);
            var31 = var32.method2093(-30505, this.field4242, this.field4196, this.field4233);
            if (var31 != null) {
                var31.method139(0, -this.field4205, 0);
                if (var32.field5168) {
                    if (class212.field3444 != 0) {
                        var31.method141(class212.field3444);
                    }
                    if (class108.field1551 != 0) {
                        var31.method148(class108.field1551);
                    }
                    if (class314.field5447 != 0) {
                        var31.method139(0, class314.field5447, 0);
                    }
                }
            }
        }
        class271 var33 = null;
        if (!this.field153 && this.field4222 != null) {
            if (class142.field2187 >= this.field4247) {
                this.field4222 = null;
            }
            if (this.field4264 <= class142.field2187 && this.field4247 > class142.field2187) {
                if ((this.field4222 instanceof class175)) {
                    var33 = (class271) ((class175) this.field4222).method1171(127);
                } else {
                    var33 = (class271) this.field4222;
                }
                var33.method139(this.field4223 - this.field4162, -this.field4185 + this.field4225, this.field4221 - this.field4231);
                if (this.field4209 == 512) {
                    var33.method132();
                } else if (this.field4209 == 1024) {
                    var33.method131();
                } else if (this.field4209 == 1536) {
                    var33.method161();
                }
            }
        }
        if (class217.field3516) {
            var15.field4630 = true;
            var15.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4175);
            if (var31 != null) {
                var31.field4630 = true;
                var31.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4175);
            }
        } else {
            if (var31 != null) {
                var15 = ((class21) var15).method155(var31);
            }
            if (var33 != null) {
                var15 = ((class21) var15).method155(var33);
            }
            var15.field4630 = true;
            var15.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4175);
        }
        if (var33 == null) {
            return;
        }
        if (this.field4209 == 512) {
            var33.method161();
        } else if (this.field4209 == 1024) {
            var33.method131();
        } else if (this.field4209 == 1536) {
            var33.method132();
        }
        var33.method139(this.field4162 - this.field4223, -this.field4225 + this.field4185, this.field4231 - this.field4221);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBLqc;I)V", line = 728)
    public static final void method62(int arg0, byte arg1, class4 arg2, int arg3) {
        if (arg2.field4240 == arg0 && arg0 != -1) {
            class141 var4 = class133.method851(arg0, 119);
            int var5 = var4.field2167;
            if (var5 == 1) {
                arg2.field4258 = 0;
                arg2.field4216 = arg3;
                arg2.field4226 = 0;
                arg2.field4174 = 1;
                arg2.field4257 = 0;
                class18.method114(arg2.field4162, arg2.field4258, arg2.field4231, var4, false, 28972);
            }
            if (var5 == 2) {
                arg2.field4226 = 0;
            }
        } else if (arg0 == -1 || arg2.field4240 == -1 || class133.method851(arg0, 118).field2152 >= class133.method851(arg2.field4240, -77).field2152) {
            arg2.field4216 = arg3;
            arg2.field4226 = 0;
            arg2.field4258 = 0;
            arg2.field4257 = 0;
            arg2.field4262 = arg2.field4180;
            arg2.field4240 = arg0;
            arg2.field4174 = 1;
            if (arg2.field4240 != -1) {
                class18.method114(arg2.field4162, arg2.field4258, arg2.field4231, class133.method851(arg2.field4240, 112), false, 28972);
            }
        }
        field154++;
        int var6 = -75 % ((-arg1 - 59) / 40);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLhi;)V", line = 784)
    public final void method63(byte arg0, class291 arg1) {
        arg1.field4946 = 0;
        int var3 = arg1.method2011(-93);
        field176++;
        int var4 = var3 & 0x1;
        boolean var5 = (var3 & 0x4) != 0;
        int var6 = super.method67(-4391);
        int var7 = -1;
        this.method1703(((var3 & 0x38) >> 3) + 1, 1159);
        int[] var8 = new int[12];
        this.field166 = var3 >> 6 & 0x3;
        this.field4162 += (this.method67(-4391) - var6) * 64;
        this.field4231 += (this.method67(-4391) - var6) * 64;
        this.field165 = arg1.method1962(false);
        this.field161 = arg1.method1962(false);
        this.field163 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method2011(-76);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method2011(-115);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method2021((byte) 74);
                    this.field163 = arg1.method2011(-55);
                    break;
                }
                if (var12 < 32768) {
                    var8[var9] = class72.method493(var12 - 256, Integer.MIN_VALUE);
                } else {
                    int var13 = class283.field4821[var12 - 32768];
                    var8[var9] = class72.method493(var13, 1073741824);
                    int var14 = class189.method1253((byte) 43, var13).field5372;
                    if (var14 != 0) {
                        this.field163 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        if (arg0 <= 81) {
            return;
        }
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method2011(-66);
            if (var17 < 0 || var17 >= class104.field1493[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4171 = arg1.method2021((byte) 74);
        long var18 = arg1.method1968(101);
        this.field146 = class160.method1077(64, var18).method1022(-117);
        this.field179 = arg1.method2011(-117);
        if (var5) {
            this.field170 = arg1.method2021((byte) 74);
            this.field173 = -1;
            this.field175 = this.field179;
        } else {
            this.field170 = 0;
            this.field175 = arg1.method2011(-42);
            this.field173 = arg1.method2011(-75);
            if (this.field173 == 255) {
                this.field173 = -1;
            }
        }
        int var20 = this.field150;
        this.field150 = arg1.method2011(-49);
        if (this.field150 == 0) {
            class42.method294(this, (byte) -99);
        } else {
            int var21 = this.field164;
            int var22 = this.field162;
            int var23 = this.field167;
            int var24 = this.field158;
            this.field167 = arg1.method2021((byte) 74);
            this.field162 = arg1.method2021((byte) 74);
            this.field164 = arg1.method2021((byte) 74);
            this.field158 = arg1.method2021((byte) 74);
            if (this.field150 != var20 || this.field167 != var23 || this.field162 != var22 || this.field164 != var21 || this.field158 != var24) {
                class92.method608(this, -68);
            }
        }
        if (this.field177 == null) {
            this.field177 = new class227();
        }
        int var25 = this.field177.field3688;
        this.field177.method1555(-124, this.field4171, var15, var4 == 1, var8, var7);
        if (var7 != var25) {
            this.field4162 = this.field4188[0] * 128 + (this.method67(-4391) * 64);
            this.field4231 = this.field4245[0] * 128 + (this.method67(-4391) * 64);
        }
        if (this.field4175 != null) {
            this.field4175.method326();
        }
    }

    @OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V", line = 939)
    protected final void finalize() {
        field147++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)I", line = 949)
    public final int method16(boolean arg0) {
        if (!arg0) {
            field169 = (int[]) null;
        }
        field159++;
        return this.field4171;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field169[var1] = var0 / 4;
        }
        field178 = new int[128];
        field180 = class157.method1048(" ", 122);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V", line = 973)
    public static void method64(byte arg0) {
        field168 = null;
        field178 = null;
        field180 = null;
        field169 = null;
        int var1 = -12 / ((55 - arg0) / 57);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)Lwm;", line = 988)
    public final class152 method65(boolean arg0) {
        if (arg0) {
            this.field177 = (class227) null;
        }
        class152 var2 = this.field146;
        if (class82.field1144 != null) {
            var2 = class195.method1307(new class152[] { class82.field1144[this.field166], var2 }, (byte) 29);
        }
        if (class163.field2580 != null) {
            var2 = class195.method1307(new class152[] { var2, class163.field2580[this.field166] }, (byte) 29);
        }
        field172++;
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z", line = 1026)
    public final boolean method18(int arg0) {
        field160++;
        int var2 = -91 % ((arg0 + 16) / 49);
        return this.field177 != null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILw;IIIIIIIIILmf;)V", line = 1040)
    private final void method66(int arg0, int arg1, int arg2, int arg3, class271 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class47 arg14) {
        field157++;
        int var16 = arg0 * arg0 + (arg6 * arg6);
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg0, (double) arg6) * 325.949D) & 0x7FF;
        class271 var18 = method59(this.field4162, var17, (byte) -70, arg4, this.field4231, arg8, this.field4185);
        if (arg11 >= -20) {
            this.method60(63, 110, 22, false);
        }
        if (var18 == null) {
            return;
        }
        if (!class217.field3516) {
            var18.method21(0, arg2, arg9, arg3, arg12, arg10, arg13, arg1, -1L, arg5, arg14);
            return;
        }
        float var19 = class217.method1466();
        float var20 = class217.method1489();
        class217.method1479();
        class217.method1465(var19, var20 - 150.0F);
        var18.method21(0, arg2, arg9, arg3, arg12, arg10, arg13, arg1, -1L, arg5, arg14);
        class217.method1461();
        class217.method1465(var19, var20);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I", line = 1152)
    public final int method67(int arg0) {
        if (arg0 != -4391) {
            field180 = (class152) null;
        }
        field174++;
        return this.field177 == null || this.field177.field3688 == -1 ? super.method67(-4391) : class98.method659(255, this.field177.field3688).field3984;
    }
}
