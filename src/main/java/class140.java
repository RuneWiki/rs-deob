import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class140 {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public int[] field2005;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public int[] field2006;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 7)
    public class140() {
        class327.method2258(16);
        this.field2008 = class327.method2266() == 0 ? 1 : class327.method2258(4) + 1;
        if (class327.method2266() != 0) {
            class327.method2258(8);
        }
        class327.method2258(2);
        if (this.field2008 > 1) {
            this.field2007 = class327.method2258(4);
        }
        this.field2005 = new int[this.field2008];
        this.field2006 = new int[this.field2008];
        for (int var1 = 0; var1 < this.field2008; var1++) {
            class327.method2258(8);
            this.field2005[var1] = class327.method2258(8);
            this.field2006[var1] = class327.method2258(8);
        }
    }
}
