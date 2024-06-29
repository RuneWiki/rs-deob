import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class303 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[I")
    public int[] field4808 = new int[6];

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public int field4818 = 0;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[Z")
    public boolean[] field4813 = new boolean[16];

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[[I")
    public int[][] field4821 = new int[6][258];

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[B")
    public byte[] field4825 = new byte[256];

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[I")
    public int[] field4826 = new int[256];

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[I")
    public int[] field4814 = new int[16];

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[[I")
    public int[][] field4817 = new int[6][258];

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "[B")
    public byte[] field4830 = new byte[18002];

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[I")
    public int[] field4823 = new int[257];

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[B")
    public byte[] field4833 = new byte[18002];

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "[[B")
    public byte[][] field4844 = new byte[6][258];

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[B")
    public byte[] field4829 = new byte[4096];

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public int field4838 = 0;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "[Z")
    public boolean[] field4845 = new boolean[256];

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "[[I")
    public int[][] field4840 = new int[6][258];

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4812 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
    public static int[] field4807 = new int[32];

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Llh;")
    public static class58 field4846 = new class58();

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "B")
    public byte field4809;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public int field4827;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public int field4837;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public int field4839;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "[B")
    public byte[] field4841;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "[B")
    public byte[] field4843;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CLjava/lang/StringBuffer;II)Ljava/lang/StringBuffer;")
    public static final StringBuffer method2021(char arg0, StringBuffer arg1, int arg2, int arg3) {
        field4842++;
        int var4 = arg1.length();
        arg1.setLength(arg2);
        if (arg3 > -61) {
            return null;
        } else {
            for (int var5 = var4; var5 < arg2; var5++) {
                arg1.setCharAt(var5, arg0);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public static final void method2022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class266.method1747(arg4, arg1, arg0 + arg4, arg1 - -arg2);
        class266.method1730(arg4, arg1, arg0, arg2, 0);
        field4828++;
        if (class302.field4800 < 100) {
            return;
        }
        int var5 = -16 / ((48 - arg3) / 35);
        float var6 = (float) class97.field1406 / (float) class97.field1405;
        int var7 = arg0;
        int var8 = arg2;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg4;
        int var10 = (arg2 - var8) / 2 + arg1;
        if (class43.field637 == null || class43.field637.field1540 != arg0 || class43.field637.field1543 != arg2) {
            class203 var11 = new class203(arg0, arg2);
            class266.method1746(var11.field3058, arg0, arg2);
            if (class97.field1404.field4797 != -1) {
                class266.method1730(0, 0, arg0, arg2, class97.field1404.field4797);
            }
            class97.method624(0, 0, class97.field1405, class97.field1406, 0, 0, var7, var8);
            class97.method632();
            class43.field637 = var11;
            class24.field382.method1586((byte) 113);
        }
        class43.field637.method682(var9, var10);
        int var12 = class301.field4777 * var7 / class97.field1405 + var9;
        int var13 = class105.field1507 * var7 / class97.field1405;
        int var14 = class14.field253 * var8 / class97.field1406 + var10;
        int var15 = 16711680;
        if (class188.field2856 == 1) {
            var15 = 16777215;
        }
        int var16 = class107.field1532 * var8 / class97.field1406;
        class266.method1748(var12, var14, var13, var16, var15, 128);
        class266.method1743(var12, var14, var13, var16, var15);
        if (class307.field4931 <= 0) {
            return;
        }
        int var17;
        if (class34.field520 > 50) {
            var17 = 500 - (class34.field520 * 5);
        } else {
            var17 = class34.field520 * 5;
        }
        for (class238 var18 = (class238) class97.field1398.method1059((byte) -106); var18 != null; var18 = (class238) class97.field1398.method1064((byte) -75)) {
            class149 var19 = class121.method784(-59, var18.field3688);
            if (class218.method1427(-1, var19)) {
                if (class14.field227 == var18.field3688) {
                    int var20 = var18.field3689 * var7 / class97.field1405 + var9;
                    int var21 = var18.field3691 * var8 / class97.field1406 + var10;
                    class266.method1748(var20 - 2, var21 + -2, 4, 4, 16776960, var17);
                } else if (class109.field1554 != -1 && class109.field1554 == var19.field2059) {
                    int var22 = var18.field3689 * var7 / class97.field1405 + var9;
                    int var23 = var18.field3691 * var8 / class97.field1406 + var10;
                    class266.method1748(var22 - 2, var23 + -2, 4, 4, 16776960, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method2023(int arg0) {
        if (arg0 < 69) {
            method2025(63);
        }
        field4846 = null;
        field4807 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V")
    public static final void method2024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4822++;
        for (int var6 = arg5; var6 <= (arg1 + arg5); var6++) {
            for (int var11 = arg3; var11 <= (arg3 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class184.field2796[arg2][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg5; var7 < arg1 + arg5; var7++) {
            for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class185.field2812[arg2][var10][var7] = arg2 > 0 ? class185.field2812[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg5 + 1; var8 < arg5 + arg1; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class185.field2812[arg2][arg3][var8] = class185.field2812[arg2][arg3 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class185.field2812[arg2][var9][arg5] = class185.field2812[arg2][var9][arg5 - 1];
                }
            }
        }
        if (arg0 != 104 || arg3 < 0 || arg5 < 0 || arg3 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 > 0 && class185.field2812[arg2][arg3 - 1][arg5] != 0) {
                class185.field2812[arg2][arg3][arg5] = class185.field2812[arg2][arg3 - 1][arg5];
                return;
            }
            if (arg5 > 0 && class185.field2812[arg2][arg3][arg5 - 1] != 0) {
                class185.field2812[arg2][arg3][arg5] = class185.field2812[arg2][arg3][arg5 - 1];
                return;
            }
            if (arg3 > 0 && arg5 > 0 && class185.field2812[arg2][arg3 - 1][arg5 - 1] != 0) {
                class185.field2812[arg2][arg3][arg5] = class185.field2812[arg2][arg3 - 1][arg5 - 1];
                return;
            }
        } else if (arg3 <= 0 || class185.field2812[arg2 - 1][arg3 - 1][arg5] == class185.field2812[arg2][arg3 - 1][arg5]) {
            if (arg5 > 0 && class185.field2812[arg2 - 1][arg3][arg5 - 1] != class185.field2812[arg2][arg3][arg5 - 1]) {
                class185.field2812[arg2][arg3][arg5] = class185.field2812[arg2][arg3][arg5 - 1];
                return;
            }
            if (arg3 > 0 && arg5 > 0 && class185.field2812[arg2][arg3 - 1][arg5 - 1] != class185.field2812[arg2 - 1][arg3 - 1][arg5 - 1]) {
                class185.field2812[arg2][arg3][arg5] = class185.field2812[arg2][arg3 - 1][arg5 - 1];
                return;
            }
            return;
        } else {
            class185.field2812[arg2][arg3][arg5] = class185.field2812[arg2][arg3 - 1][arg5];
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Lfa;")
    public static final class238 method2025(int arg0) {
        field4834++;
        if (class97.field1398 == null) {
            return null;
        }
        if (arg0 != 0) {
            field4807 = null;
        }
        class246.field3865.method310(class97.field1398, (byte) -127);
        class238 var1 = (class238) class246.field3865.method313(-107);
        class149 var2 = class121.method784(-58, var1.field3688);
        return var2 != null && var2.field2049 && var2.method937(-79) ? var1 : class260.method1696(arg0 ^ 0x614E);
    }
}
