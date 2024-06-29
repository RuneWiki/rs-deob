import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class55 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    public static int[] field749 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field768 = new String[200];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "J")
    private long field757;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "J")
    private long field765;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
    public boolean field756;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
    public int[] field760;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
    private int[] field764;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[[I")
    private int[][] field763;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I", line = 5)
    public final int method429(byte arg0) {
        field758++;
        int var2 = 37 % ((46 - arg0) / 52);
        return this.field750 == -1 ? (this.field760[4] << 20) + (this.field760[0] << 25) + (this.field764[0] << 15) + (this.field764[11] << 5) + (this.field764[8] << 10) + this.field764[1] : class41.method339(79, this.field750).field2601 + 305419896;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 19)
    private final void method430(int arg0) {
        field762++;
        long var2 = this.field757;
        long[] var4 = class245.field3823;
        this.field757 = -1L;
        this.field757 = this.field757 >>> 8 ^ var4[(int) ((this.field757 ^ (long) (this.field767 >> 8)) & 0xFFL)];
        this.field757 = this.field757 >>> 8 ^ var4[(int) ((this.field757 ^ (long) this.field767) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field757 = var4[(int) (((long) (this.field764[var5] >> 24) ^ this.field757) & 0xFFL)] ^ this.field757 >>> 8;
            this.field757 = this.field757 >>> 8 ^ var4[(int) (((long) (this.field764[var5] >> 16) ^ this.field757) & 0xFFL)];
            this.field757 = this.field757 >>> 8 ^ var4[(int) (((long) (this.field764[var5] >> 8) ^ this.field757) & 0xFFL)];
            this.field757 = this.field757 >>> 8 ^ var4[(int) (((long) this.field764[var5] ^ this.field757) & 0xFFL)];
        }
        if (arg0 != 32768) {
            this.field750 = 41;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field757 = this.field757 >>> 8 ^ var4[(int) ((this.field757 ^ (long) this.field760[var6]) & 0xFFL)];
        }
        this.field757 = this.field757 >>> 8 ^ var4[(int) (((long) (this.field756 ? 1 : 0) ^ this.field757) & 0xFFL)];
        if (var2 != 0L && this.field757 != var2) {
            class45.field603.method1354(var2, false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 63)
    public final void method431(int arg0, int arg1, int arg2) {
        field753++;
        int var4 = class157.field2432[arg2];
        if (this.field764[var4] != 0 && class231.method1670(arg1, (byte) -93) != null) {
            this.field764[var4] = class214.method1562(arg1, arg0);
            this.method430(32768);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[IB[IZI)V", line = 85)
    public final void method432(int arg0, int[] arg1, byte arg2, int[] arg3, boolean arg4, int arg5) {
        field761++;
        int var7 = -54 / ((67 - arg2) / 50);
        if (this.field767 != arg5) {
            this.field767 = arg5;
            this.field763 = (int[][]) null;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var8 = 0; var8 < 8; var8++) {
                for (int var9 = 0; var9 < class5.field64; var9++) {
                    class194 var10 = class231.method1670(var9, (byte) -69);
                    if (var10 != null && !var10.field3090 && (arg4 ? class47.field612[var8] : class47.field618[var8]) == var10.field3095) {
                        arg3[class157.field2432[var8]] = class214.method1562(var9, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field756 = arg4;
        this.field760 = arg1;
        this.field764 = arg3;
        this.field750 = arg0;
        this.method430(32768);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V", line = 143)
    public final void method433(int arg0, boolean arg1) {
        this.field756 = arg1;
        this.method430(32768);
        field770++;
        if (arg0 != -16384) {
            method435((byte) 107);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V", line = 162)
    public final void method434(int arg0, int arg1, int arg2) {
        this.field760[arg0] = arg1;
        if (arg2 <= -104) {
            field766++;
            this.method430(32768);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 174)
    public static void method435(byte arg0) {
        field768 = null;
        if (arg0 < -41) {
            field749 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIILa;I)Ljf;", line = 185)
    public final class89 method436(byte arg0, int arg1, int arg2, class281 arg3, int arg4) {
        field752++;
        if (this.field750 != -1) {
            return class41.method339(arg0 ^ 0xFFFFFFF8, this.field750).method1198(arg2, arg3, arg1, arg4, (byte) -121);
        }
        class89 var6 = (class89) class25.field372.method1351(this.field757, 63);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field764[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class231.method1670(var9 & 0x3FFFFFFF, (byte) -52).method1440(false)) {
                        var7 = true;
                    }
                } else if (!class149.method1092((byte) -104, var9 & 0x3FFFFFFF).method2210((byte) 109, this.field756)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var10 = 0;
            class165[] var11 = new class165[12];
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field764[var12];
                if ((var13 & 0x40000000) != 0) {
                    class165 var15 = class149.method1092((byte) -104, var13 & 0x3FFFFFFF).method2219(this.field756, true);
                    if (var15 != null) {
                        var11[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class165 var14 = class231.method1670(var13 & 0x3FFFFFFF, (byte) -116).method1438(-2301);
                    if (var14 != null) {
                        var11[var10++] = var14;
                    }
                }
            }
            class165 var16 = new class165(var11, var10);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class48.field626[var17].length > this.field760[var17]) {
                    var16.method1229(class11.field197[var17], class48.field626[var17][this.field760[var17]]);
                }
                if (class128.field1859[var17].length > this.field760[var17]) {
                    var16.method1229(class320.field5049[var17], class128.field1859[var17][this.field760[var17]]);
                }
            }
            var6 = var16.method1226(64, 768, -50, -10, -50);
            class25.field372.method1347(var6, this.field757, (byte) -90);
        }
        if (arg0 != -128) {
            this.field765 = -1L;
        }
        if (arg3 != null) {
            var6 = arg3.method1988((byte) 92, arg2, arg4, var6, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIILa;I)Ljf;", line = 300)
    public final class89 method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class281 arg6, int arg7) {
        field754++;
        if (arg5 != -20163) {
            this.method437(-13, -100, 21, -42, -71, 39, (class281) null, -18);
        }
        long var9 = (long) arg0 << 32 | (long) (arg4 << 16) | (long) arg2;
        class89 var11 = (class89) class25.field372.method1351(var9, 63);
        if (var11 == null) {
            class165[] var12 = new class165[3];
            int var13 = 0;
            if (!class231.method1670(arg2, (byte) -63).method1440(false) || !class231.method1670(arg4, (byte) -35).method1440(false) || !class231.method1670(arg0, (byte) -94).method1440(false)) {
                return null;
            }
            class165 var14 = class231.method1670(arg2, (byte) -96).method1438(arg5 ^ 0x463E);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class165 var15 = class231.method1670(arg4, (byte) -127).method1438(-2301);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class165 var16 = class231.method1670(arg0, (byte) -42).method1438(-2301);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class165 var17 = new class165(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class48.field626[var18].length > this.field760[var18]) {
                    var17.method1229(class11.field197[var18], class48.field626[var18][this.field760[var18]]);
                }
                if (this.field760[var18] < class128.field1859[var18].length) {
                    var17.method1229(class320.field5049[var18], class128.field1859[var18][this.field760[var18]]);
                }
            }
            var11 = var17.method1226(64, 768, -50, -10, -50);
            class25.field372.method1347(var11, var9, (byte) -50);
        }
        if (arg6 != null) {
            var11 = arg6.method1988((byte) 92, arg1, arg3, var11, arg7);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)Ltc;", line = 367)
    public static final class154 method438(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class154 var4 = var3.field1789;
            var3.field1789 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 378)
    public static final void method439(int arg0) {
        class58.field825.method1359(98);
        field759++;
        class229.field3586.method1359(70);
        int var1 = 74 % ((arg0 + 14) / 40);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILa;IZLa;I[Lub;IB)Ljf;", line = 396)
    public final class89 method440(int arg0, int arg1, int arg2, class281 arg3, int arg4, boolean arg5, class281 arg6, int arg7, class11[] arg8, int arg9, byte arg10) {
        field755++;
        if (this.field750 != -1) {
            return class41.method339(127, this.field750).method1194(arg1, arg3, arg6, arg7, arg9, 8, arg8, arg4, arg2, arg0);
        }
        int[] var12 = this.field764;
        long var13 = this.field757;
        if (arg3 != null && (arg3.field4335 >= 0 || arg3.field4336 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field764[var15];
            }
            if (arg3.field4335 >= 0) {
                if (arg3.field4335 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var12[5] = 0;
                } else {
                    var12[5] = class214.method1562(arg3.field4335, 1073741824);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg3.field4336 >= 0) {
                if (arg3.field4336 == 65535) {
                    var12[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var12[3] = class214.method1562(1073741824, arg3.field4336);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class89 var16 = (class89) class45.field603.method1351(var13, 63);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var12[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class231.method1670(var19 & 0x3FFFFFFF, (byte) -66).method1433(405554817)) {
                        var17 = true;
                    }
                } else if (!class149.method1092((byte) -104, var19 & 0x3FFFFFFF).method2217(this.field756, 0)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field765 != -1L) {
                    var16 = (class89) class45.field603.method1351(this.field765, 63);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class165[] var20 = new class165[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var12[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class165 var23 = class149.method1092((byte) -104, var22 & 0x3FFFFFFF).method2220(false, this.field756);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class165 var24 = class231.method1670(var22 & 0x3FFFFFFF, (byte) -54).method1441(true);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    }
                }
                class107 var25 = null;
                if (this.field767 != -1) {
                    var25 = class233.method1673(this.field767, 126);
                }
                if (var25 != null && var25.field1413 != null) {
                    for (int var26 = 0; var26 < var25.field1413.length; var26++) {
                        if (var25.field1413[var26] != null && var20[var26] != null) {
                            int var27 = var25.field1413[var26][0];
                            int var28 = var25.field1413[var26][1];
                            int var29 = var25.field1413[var26][2];
                            int var30 = var25.field1413[var26][3];
                            int var31 = var25.field1413[var26][4];
                            int var32 = var25.field1413[var26][5];
                            if (this.field763 == null) {
                                this.field763 = new int[var25.field1413.length][];
                            }
                            if (this.field763[var26] == null) {
                                int[] var33 = this.field763[var26] = new int[15];
                                if (var30 == 0 && var31 == 0 && var32 == 0) {
                                    var33[12] = -var27;
                                    var33[13] = -var28;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[14] = -var29;
                                } else {
                                    int var34 = class31.field451[var31] >> 1;
                                    int var35 = class31.field451[var30] >> 1;
                                    int var36 = class31.field467[var30] >> 1;
                                    int var37 = class31.field467[var31] >> 1;
                                    int var38 = class31.field451[var32] >> 1;
                                    int var39 = var36 * var38 + 16384 >> 15;
                                    int var40 = class31.field467[var32] >> 1;
                                    int var41 = var36 * var40 + 16384 >> 15;
                                    var33[3] = var35 * var40 + 16384 >> 15;
                                    var33[8] = var34 * var35 + 16384 >> 15;
                                    var33[0] = var34 * var38 + var37 * var41 + 16384 >> 15;
                                    var33[1] = -var40 * var34 + var37 * var39 + 16384 >> 15;
                                    var33[4] = var35 * var38 + 16384 >> 15;
                                    var33[6] = -var37 * var38 + var34 * var41 + 16384 >> 15;
                                    var33[7] = -var37 * -var40 + var34 * var39 + 16384 >> 15;
                                    var33[12] = var33[0] * -var27 + var33[6] * -var29 + var33[3] * -var28 + 16384 >> 15;
                                    var33[13] = var33[7] * -var29 + var33[4] * -var28 + var33[1] * -var27 + 16384 >> 15;
                                    var33[2] = var35 * var37 + 16384 >> 15;
                                    var33[5] = -var36;
                                    var33[14] = var33[5] * -var28 + var33[8] * -var29 + var33[2] * -var27 + 16384 >> 15;
                                }
                                var33[11] = var29;
                                var33[9] = var27;
                                var33[10] = var28;
                            }
                            if (var30 != 0 || var31 != 0 || var32 != 0) {
                                var20[var26].method1216(var30, var31, var32);
                            }
                            if (var27 != 0 || var28 != 0 || var29 != 0) {
                                var20[var26].method1238(var27, var28, var29);
                            }
                        }
                    }
                }
                class165 var42 = new class165(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (this.field760[var43] < class48.field626[var43].length) {
                        var42.method1229(class11.field197[var43], class48.field626[var43][this.field760[var43]]);
                    }
                    if (this.field760[var43] < class128.field1859[var43].length) {
                        var42.method1229(class320.field5049[var43], class128.field1859[var43][this.field760[var43]]);
                    }
                }
                var16 = var42.method1226(64, 850, -30, -50, -30);
                if (class109.field1458) {
                    ((class217) var16).method1589(false, false, true, true, false, false, true);
                }
                if (arg5) {
                    class45.field603.method1347(var16, var13, (byte) -125);
                    this.field765 = var13;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg8 == null ? 0 : arg8.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg8[var49] != null) {
                class281 var50 = class295.method2064(0, arg8[var49].field198);
                if (var50.field4319 != null) {
                    var44 = true;
                    class314.field4918[var49] = var50;
                    int var51 = arg8[var49].field201;
                    int var52 = arg8[var49].field209;
                    int var53 = var50.field4319[var51];
                    class50.field645[var49] = class261.method1874(false, var53 >>> 16);
                    int var54 = var53 & 0xFFFF;
                    class325.field5100[var49] = var54;
                    if (class50.field645[var49] != null) {
                        var46 |= class50.field645[var49].method1426(1, var54);
                        var45 |= class50.field645[var49].method1428(116, var54);
                        var47 |= var50.field4323;
                    }
                    if ((var50.field4312 || class270.field4191) && var52 != -1 && var52 < var50.field4319.length) {
                        class52.field655[var49] = var50.field4328[var51];
                        class66.field944[var49] = arg8[var49].field199;
                        int var55 = var50.field4319[var52];
                        class135.field1983[var49] = class261.method1874(false, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class240.field3745[var49] = var56;
                        if (class135.field1983[var49] != null) {
                            var46 |= class135.field1983[var49].method1426(1, var56);
                            var45 |= class135.field1983[var49].method1428(20, var56);
                        }
                    } else {
                        class52.field655[var49] = 0;
                        class66.field944[var49] = 0;
                        class135.field1983[var49] = null;
                        class240.field3745[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg3 == null && arg6 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        int var59 = 0;
        class193 var60 = null;
        class193 var61 = null;
        if (arg3 != null) {
            int var62 = arg3.field4319[arg7];
            int var63 = var62 >>> 16;
            var60 = class261.method1874(false, var63);
            var57 = var62 & 0xFFFF;
            if (var60 != null) {
                var46 |= var60.method1426(1, var57);
                var45 |= var60.method1428(115, var57);
                var47 |= arg3.field4323;
            }
            if ((arg3.field4312 || class270.field4191) && arg2 != -1 && arg2 < arg3.field4319.length) {
                int var64 = arg3.field4319[arg2];
                var59 = arg3.field4328[arg7];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class261.method1874(false, var58 >>> 16);
                }
                if (var61 != null) {
                    var46 |= var61.method1426(1, var58);
                    var45 |= var61.method1428(18, var58);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        int var69 = 127 % ((-arg10 - 21) / 38);
        class193 var70 = null;
        class193 var71 = null;
        if (arg6 != null) {
            int var72 = arg6.field4319[arg0];
            int var73 = var72 >>> 16;
            var66 = var72 & 0xFFFF;
            var70 = class261.method1874(false, var73);
            if (var70 != null) {
                var46 |= var70.method1426(1, var66);
                var45 |= var70.method1428(-119, var66);
                var47 |= arg6.field4323;
            }
            if ((arg6.field4312 || class270.field4191) && arg1 != -1 && arg6.field4319.length > arg1) {
                var68 = arg6.field4328[arg0];
                int var74 = arg6.field4319[arg1];
                int var75 = var74 >>> 16;
                var67 = var74 & 0xFFFF;
                if (var73 == var75) {
                    var71 = var70;
                } else {
                    var71 = class261.method1874(false, var67 >>> 16);
                }
                if (var71 != null) {
                    var46 |= var71.method1426(1, var67);
                    var45 |= var71.method1428(-89, var67);
                }
            }
        }
        class89 var76 = var16.method411(!var45, !var46, !var47);
        int var77 = 0;
        int var78 = 1;
        while (var48 > var77) {
            if (class50.field645[var77] != null) {
                var76.method640(class50.field645[var77], class325.field5100[var77], class135.field1983[var77], class240.field3745[var77], class66.field944[var77] - 1, class52.field655[var77], var78, class314.field4918[var77].field4323, this.field763[var77]);
            }
            var78 <<= 0x1;
            var77++;
        }
        if (var60 != null && var70 != null) {
            var76.method644(var60, var57, var61, var58, arg9 - 1, var59, var70, var66, var71, var67, arg4 - 1, var68, arg3.field4334, arg3.field4323 | arg6.field4323);
        } else if (var60 != null) {
            var76.method643(var60, var57, var61, var58, arg9 - 1, var59, arg3.field4323);
        } else if (var70 != null) {
            var76.method643(var70, var66, var71, var67, arg4 - 1, var68, arg6.field4323);
        }
        for (int var79 = 0; var79 < var48; var79++) {
            class50.field645[var79] = null;
            class135.field1983[var79] = null;
            class314.field4918[var79] = null;
        }
        return var76;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lug;Lug;IZ)V", line = 876)
    public static final void method441(class253 arg0, class253 arg1, int arg2, boolean arg3) {
        class131.field1944 = arg1;
        class306.field4783 = arg0;
        class166.field2716 = arg3;
        field751++;
        if (arg2 != 30913) {
            field768 = (String[]) null;
        }
    }
}
