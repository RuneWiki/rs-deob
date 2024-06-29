import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class280 {

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "Lhc;")
    public static class368 field3807 = new class368("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[I")
    public static int[] field3809 = new int[14];

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lci;")
    public static class389 field3810;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
    public static final void method1761(int arg0, int arg1, int arg2) {
        field3808++;
        class279 var3 = class32.method300(arg0 ^ 0xFFFFFF8F, arg1);
        int var4 = var3.field3796;
        int var5 = var3.field3800;
        int var6 = var3.field3797;
        int var7 = class194.field2802[var6 - var5];
        if (arg2 < arg0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class133.method991(var4, arg2 << var5 & var8 | ~var8 & class13.field121[var4], 1255678057);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method1762(int arg0) {
        if (arg0 != 0) {
            method1762(-17);
        }
        field3810 = null;
        field3807 = null;
        field3809 = null;
    }
}
