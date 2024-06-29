import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class129 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[[Z")
    public static boolean[][] field2063 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2067 = null;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public static int[] field2070 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2066 = new String[200];

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
    public static boolean field2069;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V", line = 7)
    public static final void method1002(boolean arg0, byte arg1) {
        field2064++;
        int[] var2 = null;
        byte[][] var3;
        byte var4;
        if (class162.field2623 && arg0) {
            var3 = class126.field2020;
            var4 = 1;
        } else {
            var4 = 4;
            var3 = class14.field307;
        }
        if (arg1 > -118) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class178.method1310(16);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class174.field2795[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFD) >> 3;
                            int var14 = (var12 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class338.field5218.length; var15++) {
                                if (class338.field5218[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class3.method80(var5, var12, var6 * 8, var7 * 8, arg0, var13, var10, var3[var15], var11, -4915, class166.field2686);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class303.method2155(var6 * 8, var5, 80, 8, 8, var7 * 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class221.field3452 = -1;
            return;
        }
        class145.field2351 = var2[2];
        class318.field4990 = var2[1];
        class171.field2749 = var2[4];
        class221.field3452 = var2[0];
        class334.field5200 = var2[3];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 122)
    public static final void method1003(int arg0, String arg1, String arg2, int arg3) {
        field2065++;
        class115.method901(arg0, 108, -1, arg2, arg1, (String) null);
        int var4 = 71 / ((arg3 + 15) / 60);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 143)
    public static void method1004(int arg0) {
        field2066 = null;
        if (arg0 >= -46) {
            method1003(-9, (String) null, (String) null, -26);
        }
        field2063 = (boolean[][]) null;
        field2070 = null;
        field2067 = null;
    }
}
