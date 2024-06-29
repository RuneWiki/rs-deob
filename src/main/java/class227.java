import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class227 {

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field3184 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    private int field3179 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private int field3182 = -1;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    private int field3181 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lwq;")
    private class92 field3178 = new class92();

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    private int field3185 = -1;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Z")
    private boolean field3187 = true;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
    private boolean field3186 = false;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
    private boolean field3188 = true;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private int field3191 = 0;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Z")
    private boolean field3193 = true;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[Lrj;")
    private class354[] field3190 = new class354[2];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lao;")
    private class157 field3180;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lmg;")
    private class80 field3183;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lrj;")
    private class354 field3189;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lto;")
    private class6 field3192;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()Z", line = 6)
    private final boolean method1517() {
        return this.field3180.method970() == this.field3183;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V", line = 10)
    public final void method1518() {
        if (this.field3183 != null) {
            this.field3183 = null;
            this.field3190 = null;
            this.field3192 = null;
            this.field3189 = null;
            this.field3187 = true;
            this.field3188 = true;
            this.field3193 = true;
            if (!this.field3178.method504(false)) {
                for (class406 var1 = this.field3178.method506((byte) -128); var1 != this.field3178.field1104; var1 = var1.field5862) {
                    ((class437) var1).method2733();
                }
            }
        }
        this.field3182 = this.field3181 = -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lpg;)Z", line = 40)
    public final boolean method1519(class437 arg0) {
        if (this.field3183 != null) {
            if (arg0.method2741() || arg0.method2740()) {
                if (this.field3182 != -1 && this.field3181 != -1) {
                    arg0.method2738(this.field3182, this.field3181);
                }
                arg0.field6279 = true;
                this.field3178.method509((byte) 115, arg0);
                this.method1520();
                return true;
            }
            arg0.method2733();
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V", line = 66)
    private final void method1520() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class437 var4 = (class437) this.field3178.method506((byte) -128); var4 != null; var4 = (class437) this.field3178.method514(true)) {
            int var5 = var4.method2736();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method2732(false);
            var3 |= var4.method2739(-28247);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3185 != var6) {
            this.field3185 = var6;
            this.field3187 = true;
        }
        int var7 = this.field3191 > 2 ? 2 : this.field3191;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field3193 = this.field3187 = true;
        }
        if (this.field3186 != var3) {
            this.field3186 = var3;
            this.field3188 = true;
        }
        this.field3191 = var2;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V", line = 118)
    public final void method1521() {
        if (!this.method1517()) {
            return;
        }
        opengl var1 = this.field3180.field1927;
        this.field3180.method1004();
        this.field3180.method973(0);
        this.field3180.method624();
        int var2 = 0;
        int var3 = 1;
        class437 var5;
        for (class437 var4 = (class437) this.field3178.method506((byte) -128); var4 != null; var4 = var5) {
            var5 = (class437) this.field3178.method514(true);
            int var6 = var4.method2732(false);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method2734(var7, this.field3190[var2], this.field3189);
                if (var5 == null && var6 - 1 == var7) {
                    this.field3180.method947(this.field3183);
                    this.field3180.method954(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field3181);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field3184, this.field3179);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field3184, this.field3181 + this.field3179);
                    var1.glTexCoord2f((float) this.field3182, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3184 + this.field3182, this.field3181 + this.field3179);
                    var1.glTexCoord2f((float) this.field3182, (float) this.field3181);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3184 + this.field3182, this.field3179);
                    var1.glEnd();
                } else {
                    this.field3183.method454(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field3181);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field3181);
                    var1.glTexCoord2f((float) this.field3182, (float) this.field3181);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3182, this.field3181);
                    var1.glTexCoord2f((float) this.field3182, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3182, 0);
                    var1.glEnd();
                }
                var4.method2737(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lpg;)V", line = 196)
    public final void method1522(class437 arg0) {
        this.method1523(arg0, true);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lao;)V", line = 361)
    public class227(class157 arg0) {
        this.field3180 = arg0;
        if (this.field3180.field2016 && this.field3180.field2037) {
            this.field3183 = new class80(this.field3180);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lpg;Z)V", line = 220)
    private final void method1523(class437 arg0, boolean arg1) {
        if (arg1) {
            arg0.method2733();
        }
        arg0.field6279 = false;
        arg0.method2594((byte) -22);
        this.method1520();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)Z", line = 245)
    public final boolean method1524(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3183 == null || this.field3178.method504(false)) {
            return false;
        }
        boolean var5 = false;
        if (this.field3182 != arg2 || this.field3181 != arg3) {
            this.field3182 = arg2;
            this.field3181 = arg3;
            for (class406 var6 = this.field3178.method506((byte) -128); var6 != this.field3178.field1104; var6 = var6.field5862) {
                ((class437) var6).method2738(this.field3182, this.field3181);
            }
            this.field3187 = true;
            this.field3188 = true;
        }
        if (this.field3188) {
            if (this.field3192 != null) {
                this.field3192.method45();
                this.field3192 = null;
            }
            if (this.field3189 != null) {
                this.field3189.method1478();
                this.field3189 = null;
            }
            if (this.field3186) {
                this.field3189 = new class354(this.field3180, 34037, 6402, this.field3182, this.field3181);
            } else {
                this.field3192 = new class6(this.field3180, 6402, this.field3182, this.field3181);
            }
            this.field3193 = true;
            this.field3188 = false;
            var5 = true;
        }
        if (this.field3187) {
            if (this.field3190[0] != null) {
                this.field3190[0].method1478();
                this.field3190[0] = null;
            }
            if (this.field3190[1] != null) {
                this.field3190[1].method1478();
                this.field3190[1] = null;
            }
            this.field3190[0] = new class354(this.field3180, 34037, this.field3185, this.field3182, this.field3181);
            this.field3190[1] = this.field3191 > 1 ? new class354(this.field3180, 34037, this.field3185, this.field3182, this.field3181) : null;
            this.field3193 = true;
            this.field3187 = false;
            var5 = true;
        }
        int var7 = this.field3180.method970().method451();
        this.field3180.method998(this.field3183);
        if (this.field3193) {
            this.field3183.method449(0);
            this.field3183.method449(1);
            this.field3183.method449(8);
            if (this.field3190[0] != null) {
                this.field3183.method445(0, this.field3190[0]);
            }
            if (this.field3190[1] != null) {
                this.field3183.method445(1, this.field3190[1]);
            }
            if (this.field3189 != null) {
                this.field3183.method445(8, this.field3189);
            }
            if (this.field3192 != null) {
                this.field3183.method453(8, this.field3192);
            }
            this.field3183.method454(0);
            this.field3193 = false;
            var5 = true;
        }
        if (!var5 || this.field3183.method447()) {
            this.field3184 = arg0;
            this.field3179 = arg1;
            this.field3180.method954(-this.field3184, this.field3181 + this.field3179 - var7);
            return true;
        }
        this.field3180.method947(this.field3183);
        this.field3187 = true;
        this.field3188 = true;
        this.field3193 = true;
        return false;
    }
}
