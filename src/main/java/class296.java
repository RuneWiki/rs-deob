import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class296 extends class177 {

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "Lcj;")
    public class301 field5015;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Lbe;")
    public static class283 field5016 = class153.method941(-7, "p12_full");

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "Lbe;")
    public static class283 field5017 = class153.method941(24, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "[Lbe;")
    public static class283[] field5014 = new class283[100];

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "[I")
    public static int[] field5018;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z[B)Lik;", line = 5)
    public static final class244 method2010(boolean arg0, byte[] arg1) {
        field5019++;
        if (arg1 == null) {
            return null;
        }
        if (arg0) {
            field5014 = (class283[]) null;
        }
        class285 var2 = new class285(arg1, class247.field4226, class232.field3933, class202.field3451, class201.field3440, class256.field4329);
        class88.method571(-4);
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V", line = 25)
    public static final void method2011(boolean arg0, String arg1, Throwable arg2) {
        field5021++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class182.method1205(arg2, !arg0);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (!arg0) {
                method2011(true, (String) null, (Throwable) null);
            }
            if (class242.field4088.field4272 == null) {
                return;
            }
            class310 var8 = class242.field4088.method1710(0, new URL(class242.field4088.field4272.getCodeBase(), "clienterror.ws?c=" + class137.field2281 + "&u=" + class184.field3174 + "&v1=" + class251.field4256 + "&v2=" + class251.field4264 + "&e=" + var7));
            while (var8.field5293 == 0) {
                class2.method11((byte) -20, 1L);
            }
            if (var8.field5293 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field5296;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)Lbe;", line = 91)
    public static final class283 method2012(int arg0, byte arg1) {
        field5020++;
        int var2 = 122 % ((arg1 - 52) / 54);
        return class210.method1385(-3, false, arg0, 10);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lcj;)V", line = 103)
    public class296(class301 arg0) {
        this.field5015 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)V", line = 134)
    public static void method2013(int arg0) {
        field5017 = null;
        field5014 = null;
        field5018 = null;
        if (arg0 != 95) {
            field5017 = (class283) null;
        }
        field5016 = null;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)Lnh;", line = 148)
    public static final class107 method2014(byte arg0) {
        field5024++;
        int var1 = class202.field3451[0] * class201.field3440[0];
        int var2 = 3 % ((arg0 + 74) / 35);
        byte[] var3 = class256.field4329[0];
        int[] var4 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            var4[var5] = field5018[class178.method1174(255, var3[var5])];
        }
        class266 var6 = new class266(class197.field3372, class193.field3301, class247.field4226[0], class232.field3933[0], class202.field3451[0], class201.field3440[0], var4);
        class88.method571(-4);
        return var6;
    }
}
