import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class137 extends class331 {

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Z")
    private boolean field1811 = false;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Z")
    private boolean field1810;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "[Lnq;")
    private class294[] field1808;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Lma;")
    private class10 field1809;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)V")
    public final void method813(boolean arg0) {
        this.field4787.method1992(8448, 7681);
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "()V")
    private final void method866() {
        opengl var1 = this.field4787.field4445;
        this.field1809 = new class10(this.field4787, 2);
        this.field1809.method39(0);
        this.field4787.method1972(1);
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
        if (this.field1810) {
            this.field4787.method1992(260, 7681);
            this.field4787.method2006(0, 5890, 770);
            this.field4787.method2017(0, 34167, 770);
        } else {
            this.field4787.method1992(7681, 8448);
            this.field4787.method2006(0, 34168, 768);
            this.field4787.method1972(2);
            this.field4787.method1992(260, 7681);
            this.field4787.method2006(0, 34168, 768);
            this.field4787.method2006(1, 34168, 770);
            this.field4787.method2017(0, 34167, 770);
        }
        this.field4787.method1972(0);
        this.field1809.method38();
        this.field1809.method39(1);
        this.field4787.method1972(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field1810) {
            this.field4787.method1992(8448, 8448);
            this.field4787.method2006(0, 5890, 768);
            this.field4787.method2017(0, 5890, 770);
        } else {
            this.field4787.method1992(8448, 8448);
            this.field4787.method2006(0, 5890, 768);
            this.field4787.method1972(2);
            this.field4787.method1992(8448, 8448);
            this.field4787.method2006(0, 5890, 768);
            this.field4787.method2006(1, 34168, 768);
            this.field4787.method2017(0, 5890, 770);
        }
        this.field4787.method1972(0);
        this.field1809.method38();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
        if (this.field1811) {
            this.field4787.method1972(1);
            this.field4787.method1967(this.field1808[arg0 - 1]);
            this.field4787.method1972(0);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lbl;)V")
    public final void method817(class425 arg0) {
        this.field4787.method1967(arg0);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        if (this.field1809 == null || !arg0) {
            this.field4787.method2017(0, 34168, 770);
            return;
        }
        if (!this.field1810) {
            this.field4787.method1972(2);
            this.field4787.method1967(this.field4787.field4504);
            this.field4787.method1972(0);
        }
        this.field1809.method37('\u0000');
        this.field1811 = true;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "()V")
    public final void method816() {
        if (this.field1811) {
            if (!this.field1810) {
                this.field4787.method1972(2);
                this.field4787.method1967((class425) null);
            }
            this.field4787.method1972(1);
            this.field4787.method1967((class425) null);
            this.field4787.method1972(0);
            this.field1809.method37('\u0001');
            this.field1811 = false;
        } else {
            this.field4787.method2017(0, 5890, 770);
        }
        this.field4787.method1992(8448, 8448);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lmi;)V")
    public class137(class315 arg0) {
        super(arg0);
        if (arg0.field4509) {
            this.field1810 = arg0.field4480 < 3;
            int var2 = this.field1810 ? 48 : 127;
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
            this.field1808 = new class294[3];
            this.field1808[0] = new class294(this.field4787, 6406, 64, false, var4, 6406);
            this.field1808[1] = new class294(this.field4787, 6406, 64, false, var5, 6406);
            this.field1808[2] = new class294(this.field4787, 6406, 64, false, var3, 6406);
            this.method866();
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "()Z")
    public final boolean method812() {
        return true;
    }
}
