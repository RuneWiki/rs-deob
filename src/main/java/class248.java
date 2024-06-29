import jaclib.peer.class441;
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
import jagdx.class769;
import jagdx.class770;
import jagdx.class771;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class248 extends class696 {

    @OriginalMember(owner = "client!cka", name = "Wg", descriptor = "I")
    private int field3395 = 0;

    @OriginalMember(owner = "client!cka", name = "Ug", descriptor = "Z")
    private boolean field3393 = false;

    @OriginalMember(owner = "client!cka", name = "Xg", descriptor = "I")
    private int field3396;

    @OriginalMember(owner = "client!cka", name = "Zg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3398;

    @OriginalMember(owner = "client!cka", name = "ah", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!cka", name = "hh", descriptor = "Lsq;")
    private class16 field3406;

    @OriginalMember(owner = "client!cka", name = "bh", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3400;

    @OriginalMember(owner = "client!cka", name = "fh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3404;

    @OriginalMember(owner = "client!cka", name = "gh", descriptor = "Ljaclib/peer/iw;")
    public class441 field3405;

    @OriginalMember(owner = "client!cka", name = "dh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3402;

    @OriginalMember(owner = "client!cka", name = "Vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class770 field3394;

    @OriginalMember(owner = "client!cka", name = "Lg", descriptor = "Ljagdx/D3DLIGHT;")
    private class770 field3384;

    @OriginalMember(owner = "client!cka", name = "Qg", descriptor = "Ljagdx/D3DLIGHT;")
    private class770 field3389;

    @OriginalMember(owner = "client!cka", name = "Og", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3387;

    @OriginalMember(owner = "client!cka", name = "Jg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3382;

    @OriginalMember(owner = "client!cka", name = "Pg", descriptor = "Z")
    public boolean field3388;

    @OriginalMember(owner = "client!cka", name = "Ig", descriptor = "Z")
    public boolean field3381;

    @OriginalMember(owner = "client!cka", name = "Ng", descriptor = "Z")
    public boolean field3386;

    @OriginalMember(owner = "client!cka", name = "ih", descriptor = "[Z")
    private boolean[] field3407;

    @OriginalMember(owner = "client!cka", name = "Sg", descriptor = "[Lqt;")
    private class525[] field3391;

    @OriginalMember(owner = "client!cka", name = "Yg", descriptor = "[I")
    private int[] field3397;

    @OriginalMember(owner = "client!cka", name = "eh", descriptor = "[Z")
    private boolean[] field3403;

    @OriginalMember(owner = "client!cka", name = "Kg", descriptor = "[Z")
    private boolean[] field3383;

    @OriginalMember(owner = "client!cka", name = "Rg", descriptor = "[Z")
    private boolean[] field3390;

    @OriginalMember(owner = "client!cka", name = "Mg", descriptor = "[F")
    private static float[] field3385 = new float[16];

    @OriginalMember(owner = "client!cka", name = "ch", descriptor = "[I")
    private static int[] field3401 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!cka", name = "jh", descriptor = "[I")
    private static int[] field3408 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!cka", name = "Tg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3392;

    @OriginalMember(owner = "client!cka", name = "Q", descriptor = "(I)V")
    public final void method1187(int arg0) {
        if (arg0 > -64) {
            this.field3405 = null;
        }
        this.field3402.method4173(137, this.field9163 && !this.field9134);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ltn;BLds;)Z")
    public final boolean method1188(class749 arg0, byte arg1, class73 arg2) {
        if (arg1 >= -29) {
            this.field3387 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class771.method4195(false, this.field3404.method4192(this.field3399, var4)) && class771.method4195(false, this.field3404.CheckDeviceFormat(this.field3399, this.field3396, var4.Format, 0, 3, method1620(-84, arg2, arg0)));
    }

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "(I)V")
    public final void method1181(int arg0) {
        if (arg0 != 1) {
            this.method1182((int[][]) ((int[][]) null), 8, false, -94);
        }
        int var2 = this.field3390[this.field9129] ? method1611(this.field9210[this.field9129], (byte) -108) : 1;
        this.field3402.SetTextureStageState(this.field9129, 4, var2);
    }

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "(II)V")
    public final void method925(int arg0, int arg1) throws class15 {
        this.field3402.EndScene();
        if (this.field3406.method65((byte) 21)) {
            this.field3395 = 0;
            if (class771.method4196((byte) -54, this.field3406.method66(0, (byte) 90))) {
                this.method1609(-100);
            }
        } else if ((++this.field3395) <= 50) {
            this.method1609(-121);
        } else {
            throw new class15();
        }
        this.field3402.BeginScene();
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIII)V")
    public final void method983(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lds;ILtn;)Z")
    public final boolean method1208(class73 arg0, int arg1, class749 arg2) {
        if (arg1 != 0) {
            this.field3386 = true;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class771.method4195(false, this.field3404.method4192(this.field3399, var4)) && class771.method4195(false, this.field3404.CheckDeviceFormat(this.field3399, this.field3396, var4.Format, 0, 4, method1620(-83, arg0, arg2)));
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(BILcq;)V")
    public final void method1200(byte arg0, int arg1, class233 arg2) {
        class46 var4 = (class46) arg2;
        this.field3402.SetStreamSource(arg1, var4.field525, 0, var4.method282(-75));
        if (arg0 > -88) {
            this.field3391 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lmd;)V")
    public final void method905(class649 arg0) {
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public final void method1167(Object arg0, Canvas arg1, boolean arg2) {
        if (!arg2) {
            this.field3390 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)V")
    public final void method1174(byte arg0) {
        this.field9120 = (this.field9170 - this.field9147);
        this.field9159 = this.field9120 - (float) this.field9183;
        if (this.field9159 < (float) this.field9135) {
            this.field9159 = this.field9135;
        }
        this.field3402.method4175(36, this.field9159);
        int var2 = 63 / ((arg0 - 19) / 50);
        this.field3402.method4175(37, this.field9120);
        this.field3402.SetRenderState(34, this.field9141);
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(Z)V")
    public final void method934(boolean arg0) {
    }

    @OriginalMember(owner = "client!cka", name = "jb", descriptor = "(I)Z")
    private final boolean method1609(int arg0) {
        if (arg0 > -26) {
            this.field3397 = null;
        }
        int var2 = this.field3402.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class16 var3 = (class16) this.field8979;
            this.method3758(0);
            var3.method67(105);
            this.field3398.BackBufferHeight = 0;
            this.field3398.BackBufferWidth = 0;
            if (method1612(this.field3398, (byte) 73, this.field3399, this.field3396, this.field3404, this.field9136)) {
                int var4 = this.field3402.Reset(this.field3398);
                if (class771.method4195(false, var4)) {
                    var3.method68(this.field3402.method4181(), 94, this.field3402.method4177(0));
                    this.method3751(-10455);
                    this.method1156((byte) -10);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "(B)V")
    public final void method1164(byte arg0) {
        this.field3402.method4173(27, this.field9156);
        if (arg0 != -127) {
            this.method1185((byte) -77);
        }
    }

    @OriginalMember(owner = "client!cka", name = "r", descriptor = "()Z")
    public final boolean method926() {
        return false;
    }

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "(Z)V")
    public final void method1192(boolean arg0) {
        this.field3402.SetRenderState(60, this.field9212);
        if (arg0) {
            this.field3384 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lmja;I)V")
    public final void method1610(class671 arg0, int arg1) {
        this.method1614((byte) -82, arg0);
        if (arg1 <= 63) {
            this.method1172(-94);
        }
        if (this.field3383[this.field9129] != arg0.field8702) {
            this.field3402.SetSamplerState(this.field9129, 1, arg0.field8702 ? 1 : 3);
            this.field3383[this.field9129] = arg0.field8702;
        }
        if (this.field3407[this.field9129] != arg0.field8700) {
            this.field3402.SetSamplerState(this.field9129, 2, arg0.field8700 ? 1 : 3);
            this.field3407[this.field9129] = arg0.field8700;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljf;B)I")
    private static final int method1611(class667 arg0, byte arg1) {
        if (class174.field2285 == arg0) {
            return 2;
        } else if (class137.field1820 == arg0) {
            return 4;
        } else if (class361.field4395 == arg0) {
            return 26;
        } else if (class177.field2325 == arg0) {
            return 7;
        } else if (class224.field3039 == arg0) {
            return 10;
        } else if (arg1 == -108) {
            throw new IllegalArgumentException();
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!cka", name = "y", descriptor = "(I)V")
    public final void method1204(int arg0) {
        this.field3394.SetDirection(-this.field9203[0], -this.field9203[1], -this.field9203[2]);
        this.field3384.SetDirection(-this.field9175[0], -this.field9175[1], -this.field9175[2]);
        if (arg0 == 5) {
            this.field3393 = false;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I[Lls;)Lco;")
    public final class753 method1175(int arg0, class592[] arg1) {
        int var3 = -56 % ((arg0 + 52) / 47);
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;BIILjagdx/IDirect3D;I)Z")
    private static final boolean method1612(D3DPRESENT_PARAMETERS arg0, byte arg1, int arg2, int arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            int var10 = 68 % ((arg1 + 40) / 61);
            if (class771.method4196((byte) -69, arg4.method4192(arg2, var9))) {
                return false;
            }
            label81: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var11 = 0; var11 < field3408.length; var11++) {
                        if (arg4.CheckDeviceType(arg2, arg3, var9.Format, field3408[var11], true) == 0 && arg4.CheckDeviceFormat(arg2, arg3, var9.Format, 1, 1, field3408[var11]) == 0 && (arg5 == 0 || arg4.CheckDeviceMultiSampleType(arg2, arg3, field3408[var11], true, var8) == 0)) {
                            for (int var12 = 0; var12 < field3401.length; var12++) {
                                if (arg4.CheckDeviceFormat(arg2, arg3, var9.Format, 2, 1, field3401[var12]) == 0 && arg4.CheckDepthStencilMatch(arg2, arg3, var9.Format, field3408[var11], field3401[var12]) == 0 && (arg5 == 0 || arg4.CheckDeviceMultiSampleType(arg2, arg3, field3401[var11], true, var8) == 0)) {
                                    var6 = field3401[var12];
                                    var7 = field3408[var11];
                                    break label81;
                                }
                            }
                        }
                    }
                }
                arg5--;
            }
            if (arg5 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg0.MultiSampleType = var8;
            arg0.MultiSampleQuality = 0;
            arg0.AutoDepthStencilFormat = var6;
            arg0.BackBufferFormat = var7;
            return true;
        } catch (Throwable var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "(Z)V")
    public final void method1160(boolean arg0) {
        if (this.field3390[this.field9129]) {
            this.field3390[this.field9129] = false;
            this.field3402.SetTexture(this.field9129, null);
            this.method1181(1);
            this.method1177(-115);
        }
        if (!arg0) {
            this.field3406 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "(B)V")
    public final void method1159(byte arg0) {
        if (this.field9105) {
            field3385[5] = 1.0F;
            field3385[1] = 0.0F;
            field3385[6] = 0.0F;
            field3385[14] = 0.0F;
            field3385[8] = 0.0F;
            field3385[7] = 0.0F;
            field3385[0] = 1.0F;
            field3385[4] = 0.0F;
            field3385[10] = 1.0F;
            field3385[13] = 0.0F;
            field3385[11] = 0.0F;
            field3385[15] = 1.0F;
            field3385[2] = 0.0F;
            field3385[9] = 0.0F;
            field3385[3] = 0.0F;
            field3385[12] = 0.0F;
        } else {
            this.field9108.method3152(true, field3385);
        }
        int var2 = 81 % ((arg0 - 7) / 32);
        this.field3402.SetTransform(256, field3385);
    }

    @OriginalMember(owner = "client!cka", name = "o", descriptor = "(I)V")
    public final void method1168(int arg0) {
        this.field3402.method4173(14, this.field9180 && this.field9172);
        if (arg0 != 28914) {
            this.method1149(-74);
        }
    }

    @OriginalMember(owner = "client!cka", name = "I", descriptor = "()I")
    public final int method950() {
        return 0;
    }

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "(ZI)V")
    public final void method1157(boolean arg0, int arg1) {
        if (arg0) {
            this.field3402.SetTextureStageState(this.field9129, 11, arg1);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lhu;ZII)V")
    public final void method1191(class238 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method1155(-71);
        }
        this.field3402.DrawPrimitive(method1615(arg0, (byte) -97), arg2, arg3);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([[IIZI)Llha;")
    public final class445 method1182(int[][] arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 != -21313) {
            method1612(null, (byte) -4, 119, -42, null, -101);
        }
        return new class487(this, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lco;I)V")
    public final void method1150(class753 arg0, int arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field3402.SetVertexDeclaration(var3.field8034);
        if (arg1 != 0) {
            this.method1184((byte) 32, -25);
        }
    }

    @OriginalMember(owner = "client!cka", name = "s", descriptor = "(I)V")
    public final void method1176(int arg0) {
        this.field3402.SetViewport(this.field9217, this.field9146, this.field9097, this.field8998, 0.0F, 1.0F);
        if (arg0 != 14) {
            this.field3381 = false;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;B)V")
    public final void method1613(IDirect3DPixelShader arg0, byte arg1) {
        this.field3402.SetPixelShader(arg0);
        if (arg1 != 37) {
            this.method1609(-113);
        }
    }

    @OriginalMember(owner = "client!cka", name = "na", descriptor = "(IIII)[I")
    public final int[] method968(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3402.method4186(0);
        IDirect3DSurface var7 = this.field3402.method4171(arg2, arg3, 21, 0, 0, true);
        if (class771.method4195(false, this.field3402.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class771.method4195(false, var7.LockRect(0, 0, arg2, arg3, 16, this.field3387))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3387.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field3387.method4168(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3387.method4168(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2546(true);
        var7.method2546(true);
        return var5;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(BLae;)V")
    public final void method1614(byte arg0, class371 arg1) {
        this.field3402.SetTexture(this.field9129, arg1.method2125((byte) -106));
        if (arg0 >= -71) {
            this.field3396 = -13;
        }
        if (this.field3391[this.field9129] != arg1.field4539) {
            int var3 = method1621(arg1.field4539, (byte) -128);
            this.field3402.SetSamplerState(this.field9129, 6, var3);
            this.field3402.SetSamplerState(this.field9129, 5, var3);
            this.field3391[this.field9129] = arg1.field4539;
            if (arg1.field4542 != this.field3403[this.field9129]) {
                this.field3402.SetSamplerState(this.field9129, 7, arg1.field4542 ? method1621(arg1.field4539, (byte) -99) : 0);
                this.field3403[this.field9129] = arg1.field4542;
            }
        } else if (arg1.field4542 != this.field3403[this.field9129]) {
            this.field3402.SetSamplerState(this.field9129, 7, arg1.field4542 ? method1621(arg1.field4539, (byte) -97) : 0);
            this.field3403[this.field9129] = arg1.field4542;
        }
        if (!this.field3390[this.field9129]) {
            this.field3390[this.field9129] = true;
            this.method1181(1);
            this.method1177(-44);
        }
    }

    @OriginalMember(owner = "client!cka", name = "W", descriptor = "(I)V")
    public final void method1177(int arg0) {
        int var2 = this.field3390[this.field9129] ? method1611(this.field9151[this.field9129], (byte) -108) : 1;
        if (arg0 >= -33) {
            this.method970();
        }
        this.field3402.SetTextureStageState(this.field9129, 1, var2);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;")
    public final class589 method920(class589 arg0, class589 arg1, float arg2, class589 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "()Lfga;")
    public final class291 method927() {
        D3DADAPTER_IDENTIFIER var1 = this.field3404.method4193(this.field3399, 0);
        return new class291(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(BZ)Lcq;")
    public final class233 method1162(byte arg0, boolean arg1) {
        if (arg0 != 31) {
            this.field3395 = -104;
        }
        return new class46(this, arg1);
    }

    @OriginalMember(owner = "client!cka", name = "m", descriptor = "(I)V")
    public final void method1172(int arg0) {
        if (this.field9211.method4272((byte) 108)) {
            this.field9114.method3152(true, field3385);
        } else {
            field3385[8] = 0.0F;
            field3385[13] = 0.0F;
            field3385[0] = 1.0F;
            field3385[4] = 0.0F;
            field3385[6] = 0.0F;
            field3385[3] = 0.0F;
            field3385[7] = 0.0F;
            field3385[15] = 1.0F;
            field3385[14] = 0.0F;
            field3385[1] = 0.0F;
            field3385[5] = 1.0F;
            field3385[10] = 1.0F;
            field3385[11] = 0.0F;
            field3385[12] = 0.0F;
            field3385[2] = 0.0F;
            field3385[9] = 0.0F;
        }
        if (arg0 != 0) {
            this.method968(87, 90, -33, -32);
        }
        this.field3402.SetTransform(2, field3385);
    }

    @OriginalMember(owner = "client!cka", name = "S", descriptor = "(I)V")
    public final void method1202(int arg0) {
        if (arg0 != 7) {
            this.field3398 = null;
        }
        this.field3402.method4173(28, this.field9130 && this.field9178 && this.field9183 >= 0);
    }

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "(ZI)V")
    public final void method1154(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method894(101, -111, -24, -19, -0.44549688511201535D);
        }
        this.field3402.method4173(161, arg0);
    }

    @OriginalMember(owner = "client!cka", name = "V", descriptor = "(I)V")
    public final void method1196(int arg0) {
        if (class272.field3571 == this.field9208) {
            this.field3402.SetRenderState(19, 5);
            this.field3402.SetRenderState(20, 6);
        } else if (class9.field79 == this.field9208) {
            this.field3402.SetRenderState(19, 2);
            this.field3402.SetRenderState(20, 2);
        } else if (class303.field3824 == this.field9208) {
            this.field3402.SetRenderState(19, 9);
            this.field3402.SetRenderState(20, 2);
        }
        if (arg0 != 2) {
            this.method1196(67);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(FFF)V")
    public final void method898(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "(I)V")
    public final synchronized void method963(int arg0) {
        this.field3405.method2544(9592);
        super.method963(arg0);
    }

    @OriginalMember(owner = "client!cka", name = "t", descriptor = "(I)V")
    public final void method1180(int arg0) {
        int var2 = -28 / ((arg0 - 51) / 41);
        this.field3402.method4173(15, this.field9205);
    }

    @OriginalMember(owner = "client!cka", name = "GA", descriptor = "(I)V")
    public final void method907(int arg0) {
        this.field3402.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZIIB[III)Lw;")
    public final class471 method1207(boolean arg0, int arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6) {
        if (arg3 != -19) {
            this.field3407 = null;
        }
        return new class671(this, arg2, arg5, arg0, arg4, arg1, arg6);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Liea;I)V")
    public final void method1158(class12 arg0, int arg1) {
        if (arg1 <= 56) {
            return;
        }
        int var3 = 0;
        if (class469.field6108 == arg0) {
            var3 = 65536;
        } else if (class579.field7334 == arg0) {
            var3 = 131072;
        } else if (class438.field5747 == arg0) {
            var3 = 196608;
        }
        this.field3402.SetTextureStageState(this.field9129, 11, var3 | this.field9129);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lod;Lic;)Lmd;")
    public final class649 method878(class539 arg0, class537 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lhu;B)I")
    private static final int method1615(class238 arg0, byte arg1) {
        int var2 = 115 % ((arg1 - 62) / 49);
        if (class525.field6674 == arg0) {
            return 2;
        } else if (class498.field6379 == arg0) {
            return 3;
        } else if (class448.field5847 == arg0) {
            return 1;
        } else if (class279.field3624 == arg0) {
            return 4;
        } else if (class467.field6043 == arg0) {
            return 6;
        } else if (class321.field3980 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lov;B)V")
    public final void method1616(class697 arg0, byte arg1) {
        this.method1614((byte) -120, arg0);
        if (!this.field3383[this.field9129]) {
            this.field3402.SetSamplerState(this.field9129, 1, 1);
            this.field3383[this.field9129] = true;
        }
        if (arg1 != -17) {
            this.method970();
        }
        if (!this.field3407[this.field9129]) {
            this.field3402.SetSamplerState(this.field9129, 2, 1);
            this.field3407[this.field9129] = true;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILds;IILtn;)Lw;")
    public final class471 method1203(int arg0, class73 arg1, int arg2, int arg3, class749 arg4) {
        return arg2 == 1 ? new class671(this, arg4, arg1, arg0, arg3) : (class471) null;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method931(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class15 {
        this.method925(arg2, arg3);
    }

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "(B)V")
    public final void method1165(byte arg0) {
        this.method1206((byte) 110);
        int var2 = -19 / ((21 - arg0) / 59);
        this.method1186((byte) -81);
    }

    @OriginalMember(owner = "client!cka", name = "F", descriptor = "(I)V")
    public final void method1153(int arg0) {
        this.field3402.SetScissorRect(this.field9217 + this.field9144, this.field9177 + this.field9146, this.field9184, this.field9123);
        if (arg0 > -94) {
            this.field3389 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "(II)Lod;")
    public final class539 method1001(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!cka", name = "T", descriptor = "(I)F")
    public final float method1169(int arg0) {
        return arg0 <= 115 ? -0.17210132F : -0.5F;
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/iw;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lsq;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lwm;I)V")
    private class248(int arg0, int arg1, Canvas arg2, class441 arg3, IDirect3D arg4, IDirect3DDevice arg5, class16 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class284 arg9, class30 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field3396 = arg1;
            this.field3398 = arg7;
            this.field3399 = arg0;
            this.field3406 = arg6;
            this.field3400 = arg8;
            this.field3404 = arg4;
            this.field3405 = arg3;
            this.field3402 = arg5;
            this.field3394 = new class770(this.field3405);
            this.field3384 = new class770(this.field3405);
            this.field3389 = new class770(this.field3405);
            this.field3387 = new PixelBuffer(this.field3405);
            this.field3382 = new GeometryBuffer(this.field3405);
            new GeometryBuffer(this.field3405);
            this.field9132 = this.field3400.MaxActiveLights > 0 ? this.field3400.MaxActiveLights : 8;
            this.field9204 = (this.field3400.TextureCaps & 0x2000) != 0;
            this.field3388 = (this.field3400.TextureCaps & 0x4000) != 0;
            this.field9125 = (this.field3400.TextureCaps & 0x800) != 0;
            this.field9167 = this.field3400.MaxSimultaneousTextures;
            this.field3381 = (this.field3400.TextureCaps & 0x2) == 0;
            this.field3386 = (this.field3400.TextureCaps & 0x10000) != 0;
            this.field9207 = this.field9136 > 0 || this.field3404.CheckDeviceMultiSampleType(this.field3399, this.field3396, this.field3398.BackBufferFormat, true, 2) == 0;
            this.field3407 = new boolean[this.field9167];
            this.field3391 = new class525[this.field9167];
            this.field3397 = new int[this.field9167];
            this.field3403 = new boolean[this.field9167];
            this.field3383 = new boolean[this.field9167];
            this.field3390 = new boolean[this.field9167];
            this.field3402.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method3072(5);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "(B)V")
    public final void method1186(byte arg0) {
        if (arg0 >= -1) {
            this.field3389 = null;
        }
        if (this.field3393) {
            return;
        }
        this.field3402.LightEnable(0, false);
        this.field3402.LightEnable(1, false);
        this.field3402.SetLight(0, this.field3394);
        this.field3402.SetLight(1, this.field3384);
        this.field3402.LightEnable(0, true);
        this.field3402.LightEnable(1, true);
        this.field3393 = true;
    }

    @OriginalMember(owner = "client!cka", name = "D", descriptor = "(I)V")
    public final void method1163(int arg0) {
        if (arg0 != 14) {
            this.method1184((byte) 39, 54);
        }
        this.field3402.method4173(174, this.field9240);
    }

    @OriginalMember(owner = "client!cka", name = "n", descriptor = "()V")
    public final void method970() {
    }

    @OriginalMember(owner = "client!cka", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lwm;Ljava/lang/Integer;)Lha;")
    public static final class570 createToolkit(Canvas arg0, class284 arg1, class30 arg2, Integer arg3) {
        class248 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class441 var7 = new class441();
            IDirect3D var8 = IDirect3D.method4189(-2147483616, var7);
            D3DCAPS var9 = var8.method4191(var5, var6);
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
                if (!method1612(var10, (byte) -127, var5, var6, var8, arg3)) {
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
                    var13 = var8.method4190(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class769 var17) {
                    var13 = var8.method4190(var5, var6, arg0, var11 | 0x20, var10);
                }
                class16 var15 = new class16(var13.method4177(0), var13.method4181());
                var4 = new class248(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3714((byte) 100);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method919();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "()V")
    public final void method919() {
        this.field3405.method2543(-95);
        super.method919();
    }

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "(B)V")
    public final void method1156(byte arg0) {
        for (int var2 = 0; var2 < this.field9167; var2++) {
            this.field3402.SetSamplerState(var2, 7, 0);
            this.field3402.SetSamplerState(var2, 6, 2);
            this.field3402.SetSamplerState(var2, 5, 2);
            this.field3402.SetSamplerState(var2, 1, 1);
            this.field3402.SetSamplerState(var2, 2, 1);
            this.field3391[var2] = class212.field2911;
            this.field3383[var2] = this.field3407[var2] = true;
            this.field3403[var2] = false;
            this.field3397[var2] = 0;
        }
        this.field3402.SetTextureStageState(0, 6, 1);
        this.field3402.SetRenderState(9, 2);
        this.field3402.SetRenderState(23, 4);
        this.field3402.SetRenderState(25, 5);
        this.field3402.SetRenderState(24, 0);
        this.field3402.SetRenderState(22, 2);
        this.field3402.SetRenderState(147, 1);
        this.field3402.SetRenderState(145, 1);
        this.field3402.method4175(38, 0.95F);
        this.field3402.SetRenderState(140, 3);
        this.field3394.SetType(3);
        this.field3384.SetType(3);
        this.field3389.SetType(1);
        this.field3393 = false;
        super.method1156(arg0);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IILtn;I[BI)Lii;")
    public final class546 method1201(int arg0, int arg1, class749 arg2, int arg3, byte[] arg4, int arg5) {
        if (arg0 != 0) {
            this.method1172(101);
        }
        return new class697(this, arg2, arg1, arg5, arg3, arg4);
    }

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "(B)V")
    public final void method1185(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field9121; var2++) {
            class757 var3 = this.field9215[var2];
            int var4 = var2 + 2;
            int var5 = var3.method4124(false);
            float var6 = var3.method4120(arg0 - 152) / 255.0F;
            this.field3389.SetPosition((float) var3.method4121((byte) -124), (float) var3.method4117(true), (float) var3.method4123(22290));
            this.field3389.SetDiffuse((float) ((var5 & 0xFF6B98) >> 16) * var6, (float) ((var5 & 0xFF09) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3389.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method4122(105) * var3.method4122(-123)));
            this.field3389.SetRange((float) var3.method4122(-122));
            this.field3402.SetLight(var4, this.field3389);
            this.field3402.LightEnable(var4, true);
        }
        while (var2 < this.field9209) {
            this.field3402.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1185(arg0);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZLcja;I)V")
    public final void method1161(int arg0, boolean arg1, class83 arg2, int arg3) {
        int var5 = arg3;
        byte var7;
        if (arg0 == 1) {
            var7 = 6;
        } else if (arg0 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1) {
            var5 = arg3 | 0x10;
        }
        this.field3402.SetTextureStageState(this.field9129, var7, var5 | method1617(arg2, 28263));
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lcja;I)I")
    private static final int method1617(class83 arg0, int arg1) {
        if (class171.field2262 == arg0) {
            return 2;
        } else if (class436.field5734 == arg0) {
            return 0;
        } else if (class13.field134 == arg0) {
            return 1;
        } else if (class324.field4001 == arg0) {
            return 3;
        } else {
            if (arg1 != 28263) {
                method1621(null, (byte) -114);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIILhu;ZLjj;I)V")
    public final void method1151(int arg0, int arg1, int arg2, class238 arg3, boolean arg4, class688 arg5, int arg6) {
        this.field3402.SetIndices(((class665) arg5).field8664);
        this.field3402.DrawIndexedPrimitive(method1615(arg3, (byte) 121), 0, arg2, arg1, arg0, arg6);
        if (arg4) {
            this.field3403 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method1183(boolean arg0, Canvas arg1) {
        return arg0 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lkka;B)I")
    private static final int method1618(class542 arg0, byte arg1) {
        if (arg1 != -36) {
            return -55;
        } else if (class29.field257 == arg0) {
            return 1;
        } else if (class627.field7959 == arg0) {
            return 2;
        } else if (class514.field6557 == arg0) {
            return 3;
        } else if (class143.field1861 == arg0) {
            return 4;
        } else if (class472.field6150 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILjagdx/IDirect3DVertexShader;)V")
    public final void method1619(int arg0, IDirect3DVertexShader arg1) {
        if (arg0 == 0) {
            this.field3392 = arg1;
            this.field3402.SetVertexShader(arg1);
            this.method1194(2);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([BILtn;ZIIIB)Lw;")
    public final class471 method1170(byte[] arg0, int arg1, class749 arg2, boolean arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 >= -28) {
            this.field3400 = null;
        }
        return new class671(this, arg2, arg6, arg4, arg3, arg0, arg5, arg1);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILds;Ltn;)I")
    public static final int method1620(int arg0, class73 arg1, class749 arg2) {
        if (class73.field990 == arg1) {
            if (class276.field3599 == arg2) {
                return 22;
            }
            if (class417.field5505 == arg2) {
                return 21;
            }
            if (class483.field6239 == arg2) {
                return 28;
            }
            if (class104.field1407 == arg2) {
                return 50;
            }
            if (class470.field6127 == arg2) {
                return 51;
            }
            if (class238.field3237 == arg2) {
                return 77;
            }
        }
        if (arg0 < -80) {
            throw new IllegalArgumentException("");
        }
        return -36;
    }

    @OriginalMember(owner = "client!cka", name = "ya", descriptor = "()V")
    public final void method937() {
        this.method3766((byte) -25, true);
        this.field3402.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!cka", name = "p", descriptor = "(I)V")
    public final void method1155(int arg0) {
        if (arg0 != -30551) {
            this.method1613(null, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "(II)Lic;")
    public final class537 method938(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!cka", name = "t", descriptor = "()Z")
    public final boolean method899() {
        return false;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method1195(int arg0, Object arg1, Canvas arg2) {
        if (this.field8919 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field3402.EndScene();
                this.method1609(-105);
                this.field3402.BeginScene();
            }
        }
        if (arg0 != 15797) {
            this.field3388 = true;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(BI)Ltu;")
    public final class499 method1184(byte arg0, int arg1) {
        if (arg0 != 100) {
            return (class499) null;
        } else if (arg1 == 3) {
            return new class630(this, this.field8980);
        } else if (arg1 == 4) {
            return new class694(this, this.field8980, this.field8918);
        } else if (arg1 == 8) {
            return new class35(this, this.field8980, this.field8918);
        } else {
            return super.method1184((byte) 100, arg1);
        }
    }

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "(I)V")
    public final void method1152(int arg0) {
        this.field3394.SetAmbient(this.field9179 * this.field9143, this.field9188 * this.field9143, this.field9213 * this.field9143, (float) arg0);
        this.field3393 = false;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZI[FIILtn;I)Lw;")
    public final class471 method1190(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, class749 arg6, int arg7) {
        return arg7 == 0 ? null : (class471) null;
    }

    @OriginalMember(owner = "client!cka", name = "o", descriptor = "()V")
    public final void method943() {
        IDirect3DEventQuery var1 = this.field3402.method4180();
        if (class771.method4195(false, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2546(true);
    }

    @OriginalMember(owner = "client!cka", name = "u", descriptor = "()V")
    public final void method999() {
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(IIIID)V")
    public final void method894(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!cka", name = "q", descriptor = "(B)V")
    public final void method1171(byte arg0) {
        this.field3402.method4173(7, this.field9174);
        int var2 = -1 % ((-arg0 - 75) / 48);
    }

    @OriginalMember(owner = "client!cka", name = "y", descriptor = "()V")
    public final void method962() {
    }

    @OriginalMember(owner = "client!cka", name = "F", descriptor = "(II)V")
    public final void method988(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZI)Ljj;")
    public final class688 method1179(boolean arg0, int arg1) {
        return arg1 <= 78 ? (class688) null : new class665(this, class73.field991, arg0);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public final void method1189(Object arg0, Canvas arg1, byte arg2) {
        this.field3406 = (class16) arg0;
        if (arg2 != -37) {
            this.method1154(true, -84);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lqt;B)I")
    private static final int method1621(class525 arg0, byte arg1) {
        if (class212.field2911 == arg0) {
            return 2;
        } else if (class166.field2196 == arg0) {
            return 1;
        } else {
            int var2 = -40 % ((arg1 + 28) / 55);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cka", name = "w", descriptor = "(I)V")
    public final void method1194(int arg0) {
        if (this.field3392 == null && this.field9133[this.field9129] != class558.field7097) {
            if (this.field9133[this.field9129] == class627.field7959) {
                this.field3402.SetTransform(this.field9129 + 16, this.field9119[this.field9129].method3155(field3385, 76));
            } else {
                this.field3402.SetTransform(this.field9129 + 16, this.field9119[this.field9129].method3152(true, field3385));
            }
            int var2 = method1618(this.field9133[this.field9129], (byte) -36);
            if (this.field3397[this.field9129] != var2) {
                this.field3402.SetTextureStageState(this.field9129, 24, var2);
                this.field3397[this.field9129] = var2;
            }
        } else {
            this.field3402.SetTextureStageState(this.field9129, 24, 0);
            this.field3397[this.field9129] = 0;
        }
        if (arg0 != 2) {
            this.method1179(false, 91);
        }
    }

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "()V")
    public final void method891() {
    }

    @OriginalMember(owner = "client!cka", name = "fb", descriptor = "(I)V")
    public final void method1149(int arg0) {
        if (arg0 != 0) {
            this.field3383 = null;
        }
        this.field3402.SetTransform(3, this.field9137);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IILcja;ZZ)V")
    public final void method1205(int arg0, int arg1, class83 arg2, boolean arg3, boolean arg4) {
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
        if (arg1 <= 29) {
            field3385 = null;
        }
        if (arg4) {
            var8 |= 0x10;
        }
        this.field3402.SetTextureStageState(this.field9129, var7, method1617(arg2, 28263) | var8);
    }

    @OriginalMember(owner = "client!cka", name = "n", descriptor = "(B)V")
    public final void method1206(byte arg0) {
        float var2 = this.field9152 ? this.field9154 : 0.0F;
        float var3 = this.field9152 ? -this.field9173 : 0.0F;
        this.field3394.SetDiffuse(this.field9179 * var2, this.field9188 * var2, this.field9213 * var2, 0.0F);
        this.field3384.SetDiffuse(this.field9179 * var3, this.field9188 * var3, this.field9213 * var3, 0.0F);
        if (arg0 > 102) {
            this.field3393 = false;
        }
    }
}
