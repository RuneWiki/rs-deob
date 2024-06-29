import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class365 extends class48 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
    private boolean field5549 = false;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
    private boolean field5548;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[Lrj;")
    private class352[] field5547;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lkm;")
    private class197 field5550;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lsq;)V", line = 5)
    public class365(class96 arg0) {
        super(arg0);
        if (arg0.field1285) {
            this.field5548 = arg0.field1200 < 3;
            int var2 = this.field5548 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; var14++) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (var14 == 2) {
                            var15 = var13;
                        } else if (var14 == 3) {
                            var15 = -var13;
                        } else if (var14 == 4) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    var6++;
                }
            }
            this.field5547 = new class352[3];
            this.field5547[0] = new class352(this.field591, 6406, 64, false, var4, 6406);
            this.field5547[1] = new class352(this.field591, 6406, 64, false, var5, 6406);
            this.field5547[2] = new class352(this.field591, 6406, 64, false, var3, 6406);
            this.method2348();
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V", line = 113)
    public final void method307(boolean arg0) {
        this.field591.method680(8448, 7681);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()Z", line = 116)
    public final boolean method304() {
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 120)
    public final void method303(boolean arg0) {
        if (this.field5550 == null || !arg0) {
            this.field591.method658(0, 34168, 770);
            return;
        }
        if (!this.field5548) {
            this.field591.method628(2);
            this.field591.method688(this.field591.field1276);
            this.field591.method628(0);
        }
        this.field5550.method1380('\u0000');
        this.field5549 = true;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V", line = 139)
    private final void method2348() {
        opengl var1 = this.field591.field1156;
        this.field5550 = new class197(this.field591, 2);
        this.field5550.method1382(0);
        this.field591.method628(1);
        var1.glTexGeni(8192, 9472, 34065);
        var1.glTexGeni(8193, 9472, 34065);
        var1.glTexGeni(8194, 9472, 34065);
        var1.glEnable(3168);
        var1.glEnable(3169);
        var1.glEnable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (this.field5548) {
            this.field591.method680(260, 7681);
            this.field591.method712(0, 5890, 770);
            this.field591.method658(0, 34167, 770);
        } else {
            this.field591.method680(7681, 8448);
            this.field591.method712(0, 34168, 768);
            this.field591.method628(2);
            this.field591.method680(260, 7681);
            this.field591.method712(0, 34168, 768);
            this.field591.method712(1, 34168, 770);
            this.field591.method658(0, 34167, 770);
        }
        this.field591.method628(0);
        this.field5550.method1381();
        this.field5550.method1382(1);
        this.field591.method628(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field5548) {
            this.field591.method680(8448, 8448);
            this.field591.method712(0, 5890, 768);
            this.field591.method658(0, 5890, 770);
        } else {
            this.field591.method680(8448, 8448);
            this.field591.method712(0, 5890, 768);
            this.field591.method628(2);
            this.field591.method680(8448, 8448);
            this.field591.method712(0, 5890, 768);
            this.field591.method712(1, 34168, 768);
            this.field591.method658(0, 5890, 770);
        }
        this.field591.method628(0);
        this.field5550.method1381();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lod;)V", line = 201)
    public final void method308(class293 arg0) {
        this.field591.method688(arg0);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()V", line = 206)
    public final void method305() {
        if (this.field5549) {
            if (!this.field5548) {
                this.field591.method628(2);
                this.field591.method688((class293) null);
            }
            this.field591.method628(1);
            this.field591.method688((class293) null);
            this.field591.method628(0);
            this.field5550.method1380('\u0001');
            this.field5549 = false;
        } else {
            this.field591.method658(0, 5890, 770);
        }
        this.field591.method680(8448, 8448);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 232)
    public final void method306(int arg0) {
        if (this.field5549) {
            this.field591.method628(1);
            this.field591.method688(this.field5547[arg0 - 1]);
            this.field591.method628(0);
        }
    }
}
