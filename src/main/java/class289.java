import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class289 extends class114 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Lgk;")
    private class256 field3928;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lhi;")
    private class355 field3929;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[F")
    private static float[] field3927 = new float[4];

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()Z")
    public final boolean method309() {
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lmm;Lgk;)V")
    public class289(class357 arg0, class256 arg1) {
        super(arg0);
        this.field3928 = arg1;
        opengl var3 = arg0.field4794;
        this.field3929 = new class355(arg0, 2);
        this.field3929.method2130(0);
        this.field1748.method2196(1);
        if (this.field3928.field3564) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field1748.method2196(0);
        this.field3929.method2131();
        this.field3929.method2130(1);
        this.field1748.method2196(1);
        if (this.field3928.field3564) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field1748.method2196(0);
        this.field3929.method2131();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method308(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field1748.field4794;
        this.field1748.method2196(1);
        if (var5) {
            field3927[0] = var4;
            field3927[1] = 0.0F;
            field3927[2] = 0.0F;
            field3927[3] = 0.0F;
        } else {
            field3927[0] = 0.0F;
            field3927[1] = 0.0F;
            field3927[2] = var4;
            field3927[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field3927, 0);
        field3927[0] = 0.0F;
        field3927[1] = var4;
        field3927[2] = 0.0F;
        field3927[3] = (float) this.field1748.field4817 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field3927, 0);
        if (this.field3928.field3564) {
            field3927[0] = 0.0F;
            field3927[1] = 0.0F;
            field3927[2] = 0.0F;
            field3927[3] = (float) this.field1748.field4817 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field3927, 0);
        } else {
            int var7 = (int) ((float) this.field1748.field4817 * var3 * 16.0F);
            this.field1748.method2180(this.field3928.field3566[var7 % 16]);
        }
        this.field1748.method2196(0);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
    public final void method303(boolean arg0) {
        this.field3929.method2132('\u0000');
        if (this.field3928.field3564) {
            this.field1748.method2196(1);
            this.field1748.method2180(this.field3928.field3563);
            this.field1748.method2196(0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()V")
    public final void method306() {
        this.field3929.method2132('\u0001');
        this.field1748.method2196(1);
        this.field1748.method2180((class321) null);
        this.field1748.method2196(0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public final void method304(boolean arg0) {
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lt;)V")
    public final void method307(class321 arg0) {
        this.field1748.method2180(arg0);
    }
}
