import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class361 extends class69 {

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public int field5206 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field5205 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field5209 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field5203 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public int field5211 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public int field5210 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public int field5202 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field5215 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lhv;")
    public class226 field5200;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field5212 = 0;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lbt;")
    public static class519 field5207;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2268(int arg0) {
        field5213++;
        if (class694.field9684 != null) {
            class694.field9684 = null;
            class453.method2733(class79.field894, class78.field874, class339.field4914, -30, class49.field587);
            int var1 = 15 / ((arg0 - 11) / 55);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V", line = 22)
    public static final void method2269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5199++;
        if (arg6 != 512) {
            return;
        }
        if (arg0 == arg1) {
            class208.method1322(arg7, arg1, arg2, arg4, arg3, arg5, (byte) -128);
        } else if (class177.field2236 <= (arg3 - arg1) && (arg1 + arg3) <= class627.field8783 && class727.field10060 <= arg5 - arg0 && class474.field6576 >= arg0 + arg5) {
            class762.method4204(arg3, arg2, arg1, arg4, arg7, 0, arg0, arg5);
        } else {
            class615.method3552(arg4, arg1, arg5, arg0, true, arg7, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z", line = 49)
    public static final boolean method2270(byte arg0) {
        field5204++;
        int var1 = -27 % ((-arg0 - 75) / 36);
        if (class723.field10007 == null) {
            return false;
        } else {
            if (class723.field10007.field2174 >= 2000) {
                class723.field10007.field2174 -= 2000;
            }
            return class723.field10007.field2174 == 1008;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 69)
    public static void method2271(boolean arg0) {
        if (arg0) {
            field5207 = null;
        }
        field5207 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLns;)V", line = 82)
    public static final void method2272(byte arg0, class654 arg1) {
        field5201++;
        int var2 = arg1.field9183 - class533.field7336;
        int var3 = arg1.field9174 * 512 + (arg1.method3744(1) * 256);
        int var4 = arg1.field9149 * 512 + (arg1.method3744(1) * 256);
        arg1.field3470 += (var3 - arg1.field3470) / var2;
        arg1.field9218 = 0;
        arg1.field3460 += (var4 - arg1.field3460) / var2;
        if (arg1.field9140 == 0) {
            arg1.method3745(0, 8192);
        }
        if (arg0 > -33) {
            return;
        }
        if (arg1.field9140 == 1) {
            arg1.method3745(0, 12288);
        }
        if (arg1.field9140 == 2) {
            arg1.method3745(0, 0);
        }
        if (arg1.field9140 == 3) {
            arg1.method3745(0, 4096);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lhv;)V", line = 216)
    public class361(class226 arg0) {
        this.field5200 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V", line = 129)
    public static final void method2273(boolean arg0, int arg1) {
        class33.field319 = new int[arg1];
        class473.field6554 = new int[arg1];
        class679.field9491 = new int[arg1];
        field5214++;
        class213.field2953 = new int[arg1];
        if (!arg0) {
            class631.field8828 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z", line = 150)
    public final boolean method2274(int arg0, int arg1, int arg2) {
        if (arg2 != 23265) {
            method2275(-115, 102, -70, null);
        }
        field5208++;
        if (this.field5209 <= arg0 && this.field5215 >= arg0 && this.field5211 <= arg1 && this.field5202 >= arg1) {
            return true;
        } else {
            return this.field5206 <= arg0 && arg0 <= this.field5203 && this.field5210 <= arg1 && this.field5205 >= arg1;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILbq;)V", line = 180)
    public static final void method2275(int arg0, int arg1, int arg2, class727 arg3) {
        class472 var4 = class646.method3699(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field6540 = arg3;
        int var5 = class661.field9303 == class594.field8355 ? 1 : 0;
        if (arg3.method77(25833)) {
            if (arg3.method80(104)) {
                arg3.field3455 = class689.field9618[var5];
                class689.field9618[var5] = arg3;
                return;
            }
            arg3.field3455 = class226.field3436[var5];
            class226.field3436[var5] = arg3;
            class282.field4043 = true;
            return;
        }
        arg3.field3455 = class289.field4265[var5];
        class289.field4265[var5] = arg3;
    }
}
