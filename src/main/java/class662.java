import jaclib.peer.class626;
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
import jagdx.class446;
import jagdx.class447;
import jagdx.class448;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class662 extends class382 {

    @OriginalMember(owner = "client!ega", name = "Jg", descriptor = "Z")
    private boolean field9283 = false;

    @OriginalMember(owner = "client!ega", name = "Ag", descriptor = "I")
    private int field9274 = 0;

    @OriginalMember(owner = "client!ega", name = "Hg", descriptor = "I")
    private int field9281;

    @OriginalMember(owner = "client!ega", name = "Kg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field9284;

    @OriginalMember(owner = "client!ega", name = "Ig", descriptor = "Ldea;")
    private class223 field9282;

    @OriginalMember(owner = "client!ega", name = "Mg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field9286;

    @OriginalMember(owner = "client!ega", name = "zg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field9273;

    @OriginalMember(owner = "client!ega", name = "Tg", descriptor = "Ljaclib/peer/fl;")
    public class626 field9293;

    @OriginalMember(owner = "client!ega", name = "Pg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field9289;

    @OriginalMember(owner = "client!ega", name = "Fg", descriptor = "I")
    private int field9279;

    @OriginalMember(owner = "client!ega", name = "Ng", descriptor = "Ljagdx/D3DLIGHT;")
    private class448 field9287;

    @OriginalMember(owner = "client!ega", name = "tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class448 field9267;

    @OriginalMember(owner = "client!ega", name = "Eg", descriptor = "Ljagdx/D3DLIGHT;")
    private class448 field9278;

    @OriginalMember(owner = "client!ega", name = "Qg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field9290;

    @OriginalMember(owner = "client!ega", name = "Sg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field9292;

    @OriginalMember(owner = "client!ega", name = "wg", descriptor = "Z")
    public boolean field9270;

    @OriginalMember(owner = "client!ega", name = "ug", descriptor = "Z")
    public boolean field9268;

    @OriginalMember(owner = "client!ega", name = "Cg", descriptor = "Z")
    public boolean field9276;

    @OriginalMember(owner = "client!ega", name = "vg", descriptor = "[Z")
    private boolean[] field9269;

    @OriginalMember(owner = "client!ega", name = "Dg", descriptor = "[Ldca;")
    private class160[] field9277;

    @OriginalMember(owner = "client!ega", name = "yg", descriptor = "[I")
    private int[] field9272;

    @OriginalMember(owner = "client!ega", name = "Bg", descriptor = "[Z")
    private boolean[] field9275;

    @OriginalMember(owner = "client!ega", name = "Og", descriptor = "[Z")
    private boolean[] field9288;

    @OriginalMember(owner = "client!ega", name = "Rg", descriptor = "[Z")
    private boolean[] field9291;

    @OriginalMember(owner = "client!ega", name = "xg", descriptor = "[F")
    private static float[] field9271 = new float[16];

    @OriginalMember(owner = "client!ega", name = "Lg", descriptor = "[I")
    private static int[] field9285 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ega", name = "Gg", descriptor = "[I")
    private static int[] field9280 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method1077(boolean arg0, int arg1) {
        this.field9273.SetTextureStageState(this.field5325, 11, arg1);
        if (!arg0) {
            this.method1055(-80);
        }
    }

    @OriginalMember(owner = "client!ega", name = "W", descriptor = "(I)V", line = 15)
    public final void method1078(int arg0) {
        if (arg0 != -16769) {
            return;
        }
        float var2 = this.field5374 ? this.field5353 : 0.0F;
        float var3 = this.field5374 ? -this.field5385 : 0.0F;
        this.field9287.SetDiffuse(this.field5332 * var2, this.field5358 * var2, this.field5324 * var2, 0.0F);
        this.field9267.SetDiffuse(this.field5332 * var3, this.field5358 * var3, this.field5324 * var3, 0.0F);
        this.field9283 = false;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Leu;I)V", line = 30)
    public final void method3730(class443 arg0, int arg1) {
        this.method3732(arg0, 6);
        if (!this.field9288[this.field5325]) {
            this.field9273.SetSamplerState(this.field5325, 1, 1);
            this.field9288[this.field5325] = true;
        }
        if (!this.field9291[this.field5325]) {
            this.field9273.SetSamplerState(this.field5325, 2, 1);
            this.field9291[this.field5325] = true;
        }
        if (arg1 != 14511) {
            this.method1021(null, (byte) -50, -61);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILpn;Ljg;)I", line = 53)
    public static final int method3731(int arg0, class692 arg1, class309 arg2) {
        if (class309.field4271 == arg2) {
            if (class46.field554 == arg1) {
                return 22;
            }
            if (class129.field1851 == arg1) {
                return 21;
            }
            if (class559.field7539 == arg1) {
                return 28;
            }
            if (class301.field4189 == arg1) {
                return 50;
            }
            if (class283.field3875 == arg1) {
                return 51;
            }
            if (class309.field4277 == arg1) {
                return 77;
            }
        }
        int var3 = -29 / ((arg0 - 82) / 35);
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "(I)V", line = 92)
    public final void method1026(int arg0) {
        if (arg0 <= 73) {
            this.method1044(false, (byte) -21);
        }
        int var2 = this.field9269[this.field5325] ? method3736(this.field5383[this.field5325], (byte) -81) : 1;
        this.field9273.SetTextureStageState(this.field5325, 4, var2);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II[BILpn;I)Ltea;", line = 103)
    public final class217 method1061(int arg0, int arg1, byte[] arg2, int arg3, class692 arg4, int arg5) {
        if (arg5 <= 59) {
            this.method1064((byte) 9);
        }
        return new class443(this, arg4, arg1, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(FFF)V", line = 113)
    public final void method147(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILeg;II)V", line = 117)
    public final void method1079(int arg0, class93 arg1, int arg2, int arg3) {
        if (arg3 == 10) {
            this.field9273.DrawPrimitive(method3735(arg1, 2), arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lhw;IIZ)V", line = 144)
    public final void method1051(class115 arg0, int arg1, int arg2, boolean arg3) {
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg3) {
            var7 |= 0x10;
        }
        this.field9273.SetTextureStageState(this.field5325, var6, var7 | method3737((byte) -119, arg0));
        if (arg2 > -45) {
            this.method1076(48);
        }
    }

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "(I)V", line = 180)
    public final void method1072(int arg0) {
        this.field9273.method2546(7, this.field5310);
        if (arg0 < 64) {
            this.method147(-0.5014175F, 0.1853824F, -0.35991645F);
        }
    }

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "()Lho;", line = 193)
    public final class134 method151() {
        D3DADAPTER_IDENTIFIER var1 = this.field9289.method2525(this.field9281, 0);
        return new class134(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljg;Lpn;I)Z", line = 203)
    public final boolean method1054(class309 arg0, class692 arg1, int arg2) {
        int var4 = -43 % ((arg2 - 76) / 44);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class446.method2528((byte) -110, this.field9289.method2522(this.field9281, var5)) && class446.method2528((byte) -127, this.field9289.CheckDeviceFormat(this.field9281, this.field9279, var5.Format, 0, 3, method3731(125, arg1, arg0)));
    }

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "()V", line = 211)
    public final void method196() {
    }

    @OriginalMember(owner = "client!ega", name = "D", descriptor = "(I)V", line = 215)
    public final void method1023(int arg0) {
        if (arg0 < 22) {
            this.field9293 = null;
        }
        this.field9273.SetTransform(3, this.field5314);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z[IIIIII)Lcm;", line = 229)
    public final class679 method1063(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 1) {
            this.field9290 = null;
        }
        return new class504(this, arg2, arg5, arg0, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "(I)V", line = 239)
    public final void method1030(int arg0) {
        this.field5336 = (this.field5347 - this.field5360);
        this.field5377 = (float) (-this.field5308) + this.field5336;
        if ((float) this.field5367 > this.field5377) {
            this.field5377 = this.field5367;
        }
        this.field9273.method2537(36, this.field5377);
        if (arg0 != 18913) {
            this.field9270 = false;
        }
        this.field9273.method2537(37, this.field5336);
        this.field9273.SetRenderState(34, this.field5309);
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/fl;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ldea;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lsea;I)V", line = 256)
    private class662(int arg0, int arg1, Canvas arg2, class626 arg3, IDirect3D arg4, IDirect3DDevice arg5, class223 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class212 arg9, class648 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field9281 = arg0;
        this.field9284 = arg8;
        this.field9282 = arg6;
        this.field9286 = arg7;
        this.field9273 = arg5;
        this.field9293 = arg3;
        this.field9289 = arg4;
        this.field9279 = arg1;
        this.field9287 = new class448(this.field9293);
        this.field9267 = new class448(this.field9293);
        this.field9278 = new class448(this.field9293);
        this.field9290 = new PixelBuffer(this.field9293);
        this.field9292 = new GeometryBuffer(this.field9293);
        new GeometryBuffer(this.field9293);
        this.field9270 = (this.field9284.TextureCaps & 0x2) == 0;
        this.field9268 = (this.field9284.TextureCaps & 0x4000) != 0;
        this.field5372 = (this.field9284.TextureCaps & 0x800) != 0;
        this.field5352 = this.field9284.MaxSimultaneousTextures;
        this.field5338 = this.field9284.MaxActiveLights > 0 ? this.field9284.MaxActiveLights : 8;
        this.field5340 = (this.field9284.TextureCaps & 0x2000) != 0;
        this.field9276 = (this.field9284.TextureCaps & 0x10000) != 0;
        this.field5302 = this.field5334 > 0 || this.field9289.CheckDeviceMultiSampleType(this.field9281, this.field9279, this.field9286.BackBufferFormat, true, 2) == 0;
        this.field9269 = new boolean[this.field5352];
        this.field9277 = new class160[this.field5352];
        this.field9272 = new int[this.field5352];
        this.field9275 = new boolean[this.field5352];
        this.field9288 = new boolean[this.field5352];
        this.field9291 = new boolean[this.field5352];
        this.field9273.BeginScene();
    }

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "(B)V", line = 297)
    public final void method1039(byte arg0) {
        if (class571.field8103 == this.field5350) {
            this.field9273.SetRenderState(19, 5);
            this.field9273.SetRenderState(20, 6);
        } else if (class416.field5864 == this.field5350) {
            this.field9273.SetRenderState(19, 2);
            this.field9273.SetRenderState(20, 2);
        } else if (class4.field32 == this.field5350) {
            this.field9273.SetRenderState(19, 9);
            this.field9273.SetRenderState(20, 2);
        }
        if (arg0 != -26) {
            field9280 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lpi;I)V", line = 328)
    public final void method3732(class461 arg0, int arg1) {
        if (arg1 != 6) {
            this.method96();
        }
        this.field9273.SetTexture(this.field5325, arg0.method2393((byte) 83));
        if (this.field9277[this.field5325] != arg0.field6356) {
            int var3 = method3738(arg0.field6356, (byte) -38);
            this.field9273.SetSamplerState(this.field5325, 6, var3);
            this.field9273.SetSamplerState(this.field5325, 5, var3);
            this.field9277[this.field5325] = arg0.field6356;
            if (this.field9275[this.field5325] != arg0.field6357) {
                this.field9273.SetSamplerState(this.field5325, 7, arg0.field6357 ? method3738(arg0.field6356, (byte) -26) : 0);
                this.field9275[this.field5325] = arg0.field6357;
            }
        } else if (this.field9275[this.field5325] != arg0.field6357) {
            this.field9273.SetSamplerState(this.field5325, 7, arg0.field6357 ? method3738(arg0.field6356, (byte) -73) : 0);
            this.field9275[this.field5325] = arg0.field6357;
        }
        if (!this.field9269[this.field5325]) {
            this.field9269[this.field5325] = true;
            this.method1026(115);
            this.method1060(20018);
        }
    }

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "(B)V", line = 368)
    public final void method1049(byte arg0) {
        if (arg0 != 27) {
            this.method1055(-102);
        }
        this.field9273.method2546(137, this.field5315 && !this.field5295);
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "(II)Lcc;", line = 380)
    public final class681 method1041(int arg0, int arg1) {
        if (arg0 != 128) {
            this.field9269 = null;
        }
        if (arg1 == 3) {
            return new class102(this, this.field5203);
        } else if (arg1 == 4) {
            return new class304(this, this.field5203, this.field5266);
        } else if (arg1 == 8) {
            return new class690(this, this.field5203, this.field5266);
        } else {
            return super.method1041(128, arg1);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 422)
    public final void method92(Rectangle[] arg0, int arg1) throws class39 {
        this.method100();
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BLpn;ILjg;I)Lcm;", line = 429)
    public final class679 method1025(byte arg0, class692 arg1, int arg2, class309 arg3, int arg4) {
        if (arg0 != 59) {
            this.field9283 = true;
        }
        return new class504(this, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ega", name = "ya", descriptor = "()V", line = 439)
    public final void method89() {
        this.method2254(true, (byte) -123);
        this.field9273.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(Ljg;Lpn;I)Z", line = 448)
    public final boolean method1070(class309 arg0, class692 arg1, int arg2) {
        if (arg2 != 23770) {
            this.field9288 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class446.method2528((byte) 9, this.field9289.method2522(this.field9281, var4)) && class446.method2528((byte) -118, this.field9289.CheckDeviceFormat(this.field9281, this.field9279, var4.Format, 0, 4, method3731(-36, arg1, arg0)));
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;IIIB)Z", line = 460)
    private static final boolean method3733(IDirect3D arg0, D3DPRESENT_PARAMETERS arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class446.method2527(2005530584, arg0.method2522(arg3, var9))) {
                return false;
            }
            label83: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field9280.length; var10++) {
                        if (arg0.CheckDeviceType(arg3, arg4, var9.Format, field9280[var10], true) == 0 && arg0.CheckDeviceFormat(arg3, arg4, var9.Format, 1, 1, field9280[var10]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg4, field9280[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field9285.length; var11++) {
                                if (arg0.CheckDeviceFormat(arg3, arg4, var9.Format, 2, 1, field9285[var11]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg4, var9.Format, field9280[var10], field9285[var11]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg4, field9285[var10], true, var8) == 0)) {
                                    var6 = field9285[var11];
                                    var7 = field9280[var10];
                                    break label83;
                                }
                            }
                        }
                    }
                }
                arg2--;
            }
            if (arg5 <= 108) {
                field9271 = null;
            }
            if (arg2 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg1.MultiSampleType = var8;
            arg1.MultiSampleQuality = 0;
            arg1.AutoDepthStencilFormat = var6;
            arg1.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Leg;IIIILjea;B)V", line = 564)
    public final void method1065(class93 arg0, int arg1, int arg2, int arg3, int arg4, class415 arg5, byte arg6) {
        if (arg6 != -104) {
            this.method1032(-56);
        }
        this.field9273.SetIndices(((class608) arg5).field8450);
        this.field9273.DrawIndexedPrimitive(method3735(arg0, 2), 0, arg2, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 585)
    public final void method1043(Object arg0, Canvas arg1, byte arg2) {
        int var4 = 15 % ((arg2 + 11) / 44);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZLou;)V", line = 593)
    public final void method1042(boolean arg0, class562 arg1) {
        if (arg0) {
            this.field9293 = null;
        }
        int var3 = 0;
        if (class669.field9395 == arg1) {
            var3 = 65536;
        } else if (class543.field7375 == arg1) {
            var3 = 131072;
        } else if (class563.field7604 == arg1) {
            var3 = 196608;
        }
        this.field9273.SetTextureStageState(this.field5325, 11, this.field5325 | var3);
    }

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "(I)V", line = 615)
    public final void method1027(int arg0) {
        this.field9273.method2546(15, this.field5354);
        if (arg0 > -63) {
            field9285 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "(B)V", line = 626)
    public final void method1064(byte arg0) {
        if (arg0 >= -12) {
            this.method1057(97);
        }
        this.field9273.method2546(27, this.field5356);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lwn;Lwn;FLwn;)Lwn;", line = 636)
    public final class674 method91(class674 arg0, class674 arg1, float arg2, class674 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lf;Z)V", line = 643)
    public final void method164(class702 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 646)
    public final void method1071(Object arg0, int arg1, Canvas arg2) {
        if (this.field5163 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field9273.EndScene();
                this.method3734(-30081);
                this.field9273.BeginScene();
            }
        }
        if (arg1 != 11) {
            this.field9281 = 28;
        }
    }

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "(B)V", line = 671)
    public final void method1036(byte arg0) {
        this.field9273.method2546(174, this.field5409);
        if (arg0 >= -113) {
            this.field9268 = false;
        }
    }

    @OriginalMember(owner = "client!ega", name = "Q", descriptor = "(I)V", line = 683)
    public final void method1037(int arg0) {
        if (arg0 > -123) {
            this.method1039((byte) 124);
        }
        this.field9273.method2546(28, this.field5355 && this.field5291 && this.field5308 >= 0);
    }

    @OriginalMember(owner = "client!ega", name = "jb", descriptor = "(I)Z", line = 694)
    private final boolean method3734(int arg0) {
        int var2 = this.field9273.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class223 var3 = (class223) this.field5243;
            this.method2242(arg0 ^ 0xFFFFFBF5);
            var3.method1409(59);
            this.field9286.BackBufferWidth = 0;
            this.field9286.BackBufferHeight = 0;
            if (method3733(this.field9289, this.field9286, this.field5334, this.field9281, this.field9279, (byte) 111)) {
                int var4 = this.field9273.Reset(this.field9286);
                if (class446.method2528((byte) -123, var4)) {
                    var3.method1411(this.field9273.method2541(), this.field9273.method2539(0), -12630);
                    this.method2211(true);
                    this.method1055(1024);
                    return true;
                }
            }
        }
        if (arg0 != -30081) {
            this.field9282 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ega", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lsea;Ljava/lang/Integer;)Lr;", line = 733)
    public static final class166 createToolkit(Canvas arg0, class212 arg1, class648 arg2, Integer arg3) {
        class662 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class626 var7 = new class626();
            IDirect3D var8 = IDirect3D.method2524(-2147483616, var7);
            D3DCAPS var9 = var8.method2523(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3733(var8, var10, arg3, var5, var6, (byte) 118)) {
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
                    var13 = var8.method2526(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class447 var17) {
                    var13 = var8.method2526(var5, var6, arg0, var11 | 0x20, var10);
                }
                class223 var15 = new class223(var13.method2539(0), var13.method2541());
                var4 = new class662(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2204(-51);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method136();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ega", name = "x", descriptor = "(I)V", line = 836)
    public final void method1055(int arg0) {
        for (int var2 = 0; var2 < this.field5352; var2++) {
            this.field9273.SetSamplerState(var2, 7, 0);
            this.field9273.SetSamplerState(var2, 6, 2);
            this.field9273.SetSamplerState(var2, 5, 2);
            this.field9273.SetSamplerState(var2, 1, 1);
            this.field9273.SetSamplerState(var2, 2, 1);
            this.field9277[var2] = class544.field7382;
            this.field9288[var2] = this.field9291[var2] = true;
            this.field9275[var2] = false;
            this.field9272[var2] = 0;
        }
        this.field9273.SetTextureStageState(0, 6, 1);
        this.field9273.SetRenderState(9, 2);
        this.field9273.SetRenderState(23, 4);
        this.field9273.SetRenderState(25, 5);
        this.field9273.SetRenderState(24, 0);
        this.field9273.SetRenderState(22, 2);
        this.field9273.SetRenderState(147, 1);
        this.field9273.SetRenderState(145, 1);
        this.field9273.method2537(38, 0.95F);
        this.field9273.SetRenderState(140, 3);
        this.field9287.SetType(3);
        this.field9267.SetType(3);
        this.field9278.SetType(1);
        this.field9283 = false;
        super.method1055(arg0);
    }

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "(B)V", line = 872)
    public final void method1075(byte arg0) {
        this.field9273.SetScissorRect(this.field5381 + this.field5376, this.field5361 + this.field5322, this.field5331, this.field5318);
        if (arg0 < 64) {
            this.method1047(2);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(ZB)V", line = 883)
    public final void method1044(boolean arg0, byte arg1) {
        this.field9273.method2546(161, arg0);
        if (arg1 < 1) {
            this.method1077(true, -34);
        }
    }

    @OriginalMember(owner = "client!ega", name = "Z", descriptor = "(I)V", line = 895)
    public final void method1057(int arg0) {
        if (arg0 != 30624) {
            field9280 = null;
        }
        if (this.field5368[this.field5325] == class635.field8783) {
            this.field9273.SetTextureStageState(this.field5325, 24, 0);
            this.field9272[this.field5325] = 0;
            return;
        }
        if (this.field5368[this.field5325] == class467.field6424) {
            this.field9273.SetTransform(this.field5325 + 16, this.field5288[this.field5325].method1712(field9271, 1733));
        } else {
            this.field9273.SetTransform(this.field5325 + 16, this.field5288[this.field5325].method1718(field9271, 1));
        }
        int var2 = method3740(14, this.field5368[this.field5325]);
        if (this.field9272[this.field5325] != var2) {
            this.field9273.SetTextureStageState(this.field5325, 24, var2);
            this.field9272[this.field5325] = var2;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Leg;I)I", line = 926)
    private static final int method3735(class93 arg0, int arg1) {
        if (class372.field5013 == arg0) {
            return 2;
        } else if (class628.field8698 == arg0) {
            return 3;
        } else if (class254.field3441 == arg0) {
            return 1;
        } else if (class345.field4628 == arg0) {
            return 4;
        } else if (class412.field5846 == arg0) {
            return 6;
        } else if (class12.field124 == arg0) {
            return 5;
        } else if (arg1 == 2) {
            throw new IllegalArgumentException("");
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "(I)V", line = 959)
    public final void method1060(int arg0) {
        if (arg0 != 20018) {
            this.method1043(null, null, (byte) 96);
        }
        int var2 = this.field9269[this.field5325] ? method3736(this.field5323[this.field5325], (byte) -81) : 1;
        this.field9273.SetTextureStageState(this.field5325, 1, var2);
    }

    @OriginalMember(owner = "client!ega", name = "B", descriptor = "(I)V", line = 972)
    public final void method1040(int arg0) {
        if (this.field5278) {
            field9271[7] = 0.0F;
            field9271[4] = 0.0F;
            field9271[8] = 0.0F;
            field9271[15] = 1.0F;
            field9271[14] = 0.0F;
            field9271[13] = 0.0F;
            field9271[5] = 1.0F;
            field9271[9] = 0.0F;
            field9271[10] = 1.0F;
            field9271[6] = 0.0F;
            field9271[1] = 0.0F;
            field9271[3] = 0.0F;
            field9271[12] = 0.0F;
            field9271[0] = 1.0F;
            field9271[2] = 0.0F;
            field9271[11] = 0.0F;
        } else {
            this.field5280.method1712(field9271, 1733);
        }
        if (arg0 != -1113) {
            this.method3739(null, false);
        }
        this.field9273.SetTransform(256, field9271);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lgi;B)I", line = 1008)
    private static final int method3736(class631 arg0, byte arg1) {
        if (arg1 != -81) {
            field9271 = null;
        }
        if (class276.field3814 == arg0) {
            return 2;
        } else if (class334.field4505 == arg0) {
            return 4;
        } else if (class127.field1821 == arg0) {
            return 26;
        } else if (class335.field4510 == arg0) {
            return 7;
        } else if (class412.field5840 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 1037)
    public final void method1022(byte arg0) {
        this.field9273.SetRenderState(60, this.field5362);
        if (arg0 >= -69) {
            this.field9282 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BLhw;)I", line = 1048)
    private static final int method3737(byte arg0, class115 arg1) {
        int var2 = 78 % ((-arg0 - 21) / 51);
        if (class262.field3553 == arg1) {
            return 2;
        } else if (class227.field3159 == arg1) {
            return 0;
        } else if (class78.field1179 == arg1) {
            return 1;
        } else if (class452.field6221 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "(I)V", line = 1072)
    public final synchronized void method194(int arg0) {
        this.field9293.method3500(942);
        super.method194(arg0);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIII)V", line = 1083)
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "(B)V", line = 1086)
    public final void method1074(byte arg0) {
        if (this.field5327.method2788((byte) 95)) {
            this.field5284.method1712(field9271, arg0 + 1632);
        } else {
            field9271[1] = 0.0F;
            field9271[10] = 1.0F;
            field9271[14] = 0.0F;
            field9271[6] = 0.0F;
            field9271[0] = 1.0F;
            field9271[15] = 1.0F;
            field9271[2] = 0.0F;
            field9271[4] = 0.0F;
            field9271[11] = 0.0F;
            field9271[13] = 0.0F;
            field9271[12] = 0.0F;
            field9271[7] = 0.0F;
            field9271[8] = 0.0F;
            field9271[9] = 0.0F;
            field9271[3] = 0.0F;
            field9271[5] = 1.0F;
        }
        this.field9273.SetTransform(2, field9271);
        if (arg0 != 101) {
            this.field9276 = true;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILsi;)V", line = 1125)
    public final void method1050(int arg0, class520 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field9273.SetVertexDeclaration(var3.field4021);
        if (arg0 != 0) {
            this.method91(null, null, 0.9994612F, null);
        }
    }

    @OriginalMember(owner = "client!ega", name = "C", descriptor = "()Z", line = 1136)
    public final boolean method192() {
        return false;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BLpn;IZII[BI)Lcm;", line = 1146)
    public final class679 method1059(byte arg0, class692 arg1, int arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        if (arg0 != 2) {
            this.field9279 = 26;
        }
        return new class504(this, arg1, arg2, arg4, arg3, arg6, arg5, arg7);
    }

    @OriginalMember(owner = "client!ega", name = "H", descriptor = "(I)V", line = 1157)
    public final void method1045(int arg0) {
        if (arg0 != -1) {
            this.field9267 = null;
        }
        if (this.field9269[this.field5325]) {
            this.field9269[this.field5325] = false;
            this.field9273.SetTexture(this.field5325, null);
            this.method1026(arg0 ^ 0xFFFFFFAF);
            this.method1060(arg0 + 20019);
        }
    }

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "()V", line = 1176)
    public final void method98() {
        IDirect3DEventQuery var1 = this.field9273.method2532();
        if (class446.method2528((byte) 54, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3495(-8);
    }

    @OriginalMember(owner = "client!ega", name = "x", descriptor = "()V", line = 1199)
    public final void method104() {
    }

    @OriginalMember(owner = "client!ega", name = "V", descriptor = "(I)V", line = 1203)
    public final void method1032(int arg0) {
        this.field9287.SetAmbient(this.field5332 * this.field5320, this.field5358 * this.field5320, this.field5324 * this.field5320, 0.0F);
        this.field9283 = false;
        if (arg0 != 1) {
            this.field9282 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "()V", line = 1217)
    public final void method100() throws class39 {
        this.field9273.EndScene();
        if (this.field9282.method1412(26362)) {
            this.field9274 = 0;
            if (class446.method2527(2005530584, this.field9282.method1410(-117, 0))) {
                this.method3734(-30081);
            }
        } else if (++this.field9274 <= 50) {
            this.method3734(-30081);
        } else {
            throw new class39();
        }
        this.field9273.BeginScene();
    }

    @OriginalMember(owner = "client!ega", name = "hb", descriptor = "(I)V", line = 1242)
    public final void method1047(int arg0) {
        if (arg0 > -81) {
            field9271 = null;
        }
        int var2;
        for (var2 = 0; var2 < this.field5345; var2++) {
            class186 var3 = this.field5287[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1283(0);
            float var6 = var3.method1285(-1120) / 255.0F;
            this.field9278.SetPosition((float) var3.method1280(true), (float) var3.method1282((byte) 102), (float) var3.method1279(0));
            this.field9278.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field9278.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1281(105) * var3.method1281(56)));
            this.field9278.SetRange((float) var3.method1281(39));
            this.field9273.SetLight(var4, this.field9278);
            this.field9273.LightEnable(var4, true);
        }
        while (var2 < this.field5290) {
            this.field9273.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1047(-106);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 1281)
    public final void method1031(Canvas arg0, byte arg1, Object arg2) {
        this.field9282 = (class223) arg2;
        if (arg1 != 36) {
            this.field9269 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "(Z)V", line = 1291)
    public final void method1069(boolean arg0) {
        this.field9273.method2546(14, this.field5312 && this.field5304);
        if (arg0) {
            this.method1053(11);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z[[III)Lhea;", line = 1302)
    public final class388 method1028(boolean arg0, int[][] arg1, int arg2, int arg3) {
        if (arg3 < 44) {
            this.field9287 = null;
        }
        return new class411(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "(I)V", line = 1312)
    public final void method1066(int arg0) {
        if (arg0 != 16777215) {
            this.method1064((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ega", name = "ja", descriptor = "(I)V", line = 1321)
    public final void method101(int arg0) {
        this.field9273.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "(B)V", line = 1328)
    public final void method1024(byte arg0) {
        if (arg0 != 64) {
            field9280 = null;
        }
        this.field9273.SetViewport(this.field5376, this.field5361, this.field5208, this.field5165, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "(ZI)Ljea;", line = 1338)
    public final class415 method1062(boolean arg0, int arg1) {
        return arg1 == 18554 ? new class608(this, class309.field4272, arg0) : (class415) null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ldca;B)I", line = 1349)
    private static final int method3738(class160 arg0, byte arg1) {
        if (arg1 >= -10) {
            field9280 = null;
        }
        if (class544.field7382 == arg0) {
            return 2;
        } else if (class216.field3051 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "()Z", line = 1366)
    public final boolean method120() {
        return false;
    }

    @OriginalMember(owner = "client!ega", name = "G", descriptor = "(I)V", line = 1373)
    public final void method1053(int arg0) {
        if (arg0 != 0) {
            this.field9267 = null;
        }
        this.method1078(arg0 - 16769);
        this.method1076(10);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lvc;BI)V", line = 1386)
    public final void method1021(class288 arg0, byte arg1, int arg2) {
        class641 var4 = (class641) arg0;
        if (arg1 <= 101) {
            this.field9290 = null;
        }
        this.field9273.SetStreamSource(arg2, var4.field8856, 0, var4.method3567((byte) -40));
    }

    @OriginalMember(owner = "client!ega", name = "U", descriptor = "(I)V", line = 1397)
    public final void method1035(int arg0) {
        this.field9287.SetDirection(-this.field5349[0], -this.field5349[1], -this.field5349[2]);
        if (arg0 == 10) {
            this.field9267.SetDirection(-this.field5369[0], -this.field5369[1], -this.field5369[2]);
            this.field9283 = false;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZIZLhw;I)V", line = 1431)
    public final void method1052(boolean arg0, int arg1, boolean arg2, class115 arg3, int arg4) {
        byte var7;
        if (arg1 == 1) {
            var7 = 3;
        } else if (arg1 == 2) {
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
        this.field9273.SetTextureStageState(this.field5325, var7, var8 | method3737((byte) 90, arg3));
        if (arg4 < 88) {
            field9271 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "N", descriptor = "(I)V", line = 1469)
    public final void method1076(int arg0) {
        if (arg0 != 10) {
            this.method1036((byte) -125);
        }
        if (this.field9283) {
            return;
        }
        this.field9273.LightEnable(0, false);
        this.field9273.LightEnable(1, false);
        this.field9273.SetLight(0, this.field9287);
        this.field9273.SetLight(1, this.field9267);
        this.field9273.LightEnable(0, true);
        this.field9273.LightEnable(1, true);
        this.field9283 = true;
    }

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "()V", line = 1488)
    public final void method96() {
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lmd;Z)V", line = 1491)
    public final void method3739(class504 arg0, boolean arg1) {
        this.method3732(arg0, 6);
        if (this.field9288[this.field5325] != arg0.field6920) {
            this.field9273.SetSamplerState(this.field5325, 1, arg0.field6920 ? 1 : 3);
            this.field9288[this.field5325] = arg0.field6920;
        }
        if (arg0.field6919 != this.field9291[this.field5325]) {
            this.field9273.SetSamplerState(this.field5325, 2, arg0.field6919 ? 1 : 3);
            this.field9291[this.field5325] = arg0.field6919;
        }
        if (!arg1) {
            this.method1059((byte) 17, null, 123, true, 36, -20, null, 51);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1514)
    public final Object method1073(Canvas arg0, int arg1) {
        if (arg1 <= 101) {
            this.method1022((byte) -79);
        }
        return null;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(Z)V", line = 1526)
    public final void method157(boolean arg0) {
    }

    @OriginalMember(owner = "client!ega", name = "DA", descriptor = "()I", line = 1529)
    public final int method184() {
        return 0;
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(ZI)Lvc;", line = 1537)
    public final class288 method1038(boolean arg0, int arg1) {
        int var3 = 124 % ((arg1 + 2) / 39);
        return new class641(this, arg0);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZI[FIIILpn;)Lcm;", line = 1545)
    public final class679 method1058(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class692 arg7) {
        return arg4 == 9 ? null : (class679) null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([Lth;B)Lsi;", line = 1555)
    public final class520 method1033(class553[] arg0, byte arg1) {
        if (arg1 != -127) {
            this.method1061(-70, -120, null, 76, null, 60);
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "(IIII)[I", line = 1566)
    public final int[] method148(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field9273.method2538(0);
        IDirect3DSurface var7 = this.field9273.method2531(arg2, arg3, 21, 0, 0, true);
        if (class446.method2528((byte) -108, this.field9273.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class446.method2528((byte) -106, var7.LockRect(0, 0, arg2, arg3, 16, this.field9290))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field9290.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field9290.method2551(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field9290.method2551(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3495(-3);
        var7.method3495(115);
        return var5;
    }

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "()V", line = 1606)
    public final void method125() {
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILtb;)I", line = 1609)
    private static final int method3740(int arg0, class365 arg1) {
        if (class39.field460 == arg1) {
            return 1;
        } else if (class41.field482 == arg1) {
            return 2;
        } else if (class108.field1500 == arg1) {
            return 3;
        } else if (class467.field6424 == arg1) {
            return 4;
        } else if (class112.field1544 == arg1) {
            return 256;
        } else {
            if (arg0 != 14) {
                method3737((byte) -6, null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ega", name = "X", descriptor = "(I)F", line = 1639)
    public final float method1056(int arg0) {
        if (arg0 != 0) {
            this.method1074((byte) 13);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "()V", line = 1650)
    public final void method136() {
        this.field9293.method3496(false);
        super.method136();
    }
}
