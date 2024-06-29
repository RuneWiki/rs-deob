import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class117 extends class254 {

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Z")
    public boolean field2076 = false;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Lrh;")
    private class46 field2062;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Z")
    private boolean field2082;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "Z")
    private boolean field2071;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Llj;")
    public static class25 field2064 = new class25(16);

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
    public static int field2092 = 50;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "[I")
    public static int[] field2085 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "[I")
    public static int[] field2079 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "[I")
    public static int[] field2083 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "[Lcf;")
    public static class93[] field2086 = new class93[field2092];

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "[I")
    public static int[] field2091 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "[I")
    public static int[] field2074 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "[I")
    public static int[] field2069 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "[I")
    public static int[] field2088 = new int[field2092];

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "F")
    public static float field2078;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "F")
    private float field2080;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
    private int[] field2063;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
    public final void method862(int arg0, int arg1) {
        field2066++;
        if (arg0 != 27620 || this.field2063 == null || this.field2070 == 0 && this.field2089 == 0) {
            return;
        }
        if (class254.field4601 == null || this.field2063.length > class254.field4601.length) {
            class254.field4601 = new int[this.field2063.length];
        }
        int var3 = this.field2063.length;
        int var4 = this.field2089 * arg1;
        int var5 = this.field2063.length == 4096 ? 64 : 128;
        int var6 = var5 - 1;
        int var7 = var3 - 1;
        int var8 = this.field2070 * var5 * arg1;
        for (int var9 = 0; var9 < var3; var9 += var5) {
            int var11 = var7 & var8 + var9;
            for (int var12 = 0; var12 < var5; var12++) {
                int var13 = var9 + var12;
                int var14 = var11 + (var4 + var12 & var6);
                class254.field4601[var13] = this.field2063[var14];
            }
        }
        int[] var10 = this.field2063;
        this.field2063 = class254.field4601;
        class254.field4601 = var10;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLhg;Lt;)Z")
    public final boolean method863(byte arg0, class177 arg1, class197 arg2) {
        field2081++;
        int var4 = -120 / ((arg0 + 50) / 63);
        return this.field2062.method258(arg2, arg1, (byte) 117);
    }

    @OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field2072++;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method864(int arg0) {
        field2086 = null;
        if (arg0 != 0) {
            method866((String) null, 63);
        }
        field2079 = null;
        field2074 = null;
        field2083 = null;
        field2069 = null;
        field2064 = null;
        field2088 = null;
        field2085 = null;
        field2091 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILee;)V")
    public static final void method865(int arg0, class280 arg1) {
        int var2 = -19 % ((arg0 - 61) / 33);
        while (true) {
            while (arg1.field5027 < arg1.field5011.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method1907(16832) == 1) {
                    var3 = true;
                    var5 = arg1.method1907(16832);
                    var4 = arg1.method1907(16832);
                }
                int var6 = arg1.method1907(16832);
                int var7 = arg1.method1907(16832);
                int var8 = class76.field1404 + class183.field3373 - (var7 * 64) - 1;
                int var9 = var6 * 64 - class251.field4518;
                if (var9 >= 0 && var8 - 63 >= 0 && class148.field2599 > (var9 + 63) && var8 < class183.field3373) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= var5 * 8 && var5 * 8 + 8 > var12 && var4 * 8 <= var13 && var13 < (var4 * 8 + 8)) {
                                byte var14 = arg1.method1925(true);
                                if (var14 != 0) {
                                    if (class212.field3896[var10][var11] == null) {
                                        class212.field3896[var10][var11] = new byte[4096];
                                    }
                                    class212.field3896[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method1925(true);
                                    if (class74.field1351[var10][var11] == null) {
                                        class74.field1351[var10][var11] = new byte[4096];
                                    }
                                    class74.field1351[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method1925(true);
                        if (var17 != 0) {
                            arg1.field5027++;
                        }
                    }
                }
            }
            field2067++;
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;I)Lcf;")
    public static final class93 method866(String arg0, int arg1) {
        if (arg1 != 4907) {
            return null;
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        field2084++;
        class93 var3 = new class93();
        var3.field1683 = var2;
        var3.field1629 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1629++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILt;ZLhg;)[I")
    public final int[] method867(int arg0, class197 arg1, boolean arg2, class177 arg3) {
        field2061++;
        if (arg0 <= 72) {
            this.field2076 = false;
        }
        if (this.field2062.method258(arg1, arg3, (byte) 117)) {
            int var5 = arg2 ? 64 : 128;
            return this.field2062.method259(arg1, true, arg3, 1.0D, var5, var5, this.field2071, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLt;ZFLhg;)[I")
    public final int[] method868(boolean arg0, class197 arg1, boolean arg2, float arg3, class177 arg4) {
        if (!arg2) {
            return null;
        }
        field2077++;
        if (this.field2063 == null || this.field2080 != arg3) {
            if (!this.field2062.method258(arg1, arg4, (byte) 117)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field2063 = this.field2062.method259(arg1, arg2, arg4, (double) arg3, var6, var6, this.field2071, true);
            this.field2080 = arg3;
            if (this.field2082) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var12; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field2063[var14];
                        var7[var34] += class58.method333(255, var35 >> 16);
                        var8[var34] += class58.method333(255, var35 >> 8);
                        var10[var34] += class58.method333(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var25 += var7[var21];
                        var23 += var8[var21];
                        var24 += var10[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var12; var27 >= 0; var27--) {
                        int var31 = var25 / 9;
                        var21--;
                        var22--;
                        int var32 = var24 / 9;
                        int var33 = var23 / 9;
                        var19--;
                        var9[var19] = class270.method1797(class270.method1797(var31 << 16, var33 << 8), var32);
                        var25 += var7[var21] - var7[var22];
                        var23 += var8[var21] - var8[var22];
                        var24 += var10[var21] - var10[var22];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var22 == 0) {
                            var22 = var11;
                        }
                    }
                    for (int var28 = var12; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field2063[var15];
                        var14--;
                        int var30 = this.field2063[var14];
                        var7[var28] += class58.method333(255, var30 >> 16) - class58.method333(var29 >> 16, 255);
                        var8[var28] += -class58.method333(var29 >> 8, 255) + class58.method333(255, var30 >> 8);
                        var10[var28] += -class58.method333(var29, 255) + class58.method333(255, var30);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                this.field2063 = var9;
            }
        }
        return this.field2063;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static final void method869(int arg0) {
        field2073++;
        if (!class263.field4695) {
            return;
        }
        class181 var1 = class5.method21(class16.field229, class255.field4611, (byte) 40);
        if (var1 != null && var1.field3186 != null) {
            class223 var2 = new class223();
            var2.field4015 = var1.field3186;
            var2.field4017 = var1;
            class106.method763(var2, (byte) 118);
        }
        class273.field4859 = -1;
        class263.field4695 = false;
        if (arg0 == 64) {
            class254.method1731(var1, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)I")
    public static final int method870(int arg0, int arg1, int arg2) {
        field2068++;
        int var3 = class121.method897(arg2 + 21012, 4, arg0 + 45365, arg1 - -91923) + ((class121.method897(110, 2, arg0 - -10294, arg1 - -37821) + -128 >> 1) - -(class121.method897(arg2 ^ -20953, 1, arg0, arg1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg2 != -20925) {
            field2064 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(II)V")
    public static final void method871(int arg0, int arg1) {
        int var2 = 115 / ((-arg1 - 30) / 56);
        field2075++;
        if (class120.field2138 == 0) {
            class234.field4175.method839(arg0, -21204);
        } else {
            class16.field227 = arg0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2087++;
        int var6 = (arg1 - 32) * arg1 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        class87.field1567[0].method1235(arg4, arg2);
        if (arg5 != -560742846) {
            return;
        }
        class87.field1567[1].method1235(arg4, arg1 + arg2 - 16);
        int var7 = (arg1 - var6 - 32) * arg3 / (arg0 - arg1);
        class75.method517(arg4, arg2 + 16, 16, arg1 - 32, class166.field2934);
        class75.method517(arg4, arg2 + var7 + 16, 16, var6, class7.field90);
        class75.method508(arg4, var7 + arg2 + 16, var6, class3.field35);
        class75.method508(arg4 + 1, arg2 + 16 + var7, var6, class3.field35);
        class75.method505(arg4, arg2 + var7 + 16, 16, class3.field35);
        class75.method505(arg4, arg2 + var7 + 17, 16, class3.field35);
        class75.method508(arg4 + 15, arg2 + var7 - -16, var6, class196.field3587);
        class75.method508(arg4 + 14, arg2 - -17 + var7, var6 - 1, class196.field3587);
        class75.method505(arg4, arg2 + var6 + var7 + 15, 16, class196.field3587);
        class75.method505(arg4 + 1, var6 + var7 + arg2 + 14, 15, class196.field3587);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lee;)V")
    public class117(class280 arg0) {
        this.field2062 = new class46(arg0);
        this.field2082 = arg0.method1907(16832) == 1;
        this.field2071 = arg0.method1907(16832) == 1;
        arg0.method1907(16832);
        arg0.method1907(16832);
        int var2 = arg0.method1907(16832) & 0x3;
        this.field2089 = arg0.method1925(true);
        this.field2070 = arg0.method1925(true);
        arg0.method1907(16832);
        arg0.method1907(16832);
    }
}
