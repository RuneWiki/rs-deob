import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public abstract class class399 extends class421 {

    @OriginalMember(owner = "client!fha", name = "F", descriptor = "S")
    public short field5479;

    @OriginalMember(owner = "client!fha", name = "C", descriptor = "Ltda;")
    public static class663 field5476 = new class663();

    @OriginalMember(owner = "client!fha", name = "H", descriptor = "I")
    public static int field5481 = -1;

    @OriginalMember(owner = "client!fha", name = "A", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!fha", name = "B", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!fha", name = "D", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!fha", name = "E", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!fha", name = "G", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!fha", name = "I", descriptor = "[I")
    public static int[] field5482;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(ILha;)Z", line = 4)
    public final boolean method2456(int arg0, class65 arg1) {
        if (arg0 <= 92) {
            method2459(-106, (String) null, -110);
        }
        ++field5474;
        return class295.method1924(super.field5746 >> class645.field9018, 1, super.field5742 >> class645.field9018, super.field5749);
    }

    @OriginalMember(owner = "client!fha", name = "g", descriptor = "(B)Z", line = 19)
    public final boolean method2457(byte arg0) {
        if (arg0 <= 117) {
            field5481 = -104;
        }
        ++field5477;
        return class735.field10157[(super.field5742 >> class645.field9018) + -class276.field4007 - -class259.field3820][(super.field5746 >> class645.field9018) - class296.field4301 + class259.field3820];
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I[Lqm;)I", line = 30)
    public final int method2458(int arg0, class154[] arg1) {
        if (arg0 != 48) {
            this.method2458(115, (class154[]) null);
        }
        ++field5480;
        return this.method2550(false, super.field5746 >> class645.field9018, arg1, super.field5742 >> class645.field9018);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 41)
    public static final void method2459(int arg0, String arg1, int arg2) {
        ++field5478;
        class313 var3 = class312.method1998((long) arg0, 3, -1);
        var3.method2001((byte) 82);
        int var4 = -12 / ((61 - arg2) / 35);
        var3.field4460 = arg1;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIB)I", line = 59)
    public static final int method2460(int arg0, int arg1, byte arg2) {
        ++field5475;
        int var3 = -128 + class513.method3097(4, -1640, arg1 + 45365, arg0 + 91923) + (class513.method3097(2, -1640, arg1 + 10294, arg0 - -37821) + -128 >> 1) + (-128 + class513.method3097(1, arg2 + -1526, arg1, arg0) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg2 != -114 ? -96 : var4;
    }

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "(I)V", line = 80)
    public static void method2461(int arg0) {
        field5476 = null;
        if (arg0 != 25915) {
            method2461(85);
        }
        field5482 = null;
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIIII)V", line = 92)
    public class399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5742 = arg0;
        super.field5755 = (byte) arg3;
        super.field5746 = arg2;
        super.field5749 = (byte) arg4;
        this.field5479 = (short) arg5;
        super.field5741 = arg1;
    }
}
