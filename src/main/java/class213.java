import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class213 extends class304 {

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Z")
    private boolean field2982 = false;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
    private boolean field2980;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[Lpi;")
    private class141[] field2979;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lns;")
    private class426 field2981;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lgd;)V", line = 4)
    public final void method629(class344 arg0) {
        this.field4557.method1915(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V", line = 7)
    public final void method630(boolean arg0) {
        if (this.field2981 == null || !arg0) {
            this.field4557.method1867(0, 34168, 770);
            return;
        }
        if (!this.field2980) {
            this.field4557.method1862(2);
            this.field4557.method1915(this.field4557.field4208);
            this.field4557.method1862(0);
        }
        this.field2981.method2672('\u0000');
        this.field2982 = true;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()V", line = 31)
    private final void method1408() {
        opengl var1 = this.field4557.field4140;
        this.field2981 = new class426(this.field4557, 2);
        this.field2981.method2670(0);
        this.field4557.method1862(1);
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
        if (this.field2980) {
            this.field4557.method1911(260, 7681);
            this.field4557.method1866(0, 5890, 770);
            this.field4557.method1867(0, 34167, 770);
        } else {
            this.field4557.method1911(7681, 8448);
            this.field4557.method1866(0, 34168, 768);
            this.field4557.method1862(2);
            this.field4557.method1911(260, 7681);
            this.field4557.method1866(0, 34168, 768);
            this.field4557.method1866(1, 34168, 770);
            this.field4557.method1867(0, 34167, 770);
        }
        this.field4557.method1862(0);
        this.field2981.method2671();
        this.field2981.method2670(1);
        this.field4557.method1862(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field2980) {
            this.field4557.method1911(8448, 8448);
            this.field4557.method1866(0, 5890, 768);
            this.field4557.method1867(0, 5890, 770);
        } else {
            this.field4557.method1911(8448, 8448);
            this.field4557.method1866(0, 5890, 768);
            this.field4557.method1862(2);
            this.field4557.method1911(8448, 8448);
            this.field4557.method1866(0, 5890, 768);
            this.field4557.method1866(1, 34168, 768);
            this.field4557.method1867(0, 5890, 770);
        }
        this.field4557.method1862(0);
        this.field2981.method2671();
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()Z", line = 93)
    public final boolean method628() {
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V", line = 97)
    public final void method627() {
        if (this.field2982) {
            if (!this.field2980) {
                this.field4557.method1862(2);
                this.field4557.method1915((class344) null);
            }
            this.field4557.method1862(1);
            this.field4557.method1915((class344) null);
            this.field4557.method1862(0);
            this.field2981.method2672('\u0001');
            this.field2982 = false;
        } else {
            this.field4557.method1867(0, 5890, 770);
        }
        this.field4557.method1911(8448, 8448);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lse;)V", line = 135)
    public class213(class282 arg0) {
        super(arg0);
        if (arg0.field4182) {
            this.field2980 = arg0.field4185 < 3;
            int var2 = this.field2980 ? 48 : 127;
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
            this.field2979 = new class141[3];
            this.field2979[0] = new class141(this.field4557, 6406, 64, false, var4, 6406);
            this.field2979[1] = new class141(this.field4557, 6406, 64, false, var5, 6406);
            this.field2979[2] = new class141(this.field4557, 6406, 64, false, var3, 6406);
            this.method1408();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 122)
    public final void method625(int arg0) {
        if (this.field2982) {
            this.field4557.method1862(1);
            this.field4557.method1915(this.field2979[arg0 - 1]);
            this.field4557.method1862(0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V", line = 131)
    public final void method624(boolean arg0) {
        this.field4557.method1911(8448, 7681);
    }
}
