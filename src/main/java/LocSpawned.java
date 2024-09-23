import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "mb", name = "e", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "mb", name = "f", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "mb", name = "g", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "mb", name = "h", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(IIIIIIIII)V")
    public LocSpawned(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field646 = arg0;
        if (arg6 <= 0) {
            throw new NullPointerException();
        }
        this.field647 = arg7;
        this.field648 = arg4;
        this.field649 = arg1;
        this.field650 = arg8;
        this.field651 = arg3;
        this.field652 = arg5;
        this.field653 = arg2;
    }
}
