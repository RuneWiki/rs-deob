import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class56 extends class695 {

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lmba;")
    private class70 field751;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field757;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field754;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field753;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field750;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Z")
    private boolean field748;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "[F")
    private static float[] field756 = new float[16];

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[F")
    private static float[] field755 = new float[4];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field749;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
    private boolean field752;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lnm;ZI)V")
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method496(-1);
        }
        this.field9493.method3091(!arg1, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        if (arg2 < 69) {
            this.field757 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lmba;Lpe;)V")
    public class56(class70 arg0, class615 arg1) {
        super(arg0);
        this.field751 = arg0;
        if ((this.field751.field944.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field757 = this.field751.field958.method3708(arg1.method3355(0, "uw_ground_unlit", "dx"));
            this.field754 = this.field751.field958.method3708(arg1.method3355(0, "uw_ground_lit", "dx"));
            this.field753 = this.field751.field958.method3708(arg1.method3355(0, "uw_model_unlit", "dx"));
            this.field750 = this.field751.field958.method3708(arg1.method3355(0, "uw_model_lit", "dx"));
            this.field748 = this.field753 != null & this.field754 != null & this.field757 != null & this.field750 != null;
        } else {
            this.field748 = false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public final void method490(byte arg0) {
        if (this.field749 != null) {
            IDirect3DDevice var2 = this.field751.field958;
            class131 var3 = this.field751.method3074((byte) -97);
            var2.method3714(0, var3.method944(field756, 49));
        }
        if (arg0 != 48) {
            this.field748 = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method491(int arg0) {
        if (this.field749 != null) {
            this.field751.field958.SetVertexShader(null);
            this.field749 = null;
        }
        if (arg0 < 38) {
            this.method497(-71);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (this.field749 != null) {
            IDirect3DDevice var2 = this.field751.field958;
            var2.method3714(4, this.field9493.method3121(field756, 13));
        }
        if (arg0 > -39) {
            field756 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    private final void method493(int arg0) {
        if (this.field749 != null && this.field752) {
            class131 var2 = this.field9493.method3103((byte) 73);
            IDirect3DDevice var3 = this.field751.field958;
            var3.method3711(13, this.field9493.field7713 * this.field9493.field7678, this.field9493.field7767 * this.field9493.field7678, this.field9493.field7760 * this.field9493.field7678, 1.0F);
            var3.method3711(14, this.field9493.field7742 * this.field9493.field7713, this.field9493.field7767 * this.field9493.field7742, this.field9493.field7760 * this.field9493.field7742, 1.0F);
            var3.method3711(16, this.field9493.field7749 * this.field9493.field7713, this.field9493.field7767 * this.field9493.field7749, this.field9493.field7760 * this.field9493.field7749, 1.0F);
            var2.method937(this.field9493.field7779[1], field755, this.field9493.field7779[2], this.field9493.field7779[0], false);
            var3.SetVertexShaderConstantF(15, field755, 1);
            var2.method937(this.field9493.field7679[1], field755, this.field9493.field7679[2], this.field9493.field7679[0], false);
            var3.SetVertexShaderConstantF(15, field755, 1);
        }
        if (arg0 > -87) {
            this.method494(false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Z")
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            this.field757 = null;
        }
        return this.field748;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V")
    public final void method495(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.method499((byte) 12);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method496(int arg0) {
        if (arg0 < -39 && this.field749 != null) {
            IDirect3DDevice var2 = this.field751.field958;
            class131 var3 = this.field9493.method3128(0);
            var2.SetVertexShaderConstantF(8, var3.method952((byte) -70, field756), 2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final void method497(int arg0) {
        if (this.field749 != null) {
            IDirect3DDevice var2 = this.field751.field958;
            class131 var3 = this.field751.method3074((byte) -97);
            var2.method3714(0, var3.method944(field756, 125));
        }
        if (arg0 != 1) {
            this.field753 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
    public final void method498(boolean arg0, byte arg1) {
        if (arg1 >= -82) {
            this.method498(false, (byte) -56);
        }
        this.field752 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public final void method499(byte arg0) {
        IDirect3DDevice var2 = this.field751.field958;
        int var3 = this.field9493.method3090(23203);
        class131 var4 = this.field9493.method3103((byte) 73);
        IDirect3DVertexShader var5;
        if (this.field752) {
            var5 = var3 == Integer.MAX_VALUE ? this.field754 : this.field750;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field757 : this.field753;
        }
        if (this.field749 != var5) {
            this.field749 = var5;
            var2.SetVertexShader(var5);
            this.method493(-98);
            this.method492(-108);
            this.method496(-95);
            this.method497(1);
            this.method490((byte) 48);
            this.method500((byte) 76);
        }
        var4.method941(2, 0.0F, (float) var3, field755, 0.0F, -1.0F);
        var2.method3714(12, field755);
        if (arg0 <= 61) {
            this.field749 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public final void method500(byte arg0) {
        if (this.field749 != null) {
            IDirect3DDevice var2 = this.field751.field958;
            int var3 = this.field9493.method361();
            int var4 = this.field9493.method343();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method3711(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method3711(11, 1.0F / (float) this.field9493.method3134(0), (float) this.field9493.method3135(70) / 255.0F, 0.0F, 0.0F);
        }
        if (arg0 != 76) {
            this.method491(69);
        }
    }
}
