import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class172 extends class493 {

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "Lbea;")
    private class225 field2142;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "Lmt;")
    private class399 field2140;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2139;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "[F")
    private static float[] field2141 = new float[16];

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method632(int arg0, boolean arg1) {
        this.field6720.method2156(class669.field9307, class94.field1233, 22831);
        if (arg0 <= 93) {
            this.field2140 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V", line = 14)
    public final void method655(byte arg0) {
        if (this.field2139 != null) {
            IDirect3DDevice var2 = this.field2142.field2918;
            class648 var3 = this.field2142.method2161(0);
            var2.method2737(0, var3.method3656(127, field2141));
        }
        int var4 = -90 / ((arg0 + 63) / 38);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IILbl;)V", line = 32)
    public final void method629(int arg0, int arg1, class649 arg2) {
        if (arg0 != 6) {
            this.field2140 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)V", line = 41)
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg2 > -75) {
            return;
        }
        IDirect3DDevice var4 = this.field2142.field2918;
        if (this.field2140.field5652) {
            float var6 = (float) (this.field6720.field5048 % 4000) / 4000.0F;
            this.field6720.method2148(this.field2140.field5648, 22);
            var4.method2723(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field6720.field5048 % 4000 * 16 / 4000;
            this.field6720.method2148(this.field2140.field5654[var5], 17);
            var4.method2723(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V", line = 67)
    public final void method658(int arg0) {
        if (arg0 >= -49) {
            this.method629(61, 19, null);
        }
        if (this.field2139 != null) {
            IDirect3DDevice var2 = this.field2142.field2918;
            var2.method2737(4, this.field6720.method2168(field2141, 32227));
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 83)
    public final void method654(int arg0) {
        if (arg0 >= -45 || this.field2139 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2142.field2918;
        if (this.field6720.field5073 <= 0) {
            var2.method2723(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field6720.field5084;
            float var4 = this.field6720.field5107;
            float var5 = var4 - 512.0F;
            var2.method2723(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field6720.method2134(2, this.field6720.field5128);
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V", line = 112)
    public final void method628(int arg0) {
        this.field2142.method1287(null, true);
        this.field6720.method2174(0, -56, class71.field769);
        this.field6720.method2174(1, -113, class293.field3928);
        if (arg0 != -2) {
            this.field2139 = null;
        }
        this.field6720.method2174(2, -89, class421.field5897);
        this.field6720.method2109((byte) 121, true);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Z", line = 130)
    public final boolean method634(byte arg0) {
        if (arg0 != 27) {
            this.field2139 = null;
        }
        return this.field2139 != null;
    }

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "(I)V", line = 140)
    public final void method657(int arg0) {
        if (this.field2139 != null) {
            IDirect3DDevice var2 = this.field2142.field2918;
            class648 var3 = this.field6720.method2180(1);
            var3.method3657(field2141, 4);
            field2141[5] *= 0.25F;
            field2141[2] *= 0.25F;
            field2141[7] *= 0.25F;
            field2141[4] *= 0.25F;
            field2141[0] *= 0.25F;
            field2141[6] *= 0.25F;
            field2141[1] *= 0.25F;
            field2141[3] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field2141, 2);
        }
        if (arg0 != 8) {
            this.field2140 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lbea;Lni;Lmt;)V", line = 166)
    public class172(class225 arg0, class522 arg1, class399 arg2) {
        super(arg0);
        this.field2142 = arg0;
        this.field2140 = arg2;
        if (arg1 != null && this.field2140.method2309(-22382) && (this.field2142.field2913.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2139 = this.field2142.field2918.method2727(arg1.method2879("dx", "transparent_water", -32734));
        } else {
            this.field2139 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 183)
    public final void method656(int arg0) {
        if (arg0 != 2899) {
            field2141 = null;
        }
        if (this.field2139 != null) {
            IDirect3DDevice var2 = this.field2142.field2918;
            class648 var3 = this.field2142.method2161(0);
            var2.method2737(0, var3.method3656(127, field2141));
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(IZ)V", line = 202)
    public final void method633(int arg0, boolean arg1) {
        this.field6720.method2174(0, arg0 ^ 0xFFFFFFC0, class71.field769);
        this.field6720.method2174(1, -88, class421.field5897);
        this.field6720.method1334(2, false, (byte) 27, class293.field3928, true);
        this.field6720.method2109((byte) 110, false);
        this.field2142.method1287(this.field2139, true);
        if (arg0 == 69) {
            this.method655((byte) -111);
            this.method657(arg0 ^ 0x4D);
            this.method658(-116);
            this.method654(-75);
        }
    }
}
