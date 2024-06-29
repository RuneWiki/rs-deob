import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class162 extends class119 {

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    private int field3015;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    private int field3006;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "Lal;")
    public static class230 field3003;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "[[[I")
    public static int[][][] field3017;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)V")
    public final void method187(byte arg0, int arg1, int arg2) {
        ++field3011;
        if (arg0 != -36) {
            this.method187((byte) 19, -95, 115);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILpb;II)V")
    public static final void method1190(int arg0, class127 arg1, int arg2, int arg3) {
        ++field3014;
        if ((128 & arg3) != 0) {
            int var4 = class11.field150.method491((byte) -71);
            boolean var5 = (32768 & var4) != 0;
            int var6 = class11.field150.method489((byte) 102);
            int var7 = class11.field150.method489((byte) 91);
            int var8 = class11.field150.field1340;
            if (arg1.field2243 != null && arg1.field2226 != null) {
                long var9 = arg1.field2243.method1023((byte) -16);
                boolean var11 = false;
                if (var6 <= 1) {
                    if (!var5 && (class79.field1472 && !class236.field4137 || class129.field2292)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; ~var12 > ~class16.field229; ++var12) {
                            if (class139.field2545[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && ~class205.field3685 == -1) {
                    int var13 = -1;
                    class206.field3702.field1340 = 0;
                    class11.field150.method519(var7, 0, class206.field3702.field1321, (byte) -90);
                    class206.field3702.field1340 = 0;
                    class149 var15;
                    if (var5) {
                        var4 &= 32767;
                        class236 var14 = class38.method225(1, class206.field3702);
                        var13 = var14.field4136;
                        var15 = var14.field4144.method1702(59, class206.field3702);
                    } else {
                        var15 = class160.method1172(class157.method1129(class206.field3702, 112).method1046((byte) 127));
                    }
                    arg1.field2337 = var15.method1037(32);
                    arg1.field2368 = var4 & 255;
                    arg1.field2387 = 150;
                    arg1.field2360 = var4 >> 8;
                    if (~var6 == -3) {
                        class87.method646(var13, var15, (class149) null, !var5 ? 1 : 17, -1, class237.method1603(new class149[] { class99.field1753, arg1.method890(-14756) }, -128));
                    } else if (~var6 == -2) {
                        class87.method646(var13, var15, (class149) null, var5 ? 17 : 1, -1, class237.method1603(new class149[] { class281.field4998, arg1.method890(-14756) }, -98));
                    } else {
                        class87.method646(var13, var15, (class149) null, !var5 ? 2 : 17, -1, arg1.method890(-14756));
                    }
                }
            }
            class11.field150.field1340 = var8 - -var7;
        }
        if ((1 & arg3) != 0) {
            int var16 = class11.field150.method512(-64);
            int var17 = class11.field150.method530((byte) 120);
            arg1.method924(var16, class118.field2022, 49, var17);
            arg1.field2309 = class118.field2022 + 300;
            arg1.field2375 = class11.field150.method522(128);
        }
        if ((8 & arg3) != 0) {
            int var18 = class11.field150.method485(-2386);
            if (~var18 == -65536) {
                var18 = -1;
            }
            int var19 = class11.field150.method489((byte) -90);
            class269.method1872(-94, var18, var19, arg1);
        }
        if (~(arg3 & 4) != -1) {
            int var20 = class11.field150.method530((byte) 97);
            byte[] var21 = new byte[var20];
            class74 var22 = new class74(var21);
            class11.field150.method528(var20, 0, -2, var21);
            class236.field4133[arg0] = var22;
            arg1.method889(var22, 28);
        }
        if (~(arg3 & 2) != -1) {
            arg1.field2399 = class11.field150.method484((byte) 22);
            if (~arg1.field2399 == -65536) {
                arg1.field2399 = -1;
            }
        }
        if (~(1024 & arg3) != -1) {
            arg1.field2395 = class11.field150.method487((byte) -80);
            arg1.field2380 = class11.field150.method489((byte) 95);
            arg1.field2310 = class11.field150.method530((byte) 99);
            arg1.field2332 = class11.field150.method489((byte) 101);
            arg1.field2328 = class11.field150.method491((byte) -82) + class118.field2022;
            arg1.field2348 = class11.field150.method491((byte) 114) + class118.field2022;
            arg1.field2379 = class11.field150.method487((byte) -80);
            arg1.field2341 = 0;
            arg1.field2327 = 1;
        }
        if (~(32 & arg3) != -1) {
            arg1.field2337 = class11.field150.method529(-1);
            if (~arg1.field2337.method1021(0, 127) != -127) {
                if (class77.field1449 == arg1) {
                    class264.method1841(true, arg1.field2337, arg1.method890(-14756), 2);
                }
            } else {
                arg1.field2337 = arg1.field2337.method1025((byte) 34, 1);
                class264.method1841(true, arg1.field2337, arg1.method890(-14756), 2);
            }
            arg1.field2360 = 0;
            arg1.field2387 = 150;
            arg1.field2368 = 0;
        }
        if (arg2 >= -80) {
            method1190(2, (class127) null, -110, -98);
        }
        if (~(arg3 & 512) != -1) {
            int var23 = class11.field150.method512(-114);
            int var24 = class11.field150.method522(128);
            arg1.method924(var23, class118.field2022, 98, var24);
        }
        if ((2048 & arg3) != 0) {
            int var25 = class11.field150.method487((byte) -80);
            int[] var26 = new int[var25];
            int[] var27 = new int[var25];
            int[] var28 = new int[var25];
            for (int var29 = 0; var25 > var29; ++var29) {
                int var30 = class11.field150.method491((byte) -46);
                if (var30 == 65535) {
                    var30 = -1;
                }
                var26[var29] = var30;
                var28[var29] = class11.field150.method530((byte) 93);
                var27[var29] = class11.field150.method485(-2386);
            }
            class139.method968((byte) -79, var26, var28, arg1, var27);
        }
        if ((256 & arg3) != 0) {
            int var31 = class11.field150.method491((byte) -112);
            if (var31 == 65535) {
                var31 = -1;
            }
            boolean var32 = true;
            int var33 = class11.field150.method510((byte) 91);
            if (~var31 != 0 && ~arg1.field2353 != 0 && ~class69.method436(class200.method1374(-17177, var31).field5130, -32).field3036 > ~class69.method436(class200.method1374(-17177, arg1.field2353).field5130, -32).field3036) {
                var32 = false;
            }
            if (var32) {
                arg1.field2374 = var33 >> 16;
                arg1.field2394 = 1;
                arg1.field2315 = (65535 & var33) + class118.field2022;
                arg1.field2353 = var31;
                arg1.field2359 = 0;
                if (~arg1.field2315 < ~class118.field2022) {
                    arg1.field2359 = -1;
                }
                arg1.field2326 = 0;
                if (arg1.field2353 != -1 && ~class118.field2022 == ~arg1.field2315) {
                    int var34 = class200.method1374(-17177, arg1.field2353).field5130;
                    if (var34 != -1) {
                        class164 var35 = class69.method436(var34, -32);
                        if (var35 != null && var35.field3035 != null) {
                            class94.method686(var35, arg1.field2340, -124, arg1.field2347, class77.field1449 == arg1, 0);
                        }
                    }
                }
            }
        }
        if ((64 & arg3) != 0) {
            arg1.field2392 = class11.field150.method485(-2386);
            arg1.field2352 = class11.field150.method531((byte) -88);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static final void method1191(boolean arg0) {
        if (arg0) {
            method1194(false);
        }
        class98.field1743.method1291(0);
        ++field3002;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIB)V")
    public final void method188(int arg0, int arg1, byte arg2) {
        ++field3016;
        if (arg2 != -67) {
            this.method186((byte) -50, -107, -67);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)Ldl;")
    public static final class123 method1192(boolean arg0, int arg1) {
        class123 var2 = (class123) class41.field648.method1293((long) arg1, !arg0);
        ++field3009;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class108.field1871.method1562(-809612665, arg1, 33);
            class123 var4 = new class123();
            if (var3 != null) {
                var4.method868(2, arg1, new class74(var3));
            }
            if (!arg0) {
                method1193(-122);
            }
            class41.field648.method1295((long) arg1, var4, (byte) -71);
            return var4;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method1193(int arg0) {
        if (arg0 <= -106) {
            field3017 = null;
            field3003 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V")
    public static final void method1194(boolean arg0) {
        ++field2999;
        if (~class94.method687(0) == -3) {
            byte var1 = (byte) (class86.field1567 + -4 & 255);
            if (!arg0) {
                field3003 = null;
            }
            int var2 = class86.field1567 % 104;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; var16 < 104; ++var16) {
                    class135.field2449[var3][var2][var16] = var1;
                }
            }
            if (~class277.field4948 != -4) {
                for (int var4 = 0; var4 < 2; ++var4) {
                    class151.field2749[var4] = -1000000;
                    class190.field3409[var4] = 1000000;
                    class24.field355[var4] = 0;
                    class94.field1661[var4] = 1000000;
                    class216.field3808[var4] = 0;
                }
                if (class194.field3468 != 1) {
                    int var5 = class287.method1968(class277.field4948, class269.field4853, class2.field29, (byte) 119);
                    if (~(var5 - class10.field140) > -801 && (class69.field1215[class277.field4948][class269.field4853 >> 7][class2.field29 >> 7] & 4) != 0) {
                        class171.method1227(false, class2.field29 >> 7, (byte) 79, 1, class261.field4664, class269.field4853 >> 7);
                        return;
                    }
                } else {
                    if ((class69.field1215[class277.field4948][class77.field1449.field2347 >> 7][class77.field1449.field2340 >> 7] & 4) != 0) {
                        class171.method1227(false, class77.field1449.field2340 >> 7, (byte) 79, 0, class261.field4664, class77.field1449.field2347 >> 7);
                    }
                    if (class186.field3354 >= 310) {
                        return;
                    }
                    int var6 = class269.field4853 >> 7;
                    int var7 = class2.field29 >> 7;
                    int var8 = class77.field1449.field2347 >> 7;
                    int var9 = class77.field1449.field2340 >> 7;
                    int var10;
                    if (~var8 >= ~var6) {
                        var10 = -var8 + var6;
                    } else {
                        var10 = -var6 + var8;
                    }
                    int var11;
                    if (var9 <= var7) {
                        var11 = -var9 + var7;
                    } else {
                        var11 = -var7 + var9;
                    }
                    if (var10 <= var11) {
                        int var12 = var10 * 65536 / var11;
                        int var13 = 32768;
                        while (~var7 != ~var9) {
                            if (~var9 < ~var7) {
                                ++var7;
                            } else if (~var7 < ~var9) {
                                --var7;
                            }
                            if ((class69.field1215[class277.field4948][var6][var7] & 4) != 0) {
                                class171.method1227(false, var7, (byte) 79, 1, class261.field4664, var6);
                                return;
                            }
                            var13 += var12;
                            if (var13 >= 65536) {
                                var13 -= 65536;
                                if (~var8 < ~var6) {
                                    ++var6;
                                } else if (~var6 < ~var8) {
                                    --var6;
                                }
                                if (~(class69.field1215[class277.field4948][var6][var7] & 4) != -1) {
                                    class171.method1227(false, var7, (byte) 79, 1, class261.field4664, var6);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var14 = var11 * 65536 / var10;
                    int var15 = 32768;
                    while (~var6 != ~var8) {
                        if (var6 >= var8) {
                            if (~var6 < ~var8) {
                                --var6;
                            }
                        } else {
                            ++var6;
                        }
                        if (~(class69.field1215[class277.field4948][var6][var7] & 4) != -1) {
                            class171.method1227(false, var7, (byte) 79, 1, class261.field4664, var6);
                            return;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            if (var7 >= var9) {
                                if (var9 < var7) {
                                    --var7;
                                }
                            } else {
                                ++var7;
                            }
                            var15 -= 65536;
                            if ((4 & class69.field1215[class277.field4948][var6][var7]) != 0) {
                                class171.method1227(false, var7, (byte) 79, 1, class261.field4664, var6);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(BII)V")
    public final void method186(byte arg0, int arg1, int arg2) {
        if (arg0 <= -39) {
            ++field3010;
            int var4 = this.field3005 * arg2 >> 12;
            int var5 = this.field3007 * arg1 >> 12;
            int var6 = this.field3006 * arg2 >> 12;
            int var7 = this.field3001 * arg1 >> 12;
            int var8 = this.field3008 * arg2 >> 12;
            int var9 = this.field3000 * arg1 >> 12;
            int var10 = this.field3004 * arg1 >> 12;
            int var11 = this.field3015 * arg2 >> 12;
            class198.method1355(var6, var5, var9, super.field2038, var11, var8, var10, var4, (byte) 123, var7);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3004 = arg2;
        this.field3015 = arg7;
        this.field3007 = arg0;
        this.field3000 = arg6;
        this.field3006 = arg3;
        this.field3005 = arg1;
        this.field3001 = arg4;
        this.field3008 = arg5;
    }
}
