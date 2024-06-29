import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class186 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
    public int[] field2512;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "[I")
    public int[] field2514;

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class186() {
        class370.method2407(16);
        this.field2511 = class370.method2402() == 0 ? 1 : class370.method2407(4) + 1;
        if (class370.method2402() != 0) {
            class370.method2407(8);
        }
        class370.method2407(2);
        if (this.field2511 > 1) {
            this.field2513 = class370.method2407(4);
        }
        this.field2512 = new int[this.field2511];
        this.field2514 = new int[this.field2511];
        for (int var1 = 0; var1 < this.field2511; var1++) {
            class370.method2407(8);
            this.field2512[var1] = class370.method2407(8);
            this.field2514[var1] = class370.method2407(8);
        }
    }
}
