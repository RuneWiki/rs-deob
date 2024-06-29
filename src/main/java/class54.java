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
import jagdx.class450;
import jagdx.class451;
import jagdx.class452;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class54 extends class223 {

    @OriginalMember(owner = "client!tga", name = "Dg", descriptor = "I")
    private int field679 = 0;

    @OriginalMember(owner = "client!tga", name = "Cg", descriptor = "Z")
    private boolean field678 = false;

    @OriginalMember(owner = "client!tga", name = "Yg", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!tga", name = "Ug", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field696;

    @OriginalMember(owner = "client!tga", name = "Pg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field691;

    @OriginalMember(owner = "client!tga", name = "Xg", descriptor = "Ljaclib/peer/dj;")
    public class630 field699;

    @OriginalMember(owner = "client!tga", name = "Mg", descriptor = "Lmb;")
    private class246 field688;

    @OriginalMember(owner = "client!tga", name = "Lg", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!tga", name = "Rg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field693;

    @OriginalMember(owner = "client!tga", name = "Kg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field686;

    @OriginalMember(owner = "client!tga", name = "Ig", descriptor = "Ljagdx/D3DLIGHT;")
    private class452 field684;

    @OriginalMember(owner = "client!tga", name = "Sg", descriptor = "Ljagdx/D3DLIGHT;")
    private class452 field694;

    @OriginalMember(owner = "client!tga", name = "Jg", descriptor = "Ljagdx/D3DLIGHT;")
    private class452 field685;

    @OriginalMember(owner = "client!tga", name = "Og", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field690;

    @OriginalMember(owner = "client!tga", name = "Eg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field680;

    @OriginalMember(owner = "client!tga", name = "Tg", descriptor = "Z")
    public boolean field695;

    @OriginalMember(owner = "client!tga", name = "Qg", descriptor = "Z")
    public boolean field692;

    @OriginalMember(owner = "client!tga", name = "Vg", descriptor = "Z")
    public boolean field697;

    @OriginalMember(owner = "client!tga", name = "Hg", descriptor = "[Z")
    private boolean[] field683;

    @OriginalMember(owner = "client!tga", name = "Ng", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!tga", name = "zg", descriptor = "[Z")
    private boolean[] field675;

    @OriginalMember(owner = "client!tga", name = "Zg", descriptor = "[Z")
    private boolean[] field701;

    @OriginalMember(owner = "client!tga", name = "Ag", descriptor = "[Z")
    private boolean[] field676;

    @OriginalMember(owner = "client!tga", name = "Wg", descriptor = "[Lju;")
    private class115[] field698;

    @OriginalMember(owner = "client!tga", name = "Bg", descriptor = "[I")
    private static int[] field677 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!tga", name = "Gg", descriptor = "[I")
    private static int[] field682 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!tga", name = "Fg", descriptor = "[F")
    private static float[] field681 = new float[16];

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "()V")
    public final void method312() {
        IDirect3DEventQuery var1 = this.field696.method2471();
        if (class451.method2482(14528, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3542(123);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILnh;ILjr;I)Lem;")
    public final class212 method313(int arg0, class699 arg1, int arg2, class100 arg3, int arg4) {
        if (arg2 != 9) {
            this.field686 = null;
        }
        return new class9(this, arg1, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZIIILnh;[BI)Lem;")
    public final class212 method314(int arg0, boolean arg1, int arg2, int arg3, int arg4, class699 arg5, byte[] arg6, int arg7) {
        int var9 = -19 % ((42 - arg0) / 58);
        return new class9(this, arg5, arg4, arg3, arg1, arg6, arg2, arg7);
    }

    @OriginalMember(owner = "client!tga", name = "D", descriptor = "(I)V")
    public final void method315(int arg0) {
        this.field696.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;I)Z")
    private static final boolean method316(int arg0, int arg1, int arg2, IDirect3D arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        if (arg5 >= -3) {
            return false;
        }
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class451.method2481(-2147467259, arg3.method2462(arg1, var9))) {
                return false;
            }
            label81: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field682.length; var10++) {
                        if (arg3.CheckDeviceType(arg1, arg2, var9.Format, field682[var10], true) == 0 && arg3.CheckDeviceFormat(arg1, arg2, var9.Format, 1, 1, field682[var10]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, field682[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field677.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg1, arg2, var9.Format, 2, 1, field677[var11]) == 0 && arg3.CheckDepthStencilMatch(arg1, arg2, var9.Format, field682[var10], field677[var11]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, field677[var10], true, var8) == 0)) {
                                    var7 = field682[var10];
                                    var6 = field677[var11];
                                    break label81;
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
            arg4.AutoDepthStencilFormat = var6;
            arg4.MultiSampleType = var8;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "()Ltaa;")
    public final class379 method317() {
        D3DADAPTER_IDENTIFIER var1 = this.field691.method2461(this.field687, 0);
        return new class379(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "()V")
    public final void method318() throws class202 {
        this.field696.EndScene();
        if (this.field688.method1477(-11206)) {
            this.field679 = 0;
            if (class451.method2481(-2147467259, this.field688.method1476(0, true))) {
                this.method324(0);
            }
        } else if ((++this.field679) <= 50) {
            this.method324(0);
        } else {
            throw new class202();
        }
        this.field696.BeginScene();
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lnba;Z)V")
    public final void method319(class278 arg0, boolean arg1) {
        int var3 = 0;
        if (class449.field5650 == arg0) {
            var3 = 65536;
        } else if (class472.field5838 == arg0) {
            var3 = 131072;
        } else if (class319.field3989 == arg0) {
            var3 = 196608;
        }
        this.field696.SetTextureStageState(this.field2841, 11, var3 | this.field2841);
        if (arg1) {
            this.field694 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "(I)V")
    public final void method320(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field2864; var2++) {
            class227 var3 = this.field2877[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1372(arg0 ^ 0x76AA);
            float var6 = var3.method1368(128) / 255.0F;
            this.field685.SetPosition((float) var3.method1374((byte) 104), (float) var3.method1373((byte) 32), (float) var3.method1370((byte) -5));
            this.field685.SetDiffuse((float) ((var5 & 0xFF8213) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field685.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1367(arg0 - 30391) * var3.method1367(-115)));
            this.field685.SetRange((float) var3.method1367(-68));
            this.field696.SetLight(var4, this.field685);
            this.field696.LightEnable(var4, true);
        }
        while (var2 < this.field2849) {
            this.field696.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method320(arg0);
    }

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "(B)V")
    public final void method321(byte arg0) {
        if (arg0 == 67) {
            this.field696.SetViewport(this.field2868, this.field2840, this.field2602, this.field2751, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!tga", name = "B", descriptor = "()V")
    public final void method322() {
        this.method1272(true, (byte) -84);
        this.field696.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!tga", name = "G", descriptor = "(I)V")
    public final void method323(int arg0) {
        this.field696.method2470(28, this.field2831 && this.field2783 && this.field2861 | this.field2837 >= 0);
        int var2 = -83 / ((77 - arg0) / 33);
    }

    @OriginalMember(owner = "client!tga", name = "ab", descriptor = "(I)Z")
    private final boolean method324(int arg0) {
        int var2 = this.field696.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class246 var3 = (class246) this.field2649;
            this.method1280(true);
            var3.method1474(true);
            this.field686.BackBufferHeight = 0;
            this.field686.BackBufferWidth = 0;
            if (method316(this.field2853, this.field687, this.field700, this.field691, this.field686, -61)) {
                int var4 = this.field696.Reset(this.field686);
                if (class451.method2482(14528, var4)) {
                    var3.method1475(this.field696.method2465(0), (byte) 76, this.field696.method2477());
                    this.method1291(0);
                    this.method368(-1);
                    return true;
                }
            }
        }
        if (arg0 != 0) {
            this.method340((byte) 126, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "()V")
    public final void method325() {
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method326(int arg0, Canvas arg1) {
        if (arg0 != 0) {
            this.field701 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!tga", name = "w", descriptor = "()V")
    public final void method327() {
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILsv;II)V")
    public final void method328(int arg0, class617 arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            this.field698 = null;
        }
        this.field696.DrawPrimitive(method342(30532, arg1), arg3, arg2);
    }

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "(Z)V")
    public final void method329(boolean arg0) {
        if (arg0) {
            field681 = null;
        }
        if (this.field2812[this.field2841] == class124.field1521) {
            this.field696.SetTextureStageState(this.field2841, 24, 0);
            this.field689[this.field2841] = 0;
            return;
        }
        if (this.field2812[this.field2841] == class582.field7831) {
            this.field696.SetTransform(this.field2841 + 16, this.field2838[this.field2841].method3219(field681, (byte) -124));
        } else {
            this.field696.SetTransform(this.field2841 + 16, this.field2838[this.field2841].method3228(21597, field681));
        }
        int var2 = method330((byte) 83, this.field2812[this.field2841]);
        if (this.field689[this.field2841] != var2) {
            this.field696.SetTextureStageState(this.field2841, 24, var2);
            this.field689[this.field2841] = var2;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLra;)I")
    private static final int method330(byte arg0, class98 arg1) {
        if (class576.field7571 == arg1) {
            return 1;
        } else if (class228.field2942 == arg1) {
            return 2;
        } else if (class95.field1227 == arg1) {
            return 3;
        } else if (class582.field7831 == arg1) {
            return 4;
        } else if (class47.field632 == arg1) {
            return 256;
        } else {
            if (arg0 < 70) {
                method338(66, null, null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lff;B)V")
    public final void method331(class9 arg0, byte arg1) {
        this.method337(arg0, true);
        if (this.field675[this.field2841] != arg0.field87) {
            this.field696.SetSamplerState(this.field2841, 1, arg0.field87 ? 1 : 3);
            this.field675[this.field2841] = arg0.field87;
        }
        if (this.field701[this.field2841] != arg0.field90) {
            this.field696.SetSamplerState(this.field2841, 2, arg0.field90 ? 1 : 3);
            this.field701[this.field2841] = arg0.field90;
        }
        if (arg1 >= -57) {
            this.field687 = -25;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lns;B)I")
    private static final int method332(class375 arg0, byte arg1) {
        if (arg1 != 45) {
            return -20;
        } else if (class291.field3672 == arg0) {
            return 2;
        } else if (class607.field8276 == arg0) {
            return 4;
        } else if (class597.field8016 == arg0) {
            return 26;
        } else if (class375.field4829 == arg0) {
            return 7;
        } else if (class113.field1421 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "(B)V")
    public final void method333(byte arg0) {
        this.field684.SetDirection(-this.field2816[0], -this.field2816[1], -this.field2816[2]);
        int var2 = -95 % ((arg0 - 57) / 61);
        this.field694.SetDirection(-this.field2850[0], -this.field2850[1], -this.field2850[2]);
        this.field678 = false;
    }

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "(Z)V")
    public final void method334(boolean arg0) {
        this.field696.method2470(14, this.field2875 && this.field2832);
        if (arg0) {
            method332(null, (byte) -25);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lte;B)V")
    public final void method335(class575 arg0, byte arg1) {
        this.method337(arg0, true);
        if (arg1 != -60) {
            this.field690 = null;
        }
        if (!this.field675[this.field2841]) {
            this.field696.SetSamplerState(this.field2841, 1, 1);
            this.field675[this.field2841] = true;
        }
        if (!this.field701[this.field2841]) {
            this.field696.SetSamplerState(this.field2841, 2, 1);
            this.field701[this.field2841] = true;
        }
    }

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "()V")
    public final void method336() {
    }

    @OriginalMember(owner = "client!tga", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Lpfa;Ljava/lang/Integer;)Loa;")
    public static final class650 createToolkit(Canvas arg0, class498 arg1, class275 arg2, Integer arg3) {
        class54 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class630 var7 = new class630();
            IDirect3D var8 = IDirect3D.method2458(-2147483616, var7);
            D3DCAPS var9 = var8.method2460(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method316(arg3, var5, var6, var8, var10, -62)) {
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
                    var13 = var8.method2459(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class450 var17) {
                    var13 = var8.method2459(var5, var6, arg0, var11 | 0x20, var10);
                }
                class246 var15 = new class246(var13.method2465(0), var13.method2477());
                var4 = new class54(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1300(true);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method392();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lvt;Z)V")
    public final void method337(class283 arg0, boolean arg1) {
        this.field696.SetTexture(this.field2841, arg0.method33(-107));
        if (this.field698[this.field2841] != arg0.field3588) {
            int var3 = method394(arg0.field3588, (byte) 70);
            this.field696.SetSamplerState(this.field2841, 6, var3);
            this.field696.SetSamplerState(this.field2841, 5, var3);
            this.field698[this.field2841] = arg0.field3588;
            if (arg0.field3590 != this.field676[this.field2841]) {
                this.field696.SetSamplerState(this.field2841, 7, arg0.field3590 ? method394(arg0.field3588, (byte) 70) : 0);
                this.field676[this.field2841] = arg0.field3590;
            }
        } else if (this.field676[this.field2841] != arg0.field3590) {
            this.field696.SetSamplerState(this.field2841, 7, arg0.field3590 ? method394(arg0.field3588, (byte) 70) : 0);
            this.field676[this.field2841] = arg0.field3590;
        }
        if (!arg1) {
            this.method343(-76);
        }
        if (!this.field683[this.field2841]) {
            this.field683[this.field2841] = true;
            this.method348((byte) -58);
            this.method373(0);
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(ILjr;Lnh;)I")
    public static final int method338(int arg0, class100 arg1, class699 arg2) {
        if (arg0 != 22) {
            field682 = null;
        }
        if (class100.field1288 == arg1) {
            if (class664.field9019 == arg2) {
                return 22;
            }
            if (class556.field6946 == arg2) {
                return 21;
            }
            if (class190.field2256 == arg2) {
                return 28;
            }
            if (class503.field6258 == arg2) {
                return 50;
            }
            if (class493.field6140 == arg2) {
                return 51;
            }
            if (class210.field2479 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(III[IZII)Lem;")
    public final class212 method339(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 != 11) {
            field681 = null;
        }
        return new class9(this, arg2, arg0, arg4, arg3, arg6, arg5);
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(BZ)Lvl;")
    public final class13 method340(byte arg0, boolean arg1) {
        if (arg0 < 97) {
            this.field696 = null;
        }
        return new class59(this, class100.field1289, arg1);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)Lii;")
    public final class519 method341(int arg0, boolean arg1) {
        return arg0 < 103 ? (class519) null : new class626(this, arg1);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILsv;)I")
    private static final int method342(int arg0, class617 arg1) {
        if (class14.field135 == arg1) {
            return 2;
        } else if (class126.field1540 == arg1) {
            return 3;
        } else if (class563.field7031 == arg1) {
            return 1;
        } else if (class701.field9803 == arg1) {
            return 4;
        } else if (class572.field7310 == arg1) {
            return 6;
        } else if (class287.field3637 == arg1) {
            return 5;
        } else if (arg0 == 30532) {
            throw new IllegalArgumentException("");
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "(I)V")
    public final void method343(int arg0) {
        this.field696.SetTransform(3, this.field2859);
        if (arg0 != 0) {
            this.method370(78);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILbf;)V")
    public final void method344(int arg0, class502 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field696.SetVertexDeclaration(var3.field3829);
        if (arg0 != 28303) {
            this.field680 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method345(Rectangle[] arg0, int arg1) throws class202 {
        this.method318();
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public final void method346(Canvas arg0, int arg1, Object arg2) {
        if (arg1 <= 123) {
            this.method359(78);
        }
    }

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "(I)V")
    public final void method347(int arg0) {
        this.method362((byte) -112);
        this.method358(0);
        if (arg0 != -21751) {
            this.field684 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "(B)V")
    public final void method348(byte arg0) {
        if (arg0 > -57) {
            this.field686 = null;
        }
        int var2 = this.field683[this.field2841] ? method332(this.field2793[this.field2841], (byte) 45) : 1;
        this.field696.SetTextureStageState(this.field2841, 4, var2);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[BBILnh;)Lht;")
    public final class544 method349(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, class699 arg5) {
        if (arg3 != 20) {
            this.method313(-115, null, 73, null, -44);
        }
        return new class575(this, arg5, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "([Loc;B)Lbf;")
    public final class502 method350(class192[] arg0, byte arg1) {
        if (arg1 >= -113) {
            this.method391(0.32449424F, -0.5931225F, 0.29695198F);
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lip;Lip;FLip;)Lip;")
    public final class662 method351(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[[IZ)Lqca;")
    public final class105 method352(int arg0, int arg1, int[][] arg2, boolean arg3) {
        if (arg0 != -25) {
            this.method371(-82);
        }
        return new class34(this, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "(B)V")
    public final void method353(byte arg0) {
        int var2 = -4 / ((-arg0 - 23) / 48);
        this.field696.method2470(15, this.field2789);
    }

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "(I)V")
    public final synchronized void method354(int arg0) {
        this.field699.method3539((byte) 43);
        super.method354(arg0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method355(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 7) {
            this.method374();
        }
        this.field688 = (class246) arg1;
    }

    @OriginalMember(owner = "client!tga", name = "C", descriptor = "(I)V")
    public final void method356(int arg0) {
        if (arg0 != 1) {
            this.field697 = true;
        }
        this.field696.method2470(137, this.field2845 && !this.field2798);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjr;Lnh;)Z")
    public final boolean method357(int arg0, class100 arg1, class699 arg2) {
        if (arg0 != -22567) {
            this.field692 = false;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class451.method2482(arg0 ^ 0xFFFF9F19, this.field691.method2462(this.field687, var4)) && class451.method2482(14528, this.field691.CheckDeviceFormat(this.field687, this.field700, var4.Format, 0, 3, method338(22, arg1, arg2)));
    }

    @OriginalMember(owner = "client!tga", name = "y", descriptor = "(I)V")
    public final void method358(int arg0) {
        if (!this.field678) {
            this.field696.LightEnable(0, false);
            this.field696.LightEnable(1, false);
            this.field696.SetLight(0, this.field684);
            this.field696.SetLight(1, this.field694);
            this.field696.LightEnable(0, true);
            this.field696.LightEnable(1, true);
            this.field678 = true;
        }
        if (arg0 != 0) {
            field677 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V")
    public final void method359(int arg0) {
        if (this.field2861) {
            this.field696.method2463(36, 0.0F);
            this.field696.method2463(37, 1.0F);
            this.field696.SetRenderState(34, this.field2855);
        } else {
            this.field2834 = (this.field2882 - this.field2829);
            this.field2878 = (float) (-this.field2837) + this.field2834;
            if ((float) this.field2806 > this.field2878) {
                this.field2878 = this.field2806;
            }
            this.field696.method2463(36, this.field2878);
            this.field696.method2463(37, this.field2834);
            this.field696.SetRenderState(34, this.field2808);
        }
        if (arg0 != 12) {
            this.method378(-22);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILnh;Ljr;)Z")
    public final boolean method360(int arg0, class699 arg1, class100 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 != -5) {
            this.method377(-118);
        }
        return class451.method2482(14528, this.field691.method2462(this.field687, var4)) && class451.method2482(14528, this.field691.CheckDeviceFormat(this.field687, this.field700, var4.Format, 0, 4, method338(22, arg2, arg1)));
    }

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "()Z")
    public final boolean method361() {
        return false;
    }

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "(B)V")
    public final void method362(byte arg0) {
        int var2 = 82 % ((8 - arg0) / 58);
        float var3 = this.field2795 ? this.field2785 : 0.0F;
        float var4 = this.field2795 ? -this.field2824 : 0.0F;
        this.field684.SetDiffuse(this.field2857 * var3, this.field2796 * var3, this.field2790 * var3, 0.0F);
        this.field694.SetDiffuse(this.field2857 * var4, this.field2796 * var4, this.field2790 * var4, 0.0F);
        this.field678 = false;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IILii;)V")
    public final void method363(int arg0, int arg1, class519 arg2) {
        if (arg0 >= -70) {
            this.method344(-100, null);
        }
        class626 var4 = (class626) arg2;
        this.field696.SetStreamSource(arg1, var4.field8496, 0, var4.method3496(true));
    }

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "(I)V")
    public final void method364(int arg0) {
        this.field684.SetAmbient(this.field2857 * this.field2815, this.field2815 * this.field2796, this.field2815 * this.field2790, 0.0F);
        if (arg0 != 13529) {
            this.field696 = null;
        }
        this.field678 = false;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lhs;B)I")
    private static final int method365(class304 arg0, byte arg1) {
        if (arg1 != -79) {
            field682 = null;
        }
        if (class290.field3662 == arg0) {
            return 2;
        } else if (class195.field2295 == arg0) {
            return 0;
        } else if (class251.field3237 == arg0) {
            return 1;
        } else if (class666.field9048 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(ZB)V")
    public final void method366(boolean arg0, byte arg1) {
        if (arg1 < -118) {
            this.field696.method2470(161, arg0);
        }
    }

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "(I)F")
    public final float method367(int arg0) {
        return arg0 == 10 ? -0.5F : 1.1513916F;
    }

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "(I)V")
    public final void method368(int arg0) {
        for (int var2 = 0; var2 < this.field2854; var2++) {
            this.field696.SetSamplerState(var2, 7, 0);
            this.field696.SetSamplerState(var2, 6, 2);
            this.field696.SetSamplerState(var2, 5, 2);
            this.field696.SetSamplerState(var2, 1, 1);
            this.field696.SetSamplerState(var2, 2, 1);
            this.field698[var2] = class396.field5036;
            this.field675[var2] = this.field701[var2] = true;
            this.field676[var2] = false;
            this.field689[var2] = 0;
        }
        this.field696.SetTextureStageState(0, 6, 1);
        this.field696.SetRenderState(9, 2);
        this.field696.SetRenderState(23, 4);
        this.field696.SetRenderState(25, 5);
        this.field696.SetRenderState(24, 0);
        this.field696.SetRenderState(22, 2);
        this.field696.SetRenderState(147, 1);
        this.field696.SetRenderState(145, 1);
        this.field696.method2463(38, 0.95F);
        this.field696.SetRenderState(140, 3);
        this.field684.SetType(3);
        this.field694.SetType(3);
        this.field685.SetType(1);
        if (arg0 != -1) {
            this.field694 = null;
        }
        this.field678 = false;
        super.method368(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lxa;Z)V")
    public final void method369(class468 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "(I)V")
    public final void method370(int arg0) {
        if (this.field2852.method1943(arg0 + 59)) {
            this.field2778.method3219(field681, (byte) -105);
        } else {
            field681[14] = 0.0F;
            field681[13] = 0.0F;
            field681[4] = 0.0F;
            field681[10] = 1.0F;
            field681[9] = 0.0F;
            field681[7] = 0.0F;
            field681[6] = 0.0F;
            field681[12] = 0.0F;
            field681[0] = 1.0F;
            field681[2] = 0.0F;
            field681[11] = 0.0F;
            field681[5] = 1.0F;
            field681[8] = 0.0F;
            field681[3] = 0.0F;
            field681[1] = 0.0F;
            field681[15] = 1.0F;
        }
        if (arg0 != -1) {
            this.field698 = null;
        }
        this.field696.SetTransform(2, field681);
    }

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "(I)V")
    public final void method371(int arg0) {
        if (this.field2769) {
            field681[15] = 1.0F;
            field681[1] = 0.0F;
            field681[14] = 0.0F;
            field681[6] = 0.0F;
            field681[4] = 0.0F;
            field681[3] = 0.0F;
            field681[5] = 1.0F;
            field681[11] = 0.0F;
            field681[10] = 1.0F;
            field681[9] = 0.0F;
            field681[2] = 0.0F;
            field681[13] = 0.0F;
            field681[7] = 0.0F;
            field681[0] = 1.0F;
            field681[12] = 0.0F;
            field681[8] = 0.0F;
        } else {
            this.field2771.method3219(field681, (byte) -108);
        }
        int var2 = -71 / ((58 - arg0) / 42);
        this.field696.SetTransform(256, field681);
    }

    @OriginalMember(owner = "client!tga", name = "O", descriptor = "(I)V")
    public final void method372(int arg0) {
        this.field696.SetScissorRect(this.field2876 + this.field2868, this.field2843 + this.field2840, this.field2869, this.field2879);
        if (arg0 != 8) {
            this.field695 = false;
        }
    }

    @OriginalMember(owner = "client!tga", name = "H", descriptor = "(I)V")
    public final void method373(int arg0) {
        if (arg0 == 0) {
            int var2 = this.field683[this.field2841] ? method332(this.field2851[this.field2841], (byte) 45) : 1;
            this.field696.SetTextureStageState(this.field2841, 1, var2);
        }
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "()V")
    public final void method374() {
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBIIILsv;Lvl;)V")
    public final void method375(int arg0, byte arg1, int arg2, int arg3, int arg4, class617 arg5, class13 arg6) {
        this.field696.SetIndices(((class59) arg6).field750);
        this.field696.DrawIndexedPrimitive(method342(30532, arg5), 0, arg2, arg3, arg0, arg4);
        int var8 = -86 / ((75 - arg1) / 50);
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(II)V")
    public final void method376(int arg0, int arg1) {
        if (arg1 != 2285) {
            this.field689 = null;
        }
        this.field696.SetTextureStageState(this.field2841, 11, arg0);
    }

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "(I)V")
    public final void method377(int arg0) {
        if (arg0 <= 85) {
            this.field680 = null;
        }
        if (class168.field1974 == this.field2823) {
            this.field696.SetRenderState(19, 5);
            this.field696.SetRenderState(20, 6);
        } else if (class705.field9864 == this.field2823) {
            this.field696.SetRenderState(19, 2);
            this.field696.SetRenderState(20, 2);
        } else if (class324.field4037 == this.field2823) {
            this.field696.SetRenderState(19, 9);
            this.field696.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "(I)V")
    public final void method378(int arg0) {
        this.field696.method2470(27, this.field2800);
        if (arg0 != 1) {
            this.field686 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!tga", name = "SA", descriptor = "()I")
    public final int method380() {
        return 0;
    }

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "(I)V")
    public final void method381(int arg0) {
        this.field696.method2470(174, this.field2903);
        if (arg0 != 0) {
            this.method369(null, false);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IILhs;Z)V")
    public final void method382(int arg0, int arg1, class304 arg2, boolean arg3) {
        if (arg0 < 25) {
            return;
        }
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
        this.field696.SetTextureStageState(this.field2841, var6, var7 | method365(arg2, (byte) -79));
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "(B)V")
    public final void method383(byte arg0) {
        if (arg0 != -104) {
            this.method387((byte) -49, null, null);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIZLnh;I[FII)Lem;")
    public final class212 method384(int arg0, int arg1, boolean arg2, class699 arg3, int arg4, float[] arg5, int arg6, int arg7) {
        if (arg6 > -127) {
            this.method387((byte) -53, null, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!tga", name = "R", descriptor = "(I)V")
    public final void method385(int arg0) {
        if (arg0 == 1) {
            this.field696.method2470(7, this.field2826);
        }
    }

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "(II)Lho;")
    public final class139 method386(int arg0, int arg1) {
        if (arg1 > -121) {
            this.field696 = null;
        }
        if (arg0 == 3) {
            return new class399(this, this.field2706);
        } else if (arg0 == 4) {
            return new class464(this, this.field2706, this.field2761);
        } else {
            return super.method386(arg0, -125);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method387(byte arg0, Canvas arg1, Object arg2) {
        if (this.field2764 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field696.EndScene();
                this.method324(0);
                this.field696.BeginScene();
            }
        }
        if (arg0 != 73) {
            this.method367(64);
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(Z)V")
    public final void method388(boolean arg0) {
    }

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "(I)V")
    public final void method389(int arg0) {
        if (arg0 != 2) {
            this.method319(null, false);
        }
        this.field696.SetRenderState(60, this.field2874);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLhs;ZII)V")
    public final void method390(boolean arg0, class304 arg1, boolean arg2, int arg3, int arg4) {
        byte var7;
        if (arg3 == 1) {
            var7 = 3;
        } else if (arg3 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg0) {
            var8 |= 0x20;
        }
        if (arg2) {
            var8 |= 0x10;
        }
        this.field696.SetTextureStageState(this.field2841, var7, var8 | method365(arg1, (byte) -79));
        if (arg4 != 262144) {
            this.field683 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/dj;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lmb;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Lpfa;I)V")
    private class54(int arg0, int arg1, Canvas arg2, class630 arg3, IDirect3D arg4, IDirect3DDevice arg5, class246 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class498 arg9, class275 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field700 = arg1;
        this.field696 = arg5;
        this.field691 = arg4;
        this.field699 = arg3;
        this.field688 = arg6;
        this.field687 = arg0;
        this.field693 = arg8;
        this.field686 = arg7;
        this.field684 = new class452(this.field699);
        this.field694 = new class452(this.field699);
        this.field685 = new class452(this.field699);
        this.field690 = new PixelBuffer(this.field699);
        this.field680 = new GeometryBuffer(this.field699);
        new GeometryBuffer(this.field699);
        this.field2880 = this.field693.MaxActiveLights <= 0 ? 8 : this.field693.MaxActiveLights;
        this.field2802 = (this.field693.TextureCaps & 0x800) != 0;
        this.field695 = (this.field693.TextureCaps & 0x4000) != 0;
        this.field2805 = (this.field693.TextureCaps & 0x2000) != 0;
        this.field2854 = this.field693.MaxSimultaneousTextures;
        this.field692 = (this.field693.TextureCaps & 0x10000) != 0;
        this.field697 = (this.field693.TextureCaps & 0x2) == 0;
        this.field2810 = this.field2853 > 0 || this.field691.CheckDeviceMultiSampleType(this.field687, this.field700, this.field686.BackBufferFormat, true, 2) == 0;
        this.field683 = new boolean[this.field2854];
        this.field689 = new int[this.field2854];
        this.field675 = new boolean[this.field2854];
        this.field701 = new boolean[this.field2854];
        this.field676 = new boolean[this.field2854];
        this.field698 = new class115[this.field2854];
        this.field696.BeginScene();
        try {
            this.field696.Clear(3, 0, 1.0F, 0);
            this.method318();
            this.field696.Clear(3, 0, 1.0F, 0);
        } catch (class202 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(FFF)V")
    public final void method391(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "()V")
    public final void method392() {
        this.field699.method3538((byte) 111);
        super.method392();
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "()Z")
    public final boolean method393() {
        return false;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lju;B)I")
    private static final int method394(class115 arg0, byte arg1) {
        if (arg1 != 70) {
            method394(null, (byte) 84);
        }
        if (class396.field5036 == arg0) {
            return 2;
        } else if (class681.field9273 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "(B)V")
    public final void method395(byte arg0) {
        if (arg0 != -125) {
            this.field688 = null;
        }
        if (this.field683[this.field2841]) {
            this.field683[this.field2841] = false;
            this.field696.SetTexture(this.field2841, null);
            this.method348((byte) -72);
            this.method373(0);
        }
    }

    @OriginalMember(owner = "client!tga", name = "KA", descriptor = "(IIII)[I")
    public final int[] method396(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field696.method2464(0);
        IDirect3DSurface var7 = this.field696.method2476(arg2, arg3, 21, 0, 0, true);
        if (class451.method2482(14528, this.field696.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class451.method2482(14528, var7.LockRect(0, 0, arg2, arg3, 0, this.field690))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field690.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field690.method2484(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field690.method2484(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3542(65);
        var7.method3542(75);
        return var5;
    }
}
