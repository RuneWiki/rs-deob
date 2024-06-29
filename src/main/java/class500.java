import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class500 extends class395 {

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field7229 = 0;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[Lkg;")
    public static class183[] field7228 = new class183[14];

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lbd;")
    public static class44 field7226 = new class44("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
    public static int[] field7231 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[I")
    public static int[] field7232 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lbl;")
    public static final class468 method2921(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2764;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method2922(int arg0) {
        field7226 = null;
        if (arg0 <= 10) {
            method2921(-36, 19, -51);
        }
        field7228 = null;
        field7232 = null;
        field7231 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)Z")
    public static final boolean method2923(byte arg0) {
        field7230++;
        try {
            if (arg0 != -122) {
                field7226 = null;
            }
            return class543.method3183((byte) 117);
        } catch (IOException var4) {
            class230.method1540(513);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class30.field405 == null ? -1 : class30.field405.method1997(0)) + "," + (class269.field4041 == null ? -1 : class269.field4041.method1997(0)) + "," + (class501.field7244 == null ? -1 : class501.field7244.method1997(0)) + " - " + class305.field4527 + "," + (class364.field5293.field343[0] + class82.field1315) + "," + (class501.field7240 + class364.field5293.field344[0]) + " - ";
            for (int var3 = 0; class305.field4527 > var3 && var3 < 50; var3++) {
                var2 = var2 + class336.field4966.field7545[var3] + ",";
            }
            class266.method1710((byte) 81, var5, var2);
            class391.method2358(false, -126);
            return true;
        }
    }
}
