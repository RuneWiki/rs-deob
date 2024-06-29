import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class29 extends class338 {

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "Z")
    private boolean field299 = false;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Z")
    private boolean field301;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "[Lbl;")
    private class240[] field298;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Ljb;")
    private class461 field300;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "()V")
    private final void method186() {
        opengl var1 = this.field4685.field557;
        this.field300 = new class461(this.field4685, 2);
        this.field300.method2760(0);
        this.field4685.method407(1);
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
        if (this.field301) {
            this.field4685.method353(260, 7681);
            this.field4685.method335(0, 5890, 770);
            this.field4685.method289(0, 34167, 770);
        } else {
            this.field4685.method353(7681, 8448);
            this.field4685.method335(0, 34168, 768);
            this.field4685.method407(2);
            this.field4685.method353(260, 7681);
            this.field4685.method335(0, 34168, 768);
            this.field4685.method335(1, 34168, 770);
            this.field4685.method289(0, 34167, 770);
        }
        this.field4685.method407(0);
        this.field300.method2762();
        this.field300.method2760(1);
        this.field4685.method407(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field301) {
            this.field4685.method353(8448, 8448);
            this.field4685.method335(0, 5890, 768);
            this.field4685.method289(0, 5890, 770);
        } else {
            this.field4685.method353(8448, 8448);
            this.field4685.method335(0, 5890, 768);
            this.field4685.method407(2);
            this.field4685.method353(8448, 8448);
            this.field4685.method335(0, 5890, 768);
            this.field4685.method335(1, 34168, 768);
            this.field4685.method289(0, 5890, 770);
        }
        this.field4685.method407(0);
        this.field300.method2762();
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)V")
    public final void method187(boolean arg0) {
        if (this.field300 == null || !arg0) {
            this.field4685.method289(0, 34168, 770);
            return;
        }
        if (!this.field301) {
            this.field4685.method407(2);
            this.field4685.method303(this.field4685.field615);
            this.field4685.method407(0);
        }
        this.field300.method2761('\u0000');
        this.field299 = true;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lfu;)V")
    public class29(class42 arg0) {
        super(arg0);
        if (arg0.field682) {
            this.field301 = arg0.field648 < 3;
            int var2 = this.field301 ? 48 : 127;
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
            this.field298 = new class240[3];
            this.field298[0] = new class240(this.field4685, 6406, 64, false, var4, 6406);
            this.field298[1] = new class240(this.field4685, 6406, 64, false, var5, 6406);
            this.field298[2] = new class240(this.field4685, 6406, 64, false, var3, 6406);
            this.method186();
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ltp;)V")
    public final void method188(class375 arg0) {
        this.field4685.method303(arg0);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (this.field299) {
            this.field4685.method407(1);
            this.field4685.method303(this.field298[arg0 - 1]);
            this.field4685.method407(0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public final void method190(boolean arg0) {
        this.field4685.method353(8448, 7681);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()Z")
    public final boolean method191() {
        return true;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()V")
    public final void method192() {
        if (this.field299) {
            if (!this.field301) {
                this.field4685.method407(2);
                this.field4685.method303((class375) null);
            }
            this.field4685.method407(1);
            this.field4685.method303((class375) null);
            this.field4685.method407(0);
            this.field300.method2761('\u0001');
            this.field299 = false;
        } else {
            this.field4685.method289(0, 5890, 770);
        }
        this.field4685.method353(8448, 8448);
    }
}
