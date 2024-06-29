import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class16 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
    public int[] field211;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
    public int[] field213;

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 7)
    public class16() {
        class168.method1201(16);
        this.field212 = class168.method1194() == 0 ? 1 : class168.method1201(4) + 1;
        if (class168.method1194() != 0) {
            class168.method1201(8);
        }
        class168.method1201(2);
        if (this.field212 > 1) {
            this.field214 = class168.method1201(4);
        }
        this.field211 = new int[this.field212];
        this.field213 = new int[this.field212];
        for (int var1 = 0; var1 < this.field212; var1++) {
            class168.method1201(8);
            this.field211[var1] = class168.method1201(8);
            this.field213[var1] = class168.method1201(8);
        }
    }
}
