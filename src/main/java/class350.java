import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class350 extends class44 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lim;")
    private class342 field4961;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lwb;")
    private class179 field4963;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[F")
    private static float[] field4962 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Leq;")
    private class115 field4964;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public final void method230(boolean arg0) {
        this.field540.method981(260, 8448);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public final void method227(boolean arg0) {
        opengl var2 = this.field540.field1927;
        if (this.field540.field2010 > 0) {
            float var3 = -0.5F / (float) this.field540.field2010;
            this.field540.method1001(1);
            field4962[0] = 0.0F;
            field4962[1] = 0.0F;
            field4962[2] = var3;
            field4962[3] = this.field540.field2007 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field4962, 0);
            var2.glPopMatrix();
            this.field540.method939(0.5F, (float) this.field540.field2010);
            this.field540.method1003(this.field4963);
            this.field540.method1001(0);
        }
        this.field4964.method714('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lao;Lim;)V")
    public class350(class157 arg0, class342 arg1) {
        super(arg0);
        this.field4961 = arg1;
        this.method2238();
        this.field4963 = new class179(this.field540, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4963.method1212((byte) -97, false);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()Z")
    public final boolean method232() {
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Llp;)V")
    public final void method231(class220 arg0) {
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public final void method229() {
        opengl var1 = this.field540.field1927;
        this.field4964.method714('\u0001');
        if (this.field540.field2010 > 0) {
            this.field540.method1001(1);
            this.field540.method1003((class220) null);
            this.field540.method939(1.0F, 0.0F);
            this.field540.method1001(0);
        }
        this.field540.method981(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public final void method228(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field4961.field4850) {
                this.field540.method1003(this.field4961.field4852);
                field4962[0] = 0.0F;
                field4962[1] = 0.0F;
                field4962[2] = 0.0F;
                field4962[3] = (float) (this.field540.field1941 % 4000) / 4000.0F;
                this.field540.field1927.glTexGenfv(8194, 9473, field4962, 0);
            } else {
                int var2 = this.field540.field1941 % 4000 * 16 / 4000;
                this.field540.method1003(this.field4961.field4851[var2]);
            }
        } else if (this.field4961.field4850) {
            this.field540.method1003(this.field4961.field4852);
            field4962[0] = 0.0F;
            field4962[1] = 0.0F;
            field4962[2] = 0.0F;
            field4962[3] = 0.0F;
            this.field540.field1927.glTexGenfv(8194, 9473, field4962, 0);
        } else {
            this.field540.method1003(this.field4961.field4851[0]);
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
    private final void method2238() {
        opengl var1 = this.field540.field1927;
        this.field4964 = new class115(this.field540, 2);
        this.field4964.method716(0);
        this.field540.method1001(1);
        this.field540.method981(7681, 260);
        this.field540.method991(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field540.method1001(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4961.field4850) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field4964.method715();
        this.field4964.method716(1);
        this.field540.method1001(1);
        this.field540.method981(8448, 8448);
        this.field540.method991(0, 5890, 768);
        var1.glDisable(3168);
        this.field540.method1001(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4961.field4850) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field4964.method715();
    }
}
