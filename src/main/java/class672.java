import jaclib.peer.class669;
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
import jagdx.class480;
import jagdx.class481;
import jagdx.class482;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class672 extends class453 {

    @OriginalMember(owner = "client!lt", name = "hh", descriptor = "I")
    private int field9435 = 0;

    @OriginalMember(owner = "client!lt", name = "Zg", descriptor = "Z")
    private boolean field9427 = false;

    @OriginalMember(owner = "client!lt", name = "Vg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field9423;

    @OriginalMember(owner = "client!lt", name = "lh", descriptor = "Ljaclib/peer/wf;")
    public class669 field9439;

    @OriginalMember(owner = "client!lt", name = "gh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field9434;

    @OriginalMember(owner = "client!lt", name = "Pg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field9417;

    @OriginalMember(owner = "client!lt", name = "eh", descriptor = "I")
    private int field9432;

    @OriginalMember(owner = "client!lt", name = "Wg", descriptor = "Lgk;")
    private class472 field9424;

    @OriginalMember(owner = "client!lt", name = "bh", descriptor = "I")
    private int field9429;

    @OriginalMember(owner = "client!lt", name = "Yg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field9426;

    @OriginalMember(owner = "client!lt", name = "kh", descriptor = "Ljagdx/D3DLIGHT;")
    private class482 field9438;

    @OriginalMember(owner = "client!lt", name = "ih", descriptor = "Ljagdx/D3DLIGHT;")
    private class482 field9436;

    @OriginalMember(owner = "client!lt", name = "Og", descriptor = "Ljagdx/D3DLIGHT;")
    private class482 field9416;

    @OriginalMember(owner = "client!lt", name = "mh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field9440;

    @OriginalMember(owner = "client!lt", name = "jh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field9437;

    @OriginalMember(owner = "client!lt", name = "ch", descriptor = "Z")
    public boolean field9430;

    @OriginalMember(owner = "client!lt", name = "Ng", descriptor = "Z")
    public boolean field9415;

    @OriginalMember(owner = "client!lt", name = "dh", descriptor = "Z")
    public boolean field9431;

    @OriginalMember(owner = "client!lt", name = "Sg", descriptor = "[Z")
    private boolean[] field9420;

    @OriginalMember(owner = "client!lt", name = "nh", descriptor = "[Lqt;")
    private class634[] field9441;

    @OriginalMember(owner = "client!lt", name = "Rg", descriptor = "[Z")
    private boolean[] field9419;

    @OriginalMember(owner = "client!lt", name = "Qg", descriptor = "[I")
    private int[] field9418;

    @OriginalMember(owner = "client!lt", name = "Ug", descriptor = "[Z")
    private boolean[] field9422;

    @OriginalMember(owner = "client!lt", name = "ah", descriptor = "[Z")
    private boolean[] field9428;

    @OriginalMember(owner = "client!lt", name = "Tg", descriptor = "[I")
    private static int[] field9421 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!lt", name = "fh", descriptor = "[F")
    private static float[] field9433 = new float[16];

    @OriginalMember(owner = "client!lt", name = "oh", descriptor = "[I")
    private static int[] field9442 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!lt", name = "Xg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9425;

    @OriginalMember(owner = "client!lt", name = "T", descriptor = "(I)V")
    public final void method1051(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            this.field9428 = null;
        }
        this.field9438.SetAmbient(this.field6493 * this.field6474, this.field6536 * this.field6493, this.field6547 * this.field6493, 0.0F);
        this.field9427 = false;
    }

    @OriginalMember(owner = "client!lt", name = "C", descriptor = "(B)Z")
    private final boolean method3794(byte arg0) {
        if (arg0 >= -42) {
            this.method580(20, -2);
        }
        int var2 = this.field9423.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class472 var3 = (class472) this.field6310;
            this.method2731(-111);
            var3.method2859((byte) 125);
            this.field9426.BackBufferHeight = 0;
            this.field9426.BackBufferWidth = 0;
            if (method3803(this.field9434, this.field9432, this.field6512, (byte) 19, this.field9426, this.field9429)) {
                int var4 = this.field9423.Reset(this.field9426);
                if (class480.method2879(var4, (byte) -100)) {
                    var3.method2858(this.field9423.method2897(), 0, this.field9423.method2900(0));
                    this.method2706(68);
                    this.method1048(9053);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILtr;)V")
    public final void method3795(int arg0, class293 arg1) {
        this.method3804(arg1, 109);
        if (!this.field9420[this.field6451]) {
            this.field9423.SetSamplerState(this.field6451, 1, 1);
            this.field9420[this.field6451] = true;
        }
        if (!this.field9419[this.field6451]) {
            this.field9423.SetSamplerState(this.field6451, 2, 1);
            this.field9419[this.field6451] = true;
        }
        int var3 = -85 % ((arg0 + 34) / 58);
    }

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "(I)V")
    public final void method1023(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field6503; var2++) {
            class36 var3 = this.field6470[var2];
            int var4 = var2 + 2;
            int var5 = var3.method292(6865);
            float var6 = var3.method296((byte) 3) / 255.0F;
            this.field9416.SetPosition((float) var3.method290((byte) 94), (float) var3.method298(false), (float) var3.method291(0));
            this.field9416.SetDiffuse((float) ((var5 & 0xFF9015) >> 16) * var6, (float) ((var5 & 0xFFB3) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field9416.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method294(46) * var3.method294(85)));
            this.field9416.SetRange((float) var3.method294(125));
            this.field9423.SetLight(var4, this.field9416);
            this.field9423.LightEnable(var4, true);
        }
        if (arg0 <= 96) {
            this.method1018((byte) 114);
        }
        while (this.field6523 > var2) {
            this.field9423.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1023(118);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;I)V")
    public final void method3796(IDirect3DPixelShader arg0, int arg1) {
        this.field9423.SetPixelShader(arg0);
        if (arg1 != -27452) {
            this.field9440 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lsfa;Lsfa;FLsfa;)Lsfa;")
    public final class693 method571(class693 arg0, class693 arg1, float arg2, class693 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Lvi;")
    public final class536 method551(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(I)V")
    public final synchronized void method566(int arg0) {
        this.field9439.method3777((byte) 98);
        super.method566(arg0);
    }

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "(II)V")
    public final void method1028(int arg0, int arg1) {
        this.field9423.SetTextureStageState(this.field6451, 11, arg0);
        if (arg1 != 0) {
            this.method1062((byte) 26);
        }
    }

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "(Z)F")
    public final float method1010(boolean arg0) {
        if (!arg0) {
            this.method1030(-2);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "()Lsia;")
    public final class732 method599() {
        D3DADAPTER_IDENTIFIER var1 = this.field9434.method2885(this.field9429, 0);
        return new class732(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;B)V")
    public final void method3797(IDirect3DVertexShader arg0, byte arg1) {
        if (arg1 <= -71) {
            this.field9425 = arg0;
            this.field9423.SetVertexShader(arg0);
            this.method1063((byte) 127);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)Ldw;")
    public final class715 method1039(byte arg0, int arg1) {
        if (arg0 != 67) {
            return (class715) null;
        } else if (arg1 == 3) {
            return new class325(this, this.field6435);
        } else if (arg1 == 4) {
            return new class757(this, this.field6435, this.field6340);
        } else if (arg1 == 8) {
            return new class100(this, this.field6435, this.field6340);
        } else {
            return super.method1039((byte) 67, arg1);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLcv;)V")
    public final void method1040(byte arg0, class565 arg1) {
        int var3 = 0;
        if (class521.field7381 == arg1) {
            var3 = 65536;
        } else if (class523.field7404 == arg1) {
            var3 = 131072;
        } else if (class288.field4067 == arg1) {
            var3 = 196608;
        }
        if (arg0 != -123) {
            this.method1050((byte) 58);
        }
        this.field9423.SetTextureStageState(this.field6451, 11, var3 | this.field6451);
    }

    @OriginalMember(owner = "client!lt", name = "O", descriptor = "(I)V")
    public final void method1056(int arg0) {
        if (arg0 != 0) {
            this.field9419 = null;
        }
        this.field6508 = (this.field6483 - this.field6505);
        this.field6500 = this.field6508 - (float) this.field6477;
        if (this.field6500 < (float) this.field6533) {
            this.field6500 = this.field6533;
        }
        this.field9423.method2889(36, this.field6500);
        this.field9423.method2889(37, this.field6508);
        this.field9423.SetRenderState(34, this.field6542);
    }

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "()Z")
    public final boolean method618() {
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(II)Lc;")
    public final class185 method644(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "()Z")
    public final boolean method562() {
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIILkca;I[BZI)Lwda;")
    public final class636 method1016(int arg0, int arg1, int arg2, class82 arg3, int arg4, byte[] arg5, boolean arg6, int arg7) {
        if (arg1 != 1) {
            this.method1049(70, 118, 16, null, false, -51, false);
        }
        return new class124(this, arg3, arg7, arg4, arg6, arg5, arg2, arg0);
    }

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "()I")
    public final int method594() {
        return 0;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lkca;IBI[BI)Lii;")
    public final class550 method1060(class82 arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 28 % ((58 - arg2) / 57);
        return new class293(this, arg0, arg1, arg5, arg3, arg4);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(IIIID)V")
    public final void method532(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[Lofa;)Lhi;")
    public final class203 method1006(int arg0, class328[] arg1) {
        if (arg0 != 50) {
            this.method1022(null, 94, -128, -18);
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLti;Lkca;)Z")
    public final boolean method1013(byte arg0, class438 arg1, class82 arg2) {
        if (arg0 != -19) {
            this.field9437 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class480.method2879(this.field9434.method2881(this.field9429, var4), (byte) -109) && class480.method2879(this.field9434.CheckDeviceFormat(this.field9429, this.field9432, var4.Format, 0, 4, method3800((byte) 122, arg1, arg2)), (byte) -124);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lqt;Z)I")
    private static final int method3798(class634 arg0, boolean arg1) {
        if (class267.field3864 == arg0) {
            return 2;
        } else if (class514.field7326 == arg0) {
            return 1;
        } else if (arg1) {
            return 68;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "()V")
    public final void method536() {
    }

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "(B)V")
    public final void method1041(byte arg0) {
        if (arg0 != -28) {
            field9442 = null;
        }
        this.field9423.method2894(7, this.field6517);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)V")
    public final void method1031(boolean arg0, boolean arg1) {
        this.field9423.method2894(161, arg1);
        if (arg0) {
            this.field9429 = 126;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
    public final void method1053(byte arg0) {
        this.field9438.SetDirection(-this.field6540[0], -this.field6540[1], -this.field6540[2]);
        if (arg0 > 123) {
            this.field9436.SetDirection(-this.field6454[0], -this.field6454[1], -this.field6454[2]);
            this.field9427 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(IZ)Lida;")
    public final class234 method1047(int arg0, boolean arg1) {
        int var3 = -120 % ((31 - arg0) / 45);
        return new class730(this, class438.field6118, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZBILtaa;)V")
    public final void method1020(boolean arg0, boolean arg1, byte arg2, int arg3, class405 arg4) {
        if (arg2 != 65) {
            method3799(null, -89);
        }
        byte var7;
        if (arg3 == 1) {
            var7 = 3;
        } else if (arg3 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg1) {
            var8 |= 0x20;
        }
        if (arg0) {
            var8 |= 0x10;
        }
        this.field9423.SetTextureStageState(this.field6451, var7, var8 | method3799(arg4, arg2 ^ 0x41));
    }

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "(B)V")
    public final void method1062(byte arg0) {
        if (this.field6532.method3626(17)) {
            this.field6448.method177(field9433, 126);
        } else {
            field9433[3] = 0.0F;
            field9433[2] = 0.0F;
            field9433[5] = 1.0F;
            field9433[6] = 0.0F;
            field9433[4] = 0.0F;
            field9433[11] = 0.0F;
            field9433[10] = 1.0F;
            field9433[9] = 0.0F;
            field9433[15] = 1.0F;
            field9433[8] = 0.0F;
            field9433[13] = 0.0F;
            field9433[14] = 0.0F;
            field9433[0] = 1.0F;
            field9433[12] = 0.0F;
            field9433[7] = 0.0F;
            field9433[1] = 0.0F;
        }
        if (arg0 < 118) {
            this.method1058(null, (byte) 33);
        }
        this.field9423.SetTransform(2, field9433);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method1007(Canvas arg0, byte arg1, Object arg2) {
        this.field9424 = (class472) arg2;
        if (arg1 > -70) {
            field9433 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "()V")
    public final void method567() {
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ltaa;I)I")
    private static final int method3799(class405 arg0, int arg1) {
        if (class68.field1225 == arg0) {
            return 2;
        } else if (class165.field2440 == arg0) {
            return 0;
        } else if (class44.field665 == arg0) {
            return 1;
        } else if (class142.field2176 == arg0) {
            return 3;
        } else {
            if (arg1 != 0) {
                field9433 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lt", name = "A", descriptor = "()V")
    public final void method638() {
        this.field9439.method3781((byte) 112);
        super.method638();
    }

    @OriginalMember(owner = "client!lt", name = "ya", descriptor = "()V")
    public final void method619() {
        this.method2715(true, -106);
        this.field9423.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "(I)V")
    public final void method1052(int arg0) {
        this.field9423.method2894(174, this.field6574);
        if (arg0 != -13771) {
            this.field9416 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "()V")
    public final void method533() {
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(BLti;Lkca;)I")
    public static final int method3800(byte arg0, class438 arg1, class82 arg2) {
        if (class438.field6117 == arg1) {
            if (class369.field5177 == arg2) {
                return 22;
            }
            if (class282.field4019 == arg2) {
                return 21;
            }
            if (class643.field9137 == arg2) {
                return 28;
            }
            if (class582.field8222 == arg2) {
                return 50;
            }
            if (class98.field1673 == arg2) {
                return 51;
            }
            if (class218.field3109 == arg2) {
                return 77;
            }
        }
        int var3 = 112 / ((arg0 + 47) / 33);
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([FIIZIILkca;I)Lwda;")
    public final class636 method1032(float[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class82 arg6, int arg7) {
        if (arg7 >= -12) {
            this.method1051(-125);
        }
        return null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lut;Z)V")
    public final void method3801(class124 arg0, boolean arg1) {
        this.method3804(arg0, 110);
        if (this.field9420[this.field6451] != arg0.field1911) {
            this.field9423.SetSamplerState(this.field6451, 1, arg0.field1911 ? 1 : 3);
            this.field9420[this.field6451] = arg0.field1911;
        }
        if (!arg1 && arg0.field1907 != this.field9419[this.field6451]) {
            this.field9423.SetSamplerState(this.field6451, 2, arg0.field1907 ? 1 : 3);
            this.field9419[this.field6451] = arg0.field1907;
        }
    }

    @OriginalMember(owner = "client!lt", name = "Y", descriptor = "(I)V")
    public final void method1019(int arg0) {
        this.field9423.SetViewport(this.field6531, this.field6548, this.field6252, this.field6402, 0.0F, 1.0F);
        if (arg0 > -85) {
            this.field9430 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method628(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class701 {
        this.method554(arg2, arg3);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLuf;)I")
    private static final int method3802(byte arg0, class445 arg1) {
        if (class136.field2115 == arg1) {
            return 2;
        } else if (class543.field7664 == arg1) {
            return 3;
        } else if (class47.field684 == arg1) {
            return 1;
        } else if (class428.field5978 == arg1) {
            return 4;
        } else if (class442.field6159 == arg1) {
            return 6;
        } else if (class657.field9242 == arg1) {
            return 5;
        } else {
            if (arg0 >= -36) {
                field9442 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lt", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Leq;Ljava/lang/Integer;)Lha;")
    public static final class58 createToolkit(Canvas arg0, class149 arg1, class209 arg2, Integer arg3) {
        class672 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class669 var7 = new class669();
            IDirect3D var8 = IDirect3D.method2882(-2147483616, var7);
            D3DCAPS var9 = var8.method2884(var5, var6);
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
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3803(var8, var6, arg3, (byte) 19, var10, var5)) {
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
                    var13 = var8.method2883(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class481 var17) {
                    var13 = var8.method2883(var5, var6, arg0, var11 | 0x20, var10);
                }
                class472 var15 = new class472(var13.method2900(0), var13.method2897());
                var4 = new class672(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2776(121);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method638();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "()V")
    public final void method595() {
    }

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "(I)V")
    public final void method1029(int arg0) {
        if (arg0 != 9 || this.field9427) {
            return;
        }
        this.field9423.LightEnable(0, false);
        this.field9423.LightEnable(1, false);
        this.field9423.SetLight(0, this.field9438);
        this.field9423.SetLight(1, this.field9436);
        this.field9423.LightEnable(0, true);
        this.field9423.LightEnable(1, true);
        this.field9427 = true;
    }

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "(I)V")
    public final void method1061(int arg0) {
        int var2 = -23 % ((-arg0 - 55) / 59);
        if (this.field9428[this.field6451]) {
            this.field9428[this.field6451] = false;
            this.field9423.SetTexture(this.field6451, null);
            this.method1021(-27512);
            this.method1044(110);
        }
    }

    @OriginalMember(owner = "client!lt", name = "bb", descriptor = "(I)V")
    public final void method1055(int arg0) {
        if (this.field6444) {
            field9433[2] = 0.0F;
            field9433[6] = 0.0F;
            field9433[0] = 1.0F;
            field9433[15] = 1.0F;
            field9433[12] = 0.0F;
            field9433[4] = 0.0F;
            field9433[13] = 0.0F;
            field9433[5] = 1.0F;
            field9433[9] = 0.0F;
            field9433[1] = 0.0F;
            field9433[7] = 0.0F;
            field9433[14] = 0.0F;
            field9433[10] = 1.0F;
            field9433[3] = 0.0F;
            field9433[8] = 0.0F;
            field9433[11] = 0.0F;
        } else {
            this.field6441.method177(field9433, 125);
        }
        this.field9423.SetTransform(256, field9433);
        if (arg0 != 11030) {
            this.method1049(76, -94, 14, null, true, -91, false);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljagdx/IDirect3D;IIBLjagdx/D3DPRESENT_PARAMETERS;I)Z")
    private static final boolean method3803(IDirect3D arg0, int arg1, int arg2, byte arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class480.method2880((byte) -47, arg0.method2881(arg5, var9))) {
                return false;
            }
            label87: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field9442.length; var10++) {
                        if (arg0.CheckDeviceType(arg5, arg1, var9.Format, field9442[var10], true) == 0 && arg0.CheckDeviceFormat(arg5, arg1, var9.Format, 1, 1, field9442[var10]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg5, arg1, field9442[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field9421.length; var11++) {
                                if (arg0.CheckDeviceFormat(arg5, arg1, var9.Format, 2, 1, field9421[var11]) == 0 && arg0.CheckDepthStencilMatch(arg5, arg1, var9.Format, field9442[var10], field9421[var11]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg5, arg1, field9421[var10], true, var8) == 0)) {
                                    var6 = field9421[var11];
                                    var7 = field9442[var10];
                                    break label87;
                                }
                            }
                        }
                    }
                }
                arg2--;
            }
            if (arg3 != 19) {
                createToolkit(null, null, null, null);
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

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZIZ[[I)Lsaa;")
    public final class326 method1015(boolean arg0, int arg1, boolean arg2, int[][] arg3) {
        return arg2 ? (class326) null : new class295(this, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1025(int arg0, Canvas arg1, Object arg2) {
        if (arg0 > -3) {
            this.field9423 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method1034(Object arg0, int arg1, Canvas arg2) {
        if (this.field6416 == arg2) {
            Dimension var4 = arg2.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field9423.EndScene();
                this.method3794((byte) -77);
                this.field9423.BeginScene();
            }
        }
        if (arg1 != 15) {
            this.field9417 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILkca;Lti;II)Lwda;")
    public final class636 method1024(int arg0, class82 arg1, class438 arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.method1056(18);
        }
        return new class124(this, arg1, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "(II)V")
    public final void method580(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lcaa;II)V")
    public final void method1059(class302 arg0, int arg1, int arg2) {
        if (arg2 >= -6) {
            this.method1062((byte) 72);
        }
        class263 var4 = (class263) arg0;
        this.field9423.SetStreamSource(arg1, var4.field3841, 0, var4.method1777(127));
    }

    @OriginalMember(owner = "client!lt", name = "cb", descriptor = "(I)V")
    public final void method1045(int arg0) {
        this.field9423.method2894(28, this.field6485 && this.field6549 && this.field6477 >= 0);
        if (arg0 != 6) {
            this.method580(-36, -97);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lai;I)V")
    public final void method3804(class596 arg0, int arg1) {
        this.field9423.SetTexture(this.field6451, arg0.method978((byte) -127));
        if (this.field9441[this.field6451] != arg0.field8712) {
            int var3 = method3798(arg0.field8712, false);
            this.field9423.SetSamplerState(this.field6451, 6, var3);
            this.field9423.SetSamplerState(this.field6451, 5, var3);
            this.field9441[this.field6451] = arg0.field8712;
            if (arg0.field8709 != this.field9422[this.field6451]) {
                this.field9423.SetSamplerState(this.field6451, 7, arg0.field8709 ? method3798(arg0.field8712, false) : 0);
                this.field9422[this.field6451] = arg0.field8709;
            }
        } else if (this.field9422[this.field6451] != arg0.field8709) {
            this.field9423.SetSamplerState(this.field6451, 7, arg0.field8709 ? method3798(arg0.field8712, false) : 0);
            this.field9422[this.field6451] = arg0.field8709;
        }
        if (!this.field9428[this.field6451]) {
            this.field9428[this.field6451] = true;
            this.method1021(-27512);
            this.method1044(126);
        }
        if (arg1 <= 97) {
            this.field9432 = 65;
        }
    }

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "(I)V")
    public final void method1004(int arg0) {
        this.method1012((byte) 46);
        this.method1029(9);
        if (arg0 != 16) {
            this.field9423 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "na", descriptor = "(IIII)[I")
    public final int[] method574(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field9423.method2896(0);
        IDirect3DSurface var7 = this.field9423.method2898(arg2, arg3, 21, 0, 0, true);
        if (class480.method2879(this.field9423.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), (byte) -101) && class480.method2879(var7.LockRect(0, 0, arg2, arg3, 16, this.field9440), (byte) -97)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field9440.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field9440.method2908(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field9440.method2908(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3786(30216);
        var7.method3786(30216);
        return var5;
    }

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "(I)V")
    public final void method1044(int arg0) {
        int var2 = this.field9428[this.field6451] ? method3806((byte) 103, this.field6489[this.field6451]) : 1;
        if (arg0 < 84) {
            this.field9415 = true;
        }
        this.field9423.SetTextureStageState(this.field6451, 1, var2);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILtaa;ZI)V")
    public final void method1009(int arg0, class405 arg1, boolean arg2, int arg3) {
        int var5 = arg0;
        byte var7;
        if (arg3 == 1) {
            var7 = 6;
        } else if (arg3 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg2) {
            var5 = arg0 | 0x10;
        }
        this.field9423.SetTextureStageState(this.field6451, var7, var5 | method3799(arg1, 0));
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILida;BILuf;I)V")
    public final void method1046(int arg0, int arg1, class234 arg2, byte arg3, int arg4, class445 arg5, int arg6) {
        this.field9423.SetIndices(((class730) arg2).field10230);
        int var8 = 10 % ((-arg3 - 11) / 50);
        this.field9423.DrawIndexedPrimitive(method3802((byte) -78, arg5), 0, arg6, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(B)V")
    public final void method1063(byte arg0) {
        if (this.field9425 == null && this.field6515[this.field6451] != class43.field653) {
            if (this.field6515[this.field6451] == class425.field5940) {
                this.field9423.SetTransform(this.field6451 + 16, this.field6486[this.field6451].method177(field9433, -87));
            } else {
                this.field9423.SetTransform(this.field6451 + 16, this.field6486[this.field6451].method184(field9433, 9));
            }
            int var2 = method3805(this.field6515[this.field6451], 121);
            if (this.field9418[this.field6451] != var2) {
                this.field9423.SetTextureStageState(this.field6451, 24, var2);
                this.field9418[this.field6451] = var2;
            }
        } else {
            this.field9423.SetTextureStageState(this.field6451, 24, 0);
            this.field9418[this.field6451] = 0;
        }
        if (arg0 <= 124) {
            this.field9429 = -82;
        }
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(B)V")
    public final void method1038(byte arg0) {
        if (class701.field9845 == this.field6453) {
            this.field9423.SetRenderState(19, 5);
            this.field9423.SetRenderState(20, 6);
        } else if (class417.field5853 == this.field6453) {
            this.field9423.SetRenderState(19, 2);
            this.field9423.SetRenderState(20, 2);
        } else if (class76.field1450 == this.field6453) {
            this.field9423.SetRenderState(19, 9);
            this.field9423.SetRenderState(20, 2);
        }
        if (arg0 >= -84) {
            this.method617(54);
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Lfga;I)I")
    private static final int method3805(class254 arg0, int arg1) {
        if (arg1 <= 40) {
            createToolkit(null, null, null, null);
        }
        if (class344.field4830 == arg0) {
            return 1;
        } else if (class56.field1049 == arg0) {
            return 2;
        } else if (class8.field128 == arg0) {
            return 3;
        } else if (class425.field5940 == arg0) {
            return 4;
        } else if (class510.field7276 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Luf;III)V")
    public final void method1022(class445 arg0, int arg1, int arg2, int arg3) {
        int var5 = -67 / ((74 - arg1) / 32);
        this.field9423.DrawPrimitive(method3802((byte) -86, arg0), arg3, arg2);
    }

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "(B)V")
    public final void method1018(byte arg0) {
        this.field9423.method2894(27, this.field6534);
        if (arg0 <= 113) {
            this.method1009(-4, null, true, 125);
        }
    }

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "()V")
    public final void method590() {
        IDirect3DEventQuery var1 = this.field9423.method2899();
        if (class480.method2879(var1.Issue(), (byte) -127)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3786(30216);
    }

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "(B)V")
    public final void method1008(byte arg0) {
        this.field9423.SetRenderState(60, this.field6463);
        if (arg0 <= 5) {
            this.method599();
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)V")
    public final void method564(boolean arg0) {
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILti;Lkca;)Z")
    public final boolean method1035(int arg0, class438 arg1, class82 arg2) {
        if (arg0 >= -86) {
            this.method1019(97);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class480.method2879(this.field9434.method2881(this.field9429, var4), (byte) -122) && class480.method2879(this.field9434.CheckDeviceFormat(this.field9429, this.field9432, var4.Format, 0, 3, method3800((byte) -118, arg1, arg2)), (byte) -98);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III[IZIZ)Lwda;")
    public final class636 method1049(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg6) {
            this.method1043((byte) -23);
        }
        return new class124(this, arg2, arg5, arg4, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!lt", name = "C", descriptor = "(I)V")
    public final void method1021(int arg0) {
        if (arg0 != -27512) {
            this.method1050((byte) 125);
        }
        int var2 = this.field9428[this.field6451] ? method3806((byte) -123, this.field6471[this.field6451]) : 1;
        this.field9423.SetTextureStageState(this.field6451, 4, var2);
    }

    @OriginalMember(owner = "client!lt", name = "Z", descriptor = "(I)V")
    public final void method1017(int arg0) {
        this.field9423.method2894(14, this.field6513 && this.field6473);
        if (arg0 != 0) {
            method3806((byte) -87, null);
        }
    }

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "(I)V")
    public final void method1030(int arg0) {
        if (arg0 != -5578) {
            this.field9437 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BZ)Lcaa;")
    public final class302 method1036(byte arg0, boolean arg1) {
        if (arg0 >= -34) {
            this.field9416 = null;
        }
        return new class263(this, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(FFF)V")
    public final void method606(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "(I)V")
    public final void method1027(int arg0) {
        this.field9423.method2894(137, this.field6520 && !this.field6501);
        int var2 = 111 / ((-arg0 - 60) / 51);
    }

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "(B)V")
    public final void method1050(byte arg0) {
        this.field9423.method2894(15, this.field6541);
        if (arg0 != 111) {
            this.field9415 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "GA", descriptor = "(I)V")
    public final void method617(int arg0) {
        this.field9423.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public final Object method1058(Canvas arg0, byte arg1) {
        if (arg1 < 54) {
            this.field9419 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "(B)V")
    public final void method1033(byte arg0) {
        if (arg0 <= -25) {
            this.field9423.SetScissorRect(this.field6531 + this.field6468, this.field6548 + this.field6511, this.field6521, this.field6459);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLrr;)I")
    private static final int method3806(byte arg0, class361 arg1) {
        if (class140.field2165 == arg1) {
            return 2;
        } else if (class571.field8118 == arg1) {
            return 4;
        } else if (class218.field3121 == arg1) {
            return 26;
        } else if (class316.field4492 == arg1) {
            return 7;
        } else if (class306.field4313 == arg1) {
            return 10;
        } else {
            int var2 = 97 / ((-arg0 - 51) / 48);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "(B)V")
    public final void method1012(byte arg0) {
        float var2 = this.field6458 ? this.field6507 : 0.0F;
        float var3 = this.field6458 ? -this.field6455 : 0.0F;
        this.field9438.SetDiffuse(this.field6474 * var2, this.field6536 * var2, this.field6547 * var2, 0.0F);
        this.field9436.SetDiffuse(this.field6474 * var3, this.field6536 * var3, this.field6547 * var3, 0.0F);
        this.field9427 = false;
        if (arg0 != 46) {
            this.field9431 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "(I)V")
    public final void method1048(int arg0) {
        for (int var2 = 0; var2 < this.field6546; var2++) {
            this.field9423.SetSamplerState(var2, 7, 0);
            this.field9423.SetSamplerState(var2, 6, 2);
            this.field9423.SetSamplerState(var2, 5, 2);
            this.field9423.SetSamplerState(var2, 1, 1);
            this.field9423.SetSamplerState(var2, 2, 1);
            this.field9441[var2] = class267.field3864;
            this.field9420[var2] = this.field9419[var2] = true;
            this.field9422[var2] = false;
            this.field9418[var2] = 0;
        }
        this.field9423.SetTextureStageState(0, 6, 1);
        this.field9423.SetRenderState(9, 2);
        this.field9423.SetRenderState(23, 4);
        this.field9423.SetRenderState(25, 5);
        this.field9423.SetRenderState(24, 0);
        this.field9423.SetRenderState(22, 2);
        this.field9423.SetRenderState(147, 1);
        if (arg0 != 9053) {
            this.method532(-109, 79, 54, 79, -0.6193379179964857D);
        }
        this.field9423.SetRenderState(145, 1);
        this.field9423.method2889(38, 0.95F);
        this.field9423.SetRenderState(140, 3);
        this.field9438.SetType(3);
        this.field9436.SetType(3);
        this.field9416.SetType(1);
        this.field9427 = false;
        super.method1048(arg0);
    }

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "(B)V")
    public final void method1043(byte arg0) {
        int var2 = 85 % ((arg0 + 62) / 43);
        this.field9423.SetTransform(3, this.field6478);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Luaa;)V")
    public final void method610(class116 arg0) {
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)V")
    public final void method554(int arg0, int arg1) throws class701 {
        this.field9423.EndScene();
        if (this.field9424.method2860(111)) {
            this.field9435 = 0;
            if (class480.method2880((byte) -41, this.field9424.method2861(0, 0))) {
                this.method3794((byte) -93);
            }
        } else if ((++this.field9435) <= 50) {
            this.method3794((byte) -96);
        } else {
            throw new class701();
        }
        this.field9423.BeginScene();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lhi;Z)V")
    public final void method1014(class203 arg0, boolean arg1) {
        if (arg1) {
            this.method564(false);
        }
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field9423.SetVertexDeclaration(var3.field4572);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/wf;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lgk;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Leq;I)V")
    private class672(int arg0, int arg1, Canvas arg2, class669 arg3, IDirect3D arg4, IDirect3DDevice arg5, class472 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class149 arg9, class209 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field9423 = arg5;
        this.field9439 = arg3;
        this.field9434 = arg4;
        this.field9417 = arg8;
        this.field9432 = arg1;
        this.field9424 = arg6;
        this.field9429 = arg0;
        this.field9426 = arg7;
        this.field9438 = new class482(this.field9439);
        this.field9436 = new class482(this.field9439);
        this.field9416 = new class482(this.field9439);
        this.field9440 = new PixelBuffer(this.field9439);
        this.field9437 = new GeometryBuffer(this.field9439);
        new GeometryBuffer(this.field9439);
        this.field6465 = (this.field9417.TextureCaps & 0x2000) != 0;
        this.field9430 = (this.field9417.TextureCaps & 0x4000) != 0;
        this.field6518 = (this.field9417.TextureCaps & 0x800) != 0;
        this.field9415 = (this.field9417.TextureCaps & 0x2) == 0;
        this.field6539 = this.field9417.MaxActiveLights > 0 ? this.field9417.MaxActiveLights : 8;
        this.field6546 = this.field9417.MaxSimultaneousTextures;
        this.field9431 = (this.field9417.TextureCaps & 0x10000) != 0;
        this.field6510 = this.field6512 > 0 || this.field9434.CheckDeviceMultiSampleType(this.field9429, this.field9432, this.field9426.BackBufferFormat, true, 2) == 0;
        this.field9420 = new boolean[this.field6546];
        this.field9441 = new class634[this.field6546];
        this.field9419 = new boolean[this.field6546];
        this.field9418 = new int[this.field6546];
        this.field9422 = new boolean[this.field6546];
        this.field9428 = new boolean[this.field6546];
        this.field9423.BeginScene();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lc;Lvi;)Luaa;")
    public final class116 method544(class185 arg0, class536 arg1) {
        return null;
    }
}
