import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class455 extends class30 {

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Lvq;")
    private class326 field6464;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lp;")
    private class173 field6462;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[F")
    private static float[] field6463 = new float[4];

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lnm;Lvq;)V", line = 3)
    public class455(class254 arg0, class326 arg1) {
        super(arg0);
        this.field6464 = arg1;
        opengl var3 = arg0.field3648;
        this.field6462 = new class173(arg0, 2);
        this.field6462.method1191(0);
        this.field405.method1634(1);
        if (this.field6464.field4880) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field405.method1634(0);
        this.field6462.method1193();
        this.field6462.method1191(1);
        this.field405.method1634(1);
        if (this.field6464.field4880) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field405.method1634(0);
        this.field6462.method1193();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lap;)V", line = 35)
    public final void method266(class26 arg0) {
        this.field405.method1653(arg0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 40)
    public final void method264(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field405.field3648;
        this.field405.method1634(1);
        if (var5) {
            field6463[0] = var4;
            field6463[1] = 0.0F;
            field6463[2] = 0.0F;
            field6463[3] = 0.0F;
        } else {
            field6463[0] = 0.0F;
            field6463[1] = 0.0F;
            field6463[2] = var4;
            field6463[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field6463, 0);
        field6463[0] = 0.0F;
        field6463[1] = var4;
        field6463[2] = 0.0F;
        field6463[3] = (float) this.field405.field3658 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field6463, 0);
        if (this.field6464.field4880) {
            field6463[0] = 0.0F;
            field6463[1] = 0.0F;
            field6463[2] = 0.0F;
            field6463[3] = (float) this.field405.field3658 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field6463, 0);
        } else {
            int var7 = (int) ((float) this.field405.field3658 * var3 * 16.0F);
            this.field405.method1653(this.field6464.field4878[var7 % 16]);
        }
        this.field405.method1634(0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 89)
    public final void method263(boolean arg0) {
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V", line = 93)
    public final void method265(boolean arg0) {
        this.field6462.method1192('\u0000');
        if (this.field6464.field4880) {
            this.field405.method1634(1);
            this.field405.method1653(this.field6464.field4877);
            this.field405.method1634(0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 103)
    public final void method261() {
        this.field6462.method1192('\u0001');
        this.field405.method1634(1);
        this.field405.method1653((class26) null);
        this.field405.method1634(0);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()Z", line = 109)
    public final boolean method262() {
        return true;
    }
}
