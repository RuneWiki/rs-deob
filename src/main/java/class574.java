import jaclib.peer.class674;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.class485;
import jagdx.class486;
import jagdx.class487;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class574 extends class424 {

    @OriginalMember(owner = "client!ul", name = "Lg", descriptor = "Z")
    private boolean field8063 = false;

    @OriginalMember(owner = "client!ul", name = "Kg", descriptor = "I")
    private int field8062 = 0;

    @OriginalMember(owner = "client!ul", name = "Hg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8059;

    @OriginalMember(owner = "client!ul", name = "ch", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8080;

    @OriginalMember(owner = "client!ul", name = "Sg", descriptor = "I")
    private int field8070;

    @OriginalMember(owner = "client!ul", name = "Gg", descriptor = "Ljaclib/peer/gca;")
    public class674 field8058;

    @OriginalMember(owner = "client!ul", name = "ah", descriptor = "Lmu;")
    private class304 field8078;

    @OriginalMember(owner = "client!ul", name = "Yg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8076;

    @OriginalMember(owner = "client!ul", name = "Wg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8074;

    @OriginalMember(owner = "client!ul", name = "Mg", descriptor = "I")
    private int field8064;

    @OriginalMember(owner = "client!ul", name = "dh", descriptor = "Ljagdx/D3DLIGHT;")
    private class486 field8081;

    @OriginalMember(owner = "client!ul", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class486 field8069;

    @OriginalMember(owner = "client!ul", name = "Vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class486 field8073;

    @OriginalMember(owner = "client!ul", name = "Pg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8067;

    @OriginalMember(owner = "client!ul", name = "bh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8079;

    @OriginalMember(owner = "client!ul", name = "fh", descriptor = "Z")
    public boolean field8083;

    @OriginalMember(owner = "client!ul", name = "Jg", descriptor = "Z")
    public boolean field8061;

    @OriginalMember(owner = "client!ul", name = "Ug", descriptor = "Z")
    public boolean field8072;

    @OriginalMember(owner = "client!ul", name = "Ig", descriptor = "[Z")
    private boolean[] field8060;

    @OriginalMember(owner = "client!ul", name = "eh", descriptor = "[Lcg;")
    private class140[] field8082;

    @OriginalMember(owner = "client!ul", name = "Qg", descriptor = "[Z")
    private boolean[] field8068;

    @OriginalMember(owner = "client!ul", name = "Xg", descriptor = "[Z")
    private boolean[] field8075;

    @OriginalMember(owner = "client!ul", name = "Tg", descriptor = "[I")
    private int[] field8071;

    @OriginalMember(owner = "client!ul", name = "Og", descriptor = "[Z")
    private boolean[] field8066;

    @OriginalMember(owner = "client!ul", name = "Zg", descriptor = "[F")
    private static float[] field8077 = new float[16];

    @OriginalMember(owner = "client!ul", name = "Ng", descriptor = "[I")
    private static int[] field8065 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ul", name = "hh", descriptor = "[I")
    private static int[] field8085 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ul", name = "gh", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8084;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "(I)V")
    public final void method2029(int arg0) {
        if (arg0 <= 105) {
            this.method3293(74, null);
        }
        int var2 = this.field8066[this.field5653] ? method3290(this.field5649[this.field5653], false) : 1;
        this.field8080.SetTextureStageState(this.field5653, 1, var2);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "()Z")
    public final boolean method442() {
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "(I)V")
    public final void method1998(int arg0) {
        if (arg0 != 1) {
            this.field8063 = false;
        }
        if (this.field8084 != null || this.field5634[this.field5653] == class470.field6301) {
            this.field8080.SetTextureStageState(this.field5653, 24, 0);
            this.field8071[this.field5653] = 0;
            return;
        }
        if (this.field5634[this.field5653] == class1.field2) {
            this.field8080.SetTransform(this.field5653 + 16, this.field5673[this.field5653].method2734((byte) -74, field8077));
        } else {
            this.field8080.SetTransform(this.field5653 + 16, this.field5673[this.field5653].method2740(true, field8077));
        }
        int var2 = method3296((byte) -93, this.field5634[this.field5653]);
        if (this.field8071[this.field5653] != var2) {
            this.field8080.SetTextureStageState(this.field5653, 24, var2);
            this.field8071[this.field5653] = var2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "()V")
    public final void method466() {
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ZI)V")
    public final void method1982(boolean arg0, int arg1) {
        this.field8080.method2870(161, arg0);
        if (arg1 > -52) {
            this.field8062 = 22;
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(Z)V")
    public final void method1991(boolean arg0) {
        this.field8080.method2870(7, this.field5585);
        if (arg0) {
            method3289((byte) -70, null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "()V")
    public final void method444() {
    }

    @OriginalMember(owner = "client!ul", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lnd;Ljava/lang/Integer;)Lha;")
    public static final class60 createToolkit(Canvas arg0, class153 arg1, class547 arg2, Integer arg3) {
        class574 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class674 var7 = new class674();
            IDirect3D var8 = IDirect3D.method2860(-2147483616, var7);
            D3DCAPS var9 = var8.method2862(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x10 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3288(51, var6, arg3, var8, var5, var10)) {
                    throw new RuntimeException("");
                }
                var10.PresentationInterval = Integer.MIN_VALUE;
                var10.EnableAutoDepthStencil = true;
                var10.Windowed = true;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method2859(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class487 var17) {
                    var13 = var8.method2859(var5, var6, arg0, var11 | 0x20, var10);
                }
                class304 var15 = new class304(var13.method2882(0), var13.method2874());
                var4 = new class574(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2377(23939);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method459();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIZLet;[B)Lwk;")
    public final class145 method2013(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class596 arg6, byte[] arg7) {
        if (arg2 != 0) {
            this.method3293(-28, null);
        }
        return new class228(this, arg6, arg3, arg0, arg5, arg7, arg4, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "GA", descriptor = "(I)V")
    public final void method462(int arg0) {
        this.field8080.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "(I)V")
    public final void method1987(int arg0) {
        if (this.field5601.method1795(arg0 ^ 0xFFFFFFFC)) {
            this.field5581.method2740(true, field8077);
        } else {
            field8077[0] = 1.0F;
            field8077[5] = 1.0F;
            field8077[13] = 0.0F;
            field8077[11] = 0.0F;
            field8077[1] = 0.0F;
            field8077[10] = 1.0F;
            field8077[12] = 0.0F;
            field8077[14] = 0.0F;
            field8077[15] = 1.0F;
            field8077[7] = 0.0F;
            field8077[8] = 0.0F;
            field8077[3] = 0.0F;
            field8077[9] = 0.0F;
            field8077[6] = 0.0F;
            field8077[4] = 0.0F;
            field8077[2] = 0.0F;
        }
        this.field8080.SetTransform(2, field8077);
        if (arg0 != 3) {
            this.field8072 = true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "(I)V")
    public final void method2026(int arg0) {
        int var2 = 31 % ((arg0 - 44) / 33);
        if (this.field8066[this.field5653]) {
            this.field8066[this.field5653] = false;
            this.field8080.SetTexture(this.field5653, null);
            this.method2035(7003);
            this.method2029(121);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lwha;Let;Z)I")
    public static final int method3284(class285 arg0, class596 arg1, boolean arg2) {
        if (class285.field3589 == arg0) {
            if (class654.field9096 == arg1) {
                return 22;
            }
            if (class269.field3396 == arg1) {
                return 21;
            }
            if (class522.field7319 == arg1) {
                return 28;
            }
            if (class125.field1794 == arg1) {
                return 50;
            }
            if (class331.field4230 == arg1) {
                return 51;
            }
            if (class299.field3924 == arg1) {
                return 77;
            }
        }
        if (arg2) {
            field8085 = null;
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/gca;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lmu;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lnd;I)V")
    private class574(int arg0, int arg1, Canvas arg2, class674 arg3, IDirect3D arg4, IDirect3DDevice arg5, class304 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class153 arg9, class547 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field8059 = arg8;
            this.field8080 = arg5;
            this.field8070 = arg1;
            this.field8058 = arg3;
            this.field8078 = arg6;
            this.field8076 = arg4;
            this.field8074 = arg7;
            this.field8064 = arg0;
            this.field8081 = new class486(this.field8058);
            this.field8069 = new class486(this.field8058);
            this.field8073 = new class486(this.field8058);
            this.field8067 = new PixelBuffer(this.field8058);
            this.field8079 = new GeometryBuffer(this.field8058);
            new GeometryBuffer(this.field8058);
            this.field5636 = this.field8059.MaxActiveLights > 0 ? this.field8059.MaxActiveLights : 8;
            this.field8083 = (this.field8059.TextureCaps & 0x2) == 0;
            this.field5646 = (this.field8059.TextureCaps & 0x2000) != 0;
            this.field8061 = (this.field8059.TextureCaps & 0x4000) != 0;
            this.field8072 = (this.field8059.TextureCaps & 0x10000) != 0;
            this.field5586 = this.field8059.MaxSimultaneousTextures;
            this.field5591 = (this.field8059.TextureCaps & 0x800) != 0;
            this.field5608 = this.field5680 > 0 || this.field8076.CheckDeviceMultiSampleType(this.field8064, this.field8070, this.field8074.BackBufferFormat, true, 2) == 0;
            this.field8060 = new boolean[this.field5586];
            this.field8082 = new class140[this.field5586];
            this.field8068 = new boolean[this.field5586];
            this.field8075 = new boolean[this.field5586];
            this.field8071 = new int[this.field5586];
            this.field8066 = new boolean[this.field5586];
            this.field8080.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method478((byte) 97);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method432(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class230 {
        this.method497(arg2, arg3);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(FFF)V")
    public final void method463(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "(B)V")
    public final void method1997(byte arg0) {
        this.field5607 = (this.field5661 - this.field5659);
        this.field5598 = this.field5607 - (float) this.field5599;
        if ((float) this.field5589 > this.field5598) {
            this.field5598 = this.field5589;
        }
        if (arg0 != 36) {
            this.method485(null, null, -1.2177541F, null);
        }
        this.field8080.method2881(36, this.field5598);
        this.field8080.method2881(37, this.field5607);
        this.field8080.SetRenderState(34, this.field5644);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILjv;Liaa;ZII)V")
    public final void method2030(int arg0, int arg1, class81 arg2, class497 arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            this.field8078 = null;
        }
        this.field8080.SetIndices(((class213) arg3).field2810);
        this.field8080.DrawIndexedPrimitive(method3285(21153, arg2), 0, arg0, arg1, arg6, arg5);
    }

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "()V")
    public final void method479() {
    }

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "()I")
    public final int method440() {
        return 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[BIILet;I)Laga;")
    public final class668 method2000(int arg0, byte[] arg1, int arg2, int arg3, class596 arg4, int arg5) {
        return arg3 >= -82 ? (class668) null : new class392(this, arg4, arg2, arg5, arg0, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjv;)I")
    private static final int method3285(int arg0, class81 arg1) {
        if (arg0 != 21153) {
            createToolkit(null, null, null, null);
        }
        if (class551.field7702 == arg1) {
            return 2;
        } else if (class232.field3051 == arg1) {
            return 3;
        } else if (class194.field2655 == arg1) {
            return 1;
        } else if (class662.field9281 == arg1) {
            return 4;
        } else if (class426.field5714 == arg1) {
            return 6;
        } else if (class532.field7387 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(Z)V")
    public final void method2031(boolean arg0) {
        this.field8080.SetRenderState(60, this.field5679);
        if (arg0) {
            this.field8067 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lhca;Llda;)Lnl;")
    public final class554 method464(class492 arg0, class488 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "(B)V")
    public final void method2027(byte arg0) {
        int var2 = -14 % ((arg0 - 74) / 33);
        this.field8080.method2870(15, this.field5627);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lwha;IIBLet;)Lwk;")
    public final class145 method2012(class285 arg0, int arg1, int arg2, byte arg3, class596 arg4) {
        if (arg3 != -105) {
            this.method2001(58, null);
        }
        return new class228(this, arg4, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z[IIBIII)Lwk;")
    public final class145 method2010(boolean arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 0) {
            this.method2014(null, 78);
        }
        return new class228(this, arg4, arg5, arg0, arg1, arg6, arg2);
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(B)V")
    public final void method2015(byte arg0) {
        this.field8080.SetScissorRect(this.field5660 + this.field5625, this.field5623 + this.field5612, this.field5674, this.field5628);
        int var2 = -79 % ((-arg0 - 14) / 62);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILri;)V")
    public final void method2033(int arg0, class114 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field8080.SetVertexDeclaration(var3.field4183);
        if (arg0 != 17069) {
            this.field8070 = 3;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public final void method2020(Object arg0, Canvas arg1, boolean arg2) {
        if (arg2) {
            this.field8082 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Let;BLwha;)Z")
    public final boolean method1985(class596 arg0, byte arg1, class285 arg2) {
        if (arg1 != 76) {
            this.field8061 = true;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class485.method2865(this.field8076.method2863(this.field8064, var4), 25499) && class485.method2865(this.field8076.CheckDeviceFormat(this.field8064, this.field8070, var4.Format, 0, 3, method3284(arg2, arg0, false)), arg1 ^ 0x63D7);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public final void method2007(Canvas arg0, Object arg1, int arg2) {
        this.field8078 = (class304) arg1;
        if (arg2 != 17789) {
            this.method448(119);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILia;B)V")
    public final void method2041(int arg0, class591 arg1, byte arg2) {
        class41 var4 = (class41) arg1;
        this.field8080.SetStreamSource(arg0, var4.field618, 0, var4.method300(arg2 ^ 0x3D44));
        if (arg2 != 73) {
            this.method440();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILet;ZI[FIZ)Lwk;")
    public final class145 method2038(int arg0, int arg1, class596 arg2, boolean arg3, int arg4, float[] arg5, int arg6, boolean arg7) {
        return arg7 ? null : (class145) null;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "()V")
    public final void method459() {
        this.field8058.method3804(22591);
        super.method459();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Let;Lwha;Z)Z")
    public final boolean method1993(class596 arg0, class285 arg1, boolean arg2) {
        if (arg2) {
            this.field8069 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class485.method2865(this.field8076.method2863(this.field8064, var4), 25499) && class485.method2865(this.field8076.CheckDeviceFormat(this.field8064, this.field8070, var4.Format, 0, 4, method3284(arg1, arg0, false)), 25499);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lmb;I)V")
    public final void method3286(class265 arg0, int arg1) {
        this.field8080.SetTexture(this.field5653, arg0.method1454(-23413));
        if (this.field8082[this.field5653] != arg0.field3354) {
            int var3 = method3291(arg0.field3354, arg1 + 22368);
            this.field8080.SetSamplerState(this.field5653, 6, var3);
            this.field8080.SetSamplerState(this.field5653, 5, var3);
            this.field8082[this.field5653] = arg0.field3354;
            if (this.field8075[this.field5653] != arg0.field3352) {
                this.field8080.SetSamplerState(this.field5653, 7, arg0.field3352 ? method3291(arg0.field3354, 22368) : 0);
                this.field8075[this.field5653] = arg0.field3352;
            }
        } else if (this.field8075[this.field5653] != arg0.field3352) {
            this.field8080.SetSamplerState(this.field5653, 7, arg0.field3352 ? method3291(arg0.field3354, arg1 ^ 0x5760) : 0);
            this.field8075[this.field5653] = arg0.field3352;
        }
        if (arg1 == 0 && !this.field8066[this.field5653]) {
            this.field8066[this.field5653] = true;
            this.method2035(7003);
            this.method2029(121);
        }
    }

    @OriginalMember(owner = "client!ul", name = "ya", descriptor = "()V")
    public final void method512() {
        this.method2385(-58, true);
        this.field8080.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "(B)V")
    public final void method1990(byte arg0) {
        if (this.field5569) {
            field8077[7] = 0.0F;
            field8077[6] = 0.0F;
            field8077[12] = 0.0F;
            field8077[9] = 0.0F;
            field8077[13] = 0.0F;
            field8077[1] = 0.0F;
            field8077[14] = 0.0F;
            field8077[11] = 0.0F;
            field8077[8] = 0.0F;
            field8077[0] = 1.0F;
            field8077[3] = 0.0F;
            field8077[15] = 1.0F;
            field8077[5] = 1.0F;
            field8077[2] = 0.0F;
            field8077[4] = 0.0F;
            field8077[10] = 1.0F;
        } else {
            this.field5560.method2740(true, field8077);
        }
        this.field8080.SetTransform(256, field8077);
        if (arg0 != -98) {
            this.method442();
        }
    }

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "(I)V")
    public final void method2028(int arg0) {
        int var2 = 0;
        int var3 = -37 % ((arg0 + 74) / 39);
        while (this.field5586 > var2) {
            this.field8080.SetSamplerState(var2, 7, 0);
            this.field8080.SetSamplerState(var2, 6, 2);
            this.field8080.SetSamplerState(var2, 5, 2);
            this.field8080.SetSamplerState(var2, 1, 1);
            this.field8080.SetSamplerState(var2, 2, 1);
            this.field8082[var2] = class223.field2980;
            this.field8060[var2] = this.field8068[var2] = true;
            this.field8075[var2] = false;
            this.field8071[var2] = 0;
            var2++;
        }
        this.field8080.SetTextureStageState(0, 6, 1);
        this.field8080.SetRenderState(9, 2);
        this.field8080.SetRenderState(23, 4);
        this.field8080.SetRenderState(25, 5);
        this.field8080.SetRenderState(24, 0);
        this.field8080.SetRenderState(22, 2);
        this.field8080.SetRenderState(147, 1);
        this.field8080.SetRenderState(145, 1);
        this.field8080.method2881(38, 0.95F);
        this.field8080.SetRenderState(140, 3);
        this.field8081.SetType(3);
        this.field8069.SetType(3);
        this.field8073.SetType(1);
        this.field8063 = false;
        super.method2028(-10);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZB)Liaa;")
    public final class497 method1995(boolean arg0, byte arg1) {
        if (arg1 > -77) {
            this.field8084 = null;
        }
        return new class213(this, class285.field3590, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lmda;Lmda;FLmda;)Lmda;")
    public final class267 method485(class267 arg0, class267 arg1, float arg2, class267 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method2009(byte arg0, Canvas arg1, Object arg2) {
        int var4 = -105 / ((27 - arg0) / 53);
        if (this.field5514 != arg1) {
            return;
        }
        Dimension var5 = arg1.getSize();
        if (var5.width > 0 && var5.height > 0) {
            this.field8080.EndScene();
            this.method3292(26244);
            this.field8080.BeginScene();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Lgda;")
    public final class55 method1983(byte arg0, int arg1) {
        int var3 = -76 / ((36 - arg0) / 34);
        if (arg1 == 3) {
            return new class341(this, this.field5451);
        } else if (arg1 == 4) {
            return new class529(this, this.field5451, this.field5407);
        } else if (arg1 == 8) {
            return new class606(this, this.field5451, this.field5407);
        } else {
            return super.method1983((byte) -40, arg1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method2011(int arg0, Canvas arg1) {
        return arg0 == 0 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "(B)F")
    public final float method2019(byte arg0) {
        if (arg0 > -106) {
            this.field8083 = false;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V")
    public final void method3287(int arg0, IDirect3DPixelShader arg1) {
        if (arg0 > -99) {
            this.field8071 = null;
        }
        this.field8080.SetPixelShader(arg1);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(IIIID)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILjagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;)Z")
    private static final boolean method3288(int arg0, int arg1, int arg2, IDirect3D arg3, int arg4, D3DPRESENT_PARAMETERS arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            int var9 = -64 % ((-arg0 - 58) / 56);
            D3DDISPLAYMODE var10 = new D3DDISPLAYMODE();
            if (class485.method2864(-2005530522, arg3.method2863(arg4, var10))) {
                return false;
            }
            label81: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var11 = 0; var11 < field8085.length; var11++) {
                        if (arg3.CheckDeviceType(arg4, arg1, var10.Format, field8085[var11], true) == 0 && arg3.CheckDeviceFormat(arg4, arg1, var10.Format, 1, 1, field8085[var11]) == 0 && (arg2 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, field8085[var11], true, var8) == 0)) {
                            for (int var12 = 0; var12 < field8065.length; var12++) {
                                if (arg3.CheckDeviceFormat(arg4, arg1, var10.Format, 2, 1, field8065[var12]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg1, var10.Format, field8085[var11], field8065[var12]) == 0 && (arg2 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, field8065[var11], true, var8) == 0)) {
                                    var7 = field8085[var11];
                                    var6 = field8065[var12];
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
            arg5.AutoDepthStencilFormat = var6;
            arg5.MultiSampleQuality = 0;
            arg5.MultiSampleType = var8;
            arg5.BackBufferFormat = var7;
            return true;
        } catch (Throwable var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZZLbp;I)V")
    public final void method2036(byte arg0, boolean arg1, boolean arg2, class389 arg3, int arg4) {
        int var6 = -109 / ((45 - arg0) / 59);
        int var7 = 0;
        byte var9;
        if (arg4 == 1) {
            var9 = 3;
        } else if (arg4 == 2) {
            var9 = 26;
        } else {
            var9 = 2;
        }
        if (arg2) {
            var7 |= 0x20;
        }
        if (arg1) {
            var7 |= 0x10;
        }
        this.field8080.SetTextureStageState(this.field5653, var9, method3289((byte) 109, arg3) | var7);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZZ)Lia;")
    public final class591 method2042(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method1987(-5);
        }
        return new class41(this, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "()V")
    public final void method522() {
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLbp;)I")
    private static final int method3289(byte arg0, class389 arg1) {
        if (class447.field5937 == arg1) {
            return 2;
        } else if (class479.field6523 == arg1) {
            return 0;
        } else if (class84.field1162 == arg1) {
            return 1;
        } else if (class21.field383 == arg1) {
            return 3;
        } else if (arg0 <= 44) {
            return 64;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
    public final void method2017(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field5622; var2++) {
            class123 var3 = this.field5655[var2];
            int var4 = var2 + 2;
            int var5 = var3.method934((byte) -68);
            float var6 = var3.method939(arg0 ^ 0xFFFFD416) / 255.0F;
            this.field8073.SetPosition((float) var3.method932(-16562), (float) var3.method937(arg0 + 36), (float) var3.method938(0));
            this.field8073.SetDiffuse((float) ((var5 & 0xFF5742) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8073.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method935(0) * var3.method935(arg0 - 36)));
            this.field8073.SetRange((float) var3.method935(0));
            this.field8080.SetLight(var4, this.field8073);
            this.field8080.LightEnable(var4, true);
        }
        while (var2 < this.field5676) {
            this.field8080.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2017(arg0);
    }

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "()V")
    public final void method469() {
        IDirect3DEventQuery var1 = this.field8080.method2876();
        if (class485.method2865(var1.Issue(), 25499)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3809((byte) -36);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) throws class230 {
        this.field8080.EndScene();
        if (this.field8078.method1811(19545)) {
            this.field8062 = 0;
            if (class485.method2864(-2005530522, this.field8078.method1809(0, 0))) {
                this.method3292(26244);
            }
        } else if ((++this.field8062) <= 50) {
            this.method3292(26244);
        } else {
            throw new class230();
        }
        this.field8080.BeginScene();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILbp;Z)V")
    public final void method1999(int arg0, int arg1, class389 arg2, boolean arg3) {
        if (arg0 <= 97) {
            this.field8068 = null;
        }
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg3) {
            var7 |= 0x10;
        }
        this.field8080.SetTextureStageState(this.field5653, var6, var7 | method3289((byte) 63, arg2));
    }

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "(B)V")
    public final void method2024(byte arg0) {
        float var2 = this.field5657 ? this.field5610 : 0.0F;
        float var3 = this.field5657 ? -this.field5669 : 0.0F;
        if (arg0 != 85) {
            this.field8062 = 69;
        }
        this.field8081.SetDiffuse(this.field5620 * var2, this.field5656 * var2, this.field5600 * var2, 0.0F);
        this.field8069.SetDiffuse(this.field5620 * var3, this.field5656 * var3, this.field5600 * var3, 0.0F);
        this.field8063 = false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lpfa;Z)I")
    private static final int method3290(class299 arg0, boolean arg1) {
        if (class476.field6418 == arg0) {
            return 2;
        } else if (class405.field5120 == arg0) {
            return 4;
        } else if (class740.field10325 == arg0) {
            return 26;
        } else if (class155.field2108 == arg0) {
            return 7;
        } else if (class257.field3259 == arg0) {
            return 10;
        } else {
            if (arg1) {
                field8077 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lcg;I)I")
    private static final int method3291(class140 arg0, int arg1) {
        if (class223.field2980 == arg0) {
            return 2;
        } else if (class291.field3813 == arg0) {
            return 1;
        } else if (arg1 == 22368) {
            throw new IllegalArgumentException();
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "(I)V")
    public final void method2003(int arg0) {
        this.field8080.method2870(27, this.field5587);
        if (arg0 != -8) {
            this.field8081 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "(B)V")
    public final void method2040(byte arg0) {
        this.field8080.method2870(28, this.field5675 && this.field5588 && this.field5599 >= 0);
        if (arg0 != -7) {
            this.method2024((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[Lfk;)Lri;")
    public final class114 method2001(int arg0, class655[] arg1) {
        if (arg0 != 16018) {
            this.field8068 = null;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "(B)V")
    public final void method1988(byte arg0) {
        if (arg0 <= 51) {
            field8085 = null;
        }
        if (this.field8063) {
            return;
        }
        this.field8080.LightEnable(0, false);
        this.field8080.LightEnable(1, false);
        this.field8080.SetLight(0, this.field8081);
        this.field8080.SetLight(1, this.field8069);
        this.field8080.LightEnable(0, true);
        this.field8080.LightEnable(1, true);
        this.field8063 = true;
    }

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "(I)V")
    public final void method1996(int arg0) {
        this.field8080.method2870(14, this.field5677 && this.field5603);
        if (arg0 != 0) {
            this.method1985(null, (byte) -127, null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "(II)V")
    public final void method493(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "()Lnia;")
    public final class647 method499() {
        D3DADAPTER_IDENTIFIER var1 = this.field8076.method2861(this.field8064, 0);
        return new class647(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "(B)V")
    public final void method1986(byte arg0) {
        this.field8081.SetAmbient(this.field5650 * this.field5620, this.field5656 * this.field5650, this.field5650 * this.field5600, 0.0F);
        this.field8063 = false;
        if (arg0 != 127) {
            this.method2008(7);
        }
    }

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "(I)V")
    public final void method2008(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class514.field7213 == this.field5630) {
            this.field8080.SetRenderState(19, 5);
            this.field8080.SetRenderState(20, 6);
        } else if (class301.field3943 == this.field5630) {
            this.field8080.SetRenderState(19, 2);
            this.field8080.SetRenderState(20, 2);
        } else if (class665.field9357 == this.field5630) {
            this.field8080.SetRenderState(19, 9);
            this.field8080.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "(I)V")
    public final void method2002(int arg0) {
        this.field8081.SetDirection(-this.field5596[0], -this.field5596[arg0], -this.field5596[2]);
        this.field8069.SetDirection(-this.field5590[0], -this.field5590[1], -this.field5590[2]);
        this.field8063 = false;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
    public final void method1992(int arg0) {
        if (arg0 != 3688) {
            this.field8061 = false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "na", descriptor = "(IIII)[I")
    public final int[] method465(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8080.method2875(0);
        IDirect3DSurface var7 = this.field8080.method2880(arg2, arg3, 21, 0, 0, true);
        if (class485.method2865(this.field8080.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 25499) && class485.method2865(var7.LockRect(0, 0, arg2, arg3, 16, this.field8067), 25499)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8067.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field8067.method2888(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8067.method2888(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3809((byte) -36);
        var7.method3809((byte) -36);
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lmg;I)V")
    public final void method2014(class151 arg0, int arg1) {
        int var3 = arg1;
        if (class545.field7603 == arg0) {
            var3 = 65536;
        } else if (class294.field3871 == arg0) {
            var3 = 131072;
        } else if (class262.field3296 == arg0) {
            var3 = 196608;
        }
        this.field8080.SetTextureStageState(this.field5653, 11, var3 | this.field5653);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)V")
    public final void method472(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "(I)Z")
    private final boolean method3292(int arg0) {
        if (arg0 != 26244) {
            return true;
        }
        int var2 = this.field8080.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class304 var3 = (class304) this.field5547;
            this.method2436((byte) -79);
            var3.method1812((byte) -114);
            this.field8074.BackBufferWidth = 0;
            this.field8074.BackBufferHeight = 0;
            if (method3288(66, this.field8070, this.field5680, this.field8076, this.field8064, this.field8074)) {
                int var4 = this.field8080.Reset(this.field8074);
                if (class485.method2865(var4, arg0 ^ 0x51F)) {
                    var3.method1810((byte) 7, this.field8080.method2882(0), this.field8080.method2874());
                    this.method2398((byte) -97);
                    this.method2028(22);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljv;III)V")
    public final void method2004(class81 arg0, int arg1, int arg2, int arg3) {
        this.field8080.DrawPrimitive(method3285(21153, arg0), arg2, arg1);
        if (arg3 >= -121) {
            this.method1986((byte) 75);
        }
    }

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "(B)V")
    public final void method2037(byte arg0) {
        int var2 = 108 / ((arg0 + 23) / 62);
        this.field8080.SetTransform(3, this.field5609);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lnl;)V")
    public final void method550(class554 arg0) {
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Llda;")
    public final class488 method481(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(II)Lhca;")
    public final class492 method523(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "(I)V")
    public final void method2035(int arg0) {
        int var2 = this.field8066[this.field5653] ? method3290(this.field5654[this.field5653], false) : 1;
        if (arg0 != 7003) {
            this.method522();
        }
        this.field8080.SetTextureStageState(this.field5653, 4, var2);
    }

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "()Z")
    public final boolean method476() {
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "(I)V")
    public final void method2022(int arg0) {
        if (arg0 == 4796) {
            this.field8080.SetViewport(this.field5660, this.field5623, this.field5445, this.field5494, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "(I)V")
    public final void method2032(int arg0) {
        if (arg0 < 63) {
            this.field8069 = null;
        }
        this.method2024((byte) 85);
        this.method1988((byte) 118);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjagdx/IDirect3DVertexShader;)V")
    public final void method3293(int arg0, IDirect3DVertexShader arg1) {
        this.field8084 = arg1;
        this.field8080.SetVertexShader(arg1);
        this.method1998(arg0 - 86);
        if (arg0 != 87) {
            method3284(null, null, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILem;)V")
    public final void method3294(int arg0, class228 arg1) {
        this.method3286(arg1, 0);
        if (this.field8060[this.field5653] != arg1.field3014) {
            this.field8080.SetSamplerState(this.field5653, 1, arg1.field3014 ? 1 : 3);
            this.field8060[this.field5653] = arg1.field3014;
        }
        if (this.field8068[this.field5653] != arg1.field3015) {
            this.field8080.SetSamplerState(this.field5653, 2, arg1.field3015 ? 1 : 3);
            this.field8068[this.field5653] = arg1.field3015;
        }
        if (arg0 != 6) {
            this.method2037((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public final synchronized void method448(int arg0) {
        this.field8058.method3802((byte) -72);
        super.method448(arg0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI[[I)Lnn;")
    public final class418 method2034(int arg0, boolean arg1, int arg2, int[][] arg3) {
        return arg2 == -9866 ? new class261(this, arg0, arg1, arg3) : (class418) null;
    }

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "(I)V")
    public final void method1989(int arg0) {
        if (arg0 >= -103) {
            this.field8070 = 102;
        }
        this.field8080.method2870(174, this.field5708);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(BI)V")
    public final void method2006(byte arg0, int arg1) {
        this.field8080.SetTextureStageState(this.field5653, 11, arg1);
        if (arg0 <= 46) {
            this.method476();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLkda;)V")
    public final void method3295(byte arg0, class392 arg1) {
        this.method3286(arg1, 0);
        if (arg0 != 71) {
            return;
        }
        if (!this.field8060[this.field5653]) {
            this.field8080.SetSamplerState(this.field5653, 1, 1);
            this.field8060[this.field5653] = true;
        }
        if (!this.field8068[this.field5653]) {
            this.field8080.SetSamplerState(this.field5653, 2, 1);
            this.field8068[this.field5653] = true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLen;)I")
    private static final int method3296(byte arg0, class322 arg1) {
        int var2 = -83 / ((-arg0 - 21) / 55);
        if (class8.field91 == arg1) {
            return 1;
        } else if (class1.field2 == arg1) {
            return 2;
        } else if (class559.field7776 == arg1) {
            return 3;
        } else if (class469.field6283 == arg1) {
            return 4;
        } else if (class52.field744 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "(I)V")
    public final void method2039(int arg0) {
        if (arg0 != -6109) {
            this.method523(-51, -16);
        }
        this.field8080.method2870(137, this.field5616 && !this.field5638);
    }
}
