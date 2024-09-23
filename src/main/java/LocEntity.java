import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "nb", name = "f", descriptor = "Z")
    private boolean field653 = false;

    @OriginalMember(owner = "nb", name = "g", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "nb", name = "k", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "nb", name = "l", descriptor = "Ljc;")
    public SeqType field659;

    @OriginalMember(owner = "nb", name = "m", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "nb", name = "n", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(ZIBIILjc;II)V")
    public LocEntity(boolean arg0, int arg1, byte arg2, int arg3, int arg4, SeqType arg5, int arg6, int arg7) {
        if (arg2 == 9) {
            boolean var9 = false;
        } else {
            this.field653 = !this.field653;
        }
        this.field654 = arg6;
        this.field655 = arg7;
        this.field656 = arg3;
        this.field657 = arg4;
        this.field658 = arg1;
        this.field659 = arg5;
        if (arg0 && arg5.field1048 != -1) {
            this.field660 = (int) (Math.random() * (double) this.field659.field1044);
            this.field661 = (int) (Math.random() * (double) this.field659.field1047[this.field660]);
        } else {
            this.field660 = -1;
            this.field661 = 0;
        }
    }
}
