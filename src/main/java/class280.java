import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class280 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lda;")
    public class42 field3684 = new class42();

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Lok;")
    public static class166 field3685 = new class166(7, 18);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "Lqa;")
    public static class162 field3693;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Lda;")
    private class42 field3691;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lpc;")
    public static class473 field3677;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLda;)V", line = 6)
    public final void method1659(byte arg0, class42 arg1) {
        field3679++;
        if (arg1.field630 != null) {
            arg1.method300(false);
        }
        arg1.field619 = this.field3684.field619;
        if (arg0 <= 18) {
            field3677 = null;
        }
        arg1.field630 = this.field3684;
        arg1.field630.field619 = arg1;
        arg1.field619.field630 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Lda;", line = 26)
    public final class42 method1660(int arg0) {
        field3674++;
        class42 var2 = this.field3691;
        if (arg0 != 9985) {
            return null;
        } else if (this.field3684 == var2) {
            this.field3691 = null;
            return null;
        } else {
            this.field3691 = var2.field630;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 47)
    public static void method1661(int arg0) {
        field3685 = null;
        field3677 = null;
        if (arg0 != 2) {
            field3693 = null;
        }
        field3693 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Lda;", line = 61)
    public final class42 method1662(byte arg0) {
        field3689++;
        if (arg0 < 92) {
            return null;
        }
        class42 var2 = this.field3684.field619;
        if (this.field3684 == var2) {
            return null;
        } else {
            var2.method300(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lda;Lwl;Z)V", line = 83)
    private final void method1663(class42 arg0, class280 arg1, boolean arg2) {
        field3687++;
        class42 var4 = this.field3684.field630;
        this.field3684.field630 = arg0.field630;
        arg0.field630.field619 = this.field3684;
        if (arg2 && this.field3684 != arg0) {
            arg0.field630 = arg1.field3684.field630;
            arg0.field630.field619 = arg0;
            arg1.field3684.field630 = var4;
            var4.field619 = arg1.field3684;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)Z", line = 108)
    public final boolean method1664(byte arg0) {
        if (arg0 >= -46) {
            return false;
        } else {
            field3678++;
            return this.field3684.field619 == this.field3684;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLwl;)V", line = 119)
    public final void method1665(byte arg0, class280 arg1) {
        this.method1663(this.field3684.field619, arg1, true);
        field3688++;
        if (arg0 < 37) {
            this.field3691 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(BLda;)V", line = 133)
    public final void method1666(byte arg0, class42 arg1) {
        if (arg1.field630 != null) {
            arg1.method300(false);
        }
        field3694++;
        arg1.field630 = this.field3684.field630;
        arg1.field619 = this.field3684;
        int var3 = 26 % ((arg0 - 22) / 47);
        arg1.field630.field619 = arg1;
        arg1.field619.field630 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BIZ)Ljava/lang/String;", line = 150)
    public static final String method1667(byte arg0, int arg1, boolean arg2) {
        field3682++;
        if (arg0 >= -9) {
            method1671((byte) 33, 1.3889698F, -0.82898265F, 108, 0.7631647F);
        }
        return arg2 && arg1 >= 0 ? class35.method267(0, arg1, 10, arg2) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Lda;", line = 171)
    public final class42 method1668(int arg0) {
        field3692++;
        if (arg0 != -1) {
            this.method1659((byte) -69, null);
        }
        class42 var2 = this.field3691;
        if (this.field3684 == var2) {
            this.field3691 = null;
            return null;
        } else {
            this.field3691 = var2.field619;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I", line = 195)
    public final int method1669(int arg0) {
        field3680++;
        int var2 = 0;
        class42 var3 = this.field3684.field619;
        if (arg0 != 32291) {
            return 76;
        }
        while (this.field3684 != var3) {
            var3 = var3.field619;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V", line = 217)
    public final void method1670(byte arg0) {
        while (true) {
            class42 var2 = this.field3684.field619;
            if (this.field3684 == var2) {
                field3690++;
                this.field3691 = null;
                if (arg0 != -104) {
                    this.method1665((byte) -72, null);
                    return;
                }
                return;
            }
            var2.method300(false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BFFIF)F", line = 241)
    public static final float method1671(byte arg0, float arg1, float arg2, int arg3, float arg4) {
        field3676++;
        if (arg0 < 35) {
            field3685 = null;
        }
        float[] var5 = class331.field4363[arg3];
        return var5[2] * arg2 + var5[0] * arg1 + var5[1] * arg4;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 265)
    public class280() {
        this.field3684.field619 = this.field3684;
        this.field3684.field630 = this.field3684;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)Lda;", line = 276)
    public final class42 method1672(byte arg0) {
        if (arg0 >= -85) {
            field3677 = null;
        }
        field3675++;
        class42 var2 = this.field3684.field619;
        if (this.field3684 == var2) {
            this.field3691 = null;
            return null;
        } else {
            this.field3691 = var2.field619;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)Lda;", line = 304)
    public final class42 method1673(int arg0) {
        field3681++;
        class42 var2 = this.field3684.field630;
        if (arg0 <= 53) {
            this.field3684 = null;
        }
        if (this.field3684 == var2) {
            this.field3691 = null;
            return null;
        } else {
            this.field3691 = var2.field630;
            return var2;
        }
    }
}
