import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class103 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public int[] field1814;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public int[] field1816;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class103() {
        class142.method855(16);
        this.field1817 = class142.method858() == 0 ? 1 : class142.method855(4) + 1;
        if (class142.method858() != 0) {
            class142.method855(8);
        }
        class142.method855(2);
        if (this.field1817 > 1) {
            this.field1815 = class142.method855(4);
        }
        this.field1814 = new int[this.field1817];
        this.field1816 = new int[this.field1817];
        for (int var1 = 0; var1 < this.field1817; var1++) {
            class142.method855(8);
            this.field1814[var1] = class142.method855(8);
            this.field1816[var1] = class142.method855(8);
        }
    }
}
