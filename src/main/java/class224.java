import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class224 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2862 = 0;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "Z")
    public static boolean field2866;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "[S")
    public static short[] field2867;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "Lgaa;")
    public static class279 field2863;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "Lrn;")
    public static class307 field2868;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
    public static final int method1427(int arg0, int arg1) {
        if (arg1 < 96) {
            field2862 = 123;
        }
        field2864++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/io/File;II)[B")
    public static final byte[] method1428(File arg0, int arg1, int arg2) {
        field2865++;
        try {
            byte[] var3 = new byte[arg1];
            class520.method2899((byte) 120, var3, arg0, arg1);
            return arg2 == -26007 ? var3 : null;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public static void method1429(int arg0) {
        field2868 = null;
        if (arg0 == 0) {
            field2867 = null;
            field2863 = null;
        }
    }

    static {
        new class344("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field2866 = false;
        field2867 = new short[256];
    }
}
