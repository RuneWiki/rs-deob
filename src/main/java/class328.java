import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class328 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field4212;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    public int[] field4213;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
    public int[] field4210;

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class328() {
        class110.method739(16);
        this.field4211 = class110.method741() == 0 ? 1 : class110.method739(4) + 1;
        if (class110.method741() != 0) {
            class110.method739(8);
        }
        class110.method739(2);
        if (this.field4211 > 1) {
            this.field4212 = class110.method739(4);
        }
        this.field4213 = new int[this.field4211];
        this.field4210 = new int[this.field4211];
        for (int var1 = 0; var1 < this.field4211; var1++) {
            class110.method739(8);
            this.field4213[var1] = class110.method739(8);
            this.field4210[var1] = class110.method739(8);
        }
    }
}
