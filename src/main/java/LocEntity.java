import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "nb", name = "f", descriptor = "B")
    private byte field652 = -50;

    @OriginalMember(owner = "nb", name = "g", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "nb", name = "k", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "nb", name = "l", descriptor = "Ljc;")
    public SeqType field658;

    @OriginalMember(owner = "nb", name = "m", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "nb", name = "n", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(IIILjc;IIBZ)V")
    public LocEntity(int arg0, int arg1, int arg2, SeqType arg3, int arg4, int arg5, byte arg6, boolean arg7) {
        this.field653 = arg2;
        this.field654 = arg5;
        this.field655 = arg4;
        this.field656 = arg1;
        if (this.field652 != arg6) {
            throw new NullPointerException();
        }
        this.field657 = arg0;
        this.field658 = arg3;
        if (arg7 && arg3.field1031 != -1) {
            this.field659 = (int) (Math.random() * (double) this.field658.field1027);
            this.field660 = (int) (Math.random() * (double) this.field658.field1030[this.field659]);
        } else {
            this.field659 = -1;
            this.field660 = 0;
        }
    }
}
