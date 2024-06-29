import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class388 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lsv;")
    public static class570 field5422 = new class570(35, 2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
    public static final int method2333(byte arg0) {
        if (arg0 != 47) {
            return 91;
        }
        field5424++;
        if (class259.field3676 == null) {
            return class60.field911 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method2334(boolean arg0) {
        if (arg0) {
            field5420 = -83;
        }
        field5422 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public static final void method2335(int arg0, byte arg1) {
        field5423++;
        if (class611.field8684 == arg0) {
            return;
        }
        class192.field2891 = class456.field6225 = class260.field3679[arg0];
        class554.method3199(200);
        class128.field2153 = new int[class192.field2891][class456.field6225];
        class195.field2935 = new int[class192.field2891][class456.field6225];
        class364.field5178 = new int[4][class192.field2891 >> 3][class456.field6225 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class605.field8591[var2] = class362.method2172(class192.field2891, 1, class456.field6225);
        }
        if (arg1 < 61) {
            method2333((byte) -120);
        }
        class23.field257 = new byte[4][class192.field2891][class456.field6225];
        class40.method299(class456.field6225, class192.field2891, 4, false);
        class582.method3416(class456.field6225 >> 3, class192.field2891 >> 3, class686.field9702, (byte) 65);
        class611.field8684 = arg0;
    }
}
