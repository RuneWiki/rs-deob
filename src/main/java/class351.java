import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class351 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field5601;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
    public int[] field5602;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[I")
    public int[] field5599;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 7)
    public class351() {
        class136.method934(16);
        this.field5601 = class136.method943() == 0 ? 1 : class136.method934(4) + 1;
        if (class136.method943() != 0) {
            class136.method934(8);
        }
        class136.method934(2);
        if (this.field5601 > 1) {
            this.field5600 = class136.method934(4);
        }
        this.field5602 = new int[this.field5601];
        this.field5599 = new int[this.field5601];
        for (int var1 = 0; var1 < this.field5601; var1++) {
            class136.method934(8);
            this.field5602[var1] = class136.method934(8);
            this.field5599[var1] = class136.method934(8);
        }
    }
}
