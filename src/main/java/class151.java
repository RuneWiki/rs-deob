import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class class151 {

    @OriginalMember(owner = "qc", name = "c", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "qc", name = "d", descriptor = "[I")
    public int[] field2904;

    @OriginalMember(owner = "qc", name = "a", descriptor = "[I")
    public int[] field2901;

    @OriginalMember(owner = "qc", name = "<init>", descriptor = "()V")
    public class151() {
        class56.method363(16);
        this.field2903 = class56.method372() == 0 ? 1 : class56.method363(4) + 1;
        if (class56.method372() != 0) {
            class56.method363(8);
        }
        class56.method363(2);
        if (this.field2903 > 1) {
            this.field2902 = class56.method363(4);
        }
        this.field2904 = new int[this.field2903];
        this.field2901 = new int[this.field2903];
        for (int var1 = 0; var1 < this.field2903; var1++) {
            class56.method363(8);
            this.field2904[var1] = class56.method363(8);
            this.field2901[var1] = class56.method363(8);
        }
    }
}
