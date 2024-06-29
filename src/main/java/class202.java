import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class202 extends class322 {

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field2641 = -1;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Z")
    public static volatile boolean field2642 = true;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lqfa;")
    public static class98 field2645 = new class98(11, 3);

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lvc;")
    public static class316 field2644;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public static void method1228(int arg0) {
        field2644 = null;
        field2645 = null;
        if (arg0 != 9564) {
            method1229(true, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (super.field4450.method2751(-18373)) {
            super.field4451 = 0;
        }
        if (!arg0) {
            ++field2648;
            if (super.field4451 != 1 && super.field4451 != 0) {
                super.field4451 = this.method17((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field2649;
        if (arg1 <= 10) {
            this.method22(-65, 119);
        }
        return super.field4450.method2751(-18373) ? 3 : 1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZB)V")
    public static final void method1229(boolean arg0, byte arg1) {
        if (arg0) {
            if (~class457.field6447 != 0) {
                class52.method325(arg1 ^ -128, class457.field6447);
            }
            for (class47 var2 = (class47) class475.field6744.method1176(24490); var2 != null; var2 = (class47) class475.field6744.method1178((byte) 71)) {
                if (!var2.method1187(0)) {
                    var2 = (class47) class475.field6744.method1176(24490);
                    if (var2 == null) {
                        break;
                    }
                }
                class353.method2275(false, true, var2, -66);
            }
            class457.field6447 = -1;
            class475.field6744 = new class188(8);
            class415.method2553(30695);
            class457.field6447 = class450.field6384;
            class364.method2320(false, -14543);
            class350.method2257(arg1 ^ 27);
            class241.method1536(class457.field6447);
        }
        ++field2646;
        class449.field6370 = "";
        class209.field2755 = "";
        class370.field5212 = false;
        class464.method2766(arg1 + 231);
        class86.field1057 = -1;
        class385.method2437(class519.field7376, (byte) -71);
        class660.field9039 = new class280();
        class660.field9039.field1264 = class336.field4683 * 512 / 2;
        class660.field9039.field1250 = class700.field9768 * 512 / 2;
        class660.field9039.field8009[0] = class336.field4683 / 2;
        class660.field9039.field8015[0] = class700.field9768 / 2;
        class32.field426 = 0;
        class511.field7303 = 0;
        if (class97.field1168 != 2) {
            class352.method2270((byte) 120);
        } else {
            class32.field426 = class582.field8203 << 9;
            class511.field7303 = class757.field10521 << 9;
        }
        if (arg1 != -128) {
            method1228(20);
        }
        class661.method3626(16711680);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field2647;
        int var2 = 15 / ((arg0 - 70) / 51);
        return 1;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Z")
    public final boolean method1230(byte arg0) {
        ++field2650;
        if (super.field4450.method2751(-18373)) {
            return false;
        } else {
            if (arg0 != -53) {
                this.method1231(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lch;)V")
    public class202(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)I")
    public final int method1231(boolean arg0) {
        if (arg0) {
            this.method23(true);
        }
        ++field2643;
        return super.field4451;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(ILch;)V")
    public class202(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        ++field2640;
        super.field4451 = arg1;
        if (arg0 != 0) {
            method1229(false, (byte) 122);
        }
    }
}
