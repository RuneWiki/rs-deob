import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "nb", name = "e", descriptor = "I")
    private int field636 = 49498;

    @OriginalMember(owner = "nb", name = "f", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "nb", name = "g", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "nb", name = "k", descriptor = "Lgc;")
    public SeqType field642;

    @OriginalMember(owner = "nb", name = "l", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "nb", name = "m", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(IIIIZLgc;II)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, boolean arg4, SeqType arg5, int arg6, int arg7) {
        this.field637 = arg2;
        this.field638 = arg0;
        this.field639 = arg7;
        if (arg1 >= 0) {
            this.field636 = 25;
        }
        this.field640 = arg6;
        this.field641 = arg3;
        this.field642 = arg5;
        if (arg4) {
            this.field643 = (int) (Math.random() * (double) this.field642.field939);
            this.field644 = (int) (Math.random() * (double) this.field642.field942[this.field643]);
        } else {
            this.field643 = -1;
            this.field644 = 0;
        }
    }
}
