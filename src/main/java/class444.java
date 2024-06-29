import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class444 extends class157 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lcf;")
    private class142 field6394;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lq;")
    private class205 field6395;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[F")
    private static float[] field6393 = new float[4];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public final void method553(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field2366.field198;
        this.field2366.method176(1);
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
        field6393[3] = (float) this.field2366.field210 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field6393, 0);
        if (this.field6394.field2144) {
            field6393[0] = 0.0F;
            field6393[1] = 0.0F;
            field6393[2] = 0.0F;
            field6393[3] = (float) this.field2366.field210 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field6393, 0);
        } else {
            int var7 = (int) ((float) this.field2366.field210 * var3 * 16.0F);
            this.field2366.method207(this.field6394.field2145[var7 % 16]);
        }
        this.field2366.method176(0);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
    public final void method552() {
        this.field6395.method1427('\u0001');
        this.field2366.method176(1);
        this.field2366.method207((class4) null);
        this.field2366.method176(0);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        this.field6395.method1427('\u0000');
        if (this.field6394.field2144) {
            this.field2366.method176(1);
            this.field2366.method207(this.field6394.field2149);
            this.field2366.method176(0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lhd;Lcf;)V")
    public class444(class17 arg0, class142 arg1) {
        super(arg0);
        this.field6394 = arg1;
        opengl var3 = arg0.field198;
        this.field6395 = new class205(arg0, 2);
        this.field6395.method1426(0);
        this.field2366.method176(1);
        if (this.field6394.field2144) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field2366.method176(0);
        this.field6395.method1425();
        this.field6395.method1426(1);
        this.field2366.method176(1);
        if (this.field6394.field2144) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field2366.method176(0);
        this.field6395.method1425();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvd;)V")
    public final void method557(class4 arg0) {
        this.field2366.method207(arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()Z")
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public final void method556(boolean arg0) {
    }
}
