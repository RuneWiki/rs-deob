import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class446 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public int field6340;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field6342;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
    public int[] field6343;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "[I")
    public int[] field6341;

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 7)
    public class446() {
        class9.method62(16);
        this.field6340 = class9.method65() == 0 ? 1 : class9.method62(4) + 1;
        if (class9.method65() != 0) {
            class9.method62(8);
        }
        class9.method62(2);
        if (this.field6340 > 1) {
            this.field6342 = class9.method62(4);
        }
        this.field6343 = new int[this.field6340];
        this.field6341 = new int[this.field6340];
        for (int var1 = 0; var1 < this.field6340; var1++) {
            class9.method62(8);
            this.field6343[var1] = class9.method62(8);
            this.field6341[var1] = class9.method62(8);
        }
    }
}
