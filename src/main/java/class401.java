import jaclib.peer.class630;
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
import jagdx.class451;
import jagdx.class452;
import jagdx.class453;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class401 extends class111 {

    @OriginalMember(owner = "client!ss", name = "Eg", descriptor = "Z")
    private boolean field5322 = false;

    @OriginalMember(owner = "client!ss", name = "Ug", descriptor = "I")
    private int field5338 = 0;

    @OriginalMember(owner = "client!ss", name = "Kg", descriptor = "I")
    private int field5328;

    @OriginalMember(owner = "client!ss", name = "Yg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field5342;

    @OriginalMember(owner = "client!ss", name = "Wg", descriptor = "Ljaclib/peer/bea;")
    public class630 field5340;

    @OriginalMember(owner = "client!ss", name = "Rg", descriptor = "I")
    private int field5335;

    @OriginalMember(owner = "client!ss", name = "Sg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field5336;

    @OriginalMember(owner = "client!ss", name = "Pg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field5333;

    @OriginalMember(owner = "client!ss", name = "Ng", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field5331;

    @OriginalMember(owner = "client!ss", name = "Ig", descriptor = "Lkfa;")
    private class564 field5326;

    @OriginalMember(owner = "client!ss", name = "Lg", descriptor = "Ljagdx/D3DLIGHT;")
    private class453 field5329;

    @OriginalMember(owner = "client!ss", name = "Vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class453 field5339;

    @OriginalMember(owner = "client!ss", name = "Qg", descriptor = "Ljagdx/D3DLIGHT;")
    private class453 field5334;

    @OriginalMember(owner = "client!ss", name = "Bg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field5319;

    @OriginalMember(owner = "client!ss", name = "Tg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field5337;

    @OriginalMember(owner = "client!ss", name = "Mg", descriptor = "Z")
    public boolean field5330;

    @OriginalMember(owner = "client!ss", name = "Fg", descriptor = "Z")
    public boolean field5323;

    @OriginalMember(owner = "client!ss", name = "bh", descriptor = "Z")
    public boolean field5345;

    @OriginalMember(owner = "client!ss", name = "Og", descriptor = "[Z")
    private boolean[] field5332;

    @OriginalMember(owner = "client!ss", name = "Xg", descriptor = "[Z")
    private boolean[] field5341;

    @OriginalMember(owner = "client!ss", name = "Zg", descriptor = "[Z")
    private boolean[] field5343;

    @OriginalMember(owner = "client!ss", name = "Gg", descriptor = "[I")
    private int[] field5324;

    @OriginalMember(owner = "client!ss", name = "Jg", descriptor = "[Lcba;")
    private class516[] field5327;

    @OriginalMember(owner = "client!ss", name = "Dg", descriptor = "[Z")
    private boolean[] field5321;

    @OriginalMember(owner = "client!ss", name = "Hg", descriptor = "[I")
    private static int[] field5325 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ss", name = "Cg", descriptor = "[F")
    private static float[] field5320 = new float[16];

    @OriginalMember(owner = "client!ss", name = "ah", descriptor = "[I")
    private static int[] field5344 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLgf;)I")
    private static final int method2293(boolean arg0, class256 arg1) {
        if (!arg0) {
            method2298(null, 127, 38, null, 114, -84);
        }
        if (class350.field4792 == arg1) {
            return 2;
        } else if (class681.field9596 == arg1) {
            return 0;
        } else if (class291.field4117 == arg1) {
            return 1;
        } else if (class149.field2382 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZZLgf;)V")
    public final void method60(int arg0, int arg1, boolean arg2, boolean arg3, class256 arg4) {
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
        if (arg3) {
            var8 |= 0x10;
        }
        if (arg0 == 1) {
            this.field5342.SetTextureStageState(this.field1880, var7, method2293(true, arg4) | var8);
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(II)V")
    public final void method84(int arg0, int arg1) {
        this.field5342.SetTextureStageState(this.field1880, 11, arg0);
        if (arg1 != 22344) {
            this.field5339 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "eb", descriptor = "(I)Z")
    private final boolean method2294(int arg0) {
        if (arg0 >= -48) {
            return false;
        }
        int var2 = this.field5342.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class564 var3 = (class564) this.field1652;
            this.method836(127);
            var3.method3093(0);
            this.field5333.BackBufferWidth = 0;
            this.field5333.BackBufferHeight = 0;
            if (method2298(this.field5333, this.field5335, -29019, this.field5331, this.field1882, this.field5328)) {
                int var4 = this.field5342.Reset(this.field5333);
                if (class452.method2566(var4, (byte) -63)) {
                    var3.method3094(0, this.field5342.method2567(), this.field5342.method2574(0));
                    this.method904(-128);
                    this.method54(78);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "(Z)V")
    public final void method35(boolean arg0) {
        this.field5342.SetScissorRect(this.field1910 + this.field1859, this.field1881 + this.field1824, this.field1862, this.field1905);
        if (!arg0) {
            this.field5323 = false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILob;Lft;III)V")
    public final void method53(int arg0, int arg1, class691 arg2, class4 arg3, int arg4, int arg5, int arg6) {
        this.field5342.SetIndices(((class272) arg3).field3785);
        this.field5342.DrawIndexedPrimitive(method2296(arg2, (byte) -31), arg0, arg1, arg5, arg4, arg6);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLts;)V")
    public final void method62(boolean arg0, class501 arg1) {
        if (!arg0) {
            dxVertexLayout var3 = (dxVertexLayout) arg1;
            this.field5342.SetVertexDeclaration(var3.field4184);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI[[II)Lul;")
    public final class537 method103(boolean arg0, int arg1, int[][] arg2, int arg3) {
        return arg3 == 0 ? new class15(this, arg1, arg0, arg2) : (class537) null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method50(boolean arg0, Object arg1, Canvas arg2) {
        if (arg0) {
            this.field5326 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "(I)V")
    public final void method42(int arg0) {
        int var2 = this.field5341[this.field1880] ? method2299(this.field1908[this.field1880], (byte) 66) : 1;
        if (arg0 == -9990) {
            this.field5342.SetTextureStageState(this.field1880, 4, var2);
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
    public final void method88(byte arg0) {
        if (this.field1883) {
            this.field5342.method2579(36, 0.0F);
            this.field5342.method2579(37, 1.0F);
            this.field5342.SetRenderState(34, this.field1903);
        } else {
            this.field1895 = (this.field1900 - this.field1897);
            this.field1854 = this.field1895 - (float) this.field1827;
            if (this.field1854 < (float) this.field1820) {
                this.field1854 = this.field1820;
            }
            this.field5342.method2579(36, this.field1854);
            this.field5342.method2579(37, this.field1895);
            this.field5342.SetRenderState(34, this.field1830);
        }
        if (arg0 <= 31) {
            this.field5322 = false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "cb", descriptor = "(I)V")
    public final void method94(int arg0) {
        float var2 = this.field1839 ? this.field1917 : 0.0F;
        if (arg0 < -82) {
            float var3 = this.field1839 ? -this.field1865 : 0.0F;
            this.field5329.SetDiffuse(this.field1870 * var2, this.field1860 * var2, this.field1861 * var2, 0.0F);
            this.field5339.SetDiffuse(this.field1870 * var3, this.field1860 * var3, this.field1861 * var3, 0.0F);
            this.field5322 = false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lxa;Z)V")
    public final void method80(class468 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lhi;ZLne;)Z")
    public final boolean method69(class193 arg0, boolean arg1, class294 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (!arg1) {
            this.field5331 = null;
        }
        return class452.method2566(this.field5331.method2563(this.field5335, var4), (byte) -58) && class452.method2566(this.field5331.CheckDeviceFormat(this.field5335, this.field5328, var4.Format, 0, 3, method2300(arg0, arg2, 51)), (byte) -56);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([FIZIIILhi;B)Lak;")
    public final class324 method75(float[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class193 arg6, byte arg7) {
        if (arg7 >= -20) {
            this.method67(null, null, -71);
        }
        return null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLsk;)V")
    public final void method2295(boolean arg0, class582 arg1) {
        this.method2297(arg1, (byte) 83);
        if (arg0) {
            this.method42(33);
        }
        if (this.field5332[this.field1880] != arg1.field7736) {
            this.field5342.SetSamplerState(this.field1880, 1, arg1.field7736 ? 1 : 3);
            this.field5332[this.field1880] = arg1.field7736;
        }
        if (arg1.field7738 != this.field5321[this.field1880]) {
            this.field5342.SetSamplerState(this.field1880, 2, arg1.field7738 ? 1 : 3);
            this.field5321[this.field1880] = arg1.field7738;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIILhi;[BZ)Lak;")
    public final class324 method61(int arg0, int arg1, int arg2, int arg3, int arg4, class193 arg5, byte[] arg6, boolean arg7) {
        if (arg3 != -129) {
            this.field5336 = null;
        }
        return new class582(this, arg5, arg2, arg0, arg7, arg6, arg1, arg4);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lhi;Lne;I)Z")
    public final boolean method34(class193 arg0, class294 arg1, int arg2) {
        if (arg2 == 0) {
            D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
            return class452.method2566(this.field5331.method2563(this.field5335, var4), (byte) -104) && class452.method2566(this.field5331.CheckDeviceFormat(this.field5335, this.field5328, var4.Format, 0, 4, method2300(arg0, arg1, 51)), (byte) -79);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lob;B)I")
    private static final int method2296(class691 arg0, byte arg1) {
        if (class214.field3067 == arg0) {
            return 2;
        } else if (class389.field5146 == arg0) {
            return 3;
        } else if (class482.field6534 == arg0) {
            return 1;
        } else if (class620.field8229 == arg0) {
            return 4;
        } else if (class95.field1448 == arg0) {
            return 6;
        } else if (class264.field3670 == arg0) {
            return 5;
        } else if (arg1 == -31) {
            throw new IllegalArgumentException("");
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(ZI)Leu;")
    public final class448 method108(boolean arg0, int arg1) {
        return arg1 == 15918 ? new class494(this, arg0) : (class448) null;
    }

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "(I)F")
    public final float method65(int arg0) {
        if (arg0 != 0) {
            this.method104();
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "(B)V")
    public final void method44(byte arg0) {
        int var2 = -116 % ((arg0 - 56) / 44);
        if (this.field5341[this.field1880]) {
            this.field5341[this.field1880] = false;
            this.field5342.SetTexture(this.field1880, null);
            this.method42(-9990);
            this.method68(38);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method67(Object arg0, Canvas arg1, int arg2) {
        int var4 = 108 % ((arg2 + 12) / 53);
        if (this.field1794 != arg1) {
            return;
        }
        Dimension var5 = arg1.getSize();
        if (var5.width > 0 && var5.height > 0) {
            this.field5342.EndScene();
            this.method2294(-86);
            this.field5342.BeginScene();
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lnn;B)V")
    public final void method2297(class385 arg0, byte arg1) {
        this.field5342.SetTexture(this.field1880, arg0.method167(-13696));
        if (this.field5327[this.field1880] != arg0.field5123) {
            int var3 = method2302(120, arg0.field5123);
            this.field5342.SetSamplerState(this.field1880, 6, var3);
            this.field5342.SetSamplerState(this.field1880, 5, var3);
            this.field5327[this.field1880] = arg0.field5123;
            if (arg0.field5126 != this.field5343[this.field1880]) {
                this.field5342.SetSamplerState(this.field1880, 7, arg0.field5126 ? method2302(122, arg0.field5123) : 0);
                this.field5343[this.field1880] = arg0.field5126;
            }
        } else if (arg0.field5126 != this.field5343[this.field1880]) {
            this.field5342.SetSamplerState(this.field1880, 7, arg0.field5126 ? method2302(119, arg0.field5123) : 0);
            this.field5343[this.field1880] = arg0.field5126;
        }
        if (arg1 <= 59) {
            this.method30();
        }
        if (!this.field5341[this.field1880]) {
            this.field5341[this.field1880] = true;
            this.method42(-9990);
            this.method68(64);
        }
    }

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "(I)V")
    public final void method77(int arg0) {
        this.field5342.method2582(137, this.field1821 && !this.field1852);
        if (arg0 != 13989) {
            this.method52(99);
        }
    }

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "(I)V")
    public final void method31(int arg0) {
        if (arg0 != 0 || this.field5322) {
            return;
        }
        this.field5342.LightEnable(0, false);
        this.field5342.LightEnable(1, false);
        this.field5342.SetLight(0, this.field5329);
        this.field5342.SetLight(1, this.field5339);
        this.field5342.LightEnable(0, true);
        this.field5342.LightEnable(1, true);
        this.field5322 = true;
    }

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "(I)V")
    public final void method87(int arg0) {
        this.field5342.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method101(int arg0, Canvas arg1) {
        if (arg0 < 61) {
            this.field5330 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!ss", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Lbi;Ljava/lang/Integer;)Loa;")
    public static final class651 createToolkit(Canvas arg0, class498 arg1, class449 arg2, Integer arg3) {
        class401 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class630 var7 = new class630();
            IDirect3D var8 = IDirect3D.method2562(-2147483616, var7);
            D3DCAPS var9 = var8.method2561(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2298(var10, var5, -29019, var8, arg3, var6)) {
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
                    var13 = var8.method2560(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class451 var17) {
                    var13 = var8.method2560(var5, var6, arg0, var11 | 0x20, var10);
                }
                class564 var15 = new class564(var13.method2574(0), var13.method2567());
                var4 = new class401(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method905(-119);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method56();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ss", name = "V", descriptor = "(I)V")
    public final void method91(int arg0) {
        if (arg0 != -24613) {
            field5320 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIILob;)V")
    public final void method89(byte arg0, int arg1, int arg2, class691 arg3) {
        if (arg0 > -84) {
            this.method76();
        }
        this.field5342.DrawPrimitive(method2296(arg3, (byte) -31), arg2, arg1);
    }

    @OriginalMember(owner = "client!ss", name = "KA", descriptor = "(IIII)[I")
    public final int[] method106(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field5342.method2577(0);
        IDirect3DSurface var7 = this.field5342.method2570(arg2, arg3, 21, 0, 0, true);
        if (class452.method2566(this.field5342.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1), (byte) -31) && class452.method2566(var7.LockRect(0, 0, arg2, arg3, 0, this.field5319), (byte) -20)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field5319.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field5319.method2586(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field5319.method2586(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3494(-81);
        var7.method3494(-125);
        return var5;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method81(Object arg0, Canvas arg1, int arg2) {
        this.field5326 = (class564) arg0;
        int var4 = 112 % ((77 - arg2) / 35);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Llu;")
    public final class669 method39(byte arg0, int arg1) {
        if (arg0 <= 2) {
            this.method48((byte) -20, null, 47);
        }
        if (arg1 == 3) {
            return new class337(this, this.field1685);
        } else if (arg1 == 4) {
            return new class349(this, this.field1685, this.field1680);
        } else {
            return super.method39((byte) 16, arg1);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method86(Rectangle[] arg0, int arg1) throws class26 {
        this.method97();
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(IZ)V")
    public final void method71(int arg0, boolean arg1) {
        this.field5342.method2582(161, arg1);
        if (arg0 != 0) {
            this.method104();
        }
    }

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (this.field1811) {
            field5320[11] = 0.0F;
            field5320[5] = 1.0F;
            field5320[3] = 0.0F;
            field5320[4] = 0.0F;
            field5320[9] = 0.0F;
            field5320[13] = 0.0F;
            field5320[0] = 1.0F;
            field5320[6] = 0.0F;
            field5320[10] = 1.0F;
            field5320[7] = 0.0F;
            field5320[2] = 0.0F;
            field5320[8] = 0.0F;
            field5320[14] = 0.0F;
            field5320[12] = 0.0F;
            field5320[1] = 0.0F;
            field5320[15] = 1.0F;
        } else {
            this.field1810.method554(field5320, (byte) -64);
        }
        this.field5342.SetTransform(256, field5320);
        if (arg0 != 20561) {
            this.method61(0, -20, -85, -80, -87, null, null, true);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public final class483 method49(class483 arg0, class483 arg1, float arg2, class483 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;IILjagdx/IDirect3D;II)Z")
    private static final boolean method2298(D3DPRESENT_PARAMETERS arg0, int arg1, int arg2, IDirect3D arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class452.method2565(arg3.method2563(arg1, var9), -20)) {
                return false;
            }
            label85: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var10 = 0; var10 < field5344.length; var10++) {
                        if (arg3.CheckDeviceType(arg1, arg5, var9.Format, field5344[var10], true) == 0 && arg3.CheckDeviceFormat(arg1, arg5, var9.Format, 1, 1, field5344[var10]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg5, field5344[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field5325.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg1, arg5, var9.Format, 2, 1, field5325[var11]) == 0 && arg3.CheckDepthStencilMatch(arg1, arg5, var9.Format, field5344[var10], field5325[var11]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg5, field5325[var10], true, var8) == 0)) {
                                    var6 = field5325[var11];
                                    var7 = field5344[var10];
                                    break label85;
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
            arg0.MultiSampleQuality = 0;
            arg0.BackBufferFormat = var7;
            if (arg2 == -29019) {
                arg0.MultiSampleType = var8;
                arg0.AutoDepthStencilFormat = var6;
                return true;
            } else {
                return true;
            }
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lne;IILhi;I)Lak;")
    public final class324 method46(class294 arg0, int arg1, int arg2, class193 arg3, int arg4) {
        return arg2 == 0 ? new class582(this, arg3, arg0, arg1, arg4) : (class324) null;
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "(I)V")
    public final void method95(int arg0) {
        this.field5342.SetTransform(3, this.field1875);
        if (arg0 < -66) {
            ;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIII)V")
    public final void method51(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/bea;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lkfa;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Lbi;I)V")
    private class401(int arg0, int arg1, Canvas arg2, class630 arg3, IDirect3D arg4, IDirect3DDevice arg5, class564 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class498 arg9, class449 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field5328 = arg1;
        this.field5342 = arg5;
        this.field5340 = arg3;
        this.field5335 = arg0;
        this.field5336 = arg8;
        this.field5333 = arg7;
        this.field5331 = arg4;
        this.field5326 = arg6;
        this.field5329 = new class453(this.field5340);
        this.field5339 = new class453(this.field5340);
        this.field5334 = new class453(this.field5340);
        this.field5319 = new PixelBuffer(this.field5340);
        this.field5337 = new GeometryBuffer(this.field5340);
        new GeometryBuffer(this.field5340);
        this.field5330 = (this.field5336.TextureCaps & 0x4000) != 0;
        this.field1863 = (this.field5336.TextureCaps & 0x800) != 0;
        this.field5323 = (this.field5336.TextureCaps & 0x10000) != 0;
        this.field1891 = this.field5336.MaxActiveLights > 0 ? this.field5336.MaxActiveLights : 8;
        this.field5345 = (this.field5336.TextureCaps & 0x2) == 0;
        this.field1836 = (this.field5336.TextureCaps & 0x2000) != 0;
        this.field1855 = this.field5336.MaxSimultaneousTextures;
        this.field1913 = this.field1882 > 0 || this.field5331.CheckDeviceMultiSampleType(this.field5335, this.field5328, this.field5333.BackBufferFormat, true, 2) == 0;
        this.field5332 = new boolean[this.field1855];
        this.field5341 = new boolean[this.field1855];
        this.field5343 = new boolean[this.field1855];
        this.field5324 = new int[this.field1855];
        this.field5327 = new class516[this.field1855];
        this.field5321 = new boolean[this.field1855];
        this.field5342.BeginScene();
        try {
            this.field5342.Clear(3, 0, 1.0F, 0);
            this.method97();
            this.field5342.Clear(3, 0, 1.0F, 0);
        } catch (class26 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (arg0) {
            this.field5342.method2582(14, this.field1848 && this.field1818);
        }
    }

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "()V")
    public final void method38() {
        this.method826(true, 66);
        this.field5342.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(FFF)V")
    public final void method70(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ss", name = "ab", descriptor = "(I)V")
    public final void method78(int arg0) {
        this.field5342.method2582(28, this.field1867 && this.field1823 && this.field1827 >= 0 | this.field1883);
        if (arg0 != 8) {
            this.method53(-101, -111, null, null, 72, 119, 66);
        }
    }

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "(B)V")
    public final void method74(byte arg0) {
        if (this.field1868.method2430(0)) {
            this.field1815.method554(field5320, (byte) -126);
        } else {
            field5320[1] = 0.0F;
            field5320[0] = 1.0F;
            field5320[2] = 0.0F;
            field5320[13] = 0.0F;
            field5320[5] = 1.0F;
            field5320[7] = 0.0F;
            field5320[4] = 0.0F;
            field5320[12] = 0.0F;
            field5320[3] = 0.0F;
            field5320[15] = 1.0F;
            field5320[9] = 0.0F;
            field5320[6] = 0.0F;
            field5320[11] = 0.0F;
            field5320[10] = 1.0F;
            field5320[8] = 0.0F;
            field5320[14] = 0.0F;
        }
        if (arg0 > 122) {
            this.field5342.SetTransform(2, field5320);
        }
    }

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "(B)V")
    public final void method90(byte arg0) {
        if (arg0 == -81) {
            this.field5342.method2582(15, this.field1902);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIZI[III)Lak;")
    public final class324 method37(byte arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (arg0 > -64) {
            this.method51(-53, -43, -104, 113);
        }
        return new class582(this, arg6, arg1, arg2, arg4, arg3, arg5);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lnea;B)I")
    private static final int method2299(class670 arg0, byte arg1) {
        if (class586.field7773 == arg0) {
            return 2;
        } else if (class521.field6963 == arg0) {
            return 4;
        } else if (class445.field6091 == arg0) {
            return 26;
        } else if (class32.field520 == arg0) {
            return 7;
        } else if (class706.field9920 == arg0) {
            return 10;
        } else {
            int var2 = -58 % ((-arg1 - 69) / 52);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ss", name = "SA", descriptor = "()I")
    public final int method104() {
        return 0;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Lhi;Lne;I)I")
    public static final int method2300(class193 arg0, class294 arg1, int arg2) {
        if (arg2 != 51) {
            field5344 = null;
        }
        if (class294.field4160 == arg1) {
            if (class88.field1335 == arg0) {
                return 22;
            }
            if (class5.field100 == arg0) {
                return 21;
            }
            if (class616.field8164 == arg0) {
                return 28;
            }
            if (class390.field5155 == arg0) {
                return 50;
            }
            if (class98.field1488 == arg0) {
                return 51;
            }
            if (class199.field2887 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lgf;ZBI)V")
    public final void method57(class256 arg0, boolean arg1, byte arg2, int arg3) {
        int var5 = 0;
        byte var7;
        if (arg3 == 1) {
            var7 = 6;
        } else if (arg3 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg2 != -115) {
            this.field5326 = null;
        }
        if (arg1) {
            var5 |= 0x10;
        }
        this.field5342.SetTextureStageState(this.field1880, var7, var5 | method2293(true, arg0));
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
    public final synchronized void method52(int arg0) {
        this.field5340.method3486((byte) 21);
        super.method52(arg0);
    }

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "(B)V")
    public final void method102(byte arg0) {
        int var2 = 98 % ((26 - arg0) / 55);
        this.field5329.SetDirection(-this.field1901[0], -this.field1901[1], -this.field1901[2]);
        this.field5339.SetDirection(-this.field1890[0], -this.field1890[1], -this.field1890[2]);
        this.field5322 = false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLeea;)V")
    public final void method2301(byte arg0, class121 arg1) {
        this.method2297(arg1, (byte) 111);
        if (!this.field5332[this.field1880]) {
            this.field5342.SetSamplerState(this.field1880, 1, 1);
            this.field5332[this.field1880] = true;
        }
        if (arg0 == 62 && !this.field5321[this.field1880]) {
            this.field5342.SetSamplerState(this.field1880, 2, 1);
            this.field5321[this.field1880] = true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lmf;Z)V")
    public final void method63(class388 arg0, boolean arg1) {
        int var3 = 0;
        if (!arg1) {
            this.method96();
        }
        if (class262.field3598 == arg0) {
            var3 = 65536;
        } else if (class484.field6545 == arg0) {
            var3 = 131072;
        } else if (class439.field6038 == arg0) {
            var3 = 196608;
        }
        this.field5342.SetTextureStageState(this.field1880, 11, var3 | this.field1880);
    }

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "(B)V")
    public final void method43(byte arg0) {
        this.field5342.SetViewport(this.field1910, this.field1881, this.field1669, this.field1734, 0.0F, 1.0F);
        int var2 = 0 / ((arg0 + 74) / 49);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI)Lft;")
    public final class4 method105(boolean arg0, int arg1) {
        if (arg1 != 10) {
            this.field5323 = true;
        }
        return new class272(this, class294.field4161, arg0);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[Lca;)Lts;")
    public final class501 method45(int arg0, class282[] arg1) {
        return arg0 == 1 ? new dxVertexLayout(this, arg1) : (class501) null;
    }

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class664.field9422 == this.field1876) {
            this.field5342.SetRenderState(19, 5);
            this.field5342.SetRenderState(20, 6);
        } else if (class533.field7082 == this.field1876) {
            this.field5342.SetRenderState(19, 2);
            this.field5342.SetRenderState(20, 2);
        } else if (class407.field5486 == this.field1876) {
            this.field5342.SetRenderState(19, 9);
            this.field5342.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "()Z")
    public final boolean method96() {
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "(I)V")
    public final void method85(int arg0) {
        this.method94(-122);
        this.method31(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "()V")
    public final void method76() {
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLeu;I)V")
    public final void method48(byte arg0, class448 arg1, int arg2) {
        class494 var4 = (class494) arg1;
        if (arg0 == -32) {
            this.field5342.SetStreamSource(arg2, var4.field6648, 0, var4.method2752(96));
        }
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "()V")
    public final void method100() {
        IDirect3DEventQuery var1 = this.field5342.method2581();
        if (class452.method2566(var1.Issue(), (byte) -40)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3494(-106);
    }

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "(I)V")
    public final void method83(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field1874; var2++) {
            class65 var3 = this.field1915[var2];
            int var4 = var2 + 2;
            int var5 = var3.method514(arg0 + 32424);
            float var6 = var3.method519(true) / 255.0F;
            this.field5334.SetPosition((float) var3.method515((byte) 102), (float) var3.method516(-18736), (float) var3.method518((byte) 8));
            this.field5334.SetDiffuse((float) ((var5 & 0xFFA23D) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field5334.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method522(91) * var3.method522(-47)));
            this.field5334.SetRange((float) var3.method522(-54));
            this.field5342.SetLight(var4, this.field5334);
            this.field5342.LightEnable(var4, true);
        }
        while (var2 < this.field1856) {
            this.field5342.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method83(arg0);
    }

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "(I)V")
    public final void method36(int arg0) {
        this.field5342.method2582(7, this.field1826);
        if (arg0 != 8) {
            this.method58(false);
        }
    }

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "(B)V")
    public final void method40(byte arg0) {
        this.field5342.method2582(174, this.field1940);
        if (arg0 != 24) {
            this.field5337 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "()V")
    public final void method107() {
    }

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "(Z)V")
    public final void method82(boolean arg0) {
        this.field5342.SetRenderState(60, this.field1853);
        if (!arg0) {
            this.method60(121, -74, false, true, null);
        }
    }

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (this.field1843[this.field1880] == class661.field9384) {
            this.field5342.SetTextureStageState(this.field1880, 24, 0);
            this.field5324[this.field1880] = 0;
        } else {
            if (this.field1843[this.field1880] == class37.field558) {
                this.field5342.SetTransform(this.field1880 + 16, this.field1877[this.field1880].method554(field5320, (byte) -71));
            } else {
                this.field5342.SetTransform(this.field1880 + 16, this.field1877[this.field1880].method583(field5320, 107));
            }
            int var2 = method2303(this.field1843[this.field1880], (byte) -117);
            if (this.field5324[this.field1880] != var2) {
                this.field5342.SetTextureStageState(this.field1880, 24, var2);
                this.field5324[this.field1880] = var2;
            }
        }
        if (arg0 != 1) {
            this.method29();
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B[BIILhi;I)Ljs;")
    public final class306 method92(byte arg0, byte[] arg1, int arg2, int arg3, class193 arg4, int arg5) {
        if (arg0 != 0) {
            this.field5324 = null;
        }
        return new class121(this, arg4, arg2, arg3, arg5, arg1);
    }

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "()V")
    public final void method97() throws class26 {
        this.field5342.EndScene();
        if (this.field5326.method3092(0)) {
            this.field5338 = 0;
            if (class452.method2565(this.field5326.method3095(0, (byte) -120), 78)) {
                this.method2294(-126);
            }
        } else if (++this.field5338 <= 50) {
            this.method2294(-90);
        } else {
            throw new class26();
        }
        this.field5342.BeginScene();
    }

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "()Z")
    public final boolean method93() {
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "(I)V")
    public final void method68(int arg0) {
        if (arg0 <= 33) {
            this.field5339 = null;
        }
        int var2 = this.field5341[this.field1880] ? method2299(this.field1851[this.field1880], (byte) -124) : 1;
        this.field5342.SetTextureStageState(this.field1880, 1, var2);
    }

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "()V")
    public final void method30() {
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
    public final void method33(boolean arg0) {
    }

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "()V")
    public final void method56() {
        this.field5340.method3485((byte) -77);
        super.method56();
    }

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "(I)V")
    public final void method54(int arg0) {
        for (int var2 = 0; var2 < this.field1855; var2++) {
            this.field5342.SetSamplerState(var2, 7, 0);
            this.field5342.SetSamplerState(var2, 6, 2);
            this.field5342.SetSamplerState(var2, 5, 2);
            this.field5342.SetSamplerState(var2, 1, 1);
            this.field5342.SetSamplerState(var2, 2, 1);
            this.field5327[var2] = class708.field9922;
            this.field5332[var2] = this.field5321[var2] = true;
            this.field5343[var2] = false;
            this.field5324[var2] = 0;
        }
        int var3 = -4 / ((arg0 + 52) / 56);
        this.field5342.SetTextureStageState(0, 6, 1);
        this.field5342.SetRenderState(9, 2);
        this.field5342.SetRenderState(23, 4);
        this.field5342.SetRenderState(25, 5);
        this.field5342.SetRenderState(24, 0);
        this.field5342.SetRenderState(22, 2);
        this.field5342.SetRenderState(147, 1);
        this.field5342.SetRenderState(145, 1);
        this.field5342.method2579(38, 0.95F);
        this.field5342.SetRenderState(140, 3);
        this.field5329.SetType(3);
        this.field5339.SetType(3);
        this.field5334.SetType(1);
        this.field5322 = false;
        super.method54(72);
    }

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "()Lffa;")
    public final class173 method55() {
        D3DADAPTER_IDENTIFIER var1 = this.field5331.method2564(this.field5335, 0);
        return new class173(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "(B)V")
    public final void method66(byte arg0) {
        if (arg0 >= 75) {
            this.field5342.method2582(27, this.field1837);
        }
    }

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "(Z)V")
    public final void method47(boolean arg0) {
        this.field5329.SetAmbient(this.field1870 * this.field1833, this.field1860 * this.field1833, this.field1861 * this.field1833, 0.0F);
        if (!arg0) {
            this.method31(-65);
        }
        this.field5322 = false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILcba;)I")
    private static final int method2302(int arg0, class516 arg1) {
        if (arg0 <= 84) {
            return -77;
        } else if (class708.field9922 == arg1) {
            return 2;
        } else if (class175.field2696 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "()V")
    public final void method29() {
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Leb;B)I")
    private static final int method2303(class584 arg0, byte arg1) {
        if (arg1 != -117) {
            field5320 = null;
        }
        if (class696.field9766 == arg0) {
            return 1;
        } else if (class19.field313 == arg0) {
            return 2;
        } else if (class64.field979 == arg0) {
            return 3;
        } else if (class37.field558 == arg0) {
            return 4;
        } else if (class329.field4527 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }
}
