import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class134 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "[I")
    public static int[] field2121 = new int[100];

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lik;")
    public static class259 field2127 = new class259(30);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "[Lgk;")
    public static class7[] field2125;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method1007(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class62 var2 = (class62) class42.field748.method833(false, (long) arg0);
        field2128++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field961.length; var3++) {
                var2.field961[var3] = -1;
                var2.field963[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 36)
    public static final int method1008(int arg0, String arg1, int arg2) {
        field2129++;
        return arg0 == 1 ? class232.method1674(arg2, true, arg1, true) : -99;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 47)
    public static final void method1009(int arg0, String arg1, Throwable arg2) {
        field2124++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = client.method1791(arg2, 32);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class200.method1453(var3, (byte) 117);
            String var4 = class220.method1589(":", 103, var3, "%3a");
            String var5 = class220.method1589("@", 84, var4, "%40");
            String var6 = class220.method1589("&", 95, var5, "%26");
            String var7 = class220.method1589("#", 68, var6, "%23");
            if (class310.field4877.field5052 == null) {
                return;
            }
            class21 var8 = class310.field4877.method2236(arg0 ^ 0xFFFFFF8A, new URL(class310.field4877.field5052.getCodeBase(), "clienterror.ws?c=" + class56.field892 + "&u=" + class6.field75 + "&v1=" + class325.field5045 + "&v2=" + class325.field5047 + "&e=" + var7));
            while (var8.field387 == 0) {
                class279.method1991(108, 1L);
            }
            if (~var8.field387 == arg0) {
                DataInputStream var9 = (DataInputStream) var8.field391;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 100)
    public static final void method1010(int arg0) {
        class65.field1059++;
        field2126++;
        class269.field4191.method246(false, 113);
        class269.field4191.method772((byte) -114, class242.method1719(arg0));
        class269.field4191.method728(class180.field2880, 1234856744);
        class269.field4191.method728(class73.field1127, 1234856744);
        class269.field4191.method772((byte) -75, class141.field2240);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lob;B)Lob;", line = 115)
    public static final class292 method1011(class292 arg0, byte arg1) {
        field2123++;
        if (arg0.field4587 != -1) {
            return class215.method1555((byte) -48, arg0.field4587);
        }
        if (arg1 > -72) {
            field2121 = (int[]) null;
        }
        int var2 = arg0.field4531 >>> 16;
        class185 var3 = new class185(class268.field4148);
        for (class224 var4 = (class224) var3.method1389(-128); var4 != null; var4 = (class224) var3.method1387(3)) {
            if (var4.field3596 == var2) {
                return class215.method1555((byte) -48, (int) var4.field3734);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 151)
    public static void method1012(int arg0) {
        field2127 = null;
        field2125 = null;
        if (arg0 > -82) {
            field2122 = -93;
        }
        field2121 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 165)
    public static final void method1013(int arg0) {
        if (arg0 != -26724) {
            field2127 = (class259) null;
        }
        field2120++;
        try {
            if (class326.field5060 == 1) {
                int var1 = class45.field769.method285((byte) 81);
                if (var1 > 0 && class45.field769.method273(false)) {
                    int var2 = var1 - class312.field4900;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class45.field769.method267(var2, -125);
                    return;
                }
                class45.field769.method282(0);
                class45.field769.method300(10599);
                if (class34.field572 == null) {
                    class326.field5060 = 0;
                } else {
                    class326.field5060 = 2;
                }
                class16.field320 = null;
                class62.field956 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class45.field769.method282(0);
            class34.field572 = null;
            class62.field956 = null;
            class16.field320 = null;
            class326.field5060 = 0;
        }
    }
}
