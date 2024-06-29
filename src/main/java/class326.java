import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class326 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public int field5677;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "[I")
    public int[] field5676;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    public int[] field5679;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 7)
    public class326() {
        class315.method2197(16);
        this.field5677 = class315.method2204() == 0 ? 1 : class315.method2197(4) + 1;
        if (class315.method2204() != 0) {
            class315.method2197(8);
        }
        class315.method2197(2);
        if (this.field5677 > 1) {
            this.field5678 = class315.method2197(4);
        }
        this.field5676 = new int[this.field5677];
        this.field5679 = new int[this.field5677];
        for (int var1 = 0; var1 < this.field5677; var1++) {
            class315.method2197(8);
            this.field5676[var1] = class315.method2197(8);
            this.field5679[var1] = class315.method2197(8);
        }
    }
}
