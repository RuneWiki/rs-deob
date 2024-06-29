import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class41 extends class197 {

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field587 = 0;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
    public boolean field581;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 4)
    public static final void method283(int arg0, int arg1, int arg2) {
        if (arg0 <= -57) {
            field588++;
            class106 var3 = class250.method1400(5, -84, arg2);
            var3.method658(0);
            var3.field1589 = arg1;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Z", line = 20)
    public final boolean method17(int arg0) {
        field579++;
        if (arg0 != 7) {
            method283(-122, -17, -105);
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 39)
    public final void method8(int arg0) {
        field586++;
        if (arg0 <= -74) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 53)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        field585++;
        if (!arg6) {
            this.method17(-126);
        }
        throw new IllegalStateException();
    }
}
