import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class41 {

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "[B")
    public byte[] field1934;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "[S")
    public short[] field1922;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "[B")
    public byte[] field1940;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "[I")
    private int[] field1927;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "[B")
    public byte[] field1937;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "[Lke;")
    public class74[] field1941;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "[Ltd;")
    public class133[] field1950;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Lu;")
    private static class135 field1929 = class87.method676((byte) -68, "Add friend");

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Lu;")
    private static class135 field1938 = class87.method676((byte) -55, "On");

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Lu;")
    private static class135 field1932 = class87.method676((byte) -53, "Attack");

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Lu;")
    public static class135 field1933 = class87.method676((byte) -50, "Hidden)2use");

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
    public static boolean field1920 = false;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lu;")
    public static class135 field1931 = class87.method676((byte) -85, "Fertigkeit)2");

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Lu;")
    public static class135 field1924 = class87.method676((byte) -60, "titlebox");

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[I")
    public static int[] field1944 = new int[5];

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lu;")
    public static class135 field1948 = field1929;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Lu;")
    public static class135 field1953 = class87.method676((byte) -110, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "[I")
    public static int[] field1949 = new int[100];

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "Lu;")
    public static class135 field1956 = class87.method676((byte) -66, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Lu;")
    public static class135 field1936 = field1938;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lu;")
    public static class135 field1960 = field1932;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Lu;")
    public static class135 field1959 = class87.method676((byte) -90, "VOLL");

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "Lu;")
    public static class135 field1958 = class87.method676((byte) -102, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Lbc;")
    public static class11 field1925;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "Lre;")
    public static class122 field1952;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lg;")
    public static class43 field1951;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lg;IZ)Llf;")
    public static final class82 method633(class43 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1928 = 58;
        }
        field1942++;
        byte[] var3 = arg0.method331(arg1, (byte) 52);
        return var3 == null ? null : new class82(var3);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public final void method634(int arg0) {
        this.field1927 = null;
        if (arg0 > 81) {
            field1946++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILu;BLu;)V")
    public static final void method635(int arg0, class135 arg1, byte arg2, class135 arg3) {
        if (class49.field1174 == -1) {
            class65.field1634 = true;
        }
        if (arg0 == 0 && class99.field2384 != -1) {
            class21.field487 = arg3;
            class48.field1151 = 0;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class117.field2804[var4] = class117.field2804[var4 - 1];
            class25.field589[var4] = class25.field589[var4 - 1];
            class125.field2976[var4] = class125.field2976[var4 - 1];
        }
        if (arg2 <= 78) {
            method633(null, 101, true);
        }
        class117.field2804[0] = arg0;
        class25.field589[0] = arg1;
        field1935++;
        class125.field2976[0] = arg3;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public static final void method636(int arg0) {
        class135.field3264 = arg0;
        field1955++;
        int var1 = (class116.field2789.field172 >> 7) + class76.field1795;
        int var2 = (class116.field2789.field173 >> 7) + class126.field3010;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class135.field3264 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class135.field3264 = 1;
        }
        if (class135.field3264 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class135.field3264 = 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([ILid;I[B)Z")
    public final boolean method637(int[] arg0, class60 arg1, int arg2, byte[] arg3) {
        field1947++;
        boolean var5 = true;
        int var6 = 0;
        if (arg2 <= 40) {
            field1960 = null;
        }
        class74 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1927[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method499(arg0, (byte) -120, var9 >> 2);
                        } else {
                            var7 = arg1.method500(var9 >> 2, arg0, (byte) -127);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1941[var8] = var7;
                        this.field1927[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lg;IBI)Lae;")
    public static final class6 method638(class43 arg0, int arg1, byte arg2, int arg3) {
        field1926++;
        if (class79.method626((byte) -51, arg0, arg1, arg3)) {
            if (arg2 != -56) {
                method633(null, -22, true);
            }
            return class105.method855(45);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BBI[Lob;II)V")
    public static final void method639(int arg0, byte[] arg1, byte arg2, int arg3, class99[] arg4, int arg5, int arg6) {
        field1930++;
        int var7 = 0;
        if (arg2 <= 30) {
            method642((byte) -81);
        }
        while (var7 < 4) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg4[var7].field2391[arg3 + var12][arg0 + var13] = class4.method19(arg4[var7].field2391[arg3 + var12][arg0 + var13], -16777217);
                    }
                }
            }
            var7++;
        }
        class59 var8 = new class59(arg1);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class148.method1216(arg5, -50, arg0 + var11, 0, arg6, var9, var8, var10 + arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1948 = null;
        field1944 = null;
        field1936 = null;
        field1956 = null;
        field1933 = null;
        field1951 = null;
        field1959 = null;
        field1953 = null;
        field1929 = null;
        field1925 = null;
        field1949 = null;
        field1938 = null;
        field1931 = null;
        field1960 = null;
        field1958 = null;
        field1924 = null;
        field1952 = null;
        if (arg0 == 12668) {
            field1932 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)V")
    public static final void method641(long arg0, int arg1) {
        field1945++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1 != 114) {
            field1956 = null;
        }
        while (var3 < class119.field2844) {
            if (class14.field340[var3] == arg0) {
                class119.field2844--;
                class135.field3239 = true;
                for (int var4 = var3; var4 < class119.field2844; var4++) {
                    class14.field340[var4] = class14.field340[var4 + 1];
                }
                class152.field3751.method929(114, -14044);
                class55.field1294++;
                class152.field3751.method461(arg1 ^ 0x2DA9, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static final void method642(byte arg0) {
        field1921++;
        class77 var1 = class46.field1103;
        synchronized (class46.field1103) {
            class1.field15 = class3.field85;
            if (arg0 < 117) {
                field1933 = null;
            }
            if (class143.field3503 >= 0) {
                while (class148.field3705 != class143.field3503) {
                    int var2 = class25.field621[class148.field3705];
                    class148.field3705 = class148.field3705 + 1 & 0x7F;
                    if (var2 < 0) {
                        class94.field2218[~var2] = false;
                    } else {
                        class94.field2218[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class94.field2218[var3] = false;
                }
                class143.field3503 = class148.field3705;
            }
            class3.field85 = class57.field1406;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    private class82(byte[] arg0) {
        this.field1934 = new byte[128];
        this.field1922 = new short[128];
        this.field1940 = new byte[128];
        this.field1927 = new int[128];
        this.field1937 = new byte[128];
        this.field1941 = new class74[128];
        this.field1950 = new class133[128];
        class59 var2 = new class59(arg0);
        int var3;
        for (var3 = 0; var2.field1495[var2.field1485 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method475(-49152);
        }
        var3++;
        var2.field1485++;
        int var6 = 0;
        int var7 = var2.field1485;
        var2.field1485 += var3;
        while (var2.field1495[var2.field1485 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method475(-49152);
        }
        var6++;
        var2.field1485++;
        int var10 = var2.field1485;
        var2.field1485 += var6;
        int var11;
        for (var11 = 0; var2.field1495[var2.field1485 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method475(-49152);
        }
        var11++;
        var2.field1485++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method480(0);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class133[] var19 = new class133[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class133 var103 = var19[var20] = new class133();
            int var104 = var2.method480(0);
            if (var104 > 0) {
                var103.field3204 = new byte[var104 * 2];
            }
            int var105 = var2.method480(0);
            if (var105 > 0) {
                var103.field3206 = new byte[var105 * 2 + 2];
                var103.field3206[1] = 64;
            }
        }
        int var21 = var2.method480(0);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method480(0);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field1495[var2.field1485 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method475(-49152);
        }
        var25++;
        var2.field1485++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method480(0);
            this.field1922[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method480(0);
            this.field1922[var31] = (short) (this.field1922[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method494((byte) -22);
            }
            var32--;
            this.field1922[var35] = (short) (this.field1922[var35] + (class4.method19(2, var34 - 1) << 14));
            this.field1927[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1927[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field1495[var7++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                var37--;
                this.field1934[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1927[var43] != 0) {
                if (var42 == 0) {
                    if (var8.length <= var40) {
                        var42 = -1;
                    } else {
                        var42 = var8[var40++];
                    }
                    var41 = var2.field1495[var10++] + 16 << 2;
                }
                this.field1940[var43] = (byte) var41;
                var42--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class133 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1927[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field1950[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var26.length <= var48) {
                    var50 = -1;
                } else {
                    var50 = var26[var48++];
                }
                if (this.field1927[var51] > 0) {
                    var49 = var2.method480(0) + 1;
                }
            }
            this.field1937[var51] = (byte) var49;
            var50--;
        }
        this.field1939 = var2.method480(0) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class133 var100 = var19[var52];
            if (var100.field3204 != null) {
                for (int var101 = 1; var101 < var100.field3204.length; var101 += 2) {
                    var100.field3204[var101] = var2.method475(-49152);
                }
            }
            if (var100.field3206 != null) {
                for (int var102 = 3; var102 < var100.field3206.length - 2; var102 += 2) {
                    var100.field3206[var102] = var2.method475(-49152);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method475(-49152);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method475(-49152);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class133 var97 = var19[var55];
            if (var97.field3206 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3206.length; var99 += 2) {
                    var98 += var2.method480(0) + 1;
                    var97.field3206[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class133 var94 = var19[var56];
            if (var94.field3204 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3204.length; var96 += 2) {
                    var95 = var2.method480(0) + var95 + 1;
                    var94.field3204[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method480(0);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method480(0) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1937[var61] = (byte) (this.field1937[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) * var60 + (var65 - var59) / 2;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class48.method361(-13686, var67, var65 - var59);
                    var67 += var66 - var60;
                    this.field1937[var68] = (byte) (this.field1937[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1937[var64] = (byte) (this.field1937[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method480(0);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 -= -var2.method480(0) - 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1940[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1940[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class48.method361(-13686, var81, var79 - var72);
                    int var84 = (this.field1940[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    var81 += var80 - var73;
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1940[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1940[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1940[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3211 = var2.method480(0);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class133 var93 = var19[var87];
            if (var93.field3204 != null) {
                var93.field3208 = var2.method480(0);
            }
            if (var93.field3206 != null) {
                var93.field3216 = var2.method480(0);
            }
            if (var93.field3211 > 0) {
                var93.field3201 = var2.method480(0);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3212 = var2.method480(0);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class133 var92 = var19[var89];
            if (var92.field3212 > 0) {
                var92.field3200 = var2.method480(0);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class133 var91 = var19[var90];
            if (var91.field3200 > 0) {
                var91.field3214 = var2.method480(0);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method643(int arg0) {
        field1943++;
        if (arg0 != 12523) {
            return;
        }
        if (class100.field2422 && class86.field2045 != class136.field3301) {
            class20.method153(class136.field3301, class116.field2789.field162[0], class132.field3183, (byte) -71, class56.field1362, class116.field2789.field192[0]);
        } else if (class136.field3301 != class116.field2787) {
            class116.field2787 = class136.field3301;
            class109.method880(class136.field3301, -68);
        }
    }
}
