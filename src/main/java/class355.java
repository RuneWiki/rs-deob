import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class355 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    public int[] field5008;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    public int[] field5007;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 7)
    public class355() {
        class17.method96(16);
        this.field5005 = class17.method103() == 0 ? 1 : class17.method96(4) + 1;
        if (class17.method103() != 0) {
            class17.method96(8);
        }
        class17.method96(2);
        if (this.field5005 > 1) {
            this.field5006 = class17.method96(4);
        }
        this.field5008 = new int[this.field5005];
        this.field5007 = new int[this.field5005];
        for (int var1 = 0; var1 < this.field5005; var1++) {
            class17.method96(8);
            this.field5008[var1] = class17.method96(8);
            this.field5007[var1] = class17.method96(8);
        }
    }
}
