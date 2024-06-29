import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class390 extends class712 {

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    private int field5050 = 0;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    private int field5043 = -1;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "Z")
    private boolean field5046 = true;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    private int field5055 = 0;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "Z")
    public boolean field5040 = false;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    private int field5045 = 0;

    @OriginalMember(owner = "client!pa", name = "vb", descriptor = "I")
    private int field5067 = 0;

    @OriginalMember(owner = "client!pa", name = "yb", descriptor = "I")
    private int field5070 = 0;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!pa", name = "wb", descriptor = "I")
    private int field5068;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lfs;")
    private class582 field5044;

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "[I")
    public static int[] field5058 = new int[4096];

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!pa", name = "sb", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!pa", name = "ub", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!pa", name = "xb", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!pa", name = "tb", descriptor = "Lha;")
    public static class66 field5065;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "Lsia;")
    private class766 field5049;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 3)
    public class390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5060 = arg1 + arg2;
        this.field5070 = arg12;
        this.field5068 = arg0;
        class308 var14 = class740.field10303.method1473(-53, this.field5068);
        int var15 = var14.field3824;
        if (var15 == -1) {
            this.field5040 = true;
        } else {
            this.field5044 = class362.field4504.method3600(-48, var15);
            this.field5040 = false;
        }
        if (~this.field5060 == ~arg2) {
            class60.method520(this.field5067, (byte) -88, this, this.field5044);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(Z)V", line = 31)
    public final void method530(boolean arg0) {
        if (arg0) {
            method2285();
        }
        ++field5059;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILkq;II)V", line = 47)
    public static final void method2283(int arg0, class620 arg1, int arg2, int arg3) {
        if (arg2 == 4743) {
            if (~arg1.field8452 != -1) {
                if (~arg1.field8452 != -2) {
                    if (arg1.field8452 == 2) {
                        arg1.field8492 = -arg1.field8490 + -arg1.field8416 + arg3;
                    } else if (~arg1.field8452 == -4) {
                        arg1.field8492 = arg1.field8490 * arg3 >> 14;
                    } else if (~arg1.field8452 == -5) {
                        arg1.field8492 = (arg1.field8490 * arg3 >> 14) + (arg3 - arg1.field8416) / 2;
                    } else {
                        arg1.field8492 = -arg1.field8416 + arg3 + -(arg1.field8490 * arg3 >> 14);
                    }
                } else {
                    arg1.field8492 = (-arg1.field8416 + arg3) / 2 + arg1.field8490;
                }
            } else {
                arg1.field8492 = arg1.field8490;
            }
            if (arg1.field8456 != 0) {
                if (arg1.field8456 == 1) {
                    arg1.field8383 = (-arg1.field8506 + arg0) / 2 + arg1.field8375;
                } else if (~arg1.field8456 != -3) {
                    if (~arg1.field8456 != -4) {
                        if (~arg1.field8456 != -5) {
                            arg1.field8383 = -arg1.field8506 + arg0 + -(arg1.field8375 * arg0 >> 14);
                        } else {
                            arg1.field8383 = (arg1.field8375 * arg0 >> 14) + (-arg1.field8506 + arg0) / 2;
                        }
                    } else {
                        arg1.field8383 = arg1.field8375 * arg0 >> 14;
                    }
                } else {
                    arg1.field8383 = arg0 - arg1.field8506 + -arg1.field8375;
                }
            } else {
                arg1.field8383 = arg1.field8375;
            }
            ++field5057;
            if (class687.field9373) {
                if (client.method1882(arg1).field5126 != 0 || arg1.field8371 == 0) {
                    if (~arg1.field8383 > -1) {
                        arg1.field8383 = 0;
                    } else if (arg1.field8383 - -arg1.field8506 > arg0) {
                        arg1.field8383 = -arg1.field8506 + arg0;
                    }
                    if (arg1.field8492 >= 0) {
                        if (~arg3 > ~(arg1.field8492 + arg1.field8416)) {
                            arg1.field8492 = -arg1.field8416 + arg3;
                            return;
                        }
                    } else {
                        arg1.field8492 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 119)
    public static void method2284(int arg0) {
        field5065 = null;
        if (arg0 != 0) {
            method2285();
        }
        field5058 = null;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(Z)Z", line = 135)
    public final boolean method531(boolean arg0) {
        ++field5038;
        if (arg0) {
            this.method2288(83, -79, 35, (class66) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I", line = 157)
    public final int method508(int arg0) {
        ++field5056;
        if (arg0 != -4798) {
            this.field5046 = true;
        }
        return this.field5050;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(ILha;)Lrk;", line = 177)
    public final class35 method502(int arg0, class66 arg1) {
        ++field5064;
        class498 var3 = this.method2288(2048 | (~this.field5070 != -1 ? 5 : 0), -1, this.field5068, arg1);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -110 / ((47 - arg0) / 63);
            if (~this.field5070 != -1) {
                var3.method360(this.field5070 * 2048);
            }
            class778 var5 = arg1.method576();
            var5.method130(super.field823, super.field809, super.field813);
            this.method2286(-11565, var5, arg1, var3);
            class35 var6 = class415.method2476(1, (byte) -19, false);
            if (class502.field7084) {
                var3.method388(var5, var6.field537[0], class621.field8528, 0);
            } else {
                var3.method355(var5, var6.field537[0], 0);
            }
            if (this.field5049 != null) {
                class460 var7 = this.field5049.method4244();
                if (!class502.field7084) {
                    arg1.method582(var7);
                } else {
                    arg1.method590(var7, class621.field8528);
                }
            }
            this.field5046 = var3.method380();
            this.field5055 = var3.method404();
            this.field5050 = var3.method394();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBILha;)Z", line = 227)
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        if (arg1 <= 19) {
            return true;
        } else {
            ++field5051;
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lgda;Lha;IIZII)V", line = 238)
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field5062;
        if (arg6 >= -6) {
            field5041 = -71;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 249)
    public static final void method2285() {
        class613.field8242 = class613.field8240;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)Z", line = 252)
    public final boolean method504(byte arg0) {
        ++field5053;
        return arg0 != -24 ? true : this.field5046;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lha;I)V", line = 265)
    public final void method500(class66 arg0, int arg1) {
        ++field5066;
        class498 var3 = this.method2288(0, arg1, this.field5068, arg0);
        if (var3 != null) {
            class778 var4 = arg0.method576();
            var4.method130(super.field823, super.field809, super.field813);
            this.method2286(arg1 + -11564, var4, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILnh;Lha;Lka;)V", line = 284)
    private final void method2286(int arg0, class778 arg1, class66 arg2, class498 arg3) {
        arg3.method389(arg1);
        if (arg0 != -11565) {
            this.method524((class61) null, (class66) null, 118, -122, false, 44, -80);
        }
        ++field5061;
        class62[] var5 = arg3.method371();
        class28[] var6 = arg3.method370();
        if ((this.field5049 == null || this.field5049.field10547) && (var5 != null || var6 != null)) {
            this.field5049 = class766.method4253(class228.field2707, true);
        }
        if (this.field5049 != null) {
            this.field5049.method4250(arg2, (long) class228.field2707, var5, var6, false);
            this.field5049.method4240(super.field808, super.field9994, super.field9991, super.field9997, super.field9990);
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I", line = 308)
    public final int method509(int arg0) {
        int var2 = -121 / ((arg0 - -38) / 56);
        ++field5039;
        return this.field5055;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V", line = 318)
    public static final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -3) {
            field5065 = null;
        }
        ++field5042;
        if (~arg0 <= ~class471.field6572 && ~arg0 >= ~class223.field2604) {
            int var5 = class155.method1103(class187.field2268, arg2, false, class461.field6480);
            int var6 = class155.method1103(class187.field2268, arg1, false, class461.field6480);
            class248.method1492(var6, arg0, true, var5, arg4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)Z", line = 335)
    public final boolean method503(boolean arg0) {
        ++field5054;
        if (arg0) {
            this.field5044 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILha;)Lka;", line = 346)
    private final class498 method2288(int arg0, int arg1, int arg2, class66 arg3) {
        ++field5063;
        class308 var5 = class740.field10303.method1473(-69, arg2);
        class296 var6 = class707.field9933[super.field808];
        if (arg1 != -1) {
            this.field5045 = -100;
        }
        class296 var7 = ~super.field811 <= -4 ? null : class707.field9933[super.field811 + 1];
        return this.field5040 ? var5.method1821(-1, arg0, class362.field4504, true, (byte) 45, super.field813, 0, arg3, var6, -1, var7, super.field809, super.field823) : var5.method1821(this.field5067, arg0, class362.field4504, true, (byte) 45, super.field813, this.field5045, arg3, var6, this.field5043, var7, super.field809, super.field823);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V", line = 364)
    public final void method2289(int arg0, int arg1) {
        ++field5052;
        if (arg0 != 5728) {
            field5041 = 35;
        }
        if (!this.field5040) {
            this.field5045 += arg1;
            while (~this.field5044.field7936[this.field5067] > ~this.field5045) {
                this.field5045 -= this.field5044.field7936[this.field5067];
                ++this.field5067;
                if (this.field5044.field7955.length <= this.field5067) {
                    this.field5040 = true;
                    break;
                }
            }
            if (!this.field5040) {
                class60.method520(this.field5067, (byte) -76, this, this.field5044);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 396)
    protected final void finalize() {
        if (this.field5049 != null) {
            this.field5049.method4247();
        }
        ++field5069;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 413)
    public final void method2290(int arg0) {
        if (this.field5049 != null) {
            this.field5049.method4247();
        }
        ++field5047;
        if (arg0 != -1) {
            this.method501(87, (byte) 60, 80, (class66) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLha;)Loba;", line = 427)
    public final class276 method507(boolean arg0, class66 arg1) {
        if (arg0) {
            this.method508(-87);
        }
        ++field5048;
        return null;
    }
}
