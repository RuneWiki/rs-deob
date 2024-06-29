import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class114 extends class191 {

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Ldd;")
    private class35 field2553 = class197.field3932;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Ldd;")
    private static class35 field2542 = class180.method1196((byte) 126, "yellow:");

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Ldd;")
    public static class35 field2552 = field2542;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "Ldd;")
    public static class35 field2544 = field2542;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "Lld;")
    public static class111 field2551 = new class111(50);

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public static int field2556 = 0;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Ll;")
    private class107 field2541;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I")
    public final int method822(byte arg0, int arg1) {
        field2554++;
        if (this.field2541 == null) {
            return this.field2548;
        }
        class15 var3 = (class15) this.field2541.method796(true, (long) arg1);
        if (arg0 == -128) {
            return var3 == null ? this.field2548 : var3.field276;
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILce;I)V")
    private final void method823(int arg0, class26 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2547 = arg1.method221(-84);
        } else if (arg0 == 2) {
            this.field2545 = arg1.method221(-118);
        } else if (arg0 == 3) {
            this.field2553 = arg1.method236(0);
        } else if (arg0 == 4) {
            this.field2548 = arg1.method240(8);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method256((byte) -78);
            this.field2541 = new class107(class20.method175(8237, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method240(8);
                class109 var7;
                if (arg0 == 5) {
                    var7 = new class126(arg1.method236(0));
                } else {
                    var7 = new class15(arg1.method240(arg2 + 3));
                }
                this.field2541.method789(var7, true, (long) var6);
            }
        }
        field2549++;
        if (arg2 != 5) {
            field2556 = -42;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(BI)Ldd;")
    public final class35 method824(byte arg0, int arg1) {
        field2555++;
        if (this.field2541 == null) {
            return this.field2553;
        }
        if (arg0 >= -28) {
            field2544 = null;
        }
        class126 var3 = (class126) this.field2541.method796(true, (long) arg1);
        return var3 == null ? this.field2553 : var3.field2742;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lce;I)V")
    public final void method825(class26 arg0, int arg1) {
        field2543++;
        while (true) {
            int var3 = arg0.method221(-98);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method828(96);
                    return;
                }
            }
            this.method823(var3, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lma;IIIIII)V")
    public static final void method826(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field2597.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field2597[var8] - class4.field78;
            int var22 = arg0.field2599[var8] - class2.field22;
            int var23 = arg0.field2616[var8] - class29.field590;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field2606 != null) {
                class117.field2611[var8] = var24;
                class117.field2612[var8] = var27;
                class117.field2602[var8] = var28;
            }
            class117.field2601[var8] = (var24 << 9) / var28 + class11.field207;
            class117.field2604[var8] = (var27 << 9) / var28 + class11.field208;
        }
        class11.field205 = 0;
        int var9 = arg0.field2605.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field2605[var10];
            int var12 = arg0.field2609[var10];
            int var13 = arg0.field2610[var10];
            int var14 = class117.field2601[var11];
            int var15 = class117.field2601[var12];
            int var16 = class117.field2601[var13];
            int var17 = class117.field2604[var11];
            int var18 = class117.field2604[var12];
            int var19 = class117.field2604[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class80.field1865 && class72.method577(class74.field1781, class111.field2456, var17, var18, var19, var14, var15, var16)) {
                    class188.field3817 = arg5;
                    class68.field1595 = arg6;
                }
                class11.field213 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class11.field209 || var15 > class11.field209 || var16 > class11.field209) {
                    class11.field213 = true;
                }
                if (arg0.field2606 == null || arg0.field2606[var10] == -1) {
                    if (arg0.field2600[var10] != 12345678) {
                        class11.method83(var17, var18, var19, var14, var15, var16, arg0.field2600[var10], arg0.field2613[var10], arg0.field2596[var10]);
                    }
                } else if (class154.field3173) {
                    int var20 = class11.field217.method829(529, arg0.field2606[var10]);
                    class11.method83(var17, var18, var19, var14, var15, var16, class182.method1209(var20, arg0.field2600[var10]), class182.method1209(var20, arg0.field2613[var10]), class182.method1209(var20, arg0.field2596[var10]));
                } else if (arg0.field2607) {
                    class11.method75(var17, var18, var19, var14, var15, var16, arg0.field2600[var10], arg0.field2613[var10], arg0.field2596[var10], class117.field2611[0], class117.field2611[1], class117.field2611[3], class117.field2612[0], class117.field2612[1], class117.field2612[3], class117.field2602[0], class117.field2602[1], class117.field2602[3], arg0.field2606[var10]);
                } else {
                    class11.method75(var17, var18, var19, var14, var15, var16, arg0.field2600[var10], arg0.field2613[var10], arg0.field2596[var10], class117.field2611[var11], class117.field2611[var12], class117.field2611[var13], class117.field2612[var11], class117.field2612[var12], class117.field2612[var13], class117.field2602[var11], class117.field2602[var12], class117.field2602[var13], arg0.field2606[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)I")
    public static final int method827(int arg0, int arg1, int arg2) {
        field2546++;
        int var3 = class145.method998(arg2 - 28, arg0 + -1, arg1 - 1) + class145.method998(-29, arg0 - 1, arg1 + 1) + class145.method998(-29, arg0 + 1, arg1 + -1) + class145.method998(-29, arg0 + 1, arg1 + 1);
        int var4 = class145.method998(-29, arg0, arg1 - 1) + class145.method998(-29, arg0, arg1 + 1) + class145.method998(-29, arg0 + arg2, arg1) + class145.method998(-29, arg0 + 1, arg1);
        int var5 = class145.method998(-29, arg0, arg1);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    public static void method828(int arg0) {
        field2551 = null;
        if (arg0 == 9) {
            field2542 = null;
            field2552 = null;
            field2544 = null;
        }
    }
}
