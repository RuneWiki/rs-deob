import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class88 extends class90 {

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "[S")
    public short[] field1923;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "[B")
    public byte[] field1913;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "[B")
    public byte[] field1916;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[Lqe;")
    public class153[] field1905;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "[B")
    public byte[] field1925;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[Llc;")
    public class107[] field1915;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
    private int[] field1907;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lrf;")
    private static class163 field1904 = class53.method392(73, "Please use a different world)3");

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Lrf;")
    private static class163 field1911 = class53.method392(-85, "red:");

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Lrf;")
    public static class163 field1914 = class53.method392(56, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field1908 = -1;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Lrf;")
    public static class163 field1912 = field1904;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Lrf;")
    public static class163 field1918 = field1911;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lig;")
    public static class84 field1924 = null;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "Lrf;")
    public static class163 field1920 = field1911;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Lrf;")
    public static class163 field1910 = field1904;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[J")
    public static long[] field1927 = new long[32];

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public final void method612(int arg0) {
        if (arg0 != 2) {
            this.method617(null, null, 20, null);
        }
        this.field1907 = null;
        field1922++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class31.field620[arg0][var8][var14] == -class63.field1329) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class99.field2086[arg0][arg1][arg3] + arg5;
            if (!class3.method30(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class3.method30(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class3.method30(var9, var11, var13)) {
                return false;
            } else if (class3.method30(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class158.method1002(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class3.method30(var6 + 1, class99.field2086[arg0][arg1][arg3] + arg5, var7 + 1) && class3.method30(var6 + 128 - 1, class99.field2086[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class3.method30(var6 + 128 - 1, class99.field2086[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class3.method30(var6 + 1, class99.field2086[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1904 = null;
        field1920 = null;
        field1910 = null;
        field1927 = null;
        field1924 = null;
        if (arg0 != -28062) {
            method614(-50);
        }
        field1918 = null;
        field1914 = null;
        field1911 = null;
        field1912 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lrf;ILig;)Lrf;")
    public static final class163 method615(class163 arg0, int arg1, class84 arg2) {
        if (arg1 != -9254) {
            return null;
        }
        if (arg0.method1035(true, class184.field3651) != -1) {
            label62: while (true) {
                int var3 = arg0.method1035(true, class86.field1881);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method1035(true, class112.field2375);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method1035(true, class93.field2021);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method1035(true, class34.field665);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method1035(true, class195.field3839);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method1035(true, class22.field387);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class163 var9 = class36.field728;
                                                        if (class127.field2611 != null) {
                                                            var9 = class130.method857(class127.field2611.field856, -12727);
                                                            try {
                                                                if (class127.field2611.field854 != null) {
                                                                    byte[] var10 = ((String) class127.field2611.field854).getBytes("ISO-8859-1");
                                                                    var9 = class155.method992(0, var10.length, var10, -2766);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class180.method1216(new class163[] { arg0.method1036(var8, (byte) 107, 0), var9, arg0.method1039(var8 + 4, arg1 + 9194) }, false);
                                                    }
                                                }
                                                arg0 = class180.method1216(new class163[] { arg0.method1036(var7, (byte) 106, 0), class11.method90(68, class162.method1017(arg2, 113, 4)), arg0.method1039(var7 + 2, 109) }, false);
                                            }
                                        }
                                        arg0 = class180.method1216(new class163[] { arg0.method1036(var6, (byte) 109, 0), class11.method90(74, class162.method1017(arg2, 127, 3)), arg0.method1039(var6 + 2, 93) }, false);
                                    }
                                }
                                arg0 = class180.method1216(new class163[] { arg0.method1036(var5, (byte) 112, 0), class11.method90(67, class162.method1017(arg2, 114, 2)), arg0.method1039(var5 + 2, 91) }, false);
                            }
                        }
                        arg0 = class180.method1216(new class163[] { arg0.method1036(var4, (byte) 92, 0), class11.method90(20, class162.method1017(arg2, 117, 1)), arg0.method1039(var4 + 2, -94) }, false);
                    }
                }
                arg0 = class180.method1216(new class163[] { arg0.method1036(var3, (byte) 105, 0), class11.method90(30, class162.method1017(arg2, 121, 0)), arg0.method1039(var3 + 2, 93) }, false);
            }
        }
        field1909++;
        return arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
    public static final void method616(byte arg0, int arg1, int arg2) {
        class5 var3 = class69.field1434[class60.field1227][arg2][arg1];
        field1906++;
        if (var3 == null) {
            class60.method433(class60.field1227, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class148 var5 = null;
        for (class148 var6 = (class148) var3.method46(72); var6 != null; var6 = (class148) var3.method53(arg0 + 7759461)) {
            class4 var12 = class97.method669(-101, var6.field3057);
            int var13 = var12.field95;
            if (var12.field87 == 1) {
                var13 = (var6.field3054 + 1) * var13;
            }
            if (var13 > var4) {
                var4 = var13;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class60.method433(class60.field1227, arg2, arg1);
            return;
        }
        var3.method52(var5, arg0 + 17);
        class148 var7 = null;
        if (arg0 != -17) {
            field1908 = 36;
        }
        class148 var8 = null;
        for (class148 var9 = (class148) var3.method46(-124); var9 != null; var9 = (class148) var3.method53(7759444)) {
            if (var5.field3057 != var9.field3057) {
                if (var7 == null) {
                    var7 = var9;
                }
                if (var7.field3057 != var9.field3057 && var8 == null) {
                    var8 = var9;
                }
            }
        }
        long var10 = (long) (arg2 + (arg1 << 7) + 1610612736);
        class22.method135(class60.field1227, arg2, arg1, class175.method1186(arg2 * 128 + 64, class60.field1227, arg1 * 128 + 64, 1), var5, var10, var7, var8);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class88() {
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([ILag;I[B)Z")
    public final boolean method617(int[] arg0, class8 arg1, int arg2, byte[] arg3) {
        field1926++;
        boolean var5 = true;
        if (arg2 != 24785) {
            field1924 = null;
        }
        int var6 = 0;
        class153 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1907[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method67(arg2 - 24785, var9 >> 2, arg0);
                        } else {
                            var7 = arg1.method68((byte) 71, arg0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1905[var8] = var7;
                        this.field1907[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)I")
    public static final int method618(byte arg0, int arg1) {
        field1917++;
        int var2 = -96 / ((arg0 - 58) / 32);
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public static final void method619(int arg0) {
        class184.field3687 = true;
        field1919++;
        if (arg0 == 400788110) {
            class86.field1880 = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([B)V")
    public class88(byte[] arg0) {
        this.field1923 = new short[128];
        this.field1913 = new byte[128];
        this.field1916 = new byte[128];
        this.field1905 = new class153[128];
        this.field1925 = new byte[128];
        this.field1915 = new class107[128];
        this.field1907 = new int[128];
        class52 var2 = new class52(arg0);
        int var3;
        for (var3 = 0; var2.field1054[var2.field1033 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method353(-107);
        }
        var2.field1033++;
        var3++;
        int var6 = var2.field1033;
        var2.field1033 += var3;
        int var7;
        for (var7 = 0; var2.field1054[var2.field1033 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method353(-89);
        }
        var2.field1033++;
        var7++;
        int var10 = var2.field1033;
        int var11 = 0;
        var2.field1033 += var7;
        while (var2.field1054[var2.field1033 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method353(-113);
        }
        var2.field1033++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method344(255);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class107[] var18 = new class107[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class107 var102 = var18[var19] = new class107();
            int var103 = var2.method344(255);
            if (var103 > 0) {
                var102.field2230 = new byte[var103 * 2];
            }
            int var104 = var2.method344(255);
            if (var104 > 0) {
                var102.field2210 = new byte[var104 * 2 + 2];
                var102.field2210[1] = 64;
            }
        }
        int var20 = var2.method344(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method344(255);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field1054[var2.field1033 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method353(66);
        }
        int var27 = 0;
        var2.field1033++;
        var24++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method344(255);
            this.field1923[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method344(255);
            this.field1923[var30] = (short) (this.field1923[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 < var25.length) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var2.method360(true);
            }
            var31--;
            this.field1923[var34] = (short) (this.field1923[var34] + (class133.method887(var32 - 1, 2) << 14));
            this.field1907[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1907[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field1054[var6++] - 1;
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                var35--;
                this.field1925[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1907[var42] != 0) {
                if (var41 == 0) {
                    var40 = var2.field1054[var10++] + 16 << 2;
                    if (var8.length > var39) {
                        var41 = var8[var39++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field1916[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class107 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1907[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field1915[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var49) {
                    var47 = var25[var49++];
                } else {
                    var47 = -1;
                }
                if (this.field1907[var50] > 0) {
                    var48 = var2.method344(255) + 1;
                }
            }
            var47--;
            this.field1913[var50] = (byte) var48;
        }
        this.field1921 = var2.method344(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class107 var99 = var18[var51];
            if (var99.field2230 != null) {
                for (int var100 = 1; var100 < var99.field2230.length; var100 += 2) {
                    var99.field2230[var100] = var2.method353(-105);
                }
            }
            if (var99.field2210 != null) {
                for (int var101 = 3; var101 < var99.field2210.length - 2; var101 += 2) {
                    var99.field2210[var101] = var2.method353(-96);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method353(62);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method353(-114);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class107 var96 = var18[var54];
            if (var96.field2210 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2210.length; var98 += 2) {
                    var97 = var2.method344(255) + var97 + 1;
                    var96.field2210[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class107 var93 = var18[var55];
            if (var93.field2230 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2230.length; var95 += 2) {
                    var94 = var94 + var2.method344(255) + 1;
                    var93.field2230[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method344(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method344(255) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field1913[var60] = (byte) (this.field1913[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var59) * var58 + (var64 - var59) / 2;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class194.method1296(false, var66, var64 - var59);
                    var66 += var65 - var58;
                    this.field1913[var67] = (byte) (this.field1913[var67] * var68 + 32 >> 6);
                }
                var58 = var65;
                var61 += 2;
                var59 = var64;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field1913[var63] = (byte) (this.field1913[var63] * var58 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method344(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method344(255) + 1;
                var23[var70] = (byte) var69;
            }
            int var71 = var23[1] << 1;
            byte var72 = var23[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field1916[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1916[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = (var78 - var72) * var71 + (var78 - var72) / 2;
                int var80 = var23[var74 + 1] << 1;
                for (int var81 = var72; var81 < var78; var81++) {
                    int var82 = class194.method1296(false, var79, var78 - var72);
                    int var83 = (this.field1916[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1916[var81] = (byte) var83;
                    var79 += var80 - var71;
                }
                var74 += 2;
                var72 = var78;
                var71 = var80;
            }
            Object var75 = null;
            for (int var76 = var72; var76 < 128; var76++) {
                int var77 = (this.field1916[var76] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1916[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2217 = var2.method344(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class107 var92 = var18[var86];
            if (var92.field2230 != null) {
                var92.field2226 = var2.method344(255);
            }
            if (var92.field2210 != null) {
                var92.field2213 = var2.method344(255);
            }
            if (var92.field2217 > 0) {
                var92.field2220 = var2.method344(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2212 = var2.method344(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class107 var91 = var18[var88];
            if (var91.field2212 > 0) {
                var91.field2211 = var2.method344(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class107 var90 = var18[var89];
            if (var90.field2211 > 0) {
                var90.field2224 = var2.method344(255);
            }
        }
    }
}
