import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class242 extends class189 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
    private boolean field3229 = false;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Z")
    private boolean field3227;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[Lqd;")
    private class286[] field3228;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lrj;")
    private class388 field3230;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 6)
    public final void method488(boolean arg0) {
        this.field2580.method1994(8448, 7681);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lkq;)V", line = 9)
    public final void method492(class386 arg0) {
        this.field2580.method2106(arg0);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lbf;)V", line = 13)
    public class242(class344 arg0) {
        super(arg0);
        if (arg0.field4663) {
            this.field3227 = arg0.field4665 < 3;
            int var2 = this.field3227 ? 48 : 127;
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
            this.field3228 = new class286[3];
            this.field3228[0] = new class286(this.field2580, 6406, 64, false, var4, 6406);
            this.field3228[1] = new class286(this.field2580, 6406, 64, false, var5, 6406);
            this.field3228[2] = new class286(this.field2580, 6406, 64, false, var3, 6406);
            this.method1356();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 124)
    public final void method490(int arg0) {
        if (this.field3229) {
            this.field2580.method2067(1);
            this.field2580.method2106(this.field3228[arg0 - 1]);
            this.field2580.method2067(0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "()V", line = 133)
    public final void method491() {
        if (this.field3229) {
            if (!this.field3227) {
                this.field2580.method2067(2);
                this.field2580.method2106((class386) null);
            }
            this.field2580.method2067(1);
            this.field2580.method2106((class386) null);
            this.field2580.method2067(0);
            this.field3230.method2381('\u0001');
            this.field3229 = false;
        } else {
            this.field2580.method2068(0, 5890, 770);
        }
        this.field2580.method1994(8448, 8448);
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "()V", line = 158)
    private final void method1356() {
        opengl var1 = this.field2580.field4604;
        this.field3230 = new class388(this.field2580, 2);
        this.field3230.method2383(0);
        this.field2580.method2067(1);
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
        if (this.field3227) {
            this.field2580.method1994(260, 7681);
            this.field2580.method1990(0, 5890, 770);
            this.field2580.method2068(0, 34167, 770);
        } else {
            this.field2580.method1994(7681, 8448);
            this.field2580.method1990(0, 34168, 768);
            this.field2580.method2067(2);
            this.field2580.method1994(260, 7681);
            this.field2580.method1990(0, 34168, 768);
            this.field2580.method1990(1, 34168, 770);
            this.field2580.method2068(0, 34167, 770);
        }
        this.field2580.method2067(0);
        this.field3230.method2382();
        this.field3230.method2383(1);
        this.field2580.method2067(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field3227) {
            this.field2580.method1994(8448, 8448);
            this.field2580.method1990(0, 5890, 768);
            this.field2580.method2068(0, 5890, 770);
        } else {
            this.field2580.method1994(8448, 8448);
            this.field2580.method1990(0, 5890, 768);
            this.field2580.method2067(2);
            this.field2580.method1994(8448, 8448);
            this.field2580.method1990(0, 5890, 768);
            this.field2580.method1990(1, 34168, 768);
            this.field2580.method2068(0, 5890, 770);
        }
        this.field2580.method2067(0);
        this.field3230.method2382();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "()Z", line = 221)
    public final boolean method487() {
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V", line = 225)
    public final void method486(boolean arg0) {
        if (this.field3230 == null || !arg0) {
            this.field2580.method2068(0, 34168, 770);
            return;
        }
        if (!this.field3227) {
            this.field2580.method2067(2);
            this.field2580.method2106(this.field2580.field4674);
            this.field2580.method2067(0);
        }
        this.field3230.method2381('\u0000');
        this.field3229 = true;
    }
}
