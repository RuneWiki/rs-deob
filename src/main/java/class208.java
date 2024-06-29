import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class208 extends class436 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lqg;")
    private class155 field2791;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lvg;")
    private class108 field2790;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[F")
    private static float[] field2793 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lpa;")
    private class341 field2792;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        this.field6402.method1627(260, 8448);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V")
    private final void method1224() {
        opengl var1 = this.field6402.field3634;
        this.field2792 = new class341(this.field6402, 2);
        this.field2792.method2224(0);
        this.field6402.method1777(1);
        this.field6402.method1627(7681, 260);
        this.field6402.method1634(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field6402.method1777(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field2791.field2097) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field2792.method2223();
        this.field2792.method2224(1);
        this.field6402.method1777(1);
        this.field6402.method1627(8448, 8448);
        this.field6402.method1634(0, 5890, 768);
        var1.glDisable(3168);
        this.field6402.method1777(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field2791.field2097) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field2792.method2223();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()Z")
    public final boolean method159() {
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lme;)V")
    public final void method160(class360 arg0) {
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        opengl var2 = this.field6402.field3634;
        if (this.field6402.field3761 > 0) {
            float var3 = -0.5F / (float) this.field6402.field3761;
            this.field6402.method1777(1);
            field2793[0] = 0.0F;
            field2793[1] = 0.0F;
            field2793[2] = var3;
            field2793[3] = this.field6402.field3685 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field2793, 0);
            var2.glPopMatrix();
            this.field6402.method1646(0.5F, (float) this.field6402.field3761);
            this.field6402.method1669(this.field2790);
            this.field6402.method1777(0);
        }
        this.field2792.method2225('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public final void method162(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field2791.field2097) {
                this.field6402.method1669(this.field2791.field2100);
                field2793[0] = 0.0F;
                field2793[1] = 0.0F;
                field2793[2] = 0.0F;
                field2793[3] = (float) (this.field6402.field3641 % 4000) / 4000.0F;
                this.field6402.field3634.glTexGenfv(8194, 9473, field2793, 0);
            } else {
                int var2 = this.field6402.field3641 % 4000 * 16 / 4000;
                this.field6402.method1669(this.field2791.field2098[var2]);
            }
        } else if (this.field2791.field2097) {
            this.field6402.method1669(this.field2791.field2100);
            field2793[0] = 0.0F;
            field2793[1] = 0.0F;
            field2793[2] = 0.0F;
            field2793[3] = 0.0F;
            this.field6402.field3634.glTexGenfv(8194, 9473, field2793, 0);
        } else {
            this.field6402.method1669(this.field2791.field2098[0]);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
    public final void method157() {
        opengl var1 = this.field6402.field3634;
        this.field2792.method2225('\u0001');
        if (this.field6402.field3761 > 0) {
            this.field6402.method1777(1);
            this.field6402.method1669((class360) null);
            this.field6402.method1646(1.0F, 0.0F);
            this.field6402.method1777(0);
        }
        this.field6402.method1627(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lnf;Lqg;)V")
    public class208(class256 arg0, class155 arg1) {
        super(arg0);
        this.field2791 = arg1;
        this.method1224();
        this.field2790 = new class108(this.field6402, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2790.method718(false, (byte) 127);
    }
}
