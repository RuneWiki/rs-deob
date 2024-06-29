import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[[I")
    private int[][] field2063;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2060 = 128;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lrd;")
    private static class117 field2062 = class95.method812("Cancel", (byte) 8);

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lrd;")
    public static class117 field2064 = class95.method812("Lade Eingabe)2Steuerungsprogramm)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lrd;")
    public static class117 field2075 = field2062;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field2070 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lge;")
    public static class47 field2061;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Laf;")
    public static class7 field2076;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    public final int method698(int arg0, int arg1) {
        field2067++;
        if (this.field2063 != null) {
            arg0 = (int) ((long) this.field2069 * (long) arg0 / (long) this.field2074) + 6;
        }
        if (arg1 > -37) {
            this.method702(-2, 98);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lwa;II)I")
    public static final int method699(class144 arg0, int arg1, int arg2) {
        field2072++;
        if (arg0.field3485 == null || arg0.field3485.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field3485[arg2];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            if (arg1 != -1) {
                field2061 = null;
            }
            while (true) {
                int var7 = 0;
                int var8 = var3[var4++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 1) {
                    var7 = class90.field2300[var3[var4++]];
                }
                if (var8 == 2) {
                    var7 = class86.field2246[var3[var4++]];
                }
                if (var8 == 3) {
                    var7 = class42.field1208[var3[var4++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class144 var12 = class15.method172(var11, -13778);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class108.method887(-1, var13).field1372 || class33.field986)) {
                        for (int var14 = 0; var14 < var12.field3449.length; var14++) {
                            if (var13 + 1 == var12.field3449[var14]) {
                                var7 += var12.field3464[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class105.field2621[var3[var4++]];
                }
                if (var8 == 6) {
                    var7 = class25.field736[class86.field2246[var3[var4++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class105.field2621[var3[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class144.field3516.field2534;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class142.field3375[var15]) {
                            var7 += class86.field2246[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class144 var18 = class15.method172(var17, arg1 - 13777);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class108.method887(-1, var19).field1372 || class33.field986)) {
                        for (int var20 = 0; var20 < var18.field3449.length; var20++) {
                            if (var19 + 1 == var18.field3449[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class73.field2035;
                }
                if (var8 == 12) {
                    var7 = class41.field1169;
                }
                if (var8 == 13) {
                    int var21 = class105.field2621[var3[var4++]];
                    int var22 = var3[var4++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var4++];
                    var7 = class105.method867(var23, 134100633);
                }
                if (var8 == 18) {
                    var7 = (class144.field3516.field717 >> 7) + class95.field2371;
                }
                if (var8 == 19) {
                    var7 = (class144.field3516.field751 >> 7) + class108.field2678;
                }
                if (var8 == 20) {
                    var7 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var7;
                    }
                    if (var6 == 1) {
                        var5 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var5 /= var7;
                    }
                    if (var6 == 3) {
                        var5 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method700(int arg0) {
        field2061 = null;
        field2076 = null;
        field2064 = null;
        if (arg0 != -25137) {
            field2064 = null;
        }
        field2075 = null;
        field2062 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILj;I)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3, class62 arg4, int arg5) {
        field2059++;
        class120 var6 = new class120();
        var6.field2951 = arg4.field1740;
        var6.field2949 = arg4.field1746;
        int var7 = arg4.field1750;
        var6.field2954 = arg0 * 128;
        var6.field2946 = arg4.field1784;
        var6.field2936 = arg4.field1774;
        int var8 = arg4.field1737;
        var6.field2935 = arg4.field1786 * 128;
        var6.field2957 = arg5;
        if (arg1 < 1) {
            method704(84);
        }
        var6.field2942 = arg3 * 128;
        if (arg2 == 1 || arg2 == 3) {
            var7 = arg4.field1737;
            var8 = arg4.field1750;
        }
        var6.field2950 = (arg0 + var7) * 128;
        var6.field2955 = (arg3 + var8) * 128;
        if (arg4.field1791 != null) {
            var6.field2944 = arg4;
            var6.method985(0);
        }
        class96.field2397.method10(var6, (byte) 114);
        if (var6.field2949 != null) {
            var6.field2945 = var6.field2946 + (int) ((double) (var6.field2936 - var6.field2946) * Math.random());
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
    public final int method702(int arg0, int arg1) {
        if (arg0 > -12) {
            this.method698(-91, 90);
        }
        field2068++;
        if (this.field2063 != null) {
            arg1 = (int) ((long) this.field2069 * (long) arg1 / (long) this.field2074);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)[B")
    public final byte[] method703(int arg0, byte[] arg1) {
        int var3 = -125 / ((arg0 - 27) / 61);
        if (this.field2063 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field2069 / (long) this.field2074) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                int[] var11 = this.field2063[var6];
                byte var12 = arg1[var8];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var7 + var13] += var11[var13] * var12;
                }
                int var14 = this.field2069 + var6;
                int var15 = var14 / this.field2074;
                var7 += var15;
                var6 = var14 - this.field2074 * var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 <= 127) {
                    arg1[var9] = (byte) var10;
                } else {
                    arg1[var9] = 127;
                }
            }
        }
        field2071++;
        return arg1;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
    public class74(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class73.method689(arg1, arg0, 24);
            int var4 = arg1 / var3;
            this.field2069 = var4;
            int var5 = arg0 / var3;
            this.field2074 = var5;
            this.field2063 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2063[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        field2073++;
        class102.method857(false, false);
        boolean var1 = true;
        class1.field12 = 0;
        for (int var2 = 0; var2 < class67.field1897.length; var2++) {
            if (class45.field1260[var2] != -1 && class67.field1897[var2] == null) {
                class67.field1897[var2] = field2076.method526((byte) 117, class45.field1260[var2], 0);
                if (class67.field1897[var2] == null) {
                    var1 = false;
                    class1.field12++;
                }
            }
            if (class27.field812[var2] != -1 && class117.field2859[var2] == null) {
                class117.field2859[var2] = field2076.method522(0, class27.field812[var2], class116.field2836[var2], (byte) -125);
                if (class117.field2859[var2] == null) {
                    class1.field12++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class142.field3367 = 1;
            return;
        }
        boolean var3 = true;
        class59.field1637 = 0;
        for (int var4 = 0; var4 < class67.field1897.length; var4++) {
            byte[] var56 = class117.field2859[var4];
            if (var56 != null) {
                int var57 = (class6.field139[var4] >> 8) * 64 - class95.field2371;
                int var58 = (class6.field139[var4] & 0xFF) * 64 - class108.field2678;
                if (class79.field2122) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class41.method473(var58, var57, true, var56);
            }
        }
        if (!var3) {
            class142.field3367 = 2;
            return;
        }
        if (class142.field3367 != 0) {
            class110.method910(true, class115.field2822, 122, class133.field3194);
        }
        class49.method544((byte) 105);
        class111.method914(-128);
        class49.method544((byte) 81);
        if (arg0 > -13) {
            method701(123, 14, -34, 88, null, 52);
        }
        class90.field2308.method349();
        class49.method544((byte) 96);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class18.field461[var5].method571((byte) 103);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class124.field3002[var6][var54][var55] = 0;
                }
            }
        }
        class49.method544((byte) 120);
        class5.method39((byte) 84);
        int var7 = class67.field1897.length;
        class33.method390(13503);
        class102.method857(true, false);
        if (!class79.field2122) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class6.field139[var8] >> 8) * 64 - class95.field2371;
                int var18 = (class6.field139[var8] & 0xFF) * 64 - class108.field2678;
                byte[] var19 = class67.field1897[var8];
                if (var19 != null) {
                    class49.method544((byte) 80);
                    class36.method449((class5.field113 - 6) * 8, var17, class18.field461, 2909, var18, class2.field68 * 8 - 48, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class6.field139[var9] & 0xFF) * 64 - class108.field2678;
                int var15 = (class6.field139[var9] >> 8) * 64 - class95.field2371;
                byte[] var16 = class67.field1897[var9];
                if (var16 == null && class5.field113 < 800) {
                    class49.method544((byte) 107);
                    class13.method112(-87, 64, 64, var15, var14);
                }
            }
            class102.method857(true, false);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class117.field2859[var10];
                if (var11 != null) {
                    int var12 = (class6.field139[var10] >> 8) * 64 - class95.field2371;
                    int var13 = (class6.field139[var10] & 0xFF) * 64 - class108.field2678;
                    class49.method544((byte) 124);
                    class65.method655(class18.field461, class90.field2308, (byte) 117, var11, var12, var13);
                }
            }
        }
        if (class79.field2122) {
            for (int var20 = 0; var20 < 4; var20++) {
                class49.method544((byte) 83);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class20.field539[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 1 & 0x3;
                            int var39 = var37 >> 14 & 0x3FF;
                            int var40 = var37 >> 3 & 0x7FF;
                            int var41 = var37 >> 24 & 0x3;
                            int var42 = (var39 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class6.field139.length; var43++) {
                                if (class6.field139[var43] == var42 && class67.field1897[var43] != null) {
                                    var36 = true;
                                    class127.method1014(var41, var20, var35 * 8, (var40 & 0x7) * 8, (var39 & 0x7) * 8, var34 * 8, class18.field461, class67.field1897[var43], (byte) -126, var38);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class133.method1090(var34 * 8, var35 * 8, (byte) 117, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class20.field539[0][var21][var32];
                    if (var33 == -1) {
                        class13.method112(-64, 8, 8, var21 * 8, var32 * 8);
                    }
                }
            }
            class102.method857(true, false);
            for (int var22 = 0; var22 < 4; var22++) {
                class49.method544((byte) 111);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class20.field539[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 3 & 0x7FF;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 1 & 0x3;
                            int var30 = (var28 / 8 << 8) + var27 / 8;
                            for (int var31 = 0; var31 < class6.field139.length; var31++) {
                                if (class6.field139[var31] == var30 && class117.field2859[var31] != null) {
                                    class90.method789(var23 * 8, var22, class90.field2308, var24 * 8, class18.field461, var29, var26, (byte) 101, (var28 & 0x7) * 8, (var27 & 0x7) * 8, class117.field2859[var31]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class102.method857(true, false);
        class111.method914(-106);
        class49.method544((byte) 101);
        class41.method470(class18.field461, class90.field2308, (byte) 41);
        class102.method857(true, false);
        int var44 = class35.field1032;
        if (class120.field2940 < var44) {
            var44 = class120.field2940;
        }
        if (var44 < class120.field2940 - 1) {
            int var45 = class120.field2940 - 1;
        }
        if (class68.field1925) {
            class90.field2308.method327(class35.field1032);
        } else {
            class90.field2308.method327(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class85.method767((byte) -93, var53, var46);
            }
        }
        class49.method544((byte) 122);
        class67.method664(-96);
        class65.field1864.method766(5);
        if (class26.field768 != null) {
            class25.field754.method739(false, 247);
            class39.field1138++;
            class25.field754.method124(1057001181, 0);
        }
        if (!class79.field2122) {
            int var47 = (class2.field68 - 6) / 8;
            int var48 = (class2.field68 + 6) / 8;
            int var49 = (class5.field113 + 6) / 8;
            int var50 = (class5.field113 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var52 < var50 || var49 < var52) {
                        field2076.method521(37, class18.method193(new class117[] { class138.field3327, class142.method1131(var51, true), class59.field1671, class142.method1131(var52, true) }, 74));
                        field2076.method521(69, class18.method193(new class117[] { class15.field338, class142.method1131(var51, true), class59.field1671, class142.method1131(var52, true) }, 18));
                    }
                }
            }
        }
        if (class17.field428 == -1) {
            class85.method769(0, 30);
        } else {
            class85.method769(0, 35);
        }
        class49.method544((byte) 127);
        class132.method1083(true);
        class25.field754.method739(false, 168);
        class77.method734(0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method705(Component arg0, byte arg1) {
        field2066++;
        int var2 = -118 % ((40 - arg1) / 33);
        Method var3 = class9.field196;
        if (var3 != null) {
            try {
                var3.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class72.field2001);
        arg0.addFocusListener(class72.field2001);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static final void method706(int arg0) {
        field2065++;
        if (class92.field2324 == 95) {
            int var1 = class104.field2588.method144((byte) 49);
            int var2 = (var1 >> 4 & 0x7) + class35.field1042;
            int var3 = (var1 & 0x7) + class40.field1154;
            int var4 = class104.field2588.method156(255);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class127.field3033[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class43.method481(1, class120.field2940, var7, var3, -1, var2, 0, var6, var5, -1);
            }
        } else if (class92.field2324 == 41) {
            int var8 = class104.field2588.method138((byte) 74);
            int var9 = class104.field2588.method153(true);
            int var10 = class40.field1154 + (var9 & 0x7);
            int var11 = (var9 >> 4 & 0x7) + class35.field1042;
            int var12 = class104.field2588.method144((byte) -87);
            int var13 = var12 & 0x3;
            int var14 = var12 >> 2;
            int var15 = class127.field3033[var14];
            if (var11 >= 0 && var10 >= 0 && var11 < 104 && var10 < 104) {
                class43.method481(1, class120.field2940, var15, var10, -1, var11, 0, var13, var14, var8);
            }
        } else {
            if (class92.field2324 == 52) {
                int var16 = class104.field2588.method153(true);
                int var17 = (var16 >> 4 & 0x7) + class35.field1042;
                int var18 = class40.field1154 + (var16 & 0x7);
                int var19 = class104.field2588.method138((byte) 105);
                int var20 = class104.field2588.method153(true);
                int var21 = var20 & 0x7;
                int var22 = class104.field2588.method153(true);
                int var23 = var20 >> 4 & 0xF;
                if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                    int var24 = var23 + 1;
                    if (var17 - var24 <= class144.field3516.field739[0] && class144.field3516.field739[0] <= var17 + var24 && class144.field3516.field708[0] >= var18 - var24 && class144.field3516.field708[0] <= var18 + var24 && class63.field1813 != 0 && var21 > 0 && class27.field803 < 50) {
                        class14.field298[class27.field803] = var19;
                        class115.field2818[class27.field803] = var21;
                        class77.field2088[class27.field803] = var22;
                        class18.field454[class27.field803] = null;
                        class100.field2492[class27.field803] = (var17 << 16) + (var18 << 8) + var23;
                        class27.field803++;
                    }
                }
            }
            if (class92.field2324 == 241) {
                int var25 = class104.field2588.method127(true);
                int var26 = class104.field2588.method168(255);
                int var27 = class35.field1042 + (var26 >> 4 & 0x7);
                int var28 = (var26 & 0x7) + class40.field1154;
                int var29 = class104.field2588.method167(true);
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    class135 var30 = new class135();
                    var30.field3226 = var25;
                    var30.field3227 = var29;
                    if (class105.field2631[class120.field2940][var27][var28] == null) {
                        class105.field2631[class120.field2940][var27][var28] = new class1();
                    }
                    class105.field2631[class120.field2940][var27][var28].method10(var30, (byte) 104);
                    class85.method767((byte) 80, var28, var27);
                }
            } else if (class92.field2324 == 123) {
                int var31 = class104.field2588.method153(true);
                int var32 = class40.field1154 + (var31 & 0x7);
                int var33 = (var31 >> 4 & 0x7) + class35.field1042;
                int var34 = class104.field2588.method138((byte) 89);
                int var35 = class104.field2588.method153(true);
                int var36 = class104.field2588.method138((byte) 109);
                if (var33 >= 0 && var32 >= 0 && var33 < 104 && var32 < 104) {
                    int var37 = var33 * 128 + 64;
                    int var38 = var32 * 128 + 64;
                    class107 var39 = new class107(var34, class120.field2940, var37, var38, class133.method1091(class120.field2940, var38, (byte) -79, var37) - var35, var36, class85.field2236);
                    class22.field634.method10(var39, (byte) 92);
                }
            } else {
                if (class92.field2324 == 171) {
                    int var40 = class104.field2588.method132(65280);
                    byte var41 = class104.field2588.method165((byte) -80);
                    int var42 = class104.field2588.method156(255);
                    int var43 = (var42 & 0x7) + class40.field1154;
                    int var44 = (var42 >> 4 & 0x7) + class35.field1042;
                    byte var45 = class104.field2588.method134(-128);
                    int var46 = class104.field2588.method138((byte) 125);
                    int var47 = class104.field2588.method132(65280);
                    int var48 = class104.field2588.method156(255);
                    int var49 = var48 >> 2;
                    int var50 = var48 & 0x3;
                    int var51 = class127.field3033[var49];
                    byte var52 = class104.field2588.method134(-128);
                    int var53 = class104.field2588.method127(true);
                    byte var54 = class104.field2588.method134(-128);
                    class101 var55;
                    if (class104.field2604 == var40) {
                        var55 = class144.field3516;
                    } else {
                        var55 = class93.field2340[var40];
                    }
                    if (var55 != null) {
                        class62 var56 = class147.method1191((byte) 112, var53);
                        int var57 = class14.field272[class120.field2940][var44][var43];
                        int var58 = class14.field272[class120.field2940][var44][var43 + 1];
                        int var59 = class14.field272[class120.field2940][var44 + 1][var43];
                        int var60 = class14.field272[class120.field2940][var44 + 1][var43 + 1];
                        class28 var61 = var56.method625(var59, var60, var57, var58, var49, -22983, var50);
                        if (var61 != null) {
                            class43.method481(1, class120.field2940, var51, var43, var47 + 1, var44, var46 + 1, 0, 0, -1);
                            var55.field2523 = class85.field2236 + var47;
                            var55.field2510 = var61;
                            if (var41 > var45) {
                                byte var62 = var41;
                                var41 = var45;
                                var45 = var62;
                            }
                            if (var54 > var52) {
                                byte var63 = var54;
                                var54 = var52;
                                var52 = var63;
                            }
                            var55.field2520 = var46 + class85.field2236;
                            int var64 = var56.field1737;
                            int var65 = var56.field1750;
                            if (var50 == 1 || var50 == 3) {
                                var65 = var56.field1737;
                                var64 = var56.field1750;
                            }
                            var55.field2530 = var44 * 128 + var64 * 64;
                            var55.field2517 = var43 * 128 + var65 * 64;
                            var55.field2506 = class133.method1091(class120.field2940, var55.field2517, (byte) -14, var55.field2530);
                            var55.field2504 = var43 + var52;
                            var55.field2522 = var44 + var45;
                            var55.field2533 = var44 + var41;
                            var55.field2513 = var43 + var54;
                        }
                    }
                }
                if (class92.field2324 == 249) {
                    int var66 = class104.field2588.method153(true);
                    int var67 = class35.field1042 + (var66 >> 4 & 0x7);
                    int var68 = (var66 & 0x7) + class40.field1154;
                    int var69 = class104.field2588.method138((byte) 114);
                    int var70 = class104.field2588.method138((byte) 96);
                    int var71 = class104.field2588.method138((byte) 104);
                    if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                        class1 var72 = class105.field2631[class120.field2940][var67][var68];
                        if (var72 != null) {
                            for (class135 var73 = (class135) var72.method3(false); var73 != null; var73 = (class135) var72.method14(127)) {
                                if ((var69 & 0x7FFF) == var73.field3227 && var73.field3226 == var70) {
                                    var73.field3226 = var71;
                                    break;
                                }
                            }
                            class85.method767((byte) 56, var68, var67);
                        }
                    }
                } else if (class92.field2324 == 203) {
                    int var74 = class104.field2588.method127(true);
                    int var75 = class104.field2588.method127(true);
                    int var76 = class104.field2588.method132(65280);
                    int var77 = class104.field2588.method168(255);
                    int var78 = (var77 >> 4 & 0x7) + class35.field1042;
                    int var79 = (var77 & 0x7) + class40.field1154;
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && class104.field2604 != var75) {
                        class135 var80 = new class135();
                        var80.field3227 = var76;
                        var80.field3226 = var74;
                        if (class105.field2631[class120.field2940][var78][var79] == null) {
                            class105.field2631[class120.field2940][var78][var79] = new class1();
                        }
                        class105.field2631[class120.field2940][var78][var79].method10(var80, (byte) 105);
                        class85.method767((byte) 116, var79, var78);
                    }
                } else {
                    int var81 = -79 % ((arg0 + 78) / 33);
                    if (class92.field2324 == 59) {
                        int var82 = class104.field2588.method153(true);
                        int var83 = (var82 >> 4 & 0x7) + class35.field1042;
                        int var84 = (var82 & 0x7) + class40.field1154;
                        int var85 = class104.field2588.method129((byte) -111) + var83;
                        int var86 = var84 + class104.field2588.method129((byte) 60);
                        int var87 = class104.field2588.method155(true);
                        int var88 = class104.field2588.method138((byte) 77);
                        int var89 = class104.field2588.method153(true) * 4;
                        int var90 = class104.field2588.method153(true) * 4;
                        int var91 = class104.field2588.method138((byte) 76);
                        int var92 = class104.field2588.method138((byte) 87);
                        int var93 = class104.field2588.method153(true);
                        int var94 = class104.field2588.method153(true);
                        if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var88 != 65535) {
                            int var95 = var84 * 128 + 64;
                            int var96 = var85 * 128 + 64;
                            int var97 = var86 * 128 + 64;
                            int var98 = var83 * 128 + 64;
                            class53 var99 = new class53(var88, class120.field2940, var98, var95, class133.method1091(class120.field2940, var95, (byte) 43, var98) - var89, class85.field2236 + var91, class85.field2236 + var92, var93, var94, var87, var90);
                            var99.method582(class85.field2236 + var91, var96, 1, class133.method1091(class120.field2940, var97, (byte) -9, var96) - var90, var97);
                            class104.field2609.method10(var99, (byte) 101);
                        }
                    } else if (class92.field2324 == 207) {
                        int var100 = class104.field2588.method127(true);
                        int var101 = class104.field2588.method144((byte) 111);
                        int var102 = (var101 >> 4 & 0x7) + class35.field1042;
                        int var103 = (var101 & 0x7) + class40.field1154;
                        if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                            class1 var104 = class105.field2631[class120.field2940][var102][var103];
                            if (var104 != null) {
                                for (class135 var105 = (class135) var104.method3(false); var105 != null; var105 = (class135) var104.method14(127)) {
                                    if ((var100 & 0x7FFF) == var105.field3227) {
                                        var105.method691(0);
                                        break;
                                    }
                                }
                                if (var104.method3(false) == null) {
                                    class105.field2631[class120.field2940][var102][var103] = null;
                                }
                                class85.method767((byte) -95, var103, var102);
                            }
                        }
                    } else if (class92.field2324 == 63) {
                        int var106 = class104.field2588.method132(65280);
                        int var107 = class104.field2588.method153(true);
                        int var108 = var107 >> 2;
                        int var109 = var107 & 0x3;
                        int var110 = class127.field3033[var108];
                        int var111 = class104.field2588.method156(255);
                        int var112 = class35.field1042 + (var111 >> 4 & 0x7);
                        int var113 = (var111 & 0x7) + class40.field1154;
                        if (var112 >= 0 && var113 >= 0 && var112 < 103 && var113 < 103) {
                            int var114 = class14.field272[class120.field2940][var112][var113];
                            int var115 = class14.field272[class120.field2940][var112 + 1][var113];
                            int var116 = class14.field272[class120.field2940][var112 + 1][var113 + 1];
                            int var117 = class14.field272[class120.field2940][var112][var113 + 1];
                            if (var110 == 0) {
                                class33 var118 = class90.field2308.method365(class120.field2940, var112, var113);
                                if (var118 != null) {
                                    int var119 = var118.field995 >> 14 & 0x7FFF;
                                    if (var108 == 2) {
                                        var118.field979 = new class58(var119, 2, var109 + 4, var114, var115, var116, var117, var106, false, var118.field979);
                                        var118.field974 = new class58(var119, 2, var109 + 1 & 0x3, var114, var115, var116, var117, var106, false, var118.field974);
                                    } else {
                                        var118.field979 = new class58(var119, var108, var109, var114, var115, var116, var117, var106, false, var118.field979);
                                    }
                                }
                            }
                            if (var110 == 1) {
                                class57 var120 = class90.field2308.method352(class120.field2940, var112, var113);
                                if (var120 != null) {
                                    var120.field1585 = new class58(var120.field1577 >> 14 & 0x7FFF, 4, 0, var114, var115, var116, var117, var106, false, var120.field1585);
                                }
                            }
                            if (var110 == 2) {
                                if (var108 == 11) {
                                    var108 = 10;
                                }
                                class38 var121 = class90.field2308.method338(class120.field2940, var112, var113);
                                if (var121 != null) {
                                    var121.field1106 = new class58(var121.field1118 >> 14 & 0x7FFF, var108, var109, var114, var115, var116, var117, var106, false, var121.field1106);
                                }
                            }
                            if (var110 == 3) {
                                class37 var122 = class90.field2308.method343(class120.field2940, var112, var113);
                                if (var122 != null) {
                                    var122.field1075 = new class58(var122.field1089 >> 14 & 0x7FFF, 22, var109, var114, var115, var116, var117, var106, false, var122.field1075);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
