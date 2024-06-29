import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class349 extends class198 {

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field4948 = 7000;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field4956 = field4948;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "Low;")
    public static class665 field4958 = new class665();

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "Lvb;")
    public static class396 field4959 = new class396(4, 19);

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "B")
    private byte field4947;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "B")
    private byte field4949;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "B")
    private byte field4951;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "B")
    private byte field4957;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Z")
    private boolean field4953;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "[I")
    public static int[] field4954;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILlm;)V")
    public final void method858(int arg0, class50 arg1) {
        arg1.field690 = this.field4949;
        arg1.field688 = this.field4957;
        if (arg0 == 3) {
            arg1.field710 = this.field4947;
            arg1.field725 = this.field4953;
            arg1.field693 = this.field4951;
            field4952++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIIII)V")
    public static final void method2120(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class48.field675 = arg1;
        class514.field7085 = arg3;
        class586.field8431 = arg4;
        int var5 = -116 / ((arg0 + 64) / 57);
        class479.field6582 = arg2;
        field4946++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V")
    public static void method2121(boolean arg0) {
        field4954 = null;
        field4958 = null;
        if (arg0) {
            field4959 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method2122(Throwable arg0, String arg1, int arg2) {
        field4955++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class63.method637(0, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class412.method2428(var3, -1);
            String var4 = class486.method2857((byte) -76, ":", "%3a", var3);
            String var5 = class486.method2857((byte) -105, "@", "%40", var4);
            String var6 = class486.method2857((byte) -107, "&", "%26", var5);
            String var7 = class486.method2857((byte) -124, "#", "%23", var6);
            if (class518.field7115 != null) {
                class746 var8 = class192.field2890.method922(0, new URL(class518.field7115.getCodeBase(), "clienterror.ws?c=" + class178.field2665 + "&u=" + (class445.field6154 == null ? String.valueOf(class115.field1974) : class445.field6154) + "&v1=" + class111.field1591 + "&v2=" + class111.field1592 + "&e=" + var7));
                while (var8.field10365 == 0) {
                    class579.method3405(1L, 10);
                }
                if (var8.field10365 == arg2) {
                    DataInputStream var9 = (DataInputStream) var8.field10371;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLol;)V")
    public final void method855(boolean arg0, class431 arg1) {
        this.field4953 = arg1.method2557(14929) == 1;
        field4950++;
        this.field4949 = arg1.method2529(85);
        this.field4951 = arg1.method2529(111);
        this.field4957 = arg1.method2529(127);
        this.field4947 = arg1.method2529(44);
        if (!arg0) {
            this.field4957 = 50;
        }
    }
}
