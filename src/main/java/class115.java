import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class115 {

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lgd;")
    public static class40 field2767 = class14.method90(false, "::errortest");

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lgd;")
    private static class40 field2760 = class14.method90(false, "Your account is already logged in)3");

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lgd;")
    private static class40 field2772 = class14.method90(false, "Login");

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lgd;")
    private static class40 field2768 = class14.method90(false, "Ok");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
    public static int[] field2763 = new int[32768];

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lgd;")
    private static class40 field2776 = class14.method90(false, "Cancel");

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lgd;")
    public static class40 field2779 = class14.method90(false, " (X");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lgd;")
    public static class40 field2770 = field2776;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lgd;")
    public static class40 field2764 = class14.method90(false, "(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lgd;")
    public static class40 field2771 = class14.method90(false, "mapedge");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2758 = 0;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lgd;")
    public static class40 field2778 = field2760;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lgd;")
    public static class40 field2780 = field2772;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lgd;")
    public static class40 field2782 = field2768;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lba;")
    public static class7 field2775 = new class7(64);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lrb;")
    public static class103 field2761;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Loc;")
    public static class86 field2774;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
    public static int[] field2762;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I", line = 12)
    public static final int method886(int arg0, int arg1, int arg2) {
        field2759++;
        int var3 = class51.method396(arg0 - 1, arg2 - 1, (byte) 119) + class51.method396(arg0 + 1, arg2 + -1, (byte) 112) + class51.method396(arg0 - 1, arg2 - -1, (byte) -124) + class51.method396(arg0 + 1, arg2 + 1, (byte) -89);
        int var4 = class51.method396(arg0 - 1, arg2, (byte) -108) + class51.method396(arg0 + 1, arg2, (byte) 105) + class51.method396(arg0, arg2 + -1, (byte) -46) + class51.method396(arg0, arg2 - -1, (byte) -78);
        if (arg1 == 3) {
            int var5 = class51.method396(arg0, arg2, (byte) 94);
            return var3 / 16 + var4 / 8 + var5 / 4;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIB)I", line = 30)
    public static final int method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2766++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg0;
        } else {
            int var9 = -116 % ((17 - arg6) / 46);
            return var8 == 2 ? 7 + 1 - arg2 - arg3 : 7 - (arg5 - 1) + -arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIIII)Lhd;", line = 69)
    public static final class46 method888(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2773++;
        long var6 = ((long) arg2 << 40) + (long) arg4 + ((long) arg1 << 16) + ((long) arg5 << 38);
        if (!arg0) {
            class46 var8 = (class46) class1.field20.method39(122, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class4 var9 = class132.method1041(arg4, 83);
        if (arg1 > 1 && var9.field95 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field134[var11] <= arg1 && var9.field134[var11] != 0) {
                    var10 = var9.field95[var11];
                }
            }
            if (var10 != -1) {
                var9 = class132.method1041(var10, 36);
            }
        }
        class97 var12 = var9.method22(1, true, arg3 ^ 0xFFFFF8A4);
        if (var12 == null) {
            return null;
        }
        class46 var13 = null;
        if (var9.field87 != -1) {
            var13 = method888(true, 10, 0, 2011, var9.field107, 1);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class27.field605;
        int var15 = class27.field601;
        int var16 = class27.field604;
        int var17 = class27.field600;
        int var18 = class27.field602;
        int var19 = class27.field606;
        int var20 = class27.field603;
        int[] var21 = class109.method848();
        int var22 = class109.field2656;
        int var23 = class109.field2665;
        class46 var24 = new class46(36, 32);
        class27.method170(var24.field1167, 36, 32);
        class29.field622 = class109.method835(class29.field622);
        class27.method164(0, 0, 36, 32, 0);
        class109.field2651 = false;
        class109.method845(16, 16);
        int var25 = var9.field132;
        if (arg0) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg5 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class109.field2659[var9.field140] * var25 >> 16;
        int var27 = class109.field2657[var9.field140] * var25 >> 16;
        var12.method672();
        var12.method674(0, var9.field90, var9.field113, var9.field140, var9.field116, var12.field11 / 2 + var9.field96 + var26, var9.field96 + var27);
        if (arg5 >= 1) {
            var24.method322(1);
        }
        if (arg5 >= 2) {
            var24.method322(16777215);
        }
        if (arg2 != 0) {
            var24.method329(arg2);
        }
        class27.method170(var24.field1167, 36, 32);
        if (var9.field87 != -1) {
            var13.method342(0, 0);
        }
        if (arg3 != 2011) {
            return null;
        }
        if (!arg0 && (var9.field99 == 1 || arg1 != 1)) {
            class31.field767.method353(class53.method407((byte) 103, arg1), 1, 10, 1);
            class31.field767.method353(class53.method407((byte) 91, arg1), 0, 9, 16776960);
        }
        if (!arg0) {
            class1.field20.method38(var24, var6, true);
        }
        class27.method170(var14, var15, var19);
        class27.method166(var16, var18, var17, var20);
        class109.method835(var21);
        class109.field2665 = var23;
        class109.field2656 = var22;
        class109.method841();
        class109.field2651 = true;
        return var24;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lee;I)Z", line = 210)
    public static final boolean method889(class30 arg0, int arg1) {
        field2765++;
        if (arg0.field691 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field691.length; var2++) {
            int var3 = class12.method69(false, var2, arg0);
            int var4 = arg0.field695[var2];
            if (arg0.field691[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field691[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field691[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 < 9) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 275)
    public static void method890(int arg0) {
        field2775 = null;
        field2762 = null;
        field2761 = null;
        field2779 = null;
        field2776 = null;
        field2770 = null;
        field2778 = null;
        field2764 = null;
        if (arg0 > -122) {
            field2774 = null;
        }
        field2771 = null;
        field2772 = null;
        field2763 = null;
        field2780 = null;
        field2767 = null;
        field2774 = null;
        field2768 = null;
        field2782 = null;
        field2760 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 341)
    public static final void method891(Component arg0, int arg1) {
        Method var2 = class102.field2425;
        if (arg1 >= -87) {
            field2782 = null;
        }
        field2777++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class134.field3260);
        arg0.addFocusListener(class134.field3260);
    }
}
