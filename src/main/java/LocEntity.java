import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "nb", name = "e", descriptor = "I")
    private int field652 = 4;

    @OriginalMember(owner = "nb", name = "f", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "nb", name = "g", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "nb", name = "k", descriptor = "Ljc;")
    public SeqType field658;

    @OriginalMember(owner = "nb", name = "l", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "nb", name = "m", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(IIIZLjc;III)V")
    public LocEntity(int arg0, int arg1, int arg2, boolean arg3, SeqType arg4, int arg5, int arg6, int arg7) {
        this.field653 = arg2;
        this.field654 = arg0;
        if (arg5 < this.field652 || arg5 > this.field652) {
            this.field652 = -40;
        }
        this.field655 = arg7;
        this.field656 = arg1;
        this.field657 = arg6;
        this.field658 = arg4;
        if (arg3 && arg4.field1028 != -1) {
            this.field659 = (int) (Math.random() * (double) this.field658.field1024);
            this.field660 = (int) (Math.random() * (double) this.field658.field1027[this.field659]);
        } else {
            this.field659 = -1;
            this.field660 = 0;
        }
    }
}
