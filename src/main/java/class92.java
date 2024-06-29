import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class92 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    public int[] field1494;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[I")
    public int[] field1493;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class92() {
        class359.method2186(16);
        this.field1492 = class359.method2196() == 0 ? 1 : class359.method2186(4) + 1;
        if (class359.method2196() != 0) {
            class359.method2186(8);
        }
        class359.method2186(2);
        if (this.field1492 > 1) {
            this.field1495 = class359.method2186(4);
        }
        this.field1494 = new int[this.field1492];
        this.field1493 = new int[this.field1492];
        for (int var1 = 0; var1 < this.field1492; var1++) {
            class359.method2186(8);
            this.field1494[var1] = class359.method2186(8);
            this.field1493[var1] = class359.method2186(8);
        }
    }
}
