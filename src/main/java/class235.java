import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class235 extends class300 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
    private boolean field3397 = false;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Z")
    private boolean field3398;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[Lca;")
    private class414[] field3399;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lfr;")
    private class101 field3400;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()V", line = 4)
    private final void method1725() {
        opengl var1 = this.field4409.field1604;
        this.field3400 = new class101(this.field4409, 2);
        this.field3400.method835(0);
        this.field4409.method857(1);
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
        if (this.field3398) {
            this.field4409.method870(260, 7681);
            this.field4409.method891(0, 5890, 770);
            this.field4409.method889(0, 34167, 770);
        } else {
            this.field4409.method870(7681, 8448);
            this.field4409.method891(0, 34168, 768);
            this.field4409.method857(2);
            this.field4409.method870(260, 7681);
            this.field4409.method891(0, 34168, 768);
            this.field4409.method891(1, 34168, 770);
            this.field4409.method889(0, 34167, 770);
        }
        this.field4409.method857(0);
        this.field3400.method834();
        this.field3400.method835(1);
        this.field4409.method857(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field3398) {
            this.field4409.method870(8448, 8448);
            this.field4409.method891(0, 5890, 768);
            this.field4409.method889(0, 5890, 770);
        } else {
            this.field4409.method870(8448, 8448);
            this.field4409.method891(0, 5890, 768);
            this.field4409.method857(2);
            this.field4409.method870(8448, 8448);
            this.field4409.method891(0, 5890, 768);
            this.field4409.method891(1, 34168, 768);
            this.field4409.method889(0, 5890, 770);
        }
        this.field4409.method857(0);
        this.field3400.method834();
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lge;)V", line = 115)
    public class235(class104 arg0) {
        super(arg0);
        if (arg0.field1664) {
            this.field3398 = arg0.field1733 < 3;
            int var2 = this.field3398 ? 48 : 127;
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
            this.field3399 = new class414[3];
            this.field3399[0] = new class414(this.field4409, 6406, 64, false, var4, 6406);
            this.field3399[1] = new class414(this.field4409, 6406, 64, false, var5, 6406);
            this.field3399[2] = new class414(this.field4409, 6406, 64, false, var3, 6406);
            this.method1725();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 73)
    public final void method6(boolean arg0) {
        if (this.field3400 == null || !arg0) {
            this.field4409.method889(0, 34168, 770);
            return;
        }
        if (!this.field3398) {
            this.field4409.method857(2);
            this.field4409.method929(this.field4409.field1627);
            this.field4409.method857(0);
        }
        this.field3400.method836('\u0000');
        this.field3397 = true;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lmo;)V", line = 90)
    public final void method9(class195 arg0) {
        this.field4409.method929(arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 95)
    public final void method8(int arg0) {
        if (this.field3397) {
            this.field4409.method857(1);
            this.field4409.method929(this.field3399[arg0 - 1]);
            this.field4409.method857(0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()Z", line = 105)
    public final boolean method4() {
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V", line = 112)
    public final void method7(boolean arg0) {
        this.field4409.method870(8448, 7681);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()V", line = 222)
    public final void method5() {
        if (this.field3397) {
            if (!this.field3398) {
                this.field4409.method857(2);
                this.field4409.method929((class195) null);
            }
            this.field4409.method857(1);
            this.field4409.method929((class195) null);
            this.field4409.method857(0);
            this.field3400.method836('\u0001');
            this.field3397 = false;
        } else {
            this.field4409.method889(0, 5890, 770);
        }
        this.field4409.method870(8448, 8448);
    }
}
