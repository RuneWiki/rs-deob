import jaclib.peer.class339;
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
import jagdx.class670;
import jagdx.class671;
import jagdx.class672;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class13 extends class495 {

    @OriginalMember(owner = "client!oe", name = "Fg", descriptor = "Z")
    private boolean field164 = false;

    @OriginalMember(owner = "client!oe", name = "Pg", descriptor = "I")
    private int field174 = 0;

    @OriginalMember(owner = "client!oe", name = "xg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field156;

    @OriginalMember(owner = "client!oe", name = "Vg", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!oe", name = "vg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field154;

    @OriginalMember(owner = "client!oe", name = "zg", descriptor = "Llg;")
    private class191 field158;

    @OriginalMember(owner = "client!oe", name = "wg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field155;

    @OriginalMember(owner = "client!oe", name = "Dg", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!oe", name = "Qg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field175;

    @OriginalMember(owner = "client!oe", name = "Hg", descriptor = "Ljaclib/peer/jd;")
    public class339 field166;

    @OriginalMember(owner = "client!oe", name = "Kg", descriptor = "Ljagdx/D3DLIGHT;")
    private class670 field169;

    @OriginalMember(owner = "client!oe", name = "Bg", descriptor = "Ljagdx/D3DLIGHT;")
    private class670 field160;

    @OriginalMember(owner = "client!oe", name = "Mg", descriptor = "Ljagdx/D3DLIGHT;")
    private class670 field171;

    @OriginalMember(owner = "client!oe", name = "yg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field157;

    @OriginalMember(owner = "client!oe", name = "Ig", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field167;

    @OriginalMember(owner = "client!oe", name = "Rg", descriptor = "Z")
    public boolean field176;

    @OriginalMember(owner = "client!oe", name = "Cg", descriptor = "Z")
    public boolean field161;

    @OriginalMember(owner = "client!oe", name = "Tg", descriptor = "Z")
    public boolean field178;

    @OriginalMember(owner = "client!oe", name = "Sg", descriptor = "[I")
    private int[] field177;

    @OriginalMember(owner = "client!oe", name = "Ng", descriptor = "[Z")
    private boolean[] field172;

    @OriginalMember(owner = "client!oe", name = "Og", descriptor = "[Z")
    private boolean[] field173;

    @OriginalMember(owner = "client!oe", name = "Jg", descriptor = "[Z")
    private boolean[] field168;

    @OriginalMember(owner = "client!oe", name = "Eg", descriptor = "[Ltn;")
    private class166[] field163;

    @OriginalMember(owner = "client!oe", name = "Ug", descriptor = "[Z")
    private boolean[] field179;

    @OriginalMember(owner = "client!oe", name = "Lg", descriptor = "[I")
    private static int[] field170 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!oe", name = "Ag", descriptor = "[I")
    private static int[] field159 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!oe", name = "Gg", descriptor = "[F")
    private static float[] field165 = new float[16];

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "()V")
    public final void method67() {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lf;Z)V")
    public final void method68(class257 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!oe", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lvo;Ljava/lang/Integer;)Lr;")
    public static final class98 createToolkit(Canvas arg0, class615 arg1, class345 arg2, Integer arg3) {
        class13 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class339 var7 = new class339();
            IDirect3D var8 = IDirect3D.method3787(-2147483616, var7);
            D3DCAPS var9 = var8.method3786(var5, var6);
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
                if (!method127(var5, var10, var8, false, arg3, var6)) {
                    throw new RuntimeException("");
                }
                var10.Windowed = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                var10.EnableAutoDepthStencil = true;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method3783(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class671 var17) {
                    var13 = var8.method3783(var5, var6, arg0, var11 | 0x20, var10);
                }
                class191 var15 = new class191(var13.method3796(0), var13.method3799());
                var4 = new class13(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2919(-115);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method105();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "(B)V")
    public final void method69(byte arg0) {
        this.field154.method3805(137, this.field7345 && !this.field7290);
        if (arg0 > -111) {
            this.field174 = 66;
        }
    }

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "(B)V")
    public final void method70(byte arg0) {
        int var2 = 45 % ((arg0 - 34) / 36);
        this.field154.SetRenderState(60, this.field7375);
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(B)V")
    public final void method71(byte arg0) {
        for (int var2 = 0; var2 < this.field7348; var2++) {
            this.field154.SetSamplerState(var2, 7, 0);
            this.field154.SetSamplerState(var2, 6, 2);
            this.field154.SetSamplerState(var2, 5, 2);
            this.field154.SetSamplerState(var2, 1, 1);
            this.field154.SetSamplerState(var2, 2, 1);
            this.field163[var2] = class484.field6901;
            this.field168[var2] = this.field172[var2] = true;
            this.field179[var2] = false;
            this.field177[var2] = 0;
        }
        this.field154.SetTextureStageState(0, 6, 1);
        this.field154.SetRenderState(9, 2);
        this.field154.SetRenderState(23, 4);
        this.field154.SetRenderState(25, 5);
        this.field154.SetRenderState(24, 0);
        this.field154.SetRenderState(22, 2);
        this.field154.SetRenderState(147, 1);
        if (arg0 >= -40) {
            this.method103(null, null, 14, -120, (byte) 29);
        }
        this.field154.SetRenderState(145, 1);
        this.field154.method3801(38, 0.95F);
        this.field154.SetRenderState(140, 3);
        this.field169.SetType(3);
        this.field160.SetType(3);
        this.field171.SetType(1);
        this.field164 = false;
        super.method71((byte) -80);
    }

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "(I)V")
    public final void method72(int arg0) {
        if (!this.field164) {
            this.field154.LightEnable(0, false);
            this.field154.LightEnable(1, false);
            this.field154.SetLight(0, this.field169);
            this.field154.SetLight(1, this.field160);
            this.field154.LightEnable(0, true);
            this.field154.LightEnable(1, true);
            this.field164 = true;
        }
        if (arg0 != -4) {
            this.method124(-90);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZILct;Z)V")
    public final void method73(boolean arg0, int arg1, class479 arg2, boolean arg3) {
        int var5 = 0;
        byte var7;
        if (arg1 == 1) {
            var7 = 6;
        } else if (arg1 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg0) {
            var5 |= 0x10;
        }
        this.field154.SetTextureStageState(this.field7328, var7, var5 | method85(arg2, arg3));
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIILgca;)V")
    public final void method74(byte arg0, int arg1, int arg2, class627 arg3) {
        this.field154.DrawPrimitive(method135(arg3, 0), arg2, arg1);
        int var5 = 113 / ((arg0 - 21) / 45);
    }

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "(I)V")
    public final void method75(int arg0) {
        int var2 = this.field173[this.field7328] ? method136(this.field7343[this.field7328], 26) : 1;
        if (arg0 == 0) {
            this.field154.SetTextureStageState(this.field7328, 1, var2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "(I)V")
    public final void method76(int arg0) {
        this.field7322 = (this.field7283 - this.field7300);
        this.field7315 = this.field7322 - (float) this.field7317;
        if (this.field7315 < (float) this.field7321) {
            this.field7315 = this.field7321;
        }
        this.field154.method3801(36, this.field7315);
        this.field154.method3801(37, this.field7322);
        this.field154.SetRenderState(34, this.field7332);
        if (arg0 != 0) {
            this.field156 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "()Lsr;")
    public final class568 method77() {
        D3DADAPTER_IDENTIFIER var1 = this.field156.method3785(this.field162, 0);
        return new class568(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "(B)V")
    public final void method78(byte arg0) {
        int var2 = 11 % ((arg0 + 10) / 49);
        if (class22.field302 == this.field7309) {
            this.field154.SetRenderState(19, 5);
            this.field154.SetRenderState(20, 6);
        } else if (class450.field6493 == this.field7309) {
            this.field154.SetRenderState(19, 2);
            this.field154.SetRenderState(20, 2);
        } else if (class703.field9949 == this.field7309) {
            this.field154.SetRenderState(19, 9);
            this.field154.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(II)Lcf;")
    public final class135 method79(int arg0, int arg1) {
        if (arg0 != 5076) {
            return (class135) null;
        } else if (arg1 == 3) {
            return new class182(this, this.field7257);
        } else if (arg1 == 4) {
            return new class504(this, this.field7257, this.field7112);
        } else if (arg1 == 8) {
            return new class48(this, this.field7257, this.field7112);
        } else {
            return super.method79(5076, arg1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(FFF)V")
    public final void method80(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/jd;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Llg;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lvo;I)V")
    private class13(int arg0, int arg1, Canvas arg2, class339 arg3, IDirect3D arg4, IDirect3DDevice arg5, class191 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class615 arg9, class345 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field156 = arg4;
        this.field180 = arg1;
        this.field154 = arg5;
        this.field158 = arg6;
        this.field155 = arg8;
        this.field162 = arg0;
        this.field175 = arg7;
        this.field166 = arg3;
        this.field169 = new class670(this.field166);
        this.field160 = new class670(this.field166);
        this.field171 = new class670(this.field166);
        this.field157 = new PixelBuffer(this.field166);
        this.field167 = new GeometryBuffer(this.field166);
        new GeometryBuffer(this.field166);
        this.field7379 = (this.field155.TextureCaps & 0x2000) != 0;
        this.field176 = (this.field155.TextureCaps & 0x4000) != 0;
        this.field7367 = this.field155.MaxActiveLights > 0 ? this.field155.MaxActiveLights : 8;
        this.field161 = (this.field155.TextureCaps & 0x2) == 0;
        this.field7348 = this.field155.MaxSimultaneousTextures;
        this.field178 = (this.field155.TextureCaps & 0x10000) != 0;
        this.field7323 = (this.field155.TextureCaps & 0x800) != 0;
        this.field7320 = this.field7289 > 0 || this.field156.CheckDeviceMultiSampleType(this.field162, this.field180, this.field175.BackBufferFormat, true, 2) == 0;
        this.field177 = new int[this.field7348];
        this.field172 = new boolean[this.field7348];
        this.field173 = new boolean[this.field7348];
        this.field168 = new boolean[this.field7348];
        this.field163 = new class166[this.field7348];
        this.field179 = new boolean[this.field7348];
        this.field154.BeginScene();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method81(int arg0, Object arg1, Canvas arg2) {
        if (arg0 >= -68) {
            this.method125(null, 112);
        }
        this.field158 = (class191) arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ltn;B)I")
    private static final int method82(class166 arg0, byte arg1) {
        if (arg1 != 104) {
            return 116;
        } else if (class484.field6901 == arg0) {
            return 2;
        } else if (class28.field391 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpa;Lpa;FLpa;)Lpa;")
    public final class587 method83(class587 arg0, class587 arg1, float arg2, class587 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "(I)F")
    public final float method84(int arg0) {
        if (arg0 <= 104) {
            this.method109(null, null, false);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lct;Z)I")
    private static final int method85(class479 arg0, boolean arg1) {
        if (arg1) {
            field165 = null;
        }
        if (class171.field2763 == arg0) {
            return 2;
        } else if (class521.field7683 == arg0) {
            return 0;
        } else if (class51.field669 == arg0) {
            return 1;
        } else if (class450.field6484 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "(I)V")
    public final void method86(int arg0) {
        int var2;
        for (var2 = arg0; var2 < this.field7339; var2++) {
            class289 var3 = this.field7356[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1774(44);
            float var6 = var3.method1777(arg0 - 4) / 255.0F;
            this.field171.SetPosition((float) var3.method1776((byte) -116), (float) var3.method1775((byte) 109), (float) var3.method1771(true));
            this.field171.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFF7E) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field171.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1772(true) * var3.method1772(true)));
            this.field171.SetRange((float) var3.method1772(true));
            this.field154.SetLight(var4, this.field171);
            this.field154.LightEnable(var4, true);
        }
        while (var2 < this.field7378) {
            this.field154.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method86(0);
    }

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "()V")
    public final void method87() throws class300 {
        this.field154.EndScene();
        if (this.field158.method1353(-115)) {
            this.field174 = 0;
            if (class672.method3807(this.field158.method1352(-121, 0), -1)) {
                this.method121(true);
            }
        } else if (++this.field174 <= 50) {
            this.method121(true);
        } else {
            throw new class300();
        }
        this.field154.BeginScene();
    }

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "()V")
    public final void method88() {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method89(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 >= -39) {
            this.method130(104, true, (byte) 99, -117, null, 106, null, -109);
        }
    }

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "(I)V")
    public final void method90(int arg0) {
        if (arg0 >= -92) {
            this.method88();
        }
        this.field154.method3805(14, this.field7347 && this.field7282);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljb;ILqda;)Z")
    public final boolean method91(class666 arg0, int arg1, class689 arg2) {
        if (arg1 != 16674) {
            this.method103(null, null, 0, -58, (byte) 13);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class672.method3806(-109, this.field156.method3784(this.field162, var4)) && class672.method3806(arg1 ^ 0x4148, this.field156.CheckDeviceFormat(this.field162, this.field180, var4.Format, 0, 3, method112(arg2, false, arg0)));
    }

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (this.field7374.method672(true)) {
            this.field7276.method181(field165, arg0 - 15022);
        } else {
            field165[2] = 0.0F;
            field165[1] = 0.0F;
            field165[12] = 0.0F;
            field165[8] = 0.0F;
            field165[7] = 0.0F;
            field165[13] = 0.0F;
            field165[5] = 1.0F;
            field165[4] = 0.0F;
            field165[11] = 0.0F;
            field165[0] = 1.0F;
            field165[6] = 0.0F;
            field165[3] = 0.0F;
            field165[14] = 0.0F;
            field165[10] = 1.0F;
            field165[9] = 0.0F;
            field165[15] = 1.0F;
        }
        if (arg0 != 25551) {
            this.method132(true, null);
        }
        this.field154.SetTransform(2, field165);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method93(Rectangle[] arg0, int arg1) throws class300 {
        this.method87();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z[[IIB)Lhba;")
    public final class639 method94(boolean arg0, int[][] arg1, int arg2, byte arg3) {
        if (arg3 != 5) {
            field165 = null;
        }
        return new class592(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "()Z")
    public final boolean method95() {
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjb;I[BZI)Lwca;")
    public final class36 method96(int arg0, class666 arg1, int arg2, byte[] arg3, boolean arg4, int arg5) {
        if (arg4) {
            this.method130(0, true, (byte) 74, 34, null, 51, null, -71);
        }
        return new class87(this, arg1, arg2, arg0, arg5, arg3);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLdt;)V")
    public final void method98(byte arg0, class573 arg1) {
        int var3 = 126 % ((-arg0 - 45) / 37);
        dxVertexLayout var4 = (dxVertexLayout) arg1;
        this.field154.SetVertexDeclaration(var4.field9702);
    }

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 < 29) {
            this.method143(true, null, -73, true, -119);
        }
        if (this.field7303[this.field7328] == class172.field2780) {
            this.field154.SetTextureStageState(this.field7328, 24, 0);
            this.field177[this.field7328] = 0;
            return;
        }
        if (this.field7303[this.field7328] == class316.field4373) {
            this.field154.SetTransform(this.field7328 + 16, this.field7326[this.field7328].method181(field165, 10529));
        } else {
            this.field154.SetTransform(this.field7328 + 16, this.field7326[this.field7328].method168(-20908, field165));
        }
        int var2 = method113(this.field7303[this.field7328], (byte) -120);
        if (this.field177[this.field7328] != var2) {
            this.field154.SetTextureStageState(this.field7328, 24, var2);
            this.field177[this.field7328] = var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "()Z")
    public final boolean method100() {
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "(B)V")
    public final void method101(byte arg0) {
        if (arg0 == 17) {
            this.field154.method3805(174, this.field7401);
        }
    }

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "()V")
    public final void method102() {
        IDirect3DEventQuery var1 = this.field154.method3794();
        if (class672.method3806(-98, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2012((byte) -6);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljb;Lqda;IIB)Ldca;")
    public final class612 method103(class666 arg0, class689 arg1, int arg2, int arg3, byte arg4) {
        return arg4 == 95 ? new class328(this, arg0, arg1, arg3, arg2) : (class612) null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method104(int arg0, Canvas arg1) {
        if (arg0 >= -11) {
            field170 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "()V")
    public final void method105() {
        this.field166.method2022(14821);
        super.method105();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljb;Lqda;I)Z")
    public final boolean method106(class666 arg0, class689 arg1, int arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 != 5934) {
            this.field172 = null;
        }
        return class672.method3806(arg2 ^ 0xFFFFE8BC, this.field156.method3784(this.field162, var4)) && class672.method3806(-111, this.field156.CheckDeviceFormat(this.field162, this.field180, var4.Format, 0, 4, method112(arg1, false, arg0)));
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BZIILjb;I)Ldca;")
    public final class612 method107(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, class666 arg6, int arg7) {
        if (arg5 <= 11) {
            this.field155 = null;
        }
        return new class328(this, arg6, arg1, arg0, arg3, arg2, arg4, arg7);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public final void method109(Canvas arg0, Object arg1, boolean arg2) {
        if (arg2) {
            this.field173 = null;
        }
        if (this.field7221 != arg0) {
            return;
        }
        Dimension var4 = arg0.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field154.EndScene();
            this.method121(true);
            this.field154.BeginScene();
        }
    }

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "(B)V")
    public final void method110(byte arg0) {
        if (arg0 != -77) {
            this.method75(-48);
        }
        if (this.field173[this.field7328]) {
            this.field173[this.field7328] = false;
            this.field154.SetTexture(this.field7328, null);
            this.method126(true);
            this.method75(arg0 ^ 0xFFFFFFB3);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lir;Z)V")
    public final void method111(class328 arg0, boolean arg1) {
        if (arg1) {
            this.method75(95);
        }
        this.method142(arg0, 110);
        if (this.field168[this.field7328] != arg0.field4555) {
            this.field154.SetSamplerState(this.field7328, 1, arg0.field4555 ? 1 : 3);
            this.field168[this.field7328] = arg0.field4555;
        }
        if (arg0.field4554 != this.field172[this.field7328]) {
            this.field154.SetSamplerState(this.field7328, 2, arg0.field4554 ? 1 : 3);
            this.field172[this.field7328] = arg0.field4554;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lqda;ZLjb;)I")
    public static final int method112(class689 arg0, boolean arg1, class666 arg2) {
        if (arg1) {
            method136(null, 106);
        }
        if (class689.field9771 == arg0) {
            if (class556.field8138 == arg2) {
                return 22;
            }
            if (class297.field4191 == arg2) {
                return 21;
            }
            if (class665.field9353 == arg2) {
                return 28;
            }
            if (class682.field9712 == arg2) {
                return 50;
            }
            if (class694.field9862 == arg2) {
                return 51;
            }
            if (class609.field8746 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Ltw;B)I")
    private static final int method113(class233 arg0, byte arg1) {
        int var2 = -50 / ((-arg1 - 57) / 61);
        if (class556.field8136 == arg0) {
            return 1;
        } else if (class303.field4244 == arg0) {
            return 2;
        } else if (class455.field6538 == arg0) {
            return 3;
        } else if (class316.field4373 == arg0) {
            return 4;
        } else if (class8.field97 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "(Z)V")
    public final void method114(boolean arg0) {
        if (arg0) {
            this.method121(false);
        }
        this.field154.method3805(27, this.field7341);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)Leu;")
    public final class175 method115(byte arg0, boolean arg1) {
        int var3 = -92 % ((51 - arg0) / 53);
        return new class401(this, class689.field9772, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILeu;Lgca;BI)V")
    public final void method116(int arg0, int arg1, int arg2, class175 arg3, class627 arg4, byte arg5, int arg6) {
        this.field154.SetIndices(((class401) arg3).field5799);
        if (arg5 != -50) {
            this.method78((byte) 55);
        }
        this.field154.DrawIndexedPrimitive(method135(arg4, 0), 0, arg6, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "(B)V")
    public final void method117(byte arg0) {
        this.field154.method3805(15, this.field7295);
        int var2 = -112 % ((-arg0 - 81) / 32);
    }

    @OriginalMember(owner = "client!oe", name = "ja", descriptor = "(I)V")
    public final void method118(int arg0) {
        this.field154.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)Lwf;")
    public final class483 method119(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method103(null, null, 108, -112, (byte) 13);
        }
        return new class589(this, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "(B)V")
    public final void method120(byte arg0) {
        if (arg0 >= -54) {
            this.field180 = 26;
        }
        this.field154.SetScissorRect(this.field7364 + this.field7330, this.field7377 + this.field7361, this.field7291, this.field7318);
    }

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "(Z)Z")
    private final boolean method121(boolean arg0) {
        int var2 = this.field154.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class191 var3 = (class191) this.field7095;
            this.method2963((byte) -105);
            var3.method1355(true);
            this.field175.BackBufferWidth = 0;
            this.field175.BackBufferHeight = 0;
            if (method127(this.field162, this.field175, this.field156, false, this.field7289, this.field180)) {
                int var4 = this.field154.Reset(this.field175);
                if (class672.method3806(91, var4)) {
                    var3.method1354(this.field154.method3799(), this.field154.method3796(0), (byte) -40);
                    this.method2903(Integer.MAX_VALUE);
                    this.method71((byte) -68);
                    return true;
                }
            }
        }
        if (!arg0) {
            field165 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
    public final void method122(boolean arg0, boolean arg1) {
        if (!arg0) {
            field170 = null;
        }
        this.field154.method3805(161, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 <= 64) {
            field170 = null;
        }
        this.field154.SetViewport(this.field7364, this.field7361, this.field7098, this.field7165, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field169.SetAmbient(this.field7305 * this.field7301, this.field7334 * this.field7301, this.field7319 * this.field7301, 0.0F);
        this.field164 = false;
        if (arg0 != -7771) {
            this.method86(-39);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lhp;I)V")
    public final void method125(class329 arg0, int arg1) {
        int var3 = 0;
        if (arg1 > -93) {
            this.method73(false, -70, null, false);
        }
        if (class689.field9778 == arg0) {
            var3 = 65536;
        } else if (class696.field9881 == arg0) {
            var3 = 131072;
        } else if (class66.field955 == arg0) {
            var3 = 196608;
        }
        this.field154.SetTextureStageState(this.field7328, 11, this.field7328 | var3);
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        if (!arg0) {
            this.method151(103, 5);
        }
        int var2 = this.field173[this.field7328] ? method136(this.field7285[this.field7328], 26) : 1;
        this.field154.SetTextureStageState(this.field7328, 4, var2);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;ZII)Z")
    private static final boolean method127(int arg0, D3DPRESENT_PARAMETERS arg1, IDirect3D arg2, boolean arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class672.method3807(arg2.method3784(arg0, var9), -1)) {
                return false;
            }
            label84: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var10 = 0; var10 < field159.length; var10++) {
                        if (arg2.CheckDeviceType(arg0, arg5, var9.Format, field159[var10], true) == 0 && arg2.CheckDeviceFormat(arg0, arg5, var9.Format, 1, 1, field159[var10]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg5, field159[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field170.length; var11++) {
                                if (arg2.CheckDeviceFormat(arg0, arg5, var9.Format, 2, 1, field170[var11]) == 0 && arg2.CheckDepthStencilMatch(arg0, arg5, var9.Format, field159[var10], field170[var11]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg5, field170[var10], true, var8) == 0)) {
                                    var7 = field159[var10];
                                    var6 = field170[var11];
                                    break label84;
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
            arg1.MultiSampleType = var8;
            arg1.MultiSampleQuality = 0;
            if (arg3) {
                method82(null, (byte) 30);
            }
            arg1.BackBufferFormat = var7;
            arg1.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "()V")
    public final void method128() {
    }

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (arg0 >= -54) {
            this.method94(false, (int[][]) ((int[][]) null), -76, (byte) -87);
        }
        this.field169.SetDirection(-this.field7360[0], -this.field7360[1], -this.field7360[2]);
        this.field160.SetDirection(-this.field7310[0], -this.field7310[1], -this.field7310[2]);
        this.field164 = false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZBILjb;I[FI)Ldca;")
    public final class612 method130(int arg0, boolean arg1, byte arg2, int arg3, class666 arg4, int arg5, float[] arg6, int arg7) {
        if (arg2 != 36) {
            this.method115((byte) 105, false);
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILwf;I)V")
    public final void method131(int arg0, class483 arg1, int arg2) {
        class589 var4 = (class589) arg1;
        if (arg0 == 3438) {
            this.field154.SetStreamSource(arg2, var4.field8589, 0, var4.method3385(-26171));
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLvf;)V")
    public final void method132(boolean arg0, class87 arg1) {
        this.method142(arg1, 104);
        if (!this.field168[this.field7328]) {
            this.field154.SetSamplerState(this.field7328, 1, 1);
            this.field168[this.field7328] = true;
        }
        if (arg0) {
            this.field176 = true;
        }
        if (!this.field172[this.field7328]) {
            this.field154.SetSamplerState(this.field7328, 2, 1);
            this.field172[this.field7328] = true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(IIII)[I")
    public final int[] method133(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field154.method3797(0);
        IDirect3DSurface var7 = this.field154.method3803(arg2, arg3, 21, 0, 0, true);
        if (class672.method3806(-121, this.field154.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class672.method3806(84, var7.LockRect(0, 0, arg2, arg3, 0, this.field157))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field157.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field157.method3779(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field157.method3779(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2012((byte) -6);
        var7.method2012((byte) -6);
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZB[I)Ldca;")
    public final class612 method134(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int[] arg6) {
        int var8 = -78 % ((arg5 + 22) / 62);
        return new class328(this, arg1, arg0, arg4, arg6, arg2, arg3);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lgca;I)I")
    private static final int method135(class627 arg0, int arg1) {
        if (arg1 != 0) {
            method113(null, (byte) -42);
        }
        if (class77.field1192 == arg0) {
            return 2;
        } else if (class140.field2348 == arg0) {
            return 3;
        } else if (class674.field9611 == arg0) {
            return 1;
        } else if (class334.field4660 == arg0) {
            return 4;
        } else if (class486.field6928 == arg0) {
            return 6;
        } else if (class239.field3518 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lel;I)I")
    private static final int method136(class3 arg0, int arg1) {
        if (class345.field4866 == arg0) {
            return 2;
        } else if (class55.field715 == arg0) {
            return 4;
        } else if (class166.field2734 == arg0) {
            return 26;
        } else if (class673.field9556 == arg0) {
            return 7;
        } else if (class511.field7601 == arg0) {
            return 10;
        } else if (arg1 == 26) {
            throw new IllegalArgumentException();
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
    public final void method137() {
    }

    @OriginalMember(owner = "client!oe", name = "ya", descriptor = "()V")
    public final void method138() {
        this.method2931(-8193, true);
        this.field154.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "(I)V")
    public final void method139(int arg0) {
        this.method146((byte) 20);
        if (arg0 != 13) {
            field159 = null;
        }
        this.method72(-4);
    }

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "(B)V")
    public final void method140(byte arg0) {
        this.field154.method3805(7, this.field7373);
        if (arg0 != -28) {
            this.method88();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lls;Z)Ldt;")
    public final class573 method141(class148[] arg0, boolean arg1) {
        if (arg1) {
            this.field157 = null;
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loj;I)V")
    public final void method142(class588 arg0, int arg1) {
        this.field154.SetTexture(this.field7328, arg0.method650(false));
        if (this.field163[this.field7328] != arg0.field8581) {
            int var3 = method82(arg0.field8581, (byte) 104);
            this.field154.SetSamplerState(this.field7328, 6, var3);
            this.field154.SetSamplerState(this.field7328, 5, var3);
            this.field163[this.field7328] = arg0.field8581;
            if (arg0.field8585 != this.field179[this.field7328]) {
                this.field154.SetSamplerState(this.field7328, 7, arg0.field8585 ? method82(arg0.field8581, (byte) 104) : 0);
                this.field179[this.field7328] = arg0.field8585;
            }
        } else if (arg0.field8585 != this.field179[this.field7328]) {
            this.field154.SetSamplerState(this.field7328, 7, arg0.field8585 ? method82(arg0.field8581, (byte) 104) : 0);
            this.field179[this.field7328] = arg0.field8585;
        }
        if (arg1 > 92 && !this.field173[this.field7328]) {
            this.field173[this.field7328] = true;
            this.method126(true);
            this.method75(0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLct;IZI)V")
    public final void method143(boolean arg0, class479 arg1, int arg2, boolean arg3, int arg4) {
        int var6 = 7 / ((-arg2 - 20) / 46);
        byte var8;
        if (arg4 == 1) {
            var8 = 3;
        } else if (arg4 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        int var9 = 0;
        if (arg0) {
            var9 |= 0x20;
        }
        if (arg3) {
            var9 |= 0x10;
        }
        this.field154.SetTextureStageState(this.field7328, var8, method85(arg1, false) | var9);
    }

    @OriginalMember(owner = "client!oe", name = "DA", descriptor = "()I")
    public final int method144() {
        return 0;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V")
    public final void method145(boolean arg0) {
        if (!arg0) {
            this.field167 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "(B)V")
    public final void method146(byte arg0) {
        float var2 = this.field7351 ? this.field7363 : 0.0F;
        if (arg0 != 20) {
            this.method76(-42);
        }
        float var3 = this.field7351 ? -this.field7294 : 0.0F;
        this.field169.SetDiffuse(this.field7305 * var2, this.field7334 * var2, this.field7319 * var2, 0.0F);
        this.field160.SetDiffuse(this.field7305 * var3, this.field7334 * var3, this.field7319 * var3, 0.0F);
        this.field164 = false;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
    public final synchronized void method147(int arg0) {
        this.field166.method2019(15977);
        super.method147(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "(I)V")
    public final void method148(int arg0) {
        if (this.field7265) {
            field165[8] = 0.0F;
            field165[2] = 0.0F;
            field165[10] = 1.0F;
            field165[6] = 0.0F;
            field165[15] = 1.0F;
            field165[12] = 0.0F;
            field165[4] = 0.0F;
            field165[13] = 0.0F;
            field165[14] = 0.0F;
            field165[7] = 0.0F;
            field165[9] = 0.0F;
            field165[11] = 0.0F;
            field165[1] = 0.0F;
            field165[0] = 1.0F;
            field165[3] = 0.0F;
            field165[5] = 1.0F;
        } else {
            this.field7273.method181(field165, 10529);
        }
        this.field154.SetTransform(256, field165);
        if (arg0 != 11685) {
            this.method95();
        }
    }

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 <= -88) {
            this.field154.method3805(28, this.field7325 && this.field7371 && this.field7317 >= 0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (arg0 <= 117) {
            this.field179 = null;
        }
        this.field154.SetTransform(3, this.field7306);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(II)V")
    public final void method151(int arg0, int arg1) {
        if (arg1 != 9414) {
            this.field180 = 4;
        }
        this.field154.SetTextureStageState(this.field7328, 11, arg0);
    }
}
