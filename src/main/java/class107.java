import jaclib.peer.class336;
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
import jagdx.class670;
import jagdx.class671;
import jagdx.class672;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class107 extends class528 {

    @OriginalMember(owner = "client!ik", name = "Jg", descriptor = "Z")
    private boolean field1596 = false;

    @OriginalMember(owner = "client!ik", name = "vg", descriptor = "I")
    private int field1582 = 0;

    @OriginalMember(owner = "client!ik", name = "Ig", descriptor = "Ljagdx/D3DCAPS;")
    public D3DCAPS field1595;

    @OriginalMember(owner = "client!ik", name = "Rg", descriptor = "Ljaclib/peer/wl;")
    public class336 field1604;

    @OriginalMember(owner = "client!ik", name = "ug", descriptor = "Ljagdx/IDirect3D;")
    private IDirect3D field1581;

    @OriginalMember(owner = "client!ik", name = "tg", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!ik", name = "Tg", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!ik", name = "zg", descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;")
    private D3DPRESENT_PARAMETERS field1586;

    @OriginalMember(owner = "client!ik", name = "Dg", descriptor = "Lnt;")
    private class703 field1590;

    @OriginalMember(owner = "client!ik", name = "Ng", descriptor = "Ljagdx/IDirect3DDevice;")
    public IDirect3DDevice field1600;

    @OriginalMember(owner = "client!ik", name = "Eg", descriptor = "Ljagdx/D3DLIGHT;")
    private class670 field1591;

    @OriginalMember(owner = "client!ik", name = "Hg", descriptor = "Ljagdx/D3DLIGHT;")
    private class670 field1594;

    @OriginalMember(owner = "client!ik", name = "Og", descriptor = "Ljagdx/D3DLIGHT;")
    private class670 field1601;

    @OriginalMember(owner = "client!ik", name = "Bg", descriptor = "Ljagdx/PixelBuffer;")
    public PixelBuffer field1588;

    @OriginalMember(owner = "client!ik", name = "wg", descriptor = "Ljagdx/GeometryBuffer;")
    public GeometryBuffer field1583;

    @OriginalMember(owner = "client!ik", name = "Pg", descriptor = "Z")
    public boolean field1602;

    @OriginalMember(owner = "client!ik", name = "Qg", descriptor = "Z")
    public boolean field1603;

    @OriginalMember(owner = "client!ik", name = "Gg", descriptor = "Z")
    public boolean field1593;

    @OriginalMember(owner = "client!ik", name = "xg", descriptor = "[Lkk;")
    private class238[] field1584;

    @OriginalMember(owner = "client!ik", name = "Kg", descriptor = "[I")
    private int[] field1597;

    @OriginalMember(owner = "client!ik", name = "Lg", descriptor = "[Z")
    private boolean[] field1598;

    @OriginalMember(owner = "client!ik", name = "yg", descriptor = "[Z")
    private boolean[] field1585;

    @OriginalMember(owner = "client!ik", name = "Ag", descriptor = "[Z")
    private boolean[] field1587;

    @OriginalMember(owner = "client!ik", name = "Sg", descriptor = "[Z")
    private boolean[] field1605;

    @OriginalMember(owner = "client!ik", name = "Cg", descriptor = "[I")
    private static int[] field1589 = new int[] { 22, 23 };

    @OriginalMember(owner = "client!ik", name = "Fg", descriptor = "[F")
    private static float[] field1592 = new float[16];

    @OriginalMember(owner = "client!ik", name = "Mg", descriptor = "[I")
    private static int[] field1599 = new int[] { 77, 80 };

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(II)Lwc;", line = 5)
    public final class353 method753(int arg0, int arg1) {
        int var3 = -49 % ((-arg0 - 21) / 51);
        if (arg1 == 3) {
            return new class427(this, this.field7630);
        } else if (arg1 == 4) {
            return new class402(this, this.field7630, this.field7561);
        } else if (arg1 == 8) {
            return new class469(this, this.field7630, this.field7561);
        } else {
            return super.method753(-110, arg1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "()Lpg;", line = 49)
    public final class658 method683() {
        D3DADAPTER_IDENTIFIER var1 = this.field1581.method3752(this.field1580, 0);
        return new class658(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lega;II)V", line = 58)
    public final void method754(class184 arg0, int arg1, int arg2) {
        if (arg2 != 27910) {
            this.method755(null, 122, 99, -101, null, true, -36, -69);
        }
        class429 var4 = (class429) arg0;
        this.field1600.SetStreamSource(arg1, var4.field6255, 0, var4.method2568((byte) -121));
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([FIIILwu;ZII)Lfj;", line = 70)
    public final class75 method755(float[] arg0, int arg1, int arg2, int arg3, class149 arg4, boolean arg5, int arg6, int arg7) {
        if (arg6 != -1) {
            this.field1595 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()V", line = 79)
    public final void method642() {
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILid;ILip;I)V", line = 82)
    public final void method756(int arg0, int arg1, int arg2, class388 arg3, int arg4, class532 arg5, int arg6) {
        if (arg2 != 11897) {
            this.field1591 = null;
        }
        this.field1600.SetIndices(((class140) arg5).field2031);
        this.field1600.DrawIndexedPrimitive(method797(arg3, -87), 0, arg6, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "(I)V", line = 102)
    public final void method757(int arg0) {
        if (this.field1598[this.field7759]) {
            this.field1598[this.field7759] = false;
            this.field1600.SetTexture(this.field7759, null);
            this.method788(9);
            this.method795((byte) -51);
        }
        int var2 = -120 / ((59 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "(I)V", line = 120)
    public final void method758(int arg0) {
        if (arg0 != 18851) {
            this.field1604 = null;
        }
        if (this.field7694[this.field7759] == class42.field619) {
            this.field1600.SetTextureStageState(this.field7759, 24, 0);
            this.field1597[this.field7759] = 0;
            return;
        }
        if (this.field7694[this.field7759] == class22.field404) {
            this.field1600.SetTransform(this.field7759 + 16, this.field7742[this.field7759].method1875(arg0 ^ 0x4FD7, field1592));
        } else {
            this.field1600.SetTransform(this.field7759 + 16, this.field7742[this.field7759].method1880(107, field1592));
        }
        int var2 = method814(-6014, this.field7694[this.field7759]);
        if (this.field1597[this.field7759] != var2) {
            this.field1600.SetTextureStageState(this.field7759, 24, var2);
            this.field1597[this.field7759] = var2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "(B)V", line = 151)
    public final void method759(byte arg0) {
        this.field1600.method3763(28, this.field7743 && this.field7705 && this.field7733 >= 0);
        if (arg0 != 44) {
            this.field1597 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(B)V", line = 161)
    public final void method760(byte arg0) {
        if (arg0 != -3) {
            this.field1595 = null;
        }
        this.field1600.method3763(174, this.field7804);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 171)
    public final void method689(Rectangle[] arg0, int arg1) throws class232 {
        this.method655();
    }

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "(I)V", line = 178)
    public final void method761(int arg0) {
        if (arg0 != 2078023448) {
            this.method812(-96, true, (int[][]) ((int[][]) null), -116);
        }
        this.field1600.method3763(14, this.field7771 && this.field7779);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V", line = 188)
    public final void method762(Canvas arg0, boolean arg1, Object arg2) {
        if (!arg1) {
            this.method795((byte) 0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "(I)V", line = 197)
    public final void method763(int arg0) {
        if (arg0 >= -53) {
            this.method811(null, (byte) 20);
        }
        this.field1600.SetViewport(this.field7699, this.field7750, this.field7583, this.field7570, 0.0F, 1.0F);
    }

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "(I)V", line = 208)
    public final void method764(int arg0) {
        if (arg0 >= -47) {
            this.method807(74);
        }
        this.field1600.method3763(27, this.field7704);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 218)
    public final synchronized void method639(int arg0) {
        this.field1604.method2060(93);
        super.method639(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lrf;B)V", line = 228)
    public final void method765(class157 arg0, byte arg1) {
        int var3 = 0;
        int var4 = 114 / ((-arg1 - 7) / 38);
        if (class287.field3984 == arg0) {
            var3 = 65536;
        } else if (class41.field613 == arg0) {
            var3 = 131072;
        } else if (class457.field6609 == arg0) {
            var3 = 196608;
        }
        this.field1600.SetTextureStageState(this.field7759, 11, this.field7759 | var3);
    }

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "(I)V", line = 250)
    public final void method766(int arg0) {
        if (arg0 != 12) {
            this.field1594 = null;
        }
        if (this.field1596) {
            return;
        }
        this.field1600.LightEnable(0, false);
        this.field1600.LightEnable(1, false);
        this.field1600.SetLight(0, this.field1591);
        this.field1600.SetLight(1, this.field1594);
        this.field1600.LightEnable(0, true);
        this.field1600.LightEnable(1, true);
        this.field1596 = true;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(IZ)V", line = 272)
    public final void method767(int arg0, boolean arg1) {
        if (arg0 == 1) {
            this.field1600.method3763(161, arg1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZLpca;II)V", line = 282)
    public final void method768(boolean arg0, boolean arg1, class529 arg2, int arg3, int arg4) {
        if (arg4 != 3) {
            this.method813(26);
        }
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
        if (arg1) {
            var8 |= 0x10;
        }
        this.field1600.SetTextureStageState(this.field7759, var7, var8 | method773((byte) -7, arg2));
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZIILpca;)V", line = 342)
    public final void method769(boolean arg0, int arg1, int arg2, class529 arg3) {
        byte var6;
        if (arg2 == 1) {
            var6 = 6;
        } else if (arg2 == 2) {
            var6 = 27;
        } else {
            var6 = 5;
        }
        int var7 = 0;
        if (arg1 == -7907) {
            if (arg0) {
                var7 |= 0x10;
            }
            this.field1600.SetTextureStageState(this.field7759, var6, method773((byte) -7, arg3) | var7);
        }
    }

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "()V", line = 375)
    public final void method662() {
    }

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "(I)V", line = 381)
    public final void method770(int arg0) {
        for (int var2 = 0; var2 < this.field7685; var2++) {
            this.field1600.SetSamplerState(var2, 7, 0);
            this.field1600.SetSamplerState(var2, 6, 2);
            this.field1600.SetSamplerState(var2, 5, 2);
            this.field1600.SetSamplerState(var2, 1, 1);
            this.field1600.SetSamplerState(var2, 2, 1);
            this.field1584[var2] = class264.field3448;
            this.field1605[var2] = this.field1587[var2] = true;
            this.field1585[var2] = false;
            this.field1597[var2] = 0;
        }
        this.field1600.SetTextureStageState(0, 6, 1);
        this.field1600.SetRenderState(9, 2);
        this.field1600.SetRenderState(23, 4);
        this.field1600.SetRenderState(25, 5);
        this.field1600.SetRenderState(24, 0);
        this.field1600.SetRenderState(22, 2);
        this.field1600.SetRenderState(147, 1);
        this.field1600.SetRenderState(145, 1);
        this.field1600.method3771(38, 0.95F);
        this.field1600.SetRenderState(140, 3);
        this.field1591.SetType(3);
        this.field1594.SetType(3);
        this.field1601.SetType(1);
        this.field1596 = false;
        super.method770(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lrs;Lrs;FLrs;)Lrs;", line = 419)
    public final class649 method707(class649 arg0, class649 arg1, float arg2, class649 arg3) {
        return (arg2 < 0.5F) ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "()Z", line = 426)
    public final boolean method650() {
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/wl;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lnt;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Lfa;Lmv;I)V", line = 432)
    private class107(int arg0, int arg1, Canvas arg2, class336 arg3, IDirect3D arg4, IDirect3DDevice arg5, class703 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class615 arg9, class295 arg10, int arg11) {
        super(arg2, arg6, arg9, arg10, arg11, 0);
        this.field1595 = arg8;
        this.field1604 = arg3;
        this.field1581 = arg4;
        this.field1580 = arg0;
        this.field1606 = arg1;
        this.field1586 = arg7;
        this.field1590 = arg6;
        this.field1600 = arg5;
        this.field1591 = new class670(this.field1604);
        this.field1594 = new class670(this.field1604);
        this.field1601 = new class670(this.field1604);
        this.field1588 = new PixelBuffer(this.field1604);
        this.field1583 = new GeometryBuffer(this.field1604);
        new GeometryBuffer(this.field1604);
        this.field7696 = this.field1595.MaxActiveLights > 0 ? this.field1595.MaxActiveLights : 8;
        this.field7721 = (this.field1595.TextureCaps & 0x800) != 0;
        this.field1602 = (this.field1595.TextureCaps & 0x2) == 0;
        this.field1603 = (this.field1595.TextureCaps & 0x10000) != 0;
        this.field1593 = (this.field1595.TextureCaps & 0x4000) != 0;
        this.field7774 = (this.field1595.TextureCaps & 0x2000) != 0;
        this.field7685 = this.field1595.MaxSimultaneousTextures;
        this.field7769 = this.field7719 > 0 || this.field1581.CheckDeviceMultiSampleType(this.field1580, this.field1606, this.field1586.BackBufferFormat, true, 2) == 0;
        this.field1584 = new class238[this.field7685];
        this.field1597 = new int[this.field7685];
        this.field1598 = new boolean[this.field7685];
        this.field1585 = new boolean[this.field7685];
        this.field1587 = new boolean[this.field7685];
        this.field1605 = new boolean[this.field7685];
        this.field1600.BeginScene();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;IB)Z", line = 475)
    private static final boolean method771(int arg0, int arg1, D3DPRESENT_PARAMETERS arg2, IDirect3D arg3, int arg4, byte arg5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            int var10 = -91 / ((59 - arg5) / 50);
            if (class672.method3776(arg3.method3754(arg0, var9), (byte) 86)) {
                return false;
            }
            label80: while (arg4 >= 0) {
                if (arg4 != 1) {
                    var8 = arg4;
                    for (int var11 = 0; var11 < field1589.length; var11++) {
                        if (arg3.CheckDeviceType(arg0, arg1, var9.Format, field1589[var11], true) == 0 && arg3.CheckDeviceFormat(arg0, arg1, var9.Format, 1, 1, field1589[var11]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg1, field1589[var11], true, var8) == 0)) {
                            for (int var12 = 0; var12 < field1599.length; var12++) {
                                if (arg3.CheckDeviceFormat(arg0, arg1, var9.Format, 2, 1, field1599[var12]) == 0 && arg3.CheckDepthStencilMatch(arg0, arg1, var9.Format, field1589[var11], field1599[var12]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg1, field1599[var11], true, var8) == 0)) {
                                    var6 = field1599[var12];
                                    var7 = field1589[var11];
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
            arg2.MultiSampleQuality = 0;
            arg2.AutoDepthStencilFormat = var6;
            arg2.MultiSampleType = var8;
            arg2.BackBufferFormat = var7;
            return true;
        } catch (Throwable var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 579)
    public final Object method772(Canvas arg0, byte arg1) {
        int var3 = 111 / ((56 - arg1) / 48);
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLpca;)I", line = 587)
    private static final int method773(byte arg0, class529 arg1) {
        if (arg0 != -7) {
            return 96;
        } else if (class283.field3777 == arg1) {
            return 2;
        } else if (class443.field6428 == arg1) {
            return 0;
        } else if (class11.field273 == arg1) {
            return 1;
        } else if (class475.field6812 == arg1) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "(B)V", line = 612)
    public final void method774(byte arg0) {
        if (this.field7702.method2007(-48)) {
            this.field7679.method1875(1652, field1592);
        } else {
            field1592[4] = 0.0F;
            field1592[10] = 1.0F;
            field1592[2] = 0.0F;
            field1592[0] = 1.0F;
            field1592[1] = 0.0F;
            field1592[15] = 1.0F;
            field1592[11] = 0.0F;
            field1592[9] = 0.0F;
            field1592[14] = 0.0F;
            field1592[12] = 0.0F;
            field1592[13] = 0.0F;
            field1592[8] = 0.0F;
            field1592[5] = 1.0F;
            field1592[6] = 0.0F;
            field1592[3] = 0.0F;
            field1592[7] = 0.0F;
        }
        this.field1600.SetTransform(2, field1592);
        if (arg0 != 119) {
            this.field1596 = true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "()V", line = 649)
    public final void method697() {
        this.field1604.method2058(-120);
        super.method697();
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(Z)V", line = 658)
    public final void method775(boolean arg0) {
        this.field7692 = (this.field7731 - this.field7746);
        this.field7778 = (float) (-this.field7733) + this.field7692;
        if (this.field7778 < (float) this.field7738) {
            this.field7778 = this.field7738;
        }
        this.field1600.method3771(36, this.field7778);
        this.field1600.method3771(37, this.field7692);
        this.field1600.SetRenderState(34, this.field7782);
        if (arg0) {
            this.method807(-109);
        }
    }

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "(B)V", line = 677)
    public final void method776(byte arg0) {
        this.field1600.SetRenderState(60, this.field7730);
        if (arg0 != 105) {
            this.field1587 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lwk;I)V", line = 687)
    public final void method777(class228 arg0, int arg1) {
        this.method801(arg0, 0);
        if (arg0.field3032 != this.field1605[this.field7759]) {
            this.field1600.SetSamplerState(this.field7759, 1, arg0.field3032 ? 1 : 3);
            this.field1605[this.field7759] = arg0.field3032;
        }
        if (this.field1587[this.field7759] != arg0.field3030) {
            this.field1600.SetSamplerState(this.field7759, 2, arg0.field3030 ? 1 : 3);
            this.field1587[this.field7759] = arg0.field3030;
        }
        if (arg1 != 22008) {
            this.method816((byte) 8);
        }
    }

    @OriginalMember(owner = "client!ik", name = "ya", descriptor = "()V", line = 712)
    public final void method638() {
        this.method3056(true, (byte) 105);
        this.field1600.Clear(2, 0, 1.0F, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lid;IBI)V", line = 722)
    public final void method778(class388 arg0, int arg1, byte arg2, int arg3) {
        this.field1600.DrawPrimitive(method797(arg0, -87), arg3, arg1);
        if (arg2 <= -92) {
            ;
        }
    }

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "(Z)V", line = 737)
    public final void method779(boolean arg0) {
        float var2 = this.field7723 ? this.field7741 : 0.0F;
        float var3 = this.field7723 ? -this.field7772 : 0.0F;
        this.field1591.SetDiffuse(this.field7776 * var2, this.field7737 * var2, this.field7734 * var2, 0.0F);
        this.field1594.SetDiffuse(this.field7776 * var3, this.field7737 * var3, this.field7734 * var3, 0.0F);
        this.field1596 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lwu;Lbk;I)Z", line = 750)
    public final boolean method780(class149 arg0, class106 arg1, int arg2) {
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        int var5 = -15 % ((arg2 + 11) / 60);
        return class672.method3775(this.field1581.method3754(this.field1580, var4), 10067) && class672.method3775(this.field1581.CheckDeviceFormat(this.field1580, this.field1606, var4.Format, 0, 3, method810(arg0, arg1, 22)), 10067);
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(IIII)[I", line = 762)
    public final int[] method702(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        IDirect3DSurface var6 = this.field1600.method3772(0);
        IDirect3DSurface var7 = this.field1600.method3762(arg2, arg3, 21, 0, 0, true);
        if (class672.method3775(this.field1600.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 10067) && class672.method3775(var7.LockRect(0, 0, arg2, arg3, 16, this.field1588), 10067)) {
            var5 = new int[arg2 * arg3];
            int var8 = this.field1588.getRowPitch();
            if (arg2 * 4 == var8) {
                this.field1588.method3749(var5, 0, 0, arg2 * arg3);
            } else {
                for (int var9 = 0; var9 < arg3; var9++) {
                    this.field1588.method3749(var5, arg2 * var9, var8 * var9, arg2);
                }
            }
            var7.UnlockRect();
        }
        var6.method2063((byte) -127);
        var7.method2063((byte) 42);
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ldm;I)Lcl;", line = 802)
    public final class314 method781(class680[] arg0, int arg1) {
        return arg1 > -35 ? (class314) null : new dxVertexLayout(this, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "(I)V", line = 814)
    public final void method782(int arg0) {
        this.method779(false);
        if (arg0 == 0) {
            this.method766(12);
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(Z)V", line = 828)
    public final void method783(boolean arg0) {
        if (!arg0) {
            this.field1600.method3763(15, this.field7683);
        }
    }

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "(I)F", line = 838)
    public final float method784(int arg0) {
        return arg0 == 128 ? -0.5F : 0.1280497F;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V", line = 850)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILwu;BLbk;I)Lfj;", line = 853)
    public final class75 method785(int arg0, class149 arg1, byte arg2, class106 arg3, int arg4) {
        return arg2 >= -57 ? (class75) null : new class228(this, arg1, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "(I)V", line = 864)
    public final void method786(int arg0) {
        if (arg0 != 28149) {
            field1592 = null;
        }
        this.field1600.SetScissorRect(this.field7699 + this.field7758, this.field7781 + this.field7750, this.field7755, this.field7700);
    }

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "(B)V", line = 876)
    public final void method787(byte arg0) {
        this.field1591.SetDirection(-this.field7747[0], -this.field7747[1], -this.field7747[2]);
        this.field1594.SetDirection(-this.field7768[0], -this.field7768[1], -this.field7768[2]);
        if (arg0 >= 122) {
            this.field1596 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "(I)V", line = 892)
    public final void method788(int arg0) {
        int var2 = this.field1598[this.field7759] ? method796(this.field7726[this.field7759], 109) : 1;
        if (arg0 != 9) {
            this.method681();
        }
        this.field1600.SetTextureStageState(this.field7759, 4, var2);
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V", line = 903)
    public final void method789(int arg0) {
        this.field1591.SetAmbient(this.field7777 * this.field7776, this.field7777 * this.field7737, this.field7777 * this.field7734, 0.0F);
        this.field1596 = false;
        if (arg0 >= -32) {
            this.field1582 = 112;
        }
    }

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "(I)V", line = 919)
    public final void method790(int arg0) {
        int var2 = -97 / ((11 - arg0) / 51);
        int var3;
        for (var3 = 0; var3 < this.field7745; var3++) {
            class334 var4 = this.field7687[var3];
            int var5 = var3 + 2;
            int var6 = var4.method2049(0);
            float var7 = var4.method2053((byte) 116) / 255.0F;
            this.field1601.SetPosition((float) var4.method2050((byte) -46), (float) var4.method2045(0), (float) var4.method2046(true));
            this.field1601.SetDiffuse((float) ((var6 & 0xFFE875) >> 16) * var7, (float) ((var6 & 0xFFD1) >> 8) * var7, (float) (var6 & 0xFF) * var7, 0.0F);
            this.field1601.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (var4.method2051(-520326527) * var4.method2051(-520326527)));
            this.field1601.SetRange((float) var4.method2051(-520326527));
            this.field1600.SetLight(var5, this.field1601);
            this.field1600.LightEnable(var5, true);
        }
        while (var3 < this.field7712) {
            this.field1600.LightEnable(var3 + 2, false);
            var3++;
        }
        super.method790(-59);
    }

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "(I)Z", line = 955)
    private final boolean method791(int arg0) {
        if (arg0 != 5) {
            this.field1582 = 9;
        }
        int var2 = this.field1600.TestCooperativeLevel();
        if (var2 == 0 || var2 == -2005530519) {
            class703 var3 = (class703) this.field7553;
            this.method3052(121);
            var3.method3937(-79);
            this.field1586.BackBufferWidth = 0;
            this.field1586.BackBufferHeight = 0;
            if (method771(this.field1580, this.field1606, this.field1586, this.field1581, this.field7719, (byte) -5)) {
                int var4 = this.field1600.Reset(this.field1586);
                if (class672.method3775(var4, 10067)) {
                    var3.method3938(this.field1600.method3758(0), this.field1600.method3768(), (byte) 117);
                    this.method3054(true);
                    this.method770(128);
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 995)
    public final void method792(Object arg0, Canvas arg1, int arg2) {
        this.field1590 = (class703) arg0;
        if (arg2 != -6399) {
            this.field1593 = true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([IIIIZII)Lfj;", line = 1005)
    public final class75 method793(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 != 4595) {
            this.method806(38, false);
        }
        return new class228(this, arg2, arg6, arg4, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lbk;ILwu;)Z", line = 1016)
    public final boolean method794(class106 arg0, int arg1, class149 arg2) {
        if (arg1 >= -109) {
            this.method702(-113, -94, 1, 105);
        }
        D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
        return class672.method3775(this.field1581.method3754(this.field1580, var4), 10067) && class672.method3775(this.field1581.CheckDeviceFormat(this.field1580, this.field1606, var4.Format, 0, 4, method810(arg2, arg0, 22)), 10067);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lf;Z)V", line = 1026)
    public final void method673(class256 arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V", line = 1030)
    public final void method795(byte arg0) {
        int var2 = this.field1598[this.field7759] ? method796(this.field7744[this.field7759], 86) : 1;
        this.field1600.SetTextureStageState(this.field7759, 1, var2);
        if (arg0 > -30) {
            this.method681();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lnw;I)I", line = 1041)
    private static final int method796(class619 arg0, int arg1) {
        if (class519.field7276 == arg0) {
            return 2;
        } else if (class492.field6998 == arg0) {
            return 4;
        } else if (class481.field6884 == arg0) {
            return 26;
        } else if (class65.field1041 == arg0) {
            return 7;
        } else if (class444.field6451 == arg0) {
            return 10;
        } else {
            if (arg1 <= 80) {
                field1589 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lid;I)I", line = 1071)
    private static final int method797(class388 arg0, int arg1) {
        if (arg1 >= -28) {
            method803(null, false);
        }
        if (class533.field7844 == arg0) {
            return 2;
        } else if (class454.field6543 == arg0) {
            return 3;
        } else if (class148.field2099 == arg0) {
            return 1;
        } else if (class433.field6280 == arg0) {
            return 4;
        } else if (class223.field2949 == arg0) {
            return 6;
        } else if (class143.field2066 == arg0) {
            return 5;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFF)V", line = 1103)
    public final void method619(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V", line = 1106)
    public final void method713(boolean arg0) {
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(B)V", line = 1109)
    public final void method798(byte arg0) {
        if (this.field7645) {
            field1592[6] = 0.0F;
            field1592[0] = 1.0F;
            field1592[2] = 0.0F;
            field1592[8] = 0.0F;
            field1592[9] = 0.0F;
            field1592[5] = 1.0F;
            field1592[13] = 0.0F;
            field1592[15] = 1.0F;
            field1592[4] = 0.0F;
            field1592[1] = 0.0F;
            field1592[10] = 1.0F;
            field1592[7] = 0.0F;
            field1592[12] = 0.0F;
            field1592[3] = 0.0F;
            field1592[14] = 0.0F;
            field1592[11] = 0.0F;
        } else {
            this.field7650.method1875(1652, field1592);
        }
        this.field1600.SetTransform(256, field1592);
        if (arg0 != 118) {
            this.method646(-92);
        }
    }

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "(I)V", line = 1146)
    public final void method799(int arg0) {
        if (arg0 != 0) {
            this.method805(null, null, false, -9, 28, -57, 112, -56);
        }
        this.field1600.method3763(7, this.field7701);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Lip;", line = 1156)
    public final class532 method800(boolean arg0, int arg1) {
        return arg1 == -25475 ? new class140(this, class106.field1574, arg0) : (class532) null;
    }

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "()V", line = 1165)
    public final void method676() {
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Llda;I)V", line = 1169)
    public final void method801(class459 arg0, int arg1) {
        this.field1600.SetTexture(this.field7759, arg0.method1214(-59));
        if (arg1 != 0) {
            this.method799(25);
        }
        if (this.field1584[this.field7759] != arg0.field6620) {
            int var3 = method803(arg0.field6620, false);
            this.field1600.SetSamplerState(this.field7759, 6, var3);
            this.field1600.SetSamplerState(this.field7759, 5, var3);
            this.field1584[this.field7759] = arg0.field6620;
            if (arg0.field6621 != this.field1585[this.field7759]) {
                this.field1600.SetSamplerState(this.field7759, 7, arg0.field6621 ? method803(arg0.field6620, false) : 0);
                this.field1585[this.field7759] = arg0.field6621;
            }
        } else if (this.field1585[this.field7759] != arg0.field6621) {
            this.field1600.SetSamplerState(this.field7759, 7, arg0.field6621 ? method803(arg0.field6620, false) : 0);
            this.field1585[this.field7759] = arg0.field6621;
        }
        if (!this.field1598[this.field7759]) {
            this.field1598[this.field7759] = true;
            this.method788(9);
            this.method795((byte) -56);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILwu;I[BI)Ljf;", line = 1209)
    public final class695 method802(int arg0, int arg1, class149 arg2, int arg3, byte[] arg4, int arg5) {
        if (arg0 <= 89) {
            this.field1580 = 108;
        }
        return new class681(this, arg2, arg3, arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lkk;Z)I", line = 1219)
    private static final int method803(class238 arg0, boolean arg1) {
        if (arg1) {
            field1599 = null;
        }
        if (class264.field3448 == arg0) {
            return 2;
        } else if (class81.field1300 == arg0) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "()V", line = 1236)
    public final void method653() {
    }

    @OriginalMember(owner = "client!ik", name = "createToolkit", descriptor = "(Ljava/awt/Canvas;Lfa;Lmv;Ljava/lang/Integer;)Lr;", line = 1243)
    public static final class98 createToolkit(Canvas arg0, class615 arg1, class295 arg2, Integer arg3) {
        class107 var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            class336 var7 = new class336();
            IDirect3D var8 = IDirect3D.method3755(-2147483616, var7);
            D3DCAPS var9 = var8.method3753(var5, var6);
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
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & 0x20 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if ((var9.DestBlendCaps & 0x2 & var9.SrcBlendCaps) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                if (!method771(var5, var6, var10, var8, arg3, (byte) 124)) {
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
                    var13 = var8.method3756(var5, var6, arg0, var11 | 0x40, var10);
                } catch (class671 var17) {
                    var13 = var8.method3756(var5, var6, arg0, var11 | 0x20, var10);
                }
                class703 var15 = new class703(var13.method3758(0), var13.method3768());
                var4 = new class107(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                var4.method3010(-6343);
                return var4;
            }
        } catch (RuntimeException var18) {
            if (var4 != null) {
                var4.method697();
            }
            throw var18;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ZI)V", line = 1344)
    public final void method804(boolean arg0, int arg1) {
        if (!arg0) {
            field1599 = null;
        }
        this.field1600.SetTextureStageState(this.field7759, 11, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([BLwu;ZIIIII)Lfj;", line = 1356)
    public final class75 method805(byte[] arg0, class149 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        return arg7 == 1 ? new class228(this, arg1, arg5, arg3, arg2, arg0, arg6, arg4) : (class75) null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)Lega;", line = 1366)
    public final class184 method806(int arg0, boolean arg1) {
        if (arg0 != 10) {
            this.method761(43);
        }
        return new class429(this, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "(I)V", line = 1377)
    public final void method807(int arg0) {
        int var2 = -74 % ((arg0 + 22) / 36);
        if (class378.field5670 == this.field7713) {
            this.field1600.SetRenderState(19, 5);
            this.field1600.SetRenderState(20, 6);
        } else if (class284.field3792 == this.field7713) {
            this.field1600.SetRenderState(19, 2);
            this.field1600.SetRenderState(20, 2);
        } else if (class229.field3043 == this.field7713) {
            this.field1600.SetRenderState(19, 9);
            this.field1600.SetRenderState(20, 2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "()V", line = 1404)
    public final void method655() throws class232 {
        this.field1600.EndScene();
        if (this.field1590.method3940(false)) {
            this.field1582 = 0;
            if (class672.method3776(this.field1590.method3939(-26, 0), (byte) 77)) {
                this.method791(5);
            }
        } else if ((++this.field1582) <= 50) {
            this.method791(5);
        } else {
            throw new class232();
        }
        this.field1600.BeginScene();
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(B)V", line = 1427)
    public final void method808(byte arg0) {
        if (arg0 < 52) {
            this.field1584 = null;
        }
        this.field1600.method3763(137, this.field7693 && !this.field7716);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 1438)
    public final void method809(Canvas arg0, int arg1, Object arg2) {
        if (this.field7493 == arg0) {
            Dimension var4 = arg0.getSize();
            if (var4.width > 0 && var4.height > 0) {
                this.field1600.EndScene();
                this.method791(5);
                this.field1600.BeginScene();
            }
        }
        if (arg1 != 8) {
            this.field1604 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "()Z", line = 1464)
    public final boolean method705() {
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lwu;Lbk;I)I", line = 1471)
    public static final int method810(class149 arg0, class106 arg1, int arg2) {
        if (arg2 != 22) {
            return 23;
        }
        if (class106.field1573 == arg1) {
            if (class348.field5157 == arg0) {
                return 22;
            }
            if (class564.field8245 == arg0) {
                return 21;
            }
            if (class592.field8601 == arg0) {
                return 28;
            }
            if (class145.field2081 == arg0) {
                return 50;
            }
            if (class579.field8409 == arg0) {
                return 51;
            }
            if (class545.field8041 == arg0) {
                return 77;
            }
        }
        throw new IllegalArgumentException("");
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lcl;B)V", line = 1511)
    public final void method811(class314 arg0, byte arg1) {
        dxVertexLayout var3 = (dxVertexLayout) arg0;
        int var4 = 78 % ((25 - arg1) / 57);
        this.field1600.SetVertexDeclaration(var3.field9621);
    }

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "()V", line = 1522)
    public final void method681() {
        IDirect3DEventQuery var1 = this.field1600.method3767();
        if (class672.method3775(var1.Issue(), 10067)) {
            while (true) {
                int var2 = var1.IsSignaled();
                if (var2 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        var1.method2063((byte) 87);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ[[II)Lap;", line = 1552)
    public final class447 method812(int arg0, boolean arg1, int[][] arg2, int arg3) {
        return arg0 == 1 ? new class179(this, arg3, arg1, arg2) : (class447) null;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V", line = 1562)
    public final void method813(int arg0) {
        if (arg0 != 28790) {
            field1599 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "ja", descriptor = "(I)V", line = 1572)
    public final void method646(int arg0) {
        this.field1600.Clear(1, arg0, 0.0F, 0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILvf;)I", line = 1579)
    private static final int method814(int arg0, class87 arg1) {
        if (arg0 != -6014) {
            return 109;
        } else if (class183.field2512 == arg1) {
            return 1;
        } else if (class635.field9152 == arg1) {
            return 2;
        } else if (class677.field9586 == arg1) {
            return 3;
        } else if (class22.field404 == arg1) {
            return 4;
        } else if (class367.field5373 == arg1) {
            return 256;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLit;)V", line = 1608)
    public final void method815(byte arg0, class681 arg1) {
        this.method801(arg1, 0);
        int var3 = 41 % ((arg0 + 70) / 39);
        if (!this.field1605[this.field7759]) {
            this.field1600.SetSamplerState(this.field7759, 1, 1);
            this.field1605[this.field7759] = true;
        }
        if (!this.field1587[this.field7759]) {
            this.field1600.SetSamplerState(this.field7759, 2, 1);
            this.field1587[this.field7759] = true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "(B)V", line = 1633)
    public final void method816(byte arg0) {
        this.field1600.SetTransform(3, this.field7735);
        int var2 = -21 / ((arg0 - 61) / 49);
    }

    @OriginalMember(owner = "client!ik", name = "DA", descriptor = "()I", line = 1644)
    public final int method666() {
        return 0;
    }
}
