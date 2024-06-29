import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class114 extends class129 {

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    private final int field2284;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    private final int field2281;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    private final int field2283;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    private final int field2286;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "Lcc;")
    public static class209 field2287 = class95.method669(111, "glissement:");

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lla;")
    public static class95 field2282 = new class95(20);

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Lta;")
    public static class255 field2288 = new class255(8);

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "Lcc;")
    public static class209 field2289 = null;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "Lcc;")
    public static class209 field2290 = class95.method669(100, "http:)4)4");

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lsj;")
    public static class49 field2279;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIII)V")
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2284 = arg0;
        this.field2281 = arg1;
        this.field2283 = arg2;
        this.field2286 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        ++field2285;
        if (arg0 >= -106) {
            this.method100(64, 77, -9);
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        if (arg1 == 100) {
            ++field2276;
            int var4 = this.field2284 * arg2 >> 12;
            int var5 = this.field2283 * arg2 >> 12;
            int var6 = this.field2281 * arg0 >> 12;
            int var7 = this.field2286 * arg0 >> 12;
            class34.method267(var7, var5, var4, arg1 + 1954147581, var6, super.field2475);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lck;IIIBLek;ILde;)V")
    public static final void method810(class218 arg0, int arg1, int arg2, int arg3, byte arg4, class163 arg5, int arg6, class108 arg7) {
        class92 var8 = new class92();
        ++field2280;
        if (arg4 > 78) {
            var8.field1828 = arg6 * 128;
            var8.field1825 = arg3;
            var8.field1820 = arg1 * 128;
            if (arg0 == null) {
                if (arg5 == null) {
                    if (arg7 != null) {
                        var8.field1818 = arg7;
                        var8.field1813 = 128 * (arg6 - -arg7.method577((byte) -51));
                        var8.field1827 = (arg7.method577((byte) -83) + arg1) * 128;
                        var8.field1812 = class200.method1369(arg7, -101);
                        var8.field1831 = arg7.field2150 * 128;
                        class210.field3823.method1762(var8, arg7.field2140.method1448(true), (byte) 73);
                        return;
                    }
                } else {
                    class237 var9 = arg5.field2969;
                    var8.field1829 = arg5;
                    if (var9.field4295 != null) {
                        var8.field1814 = true;
                        var9 = var9.method1636(84);
                    }
                    if (var9 != null) {
                        var8.field1827 = (var9.field4277 + arg1) * 128;
                        var8.field1813 = (var9.field4277 + arg6) * 128;
                        var8.field1812 = class210.method1494(-111, arg5);
                        var8.field1831 = var9.field4252 * 128;
                    }
                    class87.field1722.method1123(var8, (byte) -127);
                }
            } else {
                var8.field1826 = arg0.field3934;
                var8.field1816 = arg0.field3931;
                var8.field1817 = arg0.field3980;
                int var10 = arg0.field3916;
                int var11 = arg0.field3912;
                if (~arg2 == -2 || arg2 == 3) {
                    var11 = arg0.field3916;
                    var10 = arg0.field3912;
                }
                var8.field1831 = arg0.field3976 * 128;
                var8.field1812 = arg0.field3923;
                var8.field1813 = (arg6 - -var10) * 128;
                var8.field1827 = (arg1 + var11) * 128;
                var8.field1821 = arg0;
                if (arg0.field3917 != null) {
                    var8.field1814 = true;
                    var8.method647(0);
                }
                if (var8.field1817 != null) {
                    var8.field1810 = (int) ((double) (-var8.field1826 + var8.field1816) * Math.random()) + var8.field1826;
                }
                class273.field4846.method1123(var8, (byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
    public final void method96(int arg0, int arg1, int arg2) {
        ++field2278;
        int var4 = this.field2284 * arg0 >> 12;
        int var5 = this.field2283 * arg0 >> 12;
        int var6 = 82 / ((arg2 - 37) / 32);
        int var7 = this.field2281 * arg1 >> 12;
        int var8 = this.field2286 * arg1 >> 12;
        class165.method1145(var8, super.field2478, var7, super.field2475, 32767, super.field2481, var4, var5);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method811(int arg0) {
        field2282 = null;
        field2289 = null;
        field2279 = null;
        field2288 = null;
        if (arg0 >= -119) {
            method811(-14);
        }
        field2287 = null;
        field2290 = null;
    }
}
