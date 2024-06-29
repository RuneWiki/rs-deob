import jaclib.peer.class406;
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
import jagdx.class400;
import jagdx.class401;
import jagdx.class402;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class253 extends class334 {

    @OriginalMember(owner = "client!os", name = "Gg", descriptor = "I")
    private int field3607 = 0;

    @OriginalMember(owner = "client!os", name = "Xg", descriptor = "Z")
    private boolean field3630 = false;

    @OriginalMember(owner = "client!os", name = "Ig", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3608;

    @OriginalMember(owner = "client!os", name = "Zg", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!os", name = "Ug", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3610;

    @OriginalMember(owner = "client!os", name = "Tg", descriptor = "Lod;")
    private class22 field3615;

    @OriginalMember(owner = "client!os", name = "Pg", descriptor = "I")
    private int field3623;

    @OriginalMember(owner = "client!os", name = "Rg", descriptor = "Ljaclib/peer/io;")
    public class406 field3621;

    @OriginalMember(owner = "client!os", name = "Qg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3618;

    @OriginalMember(owner = "client!os", name = "Mg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3629;

    @OriginalMember(owner = "client!os", name = "Hg", descriptor = "Ljagdx/D3DLIGHT;")
    private class401 field3605;

    @OriginalMember(owner = "client!os", name = "eh", descriptor = "Ljagdx/D3DLIGHT;")
    private class401 field3606;

    @OriginalMember(owner = "client!os", name = "Ng", descriptor = "Ljagdx/D3DLIGHT;")
    private class401 field3613;

    @OriginalMember(owner = "client!os", name = "ch", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3611;

    @OriginalMember(owner = "client!os", name = "dh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3603;

    @OriginalMember(owner = "client!os", name = "Dg", descriptor = "Z")
    public boolean field3609;

    @OriginalMember(owner = "client!os", name = "bh", descriptor = "Z")
    public boolean field3622;

    @OriginalMember(owner = "client!os", name = "Wg", descriptor = "Z")
    public boolean field3616;

    @OriginalMember(owner = "client!os", name = "Eg", descriptor = "[Z")
    private boolean[] field3612;

    @OriginalMember(owner = "client!os", name = "Jg", descriptor = "[Z")
    private boolean[] field3619;

    @OriginalMember(owner = "client!os", name = "Sg", descriptor = "[Z")
    private boolean[] field3624;

    @OriginalMember(owner = "client!os", name = "ah", descriptor = "[Z")
    private boolean[] field3625;

    @OriginalMember(owner = "client!os", name = "Og", descriptor = "[I")
    private int[] field3617;

    @OriginalMember(owner = "client!os", name = "Fg", descriptor = "[Ltd;")
    private class457[] field3626;

    @OriginalMember(owner = "client!os", name = "fh", descriptor = "Ljava/lang/String;")
    private static final String field3631 = method2129(method2128("M|\u0001cf}&7"));

    @OriginalMember(owner = "client!os", name = "Yg", descriptor = "[F")
    private static float[] field3614 = new float[16];

    @OriginalMember(owner = "client!os", name = "Kg", descriptor = "[I")
    private static int[] field3627 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!os", name = "Vg", descriptor = "[I")
    private static int[] field3628 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!os", name = "Lg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3604;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILlc;)V")
    public final void method2062(int arg0, class608 arg1) {
        int var3 = 0;
        if (class643.field9155 == arg1) {
            var3 = 65536;
        } else if (class1.field19 == arg1) {
            var3 = 131072;
        } else if (class650.field9234 == arg1) {
            var3 = 196608;
        }
        this.field3618.SetTextureStageState(this.field4735, 11, this.field4735 | var3);
        if (arg0 != -5138) {
            this.method160(-1.6305844F, -1.0321258F, 0.17296232F);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZILoba;Z)V")
    public final void method2063(boolean arg0, int arg1, class739 arg2, boolean arg3) {
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
        if (arg0) {
            this.field3621 = null;
        }
        this.field3618.SetTextureStageState(this.field4735, var7, var5 | method2068(arg2, 0));
    }

    @OriginalMember(owner = "client!os", name = "U", descriptor = "(I)V")
    public final void method2064(int arg0) {
        if (arg0 != 1) {
            return;
        }
        if (this.field3604 != null || this.field4764[this.field4735] == class684.field9603) {
            this.field3618.SetTextureStageState(this.field4735, 24, 0);
            this.field3617[this.field4735] = 0;
            return;
        }
        if (this.field4764[this.field4735] == class467.field6818) {
            this.field3618.SetTransform(this.field4735 + 16, this.field4722[this.field4735].method4656((byte) -85, field3614));
        } else {
            this.field3618.SetTransform(this.field4735 + 16, this.field4722[this.field4735].method4654(field3614, false));
        }
        int var2 = method2086(2, this.field4764[this.field4735]);
        if (this.field3617[this.field4735] != var2) {
            this.field3618.SetTextureStageState(this.field4735, 24, var2);
            this.field3617[this.field4735] = var2;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lbha;Lkb;)Ltha;")
    public final class296 method134(class545 arg0, class102 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method2065(Canvas arg0, int arg1) {
        return arg1 == 0 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method2066(Object arg0, Canvas arg1, int arg2) {
        if (this.field4557 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field3618.EndScene();
                this.method2111((byte) -67);
                this.field3618.BeginScene();
            }
        }
        int var5 = 35 % ((arg2 + 9) / 52);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILcb;)I")
    private static final int method2067(int arg0, class700 arg1) {
        if (class434.field6287 == arg1) {
            return 2;
        } else if (class696.field9752 == arg1) {
            return 3;
        } else if (class76.field1087 == arg1) {
            return 1;
        } else if (class12.field163 == arg1) {
            return 4;
        } else if (class36.field443 == arg1) {
            return 6;
        } else if (class709.field9896 == arg1) {
            return 5;
        } else {
            if (arg0 != 16) {
                field3628 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Loba;I)I")
    private static final int method2068(class739 arg0, int arg1) {
        if (arg1 != 0) {
            field3614 = null;
        }
        if (class784.field11325 == arg0) {
            return 2;
        } else if (class801.field11657 == arg0) {
            return 0;
        } else if (class514.field7551 == arg0) {
            return 1;
        } else if (class659.field9335 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!os", name = "O", descriptor = "(I)V")
    public final void method2069(int arg0) {
        this.field3618.SetViewport(this.field4721, this.field4784, this.field4653, this.field4646, 0.0F, 1.0F);
        if (arg0 != -4984) {
            field3627 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "db", descriptor = "(I)V")
    public final void method2070(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field4737; var2++) {
            class330 var3 = this.field4730[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2591(11062);
            float var6 = var3.method2597(arg0 ^ 0x2) / 255.0F;
            this.field3613.SetPosition((float) var3.method2595((byte) -127), (float) var3.method2590((byte) 101), (float) var3.method2592(true));
            this.field3613.SetDiffuse((float) ((var5 & 0xFFD125) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3613.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2594((byte) 21) * var3.method2594((byte) 21)));
            this.field3613.SetRange((float) var3.method2594((byte) 21));
            this.field3618.SetLight(var4, this.field3613);
            this.field3618.LightEnable(var4, true);
        }
        while (var2 < this.field4802) {
            this.field3618.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2070(arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Luba;")
    public final class517 method2071(boolean arg0, int arg1) {
        if (arg1 != -21663) {
            this.field3603 = null;
        }
        return new class769(this, class496.field7282, arg0);
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(II)Lbha;")
    public final class545 method179(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!os", name = "w", descriptor = "()V")
    public final void method163() {
    }

    @OriginalMember(owner = "client!os", name = "A", descriptor = "()Z")
    public final boolean method217() {
        return false;
    }

    @OriginalMember(owner = "client!os", name = "x", descriptor = "(I)V")
    public final void method2072(int arg0) {
        if (this.field4710) {
            field3614[10] = 1.0F;
            field3614[12] = 0.0F;
            field3614[1] = 0.0F;
            field3614[8] = 0.0F;
            field3614[0] = 1.0F;
            field3614[3] = 0.0F;
            field3614[2] = 0.0F;
            field3614[4] = 0.0F;
            field3614[11] = 0.0F;
            field3614[13] = 0.0F;
            field3614[9] = 0.0F;
            field3614[5] = 1.0F;
            field3614[14] = 0.0F;
            field3614[15] = 1.0F;
            field3614[7] = 0.0F;
            field3614[6] = 0.0F;
        } else {
            this.field4708.method4654(field3614, false);
        }
        this.field3618.SetTransform(256, field3614);
        if (arg0 != 10979) {
            this.method174(80, 15, 89, 64, 1.6865183605260046D);
        }
    }

    @OriginalMember(owner = "client!os", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Llga;Ljava/lang/Integer;)Lha;")
    public static final class18 createToolkit(Canvas arg0, class673 arg1, class47 arg2, Integer arg3) {
        class253 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class406 var7 = new class406();
            IDirect3D var8 = IDirect3D.method3151(-2147483616, var7);
            D3DCAPS var9 = var8.method3149(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2107(arg3, var6, var5, var10, var8, false)) {
                    throw new RuntimeException("");
                }
                var10.EnableAutoDepthStencil = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                var10.Windowed = true;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method3153(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class400 var17) {
                    var13 = var8.method3153(var5, var6, arg0, var11 | 0x20, var10);
                }
                class22 var15 = new class22(var13.method3131(0), var13.method3137());
                var4 = new class253(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2678(0);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method167();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[FIIIZILhh;)Lcf;")
    public final class196 method2073(int arg0, float[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class250 arg7) {
        if (arg4 != 0) {
            this.method2096(false, true, (byte) 123, null, -47);
        }
        return null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lsn;Lsn;FLsn;)Lsn;")
    public final class369 method155(class369 arg0, class369 arg1, float arg2, class369 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lcb;IILuba;III)V")
    public final void method2074(class700 arg0, int arg1, int arg2, class517 arg3, int arg4, int arg5, int arg6) {
        this.field3618.SetIndices(((class769) arg3).field10980);
        if (arg6 > 8) {
            this.field3618.DrawIndexedPrimitive(method2067(16, arg0), 0, arg1, arg2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!os", name = "w", descriptor = "(I)V")
    public final void method2075(int arg0) {
        this.field3618.method3143(7, this.field4734);
        if (arg0 >= -65) {
            this.field3618 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method2076(Object arg0, Canvas arg1, int arg2) {
        if (arg2 != 0) {
            this.field3621 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "v", descriptor = "()Lcba;")
    public final class254 method210() {
        D3DADAPTER_IDENTIFIER var1 = this.field3610.method3152(this.field3620, 0);
        return new class254(var1.VendorID, field3631, 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLtk;)V")
    public final void method2077(boolean arg0, class645 arg1) {
        this.method2112(-127, arg1);
        if (!this.field3625[this.field4735]) {
            this.field3618.SetSamplerState(this.field4735, 1, 1);
            this.field3625[this.field4735] = true;
        }
        if (!arg0) {
            field3627 = null;
        }
        if (!this.field3619[this.field4735]) {
            this.field3618.SetSamplerState(this.field4735, 2, 1);
            this.field3619[this.field4735] = true;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIZ[III)Lcf;")
    public final class196 method2078(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        if (arg2 != -20084) {
            this.field3605 = null;
        }
        return new class275(this, arg1, arg5, arg3, arg4, arg0, arg6);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lhh;Lon;Z)Z")
    public final boolean method2079(class250 arg0, class496 arg1, boolean arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (!arg2) {
            this.field3626 = null;
        }
        return class402.method3156(this.field3610.method3150(this.field3620, var4), -1) && class402.method3156(this.field3610.CheckDeviceFormat(this.field3620, this.field3623, var4.Format, 0, 4, method2099((byte) -90, arg1, arg0)), -1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Luc;)Lot;")
    public final class218 method2080(int arg0, class121[] arg1) {
        return arg0 <= 57 ? (class218) null : new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!os", name = "r", descriptor = "(B)V")
    public final void method2081(byte arg0) {
        this.field4809 = (this.field4786 - this.field4779);
        this.field4718 = (float) (-this.field4732) + this.field4809;
        if ((float) this.field4813 > this.field4718) {
            this.field4718 = this.field4813;
        }
        if (arg0 <= -21) {
            this.field3618.method3136(36, this.field4718);
            this.field3618.method3136(37, this.field4809);
            this.field3618.SetRenderState(34, this.field4768);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILon;Lhh;)Z")
    public final boolean method2082(int arg0, class496 arg1, class250 arg2) {
        if (arg0 != -27964) {
            this.field3629 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class402.method3156(this.field3610.method3150(this.field3620, var4), arg0 ^ 0x6D3B) && class402.method3156(this.field3610.CheckDeviceFormat(this.field3620, this.field3623, var4.Format, 0, 3, method2099((byte) -108, arg1, arg2)), -1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II[[IZ)Lnm;")
    public final class361 method2083(int arg0, int arg1, int[][] arg2, boolean arg3) {
        if (arg0 != 1) {
            field3614 = null;
        }
        return new class549(this, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!os", name = "K", descriptor = "(I)V")
    public final void method2084(int arg0) {
        if (arg0 != 4843) {
            this.field3620 = -82;
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(B)V")
    public final void method2085(byte arg0) {
        float var2 = this.field4794 ? this.field4757 : 0.0F;
        if (arg0 == -23) {
            float var3 = this.field4794 ? -this.field4736 : 0.0F;
            this.field3605.SetDiffuse(this.field4807 * var2, this.field4767 * var2, this.field4758 * var2, 0.0F);
            this.field3606.SetDiffuse(this.field4807 * var3, this.field4767 * var3, this.field4758 * var3, 0.0F);
            this.field3630 = false;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILkl;)I")
    private static final int method2086(int arg0, class740 arg1) {
        if (arg0 != 2) {
            method2107(-60, -120, 87, null, null, false);
        }
        if (class161.field2065 == arg1) {
            return 1;
        } else if (class467.field6818 == arg1) {
            return 2;
        } else if (class433.field6275 == arg1) {
            return 3;
        } else if (class460.field6716 == arg1) {
            return 4;
        } else if (class405.field5882 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ltd;Z)I")
    private static final int method2087(class457 arg0, boolean arg1) {
        if (class350.field5072 == arg0) {
            return 2;
        } else if (class659.field9336 == arg0) {
            return 1;
        } else {
            if (arg1) {
                method2086(-61, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lbl;IZ)V")
    public final void method2088(class719 arg0, int arg1, boolean arg2) {
        class300 var4 = (class300) arg0;
        this.field3618.SetStreamSource(arg1, var4.field4177, 0, var4.method2403(26270));
        if (arg2) {
            this.method2123(-78);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;I)V")
    public final void method2089(IDirect3DVertexShader arg0, int arg1) {
        if (arg1 <= 70) {
            method2068(null, 4);
        }
        this.field3604 = arg0;
        this.field3618.SetVertexShader(arg0);
        this.method2064(1);
    }

    @OriginalMember(owner = "client!os", name = "m", descriptor = "(B)V")
    public final void method2090(byte arg0) {
        if (arg0 != -94) {
            this.field3613 = null;
        }
        this.field3618.method3143(174, this.field4842);
    }

    @OriginalMember(owner = "client!os", name = "x", descriptor = "()V")
    public final void method138() {
        IDirect3DEventQuery var1 = this.field3618.method3128();
        if (class402.method3156(var1.Issue(), -1)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3176(true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!os", name = "F", descriptor = "(I)V")
    public final void method2091(int arg0) {
        if (arg0 != -9213) {
            this.field3630 = false;
        }
        this.field3618.SetScissorRect(this.field4721 + this.field4731, this.field4787 + this.field4784, this.field4812, this.field4754);
    }

    @OriginalMember(owner = "client!os", name = "s", descriptor = "(I)V")
    public final void method2092(int arg0) {
        int var2 = -94 % ((65 - arg0) / 43);
        if (this.field3624[this.field4735]) {
            this.field3624[this.field4735] = false;
            this.field3618.SetTexture(this.field4735, null);
            this.method2116(13730);
            this.method2106((byte) -118);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILhh;III[B)Ljca;")
    public final class542 method2093(int arg0, class250 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg3 != 3282) {
            field3628 = null;
        }
        return new class645(this, arg1, arg2, arg0, arg4, arg5);
    }

    @OriginalMember(owner = "client!os", name = "n", descriptor = "(Z)V")
    public final void method2094(boolean arg0) {
        if (!this.field3630) {
            this.field3618.LightEnable(0, false);
            this.field3618.LightEnable(1, false);
            this.field3618.SetLight(0, this.field3605);
            this.field3618.SetLight(1, this.field3606);
            this.field3618.LightEnable(0, true);
            this.field3618.LightEnable(1, true);
            this.field3630 = true;
        }
        if (arg0) {
            this.method151(10, -103, -71, 93);
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)F")
    public final float method2095(byte arg0) {
        return arg0 == -111 ? -0.5F : -0.40783522F;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZZBLoba;I)V")
    public final void method2096(boolean arg0, boolean arg1, byte arg2, class739 arg3, int arg4) {
        int var6 = -23 / ((arg2 - 13) / 49);
        byte var8;
        if (arg4 == 1) {
            var8 = 3;
        } else if (arg4 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        int var9 = 0;
        if (arg0) {
            var9 |= 0x20;
        }
        if (arg1) {
            var9 |= 0x10;
        }
        this.field3618.SetTextureStageState(this.field4735, var8, method2068(arg3, 0) | var9);
    }

    @OriginalMember(owner = "client!os", name = "u", descriptor = "()V")
    public final void method135() {
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
    public final void method2097(int arg0) {
        if (arg0 != -12888) {
            this.method2124((byte) -33, -19);
        }
        this.field3618.method3143(28, this.field4782 && this.field4760 && this.field4732 >= 0);
    }

    @OriginalMember(owner = "client!os", name = "V", descriptor = "(I)V")
    public final void method2098(int arg0) {
        if (class686.field9617 == this.field4726) {
            this.field3618.SetRenderState(19, 5);
            this.field3618.SetRenderState(20, 6);
        } else if (class503.field7340 == this.field4726) {
            this.field3618.SetRenderState(19, 2);
            this.field3618.SetRenderState(20, 2);
        } else if (class618.field8809 == this.field4726) {
            this.field3618.SetRenderState(19, 9);
            this.field3618.SetRenderState(20, 2);
        }
        if (arg0 != -23832) {
            this.field3608 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "na", descriptor = "(IIII)[I")
    public final int[] method227(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3618.method3133(0);
        IDirect3DSurface var7 = this.field3618.method3127(arg2, arg3, 21, 0, 0, true);
        if (class402.method3156(this.field3618.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -1) && class402.method3156(var7.LockRect(0, 0, arg2, arg3, 16, this.field3611), -1)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3611.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field3611.method3147(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3611.method3147(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3176(true);
        var7.method3176(true);
        return var5;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLon;Lhh;)I")
    public static final int method2099(byte arg0, class496 arg1, class250 arg2) {
        if (arg0 > -18) {
            method2068(null, -3);
        }
        if (class496.field7281 == arg1) {
            if (class210.field3057 == arg2) {
                return 22;
            }
            if (class385.field5635 == arg2) {
                return 21;
            }
            if (class18.field235 == arg2) {
                return 28;
            }
            if (class101.field1356 == arg2) {
                return 50;
            }
            if (class518.field7566 == arg2) {
                return 51;
            }
            if (class167.field2133 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!os", name = "gb", descriptor = "(I)V")
    public final void method2100(int arg0) {
        this.method2085((byte) -23);
        this.method2094(false);
        if (arg0 != 4) {
            this.method2097(-100);
        }
    }

    @OriginalMember(owner = "client!os", name = "I", descriptor = "()I")
    public final int method139() {
        return 0;
    }

    @OriginalMember(owner = "client!os", name = "r", descriptor = "()V")
    public final void method234() {
    }

    @OriginalMember(owner = "client!os", name = "F", descriptor = "(II)V")
    public final void method149(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "()V")
    public final void method238() {
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BZ)V")
    public final void method2101(byte arg0, boolean arg1) {
        if (arg0 != 46) {
            this.field3607 = 29;
        }
        this.field3618.method3143(161, arg1);
    }

    @OriginalMember(owner = "client!os", name = "t", descriptor = "(I)V")
    public final void method2102(int arg0) {
        this.field3618.method3143(137, this.field4789 && !this.field4811);
        if (arg0 < 98) {
            this.field3621 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "ya", descriptor = "()V")
    public final void method225() {
        this.method2628(1, true);
        this.field3618.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lcb;III)V")
    public final void method2103(class700 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 92) {
            this.field3618 = null;
        }
        this.field3618.DrawPrimitive(method2067(16, arg0), arg2, arg1);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(B)V")
    public final void method2104(byte arg0) {
        if (this.field4770.method5331(-30751)) {
            this.field4715.method4654(field3614, false);
        } else {
            field3614[5] = 1.0F;
            field3614[14] = 0.0F;
            field3614[2] = 0.0F;
            field3614[1] = 0.0F;
            field3614[8] = 0.0F;
            field3614[4] = 0.0F;
            field3614[10] = 1.0F;
            field3614[3] = 0.0F;
            field3614[9] = 0.0F;
            field3614[12] = 0.0F;
            field3614[0] = 1.0F;
            field3614[11] = 0.0F;
            field3614[13] = 0.0F;
            field3614[15] = 1.0F;
            field3614[7] = 0.0F;
            field3614[6] = 0.0F;
        }
        if (arg0 == -106) {
            this.field3618.SetTransform(2, field3614);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLjl;)V")
    public final void method2105(byte arg0, class275 arg1) {
        this.method2112(-110, arg1);
        if (arg1.field3891 != this.field3625[this.field4735]) {
            this.field3618.SetSamplerState(this.field4735, 1, arg1.field3891 ? 1 : 3);
            this.field3625[this.field4735] = arg1.field3891;
        }
        if (this.field3619[this.field4735] != arg1.field3893) {
            this.field3618.SetSamplerState(this.field4735, 2, arg1.field3893 ? 1 : 3);
            this.field3619[this.field4735] = arg1.field3893;
        }
        if (arg0 != 102) {
            this.field3610 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(II)Lkb;")
    public final class102 method191(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "()V")
    public final void method167() {
        this.field3621.method3183(-128);
        super.method167();
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(B)V")
    public final void method2106(byte arg0) {
        int var2 = this.field3624[this.field4735] ? method2122(0, this.field4798[this.field4735]) : 1;
        if (arg0 > -117) {
            this.method2119(-12);
        }
        this.field3618.SetTextureStageState(this.field4735, 1, var2);
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) throws class142 {
        this.field3618.EndScene();
        if (this.field3615.method268(-30483)) {
            this.field3607 = 0;
            if (class402.method3157(this.field3615.method267(0, 97), -2005530585)) {
                this.method2111((byte) -67);
            }
        } else if (++this.field3607 <= 50) {
            this.method2111((byte) -67);
        } else {
            throw new class142();
        }
        this.field3618.BeginScene();
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
    public final synchronized void method175(int arg0) {
        this.field3621.method3186(-15351);
        super.method175(arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;Z)Z")
    private static final boolean method2107(int arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, IDirect3D arg4, boolean arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class402.method3157(arg4.method3150(arg2, var9), -2005530585)) {
                return false;
            }
            label93: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field3627.length; var10++) {
                        if (arg4.CheckDeviceType(arg2, arg1, var9.Format, field3627[var10], true) == 0 && arg4.CheckDeviceFormat(arg2, arg1, var9.Format, 1, 1, field3627[var10]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg2, arg1, field3627[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field3628.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg2, arg1, var9.Format, 2, 1, field3628[var11]) == 0 && arg4.CheckDepthStencilMatch(arg2, arg1, var9.Format, field3627[var10], field3628[var11]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg2, arg1, field3628[var10], true, var8) == 0)) {
                                    var7 = field3627[var10];
                                    var6 = field3628[var11];
                                    break label93;
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
            arg3.AutoDepthStencilFormat = var6;
            arg3.BackBufferFormat = var7;
            if (arg5) {
                field3628 = null;
            }
            arg3.MultiSampleQuality = 0;
            arg3.MultiSampleType = var8;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "(B)V")
    public final void method2108(byte arg0) {
        if (arg0 > -125) {
            this.method146(false);
        }
        this.field3618.method3143(27, this.field4804);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(FFF)V")
    public final void method160(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!os", name = "L", descriptor = "(I)V")
    public final void method2109(int arg0) {
        this.field3605.SetAmbient(this.field4807 * this.field4801, this.field4801 * this.field4767, this.field4801 * this.field4758, 0.0F);
        this.field3630 = false;
        if (arg0 != 1) {
            this.method2104((byte) -2);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()Z")
    public final boolean method164() {
        return false;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IIIID)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!os", name = "q", descriptor = "(I)V")
    public final void method2110(int arg0) {
        if (arg0 < 101) {
            this.field3621 = null;
        }
        this.field3618.SetRenderState(60, this.field4720);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
    }

    @OriginalMember(owner = "client!os", name = "t", descriptor = "(B)Z")
    private final boolean method2111(byte arg0) {
        if (arg0 != -67) {
            this.method2118(-60, null);
        }
        int var2 = this.field3618.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class22 var3 = (class22) this.field4658;
            this.method2627(arg0 + 68);
            var3.method265(arg0 + 31653);
            this.field3608.BackBufferWidth = 0;
            this.field3608.BackBufferHeight = 0;
            if (method2107(this.field4749, this.field3623, this.field3620, this.field3608, this.field3610, false)) {
                int var4 = this.field3618.Reset(this.field3608);
                if (class402.method3156(var4, -1)) {
                    var3.method266(0, this.field3618.method3131(0), this.field3618.method3137());
                    this.method2609(124);
                    this.method2123(arg0 ^ 0xFFFFFFB8);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILpda;)V")
    public final void method2112(int arg0, class439 arg1) {
        this.field3618.SetTexture(this.field4735, arg1.method2249(-122));
        if (this.field3626[this.field4735] != arg1.field6469) {
            int var3 = method2087(arg1.field6469, false);
            this.field3618.SetSamplerState(this.field4735, 6, var3);
            this.field3618.SetSamplerState(this.field4735, 5, var3);
            this.field3626[this.field4735] = arg1.field6469;
            if (this.field3612[this.field4735] != arg1.field6470) {
                this.field3618.SetSamplerState(this.field4735, 7, arg1.field6470 ? method2087(arg1.field6469, false) : 0);
                this.field3612[this.field4735] = arg1.field6470;
            }
        } else if (arg1.field6470 != this.field3612[this.field4735]) {
            this.field3618.SetSamplerState(this.field4735, 7, arg1.field6470 ? method2087(arg1.field6469, false) : 0);
            this.field3612[this.field4735] = arg1.field6470;
        }
        if (!this.field3624[this.field4735]) {
            this.field3624[this.field4735] = true;
            this.method2116(13730);
            this.method2106((byte) -127);
        }
        int var4 = 93 % ((arg0 + 41) / 49);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method2113(Object arg0, Canvas arg1, int arg2) {
        this.field3615 = (class22) arg0;
        if (arg2 != 1125) {
            method2122(1, null);
        }
    }

    @OriginalMember(owner = "client!os", name = "y", descriptor = "(I)V")
    public final void method2114(int arg0) {
        if (arg0 != -5072) {
            this.method2081((byte) 52);
        }
        this.field3605.SetDirection(-this.field4746[0], -this.field4746[1], -this.field4746[2]);
        this.field3606.SetDirection(-this.field4771[0], -this.field4771[1], -this.field4771[2]);
        this.field3630 = false;
    }

    @OriginalMember(owner = "client!os", name = "p", descriptor = "(B)V")
    public final void method2115(byte arg0) {
        this.field3618.method3143(15, this.field4766);
        int var2 = 90 / ((29 - arg0) / 56);
    }

    @OriginalMember(owner = "client!os", name = "G", descriptor = "(I)V")
    public final void method2116(int arg0) {
        if (arg0 == 13730) {
            int var2 = this.field3624[this.field4735] ? method2122(arg0 - 13730, this.field4817[this.field4735]) : 1;
            this.field3618.SetTextureStageState(this.field4735, 4, var2);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method224(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class142 {
        this.method132(arg2, arg3);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ZI)Lbl;")
    public final class719 method2117(boolean arg0, int arg1) {
        return arg1 == 16 ? new class300(this, arg0) : (class719) null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V")
    public final void method2118(int arg0, IDirect3DPixelShader arg1) {
        this.field3618.SetPixelShader(arg1);
        if (arg0 != 4) {
            this.method2097(-99);
        }
    }

    @OriginalMember(owner = "client!os", name = "B", descriptor = "(I)V")
    public final void method2119(int arg0) {
        if (arg0 > -9) {
            this.field3630 = true;
        }
        this.field3618.method3143(14, this.field4765 && this.field4738);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lot;I)V")
    public final void method2120(class218 arg0, int arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        if (arg1 == -1) {
            this.field3618.SetVertexDeclaration(var3.field6292);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lhh;IIILon;)Lcf;")
    public final class196 method2121(class250 arg0, int arg1, int arg2, int arg3, class496 arg4) {
        return arg1 == 4 ? new class275(this, arg0, arg4, arg3, arg2) : (class196) null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILtka;)I")
    private static final int method2122(int arg0, class599 arg1) {
        if (class256.field3668 == arg1) {
            return 2;
        } else if (class539.field7920 == arg1) {
            return 4;
        } else if (class795.field11565 == arg1) {
            return 26;
        } else if (class647.field9205 == arg1) {
            return 7;
        } else if (class264.field3735 == arg1) {
            return 10;
        } else {
            if (arg0 != 0) {
                method2099((byte) -37, null, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/io;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lod;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Llga;I)V")
    private class253(int arg0, int arg1, Canvas arg2, class406 arg3, IDirect3D arg4, IDirect3DDevice arg5, class22 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class673 arg9, class47 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field3608 = arg7;
            this.field3620 = arg0;
            this.field3610 = arg4;
            this.field3615 = arg6;
            this.field3623 = arg1;
            this.field3621 = arg3;
            this.field3618 = arg5;
            this.field3629 = arg8;
            this.field3605 = new class401(this.field3621);
            this.field3606 = new class401(this.field3621);
            this.field3613 = new class401(this.field3621);
            this.field3611 = new PixelBuffer(this.field3621);
            this.field3603 = new GeometryBuffer(this.field3621);
            new GeometryBuffer(this.field3621);
            this.field4740 = this.field3629.MaxActiveLights > 0 ? this.field3629.MaxActiveLights : 8;
            this.field3609 = (this.field3629.TextureCaps & 0x10000) != 0;
            this.field3622 = (this.field3629.TextureCaps & 0x2) == 0;
            this.field4780 = (this.field3629.TextureCaps & 0x2000) != 0;
            this.field4750 = (this.field3629.TextureCaps & 0x800) != 0;
            this.field4733 = this.field3629.MaxSimultaneousTextures;
            this.field3616 = (this.field3629.TextureCaps & 0x4000) != 0;
            this.field4763 = this.field4749 > 0 || this.field3610.CheckDeviceMultiSampleType(this.field3620, this.field3623, this.field3608.BackBufferFormat, true, 2) == 0;
            this.field3612 = new boolean[this.field4733];
            this.field3619 = new boolean[this.field4733];
            this.field3624 = new boolean[this.field4733];
            this.field3625 = new boolean[this.field4733];
            this.field3617 = new int[this.field4733];
            this.field3626 = new class457[this.field4733];
            this.field3618.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method177((byte) -87);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!os", name = "E", descriptor = "(I)V")
    public final void method2123(int arg0) {
        for (int var2 = 0; var2 < this.field4733; var2++) {
            this.field3618.SetSamplerState(var2, 7, 0);
            this.field3618.SetSamplerState(var2, 6, 2);
            this.field3618.SetSamplerState(var2, 5, 2);
            this.field3618.SetSamplerState(var2, 1, 1);
            this.field3618.SetSamplerState(var2, 2, 1);
            this.field3626[var2] = class350.field5072;
            this.field3625[var2] = this.field3619[var2] = true;
            this.field3612[var2] = false;
            this.field3617[var2] = 0;
        }
        this.field3618.SetTextureStageState(0, 6, 1);
        this.field3618.SetRenderState(9, 2);
        this.field3618.SetRenderState(23, 4);
        this.field3618.SetRenderState(25, 5);
        this.field3618.SetRenderState(24, 0);
        this.field3618.SetRenderState(22, 2);
        this.field3618.SetRenderState(147, 1);
        this.field3618.SetRenderState(145, 1);
        this.field3618.method3136(38, 0.95F);
        this.field3618.SetRenderState(140, 3);
        this.field3605.SetType(3);
        this.field3606.SetType(3);
        this.field3613.SetType(1);
        this.field3630 = false;
        super.method2123(arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ltha;)V")
    public final void method165(class296 arg0) {
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
    public final void method2124(byte arg0, int arg1) {
        this.field3618.SetTextureStageState(this.field4735, 11, arg1);
        if (arg0 <= 120) {
            this.method2079(null, null, false);
        }
    }

    @OriginalMember(owner = "client!os", name = "H", descriptor = "(I)V")
    public final void method2125(int arg0) {
        this.field3618.SetTransform(3, this.field4792);
        int var2 = -75 / ((30 - arg0) / 53);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIB[BILhh;II)Lcf;")
    public final class196 method2126(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4, class250 arg5, int arg6, int arg7) {
        return arg2 == 82 ? new class275(this, arg5, arg7, arg1, arg0, arg3, arg6, arg4) : (class196) null;
    }

    @OriginalMember(owner = "client!os", name = "GA", descriptor = "(I)V")
    public final void method243(int arg0) {
        this.field3618.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)Loo;")
    public final class593 method2127(byte arg0, int arg1) {
        if (arg0 <= 72) {
            return (class593) null;
        } else if (arg1 == 3) {
            return new class417(this, this.field4705);
        } else if (arg1 == 4) {
            return new class175(this, this.field4705, this.field4687);
        } else if (arg1 == 8) {
            return new class338(this, this.field4705, this.field4687);
        } else {
            return super.method2127((byte) 85, arg1);
        }
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2128(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2129(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
