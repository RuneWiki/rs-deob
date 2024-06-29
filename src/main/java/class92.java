import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class92 extends class157 {

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Lcf;")
    private class142 field1356;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "Lli;")
    private class453 field1354;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "[F")
    private static float[] field1355 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "Lq;")
    private class205 field1357;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()Z", line = 4)
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 8)
    public final void method556(boolean arg0) {
        this.field2366.method145(260, 8448);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lvd;)V", line = 11)
    public final void method557(class4 arg0) {
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "()V", line = 14)
    private final void method802() {
        opengl var1 = this.field2366.field198;
        this.field1357 = new class205(this.field2366, 2);
        this.field1357.method1426(0);
        this.field2366.method176(1);
        this.field2366.method145(7681, 260);
        this.field2366.method93(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field2366.method176(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1356.field2144) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1357.method1425();
        this.field1357.method1426(1);
        this.field2366.method176(1);
        this.field2366.method145(8448, 8448);
        this.field2366.method93(0, 5890, 768);
        var1.glDisable(3168);
        this.field2366.method176(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1356.field2144) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1357.method1425();
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lhd;Lcf;)V", line = 53)
    public class92(class17 arg0, class142 arg1) {
        super(arg0);
        this.field1356 = arg1;
        this.method802();
        this.field1354 = new class453(this.field2366, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1354.method2823(-16072, false);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "()V", line = 63)
    public final void method552() {
        opengl var1 = this.field2366.field198;
        this.field1357.method1427('\u0001');
        if (this.field2366.field291 > 0) {
            this.field2366.method176(1);
            this.field2366.method207((class4) null);
            this.field2366.method244(1.0F, 0.0F);
            this.field2366.method176(0);
        }
        this.field2366.method145(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 80)
    public final void method553(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1356.field2144) {
                this.field2366.method207(this.field1356.field2147);
                field1355[0] = 0.0F;
                field1355[1] = 0.0F;
                field1355[2] = 0.0F;
                field1355[3] = (float) (this.field2366.field210 % 4000) / 4000.0F;
                this.field2366.field198.glTexGenfv(8194, 9473, field1355, 0);
            } else {
                int var2 = this.field2366.field210 % 4000 * 16 / 4000;
                this.field2366.method207(this.field1356.field2150[var2]);
            }
        } else if (this.field1356.field2144) {
            this.field2366.method207(this.field1356.field2147);
            field1355[0] = 0.0F;
            field1355[1] = 0.0F;
            field1355[2] = 0.0F;
            field1355[3] = 0.0F;
            this.field2366.field198.glTexGenfv(8194, 9473, field1355, 0);
        } else {
            this.field2366.method207(this.field1356.field2150[0]);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V", line = 119)
    public final void method554(boolean arg0) {
        opengl var2 = this.field2366.field198;
        if (this.field2366.field291 > 0) {
            float var3 = -0.5F / (float) this.field2366.field291;
            this.field2366.method176(1);
            field1355[0] = 0.0F;
            field1355[1] = 0.0F;
            field1355[2] = var3;
            field1355[3] = this.field2366.field271 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1355, 0);
            var2.glPopMatrix();
            this.field2366.method244(0.5F, (float) this.field2366.field291);
            this.field2366.method207(this.field1354);
            this.field2366.method176(0);
        }
        this.field1357.method1427('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }
}
