import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class355 extends class457 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lle;")
    private class68 field5170;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lhd;")
    private class19 field5171;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[F")
    private static float[] field5169 = new float[4];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 4)
    public final void method60(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field6752.field2253;
        this.field6752.method1150(1);
        if (var5) {
            field5169[0] = var4;
            field5169[1] = 0.0F;
            field5169[2] = 0.0F;
            field5169[3] = 0.0F;
        } else {
            field5169[0] = 0.0F;
            field5169[1] = 0.0F;
            field5169[2] = var4;
            field5169[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field5169, 0);
        field5169[0] = 0.0F;
        field5169[1] = var4;
        field5169[2] = 0.0F;
        field5169[3] = (float) this.field6752.field2276 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field5169, 0);
        if (this.field5170.field904) {
            field5169[0] = 0.0F;
            field5169[1] = 0.0F;
            field5169[2] = 0.0F;
            field5169[3] = (float) this.field6752.field2276 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field5169, 0);
        } else {
            int var7 = (int) ((float) this.field6752.field2276 * var3 * 16.0F);
            this.field6752.method1160(this.field5170.field903[var7 % 16]);
        }
        this.field6752.method1150(0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lvo;)V", line = 55)
    public final void method63(class205 arg0) {
        this.field6752.method1160(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 58)
    public final void method62(boolean arg0) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()Z", line = 60)
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 65)
    public final void method61(boolean arg0) {
        this.field5171.method235('\u0000');
        if (this.field5170.field904) {
            this.field6752.method1150(1);
            this.field6752.method1160(this.field5170.field902);
            this.field6752.method1150(0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 78)
    public final void method64() {
        this.field5171.method235('\u0001');
        this.field6752.method1150(1);
        this.field6752.method1160((class205) null);
        this.field6752.method1150(0);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lks;Lle;)V", line = 85)
    public class355(class173 arg0, class68 arg1) {
        super(arg0);
        this.field5170 = arg1;
        opengl var3 = arg0.field2253;
        this.field5171 = new class19(arg0, 2);
        this.field5171.method233(0);
        this.field6752.method1150(1);
        if (this.field5170.field904) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field6752.method1150(0);
        this.field5171.method234();
        this.field5171.method233(1);
        this.field6752.method1150(1);
        if (this.field5170.field904) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field6752.method1150(0);
        this.field5171.method234();
    }
}
