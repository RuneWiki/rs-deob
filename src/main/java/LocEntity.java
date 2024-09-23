import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "nb", name = "f", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "nb", name = "g", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "nb", name = "k", descriptor = "Ljc;")
    public SeqType field647;

    @OriginalMember(owner = "nb", name = "l", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "nb", name = "m", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(IIIIZILjc;I)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, SeqType arg6, int arg7) {
        this.field642 = arg2;
        this.field643 = arg3;
        if (arg7 != -8072) {
            throw new NullPointerException();
        }
        this.field644 = arg5;
        this.field645 = arg1;
        this.field646 = arg0;
        this.field647 = arg6;
        if (arg4 && arg6.field1004 != -1) {
            this.field648 = (int) (Math.random() * (double) this.field647.field1000);
            this.field649 = (int) (Math.random() * (double) this.field647.field1003[this.field648]);
        } else {
            this.field648 = -1;
            this.field649 = 0;
        }
    }
}
