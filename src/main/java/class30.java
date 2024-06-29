import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class30 extends class309 {

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
    private boolean field380 = false;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Z")
    private boolean field381;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[Lnb;")
    private class359[] field382;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Lfa;")
    private class433 field383;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "()V")
    public final void method54() {
        if (this.field380) {
            if (!this.field381) {
                this.field4530.method1365(2);
                this.field4530.method1379((class5) null);
            }
            this.field4530.method1365(1);
            this.field4530.method1379((class5) null);
            this.field4530.method1365(0);
            this.field383.method2588('\u0001');
            this.field380 = false;
        } else {
            this.field4530.method1384(0, 5890, 770);
        }
        this.field4530.method1360(8448, 8448);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public final void method55(boolean arg0) {
        if (this.field383 == null || !arg0) {
            this.field4530.method1384(0, 34168, 770);
            return;
        }
        if (!this.field381) {
            this.field4530.method1365(2);
            this.field4530.method1379(this.field4530.field3418);
            this.field4530.method1365(0);
        }
        this.field383.method2588('\u0000');
        this.field380 = true;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lic;)V")
    public class30(class246 arg0) {
        super(arg0);
        if (arg0.field3455) {
            this.field381 = arg0.field3445 < 3;
            int var2 = this.field381 ? 48 : 127;
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
            this.field382 = new class359[3];
            this.field382[0] = new class359(this.field4530, 6406, 64, false, var4, 6406);
            this.field382[1] = new class359(this.field4530, 6406, 64, false, var5, 6406);
            this.field382[2] = new class359(this.field4530, 6406, 64, false, var3, 6406);
            this.method153();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lvd;)V")
    public final void method51(class5 arg0) {
        this.field4530.method1379(arg0);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "()V")
    private final void method153() {
        opengl var1 = this.field4530.field3342;
        this.field383 = new class433(this.field4530, 2);
        this.field383.method2589(0);
        this.field4530.method1365(1);
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
        if (this.field381) {
            this.field4530.method1360(260, 7681);
            this.field4530.method1458(0, 5890, 770);
            this.field4530.method1384(0, 34167, 770);
        } else {
            this.field4530.method1360(7681, 8448);
            this.field4530.method1458(0, 34168, 768);
            this.field4530.method1365(2);
            this.field4530.method1360(260, 7681);
            this.field4530.method1458(0, 34168, 768);
            this.field4530.method1458(1, 34168, 770);
            this.field4530.method1384(0, 34167, 770);
        }
        this.field4530.method1365(0);
        this.field383.method2590();
        this.field383.method2589(1);
        this.field4530.method1365(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field381) {
            this.field4530.method1360(8448, 8448);
            this.field4530.method1458(0, 5890, 768);
            this.field4530.method1384(0, 5890, 770);
        } else {
            this.field4530.method1360(8448, 8448);
            this.field4530.method1458(0, 5890, 768);
            this.field4530.method1365(2);
            this.field4530.method1360(8448, 8448);
            this.field4530.method1458(0, 5890, 768);
            this.field4530.method1458(1, 34168, 768);
            this.field4530.method1384(0, 5890, 770);
        }
        this.field4530.method1365(0);
        this.field383.method2590();
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
    public final void method57(boolean arg0) {
        this.field4530.method1360(8448, 7681);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (this.field380) {
            this.field4530.method1365(1);
            this.field4530.method1379(this.field382[arg0 - 1]);
            this.field4530.method1365(0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()Z")
    public final boolean method56() {
        return true;
    }
}
