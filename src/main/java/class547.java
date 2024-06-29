import jaclib.peer.class579;
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
import jagdx.class411;
import jagdx.class412;
import jagdx.class413;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class547 extends class444 {

    @OriginalMember(owner = "client!wda", name = "Gg", descriptor = "I")
    private int field8169 = 0;

    @OriginalMember(owner = "client!wda", name = "Rg", descriptor = "Z")
    private boolean field8180 = false;

    @OriginalMember(owner = "client!wda", name = "Vg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8184;

    @OriginalMember(owner = "client!wda", name = "zg", descriptor = "I")
    private int field8162;

    @OriginalMember(owner = "client!wda", name = "xg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8160;

    @OriginalMember(owner = "client!wda", name = "Sg", descriptor = "Ljaclib/peer/of;")
    public class579 field8181;

    @OriginalMember(owner = "client!wda", name = "Mg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8175;

    @OriginalMember(owner = "client!wda", name = "Og", descriptor = "Lul;")
    private class492 field8177;

    @OriginalMember(owner = "client!wda", name = "Pg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8178;

    @OriginalMember(owner = "client!wda", name = "Ug", descriptor = "I")
    private int field8183;

    @OriginalMember(owner = "client!wda", name = "Bg", descriptor = "Ljagdx/D3DLIGHT;")
    private class413 field8164;

    @OriginalMember(owner = "client!wda", name = "Dg", descriptor = "Ljagdx/D3DLIGHT;")
    private class413 field8166;

    @OriginalMember(owner = "client!wda", name = "Fg", descriptor = "Ljagdx/D3DLIGHT;")
    private class413 field8168;

    @OriginalMember(owner = "client!wda", name = "Ng", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8176;

    @OriginalMember(owner = "client!wda", name = "Qg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8179;

    @OriginalMember(owner = "client!wda", name = "Cg", descriptor = "Z")
    public boolean field8165;

    @OriginalMember(owner = "client!wda", name = "Tg", descriptor = "Z")
    public boolean field8182;

    @OriginalMember(owner = "client!wda", name = "Jg", descriptor = "Z")
    public boolean field8172;

    @OriginalMember(owner = "client!wda", name = "Lg", descriptor = "[I")
    private int[] field8174;

    @OriginalMember(owner = "client!wda", name = "Kg", descriptor = "[Z")
    private boolean[] field8173;

    @OriginalMember(owner = "client!wda", name = "wg", descriptor = "[Lpw;")
    private class606[] field8159;

    @OriginalMember(owner = "client!wda", name = "vg", descriptor = "[Z")
    private boolean[] field8158;

    @OriginalMember(owner = "client!wda", name = "Ag", descriptor = "[Z")
    private boolean[] field8163;

    @OriginalMember(owner = "client!wda", name = "Ig", descriptor = "[Z")
    private boolean[] field8171;

    @OriginalMember(owner = "client!wda", name = "yg", descriptor = "[I")
    private static int[] field8161 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!wda", name = "Hg", descriptor = "[F")
    private static float[] field8170 = new float[16];

    @OriginalMember(owner = "client!wda", name = "Eg", descriptor = "[I")
    private static int[] field8167 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "()V", line = 3)
    public final void method436() {
    }

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "(I)V", line = 7)
    public final void method2619(int arg0) {
        int var2 = -40 % ((arg0 - 64) / 48);
        this.field8175.LightEnable(0, this.field6180);
        this.field8175.LightEnable(1, this.field6180);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLpw;)I", line = 16)
    private static final int method3320(boolean arg0, class606 arg1) {
        if (class619.field9140 == arg1) {
            return 2;
        } else if (class192.field2855 == arg1) {
            return 1;
        } else if (arg0) {
            throw new IllegalArgumentException();
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZZ)Laf;", line = 34)
    public final class370 method2638(boolean arg0, boolean arg1) {
        return arg1 ? (class370) null : new class191(this, class194.field2875, arg0);
    }

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "(B)V", line = 44)
    public final void method2605(byte arg0) {
        if (arg0 != -36) {
            this.method2568(null, 126, 76, -90, -118, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)V", line = 52)
    public final void method449(boolean arg0) {
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lqba;Lqba;FLqba;)Lqba;", line = 57)
    public final class345 method439(class345 arg0, class345 arg1, float arg2, class345 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLsk;)V", line = 67)
    public final void method2584(boolean arg0, class532 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0) {
            this.field8175.SetVertexDeclaration(var3.field3821);
        }
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(Z)V", line = 78)
    public final void method2570(boolean arg0) {
        this.field8175.method2433(27, this.field6155);
        if (arg0) {
            this.field8168 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "(Z)V", line = 89)
    public final void method2609(boolean arg0) {
        if (this.field6137[this.field6099] == class636.field9304) {
            this.field8175.SetTextureStageState(this.field6099, 24, 0);
            this.field8174[this.field6099] = 0;
        } else {
            if (this.field6137[this.field6099] == class464.field6525) {
                this.field8175.SetTransform(this.field6099 + 16, this.field6103[this.field6099].method368(field8170, -16365));
            } else {
                this.field8175.SetTransform(this.field6099 + 16, this.field6103[this.field6099].method384(14212, field8170));
            }
            int var2 = method3327(this.field6137[this.field6099], (byte) -108);
            if (this.field8174[this.field6099] != var2) {
                this.field8175.SetTextureStageState(this.field6099, 24, var2);
                this.field8174[this.field6099] = var2;
            }
        }
        if (arg0) {
            this.field8171 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "Y", descriptor = "(I)V", line = 120)
    public final void method2687(int arg0) {
        if (class44.field518 == this.field6182) {
            this.field8175.SetRenderState(19, 5);
            this.field8175.SetRenderState(20, 6);
        } else if (class341.field4715 == this.field6182) {
            this.field8175.SetRenderState(19, 2);
            this.field8175.SetRenderState(20, 2);
        } else if (class526.field7530 == this.field6182) {
            this.field8175.SetRenderState(19, 9);
            this.field8175.SetRenderState(20, 2);
        }
        if (arg0 != 0) {
            field8170 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "(I)V", line = 149)
    public final void method2607(int arg0) {
        if (this.field6117) {
            this.field8175.method2432(36, 0.0F);
            this.field8175.method2432(37, 1.0F);
            this.field8175.SetRenderState(34, this.field6162);
        } else {
            this.field6113 = (this.field6115 - this.field6114);
            this.field6097 = (float) (-this.field6153) + this.field6113;
            if (this.field6097 < (float) this.field6161) {
                this.field6097 = this.field6161;
            }
            this.field8175.method2432(36, this.field6097);
            this.field8175.method2432(37, this.field6113);
            this.field8175.SetRenderState(34, this.field6147);
        }
        if (arg0 != -2) {
            this.method501();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII[IZI)Ljb;", line = 178)
    public final class422 method2691(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6) {
        if (arg6 != 12441) {
            this.method2651((byte) -24, null);
        }
        return new class264(this, arg2, arg0, arg5, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(FFF)V", line = 187)
    public final void method470(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lui;BLaq;)I", line = 190)
    public static final int method3321(class194 arg0, byte arg1, class141 arg2) {
        if (arg1 != 78) {
            field8170 = null;
        }
        if (class194.field2874 == arg0) {
            if (class245.field3536 == arg2) {
                return 22;
            }
            if (class488.field6956 == arg2) {
                return 21;
            }
            if (class613.field9072 == arg2) {
                return 28;
            }
            if (class609.field9043 == arg2) {
                return 50;
            }
            if (class540.field8108 == arg2) {
                return 51;
            }
            if (class272.field3847 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "(I)V", line = 227)
    public final void method2618(int arg0) {
        if (arg0 == 11) {
            this.field8175.SetViewport(this.field6192, this.field6132, this.field6044, this.field5975, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "(I)V", line = 241)
    public final void method2621(int arg0) {
        if (arg0 != 0) {
            field8161 = null;
        }
        this.field8175.SetTransform(3, this.field6196);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I[Lwj;)Lsk;", line = 252)
    public final class532 method2649(int arg0, class334[] arg1) {
        return arg0 > -117 ? (class532) null : new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!wda", name = "YA", descriptor = "()I", line = 262)
    public final int method420() {
        return 0;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lgf;III)V", line = 272)
    public final void method2587(class232 arg0, int arg1, int arg2, int arg3) {
        this.field8175.DrawPrimitive(method3322(arg0, (byte) 70), arg3, arg2);
        if (arg1 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lgf;B)I", line = 284)
    private static final int method3322(class232 arg0, byte arg1) {
        if (class242.field3468 == arg0) {
            return 2;
        } else if (class237.field3418 == arg0) {
            return 3;
        } else if (class454.field6410 == arg0) {
            return 1;
        } else if (class569.field8396 == arg0) {
            return 4;
        } else if (class230.field3373 == arg0) {
            return 6;
        } else if (class526.field7529 == arg0) {
            return 5;
        } else {
            if (arg1 != 70) {
                field8167 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLiw;)V", line = 317)
    public final void method3323(boolean arg0, class264 arg1) {
        this.method3324(arg1, -120);
        if (arg1.field3755 != this.field8171[this.field6099]) {
            this.field8175.SetSamplerState(this.field6099, 1, arg1.field3755 ? 1 : 3);
            this.field8171[this.field6099] = arg1.field3755;
        }
        if (!arg0) {
            this.method433();
        }
        if (this.field8173[this.field6099] != arg1.field3753) {
            this.field8175.SetSamplerState(this.field6099, 2, arg1.field3753 ? 1 : 3);
            this.field8173[this.field6099] = arg1.field3753;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLui;Laq;)Z", line = 341)
    public final boolean method2633(byte arg0, class194 arg1, class141 arg2) {
        if (arg0 < 123) {
            return true;
        } else {
            D3DDISPLAYMODE var4 = this.field8184.method2417(this.field8162);
            return class411.method2436(this.field8184.CheckDeviceFormat(this.field8162, this.field8183, var4.Format, 0, 3, method3321(arg1, (byte) 78, arg2)), (byte) 45);
        }
    }

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "(I)V", line = 353)
    public final void method2610(int arg0) {
        int var2 = 69 / ((-arg0 - 36) / 50);
        this.field8164.SetDiffuse(this.field6176 * this.field6126, this.field6165 * this.field6126, this.field6126 * this.field6107, 0.0F);
        this.field8166.SetDiffuse(-this.field6163 * this.field6176, -this.field6163 * this.field6165, -this.field6163 * this.field6107, 0.0F);
        this.field8180 = false;
    }

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "(I)V", line = 364)
    public final void method2620(int arg0) {
        if (arg0 >= -48) {
            return;
        }
        if (this.field6154.method3612(120)) {
            this.field6094.method368(field8170, -16365);
        } else {
            field8170[12] = 0.0F;
            field8170[13] = 0.0F;
            field8170[15] = 1.0F;
            field8170[14] = 0.0F;
            field8170[1] = 0.0F;
            field8170[10] = 1.0F;
            field8170[9] = 0.0F;
            field8170[6] = 0.0F;
            field8170[2] = 0.0F;
            field8170[5] = 1.0F;
            field8170[7] = 0.0F;
            field8170[8] = 0.0F;
            field8170[4] = 0.0F;
            field8170[0] = 1.0F;
            field8170[3] = 0.0F;
            field8170[11] = 0.0F;
        }
        this.field8175.SetTransform(2, field8170);
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/of;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lul;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ln;Lkda;I)V", line = 400)
    private class547(int arg0, int arg1, Canvas arg2, class579 arg3, IDirect3D arg4, IDirect3DDevice arg5, class492 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class17 arg9, class328 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field8184 = arg4;
        this.field8162 = arg0;
        this.field8160 = arg7;
        this.field8181 = arg3;
        this.field8175 = arg5;
        this.field8177 = arg6;
        this.field8178 = arg8;
        this.field8183 = arg1;
        this.field8164 = new class413(this.field8181);
        this.field8166 = new class413(this.field8181);
        this.field8168 = new class413(this.field8181);
        this.field8176 = new PixelBuffer(this.field8181);
        this.field8179 = new GeometryBuffer(this.field8181);
        this.field6141 = (this.field8178.TextureCaps & 0x2000) != 0;
        this.field6159 = (this.field8178.TextureCaps & 0x800) != 0;
        this.field6129 = this.field8178.MaxActiveLights > 0 ? this.field8178.MaxActiveLights : 8;
        this.field8165 = (this.field8178.TextureCaps & 0x2) == 0;
        this.field8182 = (this.field8178.TextureCaps & 0x10000) != 0;
        this.field6128 = this.field8178.MaxSimultaneousTextures;
        this.field8172 = (this.field8178.TextureCaps & 0x4000) != 0;
        this.field6170 = this.field6178 > 0 || this.field8184.CheckDeviceMultiSampleType(this.field8162, this.field8183, this.field8160.BackBufferFormat, true, 2) == 0;
        this.field8174 = new int[this.field6128];
        this.field8173 = new boolean[this.field6128];
        this.field8159 = new class606[this.field6128];
        this.field8158 = new boolean[this.field6128];
        this.field8163 = new boolean[this.field6128];
        this.field8171 = new boolean[this.field6128];
        this.field8175.BeginScene();
        try {
            this.field8175.Clear(3, 0, 1.0F, 0);
            this.method493();
            this.field8175.Clear(3, 0, 1.0F, 0);
        } catch (class416 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "()Z", line = 445)
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "(I)V", line = 452)
    public final void method2591(int arg0) {
        this.field8175.method2433(28, this.field6167 && this.field6143 && this.field6153 >= 0 | this.field6117);
        if (arg0 != 15385) {
            this.field8162 = -40;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII)V", line = 461)
    public final void method506(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(B)F", line = 464)
    public final float method2580(byte arg0) {
        return arg0 < 92 ? -1.3484612F : -0.5F;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lfca;I)V", line = 474)
    public final void method3324(class75 arg0, int arg1) {
        this.field8175.SetTexture(this.field6099, arg0.method588(281));
        if (arg1 >= -82) {
            return;
        }
        if (this.field8159[this.field6099] != arg0.field1004) {
            int var3 = method3320(true, arg0.field1004);
            this.field8175.SetSamplerState(this.field6099, 6, var3);
            this.field8175.SetSamplerState(this.field6099, 5, var3);
            this.field8159[this.field6099] = arg0.field1004;
            if (this.field8163[this.field6099] != arg0.field1003) {
                this.field8175.SetSamplerState(this.field6099, 7, arg0.field1003 ? method3320(true, arg0.field1004) : 0);
                this.field8163[this.field6099] = arg0.field1003;
            }
        } else if (this.field8163[this.field6099] != arg0.field1003) {
            this.field8175.SetSamplerState(this.field6099, 7, arg0.field1003 ? method3320(true, arg0.field1004) : 0);
            this.field8163[this.field6099] = arg0.field1003;
        }
        if (!this.field8158[this.field6099]) {
            this.field8158[this.field6099] = true;
            this.method2629((byte) 56);
            this.method2654((byte) 104);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 515)
    public final Object method2645(Canvas arg0, int arg1) {
        return arg1 == 24180 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZILhm;)V", line = 537)
    public final void method2581(int arg0, boolean arg1, int arg2, class188 arg3) {
        byte var6;
        if (arg0 == 1) {
            var6 = 6;
        } else if (arg0 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = arg2;
        if (arg1) {
            var7 = arg2 | 0x10;
        }
        this.field8175.SetTextureStageState(this.field6099, var6, var7 | method3325(-6547, arg3));
    }

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "(I)V", line = 569)
    public final void method2628(int arg0) {
        this.field8175.SetRenderState(60, this.field6191);
        if (arg0 != 1) {
            this.method2645(null, 53);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILhm;)I", line = 579)
    private static final int method3325(int arg0, class188 arg1) {
        if (class453.field6405 == arg1) {
            return 2;
        } else if (class325.field4478 == arg1) {
            return 0;
        } else if (class645.field9388 == arg1) {
            return 1;
        } else if (class314.field4331 == arg1) {
            return 3;
        } else if (arg0 == -6547) {
            throw new IllegalArgumentException();
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IILui;ILaq;)Ljb;", line = 607)
    public final class422 method2695(int arg0, int arg1, class194 arg2, int arg3, class141 arg4) {
        return arg3 == 0 ? new class264(this, arg4, arg2, arg1, arg0) : (class422) null;
    }

    @OriginalMember(owner = "client!wda", name = "R", descriptor = "(I)V", line = 617)
    public final void method2673(int arg0) {
        if (arg0 == 7 && this.field8158[this.field6099]) {
            this.field8158[this.field6099] = false;
            this.field8175.SetTexture(this.field6099, null);
            this.method2629((byte) 94);
            this.method2654((byte) 104);
        }
    }

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "(B)V", line = 637)
    public final void method2602(byte arg0) {
        int var2 = 88 % ((35 - arg0) / 42);
        this.field8164.SetDirection(-this.field6134[0], -this.field6134[1], -this.field6134[2]);
        this.field8166.SetDirection(-this.field6123[0], -this.field6123[1], -this.field6123[2]);
        this.field8180 = false;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V", line = 649)
    public final void method2604(Canvas arg0, boolean arg1, Object arg2) {
        if (this.field5965 == arg0) {
            this.field8175.EndScene();
            this.method3329(-126);
            this.field8175.BeginScene();
        }
        if (arg1) {
            this.method2691(96, 35, 94, 98, null, false, -31);
        }
    }

    @OriginalMember(owner = "client!wda", name = "N", descriptor = "(I)V", line = 668)
    public final void method2665(int arg0) {
        for (int var2 = 0; var2 < this.field6128; var2++) {
            this.field8175.SetSamplerState(var2, 7, 0);
            this.field8175.SetSamplerState(var2, 6, 2);
            this.field8175.SetSamplerState(var2, 5, 2);
            this.field8175.SetSamplerState(var2, 1, 1);
            this.field8175.SetSamplerState(var2, 2, 1);
            this.field8159[var2] = class619.field9140;
            this.field8171[var2] = this.field8173[var2] = true;
            this.field8163[var2] = false;
            this.field8174[var2] = 0;
        }
        this.field8175.SetTextureStageState(0, 6, 1);
        this.field8175.SetRenderState(9, 2);
        this.field8175.SetRenderState(23, 4);
        if (arg0 != 7) {
            this.method2621(108);
        }
        this.field8175.SetRenderState(25, 5);
        this.field8175.SetRenderState(24, 0);
        this.field8175.SetRenderState(22, 2);
        this.field8175.SetRenderState(147, 1);
        this.field8175.SetRenderState(145, 1);
        this.field8175.method2432(38, 0.95F);
        this.field8175.SetRenderState(140, 3);
        this.field8164.SetType(3);
        this.field8166.SetType(3);
        this.field8168.SetType(1);
        this.field8180 = false;
        super.method2665(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "()Z", line = 707)
    public final boolean method487() {
        return false;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Laq;IIII[B)Lvi;", line = 715)
    public final class462 method2568(class141 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg4 != 0) {
            this.field8177 = null;
        }
        return new class548(this, arg0, arg2, arg1, arg3, arg5);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "()V", line = 725)
    public final void method473() {
        this.field8181.method3462(-67);
        super.method473();
    }

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "(I)V", line = 735)
    public final void method2636(int arg0) {
        if (!this.field8180) {
            this.field8175.LightEnable(0, !this.field6180);
            this.field8175.LightEnable(1, !this.field6180);
            this.field8175.SetLight(0, this.field8164);
            this.field8175.SetLight(1, this.field8166);
            this.field8175.LightEnable(0, this.field6180);
            this.field8175.LightEnable(1, this.field6180);
            this.field8180 = true;
        }
        if (arg0 != 1) {
            this.field8165 = false;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lql;IB)V", line = 757)
    public final void method2617(class628 arg0, int arg1, byte arg2) {
        class305 var4 = (class305) arg0;
        this.field8175.SetStreamSource(arg1, var4.field4185, 0, var4.method1868((byte) -114));
        if (arg2 <= 100) {
            method3330(8, 83, -42, null, (byte) -124, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "(IIII)[I", line = 769)
    public final int[] method456(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8175.method2425(0);
        IDirect3DSurface var7 = this.field8175.method2430(arg2, arg3, 21, 0, 0, true);
        if (class411.method2436(this.field8175.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1), (byte) 93) && class411.method2436(var7.LockRect(0, 0, arg2, arg3, 0, this.field8176), (byte) 102)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8176.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field8176.method2441(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8176.method2441(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3460(2266);
        var7.method3460(2266);
        return var5;
    }

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "(B)V", line = 810)
    public final void method2592(byte arg0) {
        this.field8175.method2433(7, this.field6122);
        if (arg0 <= 62) {
            this.field8184 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 820)
    public final void method2676(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 > -94) {
            this.field8175 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 833)
    public final void method2668(byte arg0, Object arg1, Canvas arg2) {
        if (arg0 >= -7) {
            this.field8169 = -57;
        }
        this.field8177 = (class492) arg1;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLus;)I", line = 845)
    private static final int method3326(byte arg0, class1 arg1) {
        int var2 = 2 % ((arg0 + 6) / 54);
        if (class296.field4074 == arg1) {
            return 2;
        } else if (class132.field1816 == arg1) {
            return 4;
        } else if (class471.field6648 == arg1) {
            return 26;
        } else if (class533.field7939 == arg1) {
            return 7;
        } else if (class316.field4345 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIZ[[I)Lwv;", line = 874)
    public final class31 method2690(int arg0, int arg1, boolean arg2, int[][] arg3) {
        return arg0 == -1 ? new class74(this, arg1, arg2, arg3) : (class31) null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)Lql;", line = 884)
    public final class628 method2627(boolean arg0, int arg1) {
        if (arg1 != -30125) {
            this.field8160 = null;
        }
        return new class305(this, arg0);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lkv;B)I", line = 894)
    private static final int method3327(class227 arg0, byte arg1) {
        if (arg1 > -66) {
            field8170 = null;
        }
        if (class77.field1027 == arg0) {
            return 1;
        } else if (class210.field3107 == arg0) {
            return 2;
        } else if (class408.field5564 == arg0) {
            return 3;
        } else if (class464.field6525 == arg0) {
            return 4;
        } else if (class300.field4124 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "(B)V", line = 927)
    public final void method2629(byte arg0) {
        if (arg0 <= 20) {
            this.method2661(-58);
        }
        int var2 = this.field8158[this.field6099] ? method3326((byte) -103, this.field6197[this.field6099]) : 1;
        this.field8175.SetTextureStageState(this.field6099, 4, var2);
    }

    @OriginalMember(owner = "client!wda", name = "K", descriptor = "(I)V", line = 940)
    public final void method2661(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field6175; var2++) {
            class405 var3 = this.field6169[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2384(630);
            float var6 = var3.method2382(0) / 255.0F;
            this.field8168.SetPosition((float) var3.method2388((byte) -125), (float) var3.method2383(2039035457), (float) var3.method2389(-10161));
            this.field8168.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFF11) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8168.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2390(6042) * var3.method2390(6042)));
            this.field8168.SetRange((float) var3.method2390(6042));
            this.field8175.SetLight(var4, this.field8168);
            this.field8175.LightEnable(var4, true);
        }
        while (var2 < this.field6149) {
            this.field8175.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2661(-45);
        if (arg0 > -7) {
            this.method2647(false);
        }
    }

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "(Z)V", line = 978)
    public final void method2647(boolean arg0) {
        this.field8164.SetAmbient(this.field6190 * this.field6176, this.field6190 * this.field6165, this.field6190 * this.field6107, 0.0F);
        this.field8180 = arg0;
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "()V", line = 987)
    public final void method504() {
        IDirect3DEventQuery var1 = this.field8175.method2431();
        if (!class411.method2436(var1.Issue(), (byte) 38)) {
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

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "(B)V", line = 1011)
    public final void method2593(byte arg0) {
        this.field8175.SetScissorRect(this.field6192 + this.field6150, this.field6152 + this.field6132, this.field6183, this.field6172);
        if (arg0 <= 12) {
            method3325(-57, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BLaq;ZIIIIZ)Ljb;", line = 1021)
    public final class422 method2641(byte[] arg0, class141 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            this.field8179 = null;
        }
        return new class264(this, arg1, arg6, arg4, arg2, arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILaq;Lui;)Z", line = 1033)
    public final boolean method2583(int arg0, class141 arg1, class194 arg2) {
        D3DDISPLAYMODE var4 = this.field8184.method2417(this.field8162);
        return arg0 == 0 ? class411.method2436(this.field8184.CheckDeviceFormat(this.field8162, this.field8183, var4.Format, 0, 4, method3321(arg2, (byte) 78, arg1)), (byte) 95) : true;
    }

    @OriginalMember(owner = "client!wda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ln;Lkda;Ljava/lang/Integer;)Lqa;", line = 1047)
    public static final class208 createToolkit(Canvas arg0, class17 arg1, class328 arg2, Integer arg3) {
        class547 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class579 var7 = new class579();
            IDirect3D var8 = IDirect3D.method2418(-2147483616, var7);
            D3DCAPS var9 = var8.method2414(var5, var6);
            if ((var9.RasterCaps & 0x1000000) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxSimultaneousTextures < 2) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x8) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x40) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x200) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x2000000) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3330(var6, var5, arg3, var10, (byte) -22, var8)) {
                    throw new RuntimeException("");
                }
                var10.PresentationInterval = Integer.MIN_VALUE;
                var10.Windowed = true;
                var10.EnableAutoDepthStencil = true;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method2416(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class412 var17) {
                    var13 = var8.method2416(var5, var6, arg0, var11 | 0x20, var10);
                }
                class492 var15 = new class492(var13.method2419(0), var13.method2421());
                var4 = new class547(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2693(7);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method473();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "()V", line = 1145)
    public final void method501() {
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(ZB)V", line = 1148)
    public final void method2573(boolean arg0, byte arg1) {
        this.field8175.method2433(161, arg0);
        if (arg1 >= -57) {
            this.method2567(30, 46);
        }
    }

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "(B)V", line = 1159)
    public final void method2654(byte arg0) {
        if (arg0 != 104) {
            this.method2568(null, -30, 127, -110, 4, null);
        }
        int var2 = this.field8158[this.field6099] ? method3326((byte) 69, this.field6174[this.field6099]) : 1;
        this.field8175.SetTextureStageState(this.field6099, 1, var2);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lav;B)V", line = 1170)
    public final void method3328(class548 arg0, byte arg1) {
        if (arg1 < 49) {
            this.method480();
        }
        this.method3324(arg0, -124);
        if (!this.field8171[this.field6099]) {
            this.field8175.SetSamplerState(this.field6099, 1, 1);
            this.field8171[this.field6099] = true;
        }
        if (!this.field8173[this.field6099]) {
            this.field8175.SetSamplerState(this.field6099, 2, 1);
            this.field8173[this.field6099] = true;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIB[FIIZLaq;)Ljb;", line = 1192)
    public final class422 method2575(int arg0, int arg1, byte arg2, float[] arg3, int arg4, int arg5, boolean arg6, class141 arg7) {
        return arg2 >= -90 ? (class422) null : null;
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(II)V", line = 1211)
    public final void method2567(int arg0, int arg1) {
        this.field8175.SetTextureStageState(this.field6099, 11, arg0);
        if (arg1 != 0) {
            this.field8175 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLee;)V", line = 1223)
    public final void method2651(byte arg0, class582 arg1) {
        int var3 = 0;
        if (arg0 != -106) {
            this.method456(-83, -40, -12, 88);
        }
        if (class502.field7115 == arg1) {
            var3 = 65536;
        } else if (class36.field433 == arg1) {
            var3 = 131072;
        } else if (class253.field3653 == arg1) {
            var3 = 196608;
        }
        this.field8175.SetTextureStageState(this.field6099, 11, this.field6099 | var3);
    }

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(II)Lgl;", line = 1246)
    public final class516 method2648(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method436();
        }
        if (arg0 == 3) {
            return new class167(this, this.field6066);
        } else if (arg0 == 4) {
            return new class290(this, this.field6066, this.field6016);
        } else {
            return super.method2648(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "()V", line = 1281)
    public final void method493() throws class416 {
        this.field8175.EndScene();
        if (this.field8177.method2945((byte) -4)) {
            this.field8169 = 0;
            if (class411.method2435(this.field8177.method2944(0, (byte) -110), true)) {
                this.method3329(-124);
            }
        } else if (++this.field8169 <= 50) {
            this.method3329(-118);
        } else {
            throw new class416();
        }
        this.field8175.BeginScene();
    }

    @OriginalMember(owner = "client!wda", name = "db", descriptor = "(I)Z", line = 1305)
    private final boolean method3329(int arg0) {
        if (arg0 > -6) {
            this.field8177 = null;
        }
        int var2 = this.field8175.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class492 var3 = (class492) this.field5972;
            this.method2675(2);
            var3.method2946(true);
            this.field8160.BackBufferHeight = 0;
            this.field8160.BackBufferWidth = 0;
            if (method3330(this.field8183, this.field8162, this.field6178, this.field8160, (byte) -22, this.field8184)) {
                int var4 = this.field8175.Reset(this.field8160);
                if (class411.method2436(var4, (byte) 43)) {
                    var3.method2947(0, this.field8175.method2421(), this.field8175.method2419(0));
                    this.method2677(-11686);
                    this.method2665(7);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "()V", line = 1345)
    public final void method465() {
        this.method2644(-88, true);
        this.field8175.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLgf;IIIILaf;)V", line = 1358)
    public final void method2578(byte arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, class370 arg6) {
        this.field8175.SetIndices(((class191) arg6).field2832);
        if (arg0 == 49) {
            this.field8175.DrawIndexedPrimitive(method3322(arg1, (byte) 70), 0, arg2, arg4, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1376)
    public final void method529(Rectangle[] arg0, int arg1) throws class416 {
        this.method493();
    }

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "(Z)V", line = 1383)
    public final void method2662(boolean arg0) {
        this.field8175.method2433(174, this.field6220);
        if (!arg0) {
            method3326((byte) 110, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "Z", descriptor = "(I)V", line = 1394)
    public final void method421(int arg0) {
        this.field8175.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "()Lcr;", line = 1402)
    public final class493 method480() {
        D3DADAPTER_IDENTIFIER var1 = this.field8184.method2415(this.field8162, 0);
        return new class493(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILjagdx/D3DPRESENT_PARAMETERS;BLjagdx/IDirect3D;)Z", line = 1415)
    private static final boolean method3330(int arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, byte arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            if (arg4 != -22) {
                return true;
            }
            D3DDISPLAYMODE var9 = arg5.method2417(arg1);
            label81: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field8167.length; var10++) {
                        if (arg5.CheckDeviceType(arg1, arg0, var9.Format, field8167[var10], true) == 0 && arg5.CheckDeviceFormat(arg1, arg0, var9.Format, 1, 1, field8167[var10]) == 0 && (arg2 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg0, field8167[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field8161.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg1, arg0, var9.Format, 2, 1, field8161[var11]) == 0 && arg5.CheckDepthStencilMatch(arg1, arg0, var9.Format, field8167[var10], field8161[var11]) == 0 && (arg2 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg0, field8161[var10], true, var8) == 0)) {
                                    var7 = field8167[var10];
                                    var6 = field8161[var11];
                                    break label81;
                                }
                            }
                        }
                    }
                }
                arg2--;
            }
            if (arg2 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg3.AutoDepthStencilFormat = var6;
            arg3.MultiSampleType = var8;
            arg3.MultiSampleQuality = 0;
            arg3.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "(Z)V", line = 1514)
    public final void method2681(boolean arg0) {
        this.field8175.method2433(15, this.field6142);
        if (arg0) {
            method3330(23, -118, 98, null, (byte) 43, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "I", descriptor = "(I)V", line = 1524)
    public final void method2659(int arg0) {
        if (arg0 == -25172) {
            this.field8175.method2433(14, this.field6194 && this.field6173);
        }
    }

    @OriginalMember(owner = "client!wda", name = "X", descriptor = "(I)V", line = 1534)
    public final void method2683(int arg0) {
        if (this.field6074) {
            field8170[3] = 0.0F;
            field8170[0] = 1.0F;
            field8170[14] = 0.0F;
            field8170[2] = 0.0F;
            field8170[1] = 0.0F;
            field8170[13] = 0.0F;
            field8170[15] = 1.0F;
            field8170[12] = 0.0F;
            field8170[8] = 0.0F;
            field8170[11] = 0.0F;
            field8170[6] = 0.0F;
            field8170[5] = 1.0F;
            field8170[4] = 0.0F;
            field8170[9] = 0.0F;
            field8170[7] = 0.0F;
            field8170[10] = 1.0F;
        } else {
            this.field6082.method368(field8170, -16365);
        }
        if (arg0 != 0) {
            this.method3328(null, (byte) -23);
        }
        this.field8175.SetTransform(256, field8170);
    }

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "(I)V", line = 1571)
    public final void method2571(int arg0) {
        this.field8175.method2433(137, this.field6111 && !this.field6187);
        if (arg0 != 0) {
            this.field8175 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "()V", line = 1580)
    public final void method433() {
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZIBZLhm;)V", line = 1587)
    public final void method2612(boolean arg0, int arg1, byte arg2, boolean arg3, class188 arg4) {
        int var6 = 0;
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg0) {
            var6 |= 0x20;
        }
        if (arg3) {
            var6 |= 0x10;
        }
        if (arg2 != 64) {
            this.method2690(79, -57, true, (int[][]) ((int[][]) null));
        }
        this.field8175.SetTextureStageState(this.field6099, var8, var6 | method3325(-6547, arg4));
    }

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V", line = 1636)
    public final synchronized void method484(int arg0) {
        this.field8181.method3461((byte) 123);
        super.method484(arg0);
    }
}
