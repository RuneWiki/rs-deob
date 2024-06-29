import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class471 extends class328 {

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public int field7209 = -1;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field7205 = 1;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field7208;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Llt;")
    public static class458 field7207;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljava/lang/String;")
    public String field7204;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Ljava/lang/String;")
    public String field7210;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[[[Loh;")
    public static class268[][][] field7206;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method2834(int arg0) {
        field7206 = null;
        if (arg0 != 27974) {
            field7207 = null;
        }
        field7207 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lqg;")
    public final class308 method2835(int arg0) {
        if (arg0 <= 105) {
            this.field7209 = -71;
        }
        ++field7211;
        return class508.field7681[super.field4913];
    }
}
