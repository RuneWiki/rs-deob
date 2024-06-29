import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field184 = new CRC32();

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[Lwo;")
    public static class533[] field187 = new class533[128];

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Ltn;")
    public static class60 field186 = new class60(67, 16);

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[I")
    public static int[] field188 = new int[2];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method77(int arg0) {
        field186 = null;
        field188 = null;
        field184 = null;
        field187 = null;
        if (arg0 != 2) {
            field186 = null;
        }
    }
}
