import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class202 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lla;")
    public static class423 field3005;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3002;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method1433(byte arg0) {
        field3002 = null;
        field3005 = null;
        int var1 = 66 % ((arg0 - 26) / 35);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method1434(int arg0) {
        field3004++;
        if (class346.field4771 == arg0) {
            return;
        }
        int var1 = class535.field7789.method2459(-32213);
        int var2 = class535.field7789.method2452(arg0 - 89);
        class553 var3 = (class553) class466.field6643.method3565(arg0 - 104);
        if (var3 != null) {
            var1 = var3.method760(arg0 + 126);
            var2 = var3.method761(false);
        }
        int var4 = 0;
        int var5 = 0;
        if (class416.field5919) {
            var4 = class352.method2243(73);
            var5 = class695.method3915((byte) 86);
        }
        class460.method2789(var2, class565.field8187 + var5, var2 - -var5, var1 + var4, var1, class346.field4771, true, var5, var4, var5, var4, class68.field1042 + var4);
        if (class344.field4731 != null) {
            class647.method3734((byte) 46, var1 + var4, var2 + var5);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1435(byte arg0, byte[] arg1) {
        field3003++;
        if (arg0 != 24) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class85.method683(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1436(int arg0, boolean arg1) {
        field3006++;
        if (arg0 >= -87) {
            field3002 = null;
        }
        boolean var2 = class211.field3164.method1242();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class211.field3164.method1232();
        } else if (!class211.field3164.method1234()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class243.field3580.method3301(arg1 ? 1 : 0, 24, class243.field3580.field8011);
            class23.method102((byte) -74);
            return true;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)I")
    public static final int method1437(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 != 0) {
            field3002 = null;
        }
        field3007++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
