import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class353 {

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 15)
    public static final byte[] method2163(String arg0, int arg1) {
        field5080++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= var3 - 2 || class505.method2902(false, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if ((var3 - 1) >= var2 || class505.method2902(false, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class223.method1472(arg0, var5, true, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!kda", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        field5081++;
        throw new IllegalStateException();
    }
}
