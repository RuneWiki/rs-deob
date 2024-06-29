import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class253 extends class233 {

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Z")
    private boolean field3666 = false;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
    private boolean field3664;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[Lsg;")
    private class266[] field3663;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lfd;")
    private class195 field3665;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public final void method828(int arg0) {
        if (this.field3666) {
            this.field3283.method2037(1);
            this.field3283.method2186(this.field3663[arg0 - 1]);
            this.field3283.method2037(0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lih;)V")
    public class253(class330 arg0) {
        super(arg0);
        if (arg0.field4823) {
            this.field3664 = arg0.field4788 < 3;
            int var2 = this.field3664 ? 48 : 127;
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
            this.field3663 = new class266[3];
            this.field3663[0] = new class266(this.field3283, 6406, 64, false, var4, 6406);
            this.field3663[1] = new class266(this.field3283, 6406, 64, false, var5, 6406);
            this.field3663[2] = new class266(this.field3283, 6406, 64, false, var3, 6406);
            this.method1555();
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
    public final void method829(boolean arg0) {
        if (this.field3665 == null || !arg0) {
            this.field3283.method2029(0, 34168, 770);
            return;
        }
        if (!this.field3664) {
            this.field3283.method2037(2);
            this.field3283.method2186(this.field3283.field4838);
            this.field3283.method2037(0);
        }
        this.field3665.method1225('\u0000');
        this.field3666 = true;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()V")
    private final void method1555() {
        opengl var1 = this.field3283.field4741;
        this.field3665 = new class195(this.field3283, 2);
        this.field3665.method1223(0);
        this.field3283.method2037(1);
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
        if (this.field3664) {
            this.field3283.method2109(260, 7681);
            this.field3283.method2072(0, 5890, 770);
            this.field3283.method2029(0, 34167, 770);
        } else {
            this.field3283.method2109(7681, 8448);
            this.field3283.method2072(0, 34168, 768);
            this.field3283.method2037(2);
            this.field3283.method2109(260, 7681);
            this.field3283.method2072(0, 34168, 768);
            this.field3283.method2072(1, 34168, 770);
            this.field3283.method2029(0, 34167, 770);
        }
        this.field3283.method2037(0);
        this.field3665.method1224();
        this.field3665.method1223(1);
        this.field3283.method2037(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field3664) {
            this.field3283.method2109(8448, 8448);
            this.field3283.method2072(0, 5890, 768);
            this.field3283.method2029(0, 5890, 770);
        } else {
            this.field3283.method2109(8448, 8448);
            this.field3283.method2072(0, 5890, 768);
            this.field3283.method2037(2);
            this.field3283.method2109(8448, 8448);
            this.field3283.method2072(0, 5890, 768);
            this.field3283.method2072(1, 34168, 768);
            this.field3283.method2029(0, 5890, 770);
        }
        this.field3283.method2037(0);
        this.field3665.method1224();
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
    public final void method826() {
        if (this.field3666) {
            if (!this.field3664) {
                this.field3283.method2037(2);
                this.field3283.method2186((class223) null);
            }
            this.field3283.method2037(1);
            this.field3283.method2186((class223) null);
            this.field3283.method2037(0);
            this.field3665.method1225('\u0001');
            this.field3666 = false;
        } else {
            this.field3283.method2029(0, 5890, 770);
        }
        this.field3283.method2109(8448, 8448);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ldg;)V")
    public final void method825(class223 arg0) {
        this.field3283.method2186(arg0);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public final void method827(boolean arg0) {
        this.field3283.method2109(8448, 7681);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()Z")
    public final boolean method830() {
        return true;
    }
}
