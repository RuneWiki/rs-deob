import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class76 {

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field1018 = -1;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "Lhk;")
    public static class110 field1020;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "Lwb;")
    public static class346 field1025;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "Lcb;")
    public static class544 field1026;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "Lsga;")
    public class76 field1019;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "Lsga;")
    public class76 field1023;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI)I")
    public static final int method590(int arg0, byte arg1, int arg2) {
        field1021++;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        if (arg1 != -16) {
            field1020 = null;
        }
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        double var7 = Math.random() * (var3 - var5) + var5;
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIB)Z")
    public static final boolean method591(int arg0, int arg1, byte arg2) {
        field1024++;
        if (arg2 != 47) {
            field1022 = -35;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)V")
    public final void method592(int arg0) {
        field1015++;
        if (this.field1023 == null) {
            return;
        }
        if (arg0 != 2) {
            field1020 = null;
        }
        this.field1023.field1019 = this.field1019;
        this.field1019.field1023 = this.field1023;
        this.field1023 = null;
        this.field1019 = null;
    }

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1026 = null;
        field1025 = null;
        if (arg0 != 29754) {
            method591(17, -79, (byte) -72);
        }
        field1020 = null;
    }

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "(I)V")
    public static final void method594(int arg0) {
        field1017++;
        class218 var1 = (class218) class585.field8267.method2508((byte) 116);
        if (arg0 != 0) {
            return;
        }
        boolean var2 = class169.field2433 != null || class391.field5549 > 0;
        int var3 = var1.method1508((byte) 117);
        int var4 = var1.method1506((byte) -102);
        if (var2) {
            class553.field7875 = 1;
        }
        if (var2) {
            class359.field5223 = class50.field723;
        } else {
            class416.method2496(var3, (byte) -128, var4, class50.field723);
        }
    }
}
