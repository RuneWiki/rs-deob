import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class236 extends class743 {

    @OriginalMember(owner = "client!lw", name = "Y", descriptor = "Z")
    public boolean field3267 = false;

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
    private int field3262 = -1;

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "I")
    private int field3263 = 0;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    private int field3259 = 0;

    @OriginalMember(owner = "client!lw", name = "hb", descriptor = "I")
    private int field3276 = 0;

    @OriginalMember(owner = "client!lw", name = "nb", descriptor = "I")
    private int field3282 = 0;

    @OriginalMember(owner = "client!lw", name = "jb", descriptor = "I")
    private int field3278 = 0;

    @OriginalMember(owner = "client!lw", name = "cb", descriptor = "Z")
    private boolean field3271 = true;

    @OriginalMember(owner = "client!lw", name = "pb", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!lw", name = "mb", descriptor = "I")
    private int field3281;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "Lec;")
    private class103 field3258;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!lw", name = "V", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!lw", name = "W", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!lw", name = "X", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!lw", name = "Z", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!lw", name = "ab", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!lw", name = "db", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!lw", name = "eb", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!lw", name = "fb", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!lw", name = "gb", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!lw", name = "ib", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!lw", name = "kb", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!lw", name = "lb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!lw", name = "ob", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!lw", name = "qb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!lw", name = "rb", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!lw", name = "sb", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!lw", name = "tb", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!lw", name = "bb", descriptor = "Lpba;")
    private class198 field3270;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)I")
    public final int method282(int arg0) {
        if (arg0 != -1) {
            this.method1507(48, -24);
        }
        ++field3273;
        return this.field3282;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field3275;
        class283 var3 = this.method1505(this.field3281, -120, (this.field3259 != 0 ? 5 : 0) | 2048, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field3259 != -1) {
                var3.method1133(this.field3259 * 2048);
            }
            class723 var4 = arg0.method2087();
            var4.method848(super.field9490, super.field9502, super.field9489);
            this.method1506(var4, (byte) -128, var3, arg0);
            class596 var5 = class589.method3502(1, false, arg1 ^ arg1);
            if (class286.field3774) {
                var3.method1164(var4, var5.field8579[0], class527.field7375, 0);
            } else {
                var3.method1168(var4, var5.field8579[0], 0);
            }
            if (this.field3270 != null) {
                class347 var6 = this.field3270.method1347();
                if (class286.field3774) {
                    arg0.method2112(var6, class527.field7375);
                } else {
                    arg0.method2122(var6);
                }
            }
            this.field3271 = var3.method1130();
            this.field3263 = var3.method1120();
            this.field3282 = var3.method1113();
            return var5;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        if (arg0 != 0) {
            this.method1505(29, -112, 99, (class545) null);
        }
        ++field3283;
        return null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public static final void method1504(byte arg0) {
        ++field3268;
        for (class200 var1 = (class200) class503.field7030.method3118((byte) 73); var1 != null; var1 = (class200) class503.field7030.method3111(115)) {
            if (var1.field2899 != -1) {
                var1.method3065(-17363);
            } else {
                var1.field2896 = 0;
                if (~var1.field2900 <= -1 && ~var1.field2895 <= -1 && ~class514.field7179 < ~var1.field2900 && var1.field2895 < class456.field6281) {
                    class576.method3444(true, var1);
                }
            }
        }
        if (arg0 != -22) {
            method1504((byte) -75);
        }
    }

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        if (arg0 != 3) {
            return true;
        } else {
            ++field3285;
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIILha;)Lka;")
    private final class283 method1505(int arg0, int arg1, int arg2, class545 arg3) {
        ++field3274;
        int var5 = -73 % ((-54 - arg1) / 60);
        class42 var6 = class267.field3625.method3986(-1, arg0);
        class339 var7 = class155.field2126[super.field9501];
        class339 var8 = ~super.field9495 > -4 ? class155.field2126[super.field9495 + 1] : null;
        return !this.field3267 ? var6.method286(this.field3278, class274.field3684, true, arg3, 89, arg2, super.field9490, super.field9489, var8, this.field3262, this.field3276, var7, super.field9502) : var6.method286(-1, class274.field3684, true, arg3, 88, arg2, super.field9490, super.field9489, var8, -1, 0, var7, super.field9502);
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        ++field3264;
        class283 var3 = this.method1505(this.field3281, 22, 0, arg1);
        int var4 = 49 / ((-15 - arg0) / 57);
        if (var3 != null) {
            class723 var5 = arg1.method2087();
            var5.method848(super.field9490, super.field9502, super.field9489);
            this.method1506(var5, (byte) 74, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        ++field3288;
        int var2 = -10 / ((-45 - arg0) / 42);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Luha;BLka;Lha;)V")
    private final void method1506(class723 arg0, byte arg1, class283 arg2, class545 arg3) {
        ++field3272;
        arg2.method1172(arg0);
        class57[] var5 = arg2.method1158();
        int var6 = -115 % ((-44 - arg1) / 46);
        class648[] var7 = arg2.method1145();
        if ((this.field3270 == null || this.field3270.field2863) && (var5 != null || var7 != null)) {
            this.field3270 = class198.method1343(class245.field3409, true);
        }
        if (this.field3270 != null) {
            this.field3270.method1346(arg3, (long) class245.field3409, var5, var7, false);
            this.field3270.method1342(super.field9501, super.field10352, super.field10365, super.field10357, super.field10353);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)V")
    public final void method1507(int arg0, int arg1) {
        ++field3280;
        if (!this.field3267) {
            this.field3276 += arg1;
            while (~this.field3276 < ~this.field3258.field1493[this.field3278]) {
                this.field3276 -= this.field3258.field1493[this.field3278];
                ++this.field3278;
                if (this.field3278 >= this.field3258.field1472.length) {
                    this.field3267 = true;
                    break;
                }
            }
            if (arg0 == 0) {
                if (!this.field3267) {
                    class694.method3941(this.field3278, this.field3258, this, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BILjava/lang/String;)Lip;")
    public static final class304 method1508(byte arg0, int arg1, String arg2) {
        ++field3260;
        class304 var3;
        try {
            var3 = (class304) Class.forName("lga").newInstance();
        } catch (Throwable var4) {
            var3 = new class174();
        }
        var3.field3959 = arg2;
        var3.field3953 = arg1;
        return arg0 <= 26 ? null : var3;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBZILha;ILig;)V")
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        if (arg1 > 76) {
            ++field3277;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3284 = arg1 + arg2;
        this.field3259 = arg12;
        this.field3281 = arg0;
        class42 var14 = class267.field3625.method3986(-1, this.field3281);
        int var15 = var14.field585;
        if (~var15 == 0) {
            this.field3267 = true;
        } else {
            this.field3258 = class274.field3684.method1881((byte) -80, var15);
            this.field3267 = false;
        }
        if (this.field3284 == arg2) {
            class694.method3941(this.field3278, this.field3258, this, true);
        }
    }

    @OriginalMember(owner = "client!lw", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3270 != null) {
            this.field3270.method1344();
        }
        ++field3261;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
    public static final void method1509(boolean arg0, int arg1) {
        ++field3286;
        class118 var2 = class126.method814(arg0, arg1, 7);
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            this.field3270 = null;
        }
        ++field3266;
        return false;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)Z")
    public final boolean method373(byte arg0) {
        if (arg0 != -57) {
            this.method1510((byte) -67);
        }
        ++field3287;
        return false;
    }

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 != -1) {
            this.method274(54, (class545) null);
        }
        ++field3279;
        return this.field3263;
    }

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "(B)V")
    public final void method1510(byte arg0) {
        if (arg0 != -125) {
            this.field3259 = 28;
        }
        if (this.field3270 != null) {
            this.field3270.method1344();
        }
        ++field3265;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)Z")
    public final boolean method283(byte arg0) {
        if (arg0 >= -33) {
            this.field3262 = 6;
        }
        ++field3269;
        return this.field3271;
    }
}
