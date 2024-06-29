import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class324 extends class304 {

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Ltk;")
    private class180 field4807;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Lns;")
    private class426 field4805;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "[F")
    private static float[] field4806 = new float[4];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()V", line = 5)
    public final void method627() {
        this.field4805.method2672('\u0001');
        this.field4557.method1862(1);
        this.field4557.method1915((class344) null);
        this.field4557.method1862(0);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()Z", line = 12)
    public final boolean method628() {
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 15)
    public final void method624(boolean arg0) {
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 18)
    public final void method625(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field4557.field4140;
        this.field4557.method1862(1);
        if (var5) {
            field4806[0] = var4;
            field4806[1] = 0.0F;
            field4806[2] = 0.0F;
            field4806[3] = 0.0F;
        } else {
            field4806[0] = 0.0F;
            field4806[1] = 0.0F;
            field4806[2] = var4;
            field4806[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field4806, 0);
        field4806[0] = 0.0F;
        field4806[1] = var4;
        field4806[2] = 0.0F;
        field4806[3] = (float) this.field4557.field4153 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field4806, 0);
        if (this.field4807.field2413) {
            field4806[0] = 0.0F;
            field4806[1] = 0.0F;
            field4806[2] = 0.0F;
            field4806[3] = (float) this.field4557.field4153 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field4806, 0);
        } else {
            int var7 = (int) ((float) this.field4557.field4153 * var3 * 16.0F);
            this.field4557.method1915(this.field4807.field2417[var7 % 16]);
        }
        this.field4557.method1862(0);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lse;Ltk;)V", line = 67)
    public class324(class282 arg0, class180 arg1) {
        super(arg0);
        this.field4807 = arg1;
        opengl var3 = arg0.field4140;
        this.field4805 = new class426(arg0, 2);
        this.field4805.method2670(0);
        this.field4557.method1862(1);
        if (this.field4807.field2413) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field4557.method1862(0);
        this.field4805.method2671();
        this.field4805.method2670(1);
        this.field4557.method1862(1);
        if (this.field4807.field2413) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field4557.method1862(0);
        this.field4805.method2671();
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lgd;)V", line = 97)
    public final void method629(class344 arg0) {
        this.field4557.method1915(arg0);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Z)V", line = 100)
    public final void method630(boolean arg0) {
        this.field4805.method2672('\u0000');
        if (this.field4807.field2413) {
            this.field4557.method1862(1);
            this.field4557.method1915(this.field4807.field2415);
            this.field4557.method1862(0);
        }
    }
}
