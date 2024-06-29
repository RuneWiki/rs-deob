import jaclib.peer.class622;
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

@OriginalClass("client!eda")
public class class561 extends class344 {

    @OriginalMember(owner = "client!eda", name = "Ng", descriptor = "I")
    private int field8025 = 0;

    @OriginalMember(owner = "client!eda", name = "Dg", descriptor = "Z")
    private boolean field8015 = false;

    @OriginalMember(owner = "client!eda", name = "Kg", descriptor = "Laca;")
    private class135 field8022;

    @OriginalMember(owner = "client!eda", name = "Gg", descriptor = "Ljaclib/peer/tc;")
    public class622 field8018;

    @OriginalMember(owner = "client!eda", name = "Hg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8019;

    @OriginalMember(owner = "client!eda", name = "Ig", descriptor = "I")
    private int field8020;

    @OriginalMember(owner = "client!eda", name = "Jg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8021;

    @OriginalMember(owner = "client!eda", name = "Lg", descriptor = "I")
    private int field8023;

    @OriginalMember(owner = "client!eda", name = "Bg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8013;

    @OriginalMember(owner = "client!eda", name = "Fg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8017;

    @OriginalMember(owner = "client!eda", name = "sg", descriptor = "Ljagdx/D3DLIGHT;")
    private class437 field8004;

    @OriginalMember(owner = "client!eda", name = "tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class437 field8005;

    @OriginalMember(owner = "client!eda", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class437 field8029;

    @OriginalMember(owner = "client!eda", name = "yg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8010;

    @OriginalMember(owner = "client!eda", name = "rg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8003;

    @OriginalMember(owner = "client!eda", name = "vg", descriptor = "Z")
    public boolean field8007;

    @OriginalMember(owner = "client!eda", name = "zg", descriptor = "Z")
    public boolean field8011;

    @OriginalMember(owner = "client!eda", name = "Mg", descriptor = "Z")
    public boolean field8024;

    @OriginalMember(owner = "client!eda", name = "wg", descriptor = "[Ldj;")
    private class197[] field8008;

    @OriginalMember(owner = "client!eda", name = "Qg", descriptor = "[Z")
    private boolean[] field8028;

    @OriginalMember(owner = "client!eda", name = "Og", descriptor = "[I")
    private int[] field8026;

    @OriginalMember(owner = "client!eda", name = "xg", descriptor = "[Z")
    private boolean[] field8009;

    @OriginalMember(owner = "client!eda", name = "Eg", descriptor = "[Z")
    private boolean[] field8016;

    @OriginalMember(owner = "client!eda", name = "Ag", descriptor = "[Z")
    private boolean[] field8012;

    @OriginalMember(owner = "client!eda", name = "Cg", descriptor = "[I")
    private static int[] field8014 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!eda", name = "Pg", descriptor = "[F")
    private static float[] field8027 = new float[16];

    @OriginalMember(owner = "client!eda", name = "ug", descriptor = "[I")
    private static int[] field8006 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public final Object method1298(Canvas arg0, byte arg1) {
        if (arg1 >= -81) {
            this.field8013 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/tc;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Laca;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Ltf;I)V")
    private class561(int arg0, int arg1, Canvas arg2, class622 arg3, IDirect3D arg4, IDirect3DDevice arg5, class135 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class524 arg9, class701 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field8022 = arg6;
        this.field8018 = arg3;
        this.field8019 = arg7;
        this.field8020 = arg1;
        this.field8021 = arg5;
        this.field8023 = arg0;
        this.field8013 = arg4;
        this.field8017 = arg8;
        this.field8004 = new class437(this.field8018);
        this.field8005 = new class437(this.field8018);
        this.field8029 = new class437(this.field8018);
        this.field8010 = new PixelBuffer(this.field8018);
        this.field8003 = new GeometryBuffer(this.field8018);
        new GeometryBuffer(this.field8018);
        this.field8007 = (this.field8017.TextureCaps & 0x4000) != 0;
        this.field4613 = (this.field8017.TextureCaps & 0x800) != 0;
        this.field8011 = (this.field8017.TextureCaps & 0x2) == 0;
        this.field4571 = this.field8017.MaxActiveLights > 0 ? this.field8017.MaxActiveLights : 8;
        this.field4520 = (this.field8017.TextureCaps & 0x2000) != 0;
        this.field4612 = this.field8017.MaxSimultaneousTextures;
        this.field8024 = (this.field8017.TextureCaps & 0x10000) != 0;
        this.field4521 = this.field4561 > 0 || this.field8013.CheckDeviceMultiSampleType(this.field8023, this.field8020, this.field8019.BackBufferFormat, true, 2) == 0;
        this.field8008 = new class197[this.field4612];
        this.field8028 = new boolean[this.field4612];
        this.field8026 = new int[this.field4612];
        this.field8009 = new boolean[this.field4612];
        this.field8016 = new boolean[this.field4612];
        this.field8012 = new boolean[this.field4612];
        this.field8021.BeginScene();
    }

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "(IIII)[I")
    public final int[] method944(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8021.method2535(0);
        IDirect3DSurface var7 = this.field8021.method2529(arg2, arg3, 21, 0, 0, true);
        if (class439.method2511((byte) 35, this.field8021.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class439.method2511((byte) 35, var7.LockRect(0, 0, arg2, arg3, 0, this.field8010))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8010.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field8010.method2508(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8010.method2508(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3483(-127);
        var7.method3483(-127);
        return var5;
    }

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "()Laj;")
    public final class286 method1037() {
        D3DADAPTER_IDENTIFIER var1 = this.field8013.method2517(this.field8023, 0);
        return new class286(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLbs;)I")
    private static final int method3181(byte arg0, class215 arg1) {
        if (class418.field5588 == arg1) {
            return 2;
        } else if (class286.field3572 == arg1) {
            return 3;
        } else if (class613.field8631 == arg1) {
            return 1;
        } else if (class538.field7582 == arg1) {
            return 4;
        } else if (class25.field218 == arg1) {
            return 6;
        } else if (class636.field8953 == arg1) {
            return 5;
        } else {
            if (arg0 != -122) {
                field8006 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "(Z)V")
    public final void method1296(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field4549 = (this.field4599 - this.field4566);
        this.field4550 = this.field4549 - (float) this.field4536;
        if (this.field4550 < (float) this.field4533) {
            this.field4550 = this.field4533;
        }
        this.field8021.method2532(36, this.field4550);
        this.field8021.method2532(37, this.field4549);
        this.field8021.SetRenderState(34, this.field4565);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZ[[IB)Lica;")
    public final class219 method1321(int arg0, boolean arg1, int[][] arg2, byte arg3) {
        return arg3 == 52 ? new class451(this, arg0, arg1, arg2) : (class219) null;
    }

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "(I)V")
    public final void method1331(int arg0) {
        float var2 = this.field4574 ? this.field4602 : 0.0F;
        if (arg0 > -27) {
            this.method1335(null, (byte) 100);
        }
        float var3 = this.field4574 ? -this.field4593 : 0.0F;
        this.field8004.SetDiffuse(this.field4589 * var2, this.field4526 * var2, this.field4572 * var2, 0.0F);
        this.field8005.SetDiffuse(this.field4589 * var3, this.field4526 * var3, this.field4572 * var3, 0.0F);
        this.field8015 = false;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZZZLgb;)V")
    public final void method1328(int arg0, boolean arg1, boolean arg2, boolean arg3, class163 arg4) {
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg2) {
            var8 |= 0x20;
        }
        if (arg1) {
            var8 |= 0x10;
        }
        this.field8021.SetTextureStageState(this.field4579, var7, method3184(arg4, arg3) | var8);
    }

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "(I)V")
    public final void method1307(int arg0) {
        int var2 = 0;
        if (arg0 <= 60) {
            this.field8021 = null;
        }
        while (this.field4542 > var2) {
            class670 var3 = this.field4606[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3710(false);
            float var6 = var3.method3704((byte) -94) / 255.0F;
            this.field8029.SetPosition((float) var3.method3711(1795643394), (float) var3.method3703((byte) -29), (float) var3.method3706((byte) 119));
            this.field8029.SetDiffuse((float) ((var5 & 0xFF80BD) >> 16) * var6, (float) ((var5 & 0xFFDF) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8029.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3708((byte) 83) * var3.method3708((byte) 83)));
            this.field8029.SetRange((float) var3.method3708((byte) 83));
            this.field8021.SetLight(var4, this.field8029);
            this.field8021.LightEnable(var4, true);
            var2++;
        }
        while (this.field4603 > var2) {
            this.field8021.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1307(69);
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(Z)V")
    public final void method1332(boolean arg0) {
        if (arg0) {
            this.field8021.method2521(15, this.field4539);
        }
    }

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "()V")
    public final void method979() throws class20 {
        this.field8021.EndScene();
        if (this.field8022.method761((byte) 120)) {
            this.field8025 = 0;
            if (class439.method2512(this.field8022.method762((byte) -127, 0), 0)) {
                this.method3187(88);
            }
        } else if ((++this.field8025) <= 50) {
            this.method3187(97);
        } else {
            throw new class20();
        }
        this.field8021.BeginScene();
    }

    @OriginalMember(owner = "client!eda", name = "T", descriptor = "(I)V")
    public final void method1330(int arg0) {
        if (arg0 > -15) {
            this.field8028 = null;
        }
        if (class376.field5109 == this.field4598) {
            this.field8021.SetRenderState(19, 5);
            this.field8021.SetRenderState(20, 6);
        } else if (class162.field1814 == this.field4598) {
            this.field8021.SetRenderState(19, 2);
            this.field8021.SetRenderState(20, 2);
        } else if (class554.field7918 == this.field4598) {
            this.field8021.SetRenderState(19, 9);
            this.field8021.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lsu;II)V")
    public final void method1281(class155 arg0, int arg1, int arg2) {
        if (arg2 < 98) {
            this.field8018 = null;
        }
        class67 var4 = (class67) arg0;
        this.field8021.SetStreamSource(arg1, var4.field673, 0, var4.method356((byte) 72));
    }

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "(I)V")
    public final void method1306(int arg0) {
        if (arg0 == 0) {
            this.field8021.method2521(7, this.field4592);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBI[BILsq;)Ln;")
    public final class514 method1290(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, class485 arg5) {
        if (arg1 < 116) {
            this.method1335(null, (byte) 4);
        }
        return new class350(this, arg5, arg0, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(FFF)V")
    public final void method975(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "(B)V")
    public final void method1311(byte arg0) {
        if (arg0 == 8) {
            this.field8021.method2521(14, this.field4531 && this.field4532);
        }
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(Z)V")
    public final void method1333(boolean arg0) {
        for (int var2 = 0; var2 < this.field4612; var2++) {
            this.field8021.SetSamplerState(var2, 7, 0);
            this.field8021.SetSamplerState(var2, 6, 2);
            this.field8021.SetSamplerState(var2, 5, 2);
            this.field8021.SetSamplerState(var2, 1, 1);
            this.field8021.SetSamplerState(var2, 2, 1);
            this.field8008[var2] = class377.field5117;
            this.field8009[var2] = this.field8016[var2] = true;
            this.field8028[var2] = false;
            this.field8026[var2] = 0;
        }
        this.field8021.SetTextureStageState(0, 6, 1);
        this.field8021.SetRenderState(9, 2);
        this.field8021.SetRenderState(23, 4);
        this.field8021.SetRenderState(25, 5);
        this.field8021.SetRenderState(24, 0);
        this.field8021.SetRenderState(22, 2);
        this.field8021.SetRenderState(147, 1);
        this.field8021.SetRenderState(145, 1);
        this.field8021.method2532(38, 0.95F);
        this.field8021.SetRenderState(140, 3);
        this.field8004.SetType(3);
        this.field8005.SetType(3);
        this.field8029.SetType(1);
        this.field8015 = false;
        super.method1333(arg0);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ldj;I)I")
    private static final int method3182(class197 arg0, int arg1) {
        if (arg1 != 1) {
            field8014 = null;
        }
        if (class377.field5117 == arg0) {
            return 2;
        } else if (class401.field5388 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lal;B)V")
    public final void method1335(class307 arg0, byte arg1) {
        int var3 = 0;
        if (arg1 >= -60) {
            return;
        }
        if (class73.field764 == arg0) {
            var3 = 65536;
        } else if (class107.field1160 == arg0) {
            var3 = 131072;
        } else if (class102.field1107 == arg0) {
            var3 = 196608;
        }
        this.field8021.SetTextureStageState(this.field4579, 11, var3 | this.field4579);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)Lnm;")
    public final class369 method1316(int arg0, byte arg1) {
        if (arg1 < 7) {
            this.field8022 = null;
        }
        if (arg0 == 3) {
            return new class10(this, this.field4380);
        } else if (arg0 == 4) {
            return new class565(this, this.field4380, this.field4413);
        } else if (arg0 == 8) {
            return new class1(this, this.field4380, this.field4413);
        } else {
            return super.method1316(arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ldh;B)V")
    public final void method3183(class350 arg0, byte arg1) {
        int var3 = 60 / ((arg1 - 55) / 59);
        this.method3189(140, arg0);
        if (!this.field8009[this.field4579]) {
            this.field8021.SetSamplerState(this.field4579, 1, 1);
            this.field8009[this.field4579] = true;
        }
        if (!this.field8016[this.field4579]) {
            this.field8021.SetSamplerState(this.field4579, 2, 1);
            this.field8016[this.field4579] = true;
        }
    }

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "()V")
    public final void method967() {
    }

    @OriginalMember(owner = "client!eda", name = "DA", descriptor = "()I")
    public final int method1021() {
        return 0;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lgb;Z)I")
    private static final int method3184(class163 arg0, boolean arg1) {
        if (!arg1) {
            field8014 = null;
        }
        if (class304.field3769 == arg0) {
            return 2;
        } else if (class590.field8337 == arg0) {
            return 0;
        } else if (class692.field9717 == arg0) {
            return 1;
        } else if (class107.field1154 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZ)Lmda;")
    public final class17 method1326(int arg0, boolean arg1) {
        if (arg0 > -46) {
            this.field8011 = true;
        }
        return new class690(this, class179.field2009, arg1);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILtw;)V")
    public final void method3185(int arg0, class586 arg1) {
        int var3 = -113 % ((arg0 - 56) / 34);
        this.method3189(140, arg1);
        if (arg1.field8309 != this.field8009[this.field4579]) {
            this.field8021.SetSamplerState(this.field4579, 1, arg1.field8309 ? 1 : 3);
            this.field8009[this.field4579] = arg1.field8309;
        }
        if (arg1.field8312 != this.field8016[this.field4579]) {
            this.field8021.SetSamplerState(this.field4579, 2, arg1.field8312 ? 1 : 3);
            this.field8016[this.field4579] = arg1.field8312;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLsea;)I")
    private static final int method3186(byte arg0, class319 arg1) {
        if (arg0 != -38) {
            field8027 = null;
        }
        if (class428.field6081 == arg1) {
            return 2;
        } else if (class250.field3133 == arg1) {
            return 4;
        } else if (class239.field2967 == arg1) {
            return 26;
        } else if (class644.field9099 == arg1) {
            return 7;
        } else if (class36.field371 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lbs;IZI)V")
    public final void method1291(class215 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field8021 = null;
        }
        this.field8021.DrawPrimitive(method3181((byte) -122, arg0), arg1, arg3);
    }

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "()Z")
    public final boolean method1044() {
        return false;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIILrt;Lsq;)Lpm;")
    public final class134 method1319(int arg0, int arg1, int arg2, class179 arg3, class485 arg4) {
        int var6 = 80 % ((43 - arg2) / 38);
        return new class586(this, arg4, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lrt;Lsq;B)Z")
    public final boolean method1287(class179 arg0, class485 arg1, byte arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 <= 123) {
            this.field8018 = null;
        }
        return class439.method2511((byte) 35, this.field8013.method2513(this.field8023, var4)) && class439.method2511((byte) 35, this.field8013.CheckDeviceFormat(this.field8023, this.field8020, var4.Format, 0, 4, method3188(arg1, false, arg0)));
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "()V")
    public final void method1011() {
    }

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "(II)V")
    public final void method1280(int arg0, int arg1) {
        this.field8021.SetTextureStageState(this.field4579, 11, arg0);
        if (arg1 != 1) {
            this.field8004 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "gb", descriptor = "(I)Z")
    private final boolean method3187(int arg0) {
        if (arg0 <= 39) {
            return true;
        }
        int var2 = this.field8021.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class135 var3 = (class135) this.field4498;
            this.method2045(-118);
            var3.method760(-37);
            this.field8019.BackBufferWidth = 0;
            this.field8019.BackBufferHeight = 0;
            if (method3191(this.field8020, this.field8019, -51, this.field8013, this.field8023, this.field4561)) {
                int var4 = this.field8021.Reset(this.field8019);
                if (class439.method2511((byte) 35, var4)) {
                    var3.method763(this.field8021.method2523(0), this.field8021.method2522(), 27);
                    this.method1996(-3953);
                    this.method1333(true);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "(I)V")
    public final void method1284(int arg0) {
        if (arg0 >= -17 || this.field8015) {
            return;
        }
        this.field8021.LightEnable(0, false);
        this.field8021.LightEnable(1, false);
        this.field8021.SetLight(0, this.field8004);
        this.field8021.SetLight(1, this.field8005);
        this.field8021.LightEnable(0, true);
        this.field8021.LightEnable(1, true);
        this.field8015 = true;
    }

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "(Z)V")
    public final void method1317(boolean arg0) {
        this.method1331(-99);
        if (arg0) {
            this.field8025 = -9;
        }
        this.method1284(-35);
    }

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "()V")
    public final void method1045() {
    }

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "(B)V")
    public final void method1309(byte arg0) {
        if (arg0 < 33) {
            this.method1276(18, 12, -76, true, null, null, 84);
        }
        this.field8021.method2521(28, this.field4588 && this.field4575 && this.field4536 >= 0);
    }

    @OriginalMember(owner = "client!eda", name = "x", descriptor = "()V")
    public final void method1049() {
    }

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "()Z")
    public final boolean method977() {
        return false;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "([BIZIIILsq;I)Lpm;")
    public final class134 method1313(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7) {
        if (arg1 != 2) {
            this.field8016 = null;
        }
        return new class586(this, arg6, arg3, arg4, arg2, arg0, arg5, arg7);
    }

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "(B)V")
    public final void method1308(byte arg0) {
        if (this.field4529.method213(-113)) {
            this.field4513.method3016(field8027, (byte) -100);
        } else {
            field8027[11] = 0.0F;
            field8027[12] = 0.0F;
            field8027[8] = 0.0F;
            field8027[5] = 1.0F;
            field8027[14] = 0.0F;
            field8027[7] = 0.0F;
            field8027[13] = 0.0F;
            field8027[9] = 0.0F;
            field8027[3] = 0.0F;
            field8027[10] = 1.0F;
            field8027[1] = 0.0F;
            field8027[4] = 0.0F;
            field8027[6] = 0.0F;
            field8027[15] = 1.0F;
            field8027[0] = 1.0F;
            field8027[2] = 0.0F;
        }
        if (arg0 >= 97) {
            this.field8021.SetTransform(2, field8027);
        }
    }

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)V")
    public final synchronized void method948(int arg0) {
        this.field8018.method3488(-21326);
        super.method948(arg0);
    }

    @OriginalMember(owner = "client!eda", name = "ja", descriptor = "(I)V")
    public final void method1002(int arg0) {
        this.field8021.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "(Z)V")
    public final void method1301(boolean arg0) {
        this.field8004.SetDirection(-this.field4563[0], -this.field4563[1], -this.field4563[2]);
        this.field8005.SetDirection(-this.field4541[0], -this.field4541[1], -this.field4541[2]);
        this.field8015 = false;
        if (!arg0) {
            this.method1312(5);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lsq;ZLrt;)I")
    public static final int method3188(class485 arg0, boolean arg1, class179 arg2) {
        if (class179.field2008 == arg2) {
            if (class293.field3663 == arg0) {
                return 22;
            }
            if (class412.field5529 == arg0) {
                return 21;
            }
            if (class274.field3431 == arg0) {
                return 28;
            }
            if (class379.field5140 == arg0) {
                return 50;
            }
            if (class363.field4868 == arg0) {
                return 51;
            }
            if (class496.field7182 == arg0) {
                return 77;
            }
        }
        if (arg1) {
            method3184(null, true);
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(ZB)V")
    public final void method1278(boolean arg0, byte arg1) {
        this.field8021.method2521(161, arg0);
        if (arg1 != -109) {
            this.field8003 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILsq;IZII[F)Lpm;")
    public final class134 method1295(int arg0, int arg1, class485 arg2, int arg3, boolean arg4, int arg5, int arg6, float[] arg7) {
        if (arg1 != -27701) {
            this.field8023 = -103;
        }
        return null;
    }

    @OriginalMember(owner = "client!eda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Ltf;Ljava/lang/Integer;)Lr;")
    public static final class564 createToolkit(Canvas arg0, class524 arg1, class701 arg2, Integer arg3) {
        class561 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class622 var7 = new class622();
            IDirect3D var8 = IDirect3D.method2515(-2147483616, var7);
            D3DCAPS var9 = var8.method2516(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x20 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3191(var6, var10, -51, var8, var5, arg3)) {
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
                    var13 = var8.method2514(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class438 var17) {
                    var13 = var8.method2514(var5, var6, arg0, var11 | 0x20, var10);
                }
                class135 var15 = new class135(var13.method2523(0), var13.method2522());
                var4 = new class561(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2017((byte) 59);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method1029();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lgb;IIZ)V")
    public final void method1305(class163 arg0, int arg1, int arg2, boolean arg3) {
        byte var6;
        if (arg2 == 1) {
            var6 = 6;
        } else if (arg2 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        if (arg1 != 14604) {
            this.field8025 = 77;
        }
        int var7 = 0;
        if (arg3) {
            var7 |= 0x10;
        }
        this.field8021.SetTextureStageState(this.field4579, var6, method3184(arg0, true) | var7);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILkfa;)V")
    public final void method3189(int arg0, class582 arg1) {
        this.field8021.SetTexture(this.field4579, arg1.method2075(-8780));
        if (arg0 != 140) {
            return;
        }
        if (this.field8008[this.field4579] != arg1.field8272) {
            int var3 = method3182(arg1.field8272, 1);
            this.field8021.SetSamplerState(this.field4579, 6, var3);
            this.field8021.SetSamplerState(this.field4579, 5, var3);
            this.field8008[this.field4579] = arg1.field8272;
            if (this.field8028[this.field4579] != arg1.field8271) {
                this.field8021.SetSamplerState(this.field4579, 7, arg1.field8271 ? method3182(arg1.field8272, 1) : 0);
                this.field8028[this.field4579] = arg1.field8271;
            }
        } else if (this.field8028[this.field4579] != arg1.field8271) {
            this.field8021.SetSamplerState(this.field4579, 7, arg1.field8271 ? method3182(arg1.field8272, 1) : 0);
            this.field8028[this.field4579] = arg1.field8271;
        }
        if (!this.field8012[this.field4579]) {
            this.field8012[this.field4579] = true;
            this.method1299(-115);
            this.method1323((byte) -70);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILrt;Lsq;)Z")
    public final boolean method1334(int arg0, class179 arg1, class485 arg2) {
        if (arg0 != 1) {
            field8014 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class439.method2511((byte) 35, this.field8013.method2513(this.field8023, var4)) && class439.method2511((byte) 35, this.field8013.CheckDeviceFormat(this.field8023, this.field8020, var4.Format, 0, 3, method3188(arg2, false, arg1)));
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)V")
    public final void method954(boolean arg0) {
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)Lsu;")
    public final class155 method1283(boolean arg0, int arg1) {
        return arg1 == -1 ? new class67(this, arg0) : (class155) null;
    }

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "(Z)V")
    public final void method1336(boolean arg0) {
        this.field8021.SetTransform(3, this.field4562);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!eda", name = "ab", descriptor = "(I)V")
    public final void method1322(int arg0) {
        if (arg0 == 6) {
            this.field8021.method2521(137, this.field4573 && !this.field4535);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lnd;I)I")
    private static final int method3190(class689 arg0, int arg1) {
        if (arg1 != 256) {
            field8027 = null;
        }
        if (class138.field1516 == arg0) {
            return 1;
        } else if (class103.field1120 == arg0) {
            return 2;
        } else if (class631.field8878 == arg0) {
            return 3;
        } else if (class36.field355 == arg0) {
            return 4;
        } else if (class35.field351 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "(B)V")
    public final void method1318(byte arg0) {
        this.field8021.method2521(174, this.field4637);
        int var2 = -28 % ((-arg0 - 3) / 37);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLada;)V")
    public final void method1285(boolean arg0, class278 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (!arg0) {
            this.field8029 = null;
        }
        this.field8021.SetVertexDeclaration(var3.field3490);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIZLbs;Lmda;I)V")
    public final void method1276(int arg0, int arg1, int arg2, boolean arg3, class215 arg4, class17 arg5, int arg6) {
        this.field8021.SetIndices(((class690) arg5).field9708);
        this.field8021.DrawIndexedPrimitive(method3181((byte) -122, arg4), 0, arg6, arg2, arg0, arg1);
        if (arg3) {
            field8014 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Llj;Llj;FLlj;)Llj;")
    public final class60 method959(class60 arg0, class60 arg1, float arg2, class60 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method958(Rectangle[] arg0, int arg1) throws class20 {
        this.method979();
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIII)V")
    public final void method976(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;II)Z")
    private static final boolean method3191(int arg0, D3DPRESENT_PARAMETERS arg1, int arg2, IDirect3D arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class439.method2512(arg3.method2513(arg4, var9), 0)) {
                return false;
            }
            if (arg2 != -51) {
                method3190(null, 6);
            }
            label82: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field8014.length; var10++) {
                        if (arg3.CheckDeviceType(arg4, arg0, var9.Format, field8014[var10], true) == 0 && arg3.CheckDeviceFormat(arg4, arg0, var9.Format, 1, 1, field8014[var10]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg0, field8014[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field8006.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg4, arg0, var9.Format, 2, 1, field8006[var11]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg0, var9.Format, field8014[var10], field8006[var11]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg0, field8006[var10], true, var8) == 0)) {
                                    var6 = field8006[var11];
                                    var7 = field8014[var10];
                                    break label82;
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
            arg1.MultiSampleQuality = 0;
            arg1.MultiSampleType = var8;
            arg1.AutoDepthStencilFormat = var6;
            arg1.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I[Luaa;)Lada;")
    public final class278 method1279(int arg0, class436[] arg1) {
        int var3 = 100 % ((22 - arg0) / 63);
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "(Z)V")
    public final void method1292(boolean arg0) {
        this.field8021.SetViewport(this.field4544, this.field4518, this.field4332, this.field4458, 0.0F, 1.0F);
        if (arg0) {
            this.method1002(90);
        }
    }

    @OriginalMember(owner = "client!eda", name = "A", descriptor = "()V")
    public final void method974() {
        IDirect3DEventQuery var1 = this.field8021.method2533();
        if (class439.method2511((byte) 35, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3483(-127);
    }

    @OriginalMember(owner = "client!eda", name = "A", descriptor = "(I)V")
    public final void method1282(int arg0) {
        if (arg0 != 1) {
            this.method1276(50, 122, 47, true, null, null, -116);
        }
    }

    @OriginalMember(owner = "client!eda", name = "B", descriptor = "(I)V")
    public final void method1293(int arg0) {
        if (arg0 == -25974) {
            this.field8021.SetRenderState(60, this.field4525);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1294(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 1) {
            this.method1306(51);
        }
    }

    @OriginalMember(owner = "client!eda", name = "ya", descriptor = "()V")
    public final void method969() {
        this.method2029(7, true);
        this.field8021.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lf;Z)V")
    public final void method990(class534 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "(B)V")
    public final void method1323(byte arg0) {
        int var2 = this.field8012[this.field4579] ? method3186((byte) -38, this.field4556[this.field4579]) : 1;
        this.field8021.SetTextureStageState(this.field4579, 1, var2);
        if (arg0 != -70) {
            method3182(null, 50);
        }
    }

    @OriginalMember(owner = "client!eda", name = "y", descriptor = "(I)V")
    public final void method1312(int arg0) {
        if (this.field8012[this.field4579]) {
            this.field8012[this.field4579] = false;
            this.field8021.SetTexture(this.field4579, null);
            this.method1299(arg0 ^ 0xFFFFFCD8);
            this.method1323((byte) -70);
        }
        if (arg0 != -867) {
            this.field8011 = true;
        }
    }

    @OriginalMember(owner = "client!eda", name = "x", descriptor = "(I)V")
    public final void method1297(int arg0) {
        this.field8021.method2521(27, this.field4530);
        int var2 = 38 % ((arg0 - 53) / 38);
    }

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "(I)V")
    public final void method1310(int arg0) {
        if (this.field4508) {
            field8027[8] = 0.0F;
            field8027[3] = 0.0F;
            field8027[15] = 1.0F;
            field8027[1] = 0.0F;
            field8027[10] = 1.0F;
            field8027[11] = 0.0F;
            field8027[0] = 1.0F;
            field8027[14] = 0.0F;
            field8027[12] = 0.0F;
            field8027[5] = 1.0F;
            field8027[13] = 0.0F;
            field8027[2] = 0.0F;
            field8027[4] = 0.0F;
            field8027[9] = 0.0F;
            field8027[6] = 0.0F;
            field8027[7] = 0.0F;
        } else {
            this.field4510.method3016(field8027, (byte) -100);
        }
        if (arg0 == 4924) {
            this.field8021.SetTransform(256, field8027);
        }
    }

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "(I)V")
    public final void method1299(int arg0) {
        int var2 = this.field8012[this.field4579] ? method3186((byte) -38, this.field4569[this.field4579]) : 1;
        int var3 = 66 / ((arg0 + 62) / 33);
        this.field8021.SetTextureStageState(this.field4579, 4, var2);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BZIII[II)Lpm;")
    public final class134 method1300(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        if (arg0 <= 43) {
            this.field8029 = null;
        }
        return new class586(this, arg4, arg3, arg1, arg5, arg6, arg2);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public final void method1327(Canvas arg0, Object arg1, boolean arg2) {
        if (!arg2) {
            method3191(-95, null, -12, null, -127, -111);
        }
        this.field8022 = (class135) arg1;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
    public final void method1029() {
        this.field8018.method3487(true);
        super.method1029();
    }

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "(I)V")
    public final void method1320(int arg0) {
        this.field8004.SetAmbient(this.field4596 * this.field4589, this.field4596 * this.field4526, this.field4596 * this.field4572, 0.0F);
        if (arg0 == 9415) {
            this.field8015 = false;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1302(boolean arg0, Canvas arg1, Object arg2) {
        if (arg0) {
            this.method967();
        }
        if (this.field4461 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field8021.EndScene();
            this.method3187(48);
            this.field8021.BeginScene();
        }
    }

    @OriginalMember(owner = "client!eda", name = "X", descriptor = "(I)V")
    public final void method1315(int arg0) {
        if (arg0 != -12002) {
            method3186((byte) -18, null);
        }
        this.field8021.SetScissorRect(this.field4544 + this.field4576, this.field4518 - -this.field4577, this.field4615, this.field4605);
    }

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "(I)F")
    public final float method1288(int arg0) {
        if (arg0 != 29813) {
            this.method1311((byte) -117);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!eda", name = "Y", descriptor = "(I)V")
    public final void method1289(int arg0) {
        if (arg0 < 76) {
            return;
        }
        if (this.field4547[this.field4579] == class537.field7554) {
            this.field8021.SetTextureStageState(this.field4579, 24, 0);
            this.field8026[this.field4579] = 0;
            return;
        }
        if (this.field4547[this.field4579] == class36.field355) {
            this.field8021.SetTransform(this.field4579 + 16, this.field4538[this.field4579].method3016(field8027, (byte) -100));
        } else {
            this.field8021.SetTransform(this.field4579 + 16, this.field4538[this.field4579].method3025(field8027, (byte) -118));
        }
        int var2 = method3190(this.field4547[this.field4579], 256);
        if (this.field8026[this.field4579] != var2) {
            this.field8021.SetTextureStageState(this.field4579, 24, var2);
            this.field8026[this.field4579] = var2;
        }
    }
}
