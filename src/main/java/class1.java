import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "[I")
    public int[] field3;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    public int[] field1;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 7)
    public class1() {
        class102.method718(16);
        this.field4 = class102.method719() == 0 ? 1 : class102.method718(4) + 1;
        if (class102.method719() != 0) {
            class102.method718(8);
        }
        class102.method718(2);
        if (this.field4 > 1) {
            this.field2 = class102.method718(4);
        }
        this.field3 = new int[this.field4];
        this.field1 = new int[this.field4];
        for (int var1 = 0; var1 < this.field4; var1++) {
            class102.method718(8);
            this.field3[var1] = class102.method718(8);
            this.field1[var1] = class102.method718(8);
        }
    }
}
