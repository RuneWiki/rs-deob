import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class624 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field8864;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field8862 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field8861 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field8863 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLol;)Lpo;")
    public static final class370 method3569(byte arg0, class431 arg1) {
        field8865++;
        class510 var2 = class686.method3875(arg1, -119);
        int var3 = arg1.method2528((byte) 89);
        int var4 = 43 % ((-arg0 - 3) / 63);
        return new class370(var2.field9967, var2.field9961, var2.field9958, var2.field9969, var2.field9960, var2.field9968, var2.field9970, var2.field9962, var2.field9959, var2.field7013, var2.field7008, var2.field7009, var2.field7016, var2.field7005, var2.field7012, var3);
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8860++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
    public final int method3570(int arg0) {
        field8866++;
        if (arg0 != 0) {
            this.toString();
        }
        return this.field8864;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class624(String arg0, int arg1) {
        this.field8864 = arg1;
    }
}
