import jaclib.peer.class570;
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
import jagdx.class397;
import jagdx.class398;
import jagdx.class399;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class54 extends class174 {

    @OriginalMember(owner = "client!nca", name = "Qg", descriptor = "Z")
    private boolean field673 = false;

    @OriginalMember(owner = "client!nca", name = "Bg", descriptor = "I")
    private int field658 = 0;

    @OriginalMember(owner = "client!nca", name = "Hg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field664;

    @OriginalMember(owner = "client!nca", name = "Eg", descriptor = "Lnf;")
    private class37 field661;

    @OriginalMember(owner = "client!nca", name = "Sg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field675;

    @OriginalMember(owner = "client!nca", name = "Wg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field679;

    @OriginalMember(owner = "client!nca", name = "yg", descriptor = "Ljaclib/peer/pb;")
    public class570 field655;

    @OriginalMember(owner = "client!nca", name = "Cg", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!nca", name = "Tg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field676;

    @OriginalMember(owner = "client!nca", name = "Gg", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!nca", name = "Ig", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field665;

    @OriginalMember(owner = "client!nca", name = "zg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field656;

    @OriginalMember(owner = "client!nca", name = "xg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field654;

    @OriginalMember(owner = "client!nca", name = "Rg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field674;

    @OriginalMember(owner = "client!nca", name = "Jg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field666;

    @OriginalMember(owner = "client!nca", name = "Lg", descriptor = "Z")
    public boolean field668;

    @OriginalMember(owner = "client!nca", name = "wg", descriptor = "Z")
    public boolean field653;

    @OriginalMember(owner = "client!nca", name = "Mg", descriptor = "Z")
    public boolean field669;

    @OriginalMember(owner = "client!nca", name = "Vg", descriptor = "[Z")
    private boolean[] field678;

    @OriginalMember(owner = "client!nca", name = "Kg", descriptor = "[I")
    private int[] field667;

    @OriginalMember(owner = "client!nca", name = "Og", descriptor = "[Lqq;")
    private class599[] field671;

    @OriginalMember(owner = "client!nca", name = "Ug", descriptor = "[Z")
    private boolean[] field677;

    @OriginalMember(owner = "client!nca", name = "Ag", descriptor = "[Z")
    private boolean[] field657;

    @OriginalMember(owner = "client!nca", name = "Pg", descriptor = "[Z")
    private boolean[] field672;

    @OriginalMember(owner = "client!nca", name = "Ng", descriptor = "[I")
    private static int[] field670 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!nca", name = "Fg", descriptor = "[F")
    private static float[] field662 = new float[16];

    @OriginalMember(owner = "client!nca", name = "Dg", descriptor = "[I")
    private static int[] field660 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lwo;I)V")
    public final void method277(class408 arg0, int arg1) {
        if (arg1 < 93) {
            return;
        }
        int var3 = 0;
        if (class493.field7446 == arg0) {
            var3 = 65536;
        } else if (class553.field8228 == arg0) {
            var3 = 131072;
        } else if (class161.field2156 == arg0) {
            var3 = 196608;
        }
        this.field676.SetTextureStageState(this.field2547, 11, this.field2547 | var3);
    }

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "()Z")
    public final boolean method278() {
        return false;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Llc;BLjt;)Z")
    public final boolean method279(class629 arg0, byte arg1, class489 arg2) {
        if (arg1 < 67) {
            this.field654 = null;
        }
        D3DDISPLAYMODE var4 = this.field675.method2387(this.field659);
        return class398.method2384(7155, this.field675.CheckDeviceFormat(this.field659, this.field663, var4.Format, 0, 4, method315((byte) 21, arg0, arg2)));
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)V")
    public final void method280(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "(I)V")
    public final void method281(int arg0) {
        if (arg0 <= 48) {
            this.field661 = null;
        }
        if (this.field677[this.field2547]) {
            this.field677[this.field2547] = false;
            this.field676.SetTexture(this.field2547, null);
            this.method336((byte) -116);
            this.method308(46);
        }
    }

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)V")
    public final void method282(byte arg0) {
        this.field676.LightEnable(0, this.field2637);
        this.field676.LightEnable(1, this.field2637);
        if (arg0 > -42) {
            this.method312(null, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method283(int arg0, Canvas arg1) {
        if (arg0 != 1) {
            this.field659 = 87;
        }
        return null;
    }

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "(I)V")
    public final void method284(int arg0) {
        if (arg0 != -5) {
            this.field678 = null;
        }
        this.field676.method2402(14, this.field2588 && this.field2594);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I[IIIZBI)Lhc;")
    public final class391 method285(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        if (arg5 <= 63) {
            this.method331(45);
        }
        return new class617(this, arg2, arg3, arg4, arg1, arg6, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "()V")
    public final void method286() {
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "()Lrr;")
    public final class374 method287() {
        D3DADAPTER_IDENTIFIER var1 = this.field675.method2389(this.field659, 0);
        return new class374(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "()V")
    public final void method288() throws class477 {
        this.field676.EndScene();
        if (this.field661.method191(82)) {
            this.field658 = 0;
            if (class398.method2383((byte) 118, this.field661.method189(0, (byte) 47))) {
                this.method293((byte) -71);
            }
        } else if (++this.field658 <= 50) {
            this.method293((byte) -113);
        } else {
            throw new class477();
        }
        this.field676.BeginScene();
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Llw;I)V")
    public final void method289(class617 arg0, int arg1) {
        this.method328(arg1 + 79, arg0);
        if (arg0.field9022 != this.field657[this.field2547]) {
            this.field676.SetSamplerState(this.field2547, 1, arg0.field9022 ? 1 : 3);
            this.field657[this.field2547] = arg0.field9022;
        }
        if (arg1 != 0) {
            this.method297(null, 105, null);
        }
        if (this.field678[this.field2547] != arg0.field9024) {
            this.field676.SetSamplerState(this.field2547, 2, arg0.field9024 ? 1 : 3);
            this.field678[this.field2547] = arg0.field9024;
        }
    }

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "(B)V")
    public final void method290(byte arg0) {
        this.field676.method2402(174, this.field2660);
        if (arg0 != -49) {
            field670 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZLhba;)V")
    public final void method291(int arg0, int arg1, boolean arg2, class404 arg3) {
        int var5 = -29 / ((38 - arg0) / 56);
        byte var7;
        if (arg1 == 1) {
            var7 = 6;
        } else if (arg1 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        int var8 = 0;
        if (arg2) {
            var8 |= 0x10;
        }
        this.field676.SetTextureStageState(this.field2547, var7, method350((byte) 96, arg3) | var8);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLg;ILud;III)V")
    public final void method292(boolean arg0, class512 arg1, int arg2, class119 arg3, int arg4, int arg5, int arg6) {
        this.field676.SetIndices(((class81) arg1).field930);
        if (arg0) {
            this.field661 = null;
        }
        this.field676.DrawIndexedPrimitive(method318(arg3, -47), 0, arg5, arg6, arg2, arg4);
    }

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "(B)Z")
    private final boolean method293(byte arg0) {
        int var2 = this.field676.TestCooperativeLevel();
        if (arg0 >= -68) {
            this.field671 = null;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class37 var3 = (class37) this.field2487;
            this.method1178((byte) -127);
            var3.method192(-116);
            this.field679.BackBufferHeight = 0;
            this.field679.BackBufferWidth = 0;
            if (method333(this.field2541, this.field663, this.field679, 0, this.field659, this.field675)) {
                int var4 = this.field676.Reset(this.field679);
                if (class398.method2384(7155, var4)) {
                    var3.method190(0, this.field676.method2406(), this.field676.method2398(0));
                    this.method1123(true);
                    this.method356(-4358);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/pb;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lnf;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ln;Ldda;I)V")
    private class54(int arg0, int arg1, Canvas arg2, class570 arg3, IDirect3D arg4, IDirect3DDevice arg5, class37 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class472 arg9, class597 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field664 = arg8;
        this.field661 = arg6;
        this.field675 = arg4;
        this.field679 = arg7;
        this.field655 = arg3;
        this.field659 = arg0;
        this.field676 = arg5;
        this.field663 = arg1;
        this.field665 = new class397(this.field655);
        this.field656 = new class397(this.field655);
        this.field654 = new class397(this.field655);
        this.field674 = new PixelBuffer(this.field655);
        this.field666 = new GeometryBuffer(this.field655);
        this.field2585 = this.field664.MaxSimultaneousTextures;
        this.field668 = (this.field664.TextureCaps & 0x10000) != 0;
        this.field2549 = this.field664.MaxActiveLights <= 0 ? 8 : this.field664.MaxActiveLights;
        this.field653 = (this.field664.TextureCaps & 0x2) == 0;
        this.field669 = (this.field664.TextureCaps & 0x4000) != 0;
        this.field2579 = (this.field664.TextureCaps & 0x2000) != 0;
        this.field2605 = (this.field664.TextureCaps & 0x800) != 0;
        this.field2548 = this.field2541 > 0 || this.field675.CheckDeviceMultiSampleType(this.field659, this.field663, this.field679.BackBufferFormat, true, 2) == 0;
        this.field678 = new boolean[this.field2585];
        this.field667 = new int[this.field2585];
        this.field671 = new class599[this.field2585];
        this.field677 = new boolean[this.field2585];
        this.field657 = new boolean[this.field2585];
        this.field672 = new boolean[this.field2585];
        this.field676.BeginScene();
        try {
            this.field676.Clear(3, 0, 1.0F, 0);
            this.method288();
            this.field676.Clear(3, 0, 1.0F, 0);
        } catch (class477 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIZI[FILjt;)Lhc;")
    public final class391 method294(int arg0, int arg1, int arg2, boolean arg3, int arg4, float[] arg5, int arg6, class489 arg7) {
        if (arg0 < 125) {
            this.field674 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method295(boolean arg0, Object arg1, Canvas arg2) {
        this.field661 = (class37) arg1;
        if (arg0) {
            this.method338(true, null, null);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILtq;I)V")
    public final void method296(int arg0, class90 arg1, int arg2) {
        class583 var4 = (class583) arg1;
        this.field676.SetStreamSource(arg0, var4.field8566, 0, var4.method3402(-12175));
        if (arg2 <= 29) {
            this.method321(45);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method297(Object arg0, int arg1, Canvas arg2) {
        if (arg1 != 0) {
            method350((byte) -120, null);
        }
    }

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "()V")
    public final void method298() {
        this.field655.method3341(true);
        super.method298();
    }

    @OriginalMember(owner = "client!nca", name = "X", descriptor = "(I)V")
    public final void method299(int arg0) {
        this.field676.method2402(7, this.field2570);
        if (arg0 != 0) {
            this.method335((byte) 28);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILud;II)V")
    public final void method300(int arg0, class119 arg1, int arg2, int arg3) {
        this.field676.DrawPrimitive(method318(arg1, -73), arg0, arg2);
        if (arg3 >= -123) {
            this.method285(-54, null, 22, 11, false, (byte) 52, -81);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(Lpn;I)I")
    private static final int method301(class68 arg0, int arg1) {
        if (class516.field7667 == arg0) {
            return 1;
        } else if (class235.field3452 == arg0) {
            return 2;
        } else if (class648.field9396 == arg0) {
            return 3;
        } else if (class213.field3130 == arg0) {
            return 4;
        } else if (class342.field5002 == arg0) {
            return 256;
        } else {
            if (arg1 > -58) {
                field670 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(ZI)Lg;")
    public final class512 method302(boolean arg0, int arg1) {
        return arg1 >= -111 ? (class512) null : new class81(this, class629.field9209, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "()V")
    public final void method303() {
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)Ltq;")
    public final class90 method304(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method296(35, null, -34);
        }
        return new class583(this, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ[[II)Ldf;")
    public final class547 method305(int arg0, boolean arg1, int[][] arg2, int arg3) {
        if (arg3 <= 119) {
            this.field654 = null;
        }
        return new class400(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILqq;)I")
    private static final int method306(int arg0, class599 arg1) {
        if (arg0 != 15611) {
            method306(-31, null);
        }
        if (class579.field8529 == arg1) {
            return 2;
        } else if (class577.field8511 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
    public final void method307(boolean arg0) {
    }

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "(I)V")
    public final void method308(int arg0) {
        if (arg0 != 46) {
            this.field674 = null;
        }
        int var2 = this.field677[this.field2547] ? method337(12585, this.field2625[this.field2547]) : 1;
        this.field676.SetTextureStageState(this.field2547, 1, var2);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public final void method309(boolean arg0, Object arg1, Canvas arg2) {
        if (this.field2493 == arg2) {
            this.field676.EndScene();
            this.method293((byte) -105);
            this.field676.BeginScene();
        }
        if (!arg0) {
            this.method294(107, 121, -12, true, -99, null, 61, null);
        }
    }

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "(I)V")
    public final void method310(int arg0) {
        if (class307.field4470 == this.field2561) {
            this.field676.SetRenderState(19, 5);
            this.field676.SetRenderState(20, 6);
        } else if (class19.field175 == this.field2561) {
            this.field676.SetRenderState(19, 2);
            this.field676.SetRenderState(20, 2);
        } else if (class257.field3762 == this.field2561) {
            this.field676.SetRenderState(19, 9);
            this.field676.SetRenderState(20, 2);
        }
        if (arg0 != 0) {
            this.method310(-113);
        }
    }

    @OriginalMember(owner = "client!nca", name = "YA", descriptor = "()I")
    public final int method311() {
        return 0;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([Luq;B)Lvs;")
    public final class567 method312(class314[] arg0, byte arg1) {
        if (arg1 != 72) {
            this.method312(null, (byte) -81);
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "()V")
    public final void method313() {
        IDirect3DEventQuery var1 = this.field676.method2392();
        if (!class398.method2384(7155, var1.Issue())) {
            return;
        }
        while (true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
                break;
            }
            Thread.yield();
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(II)Leba;")
    public final class509 method314(int arg0, int arg1) {
        int var3 = -16 % ((arg0 + 16) / 45);
        if (arg1 == 3) {
            return new class61(this, this.field2430);
        } else if (arg1 == 4) {
            return new class334(this, this.field2430, this.field2413);
        } else {
            return super.method314(44, arg1);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLlc;Ljt;)I")
    public static final int method315(byte arg0, class629 arg1, class489 arg2) {
        if (arg0 != 21) {
            method350((byte) -70, null);
        }
        if (class629.field9208 == arg1) {
            if (class639.field9293 == arg2) {
                return 22;
            }
            if (class411.field5856 == arg2) {
                return 21;
            }
            if (class566.field8401 == arg2) {
                return 28;
            }
            if (class317.field4741 == arg2) {
                return 50;
            }
            if (class556.field8245 == arg2) {
                return 51;
            }
            if (class492.field7433 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "(I)V")
    public final void method316(int arg0) {
        this.field665.SetDirection(-this.field2603[0], -this.field2603[1], -this.field2603[2]);
        if (arg0 != 4) {
            this.field679 = null;
        }
        this.field656.SetDirection(-this.field2538[0], -this.field2538[1], -this.field2538[2]);
        this.field673 = false;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILlc;Ljt;II)Lhc;")
    public final class391 method317(int arg0, class629 arg1, class489 arg2, int arg3, int arg4) {
        return arg3 > -88 ? (class391) null : new class617(this, arg2, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lud;I)I")
    private static final int method318(class119 arg0, int arg1) {
        if (arg1 >= -42) {
            return 108;
        } else if (class566.field8386 == arg0) {
            return 2;
        } else if (class288.field4247 == arg0) {
            return 3;
        } else if (class585.field8702 == arg0) {
            return 1;
        } else if (class386.field5653 == arg0) {
            return 4;
        } else if (class25.field227 == arg0) {
            return 6;
        } else if (class161.field2157 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lhba;IZIZ)V")
    public final void method319(class404 arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        int var6 = arg1;
        byte var8;
        if (arg3 == 1) {
            var8 = 3;
        } else if (arg3 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg4) {
            var6 = arg1 | 0x20;
        }
        if (arg2) {
            var6 |= 0x10;
        }
        this.field676.SetTextureStageState(this.field2547, var8, method350((byte) 91, arg0) | var6);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIZLjt;I[BZ)Lhc;")
    public final class391 method320(int arg0, int arg1, int arg2, boolean arg3, class489 arg4, int arg5, byte[] arg6, boolean arg7) {
        if (arg3) {
            this.field663 = -80;
        }
        return new class617(this, arg4, arg2, arg1, arg7, arg6, arg5, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "Z", descriptor = "(I)V")
    public final void method321(int arg0) {
        this.field676.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "()V")
    public final void method322() {
        this.method1146((byte) -87, true);
        this.field676.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!nca", name = "T", descriptor = "(I)V")
    public final void method323(int arg0) {
        this.field676.method2402(15, this.field2630);
        if (arg0 != 2) {
            this.field663 = -55;
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)V")
    public final void method324(byte arg0) {
        if (arg0 == -52) {
            this.field676.method2402(137, this.field2577 && !this.field2567);
        }
    }

    @OriginalMember(owner = "client!nca", name = "P", descriptor = "(I)V")
    public final void method325(int arg0) {
        if (arg0 == 0) {
            this.field676.SetRenderState(60, this.field2554);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILvs;)V")
    public final void method326(int arg0, class567 arg1) {
        if (arg0 != 43) {
            this.field667 = null;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field676.SetVertexDeclaration(var3.field3829);
    }

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "(IIII)[I")
    public final int[] method327(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field676.method2403(0);
        IDirect3DSurface var7 = this.field676.method2397(arg2, arg3, 21, 0, 0, true);
        if (class398.method2384(7155, this.field676.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class398.method2384(7155, var7.LockRect(0, 0, arg2, arg3, 0, this.field674))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field674.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field674.method2382(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field674.method2382(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3340((byte) -27);
        var7.method3340((byte) -27);
        return var5;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILne;)V")
    public final void method328(int arg0, class175 arg1) {
        this.field676.SetTexture(this.field2547, arg1.method1179(false));
        if (this.field671[this.field2547] != arg1.field2666) {
            int var3 = method306(15611, arg1.field2666);
            this.field676.SetSamplerState(this.field2547, 6, var3);
            this.field676.SetSamplerState(this.field2547, 5, var3);
            this.field671[this.field2547] = arg1.field2666;
            if (this.field672[this.field2547] != arg1.field2664) {
                this.field676.SetSamplerState(this.field2547, 7, arg1.field2664 ? method306(15611, arg1.field2666) : 0);
                this.field672[this.field2547] = arg1.field2664;
            }
        } else if (arg1.field2664 != this.field672[this.field2547]) {
            this.field676.SetSamplerState(this.field2547, 7, arg1.field2664 ? method306(15611, arg1.field2666) : 0);
            this.field672[this.field2547] = arg1.field2664;
        }
        if (!this.field677[this.field2547]) {
            this.field677[this.field2547] = true;
            this.method336((byte) -123);
            this.method308(46);
        }
        int var4 = 127 / ((-arg0 - 4) / 50);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lj;Z)V")
    public final void method329(class324 arg0, boolean arg1) {
        this.method328(120, arg0);
        if (!this.field657[this.field2547]) {
            this.field676.SetSamplerState(this.field2547, 1, 1);
            this.field657[this.field2547] = true;
        }
        if (arg1) {
            this.field671 = null;
        }
        if (!this.field678[this.field2547]) {
            this.field676.SetSamplerState(this.field2547, 2, 1);
            this.field678[this.field2547] = true;
        }
    }

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "(B)V")
    public final void method330(byte arg0) {
        if (arg0 >= -122) {
            this.method283(-119, null);
        }
        this.field665.SetAmbient(this.field2555 * this.field2550, this.field2565 * this.field2555, this.field2581 * this.field2555, 0.0F);
        this.field673 = false;
    }

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "(I)V")
    public final void method331(int arg0) {
        this.field676.method2402(27, this.field2571);
        if (arg0 != 1) {
            this.method347(-0.5026083F, 1.0718664F, 0.05275705F);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Llh;Llh;FLlh;)Llh;")
    public final class125 method332(class125 arg0, class125 arg1, float arg2, class125 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILjagdx/D3DPRESENT_PARAMETERS;IILjagdx/IDirect3D;)Z")
    private static final boolean method333(int arg0, int arg1, D3DPRESENT_PARAMETERS arg2, int arg3, int arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = arg5.method2387(arg4);
            label75: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field660.length; var10++) {
                        if (arg5.CheckDeviceType(arg4, arg1, var9.Format, field660[var10], true) == 0 && arg5.CheckDeviceFormat(arg4, arg1, var9.Format, 1, 1, field660[var10]) == 0 && (arg0 == 0 || arg5.CheckDeviceMultiSampleType(arg4, arg1, field660[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field670.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg4, arg1, var9.Format, 2, 1, field670[var11]) == 0 && arg5.CheckDepthStencilMatch(arg4, arg1, var9.Format, field660[var10], field670[var11]) == 0 && (arg0 == 0 || arg5.CheckDeviceMultiSampleType(arg4, arg1, field670[var10], true, var8) == 0)) {
                                    var7 = field660[var10];
                                    var6 = field670[var11];
                                    break label75;
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
            arg2.AutoDepthStencilFormat = var6;
            arg2.MultiSampleQuality = arg3;
            arg2.MultiSampleType = var8;
            arg2.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "(Z)V")
    public final void method334(boolean arg0) {
        this.field676.method2402(28, this.field2545 && this.field2582 && this.field2546 >= 0 | this.field2563);
        if (arg0) {
            this.field656 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "(B)F")
    public final float method335(byte arg0) {
        if (arg0 != 75) {
            this.field654 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
    public final void method336(byte arg0) {
        if (arg0 >= -96) {
            this.field668 = true;
        }
        int var2 = this.field677[this.field2547] ? method337(12585, this.field2552[this.field2547]) : 1;
        this.field676.SetTextureStageState(this.field2547, 4, var2);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILkp;)I")
    private static final int method337(int arg0, class464 arg1) {
        if (class43.field527 == arg1) {
            return 2;
        } else if (class609.field8962 == arg1) {
            return 4;
        } else if (class106.field1327 == arg1) {
            return 26;
        } else if (class308.field4477 == arg1) {
            return 7;
        } else if (class414.field5915 == arg1) {
            return 10;
        } else {
            if (arg0 != 12585) {
                field660 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLlc;Ljt;)Z")
    public final boolean method338(boolean arg0, class629 arg1, class489 arg2) {
        D3DDISPLAYMODE var4 = this.field675.method2387(this.field659);
        return arg0 ? false : class398.method2384(7155, this.field675.CheckDeviceFormat(this.field659, this.field663, var4.Format, 0, 3, method315((byte) 21, arg1, arg2)));
    }

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "(Z)V")
    public final void method339(boolean arg0) {
        this.field676.SetTransform(3, this.field2614);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!nca", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ln;Ldda;Ljava/lang/Integer;)Lqa;")
    public static final class167 createToolkit(Canvas arg0, class472 arg1, class597 arg2, Integer arg3) {
        class54 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class570 var7 = new class570();
            IDirect3D var8 = IDirect3D.method2391(-2147483616, var7);
            D3DADAPTER_IDENTIFIER var9 = var8.method2389(var5, 0);
            if (var9.VendorID == 32902) {
                throw new RuntimeException("");
            }
            D3DCAPS var10 = var8.method2388(var5, var6);
            if ((var10.RasterCaps & 0x1000000) == 0) {
                throw new RuntimeException("");
            } else if (var10.MaxSimultaneousTextures < 2) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x8) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x40) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x200) == 0) {
                throw new RuntimeException("");
            } else if ((var10.TextureOpCaps & 0x2000000) == 0) {
                throw new RuntimeException("");
            } else if ((var10.SrcBlendCaps & var10.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var10.SrcBlendCaps & 0x20 & var10.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var10.DestBlendCaps & 0x2 & var10.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var10.MaxActiveLights > 0 && var10.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var10.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var11 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method333(arg3, var6, var11, 0, var5, var8)) {
                    throw new RuntimeException("");
                }
                var11.EnableAutoDepthStencil = true;
                var11.Windowed = true;
                var11.PresentationInterval = Integer.MIN_VALUE;
                int var12 = 2;
                if ((var10.DevCaps & 0x100000) != 0) {
                    var12 |= 0x10;
                }
                Object var13 = null;
                IDirect3DDevice var14;
                try {
                    var14 = var8.method2390(var5, var6, arg0, var12 | 0x40, var11);
                } catch (class399 var18) {
                    var14 = var8.method2390(var5, var6, arg0, var12 | 0x20, var11);
                }
                class37 var16 = new class37(var14.method2398(0), var14.method2406());
                var4 = new class54(var5, var6, arg0, var7, var8, var14, var16, var11, var10, arg1, arg2, arg3);
                var4.method1150(19933);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var19) {
            if (var4 != null) {
                var4.method298();
            }
            throw var19;
        }
    }

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "(I)V")
    public final void method340(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field2611; var2++) {
            class535 var3 = this.field2617[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3148((byte) -111);
            float var6 = var3.method3145(2) / 255.0F;
            this.field654.SetPosition((float) var3.method3151(arg0 ^ 0xFFFFFFE8), (float) var3.method3150(2), (float) var3.method3143(-104));
            this.field654.SetDiffuse((float) ((var5 & 0xFFBB10) >> 16) * var6, (float) ((var5 & 0xFF73) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field654.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3146(0) * var3.method3146(0)));
            this.field654.SetRange((float) var3.method3146(0));
            this.field676.SetLight(var4, this.field654);
            this.field676.LightEnable(var4, true);
        }
        while (var2 < this.field2584) {
            this.field676.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method340(arg0);
    }

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "()V")
    public final void method341() {
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(Z)V")
    public final void method342(boolean arg0) {
        this.field665.SetDiffuse(this.field2616 * this.field2550, this.field2616 * this.field2565, this.field2616 * this.field2581, 0.0F);
        this.field656.SetDiffuse(-this.field2568 * this.field2550, -this.field2568 * this.field2565, -this.field2568 * this.field2581, 0.0F);
        if (arg0) {
            this.field673 = false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "(B)V")
    public final void method343(byte arg0) {
        if (arg0 <= 120) {
            this.field666 = null;
        }
        this.field676.SetViewport(this.field2598, this.field2557, this.field2395, this.field2372, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(BZ)V")
    public final void method344(byte arg0, boolean arg1) {
        this.field676.method2402(161, arg1);
        if (arg0 != -5) {
            this.field676 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "()Z")
    public final boolean method345() {
        return false;
    }

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "(I)V")
    public final void method346(int arg0) {
        if (this.field2528) {
            field662[11] = 0.0F;
            field662[3] = 0.0F;
            field662[1] = 0.0F;
            field662[10] = 1.0F;
            field662[9] = 0.0F;
            field662[12] = 0.0F;
            field662[13] = 0.0F;
            field662[2] = 0.0F;
            field662[4] = 0.0F;
            field662[8] = 0.0F;
            field662[0] = 1.0F;
            field662[7] = 0.0F;
            field662[5] = 1.0F;
            field662[6] = 0.0F;
            field662[15] = 1.0F;
            field662[14] = 0.0F;
        } else {
            this.field2531.method746(-25017, field662);
        }
        this.field676.SetTransform(256, field662);
        int var2 = -43 % ((62 - arg0) / 54);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(FFF)V")
    public final void method347(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(IZ)V")
    public final void method348(int arg0, boolean arg1) {
        if (!arg1) {
            this.method321(26);
        }
        this.field676.SetTextureStageState(this.field2547, 11, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "(I)V")
    public final void method349(int arg0) {
        int var2 = 66 % ((62 - arg0) / 45);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLhba;)I")
    private static final int method350(byte arg0, class404 arg1) {
        if (arg0 < 73) {
            field670 = null;
        }
        if (class248.field3625 == arg1) {
            return 2;
        } else if (class524.field7760 == arg1) {
            return 0;
        } else if (class352.field5118 == arg1) {
            return 1;
        } else if (class455.field6635 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public final synchronized void method351(int arg0) {
        this.field655.method3345(-13691);
        super.method351(arg0);
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "(I)V")
    public final void method352(int arg0) {
        int var2 = 75 % ((46 - arg0) / 52);
        this.field676.SetScissorRect(this.field2598 + this.field2587, this.field2557 - -this.field2572, this.field2606, this.field2592);
    }

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "(I)V")
    public final void method353(int arg0) {
        if (arg0 >= -35 || this.field673) {
            return;
        }
        this.field676.LightEnable(0, !this.field2637);
        this.field676.LightEnable(1, !this.field2637);
        this.field676.SetLight(0, this.field665);
        this.field676.SetLight(1, this.field656);
        this.field676.LightEnable(0, this.field2637);
        this.field676.LightEnable(1, this.field2637);
        this.field673 = true;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method354(Rectangle[] arg0, int arg1) throws class477 {
        this.method288();
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjt;[BIIB)Lpl;")
    public final class560 method355(int arg0, class489 arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -56) {
            this.method355(-38, null, null, 9, 82, (byte) 91);
        }
        return new class324(this, arg1, arg3, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "(I)V")
    public final void method356(int arg0) {
        for (int var2 = 0; var2 < this.field2585; var2++) {
            this.field676.SetSamplerState(var2, 7, 0);
            this.field676.SetSamplerState(var2, 6, 2);
            this.field676.SetSamplerState(var2, 5, 2);
            this.field676.SetSamplerState(var2, 1, 1);
            this.field676.SetSamplerState(var2, 2, 1);
            this.field671[var2] = class579.field8529;
            this.field657[var2] = this.field678[var2] = true;
            this.field672[var2] = false;
            this.field667[var2] = 0;
        }
        this.field676.SetTextureStageState(0, 6, 1);
        this.field676.SetRenderState(9, 2);
        this.field676.SetRenderState(23, 4);
        this.field676.SetRenderState(25, 5);
        if (arg0 != -4358) {
            this.method280(70, -40, 89, -35);
        }
        this.field676.SetRenderState(24, 0);
        this.field676.SetRenderState(22, 2);
        this.field676.SetRenderState(147, 1);
        this.field676.SetRenderState(145, 1);
        this.field676.method2405(38, 0.95F);
        this.field676.SetRenderState(140, 3);
        this.field665.SetType(3);
        this.field656.SetType(3);
        this.field654.SetType(1);
        this.field673 = false;
        super.method356(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (this.field2595.method1313(2)) {
            this.field2535.method746(-25017, field662);
        } else {
            field662[4] = 0.0F;
            field662[6] = 0.0F;
            field662[14] = 0.0F;
            field662[7] = 0.0F;
            field662[3] = 0.0F;
            field662[2] = 0.0F;
            field662[12] = 0.0F;
            field662[10] = 1.0F;
            field662[0] = 1.0F;
            field662[13] = 0.0F;
            field662[11] = 0.0F;
            field662[8] = 0.0F;
            field662[9] = 0.0F;
            field662[5] = 1.0F;
            field662[15] = 1.0F;
            field662[1] = 0.0F;
        }
        this.field676.SetTransform(2, field662);
        if (arg0 != 0) {
            this.method312(null, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "(B)V")
    public final void method358(byte arg0) {
        if (this.field2563) {
            this.field676.method2405(36, 0.0F);
            this.field676.method2405(37, 1.0F);
            this.field676.SetRenderState(34, this.field2610);
        } else {
            this.field2593 = (this.field2601 - this.field2627);
            this.field2631 = (float) (-this.field2546) + this.field2593;
            if ((float) this.field2574 > this.field2631) {
                this.field2631 = this.field2574;
            }
            this.field676.method2405(36, this.field2631);
            this.field676.method2405(37, this.field2593);
            this.field676.SetRenderState(34, this.field2609);
        }
        if (arg0 < 124) {
            this.method291(103, -44, true, null);
        }
    }

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "(I)V")
    public final void method359(int arg0) {
        if (this.field2591[this.field2547] == class465.field6730) {
            this.field676.SetTextureStageState(this.field2547, 24, 0);
            this.field667[this.field2547] = 0;
        } else {
            if (this.field2591[this.field2547] == class213.field3130) {
                this.field676.SetTransform(this.field2547 + 16, this.field2619[this.field2547].method746(arg0 ^ 0x61A7, field662));
            } else {
                this.field676.SetTransform(this.field2547 + 16, this.field2619[this.field2547].method764(field662, (byte) 90));
            }
            int var2 = method301(this.field2591[this.field2547], -120);
            if (this.field667[this.field2547] != var2) {
                this.field676.SetTextureStageState(this.field2547, 24, var2);
                this.field667[this.field2547] = var2;
            }
        }
        if (arg0 != -32) {
            this.field654 = null;
        }
    }
}
