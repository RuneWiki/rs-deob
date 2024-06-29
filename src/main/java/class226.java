import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class226 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public int[] field3888;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    public int[] field3890;

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class226() {
        class205.method1364(16);
        this.field3887 = class205.method1366() == 0 ? 1 : class205.method1364(4) + 1;
        if (class205.method1366() != 0) {
            class205.method1364(8);
        }
        class205.method1364(2);
        if (this.field3887 > 1) {
            this.field3889 = class205.method1364(4);
        }
        this.field3888 = new int[this.field3887];
        this.field3890 = new int[this.field3887];
        for (int var1 = 0; var1 < this.field3887; var1++) {
            class205.method1364(8);
            this.field3888[var1] = class205.method1364(8);
            this.field3890[var1] = class205.method1364(8);
        }
    }
}
