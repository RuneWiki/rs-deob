import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class633 {

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lba;")
    private class607 field9216 = new class607(256);

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Lba;")
    private class607 field9219 = new class607(256);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lkr;")
    private class329 field9205;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Lkr;")
    private class329 field9218;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lkr;")
    public static class329 field9213;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[Lqn;")
    public static class527[] field9207;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[I)Lti;")
    private final class300 method3657(int arg0, int arg1, int arg2, int[] arg3) {
        field9217++;
        int var5 = arg0 ^ (arg2 >>> 12 | (arg2 & 0xC0000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class300 var9 = (class300) this.field9219.method3476(var7, (byte) 28);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class490 var10 = class490.method2753(this.field9218, arg2, arg0);
            if (arg1 != -6598) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class300 var11 = var10.method2756();
                this.field9219.method3475(-109, var11, var7);
                if (arg3 != null) {
                    arg3[0] -= var11.field3913.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B[II)Lti;")
    public final class300 method3658(byte arg0, int[] arg1, int arg2) {
        if (arg0 <= 16) {
            this.method3658((byte) -22, null, -46);
        }
        field9206++;
        if (this.field9218.method2046((byte) 64) == 1) {
            return this.method3657(arg2, -6598, 0, arg1);
        } else if (this.field9218.method2064(0, arg2) == 1) {
            return this.method3657(0, -6598, arg2, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[II)Lti;")
    private final class300 method3659(int arg0, int arg1, int[] arg2, int arg3) {
        field9214++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & arg1) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class300 var9 = (class300) this.field9219.method3476(var7, (byte) 28);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class572 var10 = (class572) this.field9216.method3476(var7, (byte) 28);
            if (var10 == null) {
                var10 = class572.method3222(this.field9205, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field9216.method3475(arg1 ^ 0xFFFF0073, var10, var7);
            }
            class300 var11 = var10.method3223(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method589(-8880);
                this.field9219.method3475(-126, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static void method3660(int arg0) {
        if (arg0 != 16777215) {
            field9213 = null;
        }
        field9207 = null;
        field9213 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB[I)Lti;")
    public final class300 method3661(int arg0, byte arg1, int[] arg2) {
        field9209++;
        if (this.field9205.method2046((byte) 64) == 1) {
            return this.method3659(arg0, arg1 ^ 0xFFFF0072, arg2, 0);
        }
        if (arg1 != -123) {
            this.field9216 = null;
        }
        if (this.field9205.method2064(arg1 ^ 0xFFFFFF85, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method3659(0, 65527, arg2, arg0);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static final void method3662(int arg0) {
        if (arg0 != 1) {
            method3662(-125);
        }
        if (class630.field9188 == 2) {
            class597.method3438((byte) 124, 3);
        } else if (class630.field9188 == 6) {
            class597.method3438((byte) 124, 7);
        } else if (class630.field9188 == 9) {
            class597.method3438((byte) 124, 10);
        }
        field9210++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZI)Lfd;")
    public static final class143 method3663(int arg0, boolean arg1, int arg2) {
        field9208++;
        class143 var3 = new class143();
        var3.field1822 = -1;
        var3.field1841 = arg0 + 6;
        var3.field1825 = arg2 + 6;
        var3.field1839 = -1;
        if (arg1) {
            field9207 = null;
        }
        var3.field1833 = new int[var3.field1825][var3.field1841];
        var3.method785(2097152);
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILqa;)V")
    public static final void method3664(int arg0, class167 arg1) {
        field9212++;
        if (!(class50.field673 >= 2 || class280.field3669) || class15.field162 != null) {
            return;
        }
        String var2;
        if (class280.field3669 && class50.field673 < 2) {
            var2 = class88.field1171 + class170.field2149.method2157(class245.field3103, 4074) + class126.field1571 + " ->";
        } else if (class592.field8560 && class634.field9227.method2004((byte) -53, 81) && class50.field673 > 2) {
            var2 = class247.method1515(-123, (class245) class57.field760.field7933.field1399.field1399);
        } else {
            class245 var3 = (class245) class57.field760.field7933.field1399;
            var2 = class247.method1515(-117, var3);
            int[] var4 = null;
            if (class630.method3645(true, var3.field3094)) {
                var4 = class98.field1307.method3391(arg0 ^ 0x1, (int) var3.field3099).field6491;
            } else if (var3.field3100 != -1) {
                var4 = class98.field1307.method3391(0, var3.field3100).field6491;
            } else if (class17.method77(arg0 ^ 0xFFFF8A0C, var3.field3094)) {
                class480 var5 = (class480) class131.field1619.method3476((long) ((int) var3.field3099), (byte) 28);
                if (var5 != null) {
                    class585 var6 = var5.field6729;
                    class626 var7 = var6.field8478;
                    if (var7.field9085 != null) {
                        var7 = var7.method3607(false, class257.field3191);
                    }
                    if (var7 != null) {
                        var4 = var7.field9110;
                    }
                }
            } else if (class318.method1981(15, var3.field3094)) {
                Object var8 = null;
                class137 var9;
                if (var3.field3094 == 1012) {
                    var9 = class626.field9084.method1093(0, (int) var3.field3099);
                } else {
                    var9 = class626.field9084.method1093(arg0 - 1, (int) (var3.field3099 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field1719 != null) {
                    var9 = var9.method722(class257.field3191, -1);
                }
                if (var9 != null) {
                    var4 = var9.field1702;
                }
            }
            if (var4 != null) {
                var2 = var2 + class66.method384((byte) 97, var4);
            }
        }
        if (class50.field673 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class50.field673 - 2) + class68.field894.method2157(class245.field3103, 4074);
        }
        if (arg0 != 1) {
            return;
        }
        if (class18.field208 != null) {
            class262 var11 = class18.field208.method2605(arg1, (byte) 89);
            if (var11 == null) {
                var11 = class95.field1282;
            }
            var11.method1616(class355.field4975, class324.field4449, class18.field208.field6327, class18.field208.field6183, class99.field1325, class307.field3935, class106.field1370, 192, class558.field7811, class18.field208.field6218, var2, class18.field208.field6200, class18.field208.field6198, class134.field1639, class18.field208.field6330);
            class433.method2527(true, class324.field4449[3], class324.field4449[2], class324.field4449[0], class324.field4449[1]);
        } else if (class174.field2259 != null && class612.field8806 == class26.field453) {
            int var10 = class95.field1282.method1609(class563.field7881 + 16, class623.field8996 + 4, class558.field7811, 0, class134.field1639, class106.field1370, (byte) -121, class355.field4975, var2, 16777215);
            class433.method2527(true, 16, class627.field9137.method856(arg0 - 1, var2) + var10, class623.field8996 + 4, class563.field7881);
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lkr;Lkr;)V")
    public class633(class329 arg0, class329 arg1) {
        this.field9205 = arg1;
        this.field9218 = arg0;
    }
}
