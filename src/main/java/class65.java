import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class65 extends class157 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Z")
    private boolean field980 = false;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    private boolean field979;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[Lm;")
    private class181[] field982;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lq;")
    private class205 field981;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V", line = 6)
    public final void method554(boolean arg0) {
        if (this.field981 == null || !arg0) {
            this.field2366.method223(0, 34168, 770);
            return;
        }
        if (!this.field979) {
            this.field2366.method176(2);
            this.field2366.method207(this.field2366.field333);
            this.field2366.method176(0);
        }
        this.field981.method1427('\u0000');
        this.field980 = true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()Z", line = 23)
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lhd;)V", line = 55)
    public class65(class17 arg0) {
        super(arg0);
        if (arg0.field297) {
            this.field979 = arg0.field261 < 3;
            int var2 = this.field979 ? 48 : 127;
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
            this.field982 = new class181[3];
            this.field982[0] = new class181(this.field2366, 6406, 64, false, var4, 6406);
            this.field982[1] = new class181(this.field2366, 6406, 64, false, var5, 6406);
            this.field982[2] = new class181(this.field2366, 6406, 64, false, var3, 6406);
            this.method569();
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 31)
    public final void method552() {
        if (this.field980) {
            if (!this.field979) {
                this.field2366.method176(2);
                this.field2366.method207((class4) null);
            }
            this.field2366.method176(1);
            this.field2366.method207((class4) null);
            this.field2366.method176(0);
            this.field981.method1427('\u0001');
            this.field980 = false;
        } else {
            this.field2366.method223(0, 5890, 770);
        }
        this.field2366.method145(8448, 8448);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 51)
    public final void method556(boolean arg0) {
        this.field2366.method145(8448, 7681);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lvd;)V", line = 163)
    public final void method557(class4 arg0) {
        this.field2366.method207(arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 167)
    public final void method553(int arg0) {
        if (this.field980) {
            this.field2366.method176(1);
            this.field2366.method207(this.field982[arg0 - 1]);
            this.field2366.method176(0);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 177)
    private final void method569() {
        opengl var1 = this.field2366.field198;
        this.field981 = new class205(this.field2366, 2);
        this.field981.method1426(0);
        this.field2366.method176(1);
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
        if (this.field979) {
            this.field2366.method145(260, 7681);
            this.field2366.method93(0, 5890, 770);
            this.field2366.method223(0, 34167, 770);
        } else {
            this.field2366.method145(7681, 8448);
            this.field2366.method93(0, 34168, 768);
            this.field2366.method176(2);
            this.field2366.method145(260, 7681);
            this.field2366.method93(0, 34168, 768);
            this.field2366.method93(1, 34168, 770);
            this.field2366.method223(0, 34167, 770);
        }
        this.field2366.method176(0);
        this.field981.method1425();
        this.field981.method1426(1);
        this.field2366.method176(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field979) {
            this.field2366.method145(8448, 8448);
            this.field2366.method93(0, 5890, 768);
            this.field2366.method223(0, 5890, 770);
        } else {
            this.field2366.method145(8448, 8448);
            this.field2366.method93(0, 5890, 768);
            this.field2366.method176(2);
            this.field2366.method145(8448, 8448);
            this.field2366.method93(0, 5890, 768);
            this.field2366.method93(1, 34168, 768);
            this.field2366.method223(0, 5890, 770);
        }
        this.field2366.method176(0);
        this.field981.method1425();
    }
}
