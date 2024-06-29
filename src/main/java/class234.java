import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class234 extends class399 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lde;")
    private class312 field3190;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lnb;")
    private class165 field3189;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[F")
    private static float[] field3191 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lel;")
    private class325 field3192;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V", line = 4)
    private final void method1495() {
        opengl var1 = this.field5798.field4752;
        this.field3192 = new class325(this.field5798, 2);
        this.field3192.method2005(0);
        this.field5798.method2062(1);
        this.field5798.method2100(7681, 260);
        this.field5798.method2086(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field5798.method2062(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3190.field4459) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field3192.method2004();
        this.field3192.method2005(1);
        this.field5798.method2062(1);
        this.field5798.method2100(8448, 8448);
        this.field5798.method2086(0, 5890, 768);
        var1.glDisable(3168);
        this.field5798.method2062(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3190.field4459) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field3192.method2004();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 40)
    public final void method378(boolean arg0) {
        this.field5798.method2100(260, 8448);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V", line = 46)
    public final void method379() {
        opengl var1 = this.field5798.field4752;
        this.field3192.method2003('\u0001');
        if (this.field5798.field4817 > 0) {
            this.field5798.method2062(1);
            this.field5798.method2085((class439) null);
            this.field5798.method2126(1.0F, 0.0F);
            this.field5798.method2062(0);
        }
        this.field5798.method2100(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V", line = 63)
    public final void method374(boolean arg0) {
        opengl var2 = this.field5798.field4752;
        if (this.field5798.field4817 > 0) {
            float var3 = -0.5F / (float) this.field5798.field4817;
            this.field5798.method2062(1);
            field3191[0] = 0.0F;
            field3191[1] = 0.0F;
            field3191[2] = var3;
            field3191[3] = this.field5798.field4863 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field3191, 0);
            var2.glPopMatrix();
            this.field5798.method2126(0.5F, (float) this.field5798.field4817);
            this.field5798.method2085(this.field3189);
            this.field5798.method2062(0);
        }
        this.field3192.method2003('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lpo;Lde;)V", line = 89)
    public class234(class332 arg0, class312 arg1) {
        super(arg0);
        this.field3190 = arg1;
        this.method1495();
        this.field3189 = new class165(this.field5798, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3189.method1089(3317, false);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lfl;)V", line = 98)
    public final void method376(class439 arg0) {
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z", line = 105)
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 108)
    public final void method377(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field3190.field4459) {
                this.field5798.method2085(this.field3190.field4458);
                field3191[0] = 0.0F;
                field3191[1] = 0.0F;
                field3191[2] = 0.0F;
                field3191[3] = (float) (this.field5798.field4758 % 4000) / 4000.0F;
                this.field5798.field4752.glTexGenfv(8194, 9473, field3191, 0);
            } else {
                int var2 = this.field5798.field4758 % 4000 * 16 / 4000;
                this.field5798.method2085(this.field3190.field4455[var2]);
            }
        } else if (this.field3190.field4459) {
            this.field5798.method2085(this.field3190.field4458);
            field3191[0] = 0.0F;
            field3191[1] = 0.0F;
            field3191[2] = 0.0F;
            field3191[3] = 0.0F;
            this.field5798.field4752.glTexGenfv(8194, 9473, field3191, 0);
        } else {
            this.field5798.method2085(this.field3190.field4455[0]);
        }
    }
}
