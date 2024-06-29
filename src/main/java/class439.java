import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class439 extends class449 {

    @OriginalMember(owner = "client!nv", name = "Mh", descriptor = "Lifa;")
    private class450 field5833 = new class450();

    @OriginalMember(owner = "client!nv", name = "gi", descriptor = "Lifa;")
    private class450 field5853 = new class450();

    @OriginalMember(owner = "client!nv", name = "ui", descriptor = "Lifa;")
    private class450 field5867 = new class450();

    @OriginalMember(owner = "client!nv", name = "zi", descriptor = "Lifa;")
    private class450 field5872 = new class450();

    @OriginalMember(owner = "client!nv", name = "Ai", descriptor = "Lifa;")
    private class450 field5873 = new class450();

    @OriginalMember(owner = "client!nv", name = "Bi", descriptor = "Lifa;")
    private class450 field5874 = new class450();

    @OriginalMember(owner = "client!nv", name = "Ci", descriptor = "Lifa;")
    private class450 field5875 = new class450();

    @OriginalMember(owner = "client!nv", name = "Gi", descriptor = "[Llq;")
    private class579[] field5879 = new class579[16];

    @OriginalMember(owner = "client!nv", name = "Ei", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5877 = new MapBuffer();

    @OriginalMember(owner = "client!nv", name = "Mi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5885 = new MapBuffer();

    @OriginalMember(owner = "client!nv", name = "Ni", descriptor = "I")
    private int field5886 = 0;

    @OriginalMember(owner = "client!nv", name = "Jh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5830;

    @OriginalMember(owner = "client!nv", name = "Vi", descriptor = "Ljava/lang/String;")
    private String field5894;

    @OriginalMember(owner = "client!nv", name = "Yi", descriptor = "Ljava/lang/String;")
    private String field5897;

    @OriginalMember(owner = "client!nv", name = "Ti", descriptor = "I")
    private int field5892;

    @OriginalMember(owner = "client!nv", name = "Ri", descriptor = "Z")
    public boolean field5890;

    @OriginalMember(owner = "client!nv", name = "Oi", descriptor = "Z")
    private boolean field5887;

    @OriginalMember(owner = "client!nv", name = "Xi", descriptor = "Z")
    private boolean field5896;

    @OriginalMember(owner = "client!nv", name = "Wi", descriptor = "Z")
    public boolean field5895;

    @OriginalMember(owner = "client!nv", name = "Ui", descriptor = "Z")
    public boolean field5893;

    @OriginalMember(owner = "client!nv", name = "Qi", descriptor = "Z")
    public boolean field5889;

    @OriginalMember(owner = "client!nv", name = "Pi", descriptor = "[I")
    public int[] field5888;

    @OriginalMember(owner = "client!nv", name = "Si", descriptor = "I")
    public int field5891;

    @OriginalMember(owner = "client!nv", name = "Jg", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!nv", name = "Kg", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!nv", name = "Lg", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!nv", name = "Mg", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!nv", name = "Ng", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!nv", name = "Og", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!nv", name = "Pg", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!nv", name = "Qg", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!nv", name = "Rg", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!nv", name = "Sg", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!nv", name = "Tg", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!nv", name = "Ug", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!nv", name = "Vg", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!nv", name = "Wg", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!nv", name = "Xg", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!nv", name = "Yg", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!nv", name = "Zg", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!nv", name = "ah", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!nv", name = "bh", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!nv", name = "ch", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!nv", name = "dh", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!nv", name = "eh", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!nv", name = "fh", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!nv", name = "gh", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!nv", name = "hh", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!nv", name = "ih", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!nv", name = "jh", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!nv", name = "kh", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!nv", name = "lh", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!nv", name = "mh", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!nv", name = "nh", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!nv", name = "oh", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!nv", name = "ph", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!nv", name = "qh", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!nv", name = "rh", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!nv", name = "sh", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!nv", name = "th", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!nv", name = "uh", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!nv", name = "vh", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!nv", name = "wh", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!nv", name = "xh", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!nv", name = "yh", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!nv", name = "zh", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!nv", name = "Ah", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!nv", name = "Bh", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!nv", name = "Ch", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!nv", name = "Dh", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!nv", name = "Eh", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!nv", name = "Fh", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!nv", name = "Gh", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!nv", name = "Hh", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!nv", name = "Ih", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!nv", name = "Kh", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!nv", name = "Lh", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!nv", name = "Nh", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!nv", name = "Oh", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!nv", name = "Ph", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!nv", name = "Qh", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!nv", name = "Rh", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!nv", name = "Sh", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!nv", name = "Th", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!nv", name = "Uh", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!nv", name = "Vh", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!nv", name = "Wh", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!nv", name = "Xh", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!nv", name = "Yh", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!nv", name = "Zh", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!nv", name = "ai", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!nv", name = "bi", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!nv", name = "ci", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!nv", name = "di", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!nv", name = "ei", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!nv", name = "fi", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!nv", name = "hi", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!nv", name = "ii", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!nv", name = "ji", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!nv", name = "ki", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!nv", name = "li", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!nv", name = "ni", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!nv", name = "oi", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!nv", name = "pi", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!nv", name = "qi", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!nv", name = "ri", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!nv", name = "si", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!nv", name = "ti", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!nv", name = "wi", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!nv", name = "xi", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!nv", name = "yi", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!nv", name = "Hi", descriptor = "I")
    private int field5880;

    @OriginalMember(owner = "client!nv", name = "Ki", descriptor = "J")
    private long field5883;

    @OriginalMember(owner = "client!nv", name = "mi", descriptor = "Lbka;")
    public static class179 field5859;

    @OriginalMember(owner = "client!nv", name = "Di", descriptor = "Z")
    private boolean field5876;

    @OriginalMember(owner = "client!nv", name = "Fi", descriptor = "Z")
    private boolean field5878;

    @OriginalMember(owner = "client!nv", name = "Ii", descriptor = "Z")
    private boolean field5881;

    @OriginalMember(owner = "client!nv", name = "Ji", descriptor = "Z")
    private boolean field5882;

    @OriginalMember(owner = "client!nv", name = "Li", descriptor = "Z")
    private boolean field5884;

    @OriginalMember(owner = "client!nv", name = "vi", descriptor = "[[[I")
    public static int[][][] field5868;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IJ)V", line = 3)
    public final synchronized void method2588(int arg0, long arg1) {
        ++field5847;
        class379 var4 = new class379();
        if (arg0 != 4654) {
            this.method47(-64);
        }
        var4.field4809 = arg1;
        this.field5875.method2732(var4, 21939);
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)V", line = 21)
    public final void method51(int arg0) {
        OpenGL.glTexEnvi(8960, 34161, class122.method950(34023, super.field6309[super.field6261]));
        if (arg0 != 0) {
            this.method75((byte) 115);
        }
        ++field5863;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;", line = 34)
    public final Object method77(byte arg0, Canvas arg1) {
        ++field5794;
        if (arg0 >= -44) {
            this.method47(-79);
        }
        long var3 = this.field5830.prepareSurface(arg1);
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "(I)V", line = 50)
    public final void method22(int arg0) {
        if (arg0 != 2) {
            this.method59((class366) null, -24);
        }
        ++field5805;
        int var2 = this.field5888[super.field6261];
        if (var2 != 0) {
            this.field5888[super.field6261] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(IIIID)V", line = 72)
    public final void method50(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field5820;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V", line = 82)
    public final void method27(Canvas arg0, Object arg1, int arg2) {
        ++field5804;
        if (arg2 != 16711680) {
            this.field5895 = false;
        }
        Long var4 = (Long) arg1;
        this.field5830.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZI[FBLpe;I)Lada;", line = 95)
    public final class175 method63(int arg0, int arg1, boolean arg2, int arg3, float[] arg4, byte arg5, class636 arg6, int arg7) {
        ++field5865;
        if (arg5 > -45) {
            this.method6();
        }
        if (!this.field5896 && (!class152.method1091(arg0, -37) || !class152.method1091(arg1, -108))) {
            if (!this.field5887) {
                class321 var9 = new class321(this, arg6, class748.field10388, class783.method4337(arg0, (byte) 77), class783.method4337(arg1, (byte) 118));
                var9.method1917(0, arg6, arg1, arg3, 0, (byte) 125, arg0, arg4, arg7);
                return var9;
            } else {
                return new class563(this, arg6, arg0, arg1, arg4, arg3, arg7);
            }
        } else {
            return new class321(this, arg6, arg0, arg1, arg2, arg4, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lsea;Lup;)Lnm;", line = 127)
    public final class499 method70(class726 arg0, class292 arg1) {
        ++field5803;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "(B)V", line = 135)
    public final void method80(byte arg0) {
        ++field5812;
        this.field5881 = false;
        if (arg0 < 84) {
            this.method18(-25);
        }
        this.method2595((byte) 78);
    }

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "(I)V", line = 149)
    public final void method12(int arg0) {
        this.method2595((byte) 125);
        if (arg0 == 15543) {
            ++field5838;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljia;Ljia;FLjia;)Ljia;", line = 166)
    public final class645 method65(class645 arg0, class645 arg1, float arg2, class645 arg3) {
        ++field5778;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "(I)V", line = 174)
    public final void method18(int arg0) {
        ++field5816;
        int var2 = 27 / ((arg0 - -2) / 42);
        OpenGL.glActiveTexture(super.field6261 + 33984);
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "(B)V", line = 185)
    public final void method34(byte arg0) {
        if (arg0 != 117) {
            this.method1((class422) null, (byte) -82, -8, (class686) null, -128, 2, -118);
        }
        if (super.field6316 && super.field6293 && ~super.field6231 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field5811;
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(I)V", line = 200)
    public final synchronized void method56(int arg0) {
        ++field5836;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5853.method2724((byte) 84)) {
            class365 var12 = (class365) this.field5853.method2730(-31260);
            class26.field415[var2++] = (int) var12.field4809;
            super.field6217 -= var12.field4537;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class26.field415, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class26.field415, 0);
            var2 = 0;
        }
        while (!this.field5867.method2724((byte) 59)) {
            class365 var11 = (class365) this.field5867.method2730(-31260);
            class26.field415[var2++] = (int) var11.field4809;
            super.field6211 -= var11.field4537;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class26.field415, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class26.field415, 0);
            var2 = 0;
        }
        while (!this.field5872.method2724((byte) 121)) {
            class365 var10 = (class365) this.field5872.method2730(-31260);
            class26.field415[var2++] = var10.field4537;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class26.field415, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class26.field415, 0);
            var2 = 0;
        }
        while (!this.field5873.method2724((byte) 72)) {
            class365 var9 = (class365) this.field5873.method2730(-31260);
            class26.field415[var2++] = (int) var9.field4809;
            super.field6213 -= var9.field4537;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class26.field415, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class26.field415, 0);
            boolean var4 = false;
        }
        while (!this.field5833.method2724((byte) -94)) {
            class365 var8 = (class365) this.field5833.method2730(-31260);
            OpenGL.glDeleteLists((int) var8.field4809, var8.field4537);
        }
        while (!this.field5874.method2724((byte) 124)) {
            class379 var7 = this.field5874.method2730(-31260);
            OpenGL.glDeleteProgramARB((int) var7.field4809);
        }
        while (!this.field5875.method2724((byte) 78)) {
            class379 var6 = this.field5875.method2730(-31260);
            OpenGL.glDeleteObjectARB(var6.field4809);
        }
        while (!this.field5833.method2724((byte) -116)) {
            class365 var5 = (class365) this.field5833.method2730(-31260);
            OpenGL.glDeleteLists((int) var5.field4809, var5.field4537);
        }
        if (this.method616() > 100663296 && ~class349.method2069(true) < ~(this.field5883 + 60000L)) {
            System.gc();
            this.field5883 = class349.method2069(true);
        }
        super.method56(var3);
    }

    @OriginalMember(owner = "client!nv", name = "na", descriptor = "(IIII)[I", line = 360)
    public final int[] method87(int arg0, int arg1, int arg2, int arg3) {
        ++field5829;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + -1 + super.field6096 - arg1, arg2, 1, 32993, this.field5891, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldw;ILpe;BI)Lada;", line = 379)
    public final class175 method3(class748 arg0, int arg1, class636 arg2, byte arg3, int arg4) {
        ++field5871;
        if (arg3 <= 9) {
            method2594((byte) -76);
        }
        if (!this.field5896 && (!class152.method1091(arg1, -10) || !class152.method1091(arg4, -3))) {
            return !this.field5887 ? new class321(this, arg2, arg0, class783.method4337(arg1, (byte) 73), class783.method4337(arg4, (byte) 86)) : new class563(this, arg2, arg0, arg1, arg4);
        } else {
            return new class321(this, arg2, arg0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lbt;I)V", line = 404)
    public class439(OpenGL arg0, Canvas arg1, long arg2, class162 arg3, class48 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field5830 = arg0;
            this.field5830.method3690();
            this.field5894 = OpenGL.glGetString(7936).toLowerCase();
            this.field5897 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field5894.indexOf("microsoft") == 0 && this.field5894.indexOf("brian paul") == -1 && this.field5894.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class708.method4017(' ', (byte) 32, var8.replace('.', ' '));
                if (var9.length >= 2) {
                    try {
                        int var10 = class445.method2623(0, var9[0]);
                        int var11 = class445.method2623(0, var9[1]);
                        this.field5892 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (~this.field5892 > -13) {
                        throw new RuntimeException("");
                    } else if (!this.field5830.method3689("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field5830.method3689("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field6272 = var12[0];
                        if (super.field6272 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field6264 = 8;
                            this.field5890 = this.field5830.method3689("GL_ARB_vertex_buffer_object");
                            super.field6270 = this.field5830.method3689("GL_ARB_multisample");
                            this.field5887 = this.field5830.method3689("GL_ARB_texture_rectangle");
                            super.field6240 = this.field5830.method3689("GL_ARB_texture_cube_map");
                            this.field5896 = this.field5830.method3689("GL_ARB_texture_non_power_of_two");
                            super.field6308 = this.field5830.method3689("GL_EXT_texture3D");
                            this.field5895 = this.field5830.method3689("GL_ARB_vertex_shader");
                            this.field5893 = this.field5830.method3689("GL_ARB_vertex_program");
                            this.field5889 = this.field5830.method3689("GL_ARB_fragment_shader");
                            this.field5830.method3689("GL_ARB_fragment_program");
                            this.field5888 = new int[super.field6272];
                            this.field5891 = !Stream.method3985() ? 5121 : 33639;
                            if (~this.field5897.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class708.method4017(' ', (byte) 32, this.field5897.replace('/', ' '));
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class480.method2854((byte) 106, var18.substring(1, 3))) {
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
                                                if (var18.length() >= 4 && class480.method2854((byte) 117, var18.substring(0, 4))) {
                                                    var13 = class445.method2623(0, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field5890 = false;
                                    }
                                    if (~var13 <= -7001 && var13 <= 9250) {
                                        super.field6308 = false;
                                    }
                                }
                                this.field5887 &= this.field5830.method3689("GL_ARB_half_float_pixel");
                            }
                            this.field5894.indexOf("intel");
                            if (this.field5890) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method559((byte) 1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "(B)V", line = 558)
    public final void method48(byte arg0) {
        if (arg0 == 82) {
            ++field5802;
            if (super.field6305) {
                OpenGL.glEnable(3042);
            } else {
                OpenGL.glDisable(3042);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "()Lub;", line = 573)
    public final class22 method60() {
        ++field5834;
        int var1 = -1;
        if (~this.field5894.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field5894.indexOf("intel") == -1) {
            if (this.field5894.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class22(var1, "OpenGL", this.field5892, this.field5897, 0L);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lsea;", line = 595)
    public final class726 method44(int arg0, int arg1) {
        ++field5792;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "ya", descriptor = "()V", line = 606)
    public final void method6() {
        ++field5796;
        this.method2666(8, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V", line = 616)
    public final void method75(byte arg0) {
        int var2 = 118 / ((arg0 - -81) / 34);
        if (!super.field6303) {
            OpenGL.glDisable(2929);
        } else {
            OpenGL.glEnable(2929);
        }
        ++field5862;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)V", line = 632)
    public final void method40(int arg0, int arg1, int arg2, int arg3) {
        ++field5823;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZIIII)Z", line = 641)
    public static final boolean method2589(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5779;
        if (!arg1) {
            method2591(126);
        }
        for (int var6 = arg2; ~arg3 <= ~var6; ++var6) {
            for (int var7 = arg0; arg4 >= var7; ++var7) {
                if (class676.field9280[var6][var7] == arg5 && class46.field611[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V", line = 673)
    public final void method73(byte arg0, Canvas arg1, Object arg2) {
        ++field5849;
        Long var4 = (Long) arg2;
        this.field5830.releaseSurface(arg1, var4);
        int var5 = 85 / ((arg0 - -10) / 61);
    }

    @OriginalMember(owner = "client!nv", name = "S", descriptor = "(I)V", line = 686)
    public final void method82(int arg0) {
        for (int var2 = super.field6272 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field5860;
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
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5830.setSwapInterval(0);
        super.method82(arg0);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "()V", line = 739)
    public final void method2() {
        ++field5856;
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "(B)F", line = 746)
    public final float method55(byte arg0) {
        if (arg0 != -46) {
            return 0.49243245F;
        } else {
            ++field5848;
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "(I)V", line = 757)
    public final void method7(int arg0) {
        if (super.field6306) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        ++field5819;
        if (arg0 != 8085) {
            field5859 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "(I)V", line = 772)
    public final void method90(int arg0) {
        ++field5841;
        if (super.field6239 && !super.field6249) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        int var2 = -11 % ((arg0 - 20) / 48);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lmga;ZBZI)V", line = 787)
    public final void method4(class738 arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 < 76) {
            this.field5893 = false;
        }
        ++field5814;
        OpenGL.glTexEnvi(8960, arg4 + 34176, class384.method2255(-121, arg0));
        if (arg1) {
            OpenGL.glTexEnvi(8960, arg4 + 34192, !arg3 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, arg4 + 34192, !arg3 ? 768 : 769);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 803)
    public final void method92(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class677 {
        ++field5818;
        this.method5(arg2, arg3);
    }

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "(II)V", line = 811)
    public final void method69(int arg0, int arg1) {
        ++field5843;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B", line = 819)
    public static final byte[] method2590(boolean arg0, Object arg1, boolean arg2) {
        ++field5821;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class458.method2773((byte) 127, var3) : var3;
        } else {
            if (!arg0) {
                field5868 = null;
            }
            if (arg1 instanceof class608) {
                class608 var4 = (class608) arg1;
                return var4.method1618(0);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "()V", line = 857)
    public final void method25() {
        ++field5787;
        if (super.field6148 > 0 || super.field6096 > 0) {
            int var1 = super.field6254;
            int var2 = super.field6296;
            int var3 = super.field6232;
            int var4 = super.field6266;
            this.method634();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2695(true);
            this.method2669((byte) 84, false);
            this.method2675(false, -8);
            this.method2672(115, false);
            this.method2666(8, false);
            this.method2643(-2, (class315) null);
            this.method2711(-1, false, -2, false);
            this.method2649((byte) 126, 1);
            this.method2699((byte) 14, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field6148, super.field6096, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method556(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)Lup;", line = 898)
    public final class292 method52(int arg0, int arg1) {
        ++field5789;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "(I)V", line = 908)
    public final void method78(int arg0) {
        class33.field514[arg0] = (float) class296.method1733(super.field6259, 65280) / 65280.0F;
        class33.field514[3] = (float) (super.field6259 >>> 24) / 255.0F;
        class33.field514[0] = (float) class296.method1733(16711680, super.field6259) / 1.671168E7F;
        ++field5784;
        class33.field514[2] = (float) class296.method1733(super.field6259, 255) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class33.field514, 0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLkja;II)V", line = 921)
    public final void method19(byte arg0, class686 arg1, int arg2, int arg3) {
        ++field5785;
        int var5 = -33 % ((-7 - arg0) / 46);
        byte var6;
        int var7;
        if (class674.field9244 == arg1) {
            var6 = 1;
            var7 = arg3 * 2;
        } else if (class161.field1985 != arg1) {
            if (class67.field920 != arg1) {
                if (class657.field9051 != arg1) {
                    if (class140.field1737 == arg1) {
                        var6 = 5;
                        var7 = arg3 + 2;
                    } else {
                        var7 = arg3;
                        var6 = 0;
                    }
                } else {
                    var7 = arg3 + 2;
                    var6 = 6;
                }
            } else {
                var6 = 4;
                var7 = arg3 * 3;
            }
        } else {
            var7 = arg3 + 1;
            var6 = 3;
        }
        OpenGL.glDrawArrays(var6, arg2, var7);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V", line = 974)
    public final void method31(boolean arg0) {
        ++field5791;
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)V", line = 982)
    public final void method88(byte arg0) {
        int var2 = -122 / ((arg0 - -23) / 40);
        ++field5817;
        if (super.field6351) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
    }

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "(I)V", line = 999)
    public final void method23(int arg0) {
        OpenGL.glViewport(super.field6251, super.field6304, super.field6148, super.field6096);
        if (arg0 > -85) {
            this.field5867 = null;
        }
        ++field5810;
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(Z)V", line = 1010)
    public final void method38(boolean arg0) {
        if (!arg0) {
            this.field5886 = 84;
        }
        if (!super.field6325) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        ++field5798;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)V", line = 1035)
    public final void method5(int arg0, int arg1) throws class677 {
        ++field5840;
        this.field5830.swapBuffers();
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZ)Lje;", line = 1045)
    public final class422 method15(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field5873 = null;
        }
        ++field5815;
        return new class523(this, class748.field10385, arg1);
    }

    @OriginalMember(owner = "client!nv", name = "bb", descriptor = "(I)V", line = 1058)
    public static void method2591(int arg0) {
        field5868 = null;
        field5859 = null;
        if (arg0 != -8204) {
            method2591(76);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "()Z", line = 1069)
    public final boolean method71() {
        ++field5850;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lnm;)V", line = 1077)
    public final void method67(class499 arg0) {
        ++field5866;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFF)V", line = 1084)
    public final void method61(float arg0, float arg1, float arg2) {
        ++field5827;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldw;Lpe;I)Z", line = 1092)
    public final boolean method42(class748 arg0, class636 arg1, int arg2) {
        ++field5844;
        int var4 = 3 / ((-49 - arg2) / 56);
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "(I)V", line = 1102)
    public final void method9(int arg0) {
        ++field5825;
        class33.field514[3] = 1.0F;
        class33.field514[2] = super.field6281 * super.field6255;
        class33.field514[0] = super.field6276 * super.field6255;
        if (arg0 >= -13) {
            this.field5885 = null;
        }
        class33.field514[1] = super.field6323 * super.field6255;
        OpenGL.glLightModelfv(2899, class33.field514, 0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lgha;I)V", line = 1118)
    public final void method59(class366 arg0, int arg1) {
        ++field5786;
        if (class204.field2443 != arg0) {
            int var3 = class620.method3527(9216, arg0);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        } else {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        }
        if (arg1 != 231) {
            this.field5895 = true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "(I)V", line = 1146)
    public final void method74(int arg0) {
        if (arg0 != -8) {
            this.field5853 = null;
        }
        ++field5781;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLnca;)V", line = 1156)
    public final void method85(byte arg0, class785 arg1) {
        ++field5783;
        class585[] var3 = ((class747) arg1).field10372;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        if (arg0 != 96) {
            this.field5897 = null;
        }
        boolean var7 = false;
        for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
            class585 var11 = var3[var8];
            class579 var12 = this.field5879[var8];
            int var13 = 0;
            int var14 = var12.method3338((byte) 48);
            long var15 = var12.method3862(-88);
            var12.method3858(arg0 ^ 34944);
            for (int var17 = 0; var17 < var11.method3365(arg0 + -96); ++var17) {
                class504 var18 = var11.method3363(var17, -3);
                if (class504.field7122 != var18) {
                    if (class504.field7125 != var18) {
                        if (class504.field7129 != var18) {
                            if (class504.field7133 != var18) {
                                if (class504.field7134 != var18) {
                                    if (class504.field7135 != var18) {
                                        if (class504.field7136 == var18) {
                                            OpenGL.glClientActiveTexture(var4++ + 33984);
                                            OpenGL.glTexCoordPointer(4, 5126, var14, var15 - -((long) var13));
                                        }
                                    } else {
                                        OpenGL.glClientActiveTexture(var4++ + 33984);
                                        OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                                    }
                                } else {
                                    OpenGL.glClientActiveTexture(33984 + var4++);
                                    OpenGL.glTexCoordPointer(2, 5126, var14, var15 - -((long) var13));
                                }
                            } else {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                            var5 = true;
                        }
                    } else {
                        OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                        var6 = true;
                    }
                } else {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, var15 - -((long) var13));
                }
                var13 += var18.field7124;
            }
        }
        if (!this.field5884 != !var7) {
            if (!var7) {
                OpenGL.glDisableClientState(32884);
            } else {
                OpenGL.glEnableClientState(32884);
            }
            this.field5884 = var7;
        }
        if (!var6 == this.field5882) {
            if (var6) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field5882 = var6;
        }
        if (this.field5876 != var5) {
            if (!var5) {
                OpenGL.glDisableClientState(32886);
            } else {
                OpenGL.glEnableClientState(32886);
            }
            this.field5876 = var5;
        }
        if (this.field5880 >= var4) {
            if (this.field5880 > var4) {
                for (int var9 = var4; var9 < this.field5880; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field5880 = var4;
                return;
            }
        } else {
            for (int var10 = this.field5880; var10 < var4; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field5880 = var4;
        }
    }

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "(I)V", line = 1320)
    public final void method21(int arg0) {
        super.field6258 = (float) (-super.field6234 + super.field6227);
        ++field5799;
        super.field6278 = super.field6258 - (float) super.field6231;
        if ((float) super.field6322 > super.field6278) {
            super.field6278 = (float) super.field6322;
        }
        OpenGL.glFogf(2915, super.field6278);
        OpenGL.glFogf(2916, super.field6258);
        class33.field514[0] = (float) class296.method1733(16711680, super.field6307) / 1.671168E7F;
        class33.field514[1] = (float) class296.method1733(super.field6307, 65280) / 65280.0F;
        class33.field514[2] = (float) class296.method1733(super.field6307, 255) / 255.0F;
        if (arg0 == -23392) {
            OpenGL.glFogfv(2918, class33.field514, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "(B)V", line = 1342)
    public final void method8(byte arg0) {
        ++field5808;
        OpenGL.glMatrixMode(5890);
        if (arg0 >= 85) {
            if (super.field6311[super.field6261] == class533.field7504) {
                OpenGL.glLoadIdentity();
            } else {
                OpenGL.glLoadMatrixf(super.field6294[super.field6261].method1523(class28.field430, false), 0);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "(B)V", line = 1365)
    public final void method14(byte arg0) {
        if (arg0 != -9) {
            this.method82(-24);
        }
        ++field5864;
        OpenGL.glTexEnvi(8960, 34162, class122.method950(34023, super.field6298[super.field6261]));
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(BI)V", line = 1376)
    public final void method30(byte arg0, int arg1) {
        if (arg0 != 25) {
            this.method36();
        }
        ++field5855;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lje;BILkja;III)V", line = 1388)
    public final void method1(class422 arg0, byte arg1, int arg2, class686 arg3, int arg4, int arg5, int arg6) {
        ++field5828;
        int var8;
        byte var9;
        if (class674.field9244 == arg3) {
            var8 = arg5 * 2;
            var9 = 1;
        } else if (class161.field1985 != arg3) {
            if (class67.field920 != arg3) {
                if (class657.field9051 == arg3) {
                    var9 = 6;
                    var8 = arg5 + 2;
                } else if (class140.field1737 != arg3) {
                    var9 = 0;
                    var8 = arg5;
                } else {
                    var8 = arg5 - -2;
                    var9 = 5;
                }
            } else {
                var8 = arg5 * 3;
                var9 = 4;
            }
        } else {
            var8 = arg5 - -1;
            var9 = 3;
        }
        class748 var10 = arg0.method2528(true);
        if (arg1 != 10) {
            this.field5878 = false;
        }
        class523 var11 = (class523) arg0;
        var11.method3858(35040);
        OpenGL.glDrawElements(var9, var8, class468.method2809(var10, arg1 + 5110), var11.method3862(-34) - -((long) (var10.field10374 * arg4)));
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)V", line = 1447)
    public final synchronized void method2592(int arg0, int arg1, int arg2) {
        ++field5809;
        if (arg2 != 771) {
            this.method8((byte) -76);
        }
        class365 var4 = new class365(arg0);
        var4.field4809 = (long) arg1;
        this.field5867.method2732(var4, 21939);
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(II)V", line = 1464)
    public final synchronized void method2593(int arg0, int arg1) {
        ++field5858;
        if (arg1 < -121) {
            class379 var3 = new class379();
            var3.field4809 = (long) arg0;
            this.field5874.method2732(var3, 21939);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI[[II)Lmia;", line = 1478)
    public final class69 method46(boolean arg0, int arg1, int[][] arg2, int arg3) {
        int var5 = 113 % ((arg1 - 63) / 52);
        ++field5852;
        return new class447(this, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V", line = 1490)
    public final void method58(Canvas arg0, Object arg1, int arg2) {
        int var4 = 61 % ((arg2 - -51) / 50);
        ++field5782;
        Long var5 = (Long) arg1;
        if (!this.field5830.setSurface(var5)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[Lpo;)Lnca;", line = 1507)
    public final class785 method68(int arg0, class585[] arg1) {
        if (arg0 < 76) {
            this.method86(true);
        }
        ++field5780;
        return new class747(arg1);
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "(I)V", line = 1523)
    public final void method47(int arg0) {
        if (arg0 == 0) {
            OpenGL.glScissor(super.field6254 + super.field6251, super.field6304 + super.field6096 + -super.field6266, -super.field6254 + super.field6296, -super.field6232 + super.field6266);
            ++field5861;
        }
    }

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "()Z", line = 1534)
    public final boolean method54() {
        ++field5837;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "(B)Z", line = 1545)
    public static final boolean method2594(byte arg0) {
        ++field5846;
        try {
            if (~class558.field7751 == -3) {
                if (class332.field4110 == null) {
                    class332.field4110 = class24.method249(class8.field138, class174.field2167, class677.field9292);
                    if (class332.field4110 == null) {
                        return false;
                    }
                }
                if (class16.field300 == null) {
                    class16.field300 = new class678(class3.field39, class250.field2939);
                }
                class502 var1 = class665.field9130;
                if (class300.field3598 != null) {
                    var1 = class300.field3598;
                }
                if (var1.method2990(class16.field300, class274.field3212, (byte) -117, class332.field4110, 22050)) {
                    class665.field9130 = var1;
                    class665.field9130.method3005(0);
                    if (class120.field1543 > 0) {
                        class558.field7751 = 3;
                        class665.field9130.method3014(~class486.field6774 > ~class120.field1543 ? class486.field6774 : class120.field1543, -2);
                        for (int var2 = 0; ~var2 > ~class589.field8022.length; ++var2) {
                            class665.field9130.method3007(class589.field8022[var2], -93, var2);
                            class589.field8022[var2] = 255;
                        }
                    } else {
                        class558.field7751 = 0;
                        class665.field9130.method3014(class486.field6774, -2);
                        for (int var3 = 0; var3 < class589.field8022.length; ++var3) {
                            class665.field9130.method3007(class589.field8022[var3], -59, var3);
                            class589.field8022[var3] = 255;
                        }
                    }
                    if (class300.field3598 == null) {
                        if (~class432.field5708 >= -1L) {
                            class665.field9130.method2996(class678.field9298, class332.field4110, 20309);
                        } else {
                            class665.field9130.method2992(class432.field5708, class678.field9298, (byte) -107, class332.field4110, true);
                        }
                    }
                    if (class83.field1129 != null) {
                        class83.field1129.method1554(false, class665.field9130);
                    }
                    class432.field5708 = 0L;
                    class300.field3598 = null;
                    class16.field300 = null;
                    class8.field138 = null;
                    class332.field4110 = null;
                    return true;
                }
            }
            if (arg0 > -110) {
                method2591(8);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class665.field9130.method3012(552725320);
            class300.field3598 = null;
            class332.field4110 = null;
            class8.field138 = null;
            class16.field300 = null;
            class558.field7751 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)Loda;", line = 1649)
    public final class129 method57(int arg0, boolean arg1) {
        if (arg0 != 14) {
            return null;
        } else {
            ++field5857;
            return new class579(this, arg1);
        }
    }

    @OriginalMember(owner = "client!nv", name = "W", descriptor = "(I)V", line = 1661)
    public final void method39(int arg0) {
        this.method2706(92);
        ++field5793;
        int var2;
        for (var2 = 0; var2 < super.field6262; ++var2) {
            class515 var3 = super.field6299[var2];
            int var4 = var3.method3089(25215);
            int var5 = var2 + 16386;
            float var6 = var3.method3083(123) / 255.0F;
            class33.field514[0] = (float) var3.method3084(0);
            class33.field514[1] = (float) var3.method3086((byte) -112);
            class33.field514[2] = (float) var3.method3085(true);
            class33.field514[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class33.field514, 0);
            class33.field514[3] = 1.0F;
            class33.field514[0] = var6 * (float) class296.method1733(var4 >> 16, 255);
            class33.field514[2] = (float) class296.method1733(var4, 255) * var6;
            class33.field514[1] = var6 * (float) class296.method1733(255, var4 >> 8);
            OpenGL.glLightfv(var5, 4609, class33.field514, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3088(21915) * var3.method3088(21915)));
            OpenGL.glEnable(var5);
        }
        if (arg0 <= -111) {
            while (var2 < super.field6247) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            super.method39(-125);
        }
    }

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "(B)V", line = 1708)
    public final void method72(byte arg0) {
        class33.field514[3] = 1.0F;
        class33.field514[1] = super.field6323 * super.field6280;
        ++field5831;
        class33.field514[0] = super.field6280 * super.field6276;
        class33.field514[2] = super.field6281 * super.field6280;
        OpenGL.glLightfv(16384, 4609, class33.field514, 0);
        class33.field514[1] = -super.field6241 * super.field6323;
        class33.field514[0] = -super.field6241 * super.field6276;
        class33.field514[2] = -super.field6241 * super.field6281;
        class33.field514[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class33.field514, 0);
        if (arg0 >= -73) {
            this.field5893 = false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "()V", line = 1728)
    public final void method53() {
        super.method53();
        ++field5806;
        if (this.field5830 != null) {
            this.field5830.method3691();
            this.field5830.release();
            this.field5830 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILoda;I)V", line = 1743)
    public final void method64(int arg0, class129 arg1, int arg2) {
        ++field5790;
        if (arg0 != 0) {
            this.method1((class422) null, (byte) -42, 69, (class686) null, 98, -17, 93);
        }
        this.field5879[arg2] = (class579) arg1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZZ[I)Lada;", line = 1754)
    public final class175 method83(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int[] arg6) {
        ++field5822;
        if (arg4) {
            this.field5890 = false;
        }
        if (!this.field5896 && (!class152.method1091(arg0, -74) || !class152.method1091(arg2, -114))) {
            if (!this.field5887) {
                class321 var8 = new class321(this, class141.field1759, class748.field10384, class783.method4337(arg0, (byte) 36), class783.method4337(arg2, (byte) 113));
                var8.method1194(arg0, arg1, 0, arg2, arg6, arg3, (byte) -96, 0);
                return var8;
            } else {
                return new class563(this, arg0, arg2, arg6, arg1, arg3);
            }
        } else {
            return new class321(this, arg0, arg2, arg5, arg6, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZLmga;)V", line = 1791)
    public final void method91(int arg0, int arg1, boolean arg2, class738 arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, class384.method2255(-97, arg3));
        ++field5826;
        OpenGL.glTexEnvi(8960, arg1 + 34200, !arg2 ? 770 : 771);
        if (arg0 != 461166232) {
            this.field5882 = true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "GA", descriptor = "(I)V", line = 1803)
    public final void method13(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field5797;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(II)Lbda;", line = 1812)
    public final class532 method16(int arg0, int arg1) {
        ++field5788;
        if (arg1 != -12567) {
            this.method68(45, (class585[]) null);
        }
        if (arg0 != 3) {
            if (arg0 != 4) {
                return ~arg0 == -9 ? new class101(this, super.field6141, super.field6105) : super.method16(arg0, -12567);
            } else {
                return new class197(this, super.field6141, super.field6105);
            }
        } else {
            return new class223(this, super.field6141);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lpe;ILdw;)Z", line = 1858)
    public final boolean method62(class636 arg0, int arg1, class748 arg2) {
        if (arg1 != -4435) {
            return true;
        } else {
            ++field5801;
            return true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "()I", line = 1871)
    public final int method81() {
        ++field5795;
        return this.field5886;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[BIIZLpe;II)Lada;", line = 1881)
    public final class175 method11(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, class636 arg5, int arg6, int arg7) {
        ++field5842;
        if (arg2 >= -92) {
            this.field5874 = null;
        }
        if (!this.field5896 && (!class152.method1091(arg6, -8) || !class152.method1091(arg3, -64))) {
            if (this.field5887) {
                return new class563(this, arg5, arg6, arg3, arg1, arg7, arg0);
            } else {
                class321 var9 = new class321(this, arg5, class748.field10384, class783.method4337(arg6, (byte) 39), class783.method4337(arg3, (byte) 39));
                var9.method1195(0, 0, -6201, arg7, arg1, arg0, arg5, arg6, arg3);
                return var9;
            }
        } else {
            return new class321(this, arg5, arg6, arg3, arg4, arg1, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIIIBLpe;)Lch;", line = 1911)
    public final class489 method26(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, class636 arg5) {
        ++field5854;
        return arg4 != -90 ? null : new class610(this, arg5, arg3, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(Z)V", line = 1923)
    public final void method86(boolean arg0) {
        if (arg0) {
            ++field5870;
            OpenGL.glLightfv(16384, 4611, super.field6283, 0);
            OpenGL.glLightfv(16385, 4611, super.field6233, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "(I)V", line = 1935)
    public final void method43(int arg0) {
        ++field5845;
        if (arg0 != 1) {
            this.method59((class366) null, 72);
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field6268, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "(B)V", line = 1948)
    private final void method2595(byte arg0) {
        ++field5832;
        if (this.field5878) {
            OpenGL.glPopMatrix();
        }
        if (super.field6292.method3844(25596)) {
            if (!this.field5881) {
                OpenGL.glLoadMatrixf(super.field6224.method1523(class28.field430, false), 0);
                this.field5881 = true;
                this.method86(true);
                this.method39(-113);
            }
            if (super.field6218) {
                this.field5878 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field6219.method1523(class28.field430, false), 0);
                this.field5878 = true;
            }
        } else if (!super.field6218) {
            OpenGL.glLoadMatrixf(super.field6219.method1523(class28.field430, false), 0);
            this.field5878 = false;
        } else {
            OpenGL.glLoadIdentity();
            this.field5878 = false;
        }
        int var2 = -113 / ((arg0 - 23) / 46);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(BII)V", line = 1995)
    public final synchronized void method2596(byte arg0, int arg1, int arg2) {
        ++field5824;
        if (arg0 != 62) {
            this.field5877 = null;
        }
        class365 var4 = new class365(arg1);
        var4.field4809 = (long) arg2;
        this.field5853.method2732(var4, 21939);
    }

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "()V", line = 2009)
    public final void method20() {
        ++field5839;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(IZ)V", line = 2017)
    public final void method41(int arg0, boolean arg1) {
        ++field5835;
        if (arg0 != 0) {
            this.field5873 = null;
        }
        if (arg1) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
    }

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "(B)V", line = 2032)
    public final void method33(byte arg0) {
        OpenGL.glDepthMask(super.field6236 && super.field6238);
        ++field5800;
        if (arg0 != 34) {
            this.method77((byte) -48, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "(B)V", line = 2043)
    public final void method29(byte arg0) {
        int var2 = 8 / ((arg0 - -85) / 39);
        if (class303.field3614 != super.field6250) {
            if (class243.field2863 != super.field6250) {
                if (class120.field1531 == super.field6250) {
                    OpenGL.glBlendFunc(774, 1);
                }
            } else {
                OpenGL.glBlendFunc(1, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
        ++field5813;
    }

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "()V", line = 2068)
    public final void method32() {
        ++field5807;
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "()V", line = 2083)
    public final void method36() {
        ++field5851;
        OpenGL.glFinish();
    }
}
