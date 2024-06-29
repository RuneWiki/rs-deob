import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class294 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[I")
    public static int[] field4938 = new int[32];

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field4936 = -1;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lqd;")
    public static class40 field4943;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lqd;")
    public static class40 field4944;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lda;")
    public class114 field4939;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lbg;")
    public class196 field4941;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lce;I)V", line = 12)
    public static final void method2015(class239 arg0, int arg1) {
        if (arg1 == -33) {
            class189.field3072 = arg0;
            field4935++;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4938[var1] = var0 - 1;
            var0 += var0;
        }
        field4943 = class147.method1106("<col=ffff00>", (byte) -57);
        field4944 = class147.method1106("<)4col>", (byte) -107);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 50)
    public static void method2016(int arg0) {
        field4944 = null;
        field4943 = null;
        if (arg0 != -1) {
            field4938 = (int[]) null;
        }
        field4938 = null;
    }
}
