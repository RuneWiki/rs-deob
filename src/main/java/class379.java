import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class379 extends class331 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lmb;")
    private class158 field5437;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lma;")
    private class10 field5438;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[F")
    private static float[] field5439 = new float[4];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field4787.field4445;
        this.field4787.method1972(1);
        if (var5) {
            field5439[0] = var4;
            field5439[1] = 0.0F;
            field5439[2] = 0.0F;
            field5439[3] = 0.0F;
        } else {
            field5439[0] = 0.0F;
            field5439[1] = 0.0F;
            field5439[2] = var4;
            field5439[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field5439, 0);
        field5439[0] = 0.0F;
        field5439[1] = var4;
        field5439[2] = 0.0F;
        field5439[3] = (float) this.field4787.field4458 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field5439, 0);
        if (this.field5437.field2356) {
            field5439[0] = 0.0F;
            field5439[1] = 0.0F;
            field5439[2] = 0.0F;
            field5439[3] = (float) this.field4787.field4458 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field5439, 0);
        } else {
            int var7 = (int) ((float) this.field4787.field4458 * var3 * 16.0F);
            this.field4787.method1967(this.field5437.field2355[var7 % 16]);
        }
        this.field4787.method1972(0);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
    public final void method813(boolean arg0) {
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        this.field5438.method37('\u0000');
        if (this.field5437.field2356) {
            this.field4787.method1972(1);
            this.field4787.method1967(this.field5437.field2352);
            this.field4787.method1972(0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()Z")
    public final boolean method812() {
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lmi;Lmb;)V")
    public class379(class315 arg0, class158 arg1) {
        super(arg0);
        this.field5437 = arg1;
        opengl var3 = arg0.field4445;
        this.field5438 = new class10(arg0, 2);
        this.field5438.method39(0);
        this.field4787.method1972(1);
        if (this.field5437.field2356) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field4787.method1972(0);
        this.field5438.method38();
        this.field5438.method39(1);
        this.field4787.method1972(1);
        if (this.field5437.field2356) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field4787.method1972(0);
        this.field5438.method38();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lbl;)V")
    public final void method817(class425 arg0) {
        this.field4787.method1967(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V")
    public final void method816() {
        this.field5438.method37('\u0001');
        this.field4787.method1972(1);
        this.field4787.method1967((class425) null);
        this.field4787.method1972(0);
    }
}
