import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class23 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    public int[] field405;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    public int[] field406;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class23() {
        class4.method26(16);
        this.field403 = class4.method27() == 0 ? 1 : class4.method26(4) + 1;
        if (class4.method27() != 0) {
            class4.method26(8);
        }
        class4.method26(2);
        if (this.field403 > 1) {
            this.field404 = class4.method26(4);
        }
        this.field405 = new int[this.field403];
        this.field406 = new int[this.field403];
        for (int var1 = 0; var1 < this.field403; var1++) {
            class4.method26(8);
            this.field405[var1] = class4.method26(8);
            this.field406[var1] = class4.method26(8);
        }
    }
}
