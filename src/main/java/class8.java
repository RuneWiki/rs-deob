import jaclib.peer.class375;
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
import jagdx.class755;
import jagdx.class756;
import jagdx.class757;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class8 extends class114 {

    @OriginalMember(owner = "client!lj", name = "Mg", descriptor = "Z")
    private boolean field109 = false;

    @OriginalMember(owner = "client!lj", name = "bh", descriptor = "I")
    private int field124 = 0;

    @OriginalMember(owner = "client!lj", name = "ah", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!lj", name = "Yg", descriptor = "Lqm;")
    private class487 field121;

    @OriginalMember(owner = "client!lj", name = "Zg", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client!lj", name = "Lg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field108;

    @OriginalMember(owner = "client!lj", name = "Hg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field104;

    @OriginalMember(owner = "client!lj", name = "Fg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field102;

    @OriginalMember(owner = "client!lj", name = "Pg", descriptor = "Ljaclib/peer/mk;")
    public class375 field112;

    @OriginalMember(owner = "client!lj", name = "Dg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field100;

    @OriginalMember(owner = "client!lj", name = "Kg", descriptor = "Ljagdx/D3DLIGHT;")
    private class755 field107;

    @OriginalMember(owner = "client!lj", name = "Tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class755 field116;

    @OriginalMember(owner = "client!lj", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class755 field103;

    @OriginalMember(owner = "client!lj", name = "Sg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field115;

    @OriginalMember(owner = "client!lj", name = "Vg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field118;

    @OriginalMember(owner = "client!lj", name = "Ug", descriptor = "Z")
    public boolean field117;

    @OriginalMember(owner = "client!lj", name = "Jg", descriptor = "Z")
    public boolean field106;

    @OriginalMember(owner = "client!lj", name = "Og", descriptor = "Z")
    public boolean field111;

    @OriginalMember(owner = "client!lj", name = "Cg", descriptor = "[Z")
    private boolean[] field99;

    @OriginalMember(owner = "client!lj", name = "ch", descriptor = "[Z")
    private boolean[] field125;

    @OriginalMember(owner = "client!lj", name = "Rg", descriptor = "[Z")
    private boolean[] field114;

    @OriginalMember(owner = "client!lj", name = "Eg", descriptor = "[I")
    private int[] field101;

    @OriginalMember(owner = "client!lj", name = "Ig", descriptor = "[Lrha;")
    private class455[] field105;

    @OriginalMember(owner = "client!lj", name = "dh", descriptor = "[Z")
    private boolean[] field126;

    @OriginalMember(owner = "client!lj", name = "Xg", descriptor = "[I")
    private static int[] field120 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!lj", name = "Wg", descriptor = "[F")
    private static float[] field119 = new float[16];

    @OriginalMember(owner = "client!lj", name = "Qg", descriptor = "[I")
    private static int[] field113 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!lj", name = "Ng", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field110;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llf;Ljk;)Lrs;")
    public final class730 method53(class567 arg0, class788 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "(I)F")
    public final float method54(int arg0) {
        return arg0 == -457 ? -0.5F : -0.833212F;
    }

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "(B)V")
    public final void method55(byte arg0) {
        int var2 = 11 % ((-arg0 - 53) / 59);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lcr;B)V")
    public final void method56(class186 arg0, byte arg1) {
        this.method114(arg0, 7);
        if (!this.field126[this.field1876]) {
            this.field100.SetSamplerState(this.field1876, 1, 1);
            this.field126[this.field1876] = true;
        }
        if (arg1 != -52) {
            this.field125 = null;
        }
        if (!this.field125[this.field1876]) {
            this.field100.SetSamplerState(this.field1876, 2, 1);
            this.field125[this.field1876] = true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(FFF)V")
    public final void method57(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;)Z")
    private static final boolean method58(int arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, int arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = arg2;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class757.method4190((byte) -110, arg5.method4168(arg1, var9))) {
                return false;
            }
            label80: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field120.length; var10++) {
                        if (arg5.CheckDeviceType(arg1, arg4, var9.Format, field120[var10], true) == 0 && arg5.CheckDeviceFormat(arg1, arg4, var9.Format, 1, 1, field120[var10]) == 0 && (arg0 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg4, field120[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field113.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg1, arg4, var9.Format, 2, 1, field113[var11]) == 0 && arg5.CheckDepthStencilMatch(arg1, arg4, var9.Format, field120[var10], field113[var11]) == 0 && (arg0 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg4, field113[var10], true, var8) == 0)) {
                                    var7 = field120[var10];
                                    var6 = field113[var11];
                                    break label80;
                                }
                            }
                        }
                    }
                }
                arg0--;
            }
            if (arg0 < 0 || var7 == 0 || var6 == 0) {
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

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "(I)V")
    public final void method59(int arg0) {
        for (int var2 = 0; var2 < this.field1861; var2++) {
            this.field100.SetSamplerState(var2, 7, 0);
            this.field100.SetSamplerState(var2, 6, 2);
            this.field100.SetSamplerState(var2, 5, 2);
            this.field100.SetSamplerState(var2, 1, 1);
            this.field100.SetSamplerState(var2, 2, 1);
            this.field105[var2] = class362.field5131;
            this.field126[var2] = this.field125[var2] = true;
            this.field114[var2] = false;
            this.field101[var2] = 0;
        }
        this.field100.SetTextureStageState(0, 6, 1);
        this.field100.SetRenderState(9, 2);
        this.field100.SetRenderState(23, 4);
        this.field100.SetRenderState(25, 5);
        this.field100.SetRenderState(24, 0);
        this.field100.SetRenderState(22, arg0);
        this.field100.SetRenderState(147, 1);
        this.field100.SetRenderState(145, 1);
        this.field100.method4180(38, 0.95F);
        this.field100.SetRenderState(140, 3);
        this.field107.SetType(3);
        this.field116.SetType(3);
        this.field103.SetType(1);
        this.field109 = false;
        super.method59(2);
    }

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "()I")
    public final int method60() {
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(II)Lsba;")
    public final class429 method61(int arg0, int arg1) {
        if (arg0 != 8983) {
            this.field121 = null;
        }
        if (arg1 == 3) {
            return new class130(this, this.field1726);
        } else if (arg1 == 4) {
            return new class634(this, this.field1726, this.field1782);
        } else if (arg1 == 8) {
            return new class638(this, this.field1726, this.field1782);
        } else {
            return super.method61(8983, arg1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(IZ)V")
    public final void method62(int arg0, boolean arg1) {
        this.field100.method4177(161, arg1);
        int var3 = 13 % ((26 - arg0) / 61);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBLnea;Ldr;I)Llba;")
    public final class225 method63(int arg0, byte arg1, class600 arg2, class629 arg3, int arg4) {
        if (arg1 != -128) {
            this.field107 = null;
        }
        return new class146(this, arg2, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field100.SetViewport(this.field1933, this.field1910, this.field1834, this.field1824, 0.0F, 1.0F);
        if (arg0 < 0) {
            this.method55((byte) 124);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
    public final void method65(byte arg0) {
        if (arg0 >= -42) {
            this.field108 = null;
        }
        this.field107.SetAmbient(this.field1912 * this.field1867, this.field1883 * this.field1867, this.field1882 * this.field1867, 0.0F);
        this.field109 = false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lrha;I)I")
    private static final int method66(class455 arg0, int arg1) {
        if (arg1 != 1385) {
            method100(null, null, (byte) 77);
        }
        if (class362.field5131 == arg0) {
            return 2;
        } else if (class330.field4718 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;I)V")
    public final void method67(IDirect3DVertexShader arg0, int arg1) {
        this.field110 = arg0;
        this.field100.SetVertexShader(arg0);
        this.method129((byte) -54);
        if (arg1 != 28) {
            field119 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        if (this.field99[this.field1876]) {
            this.field99[this.field1876] = false;
            this.field100.SetTexture(this.field1876, null);
            this.method130(16);
            this.method85(0);
        }
        if (!arg0) {
            this.field112 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLnea;Ldr;)Z")
    public final boolean method69(byte arg0, class600 arg1, class629 arg2) {
        int var4 = -54 / ((23 - arg0) / 57);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class757.method4191(-2005530600, this.field102.method4168(this.field122, var5)) && class757.method4191(-2005530600, this.field102.CheckDeviceFormat(this.field122, this.field123, var5.Format, 0, 3, method100(arg1, arg2, (byte) -106)));
    }

    @OriginalMember(owner = "client!lj", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lgga;Ljava/lang/Integer;)Lha;")
    public static final class475 createToolkit(Canvas arg0, class103 arg1, class513 arg2, Integer arg3) {
        class8 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class375 var7 = new class375();
            IDirect3D var8 = IDirect3D.method4167(-2147483616, var7);
            D3DCAPS var9 = var8.method4170(var5, var6);
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
            } else if ((var9.SrcBlendCaps & 0x10 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method58(arg3, var5, 0, var10, var6, var8)) {
                    throw new RuntimeException("");
                }
                var10.EnableAutoDepthStencil = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                var10.Windowed = true;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method4171(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class756 var17) {
                    var13 = var8.method4171(var5, var6, arg0, var11 | 0x20, var10);
                }
                class487 var15 = new class487(var13.method4181(0), var13.method4188());
                var4 = new class8(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method980((byte) 125);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method142();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(B)V")
    public final void method70(byte arg0) {
        if (arg0 != 85) {
            this.method94(null, null, 0.6538173F, null);
        }
        this.field100.method4177(137, this.field1852 && !this.field1895);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILwba;)V")
    public final void method71(byte arg0, int arg1, class601 arg2) {
        if (arg0 != -43) {
            this.method91();
        }
        class471 var4 = (class471) arg2;
        this.field100.SetStreamSource(arg1, var4.field6416, 0, var4.method2754((byte) 96));
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public final void method72(Object arg0, Canvas arg1, boolean arg2) {
        if (arg2) {
            this.method78(124);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLvt;)I")
    private static final int method73(byte arg0, class768 arg1) {
        if (class552.field7657 == arg1) {
            return 2;
        } else if (class317.field4523 == arg1) {
            return 4;
        } else if (class407.field5606 == arg1) {
            return 26;
        } else if (class228.field3319 == arg1) {
            return 7;
        } else if (class785.field10755 == arg1) {
            return 10;
        } else if (arg0 == -66) {
            throw new IllegalArgumentException();
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public final synchronized void method74(int arg0) {
        this.field112.method2238(-9377);
        super.method74(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "(II)V")
    public final void method75(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)Llf;")
    public final class567 method76(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(Z)V")
    public final void method77(boolean arg0) {
        this.field100.SetScissorRect(this.field1933 + this.field1925, this.field1944 + this.field1910, this.field1887, this.field1929);
        if (arg0) {
            this.field111 = false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (this.field1840) {
            field119[13] = 0.0F;
            field119[8] = 0.0F;
            field119[3] = 0.0F;
            field119[6] = 0.0F;
            field119[1] = 0.0F;
            field119[0] = 1.0F;
            field119[9] = 0.0F;
            field119[2] = 0.0F;
            field119[15] = 1.0F;
            field119[12] = 0.0F;
            field119[7] = 0.0F;
            field119[5] = 1.0F;
            field119[4] = 0.0F;
            field119[10] = 1.0F;
            field119[11] = 0.0F;
            field119[14] = 0.0F;
        } else {
            this.field1837.method4099(field119, arg0 ^ 0x52CA);
        }
        this.field100.SetTransform(256, field119);
        if (arg0 != 0) {
            createToolkit(null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIIID)V")
    public final void method79(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "(B)V")
    public final void method80(byte arg0) {
        if (arg0 != -101) {
            this.field124 = -89;
        }
        this.field100.SetTransform(3, this.field1922);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z[[IIZ)Lwf;")
    public final class540 method81(boolean arg0, int[][] arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field107 = null;
        }
        return new class649(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "na", descriptor = "(IIII)[I")
    public final int[] method82(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field100.method4179(0);
        IDirect3DSurface var7 = this.field100.method4176(arg2, arg3, 21, 0, 0, true);
        if (class757.method4191(-2005530600, this.field100.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class757.method4191(-2005530600, var7.LockRect(0, 0, arg2, arg3, 16, this.field115))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field115.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field115.method4164(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field115.method4164(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2234(-4840);
        var7.method2234(-4840);
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()Z")
    public final boolean method83() {
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/mk;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lqm;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lgga;I)V")
    private class8(int arg0, int arg1, Canvas arg2, class375 arg3, IDirect3D arg4, IDirect3DDevice arg5, class487 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class103 arg9, class513 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field123 = arg1;
            this.field121 = arg6;
            this.field122 = arg0;
            this.field108 = arg7;
            this.field104 = arg8;
            this.field102 = arg4;
            this.field112 = arg3;
            this.field100 = arg5;
            this.field107 = new class755(this.field112);
            this.field116 = new class755(this.field112);
            this.field103 = new class755(this.field112);
            this.field115 = new PixelBuffer(this.field112);
            this.field118 = new GeometryBuffer(this.field112);
            new GeometryBuffer(this.field112);
            this.field117 = (this.field104.TextureCaps & 0x2) == 0;
            this.field1861 = this.field104.MaxSimultaneousTextures;
            this.field1943 = this.field104.MaxActiveLights > 0 ? this.field104.MaxActiveLights : 8;
            this.field1891 = (this.field104.TextureCaps & 0x2000) != 0;
            this.field106 = (this.field104.TextureCaps & 0x10000) != 0;
            this.field111 = (this.field104.TextureCaps & 0x4000) != 0;
            this.field1894 = (this.field104.TextureCaps & 0x800) != 0;
            this.field1923 = this.field1881 > 0 || this.field102.CheckDeviceMultiSampleType(this.field122, this.field123, this.field108.BackBufferFormat, true, 2) == 0;
            this.field99 = new boolean[this.field1861];
            this.field125 = new boolean[this.field1861];
            this.field114 = new boolean[this.field1861];
            this.field101 = new int[this.field1861];
            this.field105 = new class455[this.field1861];
            this.field126 = new boolean[this.field1861];
            this.field100.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method2779((byte) 109);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(IZ)Lvv;")
    public final class463 method84(int arg0, boolean arg1) {
        if (arg0 >= -104) {
            this.field112 = null;
        }
        return new class207(this, class629.field8919, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "(I)V")
    public final void method85(int arg0) {
        int var2 = this.field99[this.field1876] ? method73((byte) -66, this.field1878[this.field1876]) : 1;
        this.field100.SetTextureStageState(this.field1876, 1, var2);
        if (arg0 != 0) {
            method95(-62, null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method86(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class684 {
        this.method109(arg2, arg3);
    }

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "()V")
    public final void method87() {
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(II)Ljk;")
    public final class788 method88(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lija;I)V")
    public final void method89(class161 arg0, int arg1) {
        if (arg1 < 122) {
            this.field115 = null;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field100.SetVertexDeclaration(var3.field10596);
    }

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "(I)V")
    public final void method90(int arg0) {
        if (arg0 >= 91) {
            this.field100.method4177(14, this.field1880 && this.field1909);
        }
    }

    @OriginalMember(owner = "client!lj", name = "ya", descriptor = "()V")
    public final void method91() {
        this.method960(true, 0);
        this.field100.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lnea;Ldr;I)Z")
    public final boolean method92(class600 arg0, class629 arg1, int arg2) {
        if (arg2 > -113) {
            this.field124 = 25;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class757.method4191(-2005530600, this.field102.method4168(this.field122, var4)) && class757.method4191(-2005530600, this.field102.CheckDeviceFormat(this.field122, this.field123, var4.Format, 0, 4, method100(arg0, arg1, (byte) -98)));
    }

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "(I)V")
    public final void method93(int arg0) {
        if (arg0 != 9) {
            this.field109 = true;
        }
        this.method104(0);
        this.method106((byte) 118);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lvr;Lvr;FLvr;)Lvr;")
    public final class458 method94(class458 arg0, class458 arg1, float arg2, class458 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILgca;)I")
    private static final int method95(int arg0, class705 arg1) {
        if (arg0 != 2) {
            return -98;
        } else if (class264.field3730 == arg1) {
            return 2;
        } else if (class368.field5193 == arg1) {
            return 0;
        } else if (class317.field4535 == arg1) {
            return 1;
        } else if (class504.field6917 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "(I)V")
    public final void method96(int arg0) {
        this.field100.method4177(15, this.field1851);
        if (arg0 != -25707) {
            this.field106 = false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "GA", descriptor = "(I)V")
    public final void method97(int arg0) {
        this.field100.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lup;B)V")
    public final void method98(class547 arg0, byte arg1) {
        int var3 = 0;
        if (arg1 != -60) {
            this.field118 = null;
        }
        if (class431.field5982 == arg0) {
            var3 = 65536;
        } else if (class165.field2523 == arg0) {
            var3 = 131072;
        } else if (class297.field4312 == arg0) {
            var3 = 196608;
        }
        this.field100.SetTextureStageState(this.field1876, 11, this.field1876 | var3);
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "()Z")
    public final boolean method99() {
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lnea;Ldr;B)I")
    public static final int method100(class600 arg0, class629 arg1, byte arg2) {
        if (class629.field8918 == arg1) {
            if (class498.field6845 == arg0) {
                return 22;
            }
            if (class133.field2225 == arg0) {
                return 21;
            }
            if (class547.field7573 == arg0) {
                return 28;
            }
            if (class94.field1350 == arg0) {
                return 50;
            }
            if (class505.field6931 == arg0) {
                return 51;
            }
            if (class459.field6273 == arg0) {
                return 77;
            }
        }
        if (arg2 >= -87) {
            field119 = null;
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "(I)V")
    public final void method101(int arg0) {
        if (arg0 >= -88) {
            return;
        }
        this.field1866 = (this.field1934 - this.field1914);
        this.field1919 = (float) (-this.field1942) + this.field1866;
        if ((float) this.field1911 > this.field1919) {
            this.field1919 = this.field1911;
        }
        this.field100.method4180(36, this.field1919);
        this.field100.method4180(37, this.field1866);
        this.field100.SetRenderState(34, this.field1936);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(IB)V")
    public final void method102(int arg0, byte arg1) {
        if (arg1 <= 90) {
            this.field124 = 51;
        }
        this.field100.SetTextureStageState(this.field1876, 11, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 == 0) {
            this.field100.method4177(28, this.field1908 && this.field1931 && this.field1942 >= 0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "(I)V")
    public final void method104(int arg0) {
        float var2 = this.field1899 ? this.field1877 : 0.0F;
        float var3 = this.field1899 ? -this.field1907 : 0.0F;
        this.field107.SetDiffuse(this.field1912 * var2, this.field1883 * var2, this.field1882 * var2, (float) arg0);
        this.field116.SetDiffuse(this.field1912 * var3, this.field1883 * var3, this.field1882 * var3, 0.0F);
        this.field109 = false;
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)V")
    public final void method105(int arg0) {
        this.field107.SetDirection(-this.field1940[0], -this.field1940[1], -this.field1940[2]);
        this.field116.SetDirection(-this.field1886[0], -this.field1886[1], -this.field1886[2]);
        this.field109 = false;
        if (arg0 != -14620) {
            this.field99 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public final void method106(byte arg0) {
        if (arg0 <= 67) {
            this.field112 = null;
        }
        if (this.field109) {
            return;
        }
        this.field100.LightEnable(0, false);
        this.field100.LightEnable(1, false);
        this.field100.SetLight(0, this.field107);
        this.field100.SetLight(1, this.field116);
        this.field100.LightEnable(0, true);
        this.field100.LightEnable(1, true);
        this.field109 = true;
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(B)V")
    public final void method107(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field1924; var2++) {
            class217 var3 = this.field1870[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1489((byte) -105);
            float var6 = var3.method1488(false) / 255.0F;
            this.field103.SetPosition((float) var3.method1495(false), (float) var3.method1494(false), (float) var3.method1490((byte) -126));
            this.field103.SetDiffuse((float) ((var5 & 0xFFBB33) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field103.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1491(0) * var3.method1491(0)));
            this.field103.SetRange((float) var3.method1491(0));
            this.field100.SetLight(var4, this.field103);
            this.field100.LightEnable(var4, true);
        }
        while (var2 < this.field1889) {
            this.field100.LightEnable(var2 + 2, false);
            var2++;
        }
        if (arg0 > -127) {
            this.method125(null, -20, -11, 119, -34, -22, false);
        }
        super.method107((byte) -128);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "()Lev;")
    public final class165 method108() {
        D3DADAPTER_IDENTIFIER var1 = this.field102.method4169(this.field122, 0);
        return new class165(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public final void method109(int arg0, int arg1) throws class684 {
        this.field100.EndScene();
        if (this.field121.method2860(6813)) {
            this.field124 = 0;
            if (class757.method4190((byte) -110, this.field121.method2861(0, (byte) -102))) {
                this.method110((byte) -4);
            }
        } else if (++this.field124 <= 50) {
            this.method110((byte) 96);
        } else {
            throw new class684();
        }
        this.field100.BeginScene();
    }

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "(B)Z")
    private final boolean method110(byte arg0) {
        int var2 = -71 / ((arg0 - 44) / 47);
        int var3 = this.field100.TestCooperativeLevel();
        if (var3 == 0 || var3 == -2005530519) {
            class487 var4 = (class487) this.field1792;
            this.method953(98);
            var4.method2858(true);
            this.field108.BackBufferHeight = 0;
            this.field108.BackBufferWidth = 0;
            if (method58(this.field1881, this.field122, 0, this.field108, this.field123, this.field102)) {
                int var5 = this.field100.Reset(this.field108);
                if (class757.method4191(-2005530600, var5)) {
                    var4.method2859(this.field100.method4188(), this.field100.method4181(0), (byte) 44);
                    this.method961(-101);
                    this.method59(2);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        this.field100.method4177(27, this.field1905);
        if (arg0 >= -12) {
            this.method89(null, -11);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILnea;I[BI)Loq;")
    public final class232 method112(int arg0, int arg1, class600 arg2, int arg3, byte[] arg4, int arg5) {
        return arg5 == 0 ? new class186(this, arg2, arg1, arg3, arg0, arg4) : (class232) null;
    }

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field100.method4177(174, this.field1971);
        if (arg0 != 0) {
            this.field121 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lnr;I)V")
    public final void method114(class22 arg0, int arg1) {
        this.field100.SetTexture(this.field1876, arg0.method210((byte) -78));
        if (this.field105[this.field1876] != arg0.field256) {
            int var3 = method66(arg0.field256, arg1 ^ 0x56E);
            this.field100.SetSamplerState(this.field1876, 6, var3);
            this.field100.SetSamplerState(this.field1876, 5, var3);
            this.field105[this.field1876] = arg0.field256;
            if (this.field114[this.field1876] != arg0.field253) {
                this.field100.SetSamplerState(this.field1876, 7, arg0.field253 ? method66(arg0.field256, 1385) : 0);
                this.field114[this.field1876] = arg0.field253;
            }
        } else if (this.field114[this.field1876] != arg0.field253) {
            this.field100.SetSamplerState(this.field1876, 7, arg0.field253 ? method66(arg0.field256, arg1 + 1378) : 0);
            this.field114[this.field1876] = arg0.field253;
        }
        if (arg1 == 7 && !this.field99[this.field1876]) {
            this.field99[this.field1876] = true;
            this.method130(arg1 + 9);
            this.method85(arg1 - 7);
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
    public final void method115() {
    }

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "(I)V")
    public final void method116(int arg0) {
        if (class295.field4293 == this.field1865) {
            this.field100.SetRenderState(19, 5);
            this.field100.SetRenderState(20, 6);
        } else if (class599.field8548 == this.field1865) {
            this.field100.SetRenderState(19, 2);
            this.field100.SetRenderState(20, 2);
        } else if (class741.field10255 == this.field1865) {
            this.field100.SetRenderState(19, 9);
            this.field100.SetRenderState(20, 2);
        }
        int var2 = -102 / ((arg0 - 20) / 40);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILcw;)V")
    public final void method117(int arg0, class146 arg1) {
        this.method114(arg1, 7);
        if (arg1.field2354 != this.field126[this.field1876]) {
            this.field100.SetSamplerState(this.field1876, 1, arg1.field2354 ? 1 : 3);
            this.field126[this.field1876] = arg1.field2354;
        }
        if (this.field125[this.field1876] != arg1.field2358) {
            this.field100.SetSamplerState(this.field1876, 2, arg1.field2358 ? 1 : 3);
            this.field125[this.field1876] = arg1.field2358;
        }
        if (arg0 != 3) {
            this.field99 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILnea;[FIZIB)Llba;")
    public final class225 method118(int arg0, int arg1, class600 arg2, float[] arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        if (arg7 < 36) {
            this.method102(99, (byte) -36);
        }
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "()V")
    public final void method119() {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lrs;)V")
    public final void method120(class730 arg0) {
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "()V")
    public final void method121() {
        IDirect3DEventQuery var1 = this.field100.method4183();
        if (class757.method4191(-2005530600, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2234(-4840);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLrl;)I")
    private static final int method122(boolean arg0, class713 arg1) {
        if (class591.field8480 == arg1) {
            return 2;
        } else if (class315.field4465 == arg1) {
            return 3;
        } else if (class311.field4416 == arg1) {
            return 1;
        } else if (class710.field9929 == arg1) {
            return 4;
        } else if (class595.field8512 == arg1) {
            return 6;
        } else if (class395.field5465 == arg1) {
            return 5;
        } else {
            if (!arg0) {
                field113 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        if (this.field1918.method2695(27457)) {
            this.field1845.method4099(field119, 21194);
        } else {
            field119[9] = 0.0F;
            field119[10] = 1.0F;
            field119[6] = 0.0F;
            field119[4] = 0.0F;
            field119[2] = 0.0F;
            field119[15] = 1.0F;
            field119[0] = 1.0F;
            field119[5] = 1.0F;
            field119[12] = 0.0F;
            field119[11] = 0.0F;
            field119[13] = 0.0F;
            field119[14] = 0.0F;
            field119[7] = 0.0F;
            field119[1] = 0.0F;
            field119[8] = 0.0F;
            field119[3] = 0.0F;
        }
        this.field100.SetTransform(2, field119);
        if (!arg0) {
            this.field125 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILrl;II)V")
    public final void method124(int arg0, class713 arg1, int arg2, int arg3) {
        this.field100.DrawPrimitive(method122(true, arg1), arg0, arg2);
        if (arg3 != 25886) {
            this.field111 = true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([IIIIIIZ)Llba;")
    public final class225 method125(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 != 9) {
            this.method139(-12, false, false, null, 26);
        }
        return new class146(this, arg3, arg2, arg6, arg0, arg4, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[Lpfa;)Lija;")
    public final class161 method126(int arg0, class249[] arg1) {
        if (arg0 != 10) {
            this.method142();
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjagdx/IDirect3DPixelShader;)V")
    public final void method128(byte arg0, IDirect3DPixelShader arg1) {
        this.field100.SetPixelShader(arg1);
        if (arg0 != -37) {
            this.field104 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)V")
    public final void method129(byte arg0) {
        if (arg0 != -54) {
            this.field123 = 102;
        }
        if (this.field110 != null || this.field1946[this.field1876] == class527.field7355) {
            this.field100.SetTextureStageState(this.field1876, 24, 0);
            this.field101[this.field1876] = 0;
            return;
        }
        if (this.field1946[this.field1876] == class608.field8647) {
            this.field100.SetTransform(this.field1876 + 16, this.field1938[this.field1876].method4083((byte) -49, field119));
        } else {
            this.field100.SetTransform(this.field1876 + 16, this.field1938[this.field1876].method4099(field119, arg0 + 21248));
        }
        int var2 = method141(7977, this.field1946[this.field1876]);
        if (this.field101[this.field1876] != var2) {
            this.field100.SetTextureStageState(this.field1876, 24, var2);
            this.field101[this.field1876] = var2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "(I)V")
    public final void method130(int arg0) {
        if (arg0 == 16) {
            int var2 = this.field99[this.field1876] ? method73((byte) -66, this.field1913[this.field1876]) : 1;
            this.field100.SetTextureStageState(this.field1876, 4, var2);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public final Object method131(Canvas arg0, byte arg1) {
        if (arg1 != -1) {
            this.method137(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method132(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 19362) {
            this.method129((byte) 10);
        }
        this.field121 = (class487) arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLgca;B)V")
    public final void method133(int arg0, boolean arg1, class705 arg2, byte arg3) {
        if (arg3 != 119) {
            return;
        }
        byte var6;
        if (arg0 == 1) {
            var6 = 6;
        } else if (arg0 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg1) {
            var7 |= 0x10;
        }
        this.field100.SetTextureStageState(this.field1876, var6, var7 | method95(2, arg2));
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method134(int arg0, Object arg1, Canvas arg2) {
        if (this.field1765 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field100.EndScene();
                this.method110((byte) 113);
                this.field100.BeginScene();
            }
        }
        if (arg0 != 0) {
            this.field101 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)Lwba;")
    public final class601 method135(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field110 = null;
        }
        return new class471(this, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ[BIILnea;I)Llba;")
    public final class225 method136(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, int arg5, class600 arg6, int arg7) {
        return arg1 > -23 ? (class225) null : new class146(this, arg6, arg0, arg5, arg2, arg3, arg7, arg4);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
    }

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "()V")
    public final void method138() {
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZZLgca;I)V")
    public final void method139(int arg0, boolean arg1, boolean arg2, class705 arg3, int arg4) {
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = arg4;
        if (arg2) {
            var8 = arg4 | 0x20;
        }
        if (arg1) {
            var8 |= 0x10;
        }
        this.field100.SetTextureStageState(this.field1876, var7, method95(2, arg3) | var8);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILvv;Lrl;III)V")
    public final void method140(int arg0, int arg1, class463 arg2, class713 arg3, int arg4, int arg5, int arg6) {
        this.field100.SetIndices(((class207) arg2).field3023);
        this.field100.DrawIndexedPrimitive(method122(true, arg3), arg4, arg0, arg1, arg5, arg6);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILsaa;)I")
    private static final int method141(int arg0, class657 arg1) {
        if (arg0 != 7977) {
            return -25;
        } else if (class492.field6753 == arg1) {
            return 1;
        } else if (class608.field8647 == arg1) {
            return 2;
        } else if (class604.field8581 == arg1) {
            return 3;
        } else if (class580.field8356 == arg1) {
            return 4;
        } else if (class581.field8361 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "()V")
    public final void method142() {
        this.field112.method2239(-3147);
        super.method142();
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        this.field100.method4177(7, this.field1902);
        if (arg0) {
            this.field100 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 != 0) {
            this.field102 = null;
        }
        this.field100.SetRenderState(60, this.field1945);
    }
}
