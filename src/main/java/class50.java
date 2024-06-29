import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class50 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    public int[] field917;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
    public int[] field915;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class50() {
        class181.method1226(16);
        this.field914 = class181.method1230() == 0 ? 1 : class181.method1226(4) + 1;
        if (class181.method1230() != 0) {
            class181.method1226(8);
        }
        class181.method1226(2);
        if (this.field914 > 1) {
            this.field916 = class181.method1226(4);
        }
        this.field917 = new int[this.field914];
        this.field915 = new int[this.field914];
        for (int var1 = 0; var1 < this.field914; var1++) {
            class181.method1226(8);
            this.field917[var1] = class181.method1226(8);
            this.field915[var1] = class181.method1226(8);
        }
    }
}
