import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class17 extends class391 implements class219 {

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lbm;")
    private class324 field204 = new class324();

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lmk;")
    private class156 field208 = new class25();

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public int field213 = 8;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "[Lhf;")
    private class219[] field216 = new class219[4];

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    private int field218 = -1;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public int field223 = 3;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Lfi;")
    private class166 field212 = new class166();

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lfi;")
    private class166 field224 = new class166();

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Lfi;")
    private class166 field225 = new class166();

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Lfi;")
    private class166 field226 = new class166();

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Lfi;")
    private class166 field227 = new class166();

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Lfi;")
    private class166 field228 = new class166();

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "Lfi;")
    private class166 field229 = new class166();

    @OriginalMember(owner = "client!hd", name = "Cb", descriptor = "[F")
    private float[] field262 = new float[16];

    @OriginalMember(owner = "client!hd", name = "ac", descriptor = "F")
    public float field286 = -1.0F;

    @OriginalMember(owner = "client!hd", name = "Ab", descriptor = "F")
    private float field260 = 0.0F;

    @OriginalMember(owner = "client!hd", name = "Vb", descriptor = "F")
    public float field281 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
    private int field263 = 0;

    @OriginalMember(owner = "client!hd", name = "fc", descriptor = "I")
    public int field291 = -1;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "F")
    public float field230 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    private int field233 = 0;

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
    private int field252 = -1;

    @OriginalMember(owner = "client!hd", name = "qc", descriptor = "F")
    public float field302 = -1.0F;

    @OriginalMember(owner = "client!hd", name = "Eb", descriptor = "I")
    public int field264 = -1;

    @OriginalMember(owner = "client!hd", name = "Gb", descriptor = "I")
    public int field266 = 0;

    @OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
    private int field250 = 8448;

    @OriginalMember(owner = "client!hd", name = "rc", descriptor = "I")
    public int field303 = 512;

    @OriginalMember(owner = "client!hd", name = "Sb", descriptor = "I")
    public int field278 = 0;

    @OriginalMember(owner = "client!hd", name = "mc", descriptor = "I")
    private int field298 = -1;

    @OriginalMember(owner = "client!hd", name = "Jc", descriptor = "F")
    private float field321 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "Ec", descriptor = "F")
    public float field316 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "Hc", descriptor = "I")
    private int field319 = 0;

    @OriginalMember(owner = "client!hd", name = "Oc", descriptor = "[F")
    private float[] field326 = new float[4];

    @OriginalMember(owner = "client!hd", name = "uc", descriptor = "Z")
    private boolean field306 = true;

    @OriginalMember(owner = "client!hd", name = "Qc", descriptor = "I")
    private int field328 = 0;

    @OriginalMember(owner = "client!hd", name = "Tb", descriptor = "I")
    public int field279 = 50;

    @OriginalMember(owner = "client!hd", name = "Fc", descriptor = "I")
    private int field317 = 0;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "[F")
    private float[] field239 = new float[4];

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
    private int field254 = 8448;

    @OriginalMember(owner = "client!hd", name = "wc", descriptor = "I")
    public int field308 = 3584;

    @OriginalMember(owner = "client!hd", name = "zb", descriptor = "I")
    public int field259 = 512;

    @OriginalMember(owner = "client!hd", name = "Pc", descriptor = "F")
    private float field327 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "Sc", descriptor = "F")
    public float field330 = 3584.0F;

    @OriginalMember(owner = "client!hd", name = "Zc", descriptor = "I")
    private int field337 = 0;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "[F")
    public float[] field242 = new float[4];

    @OriginalMember(owner = "client!hd", name = "Yb", descriptor = "F")
    public float field284 = 3584.0F;

    @OriginalMember(owner = "client!hd", name = "Xc", descriptor = "[F")
    private float[] field335 = new float[4];

    @OriginalMember(owner = "client!hd", name = "pc", descriptor = "I")
    private int field301 = 0;

    @OriginalMember(owner = "client!hd", name = "Tc", descriptor = "I")
    public int field331 = -1;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Ljava/awt/Canvas;")
    private Canvas field196;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lpg;")
    public class112 field201;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Ljaggl/context;")
    private context field205;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Ljaggl/opengl;")
    public opengl field198;

    @OriginalMember(owner = "client!hd", name = "gc", descriptor = "Z")
    public boolean field292;

    @OriginalMember(owner = "client!hd", name = "cd", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!hd", name = "pb", descriptor = "Ljava/lang/String;")
    private String field249;

    @OriginalMember(owner = "client!hd", name = "yc", descriptor = "Ljava/lang/String;")
    private String field310;

    @OriginalMember(owner = "client!hd", name = "Yc", descriptor = "Z")
    private boolean field336;

    @OriginalMember(owner = "client!hd", name = "Xb", descriptor = "Z")
    public boolean field283;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "Z")
    public boolean field238;

    @OriginalMember(owner = "client!hd", name = "cc", descriptor = "Z")
    private boolean field288;

    @OriginalMember(owner = "client!hd", name = "jc", descriptor = "Z")
    public boolean field295;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Lwr;")
    public class369 field217;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lnk;")
    public class208 field197;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Leq;")
    private class141 field199;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lwk;")
    private class429 field203;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Lcg;")
    private class270 field206;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[I")
    private static int[] field202 = new int[1000];

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[F")
    private static float[] field200 = new float[4];

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[F")
    private static float[] field207 = new float[4];

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field209 = Boolean.FALSE;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "F")
    public float field231;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "F")
    public float field244;

    @OriginalMember(owner = "client!hd", name = "yb", descriptor = "F")
    public float field258;

    @OriginalMember(owner = "client!hd", name = "Kb", descriptor = "F")
    private float field270;

    @OriginalMember(owner = "client!hd", name = "Lb", descriptor = "F")
    public float field271;

    @OriginalMember(owner = "client!hd", name = "Nb", descriptor = "F")
    public float field273;

    @OriginalMember(owner = "client!hd", name = "nc", descriptor = "F")
    public float field299;

    @OriginalMember(owner = "client!hd", name = "oc", descriptor = "F")
    private float field300;

    @OriginalMember(owner = "client!hd", name = "tc", descriptor = "F")
    public float field305;

    @OriginalMember(owner = "client!hd", name = "Ic", descriptor = "F")
    public float field320;

    @OriginalMember(owner = "client!hd", name = "Wc", descriptor = "F")
    private float field334;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!hd", name = "Pb", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!hd", name = "Qb", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!hd", name = "ec", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!hd", name = "zc", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!hd", name = "Gc", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!hd", name = "Kc", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!hd", name = "Uc", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!hd", name = "dd", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!hd", name = "ed", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!hd", name = "ad", descriptor = "J")
    private long field338;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "Lmj;")
    private class171 field237;

    @OriginalMember(owner = "client!hd", name = "hc", descriptor = "Lhk;")
    private class203 field293;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Lhf;")
    private class219 field221;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Loe;")
    public class231 field236;

    @OriginalMember(owner = "client!hd", name = "Wb", descriptor = "Loe;")
    public class231 field282;

    @OriginalMember(owner = "client!hd", name = "Vc", descriptor = "Loe;")
    public class231 field333;

    @OriginalMember(owner = "client!hd", name = "Ub", descriptor = "Lrs;")
    private class240 field280;

    @OriginalMember(owner = "client!hd", name = "Ac", descriptor = "Lrs;")
    private class240 field312;

    @OriginalMember(owner = "client!hd", name = "Lc", descriptor = "Lrs;")
    private class240 field323;

    @OriginalMember(owner = "client!hd", name = "wb", descriptor = "Ln;")
    public class25 field256;

    @OriginalMember(owner = "client!hd", name = "xb", descriptor = "Ln;")
    public class25 field257;

    @OriginalMember(owner = "client!hd", name = "Nc", descriptor = "Lmc;")
    private class317 field325;

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lgm;")
    public class337 field253;

    @OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lfs;")
    public class350 field248;

    @OriginalMember(owner = "client!hd", name = "Ib", descriptor = "Lfs;")
    public class350 field268;

    @OriginalMember(owner = "client!hd", name = "Ob", descriptor = "Lfs;")
    public class350 field274;

    @OriginalMember(owner = "client!hd", name = "dc", descriptor = "Lfs;")
    public class350 field289;

    @OriginalMember(owner = "client!hd", name = "Bc", descriptor = "Lfs;")
    public class350 field313;

    @OriginalMember(owner = "client!hd", name = "bd", descriptor = "Lfs;")
    public class350 field339;

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "Lui;")
    private class366 field245;

    @OriginalMember(owner = "client!hd", name = "Rb", descriptor = "Lui;")
    public class366 field277;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Z")
    private boolean field234;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
    private boolean field235;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "Z")
    private boolean field241;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "Z")
    private boolean field243;

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "Z")
    private boolean field246;

    @OriginalMember(owner = "client!hd", name = "rb", descriptor = "Z")
    public boolean field251;

    @OriginalMember(owner = "client!hd", name = "vb", descriptor = "Z")
    private boolean field255;

    @OriginalMember(owner = "client!hd", name = "Zb", descriptor = "Z")
    private boolean field285;

    @OriginalMember(owner = "client!hd", name = "bc", descriptor = "Z")
    public boolean field287;

    @OriginalMember(owner = "client!hd", name = "ic", descriptor = "Z")
    private boolean field294;

    @OriginalMember(owner = "client!hd", name = "kc", descriptor = "Z")
    public boolean field296;

    @OriginalMember(owner = "client!hd", name = "lc", descriptor = "Z")
    public boolean field297;

    @OriginalMember(owner = "client!hd", name = "sc", descriptor = "Z")
    public boolean field304;

    @OriginalMember(owner = "client!hd", name = "vc", descriptor = "Z")
    private boolean field307;

    @OriginalMember(owner = "client!hd", name = "xc", descriptor = "Z")
    public boolean field309;

    @OriginalMember(owner = "client!hd", name = "Cc", descriptor = "Z")
    private boolean field314;

    @OriginalMember(owner = "client!hd", name = "Dc", descriptor = "Z")
    private boolean field315;

    @OriginalMember(owner = "client!hd", name = "Mc", descriptor = "Z")
    private boolean field324;

    @OriginalMember(owner = "client!hd", name = "Rc", descriptor = "Z")
    public boolean field329;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "[Lrs;")
    private class240[] field240;

    @OriginalMember(owner = "client!hd", name = "Hb", descriptor = "[Lvd;")
    private class4[] field267;

    @OriginalMember(owner = "client!hd", name = "Jb", descriptor = "[Z")
    private boolean[] field269;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lvm;[Ldr;Z)Lhq;")
    public final class175 method89(class323 arg0, class214[] arg1, boolean arg2) {
        return new class299(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([I)V")
    public final void method90(int[] arg0) {
        arg0[0] = this.field328;
        arg0[1] = this.field337;
        arg0[2] = this.field233;
        arg0[3] = this.field319;
    }

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "()Z")
    public final boolean method91() {
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public final void method92(int arg0) {
        this.method240();
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)V")
    public final void method93(int arg0, int arg1, int arg2) {
        this.field198.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field198.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
    public final void method94() {
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method201();
        this.method121(arg5);
        this.field198.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field324) {
            this.field198.glDisable(32925);
        }
        this.field198.glBegin(7);
        this.field198.glVertex2f(var7, var8);
        this.field198.glVertex2f(var7, var10);
        this.field198.glVertex2f(var9, var10);
        this.field198.glVertex2f(var9, var8);
        this.field198.glEnd();
        if (this.field324) {
            this.field198.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "()Lm;")
    public final class181 method96() {
        return this.field237 == null ? null : this.field237.method1280(true);
    }

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)V")
    public final synchronized void method97(int arg0) {
        class193 var2 = new class193(arg0);
        this.field226.method1249(var2, (byte) -126);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public final void method98(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "()Z")
    public final boolean method99() {
        return class304.field4113 == null || !class304.field4113.startsWith("mac");
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(II)V")
    public final void method100(int arg0, int arg1) {
        if (this.field264 == arg0 && this.field291 == arg1) {
            return;
        }
        this.field264 = arg0;
        this.field291 = arg1;
        if (!this.field296) {
            this.method241();
            this.method238();
        }
    }

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "()V")
    public final void method101() {
        if (this.field206.method2172(119)) {
            this.field203.method2674(this.field206);
            this.field197.method1436(-127);
        }
    }

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "()V")
    private final void method102() {
        if (this.field318 == 1) {
            return;
        }
        this.field198.glMatrixMode(5889);
        this.field198.glLoadIdentity();
        this.field198.glOrtho(0.0D, (double) this.field214, (double) this.field215, 0.0D, -1.0D, 1.0D);
        this.field198.glMatrixMode(5888);
        this.field198.glLoadIdentity();
        this.field318 = 1;
        this.field311 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method103(Rectangle[] arg0, int arg1) {
        this.method246();
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public final void method104(int arg0) {
        this.method121(0);
        this.field198.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field198.glClear(16384);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class411 method105(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class302(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "()Z")
    public final boolean method106() {
        return this.field206.method1731();
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)V")
    public final void method107(int arg0, int arg1, int arg2) {
        this.field198.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FF)V")
    public final void method108(float arg0, float arg1) {
        if (this.field273 == arg0 && this.field299 == arg1) {
            return;
        }
        this.field273 = arg0;
        this.field299 = arg1;
        this.method222();
        this.method209();
        if (this.field318 == 3) {
            this.method215();
        } else if (this.field318 == 2) {
            this.method109();
        }
    }

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "()V")
    private final void method109() {
        this.field198.glMatrixMode(5889);
        this.field198.glLoadMatrixf(this.field262, 0);
        this.field198.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "()V")
    public final void method110() {
        this.method158(true);
        this.field198.glClear(256);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIII)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field214) {
            arg2 = this.field214;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field215) {
            arg3 = this.field215;
        }
        this.field328 = arg0;
        this.field337 = arg1;
        this.field233 = arg2;
        this.field319 = arg3;
        this.field198.glEnable(3089);
        this.method130();
        this.method143();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lui;III)V")
    public final void method112(class366 arg0, int arg1, int arg2, int arg3) {
        this.method205(arg0);
        arg0.method352(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "(I)I")
    public final int method113(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "()F")
    public final float method114() {
        return this.field273;
    }

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "()Z")
    public final boolean method115() {
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "()I")
    public final int method116() {
        return this.field279;
    }

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "()V")
    public final void method117() {
        this.field198.glLightfv(16384, 4611, this.field326, 0);
        this.field198.glLightfv(16385, 4611, this.field335, 0);
    }

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "()V")
    private final void method118() {
        this.field257 = new class25();
        this.field256 = new class25();
        this.field267 = new class4[this.field261];
        this.field269 = new boolean[this.field272];
        this.field240 = new class240[this.field272];
        this.field333 = new class231(this, 3553, 6408, 1, 1);
        this.field236 = new class231(this, 3553, 6408, 1, 1);
        this.field282 = new class231(this, 3553, 6408, 1, 1);
        this.field268 = new class350(this);
        this.field339 = new class350(this);
        this.field274 = new class350(this);
        this.field248 = new class350(this);
        this.field289 = new class350(this);
        this.field313 = new class350(this);
        this.field277 = this.method128(5123, (byte[]) null, 1024, true);
        if (this.field295) {
            this.field253 = new class337(this);
        }
        this.field204.method2062(this);
    }

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "()V")
    public final void method119() {
        if (this.field311 == 4) {
            return;
        }
        this.method102();
        this.method184(false);
        this.method127(false);
        this.method138(false);
        this.method158(false);
        this.method190(-2);
        this.method121(1);
        this.method159(1);
        this.field311 = 4;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
    }

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "(I)V")
    public final void method121(int arg0) {
        if (this.field247 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field294 != var3) {
            this.field198.glColorMask(var3, var3, var3, true);
            this.field294 = var3;
        }
        if (this.field285 != var4) {
            if (var4) {
                this.field198.glEnable(3008);
            } else {
                this.field198.glDisable(3008);
            }
            this.field285 = var4;
        }
        if (this.field265 != var2) {
            if (var2 == 1) {
                this.field198.glEnable(3042);
                this.field198.glBlendEquation(32774);
                this.field198.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field198.glEnable(3042);
                this.field198.glBlendEquation(32774);
                this.field198.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field198.glEnable(3042);
                this.field198.glBlendEquation(32778);
                this.field198.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field198.glEnable(3042);
                this.field198.glBlendEquation(32774);
                this.field198.glBlendFunc(774, 1);
            } else {
                this.field198.glDisable(3042);
            }
            this.field265 = var2;
        }
        this.field247 = arg0;
        this.field311 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "()V")
    public final void method122() {
        this.field328 = 0;
        this.field337 = 0;
        this.field233 = this.field214;
        this.field319 = this.field215;
        this.field198.glDisable(3089);
        this.method130();
    }

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "()V")
    public final void method123() {
        if (this.field311 == 16) {
            return;
        }
        this.method253();
        this.method184(true);
        this.method138(true);
        this.method158(true);
        this.method121(1);
        this.method159(1);
        this.field311 = 16;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
    public final void method124(int arg0, int arg1) {
        if (this.field279 == arg0 && this.field308 == arg1) {
            return;
        }
        this.field279 = arg0;
        this.field308 = arg1;
        this.method216();
        this.method209();
        this.method241();
    }

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "()V")
    private final void method125() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field205.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class229.method1541(99, 1000L);
        }
    }

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "(I)I")
    public final int method126(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)V")
    public final void method127(boolean arg0) {
        if (this.field314 != arg0) {
            this.field314 = arg0;
            this.method156();
            this.field311 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BIZ)Lui;")
    public final class366 method128(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class366) (this.field336 && !arg3 || this.field288 ? new class261(this, arg0, arg1, arg2, arg3) : new class33(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    public final void method129(int arg0, int arg1, int arg2) {
        if (!this.field296) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field298 = arg1;
        this.field331 = arg2;
        this.method241();
        this.field199.method1104(arg0, true, (byte) -127);
    }

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "()V")
    private final void method130() {
        this.field231 = (float) (this.field328 - this.field266);
        this.field258 = (float) (this.field233 - this.field266);
        this.field305 = (float) (this.field337 - this.field278);
        this.field244 = (float) (this.field319 - this.field278);
    }

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "()V")
    private final void method131() {
        this.field198.glLoadIdentity();
        this.field198.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field198.glMultMatrixf(this.field257.method314((byte) 126), 0);
        this.method117();
    }

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "(I)V")
    public final synchronized void method132(int arg0) {
        class193 var2 = new class193(arg0);
        this.field229.method1249(var2, (byte) -127);
    }

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "()Z")
    public final boolean method133() {
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "()V")
    private final void method134() {
        field200[0] = this.field302 * this.field281;
        field200[1] = this.field316 * this.field302;
        field200[2] = this.field302 * this.field230;
        field200[3] = 1.0F;
        this.field198.glLightfv(16384, 4609, field200, 0);
        field200[0] = -this.field286 * this.field281;
        field200[1] = -this.field286 * this.field316;
        field200[2] = -this.field286 * this.field230;
        field200[3] = 1.0F;
        this.field198.glLightfv(16385, 4609, field200, 0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public final void method135() {
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(II)V")
    public final synchronized void method136(int arg0, int arg1) {
        class193 var3 = new class193(arg1);
        var3.field5349 = (long) arg0;
        this.field226.method1249(var3, (byte) -118);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        this.field296 = true;
        this.field298 = arg1;
        this.field331 = arg2;
        this.method241();
        this.method238();
        this.field199.method1105(false, false, 3, -110);
        this.field199.method1104(arg0, true, (byte) -116);
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(Z)V")
    public final void method138(boolean arg0) {
        if (this.field255 == arg0) {
            return;
        }
        if (arg0) {
            this.field198.glEnable(2929);
        } else {
            this.field198.glDisable(2929);
        }
        this.field255 = arg0;
        this.field311 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(II)V")
    public final synchronized void method139(int arg0, int arg1) {
        class193 var3 = new class193(arg1);
        var3.field5349 = (long) arg0;
        this.field224.method1249(var3, (byte) -118);
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(II)V")
    public final void method140(int arg0, int arg1) {
        this.field317 = arg0;
        this.field263 = arg1;
        this.field198.glViewport(arg0, arg1, this.field214, this.field215);
        this.method143();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[Lj;)V")
    public final void method141(int arg0, class269[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class269 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field207[0] = (float) var4.field3618;
            field207[1] = (float) var4.field3622;
            field207[2] = (float) var4.field3620;
            field207[3] = 1.0F;
            this.field198.glLightfv(var5, 4611, field207, 0);
            int var6 = var4.field3624;
            float var7 = var4.field3623 / 255.0F;
            field207[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field207[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field207[2] = (float) (var6 & 0xFF) * var7;
            this.field198.glLightfv(var5, 4609, field207, 0);
            this.field198.glLightf(var5, 4617, 1.0F / (float) (var4.field3625 * var4.field3625));
            this.field198.glEnable(var5);
        }
        while (var3 < this.field301) {
            this.field198.glDisable(var3 + 16386);
            var3++;
        }
        this.field301 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        this.field266 = arg0;
        this.field278 = arg1;
        this.field259 = arg2;
        this.field303 = arg3;
        float var5 = (float) (-this.field266 * this.field279) / (float) this.field259;
        float var6 = (float) (-this.field278 * this.field279) / (float) this.field303;
        float var7 = (float) ((this.field214 - this.field266) * this.field279) / (float) this.field259;
        float var8 = (float) ((this.field215 - this.field278) * this.field279) / (float) this.field303;
        this.method233(var5, var7, -var8, -var6, (float) this.field279, (float) this.field308);
        if (this.field318 != 1) {
            this.method216();
        }
        this.method209();
        this.method130();
    }

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "()V")
    private final void method143() {
        if (this.field328 <= this.field233 && this.field337 <= this.field319) {
            this.field198.glScissor(this.field328 + this.field317, this.field263 + this.field215 - this.field319, this.field233 - this.field328, this.field319 - this.field337);
        } else {
            this.field198.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "()V")
    private final void method144() {
        if (this.field235) {
            this.field198.glMatrixMode(5890);
            this.field198.glLoadIdentity();
            this.field198.glMatrixMode(5888);
            this.field235 = false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(II)V")
    public final void method145(int arg0, int arg1) {
        if (this.field232 != 0) {
            this.field198.glTexEnvi(8960, 34161, arg0);
            this.field198.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field254 != arg0) {
            this.field198.glTexEnvi(8960, 34161, arg0);
            this.field254 = arg0;
            var3 = true;
        }
        if (this.field250 != arg1) {
            this.field198.glTexEnvi(8960, 34162, arg1);
            this.field250 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field311 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "()Z")
    public final boolean method146() {
        return this.field324;
    }

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "()I")
    public final int method147() {
        return this.field308;
    }

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "()V")
    public final void method148() {
        this.field199.method1105(false, false, 0, -97);
        this.field296 = false;
        this.method241();
        this.method238();
    }

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "()V")
    public final void method149() {
        if (this.field311 == 8) {
            return;
        }
        this.method243();
        this.method184(true);
        this.method138(true);
        this.method158(true);
        this.method121(1);
        this.method159(1);
        this.field311 = 8;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lrs;)V")
    public final void method150(class240 arg0) {
        class203 var2 = arg0.field3322;
        this.method157(var2);
        var2.method824(arg0);
        this.field323 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IFFFFF)V")
    public final void method151(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field252 != arg0;
        if (var7 || this.field302 != arg1 || this.field286 != arg2) {
            this.field252 = arg0;
            this.field302 = arg1;
            this.field286 = arg2;
            if (var7) {
                this.field281 = (float) (this.field252 & 0xFF0000) / 1.671168E7F;
                this.field316 = (float) (this.field252 & 0xFFFF) / 65535.0F;
                this.field230 = (float) (this.field252 & 0xFF) / 255.0F;
                this.method195();
            }
            this.method134();
        }
        if (this.field326[0] == arg3 && this.field326[1] == arg4 && this.field326[2] == arg5) {
            return;
        }
        this.field326[0] = arg3;
        this.field326[1] = arg4;
        this.field326[2] = arg5;
        this.field335[0] = -arg3;
        this.field335[1] = -arg4;
        this.field335[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field242[0] = arg3 * var8;
        this.field242[1] = arg4 * var8;
        this.field242[2] = arg5 * var8;
        this.field239[0] = -this.field242[0];
        this.field239[1] = -this.field242[1];
        this.field239[2] = -this.field242[2];
        this.method117();
        this.field276 = (int) (arg3 * 256.0F / arg4);
        this.field322 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
        this.field306 = arg0;
        this.method252();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field325 == null || this.field325.field3193 < arg2 || this.field325.field3192 < arg3) {
            this.field325 = class317.method2018(this, 6406, arg3, true, false, arg2, arg6, 6406);
            this.field325.method1543(false, false);
            var10 = this.field325.field4298;
            var11 = this.field325.field4302;
        } else {
            this.field325.method1544(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field325.field4298 / (float) this.field325.field3192;
            var11 = (float) arg2 * this.field325.field4302 / (float) this.field325.field3193;
        }
        this.method198();
        this.method207(this.field325);
        this.method121(arg8);
        this.field198.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method169(arg5);
        this.method145(34165, 34165);
        this.method93(0, 34166, 768);
        this.method93(2, 5890, 770);
        this.method223(0, 34166, 770);
        this.method223(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field198.glBegin(7);
        this.field198.glTexCoord2f(0.0F, 0.0F);
        this.field198.glVertex2f(var12, var13);
        this.field198.glTexCoord2f(0.0F, var11);
        this.field198.glVertex2f(var12, var15);
        this.field198.glTexCoord2f(var10, var11);
        this.field198.glVertex2f(var14, var15);
        this.field198.glTexCoord2f(var10, 0.0F);
        this.field198.glVertex2f(var14, var13);
        this.field198.glEnd();
        this.method93(0, 5890, 768);
        this.method93(2, 34166, 770);
        this.method223(0, 5890, 770);
        this.method223(2, 34166, 770);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILvj;II)V")
    public final void method154(int arg0, class179 arg1, int arg2, int arg3) {
        class50 var5 = (class50) arg1;
        class317 var6 = var5.field836;
        this.method198();
        this.method207(var5.field836);
        this.method121(1);
        this.method145(7681, 8448);
        this.method93(0, 34167, 768);
        float var7 = var6.field4302 / (float) var6.field4300;
        float var8 = var6.field4298 / (float) var6.field4299;
        this.field198.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field198.glBegin(7);
        this.field198.glTexCoord2f((float) (this.field328 - arg2) * var7, (float) (this.field337 - arg3) * var8);
        this.field198.glVertex2i(this.field328, this.field337);
        this.field198.glTexCoord2f((float) (this.field328 - arg2) * var7, (float) (this.field319 - arg3) * var8);
        this.field198.glVertex2i(this.field328, this.field319);
        this.field198.glTexCoord2f((float) (this.field233 - arg2) * var7, (float) (this.field319 - arg3) * var8);
        this.field198.glVertex2i(this.field233, this.field319);
        this.field198.glTexCoord2f((float) (this.field233 - arg2) * var7, (float) (this.field337 - arg3) * var8);
        this.field198.glVertex2i(this.field233, this.field337);
        this.field198.glEnd();
        this.method93(0, 5890, 768);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIII)Lk;")
    public final class293 method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field297 ? new class178(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "()V")
    private final void method156() {
        if (this.field314 && !this.field307) {
            this.field198.glEnable(2896);
        } else {
            this.field198.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhk;)V")
    public final void method157(class203 arg0) {
        if (this.field293 != arg0 && this.field336) {
            this.field198.glBindBufferARB(34962, arg0.method353());
            this.field293 = arg0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        if (this.field315 != arg0) {
            this.field315 = arg0;
            this.method252();
            this.field311 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "(I)V")
    public final void method159(int arg0) {
        if (arg0 == 0) {
            this.method145(7681, 7681);
        } else if (arg0 == 1) {
            this.method145(8448, 8448);
        } else if (arg0 == 2) {
            this.method145(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILrs;)V")
    public final void method160(int arg0, class240 arg1) {
        class203 var3 = arg1.field3322;
        this.method157(var3);
        var3.method823(arg0, arg1);
        this.field240[arg0] = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lrs;)V")
    public final void method161(class240 arg0) {
        class203 var2 = arg0.field3322;
        this.method157(var2);
        var2.method822(arg0);
        this.field312 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "()V")
    public final void method162() {
        this.field198.glPopMatrix();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)I")
    public final int method163(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFFF)V")
    public final void method164(float arg0, float arg1, float arg2, float arg3) {
        field200[0] = arg0;
        field200[1] = arg1;
        field200[2] = arg2;
        field200[3] = arg3;
        this.field198.glTexEnvfv(8960, 8705, field200, 0);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I[BIZ)Lhk;")
    public final class203 method165(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class203) (this.field336 && !arg3 || this.field288 ? new class98(this, arg0, arg1, arg2, arg3) : new class271(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsj;Lbg;Lmk;Lmo;I)V")
    public final void method166(class73 arg0, class374 arg1, class156 arg2, class197 arg3, int arg4) {
        arg0.method478(arg2, arg3, arg4);
        this.method182(arg1);
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(IIIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method201();
        this.method121(arg5);
        this.field198.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field324) {
            this.field198.glDisable(32925);
        }
        this.field198.glBegin(2);
        this.field198.glVertex2f(var7, var8);
        this.field198.glVertex2f(var7, var10);
        this.field198.glVertex2f(var9, var10);
        this.field198.glVertex2f(var9, var8);
        this.field198.glEnd();
        if (this.field324) {
            this.field198.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "()Z")
    public final boolean method168() {
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "(I)V")
    public final void method169(int arg0) {
        field200[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field200[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field200[2] = (float) (arg0 & 0xFF) / 255.0F;
        field200[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field198.glTexEnvfv(8960, 8705, field200, 0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lk;)V")
    public final void method170(class293 arg0) {
        this.field237 = (class171) arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[I)V")
    public final void method171(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field257.field459 + (float) arg0 * this.field257.field457 + (float) arg1 * this.field257.field456 + this.field257.field453;
        if ((var5 < (float) this.field279) || (var5 > (float) this.field308)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field257.field450 + (float) arg0 * this.field257.field458 + (float) arg1 * this.field257.field449 + this.field257.field451) * (float) this.field259 / var5);
        int var7 = (int) (((float) arg2 * this.field257.field448 + (float) arg0 * this.field257.field452 + (float) arg1 * this.field257.field447 + this.field257.field455) * (float) this.field303 / var5);
        if ((float) var6 >= this.field231 && (float) var6 <= this.field258 && (float) var7 >= this.field305 && (float) var7 <= this.field244) {
            arg3[0] = (int) ((float) var6 - this.field231);
            arg3[1] = (int) ((float) var7 - this.field305);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "()Z")
    public final boolean method172() {
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "()Z")
    public final boolean method173() {
        if (!this.field206.method2172(103)) {
            if (!this.field203.method2669(this.field206)) {
                return false;
            }
            this.field197.method1436(-32);
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "()V")
    public final void method174() {
        this.field214 = this.field196.getWidth();
        this.field215 = this.field196.getHeight();
        this.field198.glViewport(this.field317, this.field263, this.field214, this.field215);
        this.method216();
        this.method122();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    public final void method175(int arg0, boolean arg1) {
        this.method247(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "(I)V")
    public final void method176(int arg0) {
        if (this.field232 != arg0) {
            this.field198.glActiveTexture(arg0 + 33984);
            this.field232 = arg0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "()V")
    public final void method177() {
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIZ)Lkb;")
    public final class80 method178(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class85(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "(II)V")
    public final synchronized void method179(int arg0, int arg1) {
        class193 var3 = new class193(arg1);
        var3.field5349 = (long) arg0;
        this.field225.method1249(var3, (byte) -113);
    }

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "()V")
    public final void method180() {
        boolean var1 = this.field312 != null;
        if (this.field241 != var1) {
            if (var1) {
                this.field198.glEnableClientState(32884);
            } else {
                this.field198.glDisableClientState(32884);
            }
            this.field241 = var1;
        }
        this.field312 = null;
        boolean var2 = this.field323 != null;
        if (this.field246 != var2) {
            if (var2) {
                this.field198.glEnableClientState(32885);
            } else {
                this.field198.glDisableClientState(32885);
            }
            this.field246 = var2;
        }
        this.field323 = null;
        boolean var3 = this.field280 != null;
        if (this.field243 != var3) {
            if (var3) {
                this.field198.glEnableClientState(32886);
            } else {
                this.field198.glDisableClientState(32886);
            }
            this.field243 = var3;
        }
        this.field280 = null;
        for (int var4 = 0; var4 < this.field272; var4++) {
            boolean var5 = this.field240[var4] != null;
            if (this.field269[var4] != var5) {
                this.field198.glClientActiveTexture(var4 + 33984);
                if (var5) {
                    this.field198.glEnableClientState(32888);
                } else {
                    this.field198.glDisableClientState(32888);
                }
                this.field269[var4] = var5;
            }
            this.field240[var4] = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "()V")
    public final void method181() {
        this.field203.method2668();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lbg;)V")
    public final void method182(class374 arg0) {
        this.field204.method2065(this, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
    public final int method183(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(Z)V")
    public final void method184(boolean arg0) {
        if (this.field234 != arg0) {
            this.field234 = arg0;
            this.method238();
            this.field311 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()I")
    public final int method185() {
        return this.field215;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(IIII)V")
    public final void method186(int arg0, int arg1, int arg2, int arg3) {
        this.field203.method2675(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lhk;")
    public final class203 method187(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class203) (this.field336 && !arg2 || this.field288 ? new class98(this, arg0, arg1, arg2) : new class271(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIII)Lkb;")
    public final class80 method188(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class85(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lmk;)V")
    public final void method189(class156 arg0) {
        this.field257 = (class25) arg0;
        this.field256.method317(this.field257, 16383);
        if (this.field318 != 1) {
            this.method131();
        }
    }

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "(I)V")
    public final void method190(int arg0) {
        this.method175(arg0, true);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)V")
    public final void method191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method201();
        this.method121(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field198.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field198.glBegin(1);
        this.field198.glVertex2f(var6, var7);
        this.field198.glVertex2f(var6, (float) arg2 + var7);
        this.field198.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "()I")
    private final int method193() {
        int var1 = 0;
        this.field249 = this.field198.glGetString(7936);
        this.field310 = this.field198.glGetString(7937);
        String var2 = this.field249.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field198.glGetString(7938);
        String[] var4 = class156.method1192(0, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class362.method2277(var4[0], -51);
                int var6 = class362.method2277(var4[1], -79);
                this.field275 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field275 < 12) {
            var1 |= 0x2;
        }
        if (!this.field198.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field198.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field198.glGetIntegerv(34018, var8, 0);
        this.field261 = var8[0];
        this.field198.glGetIntegerv(34929, var8, 0);
        this.field272 = var8[0];
        this.field198.glGetIntegerv(34930, var8, 0);
        this.field290 = var8[0];
        if (this.field261 < 2 || this.field272 < 2 || this.field290 < 2) {
            var1 |= 0x10;
        }
        this.field292 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field336 = this.field198.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field324 = this.field198.isExtensionAvailable("GL_ARB_multisample");
        this.field251 = this.field198.isExtensionAvailable("GL_ARB_vertex_program");
        this.field198.isExtensionAvailable("GL_ARB_fragment_program");
        this.field287 = this.field198.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field304 = this.field198.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field283 = this.field198.isExtensionAvailable("GL_EXT_texture3D");
        this.field309 = this.field198.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field297 = this.field198.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field238 = this.field198.isExtensionAvailable("GL_ARB_texture_float");
        this.field329 = false;
        this.field295 = this.field198.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method194(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "()V")
    private final void method195() {
        field200[0] = this.field320 * this.field281;
        field200[1] = this.field320 * this.field316;
        field200[2] = this.field320 * this.field230;
        field200[3] = 1.0F;
        this.field198.glLightModelfv(2899, field200, 0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field198.glLineWidth((float) arg5);
        this.method219(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field198.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)[I")
    public final int[] method197(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field198.glReadPixels(arg0, this.field215 - arg1 - var6, arg2, 1, 32993, this.field340, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "()V")
    public final void method198() {
        if (this.field311 == 2) {
            return;
        }
        this.method102();
        this.method184(false);
        this.method127(false);
        this.method138(false);
        this.method158(false);
        this.method190(-2);
        this.field311 = 2;
    }

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "()I")
    public final int method199() {
        return 4;
    }

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "()I")
    public final int method200() {
        return this.field220 + this.field211 + this.field219;
    }

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "()V")
    private final void method201() {
        if (this.field311 == 1) {
            return;
        }
        this.method102();
        this.method184(false);
        this.method127(false);
        this.method138(false);
        this.method158(false);
        this.method207((class4) null);
        this.method190(-2);
        this.method159(0);
        this.field311 = 1;
    }

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "()Z")
    public final boolean method202() {
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "()Z")
    public final boolean method203() {
        return this.field199.method1106(13109, 3);
    }

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "()V")
    private final void method204() {
        this.method190(-2);
        for (int var1 = this.field261 - 1; var1 >= 0; var1--) {
            this.method176(var1);
            this.method207((class4) null);
            this.field198.glTexEnvi(8960, 8704, 34160);
        }
        this.method145(8448, 8448);
        this.method93(2, 34168, 770);
        this.method144();
        this.field198.glEnable(3042);
        this.field198.glBlendFunc(770, 771);
        this.field265 = 1;
        this.field198.glEnable(3008);
        this.field198.glAlphaFunc(516, 0.0F);
        this.field285 = true;
        this.field198.glColorMask(true, true, true, true);
        this.field294 = true;
        this.method184(true);
        this.method127(true);
        this.method138(true);
        this.method158(true);
        this.method216();
        this.field198.setSwapInterval(0);
        this.field198.glShadeModel(7425);
        this.field198.glClearDepth(1.0F);
        this.field198.glDepthFunc(515);
        this.field198.glPolygonMode(1028, 6914);
        this.field198.glEnable(2884);
        this.field198.glCullFace(1029);
        this.field198.glMatrixMode(5888);
        this.field198.glLoadIdentity();
        this.field198.glColorMaterial(1028, 5634);
        this.field198.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field198.glLightfv(var4, 4608, var2, 0);
            this.field198.glLightf(var4, 4615, 0.0F);
            this.field198.glLightf(var4, 4616, 0.0F);
        }
        this.field198.glEnable(16384);
        this.field198.glEnable(16385);
        this.field198.glFogf(2914, 0.95F);
        this.field198.glFogi(2917, 9729);
        this.field198.glHint(3156, 4353);
        this.field252 = this.field264 = -1;
        this.method122();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lui;)V")
    public final void method205(class366 arg0) {
        if (this.field245 != arg0 && this.field336) {
            this.field198.glBindBufferARB(34963, arg0.method353());
            this.field245 = arg0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Li;")
    public final class83 method206(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lvd;)V")
    public final void method207(class4 arg0) {
        class4 var2 = this.field267[this.field232];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field198.glDisable(var2.field26);
            } else {
                if (var2 == null) {
                    this.field198.glEnable(arg0.field26);
                } else if (arg0.field26 != var2.field26) {
                    this.field198.glDisable(var2.field26);
                    this.field198.glEnable(arg0.field26);
                }
                this.field198.glBindTexture(arg0.field26, arg0.method25());
            }
            this.field267[this.field232] = arg0;
        }
        this.field311 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "()F")
    public final float method208() {
        return this.field299;
    }

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "()V")
    private final void method209() {
        this.field284 = (this.field262[14] - (float) this.field308) / this.field262[10];
        this.field330 = (float) this.field308 - this.field299;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public final void method210(int arg0) {
        this.method125();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(F)V")
    public final void method211(float arg0) {
        if (this.field320 != arg0) {
            this.field320 = arg0;
            this.method195();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lsj;Lbg;Lmk;[Lmo;I)V")
    public final void method212(class73[] arg0, class374 arg1, class156 arg2, class197[] arg3, int arg4) {
        this.method245(arg0, arg2, arg3, arg4);
        this.method182(arg1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ldr;Z)Lkb;")
    public final class80 method213(class214 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field2974 * arg0.field2973];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2975 == null) {
            for (int var8 = 0; var8 < arg0.field2974; var8++) {
                for (int var9 = 0; var9 < arg0.field2973; var9++) {
                    int var10 = arg0.field2972[arg0.field2971[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field2974; var6++) {
                for (int var7 = 0; var7 < arg0.field2973; var7++) {
                    var3[var5++] = arg0.field2975[var4] << 24 | arg0.field2972[arg0.field2971[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class80 var11 = this.method188(var3, 0, arg0.field2973, arg0.field2973, arg0.field2974);
        var11.method738(arg0.field2968, arg0.field2970, arg0.field2967, arg0.field2969);
        return var11;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhf;)V")
    public final void method214(class219 arg0) {
        if (this.field218 < 0 || this.field216[this.field218] != arg0) {
            throw new RuntimeException();
        }
        this.field216[this.field218--] = null;
        arg0.method94();
        if (this.field218 >= 0) {
            this.field221 = this.field216[this.field218];
            this.field221.method135();
        }
    }

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "()V")
    private final void method215() {
        float var1 = (float) (-this.field266) * this.field321 / (float) this.field259;
        float var2 = (float) (-this.field278) * this.field321 / (float) this.field303;
        float var3 = (float) (this.field214 - this.field266) * this.field321 / (float) this.field259;
        float var4 = (float) (this.field215 - this.field278) * this.field321 / (float) this.field303;
        this.field198.glMatrixMode(5889);
        this.field198.glLoadIdentity();
        this.field198.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field279 - this.field299), (double) ((float) this.field308 - this.field299));
        this.field198.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "()V")
    public final void method216() {
        if (this.field318 != 0) {
            this.field318 = 0;
            this.field311 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "()V")
    public final void method217() {
        if (this.field198 != null) {
            try {
                this.field203.method2672();
            } catch (Throwable var4) {
            }
            this.field198 = null;
        }
        if (this.field205 != null) {
            this.method240();
            try {
                this.field205.destroy();
            } catch (Throwable var3) {
            }
            this.field205 = null;
        }
        if (this.field222) {
            class370.method2311(-1, true, true);
            this.field222 = false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIII)V")
    public final void method218(int arg0, int arg1, int arg2, int arg3) {
        if (this.field328 < arg0) {
            this.field328 = arg0;
        }
        if (this.field233 > arg2) {
            this.field233 = arg2;
        }
        if (this.field337 < arg1) {
            this.field337 = arg1;
        }
        if (this.field319 > arg3) {
            this.field319 = arg3;
        }
        this.field198.glEnable(3089);
        this.method130();
        this.method143();
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method201();
        this.method121(arg5);
        this.field198.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field198.glBegin(2);
        this.field198.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field198.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field198.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIILvj;II)V")
    public final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class179 arg6, int arg7, int arg8) {
        class50 var10 = (class50) arg6;
        class317 var11 = var10.field836;
        this.method198();
        this.method207(var10.field836);
        this.method121(arg5);
        this.method145(7681, 8448);
        this.method93(0, 34167, 768);
        float var12 = var11.field4302 / (float) var11.field4300;
        float var13 = var11.field4298 / (float) var11.field4299;
        this.field198.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field198.glBegin(1);
        this.field198.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field198.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field198.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field198.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field198.glEnd();
        this.method93(0, 5890, 768);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[I[I)Lvj;")
    public final class179 method221(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class50.method496(arg3, arg2, (byte) 68, arg1, this, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "()V")
    private final void method222() {
        if (this.field299 == 0.0F) {
            this.field262[10] = this.field270;
            this.field262[14] = this.field300;
        } else {
            float var1 = this.field273 / (this.field299 + this.field273);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field300 * (1.0F - var1) / this.field299;
            this.field262[10] = this.field270 + var3;
            this.field262[14] = this.field300 * var2;
        }
        this.method209();
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(III)V")
    public final void method223(int arg0, int arg1, int arg2) {
        this.field198.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field198.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "()I")
    public final int method224() {
        int var1 = this.field342;
        this.field342 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "()Lhf;")
    public final class219 method225() {
        return this.field221;
    }

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "()Lmk;")
    public final class156 method226() {
        return this.field208;
    }

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "()Z")
    public final boolean method227() {
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field257.field459 + (float) arg0 * this.field257.field457 + (float) arg1 * this.field257.field456 + this.field257.field453;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field257.field459 + (float) arg3 * this.field257.field457 + (float) arg4 * this.field257.field456 + this.field257.field453;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field279) || !(var8 < (float) this.field279)) || !(!(var7 > (float) this.field308) || !(var8 > (float) this.field308))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field257.field450 + (float) arg0 * this.field257.field458 + (float) arg1 * this.field257.field449 + this.field257.field451) * (float) this.field259 / var7);
        int var10 = (int) (((float) arg5 * this.field257.field450 + (float) arg3 * this.field257.field458 + (float) arg4 * this.field257.field449 + this.field257.field451) * (float) this.field259 / var8);
        if ((float) var9 < this.field231 && (float) var10 < this.field231 || (float) var9 > this.field258 && (float) var10 > this.field258) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field257.field448 + (float) arg0 * this.field257.field452 + (float) arg1 * this.field257.field447 + this.field257.field455) * (float) this.field303 / var7);
            int var12 = (int) (((float) arg5 * this.field257.field448 + (float) arg3 * this.field257.field452 + (float) arg4 * this.field257.field447 + this.field257.field455) * (float) this.field303 / var8);
            return (!((float) var11 < this.field305) || !((float) var12 < this.field305)) && (!((float) var11 > this.field244) || !((float) var12 > this.field244));
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lk;Lk;FLk;)Lk;")
    public final class293 method229(class293 arg0, class293 arg1, float arg2, class293 arg3) {
        if (arg0 != null && arg1 != null && this.field297 && this.field295) {
            class319 var5 = null;
            class171 var6 = (class171) arg0;
            class171 var7 = (class171) arg1;
            class181 var8 = var6.method1280(true);
            class181 var9 = var7.method1280(true);
            if (var8 != null && var9 != null) {
                int var10 = var8.field2643 > var9.field2643 ? var8.field2643 : var9.field2643;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class319) {
                    class319 var11 = (class319) arg3;
                    if (var11.method2025(true) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class319(this, var10);
                }
                var5.method2024(74, var8, arg2, var9);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(F)V")
    public final void method230(float arg0) {
        if (this.field321 != arg0) {
            this.field321 = arg0;
            if (this.field318 == 3) {
                this.method215();
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "()Z")
    public final boolean method231() {
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFFFFF)V")
    private final void method233(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field262;
        var8[0] = var7 / (arg1 - arg0);
        var8[1] = 0.0F;
        var8[2] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 0.0F;
        var8[5] = var7 / (arg3 - arg2);
        var8[6] = 0.0F;
        var8[7] = 0.0F;
        var8[8] = (arg0 + arg1) / (arg1 - arg0);
        var8[9] = (arg2 + arg3) / (arg3 - arg2);
        var8[10] = this.field270 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field300 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method222();
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "()I")
    public final int method234() {
        int var1 = this.field341;
        this.field341 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "()V")
    public final void method235() {
        int var1 = this.field328;
        int var2 = this.field233;
        int var3 = this.field337;
        int var4 = this.field319;
        this.method122();
        this.field198.glReadBuffer(1028);
        this.field198.glDrawBuffer(1029);
        this.method216();
        this.method184(false);
        this.method127(false);
        this.method138(false);
        this.method158(false);
        this.method207((class4) null);
        this.method190(-2);
        this.method159(0);
        this.method121(0);
        this.field198.glMatrixMode(5889);
        this.field198.glLoadIdentity();
        this.field198.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field198.glMatrixMode(5888);
        this.field198.glLoadIdentity();
        this.field198.glRasterPos2i(0, 0);
        this.field198.glCopyPixels(0, 0, this.field214, this.field215, 6144);
        this.field198.glFlush();
        this.field198.glReadBuffer(1029);
        this.field198.glDrawBuffer(1029);
        this.method111(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public final void method236(boolean arg0) {
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lmr;IIII)Lsj;")
    public final class73 method237(class84 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class350(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "()V")
    private final void method238() {
        if (this.field234 && this.field296 | this.field291 >= 0) {
            this.field198.glEnable(2912);
        } else {
            this.field198.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "()Lmk;")
    public final class156 method239() {
        return new class25();
    }

    @OriginalMember(owner = "client!hd", name = "ob", descriptor = "()V")
    private final void method240() {
        try {
            this.field205.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "pb", descriptor = "()V")
    private final void method241() {
        int var1;
        if (this.field296) {
            this.field198.glFogf(2915, 0.0F);
            this.field198.glFogf(2916, 1.0F);
            var1 = this.field298;
        } else {
            this.field334 = (float) (this.field308 - 256) - this.field260;
            this.field271 = this.field334 - (float) this.field291 * this.field327;
            if (this.field271 < (float) this.field279) {
                this.field271 = (float) this.field279;
            }
            this.field198.glFogf(2915, this.field271);
            this.field198.glFogf(2916, this.field334);
            var1 = this.field264;
        }
        field200[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field200[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field200[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field198.glFogfv(2918, field200, 0);
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(Z)V")
    public final void method242(boolean arg0) {
        if (this.field307 != arg0) {
            this.field307 = arg0;
            this.method156();
        }
    }

    @OriginalMember(owner = "client!hd", name = "qb", descriptor = "()V")
    public final void method243() {
        if (this.field318 != 2) {
            this.field318 = 2;
            this.method109();
            this.method131();
            this.field311 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(FF)V")
    public final void method244(float arg0, float arg1) {
        this.field327 = arg0;
        this.field260 = arg1;
        if (!this.field296) {
            this.method241();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lsj;Lmk;[Lmo;I)V")
    public final void method245(class73[] arg0, class156 arg1, class197[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method478(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "()V")
    public final void method246() {
        try {
            this.field205.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZZ)V")
    public final void method247(int arg0, boolean arg1, boolean arg2) {
        if (this.field332 != arg0) {
            if (arg0 < 0) {
                this.method144();
                this.method207((class4) null);
                if (!this.field296) {
                    this.field199.method1105(arg1, arg2, 0, -98);
                }
            } else {
                class231 var4 = this.field197.method1435(arg0, -16541);
                class122 var5 = this.field201.method917((byte) 96, arg0);
                if (var5.field1710 == 0 && var5.field1711 == 0) {
                    this.method144();
                } else {
                    int var6 = var5.field1703 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method255((float) (this.field210 % var7 * var5.field1710) / (float) var7, (float) (this.field210 % var7 * var5.field1711) / (float) var7, 0.0F);
                }
                if (this.field296) {
                    this.field199.method1105(arg1, arg2, 3, -106);
                    this.method207(var4);
                } else {
                    this.field199.method1105(arg1, arg2, var5.field1714, 56);
                    this.field199.method1104(var5.field1718, false, (byte) -112);
                    if (!this.field199.method1103(var4, 21)) {
                        this.method207(var4);
                    }
                }
            }
            this.field332 = arg0;
        }
        this.field311 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
    public final synchronized void method248(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field224.method1247((byte) 120)) {
            class193 var4 = (class193) this.field224.method1239(true);
            field202[var2++] = (int) var4.field5349;
            this.field220 -= var4.field2776;
            if (var2 == 1000) {
                this.field198.glDeleteBuffersARB(var2, field202, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field198.glDeleteBuffersARB(var2, field202, 0);
            var2 = 0;
        }
        while (!this.field225.method1247((byte) 120)) {
            class193 var5 = (class193) this.field225.method1239(true);
            field202[var2++] = (int) var5.field5349;
            this.field211 -= var5.field2776;
            if (var2 == 1000) {
                this.field198.glDeleteTextures(var2, field202, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field198.glDeleteTextures(var2, field202, 0);
            var2 = 0;
        }
        while (!this.field226.method1247((byte) 120)) {
            class193 var6 = (class193) this.field226.method1239(true);
            field202[var2++] = var6.field2776;
            if (var2 == 1000) {
                this.field198.glDeleteFramebuffersEXT(var2, field202, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field198.glDeleteFramebuffersEXT(var2, field202, 0);
            var2 = 0;
        }
        while (!this.field227.method1247((byte) 120)) {
            class193 var7 = (class193) this.field227.method1239(true);
            field202[var2++] = (int) var7.field5349;
            this.field219 -= var7.field2776;
            if (var2 == 1000) {
                this.field198.glDeleteRenderbuffersEXT(var2, field202, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field198.glDeleteRenderbuffersEXT(var2, field202, 0);
            var2 = 0;
        }
        while (!this.field228.method1247((byte) 120)) {
            class193 var8 = (class193) this.field228.method1239(true);
            field202[var2++] = (int) var8.field5349;
            if (var2 == 1000) {
                this.field198.glDeleteProgramsARB(var2, field202, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field198.glDeleteProgramsARB(var2, field202, 0);
            boolean var9 = false;
        }
        while (!this.field212.method1247((byte) 120)) {
            class193 var10 = (class193) this.field212.method1239(true);
            this.field198.glDeleteLists((int) var10.field5349, var10.field2776);
        }
        while (!this.field229.method1247((byte) 120)) {
            class193 var11 = (class193) this.field229.method1239(true);
            this.field198.glDeleteObjectARB(var11.field2776);
        }
        while (!this.field212.method1247((byte) 120)) {
            class193 var12 = (class193) this.field212.method1239(true);
            this.field198.glDeleteLists((int) var12.field5349, var12.field2776);
        }
        if (this.method200() > 100663296 && class108.method902((byte) -93) > this.field338 + 60000L) {
            System.gc();
            this.field338 = class108.method902((byte) -93);
        }
        this.field210 = var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ln;)V")
    public final void method249(class25 arg0) {
        this.field198.glPushMatrix();
        this.field198.glMultMatrixf(arg0.method314((byte) -100), 0);
    }

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "()Z")
    public final boolean method250() {
        return this.field206.method2172(103);
    }

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "(I)V")
    public final synchronized void method251(int arg0) {
        class193 var2 = new class193(arg0);
        this.field228.method1249(var2, (byte) -123);
    }

    @OriginalMember(owner = "client!hd", name = "rb", descriptor = "()V")
    private final void method252() {
        this.field198.glDepthMask(this.field315 && this.field306);
    }

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "()V")
    private final void method253() {
        if (this.field318 != 3) {
            this.field318 = 3;
            this.method215();
            this.method131();
            this.field311 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFF)V")
    public final void method254(float arg0, float arg1, float arg2) {
        class270.field3641 = arg0;
        class270.field3640 = arg1;
        class270.field3631 = arg2;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(FFF)V")
    private final void method255(float arg0, float arg1, float arg2) {
        this.field198.glMatrixMode(5890);
        if (this.field235) {
            this.field198.glLoadIdentity();
        }
        this.field198.glTranslatef(arg0, arg1, arg2);
        this.field198.glMatrixMode(5888);
        this.field235 = true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Li;)V")
    public final void method256(class83 arg0) {
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Lrs;)V")
    public final void method257(class240 arg0) {
        class203 var2 = arg0.field3322;
        this.method157(var2);
        var2.method826(arg0);
        this.field280 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "()Z")
    public final boolean method258() {
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method201();
        this.method121(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field198.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field198.glBegin(1);
        this.field198.glVertex2f(var6, var7);
        this.field198.glVertex2f((float) arg2 + var6, var7);
        this.field198.glEnd();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lhf;)V")
    public final void method260(class219 arg0) {
        if (this.field218 >= 3) {
            throw new RuntimeException();
        }
        if (this.field218 >= 0) {
            this.field216[this.field218].method94();
        }
        this.field221 = this.field216[++this.field218] = arg0;
        this.field221.method135();
    }

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "(I)I")
    public final int method261(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lpg;IILbd;)V")
    public class17(Canvas arg0, class112 arg1, int arg2, int arg3, class304 arg4) {
        this.field196 = arg0;
        this.field201 = arg1;
        this.field5484 = arg2;
        int var6 = 0;
        while (!this.field196.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class229.method1541(118, 1000L);
        }
        this.field196.setIgnoreRepaint(true);
        try {
            if (!field209) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field209 = Boolean.TRUE;
                } else {
                    class242 var7 = arg4.method1949(0, this.getClass());
                    while (var7.field3345 == 0) {
                        class229.method1541(74, 100L);
                    }
                    if (var7.field3345 == 1) {
                        field209 = Boolean.TRUE;
                    }
                }
            }
            if (!field209) {
                throw new RuntimeException("");
            }
            this.field205 = new context();
            if (!this.field205.choosePixelFormat(this.field196, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field205.createContext()) {
                this.method125();
                this.field198 = this.field205.getGL();
                int var8 = this.method193();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field340 = this.field292 ? 33639 : 5121;
                String var9 = this.field249.toLowerCase();
                String var10 = this.field310.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class156.method1192(0, ' ', var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        if (var16.length() >= 4) {
                            if (var16.charAt(0) == 'x' && class318.method2023(true, var16.substring(1, 3))) {
                                var16 = var16.substring(1);
                                var13 = true;
                            }
                            if (var16.equals("hd")) {
                                var12 = true;
                                break;
                            }
                            if (var16.startsWith("hd")) {
                                var16 = var16.substring(2);
                                var12 = true;
                            }
                            if (class318.method2023(true, var16.substring(0, 4))) {
                                var11 = class362.method2277(var16.substring(0, 4), -99);
                                break;
                            }
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field336 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field283 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field238 = false;
                    }
                    this.field288 = this.field336;
                }
                if (var9.contains("intel")) {
                    this.field295 = false;
                }
                if (this.field336) {
                    try {
                        int[] var17 = new int[1];
                        this.field198.glGenBuffersARB(1, var17, 0);
                    } catch (Throwable var22) {
                        throw new RuntimeException("", var22);
                    }
                }
                this.method260(this);
                this.method174();
                this.method118();
                this.field217 = new class369(this);
                this.field197 = new class208(this, this.field201);
                class134.method1073(true, (byte) -96, true);
                this.field222 = true;
                this.field199 = new class141(this);
                this.field203 = new class429(this);
                this.field206 = new class270(this);
                this.method204();
                this.field198.glClear(16640);
                int var19 = 0;
                while (true) {
                    try {
                        this.field205.swapBuffers();
                        break;
                    } catch (Exception var23) {
                        if (var19++ > 5) {
                            throw new RuntimeException("");
                        }
                        class229.method1541(60, 100L);
                    }
                }
                this.field198.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method217();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var24);
        }
    }
}
