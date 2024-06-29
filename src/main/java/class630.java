import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class630 extends class601 {

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9089 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "[I")
    public static int[] field9091 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "Z")
    public static volatile boolean field9093 = true;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "[[I")
    public static int[][] field9094;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "Lig;")
    public static class206 field9095;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "F")
    public static float field9085;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public int field9087;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public int field9088;

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
    public int field9092;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "Lva;")
    public class429 field9090;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "[Lsda;")
    public class219[] field9084;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method3607(int arg0, Throwable arg1, String arg2) {
        field9086++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class259.method1729(arg1, (byte) -31);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class251.method1651(arg0 ^ 0x6BEA, var3);
            String var4 = class24.method150(":", var3, (byte) -40, "%3a");
            String var5 = class24.method150("@", var4, (byte) -40, "%40");
            String var6 = class24.method150("&", var5, (byte) -40, "%26");
            String var7 = class24.method150("#", var6, (byte) -40, "%23");
            if (class59.field679 != null) {
                class175 var8 = class32.field356.method3162(new URL(class59.field679.getCodeBase(), "clienterror.ws?c=" + class508.field7387 + "&u=" + class123.field1538 + "&v1=" + class545.field7798 + "&v2=" + class545.field7787 + "&e=" + var7), (byte) 79);
                while (var8.field2138 == 0) {
                    class646.method3696(1, 1L);
                }
                if (arg0 != 7) {
                    method3607(-77, null, null);
                }
                if (var8.field2138 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2140;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIBII)V")
    public static final void method3608(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field9083++;
        if (arg0 - arg3 >= class113.field1385 && class4.field43 >= arg0 + arg3 && class418.field6298 <= (arg2 - arg3) && class461.field6877 >= arg2 + arg3) {
            class512.method3043(arg6, 2, arg5, arg3, arg0, arg1, arg2);
        } else {
            class455.method2810(arg5, arg6, arg2, 12621, arg3, arg0, arg1);
        }
        if (arg4 > -69) {
            field9089 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Loa;III)Z")
    public final boolean method3609(class605 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.method3609(null, -60, -26, 75);
        }
        field9082++;
        if (this.field9084 != null) {
            for (int var5 = 0; var5 < this.field9084.length; var5++) {
                if (this.field9084[var5].method1434(arg3, arg1) && this.field9090.method91(-10503, arg3, arg0, arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(Z)V")
    public static void method3610(boolean arg0) {
        field9091 = null;
        if (arg0) {
            method3608(71, -86, 5, -109, (byte) -81, -11, 2);
        }
        field9095 = null;
        field9089 = null;
        field9094 = null;
    }

    static {
        new class474("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field9094 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
        field9095 = new class206(73, 3);
    }
}
