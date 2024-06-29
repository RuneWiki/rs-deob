import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class56 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Ldw;")
    private class664 field787;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
    public static boolean field788 = false;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
    public static final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class607.field8185 <= arg3 && class726.field10064 >= arg2 && class291.field4181 <= arg0 && class262.field3848 >= arg4) {
            class57.method411(arg2, arg3, arg4, false, arg0, arg1);
        } else {
            class611.method3465(arg4, 5, arg2, arg0, arg1, arg3);
        }
        if (arg5 != 3732) {
            method406(-113, 112, 122, -64, -98, 83);
        }
        field790++;
    }

    @OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field787.method3685(this.field789, -126);
        field791++;
        super.finalize();
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ldw;II)V")
    public class56(class664 arg0, int arg1, int arg2) {
        this.field787 = arg0;
        this.field789 = arg2;
    }
}
