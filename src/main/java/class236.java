import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class236 extends class329 {

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "Ltb;")
    public static class450 field2951 = new class450(20);

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Z")
    public static boolean field2955 = true;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Lae;")
    public static class40 field2953 = new class40();

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "[Z")
    public static boolean[] field2954;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
    public static void method1419(boolean arg0) {
        if (arg0) {
            field2954 = null;
            field2953 = null;
            field2951 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(Z)Z")
    public static final boolean method1420(boolean arg0) {
        if (arg0) {
            method1420(false);
        }
        field2949++;
        return class496.method2671("jaclib", -114) ? class496.method2671("hw3d", -13) : false;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(II)V")
    public class236(int arg0, int arg1) {
        this.field2950 = arg0;
        this.field2952 = arg1;
    }
}
