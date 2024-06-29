import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class8 extends class309 {

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lja;")
    private class97 field67;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lon;")
    private class38 field68;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[F")
    private static float[] field66 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lfa;")
    private class433 field65;

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lic;Lja;)V")
    public class8(class246 arg0, class97 arg1) {
        super(arg0);
        this.field67 = arg1;
        this.method52();
        this.field68 = new class38(this.field4530, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field68.method198(false, -30747);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lvd;)V")
    public final void method51(class5 arg0) {
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "()V")
    private final void method52() {
        opengl var1 = this.field4530.field3342;
        this.field65 = new class433(this.field4530, 2);
        this.field65.method2589(0);
        this.field4530.method1365(1);
        this.field4530.method1360(7681, 260);
        this.field4530.method1458(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field4530.method1365(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field67.field1195) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field65.method2590();
        this.field65.method2589(1);
        this.field4530.method1365(1);
        this.field4530.method1360(8448, 8448);
        this.field4530.method1458(0, 5890, 768);
        var1.glDisable(3168);
        this.field4530.method1365(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field67.field1195) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field65.method2590();
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public final void method53(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field67.field1195) {
                this.field4530.method1379(this.field67.field1197);
                field66[0] = 0.0F;
                field66[1] = 0.0F;
                field66[2] = 0.0F;
                field66[3] = (float) (this.field4530.field3359 % 4000) / 4000.0F;
                this.field4530.field3342.glTexGenfv(8194, 9473, field66, 0);
            } else {
                int var2 = this.field4530.field3359 % 4000 * 16 / 4000;
                this.field4530.method1379(this.field67.field1196[var2]);
            }
        } else if (this.field67.field1195) {
            this.field4530.method1379(this.field67.field1197);
            field66[0] = 0.0F;
            field66[1] = 0.0F;
            field66[2] = 0.0F;
            field66[3] = 0.0F;
            this.field4530.field3342.glTexGenfv(8194, 9473, field66, 0);
        } else {
            this.field4530.method1379(this.field67.field1196[0]);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "()V")
    public final void method54() {
        opengl var1 = this.field4530.field3342;
        this.field65.method2588('\u0001');
        if (this.field4530.field3427 > 0) {
            this.field4530.method1365(1);
            this.field4530.method1379((class5) null);
            this.field4530.method1377(1.0F, 0.0F);
            this.field4530.method1365(0);
        }
        this.field4530.method1360(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public final void method55(boolean arg0) {
        opengl var2 = this.field4530.field3342;
        if (this.field4530.field3427 > 0) {
            float var3 = -0.5F / (float) this.field4530.field3427;
            this.field4530.method1365(1);
            field66[0] = 0.0F;
            field66[1] = 0.0F;
            field66[2] = var3;
            field66[3] = this.field4530.field3392 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field66, 0);
            var2.glPopMatrix();
            this.field4530.method1377(0.5F, (float) this.field4530.field3427);
            this.field4530.method1379(this.field68);
            this.field4530.method1365(0);
        }
        this.field65.method2588('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "()Z")
    public final boolean method56() {
        return true;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
    public final void method57(boolean arg0) {
        this.field4530.method1360(260, 8448);
    }
}
