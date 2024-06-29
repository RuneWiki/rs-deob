import jaclib.peer.class674;
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
import jagdx.class484;
import jagdx.class485;
import jagdx.class486;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class558 extends class373 {

    @OriginalMember(owner = "client!fi", name = "ah", descriptor = "I")
    private int field7965 = 0;

    @OriginalMember(owner = "client!fi", name = "hh", descriptor = "Z")
    private boolean field7972 = false;

    @OriginalMember(owner = "client!fi", name = "fh", descriptor = "I")
    private int field7970;

    @OriginalMember(owner = "client!fi", name = "Qg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field7955;

    @OriginalMember(owner = "client!fi", name = "Yg", descriptor = "Ljaclib/peer/qr;")
    public class674 field7963;

    @OriginalMember(owner = "client!fi", name = "Ug", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field7959;

    @OriginalMember(owner = "client!fi", name = "ch", descriptor = "I")
    private int field7967;

    @OriginalMember(owner = "client!fi", name = "dh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field7968;

    @OriginalMember(owner = "client!fi", name = "Tg", descriptor = "Lqs;")
    private class605 field7958;

    @OriginalMember(owner = "client!fi", name = "Pg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field7954;

    @OriginalMember(owner = "client!fi", name = "jh", descriptor = "Ljagdx/D3DLIGHT;")
    private class486 field7974;

    @OriginalMember(owner = "client!fi", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class486 field7956;

    @OriginalMember(owner = "client!fi", name = "eh", descriptor = "Ljagdx/D3DLIGHT;")
    private class486 field7969;

    @OriginalMember(owner = "client!fi", name = "oh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field7979;

    @OriginalMember(owner = "client!fi", name = "nh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field7978;

    @OriginalMember(owner = "client!fi", name = "Xg", descriptor = "Z")
    public boolean field7962;

    @OriginalMember(owner = "client!fi", name = "Sg", descriptor = "Z")
    public boolean field7957;

    @OriginalMember(owner = "client!fi", name = "mh", descriptor = "Z")
    public boolean field7977;

    @OriginalMember(owner = "client!fi", name = "Wg", descriptor = "[Z")
    private boolean[] field7961;

    @OriginalMember(owner = "client!fi", name = "bh", descriptor = "[Z")
    private boolean[] field7966;

    @OriginalMember(owner = "client!fi", name = "gh", descriptor = "[Z")
    private boolean[] field7971;

    @OriginalMember(owner = "client!fi", name = "Vg", descriptor = "[I")
    private int[] field7960;

    @OriginalMember(owner = "client!fi", name = "ih", descriptor = "[Z")
    private boolean[] field7973;

    @OriginalMember(owner = "client!fi", name = "kh", descriptor = "[Lej;")
    private class123[] field7975;

    @OriginalMember(owner = "client!fi", name = "Og", descriptor = "[I")
    private static int[] field7953 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!fi", name = "Ng", descriptor = "[I")
    private static int[] field7952 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!fi", name = "lh", descriptor = "[F")
    private static float[] field7976 = new float[16];

    @OriginalMember(owner = "client!fi", name = "Zg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7964;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZII[III)Lch;", line = 4)
    public final class465 method2417(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        return arg6 == 11 ? new class207(this, arg3, arg2, arg1, arg4, arg5, arg0) : (class465) null;
    }

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "(I)V", line = 16)
    public final void method2412(int arg0) {
        for (int var2 = 0; var2 < this.field5635; var2++) {
            this.field7959.SetSamplerState(var2, 7, 0);
            this.field7959.SetSamplerState(var2, 6, 2);
            this.field7959.SetSamplerState(var2, 5, 2);
            this.field7959.SetSamplerState(var2, 1, 1);
            this.field7959.SetSamplerState(var2, 2, 1);
            this.field7975[var2] = class395.field5936;
            this.field7961[var2] = this.field7971[var2] = true;
            this.field7973[var2] = false;
            this.field7960[var2] = 0;
        }
        this.field7959.SetTextureStageState(arg0, 6, 1);
        this.field7959.SetRenderState(9, 2);
        this.field7959.SetRenderState(23, 4);
        this.field7959.SetRenderState(25, 5);
        this.field7959.SetRenderState(24, 0);
        this.field7959.SetRenderState(22, 2);
        this.field7959.SetRenderState(147, 1);
        this.field7959.SetRenderState(145, 1);
        this.field7959.method2910(38, 0.95F);
        this.field7959.SetRenderState(140, 3);
        this.field7974.SetType(3);
        this.field7956.SetType(3);
        this.field7969.SetType(1);
        this.field7972 = false;
        super.method2412(0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z[FIILpd;III)Lch;", line = 54)
    public final class465 method2352(boolean arg0, float[] arg1, int arg2, int arg3, class259 arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 2) {
            field7976 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lsr;B)V", line = 65)
    public final void method2368(class254 arg0, byte arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field7959.SetVertexDeclaration(var3.field4616);
        if (arg1 < 47) {
            this.method2352(false, null, 62, 104, null, -26, -117, 24);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLll;)V", line = 78)
    public final void method2389(int arg0, byte arg1, class366 arg2) {
        class628 var4 = (class628) arg2;
        this.field7959.SetStreamSource(arg0, var4.field8786, 0, var4.method3628((byte) 9));
        if (arg1 != -64) {
            this.method3258(null, 73);
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V", line = 89)
    public final synchronized void method487(int arg0) {
        this.field7963.method3876(-17898);
        super.method487(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "(I)V", line = 101)
    public final void method2390(int arg0) {
        if (arg0 > -56) {
            this.field7979 = null;
        }
        this.field7959.method2908(15, this.field5595);
    }

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "()V", line = 111)
    public final void method498() {
        this.field7963.method3878(28501);
        super.method498();
    }

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "(I)V", line = 119)
    public final void method2351(int arg0) {
        if (class77.field1069 == this.field5593) {
            this.field7959.SetRenderState(19, 5);
            this.field7959.SetRenderState(20, 6);
        } else if (class224.field3303 == this.field5593) {
            this.field7959.SetRenderState(19, 2);
            this.field7959.SetRenderState(20, 2);
        } else if (class547.field7807 == this.field5593) {
            this.field7959.SetRenderState(19, 9);
            this.field7959.SetRenderState(20, 2);
        }
        if (arg0 != 0) {
            this.field7959 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 148)
    public final void method2292(int arg0) {
        if (this.field5539) {
            field7976[0] = 1.0F;
            field7976[5] = 1.0F;
            field7976[1] = 0.0F;
            field7976[15] = 1.0F;
            field7976[12] = 0.0F;
            field7976[13] = 0.0F;
            field7976[10] = 1.0F;
            field7976[9] = 0.0F;
            field7976[8] = 0.0F;
            field7976[6] = 0.0F;
            field7976[14] = 0.0F;
            field7976[3] = 0.0F;
            field7976[4] = 0.0F;
            field7976[7] = 0.0F;
            field7976[2] = 0.0F;
            field7976[11] = 0.0F;
        } else {
            this.field5536.method2729(field7976, true);
        }
        this.field7959.SetTransform(256, field7976);
        if (arg0 != 0) {
            this.method535();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V", line = 184)
    public final void method427() {
    }

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "(I)V", line = 187)
    public final void method2315(int arg0) {
        this.field7959.SetScissorRect(this.field5642 + this.field5621, this.field5613 + this.field5580, this.field5630, this.field5614);
        if (arg0 != 0) {
            this.method432();
        }
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "(I)V", line = 197)
    public final void method2301(int arg0) {
        this.method2420(10295);
        if (arg0 <= 33) {
            this.method2368(null, (byte) 4);
        }
        this.method2341(-127);
    }

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "(I)V", line = 209)
    public final void method2341(int arg0) {
        if (!this.field7972) {
            this.field7959.LightEnable(0, false);
            this.field7959.LightEnable(1, false);
            this.field7959.SetLight(0, this.field7974);
            this.field7959.SetLight(1, this.field7956);
            this.field7959.LightEnable(0, true);
            this.field7959.LightEnable(1, true);
            this.field7972 = true;
        }
        int var2 = -49 % ((-arg0 - 87) / 39);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llf;B)I", line = 228)
    private static final int method3252(class238 arg0, byte arg1) {
        if (arg1 != 18) {
            return -8;
        } else if (class331.field4759 == arg0) {
            return 2;
        } else if (class10.field152 == arg0) {
            return 0;
        } else if (class328.field4670 == arg0) {
            return 1;
        } else if (class469.field6850 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(II)Lnia;", line = 253)
    public final class648 method2359(int arg0, int arg1) {
        if (arg1 != 9827) {
            this.method3253(4);
        }
        if (arg0 == 3) {
            return new class544(this, this.field5386);
        } else if (arg0 == 4) {
            return new class436(this, this.field5386, this.field5356);
        } else if (arg0 == 8) {
            return new class416(this, this.field5386, this.field5356);
        } else {
            return super.method2359(arg0, 9827);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lkaa;", line = 299)
    public final class48 method432() {
        D3DADAPTER_IDENTIFIER var1 = this.field7968.method2897(this.field7967, 0);
        return new class48(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "(B)V", line = 308)
    public final void method2381(byte arg0) {
        if (arg0 != 34) {
            this.method2314(null, 26, 93, false, 17, null);
        }
        if (this.field7966[this.field5558]) {
            this.field7966[this.field5558] = false;
            this.field7959.SetTexture(this.field5558, null);
            this.method2397((byte) 86);
            this.method2320(0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "(I)Z", line = 327)
    private final boolean method3253(int arg0) {
        int var2 = this.field7959.TestCooperativeLevel();
        if (arg0 >= -83) {
            return true;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class605 var3 = (class605) this.field5476;
            this.method2309(-20294);
            var3.method3513(0);
            this.field7954.BackBufferWidth = 0;
            this.field7954.BackBufferHeight = 0;
            if (method3257(this.field7968, this.field7954, this.field7970, this.field7967, this.field5648, -128)) {
                int var4 = this.field7959.Reset(this.field7954);
                if (class484.method2892((byte) 114, var4)) {
                    var3.method3514(0, this.field7959.method2906(0), this.field7959.method2903());
                    this.method2363(10);
                    this.method2412(0);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "()V", line = 366)
    public final void method536() {
    }

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "(Z)V", line = 369)
    public final void method2414(boolean arg0) {
        if (arg0) {
            this.field7970 = -77;
        }
        this.field7959.method2908(27, this.field5650);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 379)
    public final void method426(boolean arg0) {
    }

    @OriginalMember(owner = "client!fi", name = "na", descriptor = "(IIII)[I", line = 383)
    public final int[] method428(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field7959.method2909(0);
        IDirect3DSurface var7 = this.field7959.method2916(arg2, arg3, 21, 0, 0, true);
        if (class484.method2892((byte) 72, this.field7959.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class484.method2892((byte) 61, var7.LockRect(0, 0, arg2, arg3, 16, this.field7979))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field7979.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field7979.method2921(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field7979.method2921(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3883((byte) 116);
        var7.method3883((byte) 101);
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIIII[BLpd;I)Lch;", line = 422)
    public final class465 method2310(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class259 arg6, int arg7) {
        return arg4 >= -126 ? (class465) null : new class207(this, arg6, arg1, arg7, arg0, arg5, arg2, arg3);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lej;I)I", line = 432)
    private static final int method3254(class123 arg0, int arg1) {
        if (arg1 <= 7) {
            return -29;
        } else if (class395.field5936 == arg0) {
            return 2;
        } else if (class699.field9640 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "(B)F", line = 452)
    public final float method2376(byte arg0) {
        if (arg0 != -108) {
            this.field7978 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILwl;)I", line = 462)
    private static final int method3255(int arg0, class410 arg1) {
        if (arg0 != 2048) {
            field7976 = null;
        }
        if (class4.field52 == arg1) {
            return 1;
        } else if (class127.field1688 == arg1) {
            return 2;
        } else if (class60.field854 == arg1) {
            return 3;
        } else if (class555.field7933 == arg1) {
            return 4;
        } else if (class51.field743 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lcc;I)V", line = 492)
    public final void method3256(class733 arg0, int arg1) {
        this.method3258(arg0, arg1 + 29503);
        if (!this.field7961[this.field5558]) {
            this.field7959.SetSamplerState(this.field5558, 1, 1);
            this.field7961[this.field5558] = true;
        }
        if (!this.field7971[this.field5558]) {
            this.field7959.SetSamplerState(this.field5558, 2, 1);
            this.field7971[this.field5558] = true;
        }
        if (arg1 != -29497) {
            this.field7972 = false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "(I)V", line = 515)
    public final void method2319(int arg0) {
        if (arg0 != 10) {
            this.field7963 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 526)
    public final void method539(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        this.method462(arg2, arg3);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llf;ZIZZ)V", line = 536)
    public final void method2340(class238 arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        byte var8;
        if (arg2 == 1) {
            var8 = 3;
        } else if (arg2 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (!arg4) {
            this.field7968 = null;
        }
        if (arg1) {
            var6 |= 0x20;
        }
        if (arg3) {
            var6 |= 0x10;
        }
        this.field7959.SetTextureStageState(this.field5558, var8, method3252(arg0, (byte) 18) | var6);
    }

    @OriginalMember(owner = "client!fi", name = "GA", descriptor = "(I)V", line = 584)
    public final void method502(int arg0) {
        this.field7959.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;IIII)Z", line = 593)
    private static final boolean method3257(IDirect3D arg0, D3DPRESENT_PARAMETERS arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class484.method2893(arg0.method2894(arg3, var9), 2005530599)) {
                return false;
            }
            int var10 = -2 % ((arg5 + 62) / 61);
            label81: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var11 = 0; var11 < field7953.length; var11++) {
                        if (arg0.CheckDeviceType(arg3, arg2, var9.Format, field7953[var11], true) == 0 && arg0.CheckDeviceFormat(arg3, arg2, var9.Format, 1, 1, field7953[var11]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg2, field7953[var11], true, var8) == 0)) {
                            for (int var12 = 0; var12 < field7952.length; var12++) {
                                if (arg0.CheckDeviceFormat(arg3, arg2, var9.Format, 2, 1, field7952[var12]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg2, var9.Format, field7953[var11], field7952[var12]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg2, field7952[var11], true, var8) == 0)) {
                                    var6 = field7952[var12];
                                    var7 = field7953[var11];
                                    break label81;
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
            arg1.BackBufferFormat = var7;
            arg1.MultiSampleType = var8;
            arg1.MultiSampleQuality = 0;
            arg1.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lhca;I)V", line = 694)
    public final void method3258(class491 arg0, int arg1) {
        this.field7959.SetTexture(this.field5558, arg0.method1401((byte) -35));
        if (this.field7975[this.field5558] != arg0.field7004) {
            int var3 = method3254(arg0.field7004, 63);
            this.field7959.SetSamplerState(this.field5558, 6, var3);
            this.field7959.SetSamplerState(this.field5558, 5, var3);
            this.field7975[this.field5558] = arg0.field7004;
            if (this.field7973[this.field5558] != arg0.field7005) {
                this.field7959.SetSamplerState(this.field5558, 7, arg0.field7005 ? method3254(arg0.field7004, 106) : 0);
                this.field7973[this.field5558] = arg0.field7005;
            }
        } else if (arg0.field7005 != this.field7973[this.field5558]) {
            this.field7959.SetSamplerState(this.field5558, 7, arg0.field7005 ? method3254(arg0.field7004, 68) : 0);
            this.field7973[this.field5558] = arg0.field7005;
        }
        if (arg1 == 6 && !this.field7966[this.field5558]) {
            this.field7966[this.field5558] = true;
            this.method2397((byte) 86);
            this.method2320(arg1 ^ 0x6);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjagdx/IDirect3DPixelShader;)V", line = 734)
    public final void method3259(byte arg0, IDirect3DPixelShader arg1) {
        this.field7959.SetPixelShader(arg1);
        if (arg0 != 80) {
            this.method3259((byte) -55, null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "(B)V", line = 747)
    public final void method2369(byte arg0) {
        if (arg0 != -126) {
            this.field7978 = null;
        }
        this.field7959.method2908(14, this.field5608 && this.field5569);
    }

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "()I", line = 759)
    public final int method461() {
        return 0;
    }

    @OriginalMember(owner = "client!fi", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lvd;Ljava/lang/Integer;)Lha;", line = 767)
    public static final class60 createToolkit(Canvas arg0, class151 arg1, class39 arg2, Integer arg3) {
        class558 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class674 var7 = new class674();
            IDirect3D var8 = IDirect3D.method2896(-2147483616, var7);
            D3DCAPS var9 = var8.method2895(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x10 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & 0x20 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3257(var8, var10, var6, var5, arg3, -124)) {
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
                    var13 = var8.method2898(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class485 var17) {
                    var13 = var8.method2898(var5, var6, arg0, var11 | 0x20, var10);
                }
                class605 var15 = new class605(var13.method2906(0), var13.method2903());
                var4 = new class558(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2330(1);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method498();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V", line = 864)
    public final void method2354(Object arg0, boolean arg1, Canvas arg2) {
        if (!arg1 || this.field5361 != arg2) {
            return;
        }
        Dimension var4 = arg2.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field7959.EndScene();
            this.method3253(-86);
            this.field7959.BeginScene();
        }
    }

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "(B)V", line = 889)
    public final void method2374(byte arg0) {
        this.field7959.method2908(28, this.field5606 && this.field5607 && this.field5620 >= 0);
        if (arg0 <= 29) {
            method3255(-125, null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "()Z", line = 899)
    public final boolean method478() {
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lok;ILpd;ZI)Lch;", line = 906)
    public final class465 method2343(class256 arg0, int arg1, class259 arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field7979 = null;
        }
        return new class207(this, arg2, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 917)
    public final void method2297(byte arg0) {
        if (arg0 >= -5) {
            method3261(null, false);
        }
        int var2;
        for (var2 = 0; var2 < this.field5553; var2++) {
            class609 var3 = this.field5566[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3534(-109);
            float var6 = var3.method3535((byte) -41) / 255.0F;
            this.field7969.SetPosition((float) var3.method3533(false), (float) var3.method3536(24108), (float) var3.method3531(20597));
            this.field7969.SetDiffuse((float) ((var5 & 0xFFEACD) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field7969.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3537(6490) * var3.method3537(6490)));
            this.field7969.SetRange((float) var3.method3537(6490));
            this.field7959.SetLight(var4, this.field7969);
            this.field7959.LightEnable(var4, true);
        }
        while (this.field5601 > var2) {
            this.field7959.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2297((byte) -110);
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(II)V", line = 955)
    public final void method2331(int arg0, int arg1) {
        if (arg1 != 8) {
            this.field7959 = null;
        }
        this.field7959.SetTextureStageState(this.field5558, 11, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "(B)V", line = 966)
    public final void method2365(byte arg0) {
        if (this.field5557.method2165(-7874)) {
            this.field5545.method2729(field7976, true);
        } else {
            field7976[7] = 0.0F;
            field7976[3] = 0.0F;
            field7976[15] = 1.0F;
            field7976[14] = 0.0F;
            field7976[0] = 1.0F;
            field7976[4] = 0.0F;
            field7976[2] = 0.0F;
            field7976[12] = 0.0F;
            field7976[6] = 0.0F;
            field7976[5] = 1.0F;
            field7976[10] = 1.0F;
            field7976[1] = 0.0F;
            field7976[8] = 0.0F;
            field7976[13] = 0.0F;
            field7976[11] = 0.0F;
            field7976[9] = 0.0F;
        }
        this.field7959.SetTransform(2, field7976);
        if (arg0 > -97) {
            this.field7970 = -32;
        }
    }

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "(I)V", line = 1003)
    public final void method2420(int arg0) {
        float var2 = this.field5603 ? this.field5612 : 0.0F;
        float var3 = this.field5603 ? -this.field5644 : 0.0F;
        if (arg0 != 10295) {
            this.field7962 = false;
        }
        this.field7974.SetDiffuse(this.field5602 * var2, this.field5639 * var2, this.field5576 * var2, 0.0F);
        this.field7956.SetDiffuse(this.field5602 * var3, this.field5639 * var3, this.field5576 * var3, 0.0F);
        this.field7972 = false;
    }

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "(I)V", line = 1018)
    public final void method2324(int arg0) {
        if (arg0 > -86) {
            this.method444();
        }
        if (this.field7964 != null || this.field5589[this.field5558] == class110.field1536) {
            this.field7959.SetTextureStageState(this.field5558, 24, 0);
            this.field7960[this.field5558] = 0;
            return;
        }
        if (this.field5589[this.field5558] == class127.field1688) {
            this.field7959.SetTransform(this.field5558 + 16, this.field5636[this.field5558].method2723(-83, field7976));
        } else {
            this.field7959.SetTransform(this.field5558 + 16, this.field5636[this.field5558].method2729(field7976, true));
        }
        int var2 = method3255(2048, this.field5589[this.field5558]);
        if (this.field7960[this.field5558] != var2) {
            this.field7959.SetTextureStageState(this.field5558, 24, var2);
            this.field7960[this.field5558] = var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "(B)V", line = 1051)
    public final void method2397(byte arg0) {
        if (arg0 == 86) {
            int var2 = this.field7966[this.field5558] ? method3262(true, this.field5633[this.field5558]) : 1;
            this.field7959.SetTextureStageState(this.field5558, 4, var2);
        }
    }

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "(I)V", line = 1062)
    public final void method2322(int arg0) {
        this.field5627 = (this.field5596 - this.field5626);
        this.field5638 = this.field5627 - (float) this.field5620;
        if (this.field5638 < (float) this.field5600) {
            this.field5638 = this.field5600;
        }
        this.field7959.method2910(36, this.field5638);
        this.field7959.method2910(37, this.field5627);
        this.field7959.SetRenderState(34, this.field5637);
        if (arg0 != 0) {
            this.field7970 = -32;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llf;IZZ)V", line = 1082)
    public final void method2318(class238 arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
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
        if (arg3) {
            var7 |= 0x10;
        }
        this.field7959.SetTextureStageState(this.field5558, var6, method3252(arg0, (byte) 18) | var7);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Ldk;", line = 1124)
    public final class512 method454(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lom;Lom;FLom;)Lom;", line = 1131)
    public final class374 method499(class374 arg0, class374 arg1, float arg2, class374 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/qr;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lqs;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lvd;I)V", line = 1137)
    private class558(int arg0, int arg1, Canvas arg2, class674 arg3, IDirect3D arg4, IDirect3DDevice arg5, class605 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class151 arg9, class39 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field7970 = arg1;
            this.field7955 = arg8;
            this.field7963 = arg3;
            this.field7959 = arg5;
            this.field7967 = arg0;
            this.field7968 = arg4;
            this.field7958 = arg6;
            this.field7954 = arg7;
            this.field7974 = new class486(this.field7963);
            this.field7956 = new class486(this.field7963);
            this.field7969 = new class486(this.field7963);
            this.field7979 = new PixelBuffer(this.field7963);
            this.field7978 = new GeometryBuffer(this.field7963);
            new GeometryBuffer(this.field7963);
            this.field7962 = (this.field7955.TextureCaps & 0x4000) != 0;
            this.field7957 = (this.field7955.TextureCaps & 0x10000) != 0;
            this.field5605 = (this.field7955.TextureCaps & 0x2000) != 0;
            this.field5635 = this.field7955.MaxSimultaneousTextures;
            this.field5577 = this.field7955.MaxActiveLights > 0 ? this.field7955.MaxActiveLights : 8;
            this.field5616 = (this.field7955.TextureCaps & 0x800) != 0;
            this.field7977 = (this.field7955.TextureCaps & 0x2) == 0;
            this.field5610 = this.field5648 > 0 || this.field7968.CheckDeviceMultiSampleType(this.field7967, this.field7970, this.field7954.BackBufferFormat, true, 2) == 0;
            this.field7961 = new boolean[this.field5635];
            this.field7966 = new boolean[this.field5635];
            this.field7971 = new boolean[this.field5635];
            this.field7960 = new int[this.field5635];
            this.field7973 = new boolean[this.field5635];
            this.field7975 = new class123[this.field5635];
            this.field7959.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method447((byte) -9);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLpd;Lok;)I", line = 1186)
    public static final int method3260(byte arg0, class259 arg1, class256 arg2) {
        int var3 = 17 % ((33 - arg0) / 57);
        if (class256.field3677 == arg2) {
            if (class505.field7177 == arg1) {
                return 22;
            }
            if (class752.field10511 == arg1) {
                return 21;
            }
            if (class39.field413 == arg1) {
                return 28;
            }
            if (class478.field6935 == arg1) {
                return 50;
            }
            if (class683.field9458 == arg1) {
                return 51;
            }
            if (class375.field5682 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "(B)V", line = 1222)
    public final void method2370(byte arg0) {
        int var2 = -39 / ((arg0 + 80) / 32);
        this.field7974.SetDirection(-this.field5617[0], -this.field5617[1], -this.field5617[2]);
        this.field7956.SetDirection(-this.field5598[0], -this.field5598[1], -this.field5598[2]);
        this.field7972 = false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 1232)
    public final Object method2378(int arg0, Canvas arg1) {
        if (arg0 < 59) {
            this.field7974 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "(B)V", line = 1242)
    public final void method2423(byte arg0) {
        this.field7959.SetRenderState(60, this.field5649);
        if (arg0 < 124) {
            this.field7963 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "(I)V", line = 1252)
    public final void method2356(int arg0) {
        this.field7959.SetViewport(this.field5621, this.field5613, this.field5407, this.field5502, 0.0F, 1.0F);
        if (arg0 != -1) {
            this.field7968 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "()V", line = 1263)
    public final void method535() {
        IDirect3DEventQuery var1 = this.field7959.method2912();
        if (class484.method2892((byte) 55, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3883((byte) 96);
    }

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "(B)V", line = 1287)
    public final void method2377(byte arg0) {
        this.field7974.SetAmbient(this.field5602 * this.field5575, this.field5639 * this.field5575, this.field5576 * this.field5575, 0.0F);
        this.field7972 = false;
        int var2 = 81 % ((-arg0 - 75) / 33);
    }

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "(II)V", line = 1296)
    public final void method430(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([[IIZZ)Lpf;", line = 1299)
    public final class584 method2424(int[][] arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            this.field7978 = null;
        }
        return new class620(this, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "(B)V", line = 1309)
    public final void method2421(byte arg0) {
        if (arg0 != 104) {
            field7976 = null;
        }
        this.field7959.method2908(7, this.field5568);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lbi;Ldk;)Lpk;", line = 1321)
    public final class198 method517(class482 arg0, class512 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILok;Lpd;)Z", line = 1329)
    public final boolean method2346(int arg0, class256 arg1, class259 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 != 9) {
            this.field7960 = null;
        }
        return class484.method2892((byte) 80, this.field7968.method2894(this.field7967, var4)) && class484.method2892((byte) 95, this.field7968.CheckDeviceFormat(this.field7967, this.field7970, var4.Format, 0, 4, method3260((byte) -87, arg2, arg1)));
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(FFF)V", line = 1339)
    public final void method489(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lbq;I)Lsr;", line = 1342)
    public final class254 method2302(class290[] arg0, int arg1) {
        if (arg1 != 13992) {
            this.method2397((byte) 61);
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()Z", line = 1355)
    public final boolean method441() {
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLok;Lpd;)Z", line = 1362)
    public final boolean method2311(byte arg0, class256 arg1, class259 arg2) {
        if (arg0 != -13) {
            this.method2302(null, 38);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class484.method2892((byte) 124, this.field7968.method2894(this.field7967, var4)) && class484.method2892((byte) 127, this.field7968.CheckDeviceFormat(this.field7967, this.field7970, var4.Format, 0, 3, method3260((byte) 105, arg2, arg1)));
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lpk;)V", line = 1373)
    public final void method452(class198 arg0) {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 1377)
    public final void method2295(byte arg0, Object arg1, Canvas arg2) {
        if (arg0 != 10) {
            this.method2365((byte) 62);
        }
        this.field7958 = (class605) arg1;
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "()V", line = 1389)
    public final void method538() {
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(Z)V", line = 1396)
    public final void method2373(boolean arg0) {
        if (arg0) {
            field7952 = null;
        }
        this.field7959.method2908(174, this.field5676);
    }

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "(I)V", line = 1410)
    public final void method2320(int arg0) {
        int var2 = this.field7966[this.field5558] ? method3262(true, this.field5555[this.field5558]) : 1;
        if (arg0 != 0) {
            method3262(false, null);
        }
        this.field7959.SetTextureStageState(this.field5558, 1, var2);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IZ)Ljf;", line = 1421)
    public final class216 method2362(int arg0, boolean arg1) {
        if (arg0 < 57) {
            method3261(null, true);
        }
        return new class522(this, class256.field3678, arg1);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V", line = 1431)
    public final void method462(int arg0, int arg1) throws class566 {
        this.field7959.EndScene();
        if (this.field7958.method3515(-32628)) {
            this.field7965 = 0;
            if (class484.method2893(this.field7958.method3512(0, (byte) -127), 2005530599)) {
                this.method3253(-84);
            }
        } else if ((++this.field7965) <= 50) {
            this.method3253(-91);
        } else {
            throw new class566();
        }
        this.field7959.BeginScene();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lef;Z)I", line = 1456)
    private static final int method3261(class489 arg0, boolean arg1) {
        if (arg1) {
            return 79;
        } else if (class291.field4160 == arg0) {
            return 2;
        } else if (class413.field6213 == arg0) {
            return 3;
        } else if (class173.field2678 == arg0) {
            return 1;
        } else if (class506.field7196 == arg0) {
            return 4;
        } else if (class299.field4249 == arg0) {
            return 6;
        } else if (class331.field4752 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "(B)V", line = 1489)
    public final void method2387(byte arg0) {
        this.field7959.method2908(137, this.field5594 && !this.field5578);
        if (arg0 != 126) {
            this.method2413(true);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLpha;)I", line = 1499)
    private static final int method3262(boolean arg0, class165 arg1) {
        if (!arg0) {
            method3257(null, null, -85, -44, -115, -45);
        }
        if (class499.field7099 == arg1) {
            return 2;
        } else if (class336.field4874 == arg1) {
            return 4;
        } else if (class49.field706 == arg1) {
            return 26;
        } else if (class661.field9242 == arg1) {
            return 7;
        } else if (class449.field6633 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIID)V", line = 1527)
    public final void method424(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lef;BII)V", line = 1531)
    public final void method2408(class489 arg0, byte arg1, int arg2, int arg3) {
        this.field7959.DrawPrimitive(method3261(arg0, false), arg2, arg3);
        if (arg1 == -40) {
            ;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([BIIZILpd;)Lkj;", line = 1548)
    public final class568 method2314(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, class259 arg5) {
        if (!arg3) {
            field7976 = null;
        }
        return new class733(this, arg5, arg4, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V", line = 1558)
    public final void method2332(boolean arg0, byte arg1) {
        this.field7959.method2908(161, arg0);
        if (arg1 >= -45) {
            this.method2362(-8, true);
        }
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "()V", line = 1572)
    public final void method472() {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 1575)
    public final void method2326(Canvas arg0, byte arg1, Object arg2) {
        if (arg1 <= 83) {
            field7976 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "(Z)V", line = 1587)
    public final void method2413(boolean arg0) {
        if (arg0) {
            this.method2326(null, (byte) -12, null);
        }
        this.field7959.SetTransform(3, this.field5643);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V", line = 1598)
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;I)V", line = 1602)
    public final void method3263(IDirect3DVertexShader arg0, int arg1) {
        this.field7964 = arg0;
        this.field7959.SetVertexShader(arg0);
        this.method2324(-95);
        int var3 = 42 % ((arg1 - 61) / 63);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILdga;)V", line = 1615)
    public final void method3264(int arg0, class207 arg1) {
        int var3 = 24 % ((arg0 + 61) / 55);
        this.method3258(arg1, 6);
        if (this.field7961[this.field5558] != arg1.field3047) {
            this.field7959.SetSamplerState(this.field5558, 1, arg1.field3047 ? 1 : 3);
            this.field7961[this.field5558] = arg1.field3047;
        }
        if (arg1.field3045 != this.field7971[this.field5558]) {
            this.field7959.SetSamplerState(this.field5558, 2, arg1.field3045 ? 1 : 3);
            this.field7971[this.field5558] = arg1.field3045;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLde;)V", line = 1640)
    public final void method2348(byte arg0, class533 arg1) {
        int var3 = 0;
        int var4 = 53 % ((arg0 + 44) / 60);
        if (class474.field6892 == arg1) {
            var3 = 65536;
        } else if (class236.field3430 == arg1) {
            var3 = 131072;
        } else if (client.field4275 == arg1) {
            var3 = 196608;
        }
        this.field7959.SetTextureStageState(this.field5558, 11, this.field5558 | var3);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIILjf;ILef;)V", line = 1665)
    public final void method2325(int arg0, int arg1, int arg2, int arg3, class216 arg4, int arg5, class489 arg6) {
        if (arg5 != -8) {
            this.field7954 = null;
        }
        this.field7959.SetIndices(((class522) arg4).field7467);
        this.field7959.DrawIndexedPrimitive(method3261(arg6, false), 0, arg3, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "ya", descriptor = "()V", line = 1682)
    public final void method444() {
        this.method2394(true, (byte) -112);
        this.field7959.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Lbi;", line = 1691)
    public final class482 method473(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)Lll;", line = 1700)
    public final class366 method2384(boolean arg0, int arg1) {
        int var3 = 74 % ((15 - arg1) / 62);
        return new class628(this, arg0);
    }
}
