import jaclib.peer.class617;
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
import jagdx.class443;
import jagdx.class444;
import jagdx.class445;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class49 extends class580 {

    @OriginalMember(owner = "client!vg", name = "yg", descriptor = "Z")
    private boolean field711 = false;

    @OriginalMember(owner = "client!vg", name = "zg", descriptor = "I")
    private int field712 = 0;

    @OriginalMember(owner = "client!vg", name = "Kg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field723;

    @OriginalMember(owner = "client!vg", name = "Rg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field730;

    @OriginalMember(owner = "client!vg", name = "xg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field710;

    @OriginalMember(owner = "client!vg", name = "Hg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field720;

    @OriginalMember(owner = "client!vg", name = "Bg", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!vg", name = "Ng", descriptor = "Ljaclib/peer/ca;")
    public class617 field726;

    @OriginalMember(owner = "client!vg", name = "Dg", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "client!vg", name = "Fg", descriptor = "Ldk;")
    private class470 field718;

    @OriginalMember(owner = "client!vg", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class445 field719;

    @OriginalMember(owner = "client!vg", name = "Eg", descriptor = "Ljagdx/D3DLIGHT;")
    private class445 field717;

    @OriginalMember(owner = "client!vg", name = "Vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class445 field734;

    @OriginalMember(owner = "client!vg", name = "Cg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field715;

    @OriginalMember(owner = "client!vg", name = "Tg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field732;

    @OriginalMember(owner = "client!vg", name = "wg", descriptor = "Z")
    public boolean field709;

    @OriginalMember(owner = "client!vg", name = "Sg", descriptor = "Z")
    public boolean field731;

    @OriginalMember(owner = "client!vg", name = "Ag", descriptor = "Z")
    public boolean field713;

    @OriginalMember(owner = "client!vg", name = "Wg", descriptor = "[Z")
    private boolean[] field735;

    @OriginalMember(owner = "client!vg", name = "Ug", descriptor = "[Z")
    private boolean[] field733;

    @OriginalMember(owner = "client!vg", name = "Mg", descriptor = "[I")
    private int[] field725;

    @OriginalMember(owner = "client!vg", name = "Og", descriptor = "[Z")
    private boolean[] field727;

    @OriginalMember(owner = "client!vg", name = "Ig", descriptor = "[Lqaa;")
    private class26[] field721;

    @OriginalMember(owner = "client!vg", name = "Lg", descriptor = "[Z")
    private boolean[] field724;

    @OriginalMember(owner = "client!vg", name = "Jg", descriptor = "[I")
    private static int[] field722 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!vg", name = "Pg", descriptor = "[I")
    private static int[] field728 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!vg", name = "Qg", descriptor = "[F")
    private static float[] field729 = new float[16];

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lnd;I)I")
    private static final int method283(class500 arg0, int arg1) {
        if (arg1 != 4) {
            field729 = null;
        }
        if (class24.field325 == arg0) {
            return 2;
        } else if (class137.field1929 == arg0) {
            return 4;
        } else if (class175.field2614 == arg0) {
            return 26;
        } else if (client.field3838 == arg0) {
            return 7;
        } else if (class62.field821 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "(I)V")
    public final void method284(int arg0) {
        this.field720.method2559(28, this.field8061 && this.field8020 && this.field8005 >= 0 | this.field7972);
        if (arg0 != 2) {
            this.method290(false, 61);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public final void method285(Object arg0, byte arg1, Canvas arg2) {
        this.field718 = (class470) arg0;
        if (arg1 != -40) {
            this.method356();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lkda;I)V")
    public final void method286(class354 arg0, int arg1) {
        if (arg1 != 9762) {
            createToolkit(null, null, null, null);
        }
        int var3 = 0;
        if (class198.field2926 == arg0) {
            var3 = 65536;
        } else if (class9.field198 == arg0) {
            var3 = 131072;
        } else if (class209.field3087 == arg0) {
            var3 = 196608;
        }
        this.field720.SetTextureStageState(this.field8043, 11, this.field8043 | var3);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLcl;)V")
    public final void method287(byte arg0, class242 arg1) {
        this.method309(104, arg1);
        if (arg1.field3464 != this.field735[this.field8043]) {
            this.field720.SetSamplerState(this.field8043, 1, arg1.field3464 ? 1 : 3);
            this.field735[this.field8043] = arg1.field3464;
        }
        if (arg0 != -23) {
            this.field711 = true;
        }
        if (this.field727[this.field8043] != arg1.field3462) {
            this.field720.SetSamplerState(this.field8043, 2, arg1.field3462 ? 1 : 3);
            this.field727[this.field8043] = arg1.field3462;
        }
    }

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "(I)V")
    public final void method288(int arg0) {
        if (arg0 != -20470) {
            this.method344();
        }
        this.field720.method2559(174, this.field8092);
    }

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)V")
    public final void method289(int arg0) {
        int var2 = -48 / ((arg0 + 38) / 58);
        this.field720.method2559(27, this.field8060);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ca;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ldk;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Lpj;I)V")
    private class49(int arg0, int arg1, Canvas arg2, class617 arg3, IDirect3D arg4, IDirect3DDevice arg5, class470 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class489 arg9, class132 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field723 = arg8;
        this.field730 = arg7;
        this.field710 = arg4;
        this.field720 = arg5;
        this.field714 = arg0;
        this.field726 = arg3;
        this.field716 = arg1;
        this.field718 = arg6;
        this.field719 = new class445(this.field726);
        this.field717 = new class445(this.field726);
        this.field734 = new class445(this.field726);
        this.field715 = new PixelBuffer(this.field726);
        this.field732 = new GeometryBuffer(this.field726);
        new GeometryBuffer(this.field726);
        this.field8048 = this.field723.MaxSimultaneousTextures;
        this.field8004 = (this.field723.TextureCaps & 0x800) != 0;
        this.field709 = (this.field723.TextureCaps & 0x2) == 0;
        this.field731 = (this.field723.TextureCaps & 0x4000) != 0;
        this.field8053 = this.field723.MaxActiveLights <= 0 ? 8 : this.field723.MaxActiveLights;
        this.field713 = (this.field723.TextureCaps & 0x10000) != 0;
        this.field8013 = (this.field723.TextureCaps & 0x2000) != 0;
        this.field7990 = this.field7971 > 0 || this.field710.CheckDeviceMultiSampleType(this.field714, this.field716, this.field730.BackBufferFormat, true, 2) == 0;
        this.field735 = new boolean[this.field8048];
        this.field733 = new boolean[this.field8048];
        this.field725 = new int[this.field8048];
        this.field727 = new boolean[this.field8048];
        this.field721 = new class26[this.field8048];
        this.field724 = new boolean[this.field8048];
        this.field720.BeginScene();
        try {
            this.field720.Clear(3, 0, 1.0F, 0);
            this.method365();
            this.field720.Clear(3, 0, 1.0F, 0);
        } catch (class211 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)Ljn;")
    public final class659 method290(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method288(90);
        }
        return new class478(this, class82.field1148, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method291(byte arg0, Object arg1, Canvas arg2) {
        if (arg0 < 102) {
            this.field733 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "(I)V")
    public final void method292(int arg0) {
        if (!this.field711) {
            this.field720.LightEnable(0, false);
            this.field720.LightEnable(1, false);
            this.field720.SetLight(0, this.field719);
            this.field720.SetLight(1, this.field717);
            this.field720.LightEnable(0, true);
            this.field720.LightEnable(1, true);
            this.field711 = true;
        }
        if (arg0 < 54) {
            this.method300(-13);
        }
    }

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "(B)V")
    public final void method293(byte arg0) {
        this.field720.SetViewport(this.field8009, this.field8067, this.field7934, this.field7876, 0.0F, 1.0F);
        if (arg0 != 70) {
            this.method357(-75);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBLuj;)V")
    public final void method294(int arg0, int arg1, byte arg2, class349 arg3) {
        this.field720.DrawPrimitive(method323(-1, arg3), arg1, arg0);
        if (arg2 <= 72) {
            this.method346((byte) 56);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(ZI)V")
    public final void method295(boolean arg0, int arg1) {
        int var3 = -65 / ((arg1 - 42) / 62);
        this.field720.method2559(161, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "()V")
    public final void method296() {
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "()Z")
    public final boolean method297() {
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Lpj;Ljava/lang/Integer;)Loa;")
    public static final class638 createToolkit(Canvas arg0, class489 arg1, class132 arg2, Integer arg3) {
        class49 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class617 var7 = new class617();
            IDirect3D var8 = IDirect3D.method2540(-2147483616, var7);
            D3DCAPS var9 = var8.method2544(var5, var6);
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
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method349(arg3, var5, var6, var8, var10, (byte) 37)) {
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
                    var13 = var8.method2542(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class444 var17) {
                    var13 = var8.method2542(var5, var6, arg0, var11 | 0x20, var10);
                }
                class470 var15 = new class470(var13.method2546(0), var13.method2547());
                var4 = new class49(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3237(0);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method306();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "(I)V")
    public final void method298(int arg0) {
        this.field719.SetDirection(-this.field8070[0], -this.field8070[1], -this.field8070[2]);
        this.field717.SetDirection(-this.field8024[0], -this.field8024[1], -this.field8024[2]);
        if (arg0 <= -4) {
            this.field711 = false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public final synchronized void method299(int arg0) {
        this.field726.method3436(false);
        super.method299(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "(I)V")
    public final void method300(int arg0) {
        this.field720.method2559(14, this.field7969 && this.field8000);
        if (arg0 >= -31) {
            this.method334(-20);
        }
    }

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "(I)V")
    public final void method301(int arg0) {
        if (this.field8063.method1454(1433259682)) {
            this.field7966.method2144(field729, arg0 ^ 0x0);
        } else {
            field729[2] = 0.0F;
            field729[10] = 1.0F;
            field729[13] = 0.0F;
            field729[1] = 0.0F;
            field729[12] = 0.0F;
            field729[9] = 0.0F;
            field729[14] = 0.0F;
            field729[0] = 1.0F;
            field729[3] = 0.0F;
            field729[8] = 0.0F;
            field729[7] = 0.0F;
            field729[4] = 0.0F;
            field729[15] = 1.0F;
            field729[6] = 0.0F;
            field729[11] = 0.0F;
            field729[5] = 1.0F;
        }
        if (arg0 != 0) {
            this.method345(null, (byte) -10, null);
        }
        this.field720.SetTransform(2, field729);
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public final void method302(int arg0) {
        this.method334(-124);
        if (arg0 != 18509) {
            this.method297();
        }
        this.method292(115);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lkf;IILps;I)Lhr;")
    public final class483 method303(class229 arg0, int arg1, int arg2, class82 arg3, int arg4) {
        return arg1 == -8 ? new class242(this, arg0, arg3, arg4, arg2) : (class483) null;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(B)V")
    public final void method304(byte arg0) {
        if (arg0 != 119) {
            this.method361(-34, false, null, 24, -61, -87, 107, null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI[BLkf;ZII)Lhr;")
    public final class483 method305(int arg0, boolean arg1, int arg2, byte[] arg3, class229 arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            this.method322(-0.07040113F, 1.0073653F, -0.5041953F);
        }
        return new class242(this, arg4, arg6, arg0, arg1, arg3, arg2, arg7);
    }

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "()V")
    public final void method306() {
        this.field726.method3437((byte) -86);
        super.method306();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([Llf;B)Lfl;")
    public final class677 method307(class215[] arg0, byte arg1) {
        return arg1 < 105 ? (class677) null : new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "()Z")
    public final boolean method308() {
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILsf;)V")
    public final void method309(int arg0, class481 arg1) {
        if (arg0 < 79) {
            this.method308();
        }
        this.field720.SetTexture(this.field8043, arg1.method130(88));
        if (this.field721[this.field8043] != arg1.field6699) {
            int var3 = method314(arg1.field6699, (byte) -93);
            this.field720.SetSamplerState(this.field8043, 6, var3);
            this.field720.SetSamplerState(this.field8043, 5, var3);
            this.field721[this.field8043] = arg1.field6699;
            if (arg1.field6700 != this.field733[this.field8043]) {
                this.field720.SetSamplerState(this.field8043, 7, arg1.field6700 ? method314(arg1.field6699, (byte) 97) : 0);
                this.field733[this.field8043] = arg1.field6700;
            }
        } else if (this.field733[this.field8043] != arg1.field6700) {
            this.field720.SetSamplerState(this.field8043, 7, arg1.field6700 ? method314(arg1.field6699, (byte) 103) : 0);
            this.field733[this.field8043] = arg1.field6700;
        }
        if (!this.field724[this.field8043]) {
            this.field724[this.field8043] = true;
            this.method332(74);
            this.method341(22626);
        }
    }

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "(I)V")
    public final void method310(int arg0) {
        this.field720.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([IIZIIII)Lhr;")
    public final class483 method311(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 15) {
            this.field713 = true;
        }
        return new class242(this, arg4, arg6, arg2, arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "(I)Z")
    private final boolean method312(int arg0) {
        if (arg0 != 29814) {
            return false;
        }
        int var2 = this.field720.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class470 var3 = (class470) this.field7875;
            this.method3200((byte) -58);
            var3.method2673((byte) 106);
            this.field730.BackBufferWidth = 0;
            this.field730.BackBufferHeight = 0;
            if (method349(this.field7971, this.field714, this.field716, this.field710, this.field730, (byte) 37)) {
                int var4 = this.field720.Reset(this.field730);
                if (class443.method2538(-1, var4)) {
                    var3.method2675(this.field720.method2546(0), this.field720.method2547(), 5164);
                    this.method3190((byte) 116);
                    this.method336(9);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Liq;II)V")
    public final void method313(class555 arg0, int arg1, int arg2) {
        if (arg1 != 15) {
            this.field735 = null;
        }
        class187 var4 = (class187) arg0;
        this.field720.SetStreamSource(arg2, var4.field2775, 0, var4.method1248((byte) -106));
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lqaa;B)I")
    private static final int method314(class26 arg0, byte arg1) {
        if (class81.field1132 == arg0) {
            return 2;
        } else if (class13.field214 == arg0) {
            return 1;
        } else {
            int var2 = -50 / ((34 - arg1) / 56);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLps;Lkf;)Z")
    public final boolean method315(byte arg0, class82 arg1, class229 arg2) {
        if (arg0 < 89) {
            this.field734 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class443.method2538(-1, this.field710.method2541(this.field714, var4)) && class443.method2538(-1, this.field710.CheckDeviceFormat(this.field714, this.field716, var4.Format, 0, 4, method359(arg1, false, arg2)));
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLiv;ZIZ)V")
    public final void method316(boolean arg0, class84 arg1, boolean arg2, int arg3, boolean arg4) {
        byte var7;
        if (arg3 == 1) {
            var7 = 3;
        } else if (arg3 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg2) {
            var8 |= 0x20;
        }
        if (arg0) {
            var8 |= 0x10;
        }
        this.field720.SetTextureStageState(this.field8043, var7, method338(arg1, 1) | var8);
        if (arg4) {
            this.method291((byte) -37, null, null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lka;Lka;FLka;)Lka;")
    public final class434 method317(class434 arg0, class434 arg1, float arg2, class434 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIILjn;Luj;I)V")
    public final void method318(int arg0, int arg1, int arg2, int arg3, class659 arg4, class349 arg5, int arg6) {
        if (arg1 == 4025) {
            this.field720.SetIndices(((class478) arg4).field6676);
            this.field720.DrawIndexedPrimitive(method323(arg1 ^ 0xFFFFF046, arg5), 0, arg3, arg0, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method319(Rectangle[] arg0, int arg1) throws class211 {
        this.method365();
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
    public final void method320(int arg0) {
        int var2 = -115 % ((83 - arg0) / 35);
        if (this.field7972) {
            this.field720.method2556(36, 0.0F);
            this.field720.method2556(37, 1.0F);
            this.field720.SetRenderState(34, this.field8030);
            return;
        }
        this.field8037 = (this.field8041 - this.field7975);
        this.field8031 = this.field8037 - (float) this.field8005;
        if ((float) this.field7989 > this.field8031) {
            this.field8031 = this.field7989;
        }
        this.field720.method2556(36, this.field8031);
        this.field720.method2556(37, this.field8037);
        this.field720.SetRenderState(34, this.field8002);
    }

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "(I)V")
    public final void method321(int arg0) {
        this.field719.SetAmbient(this.field8039 * this.field7996, this.field8052 * this.field8039, this.field8069 * this.field8039, 0.0F);
        if (arg0 == 1) {
            this.field711 = false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(FFF)V")
    public final void method322(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILuj;)I")
    private static final int method323(int arg0, class349 arg1) {
        if (arg0 != -1) {
            return -103;
        } else if (class315.field4669 == arg1) {
            return 2;
        } else if (class287.field3999 == arg1) {
            return 3;
        } else if (class688.field9676 == arg1) {
            return 1;
        } else if (class47.field697 == arg1) {
            return 4;
        } else if (class126.field1758 == arg1) {
            return 6;
        } else if (class110.field1482 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[[IZI)Ljs;")
    public final class300 method324(int arg0, int[][] arg1, boolean arg2, int arg3) {
        if (arg0 != 0) {
            this.field725 = null;
        }
        return new class28(this, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "()V")
    public final void method325() {
        IDirect3DEventQuery var1 = this.field720.method2550();
        if (class443.method2538(-1, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3440(21066);
    }

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "(I)V")
    public final void method326(int arg0) {
        int var2 = -44 % ((arg0 - 47) / 60);
        this.field720.method2559(7, this.field7976);
    }

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "()V")
    public final void method327() {
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public final void method328(byte arg0) {
        this.field720.method2559(15, this.field8045);
        if (arg0 >= -33) {
            this.method354(-124);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILkh;)I")
    private static final int method329(int arg0, class15 arg1) {
        if (arg0 != 18457) {
            field722 = null;
        }
        if (class558.field7527 == arg1) {
            return 1;
        } else if (class133.field1868 == arg1) {
            return 2;
        } else if (class591.field8233 == arg1) {
            return 3;
        } else if (class625.field8725 == arg1) {
            return 4;
        } else if (class585.field8171 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "(I)F")
    public final float method330(int arg0) {
        if (arg0 != 1) {
            this.method331((byte) -81);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (arg0 > -113) {
            return;
        }
        int var2;
        for (var2 = 0; var2 < this.field8016; var2++) {
            class154 var3 = this.field7993[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1083(true);
            float var6 = var3.method1081(-21) / 255.0F;
            this.field734.SetPosition((float) var3.method1079(-868177151), (float) var3.method1076(false), (float) var3.method1074(0));
            this.field734.SetDiffuse((float) ((var5 & 0xFF3288) >> 16) * var6, (float) ((var5 & 0xFF67) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field734.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1072(2) * var3.method1072(2)));
            this.field734.SetRange((float) var3.method1072(2));
            this.field720.SetLight(var4, this.field734);
            this.field720.LightEnable(var4, true);
        }
        while (this.field8034 > var2) {
            this.field720.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method331((byte) -116);
    }

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "(I)V")
    public final void method332(int arg0) {
        int var2 = this.field724[this.field8043] ? method283(this.field8021[this.field8043], 4) : 1;
        if (arg0 <= 72) {
            this.field715 = null;
        }
        this.field720.SetTextureStageState(this.field8043, 4, var2);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
    public final void method333(int arg0, byte arg1) {
        this.field720.SetTextureStageState(this.field8043, 11, arg0);
        if (arg1 < 81) {
            this.field724 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)V")
    public final void method334(int arg0) {
        float var2 = this.field7983 ? this.field8025 : 0.0F;
        if (arg0 >= -101) {
            this.field726 = null;
        }
        float var3 = this.field7983 ? -this.field8047 : 0.0F;
        this.field719.SetDiffuse(this.field7996 * var2, this.field8052 * var2, this.field8069 * var2, 0.0F);
        this.field717.SetDiffuse(this.field7996 * var3, this.field8052 * var3, this.field8069 * var3, 0.0F);
        this.field711 = false;
    }

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "(I)V")
    public final void method335(int arg0) {
        this.field720.SetTransform(3, this.field8001);
        if (arg0 != 0) {
            this.method353(null, -82, null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "(I)V")
    public final void method336(int arg0) {
        for (int var2 = 0; var2 < this.field8048; var2++) {
            this.field720.SetSamplerState(var2, 7, 0);
            this.field720.SetSamplerState(var2, 6, 2);
            this.field720.SetSamplerState(var2, 5, 2);
            this.field720.SetSamplerState(var2, 1, 1);
            this.field720.SetSamplerState(var2, 2, 1);
            this.field721[var2] = class81.field1132;
            this.field735[var2] = this.field727[var2] = true;
            this.field733[var2] = false;
            this.field725[var2] = 0;
        }
        this.field720.SetTextureStageState(0, 6, 1);
        this.field720.SetRenderState(arg0, 2);
        this.field720.SetRenderState(23, 4);
        this.field720.SetRenderState(25, 5);
        this.field720.SetRenderState(24, 0);
        this.field720.SetRenderState(22, 2);
        this.field720.SetRenderState(147, 1);
        this.field720.SetRenderState(145, 1);
        this.field720.method2556(38, 0.95F);
        this.field720.SetRenderState(140, 3);
        this.field719.SetType(3);
        this.field717.SetType(3);
        this.field734.SetType(1);
        this.field711 = false;
        super.method336(9);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZ)Liq;")
    public final class555 method337(byte arg0, boolean arg1) {
        if (arg0 != -61) {
            this.field725 = null;
        }
        return new class187(this, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Liv;I)I")
    private static final int method338(class84 arg0, int arg1) {
        if (arg1 != 1) {
            field722 = null;
        }
        if (class558.field7530 == arg0) {
            return 2;
        } else if (class391.field5472 == arg0) {
            return 0;
        } else if (class85.field1174 == arg0) {
            return 1;
        } else if (class22.field305 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "(Z)V")
    public final void method339(boolean arg0) {
        if (class23.field320 == this.field8044) {
            this.field720.SetRenderState(19, 5);
            this.field720.SetRenderState(20, 6);
        } else if (class161.field2443 == this.field8044) {
            this.field720.SetRenderState(19, 2);
            this.field720.SetRenderState(20, 2);
        } else if (class191.field2813 == this.field8044) {
            this.field720.SetRenderState(19, 9);
            this.field720.SetRenderState(20, 2);
        }
        if (!arg0) {
            this.method336(124);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()Lfea;")
    public final class127 method340() {
        D3DADAPTER_IDENTIFIER var1 = this.field710.method2543(this.field714, 0);
        return new class127(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "(I)V")
    public final void method341(int arg0) {
        if (arg0 == 22626) {
            int var2 = this.field724[this.field8043] ? method283(this.field8035[this.field8043], 4) : 1;
            this.field720.SetTextureStageState(this.field8043, 1, var2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V")
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II[BILkf;I)Lk;")
    public final class519 method343(int arg0, int arg1, byte[] arg2, int arg3, class229 arg4, int arg5) {
        int var7 = 63 / ((arg1) / 42);
        return new class329(this, arg4, arg0, arg3, arg5, arg2);
    }

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "()V")
    public final void method344() {
        this.method3250(true, false);
        this.field720.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lkf;BLps;)Z")
    public final boolean method345(class229 arg0, byte arg1, class82 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg1 != 40) {
            this.method287((byte) -29, null);
        }
        return class443.method2538(-1, this.field710.method2541(this.field714, var4)) && class443.method2538(-1, this.field710.CheckDeviceFormat(this.field714, this.field716, var4.Format, 0, 3, method359(arg2, false, arg0)));
    }

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "(B)V")
    public final void method346(byte arg0) {
        if (this.field7962) {
            field729[14] = 0.0F;
            field729[11] = 0.0F;
            field729[9] = 0.0F;
            field729[12] = 0.0F;
            field729[1] = 0.0F;
            field729[8] = 0.0F;
            field729[3] = 0.0F;
            field729[4] = 0.0F;
            field729[2] = 0.0F;
            field729[13] = 0.0F;
            field729[5] = 1.0F;
            field729[7] = 0.0F;
            field729[10] = 1.0F;
            field729[15] = 1.0F;
            field729[6] = 0.0F;
            field729[0] = 1.0F;
        } else {
            this.field7946.method2144(field729, 0);
        }
        this.field720.SetTransform(256, field729);
        if (arg0 != 23) {
            this.field720 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "(I)V")
    public final void method347(int arg0) {
        if (arg0 != 18415) {
            return;
        }
        if (this.field8027[this.field8043] == class283.field3934) {
            this.field720.SetTextureStageState(this.field8043, 24, 0);
            this.field725[this.field8043] = 0;
            return;
        }
        if (this.field8027[this.field8043] == class625.field8725) {
            this.field720.SetTransform(this.field8043 + 16, this.field8032[this.field8043].method2144(field729, 0));
        } else {
            this.field720.SetTransform(this.field8043 + 16, this.field8032[this.field8043].method2158(106, field729));
        }
        int var2 = method329(arg0 ^ 0xFF6, this.field8027[this.field8043]);
        if (this.field725[this.field8043] != var2) {
            this.field720.SetTextureStageState(this.field8043, 24, var2);
            this.field725[this.field8043] = var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLfl;)V")
    public final void method348(byte arg0, class677 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 == -62) {
            this.field720.SetVertexDeclaration(var3.field4389);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;B)Z")
    private static final boolean method349(int arg0, int arg1, int arg2, IDirect3D arg3, D3DPRESENT_PARAMETERS arg4, byte arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class443.method2539(arg3.method2541(arg1, var9), (byte) -92)) {
                return false;
            }
            label84: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field722.length; var10++) {
                        if (arg3.CheckDeviceType(arg1, arg2, var9.Format, field722[var10], true) == 0 && arg3.CheckDeviceFormat(arg1, arg2, var9.Format, 1, 1, field722[var10]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, field722[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field728.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg1, arg2, var9.Format, 2, 1, field728[var11]) == 0 && arg3.CheckDepthStencilMatch(arg1, arg2, var9.Format, field722[var10], field728[var11]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, field728[var10], true, var8) == 0)) {
                                    var7 = field722[var10];
                                    var6 = field728[var11];
                                    break label84;
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
            if (arg5 != 37) {
                field729 = null;
            }
            arg4.AutoDepthStencilFormat = var6;
            arg4.MultiSampleType = var8;
            arg4.MultiSampleQuality = 0;
            arg4.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method350(Canvas arg0, int arg1) {
        int var3 = 89 % ((9 - arg1) / 48);
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZILiv;)V")
    public final void method351(boolean arg0, boolean arg1, int arg2, class84 arg3) {
        if (!arg0) {
            return;
        }
        byte var6;
        if (arg2 == 1) {
            var6 = 6;
        } else if (arg2 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg1) {
            var7 |= 0x10;
        }
        this.field720.SetTextureStageState(this.field8043, var6, var7 | method338(arg3, 1));
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
    public final void method352(boolean arg0) {
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public final void method353(Canvas arg0, int arg1, Object arg2) {
        if (arg1 != 1) {
            field728 = null;
        }
        if (this.field7805 != arg0) {
            return;
        }
        Dimension var4 = arg0.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field720.EndScene();
            this.method312(arg1 + 29813);
            this.field720.BeginScene();
        }
    }

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "(I)V")
    public final void method354(int arg0) {
        if (arg0 > 22) {
            this.field720.method2559(137, this.field8018 && !this.field8058);
        }
    }

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "(I)V")
    public final void method355(int arg0) {
        if (this.field724[this.field8043]) {
            this.field724[this.field8043] = false;
            this.field720.SetTexture(this.field8043, null);
            this.method332(80);
            this.method341(22626);
        }
        if (arg0 != 6) {
            this.method321(5);
        }
    }

    @OriginalMember(owner = "client!vg", name = "SA", descriptor = "()I")
    public final int method356() {
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "(I)V")
    public final void method357(int arg0) {
        this.field720.SetRenderState(60, this.field8051);
        if (arg0 != 0) {
            this.method287((byte) -59, null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "()V")
    public final void method358() {
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lps;ZLkf;)I")
    public static final int method359(class82 arg0, boolean arg1, class229 arg2) {
        if (class82.field1147 == arg0) {
            if (class145.field2161 == arg2) {
                return 22;
            }
            if (class583.field8126 == arg2) {
                return 21;
            }
            if (class381.field5355 == arg2) {
                return 28;
            }
            if (class94.field1240 == arg2) {
                return 50;
            }
            if (class312.field4637 == arg2) {
                return 51;
            }
            if (class283.field3931 == arg2) {
                return 77;
            }
        }
        if (arg1) {
            method314(null, (byte) 114);
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!vg", name = "KA", descriptor = "(IIII)[I")
    public final int[] method360(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field720.method2551(0);
        IDirect3DSurface var7 = this.field720.method2560(arg2, arg3, 21, 0, 0, true);
        if (class443.method2538(-1, this.field720.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class443.method2538(-1, var7.LockRect(0, 0, arg2, arg3, 0, this.field715))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field715.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field715.method2565(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field715.method2565(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3440(21066);
        var7.method3440(21066);
        return var5;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLkf;IIII[F)Lhr;")
    public final class483 method361(int arg0, boolean arg1, class229 arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7) {
        return arg3 == 0 ? null : (class483) null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILeh;)V")
    public final void method362(int arg0, class329 arg1) {
        this.method309(104, arg1);
        if (!this.field735[this.field8043]) {
            this.field720.SetSamplerState(this.field8043, 1, 1);
            this.field735[this.field8043] = true;
        }
        if (!this.field727[this.field8043]) {
            this.field720.SetSamplerState(this.field8043, 2, 1);
            this.field727[this.field8043] = true;
        }
        if (arg0 != 27) {
            this.method309(-62, null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(II)Ltf;")
    public final class266 method363(int arg0, int arg1) {
        if (arg0 != -15892) {
            this.method333(15, (byte) 16);
        }
        if (arg1 == 3) {
            return new class33(this, this.field7799);
        } else if (arg1 == 4) {
            return new class655(this, this.field7799, this.field7810);
        } else {
            return super.method363(-15892, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (arg0 != 14) {
            this.field717 = null;
        }
        this.field720.SetScissorRect(this.field8009 + this.field7970, this.field8067 - -this.field8029, this.field7978, this.field8010);
    }

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "()V")
    public final void method365() throws class211 {
        this.field720.EndScene();
        if (this.field718.method2674(0)) {
            this.field712 = 0;
            if (class443.method2539(this.field718.method2676(0, (byte) 97), (byte) -108)) {
                this.method312(29814);
            }
        } else if (++this.field712 <= 50) {
            this.method312(29814);
        } else {
            throw new class211();
        }
        this.field720.BeginScene();
    }
}
