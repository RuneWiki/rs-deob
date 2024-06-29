import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class269 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ldv;")
    public static class566 field3758 = new class566(46, -1);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public static int[] field3761;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lrw;")
    public static class645 field3760;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
    public static short[] field3762;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lan;")
    public static class21 field3759;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1752(int arg0) {
        if (arg0 != 46) {
            return;
        }
        field3758 = null;
        field3762 = null;
        field3760 = null;
        field3759 = null;
        field3761 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([II[IILgi;I)Lmaa;")
    public static final class401 method1753(int[] arg0, int arg1, int[] arg2, int arg3, class583 arg4, int arg5) {
        field3756++;
        byte[] var6 = new byte[arg3 * arg5];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg5 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg1 != -1) {
            field3755 = 88;
        }
        return new class401(arg4, arg5, arg3, var6);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
    public static final boolean method1754(int arg0, int arg1, int arg2) {
        if (arg2 >= -106) {
            method1753(null, -108, null, 101, null, -113);
        }
        field3757++;
        return class97.method691(arg0, arg1, -2) || class575.method3278(-5, arg0, arg1);
    }

    static {
        new class104("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field3761 = new int[1000];
        field3760 = new class645("WIP", 2);
        field3762 = new short[256];
    }
}
