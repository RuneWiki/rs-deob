import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class148 {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Z")
    public static boolean field2712 = false;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lcc;")
    public static class209 field2716 = class95.method669(103, "<img=0>");

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)I")
    public static final int method1028(byte arg0, int arg1) {
        field2711++;
        return arg0 == -22 ? arg1 >>> 8 : -74;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field2716 = null;
        if (arg0 < 15) {
            method1032(78, -90);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lgi;")
    public static final class155 method1030(int arg0, int arg1) {
        field2714++;
        class155 var2 = (class155) class62.field1230.method670((byte) -99, (long) arg0);
        if (arg1 != 3) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class175.field3184.method353(arg0, arg1 ^ 0x64, 4);
            class155 var4 = new class155();
            if (var3 != null) {
                var4.method1089(arg0, true, new class106(var3));
            }
            class62.field1230.method673((long) arg0, -5087, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
    public static final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -76) {
            method1032(34, -35);
        }
        field2709++;
        class195 var5 = class178.method1229(arg2, 10, 91);
        var5.method1338(0);
        var5.field3511 = arg4;
        var5.field3506 = arg3;
        var5.field3503 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Lig;")
    public static final class9 method1032(int arg0, int arg1) {
        field2717++;
        class9 var2 = (class9) class286.field5040.method670((byte) -99, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field2279.method353(arg0, arg1 + 110, arg1);
        class9 var4 = new class9();
        if (var3 != null) {
            var4.method84(new class106(var3), (byte) -104);
        }
        class286.field5040.method673((long) arg0, -5087, var4);
        return var4;
    }
}
