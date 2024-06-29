import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class173 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field2958 = -1;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[Lq;")
    public static class238[] field2961 = new class238[4];

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lia;")
    public static class257 field2962 = class28.method234(111, "Abbrechen");

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lia;")
    public static class257 field2963 = class28.method234(-25, "<img=0>");

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field2955;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lia;")
    public static final class257 method1176(int arg0, int arg1) {
        field2960++;
        class257 var2 = class111.method808(10, arg0);
        if (arg1 != -10581) {
            field2958 = -58;
        }
        for (int var3 = var2.method1679((byte) -90) - 3; var3 > 0; var3 -= 3) {
            var2 = class233.method1528(new class257[] { var2.method1713(48, 0, var3), class133.field2382, var2.method1674(var3, 255) }, 0);
        }
        if (var2.method1679((byte) -51) > 9) {
            return class233.method1528(new class257[] { class28.field533, var2.method1713(48, 0, var2.method1679((byte) 108) - 8), class191.field3277, class104.field1942, var2, class210.field3590 }, arg1 + 10581);
        } else if (var2.method1679((byte) 86) > 6) {
            return class233.method1528(new class257[] { class31.field594, var2.method1713(48, 0, var2.method1679((byte) 61) - 4), class219.field3701, class104.field1942, var2, class210.field3590 }, arg1 ^ 0xFFFFD6AB);
        } else {
            return class233.method1528(new class257[] { class83.field1613, var2, class225.field3776 }, 0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class140.field2491 * 128) {
            arg0 = class140.field2491 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class73.field1427 * 128) {
            arg2 = class73.field1427 * 128 - 1;
        }
        class90.field1733 = class101.field1872[arg3];
        class96.field1812 = class101.field1871[arg3];
        class102.field1881 = class101.field1872[arg4];
        class99.field1827 = class101.field1871[arg4];
        class26.field512 = arg0;
        class18.field393 = arg1;
        class224.field3765 = arg2;
        class207.field3546 = arg0 / 128;
        class228.field3836 = arg2 / 128;
        class189.field3257 = arg5;
        class62.field1273 = class207.field3546 - class11.field212;
        if (class62.field1273 < 0) {
            class62.field1273 = 0;
        }
        class44.field973 = class228.field3836 - class11.field212;
        if (class44.field973 < 0) {
            class44.field973 = 0;
        }
        class143.field2507 = class207.field3546 + class11.field212;
        if (class143.field2507 > class140.field2491) {
            class143.field2507 = class140.field2491;
        }
        class58.field1225 = class228.field3836 + class11.field212;
        if (class58.field1225 > class73.field1427) {
            class58.field1225 = class73.field1427;
        }
        short var16 = 3500;
        for (int var17 = 0; var17 < class11.field212 + class11.field212 + 2; var17++) {
            for (int var20 = 0; var20 < class11.field212 + class11.field212 + 2; var20++) {
                int var21 = (var17 - class11.field212 << 7) - (class26.field512 & 0x7F);
                int var22 = (var20 - class11.field212 << 7) - (class224.field3765 & 0x7F);
                int var23 = class207.field3546 + var17 - class11.field212;
                int var24 = class228.field3836 + var20 - class11.field212;
                if (var23 >= 0 && var24 >= 0 && var23 < class140.field2491 && var24 < class73.field1427) {
                    int var25;
                    if (class152.field2673 == null) {
                        var25 = class159.field2793[0][var23][var24] + 128 - class18.field393;
                    } else {
                        var25 = class152.field2673[0][var23][var24] + 128 - class18.field393;
                    }
                    int var26 = class159.field2793[3][var23][var24] - class18.field393 - 1000;
                    class226.field3793[var17][var20] = class121.method850(var21, var26, var25, var22, var16);
                } else {
                    class226.field3793[var17][var20] = false;
                }
            }
        }
        for (int var18 = 0; var18 < class11.field212 + class11.field212 + 1; var18++) {
            for (int var19 = 0; var19 < class11.field212 + class11.field212 + 1; var19++) {
                class14.field315[var18][var19] = class226.field3793[var18][var19] || class226.field3793[var18 + 1][var19] || class226.field3793[var18][var19 + 1] || class226.field3793[var18 + 1][var19 + 1];
            }
        }
        class242.field4196 = arg7;
        class175.field2984 = arg8;
        class1.field9 = arg9;
        class71.field1402 = arg10;
        class62.field1276 = arg11;
        class109.method802();
        class137.method945(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
    public static final void method1178(int arg0, boolean arg1) {
        field2959++;
        class39.method319((byte) 124);
        if (class217.field3675 == 28) {
            return;
        }
        class151.field2613++;
        if (class151.field2613 < 50 && !arg1) {
            return;
        }
        class151.field2613 = 0;
        if (arg0 != -1) {
            method1179((byte) -93);
        }
        if (class182.field3173 || class151.field2595 == null) {
            return;
        }
        class150.field2584++;
        class205.field3524.method908(false, 138);
        try {
            class151.field2595.method1419(class205.field3524.field2677, 0, class205.field3524.field2638, 123);
            class205.field3524.field2677 = 0;
        } catch (IOException var2) {
            class182.field3173 = true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1179(byte arg0) {
        field2963 = null;
        if (arg0 != -121) {
            method1178(-112, true);
        }
        field2955 = null;
        field2962 = null;
        field2961 = null;
    }
}
