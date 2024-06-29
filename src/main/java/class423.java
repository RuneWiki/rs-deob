import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class423 implements class81 {

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field5826;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field5820;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Z")
    public boolean field5825;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field5836;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lqj;")
    public class512 field5831;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field5821;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lle;")
    public class311 field5830;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field5824;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[Ltn;")
    public static class87[] field5833 = new class87[8];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "F")
    public static float field5823;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lwu;")
    public static class376 field5827;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lmha;", line = 7)
    public final class419 method112(byte arg0) {
        field5828++;
        if (arg0 != 62) {
            this.method112((byte) 118);
        }
        return class85.field1027;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method2450(boolean arg0) {
        field5822++;
        class45.field585.method481(class156.field2382);
        class45.field585.method445(class399.field5572, class100.field1275, class283.field3997, class668.field9121);
        if (arg0) {
            field5827 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V", line = 36)
    public static final void method2451(int arg0, byte arg1, int arg2) {
        if (arg1 == 20) {
            field5834++;
            class127 var3 = class760.method4231(arg2, arg1 - 874792692, 7);
            var3.method1010(614);
            var3.field2099 = arg0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 59)
    public static void method2452(int arg0) {
        if (arg0 != 1) {
            method2451(102, (byte) 48, 94);
        }
        field5833 = null;
        field5827 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(ILle;Lqj;IIIIIIIZ)V", line = 78)
    public class423(int arg0, class311 arg1, class512 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field5826 = arg8;
        this.field5820 = arg5;
        this.field5825 = arg10;
        this.field5836 = arg6;
        this.field5829 = arg0;
        this.field5838 = arg9;
        this.field5831 = arg2;
        this.field5821 = arg7;
        this.field5830 = arg1;
        this.field5824 = arg4;
        this.field5837 = arg3;
    }
}
