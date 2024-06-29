import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class257 {

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "[I")
    public int[] field3787;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "[I")
    public int[] field3786;

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V", line = 7)
    public class257() {
        class622.method3577(16);
        this.field3788 = class622.method3574() == 0 ? 1 : class622.method3577(4) + 1;
        if (class622.method3574() != 0) {
            class622.method3577(8);
        }
        class622.method3577(2);
        if (this.field3788 > 1) {
            this.field3789 = class622.method3577(4);
        }
        this.field3787 = new int[this.field3788];
        this.field3786 = new int[this.field3788];
        for (int var1 = 0; var1 < this.field3788; var1++) {
            class622.method3577(8);
            this.field3787[var1] = class622.method3577(8);
            this.field3786[var1] = class622.method3577(8);
        }
    }
}
