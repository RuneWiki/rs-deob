import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public abstract class class320 extends class337 {

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "Lgo;")
    public static class441 field4577 = new class441(13, 0, 1, 0);

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Lds;")
    public static class12 field4578 = new class12(8);

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field4580 = 0;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field4579;

    static {
        new class202("", 73);
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V", line = 17)
    public static void method1990(int arg0) {
        if (arg0 != 0) {
            method1990(-83);
        }
        field4578 = null;
        field4577 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
    public abstract int method243(byte arg0);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)J")
    public abstract long method242(byte arg0);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I")
    public abstract int method239(int arg0);

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)I")
    public abstract int method238(int arg0);
}
