import jaclib.peer.class578;
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
import jagdx.class409;
import jagdx.class410;
import jagdx.class411;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class256 extends class388 {

    @OriginalMember(owner = "client!bv", name = "Mg", descriptor = "I")
    private int field3541 = 0;

    @OriginalMember(owner = "client!bv", name = "Fg", descriptor = "Z")
    private boolean field3534 = false;

    @OriginalMember(owner = "client!bv", name = "yg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3527;

    @OriginalMember(owner = "client!bv", name = "Dg", descriptor = "Lmf;")
    private class354 field3532;

    @OriginalMember(owner = "client!bv", name = "Gg", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!bv", name = "Ig", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3537;

    @OriginalMember(owner = "client!bv", name = "zg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3528;

    @OriginalMember(owner = "client!bv", name = "Kg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3539;

    @OriginalMember(owner = "client!bv", name = "Pg", descriptor = "Ljaclib/peer/fk;")
    public class578 field3544;

    @OriginalMember(owner = "client!bv", name = "Xg", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!bv", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class411 field3546;

    @OriginalMember(owner = "client!bv", name = "Yg", descriptor = "Ljagdx/D3DLIGHT;")
    private class411 field3553;

    @OriginalMember(owner = "client!bv", name = "Hg", descriptor = "Ljagdx/D3DLIGHT;")
    private class411 field3536;

    @OriginalMember(owner = "client!bv", name = "Ng", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3542;

    @OriginalMember(owner = "client!bv", name = "Lg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3540;

    @OriginalMember(owner = "client!bv", name = "Bg", descriptor = "Z")
    public boolean field3530;

    @OriginalMember(owner = "client!bv", name = "Cg", descriptor = "Z")
    public boolean field3531;

    @OriginalMember(owner = "client!bv", name = "Qg", descriptor = "Z")
    public boolean field3545;

    @OriginalMember(owner = "client!bv", name = "Ug", descriptor = "[I")
    private int[] field3549;

    @OriginalMember(owner = "client!bv", name = "Eg", descriptor = "[Lfj;")
    private class564[] field3533;

    @OriginalMember(owner = "client!bv", name = "Jg", descriptor = "[Z")
    private boolean[] field3538;

    @OriginalMember(owner = "client!bv", name = "Wg", descriptor = "[Z")
    private boolean[] field3551;

    @OriginalMember(owner = "client!bv", name = "Sg", descriptor = "[Z")
    private boolean[] field3547;

    @OriginalMember(owner = "client!bv", name = "Og", descriptor = "[Z")
    private boolean[] field3543;

    @OriginalMember(owner = "client!bv", name = "Ag", descriptor = "[I")
    private static int[] field3529 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!bv", name = "Tg", descriptor = "[F")
    private static float[] field3548 = new float[16];

    @OriginalMember(owner = "client!bv", name = "Vg", descriptor = "[I")
    private static int[] field3550 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(B)V")
    public final void method1587(byte arg0) {
        this.field3546.SetAmbient(this.field5469 * this.field5443, this.field5482 * this.field5469, this.field5479 * this.field5469, 1.0F);
        if (arg0 != 37) {
            this.method1281(null, null, 1.1252264F, null);
        }
        this.field3534 = false;
    }

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "(IIII)[I")
    public final int[] method1361(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3527.method2433(0);
        IDirect3DSurface var7 = this.field3527.method2441(arg2, arg3, 21, 0, 0, true);
        if (class410.method2428(this.field3527.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1), (byte) 74) && class410.method2428(var7.LockRect(0, 0, arg2, arg3, 0, this.field3542), (byte) -114)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3542.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field3542.method2448(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3542.method2448(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3306((byte) -74);
        var7.method3306((byte) 123);
        return var5;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZB)Luj;")
    public final class321 method1588(boolean arg0, byte arg1) {
        int var3 = 15 % ((81 - arg1) / 33);
        return new class527(this, class608.field8760, arg0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILfj;)I")
    private static final int method1589(int arg0, class564 arg1) {
        if (arg0 != 29303) {
            method1589(-38, null);
        }
        if (class241.field3384 == arg1) {
            return 2;
        } else if (class339.field4575 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "()V")
    public final void method1342() {
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BILvf;Z)V")
    public final void method1590(byte arg0, int arg1, class131 arg2, boolean arg3) {
        int var5 = 0;
        byte var7;
        if (arg1 == 1) {
            var7 = 6;
        } else if (arg1 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg3) {
            var5 |= 0x10;
        }
        this.field3527.SetTextureStageState(this.field5405, var7, var5 | method1639(arg2, (byte) -50));
        if (arg0 != -89) {
            this.field3535 = -99;
        }
    }

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "(I)V")
    public final void method1591(int arg0) {
        this.field3527.SetTransform(3, this.field5441);
        if (arg0 == 18204) {
            ;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
    public final void method1265() {
        this.method2275(-32491, true);
        this.field3527.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/fk;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lmf;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ln;Lan;I)V")
    private class256(int arg0, int arg1, Canvas arg2, class578 arg3, IDirect3D arg4, IDirect3DDevice arg5, class354 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class17 arg9, class21 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field3527 = arg5;
        this.field3532 = arg6;
        this.field3535 = arg1;
        this.field3537 = arg8;
        this.field3528 = arg4;
        this.field3539 = arg7;
        this.field3544 = arg3;
        this.field3552 = arg0;
        this.field3546 = new class411(this.field3544);
        this.field3553 = new class411(this.field3544);
        this.field3536 = new class411(this.field3544);
        this.field3542 = new PixelBuffer(this.field3544);
        this.field3540 = new GeometryBuffer(this.field3544);
        this.field3530 = (this.field3537.TextureCaps & 0x4000) != 0;
        this.field3531 = (this.field3537.TextureCaps & 0x2) == 0;
        this.field3545 = (this.field3537.TextureCaps & 0x10000) != 0;
        this.field5411 = (this.field3537.TextureCaps & 0x800) != 0;
        this.field5397 = (this.field3537.TextureCaps & 0x2000) != 0;
        this.field5392 = this.field3537.MaxActiveLights <= 0 ? 8 : this.field3537.MaxActiveLights;
        this.field5457 = this.field3537.MaxSimultaneousTextures;
        this.field5463 = this.field5425 > 0 || this.field3528.CheckDeviceMultiSampleType(this.field3552, this.field3535, this.field3539.BackBufferFormat, true, 2) == 0;
        this.field3549 = new int[this.field5457];
        this.field3533 = new class564[this.field5457];
        this.field3538 = new boolean[this.field5457];
        this.field3551 = new boolean[this.field5457];
        this.field3547 = new boolean[this.field5457];
        this.field3543 = new boolean[this.field5457];
        this.field3527.BeginScene();
        try {
            this.field3527.Clear(3, 0, 1.0F, 0);
            this.method1307();
            this.field3527.Clear(3, 0, 1.0F, 0);
        } catch (class589 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bv", name = "Z", descriptor = "(I)V")
    public final void method1274(int arg0) {
        this.field3527.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "(Z)V")
    public final void method1592(boolean arg0) {
        if (arg0) {
            createToolkit(null, null, null, null);
        }
        int var2 = this.field3551[this.field5405] ? method1602(7, this.field5436[this.field5405]) : 1;
        this.field3527.SetTextureStageState(this.field5405, 1, var2);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lsv;Lsv;FLsv;)Lsv;")
    public final class567 method1281(class567 arg0, class567 arg1, float arg2, class567 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "()Z")
    public final boolean method1328() {
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lmn;B)V")
    public final void method1593(class308 arg0, byte arg1) {
        int var3 = 117 % ((-arg1 - 71) / 35);
        this.method1605(true, arg0);
        if (!this.field3547[this.field5405]) {
            this.field3527.SetSamplerState(this.field5405, 1, 1);
            this.field3547[this.field5405] = true;
        }
        if (!this.field3543[this.field5405]) {
            this.field3527.SetSamplerState(this.field5405, 2, 1);
            this.field3543[this.field5405] = true;
        }
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "(II)V")
    public final void method1594(int arg0, int arg1) {
        this.field3527.SetTextureStageState(this.field5405, 11, arg1);
        if (arg0 != -22276) {
            this.field3542 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method1595(Object arg0, Canvas arg1, int arg2) {
        if (arg2 != 9) {
            field3548 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "YA", descriptor = "()I")
    public final int method1339() {
        return 0;
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "(Z)F")
    public final float method1596(boolean arg0) {
        return arg0 ? -0.5F : 0.5233682F;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
    public final void method1283(boolean arg0) {
    }

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "(I)V")
    public final void method1597(int arg0) {
        if (!this.field3534) {
            this.field3527.SetLight(0, this.field3546);
            this.field3527.SetLight(1, this.field3553);
            this.field3534 = true;
        }
        if (arg0 > -23) {
            this.method1603(true, 62, -48, null, 51, 28, null, -9);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method1598(int arg0, Canvas arg1) {
        if (arg0 != 16) {
            this.method1588(true, (byte) 54);
        }
        return null;
    }

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "(Z)V")
    public final void method1599(boolean arg0) {
        for (int var2 = 0; var2 < this.field5457; var2++) {
            this.field3527.SetSamplerState(var2, 7, 0);
            this.field3527.SetSamplerState(var2, 6, 2);
            this.field3527.SetSamplerState(var2, 5, 2);
            this.field3527.SetSamplerState(var2, 1, 1);
            this.field3527.SetSamplerState(var2, 2, 1);
            this.field3533[var2] = class241.field3384;
            this.field3547[var2] = this.field3543[var2] = true;
            this.field3538[var2] = false;
            this.field3549[var2] = 0;
        }
        this.field3527.SetTextureStageState(0, 6, 1);
        this.field3527.SetRenderState(9, 2);
        this.field3527.SetRenderState(23, 4);
        this.field3527.SetRenderState(25, 5);
        this.field3527.SetRenderState(24, 0);
        this.field3527.SetRenderState(22, 2);
        this.field3527.SetRenderState(147, 1);
        this.field3527.SetRenderState(145, 1);
        this.field3527.method2436(38, 0.95F);
        this.field3527.SetRenderState(140, 3);
        this.field3553.SetType(3);
        this.field3546.SetType(3);
        this.field3536.SetType(1);
        this.field3534 = false;
        super.method1599(arg0);
    }

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "(I)V")
    public final void method1600(int arg0) {
        if (arg0 == 4) {
            this.field3546.SetDiffuse(this.field5475 * this.field5443, this.field5482 * this.field5475, this.field5479 * this.field5475, 1.0F);
            this.field3553.SetDiffuse(-this.field5456 * this.field5443, -this.field5456 * this.field5482, -this.field5456 * this.field5479, 1.0F);
            this.field3534 = false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ln;Lan;Ljava/lang/Integer;)Lqa;")
    public static final class207 createToolkit(Canvas arg0, class17 arg1, class21 arg2, Integer arg3) {
        class256 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class578 var7 = new class578();
            IDirect3D var8 = IDirect3D.method2425(-2147483616, var7);
            D3DADAPTER_IDENTIFIER var9 = var8.method2423(var5, 0);
            if (var9.VendorID == 32902) {
                throw new RuntimeException("");
            }
            D3DCAPS var10 = var8.method2426(var5, var6);
            if ((var10.RasterCaps & 0x1000000) == 0) {
                throw new RuntimeException("");
            } else if (var10.MaxSimultaneousTextures < 2) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x8) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x40) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x200) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x2000000) == 0) {
                throw new RuntimeException("");
            } else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var10.DestBlendCaps & 0x20 & var10.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var10.SrcBlendCaps & 0x2 & var10.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var10.MaxActiveLights > 0 && var10.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var10.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var11 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1627(var6, (byte) -114, var11, arg3, var8, var5)) {
                    throw new RuntimeException("");
                }
                var11.Windowed = true;
                var11.EnableAutoDepthStencil = true;
                var11.PresentationInterval = Integer.MIN_VALUE;
                int var12 = 2;
                if ((var10.DevCaps & 0x100000) != 0) {
                    var12 |= 0x10;
                }
                Object var13 = null;
                IDirect3DDevice var14;
                try {
                    var14 = var8.method2424(var5, var6, arg0, var12 | 0x40, var11);
                } catch (class409 var18) {
                    var14 = var8.method2424(var5, var6, arg0, var12 | 0x20, var11);
                }
                class354 var16 = new class354(var14.method2432(0), var14.method2442());
                var4 = new class256(var5, var6, arg0, var7, var8, var14, var16, var11, var10, arg1, arg2, arg3);
                var4.method2277(4);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var19) {
            if (var4 != null) {
                var4.method1276();
            }
            throw var19;
        }
    }

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "(I)V")
    public final void method1601(int arg0) {
        this.field3527.method2444(15, this.field5428);
        if (arg0 >= -40) {
            this.method1587((byte) -121);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILhf;)I")
    private static final int method1602(int arg0, class333 arg1) {
        if (arg0 != 7) {
            field3548 = null;
        }
        if (class137.field2155 == arg1) {
            return 2;
        } else if (class167.field2417 == arg1) {
            return 4;
        } else if (class583.field8102 == arg1) {
            return 26;
        } else if (class205.field2890 == arg1) {
            return 7;
        } else if (class337.field4494 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFF)V")
    public final void method1279(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()V")
    public final void method1267() {
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZIILdk;II[BI)Lwn;")
    public final class617 method1603(boolean arg0, int arg1, int arg2, class435 arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        return arg1 == 0 ? new class281(this, arg3, arg5, arg2, arg0, arg6, arg7, arg4) : (class617) null;
    }

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "(Z)V")
    public final void method1604(boolean arg0) {
        if (!arg0) {
            this.method1342();
        }
        this.field3527.method2444(174, this.field5511);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLor;)V")
    public final void method1605(boolean arg0, class550 arg1) {
        this.field3527.SetTexture(this.field5405, arg1.method1481(87));
        if (!arg0) {
            method1622(null, (byte) 71);
        }
        if (this.field3533[this.field5405] != arg1.field7605) {
            int var3 = method1589(29303, arg1.field7605);
            this.field3527.SetSamplerState(this.field5405, 6, var3);
            this.field3527.SetSamplerState(this.field5405, 5, var3);
            this.field3533[this.field5405] = arg1.field7605;
            if (arg1.field7607 != this.field3538[this.field5405]) {
                this.field3527.SetSamplerState(this.field5405, 7, arg1.field7607 ? method1589(29303, arg1.field7605) : 0);
                this.field3538[this.field5405] = arg1.field7607;
            }
        } else if (arg1.field7607 != this.field3538[this.field5405]) {
            this.field3527.SetSamplerState(this.field5405, 7, arg1.field7607 ? method1589(29303, arg1.field7605) : 0);
            this.field3538[this.field5405] = arg1.field7607;
        }
        if (!this.field3551[this.field5405]) {
            this.field3551[this.field5405] = true;
            this.method1645(0);
            this.method1592(false);
        }
    }

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "()Z")
    public final boolean method1338() {
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIIZI[II)Lwn;")
    public final class617 method1606(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6) {
        if (arg0 < 16) {
            this.field3528 = null;
        }
        return new class281(this, arg6, arg2, arg3, arg5, arg1, arg4);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Llu;IZ)V")
    public final void method1607(class609 arg0, int arg1, boolean arg2) {
        class396 var4 = (class396) arg0;
        this.field3527.SetStreamSource(arg1, var4.field5629, 0, var4.method2371(16078));
        if (arg2) {
            this.field3538 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(ZI)V")
    public final void method1608(boolean arg0, int arg1) {
        if (arg1 == 16777215) {
            this.field3527.method2444(161, arg0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ltq;I)V")
    public final void method1609(class538 arg0, int arg1) {
        int var3 = 68 / ((-arg1 - 46) / 52);
        dxVertexLayout var4 = (dxVertexLayout) arg0;
        this.field3527.SetVertexDeclaration(var4.field3754);
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "()V")
    public final void method1276() {
        this.field3544.method3307(-21036);
        super.method1276();
    }

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "(I)V")
    public final void method1610(int arg0) {
        if (arg0 != -12617) {
            field3550 = null;
        }
        this.field3527.LightEnable(0, this.field5478);
        this.field3527.LightEnable(1, this.field5478);
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "(B)V")
    public final void method1611(byte arg0) {
        if (arg0 != 19) {
            this.field3535 = -9;
        }
        if (this.field5487[this.field5405] == class353.field4778) {
            this.field3527.SetTextureStageState(this.field5405, 24, 0);
            this.field3549[this.field5405] = 0;
            return;
        }
        if (this.field5487[this.field5405] == class184.field2590) {
            this.field3527.SetTransform(this.field5405 + 16, this.field5477[this.field5405].method3173(true, field3548));
        } else {
            this.field3527.SetTransform(this.field5405 + 16, this.field5477[this.field5405].method3163(field3548, arg0 + -19));
        }
        int var2 = method1622(this.field5487[this.field5405], (byte) 62);
        if (this.field3549[this.field5405] != var2) {
            this.field3527.SetTextureStageState(this.field5405, 24, var2);
            this.field3549[this.field5405] = var2;
        }
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "()V")
    public final void method1307() throws class589 {
        this.field3527.EndScene();
        if (this.field3532.method2124(0)) {
            this.field3541 = 0;
            if (class410.method2427(115, this.field3532.method2122(0, 0))) {
                this.method1623((byte) 12);
            }
        } else if (++this.field3541 <= 50) {
            this.method1623((byte) 12);
        } else {
            throw new class589();
        }
        this.field3527.BeginScene();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILdk;I[FIIIZ)Lwn;")
    public final class617 method1612(int arg0, class435 arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg4 < 60) {
            this.method1607(null, -17, true);
        }
        return null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([[IIZZ)Ljg;")
    public final class284 method1613(int[][] arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            this.field3545 = true;
        }
        return new class237(this, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "(I)V")
    public final void method1614(int arg0) {
        if (arg0 != 1) {
            this.field3535 = -99;
        }
        if (this.field5431.method984((byte) 84)) {
            this.field5385.method3173(true, field3548);
        } else {
            field3548[10] = 1.0F;
            field3548[2] = 0.0F;
            field3548[7] = 0.0F;
            field3548[1] = 0.0F;
            field3548[0] = 1.0F;
            field3548[11] = 0.0F;
            field3548[6] = 0.0F;
            field3548[5] = 1.0F;
            field3548[13] = 0.0F;
            field3548[14] = 0.0F;
            field3548[8] = 0.0F;
            field3548[9] = 0.0F;
            field3548[12] = 0.0F;
            field3548[3] = 0.0F;
            field3548[4] = 0.0F;
            field3548[15] = 1.0F;
        }
        this.field3527.SetTransform(2, field3548);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZILuj;IIILio;)V")
    public final void method1615(boolean arg0, int arg1, class321 arg2, int arg3, int arg4, int arg5, class370 arg6) {
        this.field3527.SetIndices(((class527) arg2).field7402);
        this.field3527.DrawIndexedPrimitive(method1617(arg6, arg0), 0, arg3, arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)V")
    public final void method1616(byte arg0) {
        this.field3527.method2444(28, this.field5468 && this.field5395 && this.field5446 | this.field5398 >= 0);
        if (arg0 > -92) {
            this.method1604(false);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lio;Z)I")
    private static final int method1617(class370 arg0, boolean arg1) {
        if (class495.field6928 == arg0) {
            return 2;
        } else if (class111.field1718 == arg0) {
            return 3;
        } else if (class182.field2576 == arg0) {
            return 1;
        } else if (class481.field6784 == arg0) {
            return 4;
        } else if (class509.field7106 == arg0) {
            return 6;
        } else if (class474.field6664 == arg0) {
            return 5;
        } else {
            if (arg1) {
                field3550 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "(Z)V")
    public final void method1618(boolean arg0) {
        if (!arg0) {
            field3529 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)V")
    public final void method1619(byte arg0) {
        this.field3527.method2444(7, this.field5452);
        if (arg0 <= 31) {
            field3529 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "(B)V")
    public final void method1620(byte arg0) {
        if (arg0 == -125) {
            this.field3527.SetRenderState(60, this.field5467);
        }
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "(I)V")
    public final void method1621(int arg0) {
        this.field3546.SetDirection(-this.field5470[0], -this.field5470[1], -this.field5470[2]);
        this.field3553.SetDirection(-this.field5402[0], -this.field5402[1], -this.field5402[2]);
        this.field3534 = false;
        if (arg0 != -15077) {
            this.field3528 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lvaa;B)I")
    private static final int method1622(class399 arg0, byte arg1) {
        if (arg1 < 22) {
            method1622(null, (byte) -31);
        }
        if (class376.field5056 == arg0) {
            return 1;
        } else if (class510.field7141 == arg0) {
            return 2;
        } else if (class561.field7774 == arg0) {
            return 3;
        } else if (class184.field2590 == arg0) {
            return 4;
        } else if (class378.field5080 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "(B)Z")
    private final boolean method1623(byte arg0) {
        int var2 = this.field3527.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class354 var3 = (class354) this.field5224;
            this.method2318(2);
            var3.method2123(0);
            this.field3539.BackBufferWidth = 0;
            this.field3539.BackBufferHeight = 0;
            if (method1627(this.field3535, (byte) -109, this.field3539, this.field5425, this.field3528, this.field3552)) {
                int var4 = this.field3527.Reset(this.field3539);
                if (class410.method2428(var4, (byte) 99)) {
                    var3.method2125((byte) 55, this.field3527.method2432(0), this.field3527.method2442());
                    this.method2290(true);
                    this.method1599(true);
                    return true;
                }
            }
        }
        if (arg0 != 12) {
            this.method1634(114, -39, -16, null, 21, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "U", descriptor = "(I)V")
    public final void method1624(int arg0) {
        if (arg0 <= 17) {
            return;
        }
        if (class528.field7406 == this.field5437) {
            this.field3527.SetRenderState(19, 5);
            this.field3527.SetRenderState(20, 6);
        } else if (class166.field2388 == this.field5437) {
            this.field3527.SetRenderState(19, 2);
            this.field3527.SetRenderState(20, 2);
        } else if (class132.field2114 == this.field5437) {
            this.field3527.SetRenderState(19, 9);
            this.field3527.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lge;Ldk;B)I")
    public static final int method1625(class608 arg0, class435 arg1, byte arg2) {
        int var3 = 39 / ((-arg2 - 13) / 57);
        if (class608.field8759 == arg0) {
            if (class351.field4715 == arg1) {
                return 22;
            }
            if (class49.field958 == arg1) {
                return 21;
            }
            if (class519.field7310 == arg1) {
                return 28;
            }
            if (class571.field7865 == arg1) {
                return 50;
            }
            if (class75.field1196 == arg1) {
                return 51;
            }
            if (class25.field453 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "(I)V")
    public final void method1626(int arg0) {
        if (arg0 == 9295) {
            this.field3527.SetViewport(this.field5422, this.field5403, this.field5302, this.field5331, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBLjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;I)Z")
    private static final boolean method1627(int arg0, byte arg1, D3DPRESENT_PARAMETERS arg2, int arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        D3DDISPLAYMODE var9 = arg4.method2422(arg5);
        label72: while (arg3 >= 0) {
            if (arg3 != 1) {
                var8 = arg3;
                for (int var10 = 0; var10 < field3529.length; var10++) {
                    if (arg4.CheckDeviceType(arg5, arg0, var9.Format, field3529[var10], true) == 0 && arg4.CheckDeviceFormat(arg5, arg0, var9.Format, 1, 1, field3529[var10]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg0, field3529[var10], true, var8) == 0)) {
                        for (int var11 = 0; var11 < field3550.length; var11++) {
                            if (arg4.CheckDeviceFormat(arg5, arg0, var9.Format, 2, 1, field3550[var11]) == 0 && arg4.CheckDepthStencilMatch(arg5, arg0, var9.Format, field3529[var10], field3550[var11]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg0, field3550[var10], true, var8) == 0)) {
                                var7 = field3529[var10];
                                var6 = field3550[var11];
                                break label72;
                            }
                        }
                    }
                }
            }
            arg3--;
        }
        if (arg3 < 0 || var7 == 0 || var6 == 0) {
            return false;
        }
        arg2.MultiSampleType = var8;
        arg2.MultiSampleQuality = 0;
        arg2.AutoDepthStencilFormat = var6;
        arg2.BackBufferFormat = var7;
        if (arg1 >= -72) {
            method1639(null, (byte) 95);
        }
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "(B)V")
    public final void method1628(byte arg0) {
        if (arg0 != -76) {
            this.field3538 = null;
        }
        this.field3527.method2444(14, this.field5389 && this.field5471);
    }

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "()V")
    public final void method1299() {
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1327(Rectangle[] arg0, int arg1) throws class589 {
        this.method1307();
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "()V")
    public final void method1289() {
        IDirect3DEventQuery var1 = this.field3527.method2440();
        if (!class410.method2428(var1.Issue(), (byte) 15)) {
            return;
        }
        while (true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
                break;
            }
            Thread.yield();
        }
    }

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)V")
    public final void method1629(int arg0) {
        if (arg0 == 10972) {
            this.field3527.method2444(27, this.field5481);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1630(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 1) {
            this.method1613((int[][]) ((int[][]) null), -5, true, true);
        }
        this.field3532 = (class354) arg2;
    }

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)V")
    public final void method1631(int arg0) {
        if (arg0 != -19904) {
            this.method1361(2, 105, 102, -128);
        }
        if (this.field5446) {
            this.field3527.method2436(36, 0.0F);
            this.field3527.method2436(37, 1.0F);
            this.field3527.SetRenderState(34, this.field5449);
            return;
        }
        this.field5451 = (this.field5454 - this.field5423);
        this.field5474 = this.field5451 - (float) this.field5398;
        if ((float) this.field5434 > this.field5474) {
            this.field5474 = this.field5434;
        }
        this.field3527.method2436(36, this.field5474);
        this.field3527.method2436(37, this.field5451);
        this.field3527.SetRenderState(34, this.field5460);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILdk;Lge;)Z")
    public final boolean method1632(int arg0, class435 arg1, class608 arg2) {
        if (arg0 == 0) {
            D3DDISPLAYMODE var4 = this.field3528.method2422(this.field3552);
            return class410.method2428(this.field3528.CheckDeviceFormat(this.field3552, this.field3535, var4.Format, 0, 3, method1625(arg2, arg1, (byte) 114)), (byte) 95);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "(I)V")
    public final void method1633(int arg0) {
        if (this.field3551[this.field5405]) {
            this.field3551[this.field5405] = false;
            this.field3527.SetTexture(this.field5405, null);
            this.method1645(0);
            this.method1592(false);
        }
        if (arg0 != -23189) {
            this.method1637((byte) -90);
        }
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)V")
    public final synchronized void method1362(int arg0) {
        this.field3544.method3311(77);
        super.method1362(arg0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILdk;I[B)Luda;")
    public final class383 method1634(int arg0, int arg1, int arg2, class435 arg3, int arg4, byte[] arg5) {
        int var7 = 16 % ((16 - arg2) / 44);
        return new class308(this, arg3, arg1, arg0, arg4, arg5);
    }

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "(I)V")
    public final void method1635(int arg0) {
        if (this.field5374) {
            field3548[8] = 0.0F;
            field3548[13] = 0.0F;
            field3548[2] = 0.0F;
            field3548[1] = 0.0F;
            field3548[7] = 0.0F;
            field3548[0] = 1.0F;
            field3548[15] = 1.0F;
            field3548[4] = 0.0F;
            field3548[11] = 0.0F;
            field3548[12] = 0.0F;
            field3548[5] = 1.0F;
            field3548[9] = 0.0F;
            field3548[14] = 0.0F;
            field3548[6] = 0.0F;
            field3548[10] = 1.0F;
            field3548[3] = 0.0F;
        } else {
            this.field5375.method3173(true, field3548);
        }
        this.field3527.SetTransform(256, field3548);
        if (arg0 > -8) {
            field3548 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLdk;Lge;)Z")
    public final boolean method1636(byte arg0, class435 arg1, class608 arg2) {
        int var4 = -80 % ((arg0 - 72) / 49);
        D3DDISPLAYMODE var5 = this.field3528.method2422(this.field3552);
        return class410.method2428(this.field3528.CheckDeviceFormat(this.field3552, this.field3535, var5.Format, 0, 4, method1625(arg2, arg1, (byte) 56)), (byte) -72);
    }

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "(B)V")
    public final void method1637(byte arg0) {
        this.field3527.SetScissorRect(this.field5432 + this.field5422, this.field5410 + this.field5403, this.field5419, this.field5458);
        if (arg0 > -112) {
            this.method1595(null, null, -42);
        }
    }

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "()Lla;")
    public final class384 method1317() {
        D3DADAPTER_IDENTIFIER var1 = this.field3528.method2423(this.field3552, 0);
        return new class384(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIILio;)V")
    public final void method1638(byte arg0, int arg1, int arg2, class370 arg3) {
        this.field3527.DrawPrimitive(method1617(arg3, false), arg1, arg2);
        if (arg0 != 76) {
            this.method1619((byte) -32);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lvf;B)I")
    private static final int method1639(class131 arg0, byte arg1) {
        int var2 = -89 / ((-arg1 - 10) / 39);
        if (class583.field8185 == arg0) {
            return 2;
        } else if (class453.field6402 == arg0) {
            return 0;
        } else if (class459.field6466 == arg0) {
            return 1;
        } else if (class610.field8770 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "(B)V")
    public final void method1640(byte arg0) {
        this.field3527.method2444(137, this.field5438 && !this.field5442);
        if (arg0 != -77) {
            this.method1289();
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZILvf;I)V")
    public final void method1641(boolean arg0, boolean arg1, int arg2, class131 arg3, int arg4) {
        byte var7;
        if (arg2 == 1) {
            var7 = 3;
        } else if (arg2 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = arg4;
        if (arg0) {
            var8 = arg4 | 0x20;
        }
        if (arg1) {
            var8 |= 0x10;
        }
        this.field3527.SetTextureStageState(this.field5405, var7, var8 | method1639(arg3, (byte) -81));
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
    public final void method1642(Canvas arg0, Object arg1, byte arg2) {
        if (this.field5215 == arg0) {
            this.field3527.EndScene();
            this.method1623((byte) 12);
            this.field3527.BeginScene();
        }
        if (arg2 >= -6) {
            this.field3527 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lds;Z)Ltq;")
    public final class538 method1643(class14[] arg0, boolean arg1) {
        if (arg1) {
            this.field3543 = null;
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BZ)Llu;")
    public final class609 method1644(byte arg0, boolean arg1) {
        if (arg0 != 115) {
            field3550 = null;
        }
        return new class396(this, arg1);
    }

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "(I)V")
    public final void method1645(int arg0) {
        int var2 = this.field3551[this.field5405] ? method1602(7, this.field5412[this.field5405]) : 1;
        if (arg0 != 0) {
            this.method1607(null, -61, true);
        }
        this.field3527.SetTextureStageState(this.field5405, 4, var2);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLon;)V")
    public final void method1646(boolean arg0, class281 arg1) {
        this.method1605(arg0, arg1);
        if (this.field3547[this.field5405] != arg1.field3891) {
            this.field3527.SetSamplerState(this.field5405, 1, arg1.field3891 ? 1 : 3);
            this.field3547[this.field5405] = arg1.field3891;
        }
        if (!arg0) {
            this.method1637((byte) -90);
        }
        if (this.field3543[this.field5405] != arg1.field3893) {
            this.field3527.SetSamplerState(this.field5405, 2, arg1.field3893 ? 1 : 3);
            this.field3543[this.field5405] = arg1.field3893;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lvc;I)V")
    public final void method1647(class264 arg0, int arg1) {
        int var3 = 0;
        if (arg1 < 63) {
            return;
        }
        if (class65.field1105 == arg0) {
            var3 = 65536;
        } else if (class406.field5773 == arg0) {
            var3 = 131072;
        } else if (class525.field7383 == arg0) {
            var3 = 196608;
        }
        this.field3527.SetTextureStageState(this.field5405, 11, var3 | this.field5405);
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(II)Lcj;")
    public final class595 method1648(int arg0, int arg1) {
        if (arg0 != 0) {
            return (class595) null;
        } else if (arg1 == 3) {
            return new class238(this, this.field5315);
        } else if (arg1 == 4) {
            return new class243(this, this.field5315, this.field5349);
        } else {
            return super.method1648(0, arg1);
        }
    }

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "(I)V")
    public final void method1649(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field5488; var2++) {
            class223 var3 = this.field5400[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1430(true);
            float var6 = var3.method1435(0) / 255.0F;
            this.field3536.SetPosition((float) var3.method1434(7), (float) var3.method1431(arg0 + 108), (float) var3.method1429(arg0 + 4329));
            this.field3536.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3536.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1433(4294) * var3.method1433(4294)));
            this.field3536.SetRange((float) var3.method1433(4294));
            this.field3527.SetLight(var4, this.field3536);
            this.field3527.LightEnable(var4, true);
        }
        while (this.field5472 > var2) {
            this.field3527.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1649(arg0);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lge;Ldk;BII)Lwn;")
    public final class617 method1650(class608 arg0, class435 arg1, byte arg2, int arg3, int arg4) {
        return arg2 == -26 ? new class281(this, arg1, arg0, arg4, arg3) : (class617) null;
    }
}
