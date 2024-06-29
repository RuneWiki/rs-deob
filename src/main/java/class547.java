import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class547 extends class389 {

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "Ldh;")
    public static class320 field7865 = new class320(12, 6);

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Ldh;")
    public static class320 field7868 = new class320(16, 7);

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "F")
    public static float field7869;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Lrr;")
    public class361 field7866;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "Z")
    public boolean field7867;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "[Lim;")
    public class569[] field7870;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIILha;)Z", line = 13)
    public final boolean method3219(int arg0, int arg1, int arg2, class58 arg3) {
        field7864++;
        int var5 = this.field7866.method1177(true);
        if (this.field7870 != null) {
            for (int var6 = 0; var6 < this.field7870.length; var6++) {
                this.field7870[var6].field8084 <<= var5;
                if (this.field7870[var6].method3308(arg2, arg1) && this.field7866.method995(arg2, arg1, arg3, -1)) {
                    this.field7870[var6].field8084 >>= var5;
                    return true;
                }
                this.field7870[var6].field8084 >>= var5;
            }
        }
        if (arg0 != 6) {
            method3220(56);
        }
        return false;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V", line = 52)
    public static void method3220(int arg0) {
        if (arg0 != -31754) {
            method3220(8);
        }
        field7868 = null;
        field7865 = null;
    }
}
