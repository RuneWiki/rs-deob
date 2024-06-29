import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class132 extends class141 {

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public int field3312 = -1;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public int field3324 = 0;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3309 = 0;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Lkd;")
    private static class73 field3320 = class126.method1070((byte) -66, "Error connecting to server)3");

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Z")
    public static boolean field3304 = false;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Lkd;")
    public static class73 field3322 = field3320;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "[I")
    public static int[] field3315;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method1102(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3318++;
        if (class80.method690(arg6, -1)) {
            class112.method914((byte) -118, 0, arg4, -1, arg3, arg2, arg7, class120.field3066[arg6], arg5, arg8, 0, arg0);
            if (arg1 >= -64) {
                method1102(59, (byte) 96, 76, 35, 89, 59, 54, -9, -11);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(La;IB)Lkd;")
    public static final class73 method1103(class1 arg0, int arg1, byte arg2) {
        if (arg2 >= -50) {
            method1103(null, -84, (byte) 32);
        }
        field3319++;
        if (!class70.method584(9219, arg1, class153.method1225(arg0, -125))) {
            return null;
        } else if (arg0.field134 == null || arg1 >= arg0.field134.length || arg0.field134[arg1] == null || arg0.field134[arg1].method640(-123).method632((byte) -125) == 0) {
            return class141.field3515 ? class32.method258(-110, new class73[] { class55.field1489, class78.method676(arg1, -85) }) : null;
        } else {
            return arg0.field134[arg1];
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static void method1104(byte arg0) {
        field3315 = null;
        field3322 = null;
        field3320 = null;
        int var1 = -6 / ((47 - arg0) / 51);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1105(int arg0) {
        try {
            Graphics var1 = class18.field519.getGraphics();
            class23.field679.method98(0, 4, -16961, var1);
            class26.field770.method98(0, 357, -16961, var1);
            class51.field1365.method98(722, 4, -16961, var1);
            class22.field625.method98(743, 205, -16961, var1);
            class48.field1287.method98(0, 0, -16961, var1);
            class55.field1488.method98(516, 4, -16961, var1);
            class36.field982.method98(516, 205, -16961, var1);
            class38.field1030.method98(496, 357, -16961, var1);
            class139.field3462.method98(0, 338, -16961, var1);
        } catch (Exception var2) {
            class18.field519.repaint();
        }
        field3323++;
        if (arg0 <= 10) {
            field3317 = -66;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLgd;Lgd;)V")
    public static final void method1106(byte arg0, class46 arg1, class46 arg2) {
        field3313++;
        if (class58.field1546 == null) {
            class58.field1546 = class137.method1116(79, class72.field1817, class5.field180, class42.field1131);
        }
        if (class125.field3181 == null) {
            class125.field3181 = class3.method20(40, class5.field180, class31.field874, class42.field1131);
        }
        int var3 = 96 / ((-arg0 - 64) / 42);
        if (class79.field2012 == null) {
            class79.field2012 = class3.method20(40, class5.field180, class100.field2511, class42.field1131);
        }
        if (class87.field2211 == null) {
            class87.field2211 = class3.method20(40, class5.field180, class102.field2548, class42.field1131);
        }
        class17.method133(0, 23, 765, 480, 0);
        class17.method139(0, 0, 125, 23, 12425273, 9135624);
        class17.method139(125, 0, 640, 23, 5197647, 2697513);
        arg2.method343(class121.field3108, 62, 15, 0, -1);
        if (class87.field2211 != null) {
            class87.field2211[1].method208(140, 1);
            arg1.method355(class26.field765, 152, 10, 16777215, -1);
            class87.field2211[0].method208(140, 12);
            arg1.method355(class109.field2683, 152, 21, 16777215, -1);
        }
        if (class79.field2012 != null) {
            short var4 = 280;
            if (class143.field3554[0] == 0 && class119.field3053[0] == 0) {
                class79.field2012[2].method208(var4, 4);
            } else {
                class79.field2012[0].method208(var4, 4);
            }
            if (class143.field3554[0] == 0 && class119.field3053[0] == 1) {
                class79.field2012[3].method208(var4 + 15, 4);
            } else {
                class79.field2012[1].method208(var4 + 15, 4);
            }
            short var5 = 500;
            short var6 = 390;
            arg2.method355(class102.field2544, var4 + 32, 17, 16777215, -1);
            short var7 = 610;
            if (class143.field3554[0] == 1 && class119.field3053[0] == 0) {
                class79.field2012[2].method208(var6, 4);
            } else {
                class79.field2012[0].method208(var6, 4);
            }
            if (class143.field3554[0] == 1 && class119.field3053[0] == 1) {
                class79.field2012[3].method208(var6 + 15, 4);
            } else {
                class79.field2012[1].method208(var6 + 15, 4);
            }
            arg2.method355(class121.field3105, var6 + 32, 17, 16777215, -1);
            if (class143.field3554[0] == 2 && class119.field3053[0] == 0) {
                class79.field2012[2].method208(var5, 4);
            } else {
                class79.field2012[0].method208(var5, 4);
            }
            if (class143.field3554[0] == 2 && class119.field3053[0] == 1) {
                class79.field2012[3].method208(var5 + 15, 4);
            } else {
                class79.field2012[1].method208(var5 + 15, 4);
            }
            arg2.method355(class99.field2499, var5 + 32, 17, 16777215, -1);
            if (class143.field3554[0] == 3 && class119.field3053[0] == 0) {
                class79.field2012[2].method208(var7, 4);
            } else {
                class79.field2012[0].method208(var7, 4);
            }
            if (class143.field3554[0] == 3 && class119.field3053[0] == 1) {
                class79.field2012[3].method208(var7 + 15, 4);
            } else {
                class79.field2012[1].method208(var7 + 15, 4);
            }
            arg2.method355(class14.field446, var7 + 32, 17, 16777215, -1);
        }
        class17.method133(708, 4, 50, 16, 0);
        arg1.method343(class142.field3553, 733, 16, 16777215, -1);
        class114.field2875 = -1;
        if (class58.field1546 != null) {
            byte var8 = 88;
            int var9 = 765 / (var8 + 1);
            byte var10 = 19;
            int var11 = 480 / (var10 + 1);
            int var12;
            int var13;
            do {
                var12 = var11;
                var13 = var9;
                if (class13.field422 <= (var9 - 1) * var11) {
                    var9--;
                }
                if (class13.field422 <= (var11 - 1) * var9) {
                    var11--;
                }
                if (class13.field422 <= (var11 - 1) * var9) {
                    var11--;
                }
            } while (var11 != var12 || var9 != var13);
            int var14 = (765 - var8 * var9) / (var9 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (480 - var10 * var11) / (var11 + 1);
            int var16 = (765 - (var9 - 1) * var14 - var8 * var9) / 2;
            if (var15 > 5) {
                var15 = 5;
            }
            int var17 = (480 - (var11 - 1) * var15 - var10 * var11) / 2;
            int var18 = var17 + 23;
            int var19 = 0;
            int var20 = var16;
            for (int var21 = 0; var21 < class13.field422; var21++) {
                class151 var22 = class99.field2500[var21];
                boolean var23 = true;
                class73 var24 = class78.method676(var22.field3732, -32);
                if (var22.field3732 == -1) {
                    var23 = false;
                    var24 = class143.field3568;
                } else if (var22.field3732 > 1980) {
                    var24 = class53.field1394;
                    var23 = false;
                }
                if (class31.field869 >= var20 && var18 <= class3.field161 && var8 + var20 > class31.field869 && var18 + var10 > class3.field161 && var23) {
                    class114.field2875 = var21;
                    class58.field1546[var22.field3734 ? 1 : 0].method858(var20, var18, 128, 16777215);
                } else {
                    class58.field1546[var22.field3734 ? 1 : 0].method841(var20, var18);
                }
                if (class125.field3181 != null) {
                    class125.field3181[var22.field3744 + (var22.field3734 ? 8 : 0)].method208(var20 + 29, var18);
                }
                arg2.method343(class78.method676(var22.field3738, -6), var20 + 15, var10 / 2 + var18 + 5, 0, -1);
                arg1.method343(var24, var20 + 60, var10 / 2 + 5 + var18, 268435455, -1);
                var18 += var10 + var15;
                var19++;
                if (var11 <= var19) {
                    var18 = var17 + 23;
                    var20 += var8 + var14;
                    var19 = 0;
                }
            }
        }
        try {
            Graphics var25 = class18.field519.getGraphics();
            class89.field2297.method98(0, 0, -16961, var25);
        } catch (Exception var26) {
            class18.field519.repaint();
        }
    }
}
