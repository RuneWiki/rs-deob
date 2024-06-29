import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class225 extends class312 {

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public int field3625 = -1;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "Ljava/lang/String;")
    public String field3621;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "Ljava/lang/String;")
    public String field3622;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "(I)Lnh;", line = 7)
    public final class754 method1582(int arg0) {
        ++field3624;
        if (arg0 != -1) {
            this.method1582(39);
        }
        return class77.field1134[super.field4707];
    }
}
