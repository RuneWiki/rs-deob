import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class193 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[I")
    public int[] field2927;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    public int[] field2928;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class193() {
        class38.method299(16);
        this.field2926 = class38.method300() == 0 ? 1 : class38.method299(4) + 1;
        if (class38.method300() != 0) {
            class38.method299(8);
        }
        class38.method299(2);
        if (this.field2926 > 1) {
            this.field2925 = class38.method299(4);
        }
        this.field2927 = new int[this.field2926];
        this.field2928 = new int[this.field2926];
        for (int var1 = 0; var1 < this.field2926; var1++) {
            class38.method299(8);
            this.field2927[var1] = class38.method299(8);
            this.field2928[var1] = class38.method299(8);
        }
    }
}
