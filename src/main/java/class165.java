import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class165 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public int[] field2694;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public int[] field2692;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class165() {
        class250.method1703(16);
        this.field2693 = class250.method1704() == 0 ? 1 : class250.method1703(4) + 1;
        if (class250.method1704() != 0) {
            class250.method1703(8);
        }
        class250.method1703(2);
        if (this.field2693 > 1) {
            this.field2695 = class250.method1703(4);
        }
        this.field2694 = new int[this.field2693];
        this.field2692 = new int[this.field2693];
        for (int var1 = 0; var1 < this.field2693; var1++) {
            class250.method1703(8);
            this.field2694[var1] = class250.method1703(8);
            this.field2692[var1] = class250.method1703(8);
        }
    }
}
