import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class89 extends class42 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lfg;")
    private class66 field1160;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Loc;")
    private class112 field1161;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[F")
    private static float[] field1159 = new float[4];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public final void method290(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field582.field1918;
        this.field582.method1002(1);
        if (var5) {
            field1159[0] = var4;
            field1159[1] = 0.0F;
            field1159[2] = 0.0F;
            field1159[3] = 0.0F;
        } else {
            field1159[0] = 0.0F;
            field1159[1] = 0.0F;
            field1159[2] = var4;
            field1159[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field1159, 0);
        field1159[0] = 0.0F;
        field1159[1] = var4;
        field1159[2] = 0.0F;
        field1159[3] = (float) this.field582.field1930 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field1159, 0);
        if (this.field1160.field895) {
            field1159[0] = 0.0F;
            field1159[1] = 0.0F;
            field1159[2] = 0.0F;
            field1159[3] = (float) this.field582.field1930 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field1159, 0);
        } else {
            int var7 = (int) ((float) this.field582.field1930 * var3 * 16.0F);
            this.field582.method888(this.field1160.field894[var7 % 16]);
        }
        this.field582.method1002(0);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lig;Lfg;)V")
    public class89(class132 arg0, class66 arg1) {
        super(arg0);
        this.field1160 = arg1;
        opengl var3 = arg0.field1918;
        this.field1161 = new class112(arg0, 2);
        this.field1161.method678(0);
        this.field582.method1002(1);
        if (this.field1160.field895) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field582.method1002(0);
        this.field1161.method679();
        this.field1161.method678(1);
        this.field582.method1002(1);
        if (this.field1160.field895) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field582.method1002(0);
        this.field1161.method679();
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        this.field1161.method677('\u0000');
        if (this.field1160.field895) {
            this.field582.method1002(1);
            this.field582.method888(this.field1160.field898);
            this.field582.method1002(0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()Z")
    public final boolean method287() {
        return true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lee;)V")
    public final void method286(class404 arg0) {
        this.field582.method888(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
    public final void method291() {
        this.field1161.method677('\u0001');
        this.field582.method1002(1);
        this.field582.method888((class404) null);
        this.field582.method1002(0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public final void method288(boolean arg0) {
    }
}
