import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class35 extends class48 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lbo;")
    private class354 field343;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lgi;")
    private class253 field342;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "[F")
    private static float[] field341 = new float[4];

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public final void method69(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field480.field4697;
        this.field480.method2052(1);
        if (var5) {
            field341[0] = var4;
            field341[1] = 0.0F;
            field341[2] = 0.0F;
            field341[3] = 0.0F;
        } else {
            field341[0] = 0.0F;
            field341[1] = 0.0F;
            field341[2] = var4;
            field341[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field341, 0);
        field341[0] = 0.0F;
        field341[1] = var4;
        field341[2] = 0.0F;
        field341[3] = (float) this.field480.field4720 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field341, 0);
        if (this.field343.field5006) {
            field341[0] = 0.0F;
            field341[1] = 0.0F;
            field341[2] = 0.0F;
            field341[3] = (float) this.field480.field4720 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field341, 0);
        } else {
            int var7 = (int) ((float) this.field480.field4720 * var3 * 16.0F);
            this.field480.method2032(this.field343.field5007[var7 % 16]);
        }
        this.field480.method2052(0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lna;)V")
    public final void method71(class50 arg0) {
        this.field480.method2032(arg0);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        this.field342.method1427('\u0000');
        if (this.field343.field5006) {
            this.field480.method2052(1);
            this.field480.method2032(this.field343.field5009);
            this.field480.method2052(0);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lql;Lbo;)V")
    public class35(class346 arg0, class354 arg1) {
        super(arg0);
        this.field343 = arg1;
        opengl var3 = arg0.field4697;
        this.field342 = new class253(arg0, 2);
        this.field342.method1429(0);
        this.field480.method2052(1);
        if (this.field343.field5006) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field480.method2052(0);
        this.field342.method1428();
        this.field342.method1429(1);
        this.field480.method2052(1);
        if (this.field343.field5006) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field480.method2052(0);
        this.field342.method1428();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
    public final void method72() {
        this.field342.method1427('\u0001');
        this.field480.method2052(1);
        this.field480.method2032((class50) null);
        this.field480.method2052(0);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "()Z")
    public final boolean method74() {
        return true;
    }
}
