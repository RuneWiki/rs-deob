import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class187 extends class260 {

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Lln;")
    public static class400 field2499 = new class400();

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2493;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 3)
    public static void method1297(int arg0) {
        field2499 = null;
        field2493 = null;
        int var1 = -90 / ((arg0 - 81) / 38);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I", line = 14)
    public final int method8(byte arg0) {
        ++field2496;
        if (arg0 != 4) {
            return 116;
        } else {
            return !super.field3867.method733(-127).method3988(0) ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 25)
    public final void method2(boolean arg0) {
        ++field2497;
        if (super.field3868 < 1 || super.field3868 > 3) {
            super.field3868 = this.method8((byte) 4);
        }
        if (arg0) {
            method1300(62, (class65) null, true, -95, (class668) null, 26);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;Z)V", line = 38)
    public static final void method1298(String arg0, boolean arg1, int arg2, String arg3, boolean arg4) {
        class83.field1175 = arg3;
        class506.field6998 = arg4;
        class537.field7310 = arg0;
        if (!arg4) {
            class450.field6276 = -1;
        }
        class57.field801 = arg1;
        ++field2500;
        if (class506.field6998 || !class83.field1175.equals("") && !class537.field7310.equals("")) {
            if (class397.field5830 != 1) {
                class624.field8383 = -1;
                class10.field164 = 0;
            }
            class539.field7334 = false;
            class624.method3415(-3, arg2 + 2);
            class674.field9468 = 1;
            class12.field180 = arg2;
            class113.field1541 = 0;
        } else {
            class624.method3415(3, 2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)I", line = 72)
    public final int method4(int arg0, byte arg1) {
        ++field2495;
        int var3 = -16 % ((arg1 - -53) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I", line = 82)
    public final int method1299(int arg0) {
        ++field2494;
        return arg0 <= 3 ? 120 : super.field3868;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILha;ZILor;I)V", line = 93)
    public static final void method1300(int arg0, class65 arg1, boolean arg2, int arg3, class668 arg4, int arg5) {
        for (int var6 = 7; var6 >= 0; --var6) {
            for (int var7 = 127; ~var7 <= -1; --var7) {
                int var8 = (arg3 & 63) << 10 | 896 & var6 << 7 | 127 & var7;
                class679.method3753(true, false, true);
                int var9 = class145.field2069[var8];
                class182.method1269(true, -11692, false);
                arg1.method563((arg4.field9282 * var7 >> 7) + arg0, ((-var6 + 7) * arg4.field9297 >> 3) + arg5, (arg4.field9282 >> 7) - -1, (arg4.field9297 >> 3) - -1, var9, 0);
            }
        }
        if (arg2) {
            method1298((String) null, false, -41, (String) null, true);
        }
        ++field2498;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I", line = 131)
    public static final int method1301(int arg0, int arg1, int arg2, int arg3) {
        ++field2501;
        int var4 = arg2 / arg1;
        if (arg0 != 0) {
            field2499 = null;
        }
        int var5 = arg1 + -1 & arg2;
        int var6 = arg3 / arg1;
        int var7 = arg1 + -1 & arg3;
        int var8 = class519.method3004((byte) 121, var4, var6);
        int var9 = class519.method3004((byte) -31, var4 + 1, var6);
        int var10 = class519.method3004((byte) -59, var4, var6 + 1);
        int var11 = class519.method3004((byte) 89, var4 + 1, var6 + 1);
        int var12 = class417.method2573(var5, var8, arg1, arg0 + 65536, var9);
        int var13 = class417.method2573(var5, var10, arg1, 65536, var11);
        return class417.method2573(var7, var12, arg1, arg0 + 65536, var13);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILfca;)V", line = 171)
    public class187(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lfca;)V", line = 174)
    public class187(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IB)V", line = 177)
    public final void method9(int arg0, byte arg1) {
        ++field2502;
        super.field3868 = arg0;
        if (arg1 != -107) {
            field2493 = null;
        }
    }
}
