import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class106 extends class371 implements class223 {

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Lmj;")
    public class171 field1491;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Z")
    private boolean field1496;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "[[Z")
    public static boolean[][] field1485 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lij;")
    public static class316 field1482;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lea;I)V", line = 4)
    public final void method707(class58 arg0, int arg1) {
        if (arg1 < -99) {
            ++field1498;
            class116 var3 = this.field1491.method1223(super.field5135, arg0, false, super.field5137, 131072, 18928, true);
            if (var3 != null) {
                this.field1491.method1225((byte) 7, arg0, false, super.field5137 >> 7, super.field5137 >> 7, super.field5135 >> 7, super.field5135 >> 7, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 21)
    public final void method708(int arg0) {
        ++field1497;
        if (arg0 != 26389) {
            this.field1491 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lea;Lp;IIIIIIIZIIII)V", line = 33)
    public class106(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class160.method1159((byte) -108, arg2, arg3));
        this.field1491 = new class171(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field1496 = ~arg1.field6297 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V", line = 43)
    public static void method806(byte arg0) {
        field1485 = null;
        field1482 = null;
        if (arg0 != -53) {
            method806((byte) 67);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lea;BI)Lts;", line = 54)
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        if (arg1 != -63) {
            return null;
        } else {
            ++field1495;
            return this.field1491.method1223(0, arg0, false, 0, arg2, 18928, false);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I", line = 66)
    public final int method807(byte arg0) {
        if (arg0 > -99) {
            return 106;
        } else {
            ++field1493;
            return this.field1491.method1217(-12);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILea;I)Z", line = 81)
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field1486;
        class116 var5 = this.field1491.method1223(super.field5135, arg2, false, super.field5137, 65536, 18928, false);
        if (var5 == null) {
            return false;
        } else if (!arg0) {
            return false;
        } else {
            class309 var6 = arg2.method210();
            var6.method1866(super.field5139 + super.field5135, super.field5144, super.field5137 - -super.field5143);
            return var5.method898(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I", line = 102)
    public final int method695(int arg0) {
        ++field1481;
        return arg0 != 898 ? 59 : this.field1491.field2438;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILea;)V", line = 118)
    public final void method704(int arg0, class58 arg1) {
        this.field1491.method1216(-15436, arg1);
        ++field1484;
        if (arg0 != -29096) {
            field1485 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLea;)V", line = 132)
    public final void method698(byte arg0, class58 arg1) {
        int var3 = 85 / ((24 - arg0) / 49);
        ++field1487;
        this.field1491.method1226(-30, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I", line = 143)
    public final int method709(int arg0) {
        ++field1494;
        if (arg0 != 30030) {
            this.method709(-65);
        }
        return this.field1491.field2437;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z", line = 155)
    public final boolean method706(boolean arg0) {
        ++field1489;
        if (!arg0) {
            this.method706(true);
        }
        return this.field1491.method1222((byte) -123);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)I", line = 166)
    public final int method711(boolean arg0) {
        ++field1483;
        return !arg0 ? -75 : this.field1491.field2445;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(ILea;)Lms;", line = 181)
    public final class450 method696(int arg0, class58 arg1) {
        ++field1490;
        class116 var3 = this.field1491.method1223(super.field5135, arg1, false, super.field5137, 1024, arg0 ^ 18928, true);
        if (var3 == null) {
            return null;
        } else {
            class309 var4 = arg1.method210();
            var4.method1866(super.field5135 - -super.field5139, super.field5144, super.field5137 - -super.field5143);
            if (arg0 != 0) {
                field1485 = null;
            }
            class450 var5 = null;
            if (this.field1496) {
                var5 = class61.method494(-74, 1);
            }
            if (this.field1491.field2434 == null) {
                var3.method896(var4, var5 == null ? null : var5.field6451[0], 0);
            } else {
                class174 var6 = this.field1491.field2434.method1552();
                arg1.method172(var3, var6, var4, var5 != null ? var5.field6451[0] : null, 0);
            }
            this.field1491.method1225((byte) 41, arg1, true, super.field5137 >> 7, super.field5137 >> 7, super.field5135 >> 7, super.field5135 >> 7, var3);
            return var5;
        }
    }
}
