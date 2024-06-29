import jaclib.peer.class246;
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
import jagdx.class684;
import jagdx.class685;
import jagdx.class686;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class130 extends class312 {

    @OriginalMember(owner = "client!ui", name = "Wg", descriptor = "Z")
    private boolean field1663 = false;

    @OriginalMember(owner = "client!ui", name = "ah", descriptor = "I")
    private int field1667 = 0;

    @OriginalMember(owner = "client!ui", name = "Lg", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!ui", name = "Gg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field1647;

    @OriginalMember(owner = "client!ui", name = "Kg", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!ui", name = "Vg", descriptor = "Lre;")
    private class504 field1662;

    @OriginalMember(owner = "client!ui", name = "ch", descriptor = "Ljaclib/peer/vo;")
    public class246 field1669;

    @OriginalMember(owner = "client!ui", name = "Qg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field1657;

    @OriginalMember(owner = "client!ui", name = "Mg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field1653;

    @OriginalMember(owner = "client!ui", name = "Og", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field1655;

    @OriginalMember(owner = "client!ui", name = "Jg", descriptor = "Ljagdx/D3DLIGHT;")
    private class685 field1650;

    @OriginalMember(owner = "client!ui", name = "Hg", descriptor = "Ljagdx/D3DLIGHT;")
    private class685 field1648;

    @OriginalMember(owner = "client!ui", name = "Sg", descriptor = "Ljagdx/D3DLIGHT;")
    private class685 field1659;

    @OriginalMember(owner = "client!ui", name = "Ig", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field1649;

    @OriginalMember(owner = "client!ui", name = "Fg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field1646;

    @OriginalMember(owner = "client!ui", name = "Eg", descriptor = "Z")
    public boolean field1645;

    @OriginalMember(owner = "client!ui", name = "dh", descriptor = "Z")
    public boolean field1670;

    @OriginalMember(owner = "client!ui", name = "Dg", descriptor = "Z")
    public boolean field1644;

    @OriginalMember(owner = "client!ui", name = "Xg", descriptor = "[Z")
    private boolean[] field1664;

    @OriginalMember(owner = "client!ui", name = "Zg", descriptor = "[Ltd;")
    private class691[] field1666;

    @OriginalMember(owner = "client!ui", name = "Pg", descriptor = "[I")
    private int[] field1656;

    @OriginalMember(owner = "client!ui", name = "Tg", descriptor = "[Z")
    private boolean[] field1660;

    @OriginalMember(owner = "client!ui", name = "Ug", descriptor = "[Z")
    private boolean[] field1661;

    @OriginalMember(owner = "client!ui", name = "Yg", descriptor = "[Z")
    private boolean[] field1665;

    @OriginalMember(owner = "client!ui", name = "Ng", descriptor = "[I")
    private static int[] field1654 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ui", name = "Rg", descriptor = "[I")
    private static int[] field1658 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ui", name = "bh", descriptor = "[F")
    private static float[] field1668 = new float[16];

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(Z)V", line = 3)
    public final void method778(boolean arg0) {
    }

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "(I)V", line = 6)
    public final void method779(int arg0) {
        if (arg0 < 2) {
            this.method849((byte) 84, null);
        }
        if (this.field1661[this.field4425]) {
            this.field1661[this.field4425] = false;
            this.field1657.SetTexture(this.field4425, null);
            this.method837(-113);
            this.method840(true);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILlaa;)V", line = 24)
    public final void method780(int arg0, class181 arg1) {
        this.method836(arg1, 7);
        if (!this.field1664[this.field4425]) {
            this.field1657.SetSamplerState(this.field4425, 1, 1);
            this.field1664[this.field4425] = true;
        }
        if (!this.field1665[this.field4425]) {
            this.field1657.SetSamplerState(this.field4425, 2, 1);
            this.field1665[this.field4425] = true;
        }
        int var3 = -115 / ((arg0 + 2) / 43);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLtk;)I", line = 48)
    private static final int method781(boolean arg0, class73 arg1) {
        if (class322.field4722 == arg1) {
            return 2;
        } else if (class275.field3735 == arg1) {
            return 0;
        } else if (class668.field9495 == arg1) {
            return 1;
        } else if (class577.field7974 == arg1) {
            return 3;
        } else {
            if (arg0) {
                method860(null, -116);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Lpq;Ljava/lang/Integer;)Loa;", line = 74)
    public static final class689 createToolkit(Canvas arg0, class479 arg1, class159 arg2, Integer arg3) {
        class130 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class246 var7 = new class246();
            IDirect3D var8 = IDirect3D.method3801(-2147483616, var7);
            D3DCAPS var9 = var8.method3800(var5, var6);
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
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method782(var5, var10, arg3, var6, var8, -110)) {
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
                    var13 = var8.method3803(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class684 var17) {
                    var13 = var8.method3803(var5, var6, arg0, var11 | 0x20, var10);
                }
                class504 var15 = new class504(var13.method3786(0), var13.method3782());
                var4 = new class130(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1915(false);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method843();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjagdx/D3DPRESENT_PARAMETERS;IILjagdx/IDirect3D;I)Z", line = 178)
    private static final boolean method782(int arg0, D3DPRESENT_PARAMETERS arg1, int arg2, int arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            if (arg5 > -20) {
                method792(null, (byte) -99);
            }
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class686.method3805((byte) 112, arg4.method3799(arg0, var9))) {
                return false;
            }
            label84: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field1654.length; var10++) {
                        if (arg4.CheckDeviceType(arg0, arg3, var9.Format, field1654[var10], true) == 0 && arg4.CheckDeviceFormat(arg0, arg3, var9.Format, 1, 1, field1654[var10]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg3, field1654[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field1658.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg0, arg3, var9.Format, 2, 1, field1658[var11]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg3, var9.Format, field1654[var10], field1658[var11]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg3, field1658[var10], true, var8) == 0)) {
                                    var7 = field1654[var10];
                                    var6 = field1658[var11];
                                    break label84;
                                }
                            }
                        }
                    }
                }
                arg2--;
            }
            if (arg2 < 0 || var7 == 0 || var6 == 0) {
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

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "(I)Z", line = 284)
    private final boolean method783(int arg0) {
        int var2 = this.field1657.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class504 var3 = (class504) this.field4362;
            this.method1913(-116);
            var3.method2851(88);
            this.field1653.BackBufferHeight = 0;
            this.field1653.BackBufferWidth = 0;
            if (method782(this.field1651, this.field1653, this.field4452, this.field1652, this.field1655, -103)) {
                int var4 = this.field1657.Reset(this.field1653);
                if (class686.method3804(2005530599, var4)) {
                    var3.method2853((byte) 90, this.field1657.method3782(), this.field1657.method3786(0));
                    this.method1948((byte) -29);
                    this.method795(true);
                    return true;
                }
            }
        }
        if (arg0 > -110) {
            this.field1647 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lcv;I)I", line = 323)
    private static final int method784(class264 arg0, int arg1) {
        if (arg1 != 34) {
            return -121;
        } else if (class66.field868 == arg0) {
            return 2;
        } else if (class594.field8145 == arg0) {
            return 4;
        } else if (class75.field948 == arg0) {
            return 26;
        } else if (class129.field1635 == arg0) {
            return 7;
        } else if (class517.field7094 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V", line = 354)
    public final synchronized void method785(int arg0) {
        this.field1669.method1542((byte) 13);
        super.method785(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "(B)V", line = 362)
    public final void method786(byte arg0) {
        if (this.field4431) {
            this.field1657.method3788(36, 0.0F);
            this.field1657.method3788(37, 1.0F);
            this.field1657.SetRenderState(34, this.field4471);
        } else {
            this.field4451 = (this.field4424 - this.field4395);
            this.field4478 = this.field4451 - (float) this.field4439;
            if ((float) this.field4384 > this.field4478) {
                this.field4478 = this.field4384;
            }
            this.field1657.method3788(36, this.field4478);
            this.field1657.method3788(37, this.field4451);
            this.field1657.SetRenderState(34, this.field4441);
        }
        if (arg0 != -60) {
            field1668 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[BILnl;ZZII)Lsd;", line = 389)
    public final class595 method787(int arg0, byte[] arg1, int arg2, class50 arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        return arg4 ? (class595) null : new class27(this, arg3, arg2, arg0, arg5, arg1, arg7, arg6);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILll;)V", line = 400)
    public final void method788(int arg0, class114 arg1) {
        if (arg0 != 14433) {
            this.method853((byte) -7);
        }
        int var3 = 0;
        if (class202.field2643 == arg1) {
            var3 = 65536;
        } else if (class495.field6694 == arg1) {
            var3 = 131072;
        } else if (class394.field5646 == arg1) {
            var3 = 196608;
        }
        this.field1657.SetTextureStageState(this.field4425, 11, this.field4425 | var3);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIILnl;BII[F)Lsd;", line = 425)
    public final class595 method789(boolean arg0, int arg1, int arg2, class50 arg3, byte arg4, int arg5, int arg6, float[] arg7) {
        return arg4 == 106 ? null : (class595) null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 436)
    public final void method790(byte arg0) {
        int var2 = 13 / ((arg0 - 20) / 43);
        this.field1657.method3785(15, this.field4386);
    }

    @OriginalMember(owner = "client!ui", name = "SA", descriptor = "()I", line = 444)
    public final int method791() {
        return 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ltd;B)I", line = 451)
    private static final int method792(class691 arg0, byte arg1) {
        if (class627.field8525 == arg0) {
            return 2;
        } else if (class428.field5951 == arg0) {
            return 1;
        } else {
            if (arg1 != 56) {
                method784(null, 22);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "(I)V", line = 469)
    public final void method793(int arg0) {
        this.field1657.method3785(7, this.field4457);
        if (arg0 >= -23) {
            field1658 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "()Lru;", line = 480)
    public final class276 method794() {
        D3DADAPTER_IDENTIFIER var1 = this.field1655.method3802(this.field1651, 0);
        return new class276(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "(Z)V", line = 488)
    public final void method795(boolean arg0) {
        if (!arg0) {
            this.method798(-41, true);
        }
        for (int var2 = 0; var2 < this.field4460; var2++) {
            this.field1657.SetSamplerState(var2, 7, 0);
            this.field1657.SetSamplerState(var2, 6, 2);
            this.field1657.SetSamplerState(var2, 5, 2);
            this.field1657.SetSamplerState(var2, 1, 1);
            this.field1657.SetSamplerState(var2, 2, 1);
            this.field1666[var2] = class627.field8525;
            this.field1664[var2] = this.field1665[var2] = true;
            this.field1660[var2] = false;
            this.field1656[var2] = 0;
        }
        this.field1657.SetTextureStageState(0, 6, 1);
        this.field1657.SetRenderState(9, 2);
        this.field1657.SetRenderState(23, 4);
        this.field1657.SetRenderState(25, 5);
        this.field1657.SetRenderState(24, 0);
        this.field1657.SetRenderState(22, 2);
        this.field1657.SetRenderState(147, 1);
        this.field1657.SetRenderState(145, 1);
        this.field1657.method3788(38, 0.95F);
        this.field1657.SetRenderState(140, 3);
        this.field1650.SetType(3);
        this.field1648.SetType(3);
        this.field1659.SetType(1);
        this.field1663 = false;
        super.method795(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Laq;Laq;FLaq;)Laq;", line = 529)
    public final class108 method796(class108 arg0, class108 arg1, float arg2, class108 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ui", name = "KA", descriptor = "(IIII)[I", line = 538)
    public final int[] method797(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field1657.method3796(0);
        IDirect3DSurface var7 = this.field1657.method3783(arg2, arg3, 21, 0, 0, true);
        if (class686.method3804(2005530599, this.field1657.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class686.method3804(2005530599, var7.LockRect(0, 0, arg2, arg3, 0, this.field1649))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field1649.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field1649.method3807(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field1649.method3807(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method1547((byte) -93);
        var7.method1547((byte) -84);
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Lqr;", line = 578)
    public final class213 method798(int arg0, boolean arg1) {
        if (arg1) {
            return (class213) null;
        } else if (arg0 == 3) {
            return new class262(this, this.field4231);
        } else if (arg0 == 4) {
            return new class134(this, this.field4231, this.field4351);
        } else {
            return super.method798(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILnl;[BI)Lgp;", line = 615)
    public final class94 method799(int arg0, int arg1, int arg2, class50 arg3, byte[] arg4, int arg5) {
        return arg5 <= 52 ? (class94) null : new class181(this, arg3, arg0, arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "(B)V", line = 625)
    public final void method800(byte arg0) {
        if (arg0 == -46) {
            this.field1657.method3785(28, this.field4413 && this.field4409 && this.field4439 >= 0 | this.field4431);
        }
    }

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "()V", line = 634)
    public final void method801() {
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Leea;Lnl;I)I", line = 637)
    public static final int method802(class680 arg0, class50 arg1, int arg2) {
        if (arg2 != 16) {
            field1658 = null;
        }
        if (class680.field9664 == arg0) {
            if (class426.field5922 == arg1) {
                return 22;
            }
            if (class420.field5862 == arg1) {
                return 21;
            }
            if (class394.field5654 == arg1) {
                return 28;
            }
            if (class609.field8310 == arg1) {
                return 50;
            }
            if (class603.field8244 == arg1) {
                return 51;
            }
            if (class168.field2104 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 676)
    public final void method803(Rectangle[] arg0, int arg1) throws class352 {
        this.method805();
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/vo;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lre;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Lpq;I)V", line = 683)
    private class130(int arg0, int arg1, Canvas arg2, class246 arg3, IDirect3D arg4, IDirect3DDevice arg5, class504 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class479 arg9, class159 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field1652 = arg1;
        this.field1647 = arg8;
        this.field1651 = arg0;
        this.field1662 = arg6;
        this.field1669 = arg3;
        this.field1657 = arg5;
        this.field1653 = arg7;
        this.field1655 = arg4;
        this.field1650 = new class685(this.field1669);
        this.field1648 = new class685(this.field1669);
        this.field1659 = new class685(this.field1669);
        this.field1649 = new PixelBuffer(this.field1669);
        this.field1646 = new GeometryBuffer(this.field1669);
        new GeometryBuffer(this.field1669);
        this.field1645 = (this.field1647.TextureCaps & 0x4000) != 0;
        this.field1670 = (this.field1647.TextureCaps & 0x10000) != 0;
        this.field4460 = this.field1647.MaxSimultaneousTextures;
        this.field4387 = this.field1647.MaxActiveLights <= 0 ? 8 : this.field1647.MaxActiveLights;
        this.field1644 = (this.field1647.TextureCaps & 0x2) == 0;
        this.field4423 = (this.field1647.TextureCaps & 0x2000) != 0;
        this.field4390 = (this.field1647.TextureCaps & 0x800) != 0;
        this.field4468 = this.field4452 > 0 || this.field1655.CheckDeviceMultiSampleType(this.field1651, this.field1652, this.field1653.BackBufferFormat, true, 2) == 0;
        this.field1664 = new boolean[this.field4460];
        this.field1666 = new class691[this.field4460];
        this.field1656 = new int[this.field4460];
        this.field1660 = new boolean[this.field4460];
        this.field1661 = new boolean[this.field4460];
        this.field1665 = new boolean[this.field4460];
        this.field1657.BeginScene();
        try {
            this.field1657.Clear(3, 0, 1.0F, 0);
            this.method805();
            this.field1657.Clear(3, 0, 1.0F, 0);
        } catch (class352 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILeea;IILnl;)Lsd;", line = 731)
    public final class595 method804(int arg0, class680 arg1, int arg2, int arg3, class50 arg4) {
        if (arg2 < 64) {
            this.field1662 = null;
        }
        return new class27(this, arg4, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "()V", line = 741)
    public final void method805() throws class352 {
        this.field1657.EndScene();
        if (this.field1662.method2854(10850)) {
            this.field1667 = 0;
            if (class686.method3805((byte) 112, this.field1662.method2852(0, (byte) -15))) {
                this.method783(-113);
            }
        } else if (++this.field1667 <= 50) {
            this.method783(-115);
        } else {
            throw new class352();
        }
        this.field1657.BeginScene();
    }

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "(I)V", line = 765)
    public final void method806(int arg0) {
        this.field1657.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIZILtk;)V", line = 774)
    public final void method807(boolean arg0, int arg1, boolean arg2, int arg3, class73 arg4) {
        int var6 = 0;
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg3 != -21480) {
            return;
        }
        if (arg0) {
            var6 |= 0x20;
        }
        if (arg2) {
            var6 |= 0x10;
        }
        this.field1657.SetTextureStageState(this.field4425, var8, var6 | method781(false, arg4));
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lnl;ILeea;)Z", line = 826)
    public final boolean method808(class50 arg0, int arg1, class680 arg2) {
        int var4 = -115 / ((5 - arg1) / 54);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class686.method3804(2005530599, this.field1655.method3799(this.field1651, var5)) && class686.method3804(2005530599, this.field1655.CheckDeviceFormat(this.field1651, this.field1652, var5.Format, 0, 4, method802(arg2, arg0, 16)));
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILvp;)V", line = 838)
    public final void method809(int arg0, int arg1, class467 arg2) {
        class152 var4 = (class152) arg2;
        this.field1657.SetStreamSource(arg1, var4.field1907, 0, var4.method1020(-67));
        if (arg0 != 1) {
            this.field1659 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "(I)V", line = 849)
    public final void method810(int arg0) {
        if (this.field4371) {
            field1668[4] = 0.0F;
            field1668[14] = 0.0F;
            field1668[15] = 1.0F;
            field1668[1] = 0.0F;
            field1668[12] = 0.0F;
            field1668[10] = 1.0F;
            field1668[7] = 0.0F;
            field1668[11] = 0.0F;
            field1668[6] = 0.0F;
            field1668[2] = 0.0F;
            field1668[8] = 0.0F;
            field1668[5] = 1.0F;
            field1668[13] = 0.0F;
            field1668[9] = 0.0F;
            field1668[0] = 1.0F;
            field1668[3] = 0.0F;
        } else {
            this.field4374.method2784(field1668, (byte) -92);
        }
        if (arg0 <= 72) {
            this.field1660 = null;
        }
        this.field1657.SetTransform(256, field1668);
    }

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "()Z", line = 886)
    public final boolean method811() {
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "(I)V", line = 893)
    public final void method812(int arg0) {
        this.field1650.SetDirection(-this.field4443[0], -this.field4443[1], -this.field4443[2]);
        this.field1648.SetDirection(-this.field4470[0], -this.field4470[1], -this.field4470[2]);
        if (arg0 == 8) {
            this.field1663 = false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Loh;I)Lqca;", line = 905)
    public final class547 method813(class401[] arg0, int arg1) {
        return arg1 <= 20 ? (class547) null : new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIILtk;)V", line = 917)
    public final void method814(boolean arg0, int arg1, int arg2, class73 arg3) {
        int var5 = 0;
        byte var7;
        if (arg2 == 1) {
            var7 = 6;
        } else if (arg2 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1 > -108) {
            field1654 = null;
        }
        if (arg0) {
            var5 |= 0x10;
        }
        this.field1657.SetTextureStageState(this.field4425, var7, var5 | method781(false, arg3));
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 962)
    public final void method815(Object arg0, byte arg1, Canvas arg2) {
        if (arg1 != 31 || this.field4346 != arg2) {
            return;
        }
        Dimension var4 = arg2.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field1657.EndScene();
            this.method783(-121);
            this.field1657.BeginScene();
        }
    }

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "(I)V", line = 990)
    public final void method816(int arg0) {
        this.field1657.SetTransform(3, this.field4420);
        if (arg0 != 8) {
            this.method823(117, 90);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZ)V", line = 1002)
    public final void method817(byte arg0, boolean arg1) {
        this.field1657.method3785(161, arg1);
        if (arg0 >= -47) {
            this.method807(true, 117, true, 59, null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILgo;IILfo;I)V", line = 1013)
    public final void method818(int arg0, int arg1, class526 arg2, int arg3, int arg4, class417 arg5, int arg6) {
        this.field1657.SetIndices(((class382) arg2).field5561);
        this.field1657.DrawIndexedPrimitive(method860(arg5, arg4 - 89), 0, arg0, arg1, arg6, arg3);
        if (arg4 != -1) {
            this.method845((byte) 53, false, -55, (int[][]) ((int[][]) null));
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB)Lvp;", line = 1033)
    public final class467 method819(boolean arg0, byte arg1) {
        int var3 = 22 / ((-arg1 - 63) / 54);
        return new class152(this, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "(I)V", line = 1042)
    public final void method820(int arg0) {
        this.field1657.method3785(14, this.field4433 && this.field4442);
        if (arg0 != 14084) {
            this.method815(null, (byte) 63, null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()V", line = 1052)
    public final void method821() {
        this.method1949(-32, true);
        this.field1657.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lkca;I)I", line = 1060)
    private static final int method822(class537 arg0, int arg1) {
        if (arg1 != 3) {
            field1654 = null;
        }
        if (class137.field1707 == arg0) {
            return 1;
        } else if (class248.field3341 == arg0) {
            return 2;
        } else if (class564.field7724 == arg0) {
            return 3;
        } else if (class480.field6468 == arg0) {
            return 4;
        } else if (class91.field1113 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(II)V", line = 1090)
    public final void method823(int arg0, int arg1) {
        this.field1657.SetTextureStageState(this.field4425, 11, arg1);
        if (arg0 != 4) {
            this.field1669 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "(I)V", line = 1101)
    public final void method824(int arg0) {
        if (!this.field1663) {
            this.field1657.LightEnable(0, false);
            this.field1657.LightEnable(1, false);
            this.field1657.SetLight(0, this.field1650);
            this.field1657.SetLight(1, this.field1648);
            this.field1657.LightEnable(0, true);
            this.field1657.LightEnable(1, true);
            this.field1663 = true;
        }
        if (arg0 != 1) {
            this.method858((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V", line = 1123)
    public final void method825(byte arg0) {
        int var2 = 18 % ((-arg0 - 24) / 61);
        float var3 = this.field4397 ? this.field4399 : 0.0F;
        float var4 = this.field4397 ? -this.field4432 : 0.0F;
        this.field1650.SetDiffuse(this.field4458 * var3, this.field4414 * var3, this.field4419 * var3, 0.0F);
        this.field1648.SetDiffuse(this.field4458 * var4, this.field4414 * var4, this.field4419 * var4, 0.0F);
        this.field1663 = false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lnl;Leea;Z)Z", line = 1137)
    public final boolean method826(class50 arg0, class680 arg1, boolean arg2) {
        if (!arg2) {
            this.method834(-93, 9, -52, -118);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class686.method3804(2005530599, this.field1655.method3799(this.field1651, var4)) && class686.method3804(2005530599, this.field1655.CheckDeviceFormat(this.field1651, this.field1652, var4.Format, 0, 3, method802(arg1, arg0, 16)));
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()V", line = 1150)
    public final void method827() {
        IDirect3DEventQuery var1 = this.field1657.method3791();
        if (class686.method3804(2005530599, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method1547((byte) -47);
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V", line = 1178)
    public final void method828(int arg0) {
        if (arg0 > -111) {
            this.field1669 = null;
        }
        this.field1657.method3785(27, this.field4447);
    }

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "()V", line = 1187)
    public final void method829() {
    }

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "(I)V", line = 1190)
    public final void method830(int arg0) {
        this.field1657.method3785(137, this.field4467 && !this.field4483);
        if (arg0 > -65) {
            this.field1652 = 24;
        }
    }

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "(I)V", line = 1200)
    public final void method831(int arg0) {
        if (this.field4383.method2716(108)) {
            this.field4379.method2784(field1668, (byte) -92);
        } else {
            field1668[1] = 0.0F;
            field1668[2] = 0.0F;
            field1668[15] = 1.0F;
            field1668[9] = 0.0F;
            field1668[12] = 0.0F;
            field1668[3] = 0.0F;
            field1668[14] = 0.0F;
            field1668[5] = 1.0F;
            field1668[0] = 1.0F;
            field1668[6] = 0.0F;
            field1668[8] = 0.0F;
            field1668[4] = 0.0F;
            field1668[11] = 0.0F;
            field1668[7] = 0.0F;
            field1668[13] = 0.0F;
            field1668[10] = 1.0F;
        }
        if (arg0 != 13081) {
            this.field1648 = null;
        }
        this.field1657.SetTransform(2, field1668);
    }

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "(I)V", line = 1238)
    public final void method832(int arg0) {
        if (arg0 == 5) {
            this.field1650.SetAmbient(this.field4475 * this.field4458, this.field4475 * this.field4414, this.field4475 * this.field4419, 0.0F);
            this.field1663 = false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "(Z)V", line = 1249)
    public final void method833(boolean arg0) {
        if (class301.field4011 == this.field4474) {
            this.field1657.SetRenderState(19, 5);
            this.field1657.SetRenderState(20, 6);
        } else if (class624.field8481 == this.field4474) {
            this.field1657.SetRenderState(19, 2);
            this.field1657.SetRenderState(20, 2);
        } else if (class604.field8250 == this.field4474) {
            this.field1657.SetRenderState(19, 9);
            this.field1657.SetRenderState(20, 2);
        }
        if (arg0) {
            method781(true, null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V", line = 1278)
    public final void method834(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 1284)
    public final void method835(int arg0) {
        this.method825((byte) 110);
        this.method824(1);
        if (arg0 != 0) {
            this.method814(false, 14, -33, null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lrg;I)V", line = 1295)
    public final void method836(class221 arg0, int arg1) {
        if (arg1 != 7) {
            return;
        }
        this.field1657.SetTexture(this.field4425, arg0.method165(-89));
        if (this.field1666[this.field4425] != arg0.field2867) {
            int var3 = method792(arg0.field2867, (byte) 56);
            this.field1657.SetSamplerState(this.field4425, 6, var3);
            this.field1657.SetSamplerState(this.field4425, 5, var3);
            this.field1666[this.field4425] = arg0.field2867;
            if (arg0.field2869 != this.field1660[this.field4425]) {
                this.field1657.SetSamplerState(this.field4425, 7, arg0.field2869 ? method792(arg0.field2867, (byte) 56) : 0);
                this.field1660[this.field4425] = arg0.field2869;
            }
        } else if (arg0.field2869 != this.field1660[this.field4425]) {
            this.field1657.SetSamplerState(this.field4425, 7, arg0.field2869 ? method792(arg0.field2867, (byte) 56) : 0);
            this.field1660[this.field4425] = arg0.field2869;
        }
        if (!this.field1661[this.field4425]) {
            this.field1661[this.field4425] = true;
            this.method837(-119);
            this.method840(true);
        }
    }

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "(I)V", line = 1335)
    public final void method837(int arg0) {
        int var2 = 0 % ((arg0 + 35) / 60);
        int var3 = this.field1661[this.field4425] ? method784(this.field4411[this.field4425], 34) : 1;
        this.field1657.SetTextureStageState(this.field4425, 4, var3);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lvn;I)V", line = 1345)
    public final void method838(class27 arg0, int arg1) {
        this.method836(arg0, arg1 ^ 0x6);
        if (arg1 != 1) {
            return;
        }
        if (arg0.field268 != this.field1664[this.field4425]) {
            this.field1657.SetSamplerState(this.field4425, 1, arg0.field268 ? 1 : 3);
            this.field1664[this.field4425] = arg0.field268;
        }
        if (this.field1665[this.field4425] != arg0.field266) {
            this.field1657.SetSamplerState(this.field4425, 2, arg0.field266 ? 1 : 3);
            this.field1665[this.field4425] = arg0.field266;
        }
    }

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "()V", line = 1367)
    public final void method839() {
    }

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "(Z)V", line = 1371)
    public final void method840(boolean arg0) {
        int var2 = this.field1661[this.field4425] ? method784(this.field4444[this.field4425], 34) : 1;
        this.field1657.SetTextureStageState(this.field4425, 1, var2);
        if (!arg0) {
            method822(null, 39);
        }
    }

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "(I)V", line = 1384)
    public final void method841(int arg0) {
        this.field1657.SetRenderState(60, this.field4477);
        int var2 = -121 / ((39 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "()Z", line = 1393)
    public final boolean method842() {
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "()V", line = 1401)
    public final void method843() {
        this.field1669.method1539(88);
        super.method843();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIIIZII)Lsd;", line = 1409)
    public final class595 method844(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        return arg5 == 0 ? new class27(this, arg3, arg1, arg4, arg0, arg6, arg2) : (class595) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZI[[I)Lvea;", line = 1419)
    public final class64 method845(byte arg0, boolean arg1, int arg2, int[][] arg3) {
        if (arg0 <= 99) {
            this.method817((byte) -2, true);
        }
        return new class416(this, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "(I)V", line = 1429)
    public final void method846(int arg0) {
        if (arg0 != 2) {
            this.field1660 = null;
        }
        if (this.field4455[this.field4425] == class100.field1221) {
            this.field1657.SetTextureStageState(this.field4425, 24, 0);
            this.field1656[this.field4425] = 0;
            return;
        }
        if (this.field4455[this.field4425] == class480.field6468) {
            this.field1657.SetTransform(this.field4425 + 16, this.field4416[this.field4425].method2784(field1668, (byte) -92));
        } else {
            this.field1657.SetTransform(this.field4425 + 16, this.field4416[this.field4425].method2774(field1668, (byte) -116));
        }
        int var2 = method822(this.field4455[this.field4425], 3);
        if (this.field1656[this.field4425] != var2) {
            this.field1657.SetTextureStageState(this.field4425, 24, var2);
            this.field1656[this.field4425] = var2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;", line = 1462)
    public final Object method847(boolean arg0, Canvas arg1) {
        return arg0 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "(B)V", line = 1473)
    public final void method848(byte arg0) {
        int var2 = 9 / ((arg0 + 49) / 41);
        this.field1657.SetViewport(this.field4450, this.field4464, this.field4345, this.field4340, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLqca;)V", line = 1482)
    public final void method849(byte arg0, class547 arg1) {
        if (arg0 == 43) {
            dxVertexLayout var3 = (dxVertexLayout) arg1;
            this.field1657.SetVertexDeclaration(var3.field7226);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZZ)Lgo;", line = 1494)
    public final class526 method850(boolean arg0, boolean arg1) {
        return arg0 ? new class382(this, class680.field9665, arg1) : (class526) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(FFF)V", line = 1504)
    public final void method851(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(Z)V", line = 1507)
    public final void method852(boolean arg0) {
        if (!arg0) {
            this.field1659 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "(B)V", line = 1518)
    public final void method853(byte arg0) {
        this.field1657.SetScissorRect(this.field4450 + this.field4396, this.field4464 + this.field4422, this.field4403, this.field4435);
        if (arg0 != 118) {
            this.field1644 = false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V", line = 1530)
    public final void method854(Object arg0, boolean arg1, Canvas arg2) {
        if (!arg1) {
            this.field1657 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1540)
    public final void method855(int arg0, Canvas arg1, Object arg2) {
        this.field1662 = (class504) arg2;
        if (arg0 != 7472) {
            field1668 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILfo;I)V", line = 1551)
    public final void method856(int arg0, int arg1, class417 arg2, int arg3) {
        this.field1657.DrawPrimitive(method860(arg2, -120), arg1, arg3);
        if (arg0 != -2) {
            field1658 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "(I)V", line = 1569)
    public final void method857(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field4469; var2++) {
            class329 var3 = this.field4465[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2109(14463);
            float var6 = var3.method2113((byte) -61) / 255.0F;
            this.field1659.SetPosition((float) var3.method2112(0), (float) var3.method2115((byte) -63), (float) var3.method2114((byte) -103));
            this.field1659.SetDiffuse((float) ((var5 & 0xFFE6E6) >> 16) * var6, (float) ((var5 & 0xFFD2) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field1659.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2110(true) * var3.method2110(true)));
            this.field1659.SetRange((float) var3.method2110(true));
            this.field1657.SetLight(var4, this.field1659);
            this.field1657.LightEnable(var4, true);
        }
        while (var2 < this.field4479) {
            this.field1657.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method857(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "(B)V", line = 1616)
    public final void method858(byte arg0) {
        if (arg0 < 54) {
            field1668 = null;
        }
        this.field1657.method3785(174, this.field4504);
    }

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "(Z)F", line = 1626)
    public final float method859(boolean arg0) {
        return arg0 ? -0.5F : -0.4345933F;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lfo;I)I", line = 1639)
    private static final int method860(class417 arg0, int arg1) {
        if (arg1 >= -61) {
            return 102;
        } else if (class315.field4530 == arg0) {
            return 2;
        } else if (class321.field4713 == arg0) {
            return 3;
        } else if (class650.field9206 == arg0) {
            return 1;
        } else if (class319.field4687 == arg0) {
            return 4;
        } else if (class490.field6606 == arg0) {
            return 6;
        } else if (class489.field6602 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
