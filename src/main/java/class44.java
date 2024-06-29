import jaclib.peer.class623;
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
import jagdx.class448;
import jagdx.class449;
import jagdx.class450;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class44 extends class393 {

    @OriginalMember(owner = "client!kaa", name = "Dg", descriptor = "I")
    private int field783 = 0;

    @OriginalMember(owner = "client!kaa", name = "Mg", descriptor = "Z")
    private boolean field792 = false;

    @OriginalMember(owner = "client!kaa", name = "Eg", descriptor = "Ljaclib/peer/naa;")
    public class623 field784;

    @OriginalMember(owner = "client!kaa", name = "Rg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field797;

    @OriginalMember(owner = "client!kaa", name = "Og", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field794;

    @OriginalMember(owner = "client!kaa", name = "Ug", descriptor = "Ltp;")
    private class494 field800;

    @OriginalMember(owner = "client!kaa", name = "Qg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field796;

    @OriginalMember(owner = "client!kaa", name = "Bg", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!kaa", name = "wg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field776;

    @OriginalMember(owner = "client!kaa", name = "Jg", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "client!kaa", name = "Kg", descriptor = "Ljagdx/D3DLIGHT;")
    private class450 field790;

    @OriginalMember(owner = "client!kaa", name = "yg", descriptor = "Ljagdx/D3DLIGHT;")
    private class450 field778;

    @OriginalMember(owner = "client!kaa", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class450 field786;

    @OriginalMember(owner = "client!kaa", name = "ug", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field774;

    @OriginalMember(owner = "client!kaa", name = "Ng", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field793;

    @OriginalMember(owner = "client!kaa", name = "Lg", descriptor = "Z")
    public boolean field791;

    @OriginalMember(owner = "client!kaa", name = "Sg", descriptor = "Z")
    public boolean field798;

    @OriginalMember(owner = "client!kaa", name = "Ag", descriptor = "Z")
    public boolean field780;

    @OriginalMember(owner = "client!kaa", name = "Hg", descriptor = "[Lfw;")
    private class52[] field787;

    @OriginalMember(owner = "client!kaa", name = "Cg", descriptor = "[Z")
    private boolean[] field782;

    @OriginalMember(owner = "client!kaa", name = "Ig", descriptor = "[Z")
    private boolean[] field788;

    @OriginalMember(owner = "client!kaa", name = "zg", descriptor = "[I")
    private int[] field779;

    @OriginalMember(owner = "client!kaa", name = "Tg", descriptor = "[Z")
    private boolean[] field799;

    @OriginalMember(owner = "client!kaa", name = "vg", descriptor = "[Z")
    private boolean[] field775;

    @OriginalMember(owner = "client!kaa", name = "xg", descriptor = "[I")
    private static int[] field777 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!kaa", name = "Pg", descriptor = "[F")
    private static float[] field795 = new float[16];

    @OriginalMember(owner = "client!kaa", name = "Fg", descriptor = "[I")
    private static int[] field785 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "()V", line = 4)
    public final void method286() {
        this.field784.method3590(118);
        super.method286();
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lcaa;Lcaa;FLcaa;)Lcaa;", line = 15)
    public final class275 method313(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "()Lik;", line = 23)
    public final class191 method314() {
        D3DADAPTER_IDENTIFIER var1 = this.field794.method2643(this.field781, 0);
        return new class191(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "(B)V", line = 32)
    public final void method466(byte arg0) {
        int var2 = this.field788[this.field5484] ? method503(this.field5456[this.field5484], -121) : 1;
        this.field797.SetTextureStageState(this.field5484, 1, var2);
        if (arg0 != 122) {
            this.field796 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "ja", descriptor = "(I)V", line = 43)
    public final void method323(int arg0) {
        this.field797.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "(Z)V", line = 51)
    public final void method467(boolean arg0) {
        this.field797.method2661(174, this.field5559);
        if (!arg0) {
            this.field781 = -111;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "P", descriptor = "(I)V", line = 63)
    public final void method468(int arg0) {
        if (arg0 == 13 && this.field788[this.field5484]) {
            this.field788[this.field5484] = false;
            this.field797.SetTexture(this.field5484, null);
            this.method506(114);
            this.method466((byte) 122);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 80)
    public final void method240(Rectangle[] arg0, int arg1) throws class365 {
        this.method293();
    }

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "(B)V", line = 87)
    public final void method469(byte arg0) {
        if (this.field5430) {
            field795[15] = 1.0F;
            field795[3] = 0.0F;
            field795[10] = 1.0F;
            field795[4] = 0.0F;
            field795[11] = 0.0F;
            field795[6] = 0.0F;
            field795[13] = 0.0F;
            field795[1] = 0.0F;
            field795[2] = 0.0F;
            field795[12] = 0.0F;
            field795[7] = 0.0F;
            field795[8] = 0.0F;
            field795[0] = 1.0F;
            field795[14] = 0.0F;
            field795[9] = 0.0F;
            field795[5] = 1.0F;
        } else {
            this.field5422.method3703(arg0 ^ 0xFFFFFFDB, field795);
        }
        this.field797.SetTransform(256, field795);
        if (arg0 != -40) {
            this.method263(-118);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ[[II)Lgi;", line = 124)
    public final class629 method470(int arg0, boolean arg1, int[][] arg2, int arg3) {
        return arg3 == 12482 ? new class583(this, arg0, arg1, arg2) : (class629) null;
    }

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "(IIII)[I", line = 136)
    public final int[] method325(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field797.method2656(0);
        IDirect3DSurface var7 = this.field797.method2648(arg2, arg3, 21, 0, 0, true);
        if (class448.method2666((byte) 104, this.field797.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class448.method2666((byte) 106, var7.LockRect(0, 0, arg2, arg3, 0, this.field774))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field774.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field774.method2670(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field774.method2670(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3597(100);
        var7.method3597(100);
        return var5;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lcr;I)V", line = 175)
    public final void method471(class531 arg0, int arg1) {
        if (arg1 > -10) {
            this.method469((byte) 109);
        }
        int var3 = 0;
        if (class216.field2806 == arg0) {
            var3 = 65536;
        } else if (class530.field7740 == arg0) {
            var3 = 131072;
        } else if (class368.field4949 == arg0) {
            var3 = 196608;
        }
        this.field797.SetTextureStageState(this.field5484, 11, this.field5484 | var3);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIII)V", line = 198)
    public final void method254(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "(I)V", line = 201)
    public final void method472(int arg0) {
        this.field797.method2661(14, this.field5461 && this.field5475);
        if (arg0 != -1) {
            this.field797 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "(Z)V", line = 211)
    public final void method473(boolean arg0) {
        if (this.field5503.method638((byte) -114)) {
            this.field5434.method3703(3, field795);
        } else {
            field795[3] = 0.0F;
            field795[12] = 0.0F;
            field795[6] = 0.0F;
            field795[4] = 0.0F;
            field795[9] = 0.0F;
            field795[14] = 0.0F;
            field795[13] = 0.0F;
            field795[8] = 0.0F;
            field795[0] = 1.0F;
            field795[7] = 0.0F;
            field795[5] = 1.0F;
            field795[10] = 1.0F;
            field795[2] = 0.0F;
            field795[15] = 1.0F;
            field795[11] = 0.0F;
            field795[1] = 0.0F;
        }
        if (!arg0) {
            this.method525(null, -119, 48, -112, 105, true, -40);
        }
        this.field797.SetTransform(2, field795);
    }

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "(B)V", line = 249)
    public final void method474(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field5489; var2++) {
            class530 var3 = this.field5530[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3120(true);
            float var6 = var3.method3117(false) / 255.0F;
            this.field786.SetPosition((float) var3.method3118(34037), (float) var3.method3119(3553), (float) var3.method3115(-30190));
            this.field786.SetDiffuse((float) ((var5 & 0xFF021E) >> 16) * var6, (float) ((var5 & 0xFFAC) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field786.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3122(-11184) * var3.method3122(-11184)));
            this.field786.SetRange((float) var3.method3122(-11184));
            this.field797.SetLight(var4, this.field786);
            this.field797.LightEnable(var4, true);
        }
        while (this.field5494 > var2) {
            this.field797.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method474(arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZI)Lcda;", line = 284)
    public final class154 method475(boolean arg0, int arg1) {
        if (arg1 != -30974) {
            this.field787 = null;
        }
        return new class3(this, class279.field3794, arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Z)V", line = 294)
    public final void method296(boolean arg0) {
    }

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "(Z)V", line = 298)
    public final void method476(boolean arg0) {
        if (arg0) {
            this.field797.method2661(137, this.field5522 && !this.field5438);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lf;Z)V", line = 308)
    public final void method241(class701 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZIILfca;[BIZI)Lco;", line = 311)
    public final class103 method477(boolean arg0, int arg1, int arg2, class75 arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            createToolkit(null, null, null, null);
        }
        return new class284(this, arg3, arg1, arg5, arg0, arg4, arg7, arg2);
    }

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "(B)V", line = 321)
    public final void method478(byte arg0) {
        if (arg0 != 67) {
            this.method486(36, true);
        }
        this.field797.method2661(28, this.field5460 && this.field5453 && this.field5449 >= 0);
    }

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "(II)Ljfa;", line = 333)
    public final class262 method479(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field791 = false;
        }
        if (arg0 == 3) {
            return new class130(this, this.field5320);
        } else if (arg0 == 4) {
            return new class464(this, this.field5320, this.field5335);
        } else if (arg0 == 8) {
            return new class61(this, this.field5320, this.field5335);
        } else {
            return super.method479(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "()Z", line = 376)
    public final boolean method237() {
        return false;
    }

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "()V", line = 383)
    public final void method293() throws class365 {
        this.field797.EndScene();
        if (this.field800.method2869((byte) -95)) {
            this.field783 = 0;
            if (class448.method2665(this.field800.method2871((byte) 99, 0), true)) {
                this.method484((byte) 69);
            }
        } else if ((++this.field783) <= 50) {
            this.method484((byte) 57);
        } else {
            throw new class365();
        }
        this.field797.BeginScene();
    }

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "()V", line = 408)
    public final void method328() {
        IDirect3DEventQuery var1 = this.field797.method2662();
        if (class448.method2666((byte) -49, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3597(100);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lfj;I)V", line = 434)
    public final void method480(class607 arg0, int arg1) {
        int var3 = -70 % ((arg1 + 12) / 52);
        dxVertexLayout var4 = (dxVertexLayout) arg0;
        this.field797.SetVertexDeclaration(var4.field3955);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lfca;ZLbv;)Z", line = 444)
    public final boolean method481(class75 arg0, boolean arg1, class279 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg1) {
            this.method479(121, -125);
        }
        return class448.method2666((byte) 117, this.field794.method2645(this.field781, var4)) && class448.method2666((byte) 115, this.field794.CheckDeviceFormat(this.field781, this.field789, var4.Format, 0, 3, method529(!arg1, arg0, arg2)));
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZLuf;Z)V", line = 456)
    public final void method482(int arg0, boolean arg1, class414 arg2, boolean arg3) {
        if (!arg1) {
            this.method299();
        }
        int var5 = 0;
        byte var7;
        if (arg0 == 1) {
            var7 = 6;
        } else if (arg0 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg3) {
            var5 |= 0x10;
        }
        this.field797.SetTextureStageState(this.field5484, var7, var5 | method510(arg2, -121));
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V", line = 502)
    public final void method483(boolean arg0, Object arg1, Canvas arg2) {
        if (!arg0) {
            this.field791 = true;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "DA", descriptor = "()I", line = 511)
    public final int method327() {
        return 0;
    }

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "(B)Z", line = 519)
    private final boolean method484(byte arg0) {
        int var2 = this.field797.TestCooperativeLevel();
        if (arg0 <= 23) {
            return false;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class494 var3 = (class494) this.field5302;
            this.method2361((byte) -114);
            var3.method2872(true);
            this.field796.BackBufferHeight = 0;
            this.field796.BackBufferWidth = 0;
            if (method490(this.field796, this.field5518, (byte) 124, this.field789, this.field781, this.field794)) {
                int var4 = this.field797.Reset(this.field796);
                if (class448.method2666((byte) -61, var4)) {
                    var3.method2870(this.field797.method2652(), this.field797.method2663(0), (byte) 76);
                    this.method2334((byte) 123);
                    this.method527(10);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "(I)V", line = 559)
    public final void method485(int arg0) {
        this.field790.SetAmbient(this.field5491 * this.field5446, this.field5512 * this.field5491, this.field5491 * this.field5481, 0.0F);
        this.field792 = false;
        if (arg0 < 34) {
            this.method507(52, null);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "(IZ)V", line = 570)
    public final void method486(int arg0, boolean arg1) {
        this.field797.method2661(161, arg1);
        if (arg0 != 3) {
            this.method471(null, -38);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/naa;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ltp;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Ljn;I)V", line = 579)
    private class44(int arg0, int arg1, Canvas arg2, class623 arg3, IDirect3D arg4, IDirect3DDevice arg5, class494 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class212 arg9, class668 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field784 = arg3;
        this.field797 = arg5;
        this.field794 = arg4;
        this.field800 = arg6;
        this.field796 = arg7;
        this.field781 = arg0;
        this.field776 = arg8;
        this.field789 = arg1;
        this.field790 = new class450(this.field784);
        this.field778 = new class450(this.field784);
        this.field786 = new class450(this.field784);
        this.field774 = new PixelBuffer(this.field784);
        this.field793 = new GeometryBuffer(this.field784);
        new GeometryBuffer(this.field784);
        this.field5499 = this.field776.MaxSimultaneousTextures;
        this.field5516 = this.field776.MaxActiveLights <= 0 ? 8 : this.field776.MaxActiveLights;
        this.field791 = (this.field776.TextureCaps & 0x10000) != 0;
        this.field5526 = (this.field776.TextureCaps & 0x800) != 0;
        this.field798 = (this.field776.TextureCaps & 0x4000) != 0;
        this.field5486 = (this.field776.TextureCaps & 0x2000) != 0;
        this.field780 = (this.field776.TextureCaps & 0x2) == 0;
        this.field5509 = this.field5518 > 0 || this.field794.CheckDeviceMultiSampleType(this.field781, this.field789, this.field796.BackBufferFormat, true, 2) == 0;
        this.field787 = new class52[this.field5499];
        this.field782 = new boolean[this.field5499];
        this.field788 = new boolean[this.field5499];
        this.field779 = new int[this.field5499];
        this.field799 = new boolean[this.field5499];
        this.field775 = new boolean[this.field5499];
        this.field797.BeginScene();
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 620)
    public final void method487(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 8 || this.field5264 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field797.EndScene();
            this.method484((byte) 49);
            this.field797.BeginScene();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILdg;)V", line = 645)
    public final void method488(int arg0, class379 arg1) {
        this.method507(-120, arg1);
        if (!this.field782[this.field5484]) {
            this.field797.SetSamplerState(this.field5484, 1, 1);
            this.field782[this.field5484] = true;
        }
        if (!this.field799[this.field5484]) {
            this.field797.SetSamplerState(this.field5484, 2, 1);
            this.field799[this.field5484] = true;
        }
        if (arg0 >= -87) {
            field785 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "C", descriptor = "(I)V", line = 669)
    public final void method489(int arg0) {
        if (arg0 != 2) {
            this.field786 = null;
        }
        this.field797.method2661(27, this.field5523);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;IBIILjagdx/IDirect3D;)Z", line = 681)
    private static final boolean method490(D3DPRESENT_PARAMETERS arg0, int arg1, byte arg2, int arg3, int arg4, IDirect3D arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class448.method2665(arg5.method2645(arg4, var9), true)) {
                return false;
            }
            label84: while (arg1 >= 0) {
                if (arg1 != 1) {
                    var8 = arg1;
                    for (int var10 = 0; var10 < field785.length; var10++) {
                        if (arg5.CheckDeviceType(arg4, arg3, var9.Format, field785[var10], true) == 0 && arg5.CheckDeviceFormat(arg4, arg3, var9.Format, 1, 1, field785[var10]) == 0 && (arg1 == 0 || arg5.CheckDeviceMultiSampleType(arg4, arg3, field785[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field777.length; var11++) {
                                if (arg5.CheckDeviceFormat(arg4, arg3, var9.Format, 2, 1, field777[var11]) == 0 && arg5.CheckDepthStencilMatch(arg4, arg3, var9.Format, field785[var10], field777[var11]) == 0 && (arg1 == 0 || arg5.CheckDeviceMultiSampleType(arg4, arg3, field777[var10], true, var8) == 0)) {
                                    var6 = field777[var11];
                                    var7 = field785[var10];
                                    break label84;
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
            arg0.BackBufferFormat = var7;
            arg0.MultiSampleQuality = 0;
            arg0.AutoDepthStencilFormat = var6;
            arg0.MultiSampleType = var8;
            if (arg2 <= 115) {
                method523(null, -115);
            }
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(FFF)V", line = 785)
    public final void method255(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V", line = 789)
    public final synchronized void method263(int arg0) {
        this.field784.method3592(25632);
        super.method263(arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lvn;B)V", line = 797)
    public final void method491(class284 arg0, byte arg1) {
        this.method507(-127, arg0);
        if (arg0.field3852 != this.field782[this.field5484]) {
            this.field797.SetSamplerState(this.field5484, 1, arg0.field3852 ? 1 : 3);
            this.field782[this.field5484] = arg0.field3852;
        }
        if (this.field799[this.field5484] != arg0.field3854) {
            this.field797.SetSamplerState(this.field5484, 2, arg0.field3854 ? 1 : 3);
            this.field799[this.field5484] = arg0.field3854;
        }
        if (arg1 <= 73) {
            this.method497((byte) -106);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lfca;ILbv;)Z", line = 820)
    public final boolean method492(class75 arg0, int arg1, class279 arg2) {
        if (arg1 != 8) {
            this.method313(null, null, -1.0344466F, null);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class448.method2666((byte) -66, this.field794.method2645(this.field781, var4)) && class448.method2666((byte) 13, this.field794.CheckDeviceFormat(this.field781, this.field789, var4.Format, 0, 4, method529(true, arg0, arg2)));
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IILel;)V", line = 834)
    public final void method493(int arg0, int arg1, class508 arg2) {
        class98 var4 = (class98) arg2;
        this.field797.SetStreamSource(arg1, var4.field1319, arg0, var4.method743((byte) -86));
    }

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "(I)V", line = 847)
    public final void method494(int arg0) {
        float var2 = this.field5537 ? this.field5507 : 0.0F;
        float var3 = this.field5537 ? -this.field5462 : 0.0F;
        this.field790.SetDiffuse(this.field5446 * var2, this.field5512 * var2, this.field5481 * var2, 0.0F);
        if (arg0 != 8) {
            this.method488(-11, null);
        }
        this.field778.SetDiffuse(this.field5446 * var3, this.field5512 * var3, this.field5481 * var3, 0.0F);
        this.field792 = false;
    }

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "(B)V", line = 863)
    public final void method495(byte arg0) {
        this.field5468 = (this.field5535 - this.field5480);
        this.field5488 = this.field5468 - (float) this.field5449;
        if ((float) this.field5506 > this.field5488) {
            this.field5488 = this.field5506;
        }
        this.field797.method2660(36, this.field5488);
        if (arg0 == 51) {
            this.field797.method2660(37, this.field5468);
            this.field797.SetRenderState(34, this.field5471);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILfca;BILbv;)Lco;", line = 880)
    public final class103 method496(int arg0, class75 arg1, byte arg2, int arg3, class279 arg4) {
        if (arg2 != -83) {
            this.field781 = 78;
        }
        return new class284(this, arg1, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "(B)V", line = 893)
    public final void method497(byte arg0) {
        this.field797.SetTransform(3, this.field5452);
        int var2 = -53 % ((arg0 - 7) / 41);
    }

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "(II)V", line = 905)
    public final void method498(int arg0, int arg1) {
        this.field797.SetTextureStageState(this.field5484, 11, arg1);
        if (arg0 != 1) {
            this.field776 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "ya", descriptor = "()V", line = 916)
    public final void method246() {
        this.method2306(4345, true);
        this.field797.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V", line = 925)
    public final void method499(byte arg0) {
        int var2 = -125 / ((arg0 + 36) / 50);
        this.field790.SetDirection(-this.field5520[0], -this.field5520[1], -this.field5520[2]);
        this.field778.SetDirection(-this.field5440[0], -this.field5440[1], -this.field5440[2]);
        this.field792 = false;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BILfca;III)Lck;", line = 935)
    public final class593 method500(byte[] arg0, int arg1, class75 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 1) {
            this.field786 = null;
        }
        return new class379(this, arg2, arg4, arg3, arg5, arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lfw;I)I", line = 945)
    private static final int method501(class52 arg0, int arg1) {
        if (arg1 >= -93) {
            method501(null, -81);
        }
        if (class151.field1872 == arg0) {
            return 2;
        } else if (class512.field7495 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "()V", line = 964)
    public final void method321() {
    }

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "(Z)V", line = 967)
    public final void method502(boolean arg0) {
        if (!arg0) {
            this.method296(false);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lgga;I)I", line = 976)
    private static final int method503(class265 arg0, int arg1) {
        if (class231.field3011 == arg0) {
            return 2;
        } else if (class652.field9230 == arg0) {
            return 4;
        } else if (class442.field6300 == arg0) {
            return 26;
        } else if (class698.field9875 == arg0) {
            return 7;
        } else if (class603.field8698 == arg0) {
            return 10;
        } else {
            int var2 = 21 % ((arg1 + 88) / 33);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B[Lmm;)Lfj;", line = 1006)
    public final class607 method504(byte arg0, class253[] arg1) {
        return arg0 < 22 ? (class607) null : new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(Z)V", line = 1016)
    public final void method505(boolean arg0) {
        this.field797.SetScissorRect(this.field5455 + this.field5527, this.field5517 + this.field5472, this.field5439, this.field5510);
        if (arg0) {
            this.method479(95, -88);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "(I)V", line = 1029)
    public final void method506(int arg0) {
        if (arg0 <= 24) {
            this.field776 = null;
        }
        int var2 = this.field788[this.field5484] ? method503(this.field5508[this.field5484], 50) : 1;
        this.field797.SetTextureStageState(this.field5484, 4, var2);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILqea;)V", line = 1046)
    public final void method507(int arg0, class111 arg1) {
        this.field797.SetTexture(this.field5484, arg1.method799(-25567));
        if (this.field787[this.field5484] != arg1.field1427) {
            int var3 = method501(arg1.field1427, -102);
            this.field797.SetSamplerState(this.field5484, 6, var3);
            this.field797.SetSamplerState(this.field5484, 5, var3);
            this.field787[this.field5484] = arg1.field1427;
            if (this.field775[this.field5484] != arg1.field1426) {
                this.field797.SetSamplerState(this.field5484, 7, arg1.field1426 ? method501(arg1.field1427, -96) : 0);
                this.field775[this.field5484] = arg1.field1426;
            }
        } else if (this.field775[this.field5484] != arg1.field1426) {
            this.field797.SetSamplerState(this.field5484, 7, arg1.field1426 ? method501(arg1.field1427, -112) : 0);
            this.field775[this.field5484] = arg1.field1426;
        }
        if (!this.field788[this.field5484]) {
            this.field788[this.field5484] = true;
            this.method506(79);
            this.method466((byte) 122);
        }
        if (arg0 > -84) {
            this.method468(-34);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIILqf;)V", line = 1088)
    public final void method508(int arg0, int arg1, int arg2, class632 arg3) {
        this.field797.DrawPrimitive(method518(arg3, (byte) -40), arg2, arg1);
        if (arg0 != 0) {
            this.method484((byte) 23);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "(I)V", line = 1102)
    public final void method509(int arg0) {
        if (class328.field4373 == this.field5511) {
            this.field797.SetRenderState(19, 5);
            this.field797.SetRenderState(20, 6);
        } else if (class56.field892 == this.field5511) {
            this.field797.SetRenderState(19, 2);
            this.field797.SetRenderState(20, 2);
        } else if (class115.field1497 == this.field5511) {
            this.field797.SetRenderState(19, 9);
            this.field797.SetRenderState(20, 2);
        }
        if (arg0 > -62) {
            this.field798 = true;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Luf;I)I", line = 1132)
    private static final int method510(class414 arg0, int arg1) {
        if (class519.field7612 == arg0) {
            return 2;
        } else if (class366.field4928 == arg0) {
            return 0;
        } else if (class141.field1760 == arg0) {
            return 1;
        } else if (class308.field4083 == arg0) {
            return 3;
        } else {
            int var2 = 96 / ((-arg1 - 43) / 61);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lfca;III[FIIZ)Lco;", line = 1157)
    public final class103 method511(class75 arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, boolean arg7) {
        if (arg1 != 0) {
            this.method471(null, -1);
        }
        return null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZIILuf;Z)V", line = 1169)
    public final void method512(boolean arg0, int arg1, int arg2, class414 arg3, boolean arg4) {
        int var6 = 0;
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg2 != 9494) {
            return;
        }
        if (arg0) {
            var6 |= 0x20;
        }
        if (arg4) {
            var6 |= 0x10;
        }
        this.field797.SetTextureStageState(this.field5484, var8, var6 | method510(arg3, 18));
    }

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "(Z)V", line = 1219)
    public final void method513(boolean arg0) {
        this.field797.SetRenderState(60, this.field5469);
        if (arg0) {
            this.method246();
        }
    }

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "()V", line = 1228)
    public final void method283() {
    }

    @OriginalMember(owner = "client!kaa", name = "H", descriptor = "(I)F", line = 1232)
    public final float method514(int arg0) {
        if (arg0 != 1) {
            this.field792 = false;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1242)
    public final void method515(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 14) {
            this.field790 = null;
        }
        this.field800 = (class494) arg2;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(BZ)Lel;", line = 1252)
    public final class508 method516(byte arg0, boolean arg1) {
        return arg0 <= 50 ? (class508) null : new class98(this, arg1);
    }

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "()Z", line = 1266)
    public final boolean method299() {
        return false;
    }

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "(B)V", line = 1273)
    public final void method517(byte arg0) {
        if (arg0 == -49) {
            this.method494(arg0 ^ 0xFFFFFFC7);
            this.method526(arg0 ^ 0xFFFFEC84);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Ljn;Ljava/lang/Integer;)Lr;", line = 1285)
    public static final class165 createToolkit(Canvas arg0, class212 arg1, class668 arg2, Integer arg3) {
        class44 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class623 var7 = new class623();
            IDirect3D var8 = IDirect3D.method2644(-2147483616, var7);
            D3DCAPS var9 = var8.method2646(var5, var6);
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
                if (!method490(var10, arg3, (byte) 126, var6, var5, var8)) {
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
                    var13 = var8.method2642(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class449 var17) {
                    var13 = var8.method2642(var5, var6, arg0, var11 | 0x20, var10);
                }
                class494 var15 = new class494(var13.method2663(0), var13.method2652());
                var4 = new class44(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2336(6);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method286();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lqf;B)I", line = 1387)
    private static final int method518(class632 arg0, byte arg1) {
        if (arg1 >= -24) {
            field777 = null;
        }
        if (class589.field8536 == arg0) {
            return 2;
        } else if (class208.field2539 == arg0) {
            return 3;
        } else if (class77.field1133 == arg0) {
            return 1;
        } else if (class73.field1094 == arg0) {
            return 4;
        } else if (class290.field3934 == arg0) {
            return 6;
        } else if (class231.field3003 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kaa", name = "N", descriptor = "(I)V", line = 1421)
    public final void method519(int arg0) {
        if (arg0 > -119) {
            this.field788 = null;
        }
        this.field797.method2661(7, this.field5500);
    }

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "(B)V", line = 1431)
    public final void method520(byte arg0) {
        this.field797.method2661(15, this.field5473);
        int var2 = -76 % ((arg0 - 30) / 60);
    }

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "()V", line = 1439)
    public final void method250() {
    }

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "(I)V", line = 1442)
    public final void method521(int arg0) {
        this.field797.SetViewport(this.field5455, this.field5472, this.field5407, this.field5291, 0.0F, 1.0F);
        if (arg0 <= 8) {
            this.method480(null, 97);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 1453)
    public final Object method522(int arg0, Canvas arg1) {
        int var3 = 4 / ((38 - arg0) / 44);
        return null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lvg;I)I", line = 1462)
    private static final int method523(class49 arg0, int arg1) {
        if (arg1 != 16) {
            return -35;
        } else if (class592.field8574 == arg0) {
            return 1;
        } else if (class148.field1809 == arg0) {
            return 2;
        } else if (class405.field5718 == arg0) {
            return 3;
        } else if (class582.field8475 == arg0) {
            return 4;
        } else if (class99.field1328 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "C", descriptor = "(B)V", line = 1491)
    public final void method524(byte arg0) {
        if (this.field5447[this.field5484] == class281.field3811) {
            this.field797.SetTextureStageState(this.field5484, 24, 0);
            this.field779[this.field5484] = 0;
        } else {
            if (this.field5447[this.field5484] == class582.field8475) {
                this.field797.SetTransform(this.field5484 + 16, this.field5450[this.field5484].method3703(3, field795));
            } else {
                this.field797.SetTransform(this.field5484 + 16, this.field5450[this.field5484].method3686(true, field795));
            }
            int var2 = method523(this.field5447[this.field5484], arg0 ^ 0xFFFFFFB7);
            if (this.field779[this.field5484] != var2) {
                this.field797.SetTextureStageState(this.field5484, 24, var2);
                this.field779[this.field5484] = var2;
            }
        }
        if (arg0 != -89) {
            this.method508(-69, -4, 43, null);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([IIIIIZI)Lco;", line = 1523)
    public final class103 method525(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        return arg1 == 1 ? new class284(this, arg6, arg3, arg5, arg0, arg4, arg2) : (class103) null;
    }

    @OriginalMember(owner = "client!kaa", name = "M", descriptor = "(I)V", line = 1534)
    public final void method526(int arg0) {
        if (arg0 != 4939 || this.field792) {
            return;
        }
        this.field797.LightEnable(0, false);
        this.field797.LightEnable(1, false);
        this.field797.SetLight(0, this.field790);
        this.field797.SetLight(1, this.field778);
        this.field797.LightEnable(0, true);
        this.field797.LightEnable(1, true);
        this.field792 = true;
    }

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "(I)V", line = 1556)
    public final void method527(int arg0) {
        for (int var2 = 0; var2 < this.field5499; var2++) {
            this.field797.SetSamplerState(var2, 7, 0);
            this.field797.SetSamplerState(var2, 6, 2);
            this.field797.SetSamplerState(var2, 5, 2);
            this.field797.SetSamplerState(var2, 1, 1);
            this.field797.SetSamplerState(var2, 2, 1);
            this.field787[var2] = class151.field1872;
            this.field782[var2] = this.field799[var2] = true;
            this.field775[var2] = false;
            this.field779[var2] = 0;
        }
        this.field797.SetTextureStageState(0, 6, 1);
        this.field797.SetRenderState(9, 2);
        this.field797.SetRenderState(23, 4);
        this.field797.SetRenderState(25, 5);
        this.field797.SetRenderState(24, 0);
        this.field797.SetRenderState(22, 2);
        this.field797.SetRenderState(147, 1);
        this.field797.SetRenderState(145, 1);
        this.field797.method2660(38, 0.95F);
        this.field797.SetRenderState(140, 3);
        this.field790.SetType(3);
        this.field778.SetType(3);
        this.field786.SetType(1);
        this.field792 = false;
        super.method527(arg0);
    }

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "()V", line = 1591)
    public final void method227() {
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILqf;IIILcda;B)V", line = 1599)
    public final void method528(int arg0, class632 arg1, int arg2, int arg3, int arg4, class154 arg5, byte arg6) {
        this.field797.SetIndices(((class3) arg5).field14);
        if (arg6 >= 117) {
            this.field797.DrawIndexedPrimitive(method518(arg1, (byte) -123), 0, arg3, arg4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZLfca;Lbv;)I", line = 1617)
    public static final int method529(boolean arg0, class75 arg1, class279 arg2) {
        if (class279.field3793 == arg2) {
            if (class666.field9494 == arg1) {
                return 22;
            }
            if (class391.field5229 == arg1) {
                return 21;
            }
            if (class384.field5117 == arg1) {
                return 28;
            }
            if (class702.field9917 == arg1) {
                return 50;
            }
            if (class426.field6122 == arg1) {
                return 51;
            }
            if (class438.field6259 == arg1) {
                return 77;
            }
        }
        if (!arg0) {
            method503(null, 76);
        }
        throw new IllegalArgumentException("");
    }
}
