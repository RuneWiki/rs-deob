import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class194 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    private int field3149 = 0;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    private int field3147 = -1;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    private int field3153 = -1;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    private int field3148 = 0;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lbd;")
    private class37 field3150 = new class37();

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    private int field3155 = 0;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field3154 = -1;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "[Lai;")
    private class355[] field3158 = new class355[2];

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Z")
    private boolean field3156 = true;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "Z")
    private boolean field3159 = false;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "Z")
    private boolean field3161 = true;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "Z")
    private boolean field3162 = true;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Lsq;")
    private class96 field3152;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lql;")
    private class437 field3151;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "Lai;")
    private class355 field3157;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "Ljn;")
    private class425 field3160;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)Z", line = 6)
    public final boolean method1358(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3151 == null || this.field3150.method246((byte) 75)) {
            return false;
        }
        boolean var5 = false;
        if (this.field3153 != arg2 || this.field3147 != arg3) {
            this.field3153 = arg2;
            this.field3147 = arg3;
            for (class161 var6 = this.field3150.method253((byte) -6); var6 != this.field3150.field459; var6 = var6.field2537) {
                ((class4) var6).method77(this.field3153, this.field3147);
            }
            this.field3162 = true;
            this.field3156 = true;
        }
        if (this.field3156) {
            if (this.field3160 != null) {
                this.field3160.method2637();
                this.field3160 = null;
            }
            if (this.field3157 != null) {
                this.field3157.method1982();
                this.field3157 = null;
            }
            if (this.field3159) {
                this.field3157 = new class355(this.field3152, 34037, 6402, this.field3153, this.field3147);
            } else {
                this.field3160 = new class425(this.field3152, 6402, this.field3153, this.field3147);
            }
            this.field3161 = true;
            this.field3156 = false;
            var5 = true;
        }
        if (this.field3162) {
            if (this.field3158[0] != null) {
                this.field3158[0].method1982();
                this.field3158[0] = null;
            }
            if (this.field3158[1] != null) {
                this.field3158[1].method1982();
                this.field3158[1] = null;
            }
            this.field3158[0] = new class355(this.field3152, 34037, this.field3154, this.field3153, this.field3147);
            this.field3158[1] = this.field3155 > 1 ? new class355(this.field3152, 34037, this.field3154, this.field3153, this.field3147) : null;
            this.field3161 = true;
            this.field3162 = false;
            var5 = true;
        }
        int var7 = this.field3152.method611().method422();
        this.field3152.method679(this.field3151);
        if (this.field3161) {
            this.field3151.method2691(0);
            this.field3151.method2691(1);
            this.field3151.method2691(8);
            if (this.field3158[0] != null) {
                this.field3151.method2696(0, this.field3158[0]);
            }
            if (this.field3158[1] != null) {
                this.field3151.method2696(1, this.field3158[1]);
            }
            if (this.field3157 != null) {
                this.field3151.method2696(8, this.field3157);
            }
            if (this.field3160 != null) {
                this.field3151.method2692(8, this.field3160);
            }
            this.field3151.method2693(0);
            this.field3161 = false;
            var5 = true;
        }
        if (!var5 || this.field3151.method2695()) {
            this.field3149 = arg0;
            this.field3148 = arg1;
            this.field3152.method614(-this.field3149, this.field3148 + this.field3147 - var7);
            return true;
        }
        this.field3152.method698(this.field3151);
        this.field3162 = true;
        this.field3156 = true;
        this.field3161 = true;
        return false;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()V", line = 116)
    private final void method1359() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class4 var4 = (class4) this.field3150.method253((byte) -6); var4 != null; var4 = (class4) this.field3150.method247((byte) -123)) {
            int var5 = var4.method75();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method69(1);
            var3 |= var4.method76(true);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3154 != var6) {
            this.field3154 = var6;
            this.field3162 = true;
        }
        int var7 = this.field3155 > 2 ? 2 : this.field3155;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field3161 = this.field3162 = true;
        }
        if (this.field3159 != var3) {
            this.field3159 = var3;
            this.field3156 = true;
        }
        this.field3155 = var2;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lie;Z)V", line = 168)
    private final void method1360(class4 arg0, boolean arg1) {
        if (arg1) {
            arg0.method73();
        }
        arg0.field83 = false;
        arg0.method1120(55);
        this.method1359();
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "()V", line = 176)
    public final void method1361() {
        if (this.field3151 != null) {
            this.field3151 = null;
            this.field3158 = null;
            this.field3160 = null;
            this.field3157 = null;
            this.field3162 = true;
            this.field3156 = true;
            this.field3161 = true;
            if (!this.field3150.method246((byte) 75)) {
                for (class161 var1 = this.field3150.method253((byte) -6); var1 != this.field3150.field459; var1 = var1.field2537) {
                    ((class4) var1).method73();
                }
            }
        }
        this.field3153 = this.field3147 = -1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lie;)Z", line = 206)
    public final boolean method1362(class4 arg0) {
        if (this.field3151 != null) {
            if (arg0.method70() || arg0.method71()) {
                if (this.field3153 != -1 && this.field3147 != -1) {
                    arg0.method77(this.field3153, this.field3147);
                }
                arg0.field83 = true;
                this.field3150.method245(500, arg0);
                this.method1359();
                return true;
            }
            arg0.method73();
        }
        return false;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lie;)V", line = 233)
    public final void method1363(class4 arg0) {
        this.method1360(arg0, true);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lsq;)V", line = 361)
    public class194(class96 arg0) {
        this.field3152 = arg0;
        if (this.field3152.field1196 && this.field3152.field1231) {
            this.field3151 = new class437(this.field3152);
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "()Z", line = 242)
    private final boolean method1364() {
        return this.field3152.method611() == this.field3151;
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "()V", line = 249)
    public final void method1365() {
        if (!this.method1364()) {
            return;
        }
        opengl var1 = this.field3152.field1156;
        this.field3152.method570();
        this.field3152.method699(0);
        this.field3152.method609();
        int var2 = 0;
        int var3 = 1;
        class4 var5;
        for (class4 var4 = (class4) this.field3150.method253((byte) -6); var4 != null; var4 = var5) {
            var5 = (class4) this.field3150.method247((byte) 108);
            int var6 = var4.method69(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method74(var7, this.field3158[var2], this.field3157);
                if (var5 == null && var6 - 1 == var7) {
                    this.field3152.method698(this.field3151);
                    this.field3152.method614(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field3147);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field3149, this.field3148);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field3149, this.field3148 + this.field3147);
                    var1.glTexCoord2f((float) this.field3153, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3153 + this.field3149, this.field3148 + this.field3147);
                    var1.glTexCoord2f((float) this.field3153, (float) this.field3147);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3153 + this.field3149, this.field3148);
                    var1.glEnd();
                } else {
                    this.field3151.method2693(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field3147);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field3147);
                    var1.glTexCoord2f((float) this.field3153, (float) this.field3147);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3153, this.field3147);
                    var1.glTexCoord2f((float) this.field3153, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3153, 0);
                    var1.glEnd();
                }
                var4.method72(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }
}
