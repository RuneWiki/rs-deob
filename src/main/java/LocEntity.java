import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class LocEntity extends Linkable {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lfc;")
    public SeqType field621;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIILfc;II)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, SeqType arg4, int arg5, int arg6) {
        this.field616 = arg1;
        this.field617 = arg0;
        this.field618 = arg5;
        this.field619 = arg6;
        this.field620 = arg2;
        this.field621 = arg4;
        this.field622 = -1;
        if (arg3 != 5858) {
            throw new NullPointerException();
        }
        this.field623 = 0;
    }
}
