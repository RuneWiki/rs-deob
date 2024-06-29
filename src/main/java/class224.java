import jaclib.peer.class700;
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
import jagdx.class507;
import jagdx.class508;
import jagdx.class509;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class224 extends class156 {

    @OriginalMember(owner = "client!ta", name = "Lg", descriptor = "Z")
    private boolean field3437 = false;

    @OriginalMember(owner = "client!ta", name = "ah", descriptor = "I")
    private int field3452 = 0;

    @OriginalMember(owner = "client!ta", name = "Yg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3450;

    @OriginalMember(owner = "client!ta", name = "Ug", descriptor = "Ljaclib/peer/bd;")
    public class700 field3446;

    @OriginalMember(owner = "client!ta", name = "Mg", descriptor = "I")
    private int field3438;

    @OriginalMember(owner = "client!ta", name = "Ig", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!ta", name = "Vg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3447;

    @OriginalMember(owner = "client!ta", name = "Hg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3433;

    @OriginalMember(owner = "client!ta", name = "dh", descriptor = "Lhja;")
    private class426 field3455;

    @OriginalMember(owner = "client!ta", name = "Og", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3440;

    @OriginalMember(owner = "client!ta", name = "Xg", descriptor = "Ljagdx/D3DLIGHT;")
    private class509 field3449;

    @OriginalMember(owner = "client!ta", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class509 field3441;

    @OriginalMember(owner = "client!ta", name = "Tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class509 field3445;

    @OriginalMember(owner = "client!ta", name = "Zg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3451;

    @OriginalMember(owner = "client!ta", name = "gh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3458;

    @OriginalMember(owner = "client!ta", name = "Rg", descriptor = "Z")
    public boolean field3443;

    @OriginalMember(owner = "client!ta", name = "eh", descriptor = "Z")
    public boolean field3456;

    @OriginalMember(owner = "client!ta", name = "fh", descriptor = "Z")
    public boolean field3457;

    @OriginalMember(owner = "client!ta", name = "Sg", descriptor = "[Z")
    private boolean[] field3444;

    @OriginalMember(owner = "client!ta", name = "Ng", descriptor = "[Ltda;")
    private class663[] field3439;

    @OriginalMember(owner = "client!ta", name = "ih", descriptor = "[Z")
    private boolean[] field3460;

    @OriginalMember(owner = "client!ta", name = "ch", descriptor = "[Z")
    private boolean[] field3454;

    @OriginalMember(owner = "client!ta", name = "hh", descriptor = "[I")
    private int[] field3459;

    @OriginalMember(owner = "client!ta", name = "Wg", descriptor = "[Z")
    private boolean[] field3448;

    @OriginalMember(owner = "client!ta", name = "Qg", descriptor = "[I")
    private static int[] field3442 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ta", name = "Kg", descriptor = "[I")
    private static int[] field3436 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ta", name = "bh", descriptor = "[F")
    private static float[] field3453 = new float[16];

    @OriginalMember(owner = "client!ta", name = "Jg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3435;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Lkfa;")
    public final class627 method481(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lwia;Ljava/lang/Integer;)Lha;")
    public static final class65 createToolkit(Canvas arg0, class160 arg1, class791 arg2, Integer arg3) {
        class224 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class700 var7 = new class700();
            IDirect3D var8 = IDirect3D.method3057(-2147483616, var7);
            D3DCAPS var9 = var8.method3055(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x10 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1529(var5, arg3, var8, var10, (byte) -111, var6)) {
                    throw new RuntimeException("");
                }
                var10.PresentationInterval = Integer.MIN_VALUE;
                var10.EnableAutoDepthStencil = true;
                var10.Windowed = true;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method3058(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class508 var17) {
                    var13 = var8.method3058(var5, var6, arg0, var11 | 0x20, var10);
                }
                class426 var15 = new class426(var13.method3061(0), var13.method3072());
                var4 = new class224(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1177((byte) 34);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method484();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public final void method1109(Object arg0, Canvas arg1, boolean arg2) {
        this.field3455 = (class426) arg0;
        if (!arg2) {
            this.method1086(75);
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
    public final void method1083(byte arg0) {
        this.field3450.method3076(28, this.field2408 && this.field2476 && this.field2451 >= 0);
        if (arg0 > -69) {
            this.method454(118);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjagdx/IDirect3DPixelShader;)V")
    public final void method1523(byte arg0, IDirect3DPixelShader arg1) {
        this.field3450.SetPixelShader(arg1);
        if (arg0 != 78) {
            this.field3447 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(B)V")
    public final void method1126(byte arg0) {
        if (arg0 != 53 || this.field3437) {
            return;
        }
        this.field3450.LightEnable(0, false);
        this.field3450.LightEnable(1, false);
        this.field3450.SetLight(0, this.field3449);
        this.field3450.SetLight(1, this.field3441);
        this.field3450.LightEnable(0, true);
        this.field3450.LightEnable(1, true);
        this.field3437 = true;
    }

    @OriginalMember(owner = "client!ta", name = "ya", descriptor = "()V")
    public final void method518() {
        this.method1133(16, true);
        this.field3450.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(B)V")
    public final void method1095(byte arg0) {
        int var2 = -60 % ((65 - arg0) / 54);
        this.field3450.method3076(7, this.field2444);
    }

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "(I)V")
    public final void method1195(int arg0) {
        if (arg0 != 0) {
            this.field3446 = null;
        }
        if (this.field2384) {
            field3453[12] = 0.0F;
            field3453[15] = 1.0F;
            field3453[1] = 0.0F;
            field3453[11] = 0.0F;
            field3453[14] = 0.0F;
            field3453[10] = 1.0F;
            field3453[5] = 1.0F;
            field3453[6] = 0.0F;
            field3453[2] = 0.0F;
            field3453[4] = 0.0F;
            field3453[7] = 0.0F;
            field3453[8] = 0.0F;
            field3453[3] = 0.0F;
            field3453[9] = 0.0F;
            field3453[13] = 0.0F;
            field3453[0] = 1.0F;
        } else {
            this.field2387.method2403(5, field3453);
        }
        this.field3450.SetTransform(256, field3453);
    }

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "(I)V")
    public final void method1165(int arg0) {
        this.method1144(-85);
        if (arg0 == 0) {
            this.method1126((byte) 53);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLhl;)V")
    public final void method1178(int arg0, byte arg1, class553 arg2) {
        class91 var4 = (class91) arg2;
        if (arg1 < 48) {
            this.method1531(-99, null);
        }
        this.field3450.SetStreamSource(arg0, var4.field1026, 0, var4.method677((byte) 116));
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ltda;I)I")
    private static final int method1524(class663 arg0, int arg1) {
        if (arg1 < 64) {
            field3453 = null;
        }
        if (class399.field5476 == arg0) {
            return 2;
        } else if (class439.field5927 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()Z")
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "(I)V")
    public final void method1144(int arg0) {
        if (arg0 > -16) {
            this.method1142(58, (byte) 118);
        }
        float var2 = this.field2426 ? this.field2410 : 0.0F;
        float var3 = this.field2426 ? -this.field2495 : 0.0F;
        this.field3449.SetDiffuse(this.field2489 * var2, this.field2457 * var2, this.field2458 * var2, 0.0F);
        this.field3441.SetDiffuse(this.field2489 * var3, this.field2457 * var3, this.field2458 * var3, 0.0F);
        this.field3437 = false;
    }

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "()I")
    public final int method476() {
        return 0;
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(Z)V")
    public final void method1139(boolean arg0) {
        if (!arg0) {
            field3436 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(Z)V")
    public final void method1130(boolean arg0) {
        for (int var2 = 0; var2 < this.field2436; var2++) {
            this.field3450.SetSamplerState(var2, 7, 0);
            this.field3450.SetSamplerState(var2, 6, 2);
            this.field3450.SetSamplerState(var2, 5, 2);
            this.field3450.SetSamplerState(var2, 1, 1);
            this.field3450.SetSamplerState(var2, 2, 1);
            this.field3439[var2] = class399.field5476;
            this.field3448[var2] = this.field3444[var2] = true;
            this.field3454[var2] = false;
            this.field3459[var2] = 0;
        }
        if (!arg0) {
            this.method1126((byte) 71);
        }
        this.field3450.SetTextureStageState(0, 6, 1);
        this.field3450.SetRenderState(9, 2);
        this.field3450.SetRenderState(23, 4);
        this.field3450.SetRenderState(25, 5);
        this.field3450.SetRenderState(24, 0);
        this.field3450.SetRenderState(22, 2);
        this.field3450.SetRenderState(147, 1);
        this.field3450.SetRenderState(145, 1);
        this.field3450.method3073(38, 0.95F);
        this.field3450.SetRenderState(140, 3);
        this.field3449.SetType(3);
        this.field3441.SetType(3);
        this.field3445.SetType(1);
        this.field3437 = false;
        super.method1130(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "()V")
    public final void method546() {
        IDirect3DEventQuery var1 = this.field3450.method3060();
        if (class507.method3053(var1.Issue(), -1)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3967(29036);
    }

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "(I)V")
    public final void method1087(int arg0) {
        if (arg0 != 31205) {
            this.field3447 = null;
        }
        this.field3449.SetDirection(-this.field2416[0], -this.field2416[1], -this.field2416[2]);
        this.field3441.SetDirection(-this.field2419[0], -this.field2419[1], -this.field2419[2]);
        this.field3437 = false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lbja;Lvea;I)Z")
    public final boolean method1122(class34 arg0, class288 arg1, int arg2) {
        if (arg2 < 18) {
            this.field3443 = false;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class507.method3053(this.field3447.method3054(this.field3434, var4), -1) && class507.method3053(this.field3447.CheckDeviceFormat(this.field3434, this.field3438, var4.Format, 0, 4, method1527((byte) 41, arg1, arg0)), -1);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLef;)I")
    private static final int method1525(byte arg0, class512 arg1) {
        if (arg0 != 63) {
            method1530(null, (byte) -17);
        }
        if (class776.field10666 == arg1) {
            return 2;
        } else if (class463.field6532 == arg1) {
            return 4;
        } else if (class116.field1782 == arg1) {
            return 26;
        } else if (class624.field8745 == arg1) {
            return 7;
        } else if (class758.field10455 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class736 {
        this.method463(arg2, arg3);
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "()V")
    public final void method468() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method1196(byte arg0, Object arg1, Canvas arg2) {
        int var4 = -76 / ((40 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BZ)Lhl;")
    public final class553 method1074(byte arg0, boolean arg1) {
        return arg0 == 46 ? new class91(this, arg1) : (class553) null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lvea;Lbja;III)Loga;")
    public final class498 method1103(class288 arg0, class34 arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -2) {
            this.field3440 = null;
        }
        return new class709(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZZ)V")
    public final void method1119(boolean arg0, boolean arg1) {
        this.field3450.method3076(161, arg1);
        if (arg0) {
            this.method1532(null, true);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILcfa;I)V")
    public final void method1183(boolean arg0, int arg1, class179 arg2, int arg3) {
        if (!arg0) {
            this.field3446 = null;
        }
        this.field3450.DrawPrimitive(method1526(-126, arg2), arg1, arg3);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)Lnm;")
    public final class497 method1142(int arg0, byte arg1) {
        if (arg1 != 26) {
            return (class497) null;
        } else if (arg0 == 3) {
            return new class676(this, this.field2304);
        } else if (arg0 == 4) {
            return new class183(this, this.field2304, this.field2334);
        } else if (arg0 == 8) {
            return new class388(this, this.field2304, this.field2334);
        } else {
            return super.method1142(arg0, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "(B)V")
    public final void method1143(byte arg0) {
        this.field3450.SetTransform(3, this.field2423);
        if (arg0 != 102) {
            method1529(35, 2, null, null, (byte) 97, 15);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[IIIIBZ)Loga;")
    public final class498 method1186(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        if (arg5 >= -101) {
            this.field3434 = 66;
        }
        return new class709(this, arg3, arg4, arg6, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII[[I)Lks;")
    public final class461 method1134(boolean arg0, int arg1, int arg2, int[][] arg3) {
        return arg2 == -2 ? new class568(this, arg1, arg0, arg3) : (class461) null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILcfa;)I")
    private static final int method1526(int arg0, class179 arg1) {
        if (class376.field5193 == arg1) {
            return 2;
        } else if (class451.field6306 == arg1) {
            return 3;
        } else if (class691.field9658 == arg1) {
            return 1;
        } else if (class207.field3204 == arg1) {
            return 4;
        } else if (class744.field10310 == arg1) {
            return 6;
        } else if (class591.field8327 == arg1) {
            return 5;
        } else {
            int var2 = -112 % ((-arg0 - 51) / 55);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
    public final void method447() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method1075(Object arg0, Canvas arg1, int arg2) {
        if (this.field2322 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field3450.EndScene();
                this.method1534(-111);
                this.field3450.BeginScene();
            }
        }
        if (arg2 != 7) {
            this.field3437 = false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lpt;)V")
    public final void method528(class555 arg0) {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLvea;Lbja;)I")
    public static final int method1527(byte arg0, class288 arg1, class34 arg2) {
        if (arg0 != 41) {
            return 10;
        }
        if (class34.field457 == arg2) {
            if (class306.field4412 == arg1) {
                return 22;
            }
            if (class691.field9659 == arg1) {
                return 21;
            }
            if (class88.field993 == arg1) {
                return 28;
            }
            if (class154.field2178 == arg1) {
                return 50;
            }
            if (class315.field4480 == arg1) {
                return 51;
            }
            if (class653.field9125 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
    }

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "(B)V")
    public final void method1175(byte arg0) {
        if (arg0 != -104) {
            this.field3440 = null;
        }
        this.field3450.method3076(14, this.field2494 && this.field2461);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILad;)V")
    public final void method1081(int arg0, class446 arg1) {
        int var3 = 0;
        if (class335.field4713 == arg1) {
            var3 = 65536;
        } else if (class269.field3905 == arg1) {
            var3 = 131072;
        } else if (class268.field3896 == arg1) {
            var3 = 196608;
        }
        if (arg0 <= 79) {
            this.method546();
        }
        this.field3450.SetTextureStageState(this.field2482, 11, var3 | this.field2482);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lip;ZII)V")
    public final void method1098(class735 arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != 12) {
            return;
        }
        int var5 = 0;
        byte var7;
        if (arg3 == 1) {
            var7 = 6;
        } else if (arg3 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1) {
            var5 |= 0x10;
        }
        this.field3450.SetTextureStageState(this.field2482, var7, var5 | method1535(arg0, true));
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
    public final void method1110(int arg0, byte arg1) {
        this.field3450.SetTextureStageState(this.field2482, 11, arg0);
        if (arg1 > -89) {
            this.field3438 = 15;
        }
    }

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "(B)V")
    public final void method1138(byte arg0) {
        if (this.field2467.method2092((byte) 101)) {
            this.field2392.method2403(5, field3453);
        } else {
            field3453[1] = 0.0F;
            field3453[4] = 0.0F;
            field3453[2] = 0.0F;
            field3453[15] = 1.0F;
            field3453[7] = 0.0F;
            field3453[5] = 1.0F;
            field3453[13] = 0.0F;
            field3453[9] = 0.0F;
            field3453[12] = 0.0F;
            field3453[10] = 1.0F;
            field3453[6] = 0.0F;
            field3453[11] = 0.0F;
            field3453[8] = 0.0F;
            field3453[14] = 0.0F;
            field3453[3] = 0.0F;
            field3453[0] = 1.0F;
        }
        if (arg0 >= -1) {
            this.field3438 = 12;
        }
        this.field3450.SetTransform(2, field3453);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBI[BZLvea;)Loga;")
    public final class498 method1114(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, boolean arg6, class288 arg7) {
        int var9 = -12 % ((arg3 - 17) / 58);
        return new class709(this, arg7, arg2, arg4, arg6, arg5, arg0, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIIID)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public final void method1068(int arg0) {
        if (arg0 != 0) {
            field3453 = null;
        }
        this.field3450.SetRenderState(60, this.field2493);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lkfa;Lts;)Lpt;")
    public final class555 method443(class627 arg0, class560 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "(B)V")
    public final void method1173(byte arg0) {
        this.field3450.method3076(137, this.field2405 && !this.field2475);
        if (arg0 <= 30) {
            this.method450(118, 78);
        }
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(Z)V")
    public final void method1185(boolean arg0) {
        this.field3450.method3076(27, this.field2411);
        if (arg0) {
            this.field3450 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "(I)V")
    public final void method1125(int arg0) {
        if (arg0 <= -6) {
            int var2 = this.field3460[this.field2482] ? method1525((byte) 63, this.field2403[this.field2482]) : 1;
            this.field3450.SetTextureStageState(this.field2482, 4, var2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/bd;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lhja;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lwia;I)V")
    private class224(int arg0, int arg1, Canvas arg2, class700 arg3, IDirect3D arg4, IDirect3DDevice arg5, class426 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class160 arg9, class791 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field3450 = arg5;
            this.field3446 = arg3;
            this.field3438 = arg1;
            this.field3434 = arg0;
            this.field3447 = arg4;
            this.field3433 = arg7;
            this.field3455 = arg6;
            this.field3440 = arg8;
            this.field3449 = new class509(this.field3446);
            this.field3441 = new class509(this.field3446);
            this.field3445 = new class509(this.field3446);
            this.field3451 = new PixelBuffer(this.field3446);
            this.field3458 = new GeometryBuffer(this.field3446);
            new GeometryBuffer(this.field3446);
            this.field2481 = (this.field3440.TextureCaps & 0x800) != 0;
            this.field3443 = (this.field3440.TextureCaps & 0x10000) != 0;
            this.field3456 = (this.field3440.TextureCaps & 0x2) == 0;
            this.field2438 = this.field3440.MaxActiveLights > 0 ? this.field3440.MaxActiveLights : 8;
            this.field3457 = (this.field3440.TextureCaps & 0x4000) != 0;
            this.field2440 = (this.field3440.TextureCaps & 0x2000) != 0;
            this.field2436 = this.field3440.MaxSimultaneousTextures;
            this.field2447 = this.field2398 > 0 || this.field3447.CheckDeviceMultiSampleType(this.field3434, this.field3438, this.field3433.BackBufferFormat, true, 2) == 0;
            this.field3444 = new boolean[this.field2436];
            this.field3439 = new class663[this.field2436];
            this.field3460 = new boolean[this.field2436];
            this.field3454 = new boolean[this.field2436];
            this.field3459 = new int[this.field2436];
            this.field3448 = new boolean[this.field2436];
            this.field3450.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method533(102);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLkq;)V")
    public final void method1111(byte arg0, class618 arg1) {
        if (arg0 > 4) {
            dxVertexLayout var3 = (dxVertexLayout) arg1;
            this.field3450.SetVertexDeclaration(var3.field4756);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwe;I)V")
    public final void method1528(class427 arg0, int arg1) {
        if (arg1 != 31231) {
            this.field3443 = true;
        }
        this.method1533(0, arg0);
        if (!this.field3448[this.field2482]) {
            this.field3450.SetSamplerState(this.field2482, 1, 1);
            this.field3448[this.field2482] = true;
        }
        if (!this.field3444[this.field2482]) {
            this.field3450.SetSamplerState(this.field2482, 2, 1);
            this.field3444[this.field2482] = true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) throws class736 {
        this.field3450.EndScene();
        if (this.field3455.method2573(92)) {
            this.field3452 = 0;
            if (class507.method3052(this.field3455.method2575(0, (byte) 82), -122)) {
                this.method1534(-70);
            }
        } else if ((++this.field3452) <= 50) {
            this.method1534(-79);
        } else {
            throw new class736();
        }
        this.field3450.BeginScene();
    }

    @OriginalMember(owner = "client!ta", name = "GA", descriptor = "(I)V")
    public final void method509(int arg0) {
        this.field3450.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(IZ)Ldk;")
    public final class535 method1184(int arg0, boolean arg1) {
        if (arg0 != 2) {
            method1526(-39, null);
        }
        return new class162(this, class34.field458, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;BI)Z")
    private static final boolean method1529(int arg0, int arg1, IDirect3D arg2, D3DPRESENT_PARAMETERS arg3, byte arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (arg4 > -53) {
            return true;
        }
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class507.method3052(arg2.method3054(arg0, var9), 95)) {
                return false;
            }
            label81: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field3442.length; var10++) {
                        if (arg2.CheckDeviceType(arg0, arg5, var9.Format, field3442[var10], true) == 0 && arg2.CheckDeviceFormat(arg0, arg5, var9.Format, 1, 1, field3442[var10]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg5, field3442[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field3436.length; var11++) {
                                if (arg2.CheckDeviceFormat(arg0, arg5, var9.Format, 2, 1, field3436[var11]) == 0 && arg2.CheckDepthStencilMatch(arg0, arg5, var9.Format, field3442[var10], field3436[var11]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg5, field3436[var10], true, var8) == 0)) {
                                    var6 = field3436[var11];
                                    var7 = field3442[var10];
                                    break label81;
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
            arg3.MultiSampleQuality = 0;
            arg3.MultiSampleType = var8;
            arg3.AutoDepthStencilFormat = var6;
            arg3.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "(I)V")
    public final void method1078(int arg0) {
        if (this.field3460[this.field2482]) {
            this.field3460[this.field2482] = false;
            this.field3450.SetTexture(this.field2482, null);
            this.method1125(-121);
            this.method1123(true);
        }
        if (arg0 <= 39) {
            this.field3445 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lde;B)I")
    private static final int method1530(class556 arg0, byte arg1) {
        if (class726.field10039 == arg0) {
            return 1;
        } else if (class448.field6129 == arg0) {
            return 2;
        } else if (class714.field9899 == arg0) {
            return 3;
        } else if (class301.field4340 == arg0) {
            return 4;
        } else if (class312.field4449 == arg0) {
            return 256;
        } else {
            int var2 = -112 / ((2 - arg1) / 42);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "()Lcq;")
    public final class491 method553() {
        D3DADAPTER_IDENTIFIER var1 = this.field3447.method3056(this.field3434, 0);
        return new class491(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "(I)V")
    public final void method1129(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field2464; var2++) {
            class154 var3 = this.field2439[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1052(false);
            float var6 = var3.method1057(false) / 255.0F;
            this.field3445.SetPosition((float) var3.method1059(-6131), (float) var3.method1055((byte) -71), (float) var3.method1058(101));
            this.field3445.SetDiffuse((float) ((var5 & 0xFF6CDD) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3445.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1051((byte) -106) * var3.method1051((byte) 124)));
            this.field3445.SetRange((float) var3.method1051((byte) 38));
            this.field3450.SetLight(var4, this.field3445);
            this.field3450.LightEnable(var4, true);
        }
        while (this.field2455 > var2) {
            this.field3450.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1129(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "()V")
    public final void method484() {
        this.field3446.method3958(26288);
        super.method484();
    }

    @OriginalMember(owner = "client!ta", name = "na", descriptor = "(IIII)[I")
    public final int[] method467(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3450.method3065(0);
        IDirect3DSurface var7 = this.field3450.method3064(arg2, arg3, 21, 0, 0, true);
        if (class507.method3053(this.field3450.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -1) && class507.method3053(var7.LockRect(0, 0, arg2, arg3, 16, this.field3451), -1)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3451.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field3451.method3080(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3451.method3080(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3967(29036);
        var7.method3967(29036);
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqaa;Lqaa;FLqaa;)Lqaa;")
    public final class29 method470(class29 arg0, class29 arg1, float arg2, class29 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "(I)F")
    public final float method1124(int arg0) {
        if (arg0 != 0) {
            field3436 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lwk;)Lkq;")
    public final class618 method1151(int arg0, class152[] arg1) {
        return arg0 == 12 ? new dxVertexLayout(this, arg1) : (class618) null;
    }

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "(B)V")
    public final void method1174(byte arg0) {
        this.field3449.SetAmbient(this.field2489 * this.field2399, this.field2457 * this.field2399, this.field2458 * this.field2399, 0.0F);
        if (arg0 != 44) {
            this.method1095((byte) 5);
        }
        this.field3437 = false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILqf;)V")
    public final void method1531(int arg0, class709 arg1) {
        this.method1533(0, arg1);
        if (this.field3448[this.field2482] != arg1.field9854) {
            this.field3450.SetSamplerState(this.field2482, 1, arg1.field9854 ? 1 : 3);
            this.field3448[this.field2482] = arg1.field9854;
        }
        if (this.field3444[this.field2482] != arg1.field9856) {
            this.field3450.SetSamplerState(this.field2482, 2, arg1.field9856 ? 1 : 3);
            this.field3444[this.field2482] = arg1.field9856;
        }
        if (arg0 != 23346) {
            field3442 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;Z)V")
    public final void method1532(IDirect3DVertexShader arg0, boolean arg1) {
        this.field3435 = arg0;
        if (!arg1) {
            this.field3443 = false;
        }
        this.field3450.SetVertexShader(arg0);
        this.method1086(11);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILvea;Lbja;)Z")
    public final boolean method1198(int arg0, class288 arg1, class34 arg2) {
        if (arg0 != 13554) {
            this.method1531(90, null);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class507.method3053(this.field3447.method3054(this.field3434, var4), arg0 ^ 0xFFFFCB0D) && class507.method3053(this.field3447.CheckDeviceFormat(this.field3434, this.field3438, var4.Format, 0, 3, method1527((byte) 41, arg1, arg2)), -1);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILpb;)V")
    public final void method1533(int arg0, class681 arg1) {
        if (arg0 != 0) {
            return;
        }
        this.field3450.SetTexture(this.field2482, arg1.method2576(true));
        if (this.field3439[this.field2482] != arg1.field9446) {
            int var3 = method1524(arg1.field9446, 117);
            this.field3450.SetSamplerState(this.field2482, 6, var3);
            this.field3450.SetSamplerState(this.field2482, 5, var3);
            this.field3439[this.field2482] = arg1.field9446;
            if (this.field3454[this.field2482] != arg1.field9447) {
                this.field3450.SetSamplerState(this.field2482, 7, arg1.field9447 ? method1524(arg1.field9446, 124) : 0);
                this.field3454[this.field2482] = arg1.field9447;
            }
        } else if (arg1.field9447 != this.field3454[this.field2482]) {
            this.field3450.SetSamplerState(this.field2482, 7, arg1.field9447 ? method1524(arg1.field9446, 116) : 0);
            this.field3454[this.field2482] = arg1.field9447;
        }
        if (!this.field3460[this.field2482]) {
            this.field3460[this.field2482] = true;
            this.method1125(-74);
            this.method1123(true);
        }
    }

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "(I)V")
    public final void method1149(int arg0) {
        if (class313.field4454 == this.field2406) {
            this.field3450.SetRenderState(19, 5);
            this.field3450.SetRenderState(20, 6);
        } else if (class727.field10049 == this.field2406) {
            this.field3450.SetRenderState(19, 2);
            this.field3450.SetRenderState(20, 2);
        } else if (class309.field4422 == this.field2406) {
            this.field3450.SetRenderState(19, 9);
            this.field3450.SetRenderState(20, 2);
        }
        if (arg0 != -29610) {
            this.method1173((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "(B)V")
    public final void method1156(byte arg0) {
        if (arg0 > -32) {
            this.field3435 = null;
        }
        this.field3450.method3076(174, this.field2519);
    }

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(I)V")
    public final void method1086(int arg0) {
        if (this.field3435 == null && this.field2456[this.field2482] != class763.field10519) {
            if (this.field2456[this.field2482] == class448.field6129) {
                this.field3450.SetTransform(this.field2482 + 16, this.field2401[this.field2482].method2410((byte) 114, field3453));
            } else {
                this.field3450.SetTransform(this.field2482 + 16, this.field2401[this.field2482].method2403(5, field3453));
            }
            int var2 = method1530(this.field2456[this.field2482], (byte) 108);
            if (this.field3459[this.field2482] != var2) {
                this.field3450.SetTextureStageState(this.field2482, 24, var2);
                this.field3459[this.field2482] = var2;
            }
        } else {
            this.field3450.SetTextureStageState(this.field2482, 24, 0);
            this.field3459[this.field2482] = 0;
        }
        if (arg0 != 11) {
            this.field3459 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILdk;IIILcfa;B)V")
    public final void method1091(int arg0, class535 arg1, int arg2, int arg3, int arg4, class179 arg5, byte arg6) {
        if (arg6 == -29) {
            this.field3450.SetIndices(((class162) arg1).field2579);
            this.field3450.DrawIndexedPrimitive(method1526(-114, arg5), 0, arg2, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method1169(byte arg0, Canvas arg1) {
        if (arg0 != -77) {
            this.method467(14, 61, -1, 77);
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)Lts;")
    public final class560 method532(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "()V")
    public final void method548() {
    }

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "(I)V")
    public final void method1150(int arg0) {
        if (arg0 != 13) {
            this.method1087(90);
        }
        this.field3450.SetScissorRect(this.field2437 + this.field2435, this.field2469 + this.field2446, this.field2449, this.field2402);
    }

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "(I)Z")
    private final boolean method1534(int arg0) {
        int var2 = this.field3450.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class426 var3 = (class426) this.field2199;
            this.method1097(83);
            var3.method2574((byte) -71);
            this.field3433.BackBufferWidth = 0;
            this.field3433.BackBufferHeight = 0;
            if (method1529(this.field3434, this.field2398, this.field3447, this.field3433, (byte) -119, this.field3438)) {
                int var4 = this.field3450.Reset(this.field3433);
                if (class507.method3053(var4, -1)) {
                    var3.method2572(this.field3450.method3072(), 0, this.field3450.method3061(0));
                    this.method1160(false);
                    this.method1130(true);
                    return true;
                }
            }
        }
        int var5 = -26 % ((25 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final synchronized void method454(int arg0) {
        this.field3446.method3960((byte) 69);
        super.method454(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "(II)V")
    public final void method450(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILvea;ZI[FZI)Loga;")
    public final class498 method1162(int arg0, int arg1, class288 arg2, boolean arg3, int arg4, float[] arg5, boolean arg6, int arg7) {
        if (!arg3) {
            this.field3460 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "()Z")
    public final boolean method451() {
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "(I)V")
    public final void method1121(int arg0) {
        if (arg0 >= 13) {
            this.field3450.SetViewport(this.field2435, this.field2469, this.field2365, this.field2265, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(FFF)V")
    public final void method499(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public final void method1069(byte arg0) {
        if (arg0 != -63) {
            this.field3446 = null;
        }
        this.field2460 = (this.field2480 - this.field2472);
        this.field2453 = this.field2460 - (float) this.field2451;
        if ((float) this.field2479 > this.field2453) {
            this.field2453 = this.field2479;
        }
        this.field3450.method3073(36, this.field2453);
        this.field3450.method3073(37, this.field2460);
        this.field3450.SetRenderState(34, this.field2441);
    }

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "()V")
    public final void method506() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lip;Z)I")
    private static final int method1535(class735 arg0, boolean arg1) {
        if (!arg1) {
            return 41;
        } else if (class605.field8453 == arg0) {
            return 2;
        } else if (class407.field5550 == arg0) {
            return 0;
        } else if (class639.field8962 == arg0) {
            return 1;
        } else if (class683.field9465 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "(B)V")
    public final void method1135(byte arg0) {
        this.field3450.method3076(15, this.field2442);
        if (arg0 > -84) {
            this.field3439 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZZBLip;I)V")
    public final void method1158(boolean arg0, boolean arg1, byte arg2, class735 arg3, int arg4) {
        int var6 = 0;
        if (arg2 > -83) {
            this.field3456 = false;
        }
        byte var8;
        if (arg4 == 1) {
            var8 = 3;
        } else if (arg4 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg1) {
            var6 |= 0x20;
        }
        if (arg0) {
            var6 |= 0x10;
        }
        this.field3450.SetTextureStageState(this.field2482, var8, method1535(arg3, true) | var6);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(Z)V")
    public final void method1123(boolean arg0) {
        if (!arg0) {
            this.field3457 = true;
        }
        int var2 = this.field3460[this.field2482] ? method1525((byte) 63, this.field2396[this.field2482]) : 1;
        this.field3450.SetTextureStageState(this.field2482, 1, var2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lvea;[BIZII)Lgga;")
    public final class307 method1193(class288 arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        return arg3 ? (class307) null : new class427(this, arg0, arg4, arg2, arg5, arg1);
    }
}
