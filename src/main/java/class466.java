import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class466 extends class309 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lja;")
    private class97 field6550;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lfa;")
    private class433 field6549;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[F")
    private static float[] field6551 = new float[4];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 4)
    public final void method53(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field4530.field3342;
        this.field4530.method1365(1);
        if (var5) {
            field6551[0] = var4;
            field6551[1] = 0.0F;
            field6551[2] = 0.0F;
            field6551[3] = 0.0F;
        } else {
            field6551[0] = 0.0F;
            field6551[1] = 0.0F;
            field6551[2] = var4;
            field6551[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field6551, 0);
        field6551[0] = 0.0F;
        field6551[1] = var4;
        field6551[2] = 0.0F;
        field6551[3] = (float) this.field4530.field3359 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field6551, 0);
        if (this.field6550.field1195) {
            field6551[0] = 0.0F;
            field6551[1] = 0.0F;
            field6551[2] = 0.0F;
            field6551[3] = (float) this.field4530.field3359 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field6551, 0);
        } else {
            int var7 = (int) ((float) this.field4530.field3359 * var3 * 16.0F);
            this.field4530.method1379(this.field6550.field1194[var7 % 16]);
        }
        this.field4530.method1365(0);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V", line = 54)
    public final void method54() {
        this.field6549.method2588('\u0001');
        this.field4530.method1365(1);
        this.field4530.method1379((class5) null);
        this.field4530.method1365(0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 60)
    public final void method55(boolean arg0) {
        this.field6549.method2588('\u0000');
        if (this.field6550.field1195) {
            this.field4530.method1365(1);
            this.field4530.method1379(this.field6550.field1192);
            this.field4530.method1365(0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lvd;)V", line = 70)
    public final void method51(class5 arg0) {
        this.field4530.method1379(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lic;Lja;)V", line = 73)
    public class466(class246 arg0, class97 arg1) {
        super(arg0);
        this.field6550 = arg1;
        opengl var3 = arg0.field3342;
        this.field6549 = new class433(arg0, 2);
        this.field6549.method2589(0);
        this.field4530.method1365(1);
        if (this.field6550.field1195) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field4530.method1365(0);
        this.field6549.method2590();
        this.field6549.method2589(1);
        this.field4530.method1365(1);
        if (this.field6550.field1195) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field4530.method1365(0);
        this.field6549.method2590();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V", line = 103)
    public final void method57(boolean arg0) {
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()Z", line = 111)
    public final boolean method56() {
        return true;
    }
}
