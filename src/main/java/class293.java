import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class293 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
    public int[] field5046;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
    public int[] field5048;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 7)
    public class293() {
        class144.method1021(16);
        this.field5049 = class144.method1023() == 0 ? 1 : class144.method1021(4) + 1;
        if (class144.method1023() != 0) {
            class144.method1021(8);
        }
        class144.method1021(2);
        if (this.field5049 > 1) {
            this.field5047 = class144.method1021(4);
        }
        this.field5046 = new int[this.field5049];
        this.field5048 = new int[this.field5049];
        for (int var1 = 0; var1 < this.field5049; var1++) {
            class144.method1021(8);
            this.field5046[var1] = class144.method1021(8);
            this.field5048[var1] = class144.method1021(8);
        }
    }
}
