import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class113 extends class493 {

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "Z")
    private boolean field1501 = false;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Lbea;")
    private class225 field1495;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1500;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1494;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1490;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1497;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "Ljs;")
    private class334 field1496;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "Z")
    private boolean field1498;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "[F")
    private static float[] field1493 = new float[4];

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "[F")
    private static float[] field1499 = new float[16];

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1491;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "Z")
    private boolean field1492;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V", line = 4)
    public final void method658(int arg0) {
        if (arg0 > -49) {
            this.field1501 = false;
        }
        if (this.field1491 != null) {
            IDirect3DDevice var2 = this.field1495.field2918;
            var2.method2737(4, this.field6720.method2168(field1499, 32227));
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 23)
    public final void method654(int arg0) {
        if (arg0 > -45) {
            this.field1491 = null;
        }
        if (this.field1491 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1495.field2918;
        int var3 = this.field6720.method356();
        int var4 = this.field6720.method400();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2723(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2723(11, 1.0F / (float) this.field6720.method2112(126), (float) this.field6720.method2155((byte) 122) / 255.0F, this.field6720.field5084, 1.0F / (this.field6720.field5084 - this.field6720.field5107));
        this.field6720.method2134(2, this.field6720.method2143((byte) 92));
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V", line = 51)
    private final void method755(boolean arg0) {
        if (!arg0) {
            this.method657(-31);
        }
        if (this.field1491 == null || !this.field1492) {
            return;
        }
        class648 var2 = this.field6720.method2159(1);
        IDirect3DDevice var3 = this.field1495.field2918;
        var3.method2723(13, this.field6720.field5103 * this.field6720.field5068, this.field6720.field5068 * this.field6720.field5041, this.field6720.field5083 * this.field6720.field5068, 1.0F);
        var3.method2723(14, this.field6720.field5122 * this.field6720.field5103, this.field6720.field5122 * this.field6720.field5041, this.field6720.field5122 * this.field6720.field5083, 1.0F);
        var3.method2723(16, this.field6720.field5103 * this.field6720.field5086, this.field6720.field5086 * this.field6720.field5041, this.field6720.field5086 * this.field6720.field5083, 1.0F);
        var2.method3662(-19890, this.field6720.field5088[0], this.field6720.field5088[2], field1493, this.field6720.field5088[1]);
        var3.SetVertexShaderConstantF(15, field1493, 1);
        var2.method3662(-19890, this.field6720.field5064[0], this.field6720.field5064[2], field1493, this.field6720.field5064[1]);
        var3.SetVertexShaderConstantF(17, field1493, 1);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILbl;)V", line = 76)
    public final void method629(int arg0, int arg1, class649 arg2) {
        if (arg2 != null) {
            if (this.field1501) {
                this.field6720.method2174(0, -80, class71.field769);
                this.field6720.method2116(-72, class71.field769, 0);
                this.field1501 = false;
            }
            this.field6720.method2148(arg2, arg0 ^ 0xFFFFFF8C);
            this.field6720.method2153(arg1, (byte) 92);
        } else if (!this.field1501) {
            this.field6720.method2148(this.field6720.field5078, 98);
            this.field6720.method2153(1, (byte) -99);
            this.field6720.method2174(0, -115, class547.field7717);
            this.field6720.method2116(-121, class547.field7717, 0);
            this.field1501 = true;
        }
        if (arg0 != 6) {
            this.method633(-96, true);
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V", line = 111)
    public final void method628(int arg0) {
        this.field6720.method2114((byte) 120, 1);
        this.field6720.method2148(null, -123);
        this.field6720.method2156(class199.field2365, class199.field2365, 22831);
        this.field6720.method2174(0, -70, class71.field769);
        this.field6720.method2174(2, -81, class421.field5897);
        this.field6720.method2116(-108, class71.field769, 0);
        this.field6720.method2114((byte) 120, 0);
        if (this.field1501) {
            this.field6720.method2174(0, -115, class71.field769);
            this.field6720.method2116(-82, class71.field769, 0);
            this.field1501 = false;
        }
        if (arg0 != -2) {
            this.method756(96);
        }
        if (this.field1491 != null) {
            this.field1495.method1287(null, true);
            this.field1491 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)Z", line = 140)
    public final boolean method634(byte arg0) {
        if (arg0 != 27) {
            this.method627(-54, -30, -35);
        }
        return this.field1498;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V", line = 151)
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg2 > -75) {
            this.field1498 = false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 160)
    public final void method655(byte arg0) {
        if (this.field1491 != null) {
            IDirect3DDevice var2 = this.field1495.field2918;
            class648 var3 = this.field1495.method2161(0);
            var2.method2737(0, var3.method3656(123, field1499));
        }
        int var4 = -6 / ((arg0 + 63) / 38);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IZ)V", line = 180)
    public final void method633(int arg0, boolean arg1) {
        this.field1492 = arg1;
        this.field6720.method2114((byte) 120, 1);
        this.field6720.method2148(this.field1496, 63);
        this.field6720.method2156(class365.field4838, class94.field1233, arg0 + 22762);
        this.field6720.method2174(0, arg0 ^ 0xFFFFFFC3, class421.field5897);
        this.field6720.method1334(2, true, (byte) 27, class71.field769, false);
        this.field6720.method2116(-76, class547.field7717, 0);
        this.field6720.method2114((byte) 120, 0);
        if (arg0 == 69) {
            this.method756(-25684);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V", line = 202)
    public final void method632(int arg0, boolean arg1) {
        if (arg0 <= 93) {
            field1493 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lbea;Lni;)V", line = 212)
    public class113(class225 arg0, class522 arg1) {
        super(arg0);
        this.field1495 = arg0;
        if (arg1 == null || (this.field1495.field2913.VertexShaderVersion & 0xFFFF) < 257) {
            this.field1498 = false;
        } else {
            this.field1500 = this.field1495.field2918.method2727(arg1.method2879("dx", "uw_ground_unlit", -32734));
            this.field1494 = this.field1495.field2918.method2727(arg1.method2879("dx", "uw_ground_lit", -32734));
            this.field1490 = this.field1495.field2918.method2727(arg1.method2879("dx", "uw_model_unlit", -32734));
            this.field1497 = this.field1495.field2918.method2727(arg1.method2879("dx", "uw_model_lit", -32734));
            if (this.field1497 != null & this.field1494 != null & this.field1500 != null & this.field1490 != null) {
                this.field1496 = this.field6720.method2150(2, 1, (byte) 31, new int[] { 0, -1 }, false);
                this.field1496.method1694(false, false, 76);
                this.field1498 = true;
            } else {
                this.field1498 = false;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 240)
    public final void method656(int arg0) {
        if (this.field1491 != null) {
            IDirect3DDevice var2 = this.field1495.field2918;
            class648 var3 = this.field1495.method2161(0);
            var2.method2737(0, var3.method3656(126, field1499));
        }
        if (arg0 != 2899) {
            this.method655((byte) -1);
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V", line = 260)
    public final void method756(int arg0) {
        if (arg0 != -25684) {
            return;
        }
        IDirect3DDevice var2 = this.field1495.field2918;
        int var3 = this.field6720.method2154((byte) 67);
        class648 var4 = this.field6720.method2118((byte) -127);
        IDirect3DVertexShader var5;
        if (this.field1492) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field1494 : this.field1497;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field1500 : this.field1490;
        }
        if (this.field1491 != var5) {
            this.field1491 = var5;
            this.field1495.method1287(var5, true);
            this.method755(true);
            this.method658(-101);
            this.method657(8);
            this.method655((byte) -124);
            this.method656(2899);
            this.method654(-57);
        }
        var4.method3648((byte) 18, 0.0F, -1.0F, (float) var3, field1493, 0.0F);
        var2.method2737(12, field1493);
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V", line = 298)
    public final void method657(int arg0) {
        if (this.field1491 != null) {
            IDirect3DDevice var2 = this.field1495.field2918;
            class648 var3 = this.field6720.method2180(arg0 - 7);
            var2.SetVertexShaderConstantF(8, var3.method3657(field1499, 4), 2);
        }
        if (arg0 != 8) {
            this.field1490 = null;
        }
    }
}
