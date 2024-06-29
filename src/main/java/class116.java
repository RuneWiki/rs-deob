import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class116 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public int[] field2783;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
    public int[] field2780;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class116() {
        class114.method940(16);
        this.field2782 = class114.method932() == 0 ? 1 : class114.method940(4) + 1;
        if (class114.method932() != 0) {
            class114.method940(8);
        }
        class114.method940(2);
        if (this.field2782 > 1) {
            this.field2781 = class114.method940(4);
        }
        this.field2783 = new int[this.field2782];
        this.field2780 = new int[this.field2782];
        for (int var1 = 0; var1 < this.field2782; var1++) {
            class114.method940(8);
            this.field2783[var1] = class114.method940(8);
            this.field2780[var1] = class114.method940(8);
        }
    }
}
