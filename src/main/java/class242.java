import jaclib.peer.class701;
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
import jagdx.class510;
import jagdx.class511;
import jagdx.class512;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class242 extends class551 {

    @OriginalMember(owner = "client!aia", name = "Mg", descriptor = "Z")
    private boolean field3442 = false;

    @OriginalMember(owner = "client!aia", name = "Zg", descriptor = "I")
    private int field3455 = 0;

    @OriginalMember(owner = "client!aia", name = "gh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3462;

    @OriginalMember(owner = "client!aia", name = "Rg", descriptor = "Ljaclib/peer/mba;")
    public class701 field3447;

    @OriginalMember(owner = "client!aia", name = "Lg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3441;

    @OriginalMember(owner = "client!aia", name = "fh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3461;

    @OriginalMember(owner = "client!aia", name = "Xg", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!aia", name = "Jg", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!aia", name = "Sg", descriptor = "Lsb;")
    private class308 field3448;

    @OriginalMember(owner = "client!aia", name = "Tg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3449;

    @OriginalMember(owner = "client!aia", name = "ch", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field3458;

    @OriginalMember(owner = "client!aia", name = "Yg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field3454;

    @OriginalMember(owner = "client!aia", name = "Ig", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field3438;

    @OriginalMember(owner = "client!aia", name = "hh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3463;

    @OriginalMember(owner = "client!aia", name = "Qg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3446;

    @OriginalMember(owner = "client!aia", name = "Kg", descriptor = "Z")
    public boolean field3440;

    @OriginalMember(owner = "client!aia", name = "Og", descriptor = "Z")
    public boolean field3444;

    @OriginalMember(owner = "client!aia", name = "Pg", descriptor = "Z")
    public boolean field3445;

    @OriginalMember(owner = "client!aia", name = "Wg", descriptor = "[Z")
    private boolean[] field3452;

    @OriginalMember(owner = "client!aia", name = "dh", descriptor = "[Lws;")
    private class379[] field3459;

    @OriginalMember(owner = "client!aia", name = "Ug", descriptor = "[I")
    private int[] field3450;

    @OriginalMember(owner = "client!aia", name = "Ng", descriptor = "[Z")
    private boolean[] field3443;

    @OriginalMember(owner = "client!aia", name = "Vg", descriptor = "[Z")
    private boolean[] field3451;

    @OriginalMember(owner = "client!aia", name = "Gg", descriptor = "[Z")
    private boolean[] field3436;

    @OriginalMember(owner = "client!aia", name = "ah", descriptor = "[F")
    private static float[] field3456 = new float[16];

    @OriginalMember(owner = "client!aia", name = "eh", descriptor = "[I")
    private static int[] field3460 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!aia", name = "bh", descriptor = "[I")
    private static int[] field3457 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!aia", name = "Hg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3437;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "()V", line = 4)
    public final void method543() {
        this.field3447.method3924((byte) 99);
        super.method543();
    }

    @OriginalMember(owner = "client!aia", name = "p", descriptor = "(I)V", line = 13)
    public final void method824(int arg0) {
        if (arg0 != -2466) {
            this.method819(true, (byte) -68);
        }
        this.method855((byte) -123);
        this.method816((byte) -128);
    }

    @OriginalMember(owner = "client!aia", name = "F", descriptor = "(II)V", line = 23)
    public final void method547(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lgh;Loq;)Lel;", line = 26)
    public final class574 method546(class575 arg0, class380 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILso;ZLul;)Lgl;", line = 33)
    public final class627 method850(int arg0, int arg1, class497 arg2, boolean arg3, class599 arg4) {
        return arg3 ? new class763(this, arg4, arg2, arg1, arg0) : (class627) null;
    }

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "(Z)V", line = 44)
    public final void method837(boolean arg0) {
        if (arg0) {
            this.field3462.SetScissorRect(this.field7765 + this.field7734, this.field7760 + this.field7746, this.field7732, this.field7771);
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/mba;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lsb;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lgj;I)V", line = 53)
    private class242(int arg0, int arg1, Canvas arg2, class701 arg3, IDirect3D arg4, IDirect3DDevice arg5, class308 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class162 arg9, class662 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field3462 = arg5;
            this.field3447 = arg3;
            this.field3441 = arg7;
            this.field3461 = arg4;
            this.field3453 = arg0;
            this.field3439 = arg1;
            this.field3448 = arg6;
            this.field3449 = arg8;
            this.field3458 = new class512(this.field3447);
            this.field3454 = new class512(this.field3447);
            this.field3438 = new class512(this.field3447);
            this.field3463 = new PixelBuffer(this.field3447);
            this.field3446 = new GeometryBuffer(this.field3447);
            new GeometryBuffer(this.field3447);
            this.field3440 = (this.field3449.TextureCaps & 0x4000) != 0;
            this.field7766 = this.field3449.MaxActiveLights > 0 ? this.field3449.MaxActiveLights : 8;
            this.field3444 = (this.field3449.TextureCaps & 0x10000) != 0;
            this.field7724 = (this.field3449.TextureCaps & 0x2000) != 0;
            this.field7745 = (this.field3449.TextureCaps & 0x800) != 0;
            this.field3445 = (this.field3449.TextureCaps & 0x2) == 0;
            this.field7754 = this.field3449.MaxSimultaneousTextures;
            this.field7733 = this.field7690 > 0 || this.field3461.CheckDeviceMultiSampleType(this.field3453, this.field3439, this.field3441.BackBufferFormat, true, 2) == 0;
            this.field3452 = new boolean[this.field7754];
            this.field3459 = new class379[this.field7754];
            this.field3450 = new int[this.field7754];
            this.field3443 = new boolean[this.field7754];
            this.field3451 = new boolean[this.field7754];
            this.field3436 = new boolean[this.field7754];
            this.field3462.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method594(0);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "()V", line = 99)
    public final void method506() {
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)F", line = 102)
    public final float method851(byte arg0) {
        return arg0 < 30 ? -1.1625967F : -0.5F;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILmp;)V", line = 113)
    public final void method1610(int arg0, class793 arg1) {
        this.method1621((byte) 41, arg1);
        if (arg0 != 6097) {
            this.field3454 = null;
        }
        if (!this.field3451[this.field7711]) {
            this.field3462.SetSamplerState(this.field7711, 1, 1);
            this.field3451[this.field7711] = true;
        }
        if (!this.field3452[this.field7711]) {
            this.field3462.SetSamplerState(this.field7711, 2, 1);
            this.field3452[this.field7711] = true;
        }
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "()V", line = 137)
    public final void method489() {
        IDirect3DEventQuery var1 = this.field3462.method2923();
        if (class510.method2912(var1.Issue(), -98)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3925(-6517);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 163)
    public final Object method835(Canvas arg0, int arg1) {
        int var3 = -40 % ((arg1 + 58) / 34);
        return null;
    }

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "(B)V", line = 173)
    public final void method854(byte arg0) {
        int var2 = this.field3443[this.field7711] ? method1613(-1, this.field7684[this.field7711]) : 1;
        this.field3462.SetTextureStageState(this.field7711, 1, var2);
        if (arg0 != 29) {
            this.method843(27);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I[Lug;)Lwp;", line = 185)
    public final class193 method844(int arg0, class588[] arg1) {
        int var3 = 85 % ((arg0 - 49) / 32);
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(ZI)Lta;", line = 195)
    public final class226 method812(boolean arg0, int arg1) {
        if (arg1 <= 22) {
            this.method865(51);
        }
        return new class247(this, class497.field6800, arg0);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljda;IIZ)V", line = 207)
    public final void method867(class240 arg0, int arg1, int arg2, boolean arg3) {
        int var5 = 0;
        byte var7;
        if (arg1 == 1) {
            var7 = 6;
        } else if (arg1 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg2 != 1) {
            this.field3447 = null;
        }
        if (arg3) {
            var5 |= 0x10;
        }
        this.field3462.SetTextureStageState(this.field7711, var7, method1614(false, arg0) | var5);
    }

    @OriginalMember(owner = "client!aia", name = "GA", descriptor = "(I)V", line = 251)
    public final void method536(int arg0) {
        this.field3462.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(IIIID)V", line = 257)
    public final void method530(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lel;)V", line = 259)
    public final void method527(class574 arg0) {
    }

    @OriginalMember(owner = "client!aia", name = "U", descriptor = "(I)V", line = 266)
    public final void method822(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field7762; var2++) {
            class307 var3 = this.field7736[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1965(0);
            float var6 = var3.method1966((byte) -58) / 255.0F;
            this.field3438.SetPosition((float) var3.method1962(arg0 - 19231), (float) var3.method1961(-128), (float) var3.method1958(true));
            this.field3438.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFFBA) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3438.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1963((byte) 14) * var3.method1963((byte) 123)));
            this.field3438.SetRange((float) var3.method1963((byte) 122));
            this.field3462.SetLight(var4, this.field3438);
            this.field3462.LightEnable(var4, true);
        }
        while (this.field7705 > var2) {
            this.field3462.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method822(arg0);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIILjagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;)Z", line = 302)
    private static final boolean method1611(int arg0, int arg1, int arg2, IDirect3D arg3, int arg4, D3DPRESENT_PARAMETERS arg5) {
        int var6 = 0;
        int var7 = 0;
        if (arg2 != 1) {
            field3456 = null;
        }
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class510.method2913(arg3.method2909(arg0, var9), arg2 - 18559)) {
                return false;
            }
            label83: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field3457.length; var10++) {
                        if (arg3.CheckDeviceType(arg0, arg4, var9.Format, field3457[var10], true) == 0 && arg3.CheckDeviceFormat(arg0, arg4, var9.Format, 1, 1, field3457[var10]) == 0 && (arg1 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg4, field3457[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field3460.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg0, arg4, var9.Format, 2, 1, field3460[var11]) == 0 && arg3.CheckDepthStencilMatch(arg0, arg4, var9.Format, field3457[var10], field3460[var11]) == 0 && (arg1 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg4, field3460[var10], true, var8) == 0)) {
                                    var7 = field3457[var10];
                                    var6 = field3460[var11];
                                    break label83;
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
            arg5.BackBufferFormat = var7;
            arg5.MultiSampleQuality = 0;
            arg5.AutoDepthStencilFormat = var6;
            arg5.MultiSampleType = var8;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)V", line = 406)
    public final void method514(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLwp;)V", line = 410)
    public final void method846(byte arg0, class193 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field3462.SetVertexDeclaration(var3.field4613);
        if (arg0 >= -96) {
            this.field3445 = false;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILbo;)I", line = 421)
    private static final int method1612(int arg0, class761 arg1) {
        if (class491.field6706 == arg1) {
            return 2;
        } else if (class282.field3915 == arg1) {
            return 3;
        } else if (class220.field3231 == arg1) {
            return 1;
        } else if (class501.field6860 == arg1) {
            return 4;
        } else if (class784.field10779 == arg1) {
            return 6;
        } else if (class295.field4029 == arg1) {
            return 5;
        } else {
            if (arg0 != 1) {
                method1613(55, null);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!aia", name = "V", descriptor = "(I)V", line = 455)
    public final void method829(int arg0) {
        if (this.field3437 == null && this.field7680[this.field7711] != class429.field5854) {
            if (this.field7680[this.field7711] == class462.field6288) {
                this.field3462.SetTransform(this.field7711 + 16, this.field7737[this.field7711].method2488(field3456, false));
            } else {
                this.field3462.SetTransform(this.field7711 + 16, this.field7737[this.field7711].method2492(field3456, -9233));
            }
            int var2 = method1617((byte) -70, this.field7680[this.field7711]);
            if (this.field3450[this.field7711] != var2) {
                this.field3462.SetTextureStageState(this.field7711, 24, var2);
                this.field3450[this.field7711] = var2;
            }
        } else {
            this.field3462.SetTextureStageState(this.field7711, 24, 0);
            this.field3450[this.field7711] = 0;
        }
        if (arg0 != 0) {
            this.method481(4);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V", line = 487)
    public final void method823(byte arg0) {
        this.field3462.method2922(14, this.field7772 && this.field7713);
        if (arg0 != 9) {
            field3460 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILafa;)I", line = 502)
    private static final int method1613(int arg0, class365 arg1) {
        if (class371.field5051 == arg1) {
            return 2;
        } else if (class671.field9318 == arg1) {
            return 4;
        } else if (class34.field565 == arg1) {
            return 26;
        } else if (class639.field8801 == arg1) {
            return 7;
        } else if (class726.field9977 == arg1) {
            return 10;
        } else if (arg0 == -1) {
            throw new IllegalArgumentException();
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLjda;)I", line = 531)
    private static final int method1614(boolean arg0, class240 arg1) {
        if (arg0) {
            method1613(-67, null);
        }
        if (class327.field4459 == arg1) {
            return 2;
        } else if (class620.field8626 == arg1) {
            return 0;
        } else if (class606.field8459 == arg1) {
            return 1;
        } else if (class633.field8767 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!aia", name = "s", descriptor = "()Z", line = 557)
    public final boolean method577() {
        return false;
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(ZB)V", line = 564)
    public final void method819(boolean arg0, byte arg1) {
        if (arg1 != 1) {
            this.method854((byte) -10);
        }
        this.field3462.method2922(161, arg0);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILta;Lbo;BIII)V", line = 579)
    public final void method830(int arg0, class226 arg1, class761 arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 16 % ((arg3 + 87) / 38);
        this.field3462.SetIndices(((class247) arg1).field3494);
        this.field3462.DrawIndexedPrimitive(method1612(1, arg2), 0, arg5, arg0, arg6, arg4);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Len;Len;FLen;)Len;", line = 594)
    public final class339 method535(class339 arg0, class339 arg1, float arg2, class339 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IBZ[[I)Lpj;", line = 601)
    public final class158 method847(int arg0, byte arg1, boolean arg2, int[][] arg3) {
        return arg1 >= -37 ? (class158) null : new class319(this, arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lbl;B)V", line = 611)
    public final void method853(class677 arg0, byte arg1) {
        if (arg1 != -22) {
            this.method844(-88, null);
        }
        int var3 = 0;
        if (class5.field69 == arg0) {
            var3 = 65536;
        } else if (class170.field2717 == arg0) {
            var3 = 131072;
        } else if (class519.field7045 == arg0) {
            var3 = 196608;
        }
        this.field3462.SetTextureStageState(this.field7711, 11, this.field7711 | var3);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLjagdx/IDirect3DPixelShader;)V", line = 634)
    public final void method1615(byte arg0, IDirect3DPixelShader arg1) {
        this.field3462.SetPixelShader(arg1);
        if (arg0 > 118) {
            ;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZIBII[I)Lgl;", line = 646)
    public final class627 method827(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int[] arg6) {
        return arg3 >= -75 ? (class627) null : new class763(this, arg0, arg4, arg1, arg6, arg2, arg5);
    }

    @OriginalMember(owner = "client!aia", name = "na", descriptor = "(IIII)[I", line = 658)
    public final int[] method484(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3462.method2917(0);
        IDirect3DSurface var7 = this.field3462.method2930(arg2, arg3, 21, 0, 0, true);
        if (class510.method2912(this.field3462.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -105) && class510.method2912(var7.LockRect(0, 0, arg2, arg3, 16, this.field3463), -73)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3463.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field3463.method2936(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3463.method2936(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3925(-6517);
        var7.method3925(-6517);
        return var5;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 697)
    public final void method845(Object arg0, int arg1, Canvas arg2) {
        if (arg1 != 0) {
            this.field3445 = true;
        }
    }

    @OriginalMember(owner = "client!aia", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lgj;Ljava/lang/Integer;)Lha;", line = 707)
    public static final class66 createToolkit(Canvas arg0, class162 arg1, class662 arg2, Integer arg3) {
        class242 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class701 var7 = new class701();
            IDirect3D var8 = IDirect3D.method2907(-2147483616, var7);
            D3DCAPS var9 = var8.method2908(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1611(var5, arg3, 1, var8, var6, var10)) {
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
                    var13 = var8.method2910(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class511 var17) {
                    var13 = var8.method2910(var5, var6, arg0, var11 | 0x20, var10);
                }
                class308 var15 = new class308(var13.method2915(0), var13.method2931());
                var4 = new class242(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3103((byte) -17);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method543();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(III[FZIILul;)Lgl;", line = 806)
    public final class627 method839(int arg0, int arg1, int arg2, float[] arg3, boolean arg4, int arg5, int arg6, class599 arg7) {
        if (arg5 != 15952) {
            this.method810(null, false, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljda;ZIZI)V", line = 818)
    public final void method841(class240 arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        int var6 = 0;
        byte var8;
        if (arg2 == 1) {
            var8 = 3;
        } else if (arg2 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg4 != 18680) {
            this.field3453 = 79;
        }
        if (arg1) {
            var6 |= 0x20;
        }
        if (arg3) {
            var6 |= 0x10;
        }
        this.field3462.SetTextureStageState(this.field7711, var8, method1614(false, arg0) | var6);
    }

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "()V", line = 865)
    public final void method558() {
    }

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "(II)Lmr;", line = 869)
    public final class155 method828(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method850(-82, -33, null, false, null);
        }
        if (arg1 == 3) {
            return new class785(this, this.field7635);
        } else if (arg1 == 4) {
            return new class42(this, this.field7635, this.field7516);
        } else if (arg1 == 8) {
            return new class267(this, this.field7635, this.field7516);
        } else {
            return super.method828(0, arg1);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lul;Lso;I)I", line = 912)
    public static final int method1616(class599 arg0, class497 arg1, int arg2) {
        int var3 = -109 % ((-arg2 - 53) / 61);
        if (class497.field6799 == arg1) {
            if (class320.field4368 == arg0) {
                return 22;
            }
            if (class530.field7176 == arg0) {
                return 21;
            }
            if (class485.field6566 == arg0) {
                return 28;
            }
            if (class14.field216 == arg0) {
                return 50;
            }
            if (class159.field2562 == arg0) {
                return 51;
            }
            if (class707.field9721 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!aia", name = "db", descriptor = "(I)V", line = 947)
    public final void method848(int arg0) {
        this.field3462.SetViewport(this.field7734, this.field7746, this.field7662, this.field7661, 0.0F, 1.0F);
        if (arg0 != -21421) {
            this.field3451 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 957)
    public final void method560(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class789 {
        this.method561(arg2, arg3);
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(B)V", line = 964)
    public final void method868(byte arg0) {
        this.field3458.SetAmbient(this.field7700 * this.field7685, this.field7692 * this.field7685, this.field7715 * this.field7685, 0.0F);
        this.field3442 = false;
        if (arg0 < 48) {
            this.field3443 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lso;ZLul;)Z", line = 976)
    public final boolean method810(class497 arg0, boolean arg1, class599 arg2) {
        if (!arg1) {
            this.field3452 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class510.method2912(this.field3461.method2909(this.field3453, var4), -77) && class510.method2912(this.field3461.CheckDeviceFormat(this.field3453, this.field3439, var4.Format, 0, 3, method1616(arg2, arg0, 58)), -81);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lul;BLso;)Z", line = 987)
    public final boolean method817(class599 arg0, byte arg1, class497 arg2) {
        if (arg1 == -87) {
            D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
            return class510.method2912(this.field3461.method2909(this.field3453, var4), arg1 ^ 0x1A) && class510.method2912(this.field3461.CheckDeviceFormat(this.field3453, this.field3439, var4.Format, 0, 4, method1616(arg0, arg2, arg1 + 132)), -117);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILbo;I)V", line = 1003)
    public final void method861(int arg0, int arg1, class761 arg2, int arg3) {
        this.field3462.DrawPrimitive(method1612(1, arg2), arg3, arg1);
        if (arg0 != 2) {
            this.method860(80);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLam;)I", line = 1015)
    private static final int method1617(byte arg0, class660 arg1) {
        if (arg0 != -70) {
            return 10;
        } else if (class353.field4702 == arg1) {
            return 1;
        } else if (class462.field6288 == arg1) {
            return 2;
        } else if (class758.field10447 == arg1) {
            return 3;
        } else if (class724.field9951 == arg1) {
            return 4;
        } else if (class541.field7383 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "(B)V", line = 1045)
    public final void method820(byte arg0) {
        if (arg0 != 109) {
            method1617((byte) 47, null);
        }
        this.field3462.method2922(15, this.field7741);
    }

    @OriginalMember(owner = "client!aia", name = "y", descriptor = "(B)V", line = 1056)
    public final void method852(byte arg0) {
        if (class611.field8531 == this.field7773) {
            this.field3462.SetRenderState(19, 5);
            this.field3462.SetRenderState(20, 6);
        } else if (class791.field10843 == this.field7773) {
            this.field3462.SetRenderState(19, 2);
            this.field3462.SetRenderState(20, 2);
        } else if (class666.field9257 == this.field7773) {
            this.field3462.SetRenderState(19, 9);
            this.field3462.SetRenderState(20, 2);
        }
        int var2 = 104 % ((23 - arg0) / 44);
    }

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "(Z)V", line = 1084)
    public final void method840(boolean arg0) {
        if (arg0) {
            this.field3462.SetRenderState(60, this.field7761);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLww;)V", line = 1097)
    public final void method1618(byte arg0, class763 arg1) {
        this.method1621((byte) 120, arg1);
        if (arg0 < 38) {
            this.method816((byte) -71);
        }
        if (this.field3451[this.field7711] != arg1.field10544) {
            this.field3462.SetSamplerState(this.field7711, 1, arg1.field10544 ? 1 : 3);
            this.field3451[this.field7711] = arg1.field10544;
        }
        if (this.field3452[this.field7711] != arg1.field10542) {
            this.field3462.SetSamplerState(this.field7711, 2, arg1.field10542 ? 1 : 3);
            this.field3452[this.field7711] = arg1.field10542;
        }
    }

    @OriginalMember(owner = "client!aia", name = "Y", descriptor = "(I)V", line = 1120)
    public final void method833(int arg0) {
        if (arg0 != 1) {
            this.field3462 = null;
        }
        if (this.field7664) {
            field3456[10] = 1.0F;
            field3456[12] = 0.0F;
            field3456[9] = 0.0F;
            field3456[1] = 0.0F;
            field3456[15] = 1.0F;
            field3456[3] = 0.0F;
            field3456[13] = 0.0F;
            field3456[0] = 1.0F;
            field3456[14] = 0.0F;
            field3456[2] = 0.0F;
            field3456[8] = 0.0F;
            field3456[4] = 0.0F;
            field3456[5] = 1.0F;
            field3456[11] = 0.0F;
            field3456[7] = 0.0F;
            field3456[6] = 0.0F;
        } else {
            this.field7663.method2492(field3456, arg0 ^ 0xFFFFDBEE);
        }
        this.field3462.SetTransform(256, field3456);
    }

    @OriginalMember(owner = "client!aia", name = "I", descriptor = "()I", line = 1157)
    public final int method538() {
        return 0;
    }

    @OriginalMember(owner = "client!aia", name = "Z", descriptor = "(I)V", line = 1167)
    public final void method864(int arg0) {
        int var2 = 12 % ((arg0 - 8) / 55);
        if (this.field3443[this.field7711]) {
            this.field3443[this.field7711] = false;
            this.field3462.SetTexture(this.field7711, null);
            this.method865(40);
            this.method854((byte) 29);
        }
    }

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "(I)V", line = 1182)
    public final void method821(int arg0) {
        if (arg0 > 74) {
            this.field3462.method2922(28, this.field7675 && this.field7703 && this.field7740 >= 0);
        }
    }

    @OriginalMember(owner = "client!aia", name = "B", descriptor = "(I)V", line = 1192)
    public final void method838(int arg0) {
        if (arg0 > 14) {
            this.field3462.method2922(174, this.field7798);
        }
    }

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "()Z", line = 1202)
    public final boolean method570() {
        return false;
    }

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "(B)V", line = 1210)
    public final void method826(byte arg0) {
        int var2 = -30 / ((arg0 + 65) / 37);
        this.field3462.method2922(27, this.field7678);
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(II)Lgh;", line = 1218)
    public final class575 method562(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!aia", name = "I", descriptor = "(I)V", line = 1226)
    public final void method825(int arg0) {
        this.field3462.SetTransform(3, this.field7676);
        if (arg0 > 53) {
            ;
        }
    }

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "(B)V", line = 1241)
    public final void method811(byte arg0) {
        this.field3462.method2922(137, this.field7747 && !this.field7727);
        if (arg0 != -15) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "(I)V", line = 1251)
    public final void method849(int arg0) {
        if (arg0 != 0) {
            this.method861(-123, 41, null, -69);
        }
        this.field3462.method2922(7, this.field7728);
    }

    @OriginalMember(owner = "client!aia", name = "eb", descriptor = "(I)Z", line = 1262)
    private final boolean method1619(int arg0) {
        int var2 = this.field3462.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class308 var3 = (class308) this.field7514;
            this.method3129(8);
            var3.method1967((byte) 124);
            this.field3441.BackBufferHeight = 0;
            this.field3441.BackBufferWidth = 0;
            if (method1611(this.field3453, this.field7690, arg0 ^ 0x2, this.field3461, this.field3439, this.field3441)) {
                int var4 = this.field3462.Reset(this.field3441);
                if (class510.method2912(var4, -61)) {
                    var3.method1970(this.field3462.method2931(), arg0 - 3, this.field3462.method2915(0));
                    this.method3121(arg0 - 119);
                    this.method862(6035);
                    return true;
                }
            }
        }
        if (arg0 != 3) {
            this.method816((byte) -58);
        }
        return false;
    }

    @OriginalMember(owner = "client!aia", name = "q", descriptor = "(I)V", line = 1302)
    public final void method860(int arg0) {
        this.field7722 = (this.field7719 - this.field7735);
        this.field7702 = this.field7722 - (float) this.field7740;
        if (this.field7702 < (float) this.field7701) {
            this.field7702 = this.field7701;
        }
        if (arg0 <= 61) {
            this.method849(45);
        }
        this.field3462.method2921(36, this.field7702);
        this.field3462.method2921(37, this.field7722);
        this.field3462.SetRenderState(34, this.field7716);
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V", line = 1322)
    public final void method862(int arg0) {
        for (int var2 = 0; var2 < this.field7754; var2++) {
            this.field3462.SetSamplerState(var2, 7, 0);
            this.field3462.SetSamplerState(var2, 6, 2);
            this.field3462.SetSamplerState(var2, 5, 2);
            this.field3462.SetSamplerState(var2, 1, 1);
            this.field3462.SetSamplerState(var2, 2, 1);
            this.field3459[var2] = class782.field10751;
            this.field3451[var2] = this.field3452[var2] = true;
            this.field3436[var2] = false;
            this.field3450[var2] = 0;
        }
        this.field3462.SetTextureStageState(0, 6, 1);
        this.field3462.SetRenderState(9, 2);
        this.field3462.SetRenderState(23, 4);
        this.field3462.SetRenderState(25, 5);
        this.field3462.SetRenderState(24, 0);
        this.field3462.SetRenderState(22, 2);
        this.field3462.SetRenderState(147, 1);
        this.field3462.SetRenderState(145, 1);
        this.field3462.method2921(38, 0.95F);
        this.field3462.SetRenderState(140, 3);
        this.field3458.SetType(3);
        this.field3454.SetType(3);
        this.field3438.SetType(1);
        this.field3442 = false;
        super.method862(arg0);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;B)V", line = 1360)
    public final void method1620(IDirect3DVertexShader arg0, byte arg1) {
        this.field3437 = arg0;
        this.field3462.SetVertexShader(arg0);
        this.method829(0);
        if (arg1 != 73) {
            this.field3459 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "(B)V", line = 1374)
    public final void method855(byte arg0) {
        if (arg0 != -123) {
            this.method581();
        }
        float var2 = this.field7683 ? this.field7721 : 0.0F;
        float var3 = this.field7683 ? -this.field7725 : 0.0F;
        this.field3458.SetDiffuse(this.field7700 * var2, this.field7692 * var2, this.field7715 * var2, 0.0F);
        this.field3454.SetDiffuse(this.field7700 * var3, this.field7692 * var3, this.field7715 * var3, 0.0F);
        this.field3442 = false;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)V", line = 1390)
    public final void method836(int arg0, byte arg1) {
        this.field3462.SetTextureStageState(this.field7711, 11, arg0);
        int var3 = 78 % ((arg1 + 18) / 44);
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(IZ)Lmha;", line = 1399)
    public final class438 method818(int arg0, boolean arg1) {
        return arg0 == 0 ? new class266(this, arg1) : (class438) null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I[BILul;II)Lvga;", line = 1409)
    public final class94 method857(int arg0, byte[] arg1, int arg2, class599 arg3, int arg4, int arg5) {
        return arg4 == 0 ? new class793(this, arg3, arg5, arg0, arg2, arg1) : (class94) null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLdj;)V", line = 1419)
    public final void method1621(byte arg0, class363 arg1) {
        this.field3462.SetTexture(this.field7711, arg1.method2032((byte) -107));
        if (this.field3459[this.field7711] != arg1.field4946) {
            int var3 = method1622(arg1.field4946, 0);
            this.field3462.SetSamplerState(this.field7711, 6, var3);
            this.field3462.SetSamplerState(this.field7711, 5, var3);
            this.field3459[this.field7711] = arg1.field4946;
            if (this.field3436[this.field7711] != arg1.field4943) {
                this.field3462.SetSamplerState(this.field7711, 7, arg1.field4943 ? method1622(arg1.field4946, 0) : 0);
                this.field3436[this.field7711] = arg1.field4943;
            }
        } else if (this.field3436[this.field7711] != arg1.field4943) {
            this.field3462.SetSamplerState(this.field7711, 7, arg1.field4943 ? method1622(arg1.field4946, 0) : 0);
            this.field3436[this.field7711] = arg1.field4943;
        }
        if (!this.field3443[this.field7711]) {
            this.field3443[this.field7711] = true;
            this.method865(13);
            this.method854((byte) 29);
        }
        if (arg0 <= 31) {
            this.method863(115, (byte) -56, null);
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)Loq;", line = 1461)
    public final class380 method540(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!aia", name = "x", descriptor = "()Laja;", line = 1470)
    public final class100 method586() {
        D3DADAPTER_IDENTIFIER var1 = this.field3461.method2911(this.field3453, 0);
        return new class100(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IBLmha;)V", line = 1482)
    public final void method863(int arg0, byte arg1, class438 arg2) {
        if (arg1 >= 44) {
            class266 var4 = (class266) arg2;
            this.field3462.SetStreamSource(arg0, var4.field3742, 0, var4.method1740(32606));
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(FFF)V", line = 1492)
    public final void method501(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1501)
    public final void method842(boolean arg0, Canvas arg1, Object arg2) {
        if (arg0) {
            this.method843(94);
        }
        if (this.field7490 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field3462.EndScene();
            this.method1619(3);
            this.field3462.BeginScene();
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V", line = 1525)
    public final void method486(boolean arg0) {
    }

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "()V", line = 1527)
    public final void method581() {
    }

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "(B)V", line = 1530)
    public final void method866(byte arg0) {
        if (arg0 >= -63) {
            this.method543();
        }
        this.field3458.SetDirection(-this.field7726[0], -this.field7726[1], -this.field7726[2]);
        this.field3454.SetDirection(-this.field7738[0], -this.field7738[1], -this.field7738[2]);
        this.field3442 = false;
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(II)V", line = 1542)
    public final void method561(int arg0, int arg1) throws class789 {
        this.field3462.EndScene();
        if (this.field3448.method1969((byte) -128)) {
            this.field3455 = 0;
            if (class510.method2913(this.field3448.method1968(-9364, 0), -18558)) {
                this.method1619(3);
            }
        } else if ((++this.field3455) <= 50) {
            this.method1619(3);
        } else {
            throw new class789();
        }
        this.field3462.BeginScene();
    }

    @OriginalMember(owner = "client!aia", name = "ya", descriptor = "()V", line = 1566)
    public final void method494() {
        this.method3112(true, (byte) 91);
        this.field3462.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V", line = 1574)
    public final synchronized void method481(int arg0) {
        this.field3447.method3923(false);
        super.method481(arg0);
    }

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "()V", line = 1584)
    public final void method548() {
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 1587)
    public final void method834(int arg0, Object arg1, Canvas arg2) {
        this.field3448 = (class308) arg1;
        if (arg0 != -7511) {
            this.method810(null, true, null);
        }
    }

    @OriginalMember(owner = "client!aia", name = "A", descriptor = "(I)V", line = 1604)
    public final void method865(int arg0) {
        int var2 = 84 / ((arg0 + 63) / 34);
        int var3 = this.field3443[this.field7711] ? method1613(-1, this.field7768[this.field7711]) : 1;
        this.field3462.SetTextureStageState(this.field7711, 4, var3);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lws;I)I", line = 1614)
    private static final int method1622(class379 arg0, int arg1) {
        if (class782.field10751 == arg0) {
            return 2;
        } else if (class642.field8891 == arg0) {
            return 1;
        } else if (arg1 == 0) {
            throw new IllegalArgumentException();
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "([BZILul;IIII)Lgl;", line = 1631)
    public final class627 method814(byte[] arg0, boolean arg1, int arg2, class599 arg3, int arg4, int arg5, int arg6, int arg7) {
        return arg2 == 8945 ? new class763(this, arg3, arg5, arg7, arg1, arg0, arg4, arg6) : (class627) null;
    }

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "(I)V", line = 1642)
    public final void method843(int arg0) {
        if (arg0 != 0) {
            this.method547(14, 35);
        }
    }

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "(B)V", line = 1651)
    public final void method816(byte arg0) {
        if (!this.field3442) {
            this.field3462.LightEnable(0, false);
            this.field3462.LightEnable(1, false);
            this.field3462.SetLight(0, this.field3458);
            this.field3462.SetLight(1, this.field3454);
            this.field3462.LightEnable(0, true);
            this.field3462.LightEnable(1, true);
            this.field3442 = true;
        }
        if (arg0 >= -27) {
            field3460 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "w", descriptor = "(B)V", line = 1672)
    public final void method831(byte arg0) {
        if (arg0 != 118) {
            this.method486(true);
        }
        if (this.field7712.method2601(false)) {
            this.field7672.method2492(field3456, -9233);
        } else {
            field3456[0] = 1.0F;
            field3456[12] = 0.0F;
            field3456[10] = 1.0F;
            field3456[9] = 0.0F;
            field3456[3] = 0.0F;
            field3456[4] = 0.0F;
            field3456[13] = 0.0F;
            field3456[11] = 0.0F;
            field3456[14] = 0.0F;
            field3456[5] = 1.0F;
            field3456[1] = 0.0F;
            field3456[6] = 0.0F;
            field3456[15] = 1.0F;
            field3456[7] = 0.0F;
            field3456[8] = 0.0F;
            field3456[2] = 0.0F;
        }
        this.field3462.SetTransform(2, field3456);
    }
}
