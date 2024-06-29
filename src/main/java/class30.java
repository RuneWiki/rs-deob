import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 extends class540 {

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "J")
    public long field413;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lke;")
    public static class622 field412 = new class622(11, 4);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method216(byte arg0) {
        if (arg0 == -85) {
            field412 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class30() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(J)V")
    public class30(long arg0) {
        this.field413 = arg0;
    }
}
