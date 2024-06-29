import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class152 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
    public int[] field2427;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    public int[] field2429;

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class152() {
        class354.method2272(16);
        this.field2428 = class354.method2276() == 0 ? 1 : class354.method2272(4) + 1;
        if (class354.method2276() != 0) {
            class354.method2272(8);
        }
        class354.method2272(2);
        if (this.field2428 > 1) {
            this.field2430 = class354.method2272(4);
        }
        this.field2427 = new int[this.field2428];
        this.field2429 = new int[this.field2428];
        for (int var1 = 0; var1 < this.field2428; var1++) {
            class354.method2272(8);
            this.field2427[var1] = class354.method2272(8);
            this.field2429[var1] = class354.method2272(8);
        }
    }
}
