import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class538 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field7744 = 0;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "B")
    public byte field7748;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public int field7746;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Ljava/lang/String;")
    public String field7743;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Ljava/lang/String;")
    public String field7747;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "Ljava/lang/String;")
    public String field7749;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Ljava/lang/String;")
    public String field7750;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 17)
    public static final void method3068(int arg0, Object[] arg1, long[] arg2) {
        if (arg0 <= -90) {
            field7745++;
            class565.method3196(arg1, 0, arg2.length - 1, arg2, false);
        }
    }
}
