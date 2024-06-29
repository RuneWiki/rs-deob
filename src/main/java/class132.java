import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class132 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
    public int[] field2408;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    public int[] field2410;

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class132() {
        class153.method1087(16);
        this.field2411 = class153.method1080() == 0 ? 1 : class153.method1087(4) + 1;
        if (class153.method1080() != 0) {
            class153.method1087(8);
        }
        class153.method1087(2);
        if (this.field2411 > 1) {
            this.field2409 = class153.method1087(4);
        }
        this.field2408 = new int[this.field2411];
        this.field2410 = new int[this.field2411];
        for (int var1 = 0; var1 < this.field2411; var1++) {
            class153.method1087(8);
            this.field2408[var1] = class153.method1087(8);
            this.field2410[var1] = class153.method1087(8);
        }
    }
}
