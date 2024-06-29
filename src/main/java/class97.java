import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class97 extends class242 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    private static int field1358;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()I")
    public static final int method641() {
        return field1358;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V")
    public final void method642() {
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static final void method643(int arg0) {
        field1358 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class97() {
        new class95();
        new class148();
    }

    static {
        new class78(8);
        field1358 = 2;
        new class224(131056);
    }
}
