import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class96 {

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "[I")
    public int[] field1474;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "[I")
    public int[] field1475;

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V", line = 7)
    public class96() {
        class253.method1666(16);
        this.field1477 = class253.method1661() == 0 ? 1 : class253.method1666(4) + 1;
        if (class253.method1661() != 0) {
            class253.method1666(8);
        }
        class253.method1666(2);
        if (this.field1477 > 1) {
            this.field1476 = class253.method1666(4);
        }
        this.field1474 = new int[this.field1477];
        this.field1475 = new int[this.field1477];
        for (int var1 = 0; var1 < this.field1477; var1++) {
            class253.method1666(8);
            this.field1474[var1] = class253.method1666(8);
            this.field1475[var1] = class253.method1666(8);
        }
    }
}
