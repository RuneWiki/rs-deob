import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class225 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
    public int[] field2920;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
    public int[] field2917;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class225() {
        class590.method3324(16);
        this.field2918 = class590.method3317() == 0 ? 1 : class590.method3324(4) + 1;
        if (class590.method3317() != 0) {
            class590.method3324(8);
        }
        class590.method3324(2);
        if (this.field2918 > 1) {
            this.field2919 = class590.method3324(4);
        }
        this.field2920 = new int[this.field2918];
        this.field2917 = new int[this.field2918];
        for (int var1 = 0; var1 < this.field2918; var1++) {
            class590.method3324(8);
            this.field2920[var1] = class590.method3324(8);
            this.field2917[var1] = class590.method3324(8);
        }
    }
}
