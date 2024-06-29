import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class68 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
    private int[] field1076;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field1073 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field1078 = 7759444;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field1077 = 1;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
    public final int method457(int arg0, int arg1) {
        field1075++;
        int var3 = (this.field1076.length >> 1) - 1;
        if (arg0 != 13672) {
            return -110;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field1076[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1076[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([I)V")
    public class68(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field1076 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1076[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1076[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1076[var5 + var5] = arg0[var4];
            this.field1076[var5 + var5 + 1] = var4++;
        }
    }
}
