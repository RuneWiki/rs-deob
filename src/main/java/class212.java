import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class212 extends class233 {

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Z")
    public boolean field3201;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Z")
    public boolean field3190;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "[S")
    public short[] field3191;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field3196 = -1;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Les;")
    public static class441 field3183 = new class441("WTRC", 1);

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Lsh;")
    public static class472 field3202 = new class472(37, 8);

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field3194;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 11)
    public static void method1423(int arg0) {
        if (arg0 != 32277) {
            method1423(-5);
        }
        field3202 = null;
        field3183 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBZ)V", line = 33)
    public final void method1424(int arg0, byte arg1, boolean arg2) {
        ++field3193;
        int var6;
        if (!arg2) {
            int var4 = this.field3187 * arg0 / 50 + this.field3192 & 2047;
            int var5 = this.field3185;
            if (~var5 != -2) {
                if (var5 != 3) {
                    if (~var5 != -5) {
                        if (~var5 != -3) {
                            if (~var5 == -6) {
                                var6 = (var4 >= 1024 ? -var4 + 2048 : var4) << 1;
                            } else {
                                var6 = 2048;
                            }
                        } else {
                            var6 = var4;
                        }
                    } else {
                        var6 = var4 >> 10 << 11;
                    }
                } else {
                    var6 = client.field6676[var4] >> 1;
                }
            } else {
                var6 = (class172.field2450[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field3418 = (float) ((this.field3197 * var6 >> 11) + this.field3194) / 2048.0F;
        if (arg1 != 71) {
            this.method1429(false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI)I", line = 109)
    public static final int method1425(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3202 = null;
        }
        ++field3186;
        int var3 = arg0 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBIIIII)V", line = 122)
    public static final void method1426(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3189;
        int var8 = 6 / ((-44 - arg2) / 41);
        if (arg6 == arg7) {
            class382.method2329(arg0, arg3, arg1, arg4, arg5, (byte) 50, arg6);
        } else if (-arg6 + arg5 >= class293.field4420 && arg5 - -arg6 <= class119.field1643 && ~class176.field2503 >= ~(-arg7 + arg3) && ~(arg3 + arg7) >= ~class296.field4443) {
            class171.method1182(arg6, arg7, arg5, 107, arg1, arg3, arg0, arg4);
        } else {
            class315.method1944(arg6, (byte) -119, arg5, arg4, arg1, arg3, arg0, arg7);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIB)V", line = 145)
    public final void method1427(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3197 = arg1;
        this.field3194 = arg0;
        ++field3195;
        this.field3187 = arg3;
        this.field3185 = arg2;
        if (arg4 != 109) {
            this.field3201 = false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lgo;", line = 160)
    public static final class287 method1428(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5050;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 168)
    private final void method1429(boolean arg0) {
        ++field3198;
        int var2 = this.field3184;
        if (var2 != 2) {
            if (~var2 != -4) {
                if (~var2 != -5) {
                    if (var2 != 5) {
                        if (~var2 != -13) {
                            if (~var2 != -14) {
                                if (var2 != 10) {
                                    if (~var2 != -12) {
                                        if (var2 != 6) {
                                            if (var2 != 7) {
                                                if (~var2 != -9) {
                                                    if (var2 != 9) {
                                                        if (var2 != 14) {
                                                            if (~var2 != -16) {
                                                                if (var2 == 16) {
                                                                    this.field3197 = 256;
                                                                    this.field3187 = 8192;
                                                                    this.field3194 = 1792;
                                                                    this.field3185 = 1;
                                                                } else {
                                                                    this.field3197 = 2048;
                                                                    this.field3194 = 0;
                                                                    this.field3185 = 0;
                                                                    this.field3187 = 2048;
                                                                }
                                                            } else {
                                                                this.field3185 = 1;
                                                                this.field3197 = 512;
                                                                this.field3194 = 1536;
                                                                this.field3187 = 4096;
                                                            }
                                                        } else {
                                                            this.field3194 = 1280;
                                                            this.field3187 = 2048;
                                                            this.field3185 = 1;
                                                            this.field3197 = 768;
                                                        }
                                                    } else {
                                                        this.field3187 = 4096;
                                                        this.field3197 = 1024;
                                                        this.field3194 = 1024;
                                                        this.field3185 = 3;
                                                    }
                                                } else {
                                                    this.field3197 = 1024;
                                                    this.field3187 = 2048;
                                                    this.field3185 = 3;
                                                    this.field3194 = 1024;
                                                }
                                            } else {
                                                this.field3185 = 3;
                                                this.field3197 = 768;
                                                this.field3194 = 1280;
                                                this.field3187 = 4096;
                                            }
                                        } else {
                                            this.field3194 = 1280;
                                            this.field3185 = 3;
                                            this.field3187 = 2048;
                                            this.field3197 = 768;
                                        }
                                    } else {
                                        this.field3194 = 1536;
                                        this.field3185 = 3;
                                        this.field3187 = 4096;
                                        this.field3197 = 512;
                                    }
                                } else {
                                    this.field3197 = 512;
                                    this.field3185 = 3;
                                    this.field3194 = 1536;
                                    this.field3187 = 2048;
                                }
                            } else {
                                this.field3185 = 2;
                                this.field3187 = 8192;
                                this.field3197 = 2048;
                                this.field3194 = 0;
                            }
                        } else {
                            this.field3187 = 2048;
                            this.field3185 = 2;
                            this.field3194 = 0;
                            this.field3197 = 2048;
                        }
                    } else {
                        this.field3194 = 0;
                        this.field3185 = 4;
                        this.field3187 = 8192;
                        this.field3197 = 2048;
                    }
                } else {
                    this.field3187 = 2048;
                    this.field3194 = 0;
                    this.field3185 = 4;
                    this.field3197 = 2048;
                }
            } else {
                this.field3187 = 4096;
                this.field3194 = 0;
                this.field3185 = 1;
                this.field3197 = 2048;
            }
        } else {
            this.field3197 = 2048;
            this.field3187 = 2048;
            this.field3194 = 0;
            this.field3185 = 1;
        }
        if (!arg0) {
            this.method1427(-108, -44, -45, -5, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBIIII)V", line = 366)
    public static final void method1430(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3200;
        int var7 = class299.field4466;
        class123.field1690 = 0;
        int[] var8 = class161.field2218;
        for (int var9 = 0; ~var9 > ~(class256.field3797 + var7); ++var9) {
            class273 var32 = null;
            class309 var33;
            if (~var7 < ~var9) {
                var33 = class40.field565[var8[var9]];
            } else {
                var33 = class18.field241[class236.field3441[-var7 + var9]];
                var32 = ((class349) var33).field5309;
                if (var32.field4107 != null) {
                    var32 = var32.method1781(class315.field4736, true);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (~var33.field4592 <= -1 && (class281.field4249 == var33.field4653 || ~class472.field6622.field4545 == ~var33.field4545)) {
                class200.method1355(arg3 >> 1, arg4, var33.method1916((byte) -46), arg5, arg1 >> 1, (byte) 24, var33);
                if (~class429.field6114[0] <= -1) {
                    if (var33.field4641 != null && (var7 <= var9 || ~class27.field358 == -1 || class27.field358 == 3 || class27.field358 == 1 && class45.method326(((class257) var33).field3839, 115)) && ~class123.field1690 > ~class281.field4253) {
                        class281.field4255[class123.field1690] = class131.field1828.method3(var33.field4641, (byte) 92) / 2;
                        class281.field4250[class123.field1690] = class429.field6114[0];
                        class281.field4248[class123.field1690] = class429.field6114[1];
                        class281.field4254[class123.field1690] = var33.field4655;
                        class281.field4246[class123.field1690] = var33.field4594;
                        class281.field4247[class123.field1690] = var33.field4605;
                        class281.field4251[class123.field1690] = var33.field4641;
                        ++class123.field1690;
                    }
                    class319 var34 = class32.field423[0];
                    int var35 = arg0 - (-class429.field6114[1] + Math.max(class131.field1828.field16, var34.method796()));
                    if (!var33.field4644 && var33.field4630 > class452.field6418) {
                        class319 var36 = class32.field423[1];
                        boolean var37 = true;
                        int var38;
                        if (var33 instanceof class349) {
                            var38 = var32.field4123;
                            if (~var38 == 0) {
                                var38 = var33.method1917(0).field4809;
                            }
                        } else {
                            var38 = var33.method1917(0).field4809;
                        }
                        if (~var38 != 0) {
                            class319[] var39 = (class319[]) class2.field40.method2393(-119, (long) var38);
                            if (var39 == null) {
                                class368[] var40 = class368.method2274(class425.field6075, var38, 0);
                                if (var40 != null) {
                                    var39 = new class319[var40.length];
                                    for (int var41 = 0; var40.length > var41; ++var41) {
                                        var39[var41] = class138.field1976.method547(var40[var41], true);
                                    }
                                    class2.field40.method2395(0, var39, (long) var38);
                                }
                            }
                            if (var39 != null && ~var39.length == -3) {
                                var34 = var39[0];
                                var36 = var39[1];
                            }
                        }
                        int var42 = arg6 - -class429.field6114[0] - (var34.method798() >> 1);
                        var34.method1958(var42, var35);
                        int var43 = var34.method798() * var33.field4643 / 255;
                        if (~var33.field4643 < -1 && ~var43 > -3) {
                            var43 = 2;
                        }
                        class138.field1976.method572(var42, var35, var42 - -var43, var35 + var34.method796());
                        var36.method1958(var42, var35);
                        class138.field1976.method500(arg6, arg0, arg1 + arg6, arg0 + arg3);
                    }
                    var35 -= 2;
                    if (!var33.field4644) {
                        if (class452.field6418 < var33.field4623) {
                            class319 var44 = class436.field6167[!var33.field4598 ? 0 : 2];
                            class319 var45 = class436.field6167[var33.field4598 ? 3 : 1];
                            boolean var46 = true;
                            int var47;
                            if (!(var33 instanceof class349)) {
                                var47 = var33.method1917(0).field4820;
                            } else {
                                var47 = var32.field4146;
                                if (~var47 == 0) {
                                    var47 = var33.method1917(arg2 ^ 99).field4820;
                                }
                            }
                            if (~var47 != 0) {
                                class319[] var48 = (class319[]) class256.field3794.method2393(-123, (long) var47);
                                if (var48 == null) {
                                    class368[] var49 = class368.method2274(class425.field6075, var47, 0);
                                    if (var49 != null) {
                                        var48 = new class319[var49.length];
                                        for (int var50 = 0; var49.length > var50; ++var50) {
                                            var48[var50] = class138.field1976.method547(var49[var50], true);
                                        }
                                        class256.field3794.method2395(0, var48, (long) var47);
                                    }
                                }
                                if (var48 != null && ~var48.length == -5) {
                                    var44 = var48[!var33.field4598 ? 0 : 2];
                                    var45 = var48[!var33.field4598 ? 1 : 3];
                                }
                            }
                            int var51 = -class452.field6418 + var33.field4623;
                            int var54;
                            if (~var33.field4665 > ~var51) {
                                int var52 = var51 - var33.field4665;
                                int var53 = var33.field4639 != 0 ? (-var52 + var33.field4664) / var33.field4639 * var33.field4639 : 0;
                                var54 = var44.method798() * var53 / var33.field4664;
                            } else {
                                var54 = var44.method798();
                            }
                            int var55 = var44.method796();
                            var35 -= var55;
                            int var56 = arg6 - -class429.field6114[0] + -(var44.method798() >> 1);
                            var44.method1958(var56, var35);
                            class138.field1976.method572(var56, var35, var54 + var56, var35 + var55);
                            var45.method1958(var56, var35);
                            class138.field1976.method500(arg6, arg0, arg1 + arg6, arg0 + arg3);
                            var35 -= 2;
                        }
                        if (var7 <= var9) {
                            if (~var32.field4165 <= -1 && class250.field3602.length > var32.field4165) {
                                class319 var57 = class250.field3602[var32.field4165];
                                var35 -= 25;
                                var57.method1958(class429.field6114[0] + arg6 + -(var57.method798() >> 1), var35);
                                var35 -= 2;
                            }
                        } else {
                            class257 var58 = (class257) var33;
                            if (~var58.field3829 != 0) {
                                var35 -= 25;
                                class184.field2805[var58.field3829].method1958(class429.field6114[0] + -12 + arg6, var35);
                                var35 -= 2;
                            }
                            if (~var58.field3809 != 0) {
                                var35 -= 25;
                                class250.field3602[var58.field3809].method1958(class429.field6114[0] + arg6 + -12, var35);
                                var35 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class257)) {
                        int var59 = 0;
                        class208[] var60 = class365.field5522;
                        for (int var61 = 0; ~var60.length < ~var61; ++var61) {
                            class208 var63 = var60[var61];
                            if (var63 != null && ~var63.field3129 == -2 && ~class236.field3441[-var7 + var9] == ~var63.field3134) {
                                class319 var64 = class293.field4415[var63.field3135];
                                if (~var59 > ~var64.method796()) {
                                    var59 = var64.method796();
                                }
                                if (class452.field6418 % 20 < 10) {
                                    var64.method1958(arg6 + -12 - -class429.field6114[0], -var64.method796() + var35);
                                }
                            }
                        }
                        if (~var59 < -1) {
                            var10000 = var35 - (var59 - -2);
                        }
                    } else if (~var9 <= -1) {
                        int var65 = 0;
                        class208[] var66 = class365.field5522;
                        for (int var67 = 0; var67 < var66.length; ++var67) {
                            class208 var69 = var66[var67];
                            if (var69 != null && var69.field3129 == 10 && var8[var9] == var69.field3134) {
                                class319 var70 = class293.field4415[var69.field3135];
                                if (~var65 > ~var70.method796()) {
                                    var65 = var70.method796();
                                }
                                var70.method1958(arg6 - (-class429.field6114[0] + 12), -var70.method796() + var35);
                            }
                        }
                        if (~var65 < -1) {
                            var10000 = var35 - (var65 + 2);
                        }
                    }
                    for (int var71 = 0; var71 < 4; ++var71) {
                        if (~class452.field6418 > ~var33.field4596[var71]) {
                            int var72 = var33.method1916((byte) -67) / 2;
                            class200.method1355(arg3 >> 1, arg4, var72, arg5, arg1 >> 1, (byte) 24, var33);
                            if (class429.field6114[0] > -1) {
                                if (var71 == 1) {
                                    class429.field6114[1] -= 20;
                                }
                                if (var71 == 2) {
                                    class429.field6114[0] -= 15;
                                    class429.field6114[1] -= 10;
                                }
                                if (~var71 == -4) {
                                    class429.field6114[0] += 15;
                                    class429.field6114[1] -= 10;
                                }
                                class45.field654[var33.field4615[var71]].method1958(class429.field6114[0] + arg6 + -12, class429.field6114[1] + arg0 - 12);
                                class100.field1430.method1494(0, -1, class429.field6114[0] + arg6 + -1, (byte) 92, Integer.toString(var33.field4660[var71]), class429.field6114[1] + arg0 + 3);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 99) {
            for (int var10 = 0; ~var10 > ~class466.field6562; ++var10) {
                int var28 = class390.field5747[var10];
                class309 var29;
                if (var28 >= 2048) {
                    var29 = class18.field241[var28 + -2048];
                } else {
                    var29 = class40.field565[var28];
                }
                int var30 = class206.field3117[var10];
                class309 var31;
                if (var30 >= 2048) {
                    var31 = class18.field241[var30 + -2048];
                } else {
                    var31 = class40.field565[var30];
                }
                class92.method714(var29, --var29.field4597, arg5, arg6, arg3, var31, (byte) -104, arg1, arg4, arg0);
            }
            int var11 = class131.field1828.field16 - (-class131.field1828.field6 - 2);
            for (int var12 = 0; var12 < class123.field1690; ++var12) {
                int var13 = class281.field4250[var12];
                int var14 = class281.field4248[var12];
                int var15 = class281.field4255[var12];
                boolean var16 = true;
                while (var16) {
                    var16 = false;
                    for (int var27 = 0; ~var27 > ~var12; ++var27) {
                        if (~(var14 - -2) < ~(class281.field4248[var27] - var11) && class281.field4248[var27] + 2 > var14 - var11 && class281.field4250[var27] - -class281.field4255[var27] > -var15 + var13 && ~(var13 + var15) < ~(class281.field4250[var27] + -class281.field4255[var27]) && var14 > class281.field4248[var27] + -var11) {
                            var16 = true;
                            var14 = class281.field4248[var27] + -var11;
                        }
                    }
                }
                class281.field4248[var12] = var14;
                String var17 = class281.field4251[var12];
                if (~class479.field6740 != -1) {
                    class462.field6513.method1494(-16777216, -256, arg6 + var13, (byte) 123, var17, arg0 + var14);
                } else {
                    int var18 = 16776960;
                    if (~class281.field4254[var12] > -7) {
                        var18 = class325.field4871[class281.field4254[var12]];
                    }
                    if (class281.field4254[var12] == 6) {
                        var18 = ~(class281.field4249 % 20) <= -11 ? 16776960 : 16711680;
                    }
                    if (~class281.field4254[var12] == -8) {
                        var18 = ~(class281.field4249 % 20) > -11 ? 255 : 65535;
                    }
                    if (~class281.field4254[var12] == -9) {
                        var18 = ~(class281.field4249 % 20) <= -11 ? 8454016 : 45056;
                    }
                    if (~class281.field4254[var12] == -10) {
                        int var19 = -class281.field4247[var12] + 150;
                        if (var19 < 50) {
                            var18 = var19 * 1280 + 16711680;
                        } else if (~var19 <= -101) {
                            if (var19 < 150) {
                                var18 = var19 * 5 + 65280 + -500;
                            }
                        } else {
                            var18 = -(var19 * 327680) + 16776960 + 16384000;
                        }
                    }
                    if (class281.field4254[var12] == 10) {
                        int var20 = 150 - class281.field4247[var12];
                        if (~var20 <= -51) {
                            if (var20 >= 100) {
                                if (var20 < 150) {
                                    var18 = (var20 + -100) * 327680 + 255 + -((var20 + -100) * 5);
                                }
                            } else {
                                var18 = 16711935 - (var20 + -50) * 327680;
                            }
                        } else {
                            var18 = 16711680 - -(var20 * 5);
                        }
                    }
                    if (class281.field4254[var12] == 11) {
                        int var21 = -class281.field4247[var12] + 150;
                        if (var21 < 50) {
                            var18 = 16777215 - var21 * 327685;
                        } else if (~var21 <= -101) {
                            if (var21 < 150) {
                                var18 = -((var21 - 100) * 327680) + 16777215;
                            }
                        } else {
                            var18 = var21 * 327685 + -16384250 + 65280;
                        }
                    }
                    int var22 = var18 | -16777216;
                    if (~class281.field4246[var12] == -1) {
                        class462.field6513.method1494(-16777216, var22, arg6 - -var13, (byte) 37, var17, arg0 - -var14);
                    }
                    if (~class281.field4246[var12] == -2) {
                        class462.field6513.method1488(var17, arg2 ^ 97, var22, class281.field4249, -16777216, arg6 + var13, arg0 - -var14);
                    }
                    if (class281.field4246[var12] == 2) {
                        class462.field6513.method1498(var22, var17, arg0 + var14, 1784, -16777216, class281.field4249, arg6 + var13);
                    }
                    if (~class281.field4246[var12] == -4) {
                        class462.field6513.method1500(var17, 255, 150 - class281.field4247[var12], arg0 - -var14, var22, -16777216, class281.field4249, arg6 + var13);
                    }
                    if (~class281.field4246[var12] == -5) {
                        int var23 = (150 - class281.field4247[var12]) * (class131.field1828.method3(var17, (byte) 92) + 100) / 150;
                        class138.field1976.method572(var13 + -50 + arg6, arg0, arg6 + 50 + var13, arg0 - -arg3);
                        class462.field6513.method1497(-16777216, var17, -var23 + 50 + arg6 + var13, (byte) -105, var22, arg0 - -var14);
                        class138.field1976.method500(arg6, arg0, arg1 + arg6, arg0 + arg3);
                    }
                    if (class281.field4246[var12] == 5) {
                        int var24 = 150 - class281.field4247[var12];
                        int var25 = 0;
                        if (var24 >= 25) {
                            if (var24 > 125) {
                                var25 = var24 - 125;
                            }
                        } else {
                            var25 = var24 + -25;
                        }
                        int var26 = class131.field1828.field16 - -class131.field1828.field6;
                        class138.field1976.method572(arg6, arg0 - (-var14 + var26) + -1, arg6 - -arg1, arg0 + var14 + 5);
                        class462.field6513.method1494(-16777216, var22, arg6 + var13, (byte) 36, var17, var14 + var25 + arg0);
                        class138.field1976.method500(arg6, arg0, arg1 + arg6, arg0 + arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)Z", line = 937)
    public static final boolean method1431(int arg0, boolean arg1) {
        if (arg0 > -51) {
            method1423(39);
        }
        ++field3199;
        boolean var2 = class138.field1976.method504();
        if (!var2 == !arg1) {
            return true;
        } else {
            if (!arg1) {
                class138.field1976.method492();
            } else if (!class138.field1976.method592()) {
                arg1 = false;
            }
            if (!var2 == !arg1) {
                return false;
            } else {
                class337.field5038.field3922 = arg1;
                class337.field5038.method2208(-74, class21.field261);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 972)
    protected class212() {
        if (client.field6676 == null) {
            class283.method1817(0);
        }
        this.method1429(true);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lre;)V", line = 983)
    public class212(class446 arg0) {
        if (client.field6676 == null) {
            class283.method1817(0);
        }
        this.field3188 = arg0.method2628(49152);
        this.field3201 = ~(this.field3188 & 8) != -1;
        this.field3190 = ~(16 & this.field3188) != -1;
        this.field3188 &= 7;
        super.field3414 = arg0.method2631(2530);
        super.field3413 = arg0.method2631(2530);
        super.field3416 = arg0.method2631(2530);
        super.field3407 = arg0.method2628(49152);
        int var2 = super.field3407 * 2 + 1;
        this.field3191 = new short[var2];
        for (int var3 = 0; var3 < this.field3191.length; ++var3) {
            short var5 = (short) arg0.method2631(2530);
            int var6 = var5 >>> 8;
            if (var2 <= var6) {
                var6 = var2 + -1;
            }
            int var7 = 255 & var5;
            if (-var6 + var2 < var7) {
                var7 = -var6 + var2;
            }
            this.field3191[var3] = (short) class347.method2139(var7, var6 << 8);
        }
        super.field3407 = (super.field3407 << class426.field6091) + class47.field683;
        if (class422.field6043 != null) {
            super.field3409 = class422.field6043[arg0.method2631(2530)];
        } else {
            super.field3409 = class81.field1140[class316.method1949(arg0.method2631(2530), (byte) 118) & 65535];
        }
        int var4 = arg0.method2628(49152);
        this.field3184 = 31 & var4;
        this.field3192 = (var4 & 224) << 3;
        if (~this.field3184 != -32) {
            this.method1429(true);
        }
    }
}
