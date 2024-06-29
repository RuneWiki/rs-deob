import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class32 {

    @OriginalMember(owner = "client!va", name = "Yb", descriptor = "Z")
    public static boolean field732 = false;

    @OriginalMember(owner = "client!va", name = "Vb", descriptor = "Lpj;")
    public static class237 field729 = class33.method353("blinken1:", 37);

    @OriginalMember(owner = "client!va", name = "Xb", descriptor = "Lpj;")
    public static class237 field731 = class33.method353(":duelstake:", 71);

    @OriginalMember(owner = "client!va", name = "Tb", descriptor = "I")
    public static int field727 = 100;

    @OriginalMember(owner = "client!va", name = "kc", descriptor = "J")
    public static long field744 = 0L;

    @OriginalMember(owner = "client!va", name = "Zb", descriptor = "Lpj;")
    private static class237 field733 = class33.method353("flash3:", 126);

    @OriginalMember(owner = "client!va", name = "Ob", descriptor = "Lpj;")
    public static class237 field722 = field733;

    @OriginalMember(owner = "client!va", name = "jc", descriptor = "Lpj;")
    public static class237 field743 = field733;

    @OriginalMember(owner = "client!va", name = "bc", descriptor = "Lak;")
    public static class135 field735 = new class135(200);

    @OriginalMember(owner = "client!va", name = "Pb", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!va", name = "Qb", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!va", name = "Rb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!va", name = "Sb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!va", name = "Ub", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!va", name = "ac", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!va", name = "cc", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!va", name = "dc", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!va", name = "fc", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!va", name = "gc", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!va", name = "hc", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!va", name = "ic", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!va", name = "lc", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!va", name = "mc", descriptor = "Lfa;")
    public static class239 field746;

    @OriginalMember(owner = "client!va", name = "ec", descriptor = "Lqd;")
    private class3 field738;

    @OriginalMember(owner = "client!va", name = "Wb", descriptor = "[I")
    public static int[] field730;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)V")
    public final void method356(boolean arg0) {
        ++field740;
        if (!arg0) {
            this.field742 = super.field647 * 8;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILfa;)V")
    public static final void method357(int arg0, class239 arg1) {
        class49.field1049 = arg1;
        ++field739;
        if (arg0 >= -59) {
            field732 = false;
        }
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(II)I")
    public final int method358(int arg0, int arg1) {
        ++field741;
        int var3 = this.field742 >> 3;
        int var4 = -(7 & this.field742) + 8;
        this.field742 += arg1;
        int var5 = 0;
        if (arg0 != 200) {
            return -120;
        } else {
            while (~arg1 < ~var4) {
                var5 += (super.field644[var3++] & class182.field3213[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 == ~var4) {
                var6 = (class182.field3213[var4] & super.field644[var3]) + var5;
            } else {
                var6 = (super.field644[var3] >> var4 - arg1 & class182.field3213[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(ILfa;)V")
    public static final void method359(int arg0, class239 arg1) {
        if (arg0 == 31340) {
            ++field723;
            class220.field3792 = arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
    public class34(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(Z)V")
    public final void method360(boolean arg0) {
        ++field725;
        super.field647 = (this.field742 + 7) / 8;
        if (!arg0) {
            this.field738 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "u", descriptor = "(I)I")
    public final int method361(int arg0) {
        if (arg0 != 24705) {
            this.method356(true);
        }
        ++field728;
        return super.field644[super.field647++] - this.field738.method54(-42) & 255;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(II)I")
    public static int method362(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[I)V")
    public final void method363(int arg0, int[] arg1) {
        ++field724;
        if (arg0 != 8) {
            method365((class141) null, (byte) -47);
        }
        this.field738 = new class3(arg1);
    }

    @OriginalMember(owner = "client!va", name = "j", descriptor = "(II)I")
    public final int method364(int arg0, int arg1) {
        ++field726;
        int var3 = -41 % ((-19 - arg1) / 59);
        return arg0 * 8 - this.field742;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lw;B)Z")
    public static final boolean method365(class141 arg0, byte arg1) {
        ++field745;
        if (arg0.field2492 == 205) {
            class99.field1772 = 250;
            return true;
        } else {
            int var2 = 116 % ((arg1 - -67) / 51);
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(Z)V")
    public static void method366(boolean arg0) {
        field729 = null;
        field743 = null;
        field746 = null;
        field731 = null;
        if (!arg0) {
            field727 = -126;
        }
        field722 = null;
        field733 = null;
        field735 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III[B)V")
    public final void method367(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field737;
        for (int var5 = arg1; var5 < arg2; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field644[super.field647++] + -this.field738.method54(-74));
        }
    }

    @OriginalMember(owner = "client!va", name = "k", descriptor = "(II)V")
    public final void method368(int arg0, int arg1) {
        ++field734;
        int var3 = 70 / ((-59 - arg0) / 37);
        super.field644[super.field647++] = (byte) (arg1 + this.field738.method54(87));
    }
}
