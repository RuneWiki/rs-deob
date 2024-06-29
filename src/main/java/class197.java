import jaclib.peer.class615;
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
import jagdx.class440;
import jagdx.class441;
import jagdx.class442;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class197 extends class473 {

    @OriginalMember(owner = "client!gb", name = "Rg", descriptor = "Z")
    private boolean field2392 = false;

    @OriginalMember(owner = "client!gb", name = "Qg", descriptor = "I")
    private int field2391 = 0;

    @OriginalMember(owner = "client!gb", name = "wg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field2371;

    @OriginalMember(owner = "client!gb", name = "Og", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!gb", name = "Eg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field2379;

    @OriginalMember(owner = "client!gb", name = "Dg", descriptor = "Lcga;")
    private class439 field2378;

    @OriginalMember(owner = "client!gb", name = "Sg", descriptor = "Ljaclib/peer/hr;")
    public class615 field2393;

    @OriginalMember(owner = "client!gb", name = "tg", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!gb", name = "Bg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field2376;

    @OriginalMember(owner = "client!gb", name = "Ag", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field2375;

    @OriginalMember(owner = "client!gb", name = "Ig", descriptor = "Ljagdx/D3DLIGHT;")
    private class442 field2383;

    @OriginalMember(owner = "client!gb", name = "zg", descriptor = "Ljagdx/D3DLIGHT;")
    private class442 field2374;

    @OriginalMember(owner = "client!gb", name = "yg", descriptor = "Ljagdx/D3DLIGHT;")
    private class442 field2373;

    @OriginalMember(owner = "client!gb", name = "Cg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field2377;

    @OriginalMember(owner = "client!gb", name = "Pg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field2390;

    @OriginalMember(owner = "client!gb", name = "Kg", descriptor = "Z")
    public boolean field2385;

    @OriginalMember(owner = "client!gb", name = "Ng", descriptor = "Z")
    public boolean field2388;

    @OriginalMember(owner = "client!gb", name = "xg", descriptor = "Z")
    public boolean field2372;

    @OriginalMember(owner = "client!gb", name = "Mg", descriptor = "[Z")
    private boolean[] field2387;

    @OriginalMember(owner = "client!gb", name = "Lg", descriptor = "[Z")
    private boolean[] field2386;

    @OriginalMember(owner = "client!gb", name = "Fg", descriptor = "[Z")
    private boolean[] field2380;

    @OriginalMember(owner = "client!gb", name = "Hg", descriptor = "[Z")
    private boolean[] field2382;

    @OriginalMember(owner = "client!gb", name = "Jg", descriptor = "[Lup;")
    private class249[] field2384;

    @OriginalMember(owner = "client!gb", name = "vg", descriptor = "[I")
    private int[] field2370;

    @OriginalMember(owner = "client!gb", name = "ug", descriptor = "[I")
    private static int[] field2369 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!gb", name = "Gg", descriptor = "[F")
    private static float[] field2381 = new float[16];

    @OriginalMember(owner = "client!gb", name = "sg", descriptor = "[I")
    private static int[] field2367 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(ZZ)V", line = 4)
    public final void method1140(boolean arg0, boolean arg1) {
        this.field2376.method2437(161, arg1);
        if (!arg0) {
            this.field2393 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(B)V", line = 14)
    public final void method1141(byte arg0) {
        if (this.field6806) {
            this.field2376.method2440(36, 0.0F);
            this.field2376.method2440(37, 1.0F);
            this.field2376.SetRenderState(34, this.field6851);
        } else {
            this.field6821 = (this.field6878 - this.field6862);
            this.field6875 = this.field6821 - (float) this.field6802;
            if (this.field6875 < (float) this.field6823) {
                this.field6875 = this.field6823;
            }
            this.field2376.method2440(36, this.field6875);
            this.field2376.method2440(37, this.field6821);
            this.field2376.SetRenderState(34, this.field6814);
        }
        int var2 = -63 % ((29 - arg0) / 40);
    }

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "(I)V", line = 41)
    public final void method1142(int arg0) {
        float var2 = this.field6837 ? this.field6854 : 0.0F;
        float var3 = this.field6837 ? -this.field6852 : 0.0F;
        if (arg0 != 3) {
            this.method1200(-24);
        }
        this.field2383.SetDiffuse(this.field6864 * var2, this.field6861 * var2, this.field6817 * var2, 0.0F);
        this.field2374.SetDiffuse(this.field6864 * var3, this.field6861 * var3, this.field6817 * var3, 0.0F);
        this.field2392 = false;
    }

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "(I)V", line = 56)
    public final void method1143(int arg0) {
        if (this.field6844.method3673(-1)) {
            this.field6781.method3757((byte) 104, field2381);
        } else {
            field2381[2] = 0.0F;
            field2381[4] = 0.0F;
            field2381[8] = 0.0F;
            field2381[11] = 0.0F;
            field2381[12] = 0.0F;
            field2381[5] = 1.0F;
            field2381[6] = 0.0F;
            field2381[3] = 0.0F;
            field2381[0] = 1.0F;
            field2381[15] = 1.0F;
            field2381[14] = 0.0F;
            field2381[1] = 0.0F;
            field2381[9] = 0.0F;
            field2381[13] = 0.0F;
            field2381[7] = 0.0F;
            field2381[10] = 1.0F;
        }
        if (arg0 <= -25) {
            this.field2376.SetTransform(2, field2381);
        }
    }

    @OriginalMember(owner = "client!gb", name = "SA", descriptor = "()I", line = 93)
    public final int method345() {
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI[IZII)Lae;", line = 100)
    public final class228 method1144(int arg0, boolean arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6) {
        if (!arg1) {
            this.field2382 = null;
        }
        return new class340(this, arg6, arg2, arg4, arg3, arg0, arg5);
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(II)Lor;", line = 112)
    public final class584 method1145(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field2393 = null;
        }
        if (arg1 == 3) {
            return new class33(this, this.field6651);
        } else if (arg1 == 4) {
            return new class48(this, this.field6651, this.field6739);
        } else {
            return super.method1145(arg0 ^ 0x0, arg1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "(I)Z", line = 148)
    private final boolean method1146(int arg0) {
        if (arg0 != 0) {
            this.field2372 = true;
        }
        int var2 = this.field2376.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class439 var3 = (class439) this.field6639;
            this.method2685(1);
            var3.method2420((byte) 121);
            this.field2371.BackBufferHeight = 0;
            this.field2371.BackBufferWidth = 0;
            if (method1170(this.field6805, this.field2389, this.field2375, this.field2371, 21263, this.field2368)) {
                int var4 = this.field2376.Reset(this.field2371);
                if (class441.method2451(var4, (byte) -98)) {
                    var3.method2421(this.field2376.method2441(), true, this.field2376.method2435(0));
                    this.method2760(arg0 ^ 0x623);
                    this.method1200(arg0);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "()V", line = 188)
    public final void method358() {
        this.method2716(true, true);
        this.field2376.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "()V", line = 195)
    public final void method324() {
    }

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "(B)V", line = 199)
    public final void method1147(byte arg0) {
        this.field2376.method2437(28, this.field6789 && this.field6871 && this.field6806 | this.field6802 >= 0);
        if (arg0 < 99) {
            this.field2368 = -9;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lup;I)I", line = 211)
    private static final int method1148(class249 arg0, int arg1) {
        if (class17.field146 == arg0) {
            return 2;
        } else if (class275.field3476 == arg0) {
            return 1;
        } else if (arg1 == 24739) {
            throw new IllegalArgumentException();
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "(I)V", line = 229)
    public final void method1149(int arg0) {
        if (arg0 != -1) {
            field2381 = null;
        }
        this.field2376.method2437(27, this.field6813);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvd;B)I", line = 240)
    private static final int method1150(class36 arg0, byte arg1) {
        if (arg1 >= -5) {
            field2369 = null;
        }
        if (class645.field9140 == arg0) {
            return 2;
        } else if (class300.field3926 == arg0) {
            return 3;
        } else if (class465.field6457 == arg0) {
            return 1;
        } else if (class565.field8009 == arg0) {
            return 4;
        } else if (class18.field166 == arg0) {
            return 6;
        } else if (class359.field4706 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "(B)V", line = 275)
    public final void method1151(byte arg0) {
        int var2;
        for (var2 = 0; var2 < this.field6876; var2++) {
            class463 var3 = this.field6801[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2634(true);
            float var6 = var3.method2635(119) / 255.0F;
            this.field2373.SetPosition((float) var3.method2640(-2049), (float) var3.method2638((byte) -111), (float) var3.method2641((byte) -14));
            this.field2373.SetDiffuse((float) ((var5 & 0xFFC482) >> 16) * var6, (float) ((var5 & 0xFF71) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field2373.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2637(104) * var3.method2637(96)));
            this.field2373.SetRange((float) var3.method2637(80));
            this.field2376.SetLight(var4, this.field2373);
            this.field2376.LightEnable(var4, true);
        }
        if (arg0 <= 112) {
            return;
        }
        while (this.field6882 > var2) {
            this.field2376.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1151((byte) 115);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILpg;)V", line = 314)
    public final void method1152(int arg0, class668 arg1) {
        this.method1202(arg1, 16);
        if (!this.field2387[this.field6812]) {
            this.field2376.SetSamplerState(this.field6812, 1, 1);
            this.field2387[this.field6812] = true;
        }
        if (!this.field2382[this.field6812]) {
            this.field2376.SetSamplerState(this.field6812, 2, 1);
            this.field2382[this.field6812] = true;
        }
        if (arg0 != -20733) {
            field2369 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "()V", line = 337)
    public final void method295() {
        this.field2393.method3454(20522);
        super.method295();
    }

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "(I)V", line = 346)
    public final void method1153(int arg0) {
        if (arg0 != 29438) {
            this.field2376 = null;
        }
        this.method1142(3);
        this.method1155(-90);
    }

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "()Lhl;", line = 360)
    public final class482 method298() {
        D3DADAPTER_IDENTIFIER var1 = this.field2375.method2427(this.field2389, 0);
        return new class482(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBLvd;Ltj;II)V", line = 370)
    public final void method1154(int arg0, int arg1, byte arg2, class36 arg3, class180 arg4, int arg5, int arg6) {
        this.field2376.SetIndices(((class175) arg4).field2088);
        if (arg2 <= 16) {
            this.field2391 = 107;
        }
        this.field2376.DrawIndexedPrimitive(method1150(arg3, (byte) -38), 0, arg1, arg6, arg0, arg5);
    }

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "(I)V", line = 389)
    public final void method1155(int arg0) {
        if (!this.field2392) {
            this.field2376.LightEnable(0, false);
            this.field2376.LightEnable(1, false);
            this.field2376.SetLight(0, this.field2383);
            this.field2376.SetLight(1, this.field2374);
            this.field2376.LightEnable(0, true);
            this.field2376.LightEnable(1, true);
            this.field2392 = true;
        }
        if (arg0 > -57) {
            this.method1156(-39);
        }
    }

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "(I)F", line = 410)
    public final float method1156(int arg0) {
        return arg0 == 26278 ? -0.5F : -0.7741866F;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvw;B)I", line = 420)
    private static final int method1157(class274 arg0, byte arg1) {
        if (arg1 != 51) {
            method1150(null, (byte) 4);
        }
        if (class1.field4 == arg0) {
            return 1;
        } else if (class170.field2044 == arg0) {
            return 2;
        } else if (class354.field4652 == arg0) {
            return 3;
        } else if (class136.field1555 == arg0) {
            return 4;
        } else if (class692.field9745 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V", line = 448)
    public final void method296(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lnb;Lvj;I)I", line = 451)
    public static final int method1158(class271 arg0, class402 arg1, int arg2) {
        if (arg2 != -1) {
            return -61;
        }
        if (class271.field3429 == arg0) {
            if (class181.field2225 == arg1) {
                return 22;
            }
            if (class581.field8260 == arg1) {
                return 21;
            }
            if (class595.field8446 == arg1) {
                return 28;
            }
            if (class301.field3936 == arg1) {
                return 50;
            }
            if (class234.field2984 == arg1) {
                return 51;
            }
            if (class624.field8841 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILoh;)I", line = 488)
    private static final int method1159(int arg0, class368 arg1) {
        if (arg0 != 7) {
            method1157(null, (byte) 46);
        }
        if (class676.field9584 == arg1) {
            return 2;
        } else if (class193.field2323 == arg1) {
            return 4;
        } else if (class471.field6575 == arg1) {
            return 26;
        } else if (class250.field3212 == arg1) {
            return 7;
        } else if (class39.field425 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 518)
    public final void method1160(byte arg0, Object arg1, Canvas arg2) {
        if (arg0 != -85) {
            this.method1179(1);
        }
        if (this.field6761 != arg2) {
            return;
        }
        Dimension var4 = arg2.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field2376.EndScene();
            this.method1146(arg0 + 85);
            this.field2376.BeginScene();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[Lada;)Leh;", line = 546)
    public final class328 method1161(byte arg0, class150[] arg1) {
        if (arg0 <= 76) {
            this.method296(50, 95, 26, -62);
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "(Z)V", line = 556)
    public final void method1162(boolean arg0) {
        if (!arg0) {
            this.field2390 = null;
        }
        int var2 = this.field2380[this.field6812] ? method1159(7, this.field6828[this.field6812]) : 1;
        this.field2376.SetTextureStageState(this.field6812, 1, var2);
    }

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "(I)V", line = 569)
    public final void method1163(int arg0) {
        if (arg0 == -15973) {
            this.field2376.SetRenderState(60, this.field6883);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V", line = 578)
    public final void method346(boolean arg0) {
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 581)
    public final void method1164(byte arg0) {
        if (arg0 > 91) {
            this.field2376.method2437(15, this.field6832);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BIZILvj;II)Lae;", line = 591)
    public final class228 method1165(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, class402 arg5, int arg6, int arg7) {
        return arg7 == 0 ? new class340(this, arg5, arg0, arg6, arg3, arg1, arg2, arg4) : (class228) null;
    }

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "(I)V", line = 601)
    public final void method343(int arg0) {
        this.field2376.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(B)V", line = 609)
    public final void method1166(byte arg0) {
        this.field2376.method2437(7, this.field6819);
        if (arg0 != 31) {
            this.field2390 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "(I)V", line = 619)
    public final void method1167(int arg0) {
        if (arg0 != 5) {
            return;
        }
        if (this.field6818[this.field6812] == class67.field721) {
            this.field2376.SetTextureStageState(this.field6812, 24, 0);
            this.field2370[this.field6812] = 0;
            return;
        }
        if (this.field6818[this.field6812] == class136.field1555) {
            this.field2376.SetTransform(this.field6812 + 16, this.field6881[this.field6812].method3757((byte) 85, field2381));
        } else {
            this.field2376.SetTransform(this.field6812 + 16, this.field6881[this.field6812].method3741((byte) 33, field2381));
        }
        int var2 = method1157(this.field6818[this.field6812], (byte) 51);
        if (this.field2370[this.field6812] != var2) {
            this.field2376.SetTextureStageState(this.field6812, 24, var2);
            this.field2370[this.field6812] = var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZLcea;II)V", line = 663)
    public final void method1168(boolean arg0, boolean arg1, class196 arg2, int arg3, int arg4) {
        byte var7;
        if (arg3 == 1) {
            var7 = 3;
        } else if (arg3 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        int var9 = -55 % ((-arg4 - 55) / 56);
        if (arg1) {
            var8 |= 0x20;
        }
        if (arg0) {
            var8 |= 0x10;
        }
        this.field2376.SetTextureStageState(this.field6812, var7, method1196(true, arg2) | var8);
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V", line = 700)
    public final synchronized void method304(int arg0) {
        this.field2393.method3455(104);
        super.method304(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "KA", descriptor = "(IIII)[I", line = 711)
    public final int[] method277(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field2376.method2442(0);
        IDirect3DSurface var7 = this.field2376.method2438(arg2, arg3, 21, 0, 0, true);
        if (class441.method2451(this.field2376.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1), (byte) -95) && class441.method2451(var7.LockRect(0, 0, arg2, arg3, 0, this.field2377), (byte) -60)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field2377.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field2377.method2448(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field2377.method2448(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3457((byte) -34);
        var7.method3457((byte) -34);
        return var5;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvj;Lnb;B)Z", line = 752)
    public final boolean method1169(class402 arg0, class271 arg1, byte arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 <= 122) {
            this.method1141((byte) 46);
        }
        return class441.method2451(this.field2375.method2426(this.field2389, var4), (byte) -121) && class441.method2451(this.field2375.CheckDeviceFormat(this.field2389, this.field2368, var4.Format, 0, 3, method1158(arg1, arg0, -1)), (byte) -39);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;II)Z", line = 765)
    private static final boolean method1170(int arg0, int arg1, IDirect3D arg2, D3DPRESENT_PARAMETERS arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg4 != 21263) {
            field2381 = null;
        }
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class441.method2452(arg2.method2426(arg1, var9), (byte) 113)) {
                return false;
            }
            label80: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field2369.length; var10++) {
                        if (arg2.CheckDeviceType(arg1, arg5, var9.Format, field2369[var10], true) == 0 && arg2.CheckDeviceFormat(arg1, arg5, var9.Format, 1, 1, field2369[var10]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg5, field2369[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field2367.length; var11++) {
                                if (arg2.CheckDeviceFormat(arg1, arg5, var9.Format, 2, 1, field2367[var11]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg5, var9.Format, field2369[var10], field2367[var11]) == 0 && (arg0 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg5, field2367[var10], true, var8) == 0)) {
                                    var6 = field2367[var11];
                                    var7 = field2369[var10];
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
            arg3.BackBufferFormat = var7;
            arg3.MultiSampleType = var8;
            arg3.AutoDepthStencilFormat = var6;
            arg3.MultiSampleQuality = 0;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()V", line = 867)
    public final void method341() throws class295 {
        this.field2376.EndScene();
        if (this.field2378.method2422(116)) {
            this.field2391 = 0;
            if (class441.method2452(this.field2378.method2423(-15220, 0), (byte) 114)) {
                this.method1146(0);
            }
        } else if (++this.field2391 <= 50) {
            this.method1146(0);
        } else {
            throw new class295();
        }
        this.field2376.BeginScene();
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "()Z", line = 891)
    public final boolean method291() {
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "(I)V", line = 901)
    public final void method1171(int arg0) {
        if (arg0 > -3) {
            this.method1149(-10);
        }
        this.field2376.SetTransform(3, this.field6877);
    }

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "(I)V", line = 916)
    public final void method1172(int arg0) {
        int var2 = -48 % ((arg0 - 9) / 52);
        int var3 = this.field2380[this.field6812] ? method1159(7, this.field6796[this.field6812]) : 1;
        this.field2376.SetTextureStageState(this.field6812, 4, var3);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V", line = 926)
    public final void method1173(byte arg0) {
        this.field2376.SetScissorRect(this.field6858 + this.field6816, this.field6853 + this.field6850, this.field6803, this.field6826);
        if (arg0 < 26) {
            this.method1147((byte) 6);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILeh;)V", line = 937)
    public final void method1174(int arg0, class328 arg1) {
        if (arg0 != 0) {
            field2381 = null;
        }
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field2376.SetVertexDeclaration(var3.field3720);
    }

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "(I)V", line = 948)
    public final void method1175(int arg0) {
        this.field2376.SetViewport(this.field6816, this.field6850, this.field6684, this.field6620, 0.0F, (float) arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILvd;)V", line = 957)
    public final void method1176(int arg0, int arg1, int arg2, class36 arg3) {
        this.field2376.DrawPrimitive(method1150(arg3, (byte) -29), arg0, arg2);
        if (arg1 != 1768) {
            this.method1144(-50, true, -63, null, false, -119, -39);
        }
    }

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "(I)V", line = 971)
    public final void method1177(int arg0) {
        if (this.field6777) {
            field2381[7] = 0.0F;
            field2381[8] = 0.0F;
            field2381[5] = 1.0F;
            field2381[3] = 0.0F;
            field2381[2] = 0.0F;
            field2381[14] = 0.0F;
            field2381[4] = 0.0F;
            field2381[13] = 0.0F;
            field2381[0] = 1.0F;
            field2381[11] = 0.0F;
            field2381[6] = 0.0F;
            field2381[12] = 0.0F;
            field2381[15] = 1.0F;
            field2381[9] = 0.0F;
            field2381[10] = 1.0F;
            field2381[1] = 0.0F;
        } else {
            this.field6774.method3757((byte) 119, field2381);
        }
        this.field2376.SetTransform(256, field2381);
        if (arg0 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(II)V", line = 1007)
    public final void method1178(int arg0, int arg1) {
        if (arg1 != 8) {
            this.field2385 = true;
        }
        this.field2376.SetTextureStageState(this.field6812, 11, arg0);
    }

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "(I)V", line = 1017)
    public final void method1179(int arg0) {
        if (arg0 != 0) {
            field2367 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILdj;)V", line = 1026)
    public final void method1180(int arg0, class311 arg1) {
        if (arg0 != 6) {
            this.field2378 = null;
        }
        int var3 = 0;
        if (class223.field2831 == arg1) {
            var3 = 65536;
        } else if (class205.field2502 == arg1) {
            var3 = 131072;
        } else if (class23.field206 == arg1) {
            var3 = 196608;
        }
        this.field2376.SetTextureStageState(this.field6812, 11, this.field6812 | var3);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V", line = 1050)
    public final void method280() {
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ldga;Ldga;FLdga;)Ldga;", line = 1053)
    public final class190 method290(class190 arg0, class190 arg1, float arg2, class190 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(BZ)Ltj;", line = 1061)
    public final class180 method1181(byte arg0, boolean arg1) {
        int var3 = -106 / ((arg0 - 9) / 57);
        return new class175(this, class271.field3430, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLmv;)V", line = 1072)
    public final void method1182(byte arg0, class340 arg1) {
        this.method1202(arg1, 16);
        if (this.field2387[this.field6812] != arg1.field4429) {
            this.field2376.SetSamplerState(this.field6812, 1, arg1.field4429 ? 1 : 3);
            this.field2387[this.field6812] = arg1.field4429;
        }
        if (arg0 <= 104) {
            this.method1195((byte) -109);
        }
        if (this.field2382[this.field6812] != arg1.field4430) {
            this.field2376.SetSamplerState(this.field6812, 2, arg1.field4430 ? 1 : 3);
            this.field2382[this.field6812] = arg1.field4430;
        }
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(B)V", line = 1098)
    public final void method1183(byte arg0) {
        int var2 = -62 / ((arg0 + 89) / 35);
        this.field2376.method2437(137, this.field6835 && !this.field6830);
    }

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "(I)V", line = 1107)
    public final void method1184(int arg0) {
        this.field2376.method2437(174, this.field6906);
        if (arg0 != 0) {
            this.method1193(true, (int[][]) ((int[][]) null), 72, 35);
        }
    }

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "()V", line = 1118)
    public final void method347() {
        IDirect3DEventQuery var1 = this.field2376.method2429();
        if (class441.method2451(var1.Issue(), (byte) -102)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3457((byte) -34);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBILvj;Lnb;)Lae;", line = 1142)
    public final class228 method1185(int arg0, byte arg1, int arg2, class402 arg3, class271 arg4) {
        return arg1 == 69 ? new class340(this, arg3, arg4, arg0, arg2) : (class228) null;
    }

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "(I)V", line = 1152)
    public final void method1186(int arg0) {
        this.field2383.SetAmbient(this.field6873 * this.field6864, this.field6873 * this.field6861, this.field6873 * this.field6817, 0.0F);
        if (arg0 == 20871) {
            this.field2392 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BILvj;BII)Lte;", line = 1169)
    public final class560 method1187(byte[] arg0, int arg1, class402 arg2, byte arg3, int arg4, int arg5) {
        if (arg3 >= -6) {
            this.method343(26);
        }
        return new class668(this, arg2, arg4, arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILcea;IZ)V", line = 1181)
    public final void method1188(int arg0, class196 arg1, int arg2, boolean arg3) {
        int var5 = 0;
        byte var7;
        if (arg0 == 1) {
            var7 = 6;
        } else if (arg0 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        int var8 = -64 / ((-arg2 - 37) / 62);
        if (arg3) {
            var5 |= 0x10;
        }
        this.field2376.SetTextureStageState(this.field6812, var7, var5 | method1196(true, arg1));
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 1225)
    public final void method1189(int arg0, Object arg1, Canvas arg2) {
        this.field2378 = (class439) arg1;
        if (arg0 != -1) {
            this.field2382 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()Z", line = 1235)
    public final boolean method310() {
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "(B)V", line = 1242)
    public final void method1190(byte arg0) {
        if (class361.field4715 == this.field6874) {
            this.field2376.SetRenderState(19, 5);
            this.field2376.SetRenderState(20, 6);
        } else if (class254.field3249 == this.field6874) {
            this.field2376.SetRenderState(19, 2);
            this.field2376.SetRenderState(20, 2);
        } else if (class421.field5599 == this.field6874) {
            this.field2376.SetRenderState(19, 9);
            this.field2376.SetRenderState(20, 2);
        }
        if (arg0 < 43) {
            this.field2379 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 1273)
    public final void method1191(Object arg0, int arg1, Canvas arg2) {
        int var4 = 51 / ((arg1 - 68) / 50);
    }

    @OriginalMember(owner = "client!gb", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Ljo;Ljava/lang/Integer;)Loa;", line = 1281)
    public static final class635 createToolkit(Canvas arg0, class486 arg1, class303 arg2, Integer arg3) {
        class197 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class615 var7 = new class615();
            IDirect3D var8 = IDirect3D.method2425(-2147483616, var7);
            D3DCAPS var9 = var8.method2424(var5, var6);
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
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1170(arg3, var5, var8, var10, 21263, var6)) {
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
                    var13 = var8.method2428(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class440 var17) {
                    var13 = var8.method2428(var5, var6, arg0, var11 | 0x20, var10);
                }
                class439 var15 = new class439(var13.method2435(0), var13.method2441());
                var4 = new class197(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2751(9);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method295();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lvj;Lnb;I)Z", line = 1384)
    public final boolean method1192(class402 arg0, class271 arg1, int arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg2 <= 37) {
            return false;
        } else {
            return class441.method2451(this.field2375.method2426(this.field2389, var4), (byte) -94) && class441.method2451(this.field2375.CheckDeviceFormat(this.field2389, this.field2368, var4.Format, 0, 4, method1158(arg1, arg0, -1)), (byte) -84);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z[[III)Lvfa;", line = 1395)
    public final class614 method1193(boolean arg0, int[][] arg1, int arg2, int arg3) {
        if (arg2 >= -51) {
            field2367 = null;
        }
        return new class510(this, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(Z)V", line = 1405)
    public final void method1194(boolean arg0) {
        if (!arg0) {
            this.method310();
        }
        if (this.field2380[this.field6812]) {
            this.field2380[this.field6812] = false;
            this.field2376.SetTexture(this.field6812, null);
            this.method1172(79);
            this.method1162(true);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1422)
    public final void method285(Rectangle[] arg0, int arg1) throws class295 {
        this.method341();
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/hr;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lcga;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Ljo;I)V", line = 1430)
    private class197(int arg0, int arg1, Canvas arg2, class615 arg3, IDirect3D arg4, IDirect3DDevice arg5, class439 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class486 arg9, class303 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field2371 = arg7;
        this.field2389 = arg0;
        this.field2379 = arg8;
        this.field2378 = arg6;
        this.field2393 = arg3;
        this.field2368 = arg1;
        this.field2376 = arg5;
        this.field2375 = arg4;
        this.field2383 = new class442(this.field2393);
        this.field2374 = new class442(this.field2393);
        this.field2373 = new class442(this.field2393);
        this.field2377 = new PixelBuffer(this.field2393);
        this.field2390 = new GeometryBuffer(this.field2393);
        new GeometryBuffer(this.field2393);
        this.field2385 = (this.field2379.TextureCaps & 0x10000) != 0;
        this.field2388 = (this.field2379.TextureCaps & 0x4000) != 0;
        this.field6863 = (this.field2379.TextureCaps & 0x800) != 0;
        this.field6824 = this.field2379.MaxSimultaneousTextures;
        this.field2372 = (this.field2379.TextureCaps & 0x2) == 0;
        this.field6797 = this.field2379.MaxActiveLights <= 0 ? 8 : this.field2379.MaxActiveLights;
        this.field6799 = (this.field2379.TextureCaps & 0x2000) != 0;
        this.field6836 = this.field6805 > 0 || this.field2375.CheckDeviceMultiSampleType(this.field2389, this.field2368, this.field2371.BackBufferFormat, true, 2) == 0;
        this.field2387 = new boolean[this.field6824];
        this.field2386 = new boolean[this.field6824];
        this.field2380 = new boolean[this.field6824];
        this.field2382 = new boolean[this.field6824];
        this.field2384 = new class249[this.field6824];
        this.field2370 = new int[this.field6824];
        this.field2376.BeginScene();
        try {
            this.field2376.Clear(3, 0, 1.0F, 0);
            this.method341();
            this.field2376.Clear(3, 0, 1.0F, 0);
        } catch (class295 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "(B)V", line = 1482)
    public final void method1195(byte arg0) {
        if (arg0 != 48) {
            this.field2379 = null;
        }
        this.field2383.SetDirection(-this.field6827[0], -this.field6827[1], -this.field6827[2]);
        this.field2374.SetDirection(-this.field6859[0], -this.field6859[1], -this.field6859[2]);
        this.field2392 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLcea;)I", line = 1494)
    private static final int method1196(boolean arg0, class196 arg1) {
        if (class67.field708 == arg1) {
            return 2;
        } else if (class561.field7981 == arg1) {
            return 0;
        } else if (class19.field171 == arg1) {
            return 1;
        } else if (class521.field7461 == arg1) {
            return 3;
        } else if (arg0) {
            throw new IllegalArgumentException();
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "()V", line = 1518)
    public final void method367() {
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1521)
    public final Object method1197(Canvas arg0, int arg1) {
        return arg1 == 10 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLtfa;)V", line = 1532)
    public final void method1198(int arg0, byte arg1, class31 arg2) {
        class131 var4 = (class131) arg2;
        if (arg1 < 105) {
            this.field2391 = -11;
        }
        this.field2376.SetStreamSource(arg0, var4.field1468, 0, var4.method738(true));
    }

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "(I)V", line = 1543)
    public final void method1199(int arg0) {
        this.field2376.method2437(14, this.field6820 && this.field6790);
        int var2 = -13 / ((arg0 - 83) / 43);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFF)V", line = 1552)
    public final void method317(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "(I)V", line = 1564)
    public final void method1200(int arg0) {
        for (int var2 = 0; var2 < this.field6824; var2++) {
            this.field2376.SetSamplerState(var2, 7, 0);
            this.field2376.SetSamplerState(var2, 6, 2);
            this.field2376.SetSamplerState(var2, 5, 2);
            this.field2376.SetSamplerState(var2, 1, 1);
            this.field2376.SetSamplerState(var2, 2, 1);
            this.field2384[var2] = class17.field146;
            this.field2387[var2] = this.field2382[var2] = true;
            this.field2386[var2] = false;
            this.field2370[var2] = 0;
        }
        this.field2376.SetTextureStageState(0, 6, 1);
        this.field2376.SetRenderState(9, 2);
        this.field2376.SetRenderState(23, 4);
        this.field2376.SetRenderState(25, 5);
        this.field2376.SetRenderState(24, arg0);
        this.field2376.SetRenderState(22, 2);
        this.field2376.SetRenderState(147, 1);
        this.field2376.SetRenderState(145, 1);
        this.field2376.method2440(38, 0.95F);
        this.field2376.SetRenderState(140, 3);
        this.field2383.SetType(3);
        this.field2374.SetType(3);
        this.field2373.SetType(1);
        this.field2392 = false;
        super.method1200(0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[FZIIZILvj;)Lae;", line = 1600)
    public final class228 method1201(int arg0, float[] arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, class402 arg7) {
        if (!arg5) {
            this.method1180(12, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Les;I)V", line = 1611)
    public final void method1202(class346 arg0, int arg1) {
        this.field2376.SetTexture(this.field6812, arg0.method1900((byte) 97));
        if (arg1 != 16) {
            this.field2368 = -22;
        }
        if (this.field2384[this.field6812] != arg0.field4516) {
            int var3 = method1148(arg0.field4516, 24739);
            this.field2376.SetSamplerState(this.field6812, 6, var3);
            this.field2376.SetSamplerState(this.field6812, 5, var3);
            this.field2384[this.field6812] = arg0.field4516;
            if (arg0.field4513 != this.field2386[this.field6812]) {
                this.field2376.SetSamplerState(this.field6812, 7, arg0.field4513 ? method1148(arg0.field4516, arg1 + 24723) : 0);
                this.field2386[this.field6812] = arg0.field4513;
            }
        } else if (this.field2386[this.field6812] != arg0.field4513) {
            this.field2376.SetSamplerState(this.field6812, 7, arg0.field4513 ? method1148(arg0.field4516, arg1 + 24723) : 0);
            this.field2386[this.field6812] = arg0.field4513;
        }
        if (!this.field2380[this.field6812]) {
            this.field2380[this.field6812] = true;
            this.method1172(arg1 ^ 0x7F);
            this.method1162(true);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(ZZ)Ltfa;", line = 1652)
    public final class31 method1203(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field2380 = null;
        }
        return new class131(this, arg0);
    }
}
