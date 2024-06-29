import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class109 extends class48 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lbk;")
    private class210 field1521;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lkm;")
    private class197 field1522;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[F")
    private static float[] field1520 = new float[4];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 3)
    public final void method303(boolean arg0) {
        this.field1522.method1380('\u0000');
        if (this.field1521.field3372) {
            this.field591.method628(1);
            this.field591.method688(this.field1521.field3367);
            this.field591.method628(0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lsq;Lbk;)V", line = 13)
    public class109(class96 arg0, class210 arg1) {
        super(arg0);
        this.field1521 = arg1;
        opengl var3 = arg0.field1156;
        this.field1522 = new class197(arg0, 2);
        this.field1522.method1382(0);
        this.field591.method628(1);
        if (this.field1521.field3372) {
            var3.glTexGeni(8194, 9472, 9217);
            var3.glEnable(3170);
        }
        var3.glTexGeni(8192, 9472, 9216);
        var3.glTexGeni(8193, 9472, 9216);
        var3.glEnable(3168);
        var3.glEnable(3169);
        this.field591.method628(0);
        this.field1522.method1381();
        this.field1522.method1382(1);
        this.field591.method628(1);
        if (this.field1521.field3372) {
            var3.glDisable(3170);
        }
        var3.glDisable(3168);
        var3.glDisable(3169);
        this.field591.method628(0);
        this.field1522.method1381();
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V", line = 43)
    public final void method305() {
        this.field1522.method1380('\u0001');
        this.field591.method628(1);
        this.field591.method688((class293) null);
        this.field591.method628(0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()Z", line = 50)
    public final boolean method304() {
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lod;)V", line = 56)
    public final void method308(class293 arg0) {
        this.field591.method688(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 60)
    public final void method306(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        opengl var6 = this.field591.field1156;
        this.field591.method628(1);
        if (var5) {
            field1520[0] = var4;
            field1520[1] = 0.0F;
            field1520[2] = 0.0F;
            field1520[3] = 0.0F;
        } else {
            field1520[0] = 0.0F;
            field1520[1] = 0.0F;
            field1520[2] = var4;
            field1520[3] = 0.0F;
        }
        var6.glTexGenfv(8192, 9474, field1520, 0);
        field1520[0] = 0.0F;
        field1520[1] = var4;
        field1520[2] = 0.0F;
        field1520[3] = (float) this.field591.field1173 * var2 % 1.0F;
        var6.glTexGenfv(8193, 9474, field1520, 0);
        if (this.field1521.field3372) {
            field1520[0] = 0.0F;
            field1520[1] = 0.0F;
            field1520[2] = 0.0F;
            field1520[3] = (float) this.field591.field1173 * var3 % 1.0F;
            var6.glTexGenfv(8194, 9473, field1520, 0);
        } else {
            int var7 = (int) ((float) this.field591.field1173 * var3 * 16.0F);
            this.field591.method688(this.field1521.field3370[var7 % 16]);
        }
        this.field591.method628(0);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V", line = 112)
    public final void method307(boolean arg0) {
    }
}
