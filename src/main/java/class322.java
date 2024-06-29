import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class322 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field5540;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public int[] field5539;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[I")
    public int[] field5538;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 7)
    public class322() {
        class251.method1805(16);
        this.field5541 = class251.method1807() == 0 ? 1 : class251.method1805(4) + 1;
        if (class251.method1807() != 0) {
            class251.method1805(8);
        }
        class251.method1805(2);
        if (this.field5541 > 1) {
            this.field5540 = class251.method1805(4);
        }
        this.field5539 = new int[this.field5541];
        this.field5538 = new int[this.field5541];
        for (int var1 = 0; var1 < this.field5541; var1++) {
            class251.method1805(8);
            this.field5539[var1] = class251.method1805(8);
            this.field5538[var1] = class251.method1805(8);
        }
    }
}
