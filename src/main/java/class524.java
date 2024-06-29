import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class524 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field7398 = -1;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public int field7397;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field7399;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
    public final boolean method3152(int arg0) {
        field7395++;
        int var2 = 5 / ((arg0 + 16) / 51);
        return (this.field7399 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Z")
    public final boolean method3153(byte arg0) {
        field7396++;
        int var2 = 13 % ((74 - arg0) / 37);
        return (this.field7399 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Z")
    public final boolean method3154(int arg0) {
        field7394++;
        if (arg0 != -28641) {
            field7398 = 84;
        }
        return (this.field7399 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)Z")
    public final boolean method3155(byte arg0) {
        field7401++;
        if (arg0 < 58) {
            return false;
        } else {
            return (this.field7399 & 0x8) != 0;
        }
    }
}
