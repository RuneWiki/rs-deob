import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class196 extends class30 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lvq;")
    private class326 field2958;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lwq;")
    private class264 field2957;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[F")
    private static float[] field2956 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lp;")
    private class173 field2959;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lnm;Lvq;)V", line = 5)
    public class196(class254 arg0, class326 arg1) {
        super(arg0);
        this.field2958 = arg1;
        this.method1338();
        this.field2957 = new class264(this.field405, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2957.method1735((byte) -77, false);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V", line = 18)
    public final void method265(boolean arg0) {
        opengl var2 = this.field405.field3648;
        if (this.field405.field3696 > 0) {
            float var3 = -0.5F / (float) this.field405.field3696;
            this.field405.method1634(1);
            field2956[0] = 0.0F;
            field2956[1] = 0.0F;
            field2956[2] = var3;
            field2956[3] = this.field405.field3721 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field2956, 0);
            var2.glPopMatrix();
            this.field405.method1681(0.5F, (float) this.field405.field3696);
            this.field405.method1653(this.field2957);
            this.field405.method1634(0);
        }
        this.field2959.method1192('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 44)
    public final void method263(boolean arg0) {
        this.field405.method1679(260, 8448);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 47)
    public final void method264(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field2958.field4880) {
                this.field405.method1653(this.field2958.field4883);
                field2956[0] = 0.0F;
                field2956[1] = 0.0F;
                field2956[2] = 0.0F;
                field2956[3] = (float) (this.field405.field3658 % 4000) / 4000.0F;
                this.field405.field3648.glTexGenfv(8194, 9473, field2956, 0);
            } else {
                int var2 = this.field405.field3658 % 4000 * 16 / 4000;
                this.field405.method1653(this.field2958.field4879[var2]);
            }
        } else if (this.field2958.field4880) {
            this.field405.method1653(this.field2958.field4883);
            field2956[0] = 0.0F;
            field2956[1] = 0.0F;
            field2956[2] = 0.0F;
            field2956[3] = 0.0F;
            this.field405.field3648.glTexGenfv(8194, 9473, field2956, 0);
        } else {
            this.field405.method1653(this.field2958.field4879[0]);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lap;)V", line = 84)
    public final void method266(class26 arg0) {
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()V", line = 87)
    public final void method261() {
        opengl var1 = this.field405.field3648;
        this.field2959.method1192('\u0001');
        if (this.field405.field3696 > 0) {
            this.field405.method1634(1);
            this.field405.method1653((class26) null);
            this.field405.method1681(1.0F, 0.0F);
            this.field405.method1634(0);
        }
        this.field405.method1679(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()V", line = 104)
    private final void method1338() {
        opengl var1 = this.field405.field3648;
        this.field2959 = new class173(this.field405, 2);
        this.field2959.method1191(0);
        this.field405.method1634(1);
        this.field405.method1679(7681, 260);
        this.field405.method1621(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field405.method1634(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field2958.field4880) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field2959.method1193();
        this.field2959.method1191(1);
        this.field405.method1634(1);
        this.field405.method1679(8448, 8448);
        this.field405.method1621(0, 5890, 768);
        var1.glDisable(3168);
        this.field405.method1634(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field2958.field4880) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field2959.method1193();
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()Z", line = 142)
    public final boolean method262() {
        return true;
    }
}
