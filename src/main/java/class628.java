import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class628 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lmaa;")
    public static class468 field9024 = new class468();

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Z")
    public static boolean field9027 = false;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lkg;")
    public static class271 field9025 = new class271("", 17);

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
    public static int[] field9028 = new int[8];

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field9029 = new String[100];

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
    public static final void method3624(int arg0, byte arg1, int arg2) {
        if (arg1 > -112) {
            field9028 = null;
        }
        field9021++;
        class354 var3 = class501.method3012(arg0, 1, 2145997216);
        var3.method2222(-118);
        var3.field4990 = arg2;
    }

    @OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9026++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method3625(int arg0) {
        if (arg0 == 8) {
            field9024 = null;
            field9028 = null;
            field9025 = null;
            field9029 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
    public final boolean method3626(int arg0) {
        field9023++;
        if (arg0 != 17) {
            field9024 = null;
        }
        return class139.field2158 == this | class594.field8527 == this;
    }
}
