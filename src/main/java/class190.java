import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class190 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lnj;")
    public static class144 field3062 = new class144(512);

    @OriginalMember(owner = "client!da", name = "i", descriptor = "F")
    public static float field3068 = 0.0F;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[Z")
    public static boolean[] field3070 = new boolean[100];

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
    public static int[] field3069 = new int[14];

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3071 = "yellow:";

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[I")
    public static int[] field3072 = new int[14];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lqi;I)V")
    public static final void method1414(int arg0, class131[] arg1, int arg2) {
        field3064++;
        if (arg2 != 100) {
            method1417(-27);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class131 var4 = arg1[var3];
            if (var4 != null && var4.field2054 == arg0 && (!var4.field2077 || !client.method1172(var4))) {
                if (var4.field2150 == 0) {
                    if (!var4.field2077 && client.method1172(var4) && class260.field4250 != var4) {
                        continue;
                    }
                    method1414(var4.field2073, arg1, 100);
                    if (var4.field2052 != null) {
                        method1414(var4.field2073, var4.field2052, 100);
                    }
                    class17 var5 = (class17) class124.field1806.method1034((long) var4.field2073, (byte) 21);
                    if (var5 != null) {
                        class75.method547(arg2 ^ 0xFFFFFF9B, var5.field191);
                    }
                }
                if (var4.field2150 == 6) {
                    if (var4.field2171 != -1 || var4.field2023 != -1) {
                        boolean var6 = class144.method1038(19490, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2023;
                        } else {
                            var7 = var4.field2171;
                        }
                        if (var7 != -1) {
                            class141 var8 = class285.method1939(var7, arg2 + 12);
                            if (var8 != null) {
                                var4.field1994 += class161.field2628;
                                while (var8.field2263[var4.field2079] < var4.field1994) {
                                    var4.field1994 -= var8.field2263[var4.field2079];
                                    var4.field2079++;
                                    if (var4.field2079 >= var8.field2252.length) {
                                        var4.field2079 -= var8.field2269;
                                        if (var4.field2079 < 0 || var4.field2079 >= var8.field2252.length) {
                                            var4.field2079 = 0;
                                        }
                                    }
                                    var4.field2097 = var4.field2079 + 1;
                                    if (var8.field2252.length <= var4.field2097) {
                                        var4.field2097 -= var8.field2269;
                                        if (var4.field2097 < 0 || var4.field2097 >= var8.field2252.length) {
                                            var4.field2097 = -1;
                                        }
                                    }
                                    class274.method1896(var4, 10);
                                }
                            }
                        }
                    }
                    if (var4.field2142 != 0 && !var4.field2077) {
                        int var9 = var4.field2142 >> 16;
                        int var10 = class161.field2628 * var9;
                        int var11 = var4.field2142 << 16 >> 16;
                        int var12 = class161.field2628 * var11;
                        var4.field2149 = var4.field2149 + var12 & 0x7FF;
                        var4.field2145 = var4.field2145 + var10 & 0x7FF;
                        class274.method1896(var4, 10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method1415(int arg0) {
        field3065++;
        if (class73.field1051) {
            return;
        }
        if (arg0 > -103) {
            field3062 = null;
        }
        class73.field1051 = true;
        if (class113.field1640) {
            field3068 = (float) ((int) field3068 + 191 & 0xFFFFFF80);
        } else {
            class44.field642 += (24.0F - class44.field642) / 2.0F;
        }
        class211.field3380 = true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    public static final void method1416(byte arg0, int arg1) {
        class220.field3530 = new int[arg1];
        class174.field2832 = new int[arg1];
        if (arg0 >= 111) {
            class241.field3848 = new int[arg1];
            class3.field32 = new int[arg1];
            class159.field2604 = new int[arg1];
            field3063++;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static final void method1417(int arg0) {
        if (arg0 > -68) {
            return;
        }
        field3061++;
        if (!class77.method566((byte) -83) && class58.field826 != class11.field134) {
            class189.method1409(class186.field2993.field1917[0], false, false, class44.field647, class245.field4024, class58.field826, (byte) -25, class186.field2993.field1974[0]);
        } else if (class58.field826 != class133.field2193 && class160.method1196((byte) 37, class58.field826)) {
            class133.field2193 = class58.field826;
            class131.method943(96);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static final void method1418(int arg0) {
        if (arg0 != 31616) {
            method1420((class4) null, 68);
        }
        field3060++;
        class18.field195.method1558(arg0 - 31640);
        class150.field2441.method1558(-126);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method1419(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field3072 = null;
        field3062 = null;
        field3069 = null;
        field3070 = null;
        field3071 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lvd;I)V")
    public static final void method1420(class4 arg0, int arg1) {
        for (int var2 = 0; var2 < class254.field4198.length; var2++) {
            class254.field4198[var2] = 0;
        }
        short var3 = 256;
        if (arg1 != -16) {
            method1418(-84);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class254.field4198[var16] = (int) (Math.random() * 284.0D);
        }
        field3066++;
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class253.field4186[var15] = (class254.field4198[var15 - 1] + class254.field4198[var15 + 1] - (-class254.field4198[var15 - 128] - class254.field4198[var15 + 128])) / 4;
                }
            }
            int[] var13 = class254.field4198;
            class254.field4198 = class253.field4186;
            class253.field4186 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1655; var7++) {
            for (int var8 = 0; var8 < arg0.field1656; var8++) {
                if (arg0.field35[var6++] != 0) {
                    int var9 = var8 + arg0.field1660 + 16;
                    int var10 = var7 - (-arg0.field1662 - 16);
                    int var11 = var9 + (var10 << 7);
                    class254.field4198[var11] = 0;
                }
            }
        }
    }
}
