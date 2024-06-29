import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class523 extends class29 {

    @OriginalMember(owner = "client!no", name = "X", descriptor = "I")
    private int field7242 = 0;

    @OriginalMember(owner = "client!no", name = "V", descriptor = "Z")
    public boolean field7240 = false;

    @OriginalMember(owner = "client!no", name = "kb", descriptor = "Z")
    private boolean field7255 = false;

    @OriginalMember(owner = "client!no", name = "ib", descriptor = "I")
    private int field7253 = 0;

    @OriginalMember(owner = "client!no", name = "ob", descriptor = "I")
    private int field7259 = 0;

    @OriginalMember(owner = "client!no", name = "ub", descriptor = "I")
    private int field7265 = -1;

    @OriginalMember(owner = "client!no", name = "qb", descriptor = "I")
    private int field7261 = 0;

    @OriginalMember(owner = "client!no", name = "W", descriptor = "I")
    private int field7241 = 0;

    @OriginalMember(owner = "client!no", name = "nb", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!no", name = "tb", descriptor = "I")
    private int field7264;

    @OriginalMember(owner = "client!no", name = "db", descriptor = "Lhca;")
    private class186 field7248;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "[[I")
    public static int[][] field7234 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!no", name = "R", descriptor = "Z")
    public static boolean field7236 = false;

    @OriginalMember(owner = "client!no", name = "S", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!no", name = "T", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!no", name = "U", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!no", name = "Y", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!no", name = "ab", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!no", name = "bb", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!no", name = "cb", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!no", name = "eb", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!no", name = "fb", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!no", name = "gb", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!no", name = "hb", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!no", name = "jb", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!no", name = "lb", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!no", name = "mb", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!no", name = "pb", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!no", name = "rb", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!no", name = "sb", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!no", name = "vb", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!no", name = "wb", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!no", name = "xb", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "Lla;")
    public static class409 field7235;

    @OriginalMember(owner = "client!no", name = "Z", descriptor = "Lii;")
    private class514 field7244;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Lr;I)Lcu;", line = 5)
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            this.method2970((byte) -65);
        }
        ++field7250;
        return null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLr;)Lqw;", line = 17)
    public final class329 method165(byte arg0, class562 arg1) {
        if (arg0 < 109) {
            this.field7261 = -44;
        }
        ++field7249;
        class470 var3 = this.method2968(arg1, (~this.field7241 == -1 ? 0 : 5) | 2048, this.field7264, true);
        if (var3 == null) {
            return null;
        } else {
            if (this.field7241 != 0) {
                var3.method612(this.field7241 * 2048);
            }
            class487 var4 = arg1.method1153();
            var4.method359(super.field398, super.field388, super.field397);
            this.method2966(2, var3, arg1, var4);
            if (!class347.field4632) {
                var3.method625(var4, (class667) null, 0);
            } else {
                var3.method648(var4, (class667) null, class414.field5430, 0);
            }
            if (this.field7244 != null) {
                class144 var5 = this.field7244.method2915();
                if (!class347.field4632) {
                    arg1.method1096(var5);
                } else {
                    arg1.method1120(var5, class414.field5430);
                }
            }
            this.field7255 = var3.method657();
            this.field7242 = var3.method613();
            this.field7259 = var3.method621();
            return null;
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(B)I", line = 71)
    public final int method176(byte arg0) {
        ++field7243;
        if (arg0 > -114) {
            this.method176((byte) 5);
        }
        return this.field7242;
    }

    @OriginalMember(owner = "client!no", name = "l", descriptor = "(I)I", line = 83)
    public final int method173(int arg0) {
        ++field7268;
        return arg0 != 0 ? -6 : this.field7259;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I", line = 95)
    public static final int method2965(int arg0, int arg1) {
        if (arg1 != -367701752) {
            return -99;
        } else {
            ++field7263;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 325)
    public class523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7258 = arg1 + arg2;
        this.field7264 = arg0;
        this.field7241 = arg12;
        class521 var14 = class24.field291.method2940(this.field7264, 17);
        int var15 = var14.field7228;
        if (~var15 == 0) {
            this.field7240 = true;
        } else {
            this.field7248 = class423.field5620.method1707(var15, -127);
            this.field7240 = false;
        }
        if (this.field7258 == arg2) {
            class615.method3398(this.field7261, super.field398, this.field7248, -1773, super.field397, super.field385, false);
        }
    }

    @OriginalMember(owner = "client!no", name = "j", descriptor = "(I)Z", line = 121)
    public final boolean method168(int arg0) {
        if (arg0 != 20071) {
            this.field7265 = -43;
        }
        ++field7246;
        return this.field7255;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILda;Lr;Lq;)V", line = 135)
    private final void method2966(int arg0, class470 arg1, class562 arg2, class487 arg3) {
        if (arg0 != 2) {
            this.method168(-78);
        }
        ++field7260;
        arg1.method610(arg3);
        class140[] var5 = arg1.method652();
        class118[] var6 = arg1.method628();
        if ((this.field7244 == null || this.field7244.field7146) && (var5 != null || var6 != null)) {
            this.field7244 = class514.method2909(class327.field4404, true);
        }
        if (this.field7244 != null) {
            this.field7244.method2907(arg2, (long) class327.field4404, var5, var6, false);
            this.field7244.method2906(super.field385, super.field423, super.field420, super.field419, super.field421);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILir;ZILr;IB)V", line = 162)
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        ++field7247;
        if (arg6 < -117) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V", line = 174)
    protected final void finalize() {
        if (this.field7244 != null) {
            this.field7244.method2912();
        }
        ++field7245;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)V", line = 186)
    public final void method2967(int arg0, int arg1) {
        ++field7252;
        if (!this.field7240) {
            this.field7253 += arg1;
            while (~this.field7253 < ~this.field7248.field2595[this.field7261]) {
                this.field7253 -= this.field7248.field2595[this.field7261];
                ++this.field7261;
                if (this.field7248.field2570.length <= this.field7261) {
                    this.field7240 = true;
                    break;
                }
            }
            if (arg0 != 2) {
                this.field7255 = true;
            }
            if (!this.field7240) {
                class615.method3398(this.field7261, super.field398, this.field7248, -1773, super.field397, super.field385, false);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)Z", line = 218)
    public final boolean method161(int arg0) {
        ++field7239;
        return arg0 != 28602;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLr;II)Z", line = 232)
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field7237;
        if (arg0) {
            this.method165((byte) 57, (class562) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(I)Z", line = 253)
    public final boolean method166(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field7251;
            return false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lr;IIZ)Lda;", line = 264)
    private final class470 method2968(class562 arg0, int arg1, int arg2, boolean arg3) {
        ++field7266;
        class521 var5 = class24.field291.method2940(arg2, 17);
        if (!arg3) {
            method2969(87);
        }
        class270 var6 = class454.field5981[super.field385];
        class270 var7 = ~super.field386 > -4 ? class454.field5981[super.field386 + 1] : null;
        return this.field7240 ? var5.method2957(class423.field5620, var7, arg1, arg0, -1, 82, true, super.field388, 0, super.field397, var6, -1, super.field398) : var5.method2957(class423.field5620, var7, arg1, arg0, this.field7261, 126, true, super.field388, this.field7253, super.field397, var6, this.field7265, super.field398);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V", line = 285)
    public final void method175(byte arg0) {
        if (arg0 > 24) {
            ++field7238;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lr;Z)V", line = 303)
    public final void method177(class562 arg0, boolean arg1) {
        ++field7254;
        class470 var3 = this.method2968(arg0, 0, this.field7264, arg1);
        if (var3 != null) {
            class487 var4 = arg0.method1153();
            var4.method359(super.field398, super.field388, super.field397);
            this.method2966(2, var3, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 350)
    public static void method2969(int arg0) {
        field7235 = null;
        if (arg0 == -1) {
            field7234 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 361)
    public final void method2970(byte arg0) {
        if (arg0 > 85) {
            ++field7262;
            if (this.field7244 != null) {
                this.field7244.method2912();
            }
        }
    }
}
