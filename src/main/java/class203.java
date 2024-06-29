import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class203 {

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    private int field2745 = -1;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    private int field2744 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    private int field2741 = -1;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    private int field2742 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lar;")
    private class47 field2740 = new class47();

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Z")
    private boolean field2747 = true;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    private boolean field2753 = true;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[Lir;")
    private class216[] field2751 = new class216[2];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Z")
    private boolean field2748 = false;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    private int field2749 = -1;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    private int field2755 = 0;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Z")
    private boolean field2750 = true;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lnf;")
    private class256 field2743;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lej;")
    private class74 field2746;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ltm;")
    private class187 field2754;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lir;")
    private class216 field2752;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)Z", line = 4)
    public final boolean method1206(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2746 == null || this.field2740.method338(16091)) {
            return false;
        }
        boolean var5 = false;
        if (this.field2745 != arg2 || this.field2741 != arg3) {
            this.field2745 = arg2;
            this.field2741 = arg3;
            for (class45 var6 = this.field2740.method332(-2130841184); var6 != this.field2740.field663; var6 = var6.field636) {
                ((class168) var6).method1039(this.field2745, this.field2741);
            }
            this.field2750 = true;
            this.field2753 = true;
        }
        if (this.field2753) {
            if (this.field2754 != null) {
                this.field2754.method1130();
                this.field2754 = null;
            }
            if (this.field2752 != null) {
                this.field2752.method2356();
                this.field2752 = null;
            }
            if (this.field2748) {
                this.field2752 = new class216(this.field2743, 34037, 6402, this.field2745, this.field2741);
            } else {
                this.field2754 = new class187(this.field2743, 6402, this.field2745, this.field2741);
            }
            this.field2747 = true;
            this.field2753 = false;
            var5 = true;
        }
        if (this.field2750) {
            if (this.field2751[0] != null) {
                this.field2751[0].method2356();
                this.field2751[0] = null;
            }
            if (this.field2751[1] != null) {
                this.field2751[1].method2356();
                this.field2751[1] = null;
            }
            this.field2751[0] = new class216(this.field2743, 34037, this.field2749, this.field2745, this.field2741);
            this.field2751[1] = this.field2755 > 1 ? new class216(this.field2743, 34037, this.field2749, this.field2745, this.field2741) : null;
            this.field2747 = true;
            this.field2750 = false;
            var5 = true;
        }
        int var7 = this.field2743.method1655().method541();
        this.field2743.method1725(this.field2746);
        if (this.field2747) {
            this.field2746.method546(0);
            this.field2746.method546(1);
            this.field2746.method546(8);
            if (this.field2751[0] != null) {
                this.field2746.method551(0, this.field2751[0]);
            }
            if (this.field2751[1] != null) {
                this.field2746.method551(1, this.field2751[1]);
            }
            if (this.field2752 != null) {
                this.field2746.method551(8, this.field2752);
            }
            if (this.field2754 != null) {
                this.field2746.method549(8, this.field2754);
            }
            this.field2746.method544(0);
            this.field2747 = false;
            var5 = true;
        }
        if (!var5 || this.field2746.method543()) {
            this.field2744 = arg0;
            this.field2742 = arg1;
            this.field2743.method1721(-this.field2744, this.field2742 + this.field2741 - var7);
            return true;
        }
        this.field2743.method1765(this.field2746);
        this.field2750 = true;
        this.field2753 = true;
        this.field2747 = true;
        return false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lsk;)V", line = 111)
    public final void method1207(class168 arg0) {
        this.method1209(arg0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Z", line = 114)
    private final boolean method1208() {
        return this.field2743.method1655() == this.field2746;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lsk;Z)V", line = 117)
    private final void method1209(class168 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1037();
        }
        arg0.field2267 = false;
        arg0.method322(11);
        this.method1210();
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V", line = 126)
    private final void method1210() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class168 var4 = (class168) this.field2740.method332(-2130841184); var4 != null; var4 = (class168) this.field2740.method343((byte) -78)) {
            int var5 = var4.method1036();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1040(30639);
            var3 |= var4.method1033((byte) 63);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field2749 != var6) {
            this.field2749 = var6;
            this.field2750 = true;
        }
        int var7 = this.field2755 > 2 ? 2 : this.field2755;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field2747 = this.field2750 = true;
        }
        if (this.field2748 != var3) {
            this.field2748 = var3;
            this.field2753 = true;
        }
        this.field2755 = var2;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lnf;)V", line = 361)
    public class203(class256 arg0) {
        this.field2743 = arg0;
        if (this.field2743.field3718 && this.field2743.field3670) {
            this.field2746 = new class74(this.field2743);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()V", line = 193)
    public final void method1211() {
        if (!this.method1208()) {
            return;
        }
        opengl var1 = this.field2743.field3634;
        this.field2743.method1672();
        this.field2743.method1701(0);
        this.field2743.method1652();
        int var2 = 0;
        int var3 = 1;
        class168 var5;
        for (class168 var4 = (class168) this.field2740.method332(-2130841184); var4 != null; var4 = var5) {
            var5 = (class168) this.field2740.method343((byte) -91);
            int var6 = var4.method1040(30639);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1042(var7, this.field2751[var2], this.field2752);
                if (var5 == null && var6 - 1 == var7) {
                    this.field2743.method1765(this.field2746);
                    this.field2743.method1721(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field2741);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field2744, this.field2742);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field2744, this.field2742 + this.field2741);
                    var1.glTexCoord2f((float) this.field2745, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field2745 + this.field2744, this.field2742 + this.field2741);
                    var1.glTexCoord2f((float) this.field2745, (float) this.field2741);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field2745 + this.field2744, this.field2742);
                    var1.glEnd();
                } else {
                    this.field2746.method544(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field2741);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field2741);
                    var1.glTexCoord2f((float) this.field2745, (float) this.field2741);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field2745, this.field2741);
                    var1.glTexCoord2f((float) this.field2745, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field2745, 0);
                    var1.glEnd();
                }
                var4.method1038(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()V", line = 270)
    public final void method1212() {
        if (this.field2746 != null) {
            this.field2746 = null;
            this.field2751 = null;
            this.field2754 = null;
            this.field2752 = null;
            this.field2750 = true;
            this.field2753 = true;
            this.field2747 = true;
            if (!this.field2740.method338(16091)) {
                for (class45 var1 = this.field2740.method332(-2130841184); var1 != this.field2740.field663; var1 = var1.field636) {
                    ((class168) var1).method1037();
                }
            }
        }
        this.field2745 = this.field2741 = -1;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Lsk;)Z", line = 304)
    public final boolean method1213(class168 arg0) {
        if (this.field2746 != null) {
            if (arg0.method1041() || arg0.method1035()) {
                if (this.field2745 != -1 && this.field2741 != -1) {
                    arg0.method1039(this.field2745, this.field2741);
                }
                arg0.field2267 = true;
                this.field2740.method330(arg0, -2130841184);
                this.method1210();
                return true;
            }
            arg0.method1037();
        }
        return false;
    }
}
