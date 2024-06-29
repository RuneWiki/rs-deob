import jaclib.peer.class576;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.PixelBuffer;
import jagdx.class407;
import jagdx.class408;
import jagdx.class409;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class591 extends class428 {

    @OriginalMember(owner = "client!hg", name = "Mg", descriptor = "Z")
    private boolean field8576 = false;

    @OriginalMember(owner = "client!hg", name = "Lg", descriptor = "Luba;")
    private class363 field8575;

    @OriginalMember(owner = "client!hg", name = "Cg", descriptor = "I")
    private int field8566;

    @OriginalMember(owner = "client!hg", name = "Og", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8578;

    @OriginalMember(owner = "client!hg", name = "Ug", descriptor = "Ljaclib/peer/pe;")
    public class576 field8584;

    @OriginalMember(owner = "client!hg", name = "Wg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8586;

    @OriginalMember(owner = "client!hg", name = "Sg", descriptor = "I")
    private int field8582;

    @OriginalMember(owner = "client!hg", name = "Kg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8574;

    @OriginalMember(owner = "client!hg", name = "Hg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8571;

    @OriginalMember(owner = "client!hg", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class409 field8579;

    @OriginalMember(owner = "client!hg", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class409 field8570;

    @OriginalMember(owner = "client!hg", name = "Ng", descriptor = "Ljagdx/D3DLIGHT;")
    private class409 field8577;

    @OriginalMember(owner = "client!hg", name = "Fg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8569;

    @OriginalMember(owner = "client!hg", name = "zg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8563;

    @OriginalMember(owner = "client!hg", name = "Vg", descriptor = "Z")
    public boolean field8585;

    @OriginalMember(owner = "client!hg", name = "Bg", descriptor = "Z")
    public boolean field8565;

    @OriginalMember(owner = "client!hg", name = "Ig", descriptor = "Z")
    public boolean field8572;

    @OriginalMember(owner = "client!hg", name = "Jg", descriptor = "[Z")
    private boolean[] field8573;

    @OriginalMember(owner = "client!hg", name = "Qg", descriptor = "[Lie;")
    private class6[] field8580;

    @OriginalMember(owner = "client!hg", name = "yg", descriptor = "[Z")
    private boolean[] field8562;

    @OriginalMember(owner = "client!hg", name = "Eg", descriptor = "[Z")
    private boolean[] field8568;

    @OriginalMember(owner = "client!hg", name = "Ag", descriptor = "[I")
    private int[] field8564;

    @OriginalMember(owner = "client!hg", name = "xg", descriptor = "[Z")
    private boolean[] field8561;

    @OriginalMember(owner = "client!hg", name = "Dg", descriptor = "[I")
    private static int[] field8567 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!hg", name = "Rg", descriptor = "[I")
    private static int[] field8581 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!hg", name = "Tg", descriptor = "[F")
    private static float[] field8583 = new float[16];

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/pe;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Luba;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ln;Ldn;I)V", line = 3)
    private class591(int arg0, int arg1, Canvas arg2, class576 arg3, IDirect3D arg4, IDirect3DDevice arg5, class363 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class17 arg9, class438 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field8575 = arg6;
        this.field8566 = arg0;
        this.field8578 = arg7;
        this.field8584 = arg3;
        this.field8586 = arg5;
        this.field8582 = arg1;
        this.field8574 = arg4;
        this.field8571 = arg8;
        this.field8579 = new class409(this.field8584);
        this.field8570 = new class409(this.field8584);
        this.field8577 = new class409(this.field8584);
        this.field8569 = new PixelBuffer(this.field8584);
        this.field8563 = new GeometryBuffer(this.field8584);
        this.field5754 = (this.field8571.TextureCaps & 0x800) != 0;
        this.field8585 = (this.field8571.TextureCaps & 0x2) == 0;
        this.field8565 = (this.field8571.TextureCaps & 0x10000) != 0;
        this.field8572 = (this.field8571.TextureCaps & 0x4000) != 0;
        this.field5739 = (this.field8571.TextureCaps & 0x2000) != 0;
        this.field5768 = this.field8571.MaxSimultaneousTextures;
        this.field5778 = this.field8571.MaxActiveLights > 0 ? this.field8571.MaxActiveLights : 8;
        this.field5787 = this.field5722 > 0 || this.field8574.CheckDeviceMultiSampleType(this.field8566, this.field8582, this.field8578.BackBufferFormat, true, 2) == 0;
        this.field8573 = new boolean[this.field5768];
        this.field8580 = new class6[this.field5768];
        this.field8562 = new boolean[this.field5768];
        this.field8568 = new boolean[this.field5768];
        this.field8564 = new int[this.field5768];
        this.field8561 = new boolean[this.field5768];
        this.field8586.BeginScene();
        this.field8586.Clear(3, 0, 1.0F, 0);
        this.method1123();
        this.field8586.Clear(3, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "()V", line = 43)
    public final void method1109() {
    }

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "(B)V", line = 46)
    public final void method1828(byte arg0) {
        if (!this.field8576) {
            this.field8586.SetLight(0, this.field8579);
            this.field8586.SetLight(1, this.field8570);
            this.field8576 = true;
        }
        int var2 = 59 % ((arg0 - 38) / 39);
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "()V", line = 63)
    public final void method1123() {
        this.field8586.EndScene();
        if (class407.method2321((byte) 118, this.field8575.method2034((byte) 88, 0))) {
            this.method3428((byte) -128);
        }
        this.field8586.BeginScene();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILde;)V", line = 76)
    public final void method3425(int arg0, class452 arg1) {
        this.method3429(arg1, (byte) 58);
        if (arg0 != -1) {
            return;
        }
        if (!this.field8568[this.field5750]) {
            this.field8586.SetSamplerState(this.field5750, 1, 1);
            this.field8568[this.field5750] = true;
        }
        if (!this.field8562[this.field5750]) {
            this.field8586.SetSamplerState(this.field5750, 2, 1);
            this.field8562[this.field5750] = true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "(I)V", line = 99)
    public final void method1808(int arg0) {
        if (arg0 != 0) {
            this.field8562 = null;
        }
        if (this.field8561[this.field5750]) {
            this.field8561[this.field5750] = false;
            this.field8586.SetTexture(this.field5750, null);
            this.method1806((byte) -49);
            this.method1838(-1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "(B)V", line = 118)
    public final void method1815(byte arg0) {
        int var2 = -12 / ((arg0 - 62) / 38);
        this.field8586.method2336(14, this.field5723 && this.field5791);
    }

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "(I)V", line = 126)
    public final void method1841(int arg0) {
        this.field8579.SetDirection(-this.field5745[0], -this.field5745[1], -this.field5745[2]);
        this.field8570.SetDirection(-this.field5786[0], -this.field5786[1], -this.field5786[2]);
        this.field8576 = false;
        int var2 = 85 / ((arg0 - 22) / 41);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;IZILjagdx/IDirect3D;I)Z", line = 138)
    private static final boolean method3426(D3DPRESENT_PARAMETERS arg0, int arg1, boolean arg2, int arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        if (arg2) {
            return true;
        }
        int var8 = 0;
        D3DDISPLAYMODE var9 = arg4.method2317(arg5);
        label72: while (arg3 >= 0) {
            if (arg3 != 1) {
                var8 = arg3;
                for (int var10 = 0; var10 < field8567.length; var10++) {
                    if (arg4.CheckDeviceType(arg5, arg1, var9.Format, field8567[var10], true) == 0 && arg4.CheckDeviceFormat(arg5, arg1, var9.Format, 1, 1, field8567[var10]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg1, field8567[var10], true, var8) == 0)) {
                        for (int var11 = 0; var11 < field8581.length; var11++) {
                            if (arg4.CheckDeviceFormat(arg5, arg1, var9.Format, 2, 1, field8581[var11]) == 0 && arg4.CheckDepthStencilMatch(arg5, arg1, var9.Format, field8567[var10], field8581[var11]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg1, field8581[var10], true, var8) == 0)) {
                                var7 = field8567[var10];
                                var6 = field8581[var11];
                                break label72;
                            }
                        }
                    }
                }
            }
            arg3--;
        }
        if (arg3 < 0 || var7 == 0 || var6 == 0) {
            return false;
        }
        arg0.BackBufferFormat = var7;
        arg0.AutoDepthStencilFormat = var6;
        arg0.MultiSampleType = var8;
        arg0.MultiSampleQuality = 0;
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "(I)V", line = 236)
    public final void method1820(int arg0) {
        this.field8586.SetTransform(3, this.field5769);
        if (arg0 < 28) {
            this.field8561 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "(I)V", line = 251)
    public final void method1786(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field5733; var2++) {
            class469 var3 = this.field5740[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2736((byte) -106);
            float var6 = var3.method2734((byte) -37) / 255.0F;
            this.field8577.SetPosition((float) var3.method2731((byte) -96), (float) var3.method2730(-1), (float) var3.method2737((byte) -86));
            this.field8577.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8577.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2735((byte) 120) * var3.method2735((byte) 119)));
            this.field8577.SetRange((float) var3.method2735((byte) 88));
            this.field8586.SetLight(var4, this.field8577);
            this.field8586.LightEnable(var4, true);
        }
        while (var2 < this.field5741) {
            this.field8586.LightEnable(var2 + 2, false);
            var2++;
        }
        if (arg0 != 31090) {
            this.method1805(32, null, null);
        }
        super.method1786(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "(Z)V", line = 290)
    public final void method1796(boolean arg0) {
        if (arg0) {
            field8583 = null;
        }
        if (this.field5705) {
            this.field8586.method2326(36, 0.0F);
            this.field8586.method2326(37, 1.0F);
            this.field8586.SetRenderState(34, this.field5708);
            return;
        }
        this.field5714 = (this.field5701 - this.field5796);
        this.field5698 = this.field5714 - (float) this.field5697;
        if (this.field5698 < (float) this.field5782) {
            this.field5698 = this.field5782;
        }
        this.field8586.method2326(36, this.field5698);
        this.field8586.method2326(37, this.field5714);
        this.field8586.SetRenderState(34, this.field5751);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lsc;B)I", line = 318)
    private static final int method3427(class290 arg0, byte arg1) {
        if (class420.field5440 == arg0) {
            return 2;
        } else if (class480.field6743 == arg0) {
            return 3;
        } else if (class37.field291 == arg0) {
            return 1;
        } else if (class384.field5077 == arg0) {
            return 4;
        } else if (class257.field3308 == arg0) {
            return 6;
        } else if (class133.field1636 == arg0) {
            return 5;
        } else if (arg1 <= 6) {
            return -104;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)V", line = 352)
    public final void method1831(byte arg0) {
        this.field8586.SetViewport(this.field5717, this.field5757, this.field5512, this.field5564, 0.0F, 1.0F);
        if (arg0 != 101) {
            this.method1835(106);
        }
    }

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "()V", line = 362)
    public final void method1158() {
        this.field8584.method3360(-27803);
        super.method1158();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lvr;I)V", line = 371)
    public final void method1837(class116 arg0, int arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field8586.SetVertexDeclaration(var3.field3490);
        if (arg1 != 9) {
            method3430((byte) 89, null);
        }
    }

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "(B)Z", line = 382)
    private final boolean method3428(byte arg0) {
        if (arg0 > -127) {
            this.field8568 = null;
        }
        int var2 = this.field8586.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class363 var3 = (class363) this.field5535;
            this.method2409((byte) 103);
            var3.method2036(0);
            this.field8578.BackBufferHeight = 0;
            this.field8578.BackBufferWidth = 0;
            if (method3426(this.field8578, this.field8582, false, this.field5722, this.field8574, this.field8566)) {
                int var4 = this.field8586.Reset(this.field8578);
                if (class407.method2320(var4, -2005530590)) {
                    var3.method2035(this.field8586.method2330(), this.field8586.method2337(0), 0);
                    this.method2432(false);
                    this.method1809(0);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Lrq;", line = 422)
    public final class293 method1823(int arg0, boolean arg1) {
        if (arg0 <= 111) {
            this.field8584 = null;
        }
        return new class77(this, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "(I)V", line = 432)
    public final void method1821(int arg0) {
        if (arg0 > -12) {
            this.field8561 = null;
        }
        this.field8586.SetScissorRect(this.field5717 + this.field5761, this.field5757 + this.field5725, this.field5707, this.field5762);
    }

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "(I)V", line = 444)
    public final void method1825(int arg0) {
        this.field8586.LightEnable(0, this.field5721);
        this.field8586.LightEnable(arg0, this.field5721);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI[[IZ)Llm;", line = 452)
    public final class423 method1789(boolean arg0, int arg1, int[][] arg2, boolean arg3) {
        return arg0 ? new class626(this, arg1, arg3, arg2) : (class423) null;
    }

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "(IIII)[I", line = 464)
    public final int[] method1111(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8586.method2327(0);
        IDirect3DSurface var7 = this.field8586.method2325(arg2, arg3, 21, 0, 0, true);
        if (class407.method2320(this.field8586.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1), -2005530590) && class407.method2320(var7.LockRect(0, 0, arg2, arg3, 0, this.field8569), -2005530590)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8569.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field8569.method2342(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8569.method2342(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3355(-11385);
        var7.method3355(-11385);
        return var5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lba;B)V", line = 504)
    public final void method3429(class324 arg0, byte arg1) {
        this.field8586.SetTexture(this.field5750, arg0.method1273(-26670));
        if (arg1 != 58) {
            return;
        }
        if (this.field8580[this.field5750] != arg0.field4108) {
            int var3 = method3430((byte) -127, arg0.field4108);
            this.field8586.SetSamplerState(this.field5750, 6, var3);
            this.field8586.SetSamplerState(this.field5750, 5, var3);
            this.field8580[this.field5750] = arg0.field4108;
            if (arg0.field4106 != this.field8573[this.field5750]) {
                this.field8586.SetSamplerState(this.field5750, 7, arg0.field4106 ? method3430((byte) -127, arg0.field4108) : 0);
                this.field8573[this.field5750] = arg0.field4106;
            }
        } else if (this.field8573[this.field5750] != arg0.field4106) {
            this.field8586.SetSamplerState(this.field5750, 7, arg0.field4106 ? method3430((byte) -127, arg0.field4108) : 0);
            this.field8573[this.field5750] = arg0.field4106;
        }
        if (!this.field8561[this.field5750]) {
            this.field8561[this.field5750] = true;
            this.method1806((byte) -97);
            this.method1838(-1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLbk;)V", line = 545)
    public final void method1826(byte arg0, class314 arg1) {
        int var3 = 0;
        if (class546.field8041 == arg1) {
            var3 = 65536;
        } else if (class241.field3007 == arg1) {
            var3 = 131072;
        } else if (class50.field411 == arg1) {
            var3 = 196608;
        }
        this.field8586.SetTextureStageState(this.field5750, 11, var3 | this.field5750);
        if (arg0 != 64) {
            this.method1172();
        }
    }

    @OriginalMember(owner = "client!hg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ln;Ldn;Ljava/lang/Integer;)Lqa;", line = 569)
    public static final class206 createToolkit(Canvas arg0, class17 arg1, class438 arg2, Integer arg3) {
        class591 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class576 var7 = new class576();
            IDirect3D var8 = IDirect3D.method2318(-2147483616, var7);
            D3DADAPTER_IDENTIFIER var9 = var8.method2319(var5, 0);
            if (var9.VendorID == 32902) {
                throw new RuntimeException("");
            }
            D3DCAPS var10 = var8.method2315(var5, var6);
            if ((var10.RasterCaps & 0x1000000) == 0) {
                throw new RuntimeException("");
            } else if (var10.MaxSimultaneousTextures < 2) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x8) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x40) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x200) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x2000000) == 0) {
                throw new RuntimeException("");
            } else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var10.DestBlendCaps & 0x2 & var10.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var10.MaxActiveLights > 0 && var10.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var10.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var11 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3426(var11, var6, false, arg3, var8, var5)) {
                    throw new RuntimeException("");
                }
                var11.Windowed = true;
                var11.EnableAutoDepthStencil = true;
                var11.PresentationInterval = Integer.MIN_VALUE;
                int var12 = 2;
                if ((var10.DevCaps & 0x100000) != 0) {
                    var12 |= 0x10;
                }
                Object var13 = null;
                IDirect3DDevice var14;
                try {
                    var14 = var8.method2316(var5, var6, arg0, var12 | 0x40, var11);
                } catch (class408 var18) {
                    var14 = var8.method2316(var5, var6, arg0, var12 | 0x20, var11);
                }
                class363 var16 = new class363(var14.method2337(0), var14.method2330());
                var4 = new class591(var5, var6, arg0, var7, var8, var14, var16, var11, var10, arg1, arg2, arg3);
                var4.method2473(-91);
                return var4;
            }
        } catch (RuntimeException var19) {
            if (var4 != null) {
                var4.method1158();
            }
            throw var19;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 670)
    public final void method1139(Rectangle[] arg0, int arg1) {
        this.method1123();
    }

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "(I)V", line = 677)
    public final void method1803(int arg0) {
        if (arg0 != 0) {
            this.method1798(false, false, 2, 127, null);
        }
        this.field8586.method2336(137, this.field5763 && !this.field5720);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([Ljp;I)Lvr;", line = 688)
    public final class116 method1833(class297[] arg0, int arg1) {
        if (arg1 != 0) {
            this.field8574 = null;
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "(I)V", line = 702)
    public final void method1788(int arg0) {
        if (arg0 == 7) {
            this.field8586.method2336(28, this.field5788 && this.field5771 && this.field5705 | this.field5697 >= 0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILg;ZLvp;)Leea;", line = 712)
    public final class112 method1839(int arg0, int arg1, class135 arg2, boolean arg3, class160 arg4) {
        if (!arg3) {
            this.field8566 = 22;
        }
        return new class221(this, arg2, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "(I)V", line = 722)
    public final void method1835(int arg0) {
        if (this.field5690) {
            field8583[8] = 0.0F;
            field8583[5] = 1.0F;
            field8583[3] = 0.0F;
            field8583[10] = 1.0F;
            field8583[14] = 0.0F;
            field8583[7] = 0.0F;
            field8583[6] = 0.0F;
            field8583[2] = 0.0F;
            field8583[15] = 1.0F;
            field8583[1] = 0.0F;
            field8583[12] = 0.0F;
            field8583[11] = 0.0F;
            field8583[0] = 1.0F;
            field8583[13] = 0.0F;
            field8583[4] = 0.0F;
            field8583[9] = 0.0F;
        } else {
            this.field5687.method1884(field8583, (byte) 47);
        }
        int var2 = -34 % ((40 - arg0) / 61);
        this.field8586.SetTransform(256, field8583);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[BZILg;II)Leea;", line = 759)
    public final class112 method1827(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, class135 arg5, int arg6, int arg7) {
        int var9 = 91 / ((arg6 + 6) / 57);
        return new class221(this, arg5, arg4, arg0, arg3, arg2, arg1, arg7);
    }

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "(I)V", line = 768)
    public final void method1838(int arg0) {
        int var2 = this.field8561[this.field5750] ? method3433(-69, this.field5764[this.field5750]) : 1;
        this.field8586.SetTextureStageState(this.field5750, 1, var2);
        if (arg0 != -1) {
            this.field8570 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V", line = 780)
    public final void method1810(byte arg0, int arg1) {
        if (arg0 < -43) {
            this.field8586.SetTextureStageState(this.field5750, 11, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 791)
    public final void method1811(byte arg0) {
        if (arg0 != 6) {
            return;
        }
        if (this.field5770[this.field5750] == class514.field7260) {
            this.field8586.SetTextureStageState(this.field5750, 24, 0);
            this.field8564[this.field5750] = 0;
            return;
        }
        if (this.field5770[this.field5750] == class288.field3743) {
            this.field8586.SetTransform(this.field5750 + 16, this.field5789[this.field5750].method1884(field8583, (byte) 47));
        } else {
            this.field8586.SetTransform(this.field5750 + 16, this.field5789[this.field5750].method1873((byte) 76, field8583));
        }
        int var2 = method3434(this.field5770[this.field5750], 18136);
        if (this.field8564[this.field5750] != var2) {
            this.field8586.SetTextureStageState(this.field5750, 24, var2);
            this.field8564[this.field5750] = var2;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLie;)I", line = 822)
    private static final int method3430(byte arg0, class6 arg1) {
        if (class178.field2158 == arg1) {
            return 2;
        } else if (class116.field1453 == arg1) {
            return 1;
        } else {
            if (arg0 > -126) {
                method3430((byte) -82, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "(I)V", line = 841)
    public final void method1829(int arg0) {
        if (arg0 != 16) {
            this.field8564 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "(I)V", line = 852)
    public final void method1809(int arg0) {
        for (int var2 = 0; var2 < this.field5768; var2++) {
            this.field8586.SetSamplerState(var2, 7, 0);
            this.field8586.SetSamplerState(var2, 6, 2);
            this.field8586.SetSamplerState(var2, 5, 2);
            this.field8586.SetSamplerState(var2, 1, 1);
            this.field8586.SetSamplerState(var2, 2, 1);
            this.field8580[var2] = class178.field2158;
            this.field8568[var2] = this.field8562[var2] = true;
            this.field8573[var2] = false;
            this.field8564[var2] = 0;
        }
        this.field8586.SetTextureStageState(0, 6, 1);
        this.field8586.SetRenderState(9, 2);
        this.field8586.SetRenderState(23, 4);
        this.field8586.SetRenderState(25, 5);
        this.field8586.SetRenderState(24, 0);
        this.field8586.SetRenderState(22, 2);
        this.field8586.SetRenderState(147, 1);
        this.field8586.SetRenderState(145, 1);
        this.field8586.method2326(38, 0.95F);
        this.field8586.SetRenderState(140, 3);
        this.field8570.SetType(3);
        this.field8579.SetType(3);
        this.field8577.SetType(1);
        this.field8576 = false;
        super.method1809(arg0 + arg0);
    }

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "()Z", line = 889)
    public final boolean method1143() {
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "(B)V", line = 896)
    public final void method1804(byte arg0) {
        if (arg0 != -8) {
            this.method1824(114);
        }
        this.field8586.method2336(7, this.field5706);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 906)
    public final void method1813(int arg0, Object arg1, Canvas arg2) {
        if (arg0 > 60 && this.field5612 == arg2) {
            this.field8586.EndScene();
            this.method3428((byte) -128);
            this.field8586.BeginScene();
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V", line = 922)
    public final void method1185(boolean arg0) {
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "()V", line = 925)
    public final void method1131() {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(FFF)V", line = 927)
    public final void method1171(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "(I)V", line = 930)
    public final void method1793(int arg0) {
        if (class328.field4273 == this.field5709) {
            this.field8586.SetRenderState(19, 5);
            this.field8586.SetRenderState(20, 6);
        } else if (class528.field7391 == this.field5709) {
            this.field8586.SetRenderState(19, 2);
            this.field8586.SetRenderState(20, 2);
        } else if (class308.field3931 == this.field5709) {
            this.field8586.SetRenderState(19, 9);
            this.field8586.SetRenderState(20, 2);
        }
        if (arg0 != 1) {
            this.method1809(-93);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 962)
    public final Object method1818(Canvas arg0, int arg1) {
        int var3 = -111 / ((arg1 - 34) / 38);
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "()Lfd;", line = 971)
    public final class448 method1172() {
        D3DADAPTER_IDENTIFIER var1 = this.field8574.method2319(this.field8566, 0);
        return new class448(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZB)Liaa;", line = 979)
    public final class419 method1795(boolean arg0, byte arg1) {
        return arg1 > -46 ? (class419) null : new class111(this, class160.field1933, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILvp;Lg;)Z", line = 990)
    public final boolean method1805(int arg0, class160 arg1, class135 arg2) {
        int var4 = -33 / ((arg0 + 55) / 35);
        D3DDISPLAYMODE var5 = this.field8574.method2317(this.field8566);
        return class407.method2320(this.field8574.CheckDeviceFormat(this.field8566, this.field8582, var5.Format, 0, 3, method3435(arg2, -127, arg1)), -2005530590);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lbg;IZI)V", line = 1013)
    public final void method1802(class393 arg0, int arg1, boolean arg2, int arg3) {
        byte var6;
        if (arg3 == 1) {
            var6 = 6;
        } else if (arg3 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = arg1;
        if (arg2) {
            var7 = arg1 | 0x10;
        }
        this.field8586.SetTextureStageState(this.field5750, var6, method3432(arg1 - 46, arg0) | var7);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lmv;Lmv;FLmv;)Lmv;", line = 1044)
    public final class313 method1162(class313 arg0, class313 arg1, float arg2, class313 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLmda;)V", line = 1051)
    public final void method3431(byte arg0, class221 arg1) {
        this.method3429(arg1, (byte) 58);
        if (arg1.field2725 != this.field8568[this.field5750]) {
            this.field8586.SetSamplerState(this.field5750, 1, arg1.field2725 ? 1 : 3);
            this.field8568[this.field5750] = arg1.field2725;
        }
        if (arg0 != 29) {
            this.method1111(-72, -53, 26, 73);
        }
        if (this.field8562[this.field5750] != arg1.field2722) {
            this.field8586.SetSamplerState(this.field5750, 2, arg1.field2722 ? 1 : 3);
            this.field8562[this.field5750] = arg1.field2722;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILbg;)I", line = 1076)
    private static final int method3432(int arg0, class393 arg1) {
        if (class289.field3751 == arg1) {
            return 2;
        } else if (class167.field2044 == arg1) {
            return 0;
        } else if (class99.field1226 == arg1) {
            return 1;
        } else if (class264.field3445 == arg1) {
            return 3;
        } else {
            int var2 = -31 / ((42 - arg0) / 42);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "(I)V", line = 1101)
    public final void method1807(int arg0) {
        if (arg0 != 0) {
            this.method1157();
        }
        this.field8579.SetAmbient(this.field5774 * this.field5747, this.field5790 * this.field5774, this.field5774 * this.field5729, 1.0F);
        this.field8576 = false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILsc;Liaa;II)V", line = 1120)
    public final void method1801(int arg0, int arg1, int arg2, class290 arg3, class419 arg4, int arg5, int arg6) {
        this.field8586.SetIndices(((class111) arg4).field1370);
        if (arg2 != 1440) {
            this.field8584 = null;
        }
        this.field8586.DrawIndexedPrimitive(method3427(arg3, (byte) 13), 0, arg0, arg1, arg6, arg5);
    }

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "()V", line = 1139)
    public final void method1192() {
        IDirect3DEventQuery var1 = this.field8586.method2332();
        if (!class407.method2320(var1.Issue(), -2005530590)) {
            return;
        }
        while (true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
                break;
            }
            Thread.yield();
        }
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "(B)V", line = 1162)
    public final void method1797(byte arg0) {
        if (this.field5728.method3455((byte) 77)) {
            this.field5694.method1884(field8583, (byte) 47);
        } else {
            field8583[6] = 0.0F;
            field8583[11] = 0.0F;
            field8583[12] = 0.0F;
            field8583[3] = 0.0F;
            field8583[9] = 0.0F;
            field8583[8] = 0.0F;
            field8583[13] = 0.0F;
            field8583[0] = 1.0F;
            field8583[15] = 1.0F;
            field8583[1] = 0.0F;
            field8583[2] = 0.0F;
            field8583[14] = 0.0F;
            field8583[4] = 0.0F;
            field8583[10] = 1.0F;
            field8583[5] = 1.0F;
            field8583[7] = 0.0F;
        }
        if (arg0 != 76) {
            this.field8585 = false;
        }
        this.field8586.SetTransform(2, field8583);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lg;III[BZ)Law;", line = 1199)
    public final class65 method1790(class135 arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5) {
        return arg5 ? new class452(this, arg0, arg2, arg3, arg1, arg4) : (class65) null;
    }

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "(I)V", line = 1209)
    public final void method1836(int arg0) {
        this.field8586.method2336(174, this.field5820);
        if (arg0 != -1) {
            this.field8568 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "()Z", line = 1220)
    public final boolean method1169() {
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILraa;)I", line = 1227)
    private static final int method3433(int arg0, class520 arg1) {
        if (class2.field7 == arg1) {
            return 2;
        } else if (class564.field8287 == arg1) {
            return 4;
        } else if (class529.field7403 == arg1) {
            return 26;
        } else if (class402.field5281 == arg1) {
            return 7;
        } else if (class66.field643 == arg1) {
            return 10;
        } else {
            if (arg0 > -32) {
                field8583 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)V", line = 1257)
    public final void method1832(int arg0) {
        if (arg0 > 17) {
            this.field8586.SetRenderState(60, this.field5734);
        }
    }

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "()V", line = 1268)
    public final void method1166() {
        this.method2478((byte) 88, true);
        this.field8586.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 1277)
    public final void method1814(Object arg0, Canvas arg1, int arg2) {
        if (arg2 >= -92) {
            this.field8582 = 81;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 1293)
    public final synchronized void method1138(int arg0) {
        this.field8584.method3359(48);
        super.method1138(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()V", line = 1300)
    public final void method1117() {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZIILbg;)V", line = 1305)
    public final void method1798(boolean arg0, boolean arg1, int arg2, int arg3, class393 arg4) {
        if (arg3 != 6) {
            return;
        }
        int var6 = 0;
        byte var8;
        if (arg2 == 1) {
            var8 = 3;
        } else if (arg2 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg0) {
            var6 |= 0x20;
        }
        if (arg1) {
            var6 |= 0x10;
        }
        this.field8586.SetTextureStageState(this.field5750, var8, var6 | method3432(arg3 + 96, arg4));
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V", line = 1352)
    public final void method1132(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "(I)F", line = 1355)
    public final float method1844(int arg0) {
        if (arg0 != -10259) {
            this.field8573 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "(I)V", line = 1365)
    public final void method1156(int arg0) {
        this.field8586.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 1372)
    public final void method1816(Object arg0, byte arg1, Canvas arg2) {
        this.field8575 = (class363) arg0;
        if (arg1 != -40) {
            this.method1829(52);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(ZI)V", line = 1382)
    public final void method1834(boolean arg0, int arg1) {
        if (arg1 != 21492) {
            this.method1843((byte) 117, 96);
        }
        this.field8586.method2336(161, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V", line = 1393)
    public final void method1830(int arg0) {
        int var2 = -100 / ((arg0 - 2) / 49);
        this.field8586.method2336(27, this.field5730);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([FIIZIILg;B)Leea;", line = 1402)
    public final class112 method1819(float[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class135 arg6, byte arg7) {
        if (arg7 != -108) {
            this.field8575 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lsc;III)V", line = 1416)
    public final void method1791(class290 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 2) {
            this.field8586.DrawPrimitive(method3427(arg0, (byte) 42), arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lft;I)I", line = 1431)
    private static final int method3434(class4 arg0, int arg1) {
        if (class136.field1659 == arg0) {
            return 1;
        } else if (class187.field2256 == arg0) {
            return 2;
        } else if (class104.field1270 == arg0) {
            return 3;
        } else if (class288.field3743 == arg0) {
            return 4;
        } else if (class350.field4519 == arg0) {
            return 256;
        } else if (arg1 == 18136) {
            return 0;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLg;Lvp;)Z", line = 1462)
    public final boolean method1845(byte arg0, class135 arg1, class160 arg2) {
        D3DDISPLAYMODE var4 = this.field8574.method2317(this.field8566);
        return arg0 <= 100 ? false : class407.method2320(this.field8574.CheckDeviceFormat(this.field8566, this.field8582, var4.Format, 0, 4, method3435(arg1, -125, arg2)), -2005530590);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lrq;IB)V", line = 1473)
    public final void method1792(class293 arg0, int arg1, byte arg2) {
        if (arg2 == 89) {
            class77 var4 = (class77) arg0;
            this.field8586.SetStreamSource(arg1, var4.field899, 0, var4.method445(-85));
        }
    }

    @OriginalMember(owner = "client!hg", name = "YA", descriptor = "()I", line = 1485)
    public final int method1157() {
        return 0;
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(B)V", line = 1493)
    public final void method1806(byte arg0) {
        int var2 = this.field8561[this.field5750] ? method3433(-39, this.field5742[this.field5750]) : 1;
        if (arg0 >= -47) {
            this.field8574 = null;
        }
        this.field8586.SetTextureStageState(this.field5750, 4, var2);
    }

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "(I)V", line = 1504)
    public final void method1812(int arg0) {
        if (arg0 != 16168) {
            this.field8573 = null;
        }
        this.field8586.method2336(15, this.field5718);
    }

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "(I)V", line = 1514)
    public final void method1824(int arg0) {
        if (arg0 == 28526) {
            this.field8579.SetDiffuse(this.field5747 * this.field5746, this.field5790 * this.field5746, this.field5746 * this.field5729, 1.0F);
            this.field8570.SetDiffuse(-this.field5702 * this.field5747, -this.field5702 * this.field5790, -this.field5702 * this.field5729, 1.0F);
            this.field8576 = false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lg;ILvp;)I", line = 1528)
    public static final int method3435(class135 arg0, int arg1, class160 arg2) {
        if (class160.field1932 == arg2) {
            if (class147.field1765 == arg0) {
                return 22;
            }
            if (class10.field80 == arg0) {
                return 21;
            }
            if (class37.field293 == arg0) {
                return 28;
            }
            if (class638.field9183 == arg0) {
                return 50;
            }
            if (class127.field1570 == arg0) {
                return 51;
            }
            if (class101.field1252 == arg0) {
                return 77;
            }
        }
        if (arg1 <= -124) {
            throw new IllegalArgumentException("");
        }
        return -63;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)Llj;", line = 1568)
    public final class521 method1843(byte arg0, int arg1) {
        int var3 = -6 / ((arg0 - 64) / 45);
        if (arg1 == 3) {
            return new class490(this, this.field5586);
        } else if (arg1 == 4) {
            return new class109(this, this.field5586, this.field5562);
        } else {
            return super.method1843((byte) 121, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI[IIII)Leea;", line = 1602)
    public final class112 method1794(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            this.method1138(92);
        }
        return new class221(this, arg5, arg2, arg1, arg3, arg6, arg4);
    }
}
