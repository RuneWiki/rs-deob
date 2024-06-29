import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class84 extends class621 {

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!jda", name = "A", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!jda", name = "C", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "[[B")
    public static byte[][] field1088;

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZII)V", line = 13)
    public final void method594(int arg0, boolean arg1, int arg2, int arg3) {
        super.field8686 = arg0;
        if (arg1) {
            method596(-79);
        }
        super.field8677 = arg3;
        super.field8683 = arg2;
        ++field1087;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILkha;I)Ltba;", line = 26)
    public static final class56 method595(int arg0, int arg1, class687 arg2, int arg3) {
        ++field1086;
        if (arg0 != -24181) {
            method595(25, 15, (class687) null, -35);
        }
        byte[] var4 = arg2.method3810(arg1, -23360, arg3);
        return var4 == null ? null : new class56(var4);
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)V", line = 42)
    public static void method596(int arg0) {
        field1088 = null;
        if (arg0 != -22205) {
            method596(55);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BF)V", line = 54)
    public final void method597(byte arg0, float arg1) {
        if (arg0 < 69) {
            field1083 = -47;
        }
        ++field1084;
        super.field8690 = arg1;
    }
}
