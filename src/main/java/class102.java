import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class102 extends class282 {

    @OriginalMember(owner = "client!ok", name = "qb", descriptor = "Lke;")
    public static class256 field1836 = class58.method460(160, 471462887);

    @OriginalMember(owner = "client!ok", name = "tb", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!ok", name = "vb", descriptor = "[[B")
    public static byte[][] field1841 = new byte[50][];

    @OriginalMember(owner = "client!ok", name = "xb", descriptor = "[Lke;")
    public static class256[] field1843 = new class256[100];

    @OriginalMember(owner = "client!ok", name = "ub", descriptor = "[I")
    public static int[] field1840 = new int[100];

    @OriginalMember(owner = "client!ok", name = "yb", descriptor = "Lke;")
    private static class256 field1844 = class316.method2202("Drop", 27626);

    @OriginalMember(owner = "client!ok", name = "wb", descriptor = "Lke;")
    public static class256 field1842 = field1844;

    @OriginalMember(owner = "client!ok", name = "rb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1837 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ok", name = "zb", descriptor = "Lke;")
    public static class256 field1845 = class316.method2202(" )2> <col=ffff00>", 27626);

    @OriginalMember(owner = "client!ok", name = "jb", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ok", name = "kb", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ok", name = "lb", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ok", name = "mb", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ok", name = "nb", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ok", name = "ob", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ok", name = "pb", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ok", name = "sb", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ok", name = "Ab", descriptor = "[Lab;")
    public static class290[] field1846;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILla;)V", line = 8)
    public static final void method734(int arg0, int arg1, int arg2, class188 arg3) {
        field1838++;
        if (class240.field4096 != null || class73.field1341 || arg3 == null || class54.method427(arg3, (byte) 122) == null) {
            return;
        }
        class240.field4096 = arg3;
        class260.field4492 = class54.method427(arg3, (byte) 86);
        class292.field5056 = false;
        class75.field1426 = arg1;
        class117.field2047 = arg0;
        class116.field2036 = 0;
        if (arg2 != -5779) {
            field1845 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)[[I", line = 36)
    public final int[][] method55(int arg0, int arg1) {
        field1833++;
        int[][] var3 = this.field3169.method463(arg1, arg0 ^ 0x4A);
        if (this.field3169.field1080 && this.method1973(-1)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg1 % this.field4909 * this.field4909;
            for (int var8 = 0; var8 < class161.field2858; var8++) {
                int var9 = this.field4899[var8 % this.field4904 + var7];
                var6[var8] = class150.method1123(var9 << 4, 4080);
                var4[var8] = class150.method1123(var9, 65280) >> 4;
                var5[var8] = class150.method1123(16711680, var9) >> 12;
            }
        }
        if (arg0 != 75) {
            method741(29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lke;Lke;ILke;Z)V", line = 79)
    public static final void method735(class256 arg0, class256 arg1, int arg2, class256 arg3, boolean arg4) {
        field1834++;
        class28.method206(arg2, arg0, arg3, -1, (byte) -84, arg1);
        if (arg4) {
            method736((class144) null, -30);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lrb;I)V", line = 91)
    public static final void method736(class144 arg0, int arg1) {
        class187 var2 = (class187) class31.field498.method1744((byte) 127, arg0.field2532.method1780(true));
        field1831++;
        if (arg1 != -5996) {
            method739(-96);
        }
        if (var2 == null) {
            return;
        }
        if (var2.field3276 != null) {
            class197.field3603.method2237(var2.field3276);
            var2.field3276 = null;
        }
        var2.method1199(21966);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)Lke;", line = 116)
    public static final class256 method737(int arg0, int arg1) {
        field1835++;
        return arg0 == 16739446 ? class30.method214(new class256[] { class305.method2125((byte) 73, arg1 >> 24 & 0xFF), class308.field5327, class305.method2125((byte) 61, (arg1 & 0xFF6C76) >> 16), class308.field5327, class305.method2125((byte) 34, (arg1 & 0xFFAE) >> 8), class308.field5327, class305.method2125((byte) 101, arg1 & 0xFF) }, 29784) : (class256) null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIZIIIII)V", line = 127)
    public static final void method738(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1832++;
        if (class298.method2087(arg6, 20330)) {
            class206.field3726 = null;
            if (arg3) {
                class11.method68(arg4, arg8, arg0, class50.field921[arg6], -1, arg7, -37, arg5, arg1, arg2);
                if (class206.field3726 != null) {
                    class11.method68(class267.field4571, arg8, arg0, class206.field3726, -1412584499, arg7, 39, class167.field2958, arg1, arg2);
                    class206.field3726 = null;
                }
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class53.field974[var9] = true;
            }
        } else {
            class53.field974[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "(I)V", line = 164)
    public static void method739(int arg0) {
        if (arg0 <= 116) {
            return;
        }
        field1843 = null;
        field1842 = null;
        field1837 = null;
        field1845 = null;
        field1846 = null;
        field1844 = null;
        field1836 = null;
        field1841 = (byte[][]) null;
        field1840 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIBIIIII)V", line = 182)
    public static final void method740(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class244.field4161 <= arg0 && class175.field3106 >= arg0 && arg7 >= class244.field4161 && arg7 <= class175.field3106 && arg1 >= class244.field4161 && class175.field3106 >= arg1 && class244.field4161 <= arg2 && arg2 <= class175.field3106 && class105.field1887 <= arg6 && class274.field4748 >= arg6 && arg8 >= class105.field1887 && class274.field4748 >= arg8 && class105.field1887 <= arg3 && arg3 <= class274.field4748 && class105.field1887 <= arg9 && arg9 <= class274.field4748) {
            class261.method1832(arg8, arg9, arg3, arg6, arg7, arg5, arg0, false, arg2, arg1);
        } else {
            class156.method1157(-1782389588, arg0, arg8, arg7, arg9, arg2, arg3, arg5, arg6, arg1);
        }
        if (arg4 <= 32) {
            field1846 = (class290[]) null;
        }
        field1829++;
    }

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "(I)V", line = 200)
    public static final void method741(int arg0) {
        field1830++;
        class25.field325.method2084(-29);
        if (arg0 != 0) {
            field1846 = (class290[]) null;
        }
    }
}
