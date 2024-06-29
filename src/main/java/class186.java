import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class186 {

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3238 = new CRC32();

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[I")
    public static int[] field3250 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Lmb;")
    public static class96 field3246 = class243.method1708("<col=00ff80>", (byte) 112);

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Lmb;")
    public static class96 field3254 = class243.method1708("_labels", (byte) 91);

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "J")
    private long field3230;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "J")
    private long field3241;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Lff;")
    public static class3 field3244;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Z")
    public boolean field3243;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[I")
    private int[] field3251;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "[I")
    private int[] field3253;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
    public final int method1307(int arg0) {
        field3234++;
        if (arg0 < 27) {
            field3255 = -69;
        }
        return this.field3231 == -1 ? (this.field3253[4] << 20) + (this.field3253[0] << 25) + (this.field3251[8] << 10) + (this.field3251[0] << 15) - (-(this.field3251[11] << 5) + -this.field3251[1]) : class260.method1799(this.field3231, (byte) -19).field3920 + 305419896;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    private final void method1308(boolean arg0) {
        long[] var2 = class244.field4219;
        long var3 = this.field3241;
        if (arg0) {
            method1319((class3) null, -93);
        }
        field3227++;
        this.field3241 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3241 = var2[(int) (((long) (this.field3251[var5] >> 24) ^ this.field3241) & 0xFFL)] ^ this.field3241 >>> 8;
            this.field3241 = this.field3241 >>> 8 ^ var2[(int) (((long) (this.field3251[var5] >> 16) ^ this.field3241) & 0xFFL)];
            this.field3241 = this.field3241 >>> 8 ^ var2[(int) ((this.field3241 ^ (long) (this.field3251[var5] >> 8)) & 0xFFL)];
            this.field3241 = this.field3241 >>> 8 ^ var2[(int) (((long) this.field3251[var5] ^ this.field3241) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3241 = this.field3241 >>> 8 ^ var2[(int) ((this.field3241 ^ (long) this.field3253[var6]) & 0xFFL)];
        }
        this.field3241 = var2[(int) (((long) (this.field3243 ? 1 : 0) ^ this.field3241) & 0xFFL)] ^ this.field3241 >>> 8;
        if (var3 != 0L && this.field3241 != var3) {
            class224.field3817.method86(127, var3);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZI)V")
    public final void method1309(int arg0, boolean arg1, int arg2) {
        field3249++;
        int var4 = class11.field200[arg0];
        if (this.field3251[var4] == 0) {
            return;
        }
        if (!arg1) {
            this.method1315((class67) null, -9, 109, (class67) null, 121);
        }
        if (class171.method1223(arg2, 86) != null) {
            this.field3251[var4] = class45.method348(arg2, Integer.MIN_VALUE);
            this.method1308(false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V")
    public final void method1310(boolean arg0, byte arg1) {
        field3233++;
        this.field3243 = arg0;
        this.method1308(false);
        if (arg1 != 51) {
            field3254 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILpk;)Lra;")
    public final class35 method1311(int arg0, int arg1, class67 arg2) {
        field3242++;
        if (arg1 <= 108) {
            return null;
        } else if (this.field3231 == -1) {
            class35 var4 = (class35) class74.field1279.method84(-99, this.field3241);
            if (var4 == null) {
                boolean var5 = false;
                for (int var6 = 0; var6 < 12; var6++) {
                    int var15 = this.field3251[var6];
                    if ((var15 & 0x40000000) == 0) {
                        if ((var15 & Integer.MIN_VALUE) != 0 && !class171.method1223(var15 & 0x3FFFFFFF, -92).method1105(48)) {
                            var5 = true;
                        }
                    } else if (!class269.method1845(var15 & 0x3FFFFFFF, (byte) 61).method1162(-19960, this.field3243)) {
                        var5 = true;
                    }
                }
                if (var5) {
                    return null;
                }
                class112[] var7 = new class112[12];
                int var8 = 0;
                for (int var9 = 0; var9 < 12; var9++) {
                    int var12 = this.field3251[var9];
                    if ((var12 & 0x40000000) != 0) {
                        class112 var14 = class269.method1845(var12 & 0x3FFFFFFF, (byte) 61).method1153(2, this.field3243);
                        if (var14 != null) {
                            var7[var8++] = var14;
                        }
                    } else if ((Integer.MIN_VALUE & var12) != 0) {
                        class112 var13 = class171.method1223(var12 & 0x3FFFFFFF, 81).method1104(97);
                        if (var13 != null) {
                            var7[var8++] = var13;
                        }
                    }
                }
                class112 var10 = new class112(var7, var8);
                for (int var11 = 0; var11 < 5; var11++) {
                    if (class225.field3825[var11].length > this.field3253[var11]) {
                        var10.method879(class117.field2179[var11], class225.field3825[var11][this.field3253[var11]]);
                    }
                    if (this.field3253[var11] < class135.field2429[var11].length) {
                        var10.method879(class99.field1680[var11], class135.field2429[var11][this.field3253[var11]]);
                    }
                }
                var4 = var10.method862(64, 768, -50, -10, -50);
                class74.field1279.method88(var4, 16518, this.field3241);
            }
            if (arg2 != null) {
                var4 = arg2.method469(var4, 127, arg0);
            }
            return var4;
        } else {
            return class260.method1799(this.field3231, (byte) -118).method1557(arg2, arg0, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public final void method1312(int arg0, int arg1, int arg2) {
        this.field3253[arg0] = arg2;
        field3235++;
        this.method1308(false);
        if (arg1 != 8590) {
            method1313(93, (class3) null, (class3) null, (class3) null, (class3) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILff;Lff;Lff;Lff;)V")
    public static final void method1313(int arg0, class3 arg1, class3 arg2, class3 arg3, class3 arg4) {
        if (arg0 != 3136) {
            field3250 = null;
        }
        class94.field1549 = arg1;
        class271.field4712 = arg2;
        field3240++;
        class3.field32 = arg3;
        class108.field2009 = arg4;
        class100.field1704 = new class107[class108.field2009.method40((byte) 126)][];
        class154.field2715 = new boolean[class108.field2009.method40((byte) 126)];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lpk;IIIZ)Lra;")
    public final class35 method1314(class67 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3229++;
        long var6 = (long) (arg3 << 16) | (long) arg2 << 32 | (long) arg2;
        class35 var8 = (class35) class74.field1279.method84(28, var6);
        if (var8 == null) {
            class112[] var9 = new class112[2];
            int var10 = 0;
            if (!class171.method1223(arg2, -105).method1105(-109) || !class171.method1223(arg3, -99).method1105(-60)) {
                return null;
            }
            class112 var11 = class171.method1223(arg2, 104).method1104(99);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class112 var12 = class171.method1223(arg3, 44).method1104(117);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class112 var13 = new class112(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3253[var14] < class225.field3825[var14].length) {
                    var13.method879(class117.field2179[var14], class225.field3825[var14][this.field3253[var14]]);
                }
                if (class135.field2429[var14].length > this.field3253[var14]) {
                    var13.method879(class99.field1680[var14], class135.field2429[var14][this.field3253[var14]]);
                }
            }
            var8 = var13.method862(64, 768, -50, -10, -50);
            class74.field1279.method88(var8, 16518, var6);
        }
        if (arg0 != null) {
            var8 = arg0.method469(var8, 98, arg1);
        }
        if (arg4) {
            return null;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lpk;IILpk;I)Lra;")
    public final class35 method1315(class67 arg0, int arg1, int arg2, class67 arg3, int arg4) {
        field3245++;
        if (this.field3231 != -1) {
            return class260.method1799(this.field3231, (byte) -10).method1567(arg3, arg1, arg4, -128, arg0);
        }
        long var6 = this.field3241;
        int[] var8 = this.field3251;
        if (arg3 != null && (arg3.field1141 >= 0 || arg3.field1139 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3251[var9];
            }
            if (arg3.field1141 >= 0) {
                if (arg3.field1141 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class45.method348(1073741824, arg3.field1141);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field1139 >= 0) {
                if (arg3.field1139 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class45.method348(1073741824, arg3.field1139);
                    var6 ^= (long) var8[3];
                }
            }
        }
        if (arg2 != -1215425567) {
            this.method1315((class67) null, -101, -108, (class67) null, -95);
        }
        class35 var10 = (class35) class224.field3817.method84(44, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class171.method1223(var30 & 0x3FFFFFFF, -108).method1099(-103)) {
                        var11 = true;
                    }
                } else if (!class269.method1845(var30 & 0x3FFFFFFF, (byte) 61).method1149(true, this.field3243)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3230 != -1L) {
                    var10 = (class35) class224.field3817.method84(arg2 + 1215425444, this.field3230);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class112[] var13 = new class112[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class112 var28 = class269.method1845(var27 & 0x3FFFFFFF, (byte) 61).method1160(arg2 + 1215425453, this.field3243);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class112 var29 = class171.method1223(var27 & 0x3FFFFFFF, arg2 ^ 0x4871EC44).method1098(arg2 + 1215425565);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class159 var17 = class269.method1845(var16 & 0x3FFFFFFF, (byte) 61);
                    if (var17.field2790 != null) {
                        for (int var18 = 0; var18 < var17.field2790.length; var18++) {
                            if (var17.field2790[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field2790[var18][0];
                                int var20 = var17.field2790[var18][1];
                                int var21 = var17.field2790[var18][2];
                                int var22 = var17.field2790[var18][3];
                                int var23 = var17.field2790[var18][4];
                                int var24 = var17.field2790[var18][5];
                                var13[var18 + 1].method857(var19, var20, var21);
                                var13[var18 + 1].method855(var22, var23, var24);
                            }
                        }
                    }
                }
                class112 var25 = new class112(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3253[var26] < class225.field3825[var26].length) {
                        var25.method879(class117.field2179[var26], class225.field3825[var26][this.field3253[var26]]);
                    }
                    if (this.field3253[var26] < class135.field2429[var26].length) {
                        var25.method879(class99.field1680[var26], class135.field2429[var26][this.field3253[var26]]);
                    }
                }
                var10 = var25.method862(64, 850, -30, -50, -30);
                class224.field3817.method88(var10, arg2 ^ 0xB78E5367, var6);
                this.field3230 = var6;
            }
        }
        if (arg3 == null && arg0 == null) {
            return var10;
        }
        class35 var31;
        if (arg3 != null && arg0 != null) {
            var31 = arg3.method461(arg4, 85, var10, arg0, arg1);
        } else if (arg3 == null) {
            var31 = arg0.method470(false, var10, arg1);
        } else {
            var31 = arg3.method470(false, var10, arg4);
        }
        return var31;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field3254 = null;
        field3250 = null;
        field3246 = null;
        if (arg0 != 0) {
            field3255 = -37;
        }
        field3238 = null;
        field3244 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([IZ[III)V")
    public final void method1317(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class91.field1511; var7++) {
                    class150 var8 = class171.method1223(var7, 105);
                    if (var8 != null && !var8.field2652 && (var6 + (arg1 ? 7 : 0)) == var8.field2654) {
                        arg0[class11.field200[var6]] = class45.method348(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        if (arg4 <= 57) {
            return;
        }
        field3239++;
        this.field3243 = arg1;
        this.field3251 = arg0;
        this.field3253 = arg2;
        this.field3231 = arg3;
        this.method1308(false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZIIII)V")
    public static final void method1318(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class60 var5 = (class60) class132.field2373.method1081(0, (long) arg2);
        field3247++;
        if (var5 == null) {
            var5 = new class60();
            class132.field2373.method1085(-1, var5, (long) arg2);
        }
        if (var5.field1035.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1035.length; var8++) {
                var6[var8] = var5.field1035[var8];
                var7[var8] = var5.field1040[var8];
            }
            for (int var9 = var5.field1035.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1035 = var6;
            var5.field1040 = var7;
        }
        if (!arg0) {
            field3246 = null;
        }
        var5.field1035[arg4] = arg3;
        var5.field1040[arg4] = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lff;I)V")
    public static final void method1319(class3 arg0, int arg1) {
        field3248++;
        class33.field587 = class49.method375(arg0, class203.field3521, (byte) 117);
        class107.field1927 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class52.field903[var2] & 0xFF0000) >> 16);
            int var5 = class52.field903[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class52.field903[var2] & 0xFF00) >> 8);
            int var8 = class52.field903[var2 + 1] >> 8 & 0xFF;
            float var9 = (float) (class52.field903[var2] & 0xFF);
            float var10 = ((float) var8 - var7) / 64.0F;
            int var11 = class52.field903[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class107.field1927[var2 * 64 + var13] = class45.method348(class45.method348((int) var7 << 8, (int) var4 << 16), (int) var9);
                var4 += var6;
                var7 += var10;
                var9 += var12;
            }
        }
        if (arg1 != 255) {
            return;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class107.field1927[var3] = class52.field903[3];
        }
        class176.field3060 = new int[32768];
        class192.field3325 = new int[32768];
        class150.method1100((class30) null, arg1 - 382);
        class183.field3166 = new int[32768];
        class27.field454 = new int[32768];
        class93.field1534 = new class174(128, 254);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3236++;
        class244.method1713(arg3 ^ 0x77EE, arg6);
        if (arg3 != 30750) {
            return;
        }
        int var7 = 0;
        int var8 = arg6 - arg0;
        int var9 = arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class229.field3939[arg2];
        int var16 = arg4 - var8;
        class36.method283(arg4 - arg6, var15, var16, (byte) -78, arg1);
        int var17 = arg4 + var8;
        class36.method283(var16, var15, var17, (byte) -105, arg5);
        class36.method283(var17, var15, arg4 + arg6, (byte) -105, arg1);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class26.field442[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class229.field3939[arg2 - var9];
                    int[] var19 = class229.field3939[arg2 + var9];
                    int var20 = arg4 + var7;
                    int var21 = arg4 - var7;
                    class36.method283(var21, var19, var20, (byte) -100, arg1);
                    class36.method283(var21, var18, var20, (byte) -81, arg1);
                } else {
                    int[] var22 = class229.field3939[arg2 + var9];
                    int var23 = class26.field442[var9];
                    int[] var24 = class229.field3939[arg2 - var9];
                    int var25 = arg4 - var7;
                    int var26 = arg4 + var23;
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var23;
                    class36.method283(var25, var22, var28, (byte) -81, arg1);
                    class36.method283(var28, var22, var26, (byte) -102, arg5);
                    class36.method283(var26, var22, var27, (byte) -86, arg1);
                    class36.method283(var25, var24, var28, (byte) -89, arg1);
                    class36.method283(var28, var24, var26, (byte) -104, arg5);
                    class36.method283(var26, var24, var27, (byte) -119, arg1);
                }
            }
            int[] var29 = class229.field3939[arg2 + var7];
            int[] var30 = class229.field3939[arg2 - var7];
            int var31 = arg4 - var9;
            int var32 = arg4 + var9;
            if (var8 <= var7) {
                class36.method283(var31, var29, var32, (byte) -104, arg1);
                class36.method283(var31, var30, var32, (byte) -75, arg1);
            } else {
                int var33 = var11 >= var7 ? var11 : class26.field442[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class36.method283(var31, var29, var35, (byte) -96, arg1);
                class36.method283(var35, var29, var34, (byte) -108, arg5);
                class36.method283(var34, var29, var32, (byte) -122, arg1);
                class36.method283(var31, var30, var35, (byte) -102, arg1);
                class36.method283(var35, var30, var34, (byte) -72, arg5);
                class36.method283(var34, var30, var32, (byte) -74, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method1321(byte arg0) {
        field3232++;
        if (arg0 != 81) {
            return;
        }
        int var1 = (class236.field4047.field4511 >> 7) + class196.field3383;
        int var2 = (class236.field4047.field4533 >> 7) + class225.field3832;
        class71.field1226 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class71.field1226 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class71.field1226 = 1;
        }
        if (class71.field1226 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class71.field1226 = 0;
        }
    }
}
