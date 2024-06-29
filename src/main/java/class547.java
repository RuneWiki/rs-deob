import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class547 extends class408 implements class373 {

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "Lpu;")
    public static class588 field7558 = new class588();

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "B")
    private byte field7557;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "Lbl;")
    public static class674 field7563;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 6)
    public static void method3148(byte arg0) {
        field7563 = null;
        field7558 = null;
        if (arg0 != 0) {
            field7558 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z", line = 22)
    public final boolean method2337(int arg0) {
        if (arg0 != 6544) {
            this.method2337(114);
        }
        ++field7554;
        return super.method2454(super.field5769.field10334, true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V", line = 35)
    public static final void method3149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7556;
        if (arg0 != 203818028) {
            method3148((byte) 125);
        }
        int var6 = arg1 - arg2;
        int var7 = arg5 - arg3;
        if (~var6 == -1) {
            if (~var7 != -1) {
                class54.method332(arg3, 93, arg2, arg5, arg4);
            }
        } else if (var7 == 0) {
            class649.method3604(-115, arg2, arg1, arg3, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (~arg2 > ~class297.field4199) {
                var10 = class297.field4199;
                var11 = (class297.field4199 * var8 >> 12) + var9;
            } else if (class45.field472 >= arg2) {
                var11 = arg3;
                var10 = arg2;
            } else {
                var10 = class45.field472;
                var11 = (class45.field472 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg1 >= class297.field4199) {
                if (class45.field472 < arg1) {
                    var12 = class45.field472;
                    var13 = (class45.field472 * var8 >> 12) + var9;
                } else {
                    var12 = arg1;
                    var13 = arg5;
                }
            } else {
                var12 = class297.field4199;
                var13 = (class297.field4199 * var8 >> 12) + var9;
            }
            if (~var13 <= ~class291.field4156) {
                if (~class233.field3099 > ~var13) {
                    var13 = class233.field3099;
                    var12 = (class233.field3099 - var9 << 12) / var8;
                }
            } else {
                var12 = (-var9 + class291.field4156 << 12) / var8;
                var13 = class291.field4156;
            }
            if (class291.field4156 <= var11) {
                if (~class233.field3099 > ~var11) {
                    var11 = class233.field3099;
                    var10 = (class233.field3099 - var9 << 12) / var8;
                }
            } else {
                var10 = (-var9 + class291.field4156 << 12) / var8;
                var11 = class291.field4156;
            }
            class588.method3303(var12, var13, arg4, var11, var10, 25341);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZILjaclib/memory/Source;I)Z", line = 138)
    public final boolean method2336(boolean arg0, int arg1, Source arg2, int arg3) {
        this.field7557 = (byte) arg1;
        ++field7561;
        super.method2455(arg2, -52, arg3);
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lsha;Z)V", line = 153)
    public class547(class757 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I", line = 156)
    public final int method84(int arg0) {
        ++field7560;
        if (arg0 >= -80) {
            this.method3152((byte) -97);
        }
        return super.method84(-101);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 167)
    public final void method851(int arg0) {
        super.method851(arg0);
        ++field7553;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;CLjava/lang/String;)Ljava/lang/String;", line = 177)
    public static final String method3150(int arg0, String arg1, char arg2, String arg3) {
        ++field7552;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = var4;
        int var7 = var5 + -1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg2, var8);
                if (~var8 > -1) {
                    break;
                }
                ++var8;
                var6 += var7;
            }
        }
        if (arg0 != 31384) {
            return null;
        } else {
            StringBuffer var9 = new StringBuffer(var6);
            int var10 = 0;
            while (true) {
                int var11 = arg1.indexOf(arg2, var10);
                if (~var11 > -1) {
                    var9.append(arg1.substring(var10));
                    return var9.toString();
                }
                var9.append(arg1.substring(var10, var11));
                var10 = var11 + 1;
                var9.append(arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BZ)I", line = 233)
    public static final int method3151(byte arg0, boolean arg1) {
        ++field7562;
        int var2 = class206.field2664;
        if (~var2 != -1) {
            if (var2 != 1) {
                if (~var2 == -3) {
                    return 0;
                } else {
                    if (arg0 != 56) {
                        method3148((byte) 121);
                    }
                    return 0;
                }
            } else {
                return class90.field1281;
            }
        } else {
            return !arg1 ? class90.field1281 : 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 278)
    public final Buffer method2338(boolean arg0, boolean arg1) {
        ++field7551;
        if (arg1) {
            method3150(-97, (String) null, '\b', (String) null);
        }
        return super.method2450((byte) 72, super.field5769.field10334, arg0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z", line = 289)
    public final boolean method2339(int arg0, int arg1, int arg2) {
        this.field7557 = (byte) arg2;
        ++field7555;
        super.method850(arg1 + 24589, arg0);
        if (arg1 != -32754) {
            this.method2338(false, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)I", line = 308)
    public final int method3152(byte arg0) {
        if (arg0 <= 40) {
            field7563 = null;
        }
        ++field7559;
        return this.field7557;
    }
}
