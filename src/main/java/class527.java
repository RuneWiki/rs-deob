import jaclib.peer.class670;
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
import jagdx.class481;
import jagdx.class482;
import jagdx.class483;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class527 extends class377 {

    @OriginalMember(owner = "client!hl", name = "Gg", descriptor = "I")
    private int field7503 = 0;

    @OriginalMember(owner = "client!hl", name = "ah", descriptor = "Z")
    private boolean field7523 = false;

    @OriginalMember(owner = "client!hl", name = "Zg", descriptor = "I")
    private int field7522;

    @OriginalMember(owner = "client!hl", name = "Eg", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field7501;

    @OriginalMember(owner = "client!hl", name = "fh", descriptor = "Ljaclib/peer/rh;")
    public class670 field7528;

    @OriginalMember(owner = "client!hl", name = "Yg", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field7521;

    @OriginalMember(owner = "client!hl", name = "Vg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field7518;

    @OriginalMember(owner = "client!hl", name = "Tg", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field7516;

    @OriginalMember(owner = "client!hl", name = "Lg", descriptor = "I")
    private int field7508;

    @OriginalMember(owner = "client!hl", name = "Mg", descriptor = "Lkp;")
    private class487 field7509;

    @OriginalMember(owner = "client!hl", name = "bh", descriptor = "Ljagdx/D3DLIGHT;")
    private class483 field7524;

    @OriginalMember(owner = "client!hl", name = "Kg", descriptor = "Ljagdx/D3DLIGHT;")
    private class483 field7507;

    @OriginalMember(owner = "client!hl", name = "Ug", descriptor = "Ljagdx/D3DLIGHT;")
    private class483 field7517;

    @OriginalMember(owner = "client!hl", name = "Rg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field7514;

    @OriginalMember(owner = "client!hl", name = "Ng", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field7510;

    @OriginalMember(owner = "client!hl", name = "Sg", descriptor = "Z")
    public boolean field7515;

    @OriginalMember(owner = "client!hl", name = "ch", descriptor = "Z")
    public boolean field7525;

    @OriginalMember(owner = "client!hl", name = "Hg", descriptor = "Z")
    public boolean field7504;

    @OriginalMember(owner = "client!hl", name = "Fg", descriptor = "[Z")
    private boolean[] field7502;

    @OriginalMember(owner = "client!hl", name = "Qg", descriptor = "[Lqo;")
    private class22[] field7513;

    @OriginalMember(owner = "client!hl", name = "Wg", descriptor = "[Z")
    private boolean[] field7519;

    @OriginalMember(owner = "client!hl", name = "Og", descriptor = "[Z")
    private boolean[] field7511;

    @OriginalMember(owner = "client!hl", name = "Xg", descriptor = "[Z")
    private boolean[] field7520;

    @OriginalMember(owner = "client!hl", name = "Jg", descriptor = "[I")
    private int[] field7506;

    @OriginalMember(owner = "client!hl", name = "Ig", descriptor = "[I")
    private static int[] field7505 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!hl", name = "Pg", descriptor = "[F")
    private static float[] field7512 = new float[16];

    @OriginalMember(owner = "client!hl", name = "eh", descriptor = "[I")
    private static int[] field7527 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!hl", name = "dh", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7526;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)V", line = 4)
    public final void method2198(byte arg0) {
        if (arg0 <= 84) {
            this.method3095(null, (byte) -17);
        }
        if (this.field7519[this.field5075]) {
            this.field7519[this.field5075] = false;
            this.field7501.SetTexture(this.field5075, null);
            this.method2225(-17580);
            this.method2273((byte) 81);
        }
    }

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "(B)V", line = 22)
    public final void method2324(byte arg0) {
        if (arg0 != -53) {
            this.field7521 = null;
        }
        this.field7501.method2898(15, this.field5066);
    }

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "(I)V", line = 32)
    public final void method2280(int arg0) {
        if (arg0 == -10899) {
            this.field7501.method2898(28, this.field5070 && this.field5123 && this.field5088 >= 0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLel;I)V", line = 43)
    public final void method2301(boolean arg0, class545 arg1, int arg2) {
        if (!arg0) {
            this.field7518 = null;
        }
        class530 var4 = (class530) arg1;
        this.field7501.SetStreamSource(arg2, var4.field7540, 0, var4.method3108((byte) -128));
    }

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "(B)V", line = 54)
    public final void method2273(byte arg0) {
        if (arg0 == 81) {
            int var2 = this.field7519[this.field5075] ? method3087(this.field5127[this.field5075], -84) : 1;
            this.field7501.SetTextureStageState(this.field5075, 1, var2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZB[[I)Lvq;", line = 66)
    public final class460 method2216(int arg0, boolean arg1, byte arg2, int[][] arg3) {
        if (arg2 >= -51) {
            this.field7525 = false;
        }
        return new class561(this, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZII[BILwd;II)Loq;", line = 76)
    public final class358 method2253(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, class272 arg5, int arg6, int arg7) {
        if (arg6 > -33) {
            this.method2295(null, 64, null, -88, 100, 63, -2);
        }
        return new class509(this, arg5, arg1, arg4, arg0, arg3, arg2, arg7);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljm;Lwd;IBI)Loq;", line = 86)
    public final class358 method2241(class687 arg0, class272 arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -110) {
            this.method2232(11);
        }
        return new class509(this, arg1, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljagdx/IDirect3DVertexShader;I)V", line = 96)
    public final void method3083(IDirect3DVertexShader arg0, int arg1) {
        this.field7526 = arg0;
        this.field7501.SetVertexShader(arg0);
        if (arg1 != 30941) {
            this.method2302(-69);
        }
        this.method2232(15944);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLjagdx/IDirect3DPixelShader;)V", line = 110)
    public final void method3084(boolean arg0, IDirect3DPixelShader arg1) {
        if (!arg0) {
            this.field7501.SetPixelShader(arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 121)
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class266 {
        this.method429(arg2, arg3);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ[IIBII)Loq;", line = 131)
    public final class358 method2246(int arg0, boolean arg1, int[] arg2, int arg3, byte arg4, int arg5, int arg6) {
        return arg4 == -4 ? new class509(this, arg0, arg3, arg1, arg2, arg6, arg5) : (class358) null;
    }

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "(B)F", line = 141)
    public final float method2316(byte arg0) {
        return arg0 < 4 ? 0.58852446F : -0.5F;
    }

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "(I)V", line = 151)
    public final void method2232(int arg0) {
        if (this.field7526 == null && this.field5100[this.field5075] != class479.field6847) {
            if (this.field5100[this.field5075] == class250.field3021) {
                this.field7501.SetTransform(this.field5075 + 16, this.field5140[this.field5075].method2651(14, field7512));
            } else {
                this.field7501.SetTransform(this.field5075 + 16, this.field5140[this.field5075].method2659(-118, field7512));
            }
            int var2 = method3086(this.field5100[this.field5075], (byte) -76);
            if (this.field7506[this.field5075] != var2) {
                this.field7501.SetTextureStageState(this.field5075, 24, var2);
                this.field7506[this.field5075] = var2;
            }
        } else {
            this.field7501.SetTextureStageState(this.field5075, 24, 0);
            this.field7506[this.field5075] = 0;
        }
        if (arg0 != 15944) {
            createToolkit(null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Luh;I)I", line = 182)
    private static final int method3085(class166 arg0, int arg1) {
        if (class103.field1078 == arg0) {
            return 2;
        } else if (class439.field6375 == arg0) {
            return 3;
        } else if (class66.field669 == arg0) {
            return 1;
        } else if (class178.field2092 == arg0) {
            return 4;
        } else if (class208.field2458 == arg0) {
            return 6;
        } else if (class228.field2635 == arg0) {
            return 5;
        } else {
            int var2 = 32 % ((-arg1 - 70) / 34);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "()V", line = 216)
    public final void method334() {
        IDirect3DEventQuery var1 = this.field7501.method2904();
        if (class481.method2896(var1.Issue(), 2005530520)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3834(-31315);
    }

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "()I", line = 239)
    public final int method318() {
        return 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Liaa;", line = 246)
    public final class493 method337(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "(I)V", line = 253)
    public final void method2291(int arg0) {
        this.field7501.SetScissorRect(this.field5091 + this.field5081, this.field5142 + this.field5138, this.field5143, this.field5110);
        if (arg0 != 11317) {
            this.method3090(94, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "na", descriptor = "(IIII)[I", line = 265)
    public final int[] method356(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field7501.method2907(0);
        IDirect3DSurface var7 = this.field7501.method2902(arg2, arg3, 21, 0, 0, true);
        if (class481.method2896(this.field7501.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 2005530520) && class481.method2896(var7.LockRect(0, 0, arg2, arg3, 16, this.field7514), 2005530520)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field7514.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field7514.method2920(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field7514.method2920(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3834(-31315);
        var7.method3834(-31315);
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILffa;)V", line = 307)
    public final void method2211(int arg0, class185 arg1) {
        int var3 = 0;
        if (class156.field1717 == arg1) {
            var3 = 65536;
        } else if (class565.field8036 == arg1) {
            var3 = 131072;
        } else if (class389.field5381 == arg1) {
            var3 = 196608;
        }
        if (arg0 != -13095) {
            this.field7520 = null;
        }
        this.field7501.SetTextureStageState(this.field5075, 11, this.field5075 | var3);
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V", line = 330)
    public final synchronized void method415(int arg0) {
        this.field7528.method3825(9234);
        super.method415(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lkv;Liaa;)Ljj;", line = 338)
    public final class118 method423(class268 arg0, class493 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "(Z)V", line = 345)
    public final void method2292(boolean arg0) {
        this.field7501.method2898(14, this.field5134 && this.field5098);
        if (arg0) {
            this.method2195(false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lmk;B)I", line = 355)
    private static final int method3086(class54 arg0, byte arg1) {
        if (class703.field9904 == arg0) {
            return 1;
        } else if (class655.field9349 == arg0) {
            return 2;
        } else if (class235.field2799 == arg0) {
            return 3;
        } else if (class250.field3021 == arg0) {
            return 4;
        } else if (class74.field776 == arg0) {
            return 256;
        } else {
            int var2 = -28 % ((arg1 + 10) / 37);
            return 0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V", line = 383)
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "(Z)V", line = 386)
    public final void method2286(boolean arg0) {
        if (!this.field7523) {
            this.field7501.LightEnable(0, false);
            this.field7501.LightEnable(1, false);
            this.field7501.SetLight(0, this.field7524);
            this.field7501.SetLight(1, this.field7507);
            this.field7501.LightEnable(0, true);
            this.field7501.LightEnable(1, true);
            this.field7523 = true;
        }
        if (!arg0) {
            this.method322();
        }
    }

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "(B)V", line = 408)
    public final void method2250(byte arg0) {
        if (this.field5137.method2083(5121)) {
            this.field5053.method2651(14, field7512);
        } else {
            field7512[15] = 1.0F;
            field7512[4] = 0.0F;
            field7512[5] = 1.0F;
            field7512[12] = 0.0F;
            field7512[14] = 0.0F;
            field7512[11] = 0.0F;
            field7512[6] = 0.0F;
            field7512[8] = 0.0F;
            field7512[10] = 1.0F;
            field7512[7] = 0.0F;
            field7512[0] = 1.0F;
            field7512[3] = 0.0F;
            field7512[13] = 0.0F;
            field7512[2] = 0.0F;
            field7512[1] = 0.0F;
            field7512[9] = 0.0F;
        }
        this.field7501.SetTransform(2, field7512);
        if (arg0 <= 97) {
            method3094(115, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "()Z", line = 444)
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "(II)V", line = 452)
    public final void method386(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(II)Lkv;", line = 456)
    public final class268 method425(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZZILpt;)V", line = 477)
    public final void method2318(byte arg0, boolean arg1, boolean arg2, int arg3, class529 arg4) {
        byte var7;
        if (arg3 == 1) {
            var7 = 3;
        } else if (arg3 == 2) {
            var7 = 26;
        } else {
            var7 = 2;
        }
        if (arg0 <= 22) {
            this.method2277(32);
        }
        int var8 = 0;
        if (arg2) {
            var8 |= 0x20;
        }
        if (arg1) {
            var8 |= 0x10;
        }
        this.field7501.SetTextureStageState(this.field5075, var7, var8 | method3092(arg4, 7507));
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILf;)V", line = 517)
    public final void method2285(int arg0, class753 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 != 1) {
            this.method395();
        }
        this.field7501.SetVertexDeclaration(var3.field4111);
    }

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "(I)V", line = 529)
    public final void method2302(int arg0) {
        int var2 = 46 % ((59 - arg0) / 34);
        this.field7501.method2898(7, this.field5125);
    }

    @OriginalMember(owner = "client!hl", name = "ya", descriptor = "()V", line = 538)
    public final void method319() {
        this.method2234(true, 0);
        this.field7501.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljj;)V", line = 545)
    public final void method357(class118 arg0) {
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 548)
    public final void method2270(Canvas arg0, int arg1, Object arg2) {
        if (arg1 == 0) {
            this.field7509 = (class487) arg2;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BILwd;III)Lak;", line = 559)
    public final class349 method2230(byte[] arg0, int arg1, class272 arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 27728) {
            field7505 = null;
        }
        return new class216(this, arg2, arg4, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lpt;ZII)V", line = 581)
    public final void method2271(class529 arg0, boolean arg1, int arg2, int arg3) {
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
        this.field7501.SetTextureStageState(this.field5075, var6, method3092(arg0, 7507) | var7);
        if (arg2 != -1) {
            this.method423(null, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lkm;Lkm;FLkm;)Lkm;", line = 616)
    public final class353 method341(class353 arg0, class353 arg1, float arg2, class353 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[FLwd;IBZII)Loq;", line = 624)
    public final class358 method2296(int arg0, float[] arg1, class272 arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7) {
        int var9 = 33 / ((arg4 + 65) / 46);
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "()V", line = 632)
    public final void method362() {
    }

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "(B)V", line = 635)
    public final void method2229(byte arg0) {
        if (arg0 <= 118) {
            method3086(null, (byte) 26);
        }
        this.field7501.method2898(137, this.field5121 && !this.field5111);
    }

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "()V", line = 646)
    public final void method384() {
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILuh;)V", line = 649)
    public final void method2209(int arg0, int arg1, int arg2, class166 arg3) {
        if (arg0 == 0) {
            this.field7501.DrawPrimitive(method3085(arg3, -1), arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "()V", line = 663)
    public final void method351() {
    }

    @OriginalMember(owner = "client!hl", name = "GA", descriptor = "(I)V", line = 666)
    public final void method378(int arg0) {
        this.field7501.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 673)
    public final void method322() {
        this.field7528.method3827(true);
        super.method322();
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(II)V", line = 681)
    public final void method2252(int arg0, int arg1) {
        this.field7501.SetTextureStageState(this.field5075, 11, arg0);
        if (arg1 != 0) {
            this.field7515 = true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lbga;I)I", line = 695)
    private static final int method3087(class356 arg0, int arg1) {
        if (class94.field989 == arg0) {
            return 2;
        } else if (class372.field4752 == arg0) {
            return 4;
        } else if (class1.field4 == arg0) {
            return 26;
        } else if (class360.field4624 == arg0) {
            return 7;
        } else if (class495.field7004 == arg0) {
            return 10;
        } else if (arg1 >= -27) {
            return -126;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILsba;)V", line = 725)
    public final void method3088(int arg0, class216 arg1) {
        this.method3095(arg1, (byte) -53);
        if (!this.field7502[this.field5075]) {
            this.field7501.SetSamplerState(this.field5075, 1, 1);
            this.field7502[this.field5075] = true;
        }
        if (!this.field7511[this.field5075]) {
            this.field7501.SetSamplerState(this.field5075, 2, 1);
            this.field7511[this.field5075] = true;
        }
        if (arg0 != 5) {
            this.method2201((byte) 34);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;II)Z", line = 749)
    private static final boolean method3089(int arg0, IDirect3D arg1, int arg2, D3DPRESENT_PARAMETERS arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 0;
        if (arg4 >= -68) {
            return false;
        }
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class481.method2897(arg1.method2895(arg0, var9), -15560)) {
                return false;
            }
            label80: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field7505.length; var10++) {
                        if (arg1.CheckDeviceType(arg0, arg2, var9.Format, field7505[var10], true) == 0 && arg1.CheckDeviceFormat(arg0, arg2, var9.Format, 1, 1, field7505[var10]) == 0 && (arg5 == 0 || arg1.CheckDeviceMultiSampleType(arg0, arg2, field7505[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field7527.length; var11++) {
                                if (arg1.CheckDeviceFormat(arg0, arg2, var9.Format, 2, 1, field7527[var11]) == 0 && arg1.CheckDepthStencilMatch(arg0, arg2, var9.Format, field7505[var10], field7527[var11]) == 0 && (arg5 == 0 || arg1.CheckDeviceMultiSampleType(arg0, arg2, field7527[var10], true, var8) == 0)) {
                                    var6 = field7527[var11];
                                    var7 = field7505[var10];
                                    break label80;
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
            arg3.BackBufferFormat = var7;
            arg3.MultiSampleQuality = 0;
            arg3.MultiSampleType = var8;
            arg3.AutoDepthStencilFormat = var6;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 853)
    public final void method2200(int arg0) {
        this.field7501.SetViewport(this.field5091, this.field5138, this.field4912, this.field4875, 0.0F, (float) arg0);
    }

    @OriginalMember(owner = "client!hl", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Loh;Ljava/lang/Integer;)Lha;", line = 862)
    public static final class58 createToolkit(Canvas arg0, class150 arg1, class404 arg2, Integer arg3) {
        class527 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class670 var7 = new class670();
            IDirect3D var8 = IDirect3D.method2892(-2147483616, var7);
            D3DCAPS var9 = var8.method2893(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams >= 5) {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method3089(var5, var8, var6, var10, -73, arg3)) {
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
                    var13 = var8.method2891(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class482 var17) {
                    var13 = var8.method2891(var5, var6, arg0, var11 | 0x20, var10);
                }
                class487 var15 = new class487(var13.method2915(0), var13.method2908());
                var4 = new class527(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method2297(-44);
                return var4;
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method322();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 963)
    public final Object method2311(int arg0, Canvas arg1) {
        if (arg0 != -9219) {
            this.method334();
        }
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([Ltg;I)Lf;", line = 973)
    public final class753 method2312(class231[] arg0, int arg1) {
        if (arg1 != 0) {
            this.method2316((byte) -29);
        }
        return new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(II)V", line = 983)
    public final void method429(int arg0, int arg1) throws class266 {
        this.field7501.EndScene();
        if (this.field7509.method2938(true)) {
            this.field7503 = 0;
            if (class481.method2897(this.field7509.method2939((byte) 21, 0), -15560)) {
                this.method3091(false);
            }
        } else if (++this.field7503 <= 50) {
            this.method3091(false);
        } else {
            throw new class266();
        }
        this.field7501.BeginScene();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILdk;)V", line = 1009)
    public final void method3090(int arg0, class509 arg1) {
        if (arg0 != 1) {
            this.method347(false);
        }
        this.method3095(arg1, (byte) -117);
        if (this.field7502[this.field5075] != arg1.field7246) {
            this.field7501.SetSamplerState(this.field5075, 1, arg1.field7246 ? 1 : 3);
            this.field7502[this.field5075] = arg1.field7246;
        }
        if (arg1.field7244 != this.field7511[this.field5075]) {
            this.field7501.SetSamplerState(this.field5075, 2, arg1.field7244 ? 1 : 3);
            this.field7511[this.field5075] = arg1.field7244;
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)V", line = 1032)
    public final void method2197(byte arg0) {
        this.method2289(true);
        this.method2286(true);
        int var2 = 18 % ((12 - arg0) / 52);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1043)
    public final void method2199(byte arg0, Canvas arg1, Object arg2) {
        int var4 = -30 / ((-arg0 - 53) / 49);
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(B)V", line = 1050)
    public final void method2305(byte arg0) {
        this.field7501.method2898(174, this.field5180);
        if (arg0 != 86) {
            this.method2292(true);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/rh;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lkp;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Loh;I)V", line = 1059)
    private class527(int arg0, int arg1, Canvas arg2, class670 arg3, IDirect3D arg4, IDirect3DDevice arg5, class487 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class150 arg9, class404 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field7522 = arg0;
        this.field7501 = arg5;
        this.field7528 = arg3;
        this.field7521 = arg4;
        this.field7518 = arg7;
        this.field7516 = arg8;
        this.field7508 = arg1;
        this.field7509 = arg6;
        this.field7524 = new class483(this.field7528);
        this.field7507 = new class483(this.field7528);
        this.field7517 = new class483(this.field7528);
        this.field7514 = new PixelBuffer(this.field7528);
        this.field7510 = new GeometryBuffer(this.field7528);
        new GeometryBuffer(this.field7528);
        this.field5113 = (this.field7516.TextureCaps & 0x800) != 0;
        this.field5073 = this.field7516.MaxSimultaneousTextures;
        this.field7515 = (this.field7516.TextureCaps & 0x2) == 0;
        this.field7525 = (this.field7516.TextureCaps & 0x4000) != 0;
        this.field5082 = (this.field7516.TextureCaps & 0x2000) != 0;
        this.field7504 = (this.field7516.TextureCaps & 0x10000) != 0;
        this.field5096 = this.field7516.MaxActiveLights <= 0 ? 8 : this.field7516.MaxActiveLights;
        this.field5064 = this.field5147 > 0 || this.field7521.CheckDeviceMultiSampleType(this.field7522, this.field7508, this.field7518.BackBufferFormat, true, 2) == 0;
        this.field7502 = new boolean[this.field5073];
        this.field7513 = new class22[this.field5073];
        this.field7519 = new boolean[this.field5073];
        this.field7511 = new boolean[this.field5073];
        this.field7520 = new boolean[this.field5073];
        this.field7506 = new int[this.field5073];
        this.field7501.BeginScene();
    }

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "(B)V", line = 1101)
    public final void method2247(byte arg0) {
        int var2 = -40 / ((-arg0 - 15) / 45);
        if (class341.field4403 == this.field5060) {
            this.field7501.SetRenderState(19, 5);
            this.field7501.SetRenderState(20, 6);
        } else if (class726.field10153 == this.field5060) {
            this.field7501.SetRenderState(19, 2);
            this.field7501.SetRenderState(20, 2);
        } else if (class205.field2427 == this.field5060) {
            this.field7501.SetRenderState(19, 9);
            this.field7501.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "(I)V", line = 1128)
    public final void method2277(int arg0) {
        this.field7501.method2898(27, this.field5063);
        if (arg0 != 0) {
            this.field7502 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(ZI)Lel;", line = 1138)
    public final class545 method2306(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field7510 = null;
        }
        return new class530(this, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "(I)V", line = 1154)
    public final void method2220(int arg0) {
        for (int var2 = 0; var2 < this.field5073; var2++) {
            this.field7501.SetSamplerState(var2, 7, 0);
            this.field7501.SetSamplerState(var2, 6, 2);
            this.field7501.SetSamplerState(var2, 5, 2);
            this.field7501.SetSamplerState(var2, 1, 1);
            this.field7501.SetSamplerState(var2, 2, 1);
            this.field7513[var2] = class523.field7453;
            this.field7502[var2] = this.field7511[var2] = true;
            this.field7520[var2] = false;
            this.field7506[var2] = 0;
        }
        this.field7501.SetTextureStageState(0, 6, 1);
        this.field7501.SetRenderState(9, 2);
        this.field7501.SetRenderState(23, 4);
        this.field7501.SetRenderState(25, 5);
        this.field7501.SetRenderState(24, 0);
        this.field7501.SetRenderState(22, 2);
        this.field7501.SetRenderState(147, 1);
        this.field7501.SetRenderState(145, 1);
        this.field7501.method2911(38, 0.95F);
        this.field7501.SetRenderState(140, 3);
        this.field7524.SetType(3);
        this.field7507.SetType(3);
        this.field7517.SetType(1);
        this.field7523 = false;
        super.method2220(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)V", line = 1190)
    public final void method2237(int arg0, boolean arg1) {
        this.field7501.method2898(161, arg1);
        if (arg0 != 0) {
            field7527 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "(Z)Z", line = 1201)
    private final boolean method3091(boolean arg0) {
        int var2 = this.field7501.TestCooperativeLevel();
        if (arg0) {
            this.field7509 = null;
        }
        if (var2 == 0 || var2 == -2005530519) {
            class487 var3 = (class487) this.field4862;
            this.method2214(-116);
            var3.method2940(-111);
            this.field7518.BackBufferWidth = 0;
            this.field7518.BackBufferHeight = 0;
            if (method3089(this.field7522, this.field7521, this.field7508, this.field7518, -100, this.field5147)) {
                int var4 = this.field7501.Reset(this.field7518);
                if (class481.method2896(var4, 2005530520)) {
                    var3.method2937(-20008, this.field7501.method2915(0), this.field7501.method2908());
                    this.method2254(8);
                    this.method2220(-12761);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(FFF)V", line = 1239)
    public final void method401(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)V", line = 1246)
    public final void method2201(byte arg0) {
        this.field7501.SetTransform(3, this.field5118);
        if (arg0 != 33) {
            this.field7513 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(ZI)Lkga;", line = 1258)
    public final class543 method2235(boolean arg0, int arg1) {
        if (arg1 != 9) {
            this.field7507 = null;
        }
        return new class46(this, class687.field9698, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(Z)V", line = 1269)
    public final void method2227(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            this.field7509 = null;
        }
        while (this.field5056 > var2) {
            class163 var3 = this.field5122[var2];
            int var4 = var2 + 2;
            int var5 = var3.method1010(-5636);
            float var6 = var3.method1011(24617) / 255.0F;
            this.field7517.SetPosition((float) var3.method1012((byte) 127), (float) var3.method1006(31079), (float) var3.method1013(9179409));
            this.field7517.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field7517.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method1007(61) * var3.method1007(118)));
            this.field7517.SetRange((float) var3.method1007(99));
            this.field7501.SetLight(var4, this.field7517);
            this.field7501.LightEnable(var4, true);
            var2++;
        }
        while (var2 < this.field5114) {
            this.field7501.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2227(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lpt;I)I", line = 1307)
    private static final int method3092(class529 arg0, int arg1) {
        if (class424.field6157 == arg0) {
            return 2;
        } else if (class169.field1881 == arg0) {
            return 0;
        } else if (class324.field4136 == arg0) {
            return 1;
        } else if (class58.field582 == arg0) {
            return 3;
        } else {
            if (arg1 != 7507) {
                method3094(-102, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lwd;Ljm;I)I", line = 1334)
    public static final int method3093(class272 arg0, class687 arg1, int arg2) {
        if (class687.field9697 == arg1) {
            if (class430.field6247 == arg0) {
                return 22;
            }
            if (class102.field1058 == arg0) {
                return 21;
            }
            if (class252.field3039 == arg0) {
                return 28;
            }
            if (class23.field209 == arg0) {
                return 50;
            }
            if (class147.field1639 == arg0) {
                return 51;
            }
            if (class411.field5613 == arg0) {
                return 77;
            }
        }
        int var3 = -32 % ((arg2 - 20) / 60);
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "()V", line = 1370)
    public final void method426() {
    }

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "(I)V", line = 1374)
    public final void method2317(int arg0) {
        int var2 = 36 % ((arg0 + 2) / 32);
        this.field7524.SetDirection(-this.field5076[0], -this.field5076[1], -this.field5076[2]);
        this.field7507.SetDirection(-this.field5108[0], -this.field5108[1], -this.field5108[2]);
        this.field7523 = false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1384)
    public final void method2219(int arg0, Canvas arg1, Object arg2) {
        if (this.field4917 == arg1) {
            Dimension var4 = arg1.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field7501.EndScene();
                this.method3091(false);
                this.field7501.BeginScene();
            }
        }
        if (arg0 != -1) {
            this.method426();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 1410)
    public final void method347(boolean arg0) {
    }

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "()Z", line = 1413)
    public final boolean method358() {
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "(I)V", line = 1423)
    public final void method2282(int arg0) {
        this.field7501.SetRenderState(60, this.field5148);
        if (arg0 >= -77) {
            this.field7521 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "(I)V", line = 1436)
    public final void method2225(int arg0) {
        if (arg0 != -17580) {
            method3087(null, 109);
        }
        int var2 = this.field7519[this.field5075] ? method3087(this.field5150[this.field5075], -55) : 1;
        this.field7501.SetTextureStageState(this.field5075, 4, var2);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILqo;)I", line = 1448)
    private static final int method3094(int arg0, class22 arg1) {
        if (arg0 != -2592) {
            field7527 = null;
        }
        if (class523.field7453 == arg1) {
            return 2;
        } else if (class755.field10532 == arg1) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Luh;ILkga;IIII)V", line = 1467)
    public final void method2295(class166 arg0, int arg1, class543 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7501.SetIndices(((class46) arg2).field503);
        if (arg1 > -98) {
            this.field7517 = null;
        }
        this.field7501.DrawIndexedPrimitive(method3085(arg0, -29), 0, arg3, arg6, arg5, arg4);
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(Z)V", line = 1487)
    public final void method2278(boolean arg0) {
        if (this.field5045) {
            field7512[2] = 0.0F;
            field7512[0] = 1.0F;
            field7512[7] = 0.0F;
            field7512[13] = 0.0F;
            field7512[12] = 0.0F;
            field7512[5] = 1.0F;
            field7512[9] = 0.0F;
            field7512[3] = 0.0F;
            field7512[1] = 0.0F;
            field7512[10] = 1.0F;
            field7512[4] = 0.0F;
            field7512[15] = 1.0F;
            field7512[8] = 0.0F;
            field7512[11] = 0.0F;
            field7512[6] = 0.0F;
            field7512[14] = 0.0F;
        } else {
            this.field5047.method2651(14, field7512);
        }
        this.field7501.SetTransform(256, field7512);
        if (!arg0) {
            this.method378(-70);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lmca;B)V", line = 1523)
    public final void method3095(class31 arg0, byte arg1) {
        this.field7501.SetTexture(this.field5075, arg0.method154(false));
        if (this.field7513[this.field5075] != arg0.field354) {
            int var3 = method3094(-2592, arg0.field354);
            this.field7501.SetSamplerState(this.field5075, 6, var3);
            this.field7501.SetSamplerState(this.field5075, 5, var3);
            this.field7513[this.field5075] = arg0.field354;
            if (this.field7520[this.field5075] != arg0.field358) {
                this.field7501.SetSamplerState(this.field5075, 7, arg0.field358 ? method3094(-2592, arg0.field354) : 0);
                this.field7520[this.field5075] = arg0.field358;
            }
        } else if (this.field7520[this.field5075] != arg0.field358) {
            this.field7501.SetSamplerState(this.field5075, 7, arg0.field358 ? method3094(-2592, arg0.field354) : 0);
            this.field7520[this.field5075] = arg0.field358;
        }
        if (arg1 > -23) {
            this.field7503 = 81;
        }
        if (!this.field7519[this.field5075]) {
            this.field7519[this.field5075] = true;
            this.method2225(-17580);
            this.method2273((byte) 81);
        }
    }

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "(B)V", line = 1566)
    public final void method2210(byte arg0) {
        if (arg0 <= 104) {
            this.field7508 = -35;
        }
        this.field5089 = (this.field5092 - this.field5135);
        this.field5153 = (float) (-this.field5088) + this.field5089;
        if ((float) this.field5151 > this.field5153) {
            this.field5153 = this.field5151;
        }
        this.field7501.method2911(36, this.field5153);
        this.field7501.method2911(37, this.field5089);
        this.field7501.SetRenderState(34, this.field5117);
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(I)V", line = 1584)
    public final void method2259(int arg0) {
        this.field7524.SetAmbient(this.field5116 * this.field5078, this.field5116 * this.field5067, this.field5116 * this.field5079, (float) arg0);
        this.field7523 = false;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIID)V", line = 1594)
    public final void method403(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "(Z)V", line = 1599)
    public final void method2289(boolean arg0) {
        float var2 = this.field5136 ? this.field5093 : 0.0F;
        if (!arg0) {
            this.method337(-25, -119);
        }
        float var3 = this.field5136 ? -this.field5094 : 0.0F;
        this.field7524.SetDiffuse(this.field5078 * var2, this.field5067 * var2, this.field5079 * var2, 0.0F);
        this.field7507.SetDiffuse(this.field5078 * var3, this.field5067 * var3, this.field5079 * var3, 0.0F);
        this.field7523 = false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lwd;ILjm;)Z", line = 1615)
    public final boolean method2313(class272 arg0, int arg1, class687 arg2) {
        int var4 = 25 % ((arg1 - 54) / 47);
        D3DDISPLAYMODE var5 = new D3DDISPLAYMODE();
        return class481.method2896(this.field7521.method2895(this.field7522, var5), 2005530520) && class481.method2896(this.field7521.CheckDeviceFormat(this.field7522, this.field7508, var5.Format, 0, 4, method3093(arg0, arg2, -77)), 2005530520);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lwd;Ljm;Z)Z", line = 1626)
    public final boolean method2192(class272 arg0, class687 arg1, boolean arg2) {
        if (!arg2) {
            this.field7526 = null;
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class481.method2896(this.field7521.method2895(this.field7522, var4), 2005530520) && class481.method2896(this.field7521.CheckDeviceFormat(this.field7522, this.field7508, var4.Format, 0, 3, method3093(arg0, arg1, -119)), 2005530520);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)V", line = 1640)
    public final void method2195(boolean arg0) {
        if (!arg0) {
            createToolkit(null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(II)Lah;", line = 1650)
    public final class384 method2196(int arg0, int arg1) {
        if (arg0 > -7) {
            this.method2259(-1);
        }
        if (arg1 == 3) {
            return new class405(this, this.field4979);
        } else if (arg1 == 4) {
            return new class72(this, this.field4979, this.field4906);
        } else if (arg1 == 8) {
            return new class696(this, this.field4979, this.field4906);
        } else {
            return super.method2196(-33, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "()Loba;", line = 1700)
    public final class261 method395() {
        D3DADAPTER_IDENTIFIER var1 = this.field7521.method2894(this.field7522, 0);
        return new class261(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }
}
