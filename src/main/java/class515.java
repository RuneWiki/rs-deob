import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class515 extends class417 {

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field7347;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lh;")
    public static class572 field7348 = new class572("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[C")
    public static char[] field7352 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "F")
    public static float field7351;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "J")
    public static long field7350;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Ljc;")
    public static class374 field7349;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
    public static final byte[] method3052(int arg0, Object arg1, int arg2, int arg3) {
        field7345++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class432.method2525(arg2, arg0, var4, 117);
        } else if (arg1 instanceof class291) {
            class291 var5 = (class291) arg1;
            return var5.method1791((byte) -11, arg2, arg0);
        } else {
            if (arg3 != 244) {
                field7349 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method3053(int arg0) {
        if (arg0 == 231) {
            field7352 = null;
            field7348 = null;
            field7349 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3054(String arg0, byte arg1) {
        System.exit(1);
        field7346++;
        int var2 = -64 / ((arg1 - 30) / 37);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
    public class515(int arg0, int arg1) {
        this.field7347 = arg0;
        this.field7344 = arg1;
    }
}
