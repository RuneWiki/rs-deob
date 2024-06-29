import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class307 {

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
    public int[] field4537;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "[I")
    public int[] field4536;

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class307() {
        class137.method972(16);
        this.field4539 = class137.method967() == 0 ? 1 : class137.method972(4) + 1;
        if (class137.method967() != 0) {
            class137.method972(8);
        }
        class137.method972(2);
        if (this.field4539 > 1) {
            this.field4538 = class137.method972(4);
        }
        this.field4537 = new int[this.field4539];
        this.field4536 = new int[this.field4539];
        for (int var1 = 0; var1 < this.field4539; var1++) {
            class137.method972(8);
            this.field4537[var1] = class137.method972(8);
            this.field4536[var1] = class137.method972(8);
        }
    }
}
