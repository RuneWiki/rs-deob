import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class509 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field7481 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7480 = new CRC32();

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lof;")
    public static class446 field7482 = new class446("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    public static int[] field7485 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lof;")
    public static class446 field7486 = new class446("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Ltk;")
    public static class233 field7483;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ldg;")
    public static class289 field7484;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[[S")
    public static short[][] field7487;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method3050(byte arg0) {
        field7485 = null;
        field7480 = null;
        field7484 = null;
        field7487 = null;
        field7482 = null;
        field7483 = null;
        int var1 = -48 % ((22 - arg0) / 37);
        field7486 = null;
    }
}
