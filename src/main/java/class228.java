import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class228 extends class284 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lqf;")
    private class404 field3047;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lwm;")
    private class334 field3046;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[F")
    private static float[] field3048 = new float[4];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
    public final void method695(boolean arg0) {
        this.field3046.method2075('\u0000');
        if (this.field3047.field5883) {
            this.field3917.method2162(1);
            this.field3917.method2165(this.field3047.field5878);
            this.field3917.method2162(0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field3917.field4607;
        this.field3917.method2162(1);
        if (var5) {
            field3048[0] = var4;
            field3048[1] = 0.0F;
            field3048[2] = 0.0F;
            field3048[3] = 0.0F;
        } else {
            field3048[0] = 0.0F;
            field3048[1] = 0.0F;
            field3048[2] = var4;
            field3048[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field3048, 0);
        field3048[0] = 0.0F;
        field3048[1] = var4;
        field3048[2] = 0.0F;
        field3048[3] = (float) this.field3917.field4615 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field3048, 0);
        if (this.field3047.field5883) {
            field3048[0] = 0.0F;
            field3048[1] = 0.0F;
            field3048[2] = 0.0F;
            field3048[3] = (float) this.field3917.field4615 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field3048, 0);
        } else {
            int var7 = (int) ((float) this.field3917.field4615 * var3 * 16.0F);
            this.field3917.method2165(this.field3047.field5877[var7 % 16]);
        }
        this.field3917.method2162(0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method699() {
        this.field3046.method2075('\u0001');
        this.field3917.method2162(1);
        this.field3917.method2165((class133) null);
        this.field3917.method2162(0);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lhj;Lqf;)V")
    public class228(class338 arg0, class404 arg1) {
        super(arg0);
        this.field3047 = arg1;
        opengl var3 = arg0.field4607;
        this.field3046 = new class334(arg0, 2);
        this.field3046.method2073(0);
        this.field3917.method2162(1);
        if (this.field3047.field5883) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field3917.method2162(0);
        this.field3046.method2074();
        this.field3046.method2073(1);
        this.field3917.method2162(1);
        if (this.field3047.field5883) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field3917.method2162(0);
        this.field3046.method2074();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public final void method696(boolean arg0) {
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnj;)V")
    public final void method693(class133 arg0) {
        this.field3917.method2165(arg0);
    }
}
