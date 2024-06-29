import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class172 extends class57 {

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lda;")
    public static class275 field2992 = class255.method1672(110, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lda;")
    public static class275 field2991 = class255.method1672(98, "(Udns");

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lda;")
    public static class275 field2994 = class255.method1672(116, "Texturen geladen)3");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lda;")
    public static class275 field2990 = class255.method1672(112, "Untersuchen");

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field2993 = 0;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lda;")
    private static class275 field2996 = class255.method1672(117, "Connecting to update server");

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lda;")
    public static class275 field2995 = field2996;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLma;)I")
    public static final int method1171(boolean arg0, class105 arg1) {
        field2988++;
        int var2 = 0;
        if (arg1.method784(class269.field4659, -2)) {
            var2++;
        }
        if (arg1.method784(class229.field3928, -2)) {
            var2++;
        }
        if (arg1.method784(class155.field2696, -2)) {
            var2++;
        }
        if (arg1.method784(class180.field3090, -2)) {
            var2++;
        }
        if (!arg0) {
            return 49;
        }
        if (arg1.method784(class258.field4519, -2)) {
            var2++;
        }
        if (arg1.method784(class250.field4417, -2)) {
            var2++;
        }
        if (arg1.method784(class276.field4820, -2)) {
            var2++;
        }
        if (arg1.method784(class235.field4093, -2)) {
            var2++;
        }
        if (arg1.method784(class116.field2067, -2)) {
            var2++;
        }
        if (arg1.method784(class87.field1462, -2)) {
            var2++;
        }
        if (arg1.method784(class108.field1881, -2)) {
            var2++;
        }
        if (arg1.method784(class225.field3807, -2)) {
            var2++;
        }
        if (arg1.method784(class153.field2680, -2)) {
            var2++;
        }
        if (arg1.method784(class191.field3282, -2)) {
            var2++;
        }
        if (arg1.method784(class56.field948, -2)) {
            var2++;
        }
        if (arg1.method784(class129.field2276, -2)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2994 = null;
        field2991 = null;
        field2992 = null;
        field2996 = null;
        if (arg0 != 0) {
            method1171(true, (class105) null);
        }
        field2990 = null;
        field2995 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public static final void method1173() {
        class193.field3316 = 0;
        label191: for (int var0 = 0; var0 < class107.field1859; var0++) {
            class151 var1 = class158.field2776[var0];
            if (class6.field91 != null) {
                for (int var2 = 0; var2 < class6.field91.length; var2++) {
                    if (class6.field91[var2] != -1000000 && (var1.field2644 <= class6.field91[var2] || var1.field2645 <= class6.field91[var2]) && (var1.field2647 <= class244.field4253[var2] || var1.field2651 <= class244.field4253[var2]) && (var1.field2647 >= class168.field2932[var2] || var1.field2651 >= class168.field2932[var2]) && (var1.field2624 <= class188.field3255[var2] || var1.field2642 <= class188.field3255[var2]) && (var1.field2624 >= class224.field3794[var2] || var1.field2642 >= class224.field3794[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2650 == 1) {
                int var3 = var1.field2641 + class275.field4759 - class87.field1474;
                if (var3 >= 0 && var3 <= class275.field4759 + class275.field4759) {
                    int var4 = var1.field2635 + class275.field4759 - class131.field2347;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2630 + class275.field4759 - class131.field2347;
                    if (var5 > class275.field4759 + class275.field4759) {
                        var5 = class275.field4759 + class275.field4759;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class149.field2594[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class123.field2205 - var1.field2647;
                        if (var7 > 32) {
                            var1.field2646 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2646 = 2;
                            var7 = -var7;
                        }
                        var1.field2643 = (var1.field2624 - class265.field4617 << 8) / var7;
                        var1.field2625 = (var1.field2642 - class265.field4617 << 8) / var7;
                        var1.field2637 = (var1.field2644 - class80.field1317 << 8) / var7;
                        var1.field2627 = (var1.field2645 - class80.field1317 << 8) / var7;
                        class1.field7[class193.field3316++] = var1;
                    }
                }
            } else if (var1.field2650 == 2) {
                int var8 = var1.field2635 + class275.field4759 - class131.field2347;
                if (var8 >= 0 && var8 <= class275.field4759 + class275.field4759) {
                    int var9 = var1.field2641 + class275.field4759 - class87.field1474;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2639 + class275.field4759 - class87.field1474;
                    if (var10 > class275.field4759 + class275.field4759) {
                        var10 = class275.field4759 + class275.field4759;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class149.field2594[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class265.field4617 - var1.field2624;
                        if (var12 > 32) {
                            var1.field2646 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2646 = 4;
                            var12 = -var12;
                        }
                        var1.field2632 = (var1.field2647 - class123.field2205 << 8) / var12;
                        var1.field2649 = (var1.field2651 - class123.field2205 << 8) / var12;
                        var1.field2637 = (var1.field2644 - class80.field1317 << 8) / var12;
                        var1.field2627 = (var1.field2645 - class80.field1317 << 8) / var12;
                        class1.field7[class193.field3316++] = var1;
                    }
                }
            } else if (var1.field2650 == 4) {
                int var13 = var1.field2644 - class80.field1317;
                if (var13 > 128) {
                    int var14 = var1.field2635 + class275.field4759 - class131.field2347;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2630 + class275.field4759 - class131.field2347;
                    if (var15 > class275.field4759 + class275.field4759) {
                        var15 = class275.field4759 + class275.field4759;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2641 + class275.field4759 - class87.field1474;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2639 + class275.field4759 - class87.field1474;
                        if (var17 > class275.field4759 + class275.field4759) {
                            var17 = class275.field4759 + class275.field4759;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class149.field2594[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2646 = 5;
                            var1.field2632 = (var1.field2647 - class123.field2205 << 8) / var13;
                            var1.field2649 = (var1.field2651 - class123.field2205 << 8) / var13;
                            var1.field2643 = (var1.field2624 - class265.field4617 << 8) / var13;
                            var1.field2625 = (var1.field2642 - class265.field4617 << 8) / var13;
                            class1.field7[class193.field3316++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Z")
    public static final boolean method1174(int arg0, int arg1) {
        field2989++;
        if (arg0 == -1) {
            return ((arg1 & 0x1118BF5E) >> 28) != 0;
        } else {
            return false;
        }
    }
}
