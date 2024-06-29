import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class544 {

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public int field7684;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "[I")
    public int[] field7682;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "[I")
    public int[] field7683;

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "()V", line = 7)
    public class544() {
        class253.method1490(16);
        this.field7684 = class253.method1488() == 0 ? 1 : class253.method1490(4) + 1;
        if (class253.method1488() != 0) {
            class253.method1490(8);
        }
        class253.method1490(2);
        if (this.field7684 > 1) {
            this.field7681 = class253.method1490(4);
        }
        this.field7682 = new int[this.field7684];
        this.field7683 = new int[this.field7684];
        for (int var1 = 0; var1 < this.field7684; var1++) {
            class253.method1490(8);
            this.field7682[var1] = class253.method1490(8);
            this.field7683[var1] = class253.method1490(8);
        }
    }
}
