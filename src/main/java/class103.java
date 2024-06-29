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
import jagdx.class508;
import jagdx.class509;
import jagdx.class510;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class103 extends class296 {

    @OriginalMember(owner = "client!sd", name = "Rg", descriptor = "I")
    private int field1164 = 0;

    @OriginalMember(owner = "client!sd", name = "Pg", descriptor = "Z")
    private boolean field1159 = false;

    @OriginalMember(owner = "client!sd", name = "jh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field1151;

    @OriginalMember(owner = "client!sd", name = "Lg", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client!sd", name = "hh", descriptor = "Ljaclib/peer/bw;")
    public class701 field1165;

    @OriginalMember(owner = "client!sd", name = "Zg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field1163;

    @OriginalMember(owner = "client!sd", name = "fh", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field1152;

    @OriginalMember(owner = "client!sd", name = "dh", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!sd", name = "Sg", descriptor = "Lq;")
    private class450 field1161;

    @OriginalMember(owner = "client!sd", name = "bh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field1147;

    @OriginalMember(owner = "client!sd", name = "Ug", descriptor = "Ljagdx/D3DLIGHT;")
    private class510 field1148;

    @OriginalMember(owner = "client!sd", name = "kh", descriptor = "Ljagdx/D3DLIGHT;")
    private class510 field1145;

    @OriginalMember(owner = "client!sd", name = "Wg", descriptor = "Ljagdx/D3DLIGHT;")
    private class510 field1157;

    @OriginalMember(owner = "client!sd", name = "ih", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field1169;

    @OriginalMember(owner = "client!sd", name = "Xg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field1153;

    @OriginalMember(owner = "client!sd", name = "eh", descriptor = "Z")
    public boolean field1150;

    @OriginalMember(owner = "client!sd", name = "Mg", descriptor = "Z")
    public boolean field1162;

    @OriginalMember(owner = "client!sd", name = "Og", descriptor = "Z")
    public boolean field1168;

    @OriginalMember(owner = "client!sd", name = "Qg", descriptor = "[Z")
    private boolean[] field1160;

    @OriginalMember(owner = "client!sd", name = "Vg", descriptor = "[Z")
    private boolean[] field1144;

    @OriginalMember(owner = "client!sd", name = "Tg", descriptor = "[Lli;")
    private class451[] field1149;

    @OriginalMember(owner = "client!sd", name = "Ng", descriptor = "[Z")
    private boolean[] field1171;

    @OriginalMember(owner = "client!sd", name = "Jg", descriptor = "[Z")
    private boolean[] field1146;

    @OriginalMember(owner = "client!sd", name = "gh", descriptor = "[I")
    private int[] field1166;

    @OriginalMember(owner = "client!sd", name = "lh", descriptor = "Ljava/lang/String;")
    private static final String field1172 = method908(method907("j\u0007\u001f bZ])"));

    @OriginalMember(owner = "client!sd", name = "ah", descriptor = "[I")
    private static int[] field1158 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!sd", name = "Kg", descriptor = "[I")
    private static int[] field1167 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!sd", name = "Yg", descriptor = "[F")
    private static float[] field1170 = new float[16];

    @OriginalMember(owner = "client!sd", name = "ch", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1156;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(II)Loda;")
    public final class129 method841(int arg0, int arg1) {
        if (arg0 != -1) {
            return (class129) null;
        } else if (arg1 == 3) {
            return new class333(this, this.field4399);
        } else if (arg1 == 4) {
            return new class92(this, this.field4399, this.field4402);
        } else if (arg1 == 8) {
            return new class539(this, this.field4399, this.field4402);
        } else {
            return super.method841(arg0 ^ 0x0, arg1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII[FLeu;III)Lwp;")
    public final class191 method842(boolean arg0, int arg1, int arg2, float[] arg3, class505 arg4, int arg5, int arg6, int arg7) {
        if (arg1 < 24) {
            this.method896(-103);
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "(II)V")
    public final void method843(int arg0, int arg1) {
        if (arg0 != -3535) {
            this.method877(-100, null, 6, -66, null, 121, (byte) -79);
        }
        this.field1151.SetTextureStageState(this.field4587, 11, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "()V")
    public final void method473() {
        IDirect3DEventQuery var1 = this.field1151.method3830();
        if (class508.method3822(var1.Issue(), true)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method5121(109);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lrt;IIZ)V")
    public final void method844(class239 arg0, int arg1, int arg2, boolean arg3) {
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = arg2;
        if (arg3) {
            var7 = arg2 | 0x10;
        }
        this.field1151.SetTextureStageState(this.field4587, var6, method848((byte) -126, arg0) | var7);
    }

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "(B)V")
    public final void method845(byte arg0) {
        this.field1148.SetDirection(-this.field4577[0], -this.field4577[1], -this.field4577[2]);
        this.field1145.SetDirection(-this.field4598[0], -this.field4598[1], -this.field4598[2]);
        int var2 = -80 % ((61 - arg0) / 62);
        this.field1159 = false;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()Z")
    public final boolean method547() {
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ldea;I)I")
    private static final int method846(class259 arg0, int arg1) {
        if (class313.field4962 == arg0) {
            return 2;
        } else if (class750.field10911 == arg0) {
            return 3;
        } else if (class104.field1210 == arg0) {
            return 1;
        } else if (class769.field11134 == arg0) {
            return 4;
        } else if (class242.field3692 == arg0) {
            return 6;
        } else if (class622.field9114 == arg0) {
            return 5;
        } else {
            if (arg1 != 3) {
                method900(30, (byte) 76, -6, null, 99, null);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFF)V")
    public final void method497(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIIILeu;[BI)Lwp;")
    public final class191 method847(boolean arg0, int arg1, int arg2, int arg3, int arg4, class505 arg5, byte[] arg6, int arg7) {
        if (arg3 != -1) {
            this.field1152 = null;
        }
        return new class401(this, arg5, arg7, arg1, arg0, arg6, arg4, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public final synchronized void method498(int arg0) {
        this.field1165.method5122((byte) 119);
        super.method498(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLrt;)I")
    private static final int method848(byte arg0, class239 arg1) {
        int var2 = 6 / ((-arg0 - 33) / 50);
        if (class48.field546 == arg1) {
            return 2;
        } else if (class335.field5233 == arg1) {
            return 0;
        } else if (class185.field2557 == arg1) {
            return 1;
        } else if (class114.field1352 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "(B)V")
    public final void method849(byte arg0) {
        this.field1151.SetScissorRect(this.field4624 + this.field4596, this.field4647 + this.field4578, this.field4630, this.field4561);
        if (arg0 != -39) {
            this.method478(-24, 20);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lnq;")
    public final class485 method478(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(ZI)Lsfa;")
    public final class723 method850(boolean arg0, int arg1) {
        if (arg1 != 0) {
            createToolkit(null, null, null, null);
        }
        return new class25(this, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(Z)V")
    public final void method851(boolean arg0) {
        if (!arg0) {
            this.method575();
        }
        this.field1151.method3840(15, this.field4554);
    }

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "(I)V")
    public final void method852(int arg0) {
        if (arg0 > -91) {
            this.method586();
        }
        this.method888(58);
        this.method905(100);
    }

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "()V")
    public final void method591() {
    }

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "(Z)V")
    public final void method853(boolean arg0) {
        for (int var2 = 0; var2 < this.field4593; var2++) {
            this.field1151.SetSamplerState(var2, 7, 0);
            this.field1151.SetSamplerState(var2, 6, 2);
            this.field1151.SetSamplerState(var2, 5, 2);
            this.field1151.SetSamplerState(var2, 1, 1);
            this.field1151.SetSamplerState(var2, 2, 1);
            this.field1149[var2] = class643.field9328;
            this.field1160[var2] = this.field1171[var2] = true;
            this.field1146[var2] = false;
            this.field1166[var2] = 0;
        }
        this.field1151.SetTextureStageState(0, 6, 1);
        this.field1151.SetRenderState(9, 2);
        this.field1151.SetRenderState(23, 4);
        this.field1151.SetRenderState(25, 5);
        this.field1151.SetRenderState(24, 0);
        this.field1151.SetRenderState(22, 2);
        this.field1151.SetRenderState(147, 1);
        this.field1151.SetRenderState(145, 1);
        this.field1151.method3838(38, 0.95F);
        this.field1151.SetRenderState(140, 3);
        this.field1148.SetType(3);
        this.field1145.SetType(3);
        this.field1157.SetType(1);
        this.field1159 = false;
        super.method853(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLli;)I")
    private static final int method854(byte arg0, class451 arg1) {
        int var2 = 76 / ((arg0 - 39) / 47);
        if (class643.field9328 == arg1) {
            return 2;
        } else if (class265.field4054 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/bw;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lq;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lla;I)V")
    private class103(int arg0, int arg1, Canvas arg2, class701 arg3, IDirect3D arg4, IDirect3DDevice arg5, class450 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class160 arg9, class476 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field1151 = arg5;
            this.field1154 = arg1;
            this.field1165 = arg3;
            this.field1163 = arg7;
            this.field1152 = arg8;
            this.field1155 = arg0;
            this.field1161 = arg6;
            this.field1147 = arg4;
            this.field1148 = new class510(this.field1165);
            this.field1145 = new class510(this.field1165);
            this.field1157 = new class510(this.field1165);
            this.field1169 = new PixelBuffer(this.field1165);
            this.field1153 = new GeometryBuffer(this.field1165);
            new GeometryBuffer(this.field1165);
            this.field1150 = (this.field1152.TextureCaps & 0x4000) != 0;
            this.field4640 = (this.field1152.TextureCaps & 0x800) != 0;
            this.field1162 = (this.field1152.TextureCaps & 0x2) == 0;
            this.field4586 = this.field1152.MaxActiveLights <= 0 ? 8 : this.field1152.MaxActiveLights;
            this.field4593 = this.field1152.MaxSimultaneousTextures;
            this.field4592 = (this.field1152.TextureCaps & 0x2000) != 0;
            this.field1168 = (this.field1152.TextureCaps & 0x10000) != 0;
            this.field4632 = this.field4584 > 0 || this.field1147.CheckDeviceMultiSampleType(this.field1155, this.field1154, this.field1163.BackBufferFormat, true, 2) == 0;
            this.field1160 = new boolean[this.field4593];
            this.field1144 = new boolean[this.field4593];
            this.field1149 = new class451[this.field4593];
            this.field1171 = new boolean[this.field4593];
            this.field1146 = new boolean[this.field4593];
            this.field1166 = new int[this.field4593];
            this.field1151.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method579((byte) -116);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sd", name = "na", descriptor = "(IIII)[I")
    public final int[] method474(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field1151.method3831(0);
        IDirect3DSurface var7 = this.field1151.method3834(arg2, arg3, 21, 0, 0, true);
        if (class508.method3822(this.field1151.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), true) && class508.method3822(var7.LockRect(0, 0, arg2, arg3, 16, this.field1169), true)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field1169.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field1169.method3850(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field1169.method3850(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method5121(124);
        var7.method5121(-98);
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpj;Leu;I)Z")
    public final boolean method855(class157 arg0, class505 arg1, int arg2) {
        if (arg2 != -331365768) {
            this.field1149 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class508.method3822(this.field1147.method3827(this.field1155, var4), true) && class508.method3822(this.field1147.CheckDeviceFormat(this.field1155, this.field1154, var4.Format, 0, 3, method864(arg0, arg1, (byte) -120)), true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILsfa;Z)V")
    public final void method856(int arg0, class723 arg1, boolean arg2) {
        class25 var4 = (class25) arg1;
        this.field1151.SetStreamSource(arg0, var4.field281, 0, var4.method168(120));
        if (!arg2) {
            this.field1154 = -11;
        }
    }

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "(Z)V")
    public final void method857(boolean arg0) {
        if (!arg0) {
            this.method855(null, null, 100);
        }
        this.field1151.method3840(27, this.field4612);
    }

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "()I")
    public final int method546() {
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(II)V")
    public final void method513(int arg0, int arg1) throws class382 {
        this.field1151.EndScene();
        if (this.field1161.method3457(0)) {
            this.field1164 = 0;
            if (class508.method3821((byte) -46, this.field1161.method3460(12960, 0))) {
                this.method896(-24546);
            }
        } else if ((++this.field1164) <= 50) {
            this.method896(-24546);
        } else {
            throw new class382();
        }
        this.field1151.BeginScene();
    }

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "(I)V")
    public final void method858(int arg0) {
        this.field1151.SetRenderState(60, this.field4581);
        if (arg0 > -40) {
            this.field1149 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjagdx/IDirect3DVertexShader;)V")
    public final void method859(int arg0, IDirect3DVertexShader arg1) {
        this.field1156 = arg1;
        this.field1151.SetVertexShader(arg1);
        if (arg0 == 253) {
            this.method872((byte) -84);
        }
    }

    @OriginalMember(owner = "client!sd", name = "GA", descriptor = "(I)V")
    public final void method483(int arg0) {
        this.field1151.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "(B)V")
    public final void method860(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field4631; var2++) {
            class471 var3 = this.field4560[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3578(-101);
            float var6 = var3.method3576((byte) -110) / 255.0F;
            this.field1157.SetPosition((float) var3.method3577(-32630), (float) var3.method3581(-83), (float) var3.method3580((byte) 69));
            this.field1157.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field1157.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3579((byte) 127) * var3.method3579((byte) 125)));
            this.field1157.SetRange((float) var3.method3579((byte) 126));
            this.field1151.SetLight(var4, this.field1157);
            this.field1151.LightEnable(var4, true);
        }
        while (this.field4615 > var2) {
            this.field1151.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method860(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Leu;BLpj;)Z")
    public final boolean method861(class505 arg0, byte arg1, class157 arg2) {
        if (arg1 != 91) {
            this.method484();
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class508.method3822(this.field1147.method3827(this.field1155, var4), true) && class508.method3822(this.field1147.CheckDeviceFormat(this.field1155, this.field1154, var4.Format, 0, 4, method864(arg2, arg0, (byte) 67)), true);
    }

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "(B)V")
    public final void method862(byte arg0) {
        int var2 = this.field1144[this.field4587] ? method874(this.field4622[this.field4587], -82) : 1;
        if (arg0 <= -67) {
            this.field1151.SetTextureStageState(this.field4587, 1, var2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILgk;)V")
    public final void method863(int arg0, class500 arg1) {
        if (arg0 <= 17) {
            this.method473();
        }
        this.method879(21249, arg1);
        if (!this.field1160[this.field4587]) {
            this.field1151.SetSamplerState(this.field4587, 1, 1);
            this.field1160[this.field4587] = true;
        }
        if (!this.field1171[this.field4587]) {
            this.field1151.SetSamplerState(this.field4587, 2, 1);
            this.field1171[this.field4587] = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpj;Leu;B)I")
    public static final int method864(class157 arg0, class505 arg1, byte arg2) {
        int var3 = -85 % ((arg2) / 43);
        if (class157.field1952 == arg0) {
            if (class671.field9751 == arg1) {
                return 22;
            }
            if (class215.field3276 == arg1) {
                return 21;
            }
            if (class667.field9691 == arg1) {
                return 28;
            }
            if (class65.field675 == arg1) {
                return 50;
            }
            if (class172.field2400 == arg1) {
                return 51;
            }
            if (class218.field3374 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIID)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "(B)V")
    public final void method865(byte arg0) {
        if (arg0 < 11) {
            this.method497(-1.400954F, -0.005846005F, 0.7455623F);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILeu;ILpj;I)Lwp;")
    public final class191 method866(int arg0, class505 arg1, int arg2, class157 arg3, int arg4) {
        if (arg4 != 0) {
            this.field1164 = -119;
        }
        return new class401(this, arg1, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BIILeu;)Loea;")
    public final class623 method867(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class505 arg5) {
        if (arg0 != 6) {
            this.method851(false);
        }
        return new class500(this, arg5, arg4, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLgn;)V")
    public final void method868(boolean arg0, class728 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0) {
            field1167 = null;
        }
        this.field1151.SetVertexDeclaration(var3.field5299);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
    public final void method869(boolean arg0, byte arg1) {
        this.field1151.method3840(161, arg0);
        if (arg1 > -49) {
            this.field1152 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "(I)V")
    public final void method870(int arg0) {
        if (arg0 != -1) {
            this.field1164 = 97;
        }
        this.field4600 = (this.field4610 - this.field4567);
        this.field4605 = (float) (-this.field4608) + this.field4600;
        if (this.field4605 < (float) this.field4636) {
            this.field4605 = this.field4636;
        }
        this.field1151.method3838(36, this.field4605);
        this.field1151.method3838(37, this.field4600);
        this.field1151.SetRenderState(34, this.field4590);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLup;)I")
    private static final int method871(boolean arg0, class290 arg1) {
        if (class319.field5047 == arg1) {
            return 1;
        } else if (class398.field5941 == arg1) {
            return 2;
        } else if (class735.field10700 == arg1) {
            return 3;
        } else if (class432.field6358 == arg1) {
            return 4;
        } else if (class301.field4724 == arg1) {
            return 256;
        } else if (arg0) {
            return 0;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    public final void method872(byte arg0) {
        int var2 = 126 / ((arg0 + 2) / 39);
        if (this.field1156 != null || this.field4642[this.field4587] == class341.field5303) {
            this.field1151.SetTextureStageState(this.field4587, 24, 0);
            this.field1166[this.field4587] = 0;
            return;
        }
        if (this.field4642[this.field4587] == class398.field5941) {
            this.field1151.SetTransform(this.field4587 + 16, this.field4575[this.field4587].method5569(field1170, (byte) -125));
        } else {
            this.field1151.SetTransform(this.field4587 + 16, this.field4575[this.field4587].method5555(field1170, 105));
        }
        int var3 = method871(true, this.field4642[this.field4587]);
        if (this.field1166[this.field4587] != var3) {
            this.field1151.SetTextureStageState(this.field4587, 24, var3);
            this.field1166[this.field4587] = var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([Laia;B)Lgn;")
    public final class728 method873(class240[] arg0, byte arg1) {
        if (arg1 < 40) {
            this.method493();
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lbda;I)I")
    private static final int method874(class531 arg0, int arg1) {
        if (arg1 >= -20) {
            return 47;
        } else if (class206.field3175 == arg0) {
            return 2;
        } else if (class684.field9909 == arg0) {
            return 4;
        } else if (class134.field1562 == arg0) {
            return 26;
        } else if (class362.field5530 == arg0) {
            return 7;
        } else if (class532.field7803 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method875(int arg0, Canvas arg1) {
        if (arg0 != -1) {
            this.field1166 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "(B)V")
    public final void method876(byte arg0) {
        if (arg0 <= 119) {
            return;
        }
        if (this.field4564.method1195((byte) 118)) {
            this.field4549.method5555(field1170, 117);
        } else {
            field1170[5] = 1.0F;
            field1170[9] = 0.0F;
            field1170[6] = 0.0F;
            field1170[13] = 0.0F;
            field1170[8] = 0.0F;
            field1170[1] = 0.0F;
            field1170[0] = 1.0F;
            field1170[3] = 0.0F;
            field1170[14] = 0.0F;
            field1170[11] = 0.0F;
            field1170[12] = 0.0F;
            field1170[2] = 0.0F;
            field1170[7] = 0.0F;
            field1170[10] = 1.0F;
            field1170[15] = 1.0F;
            field1170[4] = 0.0F;
        }
        this.field1151.SetTransform(2, field1170);
    }

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "()V")
    public final void method501() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILje;IILdea;IB)V")
    public final void method877(int arg0, class421 arg1, int arg2, int arg3, class259 arg4, int arg5, byte arg6) {
        if (arg6 <= -43) {
            this.field1151.SetIndices(((class767) arg1).field11083);
            this.field1151.DrawIndexedPrimitive(method846(arg4, 3), 0, arg2, arg0, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "(I)V")
    public final void method878(int arg0) {
        if (this.field1144[this.field4587]) {
            this.field1144[this.field4587] = false;
            this.field1151.SetTexture(this.field4587, null);
            this.method883(-32171);
            this.method862((byte) -97);
        }
        if (arg0 != -32266) {
            this.field1154 = 35;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILbr;)V")
    public final void method879(int arg0, class413 arg1) {
        this.field1151.SetTexture(this.field4587, arg1.method3152((byte) -94));
        if (arg0 != 21249) {
            return;
        }
        if (this.field1149[this.field4587] != arg1.field6088) {
            int var3 = method854((byte) 101, arg1.field6088);
            this.field1151.SetSamplerState(this.field4587, 6, var3);
            this.field1151.SetSamplerState(this.field4587, 5, var3);
            this.field1149[this.field4587] = arg1.field6088;
            if (this.field1146[this.field4587] != arg1.field6090) {
                this.field1151.SetSamplerState(this.field4587, 7, arg1.field6090 ? method854((byte) -25, arg1.field6088) : 0);
                this.field1146[this.field4587] = arg1.field6090;
            }
        } else if (arg1.field6090 != this.field1146[this.field4587]) {
            this.field1151.SetSamplerState(this.field4587, 7, arg1.field6090 ? method854((byte) 106, arg1.field6088) : 0);
            this.field1146[this.field4587] = arg1.field6090;
        }
        if (!this.field1144[this.field4587]) {
            this.field1144[this.field4587] = true;
            this.method883(-32171);
            this.method862((byte) -106);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;I)V")
    public final void method880(IDirect3DPixelShader arg0, int arg1) {
        this.field1151.SetPixelShader(arg0);
        if (arg1 != 24631) {
            this.method896(-89);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method881(int arg0, Canvas arg1, Object arg2) {
        if (this.field4386 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field1151.EndScene();
                this.method896(arg0 - 24562);
                this.field1151.BeginScene();
            }
        }
        if (arg0 != 16) {
            this.method898((byte) 47);
        }
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(Z)V")
    public final void method882(boolean arg0) {
        if (arg0) {
            this.field1163 = null;
        }
        this.field1151.method3840(174, this.field4675);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
    public final void method470() {
        this.field1165.method5126(17);
        super.method470();
    }

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "()Lmi;")
    public final class521 method493() {
        D3DADAPTER_IDENTIFIER var1 = this.field1147.method3826(this.field1155, 0);
        return new class521(var1.VendorID, field1172, 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "(I)V")
    public final void method883(int arg0) {
        int var2 = this.field1144[this.field4587] ? method874(this.field4556[this.field4587], arg0 ^ 0x7DBD) : 1;
        if (arg0 != -32171) {
            this.method879(-66, null);
        }
        this.field1151.SetTextureStageState(this.field4587, 4, var2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method884(Object arg0, int arg1, Canvas arg2) {
        if (arg1 != 4980) {
            this.field1152 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lol;Lol;FLol;)Lol;")
    public final class299 method485(class299 arg0, class299 arg1, float arg2, class299 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "(B)F")
    public final float method885(byte arg0) {
        if (arg0 > -77) {
            this.field1148 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lgea;)V")
    public final void method592(class82 arg0) {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ldda;I)V")
    public final void method886(class401 arg0, int arg1) {
        this.method879(21249, arg0);
        if (this.field1160[this.field4587] != arg0.field5986) {
            this.field1151.SetSamplerState(this.field4587, 1, arg0.field5986 ? 1 : 3);
            this.field1160[this.field4587] = arg0.field5986;
        }
        if (arg1 != -6396) {
            this.method485(null, null, 1.1805111F, null);
        }
        if (this.field1171[this.field4587] != arg0.field5984) {
            this.field1151.SetSamplerState(this.field4587, 2, arg0.field5984 ? 1 : 3);
            this.field1171[this.field4587] = arg0.field5984;
        }
    }

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "(B)V")
    public final void method887(byte arg0) {
        this.field1151.method3840(14, this.field4650 && this.field4651);
        if (arg0 != 61) {
            method846(null, -128);
        }
    }

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "(I)V")
    public final void method888(int arg0) {
        float var2 = this.field4572 ? this.field4611 : 0.0F;
        int var3 = -8 % ((arg0 + 58) / 47);
        float var4 = this.field4572 ? -this.field4559 : 0.0F;
        this.field1148.SetDiffuse(this.field4555 * var2, this.field4627 * var2, this.field4633 * var2, 0.0F);
        this.field1145.SetDiffuse(this.field4555 * var4, this.field4627 * var4, this.field4633 * var4, 0.0F);
        this.field1159 = false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIZILrt;)V")
    public final void method889(boolean arg0, int arg1, boolean arg2, int arg3, class239 arg4) {
        int var6 = 0;
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg3 < 97) {
            this.method847(false, -53, 103, -98, -19, null, null, 67);
        }
        if (arg2) {
            var6 |= 0x20;
        }
        if (arg0) {
            var6 |= 0x10;
        }
        this.field1151.SetTextureStageState(this.field4587, var8, var6 | method848((byte) 62, arg4));
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIII[III)Lwp;")
    public final class191 method890(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (arg5 < 9) {
            this.method898((byte) 109);
        }
        return new class401(this, arg3, arg6, arg0, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V")
    public final void method891(byte arg0) {
        this.field1148.SetAmbient(this.field4601 * this.field4555, this.field4627 * this.field4601, this.field4633 * this.field4601, 0.0F);
        this.field1159 = false;
        if (arg0 != 105) {
            this.method880(null, -128);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLdea;II)V")
    public final void method892(byte arg0, class259 arg1, int arg2, int arg3) {
        this.field1151.DrawPrimitive(method846(arg1, 3), arg2, arg3);
        int var5 = 107 / ((-arg0 - 62) / 56);
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(Z)V")
    public final void method893(boolean arg0) {
        if (this.field4540) {
            field1170[10] = 1.0F;
            field1170[14] = 0.0F;
            field1170[0] = 1.0F;
            field1170[3] = 0.0F;
            field1170[13] = 0.0F;
            field1170[15] = 1.0F;
            field1170[12] = 0.0F;
            field1170[5] = 1.0F;
            field1170[7] = 0.0F;
            field1170[6] = 0.0F;
            field1170[1] = 0.0F;
            field1170[2] = 0.0F;
            field1170[11] = 0.0F;
            field1170[9] = 0.0F;
            field1170[8] = 0.0F;
            field1170[4] = 0.0F;
        } else {
            this.field4541.method5555(field1170, 124);
        }
        this.field1151.SetTransform(256, field1170);
        if (arg0) {
            this.field1150 = false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "ya", descriptor = "()V")
    public final void method586() {
        this.method2473((byte) -121, true);
        this.field1151.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "(II)V")
    public final void method549(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public final void method894(Canvas arg0, Object arg1, int arg2) {
        if (arg2 != 0) {
            this.method857(true);
        }
        this.field1161 = (class450) arg1;
    }

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "()Z")
    public final boolean method566() {
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "(B)V")
    public final void method895(byte arg0) {
        this.field1151.method3840(137, this.field4628 && !this.field4621);
        if (arg0 != 84) {
            field1170 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "()V")
    public final void method484() {
    }

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "(I)Z")
    private final boolean method896(int arg0) {
        if (arg0 != -24546) {
            this.method860((byte) 122);
        }
        int var2 = this.field1151.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class450 var3 = (class450) this.field4474;
            this.method2496(arg0 ^ 0xFFFFA055);
            var3.method3459(0);
            this.field1163.BackBufferHeight = 0;
            this.field1163.BackBufferWidth = 0;
            if (method900(this.field1154, (byte) -11, this.field1155, this.field1163, this.field4584, this.field1147)) {
                int var4 = this.field1151.Reset(this.field1163);
                if (class508.method3822(var4, true)) {
                    var3.method3458(this.field1151.method3832(), arg0 + 12168, this.field1151.method3839(0));
                    this.method2494((byte) -94);
                    this.method853(true);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljh;I)V")
    public final void method897(class169 arg0, int arg1) {
        int var3 = arg1;
        if (class211.field3233 == arg0) {
            var3 = 65536;
        } else if (class312.field4948 == arg0) {
            var3 = 131072;
        } else if (class571.field8447 == arg0) {
            var3 = 196608;
        }
        this.field1151.SetTextureStageState(this.field4587, 11, var3 | this.field4587);
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V")
    public final void method898(byte arg0) {
        if (arg0 >= -54) {
            return;
        }
        if (class634.field9242 == this.field4646) {
            this.field1151.SetRenderState(19, 5);
            this.field1151.SetRenderState(20, 6);
        } else if (class57.field614 == this.field4646) {
            this.field1151.SetRenderState(19, 2);
            this.field1151.SetRenderState(20, 2);
        } else if (class203.field3152 == this.field4646) {
            this.field1151.SetRenderState(19, 9);
            this.field1151.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IZ)Lje;")
    public final class421 method899(int arg0, boolean arg1) {
        if (arg0 != 13) {
            field1158 = null;
        }
        return new class767(this, class157.field1953, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lrk;")
    public final class35 method486(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBILjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;)Z")
    private static final boolean method900(int arg0, byte arg1, int arg2, D3DPRESENT_PARAMETERS arg3, int arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class508.method3821((byte) 127, arg5.method3827(arg2, var9))) {
                return false;
            }
            label92: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var10 = 0; var10 < field1158.length; var10++) {
                        if (arg5.CheckDeviceType(arg2, arg0, var9.Format, field1158[var10], true) == 0 && arg5.CheckDeviceFormat(arg2, arg0, var9.Format, 1, 1, field1158[var10]) == 0 && (arg4 == 0 || arg5.CheckDeviceMultiSampleType(arg2, arg0, field1158[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field1167.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg2, arg0, var9.Format, 2, 1, field1167[var11]) == 0 && arg5.CheckDepthStencilMatch(arg2, arg0, var9.Format, field1158[var10], field1167[var11]) == 0 && (arg4 == 0 || arg5.CheckDeviceMultiSampleType(arg2, arg0, field1167[var10], true, var8) == 0)) {
                                    var7 = field1158[var10];
                                    var6 = field1167[var11];
                                    break label92;
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
            arg3.AutoDepthStencilFormat = var6;
            arg3.BackBufferFormat = var7;
            arg3.MultiSampleType = var8;
            arg3.MultiSampleQuality = 0;
            if (arg1 != -11) {
                field1167 = null;
            }
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "(Z)V")
    public final void method901(boolean arg0) {
        this.field1151.method3840(28, this.field4571 && this.field4563 && this.field4608 >= 0);
        if (!arg0) {
            this.field1148 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public final void method902(int arg0) {
        this.field1151.SetTransform(3, this.field4619);
        if (arg0 != 27477) {
            this.field1168 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(B)V")
    public final void method903(byte arg0) {
        this.field1151.SetViewport(this.field4596, this.field4647, this.field4492, this.field4416, 0.0F, 1.0F);
        int var2 = 53 / ((-arg0 - 44) / 61);
    }

    @OriginalMember(owner = "client!sd", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lla;Ljava/lang/Integer;)Lha;")
    public static final class66 createToolkit(Canvas arg0, class160 arg1, class476 arg2, Integer arg3) {
        class103 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class701 var7 = new class701();
            IDirect3D var8 = IDirect3D.method3825(-2147483616, var7);
            D3DCAPS var9 = var8.method3823(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method900(var6, (byte) -11, var5, var10, arg3, var8)) {
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
                    var13 = var8.method3824(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class509 var17) {
                    var13 = var8.method3824(var5, var6, arg0, var11 | 0x20, var10);
                }
                class450 var15 = new class450(var13.method3839(0), var13.method3832());
                var4 = new class103(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2426(29449);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method470();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method504(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class382 {
        this.method513(arg2, arg3);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([[IIZI)Lrr;")
    public final class380 method904(int[][] arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 > -103) {
            this.method883(-57);
        }
        return new class763(this, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lnq;Lrk;)Lgea;")
    public final class82 method507(class485 arg0, class35 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "()V")
    public final void method575() {
    }

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "(I)V")
    public final void method905(int arg0) {
        if (!this.field1159) {
            this.field1151.LightEnable(0, false);
            this.field1151.LightEnable(1, false);
            this.field1151.SetLight(0, this.field1148);
            this.field1151.SetLight(1, this.field1145);
            this.field1151.LightEnable(0, true);
            this.field1151.LightEnable(1, true);
            this.field1159 = true;
        }
        if (arg0 <= 46) {
            this.method566();
        }
    }

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "(Z)V")
    public final void method906(boolean arg0) {
        this.field1151.method3840(7, this.field4580);
        if (arg0) {
            method846(null, 112);
        }
    }

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method907(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method908(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
