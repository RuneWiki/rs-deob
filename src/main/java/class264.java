import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class264 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Z")
    public static boolean field3877 = true;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ljp;")
    public static class241 field3874 = new class241(5000);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Ltn;")
    public static class60 field3878 = new class60(70, 3);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1677(byte arg0) {
        class427.field6009 = class455.method2663(8, arg0 + 15127, 0.4F, 35, 8, 4, true, 2048);
        if (arg0 != 100) {
            field3879 = -74;
        }
        field3875++;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 19)
    public static void method1678(byte arg0) {
        field3874 = null;
        if (arg0 == -113) {
            field3878 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method1679(boolean arg0) {
        field3876++;
        class45 var1 = class354.method2094(0, (byte) -26, 15);
        var1.method261(4);
        if (arg0) {
            method1680(null, -78, -122, 0, null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Li;III[Z)V", line = 43)
    public static final void method1680(class31 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class60.field743 == class330.field4818) {
            return;
        }
        int var5 = class68.field858[arg1].method11(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class38 var7 = class68.field858[var6];
                if (var7 != null) {
                    var7.method8(arg0, arg2, var5 - var7.method11(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
