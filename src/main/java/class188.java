import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class class188 extends class361 {

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "S")
    public short field2233;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field2231 = 0;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "Lbo;")
    public static class727 field2237;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "[I")
    public static int[] field2238;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B[Lada;)I", line = 4)
    public final int method1150(byte arg0, class163[] arg1) {
        ++field2235;
        return arg0 > -44 ? 94 : this.method2121(super.field4629 >> class748.field10430, arg1, -82, super.field4635 >> class748.field10430);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIII)V", line = 23)
    public class188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field4627 = arg1;
        super.field4629 = arg2;
        super.field4633 = (byte) arg4;
        super.field4635 = arg0;
        super.field4628 = (byte) arg3;
        this.field2233 = (short) arg5;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLfd;ZILfd;)I", line = 37)
    public static final int method1151(byte arg0, class526 arg1, boolean arg2, int arg3, class526 arg4) {
        ++field2229;
        if (arg3 == 1) {
            int var5 = arg1.field9071;
            int var6 = arg4.field9071;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class37.method175(arg4.method3081((byte) 62).field1017, 2, class489.field6978, arg1.method3081((byte) 62).field1017);
        } else {
            if (arg0 > -107) {
                method1155((byte) 71);
            }
            if (arg3 == 3) {
                if (!arg1.field7496.equals("-")) {
                    if (arg4.field7496.equals("-")) {
                        return !arg2 ? -1 : 1;
                    } else {
                        return class37.method175(arg4.field7496, 2, class489.field6978, arg1.field7496);
                    }
                } else if (arg4.field7496.equals("-")) {
                    return 0;
                } else {
                    return arg2 ? -1 : 1;
                }
            } else if (arg3 == 4) {
                if (arg1.method3623(0)) {
                    return arg4.method3623(0) ? 0 : 1;
                } else {
                    return arg4.method3623(0) ? -1 : 0;
                }
            } else if (~arg3 == -6) {
                if (!arg1.method3622((byte) -127)) {
                    return !arg4.method3622((byte) -122) ? 0 : -1;
                } else {
                    return !arg4.method3622((byte) -117) ? 1 : 0;
                }
            } else if (~arg3 == -7) {
                if (!arg1.method3624(0)) {
                    return arg4.method3624(0) ? -1 : 0;
                } else {
                    return !arg4.method3624(0) ? 1 : 0;
                }
            } else if (~arg3 == -8) {
                if (!arg1.method3621(-19594)) {
                    return arg4.method3621(-19594) ? -1 : 0;
                } else {
                    return arg4.method3621(-19594) ? 0 : 1;
                }
            } else if (~arg3 == -9) {
                int var7 = arg1.field7495;
                int var8 = arg4.field7495;
                if (!arg2) {
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                    if (~var7 == 0) {
                        var7 = 1000;
                    }
                } else {
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                    if (~var7 == -1001) {
                        var7 = -1;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field7497 - arg4.field7497;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z", line = 134)
    public final boolean method1152(int arg0) {
        if (arg0 != -4) {
            method1151((byte) -44, (class526) null, false, 44, (class526) null);
        }
        ++field2230;
        return class240.method1414(30633, super.field4635 >> class748.field10430, super.field4629 >> class748.field10430, super.field4633);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 146)
    public static final byte[] method1153(int arg0, String arg1) {
        ++field2232;
        int var2 = arg1.length();
        if (~var2 == -1) {
            return new byte[0];
        } else {
            int var3 = var2 + 3 & -4;
            int var4 = var3 / 4 * 3;
            if (var3 - 2 < var2 && class591.method3383((byte) -7, arg1.charAt(var3 + -2)) != -1) {
                if (~(var3 - 1) <= ~var2 || ~class591.method3383((byte) -7, arg1.charAt(var3 + -1)) == 0) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            int var5 = 20 / ((arg0 - 36) / 60);
            byte[] var6 = new byte[var4];
            class161.method1000(arg1, var6, 0, (byte) 16);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)Z", line = 179)
    public final boolean method1154(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field2236;
            return class233.field2770[(super.field4635 >> class748.field10430) + -class440.field6387 + class626.field8992][(super.field4629 >> class748.field10430) - class444.field6433 + class626.field8992];
        }
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "(B)V", line = 190)
    public static void method1155(byte arg0) {
        if (arg0 < -55) {
            field2237 = null;
            field2238 = null;
        }
    }
}
