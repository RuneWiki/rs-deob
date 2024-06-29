import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class220 extends class106 {

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Loc;")
    public static class151 field3818 = class137.method873(2, "sl_back");

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Loc;")
    public static class151 field3824 = class137.method873(2, "<img=0>");

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Loc;")
    public static class151 field3826 = class137.method873(2, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Loc;")
    public static class151 field3820 = class137.method873(2, "<col=00ff00>");

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Loc;")
    public static class151 field3827 = class137.method873(2, "VOLL");

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lnd;")
    public class142 field3819;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lgd;")
    public class69 field3821;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[B")
    public byte[] field3822;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[I")
    public static int[] field3828;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static void method1370(int arg0) {
        field3818 = null;
        field3826 = null;
        field3820 = null;
        field3827 = null;
        if (arg0 <= 82) {
            field3824 = null;
        }
        field3824 = null;
        field3828 = null;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static final void method1371(int arg0) {
        while (true) {
            if (class1.field34.method647((byte) 0, class68.field1329) >= 27) {
                int var1 = class1.field34.method645(15, (byte) 10);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class122.field2190[var1] == null) {
                        class122.field2190[var1] = new class203();
                        var2 = true;
                    }
                    class203 var3 = class122.field2190[var1];
                    class81.field1553[class23.field505++] = var1;
                    var3.field4028 = class200.field3541;
                    var3.field3608 = class131.method814(true, class1.field34.method645(14, (byte) 10));
                    int var4 = class1.field34.method645(1, (byte) 10);
                    if (var4 == 1) {
                        class218.field3800[class111.field1956++] = var1;
                    }
                    int var5 = class1.field34.method645(5, (byte) 10);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class163.field2953[class1.field34.method645(3, (byte) 10)];
                    if (var2) {
                        var3.field4017 = var3.field4024 = var6;
                    }
                    int var7 = class1.field34.method645(1, (byte) 10);
                    int var8 = class1.field34.method645(5, (byte) 10);
                    var3.field4021 = var3.field3608.field1286;
                    var3.field3973 = var3.field3608.field1311;
                    var3.field4036 = var3.field3608.field1313;
                    var3.field3984 = var3.field3608.field1325;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field4007 = var3.field3608.field1317;
                    var3.field3971 = var3.field3608.field1301;
                    var3.field3983 = var3.field3608.field1309;
                    var3.field4025 = var3.field3608.field1293;
                    if (var3.field3984 == 0) {
                        var3.field4024 = 0;
                    }
                    var3.field4002 = var3.field3608.field1328;
                    var3.method1427(class228.field3975.field3978[0] + var8, var7 == 1, (byte) 76, class228.field3975.field4031[0] + var5);
                    continue;
                }
            }
            class1.field34.method644(0);
            if (arg0 != 5) {
                return;
            }
            field3829++;
            return;
        }
    }
}
