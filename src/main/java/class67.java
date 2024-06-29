import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class67 extends class175 {

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "[F")
    public static float[] field952 = new float[16384];

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "[F")
    public static float[] field953 = new float[16384];

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Lla;")
    public static class319 field956;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Liv;")
    public static class65 field957;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "B")
    public byte field947;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "Lnj;")
    public class164 field951;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field952[var2] = (float) Math.sin((double) var2 * var0);
            field953[var2] = (float) Math.cos((double) var2 * var0);
        }
        field955 = -1;
        new class446("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field956 = new class319(36, -2);
        field957 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 8)
    public static void method477(boolean arg0) {
        field952 = null;
        field953 = null;
        if (arg0) {
            method477(false);
        }
        field957 = null;
        field956 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method478(int arg0, int arg1, int arg2) {
        ++field949;
        if (arg0 != 458752) {
            field957 = null;
        }
        return class37.method317(arg2, arg1, false) | (arg1 & 458752) != 0 || class418.method2556(arg0 ^ -458880, arg1, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)I", line = 44)
    public final int method479(int arg0) {
        ++field950;
        if (arg0 != 0) {
            return 121;
        } else {
            return this.field951 == null ? 0 : this.field951.field2185 * 100 / (this.field951.field2219.length + -this.field947);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)[B", line = 58)
    public final byte[] method480(byte arg0) {
        if (arg0 != 118) {
            return null;
        } else {
            ++field954;
            if (!super.field2342 && this.field951.field2185 >= this.field951.field2219.length + -this.field947) {
                return this.field951.field2219;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
