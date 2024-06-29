import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class154 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lla;")
    public static class95 field2805 = new class95(260);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "B")
    public static byte field2808;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lka;")
    public class257 field2802;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[I")
    public int[] field2809;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lke;IIIIIIZ)V")
    public static final void method1067(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2136.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2136[var9] - class272.field4824;
            int var23 = arg0.field2133[var9] - class215.field3878;
            int var24 = arg0.field2124[var9] - class87.field1732;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2123 != null) {
                class107.field2117[var9] = var25;
                class107.field2121[var9] = var28;
                class107.field2135[var9] = var29;
            }
            class107.field2120[var9] = (var25 << 9) / var29 + class15.field281;
            class107.field2137[var9] = (var28 << 9) / var29 + class15.field284;
        }
        class15.field285 = 0;
        int var10 = arg0.field2126.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2126[var11];
            int var13 = arg0.field2130[var11];
            int var14 = arg0.field2138[var11];
            int var15 = class107.field2120[var12];
            int var16 = class107.field2120[var13];
            int var17 = class107.field2120[var14];
            int var18 = class107.field2137[var12];
            int var19 = class107.field2137[var13];
            int var20 = class107.field2137[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class224.field4080 && class161.method1110(class230.field4178 + class15.field281, class22.field422 + class15.field284, var18, var19, var20, var15, var16, var17)) {
                    class235.field4230 = arg5;
                    class206.field3682 = arg6;
                }
                if (!arg7) {
                    class15.field272 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class15.field287 || var16 > class15.field287 || var17 > class15.field287) {
                        class15.field272 = true;
                    }
                    if (arg0.field2123 == null || arg0.field2123[var11] == -1) {
                        if (arg0.field2131[var11] != 12345678) {
                            class15.method126(var18, var19, var20, var15, var16, var17, arg0.field2131[var11], arg0.field2118[var11], arg0.field2125[var11]);
                        }
                    } else if (!class39.field662) {
                        int var21 = class15.field271.method1620(arg0.field2123[var11], (byte) -69);
                        class15.method126(var18, var19, var20, var15, var16, var17, class129.method924(var21, arg0.field2131[var11]), class129.method924(var21, arg0.field2118[var11]), class129.method924(var21, arg0.field2125[var11]));
                    } else if (arg0.field2128) {
                        class15.method122(var18, var19, var20, var15, var16, var17, arg0.field2131[var11], arg0.field2118[var11], arg0.field2125[var11], class107.field2117[0], class107.field2117[1], class107.field2117[3], class107.field2121[0], class107.field2121[1], class107.field2121[3], class107.field2135[0], class107.field2135[1], class107.field2135[3], arg0.field2123[var11]);
                    } else {
                        class15.method122(var18, var19, var20, var15, var16, var17, arg0.field2131[var11], arg0.field2118[var11], arg0.field2125[var11], class107.field2117[var12], class107.field2117[var13], class107.field2117[var14], class107.field2121[var12], class107.field2121[var13], class107.field2121[var14], class107.field2135[var12], class107.field2135[var13], class107.field2135[var14], arg0.field2123[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        field2805 = null;
        if (arg0 != 0) {
            method1068(94);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBI)V")
    public static final void method1069(int arg0, byte arg1, int arg2) {
        class49.field978 = arg0 - class38.field654;
        field2803++;
        class279.field4919 = class98.field1921 + class224.field4082 - arg2 - 1;
        int var3 = class49.field978 - ((int) ((float) class156.field2855.field789 / class116.field2324));
        int var4 = (int) ((float) class156.field2855.field789 / class116.field2324) + class49.field978;
        if (arg1 != 125) {
            return;
        }
        int var5 = (int) ((float) class156.field2855.field758 / class116.field2324) + class279.field4919;
        if (var3 < 0) {
            class49.field978 = (int) ((float) class156.field2855.field789 / class116.field2324);
        }
        if (var4 > class59.field1194) {
            class49.field978 = class59.field1194 - (int) ((float) class156.field2855.field789 / class116.field2324);
        }
        int var6 = class279.field4919 - ((int) ((float) class156.field2855.field758 / class116.field2324));
        if (var6 < 0) {
            class279.field4919 = (int) ((float) class156.field2855.field758 / class116.field2324);
        }
        if (class98.field1921 < var5) {
            class279.field4919 = class98.field1921 - ((int) ((float) class156.field2855.field758 / class116.field2324));
        }
    }
}
