import jaclib.peer.class422;
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
import jagdx.class740;
import jagdx.class741;
import jagdx.class742;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class386 extends class232 {

    @OriginalMember(owner = "client!kfa", name = "fh", descriptor = "Z")
    private boolean field5555 = false;

    @OriginalMember(owner = "client!kfa", name = "eh", descriptor = "I")
    private int field5554 = 0;

    @OriginalMember(owner = "client!kfa", name = "Ng", descriptor = "Ljaclib/peer/hea;")
    public class422 field5537;

    @OriginalMember(owner = "client!kfa", name = "Sg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field5542;

    @OriginalMember(owner = "client!kfa", name = "Ug", descriptor = "Lbf;")
    private class314 field5544;

    @OriginalMember(owner = "client!kfa", name = "Lg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field5535;

    @OriginalMember(owner = "client!kfa", name = "Rg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field5541;

    @OriginalMember(owner = "client!kfa", name = "Mg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field5536;

    @OriginalMember(owner = "client!kfa", name = "Xg", descriptor = "I")
    private int field5547;

    @OriginalMember(owner = "client!kfa", name = "ih", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!kfa", name = "Qg", descriptor = "Ljagdx/D3DLIGHT;")
    private class741 field5540;

    @OriginalMember(owner = "client!kfa", name = "Jg", descriptor = "Ljagdx/D3DLIGHT;")
    private class741 field5533;

    @OriginalMember(owner = "client!kfa", name = "Vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class741 field5545;

    @OriginalMember(owner = "client!kfa", name = "hh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field5557;

    @OriginalMember(owner = "client!kfa", name = "bh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field5551;

    @OriginalMember(owner = "client!kfa", name = "ah", descriptor = "Z")
    public boolean field5550;

    @OriginalMember(owner = "client!kfa", name = "Kg", descriptor = "Z")
    public boolean field5534;

    @OriginalMember(owner = "client!kfa", name = "jh", descriptor = "Z")
    public boolean field5559;

    @OriginalMember(owner = "client!kfa", name = "Yg", descriptor = "[Z")
    private boolean[] field5548;

    @OriginalMember(owner = "client!kfa", name = "Tg", descriptor = "[Z")
    private boolean[] field5543;

    @OriginalMember(owner = "client!kfa", name = "Pg", descriptor = "[Z")
    private boolean[] field5539;

    @OriginalMember(owner = "client!kfa", name = "ch", descriptor = "[I")
    private int[] field5552;

    @OriginalMember(owner = "client!kfa", name = "gh", descriptor = "[Z")
    private boolean[] field5556;

    @OriginalMember(owner = "client!kfa", name = "Og", descriptor = "[Ltha;")
    private class372[] field5538;

    @OriginalMember(owner = "client!kfa", name = "Wg", descriptor = "[I")
    private static int[] field5546 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!kfa", name = "dh", descriptor = "[I")
    private static int[] field5553 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!kfa", name = "kh", descriptor = "[F")
    private static float[] field5560 = new float[16];

    @OriginalMember(owner = "client!kfa", name = "Zg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5549;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 8)
    public final void method285(Object arg0, Canvas arg1, int arg2) {
        int var4 = -63 / ((-arg2 - 68) / 39);
    }

    @OriginalMember(owner = "client!kfa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Luu;Ljava/lang/Integer;)Lha;", line = 19)
    public static final class548 createToolkit(Canvas arg0, class270 arg1, class237 arg2, Integer arg3) {
        class386 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class422 var7 = new class422();
            IDirect3D var8 = IDirect3D.method4133(-2147483616, var7);
            D3DCAPS var9 = var8.method4130(var5, var6);
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
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2422(arg3, var8, var6, var5, 16, var10)) {
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
                    var13 = var8.method4131(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class740 var17) {
                    var13 = var8.method4131(var5, var6, arg0, var11 | 0x20, var10);
                }
                class314 var15 = new class314(var13.method4118(0), var13.method4117());
                var4 = new class386(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1538(false);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method312();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljt;Liv;I)I", line = 119)
    public static final int method2416(class38 arg0, class25 arg1, int arg2) {
        if (class38.field472 == arg0) {
            if (class218.field2855 == arg1) {
                return 22;
            }
            if (class623.field8394 == arg1) {
                return 21;
            }
            if (class401.field5747 == arg1) {
                return 28;
            }
            if (class762.field10618 == arg1) {
                return 50;
            }
            if (class718.field9995 == arg1) {
                return 51;
            }
            if (class397.field5707 == arg1) {
                return 77;
            }
        }
        if (arg2 == -775) {
            throw new IllegalArgumentException("");
        }
        return -92;
    }

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "(II)V", line = 156)
    public final void method264(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Liv;Ljt;I)Z", line = 159)
    public final boolean method288(class25 arg0, class38 arg1, int arg2) {
        if (arg2 == 12935) {
            D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
            return class742.method4137(this.field5541.method4134(this.field5547, var4), -1) && class742.method4137(this.field5541.CheckDeviceFormat(this.field5547, this.field5558, var4.Format, 0, 4, method2416(arg1, arg0, -775)), -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "ab", descriptor = "(I)F", line = 172)
    public final float method313(int arg0) {
        int var2 = -42 / ((-arg0 - 44) / 34);
        return -0.5F;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIII)V", line = 179)
    public final void method284(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZB)Ljs;", line = 182)
    public final class174 method294(boolean arg0, byte arg1) {
        return arg1 > -49 ? (class174) null : new class354(this, class38.field473, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILwi;)I", line = 193)
    private static final int method2417(int arg0, class202 arg1) {
        int var2 = 90 % ((-arg0 - 10) / 50);
        if (class348.field4949 == arg1) {
            return 2;
        } else if (class542.field7532 == arg1) {
            return 3;
        } else if (class639.field8570 == arg1) {
            return 1;
        } else if (class542.field7529 == arg1) {
            return 4;
        } else if (class151.field2082 == arg1) {
            return 6;
        } else if (class343.field4882 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kfa", name = "Q", descriptor = "(I)V", line = 226)
    public final void method270(int arg0) {
        int var2 = -114 % ((arg0 - 26) / 48);
        this.field5542.method4127(14, this.field3358 && this.field3349);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ltha;Z)I", line = 234)
    private static final int method2418(class372 arg0, boolean arg1) {
        if (class432.field6028 == arg0) {
            return 2;
        } else if (class352.field5092 == arg0) {
            return 1;
        } else {
            if (arg1) {
                createToolkit(null, null, null, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "I", descriptor = "()I", line = 252)
    public final int method277() {
        return 0;
    }

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "()V", line = 258)
    public final void method281() {
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILrv;)V", line = 263)
    public final void method314(int arg0, int arg1, class440 arg2) {
        int var4 = -96 % ((arg0 + 23) / 44);
        class426 var5 = (class426) arg2;
        this.field5542.SetStreamSource(arg1, var5.field5967, 0, var5.method2647(11215));
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(II)Llh;", line = 272)
    public final class208 method317(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZILip;Z)V", line = 279)
    public final void method324(int arg0, boolean arg1, int arg2, class306 arg3, boolean arg4) {
        if (arg2 != -9608) {
            return;
        }
        int var6 = 0;
        byte var8;
        if (arg0 == 1) {
            var8 = 3;
        } else if (arg0 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg1) {
            var6 |= 0x20;
        }
        if (arg4) {
            var6 |= 0x10;
        }
        this.field5542.SetTextureStageState(this.field3350, var8, method2421(-26537, arg3) | var6);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ltea;I)V", line = 331)
    public final void method2419(class566 arg0, int arg1) {
        this.field5542.SetTexture(this.field3350, arg0.method1211((byte) -15));
        if (this.field5538[this.field3350] != arg0.field7848) {
            int var3 = method2418(arg0.field7848, false);
            this.field5542.SetSamplerState(this.field3350, 6, var3);
            this.field5542.SetSamplerState(this.field3350, 5, var3);
            this.field5538[this.field3350] = arg0.field7848;
            if (arg0.field7846 != this.field5556[this.field3350]) {
                this.field5542.SetSamplerState(this.field3350, 7, arg0.field7846 ? method2418(arg0.field7848, false) : 0);
                this.field5556[this.field3350] = arg0.field7846;
            }
        } else if (this.field5556[this.field3350] != arg0.field7846) {
            this.field5542.SetSamplerState(this.field3350, 7, arg0.field7846 ? method2418(arg0.field7848, false) : 0);
            this.field5556[this.field3350] = arg0.field7846;
        }
        if (arg1 == 0 && !this.field5548[this.field3350]) {
            this.field5548[this.field3350] = true;
            this.method301((byte) 7);
            this.method267(true);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;", line = 371)
    public final Object method337(Canvas arg0, boolean arg1) {
        return arg1 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "()Ler;", line = 384)
    public final class299 method263() {
        D3DADAPTER_IDENTIFIER var1 = this.field5541.method4132(this.field5547, 0);
        return new class299(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/hea;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lbf;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Luu;I)V", line = 392)
    private class386(int arg0, int arg1, Canvas arg2, class422 arg3, IDirect3D arg4, IDirect3DDevice arg5, class314 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class270 arg9, class237 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field5537 = arg3;
            this.field5542 = arg5;
            this.field5544 = arg6;
            this.field5535 = arg7;
            this.field5541 = arg4;
            this.field5536 = arg8;
            this.field5547 = arg0;
            this.field5558 = arg1;
            this.field5540 = new class741(this.field5537);
            this.field5533 = new class741(this.field5537);
            this.field5545 = new class741(this.field5537);
            this.field5557 = new PixelBuffer(this.field5537);
            this.field5551 = new GeometryBuffer(this.field5537);
            new GeometryBuffer(this.field5537);
            this.field5550 = (this.field5536.TextureCaps & 0x2) == 0;
            this.field3359 = (this.field5536.TextureCaps & 0x2000) != 0;
            this.field3416 = this.field5536.MaxSimultaneousTextures;
            this.field3431 = this.field5536.MaxActiveLights <= 0 ? 8 : this.field5536.MaxActiveLights;
            this.field5534 = (this.field5536.TextureCaps & 0x10000) != 0;
            this.field5559 = (this.field5536.TextureCaps & 0x4000) != 0;
            this.field3394 = (this.field5536.TextureCaps & 0x800) != 0;
            this.field3372 = this.field3407 > 0 || this.field5541.CheckDeviceMultiSampleType(this.field5547, this.field5558, this.field5535.BackBufferFormat, true, 2) == 0;
            this.field5548 = new boolean[this.field3416];
            this.field5543 = new boolean[this.field3416];
            this.field5539 = new boolean[this.field3416];
            this.field5552 = new int[this.field3416];
            this.field5556 = new boolean[this.field3416];
            this.field5538 = new class372[this.field3416];
            this.field5542.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method3248((byte) -88);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V", line = 441)
    public final void method2420(int arg0, IDirect3DPixelShader arg1) {
        this.field5542.SetPixelShader(arg1);
        if (arg0 != -3098) {
            this.field5542 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "()Z", line = 452)
    public final boolean method283() {
        return false;
    }

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "(B)V", line = 460)
    public final void method328(byte arg0) {
        if (arg0 < 22) {
            this.method323(null, null, (byte) -49);
        }
        if (this.field5555) {
            return;
        }
        this.field5542.LightEnable(0, false);
        this.field5542.LightEnable(1, false);
        this.field5542.SetLight(0, this.field5540);
        this.field5542.SetLight(1, this.field5533);
        this.field5542.LightEnable(0, true);
        this.field5542.LightEnable(1, true);
        this.field5555 = true;
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "(B)V", line = 481)
    public final void method291(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field3440; var2++) {
            class687 var3 = this.field3346[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3868(6);
            float var6 = var3.method3871(16043) / 255.0F;
            this.field5545.SetPosition((float) var3.method3873((byte) -7), (float) var3.method3867(false), (float) var3.method3870(103));
            this.field5545.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field5545.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3866((byte) -101) * var3.method3866((byte) -118)));
            this.field5545.SetRange((float) var3.method3866((byte) -40));
            this.field5542.SetLight(var4, this.field5545);
            this.field5542.LightEnable(var4, true);
        }
        while (this.field3378 > var2) {
            this.field5542.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method291(arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILcc;)V", line = 517)
    public final void method265(int arg0, class579 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 != 1024) {
            this.field5554 = 4;
        }
        this.field5542.SetVertexDeclaration(var3.field8222);
    }

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "()V", line = 527)
    public final void method315() {
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III[BILiv;)Lrj;", line = 530)
    public final class361 method300(int arg0, int arg1, int arg2, byte[] arg3, int arg4, class25 arg5) {
        return arg0 == 18173 ? new class285(this, arg5, arg2, arg4, arg1, arg3) : (class361) null;
    }

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "(B)V", line = 540)
    public final void method274(byte arg0) {
        if (this.field3398.method4026(126)) {
            this.field3340.method2887(16383, field5560);
        } else {
            field5560[6] = 0.0F;
            field5560[14] = 0.0F;
            field5560[10] = 1.0F;
            field5560[11] = 0.0F;
            field5560[4] = 0.0F;
            field5560[5] = 1.0F;
            field5560[15] = 1.0F;
            field5560[3] = 0.0F;
            field5560[1] = 0.0F;
            field5560[2] = 0.0F;
            field5560[8] = 0.0F;
            field5560[7] = 0.0F;
            field5560[0] = 1.0F;
            field5560[9] = 0.0F;
            field5560[13] = 0.0F;
            field5560[12] = 0.0F;
        }
        this.field5542.SetTransform(2, field5560);
        if (arg0 < 57) {
            field5553 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BZ)Lrv;", line = 577)
    public final class440 method319(byte arg0, boolean arg1) {
        if (arg0 <= 58) {
            this.method333(true);
        }
        return new class426(this, arg1);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILjs;Lwi;III)V", line = 588)
    public final void method342(int arg0, int arg1, class174 arg2, class202 arg3, int arg4, int arg5, int arg6) {
        this.field5542.SetIndices(((class354) arg2).field5099);
        if (arg1 != 7) {
            this.method278();
        }
        this.field5542.DrawIndexedPrimitive(method2417(106, arg3), 0, arg5, arg0, arg6, arg4);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILwi;II)V", line = 609)
    public final void method347(int arg0, class202 arg1, int arg2, int arg3) {
        this.field5542.DrawPrimitive(method2417(56, arg1), arg3, arg2);
        int var5 = -95 % ((-arg0 - 29) / 57);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZIBLiv;[FI)Ldg;", line = 621)
    public final class19 method345(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class25 arg5, float[] arg6, int arg7) {
        return arg4 == -59 ? null : (class19) null;
    }

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "(I)V", line = 631)
    public final void method298(int arg0) {
        if (arg0 >= -75) {
            this.field5543 = null;
        }
        if (this.field5549 != null || this.field3392[this.field3350] == class149.field2065) {
            this.field5542.SetTextureStageState(this.field3350, 24, 0);
            this.field5552[this.field3350] = 0;
            return;
        }
        if (this.field3392[this.field3350] == class393.field5647) {
            this.field5542.SetTransform(this.field3350 + 16, this.field3347[this.field3350].method2882(true, field5560));
        } else {
            this.field5542.SetTransform(this.field3350 + 16, this.field3347[this.field3350].method2887(16383, field5560));
        }
        int var2 = method2427(this.field3392[this.field3350], -81);
        if (this.field5552[this.field3350] != var2) {
            this.field5542.SetTextureStageState(this.field3350, 24, var2);
            this.field5552[this.field3350] = var2;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "(II)Lkl;", line = 663)
    public final class712 method309(int arg0, int arg1) {
        if (arg0 != 13492) {
            this.field5547 = -111;
        }
        if (arg1 == 3) {
            return new class86(this, this.field3230);
        } else if (arg1 == 4) {
            return new class93(this, this.field3230, this.field3185);
        } else if (arg1 == 8) {
            return new class53(this, this.field3230, this.field3185);
        } else {
            return super.method309(13492, arg1);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "ya", descriptor = "()V", line = 707)
    public final void method346() {
        this.method1453(true, -103);
        this.field5542.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lhe;Lhe;FLhe;)Lhe;", line = 715)
    public final class577 method260(class577 arg0, class577 arg1, float arg2, class577 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 724)
    public final void method344(Object arg0, byte arg1, Canvas arg2) {
        if (this.field3160 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field5542.EndScene();
                this.method2423(false);
                this.field5542.BeginScene();
            }
        }
        if (arg1 <= 20) {
            this.method327((byte) 123);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lsga;I)V", line = 751)
    public final void method338(class651 arg0, int arg1) {
        if (arg1 > -126) {
            this.method326(104, -123);
        }
        int var3 = 0;
        if (class433.field6041 == arg0) {
            var3 = 65536;
        } else if (class139.field1985 == arg0) {
            var3 = 131072;
        } else if (class171.field2379 == arg0) {
            var3 = 196608;
        }
        this.field5542.SetTextureStageState(this.field3350, 11, this.field3350 | var3);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BZ)V", line = 775)
    public final void method266(byte arg0, boolean arg1) {
        int var3 = -13 / ((45 - arg0) / 40);
        this.field5542.method4127(161, arg1);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIZ[III)Ldg;", line = 783)
    public final class19 method343(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            this.method272(false);
        }
        return new class198(this, arg2, arg5, arg3, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "(I)V", line = 793)
    public final void method280(int arg0) {
        if (arg0 <= 7) {
            this.method335(21);
        }
        if (this.field5548[this.field3350]) {
            this.field5548[this.field3350] = false;
            this.field5542.SetTexture(this.field3350, null);
            this.method301((byte) 7);
            this.method267(true);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "()V", line = 815)
    public final void method278() {
    }

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "(B)V", line = 819)
    public final void method297(byte arg0) {
        if (arg0 < 56) {
            this.method306(-0.5522785F, -0.32476938F, 0.3535806F);
        }
        this.method339(0);
        this.method328((byte) 123);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V", line = 830)
    public final void method272(boolean arg0) {
    }

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "(I)V", line = 835)
    public final void method303(int arg0) {
        this.field5542.method4127(174, this.field3466);
        if (arg0 != -1) {
            this.method276(85);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(II)V", line = 845)
    public final void method262(int arg0, int arg1) throws class692 {
        this.field5542.EndScene();
        if (this.field5544.method2053(86)) {
            this.field5554 = 0;
            if (class742.method4136(this.field5544.method2050(0, -124), (byte) -94)) {
                this.method2423(false);
            }
        } else if (++this.field5554 <= 50) {
            this.method2423(false);
        } else {
            throw new class692();
        }
        this.field5542.BeginScene();
    }

    @OriginalMember(owner = "client!kfa", name = "na", descriptor = "(IIII)[I", line = 871)
    public final int[] method268(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field5542.method4114(0);
        IDirect3DSurface var7 = this.field5542.method4123(arg2, arg3, 21, 0, 0, true);
        if (class742.method4137(this.field5542.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -1) && class742.method4137(var7.LockRect(0, 0, arg2, arg3, 16, this.field5557), -1)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field5557.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field5557.method4110(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field5557.method4110(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2637(-10573);
        var7.method2637(-10573);
        return var5;
    }

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "(Z)V", line = 910)
    public final void method333(boolean arg0) {
        this.field5542.SetRenderState(60, this.field3430);
        if (!arg0) {
            this.field5559 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFF)V", line = 919)
    public final void method306(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILip;)I", line = 922)
    private static final int method2421(int arg0, class306 arg1) {
        if (class15.field140 == arg1) {
            return 2;
        } else if (class684.field9515 == arg1) {
            return 0;
        } else if (class231.field3142 == arg1) {
            return 1;
        } else if (class520.field7247 == arg1) {
            return 3;
        } else {
            if (arg0 != -26537) {
                field5546 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjagdx/IDirect3D;IIILjagdx/D3DPRESENT_PARAMETERS;)Z", line = 948)
    private static final boolean method2422(int arg0, IDirect3D arg1, int arg2, int arg3, int arg4, D3DPRESENT_PARAMETERS arg5) {
        if (arg4 != 16) {
            return true;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class742.method4136(arg1.method4134(arg3, var9), (byte) -57)) {
                return false;
            }
            label80: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field5546.length; var10++) {
                        if (arg1.CheckDeviceType(arg3, arg2, var9.Format, field5546[var10], true) == 0 && arg1.CheckDeviceFormat(arg3, arg2, var9.Format, 1, 1, field5546[var10]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg2, field5546[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field5553.length; var11++) {
                                if (arg1.CheckDeviceFormat(arg3, arg2, var9.Format, 2, 1, field5553[var11]) == 0 && arg1.CheckDepthStencilMatch(arg3, arg2, var9.Format, field5546[var10], field5553[var11]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg2, field5553[var10], true, var8) == 0)) {
                                    var6 = field5553[var11];
                                    var7 = field5546[var10];
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
            arg5.BackBufferFormat = var7;
            arg5.MultiSampleQuality = 0;
            arg5.MultiSampleType = var8;
            arg5.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1052)
    public final void method282(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class692 {
        this.method262(arg2, arg3);
    }

    @OriginalMember(owner = "client!kfa", name = "J", descriptor = "(I)V", line = 1060)
    public final void method336(int arg0) {
        this.field5542.SetViewport(this.field3429, this.field3417, this.field3195, this.field3293, 0.0F, 1.0F);
        if (arg0 != 9) {
            this.field5556 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "A", descriptor = "(I)V", line = 1074)
    public final void method320(int arg0) {
        this.field5542.SetTransform(3, this.field3421);
        if (arg0 != 0) {
            this.field5538 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "(I)V", line = 1086)
    public final void method335(int arg0) {
        if (arg0 == 18075) {
            this.field5542.method4127(7, this.field3401);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "(I)V", line = 1097)
    public final void method286(int arg0) {
        if (arg0 != 3) {
            this.method313(-8);
        }
        this.field5542.method4127(27, this.field3419);
    }

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "(I)V", line = 1107)
    public final void method276(int arg0) {
        if (arg0 != 1457265324) {
            this.field5538 = null;
        }
        this.field3345 = (this.field3352 - this.field3357);
        this.field3399 = (float) (-this.field3406) + this.field3345;
        if (this.field3399 < (float) this.field3353) {
            this.field3399 = this.field3353;
        }
        this.field5542.method4115(36, this.field3399);
        this.field5542.method4115(37, this.field3345);
        this.field5542.SetRenderState(34, this.field3405);
    }

    @OriginalMember(owner = "client!kfa", name = "G", descriptor = "(I)V", line = 1125)
    public final void method292(int arg0) {
        this.field5540.SetDirection(-this.field3355[0], -this.field3355[1], -this.field3355[2]);
        if (arg0 > -104) {
            this.field5540 = null;
        }
        this.field5533.SetDirection(-this.field3381[0], -this.field3381[1], -this.field3381[2]);
        this.field5555 = false;
    }

    @OriginalMember(owner = "client!kfa", name = "GA", descriptor = "(I)V", line = 1137)
    public final void method273(int arg0) {
        this.field5542.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "(Z)Z", line = 1145)
    private final boolean method2423(boolean arg0) {
        int var2 = this.field5542.TestCooperativeLevel();
        if (arg0) {
            this.method260(null, null, 0.05777198F, null);
        }
        if (var2 == 0 || var2 == -2005530519) {
            class314 var3 = (class314) this.field3149;
            this.method1543(118);
            var3.method2051(12122);
            this.field5535.BackBufferWidth = 0;
            this.field5535.BackBufferHeight = 0;
            if (method2422(this.field3407, this.field5541, this.field5558, this.field5547, 16, this.field5535)) {
                int var4 = this.field5542.Reset(this.field5535);
                if (class742.method4137(var4, -1)) {
                    var3.method2052(0, this.field5542.method4117(), this.field5542.method4118(0));
                    this.method1405(-128);
                    this.method332(36);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLjagdx/IDirect3DVertexShader;)V", line = 1184)
    public final void method2424(boolean arg0, IDirect3DVertexShader arg1) {
        this.field5549 = arg1;
        if (!arg0) {
            this.field5542.SetVertexShader(arg1);
            this.method298(-85);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(II)Lpw;", line = 1196)
    public final class106 method299(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lpw;Llh;)Ldi;", line = 1204)
    public final class5 method311(class106 arg0, class208 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "()V", line = 1210)
    public final void method302() {
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILjt;Liv;I)Ldg;", line = 1213)
    public final class19 method304(int arg0, int arg1, class38 arg2, class25 arg3, int arg4) {
        return arg4 == 2 ? new class198(this, arg3, arg2, arg0, arg1) : (class19) null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB[[IZ)Lpda;", line = 1224)
    public final class492 method329(int arg0, byte arg1, int[][] arg2, boolean arg3) {
        if (arg1 != 75) {
            this.method274((byte) -115);
        }
        return new class703(this, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "()V", line = 1235)
    public final void method290() {
        IDirect3DEventQuery var1 = this.field5542.method4124();
        if (class742.method4137(var1.Issue(), -1)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2637(-10573);
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(B)V", line = 1259)
    public final void method301(byte arg0) {
        int var2 = this.field5548[this.field3350] ? method2425(1, this.field3439[this.field3350]) : 1;
        this.field5542.SetTextureStageState(this.field3350, 4, var2);
        if (arg0 != 7) {
            this.field5559 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "P", descriptor = "(I)V", line = 1270)
    public final void method341(int arg0) {
        if (arg0 == -27246) {
            this.field5542.method4127(15, this.field3343);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V", line = 1280)
    public final void method287(int arg0) {
        if (this.field3335) {
            field5560[2] = 0.0F;
            field5560[3] = 0.0F;
            field5560[9] = 0.0F;
            field5560[4] = 0.0F;
            field5560[14] = 0.0F;
            field5560[6] = 0.0F;
            field5560[7] = 0.0F;
            field5560[12] = 0.0F;
            field5560[0] = 1.0F;
            field5560[1] = 0.0F;
            field5560[5] = 1.0F;
            field5560[11] = 0.0F;
            field5560[15] = 1.0F;
            field5560[10] = 1.0F;
            field5560[8] = 0.0F;
            field5560[13] = 0.0F;
        } else {
            this.field3337.method2887(16383, field5560);
        }
        this.field5542.SetTransform(256, field5560);
        if (arg0 != 18169) {
            this.field5542 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "(B)V", line = 1317)
    public final void method279(byte arg0) {
        this.field5542.method4127(137, this.field3412 && !this.field3368);
        if (arg0 != -3) {
            this.method322(-36, null, -10, -22, null, 109, (byte) 126, true);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(Z)V", line = 1328)
    public final void method267(boolean arg0) {
        int var2 = this.field5548[this.field3350] ? method2425(1, this.field3386[this.field3350]) : 1;
        this.field5542.SetTextureStageState(this.field3350, 1, var2);
        if (!arg0) {
            this.field5543 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "(B)V", line = 1339)
    public final void method327(byte arg0) {
        if (class596.field8092 == this.field3432) {
            this.field5542.SetRenderState(19, 5);
            this.field5542.SetRenderState(20, 6);
        } else if (class57.field805 == this.field3432) {
            this.field5542.SetRenderState(19, 2);
            this.field5542.SetRenderState(20, 2);
        } else if (class227.field3038 == this.field3432) {
            this.field5542.SetRenderState(19, 9);
            this.field5542.SetRenderState(20, 2);
        }
        if (arg0 < 126) {
            this.method288(null, null, 104);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "W", descriptor = "(I)V", line = 1369)
    public final void method271(int arg0) {
        if (arg0 != 1) {
            this.field5543 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILef;)I", line = 1378)
    private static final int method2425(int arg0, class263 arg1) {
        if (arg0 != 1) {
            field5553 = null;
        }
        if (class87.field1239 == arg1) {
            return 2;
        } else if (class179.field2467 == arg1) {
            return 4;
        } else if (class370.field5228 == arg1) {
            return 26;
        } else if (class161.field2237 == arg1) {
            return 7;
        } else if (class339.field4803 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ldi;)V", line = 1407)
    public final void method325(class5 arg0) {
    }

    @OriginalMember(owner = "client!kfa", name = "hb", descriptor = "(I)V", line = 1413)
    public final void method332(int arg0) {
        for (int var2 = 0; var2 < this.field3416; var2++) {
            this.field5542.SetSamplerState(var2, 7, 0);
            this.field5542.SetSamplerState(var2, 6, 2);
            this.field5542.SetSamplerState(var2, 5, 2);
            this.field5542.SetSamplerState(var2, 1, 1);
            this.field5542.SetSamplerState(var2, 2, 1);
            this.field5538[var2] = class432.field6028;
            this.field5543[var2] = this.field5539[var2] = true;
            this.field5556[var2] = false;
            this.field5552[var2] = 0;
        }
        this.field5542.SetTextureStageState(0, 6, 1);
        this.field5542.SetRenderState(9, 2);
        this.field5542.SetRenderState(23, 4);
        this.field5542.SetRenderState(25, 5);
        this.field5542.SetRenderState(24, 0);
        this.field5542.SetRenderState(22, 2);
        this.field5542.SetRenderState(147, 1);
        this.field5542.SetRenderState(145, 1);
        this.field5542.method4115(38, 0.95F);
        this.field5542.SetRenderState(140, 3);
        int var3 = -124 % ((arg0 + 60) / 39);
        this.field5540.SetType(3);
        this.field5533.SetType(3);
        this.field5545.SetType(1);
        this.field5555 = false;
        super.method332(68);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljt;Liv;B)Z", line = 1454)
    public final boolean method323(class38 arg0, class25 arg1, byte arg2) {
        if (arg2 == -16) {
            D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
            return class742.method4137(this.field5541.method4134(this.field5547, var4), -1) && class742.method4137(this.field5541.CheckDeviceFormat(this.field5547, this.field5558, var4.Format, 0, 3, method2416(arg0, arg1, -775)), arg2 ^ 0xF);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILpba;)V", line = 1466)
    public final void method2426(int arg0, class198 arg1) {
        this.method2419(arg1, 0);
        if (this.field5543[this.field3350] != arg1.field2661) {
            this.field5542.SetSamplerState(this.field3350, 1, arg1.field2661 ? 1 : 3);
            this.field5543[this.field3350] = arg1.field2661;
        }
        if (arg0 != 8602) {
            this.field5549 = null;
        }
        if (arg1.field2658 != this.field5539[this.field3350]) {
            this.field5542.SetSamplerState(this.field3350, 2, arg1.field2658 ? 1 : 3);
            this.field5539[this.field3350] = arg1.field2658;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZLip;)V", line = 1488)
    public final void method330(int arg0, int arg1, boolean arg2, class306 arg3) {
        if (arg0 != -19072) {
            return;
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
        if (arg2) {
            var7 |= 0x10;
        }
        this.field5542.SetTextureStageState(this.field3350, var6, method2421(arg0 ^ 0x2DD7, arg3) | var7);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Lkq;I)I", line = 1538)
    private static final int method2427(class345 arg0, int arg1) {
        int var2 = -100 / ((5 - arg1) / 37);
        if (class445.field6181 == arg0) {
            return 1;
        } else if (class393.field5647 == arg0) {
            return 2;
        } else if (class235.field3478 == arg0) {
            return 3;
        } else if (class743.field10232 == arg0) {
            return 4;
        } else if (class543.field7539 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([Lpj;I)Lcc;", line = 1566)
    public final class579 method331(class40[] arg0, int arg1) {
        if (arg1 != 4982) {
            this.method323(null, null, (byte) 79);
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I[BIILiv;IBZ)Ldg;", line = 1577)
    public final class19 method322(int arg0, byte[] arg1, int arg2, int arg3, class25 arg4, int arg5, byte arg6, boolean arg7) {
        int var9 = 35 % ((arg6 - 70) / 52);
        return new class198(this, arg4, arg5, arg0, arg7, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "()Z", line = 1588)
    public final boolean method289() {
        return false;
    }

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "(I)V", line = 1596)
    public final void method321(int arg0) {
        if (arg0 != 9840) {
            this.method308(54, -95, -83, -3, -0.284478992595643D);
        }
        this.field5542.method4127(28, this.field3390 && this.field3425 && this.field3406 >= 0);
    }

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "()V", line = 1608)
    public final void method312() {
        this.field5537.method2630(-27744);
        super.method312();
    }

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "(I)V", line = 1616)
    public final void method307(int arg0) {
        if (arg0 != -1) {
            field5560 = null;
        }
        this.field5540.SetAmbient(this.field3420 * this.field3354, this.field3413 * this.field3354, this.field3365 * this.field3354, 0.0F);
        this.field5555 = false;
    }

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "(I)V", line = 1632)
    public final void method339(int arg0) {
        float var2 = this.field3423 ? this.field3426 : 0.0F;
        float var3 = this.field3423 ? -this.field3418 : 0.0F;
        this.field5540.SetDiffuse(this.field3420 * var2, this.field3413 * var2, this.field3365 * var2, (float) arg0);
        this.field5533.SetDiffuse(this.field3420 * var3, this.field3413 * var3, this.field3365 * var3, 0.0F);
        this.field5555 = false;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ltfa;I)V", line = 1644)
    public final void method2428(class285 arg0, int arg1) {
        this.method2419(arg0, arg1);
        if (!this.field5543[this.field3350]) {
            this.field5542.SetSamplerState(this.field3350, 1, 1);
            this.field5543[this.field3350] = true;
        }
        if (!this.field5539[this.field3350]) {
            this.field5542.SetSamplerState(this.field3350, 2, 1);
            this.field5539[this.field3350] = true;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIIID)V", line = 1663)
    public final void method308(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V", line = 1667)
    public final synchronized void method310(int arg0) {
        this.field5537.method2627(-23514);
        super.method310(arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "(II)V", line = 1675)
    public final void method326(int arg0, int arg1) {
        if (arg1 != -9763) {
            this.field5551 = null;
        }
        this.field5542.SetTextureStageState(this.field3350, 11, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1687)
    public final void method305(int arg0, Canvas arg1, Object arg2) {
        this.field5544 = (class314) arg2;
        if (arg0 <= 30) {
            this.field5538 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "(I)V", line = 1697)
    public final void method295(int arg0) {
        this.field5542.SetScissorRect(this.field3429 + this.field3414, this.field3422 + this.field3417, this.field3363, this.field3415);
        if (arg0 <= 109) {
            this.method291((byte) -26);
        }
    }
}
