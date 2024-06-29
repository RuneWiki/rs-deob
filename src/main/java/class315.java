import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class315 extends class313 implements class183 {

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lwa;")
    private class400 field4448 = new class400();

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "Los;")
    private class282 field4455 = new class319();

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public int field4460 = 8;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public int field4464 = 3;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    private int field4461 = -1;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Z")
    private boolean field4466 = false;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "[Lca;")
    private class183[] field4468 = new class183[4];

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "Lkr;")
    private class486 field4463 = new class486();

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Lkr;")
    private class486 field4469 = new class486();

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "Lkr;")
    private class486 field4470 = new class486();

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "Lkr;")
    private class486 field4471 = new class486();

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "Lkr;")
    private class486 field4472 = new class486();

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "Lkr;")
    private class486 field4473 = new class486();

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Lkr;")
    private class486 field4474 = new class486();

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
    public int field4483 = -1;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    private int field4481 = 0;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "[F")
    private float[] field4475 = new float[4];

    @OriginalMember(owner = "client!mi", name = "Gb", descriptor = "I")
    private int field4510 = 0;

    @OriginalMember(owner = "client!mi", name = "tb", descriptor = "[F")
    private float[] field4497 = new float[16];

    @OriginalMember(owner = "client!mi", name = "Lb", descriptor = "I")
    private int field4515 = -1;

    @OriginalMember(owner = "client!mi", name = "Ub", descriptor = "F")
    private float field4524 = 0.0F;

    @OriginalMember(owner = "client!mi", name = "jc", descriptor = "F")
    public float field4539 = 3584.0F;

    @OriginalMember(owner = "client!mi", name = "kc", descriptor = "I")
    public int field4540 = 512;

    @OriginalMember(owner = "client!mi", name = "yb", descriptor = "[F")
    public float[] field4502 = new float[4];

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    private int field4479 = 8448;

    @OriginalMember(owner = "client!mi", name = "Hb", descriptor = "I")
    public int field4511 = -1;

    @OriginalMember(owner = "client!mi", name = "Db", descriptor = "F")
    public float field4507 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "rc", descriptor = "I")
    private int field4547 = 0;

    @OriginalMember(owner = "client!mi", name = "sc", descriptor = "F")
    private float field4548 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "cc", descriptor = "F")
    private float field4532 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "Zb", descriptor = "I")
    private int field4529 = 0;

    @OriginalMember(owner = "client!mi", name = "pc", descriptor = "I")
    private int field4545 = 8448;

    @OriginalMember(owner = "client!mi", name = "vc", descriptor = "I")
    public int field4551 = 0;

    @OriginalMember(owner = "client!mi", name = "yc", descriptor = "F")
    public float field4554 = -1.0F;

    @OriginalMember(owner = "client!mi", name = "Ac", descriptor = "I")
    public int field4556 = 3584;

    @OriginalMember(owner = "client!mi", name = "qc", descriptor = "F")
    public float field4546 = 3584.0F;

    @OriginalMember(owner = "client!mi", name = "nc", descriptor = "I")
    private int field4543 = 0;

    @OriginalMember(owner = "client!mi", name = "Bc", descriptor = "I")
    public int field4557 = 50;

    @OriginalMember(owner = "client!mi", name = "zc", descriptor = "I")
    public int field4555 = -1;

    @OriginalMember(owner = "client!mi", name = "Oc", descriptor = "I")
    public int field4570 = 512;

    @OriginalMember(owner = "client!mi", name = "Ec", descriptor = "[F")
    private float[] field4560 = new float[4];

    @OriginalMember(owner = "client!mi", name = "Pc", descriptor = "F")
    public float field4571 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "ac", descriptor = "[F")
    private float[] field4530 = new float[4];

    @OriginalMember(owner = "client!mi", name = "mb", descriptor = "F")
    public float field4490 = 1.0F;

    @OriginalMember(owner = "client!mi", name = "dc", descriptor = "I")
    public int field4533 = 0;

    @OriginalMember(owner = "client!mi", name = "Kc", descriptor = "Z")
    private boolean field4566 = true;

    @OriginalMember(owner = "client!mi", name = "xb", descriptor = "I")
    private int field4501 = 0;

    @OriginalMember(owner = "client!mi", name = "oc", descriptor = "I")
    private int field4544 = 0;

    @OriginalMember(owner = "client!mi", name = "Cc", descriptor = "I")
    private int field4558 = -1;

    @OriginalMember(owner = "client!mi", name = "Lc", descriptor = "F")
    public float field4567 = -1.0F;

    @OriginalMember(owner = "client!mi", name = "Vc", descriptor = "I")
    public int field4577 = 0;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4443;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "Ljaggl/context;")
    private context field4452;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Ljaggl/opengl;")
    public opengl field4445;

    @OriginalMember(owner = "client!mi", name = "Kb", descriptor = "Z")
    public boolean field4514;

    @OriginalMember(owner = "client!mi", name = "uc", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!mi", name = "mc", descriptor = "Ljava/lang/String;")
    private String field4542;

    @OriginalMember(owner = "client!mi", name = "hc", descriptor = "Ljava/lang/String;")
    private String field4537;

    @OriginalMember(owner = "client!mi", name = "ic", descriptor = "Z")
    private boolean field4538;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "Z")
    public boolean field4476;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "Z")
    public boolean field4488;

    @OriginalMember(owner = "client!mi", name = "vb", descriptor = "Z")
    public boolean field4499;

    @OriginalMember(owner = "client!mi", name = "Gc", descriptor = "Z")
    private boolean field4562;

    @OriginalMember(owner = "client!mi", name = "Xc", descriptor = "Z")
    public boolean field4579;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Lqf;")
    public class443 field4454;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Lls;")
    private class83 field4450;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lgp;")
    private class35 field4446;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lsb;")
    private class175 field4447;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[F")
    private static float[] field4444 = new float[4];

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[F")
    private static float[] field4449 = new float[4];

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4451 = Boolean.FALSE;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "[I")
    private static int[] field4453 = new int[1000];

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "F")
    public float field4478;

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "F")
    private float field4486;

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "F")
    private float field4487;

    @OriginalMember(owner = "client!mi", name = "qb", descriptor = "F")
    public float field4494;

    @OriginalMember(owner = "client!mi", name = "rb", descriptor = "F")
    public float field4495;

    @OriginalMember(owner = "client!mi", name = "Cb", descriptor = "F")
    public float field4506;

    @OriginalMember(owner = "client!mi", name = "Eb", descriptor = "F")
    public float field4508;

    @OriginalMember(owner = "client!mi", name = "Mb", descriptor = "F")
    public float field4516;

    @OriginalMember(owner = "client!mi", name = "Ob", descriptor = "F")
    public float field4518;

    @OriginalMember(owner = "client!mi", name = "Yb", descriptor = "F")
    public float field4528;

    @OriginalMember(owner = "client!mi", name = "Qc", descriptor = "F")
    private float field4572;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    private int field4467;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "I")
    private int field4482;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!mi", name = "nb", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!mi", name = "ub", descriptor = "I")
    private int field4498;

    @OriginalMember(owner = "client!mi", name = "zb", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!mi", name = "Ib", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!mi", name = "Qb", descriptor = "I")
    private int field4520;

    @OriginalMember(owner = "client!mi", name = "Vb", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!mi", name = "fc", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!mi", name = "tc", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!mi", name = "wc", descriptor = "I")
    private int field4552;

    @OriginalMember(owner = "client!mi", name = "Nc", descriptor = "I")
    private int field4569;

    @OriginalMember(owner = "client!mi", name = "Rc", descriptor = "I")
    private int field4573;

    @OriginalMember(owner = "client!mi", name = "gc", descriptor = "J")
    private long field4536;

    @OriginalMember(owner = "client!mi", name = "wb", descriptor = "Lkh;")
    public class13 field4500;

    @OriginalMember(owner = "client!mi", name = "Ab", descriptor = "Lkh;")
    public class13 field4504;

    @OriginalMember(owner = "client!mi", name = "Pb", descriptor = "Lkh;")
    public class13 field4519;

    @OriginalMember(owner = "client!mi", name = "lb", descriptor = "Lrh;")
    private class159 field4489;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Lca;")
    private class183 field4459;

    @OriginalMember(owner = "client!mi", name = "Jb", descriptor = "Lhs;")
    private class196 field4513;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "Lvh;")
    public class221 field4477;

    @OriginalMember(owner = "client!mi", name = "pb", descriptor = "Lvh;")
    public class221 field4493;

    @OriginalMember(owner = "client!mi", name = "Sb", descriptor = "Lvh;")
    public class221 field4522;

    @OriginalMember(owner = "client!mi", name = "ec", descriptor = "Lvh;")
    public class221 field4534;

    @OriginalMember(owner = "client!mi", name = "xc", descriptor = "Lvh;")
    public class221 field4553;

    @OriginalMember(owner = "client!mi", name = "Jc", descriptor = "Lvh;")
    public class221 field4565;

    @OriginalMember(owner = "client!mi", name = "Sc", descriptor = "Lvh;")
    public class221 field4574;

    @OriginalMember(owner = "client!mi", name = "Tc", descriptor = "Lvh;")
    public class221 field4575;

    @OriginalMember(owner = "client!mi", name = "Fc", descriptor = "Lla;")
    public class288 field4561;

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "Lis;")
    public class319 field4484;

    @OriginalMember(owner = "client!mi", name = "Tb", descriptor = "Lis;")
    public class319 field4523;

    @OriginalMember(owner = "client!mi", name = "Yc", descriptor = "Lht;")
    private class378 field4580;

    @OriginalMember(owner = "client!mi", name = "Zc", descriptor = "Lsp;")
    private class416 field4581;

    @OriginalMember(owner = "client!mi", name = "sb", descriptor = "Z")
    public boolean field4496;

    @OriginalMember(owner = "client!mi", name = "Bb", descriptor = "Z")
    public boolean field4505;

    @OriginalMember(owner = "client!mi", name = "Fb", descriptor = "Z")
    public boolean field4509;

    @OriginalMember(owner = "client!mi", name = "Nb", descriptor = "Z")
    private boolean field4517;

    @OriginalMember(owner = "client!mi", name = "Rb", descriptor = "Z")
    private boolean field4521;

    @OriginalMember(owner = "client!mi", name = "Wb", descriptor = "Z")
    private boolean field4526;

    @OriginalMember(owner = "client!mi", name = "Xb", descriptor = "Z")
    private boolean field4527;

    @OriginalMember(owner = "client!mi", name = "bc", descriptor = "Z")
    private boolean field4531;

    @OriginalMember(owner = "client!mi", name = "lc", descriptor = "Z")
    private boolean field4541;

    @OriginalMember(owner = "client!mi", name = "Dc", descriptor = "Z")
    public boolean field4559;

    @OriginalMember(owner = "client!mi", name = "Hc", descriptor = "Z")
    public boolean field4563;

    @OriginalMember(owner = "client!mi", name = "Ic", descriptor = "Z")
    private boolean field4564;

    @OriginalMember(owner = "client!mi", name = "Mc", descriptor = "Z")
    private boolean field4568;

    @OriginalMember(owner = "client!mi", name = "Uc", descriptor = "Z")
    private boolean field4576;

    @OriginalMember(owner = "client!mi", name = "Wc", descriptor = "Z")
    private boolean field4578;

    @OriginalMember(owner = "client!mi", name = "ob", descriptor = "[Lbl;")
    private class425[] field4492;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "()V")
    private final void method1946() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4452.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class111.method713(-92, 1000L);
        }
    }

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "()V")
    private final void method1947() {
        this.field4484 = new class319();
        this.field4523 = new class319();
        this.field4492 = new class425[this.field4480];
        this.field4504 = new class13(this, 3553, 6408, 1, 1);
        this.field4519 = new class13(this, 3553, 6408, 1, 1);
        this.field4500 = new class13(this, 3553, 6408, 1, 1);
        this.field4522 = new class221(this);
        this.field4534 = new class221(this);
        this.field4493 = new class221(this);
        this.field4575 = new class221(this);
        this.field4565 = new class221(this);
        this.field4553 = new class221(this);
        this.field4477 = new class221(this);
        this.field4574 = new class221(this);
        if (this.field4579) {
            this.field4561 = new class288(this);
        }
        this.field4448.method2389(this);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(II)V")
    public final void method1948(int arg0, int arg1) {
        this.field4544 = arg0;
        this.field4501 = arg1;
        this.field4445.glViewport(arg0, arg1, this.field4465, this.field4457);
        this.method1976();
    }

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "()Z")
    public final boolean method655() {
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "()V")
    private final void method1949() {
        float var1 = (float) (-this.field4577) * this.field4548 / (float) this.field4540;
        float var2 = (float) (-this.field4551) * this.field4548 / (float) this.field4570;
        float var3 = (float) (this.field4465 - this.field4577) * this.field4548 / (float) this.field4540;
        float var4 = (float) (this.field4457 - this.field4551) * this.field4548 / (float) this.field4570;
        this.field4445.glMatrixMode(5889);
        this.field4445.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field4445.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4557 - this.field4506), (double) ((float) this.field4556 - this.field4506));
        }
        this.field4445.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)[I")
    public final int[] method649(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4445.glReadPixels(arg0, this.field4457 - arg1 - var6, arg2, 1, 32993, this.field4550, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(Z)V")
    public final void method1950(boolean arg0) {
        if (this.field4578 != arg0) {
            this.field4578 = arg0;
            this.method1986();
            this.field4549 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public final void method682(int arg0, int arg1) {
        if (this.field4483 == arg0 && this.field4555 == arg1) {
            return;
        }
        this.field4483 = arg0;
        this.field4555 = arg1;
        if (!this.field4505) {
            this.method1954();
            this.method1989();
        }
    }

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "()V")
    private final void method1951() {
        float[] var1 = this.field4497;
        float var2 = (float) (-this.field4577 * this.field4557) / (float) this.field4540;
        float var3 = (float) ((this.field4465 - this.field4577) * this.field4557) / (float) this.field4540;
        float var4 = (float) (this.field4557 * this.field4551) / (float) this.field4570;
        float var5 = (float) ((this.field4551 - this.field4457) * this.field4557) / (float) this.field4570;
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
            float var6 = (float) this.field4557 * 2.0F;
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
            var1[10] = this.field4486 = (float) (-(this.field4557 + this.field4556)) / (float) (this.field4556 - this.field4557);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field4487 = -((float) this.field4556 * var6) / (float) (this.field4556 - this.field4557);
            var1[15] = 0.0F;
        }
        this.method1963();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lja;)V")
    public final void method685(class167 arg0) {
        this.field4581 = (class416) arg0;
    }

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "()V")
    public final void method1952() {
        if (this.field4549 == 4) {
            return;
        }
        this.method1970();
        this.method1994(false);
        this.method1950(false);
        this.method1955(false);
        this.method1966(false);
        this.method2002(-2);
        this.method1995(1);
        this.method1962(1);
        this.field4549 = 4;
    }

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "()Los;")
    public final class282 method632() {
        return new class319();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lhs;)V")
    public final void method1953(class196 arg0) {
        if (this.field4513 != arg0 && this.field4538) {
            this.field4445.glBindBufferARB(34963, arg0.method434());
            this.field4513 = arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIII)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3) {
        this.field4505 = true;
        this.field4515 = arg1;
        this.field4511 = arg2;
        this.field4533 = arg3;
        this.method1954();
        this.method1989();
        this.field4450.method474(3, false, false, 3);
        this.field4450.method471(arg0, true, 0);
    }

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "()V")
    public final void method679() {
        this.method1966(true);
        this.field4445.glClear(256);
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(IIII)V")
    public final void method604(int arg0, int arg1, int arg2, int arg3) {
        this.field4577 = arg0;
        this.field4551 = arg1;
        this.field4540 = arg2;
        this.field4570 = arg3;
        this.method1951();
        this.method1984();
        if (this.field4569 == 3) {
            this.method1949();
        } else if (this.field4569 == 2) {
            this.method1991();
        }
    }

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "()V")
    private final void method1954() {
        int var1;
        if (this.field4505) {
            this.field4445.glFogf(2915, 0.0F);
            this.field4445.glFogf(2916, 1.0F);
            var1 = this.field4515;
        } else {
            this.field4572 = (float) (this.field4556 - 256) - this.field4524;
            this.field4518 = this.field4572 - (float) this.field4555 * this.field4532;
            if (this.field4518 < (float) this.field4557) {
                this.field4518 = (float) this.field4557;
            }
            this.field4445.glFogf(2915, this.field4518);
            this.field4445.glFogf(2916, this.field4572);
            var1 = this.field4483;
        }
        field4444[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4444[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4444[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4445.glFogfv(2918, field4444, 0);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(Z)V")
    public final void method1955(boolean arg0) {
        if (this.field4527 == arg0) {
            return;
        }
        if (arg0) {
            this.field4445.glEnable(2929);
        } else {
            this.field4445.glDisable(2929);
        }
        this.field4527 = arg0;
        this.field4549 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public final int method1139() {
        return this.field4457;
    }

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "()V")
    public final void method1956() {
        if (this.field4549 == 2) {
            return;
        }
        this.method1970();
        this.method1994(false);
        this.method1950(false);
        this.method1955(false);
        this.method1966(false);
        this.method2002(-2);
        this.field4549 = 2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lf;Los;[Lkt;I)V")
    public final void method627(class491[] arg0, class282 arg1, class98[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1323(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "()V")
    public final void method1957() {
        if (this.field4549 == 16) {
            return;
        }
        this.method1993();
        this.method1994(true);
        this.method1955(true);
        this.method1966(true);
        this.method1995(1);
        this.method1962(1);
        this.field4549 = 16;
    }

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "()V")
    public final void method1958() {
        if (this.field4549 == 8) {
            return;
        }
        this.method1968();
        this.method1994(true);
        this.method1955(true);
        this.method1966(true);
        this.method1995(1);
        this.method1962(1);
        this.field4549 = 8;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final void method661(int arg0) {
        this.method1946();
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)I")
    public final int method1959(int arg0) {
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFF)V")
    public final void method1960(float arg0, float arg1, float arg2, float arg3) {
        field4444[0] = arg0;
        field4444[1] = arg1;
        field4444[2] = arg2;
        field4444[3] = arg3;
        this.field4445.glTexEnvfv(8960, 8705, field4444, 0);
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
    public final int method1961(int arg0) {
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lvn;IIII)Lf;")
    public final class491 method696(class187 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class221(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
    public final void method1962(int arg0) {
        if (arg0 == 0) {
            this.method1992(7681, 7681);
        } else if (arg0 == 1) {
            this.method1992(8448, 8448);
        } else if (arg0 == 2) {
            this.method1992(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "()Z")
    public final boolean method640() {
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(IIII)V")
    public final void method669(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4529 < arg0) {
            this.field4529 = arg0;
        }
        if (this.field4481 > arg2) {
            this.field4481 = arg2;
        }
        if (this.field4543 < arg1) {
            this.field4543 = arg1;
        }
        if (this.field4547 > arg3) {
            this.field4547 = arg3;
        }
        this.field4445.glEnable(3089);
        this.method1984();
        this.method1976();
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public final void method678(int arg0) {
        this.method1995(0);
        this.field4445.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4445.glClear(16384);
    }

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "()V")
    private final void method1963() {
        if (this.field4506 == 0.0F) {
            this.field4497[10] = this.field4486;
            this.field4497[14] = this.field4487;
        } else {
            float var1 = this.field4478 / (this.field4506 + this.field4478);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4487 * (1.0F - var1) / this.field4506;
            this.field4497[10] = this.field4486 + var3;
            this.field4497[14] = this.field4487 * var2;
        }
        this.field4539 = (this.field4497[14] - (float) this.field4556) / this.field4497[10];
        this.field4546 = (float) this.field4556 - this.field4506;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(IIII)V")
    public final void method631(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4505) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4515 = arg1;
        this.field4511 = arg2;
        this.field4533 = arg3;
        this.method1954();
        this.field4450.method471(arg0, true, 0);
    }

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "()F")
    public final float method694() {
        return this.field4506;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "()Z")
    public final boolean method657() {
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(II)V")
    public final void method625(int arg0, int arg1) {
        if (this.field4557 == arg0 && this.field4556 == arg1) {
            return;
        }
        this.field4557 = arg0;
        this.field4556 = arg1;
        this.method1951();
        this.method1954();
        if (this.field4569 == 3) {
            this.method1949();
        } else if (this.field4569 == 2) {
            this.method1991();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZZ)V")
    public final void method1964(int arg0, boolean arg1, boolean arg2) {
        if (this.field4503 != arg0) {
            if (arg0 < 0) {
                this.method1982();
                this.method1967((class425) null);
                if (!this.field4505) {
                    this.field4450.method474(3, arg2, arg1, 0);
                }
            } else {
                class13 var4 = this.field4454.method2602(108, arg0);
                class279 var5 = this.field4432.method703(12095, arg0);
                if (var5.field4106 == 0 && var5.field4104 == 0) {
                    this.method1982();
                } else {
                    int var6 = var5.field4114 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2010((float) (this.field4458 % var7 * var5.field4106) / (float) var7, (float) (this.field4458 % var7 * var5.field4104) / (float) var7, 0.0F);
                }
                if (this.field4505) {
                    this.field4450.method474(3, arg2, arg1, 3);
                    this.method1967(var4);
                } else {
                    this.field4450.method474(3, arg2, arg1, var5.field4105);
                    this.field4450.method471(var5.field4116, false, 0);
                    if (!this.field4450.method473(var4, (byte) -121)) {
                        this.method1967(var4);
                    }
                }
            }
            this.field4503 = arg0;
        }
        this.field4549 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "()Z")
    public final boolean method656() {
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)I")
    public final int method647(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "()I")
    public final int method654() {
        return this.field4462 + this.field4456 + this.field4467;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(Z)V")
    public final void method1965(boolean arg0) {
        if (this.field4531 != arg0) {
            this.field4531 = arg0;
            this.method1986();
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(Z)V")
    public final void method1966(boolean arg0) {
        if (this.field4576 != arg0) {
            this.field4576 = arg0;
            this.method1996();
            this.field4549 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lbl;)V")
    public final void method1967(class425 arg0) {
        class425 var2 = this.field4492[this.field4573];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4445.glDisable(var2.field5962);
            } else {
                if (var2 == null) {
                    this.field4445.glEnable(arg0.field5962);
                } else if (arg0.field5962 != var2.field5962) {
                    this.field4445.glDisable(var2.field5962);
                    this.field4445.glEnable(arg0.field5962);
                }
                this.field4445.glBindTexture(arg0.field5962, arg0.method2506());
            }
            this.field4492[this.field4573] = arg0;
        }
        this.field4549 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "()V")
    public final void method1968() {
        if (this.field4569 != 2) {
            this.field4569 = 2;
            this.method1991();
            this.method1971();
            this.field4549 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "()V")
    public final void method667() {
        this.field4446.method239();
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method610(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lju;Z)Ltr;")
    public final class176 method644(class72 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field897 * arg0.field893];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field892 == null) {
            for (int var8 = 0; var8 < arg0.field897; var8++) {
                for (int var9 = 0; var9 < arg0.field893; var9++) {
                    int var10 = arg0.field899[arg0.field898[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field897; var6++) {
                for (int var7 = 0; var7 < arg0.field893; var7++) {
                    var3[var5++] = arg0.field892[var4] << 24 | arg0.field899[arg0.field898[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class176 var11 = this.method651(var3, 0, arg0.field893, arg0.field893, arg0.field897);
        var11.method520(arg0.field896, arg0.field891, arg0.field895, arg0.field894);
        return var11;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lca;)V")
    public final void method1969(class183 arg0) {
        if (this.field4461 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4461 >= 0) {
            this.field4468[this.field4461].method1140();
        }
        this.field4459 = this.field4468[++this.field4461] = arg0;
        this.field4459.method1138();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lcs;)V")
    public final void method621(class207 arg0) {
        this.field4448.method2388(this, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFF)V")
    public final void method619(float arg0, float arg1, float arg2) {
        class175.field2534 = arg0;
        class175.field2533 = arg1;
        class175.field2532 = arg2;
    }

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "()V")
    private final void method1970() {
        if (this.field4569 == 1) {
            return;
        }
        this.field4445.glMatrixMode(5889);
        this.field4445.glLoadIdentity();
        if (this.field4465 > 0 && this.field4457 > 0) {
            this.field4445.glOrtho(0.0D, (double) this.field4465, (double) this.field4457, 0.0D, -1.0D, 1.0D);
        }
        this.field4445.glMatrixMode(5888);
        this.field4445.glLoadIdentity();
        this.field4569 = 1;
        this.field4549 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "()Z")
    public final boolean method648() {
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public final void method1138() {
    }

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "()V")
    private final void method1971() {
        this.field4445.glLoadIdentity();
        this.field4445.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4445.glMultMatrixf(this.field4484.method2044(1), 0);
        this.method2018();
    }

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "()V")
    public final void method691() {
        this.field4529 = 0;
        this.field4543 = 0;
        this.field4481 = this.field4465;
        this.field4547 = this.field4457;
        this.field4445.glDisable(3089);
        this.method1984();
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)V")
    public final void method1972(int arg0) {
        if (this.field4573 != arg0) {
            this.field4445.glActiveTexture(arg0 + 33984);
            this.field4573 = arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "()V")
    private final void method1973() {
        field4444[0] = this.field4571 * this.field4516;
        field4444[1] = this.field4516 * this.field4507;
        field4444[2] = this.field4516 * this.field4490;
        field4444[3] = 1.0F;
        this.field4445.glLightModelfv(2899, field4444, 0);
    }

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "()V")
    private final void method1974() {
        if (this.field4549 == 1) {
            return;
        }
        this.method1970();
        this.method1994(false);
        this.method1950(false);
        this.method1955(false);
        this.method1966(false);
        this.method1967((class425) null);
        this.method2002(-2);
        this.method1962(0);
        this.field4549 = 1;
    }

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "()V")
    private final void method1975() {
        this.method2002(-2);
        for (int var1 = this.field4480 - 1; var1 >= 0; var1--) {
            this.method1972(var1);
            this.method1967((class425) null);
            this.field4445.glTexEnvi(8960, 8704, 34160);
        }
        this.method1992(8448, 8448);
        this.method2006(2, 34168, 770);
        this.method1982();
        this.field4498 = 1;
        this.field4445.glEnable(3042);
        this.field4445.glBlendFunc(770, 771);
        this.field4520 = 1;
        this.field4445.glEnable(3008);
        this.field4445.glAlphaFunc(516, 0.0F);
        this.field4541 = true;
        this.field4445.glColorMask(true, true, true, true);
        this.field4521 = true;
        this.method1994(true);
        this.method1950(true);
        this.method1955(true);
        this.method1966(true);
        this.method1979();
        this.field4445.setSwapInterval(0);
        this.field4445.glShadeModel(7425);
        this.field4445.glClearDepth(1.0F);
        this.field4445.glDepthFunc(515);
        this.field4445.glPolygonMode(1028, 6914);
        this.field4445.glEnable(2884);
        this.field4445.glCullFace(1029);
        this.field4445.glMatrixMode(5888);
        this.field4445.glLoadIdentity();
        this.field4445.glColorMaterial(1028, 5634);
        this.field4445.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4445.glLightfv(var4, 4608, var2, 0);
            this.field4445.glLightf(var4, 4615, 0.0F);
            this.field4445.glLightf(var4, 4616, 0.0F);
        }
        this.field4445.glEnable(16384);
        this.field4445.glEnable(16385);
        this.field4445.glFogf(2914, 0.95F);
        this.field4445.glFogi(2917, 9729);
        this.field4445.glHint(3156, 4353);
        this.field4558 = this.field4483 = -1;
        this.method691();
    }

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "()V")
    public final void method620() {
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public final void method673(boolean arg0) {
    }

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "()V")
    private final void method1976() {
        if (this.field4529 <= this.field4481 && this.field4543 <= this.field4547) {
            this.field4445.glScissor(this.field4544 + this.field4529, this.field4501 + this.field4457 - this.field4547, this.field4481 - this.field4529, this.field4547 - this.field4543);
        } else {
            this.field4445.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIIII)V")
    public final void method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1974();
        this.method1995(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4445.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4445.glBegin(1);
        this.field4445.glVertex2f(var6, var7);
        this.field4445.glVertex2f(var6, (float) arg2 + var7);
        this.field4445.glEnd();
    }

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "()V")
    private final void method1977() {
        try {
            this.field4452.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(II)V")
    public final synchronized void method1978(int arg0, int arg1) {
        class324 var3 = new class324(arg1);
        var3.field3568 = (long) arg0;
        this.field4470.method2845(var3, (byte) 37);
    }

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "()V")
    public final void method1979() {
        if (this.field4569 != 0) {
            this.field4569 = 0;
            this.field4549 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public final void method1980(int arg0, int arg1, int arg2) {
        this.field4445.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
    public final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1974();
        this.method1995(arg5);
        this.field4445.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4526) {
            this.field4445.glDisable(32925);
        }
        this.field4445.glBegin(2);
        this.field4445.glVertex2f(var7, var8);
        this.field4445.glVertex2f(var7, var10);
        this.field4445.glVertex2f(var9, var10);
        this.field4445.glVertex2f(var9, var8);
        this.field4445.glEnd();
        if (this.field4526) {
            this.field4445.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4489 == null || this.field4489.field146 < arg2 || this.field4489.field145 < arg3) {
            this.field4489 = class159.method990(arg3, 6406, false, arg2, arg6, 6406, this, 34037);
            this.field4489.method93(false, false);
            var10 = this.field4489.field2359;
            var11 = this.field4489.field2357;
        } else {
            this.field4489.method96(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4489.field2359 / (float) this.field4489.field145;
            var11 = (float) arg2 * this.field4489.field2357 / (float) this.field4489.field146;
        }
        this.method1956();
        this.method1967(this.field4489);
        this.method1995(arg8);
        this.field4445.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1987(arg5);
        this.method1992(34165, 34165);
        this.method2006(0, 34166, 768);
        this.method2006(2, 5890, 770);
        this.method2017(0, 34166, 770);
        this.method2017(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4445.glBegin(7);
        this.field4445.glTexCoord2f(0.0F, 0.0F);
        this.field4445.glVertex2f(var12, var13);
        this.field4445.glTexCoord2f(0.0F, var11);
        this.field4445.glVertex2f(var12, var15);
        this.field4445.glTexCoord2f(var10, var11);
        this.field4445.glVertex2f(var14, var15);
        this.field4445.glTexCoord2f(var10, 0.0F);
        this.field4445.glVertex2f(var14, var13);
        this.field4445.glEnd();
        this.method2006(0, 5890, 768);
        this.method2006(2, 34166, 770);
        this.method2017(0, 5890, 770);
        this.method2017(2, 34166, 770);
    }

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "(I)V")
    public final synchronized void method1981(int arg0) {
        class324 var2 = new class324(arg0);
        this.field4471.method2845(var2, (byte) 37);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lqb;[Lju;Z)Loh;")
    public final class256 method688(class135 arg0, class72[] arg1, boolean arg2) {
        return new class228(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lja;Lja;FLja;)Lja;")
    public final class167 method634(class167 arg0, class167 arg1, float arg2, class167 arg3) {
        if (arg0 != null && arg1 != null && this.field4509 && this.field4579) {
            class391 var5 = null;
            class416 var6 = (class416) arg0;
            class416 var7 = (class416) arg1;
            class294 var8 = var6.method24(2040);
            class294 var9 = var7.method24(2040);
            if (var8 != null && var9 != null) {
                int var10 = var8.field4258 > var9.field4258 ? var8.field4258 : var9.field4258;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class391) {
                    class391 var11 = (class391) arg3;
                    if (var11.method2343((byte) 72) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class391(this, var10);
                }
                var5.method2344(arg2, var9, var8, 0);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(IIII)V")
    public final void method607(int arg0, int arg1, int arg2, int arg3) {
        this.field4446.method235(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "()I")
    public final int method615() {
        int var1 = this.field4482;
        this.field4482 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIILsm;II)V")
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class171 arg6, int arg7, int arg8) {
        class4 var10 = (class4) arg6;
        class159 var11 = var10.field34;
        this.method1956();
        this.method1967(var10.field34);
        this.method1995(arg5);
        this.method1992(7681, 8448);
        this.method2006(0, 34167, 768);
        float var12 = var11.field2357 / (float) var11.field2358;
        float var13 = var11.field2359 / (float) var11.field2361;
        this.field4445.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4445.glBegin(1);
        this.field4445.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4445.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4445.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4445.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4445.glEnd();
        this.method2006(0, 5890, 768);
    }

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "()I")
    public final int method608() {
        return this.field4556;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(IIIII)V")
    public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1974();
        this.method1995(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4445.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4445.glBegin(1);
        this.field4445.glVertex2f(var6, var7);
        this.field4445.glVertex2f((float) arg2 + var6, var7);
        this.field4445.glEnd();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lf;Lcs;Los;Lkt;I)V")
    public final void method646(class491 arg0, class207 arg1, class282 arg2, class98 arg3, int arg4) {
        arg0.method1323(arg2, arg3, arg4);
        this.method621(arg1);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIII)V")
    public final void method617(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4465) {
            arg2 = this.field4465;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4457) {
            arg3 = this.field4457;
        }
        this.field4529 = arg0;
        this.field4543 = arg1;
        this.field4481 = arg2;
        this.field4547 = arg3;
        this.field4445.glEnable(3089);
        this.method1984();
        this.method1976();
    }

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "()V")
    public final void method698() {
        this.field4465 = this.field4443.getWidth();
        this.field4457 = this.field4443.getHeight();
        this.field4445.glViewport(this.field4544, this.field4501, this.field4465, this.field4457);
        this.method1979();
        this.method691();
    }

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "()V")
    private final void method1982() {
        if (this.field4568) {
            this.field4445.glMatrixMode(5890);
            this.field4445.glLoadIdentity();
            this.field4445.glMatrixMode(5888);
            this.field4568 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lht;)V")
    public final void method1983(class378 arg0) {
        if (this.field4580 != arg0 && this.field4538) {
            this.field4445.glBindBufferARB(34962, arg0.method434());
            this.field4580 = arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "()V")
    private final void method1984() {
        this.field4528 = (float) (this.field4529 - this.field4577);
        this.field4508 = (float) (this.field4481 - this.field4577);
        this.field4494 = (float) (this.field4543 - this.field4551);
        this.field4495 = (float) (this.field4547 - this.field4551);
    }

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "()I")
    private final int method1985() {
        int var1 = 0;
        this.field4542 = this.field4445.glGetString(7936);
        this.field4537 = this.field4445.glGetString(7937);
        String var2 = this.field4542.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4445.glGetString(7938);
        String[] var4 = class193.method1192(' ', 0, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class151.method952(var4[0], 16046);
                int var6 = class151.method952(var4[1], 16046);
                this.field4552 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4552 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4445.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4445.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4445.glGetIntegerv(34018, var8, 0);
        this.field4480 = var8[0];
        this.field4445.glGetIntegerv(34929, var8, 0);
        this.field4512 = var8[0];
        this.field4445.glGetIntegerv(34930, var8, 0);
        this.field4491 = var8[0];
        if (this.field4480 < 2 || this.field4512 < 2 || this.field4491 < 2) {
            var1 |= 0x10;
        }
        this.field4517 = class430.field6011 != null && class430.field6011.startsWith("mac");
        this.field4514 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4538 = this.field4445.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4526 = this.field4445.isExtensionAvailable("GL_ARB_multisample");
        this.field4563 = this.field4445.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4445.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4445.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4496 = this.field4445.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4476 = this.field4445.isExtensionAvailable("GL_EXT_texture3D");
        this.field4499 = this.field4445.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4509 = this.field4445.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4488 = this.field4445.isExtensionAvailable("GL_ARB_texture_float");
        this.field4559 = false;
        this.field4579 = this.field4445.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "()Z")
    public final boolean method684() {
        return !this.field4517;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
    public final void method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4445.glLineWidth((float) arg5);
        this.method699(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4445.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
    public final void method668(boolean arg0) {
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method683(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "()V")
    private final void method1986() {
        if (this.field4578 && !this.field4531) {
            this.field4445.glEnable(2896);
        } else {
            this.field4445.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[I[I)Lsm;")
    public final class171 method659(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class4.method18(arg2, -10890, arg1, this, arg3, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(IIIIII)V")
    public final void method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1974();
        this.method1995(arg5);
        this.field4445.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4526) {
            this.field4445.glDisable(32925);
        }
        this.field4445.glBegin(7);
        this.field4445.glVertex2f(var7, var8);
        this.field4445.glVertex2f(var7, var10);
        this.field4445.glVertex2f(var9, var10);
        this.field4445.glVertex2f(var9, var8);
        this.field4445.glEnd();
        if (this.field4526) {
            this.field4445.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "(I)V")
    public final void method1987(int arg0) {
        field4444[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4444[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4444[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4444[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4445.glTexEnvfv(8960, 8705, field4444, 0);
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "()I")
    public final int method614() {
        int var1 = this.field4525;
        this.field4525 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "()V")
    private final void method1988() {
        field4444[0] = this.field4571 * this.field4567;
        field4444[1] = this.field4567 * this.field4507;
        field4444[2] = this.field4567 * this.field4490;
        field4444[3] = 1.0F;
        this.field4445.glLightfv(16384, 4609, field4444, 0);
        field4444[0] = -this.field4554 * this.field4571;
        field4444[1] = -this.field4554 * this.field4507;
        field4444[2] = -this.field4554 * this.field4490;
        field4444[3] = 1.0F;
        this.field4445.glLightfv(16385, 4609, field4444, 0);
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "()I")
    public final int method687() {
        return this.field4557;
    }

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "()Z")
    public final boolean method666() {
        return this.field4447.method1496(1);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(IIIIII)V")
    public final void method699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1974();
        this.method1995(arg5);
        this.field4445.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4445.glBegin(2);
        this.field4445.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4445.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4445.glEnd();
    }

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "()V")
    private final void method1989() {
        if (this.field4564 && this.field4505 | this.field4555 >= 0) {
            this.field4445.glEnable(2912);
        } else {
            this.field4445.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILsm;II)V")
    public final void method665(int arg0, class171 arg1, int arg2, int arg3) {
        class4 var5 = (class4) arg1;
        class159 var6 = var5.field34;
        this.method1956();
        this.method1967(var5.field34);
        this.method1995(1);
        this.method1992(7681, 8448);
        this.method2006(0, 34167, 768);
        float var7 = var6.field2357 / (float) var6.field2358;
        float var8 = var6.field2359 / (float) var6.field2361;
        this.field4445.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4445.glBegin(7);
        this.field4445.glTexCoord2f((float) (this.field4529 - arg2) * var7, (float) (this.field4543 - arg3) * var8);
        this.field4445.glVertex2i(this.field4529, this.field4543);
        this.field4445.glTexCoord2f((float) (this.field4529 - arg2) * var7, (float) (this.field4547 - arg3) * var8);
        this.field4445.glVertex2i(this.field4529, this.field4547);
        this.field4445.glTexCoord2f((float) (this.field4481 - arg2) * var7, (float) (this.field4547 - arg3) * var8);
        this.field4445.glVertex2i(this.field4481, this.field4547);
        this.field4445.glTexCoord2f((float) (this.field4481 - arg2) * var7, (float) (this.field4543 - arg3) * var8);
        this.field4445.glVertex2i(this.field4481, this.field4543);
        this.field4445.glEnd();
        this.method2006(0, 5890, 768);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BIZ)Lhs;")
    public final class196 method1990(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class196) (this.field4538 && !arg3 || this.field4562 ? new class402(this, arg0, arg1, arg2, arg3) : new class147(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "()I")
    public final int method606() {
        return 4;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIIIII)Lja;")
    public final class167 method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4509 ? new class6(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!mi", name = "lb", descriptor = "()V")
    private final void method1991() {
        this.field4445.glMatrixMode(5889);
        this.field4445.glLoadMatrixf(this.field4497, 0);
        this.field4445.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(II)V")
    public final void method1992(int arg0, int arg1) {
        if (this.field4573 != 0) {
            this.field4445.glTexEnvi(8960, 34161, arg0);
            this.field4445.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4479 != arg0) {
            this.field4445.glTexEnvi(8960, 34161, arg0);
            this.field4479 = arg0;
            var3 = true;
        }
        if (this.field4545 != arg1) {
            this.field4445.glTexEnvi(8960, 34162, arg1);
            this.field4545 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4549 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
    public final int method653(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)Lgf;")
    public final class166 method692(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
    public final synchronized void method642(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4469.method2851(false)) {
            class324 var4 = (class324) this.field4469.method2839(-31216);
            field4453[var2++] = (int) var4.field3568;
            this.field4456 -= var4.field4676;
            if (var2 == 1000) {
                this.field4445.glDeleteBuffersARB(var2, field4453, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4445.glDeleteBuffersARB(var2, field4453, 0);
            var2 = 0;
        }
        while (!this.field4470.method2851(false)) {
            class324 var5 = (class324) this.field4470.method2839(-31216);
            field4453[var2++] = (int) var5.field3568;
            this.field4462 -= var5.field4676;
            if (var2 == 1000) {
                this.field4445.glDeleteTextures(var2, field4453, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4445.glDeleteTextures(var2, field4453, 0);
            var2 = 0;
        }
        while (!this.field4471.method2851(false)) {
            class324 var6 = (class324) this.field4471.method2839(-31216);
            field4453[var2++] = var6.field4676;
            if (var2 == 1000) {
                this.field4445.glDeleteFramebuffersEXT(var2, field4453, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4445.glDeleteFramebuffersEXT(var2, field4453, 0);
            var2 = 0;
        }
        while (!this.field4472.method2851(false)) {
            class324 var7 = (class324) this.field4472.method2839(-31216);
            field4453[var2++] = (int) var7.field3568;
            this.field4467 -= var7.field4676;
            if (var2 == 1000) {
                this.field4445.glDeleteRenderbuffersEXT(var2, field4453, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4445.glDeleteRenderbuffersEXT(var2, field4453, 0);
            var2 = 0;
        }
        while (!this.field4473.method2851(false)) {
            class324 var8 = (class324) this.field4473.method2839(-31216);
            field4453[var2++] = (int) var8.field3568;
            if (var2 == 1000) {
                this.field4445.glDeleteProgramsARB(var2, field4453, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4445.glDeleteProgramsARB(var2, field4453, 0);
            boolean var9 = false;
        }
        while (!this.field4463.method2851(false)) {
            class324 var10 = (class324) this.field4463.method2839(-31216);
            this.field4445.glDeleteLists((int) var10.field3568, var10.field4676);
        }
        while (!this.field4474.method2851(false)) {
            class324 var11 = (class324) this.field4474.method2839(-31216);
            this.field4445.glDeleteObjectARB(var11.field4676);
        }
        while (!this.field4463.method2851(false)) {
            class324 var12 = (class324) this.field4463.method2839(-31216);
            this.field4445.glDeleteLists((int) var12.field3568, var12.field4676);
        }
        if (this.method654() > 100663296 && class433.method2562(-2039) > this.field4536 + 60000L) {
            System.gc();
            this.field4536 = class433.method2562(-2039);
        }
        this.field4458 = var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[[I[[IIII)Lpl;")
    public final class426 method636(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class445(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IIIII)Ltr;")
    public final class176 method651(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class455(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "()V")
    public final void method643() {
        if (this.field4447.method1496(1)) {
            this.field4446.method238(this.field4447);
            this.field4454.method2603(true);
        }
    }

    @OriginalMember(owner = "client!mi", name = "mb", descriptor = "()V")
    private final void method1993() {
        if (this.field4569 != 3) {
            this.field4569 = 3;
            this.method1949();
            this.method1971();
            this.field4549 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "()Los;")
    public final class282 method601() {
        return this.field4455;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()V")
    public final void method1140() {
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lgf;)V")
    public final void method672(class166 arg0) {
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIZ)Ltr;")
    public final class176 method626(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class455(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "()Z")
    public final boolean method639() {
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "()Z")
    public final boolean method645() {
        return this.field4450.method472((byte) -62, 3);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FF)V")
    public final void method686(float arg0, float arg1) {
        if (this.field4478 == arg0 && this.field4506 == arg1) {
            return;
        }
        this.field4478 = arg0;
        this.field4506 = arg1;
        this.method1963();
        if (this.field4569 == 3) {
            this.method1949();
        } else if (this.field4569 == 2) {
            this.method1991();
        }
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(Z)V")
    public final void method1994(boolean arg0) {
        if (this.field4564 != arg0) {
            this.field4564 = arg0;
            this.method1989();
            this.field4549 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Los;)V")
    public final void method609(class282 arg0) {
        this.field4484 = (class319) arg0;
        this.field4523.method2047(0, this.field4484);
        if (this.field4569 != 1) {
            this.method1971();
        }
    }

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "(I)V")
    public final void method1995(int arg0) {
        if (this.field4498 == arg0) {
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
        if (this.field4521 != var3) {
            this.field4445.glColorMask(var3, var3, var3, true);
            this.field4521 = var3;
        }
        if (this.field4541 != var4) {
            if (var4) {
                this.field4445.glEnable(3008);
            } else {
                this.field4445.glDisable(3008);
            }
            this.field4541 = var4;
        }
        if (this.field4520 != var2) {
            if (var2 == 1) {
                this.field4445.glEnable(3042);
                this.field4445.glBlendEquation(32774);
                this.field4445.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4445.glEnable(3042);
                this.field4445.glBlendEquation(32774);
                this.field4445.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4445.glEnable(3042);
                this.field4445.glBlendEquation(32778);
                this.field4445.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4445.glEnable(3042);
                this.field4445.glBlendEquation(32774);
                this.field4445.glBlendFunc(774, 1);
            } else {
                this.field4445.glDisable(3042);
            }
            this.field4520 = var2;
        }
        this.field4498 = arg0;
        this.field4549 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "()Z")
    public final boolean method598() {
        return this.field4526;
    }

    @OriginalMember(owner = "client!mi", name = "nb", descriptor = "()V")
    private final void method1996() {
        this.field4445.glDepthMask(this.field4576 && this.field4566);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(FF)V")
    public final void method1997(float arg0, float arg1) {
        this.field4532 = arg0;
        this.field4524 = arg1;
        if (!this.field4505) {
            this.method1954();
        }
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "()F")
    public final float method677() {
        return this.field4478;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4484.field4629 + (float) arg0 * this.field4484.field4626 + (float) arg1 * this.field4484.field4627 + this.field4484.field4630;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4484.field4629 + (float) arg3 * this.field4484.field4626 + (float) arg4 * this.field4484.field4627 + this.field4484.field4630;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4557) || !(var8 < (float) this.field4557)) || !(!(var7 > (float) this.field4556) || !(var8 > (float) this.field4556))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4484.field4628 + (float) arg0 * this.field4484.field4622 + (float) arg1 * this.field4484.field4621 + this.field4484.field4624) * (float) this.field4540 / var7);
        int var10 = (int) (((float) arg5 * this.field4484.field4628 + (float) arg3 * this.field4484.field4622 + (float) arg4 * this.field4484.field4621 + this.field4484.field4624) * (float) this.field4540 / var8);
        if ((float) var9 < this.field4528 && (float) var10 < this.field4528 || (float) var9 > this.field4508 && (float) var10 > this.field4508) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4484.field4619 + (float) arg0 * this.field4484.field4625 + (float) arg1 * this.field4484.field4620 + this.field4484.field4631) * (float) this.field4570 / var7);
            int var12 = (int) (((float) arg5 * this.field4484.field4619 + (float) arg3 * this.field4484.field4625 + (float) arg4 * this.field4484.field4620 + this.field4484.field4631) * (float) this.field4570 / var8);
            return (!((float) var11 < this.field4494) || !((float) var12 < this.field4494)) && (!((float) var11 > this.field4495) || !((float) var12 > this.field4495));
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lhs;III)V")
    public final void method1998(class196 arg0, int arg1, int arg2, int arg3) {
        this.method1953(arg0);
        arg0.method929(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "(I)I")
    public final int method1999(int arg0) {
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

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "()V")
    public final void method622() {
        try {
            this.field4452.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(II)V")
    public final synchronized void method2000(int arg0, int arg1) {
        class324 var3 = new class324(arg1);
        var3.field3568 = (long) arg0;
        this.field4471.method2845(var3, (byte) 37);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(F)V")
    public final void method2001(float arg0) {
        if (this.field4548 != arg0) {
            this.field4548 = arg0;
            if (this.field4569 == 3) {
                this.method1949();
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "(I)V")
    public final void method2002(int arg0) {
        this.method2013(arg0, true);
    }

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "()Z")
    public final boolean method616() {
        if (!this.field4447.method1496(1)) {
            if (!this.field4446.method233(this.field4447)) {
                return false;
            }
            this.field4454.method2603(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[I)V")
    public final void method633(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4484.field4629 + (float) arg0 * this.field4484.field4626 + (float) arg1 * this.field4484.field4627 + this.field4484.field4630;
        if ((var5 < (float) this.field4557) || (var5 > (float) this.field4556)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4484.field4628 + (float) arg0 * this.field4484.field4622 + (float) arg1 * this.field4484.field4621 + this.field4484.field4624) * (float) this.field4540 / var5);
        int var7 = (int) (((float) arg2 * this.field4484.field4619 + (float) arg0 * this.field4484.field4625 + (float) arg1 * this.field4484.field4620 + this.field4484.field4631) * (float) this.field4570 / var5);
        if ((float) var6 >= this.field4528 && (float) var6 <= this.field4508 && (float) var7 >= this.field4494 && (float) var7 <= this.field4495) {
            arg3[0] = (int) ((float) var6 - this.field4528);
            arg3[1] = (int) ((float) var7 - this.field4494);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!mi", name = "ob", descriptor = "()V")
    public final void method2003() {
        this.field4445.glPopMatrix();
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lwp;IILmj;)V")
    public class315(Canvas arg0, class109 arg1, int arg2, int arg3, class430 arg4) {
        super(arg2, arg1);
        this.field4443 = arg0;
        int var6 = 0;
        while (!this.field4443.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class111.method713(96, 1000L);
        }
        this.field4443.setIgnoreRepaint(true);
        try {
            if (field4451 == null || !field4451) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4451 = Boolean.TRUE;
                } else {
                    class366 var7 = arg4.method2531(-33, this.getClass());
                    while (var7.field5253 == 0) {
                        class111.method713(-82, 100L);
                    }
                    if (var7.field5253 == 1) {
                        field4451 = Boolean.TRUE;
                    }
                }
            }
            if (field4451 == null || !field4451) {
                throw new RuntimeException("");
            }
            this.field4452 = new context();
            if (!this.field4452.choosePixelFormat(this.field4443, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4452.createContext()) {
                this.method1946();
                this.field4445 = this.field4452.getGL();
                int var8 = this.method1985();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4550 = this.field4514 ? 33639 : 5121;
                String var9 = this.field4542.toLowerCase();
                String var10 = this.field4537.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class193.method1192(' ', 0, var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class452.method2638(-128, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class452.method2638(-128, var16.substring(0, 4))) {
                                        var11 = class151.method952(var16.substring(0, 4), 16046);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4538 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4476 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4488 = false;
                    }
                    this.field4499 &= this.field4445.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4562 = this.field4538;
                }
                if (var9.contains("intel")) {
                    this.field4579 = false;
                }
                if (this.field4538) {
                    try {
                        int[] var18 = new int[1];
                        this.field4445.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method1969(this);
                this.method698();
                this.method1947();
                new class174(this);
                this.field4454 = new class443(this, this.field4432);
                class280.method1774(true, (byte) -66, true);
                this.field4466 = true;
                this.field4450 = new class83(this);
                this.field4446 = new class35(this);
                this.field4447 = new class175(this);
                this.method1975();
                this.field4445.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4452.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class111.method713(-97, 100L);
                    }
                }
                this.field4445.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method701();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I[BIZ)Lht;")
    public final class378 method2004(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class378) (this.field4538 && !arg3 || this.field4562 ? new class133(this, arg0, arg1, arg2, arg3) : new class457(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "(I)V")
    public final synchronized void method2005(int arg0) {
        class324 var2 = new class324(arg0);
        this.field4474.method2845(var2, (byte) 37);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V")
    public final void method2006(int arg0, int arg1, int arg2) {
        this.field4445.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4445.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lht;")
    public final class378 method2007(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class378) (this.field4538 && !arg2 || this.field4562 ? new class133(this, arg0, arg1, arg2) : new class457(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lga;Lga;Lga;Lga;)V")
    public final void method2008(class254 arg0, class254 arg1, class254 arg2, class254 arg3) {
        if (arg0 == null) {
            this.field4445.glDisableClientState(32884);
        } else {
            this.field4445.glEnableClientState(32884);
            arg0.method1583(-27316);
        }
        if (arg1 == null) {
            this.field4445.glDisableClientState(32885);
        } else {
            this.field4445.glEnableClientState(32885);
            arg1.method1581(127);
        }
        if (arg2 == null) {
            this.field4445.glDisableClientState(32886);
        } else {
            this.field4445.glEnableClientState(32886);
            arg2.method1580(true);
        }
        if (arg3 == null) {
            this.field4445.glDisableClientState(32888);
        } else {
            this.field4445.glEnableClientState(32888);
            arg3.method1582(false);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lf;Lcs;Los;[Lkt;I)V")
    public final void method612(class491[] arg0, class207 arg1, class282 arg2, class98[] arg3, int arg4) {
        this.method627(arg0, arg2, arg3, arg4);
        this.method621(arg1);
    }

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "()Z")
    public final boolean method700() {
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "()V")
    public final void method675() {
        this.field4450.method474(3, false, false, 0);
        this.field4505 = false;
        this.method1954();
        this.method1989();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method663(Rectangle[] arg0, int arg1) {
        this.method622();
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lca;)V")
    public final void method2009(class183 arg0) {
        if (this.field4461 < 0 || this.field4468[this.field4461] != arg0) {
            throw new RuntimeException();
        }
        this.field4468[this.field4461--] = null;
        arg0.method1140();
        if (this.field4461 >= 0) {
            this.field4459 = this.field4468[this.field4461];
            this.field4459.method1138();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(F)V")
    public final void method680(float arg0) {
        if (this.field4516 != arg0) {
            this.field4516 = arg0;
            this.method1973();
        }
    }

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "()Z")
    public final boolean method697() {
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)V")
    public final void method618(boolean arg0) {
        this.field4566 = arg0;
        this.method1996();
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()Z")
    public final boolean method603() {
        return this.field4447.method1076();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[Leo;)V")
    public final void method637(int arg0, class178[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class178 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4449[0] = (float) var4.field2552;
            field4449[1] = (float) var4.field2547;
            field4449[2] = (float) var4.field2546;
            field4449[3] = 1.0F;
            this.field4445.glLightfv(var5, 4611, field4449, 0);
            int var6 = var4.field2558;
            float var7 = var4.field2555 / 255.0F;
            field4449[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4449[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4449[2] = (float) (var6 & 0xFF) * var7;
            this.field4445.glLightfv(var5, 4609, field4449, 0);
            this.field4445.glLightf(var5, 4617, 1.0F / (float) (var4.field2557 * var4.field2557));
            this.field4445.glEnable(var5);
        }
        while (var3 < this.field4510) {
            this.field4445.glDisable(var3 + 16386);
            var3++;
        }
        this.field4510 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(FFF)V")
    private final void method2010(float arg0, float arg1, float arg2) {
        this.field4445.glMatrixMode(5890);
        if (this.field4568) {
            this.field4445.glLoadIdentity();
        }
        this.field4445.glTranslatef(arg0, arg1, arg2);
        this.field4445.glMatrixMode(5888);
        this.field4568 = true;
    }

    @OriginalMember(owner = "client!mi", name = "pb", descriptor = "()Lca;")
    public final class183 method2011() {
        return this.field4459;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "()V")
    public final void method701() {
        if (this.field4445 != null) {
            try {
                this.field4446.method237();
            } catch (Throwable var4) {
            }
            this.field4445 = null;
        }
        if (this.field4452 != null) {
            this.method1977();
            try {
                this.field4452.destroy();
            } catch (Throwable var3) {
            }
            this.field4452 = null;
        }
        if (this.field4466) {
            class148.method934(true, 28238, true);
            this.field4466 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public final void method664(int arg0) {
        this.method1977();
    }

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "(I)V")
    public final synchronized void method2012(int arg0) {
        class324 var2 = new class324(arg0);
        this.field4473.method2845(var2, (byte) 37);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
    public final void method2013(int arg0, boolean arg1) {
        this.method1964(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IFFFFF)V")
    public final void method695(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4558 != arg0;
        if (var7 || this.field4567 != arg1 || this.field4554 != arg2) {
            this.field4558 = arg0;
            this.field4567 = arg1;
            this.field4554 = arg2;
            if (var7) {
                this.field4571 = (float) (this.field4558 & 0xFF0000) / 1.671168E7F;
                this.field4507 = (float) (this.field4558 & 0xFFFF) / 65535.0F;
                this.field4490 = (float) (this.field4558 & 0xFF) / 255.0F;
                this.method1973();
            }
            this.method1988();
        }
        if (this.field4560[0] == arg3 && this.field4560[1] == arg4 && this.field4560[2] == arg5) {
            return;
        }
        this.field4560[0] = arg3;
        this.field4560[1] = arg4;
        this.field4560[2] = arg5;
        this.field4475[0] = -arg3;
        this.field4475[1] = -arg4;
        this.field4475[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4502[0] = arg3 * var8;
        this.field4502[1] = arg4 * var8;
        this.field4502[2] = arg5 * var8;
        this.field4530[0] = -this.field4502[0];
        this.field4530[1] = -this.field4502[1];
        this.field4530[2] = -this.field4502[2];
        this.method2018();
        this.field4485 = (int) (arg3 * 256.0F / arg4);
        this.field4535 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "()Z")
    public final boolean method652() {
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(II)V")
    public final synchronized void method2014(int arg0, int arg1) {
        class324 var3 = new class324(arg1);
        var3.field3568 = (long) arg0;
        this.field4469.method2845(var3, (byte) 37);
    }

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "()V")
    public final void method681() {
        if (this.field4465 <= 0 && this.field4457 <= 0) {
            return;
        }
        int var1 = this.field4529;
        int var2 = this.field4481;
        int var3 = this.field4543;
        int var4 = this.field4547;
        this.method691();
        this.field4445.glReadBuffer(1028);
        this.field4445.glDrawBuffer(1029);
        this.method1979();
        this.method1994(false);
        this.method1950(false);
        this.method1955(false);
        this.method1966(false);
        this.method1967((class425) null);
        this.method2002(-2);
        this.method1962(0);
        this.method1995(0);
        this.field4445.glMatrixMode(5889);
        this.field4445.glLoadIdentity();
        this.field4445.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4445.glMatrixMode(5888);
        this.field4445.glLoadIdentity();
        this.field4445.glRasterPos2i(0, 0);
        this.field4445.glCopyPixels(0, 0, this.field4465, this.field4457, 6144);
        this.field4445.glFlush();
        this.field4445.glReadBuffer(1029);
        this.field4445.glDrawBuffer(1029);
        this.method617(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lis;)V")
    public final void method2015(class319 arg0) {
        this.field4445.glPushMatrix();
        this.field4445.glMultMatrixf(arg0.method2044(1), 0);
    }

    @OriginalMember(owner = "client!mi", name = "qb", descriptor = "()Lnq;")
    public final class294 method2016() {
        return this.field4581 == null ? null : this.field4581.method24(2040);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)V")
    public final void method690(int[] arg0) {
        arg0[0] = this.field4529;
        arg0[1] = this.field4543;
        arg0[2] = this.field4481;
        arg0[3] = this.field4547;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(III)V")
    public final void method2017(int arg0, int arg1, int arg2) {
        this.field4445.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4445.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "rb", descriptor = "()V")
    public final void method2018() {
        this.field4445.glLightfv(16384, 4611, this.field4502, 0);
        this.field4445.glLightfv(16385, 4611, this.field4530, 0);
    }
}
