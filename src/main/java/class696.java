import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class696 extends class384 {

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Lwt;")
    private class309 field9797;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lhl;")
    private class527 field9802;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9801;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field9803;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Z")
    private boolean field9799;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "[F")
    private static float[] field9800 = new float[16];

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Z")
    private boolean field9798;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method30(boolean arg0, byte arg1) {
        if (arg1 < 78) {
            this.method524(-45);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lke;BI)V", line = 14)
    public final void method27(class596 arg0, byte arg1, int arg2) {
        if (arg1 != 123) {
            this.field9799 = true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)V", line = 24)
    public final void method526(byte arg0) {
        if (arg0 >= -45) {
            this.method27(null, (byte) 0, -12);
        }
        if (this.field9798) {
            IDirect3DDevice var2 = this.field9802.field7501;
            class427 var3 = this.field5349.method2258(121);
            var2.SetVertexShaderConstantF(12, var3.method2662(field9800, (byte) -98), 2);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)V", line = 44)
    public final void method24(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.field9798 = true;
        }
        class460 var3 = this.field5349.method2238(arg1 ^ 0xFFFFFFFE);
        if (!this.field9799 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field9802.field7501;
        this.field9802.method3083(this.field9801, 30941);
        this.field9802.method3084(false, this.field9803);
        this.field5349.method2217(1, 126);
        this.field5349.method2207((byte) -61, var3);
        this.field5349.method2217(0, 69);
        this.field5349.method2207((byte) -61, this.field9797.field3839);
        this.field9798 = true;
        this.method527((byte) 46);
        this.method526((byte) -123);
        this.method524(2976);
        this.method528((byte) 37);
        var4.method2906(1, -this.field5349.field5076[0], -this.field5349.field5076[1], -this.field5349.field5076[2], 0.0F);
        var4.method2906(2, this.field5349.field5078, this.field5349.field5067, this.field5349.field5079, 1.0F);
        var4.method2906(3, Math.abs(this.field5349.field5076[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIZ)V", line = 74)
    public final void method32(int arg0, int arg1, boolean arg2) {
        if (!arg2 || !this.field9798) {
            return;
        }
        IDirect3DDevice var4 = this.field9802.field7501;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x3E) >> 3)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        float var8 = (float) ((arg1 & 0x3FADF) >> 16) / 8.0F;
        var4.method2900(14, (float) (this.field5349.field5152 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method2900(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2906(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2906(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)Z", line = 101)
    public final boolean method26(int arg0) {
        return arg0 == 13326 ? this.field9799 : false;
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(B)V", line = 112)
    public final void method527(byte arg0) {
        if (arg0 != 46 || !this.field9798) {
            return;
        }
        IDirect3DDevice var2 = this.field9802.field7501;
        class427 var3 = this.field9802.method2222(arg0 - 54);
        class427 var4 = this.field9802.method2203((byte) -120);
        var2.method2899(0, var4.method2657((byte) -64, field9800));
        var2.method2899(4, var3.method2658(field9800, -69));
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V", line = 134)
    public final void method528(byte arg0) {
        if (arg0 != 37) {
            this.field9798 = true;
        }
        if (!this.field9798) {
            return;
        }
        IDirect3DDevice var2 = this.field9802.field7501;
        if (this.field5349.field5088 > 0) {
            float var3 = this.field5349.field5089;
            float var4 = this.field5349.field5153;
            var2.method2900(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method2900(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method2906(0, (float) (this.field5349.field5117 >> 16 & 0xFF) / 255.0F, (float) ((this.field5349.field5117 & 0xFFAE) >> 8) / 255.0F, (float) (this.field5349.field5117 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lhl;Loh;Lwt;)V", line = 162)
    public class696(class527 arg0, class404 arg1, class309 arg2) {
        super(arg0);
        this.field9797 = arg2;
        this.field9802 = arg0;
        if (arg1 != null && this.field5349.field5113 && this.field5349.field5082 && (this.field9802.field7516.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field9801 = this.field9802.field7501.method2909(arg1.method2471((byte) -115, "dx", "environment_mapped_water_v"));
            this.field9803 = this.field9802.field7501.method2913(arg1.method2471((byte) -95, "dx", "environment_mapped_water_f"));
            this.field9799 = this.field9801 != null && this.field9803 != null && this.field9797.method1841(-15461);
        } else {
            this.field9799 = false;
            this.field9801 = null;
            this.field9803 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 186)
    public final void method31(byte arg0) {
        if (this.field9798) {
            this.field9802.method3083(null, 30941);
            this.field9802.method3084(false, null);
            this.field5349.method2217(1, 104);
            this.field5349.method2207((byte) -61, null);
            this.field5349.method2217(0, 117);
            this.field5349.method2207((byte) -61, null);
            this.field9798 = false;
        }
        if (arg0 >= -18) {
            this.field9798 = true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V", line = 208)
    public final void method524(int arg0) {
        if (this.field9798) {
            IDirect3DDevice var2 = this.field9802.field7501;
            var2.method2899(8, this.field5349.method2262(true, field9800));
        }
        if (arg0 != 2976) {
            this.method524(69);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 228)
    public final void method525(int arg0) {
        if (this.field9798) {
            IDirect3DDevice var2 = this.field9802.field7501;
            class427 var3 = this.field9802.method2203((byte) -117);
            var2.method2899(0, var3.method2657((byte) -64, field9800));
        }
        if (arg0 != -7112) {
            this.method525(71);
        }
    }
}
