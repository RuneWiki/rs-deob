import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class77 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[I")
    public int[] field1810;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    public int[] field1813;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class77() {
        class104.method776(16);
        this.field1811 = class104.method778() == 0 ? 1 : class104.method776(4) + 1;
        if (class104.method778() != 0) {
            class104.method776(8);
        }
        class104.method776(2);
        if (this.field1811 > 1) {
            this.field1812 = class104.method776(4);
        }
        this.field1810 = new int[this.field1811];
        this.field1813 = new int[this.field1811];
        for (int var1 = 0; var1 < this.field1811; var1++) {
            class104.method776(8);
            this.field1810[var1] = class104.method776(8);
            this.field1813[var1] = class104.method776(8);
        }
    }
}
