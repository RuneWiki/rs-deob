import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class65 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public int[] field1308;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
    public int[] field1307;

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class65() {
        class47.method365(16);
        this.field1309 = class47.method369() == 0 ? 1 : class47.method365(4) + 1;
        if (class47.method369() != 0) {
            class47.method365(8);
        }
        class47.method365(2);
        if (this.field1309 > 1) {
            this.field1306 = class47.method365(4);
        }
        this.field1308 = new int[this.field1309];
        this.field1307 = new int[this.field1309];
        for (int var1 = 0; var1 < this.field1309; var1++) {
            class47.method365(8);
            this.field1308[var1] = class47.method365(8);
            this.field1307[var1] = class47.method365(8);
        }
    }
}
