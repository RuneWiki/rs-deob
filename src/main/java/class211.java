import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class211 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
    public int[] field3780;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
    public int[] field3781;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class211() {
        class132.method851(16);
        this.field3783 = class132.method852() == 0 ? 1 : class132.method851(4) + 1;
        if (class132.method852() != 0) {
            class132.method851(8);
        }
        class132.method851(2);
        if (this.field3783 > 1) {
            this.field3782 = class132.method851(4);
        }
        this.field3780 = new int[this.field3783];
        this.field3781 = new int[this.field3783];
        for (int var1 = 0; var1 < this.field3783; var1++) {
            class132.method851(8);
            this.field3780[var1] = class132.method851(8);
            this.field3781[var1] = class132.method851(8);
        }
    }
}
