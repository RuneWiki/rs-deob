import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class187 extends class535 implements class141 {

    @OriginalMember(owner = "client!vp", name = "Y", descriptor = "Z")
    private boolean field2695 = false;

    @OriginalMember(owner = "client!vp", name = "X", descriptor = "Lfc;")
    public class258 field2694;

    @OriginalMember(owner = "client!vp", name = "hb", descriptor = "Z")
    private boolean field2704;

    @OriginalMember(owner = "client!vp", name = "W", descriptor = "[J")
    public static long[] field2693 = new long[100];

    @OriginalMember(owner = "client!vp", name = "Q", descriptor = "Lqe;")
    public static class465 field2687 = new class465(105, -1);

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!vp", name = "P", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!vp", name = "R", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!vp", name = "S", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!vp", name = "T", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!vp", name = "U", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!vp", name = "V", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!vp", name = "Z", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!vp", name = "ab", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!vp", name = "bb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!vp", name = "cb", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!vp", name = "db", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!vp", name = "eb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!vp", name = "fb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!vp", name = "gb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!vp", name = "jb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!vp", name = "kb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!vp", name = "lb", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!vp", name = "mb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!vp", name = "nb", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!vp", name = "ib", descriptor = "Ltb;")
    private class397 field2705;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 7)
    public static final Object method1323(int arg0, boolean arg1, byte[] arg2) {
        ++field2686;
        if (arg0 != 100) {
            field2696 = -71;
        }
        if (arg2 == null) {
            return null;
        } else {
            if (~arg2.length < -137 && !class377.field5273) {
                try {
                    class230 var3 = (class230) Class.forName("dv").newInstance();
                    var3.method1580(false, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class377.field5273 = true;
                }
            }
            return arg1 ? class570.method3328(0, arg2) : arg2;
        }
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "(B)Z", line = 42)
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            this.method395((byte) 58);
        }
        ++field2702;
        return this.field2695;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)I", line = 53)
    public final int method393(byte arg0) {
        ++field2698;
        if (arg0 != -83) {
            this.field2704 = false;
        }
        return this.field2694.method1757(false);
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)Z", line = 64)
    public final boolean method395(byte arg0) {
        if (arg0 != 84) {
            return false;
        } else {
            ++field2706;
            return false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLha;)V", line = 75)
    public final void method1110(byte arg0, class58 arg1) {
        this.field2694.method1751(arg1, true);
        if (arg0 < 9) {
            this.field2695 = false;
        }
        ++field2708;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I", line = 86)
    public final int method1109(byte arg0) {
        ++field2691;
        int var2 = -55 % ((arg0 - -45) / 39);
        return this.field2694.field3764;
    }

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "(I)V", line = 97)
    public static void method1324(int arg0) {
        field2687 = null;
        if (arg0 != -1) {
            method1323(-114, false, (byte[]) null);
        }
        field2693 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lha;IZI)Z", line = 108)
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field2690;
        if (!arg2) {
            field2696 = 58;
        }
        class469 var5 = this.field2694.method1747(131072, -1, arg0, false, false);
        if (var5 == null) {
            return false;
        } else {
            class280 var6 = arg0.method530();
            var6.method157(super.field7560 + super.field644, super.field651, super.field7557 + super.field648);
            return class339.field4781 ? var5.method318(arg3, arg1, var6, false, 0, class220.field3129) : var5.method348(arg3, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)I", line = 127)
    public final int method404(int arg0) {
        ++field2689;
        if (arg0 != 65535) {
            field2697 = 93;
        }
        return this.field2694.method1755(arg0 + 1709022599);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Z", line = 140)
    public final boolean method1113(int arg0) {
        if (arg0 != -24333) {
            return true;
        } else {
            ++field2707;
            return this.field2694.method1753(false);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I", line = 151)
    public final int method1112(byte arg0) {
        ++field2709;
        int var2 = -119 / ((-75 - arg0) / 34);
        return this.field2694.field3757;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(BLha;)V", line = 166)
    public final void method401(byte arg0, class58 arg1) {
        if (arg0 != -39) {
            this.method1108((class58) null, 110);
        }
        ++field2710;
        class469 var3 = this.field2694.method1747(262144, -1, arg1, true, false);
        if (var3 != null) {
            int var4 = super.field644 >> 9;
            int var5 = super.field648 >> 9;
            class280 var6 = arg1.method530();
            var6.method157(super.field644, super.field651, super.field648);
            this.field2694.method1754(var5, arg1, arg0 ^ 230, var6, false, var5, var4, var3, var4);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(JIILeq;BZI)V", line = 191)
    public static final void method1325(long arg0, int arg1, int arg2, class209 arg3, byte arg4, boolean arg5, int arg6) {
        ++field2685;
        class46.method416(arg6, arg3, arg0, arg2, 0, arg1, 10000, arg5);
        if (arg4 >= -109) {
            method1324(-105);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIIIIIIIIIII)V", line = 202)
    public static final void method1326(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field2701;
        if (class4.method19(95, arg7)) {
            if (class463.field6662[arg7] != null) {
                client.method1947(class463.field6662[arg7], -1, arg6, arg5, arg11, arg4, arg9, arg2, arg1, arg8, arg3, arg10);
            } else {
                client.method1947(class117.field1849[arg7], -1, arg6, arg5, arg11, arg4, arg9, arg2, arg1, arg8, arg3, arg10);
            }
            if (!arg0) {
                method1324(-59);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lha;I)V", line = 220)
    public final void method1108(class58 arg0, int arg1) {
        ++field2692;
        int var3 = -43 / ((arg1 - 44) / 49);
        this.field2694.method1752(arg0, (byte) -45);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lha;Luw;IIIIIZIIIII)V", line = 232)
    public class187(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field2694 = new class258(arg0, arg1, arg10, arg11, super.field649, arg3, this, arg7, arg12);
        this.field2704 = arg1.field5737 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(BLha;)Lvw;", line = 260)
    public final class304 method396(byte arg0, class58 arg1) {
        ++field2703;
        class469 var3 = this.field2694.method1747(2048, -1, arg1, true, false);
        if (var3 == null) {
            return null;
        } else {
            class280 var4 = arg1.method530();
            var4.method157(super.field7560 + super.field644, super.field651, super.field648 - -super.field7557);
            class304 var5 = class359.method2239(1, this.field2704, (byte) 124);
            int var6 = super.field644 >> 9;
            int var7 = super.field648 >> 9;
            this.field2694.method1754(var7, arg1, -193, var4, true, var7, var6, var3, var6);
            if (class339.field4781) {
                var3.method343(var4, var5.field4298[0], class220.field3129, 0);
            } else {
                var3.method329(var4, var5.field4298[0], 0);
            }
            if (arg0 < 3) {
                field2696 = 27;
            }
            if (this.field2694.field3736 != null) {
                class624 var8 = this.field2694.field3736.method4185();
                if (!class339.field4781) {
                    arg1.method593(var8);
                } else {
                    arg1.method643(var8, class220.field3129);
                }
            }
            this.field2695 = var3.method332() || this.field2694.field3736 != null;
            if (this.field2705 != null) {
                class715.method3982(-24762, super.field648, super.field651, this.field2705, var3, super.field644);
            } else {
                this.field2705 = class719.method4012(super.field644, super.field648, var3, super.field651, (byte) -108);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lha;Z)Ltb;", line = 311)
    public final class397 method397(class58 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field2699;
            return this.field2705;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I", line = 322)
    public final int method1111(boolean arg0) {
        if (arg0) {
            return 12;
        } else {
            ++field2688;
            return this.field2694.field3755;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 334)
    public final void method1114(int arg0) {
        if (arg0 >= 63) {
            ++field2700;
        }
    }
}
