import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class317 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public int[] field4922;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
    public int[] field4924;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 7)
    public class317() {
        class307.method2154(16);
        this.field4925 = class307.method2153() == 0 ? 1 : class307.method2154(4) + 1;
        if (class307.method2153() != 0) {
            class307.method2154(8);
        }
        class307.method2154(2);
        if (this.field4925 > 1) {
            this.field4923 = class307.method2154(4);
        }
        this.field4922 = new int[this.field4925];
        this.field4924 = new int[this.field4925];
        for (int var1 = 0; var1 < this.field4925; var1++) {
            class307.method2154(8);
            this.field4922[var1] = class307.method2154(8);
            this.field4924[var1] = class307.method2154(8);
        }
    }
}
