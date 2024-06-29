import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class347 extends class114 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
    private boolean field4686 = false;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Z")
    private boolean field4688;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lfq;")
    private class180[] field4689;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lhi;")
    private class355 field4687;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lmm;)V", line = 52)
    public class347(class357 arg0) {
        super(arg0);
        if (arg0.field4870) {
            this.field4688 = arg0.field4845 < 3;
            int var2 = this.field4688 ? 48 : 127;
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
            this.field4689 = new class180[3];
            this.field4689[0] = new class180(this.field1748, 6406, 64, false, var4, 6406);
            this.field4689[1] = new class180(this.field1748, 6406, 64, false, var5, 6406);
            this.field4689[2] = new class180(this.field1748, 6406, 64, false, var3, 6406);
            this.method2101();
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 14)
    public final void method303(boolean arg0) {
        if (this.field4687 == null || !arg0) {
            this.field1748.method2192(0, 34168, 770);
            return;
        }
        if (!this.field4688) {
            this.field1748.method2196(2);
            this.field1748.method2180(this.field1748.field4880);
            this.field1748.method2196(0);
        }
        this.field4687.method2132('\u0000');
        this.field4686 = true;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 31)
    public final void method306() {
        if (this.field4686) {
            if (!this.field4688) {
                this.field1748.method2196(2);
                this.field1748.method2180((class321) null);
            }
            this.field1748.method2196(1);
            this.field1748.method2180((class321) null);
            this.field1748.method2196(0);
            this.field4687.method2132('\u0001');
            this.field4686 = false;
        } else {
            this.field1748.method2192(0, 5890, 770);
        }
        this.field1748.method2212(8448, 8448);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 160)
    private final void method2101() {
        opengl var1 = this.field1748.field4794;
        this.field4687 = new class355(this.field1748, 2);
        this.field4687.method2130(0);
        this.field1748.method2196(1);
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
        if (this.field4688) {
            this.field1748.method2212(260, 7681);
            this.field1748.method2187(0, 5890, 770);
            this.field1748.method2192(0, 34167, 770);
        } else {
            this.field1748.method2212(7681, 8448);
            this.field1748.method2187(0, 34168, 768);
            this.field1748.method2196(2);
            this.field1748.method2212(260, 7681);
            this.field1748.method2187(0, 34168, 768);
            this.field1748.method2187(1, 34168, 770);
            this.field1748.method2192(0, 34167, 770);
        }
        this.field1748.method2196(0);
        this.field4687.method2131();
        this.field4687.method2130(1);
        this.field1748.method2196(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field4688) {
            this.field1748.method2212(8448, 8448);
            this.field1748.method2187(0, 5890, 768);
            this.field1748.method2192(0, 5890, 770);
        } else {
            this.field1748.method2212(8448, 8448);
            this.field1748.method2187(0, 5890, 768);
            this.field1748.method2196(2);
            this.field1748.method2212(8448, 8448);
            this.field1748.method2187(0, 5890, 768);
            this.field1748.method2187(1, 34168, 768);
            this.field1748.method2192(0, 5890, 770);
        }
        this.field1748.method2196(0);
        this.field4687.method2131();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lt;)V", line = 224)
    public final void method307(class321 arg0) {
        this.field1748.method2180(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 227)
    public final void method304(boolean arg0) {
        this.field1748.method2212(8448, 7681);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()Z", line = 230)
    public final boolean method309() {
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 233)
    public final void method308(int arg0) {
        if (this.field4686) {
            this.field1748.method2196(1);
            this.field1748.method2180(this.field4689[arg0 - 1]);
            this.field1748.method2196(0);
        }
    }
}
