import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class129 extends class331 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lmb;")
    private class158 field1685;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lbn;")
    private class283 field1686;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[F")
    private static float[] field1684 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lma;")
    private class10 field1687;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        opengl var2 = this.field4787.field4445;
        if (this.field4787.field4555 > 0) {
            float var3 = -0.5F / (float) this.field4787.field4555;
            this.field4787.method1972(1);
            field1684[0] = 0.0F;
            field1684[1] = 0.0F;
            field1684[2] = var3;
            field1684[3] = this.field4787.field4518 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1684, 0);
            var2.glPopMatrix();
            this.field4787.method1997(0.5F, (float) this.field4787.field4555);
            this.field4787.method1967(this.field1686);
            this.field4787.method1972(0);
        }
        this.field1687.method37('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z")
    public final boolean method812() {
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
    public final void method813(boolean arg0) {
        this.field4787.method1992(260, 8448);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
    private final void method814() {
        opengl var1 = this.field4787.field4445;
        this.field1687 = new class10(this.field4787, 2);
        this.field1687.method39(0);
        this.field4787.method1972(1);
        this.field4787.method1992(7681, 260);
        this.field4787.method2006(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field4787.method1972(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1685.field2356) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1687.method38();
        this.field1687.method39(1);
        this.field4787.method1972(1);
        this.field4787.method1992(8448, 8448);
        this.field4787.method2006(0, 5890, 768);
        var1.glDisable(3168);
        this.field4787.method1972(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1685.field2356) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1687.method38();
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lmi;Lmb;)V")
    public class129(class315 arg0, class158 arg1) {
        super(arg0);
        this.field1685 = arg1;
        this.method814();
        this.field1686 = new class283(this.field4787, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1686.method1784(false, (byte) 106);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1685.field2356) {
                this.field4787.method1967(this.field1685.field2351);
                field1684[0] = 0.0F;
                field1684[1] = 0.0F;
                field1684[2] = 0.0F;
                field1684[3] = (float) (this.field4787.field4458 % 4000) / 4000.0F;
                this.field4787.field4445.glTexGenfv(8194, 9473, field1684, 0);
            } else {
                int var2 = this.field4787.field4458 % 4000 * 16 / 4000;
                this.field4787.method1967(this.field1685.field2354[var2]);
            }
        } else if (this.field1685.field2356) {
            this.field4787.method1967(this.field1685.field2351);
            field1684[0] = 0.0F;
            field1684[1] = 0.0F;
            field1684[2] = 0.0F;
            field1684[3] = 0.0F;
            this.field4787.field4445.glTexGenfv(8194, 9473, field1684, 0);
        } else {
            this.field4787.method1967(this.field1685.field2354[0]);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
    public final void method816() {
        opengl var1 = this.field4787.field4445;
        this.field1687.method37('\u0001');
        if (this.field4787.field4555 > 0) {
            this.field4787.method1972(1);
            this.field4787.method1967((class425) null);
            this.field4787.method1997(1.0F, 0.0F);
            this.field4787.method1972(0);
        }
        this.field4787.method1992(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lbl;)V")
    public final void method817(class425 arg0) {
    }
}
