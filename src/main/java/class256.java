import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class256 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
    public int[] field3743;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public int[] field3744;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 7)
    public class256() {
        class250.method1760(16);
        this.field3742 = class250.method1755() == 0 ? 1 : class250.method1760(4) + 1;
        if (class250.method1755() != 0) {
            class250.method1760(8);
        }
        class250.method1760(2);
        if (this.field3742 > 1) {
            this.field3741 = class250.method1760(4);
        }
        this.field3743 = new int[this.field3742];
        this.field3744 = new int[this.field3742];
        for (int var1 = 0; var1 < this.field3742; var1++) {
            class250.method1760(8);
            this.field3743[var1] = class250.method1760(8);
            this.field3744[var1] = class250.method1760(8);
        }
    }
}
