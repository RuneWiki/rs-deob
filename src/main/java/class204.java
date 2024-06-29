import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class204 extends class48 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lbk;")
    private class210 field3281;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lfh;")
    private class389 field3280;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[F")
    private static float[] field3279 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lkm;")
    private class197 field3282;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 3)
    public final void method306(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field3281.field3372) {
                this.field591.method688(this.field3281.field3369);
                field3279[0] = 0.0F;
                field3279[1] = 0.0F;
                field3279[2] = 0.0F;
                field3279[3] = (float) (this.field591.field1173 % 4000) / 4000.0F;
                this.field591.field1156.glTexGenfv(8194, 9473, field3279, 0);
            } else {
                int var2 = this.field591.field1173 % 4000 * 16 / 4000;
                this.field591.method688(this.field3281.field3371[var2]);
            }
        } else if (this.field3281.field3372) {
            this.field591.method688(this.field3281.field3369);
            field3279[0] = 0.0F;
            field3279[1] = 0.0F;
            field3279[2] = 0.0F;
            field3279[3] = 0.0F;
            this.field591.field1156.glTexGenfv(8194, 9473, field3279, 0);
        } else {
            this.field591.method688(this.field3281.field3371[0]);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V", line = 44)
    public final void method305() {
        opengl var1 = this.field591.field1156;
        this.field3282.method1380('\u0001');
        if (this.field591.field1209 > 0) {
            this.field591.method628(1);
            this.field591.method688((class293) null);
            this.field591.method598(1.0F, 0.0F);
            this.field591.method628(0);
        }
        this.field591.method680(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V", line = 60)
    public final void method307(boolean arg0) {
        this.field591.method680(260, 8448);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V", line = 65)
    private final void method1450() {
        opengl var1 = this.field591.field1156;
        this.field3282 = new class197(this.field591, 2);
        this.field3282.method1382(0);
        this.field591.method628(1);
        this.field591.method680(7681, 260);
        this.field591.method712(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field591.method628(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3281.field3372) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field3282.method1381();
        this.field3282.method1382(1);
        this.field591.method628(1);
        this.field591.method680(8448, 8448);
        this.field591.method712(0, 5890, 768);
        var1.glDisable(3168);
        this.field591.method628(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3281.field3372) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field3282.method1381();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lod;)V", line = 101)
    public final void method308(class293 arg0) {
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 104)
    public final void method303(boolean arg0) {
        opengl var2 = this.field591.field1156;
        if (this.field591.field1209 > 0) {
            float var3 = -0.5F / (float) this.field591.field1209;
            this.field591.method628(1);
            field3279[0] = 0.0F;
            field3279[1] = 0.0F;
            field3279[2] = var3;
            field3279[3] = this.field591.field1279 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field3279, 0);
            var2.glPopMatrix();
            this.field591.method598(0.5F, (float) this.field591.field1209);
            this.field591.method688(this.field3280);
            this.field591.method628(0);
        }
        this.field3282.method1380('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lsq;Lbk;)V", line = 131)
    public class204(class96 arg0, class210 arg1) {
        super(arg0);
        this.field3281 = arg1;
        this.method1450();
        this.field3280 = new class389(this.field591, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3280.method2460(false, 10242);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()Z", line = 142)
    public final boolean method304() {
        return true;
    }
}
