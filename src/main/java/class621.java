import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class621 extends class473 {

    @OriginalMember(owner = "client!nfa", name = "Gh", descriptor = "Lmfa;")
    private class562 field8790 = new class562();

    @OriginalMember(owner = "client!nfa", name = "Sh", descriptor = "Lmfa;")
    private class562 field8802 = new class562();

    @OriginalMember(owner = "client!nfa", name = "Wh", descriptor = "Lmfa;")
    private class562 field8806 = new class562();

    @OriginalMember(owner = "client!nfa", name = "Xh", descriptor = "Lmfa;")
    private class562 field8807 = new class562();

    @OriginalMember(owner = "client!nfa", name = "Yh", descriptor = "Lmfa;")
    private class562 field8808 = new class562();

    @OriginalMember(owner = "client!nfa", name = "Zh", descriptor = "Lmfa;")
    private class562 field8809 = new class562();

    @OriginalMember(owner = "client!nfa", name = "ai", descriptor = "Lmfa;")
    private class562 field8810 = new class562();

    @OriginalMember(owner = "client!nfa", name = "ci", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field8812 = new MapBuffer();

    @OriginalMember(owner = "client!nfa", name = "ii", descriptor = "I")
    private int field8818 = 0;

    @OriginalMember(owner = "client!nfa", name = "ni", descriptor = "Z")
    private boolean field8823 = false;

    @OriginalMember(owner = "client!nfa", name = "Yg", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8756;

    @OriginalMember(owner = "client!nfa", name = "fi", descriptor = "Ljava/lang/String;")
    private String field8815;

    @OriginalMember(owner = "client!nfa", name = "gi", descriptor = "Ljava/lang/String;")
    private String field8816;

    @OriginalMember(owner = "client!nfa", name = "li", descriptor = "I")
    private int field8821;

    @OriginalMember(owner = "client!nfa", name = "ki", descriptor = "Z")
    public boolean field8820;

    @OriginalMember(owner = "client!nfa", name = "ji", descriptor = "Z")
    private boolean field8819;

    @OriginalMember(owner = "client!nfa", name = "hi", descriptor = "Z")
    private boolean field8817;

    @OriginalMember(owner = "client!nfa", name = "mi", descriptor = "Z")
    public boolean field8822;

    @OriginalMember(owner = "client!nfa", name = "ei", descriptor = "I")
    public int field8814;

    @OriginalMember(owner = "client!nfa", name = "di", descriptor = "[I")
    public int[] field8813;

    @OriginalMember(owner = "client!nfa", name = "zg", descriptor = "Z")
    public static boolean field8731 = false;

    @OriginalMember(owner = "client!nfa", name = "Nh", descriptor = "I")
    public static int field8797 = 0;

    @OriginalMember(owner = "client!nfa", name = "sg", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!nfa", name = "tg", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!nfa", name = "ug", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!nfa", name = "vg", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!nfa", name = "wg", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!nfa", name = "xg", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!nfa", name = "yg", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!nfa", name = "Ag", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!nfa", name = "Bg", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!nfa", name = "Cg", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!nfa", name = "Dg", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!nfa", name = "Eg", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!nfa", name = "Fg", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!nfa", name = "Gg", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!nfa", name = "Hg", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!nfa", name = "Ig", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!nfa", name = "Jg", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!nfa", name = "Kg", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!nfa", name = "Lg", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!nfa", name = "Mg", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!nfa", name = "Ng", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!nfa", name = "Og", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!nfa", name = "Pg", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!nfa", name = "Qg", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!nfa", name = "Rg", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!nfa", name = "Sg", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!nfa", name = "Tg", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!nfa", name = "Ug", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!nfa", name = "Vg", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!nfa", name = "Wg", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!nfa", name = "Xg", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!nfa", name = "Zg", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!nfa", name = "ah", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!nfa", name = "bh", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!nfa", name = "ch", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!nfa", name = "dh", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!nfa", name = "eh", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!nfa", name = "fh", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!nfa", name = "gh", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!nfa", name = "hh", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!nfa", name = "ih", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!nfa", name = "jh", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!nfa", name = "kh", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!nfa", name = "lh", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!nfa", name = "mh", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!nfa", name = "nh", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!nfa", name = "oh", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!nfa", name = "ph", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!nfa", name = "qh", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!nfa", name = "rh", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!nfa", name = "sh", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!nfa", name = "th", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!nfa", name = "uh", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!nfa", name = "vh", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!nfa", name = "wh", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!nfa", name = "xh", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!nfa", name = "yh", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!nfa", name = "zh", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!nfa", name = "Ah", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!nfa", name = "Bh", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!nfa", name = "Ch", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!nfa", name = "Dh", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!nfa", name = "Eh", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!nfa", name = "Fh", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!nfa", name = "Hh", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!nfa", name = "Ih", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!nfa", name = "Jh", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!nfa", name = "Kh", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!nfa", name = "Lh", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!nfa", name = "Mh", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!nfa", name = "Oh", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!nfa", name = "Ph", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!nfa", name = "Qh", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!nfa", name = "Rh", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!nfa", name = "Th", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!nfa", name = "Uh", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!nfa", name = "Vh", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!nfa", name = "bi", descriptor = "J")
    private long field8811;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "(B)V", line = 4)
    public final void method1147(byte arg0) {
        ++field8798;
        if (super.field6789 && super.field6871 && super.field6802 >= 0 | super.field6806) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 <= 99) {
            this.method1165(100, (byte[]) null, 19, false, 27, (class402) null, 24, -94);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "(I)V", line = 19)
    public final void method1179(int arg0) {
        if (arg0 != 0) {
            this.method1174(57, (class328) null);
        }
        ++field8739;
        OpenGL.glActiveTexture(33984 - -super.field6812);
    }

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "(B)V", line = 30)
    public final void method1195(byte arg0) {
        OpenGL.glLightfv(16384, 4611, super.field6827, 0);
        if (arg0 == 48) {
            ++field8774;
            OpenGL.glLightfv(16385, 4611, super.field6859, 0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(ZZ)Ltfa;", line = 43)
    public final class31 method1203(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method317(-0.36463016F, 0.82899994F, 1.4123712F);
        }
        ++field8741;
        return new class206(this, arg0);
    }

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(B)V", line = 55)
    public final void method1141(byte arg0) {
        int var2 = -75 % ((29 - arg0) / 40);
        ++field8786;
        int var3;
        if (super.field6806) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var3 = super.field6851;
        } else {
            super.field6821 = (float) (-super.field6862 + super.field6878);
            super.field6875 = (float) (-super.field6802) + super.field6821;
            if (super.field6875 < (float) super.field6823) {
                super.field6875 = (float) super.field6823;
            }
            OpenGL.glFogf(2915, super.field6875);
            OpenGL.glFogf(2916, super.field6821);
            var3 = super.field6814;
        }
        class685.field9707[2] = (float) class203.method1246(255, var3) / 255.0F;
        class685.field9707[0] = (float) class203.method1246(var3, 16711680) / 1.671168E7F;
        class685.field9707[1] = (float) class203.method1246(var3, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class685.field9707, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "W", descriptor = "(I)F", line = 87)
    public final float method1156(int arg0) {
        if (arg0 != 26278) {
            return -0.11089898F;
        } else {
            ++field8768;
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILdj;)V", line = 99)
    public final void method1180(int arg0, class311 arg1) {
        ++field8753;
        if (class392.field5226 == arg1) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class469.method2662(arg1, arg0 + -1252293814);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        if (arg0 != 6) {
            this.field8810 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([BILvj;BII)Lte;", line = 132)
    public final class560 method1187(byte[] arg0, int arg1, class402 arg2, byte arg3, int arg4, int arg5) {
        ++field8791;
        if (arg3 > -6) {
            this.field8820 = false;
        }
        return new class144(this, arg2, arg4, arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZI[IZII)Lae;", line = 146)
    public final class228 method1144(int arg0, boolean arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6) {
        if (!arg1) {
            this.field8808 = null;
        }
        ++field8749;
        if (!this.field8817 && (!class644.method3612(false, arg6) || !class644.method3612(false, arg2))) {
            if (this.field8819) {
                return new class428(this, arg6, arg2, arg3, arg0, arg5);
            } else {
                class503 var8 = new class503(this, class581.field8260, class271.field3429, class146.method799(arg6, -125), class146.method799(arg2, -111));
                var8.method1329(0, arg0, arg5, arg2, 0, arg6, (byte) 126, arg3);
                return var8;
            }
        } else {
            return new class503(this, arg6, arg2, arg4, arg3, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)V", line = 177)
    public final synchronized void method304(int arg0) {
        ++field8775;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field8802.method3161((byte) 98)) {
            class337 var12 = (class337) this.field8802.method3171(768);
            class236.field3001[var3++] = (int) var12.field3405;
            super.field6776 -= var12.field4415;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class236.field3001, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class236.field3001, 0);
            var3 = 0;
        }
        while (!this.field8806.method3161((byte) 104)) {
            class337 var11 = (class337) this.field8806.method3171(768);
            class236.field3001[var3++] = (int) var11.field3405;
            super.field6775 -= var11.field4415;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class236.field3001, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class236.field3001, 0);
            var3 = 0;
        }
        while (!this.field8807.method3161((byte) 127)) {
            class337 var10 = (class337) this.field8807.method3171(768);
            class236.field3001[var3++] = var10.field4415;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class236.field3001, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class236.field3001, 0);
            var3 = 0;
        }
        while (!this.field8808.method3161((byte) 113)) {
            class337 var9 = (class337) this.field8808.method3171(768);
            class236.field3001[var3++] = (int) var9.field3405;
            super.field6778 -= var9.field4415;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class236.field3001, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class236.field3001, 0);
            boolean var4 = false;
        }
        while (!this.field8790.method3161((byte) 118)) {
            class337 var8 = (class337) this.field8790.method3171(768);
            OpenGL.glDeleteLists((int) var8.field3405, var8.field4415);
        }
        while (!this.field8809.method3161((byte) 111)) {
            class270 var7 = this.field8809.method3171(768);
            OpenGL.glDeleteProgramARB((int) var7.field3405);
        }
        while (!this.field8810.method3161((byte) 126)) {
            class270 var6 = this.field8810.method3171(768);
            OpenGL.glDeleteObjectARB(var6.field3405);
        }
        while (!this.field8790.method3161((byte) 107)) {
            class337 var5 = (class337) this.field8790.method3171(768);
            OpenGL.glDeleteLists((int) var5.field3405, var5.field4415);
        }
        if (~this.method302() < -100663297 && class641.method3604(false) > this.field8811 + 60000L) {
            System.gc();
            this.field8811 = class641.method3604(false);
        }
        super.method304(var2);
    }

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "(B)V", line = 339)
    public final void method1151(byte arg0) {
        ++field8766;
        int var2;
        for (var2 = 0; ~super.field6876 < ~var2; ++var2) {
            class463 var3 = super.field6801[var2];
            int var4 = var3.method2634(true);
            int var5 = var2 + 16386;
            float var6 = var3.method2635(-60) / 255.0F;
            class685.field9707[0] = (float) var3.method2640(-2049);
            class685.field9707[1] = (float) var3.method2638((byte) -70);
            class685.field9707[2] = (float) var3.method2641((byte) -14);
            class685.field9707[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class685.field9707, 0);
            class685.field9707[0] = (float) (class203.method1246(16712328, var4) >> 16) * var6;
            class685.field9707[2] = var6 * (float) class203.method1246(var4, 255);
            class685.field9707[1] = (float) class203.method1246(var4 >> 8, 255) * var6;
            class685.field9707[3] = 1.0F;
            OpenGL.glLightfv(var5, 4609, class685.field9707, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method2637(65) * var3.method2637(76)));
            OpenGL.glEnable(var5);
        }
        while (super.field6882 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        if (arg0 <= 112) {
            this.field8818 = 99;
        }
        super.method1151((byte) 115);
    }

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "(B)V", line = 385)
    public final void method1166(byte arg0) {
        if (arg0 != 31) {
            this.method1197((Canvas) null, 104);
        }
        ++field8765;
        if (!super.field6819) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "(II)Z", line = 400)
    public static final boolean method3481(int arg0, int arg1) {
        ++field8780;
        if (arg0 > -5) {
            return false;
        } else {
            return ~arg1 == -11 || ~arg1 == -12 || ~arg1 == -13;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "()V", line = 412)
    public final void method358() {
        ++field8767;
        this.method2716(true, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V", line = 422)
    public final void method1160(byte arg0, Object arg1, Canvas arg2) {
        ++field8754;
        Long var4 = (Long) arg1;
        this.field8756.surfaceResized(var4);
        if (arg0 != -85) {
            this.field8820 = true;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V", line = 440)
    public final void method296(int arg0, int arg1, int arg2, int arg3) {
        ++field8757;
    }

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "()V", line = 450)
    public final void method367() {
        ++field8725;
        if (~super.field6684 < -1 || ~super.field6620 < -1) {
            int var1 = super.field6858;
            int var2 = super.field6803;
            int var3 = super.field6853;
            int var4 = super.field6826;
            this.method378();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2744(false);
            this.method2755(-32, false);
            this.method2702(false, (byte) 86);
            this.method2727(false, -77);
            this.method2716(true, false);
            this.method2696(-2, (class155) null);
            this.method2733(-2, 69, false, false);
            this.method2725(1, -31628);
            this.method2750(0, (byte) -73);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field6684, super.field6620, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method314(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "(I)V", line = 494)
    public final void method1184(int arg0) {
        if (arg0 == 0) {
            if (!super.field6906) {
                OpenGL.glDisable(3089);
            } else {
                OpenGL.glEnable(3089);
            }
            ++field8745;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(ZZ)V", line = 510)
    public final void method1140(boolean arg0, boolean arg1) {
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        if (arg0) {
            ++field8730;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "(Z)V", line = 528)
    public final void method1194(boolean arg0) {
        ++field8784;
        if (arg0) {
            int var2 = this.field8813[super.field6812];
            if (~var2 != -1) {
                this.field8813[super.field6812] = 0;
                OpenGL.glBindTexture(var2, 0);
                OpenGL.glDisable(var2);
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[BIZILvj;II)Lae;", line = 549)
    public final class228 method1165(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, class402 arg5, int arg6, int arg7) {
        ++field8760;
        if (arg7 != 0) {
            this.field8802 = null;
        }
        if (!this.field8817 && (!class644.method3612(false, arg0) || !class644.method3612(false, arg6))) {
            if (this.field8819) {
                return new class428(this, arg5, arg0, arg6, arg1, arg2, arg4);
            } else {
                class503 var9 = new class503(this, arg5, class271.field3429, class146.method799(arg0, -127), class146.method799(arg6, arg7 ^ -121));
                var9.method1325(-24967, 0, arg0, arg6, arg1, arg5, arg4, arg2, 0);
                return var9;
            }
        } else {
            return new class503(this, arg5, arg0, arg6, arg3, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "X", descriptor = "(I)V", line = 579)
    public final void method1200(int arg0) {
        ++field8732;
        for (int var2 = super.field6824 + -1; var2 >= 0; --var2) {
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
        this.field8756.setSwapInterval(0);
        super.method1200(arg0);
    }

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "()Lhl;", line = 631)
    public final class482 method298() {
        ++field8743;
        int var1 = -1;
        if (~this.field8815.indexOf("nvidia") == 0) {
            if (~this.field8815.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field8815.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class482(var1, "OpenGL", this.field8821, this.field8816, 0L);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBLtfa;)V", line = 655)
    public final void method1198(int arg0, byte arg1, class31 arg2) {
        if (arg1 > 105) {
            ++field8735;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILeh;)V", line = 665)
    public final void method1174(int arg0, class328 arg1) {
        if (arg0 != 0) {
            this.method295();
        }
        ++field8747;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V", line = 676)
    public final void method1189(int arg0, Object arg1, Canvas arg2) {
        ++field8737;
        Long var4 = (Long) arg1;
        if (arg0 != -1) {
            method3481(102, -37);
        }
        if (!this.field8756.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "(II)V", line = 693)
    public final void method1178(int arg0, int arg1) {
        if (arg1 != 8) {
            this.field8802 = null;
        }
        ++field8785;
    }

    @OriginalMember(owner = "client!nfa", name = "KA", descriptor = "(IIII)[I", line = 703)
    public final int[] method277(int arg0, int arg1, int arg2, int arg3) {
        ++field8778;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + super.field6620 + -1 - arg1, arg2, 1, 32993, this.field8814, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "(B)V", line = 722)
    public final void method1183(byte arg0) {
        ++field8804;
        if (super.field6835 && !super.field6830) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        int var2 = 27 / ((arg0 - -89) / 35);
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(B)V", line = 736)
    public final void method1164(byte arg0) {
        if (!super.field6832) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
        if (arg0 <= 91) {
            this.field8821 = 24;
        }
        ++field8783;
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "(B)V", line = 752)
    private final void method3482(byte arg0) {
        if (this.field8823) {
            OpenGL.glPopMatrix();
        }
        ++field8779;
        if (super.field6844.method3673(-1)) {
            if (!this.field8823) {
                OpenGL.glLoadIdentity();
                OpenGL.glMultMatrixf(super.field6781.method3757((byte) 67, class67.field722), 0);
                this.method1195((byte) 48);
                this.method1151((byte) 119);
                this.field8823 = true;
            }
            if (this.field8823) {
                OpenGL.glPushMatrix();
            }
            if (!super.field6777) {
                OpenGL.glMultMatrixf(super.field6774.method3757((byte) 27, class67.field722), 0);
            }
        } else if (super.field6777) {
            OpenGL.glLoadIdentity();
            this.field8823 = false;
        } else {
            OpenGL.glLoadMatrixf(super.field6774.method3757((byte) 69, class67.field722), 0);
            this.field8823 = false;
        }
        int var2 = 56 % ((arg0 - -53) / 47);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBILvj;Lnb;)Lae;", line = 797)
    public final class228 method1185(int arg0, byte arg1, int arg2, class402 arg3, class271 arg4) {
        ++field8777;
        if (arg1 != 69) {
            this.field8807 = null;
        }
        if (!this.field8817 && (!class644.method3612(false, arg0) || !class644.method3612(false, arg2))) {
            return !this.field8819 ? new class503(this, arg3, arg4, class146.method799(arg0, arg1 + -181), class146.method799(arg2, -116)) : new class428(this, arg3, arg4, arg0, arg2);
        } else {
            return new class503(this, arg3, arg4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(FFF)V", line = 824)
    public final void method317(float arg0, float arg1, float arg2) {
        ++field8746;
    }

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "(II)Lor;", line = 831)
    public final class584 method1145(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field8787;
            if (~arg1 != -4) {
                return arg1 == 4 ? new class362(this, super.field6651, super.field6739) : super.method1145(arg0, arg1);
            } else {
                return new class267(this, super.field6651);
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILcea;IZ)V", line = 870)
    public final void method1188(int arg0, class196 arg1, int arg2, boolean arg3) {
        int var5 = 10 / ((arg2 - -37) / 62);
        OpenGL.glTexEnvi(8960, arg0 + 34184, class422.method2288((byte) -106, arg1));
        ++field8788;
        OpenGL.glTexEnvi(8960, arg0 + 34200, !arg3 ? 770 : 771);
    }

    @OriginalMember(owner = "client!nfa", name = "V", descriptor = "(I)V", line = 882)
    public final void method1186(int arg0) {
        if (arg0 != 20871) {
            this.field8819 = true;
        }
        class685.field9707[3] = 1.0F;
        class685.field9707[2] = super.field6873 * super.field6817;
        class685.field9707[1] = super.field6873 * super.field6861;
        ++field8758;
        class685.field9707[0] = super.field6873 * super.field6864;
        OpenGL.glLightModelfv(2899, class685.field9707, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "(I)V", line = 897)
    public final void method1149(int arg0) {
        ++field8796;
        if (super.field6813) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        if (arg0 != -1) {
            this.field8808 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "(II)V", line = 912)
    public final synchronized void method3483(int arg0, int arg1) {
        ++field8800;
        if (arg1 == 4925) {
            class270 var3 = new class270();
            var3.field3405 = (long) arg0;
            this.field8809.method3164(var3, 256);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lvj;Lnb;B)Z", line = 928)
    public final boolean method1169(class402 arg0, class271 arg1, byte arg2) {
        if (arg2 <= 122) {
            return true;
        } else {
            ++field8781;
            return true;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ldga;Ldga;FLdga;)Ldga;", line = 941)
    public final class190 method290(class190 arg0, class190 arg1, float arg2, class190 arg3) {
        ++field8764;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZZLcea;II)V", line = 957)
    public final void method1168(boolean arg0, boolean arg1, class196 arg2, int arg3, int arg4) {
        ++field8771;
        int var6 = 111 % ((-55 - arg4) / 56);
        OpenGL.glTexEnvi(8960, 34176 - -arg3, class422.method2288((byte) -119, arg2));
        if (!arg1) {
            OpenGL.glTexEnvi(8960, arg3 + 34192, !arg0 ? 768 : 769);
        } else {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg0 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "(I)V", line = 972)
    public final void method343(int arg0) {
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field8773;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "(I)V", line = 981)
    public final void method1167(int arg0) {
        OpenGL.glMatrixMode(5890);
        ++field8793;
        if (arg0 != 5) {
            this.field8818 = -86;
        }
        if (super.field6818[super.field6812] != class67.field721) {
            OpenGL.glLoadMatrixf(super.field6881[super.field6812].method3757((byte) 127, class67.field722), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nfa", name = "U", descriptor = "(I)V", line = 1000)
    public final void method1142(int arg0) {
        class685.field9707[1] = super.field6861 * super.field6854;
        class685.field9707[2] = super.field6854 * super.field6817;
        class685.field9707[3] = 1.0F;
        class685.field9707[0] = super.field6864 * super.field6854;
        ++field8795;
        OpenGL.glLightfv(16384, 4609, class685.field9707, 0);
        class685.field9707[0] = -super.field6852 * super.field6864;
        class685.field9707[1] = -super.field6852 * super.field6861;
        class685.field9707[2] = -super.field6852 * super.field6817;
        class685.field9707[arg0] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class685.field9707, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "()V", line = 1022)
    public final void method280() {
        ++field8805;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIBLvd;Ltj;II)V", line = 1030)
    public final void method1154(int arg0, int arg1, byte arg2, class36 arg3, class180 arg4, int arg5, int arg6) {
        ++field8744;
        if (arg2 < 16) {
            this.field8809 = null;
        }
        byte var8;
        int var9;
        if (class645.field9140 == arg3) {
            var8 = 1;
            var9 = arg5 * 2;
        } else if (class300.field3926 == arg3) {
            var8 = 3;
            var9 = arg5 + 1;
        } else if (class565.field8009 == arg3) {
            var9 = arg5 * 3;
            var8 = 4;
        } else if (class18.field166 == arg3) {
            var9 = arg5 + 2;
            var8 = 6;
        } else if (class359.field4706 != arg3) {
            var8 = 0;
            var9 = arg5;
        } else {
            var8 = 5;
            var9 = arg5 + 2;
        }
        class271 var10 = arg4.method1023(-10);
        class400 var11 = (class400) arg4;
        var11.method3507(25);
        OpenGL.glDrawElements(var8, var9, class680.method3799(var10, (byte) -42), var11.method3506(-66) - -((long) (var10.field3426 * arg0)));
    }

    @OriginalMember(owner = "client!nfa", name = "SA", descriptor = "()I", line = 1090)
    public final int method345() {
        ++field8742;
        return this.field8818;
    }

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "(Z)V", line = 1098)
    public final void method1162(boolean arg0) {
        ++field8755;
        OpenGL.glTexEnvi(8960, 34161, class39.method206(7939, super.field6828[super.field6812]));
        if (!arg0) {
            this.field8809 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIILvd;)V", line = 1110)
    public final void method1176(int arg0, int arg1, int arg2, class36 arg3) {
        if (arg1 != 1768) {
            this.field8812 = null;
        }
        ++field8782;
        int var5;
        byte var6;
        if (class645.field9140 != arg3) {
            if (class300.field3926 != arg3) {
                if (class565.field8009 == arg3) {
                    var5 = arg2 * 3;
                    var6 = 4;
                } else if (class18.field166 == arg3) {
                    var6 = 6;
                    var5 = arg2 + 2;
                } else if (class359.field4706 == arg3) {
                    var6 = 5;
                    var5 = arg2 + 2;
                } else {
                    var5 = arg2;
                    var6 = 0;
                }
            } else {
                var6 = 3;
                var5 = arg2 - -1;
            }
        } else {
            var5 = arg2 * 2;
            var6 = 1;
        }
        OpenGL.glDrawArrays(var6, arg0, var5);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1163)
    public final void method285(Rectangle[] arg0, int arg1) throws class295 {
        ++field8729;
        this.method341();
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)V", line = 1172)
    public final synchronized void method3484(int arg0, byte arg1, int arg2) {
        ++field8794;
        if (arg1 == -110) {
            class337 var4 = new class337(arg0);
            var4.field3405 = (long) arg2;
            this.field8806.method3164(var4, 256);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V", line = 1187)
    public final void method1191(Object arg0, int arg1, Canvas arg2) {
        int var4 = -31 % ((68 - arg1) / 50);
        ++field8803;
        Long var5 = (Long) arg0;
        this.field8756.releaseSurface(arg2, var5);
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "()Z", line = 1200)
    public final boolean method310() {
        ++field8733;
        return false;
    }

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "(I)V", line = 1208)
    public final void method1171(int arg0) {
        if (arg0 <= -3) {
            ++field8772;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(super.field6877, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(Z)V", line = 1224)
    public final void method346(boolean arg0) {
        ++field8770;
    }

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "(I)V", line = 1232)
    public final void method1177(int arg0) {
        if (arg0 != 1) {
            this.field8812 = null;
        }
        ++field8728;
        this.method3482((byte) 63);
    }

    @OriginalMember(owner = "client!nfa", name = "K", descriptor = "(I)V", line = 1243)
    public final void method1155(int arg0) {
        if (arg0 > -57) {
            this.method1166((byte) -57);
        }
        ++field8801;
    }

    @OriginalMember(owner = "client!nfa", name = "P", descriptor = "(I)V", line = 1253)
    public final void method1175(int arg0) {
        ++field8789;
        OpenGL.glViewport(super.field6816, super.field6850, super.field6684, super.field6620);
        if (arg0 != 1) {
            this.field8823 = false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "(I)V", line = 1264)
    public final void method1143(int arg0) {
        this.method3482((byte) -116);
        if (arg0 >= -25) {
            this.field8820 = true;
        }
        ++field8761;
    }

    @OriginalMember(owner = "client!nfa", name = "O", descriptor = "(I)V", line = 1276)
    public final void method1199(int arg0) {
        OpenGL.glDepthMask(super.field6820 && super.field6790);
        int var2 = -94 % ((arg0 - 83) / 43);
        ++field8799;
    }

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "()V", line = 1286)
    public final void method347() {
        OpenGL.glFinish();
        ++field8740;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;", line = 1294)
    public final Object method1197(Canvas arg0, int arg1) {
        if (arg1 != 10) {
            this.method280();
        }
        ++field8736;
        long var3 = this.field8756.prepareSurface(arg0);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "J", descriptor = "(I)V", line = 1314)
    public final void method1172(int arg0) {
        OpenGL.glTexEnvi(8960, 34162, class39.method206(7939, super.field6796[super.field6812]));
        int var2 = 68 / ((arg0 - 9) / 52);
        ++field8751;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lvj;Lnb;I)Z", line = 1329)
    public final boolean method1192(class402 arg0, class271 arg1, int arg2) {
        if (arg2 <= 37) {
            return false;
        } else {
            ++field8763;
            return true;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "()V", line = 1340)
    public final void method295() {
        ++field8748;
        super.method295();
        if (this.field8756 != null) {
            this.field8756.method3211();
            this.field8756.release();
            this.field8756 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z[[III)Lvfa;", line = 1356)
    public final class614 method1193(boolean arg0, int[][] arg1, int arg2, int arg3) {
        if (arg2 >= -51) {
            this.method1168(false, true, (class196) null, -39, 2);
        }
        ++field8762;
        return new class536(this, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "(I)V", line = 1368)
    public final void method1153(int arg0) {
        if (!super.field6837) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        ++field8792;
        if (arg0 != 29438) {
            this.field8819 = false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "M", descriptor = "(I)V", line = 1393)
    public final void method1163(int arg0) {
        if (arg0 != -15973) {
            this.method1176(86, -80, 55, (class36) null);
        }
        class685.field9707[2] = (float) class203.method1246(super.field6883, 255) / 255.0F;
        ++field8776;
        class685.field9707[1] = (float) class203.method1246(super.field6883, 65280) / 65280.0F;
        class685.field9707[3] = (float) (super.field6883 >>> 24) / 255.0F;
        class685.field9707[0] = (float) class203.method1246(16711680, super.field6883) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class685.field9707, 0);
    }

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "()V", line = 1408)
    public final void method324() {
        ++field8734;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLe;Ljo;I)V", line = 1503)
    public class621(OpenGL arg0, Canvas arg1, long arg2, class486 arg3, class303 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field8756 = arg0;
            this.field8756.method3212();
            this.field8815 = OpenGL.glGetString(7936).toLowerCase();
            this.field8816 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field8815.indexOf("microsoft") == 0 && ~this.field8815.indexOf("brian paul") == 0 && ~this.field8815.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class107.method674(var8.replace('.', ' '), 1, ' ');
                if (var9.length < 2) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class399.method2185(var9[0], (byte) -34);
                        int var11 = class399.method2185(var9[1], (byte) -34);
                        this.field8821 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field8821 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field8756.method3210("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field8756.method3210("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field6824 = var12[0];
                        if (~super.field6824 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field6797 = 8;
                            this.field8820 = this.field8756.method3210("GL_ARB_vertex_buffer_object");
                            super.field6836 = this.field8756.method3210("GL_ARB_multisample");
                            this.field8819 = this.field8756.method3210("GL_ARB_texture_rectangle");
                            super.field6863 = this.field8756.method3210("GL_ARB_texture_cube_map");
                            this.field8817 = this.field8756.method3210("GL_ARB_texture_non_power_of_two");
                            super.field6799 = this.field8756.method3210("GL_EXT_texture3D");
                            this.field8756.method3210("GL_ARB_vertex_shader");
                            this.field8822 = this.field8756.method3210("GL_ARB_vertex_program");
                            this.field8756.method3210("GL_ARB_fragment_shader");
                            this.field8756.method3210("GL_ARB_fragment_program");
                            this.field8814 = !Stream.method3440() ? 5121 : 33639;
                            if (this.field8816.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class107.method674(this.field8816.replace('/', ' '), 1, ' ');
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class630.method3530(66, var18.substring(1, 3))) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (~var18.length() <= -5 && class630.method3530(95, var18.substring(0, 4))) {
                                                    var13 = class399.method2185(var18.substring(0, 4), (byte) -34);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && ~var13 >= -9251) {
                                        super.field6799 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -8000) {
                                        this.field8820 = false;
                                    }
                                }
                                this.field8819 &= this.field8756.method3210("GL_ARB_half_float_pixel");
                            }
                            this.field8815.indexOf("intel");
                            if (this.field8820) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                            this.field8813 = new int[super.field6824];
                            OpenGL.glClear(16640);
                            this.field8756.swapBuffers();
                            OpenGL.glClear(16640);
                        }
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method295();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "()Z", line = 1419)
    public final boolean method291() {
        ++field8759;
        return false;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[FZIIZILvj;)Lae;", line = 1427)
    public final class228 method1201(int arg0, float[] arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, class402 arg7) {
        ++field8769;
        if (!arg5) {
            this.method1188(-120, (class196) null, 25, false);
        }
        if (!this.field8817 && (!class644.method3612(false, arg6) || !class644.method3612(false, arg3))) {
            if (!this.field8819) {
                class503 var9 = new class503(this, arg7, class271.field3433, class146.method799(arg6, -118), class146.method799(arg3, -113));
                var9.method2891(arg1, arg0, (byte) 88, arg3, arg7, 0, arg4, 0, arg6);
                return var9;
            } else {
                return new class428(this, arg7, arg6, arg3, arg1, arg4, arg0);
            }
        } else {
            return new class503(this, arg7, arg6, arg3, arg2, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "(B)V", line = 1455)
    public final void method1190(byte arg0) {
        ++field8724;
        if (arg0 >= 43) {
            if (class361.field4715 == super.field6874) {
                OpenGL.glBlendFunc(770, 771);
            } else if (class254.field3249 == super.field6874) {
                OpenGL.glBlendFunc(1, 1);
            } else if (class421.field5599 == super.field6874) {
                OpenGL.glBlendFunc(774, 1);
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "()V", line = 1476)
    public final void method341() throws class295 {
        this.field8756.swapBuffers();
        ++field8727;
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(IBI)V", line = 1487)
    public final synchronized void method3485(int arg0, byte arg1, int arg2) {
        ++field8738;
        if (arg1 == 44) {
            class337 var4 = new class337(arg0);
            var4.field3405 = (long) arg2;
            this.field8802.method3164(var4, 256);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BZ)Ltj;", line = 1667)
    public final class180 method1181(byte arg0, boolean arg1) {
        int var3 = 125 / ((9 - arg0) / 57);
        ++field8726;
        return new class400(this, class271.field3430, arg1);
    }

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "(B)V", line = 1683)
    public final void method1173(byte arg0) {
        if (arg0 > 26) {
            ++field8752;
            OpenGL.glScissor(super.field6816 - -super.field6858, super.field6850 + super.field6620 + -super.field6826, -super.field6858 + super.field6803, -super.field6853 + super.field6826);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B[Lada;)Leh;", line = 1695)
    public final class328 method1161(byte arg0, class150[] arg1) {
        ++field8750;
        if (arg0 < 76) {
            this.field8808 = null;
        }
        return null;
    }
}
