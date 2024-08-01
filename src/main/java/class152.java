import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qd")
public class class152 {

    @OriginalMember(owner = "qd", name = "a", descriptor = "Llf;")
    public static class109 field2905 = class35.method275("Bitte versuchen Sie es in ", 2);

    @OriginalMember(owner = "qd", name = "c", descriptor = "Llf;")
    public static class109 field2907 = class35.method275("Bitte benutzen Sie eine andere Welt)3", 2);

    @OriginalMember(owner = "qd", name = "e", descriptor = "Llf;")
    private static class109 field2909 = class35.method275("Loaded sprites", 2);

    @OriginalMember(owner = "qd", name = "d", descriptor = "Llf;")
    public static class109 field2908 = field2909;

    @OriginalMember(owner = "qd", name = "f", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "qd", name = "b", descriptor = "[Lkf;")
    public static class100[] field2906;

    @OriginalMember(owner = "qd", name = "a", descriptor = "(I)V")
    public static void method1046(int arg0) {
        if (arg0 < 14) {
            method1046(12);
        }
        field2906 = null;
        field2908 = null;
        field2909 = null;
        field2905 = null;
        field2907 = null;
    }

    @OriginalMember(owner = "qd", name = "a", descriptor = "(IIILi;II)V")
    public static final void method1047(int arg0, int arg1, int arg2, class78 arg3, int arg4, int arg5) {
        field2910++;
        if (arg1 >= -8) {
            field2905 = null;
        }
        class91 var6 = new class91();
        var6.field1863 = arg2 * 128;
        var6.field1879 = arg3.field1514;
        var6.field1882 = arg3.field1548 * 128;
        var6.field1880 = arg3.field1545;
        int var7 = arg3.field1498;
        var6.field1865 = arg3.field1557;
        var6.field1874 = arg5 * 128;
        var6.field1885 = arg4;
        int var8 = arg3.field1501;
        var6.field1884 = arg3.field1534;
        if (arg0 == 1 || arg0 == 3) {
            var8 = arg3.field1498;
            var7 = arg3.field1501;
        }
        var6.field1881 = (arg2 + var7) * 128;
        var6.field1878 = (arg5 + var8) * 128;
        if (arg3.field1528 != null) {
            var6.field1871 = arg3;
            var6.method664(0);
        }
        class148.field2854.method1231(var6, 0);
        if (var6.field1880 != null) {
            var6.field1873 = var6.field1879 + (int) ((double) (var6.field1884 - var6.field1879) * Math.random());
        }
    }
}
