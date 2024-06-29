import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Lna;")
    public static class26 field45 = class6.method40(" )2 ", 48);

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "Lna;")
    public static class26 field52 = class6.method40("Please wait)3)3)3 Rendering Map", 48);

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "Z")
    public static volatile boolean field54 = true;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Lna;")
    public static class26 field47 = class6.method40("Skirt Shop", 48);

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "Lna;")
    public static class26 field53 = class6.method40("Helmet Shop", 48);

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "B")
    public byte field43;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Lia;")
    public static class16 field50;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field44;

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Ljava/lang/String;")
    public static String field51;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "[B")
    public static byte[] field42;

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "[B")
    public byte[] field49;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "[I")
    public static int[] field46;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 39)
    public final void method24(int arg0) {
        boolean var2 = true;
        if (arg0 <= 98) {
            field50 = null;
        }
        if (this.field49 == null) {
            return;
        }
        this.field43 = this.field49[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field49[var3] != this.field43) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field49 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)V", line = 81)
    public static void method25(int arg0) {
        field44 = null;
        if (arg0 != 0) {
            return;
        }
        field45 = null;
        field47 = null;
        field53 = null;
        field52 = null;
        field50 = null;
        field51 = null;
        field42 = null;
        field46 = null;
    }
}
