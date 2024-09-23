import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "mb", name = "f", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "mb", name = "g", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "mb", name = "h", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "mb", name = "m", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(IIIIIIIII)V")
    public LocSpawned(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field634 = arg4;
        this.field635 = arg6;
        this.field636 = arg2;
        this.field637 = arg1;
        this.field638 = arg0;
        if (arg5 != 0) {
            throw new NullPointerException();
        }
        this.field639 = arg7;
        this.field640 = arg8;
        this.field641 = arg3;
    }
}
