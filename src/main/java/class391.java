import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class391 extends class626 {

    @OriginalMember(owner = "client!pa", name = "Yg", descriptor = "Ltm;")
    private class412 field5698 = new class412();

    @OriginalMember(owner = "client!pa", name = "Wh", descriptor = "Ltm;")
    private class412 field5748 = new class412();

    @OriginalMember(owner = "client!pa", name = "ni", descriptor = "Ltm;")
    private class412 field5765 = new class412();

    @OriginalMember(owner = "client!pa", name = "vi", descriptor = "Ltm;")
    private class412 field5773 = new class412();

    @OriginalMember(owner = "client!pa", name = "wi", descriptor = "Ltm;")
    private class412 field5774 = new class412();

    @OriginalMember(owner = "client!pa", name = "xi", descriptor = "Ltm;")
    private class412 field5775 = new class412();

    @OriginalMember(owner = "client!pa", name = "yi", descriptor = "Ltm;")
    private class412 field5776 = new class412();

    @OriginalMember(owner = "client!pa", name = "Di", descriptor = "[Luw;")
    private class440[] field5781 = new class440[16];

    @OriginalMember(owner = "client!pa", name = "Gi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5784 = new MapBuffer();

    @OriginalMember(owner = "client!pa", name = "Ii", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5786 = new MapBuffer();

    @OriginalMember(owner = "client!pa", name = "Ti", descriptor = "I")
    private int field5797 = 0;

    @OriginalMember(owner = "client!pa", name = "Sh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5744;

    @OriginalMember(owner = "client!pa", name = "Ji", descriptor = "Ljava/lang/String;")
    private String field5787;

    @OriginalMember(owner = "client!pa", name = "Ri", descriptor = "Ljava/lang/String;")
    private String field5795;

    @OriginalMember(owner = "client!pa", name = "Ki", descriptor = "I")
    private int field5788;

    @OriginalMember(owner = "client!pa", name = "Li", descriptor = "Z")
    public boolean field5789;

    @OriginalMember(owner = "client!pa", name = "Ui", descriptor = "Z")
    private boolean field5798;

    @OriginalMember(owner = "client!pa", name = "Si", descriptor = "Z")
    private boolean field5796;

    @OriginalMember(owner = "client!pa", name = "Mi", descriptor = "Z")
    public boolean field5790;

    @OriginalMember(owner = "client!pa", name = "Ni", descriptor = "Z")
    public boolean field5791;

    @OriginalMember(owner = "client!pa", name = "Qi", descriptor = "Z")
    public boolean field5794;

    @OriginalMember(owner = "client!pa", name = "Pi", descriptor = "[I")
    public int[] field5793;

    @OriginalMember(owner = "client!pa", name = "Oi", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!pa", name = "ji", descriptor = "[Ltf;")
    public static class312[] field5761 = new class312[37];

    @OriginalMember(owner = "client!pa", name = "pi", descriptor = "[[F")
    public static float[][] field5767 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!pa", name = "Dg", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!pa", name = "Eg", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!pa", name = "Fg", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!pa", name = "Gg", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!pa", name = "Hg", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!pa", name = "Ig", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!pa", name = "Jg", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!pa", name = "Kg", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!pa", name = "Lg", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!pa", name = "Mg", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!pa", name = "Ng", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!pa", name = "Og", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!pa", name = "Pg", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!pa", name = "Qg", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!pa", name = "Rg", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!pa", name = "Sg", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!pa", name = "Tg", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!pa", name = "Ug", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!pa", name = "Vg", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!pa", name = "Wg", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!pa", name = "Xg", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!pa", name = "Zg", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!pa", name = "ah", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!pa", name = "bh", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!pa", name = "ch", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!pa", name = "dh", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!pa", name = "eh", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!pa", name = "fh", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!pa", name = "gh", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!pa", name = "hh", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!pa", name = "ih", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!pa", name = "jh", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!pa", name = "kh", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!pa", name = "lh", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!pa", name = "mh", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!pa", name = "nh", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!pa", name = "ph", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!pa", name = "qh", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!pa", name = "rh", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!pa", name = "sh", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!pa", name = "th", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!pa", name = "uh", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!pa", name = "vh", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!pa", name = "wh", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!pa", name = "xh", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!pa", name = "yh", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!pa", name = "zh", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!pa", name = "Ah", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!pa", name = "Bh", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!pa", name = "Ch", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!pa", name = "Dh", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!pa", name = "Eh", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!pa", name = "Fh", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!pa", name = "Gh", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!pa", name = "Hh", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!pa", name = "Ih", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!pa", name = "Jh", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!pa", name = "Kh", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!pa", name = "Lh", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!pa", name = "Mh", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!pa", name = "Nh", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!pa", name = "Oh", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!pa", name = "Ph", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!pa", name = "Qh", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!pa", name = "Rh", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!pa", name = "Th", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!pa", name = "Uh", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!pa", name = "Vh", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!pa", name = "Xh", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!pa", name = "Yh", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!pa", name = "Zh", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!pa", name = "ai", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!pa", name = "bi", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!pa", name = "ci", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!pa", name = "di", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!pa", name = "ei", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!pa", name = "fi", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!pa", name = "gi", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!pa", name = "hi", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!pa", name = "ii", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!pa", name = "ki", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!pa", name = "li", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!pa", name = "mi", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!pa", name = "oi", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!pa", name = "qi", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!pa", name = "ri", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!pa", name = "si", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!pa", name = "ti", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!pa", name = "ui", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!pa", name = "Ei", descriptor = "I")
    private int field5782;

    @OriginalMember(owner = "client!pa", name = "Bi", descriptor = "J")
    private long field5779;

    @OriginalMember(owner = "client!pa", name = "oh", descriptor = "Lvr;")
    public static class147 field5714;

    @OriginalMember(owner = "client!pa", name = "zi", descriptor = "Z")
    private boolean field5777;

    @OriginalMember(owner = "client!pa", name = "Ai", descriptor = "Z")
    private boolean field5778;

    @OriginalMember(owner = "client!pa", name = "Ci", descriptor = "Z")
    private boolean field5780;

    @OriginalMember(owner = "client!pa", name = "Fi", descriptor = "Z")
    private boolean field5783;

    @OriginalMember(owner = "client!pa", name = "Hi", descriptor = "Z")
    private boolean field5785;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "(B)V")
    public final void method882(byte arg0) {
        ++field5762;
        int var2 = -107 / ((arg0 - -18) / 37);
        if (class647.field8982 == super.field8649) {
            OpenGL.glBlendFunc(770, 771);
        } else {
            if (class94.field1341 != super.field8649) {
                if (class705.field9871 == super.field8649) {
                    OpenGL.glBlendFunc(774, 1);
                    return;
                }
            } else {
                OpenGL.glBlendFunc(1, 1);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "()V")
    public final void method568() {
        ++field5690;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)Ltq;")
    public final class656 method536(int arg0, int arg1) {
        ++field5750;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)Loh;")
    public final class427 method908(int arg0, boolean arg1) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field5710;
            return new class555(this, class258.field3848, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method878(int arg0, Canvas arg1, Object arg2) {
        ++field5681;
        Long var4 = (Long) arg2;
        this.field5744.releaseSurface(arg1, var4);
        if (arg0 <= 92) {
            this.field5783 = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZI[[I)Lfn;")
    public final class149 method869(byte arg0, boolean arg1, int arg2, int[][] arg3) {
        if (arg0 <= 92) {
            this.method858(-13, (float[]) null, (class787) null, 43, -102, 68, 61, true);
        }
        ++field5683;
        return new class477(this, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "(II)V")
    public final void method492(int arg0, int arg1) {
        ++field5704;
    }

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "(B)V")
    public final void method903(byte arg0) {
        if (super.field8648 && super.field8670 && ~super.field8721 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 82) {
            this.field5781 = null;
        }
        ++field5685;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lnc;B)V")
    public final void method913(class26 arg0, byte arg1) {
        ++field5751;
        class357[] var3 = ((class618) arg0).field8332;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        if (arg1 != -63) {
            field5714 = null;
        }
        for (int var8 = 0; var3.length > var8; ++var8) {
            class357 var11 = var3[var8];
            class440 var12 = this.field5781[var8];
            int var13 = 0;
            int var14 = var12.method2644(-57);
            long var15 = var12.method3579(127);
            var12.method3573(arg1 + 109);
            for (int var17 = 0; var17 < var11.method2250((byte) 121); ++var17) {
                class542 var18 = var11.method2245(var17, -4814);
                if (class542.field7354 != var18) {
                    if (class542.field7358 == var18) {
                        OpenGL.glNormalPointer(5126, var14, var15 - -((long) var13));
                        var6 = true;
                    } else if (class542.field7363 != var18) {
                        if (class542.field7364 == var18) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                        } else if (class542.field7365 != var18) {
                            if (class542.field7366 != var18) {
                                if (class542.field7367 == var18) {
                                    OpenGL.glClientActiveTexture(33984 - -(var4++));
                                    OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                                }
                            } else {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, var14, var15 - -((long) var13));
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                        var5 = true;
                    }
                } else {
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                    var7 = true;
                }
                var13 += var18.field7355;
            }
        }
        if (this.field5780 != var7) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field5780 = var7;
        }
        if (var6 == !this.field5785) {
            if (!var6) {
                OpenGL.glDisableClientState(32885);
            } else {
                OpenGL.glEnableClientState(32885);
            }
            this.field5785 = var6;
        }
        if (this.field5783 == !var5) {
            if (!var5) {
                OpenGL.glDisableClientState(32886);
            } else {
                OpenGL.glEnableClientState(32886);
            }
            this.field5783 = var5;
        }
        if (~var4 < ~this.field5782) {
            for (int var9 = this.field5782; var4 > var9; ++var9) {
                OpenGL.glClientActiveTexture(var9 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field5782 = var4;
        } else if (~var4 > ~this.field5782) {
            for (int var10 = var4; var10 < this.field5782; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glDisableClientState(32888);
            }
            this.field5782 = var4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
    public final synchronized void method2475(int arg0, byte arg1) {
        int var3 = 41 / ((arg1 - 54) / 51);
        ++field5711;
        class101 var4 = new class101();
        var4.field1409 = (long) arg0;
        this.field5775.method2545(-128, var4);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLsw;II[BIII)Lec;")
    public final class248 method873(boolean arg0, class787 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 8) {
            this.method897(103);
        }
        ++field5709;
        if (!this.field5796 && (!class117.method957(arg5 + -6610, arg6) || !class117.method957(-6602, arg2))) {
            if (!this.field5798) {
                class339 var9 = new class339(this, arg1, class258.field3847, class719.method4014(arg6, (byte) -100), class719.method4014(arg2, (byte) -100));
                var9.method1669(arg1, 5259, 0, arg3, arg6, arg4, 0, arg7, arg2);
                return var9;
            } else {
                return new class633(this, arg1, arg6, arg2, arg4, arg3, arg7);
            }
        } else {
            return new class339(this, arg1, arg6, arg2, arg0, arg4, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "(II)Laba;")
    public final class188 method899(int arg0, int arg1) {
        ++field5730;
        if (arg1 != 2) {
            this.method874(false);
        }
        if (arg0 != 3) {
            if (arg0 != 4) {
                return arg0 == 8 ? new class189(this, super.field8460, super.field8510) : super.method899(arg0, arg1);
            } else {
                return new class405(this, super.field8460, super.field8510);
            }
        } else {
            return new class594(this, super.field8460);
        }
    }

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "(I)V")
    public final void method861(int arg0) {
        if (arg0 == 0) {
            ++field5713;
        }
    }

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "(I)V")
    public final void method914(int arg0) {
        ++field5716;
        if (super.field8661) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
        if (arg0 != 4) {
            this.field5789 = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "(B)V")
    public final void method912(byte arg0) {
        class778.field10684[3] = 1.0F;
        class778.field10684[0] = super.field8705 * super.field8658;
        class778.field10684[2] = super.field8705 * super.field8687;
        ++field5720;
        class778.field10684[1] = super.field8740 * super.field8705;
        OpenGL.glLightfv(16384, 4609, class778.field10684, 0);
        class778.field10684[1] = -super.field8673 * super.field8740;
        class778.field10684[2] = -super.field8673 * super.field8687;
        class778.field10684[0] = -super.field8673 * super.field8658;
        class778.field10684[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class778.field10684, 0);
        if (arg0 > -56) {
            this.method858(-67, (float[]) null, (class787) null, -31, -13, -8, 74, true);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lrd;B)Lnc;")
    public final class26 method893(class357[] arg0, byte arg1) {
        ++field5706;
        int var3 = 99 % ((arg1 - -87) / 37);
        return new class618(arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[IIIZII)Lec;")
    public final class248 method857(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field5736;
        if (arg6 != 9567) {
            field5714 = null;
        }
        if (!this.field5796 && (!class117.method957(-6602, arg2) || !class117.method957(arg6 ^ -15511, arg5))) {
            if (this.field5798) {
                return new class633(this, arg2, arg5, arg1, arg3, arg0);
            } else {
                class339 var8 = new class339(this, class305.field4404, class258.field3847, class719.method4014(arg2, (byte) -100), class719.method4014(arg5, (byte) -100));
                var8.method1663(0, (byte) 119, arg2, arg1, arg0, arg5, arg3, 0);
                return var8;
            }
        } else {
            return new class339(this, arg2, arg5, arg4, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V")
    public final void method504(int arg0, int arg1) throws class566 {
        this.field5744.swapBuffers();
        ++field5752;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lwt;IIB)V")
    public final void method855(class330 arg0, int arg1, int arg2, byte arg3) {
        ++field5733;
        byte var5;
        int var6;
        if (class771.field10604 != arg0) {
            if (class458.field6352 == arg0) {
                var5 = 3;
                var6 = arg1 - -1;
            } else if (class235.field3174 != arg0) {
                if (class432.field6127 != arg0) {
                    if (class537.field7308 == arg0) {
                        var6 = arg1 + 2;
                        var5 = 5;
                    } else {
                        var5 = 0;
                        var6 = arg1;
                    }
                } else {
                    var5 = 6;
                    var6 = arg1 - -2;
                }
            } else {
                var6 = arg1 * 3;
                var5 = 4;
            }
        } else {
            var5 = 1;
            var6 = arg1 * 2;
        }
        if (arg3 <= 38) {
            this.field5776 = null;
        }
        OpenGL.glDrawArrays(var5, arg2, var6);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method898(byte arg0, Canvas arg1, Object arg2) {
        ++field5700;
        Long var4 = (Long) arg2;
        int var5 = -13 / ((arg0 - 21) / 47);
        this.field5744.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "(I)V")
    public final void method856(int arg0) {
        if (arg0 == 24) {
            this.field5777 = false;
            ++field5691;
            this.method2482(53);
        }
    }

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "(I)F")
    public final float method859(int arg0) {
        int var2 = 7 / ((-7 - arg0) / 56);
        ++field5715;
        return 0.0F;
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "(I)V")
    public final void method887(int arg0) {
        int var2 = 56 % ((arg0 - -54) / 38);
        if (!super.field8767) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        ++field5753;
    }

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "(I)V")
    public final void method879(int arg0) {
        if (arg0 < -75) {
            ++field5702;
            OpenGL.glLightfv(16384, 4611, super.field8700, 0);
            OpenGL.glLightfv(16385, 4611, super.field8693, 0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public final synchronized void method546(int arg0) {
        ++field5768;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5748.method2540(false)) {
            class119 var12 = (class119) this.field5748.method2543(-15114);
            class104.field1436[var2++] = (int) var12.field1409;
            super.field8632 -= var12.field1725;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class104.field1436, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class104.field1436, 0);
            var2 = 0;
        }
        while (!this.field5765.method2540(false)) {
            class119 var11 = (class119) this.field5765.method2543(-15114);
            class104.field1436[var2++] = (int) var11.field1409;
            super.field8629 -= var11.field1725;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class104.field1436, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class104.field1436, 0);
            var2 = 0;
        }
        while (!this.field5773.method2540(false)) {
            class119 var10 = (class119) this.field5773.method2543(-15114);
            class104.field1436[var2++] = var10.field1725;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class104.field1436, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class104.field1436, 0);
            var2 = 0;
        }
        while (!this.field5774.method2540(false)) {
            class119 var9 = (class119) this.field5774.method2543(-15114);
            class104.field1436[var2++] = (int) var9.field1409;
            super.field8628 -= var9.field1725;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class104.field1436, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class104.field1436, 0);
            boolean var4 = false;
        }
        while (!this.field5698.method2540(false)) {
            class119 var8 = (class119) this.field5698.method2543(-15114);
            OpenGL.glDeleteLists((int) var8.field1409, var8.field1725);
        }
        while (!this.field5775.method2540(false)) {
            class101 var7 = this.field5775.method2543(-15114);
            OpenGL.glDeleteProgramARB((int) var7.field1409);
        }
        while (!this.field5776.method2540(false)) {
            class101 var6 = this.field5776.method2543(-15114);
            OpenGL.glDeleteObjectARB(var6.field1409);
        }
        while (!this.field5698.method2540(false)) {
            class119 var5 = (class119) this.field5698.method2543(-15114);
            OpenGL.glDeleteLists((int) var5.field1409, var5.field1725);
        }
        if (~this.method567() < -100663297 && ~(this.field5779 + 60000L) > ~class302.method1910(0)) {
            System.gc();
            this.field5779 = class302.method1910(0);
        }
        super.method546(var3);
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(IZ)Lid;")
    public final class612 method902(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field5789 = true;
        }
        ++field5708;
        return new class440(this, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)V")
    public final void method853(boolean arg0) {
        this.method3469((byte) -123);
        ++field5699;
        int var2;
        for (var2 = 0; ~super.field8739 < ~var2; ++var2) {
            class540 var3 = super.field8723[var2];
            int var4 = var3.method3080((byte) -122);
            int var5 = var2 + 16386;
            float var6 = var3.method3083((byte) -41) / 255.0F;
            class778.field10684[0] = (float) var3.method3085(24859);
            class778.field10684[1] = (float) var3.method3082(-126);
            class778.field10684[2] = (float) var3.method3084((byte) -16);
            class778.field10684[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class778.field10684, 0);
            class778.field10684[0] = (float) (class440.method2643(var4, 16741039) >> 16) * var6;
            class778.field10684[1] = var6 * (float) class440.method2643(var4 >> 8, 255);
            class778.field10684[2] = var6 * (float) class440.method2643(var4, 255);
            class778.field10684[3] = 1.0F;
            OpenGL.glLightfv(var5, 4609, class778.field10684, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3081(7036) * var3.method3081(7036)));
            OpenGL.glEnable(var5);
        }
        while (~super.field8703 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method853(arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILoh;IIZLwt;)V")
    public final void method864(int arg0, int arg1, class427 arg2, int arg3, int arg4, boolean arg5, class330 arg6) {
        ++field5722;
        byte var8;
        int var9;
        if (class771.field10604 == arg6) {
            var8 = 1;
            var9 = arg0 * 2;
        } else if (class458.field6352 == arg6) {
            var8 = 3;
            var9 = arg0 + 1;
        } else if (class235.field3174 != arg6) {
            if (class432.field6127 != arg6) {
                if (class537.field7308 == arg6) {
                    var8 = 5;
                    var9 = arg0 + 2;
                } else {
                    var8 = 0;
                    var9 = arg0;
                }
            } else {
                var8 = 6;
                var9 = arg0 + 2;
            }
        } else {
            var9 = arg0 * 3;
            var8 = 4;
        }
        class258 var10 = arg2.method2612(21064);
        class555 var11 = (class555) arg2;
        var11.method3573(39);
        OpenGL.glDrawElements(var8, var9, class550.method3116((byte) -124, var10), var11.method3579(120) + (long) (var10.field3842 * arg1));
        if (!arg5) {
            this.field5789 = false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "(I)V")
    public final void method889(int arg0) {
        ++field5737;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field8697, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 < 94) {
            this.field5775 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(Z)V")
    public final void method906(boolean arg0) {
        ++field5741;
        if (!super.field8663) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
        if (!arg0) {
            this.method568();
        }
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(II)V")
    public final void method905(int arg0, int arg1) {
        ++field5766;
        if (arg1 != 0) {
            this.field5796 = false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V")
    public final void method541(boolean arg0) {
        ++field5743;
    }

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "(I)V")
    public final void method909(int arg0) {
        ++field5734;
        for (int var2 = super.field8711 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5744.setSwapInterval(0);
        super.method909(arg0);
    }

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "()V")
    public final void method503() {
        ++field5738;
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(B)V")
    public final void method862(byte arg0) {
        if (arg0 == 58) {
            ++field5757;
            super.field8656 = (float) (-super.field8714 + super.field8659);
            super.field8655 = super.field8656 - (float) super.field8721;
            if (super.field8655 < (float) super.field8691) {
                super.field8655 = (float) super.field8691;
            }
            OpenGL.glFogf(2915, super.field8655);
            OpenGL.glFogf(2916, super.field8656);
            class778.field10684[0] = (float) class440.method2643(super.field8651, 16711680) / 1.671168E7F;
            class778.field10684[2] = (float) class440.method2643(255, super.field8651) / 255.0F;
            class778.field10684[1] = (float) class440.method2643(65280, super.field8651) / 65280.0F;
            OpenGL.glFogfv(2918, class778.field10684, 0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "(I)V")
    public final void method897(int arg0) {
        class778.field10684[2] = (float) class440.method2643(super.field8704, 255) / 255.0F;
        class778.field10684[1] = (float) class440.method2643(65280, super.field8704) / 65280.0F;
        class778.field10684[3] = (float) (super.field8704 >>> 24) / 255.0F;
        ++field5758;
        class778.field10684[0] = (float) class440.method2643(16711680, super.field8704) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class778.field10684, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lvv;)V")
    public final void method549(class345 arg0) {
        ++field5763;
    }

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "(Z)V")
    public final void method874(boolean arg0) {
        if (arg0) {
            this.method497((class544) null, (class544) null, -0.868119F, (class544) null);
        }
        ++field5740;
        if (super.field8731 && !super.field8726) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!pa", name = "GA", descriptor = "(I)V")
    public final void method458(int arg0) {
        ++field5725;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "()I")
    public final int method490() {
        ++field5679;
        return this.field5797;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(IZ)V")
    public final void method895(int arg0, boolean arg1) {
        ++field5689;
        if (arg0 <= -103) {
            if (!arg1) {
                OpenGL.glDisable(32925);
            } else {
                OpenGL.glEnable(32925);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "(I)V")
    public static void method2476(int arg0) {
        if (arg0 != 16384) {
            field5688 = 35;
        }
        field5767 = null;
        field5761 = null;
        field5714 = null;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
    public final void method465() {
        ++field5764;
        super.method465();
        if (this.field5744 != null) {
            this.field5744.method3635();
            this.field5744.release();
            this.field5744 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method875(byte arg0, Canvas arg1) {
        if (arg0 <= 61) {
            return null;
        } else {
            ++field5760;
            long var3 = this.field5744.prepareSurface(arg1);
            if (~var3 == 0L) {
                throw new RuntimeException();
            } else {
                return new Long(var3);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "(I)V")
    public static final void method2477(int arg0) {
        if (arg0 <= 57) {
            field5714 = null;
        }
        class259.method1718();
        ++field5677;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class514.field7038[var1].method2913(2097152);
        }
        class322.method2039(-62);
        class772.method4279((byte) 53);
        class733.method4072((byte) 9);
        System.gc();
        class379.field5542.method483();
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()Z")
    public final boolean method461() {
        ++field5769;
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "(I)V")
    public final void method904(int arg0) {
        if (arg0 != 0) {
            this.field5786 = null;
        }
        if (super.field8725) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        ++field5727;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Laj;I)V")
    public class391(OpenGL arg0, Canvas arg1, long arg2, class161 arg3, class333 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field5744 = arg0;
            this.field5744.method3637();
            this.field5787 = OpenGL.glGetString(7936).toLowerCase();
            this.field5795 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field5787.indexOf("microsoft") == 0 && this.field5787.indexOf("brian paul") == -1 && ~this.field5787.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class46.method355(var8.replace('.', ' '), 0, ' ');
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class334.method2123(1, var9[0]);
                        int var11 = class334.method2123(1, var9[1]);
                        this.field5788 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field5788 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field5744.method3636("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field5744.method3636("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field8711 = var12[0];
                        if (super.field8711 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field8698 = 8;
                            this.field5789 = this.field5744.method3636("GL_ARB_vertex_buffer_object");
                            super.field8737 = this.field5744.method3636("GL_ARB_multisample");
                            this.field5798 = this.field5744.method3636("GL_ARB_texture_rectangle");
                            super.field8668 = this.field5744.method3636("GL_ARB_texture_cube_map");
                            this.field5796 = this.field5744.method3636("GL_ARB_texture_non_power_of_two");
                            super.field8709 = this.field5744.method3636("GL_EXT_texture3D");
                            this.field5790 = this.field5744.method3636("GL_ARB_vertex_shader");
                            this.field5791 = this.field5744.method3636("GL_ARB_vertex_program");
                            this.field5794 = this.field5744.method3636("GL_ARB_fragment_shader");
                            this.field5744.method3636("GL_ARB_fragment_program");
                            this.field5793 = new int[super.field8711];
                            this.field5792 = Stream.method3926() ? 33639 : 5121;
                            if (this.field5795.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class46.method355(this.field5795.replace('/', ' '), 0, ' ');
                                for (int var17 = 0; var17 < var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class732.method4062(var18.substring(1, 3), 0)) {
                                                var15 = true;
                                                var18 = var18.substring(1);
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (~var18.length() <= -5 && class732.method4062(var18.substring(0, 4), 0)) {
                                                    var13 = class334.method2123(1, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field8709 = false;
                                    }
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field5789 = false;
                                    }
                                }
                                this.field5798 &= this.field5744.method3636("GL_ARB_half_float_pixel");
                            }
                            this.field5787.indexOf("intel");
                            if (this.field5789) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method470((byte) -81);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lss;ZZI)V")
    public final void method916(class457 arg0, boolean arg1, boolean arg2, int arg3) {
        ++field5712;
        OpenGL.glTexEnvi(8960, arg3 + 34184, class587.method3268(-10656, arg0));
        OpenGL.glTexEnvi(8960, arg3 + 34200, !arg1 ? 770 : 771);
        if (!arg2) {
            this.method2480(94, (byte) 93, 29);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILig;Lsw;I)Lec;")
    public final class248 method892(int arg0, int arg1, class258 arg2, class787 arg3, int arg4) {
        if (arg4 != 18018) {
            field5767 = null;
        }
        ++field5729;
        if (!this.field5796 && (!class117.method957(arg4 + -24620, arg1) || !class117.method957(-6602, arg0))) {
            return this.field5798 ? new class633(this, arg3, arg2, arg1, arg0) : new class339(this, arg3, arg2, class719.method4014(arg1, (byte) -100), class719.method4014(arg0, (byte) -100));
        } else {
            return new class339(this, arg3, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
    public final void method468() {
        ++field5732;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZBILss;)V")
    public final void method907(boolean arg0, boolean arg1, byte arg2, int arg3, class457 arg4) {
        ++field5749;
        OpenGL.glTexEnvi(8960, 34176 - -arg3, class587.method3268(-10656, arg4));
        if (arg2 != -67) {
            this.field5698 = null;
        }
        if (!arg0) {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 769 : 768);
        } else {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "(I)V")
    public final void method915(int arg0) {
        if (arg0 < 121) {
            this.field5783 = true;
        }
        ++field5717;
        if (super.field8667) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsw;III[BI)Loo;")
    public final class654 method896(class787 arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        ++field5692;
        return arg5 != 0 ? null : new class209(this, arg0, arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "(B)V")
    public final void method885(byte arg0) {
        OpenGL.glViewport(super.field8733, super.field8722, super.field8553, super.field8593);
        if (arg0 != -30) {
            this.field5778 = true;
        }
        ++field5728;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public final synchronized void method2478(int arg0, int arg1, int arg2) {
        ++field5754;
        if (arg1 == 11759) {
            class119 var4 = new class119(arg2);
            var4.field1409 = (long) arg0;
            this.field5748.method2545(arg1 + -11885, var4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lid;II)V")
    public final void method883(class612 arg0, int arg1, int arg2) {
        int var4 = 43 / ((-35 - arg2) / 38);
        this.field5781[arg1] = (class440) arg0;
        ++field5755;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIID)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field5684;
    }

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "(I)V")
    public final void method918(int arg0) {
        ++field5721;
        if (arg0 == 0) {
            OpenGL.glDepthMask(super.field8728 && super.field8657);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)I")
    public static final int method2479(int arg0, int arg1, int arg2) {
        ++field5772;
        int var3 = arg1 >>> 24;
        if (arg0 != 6) {
            return -86;
        } else {
            int var4 = 255 - var3;
            int var5 = ((arg1 & 65280) * var3 & 16711680 | -16711936 & (arg1 & 16711935) * var3) >>> 8;
            return (((16711935 & arg2) * var4 & -16711936 | (65280 & arg2) * var4 & 16711680) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method487(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        ++field5705;
        this.method504(arg2, arg3);
    }

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "(I)V")
    public final void method900(int arg0) {
        ++field5731;
        if (arg0 == 11) {
            this.method2482(87);
        }
    }

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "()Lcja;")
    public final class45 method558() {
        ++field5693;
        int var1 = -1;
        if (this.field5787.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field5787.indexOf("intel") == -1) {
            if (this.field5787.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class45(var1, "OpenGL", this.field5788, this.field5795, 0L);
    }

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
    public final void method511() {
        ++field5746;
    }

    @OriginalMember(owner = "client!pa", name = "ya", descriptor = "()V")
    public final void method483() {
        ++field5687;
        this.method3500((byte) 126, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
    public final synchronized void method2480(int arg0, byte arg1, int arg2) {
        ++field5735;
        class119 var4 = new class119(arg2);
        var4.field1409 = (long) arg0;
        int var5 = 3 / ((-43 - arg1) / 52);
        this.field5765.method2545(-127, var4);
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)V")
    public final void method872(byte arg0) {
        ++field5739;
        int var2 = -119 % ((49 - arg0) / 63);
        OpenGL.glMatrixMode(5890);
        if (super.field8686[super.field8662] != class57.field799) {
            OpenGL.glLoadMatrixf(super.field8653[super.field8662].method4203(class617.field8331, (byte) -118), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILaga;)V")
    public final void method870(int arg0, class696 arg1) {
        ++field5695;
        if (class381.field5564 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class62.method441(false, arg1);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        if (arg0 <= 40) {
            this.method875((byte) 69, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "(I)V")
    public final void method860(int arg0) {
        if (arg0 != 13608) {
            this.field5794 = true;
        }
        ++field5703;
        OpenGL.glTexEnvi(8960, 34161, class334.method2124((byte) 103, super.field8730[super.field8662]));
    }

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "()V")
    public final void method500() {
        ++field5701;
        if (super.field8553 > 0 || super.field8593 > 0) {
            int var1 = super.field8652;
            int var2 = super.field8677;
            int var3 = super.field8671;
            int var4 = super.field8715;
            this.method543();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3497(true);
            this.method3524(-545832829, false);
            this.method3472((byte) -68, false);
            this.method3484(1, false);
            this.method3500((byte) 122, false);
            this.method3520(true, (class123) null);
            this.method3502(false, -2, false, (byte) -112);
            this.method3503((byte) -122, 1);
            this.method3460(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field8553, super.field8593, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method456(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method891(Canvas arg0, byte arg1, Object arg2) {
        ++field5719;
        Long var4 = (Long) arg2;
        if (!this.field5744.setSurface(var4)) {
            throw new RuntimeException();
        } else if (arg1 != 109) {
            this.field5797 = -39;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2481(int arg0, long arg1) {
        ++field5680;
        class101 var4 = new class101();
        if (arg0 == 256) {
            var4.field1409 = arg1;
            this.field5776.method2545(arg0 ^ -383, var4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "(B)V")
    public final void method911(byte arg0) {
        OpenGL.glActiveTexture(super.field8662 + 33984);
        if (arg0 != 123) {
            this.method879(-38);
        }
        ++field5694;
    }

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "(B)V")
    public final void method917(byte arg0) {
        ++field5696;
        if (arg0 >= -85) {
            this.method512(-0.34548604F, 0.8309224F, 0.35333246F);
        }
        int var2 = this.field5793[super.field8662];
        if (~var2 != -1) {
            this.field5793[super.field8662] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)Lbfa;")
    public final class390 method528(int arg0, int arg1) {
        ++field5726;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsw;ILig;)Z")
    public final boolean method863(class787 arg0, int arg1, class258 arg2) {
        if (arg1 != -2) {
            return false;
        } else {
            ++field5771;
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(FFF)V")
    public final void method512(float arg0, float arg1, float arg2) {
        ++field5759;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lbfa;Ltq;)Lvv;")
    public final class345 method566(class390 arg0, class656 arg1) {
        ++field5686;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[FLsw;IIIIZ)Lec;")
    public final class248 method858(int arg0, float[] arg1, class787 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg6 != 0) {
            this.field5796 = false;
        }
        ++field5718;
        if (!this.field5796 && (!class117.method957(-6602, arg5) || !class117.method957(arg6 ^ -6602, arg4))) {
            if (this.field5798) {
                return new class633(this, arg2, arg5, arg4, arg1, arg3, arg0);
            } else {
                class339 var9 = new class339(this, arg2, class258.field3851, class719.method4014(arg5, (byte) -100), class719.method4014(arg4, (byte) -100));
                var9.method2151(arg0, arg1, arg4, arg3, arg2, 0, arg6 + -128, arg5, 0);
                return var9;
            }
        } else {
            return new class339(this, arg2, arg5, arg4, arg7, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public final class544 method497(class544 arg0, class544 arg1, float arg2, class544 arg3) {
        ++field5707;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "(I)V")
    public final void method890(int arg0) {
        ++field5678;
        class778.field10684[arg0] = super.field8740 * super.field8644;
        class778.field10684[0] = super.field8658 * super.field8644;
        class778.field10684[2] = super.field8687 * super.field8644;
        class778.field10684[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class778.field10684, 0);
    }

    @OriginalMember(owner = "client!pa", name = "na", descriptor = "(IIII)[I")
    public final int[] method521(int arg0, int arg1, int arg2, int arg3) {
        ++field5756;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + super.field8593 + -var6 + -1, arg2, 1, 32993, this.field5792, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        ++field5747;
    }

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "(I)V")
    public final void method871(int arg0) {
        if (arg0 == -2) {
            OpenGL.glScissor(super.field8733 + super.field8652, super.field8722 - -super.field8593 + -super.field8715, -super.field8652 + super.field8677, -super.field8671 + super.field8715);
            ++field5745;
        }
    }

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "(I)V")
    public final void method894(int arg0) {
        ++field5723;
        OpenGL.glTexEnvi(8960, 34162, class334.method2124((byte) 123, super.field8694[super.field8662]));
        if (arg0 != 7) {
            this.method860(95);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsw;Lig;Z)Z")
    public final boolean method910(class787 arg0, class258 arg1, boolean arg2) {
        ++field5724;
        return !arg2 ? true : true;
    }

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "()Z")
    public final boolean method560() {
        ++field5682;
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "(I)V")
    private final void method2482(int arg0) {
        if (this.field5778) {
            OpenGL.glPopMatrix();
        }
        ++field5742;
        if (super.field8743.method673(76)) {
            if (!this.field5777) {
                OpenGL.glLoadMatrixf(super.field8640.method4203(class617.field8331, (byte) -111), 0);
                this.field5777 = true;
                this.method879(-93);
                this.method853(true);
            }
            if (super.field8633) {
                this.field5778 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field8636.method4203(class617.field8331, (byte) -81), 0);
                this.field5778 = true;
            }
        } else if (!super.field8633) {
            OpenGL.glLoadMatrixf(super.field8636.method4203(class617.field8331, (byte) -78), 0);
            this.field5778 = false;
        } else {
            OpenGL.glLoadIdentity();
            this.field5778 = false;
        }
        if (arg0 < 1) {
            this.method909(-1);
        }
    }
}
