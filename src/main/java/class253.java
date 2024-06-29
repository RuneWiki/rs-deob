import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class253 extends class535 {

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "F")
    public static float field3748 = 0.0F;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "Lci;")
    public static class320 field3752;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILki;)V", line = 3)
    public static final void method1632(int arg0, class510 arg1) {
        ++field3751;
        class211 var2 = (class211) class462.field6679.method2284(true, (long) arg1.field290);
        if (arg0 != 0) {
            field3752 = null;
        }
        if (var2 == null) {
            class332.method2105(114, arg1.field343[0], arg1.field6956, (class279) null, 0, arg1.field344[0], (class261) null, arg1);
        } else {
            var2.method1421(116);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;BZJ)V", line = 23)
    public static final void method1633(String arg0, byte arg1, boolean arg2, long arg3) {
        ++field3749;
        if (arg2) {
            class415.method2484(true);
            if (class315.field4692.equals("")) {
                class513.field7457 = 39;
                return;
            }
        }
        class519 var5 = new class519(128);
        var5.method3048(arg1 ^ 2034159362, 10);
        var5.method3016((int) (Math.random() * 65535.0D), -48);
        var5.method3014(arg3, -2);
        var5.method3016(class446.field6374, arg1 ^ 116);
        var5.method3019((int) (Math.random() * 9.9999999E7D), 11648);
        var5.method3057((byte) -28, arg0);
        var5.method3019((int) (9.9999999E7D * Math.random()), 11648);
        if (arg1 == -22) {
            if (arg2) {
                var5.method3014(class512.method2995(class315.field4692, arg1 + 22), -2);
                try {
                    var5.method3014(Long.parseLong(class451.field6587), arg1 ^ 20);
                } catch (Exception var6) {
                    class513.field7457 = 39;
                    return;
                }
            } else {
                var5.method3019((int) (9.9999999E7D * Math.random()), 11648);
                var5.method3019((int) (9.9999999E7D * Math.random()), 11648);
                var5.method3019((int) (Math.random() * 9.9999999E7D), 11648);
                var5.method3019((int) (Math.random() * 9.9999999E7D), 11648);
            }
            var5.method3019((int) (Math.random() * 9.9999999E7D), 11648);
            var5.method3041(class472.field6868, class84.field1333, 0);
            class276.field4124.field7558 = 0;
            class276.field4124.method3048(arg1 ^ 2034159362, arg2 ? class195.field2849.field19 : class195.field2846.field19);
            class276.field4124.method3016(var5.field7558 + 28, -84);
            class276.field4124.method3016(604, -92);
            class276.field4124.method3048(arg1 + -2034159362, class503.field7255);
            class276.field4124.method3048(arg1 + -2034159362, class14.field163.field6607);
            class368.method2256((byte) -74, class276.field4124);
            class276.field4124.method3058(var5.field7545, (byte) 72, 0, var5.field7558);
            class513.field7457 = -3;
            class329.field4840 = 1;
            class77.field1269 = 0;
            class211.field3189 = 0;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 91)
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(BII)I", line = 96)
    private final int method1634(byte arg0, int arg1, int arg2) {
        ++field3753;
        int var4 = arg1 - -(arg2 * 57);
        if (arg0 != 111) {
            return -38;
        } else {
            int var5 = var4 << 1 ^ var4;
            return 4096 - ((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)V", line = 113)
    public static final void method1635(int arg0, int arg1) {
        if (!class220.field3371.field2581) {
            arg0 = -1;
        }
        ++field3750;
        if (class492.field7133 != arg0) {
            if (~arg0 != arg1) {
                class441 var2 = class355.field5172.method1420(-12616, arg0);
                class104 var3 = var2.method2593(0);
                if (var3 != null) {
                    class280.field4173.method2445(class481.field6991, var3.method766(), (byte) 2, new Point(var2.field6279, var2.field6280), var3.method754(), var3.method768());
                    class492.field7133 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (arg0 == -1 && ~class492.field7133 != 0) {
                class280.field4173.method2445(class481.field6991, -1, (byte) 2, new Point(), (int[]) null, -1);
                class492.field7133 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)[I", line = 151)
    public final int[] method65(int arg0, int arg1) {
        ++field3747;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (arg1 != 1) {
            field3748 = -0.33449247F;
        }
        if (super.field7885.field2086) {
            int var4 = class448.field6442[arg0];
            for (int var5 = 0; var5 < class174.field2597; ++var5) {
                var3[var5] = this.method1634((byte) 111, class539.field7939[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 184)
    public static void method1636(boolean arg0) {
        field3752 = null;
        if (arg0) {
            method1632(107, (class510) null);
        }
    }
}
