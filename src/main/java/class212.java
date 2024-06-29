import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class212 extends class300 {

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lmk;")
    private class154 field3149;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Ldq;")
    private class87 field3150;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[F")
    private static float[] field3148 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lfr;")
    private class101 field3151;

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lge;Lmk;)V")
    public class212(class104 arg0, class154 arg1) {
        super(arg0);
        this.field3149 = arg1;
        this.method1621();
        this.field3150 = new class87(this.field4409, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3150.method657(false, (byte) -81);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lmo;)V")
    public final void method9(class195 arg0) {
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        this.field4409.method870(260, 8448);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "()Z")
    public final boolean method4() {
        return true;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field3149.field2351) {
                this.field4409.method929(this.field3149.field2355);
                field3148[0] = 0.0F;
                field3148[1] = 0.0F;
                field3148[2] = 0.0F;
                field3148[3] = (float) (this.field4409.field1614 % 4000) / 4000.0F;
                this.field4409.field1604.glTexGenfv(8194, 9473, field3148, 0);
            } else {
                int var2 = this.field4409.field1614 % 4000 * 16 / 4000;
                this.field4409.method929(this.field3149.field2349[var2]);
            }
        } else if (this.field3149.field2351) {
            this.field4409.method929(this.field3149.field2355);
            field3148[0] = 0.0F;
            field3148[1] = 0.0F;
            field3148[2] = 0.0F;
            field3148[3] = 0.0F;
            this.field4409.field1604.glTexGenfv(8194, 9473, field3148, 0);
        } else {
            this.field4409.method929(this.field3149.field2349[0]);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "()V")
    public final void method5() {
        opengl var1 = this.field4409.field1604;
        this.field3151.method836('\u0001');
        if (this.field4409.field1630 > 0) {
            this.field4409.method857(1);
            this.field4409.method929((class195) null);
            this.field4409.method892(1.0F, 0.0F);
            this.field4409.method857(0);
        }
        this.field4409.method870(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "()V")
    private final void method1621() {
        opengl var1 = this.field4409.field1604;
        this.field3151 = new class101(this.field4409, 2);
        this.field3151.method835(0);
        this.field4409.method857(1);
        this.field4409.method870(7681, 260);
        this.field4409.method891(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field4409.method857(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3149.field2351) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field3151.method834();
        this.field3151.method835(1);
        this.field4409.method857(1);
        this.field4409.method870(8448, 8448);
        this.field4409.method891(0, 5890, 768);
        var1.glDisable(3168);
        this.field4409.method857(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3149.field2351) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field3151.method834();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
    public final void method6(boolean arg0) {
        opengl var2 = this.field4409.field1604;
        if (this.field4409.field1630 > 0) {
            float var3 = -0.5F / (float) this.field4409.field1630;
            this.field4409.method857(1);
            field3148[0] = 0.0F;
            field3148[1] = 0.0F;
            field3148[2] = var3;
            field3148[3] = this.field4409.field1647 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field3148, 0);
            var2.glPopMatrix();
            this.field4409.method892(0.5F, (float) this.field4409.field1630);
            this.field4409.method929(this.field3150);
            this.field4409.method857(0);
        }
        this.field3151.method836('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }
}
