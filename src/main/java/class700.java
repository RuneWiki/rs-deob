import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class700 extends class528 {

    @OriginalMember(owner = "client!kd", name = "Mg", descriptor = "Ldc;")
    private class302 field9861 = new class302();

    @OriginalMember(owner = "client!kd", name = "ai", descriptor = "Ldc;")
    private class302 field9927 = new class302();

    @OriginalMember(owner = "client!kd", name = "bi", descriptor = "Ldc;")
    private class302 field9928 = new class302();

    @OriginalMember(owner = "client!kd", name = "di", descriptor = "Ldc;")
    private class302 field9930 = new class302();

    @OriginalMember(owner = "client!kd", name = "ei", descriptor = "Ldc;")
    private class302 field9931 = new class302();

    @OriginalMember(owner = "client!kd", name = "fi", descriptor = "Ldc;")
    private class302 field9932 = new class302();

    @OriginalMember(owner = "client!kd", name = "gi", descriptor = "Ldc;")
    private class302 field9933 = new class302();

    @OriginalMember(owner = "client!kd", name = "hi", descriptor = "[Lol;")
    private class386[] field9934 = new class386[16];

    @OriginalMember(owner = "client!kd", name = "oi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field9941 = new MapBuffer();

    @OriginalMember(owner = "client!kd", name = "qi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field9943 = new MapBuffer();

    @OriginalMember(owner = "client!kd", name = "ui", descriptor = "I")
    private int field9947 = 0;

    @OriginalMember(owner = "client!kd", name = "Qh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field9917;

    @OriginalMember(owner = "client!kd", name = "xi", descriptor = "Ljava/lang/String;")
    private String field9950;

    @OriginalMember(owner = "client!kd", name = "si", descriptor = "Ljava/lang/String;")
    private String field9945;

    @OriginalMember(owner = "client!kd", name = "wi", descriptor = "I")
    private int field9949;

    @OriginalMember(owner = "client!kd", name = "yi", descriptor = "Z")
    public boolean field9951;

    @OriginalMember(owner = "client!kd", name = "vi", descriptor = "Z")
    private boolean field9948;

    @OriginalMember(owner = "client!kd", name = "ri", descriptor = "Z")
    private boolean field9944;

    @OriginalMember(owner = "client!kd", name = "Ci", descriptor = "Z")
    public boolean field9955;

    @OriginalMember(owner = "client!kd", name = "ti", descriptor = "Z")
    public boolean field9946;

    @OriginalMember(owner = "client!kd", name = "Ai", descriptor = "Z")
    public boolean field9953;

    @OriginalMember(owner = "client!kd", name = "zi", descriptor = "[I")
    public int[] field9952;

    @OriginalMember(owner = "client!kd", name = "Bi", descriptor = "I")
    public int field9954;

    @OriginalMember(owner = "client!kd", name = "wg", descriptor = "Z")
    public static boolean field9845 = false;

    @OriginalMember(owner = "client!kd", name = "eh", descriptor = "[Lds;")
    public static class14[] field9879 = new class14[8];

    @OriginalMember(owner = "client!kd", name = "tg", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!kd", name = "ug", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!kd", name = "vg", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!kd", name = "xg", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!kd", name = "yg", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!kd", name = "zg", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!kd", name = "Ag", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!kd", name = "Bg", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!kd", name = "Cg", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!kd", name = "Dg", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!kd", name = "Eg", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!kd", name = "Fg", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!kd", name = "Gg", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!kd", name = "Hg", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!kd", name = "Ig", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!kd", name = "Jg", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!kd", name = "Kg", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!kd", name = "Lg", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!kd", name = "Ng", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!kd", name = "Og", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!kd", name = "Pg", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!kd", name = "Qg", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!kd", name = "Rg", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!kd", name = "Sg", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!kd", name = "Tg", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!kd", name = "Vg", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!kd", name = "Wg", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!kd", name = "Xg", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!kd", name = "Yg", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!kd", name = "Zg", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!kd", name = "ah", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!kd", name = "bh", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!kd", name = "ch", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!kd", name = "dh", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!kd", name = "fh", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!kd", name = "gh", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!kd", name = "hh", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!kd", name = "ih", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!kd", name = "jh", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!kd", name = "kh", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!kd", name = "lh", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!kd", name = "mh", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!kd", name = "nh", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!kd", name = "oh", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!kd", name = "ph", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!kd", name = "qh", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!kd", name = "rh", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!kd", name = "sh", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!kd", name = "th", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!kd", name = "uh", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!kd", name = "vh", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!kd", name = "wh", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!kd", name = "xh", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!kd", name = "yh", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!kd", name = "zh", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!kd", name = "Ah", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!kd", name = "Bh", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!kd", name = "Ch", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!kd", name = "Dh", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!kd", name = "Eh", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!kd", name = "Fh", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!kd", name = "Gh", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!kd", name = "Hh", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!kd", name = "Ih", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!kd", name = "Jh", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!kd", name = "Kh", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!kd", name = "Lh", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!kd", name = "Mh", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!kd", name = "Nh", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!kd", name = "Oh", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!kd", name = "Ph", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!kd", name = "Rh", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!kd", name = "Sh", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!kd", name = "Th", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!kd", name = "Uh", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!kd", name = "Vh", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!kd", name = "Wh", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!kd", name = "Xh", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!kd", name = "Yh", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!kd", name = "Zh", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!kd", name = "ci", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!kd", name = "pi", descriptor = "I")
    private int field9942;

    @OriginalMember(owner = "client!kd", name = "ii", descriptor = "J")
    private long field9935;

    @OriginalMember(owner = "client!kd", name = "Ug", descriptor = "Lla;")
    public static class393 field9869;

    @OriginalMember(owner = "client!kd", name = "ji", descriptor = "Z")
    private boolean field9936;

    @OriginalMember(owner = "client!kd", name = "ki", descriptor = "Z")
    private boolean field9937;

    @OriginalMember(owner = "client!kd", name = "li", descriptor = "Z")
    private boolean field9938;

    @OriginalMember(owner = "client!kd", name = "mi", descriptor = "Z")
    private boolean field9939;

    @OriginalMember(owner = "client!kd", name = "ni", descriptor = "Z")
    private boolean field9940;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "(I)V", line = 3)
    public static void method3925(int arg0) {
        field9879 = null;
        field9869 = null;
        if (arg0 != -3686) {
            field9845 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "(I)V", line = 14)
    public final void method770(int arg0) {
        for (int var2 = super.field7685 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field9865;
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
        this.field9917.setSwapInterval(0);
        super.method770(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V", line = 67)
    public final synchronized void method3926(long arg0, int arg1) {
        ++field9912;
        class381 var4 = new class381();
        var4.field5740 = arg0;
        this.field9933.method1909(var4, (byte) -81);
        if (arg1 > -61) {
            this.field9951 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Lega;", line = 81)
    public final class184 method806(int arg0, boolean arg1) {
        ++field9929;
        if (arg0 != 10) {
            this.method3930(-59, 6);
        }
        return new class386(this, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "(I)V", line = 93)
    public final void method763(int arg0) {
        if (arg0 > -53) {
            this.method804(false, 77);
        }
        OpenGL.glViewport(super.field7699, super.field7750, super.field7583, super.field7570);
        ++field9871;
    }

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "(I)V", line = 104)
    public final void method761(int arg0) {
        ++field9873;
        OpenGL.glDepthMask(super.field7771 && super.field7779);
        if (arg0 != 2078023448) {
            this.method713(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;", line = 116)
    public final Object method772(Canvas arg0, byte arg1) {
        ++field9897;
        long var3 = this.field9917.prepareSurface(arg0);
        int var5 = -25 / ((arg1 - 56) / 48);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "(I)V", line = 132)
    public final void method790(int arg0) {
        ++field9883;
        int var2 = 31 % ((arg0 - 11) / 51);
        this.method3065(0);
        int var3;
        for (var3 = 0; var3 < super.field7745; ++var3) {
            class334 var4 = super.field7687[var3];
            int var5 = var4.method2049(0);
            int var6 = var3 + 16386;
            float var7 = var4.method2053((byte) 117) / 255.0F;
            class687.field9698[0] = (float) var4.method2050((byte) -36);
            class687.field9698[1] = (float) var4.method2045(0);
            class687.field9698[2] = (float) var4.method2046(true);
            class687.field9698[3] = 1.0F;
            OpenGL.glLightfv(var6, 4611, class687.field9698, 0);
            class687.field9698[0] = var7 * (float) (class425.method2563(var5, 16748415) >> 16);
            class687.field9698[3] = 1.0F;
            class687.field9698[2] = var7 * (float) class425.method2563(var5, 255);
            class687.field9698[1] = var7 * (float) (class425.method2563(var5, 65515) >> 8);
            OpenGL.glLightfv(var6, 4609, class687.field9698, 0);
            OpenGL.glLightf(var6, 4617, 1.0F / (float) (var4.method2051(-520326527) * var4.method2051(-520326527)));
            OpenGL.glEnable(var6);
        }
        while (~super.field7712 < ~var3) {
            OpenGL.glDisable(var3 + 16386);
            ++var3;
        }
        super.method790(100);
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(Z)V", line = 179)
    public final void method779(boolean arg0) {
        class687.field9698[0] = super.field7776 * super.field7741;
        class687.field9698[3] = 1.0F;
        class687.field9698[2] = super.field7741 * super.field7734;
        ++field9910;
        class687.field9698[1] = super.field7741 * super.field7737;
        OpenGL.glLightfv(16384, 4609, class687.field9698, 0);
        class687.field9698[1] = -super.field7772 * super.field7737;
        class687.field9698[3] = 1.0F;
        class687.field9698[0] = -super.field7772 * super.field7776;
        class687.field9698[2] = -super.field7772 * super.field7734;
        if (!arg0) {
            OpenGL.glLightfv(16385, 4609, class687.field9698, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V", line = 199)
    public final void method798(byte arg0) {
        ++field9913;
        if (arg0 != 118) {
            this.method705();
        }
        this.method3927(false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lf;Z)V", line = 214)
    public final void method673(class256 arg0, boolean arg1) {
        ++field9855;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(IZ)V", line = 223)
    public final void method767(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.method787((byte) 56);
        }
        ++field9888;
        if (!arg1) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Ldm;I)Lcl;", line = 238)
    public final class314 method781(class680[] arg0, int arg1) {
        ++field9864;
        if (arg1 >= -35) {
            this.method806(7, false);
        }
        return new class6(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)F", line = 250)
    public final float method784(int arg0) {
        ++field9911;
        return arg0 != 128 ? -1.0687884F : 0.0F;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 261)
    public final void method795(byte arg0) {
        ++field9902;
        if (arg0 <= -30) {
            OpenGL.glTexEnvi(8960, 34161, class76.method440(118, super.field7744[super.field7759]));
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)Lip;", line = 273)
    public final class532 method800(boolean arg0, int arg1) {
        ++field9898;
        if (arg1 != -25475) {
            this.method650();
        }
        return new class557(this, class106.field1574, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILid;ILip;I)V", line = 284)
    public final void method756(int arg0, int arg1, int arg2, class388 arg3, int arg4, class532 arg5, int arg6) {
        ++field9926;
        if (arg2 != 11897) {
            this.field9941 = null;
        }
        byte var8;
        int var9;
        if (class533.field7844 != arg3) {
            if (class454.field6543 == arg3) {
                var8 = 3;
                var9 = arg4 + 1;
            } else if (class433.field6280 != arg3) {
                if (class223.field2949 == arg3) {
                    var9 = arg4 + 2;
                    var8 = 6;
                } else if (class143.field2066 != arg3) {
                    var8 = 0;
                    var9 = arg4;
                } else {
                    var8 = 5;
                    var9 = arg4 - -2;
                }
            } else {
                var8 = 4;
                var9 = arg4 * 3;
            }
        } else {
            var8 = 1;
            var9 = arg4 * 2;
        }
        class106 var10 = arg5.method988(false);
        class557 var11 = (class557) arg5;
        var11.method1591((byte) -31);
        OpenGL.glDrawElements(var8, var9, class115.method854(var10, (byte) -118), var11.method1590(116) + (long) (var10.field1564 * arg0));
    }

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "(I)V", line = 341)
    public final void method757(int arg0) {
        ++field9894;
        int var2 = this.field9952[super.field7759];
        if (~var2 != -1) {
            this.field9952[super.field7759] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        int var3 = 48 / ((arg0 - 59) / 58);
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(B)V", line = 360)
    public final void method774(byte arg0) {
        ++field9848;
        if (arg0 != 119) {
            this.method666();
        }
        this.field9939 = false;
        this.method3927(false);
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "()Z", line = 372)
    public final boolean method650() {
        ++field9859;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V", line = 382)
    public final void method760(byte arg0) {
        ++field9872;
        if (arg0 != -3) {
            this.method756(81, -43, -66, (class388) null, -17, (class532) null, 12);
        }
        if (super.field7804) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([FIIILwu;ZII)Lfj;", line = 399)
    public final class75 method755(float[] arg0, int arg1, int arg2, int arg3, class149 arg4, boolean arg5, int arg6, int arg7) {
        if (arg6 != -1) {
            field9869 = null;
        }
        ++field9880;
        if (!this.field9944 && (!class346.method2145(-1, arg2) || !class346.method2145(arg6, arg1))) {
            if (!this.field9948) {
                class119 var9 = new class119(this, arg4, class106.field1577, class240.method1478(-28325, arg2), class240.method1478(arg6 + -28324, arg1));
                var9.method873(0, arg7, arg3, arg2, arg1, arg0, arg6 + 34, 0, arg4);
                return var9;
            } else {
                return new class578(this, arg4, arg2, arg1, arg0, arg7, arg3);
            }
        } else {
            return new class119(this, arg4, arg2, arg1, arg5, arg0, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)Lwc;", line = 428)
    public final class353 method753(int arg0, int arg1) {
        int var3 = 29 / ((arg0 - -21) / 51);
        ++field9866;
        if (arg1 != 3) {
            if (~arg1 != -5) {
                return ~arg1 == -9 ? new class583(this, super.field7630, super.field7561) : super.method753(100, arg1);
            } else {
                return new class205(this, super.field7630, super.field7561);
            }
        } else {
            return new class224(this, super.field7630);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V", line = 470)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
        ++field9893;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(IIII)[I", line = 477)
    public final int[] method702(int arg0, int arg1, int arg2, int arg3) {
        ++field9908;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + super.field7570 + -var6 + -1, arg2, 1, 32993, this.field9954, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILwu;BLbk;I)Lfj;", line = 498)
    public final class75 method785(int arg0, class149 arg1, byte arg2, class106 arg3, int arg4) {
        if (arg2 > -57) {
            this.field9934 = null;
        }
        ++field9881;
        if (!this.field9944 && (!class346.method2145(-1, arg4) || !class346.method2145(-1, arg0))) {
            return !this.field9948 ? new class119(this, arg1, arg3, class240.method1478(-28325, arg4), class240.method1478(-28325, arg0)) : new class578(this, arg1, arg3, arg4, arg0);
        } else {
            return new class119(this, arg1, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "(B)V", line = 523)
    public final void method816(byte arg0) {
        ++field9889;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(super.field7735, 0);
        int var2 = -100 % ((arg0 - 61) / 49);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIILpca;)V", line = 535)
    public final void method769(boolean arg0, int arg1, int arg2, class529 arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, class41.method237(31, arg3));
        if (arg1 == -7907) {
            ++field9849;
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg0 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V", line = 549)
    public final void method713(boolean arg0) {
        ++field9914;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)V", line = 556)
    public final void method808(byte arg0) {
        ++field9922;
        if (super.field7693 && !super.field7716) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 <= 52) {
            this.method792((Object) null, (Canvas) null, 55);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIIZII)Lfj;", line = 571)
    public final class75 method793(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 != 4595) {
            return null;
        } else {
            ++field9901;
            if (!this.field9944 && (!class346.method2145(-1, arg2) || !class346.method2145(-1, arg6))) {
                if (!this.field9948) {
                    class119 var8 = new class119(this, class564.field8245, class106.field1573, class240.method1478(arg5 ^ -32600, arg2), class240.method1478(-28325, arg6));
                    var8.method430(arg3, 0, arg0, arg1, arg6, 0, arg2, arg5 + -4523);
                    return var8;
                } else {
                    return new class578(this, arg2, arg6, arg0, arg1, arg3);
                }
            } else {
                return new class119(this, arg2, arg6, arg4, arg0, arg1, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "()V", line = 606)
    public final void method676() {
        ++field9843;
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "(Z)V", line = 622)
    private final void method3927(boolean arg0) {
        ++field9885;
        if (this.field9936) {
            OpenGL.glPopMatrix();
        }
        if (arg0) {
            this.field9947 = -100;
        }
        if (super.field7702.method2007(-112)) {
            if (!this.field9939) {
                OpenGL.glLoadMatrixf(super.field7679.method1875(1652, class375.field5661), 0);
                this.field9939 = true;
                this.method787((byte) 127);
                this.method790(72);
            }
            if (!super.field7645) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field7650.method1875(1652, class375.field5661), 0);
                this.field9936 = true;
            } else {
                this.field9936 = false;
            }
        } else if (super.field7645) {
            OpenGL.glLoadIdentity();
            this.field9936 = false;
        } else {
            OpenGL.glLoadMatrixf(super.field7650.method1875(1652, class375.field5661), 0);
            this.field9936 = false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V", line = 669)
    public final void method804(boolean arg0, int arg1) {
        if (arg0) {
            ++field9896;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V", line = 680)
    public final void method792(Object arg0, Canvas arg1, int arg2) {
        ++field9907;
        if (arg2 != -6399) {
            this.field9937 = false;
        }
        Long var4 = (Long) arg0;
        if (!this.field9917.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)V", line = 699)
    public final void method766(int arg0) {
        ++field9860;
        if (arg0 != 12) {
            field9845 = false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "(B)V", line = 709)
    public final void method787(byte arg0) {
        if (arg0 < 122) {
            this.field9945 = null;
        }
        ++field9868;
        OpenGL.glLightfv(16384, 4611, super.field7747, 0);
        OpenGL.glLightfv(16385, 4611, super.field7768, 0);
    }

    @OriginalMember(owner = "client!kd", name = "ja", descriptor = "(I)V", line = 722)
    public final void method646(int arg0) {
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field9853;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 734)
    public final synchronized void method3928(int arg0, int arg1, int arg2) {
        ++field9854;
        if (arg0 < -1) {
            class258 var4 = new class258(arg2);
            var4.field5740 = (long) arg1;
            this.field9928.method1909(var4, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLpca;II)V", line = 748)
    public final void method768(boolean arg0, boolean arg1, class529 arg2, int arg3, int arg4) {
        if (arg4 != 3) {
            this.method768(false, true, (class529) null, -116, 36);
        }
        ++field9847;
        OpenGL.glTexEnvi(8960, 34176 - -arg3, class41.method237(117, arg2));
        if (!arg0) {
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg1 ? 769 : 768);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg3, arg1 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!kd", name = "DA", descriptor = "()I", line = 765)
    public final int method666() {
        ++field9870;
        return this.field9947;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 774)
    public final synchronized void method639(int arg0) {
        ++field9900;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9927.method1903(-84)) {
            class258 var12 = (class258) this.field9927.method1902(98);
            class565.field8251[var2++] = (int) var12.field5740;
            super.field7668 -= var12.field3352;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class565.field8251, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class565.field8251, 0);
            var2 = 0;
        }
        while (!this.field9928.method1903(-79)) {
            class258 var11 = (class258) this.field9928.method1902(112);
            class565.field8251[var2++] = (int) var11.field5740;
            super.field7660 -= var11.field3352;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class565.field8251, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class565.field8251, 0);
            var2 = 0;
        }
        while (!this.field9930.method1903(-48)) {
            class258 var10 = (class258) this.field9930.method1902(111);
            class565.field8251[var2++] = var10.field3352;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class565.field8251, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class565.field8251, 0);
            var2 = 0;
        }
        while (!this.field9931.method1903(-79)) {
            class258 var9 = (class258) this.field9931.method1902(121);
            class565.field8251[var2++] = (int) var9.field5740;
            super.field7654 -= var9.field3352;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class565.field8251, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class565.field8251, 0);
            boolean var4 = false;
        }
        while (!this.field9861.method1903(-24)) {
            class258 var8 = (class258) this.field9861.method1902(125);
            OpenGL.glDeleteLists((int) var8.field5740, var8.field3352);
        }
        while (!this.field9932.method1903(-123)) {
            class381 var7 = this.field9932.method1902(126);
            OpenGL.glDeleteProgramARB((int) var7.field5740);
        }
        while (!this.field9933.method1903(-92)) {
            class381 var6 = this.field9933.method1902(110);
            OpenGL.glDeleteObjectARB(var6.field5740);
        }
        while (!this.field9861.method1903(-83)) {
            class258 var5 = (class258) this.field9861.method1902(109);
            OpenGL.glDeleteLists((int) var5.field5740, var5.field3352);
        }
        if (this.method615() > 100663296 && ~class60.method371(false) < ~(this.field9935 + 60000L)) {
            System.gc();
            this.field9935 = class60.method371(false);
        }
        super.method639(var3);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLfa;Lmv;I)V", line = 937)
    public class700(OpenGL arg0, Canvas arg1, long arg2, class615 arg3, class295 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field9917 = arg0;
            this.field9917.method159();
            this.field9950 = OpenGL.glGetString(7936).toLowerCase();
            this.field9945 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field9950.indexOf("microsoft") == 0 && this.field9950.indexOf("brian paul") == -1 && this.field9950.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class509.method2891(var8.replace('.', ' '), ' ', 47);
                if (~var9.length > -3) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class87.method496(var9[0], (byte) -116);
                        int var11 = class87.method496(var9[1], (byte) -115);
                        this.field9949 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field9949 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field9917.method160("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field9917.method160("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field7685 = var12[0];
                        if (super.field7685 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field7696 = 8;
                            this.field9951 = this.field9917.method160("GL_ARB_vertex_buffer_object");
                            super.field7769 = this.field9917.method160("GL_ARB_multisample");
                            this.field9948 = this.field9917.method160("GL_ARB_texture_rectangle");
                            super.field7721 = this.field9917.method160("GL_ARB_texture_cube_map");
                            this.field9944 = this.field9917.method160("GL_ARB_texture_non_power_of_two");
                            super.field7774 = this.field9917.method160("GL_EXT_texture3D");
                            this.field9955 = this.field9917.method160("GL_ARB_vertex_shader");
                            this.field9946 = this.field9917.method160("GL_ARB_vertex_program");
                            this.field9953 = this.field9917.method160("GL_ARB_fragment_shader");
                            this.field9917.method160("GL_ARB_fragment_program");
                            this.field9952 = new int[super.field7685];
                            this.field9954 = !Stream.method2077() ? 5121 : 33639;
                            if (this.field9945.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class509.method2891(this.field9945.replace('/', ' '), ' ', 63);
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (~var18.charAt(0) == -121 && var18.length() >= 3 && class86.method488((byte) 126, var18.substring(1, 3))) {
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
                                                if (~var18.length() <= -5 && class86.method488((byte) 121, var18.substring(0, 4))) {
                                                    var13 = class87.method496(var18.substring(0, 4), (byte) -112);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field7774 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -8000) {
                                        this.field9951 = false;
                                    }
                                }
                                this.field9948 &= this.field9917.method160("GL_ARB_half_float_pixel");
                            }
                            this.field9950.indexOf("intel");
                            if (this.field9951) {
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
            this.method697();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lega;II)V", line = 1093)
    public final void method754(class184 arg0, int arg1, int arg2) {
        ++field9899;
        if (arg2 != 27910) {
            method3929((int[]) null, (long[]) null, -36);
        }
        this.field9934[arg1] = (class386) arg0;
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "()V", line = 1104)
    public final void method681() {
        ++field9918;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "()Lpg;", line = 1114)
    public final class658 method683() {
        ++field9878;
        int var1 = -1;
        if (~this.field9950.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (~this.field9950.indexOf("intel") != 0) {
            var1 = 32902;
        } else if (~this.field9950.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class658(var1, "OpenGL", this.field9949, this.field9945, 0L);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lbk;ILwu;)Z", line = 1139)
    public final boolean method794(class106 arg0, int arg1, class149 arg2) {
        if (arg1 > -109) {
            this.field9946 = true;
        }
        ++field9904;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lrf;B)V", line = 1150)
    public final void method765(class157 arg0, byte arg1) {
        int var3 = -123 / ((-7 - arg1) / 38);
        ++field9923;
        if (class497.field7032 != arg0) {
            int var4 = class642.method3656(arg0, (byte) -23);
            OpenGL.glTexGeni(8192, 9472, var4);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var4);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var4);
            OpenGL.glEnable(3170);
        } else {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(Z)V", line = 1178)
    public final void method775(boolean arg0) {
        super.field7692 = (float) (-super.field7746 + super.field7731);
        ++field9915;
        super.field7778 = super.field7692 - (float) super.field7733;
        if ((float) super.field7738 > super.field7778) {
            super.field7778 = (float) super.field7738;
        }
        OpenGL.glFogf(2915, super.field7778);
        OpenGL.glFogf(2916, super.field7692);
        class687.field9698[1] = (float) class425.method2563(super.field7782, 65280) / 65280.0F;
        class687.field9698[2] = (float) class425.method2563(255, super.field7782) / 255.0F;
        class687.field9698[0] = (float) class425.method2563(super.field7782, 16711680) / 1.671168E7F;
        if (arg0) {
            this.method3932(44, -39, (byte) -58);
        }
        OpenGL.glFogfv(2918, class687.field9698, 0);
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V", line = 1201)
    public final void method789(int arg0) {
        class687.field9698[0] = super.field7777 * super.field7776;
        if (arg0 <= -32) {
            ++field9903;
            class687.field9698[3] = 1.0F;
            class687.field9698[1] = super.field7777 * super.field7737;
            class687.field9698[2] = super.field7777 * super.field7734;
            OpenGL.glLightModelfv(2899, class687.field9698, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ[[II)Lap;", line = 1218)
    public final class447 method812(int arg0, boolean arg1, int[][] arg2, int arg3) {
        if (arg0 != 1) {
            this.method760((byte) 124);
        }
        ++field9874;
        return new class323(this, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "(I)V", line = 1229)
    public final void method758(int arg0) {
        ++field9919;
        OpenGL.glMatrixMode(5890);
        if (super.field7694[super.field7759] == class42.field619) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(super.field7742[super.field7759].method1875(arg0 + -17199, class375.field5661), 0);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 != 18851) {
            this.field9948 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V", line = 1248)
    public final void method762(Canvas arg0, boolean arg1, Object arg2) {
        if (!arg1) {
            this.method650();
        }
        ++field9895;
        Long var4 = (Long) arg2;
        this.field9917.releaseSurface(arg0, var4);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILwu;I[BI)Ljf;", line = 1263)
    public final class695 method802(int arg0, int arg1, class149 arg2, int arg3, byte[] arg4, int arg5) {
        if (arg0 <= 89) {
            return null;
        } else {
            ++field9858;
            return new class399(this, arg2, arg3, arg1, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "()V", line = 1276)
    public final void method653() {
        ++field9857;
    }

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "(I)V", line = 1284)
    public final void method764(int arg0) {
        if (arg0 > -47) {
            method3931(17, (byte[]) null, (byte[]) null, 105, 75, 120, 73, 92, 30);
        }
        if (super.field7704) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        ++field9862;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V", line = 1299)
    public final void method783(boolean arg0) {
        if (!super.field7683) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
        ++field9856;
        if (arg0) {
            this.method662();
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "()V", line = 1319)
    public final void method655() throws class232 {
        this.field9917.swapBuffers();
        ++field9924;
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "()Z", line = 1331)
    public final boolean method705() {
        ++field9882;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lid;IBI)V", line = 1340)
    public final void method778(class388 arg0, int arg1, byte arg2, int arg3) {
        ++field9863;
        if (arg2 < -92) {
            int var5;
            byte var6;
            if (class533.field7844 == arg0) {
                var5 = arg1 * 2;
                var6 = 1;
            } else if (class454.field6543 != arg0) {
                if (class433.field6280 == arg0) {
                    var6 = 4;
                    var5 = arg1 * 3;
                } else if (class223.field2949 == arg0) {
                    var5 = arg1 + 2;
                    var6 = 6;
                } else if (class143.field2066 != arg0) {
                    var5 = arg1;
                    var6 = 0;
                } else {
                    var5 = arg1 + 2;
                    var6 = 5;
                }
            } else {
                var5 = arg1 + 1;
                var6 = 3;
            }
            OpenGL.glDrawArrays(var6, arg3, var5);
        }
    }

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "(I)V", line = 1393)
    public final void method782(int arg0) {
        if (!super.field7723) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        ++field9891;
        if (arg0 != 0) {
            this.method813(77);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lwu;Lbk;I)Z", line = 1418)
    public final boolean method780(class149 arg0, class106 arg1, int arg2) {
        int var4 = -41 / ((arg2 - -11) / 60);
        ++field9892;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1429)
    public final void method689(Rectangle[] arg0, int arg1) throws class232 {
        this.method655();
        ++field9905;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I[JI)V", line = 1437)
    public static final void method3929(int[] arg0, long[] arg1, int arg2) {
        if (arg2 == 8845) {
            ++field9909;
            class9.method62(0, arg0, arg2 ^ 8861, arg1.length + -1, arg1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V", line = 1448)
    public final synchronized void method3930(int arg0, int arg1) {
        ++field9884;
        class381 var3 = new class381();
        var3.field5740 = (long) arg1;
        this.field9932.method1909(var3, (byte) -81);
        if (arg0 != 8960) {
            this.field9950 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "ya", descriptor = "()V", line = 1463)
    public final void method638() {
        ++field9906;
        this.method3056(true, (byte) 117);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFF)V", line = 1473)
    public final void method619(float arg0, float arg1, float arg2) {
        ++field9890;
    }

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "()V", line = 1480)
    public final void method697() {
        ++field9876;
        super.method697();
        if (this.field9917 != null) {
            this.field9917.method161();
            this.field9917.release();
            this.field9917 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BLwu;ZIIIII)Lfj;", line = 1495)
    public final class75 method805(byte[] arg0, class149 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9920;
        if (arg7 != 1) {
            return null;
        } else if (!this.field9944 && (!class346.method2145(-1, arg5) || !class346.method2145(-1, arg3))) {
            if (this.field9948) {
                return new class578(this, arg1, arg5, arg3, arg0, arg6, arg4);
            } else {
                class119 var9 = new class119(this, arg1, class106.field1573, class240.method1478(arg7 + -28326, arg5), class240.method1478(arg7 ^ -28326, arg3));
                var9.method434(arg3, arg5, 0, arg4, arg6, 0, arg0, arg1, -11100);
                return var9;
            }
        } else {
            return new class119(this, arg1, arg5, arg3, arg2, arg0, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "(B)V", line = 1526)
    public final void method776(byte arg0) {
        class687.field9698[3] = (float) (super.field7730 >>> 24) / 255.0F;
        class687.field9698[2] = (float) class425.method2563(super.field7730, 255) / 255.0F;
        ++field9867;
        class687.field9698[1] = (float) class425.method2563(65280, super.field7730) / 65280.0F;
        if (arg0 != 105) {
            this.method757(-61);
        }
        class687.field9698[0] = (float) class425.method2563(16711680, super.field7730) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class687.field9698, 0);
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()V", line = 1541)
    public final void method642() {
        ++field9877;
        if (~super.field7583 < -1 || super.field7570 > 0) {
            int var1 = super.field7758;
            int var2 = super.field7755;
            int var3 = super.field7781;
            int var4 = super.field7700;
            this.method699();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3005(13);
            this.method3069(5796, false);
            this.method2994(0, false);
            this.method2991(false, (byte) 88);
            this.method3056(false, (byte) 110);
            this.method3011(-127, (class689) null);
            this.method3058(false, -2, (byte) -127, false);
            this.method3037(1, true);
            this.method3068(123, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field7583, super.field7570, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method652(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lcl;B)V", line = 1586)
    public final void method811(class314 arg0, byte arg1) {
        ++field9916;
        class680[] var3 = ((class6) arg0).field209;
        int var4 = 0;
        int var5 = -72 / ((25 - arg1) / 57);
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        for (int var9 = 0; var3.length > var9; ++var9) {
            class680 var12 = var3[var9];
            class386 var13 = this.field9934[var9];
            int var14 = 0;
            int var15 = var13.method2380((byte) -123);
            long var16 = var13.method1590(123);
            var13.method1591((byte) -31);
            for (int var18 = 0; var18 < var12.method3817(15); ++var18) {
                class455 var19 = var12.method3818(var18, 0);
                if (class455.field6559 == var19) {
                    var8 = true;
                    OpenGL.glVertexPointer(3, 5126, var15, (long) var14 + var16);
                } else if (class455.field6566 != var19) {
                    if (class455.field6567 != var19) {
                        if (class455.field6568 == var19) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(1, 5126, var15, (long) var14 + var16);
                        } else if (class455.field6569 == var19) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(2, 5126, var15, (long) var14 + var16);
                        } else if (class455.field6570 == var19) {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(3, 5126, var15, (long) var14 + var16);
                        } else if (class455.field6571 == var19) {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(4, 5126, var15, (long) var14 + var16);
                        }
                    } else {
                        OpenGL.glColorPointer(4, 5121, var15, (long) var14 + var16);
                        var6 = true;
                    }
                } else {
                    var7 = true;
                    OpenGL.glNormalPointer(5126, var15, (long) var14 + var16);
                }
                var14 += var19.field6565;
            }
        }
        if (!var8 == this.field9937) {
            if (!var8) {
                OpenGL.glDisableClientState(32884);
            } else {
                OpenGL.glEnableClientState(32884);
            }
            this.field9937 = var8;
        }
        if (!var7 != !this.field9940) {
            if (!var7) {
                OpenGL.glDisableClientState(32885);
            } else {
                OpenGL.glEnableClientState(32885);
            }
            this.field9940 = var7;
        }
        if (!var6 == this.field9938) {
            if (var6) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field9938 = var6;
        }
        if (~this.field9942 > ~var4) {
            for (int var10 = this.field9942; var10 < var4; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field9942 = var4;
        } else if (~this.field9942 < ~var4) {
            for (int var11 = var4; this.field9942 > var11; ++var11) {
                OpenGL.glClientActiveTexture(33984 - -var11);
                OpenGL.glDisableClientState(32888);
            }
            this.field9942 = var4;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B[BIIIIII)V", line = 1748)
    public static final void method3931(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9842;
        int var9 = -(arg8 >> 2);
        int var10 = -(3 & arg8);
        for (int var11 = -arg4; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg0++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg1[arg3++]);
                int var14 = arg0++;
                arg2[var14] = (byte) (arg2[var14] + -arg1[arg3++]);
                int var15 = arg0++;
                arg2[var15] = (byte) (arg2[var15] + -arg1[arg3++]);
                int var16 = arg0++;
                arg2[var16] = (byte) (arg2[var16] + -arg1[arg3++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg0++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg1[arg3++]);
            }
            arg0 += arg6;
            arg3 += arg7;
        }
        if (arg5 != 0) {
            field9869 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 1792)
    public final void method813(int arg0) {
        ++field9921;
        OpenGL.glActiveTexture(super.field7759 + 33984);
        if (arg0 != 28790) {
            this.field9927 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "()V", line = 1803)
    public final void method662() {
        ++field9851;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 1810)
    public final void method809(Canvas arg0, int arg1, Object arg2) {
        ++field9925;
        if (arg1 != 8) {
            this.method769(false, -67, -54, (class529) null);
        }
        Long var4 = (Long) arg2;
        this.field9917.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V", line = 1823)
    public final synchronized void method3932(int arg0, int arg1, byte arg2) {
        ++field9850;
        class258 var4 = new class258(arg0);
        var4.field5740 = (long) arg1;
        this.field9927.method1909(var4, (byte) -81);
        if (arg2 != -2) {
            this.field9944 = false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "(B)V", line = 1837)
    public final void method759(byte arg0) {
        if (super.field7743 && super.field7705 && ~super.field7733 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 44) {
            this.field9917 = null;
        }
        ++field9846;
    }

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "(I)V", line = 1855)
    public final void method788(int arg0) {
        OpenGL.glTexEnvi(8960, 34162, class76.method440(46, super.field7726[super.field7759]));
        ++field9875;
        if (arg0 != 9) {
            this.method765((class157) null, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)V", line = 1867)
    public final void method807(int arg0) {
        int var2 = -81 % ((arg0 - -22) / 36);
        ++field9886;
        if (class378.field5670 != super.field7713) {
            if (class284.field3792 == super.field7713) {
                OpenGL.glBlendFunc(1, 1);
                return;
            }
            if (class229.field3043 == super.field7713) {
                OpenGL.glBlendFunc(774, 1);
                return;
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
    }

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)V", line = 1890)
    public final void method799(int arg0) {
        if (super.field7701) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        ++field9887;
        if (arg0 != 0) {
            this.field9952 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "(I)V", line = 1906)
    public final void method786(int arg0) {
        OpenGL.glScissor(super.field7758 + super.field7699, super.field7750 + super.field7570 + -super.field7700, -super.field7758 + super.field7755, -super.field7781 + super.field7700);
        if (arg0 == 28149) {
            ++field9852;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lrs;Lrs;FLrs;)Lrs;", line = 1925)
    public final class649 method707(class649 arg0, class649 arg1, float arg2, class649 arg3) {
        ++field9844;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }
}
