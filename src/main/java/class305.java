import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class305 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private int field4601 = 0;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    private int field4604 = -1;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    private int field4603 = -1;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field4605 = 0;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lsf;")
    private class398 field4602 = new class398();

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    private int field4610 = 0;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
    private boolean field4611 = true;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
    private boolean field4612 = false;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    private int field4606 = -1;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Z")
    private boolean field4608 = true;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
    private boolean field4613 = true;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[Lpq;")
    private class46[] field4614 = new class46[2];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lcg;")
    private class393 field4599;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lbh;")
    private class366 field4600;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lue;")
    private class329 field4609;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lpq;")
    private class46 field4607;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lbm;)V")
    public final void method1873(class194 arg0) {
        this.method1876(arg0, true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lbm;)Z")
    public final boolean method1874(class194 arg0) {
        if (this.field4600 != null) {
            if (arg0.method1084() || arg0.method1088()) {
                if (this.field4604 != -1 && this.field4603 != -1) {
                    arg0.method1087(this.field4604, this.field4603);
                }
                arg0.field2933 = true;
                this.field4602.method2504(42, arg0);
                this.method1877();
                return true;
            }
            arg0.method1083();
        }
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    public final void method1875() {
        if (!this.method1878()) {
            return;
        }
        opengl var1 = this.field4599.field5783;
        this.field4599.method2447();
        this.field4599.method2424(0);
        this.field4599.method433();
        int var2 = 0;
        int var3 = 1;
        class194 var5;
        for (class194 var4 = (class194) this.field4602.method2514((byte) 61); var4 != null; var4 = var5) {
            var5 = (class194) this.field4602.method2511(-121);
            int var6 = var4.method1163((byte) 104);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1086(var7, this.field4614[var2], this.field4607);
                if (var5 == null && var6 - 1 == var7) {
                    this.field4599.method2475(this.field4600);
                    this.field4599.method2459(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field4603);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field4601, this.field4605);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field4601, this.field4605 + this.field4603);
                    var1.glTexCoord2f((float) this.field4604, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4604 + this.field4601, this.field4605 + this.field4603);
                    var1.glTexCoord2f((float) this.field4604, (float) this.field4603);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4604 + this.field4601, this.field4605);
                    var1.glEnd();
                } else {
                    this.field4600.method2203(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field4603);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field4603);
                    var1.glTexCoord2f((float) this.field4604, (float) this.field4603);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4604, this.field4603);
                    var1.glTexCoord2f((float) this.field4604, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4604, 0);
                    var1.glEnd();
                }
                var4.method1089(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lbm;Z)V")
    private final void method1876(class194 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1083();
        }
        arg0.field2933 = false;
        arg0.method625((byte) -50);
        this.method1877();
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
    private final void method1877() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class194 var4 = (class194) this.field4602.method2514((byte) 61); var4 != null; var4 = (class194) this.field4602.method2511(96)) {
            int var5 = var4.method1085();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1163((byte) -104);
            var3 |= var4.method1161((byte) 45);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4606 != var6) {
            this.field4606 = var6;
            this.field4611 = true;
        }
        int var7 = this.field4610 > 2 ? 2 : this.field4610;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field4613 = this.field4611 = true;
        }
        if (this.field4612 != var3) {
            this.field4612 = var3;
            this.field4608 = true;
        }
        this.field4610 = var2;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()Z")
    private final boolean method1878() {
        return this.field4599.method2468() == this.field4600;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
    public final void method1879() {
        if (this.field4600 != null) {
            this.field4600 = null;
            this.field4614 = null;
            this.field4609 = null;
            this.field4607 = null;
            this.field4611 = true;
            this.field4608 = true;
            this.field4613 = true;
            if (!this.field4602.method2506(false)) {
                for (class97 var1 = this.field4602.method2514((byte) 61); var1 != this.field4602.field5946; var1 = var1.field1331) {
                    ((class194) var1).method1083();
                }
            }
        }
        this.field4604 = this.field4603 = -1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Z")
    public final boolean method1880(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4600 == null || this.field4602.method2506(false)) {
            return false;
        }
        boolean var5 = false;
        if (this.field4604 != arg2 || this.field4603 != arg3) {
            this.field4604 = arg2;
            this.field4603 = arg3;
            for (class97 var6 = this.field4602.method2514((byte) 61); var6 != this.field4602.field5946; var6 = var6.field1331) {
                ((class194) var6).method1087(this.field4604, this.field4603);
            }
            this.field4611 = true;
            this.field4608 = true;
        }
        if (this.field4608) {
            if (this.field4609 != null) {
                this.field4609.method2025();
                this.field4609 = null;
            }
            if (this.field4607 != null) {
                this.field4607.method2002();
                this.field4607 = null;
            }
            if (this.field4612) {
                this.field4607 = new class46(this.field4599, 34037, 6402, this.field4604, this.field4603);
            } else {
                this.field4609 = new class329(this.field4599, 6402, this.field4604, this.field4603);
            }
            this.field4613 = true;
            this.field4608 = false;
            var5 = true;
        }
        if (this.field4611) {
            if (this.field4614[0] != null) {
                this.field4614[0].method2002();
                this.field4614[0] = null;
            }
            if (this.field4614[1] != null) {
                this.field4614[1].method2002();
                this.field4614[1] = null;
            }
            this.field4614[0] = new class46(this.field4599, 34037, this.field4606, this.field4604, this.field4603);
            this.field4614[1] = this.field4610 > 1 ? new class46(this.field4599, 34037, this.field4606, this.field4604, this.field4603) : null;
            this.field4613 = true;
            this.field4611 = false;
            var5 = true;
        }
        int var7 = this.field4599.method2468().method1401();
        this.field4599.method2491(this.field4600);
        if (this.field4613) {
            this.field4600.method2200(0);
            this.field4600.method2200(1);
            this.field4600.method2200(8);
            if (this.field4614[0] != null) {
                this.field4600.method2198(0, this.field4614[0]);
            }
            if (this.field4614[1] != null) {
                this.field4600.method2198(1, this.field4614[1]);
            }
            if (this.field4607 != null) {
                this.field4600.method2198(8, this.field4607);
            }
            if (this.field4609 != null) {
                this.field4600.method2201(8, this.field4609);
            }
            this.field4600.method2203(0);
            this.field4613 = false;
            var5 = true;
        }
        if (!var5 || this.field4600.method2196()) {
            this.field4601 = arg0;
            this.field4605 = arg1;
            this.field4599.method2459(-this.field4601, this.field4605 + this.field4603 - var7);
            return true;
        }
        this.field4599.method2475(this.field4600);
        this.field4611 = true;
        this.field4608 = true;
        this.field4613 = true;
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lcg;)V")
    public class305(class393 arg0) {
        this.field4599 = arg0;
        if (this.field4599.field5895 && this.field4599.field5855) {
            this.field4600 = new class366(this.field4599);
        }
    }
}
