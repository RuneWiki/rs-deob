import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class655 extends class266 {

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "Ldb;")
    private class292 field9234;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "Lvg;")
    private class49 field9236;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9237;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "[F")
    private static float[] field9235 = new float[16];

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)V", line = 4)
    public final void method146(byte arg0) {
        if (arg0 < -102 && this.field9237 != null) {
            IDirect3DDevice var2 = this.field9236.field720;
            var2.method2549(4, this.field3785.method3230(field9235, (byte) 80));
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 23)
    public final void method152(int arg0) {
        if (arg0 == 0 && this.field9237 != null) {
            IDirect3DDevice var2 = this.field9236.field720;
            class367 var3 = this.field9236.method3196(-121);
            var2.method2549(0, var3.method2142((byte) 124, field9235));
        }
    }

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "(I)Z", line = 41)
    public final boolean method154(int arg0) {
        if (arg0 <= 101) {
            this.method156(-33, 35, 116);
        }
        return this.field9237 != null;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(IZ)V", line = 52)
    public final void method144(int arg0, boolean arg1) {
        this.field3785.method3193(class175.field2614, client.field3838, 0);
        if (arg0 != 1) {
            this.field9236 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZ)V", line = 62)
    public final void method148(int arg0, boolean arg1) {
        this.field9236.field720.SetVertexShader(this.field9237);
        this.field3785.method3177(0, 53, class558.field7530);
        this.field3785.method3177(1, arg0 + 60, class22.field305);
        this.field3785.method316(true, class391.field5472, false, 2, false);
        this.field3785.method3221(false, 512);
        this.method152(arg0);
        this.method145((byte) 108);
        this.method146((byte) -128);
        this.method151(-91);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lek;IB)V", line = 81)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        if (arg2 >= -56) {
            field9235 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V", line = 91)
    public final void method156(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field9236.field720;
        if (this.field9234.field4397) {
            float var5 = (float) (this.field3785.field8003 % 4000) / 4000.0F;
            this.field3785.method3232(false, this.field9234.field4390);
            var4.method2545(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field3785.field8003 % 4000 * 16 / 4000;
            this.field3785.method3232(false, this.field9234.field4393[var6]);
            var4.method2545(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            this.field9236 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "(I)V", line = 116)
    public final void method151(int arg0) {
        if (this.field9237 != null) {
            IDirect3DDevice var2 = this.field9236.field720;
            if (this.field3785.field8005 > 0) {
                float var3 = this.field3785.field8037;
                float var4 = this.field3785.field8031;
                float var5 = var4 - 512.0F;
                var2.method2545(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2545(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field3785.method3248((byte) -126, this.field3785.field8002);
        }
        if (arg0 >= -1) {
            this.method155(true);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V", line = 146)
    public final void method155(boolean arg0) {
        this.field9236.field720.SetVertexShader(null);
        this.field3785.method3177(0, 121, class558.field7530);
        if (arg0) {
            this.field9234 = null;
        }
        this.field3785.method3177(1, 107, class391.field5472);
        this.field3785.method3177(2, 84, class22.field305);
        this.field3785.method3221(true, 512);
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lvg;Lpj;Ldb;)V", line = 160)
    public class655(class49 arg0, class132 arg1, class292 arg2) {
        super(arg0);
        this.field9234 = arg2;
        this.field9236 = arg0;
        if (this.field9234.method1832(-103) && (this.field9236.field723.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field9237 = this.field9236.field720.method2548(arg1.method937("transparent_water", "dx", 0));
        } else {
            this.field9237 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "(I)V", line = 178)
    public final void method153(int arg0) {
        if (arg0 >= -93) {
            this.method156(7, 127, -12);
        }
        if (this.field9237 != null) {
            IDirect3DDevice var2 = this.field9236.field720;
            class367 var3 = this.field9236.method3196(-123);
            var2.method2549(0, var3.method2142((byte) 125, field9235));
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V", line = 196)
    public final void method145(byte arg0) {
        if (arg0 <= 65) {
            this.field9237 = null;
        }
        if (this.field9237 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field9236.field720;
        class367 var3 = this.field3785.method3171(-19068);
        var3.method2155(field9235, -100);
        field9235[6] *= 0.25F;
        field9235[2] *= 0.25F;
        field9235[1] *= 0.25F;
        field9235[4] *= 0.25F;
        field9235[0] *= 0.25F;
        field9235[7] *= 0.25F;
        field9235[5] *= 0.25F;
        field9235[3] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field9235, 2);
    }
}
