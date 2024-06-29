import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class78 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[I")
    public int[] field1460;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    public int[] field1462;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class78() {
        class185.method1361(16);
        this.field1461 = class185.method1364() == 0 ? 1 : class185.method1361(4) + 1;
        if (class185.method1364() != 0) {
            class185.method1361(8);
        }
        class185.method1361(2);
        if (this.field1461 > 1) {
            this.field1459 = class185.method1361(4);
        }
        this.field1460 = new int[this.field1461];
        this.field1462 = new int[this.field1461];
        for (int var1 = 0; var1 < this.field1461; var1++) {
            class185.method1361(8);
            this.field1460[var1] = class185.method1361(8);
            this.field1462[var1] = class185.method1361(8);
        }
    }
}
