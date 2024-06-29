import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class447 extends class338 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Ls;")
    private class258 field6370;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lea;")
    private class14 field6372;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[F")
    private static float[] field6369 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Ljb;")
    private class461 field6371;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lfu;Ls;)V")
    public class447(class42 arg0, class258 arg1) {
        super(arg0);
        this.field6370 = arg1;
        this.method2707();
        this.field6372 = new class14(this.field4685, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6372.method87(125, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public final void method190(boolean arg0) {
        this.field4685.method353(260, 8448);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public final void method192() {
        opengl var1 = this.field4685.field557;
        this.field6371.method2761('\u0001');
        if (this.field4685.field651 > 0) {
            this.field4685.method407(1);
            this.field4685.method303((class375) null);
            this.field4685.method447(1.0F, 0.0F);
            this.field4685.method407(0);
        }
        this.field4685.method353(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()V")
    private final void method2707() {
        opengl var1 = this.field4685.field557;
        this.field6371 = new class461(this.field4685, 2);
        this.field6371.method2760(0);
        this.field4685.method407(1);
        this.field4685.method353(7681, 260);
        this.field4685.method335(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field4685.method407(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6370.field3684) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field6371.method2762();
        this.field6371.method2760(1);
        this.field4685.method407(1);
        this.field4685.method353(8448, 8448);
        this.field4685.method335(0, 5890, 768);
        var1.glDisable(3168);
        this.field4685.method407(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6370.field3684) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field6371.method2762();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method189(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field6370.field3684) {
                this.field4685.method303(this.field6370.field3683);
                field6369[0] = 0.0F;
                field6369[1] = 0.0F;
                field6369[2] = 0.0F;
                field6369[3] = (float) (this.field4685.field568 % 4000) / 4000.0F;
                this.field4685.field557.glTexGenfv(8194, 9473, field6369, 0);
            } else {
                int var2 = this.field4685.field568 % 4000 * 16 / 4000;
                this.field4685.method303(this.field6370.field3688[var2]);
            }
        } else if (this.field6370.field3684) {
            this.field4685.method303(this.field6370.field3683);
            field6369[0] = 0.0F;
            field6369[1] = 0.0F;
            field6369[2] = 0.0F;
            field6369[3] = 0.0F;
            this.field4685.field557.glTexGenfv(8194, 9473, field6369, 0);
        } else {
            this.field4685.method303(this.field6370.field3688[0]);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()Z")
    public final boolean method191() {
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ltp;)V")
    public final void method188(class375 arg0) {
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    public final void method187(boolean arg0) {
        opengl var2 = this.field4685.field557;
        if (this.field4685.field651 > 0) {
            float var3 = -0.5F / (float) this.field4685.field651;
            this.field4685.method407(1);
            field6369[0] = 0.0F;
            field6369[1] = 0.0F;
            field6369[2] = var3;
            field6369[3] = this.field4685.field669 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field6369, 0);
            var2.glPopMatrix();
            this.field4685.method447(0.5F, (float) this.field4685.field651);
            this.field4685.method303(this.field6372);
            this.field4685.method407(0);
        }
        this.field6371.method2761('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }
}
