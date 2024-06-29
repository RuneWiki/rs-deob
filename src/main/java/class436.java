import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class436 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field5647;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public int[] field5649;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[I")
    public int[] field5646;

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 7)
    public class436() {
        class73.method584(16);
        this.field5647 = class73.method591() == 0 ? 1 : class73.method584(4) + 1;
        if (class73.method591() != 0) {
            class73.method584(8);
        }
        class73.method584(2);
        if (this.field5647 > 1) {
            this.field5648 = class73.method584(4);
        }
        this.field5649 = new int[this.field5647];
        this.field5646 = new int[this.field5647];
        for (int var1 = 0; var1 < this.field5647; var1++) {
            class73.method584(8);
            this.field5649[var1] = class73.method584(8);
            this.field5646[var1] = class73.method584(8);
        }
    }
}
