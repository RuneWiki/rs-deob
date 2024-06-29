import jaclib.peer.class571;
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
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class188 extends class582 {

    @OriginalMember(owner = "client!hv", name = "Vg", descriptor = "I")
    private int field2442 = 0;

    @OriginalMember(owner = "client!hv", name = "Wg", descriptor = "Z")
    private boolean field2443 = false;

    @OriginalMember(owner = "client!hv", name = "Ig", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field2429;

    @OriginalMember(owner = "client!hv", name = "Hg", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!hv", name = "xg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field2418;

    @OriginalMember(owner = "client!hv", name = "Bg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field2422;

    @OriginalMember(owner = "client!hv", name = "Fg", descriptor = "Lpl;")
    private class560 field2426;

    @OriginalMember(owner = "client!hv", name = "Cg", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!hv", name = "Jg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field2430;

    @OriginalMember(owner = "client!hv", name = "Qg", descriptor = "Ljaclib/peer/ik;")
    public class571 field2437;

    @OriginalMember(owner = "client!hv", name = "Tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field2440;

    @OriginalMember(owner = "client!hv", name = "Ug", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field2441;

    @OriginalMember(owner = "client!hv", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class397 field2438;

    @OriginalMember(owner = "client!hv", name = "Ng", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field2434;

    @OriginalMember(owner = "client!hv", name = "Pg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field2436;

    @OriginalMember(owner = "client!hv", name = "Kg", descriptor = "Z")
    public boolean field2431;

    @OriginalMember(owner = "client!hv", name = "Gg", descriptor = "Z")
    public boolean field2427;

    @OriginalMember(owner = "client!hv", name = "Sg", descriptor = "Z")
    public boolean field2439;

    @OriginalMember(owner = "client!hv", name = "Og", descriptor = "[Z")
    private boolean[] field2435;

    @OriginalMember(owner = "client!hv", name = "Lg", descriptor = "[I")
    private int[] field2432;

    @OriginalMember(owner = "client!hv", name = "yg", descriptor = "[Lgu;")
    private class126[] field2419;

    @OriginalMember(owner = "client!hv", name = "zg", descriptor = "[Z")
    private boolean[] field2420;

    @OriginalMember(owner = "client!hv", name = "Ag", descriptor = "[Z")
    private boolean[] field2421;

    @OriginalMember(owner = "client!hv", name = "Mg", descriptor = "[Z")
    private boolean[] field2433;

    @OriginalMember(owner = "client!hv", name = "Dg", descriptor = "[I")
    private static int[] field2424 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!hv", name = "V", descriptor = "[F")
    private static float[] field2417 = new float[16];

    @OriginalMember(owner = "client!hv", name = "Eg", descriptor = "[I")
    private static int[] field2425 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([BBIIILuda;)Lnf;")
    public final class37 method1151(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, class509 arg5) {
        if (arg1 < 37) {
            this.method1196((byte) -102);
        }
        return new class393(this, arg5, arg3, arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1152(byte arg0, Canvas arg1, Object arg2) {
        if (arg0 != -12 || this.field8270 != arg1) {
            return;
        }
        Dimension var4 = arg1.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field2418.EndScene();
            this.method1198((byte) -79);
            this.field2418.BeginScene();
        }
    }

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "(I)V")
    public final void method1153(int arg0) {
        this.field2418.method2399(15, this.field8367);
        if (arg0 < 49) {
            this.field2420 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIZLlg;)V")
    public final void method1154(int arg0, int arg1, boolean arg2, class32 arg3) {
        if (arg0 != 10) {
            this.method1211(-63);
        }
        int var5 = 0;
        byte var7;
        if (arg1 == 1) {
            var7 = 6;
        } else if (arg1 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg2) {
            var5 |= 0x10;
        }
        this.field2418.SetTextureStageState(this.field8391, var7, var5 | method1164(false, arg3));
    }

    @OriginalMember(owner = "client!hv", name = "V", descriptor = "(I)V")
    public final void method1155(int arg0) {
        this.field2440.SetDirection(-this.field8377[arg0], -this.field8377[1], -this.field8377[2]);
        this.field2441.SetDirection(-this.field8400[0], -this.field8400[1], -this.field8400[2]);
        this.field2443 = false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[BILuda;BIZI)Lgq;")
    public final class305 method1156(int arg0, byte[] arg1, int arg2, class509 arg3, byte arg4, int arg5, boolean arg6, int arg7) {
        return arg4 == -115 ? new class229(this, arg3, arg2, arg0, arg6, arg1, arg7, arg5) : (class305) null;
    }

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "(IIII)[I")
    public final int[] method950(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field2418.method2398(0);
        IDirect3DSurface var7 = this.field2418.method2387(arg2, arg3, 21, 0, 0, true);
        if (class399.method2379(this.field2418.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1), 28658) && class399.method2379(var7.LockRect(0, 0, arg2, arg3, 0, this.field2434), 28658)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field2434.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field2434.method2376(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field2434.method2376(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3212((byte) 87);
        var7.method3212((byte) 87);
        return var5;
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(II)Lsf;")
    public final class554 method1157(int arg0, int arg1) {
        if (arg0 <= 85) {
            return (class554) null;
        } else if (arg1 == 3) {
            return new class347(this, this.field8177);
        } else if (arg1 == 4) {
            return new class437(this, this.field8177, this.field8213);
        } else {
            return super.method1157(86, arg1);
        }
    }

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "(I)V")
    public final void method1158(int arg0) {
        int var2 = this.field2421[this.field8391] ? method1159(2, this.field8312[this.field8391]) : 1;
        this.field2418.SetTextureStageState(this.field8391, 1, var2);
        int var3 = -19 / ((-arg0 - 67) / 41);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILsm;)I")
    private static final int method1159(int arg0, class577 arg1) {
        if (class509.field7093 == arg1) {
            return 2;
        } else if (class443.field6123 == arg1) {
            return 4;
        } else if (class550.field7639 == arg1) {
            return 26;
        } else if (class505.field7041 == arg1) {
            return 7;
        } else if (class334.field4669 == arg1) {
            return 10;
        } else {
            if (arg0 != 2) {
                field2424 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "(I)V")
    public final void method1160(int arg0) {
        if (arg0 != -28988) {
            this.method1198((byte) -13);
        }
        this.field2418.method2399(7, this.field8397);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lsb;Luda;III)Lgq;")
    public final class305 method1161(class280 arg0, class509 arg1, int arg2, int arg3, int arg4) {
        int var6 = -37 % ((3 - arg4) / 37);
        return new class229(this, arg1, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "(I)V")
    public final void method1162(int arg0) {
        if (this.field8347.method2260(-75)) {
            this.field8298.method1134(field2417, 14);
        } else {
            field2417[13] = 0.0F;
            field2417[2] = 0.0F;
            field2417[6] = 0.0F;
            field2417[10] = 1.0F;
            field2417[11] = 0.0F;
            field2417[9] = 0.0F;
            field2417[0] = 1.0F;
            field2417[3] = 0.0F;
            field2417[14] = 0.0F;
            field2417[7] = 0.0F;
            field2417[15] = 1.0F;
            field2417[12] = 0.0F;
            field2417[1] = 0.0F;
            field2417[8] = 0.0F;
            field2417[5] = 1.0F;
            field2417[4] = 0.0F;
        }
        if (arg0 > -96) {
            this.method1170((byte) 57, null, null);
        }
        this.field2418.SetTransform(2, field2417);
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "()Z")
    public final boolean method912() {
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
    public final void method911() {
    }

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "(Z)F")
    public final float method1163(boolean arg0) {
        return arg0 ? -0.19606909F : -0.5F;
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "()Z")
    public final boolean method915() {
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "()V")
    public final void method994() {
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLlg;)I")
    private static final int method1164(boolean arg0, class32 arg1) {
        if (class93.field1233 == arg1) {
            return 2;
        } else if (class542.field7574 == arg1) {
            return 0;
        } else if (class17.field173 == arg1) {
            return 1;
        } else if (class320.field4434 == arg1) {
            return 3;
        } else {
            if (arg0) {
                createToolkit(null, null, null, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method1165(boolean arg0, Canvas arg1) {
        return arg0 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!hv", name = "S", descriptor = "(I)V")
    public final void method1166(int arg0) {
        if (!this.field2443) {
            this.field2418.LightEnable(0, false);
            this.field2418.LightEnable(1, false);
            this.field2418.SetLight(0, this.field2440);
            this.field2418.SetLight(1, this.field2441);
            this.field2418.LightEnable(0, true);
            this.field2418.LightEnable(1, true);
            this.field2443 = true;
        }
        if (arg0 != 0) {
            this.field2418 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;I)Z")
    private static final boolean method1167(int arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = arg4.method2385(arg0);
            label75: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field2424.length; var10++) {
                        if (arg4.CheckDeviceType(arg0, arg1, var9.Format, field2424[var10], true) == 0 && arg4.CheckDeviceFormat(arg0, arg1, var9.Format, 1, 1, field2424[var10]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg1, field2424[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field2425.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg0, arg1, var9.Format, 2, 1, field2425[var11]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg1, var9.Format, field2424[var10], field2425[var11]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg1, field2425[var10], true, var8) == 0)) {
                                    var6 = field2425[var11];
                                    var7 = field2424[var10];
                                    break label75;
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
            int var12 = 38 / ((-arg5 - 61) / 51);
            arg3.BackBufferFormat = var7;
            arg3.MultiSampleType = var8;
            arg3.MultiSampleQuality = 0;
            arg3.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(B)V")
    public final void method1168(byte arg0) {
        if (arg0 == -102) {
            this.field2418.SetScissorRect(this.field8381 + this.field8344, this.field8387 - -this.field8324, this.field8328, this.field8399);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZIIIIB[I)Lgq;")
    public final class305 method1169(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6) {
        if (arg5 != -63) {
            this.method1212(null, null, -19, -108, -112, 101, -78);
        }
        return new class229(this, arg4, arg1, arg0, arg6, arg2, arg3);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLsb;Luda;)Z")
    public final boolean method1170(byte arg0, class280 arg1, class509 arg2) {
        if (arg0 > -34) {
            this.field2441 = null;
        }
        D3DDISPLAYMODE var4 = this.field2429.method2385(this.field2423);
        return class399.method2379(this.field2429.CheckDeviceFormat(this.field2423, this.field2428, var4.Format, 0, 4, method1193(arg2, arg1, 51)), 28658);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Llca;IB)V")
    public final void method1171(class133 arg0, int arg1, byte arg2) {
        class303 var4 = (class303) arg0;
        this.field2418.SetStreamSource(arg1, var4.field3925, 0, var4.method1840(arg2 + 1806));
        if (arg2 != -98) {
            this.field2420 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "(I)V")
    public final void method1172(int arg0) {
        if (arg0 != 128) {
            return;
        }
        if (this.field8289) {
            field2417[3] = 0.0F;
            field2417[1] = 0.0F;
            field2417[0] = 1.0F;
            field2417[7] = 0.0F;
            field2417[13] = 0.0F;
            field2417[15] = 1.0F;
            field2417[8] = 0.0F;
            field2417[4] = 0.0F;
            field2417[11] = 0.0F;
            field2417[5] = 1.0F;
            field2417[14] = 0.0F;
            field2417[6] = 0.0F;
            field2417[9] = 0.0F;
            field2417[2] = 0.0F;
            field2417[12] = 0.0F;
            field2417[10] = 1.0F;
        } else {
            this.field8292.method1134(field2417, 14);
        }
        this.field2418.SetTransform(256, field2417);
    }

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "()V")
    public final void method996() {
        this.method3284(true, 66);
        this.field2418.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILwi;)V")
    public final void method1173(int arg0, class498 arg1) {
        this.field2418.SetTexture(this.field8391, arg1.method1127(63));
        if (this.field2419[this.field8391] != arg1.field6937) {
            int var3 = method1174(2, arg1.field6937);
            this.field2418.SetSamplerState(this.field8391, 6, var3);
            this.field2418.SetSamplerState(this.field8391, 5, var3);
            this.field2419[this.field8391] = arg1.field6937;
            if (this.field2420[this.field8391] != arg1.field6938) {
                this.field2418.SetSamplerState(this.field8391, 7, arg1.field6938 ? method1174(2, arg1.field6937) : 0);
                this.field2420[this.field8391] = arg1.field6938;
            }
        } else if (arg1.field6938 != this.field2420[this.field8391]) {
            this.field2418.SetSamplerState(this.field8391, 7, arg1.field6938 ? method1174(arg0 + 2, arg1.field6937) : 0);
            this.field2420[this.field8391] = arg1.field6938;
        }
        if (arg0 != 0) {
            this.field2428 = 126;
        }
        if (!this.field2421[this.field8391]) {
            this.field2421[this.field8391] = true;
            this.method1189((byte) 101);
            this.method1158(-123);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILgu;)I")
    private static final int method1174(int arg0, class126 arg1) {
        if (arg0 != 2) {
            field2417 = null;
        }
        if (class96.field1289 == arg1) {
            return 2;
        } else if (class6.field57 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
    public final void method968(boolean arg0) {
    }

    @OriginalMember(owner = "client!hv", name = "Q", descriptor = "(I)V")
    public final void method1175(int arg0) {
        this.field2418.SetTransform(3, this.field8332);
        if (arg0 != 7) {
            this.method959(112, 51, -14, 39);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method1176(Object arg0, Canvas arg1, int arg2) {
        int var4 = -105 % ((53 - arg2) / 33);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(FFF)V")
    public final void method989(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "(I)V")
    public final void method1177(int arg0) {
        if (arg0 != 1) {
            this.method1173(123, null);
        }
        this.method1187(-5477);
        this.method1166(0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lug;B)Lkq;")
    public final class102 method1178(class410[] arg0, byte arg1) {
        if (arg1 != -13) {
            this.field2443 = true;
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILgn;)I")
    private static final int method1179(int arg0, class635 arg1) {
        if (class507.field7076 == arg1) {
            return 1;
        } else if (class620.field8928 == arg1) {
            return 2;
        } else if (class272.field3458 == arg1) {
            return 3;
        } else if (class191.field2480 == arg1) {
            return 4;
        } else if (class438.field5987 == arg1) {
            return 256;
        } else if (arg0 == 4) {
            return 0;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "(I)V")
    public final void method1180(int arg0) {
        if (arg0 != 0) {
            this.method1155(-49);
        }
    }

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "(B)V")
    public final void method1181(byte arg0) {
        int var2 = -128 % ((arg0 + 35) / 39);
        this.field2418.method2399(27, this.field8349);
    }

    @OriginalMember(owner = "client!hv", name = "R", descriptor = "(I)V")
    public final void method1182(int arg0) {
        if (this.field8386[this.field8391] == class467.field6627) {
            this.field2418.SetTextureStageState(this.field8391, 24, 0);
            this.field2432[this.field8391] = 0;
        } else {
            if (this.field8386[this.field8391] == class191.field2480) {
                this.field2418.SetTransform(this.field8391 + 16, this.field8382[this.field8391].method1134(field2417, arg0 ^ 0x57CB));
            } else {
                this.field2418.SetTransform(this.field8391 + 16, this.field8382[this.field8391].method1145(false, field2417));
            }
            int var2 = method1179(arg0 ^ 0x57C1, this.field8386[this.field8391]);
            if (this.field2432[this.field8391] != var2) {
                this.field2418.SetTextureStageState(this.field8391, 24, var2);
                this.field2432[this.field8391] = var2;
            }
        }
        if (arg0 != 22469) {
            this.method1198((byte) -5);
        }
    }

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "()V")
    public final void method936() {
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lrn;Lrn;FLrn;)Lrn;")
    public final class307 method931(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "(I)V")
    public final void method1183(int arg0) {
        if (arg0 != -886) {
            this.field2418 = null;
        }
        this.field2418.SetRenderState(60, this.field8333);
    }

    @OriginalMember(owner = "client!hv", name = "T", descriptor = "(I)V")
    public final void method1184(int arg0) {
        for (int var2 = 0; var2 < this.field8319; var2++) {
            this.field2418.SetSamplerState(var2, 7, 0);
            this.field2418.SetSamplerState(var2, 6, 2);
            this.field2418.SetSamplerState(var2, 5, 2);
            this.field2418.SetSamplerState(var2, 1, 1);
            this.field2418.SetSamplerState(var2, 2, 1);
            this.field2419[var2] = class96.field1289;
            this.field2435[var2] = this.field2433[var2] = true;
            this.field2420[var2] = false;
            this.field2432[var2] = 0;
        }
        this.field2418.SetTextureStageState(0, 6, 1);
        this.field2418.SetRenderState(9, 2);
        this.field2418.SetRenderState(23, 4);
        this.field2418.SetRenderState(25, 5);
        this.field2418.SetRenderState(24, arg0);
        this.field2418.SetRenderState(22, 2);
        this.field2418.SetRenderState(147, 1);
        this.field2418.SetRenderState(145, 1);
        this.field2418.method2394(38, 0.95F);
        this.field2418.SetRenderState(140, 3);
        this.field2440.SetType(3);
        this.field2441.SetType(3);
        this.field2438.SetType(1);
        this.field2443 = false;
        super.method1184(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(ZI)V")
    public final void method1185(boolean arg0, int arg1) {
        if (arg1 == 6420) {
            this.field2418.method2399(161, arg0);
        }
    }

    @OriginalMember(owner = "client!hv", name = "O", descriptor = "(I)V")
    public final void method1186(int arg0) {
        this.field2418.SetViewport(this.field8381, this.field8387, this.field8219, this.field8249, 0.0F, 1.0F);
        if (arg0 != 10) {
            this.field2435 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "()V")
    public final void method934() throws class487 {
        this.field2418.EndScene();
        if (this.field2426.method3145((byte) -70)) {
            this.field2442 = 0;
            if (class399.method2378(this.field2426.method3147(0, 0), -1)) {
                this.method1198((byte) -79);
            }
        } else if (++this.field2442 <= 50) {
            this.method1198((byte) -79);
        } else {
            throw new class487();
        }
        this.field2418.BeginScene();
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)V")
    public final void method959(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "(I)V")
    public final void method1187(int arg0) {
        if (arg0 != -5477) {
            this.method1195(null, false, null);
        }
        float var2 = this.field8359 ? this.field8385 : 0.0F;
        float var3 = this.field8359 ? -this.field8343 : 0.0F;
        this.field2440.SetDiffuse(this.field8352 * var2, this.field8402 * var2, this.field8363 * var2, 0.0F);
        this.field2441.SetDiffuse(this.field8352 * var3, this.field8402 * var3, this.field8363 * var3, 0.0F);
        this.field2443 = false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZ)Lbd;")
    public final class180 method1188(byte arg0, boolean arg1) {
        return arg0 <= 100 ? (class180) null : new class252(this, class280.field3664, arg1);
    }

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "(B)V")
    public final void method1189(byte arg0) {
        int var2 = this.field2421[this.field8391] ? method1159(2, this.field8401[this.field8391]) : 1;
        this.field2418.SetTextureStageState(this.field8391, 4, var2);
        int var3 = -73 / ((arg0 + 19) / 37);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLbe;)I")
    private static final int method1190(byte arg0, class189 arg1) {
        if (class202.field2645 == arg1) {
            return 2;
        } else if (class516.field7179 == arg1) {
            return 3;
        } else if (class140.field1784 == arg1) {
            return 1;
        } else if (class546.field7613 == arg1) {
            return 4;
        } else if (class603.field8706 == arg1) {
            return 6;
        } else if (class172.field2222 == arg1) {
            return 5;
        } else if (arg0 == -78) {
            throw new IllegalArgumentException("");
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "(I)V")
    public final void method1191(int arg0) {
        if (arg0 == 16725) {
            this.field2418.method2399(14, this.field8335 && this.field8339);
        }
    }

    @OriginalMember(owner = "client!hv", name = "YA", descriptor = "()I")
    public final int method946() {
        return 0;
    }

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "(B)V")
    public final void method1192(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field8307; var2++) {
            class592 var3 = this.field8346[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3419(112);
            float var6 = var3.method3422(72) / 255.0F;
            this.field2438.SetPosition((float) var3.method3414(232), (float) var3.method3416(-2), (float) var3.method3415((byte) 117));
            this.field2438.SetDiffuse((float) ((var5 & 0xFF4429) >> 16) * var6, (float) ((var5 & 0xFFD0) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field2438.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3420(true) * var3.method3420(true)));
            this.field2438.SetRange((float) var3.method3420(true));
            this.field2418.SetLight(var4, this.field2438);
            this.field2418.LightEnable(var4, true);
        }
        while (this.field8383 > var2) {
            this.field2418.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1192(arg0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Luda;Lsb;I)I")
    public static final int method1193(class509 arg0, class280 arg1, int arg2) {
        if (arg2 != 51) {
            field2425 = null;
        }
        if (class280.field3663 == arg1) {
            if (class149.field1929 == arg0) {
                return 22;
            }
            if (class532.field7430 == arg0) {
                return 21;
            }
            if (class33.field495 == arg0) {
                return 28;
            }
            if (class145.field1885 == arg0) {
                return 50;
            }
            if (class250.field3134 == arg0) {
                return 51;
            }
            if (class344.field4775 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!hv", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ln;Lkr;Ljava/lang/Integer;)Lqa;")
    public static final class167 createToolkit(Canvas arg0, class473 arg1, class329 arg2, Integer arg3) {
        class188 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class571 var7 = new class571();
            IDirect3D var8 = IDirect3D.method2384(-2147483616, var7);
            D3DCAPS var9 = var8.method2383(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & 0x2 & var9.DestBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1167(var5, var6, arg3, var10, var8, 9)) {
                    throw new RuntimeException("");
                }
                var10.EnableAutoDepthStencil = true;
                var10.Windowed = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method2382(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class398 var17) {
                    var13 = var8.method2382(var5, var6, arg0, var11 | 0x20, var10);
                }
                class560 var15 = new class560(var13.method2395(0), var13.method2392());
                var4 = new class188(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3326(-116);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method945();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "()V")
    public final void method945() {
        this.field2437.method3215((byte) 51);
        super.method945();
    }

    @OriginalMember(owner = "client!hv", name = "J", descriptor = "(I)V")
    public final void method1194(int arg0) {
        this.field2418.method2399(28, this.field8362 && this.field8310 && this.field8329 | this.field8323 >= 0);
        if (arg0 != 0) {
            field2425 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public final void method1195(Canvas arg0, boolean arg1, Object arg2) {
        if (!arg1) {
            this.method1188((byte) 20, true);
        }
        this.field2426 = (class560) arg2;
    }

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "(B)V")
    public final void method1196(byte arg0) {
        if (arg0 != 72) {
            field2417 = null;
        }
        if (this.field2421[this.field8391]) {
            this.field2421[this.field8391] = false;
            this.field2418.SetTexture(this.field8391, null);
            this.method1189((byte) 88);
            this.method1158(68);
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(IZ)Llca;")
    public final class133 method1197(int arg0, boolean arg1) {
        if (arg0 != 10) {
            this.field2433 = null;
        }
        return new class303(this, arg1);
    }

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "()V")
    public final void method948() {
        IDirect3DEventQuery var1 = this.field2418.method2388();
        if (class399.method2379(var1.Issue(), 28658)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3212((byte) 87);
    }

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "(B)Z")
    private final boolean method1198(byte arg0) {
        int var2 = this.field2418.TestCooperativeLevel();
        if (arg0 != -79) {
            return true;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class560 var3 = (class560) this.field8128;
            this.method3328(arg0 + 85);
            var3.method3146(0);
            this.field2430.BackBufferWidth = 0;
            this.field2430.BackBufferHeight = 0;
            if (method1167(this.field2423, this.field2428, this.field8370, this.field2430, this.field2429, 25)) {
                int var4 = this.field2418.Reset(this.field2430);
                if (class399.method2379(var4, 28658)) {
                    var3.method3148(this.field2418.method2392(), this.field2418.method2395(0), (byte) -83);
                    this.method3308((byte) 92);
                    this.method1184(0);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILbf;)V")
    public final void method1199(int arg0, class229 arg1) {
        this.method1173(0, arg1);
        if (this.field2435[this.field8391] != arg1.field2932) {
            this.field2418.SetSamplerState(this.field8391, 1, arg1.field2932 ? 1 : 3);
            this.field2435[this.field8391] = arg1.field2932;
        }
        if (arg0 == -14945 && this.field2433[this.field8391] != arg1.field2933) {
            this.field2418.SetSamplerState(this.field8391, 2, arg1.field2933 ? 1 : 3);
            this.field2433[this.field8391] = arg1.field2933;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[[IIZ)Lmca;")
    public final class5 method1200(int arg0, int[][] arg1, int arg2, boolean arg3) {
        if (arg2 != 15) {
            this.field2437 = null;
        }
        return new class185(this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V")
    public final synchronized void method932(int arg0) {
        this.field2437.method3217(-31873);
        super.method932(arg0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLei;)V")
    public final void method1201(byte arg0, class331 arg1) {
        if (arg0 >= -38) {
            return;
        }
        int var3 = 0;
        if (class280.field3668 == arg1) {
            var3 = 65536;
        } else if (class541.field7563 == arg1) {
            var3 = 131072;
        } else if (class486.field6776 == arg1) {
            var3 = 196608;
        }
        this.field2418.SetTextureStageState(this.field8391, 11, var3 | this.field8391);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ik;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lpl;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ln;Lkr;I)V")
    private class188(int arg0, int arg1, Canvas arg2, class571 arg3, IDirect3D arg4, IDirect3DDevice arg5, class560 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class473 arg9, class329 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field2429 = arg4;
        this.field2428 = arg1;
        this.field2418 = arg5;
        this.field2422 = arg8;
        this.field2426 = arg6;
        this.field2423 = arg0;
        this.field2430 = arg7;
        this.field2437 = arg3;
        this.field2440 = new class397(this.field2437);
        this.field2441 = new class397(this.field2437);
        this.field2438 = new class397(this.field2437);
        this.field2434 = new PixelBuffer(this.field2437);
        this.field2436 = new GeometryBuffer(this.field2437);
        this.field2431 = (this.field2422.TextureCaps & 0x2) == 0;
        this.field8351 = this.field2422.MaxActiveLights <= 0 ? 8 : this.field2422.MaxActiveLights;
        this.field8372 = (this.field2422.TextureCaps & 0x800) != 0;
        this.field8319 = this.field2422.MaxSimultaneousTextures;
        this.field2427 = (this.field2422.TextureCaps & 0x4000) != 0;
        this.field8315 = (this.field2422.TextureCaps & 0x2000) != 0;
        this.field2439 = (this.field2422.TextureCaps & 0x10000) != 0;
        this.field8337 = this.field8370 > 0 || this.field2429.CheckDeviceMultiSampleType(this.field2423, this.field2428, this.field2430.BackBufferFormat, true, 2) == 0;
        this.field2435 = new boolean[this.field8319];
        this.field2432 = new int[this.field8319];
        this.field2419 = new class126[this.field8319];
        this.field2420 = new boolean[this.field8319];
        this.field2421 = new boolean[this.field8319];
        this.field2433 = new boolean[this.field8319];
        this.field2418.BeginScene();
        try {
            this.field2418.Clear(3, 0, 1.0F, 0);
            this.method934();
            this.field2418.Clear(3, 0, 1.0F, 0);
        } catch (class487 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "(I)V")
    public final void method1202(int arg0) {
        this.field2440.SetAmbient(this.field8355 * this.field8352, this.field8402 * this.field8355, this.field8363 * this.field8355, 0.0F);
        this.field2443 = false;
        if (arg0 != 140) {
            this.field2439 = false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "Z", descriptor = "(I)V")
    public final void method949(int arg0) {
        this.field2418.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "(B)V")
    public final void method1203(byte arg0) {
        int var2 = 58 / ((35 - arg0) / 58);
        if (this.field8329) {
            this.field2418.method2394(36, 0.0F);
            this.field2418.method2394(37, 1.0F);
            this.field2418.SetRenderState(34, this.field8306);
            return;
        }
        this.field8384 = (this.field8374 - this.field8302);
        this.field8388 = this.field8384 - (float) this.field8323;
        if ((float) this.field8393 > this.field8388) {
            this.field8388 = this.field8393;
        }
        this.field2418.method2394(36, this.field8388);
        this.field2418.method2394(37, this.field8384);
        this.field2418.SetRenderState(34, this.field8305);
    }

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "(II)V")
    public final void method1204(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1213(75);
        }
        this.field2418.SetTextureStageState(this.field8391, 11, arg0);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z[FILuda;IIII)Lgq;")
    public final class305 method1205(boolean arg0, float[] arg1, int arg2, class509 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= -106) {
            this.field2431 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "(B)V")
    public final void method1206(byte arg0) {
        if (arg0 == 94) {
            this.field2418.method2399(174, this.field8424);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lkq;I)V")
    public final void method1207(class102 arg0, int arg1) {
        if (arg1 != 1) {
            this.method1189((byte) 10);
        }
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        this.field2418.SetVertexDeclaration(var3.field3217);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lbe;III)V")
    public final void method1208(class189 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 81) {
            this.field2421 = null;
        }
        this.field2418.DrawPrimitive(method1190((byte) -78, arg0), arg1, arg3);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method913(Rectangle[] arg0, int arg1) throws class487 {
        this.method934();
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLip;)V")
    public final void method1209(boolean arg0, class393 arg1) {
        this.method1173(0, arg1);
        if (!this.field2435[this.field8391]) {
            this.field2418.SetSamplerState(this.field8391, 1, 1);
            this.field2435[this.field8391] = true;
        }
        if (!arg0) {
            this.field2439 = false;
        }
        if (!this.field2433[this.field8391]) {
            this.field2418.SetSamplerState(this.field8391, 2, 1);
            this.field2433[this.field8391] = true;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Llg;ZZZI)V")
    public final void method1210(class32 arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        if (!arg2) {
            this.method1175(4);
        }
        byte var7;
        if (arg4 == 1) {
            var7 = 3;
        } else if (arg4 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg3) {
            var8 |= 0x20;
        }
        if (arg1) {
            var8 |= 0x10;
        }
        this.field2418.SetTextureStageState(this.field8391, var7, method1164(false, arg0) | var8);
    }

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "(I)V")
    public final void method1211(int arg0) {
        if (arg0 != 22488) {
            this.method1202(-90);
        }
        this.field2418.method2399(137, this.field8395 && !this.field8366);
    }

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "()Lqf;")
    public final class183 method988() {
        D3DADAPTER_IDENTIFIER var1 = this.field2429.method2386(this.field2423, 0);
        return new class183(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lbe;Lbd;IIIII)V")
    public final void method1212(class189 arg0, class180 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2418.SetIndices(((class252) arg1).field3145);
        this.field2418.DrawIndexedPrimitive(method1190((byte) -78, arg0), 0, arg4, arg2, arg6, arg5);
        if (arg3 > -22) {
            this.method1187(92);
        }
    }

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "(I)V")
    public final void method1213(int arg0) {
        if (class6.field55 == this.field8301) {
            this.field2418.SetRenderState(19, 5);
            this.field2418.SetRenderState(20, 6);
        } else if (class198.field2596 == this.field8301) {
            this.field2418.SetRenderState(19, 2);
            this.field2418.SetRenderState(20, 2);
        } else if (class504.field7015 == this.field8301) {
            this.field2418.SetRenderState(19, 9);
            this.field2418.SetRenderState(20, 2);
        }
        if (arg0 >= -65) {
            this.field2437 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lsb;Luda;I)Z")
    public final boolean method1214(class280 arg0, class509 arg1, int arg2) {
        if (arg2 <= 12) {
            this.field2427 = false;
        }
        D3DDISPLAYMODE var4 = this.field2429.method2385(this.field2423);
        return class399.method2379(this.field2429.CheckDeviceFormat(this.field2423, this.field2428, var4.Format, 0, 3, method1193(arg1, arg0, 51)), 28658);
    }
}
