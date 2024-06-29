import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class180 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public int[] field2923;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
    public int[] field2920;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 7)
    public class180() {
        class465.method2793(16);
        this.field2921 = class465.method2788() == 0 ? 1 : class465.method2793(4) + 1;
        if (class465.method2788() != 0) {
            class465.method2793(8);
        }
        class465.method2793(2);
        if (this.field2921 > 1) {
            this.field2922 = class465.method2793(4);
        }
        this.field2923 = new int[this.field2921];
        this.field2920 = new int[this.field2921];
        for (int var1 = 0; var1 < this.field2921; var1++) {
            class465.method2793(8);
            this.field2923[var1] = class465.method2793(8);
            this.field2920[var1] = class465.method2793(8);
        }
    }
}
