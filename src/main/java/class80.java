import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class80 extends class304 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ltk;")
    private class180 field1104;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lgi;")
    private class22 field1105;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[F")
    private static float[] field1103 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lns;")
    private class426 field1102;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 3)
    public final void method624(boolean arg0) {
        this.field4557.method1911(260, 8448);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 7)
    public final void method625(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1104.field2413) {
                this.field4557.method1915(this.field1104.field2414);
                field1103[0] = 0.0F;
                field1103[1] = 0.0F;
                field1103[2] = 0.0F;
                field1103[3] = (float) (this.field4557.field4153 % 4000) / 4000.0F;
                this.field4557.field4140.glTexGenfv(8194, 9473, field1103, 0);
            } else {
                int var2 = this.field4557.field4153 % 4000 * 16 / 4000;
                this.field4557.method1915(this.field1104.field2416[var2]);
            }
        } else if (this.field1104.field2413) {
            this.field4557.method1915(this.field1104.field2414);
            field1103[0] = 0.0F;
            field1103[1] = 0.0F;
            field1103[2] = 0.0F;
            field1103[3] = 0.0F;
            this.field4557.field4140.glTexGenfv(8194, 9473, field1103, 0);
        } else {
            this.field4557.method1915(this.field1104.field2416[0]);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()V", line = 50)
    private final void method626() {
        opengl var1 = this.field4557.field4140;
        this.field1102 = new class426(this.field4557, 2);
        this.field1102.method2670(0);
        this.field4557.method1862(1);
        this.field4557.method1911(7681, 260);
        this.field4557.method1866(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field4557.method1862(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1104.field2413) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1102.method2671();
        this.field1102.method2670(1);
        this.field4557.method1862(1);
        this.field4557.method1911(8448, 8448);
        this.field4557.method1866(0, 5890, 768);
        var1.glDisable(3168);
        this.field4557.method1862(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1104.field2413) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1102.method2671();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V", line = 87)
    public final void method627() {
        opengl var1 = this.field4557.field4140;
        this.field1102.method2672('\u0001');
        if (this.field4557.field4265 > 0) {
            this.field4557.method1862(1);
            this.field4557.method1915((class344) null);
            this.field4557.method1925(1.0F, 0.0F);
            this.field4557.method1862(0);
        }
        this.field4557.method1911(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()Z", line = 103)
    public final boolean method628() {
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lgd;)V", line = 106)
    public final void method629(class344 arg0) {
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V", line = 111)
    public final void method630(boolean arg0) {
        opengl var2 = this.field4557.field4140;
        if (this.field4557.field4265 > 0) {
            float var3 = -0.5F / (float) this.field4557.field4265;
            this.field4557.method1862(1);
            field1103[0] = 0.0F;
            field1103[1] = 0.0F;
            field1103[2] = var3;
            field1103[3] = this.field4557.field4263 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1103, 0);
            var2.glPopMatrix();
            this.field4557.method1925(0.5F, (float) this.field4557.field4265);
            this.field4557.method1915(this.field1105);
            this.field4557.method1862(0);
        }
        this.field1102.method2672('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lse;Ltk;)V", line = 138)
    public class80(class282 arg0, class180 arg1) {
        super(arg0);
        this.field1104 = arg1;
        this.method626();
        this.field1105 = new class22(this.field4557, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1105.method197(10497, false);
    }
}
