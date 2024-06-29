import jaclib.peer.class703;
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
import jagdx.class509;
import jagdx.class510;
import jagdx.class511;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class449 {

    @OriginalMember(owner = "client!us", name = "Sg", descriptor = "Z")
    private boolean field10 = false;

    @OriginalMember(owner = "client!us", name = "Zg", descriptor = "I")
    private int field17 = 0;

    @OriginalMember(owner = "client!us", name = "ih", descriptor = "Ldfa;")
    private class177 field26;

    @OriginalMember(owner = "client!us", name = "Kg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field2;

    @OriginalMember(owner = "client!us", name = "Vg", descriptor = "Ljaclib/peer/pba;")
    public class703 field13;

    @OriginalMember(owner = "client!us", name = "Wg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field14;

    @OriginalMember(owner = "client!us", name = "Yg", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!us", name = "fh", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field23;

    @OriginalMember(owner = "client!us", name = "jh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field27;

    @OriginalMember(owner = "client!us", name = "eh", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!us", name = "ah", descriptor = "Ljagdx/D3DLIGHT;")
    private class511 field18;

    @OriginalMember(owner = "client!us", name = "Xg", descriptor = "Ljagdx/D3DLIGHT;")
    private class511 field15;

    @OriginalMember(owner = "client!us", name = "hh", descriptor = "Ljagdx/D3DLIGHT;")
    private class511 field25;

    @OriginalMember(owner = "client!us", name = "bh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field19;

    @OriginalMember(owner = "client!us", name = "Ug", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field12;

    @OriginalMember(owner = "client!us", name = "Qg", descriptor = "Z")
    public boolean field8;

    @OriginalMember(owner = "client!us", name = "dh", descriptor = "Z")
    public boolean field21;

    @OriginalMember(owner = "client!us", name = "Lg", descriptor = "Z")
    public boolean field3;

    @OriginalMember(owner = "client!us", name = "Og", descriptor = "[I")
    private int[] field6;

    @OriginalMember(owner = "client!us", name = "Jg", descriptor = "[Z")
    private boolean[] field1;

    @OriginalMember(owner = "client!us", name = "gh", descriptor = "[Z")
    private boolean[] field24;

    @OriginalMember(owner = "client!us", name = "Rg", descriptor = "[Lko;")
    private class531[] field9;

    @OriginalMember(owner = "client!us", name = "kh", descriptor = "[Z")
    private boolean[] field28;

    @OriginalMember(owner = "client!us", name = "Pg", descriptor = "[Z")
    private boolean[] field7;

    @OriginalMember(owner = "client!us", name = "Mg", descriptor = "[I")
    private static int[] field4 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!us", name = "Ng", descriptor = "[F")
    private static float[] field5 = new float[16];

    @OriginalMember(owner = "client!us", name = "ch", descriptor = "[I")
    private static int[] field20 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!us", name = "Tg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field11;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lje;BILkja;III)V", line = 7)
    public final void method1(class422 arg0, byte arg1, int arg2, class686 arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 10) {
            this.field22 = -92;
        }
        this.field27.SetIndices(((class735) arg0).field10269);
        this.field27.DrawIndexedPrimitive(method84(arg3, 2), 0, arg6, arg2, arg4, arg5);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "()V", line = 26)
    public final void method2() {
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ldw;ILpe;BI)Lada;", line = 29)
    public final class175 method3(class748 arg0, int arg1, class636 arg2, byte arg3, int arg4) {
        return arg3 < 9 ? (class175) null : new class295(this, arg2, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!us", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lbt;Ljava/lang/Integer;)Lha;", line = 40)
    public static final class66 createToolkit(Canvas arg0, class162 arg1, class48 arg2, Integer arg3) {
        class1 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class703 var7 = new class703();
            IDirect3D var8 = IDirect3D.method3045(-2147483616, var7);
            D3DCAPS var9 = var8.method3044(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x20 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method17(var5, arg3, (byte) 107, var10, var8, var6)) {
                    throw new RuntimeException("");
                }
                var10.EnableAutoDepthStencil = true;
                var10.Windowed = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method3043(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class510 var17) {
                    var13 = var8.method3043(var5, var6, arg0, var11 | 0x20, var10);
                }
                class177 var15 = new class177(var13.method3065(0), var13.method3055());
                var4 = new class1(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2717((byte) -101);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method53();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lmga;ZBZI)V", line = 148)
    public final void method4(class738 arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        byte var7;
        if (arg4 == 1) {
            var7 = 3;
        } else if (arg4 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg1) {
            var8 |= 0x20;
        }
        if (arg3) {
            var8 |= 0x10;
        }
        this.field27.SetTextureStageState(this.field6261, var7, method45(arg0, false) | var8);
        if (arg2 <= 76) {
            this.method52(18, 123);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(II)V", line = 185)
    public final void method5(int arg0, int arg1) throws class677 {
        this.field27.EndScene();
        if (this.field26.method1204((byte) 14)) {
            this.field17 = 0;
            if (class509.method3049(-1, this.field26.method1207(0, false))) {
                this.method89(110);
            }
        } else if (++this.field17 <= 50) {
            this.method89(-116);
        } else {
            throw new class677();
        }
        this.field27.BeginScene();
    }

    @OriginalMember(owner = "client!us", name = "ya", descriptor = "()V", line = 211)
    public final void method6() {
        this.method2666(8, true);
        this.field27.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!us", name = "v", descriptor = "(I)V", line = 220)
    public final void method7(int arg0) {
        this.field27.method3052(15, this.field6306);
        if (arg0 != 8085) {
            this.method82(123);
        }
    }

    @OriginalMember(owner = "client!us", name = "x", descriptor = "(B)V", line = 231)
    public final void method8(byte arg0) {
        if (arg0 < 85) {
            this.field3 = true;
        }
        if (this.field11 != null || this.field6311[this.field6261] == class533.field7504) {
            this.field27.SetTextureStageState(this.field6261, 24, 0);
            this.field6[this.field6261] = 0;
            return;
        }
        if (this.field6311[this.field6261] == class326.field4040) {
            this.field27.SetTransform(this.field6261 + 16, this.field6294[this.field6261].method1535(95, field5));
        } else {
            this.field27.SetTransform(this.field6261 + 16, this.field6294[this.field6261].method1523(field5, false));
        }
        int var2 = method49(this.field6311[this.field6261], -71);
        if (this.field6[this.field6261] != var2) {
            this.field27.SetTextureStageState(this.field6261, 24, var2);
            this.field6[this.field6261] = var2;
        }
    }

    @OriginalMember(owner = "client!us", name = "s", descriptor = "(I)V", line = 262)
    public final void method9(int arg0) {
        this.field18.SetAmbient(this.field6276 * this.field6255, this.field6323 * this.field6255, this.field6281 * this.field6255, 0.0F);
        this.field10 = false;
        if (arg0 >= -13) {
            this.method18(-38);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V", line = 273)
    public final void method10(int arg0, IDirect3DPixelShader arg1) {
        this.field27.SetPixelShader(arg1);
        if (arg0 == 21) {
            ;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I[BIIZLpe;II)Lada;", line = 287)
    public final class175 method11(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, class636 arg5, int arg6, int arg7) {
        if (arg2 >= -92) {
            this.field21 = true;
        }
        return new class295(this, arg5, arg6, arg3, arg4, arg1, arg7, arg0);
    }

    @OriginalMember(owner = "client!us", name = "x", descriptor = "(I)V", line = 299)
    public final void method12(int arg0) {
        if (this.field6218) {
            field5[5] = 1.0F;
            field5[10] = 1.0F;
            field5[0] = 1.0F;
            field5[15] = 1.0F;
            field5[6] = 0.0F;
            field5[3] = 0.0F;
            field5[13] = 0.0F;
            field5[8] = 0.0F;
            field5[2] = 0.0F;
            field5[14] = 0.0F;
            field5[7] = 0.0F;
            field5[9] = 0.0F;
            field5[1] = 0.0F;
            field5[12] = 0.0F;
            field5[11] = 0.0F;
            field5[4] = 0.0F;
        } else {
            this.field6219.method1523(field5, false);
        }
        this.field27.SetTransform(256, field5);
        if (arg0 != 15543) {
            this.field23 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "GA", descriptor = "(I)V", line = 336)
    public final void method13(int arg0) {
        this.field27.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!us", name = "C", descriptor = "(B)V", line = 344)
    public final void method14(byte arg0) {
        if (arg0 != -9) {
            method76(null, 12);
        }
        int var2 = this.field1[this.field6261] ? method76(this.field6298[this.field6261], 117) : 1;
        this.field27.SetTextureStageState(this.field6261, 4, var2);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)Lje;", line = 355)
    public final class422 method15(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method57(117, false);
        }
        return new class735(this, class748.field10385, arg1);
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/pba;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ldfa;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lbt;I)V", line = 365)
    private class1(int arg0, int arg1, Canvas arg2, class703 arg3, IDirect3D arg4, IDirect3DDevice arg5, class177 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class162 arg9, class48 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field26 = arg6;
            this.field2 = arg4;
            this.field13 = arg3;
            this.field14 = arg7;
            this.field16 = arg0;
            this.field23 = arg8;
            this.field27 = arg5;
            this.field22 = arg1;
            this.field18 = new class511(this.field13);
            this.field15 = new class511(this.field13);
            this.field25 = new class511(this.field13);
            this.field19 = new PixelBuffer(this.field13);
            this.field12 = new GeometryBuffer(this.field13);
            new GeometryBuffer(this.field13);
            this.field8 = (this.field23.TextureCaps & 0x2) == 0;
            this.field21 = (this.field23.TextureCaps & 0x4000) != 0;
            this.field3 = (this.field23.TextureCaps & 0x10000) != 0;
            this.field6272 = this.field23.MaxSimultaneousTextures;
            this.field6308 = (this.field23.TextureCaps & 0x2000) != 0;
            this.field6264 = this.field23.MaxActiveLights <= 0 ? 8 : this.field23.MaxActiveLights;
            this.field6240 = (this.field23.TextureCaps & 0x800) != 0;
            this.field6270 = this.field6256 > 0 || this.field2.CheckDeviceMultiSampleType(this.field16, this.field22, this.field14.BackBufferFormat, true, 2) == 0;
            this.field6 = new int[this.field6272];
            this.field1 = new boolean[this.field6272];
            this.field24 = new boolean[this.field6272];
            this.field9 = new class531[this.field6272];
            this.field28 = new boolean[this.field6272];
            this.field7 = new boolean[this.field6272];
            this.field27.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method559((byte) 1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(II)Lbda;", line = 413)
    public final class532 method16(int arg0, int arg1) {
        if (arg1 != -12567) {
            this.method90(40);
        }
        if (arg0 == 3) {
            return new class630(this, this.field6141);
        } else if (arg0 == 4) {
            return new class76(this, this.field6141, this.field6105);
        } else if (arg0 == 8) {
            return new class736(this, this.field6141, this.field6105);
        } else {
            return super.method16(arg0, arg1 ^ 0x0);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;I)Z", line = 456)
    private static final boolean method17(int arg0, int arg1, byte arg2, D3DPRESENT_PARAMETERS arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class509.method3049(-1, arg4.method3046(arg0, var9))) {
                return false;
            }
            label89: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field4.length; var10++) {
                        if (arg4.CheckDeviceType(arg0, arg5, var9.Format, field4[var10], true) == 0 && arg4.CheckDeviceFormat(arg0, arg5, var9.Format, 1, 1, field4[var10]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg5, field4[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field20.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg0, arg5, var9.Format, 2, 1, field20[var11]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg5, var9.Format, field4[var10], field20[var11]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg5, field20[var10], true, var8) == 0)) {
                                    var7 = field4[var10];
                                    var6 = field20[var11];
                                    break label89;
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
            arg3.AutoDepthStencilFormat = var6;
            arg3.MultiSampleQuality = 0;
            arg3.MultiSampleType = var8;
            if (arg2 == 107) {
                arg3.BackBufferFormat = var7;
                return true;
            } else {
                return false;
            }
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "K", descriptor = "(I)V", line = 562)
    public final void method18(int arg0) {
        int var2 = -44 % ((-arg0 - 2) / 42);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLkja;II)V", line = 574)
    public final void method19(byte arg0, class686 arg1, int arg2, int arg3) {
        this.field27.DrawPrimitive(method84(arg1, 2), arg2, arg3);
        int var5 = 15 / ((arg0 + 7) / 46);
    }

    @OriginalMember(owner = "client!us", name = "t", descriptor = "()V", line = 585)
    public final void method20() {
    }

    @OriginalMember(owner = "client!us", name = "w", descriptor = "(I)V", line = 588)
    public final void method21(int arg0) {
        this.field6258 = (this.field6227 - this.field6234);
        this.field6278 = this.field6258 - (float) this.field6231;
        if (this.field6278 < (float) this.field6322) {
            this.field6278 = this.field6322;
        }
        this.field27.method3062(36, this.field6278);
        this.field27.method3062(37, this.field6258);
        this.field27.SetRenderState(34, this.field6307);
        if (arg0 != -23392) {
            this.field11 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "u", descriptor = "(I)V", line = 606)
    public final void method22(int arg0) {
        if (arg0 == 2 && this.field1[this.field6261]) {
            this.field1[this.field6261] = false;
            this.field27.SetTexture(this.field6261, null);
            this.method14((byte) -9);
            this.method51(0);
        }
    }

    @OriginalMember(owner = "client!us", name = "J", descriptor = "(I)V", line = 629)
    public final void method23(int arg0) {
        this.field27.SetViewport(this.field6251, this.field6304, this.field6148, this.field6096, 0.0F, 1.0F);
        if (arg0 > -85) {
            this.method78(52);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lmm;I)V", line = 639)
    public final void method24(class295 arg0, int arg1) {
        if (arg1 != 1) {
            this.method1(null, (byte) 24, 19, null, 126, 112, 117);
        }
        this.method35(arg0, (byte) 108);
        if (arg0.field3520 != this.field7[this.field6261]) {
            this.field27.SetSamplerState(this.field6261, 1, arg0.field3520 ? 1 : 3);
            this.field7[this.field6261] = arg0.field3520;
        }
        if (arg0.field3519 != this.field24[this.field6261]) {
            this.field27.SetSamplerState(this.field6261, 2, arg0.field3519 ? 1 : 3);
            this.field24[this.field6261] = arg0.field3519;
        }
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "()V", line = 662)
    public final void method25() {
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([BIIIBLpe;)Lch;", line = 666)
    public final class489 method26(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, class636 arg5) {
        if (arg4 != -90) {
            this.field13 = null;
        }
        return new class516(this, arg5, arg3, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V", line = 676)
    public final void method27(Canvas arg0, Object arg1, int arg2) {
        if (arg2 != 16711680 || this.field6201 != arg0) {
            return;
        }
        Dimension var4 = arg0.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field27.EndScene();
            this.method89(arg2 - 16711587);
            this.field27.BeginScene();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lpe;Ldw;I)I", line = 701)
    public static final int method28(class636 arg0, class748 arg1, int arg2) {
        if (arg2 != 6) {
            createToolkit(null, null, null, null);
        }
        if (class748.field10384 == arg1) {
            if (class574.field7863 == arg0) {
                return 22;
            }
            if (class141.field1759 == arg0) {
                return 21;
            }
            if (class205.field2451 == arg0) {
                return 28;
            }
            if (class677.field9284 == arg0) {
                return 50;
            }
            if (class216.field2549 == arg0) {
                return 51;
            }
            if (class308.field3821 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!us", name = "r", descriptor = "(B)V", line = 741)
    public final void method29(byte arg0) {
        int var2 = -20 / ((arg0 + 85) / 39);
        if (class303.field3614 == this.field6250) {
            this.field27.SetRenderState(19, 5);
            this.field27.SetRenderState(20, 6);
        } else if (class243.field2863 == this.field6250) {
            this.field27.SetRenderState(19, 2);
            this.field27.SetRenderState(20, 2);
        } else if (class120.field1531 == this.field6250) {
            this.field27.SetRenderState(19, 9);
            this.field27.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(BI)V", line = 768)
    public final void method30(byte arg0, int arg1) {
        if (arg0 != 25) {
            this.field1 = null;
        }
        this.field27.SetTextureStageState(this.field6261, 11, arg1);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V", line = 778)
    public final void method31(boolean arg0) {
    }

    @OriginalMember(owner = "client!us", name = "x", descriptor = "()V", line = 780)
    public final void method32() {
    }

    @OriginalMember(owner = "client!us", name = "D", descriptor = "(B)V", line = 783)
    public final void method33(byte arg0) {
        if (arg0 != 34) {
            this.field21 = false;
        }
        this.field27.method3052(14, this.field6236 && this.field6238);
    }

    @OriginalMember(owner = "client!us", name = "q", descriptor = "(B)V", line = 793)
    public final void method34(byte arg0) {
        if (arg0 != 117) {
            this.method4(null, true, (byte) 111, false, -72);
        }
        this.field27.method3052(28, this.field6316 && this.field6293 && this.field6231 >= 0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lhm;B)V", line = 803)
    public final void method35(class234 arg0, byte arg1) {
        this.field27.SetTexture(this.field6261, arg0.method1440(true));
        if (this.field9[this.field6261] != arg0.field2782) {
            int var3 = method79(1, arg0.field2782);
            this.field27.SetSamplerState(this.field6261, 6, var3);
            this.field27.SetSamplerState(this.field6261, 5, var3);
            this.field9[this.field6261] = arg0.field2782;
            if (this.field28[this.field6261] != arg0.field2784) {
                this.field27.SetSamplerState(this.field6261, 7, arg0.field2784 ? method79(1, arg0.field2782) : 0);
                this.field28[this.field6261] = arg0.field2784;
            }
        } else if (this.field28[this.field6261] != arg0.field2784) {
            this.field27.SetSamplerState(this.field6261, 7, arg0.field2784 ? method79(1, arg0.field2782) : 0);
            this.field28[this.field6261] = arg0.field2784;
        }
        if (arg1 < 67) {
            this.method87(-17, -63, 12, 41);
        }
        if (!this.field1[this.field6261]) {
            this.field1[this.field6261] = true;
            this.method14((byte) -9);
            this.method51(0);
        }
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "()V", line = 846)
    public final void method36() {
        IDirect3DEventQuery var1 = this.field27.method3057();
        if (class509.method3048(-1, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method4003(true);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILhca;)V", line = 870)
    public final void method37(int arg0, class516 arg1) {
        this.method35(arg1, (byte) 93);
        if (arg0 != 16) {
            this.method3(null, -78, null, (byte) -81, 0);
        }
        if (!this.field7[this.field6261]) {
            this.field27.SetSamplerState(this.field6261, 1, 1);
            this.field7[this.field6261] = true;
        }
        if (!this.field24[this.field6261]) {
            this.field27.SetSamplerState(this.field6261, 2, 1);
            this.field24[this.field6261] = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(Z)V", line = 893)
    public final void method38(boolean arg0) {
        if (arg0) {
            this.method72((byte) -105);
            this.method74(-8);
        }
    }

    @OriginalMember(owner = "client!us", name = "W", descriptor = "(I)V", line = 906)
    public final void method39(int arg0) {
        if (arg0 >= -111) {
            return;
        }
        int var2;
        for (var2 = 0; var2 < this.field6262; var2++) {
            class515 var3 = this.field6299[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3089(25215);
            float var6 = var3.method3083(118) / 255.0F;
            this.field25.SetPosition((float) var3.method3084(0), (float) var3.method3086((byte) -104), (float) var3.method3085(true));
            this.field25.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field25.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3088(21915) * var3.method3088(21915)));
            this.field25.SetRange((float) var3.method3088(21915));
            this.field27.SetLight(var4, this.field25);
            this.field27.LightEnable(var4, true);
        }
        while (this.field6247 > var2) {
            this.field27.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method39(-118);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIII)V", line = 944)
    public final void method40(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(IZ)V", line = 947)
    public final void method41(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method49(null, -117);
        }
        this.field27.method3052(161, arg1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ldw;Lpe;I)Z", line = 960)
    public final boolean method42(class748 arg0, class636 arg1, int arg2) {
        int var4 = 15 / ((-arg2 - 49) / 56);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class509.method3048(-1, this.field2.method3046(this.field16, var5)) && class509.method3048(-1, this.field2.CheckDeviceFormat(this.field16, this.field22, var5.Format, 0, 3, method28(arg1, arg0, 6)));
    }

    @OriginalMember(owner = "client!us", name = "L", descriptor = "(I)V", line = 973)
    public final void method43(int arg0) {
        this.field27.SetTransform(3, this.field6268);
        if (arg0 != 1) {
            this.field3 = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)Lsea;", line = 984)
    public final class726 method44(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lmga;Z)I", line = 992)
    private static final int method45(class738 arg0, boolean arg1) {
        if (arg1) {
            return 2;
        } else if (class507.field7214 == arg0) {
            return 2;
        } else if (class606.field8160 == arg0) {
            return 0;
        } else if (class616.field8291 == arg0) {
            return 1;
        } else if (class555.field7718 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI[[II)Lmia;", line = 1019)
    public final class69 method46(boolean arg0, int arg1, int[][] arg2, int arg3) {
        int var5 = -71 % ((63 - arg1) / 52);
        return new class767(this, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!us", name = "q", descriptor = "(I)V", line = 1027)
    public final void method47(int arg0) {
        this.field27.SetScissorRect(this.field6254 + this.field6251, this.field6304 + this.field6232, this.field6296, this.field6266);
        if (arg0 != 0) {
            this.method51(110);
        }
    }

    @OriginalMember(owner = "client!us", name = "u", descriptor = "(B)V", line = 1037)
    public final void method48(byte arg0) {
        this.field27.method3052(27, this.field6305);
        if (arg0 != 82) {
            this.field10 = false;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lsi;I)I", line = 1052)
    private static final int method49(class586 arg0, int arg1) {
        if (arg1 > -37) {
            method49(null, -25);
        }
        if (class105.field1340 == arg0) {
            return 1;
        } else if (class326.field4040 == arg0) {
            return 2;
        } else if (class444.field5955 == arg0) {
            return 3;
        } else if (class318.field3914 == arg0) {
            return 4;
        } else if (class383.field4897 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IIIID)V", line = 1082)
    public final void method50(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!us", name = "l", descriptor = "(I)V", line = 1085)
    public final void method51(int arg0) {
        if (arg0 == 0) {
            int var2 = this.field1[this.field6261] ? method76(this.field6309[this.field6261], arg0 ^ 0x59) : 1;
            this.field27.SetTextureStageState(this.field6261, 1, var2);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)Lup;", line = 1098)
    public final class292 method52(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!us", name = "q", descriptor = "()V", line = 1105)
    public final void method53() {
        this.field13.method3998((byte) 48);
        super.method53();
    }

    @OriginalMember(owner = "client!us", name = "v", descriptor = "()Z", line = 1113)
    public final boolean method54() {
        return false;
    }

    @OriginalMember(owner = "client!us", name = "o", descriptor = "(B)F", line = 1120)
    public final float method55(byte arg0) {
        return arg0 == -46 ? -0.5F : -0.5482816F;
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V", line = 1133)
    public final synchronized void method56(int arg0) {
        this.field13.method3999((byte) -62);
        super.method56(arg0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)Loda;", line = 1141)
    public final class129 method57(int arg0, boolean arg1) {
        return arg0 == 14 ? new class29(this, arg1) : (class129) null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V", line = 1152)
    public final void method58(Canvas arg0, Object arg1, int arg2) {
        int var4 = -34 % ((arg2 + 51) / 50);
        this.field26 = (class177) arg1;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lgha;I)V", line = 1161)
    public final void method59(class366 arg0, int arg1) {
        if (arg1 != 231) {
            return;
        }
        int var3 = 0;
        if (class790.field10873 == arg0) {
            var3 = 65536;
        } else if (class656.field9043 == arg0) {
            var3 = 131072;
        } else if (class244.field2876 == arg0) {
            var3 = 196608;
        }
        this.field27.SetTextureStageState(this.field6261, 11, var3 | this.field6261);
    }

    @OriginalMember(owner = "client!us", name = "o", descriptor = "()Lub;", line = 1185)
    public final class22 method60() {
        D3DADAPTER_IDENTIFIER var1 = this.field2.method3047(this.field16, 0);
        return new class22(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(FFF)V", line = 1192)
    public final void method61(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lpe;ILdw;)Z", line = 1196)
    public final boolean method62(class636 arg0, int arg1, class748 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg1 != -4435) {
            this.method47(89);
        }
        return class509.method3048(arg1 + 4434, this.field2.method3046(this.field16, var4)) && class509.method3048(arg1 + 4434, this.field2.CheckDeviceFormat(this.field16, this.field22, var4.Format, 0, 4, method28(arg0, arg2, 6)));
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZI[FBLpe;I)Lada;", line = 1207)
    public final class175 method63(int arg0, int arg1, boolean arg2, int arg3, float[] arg4, byte arg5, class636 arg6, int arg7) {
        if (arg5 > -45) {
            this.method55((byte) 84);
        }
        return null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILoda;I)V", line = 1220)
    public final void method64(int arg0, class129 arg1, int arg2) {
        class29 var4 = (class29) arg1;
        this.field27.SetStreamSource(arg2, var4.field442, arg0, var4.method270((byte) 55));
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljia;Ljia;FLjia;)Ljia;", line = 1228)
    public final class645 method65(class645 arg0, class645 arg1, float arg2, class645 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLjagdx/IDirect3DVertexShader;)V", line = 1236)
    public final void method66(byte arg0, IDirect3DVertexShader arg1) {
        this.field11 = arg1;
        this.field27.SetVertexShader(arg1);
        this.method8((byte) 96);
        if (arg0 != 60) {
            this.field27 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lnm;)V", line = 1247)
    public final void method67(class499 arg0) {
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I[Lpo;)Lnca;", line = 1250)
    public final class785 method68(int arg0, class585[] arg1) {
        return arg0 <= 76 ? (class785) null : new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!us", name = "F", descriptor = "(II)V", line = 1259)
    public final void method69(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lsea;Lup;)Lnm;", line = 1262)
    public final class499 method70(class726 arg0, class292 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "()Z", line = 1269)
    public final boolean method71() {
        return false;
    }

    @OriginalMember(owner = "client!us", name = "y", descriptor = "(B)V", line = 1278)
    public final void method72(byte arg0) {
        if (arg0 > -73) {
            this.field16 = -13;
        }
        float var2 = this.field6325 ? this.field6280 : 0.0F;
        float var3 = this.field6325 ? -this.field6241 : 0.0F;
        this.field18.SetDiffuse(this.field6276 * var2, this.field6323 * var2, this.field6281 * var2, 0.0F);
        this.field15.SetDiffuse(this.field6276 * var3, this.field6323 * var3, this.field6281 * var3, 0.0F);
        this.field10 = false;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1294)
    public final void method73(byte arg0, Canvas arg1, Object arg2) {
        int var4 = -18 % ((-arg0 - 10) / 61);
    }

    @OriginalMember(owner = "client!us", name = "E", descriptor = "(I)V", line = 1301)
    public final void method74(int arg0) {
        if (!this.field10) {
            this.field27.LightEnable(0, false);
            this.field27.LightEnable(1, false);
            this.field27.SetLight(0, this.field18);
            this.field27.SetLight(1, this.field15);
            this.field27.LightEnable(0, true);
            this.field27.LightEnable(1, true);
            this.field10 = true;
        }
        if (arg0 != -8) {
            method84(null, -60);
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(B)V", line = 1323)
    public final void method75(byte arg0) {
        int var2 = -5 % ((arg0 + 81) / 34);
        this.field27.method3052(7, this.field6303);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lei;I)I", line = 1331)
    private static final int method76(class191 arg0, int arg1) {
        if (arg1 < 76) {
            field4 = null;
        }
        if (class75.field1039 == arg0) {
            return 2;
        } else if (class269.field3180 == arg0) {
            return 4;
        } else if (class8.field135 == arg0) {
            return 26;
        } else if (class555.field7726 == arg0) {
            return 7;
        } else if (class391.field5076 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 1360)
    public final Object method77(byte arg0, Canvas arg1) {
        if (arg0 >= -44) {
            field20 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!us", name = "A", descriptor = "(I)V", line = 1370)
    public final void method78(int arg0) {
        if (arg0 != 1) {
            method84(null, -26);
        }
        this.field27.SetRenderState(60, this.field6259);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILko;)I", line = 1381)
    private static final int method79(int arg0, class531 arg1) {
        if (class140.field1751 == arg1) {
            return 2;
        } else if (class450.field6370 == arg1) {
            return 1;
        } else {
            if (arg0 != 1) {
                method76(null, -62);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!us", name = "p", descriptor = "(B)V", line = 1398)
    public final void method80(byte arg0) {
        if (this.field6292.method3844(25596)) {
            this.field6224.method1523(field5, false);
        } else {
            field5[6] = 0.0F;
            field5[4] = 0.0F;
            field5[0] = 1.0F;
            field5[1] = 0.0F;
            field5[13] = 0.0F;
            field5[15] = 1.0F;
            field5[12] = 0.0F;
            field5[2] = 0.0F;
            field5[3] = 0.0F;
            field5[7] = 0.0F;
            field5[10] = 1.0F;
            field5[9] = 0.0F;
            field5[14] = 0.0F;
            field5[11] = 0.0F;
            field5[8] = 0.0F;
            field5[5] = 1.0F;
        }
        if (arg0 <= 84) {
            this.method35(null, (byte) 114);
        }
        this.field27.SetTransform(2, field5);
    }

    @OriginalMember(owner = "client!us", name = "I", descriptor = "()I", line = 1435)
    public final int method81() {
        return 0;
    }

    @OriginalMember(owner = "client!us", name = "S", descriptor = "(I)V", line = 1450)
    public final void method82(int arg0) {
        for (int var2 = 0; var2 < this.field6272; var2++) {
            this.field27.SetSamplerState(var2, 7, 0);
            this.field27.SetSamplerState(var2, 6, 2);
            this.field27.SetSamplerState(var2, 5, 2);
            this.field27.SetSamplerState(var2, 1, 1);
            this.field27.SetSamplerState(var2, 2, 1);
            this.field9[var2] = class140.field1751;
            this.field7[var2] = this.field24[var2] = true;
            this.field28[var2] = false;
            this.field6[var2] = 0;
        }
        this.field27.SetTextureStageState(0, 6, 1);
        this.field27.SetRenderState(9, 2);
        this.field27.SetRenderState(23, 4);
        this.field27.SetRenderState(25, 5);
        this.field27.SetRenderState(24, 0);
        this.field27.SetRenderState(22, 2);
        this.field27.SetRenderState(147, 1);
        this.field27.SetRenderState(145, 1);
        this.field27.method3062(38, 0.95F);
        this.field27.SetRenderState(140, 3);
        this.field18.SetType(3);
        this.field15.SetType(3);
        this.field25.SetType(1);
        this.field10 = false;
        super.method82(arg0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIZZ[I)Lada;", line = 1486)
    public final class175 method83(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int[] arg6) {
        return arg4 ? (class175) null : new class295(this, arg0, arg2, arg5, arg6, arg1, arg3);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lkja;I)I", line = 1496)
    private static final int method84(class686 arg0, int arg1) {
        if (class674.field9244 == arg0) {
            return 2;
        } else if (class161.field1985 == arg0) {
            return 3;
        } else if (class105.field1347 == arg0) {
            return 1;
        } else if (class67.field920 == arg0) {
            return 4;
        } else if (class657.field9051 == arg0) {
            return 6;
        } else if (class140.field1737 == arg0) {
            return 5;
        } else {
            if (arg1 != 2) {
                method76(null, 5);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLnca;)V", line = 1531)
    public final void method85(byte arg0, class785 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field27.SetVertexDeclaration(var3.field4298);
        if (arg0 != 96) {
            this.field18 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "j", descriptor = "(Z)V", line = 1542)
    public final void method86(boolean arg0) {
        if (!arg0) {
            this.field24 = null;
        }
        this.field18.SetDirection(-this.field6283[0], -this.field6283[1], -this.field6283[2]);
        this.field15.SetDirection(-this.field6233[0], -this.field6233[1], -this.field6233[2]);
        this.field10 = false;
    }

    @OriginalMember(owner = "client!us", name = "na", descriptor = "(IIII)[I", line = 1558)
    public final int[] method87(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field27.method3054(0);
        IDirect3DSurface var7 = this.field27.method3056(arg2, arg3, 21, 0, 0, true);
        if (class509.method3048(-1, this.field27.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class509.method3048(-1, var7.LockRect(0, 0, arg2, arg3, 16, this.field19))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field19.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field19.method3071(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field19.method3071(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method4003(true);
        var7.method4003(true);
        return var5;
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(B)V", line = 1599)
    public final void method88(byte arg0) {
        this.field27.method3052(174, this.field6351);
        int var2 = -78 / ((-arg0 - 23) / 40);
    }

    @OriginalMember(owner = "client!us", name = "bb", descriptor = "(I)Z", line = 1610)
    private final boolean method89(int arg0) {
        int var2 = 40 / ((-arg0 - 71) / 33);
        int var3 = this.field27.TestCooperativeLevel();
        if (var3 == 0 || var3 == -2005530519) {
            class177 var4 = (class177) this.field6038;
            this.method2702(4699);
            var4.method1206(true);
            this.field14.BackBufferHeight = 0;
            this.field14.BackBufferWidth = 0;
            if (method17(this.field16, this.field6256, (byte) 107, this.field14, this.field2, this.field22)) {
                int var5 = this.field27.Reset(this.field14);
                if (class509.method3048(-1, var5)) {
                    var4.method1205(this.field27.method3055(), (byte) 21, this.field27.method3065(0));
                    this.method2704(0);
                    this.method82(4615);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!us", name = "P", descriptor = "(I)V", line = 1647)
    public final void method90(int arg0) {
        int var2 = -33 % ((arg0 - 20) / 48);
        this.field27.method3052(137, this.field6239 && !this.field6249);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZLmga;)V", line = 1667)
    public final void method91(int arg0, int arg1, boolean arg2, class738 arg3) {
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg2) {
            var7 |= 0x10;
        }
        if (arg0 != 461166232) {
            this.method23(-13);
        }
        this.field27.SetTextureStageState(this.field6261, var6, method45(arg3, false) | var7);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1702)
    public final void method92(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class677 {
        this.method5(arg2, arg3);
    }
}
