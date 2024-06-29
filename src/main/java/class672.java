import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class672 {

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    private int field9477;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public int field9476;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
    public static boolean field9479 = false;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Lqe;")
    public static class433 field9474 = new class433();

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lpca;")
    public static class665 field9481 = null;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lri;")
    public static class97 field9475;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[Lf;")
    public static class702[] field9480;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
    public final int method3844(boolean arg0) {
        if (!arg0) {
            field9481 = null;
        }
        field9473++;
        return this.field9477;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)V")
    public static final void method3845(byte arg0, int arg1, int arg2) {
        if (arg0 != 96) {
            field9481 = null;
        }
        field9478++;
        class491 var3 = class224.field3610[arg2][arg1];
        if (var3 != null) {
            class47.field638 = var3.field7198;
            class30.field446 = var3.field7193;
            class422.field6436 = var3.field7196;
        }
        class566.method3353(1867386050);
    }

    @OriginalMember(owner = "client!rl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9472++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
    public static void method3846(boolean arg0) {
        field9475 = null;
        field9474 = null;
        field9480 = null;
        if (!arg0) {
            method3846(true);
        }
        field9481 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
    public class672(int arg0, int arg1) {
        this.field9477 = arg0;
        this.field9476 = arg1;
    }
}
