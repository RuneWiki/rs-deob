import jaclib.peer.class699;
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
import jagdx.class508;
import jagdx.class509;
import jagdx.class510;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class475 extends class703 {

    @OriginalMember(owner = "client!uda", name = "Wg", descriptor = "Z")
    private boolean field6671 = false;

    @OriginalMember(owner = "client!uda", name = "ch", descriptor = "I")
    private int field6677 = 0;

    @OriginalMember(owner = "client!uda", name = "Og", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field6663;

    @OriginalMember(owner = "client!uda", name = "jh", descriptor = "Lwq;")
    private class179 field6684;

    @OriginalMember(owner = "client!uda", name = "eh", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field6679;

    @OriginalMember(owner = "client!uda", name = "kh", descriptor = "I")
    private int field6685;

    @OriginalMember(owner = "client!uda", name = "bh", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field6676;

    @OriginalMember(owner = "client!uda", name = "Rg", descriptor = "I")
    private int field6666;

    @OriginalMember(owner = "client!uda", name = "ih", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field6683;

    @OriginalMember(owner = "client!uda", name = "Ug", descriptor = "Ljaclib/peer/hk;")
    public class699 field6669;

    @OriginalMember(owner = "client!uda", name = "oh", descriptor = "Ljagdx/D3DLIGHT;")
    private class510 field6689;

    @OriginalMember(owner = "client!uda", name = "ph", descriptor = "Ljagdx/D3DLIGHT;")
    private class510 field6690;

    @OriginalMember(owner = "client!uda", name = "dh", descriptor = "Ljagdx/D3DLIGHT;")
    private class510 field6678;

    @OriginalMember(owner = "client!uda", name = "lh", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field6686;

    @OriginalMember(owner = "client!uda", name = "Zg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field6674;

    @OriginalMember(owner = "client!uda", name = "Yg", descriptor = "Z")
    public boolean field6673;

    @OriginalMember(owner = "client!uda", name = "Qg", descriptor = "Z")
    public boolean field6665;

    @OriginalMember(owner = "client!uda", name = "Pg", descriptor = "Z")
    public boolean field6664;

    @OriginalMember(owner = "client!uda", name = "ah", descriptor = "[Z")
    private boolean[] field6675;

    @OriginalMember(owner = "client!uda", name = "fh", descriptor = "[I")
    private int[] field6680;

    @OriginalMember(owner = "client!uda", name = "nh", descriptor = "[Z")
    private boolean[] field6688;

    @OriginalMember(owner = "client!uda", name = "gh", descriptor = "[Z")
    private boolean[] field6681;

    @OriginalMember(owner = "client!uda", name = "hh", descriptor = "[Z")
    private boolean[] field6682;

    @OriginalMember(owner = "client!uda", name = "mh", descriptor = "[Lag;")
    private class710[] field6687;

    @OriginalMember(owner = "client!uda", name = "Vg", descriptor = "[F")
    private static float[] field6670 = new float[16];

    @OriginalMember(owner = "client!uda", name = "Sg", descriptor = "[I")
    private static int[] field6667 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!uda", name = "Xg", descriptor = "[I")
    private static int[] field6672 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!uda", name = "Tg", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6668;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lhfa;B)V", line = 4)
    public final void method2757(class330 arg0, byte arg1) {
        if (arg1 != -97) {
            this.field6665 = true;
        }
        this.field6676.SetTexture(this.field9508, arg0.method2137(false));
        if (this.field6687[this.field9508] != arg0.field4687) {
            int var3 = method2802(arg0.field4687, true);
            this.field6676.SetSamplerState(this.field9508, 6, var3);
            this.field6676.SetSamplerState(this.field9508, 5, var3);
            this.field6687[this.field9508] = arg0.field4687;
            if (this.field6688[this.field9508] != arg0.field4684) {
                this.field6676.SetSamplerState(this.field9508, 7, arg0.field4684 ? method2802(arg0.field4687, true) : 0);
                this.field6688[this.field9508] = arg0.field4684;
            }
        } else if (this.field6688[this.field9508] != arg0.field4684) {
            this.field6676.SetSamplerState(this.field9508, 7, arg0.field4684 ? method2802(arg0.field4687, true) : 0);
            this.field6688[this.field9508] = arg0.field4684;
        }
        if (!this.field6675[this.field9508]) {
            this.field6675[this.field9508] = true;
            this.method2807(false);
            this.method2800(-25);
        }
    }

    @OriginalMember(owner = "client!uda", name = "t", descriptor = "(B)V", line = 43)
    public final void method2758(byte arg0) {
        if (arg0 == -30) {
            this.field6676.method2964(15, this.field9535);
        }
    }

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "(Z)V", line = 53)
    public final void method2759(boolean arg0) {
        this.field9518 = (this.field9533 - this.field9548);
        if (arg0) {
            this.method2799(false);
        }
        this.field9556 = this.field9518 - (float) this.field9569;
        if (this.field9556 < (float) this.field9571) {
            this.field9556 = this.field9571;
        }
        this.field6676.method2971(36, this.field9556);
        this.field6676.method2971(37, this.field9518);
        this.field6676.SetRenderState(34, this.field9515);
    }

    @OriginalMember(owner = "client!uda", name = "fb", descriptor = "(I)V", line = 71)
    public final void method2760(int arg0) {
        this.field6676.SetRenderState(60, this.field9563);
        if (arg0 < 60) {
            this.field6677 = -110;
        }
    }

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "(I)V", line = 81)
    public final void method2761(int arg0) {
        if (arg0 != 7) {
            this.method542();
        }
    }

    @OriginalMember(owner = "client!uda", name = "x", descriptor = "(B)V", line = 90)
    public final void method2762(byte arg0) {
        if (this.field9491) {
            field6670[6] = 0.0F;
            field6670[10] = 1.0F;
            field6670[2] = 0.0F;
            field6670[5] = 1.0F;
            field6670[15] = 1.0F;
            field6670[9] = 0.0F;
            field6670[13] = 0.0F;
            field6670[3] = 0.0F;
            field6670[14] = 0.0F;
            field6670[11] = 0.0F;
            field6670[12] = 0.0F;
            field6670[7] = 0.0F;
            field6670[8] = 0.0F;
            field6670[1] = 0.0F;
            field6670[0] = 1.0F;
            field6670[4] = 0.0F;
        } else {
            this.field9501.method3077(field6670, 120);
        }
        this.field6676.SetTransform(256, field6670);
        if (arg0 > -24) {
            this.field6687 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)V", line = 127)
    public final void method2763(byte arg0) {
        this.field6676.method2964(14, this.field9590 && this.field9531);
        if (arg0 != 103) {
            this.method476();
        }
    }

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "(B)V", line = 137)
    public final void method2764(byte arg0) {
        if (arg0 == 127 && this.field6675[this.field9508]) {
            this.field6675[this.field9508] = false;
            this.field6676.SetTexture(this.field9508, null);
            this.method2807(false);
            this.method2800(arg0 - 152);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILsia;)V", line = 156)
    public final void method2765(int arg0, class765 arg1) {
        int var3 = 0;
        int var4 = -22 / ((arg0 - 32) / 52);
        if (class16.field154 == arg1) {
            var3 = 65536;
        } else if (class264.field3884 == arg1) {
            var3 = 131072;
        } else if (class489.field6822 == arg1) {
            var3 = 196608;
        }
        this.field6676.SetTextureStageState(this.field9508, 11, var3 | this.field9508);
    }

    @OriginalMember(owner = "client!uda", name = "u", descriptor = "(I)V", line = 180)
    public final void method2766(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field9516; var2++) {
            class127 var3 = this.field9561[var2];
            int var4 = var2 + 2;
            int var5 = var3.method898(arg0 - 120);
            float var6 = var3.method902(0) / 255.0F;
            this.field6678.SetPosition((float) var3.method899(true), (float) var3.method904(-121), (float) var3.method901((byte) -115));
            this.field6678.SetDiffuse((float) (var5 >> 16 & 0xFF) * var6, (float) (var5 >> 8 & 0xFF) * var6, (float) (var5 & 0xFF) * var6, 0.0F);
            this.field6678.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var3.method903((byte) -112) * var3.method903((byte) -113)));
            this.field6678.SetRange((float) var3.method903((byte) -109));
            this.field6676.SetLight(var4, this.field6678);
            this.field6676.LightEnable(var4, true);
        }
        while (this.field9572 > var2) {
            this.field6676.LightEnable(var2 + 2, false);
            var2++;
        }
        super.method2766(arg0);
    }

    @OriginalMember(owner = "client!uda", name = "J", descriptor = "(I)Z", line = 215)
    private final boolean method2767(int arg0) {
        if (arg0 != -16330) {
            return false;
        }
        int var2 = this.field6676.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class179 var3 = (class179) this.field9343;
            this.method3879(arg0 + 16328);
            var3.method1219(110);
            this.field6683.BackBufferHeight = 0;
            this.field6683.BackBufferWidth = 0;
            if (method2768(this.field6679, this.field6685, this.field6666, this.field6683, false, this.field9526)) {
                int var4 = this.field6676.Reset(this.field6683);
                if (class509.method2977(var4, 17527)) {
                    var3.method1220(this.field6676.method2959(0), 0, this.field6676.method2967());
                    this.method3896((byte) 121);
                    this.method2804(-14214);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljagdx/IDirect3D;IILjagdx/D3DPRESENT_PARAMETERS;ZI)Z", line = 256)
    private static final boolean method2768(IDirect3D arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, boolean arg4, int arg5) {
        int var6 = 0;
        if (arg4) {
            return false;
        }
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class509.method2978(0, arg0.method2956(arg1, var9))) {
                return false;
            }
            label80: while (arg5 >= 0) {
                if (arg5 != 1) {
                    var8 = arg5;
                    for (int var10 = 0; var10 < field6672.length; var10++) {
                        if (arg0.CheckDeviceType(arg1, arg2, var9.Format, field6672[var10], true) == 0 && arg0.CheckDeviceFormat(arg1, arg2, var9.Format, 1, 1, field6672[var10]) == 0 && (arg5 == 0 || arg0.CheckDeviceMultiSampleType(arg1, arg2, field6672[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field6667.length; var11++) {
                                if (arg0.CheckDeviceFormat(arg1, arg2, var9.Format, 2, 1, field6667[var11]) == 0 && arg0.CheckDepthStencilMatch(arg1, arg2, var9.Format, field6672[var10], field6667[var11]) == 0 && (arg5 == 0 || arg0.CheckDeviceMultiSampleType(arg1, arg2, field6667[var10], true, var8) == 0)) {
                                    var7 = field6672[var10];
                                    var6 = field6667[var11];
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
            arg3.AutoDepthStencilFormat = var6;
            arg3.MultiSampleQuality = 0;
            arg3.MultiSampleType = var8;
            arg3.BackBufferFormat = var7;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLg;Lwj;)Z", line = 360)
    public final boolean method2769(byte arg0, class166 arg1, class415 arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        if (arg0 == 6) {
            return class509.method2977(this.field6679.method2956(this.field6685, var4), arg0 + 17521) && class509.method2977(this.field6679.CheckDeviceFormat(this.field6685, this.field6666, var4.Format, 0, 4, method2776(arg2, (byte) -98, arg1)), 17527);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lrq;B)V", line = 371)
    public final void method2770(class370 arg0, byte arg1) {
        this.method2757(arg0, (byte) -97);
        if (this.field6681[this.field9508] != arg0.field5399) {
            this.field6676.SetSamplerState(this.field9508, 1, arg0.field5399 ? 1 : 3);
            this.field6681[this.field9508] = arg0.field5399;
        }
        int var3 = 57 / ((arg1 + 57) / 52);
        if (this.field6682[this.field9508] != arg0.field5400) {
            this.field6676.SetSamplerState(this.field9508, 2, arg0.field5400 ? 1 : 3);
            this.field6682[this.field9508] = arg0.field5400;
        }
    }

    @OriginalMember(owner = "client!uda", name = "t", descriptor = "()V", line = 394)
    public final void method511() {
    }

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "(B)V", line = 400)
    public final void method2771(byte arg0) {
        if (arg0 > -56) {
            this.method486(-48, -53, -75, 0);
        }
        this.field6676.SetTransform(3, this.field9554);
    }

    @OriginalMember(owner = "client!uda", name = "v", descriptor = "(I)V", line = 412)
    public final void method2772(int arg0) {
        if (arg0 >= -41) {
            this.method2758((byte) 59);
        }
        if (class612.field8269 == this.field9589) {
            this.field6676.SetRenderState(19, 5);
            this.field6676.SetRenderState(20, 6);
        } else if (class93.field1303 == this.field9589) {
            this.field6676.SetRenderState(19, 2);
            this.field6676.SetRenderState(20, 2);
        } else if (class765.field10515 == this.field9589) {
            this.field6676.SetRenderState(19, 9);
            this.field6676.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lfga;I)I", line = 443)
    private static final int method2773(class269 arg0, int arg1) {
        if (arg1 != 1) {
            return 10;
        } else if (class687.field9184 == arg0) {
            return 2;
        } else if (class84.field1198 == arg0) {
            return 3;
        } else if (class677.field9074 == arg0) {
            return 1;
        } else if (class356.field5191 == arg0) {
            return 4;
        } else if (class9.field88 == arg0) {
            return 6;
        } else if (class553.field7635 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uda", name = "GA", descriptor = "(I)V", line = 476)
    public final void method493(int arg0) {
        this.field6676.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!uda", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Ld;Luq;Ljava/lang/Integer;)Lha;", line = 484)
    public static final class66 createToolkit(Canvas arg0, class161 arg1, class172 arg2, Integer arg3) {
        class475 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class699 var7 = new class699();
            IDirect3D var8 = IDirect3D.method2955(-2147483616, var7);
            D3DCAPS var9 = var8.method2953(var5, var6);
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
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method2768(var8, var5, var6, var10, false, arg3)) {
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
                    var13 = var8.method2954(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class508 var17) {
                    var13 = var8.method2954(var5, var6, arg0, var11 | 0x20, var10);
                }
                class179 var15 = new class179(var13.method2959(0), var13.method2967());
                var4 = new class475(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3874(19178);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method476();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "(B)V", line = 584)
    public final void method2774(byte arg0) {
        this.method2792((byte) -116);
        if (arg0 < 85) {
            this.field6688 = null;
        }
        this.method2785(false);
    }

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "()I", line = 595)
    public final int method445() {
        return 0;
    }

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "(II)Lev;", line = 604)
    public final class719 method2775(int arg0, int arg1) {
        if (arg1 != 10) {
            this.field6674 = null;
        }
        if (arg0 == 3) {
            return new class566(this, this.field9472);
        } else if (arg0 == 4) {
            return new class203(this, this.field9472, this.field9400);
        } else if (arg0 == 8) {
            return new class418(this, this.field9472, this.field9400);
        } else {
            return super.method2775(arg0, 10);
        }
    }

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "()V", line = 646)
    public final void method482() {
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lwj;BLg;)I", line = 649)
    public static final int method2776(class415 arg0, byte arg1, class166 arg2) {
        if (arg1 >= -4) {
            return -55;
        }
        if (class415.field5986 == arg0) {
            if (class442.field6353 == arg2) {
                return 22;
            }
            if (class109.field1521 == arg2) {
                return 21;
            }
            if (class325.field4613 == arg2) {
                return 28;
            }
            if (class172.field2282 == arg2) {
                return 50;
            }
            if (class564.field7728 == arg2) {
                return 51;
            }
            if (class638.field8600 == arg2) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "(B)V", line = 686)
    public final void method2777(byte arg0) {
        if (arg0 != -78) {
            this.method2760(-75);
        }
        this.field6676.method2964(174, this.field9630);
    }

    @OriginalMember(owner = "client!uda", name = "ya", descriptor = "()V", line = 696)
    public final void method547() {
        this.method3849((byte) 54, true);
        this.field6676.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BIILfga;)V", line = 706)
    public final void method2778(byte arg0, int arg1, int arg2, class269 arg3) {
        if (arg0 > -57) {
            this.field6688 = null;
        }
        this.field6676.DrawPrimitive(method2773(arg3, 1), arg1, arg2);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lfea;I)I", line = 720)
    private static final int method2779(class152 arg0, int arg1) {
        if (class117.field1574 == arg0) {
            return 2;
        } else if (class291.field4152 == arg0) {
            return 4;
        } else if (class328.field4644 == arg0) {
            return 26;
        } else if (class175.field2307 == arg0) {
            return 7;
        } else if (class66.field895 == arg0) {
            return 10;
        } else {
            if (arg1 != 4) {
                field6670 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uda", name = "na", descriptor = "(IIII)[I", line = 752)
    public final int[] method439(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field6676.method2963(0);
        IDirect3DSurface var7 = this.field6676.method2965(arg2, arg3, 21, 0, 0, true);
        if (class509.method2977(this.field6676.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 17527) && class509.method2977(var7.LockRect(0, 0, arg2, arg3, 16, this.field6686), 17527)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field6686.getRowPitch();
            if ((arg2 * 4) == var8) {
                this.field6686.method2981(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field6686.method2981(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method3820(true);
        var7.method3820(true);
        return var5;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 791)
    public final void method2780(Canvas arg0, int arg1, Object arg2) {
        int var4 = 1 % ((arg1 - 23) / 53);
    }

    @OriginalMember(owner = "client!uda", name = "u", descriptor = "()V", line = 797)
    public final void method514() {
    }

    @OriginalMember(owner = "client!uda", name = "D", descriptor = "(I)V", line = 800)
    public final void method2781(int arg0) {
        this.field6676.SetViewport(this.field9510, this.field9536, this.field9469, this.field9440, (float) arg0, 1.0F);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLjagdx/IDirect3DVertexShader;)V", line = 809)
    public final void method2782(byte arg0, IDirect3DVertexShader arg1) {
        if (arg0 == -104) {
            this.field6668 = arg1;
            this.field6676.SetVertexShader(arg1);
            this.method2788(4);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILg;III[B)Lor;", line = 821)
    public final class665 method2783(int arg0, class166 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        return arg0 == -25885 ? new class499(this, arg1, arg4, arg2, arg3, arg5) : (class665) null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIII)V", line = 830)
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLwj;Lg;)Z", line = 836)
    public final boolean method2784(boolean arg0, class415 arg1, class166 arg2) {
        if (arg0) {
            D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
            return class509.method2977(this.field6679.method2956(this.field6685, var4), 17527) && class509.method2977(this.field6679.CheckDeviceFormat(this.field6685, this.field6666, var4.Format, 0, 3, method2776(arg1, (byte) -55, arg2)), 17527);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "(Z)V", line = 847)
    public final void method2785(boolean arg0) {
        if (arg0) {
            this.method549(-1.229329F, -0.6777431F, -1.1845125F);
        }
        if (this.field6671) {
            return;
        }
        this.field6676.LightEnable(0, false);
        this.field6676.LightEnable(1, false);
        this.field6676.SetLight(0, this.field6689);
        this.field6676.SetLight(1, this.field6690);
        this.field6676.LightEnable(0, true);
        this.field6676.LightEnable(1, true);
        this.field6671 = true;
    }

    @OriginalMember(owner = "client!uda", name = "s", descriptor = "()Z", line = 868)
    public final boolean method510() {
        return false;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/hk;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lwq;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Luq;I)V", line = 874)
    private class475(int arg0, int arg1, Canvas arg2, class699 arg3, IDirect3D arg4, IDirect3DDevice arg5, class179 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class161 arg9, class172 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        try {
            this.field6663 = arg8;
            this.field6684 = arg6;
            this.field6679 = arg4;
            this.field6685 = arg0;
            this.field6676 = arg5;
            this.field6666 = arg1;
            this.field6683 = arg7;
            this.field6669 = arg3;
            this.field6689 = new class510(this.field6669);
            this.field6690 = new class510(this.field6669);
            this.field6678 = new class510(this.field6669);
            this.field6686 = new PixelBuffer(this.field6669);
            this.field6674 = new GeometryBuffer(this.field6669);
            new GeometryBuffer(this.field6669);
            this.field6673 = (this.field6663.TextureCaps & 0x2) == 0;
            this.field9547 = this.field6663.MaxSimultaneousTextures;
            this.field6665 = (this.field6663.TextureCaps & 0x4000) != 0;
            this.field9596 = (this.field6663.TextureCaps & 0x800) != 0;
            this.field6664 = (this.field6663.TextureCaps & 0x10000) != 0;
            this.field9578 = (this.field6663.TextureCaps & 0x2000) != 0;
            this.field9541 = this.field6663.MaxActiveLights > 0 ? this.field6663.MaxActiveLights : 8;
            this.field9580 = this.field9526 > 0 || this.field6679.CheckDeviceMultiSampleType(this.field6685, this.field6666, this.field6683.BackBufferFormat, true, 2) == 0;
            this.field6675 = new boolean[this.field9547];
            this.field6680 = new int[this.field9547];
            this.field6688 = new boolean[this.field9547];
            this.field6681 = new boolean[this.field9547];
            this.field6682 = new boolean[this.field9547];
            this.field6687 = new class710[this.field9547];
            this.field6676.BeginScene();
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method464((byte) -98);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILmq;ZI)V", line = 934)
    public final void method2786(int arg0, class534 arg1, boolean arg2, int arg3) {
        byte var6;
        if (arg3 == 1) {
            var6 = 6;
        } else if (arg3 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = arg0;
        if (arg2) {
            var7 = arg0 | 0x10;
        }
        this.field6676.SetTextureStageState(this.field9508, var6, var7 | method2806(arg1, 3));
    }

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "()V", line = 974)
    public final void method476() {
        this.field6669.method3812(26610);
        super.method476();
    }

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "()Z", line = 982)
    public final boolean method472() {
        return false;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I[[IZB)Lfaa;", line = 989)
    public final class165 method2787(int arg0, int[][] arg1, boolean arg2, byte arg3) {
        return arg3 >= -35 ? (class165) null : new class467(this, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!uda", name = "cb", descriptor = "(I)V", line = 999)
    public final void method2788(int arg0) {
        if (arg0 != 4) {
            this.field6679 = null;
        }
        if (this.field6668 != null || this.field9530[this.field9508] == class183.field2405) {
            this.field6676.SetTextureStageState(this.field9508, 24, 0);
            this.field6680[this.field9508] = 0;
            return;
        }
        if (this.field9530[this.field9508] == class525.field7284) {
            this.field6676.SetTransform(this.field9508 + 16, this.field9566[this.field9508].method3081(field6670, 0));
        } else {
            this.field6676.SetTransform(this.field9508 + 16, this.field9566[this.field9508].method3077(field6670, 121));
        }
        int var2 = method2794(this.field9530[this.field9508], (byte) -47);
        if (this.field6680[this.field9508] != var2) {
            this.field6676.SetTextureStageState(this.field9508, 24, var2);
            this.field6680[this.field9508] = var2;
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(Z)V", line = 1030)
    public final void method485(boolean arg0) {
    }

    @OriginalMember(owner = "client!uda", name = "u", descriptor = "(B)V", line = 1033)
    public final void method2789(byte arg0) {
        if (arg0 < -99) {
            this.field6676.method2964(27, this.field9520);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1048)
    public final Object method2790(Canvas arg0, int arg1) {
        if (arg1 <= 83) {
            this.method2805(-93, false, -125, null, -19, 4, 66, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "([Lrf;Z)Leda;", line = 1058)
    public final class110 method2791(class92[] arg0, boolean arg1) {
        return arg1 ? (class110) null : new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "(B)V", line = 1071)
    public final void method2792(byte arg0) {
        float var2 = this.field9543 ? this.field9607 : 0.0F;
        if (arg0 < -55) {
            float var3 = this.field9543 ? -this.field9529 : 0.0F;
            this.field6689.SetDiffuse(this.field9540 * var2, this.field9581 * var2, this.field9532 * var2, 0.0F);
            this.field6690.SetDiffuse(this.field9540 * var3, this.field9581 * var3, this.field9532 * var3, 0.0F);
            this.field6671 = false;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lhg;)V", line = 1084)
    public final void method554(class718 arg0) {
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lwj;IBILg;)Lfk;", line = 1087)
    public final class678 method2793(class415 arg0, int arg1, byte arg2, int arg3, class166 arg4) {
        if (arg2 > -62) {
            this.field6663 = null;
        }
        return new class370(this, arg4, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lvba;B)I", line = 1099)
    private static final int method2794(class45 arg0, byte arg1) {
        if (class151.field2048 == arg0) {
            return 1;
        } else if (class525.field7284 == arg0) {
            return 2;
        } else if (class480.field6741 == arg0) {
            return 3;
        } else if (class222.field2883 == arg0) {
            return 4;
        } else if (class526.field7304 == arg0) {
            return 256;
        } else if (arg1 == -47) {
            return 0;
        } else {
            return 10;
        }
    }

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "(II)V", line = 1128)
    public final void method497(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)Lkm;", line = 1131)
    public final class373 method2795(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field6690 = null;
        }
        return new class402(this, arg1);
    }

    @OriginalMember(owner = "client!uda", name = "A", descriptor = "(I)F", line = 1143)
    public final float method2796(int arg0) {
        int var2 = 59 / ((arg0 - 44) / 41);
        return -0.5F;
    }

    @OriginalMember(owner = "client!uda", name = "S", descriptor = "(I)V", line = 1152)
    public final void method2797(int arg0) {
        this.field6676.method2964(28, this.field9521 && this.field9583 && this.field9569 >= 0);
        if (arg0 != -1) {
            this.field6689 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(IIIID)V", line = 1162)
    public final void method499(int arg0, int arg1, int arg2, int arg3, double arg4) {
    }

    @OriginalMember(owner = "client!uda", name = "eb", descriptor = "(I)V", line = 1166)
    public final void method2798(int arg0) {
        this.field6676.method2964(7, this.field9549);
        if (arg0 >= -61) {
            this.method511();
        }
    }

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "(Z)V", line = 1176)
    public final void method2799(boolean arg0) {
        this.field6676.SetScissorRect(this.field9510 + this.field9522, this.field9536 - -this.field9512, this.field9599, this.field9574);
        if (!arg0) {
            this.method535();
        }
    }

    @OriginalMember(owner = "client!uda", name = "V", descriptor = "(I)V", line = 1186)
    public final void method2800(int arg0) {
        if (arg0 != -25) {
            this.method2814(false, 106, -2, -78, null, -126, 125);
        }
        int var2 = this.field6675[this.field9508] ? method2779(this.field9582[this.field9508], 4) : 1;
        this.field6676.SetTextureStageState(this.field9508, 1, var2);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(FFF)V", line = 1197)
    public final void method549(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "(B)V", line = 1202)
    public final void method2801(byte arg0) {
        this.field6689.SetDirection(-this.field9558[0], -this.field9558[1], -this.field9558[2]);
        this.field6690.SetDirection(-this.field9564[0], -this.field9564[1], -this.field9564[2]);
        int var2 = 127 / ((59 - arg0) / 58);
        this.field6671 = false;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lag;Z)I", line = 1213)
    private static final int method2802(class710 arg0, boolean arg1) {
        if (class177.field2332 == arg0) {
            return 2;
        } else if (class164.field2195 == arg0) {
            return 1;
        } else {
            if (!arg1) {
                createToolkit(null, null, null, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uda", name = "p", descriptor = "(B)V", line = 1234)
    public final void method2803(byte arg0) {
        int var2 = -14 / ((arg0 - 63) / 42);
        if (this.field9605.method213(0)) {
            this.field9504.method3077(field6670, 124);
        } else {
            field6670[12] = 0.0F;
            field6670[1] = 0.0F;
            field6670[13] = 0.0F;
            field6670[3] = 0.0F;
            field6670[9] = 0.0F;
            field6670[8] = 0.0F;
            field6670[6] = 0.0F;
            field6670[11] = 0.0F;
            field6670[4] = 0.0F;
            field6670[2] = 0.0F;
            field6670[15] = 1.0F;
            field6670[7] = 0.0F;
            field6670[10] = 1.0F;
            field6670[0] = 1.0F;
            field6670[5] = 1.0F;
            field6670[14] = 0.0F;
        }
        this.field6676.SetTransform(2, field6670);
    }

    @OriginalMember(owner = "client!uda", name = "L", descriptor = "(I)V", line = 1272)
    public final void method2804(int arg0) {
        for (int var2 = 0; var2 < this.field9547; var2++) {
            this.field6676.SetSamplerState(var2, 7, 0);
            this.field6676.SetSamplerState(var2, 6, 2);
            this.field6676.SetSamplerState(var2, 5, 2);
            this.field6676.SetSamplerState(var2, 1, 1);
            this.field6676.SetSamplerState(var2, 2, 1);
            this.field6687[var2] = class177.field2332;
            this.field6681[var2] = this.field6682[var2] = true;
            this.field6688[var2] = false;
            this.field6680[var2] = 0;
        }
        this.field6676.SetTextureStageState(0, 6, 1);
        if (arg0 != -14214) {
            return;
        }
        this.field6676.SetRenderState(9, 2);
        this.field6676.SetRenderState(23, 4);
        this.field6676.SetRenderState(25, 5);
        this.field6676.SetRenderState(24, 0);
        this.field6676.SetRenderState(22, 2);
        this.field6676.SetRenderState(147, 1);
        this.field6676.SetRenderState(145, 1);
        this.field6676.method2971(38, 0.95F);
        this.field6676.SetRenderState(140, 3);
        this.field6689.SetType(3);
        this.field6690.SetType(3);
        this.field6678.SetType(1);
        this.field6671 = false;
        super.method2804(arg0 ^ 0x0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZI[FIIILg;)Lfk;", line = 1311)
    public final class678 method2805(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class166 arg7) {
        if (arg0 != 2) {
            field6670 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lmq;I)I", line = 1321)
    private static final int method2806(class534 arg0, int arg1) {
        if (arg1 != 3) {
            return -70;
        } else if (class790.field10851 == arg0) {
            return 2;
        } else if (class264.field3887 == arg0) {
            return 0;
        } else if (class417.field6010 == arg0) {
            return 1;
        } else if (class64.field840 == arg0) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "(Z)V", line = 1346)
    public final void method2807(boolean arg0) {
        if (!arg0) {
            int var2 = this.field6675[this.field9508] ? method2779(this.field9509[this.field9508], 4) : 1;
            this.field6676.SetTextureStageState(this.field9508, 4, var2);
        }
    }

    @OriginalMember(owner = "client!uda", name = "A", descriptor = "()Ldca;", line = 1359)
    public final class189 method542() {
        D3DADAPTER_IDENTIFIER var1 = this.field6679.method2952(this.field6685, 0);
        return new class189(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILg;[BIIIIZ)Lfk;", line = 1369)
    public final class678 method2808(int arg0, class166 arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg5 >= -107) {
            this.method2771((byte) 108);
        }
        return new class370(this, arg1, arg4, arg0, arg7, arg2, arg3, arg6);
    }

    @OriginalMember(owner = "client!uda", name = "v", descriptor = "()V", line = 1378)
    public final void method527() {
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(II)Lio;", line = 1381)
    public final class461 method498(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "(II)V", line = 1388)
    public final void method2809(int arg0, int arg1) {
        if (arg1 != 3433) {
            this.method2796(91);
        }
        this.field6676.SetTextureStageState(this.field9508, 11, arg0);
    }

    @OriginalMember(owner = "client!uda", name = "O", descriptor = "(I)V", line = 1398)
    public final void method2810(int arg0) {
        this.field6689.SetAmbient(this.field9579 * this.field9540, this.field9581 * this.field9579, this.field9579 * this.field9532, 0.0F);
        this.field6671 = false;
        if (arg0 != -30427) {
            this.field6686 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V", line = 1412)
    public final void method2811(Canvas arg0, byte arg1, Object arg2) {
        if (this.field9434 == arg0) {
            Dimension var4 = arg0.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field6676.EndScene();
                this.method2767(-16330);
                this.field6676.BeginScene();
            }
        }
        if (arg1 != 67) {
            this.field6682 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lrr;", line = 1437)
    public final class381 method437(int arg0, int arg1) {
        return null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lio;Lrr;)Lhg;", line = 1447)
    public final class718 method461(class461 arg0, class381 arg1) {
        return null;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V", line = 1455)
    public final void method471(int arg0, int arg1) throws class283 {
        this.field6676.EndScene();
        if (this.field6684.method1221(119)) {
            this.field6677 = 0;
            if (class509.method2978(0, this.field6684.method1218(0, -76))) {
                this.method2767(-16330);
            }
        } else if (++this.field6677 <= 50) {
            this.method2767(-16330);
        } else {
            throw new class283();
        }
        this.field6676.BeginScene();
    }

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "(I)V", line = 1482)
    public final synchronized void method533(int arg0) {
        this.field6669.method3813((byte) 95);
        super.method533(arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZLmq;ZI)V", line = 1492)
    public final void method2812(int arg0, boolean arg1, class534 arg2, boolean arg3, int arg4) {
        int var6 = arg4;
        byte var8;
        if (arg0 == 1) {
            var8 = 3;
        } else if (arg0 == 2) {
            var8 = 26;
        } else {
            var8 = 2;
        }
        if (arg3) {
            var6 = arg4 | 0x20;
        }
        if (arg1) {
            var6 |= 0x10;
        }
        this.field6676.SetTextureStageState(this.field9508, var8, method2806(arg2, 3) | var6);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZB)Lra;", line = 1537)
    public final class118 method2813(boolean arg0, byte arg1) {
        if (arg1 > -97) {
            this.method461(null, null);
        }
        return new class266(this, class415.field5987, arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZIII[III)Lfk;", line = 1549)
    public final class678 method2814(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        return arg5 > -88 ? (class678) null : new class370(this, arg3, arg2, arg0, arg4, arg1, arg6);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILoga;)V", line = 1559)
    public final void method2815(int arg0, class499 arg1) {
        this.method2757(arg1, (byte) -97);
        if (!this.field6681[this.field9508]) {
            this.field6676.SetSamplerState(this.field9508, 1, 1);
            this.field6681[this.field9508] = true;
        }
        int var3 = 117 % ((arg0 + 33) / 52);
        if (!this.field6682[this.field9508]) {
            this.field6676.SetSamplerState(this.field9508, 2, 1);
            this.field6682[this.field9508] = true;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BLeda;)V", line = 1581)
    public final void method2816(byte arg0, class110 arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg1;
        if (arg0 > 78) {
            this.field6676.SetVertexDeclaration(var3.field4759);
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(BZ)V", line = 1592)
    public final void method2817(byte arg0, boolean arg1) {
        if (arg0 != 102) {
            this.field6674 = null;
        }
        this.field6676.method2964(161, arg1);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLkm;I)V", line = 1602)
    public final void method2818(boolean arg0, class373 arg1, int arg2) {
        if (!arg0) {
            class402 var4 = (class402) arg1;
            this.field6676.SetStreamSource(arg2, var4.field5731, 0, var4.method2441((byte) 117));
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V", line = 1614)
    public final void method2819(boolean arg0, Canvas arg1, Object arg2) {
        if (!arg0) {
            this.field6673 = false;
        }
        this.field6684 = (class179) arg2;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lcj;Lcj;FLcj;)Lcj;", line = 1624)
    public final class720 method531(class720 arg0, class720 arg1, float arg2, class720 arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIILfga;ILra;)V", line = 1632)
    public final void method2820(int arg0, int arg1, int arg2, int arg3, class269 arg4, int arg5, class118 arg6) {
        if (arg2 != -13847) {
            this.method527();
        }
        this.field6676.SetIndices(((class266) arg6).field3908);
        this.field6676.DrawIndexedPrimitive(method2773(arg4, arg2 ^ 0xFFFFC9E8), 0, arg5, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1651)
    public final void method521(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class283 {
        this.method471(arg2, arg3);
    }

    @OriginalMember(owner = "client!uda", name = "w", descriptor = "()V", line = 1659)
    public final void method535() {
        IDirect3DEventQuery var1 = this.field6676.method2972();
        if (class509.method2977(var1.Issue(), 17527)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method3820(true);
    }

    @OriginalMember(owner = "client!uda", name = "r", descriptor = "(B)V", line = 1682)
    public final void method2821(byte arg0) {
        this.field6676.method2964(137, this.field9601 && !this.field9534);
        if (arg0 != -27) {
            this.method542();
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Ljagdx/IDirect3DPixelShader;I)V", line = 1696)
    public final void method2822(IDirect3DPixelShader arg0, int arg1) {
        if (arg1 != 3) {
            this.method2807(false);
        }
        this.field6676.SetPixelShader(arg0);
    }
}
