import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class106 extends class81 {

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lrd;")
    private static class173 field1978 = class133.method843("scroll:", 15);

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lrd;")
    public static class173 field1981 = field1978;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lrd;")
    public static class173 field1979 = field1978;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
    public static boolean field1982 = false;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Llc;")
    public static class112 field1976 = new class112(4096);

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lrd;")
    public static class173 field1985 = class133.method843(" )2> <col=ff9040>", -102);

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "[I")
    public static int[] field1986 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1985 = null;
        field1978 = null;
        field1981 = null;
        field1976 = null;
        field1986 = null;
        if (arg0 != -2) {
            field1986 = null;
        }
        field1979 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[BBI)Lrd;")
    public static final class173 method652(int arg0, byte[] arg1, byte arg2, int arg3) {
        field1977++;
        class173 var4 = new class173();
        if (arg2 <= 27) {
            field1981 = null;
        }
        var4.field3379 = 0;
        var4.field3415 = new byte[arg3];
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field3415[var4.field3379++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Loh;Z)V")
    public static final void method653(class147 arg0, boolean arg1) {
        field1975++;
        if (arg0.field2787 == 0) {
            return;
        }
        if (!arg1) {
            field1983 = 26;
        }
        if (arg0.field2818 != -1 && arg0.field2818 < 32768) {
            class120 var2 = client.field632[arg0.field2818];
            if (var2 != null) {
                int var3 = arg0.field2820 - var2.field2820;
                int var4 = arg0.field2801 - var2.field2801;
                if (var3 != 0 || var4 != 0) {
                    arg0.field2794 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2818 >= 32768) {
            int var5 = arg0.field2818 - 32768;
            if (class33.field733 == var5) {
                var5 = 2047;
            }
            class212 var6 = class183.field3600[var5];
            if (var6 != null) {
                int var7 = arg0.field2820 - var6.field2820;
                int var8 = arg0.field2801 - var6.field2801;
                if (var7 != 0 || var8 != 0) {
                    arg0.field2794 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2756 != 0 || arg0.field2770 != 0) && (arg0.field2780 == 0 || arg0.field2775 > 0)) {
            int var9 = arg0.field2820 - (arg0.field2756 - class108.field2024 - class108.field2024) * 64;
            int var10 = arg0.field2801 - (arg0.field2770 - class43.field874 - class43.field874) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field2794 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2756 = 0;
            arg0.field2770 = 0;
        }
        int var11 = arg0.field2794 - arg0.field2786 & 0x7FF;
        if (var11 == 0) {
            arg0.field2791 = 0;
            return;
        }
        arg0.field2791++;
        if (var11 > 1024) {
            arg0.field2786 -= arg0.field2787;
            boolean var12 = true;
            if (arg0.field2787 > var11 || 2048 - arg0.field2787 < var11) {
                var12 = false;
                arg0.field2786 = arg0.field2794;
            }
            if (arg0.field2815 == arg0.field2762 && (arg0.field2791 > 25 || var12)) {
                if (arg0.field2804 == -1) {
                    arg0.field2762 = arg0.field2811;
                } else {
                    arg0.field2762 = arg0.field2804;
                }
            }
        } else {
            arg0.field2786 += arg0.field2787;
            boolean var13 = true;
            if (arg0.field2787 > var11 || 2048 - arg0.field2787 < var11) {
                var13 = false;
                arg0.field2786 = arg0.field2794;
            }
            if (arg0.field2815 == arg0.field2762 && (arg0.field2791 > 25 || var13)) {
                if (arg0.field2796 == -1) {
                    arg0.field2762 = arg0.field2811;
                } else {
                    arg0.field2762 = arg0.field2796;
                }
            }
        }
        arg0.field2786 &= 0x7FF;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
    public static final boolean method654(byte arg0) {
        if (arg0 != 84) {
            return false;
        }
        field1980++;
        try {
            if (class55.field1097 == 2) {
                if (class208.field4053 == null) {
                    class208.field4053 = class218.method1422(class12.field192, class194.field3761, class134.field2535);
                    if (class208.field4053 == null) {
                        return false;
                    }
                }
                if (class5.field122 == null) {
                    class5.field122 = new class151(class166.field3187, class161.field3005);
                }
                if (class21.field467.method89(22050, class5.field122, arg0 + 1271549020, class208.field4053, class34.field749)) {
                    class21.field467.method83(arg0 ^ 0x19F3);
                    class21.field467.method110(false, class28.field570);
                    class21.field467.method111(class193.field3749, 0, class208.field4053);
                    class208.field4053 = null;
                    class5.field122 = null;
                    class55.field1097 = 0;
                    class12.field192 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class21.field467.method99((byte) -126);
            class55.field1097 = 0;
            class208.field4053 = null;
            class5.field122 = null;
            class12.field192 = null;
        }
        return false;
    }
}
