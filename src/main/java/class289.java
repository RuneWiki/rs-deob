import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class289 extends class404 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Z")
    private boolean field3807 = false;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
    private boolean field3805;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[Lhp;")
    private class254[] field3804;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Ltp;")
    private class124 field3806;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
    public final void method348(boolean arg0) {
        if (this.field3806 == null || !arg0) {
            this.field5606.method2066(0, 34168, 770);
            return;
        }
        if (!this.field3805) {
            this.field5606.method2115(2);
            this.field5606.method2088(this.field5606.field4449);
            this.field5606.method2115(0);
        }
        this.field3806.method809('\u0000');
        this.field3807 = true;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lh;)V")
    public class289(class327 arg0) {
        super(arg0);
        if (arg0.field4424) {
            this.field3805 = arg0.field4400 < 3;
            int var2 = this.field3805 ? 48 : 127;
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
            this.field3804 = new class254[3];
            this.field3804[0] = new class254(this.field5606, 6406, 64, false, var4, 6406);
            this.field3804[1] = new class254(this.field5606, 6406, 64, false, var5, 6406);
            this.field3804[2] = new class254(this.field5606, 6406, 64, false, var3, 6406);
            this.method1845();
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
    private final void method1845() {
        opengl var1 = this.field5606.field4363;
        this.field3806 = new class124(this.field5606, 2);
        this.field3806.method808(0);
        this.field5606.method2115(1);
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
        if (this.field3805) {
            this.field5606.method2056(260, 7681);
            this.field5606.method2077(0, 5890, 770);
            this.field5606.method2066(0, 34167, 770);
        } else {
            this.field5606.method2056(7681, 8448);
            this.field5606.method2077(0, 34168, 768);
            this.field5606.method2115(2);
            this.field5606.method2056(260, 7681);
            this.field5606.method2077(0, 34168, 768);
            this.field5606.method2077(1, 34168, 770);
            this.field5606.method2066(0, 34167, 770);
        }
        this.field5606.method2115(0);
        this.field3806.method807();
        this.field3806.method808(1);
        this.field5606.method2115(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field3805) {
            this.field5606.method2056(8448, 8448);
            this.field5606.method2077(0, 5890, 768);
            this.field5606.method2066(0, 5890, 770);
        } else {
            this.field5606.method2056(8448, 8448);
            this.field5606.method2077(0, 5890, 768);
            this.field5606.method2115(2);
            this.field5606.method2056(8448, 8448);
            this.field5606.method2077(0, 5890, 768);
            this.field5606.method2077(1, 34168, 768);
            this.field5606.method2066(0, 5890, 770);
        }
        this.field5606.method2115(0);
        this.field3806.method807();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
    public final void method352() {
        if (this.field3807) {
            if (!this.field3805) {
                this.field5606.method2115(2);
                this.field5606.method2088((class233) null);
            }
            this.field5606.method2115(1);
            this.field5606.method2088((class233) null);
            this.field5606.method2115(0);
            this.field3806.method809('\u0001');
            this.field3807 = false;
        } else {
            this.field5606.method2066(0, 5890, 770);
        }
        this.field5606.method2056(8448, 8448);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()Z")
    public final boolean method350() {
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lsd;)V")
    public final void method353(class233 arg0) {
        this.field5606.method2088(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method351(int arg0) {
        if (this.field3807) {
            this.field5606.method2115(1);
            this.field5606.method2088(this.field3804[arg0 - 1]);
            this.field5606.method2115(0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
        this.field5606.method2056(8448, 7681);
    }
}
