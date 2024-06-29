import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class286 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    public int[] field4243;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public int[] field4245;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class286() {
        class527.method3121(16);
        this.field4242 = class527.method3130() == 0 ? 1 : class527.method3121(4) + 1;
        if (class527.method3130() != 0) {
            class527.method3121(8);
        }
        class527.method3121(2);
        if (this.field4242 > 1) {
            this.field4244 = class527.method3121(4);
        }
        this.field4243 = new int[this.field4242];
        this.field4245 = new int[this.field4242];
        for (int var1 = 0; var1 < this.field4242; var1++) {
            class527.method3121(8);
            this.field4243[var1] = class527.method3121(8);
            this.field4245[var1] = class527.method3121(8);
        }
    }
}
