import jaclib.peer.class704;
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

@OriginalClass("client!er")
public class class113 extends class261 {

    @OriginalMember(owner = "client!er", name = "Ng", descriptor = "I")
    private int field1601 = 0;

    @OriginalMember(owner = "client!er", name = "Bg", descriptor = "Z")
    private boolean field1602 = false;

    @OriginalMember(owner = "client!er", name = "Ag", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!er", name = "Eg", descriptor = "Ljaclib/peer/qd;")
    public class704 field1591;

    @OriginalMember(owner = "client!er", name = "Og", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field1577;

    @OriginalMember(owner = "client!er", name = "Fg", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client!er", name = "Gg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field1575;

    @OriginalMember(owner = "client!er", name = "Zg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field1581;

    @OriginalMember(owner = "client!er", name = "ah", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field1576;

    @OriginalMember(owner = "client!er", name = "Hg", descriptor = "Law;")
    private class80 field1585;

    @OriginalMember(owner = "client!er", name = "Xg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field1589;

    @OriginalMember(owner = "client!er", name = "Dg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field1598;

    @OriginalMember(owner = "client!er", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field1579;

    @OriginalMember(owner = "client!er", name = "Cg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field1590;

    @OriginalMember(owner = "client!er", name = "Ig", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field1578;

    @OriginalMember(owner = "client!er", name = "Vg", descriptor = "Z")
    public boolean field1593;

    @OriginalMember(owner = "client!er", name = "Yg", descriptor = "Z")
    public boolean field1596;

    @OriginalMember(owner = "client!er", name = "Rg", descriptor = "Z")
    public boolean field1594;

    @OriginalMember(owner = "client!er", name = "Kg", descriptor = "[Lse;")
    private class267[] field1587;

    @OriginalMember(owner = "client!er", name = "Qg", descriptor = "[I")
    private int[] field1599;

    @OriginalMember(owner = "client!er", name = "Ug", descriptor = "[Z")
    private boolean[] field1583;

    @OriginalMember(owner = "client!er", name = "Sg", descriptor = "[Z")
    private boolean[] field1595;

    @OriginalMember(owner = "client!er", name = "bh", descriptor = "[Z")
    private boolean[] field1588;

    @OriginalMember(owner = "client!er", name = "Mg", descriptor = "[Z")
    private boolean[] field1582;

    @OriginalMember(owner = "client!er", name = "ch", descriptor = "Ljava/lang/String;")
    private static final String field1603 = method1094(method1093("\u0004\u0011\tO\u00014K?"));

    @OriginalMember(owner = "client!er", name = "Tg", descriptor = "[F")
    private static float[] field1580 = new float[16];

    @OriginalMember(owner = "client!er", name = "Jg", descriptor = "[I")
    private static int[] field1586 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!er", name = "Wg", descriptor = "[I")
    private static int[] field1597 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!er", name = "Lg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1592;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "()V", line = 7)
    public final void method225() {
    }

    @OriginalMember(owner = "client!er", name = "t", descriptor = "(B)V", line = 12)
    public final void method1027(byte arg0) {
        int var2 = this.field1582[this.field4181] ? method1066(0, this.field4193[this.field4181]) : 1;
        this.field1575.SetTextureStageState(this.field4181, 1, var2);
        if (arg0 != 29) {
            this.field1588 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "m", descriptor = "()Lwaa;", line = 24)
    public final class734 method240() {
        D3DADAPTER_IDENTIFIER var1 = this.field1581.method3822(this.field1584, 0);
        return new class734(var1.VendorID, field1603, 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V", line = 32)
    public final void method1028(byte arg0) {
        this.field1589.SetDirection(-this.field4185[0], -this.field4185[1], -this.field4185[2]);
        this.field1598.SetDirection(-this.field4169[0], -this.field4169[1], -this.field4169[2]);
        this.field1602 = false;
        if (arg0 > -71) {
            this.method1090(null, null, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!er", name = "L", descriptor = "(I)V", line = 44)
    public final void method1029(int arg0) {
        if (arg0 == 11321) {
            this.field1575.SetViewport(this.field4195, this.field4187, this.field4015, this.field3947, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ)Lfk;", line = 54)
    public final class682 method1030(boolean arg0, boolean arg1) {
        return arg1 ? (class682) null : new class526(this, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 64)
    public final Object method1031(byte arg0, Canvas arg1) {
        if (arg0 != -97) {
            this.method223(27, 62);
        }
        return null;
    }

    @OriginalMember(owner = "client!er", name = "w", descriptor = "(B)V", line = 75)
    public final void method1032(byte arg0) {
        if (arg0 <= 114) {
            this.method225();
        }
        this.field1575.method3826(7, this.field4166);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/qd;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Law;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lgda;I)V", line = 86)
    private class113(int arg0, int arg1, Canvas arg2, class704 arg3, IDirect3D arg4, IDirect3DDevice arg5, class80 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class158 arg9, class58 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field1600 = arg1;
            this.field1591 = arg3;
            this.field1577 = arg7;
            this.field1584 = arg0;
            this.field1575 = arg5;
            this.field1581 = arg4;
            this.field1576 = arg8;
            this.field1585 = arg6;
            this.field1589 = new class512(this.field1591);
            this.field1598 = new class512(this.field1591);
            this.field1579 = new class512(this.field1591);
            this.field1590 = new PixelBuffer(this.field1591);
            this.field1578 = new GeometryBuffer(this.field1591);
            new GeometryBuffer(this.field1591);
            this.field1593 = (this.field1576.TextureCaps & 0x4000) != 0;
            this.field4178 = this.field1576.MaxActiveLights > 0 ? this.field1576.MaxActiveLights : 8;
            this.field1596 = (this.field1576.TextureCaps & 0x2) == 0;
            this.field4200 = this.field1576.MaxSimultaneousTextures;
            this.field4140 = (this.field1576.TextureCaps & 0x2000) != 0;
            this.field4142 = (this.field1576.TextureCaps & 0x800) != 0;
            this.field1594 = (this.field1576.TextureCaps & 0x10000) != 0;
            this.field4207 = this.field4177 > 0 || this.field1581.CheckDeviceMultiSampleType(this.field1584, this.field1600, this.field1577.BackBufferFormat, true, 2) == 0;
            this.field1587 = new class267[this.field4200];
            this.field1599 = new int[this.field4200];
            this.field1583 = new boolean[this.field4200];
            this.field1595 = new boolean[this.field4200];
            this.field1588 = new boolean[this.field4200];
            this.field1582 = new boolean[this.field4200];
            this.field1575.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method668(-4369);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLega;)I", line = 134)
    private static final int method1033(byte arg0, class742 arg1) {
        int var2 = 39 / ((arg0 - 9) / 52);
        if (class339.field5532 == arg1) {
            return 2;
        } else if (class186.field2964 == arg1) {
            return 0;
        } else if (class612.field8798 == arg1) {
            return 1;
        } else if (class119.field1723 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lel;", line = 158)
    public final class575 method209(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLua;Ldn;)Z", line = 166)
    public final boolean method1034(byte arg0, class696 arg1, class544 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        int var5 = -6 % ((4 - arg0) / 44);
        return class511.method3844(-2005530585, this.field1581.method3821(this.field1584, var4)) && class511.method3844(-2005530585, this.field1581.CheckDeviceFormat(this.field1584, this.field1600, var4.Format, 0, 4, method1078(-17331, arg2, arg1)));
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V", line = 177)
    public final void method1035(int arg0, IDirect3DPixelShader arg1) {
        if (arg0 != -8747) {
            this.method217(null, null);
        }
        this.field1575.SetPixelShader(arg1);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfk;II)V", line = 192)
    public final void method1036(class682 arg0, int arg1, int arg2) {
        class526 var4 = (class526) arg0;
        this.field1575.SetStreamSource(arg1, var4.field7751, 0, var4.method3930(true));
        if (arg2 != 2) {
            this.field1587 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "(Z)V", line = 203)
    public final void method1037(boolean arg0) {
        if (!arg0) {
            this.field1575.method3826(174, this.field4262);
        }
    }

    @OriginalMember(owner = "client!er", name = "I", descriptor = "()I", line = 213)
    public final int method154() {
        return 0;
    }

    @OriginalMember(owner = "client!er", name = "H", descriptor = "(I)V", line = 220)
    public final void method1038(int arg0) {
        if (arg0 >= 7) {
            this.field1575.method3826(28, this.field4141 && this.field4164 && this.field4205 >= 0);
        }
    }

    @OriginalMember(owner = "client!er", name = "v", descriptor = "(B)V", line = 230)
    public final void method1039(byte arg0) {
        if (this.field1582[this.field4181]) {
            this.field1582[this.field4181] = false;
            this.field1575.SetTexture(this.field4181, null);
            this.method1057(2);
            this.method1027((byte) 29);
        }
        int var2 = -92 / ((-arg0 - 41) / 46);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IIIID)V", line = 247)
    public final void method199(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!er", name = "V", descriptor = "(I)V", line = 251)
    public final void method1040(int arg0) {
        if (arg0 == 0) {
            this.field1575.method3826(15, this.field4194);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIII)V", line = 260)
    public final void method164(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!er", name = "u", descriptor = "(B)V", line = 263)
    public final void method1041(byte arg0) {
        if (arg0 != -18) {
            return;
        }
        if (class317.field5178 == this.field4230) {
            this.field1575.SetRenderState(19, 5);
            this.field1575.SetRenderState(20, 6);
        } else if (class533.field7828 == this.field4230) {
            this.field1575.SetRenderState(19, 2);
            this.field1575.SetRenderState(20, 2);
        } else if (class327.field5365 == this.field4230) {
            this.field1575.SetRenderState(19, 9);
            this.field1575.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLgaa;)V", line = 294)
    public final void method1042(byte arg0, class313 arg1) {
        if (arg0 != 123) {
            this.field1600 = 9;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field1575.SetVertexDeclaration(var3.field5560);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[BIZLua;II)Lah;", line = 306)
    public final class406 method1043(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, class696 arg5, int arg6, int arg7) {
        if (arg6 != -27137) {
            this.field1587 = null;
        }
        return new class520(this, arg5, arg7, arg1, arg4, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lsia;)V", line = 315)
    public final void method248(class769 arg0) {
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 321)
    public final void method1044(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 > -114) {
            this.field1581 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "GA", descriptor = "(I)V", line = 330)
    public final void method182(int arg0) {
        this.field1575.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!er", name = "u", descriptor = "()V", line = 337)
    public final void method216() {
    }

    @OriginalMember(owner = "client!er", name = "U", descriptor = "(I)V", line = 341)
    public final void method1045(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field4227; var2++) {
            class731 var3 = this.field4174[var2];
            int var4 = var2 + 2;
            int var5 = var3.method5294(true);
            float var6 = var3.method5299(31541) / 255.0F;
            this.field1579.SetPosition((float) var3.method5300(32), (float) var3.method5297(false), (float) var3.method5298(-4));
            this.field1579.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFFD5) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field1579.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method5295(32) * var3.method5295(32)));
            this.field1579.SetRange((float) var3.method5295(32));
            this.field1575.SetLight(var4, this.field1579);
            this.field1575.LightEnable(var4, true);
        }
        while (var2 < this.field4143) {
            this.field1575.LightEnable(var2 + 2, false);
            var2++;
        }
        if (arg0 > 50) {
            super.method1045(80);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLega;B)V", line = 381)
    public final void method1046(int arg0, boolean arg1, class742 arg2, byte arg3) {
        int var5 = 0;
        byte var7;
        if (arg0 == 1) {
            var7 = 6;
        } else if (arg0 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1) {
            var5 |= 0x10;
        }
        int var8 = 56 % ((-arg3 - 72) / 40);
        this.field1575.SetTextureStageState(this.field4181, var7, var5 | method1033((byte) 95, arg2));
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;I)Z", line = 427)
    private static final boolean method1047(int arg0, int arg1, int arg2, IDirect3D arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        if (arg0 != 14) {
            method1055(110, null);
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class511.method3845((byte) 110, arg3.method3821(arg2, var9))) {
                return false;
            }
            label90: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field1586.length; var10++) {
                        if (arg3.CheckDeviceType(arg2, arg1, var9.Format, field1586[var10], true) == 0 && arg3.CheckDeviceFormat(arg2, arg1, var9.Format, 1, 1, field1586[var10]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg1, field1586[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field1597.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg2, arg1, var9.Format, 2, 1, field1597[var11]) == 0 && arg3.CheckDepthStencilMatch(arg2, arg1, var9.Format, field1586[var10], field1597[var11]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg1, field1597[var10], true, var8) == 0)) {
                                    var7 = field1586[var10];
                                    var6 = field1597[var11];
                                    break label90;
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
            arg4.MultiSampleQuality = 0;
            arg4.MultiSampleType = var8;
            arg4.AutoDepthStencilFormat = var6;
            arg4.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILdn;IILua;)Lah;", line = 532)
    public final class406 method1048(int arg0, class544 arg1, int arg2, int arg3, class696 arg4) {
        if (arg3 <= 1) {
            this.field1583 = null;
        }
        return new class520(this, arg4, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B[[IZI)Loda;", line = 542)
    public final class125 method1049(byte arg0, int[][] arg1, boolean arg2, int arg3) {
        if (arg0 >= -62) {
            this.field1590 = null;
        }
        return new class677(this, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljj;III)V", line = 554)
    public final void method1050(class126 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 7645) {
            this.method1090(null, null, (byte) -21);
        }
        this.field1575.DrawPrimitive(method1068(arg0, false), arg1, arg2);
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V", line = 568)
    public final synchronized void method260(int arg0) {
        this.field1591.method5121(-98);
        super.method260(arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 576)
    public final void method256(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class146 {
        this.method171(arg2, arg3);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[Lgt;)Lgaa;", line = 584)
    public final class313 method1051(int arg0, class482[] arg1) {
        if (arg0 != 14) {
            this.field1591 = null;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(Z)V", line = 593)
    public final void method178(boolean arg0) {
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(Z)V", line = 596)
    public final void method1052(boolean arg0) {
        this.field1575.SetScissorRect(this.field4217 + this.field4195, this.field4188 + this.field4187, this.field4201, this.field4203);
        if (arg0) {
            this.field1581 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "t", descriptor = "()V", line = 606)
    public final void method202() {
        this.field1591.method5120(62);
        super.method202();
    }

    @OriginalMember(owner = "client!er", name = "s", descriptor = "()V", line = 614)
    public final void method215() {
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(B)V", line = 619)
    public final void method1053(byte arg0) {
        if (this.field4124) {
            field1580[5] = 1.0F;
            field1580[7] = 0.0F;
            field1580[12] = 0.0F;
            field1580[6] = 0.0F;
            field1580[1] = 0.0F;
            field1580[4] = 0.0F;
            field1580[3] = 0.0F;
            field1580[10] = 1.0F;
            field1580[2] = 0.0F;
            field1580[13] = 0.0F;
            field1580[11] = 0.0F;
            field1580[15] = 1.0F;
            field1580[8] = 0.0F;
            field1580[0] = 1.0F;
            field1580[14] = 0.0F;
            field1580[9] = 0.0F;
        } else {
            this.field4131.method4495(-123, field1580);
        }
        this.field1575.SetTransform(256, field1580);
        if (arg0 != -78) {
            this.method1052(true);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Llia;Llia;FLlia;)Llia;", line = 655)
    public final class505 method249(class505 arg0, class505 arg1, float arg2, class505 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!er", name = "v", descriptor = "()V", line = 668)
    public final void method233() {
        IDirect3DEventQuery var1 = this.field1575.method3835();
        if (class511.method3844(-2005530585, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method5123(-81);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FFF)V", line = 691)
    public final void method159(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLak;)I", line = 694)
    private static final int method1054(byte arg0, class369 arg1) {
        if (class138.field1942 == arg1) {
            return 1;
        } else if (class428.field6751 == arg1) {
            return 2;
        } else if (class791.field11549 == arg1) {
            return 3;
        } else if (class2.field34 == arg1) {
            return 4;
        } else if (class459.field7080 == arg1) {
            return 256;
        } else {
            if (arg0 < 110) {
                field1586 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILse;)I", line = 728)
    private static final int method1055(int arg0, class267 arg1) {
        if (arg0 != -7271) {
            return -35;
        } else if (class585.field8484 == arg1) {
            return 2;
        } else if (class494.field7430 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!er", name = "s", descriptor = "(B)F", line = 746)
    public final float method1056(byte arg0) {
        return arg0 == -13 ? -0.5F : -0.19095244F;
    }

    @OriginalMember(owner = "client!er", name = "t", descriptor = "(I)V", line = 757)
    public final void method1057(int arg0) {
        int var2 = this.field1582[this.field4181] ? method1066(0, this.field4206[this.field4181]) : 1;
        this.field1575.SetTextureStageState(this.field4181, 4, var2);
        if (arg0 != 2) {
            this.field1600 = 35;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILdn;Lua;)Z", line = 768)
    public final boolean method1058(int arg0, class544 arg1, class696 arg2) {
        if (arg0 != 6) {
            this.field1591 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class511.method3844(-2005530585, this.field1581.method3821(this.field1584, var4)) && class511.method3844(arg0 ^ 0x88760821, this.field1581.CheckDeviceFormat(this.field1584, this.field1600, var4.Format, 0, 3, method1078(-17331, arg1, arg2)));
    }

    @OriginalMember(owner = "client!er", name = "l", descriptor = "(B)V", line = 781)
    public final void method1059(byte arg0) {
        int var2 = 80 % ((60 - arg0) / 41);
        this.method1065(true);
        this.method1071(1);
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "()V", line = 789)
    public final void method222() {
    }

    @OriginalMember(owner = "client!er", name = "I", descriptor = "(I)V", line = 793)
    public final void method1060(int arg0) {
        int var2 = 31 / ((-arg0 - 77) / 34);
        for (int var3 = 0; var3 < this.field4200; var3++) {
            this.field1575.SetSamplerState(var3, 7, 0);
            this.field1575.SetSamplerState(var3, 6, 2);
            this.field1575.SetSamplerState(var3, 5, 2);
            this.field1575.SetSamplerState(var3, 1, 1);
            this.field1575.SetSamplerState(var3, 2, 1);
            this.field1587[var3] = class585.field8484;
            this.field1595[var3] = this.field1588[var3] = true;
            this.field1583[var3] = false;
            this.field1599[var3] = 0;
        }
        this.field1575.SetTextureStageState(0, 6, 1);
        this.field1575.SetRenderState(9, 2);
        this.field1575.SetRenderState(23, 4);
        this.field1575.SetRenderState(25, 5);
        this.field1575.SetRenderState(24, 0);
        this.field1575.SetRenderState(22, 2);
        this.field1575.SetRenderState(147, 1);
        this.field1575.SetRenderState(145, 1);
        this.field1575.method3840(38, 0.95F);
        this.field1575.SetRenderState(140, 3);
        this.field1589.SetType(3);
        this.field1598.SetType(3);
        this.field1579.SetType(1);
        this.field1602 = false;
        super.method1060(-116);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(II)Ltq;", line = 832)
    public final class657 method223(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lbg;B)V", line = 839)
    public final void method1061(class491 arg0, byte arg1) {
        if (arg1 > -76) {
            this.method1062(-66, 45, -35, 74, null, null, 85, false);
        }
        this.field1575.SetTexture(this.field4181, arg0.method1169(-15770));
        if (this.field1587[this.field4181] != arg0.field7400) {
            int var3 = method1055(-7271, arg0.field7400);
            this.field1575.SetSamplerState(this.field4181, 6, var3);
            this.field1575.SetSamplerState(this.field4181, 5, var3);
            this.field1587[this.field4181] = arg0.field7400;
            if (this.field1583[this.field4181] != arg0.field7399) {
                this.field1575.SetSamplerState(this.field4181, 7, arg0.field7399 ? method1055(-7271, arg0.field7400) : 0);
                this.field1583[this.field4181] = arg0.field7399;
            }
        } else if (this.field1583[this.field4181] != arg0.field7399) {
            this.field1575.SetSamplerState(this.field4181, 7, arg0.field7399 ? method1055(-7271, arg0.field7400) : 0);
            this.field1583[this.field4181] = arg0.field7399;
        }
        if (!this.field1582[this.field4181]) {
            this.field1582[this.field4181] = true;
            this.method1057(2);
            this.method1027((byte) 29);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIILua;[FIZ)Lah;", line = 878)
    public final class406 method1062(int arg0, int arg1, int arg2, int arg3, class696 arg4, float[] arg5, int arg6, boolean arg7) {
        if (arg1 != 0) {
            method1068(null, false);
        }
        return null;
    }

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "(I)V", line = 888)
    public final void method1063(int arg0) {
        if (this.field1592 == null && this.field4172[this.field4181] != class452.field6989) {
            if (this.field4172[this.field4181] == class428.field6751) {
                this.field1575.SetTransform(this.field4181 + 16, this.field4226[this.field4181].method4479(field1580, -108));
            } else {
                this.field1575.SetTransform(this.field4181 + 16, this.field4226[this.field4181].method4495(123, field1580));
            }
            int var2 = method1054((byte) 124, this.field4172[this.field4181]);
            if (this.field1599[this.field4181] != var2) {
                this.field1575.SetTextureStageState(this.field4181, 24, var2);
                this.field1599[this.field4181] = var2;
            }
        } else {
            this.field1575.SetTextureStageState(this.field4181, 24, 0);
            this.field1599[this.field4181] = 0;
        }
        if (arg0 <= 112) {
            this.field1584 = 42;
        }
    }

    @OriginalMember(owner = "client!er", name = "l", descriptor = "()Z", line = 923)
    public final boolean method167() {
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBILjj;Llp;I)V", line = 934)
    public final void method1064(int arg0, int arg1, byte arg2, int arg3, class126 arg4, class414 arg5, int arg6) {
        this.field1575.SetIndices(((class792) arg5).field11556);
        if (arg2 != -33) {
            this.method1043(-71, -110, null, -84, true, null, -71, 88);
        }
        this.field1575.DrawIndexedPrimitive(method1068(arg4, false), 0, arg1, arg0, arg3, arg6);
    }

    @OriginalMember(owner = "client!er", name = "k", descriptor = "(Z)V", line = 952)
    public final void method1065(boolean arg0) {
        float var2 = this.field4165 ? this.field4139 : 0.0F;
        if (!arg0) {
            this.method1091(-92);
        }
        float var3 = this.field4165 ? -this.field4163 : 0.0F;
        this.field1589.SetDiffuse(this.field4180 * var2, this.field4196 * var2, this.field4189 * var2, 0.0F);
        this.field1598.SetDiffuse(this.field4180 * var3, this.field4196 * var3, this.field4189 * var3, 0.0F);
        this.field1602 = false;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(II)V", line = 966)
    public final void method171(int arg0, int arg1) throws class146 {
        this.field1575.EndScene();
        if (this.field1585.method827(0)) {
            this.field1601 = 0;
            if (class511.method3845((byte) 110, this.field1585.method830(12890, 0))) {
                this.method1070(-126);
            }
        } else if (++this.field1601 <= 50) {
            this.method1070(-123);
        } else {
            throw new class146();
        }
        this.field1575.BeginScene();
    }

    @OriginalMember(owner = "client!er", name = "na", descriptor = "(IIII)[I", line = 992)
    public final int[] method207(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field1575.method3830(0);
        IDirect3DSurface var7 = this.field1575.method3836(arg2, arg3, 21, 0, 0, true);
        if (class511.method3844(-2005530585, this.field1575.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class511.method3844(-2005530585, var7.LockRect(0, 0, arg2, arg3, 16, this.field1590))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field1590.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field1590.method3849(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field1590.method3849(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method5123(-117);
        var7.method5123(-85);
        return var5;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILeh;)I", line = 1032)
    private static final int method1066(int arg0, class380 arg1) {
        if (arg0 != 0) {
            return 63;
        } else if (class434.field6809 == arg1) {
            return 2;
        } else if (class734.field10762 == arg1) {
            return 4;
        } else if (class539.field7915 == arg1) {
            return 26;
        } else if (class440.field6863 == arg1) {
            return 7;
        } else if (class207.field3239 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLega;ZII)V", line = 1074)
    public final void method1067(boolean arg0, class742 arg1, boolean arg2, int arg3, int arg4) {
        byte var7;
        if (arg4 == 1) {
            var7 = 3;
        } else if (arg4 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        if (arg3 >= -89) {
            return;
        }
        int var8 = 0;
        if (arg0) {
            var8 |= 0x20;
        }
        if (arg2) {
            var8 |= 0x10;
        }
        this.field1575.SetTextureStageState(this.field4181, var7, var8 | method1033((byte) 85, arg1));
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljj;Z)I", line = 1113)
    private static final int method1068(class126 arg0, boolean arg1) {
        if (class451.field6976 == arg0) {
            return 2;
        } else if (class240.field3698 == arg0) {
            return 3;
        } else if (class432.field6786 == arg0) {
            return 1;
        } else if (class356.field5727 == arg0) {
            return 4;
        } else if (class376.field6098 == arg0) {
            return 6;
        } else if (class285.field4610 == arg0) {
            return 5;
        } else {
            if (arg1) {
                method1078(-8, null, null);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!er", name = "u", descriptor = "(I)V", line = 1148)
    public final void method1069(int arg0) {
        if (arg0 != 262144) {
            return;
        }
        if (this.field4176.method5583(13)) {
            this.field4135.method4495(112, field1580);
        } else {
            field1580[1] = 0.0F;
            field1580[5] = 1.0F;
            field1580[0] = 1.0F;
            field1580[12] = 0.0F;
            field1580[2] = 0.0F;
            field1580[7] = 0.0F;
            field1580[9] = 0.0F;
            field1580[14] = 0.0F;
            field1580[6] = 0.0F;
            field1580[3] = 0.0F;
            field1580[15] = 1.0F;
            field1580[10] = 1.0F;
            field1580[11] = 0.0F;
            field1580[4] = 0.0F;
            field1580[8] = 0.0F;
            field1580[13] = 0.0F;
        }
        this.field1575.SetTransform(2, field1580);
    }

    @OriginalMember(owner = "client!er", name = "F", descriptor = "(II)V", line = 1183)
    public final void method161(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!er", name = "ya", descriptor = "()V", line = 1186)
    public final void method196() {
        this.method2230((byte) 86, true);
        this.field1575.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!er", name = "cb", descriptor = "(I)Z", line = 1195)
    private final boolean method1070(int arg0) {
        int var2 = this.field1575.TestCooperativeLevel();
        int var3 = -71 / ((-arg0 - 74) / 46);
        if (var2 == 0 || var2 == -2005530519) {
            class80 var4 = (class80) this.field4119;
            this.method2255(-94);
            var4.method828(119);
            this.field1577.BackBufferWidth = 0;
            this.field1577.BackBufferHeight = 0;
            if (method1047(14, this.field1600, this.field1584, this.field1581, this.field1577, this.field4177)) {
                int var5 = this.field1575.Reset(this.field1577);
                if (class511.method3844(-2005530585, var5)) {
                    var4.method829(this.field1575.method3827(), true, this.field1575.method3838(0));
                    this.method2243(true);
                    this.method1060(-115);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lel;Ltq;)Lsia;", line = 1234)
    public final class769 method217(class575 arg0, class657 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!er", name = "s", descriptor = "(I)V", line = 1241)
    public final void method1071(int arg0) {
        if (!this.field1602) {
            this.field1575.LightEnable(0, false);
            this.field1575.LightEnable(1, false);
            this.field1575.SetLight(0, this.field1589);
            this.field1575.SetLight(1, this.field1598);
            this.field1575.LightEnable(0, true);
            this.field1575.LightEnable(1, true);
            this.field1602 = true;
        }
        if (arg0 != 1) {
            this.method1048(-65, null, -55, 114, null);
        }
    }

    @OriginalMember(owner = "client!er", name = "n", descriptor = "(B)V", line = 1262)
    public final void method1072(byte arg0) {
        if (arg0 <= -115) {
            this.field1575.SetRenderState(60, this.field4238);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;B)V", line = 1272)
    public final void method1073(IDirect3DVertexShader arg0, byte arg1) {
        this.field1592 = arg0;
        this.field1575.SetVertexShader(arg0);
        int var3 = -45 % ((arg1 + 56) / 57);
        this.method1063(121);
    }

    @OriginalMember(owner = "client!er", name = "n", descriptor = "(Z)V", line = 1284)
    public final void method1074(boolean arg0) {
        this.field1575.method3826(27, this.field4237);
        if (!arg0) {
            this.field1582 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ZB)V", line = 1295)
    public final void method1075(boolean arg0, byte arg1) {
        if (arg1 < 87) {
            this.field1582 = null;
        }
        this.field1575.method3826(161, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjr;)V", line = 1305)
    public final void method1076(int arg0, class118 arg1) {
        if (arg0 < 39) {
            this.method1057(40);
        }
        this.method1061(arg1, (byte) -110);
        if (!this.field1595[this.field4181]) {
            this.field1575.SetSamplerState(this.field4181, 1, 1);
            this.field1595[this.field4181] = true;
        }
        if (!this.field1588[this.field4181]) {
            this.field1575.SetSamplerState(this.field4181, 2, 1);
            this.field1588[this.field4181] = true;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)Llp;", line = 1328)
    public final class414 method1077(int arg0, boolean arg1) {
        if (arg0 != -7930) {
            this.field1583 = null;
        }
        return new class792(this, class544.field8005, arg1);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ILdn;Lua;)I", line = 1343)
    public static final int method1078(int arg0, class544 arg1, class696 arg2) {
        if (class544.field8004 == arg1) {
            if (class556.field8116 == arg2) {
                return 22;
            }
            if (class313.field5120 == arg2) {
                return 21;
            }
            if (class335.field5466 == arg2) {
                return 28;
            }
            if (class411.field6564 == arg2) {
                return 50;
            }
            if (class225.field3529 == arg2) {
                return 51;
            }
            if (class9.field106 == arg2) {
                return 77;
            }
        }
        if (arg0 == -17331) {
            throw new IllegalArgumentException("");
        }
        return 7;
    }

    @OriginalMember(owner = "client!er", name = "o", descriptor = "()Z", line = 1380)
    public final boolean method263() {
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1387)
    public final void method1079(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 4 || this.field3973 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field1575.EndScene();
            this.method1070(-2);
            this.field1575.BeginScene();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([BIILua;BI)Lfd;", line = 1413)
    public final class555 method1080(byte[] arg0, int arg1, int arg2, class696 arg3, byte arg4, int arg5) {
        return arg4 <= 86 ? (class555) null : new class118(this, arg3, arg5, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!er", name = "K", descriptor = "(I)V", line = 1425)
    public final void method1081(int arg0) {
        this.field1575.method3826(14, this.field4231 && this.field4218);
        if (arg0 >= -75) {
            method1078(70, null, null);
        }
    }

    @OriginalMember(owner = "client!er", name = "o", descriptor = "(I)V", line = 1435)
    public final void method1082(int arg0) {
        if (arg0 != 1) {
            this.field1583 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(BI)V", line = 1444)
    public final void method1083(byte arg0, int arg1) {
        if (arg0 == -1) {
            this.field1575.SetTextureStageState(this.field4181, 11, arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(II)Lqba;", line = 1456)
    public final class428 method1084(int arg0, int arg1) {
        if (arg0 > -18) {
            return (class428) null;
        } else if (arg1 == 3) {
            return new class562(this, this.field4092);
        } else if (arg1 == 4) {
            return new class629(this, this.field4092, this.field4002);
        } else if (arg1 == 8) {
            return new class469(this, this.field4092, this.field4002);
        } else {
            return super.method1084(-40, arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lgda;Ljava/lang/Integer;)Lha;", line = 1502)
    public static final class63 createToolkit(Canvas arg0, class158 arg1, class58 arg2, Integer arg3) {
        class113 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class704 var7 = new class704();
            IDirect3D var8 = IDirect3D.method3823(-2147483616, var7);
            D3DCAPS var9 = var8.method3825(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x20 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1047(14, var6, var5, var8, var10, arg3)) {
                    throw new RuntimeException("");
                }
                var10.EnableAutoDepthStencil = true;
                var10.Windowed = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method3824(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class510 var17) {
                    var13 = var8.method3824(var5, var6, arg0, var11 | 0x20, var10);
                }
                class80 var15 = new class80(var13.method3838(0), var13.method3827());
                var4 = new class113(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2215(0);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method202();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILew;)V", line = 1601)
    public final void method1085(int arg0, class520 arg1) {
        this.method1061(arg1, (byte) -104);
        if (this.field1595[this.field4181] != arg1.field7693) {
            this.field1575.SetSamplerState(this.field4181, 1, arg1.field7693 ? 1 : 3);
            this.field1595[this.field4181] = arg1.field7693;
        }
        if (this.field1588[this.field4181] != arg1.field7690) {
            this.field1575.SetSamplerState(this.field4181, 2, arg1.field7690 ? 1 : 3);
            this.field1588[this.field4181] = arg1.field7690;
        }
        if (arg0 != 0) {
            this.field1602 = false;
        }
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "(I)V", line = 1625)
    public final void method1086(int arg0) {
        this.field4155 = (this.field4151 - this.field4232);
        this.field4186 = (float) (-this.field4205) + this.field4155;
        if ((float) this.field4158 > this.field4186) {
            this.field4186 = this.field4158;
        }
        this.field1575.method3840(36, this.field4186);
        this.field1575.method3840(37, this.field4155);
        this.field1575.SetRenderState(34, this.field4170);
        int var2 = -128 % ((23 - arg0) / 47);
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(B)V", line = 1642)
    public final void method1087(byte arg0) {
        this.field1575.method3826(137, this.field4146 && !this.field4147);
        if (arg0 > -41) {
            this.field1578 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIZI[III)Lah;", line = 1652)
    public final class406 method1088(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (arg5 != 3982) {
            field1597 = null;
        }
        return new class520(this, arg6, arg1, arg2, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfg;I)V", line = 1663)
    public final void method1089(class136 arg0, int arg1) {
        int var3 = 0;
        if (arg1 >= -58) {
            return;
        }
        if (class235.field3624 == arg0) {
            var3 = 65536;
        } else if (class636.field9125 == arg0) {
            var3 = 131072;
        } else if (class62.field835 == arg0) {
            var3 = 196608;
        }
        this.field1575.SetTextureStageState(this.field4181, 11, var3 | this.field4181);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V", line = 1685)
    public final void method1090(Canvas arg0, Object arg1, byte arg2) {
        this.field1585 = (class80) arg1;
        if (arg2 != -34) {
            this.field1584 = -52;
        }
    }

    @OriginalMember(owner = "client!er", name = "y", descriptor = "(I)V", line = 1695)
    public final void method1091(int arg0) {
        this.field1589.SetAmbient(this.field4192 * this.field4180, this.field4196 * this.field4192, this.field4192 * this.field4189, 0.0F);
        if (arg0 >= -63) {
            this.method1045(121);
        }
        this.field1602 = false;
    }

    @OriginalMember(owner = "client!er", name = "w", descriptor = "(I)V", line = 1709)
    public final void method1092(int arg0) {
        this.field1575.SetTransform(3, this.field4167);
        if (arg0 != 11) {
            this.method1032((byte) 12);
        }
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1093(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1094(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
