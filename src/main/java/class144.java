import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class144 {

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[S")
    public static short[] field1737 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lre;")
    public static class388 field1733 = new class388();

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lsd;")
    public static class74 field1739 = new class74(73, 7);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Lg;")
    public static class470 field1738;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/lang/String;)V")
    public static final void method678(Throwable arg0, boolean arg1, String arg2) {
        field1731++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class373.method2256(arg0, 40);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class375.method2262(arg1, var3);
            String var4 = class328.method1993("%3a", var3, ":", -1);
            String var5 = class328.method1993("%40", var4, "@", -1);
            String var6 = class328.method1993("%26", var5, "&", -1);
            String var7 = class328.method1993("%23", var6, "#", -1);
            if (class404.field5753.field5106 != null) {
                class405 var8 = class404.field5753.method2158(new URL(class404.field5753.field5106.getCodeBase(), "clienterror.ws?c=" + class324.field4679 + "&u=" + class344.field4929 + "&v1=" + class355.field5100 + "&v2=" + class355.field5104 + "&e=" + var7), 110);
                while (var8.field5759 == 0) {
                    class85.method433(1L, 82);
                }
                if (var8.field5759 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field5755;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method679(byte arg0) {
        for (int var1 = 0; var1 < class200.field2784.length; var1++) {
            for (int var3 = 0; var3 < class200.field2784[var1].length; var3++) {
                class200.field2784[var1][var3] = class288.field4314;
            }
        }
        field1735++;
        int var2 = 28 % ((arg0 - 84) / 40);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public static final void method680(int arg0, int arg1, int arg2) {
        field1732++;
        int var3 = class453.field6394.method2419(false, class440.field6302.method205((byte) 104, class68.field849));
        for (class158 var4 = (class158) class485.field6882.method802((byte) 111); var4 != null; var4 = (class158) class485.field6882.method806((byte) 104)) {
            int var8 = class216.method1208(false, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        if (arg1 != -21571) {
            return;
        }
        int var5 = class223.field3099 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if ((var3 + var6) > class110.field1336) {
            var6 = class110.field1336 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class464.field6541 < var5 + arg2) {
            var7 = class464.field6541 - var5;
        }
        class150.field1822 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class345.field4933 = var3;
        class385.field5517 = true;
        class77.field925 = class223.field3099 * 16 + (class371.field5311 ? 26 : 22);
        class274.field3913 = var7;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBILg;)Lbg;")
    public static final class406 method681(int arg0, byte arg1, int arg2, class470 arg3) {
        if (arg1 > -62) {
            field1738 = null;
        }
        field1734++;
        byte[] var4 = arg3.method2768(-20472, arg0, arg2);
        return var4 == null ? null : new class406(var4);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method682(int arg0) {
        field1737 = null;
        field1739 = null;
        if (arg0 != 8) {
            field1737 = null;
        }
        field1738 = null;
        field1733 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Lbh;")
    public static final class13 method683(int arg0) {
        if (arg0 > -52) {
            return null;
        }
        field1736++;
        class13 var1 = (class13) class174.field2090.method2338(115);
        if (var1 == null) {
            return new class13();
        } else {
            class20.field287--;
            return var1;
        }
    }
}
