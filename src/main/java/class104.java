import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class104 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lqf;")
    public static class117 field2505 = class72.method514(109, ")1j");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lqf;")
    private static class117 field2510 = class72.method514(119, "Connection lost");

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
    public static int[] field2515 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2519 = 1;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lqf;")
    public static class117 field2516 = class72.method514(109, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lqf;")
    private static class117 field2521 = class72.method514(102, "Report abuse");

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lqf;")
    public static class117 field2508 = field2510;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lqf;")
    private static class117 field2506 = class72.method514(127, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lqf;")
    public static class117 field2512 = field2521;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lqf;")
    public static class117 field2520 = field2506;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lqf;")
    public static class117 field2517 = class72.method514(114, "Icons redrawn");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "J")
    public static long field2511;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
    public static final int method798(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1899) {
            method800(false);
        }
        field2522++;
        int var4 = 256 - arg1;
        return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + ((arg2 & 0xFF00) * arg1) & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lmf;I)Lmf;")
    public static final class89 method799(class89 arg0, int arg1) {
        if (arg1 <= 102) {
            return null;
        }
        field2507++;
        class89 var2 = class5.method23(arg0, 25157);
        if (var2 == null) {
            var2 = arg0.field2056;
        }
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method800(boolean arg0) {
        field2513++;
        try {
            if (!arg0) {
                method801(28, 76);
            }
            Graphics var1 = class3.field64.getGraphics();
            class53.field1101.method210(17, 357, (byte) 78, var1);
        } catch (Exception var2) {
            class3.field64.repaint();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lmf;")
    public static final class89 method801(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        field2523++;
        int var3 = arg0 & 0xFFFF;
        if (arg1 >= -47) {
            return null;
        }
        if (class141.field3426[var2] == null || class141.field3426[var2][var3] == null) {
            boolean var4 = class26.method201(var2, 314356016);
            if (!var4) {
                return null;
            }
        }
        return class141.field3426[var2][var3];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method802(byte arg0) {
        field2510 = null;
        field2520 = null;
        field2516 = null;
        field2505 = null;
        if (arg0 != -62) {
            field2508 = null;
        }
        field2521 = null;
        field2508 = null;
        field2506 = null;
        field2517 = null;
        field2512 = null;
        field2515 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method424(byte arg0, Component arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method425(Component arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)I")
    public abstract int method426(byte arg0);
}
