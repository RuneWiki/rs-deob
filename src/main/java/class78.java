import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class78 extends class139 {

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
    private boolean field1033 = false;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
    private boolean field1034;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "[Lgm;")
    private class92[] field1032;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Lcq;")
    private class73 field1031;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "()V")
    private final void method511() {
        opengl var1 = this.field1876.field5783;
        this.field1031 = new class73(this.field1876, 2);
        this.field1031.method482(0);
        this.field1876.method2452(1);
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
        if (this.field1034) {
            this.field1876.method2428(260, 7681);
            this.field1876.method2425(0, 5890, 770);
            this.field1876.method2462(0, 34167, 770);
        } else {
            this.field1876.method2428(7681, 8448);
            this.field1876.method2425(0, 34168, 768);
            this.field1876.method2452(2);
            this.field1876.method2428(260, 7681);
            this.field1876.method2425(0, 34168, 768);
            this.field1876.method2425(1, 34168, 770);
            this.field1876.method2462(0, 34167, 770);
        }
        this.field1876.method2452(0);
        this.field1031.method484();
        this.field1031.method482(1);
        this.field1876.method2452(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field1034) {
            this.field1876.method2428(8448, 8448);
            this.field1876.method2425(0, 5890, 768);
            this.field1876.method2462(0, 5890, 770);
        } else {
            this.field1876.method2428(8448, 8448);
            this.field1876.method2425(0, 5890, 768);
            this.field1876.method2452(2);
            this.field1876.method2428(8448, 8448);
            this.field1876.method2425(0, 5890, 768);
            this.field1876.method2425(1, 34168, 768);
            this.field1876.method2462(0, 5890, 770);
        }
        this.field1876.method2452(0);
        this.field1031.method484();
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "()Z")
    public final boolean method60() {
        return true;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "()V")
    public final void method58() {
        if (this.field1033) {
            if (!this.field1034) {
                this.field1876.method2452(2);
                this.field1876.method2460((class325) null);
            }
            this.field1876.method2452(1);
            this.field1876.method2460((class325) null);
            this.field1876.method2452(0);
            this.field1031.method483('\u0001');
            this.field1033 = false;
        } else {
            this.field1876.method2462(0, 5890, 770);
        }
        this.field1876.method2428(8448, 8448);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
    public final void method59(boolean arg0) {
        this.field1876.method2428(8448, 7681);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lcg;)V")
    public class78(class393 arg0) {
        super(arg0);
        if (arg0.field5828) {
            this.field1034 = arg0.field5808 < 3;
            int var2 = this.field1034 ? 48 : 127;
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
            this.field1032 = new class92[3];
            this.field1032[0] = new class92(this.field1876, 6406, 64, false, var4, 6406);
            this.field1032[1] = new class92(this.field1876, 6406, 64, false, var5, 6406);
            this.field1032[2] = new class92(this.field1876, 6406, 64, false, var3, 6406);
            this.method511();
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lq;)V")
    public final void method56(class325 arg0) {
        this.field1876.method2460(arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (this.field1033) {
            this.field1876.method2452(1);
            this.field1876.method2460(this.field1032[arg0 - 1]);
            this.field1876.method2452(0);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (this.field1031 == null || !arg0) {
            this.field1876.method2462(0, 34168, 770);
            return;
        }
        if (!this.field1034) {
            this.field1876.method2452(2);
            this.field1876.method2460(this.field1876.field5874);
            this.field1876.method2452(0);
        }
        this.field1031.method483('\u0000');
        this.field1033 = true;
    }
}
