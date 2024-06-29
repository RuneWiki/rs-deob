import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class322 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    public int[] field4944;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    public int[] field4946;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class322() {
        class177.method1212(16);
        this.field4945 = class177.method1215() == 0 ? 1 : class177.method1212(4) + 1;
        if (class177.method1215() != 0) {
            class177.method1212(8);
        }
        class177.method1212(2);
        if (this.field4945 > 1) {
            this.field4943 = class177.method1212(4);
        }
        this.field4944 = new int[this.field4945];
        this.field4946 = new int[this.field4945];
        for (int var1 = 0; var1 < this.field4945; var1++) {
            class177.method1212(8);
            this.field4944[var1] = class177.method1212(8);
            this.field4946[var1] = class177.method1212(8);
        }
    }
}
