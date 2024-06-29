import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class312 extends class187 {

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    public static boolean field4939 = false;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "J")
    public long field4938;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lfa;")
    public class312 field4936;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lfa;")
    public class312 field4944;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lce;")
    public static class8 field4937;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 8)
    public static void method2141(int arg0) {
        field4937 = null;
        int var1 = 70 % ((arg0 + 60) / 36);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 17)
    public static final void method2142(byte arg0) {
        field4941++;
        if (arg0 <= -99) {
            class283.field4351.method1296(255);
            class291.field4479.method1296(255);
            class336.field5220.method1296(255);
            class285.field4377.method1296(255);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 36)
    public final void method2143(byte arg0) {
        field4942++;
        if (this.field4936 == null) {
            return;
        }
        this.field4936.field4944 = this.field4944;
        this.field4944.field4936 = this.field4936;
        if (arg0 != 125) {
            this.field4938 = -104L;
        }
        this.field4944 = null;
        this.field4936 = null;
    }
}
