import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class501 extends class508 {

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
    private int field7367;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public int field7357;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    private int field7356;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    private int field7355;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    private int field7358;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
    private int field7363;

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public int field7368;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "[[I")
    public static int[][] field7366;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "Loi;")
    public static class169 field7371;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "Lhb;")
    public static class250 field7372;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "Lvj;")
    public static class310 field7373;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method2990(int arg0) {
        field7372 = null;
        field7373 = null;
        if (arg0 != 10) {
            field7366 = null;
        }
        field7371 = null;
        field7366 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(CZI)I")
    public static final int method2991(char arg0, boolean arg1, int arg2) {
        field7365++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg1) {
            if (arg0 == 'ñ' && arg2 == 0) {
                var3 = 1762;
            }
            return var3;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
    public final boolean method2992(int arg0, int arg1, int arg2) {
        if (arg2 != 1590627556) {
            method2991('?', false, -10);
        }
        field7362++;
        return arg0 >= this.field7355 && this.field7367 >= arg0 && this.field7363 <= arg1 && this.field7356 >= arg1;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[III)V")
    public final void method2993(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = this.field7358;
        arg1[1] = this.field7355 - (this.field7369 - arg0);
        field7360++;
        if (arg2 != 241) {
            this.method2992(19, -83, 3);
        }
        arg1[2] = arg3 - (this.field7359 - this.field7363);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
    public final boolean method2994(int arg0, int arg1, byte arg2) {
        if (arg2 <= 93) {
            this.method2993(-126, null, -42, 120);
        }
        field7361++;
        return arg0 >= this.field7369 && this.field7368 >= arg0 && this.field7359 <= arg1 && arg1 <= this.field7357;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII[I)V")
    public final void method2995(byte arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[1] = -this.field7355 - (-this.field7369 - arg2);
        arg3[2] = -this.field7363 - (-this.field7359 - arg1);
        int var5 = 15 % ((-arg0 - 60) / 47);
        field7370++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)Z")
    public final boolean method2996(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 8) {
            this.field7359 = -104;
        }
        field7354++;
        return this.field7358 == arg3 && this.field7355 <= arg0 && arg0 <= this.field7367 && arg1 >= this.field7363 && arg1 <= this.field7356;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7367 = arg3;
        this.field7357 = arg8;
        this.field7356 = arg4;
        this.field7355 = arg1;
        this.field7358 = arg0;
        this.field7363 = arg2;
        this.field7368 = arg7;
        this.field7359 = arg6;
        this.field7369 = arg5;
    }

    static {
        new class169(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field7364 = -1;
        field7366 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
        new class169("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field7371 = new class169(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
        field7372 = new class250(62, 4);
    }
}
