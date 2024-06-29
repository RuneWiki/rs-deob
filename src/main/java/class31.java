import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class31 {

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public int field320 = 8;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public int field316 = 16777215;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lqp;")
    public static class586 field309 = new class586(0, 3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Ldda;")
    public static class597 field321;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    public boolean field312;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lps;IB)V")
    private final void method137(class428 arg0, int arg1, byte arg2) {
        if (arg2 != -91) {
            this.field317 = 27;
        }
        if (arg1 == 1) {
            this.field320 = arg0.method2620(62);
        } else if (arg1 == 2) {
            this.field312 = true;
        } else if (arg1 == 3) {
            this.field314 = arg0.method2622((byte) 126);
            this.field319 = arg0.method2622((byte) 123);
            this.field308 = arg0.method2622((byte) 123);
        } else if (arg1 == 4) {
            this.field317 = arg0.method2561((byte) 124);
        } else if (arg1 == 5) {
            this.field311 = arg0.method2620(67);
        } else if (arg1 == 6) {
            this.field316 = arg0.method2601(34);
        }
        field310++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLps;)V")
    public final void method138(byte arg0, class428 arg1) {
        while (true) {
            int var3 = arg1.method2561((byte) -66);
            if (var3 == 0) {
                field313++;
                if (arg0 != -14) {
                    this.field316 = 17;
                    return;
                }
                return;
            }
            this.method137(arg1, var3, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method139(int arg0) {
        if (arg0 != -1) {
            method140(null, 86, null);
        }
        field309 = null;
        field321 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method140(String arg0, int arg1, Throwable arg2) {
        field318++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class187.method1225(arg2, 1);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class216.method1396(var3, (byte) 15);
            String var4 = class4.method19(0, "%3a", var3, ":");
            if (arg1 < -99) {
                String var5 = class4.method19(0, "%40", var4, "@");
                String var6 = class4.method19(0, "%26", var5, "&");
                String var7 = class4.method19(0, "%23", var6, "#");
                if (class97.field1217.field5129 != null) {
                    class286 var8 = class97.field1217.method2167(new URL(class97.field1217.field5129.getCodeBase(), "clienterror.ws?c=" + class566.field8405 + "&u=" + class269.field3988 + "&v1=" + class353.field5127 + "&v2=" + class353.field5138 + "&e=" + var7), 67);
                    while (var8.field4208 == 0) {
                        class428.method2624(1, 1L);
                    }
                    if (var8.field4208 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field4213;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIBI)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg3 >= class130.field1712 && arg5 <= class401.field5755 && arg0 >= class483.field7334 && arg1 <= class202.field3021) {
            class419.method2493(arg1, arg3, arg5, arg0, arg2, (byte) -17);
        } else {
            class414.method2458(arg5, arg2, arg0, arg3, arg1, 1733);
        }
        if (arg4 >= 86) {
            field315++;
        }
    }
}
