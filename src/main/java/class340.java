import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class340 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field5141;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public int[] field5143;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
    public int[] field5142;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class340() {
        class375.method2339(16);
        this.field5141 = class375.method2331() == 0 ? 1 : class375.method2339(4) + 1;
        if (class375.method2331() != 0) {
            class375.method2339(8);
        }
        class375.method2339(2);
        if (this.field5141 > 1) {
            this.field5140 = class375.method2339(4);
        }
        this.field5143 = new int[this.field5141];
        this.field5142 = new int[this.field5141];
        for (int var1 = 0; var1 < this.field5141; var1++) {
            class375.method2339(8);
            this.field5143[var1] = class375.method2339(8);
            this.field5142[var1] = class375.method2339(8);
        }
    }
}
