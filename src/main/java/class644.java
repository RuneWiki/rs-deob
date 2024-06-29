import jaclib.peer.class626;
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
import jagdx.class450;
import jagdx.class451;
import jagdx.class452;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class644 extends class562 {

    @OriginalMember(owner = "client!hg", name = "zg", descriptor = "Z")
    private boolean field9251 = false;

    @OriginalMember(owner = "client!hg", name = "Dg", descriptor = "I")
    private int field9255 = 0;

    @OriginalMember(owner = "client!hg", name = "Mg", descriptor = "Lao;")
    private class262 field9264;

    @OriginalMember(owner = "client!hg", name = "Bg", descriptor = "I")
    private int field9253;

    @OriginalMember(owner = "client!hg", name = "Qg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field9268;

    @OriginalMember(owner = "client!hg", name = "Sg", descriptor = "Ljaclib/peer/bda;")
    public class626 field9270;

    @OriginalMember(owner = "client!hg", name = "Gg", descriptor = "I")
    private int field9258;

    @OriginalMember(owner = "client!hg", name = "Pg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field9267;

    @OriginalMember(owner = "client!hg", name = "Lg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field9263;

    @OriginalMember(owner = "client!hg", name = "Xg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field9275;

    @OriginalMember(owner = "client!hg", name = "Og", descriptor = "Ljagdx/D3DLIGHT;")
    private class452 field9266;

    @OriginalMember(owner = "client!hg", name = "Vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class452 field9273;

    @OriginalMember(owner = "client!hg", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class452 field9269;

    @OriginalMember(owner = "client!hg", name = "Ug", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field9272;

    @OriginalMember(owner = "client!hg", name = "Eg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field9256;

    @OriginalMember(owner = "client!hg", name = "Jg", descriptor = "Z")
    public boolean field9261;

    @OriginalMember(owner = "client!hg", name = "Tg", descriptor = "Z")
    public boolean field9271;

    @OriginalMember(owner = "client!hg", name = "Ag", descriptor = "Z")
    public boolean field9252;

    @OriginalMember(owner = "client!hg", name = "Fg", descriptor = "[Z")
    private boolean[] field9257;

    @OriginalMember(owner = "client!hg", name = "Ig", descriptor = "[I")
    private int[] field9260;

    @OriginalMember(owner = "client!hg", name = "Zg", descriptor = "[Z")
    private boolean[] field9277;

    @OriginalMember(owner = "client!hg", name = "Hg", descriptor = "[Z")
    private boolean[] field9259;

    @OriginalMember(owner = "client!hg", name = "Kg", descriptor = "[Lgw;")
    private class155[] field9262;

    @OriginalMember(owner = "client!hg", name = "Yg", descriptor = "[Z")
    private boolean[] field9276;

    @OriginalMember(owner = "client!hg", name = "Cg", descriptor = "[F")
    private static float[] field9254 = new float[16];

    @OriginalMember(owner = "client!hg", name = "Ng", descriptor = "[I")
    private static int[] field9265 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!hg", name = "Wg", descriptor = "[I")
    private static int[] field9274 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lvv;B)V")
    public final void method3663(class298 arg0, byte arg1) {
        if (arg1 != 45) {
            this.field9259 = null;
        }
        this.field9267.SetTexture(this.field8181, arg0.method772((byte) 122));
        if (this.field9262[this.field8181] != arg0.field4453) {
            int var3 = method3664(arg0.field4453, (byte) -128);
            this.field9267.SetSamplerState(this.field8181, 6, var3);
            this.field9267.SetSamplerState(this.field8181, 5, var3);
            this.field9262[this.field8181] = arg0.field4453;
            if (this.field9257[this.field8181] != arg0.field4456) {
                this.field9267.SetSamplerState(this.field8181, 7, arg0.field4456 ? method3664(arg0.field4453, (byte) -109) : 0);
                this.field9257[this.field8181] = arg0.field4456;
            }
        } else if (arg0.field4456 != this.field9257[this.field8181]) {
            this.field9267.SetSamplerState(this.field8181, 7, arg0.field4456 ? method3664(arg0.field4453, (byte) -101) : 0);
            this.field9257[this.field8181] = arg0.field4456;
        }
        if (!this.field9277[this.field8181]) {
            this.field9277[this.field8181] = true;
            this.method2900((byte) -98);
            this.method2870(0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(ZZ)V")
    public final void method2843(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method2898((byte) 78, null, null, 19, 40);
        }
        this.field9267.method2718(161, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "(I)V")
    public final void method2888(int arg0) {
        if (arg0 != 21175) {
            this.field9253 = 65;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lgw;B)I")
    private static final int method3664(class155 arg0, byte arg1) {
        if (arg1 > -82) {
            return -110;
        } else if (class34.field969 == arg0) {
            return 2;
        } else if (class540.field7542 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcb;B)I")
    private static final int method3665(class483 arg0, byte arg1) {
        if (arg1 <= 20) {
            field9274 = null;
        }
        if (class525.field7399 == arg0) {
            return 2;
        } else if (class509.field7205 == arg0) {
            return 4;
        } else if (class42.field1079 == arg0) {
            return 26;
        } else if (class121.field2184 == arg0) {
            return 7;
        } else if (class205.field3145 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "()V")
    public final void method174() {
    }

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "()V")
    public final void method94() {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public final void method2853(Object arg0, Canvas arg1, byte arg2) {
        int var4 = 101 / ((49 - arg2) / 45);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V")
    public final void method2877(byte arg0) {
        if (this.field9277[this.field8181]) {
            this.field9277[this.field8181] = false;
            this.field9267.SetTexture(this.field8181, null);
            this.method2900((byte) -99);
            this.method2870(0);
        }
        if (arg0 != 29) {
            this.field9253 = -91;
        }
    }

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "(I)V")
    public final void method2849(int arg0) {
        if (this.field8136[this.field8181] == class496.field7062) {
            this.field9267.SetTextureStageState(this.field8181, 24, 0);
            this.field9260[this.field8181] = 0;
        } else {
            if (this.field8136[this.field8181] == class537.field7515) {
                this.field9267.SetTransform(this.field8181 + 16, this.field8193[this.field8181].method2422(16398, field9254));
            } else {
                this.field9267.SetTransform(this.field8181 + 16, this.field8193[this.field8181].method2401(field9254, -6096));
            }
            int var2 = method3667(this.field8136[this.field8181], (byte) -23);
            if (this.field9260[this.field8181] != var2) {
                this.field9267.SetTextureStageState(this.field8181, 24, var2);
                this.field9260[this.field8181] = var2;
            }
        }
        int var3 = 90 / ((-arg0 - 36) / 63);
    }

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "(I)V")
    public final void method2855(int arg0) {
        this.field9267.method2718(7, this.field8172);
        if (arg0 != -1) {
            this.field9272 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(IIII)[I")
    public final int[] method50(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field9267.method2709(0);
        IDirect3DSurface var7 = this.field9267.method2702(arg2, arg3, 21, 0, 0, true);
        if (class451.method2727(this.field9267.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 3102) && class451.method2727(var7.LockRect(0, 0, arg2, arg3, 0, this.field9272), 3102)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field9272.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field9272.method2724(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field9272.method2724(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3595((byte) -67);
        var7.method3595((byte) -67);
        return var5;
    }

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "(I)Z")
    private final boolean method3666(int arg0) {
        if (arg0 != -1242) {
            field9265 = null;
        }
        int var2 = this.field9267.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class262 var3 = (class262) this.field7911;
            this.method3267(false);
            var3.method1718(0);
            this.field9268.BackBufferWidth = 0;
            this.field9268.BackBufferHeight = 0;
            if (method3672(this.field9263, this.field8190, arg0 ^ 0x4B1, this.field9258, this.field9268, this.field9253)) {
                int var4 = this.field9267.Reset(this.field9268);
                if (class451.method2727(var4, 3102)) {
                    var3.method1716(this.field9267.method2714(0), 127, this.field9267.method2711());
                    this.method3245(-27605);
                    this.method2852(-1);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "()V")
    public final void method40() {
        this.field9270.method3590(2340);
        super.method40();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method2874(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != -18862) {
            this.field9267 = null;
        }
        this.field9264 = (class262) arg1;
    }

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "(I)V")
    public final void method2870(int arg0) {
        int var2 = this.field9277[this.field8181] ? method3665(this.field8117[this.field8181], (byte) 119) : 1;
        this.field9267.SetTextureStageState(this.field8181, 1, var2);
        if (arg0 != 0) {
            this.field9275 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/bda;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lao;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lom;I)V")
    private class644(int arg0, int arg1, Canvas arg2, class626 arg3, IDirect3D arg4, IDirect3DDevice arg5, class262 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class214 arg9, class344 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field9264 = arg6;
        this.field9253 = arg1;
        this.field9268 = arg7;
        this.field9270 = arg3;
        this.field9258 = arg0;
        this.field9267 = arg5;
        this.field9263 = arg4;
        this.field9275 = arg8;
        this.field9266 = new class452(this.field9270);
        this.field9273 = new class452(this.field9270);
        this.field9269 = new class452(this.field9270);
        this.field9272 = new PixelBuffer(this.field9270);
        this.field9256 = new GeometryBuffer(this.field9270);
        new GeometryBuffer(this.field9270);
        this.field8171 = (this.field9275.TextureCaps & 0x2000) != 0;
        this.field9261 = (this.field9275.TextureCaps & 0x4000) != 0;
        this.field9271 = (this.field9275.TextureCaps & 0x10000) != 0;
        this.field8185 = this.field9275.MaxActiveLights <= 0 ? 8 : this.field9275.MaxActiveLights;
        this.field8189 = this.field9275.MaxSimultaneousTextures;
        this.field8122 = (this.field9275.TextureCaps & 0x800) != 0;
        this.field9252 = (this.field9275.TextureCaps & 0x2) == 0;
        this.field8131 = this.field8190 > 0 || this.field9263.CheckDeviceMultiSampleType(this.field9258, this.field9253, this.field9268.BackBufferFormat, true, 2) == 0;
        this.field9257 = new boolean[this.field8189];
        this.field9260 = new int[this.field8189];
        this.field9277 = new boolean[this.field8189];
        this.field9259 = new boolean[this.field8189];
        this.field9262 = new class155[this.field8189];
        this.field9276 = new boolean[this.field8189];
        this.field9267.BeginScene();
    }

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "()V")
    public final void method106() {
    }

    @OriginalMember(owner = "client!hg", name = "DA", descriptor = "()I")
    public final int method116() {
        return 0;
    }

    @OriginalMember(owner = "client!hg", name = "ja", descriptor = "(I)V")
    public final void method42(int arg0) {
        this.field9267.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLsh;)V")
    public final void method2858(byte arg0, class62 arg1) {
        int var3 = 0;
        if (class356.field5328 == arg1) {
            var3 = 65536;
        } else if (class705.field9924 == arg1) {
            var3 = 131072;
        } else if (class172.field2837 == arg1) {
            var3 = 196608;
        }
        this.field9267.SetTextureStageState(this.field8181, 11, this.field8181 | var3);
        if (arg0 != 61) {
            this.method2853(null, null, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!hg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lom;Ljava/lang/Integer;)Lr;")
    public static final class167 createToolkit(Canvas arg0, class214 arg1, class344 arg2, Integer arg3) {
        class644 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class626 var7 = new class626();
            IDirect3D var8 = IDirect3D.method2699(-2147483616, var7);
            D3DCAPS var9 = var8.method2700(var5, var6);
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
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3672(var8, arg3, -93, var5, var10, var6)) {
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
                    var13 = var8.method2701(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class450 var17) {
                    var13 = var8.method2701(var5, var6, arg0, var11 | 0x20, var10);
                }
                class262 var15 = new class262(var13.method2714(0), var13.method2711());
                var4 = new class644(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3255((byte) 89);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method40();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZZ)Lwl;")
    public final class378 method2851(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field9273 = null;
        }
        return new class652(this, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILwl;)V")
    public final void method2873(int arg0, int arg1, class378 arg2) {
        if (arg0 != 1) {
            method3664(null, (byte) 40);
        }
        class652 var4 = (class652) arg2;
        this.field9267.SetStreamSource(arg1, var4.field9402, 0, var4.method3721((byte) 34));
    }

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "(B)V")
    public final void method2887(byte arg0) {
        if (arg0 != -36) {
            this.field9264 = null;
        }
        this.field9267.method2718(15, this.field8170);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(II)Lne;")
    public final class292 method2869(int arg0, int arg1) {
        if (arg0 != 7) {
            this.field9267 = null;
        }
        if (arg1 == 3) {
            return new class179(this, this.field7936);
        } else if (arg1 == 4) {
            return new class276(this, this.field7936, this.field7955);
        } else if (arg1 == 8) {
            return new class587(this, this.field7936, this.field7955);
        } else {
            return super.method2869(arg0 ^ 0x0, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()V")
    public final void method111() {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lro;Lfda;B)Z")
    public final boolean method2848(class2 arg0, class294 arg1, byte arg2) {
        int var4 = 28 / ((arg2 + 1) / 63);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class451.method2727(this.field9263.method2698(this.field9258, var5), 3102) && class451.method2727(this.field9263.CheckDeviceFormat(this.field9258, this.field9253, var5.Format, 0, 3, method3668(0, arg1, arg0)), 3102);
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "(I)V")
    public final void method2852(int arg0) {
        for (int var2 = 0; var2 < this.field8189; var2++) {
            this.field9267.SetSamplerState(var2, 7, 0);
            this.field9267.SetSamplerState(var2, 6, 2);
            this.field9267.SetSamplerState(var2, 5, 2);
            this.field9267.SetSamplerState(var2, 1, 1);
            this.field9267.SetSamplerState(var2, 2, 1);
            this.field9262[var2] = class34.field969;
            this.field9276[var2] = this.field9259[var2] = true;
            this.field9257[var2] = false;
            this.field9260[var2] = 0;
        }
        this.field9267.SetTextureStageState(0, 6, 1);
        this.field9267.SetRenderState(9, 2);
        this.field9267.SetRenderState(23, 4);
        this.field9267.SetRenderState(25, 5);
        this.field9267.SetRenderState(24, 0);
        this.field9267.SetRenderState(22, 2);
        this.field9267.SetRenderState(147, 1);
        this.field9267.SetRenderState(145, 1);
        this.field9267.method2716(38, 0.95F);
        this.field9267.SetRenderState(140, 3);
        this.field9266.SetType(3);
        this.field9273.SetType(3);
        this.field9269.SetType(1);
        this.field9251 = false;
        super.method2852(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltf;III)V")
    public final void method2859(class269 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            this.field9255 = -6;
        }
        this.field9267.DrawPrimitive(method3669(-125, arg0), arg1, arg3);
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
    public final void method2841(int arg0) {
        this.field9267.SetScissorRect(this.field8188 + this.field8134, this.field8175 + this.field8113, this.field8132, this.field8152);
        if (arg0 != 8) {
            this.field9263 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z[[III)Lpu;")
    public final class524 method2844(boolean arg0, int[][] arg1, int arg2, int arg3) {
        int var5 = 18 / ((arg3 - 86) / 35);
        return new class564(this, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "(I)V")
    public final void method2854(int arg0) {
        this.field9267.method2718(14, this.field8201 && this.field8186);
        if (arg0 != 2) {
            this.method2853(null, null, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
    public final void method2() {
        IDirect3DEventQuery var1 = this.field9267.method2713();
        if (class451.method2727(var1.Issue(), 3102)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3595((byte) -67);
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(B)V")
    public final void method2883(byte arg0) {
        if (arg0 > -117) {
            this.field9275 = null;
        }
        this.method2867((byte) 124);
        this.method2899(11160);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljv;B)I")
    private static final int method3667(class71 arg0, byte arg1) {
        if (class641.field9220 == arg0) {
            return 1;
        } else if (class662.field9533 == arg0) {
            return 2;
        } else if (class634.field9110 == arg0) {
            return 3;
        } else if (class537.field7515 == arg0) {
            return 4;
        } else if (class678.field9627 == arg0) {
            return 256;
        } else {
            int var2 = 10 / ((arg1 - 80) / 36);
            return 0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "ya", descriptor = "()V")
    public final void method28() {
        this.method3253(-25293, true);
        this.field9267.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "(I)V")
    public final void method2885(int arg0) {
        this.field9267.method2718(137, this.field8182 && !this.field8155);
        int var2 = -119 % ((-arg0 - 82) / 42);
    }

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "(B)V")
    public final void method2884(byte arg0) {
        if (arg0 >= -127) {
            this.field9269 = null;
        }
        this.field9267.method2718(174, this.field8227);
    }

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "(I)V")
    public final void method2893(int arg0) {
        int var2 = -128 % ((35 - arg0) / 33);
        this.field9267.SetViewport(this.field8188, this.field8113, this.field8023, this.field7924, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Low;IZZI)V")
    public final void method2845(class319 arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        int var6 = 0;
        if (arg1 < 8) {
            this.field9261 = false;
        }
        byte var8;
        if (arg4 == 1) {
            var8 = 3;
        } else if (arg4 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg2) {
            var6 |= 0x20;
        }
        if (arg3) {
            var6 |= 0x10;
        }
        this.field9267.SetTextureStageState(this.field8181, var8, method3670(67, arg0) | var6);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lro;Lfda;B)Z")
    public final boolean method2871(class2 arg0, class294 arg1, byte arg2) {
        if (arg2 < 125) {
            return true;
        } else {
            D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
            return class451.method2727(this.field9263.method2698(this.field9258, var4), 3102) && class451.method2727(this.field9263.CheckDeviceFormat(this.field9258, this.field9253, var4.Format, 0, 4, method3668(0, arg1, arg0)), 3102);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILfda;Lro;)I")
    public static final int method3668(int arg0, class294 arg1, class2 arg2) {
        if (class2.field372 == arg2) {
            if (class610.field8884 == arg1) {
                return 22;
            }
            if (class121.field2214 == arg1) {
                return 21;
            }
            if (class410.field5938 == arg1) {
                return 28;
            }
            if (class101.field1782 == arg1) {
                return 50;
            }
            if (class288.field4304 == arg1) {
                return 51;
            }
            if (class364.field5413 == arg1) {
                return 77;
            }
        }
        if (arg0 == 0) {
            throw new IllegalArgumentException("");
        }
        return -113;
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(B)V")
    public final void method2866(byte arg0) {
        this.field9267.method2718(28, this.field8169 && this.field8150 && this.field8187 >= 0);
        if (arg0 != -119) {
            this.method2861(16, 99, 98, 3, true, null, -77);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lfda;[BIIII)Lgv;")
    public final class73 method2842(class294 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -15004) {
            this.field9273 = null;
        }
        return new class68(this, arg0, arg5, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(FFF)V")
    public final void method27(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "()Z")
    public final boolean method162() {
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(Z)V")
    public final void method2865(boolean arg0) {
        if (!arg0) {
            this.method89(null, null, 0.5258218F, null);
        }
        this.field9267.method2718(27, this.field8146);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLfda;Lro;II)Lhi;")
    public final class190 method2898(byte arg0, class294 arg1, class2 arg2, int arg3, int arg4) {
        return arg0 <= 71 ? (class190) null : new class131(this, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(Z)V")
    public final void method2891(boolean arg0) {
        this.field8204 = (this.field8120 - this.field8111);
        if (!arg0) {
            return;
        }
        this.field8137 = (float) (-this.field8187) + this.field8204;
        if (this.field8137 < (float) this.field8135) {
            this.field8137 = this.field8135;
        }
        this.field9267.method2716(36, this.field8137);
        this.field9267.method2716(37, this.field8204);
        this.field9267.SetRenderState(34, this.field8154);
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public final synchronized void method122(int arg0) {
        this.field9270.method3593(-12435);
        super.method122(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILtf;)I")
    private static final int method3669(int arg0, class269 arg1) {
        if (arg0 >= -93) {
            field9265 = null;
        }
        if (class336.field5029 == arg1) {
            return 2;
        } else if (class65.field1441 == arg1) {
            return 3;
        } else if (class631.field9085 == arg1) {
            return 1;
        } else if (class634.field9107 == arg1) {
            return 4;
        } else if (class645.field9293 == arg1) {
            return 6;
        } else if (class474.field6722 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "(I)V")
    public final void method2899(int arg0) {
        if (arg0 != 11160) {
            this.method140(45, 39, -21, -99);
        }
        if (this.field9251) {
            return;
        }
        this.field9267.LightEnable(0, false);
        this.field9267.LightEnable(1, false);
        this.field9267.SetLight(0, this.field9266);
        this.field9267.SetLight(1, this.field9273);
        this.field9267.LightEnable(0, true);
        this.field9267.LightEnable(1, true);
        this.field9251 = true;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILow;)I")
    private static final int method3670(int arg0, class319 arg1) {
        if (class435.field6296 == arg1) {
            return 2;
        } else if (class20.field843 == arg1) {
            return 0;
        } else if (class661.field9521 == arg1) {
            return 1;
        } else if (class370.field5487 == arg1) {
            return 3;
        } else if (arg0 < 61) {
            return 27;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "()V")
    public final void method63() throws class105 {
        this.field9267.EndScene();
        if (this.field9264.method1717(-14214)) {
            this.field9255 = 0;
            if (class451.method2726(this.field9264.method1715(0, (byte) -75), (byte) -75)) {
                this.method3666(-1242);
            }
        } else if ((++this.field9255) <= 50) {
            this.method3666(-1242);
        } else {
            throw new class105();
        }
        this.field9267.BeginScene();
    }

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "(B)V")
    public final void method2867(byte arg0) {
        float var2 = this.field8119 ? this.field8198 : 0.0F;
        float var3 = this.field8119 ? -this.field8164 : 0.0F;
        this.field9266.SetDiffuse(this.field8162 * var2, this.field8159 * var2, this.field8133 * var2, 0.0F);
        this.field9273.SetDiffuse(this.field8162 * var3, this.field8159 * var3, this.field8133 * var3, 0.0F);
        if (arg0 < 123) {
            this.method2843(true, true);
        }
        this.field9251 = false;
    }

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "(I)F")
    public final float method2846(int arg0) {
        if (arg0 != -15839) {
            this.field9277 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILaw;)V")
    public final void method3671(int arg0, class68 arg1) {
        this.method3663(arg1, (byte) 45);
        if (!this.field9276[this.field8181]) {
            this.field9267.SetSamplerState(this.field8181, 1, 1);
            this.field9276[this.field8181] = true;
        }
        if (arg0 != -38) {
            this.method2848(null, null, (byte) -2);
        }
        if (!this.field9259[this.field8181]) {
            this.field9267.SetSamplerState(this.field8181, 2, 1);
            this.field9259[this.field8181] = true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljagdx/IDirect3D;IIILjagdx/D3DPRESENT_PARAMETERS;I)Z")
    private static final boolean method3672(IDirect3D arg0, int arg1, int arg2, int arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        if (arg2 >= -79) {
            field9274 = null;
        }
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class451.method2726(arg0.method2698(arg3, var9), (byte) -114)) {
                return false;
            }
            label80: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field9265.length; var10++) {
                        if (arg0.CheckDeviceType(arg3, arg5, var9.Format, field9265[var10], true) == 0 && arg0.CheckDeviceFormat(arg3, arg5, var9.Format, 1, 1, field9265[var10]) == 0 && (arg1 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg5, field9265[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field9274.length; var11++) {
                                if (arg0.CheckDeviceFormat(arg3, arg5, var9.Format, 2, 1, field9274[var11]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg5, var9.Format, field9265[var10], field9274[var11]) == 0 && (arg1 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg5, field9274[var10], true, var8) == 0)) {
                                    var6 = field9274[var11];
                                    var7 = field9265[var10];
                                    break label80;
                                }
                            }
                        }
                    }
                }
                arg1--;
            }
            if (arg1 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg4.BackBufferFormat = var7;
            arg4.MultiSampleQuality = 0;
            arg4.AutoDepthStencilFormat = var6;
            arg4.MultiSampleType = var8;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltf;IIIIILor;)V")
    public final void method2872(class269 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class595 arg6) {
        this.field9267.SetIndices(((class187) arg6).field3002);
        if (arg2 >= -50) {
            this.method2852(-48);
        }
        this.field9267.DrawIndexedPrimitive(method3669(-111, arg0), 0, arg1, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V")
    public final void method2895(boolean arg0) {
        if (arg0) {
            this.method2871(null, null, (byte) -27);
        }
        if (class199.field3097 == this.field8108) {
            this.field9267.SetRenderState(19, 5);
            this.field9267.SetRenderState(20, 6);
        } else if (class438.field6312 == this.field8108) {
            this.field9267.SetRenderState(19, 2);
            this.field9267.SetRenderState(20, 2);
        } else if (class42.field1081 == this.field8108) {
            this.field9267.SetRenderState(19, 9);
            this.field9267.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
    public final void method2864(int arg0) {
        if (this.field8106.method959((byte) 83)) {
            this.field8102.method2422(16398, field9254);
        } else {
            field9254[13] = 0.0F;
            field9254[6] = 0.0F;
            field9254[14] = 0.0F;
            field9254[5] = 1.0F;
            field9254[1] = 0.0F;
            field9254[9] = 0.0F;
            field9254[12] = 0.0F;
            field9254[11] = 0.0F;
            field9254[10] = 1.0F;
            field9254[2] = 0.0F;
            field9254[3] = 0.0F;
            field9254[15] = 1.0F;
            field9254[4] = 0.0F;
            field9254[7] = 0.0F;
            field9254[0] = 1.0F;
            field9254[8] = 0.0F;
        }
        if (arg0 < 125) {
            this.method174();
        }
        this.field9267.SetTransform(2, field9254);
    }

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "()Lmp;")
    public final class706 method19() {
        D3DADAPTER_IDENTIFIER var1 = this.field9263.method2697(this.field9258, 0);
        return new class706(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method29(Rectangle[] arg0, int arg1) throws class105 {
        this.method63();
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(BI)V")
    public final void method2886(byte arg0, int arg1) {
        if (arg0 < -54) {
            this.field9267.SetTextureStageState(this.field8181, 11, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(Z)V")
    public final void method2881(boolean arg0) {
        if (!arg0) {
            this.field9277 = null;
        }
        this.field9267.SetTransform(3, this.field8168);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method2857(Canvas arg0, byte arg1, Object arg2) {
        if (this.field7976 == arg0) {
            Dimension var4 = arg0.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field9267.EndScene();
                this.method3666(-1242);
                this.field9267.BeginScene();
            }
        }
        int var5 = -104 / ((arg1 + 7) / 53);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILfda;Z[BBI)Lhi;")
    public final class190 method2897(int arg0, int arg1, int arg2, class294 arg3, boolean arg4, byte[] arg5, byte arg6, int arg7) {
        if (arg6 <= 55) {
            method3668(-81, null, null);
        }
        return new class131(this, arg3, arg7, arg1, arg4, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZI)Lor;")
    public final class595 method2876(boolean arg0, int arg1) {
        return arg1 == 3 ? new class187(this, class2.field373, arg0) : (class595) null;
    }

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "(I)V")
    public final void method2890(int arg0) {
        if (arg0 > 80) {
            this.field9266.SetAmbient(this.field8162 * this.field8157, this.field8159 * this.field8157, this.field8157 * this.field8133, 0.0F);
            this.field9251 = false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBZLow;)V")
    public final void method2860(int arg0, byte arg1, boolean arg2, class319 arg3) {
        int var5 = 2 % ((-arg1 - 3) / 40);
        int var6 = 0;
        byte var8;
        if (arg0 == 1) {
            var8 = 6;
        } else if (arg0 == 2) {
            var8 = 27;
        } else {
            var8 = 5;
        }
        if (arg2) {
            var6 |= 0x10;
        }
        this.field9267.SetTextureStageState(this.field8181, var8, method3670(92, arg3) | var6);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILkr;)V")
    public final void method2862(int arg0, class693 arg1) {
        if (arg0 != 13427) {
            this.field9251 = true;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field9267.SetVertexDeclaration(var3.field4428);
    }

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "(B)V")
    public final void method2850(byte arg0) {
        this.field9266.SetDirection(-this.field8105[0], -this.field8105[1], -this.field8105[2]);
        this.field9273.SetDirection(-this.field8143[0], -this.field8143[1], -this.field8143[2]);
        this.field9251 = false;
        if (arg0 != 108) {
            this.method2851(false, false);
        }
    }

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "(B)V")
    public final void method2892(byte arg0) {
        if (this.field8092) {
            field9254[5] = 1.0F;
            field9254[4] = 0.0F;
            field9254[10] = 1.0F;
            field9254[2] = 0.0F;
            field9254[14] = 0.0F;
            field9254[15] = 1.0F;
            field9254[0] = 1.0F;
            field9254[8] = 0.0F;
            field9254[1] = 0.0F;
            field9254[12] = 0.0F;
            field9254[7] = 0.0F;
            field9254[6] = 0.0F;
            field9254[11] = 0.0F;
            field9254[9] = 0.0F;
            field9254[13] = 0.0F;
            field9254[3] = 0.0F;
        } else {
            this.field8091.method2422(16398, field9254);
        }
        int var2 = 119 / ((7 - arg0) / 47);
        this.field9267.SetTransform(256, field9254);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lct;B)V")
    public final void method3673(class131 arg0, byte arg1) {
        this.method3663(arg0, (byte) 45);
        if (this.field9276[this.field8181] != arg0.field2355) {
            this.field9267.SetSamplerState(this.field8181, 1, arg0.field2355 ? 1 : 3);
            this.field9276[this.field8181] = arg0.field2355;
        }
        if (this.field9259[this.field8181] != arg0.field2356) {
            this.field9267.SetSamplerState(this.field8181, 2, arg0.field2356 ? 1 : 3);
            this.field9259[this.field8181] = arg0.field2356;
        }
        if (arg1 >= -20) {
            this.field9259 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "(Z)V")
    public final void method2875(boolean arg0) {
        int var2;
        for (var2 = 0; var2 < this.field8197; var2++) {
            class9 var3 = this.field8142[var2];
            int var4 = var2 + 2;
            int var5 = var3.method269(true);
            float var6 = var3.method277(-1) / 255.0F;
            this.field9269.SetPosition((float) var3.method276(-1), (float) var3.method273(false), (float) var3.method270(-99));
            this.field9269.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field9269.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method274((byte) 34) * var3.method274((byte) 34)));
            this.field9269.SetRange((float) var3.method274((byte) 34));
            this.field9267.SetLight(var4, this.field9269);
            this.field9267.LightEnable(var4, true);
        }
        while (var2 < this.field8179) {
            this.field9267.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2875(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIZ[II)Lhi;")
    public final class190 method2861(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6) {
        if (arg2 != 8) {
            field9274 = null;
        }
        return new class131(this, arg3, arg1, arg4, arg5, arg6, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[FZIIILfda;I)Lhi;")
    public final class190 method2863(int arg0, float[] arg1, boolean arg2, int arg3, int arg4, int arg5, class294 arg6, int arg7) {
        return arg4 == -14125 ? null : (class190) null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lf;Z)V")
    public final void method132(class702 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "(I)V")
    public final void method2894(int arg0) {
        if (arg0 == 0) {
            this.field9267.SetRenderState(60, this.field8158);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Lrk;)Lkr;")
    public final class693 method2878(int arg0, class30[] arg1) {
        return arg0 >= -10 ? (class693) null : new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "()Z")
    public final boolean method181() {
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method2868(byte arg0, Canvas arg1) {
        return arg0 == 50 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljs;Ljs;FLjs;)Ljs;")
    public final class304 method89(class304 arg0, class304 arg1, float arg2, class304 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(B)V")
    public final void method2900(byte arg0) {
        int var2 = this.field9277[this.field8181] ? method3665(this.field8153[this.field8181], (byte) 121) : 1;
        this.field9267.SetTextureStageState(this.field8181, 4, var2);
        if (arg0 > -38) {
            this.field9277 = null;
        }
    }
}
