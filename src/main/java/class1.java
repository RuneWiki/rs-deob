import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class150 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Z")
    private boolean field3 = false;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
    private boolean field1;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[Lqh;")
    private class452[] field2;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lt;")
    private class391 field4;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 4)
    public final void method1(int arg0) {
        if (this.field3) {
            this.field2107.method2660(1);
            this.field2107.method2692(this.field2[arg0 - 1]);
            this.field2107.method2660(0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V", line = 13)
    public final void method2() {
        if (this.field3) {
            if (!this.field1) {
                this.field2107.method2660(2);
                this.field2107.method2692((class179) null);
            }
            this.field2107.method2660(1);
            this.field2107.method2692((class179) null);
            this.field2107.method2660(0);
            this.field4.method2339('\u0001');
            this.field3 = false;
        } else {
            this.field2107.method2709(0, 5890, 770);
        }
        this.field2107.method2702(8448, 8448);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 36)
    public final void method3(boolean arg0) {
        this.field2107.method2702(8448, 7681);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lqi;)V", line = 43)
    public class1(class458 arg0) {
        super(arg0);
        if (arg0.field6434) {
            this.field1 = arg0.field6457 < 3;
            int var2 = this.field1 ? 48 : 127;
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
            this.field2 = new class452[3];
            this.field2[0] = new class452(this.field2107, 6406, 64, false, var4, 6406);
            this.field2[1] = new class452(this.field2107, 6406, 64, false, var5, 6406);
            this.field2[2] = new class452(this.field2107, 6406, 64, false, var3, 6406);
            this.method4();
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V", line = 154)
    private final void method4() {
        opengl var1 = this.field2107.field6330;
        this.field4 = new class391(this.field2107, 2);
        this.field4.method2338(0);
        this.field2107.method2660(1);
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
        if (this.field1) {
            this.field2107.method2702(260, 7681);
            this.field2107.method2670(0, 5890, 770);
            this.field2107.method2709(0, 34167, 770);
        } else {
            this.field2107.method2702(7681, 8448);
            this.field2107.method2670(0, 34168, 768);
            this.field2107.method2660(2);
            this.field2107.method2702(260, 7681);
            this.field2107.method2670(0, 34168, 768);
            this.field2107.method2670(1, 34168, 770);
            this.field2107.method2709(0, 34167, 770);
        }
        this.field2107.method2660(0);
        this.field4.method2340();
        this.field4.method2338(1);
        this.field2107.method2660(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field1) {
            this.field2107.method2702(8448, 8448);
            this.field2107.method2670(0, 5890, 768);
            this.field2107.method2709(0, 5890, 770);
        } else {
            this.field2107.method2702(8448, 8448);
            this.field2107.method2670(0, 5890, 768);
            this.field2107.method2660(2);
            this.field2107.method2702(8448, 8448);
            this.field2107.method2670(0, 5890, 768);
            this.field2107.method2670(1, 34168, 768);
            this.field2107.method2709(0, 5890, 770);
        }
        this.field2107.method2660(0);
        this.field4.method2340();
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V", line = 216)
    public final void method5(boolean arg0) {
        if (this.field4 == null || !arg0) {
            this.field2107.method2709(0, 34168, 770);
            return;
        }
        if (!this.field1) {
            this.field2107.method2660(2);
            this.field2107.method2692(this.field2107.field6379);
            this.field2107.method2660(0);
        }
        this.field4.method2339('\u0000');
        this.field3 = true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Let;)V", line = 233)
    public final void method6(class179 arg0) {
        this.field2107.method2692(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()Z", line = 238)
    public final boolean method7() {
        return true;
    }
}
