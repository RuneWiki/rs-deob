import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class69 extends class449 {

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Ljava/lang/String;")
    public String field1007;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Lch;")
    public static class151 field1006 = new class151("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[I")
    public static int[] field1011 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field1010 = 2;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[I")
    public static int[] field1008 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Lch;")
    public static class151 field1014 = new class151("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Ljm;")
    public static class271 field1012;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Lnl;")
    public static class435 field1009;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIBI)V")
    public static final void method638(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; var5 < class173.field2636; var5++) {
            Rectangle var6 = class341.field4711[var5];
            if (var6.x + var6.width > arg2 && arg1 + arg2 > var6.x && arg4 < (var6.y + var6.height) && arg0 + arg4 > var6.y) {
                class424.field5879[var5] = true;
            }
        }
        if (arg3 < 44) {
            field1014 = null;
        }
        field1005++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZI)V")
    public static final void method639(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method641(-35, -1.054984766628271D);
        }
        field1013++;
        class334 var3 = class352.method2172(arg0, 5, 16711935);
        var3.method2104(0);
        var3.field4648 = arg2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BC)Z")
    public static final boolean method640(byte arg0, char arg1) {
        if (arg0 != 83) {
            return true;
        }
        field1003++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class130.field1784;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ID)V")
    public static final void method641(int arg0, double arg1) {
        field1004++;
        if (class352.field4837 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class57.field837[var3] = var4 <= 255 ? var4 : 255;
            }
            class352.field4837 = arg1;
        }
        if (arg0 != 2) {
            method641(-41, -0.8034307046940321D);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method642(byte arg0) {
        if (arg0 >= -99) {
            method642((byte) 97);
        }
        field1011 = null;
        field1014 = null;
        field1008 = null;
        field1006 = null;
        field1012 = null;
        field1009 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class69() {
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class69(String arg0) {
        this.field1007 = arg0;
    }
}
