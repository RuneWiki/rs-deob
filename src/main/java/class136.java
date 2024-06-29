import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 extends class31 {

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public int field3076 = 0;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static volatile int field3084 = 0;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field3081 = 0;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "[J")
    public static long[] field3082 = new long[200];

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field3086 = 0;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "Lid;")
    public static class60 field3088 = class11.method72("mod_icons", (byte) 98);

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Lid;")
    public static class60 field3075 = class11.method72("Hidden)2", (byte) -105);

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "[I")
    public static int[] field3091 = new int[5];

    @OriginalMember(owner = "client!td", name = "db", descriptor = "Lid;")
    private static class60 field3087 = class11.method72("Please wait 1 minute and try again)3", (byte) 102);

    @OriginalMember(owner = "client!td", name = "W", descriptor = "Lid;")
    private static class60 field3080 = class11.method72("button near the top of that page)3", (byte) 93);

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "Lid;")
    public static class60 field3092 = field3087;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lid;")
    public static class60 field3079 = field3087;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "Lid;")
    public static class60 field3097 = class11.method72("Ihr Spielkonto wird bereits benutzt)3", (byte) 101);

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lid;")
    public static class60 field3083 = field3080;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "J")
    public static volatile long field3085 = 0L;

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "Lid;")
    private static class60 field3100 = class11.method72("wishes to duel with you)3", (byte) 127);

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Lid;")
    public static class60 field3077 = field3100;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3090;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "[I")
    public static int[] field3098;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLh;Lh;)V")
    public static final void method1060(byte arg0, class49 arg1, class49 arg2) {
        field3094++;
        if (class129.field2937) {
            class55.method395(arg2, arg1, (byte) 9);
            return;
        }
        if (class48.field1265 == 0 || class48.field1265 == 5) {
            byte var3 = 20;
            arg2.method956(class98.field2398, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class130.method1019(230, var4, 304, 34, 9179409);
            class130.method1019(231, var4 + 1, 302, 32, 0);
            class130.method1015(232, var4 + 2, class4.field67 * 3, 30, 9179409);
            class130.method1015(class4.field67 * 3 + 232, var4 + 2, 300 - class4.field67 * 3, 30, 0);
            arg2.method956(class141.field3216, 382, 276 - var3, 16777215, -1);
        }
        if (class48.field1265 == 20) {
            class124.field2868.method224(382 - class124.field2868.field698 / 2, -(class124.field2868.field695 / 2) + 271);
            short var5 = 211;
            arg2.method956(class141.field3205, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method956(class141.field3210, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method956(class141.field3220, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method947(class104.method853(-113, new class60[] { class104.field2554, class122.method962(class141.field3209) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method947(class104.method853(-86, new class60[] { class47.field1246, class141.field3218.method442(arg0 ^ -85) }), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class48.field1265 == 10) {
            class124.field2868.method224(202, 171);
            if (class89.field2221 == 0) {
                short var13 = 251;
                short var14 = 302;
                arg2.method956(class139.field3179, 382, var13, 16776960, 0);
                short var15 = 291;
                int var39 = var13 + 30;
                class15.field347.method224(var14 - 73, var15 + -20);
                arg2.method953(class148.field3373, var14 - 73, var15 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var16 = 462;
                class15.field347.method224(var16 - 73, var15 - 20);
                arg2.method953(class14.field255, var16 - 73, var15 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class89.field2221 == 2) {
                short var6 = 211;
                short var7 = 302;
                short var8 = 321;
                arg2.method956(class141.field3205, 382, var6, 16776960, 0);
                int var27 = var6 + 15;
                arg2.method956(class141.field3210, 382, var27, 16776960, 0);
                int var29 = var27 + 15;
                arg2.method956(class141.field3220, 382, var29, 16776960, 0);
                int var31 = var29 + 15;
                int var32 = var31 + 10;
                arg2.method947(class104.method853(-100, new class60[] { class104.field2554, class122.method962(class141.field3209), class82.field2065 % 40 < 20 & ~class32.field744 == -1 ? class1.field38 : class141.field3219 }), 272, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg2.method947(class104.method853(arg0 ^ 0xFFFFFFE9, new class60[] { class47.field1246, class141.field3218.method442(118), class32.field744 == 1 & class82.field2065 % 40 < 20 ? class1.field38 : class141.field3219 }), 274, var33, 16777215, 0);
                int var34 = var33 + 15;
                class15.field347.method224(var7 - 73, var8 + -20);
                arg2.method956(class148.field3374, var7, var8 + 5, 16777215, 0);
                short var9 = 462;
                class15.field347.method224(var9 - 73, var8 - 20);
                arg2.method956(class33.field776, var9, var8 + 5, 16777215, 0);
            } else if (class89.field2221 == 3) {
                arg2.method956(class139.field3176, 382, 211, 16776960, 0);
                short var10 = 236;
                arg2.method956(class5.field79, 382, var10, 16777215, 0);
                short var11 = 321;
                int var35 = var10 + 15;
                short var12 = 382;
                arg2.method956(class128.field2927, 382, var35, 16777215, 0);
                int var36 = var35 + 15;
                arg2.method956(class66.field1630, 382, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg2.method956(field3083, 382, var37, 16777215, 0);
                int var38 = var37 + 15;
                class15.field347.method224(var12 - 73, var11 + -20);
                arg2.method956(class33.field776, var12, var11 + 5, 16777215, 0);
            }
        }
        if (class19.field470 != 1) {
            if (class93.field2296 > 0) {
                class46.method359(class93.field2296, (byte) 123);
                class93.field2296 = 0;
            }
            class146.method1115(-42);
        }
        class41.field1100[class31.field725 ? 1 : 0].method224(725, 463);
        if (class48.field1265 > 5 && class101.field2468 != 2 && class145.field3273 == 0) {
            if (class105.field2583 == null) {
                class105.field2583 = class47.method369(class141.field3219, (byte) -51, class97.field2381, class56.field1407);
            } else {
                short var17 = 463;
                byte var18 = 5;
                class105.field2583.method224(var18, var17);
                byte var19 = 35;
                byte var20 = 100;
                arg2.method956(class104.method853(-117, new class60[] { class113.field2704, class154.field3493, class98.method774((byte) -121, class17.field434) }), var20 / 2 + var18, var19 / 2 + -2 + var17, 16777215, 0);
                if (class60.field1470 == null) {
                    arg1.method956(class104.field2553, var18 + var20 / 2, var19 / 2 + var17 + 12, 16777215, 0);
                } else {
                    arg1.method956(class40.field1060, var18 + var20 / 2, var17 - -(var19 / 2) + 12, 16777215, 0);
                }
            }
        }
        try {
            if (arg0 != 115) {
                method1061(false, -22);
            }
            Graphics var21 = class9.field148.getGraphics();
            class69.field1660.method63(0, 103, 0, var21);
        } catch (Exception var22) {
            class9.field148.repaint();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
    public static final void method1061(boolean arg0, int arg1) {
        if (arg1 != 20) {
            method1060((byte) 21, null, null);
        }
        for (int var2 = 0; var2 < class72.field1748; var2++) {
            class53 var3 = class5.field83[class1.field1[var2]];
            int var4 = (class1.field1[var2] << 14) + 536870912;
            if (var3 != null && var3.method2((byte) 37) && var3.field1337.field3481 == arg0 && var3.field1337.method1179(0)) {
                int var5 = var3.field854 >> 7;
                int var6 = var3.field828 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field872 == 1 && (var3.field854 & 0x7F) == 64 && (var3.field828 & 0x7F) == 64) {
                        if (class15.field341[var5][var6] == class23.field556) {
                            continue;
                        }
                        class15.field341[var5][var6] = class23.field556;
                    }
                    if (!var3.field1337.field3497) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class43.field1151.method589(class46.field1222, var3.field854, var3.field828, class50.method381(class46.field1222, var3.field872 * 64 + var3.field828 - 64, (var3.field872 + -1) * 64 + var3.field854, (byte) 10), (var3.field872 - 1) * 64 + 60, var3, var3.field864, var4, var3.field826);
                }
            }
        }
        field3099++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lof;II)V")
    private final void method1062(class103 arg0, int arg1, int arg2) {
        if (arg1 >= 2) {
            if (arg2 == 2) {
                this.field3076 = arg0.method808(-20054);
            }
            field3093++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLof;)V")
    public final void method1063(byte arg0, class103 arg1) {
        int var3 = 60 % ((arg0 + 12) / 52);
        while (true) {
            int var4 = arg1.method829((byte) 127);
            if (var4 == 0) {
                field3078++;
                return;
            }
            this.method1062(arg1, 48, var4);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method1064(boolean arg0) {
        field3079 = null;
        field3083 = null;
        field3100 = null;
        field3098 = null;
        field3087 = null;
        field3080 = null;
        field3077 = null;
        field3092 = null;
        field3090 = null;
        field3082 = null;
        field3091 = null;
        field3088 = null;
        if (!arg0) {
            field3075 = null;
            field3097 = null;
        }
    }
}
