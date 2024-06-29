import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class38 extends class44 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
    private boolean field436 = false;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Z")
    private boolean field438;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[Lvk;")
    private class206[] field437;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Leq;")
    private class115 field439;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()V")
    private final void method226() {
        opengl var1 = this.field540.field1927;
        this.field439 = new class115(this.field540, 2);
        this.field439.method716(0);
        this.field540.method1001(1);
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
        if (this.field438) {
            this.field540.method981(260, 7681);
            this.field540.method991(0, 5890, 770);
            this.field540.method989(0, 34167, 770);
        } else {
            this.field540.method981(7681, 8448);
            this.field540.method991(0, 34168, 768);
            this.field540.method1001(2);
            this.field540.method981(260, 7681);
            this.field540.method991(0, 34168, 768);
            this.field540.method991(1, 34168, 770);
            this.field540.method989(0, 34167, 770);
        }
        this.field540.method1001(0);
        this.field439.method715();
        this.field439.method716(1);
        this.field540.method1001(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field438) {
            this.field540.method981(8448, 8448);
            this.field540.method991(0, 5890, 768);
            this.field540.method989(0, 5890, 770);
        } else {
            this.field540.method981(8448, 8448);
            this.field540.method991(0, 5890, 768);
            this.field540.method1001(2);
            this.field540.method981(8448, 8448);
            this.field540.method991(0, 5890, 768);
            this.field540.method991(1, 34168, 768);
            this.field540.method989(0, 5890, 770);
        }
        this.field540.method1001(0);
        this.field439.method715();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public final void method227(boolean arg0) {
        if (this.field439 == null || !arg0) {
            this.field540.method989(0, 34168, 770);
            return;
        }
        if (!this.field438) {
            this.field540.method1001(2);
            this.field540.method1003(this.field540.field1958);
            this.field540.method1001(0);
        }
        this.field439.method714('\u0000');
        this.field436 = true;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method228(int arg0) {
        if (this.field436) {
            this.field540.method1001(1);
            this.field540.method1003(this.field437[arg0 - 1]);
            this.field540.method1001(0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
    public final void method229() {
        if (this.field436) {
            if (!this.field438) {
                this.field540.method1001(2);
                this.field540.method1003((class220) null);
            }
            this.field540.method1001(1);
            this.field540.method1003((class220) null);
            this.field540.method1001(0);
            this.field439.method714('\u0001');
            this.field436 = false;
        } else {
            this.field540.method989(0, 5890, 770);
        }
        this.field540.method981(8448, 8448);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V")
    public final void method230(boolean arg0) {
        this.field540.method981(8448, 7681);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Llp;)V")
    public final void method231(class220 arg0) {
        this.field540.method1003(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lao;)V")
    public class38(class157 arg0) {
        super(arg0);
        if (arg0.field2008) {
            this.field438 = arg0.field1960 < 3;
            int var2 = this.field438 ? 48 : 127;
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
            this.field437 = new class206[3];
            this.field437[0] = new class206(this.field540, 6406, 64, false, var4, 6406);
            this.field437[1] = new class206(this.field540, 6406, 64, false, var5, 6406);
            this.field437[2] = new class206(this.field540, 6406, 64, false, var3, 6406);
            this.method226();
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()Z")
    public final boolean method232() {
        return true;
    }
}
