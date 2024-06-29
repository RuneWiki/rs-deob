import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class297 {

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "[I")
    private int[] field3761;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "F")
    public static float field3762 = 1024.0F;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "[I")
    public static int[] field3764 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
    public static void method1773(byte arg0) {
        if (arg0 == -123) {
            field3764 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "([I)V")
    public class297(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field3761 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3761[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3761[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3761[var5 + var5] = arg0[var4];
            this.field3761[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(II)I")
    public final int method1774(int arg0, int arg1) {
        if (arg0 <= 13) {
            field3764 = null;
        }
        field3760++;
        int var3 = (this.field3761.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3761[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3761[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
