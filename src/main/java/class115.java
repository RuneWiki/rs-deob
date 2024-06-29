import jaclib.peer.class703;
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
import jagdx.class510;
import jagdx.class511;
import jagdx.class512;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class115 extends class626 {

    @OriginalMember(owner = "client!rja", name = "Tg", descriptor = "I")
    private int field1573 = 0;

    @OriginalMember(owner = "client!rja", name = "bh", descriptor = "Z")
    private boolean field1581 = false;

    @OriginalMember(owner = "client!rja", name = "Rg", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!rja", name = "Lg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field1565;

    @OriginalMember(owner = "client!rja", name = "Ng", descriptor = "Ljaclib/peer/ge;")
    public class703 field1567;

    @OriginalMember(owner = "client!rja", name = "Sg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field1572;

    @OriginalMember(owner = "client!rja", name = "Hg", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!rja", name = "Mg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field1566;

    @OriginalMember(owner = "client!rja", name = "Og", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field1568;

    @OriginalMember(owner = "client!rja", name = "Pg", descriptor = "Lsg;")
    private class420 field1569;

    @OriginalMember(owner = "client!rja", name = "Fg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field1559;

    @OriginalMember(owner = "client!rja", name = "Wg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field1576;

    @OriginalMember(owner = "client!rja", name = "Dg", descriptor = "Ljagdx/D3DLIGHT;")
    private class512 field1557;

    @OriginalMember(owner = "client!rja", name = "Kg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field1564;

    @OriginalMember(owner = "client!rja", name = "Qg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field1570;

    @OriginalMember(owner = "client!rja", name = "Ig", descriptor = "Z")
    public boolean field1562;

    @OriginalMember(owner = "client!rja", name = "Vg", descriptor = "Z")
    public boolean field1575;

    @OriginalMember(owner = "client!rja", name = "Zg", descriptor = "Z")
    public boolean field1579;

    @OriginalMember(owner = "client!rja", name = "Eg", descriptor = "[I")
    private int[] field1558;

    @OriginalMember(owner = "client!rja", name = "Xg", descriptor = "[Z")
    private boolean[] field1577;

    @OriginalMember(owner = "client!rja", name = "dh", descriptor = "[Z")
    private boolean[] field1583;

    @OriginalMember(owner = "client!rja", name = "Jg", descriptor = "[Z")
    private boolean[] field1563;

    @OriginalMember(owner = "client!rja", name = "Ug", descriptor = "[Lwga;")
    private class779[] field1574;

    @OriginalMember(owner = "client!rja", name = "eh", descriptor = "[Z")
    private boolean[] field1584;

    @OriginalMember(owner = "client!rja", name = "ah", descriptor = "[F")
    private static float[] field1580 = new float[16];

    @OriginalMember(owner = "client!rja", name = "ch", descriptor = "[I")
    private static int[] field1582 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!rja", name = "Yg", descriptor = "[I")
    private static int[] field1578 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!rja", name = "Gg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1560;

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "(Z)V")
    public final void method853(boolean arg0) {
        int var2;
        for (var2 = 0; var2 < this.field8739; var2++) {
            class540 var3 = this.field8723[var2];
            int var4 = var2 + 2;
            int var5 = var3.method3080((byte) -127);
            float var6 = var3.method3083((byte) -41) / 255.0F;
            this.field1557.SetPosition((float) var3.method3085(24859), (float) var3.method3082(-82), (float) var3.method3084((byte) -16));
            this.field1557.SetDiffuse((float) ((var5 & 0xFF2323) >> 16) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field1557.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method3081(7036) * var3.method3081(7036)));
            this.field1557.SetRange((float) var3.method3081(7036));
            this.field1565.SetLight(var4, this.field1557);
            this.field1565.LightEnable(var4, true);
        }
        while (var2 < this.field8703) {
            this.field1565.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method853(arg0);
    }

    @OriginalMember(owner = "client!rja", name = "F", descriptor = "(II)V")
    public final void method492(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILwga;)I")
    private static final int method854(int arg0, class779 arg1) {
        int var2 = 124 / ((81 - arg0) / 45);
        if (class503.field6966 == arg1) {
            return 2;
        } else if (class179.field2385 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rja", name = "na", descriptor = "(IIII)[I")
    public final int[] method521(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field1565.method2967(0);
        IDirect3DSurface var7 = this.field1565.method2971(arg2, arg3, 21, 0, 0, true);
        if (class510.method2954(0, this.field1565.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class510.method2954(0, var7.LockRect(0, 0, arg2, arg3, 16, this.field1564))) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field1564.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field1564.method2983(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field1564.method2983(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3936((byte) -70);
        var7.method3936((byte) -70);
        return var5;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lwt;IIB)V")
    public final void method855(class330 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > 38) {
            this.field1565.DrawPrimitive(method881(arg0, 6), arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!rja", name = "v", descriptor = "(I)V")
    public final void method856(int arg0) {
        if (this.field8743.method673(49)) {
            this.field8640.method4203(field1580, (byte) -79);
        } else {
            field1580[10] = 1.0F;
            field1580[14] = 0.0F;
            field1580[12] = 0.0F;
            field1580[13] = 0.0F;
            field1580[0] = 1.0F;
            field1580[15] = 1.0F;
            field1580[2] = 0.0F;
            field1580[4] = 0.0F;
            field1580[1] = 0.0F;
            field1580[3] = 0.0F;
            field1580[6] = 0.0F;
            field1580[7] = 0.0F;
            field1580[11] = 0.0F;
            field1580[5] = 1.0F;
            field1580[9] = 0.0F;
            field1580[8] = 0.0F;
        }
        this.field1565.SetTransform(2, field1580);
        if (arg0 != 24) {
            this.field1581 = false;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I[IIIZII)Lec;")
    public final class248 method857(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 != 9567) {
            this.field1560 = null;
        }
        return new class439(this, arg2, arg5, arg4, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lbfa;Ltq;)Lvv;")
    public final class345 method566(class390 arg0, class656 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!rja", name = "ya", descriptor = "()V")
    public final void method483() {
        this.method3500((byte) 126, true);
        this.field1565.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I[FLsw;IIIIZ)Lec;")
    public final class248 method858(int arg0, float[] arg1, class787 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg6 != 0) {
            this.field1573 = 11;
        }
        return null;
    }

    @OriginalMember(owner = "client!rja", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Laj;Ljava/lang/Integer;)Lha;")
    public static final class65 createToolkit(Canvas arg0, class161 arg1, class333 arg2, Integer arg3) {
        class115 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class703 var7 = new class703();
            IDirect3D var8 = IDirect3D.method2956(-2147483616, var7);
            D3DCAPS var9 = var8.method2960(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method886(var10, var6, (byte) -84, var8, var5, arg3)) {
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
                    var13 = var8.method2958(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class511 var17) {
                    var13 = var8.method2958(var5, var6, arg0, var11 | 0x20, var10);
                }
                class420 var15 = new class420(var13.method2976(0), var13.method2969());
                var4 = new class115(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3453(0);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method465();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!rja", name = "C", descriptor = "(I)F")
    public final float method859(int arg0) {
        int var2 = 19 % ((-arg0 - 7) / 56);
        return -0.5F;
    }

    @OriginalMember(owner = "client!rja", name = "U", descriptor = "(I)V")
    public final void method860(int arg0) {
        if (arg0 == 13608) {
            int var2 = this.field1583[this.field8662] ? method867(-1, this.field8730[this.field8662]) : 1;
            this.field1565.SetTextureStageState(this.field8662, 1, var2);
        }
    }

    @OriginalMember(owner = "client!rja", name = "o", descriptor = "(I)V")
    public final void method861(int arg0) {
        if (arg0 != 0 || this.field1581) {
            return;
        }
        this.field1565.LightEnable(0, false);
        this.field1565.LightEnable(1, false);
        this.field1565.SetLight(0, this.field1559);
        this.field1565.SetLight(1, this.field1576);
        this.field1565.LightEnable(0, true);
        this.field1565.LightEnable(1, true);
        this.field1581 = true;
    }

    @OriginalMember(owner = "client!rja", name = "p", descriptor = "()V")
    public final void method511() {
    }

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "(B)V")
    public final void method862(byte arg0) {
        this.field8656 = (this.field8659 - this.field8714);
        this.field8655 = (float) (-this.field8721) + this.field8656;
        if (this.field8655 < (float) this.field8691) {
            this.field8655 = this.field8691;
        }
        if (arg0 == 58) {
            this.field1565.method2966(36, this.field8655);
            this.field1565.method2966(37, this.field8656);
            this.field1565.SetRenderState(34, this.field8651);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lsw;ILig;)Z")
    public final boolean method863(class787 arg0, int arg1, class258 arg2) {
        if (arg1 != -2) {
            this.field1574 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class510.method2954(0, this.field1572.method2959(this.field1561, var4)) && class510.method2954(arg1 + 2, this.field1572.CheckDeviceFormat(this.field1561, this.field1571, var4.Format, 0, 3, method884(arg0, arg2, (byte) 19)));
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IILoh;IIZLwt;)V")
    public final void method864(int arg0, int arg1, class427 arg2, int arg3, int arg4, boolean arg5, class330 arg6) {
        this.field1565.SetIndices(((class726) arg2).field10104);
        if (!arg5) {
            this.method541(true);
        }
        this.field1565.DrawIndexedPrimitive(method881(arg6, 6), 0, arg3, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILjagdx/IDirect3DVertexShader;)V")
    public final void method865(int arg0, IDirect3DVertexShader arg1) {
        this.field1560 = arg1;
        this.field1565.SetVertexShader(arg1);
        this.method872((byte) -73);
        if (arg0 != -1) {
            this.field1583 = null;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLjagdx/IDirect3DPixelShader;)V")
    public final void method866(byte arg0, IDirect3DPixelShader arg1) {
        this.field1565.SetPixelShader(arg1);
        if (arg0 >= -112) {
            this.method512(4.2133603F, 0.21701407F, -1.4197202F);
        }
    }

    @OriginalMember(owner = "client!rja", name = "o", descriptor = "()V")
    public final void method503() {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILln;)I")
    private static final int method867(int arg0, class400 arg1) {
        if (class521.field7150 == arg1) {
            return 2;
        } else if (class364.field5299 == arg1) {
            return 4;
        } else if (class412.field5923 == arg1) {
            return 26;
        } else if (class187.field2499 == arg1) {
            return 7;
        } else if (class165.field2224 == arg1) {
            return 10;
        } else if (arg0 == -1) {
            throw new IllegalArgumentException();
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Leo;Z)I")
    private static final int method868(class314 arg0, boolean arg1) {
        if (!arg1) {
            return -41;
        } else if (class10.field165 == arg0) {
            return 1;
        } else if (class413.field5937 == arg0) {
            return 2;
        } else if (class592.field7968 == arg0) {
            return 3;
        } else if (class669.field9409 == arg0) {
            return 4;
        } else if (class226.field3101 == arg0) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "(II)Ltq;")
    public final class656 method536(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(BZI[[I)Lfn;")
    public final class149 method869(byte arg0, boolean arg1, int arg2, int[][] arg3) {
        if (arg0 <= 92) {
            this.field1575 = false;
        }
        return new class547(this, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!rja", name = "y", descriptor = "()Z")
    public final boolean method560() {
        return false;
    }

    @OriginalMember(owner = "client!rja", name = "x", descriptor = "()Lcja;")
    public final class45 method558() {
        D3DADAPTER_IDENTIFIER var1 = this.field1572.method2957(this.field1561, 0);
        return new class45(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILaga;)V")
    public final void method870(int arg0, class696 arg1) {
        int var3 = 0;
        if (class335.field4869 == arg1) {
            var3 = 65536;
        } else if (class202.field2675 == arg1) {
            var3 = 131072;
        } else if (class451.field6282 == arg1) {
            var3 = 196608;
        }
        this.field1565.SetTextureStageState(this.field8662, 11, this.field8662 | var3);
        if (arg0 < 40) {
            this.method907(false, true, (byte) 15, -26, null);
        }
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(II)V")
    public final void method504(int arg0, int arg1) throws class566 {
        this.field1565.EndScene();
        if (this.field1569.method2590(-29727)) {
            this.field1573 = 0;
            if (class510.method2955(this.field1569.method2593(-43, 0), (byte) -100)) {
                this.method888(64);
            }
        } else if (++this.field1573 <= 50) {
            this.method888(64);
        } else {
            throw new class566();
        }
        this.field1565.BeginScene();
    }

    @OriginalMember(owner = "client!rja", name = "u", descriptor = "(I)V")
    public final void method871(int arg0) {
        if (arg0 != -2) {
            this.field1559 = null;
        }
        this.field1565.SetScissorRect(this.field8733 + this.field8652, this.field8722 + this.field8671, this.field8677, this.field8715);
    }

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "(B)V")
    public final void method872(byte arg0) {
        if (this.field1560 == null && this.field8686[this.field8662] != class57.field799) {
            if (this.field8686[this.field8662] == class413.field5937) {
                this.field1565.SetTransform(this.field8662 + 16, this.field8653[this.field8662].method4188(field1580, -12847));
            } else {
                this.field1565.SetTransform(this.field8662 + 16, this.field8653[this.field8662].method4203(field1580, (byte) -94));
            }
            int var2 = method868(this.field8686[this.field8662], true);
            if (this.field1558[this.field8662] != var2) {
                this.field1565.SetTextureStageState(this.field8662, 24, var2);
                this.field1558[this.field8662] = var2;
            }
        } else {
            this.field1565.SetTextureStageState(this.field8662, 24, 0);
            this.field1558[this.field8662] = 0;
        }
        int var3 = -15 / ((49 - arg0) / 63);
    }

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "(II)Lbfa;")
    public final class390 method528(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!rja", name = "A", descriptor = "()V")
    public final void method568() {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ZLsw;II[BIII)Lec;")
    public final class248 method873(boolean arg0, class787 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        return arg5 == 8 ? new class439(this, arg1, arg6, arg2, arg0, arg4, arg3, arg7) : (class248) null;
    }

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "(Z)V")
    public final void method874(boolean arg0) {
        if (arg0) {
            this.field1583 = null;
        }
        this.field1565.method2978(137, this.field8731 && !this.field8726);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method875(byte arg0, Canvas arg1) {
        return arg0 <= 61 ? (Object) null : null;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILss;)I")
    private static final int method876(int arg0, class457 arg1) {
        if (class122.field1782 == arg1) {
            return 2;
        } else if (class461.field6387 == arg1) {
            return 0;
        } else if (class386.field5627 == arg1) {
            return 1;
        } else if (class109.field1493 == arg1) {
            return 3;
        } else {
            if (arg0 != 0) {
                method881(null, 92);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(IIIID)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lvu;I)V")
    public final void method877(class358 arg0, int arg1) {
        this.field1565.SetTexture(this.field8662, arg0.method2252(15901));
        if (this.field1574[this.field8662] != arg0.field5240) {
            int var3 = method854(arg1 - 109, arg0.field5240);
            this.field1565.SetSamplerState(this.field8662, 6, var3);
            this.field1565.SetSamplerState(this.field8662, 5, var3);
            this.field1574[this.field8662] = arg0.field5240;
            if (this.field1563[this.field8662] != arg0.field5239) {
                this.field1565.SetSamplerState(this.field8662, 7, arg0.field5239 ? method854(-30, arg0.field5240) : 0);
                this.field1563[this.field8662] = arg0.field5239;
            }
        } else if (arg0.field5239 != this.field1563[this.field8662]) {
            this.field1565.SetSamplerState(this.field8662, 7, arg0.field5239 ? method854(-49, arg0.field5240) : 0);
            this.field1563[this.field8662] = arg0.field5239;
        }
        if (!this.field1583[this.field8662]) {
            this.field1583[this.field8662] = true;
            this.method894(arg1);
            this.method860(13608);
        }
        if (arg1 != 7) {
            this.field1557 = null;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method878(int arg0, Canvas arg1, Object arg2) {
        if (arg0 < 92) {
            this.method903((byte) 22);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!rja", name = "L", descriptor = "(I)V")
    public final void method879(int arg0) {
        this.field1559.SetDirection(-this.field8700[0], -this.field8700[1], -this.field8700[2]);
        this.field1576.SetDirection(-this.field8693[0], -this.field8693[1], -this.field8693[2]);
        this.field1581 = false;
        if (arg0 >= -75) {
            this.method860(-86);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lnn;I)V")
    public final void method880(class439 arg0, int arg1) {
        if (arg1 <= 26) {
            this.method490();
        }
        this.method877(arg0, 7);
        if (arg0.field6174 != this.field1584[this.field8662]) {
            this.field1565.SetSamplerState(this.field8662, 1, arg0.field6174 ? 1 : 3);
            this.field1584[this.field8662] = arg0.field6174;
        }
        if (arg0.field6173 != this.field1577[this.field8662]) {
            this.field1565.SetSamplerState(this.field8662, 2, arg0.field6173 ? 1 : 3);
            this.field1577[this.field8662] = arg0.field6173;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lwt;I)I")
    private static final int method881(class330 arg0, int arg1) {
        if (class771.field10604 == arg0) {
            return 2;
        } else if (class458.field6352 == arg0) {
            return 3;
        } else if (class224.field3064 == arg0) {
            return 1;
        } else if (class235.field3174 == arg0) {
            return 4;
        } else if (class432.field6127 == arg0) {
            return 6;
        } else if (class537.field7308 == arg0) {
            return 5;
        } else {
            if (arg1 != 6) {
                field1582 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rja", name = "n", descriptor = "(B)V")
    public final void method882(byte arg0) {
        if (class647.field8982 == this.field8649) {
            this.field1565.SetRenderState(19, 5);
            this.field1565.SetRenderState(20, 6);
        } else if (class94.field1341 == this.field8649) {
            this.field1565.SetRenderState(19, 2);
            this.field1565.SetRenderState(20, 2);
        } else if (class705.field9871 == this.field8649) {
            this.field1565.SetRenderState(19, 9);
            this.field1565.SetRenderState(20, 2);
        }
        int var2 = 52 % ((arg0 + 18) / 37);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lid;II)V")
    public final void method883(class612 arg0, int arg1, int arg2) {
        class459 var4 = (class459) arg0;
        this.field1565.SetStreamSource(arg1, var4.field6359, 0, var4.method2715(-84));
        int var5 = -46 / ((arg2 + 35) / 38);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lsw;Lig;B)I")
    public static final int method884(class787 arg0, class258 arg1, byte arg2) {
        if (class258.field3847 == arg1) {
            if (class742.field10243 == arg0) {
                return 22;
            }
            if (class305.field4404 == arg0) {
                return 21;
            }
            if (class250.field3704 == arg0) {
                return 28;
            }
            if (class170.field2268 == arg0) {
                return 50;
            }
            if (class125.field1891 == arg0) {
                return 51;
            }
            if (class166.field2239 == arg0) {
                return 77;
            }
        }
        if (arg2 != 19) {
            field1578 = null;
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!rja", name = "r", descriptor = "(B)V")
    public final void method885(byte arg0) {
        if (arg0 == -30) {
            this.field1565.SetViewport(this.field8733, this.field8722, this.field8553, this.field8593, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;IBLjagdx/IDirect3D;II)Z")
    private static final boolean method886(D3DPRESENT_PARAMETERS arg0, int arg1, byte arg2, IDirect3D arg3, int arg4, int arg5) {
        if (arg2 != -84) {
            field1580 = null;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class510.method2955(arg3.method2959(arg4, var9), (byte) -100)) {
                return false;
            }
            label81: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field1578.length; var10++) {
                        if (arg3.CheckDeviceType(arg4, arg1, var9.Format, field1578[var10], true) == 0 && arg3.CheckDeviceFormat(arg4, arg1, var9.Format, 1, 1, field1578[var10]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, field1578[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field1582.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg4, arg1, var9.Format, 2, 1, field1582[var11]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg1, var9.Format, field1578[var10], field1582[var11]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, field1582[var10], true, var8) == 0)) {
                                    var7 = field1578[var10];
                                    var6 = field1582[var11];
                                    break label81;
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
            arg0.MultiSampleQuality = 0;
            arg0.BackBufferFormat = var7;
            arg0.MultiSampleType = var8;
            arg0.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!rja", name = "z", descriptor = "(I)V")
    public final void method887(int arg0) {
        this.field1565.method2978(174, this.field8767);
        int var2 = -36 % ((arg0 + 54) / 38);
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(Z)V")
    public final void method541(boolean arg0) {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method487(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        this.method504(arg2, arg3);
    }

    @OriginalMember(owner = "client!rja", name = "I", descriptor = "()I")
    public final int method490() {
        return 0;
    }

    @OriginalMember(owner = "client!rja", name = "ib", descriptor = "(I)Z")
    private final boolean method888(int arg0) {
        if (arg0 != 64) {
            return false;
        }
        int var2 = this.field1565.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class420 var3 = (class420) this.field8616;
            this.method3465((byte) 54);
            var3.method2592(-32387);
            this.field1568.BackBufferHeight = 0;
            this.field1568.BackBufferWidth = 0;
            if (method886(this.field1568, this.field1571, (byte) -84, this.field1572, this.field1561, this.field8707)) {
                int var4 = this.field1565.Reset(this.field1568);
                if (class510.method2954(0, var4)) {
                    var3.method2591((byte) -128, this.field1565.method2976(0), this.field1565.method2969());
                    this.method3518(arg0 - 191);
                    this.method909(29906);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rja", name = "R", descriptor = "(I)V")
    public final void method889(int arg0) {
        if (arg0 < 94) {
            method881(null, 68);
        }
        this.field1565.SetTransform(3, this.field8697);
    }

    @OriginalMember(owner = "client!rja", name = "P", descriptor = "(I)V")
    public final void method890(int arg0) {
        this.field1559.SetAmbient(this.field8658 * this.field8644, this.field8740 * this.field8644, this.field8687 * this.field8644, 0.0F);
        this.field1581 = false;
        if (arg0 != 1) {
            this.method905(0, -15);
        }
    }

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "()Z")
    public final boolean method461() {
        return false;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method891(Canvas arg0, byte arg1, Object arg2) {
        this.field1569 = (class420) arg2;
        if (arg1 != 109) {
            this.method880(null, 123);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IILig;Lsw;I)Lec;")
    public final class248 method892(int arg0, int arg1, class258 arg2, class787 arg3, int arg4) {
        if (arg4 != 18018) {
            this.method870(53, null);
        }
        return new class439(this, arg3, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "([Lrd;B)Lnc;")
    public final class26 method893(class357[] arg0, byte arg1) {
        int var3 = 8 % ((arg1 + 87) / 37);
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!rja", name = "k", descriptor = "(I)V")
    public final void method894(int arg0) {
        int var2 = this.field1583[this.field8662] ? method867(-1, this.field8694[this.field8662]) : 1;
        if (arg0 == 7) {
            this.field1565.SetTextureStageState(this.field8662, 4, var2);
        }
    }

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "(IZ)V")
    public final void method895(int arg0, boolean arg1) {
        if (arg0 <= -103) {
            this.field1565.method2978(161, arg1);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lsw;III[BI)Loo;")
    public final class654 method896(class787 arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg5 != 0) {
            this.field1583 = null;
        }
        return new class576(this, arg0, arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ge;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lsg;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Laj;I)V")
    private class115(int arg0, int arg1, Canvas arg2, class703 arg3, IDirect3D arg4, IDirect3DDevice arg5, class420 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class161 arg9, class333 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field1571 = arg1;
            this.field1565 = arg5;
            this.field1567 = arg3;
            this.field1572 = arg4;
            this.field1561 = arg0;
            this.field1566 = arg8;
            this.field1568 = arg7;
            this.field1569 = arg6;
            this.field1559 = new class512(this.field1567);
            this.field1576 = new class512(this.field1567);
            this.field1557 = new class512(this.field1567);
            this.field1564 = new PixelBuffer(this.field1567);
            this.field1570 = new GeometryBuffer(this.field1567);
            new GeometryBuffer(this.field1567);
            this.field1562 = (this.field1566.TextureCaps & 0x10000) != 0;
            this.field8668 = (this.field1566.TextureCaps & 0x800) != 0;
            this.field8709 = (this.field1566.TextureCaps & 0x2000) != 0;
            this.field8698 = this.field1566.MaxActiveLights > 0 ? this.field1566.MaxActiveLights : 8;
            this.field1575 = (this.field1566.TextureCaps & 0x4000) != 0;
            this.field8711 = this.field1566.MaxSimultaneousTextures;
            this.field1579 = (this.field1566.TextureCaps & 0x2) == 0;
            this.field8737 = this.field8707 > 0 || this.field1572.CheckDeviceMultiSampleType(this.field1561, this.field1571, this.field1568.BackBufferFormat, true, 2) == 0;
            this.field1558 = new int[this.field8711];
            this.field1577 = new boolean[this.field8711];
            this.field1583 = new boolean[this.field8711];
            this.field1563 = new boolean[this.field8711];
            this.field1574 = new class779[this.field8711];
            this.field1584 = new boolean[this.field8711];
            this.field1565.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method470((byte) 107);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "(I)V")
    public final void method897(int arg0) {
        if (arg0 != 0) {
            this.field1559 = null;
        }
        this.field1565.SetRenderState(60, this.field8704);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method898(byte arg0, Canvas arg1, Object arg2) {
        int var4 = -105 / ((21 - arg0) / 47);
        if (this.field8526 != arg1) {
            return;
        }
        Dimension var5 = arg1.getSize();
        if (var5.width > 0 && var5.height > 0) {
            this.field1565.EndScene();
            this.method888(64);
            this.field1565.BeginScene();
        }
    }

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "(II)Laba;")
    public final class188 method899(int arg0, int arg1) {
        if (arg1 != 2) {
            this.field1559 = null;
        }
        if (arg0 == 3) {
            return new class216(this, this.field8460);
        } else if (arg0 == 4) {
            return new class395(this, this.field8460, this.field8510);
        } else if (arg0 == 8) {
            return new class753(this, this.field8460, this.field8510);
        } else {
            return super.method899(arg0, 2);
        }
    }

    @OriginalMember(owner = "client!rja", name = "fb", descriptor = "(I)V")
    public final void method900(int arg0) {
        if (this.field8633) {
            field1580[8] = 0.0F;
            field1580[12] = 0.0F;
            field1580[0] = 1.0F;
            field1580[7] = 0.0F;
            field1580[5] = 1.0F;
            field1580[3] = 0.0F;
            field1580[6] = 0.0F;
            field1580[2] = 0.0F;
            field1580[4] = 0.0F;
            field1580[1] = 0.0F;
            field1580[9] = 0.0F;
            field1580[11] = 0.0F;
            field1580[14] = 0.0F;
            field1580[13] = 0.0F;
            field1580[15] = 1.0F;
            field1580[10] = 1.0F;
        } else {
            this.field8636.method4203(field1580, (byte) -72);
        }
        this.field1565.SetTransform(256, field1580);
        if (arg0 != 11) {
            this.method918(-68);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Llba;I)V")
    public final void method901(class576 arg0, int arg1) {
        this.method877(arg0, 7);
        if (!this.field1584[this.field8662]) {
            this.field1565.SetSamplerState(this.field8662, 1, 1);
            this.field1584[this.field8662] = true;
        }
        if (!this.field1577[this.field8662]) {
            this.field1565.SetSamplerState(this.field8662, 2, 1);
            this.field1577[this.field8662] = true;
        }
        if (arg1 >= -105) {
            this.field1575 = true;
        }
    }

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "(IZ)Lid;")
    public final class612 method902(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method865(74, null);
        }
        return new class459(this, arg1);
    }

    @OriginalMember(owner = "client!rja", name = "o", descriptor = "(B)V")
    public final void method903(byte arg0) {
        this.field1565.method2978(28, this.field8648 && this.field8670 && this.field8721 >= 0);
        if (arg0 != 82) {
            this.field1572 = null;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(FFF)V")
    public final void method512(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lvv;)V")
    public final void method549(class345 arg0) {
    }

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "()V")
    public final void method465() {
        this.field1567.method3938((byte) 83);
        super.method465();
    }

    @OriginalMember(owner = "client!rja", name = "q", descriptor = "(I)V")
    public final void method904(int arg0) {
        this.field1565.method2978(27, this.field8725);
        if (arg0 != 0) {
            this.method888(106);
        }
    }

    @OriginalMember(owner = "client!rja", name = "GA", descriptor = "(I)V")
    public final void method458(int arg0) {
        this.field1565.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "()V")
    public final void method468() {
        IDirect3DEventQuery var1 = this.field1565.method2961();
        if (class510.method2954(0, var1.Issue())) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3936((byte) -70);
    }

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "(II)V")
    public final void method905(int arg0, int arg1) {
        this.field1565.SetTextureStageState(this.field8662, 11, arg0);
        if (arg1 != 0) {
            this.method899(46, 9);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public final class544 method497(class544 arg0, class544 arg1, float arg2, class544 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "(Z)V")
    public final void method906(boolean arg0) {
        this.field1565.method2978(7, this.field8663);
        if (!arg0) {
            this.field1579 = false;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ZZBILss;)V")
    public final void method907(boolean arg0, boolean arg1, byte arg2, int arg3, class457 arg4) {
        byte var7;
        if (arg3 == 1) {
            var7 = 3;
        } else if (arg3 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg0) {
            var8 |= 0x20;
        }
        if (arg2 == -67) {
            if (arg1) {
                var8 |= 0x10;
            }
            this.field1565.SetTextureStageState(this.field8662, var7, method876(arg2 + 67, arg4) | var8);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IZ)Loh;")
    public final class427 method908(int arg0, boolean arg1) {
        return arg0 == -1 ? new class726(this, class258.field3848, arg1) : (class427) null;
    }

    @OriginalMember(owner = "client!rja", name = "w", descriptor = "(I)V")
    public final void method909(int arg0) {
        for (int var2 = 0; var2 < this.field8711; var2++) {
            this.field1565.SetSamplerState(var2, 7, 0);
            this.field1565.SetSamplerState(var2, 6, 2);
            this.field1565.SetSamplerState(var2, 5, 2);
            this.field1565.SetSamplerState(var2, 1, 1);
            this.field1565.SetSamplerState(var2, 2, 1);
            this.field1574[var2] = class503.field6966;
            this.field1584[var2] = this.field1577[var2] = true;
            this.field1563[var2] = false;
            this.field1558[var2] = 0;
        }
        this.field1565.SetTextureStageState(0, 6, 1);
        this.field1565.SetRenderState(9, 2);
        this.field1565.SetRenderState(23, 4);
        this.field1565.SetRenderState(25, 5);
        this.field1565.SetRenderState(24, 0);
        this.field1565.SetRenderState(22, 2);
        this.field1565.SetRenderState(147, 1);
        this.field1565.SetRenderState(145, 1);
        this.field1565.method2966(38, 0.95F);
        this.field1565.SetRenderState(140, 3);
        if (arg0 != 29906) {
            return;
        }
        this.field1559.SetType(3);
        this.field1576.SetType(3);
        this.field1557.SetType(1);
        this.field1581 = false;
        super.method909(arg0);
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lsw;Lig;Z)Z")
    public final boolean method910(class787 arg0, class258 arg1, boolean arg2) {
        if (!arg2) {
            this.field1577 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class510.method2954(0, this.field1572.method2959(this.field1561, var4)) && class510.method2954(0, this.field1572.CheckDeviceFormat(this.field1561, this.field1571, var4.Format, 0, 4, method884(arg0, arg1, (byte) 19)));
    }

    @OriginalMember(owner = "client!rja", name = "l", descriptor = "(B)V")
    public final void method911(byte arg0) {
        if (arg0 != 123) {
            this.field1560 = null;
        }
    }

    @OriginalMember(owner = "client!rja", name = "q", descriptor = "(B)V")
    public final void method912(byte arg0) {
        if (arg0 > -56) {
            return;
        }
        float var2 = this.field8661 ? this.field8705 : 0.0F;
        float var3 = this.field8661 ? -this.field8673 : 0.0F;
        this.field1559.SetDiffuse(this.field8658 * var2, this.field8740 * var2, this.field8687 * var2, 0.0F);
        this.field1576.SetDiffuse(this.field8658 * var3, this.field8740 * var3, this.field8687 * var3, 0.0F);
        this.field1581 = false;
    }

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "(I)V")
    public final synchronized void method546(int arg0) {
        this.field1567.method3939(true);
        super.method546(arg0);
    }

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "()V")
    public final void method500() {
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lnc;B)V")
    public final void method913(class26 arg0, byte arg1) {
        if (arg1 == -63) {
            dxVertexLayout var3 = (dxVertexLayout) arg0;
            this.field1565.SetVertexDeclaration(var3.field5052);
        }
    }

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "(I)V")
    public final void method914(int arg0) {
        this.method912((byte) -61);
        this.method861(0);
        if (arg0 != 4) {
            this.field1566 = null;
        }
    }

    @OriginalMember(owner = "client!rja", name = "s", descriptor = "(I)V")
    public final void method915(int arg0) {
        if (arg0 >= 121) {
            this.field1565.method2978(15, this.field8667);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lss;ZZI)V")
    public final void method916(class457 arg0, boolean arg1, boolean arg2, int arg3) {
        byte var6;
        if (arg3 == 1) {
            var6 = 6;
        } else if (arg3 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg1) {
            var7 |= 0x10;
        }
        this.field1565.SetTextureStageState(this.field8662, var6, method876(0, arg0) | var7);
        if (!arg2) {
            this.field1581 = false;
        }
    }

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "(B)V")
    public final void method917(byte arg0) {
        if (arg0 > -85) {
            this.method894(-40);
        }
        if (this.field1583[this.field8662]) {
            this.field1583[this.field8662] = false;
            this.field1565.SetTexture(this.field8662, null);
            this.method894(7);
            this.method860(13608);
        }
    }

    @OriginalMember(owner = "client!rja", name = "y", descriptor = "(I)V")
    public final void method918(int arg0) {
        if (arg0 != 0) {
            this.field1581 = true;
        }
        this.field1565.method2978(14, this.field8728 && this.field8657);
    }
}
