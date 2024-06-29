import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class343 {

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field5048 = -1;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field5043 = -2;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[S")
    public static short[] field5047 = new short[] { 8, 25, 10, 9, 15, 20, 6, 51 };

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lbn;")
    public static class160 field5045 = new class160(44, -1);

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "[I")
    public static int[] field5052;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lvq;")
    public static class24 field5050;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lct;")
    public static class104 field5046;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Lic;")
    public static class235 field5051;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Ltg;")
    public static class304 field5049;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjj;)Ljj;")
    public abstract class163 method236(int arg0, class163 arg1);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method2228(int arg0) {
        field5045 = null;
        field5047 = null;
        if (arg0 != 1) {
            return;
        }
        field5052 = null;
        field5046 = null;
        field5049 = null;
        field5050 = null;
        field5051 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)I")
    public static final int method2229(int arg0, int arg1) {
        field5044++;
        int var2 = arg1 & 0x3F;
        if (arg0 > -113) {
            method2228(-77);
        }
        int var3 = (arg1 & 0xCE) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    static {
        new class409("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field5052 = new int[100];
        field5050 = new class24(58, 8);
    }
}
