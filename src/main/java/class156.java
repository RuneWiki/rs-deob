import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class156 extends class26 {

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "[I")
    public static int[] field2159 = new int[500];

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "[S")
    public static short[] field2169 = new short[500];

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lfh;")
    public static class140 field2160;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I", line = 9)
    public static final int method1195(int arg0, byte arg1) {
        field2166++;
        if (arg0 < 0) {
            return 0;
        }
        class223 var2 = (class223) class240.field3489.method2279((long) arg0, arg1 ^ 0xFFFFFFD9);
        if (arg1 != -38) {
            method1198(-64);
        }
        if (var2 == null) {
            return class159.method1219(arg0, 10057).field2048;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3216.length; var4++) {
            if (var2.field3216[var4] == -1) {
                var3++;
            }
        }
        return var3 + class159.method1219(arg0, 10057).field2048 - var2.field3216.length;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V", line = 43)
    public static final void method1196(boolean arg0, int arg1) {
        if (arg1 != -51) {
            field2160 = (class140) null;
        }
        field2174++;
        class48.field644 = arg0;
        if (!class48.field644) {
            boolean var26 = class348.method2415((byte) 25, class240.field3490.method2072(arg1 ^ 0x5));
            int var27 = class240.field3490.method2083((byte) -90);
            int var28 = (class315.field4648 - class240.field3490.field4351) / 16;
            class356.field5573 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var30 = 0; var30 < 4; var30++) {
                    class356.field5573[var29][var30] = class240.field3490.method2087(true);
                }
            }
            int var31 = class240.field3490.method2056(46);
            int var32 = class240.field3490.method2097((byte) 120);
            int var33 = class240.field3490.method2083((byte) -89);
            boolean var34 = false;
            int var35 = class240.field3490.method2083((byte) -16);
            if (((var35 / 8) == 48 || var35 / 8 == 49) && var27 / 8 == 48) {
                var34 = true;
            }
            class75.field994 = new int[var28];
            if (var35 / 8 == 48 && var27 / 8 == 148) {
                var34 = true;
            }
            class182.field2484 = new int[var28];
            class101.field1316 = new byte[var28][];
            class303.field4442 = new int[var28];
            class294.field4286 = new int[var28];
            class277.field3972 = (byte[][]) null;
            class305.field4461 = new byte[var28][];
            class48.field649 = new byte[var28][];
            class45.field550 = null;
            class264.field3838 = new byte[var28][];
            class305.field4457 = new int[var28];
            int var36 = 0;
            for (int var37 = (var35 - 6) / 8; var37 <= (var35 + 6) / 8; var37++) {
                for (int var38 = (var27 - 6) / 8; var38 <= (var27 + 6) / 8; var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var34 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class305.field4457[var36] = var39;
                        class182.field2484[var36] = -1;
                        class294.field4286[var36] = -1;
                        class75.field994[var36] = -1;
                        class303.field4442[var36] = -1;
                    } else {
                        class305.field4457[var36] = var39;
                        class182.field2484[var36] = class5.field61.method1079(false, "m" + var37 + "_" + var38);
                        class294.field4286[var36] = class5.field61.method1079(false, "l" + var37 + "_" + var38);
                        class75.field994[var36] = class5.field61.method1079(false, "um" + var37 + "_" + var38);
                        class303.field4442[var36] = class5.field61.method1079(false, "ul" + var37 + "_" + var38);
                    }
                    var36++;
                }
            }
            class208.method1534(false, 98, var35, var26, var33, var32, var27, var31);
            return;
        }
        int var2 = class240.field3490.method2055(-66);
        int var3 = class240.field3490.method2097((byte) 120);
        int var4 = class240.field3490.method2102((byte) -95);
        class240.field3490.method1301(-2);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class240.field3490.method1311(1, 7);
                    if (var8 == 1) {
                        class305.field4460[var5][var6][var7] = class240.field3490.method1311(26, 7);
                    } else {
                        class305.field4460[var5][var6][var7] = -1;
                    }
                }
            }
        }
        class240.field3490.method1303(arg1 + 51);
        int var9 = (class315.field4648 - class240.field3490.field4351) / 16;
        class356.field5573 = new int[var9][4];
        for (int var10 = 0; var10 < var9; var10++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class356.field5573[var10][var11] = class240.field3490.method2054(775571361);
            }
        }
        int var12 = class240.field3490.method2083((byte) -122);
        boolean var13 = class348.method2415((byte) 25, class240.field3490.method2072(-103));
        int var14 = class240.field3490.method2090(-128);
        class303.field4442 = new int[var9];
        class277.field3972 = (byte[][]) null;
        class305.field4461 = new byte[var9][];
        class305.field4457 = new int[var9];
        class45.field550 = null;
        class75.field994 = new int[var9];
        class182.field2484 = new int[var9];
        class264.field3838 = new byte[var9][];
        class48.field649 = new byte[var9][];
        class294.field4286 = new int[var9];
        class101.field1316 = new byte[var9][];
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class305.field4460[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = var19 >> 14 & 0x3FF;
                        int var21 = var19 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class305.field4457[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            class305.field4457[var15] = var22;
                            int var24 = var22 >> 8 & 0xFF;
                            int var25 = var22 & 0xFF;
                            class182.field2484[var15] = class5.field61.method1079(false, "m" + var24 + "_" + var25);
                            class294.field4286[var15] = class5.field61.method1079(false, "l" + var24 + "_" + var25);
                            class75.field994[var15] = class5.field61.method1079(false, "um" + var24 + "_" + var25);
                            class303.field4442[var15] = class5.field61.method1079(false, "ul" + var24 + "_" + var25);
                            var15++;
                        }
                    }
                }
            }
        }
        class208.method1534(false, 118, var4, var13, var2, var12, var3, var14);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I", line = 298)
    public static final int method1197(int arg0, int arg1) {
        field2171++;
        int var2 = -113 % ((9 - arg1) / 55);
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 321)
    public static void method1198(int arg0) {
        field2159 = null;
        field2169 = null;
        field2160 = null;
        if (arg0 != 8) {
            field2169 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)V", line = 333)
    public static final void method1199(boolean arg0, int arg1) {
        if (!arg0) {
            method1199(true, 77);
        }
        field2170++;
        class42 var2 = class166.method1242(6, arg1, -1249071392);
        var2.method306((byte) -104);
    }
}
