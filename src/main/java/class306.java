import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class306 {

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "[I")
    public static int[] field3999 = new int[5];

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Z")
    public static boolean field4000 = false;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field3993 = 1401;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lgl;")
    public static class547 field3996 = new class547(0, 7);

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 7)
    public static void method1748(int arg0) {
        field3999 = null;
        field3996 = null;
        if (arg0 > -94) {
            method1749(-41);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Ldv;", line = 22)
    public static final class601 method1749(int arg0) {
        field3994++;
        try {
            return new class401();
        } catch (Throwable var2) {
            try {
                if (arg0 != 0) {
                    field3995 = 27;
                }
                return (class601) Class.forName("r").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class192();
            }
        }
    }
}
