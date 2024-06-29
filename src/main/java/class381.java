import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class381 extends class436 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
    private boolean field5536 = false;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
    private boolean field5538;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lvm;")
    private class322[] field5537;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lpa;")
    private class341 field5539;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lnf;)V")
    public class381(class256 arg0) {
        super(arg0);
        if (arg0.field3660) {
            this.field5538 = arg0.field3667 < 3;
            int var2 = this.field5538 ? 48 : 127;
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
            this.field5537 = new class322[3];
            this.field5537[0] = new class322(this.field6402, 6406, 64, false, var4, 6406);
            this.field5537[1] = new class322(this.field6402, 6406, 64, false, var5, 6406);
            this.field5537[2] = new class322(this.field6402, 6406, 64, false, var3, 6406);
            this.method2469();
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        this.field6402.method1627(8448, 7681);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        if (this.field5539 == null || !arg0) {
            this.field6402.method1763(0, 34168, 770);
            return;
        }
        if (!this.field5538) {
            this.field6402.method1777(2);
            this.field6402.method1669(this.field6402.field3754);
            this.field6402.method1777(0);
        }
        this.field5539.method2225('\u0000');
        this.field5536 = true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public final void method162(int arg0) {
        if (this.field5536) {
            this.field6402.method1777(1);
            this.field6402.method1669(this.field5537[arg0 - 1]);
            this.field6402.method1777(0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()V")
    public final void method157() {
        if (this.field5536) {
            if (!this.field5538) {
                this.field6402.method1777(2);
                this.field6402.method1669((class360) null);
            }
            this.field6402.method1777(1);
            this.field6402.method1669((class360) null);
            this.field6402.method1777(0);
            this.field5539.method2225('\u0001');
            this.field5536 = false;
        } else {
            this.field6402.method1763(0, 5890, 770);
        }
        this.field6402.method1627(8448, 8448);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
    private final void method2469() {
        opengl var1 = this.field6402.field3634;
        this.field5539 = new class341(this.field6402, 2);
        this.field5539.method2224(0);
        this.field6402.method1777(1);
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
        if (this.field5538) {
            this.field6402.method1627(260, 7681);
            this.field6402.method1634(0, 5890, 770);
            this.field6402.method1763(0, 34167, 770);
        } else {
            this.field6402.method1627(7681, 8448);
            this.field6402.method1634(0, 34168, 768);
            this.field6402.method1777(2);
            this.field6402.method1627(260, 7681);
            this.field6402.method1634(0, 34168, 768);
            this.field6402.method1634(1, 34168, 770);
            this.field6402.method1763(0, 34167, 770);
        }
        this.field6402.method1777(0);
        this.field5539.method2223();
        this.field5539.method2224(1);
        this.field6402.method1777(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field5538) {
            this.field6402.method1627(8448, 8448);
            this.field6402.method1634(0, 5890, 768);
            this.field6402.method1763(0, 5890, 770);
        } else {
            this.field6402.method1627(8448, 8448);
            this.field6402.method1634(0, 5890, 768);
            this.field6402.method1777(2);
            this.field6402.method1627(8448, 8448);
            this.field6402.method1634(0, 5890, 768);
            this.field6402.method1634(1, 34168, 768);
            this.field6402.method1763(0, 5890, 770);
        }
        this.field6402.method1777(0);
        this.field5539.method2223();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lme;)V")
    public final void method160(class360 arg0) {
        this.field6402.method1669(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()Z")
    public final boolean method159() {
        return true;
    }
}
