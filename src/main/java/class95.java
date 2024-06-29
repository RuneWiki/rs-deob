import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class95 extends class493 {

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "Lmt;")
    private class399 field1237;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "Lbea;")
    private class225 field1243;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1242;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field1239;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "Z")
    private boolean field1238;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "[F")
    private static float[] field1240 = new float[16];

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "Z")
    private boolean field1241;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILbl;)V", line = 4)
    public final void method629(int arg0, int arg1, class649 arg2) {
        if (arg0 != 6) {
            this.method654(72);
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V", line = 13)
    public final void method654(int arg0) {
        if (arg0 > -45) {
            this.field1238 = true;
        }
        if (!this.field1241) {
            return;
        }
        IDirect3DDevice var2 = this.field1243.field2918;
        if (this.field6720.field5073 <= 0) {
            var2.method2723(16, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field6720.field5084;
            float var4 = this.field6720.field5107;
            var2.method2723(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        }
        var2.method2720(0, (float) ((this.field6720.field5128 & 0xFF21E2) >> 16) / 255.0F, (float) ((this.field6720.field5128 & 0xFF68) >> 8) / 255.0F, (float) (this.field6720.field5128 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V", line = 40)
    public final void method655(byte arg0) {
        if (this.field1241) {
            IDirect3DDevice var2 = this.field1243.field2918;
            class648 var3 = this.field1243.method2161(0);
            var2.method2737(0, var3.method3656(109, field1240));
        }
        int var4 = -112 % ((arg0 + 63) / 38);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 57)
    public final void method656(int arg0) {
        if (arg0 != 2899) {
            this.field1242 = null;
        }
        if (!this.field1241) {
            return;
        }
        IDirect3DDevice var2 = this.field1243.field2918;
        class648 var3 = this.field1243.method2118((byte) 78);
        class648 var4 = this.field1243.method2161(0);
        var2.method2737(0, var4.method3656(122, field1240));
        var2.method2737(4, var3.method3653(field1240, (byte) -80));
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V", line = 78)
    public final void method632(int arg0, boolean arg1) {
        if (arg0 <= 93) {
            field1240 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lbea;Lni;Lmt;)V", line = 86)
    public class95(class225 arg0, class522 arg1, class399 arg2) {
        super(arg0);
        this.field1237 = arg2;
        this.field1243 = arg0;
        if (arg1 != null && this.field6720.field5061 && this.field6720.field5080 && (this.field1243.field2913.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1242 = this.field1243.field2918.method2727(arg1.method2879("dx", "environment_mapped_water_v", -32734));
            this.field1239 = this.field1243.field2918.method2734(arg1.method2879("dx", "environment_mapped_water_f", -32734));
            this.field1238 = this.field1242 != null && this.field1239 != null && this.field1237.method2314(-119);
        } else {
            this.field1242 = null;
            this.field1238 = false;
            this.field1239 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "(I)V", line = 109)
    public final void method657(int arg0) {
        if (this.field1241) {
            IDirect3DDevice var2 = this.field1243.field2918;
            class648 var3 = this.field6720.method2180(arg0 - 7);
            var2.SetVertexShaderConstantF(12, var3.method3657(field1240, 4), 2);
        }
        if (arg0 != 8) {
            this.field1243 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)V", line = 127)
    public final void method658(int arg0) {
        if (this.field1241) {
            IDirect3DDevice var2 = this.field1243.field2918;
            var2.method2737(8, this.field6720.method2168(field1240, 32227));
        }
        if (arg0 >= -49) {
            this.field1238 = false;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)V", line = 145)
    public final void method627(int arg0, int arg1, int arg2) {
        if (this.field1241) {
            IDirect3DDevice var4 = this.field1243.field2918;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << ((arg0 & 0x3A) >> 3)) / 32.0F;
            int var7 = arg1 & 0xFFFF;
            float var8 = (float) ((arg1 & 0x367AF) >> 16) / 8.0F;
            var4.method2723(14, (float) (this.field6720.field5048 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method2723(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2720(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2720(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg2 > -75) {
            this.method627(0, -115, -17);
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V", line = 174)
    public final void method628(int arg0) {
        if (this.field1241) {
            this.field1243.method1287(null, true);
            this.field1243.method1306(28, null);
            this.field6720.method2114((byte) 120, 1);
            this.field6720.method2148(null, -127);
            this.field6720.method2114((byte) 120, 0);
            this.field6720.method2148(null, 39);
            this.field1241 = false;
        }
        if (arg0 != -2) {
            this.method655((byte) -37);
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(IZ)V", line = 196)
    public final void method633(int arg0, boolean arg1) {
        class455 var3 = this.field6720.method2106(-113);
        if (this.field1238 && var3 != null) {
            IDirect3DDevice var4 = this.field1243.field2918;
            this.field1243.method1287(this.field1242, true);
            this.field1243.method1306(28, this.field1239);
            this.field6720.method2114((byte) 120, 1);
            this.field6720.method2148(var3, 7);
            this.field6720.method2114((byte) 120, 0);
            this.field6720.method2148(this.field1237.field5651, arg0 ^ 0xFFFFFFC1);
            this.field1241 = true;
            this.method656(2899);
            this.method657(8);
            this.method658(-71);
            this.method654(arg0 ^ 0xFFFFFF8D);
            var4.method2720(1, -this.field6720.field5088[0], -this.field6720.field5088[1], -this.field6720.field5088[2], 0.0F);
            var4.method2720(2, this.field6720.field5103, this.field6720.field5041, this.field6720.field5083, 1.0F);
            var4.method2720(3, Math.abs(this.field6720.field5088[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != 69) {
            this.method655((byte) -113);
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)Z", line = 228)
    public final boolean method634(byte arg0) {
        if (arg0 != 27) {
            this.method658(103);
        }
        return this.field1238;
    }
}
