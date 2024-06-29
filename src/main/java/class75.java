import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class75 extends class189 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lfs;")
    private class359 field1006;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lht;")
    private class378 field1007;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[F")
    private static float[] field1005 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lrj;")
    private class388 field1008;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 4)
    public final void method486(boolean arg0) {
        opengl var2 = this.field2580.field4604;
        if (this.field2580.field4673 > 0) {
            float var3 = -0.5F / (float) this.field2580.field4673;
            this.field2580.method2067(1);
            field1005[0] = 0.0F;
            field1005[1] = 0.0F;
            field1005[2] = var3;
            field1005[3] = this.field2580.field4644 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1005, 0);
            var2.glPopMatrix();
            this.field2580.method2105(0.5F, (float) this.field2580.field4673);
            this.field2580.method2106(this.field1007);
            this.field2580.method2067(0);
        }
        this.field1008.method2381('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()Z", line = 30)
    public final boolean method487() {
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lbf;Lfs;)V", line = 34)
    public class75(class344 arg0, class359 arg1) {
        super(arg0);
        this.field1006 = arg1;
        this.method489();
        this.field1007 = new class378(this.field2580, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1007.method2319(false, 0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 43)
    public final void method488(boolean arg0) {
        this.field2580.method1994(260, 8448);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()V", line = 48)
    private final void method489() {
        opengl var1 = this.field2580.field4604;
        this.field1008 = new class388(this.field2580, 2);
        this.field1008.method2383(0);
        this.field2580.method2067(1);
        this.field2580.method1994(7681, 260);
        this.field2580.method1990(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field2580.method2067(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1006.field4965) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1008.method2382();
        this.field1008.method2383(1);
        this.field2580.method2067(1);
        this.field2580.method1994(8448, 8448);
        this.field2580.method1990(0, 5890, 768);
        var1.glDisable(3168);
        this.field2580.method2067(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1006.field4965) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1008.method2382();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 87)
    public final void method490(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1006.field4965) {
                this.field2580.method2106(this.field1006.field4964);
                field1005[0] = 0.0F;
                field1005[1] = 0.0F;
                field1005[2] = 0.0F;
                field1005[3] = (float) (this.field2580.field4625 % 4000) / 4000.0F;
                this.field2580.field4604.glTexGenfv(8194, 9473, field1005, 0);
            } else {
                int var2 = this.field2580.field4625 % 4000 * 16 / 4000;
                this.field2580.method2106(this.field1006.field4962[var2]);
            }
        } else if (this.field1006.field4965) {
            this.field2580.method2106(this.field1006.field4964);
            field1005[0] = 0.0F;
            field1005[1] = 0.0F;
            field1005[2] = 0.0F;
            field1005[3] = 0.0F;
            this.field2580.field4604.glTexGenfv(8194, 9473, field1005, 0);
        } else {
            this.field2580.method2106(this.field1006.field4962[0]);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V", line = 125)
    public final void method491() {
        opengl var1 = this.field2580.field4604;
        this.field1008.method2381('\u0001');
        if (this.field2580.field4673 > 0) {
            this.field2580.method2067(1);
            this.field2580.method2106((class386) null);
            this.field2580.method2105(1.0F, 0.0F);
            this.field2580.method2067(0);
        }
        this.field2580.method1994(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lkq;)V", line = 143)
    public final void method492(class386 arg0) {
    }
}
