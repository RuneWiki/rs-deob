import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class528 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field7751 = 0;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field7757 = 0;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "B")
    public byte field7756;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field7753;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljava/lang/String;")
    public String field7747;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Ljava/lang/String;")
    public String field7749;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/lang/String;")
    public String field7750;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Ljava/lang/String;")
    public String field7755;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I")
    public static final int method3113(byte arg0, int arg1, int arg2) {
        field7752++;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        if (arg0 <= 106) {
            field7751 = 85;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }
}
