import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public int[] field1494;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
    public int[] field1493;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class66() {
        class128.method994(16);
        this.field1492 = class128.method986() == 0 ? 1 : class128.method994(4) + 1;
        if (class128.method986() != 0) {
            class128.method994(8);
        }
        class128.method994(2);
        if (this.field1492 > 1) {
            this.field1495 = class128.method994(4);
        }
        this.field1494 = new int[this.field1492];
        this.field1493 = new int[this.field1492];
        for (int var1 = 0; var1 < this.field1492; var1++) {
            class128.method994(8);
            this.field1494[var1] = class128.method994(8);
            this.field1493[var1] = class128.method994(8);
        }
    }
}
