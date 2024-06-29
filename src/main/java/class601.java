import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class601 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8772 = new String[100];

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field8775 = -1;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lea;")
    public static class474 field8770 = new class474("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "F")
    public static float field8778;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Ln;")
    public static class16 field8769;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Ltq;")
    public static class545 field8773;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lkb;")
    public class601 field8771;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lkb;")
    public class601 field8777;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    public static int[] field8779;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method3486(byte arg0) {
        field8773 = null;
        field8769 = null;
        field8779 = null;
        if (arg0 <= 15) {
            field8779 = null;
        }
        field8770 = null;
        field8772 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(FZII[FFIIFIIII)V")
    public static final void method3487(float arg0, boolean arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg11 - arg2;
        int var14 = arg7 - arg10;
        int var15 = arg9 - arg12;
        field8776++;
        float var16 = arg4[2] * (float) var14 + arg4[0] * (float) var15 + arg4[1] * (float) var13;
        float var17 = arg4[5] * (float) var14 + arg4[3] * (float) var15 + arg4[4] * (float) var13;
        float var18 = arg4[8] * (float) var14 + arg4[7] * (float) var13 + arg4[6] * (float) var15;
        if (!arg1) {
            field8779 = null;
        }
        float var19;
        float var20;
        if (arg6 == 0) {
            var19 = arg5 + var16 + 0.5F;
            var20 = arg8 + 0.5F - var18;
        } else if (arg6 == 1) {
            var20 = arg8 + var18 + 0.5F;
            var19 = arg5 + var16 + 0.5F;
        } else if (arg6 == 2) {
            var19 = arg5 + 0.5F - var16;
            var20 = arg0 + 0.5F - var17;
        } else if (arg6 == 3) {
            var20 = arg0 + 0.5F - var17;
            var19 = arg5 + var16 + 0.5F;
        } else if (arg6 == 4) {
            var20 = arg0 + 0.5F - var17;
            var19 = arg8 + var18 + 0.5F;
        } else {
            var19 = arg8 + 0.5F - var18;
            var20 = arg0 + 0.5F - var17;
        }
        if (arg3 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg3 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg3 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class103.field1242 = var20;
        class2.field15 = var19;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public final void method3488(boolean arg0) {
        field8774++;
        if (!arg0 && this.field8777 != null) {
            this.field8777.field8771 = this.field8771;
            this.field8771.field8777 = this.field8777;
            this.field8771 = null;
            this.field8777 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method3489(int arg0) {
        if (arg0 != -1) {
            method3486((byte) 35);
        }
        class444.field6646 = true;
        field8768++;
    }
}
