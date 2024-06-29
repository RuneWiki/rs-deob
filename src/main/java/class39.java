import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class39 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field873 = 3;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lhb;")
    public static class44 field880 = class102.method810("und die Schaltfl-=che (WSpielkonto erstellen(W am", -28606);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field881 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
    public static int[] field884 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lhb;")
    private static class44 field885 = class102.method810("Bad session id)3", -28606);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lhb;")
    public static class44 field874 = field885;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lhc;")
    public static class45 field879;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    public static int[] field875;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
    public static int[] field877;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 3)
    public static void method343(int arg0) {
        field884 = null;
        field875 = null;
        field880 = null;
        field879 = null;
        field874 = null;
        field877 = null;
        if (arg0 == 8691) {
            field885 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)V", line = 30)
    public static final void method344(boolean arg0, int arg1) {
        field883++;
        int var2 = -17 % ((arg1 + 40) / 45);
        class75.field1901 = arg0;
        if (!class75.field1901) {
            int var3 = class53.field1304.method1007((byte) -33);
            int var4 = class53.field1304.method971(true);
            int var5 = (class14.field275 - class53.field1304.field3182) / 16;
            class117.field2860 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class117.field2860[var6][var15] = class53.field1304.method1015(31843);
                }
            }
            int var7 = class53.field1304.method991((byte) -85);
            boolean var8 = false;
            int var9 = class53.field1304.method969(true);
            int var10 = class53.field1304.method1007((byte) -33);
            if ((var10 / 8 == 48 || var10 / 8 == 49) && (var3 / 8) == 48) {
                var8 = true;
            }
            class11.field212 = new int[var5];
            if (var10 / 8 == 48 && var3 / 8 == 148) {
                var8 = true;
            }
            class16.field324 = new int[var5];
            class84.field2140 = new byte[var5][];
            class75.field1913 = new byte[var5][];
            class84.field2148 = new int[var5];
            int var11 = 0;
            for (int var12 = (var10 - 6) / 8; var12 <= (var10 + 6) / 8; var12++) {
                for (int var13 = (var3 - 6) / 8; var13 <= (var3 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (!var8 || var13 != 49 && var13 != 149 && var13 != 147 && var12 != 50 && (var12 != 49 || var13 != 47)) {
                        class84.field2148[var11] = var14;
                        class11.field212[var11] = class79.field1983.method897(-86, class117.method903(new class44[] { class5.field125, class116.method893(10, var12), class102.field2584, class116.method893(10, var13) }, false));
                        class16.field324[var11] = class79.field1983.method897(-40, class117.method903(new class44[] { class97.field2462, class116.method893(10, var12), class102.field2584, class116.method893(10, var13) }, false));
                        var11++;
                    }
                }
            }
            class121.method930(0, var10, var4, var7, var3, var9);
            return;
        }
        int var16 = class53.field1304.method1001(65280);
        class53.field1304.method699(false);
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var36 = 0; var36 < 13; var36++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    int var38 = class53.field1304.method700(1, 101);
                    if (var38 == 1) {
                        client.field382[var17][var36][var37] = class53.field1304.method700(26, -46);
                    } else {
                        client.field382[var17][var36][var37] = -1;
                    }
                }
            }
        }
        class53.field1304.method704(-97);
        int var18 = (class14.field275 - class53.field1304.field3182) / 16;
        class117.field2860 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var35 = 0; var35 < 4; var35++) {
                class117.field2860[var19][var35] = class53.field1304.method973(-4);
            }
        }
        int var20 = class53.field1304.method1001(65280);
        int var21 = class53.field1304.method972((byte) 100);
        int var22 = class53.field1304.method969(true);
        int var23 = class53.field1304.method1007((byte) -33);
        class75.field1913 = new byte[var18][];
        class84.field2140 = new byte[var18][];
        class84.field2148 = new int[var18];
        class11.field212 = new int[var18];
        class16.field324 = new int[var18];
        int var24 = 0;
        for (int var25 = 0; var25 < 4; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    int var28 = client.field382[var25][var26][var27];
                    if (var28 != -1) {
                        int var29 = var28 >> 3 & 0x7FF;
                        int var30 = var28 >> 14 & 0x3FF;
                        int var31 = (var30 / 8 << 8) + var29 / 8;
                        for (int var32 = 0; var32 < var24; var32++) {
                            if (class84.field2148[var32] == var31) {
                                var31 = -1;
                                break;
                            }
                        }
                        if (var31 != -1) {
                            class84.field2148[var24] = var31;
                            int var33 = var31 >> 8 & 0xFF;
                            int var34 = var31 & 0xFF;
                            class11.field212[var24] = class79.field1983.method897(13, class117.method903(new class44[] { class5.field125, class116.method893(10, var33), class102.field2584, class116.method893(10, var34) }, false));
                            class16.field324[var24] = class79.field1983.method897(119, class117.method903(new class44[] { class97.field2462, class116.method893(10, var33), class102.field2584, class116.method893(10, var34) }, false));
                            var24++;
                        }
                    }
                }
            }
        }
        class121.method930(0, var23, var21, var22, var20, var16);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 281)
    public static final void method345(int arg0) {
        class18.field346.method335((byte) -127);
        if (arg0 != 0) {
            field885 = null;
        }
        field876++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lhb;Lwd;B)I", line = 306)
    public static final int method346(class44 arg0, class131 arg1, byte arg2) {
        field878++;
        int var3 = -125 % ((arg2 - 1) / 59);
        int var4 = arg1.field3182;
        arg1.method985((byte) 39, arg0.field1070);
        arg1.field3182 += class34.field837.method635(-1, 0, arg1.field3182, arg0.field1070, arg0.field1074, arg1.field3172);
        return arg1.field3182 - var4;
    }
}
