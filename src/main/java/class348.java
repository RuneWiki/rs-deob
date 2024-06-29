import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class348 extends class577 {

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public int field4862 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public int field4865 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public int field4864 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field4871 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field4872 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field4875 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field4873 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public int field4876 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lqe;")
    public class492 field4866;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "D")
    public static double field4863;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lhu;")
    public static class141 field4877;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 3)
    public static final int method2204(byte arg0, String arg1) {
        field4861++;
        return arg0 > -51 ? 55 : arg1.length() + 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLru;Lru;BI)I", line = 20)
    public static final int method2205(boolean arg0, class204 arg1, class204 arg2, byte arg3, int arg4) {
        field4870++;
        if (arg4 == 1) {
            int var5 = arg1.field7400;
            int var6 = arg2.field7400;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class210.method1446(class140.field2081, arg1.method1426(-44).field3833, -96, arg2.method1426(-78).field3833);
        } else if (arg4 != 3) {
            if (arg3 != 18) {
                field4868 = 124;
            }
            if (arg4 == 4) {
                if (arg1.method3155((byte) 65)) {
                    return arg2.method3155((byte) 87) ? 0 : 1;
                } else if (arg2.method3155((byte) 91)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 5) {
                if (arg1.method3154(-28641)) {
                    return arg2.method3154(arg3 - 28659) ? 0 : 1;
                } else if (arg2.method3154(-28641)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 6) {
                if (arg1.method3153((byte) 13)) {
                    return arg2.method3153((byte) 120) ? 0 : 1;
                } else if (arg2.method3153((byte) 119)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 7) {
                if (arg1.method3152(121)) {
                    return arg2.method3152(arg3 - 98) ? 0 : 1;
                } else if (arg2.method3152(-97)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 8) {
                int var7 = arg1.field3173;
                int var8 = arg2.field3173;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field3170 - arg2.field3170;
            }
        } else if (arg1.field3166.equals("-")) {
            if (arg2.field3166.equals("-")) {
                return 0;
            } else if (arg0) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg2.field3166.equals("-")) {
            return arg0 ? 1 : -1;
        } else {
            return class210.method1446(class140.field2081, arg1.field3166, -55, arg2.field3166);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lqe;)V", line = 180)
    public class348(class492 arg0) {
        this.field4866 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 126)
    public static void method2206(byte arg0) {
        field4877 = null;
        if (arg0 != 62) {
            method2206((byte) 14);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)Z", line = 143)
    public final boolean method2207(int arg0, int arg1, byte arg2) {
        field4867++;
        if (arg1 >= this.field4876 && this.field4865 >= arg1 && this.field4873 <= arg0 && arg0 <= this.field4864) {
            return true;
        } else {
            if (arg2 > -89) {
                method2206((byte) -94);
            }
            return arg1 >= this.field4872 && arg1 <= this.field4862 && arg0 >= this.field4875 && this.field4871 >= arg0;
        }
    }
}
