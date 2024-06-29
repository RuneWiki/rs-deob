import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class442 extends class117 {

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public static int field6484 = 0;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "[I")
    public static int[] field6486 = new int[2048];

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "Lao;")
    public static class188 field6488 = new class188(87, -1);

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Lcv;")
    private class398 field6481;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLti;)V", line = 12)
    public final void method2683(byte arg0, class303 arg1) {
        field6483++;
        int var3 = -104 / ((arg0 + 7) / 51);
        while (true) {
            int var4 = arg1.method1918((byte) -108);
            if (var4 == 0) {
                return;
            }
            this.method2685(arg1, (byte) 126, var4);
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V", line = 31)
    public static final void method2684(int arg0) {
        field6487++;
        class273.field3947 = null;
        class226.field3302 = null;
        class353.field5343 = null;
        class492.field7188 = null;
        class455.field6733 = null;
        class173.field2654 = null;
        class111.field1765 = null;
        if (arg0 != -1) {
            field6484 = -107;
        }
        class173.field2655 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lti;BI)V", line = 50)
    private final void method2685(class303 arg0, byte arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1918((byte) 67);
            if (this.field6481 == null) {
                int var5 = class159.method1146(false, var4);
                this.field6481 = new class398(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1918((byte) 79) == 1;
                int var8 = arg0.method1866(false);
                class439 var9;
                if (var7) {
                    var9 = new class411(arg0.method1879(arg1 + 30543));
                } else {
                    var9 = new class242(arg0.method1870(-1945262512));
                }
                this.field6481.method2486(-3, var9, (long) var8);
            }
        }
        field6482++;
        if (arg1 != 126) {
            field6486 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZ)I", line = 95)
    public final int method2686(int arg0, int arg1, boolean arg2) {
        field6480++;
        if (!arg2) {
            field6484 = -19;
        }
        if (this.field6481 == null) {
            return arg0;
        } else {
            class242 var4 = (class242) this.field6481.method2485(18, (long) arg1);
            return var4 == null ? arg0 : var4.field3509;
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V", line = 116)
    public static void method2687(byte arg0) {
        if (arg0 >= -41) {
            field6484 = 63;
        }
        field6486 = null;
        field6488 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 135)
    public final String method2688(String arg0, int arg1, int arg2) {
        field6485++;
        if (this.field6481 == null) {
            return arg0;
        }
        class411 var4 = (class411) this.field6481.method2485(arg1 + 18728, (long) arg2);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg1 != -18700) {
                field6486 = null;
            }
            return var4.field6046;
        }
    }
}
