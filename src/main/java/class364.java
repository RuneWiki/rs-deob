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
import jagdx.class445;
import jagdx.class446;
import jagdx.class447;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class364 extends class387 {

    @OriginalMember(owner = "client!tb", name = "Eg", descriptor = "Z")
    private boolean field5198 = false;

    @OriginalMember(owner = "client!tb", name = "Tg", descriptor = "I")
    private int field5213 = 0;

    @OriginalMember(owner = "client!tb", name = "zg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field5193;

    @OriginalMember(owner = "client!tb", name = "ug", descriptor = "I")
    private int field5188;

    @OriginalMember(owner = "client!tb", name = "Jg", descriptor = "Lks;")
    private class402 field5203;

    @OriginalMember(owner = "client!tb", name = "Hg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field5201;

    @OriginalMember(owner = "client!tb", name = "vg", descriptor = "I")
    private int field5189;

    @OriginalMember(owner = "client!tb", name = "Qg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field5210;

    @OriginalMember(owner = "client!tb", name = "Kg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field5204;

    @OriginalMember(owner = "client!tb", name = "Dg", descriptor = "Ljaclib/peer/jv;")
    public class624 field5197;

    @OriginalMember(owner = "client!tb", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class447 field5200;

    @OriginalMember(owner = "client!tb", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class447 field5209;

    @OriginalMember(owner = "client!tb", name = "Fg", descriptor = "Ljagdx/D3DLIGHT;")
    private class447 field5199;

    @OriginalMember(owner = "client!tb", name = "Ig", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field5202;

    @OriginalMember(owner = "client!tb", name = "Lg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field5205;

    @OriginalMember(owner = "client!tb", name = "Cg", descriptor = "Z")
    public boolean field5196;

    @OriginalMember(owner = "client!tb", name = "tg", descriptor = "Z")
    public boolean field5187;

    @OriginalMember(owner = "client!tb", name = "Og", descriptor = "Z")
    public boolean field5208;

    @OriginalMember(owner = "client!tb", name = "Sg", descriptor = "[Z")
    private boolean[] field5212;

    @OriginalMember(owner = "client!tb", name = "yg", descriptor = "[Z")
    private boolean[] field5192;

    @OriginalMember(owner = "client!tb", name = "Ng", descriptor = "[Z")
    private boolean[] field5207;

    @OriginalMember(owner = "client!tb", name = "Bg", descriptor = "[Z")
    private boolean[] field5195;

    @OriginalMember(owner = "client!tb", name = "xg", descriptor = "[Lgaa;")
    private class267[] field5191;

    @OriginalMember(owner = "client!tb", name = "Mg", descriptor = "[I")
    private int[] field5206;

    @OriginalMember(owner = "client!tb", name = "Ag", descriptor = "[I")
    private static int[] field5194 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!tb", name = "wg", descriptor = "[I")
    private static int[] field5190 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!tb", name = "Rg", descriptor = "[F")
    private static float[] field5211 = new float[16];

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "()Z", line = 4)
    public final boolean method186() {
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "ja", descriptor = "(I)V", line = 11)
    public final void method139(int arg0) {
        this.field5204.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "()Z", line = 18)
    public final boolean method127() {
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lgaa;B)I", line = 27)
    private static final int method2206(class267 arg0, byte arg1) {
        if (arg1 != -43) {
            field5190 = null;
        }
        if (class69.field1245 == arg0) {
            return 2;
        } else if (class630.field8812 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(B)V", line = 46)
    public final void method1907(byte arg0) {
        for (int var2 = 0; var2 < this.field5709; var2++) {
            this.field5204.SetSamplerState(var2, 7, 0);
            this.field5204.SetSamplerState(var2, 6, 2);
            this.field5204.SetSamplerState(var2, 5, 2);
            this.field5204.SetSamplerState(var2, 1, 1);
            this.field5204.SetSamplerState(var2, 2, 1);
            this.field5191[var2] = class69.field1245;
            this.field5212[var2] = this.field5192[var2] = true;
            this.field5195[var2] = false;
            this.field5206[var2] = 0;
        }
        this.field5204.SetTextureStageState(0, 6, 1);
        this.field5204.SetRenderState(9, 2);
        this.field5204.SetRenderState(23, 4);
        this.field5204.SetRenderState(25, 5);
        this.field5204.SetRenderState(24, 0);
        this.field5204.SetRenderState(22, 2);
        this.field5204.SetRenderState(147, 1);
        this.field5204.SetRenderState(145, 1);
        this.field5204.method2643(38, 0.95F);
        this.field5204.SetRenderState(140, 3);
        this.field5200.SetType(3);
        this.field5209.SetType(3);
        this.field5199.SetType(1);
        this.field5198 = false;
        super.method1907(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "(I)V", line = 85)
    public final void method1870(int arg0) {
        if (arg0 >= -44) {
            field5211 = null;
        }
        float var2 = this.field5677 ? this.field5729 : 0.0F;
        float var3 = this.field5677 ? -this.field5658 : 0.0F;
        this.field5200.SetDiffuse(this.field5650 * var2, this.field5690 * var2, this.field5717 * var2, 0.0F);
        this.field5209.SetDiffuse(this.field5650 * var3, this.field5690 * var3, this.field5717 * var3, 0.0F);
        this.field5198 = false;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(B)V", line = 103)
    public final void method1915(byte arg0) {
        if (this.field5623) {
            field5211[4] = 0.0F;
            field5211[15] = 1.0F;
            field5211[10] = 1.0F;
            field5211[12] = 0.0F;
            field5211[2] = 0.0F;
            field5211[9] = 0.0F;
            field5211[5] = 1.0F;
            field5211[14] = 0.0F;
            field5211[1] = 0.0F;
            field5211[3] = 0.0F;
            field5211[11] = 0.0F;
            field5211[0] = 1.0F;
            field5211[6] = 0.0F;
            field5211[8] = 0.0F;
            field5211[7] = 0.0F;
            field5211[13] = 0.0F;
        } else {
            this.field5625.method237(field5211, 10);
        }
        this.field5204.SetTransform(256, field5211);
        if (arg0 != 61) {
            this.method139(-109);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkj;IIZ)V", line = 152)
    public final void method1898(class525 arg0, int arg1, int arg2, boolean arg3) {
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
        if (arg2 == 14319) {
            this.field5204.SetTextureStageState(this.field5661, var6, var7 | method2207(arg0, (byte) -114));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILbca;)V", line = 188)
    public final void method1865(int arg0, int arg1, class613 arg2) {
        if (arg1 == -26558) {
            class137 var4 = (class137) arg2;
            this.field5204.SetStreamSource(arg0, var4.field2001, 0, var4.method991((byte) 47));
        }
    }

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "(B)V", line = 201)
    public final void method1890(byte arg0) {
        if (this.field5646.method3603(0)) {
            this.field5632.method237(field5211, 10);
        } else {
            field5211[8] = 0.0F;
            field5211[2] = 0.0F;
            field5211[3] = 0.0F;
            field5211[5] = 1.0F;
            field5211[7] = 0.0F;
            field5211[13] = 0.0F;
            field5211[10] = 1.0F;
            field5211[4] = 0.0F;
            field5211[9] = 0.0F;
            field5211[14] = 0.0F;
            field5211[11] = 0.0F;
            field5211[0] = 1.0F;
            field5211[15] = 1.0F;
            field5211[12] = 0.0F;
            field5211[6] = 0.0F;
            field5211[1] = 0.0F;
        }
        this.field5204.SetTransform(2, field5211);
        if (arg0 >= -63) {
            this.method2215(-126, null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "(B)V", line = 237)
    public final void method1876(byte arg0) {
        if (arg0 != -26) {
            this.field5196 = true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ[BILlca;IZI)Loi;", line = 247)
    public final class65 method1878(int arg0, boolean arg1, byte[] arg2, int arg3, class597 arg4, int arg5, boolean arg6, int arg7) {
        if (arg1) {
            this.field5210 = null;
        }
        return new class291(this, arg4, arg3, arg5, arg6, arg2, arg0, arg7);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 257)
    public final synchronized void method151(int arg0) {
        this.field5197.method3487((byte) 116);
        super.method151(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILqs;)V", line = 266)
    public final void method1886(int arg0, class559 arg1) {
        if (arg0 != 1) {
            this.field5189 = 126;
        }
        int var3 = 0;
        if (class268.field4040 == arg1) {
            var3 = 65536;
        } else if (class69.field1243 == arg1) {
            var3 = 131072;
        } else if (class559.field7887 == arg1) {
            var3 = 196608;
        }
        this.field5204.SetTextureStageState(this.field5661, 11, var3 | this.field5661);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkj;B)I", line = 288)
    private static final int method2207(class525 arg0, byte arg1) {
        if (arg1 >= -102) {
            method2208(null, -95);
        }
        if (class61.field1155 == arg0) {
            return 2;
        } else if (class315.field4669 == arg0) {
            return 0;
        } else if (class319.field4696 == arg0) {
            return 1;
        } else if (class124.field1869 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILkda;II)V", line = 315)
    public final void method1880(int arg0, class353 arg1, int arg2, int arg3) {
        this.field5204.DrawPrimitive(method2208(arg1, 109), arg2, arg3);
        if (arg0 != 14) {
            this.field5189 = 54;
        }
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "(B)V", line = 332)
    public final void method1888(byte arg0) {
        if (arg0 != 39) {
            this.field5197 = null;
        }
        this.field5204.SetTransform(3, this.field5637);
    }

    @OriginalMember(owner = "client!tb", name = "ya", descriptor = "()V", line = 344)
    public final void method194() {
        this.method2369((byte) 71, true);
        this.field5204.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkda;I)I", line = 352)
    private static final int method2208(class353 arg0, int arg1) {
        if (class502.field7110 == arg0) {
            return 2;
        } else if (class240.field3751 == arg0) {
            return 3;
        } else if (class540.field7555 == arg0) {
            return 1;
        } else if (class80.field1355 == arg0) {
            return 4;
        } else if (class293.field4321 == arg0) {
            return 6;
        } else if (class98.field1542 == arg0) {
            return 5;
        } else {
            if (arg1 < 60) {
                method2207(null, (byte) -3);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "(Z)V", line = 386)
    public final void method1916(boolean arg0) {
        this.field5204.SetScissorRect(this.field5662 + this.field5649, this.field5696 + this.field5693, this.field5659, this.field5722);
        if (arg0) {
            this.field5200 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLpb;)V", line = 399)
    public final void method2209(byte arg0, class607 arg1) {
        this.method2215(42, arg1);
        if (!this.field5212[this.field5661]) {
            this.field5204.SetSamplerState(this.field5661, 1, 1);
            this.field5212[this.field5661] = true;
        }
        if (!this.field5192[this.field5661]) {
            this.field5204.SetSamplerState(this.field5661, 2, 1);
            this.field5192[this.field5661] = true;
        }
        int var3 = -36 % ((-arg0 - 2) / 51);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 420)
    public final void method1864(int arg0, Canvas arg1, Object arg2) {
        if (this.field5504 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field5204.EndScene();
                this.method2211(-2692);
                this.field5204.BeginScene();
            }
        }
        if (arg0 <= 61) {
            this.field5188 = -8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "(B)V", line = 446)
    public final void method1861(byte arg0) {
        this.field5204.SetRenderState(60, this.field5699);
        if (arg0 != -94) {
            this.method1893((byte) 18);
        }
    }

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "(I)V", line = 456)
    public final void method1897(int arg0) {
        if (class239.field3748 == this.field5720) {
            this.field5204.SetRenderState(19, 5);
            this.field5204.SetRenderState(20, 6);
        } else if (class58.field1106 == this.field5720) {
            this.field5204.SetRenderState(19, 2);
            this.field5204.SetRenderState(20, 2);
        } else if (class6.field57 == this.field5720) {
            this.field5204.SetRenderState(19, 9);
            this.field5204.SetRenderState(20, 2);
        }
        if (arg0 != 19171) {
            this.field5213 = 116;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(IZ)Lbca;", line = 486)
    public final class613 method1901(int arg0, boolean arg1) {
        return arg0 == -21710 ? new class137(this, arg1) : (class613) null;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(Z)V", line = 496)
    public final void method1911(boolean arg0) {
        if (!arg0 && this.field5207[this.field5661]) {
            this.field5207[this.field5661] = false;
            this.field5204.SetTexture(this.field5661, null);
            this.method1892((byte) -120);
            this.method1862(true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "(I)F", line = 513)
    public final float method1904(int arg0) {
        return arg0 == 0 ? -0.5F : -0.36575285F;
    }

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "()Lis;", line = 524)
    public final class463 method140() {
        D3DADAPTER_IDENTIFIER var1 = this.field5201.method2636(this.field5189, 0);
        return new class463(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZ[IIII)Loi;", line = 532)
    public final class65 method1869(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 6) {
            this.method1893((byte) -74);
        }
        return new class291(this, arg4, arg5, arg2, arg3, arg1, arg6);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 542)
    public final void method1914(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 != -126) {
            this.method157();
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(II)Lvca;", line = 551)
    public final class252 method1887(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field5191 = null;
        }
        if (arg1 == 3) {
            return new class404(this, this.field5563);
        } else if (arg1 == 4) {
            return new class551(this, this.field5563, this.field5451);
        } else if (arg1 == 8) {
            return new class501(this, this.field5563, this.field5451);
        } else {
            return super.method1887(0, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "()V", line = 593)
    public final void method183() {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Leca;Z)I", line = 596)
    private static final int method2210(class704 arg0, boolean arg1) {
        if (arg1) {
            return 70;
        } else if (class190.field2740 == arg0) {
            return 2;
        } else if (class153.field2209 == arg0) {
            return 4;
        } else if (class203.field2875 == arg0) {
            return 26;
        } else if (class413.field6010 == arg0) {
            return 7;
        } else if (class444.field6468 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BIIILlca;)Ljb;", line = 627)
    public final class456 method1894(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class597 arg5) {
        return arg0 == -11561 ? new class607(this, arg5, arg2, arg3, arg4, arg1) : (class456) null;
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "(B)V", line = 639)
    public final void method1892(byte arg0) {
        int var2 = this.field5207[this.field5661] ? method2210(this.field5708[this.field5661], false) : 1;
        int var3 = -12 % ((35 - arg0) / 51);
        this.field5204.SetTextureStageState(this.field5661, 4, var2);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(IIII)[I", line = 651)
    public final int[] method193(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field5204.method2646(0);
        IDirect3DSurface var7 = this.field5204.method2649(arg2, arg3, 21, 0, 0, true);
        if (class446.method2640(-96, this.field5204.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class446.method2640(-111, var7.LockRect(0, 0, arg2, arg3, 0, this.field5202))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field5202.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field5202.method2664(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field5202.method2664(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3496((byte) -80);
        var7.method3496((byte) -80);
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "()V", line = 689)
    public final void method213() {
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)V", line = 692)
    public final void method1902(boolean arg0, int arg1) {
        this.field5204.method2651(161, arg0);
        if (arg1 != 8) {
            this.field5212 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/jv;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lks;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lpu;I)V", line = 701)
    private class364(int arg0, int arg1, Canvas arg2, class624 arg3, IDirect3D arg4, IDirect3DDevice arg5, class402 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class209 arg9, class522 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field5193 = arg7;
        this.field5188 = arg1;
        this.field5203 = arg6;
        this.field5201 = arg4;
        this.field5189 = arg0;
        this.field5210 = arg8;
        this.field5204 = arg5;
        this.field5197 = arg3;
        this.field5200 = new class447(this.field5197);
        this.field5209 = new class447(this.field5197);
        this.field5199 = new class447(this.field5197);
        this.field5202 = new PixelBuffer(this.field5197);
        this.field5205 = new GeometryBuffer(this.field5197);
        new GeometryBuffer(this.field5197);
        this.field5709 = this.field5210.MaxSimultaneousTextures;
        this.field5196 = (this.field5210.TextureCaps & 0x10000) != 0;
        this.field5187 = (this.field5210.TextureCaps & 0x2) == 0;
        this.field5713 = (this.field5210.TextureCaps & 0x2000) != 0;
        this.field5208 = (this.field5210.TextureCaps & 0x4000) != 0;
        this.field5705 = this.field5210.MaxActiveLights > 0 ? this.field5210.MaxActiveLights : 8;
        this.field5701 = (this.field5210.TextureCaps & 0x800) != 0;
        this.field5694 = this.field5636 > 0 || this.field5201.CheckDeviceMultiSampleType(this.field5189, this.field5188, this.field5193.BackBufferFormat, true, 2) == 0;
        this.field5212 = new boolean[this.field5709];
        this.field5192 = new boolean[this.field5709];
        this.field5207 = new boolean[this.field5709];
        this.field5195 = new boolean[this.field5709];
        this.field5191 = new class267[this.field5709];
        this.field5206 = new int[this.field5709];
        this.field5204.BeginScene();
    }

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "(B)V", line = 742)
    public final void method1919(byte arg0) {
        if (arg0 != -87) {
            this.field5202 = null;
        }
        this.field5204.method2651(137, this.field5721 && !this.field5657);
    }

    @OriginalMember(owner = "client!tb", name = "DA", descriptor = "()I", line = 752)
    public final int method192() {
        return 0;
    }

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "(I)Z", line = 760)
    private final boolean method2211(int arg0) {
        int var2 = this.field5204.TestCooperativeLevel();
        if (arg0 != -2692) {
            return true;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class402 var3 = (class402) this.field5518;
            this.method2357(arg0 ^ 0xFFFFF57C);
            var3.method2453(0);
            this.field5193.BackBufferHeight = 0;
            this.field5193.BackBufferWidth = 0;
            if (method2216(this.field5636, (byte) -118, this.field5189, this.field5188, this.field5193, this.field5201)) {
                int var4 = this.field5204.Reset(this.field5193);
                if (class446.method2640(-89, var4)) {
                    var3.method2454(this.field5204.method2648(0), -96, this.field5204.method2652());
                    this.method2319(false);
                    this.method1907((byte) -65);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llca;Lig;Z)Z", line = 799)
    public final boolean method1867(class597 arg0, class218 arg1, boolean arg2) {
        if (arg2) {
            this.field5188 = -101;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class446.method2640(-34, this.field5201.method2635(this.field5189, var4)) && class446.method2640(109, this.field5201.CheckDeviceFormat(this.field5189, this.field5188, var4.Format, 0, 4, method2213((byte) -71, arg1, arg0)));
    }

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "()V", line = 810)
    public final void method203() throws class621 {
        this.field5204.EndScene();
        if (this.field5203.method2452(0)) {
            this.field5213 = 0;
            if (class446.method2641(this.field5203.method2451(true, 0), -89)) {
                this.method2211(-2692);
            }
        } else if ((++this.field5213) <= 50) {
            this.method2211(-2692);
        } else {
            throw new class621();
        }
        this.field5204.BeginScene();
    }

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "(I)V", line = 837)
    public final void method1910(int arg0) {
        this.field5204.method2651(14, this.field5700 && this.field5669);
        if (arg0 != 0) {
            this.method1867(null, null, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "(I)V", line = 850)
    public final void method1872(int arg0) {
        this.method1870(-69);
        this.method1873(-20019);
        if (arg0 != 0) {
            field5211 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkda;IIZLrn;II)V", line = 863)
    public final void method1874(class353 arg0, int arg1, int arg2, boolean arg3, class241 arg4, int arg5, int arg6) {
        this.field5204.SetIndices(((class427) arg4).field6278);
        if (arg3) {
            this.field5204.DrawIndexedPrimitive(method2208(arg0, 103), 0, arg2, arg5, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "(I)V", line = 882)
    public final void method1879(int arg0) {
        this.field5200.SetDirection(-this.field5635[0], -this.field5635[1], -this.field5635[2]);
        this.field5209.SetDirection(-this.field5687[0], -this.field5687[1], -this.field5687[2]);
        int var2 = 62 / ((arg0 + 55) / 43);
        this.field5198 = false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ldb;I)V", line = 893)
    public final void method2212(class291 arg0, int arg1) {
        this.method2215(24, arg0);
        if (this.field5212[this.field5661] != arg0.field4311) {
            this.field5204.SetSamplerState(this.field5661, 1, arg0.field4311 ? 1 : 3);
            this.field5212[this.field5661] = arg0.field4311;
        }
        if (arg0.field4314 != this.field5192[this.field5661]) {
            this.field5204.SetSamplerState(this.field5661, 2, arg0.field4314 ? 1 : 3);
            this.field5192[this.field5661] = arg0.field4314;
        }
        if (arg1 < 100) {
            this.field5201 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLig;Llca;)I", line = 918)
    public static final int method2213(byte arg0, class218 arg1, class597 arg2) {
        if (arg0 != -71) {
            return 113;
        }
        if (class218.field3050 == arg1) {
            if (class502.field7105 == arg2) {
                return 22;
            }
            if (class75.field1306 == arg2) {
                return 21;
            }
            if (class87.field1467 == arg2) {
                return 28;
            }
            if (class547.field7690 == arg2) {
                return 50;
            }
            if (class87.field1430 == arg2) {
                return 51;
            }
            if (class2.field11 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)V", line = 956)
    public final void method1918(int arg0, int arg1) {
        this.field5204.SetTextureStageState(this.field5661, 11, arg1);
        int var3 = 75 / ((arg0 - 76) / 36);
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "(Z)V", line = 967)
    public final void method1875(boolean arg0) {
        int var2;
        for (var2 = 0; var2 < this.field5710; var2++) {
            class498 var3 = this.field5726[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2878((byte) -111);
            float var6 = var3.method2876(1) / 255.0F;
            this.field5199.SetPosition((float) var3.method2883(126), (float) var3.method2877(-1), (float) var3.method2875(true));
            this.field5199.SetDiffuse((float) ((var5 & 0xFF4C3B) >> 16) * var6, (float) ((var5 & 0xFF07) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field5199.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2880(-15) * var3.method2880(-15)));
            this.field5199.SetRange((float) var3.method2880(-15));
            this.field5204.SetLight(var4, this.field5199);
            this.field5204.LightEnable(var4, true);
        }
        while (var2 < this.field5711) {
            this.field5204.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1875(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "(B)V", line = 1006)
    public final void method1917(byte arg0) {
        int var2 = 89 % ((arg0 - 76) / 32);
        this.field5204.method2651(15, this.field5671);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 1015)
    public final void method179(boolean arg0) {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lso;I)I", line = 1018)
    private static final int method2214(class433 arg0, int arg1) {
        if (arg1 != 0) {
            method2206(null, (byte) 106);
        }
        if (class578.field8150 == arg0) {
            return 1;
        } else if (class266.field4017 == arg0) {
            return 2;
        } else if (class487.field6924 == arg0) {
            return 3;
        } else if (class564.field7957 == arg0) {
            return 4;
        } else if (class693.field9736 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILig;Llca;IB)Loi;", line = 1049)
    public final class65 method1899(int arg0, class218 arg1, class597 arg2, int arg3, byte arg4) {
        return arg4 >= -124 ? (class65) null : new class291(this, arg2, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "(I)V", line = 1059)
    public final void method1882(int arg0) {
        if (this.field5725[this.field5661] == class84.field1384) {
            this.field5204.SetTextureStageState(this.field5661, 24, 0);
            this.field5206[this.field5661] = 0;
        } else {
            if (this.field5725[this.field5661] == class564.field7957) {
                this.field5204.SetTransform(this.field5661 + 16, this.field5679[this.field5661].method237(field5211, 10));
            } else {
                this.field5204.SetTransform(this.field5661 + 16, this.field5679[this.field5661].method253(field5211, 23534));
            }
            int var2 = method2214(this.field5725[this.field5661], 0);
            if (this.field5206[this.field5661] != var2) {
                this.field5204.SetTextureStageState(this.field5661, 24, var2);
                this.field5206[this.field5661] = var2;
            }
        }
        if (arg0 > -46) {
            this.method179(false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lpu;Ljava/lang/Integer;)Lr;", line = 1092)
    public static final class166 createToolkit(Canvas arg0, class209 arg1, class522 arg2, Integer arg3) {
        class364 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class624 var7 = new class624();
            IDirect3D var8 = IDirect3D.method2639(-2147483616, var7);
            D3DCAPS var9 = var8.method2637(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2216(arg3, (byte) -128, var5, var6, var10, var8)) {
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
                    var13 = var8.method2638(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class445 var17) {
                    var13 = var8.method2638(var5, var6, arg0, var11 | 0x20, var10);
                }
                class402 var15 = new class402(var13.method2648(0), var13.method2652());
                var4 = new class364(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2323((byte) -108);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method158();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([[IZIB)Lgp;", line = 1192)
    public final class45 method1906(int[][] arg0, boolean arg1, int arg2, byte arg3) {
        int var5 = -39 % ((arg3 - 28) / 45);
        return new class110(this, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lig;ZLlca;)Z", line = 1201)
    public final boolean method1895(class218 arg0, boolean arg1, class597 arg2) {
        if (!arg1) {
            this.method205(-2.5028625F, -0.36472866F, 0.6126768F);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class446.method2640(-103, this.field5201.method2635(this.field5189, var4)) && class446.method2640(-12, this.field5201.CheckDeviceFormat(this.field5189, this.field5188, var4.Format, 0, 3, method2213((byte) -71, arg0, arg2)));
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V", line = 1213)
    public final void method1893(byte arg0) {
        if (arg0 == -102) {
            this.field5204.method2651(174, this.field5757);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILrd;)V", line = 1224)
    public final void method1883(int arg0, class305 arg1) {
        if (arg0 >= -60) {
            method2213((byte) 77, null, null);
        }
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field5204.SetVertexDeclaration(var3.field4309);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(BZ)Lrn;", line = 1236)
    public final class241 method1863(byte arg0, boolean arg1) {
        if (arg0 < 100) {
            this.method192();
        }
        return new class427(this, class218.field3051, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "()V", line = 1245)
    public final void method150() {
    }

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "(I)V", line = 1248)
    public final void method1873(int arg0) {
        if (arg0 != -20019) {
            this.method179(false);
        }
        if (this.field5198) {
            return;
        }
        this.field5204.LightEnable(0, false);
        this.field5204.LightEnable(1, false);
        this.field5204.SetLight(0, this.field5200);
        this.field5204.SetLight(1, this.field5209);
        this.field5204.LightEnable(0, true);
        this.field5204.LightEnable(1, true);
        this.field5198 = true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILhba;)V", line = 1268)
    public final void method2215(int arg0, class10 arg1) {
        this.field5204.SetTexture(this.field5661, arg1.method55(26691));
        if (this.field5191[this.field5661] != arg1.field98) {
            int var3 = method2206(arg1.field98, (byte) -43);
            this.field5204.SetSamplerState(this.field5661, 6, var3);
            this.field5204.SetSamplerState(this.field5661, 5, var3);
            this.field5191[this.field5661] = arg1.field98;
            if (arg1.field97 != this.field5195[this.field5661]) {
                this.field5204.SetSamplerState(this.field5661, 7, arg1.field97 ? method2206(arg1.field98, (byte) -43) : 0);
                this.field5195[this.field5661] = arg1.field97;
            }
        } else if (this.field5195[this.field5661] != arg1.field97) {
            this.field5204.SetSamplerState(this.field5661, 7, arg1.field97 ? method2206(arg1.field98, (byte) -43) : 0);
            this.field5195[this.field5661] = arg1.field97;
        }
        if (!this.field5207[this.field5661]) {
            this.field5207[this.field5661] = true;
            this.method1892((byte) -23);
            this.method1862(true);
        }
        if (arg0 <= 17) {
            this.method1865(-88, -111, null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLkj;IIZ)V", line = 1320)
    public final void method1881(boolean arg0, class525 arg1, int arg2, int arg3, boolean arg4) {
        byte var7;
        if (arg2 == 1) {
            var7 = 3;
        } else if (arg2 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg3 != -4016) {
            this.field5201 = null;
        }
        if (arg0) {
            var8 |= 0x20;
        }
        if (arg4) {
            var8 |= 0x10;
        }
        this.field5204.SetTextureStageState(this.field5661, var7, method2207(arg1, (byte) -118) | var8);
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "(Z)V", line = 1362)
    public final void method1862(boolean arg0) {
        if (arg0) {
            int var2 = this.field5207[this.field5661] ? method2210(this.field5685[this.field5661], false) : 1;
            this.field5204.SetTextureStageState(this.field5661, 1, var2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(FFF)V", line = 1373)
    public final void method205(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1376)
    public final Object method1889(Canvas arg0, int arg1) {
        return arg1 == 0 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "(I)V", line = 1386)
    public final void method1885(int arg0) {
        this.field5200.SetAmbient(this.field5719 * this.field5650, this.field5719 * this.field5690, this.field5719 * this.field5717, 0.0F);
        this.field5198 = false;
        int var2 = 41 / ((36 - arg0) / 46);
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "(B)V", line = 1396)
    public final void method1903(byte arg0) {
        if (arg0 != 77) {
            this.method1880(-52, null, 39, 30);
        }
        this.field5204.method2651(27, this.field5663);
    }

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "(I)V", line = 1406)
    public final void method1908(int arg0) {
        this.field5204.method2651(7, this.field5730);
        if (arg0 != 6) {
            field5211 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Laf;)Lrd;", line = 1416)
    public final class305 method1866(int arg0, class399[] arg1) {
        if (arg0 >= -12) {
            this.field5193 = null;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(Z)V", line = 1426)
    public final void method1860(boolean arg0) {
        if (arg0) {
            this.method1910(-39);
        }
        this.field5644 = (this.field5680 - this.field5670);
        this.field5735 = this.field5644 - (float) this.field5651;
        if (this.field5735 < (float) this.field5724) {
            this.field5735 = this.field5724;
        }
        this.field5204.method2643(36, this.field5735);
        this.field5204.method2643(37, this.field5644);
        this.field5204.SetRenderState(34, this.field5718);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljba;Ljba;FLjba;)Ljba;", line = 1446)
    public final class363 method190(class363 arg0, class363 arg1, float arg2, class363 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V", line = 1452)
    public final void method176(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;)Z", line = 1457)
    private static final boolean method2216(int arg0, byte arg1, int arg2, int arg3, D3DPRESENT_PARAMETERS arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            int var9 = -88 % ((arg1 + 57) / 55);
            D3DDISPLAYMODE var10 = new D3DDISPLAYMODE();
            if (class446.method2641(arg5.method2635(arg2, var10), -42)) {
                return false;
            }
            label80: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var11 = 0; var11 < field5194.length; var11++) {
                        if (arg5.CheckDeviceType(arg2, arg3, var10.Format, field5194[var11], true) == 0 && arg5.CheckDeviceFormat(arg2, arg3, var10.Format, 1, 1, field5194[var11]) == 0 && (arg0 == 0 || arg5.CheckDeviceMultiSampleType(arg2, arg3, field5194[var11], true, var8) == 0)) {
                            for (int var12 = 0; var12 < field5190.length; var12++) {
                                if (arg5.CheckDeviceFormat(arg2, arg3, var10.Format, 2, 1, field5190[var12]) == 0 && arg5.CheckDepthStencilMatch(arg2, arg3, var10.Format, field5194[var11], field5190[var12]) == 0 && (arg0 == 0 || arg5.CheckDeviceMultiSampleType(arg2, arg3, field5190[var11], true, var8) == 0)) {
                                    var7 = field5194[var11];
                                    var6 = field5190[var12];
                                    break label80;
                                }
                            }
                        }
                    }
                }
                arg0--;
            }
            if (arg0 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg4.BackBufferFormat = var7;
            arg4.MultiSampleQuality = 0;
            arg4.MultiSampleType = var8;
            arg4.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()V", line = 1558)
    public final void method174() {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lf;Z)V", line = 1560)
    public final void method188(class702 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1564)
    public final void method198(Rectangle[] arg0, int arg1) throws class621 {
        this.method203();
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "()V", line = 1571)
    public final void method158() {
        this.field5197.method3490((byte) -84);
        super.method158();
    }

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "(I)V", line = 1579)
    public final void method1884(int arg0) {
        this.field5204.SetViewport(this.field5649, this.field5696, this.field5600, this.field5555, (float) arg0, 1.0F);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([FILlca;IIZII)Loi;", line = 1587)
    public final class65 method1891(float[] arg0, int arg1, class597 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg3 != 3401) {
            this.field5200 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 1599)
    public final void method1868(Canvas arg0, int arg1, Object arg2) {
        this.field5203 = (class402) arg2;
        if (arg1 != -25201) {
            this.field5191 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "()V", line = 1612)
    public final void method157() {
        IDirect3DEventQuery var1 = this.field5204.method2655();
        if (class446.method2640(119, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3496((byte) -80);
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "(Z)V", line = 1637)
    public final void method1877(boolean arg0) {
        if (!arg0) {
            this.field5204.method2651(28, this.field5639 && this.field5648 && this.field5651 >= 0);
        }
    }
}
