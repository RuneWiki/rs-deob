import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class396 {

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public int field5508 = 1;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "S")
    public static short field5505 = 1;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "C")
    public char field5504;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "F")
    public static float field5506;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static final void method2252(int arg0) {
        field5503++;
        if (class677.field9551 == -1) {
            return;
        }
        int var1 = class46.field686.method70((byte) -128);
        int var2 = class46.field686.method66(74);
        class113 var3 = (class113) class441.field6211.method1270((byte) -25);
        if (arg0 > -113) {
            return;
        }
        if (var3 != null) {
            var1 = var3.method847(-1);
            var2 = var3.method840(111);
        }
        class347.method2069(0, 0, 0, 0, class677.field9551, class124.field1711, var2, false, class547.field7412, var1);
        if (class31.field375 != null) {
            class362.method2124(var1, var2, 108);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljr;IB)V")
    private final void method2253(class96 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field5504 = class274.method1671(arg0.method748(-813976688), true);
        } else if (arg1 == 2) {
            this.field5508 = 0;
        }
        field5507++;
        if (arg2 <= 72) {
            this.field5504 = 'P';
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljr;I)V")
    public final void method2254(class96 arg0, int arg1) {
        if (arg1 != -1) {
            field5505 = 88;
        }
        field5509++;
        while (true) {
            int var3 = arg0.method718(arg1 + 83);
            if (var3 == 0) {
                return;
            }
            this.method2253(arg0, var3, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method2255(String arg0, byte arg1) {
        field5510++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class372.field5293; var2++) {
            if (arg0.equalsIgnoreCase(class129.field1779[var2])) {
                return true;
            }
        }
        int var3 = 60 / (-arg1 / 45);
        return arg0.equalsIgnoreCase(class253.field3576.field3975);
    }
}
