import jaclib.peer.class421;
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
import jagdx.class735;
import jagdx.class736;
import jagdx.class737;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class173 extends class38 {

    @OriginalMember(owner = "client!ad", name = "Rg", descriptor = "Z")
    private boolean field2432 = false;

    @OriginalMember(owner = "client!ad", name = "Fg", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!ad", name = "Zg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field2440;

    @OriginalMember(owner = "client!ad", name = "Eg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field2419;

    @OriginalMember(owner = "client!ad", name = "Dg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field2418;

    @OriginalMember(owner = "client!ad", name = "bh", descriptor = "Ljaclib/peer/ep;")
    public class421 field2442;

    @OriginalMember(owner = "client!ad", name = "ah", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!ad", name = "Jg", descriptor = "Lvda;")
    private class8 field2424;

    @OriginalMember(owner = "client!ad", name = "Kg", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!ad", name = "ch", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field2443;

    @OriginalMember(owner = "client!ad", name = "Lg", descriptor = "Ljagdx/D3DLIGHT;")
    private class737 field2426;

    @OriginalMember(owner = "client!ad", name = "Sg", descriptor = "Ljagdx/D3DLIGHT;")
    private class737 field2433;

    @OriginalMember(owner = "client!ad", name = "Ug", descriptor = "Ljagdx/D3DLIGHT;")
    private class737 field2435;

    @OriginalMember(owner = "client!ad", name = "Ng", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field2428;

    @OriginalMember(owner = "client!ad", name = "Ig", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field2423;

    @OriginalMember(owner = "client!ad", name = "Qg", descriptor = "Z")
    public boolean field2431;

    @OriginalMember(owner = "client!ad", name = "Vg", descriptor = "Z")
    public boolean field2436;

    @OriginalMember(owner = "client!ad", name = "Hg", descriptor = "Z")
    public boolean field2422;

    @OriginalMember(owner = "client!ad", name = "Gg", descriptor = "[Z")
    private boolean[] field2421;

    @OriginalMember(owner = "client!ad", name = "dh", descriptor = "[Z")
    private boolean[] field2444;

    @OriginalMember(owner = "client!ad", name = "eh", descriptor = "[I")
    private int[] field2445;

    @OriginalMember(owner = "client!ad", name = "Tg", descriptor = "[Z")
    private boolean[] field2434;

    @OriginalMember(owner = "client!ad", name = "Xg", descriptor = "[Lui;")
    private class308[] field2438;

    @OriginalMember(owner = "client!ad", name = "Yg", descriptor = "[Z")
    private boolean[] field2439;

    @OriginalMember(owner = "client!ad", name = "Og", descriptor = "[I")
    private static int[] field2429 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ad", name = "Wg", descriptor = "[I")
    private static int[] field2437 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ad", name = "Pg", descriptor = "[F")
    private static float[] field2430 = new float[16];

    @OriginalMember(owner = "client!ad", name = "Mg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2427;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 4)
    public final void method392(Canvas arg0, int arg1, Object arg2) {
        if (arg1 != -32355) {
            this.field2445 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "(I)V", line = 13)
    public final void method409(int arg0) {
        if (this.field2421[this.field613]) {
            this.field2421[this.field613] = false;
            this.field2418.SetTexture(this.field613, null);
            this.method286(119);
            this.method273((byte) -100);
        }
        if (arg0 != 0) {
            this.method1254(112, 80);
        }
    }

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "(I)V", line = 30)
    public final void method285(int arg0) {
        this.field2426.SetAmbient(this.field551 * this.field541, this.field552 * this.field551, this.field551 * this.field549, 0.0F);
        this.field2432 = false;
        int var2 = 109 % ((arg0 - 26) / 38);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILrw;)V", line = 40)
    public final void method1221(int arg0, class248 arg1) {
        this.method1238(arg1, -1);
        if (arg0 != 4) {
            this.field2418 = null;
        }
        if (arg1.field3612 != this.field2439[this.field613]) {
            this.field2418.SetSamplerState(this.field613, 1, arg1.field3612 ? 1 : 3);
            this.field2439[this.field613] = arg1.field3612;
        }
        if (this.field2434[this.field613] != arg1.field3613) {
            this.field2418.SetSamplerState(this.field613, 2, arg1.field3613 ? 1 : 3);
            this.field2434[this.field613] = arg1.field3613;
        }
    }

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "()V", line = 63)
    public final void method1222() {
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lkca;BLwq;)I", line = 66)
    public static final int method1223(class755 arg0, byte arg1, class674 arg2) {
        if (arg1 != 62) {
            method1233(null, 18, (byte) 70, 55, null, 86);
        }
        if (class674.field9590 == arg2) {
            if (class456.field6496 == arg0) {
                return 22;
            }
            if (class482.field6922 == arg0) {
                return 21;
            }
            if (class315.field4259 == arg0) {
                return 28;
            }
            if (class83.field1217 == arg0) {
                return 50;
            }
            if (class367.field5365 == arg0) {
                return 51;
            }
            if (class268.field3818 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "()V", line = 103)
    public final void method1224() {
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 106)
    public final void method1225(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class360 {
        this.method1257(arg2, arg3);
    }

    @OriginalMember(owner = "client!ad", name = "na", descriptor = "(IIII)[I", line = 115)
    public final int[] method1226(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field2418.method4103(0);
        IDirect3DSurface var7 = this.field2418.method4101(arg2, arg3, 21, 0, 0, true);
        if (class735.method4119(-2005530516, this.field2418.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class735.method4119(-2005530516, var7.LockRect(0, 0, arg2, arg3, 16, this.field2428))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field2428.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field2428.method4092(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field2428.method4092(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2583((byte) -118);
        var7.method2583((byte) -89);
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "(I)V", line = 157)
    public final void method278(int arg0) {
        if (arg0 != 0) {
            this.method409(66);
        }
    }

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "()V", line = 168)
    public final void method1227() {
        IDirect3DEventQuery var1 = this.field2418.method4106();
        if (class735.method4119(-2005530516, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2583((byte) -125);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZ)V", line = 192)
    public final void method240(boolean arg0, boolean arg1) {
        this.field2418.method4100(161, arg1);
        if (!arg0) {
            method1233(null, 80, (byte) -47, -99, null, 22);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;I)I", line = 203)
    private static final int method1228(class13 arg0, int arg1) {
        if (arg1 > -56) {
            method1252(null, (byte) 115);
        }
        if (class234.field3509 == arg0) {
            return 2;
        } else if (class272.field3857 == arg0) {
            return 0;
        } else if (class401.field5746 == arg0) {
            return 1;
        } else if (class231.field3462 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lfg;IB)V", line = 230)
    public final void method405(class436 arg0, int arg1, byte arg2) {
        class686 var4 = (class686) arg0;
        this.field2418.SetStreamSource(arg1, var4.field9753, 0, var4.method3895(-20392));
        if (arg2 != 11) {
            field2430 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(II)V", line = 241)
    public final void method197(int arg0, int arg1) {
        this.field2418.SetTextureStageState(this.field613, 11, arg0);
        if (arg1 != 32334) {
            this.field2422 = false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "()Lfc;", line = 252)
    public final class729 method1229() {
        D3DADAPTER_IDENTIFIER var1 = this.field2440.method4115(this.field2441, 0);
        return new class729(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 259)
    public final void method1230(boolean arg0) {
    }

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "(B)F", line = 262)
    public final float method347(byte arg0) {
        if (arg0 > -122) {
            this.method360(-5);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "(I)V", line = 274)
    public final void method307(int arg0) {
        float var2 = this.field627 ? this.field599 : 0.0F;
        float var3 = this.field627 ? -this.field594 : 0.0F;
        this.field2426.SetDiffuse(this.field541 * var2, this.field552 * var2, this.field549 * var2, 0.0F);
        this.field2433.SetDiffuse(this.field541 * var3, this.field552 * var3, this.field549 * var3, 0.0F);
        int var4 = 98 % ((arg0 + 5) / 63);
        this.field2432 = false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lup;Lrga;)Ldv;", line = 287)
    public final class86 method1231(class239 arg0, class290 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "(I)V", line = 295)
    public final void method321(int arg0) {
        if (arg0 < 106) {
            this.method405(null, 65, (byte) 12);
        }
        this.field2418.method4100(27, this.field540);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(Z)V", line = 306)
    public final void method210(boolean arg0) {
        this.field546 = (this.field562 - this.field601);
        if (arg0) {
            this.field2422 = false;
        }
        this.field563 = this.field546 - (float) this.field621;
        if (this.field563 < (float) this.field538) {
            this.field563 = this.field538;
        }
        this.field2418.method4108(36, this.field563);
        this.field2418.method4108(37, this.field546);
        this.field2418.SetRenderState(34, this.field575);
    }

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "()V", line = 323)
    public final void method1232() {
    }

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "(I)V", line = 327)
    public final void method313(int arg0) {
        if (arg0 < 107) {
            this.field2425 = 67;
        }
        this.field2418.method4100(15, this.field560);
    }

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "(I)V", line = 337)
    public final void method403(int arg0) {
        this.field2418.SetViewport(this.field567, this.field612, this.field486, this.field436, 0.0F, 1.0F);
        if (arg0 != -1) {
            this.method273((byte) -63);
        }
    }

    @OriginalMember(owner = "client!ad", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lla;Ljava/lang/Integer;)Lha;", line = 348)
    public static final class543 createToolkit(Canvas arg0, class267 arg1, class423 arg2, Integer arg3) {
        class173 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class421 var7 = new class421();
            IDirect3D var8 = IDirect3D.method4113(-2147483616, var7);
            D3DCAPS var9 = var8.method4116(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x20 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1233(var8, var6, (byte) 124, var5, var10, arg3)) {
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
                    var13 = var8.method4117(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class736 var17) {
                    var13 = var8.method4117(var5, var6, arg0, var11 | 0x20, var10);
                }
                class8 var15 = new class8(var13.method4111(0), var13.method4107());
                var4 = new class173(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method373((byte) 111);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method195();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 448)
    public final synchronized void method260(int arg0) {
        this.field2442.method2580((byte) 123);
        super.method260(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLew;)V", line = 457)
    public final void method284(byte arg0, class683 arg1) {
        int var3 = 0;
        if (arg0 <= 24) {
            this.field2444 = null;
        }
        if (class396.field5674 == arg1) {
            var3 = 65536;
        } else if (class39.field669 == arg1) {
            var3 = 131072;
        } else if (class280.field3929 == arg1) {
            var3 = 196608;
        }
        this.field2418.SetTextureStageState(this.field613, 11, var3 | this.field613);
    }

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "(I)V", line = 481)
    public final void method362(int arg0) {
        this.method307(-79);
        this.method406(-6911);
        if (arg0 >= -84) {
            this.method282(false, false, (byte) -4, -1, null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZBILaf;)V", line = 494)
    public final void method282(boolean arg0, boolean arg1, byte arg2, int arg3, class13 arg4) {
        int var6 = 0;
        byte var8;
        if (arg3 == 1) {
            var8 = 3;
        } else if (arg3 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg2 != -60) {
            this.field2442 = null;
        }
        if (arg1) {
            var6 |= 0x20;
        }
        if (arg0) {
            var6 |= 0x10;
        }
        this.field2418.SetTextureStageState(this.field613, var8, var6 | method1228(arg4, -67));
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljagdx/IDirect3D;IBILjagdx/D3DPRESENT_PARAMETERS;I)Z", line = 543)
    private static final boolean method1233(IDirect3D arg0, int arg1, byte arg2, int arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (arg2 < 107) {
                field2429 = null;
            }
            if (class735.method4118(arg0.method4114(arg3, var9), -2420)) {
                return false;
            }
            label84: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field2429.length; var10++) {
                        if (arg0.CheckDeviceType(arg3, arg1, var9.Format, field2429[var10], true) == 0 && arg0.CheckDeviceFormat(arg3, arg1, var9.Format, 1, 1, field2429[var10]) == 0 && (arg5 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg1, field2429[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field2437.length; var11++) {
                                if (arg0.CheckDeviceFormat(arg3, arg1, var9.Format, 2, 1, field2437[var11]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg1, var9.Format, field2429[var10], field2437[var11]) == 0 && (arg5 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg1, field2437[var10], true, var8) == 0)) {
                                    var6 = field2437[var11];
                                    var7 = field2429[var10];
                                    break label84;
                                }
                            }
                        }
                    }
                }
                arg5--;
            }
            if (arg5 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg4.AutoDepthStencilFormat = var6;
            arg4.MultiSampleQuality = 0;
            arg4.BackBufferFormat = var7;
            arg4.MultiSampleType = var8;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "()Z", line = 647)
    public final boolean method1234() {
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "ya", descriptor = "()V", line = 654)
    public final void method1235() {
        this.method308(0, true);
        this.field2418.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)V", line = 662)
    public final void method196(boolean arg0) {
        if (arg0) {
            method1228(null, -123);
        }
        this.field2418.SetRenderState(60, this.field555);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZI[III)Lug;", line = 672)
    public final class60 method290(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        return arg5 == 10 ? new class248(this, arg3, arg6, arg2, arg4, arg0, arg1) : (class60) null;
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "(B)V", line = 682)
    public final void method258(byte arg0) {
        if (arg0 == 73) {
            this.field2418.SetScissorRect(this.field616 + this.field567, this.field612 - -this.field572, this.field571, this.field583);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lwk;B)I", line = 692)
    private static final int method1236(class431 arg0, byte arg1) {
        if (class567.field8198 == arg0) {
            return 2;
        } else if (class281.field3934 == arg0) {
            return 4;
        } else if (class596.field8472 == arg0) {
            return 26;
        } else if (class684.field9720 == arg0) {
            return 7;
        } else if (class757.field10537 == arg0) {
            return 10;
        } else {
            int var2 = 51 % ((-arg1 - 40) / 33);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "()I", line = 720)
    public final int method1237() {
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lem;I)V", line = 727)
    public final void method1238(class626 arg0, int arg1) {
        this.field2418.SetTexture(this.field613, arg0.method615((byte) -64));
        if (this.field2438[this.field613] != arg0.field8887) {
            int var3 = method1252(arg0.field8887, (byte) -87);
            this.field2418.SetSamplerState(this.field613, 6, var3);
            this.field2418.SetSamplerState(this.field613, 5, var3);
            this.field2438[this.field613] = arg0.field8887;
            if (this.field2444[this.field613] != arg0.field8889) {
                this.field2418.SetSamplerState(this.field613, 7, arg0.field8889 ? method1252(arg0.field8887, (byte) -83) : 0);
                this.field2444[this.field613] = arg0.field8889;
            }
        } else if (arg0.field8889 != this.field2444[this.field613]) {
            this.field2418.SetSamplerState(this.field613, 7, arg0.field8889 ? method1252(arg0.field8887, (byte) -97) : 0);
            this.field2444[this.field613] = arg0.field8889;
        }
        if (!this.field2421[this.field613]) {
            this.field2421[this.field613] = true;
            this.method286(arg1 ^ 0xFFFFFF87);
            this.method273((byte) -100);
        }
        if (arg1 != -1) {
            this.method278(60);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ldv;)V", line = 768)
    public final void method1239(class86 arg0) {
    }

    @OriginalMember(owner = "client!ad", name = "GA", descriptor = "(I)V", line = 771)
    public final void method1240(int arg0) {
        this.field2418.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 779)
    public final void method203(byte arg0) {
        int var2 = 46 / ((arg0 + 22) / 39);
        if (class143.field1949 == this.field550) {
            this.field2418.SetRenderState(19, 5);
            this.field2418.SetRenderState(20, 6);
        } else if (class548.field7963 == this.field550) {
            this.field2418.SetRenderState(19, 2);
            this.field2418.SetRenderState(20, 2);
        } else if (class131.field1814 == this.field550) {
            this.field2418.SetRenderState(19, 9);
            this.field2418.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "(B)Z", line = 807)
    private final boolean method1241(byte arg0) {
        int var2 = this.field2418.TestCooperativeLevel();
        if (arg0 < 121) {
            return false;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class8 var3 = (class8) this.field484;
            this.method336(-48);
            var3.method29((byte) 119);
            this.field2443.BackBufferHeight = 0;
            this.field2443.BackBufferWidth = 0;
            if (method1233(this.field2440, this.field2425, (byte) 117, this.field2441, this.field2443, this.field630)) {
                int var4 = this.field2418.Reset(this.field2443);
                if (class735.method4119(-2005530516, var4)) {
                    var3.method30(this.field2418.method4111(0), this.field2418.method4107(), 0);
                    this.method306((byte) -93);
                    this.method338((byte) -46);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "()Z", line = 847)
    public final boolean method1242() {
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "(B)V", line = 856)
    public final void method338(byte arg0) {
        for (int var2 = 0; var2 < this.field619; var2++) {
            this.field2418.SetSamplerState(var2, 7, 0);
            this.field2418.SetSamplerState(var2, 6, 2);
            this.field2418.SetSamplerState(var2, 5, 2);
            this.field2418.SetSamplerState(var2, 1, 1);
            this.field2418.SetSamplerState(var2, 2, 1);
            this.field2438[var2] = class23.field215;
            this.field2439[var2] = this.field2434[var2] = true;
            this.field2444[var2] = false;
            this.field2445[var2] = 0;
        }
        this.field2418.SetTextureStageState(0, 6, 1);
        this.field2418.SetRenderState(9, 2);
        this.field2418.SetRenderState(23, 4);
        this.field2418.SetRenderState(25, 5);
        this.field2418.SetRenderState(24, 0);
        this.field2418.SetRenderState(22, 2);
        this.field2418.SetRenderState(147, 1);
        this.field2418.SetRenderState(145, 1);
        this.field2418.method4108(38, 0.95F);
        this.field2418.SetRenderState(140, 3);
        this.field2426.SetType(3);
        this.field2433.SetType(3);
        this.field2435.SetType(1);
        this.field2432 = false;
        super.method338(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(ZZ)Lfg;", line = 892)
    public final class436 method327(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method265(null, (byte) -5);
        }
        return new class686(this, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "(B)V", line = 903)
    public final void method275(byte arg0) {
        int var2 = -13 % ((-arg0 - 61) / 62);
        this.field2418.method4100(14, this.field576 && this.field574);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ep;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lvda;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lla;I)V", line = 910)
    private class173(int arg0, int arg1, Canvas arg2, class421 arg3, IDirect3D arg4, IDirect3DDevice arg5, class8 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class267 arg9, class423 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field2440 = arg4;
        this.field2419 = arg8;
        this.field2418 = arg5;
        this.field2442 = arg3;
        this.field2441 = arg0;
        this.field2424 = arg6;
        this.field2425 = arg1;
        this.field2443 = arg7;
        this.field2426 = new class737(this.field2442);
        this.field2433 = new class737(this.field2442);
        this.field2435 = new class737(this.field2442);
        this.field2428 = new PixelBuffer(this.field2442);
        this.field2423 = new GeometryBuffer(this.field2442);
        new GeometryBuffer(this.field2442);
        this.field635 = this.field2419.MaxActiveLights > 0 ? this.field2419.MaxActiveLights : 8;
        this.field2431 = (this.field2419.TextureCaps & 0x4000) != 0;
        this.field600 = (this.field2419.TextureCaps & 0x2000) != 0;
        this.field619 = this.field2419.MaxSimultaneousTextures;
        this.field2436 = (this.field2419.TextureCaps & 0x10000) != 0;
        this.field2422 = (this.field2419.TextureCaps & 0x2) == 0;
        this.field615 = (this.field2419.TextureCaps & 0x800) != 0;
        this.field542 = this.field630 > 0 || this.field2440.CheckDeviceMultiSampleType(this.field2441, this.field2425, this.field2443.BackBufferFormat, true, 2) == 0;
        this.field2421 = new boolean[this.field619];
        this.field2444 = new boolean[this.field619];
        this.field2445 = new int[this.field619];
        this.field2434 = new boolean[this.field619];
        this.field2438 = new class308[this.field619];
        this.field2439 = new boolean[this.field619];
        this.field2418.BeginScene();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lkca;BII[BI)Liv;", line = 951)
    public final class24 method310(class755 arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg1 != -69) {
            this.field2436 = false;
        }
        return new class69(this, arg0, arg5, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lsha;", line = 963)
    public final class545 method232(byte arg0, int arg1) {
        if (arg0 > -30) {
            this.field2444 = null;
        }
        if (arg1 == 3) {
            return new class532(this, this.field476);
        } else if (arg1 == 4) {
            return new class446(this, this.field476, this.field386);
        } else if (arg1 == 8) {
            return new class263(this, this.field476, this.field386);
        } else {
            return super.method232((byte) -116, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Luia;I)I", line = 1004)
    private static final int method1243(class272 arg0, int arg1) {
        if (class111.field1570 == arg0) {
            return 1;
        } else if (class549.field7982 == arg0) {
            return 2;
        } else if (class476.field6775 == arg0) {
            return 3;
        } else if (class472.field6695 == arg0) {
            return 4;
        } else if (class573.field8260 == arg0) {
            return 256;
        } else if (arg1 == 2) {
            return 0;
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)V", line = 1034)
    public final void method245(byte arg0) {
        if (this.field527) {
            field2430[11] = 0.0F;
            field2430[14] = 0.0F;
            field2430[7] = 0.0F;
            field2430[3] = 0.0F;
            field2430[15] = 1.0F;
            field2430[10] = 1.0F;
            field2430[1] = 0.0F;
            field2430[8] = 0.0F;
            field2430[4] = 0.0F;
            field2430[13] = 0.0F;
            field2430[0] = 1.0F;
            field2430[12] = 0.0F;
            field2430[9] = 0.0F;
            field2430[5] = 1.0F;
            field2430[2] = 0.0F;
            field2430[6] = 0.0F;
        } else {
            this.field532.method2527(field2430, false);
        }
        if (arg0 > 54) {
            this.field2418.SetTransform(256, field2430);
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(Z)V", line = 1073)
    public final void method241(boolean arg0) {
        this.field2426.SetDirection(-this.field609[0], -this.field609[1], -this.field609[2]);
        this.field2433.SetDirection(-this.field625[0], -this.field625[1], -this.field625[2]);
        this.field2432 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 1081)
    public final void method1244() {
    }

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "(I)V", line = 1085)
    public final void method372(int arg0) {
        this.field2418.SetTransform(3, this.field631);
        int var2 = 122 % ((arg0 - 16) / 51);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V", line = 1101)
    public final void method1245(int arg0, IDirect3DPixelShader arg1) {
        this.field2418.SetPixelShader(arg1);
        if (arg0 != 64) {
            this.method1251(null, null, 0.5768092F, null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;IIZ)V", line = 1123)
    public final void method253(class13 arg0, int arg1, int arg2, boolean arg3) {
        byte var6;
        if (arg1 == 1) {
            var6 = 6;
        } else if (arg1 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg2 != -27183) {
            this.field2442 = null;
        }
        if (arg3) {
            var7 |= 0x10;
        }
        this.field2418.SetTextureStageState(this.field613, var6, method1228(arg0, -112) | var7);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFF)V", line = 1157)
    public final void method1246(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(BZ)Lrr;", line = 1160)
    public final class33 method366(byte arg0, boolean arg1) {
        if (arg0 <= 81) {
            this.field2445 = null;
        }
        return new class682(this, class674.field9591, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 1171)
    public final void method236(Object arg0, Canvas arg1, byte arg2) {
        int var4 = 23 / ((arg2 + 58) / 41);
        if (this.field496 != arg1) {
            return;
        }
        Dimension var5 = arg1.getSize();
        if (var5.width > 0 && var5.height > 0) {
            this.field2418.EndScene();
            this.method1241((byte) 124);
            this.field2418.BeginScene();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Leu;B)V", line = 1197)
    public final void method265(class448 arg0, byte arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field2418.SetVertexDeclaration(var3.field8616);
        if (arg1 > -56) {
            this.field2420 = 22;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lrf;IIB)V", line = 1209)
    public final void method399(class749 arg0, int arg1, int arg2, byte arg3) {
        int var5 = 107 / ((-arg3 - 14) / 36);
        this.field2418.DrawPrimitive(method1248(31924, arg0), arg2, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILlea;)V", line = 1222)
    public final void method1247(int arg0, class69 arg1) {
        if (arg0 != -1216) {
            this.field2428 = null;
        }
        this.method1238(arg1, -1);
        if (!this.field2439[this.field613]) {
            this.field2418.SetSamplerState(this.field613, 1, 1);
            this.field2439[this.field613] = true;
        }
        if (!this.field2434[this.field613]) {
            this.field2418.SetSamplerState(this.field613, 2, 1);
            this.field2434[this.field613] = true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "(B)V", line = 1250)
    public final void method273(byte arg0) {
        if (arg0 == -100) {
            int var2 = this.field2421[this.field613] ? method1236(this.field629[this.field613], (byte) -79) : 1;
            this.field2418.SetTextureStageState(this.field613, 1, var2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lkca;IIB[BIZI)Lug;", line = 1264)
    public final class60 method295(class755 arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
        int var9 = -77 / ((72 - arg3) / 53);
        return new class248(this, arg0, arg2, arg7, arg6, arg4, arg5, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "(I)V", line = 1273)
    public final void method286(int arg0) {
        if (arg0 < 116) {
            this.method405(null, -10, (byte) 116);
        }
        int var2 = this.field2421[this.field613] ? method1236(this.field559[this.field613], (byte) 86) : 1;
        this.field2418.SetTextureStageState(this.field613, 4, var2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI[[IZ)Lau;", line = 1286)
    public final class245 method225(byte arg0, int arg1, int[][] arg2, boolean arg3) {
        if (arg0 != 3) {
            field2430 = null;
        }
        return new class395(this, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "(I)V", line = 1296)
    public final void method391(int arg0) {
        this.field2418.method4100(137, this.field597 && !this.field614);
        if (arg0 != 0) {
            this.method347((byte) 17);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lrf;IIILrr;II)V", line = 1309)
    public final void method354(class749 arg0, int arg1, int arg2, int arg3, class33 arg4, int arg5, int arg6) {
        int var8 = -21 / ((arg2 - 69) / 55);
        this.field2418.SetIndices(((class682) arg4).field9689);
        this.field2418.DrawIndexedPrimitive(method1248(31924, arg0), 0, arg1, arg3, arg6, arg5);
    }

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "(I)V", line = 1326)
    public final void method406(int arg0) {
        if (!this.field2432) {
            this.field2418.LightEnable(0, false);
            this.field2418.LightEnable(1, false);
            this.field2418.SetLight(0, this.field2426);
            this.field2418.SetLight(1, this.field2433);
            this.field2418.LightEnable(0, true);
            this.field2418.LightEnable(1, true);
            this.field2432 = true;
        }
        if (arg0 != -6911) {
            this.field2424 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILwq;Lkca;)Z", line = 1348)
    public final boolean method283(int arg0, class674 arg1, class755 arg2) {
        int var4 = -28 % ((arg0 - 46) / 45);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class735.method4119(-2005530516, this.field2440.method4114(this.field2441, var5)) && class735.method4119(-2005530516, this.field2440.CheckDeviceFormat(this.field2441, this.field2425, var5.Format, 0, 4, method1223(arg2, (byte) 62, arg1)));
    }

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "(I)V", line = 1357)
    public final void method360(int arg0) {
        this.field2418.method4100(174, this.field661);
        int var2 = 122 / ((27 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILrf;)I", line = 1366)
    private static final int method1248(int arg0, class749 arg1) {
        if (arg0 != 31924) {
            field2429 = null;
        }
        if (class112.field1580 == arg1) {
            return 2;
        } else if (class631.field8925 == arg1) {
            return 3;
        } else if (class241.field3563 == arg1) {
            return 1;
        } else if (class262.field3771 == arg1) {
            return 4;
        } else if (class575.field8272 == arg1) {
            return 6;
        } else if (class749.field10445 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILkca;Lwq;)Z", line = 1400)
    public final boolean method256(int arg0, class755 arg1, class674 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 != 0) {
            this.method263((byte) 7);
        }
        return class735.method4119(-2005530516, this.field2440.method4114(this.field2441, var4)) && class735.method4119(-2005530516, this.field2440.CheckDeviceFormat(this.field2441, this.field2425, var4.Format, 0, 3, method1223(arg1, (byte) 62, arg2)));
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIID)V", line = 1410)
    public final void method1249(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "(B)V", line = 1417)
    public final void method263(byte arg0) {
        if (arg0 != 58) {
            this.field2422 = true;
        }
        if (this.field2427 != null || this.field595[this.field613] == class656.field9402) {
            this.field2418.SetTextureStageState(this.field613, 24, 0);
            this.field2445[this.field613] = 0;
            return;
        }
        if (this.field595[this.field613] == class472.field6695) {
            this.field2418.SetTransform(this.field613 + 16, this.field584[this.field613].method2527(field2430, false));
        } else {
            this.field2418.SetTransform(this.field613 + 16, this.field584[this.field613].method2525(arg0 ^ 0x9B0, field2430));
        }
        int var2 = method1243(this.field595[this.field613], 2);
        if (this.field2445[this.field613] != var2) {
            this.field2418.SetTextureStageState(this.field613, 24, var2);
            this.field2445[this.field613] = var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V", line = 1452)
    public final void method1250(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "(I)V", line = 1460)
    public final void method316(int arg0) {
        if (this.field565.method3570(127)) {
            this.field535.method2527(field2430, false);
        } else {
            field2430[11] = 0.0F;
            field2430[0] = 1.0F;
            field2430[13] = 0.0F;
            field2430[10] = 1.0F;
            field2430[9] = 0.0F;
            field2430[5] = 1.0F;
            field2430[6] = 0.0F;
            field2430[2] = 0.0F;
            field2430[15] = 1.0F;
            field2430[1] = 0.0F;
            field2430[7] = 0.0F;
            field2430[3] = 0.0F;
            field2430[8] = 0.0F;
            field2430[12] = 0.0F;
            field2430[14] = 0.0F;
            field2430[4] = 0.0F;
        }
        this.field2418.SetTransform(2, field2430);
        if (arg0 != -1455) {
            this.method344(false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "(B)V", line = 1497)
    public final void method356(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field608; var2++) {
            class40 var3 = this.field573[var2];
            int var4 = var2 + 2;
            int var5 = var3.method420(arg0 + 54);
            float var6 = var3.method429(arg0 + 54) / 255.0F;
            this.field2435.SetPosition((float) var3.method422((byte) -101), (float) var3.method421(arg0 ^ 0xFFFFFFBD), (float) var3.method427(-1));
            this.field2435.SetDiffuse((float) ((var5 & 0xFF45B4) >> 16) * var6, (float) ((var5 & 0xFF07) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field2435.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method425((byte) 124) * var3.method425((byte) 94)));
            this.field2435.SetRange((float) var3.method425((byte) 98));
            this.field2418.SetLight(var4, this.field2435);
            this.field2418.LightEnable(var4, true);
        }
        while (this.field581 > var2) {
            this.field2418.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method356(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lss;Lss;FLss;)Lss;", line = 1533)
    public final class506 method1251(class506 arg0, class506 arg1, float arg2, class506 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBLwq;Lkca;)Lug;", line = 1540)
    public final class60 method329(int arg0, int arg1, byte arg2, class674 arg3, class755 arg4) {
        if (arg2 != -91) {
            this.field2431 = false;
        }
        return new class248(this, arg4, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lui;B)I", line = 1551)
    private static final int method1252(class308 arg0, byte arg1) {
        int var2 = -101 % ((-arg1 - 24) / 43);
        if (class23.field215 == arg0) {
            return 2;
        } else if (class435.field6224 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)Lup;", line = 1568)
    public final class239 method1253(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "(II)V", line = 1574)
    public final void method1254(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lrga;", line = 1578)
    public final class290 method1255(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjagdx/IDirect3DVertexShader;)V", line = 1585)
    public final void method1256(byte arg0, IDirect3DVertexShader arg1) {
        this.field2427 = arg1;
        if (arg0 < -5) {
            this.field2418.SetVertexShader(arg1);
            this.method263((byte) 58);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V", line = 1599)
    public final void method1257(int arg0, int arg1) throws class360 {
        this.field2418.EndScene();
        if (this.field2424.method28((byte) -127)) {
            this.field2420 = 0;
            if (class735.method4118(this.field2424.method27(0, -32432), -2420)) {
                this.method1241((byte) 122);
            }
        } else if (++this.field2420 <= 50) {
            this.method1241((byte) 126);
        } else {
            throw new class360();
        }
        this.field2418.BeginScene();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBZIILkca;[F)Lug;", line = 1623)
    public final class60 method376(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, class755 arg6, float[] arg7) {
        if (arg2 != -26) {
            this.field2420 = 89;
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1633)
    public final Object method218(Canvas arg0, int arg1) {
        if (arg1 != 0) {
            this.method203((byte) -33);
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1644)
    public final void method326(int arg0, Canvas arg1, Object arg2) {
        int var4 = -19 % ((-arg0 - 55) / 50);
        this.field2424 = (class8) arg2;
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "(Z)V", line = 1652)
    public final void method344(boolean arg0) {
        if (!arg0) {
            this.field2434 = null;
        }
        this.field2418.method4100(28, this.field589 && this.field579 && this.field621 >= 0);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V", line = 1662)
    public final void method195() {
        this.field2442.method2578(false);
        super.method195();
    }

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "(B)V", line = 1670)
    public final void method408(byte arg0) {
        if (arg0 != -118) {
            this.field2439 = null;
        }
        this.field2418.method4100(7, this.field568);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[Len;)Leu;", line = 1687)
    public final class448 method334(int arg0, class109[] arg1) {
        if (arg0 != 21011) {
            this.field2443 = null;
        }
        return new dxVertexLayout(this, arg1);
    }
}
