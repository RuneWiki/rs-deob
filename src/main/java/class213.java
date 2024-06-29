import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class213 extends class232 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lrl;")
    private class430 field2972;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lbb;")
    private class182 field2974;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[F")
    private static float[] field2973 = new float[4];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()Z")
    public final boolean method358() {
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lue;)V")
    public final void method356(class127 arg0) {
        this.field3348.method1559(arg0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public final void method357(boolean arg0) {
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
    public final void method354(boolean arg0) {
        this.field2974.method1193('\u0000');
        if (this.field2972.field6082) {
            this.field3348.method1566(1);
            this.field3348.method1559(this.field2972.field6081);
            this.field3348.method1566(0);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()V")
    public final void method352() {
        this.field2974.method1193('\u0001');
        this.field3348.method1566(1);
        this.field3348.method1559((class127) null);
        this.field3348.method1566(0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public final void method355(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field3348.field3184;
        this.field3348.method1566(1);
        if (var5) {
            field2973[0] = var4;
            field2973[1] = 0.0F;
            field2973[2] = 0.0F;
            field2973[3] = 0.0F;
        } else {
            field2973[0] = 0.0F;
            field2973[1] = 0.0F;
            field2973[2] = var4;
            field2973[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field2973, 0);
        field2973[0] = 0.0F;
        field2973[1] = var4;
        field2973[2] = 0.0F;
        field2973[3] = (float) this.field3348.field3204 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field2973, 0);
        if (this.field2972.field6082) {
            field2973[0] = 0.0F;
            field2973[1] = 0.0F;
            field2973[2] = 0.0F;
            field2973[3] = (float) this.field3348.field3204 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field2973, 0);
        } else {
            int var7 = (int) ((float) this.field3348.field3204 * var3 * 16.0F);
            this.field3348.method1559(this.field2972.field6085[var7 % 16]);
        }
        this.field3348.method1566(0);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ltb;Lrl;)V")
    public class213(class227 arg0, class430 arg1) {
        super(arg0);
        this.field2972 = arg1;
        opengl var3 = arg0.field3184;
        this.field2974 = new class182(arg0, 2);
        this.field2974.method1192(0);
        this.field3348.method1566(1);
        if (this.field2972.field6082) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field3348.method1566(0);
        this.field2974.method1191();
        this.field2974.method1192(1);
        this.field3348.method1566(1);
        if (this.field2972.field6082) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field3348.method1566(0);
        this.field2974.method1191();
    }
}
