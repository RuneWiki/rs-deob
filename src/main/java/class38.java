import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class38 extends class232 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Z")
    private boolean field549 = false;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Z")
    private boolean field547;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lds;")
    private class10[] field548;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lbb;")
    private class182 field550;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()V", line = 3)
    public final void method352() {
        if (this.field549) {
            if (!this.field547) {
                this.field3348.method1566(2);
                this.field3348.method1559((class127) null);
            }
            this.field3348.method1566(1);
            this.field3348.method1559((class127) null);
            this.field3348.method1566(0);
            this.field550.method1193('\u0001');
            this.field549 = false;
        } else {
            this.field3348.method1572(0, 5890, 770);
        }
        this.field3348.method1542(8448, 8448);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()V", line = 27)
    private final void method353() {
        opengl var1 = this.field3348.field3184;
        this.field550 = new class182(this.field3348, 2);
        this.field550.method1192(0);
        this.field3348.method1566(1);
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
        if (this.field547) {
            this.field3348.method1542(260, 7681);
            this.field3348.method1512(0, 5890, 770);
            this.field3348.method1572(0, 34167, 770);
        } else {
            this.field3348.method1542(7681, 8448);
            this.field3348.method1512(0, 34168, 768);
            this.field3348.method1566(2);
            this.field3348.method1542(260, 7681);
            this.field3348.method1512(0, 34168, 768);
            this.field3348.method1512(1, 34168, 770);
            this.field3348.method1572(0, 34167, 770);
        }
        this.field3348.method1566(0);
        this.field550.method1191();
        this.field550.method1192(1);
        this.field3348.method1566(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field547) {
            this.field3348.method1542(8448, 8448);
            this.field3348.method1512(0, 5890, 768);
            this.field3348.method1572(0, 5890, 770);
        } else {
            this.field3348.method1542(8448, 8448);
            this.field3348.method1512(0, 5890, 768);
            this.field3348.method1566(2);
            this.field3348.method1542(8448, 8448);
            this.field3348.method1512(0, 5890, 768);
            this.field3348.method1512(1, 34168, 768);
            this.field3348.method1572(0, 5890, 770);
        }
        this.field3348.method1566(0);
        this.field550.method1191();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ltb;)V", line = 89)
    public class38(class227 arg0) {
        super(arg0);
        if (arg0.field3296) {
            this.field547 = arg0.field3261 < 3;
            int var2 = this.field547 ? 48 : 127;
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
            this.field548 = new class10[3];
            this.field548[0] = new class10(this.field3348, 6406, 64, false, var4, 6406);
            this.field548[1] = new class10(this.field3348, 6406, 64, false, var5, 6406);
            this.field548[2] = new class10(this.field3348, 6406, 64, false, var3, 6406);
            this.method353();
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 197)
    public final void method354(boolean arg0) {
        if (this.field550 == null || !arg0) {
            this.field3348.method1572(0, 34168, 770);
            return;
        }
        if (!this.field547) {
            this.field3348.method1566(2);
            this.field3348.method1559(this.field3348.field3279);
            this.field3348.method1566(0);
        }
        this.field550.method1193('\u0000');
        this.field549 = true;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 216)
    public final void method355(int arg0) {
        if (this.field549) {
            this.field3348.method1566(1);
            this.field3348.method1559(this.field548[arg0 - 1]);
            this.field3348.method1566(0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lue;)V", line = 230)
    public final void method356(class127 arg0) {
        this.field3348.method1559(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 233)
    public final void method357(boolean arg0) {
        this.field3348.method1542(8448, 7681);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Z", line = 238)
    public final boolean method358() {
        return true;
    }
}
