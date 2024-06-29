import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class321 extends class399 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
    private boolean field4536 = false;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Z")
    private boolean field4537;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[Lbc;")
    private class205[] field4538;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lel;")
    private class325 field4535;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V", line = 3)
    public final void method374(boolean arg0) {
        if (this.field4535 == null || !arg0) {
            this.field5798.method2087(0, 34168, 770);
            return;
        }
        if (!this.field4537) {
            this.field5798.method2062(2);
            this.field5798.method2085(this.field5798.field4878);
            this.field5798.method2062(0);
        }
        this.field4535.method2003('\u0000');
        this.field4536 = true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lfl;)V", line = 22)
    public final void method376(class439 arg0) {
        this.field5798.method2085(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lpo;)V", line = 68)
    public class321(class332 arg0) {
        super(arg0);
        if (arg0.field4797) {
            this.field4537 = arg0.field4842 < 3;
            int var2 = this.field4537 ? 48 : 127;
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
            this.field4538 = new class205[3];
            this.field4538[0] = new class205(this.field5798, 6406, 64, false, var4, 6406);
            this.field4538[1] = new class205(this.field5798, 6406, 64, false, var5, 6406);
            this.field4538[2] = new class205(this.field5798, 6406, 64, false, var3, 6406);
            this.method1994();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 32)
    public final void method379() {
        if (this.field4536) {
            if (!this.field4537) {
                this.field5798.method2062(2);
                this.field5798.method2085((class439) null);
            }
            this.field5798.method2062(1);
            this.field5798.method2085((class439) null);
            this.field5798.method2062(0);
            this.field4535.method2003('\u0001');
            this.field4536 = false;
        } else {
            this.field5798.method2087(0, 5890, 770);
        }
        this.field5798.method2100(8448, 8448);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 56)
    public final void method377(int arg0) {
        if (this.field4536) {
            this.field5798.method2062(1);
            this.field5798.method2085(this.field4538[arg0 - 1]);
            this.field5798.method2062(0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 65)
    public final void method378(boolean arg0) {
        this.field5798.method2100(8448, 7681);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()Z", line = 176)
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 180)
    private final void method1994() {
        opengl var1 = this.field5798.field4752;
        this.field4535 = new class325(this.field5798, 2);
        this.field4535.method2005(0);
        this.field5798.method2062(1);
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
        if (this.field4537) {
            this.field5798.method2100(260, 7681);
            this.field5798.method2086(0, 5890, 770);
            this.field5798.method2087(0, 34167, 770);
        } else {
            this.field5798.method2100(7681, 8448);
            this.field5798.method2086(0, 34168, 768);
            this.field5798.method2062(2);
            this.field5798.method2100(260, 7681);
            this.field5798.method2086(0, 34168, 768);
            this.field5798.method2086(1, 34168, 770);
            this.field5798.method2087(0, 34167, 770);
        }
        this.field5798.method2062(0);
        this.field4535.method2004();
        this.field4535.method2005(1);
        this.field5798.method2062(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field4537) {
            this.field5798.method2100(8448, 8448);
            this.field5798.method2086(0, 5890, 768);
            this.field5798.method2087(0, 5890, 770);
        } else {
            this.field5798.method2100(8448, 8448);
            this.field5798.method2086(0, 5890, 768);
            this.field5798.method2062(2);
            this.field5798.method2100(8448, 8448);
            this.field5798.method2086(0, 5890, 768);
            this.field5798.method2086(1, 34168, 768);
            this.field5798.method2087(0, 5890, 770);
        }
        this.field5798.method2062(0);
        this.field4535.method2004();
    }
}
