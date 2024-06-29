import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class266 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    private int field3821 = -1;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    private int field3823 = -1;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    private int field3825 = 0;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    private int field3826 = 0;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lvf;")
    private class166 field3824 = new class166();

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Z")
    private boolean field3829 = true;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "Z")
    private boolean field3835 = false;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "[Ltr;")
    private class151[] field3836 = new class151[2];

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    private int field3834 = 0;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    private int field3830 = -1;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
    private boolean field3832 = true;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "Z")
    private boolean field3833 = true;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lic;")
    private class246 field3827;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Ljs;")
    private class161 field3822;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "Ltr;")
    private class151 field3828;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "Lsn;")
    private class488 field3831;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
    private final void method1609() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class295 var4 = (class295) this.field3824.method802((byte) 120); var4 != null; var4 = (class295) this.field3824.method806((byte) 104)) {
            int var5 = var4.method1852();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1849(127);
            var3 |= var4.method1850(false);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3830 != var6) {
            this.field3830 = var6;
            this.field3832 = true;
        }
        int var7 = this.field3834 > 2 ? 2 : this.field3834;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field3833 = this.field3832 = true;
        }
        if (this.field3835 != var3) {
            this.field3835 = var3;
            this.field3829 = true;
        }
        this.field3834 = var2;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "()V")
    public final void method1610() {
        if (!this.method1615()) {
            return;
        }
        opengl var1 = this.field3827.field3342;
        this.field3827.method1389();
        this.field3827.method1371(0);
        this.field3827.method1352();
        int var2 = 0;
        int var3 = 1;
        class295 var5;
        for (class295 var4 = (class295) this.field3824.method802((byte) 111); var4 != null; var4 = var5) {
            var5 = (class295) this.field3824.method806((byte) 104);
            int var6 = var4.method1849(127);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1855(var7, this.field3836[var2], this.field3828);
                if (var5 == null && var6 - 1 == var7) {
                    this.field3827.method1454(this.field3822);
                    this.field3827.method1430(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field3821);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field3825, this.field3826);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field3825, this.field3826 + this.field3821);
                    var1.glTexCoord2f((float) this.field3823, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3825 + this.field3823, this.field3826 + this.field3821);
                    var1.glTexCoord2f((float) this.field3823, (float) this.field3821);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3825 + this.field3823, this.field3826);
                    var1.glEnd();
                } else {
                    this.field3822.method780(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field3821);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field3821);
                    var1.glTexCoord2f((float) this.field3823, (float) this.field3821);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3823, this.field3821);
                    var1.glTexCoord2f((float) this.field3823, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3823, 0);
                    var1.glEnd();
                }
                var4.method1851(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)Z")
    public final boolean method1611(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3822 == null || this.field3824.method812((byte) 41)) {
            return false;
        }
        boolean var5 = false;
        if (this.field3823 != arg2 || this.field3821 != arg3) {
            this.field3823 = arg2;
            this.field3821 = arg3;
            for (class147 var6 = this.field3824.method802((byte) 107); var6 != this.field3824.field1985; var6 = var6.field1779) {
                ((class295) var6).method1856(this.field3823, this.field3821);
            }
            this.field3832 = true;
            this.field3829 = true;
        }
        if (this.field3829) {
            if (this.field3831 != null) {
                this.field3831.method2881();
                this.field3831 = null;
            }
            if (this.field3828 != null) {
                this.field3828.method35();
                this.field3828 = null;
            }
            if (this.field3835) {
                this.field3828 = new class151(this.field3827, 34037, 6402, this.field3823, this.field3821);
            } else {
                this.field3831 = new class488(this.field3827, 6402, this.field3823, this.field3821);
            }
            this.field3833 = true;
            this.field3829 = false;
            var5 = true;
        }
        if (this.field3832) {
            if (this.field3836[0] != null) {
                this.field3836[0].method35();
                this.field3836[0] = null;
            }
            if (this.field3836[1] != null) {
                this.field3836[1].method35();
                this.field3836[1] = null;
            }
            this.field3836[0] = new class151(this.field3827, 34037, this.field3830, this.field3823, this.field3821);
            this.field3836[1] = this.field3834 > 1 ? new class151(this.field3827, 34037, this.field3830, this.field3823, this.field3821) : null;
            this.field3833 = true;
            this.field3832 = false;
            var5 = true;
        }
        int var7 = this.field3827.method1356().method49();
        this.field3827.method1348(this.field3822);
        if (this.field3833) {
            this.field3822.method774(0);
            this.field3822.method774(1);
            this.field3822.method774(8);
            if (this.field3836[0] != null) {
                this.field3822.method779(0, this.field3836[0]);
            }
            if (this.field3836[1] != null) {
                this.field3822.method779(1, this.field3836[1]);
            }
            if (this.field3828 != null) {
                this.field3822.method779(8, this.field3828);
            }
            if (this.field3831 != null) {
                this.field3822.method775(8, this.field3831);
            }
            this.field3822.method780(0);
            this.field3833 = false;
            var5 = true;
        }
        if (!var5 || this.field3822.method778()) {
            this.field3825 = arg0;
            this.field3826 = arg1;
            this.field3827.method1430(-this.field3825, this.field3826 + this.field3821 - var7);
            return true;
        }
        this.field3827.method1454(this.field3822);
        this.field3832 = true;
        this.field3829 = true;
        this.field3833 = true;
        return false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljg;)V")
    public final void method1612(class295 arg0) {
        this.method1613(arg0, true);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljg;Z)V")
    private final void method1613(class295 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1847();
        }
        arg0.field4368 = false;
        arg0.method702((byte) -114);
        this.method1609();
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(Ljg;)Z")
    public final boolean method1614(class295 arg0) {
        if (this.field3822 != null) {
            if (arg0.method1848() || arg0.method1853()) {
                if (this.field3823 != -1 && this.field3821 != -1) {
                    arg0.method1856(this.field3823, this.field3821);
                }
                arg0.field4368 = true;
                this.field3824.method803(arg0, 50);
                this.method1609();
                return true;
            }
            arg0.method1847();
        }
        return false;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "()Z")
    private final boolean method1615() {
        return this.field3827.method1356() == this.field3822;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "()V")
    public final void method1616() {
        if (this.field3822 != null) {
            this.field3822 = null;
            this.field3836 = null;
            this.field3831 = null;
            this.field3828 = null;
            this.field3832 = true;
            this.field3829 = true;
            this.field3833 = true;
            if (!this.field3824.method812((byte) 120)) {
                for (class147 var1 = this.field3824.method802((byte) 125); var1 != this.field3824.field1985; var1 = var1.field1779) {
                    ((class295) var1).method1847();
                }
            }
        }
        this.field3823 = this.field3821 = -1;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lic;)V")
    public class266(class246 arg0) {
        this.field3827 = arg0;
        if (this.field3827.field3428 && this.field3827.field3386) {
            this.field3822 = new class161(this.field3827);
        }
    }
}
