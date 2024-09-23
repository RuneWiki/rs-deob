import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "mb", name = "e", descriptor = "I")
    private int field643 = 478;

    @OriginalMember(owner = "mb", name = "f", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "mb", name = "g", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "mb", name = "h", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "mb", name = "m", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(IIIIIIIII)V")
    public LocSpawned(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field644 = arg1;
        this.field645 = arg4;
        this.field646 = arg7;
        this.field647 = arg6;
        if (arg8 <= 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        this.field648 = arg5;
        this.field649 = arg0;
        this.field650 = arg2;
        this.field651 = arg3;
    }
}
