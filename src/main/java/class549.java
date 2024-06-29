import jaclib.peer.class420;
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

@OriginalClass("client!rd")
public class class549 extends class492 {

    @OriginalMember(owner = "client!rd", name = "bh", descriptor = "I")
    private int field7747 = 0;

    @OriginalMember(owner = "client!rd", name = "eh", descriptor = "Z")
    private boolean field7750 = false;

    @OriginalMember(owner = "client!rd", name = "Pg", descriptor = "Ljaclib/peer/er;")
    public class420 field7735;

    @OriginalMember(owner = "client!rd", name = "hh", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field7753;

    @OriginalMember(owner = "client!rd", name = "ch", descriptor = "Lsaa;")
    private class587 field7748;

    @OriginalMember(owner = "client!rd", name = "ah", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field7746;

    @OriginalMember(owner = "client!rd", name = "ph", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field7761;

    @OriginalMember(owner = "client!rd", name = "Ug", descriptor = "I")
    private int field7740;

    @OriginalMember(owner = "client!rd", name = "Yg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field7744;

    @OriginalMember(owner = "client!rd", name = "Og", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!rd", name = "mh", descriptor = "Ljagdx/D3DLIGHT;")
    private class739 field7758;

    @OriginalMember(owner = "client!rd", name = "gh", descriptor = "Ljagdx/D3DLIGHT;")
    private class739 field7752;

    @OriginalMember(owner = "client!rd", name = "Tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class739 field7739;

    @OriginalMember(owner = "client!rd", name = "Sg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field7738;

    @OriginalMember(owner = "client!rd", name = "nh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field7759;

    @OriginalMember(owner = "client!rd", name = "oh", descriptor = "Z")
    public boolean field7760;

    @OriginalMember(owner = "client!rd", name = "kh", descriptor = "Z")
    public boolean field7756;

    @OriginalMember(owner = "client!rd", name = "ih", descriptor = "Z")
    public boolean field7754;

    @OriginalMember(owner = "client!rd", name = "Qg", descriptor = "[I")
    private int[] field7736;

    @OriginalMember(owner = "client!rd", name = "Wg", descriptor = "[Z")
    private boolean[] field7742;

    @OriginalMember(owner = "client!rd", name = "Vg", descriptor = "[Z")
    private boolean[] field7741;

    @OriginalMember(owner = "client!rd", name = "jh", descriptor = "[Ltb;")
    private class657[] field7755;

    @OriginalMember(owner = "client!rd", name = "dh", descriptor = "[Z")
    private boolean[] field7749;

    @OriginalMember(owner = "client!rd", name = "Rg", descriptor = "[Z")
    private boolean[] field7737;

    @OriginalMember(owner = "client!rd", name = "Zg", descriptor = "[F")
    private static float[] field7745 = new float[16];

    @OriginalMember(owner = "client!rd", name = "lh", descriptor = "[I")
    private static int[] field7757 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!rd", name = "fh", descriptor = "[I")
    private static int[] field7751 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!rd", name = "Xg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7743;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(BZ)V")
    public final void method607(byte arg0, boolean arg1) {
        if (arg0 == 67) {
            this.field7746.method4116(161, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "(B)V")
    public final void method621(byte arg0) {
        if (arg0 != -111) {
            method3276(-72, null);
        }
        if (this.field6883.method2981(-119)) {
            this.field6807.method1079((byte) 104, field7745);
        } else {
            field7745[9] = 0.0F;
            field7745[6] = 0.0F;
            field7745[4] = 0.0F;
            field7745[5] = 1.0F;
            field7745[1] = 0.0F;
            field7745[2] = 0.0F;
            field7745[0] = 1.0F;
            field7745[11] = 0.0F;
            field7745[7] = 0.0F;
            field7745[10] = 1.0F;
            field7745[15] = 1.0F;
            field7745[14] = 0.0F;
            field7745[3] = 0.0F;
            field7745[8] = 0.0F;
            field7745[12] = 0.0F;
            field7745[13] = 0.0F;
        }
        this.field7746.SetTransform(2, field7745);
    }

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "(I)V")
    public final void method641(int arg0) {
        if (this.field6798) {
            field7745[15] = 1.0F;
            field7745[8] = 0.0F;
            field7745[9] = 0.0F;
            field7745[10] = 1.0F;
            field7745[4] = 0.0F;
            field7745[3] = 0.0F;
            field7745[5] = 1.0F;
            field7745[6] = 0.0F;
            field7745[11] = 0.0F;
            field7745[7] = 0.0F;
            field7745[2] = 0.0F;
            field7745[0] = 1.0F;
            field7745[1] = 0.0F;
            field7745[12] = 0.0F;
            field7745[13] = 0.0F;
            field7745[14] = 0.0F;
        } else {
            this.field6794.method1079((byte) 104, field7745);
        }
        this.field7746.SetTransform(256, field7745);
        if (arg0 != 12) {
            this.field7746 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Lmp;")
    public final class315 method628(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "(B)V")
    public final void method623(byte arg0) {
        if (arg0 > -75) {
            this.method610();
        }
        if (this.field7750) {
            return;
        }
        this.field7746.LightEnable(0, false);
        this.field7746.LightEnable(1, false);
        this.field7746.SetLight(0, this.field7758);
        this.field7746.SetLight(1, this.field7752);
        this.field7746.LightEnable(0, true);
        this.field7746.LightEnable(1, true);
        this.field7750 = true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lbfa;I)I")
    private static final int method3274(class574 arg0, int arg1) {
        if (class209.field2975 == arg0) {
            return 2;
        } else if (class86.field1191 == arg0) {
            return 3;
        } else if (class560.field7954 == arg0) {
            return 1;
        } else if (class756.field10497 == arg0) {
            return 4;
        } else if (class54.field758 == arg0) {
            return 6;
        } else if (class507.field7091 == arg0) {
            return 5;
        } else {
            if (arg1 != 5) {
                method3284(null, true);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
    public final void method574(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "(I)V")
    public final void method577(int arg0) {
        if (arg0 == 0) {
            this.field7746.method4116(15, this.field6859);
        }
    }

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "(I)V")
    public final void method566(int arg0) {
        for (int var2 = 0; var2 < this.field6863; var2++) {
            this.field7746.SetSamplerState(var2, 7, 0);
            this.field7746.SetSamplerState(var2, 6, 2);
            this.field7746.SetSamplerState(var2, 5, 2);
            this.field7746.SetSamplerState(var2, 1, 1);
            this.field7746.SetSamplerState(var2, 2, 1);
            this.field7755[var2] = class48.field711;
            this.field7741[var2] = this.field7737[var2] = true;
            this.field7749[var2] = false;
            this.field7736[var2] = 0;
        }
        this.field7746.SetTextureStageState(0, 6, 1);
        this.field7746.SetRenderState(9, 2);
        if (arg0 < 16) {
            return;
        }
        this.field7746.SetRenderState(23, 4);
        this.field7746.SetRenderState(25, 5);
        this.field7746.SetRenderState(24, 0);
        this.field7746.SetRenderState(22, 2);
        this.field7746.SetRenderState(147, 1);
        this.field7746.SetRenderState(145, 1);
        this.field7746.method4117(38, 0.95F);
        this.field7746.SetRenderState(140, 3);
        this.field7758.SetType(3);
        this.field7752.SetType(3);
        this.field7739.SetType(1);
        this.field7750 = false;
        super.method566(104);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method558(Object arg0, Canvas arg1, int arg2) {
        int var4 = 108 % ((6 - arg2) / 39);
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "()Lgba;")
    public final class702 method568() {
        D3DADAPTER_IDENTIFIER var1 = this.field7761.method4118(this.field7734, 0);
        return new class702(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!rd", name = "ya", descriptor = "()V")
    public final void method610() {
        this.method2885(true, 92);
        this.field7746.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLbha;)V")
    public final void method3275(byte arg0, class299 arg1) {
        this.method3280(arg1, 30415);
        if (!this.field7741[this.field6838]) {
            this.field7746.SetSamplerState(this.field6838, 1, 1);
            this.field7741[this.field6838] = true;
        }
        if (!this.field7737[this.field6838]) {
            this.field7746.SetSamplerState(this.field6838, 2, 1);
            this.field7737[this.field6838] = true;
        }
        if (arg0 > -30) {
            this.field7739 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)Lho;")
    public final class212 method634(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field7758 = null;
        }
        return new class288(this, class720.field10165, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lbfa;IIZILho;I)V")
    public final void method612(class574 arg0, int arg1, int arg2, boolean arg3, int arg4, class212 arg5, int arg6) {
        this.field7746.SetIndices(((class288) arg5).field3790);
        this.field7746.DrawIndexedPrimitive(method3274(arg0, 5), 0, arg2, arg4, arg1, arg6);
        if (!arg3) {
            this.method637(-54);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILqs;)I")
    private static final int method3276(int arg0, class605 arg1) {
        if (class186.field2725 == arg1) {
            return 2;
        } else if (class87.field1198 == arg1) {
            return 0;
        } else if (class214.field3017 == arg1) {
            return 1;
        } else if (class123.field1675 == arg1) {
            return 3;
        } else {
            if (arg0 != -3844) {
                method3284(null, false);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lcu;I)V")
    public final void method3277(class203 arg0, int arg1) {
        if (arg1 != -14335) {
            this.field7739 = null;
        }
        this.method3280(arg0, 30415);
        if (this.field7741[this.field6838] != arg0.field2918) {
            this.field7746.SetSamplerState(this.field6838, 1, arg0.field2918 ? 1 : 3);
            this.field7741[this.field6838] = arg0.field2918;
        }
        if (arg0.field2917 != this.field7737[this.field6838]) {
            this.field7746.SetSamplerState(this.field6838, 2, arg0.field2917 ? 1 : 3);
            this.field7737[this.field6838] = arg0.field2917;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lkf;Lkea;I)Z")
    public final boolean method591(class720 arg0, class77 arg1, int arg2) {
        if (arg2 >= -114) {
            this.field7743 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class737.method4096(71, this.field7761.method4121(this.field7734, var4)) && class737.method4096(45, this.field7761.CheckDeviceFormat(this.field7734, this.field7740, var4.Format, 0, 4, method3279(arg0, arg1, -81)));
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(BZ)Llk;")
    public final class251 method638(byte arg0, boolean arg1) {
        if (arg0 > -74) {
            this.field7752 = null;
        }
        return new class516(this, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z[BILkea;II)Lco;")
    public final class722 method611(boolean arg0, byte[] arg1, int arg2, class77 arg3, int arg4, int arg5) {
        if (!arg0) {
            method3274(null, 120);
        }
        return new class299(this, arg3, arg2, arg5, arg4, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "(I)V")
    public final void method619(int arg0) {
        if (arg0 != 24) {
            return;
        }
        if (this.field7743 != null || this.field6857[this.field6838] == class116.field1624) {
            this.field7746.SetTextureStageState(this.field6838, 24, 0);
            this.field7736[this.field6838] = 0;
            return;
        }
        if (this.field6857[this.field6838] == class340.field4352) {
            this.field7746.SetTransform(this.field6838 + 16, this.field6869[this.field6838].method1079((byte) 104, field7745));
        } else {
            this.field7746.SetTransform(this.field6838 + 16, this.field6869[this.field6838].method1087(arg0 + -24, field7745));
        }
        int var2 = method3283(this.field6857[this.field6838], arg0 + 2960);
        if (this.field7736[this.field6838] != var2) {
            this.field7746.SetTextureStageState(this.field6838, 24, var2);
            this.field7736[this.field6838] = var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(FFF)V")
    public final void method570(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(Z)V")
    public final void method602(boolean arg0) {
        if (arg0) {
            this.field7741 = null;
        }
        this.field7746.SetRenderState(60, this.field6813);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;III)Z")
    private static final boolean method3278(IDirect3D arg0, int arg1, D3DPRESENT_PARAMETERS arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class737.method4095(arg0.method4121(arg3, var9), (byte) 108)) {
                return false;
            }
            label86: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field7757.length; var10++) {
                        if (arg0.CheckDeviceType(arg3, arg4, var9.Format, field7757[var10], true) == 0 && arg0.CheckDeviceFormat(arg3, arg4, var9.Format, 1, 1, field7757[var10]) == 0 && (arg5 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg4, field7757[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field7751.length; var11++) {
                                if (arg0.CheckDeviceFormat(arg3, arg4, var9.Format, 2, 1, field7751[var11]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg4, var9.Format, field7757[var10], field7751[var11]) == 0 && (arg5 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg4, field7751[var10], true, var8) == 0)) {
                                    var7 = field7757[var10];
                                    var6 = field7751[var11];
                                    break label86;
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
            arg2.BackBufferFormat = var7;
            if (arg1 != 1) {
                method3276(78, null);
            }
            arg2.MultiSampleQuality = 0;
            arg2.MultiSampleType = var8;
            arg2.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "(I)V")
    public final void method588(int arg0) {
        if (arg0 == 1) {
            this.field7746.method4116(27, this.field6846);
        }
    }

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "()V")
    public final void method635() {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILbfa;)V")
    public final void method580(int arg0, int arg1, int arg2, class574 arg3) {
        this.field7746.DrawPrimitive(method3274(arg3, 5), arg0, arg1);
        int var5 = 23 % ((arg2 - 10) / 33);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public final void method559(boolean arg0) {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lni;")
    public final class512 method594(int arg0, byte arg1) {
        if (arg1 >= -81) {
            this.method617();
        }
        if (arg0 == 3) {
            return new class758(this, this.field6744);
        } else if (arg0 == 4) {
            return new class377(this, this.field6744, this.field6749);
        } else if (arg0 == 8) {
            return new class472(this, this.field6744, this.field6749);
        } else {
            return super.method594(arg0, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "()V")
    public final void method625() {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method596(int arg0, Canvas arg1) {
        if (arg0 <= 40) {
            this.field7749 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "()Z")
    public final boolean method569() {
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILkf;Lkea;I)Loia;")
    public final class51 method636(int arg0, int arg1, class720 arg2, class77 arg3, int arg4) {
        if (arg4 < 21) {
            this.field7755 = null;
        }
        return new class203(this, arg3, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "(II)V")
    public final void method572(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lkf;Lkea;I)I")
    public static final int method3279(class720 arg0, class77 arg1, int arg2) {
        if (class720.field10164 == arg0) {
            if (class126.field1742 == arg1) {
                return 22;
            }
            if (class4.field10 == arg1) {
                return 21;
            }
            if (class197.field2845 == arg1) {
                return 28;
            }
            if (class678.field9551 == arg1) {
                return 50;
            }
            if (class442.field6065 == arg1) {
                return 51;
            }
            if (class10.field92 == arg1) {
                return 77;
            }
        }
        if (arg2 < -79) {
            throw new IllegalArgumentException("");
        }
        return -108;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ[BLkea;IZII)Loia;")
    public final class51 method618(int arg0, boolean arg1, byte[] arg2, class77 arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg1) {
            this.field7759 = null;
        }
        return new class203(this, arg3, arg7, arg6, arg5, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lpf;B)V")
    public final void method592(class728 arg0, byte arg1) {
        int var3 = -29 / ((arg1 - 68) / 57);
        int var4 = 0;
        if (class754.field10479 == arg0) {
            var4 = 65536;
        } else if (class632.field9000 == arg0) {
            var4 = 131072;
        } else if (class126.field1734 == arg0) {
            var4 = 196608;
        }
        this.field7746.SetTextureStageState(this.field6838, 11, this.field6838 | var4);
    }

    @OriginalMember(owner = "client!rd", name = "na", descriptor = "(IIII)[I")
    public final int[] method590(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field7746.method4111(0);
        IDirect3DSurface var7 = this.field7746.method4108(arg2, arg3, 21, 0, 0, true);
        if (class737.method4096(98, this.field7746.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class737.method4096(109, var7.LockRect(0, 0, arg2, arg3, 16, this.field7738))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field7738.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field7738.method4098(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field7738.method4098(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2573((byte) -104);
        var7.method2573((byte) -92);
        return var5;
    }

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "(I)V")
    public final void method599(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field6888; var2++) {
            class757 var3 = this.field6825[var2];
            int var4 = var2 + 2;
            int var5 = var3.method4209((byte) -66);
            float var6 = var3.method4211((byte) -84) / 255.0F;
            this.field7739.SetPosition((float) var3.method4203(20918), (float) var3.method4212(-54), (float) var3.method4205((byte) 8));
            this.field7739.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFF9D) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field7739.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method4206((byte) 121) * var3.method4206((byte) 127)));
            this.field7739.SetRange((float) var3.method4206((byte) -2));
            this.field7746.SetLight(var4, this.field7739);
            this.field7746.LightEnable(var4, true);
        }
        while (this.field6879 > var2) {
            this.field7746.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method599(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLqs;ZI)V")
    public final void method624(byte arg0, class605 arg1, boolean arg2, int arg3) {
        int var5 = 0;
        byte var7;
        if (arg3 == 1) {
            var7 = 6;
        } else if (arg3 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg2) {
            var5 |= 0x10;
        }
        this.field7746.SetTextureStageState(this.field6838, var7, method3276(-3844, arg1) | var5);
        if (arg0 != -83) {
            this.method641(-27);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lcd;Lcd;FLcd;)Lcd;")
    public final class22 method631(class22 arg0, class22 arg1, float arg2, class22 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "(I)V")
    public final void method640(int arg0) {
        float var2 = this.field6856 ? this.field6826 : 0.0F;
        float var3 = this.field6856 ? -this.field6910 : 0.0F;
        this.field7758.SetDiffuse(this.field6893 * var2, this.field6810 * var2, this.field6881 * var2, 0.0F);
        this.field7752.SetDiffuse(this.field6893 * var3, this.field6810 * var3, this.field6881 * var3, 0.0F);
        if (arg0 != 1) {
            this.method569();
        }
        this.field7750 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lvga;I)V")
    public final void method3280(class85 arg0, int arg1) {
        if (arg1 != 30415) {
            this.method593();
        }
        this.field7746.SetTexture(this.field6838, arg0.method522(false));
        if (this.field7755[this.field6838] != arg0.field1187) {
            int var3 = method3282(false, arg0.field1187);
            this.field7746.SetSamplerState(this.field6838, 6, var3);
            this.field7746.SetSamplerState(this.field6838, 5, var3);
            this.field7755[this.field6838] = arg0.field1187;
            if (this.field7749[this.field6838] != arg0.field1183) {
                this.field7746.SetSamplerState(this.field6838, 7, arg0.field1183 ? method3282(false, arg0.field1187) : 0);
                this.field7749[this.field6838] = arg0.field1183;
            }
        } else if (arg0.field1183 != this.field7749[this.field6838]) {
            this.field7746.SetSamplerState(this.field6838, 7, arg0.field1183 ? method3282(false, arg0.field1187) : 0);
            this.field7749[this.field6838] = arg0.field1183;
        }
        if (!this.field7742[this.field6838]) {
            this.field7742[this.field6838] = true;
            this.method633((byte) 56);
            this.method560(arg1 ^ 0xFFFF893B);
        }
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "(I)V")
    public final void method579(int arg0) {
        if (arg0 != 16) {
            field7751 = null;
        }
        this.field7746.method4116(174, this.field6933);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBZLqs;Z)V")
    public final void method582(int arg0, byte arg1, boolean arg2, class605 arg3, boolean arg4) {
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = -21 / ((arg1 + 55) / 54);
        int var9 = 0;
        if (arg2) {
            var9 |= 0x20;
        }
        if (arg4) {
            var9 |= 0x10;
        }
        this.field7746.SetTextureStageState(this.field6838, var7, var9 | method3276(-3844, arg3));
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/er;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lsaa;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lwu;I)V")
    private class549(int arg0, int arg1, Canvas arg2, class420 arg3, IDirect3D arg4, IDirect3DDevice arg5, class587 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class268 arg9, class557 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field7735 = arg3;
        this.field7753 = arg7;
        this.field7748 = arg6;
        this.field7746 = arg5;
        this.field7761 = arg4;
        this.field7740 = arg1;
        this.field7744 = arg8;
        this.field7734 = arg0;
        this.field7758 = new class739(this.field7735);
        this.field7752 = new class739(this.field7735);
        this.field7739 = new class739(this.field7735);
        this.field7738 = new PixelBuffer(this.field7735);
        this.field7759 = new GeometryBuffer(this.field7735);
        new GeometryBuffer(this.field7735);
        this.field7760 = (this.field7744.TextureCaps & 0x10000) != 0;
        this.field7756 = (this.field7744.TextureCaps & 0x4000) != 0;
        this.field6863 = this.field7744.MaxSimultaneousTextures;
        this.field7754 = (this.field7744.TextureCaps & 0x2) == 0;
        this.field6896 = (this.field7744.TextureCaps & 0x800) != 0;
        this.field6865 = (this.field7744.TextureCaps & 0x2000) != 0;
        this.field6877 = this.field7744.MaxActiveLights > 0 ? this.field7744.MaxActiveLights : 8;
        this.field6834 = this.field6855 > 0 || this.field7761.CheckDeviceMultiSampleType(this.field7734, this.field7740, this.field7753.BackBufferFormat, true, 2) == 0;
        this.field7736 = new int[this.field6863];
        this.field7742 = new boolean[this.field6863];
        this.field7741 = new boolean[this.field6863];
        this.field7755 = new class657[this.field6863];
        this.field7749 = new boolean[this.field6863];
        this.field7737 = new boolean[this.field6863];
        this.field7746.BeginScene();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V")
    public final void method3281(int arg0, IDirect3DPixelShader arg1) {
        this.field7746.SetPixelShader(arg1);
        if (arg0 != 77) {
            this.method592(null, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z")
    public final boolean method608() {
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public final synchronized void method639(int arg0) {
        this.field7735.method2571((byte) -78);
        super.method639(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILlk;Z)V")
    public final void method564(int arg0, class251 arg1, boolean arg2) {
        if (arg2) {
            this.method592(null, (byte) 85);
        }
        class516 var4 = (class516) arg1;
        this.field7746.SetStreamSource(arg0, var4.field7193, 0, var4.method3072((byte) -84));
    }

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "()V")
    public final void method556() {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[[IIZ)Luia;")
    public final class273 method626(int arg0, int[][] arg1, int arg2, boolean arg3) {
        return arg2 == 0 ? new class266(this, arg0, arg3, arg1) : (class273) null;
    }

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "(I)V")
    public final void method604(int arg0) {
        if (arg0 != 0) {
            this.field7741 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "(I)V")
    public final void method629(int arg0) {
        this.field7746.method4116(137, this.field6890 && !this.field6900);
        int var2 = -95 / ((-arg0 - 13) / 60);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLtb;)I")
    private static final int method3282(boolean arg0, class657 arg1) {
        if (arg0) {
            method3278(null, 121, null, -12, -106, -96);
        }
        if (class48.field711 == arg1) {
            return 2;
        } else if (class482.field6532 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIID)V")
    public final void method614(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method567(Object arg0, Canvas arg1, int arg2) {
        if (arg2 != 2) {
            this.method575(true);
        }
        this.field7748 = (class587) arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhs;Lmp;)Lcha;")
    public final class279 method584(class358 arg0, class315 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[Lot;)Ldha;")
    public final class732 method573(int arg0, class378[] arg1) {
        return arg0 == 0 ? new dxVertexLayout(this, arg1) : (class732) null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lefa;I)I")
    private static final int method3283(class528 arg0, int arg1) {
        if (arg1 != 2984) {
            field7757 = null;
        }
        if (class559.field7941 == arg0) {
            return 1;
        } else if (class643.field9115 == arg0) {
            return 2;
        } else if (class144.field1997 == arg0) {
            return 3;
        } else if (class340.field4352 == arg0) {
            return 4;
        } else if (class196.field2829 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "(I)V")
    public final void method637(int arg0) {
        if (arg0 == 14) {
            this.field7746.SetTransform(3, this.field6836);
        }
    }

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "()V")
    public final void method617() {
    }

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "()V")
    public final void method589() {
        IDirect3DEventQuery var1 = this.field7746.method4101();
        if (class737.method4096(103, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2573((byte) -110);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhd;Z)I")
    private static final int method3284(class595 arg0, boolean arg1) {
        if (class253.field3501 == arg0) {
            return 2;
        } else if (class369.field4717 == arg0) {
            return 4;
        } else if (class438.field6017 == arg0) {
            return 26;
        } else if (class35.field498 == arg0) {
            return 7;
        } else if (class130.field1767 == arg0) {
            return 10;
        } else {
            if (arg1) {
                method3279(null, null, 5);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;B)V")
    public final void method3285(IDirect3DVertexShader arg0, byte arg1) {
        this.field7743 = arg0;
        if (arg1 != 57) {
            this.method563(-107);
        }
        this.field7746.SetVertexShader(arg0);
        this.method619(24);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIZ[I)Loia;")
    public final class51 method601(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6) {
        return arg2 == -24364 ? new class203(this, arg1, arg4, arg5, arg6, arg0, arg3) : (class51) null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lcha;)V")
    public final void method595(class279 arg0) {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
    public final void method630(byte arg0, int arg1) {
        this.field7746.SetTextureStageState(this.field6838, 11, arg1);
        if (arg0 <= 7) {
            this.field7758 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "(I)V")
    public final void method606(int arg0) {
        this.field7746.SetViewport(this.field6820, this.field6824, this.field6732, this.field6730, 0.0F, (float) arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public final void method615(byte arg0) {
        if (arg0 > -124) {
            field7751 = null;
        }
        this.field6864 = (this.field6875 - this.field6852);
        this.field6832 = (float) (-this.field6889) + this.field6864;
        if ((float) this.field6878 > this.field6832) {
            this.field6832 = this.field6878;
        }
        this.field7746.method4117(36, this.field6832);
        this.field7746.method4117(37, this.field6864);
        this.field7746.SetRenderState(34, this.field6830);
    }

    @OriginalMember(owner = "client!rd", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lwu;Ljava/lang/Integer;)Lha;")
    public static final class545 createToolkit(Canvas arg0, class268 arg1, class557 arg2, Integer arg3) {
        class549 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class420 var7 = new class420();
            IDirect3D var8 = IDirect3D.method4120(-2147483616, var7);
            D3DCAPS var9 = var8.method4122(var5, var6);
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
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3278(var8, 1, var10, var5, var6, arg3)) {
                    throw new RuntimeException("");
                }
                var10.Windowed = true;
                var10.EnableAutoDepthStencil = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method4119(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class738 var17) {
                    var13 = var8.method4119(var5, var6, arg0, var11 | 0x20, var10);
                }
                class587 var15 = new class587(var13.method4112(0), var13.method4102());
                var4 = new class549(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2877((byte) 117);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method587();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "(I)V")
    public final void method627(int arg0) {
        int var2 = 20 / ((arg0 - 59) / 56);
        this.field7746.SetScissorRect(this.field6860 + this.field6820, this.field6903 + this.field6824, this.field6849, this.field6842);
    }

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "(B)V")
    public final void method620(byte arg0) {
        this.field7758.SetDirection(-this.field6861[0], -this.field6861[1], -this.field6861[2]);
        this.field7752.SetDirection(-this.field6847[0], -this.field6847[1], -this.field6847[2]);
        this.field7750 = false;
        if (arg0 != 47) {
            this.field7740 = 57;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method571(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 != 3 || this.field6673 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field7746.EndScene();
            this.method3286((byte) -128);
            this.field7746.BeginScene();
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(Z)V")
    public final void method575(boolean arg0) {
        this.field7746.method4116(14, this.field6876 && this.field6841);
        if (arg0) {
            this.method633((byte) -19);
        }
    }

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "(I)V")
    public final void method576(int arg0) {
        if (arg0 >= -66) {
            this.field7753 = null;
        }
        if (this.field7742[this.field6838]) {
            this.field7742[this.field6838] = false;
            this.field7746.SetTexture(this.field6838, null);
            this.method633((byte) 56);
            this.method560(-12);
        }
    }

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "(I)V")
    public final void method583(int arg0) {
        if (arg0 == -12) {
            this.field7746.method4116(28, this.field6814 && this.field6844 && this.field6889 >= 0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "()I")
    public final int method593() {
        return 0;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
    public final void method632(int arg0, int arg1) throws class425 {
        this.field7746.EndScene();
        if (this.field7748.method3491(0)) {
            this.field7747 = 0;
            if (class737.method4095(this.field7748.method3489(0, (byte) 76), (byte) 87)) {
                this.method3286((byte) -128);
            }
        } else if (++this.field7747 <= 50) {
            this.method3286((byte) -128);
        } else {
            throw new class425();
        }
        this.field7746.BeginScene();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLdha;)V")
    public final void method565(boolean arg0, class732 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0) {
            this.method563(19);
        }
        this.field7746.SetVertexDeclaration(var3.field8677);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method622(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class425 {
        this.method632(arg2, arg3);
    }

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "(I)V")
    public final void method560(int arg0) {
        if (arg0 != -12) {
            this.method597((byte) 93);
        }
        int var2 = this.field7742[this.field6838] ? method3284(this.field6899[this.field6838], false) : 1;
        this.field7746.SetTextureStageState(this.field6838, 1, var2);
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(B)V")
    public final void method633(byte arg0) {
        if (arg0 != 56) {
            this.field7743 = null;
        }
        int var2 = this.field7742[this.field6838] ? method3284(this.field6880[this.field6838], false) : 1;
        this.field7746.SetTextureStageState(this.field6838, 4, var2);
    }

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "(B)Z")
    private final boolean method3286(byte arg0) {
        if (arg0 > -127) {
            this.method568();
        }
        int var2 = this.field7746.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class587 var3 = (class587) this.field6746;
            this.method2890(-14073);
            var3.method3490(true);
            this.field7753.BackBufferHeight = 0;
            this.field7753.BackBufferWidth = 0;
            if (method3278(this.field7761, 1, this.field7753, this.field7734, this.field7740, this.field6855)) {
                int var4 = this.field7746.Reset(this.field7753);
                if (class737.method4096(56, var4)) {
                    var3.method3488(false, this.field7746.method4112(0), this.field7746.method4102());
                    this.method2921((byte) 11);
                    this.method566(84);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "(B)V")
    public final void method562(byte arg0) {
        this.field7758.SetAmbient(this.field6893 * this.field6850, this.field6850 * this.field6810, this.field6881 * this.field6850, 0.0F);
        this.field7750 = false;
        if (arg0 != -77) {
            this.method611(false, null, 103, null, -102, 55);
        }
    }

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "()V")
    public final void method587() {
        this.field7735.method2572(true);
        super.method587();
    }

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "(B)V")
    public final void method603(byte arg0) {
        if (class430.field5925 == this.field6887) {
            this.field7746.SetRenderState(19, 5);
            this.field7746.SetRenderState(20, 6);
        } else if (class97.field1413 == this.field6887) {
            this.field7746.SetRenderState(19, 2);
            this.field7746.SetRenderState(20, 2);
        } else if (class471.field6466 == this.field6887) {
            this.field7746.SetRenderState(19, 9);
            this.field7746.SetRenderState(20, 2);
        }
        if (arg0 != 71) {
            this.method597((byte) -29);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lhs;")
    public final class358 method600(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "(I)F")
    public final float method586(int arg0) {
        if (arg0 != 1) {
            this.method635();
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "(B)V")
    public final void method597(byte arg0) {
        this.field7746.method4116(7, this.field6895);
        if (arg0 >= -82) {
            this.method620((byte) 22);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[FIZILkea;I)Loia;")
    public final class51 method581(int arg0, int arg1, float[] arg2, int arg3, boolean arg4, int arg5, class77 arg6, int arg7) {
        return arg1 > -21 ? (class51) null : null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lkea;Lkf;B)Z")
    public final boolean method616(class77 arg0, class720 arg1, byte arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        int var5 = -6 % ((arg2 + 40) / 61);
        return class737.method4096(42, this.field7761.method4121(this.field7734, var4)) && class737.method4096(57, this.field7761.CheckDeviceFormat(this.field7734, this.field7740, var4.Format, 0, 3, method3279(arg1, arg0, -88)));
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)V")
    public final void method609(byte arg0) {
        this.method640(arg0 ^ 0xFFFFFFC5);
        if (arg0 != -60) {
            this.method630((byte) 7, 87);
        }
        this.method623((byte) -119);
    }

    @OriginalMember(owner = "client!rd", name = "GA", descriptor = "(I)V")
    public final void method563(int arg0) {
        this.field7746.Clear(1, arg0, 0.0F, 0);
    }
}
