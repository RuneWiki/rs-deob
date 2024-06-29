import jaclib.peer.class569;
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
import jagdx.class396;
import jagdx.class397;
import jagdx.class398;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class15 extends class632 {

    @OriginalMember(owner = "client!de", name = "Lg", descriptor = "Z")
    private boolean field170 = false;

    @OriginalMember(owner = "client!de", name = "Ig", descriptor = "I")
    private int field167 = 0;

    @OriginalMember(owner = "client!de", name = "Cg", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!de", name = "yg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field157;

    @OriginalMember(owner = "client!de", name = "Dg", descriptor = "Lwp;")
    private class411 field162;

    @OriginalMember(owner = "client!de", name = "Xg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field182;

    @OriginalMember(owner = "client!de", name = "zg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field158;

    @OriginalMember(owner = "client!de", name = "Qg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field175;

    @OriginalMember(owner = "client!de", name = "Pg", descriptor = "Ljaclib/peer/wn;")
    public class569 field174;

    @OriginalMember(owner = "client!de", name = "Ng", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!de", name = "xg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field156;

    @OriginalMember(owner = "client!de", name = "Sg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field177;

    @OriginalMember(owner = "client!de", name = "Kg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field169;

    @OriginalMember(owner = "client!de", name = "Wg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field181;

    @OriginalMember(owner = "client!de", name = "Gg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field165;

    @OriginalMember(owner = "client!de", name = "Tg", descriptor = "Z")
    public boolean field178;

    @OriginalMember(owner = "client!de", name = "Hg", descriptor = "Z")
    public boolean field166;

    @OriginalMember(owner = "client!de", name = "Bg", descriptor = "Z")
    public boolean field160;

    @OriginalMember(owner = "client!de", name = "Vg", descriptor = "[Z")
    private boolean[] field180;

    @OriginalMember(owner = "client!de", name = "Mg", descriptor = "[Z")
    private boolean[] field171;

    @OriginalMember(owner = "client!de", name = "Eg", descriptor = "[Z")
    private boolean[] field163;

    @OriginalMember(owner = "client!de", name = "Fg", descriptor = "[Z")
    private boolean[] field164;

    @OriginalMember(owner = "client!de", name = "Jg", descriptor = "[I")
    private int[] field168;

    @OriginalMember(owner = "client!de", name = "Ug", descriptor = "[Lem;")
    private class599[] field179;

    @OriginalMember(owner = "client!de", name = "Ag", descriptor = "[I")
    private static int[] field159 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!de", name = "Og", descriptor = "[F")
    private static float[] field173 = new float[16];

    @OriginalMember(owner = "client!de", name = "Rg", descriptor = "[I")
    private static int[] field176 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!de", name = "y", descriptor = "(I)V", line = 5)
    public final void method81(int arg0) {
        if (arg0 == 5373) {
            this.field182.LightEnable(0, this.field9101);
            this.field182.LightEnable(1, this.field9101);
        }
    }

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "(I)F", line = 16)
    public final float method82(int arg0) {
        if (arg0 > -95) {
            this.field174 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!de", name = "s", descriptor = "()V", line = 25)
    public final void method83() {
    }

    @OriginalMember(owner = "client!de", name = "C", descriptor = "(I)V", line = 28)
    public final void method84(int arg0) {
        this.field182.method2435(15, this.field9089);
        int var2 = -75 / ((arg0 + 9) / 52);
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "()Ldp;", line = 39)
    public final class425 method85() {
        D3DADAPTER_IDENTIFIER var1 = this.field158.method2417(this.field161, 0);
        return new class425(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!de", name = "l", descriptor = "(B)V", line = 49)
    public final void method86(byte arg0) {
        if (arg0 < 94) {
            this.field175 = null;
        }
        this.field182.method2435(28, this.field9144 && this.field9113 && this.field9147 >= 0 | this.field9120);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z[Lwg;)Lws;", line = 59)
    public final class530 method87(boolean arg0, class58[] arg1) {
        if (arg0) {
            this.method141();
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLdg;Z)V", line = 72)
    public final void method88(int arg0, boolean arg1, class20 arg2, boolean arg3) {
        if (arg1) {
            return;
        }
        byte var6;
        if (arg0 == 1) {
            var6 = 6;
        } else if (arg0 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg3) {
            var7 |= 0x10;
        }
        this.field182.SetTextureStageState(this.field9082, var6, method89(arg2, true) | var7);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ldg;Z)I", line = 117)
    private static final int method89(class20 arg0, boolean arg1) {
        if (!arg1) {
            return -100;
        } else if (class477.field6813 == arg0) {
            return 2;
        } else if (class371.field5369 == arg0) {
            return 0;
        } else if (class554.field7834 == arg0) {
            return 1;
        } else if (class104.field1753 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!de", name = "n", descriptor = "(I)V", line = 142)
    public final void method90(int arg0) {
        if (class631.field8868 == this.field9066) {
            this.field182.SetRenderState(19, 5);
            this.field182.SetRenderState(20, 6);
        } else if (class555.field7855 == this.field9066) {
            this.field182.SetRenderState(19, 2);
            this.field182.SetRenderState(20, 2);
        } else if (class222.field3341 == this.field9066) {
            this.field182.SetRenderState(19, 9);
            this.field182.SetRenderState(20, 2);
        }
        if (arg0 != -1) {
            this.method162(18, -94, -101, false, null, null, 125, 56);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILkl;Lvt;)Z", line = 171)
    public final boolean method91(int arg0, class468 arg1, class343 arg2) {
        if (arg0 != 9564) {
            this.method85();
        }
        D3DDISPLAYMODE var4 = this.field158.method2421(this.field161);
        return class396.method2412((byte) -96, this.field158.CheckDeviceFormat(this.field161, this.field172, var4.Format, 0, 4, method156(arg1, 1, arg2)));
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 185)
    public final void method92(Object arg0, int arg1, Canvas arg2) {
        if (arg1 >= -47) {
            this.method134(null, -40, -97, -13, null, -21, -114);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[[IBZ)Luba;", line = 194)
    public final class628 method93(int arg0, int[][] arg1, byte arg2, boolean arg3) {
        if (arg2 < 10) {
            method156(null, 112, null);
        }
        return new class502(this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!de", name = "o", descriptor = "()V", line = 205)
    public final void method94() throws class354 {
        this.field182.EndScene();
        if (this.field162.method2493(0)) {
            this.field167 = 0;
            if (class396.method2411(32025, this.field162.method2494(false, 0))) {
                this.method140(0);
            }
        } else if ((++this.field167) <= 50) {
            this.method140(0);
        } else {
            throw new class354();
        }
        this.field182.BeginScene();
    }

    @OriginalMember(owner = "client!de", name = "t", descriptor = "()V", line = 230)
    public final void method95() {
        this.field174.method3251(false);
        super.method95();
    }

    @OriginalMember(owner = "client!de", name = "m", descriptor = "(B)V", line = 239)
    public final void method96(byte arg0) {
        if (arg0 != 66) {
            this.field161 = 69;
        }
        int var2 = this.field171[this.field9082] ? method123(this.field9091[this.field9082], (byte) 73) : 1;
        this.field182.SetTextureStageState(this.field9082, 1, var2);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZILdg;I)V", line = 264)
    public final void method97(boolean arg0, boolean arg1, int arg2, class20 arg3, int arg4) {
        byte var7;
        if (arg4 == 1) {
            var7 = 3;
        } else if (arg4 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg1) {
            var8 |= 0x20;
        }
        if (arg2 != 8) {
            this.method131(true);
        }
        if (arg0) {
            var8 |= 0x10;
        }
        this.field182.SetTextureStageState(this.field9082, var7, method89(arg3, true) | var8);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZB)Lsp;", line = 304)
    public final class620 method98(boolean arg0, byte arg1) {
        if (arg1 != 14) {
            method89(null, true);
        }
        return new class113(this, class343.field4923, arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V", line = 313)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!de", name = "q", descriptor = "(B)V", line = 316)
    public final void method100(byte arg0) {
        this.field182.method2435(174, this.field9185);
        if (arg0 != -61) {
            this.method136(null, -41, -4, 114, -22, null);
        }
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V", line = 327)
    public final synchronized void method101(int arg0) {
        this.field174.method3253(false);
        super.method101(arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 335)
    public final void method102(byte arg0, int arg1) {
        this.field182.SetTextureStageState(this.field9082, 11, arg1);
        if (arg0 >= -122) {
            field176 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "v", descriptor = "(IIII)[I", line = 348)
    public final int[] method103(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field182.method2425(0);
        IDirect3DSurface var7 = this.field182.method2434(arg2, arg3, 21, 0, 0, true);
        if (class396.method2412((byte) -85, this.field182.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class396.method2412((byte) -37, var7.LockRect(0, 0, arg2, arg3, 0, this.field181))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field181.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field181.method2414(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field181.method2414(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3258(125);
        var7.method3258(41);
        return var5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lkk;Lkk;FLkk;)Lkk;", line = 387)
    public final class149 method104(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IZ)V", line = 394)
    public final void method105(int arg0, boolean arg1) {
        this.field182.method2435(161, arg1);
        if (arg0 != 20636) {
            this.method100((byte) 60);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 405)
    public final Object method106(byte arg0, Canvas arg1) {
        if (arg0 != 2) {
            this.field171 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 417)
    public final void method107(byte arg0) {
        int var2 = this.field171[this.field9082] ? method123(this.field9108[this.field9082], (byte) 48) : 1;
        this.field182.SetTextureStageState(this.field9082, 4, var2);
        if (arg0 < 87) {
            this.field166 = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLpca;)I", line = 428)
    private static final int method108(byte arg0, class362 arg1) {
        if (arg0 != -102) {
            method156(null, -113, null);
        }
        if (class97.field1696 == arg1) {
            return 2;
        } else if (class121.field1948 == arg1) {
            return 3;
        } else if (class10.field109 == arg1) {
            return 1;
        } else if (class12.field118 == arg1) {
            return 4;
        } else if (class449.field6540 == arg1) {
            return 6;
        } else if (class134.field2156 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 462)
    public final void method109(byte arg0) {
        this.field156.SetDiffuse(this.field9121 * this.field9115, this.field9132 * this.field9121, this.field9121 * this.field9080, 0.0F);
        this.field177.SetDiffuse(-this.field9117 * this.field9115, -this.field9117 * this.field9132, -this.field9117 * this.field9080, 0.0F);
        int var2 = -42 / ((arg0 - 66) / 45);
        this.field170 = false;
    }

    @OriginalMember(owner = "client!de", name = "E", descriptor = "(I)V", line = 473)
    public final void method110(int arg0) {
        if (arg0 != -19726 || this.field170) {
            return;
        }
        this.field182.LightEnable(0, !this.field9101);
        this.field182.LightEnable(1, !this.field9101);
        this.field182.SetLight(0, this.field156);
        this.field182.SetLight(1, this.field177);
        this.field182.LightEnable(0, this.field9101);
        this.field182.LightEnable(1, this.field9101);
        this.field170 = true;
    }

    @OriginalMember(owner = "client!de", name = "l", descriptor = "(I)V", line = 494)
    public final void method111(int arg0) {
        if (arg0 != 9751) {
            field176 = null;
        }
        this.field182.method2435(137, this.field9112 && !this.field9142);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 504)
    public final void method112(byte arg0, Object arg1, Canvas arg2) {
        if (arg0 != -25) {
            method156(null, -19, null);
        }
        if (this.field8997 == arg2) {
            this.field182.EndScene();
            this.method140(0);
            this.field182.BeginScene();
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(II)Lrda;", line = 521)
    public final class92 method113(int arg0, int arg1) {
        if (arg1 != 7) {
            this.method83();
        }
        if (arg0 == 3) {
            return new class292(this, this.field8998);
        } else if (arg0 == 4) {
            return new class506(this, this.field8998, this.field8948);
        } else {
            return super.method113(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lws;B)V", line = 558)
    public final void method114(class530 arg0, byte arg1) {
        if (arg1 > -3) {
            this.field180 = null;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field182.SetVertexDeclaration(var3.field3745);
    }

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "(I)V", line = 571)
    public final void method115(int arg0) {
        this.field156.SetAmbient(this.field9141 * this.field9115, this.field9141 * this.field9132, this.field9141 * this.field9080, 0.0F);
        if (arg0 < 11) {
            field176 = null;
        }
        this.field170 = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lru;I)V", line = 582)
    public final void method116(class456 arg0, int arg1) {
        this.method160(arg0, -12812);
        if (!this.field180[this.field9082]) {
            this.field182.SetSamplerState(this.field9082, 1, 1);
            this.field180[this.field9082] = true;
        }
        if (!this.field164[this.field9082]) {
            this.field182.SetSamplerState(this.field9082, 2, 1);
            this.field164[this.field9082] = true;
        }
        if (arg1 != 5) {
            this.method141();
        }
    }

    @OriginalMember(owner = "client!de", name = "j", descriptor = "(Z)V", line = 609)
    public final void method117(boolean arg0) {
        if (arg0) {
            this.field171 = null;
        }
        this.field182.SetTransform(3, this.field9131);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lne;B)V", line = 622)
    public final void method118(class175 arg0, byte arg1) {
        int var3 = 0;
        int var4 = 71 / ((49 - arg1) / 53);
        if (class491.field6900 == arg0) {
            var3 = 65536;
        } else if (class529.field7354 == arg0) {
            var3 = 131072;
        } else if (class133.field2150 == arg0) {
            var3 = 196608;
        }
        this.field182.SetTextureStageState(this.field9082, 11, var3 | this.field9082);
    }

    @OriginalMember(owner = "client!de", name = "q", descriptor = "(I)V", line = 645)
    public final void method119(int arg0) {
        if (arg0 >= -71) {
            this.method118(null, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!de", name = "YA", descriptor = "()I", line = 655)
    public final int method120() {
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "(I)V", line = 662)
    public final void method121(int arg0) {
        this.field182.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!de", name = "D", descriptor = "()V", line = 668)
    public final void method122() {
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lfd;B)I", line = 671)
    private static final int method123(class143 arg0, byte arg1) {
        if (arg1 < 24) {
            return -117;
        } else if (class634.field9219 == arg0) {
            return 2;
        } else if (class635.field9225 == arg0) {
            return 4;
        } else if (class609.field8665 == arg0) {
            return 26;
        } else if (class211.field3065 == arg0) {
            return 7;
        } else if (class466.field6716 == arg0) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V", line = 701)
    public final void method124() {
        IDirect3DEventQuery var1 = this.field182.method2428();
        if (!class396.method2412((byte) -110, var1.Issue())) {
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

    @OriginalMember(owner = "client!de", name = "m", descriptor = "(I)V", line = 724)
    public final void method125(int arg0) {
        if (this.field9120) {
            this.field182.method2437(36, 0.0F);
            this.field182.method2437(37, 1.0F);
            this.field182.SetRenderState(34, this.field9143);
        } else {
            this.field9065 = (this.field9139 - this.field9070);
            this.field9099 = this.field9065 - (float) this.field9147;
            if ((float) this.field9107 > this.field9099) {
                this.field9099 = this.field9107;
            }
            this.field182.method2437(36, this.field9099);
            this.field182.method2437(37, this.field9065);
            this.field182.SetRenderState(34, this.field9102);
        }
        if (arg0 != -25370) {
            this.field162 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "k", descriptor = "(I)V", line = 751)
    public final void method126(int arg0) {
        if (this.field9084.method1766((byte) 79)) {
            this.field9060.method2894(field173, 1);
        } else {
            field173[0] = 1.0F;
            field173[15] = 1.0F;
            field173[10] = 1.0F;
            field173[3] = 0.0F;
            field173[14] = 0.0F;
            field173[2] = 0.0F;
            field173[4] = 0.0F;
            field173[1] = 0.0F;
            field173[13] = 0.0F;
            field173[12] = 0.0F;
            field173[8] = 0.0F;
            field173[5] = 1.0F;
            field173[7] = 0.0F;
            field173[9] = 0.0F;
            field173[11] = 0.0F;
            field173[6] = 0.0F;
        }
        if (arg0 == 0) {
            this.field182.SetTransform(2, field173);
        }
    }

    @OriginalMember(owner = "client!de", name = "N", descriptor = "(I)V", line = 789)
    public final void method127(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field9071; var2++) {
            class637 var3 = this.field9129[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3679(1705);
            float var6 = var3.method3678(-23151) / 255.0F;
            this.field169.SetPosition((float) var3.method3681(-27102), (float) var3.method3682(false), (float) var3.method3677(-26984));
            this.field169.SetDiffuse((float) ((var5 & 0xFF35A5) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field169.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3683(0) * var3.method3683(0)));
            this.field169.SetRange((float) var3.method3683(0));
            this.field182.SetLight(var4, this.field169);
            this.field182.LightEnable(var4, true);
        }
        int var7 = 69 % ((arg0 + 83) / 42);
        while (var2 < this.field9106) {
            this.field182.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method127(-128);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Lup;", line = 827)
    public final class342 method128(int arg0, boolean arg1) {
        return arg0 == 16240 ? new class455(this, arg1) : (class342) null;
    }

    @OriginalMember(owner = "client!de", name = "o", descriptor = "(B)V", line = 840)
    public final void method129(byte arg0) {
        if (arg0 != -95) {
            this.field178 = false;
        }
        this.field182.SetRenderState(60, this.field9076);
    }

    @OriginalMember(owner = "client!de", name = "H", descriptor = "(I)V", line = 850)
    public final void method130(int arg0) {
        if (this.field9110[this.field9082] == class94.field1654) {
            this.field182.SetTextureStageState(this.field9082, 24, 0);
            this.field168[this.field9082] = 0;
        } else {
            if (this.field9110[this.field9082] == class338.field4855) {
                this.field182.SetTransform(this.field9082 + 16, this.field9087[this.field9082].method2894(field173, 1));
            } else {
                this.field182.SetTransform(this.field9082 + 16, this.field9087[this.field9082].method2896((byte) 61, field173));
            }
            int var2 = method163(this.field9110[this.field9082], -120);
            if (this.field168[this.field9082] != var2) {
                this.field182.SetTextureStageState(this.field9082, 24, var2);
                this.field168[this.field9082] = var2;
            }
        }
        int var3 = 126 % ((arg0 - 78) / 41);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 880)
    public final void method131(boolean arg0) {
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)V", line = 883)
    public final void method132(boolean arg0) {
        if (this.field9040) {
            field173[0] = 1.0F;
            field173[11] = 0.0F;
            field173[1] = 0.0F;
            field173[14] = 0.0F;
            field173[8] = 0.0F;
            field173[7] = 0.0F;
            field173[13] = 0.0F;
            field173[5] = 1.0F;
            field173[4] = 0.0F;
            field173[9] = 0.0F;
            field173[10] = 1.0F;
            field173[12] = 0.0F;
            field173[6] = 0.0F;
            field173[3] = 0.0F;
            field173[2] = 0.0F;
            field173[15] = 1.0F;
        } else {
            this.field9032.method2894(field173, 1);
        }
        this.field182.SetTransform(256, field173);
        if (arg0) {
            this.method87(false, null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 920)
    public final void method133(byte arg0, Canvas arg1, Object arg2) {
        this.field162 = (class411) arg2;
        int var4 = -64 / ((arg0 - 72) / 39);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lpca;IIILsp;II)V", line = 931)
    public final void method134(class362 arg0, int arg1, int arg2, int arg3, class620 arg4, int arg5, int arg6) {
        this.field182.SetIndices(((class113) arg4).field1871);
        if (arg5 == 10) {
            this.field182.DrawIndexedPrimitive(method108((byte) -102, arg0), 0, arg6, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "(I)V", line = 953)
    public final void method135(int arg0) {
        if (arg0 < 13) {
            this.method153();
        }
        this.field182.SetViewport(this.field9151, this.field9128, this.field8972, this.field8892, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BIIIILkl;)Lve;", line = 963)
    public final class228 method136(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class468 arg5) {
        return arg2 == 15 ? new class456(this, arg5, arg4, arg1, arg3, arg0) : (class228) null;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(B)V", line = 974)
    public final void method137(byte arg0) {
        if (arg0 < -83) {
            this.field182.SetScissorRect(this.field9151 + this.field9093, this.field9128 - -this.field9081, this.field9067, this.field9086);
        }
    }

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "(I)V", line = 984)
    public final void method138(int arg0) {
        if (arg0 == 7) {
            this.field156.SetDirection(-this.field9069[0], -this.field9069[1], -this.field9069[2]);
            this.field177.SetDirection(-this.field9090[0], -this.field9090[1], -this.field9090[2]);
            this.field170 = false;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/wn;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lwp;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ln;Lgp;I)V", line = 1300)
    private class15(int arg0, int arg1, Canvas arg2, class569 arg3, IDirect3D arg4, IDirect3DDevice arg5, class411 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class472 arg9, class561 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field161 = arg0;
        this.field157 = arg8;
        this.field162 = arg6;
        this.field182 = arg5;
        this.field158 = arg4;
        this.field175 = arg7;
        this.field174 = arg3;
        this.field172 = arg1;
        this.field156 = new class397(this.field174);
        this.field177 = new class397(this.field174);
        this.field169 = new class397(this.field174);
        this.field181 = new PixelBuffer(this.field174);
        this.field165 = new GeometryBuffer(this.field174);
        this.field9146 = (this.field157.TextureCaps & 0x800) != 0;
        this.field178 = (this.field157.TextureCaps & 0x10000) != 0;
        this.field166 = (this.field157.TextureCaps & 0x4000) != 0;
        this.field9163 = this.field157.MaxActiveLights <= 0 ? 8 : this.field157.MaxActiveLights;
        this.field9072 = (this.field157.TextureCaps & 0x2000) != 0;
        this.field9109 = this.field157.MaxSimultaneousTextures;
        this.field160 = (this.field157.TextureCaps & 0x2) == 0;
        this.field9098 = this.field9111 > 0 || this.field158.CheckDeviceMultiSampleType(this.field161, this.field172, this.field175.BackBufferFormat, true, 2) == 0;
        this.field180 = new boolean[this.field9109];
        this.field171 = new boolean[this.field9109];
        this.field163 = new boolean[this.field9109];
        this.field164 = new boolean[this.field9109];
        this.field168 = new int[this.field9109];
        this.field179 = new class599[this.field9109];
        this.field182.BeginScene();
        try {
            this.field182.Clear(3, 0, 1.0F, 0);
            this.method94();
            this.field182.Clear(3, 0, 1.0F, 0);
        } catch (class354 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FFF)V", line = 999)
    public final void method139(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "(I)Z", line = 1003)
    private final boolean method140(int arg0) {
        int var2 = this.field182.TestCooperativeLevel();
        if (arg0 != 0) {
            this.method96((byte) 89);
        }
        if (var2 == 0 || var2 == -2005530519) {
            class411 var3 = (class411) this.field8907;
            this.method3612(-119);
            var3.method2492((byte) -101);
            this.field175.BackBufferWidth = 0;
            this.field175.BackBufferHeight = 0;
            if (method159(this.field9111, this.field172, 4108, this.field161, this.field158, this.field175)) {
                int var4 = this.field182.Reset(this.field175);
                if (class396.method2412((byte) -32, var4)) {
                    var3.method2495(this.field182.method2431(0), arg0 ^ 0x0, this.field182.method2430());
                    this.method3582(496);
                    this.method161((byte) -104);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "q", descriptor = "()Z", line = 1045)
    public final boolean method141() {
        return false;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V", line = 1052)
    public final void method142() {
        this.method3623(true, 125);
        this.field182.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLem;)I", line = 1061)
    private static final int method143(byte arg0, class599 arg1) {
        int var2 = -15 % ((-arg0 - 62) / 44);
        if (class549.field7730 == arg1) {
            return 2;
        } else if (class174.field2517 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILvt;Lkl;)Z", line = 1080)
    public final boolean method144(int arg0, class343 arg1, class468 arg2) {
        if (arg0 >= -69) {
            this.field181 = null;
        }
        D3DDISPLAYMODE var4 = this.field158.method2421(this.field161);
        return class396.method2412((byte) -16, this.field158.CheckDeviceFormat(this.field161, this.field172, var4.Format, 0, 3, method156(arg2, 1, arg1)));
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[IIIZ)Ldea;", line = 1092)
    public final class405 method145(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 != 3) {
            this.method122();
        }
        return new class236(this, arg4, arg1, arg6, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "(I)V", line = 1102)
    public final void method146(int arg0) {
        this.field182.method2435(7, this.field9126);
        if (arg0 > -74) {
            this.field169 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "D", descriptor = "(I)V", line = 1115)
    public final void method147(int arg0) {
        if (arg0 != -4731) {
            this.method155(1);
        }
        this.field182.method2435(27, this.field9083);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILpca;II)V", line = 1126)
    public final void method148(int arg0, class362 arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.method142();
        }
        this.field182.DrawPrimitive(method108((byte) -102, arg1), arg0, arg2);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIILvt;Lkl;)Ldea;", line = 1140)
    public final class405 method149(boolean arg0, int arg1, int arg2, class343 arg3, class468 arg4) {
        return arg0 ? new class236(this, arg4, arg3, arg1, arg2) : (class405) null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLkda;)V", line = 1151)
    public final void method150(boolean arg0, class236 arg1) {
        this.method160(arg1, -12812);
        if (arg0) {
            this.method128(-97, false);
        }
        if (arg1.field3476 != this.field180[this.field9082]) {
            this.field182.SetSamplerState(this.field9082, 1, arg1.field3476 ? 1 : 3);
            this.field180[this.field9082] = arg1.field3476;
        }
        if (arg1.field3472 != this.field164[this.field9082]) {
            this.field182.SetSamplerState(this.field9082, 2, arg1.field3472 ? 1 : 3);
            this.field164[this.field9082] = arg1.field3472;
        }
    }

    @OriginalMember(owner = "client!de", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ln;Lgp;Ljava/lang/Integer;)Lqa;", line = 1176)
    public static final class167 createToolkit(Canvas arg0, class472 arg1, class561 arg2, Integer arg3) {
        class15 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class569 var7 = new class569();
            IDirect3D var8 = IDirect3D.method2418(-2147483616, var7);
            D3DCAPS var9 = var8.method2419(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method159(arg3, var6, 4108, var5, var8, var10)) {
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
                    var13 = var8.method2420(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class398 var17) {
                    var13 = var8.method2420(var5, var6, arg0, var11 | 0x20, var10);
                }
                class411 var15 = new class411(var13.method2431(0), var13.method2430());
                var4 = new class15(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3586(0);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method95();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZIIILkl;[BI)Ldea;", line = 1278)
    public final class405 method151(int arg0, boolean arg1, int arg2, int arg3, int arg4, class468 arg5, byte[] arg6, int arg7) {
        int var9 = -11 % ((-arg4 - 14) / 63);
        return new class236(this, arg5, arg3, arg2, arg1, arg6, arg0, arg7);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILup;I)V", line = 1287)
    public final void method152(int arg0, class342 arg1, int arg2) {
        class455 var4 = (class455) arg1;
        this.field182.SetStreamSource(arg0, var4.field6577, 0, var4.method2674((byte) 104));
        if (arg2 <= 44) {
            field173 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "u", descriptor = "()V", line = 1297)
    public final void method153() {
    }

    @OriginalMember(owner = "client!de", name = "u", descriptor = "(I)V", line = 1345)
    public final void method154(int arg0) {
        this.field182.method2435(14, this.field9095 && this.field9073);
        if (arg0 != -5163) {
            this.method100((byte) 90);
        }
    }

    @OriginalMember(owner = "client!de", name = "o", descriptor = "(I)V", line = 1356)
    public final void method155(int arg0) {
        if (arg0 != 1) {
            this.method137((byte) -83);
        }
        if (this.field171[this.field9082]) {
            this.field171[this.field9082] = false;
            this.field182.SetTexture(this.field9082, null);
            this.method107((byte) 104);
            this.method96((byte) 66);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lkl;ILvt;)I", line = 1373)
    public static final int method156(class468 arg0, int arg1, class343 arg2) {
        if (class343.field4922 == arg2) {
            if (class617.field8727 == arg0) {
                return 22;
            }
            if (class85.field1472 == arg0) {
                return 21;
            }
            if (class384.field5715 == arg0) {
                return 28;
            }
            if (class299.field4330 == arg0) {
                return 50;
            }
            if (class561.field8029 == arg0) {
                return 51;
            }
            if (class485.field6862 == arg0) {
                return 77;
            }
        }
        if (arg1 != 1) {
            method123(null, (byte) 97);
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!de", name = "p", descriptor = "()Z", line = 1411)
    public final boolean method157() {
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1418)
    public final void method158(Rectangle[] arg0, int arg1) throws class354 {
        this.method94();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;)Z", line = 1427)
    private static final boolean method159(int arg0, int arg1, int arg2, int arg3, IDirect3D arg4, D3DPRESENT_PARAMETERS arg5) {
        int var6 = 0;
        if (arg2 != 4108) {
            createToolkit(null, null, null, null);
        }
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = arg4.method2421(arg3);
            label76: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field176.length; var10++) {
                        if (arg4.CheckDeviceType(arg3, arg1, var9.Format, field176[var10], true) == 0 && arg4.CheckDeviceFormat(arg3, arg1, var9.Format, 1, 1, field176[var10]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg1, field176[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field159.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg3, arg1, var9.Format, 2, 1, field159[var11]) == 0 && arg4.CheckDepthStencilMatch(arg3, arg1, var9.Format, field176[var10], field159[var11]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg1, field159[var10], true, var8) == 0)) {
                                    var7 = field176[var10];
                                    var6 = field159[var11];
                                    break label76;
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
            arg5.MultiSampleType = var8;
            arg5.MultiSampleQuality = 0;
            arg5.BackBufferFormat = var7;
            arg5.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lkp;I)V", line = 1527)
    public final void method160(class463 arg0, int arg1) {
        this.field182.SetTexture(this.field9082, arg0.method1538(-29358));
        if (arg1 != -12812) {
            return;
        }
        if (this.field179[this.field9082] != arg0.field6695) {
            int var3 = method143((byte) 35, arg0.field6695);
            this.field182.SetSamplerState(this.field9082, 6, var3);
            this.field182.SetSamplerState(this.field9082, 5, var3);
            this.field179[this.field9082] = arg0.field6695;
            if (this.field163[this.field9082] != arg0.field6697) {
                this.field182.SetSamplerState(this.field9082, 7, arg0.field6697 ? method143((byte) 117, arg0.field6695) : 0);
                this.field163[this.field9082] = arg0.field6697;
            }
        } else if (this.field163[this.field9082] != arg0.field6697) {
            this.field182.SetSamplerState(this.field9082, 7, arg0.field6697 ? method143((byte) 116, arg0.field6695) : 0);
            this.field163[this.field9082] = arg0.field6697;
        }
        if (!this.field171[this.field9082]) {
            this.field171[this.field9082] = true;
            this.method107((byte) 104);
            this.method96((byte) 66);
        }
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "(B)V", line = 1569)
    public final void method161(byte arg0) {
        for (int var2 = 0; var2 < this.field9109; var2++) {
            this.field182.SetSamplerState(var2, 7, 0);
            this.field182.SetSamplerState(var2, 6, 2);
            this.field182.SetSamplerState(var2, 5, 2);
            this.field182.SetSamplerState(var2, 1, 1);
            this.field182.SetSamplerState(var2, 2, 1);
            this.field179[var2] = class549.field7730;
            this.field180[var2] = this.field164[var2] = true;
            this.field163[var2] = false;
            this.field168[var2] = 0;
        }
        this.field182.SetTextureStageState(0, 6, 1);
        this.field182.SetRenderState(9, 2);
        this.field182.SetRenderState(23, 4);
        this.field182.SetRenderState(25, 5);
        this.field182.SetRenderState(24, 0);
        this.field182.SetRenderState(22, 2);
        this.field182.SetRenderState(147, 1);
        this.field182.SetRenderState(145, 1);
        this.field182.method2437(38, 0.95F);
        this.field182.SetRenderState(140, 3);
        this.field156.SetType(3);
        this.field177.SetType(3);
        this.field169.SetType(1);
        this.field170 = false;
        super.method161(arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIZLkl;[FII)Ldea;", line = 1605)
    public final class405 method162(int arg0, int arg1, int arg2, boolean arg3, class468 arg4, float[] arg5, int arg6, int arg7) {
        if (arg2 != 2) {
            this.field164 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lsq;I)I", line = 1615)
    private static final int method163(class442 arg0, int arg1) {
        if (arg1 >= -78) {
            field159 = null;
        }
        if (class352.field5027 == arg0) {
            return 1;
        } else if (class577.field8230 == arg0) {
            return 2;
        } else if (class235.field3448 == arg0) {
            return 3;
        } else if (class338.field4855 == arg0) {
            return 4;
        } else if (class377.field5542 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }
}
