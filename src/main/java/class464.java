import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class464 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public int field6387;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "[I")
    public int[] field6389;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
    public int[] field6388;

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class464() {
        class172.method1219(16);
        this.field6386 = class172.method1212() == 0 ? 1 : class172.method1219(4) + 1;
        if (class172.method1212() != 0) {
            class172.method1219(8);
        }
        class172.method1219(2);
        if (this.field6386 > 1) {
            this.field6387 = class172.method1219(4);
        }
        this.field6389 = new int[this.field6386];
        this.field6388 = new int[this.field6386];
        for (int var1 = 0; var1 < this.field6386; var1++) {
            class172.method1219(8);
            this.field6389[var1] = class172.method1219(8);
            this.field6388[var1] = class172.method1219(8);
        }
    }
}
