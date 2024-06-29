import java.awt.datatransfer.Clipboard;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field29 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lch;")
    public static class151 field27 = new class151("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field31;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[[[I")
    public static int[][][] field32;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[B", line = 14)
    public static final byte[] method29(int arg0, byte arg1) {
        field28++;
        class205 var2 = (class205) class291.field4122.method917(-6700, (long) arg0);
        if (arg1 >= -17) {
            return null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class424.method2524(var4, var7, (byte) -85);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class205(var3);
            class291.field4122.method922((long) arg0, 78, var2);
        }
        return var2.field3004;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 62)
    public static void method30(byte arg0) {
        field32 = null;
        if (arg0 != 66) {
            method30((byte) -103);
        }
        field27 = null;
        field31 = null;
    }
}
