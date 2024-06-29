import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class707 {

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "[I")
    private int[] field9822;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "Lqk;")
    public static class1 field9823 = new class1(11, 15);

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field9824;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IBIIZLae;)V", line = 3)
    public static final void method3988(int arg0, byte arg1, int arg2, int arg3, boolean arg4, class283 arg5) {
        field9824++;
        if (arg1 != -98) {
            field9825 = -92;
        }
        class87.method651((byte) -31, 0L, arg4, arg5, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "([I)V", line = 17)
    public class707(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field9822 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field9822[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9822[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field9822[var5 + var5] = arg0[var4];
            this.field9822[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V", line = 53)
    public static void method3989(int arg0) {
        if (arg0 != 15) {
            method3989(22);
        }
        field9823 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZ)I", line = 63)
    public final int method3990(int arg0, boolean arg1) {
        field9821++;
        int var3 = (this.field9822.length >> 1) - 1;
        if (!arg1) {
            return -106;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field9822[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9822[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
