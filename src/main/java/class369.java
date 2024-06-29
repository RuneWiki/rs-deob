import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class369 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
    public int[] field4761;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public int[] field4760;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 7)
    public class369() {
        class413.method2319(16);
        this.field4762 = class413.method2321() == 0 ? 1 : class413.method2319(4) + 1;
        if (class413.method2321() != 0) {
            class413.method2319(8);
        }
        class413.method2319(2);
        if (this.field4762 > 1) {
            this.field4763 = class413.method2319(4);
        }
        this.field4761 = new int[this.field4762];
        this.field4760 = new int[this.field4762];
        for (int var1 = 0; var1 < this.field4762; var1++) {
            class413.method2319(8);
            this.field4761[var1] = class413.method2319(8);
            this.field4760[var1] = class413.method2319(8);
        }
    }
}
