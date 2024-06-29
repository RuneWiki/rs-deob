import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class273 extends class48 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lbo;")
    private class354 field3684;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lfb;")
    private class45 field3687;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[F")
    private static float[] field3686 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lgi;")
    private class253 field3685;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z")
    public final boolean method74() {
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
        this.field480.method2053(260, 8448);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lna;)V")
    public final void method71(class50 arg0) {
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
    public final void method72() {
        opengl var1 = this.field480.field4697;
        this.field3685.method1427('\u0001');
        if (this.field480.field4812 > 0) {
            this.field480.method2052(1);
            this.field480.method2032((class50) null);
            this.field480.method2027(1.0F, 0.0F);
            this.field480.method2052(0);
        }
        this.field480.method2053(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lql;Lbo;)V")
    public class273(class346 arg0, class354 arg1) {
        super(arg0);
        this.field3684 = arg1;
        this.method1508();
        this.field3687 = new class45(this.field480, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3687.method211(false, false);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        opengl var2 = this.field480.field4697;
        if (this.field480.field4812 > 0) {
            float var3 = -0.5F / (float) this.field480.field4812;
            this.field480.method2052(1);
            field3686[0] = 0.0F;
            field3686[1] = 0.0F;
            field3686[2] = var3;
            field3686[3] = this.field480.field4773 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field3686, 0);
            var2.glPopMatrix();
            this.field480.method2027(0.5F, (float) this.field480.field4812);
            this.field480.method2032(this.field3687);
            this.field480.method2052(0);
        }
        this.field3685.method1427('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method69(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field3684.field5006) {
                this.field480.method2032(this.field3684.field5008);
                field3686[0] = 0.0F;
                field3686[1] = 0.0F;
                field3686[2] = 0.0F;
                field3686[3] = (float) (this.field480.field4720 % 4000) / 4000.0F;
                this.field480.field4697.glTexGenfv(8194, 9473, field3686, 0);
            } else {
                int var2 = this.field480.field4720 % 4000 * 16 / 4000;
                this.field480.method2032(this.field3684.field5005[var2]);
            }
        } else if (this.field3684.field5006) {
            this.field480.method2032(this.field3684.field5008);
            field3686[0] = 0.0F;
            field3686[1] = 0.0F;
            field3686[2] = 0.0F;
            field3686[3] = 0.0F;
            this.field480.field4697.glTexGenfv(8194, 9473, field3686, 0);
        } else {
            this.field480.method2032(this.field3684.field5005[0]);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
    private final void method1508() {
        opengl var1 = this.field480.field4697;
        this.field3685 = new class253(this.field480, 2);
        this.field3685.method1429(0);
        this.field480.method2052(1);
        this.field480.method2053(7681, 260);
        this.field480.method2062(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field480.method2052(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3684.field5006) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field3685.method1428();
        this.field3685.method1429(1);
        this.field480.method2052(1);
        this.field480.method2053(8448, 8448);
        this.field480.method2062(0, 5890, 768);
        var1.glDisable(3168);
        this.field480.method2052(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3684.field5006) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field3685.method1428();
    }
}
