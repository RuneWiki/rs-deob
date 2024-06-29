import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class146 extends class42 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Z")
    private boolean field2184 = false;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
    private boolean field2185;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "[Lwl;")
    private class234[] field2186;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Loc;")
    private class112 field2187;

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lig;)V")
    public class146(class132 arg0) {
        super(arg0);
        if (arg0.field1968) {
            this.field2185 = arg0.field1975 < 3;
            int var2 = this.field2185 ? 48 : 127;
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
            this.field2186 = new class234[3];
            this.field2186[0] = new class234(this.field582, 6406, 64, false, var4, 6406);
            this.field2186[1] = new class234(this.field582, 6406, 64, false, var5, 6406);
            this.field2186[2] = new class234(this.field582, 6406, 64, false, var3, 6406);
            this.method1085();
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lee;)V")
    public final void method286(class404 arg0) {
        this.field582.method888(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()V")
    private final void method1085() {
        opengl var1 = this.field582.field1918;
        this.field2187 = new class112(this.field582, 2);
        this.field2187.method678(0);
        this.field582.method1002(1);
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
        if (this.field2185) {
            this.field582.method926(260, 7681);
            this.field582.method949(0, 5890, 770);
            this.field582.method958(0, 34167, 770);
        } else {
            this.field582.method926(7681, 8448);
            this.field582.method949(0, 34168, 768);
            this.field582.method1002(2);
            this.field582.method926(260, 7681);
            this.field582.method949(0, 34168, 768);
            this.field582.method949(1, 34168, 770);
            this.field582.method958(0, 34167, 770);
        }
        this.field582.method1002(0);
        this.field2187.method679();
        this.field2187.method678(1);
        this.field582.method1002(1);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glDisable(3170);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        if (this.field2185) {
            this.field582.method926(8448, 8448);
            this.field582.method949(0, 5890, 768);
            this.field582.method958(0, 5890, 770);
        } else {
            this.field582.method926(8448, 8448);
            this.field582.method949(0, 5890, 768);
            this.field582.method1002(2);
            this.field582.method926(8448, 8448);
            this.field582.method949(0, 5890, 768);
            this.field582.method949(1, 34168, 768);
            this.field582.method958(0, 5890, 770);
        }
        this.field582.method1002(0);
        this.field2187.method679();
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()V")
    public final void method291() {
        if (this.field2184) {
            if (!this.field2185) {
                this.field582.method1002(2);
                this.field582.method888((class404) null);
            }
            this.field582.method1002(1);
            this.field582.method888((class404) null);
            this.field582.method1002(0);
            this.field2187.method677('\u0001');
            this.field2184 = false;
        } else {
            this.field582.method958(0, 5890, 770);
        }
        this.field582.method926(8448, 8448);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public final void method288(boolean arg0) {
        this.field582.method926(8448, 7681);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public final void method290(int arg0) {
        if (this.field2184) {
            this.field582.method1002(1);
            this.field582.method888(this.field2186[arg0 - 1]);
            this.field582.method1002(0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()Z")
    public final boolean method287() {
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        if (this.field2187 == null || !arg0) {
            this.field582.method958(0, 34168, 770);
            return;
        }
        if (!this.field2185) {
            this.field582.method1002(2);
            this.field582.method888(this.field582.field2047);
            this.field582.method1002(0);
        }
        this.field2187.method677('\u0000');
        this.field2184 = true;
    }
}
