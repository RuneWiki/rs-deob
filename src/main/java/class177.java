import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class177 extends class67 {

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "[I")
    public int[] field3553 = new int[1];

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "[I")
    public int[] field3555 = new int[] { -1 };

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Li;")
    private static class88 field3552 = class208.method1425(105, "Allocated memory");

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Li;")
    public static class88 field3551 = field3552;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Li;")
    public static class88 field3556 = class208.method1425(105, "<img=0>");

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public static void method1269(byte arg0) {
        field3551 = null;
        field3552 = null;
        field3556 = null;
        if (arg0 <= 61) {
            field3556 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public static final void method1270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class177 var5 = (class177) class64.field1163.method1051(arg0 ^ 0xFFFFFFFE, (long) arg1);
        field3554++;
        if (arg0 != 1) {
            field3551 = null;
        }
        if (var5 == null) {
            var5 = new class177();
            class64.field1163.method1054((long) arg1, var5, arg0 - 2);
        }
        if (var5.field3555.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field3555.length; var8++) {
                var7[var8] = var5.field3555[var8];
                var6[var8] = var5.field3553[var8];
            }
            for (int var9 = var5.field3555.length; var9 < arg3; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field3553 = var6;
            var5.field3555 = var7;
        }
        var5.field3555[arg3] = arg4;
        var5.field3553[arg3] = arg2;
    }
}
