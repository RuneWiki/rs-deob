import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class96 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1873 = -2;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Loh;")
    public static class263 field1875 = class253.method1681(-128, "zap");

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lva;")
    public static class34 field1872 = new class34(0, 0);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Loh;")
    public static class263 field1877 = class253.method1681(-121, "null");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method666(int arg0) {
        if (arg0 != 0) {
            method668(-51);
        }
        field1871++;
        class92.field1818.method830(arg0 ^ 0x32);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method667(int arg0) {
        field1874++;
        for (class112 var1 = (class112) class182.field3300.method1878(true); var1 != null; var1 = (class112) class182.field3300.method1881(-82)) {
            class158 var3 = var1.field2109;
            if (class12.field321 != var3.field2866 || var3.field2848 < class228.field4012) {
                var1.method1614(-1204826926);
            } else if (var3.field2872 <= class228.field4012) {
                if (var3.field2859 > 0) {
                    class90 var4 = class31.field774[var3.field2859 - 1];
                    if (var4 != null && var4.field4688 >= 0 && var4.field4688 < 13312 && var4.field4705 >= 0 && var4.field4705 < 13312) {
                        var3.method1029(class120.method781(var3.field2866, var4.field4688, false, var4.field4705) - var3.field2840, var4.field4705, var4.field4688, 4205, class228.field4012);
                    }
                }
                if (var3.field2859 < 0) {
                    int var5 = -var3.field2859 - 1;
                    class137 var6;
                    if (class196.field3574 == var5) {
                        var6 = class229.field4018;
                    } else {
                        var6 = class151.field2725[var5];
                    }
                    if (var6 != null && var6.field4688 >= 0 && var6.field4688 < 13312 && var6.field4705 >= 0 && var6.field4705 < 13312) {
                        var3.method1029(class120.method781(var3.field2866, var6.field4688, false, var6.field4705) - var3.field2840, var6.field4705, var6.field4688, 4205, class228.field4012);
                    }
                }
                var3.method1031(class187.field3369, (byte) -75);
                class146.method963(class12.field321, (int) var3.field2853, (int) var3.field2863, (int) var3.field2869, 60, var3, var3.field2878, -1L, false);
            }
        }
        int var2 = 112 % ((14 - arg0) / 60);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1872 = null;
        if (arg0 == -32547) {
            field1875 = null;
            field1877 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public static final int method669(int arg0, int arg1) {
        field1876++;
        if (arg0 > arg1) {
            return 0;
        }
        class103 var2 = (class103) class184.field3327.method31(-32665, (long) arg1);
        if (var2 == null) {
            return class260.method1715(arg1, -22675).field4461;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1964.length; var4++) {
            if (var2.field1964[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class260.method1715(arg1, -22675).field4461 - var2.field1964.length);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
    public static final void method670(int arg0, int arg1, int arg2) {
        field1870++;
        if (arg1 == -5846 && class166.method1090((byte) -124, arg0)) {
            class92.method648((byte) 68, class164.field2974[arg0], arg2);
        }
    }
}
