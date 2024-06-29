import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class275 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[C")
    public static char[] field4036 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "J")
    public static long field4037 = 0L;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
    public static long field4041 = 0L;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Laa;")
    public class275 field4040;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Laa;")
    public class275 field4042;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public final void method1754(byte arg0) {
        field4038++;
        if (this.field4042 == null) {
            return;
        }
        this.field4042.field4040 = this.field4040;
        this.field4040.field4042 = this.field4042;
        if (arg0 != 71) {
            field4039 = 22;
        }
        this.field4042 = null;
        this.field4040 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1755(int arg0) {
        if (arg0 == 199) {
            field4036 = null;
        }
    }
}
