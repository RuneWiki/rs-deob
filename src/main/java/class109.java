import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class109 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public int[] field1973;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public int[] field1972;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class109() {
        class5.method26(16);
        this.field1974 = class5.method24() == 0 ? 1 : class5.method26(4) + 1;
        if (class5.method24() != 0) {
            class5.method26(8);
        }
        class5.method26(2);
        if (this.field1974 > 1) {
            this.field1971 = class5.method26(4);
        }
        this.field1973 = new int[this.field1974];
        this.field1972 = new int[this.field1974];
        for (int var1 = 0; var1 < this.field1974; var1++) {
            class5.method26(8);
            this.field1973[var1] = class5.method26(8);
            this.field1972[var1] = class5.method26(8);
        }
    }
}
