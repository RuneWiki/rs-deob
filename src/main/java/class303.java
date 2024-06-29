import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class303 extends class436 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lqg;")
    private class155 field4455;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lpa;")
    private class341 field4456;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[F")
    private static float[] field4454 = new float[4];

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lnf;Lqg;)V", line = 3)
    public class303(class256 arg0, class155 arg1) {
        super(arg0);
        this.field4455 = arg1;
        opengl var3 = arg0.field3634;
        this.field4456 = new class341(arg0, 2);
        this.field4456.method2224(0);
        this.field6402.method1777(1);
        if (this.field4455.field2097) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field6402.method1777(0);
        this.field4456.method2223();
        this.field4456.method2224(1);
        this.field6402.method1777(1);
        if (this.field4455.field2097) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field6402.method1777(0);
        this.field4456.method2223();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lme;)V", line = 33)
    public final void method160(class360 arg0) {
        this.field6402.method1669(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()V", line = 36)
    public final void method157() {
        this.field4456.method2225('\u0001');
        this.field6402.method1777(1);
        this.field6402.method1669((class360) null);
        this.field6402.method1777(0);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 44)
    public final void method161(boolean arg0) {
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 46)
    public final void method158(boolean arg0) {
        this.field4456.method2225('\u0000');
        if (this.field4455.field2097) {
            this.field6402.method1777(1);
            this.field6402.method1669(this.field4455.field2096);
            this.field6402.method1777(0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Z", line = 59)
    public final boolean method159() {
        return true;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 66)
    public final void method162(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field6402.field3634;
        this.field6402.method1777(1);
        if (var5) {
            field4454[0] = var4;
            field4454[1] = 0.0F;
            field4454[2] = 0.0F;
            field4454[3] = 0.0F;
        } else {
            field4454[0] = 0.0F;
            field4454[1] = 0.0F;
            field4454[2] = var4;
            field4454[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field4454, 0);
        field4454[0] = 0.0F;
        field4454[1] = var4;
        field4454[2] = 0.0F;
        field4454[3] = (float) this.field6402.field3641 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field4454, 0);
        if (this.field4455.field2097) {
            field4454[0] = 0.0F;
            field4454[1] = 0.0F;
            field4454[2] = 0.0F;
            field4454[3] = (float) this.field6402.field3641 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field4454, 0);
        } else {
            int var7 = (int) ((float) this.field6402.field3641 * var3 * 16.0F);
            this.field6402.method1669(this.field4455.field2099[var7 % 16]);
        }
        this.field6402.method1777(0);
    }
}
