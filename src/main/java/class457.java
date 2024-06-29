import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class457 extends class30 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Z")
    private boolean field6490 = false;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Z")
    private boolean field6487;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "[Lcd;")
    private class60[] field6488;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lp;")
    private class173 field6489;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "()Z")
    public final boolean method262() {
        return true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public final void method264(int arg0) {
        if (this.field6490) {
            this.field405.method1634(1);
            this.field405.method1653(this.field6488[arg0 - 1]);
            this.field405.method1634(0);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lap;)V")
    public final void method266(class26 arg0) {
        this.field405.method1653(arg0);
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "()V")
    private final void method2710() {
        opengl var1 = this.field405.field3648;
        this.field6489 = new class173(this.field405, 2);
        this.field6489.method1191(0);
        this.field405.method1634(1);
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
        if (this.field6487) {
            this.field405.method1679(260, 7681);
            this.field405.method1621(0, 5890, 770);
            this.field405.method1662(0, 34167, 770);
        } else {
            this.field405.method1679(7681, 8448);
            this.field405.method1621(0, 34168, 768);
            this.field405.method1634(2);
            this.field405.method1679(260, 7681);
            this.field405.method1621(0, 34168, 768);
            this.field405.method1621(1, 34168, 770);
            this.field405.method1662(0, 34167, 770);
        }
        this.field405.method1634(0);
        this.field6489.method1193();
        this.field6489.method1191(1);
        this.field405.method1634(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field6487) {
            this.field405.method1679(8448, 8448);
            this.field405.method1621(0, 5890, 768);
            this.field405.method1662(0, 5890, 770);
        } else {
            this.field405.method1679(8448, 8448);
            this.field405.method1621(0, 5890, 768);
            this.field405.method1634(2);
            this.field405.method1679(8448, 8448);
            this.field405.method1621(0, 5890, 768);
            this.field405.method1621(1, 34168, 768);
            this.field405.method1662(0, 5890, 770);
        }
        this.field405.method1634(0);
        this.field6489.method1193();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
    public final void method261() {
        if (this.field6490) {
            if (!this.field6487) {
                this.field405.method1634(2);
                this.field405.method1653((class26) null);
            }
            this.field405.method1634(1);
            this.field405.method1653((class26) null);
            this.field405.method1634(0);
            this.field6489.method1192('\u0001');
            this.field6490 = false;
        } else {
            this.field405.method1662(0, 5890, 770);
        }
        this.field405.method1679(8448, 8448);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
    public final void method265(boolean arg0) {
        if (this.field6489 == null || !arg0) {
            this.field405.method1662(0, 34168, 770);
            return;
        }
        if (!this.field6487) {
            this.field405.method1634(2);
            this.field405.method1653(this.field405.field3754);
            this.field405.method1634(0);
        }
        this.field6489.method1192('\u0000');
        this.field6490 = true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public final void method263(boolean arg0) {
        this.field405.method1679(8448, 7681);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lnm;)V")
    public class457(class254 arg0) {
        super(arg0);
        if (arg0.field3718) {
            this.field6487 = arg0.field3763 < 3;
            int var2 = this.field6487 ? 48 : 127;
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
            this.field6488 = new class60[3];
            this.field6488[0] = new class60(this.field405, 6406, 64, false, var4, 6406);
            this.field6488[1] = new class60(this.field405, 6406, 64, false, var5, 6406);
            this.field6488[2] = new class60(this.field405, 6406, 64, false, var3, 6406);
            this.method2710();
        }
    }
}
