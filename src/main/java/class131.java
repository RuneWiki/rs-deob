import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class131 extends class399 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lde;")
    private class312 field1805;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lel;")
    private class325 field1807;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[F")
    private static float[] field1806 = new float[4];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()Z")
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfl;)V")
    public final void method376(class439 arg0) {
        this.field5798.method2085(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method377(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field5798.field4752;
        this.field5798.method2062(1);
        if (var5) {
            field1806[0] = var4;
            field1806[1] = 0.0F;
            field1806[2] = 0.0F;
            field1806[3] = 0.0F;
        } else {
            field1806[0] = 0.0F;
            field1806[1] = 0.0F;
            field1806[2] = var4;
            field1806[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field1806, 0);
        field1806[0] = 0.0F;
        field1806[1] = var4;
        field1806[2] = 0.0F;
        field1806[3] = (float) this.field5798.field4758 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field1806, 0);
        if (this.field1805.field4459) {
            field1806[0] = 0.0F;
            field1806[1] = 0.0F;
            field1806[2] = 0.0F;
            field1806[3] = (float) this.field5798.field4758 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field1806, 0);
        } else {
            int var7 = (int) ((float) this.field5798.field4758 * var3 * 16.0F);
            this.field5798.method2085(this.field1805.field4460[var7 % 16]);
        }
        this.field5798.method2062(0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public final void method379() {
        this.field1807.method2003('\u0001');
        this.field5798.method2062(1);
        this.field5798.method2085((class439) null);
        this.field5798.method2062(0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public final void method378(boolean arg0) {
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)V")
    public final void method374(boolean arg0) {
        this.field1807.method2003('\u0000');
        if (this.field1805.field4459) {
            this.field5798.method2062(1);
            this.field5798.method2085(this.field1805.field4457);
            this.field5798.method2062(0);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lpo;Lde;)V")
    public class131(class332 arg0, class312 arg1) {
        super(arg0);
        this.field1805 = arg1;
        opengl var3 = arg0.field4752;
        this.field1807 = new class325(arg0, 2);
        this.field1807.method2005(0);
        this.field5798.method2062(1);
        if (this.field1805.field4459) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field5798.method2062(0);
        this.field1807.method2004();
        this.field1807.method2005(1);
        this.field5798.method2062(1);
        if (this.field1805.field4459) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field5798.method2062(0);
        this.field1807.method2004();
    }
}
