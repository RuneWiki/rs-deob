import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class342 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[I")
    public static int[] field5054 = new int[256];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5053++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2202(int arg0) {
        if (arg0 == -5373) {
            field5054 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZI)V")
    public static final void method2203(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != 5438) {
            field5055 = 83;
        }
        field5056++;
        if (arg1) {
            class711.field10016--;
            if (class711.field10016 == 0) {
                class395.field5895 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class101.field1509--;
        if (class101.field1509 == 0) {
            class510.field7397 = null;
            return;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5054[var0] = var1;
        }
    }
}
