import jaclib.peer.class338;
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
import jagdx.class674;
import jagdx.class675;
import jagdx.class676;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class70 extends class575 {

    @OriginalMember(owner = "client!mba", name = "Hg", descriptor = "Z")
    private boolean field947 = false;

    @OriginalMember(owner = "client!mba", name = "Rg", descriptor = "I")
    private int field957 = 0;

    @OriginalMember(owner = "client!mba", name = "Jg", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!mba", name = "Dg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field943;

    @OriginalMember(owner = "client!mba", name = "Cg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field942;

    @OriginalMember(owner = "client!mba", name = "Lg", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!mba", name = "Fg", descriptor = "Lfn;")
    private class621 field945;

    @OriginalMember(owner = "client!mba", name = "yg", descriptor = "Ljaclib/peer/aaa;")
    public class338 field938;

    @OriginalMember(owner = "client!mba", name = "Eg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field944;

    @OriginalMember(owner = "client!mba", name = "Sg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field958;

    @OriginalMember(owner = "client!mba", name = "Ig", descriptor = "Ljagdx/D3DLIGHT;")
    private class674 field948;

    @OriginalMember(owner = "client!mba", name = "wg", descriptor = "Ljagdx/D3DLIGHT;")
    private class674 field936;

    @OriginalMember(owner = "client!mba", name = "Bg", descriptor = "Ljagdx/D3DLIGHT;")
    private class674 field941;

    @OriginalMember(owner = "client!mba", name = "Tg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field959;

    @OriginalMember(owner = "client!mba", name = "Kg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field950;

    @OriginalMember(owner = "client!mba", name = "Qg", descriptor = "Z")
    public boolean field956;

    @OriginalMember(owner = "client!mba", name = "Mg", descriptor = "Z")
    public boolean field952;

    @OriginalMember(owner = "client!mba", name = "Ng", descriptor = "Z")
    public boolean field953;

    @OriginalMember(owner = "client!mba", name = "Ag", descriptor = "[Z")
    private boolean[] field940;

    @OriginalMember(owner = "client!mba", name = "xg", descriptor = "[Z")
    private boolean[] field937;

    @OriginalMember(owner = "client!mba", name = "ug", descriptor = "[Lgv;")
    private class39[] field934;

    @OriginalMember(owner = "client!mba", name = "Pg", descriptor = "[Z")
    private boolean[] field955;

    @OriginalMember(owner = "client!mba", name = "vg", descriptor = "[I")
    private int[] field935;

    @OriginalMember(owner = "client!mba", name = "Gg", descriptor = "[Z")
    private boolean[] field946;

    @OriginalMember(owner = "client!mba", name = "tg", descriptor = "[I")
    private static int[] field933 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!mba", name = "zg", descriptor = "[I")
    private static int[] field939 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!mba", name = "Og", descriptor = "[F")
    private static float[] field954 = new float[16];

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (this.field7672) {
            field954[0] = 1.0F;
            field954[14] = 0.0F;
            field954[12] = 0.0F;
            field954[10] = 1.0F;
            field954[13] = 0.0F;
            field954[4] = 0.0F;
            field954[6] = 0.0F;
            field954[15] = 1.0F;
            field954[9] = 0.0F;
            field954[8] = 0.0F;
            field954[5] = 1.0F;
            field954[1] = 0.0F;
            field954[3] = 0.0F;
            field954[11] = 0.0F;
            field954[2] = 0.0F;
            field954[7] = 0.0F;
        } else {
            this.field7669.method946(false, field954);
        }
        if (arg0 > -28) {
            this.method234(null, false);
        }
        this.field958.SetTransform(256, field954);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljga;I)V")
    public final void method558(class142 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        this.field958.SetTexture(this.field7694, arg0.method1070((byte) -72));
        if (this.field934[this.field7694] != arg0.field1865) {
            int var3 = method561(arg0.field1865, false);
            this.field958.SetSamplerState(this.field7694, 6, var3);
            this.field958.SetSamplerState(this.field7694, 5, var3);
            this.field934[this.field7694] = arg0.field1865;
            if (arg0.field1868 != this.field946[this.field7694]) {
                this.field958.SetSamplerState(this.field7694, 7, arg0.field1868 ? method561(arg0.field1865, false) : 0);
                this.field946[this.field7694] = arg0.field1868;
            }
        } else if (this.field946[this.field7694] != arg0.field1868) {
            this.field958.SetSamplerState(this.field7694, 7, arg0.field1868 ? method561(arg0.field1865, false) : 0);
            this.field946[this.field7694] = arg0.field1868;
        }
        if (!this.field940[this.field7694]) {
            this.field940[this.field7694] = true;
            this.method161(-5882);
            this.method160(-1);
        }
    }

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "(B)V")
    public final void method196(byte arg0) {
        if (arg0 == -116) {
            this.field958.method3713(7, this.field7766);
        }
    }

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "()V")
    public final void method216() throws class381 {
        this.field958.EndScene();
        if (this.field945.method3383((byte) 122)) {
            this.field957 = 0;
            if (class675.method3704(this.field945.method3382(0, false), -64)) {
                this.method563(-1497);
            }
        } else if (++this.field957 <= 50) {
            this.method563(-1497);
        } else {
            throw new class381();
        }
        this.field958.BeginScene();
    }

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "(Z)V")
    public final void method217(boolean arg0) {
        if (this.field7690) {
            this.field958.method3709(36, 0.0F);
            this.field958.method3709(37, 1.0F);
            this.field958.SetRenderState(34, this.field7687);
        } else {
            this.field7755 = (this.field7743 - this.field7724);
            this.field7710 = this.field7755 - (float) this.field7765;
            if (this.field7710 < (float) this.field7776) {
                this.field7710 = this.field7776;
            }
            this.field958.method3709(36, this.field7710);
            this.field958.method3709(37, this.field7755);
            this.field958.SetRenderState(34, this.field7756);
        }
        if (!arg0) {
            this.method221((byte) -47, true);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lgga;B)I")
    private static final int method559(class462 arg0, byte arg1) {
        if (arg1 != 59) {
            method568(null, 30, null);
        }
        if (class510.field6687 == arg0) {
            return 2;
        } else if (class219.field2875 == arg0) {
            return 4;
        } else if (class456.field5976 == arg0) {
            return 26;
        } else if (class600.field8091 == arg0) {
            return 7;
        } else if (class473.field6161 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[BIILpw;I)Laq;")
    public final class444 method227(int arg0, byte[] arg1, int arg2, int arg3, class89 arg4, int arg5) {
        if (arg0 != 9) {
            this.field948 = null;
        }
        return new class161(this, arg4, arg5, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "()V")
    public final void method173() {
    }

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "(I)V")
    public final void method165(int arg0) {
        this.field948.SetAmbient(this.field7713 * this.field7678, this.field7767 * this.field7678, this.field7760 * this.field7678, 0.0F);
        if (arg0 <= -126) {
            this.field947 = false;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLab;)V")
    public final void method560(byte arg0, class582 arg1) {
        this.method558(arg1, 1);
        if (arg1.field7915 != this.field937[this.field7694]) {
            this.field958.SetSamplerState(this.field7694, 1, arg1.field7915 ? 1 : 3);
            this.field937[this.field7694] = arg1.field7915;
        }
        if (this.field955[this.field7694] != arg1.field7919) {
            this.field958.SetSamplerState(this.field7694, 2, arg1.field7919 ? 1 : 3);
            this.field955[this.field7694] = arg1.field7919;
        }
        int var3 = 98 / ((67 - arg0) / 59);
    }

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "(Z)V")
    public final void method202(boolean arg0) {
        if (!arg0) {
            this.field958 = null;
        }
        if (this.field947) {
            return;
        }
        this.field958.LightEnable(0, false);
        this.field958.LightEnable(1, false);
        this.field958.SetLight(0, this.field948);
        this.field958.SetLight(1, this.field936);
        this.field958.LightEnable(0, true);
        this.field958.LightEnable(1, true);
        this.field947 = true;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(FFF)V")
    public final void method201(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "()V")
    public final void method208() {
        IDirect3DEventQuery var1 = this.field958.method3719();
        if (class675.method3703((byte) -58, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method1941((byte) -46);
    }

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "()Z")
    public final boolean method211() {
        return false;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method166(Object arg0, int arg1, Canvas arg2) {
        if (this.field7575 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field958.EndScene();
                this.method563(-1497);
                this.field958.BeginScene();
            }
        }
        int var5 = 95 % ((arg1 - 33) / 34);
    }

    @OriginalMember(owner = "client!mba", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Lpe;Ljava/lang/Integer;)Loa;")
    public static final class43 createToolkit(Canvas arg0, class702 arg1, class615 arg2, Integer arg3) {
        class70 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class338 var7 = new class338();
            IDirect3D var8 = IDirect3D.method3702(-2147483616, var7);
            D3DCAPS var9 = var8.method3699(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method562(-19288, arg3, var8, var5, var10, var6)) {
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
                    var13 = var8.method3698(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class676 var17) {
                    var13 = var8.method3698(var5, var6, arg0, var11 | 0x20, var10);
                }
                class621 var15 = new class621(var13.method3712(0), var13.method3705());
                var4 = new class70(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3095((byte) 17);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method225();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "(Z)V")
    public final void method214(boolean arg0) {
        float var2 = this.field7758 ? this.field7742 : 0.0F;
        float var3 = this.field7758 ? -this.field7749 : 0.0F;
        this.field948.SetDiffuse(this.field7713 * var2, this.field7767 * var2, this.field7760 * var2, 0.0F);
        this.field936.SetDiffuse(this.field7713 * var3, this.field7767 * var3, this.field7760 * var3, 0.0F);
        this.field947 = arg0;
    }

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (arg0 != 968032408) {
            this.method195(52);
        }
        this.method214(false);
        this.method202(true);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method219(Rectangle[] arg0, int arg1) throws class381 {
        this.method216();
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(II)V")
    public final void method210(int arg0, int arg1) {
        this.field958.SetTextureStageState(this.field7694, 11, arg0);
        if (arg1 != 0) {
            this.field937 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "P", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (arg0 < 8) {
            this.method207((byte) -72);
        }
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(Z)F")
    public final float method232(boolean arg0) {
        if (!arg0) {
            this.field951 = -22;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIILbm;)V")
    public final void method185(int arg0, int arg1, int arg2, class637 arg3) {
        this.field958.DrawPrimitive(method566(arg3, 4), arg0, arg1);
        if (arg2 != -31084) {
            this.field950 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "(B)V")
    public final void method220(byte arg0) {
        for (int var2 = 0; var2 < this.field7683; var2++) {
            this.field958.SetSamplerState(var2, 7, 0);
            this.field958.SetSamplerState(var2, 6, 2);
            this.field958.SetSamplerState(var2, 5, 2);
            this.field958.SetSamplerState(var2, 1, 1);
            this.field958.SetSamplerState(var2, 2, 1);
            this.field934[var2] = class705.field9815;
            this.field937[var2] = this.field955[var2] = true;
            this.field946[var2] = false;
            this.field935[var2] = 0;
        }
        this.field958.SetTextureStageState(0, 6, 1);
        this.field958.SetRenderState(9, 2);
        this.field958.SetRenderState(23, 4);
        this.field958.SetRenderState(25, 5);
        this.field958.SetRenderState(24, 0);
        this.field958.SetRenderState(22, 2);
        this.field958.SetRenderState(147, 1);
        this.field958.SetRenderState(145, 1);
        this.field958.method3709(38, 0.95F);
        this.field958.SetRenderState(140, 3);
        this.field948.SetType(3);
        this.field936.SetType(3);
        this.field941.SetType(1);
        this.field947 = false;
        super.method220(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "K", descriptor = "(I)V")
    public final void method160(int arg0) {
        int var2 = this.field940[this.field7694] ? method559(this.field7698[this.field7694], (byte) 59) : 1;
        this.field958.SetTextureStageState(this.field7694, 1, var2);
        if (arg0 != -1) {
            this.field945 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZ)Lcu;")
    public final class269 method159(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method195(119);
        }
        return new class85(this, arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lgv;Z)I")
    private static final int method561(class39 arg0, boolean arg1) {
        if (arg1) {
            field954 = null;
        }
        if (class705.field9815 == arg0) {
            return 2;
        } else if (class105.field1381 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "(B)V")
    public final void method172(byte arg0) {
        if (arg0 != -34) {
            this.method234(null, true);
        }
        this.field958.method3713(14, this.field7682 && this.field7750);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IILjagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;I)Z")
    private static final boolean method562(int arg0, int arg1, IDirect3D arg2, int arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class675.method3704(arg2.method3701(arg3, var9), arg0 + 19165)) {
                return false;
            }
            label87: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field933.length; var10++) {
                        if (arg2.CheckDeviceType(arg3, arg5, var9.Format, field933[var10], true) == 0 && arg2.CheckDeviceFormat(arg3, arg5, var9.Format, 1, 1, field933[var10]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg5, field933[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field939.length; var11++) {
                                if (arg2.CheckDeviceFormat(arg3, arg5, var9.Format, 2, 1, field939[var11]) == 0 && arg2.CheckDepthStencilMatch(arg3, arg5, var9.Format, field933[var10], field939[var11]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg5, field939[var10], true, var8) == 0)) {
                                    var7 = field933[var10];
                                    var6 = field939[var11];
                                    break label87;
                                }
                            }
                        }
                    }
                }
                arg1--;
            }
            if (arg0 != -19288) {
                return false;
            } else if (arg1 < 0 || var7 == 0 || var6 == 0) {
                return false;
            } else {
                arg4.AutoDepthStencilFormat = var6;
                arg4.MultiSampleType = var8;
                arg4.MultiSampleQuality = 0;
                arg4.BackBufferFormat = var7;
                return true;
            }
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "(Z)V")
    public final void method154(boolean arg0) {
        if (arg0) {
            method561(null, true);
        }
        this.field958.SetTransform(3, this.field7697);
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
    }

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field958.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(ZZ)Lui;")
    public final class498 method186(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method181(-25);
        }
        return new class707(this, class6.field49, arg0);
    }

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        if (arg0) {
            this.method194();
        }
        if (this.field940[this.field7694]) {
            this.field940[this.field7694] = false;
            this.field958.SetTexture(this.field7694, null);
            this.method161(-5882);
            this.method160(-1);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public final void method163(Canvas arg0, boolean arg1, Object arg2) {
        if (!arg1) {
            this.method194();
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lxa;Z)V")
    public final void method234(class511 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZ[FILpw;II)Lqaa;")
    public final class309 method156(int arg0, int arg1, boolean arg2, float[] arg3, int arg4, class89 arg5, int arg6, int arg7) {
        if (arg0 != 3000) {
            this.method224(1);
        }
        return null;
    }

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "()V")
    public final void method194() {
    }

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "()V")
    public final void method205() {
        this.method3083(true, false);
        this.field958.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILbm;IIIILui;)V")
    public final void method164(int arg0, class637 arg1, int arg2, int arg3, int arg4, int arg5, class498 arg6) {
        this.field958.SetIndices(((class707) arg6).field9872);
        if (arg2 < -2) {
            this.field958.DrawIndexedPrimitive(method566(arg1, 4), 0, arg0, arg5, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLpw;Llj;)Z")
    public final boolean method176(byte arg0, class89 arg1, class6 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 >= -22) {
            this.method172((byte) -56);
        }
        return class675.method3703((byte) -58, this.field942.method3701(this.field951, var4)) && class675.method3703((byte) -58, this.field942.CheckDeviceFormat(this.field951, this.field949, var4.Format, 0, 4, method568(arg1, -1, arg2)));
    }

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)V")
    public final synchronized void method224(int arg0) {
        this.field938.method1936(-28275);
        super.method224(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLej;ZII)V")
    public final void method206(boolean arg0, class694 arg1, boolean arg2, int arg3, int arg4) {
        int var6 = 0;
        byte var8;
        if (arg3 == 1) {
            var8 = 3;
        } else if (arg3 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg2) {
            var6 |= 0x20;
        }
        if (arg0) {
            var6 |= 0x10;
        }
        this.field958.SetTextureStageState(this.field7694, var8, method564(arg1, (byte) 66) | var6);
        if (arg4 != 23798) {
            this.field940 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (arg0 != -5882) {
            this.field940 = null;
        }
        int var2 = this.field940[this.field7694] ? method559(this.field7754[this.field7694], (byte) 59) : 1;
        this.field958.SetTextureStageState(this.field7694, 4, var2);
    }

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "(I)V")
    public final void method195(int arg0) {
        if (arg0 == 17506) {
            this.field958.method3713(174, this.field7801);
        }
    }

    @OriginalMember(owner = "client!mba", name = "V", descriptor = "(I)Z")
    private final boolean method563(int arg0) {
        int var2 = this.field958.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class621 var3 = (class621) this.field7600;
            this.method3101(-118);
            var3.method3380(true);
            this.field943.BackBufferWidth = 0;
            this.field943.BackBufferHeight = 0;
            if (method562(-19288, this.field7712, this.field942, this.field951, this.field943, this.field949)) {
                int var4 = this.field958.Reset(this.field943);
                if (class675.method3703((byte) -58, var4)) {
                    var3.method3381(this.field958.method3712(0), arg0 + 1447, this.field958.method3705());
                    this.method3093((byte) -86);
                    this.method220((byte) -107);
                    return true;
                }
            }
        }
        return arg0 != -1497;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[IIIIZI)Lqaa;")
    public final class309 method213(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        return arg3 == -8 ? new class582(this, arg0, arg6, arg5, arg1, arg2, arg4) : (class309) null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "()V")
    public final void method180() {
    }

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "(I)V")
    public final void method199(int arg0) {
        this.field958.SetViewport(this.field7729, this.field7772, this.field7540, this.field7584, (float) arg0, 1.0F);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lej;B)I")
    private static final int method564(class694 arg0, byte arg1) {
        if (arg1 != 66) {
            return 63;
        } else if (class61.field833 == arg0) {
            return 2;
        } else if (class697.field9582 == arg0) {
            return 0;
        } else if (class243.field3260 == arg0) {
            return 1;
        } else if (class425.field5511 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "(B)V")
    public final void method207(byte arg0) {
        if (arg0 >= -10) {
            this.method160(22);
        }
        if (class508.field6666 == this.field7762) {
            this.field958.SetRenderState(19, 5);
            this.field958.SetRenderState(20, 6);
        } else if (class389.field4987 == this.field7762) {
            this.field958.SetRenderState(19, 2);
            this.field958.SetRenderState(20, 2);
        } else if (class124.field1606 == this.field7762) {
            this.field958.SetRenderState(19, 9);
            this.field958.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIILlj;Lpw;)Lqaa;")
    public final class309 method192(int arg0, int arg1, int arg2, class6 arg3, class89 arg4) {
        if (arg1 != 0) {
            this.field956 = false;
        }
        return new class582(this, arg4, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILrc;)V")
    public final void method565(int arg0, class161 arg1) {
        this.method558(arg1, 1);
        if (!this.field937[this.field7694]) {
            this.field958.SetSamplerState(this.field7694, 1, 1);
            this.field937[this.field7694] = true;
        }
        if (!this.field955[this.field7694]) {
            this.field958.SetSamplerState(this.field7694, 2, 1);
            this.field955[this.field7694] = true;
        }
        if (arg0 > -111) {
            this.method214(true);
        }
    }

    @OriginalMember(owner = "client!mba", name = "J", descriptor = "(I)V")
    public final void method197(int arg0) {
        this.field958.SetScissorRect(this.field7769 + this.field7729, this.field7772 - -this.field7686, this.field7695, this.field7770);
        if (arg0 != -11717) {
            method566(null, 115);
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "()Log;")
    public final class463 method189() {
        D3DADAPTER_IDENTIFIER var1 = this.field942.method3700(this.field951, 0);
        return new class463(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "(I)V")
    public final void method184(int arg0) {
        if (arg0 != -8) {
            this.field959 = null;
        }
        this.field948.SetDirection(-this.field7779[0], -this.field7779[1], -this.field7779[2]);
        this.field936.SetDirection(-this.field7679[0], -this.field7679[1], -this.field7679[2]);
        this.field947 = false;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIIZ[BLpw;)Lqaa;")
    public final class309 method198(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, class89 arg7) {
        if (arg4 != 0) {
            this.field943 = null;
        }
        return new class582(this, arg7, arg1, arg0, arg5, arg6, arg3, arg2);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/aaa;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lfn;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Lpe;I)V")
    private class70(int arg0, int arg1, Canvas arg2, class338 arg3, IDirect3D arg4, IDirect3DDevice arg5, class621 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class702 arg9, class615 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field949 = arg1;
        this.field943 = arg7;
        this.field942 = arg4;
        this.field951 = arg0;
        this.field945 = arg6;
        this.field938 = arg3;
        this.field944 = arg8;
        this.field958 = arg5;
        this.field948 = new class674(this.field938);
        this.field936 = new class674(this.field938);
        this.field941 = new class674(this.field938);
        this.field959 = new PixelBuffer(this.field938);
        this.field950 = new GeometryBuffer(this.field938);
        new GeometryBuffer(this.field938);
        this.field7761 = (this.field944.TextureCaps & 0x800) != 0;
        this.field956 = (this.field944.TextureCaps & 0x2) == 0;
        this.field952 = (this.field944.TextureCaps & 0x10000) != 0;
        this.field7683 = this.field944.MaxSimultaneousTextures;
        this.field953 = (this.field944.TextureCaps & 0x4000) != 0;
        this.field7735 = this.field944.MaxActiveLights > 0 ? this.field944.MaxActiveLights : 8;
        this.field7748 = (this.field944.TextureCaps & 0x2000) != 0;
        this.field7719 = this.field7712 > 0 || this.field942.CheckDeviceMultiSampleType(this.field951, this.field949, this.field943.BackBufferFormat, true, 2) == 0;
        this.field940 = new boolean[this.field7683];
        this.field937 = new boolean[this.field7683];
        this.field934 = new class39[this.field7683];
        this.field955 = new boolean[this.field7683];
        this.field935 = new int[this.field7683];
        this.field946 = new boolean[this.field7683];
        this.field958.BeginScene();
        try {
            this.field958.Clear(3, 0, 1.0F, 0);
            this.method216();
            this.field958.Clear(3, 0, 1.0F, 0);
        } catch (class381 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lpw;BLlj;)Z")
    public final boolean method222(class89 arg0, byte arg1, class6 arg2) {
        if (arg1 <= 86) {
            this.method167(false);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class675.method3703((byte) -58, this.field942.method3701(this.field951, var4)) && class675.method3703((byte) -58, this.field942.CheckDeviceFormat(this.field951, this.field949, var4.Format, 0, 3, method568(arg0, -1, arg2)));
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lbm;I)I")
    private static final int method566(class637 arg0, int arg1) {
        if (class17.field198 == arg0) {
            return 2;
        } else if (class586.field7944 == arg0) {
            return 3;
        } else if (class671.field9315 == arg0) {
            return 1;
        } else if (class527.field6860 == arg0) {
            return 4;
        } else if (class235.field3146 == arg0) {
            return 6;
        } else if (class480.field6396 == arg0) {
            return 5;
        } else {
            if (arg1 != 4) {
                method566(null, -56);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "()Z")
    public final boolean method231() {
        return false;
    }

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "(I)V")
    public final void method226(int arg0) {
        if (this.field7764[this.field7694] == class696.field9529) {
            this.field958.SetTextureStageState(this.field7694, 24, 0);
            this.field935[this.field7694] = 0;
        } else {
            if (this.field7764[this.field7694] == class234.field3135) {
                this.field958.SetTransform(this.field7694 + 16, this.field7701[this.field7694].method946(false, field954));
            } else {
                this.field958.SetTransform(this.field7694 + 16, this.field7701[this.field7694].method939(field954, 3123));
            }
            int var2 = method567(true, this.field7764[this.field7694]);
            if (this.field935[this.field7694] != var2) {
                this.field958.SetTextureStageState(this.field7694, 24, var2);
                this.field935[this.field7694] = var2;
            }
        }
        if (arg0 != 1) {
            this.field957 = 80;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILhj;)V")
    public final void method187(int arg0, class150 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 == -2) {
            this.field958.SetVertexDeclaration(var3.field9405);
        }
    }

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "(B)V")
    public final void method171(byte arg0) {
        if (arg0 != -87) {
            this.method157(54, 65, -101, 76);
        }
        this.field958.method3713(15, this.field7725);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILcu;I)V")
    public final void method155(int arg0, class269 arg1, int arg2) {
        if (arg2 > -30) {
            this.field956 = true;
        }
        class85 var4 = (class85) arg1;
        this.field958.SetStreamSource(arg0, var4.field1146, 0, var4.method644(-6874));
    }

    @OriginalMember(owner = "client!mba", name = "SA", descriptor = "()I")
    public final int method168() {
        return 0;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method218(Object arg0, int arg1, Canvas arg2) {
        if (arg1 != -14649) {
            this.field938 = null;
        }
        this.field945 = (class621) arg0;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLwq;)I")
    private static final int method567(boolean arg0, class492 arg1) {
        if (class147.field1903 == arg1) {
            return 1;
        } else if (class34.field500 == arg1) {
            return 2;
        } else if (class54.field744 == arg1) {
            return 3;
        } else if (class234.field3135 == arg1) {
            return 4;
        } else if (class637.field8874 == arg1) {
            return 256;
        } else if (arg0) {
            return 0;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(B)V")
    public final void method203(byte arg0) {
        if (this.field7699.method2106(14)) {
            this.field7675.method946(false, field954);
        } else {
            field954[6] = 0.0F;
            field954[5] = 1.0F;
            field954[11] = 0.0F;
            field954[8] = 0.0F;
            field954[14] = 0.0F;
            field954[3] = 0.0F;
            field954[10] = 1.0F;
            field954[12] = 0.0F;
            field954[1] = 0.0F;
            field954[2] = 0.0F;
            field954[4] = 0.0F;
            field954[13] = 0.0F;
            field954[7] = 0.0F;
            field954[0] = 1.0F;
            field954[15] = 1.0F;
            field954[9] = 0.0F;
        }
        this.field958.SetTransform(2, field954);
        int var2 = 101 / ((arg0 + 18) / 58);
    }

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "(I)V")
    public final void method193(int arg0) {
        this.field958.method3713(27, this.field7680);
        if (arg0 > -63) {
            this.field935 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BZ)V")
    public final void method221(byte arg0, boolean arg1) {
        this.field958.method3713(161, arg1);
        int var3 = 67 % ((arg0 - 26) / 63);
    }

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "()V")
    public final void method179() {
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI[[IZ)Ltda;")
    public final class342 method204(byte arg0, int arg1, int[][] arg2, boolean arg3) {
        if (arg0 >= -27) {
            this.method194();
        }
        return new class189(this, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "(I)V")
    public final void method212(int arg0) {
        this.field958.method3713(28, this.field7777 && this.field7700 && this.field7690 | this.field7765 >= 0);
        if (arg0 != 0) {
            this.method195(-95);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZILej;)V")
    public final void method228(boolean arg0, boolean arg1, int arg2, class694 arg3) {
        if (arg0) {
            this.method166(null, 114, null);
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
        this.field958.SetTextureStageState(this.field7694, var6, var7 | method564(arg3, (byte) 66));
    }

    @OriginalMember(owner = "client!mba", name = "KA", descriptor = "(IIII)[I")
    public final int[] method157(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field958.method3717(0);
        IDirect3DSurface var7 = this.field958.method3718(arg2, arg3, 21, 0, 0, true);
        if (class675.method3703((byte) -58, this.field958.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class675.method3703((byte) -58, var7.LockRect(0, 0, arg2, arg3, 0, this.field959))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field959.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field959.method3695(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field959.method3695(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method1941((byte) -46);
        var7.method1941((byte) -46);
        return var5;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLol;)V")
    public final void method183(byte arg0, class388 arg1) {
        int var3 = 0;
        if (class553.field7241 == arg1) {
            var3 = 65536;
        } else if (class27.field391 == arg1) {
            var3 = 131072;
        } else if (class522.field6809 == arg1) {
            var3 = 196608;
        }
        if (arg0 < 18) {
            this.field945 = null;
        }
        this.field958.SetTextureStageState(this.field7694, 11, var3 | this.field7694);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B[Led;)Lhj;")
    public final class150 method230(byte arg0, class560[] arg1) {
        return arg0 == -125 ? new dxVertexLayout(this, arg1) : (class150) null;
    }

    @OriginalMember(owner = "client!mba", name = "M", descriptor = "(I)V")
    public final void method190(int arg0) {
        if (arg0 >= 40) {
            this.field958.method3713(137, this.field7681 && !this.field7711);
        }
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "(B)V")
    public final void method191(byte arg0) {
        this.field958.SetRenderState(60, this.field7752);
        if (arg0 < 120) {
            this.field956 = true;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)Lwh;")
    public final class695 method174(int arg0, boolean arg1) {
        if (arg1) {
            return (class695) null;
        } else if (arg0 == 3) {
            return new class56(this, this.field7663);
        } else if (arg0 == 4) {
            return new class502(this, this.field7663, this.field7548);
        } else {
            return super.method174(arg0, false);
        }
    }

    @OriginalMember(owner = "client!mba", name = "G", descriptor = "(I)V")
    public final void method229(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field7689; var2++) {
            class296 var3 = this.field7723[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1751(118);
            float var6 = var3.method1756((byte) 124) / 255.0F;
            this.field941.SetPosition((float) var3.method1754(77), (float) var3.method1753((byte) 127), (float) var3.method1755(107));
            this.field941.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field941.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1752(70) * var3.method1752(arg0 + 90)));
            this.field941.SetRange((float) var3.method1752(99));
            this.field958.SetLight(var4, this.field941);
            this.field958.LightEnable(var4, true);
        }
        while (var2 < this.field7768) {
            this.field958.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method229(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lpw;ILlj;)I")
    public static final int method568(class89 arg0, int arg1, class6 arg2) {
        if (arg1 != -1) {
            return 43;
        }
        if (class6.field48 == arg2) {
            if (class82.field1117 == arg0) {
                return 22;
            }
            if (class135.field1774 == arg0) {
                return 21;
            }
            if (class228.field3042 == arg0) {
                return 28;
            }
            if (class368.field4744 == arg0) {
                return 50;
            }
            if (class395.field5023 == arg0) {
                return 51;
            }
            if (class282.field3675 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method170(byte arg0, Canvas arg1) {
        int var3 = 116 % ((arg0 + 7) / 61);
        return null;
    }

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "()V")
    public final void method225() {
        this.field938.method1939(7622);
        super.method225();
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lkn;Lkn;FLkn;)Lkn;")
    public final class307 method188(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }
}
