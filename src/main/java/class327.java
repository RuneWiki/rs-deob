import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class327 extends class118 implements class81 {

    @OriginalMember(owner = "client!h", name = "F", descriptor = "Lfj;")
    private class425 field4364 = new class425();

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lwr;")
    private class450 field4366 = new class144();

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public int field4367 = 3;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Z")
    private boolean field4371 = false;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public int field4368 = 8;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "[Lha;")
    private class81[] field4378 = new class81[4];

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    private int field4379 = -1;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Lbb;")
    private class270 field4369 = new class270();

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lbb;")
    private class270 field4380 = new class270();

    @OriginalMember(owner = "client!h", name = "W", descriptor = "Lbb;")
    private class270 field4381 = new class270();

    @OriginalMember(owner = "client!h", name = "X", descriptor = "Lbb;")
    private class270 field4382 = new class270();

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Lbb;")
    private class270 field4383 = new class270();

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "Lbb;")
    private class270 field4384 = new class270();

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "Lbb;")
    private class270 field4385 = new class270();

    @OriginalMember(owner = "client!h", name = "db", descriptor = "Z")
    private boolean field4388 = true;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "I")
    private int field4401 = 0;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "[F")
    private float[] field4387 = new float[4];

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
    public int field4390 = 50;

    @OriginalMember(owner = "client!h", name = "tb", descriptor = "F")
    private float field4404 = 1.0F;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
    private int field4394 = 8448;

    @OriginalMember(owner = "client!h", name = "yb", descriptor = "F")
    public float field4409 = 1.0F;

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    public int field4396 = 0;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "I")
    public int field4397 = 512;

    @OriginalMember(owner = "client!h", name = "Ub", descriptor = "I")
    private int field4431 = 0;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public int field4392 = -1;

    @OriginalMember(owner = "client!h", name = "jc", descriptor = "I")
    private int field4446 = 0;

    @OriginalMember(owner = "client!h", name = "nc", descriptor = "I")
    public int field4450 = -1;

    @OriginalMember(owner = "client!h", name = "sc", descriptor = "I")
    private int field4455 = 0;

    @OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
    public int field4408 = 512;

    @OriginalMember(owner = "client!h", name = "Fb", descriptor = "I")
    private int field4416 = 0;

    @OriginalMember(owner = "client!h", name = "Ab", descriptor = "I")
    public int field4411 = 0;

    @OriginalMember(owner = "client!h", name = "Cc", descriptor = "[F")
    public float[] field4465 = new float[4];

    @OriginalMember(owner = "client!h", name = "Hc", descriptor = "I")
    private int field4470 = 0;

    @OriginalMember(owner = "client!h", name = "oc", descriptor = "F")
    public float field4451 = 1.0F;

    @OriginalMember(owner = "client!h", name = "Bc", descriptor = "F")
    public float field4464 = 3584.0F;

    @OriginalMember(owner = "client!h", name = "hc", descriptor = "I")
    private int field4444 = -1;

    @OriginalMember(owner = "client!h", name = "Lb", descriptor = "I")
    private int field4422 = 0;

    @OriginalMember(owner = "client!h", name = "Lc", descriptor = "F")
    public float field4474 = -1.0F;

    @OriginalMember(owner = "client!h", name = "qc", descriptor = "[F")
    private float[] field4453 = new float[4];

    @OriginalMember(owner = "client!h", name = "rc", descriptor = "[F")
    private float[] field4454 = new float[16];

    @OriginalMember(owner = "client!h", name = "Sc", descriptor = "F")
    public float field4481 = 3584.0F;

    @OriginalMember(owner = "client!h", name = "Ec", descriptor = "F")
    private float field4467 = 1.0F;

    @OriginalMember(owner = "client!h", name = "Ac", descriptor = "F")
    private float field4463 = 0.0F;

    @OriginalMember(owner = "client!h", name = "Kc", descriptor = "F")
    public float field4473 = -1.0F;

    @OriginalMember(owner = "client!h", name = "Nc", descriptor = "I")
    public int field4476 = -1;

    @OriginalMember(owner = "client!h", name = "Jc", descriptor = "F")
    public float field4472 = 1.0F;

    @OriginalMember(owner = "client!h", name = "Oc", descriptor = "I")
    public int field4477 = 3584;

    @OriginalMember(owner = "client!h", name = "Vc", descriptor = "I")
    private int field4484 = -1;

    @OriginalMember(owner = "client!h", name = "Uc", descriptor = "I")
    private int field4483 = 8448;

    @OriginalMember(owner = "client!h", name = "Kb", descriptor = "[F")
    private float[] field4421 = new float[4];

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4359;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lgd;")
    public class172 field4355;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Ljaggl/context;")
    private context field4353;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Ljaggl/opengl;")
    public opengl field4363;

    @OriginalMember(owner = "client!h", name = "lc", descriptor = "Z")
    public boolean field4448;

    @OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!h", name = "Xb", descriptor = "Ljava/lang/String;")
    private String field4434;

    @OriginalMember(owner = "client!h", name = "Fc", descriptor = "Ljava/lang/String;")
    private String field4468;

    @OriginalMember(owner = "client!h", name = "vc", descriptor = "Z")
    private boolean field4458;

    @OriginalMember(owner = "client!h", name = "Db", descriptor = "Z")
    public boolean field4414;

    @OriginalMember(owner = "client!h", name = "dc", descriptor = "Z")
    public boolean field4440;

    @OriginalMember(owner = "client!h", name = "Mc", descriptor = "Z")
    public boolean field4475;

    @OriginalMember(owner = "client!h", name = "wc", descriptor = "Z")
    private boolean field4459;

    @OriginalMember(owner = "client!h", name = "ub", descriptor = "Z")
    public boolean field4405;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lag;")
    public class305 field4354;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Lin;")
    private class145 field4357;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Lre;")
    private class409 field4362;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Lwg;")
    private class37 field4361;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[F")
    private static float[] field4356 = new float[4];

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    private static int[] field4360 = new int[1000];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4358 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "[F")
    private static float[] field4365 = new float[4];

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "F")
    private float field4389;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "F")
    private float field4393;

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "F")
    public float field4398;

    @OriginalMember(owner = "client!h", name = "sb", descriptor = "F")
    public float field4403;

    @OriginalMember(owner = "client!h", name = "zb", descriptor = "F")
    public float field4410;

    @OriginalMember(owner = "client!h", name = "Cb", descriptor = "F")
    public float field4413;

    @OriginalMember(owner = "client!h", name = "Pb", descriptor = "F")
    public float field4426;

    @OriginalMember(owner = "client!h", name = "Tb", descriptor = "F")
    public float field4430;

    @OriginalMember(owner = "client!h", name = "zc", descriptor = "F")
    public float field4462;

    @OriginalMember(owner = "client!h", name = "Gc", descriptor = "F")
    private float field4469;

    @OriginalMember(owner = "client!h", name = "Xc", descriptor = "F")
    public float field4486;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    private int field4372;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!h", name = "wb", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!h", name = "Rb", descriptor = "I")
    private int field4428;

    @OriginalMember(owner = "client!h", name = "Wb", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!h", name = "Yb", descriptor = "I")
    private int field4435;

    @OriginalMember(owner = "client!h", name = "cc", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!h", name = "ec", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!h", name = "ic", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!h", name = "pc", descriptor = "I")
    private int field4452;

    @OriginalMember(owner = "client!h", name = "Ic", descriptor = "I")
    private int field4471;

    @OriginalMember(owner = "client!h", name = "Rc", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!h", name = "Zc", descriptor = "I")
    private int field4488;

    @OriginalMember(owner = "client!h", name = "ad", descriptor = "I")
    private int field4489;

    @OriginalMember(owner = "client!h", name = "Eb", descriptor = "J")
    private long field4415;

    @OriginalMember(owner = "client!h", name = "tc", descriptor = "Ldg;")
    private class10 field4456;

    @OriginalMember(owner = "client!h", name = "Sb", descriptor = "Lng;")
    public class144 field4429;

    @OriginalMember(owner = "client!h", name = "yc", descriptor = "Lng;")
    public class144 field4461;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "Lks;")
    private class19 field4386;

    @OriginalMember(owner = "client!h", name = "Hb", descriptor = "Lkr;")
    public class230 field4418;

    @OriginalMember(owner = "client!h", name = "Ob", descriptor = "Lkr;")
    public class230 field4425;

    @OriginalMember(owner = "client!h", name = "Zb", descriptor = "Lkr;")
    public class230 field4436;

    @OriginalMember(owner = "client!h", name = "ac", descriptor = "Lkr;")
    public class230 field4437;

    @OriginalMember(owner = "client!h", name = "Pc", descriptor = "Lkr;")
    public class230 field4478;

    @OriginalMember(owner = "client!h", name = "Tc", descriptor = "Lkr;")
    public class230 field4482;

    @OriginalMember(owner = "client!h", name = "bc", descriptor = "Lao;")
    public class260 field4438;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "Lbj;")
    public class313 field4402;

    @OriginalMember(owner = "client!h", name = "mc", descriptor = "Lbj;")
    public class313 field4449;

    @OriginalMember(owner = "client!h", name = "xc", descriptor = "Lbj;")
    public class313 field4460;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "Lvi;")
    private class408 field4391;

    @OriginalMember(owner = "client!h", name = "kc", descriptor = "Lva;")
    private class415 field4447;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Lha;")
    private class81 field4374;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "Z")
    private boolean field4395;

    @OriginalMember(owner = "client!h", name = "Bb", descriptor = "Z")
    private boolean field4412;

    @OriginalMember(owner = "client!h", name = "Ib", descriptor = "Z")
    private boolean field4419;

    @OriginalMember(owner = "client!h", name = "Jb", descriptor = "Z")
    private boolean field4420;

    @OriginalMember(owner = "client!h", name = "Mb", descriptor = "Z")
    private boolean field4423;

    @OriginalMember(owner = "client!h", name = "Nb", descriptor = "Z")
    public boolean field4424;

    @OriginalMember(owner = "client!h", name = "Qb", descriptor = "Z")
    private boolean field4427;

    @OriginalMember(owner = "client!h", name = "Vb", descriptor = "Z")
    private boolean field4432;

    @OriginalMember(owner = "client!h", name = "fc", descriptor = "Z")
    private boolean field4442;

    @OriginalMember(owner = "client!h", name = "gc", descriptor = "Z")
    public boolean field4443;

    @OriginalMember(owner = "client!h", name = "uc", descriptor = "Z")
    public boolean field4457;

    @OriginalMember(owner = "client!h", name = "Dc", descriptor = "Z")
    private boolean field4466;

    @OriginalMember(owner = "client!h", name = "Qc", descriptor = "Z")
    private boolean field4479;

    @OriginalMember(owner = "client!h", name = "Wc", descriptor = "Z")
    public boolean field4485;

    @OriginalMember(owner = "client!h", name = "Yc", descriptor = "Z")
    public boolean field4487;

    @OriginalMember(owner = "client!h", name = "Gb", descriptor = "[Lsd;")
    private class233[] field4417;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "()V", line = 8)
    public final void method776() {
        this.field4377 = this.field4359.getWidth();
        this.field4376 = this.field4359.getHeight();
        this.field4363.glViewport(this.field4422, this.field4416, this.field4377, this.field4376);
        this.method2069();
        this.method732();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 17)
    public final void method728(int arg0) {
        this.method2092(0);
        this.field4363.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4363.glClear(16384);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(II)V", line = 24)
    public final void method2048(int arg0, int arg1) {
        this.field4422 = arg0;
        this.field4416 = arg1;
        this.field4363.glViewport(arg0, arg1, this.field4377, this.field4376);
        this.method2107();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IZ)V", line = 30)
    public final void method2049(int arg0, boolean arg1) {
        this.method2100(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V", line = 35)
    public final void method750(int arg0, int arg1) {
        if (this.field4390 == arg0 && this.field4477 == arg1) {
            return;
        }
        this.field4390 = arg0;
        this.field4477 = arg1;
        this.method2091();
        this.method2079();
        if (this.field4439 == 3) {
            this.method2101();
        } else if (this.field4439 == 2) {
            this.method2104();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lge;Lsk;Lwr;[Lfi;I)V", line = 52)
    public final void method720(class386[] arg0, class291 arg1, class450 arg2, class34[] arg3, int arg4) {
        this.method746(arg0, arg2, arg3, arg4);
        this.method738(arg1);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(II)V", line = 57)
    public final synchronized void method2050(int arg0, int arg1) {
        class369 var3 = new class369(arg1);
        var3.field505 = (long) arg0;
        this.field4380.method1696(false, var3);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Z)V", line = 62)
    public final void method2051(boolean arg0) {
        if (this.field4420 != arg0) {
            this.field4420 = arg0;
            this.method2068();
            this.field4445 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lva;)V", line = 71)
    public final void method2052(class415 arg0) {
        if (this.field4447 != arg0 && this.field4458) {
            this.field4363.glBindBufferARB(34962, arg0.method49());
            this.field4447 = arg0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lks;III)V", line = 81)
    public final void method2053(class19 arg0, int arg1, int arg2, int arg3) {
        this.method2099(arg0);
        arg0.method117(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lsk;)V", line = 89)
    public final void method738(class291 arg0) {
        this.field4364.method2602(this, arg0);
    }

    @OriginalMember(owner = "client!h", name = "M", descriptor = "()V", line = 92)
    private final void method2054() {
        this.field4363.glLoadIdentity();
        this.field4363.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4363.glMultMatrixf(this.field4429.method925(96), 0);
        this.method2081();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)V", line = 104)
    public final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2060();
        this.method2092(arg5);
        this.field4363.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4363.glBegin(2);
        this.field4363.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4363.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4363.glEnd();
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V", line = 113)
    public final void method2055(int arg0) {
        field4365[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4365[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4365[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4365[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4363.glTexEnvfv(8960, 8705, field4365, 0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FF)V", line = 123)
    public final void method773(float arg0, float arg1) {
        if (this.field4398 == arg0 && this.field4486 == arg1) {
            return;
        }
        this.field4398 = arg0;
        this.field4486 = arg1;
        this.method2061();
        if (this.field4439 == 3) {
            this.method2101();
        } else if (this.field4439 == 2) {
            this.method2104();
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(II)V", line = 140)
    public final void method2056(int arg0, int arg1) {
        if (this.field4435 != 0) {
            this.field4363.glTexEnvi(8960, 34161, arg0);
            this.field4363.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4394 != arg0) {
            this.field4363.glTexEnvi(8960, 34161, arg0);
            this.field4394 = arg0;
            var3 = true;
        }
        if (this.field4483 != arg1) {
            this.field4363.glTexEnvi(8960, 34162, arg1);
            this.field4483 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4445 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!h", name = "N", descriptor = "()V", line = 172)
    public final void method2057() {
        if (this.field4445 == 4) {
            return;
        }
        this.method2086();
        this.method2113(false);
        this.method2051(false);
        this.method2063(false);
        this.method2082(false);
        this.method2059(-2);
        this.method2092(1);
        this.method2083(1);
        this.field4445 = 4;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(F)V", line = 187)
    public final void method2058(float arg0) {
        if (this.field4467 != arg0) {
            this.field4467 = arg0;
            if (this.field4439 == 3) {
                this.method2101();
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(I)V", line = 197)
    public final void method2059(int arg0) {
        this.method2049(arg0, true);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()Z", line = 202)
    public final boolean method692() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "O", descriptor = "()V", line = 205)
    private final void method2060() {
        if (this.field4445 == 1) {
            return;
        }
        this.method2086();
        this.method2113(false);
        this.method2051(false);
        this.method2063(false);
        this.method2082(false);
        this.method2088((class233) null);
        this.method2059(-2);
        this.method2083(0);
        this.field4445 = 1;
    }

    @OriginalMember(owner = "client!h", name = "P", descriptor = "()V", line = 220)
    private final void method2061() {
        if (this.field4486 == 0.0F) {
            this.field4454[10] = this.field4393;
            this.field4454[14] = this.field4469;
        } else {
            float var1 = this.field4398 / (this.field4486 + this.field4398);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4469 * (1.0F - var1) / this.field4486;
            this.field4454[10] = this.field4393 + var3;
            this.field4454[14] = this.field4469 * var2;
        }
        this.field4464 = (this.field4454[14] - (float) this.field4477) / this.field4454[10];
        this.field4481 = (float) this.field4477 - this.field4486;
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "(I)I", line = 246)
    public final int method2062(int arg0) {
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
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(Z)V", line = 280)
    public final void method2063(boolean arg0) {
        if (this.field4442 == arg0) {
            return;
        }
        if (arg0) {
            this.field4363.glEnable(2929);
        } else {
            this.field4363.glDisable(2929);
        }
        this.field4442 = arg0;
        this.field4445 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V", line = 295)
    public final void method686(int arg0, int arg1, int arg2) {
        this.field4487 = true;
        this.field4444 = arg1;
        this.field4476 = arg2;
        this.method2079();
        this.method2071();
        this.field4357.method942(3, false, false, -91);
        this.field4357.method941(arg0, (byte) -112, true);
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(I)I", line = 304)
    public final int method2064(int arg0) {
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

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 321)
    public final void method510() {
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()V", line = 325)
    public final void method727() {
        this.field4362.method2535();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lsi;)V", line = 334)
    public final void method784(int arg0, class92[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class92 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4356[0] = (float) var4.field1073;
            field4356[1] = (float) var4.field1072;
            field4356[2] = (float) var4.field1071;
            field4356[3] = 1.0F;
            this.field4363.glLightfv(var5, 4611, field4356, 0);
            int var6 = var4.field1078;
            float var7 = var4.field1075 / 255.0F;
            field4356[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4356[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4356[2] = (float) (var6 & 0xFF) * var7;
            this.field4363.glLightfv(var5, 4609, field4356, 0);
            this.field4363.glLightf(var5, 4617, 1.0F / (float) (var4.field1076 * var4.field1076));
            this.field4363.glEnable(var5);
        }
        while (var3 < this.field4431) {
            this.field4363.glDisable(var3 + 16386);
            var3++;
        }
        this.field4431 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "()V", line = 372)
    private final void method2065() {
        try {
            this.field4353.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(III)V", line = 381)
    public final void method2066(int arg0, int arg1, int arg2) {
        this.field4363.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4363.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()V", line = 386)
    public final void method730() {
        if (this.field4363 != null) {
            try {
                this.field4362.method2542();
            } catch (Throwable var4) {
            }
            this.field4363 = null;
        }
        if (this.field4353 != null) {
            this.method2065();
            try {
                this.field4353.destroy();
            } catch (Throwable var3) {
            }
            this.field4353 = null;
        }
        if (this.field4371) {
            class365.method2297((byte) 57, true, true);
            this.field4371 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(II)V", line = 419)
    public final synchronized void method2067(int arg0, int arg1) {
        class369 var3 = new class369(arg1);
        var3.field505 = (long) arg0;
        this.field4382.method1696(false, var3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILem;II)V", line = 428)
    public final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class423 arg6, int arg7, int arg8) {
        class100 var10 = (class100) arg6;
        class10 var11 = var10.field1172;
        this.method2094();
        this.method2088(var10.field1172);
        this.method2092(arg5);
        this.method2056(7681, 8448);
        this.method2077(0, 34167, 768);
        float var12 = var11.field126 / (float) var11.field127;
        float var13 = var11.field128 / (float) var11.field125;
        this.field4363.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4363.glBegin(1);
        this.field4363.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4363.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4363.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4363.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4363.glEnd();
        this.method2077(0, 5890, 768);
    }

    @OriginalMember(owner = "client!h", name = "R", descriptor = "()V", line = 450)
    private final void method2068() {
        if (this.field4420 && !this.field4412) {
            this.field4363.glEnable(2896);
        } else {
            this.field4363.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIII)V", line = 459)
    public final void method774(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4377) {
            arg2 = this.field4377;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4376) {
            arg3 = this.field4376;
        }
        this.field4446 = arg0;
        this.field4470 = arg1;
        this.field4401 = arg2;
        this.field4455 = arg3;
        this.field4363.glEnable(3089);
        this.method2080();
        this.method2107();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lts;)V", line = 481)
    public final void method717(class33 arg0) {
        this.field4391 = (class408) arg0;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(IIII)V", line = 486)
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        this.field4396 = arg0;
        this.field4411 = arg1;
        this.field4397 = arg2;
        this.field4408 = arg3;
        this.method2091();
        this.method2080();
        if (this.field4439 == 3) {
            this.method2101();
        } else if (this.field4439 == 2) {
            this.method2104();
        }
    }

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V", line = 501)
    public final void method2069() {
        if (this.field4439 != 0) {
            this.field4439 = 0;
            this.field4445 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lig;Lig;Lig;Lig;)V", line = 509)
    public final void method2070(class205 arg0, class205 arg1, class205 arg2, class205 arg3) {
        if (arg0 == null) {
            this.field4363.glDisableClientState(32884);
        } else {
            this.field4363.glEnableClientState(32884);
            arg0.method1262(-25033);
        }
        if (arg1 == null) {
            this.field4363.glDisableClientState(32885);
        } else {
            this.field4363.glEnableClientState(32885);
            arg1.method1260(228);
        }
        if (arg2 == null) {
            this.field4363.glDisableClientState(32886);
        } else {
            this.field4363.glEnableClientState(32886);
            arg2.method1261((byte) 97);
        }
        if (arg3 == null) {
            this.field4363.glDisableClientState(32888);
        } else {
            this.field4363.glEnableClientState(32888);
            arg3.method1263(-27802);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 545)
    public final void method777(float arg0, float arg1, float arg2) {
        class37.field409 = arg0;
        class37.field412 = arg1;
        class37.field402 = arg2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lem;", line = 551)
    public final class423 method786(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class100.method607(arg3, -21482, this, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!h", name = "T", descriptor = "()V", line = 561)
    private final void method2071() {
        if (this.field4419 && this.field4487 | this.field4392 >= 0) {
            this.field4363.glEnable(2912);
        } else {
            this.field4363.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()F", line = 568)
    public final float method764() {
        return this.field4486;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lng;)V", line = 571)
    public final void method2072(class144 arg0) {
        this.field4363.glPushMatrix();
        this.field4363.glMultMatrixf(arg0.method925(-25), 0);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(III)V", line = 575)
    public final void method712(int arg0, int arg1, int arg2) {
        if (!this.field4487) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4444 = arg1;
        this.field4476 = arg2;
        this.method2079();
        this.field4357.method941(arg0, (byte) -101, true);
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Z", line = 588)
    public final boolean method726() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIIII)V", line = 594)
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2060();
        this.method2092(arg5);
        this.field4363.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4395) {
            this.field4363.glDisable(32925);
        }
        this.field4363.glBegin(7);
        this.field4363.glVertex2f(var7, var8);
        this.field4363.glVertex2f(var7, var10);
        this.field4363.glVertex2f(var9, var10);
        this.field4363.glVertex2f(var9, var8);
        this.field4363.glEnd();
        if (this.field4395) {
            this.field4363.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIII)V", line = 621)
    public final void method766(int arg0, int arg1, int arg2, int arg3) {
        this.field4362.method2540(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lva;", line = 624)
    public final class415 method2073(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class415) (this.field4458 && !arg2 || this.field4459 ? new class82(this, arg0, arg1, arg2) : new class9(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(FFF)V", line = 632)
    private final void method2074(float arg0, float arg1, float arg2) {
        this.field4363.glMatrixMode(5890);
        if (this.field4427) {
            this.field4363.glLoadIdentity();
        }
        this.field4363.glTranslatef(arg0, arg1, arg2);
        this.field4363.glMatrixMode(5888);
        this.field4427 = true;
    }

    @OriginalMember(owner = "client!h", name = "U", descriptor = "()V", line = 643)
    private final void method2075() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4353.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class219.method1330(1000L, true);
        }
    }

    @OriginalMember(owner = "client!h", name = "J", descriptor = "()Z", line = 664)
    public final boolean method783() {
        return this.field4357.method939(false, 3);
    }

    @OriginalMember(owner = "client!h", name = "V", descriptor = "()V", line = 667)
    private final void method2076() {
        if (this.field4439 != 3) {
            this.field4439 = 3;
            this.method2101();
            this.method2054();
            this.field4445 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()Z", line = 677)
    public final boolean method781() {
        return this.field4395;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(III)V", line = 681)
    public final void method2077(int arg0, int arg1, int arg2) {
        this.field4363.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4363.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwr;)V", line = 687)
    public final void method749(class450 arg0) {
        this.field4429 = (class144) arg0;
        this.field4461.method927((byte) -111, this.field4429);
        if (this.field4439 != 1) {
            this.method2054();
        }
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()Z", line = 694)
    public final boolean method770() {
        return !this.field4423;
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()V", line = 699)
    public final void method725() {
        this.method2082(true);
        this.field4363.glClear(256);
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()Z", line = 704)
    public final boolean method761() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILem;II)V", line = 709)
    public final void method704(int arg0, class423 arg1, int arg2, int arg3) {
        class100 var5 = (class100) arg1;
        class10 var6 = var5.field1172;
        this.method2094();
        this.method2088(var5.field1172);
        this.method2092(1);
        this.method2056(7681, 8448);
        this.method2077(0, 34167, 768);
        float var7 = var6.field126 / (float) var6.field127;
        float var8 = var6.field128 / (float) var6.field125;
        this.field4363.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4363.glBegin(7);
        this.field4363.glTexCoord2f((float) (this.field4446 - arg2) * var7, (float) (this.field4470 - arg3) * var8);
        this.field4363.glVertex2i(this.field4446, this.field4470);
        this.field4363.glTexCoord2f((float) (this.field4446 - arg2) * var7, (float) (this.field4455 - arg3) * var8);
        this.field4363.glVertex2i(this.field4446, this.field4455);
        this.field4363.glTexCoord2f((float) (this.field4401 - arg2) * var7, (float) (this.field4455 - arg3) * var8);
        this.field4363.glVertex2i(this.field4401, this.field4455);
        this.field4363.glTexCoord2f((float) (this.field4401 - arg2) * var7, (float) (this.field4470 - arg3) * var8);
        this.field4363.glVertex2i(this.field4401, this.field4470);
        this.field4363.glEnd();
        this.method2077(0, 5890, 768);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Liq;Z)Lc;", line = 736)
    public final class436 method697(class132 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field1509 * arg0.field1507];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1501 == null) {
            for (int var8 = 0; var8 < arg0.field1509; var8++) {
                for (int var9 = 0; var9 < arg0.field1507; var9++) {
                    int var10 = arg0.field1505[arg0.field1503[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field1509; var6++) {
                for (int var7 = 0; var7 < arg0.field1507; var7++) {
                    var3[var5++] = arg0.field1501[var4] << 24 | arg0.field1505[arg0.field1503[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class436 var11 = this.method703(var3, 0, arg0.field1507, arg0.field1507, arg0.field1509);
        var11.method232(arg0.field1506, arg0.field1508, arg0.field1502, arg0.field1504);
        return var11;
    }

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()V", line = 792)
    private final void method2078() {
        this.field4363.glDepthMask(this.field4479 && this.field4388);
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()Z", line = 796)
    public final boolean method740() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "X", descriptor = "()V", line = 803)
    private final void method2079() {
        int var1;
        if (this.field4487) {
            this.field4363.glFogf(2915, 0.0F);
            this.field4363.glFogf(2916, 1.0F);
            var1 = this.field4444;
        } else {
            this.field4389 = (float) (this.field4477 - 256) - this.field4463;
            this.field4430 = this.field4389 - (float) this.field4392 * this.field4404;
            if (this.field4430 < (float) this.field4390) {
                this.field4430 = (float) this.field4390;
            }
            this.field4363.glFogf(2915, this.field4430);
            this.field4363.glFogf(2916, this.field4389);
            var1 = this.field4450;
        }
        field4365[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4365[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4365[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4363.glFogfv(2918, field4365, 0);
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Lwr;", line = 827)
    public final class450 method742() {
        return this.field4366;
    }

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "()V", line = 830)
    private final void method2080() {
        this.field4462 = (float) (this.field4446 - this.field4396);
        this.field4403 = (float) (this.field4401 - this.field4396);
        this.field4413 = (float) (this.field4470 - this.field4411);
        this.field4426 = (float) (this.field4455 - this.field4411);
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()V", line = 838)
    public final void method710() {
        this.field4357.method942(0, false, false, -45);
        this.field4487 = false;
        this.method2079();
        this.method2071();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lge;Lsk;Lwr;Lfi;I)V", line = 844)
    public final void method729(class386 arg0, class291 arg1, class450 arg2, class34 arg3, int arg4) {
        arg0.method1441(arg2, arg3, arg4);
        this.method738(arg1);
    }

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "()V", line = 849)
    public final void method2081() {
        this.field4363.glLightfv(16384, 4611, this.field4465, 0);
        this.field4363.glLightfv(16385, 4611, this.field4453, 0);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()Z", line = 853)
    public final boolean method689() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lip;", line = 856)
    public final class279 method715(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class377(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 862)
    public final synchronized void method706(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4380.method1698(0)) {
            class369 var4 = (class369) this.field4380.method1688(110);
            field4360[var2++] = (int) var4.field505;
            this.field4375 -= var4.field5032;
            if (var2 == 1000) {
                this.field4363.glDeleteBuffersARB(var2, field4360, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4363.glDeleteBuffersARB(var2, field4360, 0);
            var2 = 0;
        }
        while (!this.field4381.method1698(0)) {
            class369 var5 = (class369) this.field4381.method1688(124);
            field4360[var2++] = (int) var5.field505;
            this.field4370 -= var5.field5032;
            if (var2 == 1000) {
                this.field4363.glDeleteTextures(var2, field4360, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4363.glDeleteTextures(var2, field4360, 0);
            var2 = 0;
        }
        while (!this.field4382.method1698(0)) {
            class369 var6 = (class369) this.field4382.method1688(117);
            field4360[var2++] = var6.field5032;
            if (var2 == 1000) {
                this.field4363.glDeleteFramebuffersEXT(var2, field4360, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4363.glDeleteFramebuffersEXT(var2, field4360, 0);
            var2 = 0;
        }
        while (!this.field4383.method1698(0)) {
            class369 var7 = (class369) this.field4383.method1688(111);
            field4360[var2++] = (int) var7.field505;
            this.field4372 -= var7.field5032;
            if (var2 == 1000) {
                this.field4363.glDeleteRenderbuffersEXT(var2, field4360, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4363.glDeleteRenderbuffersEXT(var2, field4360, 0);
            var2 = 0;
        }
        while (!this.field4384.method1698(0)) {
            class369 var8 = (class369) this.field4384.method1688(108);
            field4360[var2++] = (int) var8.field505;
            if (var2 == 1000) {
                this.field4363.glDeleteProgramsARB(var2, field4360, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4363.glDeleteProgramsARB(var2, field4360, 0);
            boolean var9 = false;
        }
        while (!this.field4369.method1698(0)) {
            class369 var10 = (class369) this.field4369.method1688(118);
            this.field4363.glDeleteLists((int) var10.field505, var10.field5032);
        }
        while (!this.field4385.method1698(0)) {
            class369 var11 = (class369) this.field4385.method1688(108);
            this.field4363.glDeleteObjectARB(var11.field5032);
        }
        while (!this.field4369.method1698(0)) {
            class369 var12 = (class369) this.field4369.method1688(114);
            this.field4363.glDeleteLists((int) var12.field505, var12.field5032);
        }
        if (this.method775() > 100663296 && class164.method1038(8635) > this.field4415 + 60000L) {
            System.gc();
            this.field4415 = class164.method1038(8635);
        }
        this.field4373 = var3;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(IIIIII)Z", line = 1029)
    public final boolean method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4429.field1692 + (float) arg0 * this.field4429.field1698 + (float) arg1 * this.field4429.field1694 + this.field4429.field1693;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4429.field1692 + (float) arg3 * this.field4429.field1698 + (float) arg4 * this.field4429.field1694 + this.field4429.field1693;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4390) || !(var8 < (float) this.field4390)) || !(!(var7 > (float) this.field4477) || !(var8 > (float) this.field4477))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4429.field1695 + (float) arg0 * this.field4429.field1696 + (float) arg1 * this.field4429.field1699 + this.field4429.field1691) * (float) this.field4397 / var7);
        int var10 = (int) (((float) arg5 * this.field4429.field1695 + (float) arg3 * this.field4429.field1696 + (float) arg4 * this.field4429.field1699 + this.field4429.field1691) * (float) this.field4397 / var8);
        if ((float) var9 < this.field4462 && (float) var10 < this.field4462 || (float) var9 > this.field4403 && (float) var10 > this.field4403) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4429.field1687 + (float) arg0 * this.field4429.field1689 + (float) arg1 * this.field4429.field1697 + this.field4429.field1688) * (float) this.field4408 / var7);
            int var12 = (int) (((float) arg5 * this.field4429.field1687 + (float) arg3 * this.field4429.field1689 + (float) arg4 * this.field4429.field1697 + this.field4429.field1688) * (float) this.field4408 / var8);
            return (!((float) var11 < this.field4413) || !((float) var12 < this.field4413)) && (!((float) var11 > this.field4426) || !((float) var12 > this.field4426));
        }
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()I", line = 1058)
    public final int method751() {
        return this.field4477;
    }

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F", line = 1065)
    public final float method760() {
        return this.field4398;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(Z)V", line = 1068)
    public final void method2082(boolean arg0) {
        if (this.field4479 != arg0) {
            this.field4479 = arg0;
            this.method2078();
            this.field4445 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(I)V", line = 1079)
    public final void method2083(int arg0) {
        if (arg0 == 0) {
            this.method2056(7681, 7681);
        } else if (arg0 == 1) {
            this.method2056(8448, 8448);
        } else if (arg0 == 2) {
            this.method2056(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "()Lha;", line = 1093)
    public final class81 method2084() {
        return this.field4374;
    }

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "()V", line = 1096)
    public final void method2085() {
        this.field4363.glPopMatrix();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIII)V", line = 1101)
    public final void method768(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4446 < arg0) {
            this.field4446 = arg0;
        }
        if (this.field4401 > arg2) {
            this.field4401 = arg2;
        }
        if (this.field4470 < arg1) {
            this.field4470 = arg1;
        }
        if (this.field4455 > arg3) {
            this.field4455 = arg3;
        }
        this.field4363.glEnable(3089);
        this.method2080();
        this.method2107();
    }

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "()V", line = 1126)
    private final void method2086() {
        if (this.field4439 == 1) {
            return;
        }
        this.field4363.glMatrixMode(5889);
        this.field4363.glLoadIdentity();
        if (this.field4377 > 0 && this.field4376 > 0) {
            this.field4363.glOrtho(0.0D, (double) this.field4377, (double) this.field4376, 0.0D, -1.0D, 1.0D);
        }
        this.field4363.glMatrixMode(5888);
        this.field4363.glLoadIdentity();
        this.field4439 = 1;
        this.field4445 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V", line = 1144)
    public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2060();
        this.method2092(arg5);
        this.field4363.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4395) {
            this.field4363.glDisable(32925);
        }
        this.field4363.glBegin(2);
        this.field4363.glVertex2f(var7, var8);
        this.field4363.glVertex2f(var7, var10);
        this.field4363.glVertex2f(var9, var10);
        this.field4363.glVertex2f(var9, var8);
        this.field4363.glEnd();
        if (this.field4395) {
            this.field4363.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "(I)V", line = 1169)
    public final synchronized void method2087(int arg0) {
        class369 var2 = new class369(arg0);
        this.field4382.method1696(false, var2);
    }

    @OriginalMember(owner = "client!h", name = "K", descriptor = "()Z", line = 1173)
    public final boolean method785() {
        return this.field4361.method239();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lsd;)V", line = 1179)
    public final void method2088(class233 arg0) {
        class233 var2 = this.field4417[this.field4435];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4363.glDisable(var2.field3058);
            } else {
                if (var2 == null) {
                    this.field4363.glEnable(arg0.field3058);
                } else if (arg0.field3058 != var2.field3058) {
                    this.field4363.glDisable(var2.field3058);
                    this.field4363.glEnable(arg0.field3058);
                }
                this.field4363.glBindTexture(arg0.field3058, arg0.method1500());
            }
            this.field4417[this.field4435] = arg0;
        }
        this.field4445 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!h", name = "db", descriptor = "()V", line = 1209)
    private final void method2089() {
        field4365[0] = this.field4474 * this.field4451;
        field4365[1] = this.field4474 * this.field4472;
        field4365[2] = this.field4474 * this.field4409;
        field4365[3] = 1.0F;
        this.field4363.glLightfv(16384, 4609, field4365, 0);
        field4365[0] = -this.field4473 * this.field4451;
        field4365[1] = -this.field4473 * this.field4472;
        field4365[2] = -this.field4473 * this.field4409;
        field4365[3] = 1.0F;
        this.field4363.glLightfv(16385, 4609, field4365, 0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1222)
    public final void method693(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([I)V", line = 1225)
    public final void method722(int[] arg0) {
        arg0[0] = this.field4446;
        arg0[1] = this.field4470;
        arg0[2] = this.field4401;
        arg0[3] = this.field4455;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)Lac;", line = 1231)
    public final class197 method758(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(FF)V", line = 1234)
    public final void method2090(float arg0, float arg1) {
        this.field4404 = arg0;
        this.field4463 = arg1;
        if (!this.field4487) {
            this.method2079();
        }
    }

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "()V", line = 1244)
    private final void method2091() {
        float[] var1 = this.field4454;
        float var2 = (float) (-this.field4396 * this.field4390) / (float) this.field4397;
        float var3 = (float) ((this.field4377 - this.field4396) * this.field4390) / (float) this.field4397;
        float var4 = (float) (this.field4411 * this.field4390) / (float) this.field4408;
        float var5 = (float) ((this.field4411 - this.field4376) * this.field4390) / (float) this.field4408;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field4390 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field4393 = (float) (-(this.field4477 + this.field4390)) / (float) (this.field4477 - this.field4390);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field4469 = -((float) this.field4477 * var6) / (float) (this.field4477 - this.field4390);
            var1[15] = 0.0F;
        }
        this.method2061();
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(I)V", line = 1298)
    public final void method2092(int arg0) {
        if (this.field4452 == arg0) {
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
        if (this.field4432 != var3) {
            this.field4363.glColorMask(var3, var3, var3, true);
            this.field4432 = var3;
        }
        if (this.field4466 != var4) {
            if (var4) {
                this.field4363.glEnable(3008);
            } else {
                this.field4363.glDisable(3008);
            }
            this.field4466 = var4;
        }
        if (this.field4441 != var2) {
            if (var2 == 1) {
                this.field4363.glEnable(3042);
                this.field4363.glBlendEquation(32774);
                this.field4363.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4363.glEnable(3042);
                this.field4363.glBlendEquation(32774);
                this.field4363.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4363.glEnable(3042);
                this.field4363.glBlendEquation(32778);
                this.field4363.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4363.glEnable(3042);
                this.field4363.glBlendEquation(32774);
                this.field4363.glBlendFunc(774, 1);
            } else {
                this.field4363.glDisable(3042);
            }
            this.field4441 = var2;
        }
        this.field4452 = arg0;
        this.field4445 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "(I)I", line = 1408)
    public final int method2093(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lts;Lts;FLts;)Lts;", line = 1420)
    public final class33 method687(class33 arg0, class33 arg1, float arg2, class33 arg3) {
        if (arg0 != null && arg1 != null && this.field4424 && this.field4405) {
            class182 var5 = null;
            class408 var6 = (class408) arg0;
            class408 var7 = (class408) arg1;
            class254 var8 = var6.method1137(49);
            class254 var9 = var7.method1137(-127);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3308 > var9.field3308 ? var8.field3308 : var9.field3308;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class182) {
                    class182 var11 = (class182) arg3;
                    if (var11.method1136(true) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class182(this, var10);
                }
                var5.method1138(arg2, -30961, var9, var8);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()V", line = 1462)
    public final void method757() {
        try {
            this.field4353.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lge;Lwr;[Lfi;I)V", line = 1473)
    public final void method746(class386[] arg0, class450 arg1, class34[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1441(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 1484)
    public final void method744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V", line = 1489)
    public final void method732() {
        this.field4446 = 0;
        this.field4470 = 0;
        this.field4401 = this.field4377;
        this.field4455 = this.field4376;
        this.field4363.glDisable(3089);
        this.method2080();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IFFFFF)V", line = 1501)
    public final void method737(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4484 != arg0;
        if (var7 || this.field4474 != arg1 || this.field4473 != arg2) {
            this.field4484 = arg0;
            this.field4474 = arg1;
            this.field4473 = arg2;
            if (var7) {
                this.field4451 = (float) (this.field4484 & 0xFF0000) / 1.671168E7F;
                this.field4472 = (float) (this.field4484 & 0xFFFF) / 65535.0F;
                this.field4409 = (float) (this.field4484 & 0xFF) / 255.0F;
                this.method2098();
            }
            this.method2089();
        }
        if (this.field4421[0] == arg3 && this.field4421[1] == arg4 && this.field4421[2] == arg5) {
            return;
        }
        this.field4421[0] = arg3;
        this.field4421[1] = arg4;
        this.field4421[2] = arg5;
        this.field4387[0] = -arg3;
        this.field4387[1] = -arg4;
        this.field4387[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4465[0] = arg3 * var8;
        this.field4465[1] = arg4 * var8;
        this.field4465[2] = arg5 * var8;
        this.field4453[0] = -this.field4465[0];
        this.field4453[1] = -this.field4465[1];
        this.field4453[2] = -this.field4465[2];
        this.method2081();
        this.field4407 = (int) (arg3 * 256.0F / arg4);
        this.field4433 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(II)V", line = 1547)
    public final void method752(int arg0, int arg1) {
        if (this.field4450 == arg0 && this.field4392 == arg1) {
            return;
        }
        this.field4450 = arg0;
        this.field4392 = arg1;
        if (!this.field4487) {
            this.method2079();
            this.method2071();
        }
    }

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "()V", line = 1561)
    public final void method2094() {
        if (this.field4445 == 2) {
            return;
        }
        this.method2086();
        this.method2113(false);
        this.method2051(false);
        this.method2063(false);
        this.method2082(false);
        this.method2059(-2);
        this.field4445 = 2;
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()V", line = 1576)
    public final void method765() {
        if (this.field4377 <= 0 && this.field4376 <= 0) {
            return;
        }
        int var1 = this.field4446;
        int var2 = this.field4401;
        int var3 = this.field4470;
        int var4 = this.field4455;
        this.method732();
        this.field4363.glReadBuffer(1028);
        this.field4363.glDrawBuffer(1029);
        this.method2069();
        this.method2113(false);
        this.method2051(false);
        this.method2063(false);
        this.method2082(false);
        this.method2088((class233) null);
        this.method2059(-2);
        this.method2083(0);
        this.method2092(0);
        this.field4363.glMatrixMode(5889);
        this.field4363.glLoadIdentity();
        this.field4363.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4363.glMatrixMode(5888);
        this.field4363.glLoadIdentity();
        this.field4363.glRasterPos2i(0, 0);
        this.field4363.glCopyPixels(0, 0, this.field4377, this.field4376, 6144);
        this.field4363.glFlush();
        this.field4363.glReadBuffer(1029);
        this.field4363.glDrawBuffer(1029);
        this.method774(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()Z", line = 1612)
    public final boolean method708() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "()V", line = 1616)
    private final void method2095() {
        this.field4429 = new class144();
        this.field4461 = new class144();
        this.field4417 = new class233[this.field4400];
        this.field4449 = new class313(this, 3553, 6408, 1, 1);
        this.field4460 = new class313(this, 3553, 6408, 1, 1);
        this.field4402 = new class313(this, 3553, 6408, 1, 1);
        this.field4436 = new class230(this);
        this.field4425 = new class230(this);
        this.field4418 = new class230(this);
        this.field4478 = new class230(this);
        this.field4482 = new class230(this);
        this.field4437 = new class230(this);
        if (this.field4405) {
            this.field4438 = new class260(this);
        }
        this.field4364.method2601(this);
    }

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "()V", line = 1636)
    public final void method2096() {
        if (this.field4439 != 2) {
            this.field4439 = 2;
            this.method2104();
            this.method2054();
            this.field4445 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "(I)V", line = 1651)
    public final synchronized void method2097(int arg0) {
        class369 var2 = new class369(arg0);
        this.field4385.method1696(false, var2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(F)V", line = 1658)
    public final void method688(float arg0) {
        if (this.field4410 != arg0) {
            this.field4410 = arg0;
            this.method2098();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lac;)V", line = 1666)
    public final void method724(class197 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfa;[Liq;Z)Lak;", line = 1669)
    public final class31 method747(class347 arg0, class132[] arg1, boolean arg2) {
        return new class343(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 1672)
    public final void method787(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "()V", line = 1674)
    private final void method2098() {
        field4365[0] = this.field4451 * this.field4410;
        field4365[1] = this.field4472 * this.field4410;
        field4365[2] = this.field4410 * this.field4409;
        field4365[3] = 1.0F;
        this.field4363.glLightModelfv(2899, field4365, 0);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 1683)
    public final void method755(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()Z", line = 1686)
    public final boolean method711() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 1689)
    public final int method721(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lks;)V", line = 1693)
    public final void method2099(class19 arg0) {
        if (this.field4386 != arg0 && this.field4458) {
            this.field4363.glBindBufferARB(34963, arg0.method49());
            this.field4386 = arg0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZZ)V", line = 1705)
    public final void method2100(int arg0, boolean arg1, boolean arg2) {
        if (this.field4471 != arg0) {
            if (arg0 < 0) {
                this.method2114();
                this.method2088((class233) null);
                if (!this.field4487) {
                    this.field4357.method942(0, arg2, arg1, -93);
                }
            } else {
                class313 var4 = this.field4354.method1940(-120, arg0);
                class358 var5 = this.field4355.method960(arg0, (byte) -40);
                if (var5.field4853 == 0 && var5.field4850 == 0) {
                    this.method2114();
                } else {
                    int var6 = var5.field4856 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2074((float) (this.field4373 % var7 * var5.field4853) / (float) var7, (float) (this.field4373 % var7 * var5.field4850) / (float) var7, 0.0F);
                }
                if (this.field4487) {
                    this.field4357.method942(3, arg2, arg1, -71);
                    this.method2088(var4);
                } else {
                    this.field4357.method942(var5.field4859, arg2, arg1, -55);
                    this.field4357.method941(var5.field4852, (byte) -107, false);
                    if (!this.field4357.method940(var4, (byte) 100)) {
                        this.method2088(var4);
                    }
                }
            }
            this.field4471 = arg0;
        }
        this.field4445 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()V", line = 1754)
    public final void method694() {
    }

    @OriginalMember(owner = "client!h", name = "L", descriptor = "()I", line = 1756)
    public final int method788() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lc;", line = 1760)
    public final class436 method703(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class36(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "()V", line = 1765)
    private final void method2101() {
        float var1 = (float) (-this.field4396) * this.field4467 / (float) this.field4397;
        float var2 = (float) (-this.field4411) * this.field4467 / (float) this.field4408;
        float var3 = (float) (this.field4377 - this.field4396) * this.field4467 / (float) this.field4397;
        float var4 = (float) (this.field4376 - this.field4411) * this.field4467 / (float) this.field4408;
        this.field4363.glMatrixMode(5889);
        this.field4363.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field4363.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4390 - this.field4486), (double) ((float) this.field4477 - this.field4486));
        }
        this.field4363.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V", line = 1781)
    public final void method759(int arg0) {
        this.method2075();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BIZ)Lks;", line = 1785)
    public final class19 method2102(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class19) (this.field4458 && !arg3 || this.field4459 ? new class151(this, arg0, arg1, arg2, arg3) : new class155(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lha;)V", line = 1794)
    public final void method2103(class81 arg0) {
        if (this.field4379 < 0 || this.field4378[this.field4379] != arg0) {
            throw new RuntimeException();
        }
        this.field4378[this.field4379--] = null;
        arg0.method510();
        if (this.field4379 >= 0) {
            this.field4374 = this.field4378[this.field4379];
            this.field4374.method512();
        }
    }

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "()V", line = 1808)
    private final void method2104() {
        this.field4363.glMatrixMode(5889);
        this.field4363.glLoadMatrixf(this.field4454, 0);
        this.field4363.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()Z", line = 1816)
    public final boolean method762() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "E", descriptor = "()I", line = 1820)
    public final int method775() {
        return this.field4375 + this.field4370 + this.field4372;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I", line = 1823)
    public final int method707(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[BII)V", line = 1830)
    public final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4456 == null || this.field4456.field4216 < arg2 || this.field4456.field4218 < arg3) {
            this.field4456 = class10.method52(false, this, arg2, 6406, arg3, arg6, (byte) -124, 6406);
            this.field4456.method1975(false, false);
            var10 = this.field4456.field128;
            var11 = this.field4456.field126;
        } else {
            this.field4456.method1973(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4456.field128 / (float) this.field4456.field4218;
            var11 = (float) arg2 * this.field4456.field126 / (float) this.field4456.field4216;
        }
        this.method2094();
        this.method2088(this.field4456);
        this.method2092(arg8);
        this.field4363.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2055(arg5);
        this.method2056(34165, 34165);
        this.method2077(0, 34166, 768);
        this.method2077(2, 5890, 770);
        this.method2066(0, 34166, 770);
        this.method2066(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4363.glBegin(7);
        this.field4363.glTexCoord2f(0.0F, 0.0F);
        this.field4363.glVertex2f(var12, var13);
        this.field4363.glTexCoord2f(0.0F, var11);
        this.field4363.glVertex2f(var12, var15);
        this.field4363.glTexCoord2f(var10, var11);
        this.field4363.glVertex2f(var14, var15);
        this.field4363.glTexCoord2f(var10, 0.0F);
        this.field4363.glVertex2f(var14, var13);
        this.field4363.glEnd();
        this.method2077(0, 5890, 768);
        this.method2077(2, 34166, 770);
        this.method2066(0, 5890, 770);
        this.method2066(2, 34166, 770);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIII)V", line = 1880)
    public final void method709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2060();
        this.method2092(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4363.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4363.glBegin(1);
        this.field4363.glVertex2f(var6, var7);
        this.field4363.glVertex2f((float) arg2 + var6, var7);
        this.field4363.glEnd();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V", line = 1895)
    public final void method696(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2060();
        this.method2092(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4363.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4363.glBegin(1);
        this.field4363.glVertex2f(var6, var7);
        this.field4363.glVertex2f(var6, (float) arg2 + var7);
        this.field4363.glEnd();
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "(I)V", line = 1911)
    public final synchronized void method2105(int arg0) {
        class369 var2 = new class369(arg0);
        this.field4384.method1696(false, var2);
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Lwr;", line = 1917)
    public final class450 method769() {
        return new class144();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V", line = 1920)
    public final void method512() {
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Z", line = 1922)
    public final boolean method723() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I[BIZ)Lva;", line = 1925)
    public final class415 method2106(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class415) (this.field4458 && !arg3 || this.field4459 ? new class82(this, arg0, arg1, arg2, arg3) : new class9(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()I", line = 1939)
    public final int method771() {
        return this.field4390;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I", line = 1943)
    public final int method699() {
        int var1 = this.field4488;
        this.field4488 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "()V", line = 1949)
    private final void method2107() {
        if (this.field4446 <= this.field4401 && this.field4470 <= this.field4455) {
            this.field4363.glScissor(this.field4446 + this.field4422, this.field4416 + this.field4376 - this.field4455, this.field4401 - this.field4446, this.field4455 - this.field4470);
        } else {
            this.field4363.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "()V", line = 1959)
    private final void method2108() {
        this.method2059(-2);
        for (int var1 = this.field4400 - 1; var1 >= 0; var1--) {
            this.method2115(var1);
            this.method2088((class233) null);
            this.field4363.glTexEnvi(8960, 8704, 34160);
        }
        this.method2056(8448, 8448);
        this.method2077(2, 34168, 770);
        this.method2114();
        this.field4452 = 1;
        this.field4363.glEnable(3042);
        this.field4363.glBlendFunc(770, 771);
        this.field4441 = 1;
        this.field4363.glEnable(3008);
        this.field4363.glAlphaFunc(516, 0.0F);
        this.field4466 = true;
        this.field4363.glColorMask(true, true, true, true);
        this.field4432 = true;
        this.method2113(true);
        this.method2051(true);
        this.method2063(true);
        this.method2082(true);
        this.method2069();
        this.field4363.setSwapInterval(0);
        this.field4363.glShadeModel(7425);
        this.field4363.glClearDepth(1.0F);
        this.field4363.glDepthFunc(515);
        this.field4363.glPolygonMode(1028, 6914);
        this.field4363.glEnable(2884);
        this.field4363.glCullFace(1029);
        this.field4363.glMatrixMode(5888);
        this.field4363.glLoadIdentity();
        this.field4363.glColorMaterial(1028, 5634);
        this.field4363.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4363.glLightfv(var4, 4608, var2, 0);
            this.field4363.glLightf(var4, 4615, 0.0F);
            this.field4363.glLightf(var4, 4616, 0.0F);
        }
        this.field4363.glEnable(16384);
        this.field4363.glEnable(16385);
        this.field4363.glFogf(2914, 0.95F);
        this.field4363.glFogi(2917, 9729);
        this.field4363.glHint(3156, 4353);
        this.field4484 = this.field4450 = -1;
        this.method732();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2024)
    public final void method713(Rectangle[] arg0, int arg1) {
        this.method757();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFFF)V", line = 2027)
    public final void method2109(float arg0, float arg1, float arg2, float arg3) {
        field4365[0] = arg0;
        field4365[1] = arg1;
        field4365[2] = arg2;
        field4365[3] = arg3;
        this.field4363.glTexEnvfv(8960, 8705, field4365, 0);
    }

    @OriginalMember(owner = "client!h", name = "G", descriptor = "()I", line = 2035)
    public final int method778() {
        int var1 = this.field4489;
        this.field4489 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!h", name = "H", descriptor = "()Z", line = 2042)
    public final boolean method779() {
        if (!this.field4361.method94(18826)) {
            if (!this.field4362.method2538(this.field4361)) {
                return false;
            }
            this.field4354.method1939((byte) 105);
        }
        return true;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()I", line = 2055)
    public final int method511() {
        return this.field4376;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lhf;IIII)Lge;", line = 2058)
    public final class386 method701(class402 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class230(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(Z)V", line = 2062)
    public final void method2110(boolean arg0) {
        if (this.field4412 != arg0) {
            this.field4412 = arg0;
            this.method2068();
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(III)V", line = 2070)
    public final void method2111(int arg0, int arg1, int arg2) {
        this.field4363.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lc;", line = 2078)
    public final class436 method767(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class36(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "()Lhp;", line = 2081)
    public final class254 method2112() {
        return this.field4391 == null ? null : this.field4391.method1137(-125);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIII)V", line = 2086)
    public final void method719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(Z)V", line = 2090)
    public final void method2113(boolean arg0) {
        if (this.field4419 != arg0) {
            this.field4419 = arg0;
            this.method2071();
            this.field4445 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)[I", line = 2102)
    public final int[] method756(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4363.glReadPixels(arg0, this.field4376 - arg1 - var6, arg2, 1, 32993, this.field4406, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lts;", line = 2115)
    public final class33 method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4424 ? new class359(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "()V", line = 2118)
    private final void method2114() {
        if (this.field4427) {
            this.field4363.glMatrixMode(5890);
            this.field4363.glLoadIdentity();
            this.field4363.glMatrixMode(5888);
            this.field4427 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "(I)V", line = 2128)
    public final void method2115(int arg0) {
        if (this.field4435 != arg0) {
            this.field4363.glActiveTexture(arg0 + 33984);
            this.field4435 = arg0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 2138)
    public final void method690(boolean arg0) {
        this.field4388 = arg0;
        this.method2078();
    }

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "()V", line = 2146)
    public final void method2116() {
        if (this.field4445 == 8) {
            return;
        }
        this.method2096();
        this.method2113(true);
        this.method2063(true);
        this.method2082(true);
        this.method2092(1);
        this.method2083(1);
        this.field4445 = 8;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Lha;)V", line = 2159)
    public final void method2117(class81 arg0) {
        if (this.field4379 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4379 >= 0) {
            this.field4378[this.field4379].method510();
        }
        this.field4374 = this.field4378[++this.field4379] = arg0;
        this.field4374.method512();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III[I)V", line = 2170)
    public final void method718(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4429.field1692 + (float) arg0 * this.field4429.field1698 + (float) arg1 * this.field4429.field1694 + this.field4429.field1693;
        if ((var5 < (float) this.field4390) || (var5 > (float) this.field4477)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4429.field1695 + (float) arg0 * this.field4429.field1696 + (float) arg1 * this.field4429.field1699 + this.field4429.field1691) * (float) this.field4397 / var5);
        int var7 = (int) (((float) arg2 * this.field4429.field1687 + (float) arg0 * this.field4429.field1689 + (float) arg1 * this.field4429.field1697 + this.field4429.field1688) * (float) this.field4408 / var5);
        if ((float) var6 >= this.field4462 && (float) var6 <= this.field4403 && (float) var7 >= this.field4413 && (float) var7 <= this.field4426) {
            arg3[0] = (int) ((float) var6 - this.field4462);
            arg3[1] = (int) ((float) var7 - this.field4413);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()V", line = 2196)
    public final void method735() {
        if (this.field4361.method94(18826)) {
            this.field4362.method2536(this.field4361);
            this.field4354.method1939((byte) 108);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 2204)
    public final void method695(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()Z", line = 2209)
    public final boolean method714() {
        return this.field4361.method94(18826);
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(II)V", line = 2213)
    public final synchronized void method2118(int arg0, int arg1) {
        class369 var3 = new class369(arg1);
        var3.field505 = (long) arg0;
        this.field4381.method1696(false, var3);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 2219)
    public final void method743(int arg0) {
        this.method2065();
    }

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "()I", line = 2223)
    private final int method2119() {
        int var1 = 0;
        this.field4434 = this.field4363.glGetString(7936);
        this.field4468 = this.field4363.glGetString(7937);
        String var2 = this.field4434.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4363.glGetString(7938);
        String[] var4 = class349.method2225(-11337, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class366.method2311(var4[0], -73);
                int var6 = class366.method2311(var4[1], 109);
                this.field4428 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4428 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4363.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4363.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4363.glGetIntegerv(34018, var8, 0);
        this.field4400 = var8[0];
        this.field4363.glGetIntegerv(34929, var8, 0);
        this.field4399 = var8[0];
        this.field4363.glGetIntegerv(34930, var8, 0);
        this.field4480 = var8[0];
        if (this.field4400 < 2 || this.field4399 < 2 || this.field4480 < 2) {
            var1 |= 0x10;
        }
        this.field4423 = class441.field6080 != null && class441.field6080.startsWith("mac");
        this.field4448 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4458 = this.field4363.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4395 = this.field4363.isExtensionAvailable("GL_ARB_multisample");
        this.field4443 = this.field4363.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4363.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4363.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4457 = this.field4363.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4414 = this.field4363.isExtensionAvailable("GL_EXT_texture3D");
        this.field4475 = this.field4363.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4424 = this.field4363.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4440 = this.field4363.isExtensionAvailable("GL_ARB_texture_float");
        this.field4485 = false;
        this.field4405 = this.field4363.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lgd;IILnh;)V", line = 2602)
    public class327(Canvas arg0, class172 arg1, int arg2, int arg3, class441 arg4) {
        this.field4359 = arg0;
        this.field4355 = arg1;
        this.field1360 = arg2;
        int var6 = 0;
        while (!this.field4359.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class219.method1330(1000L, true);
        }
        this.field4359.setIgnoreRepaint(true);
        try {
            if (field4358 == null || !field4358) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4358 = Boolean.TRUE;
                } else {
                    class315 var7 = arg4.method2712(109, this.getClass());
                    while (var7.field4244 == 0) {
                        class219.method1330(100L, true);
                    }
                    if (var7.field4244 == 1) {
                        field4358 = Boolean.TRUE;
                    }
                }
            }
            if (field4358 == null || !field4358) {
                throw new RuntimeException("");
            }
            this.field4353 = new context();
            if (!this.field4353.choosePixelFormat(this.field4359, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4353.createContext()) {
                this.method2075();
                this.field4363 = this.field4353.getGL();
                int var8 = this.method2119();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4406 = this.field4448 ? 33639 : 5121;
                String var9 = this.field4434.toLowerCase();
                String var10 = this.field4468.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class349.method2225(-11337, ' ', var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class357.method2261(var16.substring(1, 3), 18495)) {
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
                                    if (var16.length() >= 4 && class357.method2261(var16.substring(0, 4), 18495)) {
                                        var11 = class366.method2311(var16.substring(0, 4), 127);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4458 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4414 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4440 = false;
                    }
                    this.field4475 &= this.field4363.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4459 = this.field4458;
                }
                if (var9.contains("intel")) {
                    this.field4405 = false;
                }
                if (this.field4458) {
                    try {
                        int[] var18 = new int[1];
                        this.field4363.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2117(this);
                this.method776();
                this.method2095();
                new class111(this);
                this.field4354 = new class305(this, this.field4355);
                class220.method1339(true, true, 0);
                this.field4371 = true;
                this.field4357 = new class145(this);
                this.field4362 = new class409(this);
                this.field4361 = new class37(this);
                this.method2108();
                this.field4363.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4353.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class219.method1330(100L, true);
                    }
                }
                this.field4363.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method730();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "()V", line = 2299)
    public final void method2120() {
        if (this.field4445 == 16) {
            return;
        }
        this.method2076();
        this.method2113(true);
        this.method2063(true);
        this.method2082(true);
        this.method2092(1);
        this.method2083(1);
        this.field4445 = 16;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 2319)
    public final void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4363.glLineWidth((float) arg5);
        this.method741(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4363.glLineWidth(1.0F);
    }
}
