import jaclib.peer.class673;
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

@OriginalClass("client!bfa")
public class class370 extends class745 {

    @OriginalMember(owner = "client!bfa", name = "Og", descriptor = "I")
    private int field5257 = 0;

    @OriginalMember(owner = "client!bfa", name = "eh", descriptor = "Z")
    private boolean field5273 = false;

    @OriginalMember(owner = "client!bfa", name = "Rg", descriptor = "Ljaclib/peer/hb;")
    public class673 field5260;

    @OriginalMember(owner = "client!bfa", name = "dh", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field5272;

    @OriginalMember(owner = "client!bfa", name = "kh", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!bfa", name = "Wg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field5265;

    @OriginalMember(owner = "client!bfa", name = "ch", descriptor = "I")
    private int field5271;

    @OriginalMember(owner = "client!bfa", name = "Qg", descriptor = "Lje;")
    private class403 field5259;

    @OriginalMember(owner = "client!bfa", name = "nh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field5282;

    @OriginalMember(owner = "client!bfa", name = "Ug", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field5263;

    @OriginalMember(owner = "client!bfa", name = "Sg", descriptor = "Ljagdx/D3DLIGHT;")
    private class485 field5261;

    @OriginalMember(owner = "client!bfa", name = "Zg", descriptor = "Ljagdx/D3DLIGHT;")
    private class485 field5268;

    @OriginalMember(owner = "client!bfa", name = "lh", descriptor = "Ljagdx/D3DLIGHT;")
    private class485 field5280;

    @OriginalMember(owner = "client!bfa", name = "gh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field5275;

    @OriginalMember(owner = "client!bfa", name = "oh", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field5283;

    @OriginalMember(owner = "client!bfa", name = "bh", descriptor = "Z")
    public boolean field5270;

    @OriginalMember(owner = "client!bfa", name = "Vg", descriptor = "Z")
    public boolean field5264;

    @OriginalMember(owner = "client!bfa", name = "fh", descriptor = "Z")
    public boolean field5274;

    @OriginalMember(owner = "client!bfa", name = "jh", descriptor = "[Z")
    private boolean[] field5278;

    @OriginalMember(owner = "client!bfa", name = "hh", descriptor = "[Z")
    private boolean[] field5276;

    @OriginalMember(owner = "client!bfa", name = "Ng", descriptor = "[Z")
    private boolean[] field5256;

    @OriginalMember(owner = "client!bfa", name = "Yg", descriptor = "[Lria;")
    private class287[] field5267;

    @OriginalMember(owner = "client!bfa", name = "ih", descriptor = "[I")
    private int[] field5277;

    @OriginalMember(owner = "client!bfa", name = "Pg", descriptor = "[Z")
    private boolean[] field5258;

    @OriginalMember(owner = "client!bfa", name = "Tg", descriptor = "[I")
    private static int[] field5262 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!bfa", name = "ah", descriptor = "[F")
    private static float[] field5269 = new float[16];

    @OriginalMember(owner = "client!bfa", name = "mh", descriptor = "[I")
    private static int[] field5281 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!bfa", name = "Xg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5266;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lria;B)I")
    private static final int method2347(class287 arg0, byte arg1) {
        if (class545.field7515 == arg0) {
            return 2;
        } else if (class643.field8843 == arg0) {
            return 1;
        } else {
            if (arg1 <= 57) {
                field5262 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bfa", name = "H", descriptor = "(I)V")
    public final void method2256(int arg0) {
        this.field5261.SetAmbient(this.field10294 * this.field10207, this.field10207 * this.field10201, this.field10282 * this.field10207, (float) arg0);
        this.field5273 = false;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lkf;IBZ)V")
    public final void method2288(class255 arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != 80) {
            return;
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
        if (arg3) {
            var5 |= 0x10;
        }
        this.field5282.SetTextureStageState(this.field10289, var7, method2356(arg0, arg2 - 78) | var5);
    }

    @OriginalMember(owner = "client!bfa", name = "na", descriptor = "(IIII)[I")
    public final int[] method359(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field5282.method2845(0);
        IDirect3DSurface var7 = this.field5282.method2853(arg2, arg3, 21, 0, 0, true);
        if (class483.method2836(this.field5282.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), false) && class483.method2836(var7.LockRect(0, 0, arg2, arg3, 16, this.field5275), false)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field5275.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field5275.method2859(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field5275.method2859(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3799(9275);
        var7.method3799(9275);
        return var5;
    }

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "(Z)V")
    public final void method2291(boolean arg0) {
        if (arg0) {
            this.method2283(-4, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILnp;)V")
    public final void method2289(int arg0, class491 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        this.field5282.SetVertexDeclaration(var3.field4489);
        if (arg0 != 0) {
            this.method2259((byte) -110, 113);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lhj;B)I")
    private static final int method2348(class569 arg0, byte arg1) {
        if (arg1 != -111) {
            method2347(null, (byte) -118);
        }
        if (class198.field2902 == arg0) {
            return 2;
        } else if (class662.field9052 == arg0) {
            return 3;
        } else if (class39.field958 == arg0) {
            return 1;
        } else if (class34.field855 == arg0) {
            return 4;
        } else if (class187.field2805 == arg0) {
            return 6;
        } else if (class146.field2443 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILkt;)V")
    public final void method2349(int arg0, class159 arg1) {
        this.method2351((byte) -56, arg1);
        if (this.field5258[this.field10289] != arg1.field2559) {
            this.field5282.SetSamplerState(this.field10289, 1, arg1.field2559 ? 1 : 3);
            this.field5258[this.field10289] = arg1.field2559;
        }
        if (arg0 == 13700 && this.field5278[this.field10289] != arg1.field2560) {
            this.field5282.SetSamplerState(this.field10289, 2, arg1.field2560 ? 1 : 3);
            this.field5278[this.field10289] = arg1.field2560;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "(B)V")
    public final void method2242(byte arg0) {
        this.field5282.method2840(14, this.field10238 && this.field10232);
        if (arg0 != -116) {
            this.method2355(true);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "()V")
    public final void method337() {
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILwq;ZI[B)Lir;")
    public final class26 method2253(int arg0, int arg1, class169 arg2, boolean arg3, int arg4, byte[] arg5) {
        return arg3 ? new class24(this, arg2, arg1, arg4, arg0, arg5) : (class26) null;
    }

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "(B)V")
    public final void method2267(byte arg0) {
        if (arg0 > -30) {
            this.field5259 = null;
        }
        this.field5282.method2840(28, this.field10262 && this.field10237 && this.field10205 >= 0);
    }

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "(B)V")
    public final void method2247(byte arg0) {
        if (this.field10183) {
            field5269[1] = 0.0F;
            field5269[2] = 0.0F;
            field5269[15] = 1.0F;
            field5269[3] = 0.0F;
            field5269[9] = 0.0F;
            field5269[6] = 0.0F;
            field5269[0] = 1.0F;
            field5269[7] = 0.0F;
            field5269[11] = 0.0F;
            field5269[13] = 0.0F;
            field5269[10] = 1.0F;
            field5269[8] = 0.0F;
            field5269[12] = 0.0F;
            field5269[5] = 1.0F;
            field5269[14] = 0.0F;
            field5269[4] = 0.0F;
        } else {
            this.field10188.method754(field5269, 0);
        }
        if (arg0 < -18) {
            this.field5282.SetTransform(256, field5269);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V")
    public final void method2261(byte arg0, boolean arg1) {
        if (arg0 < 34) {
            this.field5270 = false;
        }
        this.field5282.method2840(161, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZZILkf;Z)V")
    public final void method2248(boolean arg0, boolean arg1, int arg2, class255 arg3, boolean arg4) {
        byte var7;
        if (arg2 == 1) {
            var7 = 3;
        } else if (arg2 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        int var8 = 0;
        if (arg0) {
            var8 |= 0x20;
        }
        if (arg1) {
            this.field5272 = null;
        }
        if (arg4) {
            var8 |= 0x10;
        }
        this.field5282.SetTextureStageState(this.field10289, var7, var8 | method2356(arg3, 2));
    }

    @OriginalMember(owner = "client!bfa", name = "x", descriptor = "(I)V")
    public final void method2295(int arg0) {
        this.field5261.SetDirection(-this.field10284[0], -this.field10284[1], -this.field10284[2]);
        this.field5268.SetDirection(-this.field10216[arg0], -this.field10216[1], -this.field10216[2]);
        this.field5273 = false;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Lvm;")
    public final class686 method273(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILsia;)I")
    private static final int method2350(int arg0, class732 arg1) {
        if (class720.field9793 == arg1) {
            return 2;
        } else if (class534.field7355 == arg1) {
            return 4;
        } else if (class295.field4131 == arg1) {
            return 26;
        } else if (class72.field1302 == arg1) {
            return 7;
        } else if (class54.field1103 == arg1) {
            return 10;
        } else {
            if (arg0 <= 16) {
                method2350(-116, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(BI)V")
    public final void method2259(byte arg0, int arg1) {
        if (arg0 != -26) {
            this.field5263 = null;
        }
        this.field5282.SetTextureStageState(this.field10289, 11, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Lin;Ljava/lang/Integer;)Lha;")
    public static final class59 createToolkit(Canvas arg0, class152 arg1, class91 arg2, Integer arg3) {
        class370 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class673 var7 = new class673();
            IDirect3D var8 = IDirect3D.method2833(-2147483616, var7);
            D3DCAPS var9 = var8.method2834(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2359(var10, 0, var5, var8, var6, arg3)) {
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
                    var13 = var8.method2831(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class484 var17) {
                    var13 = var8.method2831(var5, var6, arg0, var11 | 0x20, var10);
                }
                class403 var15 = new class403(var13.method2838(0), var13.method2846());
                var4 = new class370(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method4147((byte) 26);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method251();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public final void method2293(Canvas arg0, int arg1, Object arg2) {
        if (arg1 != 1) {
            this.field5265 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BLcg;)V")
    public final void method2351(byte arg0, class139 arg1) {
        this.field5282.SetTexture(this.field10289, arg1.method375(17723));
        if (arg0 > -53) {
            return;
        }
        if (this.field5267[this.field10289] != arg1.field2310) {
            int var3 = method2347(arg1.field2310, (byte) 82);
            this.field5282.SetSamplerState(this.field10289, 6, var3);
            this.field5282.SetSamplerState(this.field10289, 5, var3);
            this.field5267[this.field10289] = arg1.field2310;
            if (this.field5276[this.field10289] != arg1.field2308) {
                this.field5282.SetSamplerState(this.field10289, 7, arg1.field2308 ? method2347(arg1.field2310, (byte) 68) : 0);
                this.field5276[this.field10289] = arg1.field2308;
            }
        } else if (this.field5276[this.field10289] != arg1.field2308) {
            this.field5282.SetSamplerState(this.field10289, 7, arg1.field2308 ? method2347(arg1.field2310, (byte) 86) : 0);
            this.field5276[this.field10289] = arg1.field2308;
        }
        if (!this.field5256[this.field10289]) {
            this.field5256[this.field10289] = true;
            this.method2252(-123);
            this.method2264(10);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(II)Lhe;")
    public final class372 method353(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(Z)V")
    public final void method2250(boolean arg0) {
        this.field5282.SetTransform(3, this.field10249);
        if (!arg0) {
            method2358(-7, null);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;B)V")
    public final void method2352(IDirect3DVertexShader arg0, byte arg1) {
        if (arg1 == -89) {
            this.field5266 = arg0;
            this.field5282.SetVertexShader(arg0);
            this.method2262(1);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lhj;ILuq;IIII)V")
    public final void method2276(class569 arg0, int arg1, class163 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5282.SetIndices(((class202) arg2).field2922);
        this.field5282.DrawIndexedPrimitive(method2348(arg0, (byte) -111), 0, arg3, arg5, arg4, arg1);
        if (arg6 < 46) {
            this.method2279(true, null, null);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lhe;Lvm;)Lis;")
    public final class503 method319(class372 arg0, class686 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "()V")
    public final void method213() {
    }

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "(I)V")
    public final void method2298(int arg0) {
        if (arg0 != 6259) {
            this.method2266((byte) -77);
        }
        this.field5282.SetScissorRect(this.field10295 + this.field10220, this.field10223 - -this.field10279, this.field10297, this.field10210);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class721 {
        this.method348(arg2, arg3);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZLwq;Lbaa;)Z")
    public final boolean method2279(boolean arg0, class169 arg1, class523 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (!arg0) {
            this.field5258 = null;
        }
        return class483.method2836(this.field5265.method2830(this.field5271, var4), !arg0) && class483.method2836(this.field5265.CheckDeviceFormat(this.field5271, this.field5279, var4.Format, 0, 4, method2353(22, arg2, arg1)), false);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public final void method2246(Object arg0, byte arg1, Canvas arg2) {
        if (arg1 == 99) {
            this.field5259 = (class403) arg0;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "(Z)V")
    public final void method2270(boolean arg0) {
        float var2 = this.field10224 ? this.field10288 : 0.0F;
        float var3 = this.field10224 ? -this.field10300 : 0.0F;
        this.field5261.SetDiffuse(this.field10294 * var2, this.field10201 * var2, this.field10282 * var2, 0.0F);
        if (arg0) {
            this.field5268.SetDiffuse(this.field10294 * var3, this.field10201 * var3, this.field10282 * var3, 0.0F);
            this.field5273 = false;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILbaa;Lwq;)I")
    public static final int method2353(int arg0, class523 arg1, class169 arg2) {
        if (class523.field7249 == arg1) {
            if (class19.field290 == arg2) {
                return 22;
            }
            if (class746.field10332 == arg2) {
                return 21;
            }
            if (class556.field7676 == arg2) {
                return 28;
            }
            if (class459.field6480 == arg2) {
                return 50;
            }
            if (class16.field267 == arg2) {
                return 51;
            }
            if (class726.field9831 == arg2) {
                return 77;
            }
        }
        if (arg0 != 22) {
            field5262 = null;
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "()Z")
    public final boolean method328() {
        return false;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "()V")
    public final void method355() {
        IDirect3DEventQuery var1 = this.field5282.method2837();
        if (class483.method2836(var1.Issue(), false)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3799(9275);
    }

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "(II)V")
    public final void method301(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!bfa", name = "P", descriptor = "(I)V")
    public final void method2294(int arg0) {
        this.field5282.SetRenderState(60, this.field10233);
        if (arg0 > -107) {
            this.field5274 = false;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lwh;Lwh;FLwh;)Lwh;")
    public final class149 method340(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V")
    public final void method325(boolean arg0) {
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)V")
    public final void method2277(byte arg0) {
        int var2 = -115 % ((arg0 + 39) / 62);
        int var3;
        for (var3 = 0; var3 < this.field10265; var3++) {
            class669 var4 = this.field10246[var3];
            int var5 = var3 + 2;
            int var6 = var4.method3755(-1);
            float var7 = var4.method3756(-115) / 255.0F;
            this.field5280.SetPosition((float) var4.method3759(-1), (float) var4.method3757(123), (float) var4.method3752((byte) 115));
            this.field5280.SetDiffuse((float) ((var6 & 0xFF34ED) >> 16) * var7, (float) (var6 >> 8 & 0xFF) * var7, (float) (var6 & 0xFF) * var7, 0.0F);
            this.field5280.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var4.method3758(-1) * var4.method3758(-1)));
            this.field5280.SetRange((float) var4.method3758(-1));
            this.field5282.SetLight(var5, this.field5280);
            this.field5282.LightEnable(var5, true);
        }
        while (this.field10236 > var3) {
            this.field5282.LightEnable(var3 + 2, false);
            var3++;
        }
        super.method2277((byte) 57);
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(B)V")
    public final void method2265(byte arg0) {
        if (this.field5256[this.field10289]) {
            this.field5256[this.field10289] = false;
            this.field5282.SetTexture(this.field10289, null);
            this.method2252(-110);
            this.method2264(10);
        }
        if (arg0 >= -19) {
            this.method2282(null, -78, 86, null, false, 82, 55, -34);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/hb;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lje;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lin;I)V")
    private class370(int arg0, int arg1, Canvas arg2, class673 arg3, IDirect3D arg4, IDirect3DDevice arg5, class403 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class152 arg9, class91 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field5260 = arg3;
            this.field5272 = arg7;
            this.field5279 = arg1;
            this.field5265 = arg4;
            this.field5271 = arg0;
            this.field5259 = arg6;
            this.field5282 = arg5;
            this.field5263 = arg8;
            this.field5261 = new class485(this.field5260);
            this.field5268 = new class485(this.field5260);
            this.field5280 = new class485(this.field5260);
            this.field5275 = new PixelBuffer(this.field5260);
            this.field5283 = new GeometryBuffer(this.field5260);
            new GeometryBuffer(this.field5260);
            this.field10215 = (this.field5263.TextureCaps & 0x800) != 0;
            this.field5270 = (this.field5263.TextureCaps & 0x4000) != 0;
            this.field5264 = (this.field5263.TextureCaps & 0x2) == 0;
            this.field5274 = (this.field5263.TextureCaps & 0x10000) != 0;
            this.field10252 = this.field5263.MaxActiveLights <= 0 ? 8 : this.field5263.MaxActiveLights;
            this.field10273 = (this.field5263.TextureCaps & 0x2000) != 0;
            this.field10204 = this.field5263.MaxSimultaneousTextures;
            this.field10296 = this.field10231 > 0 || this.field5265.CheckDeviceMultiSampleType(this.field5271, this.field5279, this.field5272.BackBufferFormat, true, 2) == 0;
            this.field5278 = new boolean[this.field10204];
            this.field5276 = new boolean[this.field10204];
            this.field5256 = new boolean[this.field10204];
            this.field5267 = new class287[this.field10204];
            this.field5277 = new int[this.field10204];
            this.field5258 = new boolean[this.field10204];
            this.field5282.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method614((byte) -39);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "(I)V")
    public final void method2292(int arg0) {
        if (arg0 != 12) {
            this.method319(null, null);
        }
        if (this.field10298.method2676(-32)) {
            this.field10197.method754(field5269, 0);
        } else {
            field5269[1] = 0.0F;
            field5269[7] = 0.0F;
            field5269[12] = 0.0F;
            field5269[0] = 1.0F;
            field5269[5] = 1.0F;
            field5269[13] = 0.0F;
            field5269[2] = 0.0F;
            field5269[11] = 0.0F;
            field5269[9] = 0.0F;
            field5269[10] = 1.0F;
            field5269[14] = 0.0F;
            field5269[8] = 0.0F;
            field5269[4] = 0.0F;
            field5269[15] = 1.0F;
            field5269[6] = 0.0F;
            field5269[3] = 0.0F;
        }
        this.field5282.SetTransform(2, field5269);
    }

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "()V")
    public final void method251() {
        this.field5260.method3800((byte) 13);
        super.method251();
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)Luq;")
    public final class163 method2290(int arg0, boolean arg1) {
        if (arg0 != -28633) {
            this.method2275((byte) 102);
        }
        return new class202(this, class523.field7250, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "GA", descriptor = "(I)V")
    public final void method220(int arg0) {
        this.field5282.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!bfa", name = "I", descriptor = "()I")
    public final int method315() {
        return 0;
    }

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "(I)V")
    public final void method2272(int arg0) {
        this.field10229 = (this.field10268 - this.field10219);
        this.field10287 = (float) (-this.field10205) + this.field10229;
        if (this.field10287 < (float) this.field10209) {
            this.field10287 = this.field10209;
        }
        this.field5282.method2842(36, this.field10287);
        if (arg0 != 25644) {
            this.field5268 = null;
        }
        this.field5282.method2842(37, this.field10229);
        this.field5282.SetRenderState(34, this.field10258);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lwq;II[FZIII)Lwfa;")
    public final class200 method2282(class169 arg0, int arg1, int arg2, float[] arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 2) {
            this.field5268 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "(B)V")
    public final void method2255(byte arg0) {
        if (!this.field5273) {
            this.field5282.LightEnable(0, false);
            this.field5282.LightEnable(1, false);
            this.field5282.SetLight(0, this.field5261);
            this.field5282.SetLight(1, this.field5268);
            this.field5282.LightEnable(0, true);
            this.field5282.LightEnable(1, true);
            this.field5273 = true;
        }
        if (arg0 != 101) {
            this.field5277 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "()Z")
    public final boolean method291() {
        return false;
    }

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "(B)V")
    public final void method2275(byte arg0) {
        if (arg0 != -33) {
            this.method2357(-41, null);
        }
        this.field5282.SetViewport(this.field10295, this.field10223, this.field10045, this.field10076, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILnc;)V")
    public final void method2354(int arg0, class24 arg1) {
        this.method2351((byte) -73, arg1);
        if (!this.field5258[this.field10289]) {
            this.field5282.SetSamplerState(this.field10289, 1, 1);
            this.field5258[this.field10289] = true;
        }
        if (!this.field5278[this.field10289]) {
            this.field5282.SetSamplerState(this.field10289, 2, 1);
            this.field5278[this.field10289] = true;
        }
        int var3 = 82 % ((arg0 - 44) / 56);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILhj;Z)V")
    public final void method2280(int arg0, int arg1, class569 arg2, boolean arg3) {
        this.field5282.DrawPrimitive(method2348(arg2, (byte) -111), arg1, arg0);
        if (!arg3) {
            this.field5267 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(Z)V")
    public final void method2244(boolean arg0) {
        if (!arg0) {
            this.method355();
        }
        this.method2270(arg0);
        this.method2255((byte) 101);
    }

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "()V")
    public final void method252() {
    }

    @OriginalMember(owner = "client!bfa", name = "Q", descriptor = "(I)V")
    public final void method2285(int arg0) {
        if (arg0 == 4) {
            this.field5282.method2840(27, this.field10230);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "(I)V")
    public final void method2287(int arg0) {
        this.field5282.method2840(7, this.field10278);
        if (arg0 != 3) {
            this.method2266((byte) 51);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIII[BLwq;IZ)Lwfa;")
    public final class200 method2258(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class169 arg5, int arg6, boolean arg7) {
        if (arg6 != 32) {
            this.field5257 = 94;
        }
        return new class159(this, arg5, arg2, arg0, arg7, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
    public final synchronized void method233(int arg0) {
        this.field5260.method3803((byte) -82);
        super.method233(arg0);
    }

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "(Z)F")
    public final float method2301(boolean arg0) {
        if (arg0) {
            this.field5273 = true;
        }
        return -0.5F;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method2268(int arg0, Canvas arg1) {
        return arg0 == -1 ? null : (Object) null;
    }

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "(Z)Z")
    private final boolean method2355(boolean arg0) {
        int var2 = this.field5282.TestCooperativeLevel();
        if (arg0) {
            this.method2249(null, null, (byte) -68);
        }
        if (var2 == 0 || var2 == -2005530519) {
            class403 var3 = (class403) this.field10033;
            this.method4143(false);
            var3.method2517((byte) 84);
            this.field5272.BackBufferHeight = 0;
            this.field5272.BackBufferWidth = 0;
            if (method2359(this.field5272, 0, this.field5271, this.field5265, this.field5279, this.field10231)) {
                int var4 = this.field5282.Reset(this.field5272);
                if (class483.method2836(var4, false)) {
                    var3.method2518(this.field5282.method2838(0), (byte) -107, this.field5282.method2846());
                    this.method4127((byte) -42);
                    this.method2266((byte) 113);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "(I)V")
    public final void method2264(int arg0) {
        int var2 = this.field5256[this.field10289] ? method2350(24, this.field10200[this.field10289]) : 1;
        if (arg0 != 10) {
            this.method315();
        }
        this.field5282.SetTextureStageState(this.field10289, 1, var2);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[IZBIII)Lwfa;")
    public final class200 method2284(int arg0, int[] arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = -31 % ((-arg3 - 21) / 46);
        return new class159(this, arg0, arg6, arg2, arg1, arg4, arg5);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lis;)V")
    public final void method302(class503 arg0) {
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([[IZII)Lnj;")
    public final class247 method2281(int[][] arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 <= 1) {
            field5269 = null;
        }
        return new class125(this, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "(B)V")
    public final void method2296(byte arg0) {
        this.field5282.method2840(15, this.field10255);
        if (arg0 != 100) {
            this.field5277 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lkf;I)I")
    private static final int method2356(class255 arg0, int arg1) {
        if (arg1 != 2) {
            field5269 = null;
        }
        if (class755.field10544 == arg0) {
            return 2;
        } else if (class492.field6814 == arg0) {
            return 0;
        } else if (class380.field5528 == arg0) {
            return 1;
        } else if (class4.field31 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[Ljl;)Lnp;")
    public final class491 method2243(int arg0, class273[] arg1) {
        if (arg0 != 0) {
            this.field5279 = 29;
        }
        return new dxVertexLayout(this, arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjagdx/IDirect3DPixelShader;)V")
    public final void method2357(int arg0, IDirect3DPixelShader arg1) {
        if (arg0 != 22927) {
            field5269 = null;
        }
        this.field5282.SetPixelShader(arg1);
    }

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "()V")
    public final void method257() {
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(ZI)Ltc;")
    public final class353 method2300(boolean arg0, int arg1) {
        return arg1 == 16711680 ? new class92(this, arg0) : (class353) null;
    }

    @OriginalMember(owner = "client!bfa", name = "G", descriptor = "(I)V")
    public final void method2274(int arg0) {
        this.field5282.method2840(174, this.field10323);
        if (arg0 != 1) {
            this.method2301(true);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IIIID)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IB)Lfj;")
    public final class657 method2283(int arg0, byte arg1) {
        if (arg1 >= -57) {
            this.field5267 = null;
        }
        if (arg0 == 3) {
            return new class736(this, this.field10153);
        } else if (arg0 == 4) {
            return new class300(this, this.field10153, this.field10051);
        } else if (arg0 == 8) {
            return new class176(this, this.field10153, this.field10051);
        } else {
            return super.method2283(arg0, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(FFF)V")
    public final void method244(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(ILtr;)I")
    private static final int method2358(int arg0, class296 arg1) {
        if (arg0 != 594) {
            return 7;
        } else if (class47.field988 == arg1) {
            return 1;
        } else if (class620.field8440 == arg1) {
            return 2;
        } else if (class556.field7682 == arg1) {
            return 3;
        } else if (class335.field4729 == arg1) {
            return 4;
        } else if (class394.field5784 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lbf;I)V")
    public final void method2260(class536 arg0, int arg1) {
        int var3 = arg1;
        if (class589.field8030 == arg0) {
            var3 = 65536;
        } else if (class599.field8216 == arg0) {
            var3 = 131072;
        } else if (class210.field2988 == arg0) {
            var3 = 196608;
        }
        this.field5282.SetTextureStageState(this.field10289, 11, this.field10289 | var3);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lbaa;Lwq;B)Z")
    public final boolean method2249(class523 arg0, class169 arg1, byte arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        int var5 = 96 / ((arg2 - 85) / 37);
        return class483.method2836(this.field5265.method2830(this.field5271, var4), false) && class483.method2836(this.field5265.CheckDeviceFormat(this.field5271, this.field5279, var4.Format, 0, 3, method2353(22, arg0, arg1)), false);
    }

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "(B)V")
    public final void method2266(byte arg0) {
        for (int var2 = 0; var2 < this.field10204; var2++) {
            this.field5282.SetSamplerState(var2, 7, 0);
            this.field5282.SetSamplerState(var2, 6, 2);
            this.field5282.SetSamplerState(var2, 5, 2);
            this.field5282.SetSamplerState(var2, 1, 1);
            this.field5282.SetSamplerState(var2, 2, 1);
            this.field5267[var2] = class545.field7515;
            this.field5258[var2] = this.field5278[var2] = true;
            this.field5276[var2] = false;
            this.field5277[var2] = 0;
        }
        this.field5282.SetTextureStageState(0, 6, 1);
        this.field5282.SetRenderState(9, 2);
        this.field5282.SetRenderState(23, 4);
        this.field5282.SetRenderState(25, 5);
        if (arg0 <= 45) {
            this.method2297(109, (byte) -95, -59, null, null);
        }
        this.field5282.SetRenderState(24, 0);
        this.field5282.SetRenderState(22, 2);
        this.field5282.SetRenderState(147, 1);
        this.field5282.SetRenderState(145, 1);
        this.field5282.method2842(38, 0.95F);
        this.field5282.SetRenderState(140, 3);
        this.field5261.SetType(3);
        this.field5268.SetType(3);
        this.field5280.SetType(1);
        this.field5273 = false;
        super.method2266((byte) 63);
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "()Lfia;")
    public final class575 method298() {
        D3DADAPTER_IDENTIFIER var1 = this.field5265.method2832(this.field5271, 0);
        return new class575(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!bfa", name = "K", descriptor = "(I)V")
    public final void method2252(int arg0) {
        if (arg0 <= -99) {
            int var2 = this.field5256[this.field10289] ? method2350(50, this.field10206[this.field10289]) : 1;
            this.field5282.SetTextureStageState(this.field10289, 4, var2);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "M", descriptor = "(I)V")
    public final void method2262(int arg0) {
        if (this.field5266 == null && this.field10227[this.field10289] != class161.field2578) {
            if (this.field10227[this.field10289] == class620.field8440) {
                this.field5282.SetTransform(this.field10289 + 16, this.field10245[this.field10289].method766(field5269, arg0 ^ 0x0));
            } else {
                this.field5282.SetTransform(this.field10289 + 16, this.field10245[this.field10289].method754(field5269, arg0 ^ 0x1));
            }
            int var2 = method2358(594, this.field10227[this.field10289]);
            if (this.field5277[this.field10289] != var2) {
                this.field5282.SetTextureStageState(this.field10289, 24, var2);
                this.field5277[this.field10289] = var2;
            }
        } else {
            this.field5282.SetTextureStageState(this.field10289, 24, 0);
            this.field5277[this.field10289] = 0;
        }
        if (arg0 != 1) {
            this.field5273 = true;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IBILbaa;Lwq;)Lwfa;")
    public final class200 method2297(int arg0, byte arg1, int arg2, class523 arg3, class169 arg4) {
        return arg1 == -84 ? new class159(this, arg4, arg3, arg2, arg0) : (class200) null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method2278(int arg0, Canvas arg1, Object arg2) {
        if (this.field10039 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field5282.EndScene();
                this.method2355(false);
                this.field5282.BeginScene();
            }
        }
        if (arg0 != 12727) {
            method2348(null, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;IILjagdx/IDirect3D;II)Z")
    private static final boolean method2359(D3DPRESENT_PARAMETERS arg0, int arg1, int arg2, IDirect3D arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = arg1;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class483.method2835((byte) 97, arg3.method2830(arg2, var9))) {
                return false;
            }
            label82: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field5262.length; var10++) {
                        if (arg3.CheckDeviceType(arg2, arg4, var9.Format, field5262[var10], true) == 0 && arg3.CheckDeviceFormat(arg2, arg4, var9.Format, 1, 1, field5262[var10]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg4, field5262[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field5281.length; var11++) {
                                if (arg3.CheckDeviceFormat(arg2, arg4, var9.Format, 2, 1, field5281[var11]) == 0 && arg3.CheckDepthStencilMatch(arg2, arg4, var9.Format, field5262[var10], field5281[var11]) == 0 && (arg5 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg4, field5281[var10], true, var8) == 0)) {
                                    var6 = field5281[var11];
                                    var7 = field5262[var10];
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
            arg0.MultiSampleType = var8;
            arg0.AutoDepthStencilFormat = var6;
            arg0.MultiSampleQuality = 0;
            arg0.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "(I)V")
    public final void method2273(int arg0) {
        int var2 = 60 % ((arg0 - 20) / 36);
        this.field5282.method2840(137, this.field10259 && !this.field10263);
    }

    @OriginalMember(owner = "client!bfa", name = "S", descriptor = "(I)V")
    public final void method2299(int arg0) {
        if (arg0 != 0) {
            field5281 = null;
        }
        if (class235.field3412 == this.field10277) {
            this.field5282.SetRenderState(19, 5);
            this.field5282.SetRenderState(20, 6);
        } else if (class239.field3494 == this.field10277) {
            this.field5282.SetRenderState(19, 2);
            this.field5282.SetRenderState(20, 2);
        } else if (class418.field6055 == this.field10277) {
            this.field5282.SetRenderState(19, 9);
            this.field5282.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)V")
    public final void method348(int arg0, int arg1) throws class721 {
        this.field5282.EndScene();
        if (this.field5259.method2519(-107)) {
            this.field5257 = 0;
            if (class483.method2835((byte) 97, this.field5259.method2516((byte) 91, 0))) {
                this.method2355(false);
            }
        } else if (++this.field5257 <= 50) {
            this.method2355(false);
        } else {
            throw new class721();
        }
        this.field5282.BeginScene();
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILtc;I)V")
    public final void method2263(int arg0, class353 arg1, int arg2) {
        int var4 = -112 % ((arg0 + 26) / 39);
        class92 var5 = (class92) arg1;
        this.field5282.SetStreamSource(arg2, var5.field1632, 0, var5.method883(3545));
    }

    @OriginalMember(owner = "client!bfa", name = "ya", descriptor = "()V")
    public final void method324() {
        this.method4156(-32, true);
        this.field5282.Clear(2, 0, 1.0F, 0);
    }
}
