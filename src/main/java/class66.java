import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class66 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/lang/String;")
    public String field904;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lqp;")
    public static class466 field902 = new class466("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field906 = 0;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
    public static int[] field908 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method566(int arg0) {
        if (arg0 != 0) {
            method568(-48, 123, false, -112);
        }
        field908 = null;
        field902 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method567(int arg0, int arg1) {
        int var2 = -110 / ((arg0 - 6) / 53);
        field903++;
        if (!class20.field269.field7638) {
            arg1 = -1;
        }
        if (class414.field6036 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class152 var3 = class253.field3517.method724(arg1, (byte) -96);
            class4 var4 = var3.method1019(0);
            if (var4 == null) {
                arg1 = -1;
            } else {
                class202.field2840.method2955(var4.method17(), var4.method18(), new Point(var3.field2329, var3.field2328), (byte) -120, class426.field6248, var4.method20());
                class414.field6036 = arg1;
            }
        }
        if (arg1 == -1 && class414.field6036 != -1) {
            class202.field2840.method2955(null, -1, new Point(), (byte) -82, class426.field6248, -1);
            class414.field6036 = -1;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZI)I")
    public static final int method568(int arg0, int arg1, boolean arg2, int arg3) {
        field905++;
        class128 var4 = class507.method3024(arg1, arg2, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg3; var6 < var4.field1902.length; var6++) {
                if (var4.field1893[var6] == arg0) {
                    var5 += var4.field1902[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)[Ldn;")
    public static final class357[] method569(int arg0) {
        if (arg0 != 128) {
            field908 = null;
        }
        field901++;
        return new class357[] { class373.field5469, class383.field5593, class498.field7253, class76.field1014, class181.field2670, class74.field1001 };
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class66(String arg0, int arg1) {
        this.field907 = arg1;
        this.field904 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field909++;
        throw new IllegalStateException();
    }
}
