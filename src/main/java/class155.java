import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class155 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    public int[] field3555;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    public int[] field3553;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class155() {
        class93.method740(16);
        this.field3554 = class93.method733() == 0 ? 1 : class93.method740(4) + 1;
        if (class93.method733() != 0) {
            class93.method740(8);
        }
        class93.method740(2);
        if (this.field3554 > 1) {
            this.field3556 = class93.method740(4);
        }
        this.field3555 = new int[this.field3554];
        this.field3553 = new int[this.field3554];
        for (int var1 = 0; var1 < this.field3554; var1++) {
            class93.method740(8);
            this.field3555[var1] = class93.method740(8);
            this.field3553[var1] = class93.method740(8);
        }
    }
}
