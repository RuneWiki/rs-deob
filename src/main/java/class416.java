import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class416 extends class44 {

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lim;")
    private class342 field5968;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Leq;")
    private class115 field5966;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[F")
    private static float[] field5967 = new float[4];

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public final void method228(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field540.field1927;
        this.field540.method1001(1);
        if (var5) {
            field5967[0] = var4;
            field5967[1] = 0.0F;
            field5967[2] = 0.0F;
            field5967[3] = 0.0F;
        } else {
            field5967[0] = 0.0F;
            field5967[1] = 0.0F;
            field5967[2] = var4;
            field5967[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field5967, 0);
        field5967[0] = 0.0F;
        field5967[1] = var4;
        field5967[2] = 0.0F;
        field5967[3] = (float) this.field540.field1941 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field5967, 0);
        if (this.field5968.field4850) {
            field5967[0] = 0.0F;
            field5967[1] = 0.0F;
            field5967[2] = 0.0F;
            field5967[3] = (float) this.field540.field1941 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field5967, 0);
        } else {
            int var7 = (int) ((float) this.field540.field1941 * var3 * 16.0F);
            this.field540.method1003(this.field5968.field4853[var7 % 16]);
        }
        this.field540.method1001(0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()Z")
    public final boolean method232() {
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V")
    public final void method230(boolean arg0) {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public final void method227(boolean arg0) {
        this.field5966.method714('\u0000');
        if (this.field5968.field4850) {
            this.field540.method1001(1);
            this.field540.method1003(this.field5968.field4848);
            this.field540.method1001(0);
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lao;Lim;)V")
    public class416(class157 arg0, class342 arg1) {
        super(arg0);
        this.field5968 = arg1;
        opengl var3 = arg0.field1927;
        this.field5966 = new class115(arg0, 2);
        this.field5966.method716(0);
        this.field540.method1001(1);
        if (this.field5968.field4850) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field540.method1001(0);
        this.field5966.method715();
        this.field5966.method716(1);
        this.field540.method1001(1);
        if (this.field5968.field4850) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field540.method1001(0);
        this.field5966.method715();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Llp;)V")
    public final void method231(class220 arg0) {
        this.field540.method1003(arg0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
    public final void method229() {
        this.field5966.method714('\u0001');
        this.field540.method1001(1);
        this.field540.method1003((class220) null);
        this.field540.method1001(0);
    }
}
