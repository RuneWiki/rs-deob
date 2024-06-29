import jaclib.peer.class621;
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
import jagdx.class433;
import jagdx.class434;
import jagdx.class435;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class343 extends class651 {

    @OriginalMember(owner = "client!hb", name = "Dg", descriptor = "I")
    private int field4590 = 0;

    @OriginalMember(owner = "client!hb", name = "Rg", descriptor = "Z")
    private boolean field4604 = false;

    @OriginalMember(owner = "client!hb", name = "Qg", descriptor = "Ljaclib/peer/ow;")
    public class621 field4603;

    @OriginalMember(owner = "client!hb", name = "Jg", descriptor = "I")
    private int field4596;

    @OriginalMember(owner = "client!hb", name = "Yg", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!hb", name = "Ag", descriptor = "Lgu;")
    private class127 field4587;

    @OriginalMember(owner = "client!hb", name = "Zg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field4612;

    @OriginalMember(owner = "client!hb", name = "Mg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field4599;

    @OriginalMember(owner = "client!hb", name = "Gg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field4593;

    @OriginalMember(owner = "client!hb", name = "Wg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field4609;

    @OriginalMember(owner = "client!hb", name = "Tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class434 field4606;

    @OriginalMember(owner = "client!hb", name = "Fg", descriptor = "Ljagdx/D3DLIGHT;")
    private class434 field4592;

    @OriginalMember(owner = "client!hb", name = "Cg", descriptor = "Ljagdx/D3DLIGHT;")
    private class434 field4589;

    @OriginalMember(owner = "client!hb", name = "Hg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field4594;

    @OriginalMember(owner = "client!hb", name = "Ig", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field4595;

    @OriginalMember(owner = "client!hb", name = "zg", descriptor = "Z")
    public boolean field4586;

    @OriginalMember(owner = "client!hb", name = "Vg", descriptor = "Z")
    public boolean field4608;

    @OriginalMember(owner = "client!hb", name = "Pg", descriptor = "Z")
    public boolean field4602;

    @OriginalMember(owner = "client!hb", name = "Sg", descriptor = "[Z")
    private boolean[] field4605;

    @OriginalMember(owner = "client!hb", name = "Kg", descriptor = "[Lng;")
    private class219[] field4597;

    @OriginalMember(owner = "client!hb", name = "Bg", descriptor = "[Z")
    private boolean[] field4588;

    @OriginalMember(owner = "client!hb", name = "Lg", descriptor = "[Z")
    private boolean[] field4598;

    @OriginalMember(owner = "client!hb", name = "Eg", descriptor = "[I")
    private int[] field4591;

    @OriginalMember(owner = "client!hb", name = "Ng", descriptor = "[Z")
    private boolean[] field4600;

    @OriginalMember(owner = "client!hb", name = "Ug", descriptor = "[I")
    private static int[] field4607 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!hb", name = "Og", descriptor = "[I")
    private static int[] field4601 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!hb", name = "Xg", descriptor = "[F")
    private static float[] field4610 = new float[16];

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "(I)V", line = 4)
    public final void method1989(int arg0) {
        if (arg0 < 82) {
            this.method1142();
        }
        this.field4612.method2449(27, this.field9211);
    }

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "(I)V", line = 14)
    public final void method1990(int arg0) {
        if (arg0 != -1) {
            this.field4611 = -88;
        }
        if (class177.field2496 == this.field9273) {
            this.field4612.SetRenderState(19, 5);
            this.field4612.SetRenderState(20, 6);
        } else if (class225.field2929 == this.field9273) {
            this.field4612.SetRenderState(19, 2);
            this.field4612.SetRenderState(20, 2);
        } else if (class409.field5392 == this.field9273) {
            this.field4612.SetRenderState(19, 9);
            this.field4612.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLed;B)V", line = 46)
    public final void method1991(int arg0, boolean arg1, class116 arg2, byte arg3) {
        if (arg3 >= -58) {
            this.field4609 = null;
        }
        byte var6;
        if (arg0 == 1) {
            var6 = 6;
        } else if (arg0 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg1) {
            var7 |= 0x10;
        }
        this.field4612.SetTextureStageState(this.field9253, var6, var7 | method1997(arg2, (byte) -78));
    }

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "(I)V", line = 89)
    public final void method1992(int arg0) {
        if (arg0 != -6840) {
            this.method2012(-58, -81, null, 44);
        }
        float var2 = this.field9202 ? this.field9244 : 0.0F;
        float var3 = this.field9202 ? -this.field9238 : 0.0F;
        this.field4606.SetDiffuse(this.field9183 * var2, this.field9263 * var2, this.field9254 * var2, 0.0F);
        this.field4592.SetDiffuse(this.field9183 * var3, this.field9263 * var3, this.field9254 * var3, 0.0F);
        this.field4604 = false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 106)
    public final Object method1993(Canvas arg0, int arg1) {
        int var3 = 95 / ((47 - arg1) / 43);
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "()V", line = 113)
    public final void method1061() {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lum;I)V", line = 118)
    public final void method1994(class109 arg0, int arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field4612.SetVertexDeclaration(var3.field3670);
        if (arg1 != 3) {
            this.method1098();
        }
    }

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "(Z)V", line = 131)
    public final void method1995(boolean arg0) {
        this.method1992(-6840);
        if (arg0) {
            this.field4594 = null;
        }
        this.method2035((byte) -93);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)Lwr;", line = 143)
    public final class697 method1996(boolean arg0, byte arg1) {
        int var3 = 77 / ((57 - arg1) / 54);
        return new class456(this, arg0);
    }

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "()V", line = 151)
    public final void method1050() {
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 153)
    public final void method1093(boolean arg0) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Led;B)I", line = 157)
    private static final int method1997(class116 arg0, byte arg1) {
        int var2 = -124 % ((5 - arg1) / 45);
        if (class630.field8719 == arg0) {
            return 2;
        } else if (class502.field6912 == arg0) {
            return 0;
        } else if (class533.field7324 == arg0) {
            return 1;
        } else if (class137.field1869 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "(I)V", line = 181)
    public final void method1998(int arg0) {
        if (arg0 <= -41) {
            this.field4612.method2449(137, this.field9231 && !this.field9203);
        }
    }

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "(B)V", line = 192)
    public final void method1999(byte arg0) {
        if (arg0 != -44) {
            this.method1998(-18);
        }
        this.field4612.method2449(174, this.field9298);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V", line = 201)
    public final void method1140(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(II)V", line = 204)
    public final void method2000(int arg0, int arg1) {
        this.field4612.SetTextureStageState(this.field9253, 11, arg0);
        if (arg1 != 0) {
            this.method2000(-54, -72);
        }
    }

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "(I)V", line = 214)
    public final void method2001(int arg0) {
        if (arg0 > -119) {
            this.method2017((byte) 13);
        }
        if (this.field9246[this.field9253] == class118.field1507) {
            this.field4612.SetTextureStageState(this.field9253, 24, 0);
            this.field4591[this.field9253] = 0;
            return;
        }
        if (this.field9246[this.field9253] == class254.field3330) {
            this.field4612.SetTransform(this.field9253 + 16, this.field9272[this.field9253].method868(-115, field4610));
        } else {
            this.field4612.SetTransform(this.field9253 + 16, this.field9272[this.field9253].method863(field4610, 1));
        }
        int var2 = method2048(4, this.field9246[this.field9253]);
        if (this.field4591[this.field9253] != var2) {
            this.field4612.SetTextureStageState(this.field9253, 24, var2);
            this.field4591[this.field9253] = var2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjagdx/D3DPRESENT_PARAMETERS;IIBLjagdx/IDirect3D;)Z", line = 247)
    private static final boolean method2002(int arg0, D3DPRESENT_PARAMETERS arg1, int arg2, int arg3, byte arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        if (arg4 > -75) {
            field4601 = null;
        }
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class435.method2448(true, arg5.method2442(arg0, var9))) {
                return false;
            }
            label82: while (arg3 >= 0) {
                if (arg3 != 1) {
                    var8 = arg3;
                    for (int var10 = 0; var10 < field4607.length; var10++) {
                        if (arg5.CheckDeviceType(arg0, arg2, var9.Format, field4607[var10], true) == 0 && arg5.CheckDeviceFormat(arg0, arg2, var9.Format, 1, 1, field4607[var10]) == 0 && (arg3 == 0 || arg5.CheckDeviceMultiSampleType(arg0, arg2, field4607[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field4601.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg0, arg2, var9.Format, 2, 1, field4601[var11]) == 0 && arg5.CheckDepthStencilMatch(arg0, arg2, var9.Format, field4607[var10], field4601[var11]) == 0 && (arg3 == 0 || arg5.CheckDeviceMultiSampleType(arg0, arg2, field4601[var10], true, var8) == 0)) {
                                    var6 = field4601[var11];
                                    var7 = field4607[var10];
                                    break label82;
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
            arg1.MultiSampleType = var8;
            arg1.BackBufferFormat = var7;
            arg1.MultiSampleQuality = 0;
            arg1.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII[BLsk;)Ldea;", line = 351)
    public final class443 method2003(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class452 arg5) {
        return arg1 == 1 ? new class531(this, arg5, arg2, arg3, arg0, arg4) : (class443) null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLsk;Lvea;II)Lgn;", line = 362)
    public final class691 method2004(byte arg0, class452 arg1, class404 arg2, int arg3, int arg4) {
        return arg0 < 59 ? (class691) null : new class359(this, arg1, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILng;)I", line = 372)
    private static final int method2005(int arg0, class219 arg1) {
        if (arg0 != -3894) {
            method2024(null, (byte) -124);
        }
        if (class266.field3443 == arg1) {
            return 2;
        } else if (class695.field9800 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 389)
    public final void method2006(Object arg0, Canvas arg1, byte arg2) {
        if (arg2 < 31 || this.field9116 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field4612.EndScene();
            this.method2010(-124);
            this.field4612.BeginScene();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsk;IZIIBI[F)Lgn;", line = 414)
    public final class691 method2007(class452 arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, float[] arg7) {
        return arg5 >= -106 ? (class691) null : null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ow;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lgu;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lga;I)V", line = 423)
    private class343(int arg0, int arg1, Canvas arg2, class621 arg3, IDirect3D arg4, IDirect3DDevice arg5, class127 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class522 arg9, class332 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field4603 = arg3;
        this.field4596 = arg1;
        this.field4611 = arg0;
        this.field4587 = arg6;
        this.field4612 = arg5;
        this.field4599 = arg7;
        this.field4593 = arg4;
        this.field4609 = arg8;
        this.field4606 = new class434(this.field4603);
        this.field4592 = new class434(this.field4603);
        this.field4589 = new class434(this.field4603);
        this.field4594 = new PixelBuffer(this.field4603);
        this.field4595 = new GeometryBuffer(this.field4603);
        new GeometryBuffer(this.field4603);
        this.field9217 = this.field4609.MaxSimultaneousTextures;
        this.field9205 = (this.field4609.TextureCaps & 0x800) != 0;
        this.field4586 = (this.field4609.TextureCaps & 0x4000) != 0;
        this.field4608 = (this.field4609.TextureCaps & 0x10000) != 0;
        this.field4602 = (this.field4609.TextureCaps & 0x2) == 0;
        this.field9248 = (this.field4609.TextureCaps & 0x2000) != 0;
        this.field9219 = this.field4609.MaxActiveLights <= 0 ? 8 : this.field4609.MaxActiveLights;
        this.field9204 = this.field9194 > 0 || this.field4593.CheckDeviceMultiSampleType(this.field4611, this.field4596, this.field4599.BackBufferFormat, true, 2) == 0;
        this.field4605 = new boolean[this.field9217];
        this.field4597 = new class219[this.field9217];
        this.field4588 = new boolean[this.field9217];
        this.field4598 = new boolean[this.field9217];
        this.field4591 = new int[this.field9217];
        this.field4600 = new boolean[this.field9217];
        this.field4612.BeginScene();
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lsk;Lvea;I)I", line = 465)
    public static final int method2008(class452 arg0, class404 arg1, int arg2) {
        if (arg2 != 28) {
            field4610 = null;
        }
        if (class404.field5338 == arg1) {
            if (class568.field7733 == arg0) {
                return 22;
            }
            if (class480.field6686 == arg0) {
                return 21;
            }
            if (class635.field8783 == arg0) {
                return 28;
            }
            if (class86.field1050 == arg0) {
                return 50;
            }
            if (class508.field7012 == arg0) {
                return 51;
            }
            if (class353.field4712 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "()Z", line = 502)
    public final boolean method1117() {
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIZ[[I)Ljn;", line = 510)
    public final class530 method2009(byte arg0, int arg1, boolean arg2, int[][] arg3) {
        if (arg0 < 38) {
            this.field4593 = null;
        }
        return new class70(this, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "(I)Z", line = 521)
    private final boolean method2010(int arg0) {
        int var2 = this.field4612.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class127 var3 = (class127) this.field9141;
            this.method3687((byte) 62);
            var3.method750(118);
            this.field4599.BackBufferWidth = 0;
            this.field4599.BackBufferHeight = 0;
            if (method2002(this.field4611, this.field4599, this.field4596, this.field9194, (byte) -92, this.field4593)) {
                int var4 = this.field4612.Reset(this.field4599);
                if (class435.method2447(-1, var4)) {
                    var3.method751((byte) 62, this.field4612.method2455(), this.field4612.method2454(0));
                    this.method3691(8);
                    this.method2049(0);
                    return true;
                }
            }
        }
        int var5 = 106 / ((arg0 + 43) / 52);
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILed;IZZ)V", line = 572)
    public final void method2011(int arg0, class116 arg1, int arg2, boolean arg3, boolean arg4) {
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg4) {
            var8 |= 0x20;
        }
        if (arg3) {
            var8 |= 0x10;
        }
        this.field4612.SetTextureStageState(this.field9253, var7, var8 | method1997(arg1, (byte) 71));
        if (arg2 != 12080) {
            this.method2038((byte) -116);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjb;I)V", line = 611)
    public final void method2012(int arg0, int arg1, class498 arg2, int arg3) {
        this.field4612.DrawPrimitive(method2024(arg2, (byte) 120), arg3, arg0);
        if (arg1 != 255) {
            this.field4609 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(Z)V", line = 626)
    public final void method2013(boolean arg0) {
        if (!arg0) {
            method2002(-94, null, 108, 112, (byte) 88, null);
        }
        this.field4612.method2449(7, this.field9197);
    }

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "(I)V", line = 636)
    public final void method2014(int arg0) {
        if (arg0 != 0) {
            this.field4604 = false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 645)
    public final void method1056(Rectangle[] arg0, int arg1) throws class56 {
        this.method1151();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[Lqp;)Lum;", line = 652)
    public final class109 method2015(byte arg0, class636[] arg1) {
        if (arg0 != -85) {
            this.field4594 = null;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "ja", descriptor = "(I)V", line = 662)
    public final void method1146(int arg0) {
        this.field4612.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "(B)F", line = 670)
    public final float method2016(byte arg0) {
        int var2 = 15 / ((arg0 + 23) / 63);
        return -0.5F;
    }

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "()Z", line = 678)
    public final boolean method1098() {
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "(B)V", line = 687)
    public final void method2017(byte arg0) {
        if (this.field9235.method3075(-1)) {
            this.field9173.method868(-87, field4610);
        } else {
            field4610[4] = 0.0F;
            field4610[11] = 0.0F;
            field4610[7] = 0.0F;
            field4610[9] = 0.0F;
            field4610[8] = 0.0F;
            field4610[10] = 1.0F;
            field4610[5] = 1.0F;
            field4610[6] = 0.0F;
            field4610[3] = 0.0F;
            field4610[14] = 0.0F;
            field4610[0] = 1.0F;
            field4610[2] = 0.0F;
            field4610[12] = 0.0F;
            field4610[15] = 1.0F;
            field4610[13] = 0.0F;
            field4610[1] = 0.0F;
        }
        this.field4612.SetTransform(2, field4610);
        if (arg0 != -53) {
            this.field4609 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "()V", line = 722)
    public final void method1150() {
    }

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "(I)V", line = 725)
    public final void method2018(int arg0) {
        this.field4612.method2449(14, this.field9268 && this.field9265);
        if (arg0 != 1) {
            this.field4611 = 101;
        }
    }

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "()Laa;", line = 736)
    public final class102 method1141() {
        D3DADAPTER_IDENTIFIER var1 = this.field4593.method2445(this.field4611, 0);
        return new class102(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!hb", name = "ya", descriptor = "()V", line = 744)
    public final void method1147() {
        this.method3628(true, (byte) 125);
        this.field4612.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(II)Lft;", line = 753)
    public final class555 method2019(int arg0, int arg1) {
        if (arg1 != 6) {
            this.method2015((byte) -53, null);
        }
        if (arg0 == 3) {
            return new class20(this, this.field9128);
        } else if (arg0 == 4) {
            return new class397(this, this.field9128, this.field9066);
        } else if (arg0 == 8) {
            return new class318(this, this.field9128, this.field9066);
        } else {
            return super.method2019(arg0, 6);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILwr;)V", line = 799)
    public final void method2020(int arg0, int arg1, class697 arg2) {
        class456 var4 = (class456) arg2;
        this.field4612.SetStreamSource(arg1, var4.field6002, 0, var4.method2565(-101));
        int var5 = -32 % ((45 - arg0) / 55);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(FFF)V", line = 809)
    public final void method1079(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "(I)V", line = 817)
    public final void method2021(int arg0) {
        if (this.field9164) {
            field4610[13] = 0.0F;
            field4610[10] = 1.0F;
            field4610[8] = 0.0F;
            field4610[6] = 0.0F;
            field4610[5] = 1.0F;
            field4610[1] = 0.0F;
            field4610[2] = 0.0F;
            field4610[11] = 0.0F;
            field4610[9] = 0.0F;
            field4610[7] = 0.0F;
            field4610[4] = 0.0F;
            field4610[14] = 0.0F;
            field4610[15] = 1.0F;
            field4610[0] = 1.0F;
            field4610[12] = 0.0F;
            field4610[3] = 0.0F;
        } else {
            this.field9166.method868(-92, field4610);
        }
        if (arg0 != 1) {
            field4610 = null;
        }
        this.field4612.SetTransform(256, field4610);
    }

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "(I)V", line = 854)
    public final void method2022(int arg0) {
        this.field4606.SetAmbient(this.field9223 * this.field9183, this.field9263 * this.field9223, this.field9254 * this.field9223, (float) arg0);
        this.field4604 = false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLvw;)V", line = 862)
    public final void method2023(byte arg0, class531 arg1) {
        this.method2033(98, arg1);
        if (arg0 < 92) {
            return;
        }
        if (!this.field4605[this.field9253]) {
            this.field4612.SetSamplerState(this.field9253, 1, 1);
            this.field4605[this.field9253] = true;
        }
        if (!this.field4600[this.field9253]) {
            this.field4612.SetSamplerState(this.field9253, 2, 1);
            this.field4600[this.field9253] = true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "()V", line = 887)
    public final void method1092() {
        IDirect3DEventQuery var1 = this.field4612.method2459();
        if (class435.method2447(-1, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3454((byte) 125);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljb;B)I", line = 911)
    private static final int method2024(class498 arg0, byte arg1) {
        int var2 = 9 / ((69 - arg1) / 40);
        if (class498.field6848 == arg0) {
            return 2;
        } else if (class365.field4817 == arg0) {
            return 3;
        } else if (class153.field2164 == arg0) {
            return 1;
        } else if (class694.field9783 == arg0) {
            return 4;
        } else if (class67.field826 == arg0) {
            return 6;
        } else if (class616.field8530 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "(I)V", line = 942)
    public final void method2025(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            this.field4589 = null;
        }
        this.field4612.SetRenderState(60, this.field9229);
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(IIII)[I", line = 955)
    public final int[] method1068(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field4612.method2461(0);
        IDirect3DSurface var7 = this.field4612.method2456(arg2, arg3, 21, 0, 0, true);
        if (class435.method2447(-1, this.field4612.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class435.method2447(-1, var7.LockRect(0, 0, arg2, arg3, 0, this.field4594))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field4594.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field4594.method2439(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field4594.method2439(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3454((byte) 127);
        var7.method3454((byte) 125);
        return var5;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IZ)V", line = 994)
    public final void method2026(int arg0, boolean arg1) {
        if (arg0 == -30817) {
            this.field4612.method2449(161, arg1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)V", line = 1005)
    public final void method2027(boolean arg0) {
        this.field4606.SetDirection(-this.field9239[0], -this.field9239[1], -this.field9239[2]);
        this.field4592.SetDirection(-this.field9266[0], -this.field9266[1], -this.field9266[2]);
        this.field4604 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILsk;I[BZI)Lgn;", line = 1014)
    public final class691 method2028(int arg0, int arg1, int arg2, class452 arg3, int arg4, byte[] arg5, boolean arg6, int arg7) {
        if (arg4 <= 121) {
            this.field4589 = null;
        }
        return new class359(this, arg3, arg7, arg0, arg6, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!hb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lga;Ljava/lang/Integer;)Lr;", line = 1025)
    public static final class562 createToolkit(Canvas arg0, class522 arg1, class332 arg2, Integer arg3) {
        class343 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class621 var7 = new class621();
            IDirect3D var8 = IDirect3D.method2444(-2147483616, var7);
            D3DCAPS var9 = var8.method2443(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2002(var5, var10, var6, arg3, (byte) -86, var8)) {
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
                    var13 = var8.method2446(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class433 var17) {
                    var13 = var8.method2446(var5, var6, arg0, var11 | 0x20, var10);
                }
                class127 var15 = new class127(var13.method2454(0), var13.method2455());
                var4 = new class343(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3654(-13);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method1142();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "(B)V", line = 1123)
    public final void method2029(byte arg0) {
        if (arg0 != 103) {
            this.method1146(51);
        }
        this.field4612.SetViewport(this.field9247, this.field9184, this.field8997, this.field9117, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "(B)V", line = 1134)
    public final void method2030(byte arg0) {
        this.field4612.SetScissorRect(this.field9247 + this.field9212, this.field9250 + this.field9184, this.field9256, this.field9240);
        if (arg0 != -80) {
            this.field4594 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "(I)V", line = 1145)
    public final void method2031(int arg0) {
        if (arg0 == 0) {
            this.field4612.method2449(28, this.field9181 && this.field9201 && this.field9260 >= 0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "(I)V", line = 1159)
    public final void method2032(int arg0) {
        this.field4612.SetTransform(3, this.field9230);
        if (arg0 != -25465) {
            this.method1146(-106);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILke;)V", line = 1175)
    public final void method2033(int arg0, class483 arg1) {
        int var3 = 17 / ((arg0 - 6) / 35);
        this.field4612.SetTexture(this.field9253, arg1.method388(-18414));
        if (this.field4597[this.field9253] != arg1.field6728) {
            int var4 = method2005(-3894, arg1.field6728);
            this.field4612.SetSamplerState(this.field9253, 6, var4);
            this.field4612.SetSamplerState(this.field9253, 5, var4);
            this.field4597[this.field9253] = arg1.field6728;
            if (this.field4598[this.field9253] != arg1.field6724) {
                this.field4612.SetSamplerState(this.field9253, 7, arg1.field6724 ? method2005(-3894, arg1.field6728) : 0);
                this.field4598[this.field9253] = arg1.field6724;
            }
        } else if (this.field4598[this.field9253] != arg1.field6724) {
            this.field4612.SetSamplerState(this.field9253, 7, arg1.field6724 ? method2005(-3894, arg1.field6728) : 0);
            this.field4598[this.field9253] = arg1.field6724;
        }
        if (!this.field4588[this.field9253]) {
            this.field4588[this.field9253] = true;
            this.method2042(true);
            this.method2039(126);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lit;Lit;FLit;)Lit;", line = 1213)
    public final class513 method1154(class513 arg0, class513 arg1, float arg2, class513 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "()V", line = 1219)
    public final void method1114() {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLdn;)V", line = 1222)
    public final void method2034(byte arg0, class276 arg1) {
        if (arg0 != -17) {
            return;
        }
        int var3 = 0;
        if (class446.field5908 == arg1) {
            var3 = 65536;
        } else if (class293.field3902 == arg1) {
            var3 = 131072;
        } else if (class112.field1431 == arg1) {
            var3 = 196608;
        }
        this.field4612.SetTextureStageState(this.field9253, 11, this.field9253 | var3);
    }

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "(B)V", line = 1246)
    public final void method2035(byte arg0) {
        if (arg0 != -93 || this.field4604) {
            return;
        }
        this.field4612.LightEnable(0, false);
        this.field4612.LightEnable(1, false);
        this.field4612.SetLight(0, this.field4606);
        this.field4612.SetLight(1, this.field4592);
        this.field4612.LightEnable(0, true);
        this.field4612.LightEnable(1, true);
        this.field4604 = true;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V", line = 1266)
    public final synchronized void method1063(int arg0) {
        this.field4603.method3449(-115);
        super.method1063(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILom;)V", line = 1275)
    public final void method2036(int arg0, class359 arg1) {
        if (arg0 != 1) {
            this.method2019(-89, 112);
        }
        this.method2033(107, arg1);
        if (arg1.field4771 != this.field4605[this.field9253]) {
            this.field4612.SetSamplerState(this.field9253, 1, arg1.field4771 ? 1 : 3);
            this.field4605[this.field9253] = arg1.field4771;
        }
        if (arg1.field4770 != this.field4600[this.field9253]) {
            this.field4612.SetSamplerState(this.field9253, 2, arg1.field4770 ? 1 : 3);
            this.field4600[this.field9253] = arg1.field4770;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lvea;Lsk;B)Z", line = 1300)
    public final boolean method2037(class404 arg0, class452 arg1, byte arg2) {
        if (arg2 != 51) {
            this.field4592 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class435.method2447(-1, this.field4593.method2442(this.field4611, var4)) && class435.method2447(arg2 - 52, this.field4593.CheckDeviceFormat(this.field4611, this.field4596, var4.Format, 0, 3, method2008(arg1, arg0, 28)));
    }

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "(B)V", line = 1312)
    public final void method2038(byte arg0) {
        this.field9195 = (this.field9224 - this.field9180);
        this.field9251 = (float) (-this.field9260) + this.field9195;
        if (this.field9251 < (float) this.field9215) {
            this.field9251 = this.field9215;
        }
        this.field4612.method2453(36, this.field9251);
        this.field4612.method2453(37, this.field9195);
        this.field4612.SetRenderState(34, this.field9269);
        if (arg0 <= 61) {
            this.method2046(9, true);
        }
    }

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "(I)V", line = 1330)
    public final void method2039(int arg0) {
        if (arg0 < 116) {
            this.field4591 = null;
        }
        int var2 = this.field4588[this.field9253] ? method2051((byte) 67, this.field9264[this.field9253]) : 1;
        this.field4612.SetTextureStageState(this.field9253, 1, var2);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lf;Z)V", line = 1341)
    public final void method1107(class532 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!hb", name = "DA", descriptor = "()I", line = 1344)
    public final int method1119() {
        return 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILkga;IILjb;)V", line = 1352)
    public final void method2040(int arg0, int arg1, int arg2, class556 arg3, int arg4, int arg5, class498 arg6) {
        this.field4612.SetIndices(((class373) arg3).field4955);
        this.field4612.DrawIndexedPrimitive(method2024(arg6, (byte) 8), 0, arg2, arg5, arg0, arg4);
        int var8 = 116 % ((-arg1 - 38) / 39);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 1371)
    public final void method2041(Canvas arg0, int arg1, Object arg2) {
        if (arg1 > -64) {
            this.method2042(true);
        }
        this.field4587 = (class127) arg2;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)V", line = 1382)
    public final void method2042(boolean arg0) {
        if (!arg0) {
            this.field4598 = null;
        }
        int var2 = this.field4588[this.field9253] ? method2051((byte) 70, this.field9242[this.field9253]) : 1;
        this.field4612.SetTextureStageState(this.field9253, 4, var2);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsk;Lvea;I)Z", line = 1394)
    public final boolean method2043(class452 arg0, class404 arg1, int arg2) {
        if (arg2 != -16449) {
            this.field4609 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class435.method2447(-1, this.field4593.method2442(this.field4611, var4)) && class435.method2447(arg2 ^ 0x4040, this.field4593.CheckDeviceFormat(this.field4611, this.field4596, var4.Format, 0, 4, method2008(arg0, arg1, 28)));
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "()V", line = 1405)
    public final void method1151() throws class56 {
        this.field4612.EndScene();
        if (this.field4587.method748((byte) 57)) {
            this.field4590 = 0;
            if (class435.method2448(true, this.field4587.method749(0, 0))) {
                this.method2010(-102);
            }
        } else if ((++this.field4590) <= 50) {
            this.method2010(-115);
        } else {
            throw new class56();
        }
        this.field4612.BeginScene();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIZII)Lgn;", line = 1436)
    public final class691 method2044(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 != -219) {
            this.field4599 = null;
        }
        return new class359(this, arg6, arg3, arg4, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)V", line = 1451)
    public final void method2045(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field9177; var2++) {
            class392 var3 = this.field9232[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2263(0);
            float var6 = var3.method2259(false) / 255.0F;
            this.field4589.SetPosition((float) var3.method2258((byte) -122), (float) var3.method2261((byte) 37), (float) var3.method2257(-17895));
            this.field4589.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field4589.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2260(2) * var3.method2260(2)));
            this.field4589.SetRange((float) var3.method2260(2));
            this.field4612.SetLight(var4, this.field4589);
            this.field4612.LightEnable(var4, true);
        }
        if (arg0 < 107) {
            this.method1141();
        }
        while (this.field9182 > var2) {
            this.field4612.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2045(119);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(IZ)Lkga;", line = 1489)
    public final class556 method2046(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.method2014(-15);
        }
        return new class373(this, class404.field5339, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "(I)V", line = 1500)
    public final void method2047(int arg0) {
        int var2 = 3 % ((-arg0 - 64) / 43);
        this.field4612.method2449(15, this.field9275);
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "()V", line = 1509)
    public final void method1142() {
        this.field4603.method3448((byte) 105);
        super.method1142();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILsj;)I", line = 1518)
    private static final int method2048(int arg0, class666 arg1) {
        if (arg0 != 4) {
            createToolkit(null, null, null, null);
        }
        if (class288.field3801 == arg1) {
            return 1;
        } else if (class213.field2816 == arg1) {
            return 2;
        } else if (class166.field2383 == arg1) {
            return 3;
        } else if (class254.field3330 == arg1) {
            return 4;
        } else if (class191.field2649 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "(I)V", line = 1552)
    public final void method2049(int arg0) {
        for (int var2 = 0; var2 < this.field9217; var2++) {
            this.field4612.SetSamplerState(var2, 7, 0);
            this.field4612.SetSamplerState(var2, 6, 2);
            this.field4612.SetSamplerState(var2, 5, 2);
            this.field4612.SetSamplerState(var2, 1, 1);
            this.field4612.SetSamplerState(var2, 2, 1);
            this.field4597[var2] = class266.field3443;
            this.field4605[var2] = this.field4600[var2] = true;
            this.field4598[var2] = false;
            this.field4591[var2] = 0;
        }
        this.field4612.SetTextureStageState(0, 6, 1);
        this.field4612.SetRenderState(9, 2);
        this.field4612.SetRenderState(23, 4);
        this.field4612.SetRenderState(25, 5);
        this.field4612.SetRenderState(24, arg0);
        this.field4612.SetRenderState(22, 2);
        this.field4612.SetRenderState(147, 1);
        this.field4612.SetRenderState(145, 1);
        this.field4612.method2453(38, 0.95F);
        this.field4612.SetRenderState(140, 3);
        this.field4606.SetType(3);
        this.field4592.SetType(3);
        this.field4589.SetType(1);
        this.field4604 = false;
        super.method2049(0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1588)
    public final void method2050(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 != -12) {
            this.method2014(82);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLfv;)I", line = 1598)
    private static final int method2051(byte arg0, class690 arg1) {
        if (class298.field3941 == arg1) {
            return 2;
        } else if (class274.field3642 == arg1) {
            return 4;
        } else if (class305.field4076 == arg1) {
            return 26;
        } else if (class297.field3927 == arg1) {
            return 7;
        } else if (class100.field1201 == arg1) {
            return 10;
        } else {
            int var2 = -40 % ((arg0 + 28) / 63);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "(B)V", line = 1627)
    public final void method2052(byte arg0) {
        if (this.field4588[this.field9253]) {
            this.field4588[this.field9253] = false;
            this.field4612.SetTexture(this.field9253, null);
            this.method2042(true);
            this.method2039(117);
        }
        if (arg0 < 103) {
            this.method2042(false);
        }
    }
}
