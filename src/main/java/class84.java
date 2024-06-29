import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class84 extends OutputStream {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Z")
    public static boolean field1193 = false;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[C")
    public static char[] field1198 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lwo;")
    public static class690 field1192 = new class690(73, -1);

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lwo;")
    public static class690 field1200 = new class690(79, -2);

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "J")
    public static long field1197;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lip;")
    public static class656 field1196;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field1199;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method676(boolean arg0) {
        field1192 = null;
        field1196 = null;
        if (!arg0) {
            method676(true);
        }
        field1200 = null;
        field1198 = null;
        field1199 = null;
    }

    @OriginalMember(owner = "client!al", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1194++;
        throw new IOException();
    }
}
