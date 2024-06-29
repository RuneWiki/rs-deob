import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class556 extends class513 {

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field8043;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field8041 = 0;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIBI)V", line = 17)
    public static final void method3250(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class288.field3883 = arg0;
        field8042++;
        class587.field8513 = arg2;
        int var5 = -57 % ((-arg3 - 7) / 37);
        class221.field2866 = arg1;
        class598.field8632 = arg4;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 30)
    public class556() {
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V", line = 32)
    public class556(int arg0) {
        this.field8043 = arg0;
    }
}
