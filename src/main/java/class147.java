import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class147 extends class233 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lrj;")
    private class12 field1930;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lua;")
    private class172 field1931;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[F")
    private static float[] field1929 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lfd;")
    private class195 field1928;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
    public final void method829(boolean arg0) {
        opengl var2 = this.field3283.field4741;
        if (this.field3283.field4790 > 0) {
            float var3 = -0.5F / (float) this.field3283.field4790;
            this.field3283.method2037(1);
            field1929[0] = 0.0F;
            field1929[1] = 0.0F;
            field1929[2] = var3;
            field1929[3] = this.field3283.field4863 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1929, 0);
            var2.glPopMatrix();
            this.field3283.method2125(0.5F, (float) this.field3283.field4790);
            this.field3283.method2186(this.field1931);
            this.field3283.method2037(0);
        }
        this.field1928.method1225('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final void method828(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1930.field144) {
                this.field3283.method2186(this.field1930.field139);
                field1929[0] = 0.0F;
                field1929[1] = 0.0F;
                field1929[2] = 0.0F;
                field1929[3] = (float) (this.field3283.field4761 % 4000) / 4000.0F;
                this.field3283.field4741.glTexGenfv(8194, 9473, field1929, 0);
            } else {
                int var2 = this.field3283.field4761 % 4000 * 16 / 4000;
                this.field3283.method2186(this.field1930.field140[var2]);
            }
        } else if (this.field1930.field144) {
            this.field3283.method2186(this.field1930.field139);
            field1929[0] = 0.0F;
            field1929[1] = 0.0F;
            field1929[2] = 0.0F;
            field1929[3] = 0.0F;
            this.field3283.field4741.glTexGenfv(8194, 9473, field1929, 0);
        } else {
            this.field3283.method2186(this.field1930.field140[0]);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public final void method827(boolean arg0) {
        this.field3283.method2109(260, 8448);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ldg;)V")
    public final void method825(class223 arg0) {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public final void method826() {
        opengl var1 = this.field3283.field4741;
        this.field1928.method1225('\u0001');
        if (this.field3283.field4790 > 0) {
            this.field3283.method2037(1);
            this.field3283.method2186((class223) null);
            this.field3283.method2125(1.0F, 0.0F);
            this.field3283.method2037(0);
        }
        this.field3283.method2109(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
    private final void method980() {
        opengl var1 = this.field3283.field4741;
        this.field1928 = new class195(this.field3283, 2);
        this.field1928.method1223(0);
        this.field3283.method2037(1);
        this.field3283.method2109(7681, 260);
        this.field3283.method2072(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field3283.method2037(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1930.field144) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1928.method1224();
        this.field1928.method1223(1);
        this.field3283.method2037(1);
        this.field3283.method2109(8448, 8448);
        this.field3283.method2072(0, 5890, 768);
        var1.glDisable(3168);
        this.field3283.method2037(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1930.field144) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1928.method1224();
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()Z")
    public final boolean method830() {
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lih;Lrj;)V")
    public class147(class330 arg0, class12 arg1) {
        super(arg0);
        this.field1930 = arg1;
        this.method980();
        this.field1931 = new class172(this.field3283, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1931.method1058(10242, false);
    }
}
