import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class LocSpawned extends Linkable {

    @OriginalMember(owner = "lb", name = "e", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "lb", name = "f", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "lb", name = "g", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "lb", name = "h", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "lb", name = "i", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(IBIIIIIII)V")
    public LocSpawned(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field608 = arg3;
        this.field609 = arg7;
        this.field610 = arg8;
        this.field611 = arg4;
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        boolean var10 = false;
        this.field612 = arg6;
        this.field613 = arg5;
        this.field614 = arg0;
        this.field615 = arg2;
    }
}
