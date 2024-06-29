import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class101 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
    public int[] field1950;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
    public int[] field1949;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class101() {
        class105.method715(16);
        this.field1952 = class105.method717() == 0 ? 1 : class105.method715(4) + 1;
        if (class105.method717() != 0) {
            class105.method715(8);
        }
        class105.method715(2);
        if (this.field1952 > 1) {
            this.field1951 = class105.method715(4);
        }
        this.field1950 = new int[this.field1952];
        this.field1949 = new int[this.field1952];
        for (int var1 = 0; var1 < this.field1952; var1++) {
            class105.method715(8);
            this.field1950[var1] = class105.method715(8);
            this.field1949[var1] = class105.method715(8);
        }
    }
}
