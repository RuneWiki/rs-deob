import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class133 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lae;")
    private static class6 field3238 = class64.method474(120, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lae;")
    public static class6 field3240 = class64.method474(127, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
    public static int[] field3245 = new int[2000];

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Lae;")
    public static class6 field3259 = field3238;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3246 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3250 = 1;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Lae;")
    public static class6 field3262 = class64.method474(115, "");

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lae;")
    public static class6 field3244 = field3262;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lae;")
    public static class6 field3242 = field3262;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lae;")
    public static class6 field3254 = field3262;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lae;")
    public static class6 field3256 = field3262;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lae;")
    public static class6 field3247 = field3262;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Lae;")
    public static class6 field3260 = field3262;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lae;")
    private static class6 field3258 = class64.method474(124, "Malformed login packet)3");

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Lae;")
    public static class6 field3263 = field3258;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lsd;")
    public static class114 field3249;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lvb;")
    public static class129 field3248;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1089(int arg0) {
        field3241++;
        if (arg0 < 81) {
            method1093(true);
        }
        class22.field551.method129(27392);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILed;IZ)Z", line = 16)
    public static final boolean method1090(int arg0, class31 arg1, int arg2, boolean arg3) {
        field3255++;
        if (arg2 != 32031) {
            method1094(74, null);
        }
        if (class8.method76(arg1, 21597, arg3)) {
            if (arg0 > 0) {
                class2.field12 = new class12(arg0);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 36)
    public static void method1091(byte arg0) {
        field3262 = null;
        field3245 = null;
        field3248 = null;
        field3242 = null;
        field3258 = null;
        field3247 = null;
        field3244 = null;
        field3260 = null;
        field3256 = null;
        field3238 = null;
        int var1 = -95 / ((arg0 - 62) / 63);
        field3259 = null;
        field3249 = null;
        field3240 = null;
        field3263 = null;
        field3254 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 70)
    public static final void method1092(int arg0) {
        if (arg0 != 256) {
            field3262 = null;
        }
        class2.field9.method129(27392);
        field3257++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 82)
    public static final void method1093(boolean arg0) {
        field3239++;
        if (arg0) {
            return;
        }
        try {
            Graphics var1 = class70.field1564.getGraphics();
            class138.field3350.method1(-47, var1, 550, 4);
        } catch (Exception var2) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILmc;)V", line = 128)
    public static final void method1094(int arg0, class76 arg1) {
        arg1.field1785 = arg1.field1800;
        field3243++;
        if (arg1.field1794 == 0) {
            arg1.field1751 = 0;
            return;
        }
        if (arg1.field1744 != -1 && arg1.field1787 == 0) {
            class85 var2 = class35.method314(arg1.field1744, (byte) 54);
            if (arg1.field1725 > 0 && var2.field2057 == 0) {
                arg1.field1751++;
                return;
            }
            if (arg1.field1725 <= 0 && var2.field2054 == 0) {
                arg1.field1751++;
                return;
            }
        }
        int var3 = arg1.field1783;
        int var4 = arg1.field1752;
        int var5 = arg1.field1726[arg1.field1794 - 1] * 128 + arg1.field1777 * 64;
        int var6 = arg1.field1796[arg1.field1794 - 1] * 128 + arg1.field1777 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg1.field1752 = var5;
            arg1.field1783 = var6;
            return;
        }
        if (var6 > var3) {
            if (var4 < var5) {
                arg1.field1774 = 1280;
            } else if (var4 > var5) {
                arg1.field1774 = 1792;
            } else {
                arg1.field1774 = 1536;
            }
        } else if (var3 <= var6) {
            if (var5 > var4) {
                arg1.field1774 = 1024;
            } else if (var5 < var4) {
                arg1.field1774 = 0;
            }
        } else if (var5 > var4) {
            arg1.field1774 = 768;
        } else if (var4 > var5) {
            arg1.field1774 = 256;
        } else {
            arg1.field1774 = 512;
        }
        int var7 = arg1.field1774 - arg1.field1722 & 0x7FF;
        int var8 = arg1.field1737;
        int var9 = 4;
        if (arg1.field1774 != arg1.field1722 && arg1.field1733 == -1 && arg1.field1721 != 0) {
            var9 = 2;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1739;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1761;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1728;
        }
        if (arg1.field1794 > 2) {
            var9 = 6;
        }
        if (var8 == -1) {
            var8 = arg1.field1739;
        }
        if (arg0 != -2) {
            return;
        }
        arg1.field1785 = var8;
        if (arg1.field1794 > 3) {
            var9 = 8;
        }
        if (arg1.field1751 > 0 && arg1.field1794 > 1) {
            var9 = 8;
            arg1.field1751--;
        }
        if (arg1.field1764[arg1.field1794 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var5) {
            arg1.field1752 += var9;
            if (var5 < arg1.field1752) {
                arg1.field1752 = var5;
            }
        } else if (var4 > var5) {
            arg1.field1752 -= var9;
            if (arg1.field1752 < var5) {
                arg1.field1752 = var5;
            }
        }
        if (var9 >= 8 && arg1.field1785 == arg1.field1739 && arg1.field1773 != -1) {
            arg1.field1785 = arg1.field1773;
        }
        if (var6 > var3) {
            arg1.field1783 += var9;
            if (arg1.field1783 > var6) {
                arg1.field1783 = var6;
            }
        } else if (var3 > var6) {
            arg1.field1783 -= var9;
            if (var6 > arg1.field1783) {
                arg1.field1783 = var6;
            }
        }
        if (arg1.field1783 != var6 || arg1.field1752 != var5) {
            return;
        }
        arg1.field1794--;
        if (arg1.field1725 > 0) {
            arg1.field1725--;
            return;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILqe;)V", line = 349)
    public static final void method1095(int arg0, class103 arg1) {
        field3252++;
        int var2 = -1;
        int var3 = 0;
        if (arg1.field2438 == 0) {
            var3 = class81.field1967.method544(arg1.field2427, arg1.field2435, arg1.field2444);
        }
        if (arg0 != 1) {
            method1089(-50);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg1.field2438 == 1) {
            var3 = class81.field1967.method528(arg1.field2427, arg1.field2435, arg1.field2444);
        }
        if (arg1.field2438 == 2) {
            var3 = class81.field1967.method549(arg1.field2427, arg1.field2435, arg1.field2444);
        }
        if (arg1.field2438 == 3) {
            var3 = class81.field1967.method569(arg1.field2427, arg1.field2435, arg1.field2444);
        }
        if (var3 != 0) {
            int var6 = class81.field1967.method524(arg1.field2427, arg1.field2435, arg1.field2444, var3);
            var5 = var6 >> 6 & 0x3;
            var2 = var3 >> 14 & 0x7FFF;
            var4 = var6 & 0x1F;
        }
        arg1.field2420 = var4;
        arg1.field2440 = var2;
        arg1.field2418 = var5;
    }
}
