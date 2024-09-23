import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "mb", name = "e", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "mb", name = "f", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "mb", name = "g", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "mb", name = "h", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(IIIIZIIII)V")
    public LocSpawned(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field628 = arg6;
        if (arg4) {
            throw new NullPointerException();
        }
        this.field629 = arg5;
        this.field630 = arg1;
        this.field631 = arg2;
        this.field632 = arg8;
        this.field633 = arg7;
        this.field634 = arg3;
        this.field635 = arg0;
    }
}
