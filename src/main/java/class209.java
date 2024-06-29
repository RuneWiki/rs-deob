import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class209 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
    public int[] field3155;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
    public int[] field3154;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 7)
    public class209() {
        class221.method1541(16);
        this.field3152 = class221.method1543() == 0 ? 1 : class221.method1541(4) + 1;
        if (class221.method1543() != 0) {
            class221.method1541(8);
        }
        class221.method1541(2);
        if (this.field3152 > 1) {
            this.field3153 = class221.method1541(4);
        }
        this.field3155 = new int[this.field3152];
        this.field3154 = new int[this.field3152];
        for (int var1 = 0; var1 < this.field3152; var1++) {
            class221.method1541(8);
            this.field3155[var1] = class221.method1541(8);
            this.field3154[var1] = class221.method1541(8);
        }
    }
}
