import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class354 extends class150 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Lco;")
    private class149 field4931;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lap;")
    private class170 field4930;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[F")
    private static float[] field4929 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lt;")
    private class391 field4932;

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lqi;Lco;)V", line = 4)
    public class354(class458 arg0, class149 arg1) {
        super(arg0);
        this.field4931 = arg1;
        this.method2131();
        this.field4930 = new class170(this.field2107, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4930.method1049(-31478, false);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()Z", line = 11)
    public final boolean method7() {
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 18)
    public final void method3(boolean arg0) {
        this.field2107.method2702(260, 8448);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V", line = 22)
    private final void method2131() {
        opengl var1 = this.field2107.field6330;
        this.field4932 = new class391(this.field2107, 2);
        this.field4932.method2338(0);
        this.field2107.method2660(1);
        this.field2107.method2702(7681, 260);
        this.field2107.method2670(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field2107.method2660(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4931.field2106) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field4932.method2340();
        this.field4932.method2338(1);
        this.field2107.method2660(1);
        this.field2107.method2702(8448, 8448);
        this.field2107.method2670(0, 5890, 768);
        var1.glDisable(3168);
        this.field2107.method2660(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4931.field2106) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field4932.method2340();
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V", line = 59)
    public final void method5(boolean arg0) {
        opengl var2 = this.field2107.field6330;
        if (this.field2107.field6449 > 0) {
            float var3 = -0.5F / (float) this.field2107.field6449;
            this.field2107.method2660(1);
            field4929[0] = 0.0F;
            field4929[1] = 0.0F;
            field4929[2] = var3;
            field4929[3] = this.field2107.field6407 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field4929, 0);
            var2.glPopMatrix();
            this.field2107.method2666(0.5F, (float) this.field2107.field6449);
            this.field2107.method2692(this.field4930);
            this.field2107.method2660(0);
        }
        this.field4932.method2339('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Let;)V", line = 85)
    public final void method6(class179 arg0) {
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V", line = 92)
    public final void method2() {
        opengl var1 = this.field2107.field6330;
        this.field4932.method2339('\u0001');
        if (this.field2107.field6449 > 0) {
            this.field2107.method2660(1);
            this.field2107.method2692((class179) null);
            this.field2107.method2666(1.0F, 0.0F);
            this.field2107.method2660(0);
        }
        this.field2107.method2702(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 108)
    public final void method1(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field4931.field2106) {
                this.field2107.method2692(this.field4931.field2100);
                field4929[0] = 0.0F;
                field4929[1] = 0.0F;
                field4929[2] = 0.0F;
                field4929[3] = (float) (this.field2107.field6342 % 4000) / 4000.0F;
                this.field2107.field6330.glTexGenfv(8194, 9473, field4929, 0);
            } else {
                int var2 = this.field2107.field6342 % 4000 * 16 / 4000;
                this.field2107.method2692(this.field4931.field2105[var2]);
            }
        } else if (this.field4931.field2106) {
            this.field2107.method2692(this.field4931.field2100);
            field4929[0] = 0.0F;
            field4929[1] = 0.0F;
            field4929[2] = 0.0F;
            field4929[3] = 0.0F;
            this.field2107.field6330.glTexGenfv(8194, 9473, field4929, 0);
        } else {
            this.field2107.method2692(this.field4931.field2105[0]);
        }
    }
}
