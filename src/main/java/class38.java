import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class38 extends class70 {

    @OriginalMember(owner = "client!de", name = "Kb", descriptor = "I")
    public int field833 = 0;

    @OriginalMember(owner = "client!de", name = "Mb", descriptor = "I")
    public int field835 = 0;

    @OriginalMember(owner = "client!de", name = "Sb", descriptor = "I")
    public int field841 = 0;

    @OriginalMember(owner = "client!de", name = "Qb", descriptor = "S")
    private short field839 = 0;

    @OriginalMember(owner = "client!de", name = "Wb", descriptor = "I")
    public int field845 = 0;

    @OriginalMember(owner = "client!de", name = "Ib", descriptor = "I")
    public int field831 = -1;

    @OriginalMember(owner = "client!de", name = "ic", descriptor = "Z")
    public boolean field857 = false;

    @OriginalMember(owner = "client!de", name = "ac", descriptor = "I")
    public int field849 = 0;

    @OriginalMember(owner = "client!de", name = "jc", descriptor = "S")
    private short field858 = 0;

    @OriginalMember(owner = "client!de", name = "lc", descriptor = "I")
    public int field860 = -1;

    @OriginalMember(owner = "client!de", name = "Pb", descriptor = "[I")
    public static int[] field838 = new int[32];

    @OriginalMember(owner = "client!de", name = "Lb", descriptor = "Z")
    public static boolean field834 = false;

    @OriginalMember(owner = "client!de", name = "kc", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!de", name = "Hb", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!de", name = "Jb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!de", name = "Nb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!de", name = "Ob", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!de", name = "Rb", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!de", name = "Tb", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!de", name = "Ub", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!de", name = "Xb", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!de", name = "Yb", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!de", name = "Zb", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!de", name = "cc", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!de", name = "dc", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!de", name = "fc", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!de", name = "gc", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!de", name = "hc", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!de", name = "ec", descriptor = "Lvd;")
    public class222 field853;

    @OriginalMember(owner = "client!de", name = "bc", descriptor = "Lvh;")
    public class226 field850;

    @OriginalMember(owner = "client!de", name = "Vb", descriptor = "Lee;")
    public class49 field844;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)Z")
    public final boolean method306(int arg0) {
        ++field851;
        int var2 = 116 % ((arg0 - 30) / 51);
        return this.field850 != null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILvd;)Lvd;")
    public static final class222 method307(int arg0, class222 arg1) {
        if (arg0 != -1781) {
            method310((byte) -5);
        }
        class40 var2 = class118.method756(59, arg1);
        ++field836;
        return var2 == null ? class50.field975 : var2.field878;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
    public final int method87() {
        ++field856;
        return super.field1351;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field842;
        if (this.field850 != null) {
            class183 var11 = super.field1323 != -1 && ~super.field1338 == -1 ? class93.method599((byte) -88, super.field1323) : null;
            class183 var12 = super.field1370 == -1 || this.field857 || ~super.field1370 == ~super.field1322 && var11 != null ? null : class93.method599((byte) -23, super.field1370);
            class49 var13 = this.field850.method1477(-4806, super.field1313, var12, var11, super.field1318);
            if (var13 != null) {
                super.field1351 = var13.method87();
                if (class17.field432 == this) {
                    for (int var14 = class128.field2471.length + -1; var14 >= 0; --var14) {
                        class115 var15 = class128.field2471[var14];
                        if (var15 != null && ~var15.field2194 != 0) {
                            if (var15.field2187 == 1 && ~var15.field2192 <= -1 && ~class202.field3696.length < ~var15.field2192) {
                                class193 var16 = class202.field3696[var15.field2192];
                                if (var16 != null) {
                                    int var17 = var16.field1353 / 32 + -(class17.field432.field1353 / 32);
                                    int var18 = var16.field1360 / 32 + -(class17.field432.field1360 / 32);
                                    this.method311(var17, var18, arg5, arg6, arg0, arg1, arg4, (byte) 105, var15.field2194, arg7, arg3, arg2, var13);
                                }
                            }
                            if (~var15.field2187 == -3) {
                                int var19 = (-class110.field2064 + var15.field2191) * 4 + 2 + -(class17.field432.field1353 / 32);
                                int var20 = (-class151.field2931 + var15.field2184) * 4 + -(class17.field432.field1360 / 32) - -2;
                                this.method311(var19, var20, arg5, arg6, arg0, arg1, arg4, (byte) 105, var15.field2194, arg7, arg3, arg2, var13);
                            }
                            if (~var15.field2187 == -11 && var15.field2192 >= 0 && class54.field1024.length > var15.field2192) {
                                class38 var21 = class54.field1024[var15.field2192];
                                if (var21 != null) {
                                    int var22 = var21.field1353 / 32 - class17.field432.field1353 / 32;
                                    int var23 = var21.field1360 / 32 + -(class17.field432.field1360 / 32);
                                    this.method311(var22, var23, arg5, arg6, arg0, arg1, arg4, (byte) 105, var15.field2194, arg7, arg3, arg2, var13);
                                }
                            }
                        }
                    }
                }
                int var24 = 0;
                int var25 = 0;
                int var26 = 0;
                if (this.field858 != 0 && ~this.field839 != -1) {
                    int var27 = class199.field3640[arg0];
                    short var28 = this.field839;
                    short var29 = this.field858;
                    int var30 = class199.field3624[arg0];
                    int var31 = -var29 / 2;
                    int var32 = -var28 / 2;
                    int var33 = var30 * var32 + -(var27 * var31) >> 16;
                    int var34 = var27 * var32 - -(var30 * var31) >> 16;
                    int var35 = class71.method482(super.field1360 + var33, super.field1353 + var34, class217.field4036, (byte) 122);
                    int var36 = -var28 / 2;
                    int var37 = var29 / 2;
                    int var38 = var27 * var36 + var30 * var37 >> 16;
                    int var39 = var30 * var36 + -(var27 * var37) >> 16;
                    int var40 = var28 / 2;
                    int var41 = -var29 / 2;
                    int var42 = var27 * var40 - -(var30 * var41) >> 16;
                    int var43 = var30 * var40 + -(var27 * var41) >> 16;
                    int var44 = var29 / 2;
                    int var45 = class71.method482(super.field1360 + var39, super.field1353 - -var38, class217.field4036, (byte) 123);
                    int var46 = var28 / 2;
                    int var47 = var27 * var46 + var30 * var44 >> 16;
                    int var48 = var30 * var46 + -(var27 * var44) >> 16;
                    int var49 = class71.method482(super.field1360 + var43, super.field1353 + var42, class217.field4036, (byte) 123);
                    int var50 = var35 >= var45 ? var45 : var35;
                    int var51 = class71.method482(super.field1360 + var48, super.field1353 + var47, class217.field4036, (byte) 123);
                    int var52 = ~var49 <= ~var51 ? var51 : var49;
                    int var53 = ~var51 >= ~var45 ? var51 : var45;
                    int var54 = var35 + var51;
                    var25 = 2047 & (int) (325.95D * Math.atan2((double) (-var52 + var50), (double) var28));
                    if (var54 > var45 + var49) {
                        var54 = var45 - -var49;
                    }
                    if (~var25 != -1) {
                        var13.method355(var25);
                    }
                    int var55 = var35 >= var49 ? var49 : var35;
                    var24 = 2047 & (int) (Math.atan2((double) (-var53 + var55), (double) var29) * 325.95D);
                    if (~var24 != -1) {
                        var13.method360(var24);
                    }
                    var26 = (var54 >> 1) - super.field1308;
                    if (~var26 != -1) {
                        var13.method349(0, var26, 0);
                    }
                }
                class49 var56 = null;
                if (!this.field857 && super.field1309 != -1 && ~super.field1362 != 0) {
                    class98 var57 = class127.method805(super.field1309, (byte) 84);
                    var56 = var57.method613(super.field1362, 1067);
                    if (var56 != null) {
                        var56.method349(0, -super.field1340, 0);
                        if (var57.field1828) {
                            if (var25 != 0) {
                                var56.method355(var25);
                            }
                            if (~var24 != -1) {
                                var56.method360(var24);
                            }
                            if (var26 != 0) {
                                var56.method349(0, var26, 0);
                            }
                        }
                    }
                }
                class49 var58 = null;
                if (!this.field857 && this.field844 != null) {
                    if (~class175.field3280 <= ~this.field833) {
                        this.field844 = null;
                    }
                    if (class175.field3280 >= this.field841 && class175.field3280 < this.field833) {
                        var58 = this.field844;
                        var58.method349(-super.field1353 + this.field848, -super.field1308 + this.field855, this.field837 - super.field1360);
                        if (~super.field1325 == -513) {
                            var58.method361();
                        } else if (super.field1325 == 1024) {
                            var58.method363();
                        } else if (super.field1325 == 1536) {
                            var58.method357();
                        }
                    }
                }
                if (var56 != null) {
                    var13 = ((class150) var13).method962(var56);
                }
                if (var58 != null) {
                    var13 = ((class150) var13).method962(var58);
                }
                var13.field969 = true;
                var13.method89(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var58 != null) {
                    if (super.field1325 == 512) {
                        var58.method357();
                    } else if (~super.field1325 != -1025) {
                        if (~super.field1325 == -1537) {
                            var58.method361();
                        }
                    } else {
                        var58.method363();
                    }
                    var58.method349(-this.field848 + super.field1353, super.field1308 - this.field855, super.field1360 - this.field837);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII[Lba;)V")
    public static final void method308(int arg0, int arg1, int arg2, int arg3, class13[] arg4) {
        ++field832;
        if (arg3 != 1) {
            field859 = -9;
        }
        for (int var5 = 0; var5 < arg4.length; ++var5) {
            class13 var6 = arg4[var5];
            if (var6 != null && ~var6.field238 == ~arg2) {
                if (var6.field303 == 0) {
                    var6.field245 = var6.field312;
                } else if (var6.field303 != 1) {
                    if (~var6.field303 != -3) {
                        if (var6.field303 == 3) {
                            if (var6.field365 == 2) {
                                var6.field245 = (var6.field312 + -1) * var6.field234 + var6.field312 * 32;
                            } else if (var6.field365 == 7) {
                                var6.field245 = (var6.field312 + -1) * var6.field234 + var6.field312 * 12;
                            }
                        }
                    } else {
                        var6.field245 = var6.field312 * arg1 >> 14;
                    }
                } else {
                    var6.field245 = -var6.field312 + arg1;
                }
                if (var6.field300 == 0) {
                    var6.field295 = var6.field328;
                } else if (var6.field300 == 1) {
                    var6.field295 = (-var6.field245 + arg1) / 2 - -var6.field328;
                } else if (~var6.field300 == -3) {
                    var6.field295 = arg1 - var6.field245 - var6.field328;
                } else if (~var6.field300 == -4) {
                    var6.field295 = var6.field328 * arg1 >> 14;
                } else if (var6.field300 != 4) {
                    var6.field295 = -var6.field245 + arg1 + -(var6.field328 * arg1 >> 14);
                } else {
                    var6.field295 = (arg1 - var6.field245) / 2 - -(var6.field328 * arg1 >> 14);
                }
                if (var6.field351 == 0) {
                    var6.field341 = var6.field333;
                } else if (~var6.field351 == -2) {
                    var6.field341 = -var6.field333 + arg0;
                } else if (~var6.field351 != -3) {
                    if (var6.field351 == 3) {
                        if (var6.field365 == 2) {
                            var6.field341 = var6.field333 * 32 - -((var6.field333 - 1) * var6.field273);
                        } else if (~var6.field365 == -8) {
                            var6.field341 = (var6.field333 + -1) * var6.field273 + var6.field333 * 115;
                        }
                    }
                } else {
                    var6.field341 = var6.field333 * arg0 >> 14;
                }
                var6.field295 += var6.field355;
                if (var6.field297 != 0) {
                    if (~var6.field297 == -2) {
                        var6.field236 = (-var6.field341 + arg0) / 2 + var6.field319;
                    } else if (var6.field297 == 2) {
                        var6.field236 = -var6.field341 + -var6.field319 + arg0;
                    } else if (var6.field297 == 3) {
                        var6.field236 = var6.field319 * arg0 >> 14;
                    } else if (var6.field297 != 4) {
                        var6.field236 = arg0 - (var6.field341 - -(var6.field319 * arg0 >> 14));
                    } else {
                        var6.field236 = (var6.field319 * arg0 >> 14) + (-var6.field341 + arg0) / 2;
                    }
                } else {
                    var6.field236 = var6.field319;
                }
                if (var6.field254 - var6.field341 < var6.field316) {
                    var6.field316 = -var6.field341 + var6.field254;
                }
                if (~(-var6.field245 + var6.field354) > ~var6.field314) {
                    var6.field314 = -var6.field245 + var6.field354;
                }
                if (var6.field314 < 0) {
                    var6.field314 = 0;
                }
                var6.field236 += var6.field242;
                if (~var6.field316 > -1) {
                    var6.field316 = 0;
                }
                if (~var6.field365 == -1) {
                    class78.method516(var6, 229);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lka;B)V")
    public final void method309(class109 arg0, byte arg1) {
        arg0.field2053 = 0;
        if (arg1 <= 66) {
            field859 = 93;
        }
        ++field840;
        int var3 = arg0.method662((byte) -84);
        if ((var3 & 2) == 2) {
            this.field858 = (short) (arg0.method662((byte) -83) << 2);
            this.field839 = (short) (arg0.method662((byte) -118) << 2);
        } else {
            this.field839 = 0;
            this.field858 = 0;
        }
        super.field1331 = (var3 >> 3) + 1;
        int var4 = 1 & var3;
        this.field831 = arg0.method661(255);
        int var5 = -1;
        boolean var6 = (4 & var3) != 0;
        this.field860 = arg0.method661(255);
        int[] var7 = new int[12];
        this.field849 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg0.method662((byte) -127);
            if (~var9 == -1) {
                var7[var8] = 0;
            } else {
                int var10 = arg0.method662((byte) -117);
                int var11 = (var9 << 8) + var10;
                if (var8 == 0 && var11 == 65535) {
                    var5 = arg0.method675(2);
                    break;
                }
                if (var11 >= 32768) {
                    int var15 = class118.field2239[var11 + -32768];
                    var7[var8] = class213.method1361(var15, 1073741824);
                    int var16 = class112.method728(var15, (byte) 22).field3775;
                    if (var16 != 0) {
                        this.field849 = var16;
                    }
                } else {
                    var7[var8] = class213.method1361(var11 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; var13 < 5; ++var13) {
            int var14 = arg0.method662((byte) -115);
            if (var14 < 0 || class211.field3930[var13].length <= var14) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field1322 = arg0.method675(2);
        if (~super.field1322 == -65536) {
            super.field1322 = -1;
        }
        super.field1354 = arg0.method675(2);
        if (super.field1354 == 65535) {
            super.field1354 = -1;
        }
        super.field1319 = super.field1354;
        super.field1364 = arg0.method675(2);
        if (~super.field1364 == -65536) {
            super.field1364 = -1;
        }
        super.field1324 = arg0.method675(2);
        if (super.field1324 == 65535) {
            super.field1324 = -1;
        }
        super.field1311 = arg0.method675(2);
        if (~super.field1311 == -65536) {
            super.field1311 = -1;
        }
        super.field1355 = arg0.method675(2);
        if (super.field1355 == 65535) {
            super.field1355 = -1;
        }
        super.field1349 = arg0.method675(2);
        if (super.field1349 == 65535) {
            super.field1349 = -1;
        }
        this.field853 = class204.method1317((byte) -112, arg0.method709((byte) 7)).method1409(-7899);
        this.field835 = arg0.method662((byte) -108);
        if (var6) {
            this.field845 = arg0.method675(2);
        } else {
            this.field845 = 0;
        }
        if (this.field850 == null) {
            this.field850 = new class226();
        }
        this.field850.method1482(~var4 == -2, var7, var5, var12, -8);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field838 = null;
        if (arg0 != 34) {
            field838 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIBIIIILee;)V")
    private final void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
        if (arg7 != 105) {
            this.field847 = -49;
        }
        ++field854;
        if (arg0 * arg0 + arg1 * arg1 <= 360000) {
            int var14 = 2047 & (int) (Math.atan2((double) arg0, (double) arg1) * 325.949D);
            class49 var15 = class88.method566(super.field1360, super.field1308, super.field1353, arg12, 1397, arg8, var14);
            if (var15 != null) {
                var15.method89(0, arg5, arg11, arg10, arg6, arg2, arg3, arg9, -1L);
            }
        }
    }
}
