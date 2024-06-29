import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class284 extends class457 {

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
    private boolean field4173 = false;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
    private boolean field4172;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[Lea;")
    private class61[] field4170;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lhd;")
    private class19 field4171;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lvo;)V")
    public final void method63(class205 arg0) {
        this.field6752.method1160(arg0);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (this.field4171 == null || !arg0) {
            this.field6752.method1176(0, 34168, 770);
            return;
        }
        if (!this.field4172) {
            this.field6752.method1150(2);
            this.field6752.method1160(this.field6752.field2357);
            this.field6752.method1150(0);
        }
        this.field4171.method235('\u0000');
        this.field4173 = true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
    public final void method64() {
        if (this.field4173) {
            if (!this.field4172) {
                this.field6752.method1150(2);
                this.field6752.method1160((class205) null);
            }
            this.field6752.method1150(1);
            this.field6752.method1160((class205) null);
            this.field6752.method1150(0);
            this.field4171.method235('\u0001');
            this.field4173 = false;
        } else {
            this.field6752.method1176(0, 5890, 770);
        }
        this.field6752.method1161(8448, 8448);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lks;)V")
    public class284(class173 arg0) {
        super(arg0);
        if (arg0.field2321) {
            this.field4172 = arg0.field2291 < 3;
            int var2 = this.field4172 ? 48 : 127;
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
            this.field4170 = new class61[3];
            this.field4170[0] = new class61(this.field6752, 6406, 64, false, var4, 6406);
            this.field4170[1] = new class61(this.field6752, 6406, 64, false, var5, 6406);
            this.field4170[2] = new class61(this.field6752, 6406, 64, false, var3, 6406);
            this.method1914();
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
    private final void method1914() {
        opengl var1 = this.field6752.field2253;
        this.field4171 = new class19(this.field6752, 2);
        this.field4171.method233(0);
        this.field6752.method1150(1);
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
        if (this.field4172) {
            this.field6752.method1161(260, 7681);
            this.field6752.method1127(0, 5890, 770);
            this.field6752.method1176(0, 34167, 770);
        } else {
            this.field6752.method1161(7681, 8448);
            this.field6752.method1127(0, 34168, 768);
            this.field6752.method1150(2);
            this.field6752.method1161(260, 7681);
            this.field6752.method1127(0, 34168, 768);
            this.field6752.method1127(1, 34168, 770);
            this.field6752.method1176(0, 34167, 770);
        }
        this.field6752.method1150(0);
        this.field4171.method234();
        this.field4171.method233(1);
        this.field6752.method1150(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field4172) {
            this.field6752.method1161(8448, 8448);
            this.field6752.method1127(0, 5890, 768);
            this.field6752.method1176(0, 5890, 770);
        } else {
            this.field6752.method1161(8448, 8448);
            this.field6752.method1127(0, 5890, 768);
            this.field6752.method1150(2);
            this.field6752.method1161(8448, 8448);
            this.field6752.method1127(0, 5890, 768);
            this.field6752.method1127(1, 34168, 768);
            this.field6752.method1176(0, 5890, 770);
        }
        this.field6752.method1150(0);
        this.field4171.method234();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        this.field6752.method1161(8448, 7681);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public final void method60(int arg0) {
        if (this.field4173) {
            this.field6752.method1150(1);
            this.field6752.method1160(this.field4170[arg0 - 1]);
            this.field6752.method1150(0);
        }
    }
}
