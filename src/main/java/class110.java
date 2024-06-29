import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class110 extends class114 {

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lgk;")
    private class256 field1702;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lel;")
    private class330 field1700;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[F")
    private static float[] field1699 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lhi;")
    private class355 field1701;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()Z")
    public final boolean method309() {
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public final void method304(boolean arg0) {
        this.field1748.method2212(260, 8448);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method308(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1702.field3564) {
                this.field1748.method2180(this.field1702.field3562);
                field1699[0] = 0.0F;
                field1699[1] = 0.0F;
                field1699[2] = 0.0F;
                field1699[3] = (float) (this.field1748.field4817 % 4000) / 4000.0F;
                this.field1748.field4794.glTexGenfv(8194, 9473, field1699, 0);
            } else {
                int var2 = this.field1748.field4817 % 4000 * 16 / 4000;
                this.field1748.method2180(this.field1702.field3565[var2]);
            }
        } else if (this.field1702.field3564) {
            this.field1748.method2180(this.field1702.field3562);
            field1699[0] = 0.0F;
            field1699[1] = 0.0F;
            field1699[2] = 0.0F;
            field1699[3] = 0.0F;
            this.field1748.field4794.glTexGenfv(8194, 9473, field1699, 0);
        } else {
            this.field1748.method2180(this.field1702.field3565[0]);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
    public final void method303(boolean arg0) {
        opengl var2 = this.field1748.field4794;
        if (this.field1748.field4915 > 0) {
            float var3 = -0.5F / (float) this.field1748.field4915;
            this.field1748.method2196(1);
            field1699[0] = 0.0F;
            field1699[1] = 0.0F;
            field1699[2] = var3;
            field1699[3] = this.field1748.field4902 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1699, 0);
            var2.glPopMatrix();
            this.field1748.method2151(0.5F, (float) this.field1748.field4915);
            this.field1748.method2180(this.field1700);
            this.field1748.method2196(0);
        }
        this.field1701.method2132('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lmm;Lgk;)V")
    public class110(class357 arg0, class256 arg1) {
        super(arg0);
        this.field1702 = arg1;
        this.method845();
        this.field1700 = new class330(this.field1748, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1700.method2003(false, 3317);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lt;)V")
    public final void method307(class321 arg0) {
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()V")
    public final void method306() {
        opengl var1 = this.field1748.field4794;
        this.field1701.method2132('\u0001');
        if (this.field1748.field4915 > 0) {
            this.field1748.method2196(1);
            this.field1748.method2180((class321) null);
            this.field1748.method2151(1.0F, 0.0F);
            this.field1748.method2196(0);
        }
        this.field1748.method2212(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()V")
    private final void method845() {
        opengl var1 = this.field1748.field4794;
        this.field1701 = new class355(this.field1748, 2);
        this.field1701.method2130(0);
        this.field1748.method2196(1);
        this.field1748.method2212(7681, 260);
        this.field1748.method2187(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field1748.method2196(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1702.field3564) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1701.method2131();
        this.field1701.method2130(1);
        this.field1748.method2196(1);
        this.field1748.method2212(8448, 8448);
        this.field1748.method2187(0, 5890, 768);
        var1.glDisable(3168);
        this.field1748.method2196(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1702.field3564) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1701.method2131();
    }
}
