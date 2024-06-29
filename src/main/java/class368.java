import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class368 extends class150 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lco;")
    private class149 field5229;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lt;")
    private class391 field5227;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[F")
    private static float[] field5228 = new float[4];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3(boolean arg0) {
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()Z", line = 6)
    public final boolean method7() {
        return true;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 11)
    public final void method1(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field2107.field6330;
        this.field2107.method2660(1);
        if (var5) {
            field5228[0] = var4;
            field5228[1] = 0.0F;
            field5228[2] = 0.0F;
            field5228[3] = 0.0F;
        } else {
            field5228[0] = 0.0F;
            field5228[1] = 0.0F;
            field5228[2] = var4;
            field5228[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field5228, 0);
        field5228[0] = 0.0F;
        field5228[1] = var4;
        field5228[2] = 0.0F;
        field5228[3] = (float) this.field2107.field6342 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field5228, 0);
        if (this.field5229.field2106) {
            field5228[0] = 0.0F;
            field5228[1] = 0.0F;
            field5228[2] = 0.0F;
            field5228[3] = (float) this.field2107.field6342 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field5228, 0);
        } else {
            int var7 = (int) ((float) this.field2107.field6342 * var3 * 16.0F);
            this.field2107.method2692(this.field5229.field2103[var7 % 16]);
        }
        this.field2107.method2660(0);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V", line = 60)
    public final void method2() {
        this.field5227.method2339('\u0001');
        this.field2107.method2660(1);
        this.field2107.method2692((class179) null);
        this.field2107.method2660(0);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lqi;Lco;)V", line = 66)
    public class368(class458 arg0, class149 arg1) {
        super(arg0);
        this.field5229 = arg1;
        opengl var3 = arg0.field6330;
        this.field5227 = new class391(arg0, 2);
        this.field5227.method2338(0);
        this.field2107.method2660(1);
        if (this.field5229.field2106) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field2107.method2660(0);
        this.field5227.method2340();
        this.field5227.method2338(1);
        this.field2107.method2660(1);
        if (this.field5229.field2106) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field2107.method2660(0);
        this.field5227.method2340();
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V", line = 96)
    public final void method5(boolean arg0) {
        this.field5227.method2339('\u0000');
        if (this.field5229.field2106) {
            this.field2107.method2660(1);
            this.field2107.method2692(this.field5229.field2102);
            this.field2107.method2660(0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Let;)V", line = 111)
    public final void method6(class179 arg0) {
        this.field2107.method2692(arg0);
    }
}
