import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public abstract class class209 {

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Luq;")
    public class313 field2710;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Luv;")
    public static class3 field2711 = new class3(12, -1);

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Lim;")
    public static class353 field2712 = new class353(109, -1);

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[S")
    public static short[] field2714 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "J")
    public static long field2713 = 20000000L;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2715 = 1400;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "[Z")
    public static boolean[] field2709;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1332(int arg0) {
        field2709 = null;
        field2712 = null;
        field2711 = null;
        field2714 = null;
        if (arg0 != -8921) {
            field2715 = 105;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V")
    public abstract void method47(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
    public abstract void method43(int arg0);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lea;IZ)V")
    public abstract void method44(class148 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
    public abstract void method45(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(ZB)V")
    public abstract void method48(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z")
    public abstract boolean method42(boolean arg0);

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Luq;)V")
    public class209(class313 arg0) {
        this.field2710 = arg0;
    }
}
