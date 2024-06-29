import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class322 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field4957;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public int[] field4956;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public int[] field4958;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 7)
    public class322() {
        class302.method2173(16);
        this.field4955 = class302.method2176() == 0 ? 1 : class302.method2173(4) + 1;
        if (class302.method2176() != 0) {
            class302.method2173(8);
        }
        class302.method2173(2);
        if (this.field4955 > 1) {
            this.field4957 = class302.method2173(4);
        }
        this.field4956 = new int[this.field4955];
        this.field4958 = new int[this.field4955];
        for (int var1 = 0; var1 < this.field4955; var1++) {
            class302.method2173(8);
            this.field4956[var1] = class302.method2173(8);
            this.field4958[var1] = class302.method2173(8);
        }
    }
}
