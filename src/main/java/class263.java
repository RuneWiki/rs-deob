import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class263 extends class132 {

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    private int field3339;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "F")
    public static float field3331;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
    public static int[] field3341;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field3338;

    static {
        new class169("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3331 = 1.0F;
        new class169("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field3341 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Llf;Llf;B)V", line = 9)
    public static final void method1644(class508 arg0, class508 arg1, byte arg2) {
        ++field3328;
        if (arg1.field7455 != null) {
            arg1.method3021(85);
        }
        arg1.field7455 = arg0.field7455;
        arg1.field7454 = arg0;
        arg1.field7455.field7454 = arg1;
        int var3 = 18 % ((arg2 - -49) / 62);
        arg1.field7454.field7455 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)V", line = 36)
    public final void method927(int arg0, int arg1, byte arg2) {
        ++field3338;
        int var4 = this.field3327 * arg1 >> 12;
        int var5 = this.field3332 * arg0 >> 12;
        int var6 = this.field3333 * arg1 >> 12;
        int var7 = -19 % ((arg2 - -47) / 33);
        int var8 = this.field3339 * arg0 >> 12;
        int var9 = this.field3337 * arg1 >> 12;
        int var10 = this.field3340 * arg0 >> 12;
        int var11 = this.field3335 * arg1 >> 12;
        int var12 = this.field3334 * arg0 >> 12;
        class286.method1741(super.field1792, true, var5, var4, var12, var10, var6, var9, var11, var8);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 62)
    public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3335 = arg6;
        this.field3333 = arg2;
        this.field3334 = arg7;
        this.field3340 = arg5;
        this.field3339 = arg3;
        this.field3337 = arg4;
        this.field3327 = arg0;
        this.field3332 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 78)
    public static void method1645(int arg0) {
        field3341 = null;
        if (arg0 != -5327) {
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZI)V", line = 88)
    public final void method929(int arg0, boolean arg1, int arg2) {
        ++field3329;
        if (!arg1) {
            method1645(-55);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V", line = 99)
    public final void method928(int arg0, int arg1, int arg2) {
        ++field3330;
        if (arg2 != 0) {
            this.method927(-52, -25, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZII)V", line = 115)
    public static final void method1646(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field3336;
        float var5 = (float) class230.field2978 / (float) class230.field2970;
        int var6 = arg3;
        int var7 = arg4;
        if (arg2) {
            field3331 = -2.457576F;
        }
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg0 - (-var7 + arg4) / 2;
        int var9 = arg1 - (-var6 + arg3) / 2;
        class346.field4413 = -(class230.field2978 * var8 / var7) + class230.field2978;
        class203.field2665 = -1;
        class267.field3389 = class230.field2970 * var9 / var6;
        class294.field3816 = -1;
        class60.method342((byte) 90);
    }
}
