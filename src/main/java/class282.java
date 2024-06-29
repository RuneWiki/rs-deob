import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class282 extends class298 implements class70 {

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lnl;")
    private class262 field4142 = new class262();

    @OriginalMember(owner = "client!se", name = "E", descriptor = "Lug;")
    private class118 field4151 = new class35();

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public int field4154 = 3;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "[Lhj;")
    private class70[] field4157 = new class70[4];

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Z")
    private boolean field4156 = false;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public int field4155 = 8;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    private int field4165 = -1;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Lm;")
    private class242 field4163 = new class242();

    @OriginalMember(owner = "client!se", name = "T", descriptor = "Lm;")
    private class242 field4166 = new class242();

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Lm;")
    private class242 field4167 = new class242();

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Lm;")
    private class242 field4168 = new class242();

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lm;")
    private class242 field4169 = new class242();

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Lm;")
    private class242 field4170 = new class242();

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Lm;")
    private class242 field4171 = new class242();

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
    public int field4179 = 3584;

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
    public int field4187 = 512;

    @OriginalMember(owner = "client!se", name = "sb", descriptor = "F")
    private float field4191 = 1.0F;

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "[F")
    public float[] field4188 = new float[4];

    @OriginalMember(owner = "client!se", name = "Zb", descriptor = "I")
    public int field4224 = 50;

    @OriginalMember(owner = "client!se", name = "Qb", descriptor = "I")
    private int field4215 = 0;

    @OriginalMember(owner = "client!se", name = "Fb", descriptor = "I")
    private int field4204 = 0;

    @OriginalMember(owner = "client!se", name = "ec", descriptor = "[F")
    private float[] field4229 = new float[4];

    @OriginalMember(owner = "client!se", name = "jc", descriptor = "I")
    public int field4234 = -1;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "F")
    public float field4186 = 3584.0F;

    @OriginalMember(owner = "client!se", name = "kc", descriptor = "I")
    public int field4235 = -1;

    @OriginalMember(owner = "client!se", name = "rb", descriptor = "I")
    private int field4190 = 0;

    @OriginalMember(owner = "client!se", name = "Bc", descriptor = "I")
    private int field4252 = 0;

    @OriginalMember(owner = "client!se", name = "ic", descriptor = "I")
    private int field4233 = 0;

    @OriginalMember(owner = "client!se", name = "uc", descriptor = "I")
    public int field4245 = 512;

    @OriginalMember(owner = "client!se", name = "Rb", descriptor = "F")
    public float field4216 = 1.0F;

    @OriginalMember(owner = "client!se", name = "Gb", descriptor = "F")
    public float field4205 = -1.0F;

    @OriginalMember(owner = "client!se", name = "Yb", descriptor = "F")
    public float field4223 = 3584.0F;

    @OriginalMember(owner = "client!se", name = "qb", descriptor = "F")
    private float field4189 = 1.0F;

    @OriginalMember(owner = "client!se", name = "tc", descriptor = "F")
    public float field4244 = -1.0F;

    @OriginalMember(owner = "client!se", name = "Ec", descriptor = "[F")
    private float[] field4255 = new float[16];

    @OriginalMember(owner = "client!se", name = "yc", descriptor = "Z")
    private boolean field4249 = true;

    @OriginalMember(owner = "client!se", name = "Nc", descriptor = "I")
    private int field4264 = 8448;

    @OriginalMember(owner = "client!se", name = "Tc", descriptor = "I")
    private int field4270 = 0;

    @OriginalMember(owner = "client!se", name = "Sc", descriptor = "F")
    private float field4269 = 0.0F;

    @OriginalMember(owner = "client!se", name = "Ic", descriptor = "I")
    public int field4259 = 0;

    @OriginalMember(owner = "client!se", name = "Pb", descriptor = "[F")
    private float[] field4214 = new float[4];

    @OriginalMember(owner = "client!se", name = "xc", descriptor = "F")
    public float field4248 = 1.0F;

    @OriginalMember(owner = "client!se", name = "ad", descriptor = "I")
    private int field4277 = 8448;

    @OriginalMember(owner = "client!se", name = "Yc", descriptor = "F")
    public float field4275 = 1.0F;

    @OriginalMember(owner = "client!se", name = "Vc", descriptor = "I")
    private int field4272 = -1;

    @OriginalMember(owner = "client!se", name = "Oc", descriptor = "I")
    public int field4265 = -1;

    @OriginalMember(owner = "client!se", name = "cd", descriptor = "I")
    public int field4279 = 0;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "[F")
    private float[] field4178 = new float[4];

    @OriginalMember(owner = "client!se", name = "Pc", descriptor = "I")
    private int field4266 = 0;

    @OriginalMember(owner = "client!se", name = "sc", descriptor = "I")
    private int field4243 = -1;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4141;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lwh;")
    public class288 field4150;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Ljaggl/context;")
    private context field4143;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Ljaggl/opengl;")
    public opengl field4140;

    @OriginalMember(owner = "client!se", name = "hc", descriptor = "Z")
    public boolean field4232;

    @OriginalMember(owner = "client!se", name = "Fc", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!se", name = "fc", descriptor = "Ljava/lang/String;")
    private String field4230;

    @OriginalMember(owner = "client!se", name = "bd", descriptor = "Ljava/lang/String;")
    private String field4278;

    @OriginalMember(owner = "client!se", name = "Kc", descriptor = "Z")
    private boolean field4261;

    @OriginalMember(owner = "client!se", name = "qc", descriptor = "Z")
    public boolean field4241;

    @OriginalMember(owner = "client!se", name = "Ob", descriptor = "Z")
    public boolean field4213;

    @OriginalMember(owner = "client!se", name = "Hc", descriptor = "Z")
    private boolean field4258;

    @OriginalMember(owner = "client!se", name = "Nb", descriptor = "Z")
    public boolean field4212;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "Liq;")
    public class148 field4162;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Lcd;")
    public class332 field4149;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Llr;")
    private class88 field4144;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lsp;")
    private class310 field4138;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Lnj;")
    private class275 field4148;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
    private static int[] field4139 = new int[1000];

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[F")
    private static float[] field4146 = new float[4];

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[F")
    private static float[] field4147 = new float[4];

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4145 = Boolean.FALSE;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "F")
    public float field4175;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "F")
    public float field4184;

    @OriginalMember(owner = "client!se", name = "xb", descriptor = "F")
    public float field4196;

    @OriginalMember(owner = "client!se", name = "Bb", descriptor = "F")
    public float field4200;

    @OriginalMember(owner = "client!se", name = "Cb", descriptor = "F")
    public float field4201;

    @OriginalMember(owner = "client!se", name = "Hb", descriptor = "F")
    private float field4206;

    @OriginalMember(owner = "client!se", name = "Mb", descriptor = "F")
    public float field4211;

    @OriginalMember(owner = "client!se", name = "mc", descriptor = "F")
    private float field4237;

    @OriginalMember(owner = "client!se", name = "Ac", descriptor = "F")
    public float field4251;

    @OriginalMember(owner = "client!se", name = "Gc", descriptor = "F")
    private float field4257;

    @OriginalMember(owner = "client!se", name = "Mc", descriptor = "F")
    public float field4263;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    private int field4177;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!se", name = "zb", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!se", name = "Tb", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!se", name = "bc", descriptor = "I")
    private int field4226;

    @OriginalMember(owner = "client!se", name = "lc", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!se", name = "nc", descriptor = "I")
    private int field4238;

    @OriginalMember(owner = "client!se", name = "pc", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!se", name = "rc", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!se", name = "zc", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!se", name = "gd", descriptor = "I")
    private int field4283;

    @OriginalMember(owner = "client!se", name = "hd", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!se", name = "Zc", descriptor = "J")
    private long field4276;

    @OriginalMember(owner = "client!se", name = "Ab", descriptor = "Loa;")
    public class121 field4199;

    @OriginalMember(owner = "client!se", name = "Ib", descriptor = "Loa;")
    public class121 field4207;

    @OriginalMember(owner = "client!se", name = "Jb", descriptor = "Loa;")
    public class121 field4208;

    @OriginalMember(owner = "client!se", name = "Wb", descriptor = "Lfj;")
    private class146 field4221;

    @OriginalMember(owner = "client!se", name = "yb", descriptor = "Ljj;")
    public class18 field4197;

    @OriginalMember(owner = "client!se", name = "Rc", descriptor = "Loi;")
    private class207 field4268;

    @OriginalMember(owner = "client!se", name = "Db", descriptor = "Lkr;")
    private class26 field4202;

    @OriginalMember(owner = "client!se", name = "oc", descriptor = "Lkr;")
    private class26 field4239;

    @OriginalMember(owner = "client!se", name = "Qc", descriptor = "Lkr;")
    private class26 field4267;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "Lpk;")
    public class319 field4172;

    @OriginalMember(owner = "client!se", name = "vb", descriptor = "Lpk;")
    public class319 field4194;

    @OriginalMember(owner = "client!se", name = "Eb", descriptor = "Lpk;")
    public class319 field4203;

    @OriginalMember(owner = "client!se", name = "Lb", descriptor = "Lpk;")
    public class319 field4210;

    @OriginalMember(owner = "client!se", name = "vc", descriptor = "Lpk;")
    public class319 field4246;

    @OriginalMember(owner = "client!se", name = "Dc", descriptor = "Lpk;")
    public class319 field4254;

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "Lrd;")
    public class323 field4181;

    @OriginalMember(owner = "client!se", name = "ed", descriptor = "Lrd;")
    private class323 field4281;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "Lsd;")
    public class35 field4173;

    @OriginalMember(owner = "client!se", name = "Ub", descriptor = "Lsd;")
    public class35 field4219;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Lhj;")
    private class70 field4159;

    @OriginalMember(owner = "client!se", name = "Vb", descriptor = "Lmp;")
    private class89 field4220;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "Z")
    private boolean field4174;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "Z")
    private boolean field4176;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "Z")
    public boolean field4182;

    @OriginalMember(owner = "client!se", name = "tb", descriptor = "Z")
    public boolean field4192;

    @OriginalMember(owner = "client!se", name = "wb", descriptor = "Z")
    private boolean field4195;

    @OriginalMember(owner = "client!se", name = "Sb", descriptor = "Z")
    public boolean field4217;

    @OriginalMember(owner = "client!se", name = "Xb", descriptor = "Z")
    private boolean field4222;

    @OriginalMember(owner = "client!se", name = "ac", descriptor = "Z")
    public boolean field4225;

    @OriginalMember(owner = "client!se", name = "cc", descriptor = "Z")
    private boolean field4227;

    @OriginalMember(owner = "client!se", name = "dc", descriptor = "Z")
    private boolean field4228;

    @OriginalMember(owner = "client!se", name = "gc", descriptor = "Z")
    private boolean field4231;

    @OriginalMember(owner = "client!se", name = "wc", descriptor = "Z")
    private boolean field4247;

    @OriginalMember(owner = "client!se", name = "Cc", descriptor = "Z")
    private boolean field4253;

    @OriginalMember(owner = "client!se", name = "Jc", descriptor = "Z")
    private boolean field4260;

    @OriginalMember(owner = "client!se", name = "Lc", descriptor = "Z")
    private boolean field4262;

    @OriginalMember(owner = "client!se", name = "Uc", descriptor = "Z")
    public boolean field4271;

    @OriginalMember(owner = "client!se", name = "Wc", descriptor = "Z")
    public boolean field4273;

    @OriginalMember(owner = "client!se", name = "Xc", descriptor = "Z")
    private boolean field4274;

    @OriginalMember(owner = "client!se", name = "dd", descriptor = "Z")
    public boolean field4280;

    @OriginalMember(owner = "client!se", name = "Kb", descriptor = "[Lkr;")
    private class26[] field4209;

    @OriginalMember(owner = "client!se", name = "fd", descriptor = "[Lgd;")
    private class344[] field4282;

    @OriginalMember(owner = "client!se", name = "ub", descriptor = "[Z")
    private boolean[] field4193;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([Lqb;Lai;Lug;[Laj;I)V", line = 6)
    public final void method464(class257[] arg0, class305 arg1, class118 arg2, class137[] arg3, int arg4) {
        this.method480(arg0, arg2, arg3, arg4);
        this.method509(arg1);
    }

    @OriginalMember(owner = "client!se", name = "D", descriptor = "()I", line = 14)
    public final int method457() {
        return this.field4179;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lai;)V", line = 18)
    public final void method509(class305 arg0) {
        this.field4142.method1755(this, arg0);
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)I", line = 21)
    public final int method1860(int arg0) {
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

    @OriginalMember(owner = "client!se", name = "v", descriptor = "()Z", line = 35)
    public final boolean method503() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lvn;[Lok;Z)Los;", line = 38)
    public final class129 method446(class431 arg0, class10[] arg1, boolean arg2) {
        return new class54(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 46)
    public final void method499(boolean arg0) {
        this.field4249 = arg0;
        this.method1863();
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(I)V", line = 51)
    public final void method1861(int arg0) {
        this.method1894(arg0, true);
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "(I)V", line = 54)
    public final void method1862(int arg0) {
        if (this.field4226 != arg0) {
            this.field4140.glActiveTexture(arg0 + 33984);
            this.field4226 = arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(Z)V", line = 62)
    public final void method433(boolean arg0) {
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "()Z", line = 64)
    public final boolean method469() {
        return this.field4148.method1815();
    }

    @OriginalMember(owner = "client!se", name = "M", descriptor = "()V", line = 67)
    private final void method1863() {
        this.field4140.glDepthMask(this.field4174 && this.field4249);
    }

    @OriginalMember(owner = "client!se", name = "k", descriptor = "(I)V", line = 71)
    public final synchronized void method1864(int arg0) {
        class17 var2 = new class17(arg0);
        this.field4171.method1560(-120, var2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ldc;)V", line = 75)
    public final void method461(class247 arg0) {
    }

    @OriginalMember(owner = "client!se", name = "B", descriptor = "()Z", line = 79)
    public final boolean method424() {
        if (!this.field4148.method544((byte) 105)) {
            if (!this.field4138.method2050(this.field4148)) {
                return false;
            }
            this.field4149.method2171(-118);
        }
        return true;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(II)V", line = 96)
    public final synchronized void method1865(int arg0, int arg1) {
        class17 var3 = new class17(arg1);
        var3.field6091 = (long) arg0;
        this.field4168.method1560(-101, var3);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V", line = 101)
    public final void method1866(int arg0, int arg1, int arg2) {
        this.field4140.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4140.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqb;Lai;Lug;Laj;I)V", line = 107)
    public final void method453(class257 arg0, class305 arg1, class118 arg2, class137 arg3, int arg4) {
        arg0.method1661(arg2, arg3, arg4);
        this.method509(arg1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IFFFFF)V", line = 115)
    public final void method488(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4243 != arg0;
        if (var7 || this.field4205 != arg1 || this.field4244 != arg2) {
            this.field4243 = arg0;
            this.field4205 = arg1;
            this.field4244 = arg2;
            if (var7) {
                this.field4216 = (float) (this.field4243 & 0xFF0000) / 1.671168E7F;
                this.field4248 = (float) (this.field4243 & 0xFFFF) / 65535.0F;
                this.field4275 = (float) (this.field4243 & 0xFF) / 255.0F;
                this.method1937();
            }
            this.method1872();
        }
        if (this.field4214[0] == arg3 && this.field4214[1] == arg4 && this.field4214[2] == arg5) {
            return;
        }
        this.field4214[0] = arg3;
        this.field4214[1] = arg4;
        this.field4214[2] = arg5;
        this.field4178[0] = -arg3;
        this.field4178[1] = -arg4;
        this.field4178[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4188[0] = arg3 * var8;
        this.field4188[1] = arg4 * var8;
        this.field4188[2] = arg5 * var8;
        this.field4229[0] = -this.field4188[0];
        this.field4229[1] = -this.field4188[1];
        this.field4229[2] = -this.field4188[2];
        this.method1875();
        this.field4180 = (int) (arg3 * 256.0F / arg4);
        this.field4240 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!se", name = "k", descriptor = "()Z", line = 163)
    public final boolean method521() {
        return false;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(III)V", line = 167)
    public final void method1867(int arg0, int arg1, int arg2) {
        this.field4140.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4140.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!se", name = "u", descriptor = "()Z", line = 171)
    public final boolean method517() {
        return class364.field5378 == null || !class364.field5378.startsWith("mac");
    }

    @OriginalMember(owner = "client!se", name = "N", descriptor = "()V", line = 174)
    public final void method1868() {
        if (this.field4218 == 4) {
            return;
        }
        this.method1869();
        this.method1903(false);
        this.method1931(false);
        this.method1922(false);
        this.method1892(false);
        this.method1861(-2);
        this.method1933(1);
        this.method1910(1);
        this.field4218 = 4;
    }

    @OriginalMember(owner = "client!se", name = "O", descriptor = "()V", line = 189)
    private final void method1869() {
        if (this.field4238 == 1) {
            return;
        }
        this.field4140.glMatrixMode(5889);
        this.field4140.glLoadIdentity();
        this.field4140.glOrtho(0.0D, (double) this.field4152, (double) this.field4160, 0.0D, -1.0D, 1.0D);
        this.field4140.glMatrixMode(5888);
        this.field4140.glLoadIdentity();
        this.field4238 = 1;
        this.field4218 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFF)V", line = 204)
    private final void method1870(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field4255;
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
        var8[10] = this.field4237 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field4257 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method1927();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lke;)V", line = 227)
    public final void method441(class295 arg0) {
        this.field4268 = (class207) arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 233)
    public final synchronized void method520(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4166.method1563(11395)) {
            class17 var4 = (class17) this.field4166.method1569(24502);
            field4139[var2++] = (int) var4.field6091;
            this.field4164 -= var4.field274;
            if (var2 == 1000) {
                this.field4140.glDeleteBuffersARB(var2, field4139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4140.glDeleteBuffersARB(var2, field4139, 0);
            var2 = 0;
        }
        while (!this.field4167.method1563(11395)) {
            class17 var5 = (class17) this.field4167.method1569(24502);
            field4139[var2++] = (int) var5.field6091;
            this.field4161 -= var5.field274;
            if (var2 == 1000) {
                this.field4140.glDeleteTextures(var2, field4139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4140.glDeleteTextures(var2, field4139, 0);
            var2 = 0;
        }
        while (!this.field4168.method1563(11395)) {
            class17 var6 = (class17) this.field4168.method1569(24502);
            field4139[var2++] = var6.field274;
            if (var2 == 1000) {
                this.field4140.glDeleteFramebuffersEXT(var2, field4139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4140.glDeleteFramebuffersEXT(var2, field4139, 0);
            var2 = 0;
        }
        while (!this.field4169.method1563(11395)) {
            class17 var7 = (class17) this.field4169.method1569(24502);
            field4139[var2++] = (int) var7.field6091;
            this.field4158 -= var7.field274;
            if (var2 == 1000) {
                this.field4140.glDeleteRenderbuffersEXT(var2, field4139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4140.glDeleteRenderbuffersEXT(var2, field4139, 0);
            var2 = 0;
        }
        while (!this.field4170.method1563(11395)) {
            class17 var8 = (class17) this.field4170.method1569(24502);
            field4139[var2++] = (int) var8.field6091;
            if (var2 == 1000) {
                this.field4140.glDeleteProgramsARB(var2, field4139, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4140.glDeleteProgramsARB(var2, field4139, 0);
            boolean var9 = false;
        }
        while (!this.field4163.method1563(11395)) {
            class17 var10 = (class17) this.field4163.method1569(24502);
            this.field4140.glDeleteLists((int) var10.field6091, var10.field274);
        }
        while (!this.field4171.method1563(11395)) {
            class17 var11 = (class17) this.field4171.method1569(24502);
            this.field4140.glDeleteObjectARB(var11.field274);
        }
        while (!this.field4163.method1563(11395)) {
            class17 var12 = (class17) this.field4163.method1569(24502);
            this.field4140.glDeleteLists((int) var12.field6091, var12.field274);
        }
        if (this.method500() > 100663296 && class98.method768((byte) 87) > this.field4276 + 60000L) {
            System.gc();
            this.field4276 = class98.method768((byte) -98);
        }
        this.field4153 = var3;
    }

    @OriginalMember(owner = "client!se", name = "P", descriptor = "()V", line = 400)
    public final void method1871() {
        if (this.field4218 == 8) {
            return;
        }
        this.method1905();
        this.method1903(true);
        this.method1922(true);
        this.method1892(true);
        this.method1933(1);
        this.method1910(1);
        this.field4218 = 8;
    }

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "()V", line = 413)
    private final void method1872() {
        field4146[0] = this.field4216 * this.field4205;
        field4146[1] = this.field4248 * this.field4205;
        field4146[2] = this.field4275 * this.field4205;
        field4146[3] = 1.0F;
        this.field4140.glLightfv(16384, 4609, field4146, 0);
        field4146[0] = -this.field4244 * this.field4216;
        field4146[1] = -this.field4244 * this.field4248;
        field4146[2] = -this.field4244 * this.field4275;
        field4146[3] = 1.0F;
        this.field4140.glLightfv(16385, 4609, field4146, 0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V", line = 427)
    public final void method474(int[] arg0) {
        arg0[0] = this.field4233;
        arg0[1] = this.field4266;
        arg0[2] = this.field4190;
        arg0[3] = this.field4204;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)Z", line = 435)
    public final boolean method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4173.field542 + (float) arg0 * this.field4173.field547 + (float) arg1 * this.field4173.field543 + this.field4173.field544;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4173.field542 + (float) arg3 * this.field4173.field547 + (float) arg4 * this.field4173.field543 + this.field4173.field544;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4224) || !(var8 < (float) this.field4224)) || !(!(var7 > (float) this.field4179) || !(var8 > (float) this.field4179))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4173.field545 + (float) arg0 * this.field4173.field541 + (float) arg1 * this.field4173.field550 + this.field4173.field548) * (float) this.field4245 / var7);
        int var10 = (int) (((float) arg5 * this.field4173.field545 + (float) arg3 * this.field4173.field541 + (float) arg4 * this.field4173.field550 + this.field4173.field548) * (float) this.field4245 / var8);
        if ((float) var9 < this.field4200 && (float) var10 < this.field4200 || (float) var9 > this.field4211 && (float) var10 > this.field4211) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4173.field538 + (float) arg0 * this.field4173.field549 + (float) arg1 * this.field4173.field540 + this.field4173.field546) * (float) this.field4187 / var7);
            int var12 = (int) (((float) arg5 * this.field4173.field538 + (float) arg3 * this.field4173.field549 + (float) arg4 * this.field4173.field540 + this.field4173.field546) * (float) this.field4187 / var8);
            return (!((float) var11 < this.field4184) || !((float) var12 < this.field4184)) && (!((float) var11 > this.field4201) || !((float) var12 > this.field4201));
        }
    }

    @OriginalMember(owner = "client!se", name = "R", descriptor = "()V", line = 465)
    private final void method1873() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4143.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class31.method245(1000L, 93);
        }
    }

    @OriginalMember(owner = "client!se", name = "J", descriptor = "()I", line = 486)
    public final int method495() {
        return 4;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(FFF)V", line = 490)
    private final void method1874(float arg0, float arg1, float arg2) {
        this.field4140.glMatrixMode(5890);
        if (this.field4262) {
            this.field4140.glLoadIdentity();
        }
        this.field4140.glTranslatef(arg0, arg1, arg2);
        this.field4140.glMatrixMode(5888);
        this.field4262 = true;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(IIII)V", line = 502)
    public final void method462(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4152) {
            arg2 = this.field4152;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4160) {
            arg3 = this.field4160;
        }
        this.field4233 = arg0;
        this.field4266 = arg1;
        this.field4190 = arg2;
        this.field4204 = arg3;
        this.field4140.glEnable(3089);
        this.method1926();
        this.method1912();
    }

    @OriginalMember(owner = "client!se", name = "S", descriptor = "()V", line = 527)
    public final void method1875() {
        this.field4140.glLightfv(16384, 4611, this.field4214, 0);
        this.field4140.glLightfv(16385, 4611, this.field4178, 0);
    }

    @OriginalMember(owner = "client!se", name = "r", descriptor = "()Lug;", line = 532)
    public final class118 method429() {
        return new class35();
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(II)V", line = 535)
    public final void method1876(int arg0, int arg1) {
        this.field4252 = arg0;
        this.field4215 = arg1;
        this.field4140.glViewport(arg0, arg1, this.field4152, this.field4160);
        this.method1912();
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "()Z", line = 541)
    public final boolean method496() {
        return this.field4260;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 544)
    public final void method482(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FF)V", line = 549)
    public final void method481(float arg0, float arg1) {
        if (this.field4251 == arg0 && this.field4196 == arg1) {
            return;
        }
        this.field4251 = arg0;
        this.field4196 = arg1;
        this.method1927();
        this.method1877();
        if (this.field4238 == 3) {
            this.method1907();
        } else if (this.field4238 == 2) {
            this.method1901();
        }
    }

    @OriginalMember(owner = "client!se", name = "T", descriptor = "()V", line = 567)
    private final void method1877() {
        this.field4223 = (this.field4255[14] - (float) this.field4179) / this.field4255[10];
        this.field4186 = (float) this.field4179 - this.field4196;
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "()V", line = 571)
    public final void method456() {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[Ldn;)V", line = 576)
    public final void method505(int arg0, class16[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class16 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4147[0] = (float) var4.field264;
            field4147[1] = (float) var4.field272;
            field4147[2] = (float) var4.field269;
            field4147[3] = 1.0F;
            this.field4140.glLightfv(var5, 4611, field4147, 0);
            int var6 = var4.field268;
            float var7 = var4.field270 / 255.0F;
            field4147[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4147[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4147[2] = (float) (var6 & 0xFF) * var7;
            this.field4140.glLightfv(var5, 4609, field4147, 0);
            this.field4140.glLightf(var5, 4617, 1.0F / (float) (var4.field263 * var4.field263));
            this.field4140.glEnable(var5);
        }
        while (var3 < this.field4270) {
            this.field4140.glDisable(var3 + 16386);
            var3++;
        }
        this.field4270 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)I", line = 613)
    public final int method436(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!se", name = "x", descriptor = "()V", line = 619)
    public final void method476() {
        this.field4144.method710((byte) -66, false, false, 0);
        this.field4225 = false;
        this.method1914();
        this.method1935();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILkr;)V", line = 626)
    public final void method1878(int arg0, class26 arg1) {
        class89 var3 = arg1.field455;
        this.method1913(var3);
        var3.method715(arg0, arg1);
        this.field4209[arg0] = arg1;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIII)V", line = 634)
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(II)V", line = 639)
    public final synchronized void method1879(int arg0, int arg1) {
        class17 var3 = new class17(arg1);
        var3.field6091 = (long) arg0;
        this.field4166.method1560(-111, var3);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lrd;)V", line = 644)
    public final void method1880(class323 arg0) {
        if (this.field4281 != arg0 && this.field4261) {
            this.field4140.glBindBufferARB(34963, arg0.method282());
            this.field4281 = arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "A", descriptor = "()Z", line = 652)
    public final boolean method485() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "()Z", line = 656)
    public final boolean method497() {
        return this.field4144.method708(3, (byte) 90);
    }

    @OriginalMember(owner = "client!se", name = "U", descriptor = "()V", line = 659)
    public final void method1881() {
        this.field4140.glPopMatrix();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BIZ)Lrd;", line = 665)
    public final class323 method1882(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class323) (this.field4261 && !arg3 || this.field4258 ? new class412(this, arg0, arg1, arg2, arg3) : new class380(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIIII)Lke;", line = 674)
    public final class295 method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4182 ? new class183(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!se", name = "E", descriptor = "()V", line = 679)
    public final void method447() {
        this.method1892(true);
        this.field4140.glClear(256);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lkr;)V", line = 684)
    public final void method1883(class26 arg0) {
        class89 var2 = arg0.field455;
        this.method1913(var2);
        var2.method711(arg0);
        this.field4202 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lhj;)V", line = 692)
    public final void method1884(class70 arg0) {
        if (this.field4165 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4165 >= 0) {
            this.field4157[this.field4165].method136();
        }
        this.field4159 = this.field4157[++this.field4165] = arg0;
        this.field4159.method141();
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(III)V", line = 702)
    public final void method1885(int arg0, int arg1, int arg2) {
        this.field4140.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lkr;)V", line = 710)
    public final void method1886(class26 arg0) {
        class89 var2 = arg0.field455;
        this.method1913(var2);
        var2.method713(arg0);
        this.field4267 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "t", descriptor = "()Z", line = 717)
    public final boolean method479() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "V", descriptor = "()Lpi;", line = 720)
    public final class141 method1887() {
        return this.field4268 == null ? null : this.field4268.method622((byte) 124);
    }

    @OriginalMember(owner = "client!se", name = "W", descriptor = "()V", line = 723)
    private final void method1888() {
        if (this.field4262) {
            this.field4140.glMatrixMode(5890);
            this.field4140.glLoadIdentity();
            this.field4140.glMatrixMode(5888);
            this.field4262 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "()F", line = 733)
    public final float method458() {
        return this.field4251;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()I", line = 737)
    public final int method466() {
        int var1 = this.field4284;
        this.field4284 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(Z)V", line = 742)
    public final void method1889(boolean arg0) {
        if (this.field4228 != arg0) {
            this.field4228 = arg0;
            this.method1893();
        }
    }

    @OriginalMember(owner = "client!se", name = "l", descriptor = "(I)I", line = 751)
    public final int method1890(int arg0) {
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

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lrd;III)V", line = 785)
    public final void method1891(class323 arg0, int arg1, int arg2, int arg3) {
        this.method1880(arg0);
        arg0.method2125(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(Z)V", line = 793)
    public final void method1892(boolean arg0) {
        if (this.field4174 != arg0) {
            this.field4174 = arg0;
            this.method1863();
            this.field4218 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!se", name = "L", descriptor = "()Z", line = 805)
    public final boolean method434() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "F", descriptor = "()F", line = 808)
    public final float method428() {
        return this.field4196;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V", line = 813)
    public final void method489(int arg0, int arg1) {
        if (this.field4224 == arg0 && this.field4179 == arg1) {
            return;
        }
        this.field4224 = arg0;
        this.field4179 = arg1;
        this.method1899();
        this.method1877();
        this.method1914();
    }

    @OriginalMember(owner = "client!se", name = "n", descriptor = "()V", line = 826)
    public final void method506() {
        if (this.field4148.method544((byte) 105)) {
            this.field4138.method2048(this.field4148);
            this.field4149.method2171(-108);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([IIIII)Ll;", line = 835)
    public final class315 method514(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class291(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!se", name = "X", descriptor = "()V", line = 838)
    private final void method1893() {
        if (this.field4227 && !this.field4228) {
            this.field4140.glEnable(2896);
        } else {
            this.field4140.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V", line = 846)
    public final void method1894(int arg0, boolean arg1) {
        this.method1919(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "()V", line = 850)
    private final void method1895() {
        try {
            this.field4143.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "()V", line = 863)
    public final void method1896() {
        if (this.field4218 == 16) {
            return;
        }
        this.method1929();
        this.method1903(true);
        this.method1922(true);
        this.method1892(true);
        this.method1933(1);
        this.method1910(1);
        this.field4218 = 16;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lsd;)V", line = 876)
    public final void method1897(class35 arg0) {
        this.field4140.glPushMatrix();
        this.field4140.glMultMatrixf(arg0.method263((byte) 113), 0);
    }

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "()V", line = 880)
    private final void method1898() {
        this.method1861(-2);
        for (int var1 = this.field4185 - 1; var1 >= 0; var1--) {
            this.method1862(var1);
            this.method1915((class344) null);
            this.field4140.glTexEnvi(8960, 8704, 34160);
        }
        this.method1911(8448, 8448);
        this.method1866(2, 34168, 770);
        this.method1888();
        this.field4140.glEnable(3042);
        this.field4140.glBlendFunc(770, 771);
        this.field4183 = 1;
        this.field4140.glEnable(3008);
        this.field4140.glAlphaFunc(516, 0.0F);
        this.field4222 = true;
        this.field4140.glColorMask(true, true, true, true);
        this.field4253 = true;
        this.method1903(true);
        this.method1931(true);
        this.method1922(true);
        this.method1892(true);
        this.method1899();
        this.field4140.setSwapInterval(0);
        this.field4140.glShadeModel(7425);
        this.field4140.glClearDepth(1.0F);
        this.field4140.glDepthFunc(515);
        this.field4140.glPolygonMode(1028, 6914);
        this.field4140.glEnable(2884);
        this.field4140.glCullFace(1029);
        this.field4140.glMatrixMode(5888);
        this.field4140.glLoadIdentity();
        this.field4140.glColorMaterial(1028, 5634);
        this.field4140.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4140.glLightfv(var4, 4608, var2, 0);
            this.field4140.glLightf(var4, 4615, 0.0F);
            this.field4140.glLightf(var4, 4616, 0.0F);
        }
        this.field4140.glEnable(16384);
        this.field4140.glEnable(16385);
        this.field4140.glFogf(2914, 0.95F);
        this.field4140.glFogi(2917, 9729);
        this.field4140.glHint(3156, 4353);
        this.field4243 = this.field4235 = -1;
        this.method472();
    }

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "()V", line = 943)
    public final void method1899() {
        if (this.field4238 != 0) {
            this.field4238 = 0;
            this.field4218 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()V", line = 951)
    public final void method136() {
    }

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "()V", line = 953)
    private final void method1900() {
        this.field4173 = new class35();
        this.field4219 = new class35();
        this.field4282 = new class344[this.field4185];
        this.field4193 = new boolean[this.field4236];
        this.field4209 = new class26[this.field4236];
        this.field4208 = new class121(this, 3553, 6408, 1, 1);
        this.field4199 = new class121(this, 3553, 6408, 1, 1);
        this.field4207 = new class121(this, 3553, 6408, 1, 1);
        this.field4172 = new class319(this);
        this.field4210 = new class319(this);
        this.field4203 = new class319(this);
        this.field4246 = new class319(this);
        this.field4254 = new class319(this);
        this.field4194 = new class319(this);
        this.field4181 = this.method1882(5123, (byte[]) null, 1024, true);
        if (this.field4212) {
            this.field4197 = new class18(this);
        }
        this.field4142.method1754(this);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V", line = 978)
    public final void method486(int arg0) {
        this.method1933(0);
        this.field4140.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4140.glClear(16384);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I", line = 983)
    public final int method140() {
        return this.field4160;
    }

    @OriginalMember(owner = "client!se", name = "db", descriptor = "()V", line = 986)
    private final void method1901() {
        this.field4140.glMatrixMode(5889);
        this.field4140.glLoadMatrixf(this.field4255, 0);
        this.field4140.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!se", name = "q", descriptor = "()V", line = 991)
    public final void method455() {
        if (this.field4140 != null) {
            try {
                this.field4138.method2051();
            } catch (Throwable var4) {
            }
            this.field4140 = null;
        }
        if (this.field4143 != null) {
            this.method1895();
            try {
                this.field4143.destroy();
            } catch (Throwable var3) {
            }
            this.field4143 = null;
        }
        if (this.field4156) {
            class246.method1607((byte) -44, true, true);
            this.field4156 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "G", descriptor = "()Z", line = 1023)
    public final boolean method442() {
        return false;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Lkr;)V", line = 1027)
    public final void method1902(class26 arg0) {
        class89 var2 = arg0.field455;
        this.method1913(var2);
        var2.method712(arg0);
        this.field4239 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "m", descriptor = "()V", line = 1035)
    public final void method472() {
        this.field4233 = 0;
        this.field4266 = 0;
        this.field4190 = this.field4152;
        this.field4204 = this.field4160;
        this.field4140.glDisable(3089);
        this.method1926();
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()I", line = 1043)
    public final int method500() {
        return this.field4164 + this.field4161 + this.field4158;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(IIIIII)V", line = 1049)
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1906();
        this.method1933(arg5);
        this.field4140.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4260) {
            this.field4140.glDisable(32925);
        }
        this.field4140.glBegin(7);
        this.field4140.glVertex2f(var7, var8);
        this.field4140.glVertex2f(var7, var10);
        this.field4140.glVertex2f(var9, var10);
        this.field4140.glVertex2f(var9, var8);
        this.field4140.glEnd();
        if (this.field4260) {
            this.field4140.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V", line = 1075)
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4140.glLineWidth((float) arg5);
        this.method493(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4140.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 1082)
    public final void method483(int arg0, int arg1) {
        if (this.field4235 == arg0 && this.field4265 == arg1) {
            return;
        }
        this.field4235 = arg0;
        this.field4265 = arg1;
        if (!this.field4225) {
            this.method1914();
            this.method1935();
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 1099)
    public final void method494(int arg0) {
        this.method1895();
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(Z)V", line = 1102)
    public final void method1903(boolean arg0) {
        if (this.field4231 != arg0) {
            this.field4231 = arg0;
            this.method1935();
            this.field4218 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([Lqb;Lug;[Laj;I)V", line = 1114)
    public final void method480(class257[] arg0, class118 arg1, class137[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1661(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)V", line = 1127)
    public final void method502(boolean arg0) {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lmp;", line = 1129)
    public final class89 method1904(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class89) (this.field4261 && !arg2 || this.field4258 ? new class307(this, arg0, arg1, arg2) : new class336(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V", line = 1138)
    public final void method527(int arg0) {
        this.method1873();
    }

    @OriginalMember(owner = "client!se", name = "I", descriptor = "()I", line = 1141)
    public final int method451() {
        return this.field4224;
    }

    @OriginalMember(owner = "client!se", name = "s", descriptor = "()Z", line = 1145)
    public final boolean method524() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIILsf;II)V", line = 1151)
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class421 arg6, int arg7, int arg8) {
        class442 var10 = (class442) arg6;
        class146 var11 = var10.field6397;
        this.method1928();
        this.method1915(var10.field6397);
        this.method1933(arg5);
        this.method1911(7681, 8448);
        this.method1866(0, 34167, 768);
        float var12 = var11.field1870 / (float) var11.field1873;
        float var13 = var11.field1872 / (float) var11.field1874;
        this.field4140.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4140.glBegin(1);
        this.field4140.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4140.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4140.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4140.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4140.glEnd();
        this.method1866(0, 5890, 768);
    }

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "()V", line = 1175)
    public final void method1905() {
        if (this.field4238 != 2) {
            this.field4238 = 2;
            this.method1901();
            this.method1924();
            this.field4218 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 1185)
    public final void method492(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!se", name = "l", descriptor = "()V", line = 1192)
    public final void method449() {
        this.field4138.method2049();
    }

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "()V", line = 1197)
    private final void method1906() {
        if (this.field4218 == 1) {
            return;
        }
        this.method1869();
        this.method1903(false);
        this.method1931(false);
        this.method1922(false);
        this.method1892(false);
        this.method1915((class344) null);
        this.method1861(-2);
        this.method1910(0);
        this.field4218 = 1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[I[I)Lsf;", line = 1214)
    public final class421 method504(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class442.method2761(-19877, arg0, arg2, arg1, this, arg3);
    }

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "()V", line = 1218)
    private final void method1907() {
        float var1 = (float) (-this.field4279) * this.field4191 / (float) this.field4245;
        float var2 = (float) (-this.field4259) * this.field4191 / (float) this.field4187;
        float var3 = (float) (this.field4152 - this.field4279) * this.field4191 / (float) this.field4245;
        float var4 = (float) (this.field4160 - this.field4259) * this.field4191 / (float) this.field4187;
        this.field4140.glMatrixMode(5889);
        this.field4140.glLoadIdentity();
        this.field4140.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4224 - this.field4196), (double) ((float) this.field4179 - this.field4196));
        this.field4140.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!se", name = "K", descriptor = "()V", line = 1233)
    public final void method454() {
        this.field4152 = this.field4141.getWidth();
        this.field4160 = this.field4141.getHeight();
        this.field4140.glViewport(this.field4252, this.field4215, this.field4152, this.field4160);
        this.method1899();
        this.method472();
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(IIIIII)V", line = 1244)
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1906();
        this.method1933(arg5);
        this.field4140.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4140.glBegin(2);
        this.field4140.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4140.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4140.glEnd();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFF)V", line = 1253)
    public final void method1908(float arg0, float arg1, float arg2, float arg3) {
        field4146[0] = arg0;
        field4146[1] = arg1;
        field4146[2] = arg2;
        field4146[3] = arg3;
        this.field4140.glTexEnvfv(8960, 8705, field4146, 0);
    }

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "()Lhj;", line = 1261)
    public final class70 method1909() {
        return this.field4159;
    }

    @OriginalMember(owner = "client!se", name = "w", descriptor = "()Z", line = 1264)
    public final boolean method501() {
        return true;
    }

    @OriginalMember(owner = "client!se", name = "m", descriptor = "(I)V", line = 1267)
    public final void method1910(int arg0) {
        if (arg0 == 0) {
            this.method1911(7681, 7681);
        } else if (arg0 == 1) {
            this.method1911(8448, 8448);
        } else if (arg0 == 2) {
            this.method1911(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!se", name = "p", descriptor = "()Lug;", line = 1280)
    public final class118 method519() {
        return this.field4151;
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(II)V", line = 1283)
    public final void method1911(int arg0, int arg1) {
        if (this.field4226 != 0) {
            this.field4140.glTexEnvi(8960, 34161, arg0);
            this.field4140.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4277 != arg0) {
            this.field4140.glTexEnvi(8960, 34161, arg0);
            this.field4277 = arg0;
            var3 = true;
        }
        if (this.field4264 != arg1) {
            this.field4140.glTexEnvi(8960, 34162, arg1);
            this.field4264 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4218 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "()V", line = 1315)
    private final void method1912() {
        if (this.field4233 <= this.field4190 && this.field4266 <= this.field4204) {
            this.field4140.glScissor(this.field4252 + this.field4233, this.field4215 + this.field4160 - this.field4204, this.field4190 - this.field4233, this.field4204 - this.field4266);
        } else {
            this.field4140.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(IIIIII)V", line = 1325)
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1906();
        this.method1933(arg5);
        this.field4140.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4260) {
            this.field4140.glDisable(32925);
        }
        this.field4140.glBegin(2);
        this.field4140.glVertex2f(var7, var8);
        this.field4140.glVertex2f(var7, var10);
        this.field4140.glVertex2f(var9, var10);
        this.field4140.glVertex2f(var9, var8);
        this.field4140.glEnd();
        if (this.field4260) {
            this.field4140.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmp;)V", line = 1349)
    public final void method1913(class89 arg0) {
        if (this.field4220 != arg0 && this.field4261) {
            this.field4140.glBindBufferARB(34962, arg0.method282());
            this.field4220 = arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "()V", line = 1358)
    private final void method1914() {
        int var1;
        if (this.field4225) {
            this.field4140.glFogf(2915, 0.0F);
            this.field4140.glFogf(2916, 1.0F);
            var1 = this.field4272;
        } else {
            this.field4206 = (float) (this.field4179 - 256) - this.field4269;
            this.field4263 = this.field4206 - (float) this.field4265 * this.field4189;
            if (this.field4263 < (float) this.field4224) {
                this.field4263 = (float) this.field4224;
            }
            this.field4140.glFogf(2915, this.field4263);
            this.field4140.glFogf(2916, this.field4206);
            var1 = this.field4235;
        }
        field4146[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4146[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4146[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4140.glFogfv(2918, field4146, 0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lgd;)V", line = 1385)
    public final void method1915(class344 arg0) {
        class344 var2 = this.field4282[this.field4226];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4140.glDisable(var2.field5129);
            } else {
                if (var2 == null) {
                    this.field4140.glEnable(arg0.field5129);
                } else if (arg0.field5129 != var2.field5129) {
                    this.field4140.glDisable(var2.field5129);
                    this.field4140.glEnable(arg0.field5129);
                }
                this.field4140.glBindTexture(arg0.field5129, arg0.method2273());
            }
            this.field4282[this.field4226] = arg0;
        }
        this.field4218 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILsf;II)V", line = 1414)
    public final void method515(int arg0, class421 arg1, int arg2, int arg3) {
        class442 var5 = (class442) arg1;
        class146 var6 = var5.field6397;
        this.method1928();
        this.method1915(var5.field6397);
        this.method1933(1);
        this.method1911(7681, 8448);
        this.method1866(0, 34167, 768);
        float var7 = var6.field1870 / (float) var6.field1873;
        float var8 = var6.field1872 / (float) var6.field1874;
        this.field4140.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4140.glBegin(7);
        this.field4140.glTexCoord2f((float) (this.field4233 - arg2) * var7, (float) (this.field4266 - arg3) * var8);
        this.field4140.glVertex2i(this.field4233, this.field4266);
        this.field4140.glTexCoord2f((float) (this.field4233 - arg2) * var7, (float) (this.field4204 - arg3) * var8);
        this.field4140.glVertex2i(this.field4233, this.field4204);
        this.field4140.glTexCoord2f((float) (this.field4190 - arg2) * var7, (float) (this.field4204 - arg3) * var8);
        this.field4140.glVertex2i(this.field4190, this.field4204);
        this.field4140.glTexCoord2f((float) (this.field4190 - arg2) * var7, (float) (this.field4266 - arg3) * var8);
        this.field4140.glVertex2i(this.field4190, this.field4266);
        this.field4140.glEnd();
        this.method1866(0, 5890, 768);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III[I)V", line = 1442)
    public final void method518(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4173.field542 + (float) arg0 * this.field4173.field547 + (float) arg1 * this.field4173.field543 + this.field4173.field544;
        if ((var5 < (float) this.field4224) || (var5 > (float) this.field4179)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4173.field545 + (float) arg0 * this.field4173.field541 + (float) arg1 * this.field4173.field550 + this.field4173.field548) * (float) this.field4245 / var5);
        int var7 = (int) (((float) arg2 * this.field4173.field538 + (float) arg0 * this.field4173.field549 + (float) arg1 * this.field4173.field540 + this.field4173.field546) * (float) this.field4187 / var5);
        if ((float) var6 >= this.field4200 && (float) var6 <= this.field4211 && (float) var7 >= this.field4184 && (float) var7 <= this.field4201) {
            arg3[0] = (int) ((float) var6 - this.field4200);
            arg3[1] = (int) ((float) var7 - this.field4184);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!se", name = "C", descriptor = "()Z", line = 1468)
    public final boolean method498() {
        return this.field4148.method544((byte) 105);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lhj;)V", line = 1471)
    public final void method1916(class70 arg0) {
        if (this.field4165 < 0 || this.field4157[this.field4165] != arg0) {
            throw new RuntimeException();
        }
        this.field4157[this.field4165--] = null;
        arg0.method136();
        if (this.field4165 >= 0) {
            this.field4159 = this.field4157[this.field4165];
            this.field4159.method141();
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()V", line = 1485)
    public final void method141() {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lok;Z)Ll;", line = 1490)
    public final class315 method463(class10 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field187 * arg0.field183];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field180 == null) {
            for (int var8 = 0; var8 < arg0.field187; var8++) {
                for (int var9 = 0; var9 < arg0.field183; var9++) {
                    int var10 = arg0.field184[arg0.field182[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field187; var6++) {
                for (int var7 = 0; var7 < arg0.field183; var7++) {
                    var3[var5++] = arg0.field180[var4] << 24 | arg0.field184[arg0.field182[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class315 var11 = this.method514(var3, 0, arg0.field183, arg0.field183, arg0.field187);
        var11.method205(arg0.field186, arg0.field188, arg0.field185, arg0.field181);
        return var11;
    }

    @OriginalMember(owner = "client!se", name = "H", descriptor = "()V", line = 1550)
    public final void method471() {
        try {
            this.field4143.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lke;Lke;FLke;)Lke;", line = 1559)
    public final class295 method467(class295 arg0, class295 arg1, float arg2, class295 arg3) {
        if (arg0 != null && arg1 != null && this.field4182 && this.field4212) {
            class79 var5 = null;
            class207 var6 = (class207) arg0;
            class207 var7 = (class207) arg1;
            class141 var8 = var6.method622((byte) 125);
            class141 var9 = var7.method622((byte) 120);
            if (var8 != null && var9 != null) {
                int var10 = var8.field1801 > var9.field1801 ? var8.field1801 : var9.field1801;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class79) {
                    class79 var11 = (class79) arg3;
                    if (var11.method623(105) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class79(this, var10);
                }
                var5.method621(var9, arg2, false, var8);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!se", name = "n", descriptor = "(I)V", line = 1597)
    public final synchronized void method1917(int arg0) {
        class17 var2 = new class17(arg0);
        this.field4170.method1560(-103, var2);
    }

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "()I", line = 1606)
    private final int method1918() {
        int var1 = 0;
        this.field4230 = this.field4140.glGetString(7936);
        this.field4278 = this.field4140.glGetString(7937);
        String var2 = this.field4230.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4140.glGetString(7938);
        String[] var4 = class33.method260(-2892, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class212.method1392(true, var4[0]);
                int var6 = class212.method1392(true, var4[1]);
                this.field4242 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4242 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4140.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4140.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4140.glGetIntegerv(34018, var8, 0);
        this.field4185 = var8[0];
        this.field4140.glGetIntegerv(34929, var8, 0);
        this.field4236 = var8[0];
        this.field4140.glGetIntegerv(34930, var8, 0);
        this.field4198 = var8[0];
        if (this.field4185 < 2 || this.field4236 < 2 || this.field4198 < 2) {
            var1 |= 0x10;
        }
        this.field4232 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4261 = this.field4140.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4260 = this.field4140.isExtensionAvailable("GL_ARB_multisample");
        this.field4280 = this.field4140.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4140.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4192 = this.field4140.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4273 = this.field4140.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4241 = this.field4140.isExtensionAvailable("GL_EXT_texture3D");
        this.field4217 = this.field4140.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4182 = this.field4140.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4213 = this.field4140.isExtensionAvailable("GL_ARB_texture_float");
        this.field4271 = false;
        this.field4212 = this.field4140.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIII)V", line = 1674)
    public final void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZ)V", line = 1676)
    public final void method1919(int arg0, boolean arg1, boolean arg2) {
        if (this.field4250 != arg0) {
            if (arg0 < 0) {
                this.method1888();
                this.method1915((class344) null);
                if (!this.field4225) {
                    this.field4144.method710((byte) -115, arg2, arg1, 0);
                }
            } else {
                class121 var4 = this.field4149.method2172((byte) -107, arg0);
                class3 var5 = this.field4150.method1962(arg0, -11999);
                if (var5.field30 == 0 && var5.field42 == 0) {
                    this.method1888();
                } else {
                    int var6 = var5.field34 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method1874((float) (this.field4153 % var7 * var5.field30) / (float) var7, (float) (this.field4153 % var7 * var5.field42) / (float) var7, 0.0F);
                }
                if (this.field4225) {
                    this.field4144.method710((byte) -64, arg2, arg1, 3);
                    this.method1915(var4);
                } else {
                    this.field4144.method710((byte) -106, arg2, arg1, var5.field45);
                    this.field4144.method709(false, (byte) 126, var5.field47);
                    if (!this.field4144.method707(var4, 15628)) {
                        this.method1915(var4);
                    }
                }
            }
            this.field4250 = arg0;
        }
        this.field4218 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(F)V", line = 1725)
    public final void method1920(float arg0) {
        if (this.field4191 != arg0) {
            this.field4191 = arg0;
            if (this.field4238 == 3) {
                this.method1907();
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "o", descriptor = "(I)V", line = 1737)
    public final synchronized void method1921(int arg0) {
        class17 var2 = new class17(arg0);
        this.field4168.method1560(-128, var2);
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "()I", line = 1742)
    public final int method470() {
        int var1 = this.field4283;
        this.field4283 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1747)
    public final void method431(Rectangle[] arg0, int arg1) {
        this.method471();
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(Z)V", line = 1750)
    public final void method1922(boolean arg0) {
        if (this.field4274 == arg0) {
            return;
        }
        if (arg0) {
            this.field4140.glEnable(2929);
        } else {
            this.field4140.glDisable(2929);
        }
        this.field4274 = arg0;
        this.field4218 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!se", name = "p", descriptor = "(I)V", line = 1764)
    public final void method1923(int arg0) {
        field4146[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4146[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4146[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4146[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4140.glTexEnvfv(8960, 8705, field4146, 0);
    }

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "()V", line = 1771)
    private final void method1924() {
        this.field4140.glLoadIdentity();
        this.field4140.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4140.glMultMatrixf(this.field4173.method263((byte) 107), 0);
        this.method1875();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[[I[[IIII)Lda;", line = 1778)
    public final class193 method448(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class153(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIZ)Ll;", line = 1782)
    public final class315 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class291(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(FF)V", line = 1785)
    public final void method1925(float arg0, float arg1) {
        this.field4189 = arg0;
        this.field4269 = arg1;
        if (!this.field4225) {
            this.method1914();
        }
    }

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "()V", line = 1796)
    private final void method1926() {
        this.field4200 = (float) (this.field4233 - this.field4279);
        this.field4211 = (float) (this.field4190 - this.field4279);
        this.field4184 = (float) (this.field4266 - this.field4259);
        this.field4201 = (float) (this.field4204 - this.field4259);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)[I", line = 1810)
    public final int[] method490(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4140.glReadPixels(arg0, this.field4160 - arg1 - var6, arg2, 1, 32993, this.field4256, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "()V", line = 1823)
    private final void method1927() {
        if (this.field4196 == 0.0F) {
            this.field4255[10] = this.field4237;
            this.field4255[14] = this.field4257;
        } else {
            float var1 = this.field4251 / (this.field4251 + this.field4196);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4257 * (1.0F - var1) / this.field4196;
            this.field4255[10] = this.field4237 + var3;
            this.field4255[14] = this.field4257 * var2;
        }
        this.method1877();
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(IIIII)V", line = 1845)
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1906();
        this.method1933(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4140.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4140.glBegin(1);
        this.field4140.glVertex2f(var6, var7);
        this.field4140.glVertex2f((float) arg2 + var6, var7);
        this.field4140.glEnd();
    }

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "()V", line = 1858)
    public final void method1928() {
        if (this.field4218 == 2) {
            return;
        }
        this.method1869();
        this.method1903(false);
        this.method1931(false);
        this.method1922(false);
        this.method1892(false);
        this.method1861(-2);
        this.field4218 = 2;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIII)V", line = 1873)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1906();
        this.method1933(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4140.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4140.glBegin(1);
        this.field4140.glVertex2f(var6, var7);
        this.field4140.glVertex2f(var6, (float) arg2 + var7);
        this.field4140.glEnd();
    }

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "()V", line = 1886)
    private final void method1929() {
        if (this.field4238 != 3) {
            this.field4238 = 3;
            this.method1907();
            this.method1924();
            this.field4218 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!se", name = "y", descriptor = "()Z", line = 1896)
    public final boolean method507() {
        return false;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 1902)
    public final void method525(int arg0, int arg1, int arg2) {
        this.field4225 = true;
        this.field4272 = arg1;
        this.field4234 = arg2;
        this.method1914();
        this.method1935();
        this.field4144.method710((byte) -104, false, false, 3);
        this.field4144.method709(true, (byte) 124, arg0);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(IIII)V", line = 1913)
    public final void method477(int arg0, int arg1, int arg2, int arg3) {
        this.field4279 = arg0;
        this.field4259 = arg1;
        this.field4245 = arg2;
        this.field4187 = arg3;
        float var5 = (float) (-this.field4279 * this.field4224) / (float) this.field4245;
        float var6 = (float) (-this.field4259 * this.field4224) / (float) this.field4187;
        float var7 = (float) ((this.field4152 - this.field4279) * this.field4224) / (float) this.field4245;
        float var8 = (float) ((this.field4160 - this.field4259) * this.field4224) / (float) this.field4187;
        this.method1870(var5, var7, -var8, -var6, (float) this.field4224, (float) this.field4179);
        if (this.field4238 != 1) {
            this.method1899();
        }
        this.method1877();
        this.method1926();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(F)V", line = 1935)
    public final void method473(float arg0) {
        if (this.field4175 != arg0) {
            this.field4175 = arg0;
            this.method1937();
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V", line = 1944)
    public final void method450(int arg0, int arg1, int arg2) {
        if (!this.field4225) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4272 = arg1;
        this.field4234 = arg2;
        this.method1914();
        this.field4144.method709(true, (byte) 125, arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V", line = 1958)
    public final void method460(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4233 < arg0) {
            this.field4233 = arg0;
        }
        if (this.field4190 > arg2) {
            this.field4190 = arg2;
        }
        if (this.field4266 < arg1) {
            this.field4266 = arg1;
        }
        if (this.field4204 > arg3) {
            this.field4204 = arg3;
        }
        this.field4140.glEnable(3089);
        this.method1926();
        this.method1912();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ld;IIII)Lqb;", line = 1975)
    public final class257 method468(class9 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class319(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!se", name = "qb", descriptor = "()V", line = 1981)
    public final void method1930() {
        boolean var1 = this.field4202 != null;
        if (this.field4247 != var1) {
            if (var1) {
                this.field4140.glEnableClientState(32884);
            } else {
                this.field4140.glDisableClientState(32884);
            }
            this.field4247 = var1;
        }
        this.field4202 = null;
        boolean var2 = this.field4267 != null;
        if (this.field4176 != var2) {
            if (var2) {
                this.field4140.glEnableClientState(32885);
            } else {
                this.field4140.glDisableClientState(32885);
            }
            this.field4176 = var2;
        }
        this.field4267 = null;
        boolean var3 = this.field4239 != null;
        if (this.field4195 != var3) {
            if (var3) {
                this.field4140.glEnableClientState(32886);
            } else {
                this.field4140.glDisableClientState(32886);
            }
            this.field4195 = var3;
        }
        this.field4239 = null;
        for (int var4 = 0; var4 < this.field4236; var4++) {
            boolean var5 = this.field4209[var4] != null;
            if (this.field4193[var4] != var5) {
                this.field4140.glClientActiveTexture(var4 + 33984);
                if (var5) {
                    this.field4140.glEnableClientState(32888);
                } else {
                    this.field4140.glDisableClientState(32888);
                }
                this.field4193[var4] = var5;
            }
            this.field4209[var4] = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII[BII)V", line = 2055)
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4221 == null || this.field4221.field1570 < arg2 || this.field4221.field1568 < arg3) {
            this.field4221 = class146.method1011(6406, arg6, false, arg2, 34037, this, arg3, 6406);
            this.field4221.method872(false, false);
            var10 = this.field4221.field1872;
            var11 = this.field4221.field1870;
        } else {
            this.field4221.method869(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4221.field1872 / (float) this.field4221.field1568;
            var11 = (float) arg2 * this.field4221.field1870 / (float) this.field4221.field1570;
        }
        this.method1928();
        this.method1915(this.field4221);
        this.method1933(arg8);
        this.field4140.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1923(arg5);
        this.method1911(34165, 34165);
        this.method1866(0, 34166, 768);
        this.method1866(2, 5890, 770);
        this.method1867(0, 34166, 770);
        this.method1867(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4140.glBegin(7);
        this.field4140.glTexCoord2f(0.0F, 0.0F);
        this.field4140.glVertex2f(var12, var13);
        this.field4140.glTexCoord2f(0.0F, var11);
        this.field4140.glVertex2f(var12, var15);
        this.field4140.glTexCoord2f(var10, var11);
        this.field4140.glVertex2f(var14, var15);
        this.field4140.glTexCoord2f(var10, 0.0F);
        this.field4140.glVertex2f(var14, var13);
        this.field4140.glEnd();
        this.method1866(0, 5890, 768);
        this.method1866(2, 34166, 770);
        this.method1867(0, 5890, 770);
        this.method1867(2, 34166, 770);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(IIII)V", line = 2107)
    public final void method438(int arg0, int arg1, int arg2, int arg3) {
        this.field4138.method2046(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(Z)V", line = 2112)
    public final void method1931(boolean arg0) {
        if (this.field4227 != arg0) {
            this.field4227 = arg0;
            this.method1893();
            this.field4218 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FFF)V", line = 2126)
    public final void method491(float arg0, float arg1, float arg2) {
        class275.field4041 = arg0;
        class275.field4042 = arg1;
        class275.field4046 = arg2;
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(II)V", line = 2132)
    public final synchronized void method1932(int arg0, int arg1) {
        class17 var3 = new class17(arg1);
        var3.field6091 = (long) arg0;
        this.field4167.method1560(-123, var3);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)I", line = 2138)
    public final int method465(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!se", name = "q", descriptor = "(I)V", line = 2143)
    public final void method1933(int arg0) {
        if (this.field4177 == arg0) {
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
        if (this.field4253 != var3) {
            this.field4140.glColorMask(var3, var3, var3, true);
            this.field4253 = var3;
        }
        if (this.field4222 != var4) {
            if (var4) {
                this.field4140.glEnable(3008);
            } else {
                this.field4140.glDisable(3008);
            }
            this.field4222 = var4;
        }
        if (this.field4183 != var2) {
            if (var2 == 1) {
                this.field4140.glEnable(3042);
                this.field4140.glBlendEquation(32774);
                this.field4140.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4140.glEnable(3042);
                this.field4140.glBlendEquation(32774);
                this.field4140.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4140.glEnable(3042);
                this.field4140.glBlendEquation(32778);
                this.field4140.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4140.glEnable(3042);
                this.field4140.glBlendEquation(32774);
                this.field4140.glBlendFunc(774, 1);
            } else {
                this.field4140.glDisable(3042);
            }
            this.field4183 = var2;
        }
        this.field4177 = arg0;
        this.field4218 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)Ldc;", line = 2254)
    public final class247 method452(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lug;)V", line = 2259)
    public final void method478(class118 arg0) {
        this.field4173 = (class35) arg0;
        this.field4219.method266(-9682, this.field4173);
        if (this.field4238 != 1) {
            this.method1924();
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I[BIZ)Lmp;", line = 2266)
    public final class89 method1934(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class89) (this.field4261 && !arg3 || this.field4258 ? new class307(this, arg0, arg1, arg2, arg3) : new class336(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!se", name = "rb", descriptor = "()V", line = 2275)
    private final void method1935() {
        if (this.field4231 && this.field4225 | this.field4265 >= 0) {
            this.field4140.glEnable(2912);
        } else {
            this.field4140.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!se", name = "r", descriptor = "(I)I", line = 2286)
    public final int method1936(int arg0) {
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

    @OriginalMember(owner = "client!se", name = "o", descriptor = "()V", line = 2301)
    public final void method522() {
        int var1 = this.field4233;
        int var2 = this.field4190;
        int var3 = this.field4266;
        int var4 = this.field4204;
        this.method472();
        this.field4140.glReadBuffer(1028);
        this.field4140.glDrawBuffer(1029);
        this.method1899();
        this.method1903(false);
        this.method1931(false);
        this.method1922(false);
        this.method1892(false);
        this.method1915((class344) null);
        this.method1861(-2);
        this.method1910(0);
        this.method1933(0);
        this.field4140.glMatrixMode(5889);
        this.field4140.glLoadIdentity();
        this.field4140.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4140.glMatrixMode(5888);
        this.field4140.glLoadIdentity();
        this.field4140.glRasterPos2i(0, 0);
        this.field4140.glCopyPixels(0, 0, this.field4152, this.field4160, 6144);
        this.field4140.glFlush();
        this.field4140.glReadBuffer(1029);
        this.field4140.glDrawBuffer(1029);
        this.method462(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!se", name = "sb", descriptor = "()V", line = 2333)
    private final void method1937() {
        field4146[0] = this.field4216 * this.field4175;
        field4146[1] = this.field4248 * this.field4175;
        field4146[2] = this.field4275 * this.field4175;
        field4146[3] = 1.0F;
        this.field4140.glLightModelfv(2899, field4146, 0);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lwh;IILde;)V", line = 2627)
    public class282(Canvas arg0, class288 arg1, int arg2, int arg3, class364 arg4) {
        this.field4141 = arg0;
        this.field4150 = arg1;
        this.field4492 = arg2;
        int var6 = 0;
        while (!this.field4141.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class31.method245(1000L, -97);
        }
        this.field4141.setIgnoreRepaint(true);
        try {
            if (!field4145) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4145 = Boolean.TRUE;
                } else {
                    class225 var7 = arg4.method2402(this.getClass(), 0);
                    while (var7.field3104 == 0) {
                        class31.method245(100L, 101);
                    }
                    if (var7.field3104 == 1) {
                        field4145 = Boolean.TRUE;
                    }
                }
            }
            if (!field4145) {
                throw new RuntimeException("");
            }
            this.field4143 = new context();
            if (!this.field4143.choosePixelFormat(this.field4141, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4143.createContext()) {
                this.method1873();
                this.field4140 = this.field4143.getGL();
                int var8 = this.method1918();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4256 = this.field4232 ? 33639 : 5121;
                String var9 = this.field4230.toLowerCase();
                String var10 = this.field4278.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class33.method260(-2892, ' ', var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        if (var16.charAt(0) == 'x' && var16.length() >= 3 && class15.method119(22, var16.substring(1, 3))) {
                            var16 = var16.substring(1);
                            var13 = true;
                        }
                        if (var16.equals("hd")) {
                            var12 = true;
                        } else {
                            if (var16.startsWith("hd")) {
                                var16 = var16.substring(2);
                                var12 = true;
                            }
                            if (var16.length() >= 4 && class15.method119(37, var16.substring(0, 4))) {
                                var11 = class212.method1392(true, var16.substring(0, 4));
                                break;
                            }
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4261 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4241 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4213 = false;
                    }
                    this.field4258 = this.field4261;
                }
                if (var9.contains("intel")) {
                    this.field4212 = false;
                }
                if (this.field4261) {
                    try {
                        int[] var17 = new int[1];
                        this.field4140.glGenBuffersARB(1, var17, 0);
                    } catch (Throwable var22) {
                        throw new RuntimeException("", var22);
                    }
                }
                this.method1884(this);
                this.method454();
                this.method1900();
                this.field4162 = new class148(this);
                this.field4149 = new class332(this, this.field4150);
                class427.method2673(-60, true, true);
                this.field4156 = true;
                this.field4144 = new class88(this);
                this.field4138 = new class310(this);
                this.field4148 = new class275(this);
                this.method1898();
                this.field4140.glClear(16640);
                int var19 = 0;
                while (true) {
                    try {
                        this.field4143.swapBuffers();
                        break;
                    } catch (Exception var23) {
                        if (var19++ > 5) {
                            throw new RuntimeException("");
                        }
                        class31.method245(100L, 35);
                    }
                }
                this.field4140.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method455();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var24);
        }
    }
}
