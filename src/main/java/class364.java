import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class364 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public int[] field5178;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
    public int[] field5175;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 7)
    public class364() {
        class319.method2091(16);
        this.field5177 = class319.method2093() == 0 ? 1 : class319.method2091(4) + 1;
        if (class319.method2093() != 0) {
            class319.method2091(8);
        }
        class319.method2091(2);
        if (this.field5177 > 1) {
            this.field5176 = class319.method2091(4);
        }
        this.field5178 = new int[this.field5177];
        this.field5175 = new int[this.field5177];
        for (int var1 = 0; var1 < this.field5177; var1++) {
            class319.method2091(8);
            this.field5178[var1] = class319.method2091(8);
            this.field5175[var1] = class319.method2091(8);
        }
    }
}
