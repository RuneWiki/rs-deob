import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class201 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public int field3650;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
    public int[] field3647;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    public int[] field3648;

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class201() {
        class114.method823(16);
        this.field3650 = class114.method814() == 0 ? 1 : class114.method823(4) + 1;
        if (class114.method814() != 0) {
            class114.method823(8);
        }
        class114.method823(2);
        if (this.field3650 > 1) {
            this.field3649 = class114.method823(4);
        }
        this.field3647 = new int[this.field3650];
        this.field3648 = new int[this.field3650];
        for (int var1 = 0; var1 < this.field3650; var1++) {
            class114.method823(8);
            this.field3647[var1] = class114.method823(8);
            this.field3648[var1] = class114.method823(8);
        }
    }
}
