import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class756 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "[I")
    private int[] field10555;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field10554 = -1;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field10560 = -1;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field10556;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 7)
    public static final void method4202(int arg0) {
        field10559++;
        class220.field2973.method3906(-100);
        if (arg0 < 44) {
            field10560 = -1;
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "([I)V", line = 23)
    public class756(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field10555 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field10555[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field10555[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field10555[var5 + var5] = arg0[var4];
            this.field10555[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)I", line = 59)
    public final int method4203(int arg0, byte arg1) {
        if (arg1 < 107) {
            this.field10555 = null;
        }
        field10558++;
        int var3 = (this.field10555.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field10555[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field10555[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
