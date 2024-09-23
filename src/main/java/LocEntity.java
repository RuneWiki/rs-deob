import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "nb", name = "e", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "nb", name = "f", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "nb", name = "g", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "nb", name = "j", descriptor = "Ljc;")
    public SeqType field659;

    @OriginalMember(owner = "nb", name = "k", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "nb", name = "l", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(IILjc;IIZII)V")
    public LocEntity(int arg0, int arg1, SeqType arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg7 != 1) {
            throw new NullPointerException();
        }
        this.field654 = arg6;
        this.field655 = arg3;
        this.field656 = arg1;
        this.field657 = arg0;
        this.field658 = arg4;
        this.field659 = arg2;
        if (arg5 && arg2.field1023 != -1) {
            this.field660 = (int) (Math.random() * (double) this.field659.field1019);
            this.field661 = (int) (Math.random() * (double) this.field659.field1022[this.field660]);
        } else {
            this.field660 = -1;
            this.field661 = 0;
        }
    }
}
