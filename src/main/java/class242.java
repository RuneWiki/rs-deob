import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class242 {

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "[I")
    public int[] field3469;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "[I")
    public int[] field3467;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(I)V", line = 13)
    public class242(int arg0) {
        this.field3466 = arg0;
        this.field3469 = new int[this.field3466];
        this.field3467 = new int[this.field3466];
    }
}
