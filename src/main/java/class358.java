import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class358 extends class745 {

    @OriginalMember(owner = "client!bga", name = "Sh", descriptor = "Luh;")
    private class168 field5120 = new class168();

    @OriginalMember(owner = "client!bga", name = "wi", descriptor = "Luh;")
    private class168 field5150 = new class168();

    @OriginalMember(owner = "client!bga", name = "yi", descriptor = "Luh;")
    private class168 field5152 = new class168();

    @OriginalMember(owner = "client!bga", name = "zi", descriptor = "Luh;")
    private class168 field5153 = new class168();

    @OriginalMember(owner = "client!bga", name = "Ai", descriptor = "Luh;")
    private class168 field5154 = new class168();

    @OriginalMember(owner = "client!bga", name = "Bi", descriptor = "Luh;")
    private class168 field5155 = new class168();

    @OriginalMember(owner = "client!bga", name = "Ci", descriptor = "Luh;")
    private class168 field5156 = new class168();

    @OriginalMember(owner = "client!bga", name = "Ei", descriptor = "[Lbba;")
    private class115[] field5158 = new class115[16];

    @OriginalMember(owner = "client!bga", name = "Ki", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5164 = new MapBuffer();

    @OriginalMember(owner = "client!bga", name = "Mi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field5166 = new MapBuffer();

    @OriginalMember(owner = "client!bga", name = "Wi", descriptor = "I")
    private int field5176 = 0;

    @OriginalMember(owner = "client!bga", name = "Fh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5107;

    @OriginalMember(owner = "client!bga", name = "Oi", descriptor = "Ljava/lang/String;")
    private String field5168;

    @OriginalMember(owner = "client!bga", name = "Ni", descriptor = "Ljava/lang/String;")
    private String field5167;

    @OriginalMember(owner = "client!bga", name = "Vi", descriptor = "I")
    private int field5175;

    @OriginalMember(owner = "client!bga", name = "Ri", descriptor = "Z")
    public boolean field5171;

    @OriginalMember(owner = "client!bga", name = "Qi", descriptor = "Z")
    private boolean field5170;

    @OriginalMember(owner = "client!bga", name = "Xi", descriptor = "Z")
    private boolean field5177;

    @OriginalMember(owner = "client!bga", name = "Si", descriptor = "Z")
    public boolean field5172;

    @OriginalMember(owner = "client!bga", name = "Ui", descriptor = "Z")
    public boolean field5174;

    @OriginalMember(owner = "client!bga", name = "Ti", descriptor = "Z")
    public boolean field5173;

    @OriginalMember(owner = "client!bga", name = "Yi", descriptor = "[I")
    public int[] field5178;

    @OriginalMember(owner = "client!bga", name = "Pi", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!bga", name = "Jh", descriptor = "Loaa;")
    public static class290 field5111 = new class290(15, 0, 1, 0);

    @OriginalMember(owner = "client!bga", name = "Ng", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!bga", name = "Og", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!bga", name = "Pg", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!bga", name = "Qg", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!bga", name = "Rg", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!bga", name = "Sg", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!bga", name = "Tg", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!bga", name = "Ug", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!bga", name = "Vg", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!bga", name = "Wg", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!bga", name = "Xg", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!bga", name = "Yg", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!bga", name = "Zg", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!bga", name = "ah", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!bga", name = "bh", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!bga", name = "ch", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!bga", name = "dh", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!bga", name = "eh", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!bga", name = "fh", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!bga", name = "gh", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!bga", name = "hh", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!bga", name = "ih", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!bga", name = "jh", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!bga", name = "kh", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!bga", name = "lh", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!bga", name = "mh", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!bga", name = "nh", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!bga", name = "oh", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bga", name = "ph", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!bga", name = "qh", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!bga", name = "rh", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!bga", name = "sh", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!bga", name = "th", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!bga", name = "uh", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!bga", name = "vh", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!bga", name = "wh", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!bga", name = "xh", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!bga", name = "yh", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!bga", name = "zh", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!bga", name = "Ah", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!bga", name = "Bh", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!bga", name = "Ch", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!bga", name = "Dh", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!bga", name = "Eh", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!bga", name = "Gh", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!bga", name = "Hh", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!bga", name = "Ih", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!bga", name = "Kh", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!bga", name = "Lh", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!bga", name = "Mh", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!bga", name = "Nh", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!bga", name = "Oh", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!bga", name = "Ph", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!bga", name = "Qh", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!bga", name = "Rh", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!bga", name = "Th", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!bga", name = "Uh", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!bga", name = "Vh", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bga", name = "Wh", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!bga", name = "Xh", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!bga", name = "Yh", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!bga", name = "Zh", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!bga", name = "ai", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bga", name = "bi", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!bga", name = "ci", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!bga", name = "di", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!bga", name = "ei", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!bga", name = "fi", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!bga", name = "gi", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!bga", name = "hi", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!bga", name = "ii", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!bga", name = "ji", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!bga", name = "ki", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!bga", name = "li", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!bga", name = "mi", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!bga", name = "ni", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!bga", name = "oi", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!bga", name = "pi", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!bga", name = "qi", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!bga", name = "ri", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!bga", name = "si", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!bga", name = "ti", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!bga", name = "ui", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!bga", name = "vi", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!bga", name = "xi", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!bga", name = "Gi", descriptor = "I")
    private int field5160;

    @OriginalMember(owner = "client!bga", name = "Di", descriptor = "J")
    private long field5157;

    @OriginalMember(owner = "client!bga", name = "Fi", descriptor = "Z")
    private boolean field5159;

    @OriginalMember(owner = "client!bga", name = "Hi", descriptor = "Z")
    private boolean field5161;

    @OriginalMember(owner = "client!bga", name = "Ii", descriptor = "Z")
    private boolean field5162;

    @OriginalMember(owner = "client!bga", name = "Ji", descriptor = "Z")
    private boolean field5163;

    @OriginalMember(owner = "client!bga", name = "Li", descriptor = "Z")
    private boolean field5165;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V", line = 3)
    public final synchronized void method233(int arg0) {
        ++field5121;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5150.method1276((byte) 18)) {
            class113 var12 = (class113) this.field5150.method1271(8);
            class368.field5246[var2++] = (int) var12.field5204;
            super.field10177 -= var12.field1945;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class368.field5246, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class368.field5246, 0);
            var2 = 0;
        }
        while (!this.field5152.method1276((byte) 18)) {
            class113 var11 = (class113) this.field5152.method1271(8);
            class368.field5246[var2++] = (int) var11.field5204;
            super.field10176 -= var11.field1945;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class368.field5246, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class368.field5246, 0);
            var2 = 0;
        }
        while (!this.field5153.method1276((byte) 18)) {
            class113 var10 = (class113) this.field5153.method1271(8);
            class368.field5246[var2++] = var10.field1945;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class368.field5246, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class368.field5246, 0);
            var2 = 0;
        }
        while (!this.field5154.method1276((byte) 18)) {
            class113 var9 = (class113) this.field5154.method1271(8);
            class368.field5246[var2++] = (int) var9.field5204;
            super.field10193 -= var9.field1945;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class368.field5246, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class368.field5246, 0);
            boolean var4 = false;
        }
        while (!this.field5120.method1276((byte) 18)) {
            class113 var8 = (class113) this.field5120.method1271(8);
            OpenGL.glDeleteLists((int) var8.field5204, var8.field1945);
        }
        while (!this.field5155.method1276((byte) 18)) {
            class362 var7 = this.field5155.method1271(8);
            OpenGL.glDeleteProgramARB((int) var7.field5204);
        }
        while (!this.field5156.method1276((byte) 18)) {
            class362 var6 = this.field5156.method1271(8);
            OpenGL.glDeleteObjectARB(var6.field5204);
        }
        while (!this.field5120.method1276((byte) 18)) {
            class113 var5 = (class113) this.field5120.method1271(8);
            OpenGL.glDeleteLists((int) var5.field5204, var5.field1945);
        }
        if (this.method339() > 100663296 && ~(this.field5157 + 60000L) > ~class554.method3190(-82)) {
            System.gc();
            this.field5157 = class554.method3190(-96);
        }
        super.method233(var3);
    }

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "(B)V", line = 163)
    public final void method2242(byte arg0) {
        if (arg0 == -116) {
            OpenGL.glDepthMask(super.field10238 && super.field10232);
            ++field5088;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[Ljl;)Lnp;", line = 177)
    public final class491 method2243(int arg0, class273[] arg1) {
        ++field5126;
        if (arg0 != 0) {
            this.field5164 = null;
        }
        return new class162(arg1);
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(Z)V", line = 190)
    public final void method2244(boolean arg0) {
        ++field5095;
        if (!arg0) {
            this.field5150 = null;
        }
        if (super.field10224) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 211)
    public static final void method2245(String arg0, int arg1, int arg2) {
        ++field5092;
        class594 var3 = class692.method3869(arg1, (byte) 105, arg2);
        var3.method3378(-25490);
        var3.field8128 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V", line = 224)
    public final void method2246(Object arg0, byte arg1, Canvas arg2) {
        ++field5131;
        if (arg1 == 99) {
            Long var4 = (Long) arg0;
            if (!this.field5107.setSurface(var4)) {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "(B)V", line = 240)
    public final void method2247(byte arg0) {
        ++field5082;
        if (arg0 <= -18) {
            this.method2271(1);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZILkf;Z)V", line = 255)
    public final void method2248(boolean arg0, boolean arg1, int arg2, class255 arg3, boolean arg4) {
        ++field5103;
        if (!arg1) {
            OpenGL.glTexEnvi(8960, arg2 + 34176, class335.method2124((byte) 101, arg3));
            if (arg0) {
                OpenGL.glTexEnvi(8960, arg2 + 34192, !arg4 ? 770 : 771);
            } else {
                OpenGL.glTexEnvi(8960, arg2 + 34192, !arg4 ? 768 : 769);
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lbaa;Lwq;B)Z", line = 271)
    public final boolean method2249(class523 arg0, class169 arg1, byte arg2) {
        ++field5100;
        int var4 = -21 / ((85 - arg2) / 37);
        return true;
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(Z)V", line = 281)
    public final void method2250(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        if (!arg0) {
            this.method251();
        }
        ++field5135;
        OpenGL.glLoadMatrixf(super.field10249, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bga", name = "ya", descriptor = "()V", line = 297)
    public final void method324() {
        ++field5090;
        this.method4156(-32, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(JI)V", line = 306)
    public final synchronized void method2251(long arg0, int arg1) {
        ++field5104;
        class362 var4 = new class362();
        var4.field5204 = arg0;
        if (arg1 == 34192) {
            this.field5156.method1273(var4, arg1 ^ -52036);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)Lvm;", line = 320)
    public final class686 method273(int arg0, int arg1) {
        ++field5144;
        return null;
    }

    @OriginalMember(owner = "client!bga", name = "K", descriptor = "(I)V", line = 329)
    public final void method2252(int arg0) {
        ++field5112;
        OpenGL.glTexEnvi(8960, 34162, class77.method717((byte) 32, super.field10206[super.field10289]));
        if (arg0 >= -99) {
            this.method350(-123, -102, -33, -112);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILwq;ZI[B)Lir;", line = 344)
    public final class26 method2253(int arg0, int arg1, class169 arg2, boolean arg3, int arg4, byte[] arg5) {
        if (!arg3) {
            this.field5167 = null;
        }
        ++field5083;
        return new class407(this, arg2, arg1, arg4, arg0, arg5);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBI)V", line = 356)
    public final synchronized void method2254(int arg0, byte arg1, int arg2) {
        ++field5149;
        class113 var4 = new class113(arg0);
        if (arg1 != 59) {
            this.method2244(false);
        }
        var4.field5204 = (long) arg2;
        this.field5152.method1273(var4, -20180);
    }

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "(B)V", line = 370)
    public final void method2255(byte arg0) {
        ++field5147;
        if (arg0 != 101) {
            this.method2254(52, (byte) -47, 49);
        }
    }

    @OriginalMember(owner = "client!bga", name = "H", descriptor = "(I)V", line = 380)
    public final void method2256(int arg0) {
        class274.field3856[0] = super.field10294 * super.field10207;
        ++field5115;
        class274.field3856[2] = super.field10282 * super.field10207;
        class274.field3856[1] = super.field10207 * super.field10201;
        class274.field3856[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class274.field3856, arg0);
    }

    @OriginalMember(owner = "client!bga", name = "T", descriptor = "(I)V", line = 392)
    public static void method2257(int arg0) {
        int var1 = 69 % ((-67 - arg0) / 57);
        field5111 = null;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIII[BLwq;IZ)Lwfa;", line = 405)
    public final class200 method2258(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class169 arg5, int arg6, boolean arg7) {
        ++field5097;
        if (arg6 != 32) {
            this.field5107 = null;
        }
        if (!this.field5177 && (!class476.method2796(arg6 ^ 70, arg2) || !class476.method2796(arg6 + 83, arg0))) {
            if (this.field5170) {
                return new class204(this, arg5, arg2, arg0, arg4, arg1, arg3);
            } else {
                class114 var9 = new class114(this, arg5, class523.field7249, class529.method3059(arg2, (byte) 108), class529.method3059(arg0, (byte) 108));
                var9.method1007(0, arg1, (byte) -45, arg3, arg0, arg2, 0, arg4, arg5);
                return var9;
            }
        } else {
            return new class114(this, arg5, arg2, arg0, arg7, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(BI)V", line = 433)
    public final void method2259(byte arg0, int arg1) {
        if (arg0 == -26) {
            ++field5085;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lbf;I)V", line = 443)
    public final void method2260(class536 arg0, int arg1) {
        if (arg1 == 0) {
            ++field5087;
            if (class738.field9929 != arg0) {
                int var3 = class494.method2906(arg0, 25602);
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
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BZ)V", line = 471)
    public final void method2261(byte arg0, boolean arg1) {
        ++field5098;
        if (arg0 <= 34) {
            this.field5165 = false;
        }
        if (arg1) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
    }

    @OriginalMember(owner = "client!bga", name = "M", descriptor = "(I)V", line = 486)
    public final void method2262(int arg0) {
        OpenGL.glMatrixMode(5890);
        ++field5139;
        if (super.field10227[super.field10289] != class161.field2578) {
            OpenGL.glLoadMatrixf(super.field10245[super.field10289].method754(class631.field8677, 0), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        if (arg0 != 1) {
            this.method2289(37, (class491) null);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILtc;I)V", line = 505)
    public final void method2263(int arg0, class353 arg1, int arg2) {
        ++field5065;
        int var4 = 86 / ((arg0 - -26) / 39);
        this.field5158[arg2] = (class115) arg1;
    }

    @OriginalMember(owner = "client!bga", name = "F", descriptor = "(I)V", line = 518)
    public final void method2264(int arg0) {
        ++field5113;
        if (arg0 != 10) {
            this.method2293((Canvas) null, 34, (Object) null);
        }
        OpenGL.glTexEnvi(8960, 34161, class77.method717((byte) 32, super.field10200[super.field10289]));
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(II)Lhe;", line = 530)
    public final class372 method353(int arg0, int arg1) {
        ++field5142;
        return null;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)V", line = 538)
    public final void method2265(byte arg0) {
        ++field5138;
        int var2 = this.field5178[super.field10289];
        if (~var2 != -1) {
            this.field5178[super.field10289] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        if (arg0 >= -19) {
            this.field5157 = 83L;
        }
    }

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "(B)V", line = 557)
    public final void method2266(byte arg0) {
        ++field5125;
        for (int var2 = super.field10204 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
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
        int var4 = 0;
        if (arg0 < 45) {
            this.field5176 = 51;
        }
        while (~var4 > -9) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
            ++var4;
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5107.setSwapInterval(0);
        super.method2266((byte) 122);
    }

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "(B)V", line = 613)
    public final void method2267(byte arg0) {
        ++field5130;
        if (super.field10262 && super.field10237 && super.field10205 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 > -30) {
            this.method324();
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lhe;Lvm;)Lis;", line = 632)
    public final class503 method319(class372 arg0, class686 arg1) {
        ++field5148;
        return null;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;", line = 640)
    public final Object method2268(int arg0, Canvas arg1) {
        ++field5145;
        if (arg0 != -1) {
            this.method220(-118);
        }
        long var3 = this.field5107.prepareSurface(arg1);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "()Lfia;", line = 660)
    public final class575 method298() {
        ++field5094;
        int var1 = -1;
        if (~this.field5168.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field5168.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field5168.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class575(var1, "OpenGL", this.field5175, this.field5167, 0L);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lwh;Lwh;FLwh;)Lwh;", line = 684)
    public final class149 method340(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        ++field5124;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V", line = 692)
    public final synchronized void method2269(int arg0, int arg1, int arg2) {
        if (arg2 != 3089) {
            this.field5178 = null;
        }
        ++field5101;
        class113 var4 = new class113(arg0);
        var4.field5204 = (long) arg1;
        this.field5150.method1273(var4, arg2 ^ -17091);
    }

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "(Z)V", line = 706)
    public final void method2270(boolean arg0) {
        class274.field3856[2] = super.field10288 * super.field10282;
        class274.field3856[3] = 1.0F;
        class274.field3856[0] = super.field10294 * super.field10288;
        ++field5076;
        class274.field3856[1] = super.field10288 * super.field10201;
        OpenGL.glLightfv(16384, 4609, class274.field3856, 0);
        class274.field3856[0] = -super.field10300 * super.field10294;
        class274.field3856[2] = -super.field10300 * super.field10282;
        if (arg0) {
            class274.field3856[3] = 1.0F;
            class274.field3856[1] = -super.field10300 * super.field10201;
            OpenGL.glLightfv(16385, 4609, class274.field3856, 0);
        }
    }

    @OriginalMember(owner = "client!bga", name = "U", descriptor = "(I)V", line = 726)
    private final void method2271(int arg0) {
        if (this.field5162) {
            OpenGL.glPopMatrix();
        }
        ++field5091;
        if (arg0 != 1) {
            this.method2299(69);
        }
        if (!super.field10298.method2676(-98)) {
            if (super.field10183) {
                OpenGL.glLoadIdentity();
                this.field5162 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field10188.method754(class631.field8677, 0), 0);
                this.field5162 = false;
            }
        } else {
            if (!this.field5165) {
                OpenGL.glLoadMatrixf(super.field10197.method754(class631.field8677, 0), 0);
                this.field5165 = true;
                this.method2295(0);
                this.method2277((byte) -104);
            }
            if (!super.field10183) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field10188.method754(class631.field8677, arg0 ^ 1), 0);
                this.field5162 = true;
            } else {
                this.field5162 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "()V", line = 773)
    public final void method251() {
        super.method251();
        ++field5119;
        if (this.field5107 != null) {
            this.field5107.method3567();
            this.field5107.release();
            this.field5107 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "(I)V", line = 790)
    public final void method2272(int arg0) {
        if (arg0 != 25644) {
            this.field5172 = false;
        }
        ++field5122;
        super.field10229 = (float) (-super.field10219 + super.field10268);
        super.field10287 = (float) (-super.field10205) + super.field10229;
        if (super.field10287 < (float) super.field10209) {
            super.field10287 = (float) super.field10209;
        }
        OpenGL.glFogf(2915, super.field10287);
        OpenGL.glFogf(2916, super.field10229);
        class274.field3856[2] = (float) class263.method1762(super.field10258, 255) / 255.0F;
        class274.field3856[0] = (float) class263.method1762(16711680, super.field10258) / 1.671168E7F;
        class274.field3856[1] = (float) class263.method1762(65280, super.field10258) / 65280.0F;
        OpenGL.glFogfv(2918, class274.field3856, 0);
    }

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "()Z", line = 813)
    public final boolean method291() {
        ++field5080;
        return false;
    }

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "(I)V", line = 823)
    public final void method2273(int arg0) {
        if (super.field10259 && !super.field10263) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field5069;
        int var2 = -61 / ((arg0 - 20) / 36);
    }

    @OriginalMember(owner = "client!bga", name = "G", descriptor = "(I)V", line = 837)
    public final void method2274(int arg0) {
        ++field5075;
        if (arg0 == 1) {
            if (!super.field10323) {
                OpenGL.glDisable(3089);
            } else {
                OpenGL.glEnable(3089);
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "D", descriptor = "(B)V", line = 855)
    public final void method2275(byte arg0) {
        if (arg0 != -33) {
            this.method2283(35, (byte) -122);
        }
        OpenGL.glViewport(super.field10295, super.field10223, super.field10045, super.field10076);
        ++field5078;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIII)V", line = 866)
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        ++field5084;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lin;I)V", line = 876)
    public class358(OpenGL arg0, Canvas arg1, long arg2, class152 arg3, class91 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field5107 = arg0;
            this.field5107.method3568();
            this.field5168 = OpenGL.glGetString(7936).toLowerCase();
            this.field5167 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field5168.indexOf("microsoft") == -1 && ~this.field5168.indexOf("brian paul") == 0 && this.field5168.indexOf("mesa") == -1) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class728.method4031(' ', true, var8.replace('.', ' '));
                if (var9.length < 2) {
                    throw new RuntimeException("");
                } else {
                    try {
                        int var10 = class432.method2626(true, var9[0]);
                        int var11 = class432.method2626(true, var9[1]);
                        this.field5175 = var10 * 10 - -var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field5175 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field5107.method3569("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field5107.method3569("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field10204 = var12[0];
                        if (super.field10204 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field10252 = 8;
                            this.field5171 = this.field5107.method3569("GL_ARB_vertex_buffer_object");
                            super.field10296 = this.field5107.method3569("GL_ARB_multisample");
                            this.field5170 = this.field5107.method3569("GL_ARB_texture_rectangle");
                            super.field10215 = this.field5107.method3569("GL_ARB_texture_cube_map");
                            this.field5177 = this.field5107.method3569("GL_ARB_texture_non_power_of_two");
                            super.field10273 = this.field5107.method3569("GL_EXT_texture3D");
                            this.field5172 = this.field5107.method3569("GL_ARB_vertex_shader");
                            this.field5174 = this.field5107.method3569("GL_ARB_vertex_program");
                            this.field5173 = this.field5107.method3569("GL_ARB_fragment_shader");
                            this.field5107.method3569("GL_ARB_fragment_program");
                            this.field5178 = new int[super.field10204];
                            this.field5169 = Stream.method3789() ? 33639 : 5121;
                            if (this.field5167.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class728.method4031(' ', true, this.field5167.replace('/', ' '));
                                for (int var17 = 0; ~var16.length < ~var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (var18.charAt(0) == 'x' && ~var18.length() <= -4 && class142.method1130(var18.substring(1, 3), -115)) {
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
                                                if (var18.length() >= 4 && class142.method1130(var18.substring(0, 4), 92)) {
                                                    var13 = class432.method2626(true, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 7999) {
                                        this.field5171 = false;
                                    }
                                    if (~var13 <= -7001 && var13 <= 9250) {
                                        super.field10273 = false;
                                    }
                                }
                                this.field5170 &= this.field5107.method3569("GL_ARB_half_float_pixel");
                            }
                            this.field5168.indexOf("intel");
                            if (this.field5171) {
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
            this.method614((byte) -28);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lhj;ILuq;IIII)V", line = 1031)
    public final void method2276(class569 arg0, int arg1, class163 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 <= 46) {
            this.field5154 = null;
        }
        ++field5118;
        int var8;
        byte var9;
        if (class198.field2902 != arg0) {
            if (class662.field9052 == arg0) {
                var8 = arg1 + 1;
                var9 = 3;
            } else if (class34.field855 == arg0) {
                var9 = 4;
                var8 = arg1 * 3;
            } else if (class187.field2805 == arg0) {
                var9 = 6;
                var8 = arg1 + 2;
            } else if (class146.field2443 != arg0) {
                var8 = arg1;
                var9 = 0;
            } else {
                var8 = arg1 + 2;
                var9 = 5;
            }
        } else {
            var9 = 1;
            var8 = arg1 * 2;
        }
        class523 var10 = arg2.method1242((byte) 51);
        class492 var11 = (class492) arg2;
        var11.method3108(0);
        OpenGL.glDrawElements(var9, var8, class491.method2898(-20, var10), var11.method3105(27819) + (long) (var10.field7244 * arg4));
    }

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "(B)V", line = 1089)
    public final void method2277(byte arg0) {
        ++field5063;
        int var2 = -79 / ((arg0 - -39) / 62);
        this.method4153(5);
        int var3;
        for (var3 = 0; super.field10265 > var3; ++var3) {
            class669 var4 = super.field10246[var3];
            int var5 = var4.method3755(-1);
            int var6 = var3 + 16386;
            float var7 = var4.method3756(-37) / 255.0F;
            class274.field3856[0] = (float) var4.method3759(-1);
            class274.field3856[1] = (float) var4.method3757(124);
            class274.field3856[2] = (float) var4.method3752((byte) 111);
            class274.field3856[3] = 1.0F;
            OpenGL.glLightfv(var6, 4611, class274.field3856, 0);
            class274.field3856[2] = (float) class263.method1762(255, var5) * var7;
            class274.field3856[1] = var7 * (float) (class263.method1762(var5, 65338) >> 8);
            class274.field3856[0] = (float) class263.method1762(255, var5 >> 16) * var7;
            class274.field3856[3] = 1.0F;
            OpenGL.glLightfv(var6, 4609, class274.field3856, 0);
            OpenGL.glLightf(var6, 4617, 1.0F / (float) (var4.method3758(-1) * var4.method3758(-1)));
            OpenGL.glEnable(var6);
        }
        while (~super.field10236 < ~var3) {
            OpenGL.glDisable(16386 - -var3);
            ++var3;
        }
        super.method2277((byte) 107);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V", line = 1135)
    public final void method2278(int arg0, Canvas arg1, Object arg2) {
        if (arg0 != 12727) {
            this.field5176 = 5;
        }
        ++field5072;
        Long var4 = (Long) arg2;
        this.field5107.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "()V", line = 1148)
    public final void method355() {
        OpenGL.glFinish();
        ++field5127;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZLwq;Lbaa;)Z", line = 1157)
    public final boolean method2279(boolean arg0, class169 arg1, class523 arg2) {
        if (!arg0) {
            this.field5156 = null;
        }
        ++field5106;
        return true;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILhj;Z)V", line = 1168)
    public final void method2280(int arg0, int arg1, class569 arg2, boolean arg3) {
        ++field5105;
        if (!arg3) {
            this.field5172 = true;
        }
        byte var5;
        int var6;
        if (class198.field2902 != arg2) {
            if (class662.field9052 != arg2) {
                if (class34.field855 == arg2) {
                    var5 = 4;
                    var6 = arg0 * 3;
                } else if (class187.field2805 == arg2) {
                    var5 = 6;
                    var6 = arg0 + 2;
                } else if (class146.field2443 != arg2) {
                    var6 = arg0;
                    var5 = 0;
                } else {
                    var6 = arg0 + 2;
                    var5 = 5;
                }
            } else {
                var6 = arg0 - -1;
                var5 = 3;
            }
        } else {
            var6 = arg0 * 2;
            var5 = 1;
        }
        OpenGL.glDrawArrays(var5, arg1, var6);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([[IZII)Lnj;", line = 1225)
    public final class247 method2281(int[][] arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 <= 1) {
            this.field5153 = null;
        }
        ++field5134;
        return new class310(this, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lwq;II[FZIII)Lwfa;", line = 1237)
    public final class200 method2282(class169 arg0, int arg1, int arg2, float[] arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field5141;
        if (arg6 != 2) {
            this.field5164 = null;
        }
        if (!this.field5177 && (!class476.method2796(60, arg1) || !class476.method2796(-73, arg7))) {
            if (this.field5170) {
                return new class204(this, arg0, arg1, arg7, arg3, arg2, arg5);
            } else {
                class114 var9 = new class114(this, arg0, class523.field7253, class529.method3059(arg1, (byte) 108), class529.method3059(arg7, (byte) 108));
                var9.method1005(arg5, (byte) -126, arg3, arg0, 0, arg2, 0, arg1, arg7);
                return var9;
            }
        } else {
            return new class114(this, arg0, arg1, arg7, arg4, arg3, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "()Z", line = 1266)
    public final boolean method328() {
        ++field5132;
        return false;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)Lfj;", line = 1275)
    public final class657 method2283(int arg0, byte arg1) {
        ++field5151;
        if (arg1 >= -57) {
            this.method2283(-96, (byte) 20);
        }
        if (~arg0 != -4) {
            if (~arg0 != -5) {
                return ~arg0 == -9 ? new class505(this, super.field10153, super.field10051) : super.method2283(arg0, (byte) -73);
            } else {
                return new class189(this, super.field10153, super.field10051);
            }
        } else {
            return new class641(this, super.field10153);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[IZBIII)Lwfa;", line = 1320)
    public final class200 method2284(int arg0, int[] arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 101 / ((arg3 - -21) / 46);
        ++field5081;
        if (!this.field5177 && (!class476.method2796(103, arg0) || !class476.method2796(-53, arg6))) {
            if (!this.field5170) {
                class114 var9 = new class114(this, class746.field10332, class523.field7249, class529.method3059(arg0, (byte) 108), class529.method3059(arg6, (byte) 108));
                var9.method1013(arg5, 22809, arg1, 0, arg4, arg0, 0, arg6);
                return var9;
            } else {
                return new class204(this, arg0, arg6, arg1, arg4, arg5);
            }
        } else {
            return new class114(this, arg0, arg6, arg2, arg1, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!bga", name = "F", descriptor = "(II)V", line = 1348)
    public final void method301(int arg0, int arg1) {
        ++field5099;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)V", line = 1355)
    public final void method348(int arg0, int arg1) throws class721 {
        this.field5107.swapBuffers();
        ++field5108;
    }

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "()V", line = 1367)
    public final void method252() {
        ++field5143;
        if (~super.field10045 < -1 || ~super.field10076 < -1) {
            int var1 = super.field10220;
            int var2 = super.field10297;
            int var3 = super.field10279;
            int var4 = super.field10210;
            this.method305();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method4148((byte) -107);
            this.method4090(true, false);
            this.method4107(false, true);
            this.method4120(false, (byte) 127);
            this.method4156(-32, false);
            this.method4097((byte) 110, (class357) null);
            this.method4073(false, false, -2, (byte) 42);
            this.method4144(true, 1);
            this.method4076(117, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field10045, super.field10076, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method303(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bga", name = "Q", descriptor = "(I)V", line = 1409)
    public final void method2285(int arg0) {
        if (arg0 != 4) {
            this.method2299(-83);
        }
        if (!super.field10230) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        ++field5129;
    }

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "(II)V", line = 1427)
    public final synchronized void method2286(int arg0, int arg1) {
        ++field5070;
        class362 var3 = new class362();
        var3.field5204 = (long) arg1;
        this.field5155.method1273(var3, -20180);
        if (arg0 != 16386) {
            this.method2256(-86);
        }
    }

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "(I)V", line = 1445)
    public final void method2287(int arg0) {
        if (super.field10278) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        if (arg0 != 3) {
            this.method2275((byte) -23);
        }
        ++field5079;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lkf;IBZ)V", line = 1460)
    public final void method2288(class255 arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 == 80) {
            OpenGL.glTexEnvi(8960, arg1 + 34184, class335.method2124((byte) 123, arg0));
            ++field5136;
            OpenGL.glTexEnvi(8960, arg1 + 34200, arg3 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1472)
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class721 {
        ++field5074;
        this.method348(arg2, arg3);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILnp;)V", line = 1482)
    public final void method2289(int arg0, class491 arg1) {
        ++field5117;
        class273[] var3 = ((class162) arg1).field2586;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        for (int var8 = arg0; var8 < var3.length; ++var8) {
            class273 var11 = var3[var8];
            class115 var12 = this.field5158[var8];
            int var13 = 0;
            int var14 = var12.method1018(3545);
            long var15 = var12.method3105(27819);
            var12.method3108(0);
            for (int var17 = 0; ~var11.method1806((byte) -119) < ~var17; ++var17) {
                class11 var18 = var11.method1805(var17, -119);
                if (class11.field149 == var18) {
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                    var7 = true;
                } else if (class11.field151 == var18) {
                    var6 = true;
                    OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                } else if (class11.field152 != var18) {
                    if (class11.field153 == var18) {
                        OpenGL.glClientActiveTexture(33984 + var4++);
                        OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                    } else if (class11.field154 != var18) {
                        if (class11.field155 == var18) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                        } else if (class11.field156 == var18) {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glClientActiveTexture(var4++ + 33984);
                        OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                    }
                } else {
                    OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                    var5 = true;
                }
                var13 += var18.field145;
            }
        }
        if (this.field5161 != var7) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field5161 = var7;
        }
        if (this.field5163 == !var6) {
            if (var6) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field5163 = var6;
        }
        if (!var5 != !this.field5159) {
            if (!var5) {
                OpenGL.glDisableClientState(32886);
            } else {
                OpenGL.glEnableClientState(32886);
            }
            this.field5159 = var5;
        }
        if (~this.field5160 <= ~var4) {
            if (this.field5160 > var4) {
                for (int var9 = var4; this.field5160 > var9; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field5160 = var4;
                return;
            }
        } else {
            for (int var10 = this.field5160; ~var4 < ~var10; ++var10) {
                OpenGL.glClientActiveTexture(33984 - -var10);
                OpenGL.glEnableClientState(32888);
            }
            this.field5160 = var4;
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(IIIID)V", line = 1641)
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field5110;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IZ)Luq;", line = 1648)
    public final class163 method2290(int arg0, boolean arg1) {
        ++field5077;
        return arg0 != -28633 ? null : new class492(this, class523.field7250, arg1);
    }

    @OriginalMember(owner = "client!bga", name = "I", descriptor = "()I", line = 1659)
    public final int method315() {
        ++field5096;
        return this.field5176;
    }

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "(Z)V", line = 1670)
    public final void method2291(boolean arg0) {
        if (arg0) {
            this.field5170 = false;
        }
        OpenGL.glActiveTexture(super.field10289 + 33984);
        ++field5089;
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "(I)V", line = 1684)
    public final void method2292(int arg0) {
        if (arg0 != 12) {
            this.field5175 = 75;
        }
        ++field5093;
        this.field5165 = false;
        this.method2271(1);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(FFF)V", line = 1696)
    public final void method244(float arg0, float arg1, float arg2) {
        ++field5146;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V", line = 1705)
    public final void method2293(Canvas arg0, int arg1, Object arg2) {
        ++field5073;
        Long var4 = (Long) arg2;
        if (arg1 != 1) {
            this.field5169 = -120;
        }
        this.field5107.releaseSurface(arg0, var4);
    }

    @OriginalMember(owner = "client!bga", name = "P", descriptor = "(I)V", line = 1718)
    public final void method2294(int arg0) {
        class274.field3856[1] = (float) class263.method1762(65280, super.field10233) / 65280.0F;
        class274.field3856[2] = (float) class263.method1762(255, super.field10233) / 255.0F;
        class274.field3856[3] = (float) (super.field10233 >>> 24) / 255.0F;
        ++field5140;
        class274.field3856[0] = (float) class263.method1762(16711680, super.field10233) / 1.671168E7F;
        if (arg0 >= -107) {
            this.field5160 = -64;
        }
        OpenGL.glTexEnvfv(8960, 8705, class274.field3856, 0);
    }

    @OriginalMember(owner = "client!bga", name = "x", descriptor = "(I)V", line = 1734)
    public final void method2295(int arg0) {
        ++field5116;
        OpenGL.glLightfv(16384, 4611, super.field10284, arg0);
        OpenGL.glLightfv(16385, 4611, super.field10216, 0);
    }

    @OriginalMember(owner = "client!bga", name = "GA", descriptor = "(I)V", line = 1744)
    public final void method220(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field5086;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "()V", line = 1755)
    public final void method213() {
        ++field5102;
    }

    @OriginalMember(owner = "client!bga", name = "E", descriptor = "(B)V", line = 1764)
    public final void method2296(byte arg0) {
        if (super.field10255) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
        if (arg0 == 100) {
            ++field5109;
        }
    }

    @OriginalMember(owner = "client!bga", name = "A", descriptor = "()V", line = 1781)
    public final void method257() {
        ++field5123;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBILbaa;Lwq;)Lwfa;", line = 1788)
    public final class200 method2297(int arg0, byte arg1, int arg2, class523 arg3, class169 arg4) {
        if (arg1 != -84) {
            this.method2270(false);
        }
        ++field5133;
        if (!this.field5177 && (!class476.method2796(arg1 + 15, arg2) || !class476.method2796(65, arg0))) {
            return !this.field5170 ? new class114(this, arg4, arg3, class529.method3059(arg2, (byte) 108), class529.method3059(arg0, (byte) 108)) : new class204(this, arg4, arg3, arg2, arg0);
        } else {
            return new class114(this, arg4, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "()V", line = 1816)
    public final void method337() {
        ++field5114;
    }

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "(I)V", line = 1823)
    public final void method2298(int arg0) {
        if (arg0 != 6259) {
            this.field5158 = null;
        }
        ++field5068;
        OpenGL.glScissor(super.field10295 - -super.field10220, super.field10223 - -super.field10076 + -super.field10210, -super.field10220 + super.field10297, super.field10210 - super.field10279);
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(Z)V", line = 1836)
    public final void method325(boolean arg0) {
        ++field5064;
    }

    @OriginalMember(owner = "client!bga", name = "S", descriptor = "(I)V", line = 1843)
    public final void method2299(int arg0) {
        ++field5137;
        if (class235.field3412 == super.field10277) {
            OpenGL.glBlendFunc(770, 771);
        } else if (class239.field3494 == super.field10277) {
            OpenGL.glBlendFunc(1, 1);
        } else if (class418.field6055 == super.field10277) {
            OpenGL.glBlendFunc(774, 1);
        }
        if (arg0 != 0) {
            this.field5169 = 74;
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(ZI)Ltc;", line = 1870)
    public final class353 method2300(boolean arg0, int arg1) {
        ++field5066;
        return arg1 != 16711680 ? null : new class115(this, arg0);
    }

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "(Z)F", line = 1882)
    public final float method2301(boolean arg0) {
        ++field5128;
        if (arg0) {
            this.method2252(45);
        }
        return 0.0F;
    }

    @OriginalMember(owner = "client!bga", name = "na", descriptor = "(IIII)[I", line = 1894)
    public final int[] method359(int arg0, int arg1, int arg2, int arg3) {
        ++field5071;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + -1 + super.field10076, arg2, 1, 32993, this.field5169, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lis;)V", line = 1915)
    public final void method302(class503 arg0) {
        ++field5067;
    }
}
