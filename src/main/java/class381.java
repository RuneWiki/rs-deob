import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class381 {

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "[I")
    private int[] field5461;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)I", line = 8)
    public final int method2427(boolean arg0, int arg1) {
        field5462++;
        int var3 = (this.field5461.length >> 1) - 1;
        int var4 = var3 & arg1;
        if (arg0) {
            field5459 = -57;
        }
        while (true) {
            int var5 = this.field5461[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5461[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "([I)V", line = 39)
    public class381(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field5461 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field5461[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field5461[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field5461[var5 + var5] = arg0[var4];
            this.field5461[var5 + var5 + 1] = var4++;
        }
    }
}
