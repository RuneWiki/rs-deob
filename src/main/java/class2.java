import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class2 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    public int[] field15;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    public int[] field17;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class2() {
        class162.method1022(16);
        this.field16 = class162.method1013() == 0 ? 1 : class162.method1022(4) + 1;
        if (class162.method1013() != 0) {
            class162.method1022(8);
        }
        class162.method1022(2);
        if (this.field16 > 1) {
            this.field14 = class162.method1022(4);
        }
        this.field15 = new int[this.field16];
        this.field17 = new int[this.field16];
        for (int var1 = 0; var1 < this.field16; var1++) {
            class162.method1022(8);
            this.field15[var1] = class162.method1022(8);
            this.field17[var1] = class162.method1022(8);
        }
    }
}
