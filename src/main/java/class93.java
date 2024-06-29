import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class93 extends class80 {

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Lpb;")
    public class465 field1247;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lfg;")
    public static class83 field1244 = new class83("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Luf;")
    public static class310 field1246 = new class310(89, 7);

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Lfg;")
    public static class83 field1249 = new class83("K", "T", "K", "K");

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IF[FIBIIIII)V", line = 3)
    public static final void method624(int arg0, float arg1, float[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 40 / ((-arg4 - 46) / 51);
        int var11 = arg9 - arg8;
        field1245++;
        int var12 = arg3 - arg5;
        int var13 = arg0 - arg7;
        float var14 = arg2[2] * (float) var13 + arg2[0] * (float) var11 + arg2[1] * (float) var12;
        float var15 = arg2[5] * (float) var13 + arg2[3] * (float) var11 + arg2[4] * (float) var12;
        float var16 = arg2[8] * (float) var13 + arg2[6] * (float) var11 + arg2[7] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg1 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg6 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg6 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg6 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        class238.field3269 = var19;
        class166.field2350 = var18;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 60)
    public static void method625(int arg0) {
        int var1 = -90 / ((arg0 - 8) / 51);
        field1244 = null;
        field1246 = null;
        field1249 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lpb;)V", line = 71)
    public class93(class465 arg0) {
        this.field1247 = arg0;
    }
}
