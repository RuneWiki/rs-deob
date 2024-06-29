import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class219 {

    @OriginalMember(owner = "client!js", name = "b", descriptor = "[I")
    private int[] field3444;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "[F")
    public static float[] field3445 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Lha;")
    public static class43 field3446 = new class43(5000);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Lph;")
    public static class459 field3448;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "[Lo;")
    public static class24[] field3449;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)I")
    public final int method1466(int arg0, boolean arg1) {
        field3447++;
        int var3 = (this.field3444.length >> 1) - 1;
        if (arg1) {
            this.method1466(-44, false);
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3444[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3444[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "([I)V")
    public class219(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3444 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3444[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3444[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3444[var5 + var5] = arg0[var4];
            this.field3444[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1467(int arg0) {
        field3445 = null;
        if (arg0 != 0) {
            method1467(-76);
        }
        field3448 = null;
        field3449 = null;
        field3446 = null;
    }
}
