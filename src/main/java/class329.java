import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class329 extends class404 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lsh;")
    private class435 field4493;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Llp;")
    private class135 field4496;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[F")
    private static float[] field4495 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ltp;")
    private class124 field4494;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lsd;)V")
    public final void method353(class233 arg0) {
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lh;Lsh;)V")
    public class329(class327 arg0, class435 arg1) {
        super(arg0);
        this.field4493 = arg1;
        this.method2121();
        this.field4496 = new class135(this.field5606, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4496.method877(1, false);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
    private final void method2121() {
        opengl var1 = this.field5606.field4363;
        this.field4494 = new class124(this.field5606, 2);
        this.field4494.method808(0);
        this.field5606.method2115(1);
        this.field5606.method2056(7681, 260);
        this.field5606.method2077(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field5606.method2115(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4493.field5947) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field4494.method807();
        this.field4494.method808(1);
        this.field5606.method2115(1);
        this.field5606.method2056(8448, 8448);
        this.field5606.method2077(0, 5890, 768);
        var1.glDisable(3168);
        this.field5606.method2115(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4493.field5947) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field4494.method807();
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
    public final void method348(boolean arg0) {
        opengl var2 = this.field5606.field4363;
        if (this.field5606.field4392 > 0) {
            float var3 = -0.5F / (float) this.field5606.field4392;
            this.field5606.method2115(1);
            field4495[0] = 0.0F;
            field4495[1] = 0.0F;
            field4495[2] = var3;
            field4495[3] = this.field5606.field4430 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field4495, 0);
            var2.glPopMatrix();
            this.field5606.method2090(0.5F, (float) this.field5606.field4392);
            this.field5606.method2088(this.field4496);
            this.field5606.method2115(0);
        }
        this.field4494.method809('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
        this.field5606.method2056(260, 8448);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
    public final void method352() {
        opengl var1 = this.field5606.field4363;
        this.field4494.method809('\u0001');
        if (this.field5606.field4392 > 0) {
            this.field5606.method2115(1);
            this.field5606.method2088((class233) null);
            this.field5606.method2090(1.0F, 0.0F);
            this.field5606.method2115(0);
        }
        this.field5606.method2056(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()Z")
    public final boolean method350() {
        return true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final void method351(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field4493.field5947) {
                this.field5606.method2088(this.field4493.field5950);
                field4495[0] = 0.0F;
                field4495[1] = 0.0F;
                field4495[2] = 0.0F;
                field4495[3] = (float) (this.field5606.field4373 % 4000) / 4000.0F;
                this.field5606.field4363.glTexGenfv(8194, 9473, field4495, 0);
            } else {
                int var2 = this.field5606.field4373 % 4000 * 16 / 4000;
                this.field5606.method2088(this.field4493.field5946[var2]);
            }
        } else if (this.field4493.field5947) {
            this.field5606.method2088(this.field4493.field5950);
            field4495[0] = 0.0F;
            field4495[1] = 0.0F;
            field4495[2] = 0.0F;
            field4495[3] = 0.0F;
            this.field5606.field4363.glTexGenfv(8194, 9473, field4495, 0);
        } else {
            this.field5606.method2088(this.field4493.field5946[0]);
        }
    }
}
