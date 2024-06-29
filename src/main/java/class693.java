import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class693 {

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "[I")
    private int[] field9716;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "Lbja;")
    public static class34 field9717;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)I")
    public final int method3837(int arg0, int arg1) {
        field9718++;
        int var3 = (this.field9716.length >> 1) + arg0;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field9716[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9716[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "([I)V")
    public class693(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field9716 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field9716[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9716[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field9716[var5 + var5] = arg0[var4];
            this.field9716[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public static void method3838(int arg0) {
        field9717 = null;
        if (arg0 != -1) {
            method3838(13);
        }
    }
}
