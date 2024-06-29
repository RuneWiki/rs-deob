import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class397 extends class284 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lqf;")
    private class404 field5791;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lkl;")
    private class47 field5793;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[F")
    private static float[] field5792 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lwm;")
    private class334 field5790;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()Z")
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public final void method695(boolean arg0) {
        opengl var2 = this.field3917.field4607;
        if (this.field3917.field4726 > 0) {
            float var3 = -0.5F / (float) this.field3917.field4726;
            this.field3917.method2162(1);
            field5792[0] = 0.0F;
            field5792[1] = 0.0F;
            field5792[2] = var3;
            field5792[3] = this.field3917.field4687 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field5792, 0);
            var2.glPopMatrix();
            this.field3917.method2154(0.5F, (float) this.field3917.field4726);
            this.field3917.method2165(this.field5793);
            this.field3917.method2162(0);
        }
        this.field5790.method2075('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public final void method696(boolean arg0) {
        this.field3917.method2140(260, 8448);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
    private final void method2567() {
        opengl var1 = this.field3917.field4607;
        this.field5790 = new class334(this.field3917, 2);
        this.field5790.method2073(0);
        this.field3917.method2162(1);
        this.field3917.method2140(7681, 260);
        this.field3917.method2161(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field3917.method2162(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5791.field5883) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field5790.method2074();
        this.field5790.method2073(1);
        this.field3917.method2162(1);
        this.field3917.method2140(8448, 8448);
        this.field3917.method2161(0, 5890, 768);
        var1.glDisable(3168);
        this.field3917.method2162(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5791.field5883) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field5790.method2074();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field5791.field5883) {
                this.field3917.method2165(this.field5791.field5880);
                field5792[0] = 0.0F;
                field5792[1] = 0.0F;
                field5792[2] = 0.0F;
                field5792[3] = (float) (this.field3917.field4615 % 4000) / 4000.0F;
                this.field3917.field4607.glTexGenfv(8194, 9473, field5792, 0);
            } else {
                int var2 = this.field3917.field4615 % 4000 * 16 / 4000;
                this.field3917.method2165(this.field5791.field5879[var2]);
            }
        } else if (this.field5791.field5883) {
            this.field3917.method2165(this.field5791.field5880);
            field5792[0] = 0.0F;
            field5792[1] = 0.0F;
            field5792[2] = 0.0F;
            field5792[3] = 0.0F;
            this.field3917.field4607.glTexGenfv(8194, 9473, field5792, 0);
        } else {
            this.field3917.method2165(this.field5791.field5879[0]);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lnj;)V")
    public final void method693(class133 arg0) {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lhj;Lqf;)V")
    public class397(class338 arg0, class404 arg1) {
        super(arg0);
        this.field5791 = arg1;
        this.method2567();
        this.field5793 = new class47(this.field3917, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5793.method332(false, 14589);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
    public final void method699() {
        opengl var1 = this.field3917.field4607;
        this.field5790.method2075('\u0001');
        if (this.field3917.field4726 > 0) {
            this.field3917.method2162(1);
            this.field3917.method2165((class133) null);
            this.field3917.method2154(1.0F, 0.0F);
            this.field3917.method2162(0);
        }
        this.field3917.method2140(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }
}
