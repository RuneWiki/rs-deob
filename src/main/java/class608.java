import jaclib.peer.class375;
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
import jagdx.class755;
import jagdx.class756;
import jagdx.class757;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class608 extends class223 {

    @OriginalMember(owner = "client!sga", name = "Mg", descriptor = "Z")
    private boolean field8557 = false;

    @OriginalMember(owner = "client!sga", name = "Wg", descriptor = "I")
    private int field8567 = 0;

    @OriginalMember(owner = "client!sga", name = "Rg", descriptor = "Leja;")
    private class431 field8562;

    @OriginalMember(owner = "client!sga", name = "Kg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8555;

    @OriginalMember(owner = "client!sga", name = "kh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8581;

    @OriginalMember(owner = "client!sga", name = "Qg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8561;

    @OriginalMember(owner = "client!sga", name = "Og", descriptor = "I")
    private int field8559;

    @OriginalMember(owner = "client!sga", name = "Tg", descriptor = "Ljaclib/peer/dba;")
    public class375 field8564;

    @OriginalMember(owner = "client!sga", name = "gh", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8577;

    @OriginalMember(owner = "client!sga", name = "ah", descriptor = "I")
    private int field8571;

    @OriginalMember(owner = "client!sga", name = "Lg", descriptor = "Ljagdx/D3DLIGHT;")
    private class755 field8556;

    @OriginalMember(owner = "client!sga", name = "hh", descriptor = "Ljagdx/D3DLIGHT;")
    private class755 field8578;

    @OriginalMember(owner = "client!sga", name = "bh", descriptor = "Ljagdx/D3DLIGHT;")
    private class755 field8572;

    @OriginalMember(owner = "client!sga", name = "ih", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8579;

    @OriginalMember(owner = "client!sga", name = "Pg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8560;

    @OriginalMember(owner = "client!sga", name = "Yg", descriptor = "Z")
    public boolean field8569;

    @OriginalMember(owner = "client!sga", name = "Xg", descriptor = "Z")
    public boolean field8568;

    @OriginalMember(owner = "client!sga", name = "ch", descriptor = "Z")
    public boolean field8573;

    @OriginalMember(owner = "client!sga", name = "Zg", descriptor = "[Z")
    private boolean[] field8570;

    @OriginalMember(owner = "client!sga", name = "jh", descriptor = "[Z")
    private boolean[] field8580;

    @OriginalMember(owner = "client!sga", name = "Ng", descriptor = "[Z")
    private boolean[] field8558;

    @OriginalMember(owner = "client!sga", name = "lh", descriptor = "[I")
    private int[] field8582;

    @OriginalMember(owner = "client!sga", name = "fh", descriptor = "[Lcw;")
    private class144[] field8576;

    @OriginalMember(owner = "client!sga", name = "Vg", descriptor = "[Z")
    private boolean[] field8566;

    @OriginalMember(owner = "client!sga", name = "Ug", descriptor = "[F")
    private static float[] field8565 = new float[16];

    @OriginalMember(owner = "client!sga", name = "Sg", descriptor = "[I")
    private static int[] field8563 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!sga", name = "dh", descriptor = "[I")
    private static int[] field8574 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!sga", name = "eh", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8575;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lpb;ZLoea;)I")
    public static final int method3516(class2 arg0, boolean arg1, class612 arg2) {
        if (arg1) {
            return 14;
        }
        if (class612.field8616 == arg2) {
            if (class661.field9302 == arg0) {
                return 22;
            }
            if (class75.field837 == arg0) {
                return 21;
            }
            if (class29.field238 == arg0) {
                return 28;
            }
            if (class581.field8219 == arg0) {
                return 50;
            }
            if (class406.field5718 == arg0) {
                return 51;
            }
            if (class777.field10689 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!sga", name = "u", descriptor = "()V")
    public final void method205() {
        this.field8564.method2329(false);
        super.method205();
    }

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(Z)V")
    public final void method1384(boolean arg0) {
        this.field8555.method4183(174, this.field3406);
        if (arg0) {
            this.method1448(-80, 50, true, 91, 103, -2, null, null);
        }
    }

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "(B)V")
    public final void method1504(byte arg0) {
        this.field8556.SetAmbient(this.field3359 * this.field3305, this.field3359 * this.field3323, this.field3375 * this.field3359, 0.0F);
        this.field8557 = false;
        if (arg0 != 48) {
            this.field8567 = -41;
        }
    }

    @OriginalMember(owner = "client!sga", name = "A", descriptor = "(I)V")
    public final void method1426(int arg0) {
        int var2 = this.field8580[this.field3289] ? method3520(this.field3366[this.field3289], (byte) -123) : 1;
        this.field8555.SetTextureStageState(this.field3289, 4, var2);
        if (arg0 != 8) {
            this.method1476((byte) 2);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILdaa;II)V")
    public final void method1403(int arg0, class453 arg1, int arg2, int arg3) {
        if (arg0 < 125) {
            method3516(null, true, null);
        }
        this.field8555.DrawPrimitive(method3525((byte) -128, arg1), arg2, arg3);
    }

    @OriginalMember(owner = "client!sga", name = "Q", descriptor = "(I)V")
    public final void method1461(int arg0) {
        if (class327.field4593 == this.field3306) {
            this.field8555.SetRenderState(19, 5);
            this.field8555.SetRenderState(20, 6);
        } else if (class329.field4618 == this.field3306) {
            this.field8555.SetRenderState(19, 2);
            this.field8555.SetRenderState(20, 2);
        } else if (class467.field6491 == this.field3306) {
            this.field8555.SetRenderState(19, 9);
            this.field8555.SetRenderState(20, 2);
        }
        if (arg0 >= -83) {
            field8574 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIII)V")
    public final void method197(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIZIII[FLpb;)Lbw;")
    public final class28 method1448(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, float[] arg6, class2 arg7) {
        if (arg4 != 0) {
            this.method1491(null, 26, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "ya", descriptor = "()V")
    public final void method226() {
        this.method1479(true, 7);
        this.field8555.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "(B)V")
    public final void method1476(byte arg0) {
        for (int var2 = 0; var2 < this.field3361; var2++) {
            this.field8555.SetSamplerState(var2, 7, 0);
            this.field8555.SetSamplerState(var2, 6, 2);
            this.field8555.SetSamplerState(var2, 5, 2);
            this.field8555.SetSamplerState(var2, 1, 1);
            this.field8555.SetSamplerState(var2, 2, 1);
            this.field8576[var2] = class109.field1320;
            this.field8570[var2] = this.field8566[var2] = true;
            this.field8558[var2] = false;
            this.field8582[var2] = 0;
        }
        int var3 = 3 / ((arg0 - 37) / 63);
        this.field8555.SetTextureStageState(0, 6, 1);
        this.field8555.SetRenderState(9, 2);
        this.field8555.SetRenderState(23, 4);
        this.field8555.SetRenderState(25, 5);
        this.field8555.SetRenderState(24, 0);
        this.field8555.SetRenderState(22, 2);
        this.field8555.SetRenderState(147, 1);
        this.field8555.SetRenderState(145, 1);
        this.field8555.method4182(38, 0.95F);
        this.field8555.SetRenderState(140, 3);
        this.field8556.SetType(3);
        this.field8578.SetType(3);
        this.field8572.SetType(1);
        this.field8557 = false;
        super.method1476((byte) -66);
    }

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "(Z)V")
    public final void method1419(boolean arg0) {
        if (arg0) {
            this.field8568 = false;
        }
        this.field8555.method4183(28, this.field3340 && this.field3351 && this.field3377 >= 0);
    }

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "()Z")
    public final boolean method147() {
        return false;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZZ)Lfw;")
    public final class716 method1421(boolean arg0, boolean arg1) {
        return arg1 ? new class600(this, arg0) : (class716) null;
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/dba;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Leja;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lae;I)V")
    private class608(int arg0, int arg1, Canvas arg2, class375 arg3, IDirect3D arg4, IDirect3DDevice arg5, class431 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class101 arg9, class283 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field8562 = arg6;
            this.field8555 = arg5;
            this.field8581 = arg4;
            this.field8561 = arg8;
            this.field8559 = arg1;
            this.field8564 = arg3;
            this.field8577 = arg7;
            this.field8571 = arg0;
            this.field8556 = new class755(this.field8564);
            this.field8578 = new class755(this.field8564);
            this.field8572 = new class755(this.field8564);
            this.field8579 = new PixelBuffer(this.field8564);
            this.field8560 = new GeometryBuffer(this.field8564);
            new GeometryBuffer(this.field8564);
            this.field8569 = (this.field8561.TextureCaps & 0x10000) != 0;
            this.field3356 = (this.field8561.TextureCaps & 0x800) != 0;
            this.field3363 = (this.field8561.TextureCaps & 0x2000) != 0;
            this.field3341 = this.field8561.MaxActiveLights > 0 ? this.field8561.MaxActiveLights : 8;
            this.field3361 = this.field8561.MaxSimultaneousTextures;
            this.field8568 = (this.field8561.TextureCaps & 0x2) == 0;
            this.field8573 = (this.field8561.TextureCaps & 0x4000) != 0;
            this.field3313 = this.field3342 > 0 || this.field8581.CheckDeviceMultiSampleType(this.field8571, this.field8559, this.field8577.BackBufferFormat, true, 2) == 0;
            this.field8570 = new boolean[this.field3361];
            this.field8580 = new boolean[this.field3361];
            this.field8558 = new boolean[this.field3361];
            this.field8582 = new int[this.field3361];
            this.field8576 = new class144[this.field3361];
            this.field8566 = new boolean[this.field3361];
            this.field8555.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method2821((byte) 127);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sga", name = "v", descriptor = "(I)V")
    public final void method1411(int arg0) {
        if (this.field8575 == null && this.field3332[this.field3289] != class467.field6494) {
            if (this.field3332[this.field3289] == class304.field4414) {
                this.field8555.SetTransform(this.field3289 + 16, this.field3330[this.field3289].method3091(field8565, (byte) 85));
            } else {
                this.field8555.SetTransform(this.field3289 + 16, this.field3330[this.field3289].method3093(false, field8565));
            }
            int var2 = method3527(this.field3332[this.field3289], -81);
            if (this.field8582[this.field3289] != var2) {
                this.field8555.SetTextureStageState(this.field3289, 24, var2);
                this.field8582[this.field3289] = var2;
            }
        } else {
            this.field8555.SetTextureStageState(this.field3289, 24, 0);
            this.field8582[this.field3289] = 0;
        }
        if (arg0 <= 88) {
            this.method3524(null, true);
        }
    }

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "(B)V")
    public final void method1451(byte arg0) {
        this.field8555.method4183(27, this.field3362);
        if (arg0 > -23) {
            this.method226();
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZIZLvq;Z)V")
    public final void method1469(boolean arg0, int arg1, boolean arg2, class500 arg3, boolean arg4) {
        int var6 = 0;
        if (arg2) {
            this.method210();
        }
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg4) {
            var6 |= 0x20;
        }
        if (arg0) {
            var6 |= 0x10;
        }
        this.field8555.SetTextureStageState(this.field3289, var8, method3517(arg3, -83) | var6);
    }

    @OriginalMember(owner = "client!sga", name = "F", descriptor = "(II)V")
    public final void method146(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(BI)V")
    public final void method1417(byte arg0, int arg1) {
        this.field8555.SetTextureStageState(this.field3289, 11, arg1);
        if (arg0 > -53) {
            this.method1389(-56, true);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lvq;I)I")
    private static final int method3517(class500 arg0, int arg1) {
        if (arg1 >= -46) {
            field8565 = null;
        }
        if (class157.field2039 == arg0) {
            return 2;
        } else if (class656.field9260 == arg0) {
            return 0;
        } else if (class224.field3416 == arg0) {
            return 1;
        } else if (class41.field423 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjagdx/IDirect3DVertexShader;)V")
    public final void method3518(int arg0, IDirect3DVertexShader arg1) {
        this.field8575 = arg1;
        this.field8555.SetVertexShader(arg1);
        if (arg0 != 0) {
            field8574 = null;
        }
        this.method1411(103);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLfw;I)V")
    public final void method1386(byte arg0, class716 arg1, int arg2) {
        class600 var4 = (class600) arg1;
        this.field8555.SetStreamSource(arg2, var4.field8401, 0, var4.method3476(99));
        if (arg0 > -106) {
            this.method1464(false);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method254(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class357 {
        this.method157(arg2, arg3);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjagdx/D3DPRESENT_PARAMETERS;BILjagdx/IDirect3D;I)Z")
    private static final boolean method3519(int arg0, D3DPRESENT_PARAMETERS arg1, byte arg2, int arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (arg2 != 116) {
            field8574 = null;
        }
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class757.method4191(arg4.method4169(arg3, var9), (byte) 84)) {
                return false;
            }
            label79: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field8574.length; var10++) {
                        if (arg4.CheckDeviceType(arg3, arg5, var9.Format, field8574[var10], true) == 0 && arg4.CheckDeviceFormat(arg3, arg5, var9.Format, 1, 1, field8574[var10]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg5, field8574[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field8563.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg3, arg5, var9.Format, 2, 1, field8563[var11]) == 0 && arg4.CheckDepthStencilMatch(arg3, arg5, var9.Format, field8574[var10], field8563[var11]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg5, field8563[var10], true, var8) == 0)) {
                                    var7 = field8574[var10];
                                    var6 = field8563[var11];
                                    break label79;
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
            arg1.MultiSampleType = var8;
            arg1.MultiSampleQuality = 0;
            arg1.AutoDepthStencilFormat = var6;
            arg1.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "(Z)V")
    public final void method1481(boolean arg0) {
        if (this.field8580[this.field3289]) {
            this.field8580[this.field3289] = false;
            this.field8555.SetTexture(this.field3289, null);
            this.method1426(8);
            this.method1445((byte) 45);
        }
        if (!arg0) {
            this.method1403(-121, null, 124, 88);
        }
    }

    @OriginalMember(owner = "client!sga", name = "w", descriptor = "(I)V")
    public final void method1415(int arg0) {
        if (arg0 < 74) {
            this.field8559 = -75;
        }
        this.field8555.method4183(137, this.field3311 && !this.field3300);
    }

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "(I)V")
    public final void method1392(int arg0) {
        if (arg0 != 23312) {
            this.method210();
        }
        this.field8555.method4183(14, this.field3337 && this.field3327);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZLvq;IZ)V")
    public final void method1425(boolean arg0, class500 arg1, int arg2, boolean arg3) {
        int var5 = 0;
        byte var7;
        if (arg2 == 1) {
            var7 = 6;
        } else if (arg2 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (!arg3) {
            this.field8564 = null;
        }
        if (arg0) {
            var5 |= 0x10;
        }
        this.field8555.SetTextureStageState(this.field3289, var7, var5 | method3517(arg1, -125));
    }

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "(B)V")
    public final void method1420(byte arg0) {
        this.field3291 = (this.field3380 - this.field3328);
        this.field3296 = (float) (-this.field3377) + this.field3291;
        if (this.field3296 < (float) this.field3322) {
            this.field3296 = this.field3322;
        }
        this.field8555.method4182(36, this.field3296);
        if (arg0 > -54) {
            this.field8564 = null;
        }
        this.field8555.method4182(37, this.field3291);
        this.field8555.SetRenderState(34, this.field3334);
    }

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "()V")
    public final void method210() {
        IDirect3DEventQuery var1 = this.field8555.method4189();
        if (class757.method4192(var1.Issue(), (byte) 116)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2320(-5017);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILpb;[BIII)Lat;")
    public final class162 method1432(int arg0, class2 arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -13836) {
            this.field8576 = null;
        }
        return new class191(this, arg1, arg5, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lok;Lok;FLok;)Lok;")
    public final class255 method209(class255 arg0, class255 arg1, float arg2, class255 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "()V")
    public final void method167() {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lsi;B)I")
    private static final int method3520(class769 arg0, byte arg1) {
        int var2 = -79 % ((-arg1 - 54) / 49);
        if (class92.field1073 == arg0) {
            return 2;
        } else if (class785.field10763 == arg0) {
            return 4;
        } else if (class495.field6817 == arg0) {
            return 26;
        } else if (class587.field8280 == arg0) {
            return 7;
        } else if (class202.field2835 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "()V")
    public final void method250() {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BZ)V")
    public final void method1441(byte arg0, boolean arg1) {
        if (arg0 < -20) {
            this.field8555.method4183(161, arg1);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method1435(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 1 || this.field3161 != arg2) {
            return;
        }
        Dimension var4 = arg2.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field8555.EndScene();
            this.method3521((byte) -121);
            this.field8555.BeginScene();
        }
    }

    @OriginalMember(owner = "client!sga", name = "B", descriptor = "(I)V")
    public final void method1427(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field3344; var2++) {
            class251 var3 = this.field3352[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1684(arg0 - 4);
            float var6 = var3.method1688(45) / 255.0F;
            this.field8572.SetPosition((float) var3.method1683(10918), (float) var3.method1687(arg0 ^ 0x455), (float) var3.method1686(false));
            this.field8572.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFF01) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8572.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1685(arg0 - 123) * var3.method1685(97)));
            this.field8572.SetRange((float) var3.method1685(-77));
            this.field8555.SetLight(var4, this.field8572);
            this.field8555.LightEnable(var4, true);
        }
        while (this.field3383 > var2) {
            this.field8555.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1427(arg0);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B[Lim;)Lbfa;")
    public final class262 method1406(byte arg0, class435[] arg1) {
        if (arg0 != 6) {
            this.field8582 = null;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!sga", name = "gb", descriptor = "(I)V")
    public final void method1508(int arg0) {
        this.method1484(0);
        int var2 = 126 % ((12 - arg0) / 55);
        this.method1462(52);
    }

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "(Z)V")
    public final void method1489(boolean arg0) {
        if (this.field3275) {
            field8565[0] = 1.0F;
            field8565[4] = 0.0F;
            field8565[10] = 1.0F;
            field8565[1] = 0.0F;
            field8565[9] = 0.0F;
            field8565[3] = 0.0F;
            field8565[6] = 0.0F;
            field8565[15] = 1.0F;
            field8565[7] = 0.0F;
            field8565[5] = 1.0F;
            field8565[13] = 0.0F;
            field8565[8] = 0.0F;
            field8565[12] = 0.0F;
            field8565[11] = 0.0F;
            field8565[14] = 0.0F;
            field8565[2] = 0.0F;
        } else {
            this.field3271.method3093(arg0, field8565);
        }
        this.field8555.SetTransform(256, field8565);
        if (arg0) {
            this.field8568 = false;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method1436(byte arg0, Canvas arg1) {
        if (arg0 != -65) {
            this.method1431(null, null, (byte) 95);
        }
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lbfa;I)V")
    public final void method1485(class262 arg0, int arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        if (arg1 == 32) {
            this.field8555.SetVertexDeclaration(var3.field10550);
        }
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)V")
    public final synchronized void method232(int arg0) {
        this.field8564.method2328(true);
        super.method232(arg0);
    }

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "(B)F")
    public final float method1474(byte arg0) {
        if (arg0 != -114) {
            this.field8572 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(II)Lrca;")
    public final class36 method246(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)Lpm;")
    public final class614 method1389(int arg0, boolean arg1) {
        if (arg0 != 9) {
            method3517(null, 117);
        }
        return new class228(this, class612.field8617, arg1);
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(II)V")
    public final void method157(int arg0, int arg1) throws class357 {
        this.field8555.EndScene();
        if (this.field8562.method2582(13993)) {
            this.field8567 = 0;
            if (class757.method4191(this.field8562.method2583(-125, 0), (byte) 84)) {
                this.method3521((byte) -121);
            }
        } else if ((++this.field8567) <= 50) {
            this.method3521((byte) -121);
        } else {
            throw new class357();
        }
        this.field8555.BeginScene();
    }

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "(Z)V")
    public final void method1412(boolean arg0) {
        this.field8555.SetScissorRect(this.field3374 + this.field3295, this.field3320 + this.field3315, this.field3339, this.field3371);
        if (arg0) {
            this.field8575 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "(B)Z")
    private final boolean method3521(byte arg0) {
        if (arg0 != -121) {
            this.field8571 = -110;
        }
        int var2 = this.field8555.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class431 var3 = (class431) this.field3116;
            this.method1416(true);
            var3.method2585(arg0 ^ 0x1);
            this.field8577.BackBufferWidth = 0;
            this.field8577.BackBufferHeight = 0;
            if (method3519(this.field3342, this.field8577, (byte) 116, this.field8571, this.field8581, this.field8559)) {
                int var4 = this.field8555.Reset(this.field8577);
                if (class757.method4192(var4, (byte) -70)) {
                    var3.method2584(this.field8555.method4186(), (byte) -66, this.field8555.method4175(0));
                    this.method1443(0);
                    this.method1476((byte) 106);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sga", name = "W", descriptor = "(I)V")
    public final void method1482(int arg0) {
        if (this.field3354.method2443((byte) -65)) {
            this.field3280.method3093(false, field8565);
        } else {
            field8565[14] = 0.0F;
            field8565[5] = 1.0F;
            field8565[10] = 1.0F;
            field8565[15] = 1.0F;
            field8565[13] = 0.0F;
            field8565[0] = 1.0F;
            field8565[1] = 0.0F;
            field8565[6] = 0.0F;
            field8565[8] = 0.0F;
            field8565[3] = 0.0F;
            field8565[11] = 0.0F;
            field8565[12] = 0.0F;
            field8565[7] = 0.0F;
            field8565[4] = 0.0F;
            field8565[2] = 0.0F;
            field8565[9] = 0.0F;
        }
        this.field8555.SetTransform(2, field8565);
        if (arg0 >= -105) {
            this.method1508(57);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lmia;)V")
    public final void method229(class684 arg0) {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BILdaa;Lpm;III)V")
    public final void method1430(byte arg0, int arg1, class453 arg2, class614 arg3, int arg4, int arg5, int arg6) {
        this.field8555.SetIndices(((class228) arg3).field3450);
        this.field8555.DrawIndexedPrimitive(method3525((byte) -127, arg2), 0, arg5, arg6, arg1, arg4);
        if (arg0 > -52) {
            method3525((byte) 49, null);
        }
    }

    @OriginalMember(owner = "client!sga", name = "Y", descriptor = "(I)V")
    public final void method1484(int arg0) {
        float var2 = this.field3301 ? this.field3358 : 0.0F;
        float var3 = this.field3301 ? -this.field3309 : 0.0F;
        this.field8556.SetDiffuse(this.field3305 * var2, this.field3323 * var2, this.field3375 * var2, (float) arg0);
        this.field8578.SetDiffuse(this.field3305 * var3, this.field3323 * var3, this.field3375 * var3, 0.0F);
        this.field8557 = false;
    }

    @OriginalMember(owner = "client!sga", name = "w", descriptor = "()Z")
    public final boolean method199() {
        return false;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(FFF)V")
    public final void method186(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!sga", name = "V", descriptor = "(I)V")
    public final void method1478(int arg0) {
        this.field8555.SetViewport(this.field3295, this.field3320, this.field3232, this.field3201, (float) arg0, 1.0F);
    }

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "(Z)V")
    public final void method1464(boolean arg0) {
        this.field8555.SetTransform(3, this.field3319);
        if (!arg0) {
            field8565 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "(B)V")
    public final void method1445(byte arg0) {
        int var2 = this.field8580[this.field3289] ? method3520(this.field3302[this.field3289], (byte) -114) : 1;
        if (arg0 <= 39) {
            this.field8561 = null;
        }
        this.field8555.SetTextureStageState(this.field3289, 1, var2);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lcw;B)I")
    private static final int method3522(class144 arg0, byte arg1) {
        if (arg1 > -110) {
            method3520(null, (byte) -31);
        }
        if (class109.field1320 == arg0) {
            return 2;
        } else if (class22.field199 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sga", name = "E", descriptor = "(I)V")
    public final void method1437(int arg0) {
        if (arg0 == 12093) {
            this.field8556.SetDirection(-this.field3314[0], -this.field3314[1], -this.field3314[2]);
            this.field8578.SetDirection(-this.field3382[0], -this.field3382[1], -this.field3382[2]);
            this.field8557 = false;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([BLpb;ZIIIZI)Lbw;")
    public final class28 method1483(byte[] arg0, class2 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg6) {
            this.method1459(-125);
        }
        return new class42(this, arg1, arg3, arg5, arg2, arg0, arg4, arg7);
    }

    @OriginalMember(owner = "client!sga", name = "GA", descriptor = "(I)V")
    public final void method230(int arg0) {
        this.field8555.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!sga", name = "R", descriptor = "(I)V")
    public final void method1462(int arg0) {
        if (!this.field8557) {
            this.field8555.LightEnable(0, false);
            this.field8555.LightEnable(1, false);
            this.field8555.SetLight(0, this.field8556);
            this.field8555.SetLight(1, this.field8578);
            this.field8555.LightEnable(0, true);
            this.field8555.LightEnable(1, true);
            this.field8557 = true;
        }
        if (arg0 < 39) {
            this.field8573 = true;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZLan;)V")
    public final void method3523(boolean arg0, class191 arg1) {
        this.method3524(arg1, false);
        if (!arg0) {
            this.field8577 = null;
        }
        if (!this.field8570[this.field3289]) {
            this.field8555.SetSamplerState(this.field3289, 1, 1);
            this.field8570[this.field3289] = true;
        }
        if (!this.field8566[this.field3289]) {
            this.field8555.SetSamplerState(this.field3289, 2, 1);
            this.field8566[this.field3289] = true;
        }
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(IIIID)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lrh;B)V")
    public final void method1434(class718 arg0, byte arg1) {
        int var3 = 0;
        if (arg1 != 71) {
            return;
        }
        if (class444.field6143 == arg0) {
            var3 = 65536;
        } else if (class748.field10326 == arg0) {
            var3 = 131072;
        } else if (class543.field7565 == arg0) {
            var3 = 196608;
        }
        this.field8555.SetTextureStageState(this.field3289, 11, var3 | this.field3289);
    }

    @OriginalMember(owner = "client!sga", name = "na", descriptor = "(IIII)[I")
    public final int[] method243(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8555.method4177(0);
        IDirect3DSurface var7 = this.field8555.method4176(arg2, arg3, 21, 0, 0, true);
        if (class757.method4192(this.field8555.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), (byte) 124) && class757.method4192(var7.LockRect(0, 0, arg2, arg3, 16, this.field8579), (byte) 104)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8579.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field8579.method4165(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8579.method4165(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2320(-5017);
        var7.method2320(-5017);
        return var5;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lpb;ILoea;BI)Lbw;")
    public final class28 method1495(class2 arg0, int arg1, class612 arg2, byte arg3, int arg4) {
        if (arg3 <= 94) {
            this.method1461(-59);
        }
        return new class42(this, arg0, arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ldha;Z)V")
    public final void method3524(class366 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        this.field8555.SetTexture(this.field3289, arg0.method334(-79));
        if (this.field8576[this.field3289] != arg0.field5265) {
            int var3 = method3522(arg0.field5265, (byte) -128);
            this.field8555.SetSamplerState(this.field3289, 6, var3);
            this.field8555.SetSamplerState(this.field3289, 5, var3);
            this.field8576[this.field3289] = arg0.field5265;
            if (this.field8558[this.field3289] != arg0.field5268) {
                this.field8555.SetSamplerState(this.field3289, 7, arg0.field5268 ? method3522(arg0.field5265, (byte) -126) : 0);
                this.field8558[this.field3289] = arg0.field5268;
            }
        } else if (this.field8558[this.field3289] != arg0.field5268) {
            this.field8555.SetSamplerState(this.field3289, 7, arg0.field5268 ? method3522(arg0.field5265, (byte) -125) : 0);
            this.field8558[this.field3289] = arg0.field5268;
        }
        if (!this.field8580[this.field3289]) {
            this.field8580[this.field3289] = true;
            this.method1426(8);
            this.method1445((byte) 126);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Loea;ILpb;)Z")
    public final boolean method1491(class612 arg0, int arg1, class2 arg2) {
        if (arg1 != 1) {
            this.method209(null, null, 1.9043853F, null);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class757.method4192(this.field8581.method4169(this.field8571, var4), (byte) -102) && class757.method4192(this.field8581.CheckDeviceFormat(this.field8571, this.field8559, var4.Format, 0, 3, method3516(arg2, false, arg0)), (byte) -56);
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "(I)V")
    public final void method1424(int arg0) {
        if (arg0 == 6048) {
            this.field8555.method4183(7, this.field3345);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLdaa;)I")
    private static final int method3525(byte arg0, class453 arg1) {
        if (class219.field2999 == arg1) {
            return 2;
        } else if (class657.field9269 == arg1) {
            return 3;
        } else if (class401.field5669 == arg1) {
            return 1;
        } else if (class625.field8750 == arg1) {
            return 4;
        } else if (class224.field3417 == arg1) {
            return 6;
        } else if (class521.field7169 == arg1) {
            return 5;
        } else {
            if (arg0 > -126) {
                field8565 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZIB[[I)Lfp;")
    public final class596 method1385(boolean arg0, int arg1, byte arg2, int[][] arg3) {
        int var5 = -54 / ((26 - arg2) / 34);
        return new class503(this, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;I)V")
    public final void method3526(IDirect3DPixelShader arg0, int arg1) {
        this.field8555.SetPixelShader(arg0);
        if (arg1 >= -31) {
            this.field8573 = false;
        }
    }

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "(I)V")
    public final void method1394(int arg0) {
        if (arg0 < -39) {
            this.field8555.method4183(15, this.field3368);
        }
    }

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "(Z)V")
    public final void method1413(boolean arg0) {
        this.field8555.SetRenderState(60, this.field3357);
        if (arg0) {
            this.method3528(67, null);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)Lcn;")
    public final class621 method236(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public final void method1497(Object arg0, Canvas arg1, boolean arg2) {
        if (arg2) {
            this.field8566 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "O", descriptor = "(I)V")
    public final void method1459(int arg0) {
        if (arg0 != 64) {
            field8574 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lcn;Lrca;)Lmia;")
    public final class684 method247(class621 arg0, class36 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V")
    public final void method203(boolean arg0) {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIZIII[I)Lbw;")
    public final class28 method1507(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg5 != 0) {
            this.field8580 = null;
        }
        return new class42(this, arg0, arg1, arg2, arg6, arg4, arg3);
    }

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "()V")
    public final void method145() {
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public final void method1431(Object arg0, Canvas arg1, byte arg2) {
        if (arg2 >= -87) {
            this.method209(null, null, -0.98530686F, null);
        }
        this.field8562 = (class431) arg0;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(IB)Lqs;")
    public final class741 method1378(int arg0, byte arg1) {
        if (arg1 <= 7) {
            return (class741) null;
        } else if (arg0 == 3) {
            return new class299(this, this.field3112);
        } else if (arg0 == 4) {
            return new class415(this, this.field3112, this.field3100);
        } else if (arg0 == 8) {
            return new class51(this, this.field3112, this.field3100);
        } else {
            return super.method1378(arg0, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!sga", name = "I", descriptor = "()I")
    public final int method136() {
        return 0;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "()Lrb;")
    public final class260 method172() {
        D3DADAPTER_IDENTIFIER var1 = this.field8581.method4170(this.field8571, 0);
        return new class260(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Loja;I)I")
    private static final int method3527(class124 arg0, int arg1) {
        if (class566.field7986 == arg0) {
            return 1;
        } else if (class304.field4414 == arg0) {
            return 2;
        } else if (class347.field5057 == arg0) {
            return 3;
        } else if (class447.field6263 == arg0) {
            return 4;
        } else if (class734.field10121 == arg0) {
            return 256;
        } else {
            int var2 = 83 / ((3 - arg1) / 59);
            return 0;
        }
    }

    @OriginalMember(owner = "client!sga", name = "v", descriptor = "()V")
    public final void method227() {
    }

    @OriginalMember(owner = "client!sga", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lae;Ljava/lang/Integer;)Lha;")
    public static final class473 createToolkit(Canvas arg0, class101 arg1, class283 arg2, Integer arg3) {
        class608 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class375 var7 = new class375();
            IDirect3D var8 = IDirect3D.method4171(-2147483616, var7);
            D3DCAPS var9 = var8.method4172(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3519(arg3, var10, (byte) 116, var5, var8, var6)) {
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
                    var13 = var8.method4168(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class756 var17) {
                    var13 = var8.method4168(var5, var6, arg0, var11 | 0x20, var10);
                }
                class431 var15 = new class431(var13.method4175(0), var13.method4186());
                var4 = new class608(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1383(35);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method205();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILwca;)V")
    public final void method3528(int arg0, class42 arg1) {
        this.method3524(arg1, false);
        if (this.field8570[this.field3289] != arg1.field428) {
            this.field8555.SetSamplerState(this.field3289, 1, arg1.field428 ? 1 : 3);
            this.field8570[this.field3289] = arg1.field428;
        }
        if (arg1.field432 != this.field8566[this.field3289]) {
            this.field8555.SetSamplerState(this.field3289, 2, arg1.field432 ? 1 : 3);
            this.field8566[this.field3289] = arg1.field432;
        }
        if (arg0 != 2808) {
            this.field8558 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Loea;Lpb;B)Z")
    public final boolean method1442(class612 arg0, class2 arg1, byte arg2) {
        if (arg2 < 63) {
            this.field8560 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class757.method4192(this.field8581.method4169(this.field8571, var4), (byte) -49) && class757.method4192(this.field8581.CheckDeviceFormat(this.field8571, this.field8559, var4.Format, 0, 4, method3516(arg1, false, arg0)), (byte) -127);
    }
}
