import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class372 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field5227;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field5225;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
    public int[] field5226;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "[I")
    public int[] field5224;

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    public class372() {
        class163.method1077(16);
        this.field5227 = class163.method1070() == 0 ? 1 : class163.method1077(4) + 1;
        if (class163.method1070() != 0) {
            class163.method1077(8);
        }
        class163.method1077(2);
        if (this.field5227 > 1) {
            this.field5225 = class163.method1077(4);
        }
        this.field5226 = new int[this.field5227];
        this.field5224 = new int[this.field5227];
        for (int var1 = 0; var1 < this.field5227; var1++) {
            class163.method1077(8);
            this.field5226[var1] = class163.method1077(8);
            this.field5224[var1] = class163.method1077(8);
        }
    }
}
