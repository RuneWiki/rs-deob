import jaclib.peer.class674;
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
import jagdx.class486;
import jagdx.class487;
import jagdx.class488;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class632 extends class111 {

    @OriginalMember(owner = "client!mh", name = "Tg", descriptor = "Z")
    private boolean field8425 = false;

    @OriginalMember(owner = "client!mh", name = "Jg", descriptor = "I")
    private int field8415 = 0;

    @OriginalMember(owner = "client!mh", name = "Hg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field8413;

    @OriginalMember(owner = "client!mh", name = "Vg", descriptor = "I")
    private int field8427;

    @OriginalMember(owner = "client!mh", name = "Qg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field8422;

    @OriginalMember(owner = "client!mh", name = "ch", descriptor = "Ljia;")
    private class618 field8434;

    @OriginalMember(owner = "client!mh", name = "Og", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field8420;

    @OriginalMember(owner = "client!mh", name = "Gg", descriptor = "Ljaclib/peer/uca;")
    public class674 field8412;

    @OriginalMember(owner = "client!mh", name = "dh", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field8435;

    @OriginalMember(owner = "client!mh", name = "ah", descriptor = "I")
    private int field8432;

    @OriginalMember(owner = "client!mh", name = "Zg", descriptor = "Ljagdx/D3DLIGHT;")
    private class488 field8431;

    @OriginalMember(owner = "client!mh", name = "Pg", descriptor = "Ljagdx/D3DLIGHT;")
    private class488 field8421;

    @OriginalMember(owner = "client!mh", name = "Wg", descriptor = "Ljagdx/D3DLIGHT;")
    private class488 field8428;

    @OriginalMember(owner = "client!mh", name = "Ig", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field8414;

    @OriginalMember(owner = "client!mh", name = "Ng", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field8419;

    @OriginalMember(owner = "client!mh", name = "Mg", descriptor = "Z")
    public boolean field8418;

    @OriginalMember(owner = "client!mh", name = "Rg", descriptor = "Z")
    public boolean field8423;

    @OriginalMember(owner = "client!mh", name = "Yg", descriptor = "Z")
    public boolean field8430;

    @OriginalMember(owner = "client!mh", name = "Xg", descriptor = "[Z")
    private boolean[] field8429;

    @OriginalMember(owner = "client!mh", name = "Lg", descriptor = "[Z")
    private boolean[] field8417;

    @OriginalMember(owner = "client!mh", name = "hh", descriptor = "[I")
    private int[] field8439;

    @OriginalMember(owner = "client!mh", name = "fh", descriptor = "[Z")
    private boolean[] field8437;

    @OriginalMember(owner = "client!mh", name = "Sg", descriptor = "[Lkha;")
    private class584[] field8424;

    @OriginalMember(owner = "client!mh", name = "Kg", descriptor = "[Z")
    private boolean[] field8416;

    @OriginalMember(owner = "client!mh", name = "Ug", descriptor = "[I")
    private static int[] field8426 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!mh", name = "bh", descriptor = "[F")
    private static float[] field8433 = new float[16];

    @OriginalMember(owner = "client!mh", name = "gh", descriptor = "[I")
    private static int[] field8438 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!mh", name = "eh", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8436;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "()V", line = 3)
    public final void method511() {
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIID)V", line = 6)
    public final void method483(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lrh;Law;IIIII)V", line = 11)
    public final void method900(class268 arg0, class76 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8422.SetIndices(((class72) arg0).field891);
        if (arg6 != -229) {
            this.field8431 = null;
        }
        this.field8422.DrawIndexedPrimitive(method3480(arg1, (byte) 54), 0, arg5, arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjagdx/IDirect3DVertexShader;)V", line = 29)
    public final void method3470(byte arg0, IDirect3DVertexShader arg1) {
        this.field8436 = arg1;
        this.field8422.SetVertexShader(arg1);
        if (arg0 != 71) {
            this.method463(null, null);
        }
        this.method876(-126);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(Z)V", line = 41)
    public final void method841(boolean arg0) {
        this.field8422.method2764(27, this.field1770);
        if (!arg0) {
            this.field8421 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(II)V", line = 51)
    public final void method465(int arg0, int arg1) throws class149 {
        this.field8422.EndScene();
        if (this.field8434.method3381(-128)) {
            this.field8415 = 0;
            if (class487.method2768(this.field8434.method3380(0, true), -94)) {
                this.method3474(-11588);
            }
        } else if (++this.field8415 <= 50) {
            this.method3474(-11588);
        } else {
            throw new class149();
        }
        this.field8422.BeginScene();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 76)
    public final void method895(Canvas arg0, byte arg1, Object arg2) {
        if (arg1 <= 33) {
            method3475(null, -41);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILqda;IILns;)Ltr;", line = 85)
    public final class297 method861(int arg0, class105 arg1, int arg2, int arg3, class408 arg4) {
        if (arg2 >= -60) {
            field8426 = null;
        }
        return new class73(this, arg1, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;I)Z", line = 96)
    private static final boolean method3471(int arg0, int arg1, D3DPRESENT_PARAMETERS arg2, int arg3, IDirect3D arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class487.method2768(arg4.method2743(arg5, var9), -115)) {
                return false;
            }
            label85: while (arg0 >= 0) {
                if (arg0 != 1) {
                    var8 = arg0;
                    for (int var10 = 0; var10 < field8426.length; var10++) {
                        if (arg4.CheckDeviceType(arg5, arg1, var9.Format, field8426[var10], true) == 0 && arg4.CheckDeviceFormat(arg5, arg1, var9.Format, 1, 1, field8426[var10]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg1, field8426[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field8438.length; var11++) {
                                if (arg4.CheckDeviceFormat(arg5, arg1, var9.Format, 2, 1, field8438[var11]) == 0 && arg4.CheckDepthStencilMatch(arg5, arg1, var9.Format, field8426[var10], field8438[var11]) == 0 && (arg0 == 0 || arg4.CheckDeviceMultiSampleType(arg5, arg1, field8438[var10], true, var8) == 0)) {
                                    var6 = field8438[var11];
                                    var7 = field8426[var10];
                                    break label85;
                                }
                            }
                        }
                    }
                }
                arg0--;
            }
            if (arg3 <= 14) {
                return false;
            } else if (arg0 < 0 || var7 == 0 || var6 == 0) {
                return false;
            } else {
                arg2.AutoDepthStencilFormat = var6;
                arg2.BackBufferFormat = var7;
                arg2.MultiSampleQuality = 0;
                arg2.MultiSampleType = var8;
                return true;
            }
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)V", line = 200)
    public final void method865(byte arg0) {
        if (arg0 <= 102) {
            this.field8431 = null;
        }
        this.field8422.method2764(137, this.field1824 && !this.field1794);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLcga;)I", line = 211)
    private static final int method3472(byte arg0, class485 arg1) {
        int var2 = 121 % ((arg0 - 56) / 44);
        if (class302.field4290 == arg1) {
            return 1;
        } else if (class91.field1105 == arg1) {
            return 2;
        } else if (class180.field2729 == arg1) {
            return 3;
        } else if (class313.field4474 == arg1) {
            return 4;
        } else if (class232.field3290 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLns;Lqda;)I", line = 239)
    public static final int method3473(byte arg0, class408 arg1, class105 arg2) {
        if (arg0 < 4) {
            field8426 = null;
        }
        if (class408.field5668 == arg1) {
            if (class282.field3991 == arg2) {
                return 22;
            }
            if (class315.field4498 == arg2) {
                return 21;
            }
            if (class155.field2358 == arg2) {
                return 28;
            }
            if (class555.field7297 == arg2) {
                return 50;
            }
            if (class628.field8365 == arg2) {
                return 51;
            }
            if (class427.field5894 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(BI)V", line = 277)
    public final void method915(byte arg0, int arg1) {
        if (arg0 != -109) {
            this.field8413 = null;
        }
        this.field8422.SetTextureStageState(this.field1779, 11, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[BLqda;II)Lop;", line = 288)
    public final class191 method905(int arg0, int arg1, byte[] arg2, class105 arg3, int arg4, int arg5) {
        if (arg0 != 22302) {
            this.method444(null);
        }
        return new class61(this, arg3, arg4, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "()Z", line = 298)
    public final boolean method459() {
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)Lmj;", line = 305)
    public final class655 method417(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "()V", line = 313)
    public final void method431() {
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 321)
    public final void method831(byte arg0) {
        this.field8422.SetTransform(3, this.field1801);
        if (arg0 < 104) {
            this.field8424 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lwu;Ljava/lang/Integer;)Lha;", line = 333)
    public static final class59 createToolkit(Canvas arg0, class152 arg1, class376 arg2, Integer arg3) {
        class632 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class674 var7 = new class674();
            IDirect3D var8 = IDirect3D.method2745(-2147483616, var7);
            D3DCAPS var9 = var8.method2742(var5, var6);
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
            } else if ((var9.DestBlendCaps & var9.SrcBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3471(arg3, var6, var10, 99, var8, var5)) {
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
                    var13 = var8.method2744(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class486 var17) {
                    var13 = var8.method2744(var5, var6, arg0, var11 | 0x20, var10);
                }
                class618 var15 = new class618(var13.method2761(0), var13.method2748());
                var4 = new class632(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method882(false);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method458();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "(Z)V", line = 434)
    public final void method942(boolean arg0) {
        if (!arg0) {
            this.method3482(null, false);
        }
        this.field8422.SetScissorRect(this.field1797 + this.field1780, this.field1822 + this.field1789, this.field1739, this.field1726);
    }

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "(I)F", line = 444)
    public final float method853(int arg0) {
        if (arg0 > -37) {
            this.field8435 = null;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(ZI)V", line = 454)
    public final void method894(boolean arg0, int arg1) {
        if (arg1 >= -115) {
            this.method938(null, null, -91);
        }
        this.field8422.method2764(161, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILqt;ZZ)V", line = 476)
    public final void method911(int arg0, int arg1, class637 arg2, boolean arg3, boolean arg4) {
        byte var7;
        if (arg1 == 1) {
            var7 = 3;
        } else if (arg1 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg4) {
            var8 |= 0x20;
        }
        if (arg0 == -8980) {
            if (arg3) {
                var8 |= 0x10;
            }
            this.field8422.SetTextureStageState(this.field1779, var7, method3479(arg2, 0) | var8);
        }
    }

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "(I)V", line = 514)
    public final void method924(int arg0) {
        int var2 = 46 / ((35 - arg0) / 36);
        this.field8422.method2764(15, this.field1798);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V", line = 523)
    public final void method834(byte arg0) {
        this.method891((byte) -103);
        this.method939((byte) -51);
        int var2 = -69 / ((arg0 - 40) / 63);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILku;)V", line = 536)
    public final void method893(int arg0, class380 arg1) {
        int var3 = 0;
        if (class716.field9864 == arg1) {
            var3 = 65536;
        } else if (class300.field4263 == arg1) {
            var3 = 131072;
        } else if (class536.field7059 == arg1) {
            var3 = 196608;
        }
        this.field8422.SetTextureStageState(this.field1779, 11, var3 | this.field1779);
        if (arg0 < 107) {
            this.method439();
        }
    }

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "()V", line = 559)
    public final void method475() {
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(II)Lul;", line = 562)
    public final class573 method835(int arg0, int arg1) {
        if (arg1 != 6) {
            this.method869(25);
        }
        if (arg0 == 3) {
            return new class652(this, this.field1680);
        } else if (arg0 == 4) {
            return new class406(this, this.field1680, this.field1699);
        } else if (arg0 == 8) {
            return new class158(this, this.field1680, this.field1699);
        } else {
            return super.method835(arg0, 6);
        }
    }

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "(I)Z", line = 606)
    private final boolean method3474(int arg0) {
        int var2 = this.field8422.TestCooperativeLevel();
        if (arg0 != -11588) {
            this.method863(91);
        }
        if (var2 == 0 || var2 == -2005530519) {
            class618 var3 = (class618) this.field1577;
            this.method921(arg0 ^ 0xFFFFD2FA);
            var3.method3382(0);
            this.field8420.BackBufferHeight = 0;
            this.field8420.BackBufferWidth = 0;
            if (method3471(this.field1778, this.field8432, this.field8420, 34, this.field8413, this.field8427)) {
                int var4 = this.field8422.Reset(this.field8420);
                if (class487.method2767(var4, (byte) 100)) {
                    var3.method3379(14721, this.field8422.method2761(0), this.field8422.method2748());
                    this.method948(-46);
                    this.method907(95);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "(I)V", line = 644)
    public final void method926(int arg0) {
        if (arg0 > 91 && this.field8437[this.field1779]) {
            this.field8437[this.field1779] = false;
            this.field8422.SetTexture(this.field1779, null);
            this.method945((byte) 116);
            this.method931(false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 662)
    public final void method901(Object arg0, Canvas arg1, int arg2) {
        int var4 = 40 % ((arg2 - 57) / 58);
        if (this.field1566 != arg1) {
            return;
        }
        Dimension var5 = arg1.getSize();
        if (var5.width > 0 && var5.height > 0) {
            this.field8422.EndScene();
            this.method3474(-11588);
            this.field8422.BeginScene();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZII[BLqda;II)Ltr;", line = 686)
    public final class297 method890(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, class105 arg5, int arg6, int arg7) {
        if (arg7 >= -91) {
            method3481(77, null);
        }
        return new class73(this, arg5, arg2, arg6, arg1, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "(B)V", line = 696)
    public final void method933(byte arg0) {
        if (arg0 != -13) {
            this.method458();
        }
    }

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "(II)V", line = 704)
    public final void method406(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "(B)V", line = 709)
    public final void method945(byte arg0) {
        if (arg0 <= 113) {
            this.field8435 = null;
        }
        int var2 = this.field8437[this.field1779] ? method3481(9406, this.field1820[this.field1779]) : 1;
        this.field8422.SetTextureStageState(this.field1779, 4, var2);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lkha;I)I", line = 720)
    private static final int method3475(class584 arg0, int arg1) {
        if (class475.field6514 == arg0) {
            return 2;
        } else if (class94.field1141 == arg0) {
            return 1;
        } else {
            if (arg1 != 29895) {
                method3471(-10, 57, null, 127, null, -10);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "(I)V", line = 739)
    public final void method833(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field1761; var2++) {
            class87 var3 = this.field1737[var2];
            int var4 = var2 + 2;
            int var5 = var3.method671(false);
            float var6 = var3.method666((byte) 110) / 255.0F;
            this.field8428.SetPosition((float) var3.method665(109), (float) var3.method669(-22096), (float) var3.method670((byte) -119));
            this.field8428.SetDiffuse((float) ((var5 & 0xFF0906) >> 16) * var6, (float) ((var5 & 0xFF88) >> 8) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field8428.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method673(arg0 - 75) * var3.method673(-71)));
            this.field8428.SetRange((float) var3.method673(-70));
            this.field8422.SetLight(var4, this.field8428);
            this.field8422.LightEnable(var4, true);
        }
        while (var2 < this.field1799) {
            this.field8422.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method833(arg0);
    }

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "()I", line = 775)
    public final int method396() {
        return 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;", line = 782)
    public final class241 method429(class241 arg0, class241 arg1, float arg2, class241 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lbd;B)V", line = 790)
    public final void method3476(class61 arg0, byte arg1) {
        if (arg1 >= -66) {
            this.field8432 = 95;
        }
        this.method3482(arg0, false);
        if (!this.field8416[this.field1779]) {
            this.field8422.SetSamplerState(this.field1779, 1, 1);
            this.field8416[this.field1779] = true;
        }
        if (!this.field8417[this.field1779]) {
            this.field8422.SetSamplerState(this.field1779, 2, 1);
            this.field8417[this.field1779] = true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "(Z)V", line = 815)
    public final void method931(boolean arg0) {
        int var2 = this.field8437[this.field1779] ? method3481(9406, this.field1751[this.field1779]) : 1;
        if (arg0) {
            this.method394(-103, -1);
        }
        this.field8422.SetTextureStageState(this.field1779, 1, var2);
    }

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "(I)V", line = 826)
    public final void method863(int arg0) {
        if (arg0 == 26588) {
            this.field8422.SetViewport(this.field1797, this.field1822, this.field1559, this.field1528, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[IIZIII)Ltr;", line = 836)
    public final class297 method850(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -29) {
            this.field8436 = null;
        }
        return new class73(this, arg2, arg5, arg3, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "(B)V", line = 846)
    public final void method909(byte arg0) {
        if (this.field1806.method1217((byte) 0)) {
            this.field1721.method3369((byte) 81, field8433);
        } else {
            field8433[2] = 0.0F;
            field8433[9] = 0.0F;
            field8433[0] = 1.0F;
            field8433[14] = 0.0F;
            field8433[11] = 0.0F;
            field8433[13] = 0.0F;
            field8433[6] = 0.0F;
            field8433[4] = 0.0F;
            field8433[10] = 1.0F;
            field8433[5] = 1.0F;
            field8433[8] = 0.0F;
            field8433[12] = 0.0F;
            field8433[3] = 0.0F;
            field8433[1] = 0.0F;
            field8433[15] = 1.0F;
            field8433[7] = 0.0F;
        }
        this.field8422.SetTransform(2, field8433);
        if (arg0 != 107) {
            this.method890(121, true, -81, -40, null, null, -78, 101);
        }
    }

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "(B)V", line = 883)
    public final void method939(byte arg0) {
        if (arg0 > -15 || this.field8425) {
            return;
        }
        this.field8422.LightEnable(0, false);
        this.field8422.LightEnable(1, false);
        this.field8422.SetLight(0, this.field8431);
        this.field8422.SetLight(1, this.field8421);
        this.field8422.LightEnable(0, true);
        this.field8422.LightEnable(1, true);
        this.field8425 = true;
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "(I)V", line = 907)
    public final synchronized void method501(int arg0) {
        this.field8412.method3752(84);
        super.method501(arg0);
    }

    @OriginalMember(owner = "client!mh", name = "ya", descriptor = "()V", line = 916)
    public final void method454() {
        this.method844((byte) 36, true);
        this.field8422.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!mh", name = "na", descriptor = "(IIII)[I", line = 929)
    public final int[] method473(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field8422.method2762(0);
        IDirect3DSurface var7 = this.field8422.method2759(arg2, arg3, 21, 0, 0, true);
        if (class487.method2767(this.field8422.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), (byte) 124) && class487.method2767(var7.LockRect(0, 0, arg2, arg3, 16, this.field8414), (byte) 115)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field8414.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field8414.method2771(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field8414.method2771(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3757((byte) -113);
        var7.method3757((byte) -80);
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILam;)V", line = 968)
    public final void method825(int arg0, int arg1, class633 arg2) {
        if (arg1 != 8) {
            this.method904(6, true);
        }
        class457 var4 = (class457) arg2;
        this.field8422.SetStreamSource(arg0, var4.field6249, 0, var4.method2602((byte) -65));
    }

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "()Z", line = 979)
    public final boolean method505() {
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V", line = 986)
    public final void method859(byte arg0) {
        this.field8431.SetDirection(-this.field1754[0], -this.field1754[1], -this.field1754[2]);
        if (arg0 == -124) {
            this.field8421.SetDirection(-this.field1767[0], -this.field1767[1], -this.field1767[2]);
            this.field8425 = false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "(I)V", line = 998)
    public final void method876(int arg0) {
        if (this.field8436 == null && this.field1788[this.field1779] != class577.field7568) {
            if (this.field1788[this.field1779] == class91.field1105) {
                this.field8422.SetTransform(this.field1779 + 16, this.field1741[this.field1779].method3370(0, field8433));
            } else {
                this.field8422.SetTransform(this.field1779 + 16, this.field1741[this.field1779].method3369((byte) -53, field8433));
            }
            int var2 = method3472((byte) 125, this.field1788[this.field1779]);
            if (this.field8439[this.field1779] != var2) {
                this.field8422.SetTextureStageState(this.field1779, 24, var2);
                this.field8439[this.field1779] = var2;
            }
        } else {
            this.field8422.SetTextureStageState(this.field1779, 24, 0);
            this.field8439[this.field1779] = 0;
        }
        int var3 = -92 % ((-arg0 - 35) / 49);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIILqt;)V", line = 1033)
    public final void method824(boolean arg0, int arg1, int arg2, class637 arg3) {
        int var5 = arg2;
        byte var7;
        if (arg1 == 1) {
            var7 = 6;
        } else if (arg1 == 2) {
            var7 = 27;
        } else {
            var7 = 5;
        }
        if (arg0) {
            var5 = arg2 | 0x10;
        }
        this.field8422.SetTextureStageState(this.field1779, var7, method3479(arg3, 0) | var5);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(IZ)Lam;", line = 1075)
    public final class633 method904(int arg0, boolean arg1) {
        if (arg0 < 32) {
            this.field8439 = null;
        }
        return new class457(this, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Law;III)V", line = 1085)
    public final void method828(class76 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            this.field8422.DrawPrimitive(method3480(arg0, (byte) 54), arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "(I)V", line = 1102)
    public final void method935(int arg0) {
        this.field1762 = (this.field1736 - this.field1795);
        this.field1743 = (float) (-this.field1730) + this.field1762;
        if (arg0 != 16) {
            method3481(34, null);
        }
        if (this.field1743 < (float) this.field1745) {
            this.field1743 = this.field1745;
        }
        this.field8422.method2747(36, this.field1743);
        this.field8422.method2747(37, this.field1762);
        this.field8422.SetRenderState(34, this.field1786);
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "(B)V", line = 1120)
    public final void method891(byte arg0) {
        if (arg0 > -92) {
            return;
        }
        float var2 = this.field1758 ? this.field1816 : 0.0F;
        float var3 = this.field1758 ? -this.field1821 : 0.0F;
        this.field8431.SetDiffuse(this.field1757 * var2, this.field1796 * var2, this.field1774 * var2, 0.0F);
        this.field8421.SetDiffuse(this.field1757 * var3, this.field1796 * var3, this.field1774 * var3, 0.0F);
        this.field8425 = false;
    }

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "()V", line = 1136)
    public final void method458() {
        this.field8412.method3756(-13759);
        super.method458();
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "()V", line = 1143)
    public final void method439() {
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V", line = 1146)
    public final void method848(byte arg0) {
        this.field8422.SetRenderState(60, this.field1776);
        if (arg0 > -91) {
            this.field8424 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZ)Lrh;", line = 1156)
    public final class268 method818(int arg0, boolean arg1) {
        if (arg0 != -23469) {
            this.field8419 = null;
        }
        return new class72(this, class408.field5669, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "()V", line = 1167)
    public final void method500() {
        IDirect3DEventQuery var1 = this.field8422.method2754();
        if (class487.method2767(var1.Issue(), (byte) 119)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3757((byte) -81);
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(Z)V", line = 1190)
    public final void method854(boolean arg0) {
        this.field8431.SetAmbient(this.field1757 * this.field1742, this.field1796 * this.field1742, this.field1774 * this.field1742, 0.0F);
        this.field8425 = false;
        if (!arg0) {
            this.field8429 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "(Z)V", line = 1202)
    public final void method943(boolean arg0) {
        if (this.field1710) {
            field8433[8] = 0.0F;
            field8433[4] = 0.0F;
            field8433[2] = 0.0F;
            field8433[5] = 1.0F;
            field8433[13] = 0.0F;
            field8433[6] = 0.0F;
            field8433[1] = 0.0F;
            field8433[7] = 0.0F;
            field8433[9] = 0.0F;
            field8433[15] = 1.0F;
            field8433[0] = 1.0F;
            field8433[3] = 0.0F;
            field8433[10] = 1.0F;
            field8433[14] = 0.0F;
            field8433[12] = 0.0F;
            field8433[11] = 0.0F;
        } else {
            this.field1713.method3369((byte) 105, field8433);
        }
        this.field8422.SetTransform(256, field8433);
        if (!arg0) {
            this.field8417 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/uca;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ljia;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lwu;I)V", line = 1255)
    private class632(int arg0, int arg1, Canvas arg2, class674 arg3, IDirect3D arg4, IDirect3DDevice arg5, class618 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class152 arg9, class376 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field8413 = arg4;
            this.field8427 = arg0;
            this.field8422 = arg5;
            this.field8434 = arg6;
            this.field8420 = arg7;
            this.field8412 = arg3;
            this.field8435 = arg8;
            this.field8432 = arg1;
            this.field8431 = new class488(this.field8412);
            this.field8421 = new class488(this.field8412);
            this.field8428 = new class488(this.field8412);
            this.field8414 = new PixelBuffer(this.field8412);
            this.field8419 = new GeometryBuffer(this.field8412);
            new GeometryBuffer(this.field8412);
            this.field1811 = (this.field8435.TextureCaps & 0x800) != 0;
            this.field1805 = (this.field8435.TextureCaps & 0x2000) != 0;
            this.field8418 = (this.field8435.TextureCaps & 0x2) == 0;
            this.field1764 = this.field8435.MaxActiveLights > 0 ? this.field8435.MaxActiveLights : 8;
            this.field8423 = (this.field8435.TextureCaps & 0x10000) != 0;
            this.field8430 = (this.field8435.TextureCaps & 0x4000) != 0;
            this.field1808 = this.field8435.MaxSimultaneousTextures;
            this.field1749 = this.field1778 > 0 || this.field8413.CheckDeviceMultiSampleType(this.field8427, this.field8432, this.field8420.BackBufferFormat, true, 2) == 0;
            this.field8429 = new boolean[this.field1808];
            this.field8417 = new boolean[this.field1808];
            this.field8439 = new int[this.field1808];
            this.field8437 = new boolean[this.field1808];
            this.field8424 = new class584[this.field1808];
            this.field8416 = new boolean[this.field1808];
            this.field8422.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method487(119);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;I)V", line = 1241)
    public final void method3477(IDirect3DPixelShader arg0, int arg1) {
        this.field8422.SetPixelShader(arg0);
        if (arg1 != 23) {
            this.method475();
        }
    }

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "(I)V", line = 1302)
    public final void method920(int arg0) {
        this.field8422.method2764(174, this.field1848);
        int var2 = 56 / ((arg0 + 51) / 62);
    }

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "(I)V", line = 1313)
    public final void method907(int arg0) {
        for (int var2 = 0; var2 < this.field1808; var2++) {
            this.field8422.SetSamplerState(var2, 7, 0);
            this.field8422.SetSamplerState(var2, 6, 2);
            this.field8422.SetSamplerState(var2, 5, 2);
            this.field8422.SetSamplerState(var2, 1, 1);
            this.field8422.SetSamplerState(var2, 2, 1);
            this.field8424[var2] = class475.field6514;
            this.field8416[var2] = this.field8417[var2] = true;
            this.field8429[var2] = false;
            this.field8439[var2] = 0;
        }
        if (arg0 < 77) {
            this.method838(-60, -111, true, null, -66, 16, (byte) -57, null);
        }
        this.field8422.SetTextureStageState(0, 6, 1);
        this.field8422.SetRenderState(9, 2);
        this.field8422.SetRenderState(23, 4);
        this.field8422.SetRenderState(25, 5);
        this.field8422.SetRenderState(24, 0);
        this.field8422.SetRenderState(22, 2);
        this.field8422.SetRenderState(147, 1);
        this.field8422.SetRenderState(145, 1);
        this.field8422.method2747(38, 0.95F);
        this.field8422.SetRenderState(140, 3);
        this.field8431.SetType(3);
        this.field8421.SetType(3);
        this.field8428.SetType(1);
        this.field8425 = false;
        super.method907(110);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Loi;B)V", line = 1352)
    public final void method3478(class73 arg0, byte arg1) {
        this.method3482(arg0, false);
        if (arg1 != 84) {
            this.method3477(null, 32);
        }
        if (this.field8416[this.field1779] != arg0.field898) {
            this.field8422.SetSamplerState(this.field1779, 1, arg0.field898 ? 1 : 3);
            this.field8416[this.field1779] = arg0.field898;
        }
        if (arg0.field896 != this.field8417[this.field1779]) {
            this.field8422.SetSamplerState(this.field1779, 2, arg0.field896 ? 1 : 3);
            this.field8417[this.field1779] = arg0.field896;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFF)V", line = 1374)
    public final void method403(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lnc;)V", line = 1376)
    public final void method444(class23 arg0) {
    }

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "(I)V", line = 1379)
    public final void method869(int arg0) {
        this.field8422.method2764(14, this.field1760 && this.field1791);
        if (arg0 >= -57) {
            this.field8435 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "GA", descriptor = "(I)V", line = 1391)
    public final void method392(int arg0) {
        this.field8422.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILns;Lqda;)Z", line = 1399)
    public final boolean method827(int arg0, class408 arg1, class105 arg2) {
        if (arg0 != -3119) {
            this.field8414 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class487.method2767(this.field8413.method2743(this.field8427, var4), (byte) 100) && class487.method2767(this.field8413.CheckDeviceFormat(this.field8427, this.field8432, var4.Format, 0, 3, method3473((byte) 43, arg1, arg2)), (byte) 96);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()Lkea;", line = 1412)
    public final class240 method397() {
        D3DADAPTER_IDENTIFIER var1 = this.field8413.method2746(this.field8427, 0);
        return new class240(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmj;Lbba;)Lnc;", line = 1420)
    public final class23 method463(class655 arg0, class115 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lqt;I)I", line = 1427)
    private static final int method3479(class637 arg0, int arg1) {
        if (arg1 != 0) {
            method3481(-78, null);
        }
        if (class454.field6199 == arg0) {
            return 2;
        } else if (class92.field1112 == arg0) {
            return 0;
        } else if (class227.field3230 == arg0) {
            return 1;
        } else if (class362.field5101 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V", line = 1452)
    public final void method815(boolean arg0) {
        if (arg0) {
            this.field8422.method2764(28, this.field1781 && this.field1807 && this.field1730 >= 0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 1462)
    public final Object method917(byte arg0, Canvas arg1) {
        if (arg0 != 3) {
            this.field8424 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "(Z)V", line = 1475)
    public final void method932(boolean arg0) {
        if (arg0) {
            this.field8421 = null;
        }
        if (class367.field5142 == this.field1766) {
            this.field8422.SetRenderState(19, 5);
            this.field8422.SetRenderState(20, 6);
        } else if (class35.field514 == this.field1766) {
            this.field8422.SetRenderState(19, 2);
            this.field8422.SetRenderState(20, 2);
        } else if (class451.field6173 == this.field1766) {
            this.field8422.SetRenderState(19, 9);
            this.field8422.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 1503)
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 1507)
    public final void method456(boolean arg0) {
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 1511)
    public final void method822(Canvas arg0, int arg1, Object arg2) {
        if (arg1 != -1) {
            this.field8432 = -126;
        }
        this.field8434 = (class618) arg2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Lbba;", line = 1521)
    public final class115 method394(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lld;B)V", line = 1533)
    public final void method898(class171 arg0, byte arg1) {
        if (arg1 == -15) {
            dxVertexLayout var3 = (dxVertexLayout) arg0;
            this.field8422.SetVertexDeclaration(var3.field4663);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Law;B)I", line = 1545)
    private static final int method3480(class76 arg0, byte arg1) {
        if (class753.field10498 == arg0) {
            return 2;
        } else if (class511.field6786 == arg0) {
            return 3;
        } else if (class712.field9848 == arg0) {
            return 1;
        } else if (class322.field4583 == arg0) {
            return 4;
        } else if (class76.field922 == arg0) {
            return 6;
        } else if (class235.field3312 == arg0) {
            return 5;
        } else if (arg1 == 54) {
            throw new IllegalArgumentException("");
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZLqda;IIB[F)Ltr;", line = 1580)
    public final class297 method838(int arg0, int arg1, boolean arg2, class105 arg3, int arg4, int arg5, byte arg6, float[] arg7) {
        int var9 = -67 % ((arg6 + 41) / 52);
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[Llm;)Lld;", line = 1589)
    public final class171 method899(byte arg0, class502[] arg1) {
        int var3 = -4 / ((arg0 + 66) / 53);
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lns;Lqda;I)Z", line = 1597)
    public final boolean method938(class408 arg0, class105 arg1, int arg2) {
        if (arg2 != 14) {
            field8426 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class487.method2767(this.field8413.method2743(this.field8427, var4), (byte) 105) && class487.method2767(this.field8413.CheckDeviceFormat(this.field8427, this.field8432, var4.Format, 0, 4, method3473((byte) 27, arg0, arg1)), (byte) 124);
    }

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "(I)V", line = 1610)
    public final void method837(int arg0) {
        this.field8422.method2764(7, this.field1783);
        if (arg0 != 5481) {
            this.field8421 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILaea;)I", line = 1621)
    private static final int method3481(int arg0, class50 arg1) {
        if (arg0 != 9406) {
            return 123;
        } else if (class99.field1265 == arg1) {
            return 2;
        } else if (class312.field4469 == arg1) {
            return 4;
        } else if (class314.field4479 == arg1) {
            return 26;
        } else if (class759.field10559 == arg1) {
            return 7;
        } else if (class569.field7475 == arg1) {
            return 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ[[II)Lnp;", line = 1650)
    public final class493 method832(byte arg0, boolean arg1, int[][] arg2, int arg3) {
        if (arg0 >= -97) {
            this.method825(-49, -104, null);
        }
        return new class215(this, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1660)
    public final void method446(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class149 {
        this.method465(arg2, arg3);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lch;Z)V", line = 1668)
    public final void method3482(class467 arg0, boolean arg1) {
        this.field8422.SetTexture(this.field1779, arg0.method535(-100));
        if (this.field8424[this.field1779] != arg0.field6416) {
            int var3 = method3475(arg0.field6416, 29895);
            this.field8422.SetSamplerState(this.field1779, 6, var3);
            this.field8422.SetSamplerState(this.field1779, 5, var3);
            this.field8424[this.field1779] = arg0.field6416;
            if (this.field8429[this.field1779] != arg0.field6417) {
                this.field8422.SetSamplerState(this.field1779, 7, arg0.field6417 ? method3475(arg0.field6416, 29895) : 0);
                this.field8429[this.field1779] = arg0.field6417;
            }
        } else if (this.field8429[this.field1779] != arg0.field6417) {
            this.field8422.SetSamplerState(this.field1779, 7, arg0.field6417 ? method3475(arg0.field6416, 29895) : 0);
            this.field8429[this.field1779] = arg0.field6417;
        }
        if (arg1) {
            this.field8417 = null;
        }
        if (!this.field8437[this.field1779]) {
            this.field8437[this.field1779] = true;
            this.method945((byte) 118);
            this.method931(false);
        }
    }
}
