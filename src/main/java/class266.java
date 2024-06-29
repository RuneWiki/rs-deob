import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class266 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public int field3916;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "[I")
    public int[] field3915;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "[I")
    public int[] field3917;

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class266() {
        class83.method741(16);
        this.field3918 = class83.method744() == 0 ? 1 : class83.method741(4) + 1;
        if (class83.method744() != 0) {
            class83.method741(8);
        }
        class83.method741(2);
        if (this.field3918 > 1) {
            this.field3916 = class83.method741(4);
        }
        this.field3915 = new int[this.field3918];
        this.field3917 = new int[this.field3918];
        for (int var1 = 0; var1 < this.field3918; var1++) {
            class83.method741(8);
            this.field3915[var1] = class83.method741(8);
            this.field3917[var1] = class83.method741(8);
        }
    }
}
