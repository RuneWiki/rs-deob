import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class13 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[I")
    public static int[] field242 = new int[100];

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Z")
    public static boolean field245 = false;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lia;")
    public static class257 field243 = class28.method234(-107, "zap");

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[B")
    public static byte[] field252 = new byte[520];

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
    public static int[] field250 = new int[128];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lia;")
    public static class257 field253 = class28.method234(105, "M");

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lmb;")
    public static class178 field247;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[Lfe;")
    public static class155[] field254;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[Llc;")
    public static class90[] field248;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIIBI)Lte;")
    public static final class184 method133(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field246++;
        long var6 = ((long) arg1 << 16) + (long) arg5 + (arg0 ? 137438953472L : 0L) + (((long) arg2 << 38) - -((long) arg3 << 40));
        class184 var8 = (class184) class231.field3875.method836(-100, var6);
        if (var8 != null) {
            return var8;
        }
        class101.field1862 = false;
        if (arg4 > -120) {
            field252 = null;
        }
        class184 var9 = class93.method683(false, (byte) 80, arg5, arg0, arg3, arg2, false, arg1);
        if (var9 != null && !class101.field1862) {
            class231.field3875.method832(var9, var6, 0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method134(int arg0) {
        field254 = null;
        field248 = null;
        field242 = null;
        field247 = null;
        if (arg0 > -39) {
            field248 = null;
        }
        field253 = null;
        field243 = null;
        field252 = null;
        field250 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lqe;ILp;ILib;III)V")
    public static final void method135(class197 arg0, int arg1, class233 arg2, int arg3, class180 arg4, int arg5, int arg6, int arg7) {
        field251++;
        class103 var8 = new class103();
        var8.field1931 = arg3;
        var8.field1912 = arg1 * arg6;
        var8.field1932 = arg7 * 128;
        if (arg2 != null) {
            var8.field1929 = arg2.field3968;
            var8.field1927 = arg2.field3948;
            var8.field1908 = arg2.field3978;
            var8.field1928 = arg2.field3976 * 128;
            var8.field1930 = arg2;
            int var10 = arg2.field3950;
            var8.field1918 = arg2.field4010;
            int var11 = arg2.field3986;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg2.field3986;
                var11 = arg2.field3950;
            }
            var8.field1926 = (arg1 + var10) * 128;
            var8.field1922 = (arg7 + var11) * 128;
            if (arg2.field3952 != null) {
                var8.field1916 = true;
                var8.method748((byte) -126);
            }
            if (var8.field1918 != null) {
                var8.field1915 = (int) (Math.random() * (double) (var8.field1908 - var8.field1929)) + var8.field1929;
            }
            class174.field2979.method287(var8, 0);
            return;
        }
        if (arg0 != null) {
            var8.field1917 = arg0;
            class198 var9 = arg0.field3322;
            if (var9.field3393 != null) {
                var8.field1916 = true;
                var9 = var9.method1324((byte) 125);
            }
            if (var9 != null) {
                var8.field1926 = (var9.field3390 + arg1) * 128;
                var8.field1922 = (arg7 + var9.field3390) * 128;
                var8.field1927 = class199.method1339(arg0, 42);
                var8.field1928 = var9.field3366 * 128;
            }
            class233.field3974.method287(var8, 0);
            return;
        }
        if (arg4 == null) {
            return;
        }
        var8.field1926 = (arg4.field4128 + arg1) * 128;
        var8.field1920 = arg4;
        var8.field1922 = (arg4.field4128 + arg7) * 128;
        var8.field1927 = class120.method846(0, arg4);
        var8.field1928 = arg4.field3125 * 128;
        class79.field1553.method424(var8, (byte) -40, arg4.field3140.method1668(arg6 ^ 0xED));
        return;
    }
}
