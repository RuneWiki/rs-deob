import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class97 extends class112 {

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public int field1501 = 0;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1508 = "glow1:";

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lsb;IILsb;I)Lqa;")
    public static final class73 method735(class124 arg0, int arg1, int arg2, class124 arg3, int arg4) {
        if (arg4 == -1) {
            field1507++;
            return class113.method833(arg1, arg0, arg2, 113) ? class70.method546((byte) -85, arg3.method900(arg2, arg1, false)) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)Ljava/lang/String;")
    public static final String method736(byte arg0) {
        String var1 = "www";
        field1511++;
        if (arg0 != 67) {
            method740((class114) null, -114, (byte) 92);
        }
        String var2 = "";
        if (class197.field3225 != 0) {
            var1 = "www-wtqa";
        }
        if (class241.field3801 != null) {
            var2 = "/p=" + class241.field3801;
        }
        return "http://" + var1 + ".runescape.com/l=" + class145.field2391 + "/a=" + class252.field4019 + var2 + "/";
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLig;)V")
    public final void method737(byte arg0, class136 arg1) {
        int var3 = 86 % ((arg0 - 57) / 61);
        while (true) {
            int var4 = arg1.method1012(4);
            if (var4 == 0) {
                field1502++;
                return;
            }
            this.method739(var4, -3, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method738(int arg0) {
        if (arg0 <= -58) {
            field1508 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILig;)V")
    private final void method739(int arg0, int arg1, class136 arg2) {
        field1505++;
        if (~arg0 == arg1) {
            this.field1501 = arg2.method996(arg1 ^ 0xFFFF00FD);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lkj;IB)I")
    public static final int method740(class114 arg0, int arg1, byte arg2) {
        field1506++;
        if (!client.method1916(arg0).method1680(arg1, true) && arg0.field1921 == null) {
            return -1;
        } else {
            int var3 = 80 / ((arg2 - 26) / 45);
            return arg0.field1857 == null || arg0.field1857.length <= arg1 ? -1 : arg0.field1857[arg1];
        }
    }
}
