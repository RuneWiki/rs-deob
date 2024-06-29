import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class284 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    public int[] field4515;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    public int[] field4514;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class284() {
        class16.method75(16);
        this.field4513 = class16.method82() == 0 ? 1 : class16.method75(4) + 1;
        if (class16.method82() != 0) {
            class16.method75(8);
        }
        class16.method75(2);
        if (this.field4513 > 1) {
            this.field4516 = class16.method75(4);
        }
        this.field4515 = new int[this.field4513];
        this.field4514 = new int[this.field4513];
        for (int var1 = 0; var1 < this.field4513; var1++) {
            class16.method75(8);
            this.field4515[var1] = class16.method75(8);
            this.field4514[var1] = class16.method75(8);
        }
    }
}
