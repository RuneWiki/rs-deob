import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Ljc;")
    public SeqType field658;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ZIIIILjc;II)V")
    public LocEntity(boolean arg0, int arg1, int arg2, int arg3, int arg4, SeqType arg5, int arg6, int arg7) {
        this.field653 = arg2;
        this.field654 = arg4;
        this.field655 = arg7;
        this.field656 = arg6;
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        this.field657 = arg1;
        this.field658 = arg5;
        if (arg0 && arg5.field1033 != -1) {
            this.field659 = (int) (Math.random() * (double) this.field658.field1029);
            this.field660 = (int) (Math.random() * (double) this.field658.field1032[this.field659]);
        } else {
            this.field659 = -1;
            this.field660 = 0;
        }
    }
}
