import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class268 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field4223;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    public int[] field4222;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public int[] field4221;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class268() {
        class218.method1492(16);
        this.field4223 = class218.method1489() == 0 ? 1 : class218.method1492(4) + 1;
        if (class218.method1489() != 0) {
            class218.method1492(8);
        }
        class218.method1492(2);
        if (this.field4223 > 1) {
            this.field4224 = class218.method1492(4);
        }
        this.field4222 = new int[this.field4223];
        this.field4221 = new int[this.field4223];
        for (int var1 = 0; var1 < this.field4223; var1++) {
            class218.method1492(8);
            this.field4222[var1] = class218.method1492(8);
            this.field4221[var1] = class218.method1492(8);
        }
    }
}
