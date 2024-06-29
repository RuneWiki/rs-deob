import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class92 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lmb;")
    public static class132 field1625 = class166.method1092("VOLL", 111);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1626 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lmb;")
    public static class132 field1628 = class166.method1092("(Y", 118);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lq;")
    public static class174 field1627 = new class174(5);

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lmb;")
    public static class132 field1630 = class166.method1092("::autoshadow off", 111);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
    public static int[] field1631 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
    public static int[] field1632 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    public static int[] field1629;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BI)V")
    public abstract void method570(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method571(String arg0, Throwable arg1, int arg2) {
        if (arg2 <= 16) {
            method571(null, null, 22);
        }
        field1624++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class226.method1442(arg1, 28737);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class37.field614.field1405 != null) {
                class120 var8 = class37.field614.method513(new URL(class37.field614.field1405.getCodeBase(), "clienterror.ws?c=" + class160.field2912 + "&u=" + class81.field1370 + "&v1=" + class83.field1404 + "&v2=" + class83.field1390 + "&e=" + var7), 0);
                while (var8.field2264 == 0) {
                    class130.method856(1, 1L);
                }
                if (var8.field2264 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2269;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
    public abstract byte[] method572(byte arg0);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static void method573(byte arg0) {
        field1629 = null;
        field1626 = null;
        field1632 = null;
        int var1 = -99 / ((arg0 + 65) / 51);
        field1627 = null;
        field1628 = null;
        field1625 = null;
        field1631 = null;
        field1630 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Z")
    public static final boolean method574(byte arg0, int arg1) {
        if (arg0 != 51) {
            field1628 = null;
        }
        field1623++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
