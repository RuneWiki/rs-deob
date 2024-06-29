import jaclib.peer.class419;
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
import jagdx.class737;
import jagdx.class738;
import jagdx.class739;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class585 extends class38 {

    @OriginalMember(owner = "client!hb", name = "Ug", descriptor = "I")
    private int field8264 = 0;

    @OriginalMember(owner = "client!hb", name = "dh", descriptor = "Z")
    private boolean field8273 = false;

    @OriginalMember(owner = "client!hb", name = "ih", descriptor = "Llga;")
    private class725 field8278;

    @OriginalMember(owner = "client!hb", name = "Wg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8266;

    @OriginalMember(owner = "client!hb", name = "bh", descriptor = "Ljaclib/peer/k;")
    public class419 field8271;

    @OriginalMember(owner = "client!hb", name = "eh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8274;

    @OriginalMember(owner = "client!hb", name = "Xg", descriptor = "I")
    private int field8267;

    @OriginalMember(owner = "client!hb", name = "lh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8281;

    @OriginalMember(owner = "client!hb", name = "Ng", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8257;

    @OriginalMember(owner = "client!hb", name = "Rg", descriptor = "I")
    private int field8261;

    @OriginalMember(owner = "client!hb", name = "fh", descriptor = "Ljagdx/D3DLIGHT;")
    private class738 field8275;

    @OriginalMember(owner = "client!hb", name = "jh", descriptor = "Ljagdx/D3DLIGHT;")
    private class738 field8279;

    @OriginalMember(owner = "client!hb", name = "mh", descriptor = "Ljagdx/D3DLIGHT;")
    private class738 field8282;

    @OriginalMember(owner = "client!hb", name = "Qg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8260;

    @OriginalMember(owner = "client!hb", name = "Og", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8258;

    @OriginalMember(owner = "client!hb", name = "Pg", descriptor = "Z")
    public boolean field8259;

    @OriginalMember(owner = "client!hb", name = "ah", descriptor = "Z")
    public boolean field8270;

    @OriginalMember(owner = "client!hb", name = "Zg", descriptor = "Z")
    public boolean field8269;

    @OriginalMember(owner = "client!hb", name = "kh", descriptor = "[Lgca;")
    private class206[] field8280;

    @OriginalMember(owner = "client!hb", name = "hh", descriptor = "[Z")
    private boolean[] field8277;

    @OriginalMember(owner = "client!hb", name = "gh", descriptor = "[Z")
    private boolean[] field8276;

    @OriginalMember(owner = "client!hb", name = "Sg", descriptor = "[Z")
    private boolean[] field8262;

    @OriginalMember(owner = "client!hb", name = "Tg", descriptor = "[Z")
    private boolean[] field8263;

    @OriginalMember(owner = "client!hb", name = "Mg", descriptor = "[I")
    private int[] field8256;

    @OriginalMember(owner = "client!hb", name = "Yg", descriptor = "[F")
    private static float[] field8268 = new float[16];

    @OriginalMember(owner = "client!hb", name = "Lg", descriptor = "[I")
    private static int[] field8255 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!hb", name = "Vg", descriptor = "[I")
    private static int[] field8265 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!hb", name = "ch", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8272;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lhu;Lwm;)Lpea;", line = 4)
    public final class456 method1344(class224 arg0, class28 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(FFF)V", line = 10)
    public final void method1268(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "(I)V", line = 14)
    public final void method255(int arg0) {
        if (arg0 >= -76) {
            this.method349(-16, 22, null, -4, null, 10, -110, true);
        }
        int var2 = this.field8277[this.field617] ? method3369(this.field625[this.field617], false) : 1;
        this.field8281.SetTextureStageState(this.field617, 4, var2);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 27)
    public final void method214(int arg0) {
        this.field8281.SetViewport(this.field624, this.field655, this.field378, this.field462, 0.0F, 1.0F);
        int var2 = 22 % ((arg0 - 9) / 40);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILlw;I[BIIZ)Lrm;", line = 36)
    public final class90 method349(int arg0, int arg1, class233 arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7) {
        if (arg1 != -1) {
            this.method422((byte) -93, null, null);
        }
        return new class396(this, arg2, arg3, arg6, arg7, arg4, arg0, arg5);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(ZI)Lfb;", line = 48)
    public final class669 method293(boolean arg0, int arg1) {
        if (arg1 != 6) {
            this.field8275 = null;
        }
        return new class697(this, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILlw;Lal;)Z", line = 59)
    public final boolean method430(int arg0, class233 arg1, class121 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 <= 18) {
            return false;
        } else {
            return class737.method4132(91, this.field8274.method4137(this.field8261, var4)) && class737.method4132(112, this.field8274.CheckDeviceFormat(this.field8261, this.field8267, var4.Format, 0, 4, method3377(arg1, (byte) -2, arg2)));
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 70)
    public final void method1272(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class556 {
        this.method1261(arg2, arg3);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V", line = 76)
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILwe;)I", line = 79)
    private static final int method3368(int arg0, class357 arg1) {
        if (class407.field6031 == arg1) {
            return 1;
        } else if (class673.field9518 == arg1) {
            return 2;
        } else if (class127.field1976 == arg1) {
            return 3;
        } else if (class707.field9971 == arg1) {
            return 4;
        } else if (class243.field3928 == arg1) {
            return 256;
        } else {
            if (arg0 <= 117) {
                field8268 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "(B)V", line = 109)
    public final void method362(byte arg0) {
        if (arg0 != -46) {
            this.field8266 = null;
        }
        this.method372(0);
        this.method334(0);
    }

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "(I)V", line = 122)
    public final void method372(int arg0) {
        float var2 = this.field671 ? this.field632 : 0.0F;
        float var3 = this.field671 ? -this.field620 : 0.0F;
        this.field8275.SetDiffuse(this.field626 * var2, this.field593 * var2, this.field661 * var2, (float) arg0);
        this.field8279.SetDiffuse(this.field626 * var3, this.field593 * var3, this.field661 * var3, 0.0F);
        this.field8273 = false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lht;Z)I", line = 133)
    private static final int method3369(class393 arg0, boolean arg1) {
        if (class750.field10454 == arg0) {
            return 2;
        } else if (class333.field4884 == arg0) {
            return 4;
        } else if (class107.field1555 == arg0) {
            return 26;
        } else if (class200.field3408 == arg0) {
            return 7;
        } else if (class570.field8091 == arg0) {
            return 10;
        } else {
            if (arg1) {
                method3375(null, (byte) 24);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lri;I)I", line = 163)
    private static final int method3370(class342 arg0, int arg1) {
        if (arg1 != 4229) {
            field8255 = null;
        }
        if (class338.field4931 == arg0) {
            return 2;
        } else if (class468.field6809 == arg0) {
            return 3;
        } else if (class730.field10242 == arg0) {
            return 1;
        } else if (class386.field5775 == arg0) {
            return 4;
        } else if (class255.field4027 == arg0) {
            return 6;
        } else if (class358.field5430 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "(B)V", line = 196)
    public final void method346(byte arg0) {
        this.field8275.SetAmbient(this.field651 * this.field626, this.field651 * this.field593, this.field661 * this.field651, 0.0F);
        this.field8273 = false;
        if (arg0 != -50) {
            this.field8274 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Lhu;", line = 207)
    public final class224 method1288(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(IZ)V", line = 214)
    public final void method396(int arg0, boolean arg1) {
        this.field8281.method4125(161, arg1);
        if (arg0 >= -38) {
            this.field8262 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILmq;)I", line = 224)
    private static final int method3371(int arg0, class592 arg1) {
        if (class388.field5817 == arg1) {
            return 2;
        } else if (class580.field8210 == arg1) {
            return 0;
        } else if (class493.field7145 == arg1) {
            return 1;
        } else if (class327.field4819 == arg1) {
            return 3;
        } else {
            if (arg0 < 34) {
                method3377(null, (byte) 85, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "(I)V", line = 250)
    public final void method341(int arg0) {
        this.field8275.SetDirection(-this.field642[0], -this.field642[1], -this.field642[2]);
        if (arg0 != 29069) {
            field8268 = null;
        }
        this.field8279.SetDirection(-this.field573[0], -this.field573[1], -this.field573[2]);
        this.field8273 = false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lbl;)Lfk;", line = 262)
    public final class313 method219(int arg0, class468[] arg1) {
        return arg0 == 2 ? new dxVertexLayout(this, arg1) : (class313) null;
    }

    @OriginalMember(owner = "client!hb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lla;Ljava/lang/Integer;)Lha;", line = 273)
    public static final class544 createToolkit(Canvas arg0, class267 arg1, class422 arg2, Integer arg3) {
        class585 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class419 var7 = new class419();
            IDirect3D var8 = IDirect3D.method4134(-2147483616, var7);
            D3DCAPS var9 = var8.method4135(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3378(0, var5, var10, arg3, var6, var8)) {
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
                    var13 = var8.method4136(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class739 var17) {
                    var13 = var8.method4136(var5, var6, arg0, var11 | 0x20, var10);
                }
                class725 var15 = new class725(var13.method4131(0), var13.method4130());
                var4 = new class585(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method353(-95);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method248();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lhl;I)V", line = 373)
    public final void method3372(class396 arg0, int arg1) {
        this.method3379(false, arg0);
        if (arg0.field5906 != this.field8263[this.field617]) {
            this.field8281.SetSamplerState(this.field617, 1, arg0.field5906 ? 1 : 3);
            this.field8263[this.field617] = arg0.field5906;
        }
        if (arg1 != -5188) {
            this.field8274 = null;
        }
        if (arg0.field5905 != this.field8276[this.field617]) {
            this.field8281.SetSamplerState(this.field617, 2, arg0.field5905 ? 1 : 3);
            this.field8276[this.field617] = arg0.field5905;
        }
    }

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "(Z)V", line = 395)
    public final void method319(boolean arg0) {
        this.field8281.method4125(28, this.field657 && this.field665 && this.field636 >= 0);
        if (!arg0) {
            this.method1274();
        }
    }

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "(I)V", line = 406)
    public final void method425(int arg0) {
        if (arg0 <= 0) {
            this.method284((byte) 11);
        }
        int var2 = this.field8277[this.field617] ? method3369(this.field673[this.field617], false) : 1;
        this.field8281.SetTextureStageState(this.field617, 1, var2);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 417)
    public final void method1258() {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BBLlw;III)Luc;", line = 420)
    public final class123 method408(byte[] arg0, byte arg1, class233 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -91) {
            this.field8275 = null;
        }
        return new class283(this, arg2, arg4, arg3, arg5, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILri;ZI)V", line = 433)
    public final void method403(int arg0, class342 arg1, boolean arg2, int arg3) {
        this.field8281.DrawPrimitive(method3370(arg1, 4229), arg3, arg0);
        if (arg2) {
            this.method378(-103);
        }
    }

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "()V", line = 446)
    public final void method1338() {
        IDirect3DEventQuery var1 = this.field8281.method4123();
        if (class737.method4132(-80, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2604(false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLjagdx/IDirect3DPixelShader;)V", line = 470)
    public final void method3373(boolean arg0, IDirect3DPixelShader arg1) {
        this.field8281.SetPixelShader(arg1);
        if (arg0) {
            this.field8273 = false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILal;Llw;)Z", line = 482)
    public final boolean method399(int arg0, class121 arg1, class233 arg2) {
        if (arg0 != 18154) {
            this.field8262 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class737.method4132(-125, this.field8274.method4137(this.field8261, var4)) && class737.method4132(110, this.field8274.CheckDeviceFormat(this.field8261, this.field8267, var4.Format, 0, 3, method3377(arg2, (byte) -2, arg1)));
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([[IBIZ)Lqn;", line = 495)
    public final class295 method363(int[][] arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 > -97) {
            this.method1288(68, -12);
        }
        return new class320(this, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lfb;II)V", line = 507)
    public final void method327(class669 arg0, int arg1, int arg2) {
        class697 var4 = (class697) arg0;
        this.field8281.SetStreamSource(arg2, var4.field9876, arg1, var4.method3883(115));
    }

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "(I)V", line = 515)
    public final void method378(int arg0) {
        this.field8281.method4125(7, this.field663);
        if (arg0 >= -33) {
            this.field8264 = -90;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lmq;ZII)V", line = 527)
    public final void method369(class592 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 >= -44) {
            this.field8279 = null;
        }
        int var5 = 0;
        byte var7;
        if (arg2 == 1) {
            var7 = 6;
        } else if (arg2 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1) {
            var5 |= 0x10;
        }
        this.field8281.SetTextureStageState(this.field617, var7, method3371(72, arg0) | var5);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;Z)V", line = 571)
    public final void method3374(IDirect3DVertexShader arg0, boolean arg1) {
        this.field8272 = arg0;
        this.field8281.SetVertexShader(arg0);
        if (!arg1) {
            field8265 = null;
        }
        this.method284((byte) -32);
    }

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "(I)V", line = 586)
    public final void method334(int arg0) {
        if (!this.field8273) {
            this.field8281.LightEnable(0, false);
            this.field8281.LightEnable(1, false);
            this.field8281.SetLight(0, this.field8275);
            this.field8281.SetLight(1, this.field8279);
            this.field8281.LightEnable(0, true);
            this.field8281.LightEnable(1, true);
            this.field8273 = true;
        }
        if (arg0 != 0) {
            method3375(null, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILoq;ILri;I)V", line = 611)
    public final void method289(int arg0, int arg1, int arg2, class743 arg3, int arg4, class342 arg5, int arg6) {
        this.field8281.SetIndices(((class361) arg3).field5463);
        this.field8281.DrawIndexedPrimitive(method3370(arg5, 4229), arg6, arg2, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "na", descriptor = "(IIII)[I", line = 628)
    public final int[] method1262(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8281.method4115(0);
        IDirect3DSurface var7 = this.field8281.method4114(arg2, arg3, 21, 0, 0, true);
        if (class737.method4132(110, this.field8281.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class737.method4132(-34, var7.LockRect(0, 0, arg2, arg3, 16, this.field8260))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8260.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field8260.method4111(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8260.method4111(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2604(false);
        var7.method2604(false);
        return var5;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 666)
    public final synchronized void method261(int arg0) {
        this.field8271.method2594(12002);
        super.method261(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 675)
    public final Object method324(Canvas arg0, byte arg1) {
        int var3 = 107 / ((arg1 + 33) / 54);
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "ya", descriptor = "()V", line = 683)
    public final void method1287() {
        this.method394(13119, true);
        this.field8281.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpea;)V", line = 690)
    public final void method1340(class456 arg0) {
    }

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "()V", line = 695)
    public final void method1274() {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lgca;B)I", line = 699)
    private static final int method3375(class206 arg0, byte arg1) {
        if (class397.field5910 == arg0) {
            return 2;
        } else if (class70.field1080 == arg0) {
            return 1;
        } else {
            if (arg1 <= 70) {
                method3377(null, (byte) 3, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 717)
    public final void method340(Object arg0, int arg1, Canvas arg2) {
        if (this.field391 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field8281.EndScene();
                this.method3380(arg1 - 111);
                this.field8281.BeginScene();
            }
        }
        if (arg1 != 5) {
            method3368(45, null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/k;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Llga;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lla;I)V", line = 744)
    private class585(int arg0, int arg1, Canvas arg2, class419 arg3, IDirect3D arg4, IDirect3DDevice arg5, class725 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class267 arg9, class422 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field8278 = arg6;
            this.field8266 = arg8;
            this.field8271 = arg3;
            this.field8274 = arg4;
            this.field8267 = arg1;
            this.field8281 = arg5;
            this.field8257 = arg7;
            this.field8261 = arg0;
            this.field8275 = new class738(this.field8271);
            this.field8279 = new class738(this.field8271);
            this.field8282 = new class738(this.field8271);
            this.field8260 = new PixelBuffer(this.field8271);
            this.field8258 = new GeometryBuffer(this.field8271);
            new GeometryBuffer(this.field8271);
            this.field8259 = (this.field8266.TextureCaps & 0x2) == 0;
            this.field8270 = (this.field8266.TextureCaps & 0x10000) != 0;
            this.field597 = this.field8266.MaxSimultaneousTextures;
            this.field579 = this.field8266.MaxActiveLights > 0 ? this.field8266.MaxActiveLights : 8;
            this.field583 = (this.field8266.TextureCaps & 0x800) != 0;
            this.field8269 = (this.field8266.TextureCaps & 0x4000) != 0;
            this.field574 = (this.field8266.TextureCaps & 0x2000) != 0;
            this.field619 = this.field577 > 0 || this.field8274.CheckDeviceMultiSampleType(this.field8261, this.field8267, this.field8257.BackBufferFormat, true, 2) == 0;
            this.field8280 = new class206[this.field597];
            this.field8277 = new boolean[this.field597];
            this.field8276 = new boolean[this.field597];
            this.field8262 = new boolean[this.field597];
            this.field8263 = new boolean[this.field597];
            this.field8256 = new int[this.field597];
            this.field8281.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method3190((byte) 101);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V", line = 792)
    public final void method276(byte arg0) {
        int var2 = -78 / ((arg0 + 8) / 52);
        this.field8281.method4125(14, this.field598 && this.field604);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILmq;ZZI)V", line = 812)
    public final void method338(int arg0, class592 arg1, boolean arg2, boolean arg3, int arg4) {
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        if (arg4 != 31181) {
            this.field8267 = 85;
        }
        int var8 = 0;
        if (arg3) {
            var8 |= 0x20;
        }
        if (arg2) {
            var8 |= 0x10;
        }
        this.field8281.SetTextureStageState(this.field617, var7, method3371(35, arg1) | var8);
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "()V", line = 849)
    public final void method1265() {
    }

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "(B)V", line = 852)
    public final void method358(byte arg0) {
        this.field8281.method4125(137, this.field584 && !this.field639);
        if (arg0 != -21) {
            method3368(-99, null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "(I)V", line = 862)
    public final void method412(int arg0) {
        if (arg0 != 15) {
            return;
        }
        int var2;
        for (var2 = 0; var2 < this.field578; var2++) {
            class759 var3 = this.field588[var2];
            int var4 = var2 + 2;
            int var5 = var3.method4227(false);
            float var6 = var3.method4226(5) / 255.0F;
            this.field8282.SetPosition((float) var3.method4228(arg0 - 126), (float) var3.method4221((byte) -7), (float) var3.method4223((byte) -16));
            this.field8282.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8282.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method4224((byte) 127) * var3.method4224((byte) 127)));
            this.field8282.SetRange((float) var3.method4224((byte) 127));
            this.field8281.SetLight(var4, this.field8282);
            this.field8281.LightEnable(var4, true);
        }
        while (var2 < this.field608) {
            this.field8281.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method412(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(B)V", line = 905)
    public final void method284(byte arg0) {
        if (this.field8272 == null && this.field613[this.field617] != class243.field3916) {
            if (this.field613[this.field617] == class673.field9518) {
                this.field8281.SetTransform(this.field617 + 16, this.field616[this.field617].method2178((byte) 43, field8268));
            } else {
                this.field8281.SetTransform(this.field617 + 16, this.field616[this.field617].method2194((byte) -121, field8268));
            }
            int var2 = method3368(127, this.field613[this.field617]);
            if (this.field8256[this.field617] != var2) {
                this.field8281.SetTextureStageState(this.field617, 24, var2);
                this.field8256[this.field617] = var2;
            }
        } else {
            this.field8281.SetTextureStageState(this.field617, 24, 0);
            this.field8256[this.field617] = 0;
        }
        if (arg0 >= -18) {
            this.method1292();
        }
    }

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "(II)V", line = 936)
    public final void method1290(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llw;IILal;I)Lrm;", line = 939)
    public final class90 method417(class233 arg0, int arg1, int arg2, class121 arg3, int arg4) {
        if (arg1 != 3) {
            this.method364(-12);
        }
        return new class396(this, arg0, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "(I)V", line = 950)
    public final void method307(int arg0) {
        this.field8281.SetTransform(3, this.field586);
        if (arg0 != -1) {
            this.method333(true, null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILfk;)V", line = 965)
    public final void method330(int arg0, class313 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 == 19661) {
            this.field8281.SetVertexDeclaration(var3.field8589);
        }
    }

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "(I)V", line = 977)
    public final void method286(int arg0) {
        if (this.field605.method115(0)) {
            this.field570.method2194((byte) -127, field8268);
        } else {
            field8268[10] = 1.0F;
            field8268[11] = 0.0F;
            field8268[1] = 0.0F;
            field8268[2] = 0.0F;
            field8268[5] = 1.0F;
            field8268[7] = 0.0F;
            field8268[15] = 1.0F;
            field8268[12] = 0.0F;
            field8268[0] = 1.0F;
            field8268[3] = 0.0F;
            field8268[4] = 0.0F;
            field8268[14] = 0.0F;
            field8268[6] = 0.0F;
            field8268[13] = 0.0F;
            field8268[8] = 0.0F;
            field8268[9] = 0.0F;
        }
        this.field8281.SetTransform(2, field8268);
        if (arg0 < 63) {
            this.method369(null, false, -45, -102);
        }
    }

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "(B)V", line = 1013)
    public final void method357(byte arg0) {
        this.field8281.method4125(27, this.field650);
        if (arg0 >= -38) {
            field8265 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;", line = 1023)
    public final class72 method1242(class72 arg0, class72 arg1, float arg2, class72 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "()V", line = 1029)
    public final void method1285() {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([FIZILlw;III)Lrm;", line = 1033)
    public final class90 method415(float[] arg0, int arg1, boolean arg2, int arg3, class233 arg4, int arg5, int arg6, int arg7) {
        return arg3 == 10 ? null : (class90) null;
    }

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "(I)V", line = 1044)
    public final void method359(int arg0) {
        this.field8281.SetScissorRect(this.field624 + this.field591, this.field655 - -this.field614, this.field607, this.field611);
        if (arg0 != -8) {
            this.field8256 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V", line = 1058)
    public final void method271(byte arg0) {
        if (this.field551) {
            field8268[13] = 0.0F;
            field8268[2] = 0.0F;
            field8268[15] = 1.0F;
            field8268[6] = 0.0F;
            field8268[7] = 0.0F;
            field8268[1] = 0.0F;
            field8268[11] = 0.0F;
            field8268[5] = 1.0F;
            field8268[4] = 0.0F;
            field8268[8] = 0.0F;
            field8268[3] = 0.0F;
            field8268[9] = 0.0F;
            field8268[0] = 1.0F;
            field8268[14] = 0.0F;
            field8268[12] = 0.0F;
            field8268[10] = 1.0F;
        } else {
            this.field547.method2194((byte) 57, field8268);
        }
        if (arg0 != -98) {
            this.method241(-71, -68);
        }
        this.field8281.SetTransform(256, field8268);
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(II)Lwm;", line = 1094)
    public final class28 method1276(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLqg;)V", line = 1104)
    public final void method333(boolean arg0, class266 arg1) {
        int var3 = 0;
        if (!arg0) {
            return;
        }
        if (class547.field7814 == arg1) {
            var3 = 65536;
        } else if (class527.field7583 == arg1) {
            var3 = 131072;
        } else if (class544.field7759 == arg1) {
            var3 = 196608;
        }
        this.field8281.SetTextureStageState(this.field617, 11, var3 | this.field617);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)V", line = 1126)
    public final void method1261(int arg0, int arg1) throws class556 {
        this.field8281.EndScene();
        if (this.field8278.method3998((byte) 53)) {
            this.field8264 = 0;
            if (class737.method4133(this.field8278.method3999(31748, 0), 4456)) {
                this.method3380(-85);
            }
        } else if (++this.field8264 <= 50) {
            this.method3380(-31);
        } else {
            throw new class556();
        }
        this.field8281.BeginScene();
    }

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "(I)V", line = 1151)
    public final void method347(int arg0) {
        if (class560.field7946 == this.field645) {
            this.field8281.SetRenderState(19, 5);
            this.field8281.SetRenderState(20, 6);
        } else if (class682.field9654 == this.field645) {
            this.field8281.SetRenderState(19, 2);
            this.field8281.SetRenderState(20, 2);
        } else if (class182.field3072 == this.field645) {
            this.field8281.SetRenderState(19, 9);
            this.field8281.SetRenderState(20, 2);
        }
        if (arg0 != 8) {
            this.field8276 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIID)V", line = 1180)
    public final void method1278(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 1185)
    public final void method1301(boolean arg0) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1188)
    public final void method422(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 > -27) {
            this.field8279 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "(I)F", line = 1197)
    public final float method325(int arg0) {
        if (arg0 != 5484) {
            this.method347(-106);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "()Z", line = 1209)
    public final boolean method1292() {
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILtfa;)V", line = 1219)
    public final void method3376(int arg0, class283 arg1) {
        if (arg0 > -90) {
            this.method357((byte) 76);
        }
        this.method3379(false, arg1);
        if (!this.field8263[this.field617]) {
            this.field8281.SetSamplerState(this.field617, 1, 1);
            this.field8263[this.field617] = true;
        }
        if (!this.field8276[this.field617]) {
            this.field8281.SetSamplerState(this.field617, 2, 1);
            this.field8276[this.field617] = true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "(I)V", line = 1243)
    public final void method397(int arg0) {
        if (arg0 != 0) {
            this.field8266 = null;
        }
        this.field8281.method4125(174, this.field696);
    }

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "(I)V", line = 1253)
    public final void method304(int arg0) {
        if (this.field8277[this.field617]) {
            this.field8277[this.field617] = false;
            this.field8281.SetTexture(this.field617, null);
            this.method255(-84);
            this.method425(19);
        }
        if (arg0 != 26467) {
            this.method329((byte) 27);
        }
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(B)V", line = 1273)
    public final void method281(byte arg0) {
        for (int var2 = 0; var2 < this.field597; var2++) {
            this.field8281.SetSamplerState(var2, 7, 0);
            this.field8281.SetSamplerState(var2, 6, 2);
            this.field8281.SetSamplerState(var2, 5, 2);
            this.field8281.SetSamplerState(var2, 1, 1);
            this.field8281.SetSamplerState(var2, 2, 1);
            this.field8280[var2] = class397.field5910;
            this.field8263[var2] = this.field8276[var2] = true;
            this.field8262[var2] = false;
            this.field8256[var2] = 0;
        }
        this.field8281.SetTextureStageState(0, 6, 1);
        this.field8281.SetRenderState(9, 2);
        this.field8281.SetRenderState(23, 4);
        this.field8281.SetRenderState(25, 5);
        this.field8281.SetRenderState(24, 0);
        this.field8281.SetRenderState(22, 2);
        this.field8281.SetRenderState(147, 1);
        this.field8281.SetRenderState(145, 1);
        this.field8281.method4128(38, 0.95F);
        this.field8281.SetRenderState(140, 3);
        this.field8275.SetType(3);
        this.field8279.SetType(3);
        this.field8282.SetType(1);
        this.field8273 = false;
        super.method281(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "()I", line = 1309)
    public final int method1273() {
        return 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llw;BLal;)I", line = 1316)
    public static final int method3377(class233 arg0, byte arg1, class121 arg2) {
        if (arg1 != -2) {
            method3371(113, null);
        }
        if (class121.field1859 == arg2) {
            if (class121.field1864 == arg0) {
                return 22;
            }
            if (class238.field3830 == arg0) {
                return 21;
            }
            if (class215.field3556 == arg0) {
                return 28;
            }
            if (class248.field3973 == arg0) {
                return 50;
            }
            if (class13.field129 == arg0) {
                return 51;
            }
            if (class651.field9246 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjagdx/D3DPRESENT_PARAMETERS;IILjagdx/IDirect3D;)Z", line = 1355)
    private static final boolean method3378(int arg0, int arg1, D3DPRESENT_PARAMETERS arg2, int arg3, int arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class737.method4133(arg5.method4137(arg1, var9), arg0 + 4456)) {
                return false;
            }
            label80: while (arg3 >= 0) {
                if (arg3 != 1) {
                    var8 = arg3;
                    for (int var10 = 0; var10 < field8265.length; var10++) {
                        if (arg5.CheckDeviceType(arg1, arg4, var9.Format, field8265[var10], true) == 0 && arg5.CheckDeviceFormat(arg1, arg4, var9.Format, 1, 1, field8265[var10]) == 0 && (arg3 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg4, field8265[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field8255.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg1, arg4, var9.Format, 2, 1, field8255[var11]) == 0 && arg5.CheckDepthStencilMatch(arg1, arg4, var9.Format, field8265[var10], field8255[var11]) == 0 && (arg3 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg4, field8255[var10], true, var8) == 0)) {
                                    var7 = field8265[var10];
                                    var6 = field8255[var11];
                                    break label80;
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
            arg2.MultiSampleQuality = arg0;
            arg2.MultiSampleType = var8;
            arg2.AutoDepthStencilFormat = var6;
            arg2.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "(Z)V", line = 1457)
    public final void method318(boolean arg0) {
        if (!arg0) {
            this.field8281.SetRenderState(60, this.field600);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 1469)
    public final void method248() {
        this.field8271.method2596(408);
        super.method248();
    }

    @OriginalMember(owner = "client!hb", name = "GA", descriptor = "(I)V", line = 1483)
    public final void method1328(int arg0) {
        this.field8281.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "()Z", line = 1492)
    public final boolean method1237() {
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[IIIZ)Lrm;", line = 1502)
    public final class90 method407(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 <= 55) {
            this.method3376(-61, null);
        }
        return new class396(this, arg4, arg1, arg6, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLgw;)V", line = 1512)
    public final void method3379(boolean arg0, class687 arg1) {
        this.field8281.SetTexture(this.field617, arg1.method1860((byte) -66));
        if (arg0) {
            this.method1290(-16, -84);
        }
        if (this.field8280[this.field617] != arg1.field9694) {
            int var3 = method3375(arg1.field9694, (byte) 111);
            this.field8281.SetSamplerState(this.field617, 6, var3);
            this.field8281.SetSamplerState(this.field617, 5, var3);
            this.field8280[this.field617] = arg1.field9694;
            if (this.field8262[this.field617] != arg1.field9697) {
                this.field8281.SetSamplerState(this.field617, 7, arg1.field9697 ? method3375(arg1.field9694, (byte) 73) : 0);
                this.field8262[this.field617] = arg1.field9697;
            }
        } else if (this.field8262[this.field617] != arg1.field9697) {
            this.field8281.SetSamplerState(this.field617, 7, arg1.field9697 ? method3375(arg1.field9694, (byte) 97) : 0);
            this.field8262[this.field617] = arg1.field9697;
        }
        if (!this.field8277[this.field617]) {
            this.field8277[this.field617] = true;
            this.method255(-100);
            this.method425(61);
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(IZ)Loq;", line = 1552)
    public final class743 method428(int arg0, boolean arg1) {
        if (arg0 > -107) {
            method3371(88, null);
        }
        return new class361(this, class121.field1860, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "(I)V", line = 1562)
    public final void method364(int arg0) {
        this.field8281.method4125(15, this.field652);
        if (arg0 != 23698) {
            this.field8258 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "(I)Z", line = 1573)
    private final boolean method3380(int arg0) {
        int var2 = this.field8281.TestCooperativeLevel();
        if (arg0 >= -6) {
            this.method364(122);
        }
        if (var2 == 0 || var2 == -2005530519) {
            class725 var3 = (class725) this.field520;
            this.method393((byte) 78);
            var3.method4000((byte) -127);
            this.field8257.BackBufferWidth = 0;
            this.field8257.BackBufferHeight = 0;
            if (method3378(0, this.field8261, this.field8257, this.field577, this.field8267, this.field8274)) {
                int var4 = this.field8281.Reset(this.field8257);
                if (class737.method4132(98, var4)) {
                    var3.method4001(this.field8281.method4130(), this.field8281.method4131(0), 22993);
                    this.method382((byte) -108);
                    this.method281((byte) 8);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "(B)V", line = 1612)
    public final void method329(byte arg0) {
        if (arg0 != 18) {
            this.method3380(61);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 1621)
    public final void method278(Object arg0, byte arg1, Canvas arg2) {
        this.field8278 = (class725) arg0;
        if (arg1 != -16) {
            this.field8273 = true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "()Lqm;", line = 1632)
    public final class429 method1308() {
        D3DADAPTER_IDENTIFIER var1 = this.field8274.method4138(this.field8261, 0);
        return new class429(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "(I)V", line = 1640)
    public final void method311(int arg0) {
        this.field653 = (this.field581 - this.field646);
        this.field621 = this.field653 - (float) this.field636;
        if (this.field621 < (float) this.field634) {
            this.field621 = this.field634;
        }
        this.field8281.method4128(36, this.field621);
        this.field8281.method4128(37, this.field653);
        int var2 = -16 % ((arg0 + 31) / 49);
        this.field8281.SetRenderState(34, this.field618);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Loca;", line = 1657)
    public final class279 method277(int arg0, byte arg1) {
        if (arg1 != -79) {
            this.field8276 = null;
        }
        if (arg0 == 3) {
            return new class444(this, this.field418);
        } else if (arg0 == 4) {
            return new class201(this, this.field418, this.field435);
        } else if (arg0 == 8) {
            return new class39(this, this.field418, this.field435);
        } else {
            return super.method277(arg0, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "(II)V", line = 1701)
    public final void method241(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method311(-49);
        }
        this.field8281.SetTextureStageState(this.field617, 11, arg0);
    }
}
