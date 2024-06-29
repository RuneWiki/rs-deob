import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class33 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lph;")
    public static class229 field546 = class266.method1858("<col=ffff00>", 0);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
    public static boolean field547 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lsi;")
    public static class66 field543;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 13)
    public static void method279(int arg0) {
        field546 = null;
        field543 = null;
        if (arg0 <= 65) {
            method279(-71);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I")
    public abstract int method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public abstract void method278(int arg0);
}
