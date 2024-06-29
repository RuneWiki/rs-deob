import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class117 extends class5 {

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Lhb;")
    private static class44 field2852 = class102.method810("Loaded input handler", -28606);

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "[I")
    public static int[] field2855 = new int[256];

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lhb;")
    public static class44 field2853 = field2852;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "Z")
    public static boolean field2868 = false;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Z")
    public static boolean field2859 = false;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Z")
    public static boolean field2851 = false;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "[I")
    public static int[] field2869 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Lhb;")
    public static class44 field2850 = class102.method810("blinken2:", -28606);

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "Lhb;")
    public static class44 field2866 = class102.method810(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -28606);

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "Lpc;")
    public static class93 field2865;

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "[I")
    public static int[] field2861;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "[[I")
    public static int[][] field2860;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2855[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lhb;Ltd;ILhb;)Lne;", line = 6)
    public static final class83 method899(class44 arg0, class116 arg1, int arg2, class44 arg3) {
        field2864++;
        int var4 = arg1.method897(126, arg0);
        if (arg2 <= 124) {
            field2850 = null;
        }
        int var5 = arg1.method890((byte) 87, arg3, var4);
        return class4.method36(var4, (byte) -83, arg1, var5);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILwd;Z)V", line = 40)
    private final void method900(int arg0, class131 arg1, boolean arg2) {
        field2857++;
        if (arg0 == 1) {
            this.field2872 = arg1.method1001(65280);
            this.field2854 = arg1.method971(arg2);
            this.field2873 = arg1.method971(true);
        }
        if (!arg2) {
            method899(null, null, -23, null);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V", line = 60)
    public static final void method901(byte arg0) {
        field2862++;
        if (class125.field3027 > 0) {
            class19.method146(10);
        } else {
            class131.method1009(40, -102);
            class61.field1565 = class107.field2711;
            int var1 = -112 / ((arg0 - 61) / 58);
            class107.field2711 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V", line = 82)
    public static void method902(int arg0) {
        field2850 = null;
        field2861 = null;
        if (arg0 != 0) {
            method902(80);
        }
        field2852 = null;
        field2860 = null;
        field2865 = null;
        field2855 = null;
        field2869 = null;
        field2853 = null;
        field2866 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([Lhb;Z)Lhb;", line = 101)
    public static final class44 method903(class44[] arg0, boolean arg1) {
        field2871++;
        if (arg1) {
            field2865 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class102.method807(arg0.length, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILwd;)V", line = 132)
    public final void method904(int arg0, class131 arg1) {
        field2867++;
        while (true) {
            int var3 = arg1.method971(true);
            if (var3 == 0) {
                if (arg0 == 16060) {
                    return;
                } else {
                    this.method904(117, null);
                    return;
                }
            }
            this.method900(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V", line = 174)
    public static final void method905(byte arg0) {
        class53.method499((byte) -117, false);
        field2863++;
        boolean var1 = true;
        class77.field1922 = 0;
        for (int var2 = 0; var2 < class84.field2140.length; var2++) {
            if (class11.field212[var2] != -1 && class84.field2140[var2] == null) {
                class84.field2140[var2] = class79.field1983.method892(class11.field212[var2], 0, false);
                if (class84.field2140[var2] == null) {
                    var1 = false;
                    class77.field1922++;
                }
            }
            if (class16.field324[var2] != -1 && class75.field1913[var2] == null) {
                class75.field1913[var2] = class79.field1983.method878(-128, 0, class16.field324[var2], field2860[var2]);
                if (class75.field1913[var2] == null) {
                    var1 = false;
                    class77.field1922++;
                }
            }
        }
        if (!var1) {
            class27.field639 = 1;
            return;
        }
        boolean var3 = true;
        class80.field2025 = 0;
        for (int var4 = 0; var4 < class84.field2140.length; var4++) {
            byte[] var56 = class75.field1913[var4];
            if (var56 != null) {
                int var57 = (class84.field2148[var4] >> 8) * 64 - class104.field2666;
                int var58 = (class84.field2148[var4] & 0xFF) * 64 - class120.field2936;
                if (class75.field1901) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class51.method481(var58, var57, -110, var56);
            }
        }
        if (!var3) {
            class27.field639 = 2;
            return;
        }
        if (arg0 >= -118) {
            method901((byte) -74);
        }
        if (class27.field639 != 0) {
            class40.method349(class36.field857, (byte) 95, true, class53.field1325);
        }
        class128.method956(0);
        class89.field2283.method262();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class67.field1678[var5].method740(-111);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class104.field2668[var6][var54][var55] = 0;
                }
            }
        }
        class19.method144(0);
        int var7 = class84.field2140.length;
        class40.method347(true);
        class53.method499((byte) -109, true);
        if (!class75.field1901) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class84.field2148[var8] >> 8) * 64 - class104.field2666;
                int var18 = (class84.field2148[var8] & 0xFF) * 64 - class120.field2936;
                byte[] var19 = class84.field2140[var8];
                if (var19 != null) {
                    class47.method446((class16.field311 - 6) * 8, var17, var19, (class128.field3067 - 6) * 8, var18, 27680, class67.field1678);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class84.field2148[var9] >> 8) * 64 - class104.field2666;
                int var15 = (class84.field2148[var9] & 0xFF) * 64 - class120.field2936;
                byte[] var16 = class84.field2140[var9];
                if (var16 == null && class128.field3067 < 800) {
                    class94.method751(64, 64, var14, var15, (byte) -84);
                }
            }
            class53.method499((byte) -110, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class75.field1913[var10];
                if (var11 != null) {
                    int var12 = (class84.field2148[var10] & 0xFF) * 64 - class120.field2936;
                    int var13 = (class84.field2148[var10] >> 8) * 64 - class104.field2666;
                    class51.method483(class67.field1678, class89.field2283, 29, var11, var13, var12);
                }
            }
        }
        if (class75.field1901) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = client.field382[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 1 & 0x3;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class84.field2148.length; var43++) {
                                if (class84.field2148[var43] == var42 && class84.field2140[var43] != null) {
                                    class74.method621(var20, var38, var40, (var39 & 0x7) * 8, class84.field2140[var43], class67.field1678, var34 * 8, -9, (var41 & 0x7) * 8, var35 * 8);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class101.method798(var35 * 8, var20, 1, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = client.field382[0][var21][var32];
                    if (var33 == -1) {
                        class94.method751(8, 8, var21 * 8, var32 * 8, (byte) -84);
                    }
                }
            }
            class53.method499((byte) -97, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = client.field382[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 1 & 0x3;
                            int var30 = (var27 / 8 << 8) + (var28 / 8);
                            for (int var31 = 0; var31 < class84.field2148.length; var31++) {
                                if (class84.field2148[var31] == var30 && class75.field1913[var31] != null) {
                                    class33.method326(22158, (var27 & 0x7) * 8, var26, class89.field2283, class67.field1678, (var28 & 0x7) * 8, var22, var23 * 8, var24 * 8, class75.field1913[var31], var29);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class53.method499((byte) -107, true);
        class128.method956(0);
        class125.method942(class89.field2283, (byte) -84, class67.field1678);
        class53.method499((byte) -102, true);
        int var44 = class94.field2405;
        if (var44 > class79.field1993) {
            var44 = class79.field1993;
        }
        if (var44 < class79.field1993 - 1) {
            int var45 = class79.field1993 - 1;
        }
        if (class81.field2085) {
            class89.field2283.method272(class94.field2405);
        } else {
            class89.field2283.method272(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class36.method341(-110, var53, var46);
            }
        }
        class78.method646(true);
        class13.field243.method335((byte) -28);
        if (class49.field1209 != null) {
            class92.field2333.method702(true, 35);
            class129.field3093++;
            class92.field2333.method975(1057001181, false);
        }
        if (!class75.field1901) {
            int var47 = (class16.field311 + 6) / 8;
            int var48 = (class128.field3067 - 6) / 8;
            int var49 = (class128.field3067 + 6) / 8;
            int var50 = (class16.field311 - 6) / 8;
            for (int var51 = var50 - 1; var51 <= var47 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var49 + 1; var52++) {
                    if (var50 > var51 || var51 > var47 || var48 > var52 || var52 > var49) {
                        class79.field1983.method889(method903(new class44[] { class5.field125, class116.method893(10, var51), class102.field2584, class116.method893(10, var52) }, false), -1);
                        class79.field1983.method889(method903(new class44[] { class97.field2462, class116.method893(10, var51), class102.field2584, class116.method893(10, var52) }, false), -1);
                    }
                }
            }
        }
        if (class64.field1632 == -1) {
            class131.method1009(30, -59);
        } else {
            class131.method1009(35, -108);
        }
        class23.method163((byte) -112);
        class92.field2333.method702(true, 159);
        class129.method959((byte) -89);
    }
}
