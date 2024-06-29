import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class559 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[F")
    public static float[] field7902 = new float[4];

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lsb;")
    public static class266 field7903 = new class266(53, -1);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
    public static int[] field7906 = new int[3];

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([Lgfa;II)V")
    public static final void method3182(class697[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class697 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field9808;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field9808 > (var7 & 0x1) + var6) {
                class697 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3182(arg0, arg1, var4 - 1);
        method3182(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method3183(int arg0) {
        field7906 = null;
        field7902 = null;
        field7903 = null;
        if (arg0 != 1) {
            method3183(-79);
        }
    }
}
