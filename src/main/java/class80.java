import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class80 implements class695 {

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "Ldg;")
    public class377 field1117;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Lfw;")
    public class52 field1108;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "Z")
    public static boolean field1106 = false;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "[I")
    public static int[] field1112;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BIII)V")
    public static final void method633(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 68) {
            method633((byte) 101, 41, 27, 26);
        }
        field1107++;
        if (arg2 == 1003) {
            class523.method2892(class524.field7154, arg3, arg1);
        } else if (arg2 == 1001) {
            class523.method2892(class389.field5461, arg3, arg1);
        } else if (arg2 == 1010) {
            class523.method2892(class508.field6963, arg3, arg1);
        } else if (arg2 == 1006) {
            class523.method2892(class498.field6853, arg3, arg1);
            return;
        } else if (arg2 == 1011) {
            class523.method2892(class143.field2136, arg3, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIII)V")
    public static final void method634(int arg0, int arg1, int arg2, int arg3) {
        field1111++;
        if (arg1 == 0) {
            class679 var4 = class669.method3708(11, arg3, 1403048928);
            var4.method3748(true);
            var4.field9574 = arg2;
            var4.field9573 = arg0;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Lhl;")
    public static final class486 method635(int arg0, int arg1, int arg2) {
        if (class658.field9266[arg0][arg1][arg2] == null) {
            boolean var3 = class658.field9266[0][arg1][arg2] != null && class658.field9266[0][arg1][arg2].field6745 != null;
            if (var3 && arg0 >= class552.field7467 - 1) {
                return null;
            }
            class509.method2833(arg0, arg1, arg2);
        }
        return class658.field9266[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLuq;)Z")
    public static final boolean method636(byte arg0, class147 arg1) {
        field1114++;
        class620 var2 = class164.field2499.method2013(arg1.method554(-18971), false);
        if (var2.field8573 == -1) {
            return true;
        }
        if (arg0 != 98) {
            method633((byte) 105, 15, -107, 99);
        }
        class633 var3 = class367.field5250.method600(var2.field8573, true);
        return var3.field8859 == -1 ? true : var3.method3520(-25614);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLuea;ILlt;IILkw;I)V")
    public static final void method637(byte arg0, class286 arg1, int arg2, class620 arg3, int arg4, int arg5, class225 arg6, int arg7) {
        field1119++;
        class572 var8 = new class572();
        var8.field7708 = arg5;
        var8.field7691 = arg4 << 9;
        var8.field7701 = arg7 << 9;
        if (arg3 != null) {
            var8.field7695 = arg3;
            int var9 = arg3.field8582;
            int var10 = arg3.field8566;
            if (arg2 == 1 || arg2 == 3) {
                var9 = arg3.field8566;
                var10 = arg3.field8582;
            }
            var8.field7693 = arg4 + var9 << 9;
            var8.field7694 = arg3.field8622;
            var8.field7709 = arg3.field8631;
            var8.field7685 = arg7 + var10 << 9;
            var8.field7686 = arg3.field8640 << 9;
            var8.field7707 = arg3.field8607;
            var8.field7688 = arg3.field8569;
            var8.field7697 = arg3.field8629;
            var8.field7696 = arg3.field8620;
            var8.field7683 = arg3.field8611;
            if (arg3.field8623 != null) {
                var8.field7700 = true;
                var8.method3150(arg0 ^ 0xFFFFB3BF);
            }
            if (var8.field7683 != null) {
                var8.field7681 = (int) (Math.random() * (double) (var8.field7694 - var8.field7697)) + var8.field7697;
            }
            class240.field3451.method1273(var8, (byte) 122);
        } else if (arg6 != null) {
            var8.field7690 = arg6;
            class161 var11 = arg6.field3245;
            if (var11.field2409 != null) {
                var8.field7700 = true;
                var11 = var11.method1114(class195.field2888, 0);
            }
            if (var11 != null) {
                var8.field7685 = arg7 + var11.field2463 << 9;
                var8.field7693 = var11.field2463 + arg4 << 9;
                var8.field7688 = class449.method2578(false, arg6);
                var8.field7707 = var11.field2454;
                var8.field7686 = var11.field2423 << 9;
                var8.field7696 = var11.field2461;
            }
            class572.field7692.method1273(var8, (byte) 122);
        } else if (arg1 != null) {
            var8.field7706 = arg1;
            var8.field7693 = arg4 + arg1.method1722((byte) -126) << 9;
            var8.field7685 = arg7 + arg1.method1722((byte) -127) << 9;
            var8.field7688 = class442.method2537(0, arg1);
            var8.field7686 = arg1.field3979 << 9;
            var8.field7696 = arg1.field3956;
            var8.field7707 = arg1.field3950;
            class231.field3288.method2063((long) arg1.field6388, 1, var8);
        }
        if (arg0 != -95) {
            field1112 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIZIIII)V")
    public static final void method638(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -58) {
            field1106 = true;
        }
        if ((arg2 ? class274.field3872.field909 : class274.field3872.field896) != 0 && arg1 != 0 && class357.field5108 < 50 && arg3 != -1) {
            class604.field8394[class357.field5108++] = new class629((byte) (arg2 ? 3 : 2), arg3, arg1, arg6, arg0, arg4);
        }
        field1115++;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Lhs;")
    public class295 method52(int arg0) {
        field1105++;
        return arg0 == -14151 ? null : null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
    public static void method639(byte arg0) {
        int var1 = -92 / ((2 - arg0) / 42);
        field1112 = null;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lfw;Ldg;IIIII)V")
    public class80(class52 arg0, class377 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1113 = arg4;
        this.field1118 = arg3;
        this.field1116 = arg2;
        this.field1110 = arg6;
        this.field1109 = arg5;
        this.field1117 = arg1;
        this.field1108 = arg0;
    }
}
