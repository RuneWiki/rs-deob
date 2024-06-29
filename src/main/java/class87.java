import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class87 extends class457 {

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Lle;")
    private class68 field1073;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Lok;")
    private class64 field1072;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[F")
    private static float[] field1071 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lhd;")
    private class19 field1070;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "()V")
    public final void method64() {
        opengl var1 = this.field6752.field2253;
        this.field1070.method235('\u0001');
        if (this.field6752.field2293 > 0) {
            this.field6752.method1150(1);
            this.field6752.method1160((class205) null);
            this.field6752.method1187(1.0F, 0.0F);
            this.field6752.method1150(0);
        }
        this.field6752.method1161(8448, 8448);
        var1.glMatrixMode(5890);
        var1.glPopMatrix();
        var1.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public final void method60(int arg0) {
        if ((arg0 & 0x1) == 1) {
            if (this.field1073.field904) {
                this.field6752.method1160(this.field1073.field900);
                field1071[0] = 0.0F;
                field1071[1] = 0.0F;
                field1071[2] = 0.0F;
                field1071[3] = (float) (this.field6752.field2276 % 4000) / 4000.0F;
                this.field6752.field2253.glTexGenfv(8194, 9473, field1071, 0);
            } else {
                int var2 = this.field6752.field2276 % 4000 * 16 / 4000;
                this.field6752.method1160(this.field1073.field901[var2]);
            }
        } else if (this.field1073.field904) {
            this.field6752.method1160(this.field1073.field900);
            field1071[0] = 0.0F;
            field1071[1] = 0.0F;
            field1071[2] = 0.0F;
            field1071[3] = 0.0F;
            this.field6752.field2253.glTexGenfv(8194, 9473, field1071, 0);
        } else {
            this.field6752.method1160(this.field1073.field901[0]);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        opengl var2 = this.field6752.field2253;
        if (this.field6752.field2293 > 0) {
            float var3 = -0.5F / (float) this.field6752.field2293;
            this.field6752.method1150(1);
            field1071[0] = 0.0F;
            field1071[1] = 0.0F;
            field1071[2] = var3;
            field1071[3] = this.field6752.field2346 * var3 + 0.25F;
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glTexGenfv(8192, 9474, field1071, 0);
            var2.glPopMatrix();
            this.field6752.method1187(0.5F, (float) this.field6752.field2293);
            this.field6752.method1160(this.field1072);
            this.field6752.method1150(0);
        }
        this.field1070.method235('\u0000');
        var2.glMatrixMode(5890);
        var2.glPushMatrix();
        var2.glScalef(0.25F, 0.25F, 1.0F);
        var2.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        this.field6752.method1161(260, 8448);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lvo;)V")
    public final void method63(class205 arg0) {
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lks;Lle;)V")
    public class87(class173 arg0, class68 arg1) {
        super(arg0);
        this.field1073 = arg1;
        this.method589();
        this.field1072 = new class64(this.field6752, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1072.method471(false, (byte) -119);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "()V")
    private final void method589() {
        opengl var1 = this.field6752.field2253;
        this.field1070 = new class19(this.field6752, 2);
        this.field1070.method233(0);
        this.field6752.method1150(1);
        this.field6752.method1161(7681, 260);
        this.field6752.method1127(0, 34168, 768);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3168);
        this.field6752.method1150(0);
        var1.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1073.field904) {
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
        }
        this.field1070.method234();
        this.field1070.method233(1);
        this.field6752.method1150(1);
        this.field6752.method1161(8448, 8448);
        this.field6752.method1127(0, 5890, 768);
        var1.glDisable(3168);
        this.field6752.method1150(0);
        var1.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1073.field904) {
            var1.glDisable(3170);
            var1.glDisable(3171);
        }
        this.field1070.method234();
    }
}
