import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class222 extends class139 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lc;")
    private class448 field3376;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljb;")
    private class332 field3375;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[F")
    private static float[] field3374 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lcq;")
    private class73 field3377;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lq;)V")
    public final void method56(class325 arg0) {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method58() {
        opengl var1 = this.field1876.field5783;
        this.field3377.method483('\u0001');
        if (this.field1876.field5833 > 0) {
            this.field1876.method2452(1);
            this.field1876.method2460((class325) null);
            this.field1876.method2479(1.0F, 0.0F);
            this.field1876.method2452(0);
        }
        this.field1876.method2428(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lcg;Lc;)V")
    public class222(class393 arg0, class448 arg1) {
        super(arg0);
        this.field3376 = arg1;
        this.method1344();
        this.field3375 = new class332(this.field1876, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3375.method2036(false, 109);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field3376.field6596) {
                this.field1876.method2460(this.field3376.field6597);
                field3374[0] = 0.0F;
                field3374[1] = 0.0F;
                field3374[2] = 0.0F;
                field3374[3] = (float) (this.field1876.field5794 % 4000) / 4000.0F;
                this.field1876.field5783.glTexGenfv(8194, 9473, field3374, 0);
            } else {
                int var2 = this.field1876.field5794 % 4000 * 16 / 4000;
                this.field1876.method2460(this.field3376.field6594[var2]);
            }
        } else if (this.field3376.field6596) {
            this.field1876.method2460(this.field3376.field6597);
            field3374[0] = 0.0F;
            field3374[1] = 0.0F;
            field3374[2] = 0.0F;
            field3374[3] = 0.0F;
            this.field1876.field5783.glTexGenfv(8194, 9473, field3374, 0);
        } else {
            this.field1876.method2460(this.field3376.field6594[0]);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        opengl var2 = this.field1876.field5783;
        if (this.field1876.field5833 > 0) {
            float var3 = -0.5F / (float) this.field1876.field5833;
            this.field1876.method2452(1);
            field3374[0] = 0.0F;
            field3374[1] = 0.0F;
            field3374[2] = var3;
            field3374[3] = this.field1876.field5865 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field3374, 0);
            var2.glPopMatrix();
            this.field1876.method2479(0.5F, (float) this.field1876.field5833);
            this.field1876.method2460(this.field3375);
            this.field1876.method2452(0);
        }
        this.field3377.method483('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
    private final void method1344() {
        opengl var1 = this.field1876.field5783;
        this.field3377 = new class73(this.field1876, 2);
        this.field3377.method482(0);
        this.field1876.method2452(1);
        this.field1876.method2428(7681, 260);
        this.field1876.method2425(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field1876.method2452(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3376.field6596) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field3377.method484();
        this.field3377.method482(1);
        this.field1876.method2452(1);
        this.field1876.method2428(8448, 8448);
        this.field1876.method2425(0, 5890, 768);
        var1.glDisable(3168);
        this.field1876.method2452(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3376.field6596) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field3377.method484();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z")
    public final boolean method60() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public final void method59(boolean arg0) {
        this.field1876.method2428(260, 8448);
    }
}
