import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class105 {

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lrd;")
    public static class117 field2620 = class95.method812("Anmelde)2Limit -Uberschritten)3", (byte) 8);

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    public static int[] field2616 = new int[1000];

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
    public static int[] field2621 = new int[2000];

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2623 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2614 = 0;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lrd;")
    private static class117 field2626 = class95.method812("Your account has been disabled)3", (byte) 8);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lrd;")
    public static class117 field2627 = field2626;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lmb;")
    public static class85 field2622 = new class85(64);

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[[[La;")
    public static class1[][][] field2631 = new class1[4][104][104];

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lrd;")
    public static class117 field2632 = class95.method812("gelb:", (byte) 8);

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Lrd;")
    private static class117 field2635 = class95.method812("Invalid username or password)3", (byte) 8);

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lrd;")
    public static class117 field2633 = field2635;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[[[I")
    public static int[][][] field2617;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method867(int arg0, int arg1) {
        field2624++;
        if (arg1 != 134100633) {
            return 20;
        }
        class40 var2 = class77.method737(14, arg0);
        int var3 = var2.field1155;
        int var4 = var2.field1153;
        int var5 = var2.field1141;
        int var6 = class68.field1905[var3 - var5];
        return var6 & field2621[var4] >> var5;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method868(int arg0) {
        field2629++;
        class40.field1143.method766(arg0 ^ 0x1A);
        class40.field1157.method766(5);
        class85.field2209.method766(arg0 ^ 0x1A);
        if (arg0 != 31) {
            method875((byte) -17);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
    public static final int method869(int arg0, int arg1, int arg2) {
        if (arg1 > -83) {
            field2632 = null;
        }
        int var3 = arg2 * 57 + arg0;
        field2625++;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static final void method870(int arg0) {
        field2618++;
        class41.field1195.method766(5);
        if (arg0 < 65) {
            method868(98);
        }
        class15.field350.method766(5);
        class80.field2128.method766(5);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Ll;")
    public static final class76 method871(int arg0) {
        field2619++;
        class76 var1 = new class76();
        var1.field2081 = class43.field1219[0];
        var1.field2082 = class15.field343;
        byte[] var2 = class68.field1920[0];
        var1.field2084 = class66.field1868[0];
        var1.field2083 = class21.field597;
        var1.field2087 = class141.field3352[0];
        int var3 = var1.field2087 * var1.field2084;
        var1.field2085 = new int[var3];
        var1.field2086 = class24.field673[0];
        for (int var4 = arg0; var4 < var3; var4++) {
            var1.field2085[var4] = class68.field1902[class66.method660(255, var2[var4])];
        }
        class5.method36((byte) 117);
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3) {
        field2628++;
        if (arg2 != -1) {
            field2614 = 75;
        }
        if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
            class118.field2910 = -1;
            class144.field3415 = -1;
            return;
        }
        int var4 = class133.method1091(class120.field2940, arg1, (byte) 4, arg3) - arg0;
        int var5 = arg1 - class4.field105;
        int var6 = arg3 - class45.field1271;
        int var7 = class129.field3135[class39.field1131];
        int var8 = class129.field3135[class111.field2784];
        int var9 = var4 - class38.field1117;
        int var10 = class129.field3131[class111.field2784];
        int var11 = class129.field3131[class39.field1131];
        int var12 = var5 * var8 + var6 * var10 >> 16;
        int var13 = var5 * var10 - var6 * var8 >> 16;
        int var15 = var9 * var11 - var7 * var13 >> 16;
        int var16 = var7 * var9 + var11 * var13 >> 16;
        if (var16 < 50) {
            class144.field3415 = -1;
            class118.field2910 = -1;
        } else {
            class144.field3415 = (var15 << 9) / var16 + 167;
            class118.field2910 = (var12 << 9) / var16 + 256;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= -77) {
            return;
        }
        field2613++;
        if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
            return;
        }
        if (class68.field1925 && class120.field2940 != arg1) {
            return;
        }
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = 0;
        if (arg0 == 0) {
            var11 = class90.field2308.method355(arg1, arg2, arg6);
        }
        if (arg0 == 1) {
            var11 = class90.field2308.method345(arg1, arg2, arg6);
        }
        if (arg0 == 2) {
            var11 = class90.field2308.method356(arg1, arg2, arg6);
        }
        if (arg0 == 3) {
            var11 = class90.field2308.method360(arg1, arg2, arg6);
        }
        if (var11 != 0) {
            int var12 = class90.field2308.method363(arg1, arg2, arg6, var11);
            int var13 = var11 >> 14 & 0x7FFF;
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg0 == 0) {
                class90.field2308.method328(arg1, arg2, arg6);
                class62 var16 = class147.method1191((byte) 89, var13);
                if (var16.field1758) {
                    class18.field461[arg1].method566(arg6, false, arg2, var16.field1773, var15, var14);
                }
            }
            if (arg0 == 1) {
                class90.field2308.method329(arg1, arg2, arg6);
            }
            if (arg0 == 2) {
                class90.field2308.method357(arg1, arg2, arg6);
                class62 var17 = class147.method1191((byte) 102, var13);
                if (var17.field1737 + arg2 > 103 || arg6 + var17.field1737 > 103 || arg2 + var17.field1750 > 103 || var17.field1750 + arg6 > 103) {
                    return;
                }
                if (var17.field1758) {
                    class18.field461[arg1].method568(var17.field1737, arg2, arg6, var17.field1773, var15, -26449, var17.field1750);
                }
            }
            if (arg0 == 3) {
                class90.field2308.method344(arg1, arg2, arg6);
                class62 var18 = class147.method1191((byte) 112, var13);
                if (var18.field1758 && var18.field1749 == 1) {
                    class18.field461[arg1].method570((byte) -75, arg6, arg2);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg1;
        if (arg1 < 3 && (class124.field3002[1][arg2][arg6] & 0x2) == 2) {
            var19 = arg1 + 1;
        }
        class57.method598((byte) 87, class90.field2308, class18.field461[arg1], arg3, var19, arg2, arg1, arg4, arg6, arg5);
        return;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method874(byte arg0) {
        field2633 = null;
        field2616 = null;
        field2627 = null;
        field2622 = null;
        if (arg0 >= -19) {
            method872(-63, -14, -79, -67);
        }
        field2632 = null;
        field2631 = null;
        field2635 = null;
        field2617 = null;
        field2620 = null;
        field2626 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)J")
    public static final synchronized long method875(byte arg0) {
        field2615++;
        if (arg0 != -80) {
            field2627 = null;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class2.field43) {
            class59.field1664 += class2.field43 - var1;
        }
        class2.field43 = var1;
        return var1 + class59.field1664;
    }
}
