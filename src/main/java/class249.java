import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class249 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3974 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lrh;")
    public static class46 field3984 = new class46();

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lef;")
    public static class214 field3995 = null;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3994 = new String[5];

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "[I")
    public static int[] field3991 = new int[1000];

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Llf;")
    public static class211 field3992 = new class211(64);

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3998 = null;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "J")
    private long field3973;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "J")
    private long field3990;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
    public boolean field3972;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    private int[] field3976;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    private int[] field3977;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[[I")
    private int[][] field3979;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZLsi;I)Lua;")
    public final class114 method1672(int arg0, int arg1, boolean arg2, class198 arg3, int arg4) {
        field3999++;
        if (this.field3993 != -1) {
            return class252.method1691(this.field3993, (byte) 118).method920(arg3, arg0, arg1, 65535, arg4);
        }
        class114 var6 = (class114) class206.field3217.method1428(this.field3973, (byte) -87);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field3977[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class45.method338(var17 & 0x3FFFFFFF, (byte) 61).method1652(false)) {
                        var7 = true;
                    }
                } else if (!class162.method1112(var17 & 0x3FFFFFFF, (byte) 109).method1699(0, this.field3972)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class160[] var9 = new class160[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field3977[var11];
                if ((var14 & 0x40000000) != 0) {
                    class160 var16 = class162.method1112(var14 & 0x3FFFFFFF, (byte) 116).method1694(false, this.field3972);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class160 var15 = class45.method338(var14 & 0x3FFFFFFF, (byte) 59).method1649(true);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class160 var12 = new class160(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class227.field3654[var13].length > this.field3976[var13]) {
                    var12.method1090(class224.field3613[var13], class227.field3654[var13][this.field3976[var13]]);
                }
                if (this.field3976[var13] < class135.field1956[var13].length) {
                    var12.method1090(class46.field591[var13], class135.field1956[var13][this.field3976[var13]]);
                }
            }
            var6 = var12.method1076(64, 768, -50, -10, -50);
            class206.field3217.method1424(this.field3973, var6, -2003648287);
        }
        if (arg3 != null) {
            var6 = arg3.method1365(arg4, arg0, var6, (byte) -127, arg1);
        }
        if (!arg2) {
            this.method1680((byte) -32);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILsi;I[Lll;IIIIZLsi;)Lua;")
    public final class114 method1673(int arg0, int arg1, class198 arg2, int arg3, class205[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class198 arg10) {
        field3980++;
        if (this.field3993 != -1) {
            return class252.method1691(this.field3993, (byte) 126).method930(arg7, arg3, arg5, arg0, arg2, arg8, 13119, arg6, arg10, arg4);
        }
        long var12 = this.field3973;
        int[] var14 = this.field3977;
        if (arg10 != null && (arg10.field3077 >= 0 || arg10.field3095 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3977[var15];
            }
            if (arg10.field3077 >= 0) {
                if (arg10.field3077 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class120.method787(1073741824, arg10.field3077);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg10.field3095 >= 0) {
                if (arg10.field3095 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class120.method787(1073741824, arg10.field3095);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class114 var16 = (class114) client.field2315.method1428(var12, (byte) -90);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class45.method338(var43 & 0x3FFFFFFF, (byte) 83).method1658(-11173)) {
                        var17 = true;
                    }
                } else if (!class162.method1112(var43 & 0x3FFFFFFF, (byte) 114).method1696(this.field3972, 27222)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3990 != -1L) {
                    var16 = (class114) client.field2315.method1428(this.field3990, (byte) -52);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class160[] var19 = new class160[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class160 var41 = class162.method1112(var40 & 0x3FFFFFFF, (byte) 102).method1704(this.field3972, 48);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class160 var42 = class45.method338(var40 & 0x3FFFFFFF, (byte) 125).method1657((byte) 124);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class85 var21 = null;
                if (this.field3982 != -1) {
                    var21 = class123.method830(this.field3982, -1);
                }
                if (var21 != null && var21.field1351 != null) {
                    for (int var22 = 0; var22 < var21.field1351.length; var22++) {
                        if (var21.field1351[var22] != null && var19[var22] != null) {
                            int var23 = var21.field1351[var22][1];
                            int var24 = var21.field1351[var22][2];
                            int var25 = var21.field1351[var22][3];
                            int var26 = var21.field1351[var22][4];
                            int var27 = var21.field1351[var22][5];
                            int var28 = var21.field1351[var22][0];
                            if (this.field3979 == null) {
                                this.field3979 = new int[var21.field1351.length][];
                            }
                            if (this.field3979[var22] == null) {
                                int[] var29 = this.field3979[var22] = new int[15];
                                if (var25 == 0 && var26 == 0 && var27 == 0) {
                                    var29[14] = -var24;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[13] = -var23;
                                    var29[12] = -var28;
                                } else {
                                    int var30 = class171.field2680[var25] >> 1;
                                    int var31 = class171.field2680[var26] >> 1;
                                    int var32 = class171.field2675[var26] >> 1;
                                    int var33 = class171.field2675[var27] >> 1;
                                    int var34 = class171.field2680[var27] >> 1;
                                    int var35 = class171.field2675[var25] >> 1;
                                    var29[2] = var30 * var32 + 16384 >> 15;
                                    var29[8] = var30 * var31 + 16384 >> 15;
                                    var29[5] = -var35;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    var29[3] = var30 * var33 + 16384 >> 15;
                                    int var36 = var33 * var35 + 16384 >> 15;
                                    var29[6] = -var32 * var34 + var31 * var36 + 16384 >> 15;
                                    int var37 = var34 * var35 + 16384 >> 15;
                                    var29[7] = var31 * var37 + -var32 * -var33 + 16384 >> 15;
                                    var29[14] = var29[2] * -var28 + (var29[8] * -var24) + var29[5] * -var23 + 16384 >> 15;
                                    var29[0] = var31 * var34 + var32 * var36 + 16384 >> 15;
                                    var29[1] = -var33 * var31 + (var32 * var37) + 16384 >> 15;
                                    var29[13] = var29[4] * -var23 + var29[1] * -var28 - (-(var29[7] * -var24) + -16384) >> 15;
                                    var29[12] = var29[0] * -var28 + var29[6] * -var24 + var29[3] * -var23 + 16384 >> 15;
                                }
                                var29[11] = var24;
                                var29[10] = var23;
                                var29[9] = var28;
                            }
                            if (var25 != 0 || var26 != 0 || var27 != 0) {
                                var19[var22].method1071(var25, var26, var27);
                            }
                            if (var28 != 0 || var23 != 0 || var24 != 0) {
                                var19[var22].method1093(var28, var23, var24);
                            }
                        }
                    }
                }
                class160 var38 = new class160(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class227.field3654[var39].length > this.field3976[var39]) {
                        var38.method1090(class224.field3613[var39], class227.field3654[var39][this.field3976[var39]]);
                    }
                    if (this.field3976[var39] < class135.field1956[var39].length) {
                        var38.method1090(class46.field591[var39], class135.field1956[var39][this.field3976[var39]]);
                    }
                }
                var16 = var38.method1076(64, 850, -30, -50, -30);
                if (arg9) {
                    client.field2315.method1424(var12, var16, -2003648287);
                    this.field3990 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg4 == null ? 0 : arg4.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg4[var49] != null) {
                class198 var73 = class104.method688(arg4[var49].field3205, 30091);
                if (var73.field3107 != null) {
                    var44 = true;
                    class271.field4303[var49] = var73;
                    int var74 = arg4[var49].field3209;
                    int var75 = var73.field3107[var74];
                    int var76 = arg4[var49].field3210;
                    class201.field3142[var49] = class262.method1800(var75 >>> 16, -106);
                    int var77 = var75 & 0xFFFF;
                    class194.field3051[var49] = var77;
                    if (class201.field3142[var49] != null) {
                        var46 |= class201.field3142[var49].method1471(var77, 0);
                        var45 |= class201.field3142[var49].method1474(-126, var77);
                        var47 |= var73.field3099;
                    }
                    if ((var73.field3104 || class200.field3132) && var76 != -1 && var76 < var73.field3107.length) {
                        class218.field3544[var49] = var73.field3080[var74];
                        class143.field2092[var49] = arg4[var49].field3206;
                        int var78 = var73.field3107[var76];
                        class227.field3670[var49] = class262.method1800(var78 >>> 16, -88);
                        int var79 = var78 & 0xFFFF;
                        class251.field4017[var49] = var79;
                        if (class227.field3670[var49] != null) {
                            var46 |= class227.field3670[var49].method1471(var79, 0);
                            var45 |= class227.field3670[var49].method1474(-113, var79);
                        }
                    } else {
                        class218.field3544[var49] = 0;
                        class143.field2092[var49] = 0;
                        class227.field3670[var49] = null;
                        class251.field4017[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg10 == null && arg2 == null) {
            return var16;
        }
        int var50 = 89 % ((arg1 + 73) / 46);
        int var51 = -1;
        int var52 = -1;
        class218 var53 = null;
        int var54 = 0;
        class218 var55 = null;
        if (arg10 != null) {
            int var56 = arg10.field3107[arg5];
            int var57 = var56 >>> 16;
            var53 = class262.method1800(var57, -78);
            var51 = var56 & 0xFFFF;
            if (var53 != null) {
                var46 |= var53.method1471(var51, 0);
                var45 |= var53.method1474(-106, var51);
                var47 |= arg10.field3099;
            }
            if ((arg10.field3104 || class200.field3132) && arg7 != -1 && arg10.field3107.length > arg7) {
                var54 = arg10.field3080[arg5];
                int var58 = arg10.field3107[arg7];
                int var59 = var58 >>> 16;
                var52 = var58 & 0xFFFF;
                if (var57 == var59) {
                    var55 = var53;
                } else {
                    var55 = class262.method1800(var52 >>> 16, -70);
                }
                if (var55 != null) {
                    var46 |= var55.method1471(var52, 0);
                    var45 |= var55.method1474(-109, var52);
                }
            }
        }
        int var60 = -1;
        int var61 = -1;
        int var62 = 0;
        class218 var63 = null;
        class218 var64 = null;
        if (arg2 != null) {
            int var65 = arg2.field3107[arg6];
            int var66 = var65 >>> 16;
            var60 = var65 & 0xFFFF;
            var63 = class262.method1800(var66, -67);
            if (var63 != null) {
                var46 |= var63.method1471(var60, 0);
                var45 |= var63.method1474(-111, var60);
                var47 |= arg2.field3099;
            }
            if ((arg2.field3104 || class200.field3132) && arg0 != -1 && arg0 < arg2.field3107.length) {
                int var67 = arg2.field3107[arg0];
                int var68 = var67 >>> 16;
                var62 = arg2.field3080[arg6];
                var61 = var67 & 0xFFFF;
                if (var66 == var68) {
                    var64 = var63;
                } else {
                    var64 = class262.method1800(var61 >>> 16, -120);
                }
                if (var64 != null) {
                    var46 |= var64.method1471(var61, 0);
                    var45 |= var64.method1474(-114, var61);
                }
            }
        }
        class114 var69 = var16.method756(!var45, !var46, !var47);
        int var70 = 0;
        int var71 = 1;
        while (var48 > var70) {
            if (class201.field3142[var70] != null) {
                var69.method741(class201.field3142[var70], class194.field3051[var70], class227.field3670[var70], class251.field4017[var70], class143.field2092[var70] - 1, class218.field3544[var70], var71, class271.field4303[var70].field3099, this.field3979[var70]);
            }
            var71 <<= 0x1;
            var70++;
        }
        if (var53 != null && var63 != null) {
            var69.method744(var53, var51, var55, var52, arg3 - 1, var54, var63, var60, var64, var61, arg8 - 1, var62, arg10.field3089, arg2.field3099 | arg10.field3099);
        } else if (var53 != null) {
            var69.method760(var53, var51, var55, var52, arg3 - 1, var54, arg10.field3099);
        } else if (var63 != null) {
            var69.method760(var63, var60, var64, var61, arg8 - 1, var62, arg2.field3099);
        }
        for (int var72 = 0; var72 < var48; var72++) {
            class201.field3142[var72] = null;
            class227.field3670[var72] = null;
            class271.field4303[var72] = null;
        }
        return var69;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
    public final int method1674(int arg0) {
        field3989++;
        if (arg0 != 2014) {
            this.field3977 = null;
        }
        return this.field3993 == -1 ? (this.field3977[0] << 15) + (this.field3977[11] << 5) + (this.field3977[8] << 10) + (this.field3976[4] << 20) + (this.field3976[0] << 25) + this.field3977[1] : 305419896 - -class252.method1691(this.field3993, (byte) -92).field1975;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public final void method1675(int arg0, int arg1, int arg2) {
        this.field3976[arg0] = arg1;
        if (arg2 == 1073741823) {
            this.method1680((byte) 89);
            field3975++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)V")
    public final void method1676(byte arg0, int arg1, int arg2) {
        if (arg0 >= -37) {
            this.method1680((byte) -101);
        }
        field3986++;
        int var4 = class67.field942[arg2];
        if (this.field3977[var4] != 0 && class45.method338(arg1, (byte) 12) != null) {
            this.field3977[var4] = class120.method787(arg1, Integer.MIN_VALUE);
            this.method1680((byte) 97);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static void method1677(int arg0) {
        field3994 = null;
        field3974 = null;
        field3991 = null;
        field3998 = null;
        field3984 = null;
        field3995 = null;
        if (arg0 != -23110) {
            method1677(1);
        }
        field3992 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1678(int arg0, int arg1) {
        class141.field2070 = new int[arg0];
        class28.field390 = new int[arg0];
        class247.field3952 = new int[arg0];
        class121.field1765 = new int[arg0];
        field3988++;
        if (arg1 <= -44) {
            class10.field141 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([II[IIIZ)V")
    public final void method1679(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3982 != arg3) {
            this.field3979 = null;
            this.field3982 = arg3;
        }
        field3978++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class172.field2695; var8++) {
                    class245 var9 = class45.method338(var8, (byte) 49);
                    if (var9 != null && !var9.field3928 && (arg5 ? class215.field3514[var7] : class68.field961[var7]) == var9.field3926) {
                        arg2[class67.field942[var7]] = class120.method787(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3977 = arg2;
        this.field3976 = arg0;
        this.field3972 = arg5;
        this.field3993 = arg4;
        this.method1680((byte) 102);
        if (arg1 != 0) {
            field3994 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    private final void method1680(byte arg0) {
        long var2 = this.field3973;
        if (arg0 < 82) {
            return;
        }
        this.field3973 = -1L;
        field3987++;
        long[] var4 = class100.field1555;
        this.field3973 = this.field3973 >>> 8 ^ var4[(int) ((this.field3973 ^ (long) (this.field3982 >> 8)) & 0xFFL)];
        this.field3973 = this.field3973 >>> 8 ^ var4[(int) ((this.field3973 ^ (long) this.field3982) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3973 = var4[(int) (((long) (this.field3977[var5] >> 24) ^ this.field3973) & 0xFFL)] ^ this.field3973 >>> 8;
            this.field3973 = this.field3973 >>> 8 ^ var4[(int) (((long) (this.field3977[var5] >> 16) ^ this.field3973) & 0xFFL)];
            this.field3973 = var4[(int) ((this.field3973 ^ (long) (this.field3977[var5] >> 8)) & 0xFFL)] ^ this.field3973 >>> 8;
            this.field3973 = this.field3973 >>> 8 ^ var4[(int) ((this.field3973 ^ (long) this.field3977[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3973 = this.field3973 >>> 8 ^ var4[(int) ((this.field3973 ^ (long) this.field3976[var6]) & 0xFFL)];
        }
        this.field3973 = this.field3973 >>> 8 ^ var4[(int) (((long) (this.field3972 ? 1 : 0) ^ this.field3973) & 0xFFL)];
        if (var2 != 0L && this.field3973 != var2) {
            client.field2315.method1427((byte) -102, var2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZ)V")
    public final void method1681(byte arg0, boolean arg1) {
        this.field3972 = arg1;
        field3983++;
        this.method1680((byte) 107);
        if (arg0 <= 119) {
            field3974 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLsi;IIIIII)Lua;")
    public final class114 method1682(byte arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) arg3 | (long) (arg5 << 16) | (long) arg7 << 32;
        class114 var11 = (class114) class206.field3217.method1428(var9, (byte) -46);
        field3981++;
        if (arg0 != -106) {
            this.field3993 = 86;
        }
        if (var11 == null) {
            int var12 = 0;
            class160[] var13 = new class160[3];
            if (!class45.method338(arg3, (byte) 28).method1652(false) || !class45.method338(arg5, (byte) 56).method1652(false) || !class45.method338(arg7, (byte) 33).method1652(false)) {
                return null;
            }
            class160 var14 = class45.method338(arg3, (byte) 15).method1649(true);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class160 var15 = class45.method338(arg5, (byte) 122).method1649(true);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class160 var16 = class45.method338(arg7, (byte) 83).method1649(true);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class160 var17 = new class160(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3976[var18] < class227.field3654[var18].length) {
                    var17.method1090(class224.field3613[var18], class227.field3654[var18][this.field3976[var18]]);
                }
                if (this.field3976[var18] < class135.field1956[var18].length) {
                    var17.method1090(class46.field591[var18], class135.field1956[var18][this.field3976[var18]]);
                }
            }
            var11 = var17.method1076(64, 768, -50, -10, -50);
            class206.field3217.method1424(var9, var11, -2003648287);
        }
        if (arg1 != null) {
            var11 = arg1.method1365(arg4, arg6, var11, (byte) -17, arg2);
        }
        return var11;
    }
}
