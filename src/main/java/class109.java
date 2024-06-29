import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class109 extends class404 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lsh;")
    private class435 field1302;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ltp;")
    private class124 field1303;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[F")
    private static float[] field1304 = new float[4];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public final void method348(boolean arg0) {
        this.field1303.method809('\u0000');
        if (this.field1302.field5947) {
            this.field5606.method2115(1);
            this.field5606.method2088(this.field1302.field5951);
            this.field5606.method2115(0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lh;Lsh;)V")
    public class109(class327 arg0, class435 arg1) {
        super(arg0);
        this.field1302 = arg1;
        opengl var3 = arg0.field4363;
        this.field1303 = new class124(arg0, 2);
        this.field1303.method808(0);
        this.field5606.method2115(1);
        if (this.field1302.field5947) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field5606.method2115(0);
        this.field1303.method807();
        this.field1303.method808(1);
        this.field5606.method2115(1);
        if (this.field1302.field5947) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field5606.method2115(0);
        this.field1303.method807();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsd;)V")
    public final void method353(class233 arg0) {
        this.field5606.method2088(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method351(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field5606.field4363;
        this.field5606.method2115(1);
        if (var5) {
            field1304[0] = var4;
            field1304[1] = 0.0F;
            field1304[2] = 0.0F;
            field1304[3] = 0.0F;
        } else {
            field1304[0] = 0.0F;
            field1304[1] = 0.0F;
            field1304[2] = var4;
            field1304[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field1304, 0);
        field1304[0] = 0.0F;
        field1304[1] = var4;
        field1304[2] = 0.0F;
        field1304[3] = (float) this.field5606.field4373 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field1304, 0);
        if (this.field1302.field5947) {
            field1304[0] = 0.0F;
            field1304[1] = 0.0F;
            field1304[2] = 0.0F;
            field1304[3] = (float) this.field5606.field4373 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field1304, 0);
        } else {
            int var7 = (int) ((float) this.field5606.field4373 * var3 * 16.0F);
            this.field5606.method2088(this.field1302.field5949[var7 % 16]);
        }
        this.field5606.method2115(0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()Z")
    public final boolean method350() {
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
    public final void method352() {
        this.field1303.method809('\u0001');
        this.field5606.method2115(1);
        this.field5606.method2088((class233) null);
        this.field5606.method2115(0);
    }
}
