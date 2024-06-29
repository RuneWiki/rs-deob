import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class202 extends class144 {

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    private int field3115 = 0;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    private int field3109 = 0;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    private int field3113 = -1;

    @OriginalMember(owner = "client!iq", name = "eb", descriptor = "Z")
    public boolean field3131 = false;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    private int field3110 = 0;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    private int field3114 = 0;

    @OriginalMember(owner = "client!iq", name = "ib", descriptor = "Z")
    private boolean field3135 = false;

    @OriginalMember(owner = "client!iq", name = "hb", descriptor = "I")
    private int field3134 = 0;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "I")
    private int field3121;

    @OriginalMember(owner = "client!iq", name = "kb", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!iq", name = "gb", descriptor = "Lfo;")
    private class606 field3133;

    @OriginalMember(owner = "client!iq", name = "Z", descriptor = "I")
    public static int field3126 = -1;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "[J")
    public static long[] field3119 = new long[32];

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "F")
    public static float field3108;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!iq", name = "Y", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!iq", name = "ab", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!iq", name = "bb", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!iq", name = "db", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!iq", name = "fb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!iq", name = "jb", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!iq", name = "lb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!iq", name = "mb", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!iq", name = "cb", descriptor = "Lhda;")
    private class635 field3129;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method1403(boolean arg0, int arg1) {
        ++field3132;
        if (!this.field3131) {
            this.field3110 += arg1;
            while (~this.field3110 < ~this.field3133.field8699[this.field3134]) {
                this.field3110 -= this.field3133.field8699[this.field3134];
                ++this.field3134;
                if (this.field3134 >= this.field3133.field8707.length) {
                    this.field3131 = true;
                    break;
                }
            }
            if (!this.field3131) {
                class150.method1144(this.field3134, (byte) 95, this, this.field3133);
            }
            if (!arg0) {
                this.method627((class98) null, 85);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILda;Lr;Lq;)V", line = 37)
    private final void method1404(int arg0, class397 arg1, class98 arg2, class152 arg3) {
        arg1.method471(arg3);
        ++field3123;
        class7[] var5 = arg1.method480();
        class94[] var6 = arg1.method486();
        int var7 = 33 / ((arg0 - -62) / 52);
        if ((this.field3129 == null || this.field3129.field8982) && (var5 != null || var6 != null)) {
            this.field3129 = class635.method3580(class148.field2508, true);
        }
        if (this.field3129 != null) {
            this.field3129.method3579(arg2, (long) class148.field2508, var5, var6, false);
            this.field3129.method3587(super.field3158, super.field2481, super.field2483, super.field2484, super.field2486);
        }
    }

    @OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() {
        ++field3112;
        if (this.field3129 != null) {
            this.field3129.method3584();
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(ILr;)V", line = 73)
    public final void method625(int arg0, class98 arg1) {
        ++field3124;
        if (arg0 <= 67) {
            this.field3129 = null;
        }
        class397 var3 = this.method1406(this.field3121, 0, -1, arg1);
        if (var3 != null) {
            class152 var4 = arg1.method777();
            var4.method166(super.field3155, super.field3160, super.field3154);
            this.method1404(85, var3, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "(I)V", line = 101)
    public final void method585(int arg0) {
        if (arg0 != 96) {
            field3108 = 1.6934334F;
        }
        ++field3111;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 112)
    public static void method1405(int arg0) {
        field3119 = null;
        if (arg0 > -11) {
            method1405(103);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 123)
    public class202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3121 = arg0;
        this.field3137 = arg1 + arg2;
        this.field3109 = arg12;
        class81 var14 = class554.field8108.method598(-14624, this.field3121);
        int var15 = var14.field1229;
        if (~var15 != 0) {
            this.field3133 = class480.field6871.method1417(-3585, var15);
            this.field3131 = false;
        } else {
            this.field3131 = true;
        }
        if (~this.field3137 == ~arg2) {
            class150.method1144(this.field3134, (byte) 44, this, this.field3133);
        }
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)Z", line = 150)
    public final boolean method592(int arg0) {
        ++field3118;
        return arg0 != -15258 ? false : false;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(Z)Z", line = 164)
    public final boolean method633(boolean arg0) {
        ++field3122;
        if (!arg0) {
            this.method626(-33);
        }
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I", line = 175)
    public final int method634(byte arg0) {
        if (arg0 > -102) {
            this.field3115 = -50;
        }
        ++field3128;
        return this.field3114;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILr;)Lda;", line = 186)
    private final class397 method1406(int arg0, int arg1, int arg2, class98 arg3) {
        ++field3117;
        if (arg2 != -1) {
            return null;
        } else {
            class81 var5 = class554.field8108.method598(arg2 + -14623, arg0);
            class682 var6 = class621.field8841[super.field3158];
            class682 var7 = ~super.field3163 <= -4 ? null : class621.field8841[super.field3163 - -1];
            return this.field3131 ? var5.method619(super.field3160, 0, var6, var7, (byte) 2, -1, super.field3154, class480.field6871, -1, super.field3155, true, arg3, arg1) : var5.method619(super.field3160, this.field3110, var6, var7, (byte) 2, this.field3134, super.field3154, class480.field6871, this.field3113, super.field3155, true, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)I", line = 204)
    public final int method626(int arg0) {
        if (arg0 != -32768) {
            this.method627((class98) null, -102);
        }
        ++field3127;
        return this.field3115;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lr;I)Lej;", line = 217)
    public final class690 method627(class98 arg0, int arg1) {
        ++field3125;
        class397 var3 = this.method1406(this.field3121, 2048 | (~this.field3109 != -1 ? 5 : 0), -1, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field3109 != -1) {
                var3.method474(this.field3109 * 2048);
            }
            class152 var4 = arg0.method777();
            var4.method166(super.field3155, super.field3160, super.field3154);
            this.method1404(-10, var3, arg0, var4);
            if (class372.field5162) {
                var3.method448(var4, (class299) null, class450.field6494, 0);
            } else {
                var3.method460(var4, (class299) null, 0);
            }
            if (this.field3129 != null) {
                class272 var5 = this.field3129.method3581();
                if (!class372.field5162) {
                    arg0.method737(var5);
                } else {
                    arg0.method799(var5, class450.field6494);
                }
            }
            this.field3135 = var3.method449();
            this.field3115 = var3.method478();
            if (arg1 != -7927) {
                return null;
            } else {
                this.field3114 = var3.method434();
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(ILr;)Leh;", line = 264)
    public final class203 method631(int arg0, class98 arg1) {
        ++field3136;
        if (arg0 != 1) {
            this.method1407(10);
        }
        return null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lvj;IZLr;IIB)V", line = 286)
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 > 22) {
            ++field3116;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILr;B)Z", line = 308)
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field3130;
        int var5 = -128 / ((arg3 - -75) / 40);
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 320)
    public final void method1407(int arg0) {
        if (arg0 > 84) {
            ++field3138;
            if (this.field3129 != null) {
                this.field3129.method3584();
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)Z", line = 334)
    public final boolean method630(int arg0) {
        ++field3139;
        int var2 = 98 / ((-59 - arg0) / 44);
        return this.field3135;
    }
}
