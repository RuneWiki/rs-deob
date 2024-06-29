import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class228 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ljp;")
    public static class55 field3448;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[F")
    public static float[] field3450;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lpu;")
    public static class179 field3451;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[F")
    public static float[] field3455;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    public static int[] field3449;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJIILta;Lfi;I)V")
    public static final void method1553(int arg0, int arg1, int arg2, long arg3, int arg4, int arg5, class340 arg6, class38 arg7, int arg8) {
        field3446++;
        int var10 = arg0 * arg0 + (arg2 * arg2);
        if ((long) var10 > arg3) {
            return;
        }
        int var11 = Math.min(arg7.field629 / 2, arg7.field591 / 2);
        if (arg5 != 7270) {
            return;
        }
        if (var11 * var11 >= var10) {
            class408.method2574(arg6, arg0, -32068, arg4, class456.field6786[arg1], arg8, arg7, arg2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class33.field401 == 4) {
            var12 = (int) class434.field6466 & 0x3FFF;
        } else {
            var12 = (int) class434.field6466 + class484.field7096 & 0x3FFF;
        }
        int var13 = class58.field891[var12];
        int var14 = class58.field889[var12];
        if (class33.field401 != 4) {
            var14 = var14 * 256 / (class195.field3064 + 256);
            var13 = var13 * 256 / (class195.field3064 + 256);
        }
        int var15 = arg0 * var14 + arg2 * var13 >> 15;
        int var16 = arg2 * var14 - arg0 * var13 >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class58.field893[arg1].method2317((float) arg7.field629 / 2.0F + (float) arg8 + (float) var19, (float) arg7.field591 / 2.0F + (float) arg4 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1554(int arg0) {
        field3448 = null;
        field3451 = null;
        field3450 = null;
        field3455 = null;
        if (arg0 != 16) {
            method1553(111, -24, 68, -1L, -32, 67, null, null, 111);
        }
        field3449 = null;
    }

    static {
        new class179("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field3448 = new class55(30, 10);
        field3450 = new float[4];
        field3451 = new class179("white:", "weiss:", "blanc:", "branco:");
        field3454 = 1;
        field3455 = new float[16];
    }
}
