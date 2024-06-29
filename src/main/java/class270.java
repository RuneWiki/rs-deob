import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class270 {

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "[I")
    public int[] field4091;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "[I")
    public int[] field4093;

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
    public class270() {
        class249.method1517(16);
        this.field4092 = class249.method1513() == 0 ? 1 : class249.method1517(4) + 1;
        if (class249.method1513() != 0) {
            class249.method1517(8);
        }
        class249.method1517(2);
        if (this.field4092 > 1) {
            this.field4090 = class249.method1517(4);
        }
        this.field4091 = new int[this.field4092];
        this.field4093 = new int[this.field4092];
        for (int var1 = 0; var1 < this.field4092; var1++) {
            class249.method1517(8);
            this.field4091[var1] = class249.method1517(8);
            this.field4093[var1] = class249.method1517(8);
        }
    }
}
