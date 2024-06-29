import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class554 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public int field7861;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public int field7859;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[I")
    public int[] field7860;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
    public int[] field7858;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class554() {
        class429.method2612(16);
        this.field7861 = class429.method2614() == 0 ? 1 : class429.method2612(4) + 1;
        if (class429.method2614() != 0) {
            class429.method2612(8);
        }
        class429.method2612(2);
        if (this.field7861 > 1) {
            this.field7859 = class429.method2612(4);
        }
        this.field7860 = new int[this.field7861];
        this.field7858 = new int[this.field7861];
        for (int var1 = 0; var1 < this.field7861; var1++) {
            class429.method2612(8);
            this.field7860[var1] = class429.method2612(8);
            this.field7858[var1] = class429.method2612(8);
        }
    }
}
