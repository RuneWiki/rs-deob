import jaclib.peer.class587;
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
import jagdx.class415;
import jagdx.class416;
import jagdx.class417;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class391 extends class294 {

    @OriginalMember(owner = "client!rca", name = "zg", descriptor = "I")
    private int field5977 = 0;

    @OriginalMember(owner = "client!rca", name = "Eg", descriptor = "Z")
    private boolean field5982 = false;

    @OriginalMember(owner = "client!rca", name = "xg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field5975;

    @OriginalMember(owner = "client!rca", name = "Kg", descriptor = "Ljaclib/peer/cv;")
    public class587 field5988;

    @OriginalMember(owner = "client!rca", name = "vg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field5973;

    @OriginalMember(owner = "client!rca", name = "Ng", descriptor = "I")
    private int field5991;

    @OriginalMember(owner = "client!rca", name = "Og", descriptor = "Ljd;")
    private class196 field5992;

    @OriginalMember(owner = "client!rca", name = "Hg", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!rca", name = "Mg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field5990;

    @OriginalMember(owner = "client!rca", name = "Gg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field5984;

    @OriginalMember(owner = "client!rca", name = "Bg", descriptor = "Ljagdx/D3DLIGHT;")
    private class417 field5979;

    @OriginalMember(owner = "client!rca", name = "Tg", descriptor = "Ljagdx/D3DLIGHT;")
    private class417 field5997;

    @OriginalMember(owner = "client!rca", name = "Rg", descriptor = "Ljagdx/D3DLIGHT;")
    private class417 field5995;

    @OriginalMember(owner = "client!rca", name = "Jg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field5987;

    @OriginalMember(owner = "client!rca", name = "Fg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field5983;

    @OriginalMember(owner = "client!rca", name = "Sg", descriptor = "Z")
    public boolean field5996;

    @OriginalMember(owner = "client!rca", name = "Ig", descriptor = "Z")
    public boolean field5986;

    @OriginalMember(owner = "client!rca", name = "Qg", descriptor = "Z")
    public boolean field5994;

    @OriginalMember(owner = "client!rca", name = "Cg", descriptor = "[I")
    private int[] field5980;

    @OriginalMember(owner = "client!rca", name = "yg", descriptor = "[Llba;")
    private class477[] field5976;

    @OriginalMember(owner = "client!rca", name = "Dg", descriptor = "[Z")
    private boolean[] field5981;

    @OriginalMember(owner = "client!rca", name = "ug", descriptor = "[Z")
    private boolean[] field5972;

    @OriginalMember(owner = "client!rca", name = "tg", descriptor = "[Z")
    private boolean[] field5971;

    @OriginalMember(owner = "client!rca", name = "Lg", descriptor = "[Z")
    private boolean[] field5989;

    @OriginalMember(owner = "client!rca", name = "Ag", descriptor = "[I")
    private static int[] field5978 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!rca", name = "wg", descriptor = "[F")
    private static float[] field5974 = new float[16];

    @OriginalMember(owner = "client!rca", name = "Pg", descriptor = "[I")
    private static int[] field5993 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(FFF)V")
    public final void method387(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!rca", name = "KA", descriptor = "(IIII)[I")
    public final int[] method405(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field5990.method2630(0);
        IDirect3DSurface var7 = this.field5990.method2632(arg2, arg3, 21, 0, 0, true);
        if (class416.method2641((byte) 48, this.field5990.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 1)) && class416.method2641((byte) 48, var7.LockRect(0, 0, arg2, arg3, 0, this.field5987))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field5987.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field5987.method2637(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field5987.method2637(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3429((byte) -61);
        var7.method3429((byte) -97);
        return var5;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
    public final void method1534(Canvas arg0, Object arg1, byte arg2) {
        if (arg2 >= -15) {
            this.method1555(null, null, 19, -97, 97);
        }
    }

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "(B)V")
    public final void method1538(byte arg0) {
        this.field5990.method2622(174, this.field4381);
        int var2 = -23 % ((56 - arg0) / 60);
    }

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "(B)V")
    public final void method1556(byte arg0) {
        int var2 = 33 / ((-arg0 - 19) / 50);
        if (class331.field4766 == this.field4354) {
            this.field5990.SetRenderState(19, 5);
            this.field5990.SetRenderState(20, 6);
        } else if (class297.field4402 == this.field4354) {
            this.field5990.SetRenderState(19, 2);
            this.field5990.SetRenderState(20, 2);
        } else if (class238.field3393 == this.field4354) {
            this.field5990.SetRenderState(19, 9);
            this.field5990.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!rca", name = "V", descriptor = "(I)V")
    public final void method1531(int arg0) {
        int var2 = -19 / ((arg0 - 29) / 48);
        this.field5990.SetTransform(3, this.field4312);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLkm;)I")
    private static final int method2514(byte arg0, class299 arg1) {
        if (arg0 > -95) {
            return 74;
        } else if (class83.field935 == arg1) {
            return 2;
        } else if (class242.field3434 == arg1) {
            return 0;
        } else if (class577.field8332 == arg1) {
            return 1;
        } else if (class173.field2123 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(IZ)V")
    public final void method1518(int arg0, boolean arg1) {
        if (arg0 == -28192) {
            this.field5990.method2622(161, arg1);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Llba;I)I")
    private static final int method2515(class477 arg0, int arg1) {
        if (class450.field6724 == arg0) {
            return 2;
        } else if (class570.field8217 == arg0) {
            return 1;
        } else if (arg1 == 1) {
            throw new IllegalArgumentException();
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "()V")
    public final void method367() {
        this.field5988.method3430(-16501);
        super.method367();
    }

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "(B)V")
    public final void method1566(byte arg0) {
        if (arg0 != 95) {
            this.field5990 = null;
        }
        this.field5990.method2622(28, this.field4339 && this.field4348 && this.field4310 >= 0 | this.field4293);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILep;)V")
    public final void method1562(int arg0, class358 arg1) {
        if (arg0 > 9) {
            dxVertexLayout var3 = (dxVertexLayout) arg1;
            this.field5990.SetVertexDeclaration(var3.field3806);
        }
    }

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "(I)V")
    public final void method344(int arg0) {
        this.field5990.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "(II)Lic;")
    public final class607 method1559(int arg0, int arg1) {
        if (arg1 >= -30) {
            return (class607) null;
        } else if (arg0 == 3) {
            return new class610(this, this.field4213);
        } else if (arg0 == 4) {
            return new class505(this, this.field4213, this.field4238);
        } else {
            return super.method1559(arg0, -124);
        }
    }

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "(Z)V")
    public final void method1541(boolean arg0) {
        this.field5979.SetAmbient(this.field4326 * this.field4308, this.field4326 * this.field4275, this.field4326 * this.field4301, 0.0F);
        if (arg0) {
            this.field5982 = false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public final Object method1565(Canvas arg0, int arg1) {
        if (arg1 != 0) {
            this.field5989 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!rca", name = "R", descriptor = "(I)V")
    public final void method1526(int arg0) {
        if (arg0 < -87) {
            this.field5990.SetScissorRect(this.field4340 + this.field4268, this.field4333 + this.field4265, this.field4321, this.field4351);
        }
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(II)V")
    public final void method1507(int arg0, int arg1) {
        this.field5990.SetTextureStageState(this.field4259, 11, arg1);
        if (arg0 != 14) {
            this.method1563(123);
        }
    }

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "(I)V")
    public final void method1509(int arg0) {
        if (arg0 != 0) {
            this.field5994 = true;
        }
        if (this.field5982) {
            return;
        }
        this.field5990.LightEnable(0, false);
        this.field5990.LightEnable(1, false);
        this.field5990.SetLight(0, this.field5979);
        this.field5990.SetLight(1, this.field5997);
        this.field5990.LightEnable(0, true);
        this.field5990.LightEnable(1, true);
        this.field5982 = true;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lvt;ILkp;)I")
    public static final int method2516(class256 arg0, int arg1, class421 arg2) {
        if (arg1 != 9) {
            field5978 = null;
        }
        if (class256.field3653 == arg0) {
            if (class602.field8784 == arg2) {
                return 22;
            }
            if (class538.field7742 == arg2) {
                return 21;
            }
            if (class562.field8019 == arg2) {
                return 28;
            }
            if (class339.field4850 == arg2) {
                return 50;
            }
            if (class162.field1982 == arg2) {
                return 51;
            }
            if (class547.field7824 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILkp;I[BZBI)Lica;")
    public final class579 method1536(int arg0, int arg1, class421 arg2, int arg3, byte[] arg4, boolean arg5, byte arg6, int arg7) {
        if (arg6 <= 76) {
            this.method1565(null, -27);
        }
        return new class71(this, arg2, arg1, arg7, arg5, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "(B)V")
    public final void method1554(byte arg0) {
        if (this.field4243) {
            field5974[5] = 1.0F;
            field5974[4] = 0.0F;
            field5974[15] = 1.0F;
            field5974[6] = 0.0F;
            field5974[11] = 0.0F;
            field5974[14] = 0.0F;
            field5974[10] = 1.0F;
            field5974[1] = 0.0F;
            field5974[8] = 0.0F;
            field5974[3] = 0.0F;
            field5974[7] = 0.0F;
            field5974[9] = 0.0F;
            field5974[0] = 1.0F;
            field5974[13] = 0.0F;
            field5974[12] = 0.0F;
            field5974[2] = 0.0F;
        } else {
            this.field4244.method3691(15, field5974);
        }
        if (arg0 != -37) {
            this.method1545(120);
        }
        this.field5990.SetTransform(256, field5974);
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method1532(Object arg0, int arg1, Canvas arg2) {
        if (arg1 <= 48) {
            this.method1534(null, null, (byte) 101);
        }
        if (this.field4177 != arg2) {
            return;
        }
        Dimension var4 = arg2.getSize();
        if (var4.width > 0 && var4.height > 0) {
            this.field5990.EndScene();
            this.method2519(2);
            this.field5990.BeginScene();
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lkp;Lvt;III)Lica;")
    public final class579 method1555(class421 arg0, class256 arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -8) {
            method2524(null, 0);
        }
        return new class71(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "(I)V")
    public final void method1527(int arg0) {
        if (arg0 < -36) {
            this.field5990.method2622(137, this.field4309 && !this.field4311);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILqda;)I")
    private static final int method2517(int arg0, class87 arg1) {
        if (class159.field1962 == arg1) {
            return 1;
        } else if (class199.field2681 == arg1) {
            return 2;
        } else if (class281.field3918 == arg1) {
            return 3;
        } else if (class199.field2683 == arg1) {
            return 4;
        } else if (class23.field241 == arg1) {
            return 256;
        } else if (arg0 == 24915) {
            return 0;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "()V")
    public final void method349() {
        this.method1905((byte) 22, true);
        this.field5990.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lkp;BLvt;)Z")
    public final boolean method1528(class421 arg0, byte arg1, class256 arg2) {
        if (arg1 != 59) {
            this.method1552(-123, null, null);
        }
        D3DDISPLAYMODE var4 = this.field5973.method2615(this.field5991);
        return class416.method2641((byte) 48, this.field5973.CheckDeviceFormat(this.field5991, this.field5985, var4.Format, 0, 3, method2516(arg2, 9, arg0)));
    }

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "(Z)V")
    public final void method1530(boolean arg0) {
        int var2 = this.field5989[this.field4259] ? method2524(this.field4356[this.field4259], 15) : 1;
        this.field5990.SetTextureStageState(this.field4259, 1, var2);
        if (!arg0) {
            this.field5975 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)V")
    public final void method1547(byte arg0) {
        int var2 = 117 / ((arg0 - 24) / 58);
        this.field5990.SetRenderState(60, this.field4263);
    }

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "(I)V")
    public final void method1522(int arg0) {
        this.method1516(0);
        this.method1509(0);
        if (arg0 != 3) {
            this.field5992 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "(I)V")
    public final void method1545(int arg0) {
        if (this.field4344.method2541(arg0 - 1792)) {
            this.field4256.method3691(15, field5974);
        } else {
            field5974[1] = 0.0F;
            field5974[7] = 0.0F;
            field5974[5] = 1.0F;
            field5974[8] = 0.0F;
            field5974[10] = 1.0F;
            field5974[6] = 0.0F;
            field5974[3] = 0.0F;
            field5974[2] = 0.0F;
            field5974[11] = 0.0F;
            field5974[12] = 0.0F;
            field5974[4] = 0.0F;
            field5974[14] = 0.0F;
            field5974[9] = 0.0F;
            field5974[15] = 1.0F;
            field5974[13] = 0.0F;
            field5974[0] = 1.0F;
        }
        if (arg0 != 1864) {
            this.field5985 = -110;
        }
        this.field5990.SetTransform(2, field5974);
    }

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "(Z)V")
    public final void method1540(boolean arg0) {
        if (arg0) {
            this.field5982 = true;
        }
        this.field5990.method2622(27, this.field4319);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lcca;II)V")
    public final void method1558(class209 arg0, int arg1, int arg2) {
        class183 var4 = (class183) arg0;
        this.field5990.SetStreamSource(arg2, var4.field2284, 0, var4.method1072((byte) -82));
        int var5 = -44 / ((42 - arg1) / 51);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public final synchronized void method400(int arg0) {
        this.field5988.method3433((byte) 29);
        super.method400(arg0);
    }

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "(B)V")
    public final void method1544(byte arg0) {
        if (this.field4293) {
            this.field5990.method2619(36, 0.0F);
            this.field5990.method2619(37, 1.0F);
            this.field5990.SetRenderState(34, this.field4329);
        } else {
            this.field4270 = (this.field4285 - this.field4330);
            this.field4342 = this.field4270 - (float) this.field4310;
            if ((float) this.field4345 > this.field4342) {
                this.field4342 = this.field4345;
            }
            this.field5990.method2619(36, this.field4342);
            this.field5990.method2619(37, this.field4270);
            this.field5990.SetRenderState(34, this.field4359);
        }
        if (arg0 > -110) {
            this.field5987 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIILfea;Lnq;)V")
    public final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4, class123 arg5, class396 arg6) {
        this.field5990.SetIndices(((class106) arg6).field1272);
        if (arg0 == -28296) {
            this.field5990.DrawIndexedPrimitive(method2523(24515, arg5), 0, arg1, arg3, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "()V")
    public final void method362() {
        IDirect3DEventQuery var1 = this.field5990.method2629();
        if (class416.method2641((byte) 48, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3429((byte) -67);
    }

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "(I)V")
    public final void method1529(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field4300; var2++) {
            class321 var3 = this.field4331[var2];
            int var4 = var2 + 2;
            int var5 = var3.method2098((byte) 89);
            float var6 = var3.method2091(-918913433) / 255.0F;
            this.field5995.SetPosition((float) var3.method2093((byte) -122), (float) var3.method2097((byte) -84), (float) var3.method2095(true));
            this.field5995.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) ((var5 & 0xFF7B) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field5995.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method2094(0) * var3.method2094(0)));
            this.field5995.SetRange((float) var3.method2094(0));
            this.field5990.SetLight(var4, this.field5995);
            this.field5990.LightEnable(var4, true);
        }
        int var7 = 112 / ((-arg0 - 8) / 42);
        while (this.field4307 > var2) {
            this.field5990.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method1529(77);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/cv;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ljd;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Le;Lkea;I)V")
    private class391(int arg0, int arg1, Canvas arg2, class587 arg3, IDirect3D arg4, IDirect3DDevice arg5, class196 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class462 arg9, class203 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field5975 = arg7;
        this.field5988 = arg3;
        this.field5973 = arg4;
        this.field5991 = arg0;
        this.field5992 = arg6;
        this.field5985 = arg1;
        this.field5990 = arg5;
        this.field5984 = arg8;
        this.field5979 = new class417(this.field5988);
        this.field5997 = new class417(this.field5988);
        this.field5995 = new class417(this.field5988);
        this.field5987 = new PixelBuffer(this.field5988);
        this.field5983 = new GeometryBuffer(this.field5988);
        this.field4302 = this.field5984.MaxSimultaneousTextures;
        this.field4346 = (this.field5984.TextureCaps & 0x2000) != 0;
        this.field5996 = (this.field5984.TextureCaps & 0x10000) != 0;
        this.field5986 = (this.field5984.TextureCaps & 0x2) == 0;
        this.field4334 = (this.field5984.TextureCaps & 0x800) != 0;
        this.field4352 = this.field5984.MaxActiveLights > 0 ? this.field5984.MaxActiveLights : 8;
        this.field5994 = (this.field5984.TextureCaps & 0x4000) != 0;
        this.field4296 = this.field4272 > 0 || this.field5973.CheckDeviceMultiSampleType(this.field5991, this.field5985, this.field5975.BackBufferFormat, true, 2) == 0;
        this.field5980 = new int[this.field4302];
        this.field5976 = new class477[this.field4302];
        this.field5981 = new boolean[this.field4302];
        this.field5972 = new boolean[this.field4302];
        this.field5971 = new boolean[this.field4302];
        this.field5989 = new boolean[this.field4302];
        this.field5990.BeginScene();
        try {
            this.field5990.Clear(3, 0, 1.0F, 0);
            this.method338();
            this.field5990.Clear(3, 0, 1.0F, 0);
        } catch (class27 var14) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIII)V")
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!rca", name = "Y", descriptor = "(I)V")
    public final void method1512(int arg0) {
        if (arg0 != 0) {
            this.method379();
        }
    }

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "(I)V")
    public final void method1516(int arg0) {
        float var2 = this.field4267 ? this.field4274 : 0.0F;
        float var3 = this.field4267 ? -this.field4357 : 0.0F;
        this.field5979.SetDiffuse(this.field4308 * var2, this.field4275 * var2, this.field4301 * var2, 0.0F);
        this.field5997.SetDiffuse(this.field4308 * var3, this.field4275 * var3, this.field4301 * var3, (float) arg0);
        this.field5982 = false;
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(Z)V")
    public final void method402(boolean arg0) {
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([Lck;Z)Lep;")
    public final class358 method1520(class558[] arg0, boolean arg1) {
        return arg1 ? new dxVertexLayout(this, arg0) : (class358) null;
    }

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "(I)V")
    public final void method1563(int arg0) {
        this.field5979.SetDirection(-this.field4337[0], -this.field4337[1], -this.field4337[2]);
        if (arg0 < 1) {
            this.field5981 = null;
        }
        this.field5997.SetDirection(-this.field4324[0], -this.field4324[1], -this.field4324[2]);
        this.field5982 = false;
    }

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "()Z")
    public final boolean method359() {
        return false;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLwj;)V")
    public final void method2518(byte arg0, class335 arg1) {
        this.field5990.SetTexture(this.field4259, arg1.method153(arg0 + 12755));
        if (this.field5976[this.field4259] != arg1.field4808) {
            int var3 = method2515(arg1.field4808, 1);
            this.field5990.SetSamplerState(this.field4259, 6, var3);
            this.field5990.SetSamplerState(this.field4259, 5, var3);
            this.field5976[this.field4259] = arg1.field4808;
            if (this.field5972[this.field4259] != arg1.field4809) {
                this.field5990.SetSamplerState(this.field4259, 7, arg1.field4809 ? method2515(arg1.field4808, 1) : 0);
                this.field5972[this.field4259] = arg1.field4809;
            }
        } else if (arg1.field4809 != this.field5972[this.field4259]) {
            this.field5990.SetSamplerState(this.field4259, 7, arg1.field4809 ? method2515(arg1.field4808, arg0 ^ 0x76) : 0);
            this.field5972[this.field4259] = arg1.field4809;
        }
        if (arg0 != 119) {
            this.method1517(-41);
        }
        if (!this.field5989[this.field4259]) {
            this.field5989[this.field4259] = true;
            this.method1515((byte) 55);
            this.method1530(true);
        }
    }

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "(I)V")
    public final void method1517(int arg0) {
        this.field5990.method2622(14, this.field4292 && this.field4325);
        int var2 = -105 % ((-arg0 - 3) / 51);
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(BZ)Lnq;")
    public final class396 method1535(byte arg0, boolean arg1) {
        if (arg0 > -59) {
            this.field5972 = null;
        }
        return new class106(this, class256.field3654, arg1);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public final void method1553(Object arg0, int arg1, Canvas arg2) {
        if (arg1 > -81) {
            this.field5992 = null;
        }
        this.field5992 = (class196) arg0;
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "()V")
    public final void method317() {
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method383(Rectangle[] arg0, int arg1) throws class27 {
        this.method338();
    }

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "(B)V")
    public final void method1567(byte arg0) {
        if (arg0 != -43) {
            this.field5992 = null;
        }
        if (this.field5989[this.field4259]) {
            this.field5989[this.field4259] = false;
            this.field5990.SetTexture(this.field4259, null);
            this.method1515((byte) 55);
            this.method1530(true);
        }
    }

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "(I)F")
    public final float method1524(int arg0) {
        return arg0 == 6423 ? -0.5F : -0.67678773F;
    }

    @OriginalMember(owner = "client!rca", name = "Z", descriptor = "(I)Z")
    private final boolean method2519(int arg0) {
        if (arg0 != 2) {
            field5974 = null;
        }
        int var2 = this.field5990.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class196 var3 = (class196) this.field4181;
            this.method1900((byte) 126);
            var3.method1249(false);
            this.field5975.BackBufferWidth = 0;
            this.field5975.BackBufferHeight = 0;
            if (method2520(this.field5985, this.field5973, this.field4272, this.field5991, this.field5975, arg0 ^ 0x10002)) {
                int var4 = this.field5990.Reset(this.field5975);
                if (class416.method2641((byte) 48, var4)) {
                    var3.method1248(this.field5990.method2618(), true, this.field5990.method2625(0));
                    this.method1933(arg0 + 23990);
                    this.method1543(false);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rca", name = "SA", descriptor = "()I")
    public final int method375() {
        return 0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Llk;I)V")
    public final void method1546(class510 arg0, int arg1) {
        int var3 = 0;
        if (class555.field7885 == arg0) {
            var3 = 65536;
        } else if (class406.field6124 == arg0) {
            var3 = 131072;
        } else if (class641.field9242 == arg0) {
            var3 = 196608;
        }
        if (arg1 != 21144) {
            this.method1535((byte) -53, false);
        }
        this.field5990.SetTextureStageState(this.field4259, 11, this.field4259 | var3);
    }

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "()Z")
    public final boolean method335() {
        return false;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ldw;Ldw;FLdw;)Ldw;")
    public final class622 method371(class622 arg0, class622 arg1, float arg2, class622 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILkp;Lvt;)Z")
    public final boolean method1552(int arg0, class421 arg1, class256 arg2) {
        D3DDISPLAYMODE var4 = this.field5973.method2615(this.field5991);
        if (arg0 != 19950) {
            this.field5987 = null;
        }
        return class416.method2641((byte) 48, this.field5973.CheckDeviceFormat(this.field5991, this.field5985, var4.Format, 0, 4, method2516(arg2, 9, arg1)));
    }

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "()Lnl;")
    public final class479 method330() {
        D3DADAPTER_IDENTIFIER var1 = this.field5973.method2617(this.field5991, 0);
        return new class479(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lkm;ZIB)V")
    public final void method1551(class299 arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 >= -56) {
            this.field5992 = null;
        }
        byte var6;
        if (arg2 == 1) {
            var6 = 6;
        } else if (arg2 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg1) {
            var7 |= 0x10;
        }
        this.field5990.SetTextureStageState(this.field4259, var6, var7 | method2514((byte) -105, arg0));
    }

    @OriginalMember(owner = "client!rca", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Le;Lkea;Ljava/lang/Integer;)Loa;")
    public static final class605 createToolkit(Canvas arg0, class462 arg1, class203 arg2, Integer arg3) {
        class391 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class587 var7 = new class587();
            IDirect3D var8 = IDirect3D.method2616(-2147483616, var7);
            D3DCAPS var9 = var8.method2613(var5, var6);
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
                if (!method2520(var6, var8, arg3, var5, var10, 65536)) {
                    throw new RuntimeException("");
                }
                var10.Windowed = true;
                var10.EnableAutoDepthStencil = true;
                var10.PresentationInterval = Integer.MIN_VALUE;
                int var11 = 2;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                Object var12 = null;
                IDirect3DDevice var13;
                try {
                    var13 = var8.method2614(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class415 var17) {
                    var13 = var8.method2614(var5, var6, arg0, var11 | 0x20, var10);
                }
                class196 var15 = new class196(var13.method2625(0), var13.method2618());
                var4 = new class391(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method1964(4);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method367();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(BZ)Lcca;")
    public final class209 method1548(byte arg0, boolean arg1) {
        if (arg0 <= 46) {
            this.method1557(93, null, 84, 76, (byte) -21, null);
        }
        return new class183(this, arg1);
    }

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "(B)V")
    public final void method1519(byte arg0) {
        if (arg0 > 81) {
            this.field5990.method2622(7, this.field4264);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z[FIILkp;IIZ)Lica;")
    public final class579 method1550(boolean arg0, float[] arg1, int arg2, int arg3, class421 arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            this.method1521(true, 41, true, null, false);
        }
        return null;
    }

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "(B)V")
    public final void method1560(byte arg0) {
        this.field5990.SetViewport(this.field4340, this.field4333, this.field4170, this.field4135, 0.0F, 1.0F);
        if (arg0 < 112) {
            this.field5989 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjagdx/IDirect3D;IILjagdx/D3DPRESENT_PARAMETERS;I)Z")
    private static final boolean method2520(int arg0, IDirect3D arg1, int arg2, int arg3, D3DPRESENT_PARAMETERS arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        if (arg5 != 65536) {
            return true;
        }
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = arg1.method2615(arg3);
            label78: while (arg2 >= 0) {
                if (arg2 != 1) {
                    var8 = arg2;
                    for (int var10 = 0; var10 < field5993.length; var10++) {
                        if (arg1.CheckDeviceType(arg3, arg0, var9.Format, field5993[var10], true) == 0 && arg1.CheckDeviceFormat(arg3, arg0, var9.Format, 1, 1, field5993[var10]) == 0 && (arg2 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg0, field5993[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field5978.length; var11++) {
                                if (arg1.CheckDeviceFormat(arg3, arg0, var9.Format, 2, 1, field5978[var11]) == 0 && arg1.CheckDepthStencilMatch(arg3, arg0, var9.Format, field5993[var10], field5978[var11]) == 0 && (arg2 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg0, field5978[var10], true, var8) == 0)) {
                                    var7 = field5993[var10];
                                    var6 = field5978[var11];
                                    break label78;
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
            arg4.BackBufferFormat = var7;
            arg4.MultiSampleQuality = 0;
            arg4.MultiSampleType = var8;
            arg4.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lhaa;I)V")
    public final void method2521(class71 arg0, int arg1) {
        this.method2518((byte) 119, arg0);
        if (this.field5971[this.field4259] != arg0.field755) {
            this.field5990.SetSamplerState(this.field4259, 1, arg0.field755 ? 1 : 3);
            this.field5971[this.field4259] = arg0.field755;
        }
        if (arg1 != 22) {
            this.field5988 = null;
        }
        if (arg0.field753 != this.field5981[this.field4259]) {
            this.field5990.SetSamplerState(this.field4259, 2, arg0.field753 ? 1 : 3);
            this.field5981[this.field4259] = arg0.field753;
        }
    }

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "(Z)V")
    public final void method1543(boolean arg0) {
        for (int var2 = 0; var2 < this.field4302; var2++) {
            this.field5990.SetSamplerState(var2, 7, 0);
            this.field5990.SetSamplerState(var2, 6, 2);
            this.field5990.SetSamplerState(var2, 5, 2);
            this.field5990.SetSamplerState(var2, 1, 1);
            this.field5990.SetSamplerState(var2, 2, 1);
            this.field5976[var2] = class450.field6724;
            this.field5971[var2] = this.field5981[var2] = true;
            this.field5972[var2] = false;
            this.field5980[var2] = 0;
        }
        this.field5990.SetTextureStageState(0, 6, 1);
        this.field5990.SetRenderState(9, 2);
        this.field5990.SetRenderState(23, 4);
        this.field5990.SetRenderState(25, 5);
        this.field5990.SetRenderState(24, 0);
        this.field5990.SetRenderState(22, 2);
        this.field5990.SetRenderState(147, 1);
        this.field5990.SetRenderState(145, 1);
        this.field5990.method2619(38, 0.95F);
        this.field5990.SetRenderState(140, 3);
        this.field5979.SetType(3);
        this.field5997.SetType(3);
        this.field5995.SetType(1);
        this.field5982 = arg0;
        super.method1543(false);
    }

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "()V")
    public final void method350() {
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZIZLkm;Z)V")
    public final void method1521(boolean arg0, int arg1, boolean arg2, class299 arg3, boolean arg4) {
        byte var7;
        if (arg1 == 1) {
            var7 = 3;
        } else if (arg1 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg0) {
            var8 |= 0x20;
        }
        if (arg4) {
            var8 |= 0x10;
        }
        this.field5990.SetTextureStageState(this.field4259, var7, method2514((byte) -104, arg3) | var8);
        if (arg2) {
            this.field5979 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "()V")
    public final void method338() throws class27 {
        this.field5990.EndScene();
        if (this.field5992.method1250((byte) -87)) {
            this.field5977 = 0;
            if (class416.method2640(this.field5992.method1251(0, -2691), -2005530517)) {
                this.method2519(2);
            }
        } else if (++this.field5977 <= 50) {
            this.method2519(2);
        } else {
            throw new class27();
        }
        this.field5990.BeginScene();
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIILfea;)V")
    public final void method1561(int arg0, int arg1, int arg2, class123 arg3) {
        this.field5990.DrawPrimitive(method2523(24515, arg3), arg0, arg1);
        if (arg2 != 19382) {
            this.field5997 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(Z)V")
    public final void method1533(boolean arg0) {
        if (!arg0) {
            this.field5990 = null;
        }
        this.field5990.method2622(15, this.field4322);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjl;)V")
    public final void method2522(int arg0, class230 arg1) {
        this.method2518((byte) 119, arg1);
        if (arg0 != -21409) {
            method2520(82, null, 98, 5, null, -4);
        }
        if (!this.field5971[this.field4259]) {
            this.field5990.SetSamplerState(this.field4259, 1, 1);
            this.field5971[this.field4259] = true;
        }
        if (!this.field5981[this.field4259]) {
            this.field5990.SetSamplerState(this.field4259, 2, 1);
            this.field5981[this.field4259] = true;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILkp;IIB[B)Lkc;")
    public final class115 method1557(int arg0, class421 arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        int var7 = 34 % ((-arg4 - 54) / 56);
        return new class230(this, arg1, arg2, arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZI[[IZ)Lwn;")
    public final class627 method1537(boolean arg0, int arg1, int[][] arg2, boolean arg3) {
        return arg3 ? (class627) null : new class25(this, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILfea;)I")
    private static final int method2523(int arg0, class123 arg1) {
        if (class624.field9010 == arg1) {
            return 2;
        } else if (class174.field2133 == arg1) {
            return 3;
        } else if (class411.field6253 == arg1) {
            return 1;
        } else if (class256.field3658 == arg1) {
            return 4;
        } else if (class451.field6730 == arg1) {
            return 6;
        } else if (class643.field9259 == arg1) {
            return 5;
        } else if (arg0 == 24515) {
            throw new IllegalArgumentException("");
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "(B)V")
    public final void method1515(byte arg0) {
        int var2 = this.field5989[this.field4259] ? method2524(this.field4278[this.field4259], 15) : 1;
        this.field5990.SetTextureStageState(this.field4259, 4, var2);
        if (arg0 != 55) {
            this.method1562(-61, null);
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "()V")
    public final void method379() {
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lua;I)I")
    private static final int method2524(class581 arg0, int arg1) {
        if (class274.field3839 == arg0) {
            return 2;
        } else if (class457.field6837 == arg0) {
            return 4;
        } else if (class310.field4559 == arg0) {
            return 26;
        } else if (class107.field1276 == arg0) {
            return 7;
        } else if (class543.field7773 == arg0) {
            return 10;
        } else {
            if (arg1 != 15) {
                field5978 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZIII[II)Lica;")
    public final class579 method1549(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        if (arg0 != 10) {
            this.field5992 = null;
        }
        return new class71(this, arg6, arg3, arg1, arg5, arg2, arg4);
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "(B)V")
    public final void method1525(byte arg0) {
        int var2 = 34 % ((35 - arg0) / 62);
        if (this.field4281[this.field4259] == class14.field118) {
            this.field5990.SetTextureStageState(this.field4259, 24, 0);
            this.field5980[this.field4259] = 0;
            return;
        }
        if (this.field4281[this.field4259] == class199.field2683) {
            this.field5990.SetTransform(this.field4259 + 16, this.field4295[this.field4259].method3691(15, field5974));
        } else {
            this.field5990.SetTransform(this.field4259 + 16, this.field4295[this.field4259].method3698(12, field5974));
        }
        int var3 = method2517(24915, this.field4281[this.field4259]);
        if (this.field5980[this.field4259] != var3) {
            this.field5990.SetTextureStageState(this.field4259, 24, var3);
            this.field5980[this.field4259] = var3;
        }
    }
}
