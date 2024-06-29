import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class489 extends class189 {

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "Lfs;")
    private class359 field6819;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lrj;")
    private class388 field6817;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "[F")
    private static float[] field6818 = new float[4];

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method490(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field2580.field4604;
        this.field2580.method2067(1);
        if (var5) {
            field6818[0] = var4;
            field6818[1] = 0.0F;
            field6818[2] = 0.0F;
            field6818[3] = 0.0F;
        } else {
            field6818[0] = 0.0F;
            field6818[1] = 0.0F;
            field6818[2] = var4;
            field6818[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field6818, 0);
        field6818[0] = 0.0F;
        field6818[1] = var4;
        field6818[2] = 0.0F;
        field6818[3] = (float) this.field2580.field4625 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field6818, 0);
        if (this.field6819.field4965) {
            field6818[0] = 0.0F;
            field6818[1] = 0.0F;
            field6818[2] = 0.0F;
            field6818[3] = (float) this.field2580.field4625 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field6818, 0);
        } else {
            int var7 = (int) ((float) this.field2580.field4625 * var3 * 16.0F);
            this.field2580.method2106(this.field6819.field4963[var7 % 16]);
        }
        this.field2580.method2067(0);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()V")
    public final void method491() {
        this.field6817.method2381('\u0001');
        this.field2580.method2067(1);
        this.field2580.method2106((class386) null);
        this.field2580.method2067(0);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        this.field6817.method2381('\u0000');
        if (this.field6819.field4965) {
            this.field2580.method2067(1);
            this.field2580.method2106(this.field6819.field4960);
            this.field2580.method2067(0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()Z")
    public final boolean method487() {
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lbf;Lfs;)V")
    public class489(class344 arg0, class359 arg1) {
        super(arg0);
        this.field6819 = arg1;
        opengl var3 = arg0.field4604;
        this.field6817 = new class388(arg0, 2);
        this.field6817.method2383(0);
        this.field2580.method2067(1);
        if (this.field6819.field4965) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field2580.method2067(0);
        this.field6817.method2382();
        this.field6817.method2383(1);
        this.field2580.method2067(1);
        if (this.field6819.field4965) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field2580.method2067(0);
        this.field6817.method2382();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkq;)V")
    public final void method492(class386 arg0) {
        this.field2580.method2106(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
    }
}
