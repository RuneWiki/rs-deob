import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class293 {

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
    public static int[] field4689 = new int[14];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static volatile int field4683 = 0;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
    public static int[] field4705 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lul;")
    public static class51 field4695 = new class51(500);

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4708 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    private int field4704;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "J")
    private long field4687;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "J")
    private long field4702;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Z")
    public boolean field4682;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    public static int[] field4696;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[I")
    public int[] field4698;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[I")
    private int[] field4699;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "[S")
    public static short[] field4707;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[[I")
    private int[][] field4701;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V", line = 8)
    public final void method1999(boolean arg0, int arg1) {
        this.field4682 = arg0;
        field4684++;
        int var3 = 50 / ((arg1 + 70) / 52);
        this.method2002(true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwi;IIIB)Lgk;", line = 19)
    public final class10 method2000(class285 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4706++;
        if (this.field4692 != -1) {
            return class224.method1637(this.field4692, (byte) 126).method126(arg1, arg3, 12278, arg0, arg2);
        }
        int var6 = -74 % ((arg4 - 42) / 63);
        class10 var7 = (class10) class250.field4053.method467(true, this.field4687);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var10 = this.field4699[var9];
                if ((var10 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var10) != 0 && !class71.method677(var10 & 0x3FFFFFFF, false).method647(-71)) {
                        var8 = true;
                    }
                } else if (!class5.method31(-1731690365, var10 & 0x3FFFFFFF).method1098(this.field4682, 25013)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class307[] var11 = new class307[12];
            int var12 = 0;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = this.field4699[var13];
                if ((var14 & 0x40000000) != 0) {
                    class307 var16 = class5.method31(-1731690365, var14 & 0x3FFFFFFF).method1099(121, this.field4682);
                    if (var16 != null) {
                        var11[var12++] = var16;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class307 var15 = class71.method677(var14 & 0x3FFFFFFF, false).method652((byte) 75);
                    if (var15 != null) {
                        var11[var12++] = var15;
                    }
                }
            }
            class307 var17 = new class307(var11, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4698[var18] < class311.field4934[var18].length) {
                    var17.method2108(field4707[var18], class311.field4934[var18][this.field4698[var18]]);
                }
                if (class228.field3830[var18].length > this.field4698[var18]) {
                    var17.method2108(class145.field2634[var18], class228.field3830[var18][this.field4698[var18]]);
                }
            }
            var7 = var17.method2104(64, 768, -50, -10, -50);
            class250.field4053.method465(var7, this.field4687, (byte) 99);
        }
        if (arg0 != null) {
            var7 = arg0.method1941(arg2, arg3, -23286, arg1, var7);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLwi;ILwi;II[Lui;IIII)Lgk;", line = 133)
    public final class10 method2001(boolean arg0, class285 arg1, int arg2, class285 arg3, int arg4, int arg5, class288[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field4697++;
        if (this.field4692 != -1) {
            return class224.method1637(this.field4692, (byte) 124).method120(arg2, arg10, arg7, arg6, arg3, true, arg4, arg5, arg8, arg1);
        }
        long var12 = this.field4687;
        int[] var14 = this.field4699;
        if (arg3 != null && (arg3.field4520 >= 0 || arg3.field4528 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field4699[var15];
            }
            if (arg3.field4520 >= 0) {
                if (arg3.field4520 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class144.method1159(1073741824, arg3.field4520);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field4528 >= 0) {
                if (arg3.field4528 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class144.method1159(arg3.field4528, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class10 var16 = (class10) class57.field882.method467(true, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class71.method677(var19 & 0x3FFFFFFF, false).method645(0)) {
                        var17 = true;
                    }
                } else if (!class5.method31(-1731690365, var19 & 0x3FFFFFFF).method1093(this.field4682, (byte) -6)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field4702 != -1L) {
                    var16 = (class10) class57.field882.method467(true, this.field4702);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class307[] var20 = new class307[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class307 var24 = class5.method31(-1731690365, var22 & 0x3FFFFFFF).method1094(-24524, this.field4682);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class307 var23 = class71.method677(var22 & 0x3FFFFFFF, false).method648(arg9 + 31716);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class346 var25 = null;
                if (this.field4704 != -1) {
                    var25 = class126.method1050(this.field4704, -108);
                }
                if (var25 != null && var25.field5525 != null) {
                    for (int var26 = 0; var26 < var25.field5525.length; var26++) {
                        if (var25.field5525[var26] != null && var20[var26] != null) {
                            int var27 = var25.field5525[var26][0];
                            int var28 = var25.field5525[var26][2];
                            int var29 = var25.field5525[var26][1];
                            int var30 = var25.field5525[var26][4];
                            int var31 = var25.field5525[var26][3];
                            int var32 = var25.field5525[var26][5];
                            if (this.field4701 == null) {
                                this.field4701 = new int[var25.field5525.length][];
                            }
                            if (this.field4701[var26] == null) {
                                int[] var33 = this.field4701[var26] = new int[15];
                                if (var31 == 0 && var30 == 0 && var32 == 0) {
                                    var33[12] = -var27;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[14] = -var28;
                                    var33[13] = -var29;
                                } else {
                                    int var34 = class62.field961[var31] >> 1;
                                    int var35 = class62.field961[var30] >> 1;
                                    int var36 = class62.field962[var31] >> 1;
                                    int var37 = class62.field962[var30] >> 1;
                                    int var38 = class62.field961[var32] >> 1;
                                    int var39 = var36 * var38 + 16384 >> 15;
                                    int var40 = class62.field962[var32] >> 1;
                                    var33[4] = var34 * var38 + 16384 >> 15;
                                    var33[8] = var34 * var35 + 16384 >> 15;
                                    var33[5] = -var36;
                                    var33[7] = var35 * var39 + -var37 * -var40 + 16384 >> 15;
                                    var33[1] = -var40 * var35 + var37 * var39 + 16384 >> 15;
                                    var33[3] = var34 * var40 + 16384 >> 15;
                                    var33[13] = var33[7] * -var28 + var33[1] * -var27 + (var33[4] * -var29) + 16384 >> 15;
                                    int var41 = var36 * var40 + 16384 >> 15;
                                    var33[2] = var34 * var37 + 16384 >> 15;
                                    var33[0] = var37 * var41 + (var35 * var38 + 16384) >> 15;
                                    var33[14] = var33[5] * -var29 + var33[2] * -var27 + (var33[8] * -var28) + 16384 >> 15;
                                    var33[6] = -var37 * var38 + var35 * var41 + 16384 >> 15;
                                    var33[12] = var33[6] * -var28 + var33[0] * -var27 + (var33[3] * -var29) + 16384 >> 15;
                                }
                                var33[11] = var28;
                                var33[9] = var27;
                                var33[10] = var29;
                            }
                            if (var31 != 0 || var30 != 0 || var32 != 0) {
                                var20[var26].method2126(var31, var30, var32);
                            }
                            if (var27 != 0 || var29 != 0 || var28 != 0) {
                                var20[var26].method2109(var27, var29, var28);
                            }
                        }
                    }
                }
                class307 var42 = new class307(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (this.field4698[var43] < class311.field4934[var43].length) {
                        var42.method2108(field4707[var43], class311.field4934[var43][this.field4698[var43]]);
                    }
                    if (this.field4698[var43] < class228.field3830[var43].length) {
                        var42.method2108(class145.field2634[var43], class228.field3830[var43][this.field4698[var43]]);
                    }
                }
                var16 = var42.method2104(64, 850, -30, -50, -30);
                if (class43.field680) {
                    ((class183) var16).method1413(false, false, true, true, false, false, true);
                }
                if (arg0) {
                    class57.field882.method465(var16, var12, (byte) 31);
                    this.field4702 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg6 == null ? 0 : arg6.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg6[var49] != null) {
                class285 var50 = class346.method2428(arg6[var49].field4596, (byte) -24);
                if (var50.field4531 != null) {
                    var44 = true;
                    class154.field2747[var49] = var50;
                    int var51 = arg6[var49].field4589;
                    int var52 = arg6[var49].field4600;
                    int var53 = var50.field4531[var51];
                    class85.field1362[var49] = class297.method2027(class289.method1969(arg9, 5), var53 >>> 16);
                    int var54 = var53 & 0xFFFF;
                    class310.field4914[var49] = var54;
                    if (class85.field1362[var49] != null) {
                        var46 |= class85.field1362[var49].method863(var54, 2);
                        var45 |= class85.field1362[var49].method871(var54, -93);
                        var47 |= var50.field4523;
                    }
                    if ((var50.field4516 || class255.field4105) && var52 != -1 && var50.field4531.length > var52) {
                        class57.field871[var49] = var50.field4536[var51];
                        class292.field4680[var49] = arg6[var49].field4595;
                        int var55 = var50.field4531[var52];
                        class199.field3399[var49] = class297.method2027(0, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class68.field1098[var49] = var56;
                        if (class199.field3399[var49] != null) {
                            var46 |= class199.field3399[var49].method863(var56, arg9 ^ 0x7);
                            var45 |= class199.field3399[var49].method871(var56, -102);
                        }
                    } else {
                        class57.field871[var49] = 0;
                        class292.field4680[var49] = 0;
                        class199.field3399[var49] = null;
                        class68.field1098[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg3 == null && arg1 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        class100 var59 = null;
        class100 var60 = null;
        int var61 = 0;
        if (arg3 != null) {
            int var62 = arg3.field4531[arg2];
            int var63 = var62 >>> 16;
            var60 = class297.method2027(arg9 - 5, var63);
            var57 = var62 & 0xFFFF;
            if (var60 != null) {
                var46 |= var60.method863(var57, arg9 - 3);
                var45 |= var60.method871(var57, -100);
                var47 |= arg3.field4523;
            }
            if ((arg3.field4516 || class255.field4105) && arg7 != -1 && arg7 < arg3.field4531.length) {
                var61 = arg3.field4536[arg2];
                int var64 = arg3.field4531[arg7];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var59 = var60;
                } else {
                    var59 = class297.method2027(0, var58 >>> 16);
                }
                if (var59 != null) {
                    var46 |= var59.method863(var58, 2);
                    var45 |= var59.method871(var58, -108);
                }
            }
        }
        int var66 = -1;
        if (arg9 != 5) {
            return (class10) null;
        }
        int var67 = -1;
        int var68 = 0;
        class100 var69 = null;
        class100 var70 = null;
        if (arg1 != null) {
            int var71 = arg1.field4531[arg10];
            int var72 = var71 >>> 16;
            var66 = var71 & 0xFFFF;
            var69 = class297.method2027(0, var72);
            if (var69 != null) {
                var46 |= var69.method863(var66, 2);
                var45 |= var69.method871(var66, arg9 ^ 0x4A);
                var47 |= arg1.field4523;
            }
            if ((arg1.field4516 || class255.field4105) && arg5 != -1 && arg5 < arg1.field4531.length) {
                var68 = arg1.field4536[arg10];
                int var73 = arg1.field4531[arg5];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var69;
                } else {
                    var70 = class297.method2027(arg9 ^ 0x5, var67 >>> 16);
                }
                if (var70 != null) {
                    var46 |= var70.method863(var67, arg9 ^ 0x7);
                    var45 |= var70.method871(var67, 102);
                }
            }
        }
        class10 var75 = var16.method96(!var45, !var46, !var47);
        int var76 = 0;
        int var77 = 1;
        while (var48 > var76) {
            if (class85.field1362[var76] != null) {
                var75.method101(class85.field1362[var76], class310.field4914[var76], class199.field3399[var76], class68.field1098[var76], class292.field4680[var76] - 1, class57.field871[var76], var77, class154.field2747[var76].field4523, this.field4701[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var60 != null && var69 != null) {
            var75.method76(var60, var57, var59, var58, arg4 - 1, var61, var69, var66, var70, var67, arg8 - 1, var68, arg3.field4529, arg1.field4523 | arg3.field4523);
        } else if (var60 != null) {
            var75.method93(var60, var57, var59, var58, arg4 - 1, var61, arg3.field4523);
        } else if (var69 != null) {
            var75.method93(var69, var66, var70, var67, arg8 - 1, var68, arg1.field4523);
        }
        for (int var78 = 0; var78 < var48; var78++) {
            class85.field1362[var78] = null;
            class199.field3399[var78] = null;
            class154.field2747[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 615)
    private final void method2002(boolean arg0) {
        field4685++;
        long var2 = this.field4687;
        long[] var4 = class161.field2857;
        this.field4687 = -1L;
        this.field4687 = this.field4687 >>> 8 ^ var4[(int) (((long) (this.field4704 >> 8) ^ this.field4687) & 0xFFL)];
        this.field4687 = this.field4687 >>> 8 ^ var4[(int) ((this.field4687 ^ (long) this.field4704) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4687 = this.field4687 >>> 8 ^ var4[(int) ((this.field4687 ^ (long) (this.field4699[var5] >> 24)) & 0xFFL)];
            this.field4687 = this.field4687 >>> 8 ^ var4[(int) (((long) (this.field4699[var5] >> 16) ^ this.field4687) & 0xFFL)];
            this.field4687 = var4[(int) (((long) (this.field4699[var5] >> 8) ^ this.field4687) & 0xFFL)] ^ this.field4687 >>> 8;
            this.field4687 = this.field4687 >>> 8 ^ var4[(int) ((this.field4687 ^ (long) this.field4699[var5]) & 0xFFL)];
        }
        if (!arg0) {
            return;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4687 = var4[(int) (((long) this.field4698[var6] ^ this.field4687) & 0xFFL)] ^ this.field4687 >>> 8;
        }
        this.field4687 = var4[(int) ((this.field4687 ^ (long) (this.field4682 ? 1 : 0)) & 0xFFL)] ^ this.field4687 >>> 8;
        if (var2 != 0L && this.field4687 != var2) {
            class57.field882.method473(26, var2);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 661)
    public static void method2003(byte arg0) {
        field4705 = null;
        field4689 = null;
        field4707 = null;
        field4696 = null;
        field4695 = null;
        if (arg0 != 99) {
            field4705 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIILwi;III)Lgk;", line = 678)
    public final class10 method2004(int arg0, int arg1, int arg2, int arg3, class285 arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) arg0 | (long) arg3 << 32 | (long) (arg2 << 16);
        class10 var11 = (class10) class250.field4053.method467(true, var9);
        field4688++;
        if (var11 == null) {
            int var12 = 0;
            class307[] var13 = new class307[3];
            if (!class71.method677(arg0, false).method647(-77) || !class71.method677(arg2, false).method647(-127) || !class71.method677(arg3, false).method647(-71)) {
                return null;
            }
            class307 var14 = class71.method677(arg0, false).method652((byte) 75);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class307 var15 = class71.method677(arg2, false).method652((byte) 75);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class307 var16 = class71.method677(arg3, false).method652((byte) 75);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class307 var17 = new class307(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4698[var18] < class311.field4934[var18].length) {
                    var17.method2108(field4707[var18], class311.field4934[var18][this.field4698[var18]]);
                }
                if (this.field4698[var18] < class228.field3830[var18].length) {
                    var17.method2108(class145.field2634[var18], class228.field3830[var18][this.field4698[var18]]);
                }
            }
            var11 = var17.method2104(64, 768, -50, -10, -50);
            class250.field4053.method465(var11, var9, (byte) 39);
        }
        if (arg5 < 5) {
            this.method1999(false, -15);
        }
        if (arg4 != null) {
            var11 = arg4.method1941(arg1, arg6, -23286, arg7, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[Lwb;", line = 746)
    public static final class171[] method2005(int arg0) {
        field4690++;
        class171[] var1 = new class171[class130.field2242];
        for (int var2 = 0; var2 < class130.field2242; var2++) {
            byte[] var3 = class191.field3205[var2];
            int var4 = class39.field585[var2] * class123.field2138[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class40.field600[class36.method319(255, var3[var6])];
            }
            if (class43.field680) {
                var1[var2] = new class157(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var5);
            } else {
                var1[var2] = new class309(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var5);
            }
        }
        if (arg0 != -2055168936) {
            field4695 = (class51) null;
        }
        class15.method151(0);
        return var1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 786)
    public final void method2006(int arg0, int arg1, int arg2) {
        field4700++;
        int var4 = class215.field3611[arg0];
        if (this.field4699[var4] != 0 && class71.method677(arg2, false) != null) {
            this.field4699[var4] = class144.method1159(arg2, arg1);
            this.method2002(true);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ[I[III)V", line = 804)
    public final void method2007(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        field4691++;
        if (arg0 != 12) {
            this.method2002(false);
        }
        if (this.field4704 != arg5) {
            this.field4701 = (int[][]) null;
            this.field4704 = arg5;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class110.field1862; var8++) {
                    class67 var9 = class71.method677(var8, false);
                    if (var9 != null && !var9.field1073 && var9.field1082 == (arg1 ? class68.field1112[var7] : class93.field1467[var7])) {
                        arg3[class215.field3611[var7]] = class144.method1159(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field4699 = arg3;
        this.field4698 = arg2;
        this.field4682 = arg1;
        this.field4692 = arg4;
        this.method2002(true);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I", line = 864)
    public final int method2008(int arg0) {
        if (arg0 <= 93) {
            this.method2000((class285) null, -124, 103, -34, (byte) 30);
        }
        field4703++;
        return this.field4692 == -1 ? (this.field4698[4] << 20) + (this.field4698[0] << 25) + (this.field4699[11] << 5) + this.field4699[1] + (this.field4699[8] << 10) + (this.field4699[0] << 15) : 305419896 - -class224.method1637(this.field4692, (byte) 118).field151;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIBIII)V", line = 890)
    public static final void method2009(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4694++;
        if (arg4 >= 122 && class272.method1863(-671591600, arg7)) {
            client.method1896(class109.field1852[arg7], -1, arg0, arg2, arg6, arg3, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 906)
    public static final boolean method2010(byte arg0, String arg1) {
        field4686++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 22) {
            method2009(-125, -55, 106, 83, (byte) -94, -34, 68, -128);
        }
        for (int var2 = 0; var2 < class200.field3424; var2++) {
            if (arg1.equalsIgnoreCase(class264.field4270[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V", line = 934)
    public final void method2011(int arg0, int arg1, boolean arg2) {
        field4693++;
        this.field4698[arg1] = arg0;
        this.method2002(true);
        if (arg2) {
            this.field4704 = 92;
        }
    }
}
