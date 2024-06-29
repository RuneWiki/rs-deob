import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class440 extends class300 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lmk;")
    private class154 field6391;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lfr;")
    private class101 field6392;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[F")
    private static float[] field6393 = new float[4];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lmo;)V")
    public final void method9(class195 arg0) {
        this.field4409.method929(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lge;Lmk;)V")
    public class440(class104 arg0, class154 arg1) {
        super(arg0);
        this.field6391 = arg1;
        opengl var3 = arg0.field1604;
        this.field6392 = new class101(arg0, 2);
        this.field6392.method835(0);
        this.field4409.method857(1);
        if (this.field6391.field2351) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field4409.method857(0);
        this.field6392.method834();
        this.field6392.method835(1);
        this.field4409.method857(1);
        if (this.field6391.field2351) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field4409.method857(0);
        this.field6392.method834();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
    public final void method5() {
        this.field6392.method836('\u0001');
        this.field4409.method857(1);
        this.field4409.method929((class195) null);
        this.field4409.method857(0);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field4409.field1604;
        this.field4409.method857(1);
        if (var5) {
            field6393[0] = var4;
            field6393[1] = 0.0F;
            field6393[2] = 0.0F;
            field6393[3] = 0.0F;
        } else {
            field6393[0] = 0.0F;
            field6393[1] = 0.0F;
            field6393[2] = var4;
            field6393[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field6393, 0);
        field6393[0] = 0.0F;
        field6393[1] = var4;
        field6393[2] = 0.0F;
        field6393[3] = (float) this.field4409.field1614 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field6393, 0);
        if (this.field6391.field2351) {
            field6393[0] = 0.0F;
            field6393[1] = 0.0F;
            field6393[2] = 0.0F;
            field6393[3] = (float) this.field4409.field1614 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field6393, 0);
        } else {
            int var7 = (int) ((float) this.field4409.field1614 * var3 * 16.0F);
            this.field4409.method929(this.field6391.field2354[var7 % 16]);
        }
        this.field4409.method857(0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public final void method6(boolean arg0) {
        this.field6392.method836('\u0000');
        if (this.field6391.field2351) {
            this.field4409.method857(1);
            this.field4409.method929(this.field6391.field2350);
            this.field4409.method857(0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()Z")
    public final boolean method4() {
        return true;
    }
}
