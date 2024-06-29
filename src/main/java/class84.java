import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class84 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    public int[] field1765;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public int[] field1764;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class84() {
        class95.method776(16);
        this.field1763 = class95.method778() == 0 ? 1 : class95.method776(4) + 1;
        if (class95.method778() != 0) {
            class95.method776(8);
        }
        class95.method776(2);
        if (this.field1763 > 1) {
            this.field1762 = class95.method776(4);
        }
        this.field1765 = new int[this.field1763];
        this.field1764 = new int[this.field1763];
        for (int var1 = 0; var1 < this.field1763; var1++) {
            class95.method776(8);
            this.field1765[var1] = class95.method776(8);
            this.field1764[var1] = class95.method776(8);
        }
    }
}
