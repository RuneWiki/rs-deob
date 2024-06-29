import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class415 extends class338 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ls;")
    private class258 field5687;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljb;")
    private class461 field5689;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[F")
    private static float[] field5688 = new float[4];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method189(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field4685.field557;
        this.field4685.method407(1);
        if (var5) {
            field5688[0] = var4;
            field5688[1] = 0.0F;
            field5688[2] = 0.0F;
            field5688[3] = 0.0F;
        } else {
            field5688[0] = 0.0F;
            field5688[1] = 0.0F;
            field5688[2] = var4;
            field5688[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field5688, 0);
        field5688[0] = 0.0F;
        field5688[1] = var4;
        field5688[2] = 0.0F;
        field5688[3] = (float) this.field4685.field568 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field5688, 0);
        if (this.field5687.field3684) {
            field5688[0] = 0.0F;
            field5688[1] = 0.0F;
            field5688[2] = 0.0F;
            field5688[3] = (float) this.field4685.field568 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field5688, 0);
        } else {
            int var7 = (int) ((float) this.field4685.field568 * var3 * 16.0F);
            this.field4685.method303(this.field5687.field3687[var7 % 16]);
        }
        this.field4685.method407(0);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lfu;Ls;)V")
    public class415(class42 arg0, class258 arg1) {
        super(arg0);
        this.field5687 = arg1;
        opengl var3 = arg0.field557;
        this.field5689 = new class461(arg0, 2);
        this.field5689.method2760(0);
        this.field4685.method407(1);
        if (this.field5687.field3684) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field4685.method407(0);
        this.field5689.method2762();
        this.field5689.method2760(1);
        this.field4685.method407(1);
        if (this.field5687.field3684) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field4685.method407(0);
        this.field5689.method2762();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ltp;)V")
    public final void method188(class375 arg0) {
        this.field4685.method303(arg0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public final void method192() {
        this.field5689.method2761('\u0001');
        this.field4685.method407(1);
        this.field4685.method303((class375) null);
        this.field4685.method407(0);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
    public final boolean method191() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public final void method190(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public final void method187(boolean arg0) {
        this.field5689.method2761('\u0000');
        if (this.field5687.field3684) {
            this.field4685.method407(1);
            this.field4685.method303(this.field5687.field3686);
            this.field4685.method407(0);
        }
    }
}
