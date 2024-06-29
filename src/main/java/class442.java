import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class442 extends class582 {

    @OriginalMember(owner = "client!ph", name = "Ig", descriptor = "Lbv;")
    private class568 field6015 = new class568();

    @OriginalMember(owner = "client!ph", name = "Qh", descriptor = "Lbv;")
    private class568 field6075 = new class568();

    @OriginalMember(owner = "client!ph", name = "bi", descriptor = "Lbv;")
    private class568 field6086 = new class568();

    @OriginalMember(owner = "client!ph", name = "ci", descriptor = "Lbv;")
    private class568 field6087 = new class568();

    @OriginalMember(owner = "client!ph", name = "fi", descriptor = "Lbv;")
    private class568 field6090 = new class568();

    @OriginalMember(owner = "client!ph", name = "gi", descriptor = "Lbv;")
    private class568 field6091 = new class568();

    @OriginalMember(owner = "client!ph", name = "hi", descriptor = "Lbv;")
    private class568 field6092 = new class568();

    @OriginalMember(owner = "client!ph", name = "ji", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field6094 = new MapBuffer();

    @OriginalMember(owner = "client!ph", name = "ni", descriptor = "Z")
    private boolean field6098 = false;

    @OriginalMember(owner = "client!ph", name = "mi", descriptor = "I")
    private int field6097 = 0;

    @OriginalMember(owner = "client!ph", name = "hh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field6040;

    @OriginalMember(owner = "client!ph", name = "ti", descriptor = "Ljava/lang/String;")
    private String field6104;

    @OriginalMember(owner = "client!ph", name = "ri", descriptor = "Ljava/lang/String;")
    private String field6102;

    @OriginalMember(owner = "client!ph", name = "ki", descriptor = "I")
    private int field6095;

    @OriginalMember(owner = "client!ph", name = "qi", descriptor = "Z")
    public boolean field6101;

    @OriginalMember(owner = "client!ph", name = "pi", descriptor = "Z")
    private boolean field6100;

    @OriginalMember(owner = "client!ph", name = "ui", descriptor = "Z")
    private boolean field6105;

    @OriginalMember(owner = "client!ph", name = "si", descriptor = "Z")
    public boolean field6103;

    @OriginalMember(owner = "client!ph", name = "li", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!ph", name = "oi", descriptor = "[I")
    public int[] field6099;

    @OriginalMember(owner = "client!ph", name = "Ih", descriptor = "Lbn;")
    public static class371 field6067 = new class371(8, 0, 4, 1);

    @OriginalMember(owner = "client!ph", name = "ai", descriptor = "[I")
    public static int[] field6085 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!ph", name = "yg", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ph", name = "zg", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!ph", name = "Ag", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ph", name = "Bg", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!ph", name = "Cg", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!ph", name = "Dg", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ph", name = "Eg", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!ph", name = "Fg", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!ph", name = "Gg", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!ph", name = "Hg", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!ph", name = "Jg", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ph", name = "Kg", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ph", name = "Lg", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!ph", name = "Mg", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ph", name = "Ng", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ph", name = "Og", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ph", name = "Pg", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ph", name = "Qg", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!ph", name = "Rg", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!ph", name = "Sg", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!ph", name = "Tg", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!ph", name = "Ug", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!ph", name = "Vg", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ph", name = "Wg", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!ph", name = "Xg", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!ph", name = "Yg", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!ph", name = "Zg", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!ph", name = "ah", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!ph", name = "bh", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ph", name = "ch", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ph", name = "dh", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!ph", name = "eh", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ph", name = "fh", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!ph", name = "gh", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ph", name = "ih", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ph", name = "jh", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!ph", name = "kh", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!ph", name = "lh", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!ph", name = "mh", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ph", name = "nh", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!ph", name = "oh", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ph", name = "ph", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ph", name = "qh", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!ph", name = "rh", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!ph", name = "sh", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ph", name = "th", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!ph", name = "uh", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!ph", name = "vh", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ph", name = "wh", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!ph", name = "xh", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ph", name = "yh", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!ph", name = "zh", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!ph", name = "Ah", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!ph", name = "Bh", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!ph", name = "Ch", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!ph", name = "Dh", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ph", name = "Eh", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!ph", name = "Fh", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!ph", name = "Gh", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!ph", name = "Hh", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!ph", name = "Jh", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!ph", name = "Kh", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!ph", name = "Lh", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!ph", name = "Mh", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!ph", name = "Nh", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ph", name = "Oh", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!ph", name = "Ph", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ph", name = "Rh", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!ph", name = "Sh", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!ph", name = "Th", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!ph", name = "Uh", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ph", name = "Vh", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ph", name = "Wh", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!ph", name = "Xh", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ph", name = "Yh", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!ph", name = "Zh", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ph", name = "di", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ph", name = "ei", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ph", name = "ii", descriptor = "J")
    private long field6093;

    @OriginalMember(owner = "client!ph", name = "xg", descriptor = "Ljda;")
    public static class277 field6004;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)Lbd;")
    public final class180 method1188(byte arg0, boolean arg1) {
        ++field6064;
        return arg0 < 100 ? null : new class225(this, class280.field3664, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "(I)V")
    public final void method1186(int arg0) {
        OpenGL.glViewport(super.field8381, super.field8387, super.field8219, super.field8249);
        ++field6034;
        if (arg0 != 10) {
            this.field6100 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(II)V")
    public final void method1204(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field6095 = -84;
        }
        ++field6014;
    }

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "(B)V")
    public final void method1196(byte arg0) {
        if (arg0 != 72) {
            this.field6098 = true;
        }
        ++field6039;
        int var2 = this.field6099[super.field8391];
        if (var2 != 0) {
            this.field6099[super.field8391] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[[IIZ)Lmca;")
    public final class5 method1200(int arg0, int[][] arg1, int arg2, boolean arg3) {
        ++field6066;
        return arg2 != 15 ? null : new class267(this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "(I)V")
    public final void method1175(int arg0) {
        if (arg0 != 7) {
            this.method1208((class189) null, 49, -74, -125);
        }
        OpenGL.glMatrixMode(5889);
        ++field6074;
        OpenGL.glLoadMatrixf(super.field8332, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1152(byte arg0, Canvas arg1, Object arg2) {
        ++field6026;
        if (arg0 == -12) {
            Long var4 = (Long) arg2;
            this.field6040.surfaceResized(var4);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLsb;Luda;)Z")
    public final boolean method1170(byte arg0, class280 arg1, class509 arg2) {
        ++field6029;
        if (arg0 > -34) {
            this.field6090 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(B)V")
    public final void method1192(byte arg0) {
        ++field6046;
        int var2;
        for (var2 = 0; ~super.field8307 < ~var2; ++var2) {
            class592 var3 = super.field8346[var2];
            int var4 = var3.method3419(126);
            int var5 = 16386 - -var2;
            float var6 = var3.method3422(97) / 255.0F;
            class196.field2545[0] = (float) var3.method3414(class426.method2502(arg0, 197));
            class196.field2545[1] = (float) var3.method3416(-2);
            class196.field2545[2] = (float) var3.method3415((byte) 117);
            class196.field2545[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class196.field2545, 0);
            class196.field2545[3] = 1.0F;
            class196.field2545[0] = (float) (class143.method783(16726797, var4) >> 16) * var6;
            class196.field2545[2] = var6 * (float) class143.method783(var4, 255);
            class196.field2545[1] = (float) class143.method783(255, var4 >> 8) * var6;
            OpenGL.glLightfv(var5, 4609, class196.field2545, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3420(true) * var3.method3420(true)));
            OpenGL.glEnable(var5);
        }
        while (~var2 > ~super.field8383) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        super.method1192(arg0);
    }

    @OriginalMember(owner = "client!ph", name = "YA", descriptor = "()I")
    public final int method946() {
        ++field6051;
        return this.field6097;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsb;Luda;III)Lgq;")
    public final class305 method1161(class280 arg0, class509 arg1, int arg2, int arg3, int arg4) {
        ++field6065;
        int var6 = 108 % ((3 - arg4) / 37);
        if (!this.field6105 && (!class506.method2832(arg3, 3) || !class506.method2832(arg2, 3))) {
            return !this.field6100 ? new class636(this, arg1, arg0, class468.method2685(arg3, false), class468.method2685(arg2, false)) : new class172(this, arg1, arg0, arg3, arg2);
        } else {
            return new class636(this, arg1, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "(I)V")
    public final void method1182(int arg0) {
        ++field6009;
        if (arg0 == 22469) {
            OpenGL.glMatrixMode(5890);
            if (super.field8386[super.field8391] == class467.field6627) {
                OpenGL.glLoadIdentity();
            } else {
                OpenGL.glLoadMatrixf(super.field8382[super.field8391].method1134(class157.field2047, 14), 0);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "(B)V")
    public final void method1189(byte arg0) {
        ++field6016;
        int var2 = 11 % ((-19 - arg0) / 37);
        OpenGL.glTexEnvi(8960, 34162, class139.method737((byte) 120, super.field8401[super.field8391]));
    }

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "(I)V")
    public final void method1153(int arg0) {
        if (arg0 <= 49) {
            this.method1187(-74);
        }
        ++field6083;
        if (!super.field8367) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
    }

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "(I)V")
    public final void method1202(int arg0) {
        class196.field2545[2] = super.field8363 * super.field8355;
        ++field6025;
        class196.field2545[0] = super.field8355 * super.field8352;
        class196.field2545[3] = 1.0F;
        class196.field2545[1] = super.field8402 * super.field8355;
        OpenGL.glLightModelfv(2899, class196.field2545, 0);
        if (arg0 != 140) {
            this.field6093 = -97L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public final synchronized void method932(int arg0) {
        ++field6052;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field6075.method3179(true)) {
            class147 var12 = (class147) this.field6075.method3184(-5295);
            class613.field8818[var3++] = (int) var12.field1401;
            super.field8294 -= var12.field1902;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class613.field8818, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class613.field8818, 0);
            var3 = 0;
        }
        while (!this.field6086.method3179(true)) {
            class147 var11 = (class147) this.field6086.method3184(-5295);
            class613.field8818[var3++] = (int) var11.field1401;
            super.field8290 -= var11.field1902;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class613.field8818, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class613.field8818, 0);
            var3 = 0;
        }
        while (!this.field6087.method3179(true)) {
            class147 var10 = (class147) this.field6087.method3184(-5295);
            class613.field8818[var3++] = var10.field1902;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class613.field8818, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class613.field8818, 0);
            var3 = 0;
        }
        while (!this.field6090.method3179(true)) {
            class147 var9 = (class147) this.field6090.method3184(-5295);
            class613.field8818[var3++] = (int) var9.field1401;
            super.field8295 -= var9.field1902;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class613.field8818, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class613.field8818, 0);
            boolean var4 = false;
        }
        while (!this.field6015.method3179(true)) {
            class147 var8 = (class147) this.field6015.method3184(-5295);
            OpenGL.glDeleteLists((int) var8.field1401, var8.field1902);
        }
        while (!this.field6091.method3179(true)) {
            class108 var7 = this.field6091.method3184(-5295);
            OpenGL.glDeleteProgramARB((int) var7.field1401);
        }
        while (!this.field6092.method3179(true)) {
            class108 var6 = this.field6092.method3184(-5295);
            OpenGL.glDeleteObjectARB(var6.field1401);
        }
        while (!this.field6015.method3179(true)) {
            class147 var5 = (class147) this.field6015.method3184(-5295);
            OpenGL.glDeleteLists((int) var5.field1401, var5.field1902);
        }
        if (this.method965() > 100663296 && class348.method2175(-119) > this.field6093 - -60000L) {
            System.gc();
            this.field6093 = class348.method2175(-124);
        }
        super.method932(var2);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([Lug;B)Lkq;")
    public final class102 method1178(class410[] arg0, byte arg1) {
        if (arg1 != -13) {
            this.method1152((byte) -71, (Canvas) null, (Object) null);
        }
        ++field6011;
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLqba;)V")
    public static final void method2561(byte arg0, class541 arg1) {
        arg1.field7572 = null;
        ++field6084;
        int var2 = arg1.field7564.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            arg1.field7564[var3].field5294 = false;
        }
        class311[] var4 = class75.field1023;
        synchronized (class75.field1023) {
            if (~class75.field1023.length < ~var2 && ~class516.field7208[var2] > -201) {
                class75.field1023[var2].method1873(arg1, true);
                int var10002 = class516.field7208[var2]++;
            }
        }
        if (arg0 != -50) {
            field6085 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "(IIII)[I")
    public final int[] method950(int arg0, int arg1, int arg2, int arg3) {
        ++field6008;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + super.field8249 + -arg1 + -1, arg2, 1, 32993, this.field6096, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZLlg;)V")
    public final void method1154(int arg0, int arg1, boolean arg2, class32 arg3) {
        ++field6076;
        if (arg0 != 10) {
            this.method1152((byte) -37, (Canvas) null, (Object) null);
        }
        OpenGL.glTexEnvi(8960, arg1 + 34184, class577.method3244(94, arg3));
        OpenGL.glTexEnvi(8960, arg1 + 34200, !arg2 ? 770 : 771);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lbe;III)V")
    public final void method1208(class189 arg0, int arg1, int arg2, int arg3) {
        ++field6020;
        if (arg2 < 81) {
            this.field6096 = -46;
        }
        int var5;
        byte var6;
        if (class202.field2645 == arg0) {
            var5 = arg3 * 2;
            var6 = 1;
        } else if (class516.field7179 == arg0) {
            var6 = 3;
            var5 = arg3 - -1;
        } else if (class546.field7613 == arg0) {
            var5 = arg3 * 3;
            var6 = 4;
        } else if (class603.field8706 != arg0) {
            if (class172.field2222 == arg0) {
                var6 = 5;
                var5 = arg3 + 2;
            } else {
                var5 = arg3;
                var6 = 0;
            }
        } else {
            var5 = arg3 + 2;
            var6 = 6;
        }
        OpenGL.glDrawArrays(var6, arg1, var5);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()Z")
    public final boolean method912() {
        ++field6043;
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method913(Rectangle[] arg0, int arg1) throws class487 {
        ++field6077;
        this.method934();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method1176(Object arg0, Canvas arg1, int arg2) {
        ++field6033;
        Long var4 = (Long) arg0;
        this.field6040.releaseSurface(arg1, var4);
        int var5 = -104 % ((53 - arg2) / 33);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
    public final void method911() {
        ++field6031;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLei;)V")
    public final void method1201(byte arg0, class331 arg1) {
        if (class558.field7806 != arg1) {
            int var3 = class631.method3647(true, arg1);
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
        ++field6028;
        if (arg0 >= -38) {
            this.method1170((byte) 36, (class280) null, (class509) null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "(I)V")
    public final void method1180(int arg0) {
        ++field6006;
        if (arg0 != 0) {
            this.method1158(-109);
        }
        OpenGL.glActiveTexture(super.field8391 + 33984);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z[FILuda;IIII)Lgq;")
    public final class305 method1205(boolean arg0, float[] arg1, int arg2, class509 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= -106) {
            this.method1177(-119);
        }
        ++field6073;
        if (!this.field6105 && (!class506.method2832(arg5, 3) || !class506.method2832(arg6, 3))) {
            if (this.field6100) {
                return new class172(this, arg3, arg5, arg6, arg1, arg4, arg7);
            } else {
                class636 var9 = new class636(this, arg3, class280.field3667, class468.method2685(arg5, false), class468.method2685(arg6, false));
                var9.method3669(arg5, (byte) 33, arg4, arg1, 0, arg6, arg7, arg3, 0);
                return var9;
            }
        } else {
            return new class636(this, arg3, arg5, arg6, arg0, arg1, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(IZ)Llca;")
    public final class133 method1197(int arg0, boolean arg1) {
        if (arg0 != 10) {
            this.method1163(true);
        }
        ++field6024;
        return new class214(this, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V")
    public final void method1168(byte arg0) {
        if (arg0 != -102) {
            this.method1168((byte) 59);
        }
        ++field6017;
        OpenGL.glScissor(super.field8381 + super.field8344, -super.field8399 + super.field8249 + super.field8387, -super.field8344 + super.field8328, -super.field8324 + super.field8399);
    }

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "()V")
    public final void method994() {
        ++field6072;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "()Z")
    public final boolean method915() {
        ++field6037;
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "(I)V")
    public final void method1184(int arg0) {
        for (int var2 = super.field8319 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field6010;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glDisable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = arg0; var4 < 8; ++var4) {
            int var5 = 16384 - -var4;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field6040.setSwapInterval(0);
        super.method1184(0);
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "()V")
    public final void method934() throws class487 {
        this.field6040.swapBuffers();
        ++field6080;
    }

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "(B)V")
    public final void method1206(byte arg0) {
        if (arg0 != 94) {
            this.method1195((Canvas) null, true, (Object) null);
        }
        if (!super.field8424) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        ++field6048;
    }

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "(I)V")
    public final void method1187(int arg0) {
        class196.field2545[2] = super.field8385 * super.field8363;
        class196.field2545[1] = super.field8402 * super.field8385;
        ++field6089;
        class196.field2545[3] = 1.0F;
        class196.field2545[0] = super.field8385 * super.field8352;
        OpenGL.glLightfv(16384, 4609, class196.field2545, 0);
        class196.field2545[3] = 1.0F;
        class196.field2545[1] = -super.field8343 * super.field8402;
        if (arg0 == -5477) {
            class196.field2545[2] = -super.field8343 * super.field8363;
            class196.field2545[0] = -super.field8343 * super.field8352;
            OpenGL.glLightfv(16385, 4609, class196.field2545, 0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
    public final void method959(int arg0, int arg1, int arg2, int arg3) {
        ++field6055;
    }

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "(I)V")
    private final void method2562(int arg0) {
        if (this.field6098) {
            OpenGL.glPopMatrix();
        }
        if (arg0 != 0) {
            this.field6100 = false;
        }
        ++field6032;
        if (!super.field8347.method2260(-120)) {
            if (super.field8289) {
                OpenGL.glLoadIdentity();
                this.field6098 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field8292.method1134(class157.field2047, 14), 0);
                this.field6098 = false;
            }
        } else {
            if (!this.field6098) {
                OpenGL.glLoadIdentity();
                OpenGL.glMultMatrixf(super.field8298.method1134(class157.field2047, 14), 0);
                this.method1155(0);
                this.method1192((byte) 45);
                this.field6098 = true;
            }
            if (this.field6098) {
                OpenGL.glPushMatrix();
            }
            if (!super.field8289) {
                OpenGL.glMultMatrixf(super.field8292.method1134(class157.field2047, 14), 0);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "(I)V")
    public final void method1177(int arg0) {
        if (arg0 == 1) {
            if (!super.field8359) {
                OpenGL.glDisable(16384);
                OpenGL.glDisable(16385);
            } else {
                OpenGL.glEnable(16384);
                OpenGL.glEnable(16385);
            }
            ++field6081;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llg;ZZZI)V")
    public final void method1210(class32 arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        OpenGL.glTexEnvi(8960, arg4 + 34176, class577.method3244(122, arg0));
        if (!arg2) {
            this.field6099 = null;
        }
        ++field6013;
        if (arg3) {
            OpenGL.glTexEnvi(8960, arg4 + 34192, arg1 ? 771 : 770);
        } else {
            OpenGL.glTexEnvi(8960, arg4 + 34192, arg1 ? 769 : 768);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llca;IB)V")
    public final void method1171(class133 arg0, int arg1, byte arg2) {
        if (arg2 == -98) {
            ++field6054;
        }
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(Z)F")
    public final float method1163(boolean arg0) {
        if (arg0) {
            return 1.6462138F;
        } else {
            ++field6049;
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "(I)V")
    public final void method1166(int arg0) {
        ++field6068;
        if (arg0 != 0) {
            this.method1166(2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFF)V")
    public final void method989(float arg0, float arg1, float arg2) {
        ++field6059;
    }

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "(I)V")
    public final void method1183(int arg0) {
        class196.field2545[3] = (float) (super.field8333 >>> 24) / 255.0F;
        class196.field2545[2] = (float) class143.method783(super.field8333, 255) / 255.0F;
        class196.field2545[0] = (float) class143.method783(16711680, super.field8333) / 1.671168E7F;
        ++field6035;
        class196.field2545[1] = (float) class143.method783(65280, super.field8333) / 65280.0F;
        if (arg0 != -886) {
            this.method994();
        }
        OpenGL.glTexEnvfv(8960, 8705, class196.field2545, 0);
    }

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "()V")
    public final void method996() {
        this.method3284(true, -126);
        ++field6045;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)V")
    public final void method1185(boolean arg0, int arg1) {
        if (arg1 != 6420) {
            this.field6096 = 120;
        }
        if (!arg0) {
            OpenGL.glDisable(32925);
        } else {
            OpenGL.glEnable(32925);
        }
        ++field6021;
    }

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "()V")
    public final void method936() {
        ++field6030;
        if (super.field8219 > 0 || super.field8249 > 0) {
            int var1 = super.field8344;
            int var2 = super.field8328;
            int var3 = super.field8324;
            int var4 = super.field8399;
            this.method962();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3296(3292);
            this.method3320(-32, false);
            this.method3333(false, (byte) -97);
            this.method3330(false, (byte) -113);
            this.method3284(false, 125);
            this.method3344(29639, (class11) null);
            this.method3329(-10053, false, false, -2);
            this.method3291(1, 2);
            this.method3343(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field8219, super.field8249, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method977(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "(I)V")
    public final void method1155(int arg0) {
        ++field6053;
        OpenGL.glLightfv(16384, 4611, super.field8377, arg0);
        OpenGL.glLightfv(16385, 4611, super.field8400, 0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIIB[I)Lgq;")
    public final class305 method1169(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6) {
        ++field6005;
        if (arg5 != -63) {
            this.method1168((byte) -80);
        }
        if (!this.field6105 && (!class506.method2832(arg4, arg5 ^ -62) || !class506.method2832(arg1, 3))) {
            if (this.field6100) {
                return new class172(this, arg4, arg1, arg6, arg2, arg3);
            } else {
                class636 var8 = new class636(this, class532.field7430, class280.field3663, class468.method2685(arg4, false), class468.method2685(arg1, false));
                var8.method1055(arg2, arg5 + 30582, arg3, arg6, 0, arg1, arg4, 0);
                return var8;
            }
        } else {
            return new class636(this, arg4, arg1, arg0, arg6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final synchronized void method2563(int arg0, int arg1, int arg2) {
        ++field6062;
        int var4 = -98 % ((arg1 - -36) / 36);
        class147 var5 = new class147(arg2);
        var5.field1401 = (long) arg0;
        this.field6075.method3181(var5, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method968(boolean arg0) {
        ++field6022;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2564(String arg0, int arg1) {
        ++field6070;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = arg1; class466.field6613 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class126.field1572[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class321.field4442[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "(I)V")
    public final void method949(int arg0) {
        ++field6018;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "(I)V")
    public static void method2565(int arg0) {
        field6004 = null;
        if (arg0 == 0) {
            field6085 = null;
            field6067 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "(B)V")
    public final void method1203(byte arg0) {
        ++field6071;
        int var2 = -114 / ((35 - arg0) / 58);
        int var3;
        if (!super.field8329) {
            super.field8384 = (float) (-super.field8302 + super.field8374);
            super.field8388 = (float) (-super.field8323) + super.field8384;
            if (super.field8388 < (float) super.field8393) {
                super.field8388 = (float) super.field8393;
            }
            OpenGL.glFogf(2915, super.field8388);
            OpenGL.glFogf(2916, super.field8384);
            var3 = super.field8305;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var3 = super.field8306;
        }
        class196.field2545[1] = (float) class143.method783(var3, 65280) / 65280.0F;
        class196.field2545[2] = (float) class143.method783(255, var3) / 255.0F;
        class196.field2545[0] = (float) class143.method783(16711680, var3) / 1.671168E7F;
        OpenGL.glFogfv(2918, class196.field2545, 0);
    }

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "(I)V")
    public final void method1191(int arg0) {
        ++field6012;
        OpenGL.glDepthMask(super.field8335 && super.field8339);
        if (arg0 != 16725) {
            this.method1168((byte) 28);
        }
    }

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "(I)V")
    public final void method1162(int arg0) {
        if (arg0 < -96) {
            this.method2562(0);
            ++field6057;
        }
    }

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "(I)V")
    public final void method1158(int arg0) {
        int var2 = -19 / ((arg0 - -67) / 41);
        OpenGL.glTexEnvi(8960, 34161, class139.method737((byte) 121, super.field8312[super.field8391]));
        ++field6078;
    }

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "()V")
    public final void method945() {
        ++field6079;
        super.method945();
        if (this.field6040 != null) {
            this.field6040.method3262();
            this.field6040.release();
            this.field6040 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BBIIILuda;)Lnf;")
    public final class37 method1151(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, class509 arg5) {
        ++field6027;
        if (arg1 < 37) {
            this.method946();
        }
        return new class34(this, arg5, arg3, arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lrn;Lrn;FLrn;)Lrn;")
    public final class307 method931(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        ++field6003;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "(I)V")
    public final void method1213(int arg0) {
        ++field6056;
        if (class6.field55 == super.field8301) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class198.field2596 == super.field8301) {
            OpenGL.glBlendFunc(1, 1);
        } else if (class504.field7015 == super.field8301) {
            OpenGL.glBlendFunc(774, 1);
        }
        if (arg0 >= -65) {
            method2561((byte) -102, (class541) null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsb;Luda;I)Z")
    public final boolean method1214(class280 arg0, class509 arg1, int arg2) {
        ++field6082;
        return arg2 < 12 ? true : true;
    }

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "(I)V")
    public final void method1172(int arg0) {
        ++field6061;
        if (arg0 != 128) {
            this.method1195((Canvas) null, true, (Object) null);
        }
        this.method2562(0);
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)Lsf;")
    public final class554 method1157(int arg0, int arg1) {
        if (arg0 <= 85) {
            this.method912();
        }
        ++field6023;
        if (~arg1 != -4) {
            return ~arg1 == -5 ? new class83(this, super.field8177, super.field8213) : super.method1157(126, arg1);
        } else {
            return new class539(this, super.field8177);
        }
    }

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "(II)V")
    public final synchronized void method2566(int arg0, int arg1) {
        ++field6058;
        class108 var3 = new class108();
        var3.field1401 = (long) arg0;
        if (arg1 <= 8) {
            this.method950(24, -31, -11, 112);
        }
        this.field6091.method3181(var3, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lbe;Lbd;IIIII)V")
    public final void method1212(class189 arg0, class180 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6036;
        byte var8;
        int var9;
        if (class202.field2645 != arg0) {
            if (class516.field7179 == arg0) {
                var8 = 3;
                var9 = arg5 + 1;
            } else if (class546.field7613 != arg0) {
                if (class603.field8706 != arg0) {
                    if (class172.field2222 != arg0) {
                        var8 = 0;
                        var9 = arg5;
                    } else {
                        var8 = 5;
                        var9 = arg5 + 2;
                    }
                } else {
                    var8 = 6;
                    var9 = arg5 - -2;
                }
            } else {
                var8 = 4;
                var9 = arg5 * 3;
            }
        } else {
            var8 = 1;
            var9 = arg5 * 2;
        }
        if (arg3 > -22) {
            this.field6092 = null;
        }
        class280 var10 = arg1.method1108(-125);
        class225 var11 = (class225) arg1;
        var11.method299((byte) -81);
        OpenGL.glDrawElements(var8, var9, class329.method2043(var10, -114), var11.method295(false) + (long) (var10.field3654 * arg6));
    }

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "(I)V")
    public final void method1160(int arg0) {
        if (super.field8397) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        ++field6019;
        if (arg0 != -28988) {
            field6067 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method1165(boolean arg0, Canvas arg1) {
        ++field6050;
        long var3 = this.field6040.prepareSurface(arg1);
        if (!arg0) {
            this.method1186(-79);
        }
        if (var3 == -1L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIIIIII)I")
    public static final int method2567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6007;
        int var7 = arg0 & 3;
        if (arg6 != 7) {
            field6067 = null;
        }
        if ((arg1 & 1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        if (~var7 == -1) {
            return arg5;
        } else if (var7 == 1) {
            return -arg2 + 7 + -arg4 + 1;
        } else {
            return ~var7 == -3 ? -arg5 - (arg3 - 1) + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(B)V")
    public final void method1181(byte arg0) {
        if (!super.field8349) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        int var2 = -125 % ((-35 - arg0) / 39);
        ++field6088;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
    public final synchronized void method2568(int arg0, int arg1, byte arg2) {
        ++field6041;
        class147 var4 = new class147(arg0);
        var4.field1401 = (long) arg1;
        int var5 = -29 / ((54 - arg2) / 55);
        this.field6086.method3181(var4, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BILuda;BIZI)Lgq;")
    public final class305 method1156(int arg0, byte[] arg1, int arg2, class509 arg3, byte arg4, int arg5, boolean arg6, int arg7) {
        ++field6047;
        if (arg4 != -115) {
            return null;
        } else if (!this.field6105 && (!class506.method2832(arg2, 3) || !class506.method2832(arg0, 3))) {
            if (!this.field6100) {
                class636 var9 = new class636(this, arg3, class280.field3663, class468.method2685(arg2, false), class468.method2685(arg0, false));
                var9.method1054(0, arg5, arg1, arg2, (byte) -21, arg3, arg7, arg0, 0);
                return var9;
            } else {
                return new class172(this, arg3, arg2, arg0, arg1, arg7, arg5);
            }
        } else {
            return new class636(this, arg3, arg2, arg0, arg6, arg1, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "()V")
    public final void method948() {
        OpenGL.glFinish();
        ++field6063;
    }

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "(I)V")
    public final void method1211(int arg0) {
        if (super.field8395 && !super.field8366) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 22488) {
            this.method1163(true);
        }
        ++field6042;
    }

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "()Lqf;")
    public final class183 method988() {
        ++field6038;
        int var1 = -1;
        if (this.field6104.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (~this.field6104.indexOf("intel") == 0) {
            if (~this.field6104.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class183(var1, "OpenGL", this.field6095, this.field6102, 0L);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public final void method1195(Canvas arg0, boolean arg1, Object arg2) {
        ++field6069;
        if (!arg1) {
            this.method1214((class280) null, (class509) null, -57);
        }
        Long var4 = (Long) arg2;
        if (!this.field6040.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "(I)V")
    public final void method1194(int arg0) {
        if (arg0 != 0) {
            this.field6102 = null;
        }
        if (super.field8362 && super.field8310 && ~super.field8323 <= -1 | super.field8329) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field6044;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lkq;I)V")
    public final void method1207(class102 arg0, int arg1) {
        ++field6060;
        if (arg1 != 1) {
            this.method1202(-51);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLn;Lkr;I)V")
    public class442(OpenGL arg0, Canvas arg1, long arg2, class473 arg3, class329 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field6040 = arg0;
            this.field6040.method3264();
            this.field6104 = OpenGL.glGetString(7936).toLowerCase();
            this.field6102 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field6104.indexOf("microsoft") == -1 && ~this.field6104.indexOf("brian paul") == 0 && this.field6104.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class455.method2637(' ', (byte) 57, var8.replace('.', ' '));
                if (~var9.length <= -3) {
                    try {
                        int var10 = class254.method1532(var9[0], 2);
                        int var11 = class254.method1532(var9[1], 2);
                        this.field6095 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field6095 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field6040.method3263("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field6040.method3263("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field8319 = var12[0];
                        if (~super.field8319 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field8351 = 8;
                            this.field6101 = this.field6040.method3263("GL_ARB_vertex_buffer_object");
                            super.field8337 = this.field6040.method3263("GL_ARB_multisample");
                            this.field6100 = this.field6040.method3263("GL_ARB_texture_rectangle");
                            super.field8372 = this.field6040.method3263("GL_ARB_texture_cube_map");
                            this.field6105 = this.field6040.method3263("GL_ARB_texture_non_power_of_two");
                            super.field8315 = this.field6040.method3263("GL_EXT_texture3D");
                            this.field6040.method3263("GL_ARB_vertex_shader");
                            this.field6103 = this.field6040.method3263("GL_ARB_vertex_program");
                            this.field6040.method3263("GL_ARB_fragment_shader");
                            this.field6040.method3263("GL_ARB_fragment_program");
                            this.field6096 = Stream.method3209() ? 33639 : 5121;
                            if (this.field6102.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class455.method2637(' ', (byte) 95, this.field6102.replace('/', ' '));
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class111.method601(false, var18.substring(1, 3))) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (var18.length() >= 4 && class111.method601(false, var18.substring(0, 4))) {
                                                    var13 = class254.method1532(var18.substring(0, 4), 2);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (~var13 <= -7001 && ~var13 >= -9251) {
                                        super.field8315 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -8000) {
                                        this.field6101 = false;
                                    }
                                }
                                this.field6100 &= this.field6040.method3263("GL_ARB_half_float_pixel");
                            }
                            this.field6104.indexOf("intel");
                            if (this.field6101) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                            this.field6099 = new int[super.field8319];
                            OpenGL.glClear(16640);
                            this.field6040.swapBuffers();
                            OpenGL.glClear(16640);
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
            this.method945();
            throw new RuntimeException("");
        }
    }

    static {
        new class344("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }
}
