import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class69 {

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field977 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
    public static boolean field978 = false;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field973 = "Attack";

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field969 = "Loaded interfaces";

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Llh;")
    public static class58 field966 = new class58();

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "J")
    private long field970;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "J")
    private long field982;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    private int[] field974;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
    public int[] field990;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[[I")
    private int[][] field979;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZLwk;IIILwk;IZ[Lje;)Lmi;")
    public final class94 method452(int arg0, int arg1, int arg2, boolean arg3, class195 arg4, int arg5, int arg6, int arg7, class195 arg8, int arg9, boolean arg10, class113[] arg11) {
        field975++;
        if (this.field980 != -1) {
            return class76.method499((byte) 82, this.field980).method1321(arg2, arg5, arg4, arg7, 125, arg9, arg0, arg8, arg11, arg6);
        }
        int[] var13 = this.field974;
        long var14 = this.field982;
        if (arg8 != null && (arg8.field2973 >= 0 || arg8.field2971 >= 0)) {
            var13 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var13[var16] = this.field974[var16];
            }
            if (arg8.field2973 >= 0) {
                if (arg8.field2973 == 65535) {
                    var13[5] = 0;
                    var14 ^= 0xFFFFFFFF00000000L;
                } else {
                    var13[5] = class161.method1003(1073741824, arg8.field2973);
                    var14 ^= (long) var13[5] << 32;
                }
            }
            if (arg8.field2971 >= 0) {
                if (arg8.field2971 == 65535) {
                    var14 ^= 0xFFFFFFFFL;
                    var13[3] = 0;
                } else {
                    var13[3] = class161.method1003(1073741824, arg8.field2971);
                    var14 ^= (long) var13[3];
                }
            }
        }
        class94 var17 = (class94) class151.field2094.method950(var14, (byte) -45);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var13[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var44) != 0 && !class262.method1703(var44 & 0x3FFFFFFF, 4096).method1093(arg1 ^ 0xFFFF)) {
                        var18 = true;
                    }
                } else if (!class281.method1822((byte) -108, var44 & 0x3FFFFFFF).method61(0, this.field968)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field970 != -1L) {
                    var17 = (class94) class151.field2094.method950(this.field970, (byte) -45);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class162[] var20 = new class162[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var13[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class162 var42 = class281.method1822((byte) -126, var41 & 0x3FFFFFFF).method57(true, this.field968);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    } else if ((var41 & Integer.MIN_VALUE) != 0) {
                        class162 var43 = class262.method1703(var41 & 0x3FFFFFFF, 4096).method1089(false);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    }
                }
                class85 var22 = null;
                if (this.field994 != -1) {
                    var22 = class189.method1193(arg1 - 32915, this.field994);
                }
                if (var22 != null && var22.field1198 != null) {
                    for (int var23 = 0; var23 < var22.field1198.length; var23++) {
                        if (var22.field1198[var23] != null && var20[var23] != null) {
                            int var24 = var22.field1198[var23][1];
                            int var25 = var22.field1198[var23][0];
                            int var26 = var22.field1198[var23][2];
                            int var27 = var22.field1198[var23][3];
                            int var28 = var22.field1198[var23][4];
                            int var29 = var22.field1198[var23][5];
                            if (this.field979 == null) {
                                this.field979 = new int[var22.field1198.length][];
                            }
                            if (this.field979[var23] == null) {
                                int[] var30 = this.field979[var23] = new int[15];
                                if (var27 == 0 && var28 == 0 && var29 == 0) {
                                    var30[13] = -var24;
                                    var30[14] = -var26;
                                    var30[0] = var30[4] = var30[8] = 32768;
                                    var30[12] = -var25;
                                } else {
                                    int var31 = class118.field1690[var27] >> 1;
                                    int var32 = class118.field1697[var27] >> 1;
                                    int var33 = class118.field1697[var28] >> 1;
                                    int var34 = class118.field1690[var28] >> 1;
                                    int var35 = class118.field1697[var29] >> 1;
                                    int var36 = var32 * var35 + 16384 >> 15;
                                    int var37 = class118.field1690[var29] >> 1;
                                    var30[3] = var31 * var35 + 16384 >> 15;
                                    var30[5] = -var32;
                                    var30[6] = -var33 * var37 + (var34 * var36) + 16384 >> 15;
                                    var30[0] = var33 * var36 + var34 * var37 + 16384 >> 15;
                                    var30[4] = var31 * var37 + 16384 >> 15;
                                    var30[2] = var31 * var33 + 16384 >> 15;
                                    var30[8] = var31 * var34 + 16384 >> 15;
                                    var30[12] = var30[6] * -var26 + var30[3] * -var24 + var30[0] * -var25 + 16384 >> 15;
                                    int var38 = var32 * var37 + 16384 >> 15;
                                    var30[14] = var30[5] * -var24 + (var30[2] * -var25 + (var30[8] * -var26)) + 16384 >> 15;
                                    var30[7] = -var33 * -var35 + (var34 * var38) + 16384 >> 15;
                                    var30[1] = -var35 * var34 + (var33 * var38) + 16384 >> 15;
                                    var30[13] = var30[7] * -var26 + (var30[1] * -var25 + (var30[4] * -var24)) + 16384 >> 15;
                                }
                                var30[10] = var24;
                                var30[11] = var26;
                                var30[9] = var25;
                            }
                            if (var27 != 0 || var28 != 0 || var29 != 0) {
                                var20[var23].method1032(var27, var28, var29);
                            }
                            if (var25 != 0 || var24 != 0 || var26 != 0) {
                                var20[var23].method1012(var25, var24, var26);
                            }
                        }
                    }
                }
                class162 var39 = new class162(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (class307.field4938[var40].length > this.field990[var40]) {
                        var39.method1034(class221.field3439[var40], class307.field4938[var40][this.field990[var40]]);
                    }
                    if (this.field990[var40] < class265.field4264[var40].length) {
                        var39.method1034(class104.field1503[var40], class265.field4264[var40][this.field990[var40]]);
                    }
                }
                var17 = var39.method1024(64, 850, -30, -50, -30);
                if (arg3) {
                    class151.field2094.method942(var14, (byte) 119, var17);
                    this.field970 = var14;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg11 == null ? 0 : arg11.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg11[var50] != null) {
                class195 var73 = class280.method1815(arg11[var50].field1619, 107);
                if (var73.field2989 != null) {
                    class117.field1681[var50] = var73;
                    var45 = true;
                    int var74 = arg11[var50].field1626;
                    int var75 = arg11[var50].field1620;
                    int var76 = var73.field2989[var74];
                    class6.field53[var50] = class235.method1541(var76 >>> 16, -59);
                    int var77 = var76 & 0xFFFF;
                    class43.field638[var50] = var77;
                    if (class6.field53[var50] != null) {
                        var46 |= class6.field53[var50].method523(var77, 110);
                        var47 |= class6.field53[var50].method520(var77, 7502);
                        var48 |= var73.field2988;
                    }
                    if ((var73.field2998 || class199.field3035) && var75 != -1 && var75 < var73.field2989.length) {
                        class37.field565[var50] = var73.field2966[var74];
                        class15.field279[var50] = arg11[var50].field1623;
                        int var78 = var73.field2989[var75];
                        class306.field4926[var50] = class235.method1541(var78 >>> 16, -124);
                        int var79 = var78 & 0xFFFF;
                        class149.field2028[var50] = var79;
                        if (class306.field4926[var50] != null) {
                            var46 |= class306.field4926[var50].method523(var79, 103);
                            var47 |= class306.field4926[var50].method520(var79, 7502);
                        }
                    } else {
                        class37.field565[var50] = 0;
                        class15.field279[var50] = 0;
                        class306.field4926[var50] = null;
                        class149.field2028[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg8 != null || arg4 != null) {
            int var51 = -1;
            int var52 = -1;
            class82 var53 = null;
            class82 var54 = null;
            int var55 = 0;
            if (arg8 != null) {
                int var56 = arg8.field2989[arg0];
                int var57 = var56 >>> 16;
                var54 = class235.method1541(var57, -56);
                var51 = var56 & 0xFFFF;
                if (var54 != null) {
                    var46 |= var54.method523(var51, 121);
                    var47 |= var54.method520(var51, arg1 - 58033);
                    var48 |= arg8.field2988;
                }
                if ((arg8.field2998 || class199.field3035) && arg7 != -1 && arg8.field2989.length > arg7) {
                    int var58 = arg8.field2989[arg7];
                    int var59 = var58 >>> 16;
                    var52 = var58 & 0xFFFF;
                    var55 = arg8.field2966[arg0];
                    if (var57 == var59) {
                        var53 = var54;
                    } else {
                        var53 = class235.method1541(var52 >>> 16, arg1 ^ 0xFFFF0043);
                    }
                    if (var53 != null) {
                        var46 |= var53.method523(var52, 93);
                        var47 |= var53.method520(var52, arg1 - 58033);
                    }
                }
            }
            int var60 = -1;
            int var61 = -1;
            int var62 = 0;
            class82 var63 = null;
            class82 var64 = null;
            if (arg4 != null) {
                int var65 = arg4.field2989[arg9];
                int var66 = var65 >>> 16;
                var63 = class235.method1541(var66, arg1 ^ 0xFF8C);
                var61 = var65 & 0xFFFF;
                if (var63 != null) {
                    var46 |= var63.method523(var61, -82);
                    var47 |= var63.method520(var61, 7502);
                    var48 |= arg4.field2988;
                }
                if ((arg4.field2998 || class199.field3035) && arg5 != -1 && arg5 < arg4.field2989.length) {
                    int var67 = arg4.field2989[arg5];
                    int var68 = var67 >>> 16;
                    var62 = arg4.field2966[arg9];
                    var60 = var67 & 0xFFFF;
                    if (var66 == var68) {
                        var64 = var63;
                    } else {
                        var64 = class235.method1541(var60 >>> 16, arg1 ^ 0xFFFF002F);
                    }
                    if (var64 != null) {
                        var46 |= var64.method523(var60, -113);
                        var47 |= var64.method520(var60, 7502);
                    }
                }
            }
            class94 var69 = var17.method436(!var47, !var46, !var48);
            if (arg1 != 65535) {
                field973 = null;
            }
            int var70 = 0;
            int var71 = 1;
            while (var70 < var49) {
                if (class6.field53[var70] != null) {
                    var69.method608(class6.field53[var70], class43.field638[var70], class306.field4926[var70], class149.field2028[var70], class15.field279[var70] - 1, class37.field565[var70], var71, class117.field1681[var70].field2988, this.field979[var70]);
                }
                var70++;
                var71 <<= 0x1;
            }
            if (var54 != null && var63 != null) {
                var69.method606(var54, var51, var53, var52, arg2 - 1, var55, var63, var61, var64, var60, arg6 - 1, var62, arg8.field3000, arg4.field2988 | arg8.field2988);
            } else if (var54 != null) {
                var69.method603(var54, var51, var53, var52, arg2 - 1, var55, arg8.field2988);
            } else if (var63 != null) {
                var69.method603(var63, var61, var64, var60, arg6 - 1, var62, arg4.field2988);
            }
            for (int var72 = 0; var72 < var49; var72++) {
                class6.field53[var72] = null;
                class306.field4926[var72] = null;
                class117.field1681[var72] = null;
            }
            return var69;
        } else if (arg10) {
            return var17.method436(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public final void method453(int arg0, int arg1, int arg2) {
        field988++;
        int var4 = class5.field44[arg1];
        if (arg0 < -127 && this.field974[var4] != 0 && class262.method1703(arg2, 4096) != null) {
            this.field974[var4] = class161.method1003(arg2, Integer.MIN_VALUE);
            this.method461(47);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method454(byte arg0) {
        class245 var1 = class96.field1379;
        synchronized (class96.field1379) {
            int var2 = 32 / ((-arg0 - 1) / 33);
            class182.field2768++;
            class205.field3074 = class168.field2400;
            class17.field304 = class76.field1071;
            class249.field3891 = class84.field1188;
            class2.field15 = class128.field1785;
            class59.field826 = class144.field1967;
            class25.field393 = class116.field1670;
            class251.field3922 = class169.field2411;
            class128.field1785 = 0;
        }
        field981++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIZ[I[I)V")
    public final void method455(byte arg0, int arg1, int arg2, boolean arg3, int[] arg4, int[] arg5) {
        if (this.field994 != arg1) {
            this.field979 = null;
            this.field994 = arg1;
        }
        field983++;
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class13.field205; var8++) {
                    class171 var9 = class262.method1703(var8, 4096);
                    if (var9 != null && !var9.field2431 && var9.field2438 == (arg3 ? class81.field1120[var7] : class91.field1321[var7])) {
                        arg5[class5.field44[var7]] = class161.method1003(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        if (arg0 != -32) {
            return;
        }
        this.field968 = arg3;
        this.field980 = arg2;
        this.field990 = arg4;
        this.field974 = arg5;
        this.method461(47);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)I")
    public final int method456(byte arg0) {
        field993++;
        if (arg0 != -123) {
            this.method462(99, true, 81, -105, 86, -107, (class195) null, 19);
        }
        return this.field980 == -1 ? (this.field974[0] << 15) + (this.field974[8] << 10) + ((this.field990[0] << 25) - -(this.field990[4] << 20)) + (this.field974[11] << 5) + this.field974[1] : class76.method499((byte) 97, this.field980).field3177 + 305419896;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILwk;II)Lmi;")
    public final class94 method457(int arg0, int arg1, class195 arg2, int arg3, int arg4) {
        if (arg4 <= 76) {
            method465((class314) null, -107, 3, -106);
        }
        field971++;
        if (this.field980 != -1) {
            return class76.method499((byte) 53, this.field980).method1317(arg1, 11352, arg0, arg3, arg2);
        }
        class94 var6 = (class94) class9.field101.method950(this.field982, (byte) -45);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field974[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class262.method1703(var17 & 0x3FFFFFFF, 4096).method1087(68)) {
                        var7 = true;
                    }
                } else if (!class281.method1822((byte) -122, var17 & 0x3FFFFFFF).method52((byte) 112, this.field968)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var9 = 0;
            class162[] var10 = new class162[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field974[var11];
                if ((var14 & 0x40000000) != 0) {
                    class162 var16 = class281.method1822((byte) -122, var14 & 0x3FFFFFFF).method64(this.field968, 0);
                    if (var16 != null) {
                        var10[var9++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class162 var15 = class262.method1703(var14 & 0x3FFFFFFF, 4096).method1095((byte) -85);
                    if (var15 != null) {
                        var10[var9++] = var15;
                    }
                }
            }
            class162 var12 = new class162(var10, var9);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field990[var13] < class307.field4938[var13].length) {
                    var12.method1034(class221.field3439[var13], class307.field4938[var13][this.field990[var13]]);
                }
                if (class265.field4264[var13].length > this.field990[var13]) {
                    var12.method1034(class104.field1503[var13], class265.field4264[var13][this.field990[var13]]);
                }
            }
            var6 = var12.method1024(64, 768, -50, -10, -50);
            class9.field101.method942(this.field982, (byte) 100, var6);
        }
        if (arg2 != null) {
            var6 = arg2.method1233(false, arg0, arg1, var6, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BZ)V")
    public final void method458(byte arg0, boolean arg1) {
        field986++;
        this.field968 = arg1;
        if (arg0 == -38) {
            this.method461(47);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI)V")
    public final void method459(int arg0, byte arg1, int arg2) {
        this.field990[arg0] = arg2;
        field987++;
        this.method461(47);
        int var4 = -41 / ((arg1 - 18) / 32);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method460(int arg0) {
        field977 = null;
        if (arg0 < 41) {
            method460(1);
        }
        field969 = null;
        field966 = null;
        field973 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    private final void method461(int arg0) {
        field989++;
        if (arg0 != 47) {
            this.field994 = 52;
        }
        long var2 = this.field982;
        this.field982 = -1L;
        long[] var4 = class256.field4121;
        this.field982 = this.field982 >>> 8 ^ var4[(int) ((this.field982 ^ (long) (this.field994 >> 8)) & 0xFFL)];
        this.field982 = this.field982 >>> 8 ^ var4[(int) ((this.field982 ^ (long) this.field994) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field982 = var4[(int) ((this.field982 ^ (long) (this.field974[var5] >> 24)) & 0xFFL)] ^ this.field982 >>> 8;
            this.field982 = var4[(int) ((this.field982 ^ (long) (this.field974[var5] >> 16)) & 0xFFL)] ^ this.field982 >>> 8;
            this.field982 = this.field982 >>> 8 ^ var4[(int) (((long) (this.field974[var5] >> 8) ^ this.field982) & 0xFFL)];
            this.field982 = var4[(int) (((long) this.field974[var5] ^ this.field982) & 0xFFL)] ^ this.field982 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field982 = this.field982 >>> 8 ^ var4[(int) ((this.field982 ^ (long) this.field990[var6]) & 0xFFL)];
        }
        this.field982 = var4[(int) (((long) (this.field968 ? 1 : 0) ^ this.field982) & 0xFFL)] ^ this.field982 >>> 8;
        if (var2 != 0L && this.field982 != var2) {
            class151.field2094.method951(var2, 0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIIIILwk;I)Lmi;")
    public final class94 method462(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class195 arg6, int arg7) {
        field985++;
        long var9 = (long) arg7 | (long) arg3 << 32 | (long) (arg5 << 16);
        if (arg1) {
            this.field994 = 11;
        }
        class94 var11 = (class94) class9.field101.method950(var9, (byte) -45);
        if (var11 == null) {
            class162[] var12 = new class162[3];
            int var13 = 0;
            if (!class262.method1703(arg7, 4096).method1087(118) || !class262.method1703(arg5, 4096).method1087(-59) || !class262.method1703(arg3, 4096).method1087(87)) {
                return null;
            }
            class162 var14 = class262.method1703(arg7, 4096).method1095((byte) -85);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class162 var15 = class262.method1703(arg5, 4096).method1095((byte) -85);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class162 var16 = class262.method1703(arg3, 4096).method1095((byte) -85);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class162 var17 = new class162(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class307.field4938[var18].length > this.field990[var18]) {
                    var17.method1034(class221.field3439[var18], class307.field4938[var18][this.field990[var18]]);
                }
                if (class265.field4264[var18].length > this.field990[var18]) {
                    var17.method1034(class104.field1503[var18], class265.field4264[var18][this.field990[var18]]);
                }
            }
            var11 = var17.method1024(64, 768, -50, -10, -50);
            class9.field101.method942(var9, (byte) 58, var11);
        }
        if (arg6 != null) {
            var11 = arg6.method1233(arg1, arg4, arg0, var11, arg2);
        }
        return var11;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[B)Lgh;")
    public static final class33 method463(byte arg0, byte[] arg1) {
        field967++;
        if (arg0 != 101) {
            field991 = 88;
        }
        if (arg1 == null) {
            return null;
        } else {
            class239 var2 = new class239(arg1, class275.field4376, class96.field1381, class137.field1869, class112.field1613, class134.field1847);
            class282.method1840(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IBI)V")
    public static final void method464(int arg0, byte arg1, int arg2) {
        field984++;
        class143.field1964 = new class150(arg2);
        class119.field1706 = new class150(arg0);
        if (arg1 != 35) {
            method454((byte) -16);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lam;III)V")
    public static final void method465(class314 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -2) {
            method454((byte) -34);
        }
        if (arg0.field4133 == arg3 && arg3 != -1) {
            class195 var4 = class280.method1815(arg3, -45);
            int var5 = var4.field2967;
            if (var5 == 1) {
                arg0.field4107 = arg1;
                arg0.field4099 = 0;
                arg0.field4112 = 0;
                arg0.field4146 = 0;
                arg0.field4072 = 1;
                class181.method1152(class250.field3905 == arg0, arg0.field4081, arg0.field4099, arg0.field4140, false, var4);
            }
            if (var5 == 2) {
                arg0.field4146 = 0;
            }
        } else if (arg3 == -1 || arg0.field4133 == -1 || class280.method1815(arg3, 120).field2992 >= class280.method1815(arg0.field4133, 89).field2992) {
            arg0.field4072 = 1;
            arg0.field4099 = 0;
            arg0.field4046 = arg0.field4064;
            arg0.field4107 = arg1;
            arg0.field4112 = 0;
            arg0.field4146 = 0;
            arg0.field4133 = arg3;
            if (arg0.field4133 != -1) {
                class181.method1152(class250.field3905 == arg0, arg0.field4081, arg0.field4099, arg0.field4140, false, class280.method1815(arg0.field4133, arg2 - 65));
            }
        }
        field972++;
    }
}
