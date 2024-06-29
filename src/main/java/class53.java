import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class53 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    public int[] field895;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
    public int[] field894;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class53() {
        class212.method1505(16);
        this.field893 = class212.method1509() == 0 ? 1 : class212.method1505(4) + 1;
        if (class212.method1509() != 0) {
            class212.method1505(8);
        }
        class212.method1505(2);
        if (this.field893 > 1) {
            this.field892 = class212.method1505(4);
        }
        this.field895 = new int[this.field893];
        this.field894 = new int[this.field893];
        for (int var1 = 0; var1 < this.field893; var1++) {
            class212.method1505(8);
            this.field895[var1] = class212.method1505(8);
            this.field894[var1] = class212.method1505(8);
        }
    }
}
