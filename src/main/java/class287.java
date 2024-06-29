import jaclib.peer.class360;
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
import jagdx.class723;
import jagdx.class724;
import jagdx.class725;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class287 extends class684 {

    @OriginalMember(owner = "client!cu", name = "Ng", descriptor = "I")
    private int field3645 = 0;

    @OriginalMember(owner = "client!cu", name = "Hg", descriptor = "Z")
    private boolean field3639 = false;

    @OriginalMember(owner = "client!cu", name = "Xg", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!cu", name = "Sg", descriptor = "I")
    private int field3650;

    @OriginalMember(owner = "client!cu", name = "Jg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field3641;

    @OriginalMember(owner = "client!cu", name = "ah", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field3658;

    @OriginalMember(owner = "client!cu", name = "Mg", descriptor = "Ljaclib/peer/ku;")
    public class360 field3644;

    @OriginalMember(owner = "client!cu", name = "ch", descriptor = "Lsk;")
    private class473 field3660;

    @OriginalMember(owner = "client!cu", name = "Lg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field3643;

    @OriginalMember(owner = "client!cu", name = "Og", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field3646;

    @OriginalMember(owner = "client!cu", name = "Qg", descriptor = "Ljagdx/D3DLIGHT;")
    private class724 field3648;

    @OriginalMember(owner = "client!cu", name = "dh", descriptor = "Ljagdx/D3DLIGHT;")
    private class724 field3661;

    @OriginalMember(owner = "client!cu", name = "Gg", descriptor = "Ljagdx/D3DLIGHT;")
    private class724 field3638;

    @OriginalMember(owner = "client!cu", name = "Kg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field3642;

    @OriginalMember(owner = "client!cu", name = "Eg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field3636;

    @OriginalMember(owner = "client!cu", name = "Dg", descriptor = "Z")
    public boolean field3635;

    @OriginalMember(owner = "client!cu", name = "Tg", descriptor = "Z")
    public boolean field3651;

    @OriginalMember(owner = "client!cu", name = "Fg", descriptor = "Z")
    public boolean field3637;

    @OriginalMember(owner = "client!cu", name = "Pg", descriptor = "[I")
    private int[] field3647;

    @OriginalMember(owner = "client!cu", name = "Wg", descriptor = "[Z")
    private boolean[] field3654;

    @OriginalMember(owner = "client!cu", name = "Zg", descriptor = "[Z")
    private boolean[] field3657;

    @OriginalMember(owner = "client!cu", name = "Rg", descriptor = "[Z")
    private boolean[] field3649;

    @OriginalMember(owner = "client!cu", name = "Vg", descriptor = "[Z")
    private boolean[] field3653;

    @OriginalMember(owner = "client!cu", name = "bh", descriptor = "[Lbba;")
    private class721[] field3659;

    @OriginalMember(owner = "client!cu", name = "Ig", descriptor = "[I")
    private static int[] field3640 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!cu", name = "Yg", descriptor = "[I")
    private static int[] field3656 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!cu", name = "eh", descriptor = "[F")
    private static float[] field3662 = new float[16];

    @OriginalMember(owner = "client!cu", name = "Ug", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3652;

    @OriginalMember(owner = "client!cu", name = "M", descriptor = "(I)V", line = 4)
    public final void method1393(int arg0) {
        this.field3643.SetScissorRect(this.field9644 + this.field9616, this.field9640 + this.field9582, this.field9581, this.field9590);
        if (arg0 >= -73) {
            this.method1416((byte) -71);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIBLem;[BI)Lob;", line = 14)
    public final class375 method1410(int arg0, int arg1, byte arg2, class610 arg3, byte[] arg4, int arg5) {
        if (arg2 != -47) {
            this.field3650 = 68;
        }
        return new class343(this, arg3, arg5, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "()Z", line = 26)
    public final boolean method57() {
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z[Lit;)Lmia;", line = 33)
    public final class657 method1434(boolean arg0, class734[] arg1) {
        if (!arg0) {
            field3662 = null;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "(I)V", line = 43)
    public final synchronized void method97(int arg0) {
        this.field3644.method2208(21348);
        super.method97(arg0);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILsea;)I", line = 52)
    private static final int method1713(int arg0, class399 arg1) {
        if (arg0 != 0) {
            return -7;
        } else if (class261.field3313 == arg1) {
            return 2;
        } else if (class62.field839 == arg1) {
            return 3;
        } else if (class604.field8371 == arg1) {
            return 1;
        } else if (class260.field3301 == arg1) {
            return 4;
        } else if (class401.field5557 == arg1) {
            return 6;
        } else if (class348.field4507 == arg1) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lpea;Lst;)Lmk;", line = 85)
    public final class344 method154(class594 arg0, class675 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjagdx/IDirect3DVertexShader;)V", line = 92)
    public final void method1714(byte arg0, IDirect3DVertexShader arg1) {
        this.field3652 = arg1;
        this.field3643.SetVertexShader(arg1);
        this.method1425((byte) 121);
        if (arg0 != 87) {
            this.field3653 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "()V", line = 104)
    public final void method116() {
    }

    @OriginalMember(owner = "client!cu", name = "Q", descriptor = "(I)V", line = 110)
    public final void method1435(int arg0) {
        if (this.field9545) {
            field3662[1] = 0.0F;
            field3662[7] = 0.0F;
            field3662[2] = 0.0F;
            field3662[6] = 0.0F;
            field3662[0] = 1.0F;
            field3662[12] = 0.0F;
            field3662[14] = 0.0F;
            field3662[10] = 1.0F;
            field3662[3] = 0.0F;
            field3662[15] = 1.0F;
            field3662[11] = 0.0F;
            field3662[13] = 0.0F;
            field3662[8] = 0.0F;
            field3662[4] = 0.0F;
            field3662[9] = 0.0F;
            field3662[5] = 1.0F;
        } else {
            this.field9543.method2739(-127, field3662);
        }
        if (arg0 != -3) {
            this.field3660 = null;
        }
        this.field3643.SetTransform(256, field3662);
    }

    @OriginalMember(owner = "client!cu", name = "na", descriptor = "(IIII)[I", line = 148)
    public final int[] method143(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field3643.method4010(0);
        IDirect3DSurface var7 = this.field3643.method4024(arg2, arg3, 21, 0, 0, true);
        if (class723.method3998(false, this.field3643.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class723.method3998(false, var7.LockRect(0, 0, arg2, arg3, 16, this.field3642))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field3642.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field3642.method3999(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field3642.method3999(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2211(126);
        var7.method2211(126);
        return var5;
    }

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "(B)V", line = 188)
    public final void method1425(byte arg0) {
        if (this.field3652 == null && this.field9632[this.field9568] != class738.field10334) {
            if (this.field9632[this.field9568] == class641.field8858) {
                this.field3643.SetTransform(this.field9568 + 16, this.field9580[this.field9568].method2722(-23223, field3662));
            } else {
                this.field3643.SetTransform(this.field9568 + 16, this.field9580[this.field9568].method2739(-104, field3662));
            }
            int var2 = method1720(12, this.field9632[this.field9568]);
            if (this.field3647[this.field9568] != var2) {
                this.field3643.SetTextureStageState(this.field9568, 24, var2);
                this.field3647[this.field9568] = var2;
            }
        } else {
            this.field3643.SetTextureStageState(this.field9568, 24, 0);
            this.field3647[this.field9568] = 0;
        }
        int var3 = -5 % ((74 - arg0) / 44);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(IIIID)V", line = 219)
    public final void method120(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III[IZII)Lbaa;", line = 222)
    public final class620 method1438(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 >= -86) {
            this.field3643 = null;
        }
        return new class644(this, arg2, arg1, arg4, arg3, arg5, arg6);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILaga;)V", line = 233)
    public final void method1715(int arg0, class644 arg1) {
        this.method1725(0, arg1);
        if (arg1.field8883 != this.field3649[this.field9568]) {
            this.field3643.SetSamplerState(this.field9568, 1, arg1.field8883 ? 1 : 3);
            this.field3649[this.field9568] = arg1.field8883;
        }
        if (arg1.field8885 != this.field3657[this.field9568]) {
            this.field3643.SetSamplerState(this.field9568, 2, arg1.field8885 ? 1 : 3);
            this.field3657[this.field9568] = arg1.field8885;
        }
        if (arg0 != 31390) {
            this.method1393(-42);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ[BILem;III)Lbaa;", line = 256)
    public final class620 method1413(int arg0, boolean arg1, byte[] arg2, int arg3, class610 arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 0) {
            this.field3641 = null;
        }
        return new class644(this, arg4, arg3, arg0, arg1, arg2, arg6, arg7);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILvv;)I", line = 266)
    private static final int method1716(int arg0, class442 arg1) {
        if (class409.field5765 == arg1) {
            return 2;
        } else if (class155.field1901 == arg1) {
            return 4;
        } else if (class353.field4729 == arg1) {
            return 26;
        } else if (class235.field3034 == arg1) {
            return 7;
        } else if (class262.field3332 == arg1) {
            return 10;
        } else if (arg0 == 19546) {
            throw new IllegalArgumentException();
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "(B)V", line = 296)
    public final void method1416(byte arg0) {
        if (arg0 == 123) {
            this.field3643.method4021(28, this.field9599 && this.field9600 && this.field9586 >= 0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIIZ[FILem;I)Lbaa;", line = 307)
    public final class620 method1387(byte arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, class610 arg6, int arg7) {
        if (arg0 != 24) {
            this.field3636 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "(II)V", line = 318)
    public final void method1381(int arg0, int arg1) {
        int var3 = 68 % ((59 - arg1) / 53);
        this.field3643.SetTextureStageState(this.field9568, 11, arg0);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)Lru;", line = 326)
    public final class246 method1412(boolean arg0, boolean arg1) {
        if (!arg1) {
            field3640 = null;
        }
        return new class259(this, class240.field3094, arg0);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lmk;)V", line = 335)
    public final void method111(class344 arg0) {
    }

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "(Z)V", line = 339)
    public final void method1400(boolean arg0) {
        if (arg0) {
            this.field3648 = null;
        }
        this.field3643.method4021(174, this.field9677);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZIZILwga;)V", line = 351)
    public final void method1395(boolean arg0, int arg1, boolean arg2, int arg3, class506 arg4) {
        int var6 = 0;
        if (arg3 >= -33) {
            this.method1412(false, false);
        }
        byte var8;
        if (arg1 == 1) {
            var8 = 3;
        } else if (arg1 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg2) {
            var6 |= 0x20;
        }
        if (arg0) {
            var6 |= 0x10;
        }
        this.field3643.SetTextureStageState(this.field9568, var8, method1719(arg4, -88) | var6);
    }

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "(I)V", line = 399)
    public final void method1396(int arg0) {
        if (arg0 != 0) {
            this.field3649 = null;
        }
        if (this.field3639) {
            return;
        }
        this.field3643.LightEnable(0, false);
        this.field3643.LightEnable(1, false);
        this.field3643.SetLight(0, this.field3648);
        this.field3643.SetLight(1, this.field3661);
        this.field3643.LightEnable(0, true);
        this.field3643.LightEnable(1, true);
        this.field3639 = true;
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "()V", line = 419)
    public final void method93() {
    }

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "(I)V", line = 422)
    public final void method1408(int arg0) {
        this.field3648.SetAmbient(this.field9651 * this.field9564, this.field9651 * this.field9571, this.field9651 * this.field9606, (float) arg0);
        this.field3639 = false;
    }

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "()V", line = 429)
    public final void method175() {
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(Z)V", line = 431)
    public final void method169(boolean arg0) {
    }

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "(B)V", line = 436)
    public final void method1409(byte arg0) {
        if (this.field9626.method362(13)) {
            this.field9551.method2739(-116, field3662);
        } else {
            field3662[4] = 0.0F;
            field3662[7] = 0.0F;
            field3662[0] = 1.0F;
            field3662[15] = 1.0F;
            field3662[9] = 0.0F;
            field3662[8] = 0.0F;
            field3662[5] = 1.0F;
            field3662[2] = 0.0F;
            field3662[6] = 0.0F;
            field3662[11] = 0.0F;
            field3662[14] = 0.0F;
            field3662[1] = 0.0F;
            field3662[12] = 0.0F;
            field3662[13] = 0.0F;
            field3662[10] = 1.0F;
            field3662[3] = 0.0F;
        }
        if (arg0 != -40) {
            method1716(36, null);
        }
        this.field3643.SetTransform(2, field3662);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILsea;IB)V", line = 473)
    public final void method1389(int arg0, class399 arg1, int arg2, byte arg3) {
        this.field3643.DrawPrimitive(method1713(0, arg1), arg2, arg0);
        int var5 = -50 % ((arg3 - 45) / 33);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;B)V", line = 488)
    public final void method1717(IDirect3DPixelShader arg0, byte arg1) {
        if (arg1 < 124) {
            this.field3659 = null;
        }
        this.field3643.SetPixelShader(arg0);
    }

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "(I)V", line = 498)
    public final void method1386(int arg0) {
        if (arg0 != -3832) {
            this.method1438(34, 102, -54, null, true, -24, 98);
        }
        int var2 = this.field3653[this.field9568] ? method1716(19546, this.field9654[this.field9568]) : 1;
        this.field3643.SetTextureStageState(this.field9568, 1, var2);
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)V", line = 511)
    public final void method1398(byte arg0) {
        float var2 = this.field9611 ? this.field9650 : 0.0F;
        if (arg0 > 91) {
            float var3 = this.field9611 ? -this.field9628 : 0.0F;
            this.field3648.SetDiffuse(this.field9564 * var2, this.field9571 * var2, this.field9606 * var2, 0.0F);
            this.field3661.SetDiffuse(this.field9564 * var3, this.field9571 * var3, this.field9606 * var3, 0.0F);
            this.field3639 = false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V", line = 526)
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Leca;B)V", line = 530)
    public final void method1718(class343 arg0, byte arg1) {
        this.method1725(0, arg0);
        if (!this.field3649[this.field9568]) {
            this.field3643.SetSamplerState(this.field9568, 1, 1);
            this.field3649[this.field9568] = true;
        }
        if (!this.field3657[this.field9568]) {
            this.field3643.SetSamplerState(this.field9568, 2, 1);
            this.field3657[this.field9568] = true;
        }
        if (arg1 != -57) {
            this.field3651 = false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 554)
    public final void method1426(byte arg0, Object arg1, Canvas arg2) {
        if (arg0 > -111) {
            this.method1384(null, false, null);
        }
        this.field3660 = (class473) arg1;
    }

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "(B)V", line = 565)
    public final void method1437(byte arg0) {
        if (arg0 <= 103) {
            this.field3642 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Laca;B)V", line = 574)
    public final void method1428(class580 arg0, byte arg1) {
        if (arg1 != -43) {
            method1713(-27, null);
        }
        int var3 = 0;
        if (class537.field7542 == arg0) {
            var3 = 65536;
        } else if (class489.field6953 == arg0) {
            var3 = 131072;
        } else if (class418.field5950 == arg0) {
            var3 = 196608;
        }
        this.field3643.SetTextureStageState(this.field9568, 11, this.field9568 | var3);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lwga;I)I", line = 598)
    private static final int method1719(class506 arg0, int arg1) {
        if (arg1 > -39) {
            field3662 = null;
        }
        if (class632.field8774 == arg0) {
            return 2;
        } else if (class222.field2913 == arg0) {
            return 0;
        } else if (class155.field1970 == arg0) {
            return 1;
        } else if (class663.field9083 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "(B)V", line = 623)
    public final void method1414(byte arg0) {
        this.field9577 = (this.field9619 - this.field9653);
        this.field9637 = this.field9577 - (float) this.field9586;
        if ((float) this.field9559 > this.field9637) {
            this.field9637 = this.field9559;
        }
        this.field3643.method4022(36, this.field9637);
        this.field3643.method4022(37, this.field9577);
        this.field3643.SetRenderState(34, this.field9573);
        if (arg0 != 100) {
            this.field3639 = false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "(B)V", line = 643)
    public final void method1380(byte arg0) {
        for (int var2 = 0; var2 < this.field9592; var2++) {
            this.field3643.SetSamplerState(var2, 7, 0);
            this.field3643.SetSamplerState(var2, 6, 2);
            this.field3643.SetSamplerState(var2, 5, 2);
            this.field3643.SetSamplerState(var2, 1, 1);
            this.field3643.SetSamplerState(var2, 2, 1);
            this.field3659[var2] = class650.field8933;
            this.field3649[var2] = this.field3657[var2] = true;
            this.field3654[var2] = false;
            this.field3647[var2] = 0;
        }
        this.field3643.SetTextureStageState(0, 6, 1);
        this.field3643.SetRenderState(9, 2);
        this.field3643.SetRenderState(23, 4);
        this.field3643.SetRenderState(25, 5);
        this.field3643.SetRenderState(24, 0);
        this.field3643.SetRenderState(22, 2);
        this.field3643.SetRenderState(147, 1);
        this.field3643.SetRenderState(145, 1);
        this.field3643.method4022(38, 0.95F);
        this.field3643.SetRenderState(140, 3);
        this.field3648.SetType(3);
        this.field3661.SetType(3);
        this.field3638.SetType(1);
        this.field3639 = false;
        super.method1380(arg0);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ[[IZ)Lsq;", line = 679)
    public final class207 method1429(int arg0, boolean arg1, int[][] arg2, boolean arg3) {
        if (arg1) {
            createToolkit(null, null, null, null);
        }
        return new class356(this, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "()V", line = 689)
    public final void method84() {
        this.field3644.method2209((byte) 125);
        super.method84();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ltj;Ltj;FLtj;)Ltj;", line = 697)
    public final class662 method119(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "(B)V", line = 704)
    public final void method1422(byte arg0) {
        if (arg0 < 114) {
            this.method1403(null, true, (byte) -123, -37);
        }
        this.field3643.method4021(14, this.field9649 && this.field9578);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lu;BI)V", line = 718)
    public final void method1407(class60 arg0, byte arg1, int arg2) {
        class226 var4 = (class226) arg0;
        this.field3643.SetStreamSource(arg2, var4.field2976, 0, var4.method1456(-2407));
        int var5 = -77 % ((-arg1 - 17) / 55);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lew;BLem;)Z", line = 729)
    public final boolean method1399(class240 arg0, byte arg1, class610 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg1 != 62) {
            this.method1398((byte) -55);
        }
        return class723.method3998(false, this.field3658.method4007(this.field3655, var4)) && class723.method3998(false, this.field3658.CheckDeviceFormat(this.field3655, this.field3650, var4.Format, 0, 3, method1722(arg0, arg2, arg1 ^ 0xFFFFFE97)));
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(ILkh;)I", line = 741)
    private static final int method1720(int arg0, class354 arg1) {
        int var2 = 74 % ((59 - arg0) / 35);
        if (class179.field2368 == arg1) {
            return 1;
        } else if (class641.field8858 == arg1) {
            return 2;
        } else if (class211.field2697 == arg1) {
            return 3;
        } else if (class679.field9223 == arg1) {
            return 4;
        } else if (class182.field2389 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "(I)V", line = 768)
    public final void method1392(int arg0) {
        this.field3648.SetDirection(-this.field9585[0], -this.field9585[1], -this.field9585[2]);
        if (arg0 == 256) {
            this.field3661.SetDirection(-this.field9566[0], -this.field9566[1], -this.field9566[2]);
            this.field3639 = false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ku;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lsk;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lkha;I)V", line = 780)
    private class287(int arg0, int arg1, Canvas arg2, class360 arg3, IDirect3D arg4, IDirect3DDevice arg5, class473 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class96 arg9, class687 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field3655 = arg0;
            this.field3650 = arg1;
            this.field3641 = arg8;
            this.field3658 = arg4;
            this.field3644 = arg3;
            this.field3660 = arg6;
            this.field3643 = arg5;
            this.field3646 = arg7;
            this.field3648 = new class724(this.field3644);
            this.field3661 = new class724(this.field3644);
            this.field3638 = new class724(this.field3644);
            this.field3642 = new PixelBuffer(this.field3644);
            this.field3636 = new GeometryBuffer(this.field3644);
            new GeometryBuffer(this.field3644);
            this.field9604 = (this.field3641.TextureCaps & 0x2000) != 0;
            this.field9612 = (this.field3641.TextureCaps & 0x800) != 0;
            this.field3635 = (this.field3641.TextureCaps & 0x2) == 0;
            this.field9592 = this.field3641.MaxSimultaneousTextures;
            this.field3651 = (this.field3641.TextureCaps & 0x10000) != 0;
            this.field9567 = this.field3641.MaxActiveLights <= 0 ? 8 : this.field3641.MaxActiveLights;
            this.field3637 = (this.field3641.TextureCaps & 0x4000) != 0;
            this.field9583 = this.field9589 > 0 || this.field3658.CheckDeviceMultiSampleType(this.field3655, this.field3650, this.field3646.BackBufferFormat, true, 2) == 0;
            this.field3647 = new int[this.field9592];
            this.field3654 = new boolean[this.field9592];
            this.field3657 = new boolean[this.field9592];
            this.field3649 = new boolean[this.field9592];
            this.field3653 = new boolean[this.field9592];
            this.field3659 = new class721[this.field9592];
            this.field3643.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method2658(-119);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lem;ILew;ZI)Lbaa;", line = 828)
    public final class620 method1401(class610 arg0, int arg1, class240 arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.field3648 = null;
        }
        return new class644(this, arg0, arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "()V", line = 838)
    public final void method62() {
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(II)V", line = 841)
    public final void method89(int arg0, int arg1) throws class510 {
        this.field3643.EndScene();
        if (this.field3660.method2776((byte) 64)) {
            this.field3645 = 0;
            if (class723.method3997(this.field3660.method2779(0, 0), -126)) {
                this.method1721(false);
            }
        } else if ((++this.field3645) <= 50) {
            this.method1721(false);
        } else {
            throw new class510();
        }
        this.field3643.BeginScene();
    }

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "(B)V", line = 864)
    public final void method1427(byte arg0) {
        if (arg0 > -127) {
            this.method1414((byte) 27);
        }
        int var2 = this.field3653[this.field9568] ? method1716(19546, this.field9630[this.field9568]) : 1;
        this.field3643.SetTextureStageState(this.field9568, 4, var2);
    }

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "(I)V", line = 876)
    public final void method1404(int arg0) {
        if (this.field3653[this.field9568]) {
            this.field3653[this.field9568] = false;
            this.field3643.SetTexture(this.field9568, null);
            this.method1427((byte) -128);
            this.method1386(-3832);
        }
        if (arg0 != 13039) {
            method1723(null, 9, null, -15, -121, -62);
        }
    }

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "(Z)Z", line = 895)
    private final boolean method1721(boolean arg0) {
        int var2 = this.field3643.TestCooperativeLevel();
        if (arg0) {
            return false;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class473 var3 = (class473) this.field9469;
            this.method3785(9);
            var3.method2778(0);
            this.field3646.BackBufferWidth = 0;
            this.field3646.BackBufferHeight = 0;
            if (method1723(this.field3646, this.field3650, this.field3658, 0, this.field9589, this.field3655)) {
                int var4 = this.field3643.Reset(this.field3646);
                if (class723.method3998(arg0, var4)) {
                    var3.method2777(this.field3643.method4025(), 0, this.field3643.method4023(0));
                    this.method3774(false);
                    this.method1380((byte) -1);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "(I)V", line = 933)
    public final void method1432(int arg0) {
        this.field3643.method4021(27, this.field9617);
        if (arg0 != -7467) {
            this.field3636 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 943)
    public final void method122(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class510 {
        this.method89(arg2, arg3);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lew;Lem;I)I", line = 950)
    public static final int method1722(class240 arg0, class610 arg1, int arg2) {
        if (arg2 != -343) {
            field3656 = null;
        }
        if (class240.field3093 == arg0) {
            if (class300.field3868 == arg1) {
                return 22;
            }
            if (class440.field6178 == arg1) {
                return 21;
            }
            if (class15.field215 == arg1) {
                return 28;
            }
            if (class750.field10490 == arg1) {
                return 50;
            }
            if (class332.field4276 == arg1) {
                return 51;
            }
            if (class590.field8226 == arg1) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V", line = 988)
    public final void method1384(Object arg0, boolean arg1, Canvas arg2) {
        if (!arg1) {
            field3656 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "(II)V", line = 996)
    public final void method105(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 999)
    public final void method1417(Canvas arg0, byte arg1, Object arg2) {
        if (arg1 > -89) {
            method1723(null, 115, null, -119, 52, 118);
        }
        if (this.field9370 != arg0) {
            return;
        }
        Dimension var4 = arg0.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field3643.EndScene();
            this.method1721(false);
            this.field3643.BeginScene();
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;III)Z", line = 1027)
    private static final boolean method1723(D3DPRESENT_PARAMETERS arg0, int arg1, IDirect3D arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class723.method3997(arg2.method4007(arg5, var9), -84)) {
                return false;
            }
            label80: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var10 = 0; var10 < field3656.length; var10++) {
                        if (arg2.CheckDeviceType(arg5, arg1, var9.Format, field3656[var10], true) == 0 && arg2.CheckDeviceFormat(arg5, arg1, var9.Format, 1, 1, field3656[var10]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg5, arg1, field3656[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field3640.length; var11++) {
                                if (arg2.CheckDeviceFormat(arg5, arg1, var9.Format, 2, 1, field3640[var11]) == 0 && arg2.CheckDepthStencilMatch(arg5, arg1, var9.Format, field3656[var10], field3640[var11]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg5, arg1, field3640[var10], true, var8) == 0)) {
                                    var7 = field3656[var10];
                                    var6 = field3640[var11];
                                    break label80;
                                }
                            }
                        }
                    }
                }
                arg4--;
            }
            if (arg4 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg0.MultiSampleQuality = 0;
            arg0.MultiSampleType = var8;
            arg0.BackBufferFormat = var7;
            arg0.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILsea;BIILru;I)V", line = 1132)
    public final void method1415(int arg0, class399 arg1, byte arg2, int arg3, int arg4, class246 arg5, int arg6) {
        this.field3643.SetIndices(((class259) arg5).field3290);
        int var8 = -13 % ((arg2 - 49) / 44);
        this.field3643.DrawIndexedPrimitive(method1713(0, arg1), 0, arg0, arg6, arg3, arg4);
    }

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "()Z", line = 1149)
    public final boolean method86() {
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "(I)V", line = 1157)
    public final void method1419(int arg0) {
        this.field3643.SetViewport(this.field9644, this.field9640, this.field9502, this.field9506, 0.0F, 1.0F);
        if (arg0 <= 102) {
            this.field3653 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "ya", descriptor = "()V", line = 1167)
    public final void method99() {
        this.method3765(true, -32);
        this.field3643.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(FFF)V", line = 1180)
    public final void method163(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cu", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lkha;Ljava/lang/Integer;)Lha;", line = 1187)
    public static final class454 createToolkit(Canvas arg0, class96 arg1, class687 arg2, Integer arg3) {
        class287 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class360 var7 = new class360();
            IDirect3D var8 = IDirect3D.method4005(-2147483616, var7);
            D3DCAPS var9 = var8.method4006(var5, var6);
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
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method1723(var10, var6, var8, 0, arg3, var5)) {
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
                    var13 = var8.method4004(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class725 var17) {
                    var13 = var8.method4004(var5, var6, arg0, var11 | 0x20, var10);
                }
                class473 var15 = new class473(var13.method4023(0), var13.method4025());
                var4 = new class287(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3788(262144);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method84();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "(B)V", line = 1292)
    public final void method1390(byte arg0) {
        if (arg0 == 88) {
            this.field3643.method4021(7, this.field9591);
        }
    }

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "(I)V", line = 1302)
    public final void method1433(int arg0) {
        this.method1398((byte) 120);
        this.method1396(arg0);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(BZ)V", line = 1310)
    public final void method1397(byte arg0, boolean arg1) {
        if (arg0 <= 122) {
            this.field3645 = -21;
        }
        this.field3643.method4021(161, arg1);
    }

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "()Loj;", line = 1321)
    public final class633 method79() {
        D3DADAPTER_IDENTIFIER var1 = this.field3658.method4003(this.field3655, 0);
        return new class633(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Lst;", line = 1330)
    public final class675 method148(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLbba;)I", line = 1337)
    private static final int method1724(byte arg0, class721 arg1) {
        if (class650.field8933 == arg1) {
            return 2;
        } else if (class211.field2698 == arg1) {
            return 1;
        } else {
            if (arg0 <= 66) {
                field3656 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cu", name = "GA", descriptor = "(I)V", line = 1354)
    public final void method166(int arg0) {
        this.field3643.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "(I)V", line = 1361)
    public final void method1406(int arg0) {
        this.field3643.SetRenderState(60, this.field9574);
        int var2 = 3 / ((20 - arg0) / 46);
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(II)Lpea;", line = 1375)
    public final class594 method174(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!cu", name = "T", descriptor = "(I)F", line = 1382)
    public final float method1391(int arg0) {
        if (arg0 < 7) {
            this.method1390((byte) 18);
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "(B)V", line = 1392)
    public final void method1411(byte arg0) {
        this.field3643.method4021(15, this.field9639);
        if (arg0 != -37) {
            this.field3654 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "()I", line = 1402)
    public final int method127() {
        return 0;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILhr;)V", line = 1409)
    public final void method1725(int arg0, class231 arg1) {
        this.field3643.SetTexture(this.field9568, arg1.method1465(13367));
        if (this.field3659[this.field9568] != arg1.field3006) {
            int var3 = method1724((byte) 122, arg1.field3006);
            this.field3643.SetSamplerState(this.field9568, 6, var3);
            this.field3643.SetSamplerState(this.field9568, 5, var3);
            this.field3659[this.field9568] = arg1.field3006;
            if (this.field3654[this.field9568] != arg1.field3002) {
                this.field3643.SetSamplerState(this.field9568, 7, arg1.field3002 ? method1724((byte) 73, arg1.field3006) : 0);
                this.field3654[this.field9568] = arg1.field3002;
            }
        } else if (this.field3654[this.field9568] != arg1.field3002) {
            this.field3643.SetSamplerState(this.field9568, 7, arg1.field3002 ? method1724((byte) 115, arg1.field3006) : 0);
            this.field3654[this.field9568] = arg1.field3002;
        }
        if (!this.field3653[this.field9568]) {
            this.field3653[this.field9568] = true;
            this.method1427((byte) -128);
            this.method1386(-3832);
        }
        if (arg0 != 0) {
            this.field3642 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lwga;ZBI)V", line = 1453)
    public final void method1403(class506 arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 != 0) {
            this.method1431(112, 94);
        }
        int var5 = 0;
        byte var7;
        if (arg3 == 1) {
            var7 = 6;
        } else if (arg3 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg1) {
            var5 |= 0x10;
        }
        this.field3643.SetTextureStageState(this.field9568, var7, method1719(arg0, -107) | var5);
    }

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "(I)V", line = 1499)
    public final void method1424(int arg0) {
        this.field3643.SetTransform(3, this.field9572);
        if (arg0 != -673) {
            field3656 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "()V", line = 1512)
    public final void method172() {
        IDirect3DEventQuery var1 = this.field3643.method4017();
        if (class723.method3998(false, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2211(50);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(IZ)Lu;", line = 1536)
    public final class60 method1423(int arg0, boolean arg1) {
        if (arg0 < 95) {
            this.method169(true);
        }
        return new class226(this, arg1);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;", line = 1546)
    public final Object method1394(boolean arg0, Canvas arg1) {
        if (arg0) {
            this.field3648 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "(I)V", line = 1557)
    public final void method1439(int arg0) {
        int var2 = 0;
        if (arg0 != -129) {
            this.method1394(false, null);
        }
        while (var2 < this.field9641) {
            class621 var3 = this.field9613[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3401(4);
            float var6 = var3.method3405(false) / 255.0F;
            this.field3638.SetPosition((float) var3.method3402(true), (float) var3.method3403((byte) 108), (float) var3.method3404(-1));
            this.field3638.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFFED) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field3638.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3399((byte) -108) * var3.method3399((byte) -108)));
            this.field3638.SetRange((float) var3.method3399((byte) -108));
            this.field3643.SetLight(var4, this.field3638);
            this.field3643.LightEnable(var4, true);
            var2++;
        }
        while (var2 < this.field9623) {
            this.field3643.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1439(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "(Z)V", line = 1595)
    public final void method1388(boolean arg0) {
        this.field3643.method4021(137, this.field9597 && !this.field9579);
        if (!arg0) {
            this.method1394(false, null);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILmia;)V", line = 1606)
    public final void method1436(int arg0, class657 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 == 14522) {
            this.field3643.SetVertexDeclaration(var3.field10278);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLem;Lew;)Z", line = 1621)
    public final boolean method1385(byte arg0, class610 arg1, class240 arg2) {
        if (arg0 >= -42) {
            this.field3658 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class723.method3998(false, this.field3658.method4007(this.field3655, var4)) && class723.method3998(false, this.field3658.CheckDeviceFormat(this.field3655, this.field3650, var4.Format, 0, 4, method1722(arg2, arg1, -343)));
    }

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "(II)Laia;", line = 1633)
    public final class384 method1431(int arg0, int arg1) {
        if (arg0 != -16278) {
            return (class384) null;
        } else if (arg1 == 3) {
            return new class605(this, this.field9420);
        } else if (arg1 == 4) {
            return new class318(this, this.field9420, this.field9446);
        } else if (arg1 == 8) {
            return new class366(this, this.field9420, this.field9446);
        } else {
            return super.method1431(-16278, arg1);
        }
    }

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "(B)V", line = 1678)
    public final void method1383(byte arg0) {
        if (arg0 < 53) {
            this.field3649 = null;
        }
        if (class24.field401 == this.field9624) {
            this.field3643.SetRenderState(19, 5);
            this.field3643.SetRenderState(20, 6);
        } else if (class146.field1764 == this.field9624) {
            this.field3643.SetRenderState(19, 2);
            this.field3643.SetRenderState(20, 2);
        } else if (class36.field537 == this.field9624) {
            this.field3643.SetRenderState(19, 9);
            this.field3643.SetRenderState(20, 2);
        }
    }
}
