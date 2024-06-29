import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class461 extends class139 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lc;")
    private class448 field6806;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lcq;")
    private class73 field6805;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[F")
    private static float[] field6807 = new float[4];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
    public final void method59(boolean arg0) {
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field1876.field5783;
        this.field1876.method2452(1);
        if (var5) {
            field6807[0] = var4;
            field6807[1] = 0.0F;
            field6807[2] = 0.0F;
            field6807[3] = 0.0F;
        } else {
            field6807[0] = 0.0F;
            field6807[1] = 0.0F;
            field6807[2] = var4;
            field6807[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field6807, 0);
        field6807[0] = 0.0F;
        field6807[1] = var4;
        field6807[2] = 0.0F;
        field6807[3] = (float) this.field1876.field5794 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field6807, 0);
        if (this.field6806.field6596) {
            field6807[0] = 0.0F;
            field6807[1] = 0.0F;
            field6807[2] = 0.0F;
            field6807[3] = (float) this.field1876.field5794 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field6807, 0);
        } else {
            int var7 = (int) ((float) this.field1876.field5794 * var3 * 16.0F);
            this.field1876.method2460(this.field6806.field6592[var7 % 16]);
        }
        this.field1876.method2452(0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lq;)V")
    public final void method56(class325 arg0) {
        this.field1876.method2460(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public final void method58() {
        this.field6805.method483('\u0001');
        this.field1876.method2452(1);
        this.field1876.method2460((class325) null);
        this.field1876.method2452(0);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lcg;Lc;)V")
    public class461(class393 arg0, class448 arg1) {
        super(arg0);
        this.field6806 = arg1;
        opengl var3 = arg0.field5783;
        this.field6805 = new class73(arg0, 2);
        this.field6805.method482(0);
        this.field1876.method2452(1);
        if (this.field6806.field6596) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field1876.method2452(0);
        this.field6805.method484();
        this.field6805.method482(1);
        this.field1876.method2452(1);
        if (this.field6806.field6596) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field1876.method2452(0);
        this.field6805.method484();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        this.field6805.method483('\u0000');
        if (this.field6806.field6596) {
            this.field1876.method2452(1);
            this.field1876.method2460(this.field6806.field6595);
            this.field1876.method2452(0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()Z")
    public final boolean method60() {
        return true;
    }
}
