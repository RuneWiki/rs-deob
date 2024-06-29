import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class135 extends class271 {

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    private final int field2420;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    private final int field2415;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    private final int field2414;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    private final int field2423;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Lmb;")
    public static class96 field2426 = class243.method1708("::rebuild", (byte) 94);

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lha;")
    public static class22 field2417 = new class22(16);

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lmb;")
    private static class96 field2427 = class243.method1708("Cancel", (byte) 112);

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field2431 = 0;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Lmb;")
    public static class96 field2428 = field2427;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Z")
    public static boolean field2430 = false;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[Lw;")
    public static class107[] field2432;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[[S")
    public static short[][] field2429;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILrg;)Lgf;")
    public static final class101 method1007(int arg0, class239 arg1) {
        if (arg0 != -1) {
            field2432 = null;
        }
        ++field2421;
        return new class101(arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1660(-335289648), arg1.method1660(-335289648), arg1.method1651(arg0 ^ -4140));
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIII)V")
    public class135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2420 = arg2;
        this.field2415 = arg1;
        this.field2414 = arg3;
        this.field2423 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        ++field2422;
        int var1 = class163.field2891;
        int var2 = class215.field3697;
        if (arg0 != 0) {
            field2427 = null;
        }
        int var3 = -class232.field3979 + -var1 + class5.field109;
        int var4 = -class168.field2954 + class162.field2880 + -var2;
        if (~var1 < -1 || ~var3 < -1 || ~var2 < -1 || ~var4 < -1) {
            try {
                Container var5;
                if (class207.field3571 != null) {
                    var5 = class207.field3571;
                } else if (class103.field1743 == null) {
                    var5 = class234.field4017.field2277;
                } else {
                    var5 = class103.field1743;
                }
                int var6 = 0;
                int var7 = 0;
                if (class103.field1743 == var5) {
                    Insets var8 = class103.field1743.getInsets();
                    var7 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (~var1 < -1) {
                    var9.fillRect(var6, var7, var1, class162.field2880);
                }
                if (~var2 < -1) {
                    var9.fillRect(var6, var7, class5.field109, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(class5.field109 + var6 + -var3, var7, var3, class162.field2880);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, var7 - (-class162.field2880 - -var4), class5.field109, var4);
                    return;
                }
            } catch (Exception var10) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method1009(byte arg0) {
        if (arg0 == 3) {
            if (class80.field1362 != null) {
                class80.field1362.method538(500000);
            }
            if (class20.field335 != null) {
                class20.field335.method538(500000);
            }
            ++field2424;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)V")
    public final void method769(int arg0, int arg1, int arg2) {
        ++field2416;
        if (arg1 == 100) {
            int var4 = this.field2423 * arg0 >> 12;
            int var5 = this.field2420 * arg0 >> 12;
            int var6 = this.field2415 * arg2 >> 12;
            int var7 = this.field2414 * arg2 >> 12;
            class203.method1417(var6, var5, var4, -46, var7, super.field4714);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lw;IZIBI)V")
    public static final void method1010(class107[] arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        ++field2419;
        for (int var6 = 0; arg0.length > var6; ++var6) {
            class107 var7 = arg0[var6];
            if (var7 != null && var7.field1827 == arg3) {
                class187.method1323(0, arg1, var7, arg2, arg5);
                class272.method1853(var7, arg1, arg5, 2);
                if (~var7.field1934 < ~(-var7.field1919 + var7.field1850)) {
                    var7.field1934 = var7.field1850 - var7.field1919;
                }
                if (var7.field1937 > -var7.field1856 + var7.field1828) {
                    var7.field1937 = -var7.field1856 + var7.field1828;
                }
                if (~var7.field1934 > -1) {
                    var7.field1934 = 0;
                }
                if (var7.field1937 < 0) {
                    var7.field1937 = 0;
                }
                if (var7.field1833 == 0) {
                    class148.method1092(var7, arg2, false);
                }
            }
        }
        if (arg4 != -97) {
            field2428 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2428 = null;
        field2432 = null;
        field2427 = null;
        field2426 = null;
        field2429 = null;
        field2417 = null;
        if (arg0 != -12983) {
            field2429 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        ++field2425;
        if (arg0 != 3298) {
            method1011(-68);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
    public final void method766(int arg0, byte arg1, int arg2) {
        ++field2418;
        int var4 = 78 / ((arg1 - 54) / 59);
    }
}
