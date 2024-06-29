import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    public int[] field1514;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    public int[] field1512;

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class72() {
        class34.method299(16);
        this.field1513 = class34.method297() == 0 ? 1 : class34.method299(4) + 1;
        if (class34.method297() != 0) {
            class34.method299(8);
        }
        class34.method299(2);
        if (this.field1513 > 1) {
            this.field1515 = class34.method299(4);
        }
        this.field1514 = new int[this.field1513];
        this.field1512 = new int[this.field1513];
        for (int var1 = 0; var1 < this.field1513; var1++) {
            class34.method299(8);
            this.field1514[var1] = class34.method299(8);
            this.field1512[var1] = class34.method299(8);
        }
    }
}
