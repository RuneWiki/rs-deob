import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class18 {

    @OriginalMember(owner = "client!as", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field279 = new String[100];

    @OriginalMember(owner = "client!as", name = "f", descriptor = "[[I")
    public static int[][] field283;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lkc;")
    public static class157 field281;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lgv;")
    public static class236 field278;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "[[Z")
    public static boolean[][] field280;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method126(int arg0) {
        field278 = null;
        field281 = null;
        int var1 = -11 % ((-arg0 - 71) / 50);
        field279 = null;
        field280 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method127(String arg0, int arg1, boolean arg2) {
        field282++;
        class40.field597.field6093 = 1;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class534.field7872.field7602; var6++) {
            class297 var9 = class534.field7872.method3089(var6, arg1 ^ 0xFFFFFF9C);
            if ((!arg2 || var9.field4078) && var9.field4050 == -1 && var9.field4046 == -1 && var9.field4009 == 0 && var9.field4068.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class145.field2136 = null;
                    class88.field1426 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class145.field2136 = var4;
        class515.field7538 = 0;
        class88.field1426 = var5;
        String[] var7 = new String[class88.field1426];
        for (int var8 = 0; var8 < class88.field1426; var8++) {
            var7[var8] = class534.field7872.method3089(var4[var8], class373.method2233(arg1, -81)).field4068;
        }
        class507.method3006(var7, class145.field2136, false);
        class40.field597.method2503(~arg1);
        class40.field597.field6093 = arg1;
    }

    static {
        new class157("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field283 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
        field281 = new class157(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
    }
}
