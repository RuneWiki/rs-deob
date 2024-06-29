import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class59 {

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lsf;")
    public class28 field825 = new class28();

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field828 = -1;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Laq;")
    public static class108 field835;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lsf;")
    private class28 field837;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    public static int[] field822;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 5)
    public final void method365(int arg0) {
        while (true) {
            class28 var2 = this.field825.field276;
            if (this.field825 == var2) {
                field833++;
                this.field837 = null;
                if (arg0 != -1) {
                    field834 = -85;
                    return;
                }
                return;
            }
            var2.method175(arg0 ^ 0xFFFF8873);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lrh;Lsf;I)V", line = 28)
    private final void method366(class59 arg0, class28 arg1, int arg2) {
        field821++;
        class28 var4 = this.field825.field275;
        this.field825.field275 = arg1.field275;
        if (arg2 != -1) {
            method370(-106, true, null);
        }
        arg1.field275.field276 = this.field825;
        if (this.field825 != arg1) {
            arg1.field275 = arg0.field825.field275;
            arg1.field275.field276 = arg1;
            var4.field276 = arg0.field825;
            arg0.field825.field275 = var4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILkg;I)V", line = 52)
    public static final void method367(int arg0, int arg1, class208 arg2, int arg3) {
        field839++;
        if (arg0 != 0) {
            method370(-108, true, null);
        }
        class390.field5608[arg1][arg3] = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Lsf;", line = 63)
    public final class28 method368(int arg0) {
        field838++;
        class28 var2 = this.field825.field276;
        if (arg0 < 40) {
            field826 = 66;
        }
        if (this.field825 == var2) {
            return null;
        } else {
            var2.method175(30604);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I", line = 85)
    public final int method369(int arg0) {
        field829++;
        int var2 = 0;
        class28 var3 = this.field825.field276;
        if (arg0 != -19133) {
            field835 = null;
        }
        while (this.field825 != var3) {
            var3 = var3.field276;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLfca;)V", line = 108)
    public static final void method370(int arg0, boolean arg1, class188 arg2) {
        field823++;
        int var3 = arg2.field2379 == 0 ? arg2.field2438 : arg2.field2379;
        int var4 = arg2.field2406 == 0 ? arg2.field2371 : arg2.field2406;
        class640.method3481(arg2.field2387, var4, class328.field4799[arg2.field2387 >> 16], arg1, (byte) -108, var3);
        if (arg2.field2352 != null) {
            class640.method3481(arg2.field2387, var4, arg2.field2352, arg1, (byte) -116, var3);
        }
        if (arg0 < 53) {
            method367(-116, -17, null, -2);
        }
        class524 var5 = (class524) class54.field742.method2506(13, (long) arg2.field2387);
        if (var5 != null) {
            class32.method195(-2, var5.field7256, var4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Lsf;", line = 140)
    public final class28 method371(int arg0) {
        field827++;
        class28 var2 = this.field837;
        if (this.field825 == var2) {
            this.field837 = null;
            return null;
        }
        if (arg0 != -1) {
            this.method379(-83);
        }
        this.field837 = var2.field275;
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)Lsf;", line = 164)
    public final class28 method372(int arg0) {
        field836++;
        if (arg0 != -20740) {
            this.method377((byte) -56);
        }
        class28 var2 = this.field837;
        if (this.field825 == var2) {
            this.field837 = null;
            return null;
        } else {
            this.field837 = var2.field276;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 185)
    public static void method373(boolean arg0) {
        if (arg0) {
            field834 = -104;
        }
        field835 = null;
        field822 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lsf;", line = 199)
    public final class28 method374(byte arg0) {
        field840++;
        class28 var2 = this.field825.field276;
        if (this.field825 == var2) {
            this.field837 = null;
            return null;
        }
        if (arg0 <= 47) {
            field828 = 16;
        }
        this.field837 = var2.field276;
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 316)
    public class59() {
        this.field825.field275 = this.field825;
        this.field825.field276 = this.field825;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLrh;)V", line = 231)
    public final void method375(byte arg0, class59 arg1) {
        if (arg0 != -16) {
            this.method368(94);
        }
        this.method366(arg1, this.field825.field276, -1);
        field830++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLsf;)V", line = 242)
    public final void method376(boolean arg0, class28 arg1) {
        field820++;
        if (arg1.field275 != null) {
            arg1.method175(30604);
        }
        arg1.field276 = this.field825.field276;
        arg1.field275 = this.field825;
        if (arg0) {
            arg1.field275.field276 = arg1;
            arg1.field276.field275 = arg1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lsf;", line = 261)
    public final class28 method377(byte arg0) {
        if (arg0 <= 6) {
            this.method369(-59);
        }
        field824++;
        class28 var2 = this.field825.field275;
        if (this.field825 == var2) {
            this.field837 = null;
            return null;
        } else {
            this.field837 = var2.field275;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lsf;I)V", line = 282)
    public final void method378(class28 arg0, int arg1) {
        if (arg0.field275 != null) {
            arg0.method175(arg1 - 712);
        }
        field832++;
        arg0.field276 = this.field825;
        if (arg1 != 31316) {
            this.method379(83);
        }
        arg0.field275 = this.field825.field275;
        arg0.field275.field276 = arg0;
        arg0.field276.field275 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)Z", line = 302)
    public final boolean method379(int arg0) {
        if (arg0 != -1) {
            field822 = null;
        }
        field831++;
        return this.field825.field276 == this.field825;
    }
}
