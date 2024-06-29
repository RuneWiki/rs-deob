import jaclib.peer.class671;
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
import jagdx.class482;
import jagdx.class483;
import jagdx.class484;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class229 extends class251 {

    @OriginalMember(owner = "client!tg", name = "Zg", descriptor = "I")
    private int field3088 = 0;

    @OriginalMember(owner = "client!tg", name = "Wg", descriptor = "Z")
    private boolean field3085 = false;

    @OriginalMember(owner = "client!tg", name = "eh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3093;

    @OriginalMember(owner = "client!tg", name = "Qg", descriptor = "I")
    private int field3079;

    @OriginalMember(owner = "client!tg", name = "ah", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3089;

    @OriginalMember(owner = "client!tg", name = "hh", descriptor = "Lgm;")
    private class122 field3096;

    @OriginalMember(owner = "client!tg", name = "Hg", descriptor = "I")
    private int field3070;

    @OriginalMember(owner = "client!tg", name = "dh", descriptor = "Ljaclib/peer/faa;")
    public class671 field3092;

    @OriginalMember(owner = "client!tg", name = "Ig", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3071;

    @OriginalMember(owner = "client!tg", name = "Ug", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3083;

    @OriginalMember(owner = "client!tg", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class484 field3069;

    @OriginalMember(owner = "client!tg", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class484 field3078;

    @OriginalMember(owner = "client!tg", name = "ch", descriptor = "Ljagdx/D3DLIGHT;")
    private class484 field3091;

    @OriginalMember(owner = "client!tg", name = "Mg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3075;

    @OriginalMember(owner = "client!tg", name = "Og", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3077;

    @OriginalMember(owner = "client!tg", name = "Ng", descriptor = "Z")
    public boolean field3076;

    @OriginalMember(owner = "client!tg", name = "Vg", descriptor = "Z")
    public boolean field3084;

    @OriginalMember(owner = "client!tg", name = "Lg", descriptor = "Z")
    public boolean field3074;

    @OriginalMember(owner = "client!tg", name = "Jg", descriptor = "[I")
    private int[] field3072;

    @OriginalMember(owner = "client!tg", name = "bh", descriptor = "[Z")
    private boolean[] field3090;

    @OriginalMember(owner = "client!tg", name = "Yg", descriptor = "[Llda;")
    private class485[] field3087;

    @OriginalMember(owner = "client!tg", name = "fh", descriptor = "[Z")
    private boolean[] field3094;

    @OriginalMember(owner = "client!tg", name = "gh", descriptor = "[Z")
    private boolean[] field3095;

    @OriginalMember(owner = "client!tg", name = "Sg", descriptor = "[Z")
    private boolean[] field3081;

    @OriginalMember(owner = "client!tg", name = "Tg", descriptor = "[I")
    private static int[] field3082 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!tg", name = "Xg", descriptor = "[F")
    private static float[] field3086 = new float[16];

    @OriginalMember(owner = "client!tg", name = "Kg", descriptor = "[I")
    private static int[] field3073 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!tg", name = "Rg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3080;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lsi;I)I")
    private static final int method1424(class559 arg0, int arg1) {
        if (class719.field9987 == arg0) {
            return 2;
        } else if (class502.field7202 == arg0) {
            return 4;
        } else if (class589.field8300 == arg0) {
            return 26;
        } else if (class170.field2330 == arg0) {
            return 7;
        } else if (class116.field1400 == arg0) {
            return 10;
        } else {
            if (arg1 != 12225) {
                method1476(null, -82);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "(B)V")
    public final void method1425(byte arg0) {
        if (arg0 != -45) {
            this.field3076 = true;
        }
        if (this.field3094[this.field3561]) {
            this.field3094[this.field3561] = false;
            this.field3093.SetTexture(this.field3561, null);
            this.method1455((byte) 70);
            this.method1436(26776);
        }
    }

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "(I)V")
    public final void method1426(int arg0) {
        if (arg0 != 3) {
            this.field3092 = null;
        }
        this.field3093.method2889(174, this.field3655);
    }

    @OriginalMember(owner = "client!tg", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lfp;Ljava/lang/Integer;)Lha;")
    public static final class58 createToolkit(Canvas arg0, class149 arg1, class323 arg2, Integer arg3) {
        class229 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class671 var7 = new class671();
            IDirect3D var8 = IDirect3D.method2877(-2147483616, var7);
            D3DCAPS var9 = var8.method2878(var5, var6);
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
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1457(arg3, var8, 0, var10, var6, var5)) {
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
                    var13 = var8.method2875(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class483 var17) {
                    var13 = var8.method2875(var5, var6, arg0, var11 | 0x20, var10);
                }
                class122 var15 = new class122(var13.method2881(0), var13.method2882());
                var4 = new class229(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1592((byte) 55);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method389();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "(I)V")
    public final void method1427(int arg0) {
        if (arg0 != 11) {
            this.method413();
        }
        this.field3093.SetTransform(3, this.field3553);
    }

    @OriginalMember(owner = "client!tg", name = "na", descriptor = "(IIII)[I")
    public final int[] method409(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3093.method2888(0);
        IDirect3DSurface var7 = this.field3093.method2895(arg2, arg3, 21, 0, 0, true);
        if (class482.method2873(-128, this.field3093.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class482.method2873(-96, var7.LockRect(0, 0, arg2, arg3, 16, this.field3075))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3075.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field3075.method2901(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3075.method2901(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3677(7516);
        var7.method3677(7516);
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "()V")
    public final void method432() {
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(FFF)V")
    public final void method428(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public final void method1428(Canvas arg0, Object arg1, boolean arg2) {
        if (!arg2) {
            this.method449(false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Lada;")
    public final class161 method1429(boolean arg0, int arg1) {
        if (arg1 != 30519) {
            this.field3071 = null;
        }
        return new class696(this, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(IB)V")
    public final void method1430(int arg0, byte arg1) {
        this.field3093.SetTextureStageState(this.field3561, 11, arg0);
        if (arg1 != 70) {
            field3073 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V")
    public final void method1431(int arg0, IDirect3DPixelShader arg1) {
        int var3 = -24 / ((-arg0 - 42) / 34);
        this.field3093.SetPixelShader(arg1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lgd;)V")
    public final void method478(class339 arg0) {
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
    public final void method389() {
        this.field3092.method3672(false);
        super.method389();
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)V")
    public final void method1432(byte arg0) {
        if (class557.field7810 == this.field3551) {
            this.field3093.SetRenderState(19, 5);
            this.field3093.SetRenderState(20, 6);
        } else if (class246.field3286 == this.field3551) {
            this.field3093.SetRenderState(19, 2);
            this.field3093.SetRenderState(20, 2);
        } else if (class498.field7159 == this.field3551) {
            this.field3093.SetRenderState(19, 9);
            this.field3093.SetRenderState(20, 2);
        }
        if (arg0 != -83) {
            this.method1488(123, null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "(I)V")
    public final void method1433(int arg0) {
        if (this.field3080 == null && this.field3590[this.field3561] != class245.field3269) {
            if (this.field3590[this.field3561] == class184.field2497) {
                this.field3093.SetTransform(this.field3561 + 16, this.field3559[this.field3561].method2141(-95, field3086));
            } else {
                this.field3093.SetTransform(this.field3561 + 16, this.field3559[this.field3561].method2137(field3086, 113));
            }
            int var2 = method1476(this.field3590[this.field3561], arg0 - 13212);
            if (this.field3072[this.field3561] != var2) {
                this.field3093.SetTextureStageState(this.field3561, 24, var2);
                this.field3072[this.field3561] = var2;
            }
        } else {
            this.field3093.SetTextureStageState(this.field3561, 24, 0);
            this.field3072[this.field3561] = 0;
        }
        if (arg0 != 13225) {
            this.field3079 = -96;
        }
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(Z)V")
    public final void method1434(boolean arg0) {
        if (this.field3517) {
            field3086[11] = 0.0F;
            field3086[6] = 0.0F;
            field3086[13] = 0.0F;
            field3086[4] = 0.0F;
            field3086[3] = 0.0F;
            field3086[8] = 0.0F;
            field3086[5] = 1.0F;
            field3086[7] = 0.0F;
            field3086[9] = 0.0F;
            field3086[14] = 0.0F;
            field3086[1] = 0.0F;
            field3086[12] = 0.0F;
            field3086[10] = 1.0F;
            field3086[2] = 0.0F;
            field3086[15] = 1.0F;
            field3086[0] = 1.0F;
        } else {
            this.field3524.method2137(field3086, 15);
        }
        if (!arg0) {
            this.method1449(-65);
        }
        this.field3093.SetTransform(256, field3086);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public final void method1435(Canvas arg0, int arg1, Object arg2) {
        if (arg1 <= 115) {
            this.field3077 = null;
        }
        if (this.field3454 != arg0) {
            return;
        }
        Dimension var4 = arg0.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field3093.EndScene();
            this.method1486(104);
            this.field3093.BeginScene();
        }
    }

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "(I)V")
    public final void method1436(int arg0) {
        int var2 = this.field3094[this.field3561] ? method1424(this.field3583[this.field3561], arg0 ^ 0x4759) : 1;
        this.field3093.SetTextureStageState(this.field3561, 1, var2);
        if (arg0 != 26776) {
            this.field3094 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "()Z")
    public final boolean method413() {
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLkt;)I")
    private static final int method1437(byte arg0, class155 arg1) {
        if (class597.field8397 == arg1) {
            return 2;
        } else if (class539.field7554 == arg1) {
            return 0;
        } else if (class240.field3203 == arg1) {
            return 1;
        } else if (class679.field9315 == arg1) {
            return 3;
        } else if (arg0 == -44) {
            throw new IllegalArgumentException();
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLkt;BI)V")
    public final void method1438(boolean arg0, class155 arg1, byte arg2, int arg3) {
        if (arg2 >= -35) {
            field3082 = null;
        }
        byte var6;
        if (arg3 == 1) {
            var6 = 6;
        } else if (arg3 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg0) {
            var7 |= 0x10;
        }
        this.field3093.SetTextureStageState(this.field3561, var6, method1437((byte) -44, arg1) | var7);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lwt;Lbda;I)Z")
    public final boolean method1439(class309 arg0, class505 arg1, int arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 == 98) {
            return class482.method2873(-72, this.field3083.method2876(this.field3070, var4)) && class482.method2873(-76, this.field3083.CheckDeviceFormat(this.field3070, this.field3079, var4.Format, 0, 4, method1482(arg0, arg1, arg2 ^ -19)));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "ya", descriptor = "()V")
    public final void method440() {
        this.method1629(true, (byte) -28);
        this.field3093.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(B)V")
    public final void method1440(byte arg0) {
        if (this.field3555.method1735(true)) {
            this.field3529.method2137(field3086, arg0 ^ 0xFFFFFFD6);
        } else {
            field3086[3] = 0.0F;
            field3086[11] = 0.0F;
            field3086[13] = 0.0F;
            field3086[9] = 0.0F;
            field3086[12] = 0.0F;
            field3086[4] = 0.0F;
            field3086[6] = 0.0F;
            field3086[10] = 1.0F;
            field3086[2] = 0.0F;
            field3086[8] = 0.0F;
            field3086[0] = 1.0F;
            field3086[14] = 0.0F;
            field3086[1] = 0.0F;
            field3086[5] = 1.0F;
            field3086[15] = 1.0F;
            field3086[7] = 0.0F;
        }
        if (arg0 != 20) {
            this.method415(28, -102);
        }
        this.field3093.SetTransform(2, field3086);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILbda;II[FZ)Ldh;")
    public final class320 method1441(int arg0, int arg1, int arg2, class505 arg3, int arg4, int arg5, float[] arg6, boolean arg7) {
        int var9 = -36 % ((arg0 + 11) / 46);
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "(B)V")
    public final void method1442(byte arg0) {
        if (arg0 > -109) {
            this.field3078 = null;
        }
        this.field3093.method2889(137, this.field3593 && !this.field3573);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public final void method1443(byte arg0) {
        int var2 = 42 % ((arg0 + 68) / 49);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lwt;Lbda;B)Z")
    public final boolean method1444(class309 arg0, class505 arg1, byte arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 != -45) {
            this.method1452((byte) 76, null);
        }
        return class482.method2873(-102, this.field3083.method2876(this.field3070, var4)) && class482.method2873(-74, this.field3083.CheckDeviceFormat(this.field3070, this.field3079, var4.Format, 0, 3, method1482(arg0, arg1, 126)));
    }

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "()Z")
    public final boolean method491() {
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(Z)V")
    public final void method1445(boolean arg0) {
        float var2 = this.field3631 ? this.field3580 : 0.0F;
        float var3 = this.field3631 ? -this.field3579 : 0.0F;
        this.field3069.SetDiffuse(this.field3617 * var2, this.field3604 * var2, this.field3624 * var2, 0.0F);
        this.field3078.SetDiffuse(this.field3617 * var3, this.field3604 * var3, this.field3624 * var3, 0.0F);
        this.field3085 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "(I)V")
    public final void method1446(int arg0) {
        this.field3093.SetScissorRect(this.field3605 + this.field3564, this.field3601 + this.field3534, this.field3622, this.field3545);
        if (arg0 != 0) {
            this.field3096 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(Z)V")
    public final void method1447(boolean arg0) {
        if (!arg0) {
            this.field3084 = true;
        }
        this.field3093.method2889(7, this.field3596);
    }

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "(I)V")
    public final void method1448(int arg0) {
        this.field3093.method2889(14, this.field3566 && this.field3538);
        if (arg0 > -81) {
            this.method1458(113, 93, 86, 81, 117, null, false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "(I)V")
    public final void method1449(int arg0) {
        if (arg0 <= -30) {
            this.field3093.method2889(15, this.field3629);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLkt;IZZ)V")
    public final void method1450(boolean arg0, class155 arg1, int arg2, boolean arg3, boolean arg4) {
        byte var7;
        if (arg2 == 1) {
            var7 = 3;
        } else if (arg2 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg4) {
            this.field3084 = true;
        }
        if (arg3) {
            var8 |= 0x20;
        }
        if (arg0) {
            var8 |= 0x10;
        }
        this.field3093.SetTextureStageState(this.field3561, var7, method1437((byte) -44, arg1) | var8);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BI)Lraa;")
    public final class606 method1451(byte arg0, int arg1) {
        int var3 = 53 % ((-arg0 - 37) / 54);
        if (arg1 == 3) {
            return new class304(this, this.field3504);
        } else if (arg1 == 4) {
            return new class599(this, this.field3504, this.field3399);
        } else if (arg1 == 8) {
            return new class683(this, this.field3504, this.field3399);
        } else {
            return super.method1451((byte) -103, arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "()V")
    public final void method481() {
        IDirect3DEventQuery var1 = this.field3093.method2880();
        if (class482.method2873(-71, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3677(7516);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIIID)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()V")
    public final void method377() {
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLcd;)V")
    public final void method1452(byte arg0, class313 arg1) {
        int var3 = 68 / ((arg0 + 36) / 60);
        this.method1484(7, arg1);
        if (!this.field3090[this.field3561]) {
            this.field3093.SetSamplerState(this.field3561, 1, 1);
            this.field3090[this.field3561] = true;
        }
        if (!this.field3095[this.field3561]) {
            this.field3093.SetSamplerState(this.field3561, 2, 1);
            this.field3095[this.field3561] = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "(B)V")
    public final void method1453(byte arg0) {
        if (arg0 >= -56) {
            this.method1447(true);
        }
        int var2;
        for (var2 = 0; var2 < this.field3589; var2++) {
            class465 var3 = this.field3537[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2778((byte) 101);
            float var6 = var3.method2780(-18277) / 255.0F;
            this.field3091.SetPosition((float) var3.method2772(false), (float) var3.method2774(-47), (float) var3.method2773(true));
            this.field3091.SetDiffuse((float) ((var5 & 0xFFF10E) >> 16) * var6, (float) ((var5 & 0xFFE6) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3091.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2777(-1) * var3.method2777(-1)));
            this.field3091.SetRange((float) var3.method2777(-1));
            this.field3093.SetLight(var4, this.field3091);
            this.field3093.LightEnable(var4, true);
        }
        while (this.field3600 > var2) {
            this.field3093.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1453((byte) -101);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILik;)I")
    private static final int method1454(int arg0, class207 arg1) {
        if (arg0 != 2) {
            field3082 = null;
        }
        if (class658.field9019 == arg1) {
            return 2;
        } else if (class397.field5601 == arg1) {
            return 3;
        } else if (class186.field2510 == arg1) {
            return 1;
        } else if (class441.field6289 == arg1) {
            return 4;
        } else if (class166.field2284 == arg1) {
            return 6;
        } else if (class656.field8994 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(II)Lgba;")
    public final class666 method473(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "(B)V")
    public final void method1455(byte arg0) {
        int var2 = this.field3094[this.field3561] ? method1424(this.field3563[this.field3561], 12225) : 1;
        int var3 = -76 / ((arg0 - 4) / 56);
        this.field3093.SetTextureStageState(this.field3561, 4, var2);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public final void method449(boolean arg0) {
    }

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "(I)V")
    public final void method1456(int arg0) {
        this.field3069.SetDirection(-this.field3569[0], -this.field3569[arg0], -this.field3569[2]);
        this.field3078.SetDirection(-this.field3546[0], -this.field3546[1], -this.field3546[2]);
        this.field3085 = false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmf;Lmf;FLmf;)Lmf;")
    public final class418 method453(class418 arg0, class418 arg1, float arg2, class418 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;II)Z")
    private static final boolean method1457(int arg0, IDirect3D arg1, int arg2, D3DPRESENT_PARAMETERS arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class482.method2874(arg1.method2876(arg5, var9), 0)) {
                return false;
            }
            label80: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field3073.length; var10++) {
                        if (arg1.CheckDeviceType(arg5, arg4, var9.Format, field3073[var10], true) == 0 && arg1.CheckDeviceFormat(arg5, arg4, var9.Format, 1, 1, field3073[var10]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg5, arg4, field3073[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field3082.length; var11++) {
                                if (arg1.CheckDeviceFormat(arg5, arg4, var9.Format, 2, 1, field3082[var11]) == 0 && arg1.CheckDepthStencilMatch(arg5, arg4, var9.Format, field3073[var10], field3082[var11]) == 0 && (arg0 == 0 || arg1.CheckDeviceMultiSampleType(arg5, arg4, field3082[var10], true, var8) == 0)) {
                                    var7 = field3073[var10];
                                    var6 = field3082[var11];
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
            arg3.AutoDepthStencilFormat = var6;
            arg3.MultiSampleQuality = arg2;
            arg3.MultiSampleType = var8;
            arg3.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/faa;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lgm;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lfp;I)V")
    private class229(int arg0, int arg1, Canvas arg2, class671 arg3, IDirect3D arg4, IDirect3DDevice arg5, class122 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class149 arg9, class323 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field3093 = arg5;
            this.field3079 = arg1;
            this.field3089 = arg8;
            this.field3096 = arg6;
            this.field3070 = arg0;
            this.field3092 = arg3;
            this.field3071 = arg7;
            this.field3083 = arg4;
            this.field3069 = new class484(this.field3092);
            this.field3078 = new class484(this.field3092);
            this.field3091 = new class484(this.field3092);
            this.field3075 = new PixelBuffer(this.field3092);
            this.field3077 = new GeometryBuffer(this.field3092);
            new GeometryBuffer(this.field3092);
            this.field3076 = (this.field3089.TextureCaps & 0x10000) != 0;
            this.field3542 = this.field3089.MaxSimultaneousTextures;
            this.field3540 = (this.field3089.TextureCaps & 0x800) != 0;
            this.field3603 = (this.field3089.TextureCaps & 0x2000) != 0;
            this.field3084 = (this.field3089.TextureCaps & 0x4000) != 0;
            this.field3074 = (this.field3089.TextureCaps & 0x2) == 0;
            this.field3608 = this.field3089.MaxActiveLights <= 0 ? 8 : this.field3089.MaxActiveLights;
            this.field3614 = this.field3574 > 0 || this.field3083.CheckDeviceMultiSampleType(this.field3070, this.field3079, this.field3071.BackBufferFormat, true, 2) == 0;
            this.field3072 = new int[this.field3542];
            this.field3090 = new boolean[this.field3542];
            this.field3087 = new class485[this.field3542];
            this.field3094 = new boolean[this.field3542];
            this.field3095 = new boolean[this.field3542];
            this.field3081 = new boolean[this.field3542];
            this.field3093.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method474(1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII[IZ)Ldh;")
    public final class320 method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6) {
        int var8 = 73 / ((arg1 - 50) / 55);
        return new class275(this, arg2, arg3, arg6, arg5, arg4, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "(I)F")
    public final float method1459(int arg0) {
        int var2 = 125 % ((arg0 + 8) / 54);
        return -0.5F;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILada;)V")
    public final void method1460(int arg0, int arg1, class161 arg2) {
        if (arg1 == 1) {
            class696 var4 = (class696) arg2;
            this.field3093.SetStreamSource(arg0, var4.field9586, 0, var4.method3921(arg1 - 1612));
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(B)V")
    public final void method1461(byte arg0) {
        for (int var2 = 0; var2 < this.field3542; var2++) {
            this.field3093.SetSamplerState(var2, 7, 0);
            this.field3093.SetSamplerState(var2, 6, 2);
            this.field3093.SetSamplerState(var2, 5, 2);
            this.field3093.SetSamplerState(var2, 1, 1);
            this.field3093.SetSamplerState(var2, 2, 1);
            this.field3087[var2] = class601.field8433;
            this.field3090[var2] = this.field3095[var2] = true;
            this.field3081[var2] = false;
            this.field3072[var2] = 0;
        }
        this.field3093.SetTextureStageState(0, 6, 1);
        this.field3093.SetRenderState(9, 2);
        this.field3093.SetRenderState(23, 4);
        this.field3093.SetRenderState(25, 5);
        this.field3093.SetRenderState(24, 0);
        this.field3093.SetRenderState(22, 2);
        this.field3093.SetRenderState(147, 1);
        this.field3093.SetRenderState(145, 1);
        this.field3093.method2890(38, 0.95F);
        this.field3093.SetRenderState(140, 3);
        this.field3069.SetType(3);
        this.field3078.SetType(3);
        this.field3091.SetType(1);
        this.field3085 = false;
        super.method1461(arg0);
    }

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "(B)V")
    public final void method1462(byte arg0) {
        if (arg0 != -57) {
            this.method1467((byte) -20, true);
        }
        this.field3069.SetAmbient(this.field3617 * this.field3597, this.field3604 * this.field3597, this.field3624 * this.field3597, 0.0F);
        this.field3085 = false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Ldw;")
    public final class717 method415(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ldw;Lgba;)Lgd;")
    public final class339 method467(class717 arg0, class666 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLlda;)I")
    private static final int method1463(byte arg0, class485 arg1) {
        if (class601.field8433 == arg1) {
            return 2;
        } else if (class497.field7145 == arg1) {
            return 1;
        } else {
            if (arg0 != -2) {
                method1476(null, 67);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "(B)V")
    public final void method1464(byte arg0) {
        this.method1445(false);
        if (arg0 != 55) {
            this.field3095 = null;
        }
        this.method1477(arg0 + 7);
    }

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "()V")
    public final void method412() {
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public final Object method1465(Canvas arg0, byte arg1) {
        int var3 = 85 % ((24 - arg1) / 54);
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lsj;B)Llb;")
    public final class542 method1466(class459[] arg0, byte arg1) {
        int var3 = -102 / ((20 - arg1) / 36);
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BZ)V")
    public final void method1467(byte arg0, boolean arg1) {
        this.field3093.method2889(161, arg1);
        if (arg0 != 115) {
            this.method377();
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1468(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 0) {
            method1457(16, null, -34, null, 46, -43);
        }
        this.field3096 = (class122) arg2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBILbda;I[B)Lpa;")
    public final class369 method1469(int arg0, byte arg1, int arg2, class505 arg3, int arg4, byte[] arg5) {
        if (arg1 >= -56) {
            this.field3087 = null;
        }
        return new class313(this, arg3, arg0, arg4, arg2, arg5);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final synchronized void method399(int arg0) {
        this.field3092.method3669(false);
        super.method399(arg0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "(I)V")
    public final void method1470(int arg0) {
        this.field3623 = (this.field3560 - this.field3619);
        this.field3598 = (float) (-this.field3591) + this.field3623;
        if (this.field3598 < (float) this.field3562) {
            this.field3598 = this.field3562;
        }
        if (arg0 != 5) {
            this.field3096 = null;
        }
        this.field3093.method2890(36, this.field3598);
        this.field3093.method2890(37, this.field3623);
        this.field3093.SetRenderState(34, this.field3627);
    }

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "(II)V")
    public final void method492(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjagdx/IDirect3DVertexShader;)V")
    public final void method1471(byte arg0, IDirect3DVertexShader arg1) {
        this.field3080 = arg1;
        this.field3093.SetVertexShader(arg1);
        this.method1433(13225);
        if (arg0 <= 62) {
            this.method478(null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "(I)V")
    public final void method1472(int arg0) {
        if (arg0 == -5617) {
            this.field3093.SetRenderState(60, this.field3547);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILbda;ILwt;)Ldh;")
    public final class320 method1473(int arg0, int arg1, class505 arg2, int arg3, class309 arg4) {
        if (arg3 != -20634) {
            this.field3079 = -75;
        }
        return new class275(this, arg2, arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "GA", descriptor = "(I)V")
    public final void method429(int arg0) {
        this.field3093.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "()Lcf;")
    public final class603 method451() {
        D3DADAPTER_IDENTIFIER var1 = this.field3083.method2879(this.field3070, 0);
        return new class603(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "(I)V")
    public final void method1474(int arg0) {
        if (arg0 != 13) {
            this.field3080 = null;
        }
        this.field3093.SetViewport(this.field3564, this.field3601, this.field3384, this.field3412, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILik;IILgfa;I)V")
    public final void method1475(int arg0, int arg1, class207 arg2, int arg3, int arg4, class749 arg5, int arg6) {
        this.field3093.SetIndices(((class330) arg5).field4587);
        if (arg3 != -17390) {
            this.method1459(36);
        }
        this.field3093.DrawIndexedPrimitive(method1454(2, arg2), 0, arg4, arg0, arg6, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method375(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class76 {
        this.method435(arg2, arg3);
    }

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "()I")
    public final int method382() {
        return 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lms;I)I")
    private static final int method1476(class758 arg0, int arg1) {
        int var2 = -53 % ((75 - arg1) / 46);
        if (class674.field9135 == arg0) {
            return 1;
        } else if (class184.field2497 == arg0) {
            return 2;
        } else if (class224.field3006 == arg0) {
            return 3;
        } else if (class178.field2389 == arg0) {
            return 4;
        } else if (class470.field6671 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "(I)V")
    public final void method1477(int arg0) {
        int var2 = 84 / ((arg0 + 18) / 43);
        if (this.field3085) {
            return;
        }
        this.field3093.LightEnable(0, false);
        this.field3093.LightEnable(1, false);
        this.field3093.SetLight(0, this.field3069);
        this.field3093.SetLight(1, this.field3078);
        this.field3093.LightEnable(0, true);
        this.field3093.LightEnable(1, true);
        this.field3085 = true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lht;I)V")
    public final void method1478(class581 arg0, int arg1) {
        if (arg1 != -1) {
            this.method1427(-91);
        }
        int var3 = 0;
        if (class277.field3919 == arg0) {
            var3 = 65536;
        } else if (class415.field5852 == arg0) {
            var3 = 131072;
        } else if (class254.field3721 == arg0) {
            var3 = 196608;
        }
        this.field3093.SetTextureStageState(this.field3561, 11, var3 | this.field3561);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Llb;I)V")
    public final void method1479(class542 arg0, int arg1) {
        if (arg1 == 16) {
            dxVertexLayout var3 = (dxVertexLayout) arg0;
            this.field3093.SetVertexDeclaration(var3.field4446);
        }
    }

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "(I)V")
    public final void method1480(int arg0) {
        this.field3093.method2889(28, this.field3581 && this.field3549 && this.field3591 >= 0);
        if (arg0 <= 56) {
            this.method1467((byte) -32, true);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILik;)V")
    public final void method1481(int arg0, int arg1, int arg2, class207 arg3) {
        this.field3093.DrawPrimitive(method1454(2, arg3), arg1, arg0);
        int var5 = 1 % ((41 - arg2) / 60);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lwt;Lbda;I)I")
    public static final int method1482(class309 arg0, class505 arg1, int arg2) {
        if (class309.field4305 == arg0) {
            if (class499.field7165 == arg1) {
                return 22;
            }
            if (class165.field2263 == arg1) {
                return 21;
            }
            if (class233.field3143 == arg1) {
                return 28;
            }
            if (class91.field1081 == arg1) {
                return 50;
            }
            if (class403.field5708 == arg1) {
                return 51;
            }
            if (class413.field5819 == arg1) {
                return 77;
            }
        }
        int var3 = -35 % ((-arg2 - 14) / 49);
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "()V")
    public final void method472() {
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[[IBZ)Lgw;")
    public final class168 method1483(int arg0, int[][] arg1, byte arg2, boolean arg3) {
        int var5 = 13 % ((-arg2 - 34) / 38);
        return new class637(this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILpc;)V")
    public final void method1484(int arg0, class669 arg1) {
        if (arg0 != 7) {
            return;
        }
        this.field3093.SetTexture(this.field3561, arg1.method1787(-4406));
        if (this.field3087[this.field3561] != arg1.field9088) {
            int var3 = method1463((byte) -2, arg1.field9088);
            this.field3093.SetSamplerState(this.field3561, 6, var3);
            this.field3093.SetSamplerState(this.field3561, 5, var3);
            this.field3087[this.field3561] = arg1.field9088;
            if (arg1.field9087 != this.field3081[this.field3561]) {
                this.field3093.SetSamplerState(this.field3561, 7, arg1.field9087 ? method1463((byte) -2, arg1.field9088) : 0);
                this.field3081[this.field3561] = arg1.field9087;
            }
        } else if (this.field3081[this.field3561] != arg1.field9087) {
            this.field3093.SetSamplerState(this.field3561, 7, arg1.field9087 ? method1463((byte) -2, arg1.field9088) : 0);
            this.field3081[this.field3561] = arg1.field9087;
        }
        if (!this.field3094[this.field3561]) {
            this.field3094[this.field3561] = true;
            this.method1455((byte) 95);
            this.method1436(arg0 + 26769);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BZ)Lgfa;")
    public final class749 method1485(byte arg0, boolean arg1) {
        return arg0 <= 20 ? (class749) null : new class330(this, class309.field4306, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "(I)Z")
    private final boolean method1486(int arg0) {
        int var2 = this.field3093.TestCooperativeLevel();
        if (arg0 <= 102) {
            this.method1442((byte) -53);
        }
        if (var2 == 0 || var2 == -2005530519) {
            class122 var3 = (class122) this.field3339;
            this.method1668((byte) -27);
            var3.method830(-59);
            this.field3071.BackBufferHeight = 0;
            this.field3071.BackBufferWidth = 0;
            if (method1457(this.field3574, this.field3083, 0, this.field3071, this.field3079, this.field3070)) {
                int var4 = this.field3093.Reset(this.field3071);
                if (class482.method2873(-116, var4)) {
                    var3.method831(this.field3093.method2882(), this.field3093.method2881(0), 0);
                    this.method1643(0);
                    this.method1461((byte) 39);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(Z)V")
    public final void method1487(boolean arg0) {
        if (arg0) {
            this.field3093.method2889(27, this.field3550);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILgf;)V")
    public final void method1488(int arg0, class275 arg1) {
        this.method1484(7, arg1);
        if (arg1.field3916 != this.field3090[this.field3561]) {
            this.field3093.SetSamplerState(this.field3561, 1, arg1.field3916 ? 1 : 3);
            this.field3090[this.field3561] = arg1.field3916;
        }
        if (arg0 != -21100) {
            this.method451();
        }
        if (arg1.field3914 != this.field3095[this.field3561]) {
            this.field3093.SetSamplerState(this.field3561, 2, arg1.field3914 ? 1 : 3);
            this.field3095[this.field3561] = arg1.field3914;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[BZLbda;BI)Ldh;")
    public final class320 method1489(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class505 arg5, byte arg6, int arg7) {
        if (arg6 != -77) {
            this.field3091 = null;
        }
        return new class275(this, arg5, arg0, arg2, arg4, arg3, arg1, arg7);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public final void method435(int arg0, int arg1) throws class76 {
        this.field3093.EndScene();
        if (this.field3096.method833(false)) {
            this.field3088 = 0;
            if (class482.method2874(this.field3096.method832(0, true), 0)) {
                this.method1486(111);
            }
        } else if ((++this.field3088) <= 50) {
            this.method1486(105);
        } else {
            throw new class76();
        }
        this.field3093.BeginScene();
    }
}
