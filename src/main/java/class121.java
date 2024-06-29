import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class121 extends class181 {

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/lang/String;")
    public String field1800;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1798 = "Created gameworld";

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)I")
    public static final int method856(int arg0, int arg1) {
        class243 var2 = class143.method973(arg1, -27248);
        int var3 = var2.field3768;
        field1797++;
        if (arg0 != 16853) {
            method858(-49);
        }
        int var4 = var2.field3761;
        int var5 = var2.field3759;
        int var6 = class63.field1046[var4 - var5];
        return class166.field2447[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
    public static final void method857(boolean arg0, int arg1) {
        if (!arg0) {
            field1802++;
            class105 var2 = class9.method72(9, -1, arg1);
            var2.method764((byte) -119);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method858(int arg0) {
        if (arg0 == 0) {
            field1798 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        field1799++;
        if (!class176.method1165(arg1, -31001)) {
            return;
        }
        class297[] var2 = class275.field4236[arg1];
        if (arg0 <= 112) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class297 var4 = var2[var3];
            if (var4 != null) {
                var4.field4701 = 0;
                var4.field4546 = 0;
                var4.field4527 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method860(byte arg0, String arg1, Throwable arg2) {
        field1804++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class76.method604(-5, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class17.method122(var3, (byte) 127);
            String var4 = class63.method517("%3a", (byte) -125, ":", var3);
            String var5 = class63.method517("%40", (byte) -125, "@", var4);
            String var6 = class63.method517("%26", (byte) -125, "&", var5);
            String var7 = class63.method517("%23", (byte) -125, "#", var6);
            if (class166.field2452.field505 != null && arg0 > 15) {
                class40 var8 = class166.field2452.method186(new URL(class166.field2452.field505.getCodeBase(), "clienterror.ws?c=" + class292.field4429 + "&u=" + class284.field4363 + "&v1=" + class26.field509 + "&v2=" + class26.field499 + "&e=" + var7), true);
                while (var8.field713 == 0) {
                    client.method323(1L, -117);
                }
                if (var8.field713 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field709;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)I")
    public static final int method861(int arg0, boolean arg1) {
        field1801++;
        if (arg1) {
            field1807 = -122;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class121() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class121(String arg0, int arg1) {
        this.field1800 = arg0;
    }
}
