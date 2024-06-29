import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class304 extends class681 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lst;")
    private class398 field4221;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lega;")
    private class662 field4219;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4218;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[F")
    private static float[] field4220 = new float[16];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILrga;I)V", line = 4)
    public final void method744(int arg0, class218 arg1, int arg2) {
        if (arg2 != -3) {
            this.field4219 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB)V", line = 15)
    public final void method742(int arg0, int arg1, byte arg2) {
        IDirect3DDevice var4 = this.field4219.field9273;
        int var5 = -76 % ((arg2 + 38) / 35);
        if (this.field4221.field5595) {
            float var6 = (float) (this.field9721.field5307 % 4000) / 4000.0F;
            this.field9721.method2241(this.field4221.field5596, (byte) 44);
            var4.method2543(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var7 = this.field9721.field5307 % 4000 * 16 / 4000;
            this.field9721.method2241(this.field4221.field5600[var7], (byte) 44);
            var4.method2543(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 40)
    public final void method749(int arg0) {
        if (arg0 >= 77 && this.field4218 != null) {
            IDirect3DDevice var2 = this.field4219.field9273;
            var2.method2542(4, this.field9721.method2240(field4220, 8));
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 58)
    public final void method748(int arg0) {
        if (arg0 != 20060) {
            this.field4221 = null;
        }
        if (this.field4218 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4219.field9273;
        if (this.field9721.field5308 > 0) {
            float var3 = this.field9721.field5336;
            float var4 = this.field9721.field5377;
            float var5 = var4 - 512.0F;
            var2.method2543(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method2543(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field9721.method2233(false, this.field9721.field5309);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)Z", line = 88)
    public final boolean method751(boolean arg0) {
        if (!arg0) {
            this.method740(83);
        }
        return this.field4218 != null;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V", line = 98)
    public final void method747(int arg0) {
        if (arg0 != 3914) {
            this.field4221 = null;
        }
        if (this.field4218 != null) {
            IDirect3DDevice var2 = this.field4219.field9273;
            class274 var3 = this.field4219.method2273(4);
            var2.method2542(0, var3.method1697(field4220, -73));
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 117)
    public final void method745(byte arg0) {
        if (arg0 < 103) {
            this.field4221 = null;
        }
        if (this.field4218 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4219.field9273;
        class274 var3 = this.field9721.method2217(1);
        var3.method1696(true, field4220);
        field4220[3] *= 0.25F;
        field4220[1] *= 0.25F;
        field4220[2] *= 0.25F;
        field4220[7] *= 0.25F;
        field4220[0] *= 0.25F;
        field4220[6] *= 0.25F;
        field4220[4] *= 0.25F;
        field4220[5] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field4220, 2);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 145)
    public final void method750(byte arg0) {
        if (this.field4218 != null) {
            IDirect3DDevice var2 = this.field4219.field9273;
            class274 var3 = this.field4219.method2273(4);
            var2.method2542(0, var3.method1697(field4220, -114));
        }
        if (arg0 != -8) {
            this.method740(35);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(ZI)V", line = 163)
    public final void method741(boolean arg0, int arg1) {
        this.field4219.field9273.SetVertexShader(this.field4218);
        this.field9721.method2264(9, class262.field3553, 0);
        this.field9721.method2264(9, class452.field6221, 1);
        if (arg1 != 3) {
            return;
        }
        this.field9721.method1052(true, 2, false, class227.field3159, arg1 ^ 0x68);
        this.field9721.method2270(true, false);
        this.method750((byte) -8);
        this.method745((byte) 107);
        this.method749(83);
        this.method748(20060);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lega;Lsea;Lst;)V", line = 180)
    public class304(class662 arg0, class648 arg1, class398 arg2) {
        super(arg0);
        this.field4221 = arg2;
        this.field4219 = arg0;
        if (arg1 != null && this.field4221.method2329((byte) -120) && (this.field4219.field9284.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4218 = this.field4219.field9273.method2540(arg1.method3642(101, "transparent_water", "dx"));
        } else {
            this.field4218 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V", line = 198)
    public final void method739(boolean arg0, int arg1) {
        if (arg1 == 7) {
            this.field9721.method2199(class127.field1821, 9797, class335.field4510);
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 211)
    public final void method740(int arg0) {
        this.field4219.field9273.SetVertexShader(null);
        this.field9721.method2264(arg0 + 12, class262.field3553, 0);
        this.field9721.method2264(9, class227.field3159, 1);
        if (arg0 == -3) {
            this.field9721.method2264(9, class452.field6221, 2);
            this.field9721.method2270(true, true);
        }
    }
}
