import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class125 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1796 = "Close";

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Z")
    public static boolean field1801 = true;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method809(int arg0) {
        field1796 = null;
        if (arg0 != -16652) {
            method814(111);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method810(int arg0) {
        field1799++;
        if (class266.field4316) {
            return;
        }
        int var1 = -67 / ((arg0 + 54) / 40);
        if (class180.field2832) {
            class144.field2145 = (float) ((int) class144.field2145 - 65 & 0xFFFFFF80);
        } else {
            class296.field4731 += (-24.0F - class296.field4731) / 2.0F;
        }
        class89.field1345 = true;
        class266.field4316 = true;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public static final void method811(int arg0) {
        if (arg0 != -20) {
            method810(81);
        }
        client.field3874.method1511((byte) 102);
        field1802++;
        class282.field4583.method1511((byte) 100);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lfe;Z)Z")
    public static final boolean method812(class231 arg0, boolean arg1) {
        field1797++;
        if (arg1) {
            field1801 = true;
        }
        if (arg0.field3563 == 205) {
            class128.field1832 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILuk;)V")
    public static final void method813(int arg0, class86 arg1) {
        int var2 = 29 / ((arg0 + 5) / 40);
        field1800++;
        for (class251 var3 = (class251) class206.field3234.method1548(0); var3 != null; var3 = (class251) class206.field3234.method1549(-29)) {
            if (var3.field4113 == arg1) {
                if (var3.field4099 != null) {
                    class81.field1231.method1931(var3.field4099);
                    var3.field4099 = null;
                }
                var3.method1764(64);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
    public static final void method814(int arg0) {
        class158.field2349.method1510(10283);
        field1798++;
        int var1 = -39 / ((-arg0 - 2) / 58);
    }
}
