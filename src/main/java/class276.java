import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class276 extends class48 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Z")
    private boolean field3732 = false;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
    private boolean field3731;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "[Lg;")
    private class433[] field3734;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Lgi;")
    private class253 field3733;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 3)
    public final void method70(boolean arg0) {
        this.field480.method2053(8448, 7681);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lql;)V", line = 7)
    public class276(class346 arg0) {
        super(arg0);
        if (arg0.field4767) {
            this.field3731 = arg0.field4796 < 3;
            int var2 = this.field3731 ? 48 : 127;
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
            this.field3734 = new class433[3];
            this.field3734[0] = new class433(this.field480, 6406, 64, false, var4, 6406);
            this.field3734[1] = new class433(this.field480, 6406, 64, false, var5, 6406);
            this.field3734[2] = new class433(this.field480, 6406, 64, false, var3, 6406);
            this.method1520();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lna;)V", line = 116)
    public final void method71(class50 arg0) {
        this.field480.method2032(arg0);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V", line = 121)
    public final void method73(boolean arg0) {
        if (this.field3733 == null || !arg0) {
            this.field480.method2040(0, 34168, 770);
            return;
        }
        if (!this.field3731) {
            this.field480.method2052(2);
            this.field480.method2032(this.field480.field4797);
            this.field480.method2052(0);
        }
        this.field3733.method1427('\u0000');
        this.field3732 = true;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "()V", line = 141)
    private final void method1520() {
        opengl var1 = this.field480.field4697;
        this.field3733 = new class253(this.field480, 2);
        this.field3733.method1429(0);
        this.field480.method2052(1);
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
        if (this.field3731) {
            this.field480.method2053(260, 7681);
            this.field480.method2062(0, 5890, 770);
            this.field480.method2040(0, 34167, 770);
        } else {
            this.field480.method2053(7681, 8448);
            this.field480.method2062(0, 34168, 768);
            this.field480.method2052(2);
            this.field480.method2053(260, 7681);
            this.field480.method2062(0, 34168, 768);
            this.field480.method2062(1, 34168, 770);
            this.field480.method2040(0, 34167, 770);
        }
        this.field480.method2052(0);
        this.field3733.method1428();
        this.field3733.method1429(1);
        this.field480.method2052(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field3731) {
            this.field480.method2053(8448, 8448);
            this.field480.method2062(0, 5890, 768);
            this.field480.method2040(0, 5890, 770);
        } else {
            this.field480.method2053(8448, 8448);
            this.field480.method2062(0, 5890, 768);
            this.field480.method2052(2);
            this.field480.method2053(8448, 8448);
            this.field480.method2062(0, 5890, 768);
            this.field480.method2062(1, 34168, 768);
            this.field480.method2040(0, 5890, 770);
        }
        this.field480.method2052(0);
        this.field3733.method1428();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 208)
    public final void method69(int arg0) {
        if (this.field3732) {
            this.field480.method2052(1);
            this.field480.method2032(this.field3734[arg0 - 1]);
            this.field480.method2052(0);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()V", line = 217)
    public final void method72() {
        if (this.field3732) {
            if (!this.field3731) {
                this.field480.method2052(2);
                this.field480.method2032((class50) null);
            }
            this.field480.method2052(1);
            this.field480.method2032((class50) null);
            this.field480.method2052(0);
            this.field3733.method1427('\u0001');
            this.field3732 = false;
        } else {
            this.field480.method2040(0, 5890, 770);
        }
        this.field480.method2053(8448, 8448);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()Z", line = 238)
    public final boolean method74() {
        return true;
    }
}
