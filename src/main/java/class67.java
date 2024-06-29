import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class67 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
    public int[] field1109;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    public int[] field1110;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 7)
    public class67() {
        class310.method2118(16);
        this.field1112 = class310.method2123() == 0 ? 1 : class310.method2118(4) + 1;
        if (class310.method2123() != 0) {
            class310.method2118(8);
        }
        class310.method2118(2);
        if (this.field1112 > 1) {
            this.field1111 = class310.method2118(4);
        }
        this.field1109 = new int[this.field1112];
        this.field1110 = new int[this.field1112];
        for (int var1 = 0; var1 < this.field1112; var1++) {
            class310.method2118(8);
            this.field1109[var1] = class310.method2118(8);
            this.field1110[var1] = class310.method2118(8);
        }
    }
}
