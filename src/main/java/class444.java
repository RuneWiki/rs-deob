import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class444 extends class279 {

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "Z")
    private boolean field6442 = false;

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "Lhb;")
    private class585 field6441;

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6440;

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6444;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6443;

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6446;

    @OriginalMember(owner = "client!oha", name = "x", descriptor = "Lrm;")
    private class90 field6451;

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "Z")
    private boolean field6445;

    @OriginalMember(owner = "client!oha", name = "v", descriptor = "[F")
    private static float[] field6449 = new float[16];

    @OriginalMember(owner = "client!oha", name = "w", descriptor = "[F")
    private static float[] field6450 = new float[4];

    @OriginalMember(owner = "client!oha", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6448;

    @OriginalMember(owner = "client!oha", name = "t", descriptor = "Z")
    private boolean field6447;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(Z)V")
    public final void method440(boolean arg0) {
        if (arg0) {
            this.method442(true);
        }
        if (this.field6448 != null) {
            IDirect3DDevice var2 = this.field6441.field8281;
            class341 var3 = this.field6441.method398(3535);
            var2.method4121(0, var3.method2196(29340, field6449));
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (arg0 != -6910) {
            this.method442(true);
        }
        if (this.field6448 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6441.field8281;
        int var3 = this.field4267.method377();
        int var4 = this.field4267.method294();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method4117(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method4117(11, 1.0F / (float) this.field4267.method383(1), (float) this.field4267.method429((byte) 117) / 255.0F, this.field4267.field653, 1.0F / (this.field4267.field653 - this.field4267.field621));
        this.field4267.method228(2, this.field4267.method376(-122));
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V")
    public final void method1818(byte arg0) {
        IDirect3DDevice var2 = this.field6441.field8281;
        int var3 = this.field4267.method360(0);
        class341 var4 = this.field4267.method404(-1);
        IDirect3DVertexShader var5;
        if (this.field6447) {
            var5 = var3 == Integer.MAX_VALUE ? this.field6444 : this.field6446;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field6440 : this.field6443;
        }
        if (arg0 <= 45) {
            return;
        }
        if (this.field6448 != var5) {
            this.field6448 = var5;
            this.field6441.method3374(var5, true);
            this.method2716((byte) 32);
            this.method436(0);
            this.method434(-1);
            this.method440(false);
            this.method433(124);
            this.method439(-6910);
        }
        var4.method2200(0.0F, (float) var3, -8429, 0.0F, -1.0F, field6450);
        var2.method4121(12, field6450);
    }

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)V")
    public final void method436(int arg0) {
        if (this.field6448 != null) {
            IDirect3DDevice var2 = this.field6441.field8281;
            var2.method4121(4, this.field4267.method335((byte) -74, field6449));
        }
        if (arg0 != 0) {
            this.field6447 = true;
        }
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(B)V")
    private final void method2716(byte arg0) {
        if (this.field6448 != null && this.field6447) {
            class341 var2 = this.field4267.method247(-20019);
            IDirect3DDevice var3 = this.field6441.field8281;
            var3.method4117(13, this.field4267.field651 * this.field4267.field626, this.field4267.field651 * this.field4267.field593, this.field4267.field661 * this.field4267.field651, 1.0F);
            var3.method4117(14, this.field4267.field632 * this.field4267.field626, this.field4267.field632 * this.field4267.field593, this.field4267.field661 * this.field4267.field632, 1.0F);
            var3.method4117(16, this.field4267.field626 * this.field4267.field620, this.field4267.field620 * this.field4267.field593, this.field4267.field661 * this.field4267.field620, 1.0F);
            var2.method2183(this.field4267.field642[2], (byte) -11, this.field4267.field642[1], this.field4267.field642[0], field6450);
            var3.SetVertexShaderConstantF(15, field6450, 1);
            var2.method2183(this.field4267.field573[2], (byte) -10, this.field4267.field573[1], this.field4267.field573[0], field6450);
            var3.SetVertexShaderConstantF(17, field6450, 1);
        }
        int var4 = 53 / ((-arg0 - 45) / 41);
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lhb;Lla;)V")
    public class444(class585 arg0, class422 arg1) {
        super(arg0);
        this.field6441 = arg0;
        if (arg1 == null || (this.field6441.field8266.VertexShaderVersion & 0xFFFF) < 257) {
            this.field6445 = false;
        } else {
            this.field6440 = this.field6441.field8281.method4120(arg1.method2638("uw_ground_unlit", 72, "dx"));
            this.field6444 = this.field6441.field8281.method4120(arg1.method2638("uw_ground_lit", 90, "dx"));
            this.field6443 = this.field6441.field8281.method4120(arg1.method2638("uw_model_unlit", 35, "dx"));
            this.field6446 = this.field6441.field8281.method4120(arg1.method2638("uw_model_lit", 103, "dx"));
            if (this.field6446 != null & this.field6440 != null & this.field6444 != null & this.field6443 != null) {
                this.field6451 = this.field4267.method265(1, false, 2, new int[] { 0, -1 }, 0);
                this.field6451.method597(15, false, false);
                this.field6445 = true;
            } else {
                this.field6445 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
    public final void method443(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method438((byte) 17);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)Z")
    public final boolean method438(byte arg0) {
        if (arg0 > -32) {
            this.method433(-52);
        }
        return this.field6445;
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
    public final void method433(int arg0) {
        if (this.field6448 != null) {
            IDirect3DDevice var2 = this.field6441.field8281;
            class341 var3 = this.field6441.method398(3535);
            var2.method4121(0, var3.method2196(29340, field6449));
        }
        if (arg0 <= 109) {
            field6449 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (this.field6448 != null) {
            IDirect3DDevice var2 = this.field6441.field8281;
            class341 var3 = this.field4267.method263(false);
            var2.SetVertexShaderConstantF(8, var3.method2201(field6449, (byte) -88), 2);
        }
        if (arg0 != -1) {
            this.method2716((byte) 23);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)V")
    public final void method435(boolean arg0, int arg1) {
        if (arg1 != 2048) {
            this.method442(false);
        }
        this.field6447 = arg0;
        this.field4267.method411(1, (byte) -127);
        this.field4267.method215(8, this.field6451);
        this.field4267.method365(class107.field1555, class750.field10454, (byte) -122);
        this.field4267.method321(class327.field4819, 0, (byte) -95);
        this.field4267.method338(2, class388.field5817, false, true, 31181);
        this.field4267.method227(0, class493.field7145, 70);
        this.field4267.method411(0, (byte) -128);
        this.method1818((byte) 84);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        this.field4267.method411(1, (byte) -86);
        if (arg0) {
            this.method443(87, -82, -43);
        }
        this.field4267.method215(8, null);
        this.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
        this.field4267.method321(class388.field5817, 0, (byte) -95);
        this.field4267.method321(class327.field4819, 2, (byte) -95);
        this.field4267.method227(0, class388.field5817, 70);
        this.field4267.method411(0, (byte) -116);
        if (this.field6442) {
            this.field4267.method321(class388.field5817, 0, (byte) -95);
            this.field4267.method227(0, class388.field5817, 70);
            this.field6442 = false;
        }
        if (this.field6448 != null) {
            this.field6441.method3374(null, true);
            this.field6448 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BZ)V")
    public final void method441(byte arg0, boolean arg1) {
        if (arg0 != 9) {
            this.field6441 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZLiu;)V")
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        if (arg1) {
            return;
        }
        if (arg2 != null) {
            if (this.field6442) {
                this.field4267.method321(class388.field5817, 0, (byte) -95);
                this.field4267.method227(0, class388.field5817, 70);
                this.field6442 = false;
            }
            this.field4267.method215(8, arg2);
            this.field4267.method405(arg0, (byte) 121);
        } else if (!this.field6442) {
            this.field4267.method215(8, this.field4267.field622);
            this.field4267.method405(1, (byte) 121);
            this.field4267.method321(class493.field7145, 0, (byte) -95);
            this.field4267.method227(0, class493.field7145, 70);
            this.field6442 = true;
        }
    }
}
