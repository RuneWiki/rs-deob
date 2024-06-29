import jaclib.peer.class624;
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
import jagdx.class447;
import jagdx.class448;
import jagdx.class449;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class332 {

    @OriginalMember(owner = "client!to", name = "Gg", descriptor = "I")
    private int field142 = 0;

    @OriginalMember(owner = "client!to", name = "Jg", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "client!to", name = "Cg", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!to", name = "Pg", descriptor = "Ljaclib/peer/pi;")
    public class624 field151;

    @OriginalMember(owner = "client!to", name = "Hg", descriptor = "Lgm;")
    private class109 field143;

    @OriginalMember(owner = "client!to", name = "vg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field131;

    @OriginalMember(owner = "client!to", name = "Og", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!to", name = "Ng", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field149;

    @OriginalMember(owner = "client!to", name = "Bg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field137;

    @OriginalMember(owner = "client!to", name = "zg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field135;

    @OriginalMember(owner = "client!to", name = "ug", descriptor = "Ljagdx/D3DLIGHT;")
    private class449 field130;

    @OriginalMember(owner = "client!to", name = "yg", descriptor = "Ljagdx/D3DLIGHT;")
    private class449 field134;

    @OriginalMember(owner = "client!to", name = "Eg", descriptor = "Ljagdx/D3DLIGHT;")
    private class449 field140;

    @OriginalMember(owner = "client!to", name = "Mg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field148;

    @OriginalMember(owner = "client!to", name = "Ag", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field136;

    @OriginalMember(owner = "client!to", name = "Fg", descriptor = "Z")
    public boolean field141;

    @OriginalMember(owner = "client!to", name = "Qg", descriptor = "Z")
    public boolean field152;

    @OriginalMember(owner = "client!to", name = "Ig", descriptor = "Z")
    public boolean field144;

    @OriginalMember(owner = "client!to", name = "wg", descriptor = "[Z")
    private boolean[] field132;

    @OriginalMember(owner = "client!to", name = "Ug", descriptor = "[Z")
    private boolean[] field156;

    @OriginalMember(owner = "client!to", name = "Rg", descriptor = "[Z")
    private boolean[] field153;

    @OriginalMember(owner = "client!to", name = "Lg", descriptor = "[Z")
    private boolean[] field147;

    @OriginalMember(owner = "client!to", name = "Tg", descriptor = "[I")
    private int[] field155;

    @OriginalMember(owner = "client!to", name = "Dg", descriptor = "[Ldca;")
    private class161[] field139;

    @OriginalMember(owner = "client!to", name = "xg", descriptor = "[I")
    private static int[] field133 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!to", name = "Kg", descriptor = "[I")
    private static int[] field146 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!to", name = "Sg", descriptor = "[F")
    private static float[] field154 = new float[16];

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V", line = 6)
    public final void method102(byte arg0) {
        int var2 = 64 / ((arg0 - 41) / 54);
        if (this.field5317) {
            field154[9] = 0.0F;
            field154[1] = 0.0F;
            field154[3] = 0.0F;
            field154[14] = 0.0F;
            field154[2] = 0.0F;
            field154[12] = 0.0F;
            field154[15] = 1.0F;
            field154[10] = 1.0F;
            field154[13] = 0.0F;
            field154[0] = 1.0F;
            field154[8] = 0.0F;
            field154[6] = 0.0F;
            field154[5] = 1.0F;
            field154[7] = 0.0F;
            field154[11] = 0.0F;
            field154[4] = 0.0F;
        } else {
            this.field5316.method3022(field154, 7);
        }
        this.field131.SetTransform(256, field154);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 41)
    public final void method103(Rectangle[] arg0, int arg1) throws class529 {
        this.method122();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lbg;I)V", line = 49)
    public final void method104(class430 arg0, int arg1) {
        this.field131.SetTexture(this.field5412, arg0.method575((byte) 97));
        if (this.field139[this.field5412] != arg0.field6546) {
            int var3 = method148(arg0.field6546, (byte) 51);
            this.field131.SetSamplerState(this.field5412, 6, var3);
            this.field131.SetSamplerState(this.field5412, 5, var3);
            this.field139[this.field5412] = arg0.field6546;
            if (arg0.field6550 != this.field156[this.field5412]) {
                this.field131.SetSamplerState(this.field5412, 7, arg0.field6550 ? method148(arg0.field6546, (byte) 10) : 0);
                this.field156[this.field5412] = arg0.field6550;
            }
        } else if (this.field156[this.field5412] != arg0.field6550) {
            this.field131.SetSamplerState(this.field5412, 7, arg0.field6550 ? method148(arg0.field6546, (byte) 86) : 0);
            this.field156[this.field5412] = arg0.field6550;
        }
        if (!this.field132[this.field5412]) {
            this.field132[this.field5412] = true;
            this.method183(7);
            this.method152(92);
        }
        if (arg1 != 6) {
            this.method105((byte) 87, null);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B[Lej;)Lqf;", line = 90)
    public final class633 method105(byte arg0, class108[] arg1) {
        if (arg0 <= 47) {
            this.method155(-107);
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZ)V", line = 100)
    public final void method106(int arg0, boolean arg1) {
        this.field131.method2832(161, arg1);
        if (arg0 != 8077) {
            this.field138 = 59;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILaa;)V", line = 111)
    public final void method107(int arg0, class451 arg1) {
        this.method104(arg1, 6);
        if (arg0 != 19) {
            this.method158(null, true);
        }
        if (this.field147[this.field5412] != arg1.field6780) {
            this.field131.SetSamplerState(this.field5412, 1, arg1.field6780 ? 1 : 3);
            this.field147[this.field5412] = arg1.field6780;
        }
        if (this.field153[this.field5412] != arg1.field6778) {
            this.field131.SetSamplerState(this.field5412, 2, arg1.field6778 ? 1 : 3);
            this.field153[this.field5412] = arg1.field6778;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lpw;I)I", line = 135)
    private static final int method108(class656 arg0, int arg1) {
        if (arg1 != 1) {
            return 102;
        } else if (class193.field3198 == arg0) {
            return 2;
        } else if (class286.field4548 == arg0) {
            return 3;
        } else if (class68.field873 == arg0) {
            return 1;
        } else if (class646.field9077 == arg0) {
            return 4;
        } else if (class654.field9145 == arg0) {
            return 6;
        } else if (class321.field5026 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!to", name = "l", descriptor = "(Z)V", line = 168)
    public final void method109(boolean arg0) {
        this.field131.SetViewport(this.field5415, this.field5345, this.field5305, this.field5195, 0.0F, 1.0F);
        if (arg0) {
            method165((byte) 119, null, null);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V", line = 177)
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLpw;)V", line = 182)
    public final void method111(int arg0, int arg1, byte arg2, class656 arg3) {
        if (arg2 != 13) {
            this.method107(-121, null);
        }
        this.field131.DrawPrimitive(method108(arg3, arg2 - 12), arg1, arg0);
    }

    @OriginalMember(owner = "client!to", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lri;Ljava/lang/Integer;)Lr;", line = 197)
    public static final class167 createToolkit(Canvas arg0, class214 arg1, class97 arg2, Integer arg3) {
        class8 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class624 var7 = new class624();
            IDirect3D var8 = IDirect3D.method2811(-2147483616, var7);
            D3DCAPS var9 = var8.method2812(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method141(var6, var8, false, var5, arg3, var10)) {
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
                    var13 = var8.method2810(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class448 var17) {
                    var13 = var8.method2810(var5, var6, arg0, var11 | 0x20, var10);
                }
                class109 var15 = new class109(var13.method2824(0), var13.method2821());
                var4 = new class8(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2269(24235);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method132();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!to", name = "n", descriptor = "(I)V", line = 299)
    public final void method112(int arg0) {
        if (arg0 != 0) {
            this.method168();
        }
        if (this.field5370[this.field5412] == class260.field4242) {
            this.field131.SetTextureStageState(this.field5412, 24, 0);
            this.field155[this.field5412] = 0;
            return;
        }
        if (this.field5370[this.field5412] == class163.field2748) {
            this.field131.SetTransform(this.field5412 + 16, this.field5333[this.field5412].method3022(field154, arg0 + 7));
        } else {
            this.field131.SetTransform(this.field5412 + 16, this.field5333[this.field5412].method3031(field154, false));
        }
        int var2 = method181((byte) 72, this.field5370[this.field5412]);
        if (this.field155[this.field5412] != var2) {
            this.field131.SetTextureStageState(this.field5412, 24, var2);
            this.field155[this.field5412] = var2;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(ZI)Lbo;", line = 331)
    public final class679 method113(boolean arg0, int arg1) {
        if (arg1 <= 124) {
            this.field130 = null;
        }
        return new class543(this, class134.field2198, arg0);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)V", line = 340)
    public final void method114(boolean arg0) {
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZIILos;[BII)Lmca;", line = 343)
    public final class29 method115(int arg0, boolean arg1, int arg2, int arg3, class408 arg4, byte[] arg5, int arg6, int arg7) {
        return arg7 == 2 ? new class451(this, arg4, arg3, arg0, arg1, arg5, arg2, arg6) : (class29) null;
    }

    @OriginalMember(owner = "client!to", name = "P", descriptor = "(I)V", line = 354)
    public final void method116(int arg0) {
        if (this.field5379.method697((byte) -108)) {
            this.field5322.method3022(field154, 7);
        } else {
            field154[10] = 1.0F;
            field154[0] = 1.0F;
            field154[11] = 0.0F;
            field154[4] = 0.0F;
            field154[13] = 0.0F;
            field154[15] = 1.0F;
            field154[12] = 0.0F;
            field154[8] = 0.0F;
            field154[2] = 0.0F;
            field154[3] = 0.0F;
            field154[5] = 1.0F;
            field154[9] = 0.0F;
            field154[14] = 0.0F;
            field154[1] = 0.0F;
            field154[7] = 0.0F;
            field154[6] = 0.0F;
        }
        if (arg0 >= -79) {
            this.field155 = null;
        }
        this.field131.SetTransform(2, field154);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lko;ZII)V", line = 402)
    public final void method117(class466 arg0, boolean arg1, int arg2, int arg3) {
        byte var6;
        if (arg2 == 1) {
            var6 = 6;
        } else if (arg2 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = arg3;
        if (arg1) {
            var7 = arg3 | 0x10;
        }
        this.field131.SetTextureStageState(this.field5412, var6, var7 | method151(arg0, (byte) -31));
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILos;I[BII)Lqw;", line = 435)
    public final class69 method118(int arg0, class408 arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        return arg0 == -30146 ? new class50(this, arg1, arg2, arg5, arg4, arg3) : (class69) null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ldd;Ldd;FLdd;)Ldd;", line = 445)
    public final class654 method119(class654 arg0, class654 arg1, float arg2, class654 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lpw;ILbo;IIII)V", line = 455)
    public final void method120(class656 arg0, int arg1, class679 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 116) {
            field133 = null;
        }
        this.field131.SetIndices(((class543) arg2).field7909);
        this.field131.DrawIndexedPrimitive(method108(arg0, 1), 0, arg6, arg1, arg3, arg5);
    }

    @OriginalMember(owner = "client!to", name = "ja", descriptor = "(I)V", line = 474)
    public final void method121(int arg0) {
        this.field131.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!to", name = "y", descriptor = "()V", line = 481)
    public final void method122() throws class529 {
        this.field131.EndScene();
        if (this.field143.method1026(0)) {
            this.field142 = 0;
            if (class447.method2813(this.field143.method1025(0, 0), 0)) {
                this.method179(-110);
            }
        } else if (++this.field142 <= 50) {
            this.method179(-128);
        } else {
            throw new class529();
        }
        this.field131.BeginScene();
    }

    @OriginalMember(owner = "client!to", name = "n", descriptor = "(B)V", line = 506)
    public final void method123(byte arg0) {
        if (arg0 != 87) {
            this.method156(2);
        }
        this.field131.method2832(28, this.field5392 && this.field5405 && this.field5340 >= 0);
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(Z)V", line = 516)
    public final void method124(boolean arg0) {
        this.field130.SetAmbient(this.field5344 * this.field5326, this.field5383 * this.field5344, this.field5351 * this.field5344, 0.0F);
        this.field145 = arg0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILmg;ILos;)Lmca;", line = 524)
    public final class29 method125(int arg0, int arg1, class134 arg2, int arg3, class408 arg4) {
        if (arg3 <= 102) {
            this.field151 = null;
        }
        return new class451(this, arg4, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!to", name = "C", descriptor = "(I)V", line = 534)
    public final void method126(int arg0) {
        this.field131.method2832(15, this.field5328);
        if (arg0 != 30688) {
            this.field139 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLqaa;)I", line = 544)
    private static final int method127(boolean arg0, class26 arg1) {
        if (class406.field6268 == arg1) {
            return 2;
        } else if (class646.field9074 == arg1) {
            return 4;
        } else if (class51.field681 == arg1) {
            return 26;
        } else if (class471.field6979 == arg1) {
            return 7;
        } else if (class636.field8947 == arg1) {
            return 10;
        } else if (arg0) {
            return -32;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!to", name = "q", descriptor = "(B)V", line = 573)
    public final void method128(byte arg0) {
        if (class494.field7216 == this.field5364) {
            this.field131.SetRenderState(19, 5);
            this.field131.SetRenderState(20, 6);
        } else if (class694.field9728 == this.field5364) {
            this.field131.SetRenderState(19, 2);
            this.field131.SetRenderState(20, 2);
        } else if (class252.field4024 == this.field5364) {
            this.field131.SetRenderState(19, 9);
            this.field131.SetRenderState(20, 2);
        }
        if (arg0 != 36) {
            this.method130(true);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[FIIIILos;Z)Lmca;", line = 602)
    public final class29 method129(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, class408 arg6, boolean arg7) {
        if (arg5 < 94) {
            this.field147 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!to", name = "k", descriptor = "(Z)V", line = 612)
    public final void method130(boolean arg0) {
        this.field131.SetRenderState(60, this.field5337);
        if (!arg0) {
            this.field147 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "DA", descriptor = "()I", line = 622)
    public final int method131() {
        return 0;
    }

    @OriginalMember(owner = "client!to", name = "x", descriptor = "()V", line = 631)
    public final void method132() {
        this.field151.method3639(false);
        super.method132();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 639)
    public final void method133(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 <= 111) {
            this.field155 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "()Z", line = 648)
    public final boolean method134() {
        return false;
    }

    @OriginalMember(owner = "client!to", name = "j", descriptor = "()V", line = 654)
    public final void method135() {
    }

    @OriginalMember(owner = "client!to", name = "ya", descriptor = "()V", line = 657)
    public final void method136() {
        this.method2224((byte) -18, true);
        this.field131.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILqf;)V", line = 665)
    public final void method137(int arg0, class633 arg1) {
        if (arg0 > -50) {
            this.field141 = true;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field131.SetVertexDeclaration(var3.field4633);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 677)
    public final void method138(Object arg0, Canvas arg1, byte arg2) {
        if (this.field5260 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field131.EndScene();
                this.method179(-106);
                this.field131.BeginScene();
            }
        }
        if (arg2 <= 126) {
            field154 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lgda;I)V", line = 703)
    public final void method139(class50 arg0, int arg1) {
        this.method104(arg0, 6);
        if (arg1 >= -105) {
            field154 = null;
        }
        if (!this.field147[this.field5412]) {
            this.field131.SetSamplerState(this.field5412, 1, 1);
            this.field147[this.field5412] = true;
        }
        if (!this.field153[this.field5412]) {
            this.field131.SetSamplerState(this.field5412, 2, 1);
            this.field153[this.field5412] = true;
        }
    }

    @OriginalMember(owner = "client!to", name = "S", descriptor = "(I)V", line = 727)
    public final void method140(int arg0) {
        if (arg0 <= 13) {
            this.method136();
        }
        this.field131.SetScissorRect(this.field5415 + this.field5330, this.field5349 + this.field5345, this.field5343, this.field5341);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjagdx/IDirect3D;ZIILjagdx/D3DPRESENT_PARAMETERS;)Z", line = 741)
    private static final boolean method141(int arg0, IDirect3D arg1, boolean arg2, int arg3, int arg4, D3DPRESENT_PARAMETERS arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (arg2) {
            field146 = null;
        }
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class447.method2813(arg1.method2809(arg3, var9), 0)) {
                return false;
            }
            label80: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var10 = 0; var10 < field146.length; var10++) {
                        if (arg1.CheckDeviceType(arg3, arg0, var9.Format, field146[var10], true) == 0 && arg1.CheckDeviceFormat(arg3, arg0, var9.Format, 1, 1, field146[var10]) == 0 && (arg4 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg0, field146[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field133.length; var11++) {
                                if (arg1.CheckDeviceFormat(arg3, arg0, var9.Format, 2, 1, field133[var11]) == 0 && arg1.CheckDepthStencilMatch(arg3, arg0, var9.Format, field146[var10], field133[var11]) == 0 && (arg4 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg0, field133[var10], true, var8) == 0)) {
                                    var6 = field133[var11];
                                    var7 = field146[var10];
                                    break label80;
                                }
                            }
                        }
                    }
                }
                arg4--;
            }
            if (arg4 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg5.MultiSampleType = var8;
            arg5.BackBufferFormat = var7;
            arg5.AutoDepthStencilFormat = var6;
            arg5.MultiSampleQuality = 0;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([IIZIIII)Lmca;", line = 844)
    public final class29 method142(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 101 % ((arg1 - 72) / 42);
        return new class451(this, arg6, arg3, arg2, arg0, arg5, arg4);
    }

    @OriginalMember(owner = "client!to", name = "g", descriptor = "()V", line = 854)
    public final void method143() {
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(FFF)V", line = 856)
    public final void method144(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(B)V", line = 860)
    public final void method145(byte arg0) {
        this.method180(93);
        this.method172((byte) 71);
        if (arg0 != -35) {
            this.method164(null, null, -19);
        }
    }

    @OriginalMember(owner = "client!to", name = "h", descriptor = "(IIII)[I", line = 872)
    public final int[] method146(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field131.method2822(0);
        IDirect3DSurface var7 = this.field131.method2817(arg2, arg3, 21, 0, 0, true);
        if (class447.method2814(this.field131.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 141953135) && class447.method2814(var7.LockRect(0, 0, arg2, arg3, 0, this.field148), 141953135)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field148.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field148.method2836(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field148.method2836(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3643(false);
        var7.method3643(false);
        return var5;
    }

    @OriginalMember(owner = "client!to", name = "j", descriptor = "(I)V", line = 913)
    public final void method147(int arg0) {
        this.field5391 = (this.field5397 - this.field5329);
        this.field5380 = this.field5391 - (float) this.field5340;
        if (this.field5380 < (float) this.field5393) {
            this.field5380 = this.field5393;
        }
        this.field131.method2826(36, this.field5380);
        this.field131.method2826(37, this.field5391);
        this.field131.SetRenderState(34, this.field5411);
        if (arg0 != -24255) {
            this.field130 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ldca;B)I", line = 931)
    private static final int method148(class161 arg0, byte arg1) {
        if (arg1 < 4) {
            method108(null, -112);
        }
        if (class379.field5910 == arg0) {
            return 2;
        } else if (class123.field2045 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!to", name = "p", descriptor = "(B)V", line = 951)
    public final void method149(byte arg0) {
        if (arg0 != -19) {
            this.method132();
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 966)
    public final void method150(Canvas arg0, byte arg1, Object arg2) {
        if (arg1 != -85) {
            this.field143 = null;
        }
        this.field143 = (class109) arg2;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lko;B)I", line = 976)
    private static final int method151(class466 arg0, byte arg1) {
        if (arg1 != -31) {
            method141(52, null, false, 16, 82, null);
        }
        if (class622.field8779 == arg0) {
            return 2;
        } else if (class24.field409 == arg0) {
            return 0;
        } else if (class692.field9702 == arg0) {
            return 1;
        } else if (class471.field6974 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!to", name = "i", descriptor = "(I)V", line = 1003)
    public final void method152(int arg0) {
        int var2 = this.field132[this.field5412] ? method127(false, this.field5357[this.field5412]) : 1;
        if (arg0 <= 70) {
            this.method159(54);
        }
        this.field131.SetTextureStageState(this.field5412, 1, var2);
    }

    @OriginalMember(owner = "client!to", name = "o", descriptor = "(I)V", line = 1015)
    public final void method153(int arg0) {
        if (arg0 != 20021) {
            this.field130 = null;
        }
        this.field131.SetTransform(3, this.field5366);
    }

    @OriginalMember(owner = "client!to", name = "y", descriptor = "(I)V", line = 1030)
    public final void method154(int arg0) {
        int var2 = 0;
        if (arg0 > -71) {
            this.field140 = null;
        }
        while (var2 < this.field5356) {
            class674 var3 = this.field5406[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3854(-1);
            float var6 = var3.method3856((byte) -38) / 255.0F;
            this.field140.SetPosition((float) var3.method3857((byte) -35), (float) var3.method3851((byte) 123), (float) var3.method3859((byte) 117));
            this.field140.SetDiffuse((float) ((var5 & 0xFFAD1F) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field140.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3860((byte) -127) * var3.method3860((byte) -127)));
            this.field140.SetRange((float) var3.method3860((byte) -119));
            this.field131.SetLight(var4, this.field140);
            this.field131.LightEnable(var4, true);
            var2++;
        }
        while (var2 < this.field5413) {
            this.field131.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method154(-95);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 1068)
    public final synchronized void method155(int arg0) {
        this.field151.method3642(12906);
        super.method155(arg0);
    }

    @OriginalMember(owner = "client!to", name = "U", descriptor = "(I)V", line = 1077)
    public final void method156(int arg0) {
        int var2 = -63 % ((-arg0 - 33) / 60);
        this.field131.method2832(137, this.field5398 && !this.field5334);
    }

    @OriginalMember(owner = "client!to", name = "l", descriptor = "(B)V", line = 1085)
    public final void method157(byte arg0) {
        if (arg0 > -105) {
            this.field132 = null;
        }
        this.field131.method2832(27, this.field5401);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/pi;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lgm;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lri;I)V", line = 1286)
    private class8(int arg0, int arg1, Canvas arg2, class624 arg3, IDirect3D arg4, IDirect3DDevice arg5, class109 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class214 arg9, class97 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field138 = arg0;
        this.field151 = arg3;
        this.field143 = arg6;
        this.field131 = arg5;
        this.field150 = arg1;
        this.field149 = arg4;
        this.field137 = arg7;
        this.field135 = arg8;
        this.field130 = new class449(this.field151);
        this.field134 = new class449(this.field151);
        this.field140 = new class449(this.field151);
        this.field148 = new PixelBuffer(this.field151);
        this.field136 = new GeometryBuffer(this.field151);
        new GeometryBuffer(this.field151);
        this.field141 = (this.field135.TextureCaps & 0x4000) != 0;
        this.field5359 = this.field135.MaxSimultaneousTextures;
        this.field5416 = (this.field135.TextureCaps & 0x2000) != 0;
        this.field152 = (this.field135.TextureCaps & 0x10000) != 0;
        this.field144 = (this.field135.TextureCaps & 0x2) == 0;
        this.field5409 = (this.field135.TextureCaps & 0x800) != 0;
        this.field5387 = this.field135.MaxActiveLights > 0 ? this.field135.MaxActiveLights : 8;
        this.field5410 = this.field5346 > 0 || this.field149.CheckDeviceMultiSampleType(this.field138, this.field150, this.field137.BackBufferFormat, true, 2) == 0;
        this.field132 = new boolean[this.field5359];
        this.field156 = new boolean[this.field5359];
        this.field153 = new boolean[this.field5359];
        this.field147 = new boolean[this.field5359];
        this.field155 = new int[this.field5359];
        this.field139 = new class161[this.field5359];
        this.field131.BeginScene();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lf;Z)V", line = 1097)
    public final void method158(class702 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!to", name = "N", descriptor = "(I)V", line = 1103)
    public final void method159(int arg0) {
        if (this.field132[this.field5412]) {
            this.field132[this.field5412] = false;
            this.field131.SetTexture(this.field5412, null);
            this.method183(7);
            this.method152(123);
        }
        if (arg0 > -47) {
            this.field144 = false;
        }
    }

    @OriginalMember(owner = "client!to", name = "m", descriptor = "()Lfe;", line = 1121)
    public final class530 method160() {
        D3DADAPTER_IDENTIFIER var1 = this.field149.method2808(this.field138, 0);
        return new class530(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(II)Lia;", line = 1129)
    public final class546 method161(int arg0, int arg1) {
        if (arg1 != 5299) {
            return (class546) null;
        } else if (arg0 == 3) {
            return new class84(this, this.field5179);
        } else if (arg0 == 4) {
            return new class323(this, this.field5179, this.field5207);
        } else if (arg0 == 8) {
            return new class309(this, this.field5179, this.field5207);
        } else {
            return super.method161(arg0, 5299);
        }
    }

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(Z)F", line = 1171)
    public final float method162(boolean arg0) {
        if (!arg0) {
            this.field135 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLqs;)V", line = 1182)
    public final void method163(boolean arg0, class560 arg1) {
        int var3 = 0;
        if (!arg0) {
            this.field148 = null;
        }
        if (class341.field5524 == arg1) {
            var3 = 65536;
        } else if (class74.field936 == arg1) {
            var3 = 131072;
        } else if (class304.field4782 == arg1) {
            var3 = 196608;
        }
        this.field131.SetTextureStageState(this.field5412, 11, this.field5412 | var3);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lmg;Los;I)Z", line = 1205)
    public final boolean method164(class134 arg0, class408 arg1, int arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 <= 86) {
            this.field150 = 58;
        }
        return class447.method2814(this.field149.method2809(this.field138, var4), 141953135) && class447.method2814(this.field149.CheckDeviceFormat(this.field138, this.field150, var4.Format, 0, 3, method165((byte) -87, arg0, arg1)), 141953135);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLmg;Los;)I", line = 1216)
    public static final int method165(byte arg0, class134 arg1, class408 arg2) {
        if (class134.field2197 == arg1) {
            if (class189.field3150 == arg2) {
                return 22;
            }
            if (class86.field1055 == arg2) {
                return 21;
            }
            if (class203.field3311 == arg2) {
                return 28;
            }
            if (class442.field6728 == arg2) {
                return 50;
            }
            if (class135.field2205 == arg2) {
                return 51;
            }
            if (class436.field6648 == arg2) {
                return 77;
            }
        }
        if (arg0 > -74) {
            method127(true, null);
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V", line = 1256)
    public final void method166(byte arg0) {
        int var2 = 74 % ((arg0 + 9) / 47);
        this.field131.method2832(14, this.field5394 && this.field5402);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 1267)
    public final Object method167(int arg0, Canvas arg1) {
        if (arg0 < 101) {
            this.field156 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!to", name = "z", descriptor = "()Z", line = 1278)
    public final boolean method168() {
        return false;
    }

    @OriginalMember(owner = "client!to", name = "v", descriptor = "(I)V", line = 1329)
    public final void method169(int arg0) {
        for (int var2 = 0; var2 < this.field5359; var2++) {
            this.field131.SetSamplerState(var2, 7, 0);
            this.field131.SetSamplerState(var2, 6, 2);
            this.field131.SetSamplerState(var2, 5, 2);
            this.field131.SetSamplerState(var2, 1, 1);
            this.field131.SetSamplerState(var2, 2, 1);
            this.field139[var2] = class379.field5910;
            this.field147[var2] = this.field153[var2] = true;
            this.field156[var2] = false;
            this.field155[var2] = 0;
        }
        this.field131.SetTextureStageState(0, 6, 1);
        this.field131.SetRenderState(9, 2);
        this.field131.SetRenderState(23, 4);
        this.field131.SetRenderState(25, 5);
        if (arg0 >= -13) {
            this.method107(-43, null);
        }
        this.field131.SetRenderState(24, 0);
        this.field131.SetRenderState(22, 2);
        this.field131.SetRenderState(147, 1);
        this.field131.SetRenderState(145, 1);
        this.field131.method2826(38, 0.95F);
        this.field131.SetRenderState(140, 3);
        this.field130.SetType(3);
        this.field134.SetType(3);
        this.field140.SetType(1);
        this.field145 = false;
        super.method169(-32);
    }

    @OriginalMember(owner = "client!to", name = "s", descriptor = "()V", line = 1369)
    public final void method170() {
        IDirect3DEventQuery var1 = this.field131.method2830();
        if (class447.method2814(var1.Issue(), 141953135)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3643(false);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZZ[[II)Lpfa;", line = 1397)
    public final class270 method171(boolean arg0, boolean arg1, int[][] arg2, int arg3) {
        if (!arg1) {
            this.field142 = 65;
        }
        return new class637(this, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V", line = 1408)
    public final void method172(byte arg0) {
        if (!this.field145) {
            this.field131.LightEnable(0, false);
            this.field131.LightEnable(1, false);
            this.field131.SetLight(0, this.field130);
            this.field131.SetLight(1, this.field134);
            this.field131.LightEnable(0, true);
            this.field131.LightEnable(1, true);
            this.field145 = true;
        }
        int var2 = -8 % ((-arg0 - 2) / 43);
    }

    @OriginalMember(owner = "client!to", name = "h", descriptor = "(II)V", line = 1428)
    public final void method173(int arg0, int arg1) {
        this.field131.SetTextureStageState(this.field5412, 11, arg1);
        if (arg0 != 16316) {
            this.field140 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(ZI)Log;", line = 1438)
    public final class601 method174(boolean arg0, int arg1) {
        if (arg1 < 58) {
            this.field142 = 75;
        }
        return new class241(this, arg0);
    }

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "(I)V", line = 1448)
    public final void method175(int arg0) {
        if (arg0 == -13617) {
            this.field131.method2832(174, this.field5447);
        }
    }

    @OriginalMember(owner = "client!to", name = "A", descriptor = "()V", line = 1457)
    public final void method176() {
    }

    @OriginalMember(owner = "client!to", name = "bb", descriptor = "(I)V", line = 1460)
    public final void method177(int arg0) {
        if (arg0 == -29670) {
            this.field131.method2832(7, this.field5331);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Log;II)V", line = 1472)
    public final void method178(class601 arg0, int arg1, int arg2) {
        class241 var4 = (class241) arg0;
        this.field131.SetStreamSource(arg1, var4.field3814, 0, var4.method1731(-29095));
        int var5 = 101 / ((arg2 + 2) / 52);
    }

    @OriginalMember(owner = "client!to", name = "cb", descriptor = "(I)Z", line = 1483)
    private final boolean method179(int arg0) {
        int var2 = this.field131.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class109 var3 = (class109) this.field5224;
            this.method2239(-25976);
            var3.method1023(105);
            this.field137.BackBufferWidth = 0;
            this.field137.BackBufferHeight = 0;
            if (method141(this.field150, this.field149, false, this.field138, this.field5346, this.field137)) {
                int var4 = this.field131.Reset(this.field137);
                if (class447.method2814(var4, 141953135)) {
                    var3.method1024(0, this.field131.method2821(), this.field131.method2824(0));
                    this.method2294(101);
                    this.method169(-31);
                    return true;
                }
            }
        }
        if (arg0 >= -104) {
            this.field147 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "u", descriptor = "(I)V", line = 1523)
    public final void method180(int arg0) {
        float var2 = this.field5386 ? this.field5369 : 0.0F;
        float var3 = this.field5386 ? -this.field5408 : 0.0F;
        this.field130.SetDiffuse(this.field5326 * var2, this.field5383 * var2, this.field5351 * var2, 0.0F);
        this.field134.SetDiffuse(this.field5326 * var3, this.field5383 * var3, this.field5351 * var3, 0.0F);
        if (arg0 > 87) {
            this.field145 = false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLcf;)I", line = 1538)
    private static final int method181(byte arg0, class561 arg1) {
        if (class618.field8746 == arg1) {
            return 1;
        } else if (class386.field5995 == arg1) {
            return 2;
        } else if (class55.field723 == arg1) {
            return 3;
        } else if (class163.field2748 == arg1) {
            return 4;
        } else if (class313.field4914 == arg1) {
            return 256;
        } else {
            if (arg0 != 72) {
                field146 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "()V", line = 1567)
    public final void method182() {
    }

    @OriginalMember(owner = "client!to", name = "H", descriptor = "(I)V", line = 1570)
    public final void method183(int arg0) {
        if (arg0 == 7) {
            int var2 = this.field132[this.field5412] ? method127(false, this.field5339[this.field5412]) : 1;
            this.field131.SetTextureStageState(this.field5412, 4, var2);
        }
    }

    @OriginalMember(owner = "client!to", name = "G", descriptor = "(I)V", line = 1582)
    public final void method184(int arg0) {
        this.field130.SetDirection(-this.field5423[0], -this.field5423[1], -this.field5423[2]);
        if (arg0 != 4) {
            field146 = null;
        }
        this.field134.SetDirection(-this.field5399[0], -this.field5399[1], -this.field5399[2]);
        this.field145 = false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lko;IZZB)V", line = 1596)
    public final void method185(class466 arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        int var6 = 0;
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg3) {
            var6 |= 0x20;
        }
        if (arg2) {
            var6 |= 0x10;
        }
        this.field131.SetTextureStageState(this.field5412, var8, method151(arg0, (byte) -31) | var6);
        if (arg4 != 106) {
            this.method128((byte) 26);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Los;Lmg;B)Z", line = 1647)
    public final boolean method186(class408 arg0, class134 arg1, byte arg2) {
        if (arg2 >= -1) {
            this.method166((byte) 64);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class447.method2814(this.field149.method2809(this.field138, var4), 141953135) && class447.method2814(this.field149.CheckDeviceFormat(this.field138, this.field150, var4.Format, 0, 4, method165((byte) -114, arg1, arg0)), 141953135);
    }
}
