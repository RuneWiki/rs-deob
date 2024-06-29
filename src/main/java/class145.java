import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class145 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
    public static int[] field3296 = new int[5];

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lec;")
    private static class32 field3302 = class73.method594("Unable to connect)3", true);

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3301 = 0;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[Z")
    public static boolean[] field3299 = new boolean[100];

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lec;")
    public static class32 field3307 = class73.method594(" Sekunde(Xn(Y -Ubertragen)3", true);

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lec;")
    public static class32 field3304 = field3302;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lec;")
    public static class32 field3306 = class73.method594("<img=1>", true);

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lec;")
    public static class32 field3309 = class73.method594(":assist:", true);

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lec;")
    public static class32 field3298 = field3302;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1088(int arg0) {
        field3302 = null;
        field3299 = null;
        field3296 = null;
        field3306 = null;
        field3304 = null;
        if (arg0 != 1536) {
            field3298 = null;
        }
        field3307 = null;
        field3309 = null;
        field3298 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method455(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lqd;I)V")
    public static final void method1089(class115 arg0, int arg1) {
        arg0.field2710 = arg0.field2689;
        field3300++;
        if (arg0.field2698 == 0) {
            arg0.field2696 = 0;
            return;
        }
        if (~arg0.field2714 != arg1 && arg0.field2717 == 0) {
            class149 var2 = class97.method762((byte) 118, arg0.field2714);
            if (arg0.field2750 > 0 && var2.field3384 == 0) {
                arg0.field2696++;
                return;
            }
            if (arg0.field2750 <= 0 && var2.field3383 == 0) {
                arg0.field2696++;
                return;
            }
        }
        int var3 = arg0.field2749;
        int var4 = arg0.field2700;
        int var5 = arg0.field2738[arg0.field2698 - 1] * 128 + arg0.field2713 * 64;
        int var6 = arg0.field2761[arg0.field2698 - 1] * 128 + arg0.field2713 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field2749 = var6;
            arg0.field2700 = var5;
            return;
        }
        if (var6 <= var3) {
            if (var6 >= var3) {
                if (var5 > var4) {
                    arg0.field2744 = 1024;
                } else if (var5 < var4) {
                    arg0.field2744 = 0;
                }
            } else if (var5 > var4) {
                arg0.field2744 = 768;
            } else if (var5 < var4) {
                arg0.field2744 = 256;
            } else {
                arg0.field2744 = 512;
            }
        } else if (var4 < var5) {
            arg0.field2744 = 1280;
        } else if (var4 <= var5) {
            arg0.field2744 = 1536;
        } else {
            arg0.field2744 = 1792;
        }
        int var7 = 4;
        boolean var8 = true;
        int var9 = arg0.field2744 - arg0.field2747 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        int var10 = arg0.field2736;
        if (var9 >= -256 && var9 <= 256) {
            var10 = arg0.field2711;
        } else if (var9 >= 256 && var9 < 768) {
            var10 = arg0.field2731;
        } else if (var9 >= -768 && var9 <= -256) {
            var10 = arg0.field2725;
        }
        if (var10 == -1) {
            var10 = arg0.field2711;
        }
        arg0.field2710 = var10;
        if (arg0 instanceof class111) {
            var8 = ((class111) arg0).field2597.field2243;
        }
        if (var8) {
            if (arg0.field2747 != arg0.field2744 && arg0.field2758 == -1 && arg0.field2695 != 0) {
                var7 = 2;
            }
            if (arg0.field2698 > 2) {
                var7 = 6;
            }
            if (arg0.field2698 > 3) {
                var7 = 8;
            }
            if (arg0.field2696 > 0 && arg0.field2698 > 1) {
                var7 = 8;
                arg0.field2696--;
            }
        } else {
            if (arg0.field2698 > 1) {
                var7 = 6;
            }
            if (arg0.field2698 > 2) {
                var7 = 8;
            }
            if (arg0.field2696 > 0 && arg0.field2698 > 1) {
                var7 = 8;
                arg0.field2696--;
            }
        }
        if (arg0.field2735[arg0.field2698 - 1]) {
            var7 <<= 0x1;
        }
        if (var3 < var6) {
            arg0.field2749 += var7;
            if (arg0.field2749 > var6) {
                arg0.field2749 = var6;
            }
        } else if (var3 > var6) {
            arg0.field2749 -= var7;
            if (arg0.field2749 < var6) {
                arg0.field2749 = var6;
            }
        }
        if (var7 >= 8 && arg0.field2711 == arg0.field2710 && arg0.field2707 != -1) {
            arg0.field2710 = arg0.field2707;
        }
        if (var5 > var4) {
            arg0.field2700 += var7;
            if (var5 < arg0.field2700) {
                arg0.field2700 = var5;
            }
        } else if (var5 < var4) {
            arg0.field2700 -= var7;
            if (var5 > arg0.field2700) {
                arg0.field2700 = var5;
            }
        }
        if (arg0.field2749 == var6 && arg0.field2700 == var5) {
            if (arg0.field2750 > 0) {
                arg0.field2750--;
            }
            arg0.field2698--;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
    public abstract int method457(byte arg0);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lf;B)Lf;")
    public static final class36 method1090(class36 arg0, byte arg1) {
        field3297++;
        class36 var2 = class15.method111(1442844045, arg0);
        int var3 = 66 / ((12 - arg1) / 33);
        if (var2 == null) {
            var2 = arg0.field825;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method456(int arg0, Component arg1);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
    public static final boolean method1091(byte arg0) {
        field3308++;
        class80 var1 = class38.field920;
        synchronized (class38.field920) {
            if (class39.field937 == class1.field8) {
                return false;
            }
            int var3 = 44 % ((-arg0 - 65) / 59);
            class13.field224 = class144.field3287[class1.field8];
            class109.field2564 = class106.field2520[class1.field8];
            class1.field8 = class1.field8 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZB)Lec;")
    public static final class32 method1092(int arg0, boolean arg1, byte arg2) {
        if (arg2 != -90) {
            field3302 = null;
        }
        field3305++;
        return class124.method977(10, 0, arg0, arg1);
    }
}
