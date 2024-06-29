import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class341 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public int[] field5328;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[I")
    public int[] field5325;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 7)
    public class341() {
        class202.method1355(16);
        this.field5326 = class202.method1357() == 0 ? 1 : class202.method1355(4) + 1;
        if (class202.method1357() != 0) {
            class202.method1355(8);
        }
        class202.method1355(2);
        if (this.field5326 > 1) {
            this.field5327 = class202.method1355(4);
        }
        this.field5328 = new int[this.field5326];
        this.field5325 = new int[this.field5326];
        for (int var1 = 0; var1 < this.field5326; var1++) {
            class202.method1355(8);
            this.field5328[var1] = class202.method1355(8);
            this.field5325[var1] = class202.method1355(8);
        }
    }
}
