import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class298 extends class42 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lfg;")
    private class66 field4330;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lvr;")
    private class71 field4332;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[F")
    private static float[] field4331 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Loc;")
    private class112 field4333;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()V")
    public final void method291() {
        opengl var1 = this.field582.field1918;
        this.field4333.method677('\u0001');
        if (this.field582.field2008 > 0) {
            this.field582.method1002(1);
            this.field582.method888((class404) null);
            this.field582.method1019(1.0F, 0.0F);
            this.field582.method1002(0);
        }
        this.field582.method926(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public final void method288(boolean arg0) {
        this.field582.method926(260, 8448);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lee;)V")
    public final void method286(class404 arg0) {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lig;Lfg;)V")
    public class298(class132 arg0, class66 arg1) {
        super(arg0);
        this.field4330 = arg1;
        this.method2012();
        this.field4332 = new class71(this.field582, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4332.method435(false, (byte) 126);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public final void method290(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field4330.field895) {
                this.field582.method888(this.field4330.field893);
                field4331[0] = 0.0F;
                field4331[1] = 0.0F;
                field4331[2] = 0.0F;
                field4331[3] = (float) (this.field582.field1930 % 4000) / 4000.0F;
                this.field582.field1918.glTexGenfv(8194, 9473, field4331, 0);
            } else {
                int var2 = this.field582.field1930 % 4000 * 16 / 4000;
                this.field582.method888(this.field4330.field892[var2]);
            }
        } else if (this.field4330.field895) {
            this.field582.method888(this.field4330.field893);
            field4331[0] = 0.0F;
            field4331[1] = 0.0F;
            field4331[2] = 0.0F;
            field4331[3] = 0.0F;
            this.field582.field1918.glTexGenfv(8194, 9473, field4331, 0);
        } else {
            this.field582.method888(this.field4330.field892[0]);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        opengl var2 = this.field582.field1918;
        if (this.field582.field2008 > 0) {
            float var3 = -0.5F / (float) this.field582.field2008;
            this.field582.method1002(1);
            field4331[0] = 0.0F;
            field4331[1] = 0.0F;
            field4331[2] = var3;
            field4331[3] = this.field582.field2009 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field4331, 0);
            var2.glPopMatrix();
            this.field582.method1019(0.5F, (float) this.field582.field2008);
            this.field582.method888(this.field4332);
            this.field582.method1002(0);
        }
        this.field4333.method677('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V")
    private final void method2012() {
        opengl var1 = this.field582.field1918;
        this.field4333 = new class112(this.field582, 2);
        this.field4333.method678(0);
        this.field582.method1002(1);
        this.field582.method926(7681, 260);
        this.field582.method949(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field582.method1002(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4330.field895) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field4333.method679();
        this.field4333.method678(1);
        this.field582.method1002(1);
        this.field582.method926(8448, 8448);
        this.field582.method949(0, 5890, 768);
        var1.glDisable(3168);
        this.field582.method1002(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4330.field895) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field4333.method679();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()Z")
    public final boolean method287() {
        return true;
    }
}
