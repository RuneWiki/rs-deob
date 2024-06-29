import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class128 {

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lid;")
    public static class60 field330 = class11.method72("(U(Y", (byte) 110);

    @OriginalMember(owner = "client!c", name = "G", descriptor = "[[I")
    public static int[][] field341 = new int[104][104];

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Lid;")
    private static class60 field329 = class11.method72("Nov", (byte) 99);

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lid;")
    private static class60 field336 = class11.method72("Apr", (byte) 104);

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lid;")
    private static class60 field338 = class11.method72("Sep", (byte) -61);

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lid;")
    private static class60 field344 = class11.method72("Jan", (byte) -68);

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Lid;")
    private static class60 field337 = class11.method72("Jul", (byte) 104);

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Lid;")
    private static class60 field351 = class11.method72("Dec", (byte) -122);

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field348 = -1;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lid;")
    private static class60 field343 = class11.method72("Oct", (byte) -96);

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Lid;")
    private static class60 field345 = class11.method72("May", (byte) 91);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Lid;")
    private static class60 field349 = class11.method72("Mar", (byte) 96);

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Lid;")
    private static class60 field357 = class11.method72("Jun", (byte) 114);

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "Lid;")
    public static class60 field360 = class11.method72("sch-Utteln:", (byte) 122);

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Lid;")
    private static class60 field359 = class11.method72("Aug", (byte) -93);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field355 = 0;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lid;")
    private static class60 field332 = class11.method72("Feb", (byte) 120);

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "[Lid;")
    public static class60[] field350 = new class60[] { field344, field332, field349, field336, field345, field357, field337, field359, field338, field343, field329, field351 };

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Le;")
    public static class29 field347;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lfd;")
    public class40 field339;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "Lfd;")
    public class40 field361;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "Lid;")
    public class60 field356;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "[Ljava/lang/Object;")
    public Object[] field353;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method123(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 > -17) {
            return;
        }
        field346++;
        if (class28.method209(arg5, -1)) {
            class39.field930 = null;
            class33.method252(4, class45.field1177[arg5], arg4, -1, arg7, arg0, arg8, arg2, arg6, arg3);
            if (class39.field930 != null) {
                class33.method252(4, class39.field930, arg4, -1412584499, arg7, class38.field916, arg8, arg2, class12.field228, arg3);
                class39.field930 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class14.field257[var9] = true;
            }
        } else {
            class14.field257[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Z")
    public static final boolean method124(byte arg0, int arg1) {
        field358++;
        if (arg0 >= -17) {
            method124((byte) 31, -83);
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method125(byte arg0) {
        field343 = null;
        field337 = null;
        field349 = null;
        field350 = null;
        field341 = null;
        field332 = null;
        field330 = null;
        if (arg0 != -82) {
            method123(-87, (byte) 104, 19, 34, 28, 46, -69, -65, -76);
        }
        field338 = null;
        field336 = null;
        field360 = null;
        field329 = null;
        field351 = null;
        field359 = null;
        field344 = null;
        field347 = null;
        field345 = null;
        field357 = null;
    }
}
