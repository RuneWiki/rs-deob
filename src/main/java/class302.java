import jaclib.peer.class625;
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
import jagdx.class437;
import jagdx.class438;
import jagdx.class439;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class302 extends class478 {

    @OriginalMember(owner = "client!gaa", name = "wg", descriptor = "I")
    private int field3705 = 0;

    @OriginalMember(owner = "client!gaa", name = "Ng", descriptor = "Z")
    private boolean field3722 = false;

    @OriginalMember(owner = "client!gaa", name = "zg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3708;

    @OriginalMember(owner = "client!gaa", name = "Qg", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!gaa", name = "Eg", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!gaa", name = "Mg", descriptor = "Ljaclib/peer/am;")
    public class625 field3721;

    @OriginalMember(owner = "client!gaa", name = "Hg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3716;

    @OriginalMember(owner = "client!gaa", name = "tg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3702;

    @OriginalMember(owner = "client!gaa", name = "Rg", descriptor = "Loo;")
    private class41 field3726;

    @OriginalMember(owner = "client!gaa", name = "Bg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3710;

    @OriginalMember(owner = "client!gaa", name = "vg", descriptor = "Ljagdx/D3DLIGHT;")
    private class438 field3704;

    @OriginalMember(owner = "client!gaa", name = "Jg", descriptor = "Ljagdx/D3DLIGHT;")
    private class438 field3718;

    @OriginalMember(owner = "client!gaa", name = "Ig", descriptor = "Ljagdx/D3DLIGHT;")
    private class438 field3717;

    @OriginalMember(owner = "client!gaa", name = "Lg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3720;

    @OriginalMember(owner = "client!gaa", name = "Pg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3724;

    @OriginalMember(owner = "client!gaa", name = "Ag", descriptor = "Z")
    public boolean field3709;

    @OriginalMember(owner = "client!gaa", name = "Kg", descriptor = "Z")
    public boolean field3719;

    @OriginalMember(owner = "client!gaa", name = "Fg", descriptor = "Z")
    public boolean field3714;

    @OriginalMember(owner = "client!gaa", name = "sg", descriptor = "[Z")
    private boolean[] field3701;

    @OriginalMember(owner = "client!gaa", name = "Gg", descriptor = "[I")
    private int[] field3715;

    @OriginalMember(owner = "client!gaa", name = "Cg", descriptor = "[Z")
    private boolean[] field3711;

    @OriginalMember(owner = "client!gaa", name = "yg", descriptor = "[Lmv;")
    private class688[] field3707;

    @OriginalMember(owner = "client!gaa", name = "Og", descriptor = "[Z")
    private boolean[] field3723;

    @OriginalMember(owner = "client!gaa", name = "ug", descriptor = "[Z")
    private boolean[] field3703;

    @OriginalMember(owner = "client!gaa", name = "Dg", descriptor = "[I")
    private static int[] field3712 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!gaa", name = "xg", descriptor = "[F")
    private static float[] field3706 = new float[16];

    @OriginalMember(owner = "client!gaa", name = "Sg", descriptor = "[I")
    private static int[] field3727 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!gaa", name = "ya", descriptor = "()V")
    public final void method1031() {
        this.method2594(true, (byte) -25);
        this.field3716.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "(I)V")
    public final void method1670(int arg0) {
        if (arg0 >= -53) {
            this.field3720 = null;
        }
        this.field6294 = (this.field6267 - this.field6308);
        this.field6243 = this.field6294 - (float) this.field6324;
        if (this.field6243 < (float) this.field6318) {
            this.field6243 = this.field6318;
        }
        this.field3716.method2317(36, this.field6243);
        this.field3716.method2317(37, this.field6294);
        this.field3716.SetRenderState(34, this.field6303);
    }

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "(B)V")
    public final void method1671(byte arg0) {
        this.field3716.SetViewport(this.field6307, this.field6285, this.field6076, this.field6103, 0.0F, 1.0F);
        if (arg0 != 116) {
            this.field3718 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public final void method1672(Object arg0, byte arg1, Canvas arg2) {
        this.field3726 = (class41) arg0;
        int var4 = 124 / ((arg1 - 8) / 55);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([IIZIIII)Lls;")
    public final class459 method1673(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        return arg1 == 3 ? new class90(this, arg5, arg6, arg2, arg0, arg4, arg3) : (class459) null;
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "()Z")
    public final boolean method1006() {
        return false;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZILgb;Z)V")
    public final void method1674(boolean arg0, int arg1, class162 arg2, boolean arg3) {
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg0) {
            var7 |= 0x10;
        }
        this.field3716.SetTextureStageState(this.field6286, var6, var7 | method1699((byte) 82, arg2));
        if (arg3) {
            this.method1723(127);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "()V")
    public final void method1052() {
    }

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "(I)V")
    public final void method1675(int arg0) {
        int var2 = 115 / ((82 - arg0) / 40);
        this.field3716.SetScissorRect(this.field6307 + this.field6302, this.field6285 - -this.field6335, this.field6333, this.field6306);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLgb;IZB)V")
    public final void method1676(boolean arg0, class162 arg1, int arg2, boolean arg3, byte arg4) {
        int var6 = -100 / ((arg4 + 17) / 34);
        byte var8;
        if (arg2 == 1) {
            var8 = 3;
        } else if (arg2 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        int var9 = 0;
        if (arg3) {
            var9 |= 0x20;
        }
        if (arg0) {
            var9 |= 0x10;
        }
        this.field3716.SetTextureStageState(this.field6286, var8, method1699((byte) 78, arg1) | var9);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lrca;I)V")
    public final void method1677(class34 arg0, int arg1) {
        int var3 = 0;
        if (class31.field444 == arg0) {
            var3 = 65536;
        } else if (class507.field6853 == arg0) {
            var3 = 131072;
        } else if (class186.field2359 == arg0) {
            var3 = 196608;
        }
        int var4 = -50 % ((80 - arg1) / 38);
        this.field3716.SetTextureStageState(this.field6286, 11, var3 | this.field6286);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILmv;)I")
    private static final int method1678(int arg0, class688 arg1) {
        if (class652.field9201 == arg1) {
            return 2;
        } else if (class47.field659 == arg1) {
            return 1;
        } else {
            if (arg0 != 1) {
                field3706 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "(B)V")
    public final void method1679(byte arg0) {
        if (this.field6330.method1638(3)) {
            this.field6236.method3899((byte) 68, field3706);
        } else {
            field3706[8] = 0.0F;
            field3706[1] = 0.0F;
            field3706[6] = 0.0F;
            field3706[9] = 0.0F;
            field3706[0] = 1.0F;
            field3706[4] = 0.0F;
            field3706[10] = 1.0F;
            field3706[7] = 0.0F;
            field3706[2] = 0.0F;
            field3706[15] = 1.0F;
            field3706[5] = 1.0F;
            field3706[13] = 0.0F;
            field3706[11] = 0.0F;
            field3706[12] = 0.0F;
            field3706[3] = 0.0F;
            field3706[14] = 0.0F;
        }
        this.field3716.SetTransform(2, field3706);
        if (arg0 > -119) {
            this.method1089();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(ZI)Lhh;")
    public final class666 method1680(boolean arg0, int arg1) {
        return arg1 == 16 ? new class254(this, class117.field1510, arg0) : (class666) null;
    }

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "(I)V")
    public final void method1681(int arg0) {
        this.field3704.SetAmbient(this.field6331 * this.field6251, this.field6331 * this.field6295, this.field6331 * this.field6275, (float) arg0);
        this.field3722 = false;
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(ZB)V")
    public final void method1682(boolean arg0, byte arg1) {
        if (arg1 < -51) {
            this.field3716.method2325(161, arg0);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
    public final void method1038(boolean arg0) {
    }

    @OriginalMember(owner = "client!gaa", name = "M", descriptor = "(I)V")
    public final void method1683(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field6312; var2++) {
            class332 var3 = this.field6337[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1881(45);
            float var6 = var3.method1882(arg0 ^ 0x65) / 255.0F;
            this.field3717.SetPosition((float) var3.method1886(true), (float) var3.method1888(-111), (float) var3.method1885((byte) 119));
            this.field3717.SetDiffuse((float) ((var5 & 0xFF2342) >> 16) * var6, (float) ((var5 & 0xFF02) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3717.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1883((byte) 108) * var3.method1883((byte) -81)));
            this.field3717.SetRange((float) var3.method1883((byte) 70));
            this.field3716.SetLight(var4, this.field3717);
            this.field3716.LightEnable(var4, true);
        }
        while (this.field6263 > var2) {
            this.field3716.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1683(arg0);
    }

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "(I)V")
    public final void method1684(int arg0) {
        this.field3716.method2325(174, this.field6360);
        if (arg0 <= 45) {
            this.method1725((byte) 78, -61);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "(Z)V")
    public final void method1685(boolean arg0) {
        if (!arg0) {
            this.field3711 = null;
        }
        if (class385.field4847 == this.field6288) {
            this.field3716.SetRenderState(19, 5);
            this.field3716.SetRenderState(20, 6);
        } else if (class451.field5774 == this.field6288) {
            this.field3716.SetRenderState(19, 2);
            this.field3716.SetRenderState(20, 2);
        } else if (class473.field6004 == this.field6288) {
            this.field3716.SetRenderState(19, 9);
            this.field3716.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "I", descriptor = "(I)V")
    public final void method1686(int arg0) {
        this.field3716.method2325(7, this.field6274);
        if (arg0 != 0) {
            this.field3708 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILbt;Lec;)Z")
    public final boolean method1687(int arg0, class117 arg1, class146 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 <= 25) {
            method1733(-93, null);
        }
        return class439.method2333(this.field3708.method2310(this.field3725, var4), -2005530519) && class439.method2333(this.field3708.CheckDeviceFormat(this.field3725, this.field3713, var4.Format, 0, 3, method1720(arg2, arg1, true)), -2005530519);
    }

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "(B)F")
    public final float method1688(byte arg0) {
        int var2 = 79 % ((1 - arg0) / 37);
        return -0.5F;
    }

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "(I)V")
    public final void method1689(int arg0) {
        this.method1722(arg0 - 25689);
        this.method1724(arg0 + 4);
        if (arg0 != 1) {
            method1699((byte) -38, null);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method1690(int arg0, Object arg1, Canvas arg2) {
        if (this.field6059 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field3716.EndScene();
                this.method1719(arg0 ^ 0x7);
                this.field3716.BeginScene();
            }
        }
        if (arg0 != 7) {
            this.field3705 = -53;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "(I)V")
    public final void method1691(int arg0) {
        if (arg0 != 1) {
            this.method1721(40);
        }
        this.field3716.method2325(14, this.field6314 && this.field6293);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lf;Z)V")
    public final void method976(class536 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "(Z)V")
    public final void method1692(boolean arg0) {
        if (arg0) {
            field3727 = null;
        }
        this.field3716.method2325(27, this.field6338);
    }

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "(Z)V")
    public final void method1693(boolean arg0) {
        this.field3704.SetDirection(-this.field6332[0], -this.field6332[1], -this.field6332[2]);
        this.field3718.SetDirection(-this.field6299[0], -this.field6299[1], -this.field6299[2]);
        this.field3722 = arg0;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lep;Z)V")
    public final void method1694(class420 arg0, boolean arg1) {
        this.method1702(-22, arg0);
        if (!arg1) {
            return;
        }
        if (!this.field3711[this.field6286]) {
            this.field3716.SetSamplerState(this.field6286, 1, 1);
            this.field3711[this.field6286] = true;
        }
        if (!this.field3701[this.field6286]) {
            this.field3716.SetSamplerState(this.field6286, 2, 1);
            this.field3701[this.field6286] = true;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLnba;I)V")
    public final void method1695(byte arg0, class401 arg1, int arg2) {
        if (arg0 == -16) {
            class379 var4 = (class379) arg1;
            this.field3716.SetStreamSource(arg2, var4.field4797, 0, var4.method2058((byte) -102));
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZI[[I)Loq;")
    public final class660 method1696(boolean arg0, boolean arg1, int arg2, int[][] arg3) {
        if (!arg1) {
            this.method1691(124);
        }
        return new class345(this, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "(B)V")
    public final void method1697(byte arg0) {
        if (this.field6336[this.field6286] == class366.field4651) {
            this.field3716.SetTextureStageState(this.field6286, 24, 0);
            this.field3715[this.field6286] = 0;
        } else {
            if (this.field6336[this.field6286] == class8.field160) {
                this.field3716.SetTransform(this.field6286 + 16, this.field6315[this.field6286].method3899((byte) 68, field3706));
            } else {
                this.field3716.SetTransform(this.field6286 + 16, this.field6315[this.field6286].method3901(77, field3706));
            }
            int var2 = method1733(1, this.field6336[this.field6286]);
            if (this.field3715[this.field6286] != var2) {
                this.field3716.SetTextureStageState(this.field6286, 24, var2);
                this.field3715[this.field6286] = var2;
            }
        }
        int var3 = -125 / ((arg0 + 25) / 60);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([FIIIZIILec;)Lls;")
    public final class459 method1698(float[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class146 arg7) {
        if (arg3 != 10) {
            this.method1082();
        }
        return null;
    }

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "()Loa;")
    public final class226 method1001() {
        D3DADAPTER_IDENTIFIER var1 = this.field3708.method2309(this.field3725, 0);
        return new class226(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLgb;)I")
    private static final int method1699(byte arg0, class162 arg1) {
        if (class5.field119 == arg1) {
            return 2;
        } else if (class563.field7825 == arg1) {
            return 0;
        } else if (class141.field1830 == arg1) {
            return 1;
        } else if (class700.field9903 == arg1) {
            return 3;
        } else {
            if (arg0 <= 49) {
                field3712 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILlt;IIIILhh;)V")
    public final void method1700(int arg0, class273 arg1, int arg2, int arg3, int arg4, int arg5, class666 arg6) {
        this.field3716.SetIndices(((class254) arg6).field3105);
        this.field3716.DrawIndexedPrimitive(method1703(arg1, (byte) 116), 0, arg5, arg0, arg2, arg4);
        if (arg3 != 12896) {
            this.method1725((byte) -23, -99);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "()V")
    public final void method988() throws class180 {
        this.field3716.EndScene();
        if (this.field3726.method250((byte) 14)) {
            this.field3705 = 0;
            if (class439.method2332(true, this.field3726.method253(true, 0))) {
                this.method1719(0);
            }
        } else if (++this.field3705 <= 50) {
            this.method1719(0);
        } else {
            throw new class180();
        }
        this.field3716.BeginScene();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!gaa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lpl;Ljava/lang/Integer;)Lr;")
    public static final class566 createToolkit(Canvas arg0, class526 arg1, class612 arg2, Integer arg3) {
        class302 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class625 var7 = new class625();
            IDirect3D var8 = IDirect3D.method2313(-2147483616, var7);
            D3DCAPS var9 = var8.method2311(var5, var6);
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
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1708(-98, var5, arg3, var6, var10, var8)) {
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
                    var13 = var8.method2312(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class437 var17) {
                    var13 = var8.method2312(var5, var6, arg0, var11 | 0x20, var10);
                }
                class41 var15 = new class41(var13.method2323(0), var13.method2315());
                var4 = new class302(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2585((byte) -121);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method1069();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "()Z")
    public final boolean method1032() {
        return false;
    }

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "(B)V")
    public final void method1701(byte arg0) {
        for (int var2 = 0; var2 < this.field6298; var2++) {
            this.field3716.SetSamplerState(var2, 7, 0);
            this.field3716.SetSamplerState(var2, 6, 2);
            this.field3716.SetSamplerState(var2, 5, 2);
            this.field3716.SetSamplerState(var2, 1, 1);
            this.field3716.SetSamplerState(var2, 2, 1);
            this.field3707[var2] = class652.field9201;
            this.field3711[var2] = this.field3701[var2] = true;
            this.field3703[var2] = false;
            this.field3715[var2] = 0;
        }
        this.field3716.SetTextureStageState(0, 6, 1);
        this.field3716.SetRenderState(9, 2);
        this.field3716.SetRenderState(23, 4);
        this.field3716.SetRenderState(25, 5);
        this.field3716.SetRenderState(24, 0);
        this.field3716.SetRenderState(22, 2);
        this.field3716.SetRenderState(147, 1);
        this.field3716.SetRenderState(145, 1);
        this.field3716.method2317(38, 0.95F);
        this.field3716.SetRenderState(140, 3);
        this.field3704.SetType(3);
        this.field3718.SetType(3);
        this.field3717.SetType(1);
        this.field3722 = false;
        super.method1701(arg0);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILqo;)V")
    public final void method1702(int arg0, class552 arg1) {
        this.field3716.SetTexture(this.field6286, arg1.method524(-13997));
        if (this.field3707[this.field6286] != arg1.field7695) {
            int var3 = method1678(1, arg1.field7695);
            this.field3716.SetSamplerState(this.field6286, 6, var3);
            this.field3716.SetSamplerState(this.field6286, 5, var3);
            this.field3707[this.field6286] = arg1.field7695;
            if (arg1.field7696 != this.field3703[this.field6286]) {
                this.field3716.SetSamplerState(this.field6286, 7, arg1.field7696 ? method1678(1, arg1.field7695) : 0);
                this.field3703[this.field6286] = arg1.field7696;
            }
        } else if (this.field3703[this.field6286] != arg1.field7696) {
            this.field3716.SetSamplerState(this.field6286, 7, arg1.field7696 ? method1678(1, arg1.field7695) : 0);
            this.field3703[this.field6286] = arg1.field7696;
        }
        if (arg0 < -7 && !this.field3723[this.field6286]) {
            this.field3723[this.field6286] = true;
            this.method1721(2);
            this.method1727(-2);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Llt;B)I")
    private static final int method1703(class273 arg0, byte arg1) {
        if (arg1 <= 111) {
            method1708(95, -16, 0, 4, null, null);
        }
        if (class632.field8875 == arg0) {
            return 2;
        } else if (class584.field8167 == arg0) {
            return 3;
        } else if (class327.field4187 == arg0) {
            return 1;
        } else if (class365.field4648 == arg0) {
            return 4;
        } else if (class26.field394 == arg0) {
            return 6;
        } else if (class51.field771 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILnw;)I")
    private static final int method1704(int arg0, class347 arg1) {
        if (class538.field7226 == arg1) {
            return 2;
        } else if (class112.field1466 == arg1) {
            return 4;
        } else if (class542.field7243 == arg1) {
            return 26;
        } else if (class88.field1235 == arg1) {
            return 7;
        } else if (class224.field2806 == arg1) {
            return 10;
        } else {
            if (arg0 != -1) {
                field3706 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(II)V")
    public final void method1705(int arg0, int arg1) {
        this.field3716.SetTextureStageState(this.field6286, 11, arg1);
        if (arg0 != 3) {
            this.field3714 = false;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method1706(Canvas arg0, int arg1) {
        if (arg1 != 19449) {
            this.method1724(-21);
        }
        return null;
    }

    @OriginalMember(owner = "client!gaa", name = "W", descriptor = "(I)V")
    public final void method1707(int arg0) {
        this.field3716.method2325(137, this.field6253 && !this.field6305);
        if (arg0 > -11) {
            this.method1676(false, null, 111, true, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;)Z")
    private static final boolean method1708(int arg0, int arg1, int arg2, int arg3, D3DPRESENT_PARAMETERS arg4, IDirect3D arg5) {
        if (arg0 > -94) {
            field3706 = null;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class439.method2332(true, arg5.method2310(arg1, var9))) {
                return false;
            }
            label79: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field3712.length; var10++) {
                        if (arg5.CheckDeviceType(arg1, arg3, var9.Format, field3712[var10], true) == 0 && arg5.CheckDeviceFormat(arg1, arg3, var9.Format, 1, 1, field3712[var10]) == 0 && (arg2 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg3, field3712[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field3727.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg1, arg3, var9.Format, 2, 1, field3727[var11]) == 0 && arg5.CheckDepthStencilMatch(arg1, arg3, var9.Format, field3712[var10], field3727[var11]) == 0 && (arg2 == 0 || arg5.CheckDeviceMultiSampleType(arg1, arg3, field3727[var10], true, var8) == 0)) {
                                    var7 = field3712[var10];
                                    var6 = field3727[var11];
                                    break label79;
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
            arg4.AutoDepthStencilFormat = var6;
            arg4.BackBufferFormat = var7;
            arg4.MultiSampleType = var8;
            arg4.MultiSampleQuality = 0;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLmq;)V")
    public final void method1709(boolean arg0, class81 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field3716.SetVertexDeclaration(var3.field3493);
        if (!arg0) {
            this.method1052();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lgt;I)V")
    public final void method1710(class90 arg0, int arg1) {
        this.method1702(-110, arg0);
        if (this.field3711[this.field6286] != arg0.field1268) {
            this.field3716.SetSamplerState(this.field6286, 1, arg0.field1268 ? 1 : 3);
            this.field3711[this.field6286] = arg0.field1268;
        }
        if (arg1 == 0 && arg0.field1271 != this.field3701[this.field6286]) {
            this.field3716.SetSamplerState(this.field6286, 2, arg0.field1271 ? 1 : 3);
            this.field3701[this.field6286] = arg0.field1271;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/am;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Loo;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lpl;I)V")
    private class302(int arg0, int arg1, Canvas arg2, class625 arg3, IDirect3D arg4, IDirect3DDevice arg5, class41 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class526 arg9, class612 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field3708 = arg4;
        this.field3725 = arg0;
        this.field3713 = arg1;
        this.field3721 = arg3;
        this.field3716 = arg5;
        this.field3702 = arg7;
        this.field3726 = arg6;
        this.field3710 = arg8;
        this.field3704 = new class438(this.field3721);
        this.field3718 = new class438(this.field3721);
        this.field3717 = new class438(this.field3721);
        this.field3720 = new PixelBuffer(this.field3721);
        this.field3724 = new GeometryBuffer(this.field3721);
        new GeometryBuffer(this.field3721);
        this.field6327 = (this.field3710.TextureCaps & 0x2000) != 0;
        this.field6296 = this.field3710.MaxActiveLights <= 0 ? 8 : this.field3710.MaxActiveLights;
        this.field6298 = this.field3710.MaxSimultaneousTextures;
        this.field3709 = (this.field3710.TextureCaps & 0x2) == 0;
        this.field3719 = (this.field3710.TextureCaps & 0x10000) != 0;
        this.field3714 = (this.field3710.TextureCaps & 0x4000) != 0;
        this.field6247 = (this.field3710.TextureCaps & 0x800) != 0;
        this.field6272 = this.field6260 > 0 || this.field3708.CheckDeviceMultiSampleType(this.field3725, this.field3713, this.field3702.BackBufferFormat, true, 2) == 0;
        this.field3701 = new boolean[this.field6298];
        this.field3715 = new int[this.field6298];
        this.field3711 = new boolean[this.field6298];
        this.field3707 = new class688[this.field6298];
        this.field3723 = new boolean[this.field6298];
        this.field3703 = new boolean[this.field6298];
        this.field3716.BeginScene();
    }

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "()V")
    public final void method1069() {
        this.field3721.method3441((byte) -62);
        super.method1069();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public final synchronized void method1051(int arg0) {
        this.field3721.method3438((byte) -108);
        super.method1051(arg0);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1711(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 != 121) {
            this.field3717 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lec;Lbt;I)Z")
    public final boolean method1712(class146 arg0, class117 arg1, int arg2) {
        int var4 = 33 % ((arg2 - 55) / 33);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class439.method2333(this.field3708.method2310(this.field3725, var5), -2005530519) && class439.method2333(this.field3708.CheckDeviceFormat(this.field3725, this.field3713, var5.Format, 0, 4, method1720(arg0, arg1, true)), -2005530519);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILec;IILbt;)Lls;")
    public final class459 method1713(int arg0, class146 arg1, int arg2, int arg3, class117 arg4) {
        return arg0 == 1 ? new class90(this, arg1, arg4, arg2, arg3) : (class459) null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([BLec;IIZZII)Lls;")
    public final class459 method1714(byte[] arg0, class146 arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            method1708(-77, -70, 41, -14, null, null);
        }
        return new class90(this, arg1, arg7, arg2, arg4, arg0, arg3, arg6);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljt;Ljt;FLjt;)Ljt;")
    public final class533 method1064(class533 arg0, class533 arg1, float arg2, class533 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Llt;III)V")
    public final void method1715(class273 arg0, int arg1, int arg2, int arg3) {
        this.field3716.DrawPrimitive(method1703(arg0, (byte) 124), arg1, arg2);
        if (arg3 != 28463) {
            this.method1712(null, null, -78);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZ)Lnba;")
    public final class401 method1716(boolean arg0, boolean arg1) {
        return arg0 ? (class401) null : new class379(this, arg1);
    }

    @OriginalMember(owner = "client!gaa", name = "DA", descriptor = "()I")
    public final int method1045() {
        return 0;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method987(Rectangle[] arg0, int arg1) throws class180 {
        this.method988();
    }

    @OriginalMember(owner = "client!gaa", name = "X", descriptor = "(I)V")
    public final void method1717(int arg0) {
        this.field3716.method2325(15, this.field6322);
        if (arg0 > -74) {
            this.field3711 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)V")
    public final void method1718(byte arg0) {
        if (arg0 != -108) {
            this.field3719 = true;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(FFF)V")
    public final void method1014(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!gaa", name = "ab", descriptor = "(I)Z")
    private final boolean method1719(int arg0) {
        int var2 = this.field3716.TestCooperativeLevel();
        if (arg0 == var2 || var2 == -2005530519) {
            class41 var3 = (class41) this.field6049;
            this.method2566(arg0 ^ 0xFFFFAEC9);
            var3.method251((byte) 97);
            this.field3702.BackBufferWidth = 0;
            this.field3702.BackBufferHeight = 0;
            if (method1708(-119, this.field3725, this.field6260, this.field3713, this.field3702, this.field3708)) {
                int var4 = this.field3716.Reset(this.field3702);
                if (class439.method2333(var4, -2005530519)) {
                    var3.method252(this.field3716.method2315(), this.field3716.method2323(0), (byte) 115);
                    this.method2560((byte) 127);
                    this.method1701((byte) 20);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "()V")
    public final void method1082() {
    }

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "()V")
    public final void method1004() {
        IDirect3DEventQuery var1 = this.field3716.method2327();
        if (class439.method2333(var1.Issue(), -2005530519)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3435(6168);
    }

    @OriginalMember(owner = "client!gaa", name = "ja", descriptor = "(I)V")
    public final void method1028(int arg0) {
        this.field3716.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lec;Lbt;Z)I")
    public static final int method1720(class146 arg0, class117 arg1, boolean arg2) {
        if (!arg2) {
            field3712 = null;
        }
        if (class117.field1509 == arg1) {
            if (class695.field9862 == arg0) {
                return 22;
            }
            if (class590.field8288 == arg0) {
                return 21;
            }
            if (class586.field8227 == arg0) {
                return 28;
            }
            if (class639.field8973 == arg0) {
                return 50;
            }
            if (class307.field3905 == arg0) {
                return 51;
            }
            if (class223.field2786 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "(I)V")
    public final void method1721(int arg0) {
        int var2 = this.field3723[this.field6286] ? method1704(arg0 ^ 0xFFFFFFFD, this.field6264[this.field6286]) : 1;
        if (arg0 != 2) {
            this.field3719 = false;
        }
        this.field3716.SetTextureStageState(this.field6286, 4, var2);
    }

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "(I)V")
    public final void method1722(int arg0) {
        if (arg0 != -25688) {
            return;
        }
        float var2 = this.field6281 ? this.field6290 : 0.0F;
        float var3 = this.field6281 ? -this.field6304 : 0.0F;
        this.field3704.SetDiffuse(this.field6251 * var2, this.field6295 * var2, this.field6275 * var2, 0.0F);
        this.field3718.SetDiffuse(this.field6251 * var3, this.field6295 * var3, this.field6275 * var3, 0.0F);
        this.field3722 = false;
    }

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "(I)V")
    public final void method1723(int arg0) {
        this.field3716.method2325(28, this.field6257 && this.field6256 && this.field6324 >= 0);
        int var2 = 28 / ((arg0 + 15) / 55);
    }

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "(I)V")
    public final void method1724(int arg0) {
        if (!this.field3722) {
            this.field3716.LightEnable(0, false);
            this.field3716.LightEnable(1, false);
            this.field3716.SetLight(0, this.field3704);
            this.field3716.SetLight(1, this.field3718);
            this.field3716.LightEnable(0, true);
            this.field3716.LightEnable(1, true);
            this.field3722 = true;
        }
        if (arg0 != 5) {
            this.method1714(null, null, 45, -21, false, false, 124, -101);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "(IIII)[I")
    public final int[] method1037(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3716.method2319(0);
        IDirect3DSurface var7 = this.field3716.method2331(arg2, arg3, 21, 0, 0, true);
        if (class439.method2333(this.field3716.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -2005530519) && class439.method2333(var7.LockRect(0, 0, arg2, arg3, 0, this.field3720), -2005530519)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3720.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field3720.method2306(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3720.method2306(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3435(6168);
        var7.method3435(6168);
        return var5;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(BI)Lcl;")
    public final class74 method1725(byte arg0, int arg1) {
        if (arg0 > -126) {
            return (class74) null;
        } else if (arg1 == 3) {
            return new class628(this, this.field6202);
        } else if (arg1 == 4) {
            return new class53(this, this.field6202, this.field6174);
        } else if (arg1 == 8) {
            return new class292(this, this.field6202, this.field6174);
        } else {
            return super.method1725((byte) -127, arg1);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "K", descriptor = "(I)V")
    public final void method1726(int arg0) {
        if (this.field3723[this.field6286]) {
            this.field3723[this.field6286] = false;
            this.field3716.SetTexture(this.field6286, null);
            this.method1721(arg0 ^ 0x2);
            this.method1727(-2);
        }
        if (arg0 != 0) {
            this.field3723 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "(I)V")
    public final void method1727(int arg0) {
        int var2 = this.field3723[this.field6286] ? method1704(-1, this.field6255[this.field6286]) : 1;
        this.field3716.SetTextureStageState(this.field6286, 1, var2);
        if (arg0 != -2) {
            this.method1679((byte) -35);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "P", descriptor = "(I)V")
    public final void method1728(int arg0) {
        int var2 = -78 % ((arg0 - 6) / 53);
        this.field3716.SetTransform(3, this.field6317);
    }

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "(I)V")
    public final void method1729(int arg0) {
        if (arg0 != 0) {
            field3712 = null;
        }
        this.field3716.SetRenderState(60, this.field6300);
    }

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "()V")
    public final void method983() {
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Leda;Z)Lmq;")
    public final class81 method1730(class563[] arg0, boolean arg1) {
        if (!arg1) {
            this.field3719 = true;
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
    public final void method1731(byte arg0) {
        if (this.field6229) {
            field3706[9] = 0.0F;
            field3706[0] = 1.0F;
            field3706[12] = 0.0F;
            field3706[7] = 0.0F;
            field3706[13] = 0.0F;
            field3706[5] = 1.0F;
            field3706[3] = 0.0F;
            field3706[14] = 0.0F;
            field3706[10] = 1.0F;
            field3706[1] = 0.0F;
            field3706[11] = 0.0F;
            field3706[4] = 0.0F;
            field3706[8] = 0.0F;
            field3706[6] = 0.0F;
            field3706[2] = 0.0F;
            field3706[15] = 1.0F;
        } else {
            this.field6232.method3899((byte) 68, field3706);
        }
        if (arg0 != 86) {
            this.field3708 = null;
        }
        this.field3716.SetTransform(256, field3706);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[BIILec;I)Lfl;")
    public final class187 method1732(int arg0, byte[] arg1, int arg2, int arg3, class146 arg4, int arg5) {
        return arg0 == -13331 ? new class420(this, arg4, arg2, arg5, arg3, arg1) : (class187) null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V")
    public final void method1089() {
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(ILki;)I")
    private static final int method1733(int arg0, class320 arg1) {
        if (arg0 != 1) {
            field3706 = null;
        }
        if (class667.field9404 == arg1) {
            return 1;
        } else if (class587.field8253 == arg1) {
            return 2;
        } else if (class590.field8284 == arg1) {
            return 3;
        } else if (class8.field160 == arg1) {
            return 4;
        } else if (class71.field962 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }
}
