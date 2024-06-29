import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class780 implements class316 {

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lcf;")
    public class631 field10697;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lur;")
    public class564 field10691;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public int field10693;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field10695;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public int field10696;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field10692;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field10694;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Lhv;")
    public class546 method1557(byte arg0) {
        field10694++;
        if (arg0 >= -35) {
            this.field10693 = 48;
        }
        return class522.field7160;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method4307(byte arg0, String arg1, int arg2) {
        field10692++;
        if (arg0 <= 45) {
            method4307((byte) -123, null, 95);
        }
        class746.method4129(arg2, "", "", arg1, 0, "", 16773);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILur;Lcf;II)V")
    public class780(int arg0, class564 arg1, class631 arg2, int arg3, int arg4) {
        this.field10697 = arg2;
        this.field10691 = arg1;
        this.field10693 = arg0;
        this.field10695 = arg3;
        this.field10696 = arg4;
    }
}
