import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class210 extends class421 {

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field3348 = 1;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    public static int[] field3353 = new int[8];

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public static int[] field3354 = new int[50];

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field3355 = 0;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Ls;")
    public static class186 field3360;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field3354 = null;
        field3353 = null;
        if (arg0 == 1) {
            field3360 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Z")
    public final boolean method19(byte arg0) {
        if (arg0 <= 121) {
            return false;
        } else {
            field3349++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BIIII)V")
    public static final void method1431(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= -77) {
            field3353 = null;
        }
        field3350++;
        if (arg4 <= arg2) {
            return;
        }
        int var6 = arg4 - arg2 >> 2;
        int var7 = arg2 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var7++] = 1;
                }
            }
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)I")
    public abstract int method227(byte arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBILvs;Lza;ZI)V")
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 == 93) {
            field3351++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1432(int arg0, String arg1, int arg2) {
        field3356++;
        class18 var3 = class140.method1047(arg0, arg2, false);
        var3.method122(true);
        var3.field301 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public final void method12(int arg0) {
        field3346++;
        int var2 = -76 / ((-arg0 - 35) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIII)V")
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3347 = arg0;
        this.field3344 = arg2;
        this.field3345 = arg1;
        this.field3357 = arg6;
        this.field3352 = arg5;
        this.field3359 = arg4;
        this.field3358 = arg3;
    }

    static {
        new class309("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3360 = new class186(105, 3);
    }
}
