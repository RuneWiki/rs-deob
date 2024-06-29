import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class126 extends class72 {

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "Lec;")
    public static class28 field2729 = class28.method210(-46, "Error loading your profile)3");

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "Lec;")
    public static class28 field2732 = class28.method210(-46, ":0");

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "Lec;")
    public static class28 field2736 = class28.method210(-46, "_");

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "Lec;")
    public static class28 field2734 = class28.method210(-46, "Imported models");

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "Lca;")
    public static class14 field2727;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lj;")
    public static class54 field2737;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "Lbb;")
    public class9 field2730;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "[I")
    public static int[] field2738;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public static void method965(byte arg0) {
        field2729 = null;
        if (arg0 <= 113) {
            return;
        }
        field2732 = null;
        field2727 = null;
        field2737 = null;
        field2734 = null;
        field2736 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IZ)V")
    public static final void method966(int arg0, boolean arg1) {
        field2723++;
        int[] var2 = class13.field215.field563;
        int var3 = var2.length;
        if (!arg1) {
            method967(114, -3, (byte) 11, -49);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 2048 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class47.field1080[arg0][var21][var5] & 0x18) == 0) {
                    class11.field179.method772(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class47.field1080[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class11.field179.method772(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class13.field215.method189();
        int var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class47.field1080[arg0][var19][var8] & 0x18) == 0) {
                    class8.method45(var19, var6, var8, (byte) 78, arg0, var7);
                }
                if (arg0 < 3 && (class47.field1080[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class8.method45(var19, var6, var8, (byte) 78, arg0 + 1, var7);
                }
            }
        }
        class4.field75 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class11.field179.method774(class122.field2657, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class72.method566(var12, -84).field997;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class43.field922[class122.field2657].field2479;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class105.field2211[class4.field75] = class92.field2020[var13];
                        class70.field1561[class4.field75] = var14;
                        class109.field2276[class4.field75] = var15;
                        class4.field75++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBI)I")
    public static final int method967(int arg0, int arg1, byte arg2, int arg3) {
        if (arg1 > 179) {
            arg0 /= 2;
        }
        if (arg1 > 192) {
            arg0 /= 2;
        }
        if (arg1 > 217) {
            arg0 /= 2;
        }
        if (arg2 > -26) {
            method965((byte) -90);
        }
        field2724++;
        if (arg1 > 243) {
            arg0 /= 2;
        }
        return (arg0 / 32 << 7) + (arg3 / 4 << 10) + arg1 / 2;
    }
}
