import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class697 {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public int field9823;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Liba;")
    public static class211 field9814 = new class211(23, 4);

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[C")
    public static char[] field9822 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field9821 = -1;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Liba;")
    public static class211 field9819 = new class211(83, 4);

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field9826 = 0;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field9824 = null;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "F")
    public static float field9815;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[[I")
    public static int[][] field9813;

    static {
        new class355("", 73);
        field9828 = 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[SB)[S", line = 9)
    public static final short[] method3916(int arg0, short[] arg1, byte arg2) {
        field9818++;
        short[] var3 = new short[arg0];
        int var4 = -55 % ((-arg2 - 26) / 43);
        class667.method3742(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIIII)V", line = 30)
    public static final void method3917(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class153.field2163 = arg1;
        class488.field6937 = arg2;
        field9812++;
        class658.field9397 = arg3;
        class62.field989 = arg4;
        if (arg0 != 102) {
            method3918(-120);
        }
    }

    @OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;", line = 55)
    public final String toString() {
        field9817++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 63)
    public static void method3918(int arg0) {
        if (arg0 < 77) {
            return;
        }
        field9814 = null;
        field9819 = null;
        field9813 = null;
        field9822 = null;
        field9824 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)[Lnb;", line = 77)
    public static final class318[] method3919(boolean arg0) {
        field9820++;
        return arg0 ? null : new class318[] { class280.field3708, class564.field8247, class353.field5240, class448.field6497, class436.field6358, class276.field3594 };
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V", line = 91)
    public class697(int arg0, int arg1) {
        this.field9823 = arg0;
    }
}
