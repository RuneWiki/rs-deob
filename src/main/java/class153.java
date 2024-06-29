import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class153 {

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field2151 = 0;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "S")
    public static short field2150 = 256;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lhu;")
    public static class76 field2152;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2149;

    static {
        new class206("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field2152 = new class76(8);
        field2153 = 765;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILbt;)V", line = 8)
    public final void method900(int arg0, class32 arg1) {
        field2149++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method201((byte) -106);
            if (var3 == 0) {
                return;
            }
            this.method904(5, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[S)[S", line = 28)
    public static final short[] method901(int arg0, short[] arg1) {
        field2145++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class380.method2333(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 44)
    public static final void method902(int arg0) {
        class343.field4588 = -1;
        class124.field1817 = -1;
        field2146++;
        class455.field6170 = 0;
        class345.field4761 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 56)
    public static void method903(int arg0) {
        field2152 = null;
        if (arg0 != -1) {
            field2148 = 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILbt;)V", line = 75)
    private final void method904(int arg0, int arg1, class32 arg2) {
        field2147++;
        if (arg0 == arg1) {
            this.field2151 = arg2.method215((byte) 111);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I", line = 89)
    public static final int method905(int arg0) {
        field2144++;
        return arg0 == 16 ? 16 : -22;
    }
}
