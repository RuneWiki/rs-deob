import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class409 {

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public int field6167;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "Ld;")
    public static class151 field6166;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "[I")
    public static int[] field6169;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I", line = 6)
    public static final int method2600(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class412.field6191 - 1; var2++) {
            if (arg0 < class575.field8142[var2] + class192.field2905[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class412.field6191 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!taa", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field6163++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 41)
    public static void method2601(byte arg0) {
        field6169 = null;
        if (arg0 <= 99) {
            method2600(-30);
        }
        field6166 = null;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(I)V", line = 57)
    public class409(int arg0) {
        this.field6167 = arg0;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIB)V", line = 67)
    public static final void method2602(int arg0, int arg1, byte arg2) {
        if (class729.field10216 != arg1) {
            class255.field3666 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class255.field3666[var3] = (var3 << 12) / arg1;
            }
            class554.field7909 = arg1 - 1;
            class729.field10216 = arg1;
            class514.field7297 = arg1 * 32;
        }
        field6164++;
        if (class632.field8852 != arg0) {
            if (class729.field10216 == arg0) {
                class136.field1816 = class255.field3666;
            } else {
                class136.field1816 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class136.field1816[var4] = (var4 << 12) / arg0;
                }
            }
            class619.field8708 = arg0 - 1;
            class632.field8852 = arg0;
        }
        if (arg2 <= 53) {
            field6166 = null;
        }
    }
}
