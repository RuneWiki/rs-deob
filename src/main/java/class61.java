import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class61 extends class262 {

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lvt;")
    private class276 field992;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Lkaa;")
    private class44 field993;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field995;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field994;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Z")
    private boolean field991;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "[F")
    private static float[] field989 = new float[16];

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
    private boolean field990;

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lkaa;Ljn;Lvt;)V", line = 3)
    public class61(class44 arg0, class668 arg1, class276 arg2) {
        super(arg0);
        this.field992 = arg2;
        this.field993 = arg0;
        if (arg1 != null && this.field3601.field5526 && this.field3601.field5486 && (this.field993.field776.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field995 = this.field993.field797.method2658(arg1.method3778(101, "dx", "environment_mapped_water_v"));
            this.field994 = this.field993.field797.method2649(arg1.method3778(57, "dx", "environment_mapped_water_f"));
            this.field991 = this.field995 != null && this.field994 != null && this.field992.method1672(-75);
        } else {
            this.field994 = null;
            this.field991 = false;
            this.field995 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 26)
    public final void method593(int arg0) {
        if (this.field990) {
            IDirect3DDevice var2 = this.field993.field797;
            if (this.field3601.field5449 <= 0) {
                var2.method2651(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field3601.field5468;
                float var4 = this.field3601.field5488;
                var2.method2651(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2650(0, (float) ((this.field3601.field5471 & 0xFFC293) >> 16) / 255.0F, (float) (this.field3601.field5471 >> 8 & 0xFF) / 255.0F, (float) (this.field3601.field5471 & 0xFF) / 255.0F, 0.0F);
        }
        int var5 = -102 % ((arg0 + 41) / 52);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILoa;B)V", line = 55)
    public final void method371(int arg0, class644 arg1, byte arg2) {
        if (arg2 < 80) {
            field989 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 64)
    public final void method594(int arg0) {
        if (arg0 == 3 && this.field990) {
            IDirect3DDevice var2 = this.field993.field797;
            var2.method2654(8, this.field3601.method2366(field989, true));
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI)V", line = 81)
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method375(13);
        }
        if (!this.field990) {
            return;
        }
        IDirect3DDevice var4 = this.field993.field797;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        var4.method2651(14, (float) (this.field3601.field5487 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) ((arg2 & 0x3EF65) >> 16) / 8.0F;
        var4.method2651(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2650(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2650(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z", line = 110)
    public final boolean method375(int arg0) {
        if (arg0 != -18095) {
            this.method593(-60);
        }
        return this.field991;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V", line = 123)
    public final void method377(int arg0, boolean arg1) {
        if (arg0 <= 37) {
            return;
        }
        class629 var3 = this.field3601.method2372((byte) 110);
        if (!this.field991 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field993.field797;
        var4.SetVertexShader(this.field995);
        var4.SetPixelShader(this.field994);
        this.field3601.method2318(1, -30954);
        this.field3601.method2316((byte) 113, var3);
        this.field3601.method2318(0, -30954);
        this.field3601.method2316((byte) 102, this.field992.field3768);
        this.field990 = true;
        this.method595((byte) 47);
        this.method596((byte) 65);
        this.method594(3);
        this.method593(80);
        var4.method2650(1, -this.field3601.field5520[0], -this.field3601.field5520[1], -this.field3601.field5520[2], 0.0F);
        var4.method2650(2, this.field3601.field5446, this.field3601.field5512, this.field3601.field5481, 1.0F);
        var4.method2650(3, Math.abs(this.field3601.field5520[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 156)
    public final void method374(int arg0) {
        if (this.field990) {
            IDirect3DDevice var2 = this.field993.field797;
            var2.SetVertexShader(null);
            var2.SetPixelShader(null);
            this.field3601.method2318(1, -30954);
            this.field3601.method2316((byte) 118, null);
            this.field3601.method2318(0, -30954);
            this.field3601.method2316((byte) 123, null);
            this.field990 = false;
        }
        if (arg0 <= 42) {
            this.field994 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V", line = 180)
    public final void method372(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method371(11, null, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 189)
    public final void method595(byte arg0) {
        if (arg0 != 47) {
            this.field990 = false;
        }
        if (!this.field990) {
            return;
        }
        IDirect3DDevice var2 = this.field993.field797;
        class653 var3 = this.field993.method2343(12328);
        class653 var4 = this.field993.method2354((byte) -107);
        var2.method2654(0, var4.method3692(-13671, field989));
        var2.method2654(4, var3.method3697(false, field989));
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 211)
    public final void method596(byte arg0) {
        if (this.field990) {
            IDirect3DDevice var2 = this.field993.field797;
            class653 var3 = this.field3601.method2311((byte) -119);
            var2.SetVertexShaderConstantF(12, var3.method3680(field989, -8), 2);
        }
        if (arg0 < 9) {
            this.method375(-78);
        }
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V", line = 230)
    public final void method597(int arg0) {
        if (arg0 == 16383 && this.field990) {
            IDirect3DDevice var2 = this.field993.field797;
            class653 var3 = this.field993.method2354((byte) 91);
            var2.method2654(0, var3.method3692(-13671, field989));
        }
    }
}
