import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class153 {

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public int field2343 = -1;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field2328 = 20;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Z")
    public static boolean field2337 = false;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    private int field2341;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "J")
    private long field2332;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "J")
    private long field2348;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Ldp;")
    public static class174 field2329;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Z")
    public boolean field2346;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "[I")
    public int[] field2339;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "[I")
    private int[] field2344;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[[I")
    private int[][] field2330;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)V")
    public static final void method1171(int arg0, byte arg1, int arg2) {
        int var3 = class321.field4641 * arg0 >> 8;
        if (arg1 < 19) {
            return;
        }
        field2345++;
        if (arg2 == -1 && !class387.field5546) {
            class107.method945(101);
        } else if (arg2 != -1 && (class86.field1402 != arg2 || !class199.method1516((byte) -84)) && var3 != 0 && !class387.field5546) {
            class136.method1115(0, arg2, 2, var3, true, false, class446.field6501);
        }
        class86.field1402 = arg2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZZ)V")
    public final void method1172(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field2330 = null;
        }
        this.field2346 = arg1;
        field2338++;
        this.method1173(-8265);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    private final void method1173(int arg0) {
        field2325++;
        long[] var2 = class106.field1755;
        this.field2348 = -1L;
        if (arg0 != -8265) {
            this.field2341 = 115;
        }
        this.field2348 = var2[(int) (((long) (this.field2341 >> 8) ^ this.field2348) & 0xFFL)] ^ this.field2348 >>> 8;
        this.field2348 = this.field2348 >>> 8 ^ var2[(int) (((long) this.field2341 ^ this.field2348) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2348 = var2[(int) ((this.field2348 ^ (long) (this.field2344[var3] >> 24)) & 0xFFL)] ^ this.field2348 >>> 8;
            this.field2348 = var2[(int) (((long) (this.field2344[var3] >> 16) ^ this.field2348) & 0xFFL)] ^ this.field2348 >>> 8;
            this.field2348 = this.field2348 >>> 8 ^ var2[(int) ((this.field2348 ^ (long) (this.field2344[var3] >> 8)) & 0xFFL)];
            this.field2348 = var2[(int) (((long) this.field2344[var3] ^ this.field2348) & 0xFFL)] ^ this.field2348 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2348 = var2[(int) ((this.field2348 ^ (long) this.field2339[var4]) & 0xFFL)] ^ this.field2348 >>> 8;
        }
        this.field2348 = this.field2348 >>> 8 ^ var2[(int) (((long) (this.field2346 ? 1 : 0) ^ this.field2348) & 0xFFL)];
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
    public static final void method1174(int arg0, int arg1, int arg2, int arg3) {
        field2342++;
        class221 var4 = class447.method2795(11, (byte) -49, arg2);
        var4.method1692(0);
        var4.field3297 = arg1;
        var4.field3291 = arg0;
        int var5 = -93 % ((-arg3 - 28) / 60);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lbq;Lbq;IZIB[Ltn;Lja;IIIII)Lrc;")
    public final class100 method1175(class51 arg0, class51 arg1, int arg2, boolean arg3, int arg4, byte arg5, class109[] arg6, class90 arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2340++;
        if (this.field2343 != -1) {
            return class371.method2357(this.field2343, -13299).method66(arg10, arg9, arg2, arg7, arg0, arg1, arg11, arg12, arg8, 29253, arg6, arg4);
        }
        int var14 = arg2;
        long var15 = this.field2348;
        int[] var17 = this.field2344;
        if (arg0 != null && (arg0.field849 >= 0 || arg0.field834 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field2344[var18];
            }
            if (arg0.field849 >= 0) {
                if (arg0.field849 == 65535) {
                    var15 ^= 0xFFFFFFFF00000000L;
                    var17[5] = 0;
                } else {
                    var17[5] = class439.method2744(1073741824, arg0.field849);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg0.field834 >= 0) {
                if (arg0.field834 == 65535) {
                    var15 ^= 0xFFFFFFFFL;
                    var17[3] = 0;
                } else {
                    var17[3] = class439.method2744(arg0.field834, 1073741824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg0 != null || arg1 != null;
        int var22 = arg6 == null ? 0 : arg6.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class292.field4345[var23] = null;
            if (arg6[var23] != null) {
                class51 var24 = class113.method974(arg6[var23].field1789, (byte) -105);
                if (var24.field835 != null) {
                    class263.field3966[var23] = var24;
                    var21 = true;
                    int var25 = arg6[var23].field1784;
                    int var26 = arg6[var23].field1776;
                    int var27 = var24.field835[var25];
                    class292.field4345[var23] = class132.method1099(false, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class268.field4021[var23] = var28;
                    if (class292.field4345[var23] != null) {
                        var20 |= class292.field4345[var23].method2049(-95, var28);
                        var19 |= class292.field4345[var23].method2047(var28, -423207056);
                    }
                    if ((var24.field818 || class221.field3301) && var26 != -1 && var24.field835.length > var26) {
                        class291.field4328[var23] = var24.field845[var25];
                        class334.field4791[var23] = arg6[var23].field1788;
                        int var29 = var24.field835[var26];
                        class439.field6384[var23] = class132.method1099(false, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class88.field1406[var23] = var30;
                        if (class439.field6384[var23] != null) {
                            var20 |= class439.field6384[var23].method2049(-77, var30);
                            var19 |= class439.field6384[var23].method2047(var30, -423207056);
                        }
                    } else {
                        class291.field4328[var23] = 0;
                        class334.field4791[var23] = 0;
                        class439.field6384[var23] = null;
                        class88.field1406[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class293 var34 = null;
        class293 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class293 var39 = null;
        class293 var40 = null;
        if (var21) {
            if (arg0 != null) {
                int var41 = arg0.field835[arg8];
                int var42 = var41 >>> 16;
                var34 = class132.method1099(false, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method2049(-113, var31);
                    var19 |= var34.method2047(var31, -423207056);
                }
                if ((arg0.field818 || class221.field3301) && arg4 != -1 && arg0.field835.length > arg4) {
                    int var43 = arg0.field835[arg4];
                    var33 = arg0.field845[arg8];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = class132.method1099(false, var32 >>> 16);
                    }
                    if (var35 != null) {
                        var20 |= var35.method2049(-91, var32);
                        var19 |= var35.method2047(var32, -423207056);
                    }
                }
            }
            var14 = arg2 | 0x20;
            if (arg1 != null) {
                int var45 = arg1.field835[arg9];
                int var46 = var45 >>> 16;
                var39 = class132.method1099(false, var46);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method2049(-101, var36);
                    var19 |= var39.method2047(var36, -423207056);
                }
                if ((arg1.field818 || class221.field3301) && arg11 != -1 && arg11 < arg1.field835.length) {
                    var38 = arg1.field845[arg9];
                    int var47 = arg1.field835[arg11];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = class132.method1099(false, var37 >>> 16);
                    }
                    if (var40 != null) {
                        var20 |= var40.method2049(-79, var37);
                        var19 |= var40.method2047(var37, -423207056);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class18 var49 = class180.field2678;
        class100 var50;
        synchronized (class180.field2678) {
            var50 = (class100) class180.field2678.method103(0, var15);
        }
        class419 var51 = null;
        if (this.field2341 != -1) {
            var51 = class248.method1789((byte) 92, this.field2341);
        }
        if (var50 == null || arg7.method677(var50.method560(), var14) != 0 || var51 != null && var51.field6106 != null && this.field2330 == null) {
            if (var50 != null) {
                var14 = arg7.method713(var14, var50.method560());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field2332 != -1L) {
                            class18 var81 = class180.field2678;
                            synchronized (class180.field2678) {
                                var50 = (class100) class180.field2678.method103(0, this.field2332);
                            }
                        }
                        if (var50 == null || arg7.method677(var50.method560(), var14) != 0 || var51 != null && var51.field6106 != null && this.field2330 == null) {
                            return null;
                        }
                    } else {
                        class382[] var56 = new class382[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class382 var59 = class206.method1561(-82, var58 & 0x3FFFFFFF).method1059((byte) -32, this.field2346);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            } else if ((var58 & Integer.MIN_VALUE) != 0) {
                                class382 var60 = class91.method773(14038, var58 & 0x3FFFFFFF).method1424(0);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            }
                        }
                        if (var51 != null && var51.field6106 != null) {
                            for (int var61 = 0; var61 < var51.field6106.length; var61++) {
                                if (var51.field6106[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field6106[var61][0];
                                    int var63 = var51.field6106[var61][1];
                                    int var64 = var51.field6106[var61][2];
                                    int var65 = var51.field6106[var61][3] << 3;
                                    int var66 = var51.field6106[var61][4] << 3;
                                    int var67 = var51.field6106[var61][5] << 3;
                                    if (this.field2330 == null) {
                                        this.field2330 = new int[var51.field6106.length][];
                                    }
                                    if (this.field2330[var61] == null) {
                                        int[] var68 = this.field2330[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[14] = -var64;
                                            var68[12] = -var62;
                                            var68[13] = -var63;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                        } else {
                                            int var69 = class56.field898[var65];
                                            int var70 = class56.field897[var65];
                                            int var71 = class56.field898[var66];
                                            int var72 = class56.field897[var66];
                                            int var73 = class56.field898[var67];
                                            int var74 = class56.field897[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[0] = var71 * var73 - (-(var72 * var76) - 16384) >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + var72 * var75 + 16384 >> 15;
                                            var68[6] = -var72 * var73 + (var71 * var76) + 16384 >> 15;
                                            var68[14] = var68[2] * -var62 + 16384 - (-(var68[5] * -var63) - var68[8] * -var64) >> 15;
                                            var68[13] = var68[7] * -var64 + var68[4] * -var63 + var68[1] * -var62 + 16384 >> 15;
                                            var68[12] = var68[3] * -var63 + var68[6] * -var64 + var68[0] * -var62 + 16384 >> 15;
                                        }
                                        var68[11] = var64;
                                        var68[10] = var63;
                                        var68[9] = var62;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method2423(var67, var66, -103, var65);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method2415(var63, var64, var62, (byte) -103);
                                    }
                                }
                            }
                        }
                        int var77 = var14 | 0x2000;
                        class382 var78 = new class382(var56, var56.length);
                        var50 = arg7.method735(var78, var77, class42.field637, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (class196.field2874[var79].length > this.field2339[var79]) {
                                var50.method554(class365.field5199[var79], class196.field2874[var79][this.field2339[var79]]);
                            }
                            if (class416.field6026[var79].length > this.field2339[var79]) {
                                var50.method554(class383.field5473[var79], class416.field6026[var79][this.field2339[var79]]);
                            }
                        }
                        if (arg3) {
                            var50.method525(var14);
                            class18 var80 = class180.field2678;
                            synchronized (class180.field2678) {
                                class180.field2678.method113(var50, 0, var15);
                            }
                            this.field2332 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class91.method773(14038, var55 & 0x3FFFFFFF).method1426(104)) {
                        var53 = true;
                    }
                } else if (!class206.method1561(125, var55 & 0x3FFFFFFF).method1046(22271, this.field2346)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class100 var82 = var50.method518((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class292.field4345[var83] != null) {
                var82.method833(class334.field4791[var83] - 1, class292.field4345[var83], class439.field6384[var83], this.field2330 == null ? null : this.field2330[var83], class291.field4328[var83], class268.field4021[var83], class88.field1406[var83], 0, var84, 0, false);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (arg5 < 69) {
            this.method1172(true, true);
        }
        if (var34 != null && var39 != null) {
            var82.method828(arg0.field830, var36, var31, var32, var33, var40, false, var35, var37, var34, arg10 - 1, (byte) 3, var39, var38, arg12 - 1);
        } else if (var34 != null) {
            var82.method829(var34, var32, var33, false, -72, var35, 0, arg10 - 1, var31);
        } else if (var39 != null) {
            var82.method829(var39, var37, var38, false, -119, var40, 0, arg12 - 1, var36);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class292.field4345[var85] = null;
            class439.field6384[var85] = null;
            class263.field3966[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static void method1176(byte arg0) {
        field2329 = null;
        int var1 = -105 / ((arg0 + 68) / 52);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
    public final void method1177(int arg0, int arg1, int arg2) {
        field2324++;
        int var4 = class74.field1272[arg1];
        if (this.field2344[var4] != arg2 && class91.method773(14038, arg0) != null) {
            this.field2344[var4] = class439.method2744(arg0, Integer.MIN_VALUE);
            this.method1173(-8265);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI[IZ[I)V")
    public final void method1178(int arg0, byte arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        if (this.field2341 != arg2) {
            this.field2330 = null;
            this.field2341 = arg2;
        }
        field2347++;
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class303.field4421; var8++) {
                    class183 var9 = class91.method773(14038, var8);
                    if (var9 != null && !var9.field2708 && (arg4 ? class297.field4401[var7] : class367.field5224[var7]) == var9.field2701) {
                        arg5[class74.field1272[var7]] = class439.method2744(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field2346 = arg4;
        if (arg1 >= -77) {
            this.field2346 = false;
        }
        this.field2344 = arg5;
        this.field2339 = arg3;
        this.field2343 = arg0;
        this.method1173(-8265);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILbq;ILja;IIIII)Lrc;")
    public final class100 method1179(int arg0, int arg1, class51 arg2, int arg3, class90 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2333++;
        int var11 = arg5;
        if (arg2 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg5 | 0x20;
            Object var18 = null;
            int var19 = arg2.field835[arg0];
            int var20 = var19 >>> 16;
            int var21 = var19 & 0xFFFF;
            class293 var22 = class132.method1099(false, var20);
            if (var22 != null) {
                var13 |= var22.method2049(-121, var21);
                var12 |= var22.method2047(var21, -423207056);
                var14 |= arg2.field828;
            }
            if ((arg2.field818 || class221.field3301) && arg9 != -1 && arg9 < arg2.field835.length) {
                int var23 = arg2.field835[arg9];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class293 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class132.method1099(false, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method2049(-74, var25);
                    var12 |= var26.method2047(var25, -423207056);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg6 << 32 | (long) (arg8 << 16) | (long) arg3;
        class18 var29 = class39.field600;
        class100 var30;
        synchronized (class39.field600) {
            var30 = (class100) class39.field600.method103(0, var27);
        }
        if (var30 == null || arg4.method677(var30.method560(), var11) != 0) {
            if (var30 != null) {
                var11 = arg4.method713(var11, var30.method560());
            }
            class382[] var32 = new class382[3];
            int var33 = 0;
            if (!class91.method773(14038, arg3).method1430(arg1 ^ 0x872) || !class91.method773(arg1 ^ 0xFFFFC15B, arg8).method1430(-1) || !class91.method773(arg1 ^ 0xFFFFC15B, arg6).method1430(arg1 ^ 0x872)) {
                return null;
            }
            class382 var34 = class91.method773(14038, arg3).method1425(arg1 - 388);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class382 var35 = class91.method773(14038, arg8).method1425(-2551);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class382 var36 = class91.method773(14038, arg6).method1425(-2551);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class382 var38 = new class382(var32, var33);
            var30 = arg4.method735(var38, var37, class42.field637, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field2339[var39] < class196.field2874[var39].length) {
                    var30.method554(class365.field5199[var39], class196.field2874[var39][this.field2339[var39]]);
                }
                if (this.field2339[var39] < class416.field6026[var39].length) {
                    var30.method554(class383.field5473[var39], class416.field6026[var39][this.field2339[var39]]);
                }
            }
            var30.method525(var11);
            class18 var40 = class39.field600;
            synchronized (class39.field600) {
                class39.field600.method113(var30, arg1 + 2163, var27);
            }
        }
        if (arg2 == null) {
            return var30;
        }
        class100 var41 = var30.method518((byte) 1, var11, true);
        class100 var42 = arg2.method412(arg1 ^ 0x807, arg7, arg9, arg0, arg5, var41);
        if (arg1 != -2163) {
            method1184('u', 24);
        }
        return var42;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
    public static final void method1180(byte arg0) {
        field2331++;
        class18 var1 = class46.field747;
        synchronized (class46.field747) {
            class46.field747.method112(arg0 ^ 0xFFFFFFEC);
        }
        class18 var2 = class234.field3391;
        synchronized (class234.field3391) {
            class234.field3391.method112(0);
        }
        class18 var3 = class61.field984;
        synchronized (class61.field984) {
            class61.field984.method112(0);
            if (arg0 != -20) {
                field2329 = null;
            }
        }
        class18 var4 = class75.field1286;
        synchronized (class75.field1286) {
            class75.field1286.method112(0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILja;ILbq;I)Lrc;")
    public final class100 method1181(int arg0, int arg1, int arg2, class90 arg3, int arg4, class51 arg5, int arg6) {
        field2335++;
        if (this.field2343 != -1) {
            return class371.method2357(this.field2343, -13299).method70(arg0, arg5, arg3, arg2, 569, arg4, arg1);
        }
        int var8 = arg2;
        if (arg5 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            int var15 = arg5.field835[arg1];
            var8 = arg2 | 0x20;
            Object var16 = null;
            int var17 = var15 >>> 16;
            class293 var18 = class132.method1099(false, var17);
            int var19 = var15 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method2049(-110, var19);
                var9 |= var18.method2047(var19, -423207056);
                var11 |= arg5.field828;
            }
            if ((arg5.field818 || class221.field3301) && arg0 != -1 && arg5.field835.length > arg0) {
                int var20 = arg5.field835[arg0];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class293 var23;
                if (var17 == var21) {
                    var23 = var18;
                } else {
                    var23 = class132.method1099(false, var22 >>> 16);
                }
                if (var23 != null) {
                    var10 |= var23.method2049(-83, var22);
                    var9 |= var23.method2047(var22, -423207056);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class18 var24 = class39.field600;
        class100 var25;
        synchronized (class39.field600) {
            if (arg6 != 1073741823) {
                this.method1175((class51) null, (class51) null, 117, false, 121, (byte) 67, (class109[]) null, (class90) null, -32, 96, -99, -93, -108);
            }
            var25 = (class100) class39.field600.method103(0, this.field2348);
        }
        if (var25 == null || arg3.method677(var25.method560(), var8) != 0) {
            if (var25 != null) {
                var8 = arg3.method713(var8, var25.method560());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field2344[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var29) != 0 && !class91.method773(14038, var29 & 0x3FFFFFFF).method1430(-1)) {
                        var27 = true;
                    }
                } else if (!class206.method1561(96, var29 & 0x3FFFFFFF).method1058(126, this.field2346)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class382[] var30 = new class382[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field2344[var32];
                if ((var33 & 0x40000000) != 0) {
                    class382 var34 = class206.method1561(arg6 - 1073741933, var33 & 0x3FFFFFFF).method1057(this.field2346, 10263);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class382 var35 = class91.method773(arg6 - 1073727785, var33 & 0x3FFFFFFF).method1425(-2551);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            int var36 = var8 | 0x2000;
            class382 var37 = new class382(var30, var31);
            var25 = arg3.method735(var37, var36, class42.field637, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (this.field2339[var38] < class196.field2874[var38].length) {
                    var25.method554(class365.field5199[var38], class196.field2874[var38][this.field2339[var38]]);
                }
                if (class416.field6026[var38].length > this.field2339[var38]) {
                    var25.method554(class383.field5473[var38], class416.field6026[var38][this.field2339[var38]]);
                }
            }
            var25.method525(var8);
            class18 var39 = class39.field600;
            synchronized (class39.field600) {
                class39.field600.method113(var25, 0, this.field2348);
            }
        }
        if (arg5 == null) {
            return var25;
        } else {
            var25.method518((byte) 1, var8, true);
            return arg5.method412(arg6 ^ 0xC000005E, arg4, arg0, arg1, arg2, var25);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
    public final void method1182(int arg0, int arg1, int arg2) {
        int var4 = -36 / ((arg0 + 3) / 46);
        this.field2339[arg1] = arg2;
        field2334++;
        this.method1173(-8265);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method1183(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field2327++;
        class258 var5 = class102.method849((byte) -105, arg4, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field3831 != null) {
            class254 var6 = new class254();
            var6.field3678 = var5;
            var6.field3677 = arg2;
            var6.field3679 = arg3;
            var6.field3683 = var5.field3831;
            class216.method1636(var6);
        }
        boolean var7 = true;
        if (var5.field3821 > 0) {
            var7 = class52.method418(250, var5);
        }
        if (!var7 || !client.method1815(var5).method2617(arg3 - 1, 27)) {
            return;
        }
        if (arg3 == 1) {
            class129.field2098++;
            class13.field216.method2781(false, 166);
            class13.field216.method275(arg4, 1414495172);
            class13.field216.method324(arg1, -44);
        }
        if (arg3 == 2) {
            class32.field457++;
            class13.field216.method2781(false, 102);
            class13.field216.method275(arg4, arg0 + 1414467747);
            class13.field216.method324(arg1, -111);
        }
        if (arg3 == 3) {
            class1.field1++;
            class13.field216.method2781(false, 144);
            class13.field216.method275(arg4, arg0 ^ 0x544F10E5);
            class13.field216.method324(arg1, -70);
        }
        if (arg3 == 4) {
            class13.field216.method2781(false, 123);
            class379.field5383++;
            class13.field216.method275(arg4, 1414495172);
            class13.field216.method324(arg1, arg0 - 27471);
        }
        if (arg0 != 27425) {
            return;
        }
        if (arg3 == 5) {
            class73.field1216++;
            class13.field216.method2781(false, 63);
            class13.field216.method275(arg4, 1414495172);
            class13.field216.method324(arg1, arg0 - 27484);
        }
        if (arg3 == 6) {
            class66.field1067++;
            class13.field216.method2781(false, 199);
            class13.field216.method275(arg4, 1414495172);
            class13.field216.method324(arg1, -72);
        }
        if (arg3 == 7) {
            class13.field216.method2781(false, 3);
            class356.field5058++;
            class13.field216.method275(arg4, arg0 + 1414467747);
            class13.field216.method324(arg1, -62);
        }
        if (arg3 == 8) {
            class190.field2825++;
            class13.field216.method2781(false, 6);
            class13.field216.method275(arg4, 1414495172);
            class13.field216.method324(arg1, -40);
        }
        if (arg3 == 9) {
            class13.field216.method2781(false, 229);
            class132.field2129++;
            class13.field216.method275(arg4, arg0 + 1414467747);
            class13.field216.method324(arg1, -121);
        }
        if (arg3 == 10) {
            class293.field4351++;
            class13.field216.method2781(false, 203);
            class13.field216.method275(arg4, 1414495172);
            class13.field216.method324(arg1, -95);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(CI)Z")
    public static final boolean method1184(char arg0, int arg1) {
        field2336++;
        if (arg1 != 7) {
            field2329 = null;
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
