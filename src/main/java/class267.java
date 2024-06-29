import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class267 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public static int[] field4455 = new int[] { 0, 0, -2, 0, 0, -1, 0, 8, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 24, 8, 8, 0, 7, 2, 0, 0, 0, 0, 0, -2, 0, 0, 8, 0, -2, 0, 0, 0, 8, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, -2, -1, 0, 0, 0, 12, 0, 2, 0, 12, 0, -1, 0, -1, 6, 0, 0, 0, 6, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 10, 0, 0, 5, 0, 0, 0, 0, 0, 3, 15, 0, 5, 3, 15, -1, 0, 0, 6, -1, 0, 0, 0, 0, 0, 0, 10, -2, -2, 0, -1, 0, 0, 1, 5, 0, 10, 20, 0, 4, 0, 0, 0, 0, -2, -2, -2, 0, 4, 0, -1, -2, -2, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 14, 0, 6, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 6, 0, 0, 14, 0, 0, 6, 1, 0, -1, 3, 2, 0, 0, 0, 0, -1, 3, -1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 5, 0, 0, 0, 4, 9, 0, 0, 0, 6, -1, 2, 7, 0, 0, 5, 0, 5, 1, 10, 2, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 10 };

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Z")
    public static boolean field4457 = false;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lqd;")
    public static class40 field4453 = class147.method1106("Nehmen", (byte) -127);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lqh;", line = 6)
    public static final class289 method1860(int arg0) {
        int var1 = -50 / ((7 - arg0) / 62);
        field4456++;
        try {
            return (class289) Class.forName("dj").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return new class29();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILsd;I)Lqd;", line = 19)
    public static final class40 method1861(int arg0, class26 arg1, int arg2) {
        field4454++;
        try {
            if (arg2 >= -17) {
                method1861(-61, (class26) null, 118);
            }
            class40 var3 = new class40();
            var3.field766 = arg1.method195((byte) 120);
            if (var3.field766 > arg0) {
                var3.field766 = arg0;
            }
            var3.field745 = new byte[var3.field766];
            arg1.field478 += class310.field5208.method996(var3.field766, -41, arg1.field472, 0, arg1.field478, var3.field745);
            return var3;
        } catch (Exception var5) {
            return class148.field2483;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 48)
    public static void method1862(int arg0) {
        field4455 = null;
        if (arg0 >= -27) {
            method1861(64, (class26) null, 27);
        }
        field4453 = null;
    }
}
