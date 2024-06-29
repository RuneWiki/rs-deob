import jaclib.peer.class672;
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
import jagdx.class483;
import jagdx.class484;
import jagdx.class485;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class225 extends class367 {

    @OriginalMember(owner = "client!bea", name = "Gg", descriptor = "I")
    private int field2903 = 0;

    @OriginalMember(owner = "client!bea", name = "Tg", descriptor = "Z")
    private boolean field2916 = false;

    @OriginalMember(owner = "client!bea", name = "ah", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!bea", name = "fh", descriptor = "Ljaclib/peer/jaa;")
    public class672 field2928;

    @OriginalMember(owner = "client!bea", name = "Vg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field2918;

    @OriginalMember(owner = "client!bea", name = "Ng", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!bea", name = "Ig", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field2905;

    @OriginalMember(owner = "client!bea", name = "hh", descriptor = "Loj;")
    private class383 field2930;

    @OriginalMember(owner = "client!bea", name = "Qg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field2913;

    @OriginalMember(owner = "client!bea", name = "Mg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field2909;

    @OriginalMember(owner = "client!bea", name = "Wg", descriptor = "Ljagdx/D3DLIGHT;")
    private class485 field2919;

    @OriginalMember(owner = "client!bea", name = "bh", descriptor = "Ljagdx/D3DLIGHT;")
    private class485 field2924;

    @OriginalMember(owner = "client!bea", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class485 field2912;

    @OriginalMember(owner = "client!bea", name = "Sg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field2915;

    @OriginalMember(owner = "client!bea", name = "Jg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field2906;

    @OriginalMember(owner = "client!bea", name = "Ug", descriptor = "Z")
    public boolean field2917;

    @OriginalMember(owner = "client!bea", name = "eh", descriptor = "Z")
    public boolean field2927;

    @OriginalMember(owner = "client!bea", name = "gh", descriptor = "Z")
    public boolean field2929;

    @OriginalMember(owner = "client!bea", name = "Xg", descriptor = "[Z")
    private boolean[] field2920;

    @OriginalMember(owner = "client!bea", name = "Lg", descriptor = "[Z")
    private boolean[] field2908;

    @OriginalMember(owner = "client!bea", name = "Rg", descriptor = "[Z")
    private boolean[] field2914;

    @OriginalMember(owner = "client!bea", name = "ch", descriptor = "[Z")
    private boolean[] field2925;

    @OriginalMember(owner = "client!bea", name = "Kg", descriptor = "[I")
    private int[] field2907;

    @OriginalMember(owner = "client!bea", name = "Zg", descriptor = "[Lnd;")
    private class545[] field2922;

    @OriginalMember(owner = "client!bea", name = "Yg", descriptor = "[F")
    private static float[] field2921 = new float[16];

    @OriginalMember(owner = "client!bea", name = "dh", descriptor = "[I")
    private static int[] field2926 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!bea", name = "Hg", descriptor = "[I")
    private static int[] field2904 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!bea", name = "Og", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2911;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIZLkt;III[F)Ljs;", line = 5)
    public final class334 method1278(int arg0, int arg1, boolean arg2, class159 arg3, int arg4, int arg5, int arg6, float[] arg7) {
        int var9 = -10 / ((57 - arg4) / 33);
        return null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)V", line = 15)
    public final void method345(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "(II)V", line = 17)
    public final void method358(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "(Z)V", line = 21)
    public final void method1279(boolean arg0) {
        this.field5084 = (this.field5097 - this.field5093);
        this.field5107 = (float) (-this.field5073) + this.field5084;
        if (arg0) {
            field2926 = null;
        }
        if (this.field5107 < (float) this.field5132) {
            this.field5107 = this.field5132;
        }
        this.field2918.method2732(36, this.field5107);
        this.field2918.method2732(37, this.field5084);
        this.field2918.SetRenderState(34, this.field5128);
    }

    @OriginalMember(owner = "client!bea", name = "L", descriptor = "(I)V", line = 42)
    public final void method1280(int arg0) {
        int var2 = -52 % ((-arg0 - 62) / 42);
        if (this.field2911 != null || this.field5136[this.field5071] == class761.field10620) {
            this.field2918.SetTextureStageState(this.field5071, 24, 0);
            this.field2907[this.field5071] = 0;
            return;
        }
        if (this.field5136[this.field5071] == class536.field7270) {
            this.field2918.SetTransform(this.field5071 + 16, this.field5101[this.field5071].method3650(field2921, 22));
        } else {
            this.field2918.SetTransform(this.field5071 + 16, this.field5101[this.field5071].method3649((byte) -91, field2921));
        }
        int var3 = method1289(this.field5136[this.field5071], 2474);
        if (this.field2907[this.field5071] != var3) {
            this.field2918.SetTextureStageState(this.field5071, 24, var3);
            this.field2907[this.field5071] = var3;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(BZ)Lug;", line = 71)
    public final class562 method1281(byte arg0, boolean arg1) {
        if (arg0 != 84) {
            this.field2914 = null;
        }
        return new class458(this, class594.field8278, arg1);
    }

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "()V", line = 81)
    public final void method383() {
        this.field2928.method3804((byte) -125);
        super.method383();
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V", line = 88)
    public final void method369(boolean arg0) {
    }

    @OriginalMember(owner = "client!bea", name = "P", descriptor = "(I)V", line = 91)
    public final void method1282(int arg0) {
        if (this.field5043.method2843(98)) {
            this.field5037.method3649((byte) -111, field2921);
        } else {
            field2921[15] = 1.0F;
            field2921[1] = 0.0F;
            field2921[11] = 0.0F;
            field2921[12] = 0.0F;
            field2921[8] = 0.0F;
            field2921[13] = 0.0F;
            field2921[4] = 0.0F;
            field2921[5] = 1.0F;
            field2921[6] = 0.0F;
            field2921[14] = 0.0F;
            field2921[7] = 0.0F;
            field2921[2] = 0.0F;
            field2921[3] = 0.0F;
            field2921[0] = 1.0F;
            field2921[9] = 0.0F;
            field2921[10] = 1.0F;
        }
        if (arg0 == 0) {
            this.field2918.SetTransform(2, field2921);
        }
    }

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "(B)F", line = 128)
    public final float method1283(byte arg0) {
        return arg0 == 56 ? -0.5F : 0.34527656F;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lef;B)I", line = 138)
    private static final int method1284(class488 arg0, byte arg1) {
        if (arg1 <= 125) {
            return -28;
        } else if (class71.field769 == arg0) {
            return 2;
        } else if (class293.field3928 == arg0) {
            return 0;
        } else if (class547.field7717 == arg0) {
            return 1;
        } else if (class421.field5897 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "()V", line = 162)
    public final void method388() {
    }

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "()Leca;", line = 166)
    public final class758 method418() {
        D3DADAPTER_IDENTIFIER var1 = this.field2909.method2715(this.field2923, 0);
        return new class758(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILoq;)I", line = 174)
    private static final int method1285(int arg0, class362 arg1) {
        if (class246.field3199 == arg1) {
            return 2;
        } else if (class100.field1321 == arg1) {
            return 3;
        } else if (class621.field8701 == arg1) {
            return 1;
        } else if (class387.field5460 == arg1) {
            return 4;
        } else if (class401.field5677 == arg1) {
            return 6;
        } else if (class300.field4025 == arg1) {
            return 5;
        } else {
            int var2 = -122 % ((-arg0 - 8) / 44);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "(I)V", line = 208)
    public final void method1286(int arg0) {
        int var2 = 92 / ((-arg0 - 16) / 50);
        if (this.field2916) {
            return;
        }
        this.field2918.LightEnable(0, false);
        this.field2918.LightEnable(1, false);
        this.field2918.SetLight(0, this.field2919);
        this.field2918.SetLight(1, this.field2924);
        this.field2918.LightEnable(0, true);
        this.field2918.LightEnable(1, true);
        this.field2916 = true;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;Z)V", line = 226)
    public final void method1287(IDirect3DVertexShader arg0, boolean arg1) {
        this.field2911 = arg0;
        this.field2918.SetVertexShader(arg0);
        this.method1280(-114);
        if (!arg1) {
            this.field2910 = -60;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lqp;)V", line = 237)
    public final void method339(class657 arg0) {
    }

    @OriginalMember(owner = "client!bea", name = "Z", descriptor = "(I)V", line = 242)
    public final void method1288(int arg0) {
        this.field2918.method2726(15, this.field5091);
        if (arg0 != 0) {
            this.field2908 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lqc;I)I", line = 252)
    private static final int method1289(class743 arg0, int arg1) {
        if (arg1 != 2474) {
            field2926 = null;
        }
        if (class167.field2096 == arg0) {
            return 1;
        } else if (class536.field7270 == arg0) {
            return 2;
        } else if (class555.field7829 == arg0) {
            return 3;
        } else if (class216.field2614 == arg0) {
            return 4;
        } else if (class554.field7825 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "()V", line = 283)
    public final void method458() {
        IDirect3DEventQuery var1 = this.field2918.method2724();
        if (class483.method2718(-21593, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3801(99);
    }

    @OriginalMember(owner = "client!bea", name = "I", descriptor = "()I", line = 306)
    public final int method459() {
        return 0;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Loq;IBI)V", line = 317)
    public final void method1290(class362 arg0, int arg1, byte arg2, int arg3) {
        this.field2918.DrawPrimitive(method1285(-101, arg0), arg1, arg3);
        if (arg2 > 8) {
            ;
        }
    }

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "(II)Lci;", line = 330)
    public final class451 method440(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "()V", line = 337)
    public final void method441() {
    }

    @OriginalMember(owner = "client!bea", name = "W", descriptor = "(I)V", line = 340)
    public final void method1291(int arg0) {
        this.field2918.SetViewport(this.field5070, this.field5114, this.field4913, this.field4959, 0.0F, 1.0F);
        if (arg0 != -11155) {
            this.field2929 = true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(ZI)Ltea;", line = 350)
    public final class241 method1292(boolean arg0, int arg1) {
        if (arg1 <= 40) {
            this.method1318(-48);
        }
        return new class528(this, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lkq;ZLkt;)Z", line = 360)
    public final boolean method1293(class594 arg0, boolean arg1, class159 arg2) {
        if (!arg1) {
            method1302(19, null, null);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class483.method2718(-21593, this.field2909.method2717(this.field2923, var4)) && class483.method2718(-21593, this.field2909.CheckDeviceFormat(this.field2923, this.field2910, var4.Format, 0, 4, method1302(-1935, arg2, arg0)));
    }

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "(I)V", line = 373)
    public final void method1294(int arg0) {
        if (arg0 != -5668) {
            field2904 = null;
        }
        this.field2918.method2726(137, this.field5135 && !this.field5129);
    }

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "(I)V", line = 383)
    public final synchronized void method430(int arg0) {
        this.field2928.method3802((byte) 126);
        super.method430(arg0);
    }

    @OriginalMember(owner = "client!bea", name = "K", descriptor = "(I)V", line = 393)
    public final void method1295(int arg0) {
        if (arg0 != 28976) {
            this.field2916 = false;
        }
        this.field2918.SetScissorRect(this.field5094 + this.field5070, this.field5114 + this.field5050, this.field5067, this.field5130);
    }

    @OriginalMember(owner = "client!bea", name = "na", descriptor = "(IIII)[I", line = 404)
    public final int[] method460(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field2918.method2736(0);
        IDirect3DSurface var7 = this.field2918.method2730(arg2, arg3, 21, 0, 0, true);
        if (class483.method2718(-21593, this.field2918.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class483.method2718(-21593, var7.LockRect(0, 0, arg2, arg3, 16, this.field2915))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field2915.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field2915.method2742(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field2915.method2742(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3801(71);
        var7.method3801(80);
        return var5;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "()V", line = 444)
    public final void method362() {
    }

    @OriginalMember(owner = "client!bea", name = "bb", descriptor = "(I)V", line = 448)
    public final void method1296(int arg0) {
        if (arg0 == 12362) {
            this.field2918.SetRenderState(60, this.field5140);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLil;)I", line = 459)
    private static final int method1297(boolean arg0, class7 arg1) {
        if (arg0) {
            field2921 = null;
        }
        if (class365.field4838 == arg1) {
            return 2;
        } else if (class199.field2365 == arg1) {
            return 4;
        } else if (class94.field1233 == arg1) {
            return 26;
        } else if (class669.field9307 == arg1) {
            return 7;
        } else if (class308.field4182 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(IB)Lew;", line = 491)
    public final class493 method1298(int arg0, byte arg1) {
        int var3 = -6 % ((arg1 - 39) / 56);
        if (arg0 == 3) {
            return new class113(this, this.field5016);
        } else if (arg0 == 4) {
            return new class172(this, this.field5016, this.field4945);
        } else if (arg0 == 8) {
            return new class95(this, this.field5016, this.field4945);
        } else {
            return super.method1298(arg0, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "()Z", line = 531)
    public final boolean method377() {
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "(B)V", line = 540)
    public final void method1299(byte arg0) {
        this.method1335((byte) -118);
        int var2 = 16 / ((69 - arg0) / 53);
        this.method1286(73);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILnd;)I", line = 550)
    private static final int method1300(int arg0, class545 arg1) {
        if (class705.field9884 == arg1) {
            return 2;
        } else if (class163.field2049 == arg1) {
            return 1;
        } else if (arg0 == 26476) {
            throw new IllegalArgumentException();
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ldi;Ldi;FLdi;)Ldi;", line = 567)
    public final class128 method378(class128 arg0, class128 arg1, float arg2, class128 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lcm;B)V", line = 574)
    public final void method1301(class729 arg0, byte arg1) {
        if (arg1 != 26) {
            this.method1315(-76, null, null);
        }
        int var3 = 0;
        if (class686.field9624 == arg0) {
            var3 = 65536;
        } else if (class55.field558 == arg0) {
            var3 = 131072;
        } else if (class514.field6953 == arg0) {
            var3 = 196608;
        }
        this.field2918.SetTextureStageState(this.field5071, 11, var3 | this.field5071);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(ILkt;Lkq;)I", line = 597)
    public static final int method1302(int arg0, class159 arg1, class594 arg2) {
        if (class594.field8277 == arg2) {
            if (class450.field6286 == arg1) {
                return 22;
            }
            if (class758.field10567 == arg1) {
                return 21;
            }
            if (class695.field9710 == arg1) {
                return 28;
            }
            if (class431.field6067 == arg1) {
                return 50;
            }
            if (class423.field5926 == arg1) {
                return 51;
            }
            if (class268.field3544 == arg1) {
                return 77;
            }
        }
        if (arg0 != -1935) {
            method1285(119, null);
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "(B)V", line = 635)
    public final void method1303(byte arg0) {
        if (this.field5031) {
            field2921[5] = 1.0F;
            field2921[9] = 0.0F;
            field2921[7] = 0.0F;
            field2921[3] = 0.0F;
            field2921[11] = 0.0F;
            field2921[10] = 1.0F;
            field2921[4] = 0.0F;
            field2921[13] = 0.0F;
            field2921[2] = 0.0F;
            field2921[6] = 0.0F;
            field2921[12] = 0.0F;
            field2921[0] = 1.0F;
            field2921[14] = 0.0F;
            field2921[1] = 0.0F;
            field2921[15] = 1.0F;
            field2921[8] = 0.0F;
        } else {
            this.field5034.method3649((byte) -90, field2921);
        }
        int var2 = 2 % ((26 - arg0) / 53);
        this.field2918.SetTransform(256, field2921);
    }

    @OriginalMember(owner = "client!bea", name = "ya", descriptor = "()V", line = 671)
    public final void method370() {
        this.method2142(0, true);
        this.field2918.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/jaa;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Loj;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lni;I)V", line = 723)
    private class225(int arg0, int arg1, Canvas arg2, class672 arg3, IDirect3D arg4, IDirect3DDevice arg5, class383 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class152 arg9, class522 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field2923 = arg0;
            this.field2928 = arg3;
            this.field2918 = arg5;
            this.field2910 = arg1;
            this.field2905 = arg7;
            this.field2930 = arg6;
            this.field2913 = arg8;
            this.field2909 = arg4;
            this.field2919 = new class485(this.field2928);
            this.field2924 = new class485(this.field2928);
            this.field2912 = new class485(this.field2928);
            this.field2915 = new PixelBuffer(this.field2928);
            this.field2906 = new GeometryBuffer(this.field2928);
            new GeometryBuffer(this.field2928);
            this.field5100 = this.field2913.MaxSimultaneousTextures;
            this.field2917 = (this.field2913.TextureCaps & 0x10000) != 0;
            this.field5061 = (this.field2913.TextureCaps & 0x800) != 0;
            this.field5057 = this.field2913.MaxActiveLights > 0 ? this.field2913.MaxActiveLights : 8;
            this.field2927 = (this.field2913.TextureCaps & 0x4000) != 0;
            this.field5080 = (this.field2913.TextureCaps & 0x2000) != 0;
            this.field2929 = (this.field2913.TextureCaps & 0x2) == 0;
            this.field5051 = this.field5108 > 0 || this.field2909.CheckDeviceMultiSampleType(this.field2923, this.field2910, this.field2905.BackBufferFormat, true, 2) == 0;
            this.field2920 = new boolean[this.field5100];
            this.field2908 = new boolean[this.field5100];
            this.field2914 = new boolean[this.field5100];
            this.field2925 = new boolean[this.field5100];
            this.field2907 = new int[this.field5100];
            this.field2922 = new class545[this.field5100];
            this.field2918.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method342(-1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Loq;IIILug;II)V", line = 685)
    public final void method1304(class362 arg0, int arg1, int arg2, int arg3, class562 arg4, int arg5, int arg6) {
        this.field2918.SetIndices(((class458) arg4).field6342);
        if (arg3 != 26810) {
            this.field2914 = null;
        }
        this.field2918.DrawIndexedPrimitive(method1285(-85, arg0), 0, arg5, arg1, arg2, arg6);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 702)
    public final void method1305(int arg0, Object arg1, Canvas arg2) {
        if (arg0 != 0) {
            method1332(4, -101, null, -18, null, 124);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V", line = 712)
    public final void method1306(int arg0, IDirect3DPixelShader arg1) {
        if (arg0 != 28) {
            method1297(true, null);
        }
        this.field2918.SetPixelShader(arg1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILkt;BLkq;)Ljs;", line = 770)
    public final class334 method1307(int arg0, int arg1, class159 arg2, byte arg3, class594 arg4) {
        if (arg3 != 45) {
            this.method423();
        }
        return new class592(this, arg2, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Lku;", line = 780)
    public final class379 method343(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!bea", name = "eb", descriptor = "(I)Z", line = 788)
    private final boolean method1308(int arg0) {
        if (arg0 >= -127) {
            return true;
        }
        int var2 = this.field2918.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class383 var3 = (class383) this.field4957;
            this.method2133((byte) -105);
            var3.method2251((byte) 88);
            this.field2905.BackBufferWidth = 0;
            this.field2905.BackBufferHeight = 0;
            if (method1332(this.field5108, this.field2923, this.field2909, 0, this.field2905, this.field2910)) {
                int var4 = this.field2918.Reset(this.field2905);
                if (class483.method2718(-21593, var4)) {
                    var3.method2249(this.field2918.method2721(), (byte) -85, this.field2918.method2735(0));
                    this.method2182((byte) -61);
                    this.method1339(1);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLoha;)V", line = 828)
    public final void method1309(boolean arg0, class741 arg1) {
        this.method1310(arg1, 0);
        if (!this.field2908[this.field5071]) {
            this.field2918.SetSamplerState(this.field5071, 1, 1);
            this.field2908[this.field5071] = true;
        }
        if (!this.field2920[this.field5071]) {
            this.field2918.SetSamplerState(this.field5071, 2, 1);
            this.field2920[this.field5071] = true;
        }
        if (arg0) {
            this.field2917 = true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "()V", line = 850)
    public final void method448() {
    }

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "()Z", line = 853)
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lbt;I)V", line = 861)
    public final void method1310(class44 arg0, int arg1) {
        this.field2918.SetTexture(this.field5071, arg0.method271((byte) 18));
        if (this.field2922[this.field5071] != arg0.field478) {
            int var3 = method1300(26476, arg0.field478);
            this.field2918.SetSamplerState(this.field5071, 6, var3);
            this.field2918.SetSamplerState(this.field5071, 5, var3);
            this.field2922[this.field5071] = arg0.field478;
            if (this.field2925[this.field5071] != arg0.field475) {
                this.field2918.SetSamplerState(this.field5071, 7, arg0.field475 ? method1300(26476, arg0.field478) : 0);
                this.field2925[this.field5071] = arg0.field475;
            }
        } else if (arg0.field475 != this.field2925[this.field5071]) {
            this.field2918.SetSamplerState(this.field5071, 7, arg0.field475 ? method1300(26476, arg0.field478) : 0);
            this.field2925[this.field5071] = arg0.field475;
        }
        if (arg1 == 0 && !this.field2914[this.field5071]) {
            this.field2914[this.field5071] = true;
            this.method1326((byte) -48);
            this.method1341(2);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(BI)V", line = 903)
    public final void method1311(byte arg0, int arg1) {
        if (arg0 < 0) {
            this.field2907 = null;
        }
        this.field2918.SetTextureStageState(this.field5071, 11, arg1);
    }

    @OriginalMember(owner = "client!bea", name = "C", descriptor = "(B)V", line = 913)
    public final void method1312(byte arg0) {
        this.field2919.SetDirection(-this.field5088[0], -this.field5088[1], -this.field5088[2]);
        this.field2924.SetDirection(-this.field5064[0], -this.field5064[1], -this.field5064[2]);
        if (arg0 == 80) {
            this.field2916 = false;
        }
    }

    @OriginalMember(owner = "client!bea", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lni;Ljava/lang/Integer;)Lha;", line = 926)
    public static final class60 createToolkit(Canvas arg0, class152 arg1, class522 arg2, Integer arg3) {
        class225 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class672 var7 = new class672();
            IDirect3D var8 = IDirect3D.method2716(-2147483616, var7);
            D3DCAPS var9 = var8.method2714(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1332(arg3, var5, var8, 0, var10, var6)) {
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
                    var13 = var8.method2713(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class484 var17) {
                    var13 = var8.method2713(var5, var6, arg0, var11 | 0x20, var10);
                }
                class383 var15 = new class383(var13.method2735(0), var13.method2721());
                var4 = new class225(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2124(true);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method383();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!bea", name = "G", descriptor = "(I)V", line = 1024)
    public final void method1313(int arg0) {
        this.field2919.SetAmbient(this.field5103 * this.field5068, this.field5068 * this.field5041, this.field5083 * this.field5068, 0.0F);
        this.field2916 = false;
        if (arg0 != -24391) {
            this.method1279(true);
        }
    }

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "(B)V", line = 1035)
    public final void method1314(byte arg0) {
        if (arg0 != -122) {
            this.method358(29, 70);
        }
        this.field2918.method2726(174, this.field5164);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILkt;Lkq;)Z", line = 1046)
    public final boolean method1315(int arg0, class159 arg1, class594 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 != 0) {
            method1332(-93, -77, null, -97, null, -25);
        }
        return class483.method2718(-21593, this.field2909.method2717(this.field2923, var4)) && class483.method2718(-21593, this.field2909.CheckDeviceFormat(this.field2923, this.field2910, var4.Format, 0, 3, method1302(-1935, arg1, arg2)));
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([Ldia;I)Lqa;", line = 1057)
    public final class251 method1316(class235[] arg0, int arg1) {
        return arg1 == 6 ? new dxVertexLayout(this, arg0) : (class251) null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB[IZIII)Ljs;", line = 1069)
    public final class334 method1317(int arg0, byte arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 77 % ((arg1 - 60) / 58);
        return new class592(this, arg4, arg5, arg3, arg2, arg0, arg6);
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "(I)V", line = 1078)
    public final void method1318(int arg0) {
        if (arg0 == 0) {
            this.field2918.method2726(14, this.field5098 && this.field5112);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)V", line = 1093)
    public final void method373(int arg0, int arg1) throws class353 {
        this.field2918.EndScene();
        if (this.field2930.method2250(0)) {
            this.field2903 = 0;
            if (class483.method2719(-7175, this.field2930.method2248(true, 0))) {
                this.method1308(-128);
            }
        } else if (++this.field2903 <= 50) {
            this.method1308(-128);
        } else {
            throw new class353();
        }
        this.field2918.BeginScene();
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([BZLkt;IIZII)Ljs;", line = 1117)
    public final class334 method1319(byte[] arg0, boolean arg1, class159 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg1) {
            this.method1342((byte) 12);
        }
        return new class592(this, arg2, arg7, arg4, arg5, arg0, arg6, arg3);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V", line = 1127)
    public final void method1320(Object arg0, Canvas arg1, byte arg2) {
        this.field2930 = (class383) arg0;
        if (arg2 != -34) {
            this.field2928 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(B)V", line = 1138)
    public final void method1321(byte arg0) {
        int var2 = 40 / ((arg0 + 49) / 47);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLvs;)V", line = 1145)
    public final void method1322(boolean arg0, class592 arg1) {
        this.method1310(arg1, 0);
        if (this.field2908[this.field5071] != arg1.field8254) {
            this.field2918.SetSamplerState(this.field5071, 1, arg1.field8254 ? 1 : 3);
            this.field2908[this.field5071] = arg1.field8254;
        }
        if (arg0) {
            this.method1315(-63, null, null);
        }
        if (arg1.field8255 != this.field2920[this.field5071]) {
            this.field2918.SetSamplerState(this.field5071, 2, arg1.field8255 ? 1 : 3);
            this.field2920[this.field5071] = arg1.field8255;
        }
    }

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "(B)V", line = 1168)
    public final void method1323(byte arg0) {
        this.field2918.method2726(28, this.field5063 && this.field5054 && this.field5073 >= 0);
        if (arg0 != 112) {
            field2926 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "GA", descriptor = "(I)V", line = 1179)
    public final void method402(int arg0) {
        this.field2918.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ[[II)Ltd;", line = 1187)
    public final class455 method1324(int arg0, boolean arg1, int[][] arg2, int arg3) {
        return arg0 == 8 ? new class714(this, arg3, arg1, arg2) : (class455) null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZLtea;)V", line = 1199)
    public final void method1325(int arg0, boolean arg1, class241 arg2) {
        class528 var4 = (class528) arg2;
        this.field2918.SetStreamSource(arg0, var4.field7078, 0, var4.method2927((byte) -22));
        if (!arg1) {
            field2904 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "(B)V", line = 1211)
    public final void method1326(byte arg0) {
        int var2 = this.field2914[this.field5071] ? method1297(false, this.field5131[this.field5071]) : 1;
        this.field2918.SetTextureStageState(this.field5071, 4, var2);
        if (arg0 != -48) {
            this.field2920 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "(I)V", line = 1222)
    public final void method1327(int arg0) {
        if (this.field2914[this.field5071]) {
            this.field2914[this.field5071] = false;
            this.field2918.SetTexture(this.field5071, null);
            this.method1326((byte) -48);
            this.method1341(2);
        }
        if (arg0 != 0) {
            this.field2916 = true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1239)
    public final Object method1328(Canvas arg0, int arg1) {
        return arg1 == -8401 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "(B)V", line = 1250)
    public final void method1329(byte arg0) {
        int var2 = 9 / ((arg0 + 6) / 34);
        this.field2918.SetTransform(3, this.field5058);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lci;Lku;)Lqp;", line = 1263)
    public final class657 method443(class451 arg0, class379 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lqa;B)V", line = 1272)
    public final void method1330(class251 arg0, byte arg1) {
        int var3 = 55 / ((arg1 + 4) / 48);
        dxVertexLayout var4 = (dxVertexLayout) arg0;
        this.field2918.SetVertexDeclaration(var4.field4360);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V", line = 1283)
    public final void method1331(Canvas arg0, Object arg1, int arg2) {
        if (arg2 > -40) {
            this.method1321((byte) -56);
        }
        if (this.field4971 != arg0) {
            return;
        }
        Dimension var4 = arg0.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field2918.EndScene();
            this.method1308(-128);
            this.field2918.BeginScene();
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILjagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;I)Z", line = 1311)
    private static final boolean method1332(int arg0, int arg1, IDirect3D arg2, int arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class483.method2719(arg3 - 7175, arg2.method2717(arg1, var9))) {
                return false;
            }
            label80: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field2926.length; var10++) {
                        if (arg2.CheckDeviceType(arg1, arg5, var9.Format, field2926[var10], true) == 0 && arg2.CheckDeviceFormat(arg1, arg5, var9.Format, 1, 1, field2926[var10]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg5, field2926[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field2904.length; var11++) {
                                if (arg2.CheckDeviceFormat(arg1, arg5, var9.Format, 2, 1, field2904[var11]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg5, var9.Format, field2926[var10], field2904[var11]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg5, field2904[var10], true, var8) == 0)) {
                                    var7 = field2926[var10];
                                    var6 = field2904[var11];
                                    break label80;
                                }
                            }
                        }
                    }
                }
                arg0--;
            }
            if (arg0 < arg3 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg4.BackBufferFormat = var7;
            arg4.MultiSampleQuality = 0;
            arg4.MultiSampleType = var8;
            arg4.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!bea", name = "V", descriptor = "(I)V", line = 1412)
    public final void method1333(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field5111; var2++) {
            class551 var3 = this.field5089[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3135((byte) -78);
            float var6 = var3.method3131(false) / 255.0F;
            this.field2912.SetPosition((float) var3.method3130(7019), (float) var3.method3137((byte) 115), (float) var3.method3136(arg0 + 43412));
            this.field2912.SetDiffuse((float) ((var5 & 0xFF6196) >> 16) * var6, (float) ((var5 & 0xFF55) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field2912.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3133(arg0 + 14840) * var3.method3133(arg0 ^ 0xFFFFC6F9)));
            this.field2912.SetRange((float) var3.method3133(arg0 ^ 0xFFFFC6F9));
            this.field2918.SetLight(var4, this.field2912);
            this.field2918.LightEnable(var4, true);
        }
        while (this.field5120 > var2) {
            this.field2918.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1333(arg0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZBLef;Z)V", line = 1447)
    public final void method1334(int arg0, boolean arg1, byte arg2, class488 arg3, boolean arg4) {
        if (arg2 != 27) {
            this.method339(null);
        }
        byte var7;
        if (arg0 == 1) {
            var7 = 3;
        } else if (arg0 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg1) {
            var8 |= 0x20;
        }
        if (arg4) {
            var8 |= 0x10;
        }
        this.field2918.SetTextureStageState(this.field5071, var7, var8 | method1284(arg3, (byte) 127));
    }

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "(B)V", line = 1496)
    public final void method1335(byte arg0) {
        if (arg0 > -98) {
            return;
        }
        float var2 = this.field5047 ? this.field5122 : 0.0F;
        float var3 = this.field5047 ? -this.field5086 : 0.0F;
        this.field2919.SetDiffuse(this.field5103 * var2, this.field5041 * var2, this.field5083 * var2, 0.0F);
        this.field2924.SetDiffuse(this.field5103 * var3, this.field5041 * var3, this.field5083 * var3, 0.0F);
        this.field2916 = false;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(IIIID)V", line = 1510)
    public final void method428(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILkt;[BIII)Lff;", line = 1518)
    public final class9 method1336(int arg0, class159 arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 33 / ((arg0 - 49) / 38);
        return new class741(this, arg1, arg3, arg4, arg5, arg2);
    }

    @OriginalMember(owner = "client!bea", name = "T", descriptor = "(I)V", line = 1527)
    public final void method1337(int arg0) {
        this.field2918.method2726(27, this.field5052);
        int var2 = 25 / ((arg0 + 43) / 34);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZZ)V", line = 1536)
    public final void method1338(boolean arg0, boolean arg1) {
        this.field2918.method2726(161, arg0);
        if (arg1) {
            this.method1299((byte) -31);
        }
    }

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "(I)V", line = 1548)
    public final void method1339(int arg0) {
        for (int var2 = 0; var2 < this.field5100; var2++) {
            this.field2918.SetSamplerState(var2, 7, 0);
            this.field2918.SetSamplerState(var2, 6, 2);
            this.field2918.SetSamplerState(var2, 5, 2);
            this.field2918.SetSamplerState(var2, 1, 1);
            this.field2918.SetSamplerState(var2, 2, 1);
            this.field2922[var2] = class705.field9884;
            this.field2908[var2] = this.field2920[var2] = true;
            this.field2925[var2] = false;
            this.field2907[var2] = 0;
        }
        this.field2918.SetTextureStageState(0, 6, 1);
        this.field2918.SetRenderState(9, 2);
        this.field2918.SetRenderState(23, 4);
        this.field2918.SetRenderState(25, 5);
        this.field2918.SetRenderState(24, 0);
        this.field2918.SetRenderState(22, 2);
        this.field2918.SetRenderState(147, arg0);
        this.field2918.SetRenderState(145, 1);
        this.field2918.method2732(38, 0.95F);
        this.field2918.SetRenderState(140, 3);
        this.field2919.SetType(3);
        this.field2924.SetType(3);
        this.field2912.SetType(1);
        this.field2916 = false;
        super.method1339(1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZBLef;)V", line = 1587)
    public final void method1340(int arg0, boolean arg1, byte arg2, class488 arg3) {
        int var5 = 0;
        if (arg2 != -42) {
            field2921 = null;
        }
        byte var7;
        if (arg0 == 1) {
            var7 = 6;
        } else if (arg0 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1) {
            var5 |= 0x10;
        }
        this.field2918.SetTextureStageState(this.field5071, var7, var5 | method1284(arg3, (byte) 127));
    }

    @OriginalMember(owner = "client!bea", name = "M", descriptor = "(I)V", line = 1634)
    public final void method1341(int arg0) {
        int var2 = this.field2914[this.field5071] ? method1297(false, this.field5077[this.field5071]) : 1;
        if (arg0 != 2) {
            this.field2906 = null;
        }
        this.field2918.SetTextureStageState(this.field5071, 1, var2);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(FFF)V", line = 1644)
    public final void method408(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "(B)V", line = 1650)
    public final void method1342(byte arg0) {
        if (arg0 > -109) {
            return;
        }
        if (class278.field3705 == this.field5117) {
            this.field2918.SetRenderState(19, 5);
            this.field2918.SetRenderState(20, 6);
        } else if (class129.field1674 == this.field5117) {
            this.field2918.SetRenderState(19, 2);
            this.field2918.SetRenderState(20, 2);
        } else if (class258.field3381 == this.field5117) {
            this.field2918.SetRenderState(19, 9);
            this.field2918.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "(I)V", line = 1683)
    public final void method1343(int arg0) {
        this.field2918.method2726(7, this.field5069);
        if (arg0 != 0) {
            this.field2903 = -18;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1693)
    public final void method429(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class353 {
        this.method373(arg2, arg3);
    }
}
