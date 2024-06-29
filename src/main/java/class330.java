import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class330 extends class284 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
    private boolean field4480 = false;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Z")
    private boolean field4479;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[Lih;")
    private class416[] field4481;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lwm;")
    private class334 field4482;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()V")
    private final void method2059() {
        opengl var1 = this.field3917.field4607;
        this.field4482 = new class334(this.field3917, 2);
        this.field4482.method2073(0);
        this.field3917.method2162(1);
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
        if (this.field4479) {
            this.field3917.method2140(260, 7681);
            this.field3917.method2161(0, 5890, 770);
            this.field3917.method2135(0, 34167, 770);
        } else {
            this.field3917.method2140(7681, 8448);
            this.field3917.method2161(0, 34168, 768);
            this.field3917.method2162(2);
            this.field3917.method2140(260, 7681);
            this.field3917.method2161(0, 34168, 768);
            this.field3917.method2161(1, 34168, 770);
            this.field3917.method2135(0, 34167, 770);
        }
        this.field3917.method2162(0);
        this.field4482.method2074();
        this.field4482.method2073(1);
        this.field3917.method2162(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field4479) {
            this.field3917.method2140(8448, 8448);
            this.field3917.method2161(0, 5890, 768);
            this.field3917.method2135(0, 5890, 770);
        } else {
            this.field3917.method2140(8448, 8448);
            this.field3917.method2161(0, 5890, 768);
            this.field3917.method2162(2);
            this.field3917.method2140(8448, 8448);
            this.field3917.method2161(0, 5890, 768);
            this.field3917.method2161(1, 34168, 768);
            this.field3917.method2135(0, 5890, 770);
        }
        this.field3917.method2162(0);
        this.field4482.method2074();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
        if (this.field4480) {
            this.field3917.method2162(1);
            this.field3917.method2165(this.field4481[arg0 - 1]);
            this.field3917.method2162(0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()Z")
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lnj;)V")
    public final void method693(class133 arg0) {
        this.field3917.method2165(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method696(boolean arg0) {
        this.field3917.method2140(8448, 7681);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
    public final void method699() {
        if (this.field4480) {
            if (!this.field4479) {
                this.field3917.method2162(2);
                this.field3917.method2165((class133) null);
            }
            this.field3917.method2162(1);
            this.field3917.method2165((class133) null);
            this.field3917.method2162(0);
            this.field4482.method2075('\u0001');
            this.field4480 = false;
        } else {
            this.field3917.method2135(0, 5890, 770);
        }
        this.field3917.method2140(8448, 8448);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public final void method695(boolean arg0) {
        if (this.field4482 == null || !arg0) {
            this.field3917.method2135(0, 34168, 770);
            return;
        }
        if (!this.field4479) {
            this.field3917.method2162(2);
            this.field3917.method2165(this.field3917.field4734);
            this.field3917.method2162(0);
        }
        this.field4482.method2075('\u0000');
        this.field4480 = true;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lhj;)V")
    public class330(class338 arg0) {
        super(arg0);
        if (arg0.field4635) {
            this.field4479 = arg0.field4697 < 3;
            int var2 = this.field4479 ? 48 : 127;
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
            this.field4481 = new class416[3];
            this.field4481[0] = new class416(this.field3917, 6406, 64, false, var4, 6406);
            this.field4481[1] = new class416(this.field3917, 6406, 64, false, var5, 6406);
            this.field4481[2] = new class416(this.field3917, 6406, 64, false, var3, 6406);
            this.method2059();
        }
    }
}
