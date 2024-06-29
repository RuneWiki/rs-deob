import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class149 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2092 = -1;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[Lbb;")
    public static class182[] field2093 = new class182[14];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Z")
    public static boolean field2095 = false;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "F")
    public static float field2089;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 4)
    public static final void method888(int arg0) {
        field2090++;
        class219 var1 = (class219) class327.field4643.method1124(-1);
        if (arg0 != 8382) {
            field2093 = null;
        }
        while (var1 != null) {
            if (var1.field2996 > 0) {
                var1.field2996--;
            }
            if (var1.field2996 != 0) {
                if (var1.field2994 > 0) {
                    var1.field2994--;
                }
                if (var1.field2994 == 0 && var1.field3005 >= 1 && var1.field2995 >= 1 && var1.field3005 <= (class279.field3935 - 2) && var1.field2995 <= (class164.field2287 - 2) && (var1.field3004 < 0 || class119.method675(var1.field3004, var1.field3011, 16628))) {
                    class78.method440(var1.field2998, (byte) -28, -1, var1.field3000, var1.field3005, var1.field3003, var1.field2995, var1.field3011, var1.field3004);
                    var1.field2994 = -1;
                    if (var1.field3006 == var1.field3004 && var1.field3006 == -1) {
                        var1.method2290((byte) 98);
                    } else if (var1.field3006 == var1.field3004 && var1.field3003 == var1.field2997 && var1.field3011 == var1.field3007) {
                        var1.method2290((byte) 98);
                    }
                }
            } else if (var1.field3006 < 0 || class119.method675(var1.field3006, var1.field3007, 16628)) {
                class78.method440(var1.field2998, (byte) -28, -1, var1.field3000, var1.field3005, var1.field2997, var1.field2995, var1.field3007, var1.field3006);
                var1.method2290((byte) 98);
            }
            var1 = (class219) class327.field4643.method1119(false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 59)
    public static void method889(int arg0) {
        if (arg0 != -28497) {
            method888(90);
        }
        field2093 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lgk;", line = 70)
    public static final class278 method890(byte arg0) {
        field2091++;
        if (class106.field1208 == null || class95.field1067 == null) {
            return null;
        }
        class95.field1067.method598(65535, class106.field1208);
        class278 var1 = (class278) class95.field1067.method602((byte) 113);
        if (var1 == null) {
            return null;
        } else {
            int var2 = -8 % ((arg0 - 77) / 46);
            class290 var3 = class117.method661((byte) 110, var1.field3920);
            return var3 != null && var3.field4134 && var3.method1853(-7348) ? var1 : class93.method499(7);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 113)
    public static final void method891() {
        class235.method1499(1, class52.field594);
    }
}
