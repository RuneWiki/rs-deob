import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class424 extends class232 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lrl;")
    private class430 field5987;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lfl;")
    private class441 field5990;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[F")
    private static float[] field5989 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lbb;")
    private class182 field5988;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V", line = 4)
    public final void method354(boolean arg0) {
        opengl var2 = this.field3348.field3184;
        if (this.field3348.field3227 > 0) {
            float var3 = -0.5F / (float) this.field3348.field3227;
            this.field3348.method1566(1);
            field5989[0] = 0.0F;
            field5989[1] = 0.0F;
            field5989[2] = var3;
            field5989[3] = this.field3348.field3287 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field5989, 0);
            var2.glPopMatrix();
            this.field3348.method1526(0.5F, (float) this.field3348.field3227);
            this.field3348.method1559(this.field5990);
            this.field3348.method1566(0);
        }
        this.field5988.method1193('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V", line = 31)
    private final void method2685() {
        opengl var1 = this.field3348.field3184;
        this.field5988 = new class182(this.field3348, 2);
        this.field5988.method1192(0);
        this.field3348.method1566(1);
        this.field3348.method1542(7681, 260);
        this.field3348.method1512(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field3348.method1566(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5987.field6082) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field5988.method1191();
        this.field5988.method1192(1);
        this.field3348.method1566(1);
        this.field3348.method1542(8448, 8448);
        this.field3348.method1512(0, 5890, 768);
        var1.glDisable(3168);
        this.field3348.method1566(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5987.field6082) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field5988.method1191();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()Z", line = 67)
    public final boolean method358() {
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lue;)V", line = 70)
    public final void method356(class127 arg0) {
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ltb;Lrl;)V", line = 72)
    public class424(class227 arg0, class430 arg1) {
        super(arg0);
        this.field5987 = arg1;
        this.method2685();
        this.field5990 = new class441(this.field3348, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5990.method2762(10242, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 79)
    public final void method355(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field5987.field6082) {
                this.field3348.method1559(this.field5987.field6079);
                field5989[0] = 0.0F;
                field5989[1] = 0.0F;
                field5989[2] = 0.0F;
                field5989[3] = (float) (this.field3348.field3204 % 4000) / 4000.0F;
                this.field3348.field3184.glTexGenfv(8194, 9473, field5989, 0);
            } else {
                int var2 = this.field3348.field3204 % 4000 * 16 / 4000;
                this.field3348.method1559(this.field5987.field6080[var2]);
            }
        } else if (this.field5987.field6082) {
            this.field3348.method1559(this.field5987.field6079);
            field5989[0] = 0.0F;
            field5989[1] = 0.0F;
            field5989[2] = 0.0F;
            field5989[3] = 0.0F;
            this.field3348.field3184.glTexGenfv(8194, 9473, field5989, 0);
        } else {
            this.field3348.method1559(this.field5987.field6080[0]);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 118)
    public final void method357(boolean arg0) {
        this.field3348.method1542(260, 8448);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 122)
    public final void method352() {
        opengl var1 = this.field3348.field3184;
        this.field5988.method1193('\u0001');
        if (this.field3348.field3227 > 0) {
            this.field3348.method1566(1);
            this.field3348.method1559((class127) null);
            this.field3348.method1526(1.0F, 0.0F);
            this.field3348.method1566(0);
        }
        this.field3348.method1542(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }
}
