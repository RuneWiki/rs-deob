import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class39 extends class279 {

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lhb;")
    private class585 field699;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lno;")
    private class67 field703;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field700;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field702;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
    private boolean field704;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[F")
    private static float[] field701 = new float[16];

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Z")
    private boolean field698;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 4)
    public final void method433(int arg0) {
        if (arg0 < 109) {
            this.field699 = null;
        }
        if (!this.field698) {
            return;
        }
        IDirect3DDevice var2 = this.field699.field8281;
        class341 var3 = this.field699.method404(-1);
        class341 var4 = this.field699.method398(3535);
        var2.method4121(0, var4.method2196(29340, field701));
        var2.method4121(4, var3.method2191(field701, (byte) -98));
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 25)
    public final void method434(int arg0) {
        if (arg0 != -1) {
            this.method433(29);
        }
        if (this.field698) {
            IDirect3DDevice var2 = this.field699.field8281;
            class341 var3 = this.field4267.method263(false);
            var2.SetVertexShaderConstantF(12, var3.method2201(field701, (byte) -67), 2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V", line = 50)
    public final void method435(boolean arg0, int arg1) {
        class295 var3 = this.field4267.method389(arg1 ^ 0x853);
        if (this.field704 && var3 != null) {
            IDirect3DDevice var4 = this.field699.field8281;
            this.field699.method3374(this.field700, true);
            this.field699.method3373(false, this.field702);
            this.field4267.method411(1, (byte) -90);
            this.field4267.method215(8, var3);
            this.field4267.method411(0, (byte) -99);
            this.field4267.method215(8, this.field703.field1055);
            this.field698 = true;
            this.method433(arg1 - 1934);
            this.method434(arg1 - 2049);
            this.method436(0);
            this.method439(-6910);
            var4.method4126(1, -this.field4267.field642[0], -this.field4267.field642[1], -this.field4267.field642[2], 0.0F);
            var4.method4126(2, this.field4267.field626, this.field4267.field593, this.field4267.field661, 1.0F);
            var4.method4126(3, Math.abs(this.field4267.field642[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 2048) {
            this.method441((byte) 31, true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 81)
    public final void method436(int arg0) {
        if (this.field698) {
            IDirect3DDevice var2 = this.field699.field8281;
            var2.method4121(8, this.field4267.method335((byte) -74, field701));
        }
        if (arg0 != 0) {
            field701 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZLiu;)V", line = 101)
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        if (arg1) {
            this.field699 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Z", line = 110)
    public final boolean method438(byte arg0) {
        if (arg0 >= -32) {
            this.field703 = null;
        }
        return this.field704;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 122)
    public final void method439(int arg0) {
        if (this.field698) {
            IDirect3DDevice var2 = this.field699.field8281;
            if (this.field4267.field636 <= 0) {
                var2.method4117(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field4267.field653;
                float var4 = this.field4267.field621;
                var2.method4117(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method4126(0, (float) (this.field4267.field618 >> 16 & 0xFF) / 255.0F, (float) ((this.field4267.field618 & 0xFF50) >> 8) / 255.0F, (float) (this.field4267.field618 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != -6910) {
            this.field703 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lhb;Lla;Lno;)V", line = 149)
    public class39(class585 arg0, class422 arg1, class67 arg2) {
        super(arg0);
        this.field699 = arg0;
        this.field703 = arg2;
        if (arg1 != null && this.field4267.field583 && this.field4267.field574 && (this.field699.field8266.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field700 = this.field699.field8281.method4120(arg1.method2638("environment_mapped_water_v", 127, "dx"));
            this.field702 = this.field699.field8281.method4119(arg1.method2638("environment_mapped_water_f", 26, "dx"));
            this.field704 = this.field700 != null && this.field702 != null && this.field703.method645(true);
        } else {
            this.field702 = null;
            this.field700 = null;
            this.field704 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V", line = 172)
    public final void method440(boolean arg0) {
        if (arg0) {
            this.field699 = null;
        }
        if (this.field698) {
            IDirect3DDevice var2 = this.field699.field8281;
            class341 var3 = this.field699.method398(3535);
            var2.method4121(0, var3.method2196(29340, field701));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BZ)V", line = 190)
    public final void method441(byte arg0, boolean arg1) {
        if (arg0 != 9) {
            this.field698 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 199)
    public final void method442(boolean arg0) {
        if (this.field698) {
            this.field699.method3374(null, !arg0);
            this.field699.method3373(arg0, null);
            this.field4267.method411(1, (byte) -126);
            this.field4267.method215(8, null);
            this.field4267.method411(0, (byte) -111);
            this.field4267.method215(8, null);
            this.field698 = false;
        }
        if (arg0) {
            this.method442(true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 219)
    public final void method443(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method440(true);
        }
        if (!this.field698) {
            return;
        }
        IDirect3DDevice var4 = this.field699.field8281;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x3B) >> 3)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        var4.method4117(14, (float) (this.field4267.field649 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) (arg2 >> 16 & 0x3) / 8.0F;
        var4.method4117(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method4126(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method4126(5, var8, 0.0F, 0.0F, 0.0F);
    }
}
