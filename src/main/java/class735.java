import jaclib.peer.class699;
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
import jagdx.class506;
import jagdx.class507;
import jagdx.class508;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class735 extends class151 {

    @OriginalMember(owner = "client!ki", name = "Wg", descriptor = "I")
    private int field10271 = 0;

    @OriginalMember(owner = "client!ki", name = "Sg", descriptor = "Z")
    private boolean field10267 = false;

    @OriginalMember(owner = "client!ki", name = "Tg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field10268;

    @OriginalMember(owner = "client!ki", name = "Gg", descriptor = "Lpja;")
    private class43 field10255;

    @OriginalMember(owner = "client!ki", name = "Ug", descriptor = "I")
    private int field10269;

    @OriginalMember(owner = "client!ki", name = "Og", descriptor = "Ljaclib/peer/in;")
    public class699 field10263;

    @OriginalMember(owner = "client!ki", name = "Eg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field10253;

    @OriginalMember(owner = "client!ki", name = "Zg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field10274;

    @OriginalMember(owner = "client!ki", name = "Dg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field10252;

    @OriginalMember(owner = "client!ki", name = "Lg", descriptor = "I")
    private int field10260;

    @OriginalMember(owner = "client!ki", name = "Fg", descriptor = "Ljagdx/D3DLIGHT;")
    private class508 field10254;

    @OriginalMember(owner = "client!ki", name = "Mg", descriptor = "Ljagdx/D3DLIGHT;")
    private class508 field10261;

    @OriginalMember(owner = "client!ki", name = "Yg", descriptor = "Ljagdx/D3DLIGHT;")
    private class508 field10273;

    @OriginalMember(owner = "client!ki", name = "Xg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field10272;

    @OriginalMember(owner = "client!ki", name = "bh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field10276;

    @OriginalMember(owner = "client!ki", name = "ah", descriptor = "Z")
    public boolean field10275;

    @OriginalMember(owner = "client!ki", name = "Vg", descriptor = "Z")
    public boolean field10270;

    @OriginalMember(owner = "client!ki", name = "Qg", descriptor = "Z")
    public boolean field10265;

    @OriginalMember(owner = "client!ki", name = "Ig", descriptor = "[Lcr;")
    private class597[] field10257;

    @OriginalMember(owner = "client!ki", name = "Cg", descriptor = "[Z")
    private boolean[] field10251;

    @OriginalMember(owner = "client!ki", name = "Jg", descriptor = "[Z")
    private boolean[] field10258;

    @OriginalMember(owner = "client!ki", name = "Kg", descriptor = "[Z")
    private boolean[] field10259;

    @OriginalMember(owner = "client!ki", name = "Hg", descriptor = "[I")
    private int[] field10256;

    @OriginalMember(owner = "client!ki", name = "Rg", descriptor = "[Z")
    private boolean[] field10266;

    @OriginalMember(owner = "client!ki", name = "Ng", descriptor = "[F")
    private static float[] field10262 = new float[16];

    @OriginalMember(owner = "client!ki", name = "ch", descriptor = "[I")
    private static int[] field10277 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ki", name = "dh", descriptor = "[I")
    private static int[] field10278 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ki", name = "Pg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10264;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lnea;Lvu;)Lcp;", line = 4)
    public final class753 method456(class742 arg0, class354 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)Lmq;", line = 11)
    public final class532 method1045(boolean arg0, byte arg1) {
        if (arg1 <= 106) {
            method4114(null, (byte) 117);
        }
        return new class8(this, class770.field10615, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lofa;ILkn;II)Lkt;", line = 24)
    public final class166 method1126(class345 arg0, int arg1, class770 arg2, int arg3, int arg4) {
        int var6 = 35 / ((-arg1 - 53) / 56);
        return new class618(this, arg0, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 33)
    public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class138 {
        this.method406(arg2, arg3);
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "(I)V", line = 41)
    public final void method1092(int arg0) {
        this.field10254.SetDirection(-this.field2172[0], -this.field2172[1], -this.field2172[2]);
        this.field10261.SetDirection(-this.field2189[0], -this.field2189[1], -this.field2189[2]);
        this.field10267 = false;
        if (arg0 <= 74) {
            this.method1139(-47, false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "(I)V", line = 55)
    public final void method1062(int arg0) {
        float var2 = this.field2224 ? this.field2217 : 0.0F;
        float var3 = this.field2224 ? -this.field2188 : 0.0F;
        if (arg0 != -14605) {
            this.method512(-34, -63);
        }
        this.field10254.SetDiffuse(this.field2212 * var2, this.field2144 * var2, this.field2221 * var2, 0.0F);
        this.field10261.SetDiffuse(this.field2212 * var3, this.field2144 * var3, this.field2221 * var3, 0.0F);
        this.field10267 = false;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILet;)V", line = 71)
    public final void method4111(int arg0, class618 arg1) {
        this.method4123(-31430, arg1);
        if (arg0 >= -16) {
            this.method4117(false, null);
        }
        if (arg1.field8711 != this.field10258[this.field2219]) {
            this.field10253.SetSamplerState(this.field2219, 1, arg1.field8711 ? 1 : 3);
            this.field10258[this.field2219] = arg1.field8711;
        }
        if (arg1.field8714 != this.field10251[this.field2219]) {
            this.field10253.SetSamplerState(this.field2219, 2, arg1.field8714 ? 1 : 3);
            this.field10251[this.field2219] = arg1.field8714;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V", line = 92)
    public final void method401(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "()V", line = 94)
    public final void method444() {
    }

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "(I)V", line = 97)
    public final void method1081(int arg0) {
        this.field10253.method2959(14, this.field2130 && this.field2159);
        if (arg0 >= -112) {
            this.field10255 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V", line = 106)
    public final void method397() {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lcp;)V", line = 108)
    public final void method485(class753 arg0) {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Lqe;)Lbw;", line = 111)
    public final class715 method1086(int arg0, class491[] arg1) {
        if (arg0 != 5678) {
            this.field10269 = -128;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILpg;)V", line = 124)
    public final void method1065(int arg0, class762 arg1) {
        if (arg0 != -13455) {
            this.field10258 = null;
        }
        int var3 = 0;
        if (class163.field2391 == arg1) {
            var3 = 65536;
        } else if (class772.field10656 == arg1) {
            var3 = 131072;
        } else if (class219.field3128 == arg1) {
            var3 = 196608;
        }
        this.field10253.SetTextureStageState(this.field2219, 11, this.field2219 | var3);
    }

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "(I)V", line = 148)
    public final void method1134(int arg0) {
        this.method1062(-14605);
        int var2 = 105 % ((-arg0 - 49) / 57);
        this.method1090(1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V", line = 158)
    public final void method1069(int arg0, byte arg1) {
        if (arg1 < 13) {
            this.field10272 = null;
        }
        this.field10253.SetTextureStageState(this.field2219, 11, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V", line = 168)
    public final void method1142(Canvas arg0, Object arg1, byte arg2) {
        if (this.field1961 == arg0) {
            Dimension var4 = arg0.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field10253.EndScene();
                this.method4122(false);
                this.field10253.BeginScene();
            }
        }
        if (arg2 != 69) {
            this.field10255 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "()Lrda;", line = 195)
    public final class689 method483() {
        D3DADAPTER_IDENTIFIER var1 = this.field10252.method2952(this.field10269, 0);
        return new class689(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "(B)V", line = 206)
    public final void method1100(byte arg0) {
        if (arg0 <= 77) {
            this.field10255 = null;
        }
        this.field10253.SetTransform(3, this.field2208);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/in;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lpja;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lcb;I)V", line = 219)
    private class735(int arg0, int arg1, Canvas arg2, class699 arg3, IDirect3D arg4, IDirect3DDevice arg5, class43 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class159 arg9, class544 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field10268 = arg8;
            this.field10255 = arg6;
            this.field10269 = arg0;
            this.field10263 = arg3;
            this.field10253 = arg5;
            this.field10274 = arg7;
            this.field10252 = arg4;
            this.field10260 = arg1;
            this.field10254 = new class508(this.field10263);
            this.field10261 = new class508(this.field10263);
            this.field10273 = new class508(this.field10263);
            this.field10272 = new PixelBuffer(this.field10263);
            this.field10276 = new GeometryBuffer(this.field10263);
            new GeometryBuffer(this.field10263);
            this.field10275 = (this.field10268.TextureCaps & 0x10000) != 0;
            this.field2197 = this.field10268.MaxSimultaneousTextures;
            this.field10270 = (this.field10268.TextureCaps & 0x2) == 0;
            this.field2184 = (this.field10268.TextureCaps & 0x2000) != 0;
            this.field10265 = (this.field10268.TextureCaps & 0x4000) != 0;
            this.field2210 = (this.field10268.TextureCaps & 0x800) != 0;
            this.field2160 = this.field10268.MaxActiveLights > 0 ? this.field10268.MaxActiveLights : 8;
            this.field2131 = this.field2207 > 0 || this.field10252.CheckDeviceMultiSampleType(this.field10269, this.field10260, this.field10274.BackBufferFormat, true, 2) == 0;
            this.field10257 = new class597[this.field2197];
            this.field10251 = new boolean[this.field2197];
            this.field10258 = new boolean[this.field2197];
            this.field10259 = new boolean[this.field2197];
            this.field10256 = new int[this.field2197];
            this.field10266 = new boolean[this.field2197];
            this.field10253.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method450(1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILsi;)I", line = 266)
    private static final int method4112(int arg0, class583 arg1) {
        if (arg0 > -14) {
            return -9;
        } else if (class31.field419 == arg1) {
            return 2;
        } else if (class701.field9895 == arg1) {
            return 3;
        } else if (class212.field3068 == arg1) {
            return 1;
        } else if (class415.field5856 == arg1) {
            return 4;
        } else if (class375.field5405 == arg1) {
            return 6;
        } else if (class552.field7866 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(Z)V", line = 299)
    public final void method1051(boolean arg0) {
        this.field2186 = (this.field2149 - this.field2157);
        this.field2155 = (float) (-this.field2201) + this.field2186;
        if ((float) this.field2220 > this.field2155) {
            this.field2155 = this.field2220;
        }
        this.field10253.method2957(36, this.field2155);
        this.field10253.method2957(37, this.field2186);
        this.field10253.SetRenderState(34, this.field2180);
        if (arg0) {
            this.method1070(-68, null, null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "(B)V", line = 317)
    public final void method1158(byte arg0) {
        if (arg0 <= 20) {
            this.method413();
        }
    }

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "(I)V", line = 327)
    public final void method1095(int arg0) {
        if (arg0 > 23) {
            int var2 = this.field10266[this.field2219] ? method4114(this.field2128[this.field2219], (byte) -15) : 1;
            this.field10253.SetTextureStageState(this.field2219, 1, var2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "(I)V", line = 339)
    public final void method1090(int arg0) {
        if (arg0 != 1) {
            this.method412(false);
        }
        if (this.field10267) {
            return;
        }
        this.field10253.LightEnable(0, false);
        this.field10253.LightEnable(1, false);
        this.field10253.SetLight(0, this.field10254);
        this.field10253.SetLight(1, this.field10261);
        this.field10253.LightEnable(0, true);
        this.field10253.LightEnable(1, true);
        this.field10267 = true;
    }

    @OriginalMember(owner = "client!ki", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lcb;Ljava/lang/Integer;)Lha;", line = 361)
    public static final class66 createToolkit(Canvas arg0, class159 arg1, class544 arg2, Integer arg3) {
        class735 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class699 var7 = new class699();
            IDirect3D var8 = IDirect3D.method2948(-2147483616, var7);
            D3DCAPS var9 = var8.method2949(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method4113((byte) 79, arg3, var6, var10, var8, var5)) {
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
                    var13 = var8.method2950(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class506 var17) {
                    var13 = var8.method2950(var5, var6, arg0, var11 | 0x20, var10);
                }
                class43 var15 = new class43(var13.method2970(0), var13.method2969());
                var4 = new class735(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1053(0);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method447();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "(I)V", line = 458)
    public final void method1117(int arg0) {
        if (this.field2153.method2547(arg0 ^ arg0)) {
            this.field2125.method2781(field10262, (byte) 75);
        } else {
            field10262[3] = 0.0F;
            field10262[4] = 0.0F;
            field10262[6] = 0.0F;
            field10262[8] = 0.0F;
            field10262[9] = 0.0F;
            field10262[15] = 1.0F;
            field10262[7] = 0.0F;
            field10262[11] = 0.0F;
            field10262[0] = 1.0F;
            field10262[14] = 0.0F;
            field10262[13] = 0.0F;
            field10262[12] = 0.0F;
            field10262[5] = 1.0F;
            field10262[2] = 0.0F;
            field10262[1] = 0.0F;
            field10262[10] = 1.0F;
        }
        this.field10253.SetTransform(2, field10262);
    }

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "(I)V", line = 491)
    public final void method1071(int arg0) {
        if (this.field10266[this.field2219]) {
            this.field10266[this.field2219] = false;
            this.field10253.SetTexture(this.field2219, null);
            this.method1039(1);
            this.method1095(65);
        }
        if (arg0 != 12) {
            this.method1142(null, null, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IZ)Lfka;", line = 508)
    public final class741 method1139(int arg0, boolean arg1) {
        if (arg0 != 6) {
            method4121(73, null);
        }
        return new class598(this, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;I)Z", line = 519)
    private static final boolean method4113(byte arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, IDirect3D arg4, int arg5) {
        if (arg0 <= 77) {
            return false;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class507.method2946(-74, arg4.method2951(arg5, var9))) {
                return false;
            }
            label82: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field10277.length; var10++) {
                        if (arg4.CheckDeviceType(arg5, arg2, var9.Format, field10277[var10], true) == 0 && arg4.CheckDeviceFormat(arg5, arg2, var9.Format, 1, 1, field10277[var10]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg2, field10277[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field10278.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg5, arg2, var9.Format, 2, 1, field10278[var11]) == 0 && arg4.CheckDepthStencilMatch(arg5, arg2, var9.Format, field10277[var10], field10278[var11]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg2, field10278[var10], true, var8) == 0)) {
                                    var7 = field10277[var10];
                                    var6 = field10278[var11];
                                    break label82;
                                }
                            }
                        }
                    }
                }
                arg1--;
            }
            if (arg1 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg3.MultiSampleType = var8;
            arg3.MultiSampleQuality = 0;
            arg3.AutoDepthStencilFormat = var6;
            arg3.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(BZ)V", line = 624)
    public final void method1089(byte arg0, boolean arg1) {
        if (arg0 == 95) {
            this.field10253.method2959(161, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lada;B)I", line = 634)
    private static final int method4114(class171 arg0, byte arg1) {
        if (class438.field6278 == arg0) {
            return 2;
        } else if (class174.field2460 == arg0) {
            return 4;
        } else if (class468.field6696 == arg0) {
            return 26;
        } else if (class576.field8141 == arg0) {
            return 7;
        } else if (class730.field10204 == arg0) {
            return 10;
        } else {
            int var2 = 1 % ((72 - arg1) / 40);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V", line = 664)
    public final void method1039(int arg0) {
        int var2 = this.field10266[this.field2219] ? method4114(this.field2226[this.field2219], (byte) -30) : 1;
        if (arg0 == 1) {
            this.field10253.SetTextureStageState(this.field2219, 4, var2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 675)
    public final void method1132(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 17360) {
            this.method1158((byte) 110);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZLeca;ZB)V", line = 696)
    public final void method1057(int arg0, boolean arg1, class789 arg2, boolean arg3, byte arg4) {
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg3) {
            var8 |= 0x20;
        }
        if (arg1) {
            var8 |= 0x10;
        }
        if (arg4 < 111) {
            this.field10267 = true;
        }
        this.field10253.SetTextureStageState(this.field2219, var7, var8 | method4120(1, arg2));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;I)V", line = 736)
    public final void method4115(IDirect3DPixelShader arg0, int arg1) {
        this.field10253.SetPixelShader(arg0);
        if (arg1 != -5251) {
            this.method1090(-69);
        }
    }

    @OriginalMember(owner = "client!ki", name = "GA", descriptor = "(I)V", line = 747)
    public final void method417(int arg0) {
        this.field10253.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "(B)V", line = 755)
    public final void method1151(byte arg0) {
        this.field10253.SetViewport(this.field2195, this.field2146, this.field1956, this.field1995, 0.0F, 1.0F);
        if (arg0 != 28) {
            this.method1124(false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lofa;ILkn;)I", line = 766)
    public static final int method4116(class345 arg0, int arg1, class770 arg2) {
        if (arg1 != 50) {
            method4119(false, null);
        }
        if (class770.field10614 == arg2) {
            if (class67.field898 == arg0) {
                return 22;
            }
            if (class12.field247 == arg0) {
                return 21;
            }
            if (class539.field7574 == arg0) {
                return 28;
            }
            if (class652.field9200 == arg0) {
                return 50;
            }
            if (class519.field7418 == arg0) {
                return 51;
            }
            if (class310.field4609 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)V", line = 805)
    public final void method1061(byte arg0) {
        this.field10253.method2959(7, this.field2170);
        if (arg0 >= -51) {
            this.method392();
        }
    }

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "()V", line = 814)
    public final void method443() {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BILofa;III)Lpo;", line = 818)
    public final class582 method1125(byte[] arg0, int arg1, class345 arg2, int arg3, int arg4, int arg5) {
        return arg3 == 8 ? new class448(this, arg2, arg5, arg1, arg4, arg0) : (class582) null;
    }

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "(II)V", line = 827)
    public final void method512(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ki", name = "ya", descriptor = "()V", line = 830)
    public final void method449() {
        this.method1171((byte) -118, true);
        this.field10253.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "()V", line = 839)
    public final void method447() {
        this.field10263.method3966(-81);
        super.method447();
    }

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "(I)F", line = 847)
    public final float method1085(int arg0) {
        return arg0 == 8550 ? -0.5F : -2.1686637F;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI[IIII)Lkt;", line = 857)
    public final class166 method1041(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -6647) {
            this.method1075(125, 58, null, true, -82, 104, null, -97);
        }
        return new class618(this, arg5, arg0, arg1, arg3, arg4, arg6);
    }

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "(I)V", line = 867)
    public final void method1141(int arg0) {
        this.field10253.method2959(15, this.field2133);
        if (arg0 != 13) {
            this.method1163(null, -96, null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZLeca;)V", line = 889)
    public final void method1098(int arg0, int arg1, boolean arg2, class789 arg3) {
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        if (arg0 != 3715) {
            this.method507(null, null, 0.1492926F, null);
        }
        int var7 = 0;
        if (arg2) {
            var7 |= 0x10;
        }
        this.field10253.SetTextureStageState(this.field2219, var6, var7 | method4120(1, arg3));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjagdx/IDirect3DVertexShader;)V", line = 923)
    public final void method4117(boolean arg0, IDirect3DVertexShader arg1) {
        this.field10264 = arg1;
        this.field10253.SetVertexShader(arg1);
        this.method1155((byte) -123);
        if (arg0) {
            this.method1045(true, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "(B)V", line = 935)
    public final void method1103(byte arg0) {
        this.field10253.method2959(174, this.field2251);
        if (arg0 != 6) {
            this.field10264 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "(Z)V", line = 946)
    public final void method1124(boolean arg0) {
        this.field10253.method2959(137, this.field2196 && !this.field2161);
        if (arg0) {
            field10262 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILfka;)V", line = 957)
    public final void method1091(byte arg0, int arg1, class741 arg2) {
        if (arg0 < 44) {
            this.field10255 = null;
        }
        class598 var4 = (class598) arg2;
        this.field10253.SetStreamSource(arg1, var4.field8428, 0, var4.method3453(17816));
    }

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "(Z)V", line = 969)
    public final void method1148(boolean arg0) {
        if (!arg0) {
            this.field10253.method2959(28, this.field2165 && this.field2129 && this.field2201 >= 0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILofa;[BIIZI)Lkt;", line = 979)
    public final class166 method1083(int arg0, int arg1, class345 arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg4 < 101) {
            this.method1070(59, null, null);
        }
        return new class618(this, arg2, arg7, arg0, arg6, arg3, arg1, arg5);
    }

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "(B)V", line = 992)
    public final void method1170(byte arg0) {
        if (arg0 != 89) {
            this.field10271 = 40;
        }
        if (class213.field3080 == this.field2213) {
            this.field10253.SetRenderState(19, 5);
            this.field10253.SetRenderState(20, 6);
        } else if (class64.field863 == this.field2213) {
            this.field10253.SetRenderState(19, 2);
            this.field10253.SetRenderState(20, 2);
        } else if (class550.field7775 == this.field2213) {
            this.field10253.SetRenderState(19, 9);
            this.field10253.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "(B)V", line = 1023)
    public final void method1155(byte arg0) {
        int var2 = -102 % ((arg0 - 75) / 43);
        if (this.field10264 != null || this.field2163[this.field2219] == class471.field6718) {
            this.field10253.SetTextureStageState(this.field2219, 24, 0);
            this.field10256[this.field2219] = 0;
            return;
        }
        if (this.field2163[this.field2219] == class505.field7237) {
            this.field10253.SetTransform(this.field2219 + 16, this.field2164[this.field2219].method2767(-82, field10262));
        } else {
            this.field10253.SetTransform(this.field2219 + 16, this.field2164[this.field2219].method2781(field10262, (byte) 75));
        }
        int var3 = method4119(false, this.field2163[this.field2219]);
        if (this.field10256[this.field2219] != var3) {
            this.field10253.SetTextureStageState(this.field2219, 24, var3);
            this.field10256[this.field2219] = var3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "(I)V", line = 1053)
    public final void method1156(int arg0) {
        if (arg0 != -559) {
            this.field10252 = null;
        }
        this.field10253.SetScissorRect(this.field2199 + this.field2195, this.field2166 + this.field2146, this.field2143, this.field2171);
    }

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "(I)V", line = 1063)
    public final void method1052(int arg0) {
        if (arg0 >= -63) {
            this.field10261 = null;
        }
        this.field10253.SetRenderState(60, this.field2190);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lkn;Lofa;I)Z", line = 1073)
    public final boolean method1129(class770 arg0, class345 arg1, int arg2) {
        if (arg2 != -25011) {
            this.field10265 = false;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class507.method2947(this.field10252.method2951(this.field10269, var4), -23) && class507.method2947(this.field10252.CheckDeviceFormat(this.field10269, this.field10260, var4.Format, 0, 4, method4116(arg1, arg2 ^ 0xFFFF9E7F, arg0)), -44);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIID)V", line = 1084)
    public final void method410(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILofa;Lkn;)Z", line = 1089)
    public final boolean method1070(int arg0, class345 arg1, class770 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 > -85) {
            return false;
        } else {
            return class507.method2947(this.field10252.method2951(this.field10269, var4), -86) && class507.method2947(this.field10252.CheckDeviceFormat(this.field10269, this.field10260, var4.Format, 0, 3, method4116(arg1, 50, arg2)), -114);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFF)V", line = 1099)
    public final void method396(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lq;B)V", line = 1102)
    public final void method4118(class448 arg0, byte arg1) {
        this.method4123(-31430, arg0);
        if (!this.field10258[this.field2219]) {
            this.field10253.SetSamplerState(this.field2219, 1, 1);
            this.field10258[this.field2219] = true;
        }
        if (!this.field10251[this.field2219]) {
            this.field10253.SetSamplerState(this.field2219, 2, 1);
            this.field10251[this.field2219] = true;
        }
        if (arg1 != 102) {
            this.field10257 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "(I)V", line = 1125)
    public final void method1145(int arg0) {
        if (arg0 != -31817) {
            this.field10256 = null;
        }
        this.field10253.method2959(27, this.field2148);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLpd;)I", line = 1135)
    private static final int method4119(boolean arg0, class267 arg1) {
        if (arg0) {
            method4114(null, (byte) -117);
        }
        if (class745.field10371 == arg1) {
            return 1;
        } else if (class505.field7237 == arg1) {
            return 2;
        } else if (class144.field1840 == arg1) {
            return 3;
        } else if (class410.field5778 == arg1) {
            return 4;
        } else if (class327.field4885 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILsi;II)V", line = 1169)
    public final void method1147(int arg0, class583 arg1, int arg2, int arg3) {
        this.field10253.DrawPrimitive(method4112(-67, arg1), arg3, arg2);
        if (arg0 != 1) {
            this.method1095(31);
        }
    }

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "(I)V", line = 1182)
    public final void method1112(int arg0) {
        for (int var2 = 0; var2 < this.field2197; var2++) {
            this.field10253.SetSamplerState(var2, 7, 0);
            this.field10253.SetSamplerState(var2, 6, 2);
            this.field10253.SetSamplerState(var2, 5, 2);
            this.field10253.SetSamplerState(var2, 1, 1);
            this.field10253.SetSamplerState(var2, 2, 1);
            this.field10257[var2] = class480.field6804;
            this.field10258[var2] = this.field10251[var2] = true;
            this.field10259[var2] = false;
            this.field10256[var2] = 0;
        }
        this.field10253.SetTextureStageState(0, 6, 1);
        this.field10253.SetRenderState(9, 2);
        this.field10253.SetRenderState(23, 4);
        this.field10253.SetRenderState(25, 5);
        this.field10253.SetRenderState(24, 0);
        this.field10253.SetRenderState(22, 2);
        this.field10253.SetRenderState(147, 1);
        this.field10253.SetRenderState(145, 1);
        this.field10253.method2957(38, 0.95F);
        this.field10253.SetRenderState(140, 3);
        this.field10254.SetType(3);
        if (arg0 >= 13) {
            this.field10261.SetType(3);
            this.field10273.SetType(1);
            this.field10267 = false;
            super.method1112(25);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)Lvu;", line = 1222)
    public final class354 method442(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "()I", line = 1229)
    public final int method404() {
        return 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V", line = 1236)
    public final void method406(int arg0, int arg1) throws class138 {
        this.field10253.EndScene();
        if (this.field10255.method297(71)) {
            this.field10271 = 0;
            if (class507.method2946(121, this.field10255.method294(0, 0))) {
                this.method4122(false);
            }
        } else if (++this.field10271 <= 50) {
            this.method4122(false);
        } else {
            throw new class138();
        }
        this.field10253.BeginScene();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILofa;ZII[FI)Lkt;", line = 1259)
    public final class166 method1075(int arg0, int arg1, class345 arg2, boolean arg3, int arg4, int arg5, float[] arg6, int arg7) {
        if (arg7 >= -70) {
            this.field10264 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILbw;)V", line = 1270)
    public final void method1099(int arg0, class715 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field10253.SetVertexDeclaration(var3.field5028);
        if (arg0 < 49) {
            this.method473(60);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILeca;)I", line = 1281)
    private static final int method4120(int arg0, class789 arg1) {
        if (class412.field5814 == arg1) {
            return 2;
        } else if (class492.field6991 == arg1) {
            return 0;
        } else if (class490.field6967 == arg1) {
            return 1;
        } else if (class490.field6966 == arg1) {
            return 3;
        } else {
            if (arg0 != 1) {
                field10278 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILcr;)I", line = 1306)
    private static final int method4121(int arg0, class597 arg1) {
        if (arg0 != 0) {
            field10277 = null;
        }
        if (class480.field6804 == arg1) {
            return 2;
        } else if (class471.field6717 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "(I)V", line = 1323)
    public final void method1049(int arg0) {
        this.field10254.SetAmbient(this.field2212 * this.field2191, this.field2191 * this.field2144, this.field2221 * this.field2191, 0.0F);
        if (arg0 == -12782) {
            this.field10267 = false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([[IZII)Lbv;", line = 1334)
    public final class320 method1066(int[][] arg0, boolean arg1, int arg2, int arg3) {
        return arg2 > -101 ? (class320) null : new class769(this, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "na", descriptor = "(IIII)[I", line = 1346)
    public final int[] method400(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field10253.method2955(0);
        IDirect3DSurface var7 = this.field10253.method2963(arg2, arg3, 21, 0, 0, true);
        if (class507.method2947(this.field10253.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -57) && class507.method2947(var7.LockRect(0, 0, arg2, arg3, 16, this.field10272), -113)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field10272.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field10272.method2975(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field10272.method2975(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3973(false);
        var7.method3973(false);
        return var5;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 1384)
    public final Object method1169(Canvas arg0, byte arg1) {
        if (arg1 != -45) {
            this.method1049(70);
        }
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V", line = 1399)
    public final void method413() {
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(II)Lbea;", line = 1402)
    public final class232 method1055(int arg0, int arg1) {
        if (arg0 >= -1) {
            return (class232) null;
        } else if (arg1 == 3) {
            return new class295(this, this.field2038);
        } else if (arg1 == 4) {
            return new class160(this, this.field2038, this.field1949);
        } else if (arg1 == 8) {
            return new class615(this, this.field2038, this.field1949);
        } else {
            return super.method1055(-111, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 1445)
    public final void method1163(Object arg0, int arg1, Canvas arg2) {
        this.field10255 = (class43) arg0;
        if (arg1 != -1) {
            this.field10253 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 1455)
    public final synchronized void method473(int arg0) {
        this.field10263.method3967((byte) 117);
        super.method473(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lsi;ILmq;IIII)V", line = 1468)
    public final void method1133(class583 arg0, int arg1, class532 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10253.SetIndices(((class8) arg2).field81);
        this.field10253.DrawIndexedPrimitive(method4112(arg6 - 39, arg0), 0, arg1, arg4, arg3, arg5);
        if (arg6 != 6) {
            this.method1039(119);
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(II)Lnea;", line = 1486)
    public final class742 method501(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "()Z", line = 1496)
    public final boolean method454() {
        return false;
    }

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "(Z)V", line = 1505)
    public final void method1154(boolean arg0) {
        int var2;
        for (var2 = 0; var2 < this.field2223; var2++) {
            class578 var3 = this.field2215[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3362(0);
            float var6 = var3.method3356((byte) 81) / 255.0F;
            this.field10273.SetPosition((float) var3.method3358((byte) 22), (float) var3.method3355(0), (float) var3.method3363(-1));
            this.field10273.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFF1B) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field10273.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3360(-31770) * var3.method3360(-31770)));
            this.field10273.SetRange((float) var3.method3360(-31770));
            this.field10253.SetLight(var4, this.field10273);
            this.field10253.LightEnable(var4, true);
        }
        while (var2 < this.field2225) {
            this.field10253.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1154(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lag;Lag;FLag;)Lag;", line = 1540)
    public final class710 method507(class710 arg0, class710 arg1, float arg2, class710 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "(B)V", line = 1548)
    public final void method1144(byte arg0) {
        if (this.field2110) {
            field10262[8] = 0.0F;
            field10262[3] = 0.0F;
            field10262[15] = 1.0F;
            field10262[0] = 1.0F;
            field10262[14] = 0.0F;
            field10262[10] = 1.0F;
            field10262[1] = 0.0F;
            field10262[4] = 0.0F;
            field10262[5] = 1.0F;
            field10262[12] = 0.0F;
            field10262[2] = 0.0F;
            field10262[11] = 0.0F;
            field10262[6] = 0.0F;
            field10262[7] = 0.0F;
            field10262[9] = 0.0F;
            field10262[13] = 0.0F;
        } else {
            this.field2109.method2781(field10262, (byte) 75);
        }
        this.field10253.SetTransform(256, field10262);
        if (arg0 != -96) {
            this.method1134(21);
        }
    }

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "(Z)Z", line = 1586)
    private final boolean method4122(boolean arg0) {
        int var2 = this.field10253.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class43 var3 = (class43) this.field1979;
            this.method1037(false);
            var3.method296(true);
            this.field10274.BackBufferHeight = 0;
            this.field10274.BackBufferWidth = 0;
            if (method4113((byte) 122, this.field2207, this.field10260, this.field10274, this.field10252, this.field10269)) {
                int var4 = this.field10253.Reset(this.field10274);
                if (class507.method2947(var4, -94)) {
                    var3.method295(0, this.field10253.method2970(0), this.field10253.method2969());
                    this.method1074(15706);
                    this.method1112(111);
                    return true;
                }
            }
        }
        if (arg0) {
            this.field10270 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 1625)
    public final void method392() {
        IDirect3DEventQuery var1 = this.field10253.method2965();
        if (class507.method2947(var1.Issue(), -3)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3973(false);
    }

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "()Z", line = 1648)
    public final boolean method448() {
        return false;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILen;)V", line = 1656)
    public final void method4123(int arg0, class335 arg1) {
        if (arg0 != -31430) {
            return;
        }
        this.field10253.SetTexture(this.field2219, arg1.method2162(-26076));
        if (this.field10257[this.field2219] != arg1.field4989) {
            int var3 = method4121(0, arg1.field4989);
            this.field10253.SetSamplerState(this.field2219, 6, var3);
            this.field10253.SetSamplerState(this.field2219, 5, var3);
            this.field10257[this.field2219] = arg1.field4989;
            if (this.field10259[this.field2219] != arg1.field4990) {
                this.field10253.SetSamplerState(this.field2219, 7, arg1.field4990 ? method4121(0, arg1.field4989) : 0);
                this.field10259[this.field2219] = arg1.field4990;
            }
        } else if (this.field10259[this.field2219] != arg1.field4990) {
            this.field10253.SetSamplerState(this.field2219, 7, arg1.field4990 ? method4121(0, arg1.field4989) : 0);
            this.field10259[this.field2219] = arg1.field4990;
        }
        if (!this.field10266[this.field2219]) {
            this.field10266[this.field2219] = true;
            this.method1039(1);
            this.method1095(119);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V", line = 1701)
    public final void method412(boolean arg0) {
    }
}
