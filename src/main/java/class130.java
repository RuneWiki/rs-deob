import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class130 extends class262 {

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lkaa;")
    private class44 field1659;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1652;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1654;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1657;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1658;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
    private boolean field1649;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lco;")
    private class103 field1650;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "[F")
    private static float[] field1655 = new float[16];

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[F")
    private static float[] field1656 = new float[4];

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1653;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Z")
    private boolean field1651;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public final void method377(int arg0, boolean arg1) {
        this.field1651 = arg1;
        if (arg0 < 37) {
            this.method882(50);
        }
        this.field3601.method2318(1, -30954);
        this.field3601.method2316((byte) 100, this.field1650);
        this.field3601.method2303((byte) -81, class231.field3011, class442.field6300);
        this.field3601.method2301(0, class308.field4083, 2);
        this.field3601.method512(true, 2, 9494, class519.field7612, false);
        this.field3601.method2348(0, 6655, class141.field1760);
        this.field3601.method2318(0, -30954);
        this.method882(-56);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILoa;B)V")
    public final void method371(int arg0, class644 arg1, byte arg2) {
        if (arg1 == null) {
            this.field3601.method2316((byte) 120, this.field3601.field5502);
            this.field3601.method2362(1, false);
            this.field3601.method2301(0, class141.field1760, 2);
            this.field3601.method2348(0, 6655, class141.field1760);
        } else {
            this.field3601.method2316((byte) 105, arg1);
            this.field3601.method2362(arg0, false);
        }
        if (arg2 < 80) {
            this.method371(-44, null, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public final void method596(byte arg0) {
        if (this.field1653 != null) {
            IDirect3DDevice var2 = this.field1659.field797;
            class653 var3 = this.field3601.method2311((byte) -99);
            var2.SetVertexShaderConstantF(8, var3.method3680(field1655, -8), 2);
        }
        if (arg0 < 9) {
            this.method594(31);
        }
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    public final void method597(int arg0) {
        if (arg0 != 16383) {
            this.field1650 = null;
        }
        if (this.field1653 != null) {
            IDirect3DDevice var2 = this.field1659.field797;
            class653 var3 = this.field1659.method2354((byte) 90);
            var2.method2654(0, var3.method3692(arg0 ^ 0xFFFFF566, field1655));
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final void method374(int arg0) {
        this.field3601.method2318(1, -30954);
        this.field3601.method2316((byte) 104, null);
        this.field3601.method2303((byte) -117, class652.field9230, class652.field9230);
        if (arg0 <= 42) {
            return;
        }
        this.field3601.method2301(0, class519.field7612, 2);
        this.field3601.method2301(2, class308.field4083, 2);
        this.field3601.method2348(0, 6655, class519.field7612);
        this.field3601.method2318(0, -30954);
        this.field3601.method2301(0, class519.field7612, 2);
        this.field3601.method2348(0, 6655, class519.field7612);
        if (this.field1653 != null) {
            this.field1659.field797.SetVertexShader(null);
            this.field1653 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public final void method882(int arg0) {
        IDirect3DDevice var2 = this.field1659.field797;
        int var3 = this.field3601.method2358(-22872);
        class653 var4 = this.field3601.method2343(12328);
        IDirect3DVertexShader var5;
        if (this.field1651) {
            var5 = var3 == Integer.MAX_VALUE ? this.field1654 : this.field1658;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field1652 : this.field1657;
        }
        if (this.field1653 != var5) {
            this.field1653 = var5;
            var2.SetVertexShader(var5);
            this.method883(false);
            this.method594(3);
            this.method596((byte) 120);
            this.method597(16383);
            this.method595((byte) 47);
            this.method593(102);
        }
        if (arg0 >= -34) {
            this.field1653 = null;
        }
        var4.method3687(0.0F, -1.0F, -7354, field1656, (float) var3, 0.0F);
        var2.method2654(12, field1656);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lkaa;Ljn;)V")
    public class130(class44 arg0, class668 arg1) {
        super(arg0);
        this.field1659 = arg0;
        if (arg1 == null || (this.field1659.field776.VertexShaderVersion & 0xFFFF) < 257) {
            this.field1649 = false;
        } else {
            this.field1652 = this.field1659.field797.method2658(arg1.method3778(61, "dx", "uw_ground_unlit"));
            this.field1654 = this.field1659.field797.method2658(arg1.method3778(79, "dx", "uw_ground_lit"));
            this.field1657 = this.field1659.field797.method2658(arg1.method3778(-107, "dx", "uw_model_unlit"));
            this.field1658 = this.field1659.field797.method2658(arg1.method3778(-59, "dx", "uw_model_lit"));
            if ((this.field1652 != null & this.field1654 != null & this.field1657 != null & this.field1658 != null)) {
                this.field1650 = this.field3601.method2307(1, false, new int[] { 0, -1 }, 2, 0);
                this.field1650.method757(false, false, -78);
                this.field1649 = true;
            } else {
                this.field1649 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)V")
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field1649 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Z")
    public final boolean method375(int arg0) {
        if (arg0 != -18095) {
            this.field1652 = null;
        }
        return this.field1649;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
    public final void method372(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field1649 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    public final void method595(byte arg0) {
        if (this.field1653 != null) {
            IDirect3DDevice var2 = this.field1659.field797;
            class653 var3 = this.field1659.method2354((byte) -85);
            var2.method2654(0, var3.method3692(-13671, field1655));
        }
        if (arg0 != 47) {
            this.field1651 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public final void method593(int arg0) {
        int var2 = -53 / ((-arg0 - 41) / 52);
        if (this.field1653 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field1659.field797;
        int var4 = this.field3601.method287();
        int var5 = this.field3601.method260();
        float var6 = (float) var4 - (float) (var4 - var5) * 0.125F;
        float var7 = (float) var4 - (float) (var4 - var5) * 0.25F;
        var3.method2651(10, var7, 1.0F / (var6 - var7), var6, 1.0F / ((float) var4 - var6));
        var3.method2651(11, 1.0F / (float) this.field3601.method2332(0), (float) this.field3601.method2375(116) / 255.0F, this.field3601.field5468, 1.0F / (this.field3601.field5468 - this.field3601.field5488));
        this.field3601.method2331(true, this.field3601.method2380(-30));
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
    public final void method594(int arg0) {
        if (this.field1653 != null) {
            IDirect3DDevice var2 = this.field1659.field797;
            var2.method2654(4, this.field3601.method2366(field1655, true));
        }
        if (arg0 != 3) {
            this.method882(33);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    private final void method883(boolean arg0) {
        if (this.field1653 != null && this.field1651) {
            class653 var2 = this.field3601.method2349((byte) 126);
            IDirect3DDevice var3 = this.field1659.field797;
            var3.method2651(13, this.field3601.field5491 * this.field3601.field5446, this.field3601.field5512 * this.field3601.field5491, this.field3601.field5491 * this.field3601.field5481, 1.0F);
            var3.method2651(14, this.field3601.field5507 * this.field3601.field5446, this.field3601.field5512 * this.field3601.field5507, this.field3601.field5507 * this.field3601.field5481, 1.0F);
            var3.method2651(16, this.field3601.field5462 * this.field3601.field5446, this.field3601.field5512 * this.field3601.field5462, this.field3601.field5481 * this.field3601.field5462, 1.0F);
            var2.method3693(-8505, this.field3601.field5520[2], this.field3601.field5520[1], field1656, this.field3601.field5520[0]);
            var3.SetVertexShaderConstantF(15, field1656, 1);
            var2.method3693(-8505, this.field3601.field5440[2], this.field3601.field5440[1], field1656, this.field3601.field5440[0]);
            var3.SetVertexShaderConstantF(17, field1656, 1);
        }
        if (arg0) {
            field1656 = null;
        }
    }
}
