import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class177 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
    public int[] field2663;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
    public int[] field2666;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class177() {
        class67.method502(16);
        this.field2664 = class67.method500() == 0 ? 1 : class67.method502(4) + 1;
        if (class67.method500() != 0) {
            class67.method502(8);
        }
        class67.method502(2);
        if (this.field2664 > 1) {
            this.field2665 = class67.method502(4);
        }
        this.field2663 = new int[this.field2664];
        this.field2666 = new int[this.field2664];
        for (int var1 = 0; var1 < this.field2664; var1++) {
            class67.method502(8);
            this.field2663[var1] = class67.method502(8);
            this.field2666[var1] = class67.method502(8);
        }
    }
}
