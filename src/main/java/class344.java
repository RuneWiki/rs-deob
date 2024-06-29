import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class344 extends class364 implements class264 {

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Llu;")
    private class463 field4614 = new class463();

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lon;")
    private class203 field4615 = new class180();

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Z")
    private boolean field4616 = false;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    private int field4618 = -1;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public int field4620 = 8;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[Lmf;")
    private class264[] field4619 = new class264[4];

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field4623 = 3;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Lld;")
    private class105 field4624 = new class105();

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Lld;")
    private class105 field4629 = new class105();

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lld;")
    private class105 field4630 = new class105();

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Lld;")
    private class105 field4631 = new class105();

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "Lld;")
    private class105 field4632 = new class105();

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "Lld;")
    private class105 field4633 = new class105();

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Lld;")
    private class105 field4634 = new class105();

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[F")
    private float[] field4636 = new float[4];

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "[F")
    public float[] field4637 = new float[4];

    @OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
    private int field4658 = 8448;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "F")
    public float field4643 = 3584.0F;

    @OriginalMember(owner = "client!bf", name = "Ab", descriptor = "F")
    private float field4664 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "xb", descriptor = "F")
    public float field4661 = -1.0F;

    @OriginalMember(owner = "client!bf", name = "Jb", descriptor = "I")
    public int field4673 = -1;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    private int field4646 = 0;

    @OriginalMember(owner = "client!bf", name = "Zb", descriptor = "Z")
    private boolean field4689 = true;

    @OriginalMember(owner = "client!bf", name = "ic", descriptor = "I")
    public int field4698 = 0;

    @OriginalMember(owner = "client!bf", name = "pc", descriptor = "I")
    private int field4705 = 0;

    @OriginalMember(owner = "client!bf", name = "tc", descriptor = "F")
    public float field4709 = 3584.0F;

    @OriginalMember(owner = "client!bf", name = "Hb", descriptor = "I")
    public int field4671 = 512;

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "F")
    public float field4649 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "wb", descriptor = "I")
    public int field4660 = 512;

    @OriginalMember(owner = "client!bf", name = "xc", descriptor = "I")
    public int field4713 = 0;

    @OriginalMember(owner = "client!bf", name = "Dc", descriptor = "F")
    public float field4719 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "Cc", descriptor = "I")
    private int field4718 = 0;

    @OriginalMember(owner = "client!bf", name = "kc", descriptor = "F")
    private float field4700 = 0.0F;

    @OriginalMember(owner = "client!bf", name = "tb", descriptor = "I")
    private int field4657 = 0;

    @OriginalMember(owner = "client!bf", name = "Lb", descriptor = "[F")
    private float[] field4675 = new float[4];

    @OriginalMember(owner = "client!bf", name = "Pc", descriptor = "I")
    public int field4731 = 50;

    @OriginalMember(owner = "client!bf", name = "Qc", descriptor = "I")
    public int field4732 = 3584;

    @OriginalMember(owner = "client!bf", name = "Pb", descriptor = "F")
    private float field4679 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "Xb", descriptor = "[F")
    private float[] field4687 = new float[4];

    @OriginalMember(owner = "client!bf", name = "uc", descriptor = "I")
    private int field4710 = 0;

    @OriginalMember(owner = "client!bf", name = "lc", descriptor = "F")
    public float field4701 = -1.0F;

    @OriginalMember(owner = "client!bf", name = "Sc", descriptor = "I")
    public int field4734 = 0;

    @OriginalMember(owner = "client!bf", name = "zc", descriptor = "I")
    private int field4715 = -1;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "F")
    public float field4635 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "Oc", descriptor = "I")
    private int field4730 = -1;

    @OriginalMember(owner = "client!bf", name = "Hc", descriptor = "I")
    public int field4723 = -1;

    @OriginalMember(owner = "client!bf", name = "Kc", descriptor = "I")
    public int field4726 = -1;

    @OriginalMember(owner = "client!bf", name = "Rc", descriptor = "I")
    private int field4733 = 0;

    @OriginalMember(owner = "client!bf", name = "Ec", descriptor = "[F")
    private float[] field4720 = new float[16];

    @OriginalMember(owner = "client!bf", name = "Ic", descriptor = "I")
    private int field4724 = 8448;

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "I")
    private int field4653 = 0;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4607;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Ljaggl/context;")
    private context field4605;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Ljaggl/opengl;")
    public opengl field4604;

    @OriginalMember(owner = "client!bf", name = "Fc", descriptor = "Z")
    public boolean field4721;

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!bf", name = "Mb", descriptor = "Ljava/lang/String;")
    private String field4676;

    @OriginalMember(owner = "client!bf", name = "fc", descriptor = "Ljava/lang/String;")
    private String field4695;

    @OriginalMember(owner = "client!bf", name = "yb", descriptor = "Z")
    private boolean field4662;

    @OriginalMember(owner = "client!bf", name = "Xc", descriptor = "Z")
    public boolean field4739;

    @OriginalMember(owner = "client!bf", name = "yc", descriptor = "Z")
    public boolean field4714;

    @OriginalMember(owner = "client!bf", name = "Ub", descriptor = "Z")
    public boolean field4684;

    @OriginalMember(owner = "client!bf", name = "rc", descriptor = "Z")
    private boolean field4707;

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "Z")
    public boolean field4656;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lea;")
    public class353 field4611;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lhm;")
    private class133 field4606;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lrd;")
    private class204 field4603;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lw;")
    private class179 field4612;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "[I")
    private static int[] field4609 = new int[1000];

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4613 = Boolean.FALSE;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[F")
    private static float[] field4608 = new float[4];

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[F")
    private static float[] field4610 = new float[4];

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "F")
    private float field4638;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "F")
    public float field4641;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "F")
    public float field4644;

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "F")
    public float field4650;

    @OriginalMember(owner = "client!bf", name = "Nb", descriptor = "F")
    public float field4677;

    @OriginalMember(owner = "client!bf", name = "Qb", descriptor = "F")
    public float field4680;

    @OriginalMember(owner = "client!bf", name = "Wb", descriptor = "F")
    public float field4686;

    @OriginalMember(owner = "client!bf", name = "gc", descriptor = "F")
    private float field4696;

    @OriginalMember(owner = "client!bf", name = "oc", descriptor = "F")
    private float field4704;

    @OriginalMember(owner = "client!bf", name = "Jc", descriptor = "F")
    public float field4725;

    @OriginalMember(owner = "client!bf", name = "Zc", descriptor = "F")
    public float field4741;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    private int field4639;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!bf", name = "Bb", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!bf", name = "Db", descriptor = "I")
    private int field4667;

    @OriginalMember(owner = "client!bf", name = "Fb", descriptor = "I")
    public int field4669;

    @OriginalMember(owner = "client!bf", name = "Ob", descriptor = "I")
    private int field4678;

    @OriginalMember(owner = "client!bf", name = "Rb", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!bf", name = "ac", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!bf", name = "dc", descriptor = "I")
    private int field4693;

    @OriginalMember(owner = "client!bf", name = "wc", descriptor = "I")
    private int field4712;

    @OriginalMember(owner = "client!bf", name = "Vc", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!bf", name = "Wc", descriptor = "I")
    private int field4738;

    @OriginalMember(owner = "client!bf", name = "Yc", descriptor = "I")
    private int field4740;

    @OriginalMember(owner = "client!bf", name = "Gb", descriptor = "J")
    private long field4670;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lmu;")
    public class180 field4645;

    @OriginalMember(owner = "client!bf", name = "Yb", descriptor = "Lmu;")
    public class180 field4688;

    @OriginalMember(owner = "client!bf", name = "Tb", descriptor = "Lln;")
    private class234 field4683;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Lmf;")
    private class264 field4617;

    @OriginalMember(owner = "client!bf", name = "hc", descriptor = "Lfd;")
    private class337 field4697;

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "Lua;")
    public class435 field4654;

    @OriginalMember(owner = "client!bf", name = "Uc", descriptor = "Ldl;")
    private class43 field4736;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "Lmp;")
    public class493 field4648;

    @OriginalMember(owner = "client!bf", name = "Cb", descriptor = "Lmp;")
    public class493 field4666;

    @OriginalMember(owner = "client!bf", name = "Ib", descriptor = "Lmp;")
    public class493 field4672;

    @OriginalMember(owner = "client!bf", name = "jc", descriptor = "Lmp;")
    public class493 field4699;

    @OriginalMember(owner = "client!bf", name = "vc", descriptor = "Lmp;")
    public class493 field4711;

    @OriginalMember(owner = "client!bf", name = "Gc", descriptor = "Lmp;")
    public class493 field4722;

    @OriginalMember(owner = "client!bf", name = "Lc", descriptor = "Lmp;")
    public class493 field4727;

    @OriginalMember(owner = "client!bf", name = "Tc", descriptor = "Lmp;")
    public class493 field4735;

    @OriginalMember(owner = "client!bf", name = "Kb", descriptor = "Lal;")
    public class58 field4674;

    @OriginalMember(owner = "client!bf", name = "Bc", descriptor = "Lal;")
    public class58 field4717;

    @OriginalMember(owner = "client!bf", name = "Nc", descriptor = "Lal;")
    public class58 field4729;

    @OriginalMember(owner = "client!bf", name = "qc", descriptor = "Lfg;")
    private class74 field4706;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Z")
    private boolean field4640;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "Z")
    private boolean field4647;

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "Z")
    public boolean field4655;

    @OriginalMember(owner = "client!bf", name = "zb", descriptor = "Z")
    public boolean field4663;

    @OriginalMember(owner = "client!bf", name = "Eb", descriptor = "Z")
    private boolean field4668;

    @OriginalMember(owner = "client!bf", name = "Sb", descriptor = "Z")
    public boolean field4682;

    @OriginalMember(owner = "client!bf", name = "Vb", descriptor = "Z")
    private boolean field4685;

    @OriginalMember(owner = "client!bf", name = "bc", descriptor = "Z")
    private boolean field4691;

    @OriginalMember(owner = "client!bf", name = "cc", descriptor = "Z")
    public boolean field4692;

    @OriginalMember(owner = "client!bf", name = "ec", descriptor = "Z")
    private boolean field4694;

    @OriginalMember(owner = "client!bf", name = "mc", descriptor = "Z")
    private boolean field4702;

    @OriginalMember(owner = "client!bf", name = "nc", descriptor = "Z")
    private boolean field4703;

    @OriginalMember(owner = "client!bf", name = "sc", descriptor = "Z")
    public boolean field4708;

    @OriginalMember(owner = "client!bf", name = "Ac", descriptor = "Z")
    private boolean field4716;

    @OriginalMember(owner = "client!bf", name = "Mc", descriptor = "Z")
    private boolean field4728;

    @OriginalMember(owner = "client!bf", name = "vb", descriptor = "[Lkq;")
    private class386[] field4659;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "()I", line = 6)
    public final int method1950() {
        return this.field4732;
    }

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "()Z", line = 9)
    public final boolean method1951() {
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 12)
    public final void method1952(Rectangle[] arg0, int arg1) {
        this.method1966();
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)I", line = 22)
    public final int method1953(int arg0) {
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

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Lkg;", line = 37)
    public final class163 method1954(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)I", line = 43)
    public final int method1955(int arg0) {
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lon;)V", line = 80)
    public final void method1956(class203 arg0) {
        this.field4688 = (class180) arg0;
        this.field4645.method1021(60, this.field4688);
        if (this.field4639 != 1) {
            this.method2032();
        }
    }

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "(I)V", line = 88)
    public final void method1957(int arg0) {
        if (this.field4690 == arg0) {
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
        if (this.field4685 != var3) {
            this.field4604.glColorMask(var3, var3, var3, true);
            this.field4685 = var3;
        }
        if (this.field4694 != var4) {
            if (var4) {
                this.field4604.glEnable(3008);
            } else {
                this.field4604.glDisable(3008);
            }
            this.field4694 = var4;
        }
        if (this.field4693 != var2) {
            if (var2 == 1) {
                this.field4604.glEnable(3042);
                this.field4604.glBlendEquation(32774);
                this.field4604.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4604.glEnable(3042);
                this.field4604.glBlendEquation(32774);
                this.field4604.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4604.glEnable(3042);
                this.field4604.glBlendEquation(32778);
                this.field4604.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4604.glEnable(3042);
                this.field4604.glBlendEquation(32774);
                this.field4604.glBlendFunc(774, 1);
            } else {
                this.field4604.glDisable(3042);
            }
            this.field4693 = var2;
        }
        this.field4690 = arg0;
        this.field4678 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "(I)V", line = 202)
    public final void method1958(int arg0) {
        field4608[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4608[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4608[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4608[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4604.glTexEnvfv(8960, 8705, field4608, 0);
    }

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "()V", line = 209)
    private final void method1959() {
        if (this.field4678 == 1) {
            return;
        }
        this.method1974();
        this.method1971(false);
        this.method1961(false);
        this.method2035(false);
        this.method2040(false);
        this.method2106((class386) null);
        this.method1963(-2);
        this.method1984(0);
        this.field4678 = 1;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "()Lon;", line = 225)
    public final class203 method1960() {
        return this.field4615;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)V", line = 228)
    public final void method1961(boolean arg0) {
        if (this.field4728 != arg0) {
            this.field4728 = arg0;
            this.method2004();
            this.field4678 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lfg;)V", line = 237)
    public final void method1962(class74 arg0) {
        if (this.field4706 != arg0 && this.field4662) {
            this.field4604.glBindBufferARB(34962, arg0.method125());
            this.field4706 = arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "(I)V", line = 246)
    public final void method1963(int arg0) {
        this.method1972(arg0, true);
    }

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "()V", line = 251)
    public final void method1964() {
        if (this.field4612.method920((byte) -35)) {
            this.field4603.method1168(this.field4612);
            this.field4611.method2177(-113);
        }
    }

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "()V", line = 261)
    public final void method1965() {
        this.field4606.method811(false, -64, false, 0);
        this.field4708 = false;
        this.method2030();
        this.method2076();
    }

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "()V", line = 270)
    public final void method1966() {
        try {
            this.field4605.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V", line = 281)
    public final synchronized void method1967(int arg0, int arg1) {
        class37 var3 = new class37(arg1);
        var3.field6047 = (long) arg0;
        this.field4631.method641(var3, (byte) -93);
    }

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "()Z", line = 289)
    public final boolean method1968() {
        if (!this.field4612.method920((byte) -71)) {
            if (!this.field4603.method1161(this.field4612)) {
                return false;
            }
            this.field4611.method2177(-70);
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V", line = 303)
    public final void method1969(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4646 < arg0) {
            this.field4646 = arg0;
        }
        if (this.field4710 > arg2) {
            this.field4710 = arg2;
        }
        if (this.field4718 < arg1) {
            this.field4718 = arg1;
        }
        if (this.field4705 > arg3) {
            this.field4705 = arg3;
        }
        this.field4604.glEnable(3089);
        this.method2027();
        this.method2056();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIII)V", line = 323)
    public final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(Z)V", line = 328)
    public final void method1971(boolean arg0) {
        if (this.field4716 != arg0) {
            this.field4716 = arg0;
            this.method2076();
            this.field4678 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V", line = 337)
    public final void method1972(int arg0, boolean arg1) {
        this.method2101(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIII)V", line = 343)
    public final void method1973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1959();
        this.method1957(arg5);
        this.field4604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4691) {
            this.field4604.glDisable(32925);
        }
        this.field4604.glBegin(2);
        this.field4604.glVertex2f(var7, var8);
        this.field4604.glVertex2f(var7, var10);
        this.field4604.glVertex2f(var9, var10);
        this.field4604.glVertex2f(var9, var8);
        this.field4604.glEnd();
        if (this.field4691) {
            this.field4604.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "()V", line = 367)
    private final void method1974() {
        if (this.field4639 == 1) {
            return;
        }
        this.field4604.glMatrixMode(5889);
        this.field4604.glLoadIdentity();
        if (this.field4622 > 0 && this.field4628 > 0) {
            this.field4604.glOrtho(0.0D, (double) this.field4622, (double) this.field4628, 0.0D, -1.0D, 1.0D);
        }
        this.field4604.glMatrixMode(5888);
        this.field4604.glLoadIdentity();
        this.field4639 = 1;
        this.field4678 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V", line = 384)
    public final void method1975(int arg0, int arg1, int arg2, int arg3) {
        this.field4698 = arg0;
        this.field4734 = arg1;
        this.field4660 = arg2;
        this.field4671 = arg3;
        this.method2082();
        this.method2027();
        if (this.field4639 == 3) {
            this.method2013();
        } else if (this.field4639 == 2) {
            this.method2054();
        }
    }

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "()I", line = 400)
    private final int method1976() {
        int var1 = 0;
        this.field4676 = this.field4604.glGetString(7936);
        this.field4695 = this.field4604.glGetString(7937);
        String var2 = this.field4676.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4604.glGetString(7938);
        String[] var4 = class490.method2852(0, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class455.method2673(107, var4[0]);
                int var6 = class455.method2673(105, var4[1]);
                this.field4681 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4681 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4604.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4604.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4604.glGetIntegerv(34018, var8, 0);
        this.field4665 = var8[0];
        this.field4604.glGetIntegerv(34929, var8, 0);
        this.field4738 = var8[0];
        this.field4604.glGetIntegerv(34930, var8, 0);
        this.field4642 = var8[0];
        if (this.field4665 < 2 || this.field4738 < 2 || this.field4642 < 2) {
            var1 |= 0x10;
        }
        this.field4702 = class241.field3208 != null && class241.field3208.startsWith("mac");
        this.field4721 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4662 = this.field4604.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4691 = this.field4604.isExtensionAvailable("GL_ARB_multisample");
        this.field4682 = this.field4604.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4604.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4604.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4655 = this.field4604.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4739 = this.field4604.isExtensionAvailable("GL_EXT_texture3D");
        this.field4684 = this.field4604.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4663 = this.field4604.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4714 = this.field4604.isExtensionAvailable("GL_ARB_texture_float");
        this.field4692 = false;
        this.field4656 = this.field4604.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "()I", line = 471)
    public final int method1977() {
        return 4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Lof;)V", line = 477)
    public final void method1978(int arg0, class404[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class404 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4610[0] = (float) var4.field5539;
            field4610[1] = (float) var4.field5536;
            field4610[2] = (float) var4.field5541;
            field4610[3] = 1.0F;
            this.field4604.glLightfv(var5, 4611, field4610, 0);
            int var6 = var4.field5542;
            float var7 = var4.field5540 / 255.0F;
            field4610[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4610[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4610[2] = (float) (var6 & 0xFF) * var7;
            this.field4604.glLightfv(var5, 4609, field4610, 0);
            this.field4604.glLightf(var5, 4617, 1.0F / (float) (var4.field5545 * var4.field5545));
            this.field4604.glEnable(var5);
        }
        while (var3 < this.field4653) {
            this.field4604.glDisable(var3 + 16386);
            var3++;
        }
        this.field4653 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I", line = 513)
    public final int method1979(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lkj;Lkj;Lkj;Lkj;)V", line = 516)
    public final void method1980(class366 arg0, class366 arg1, class366 arg2, class366 arg3) {
        if (arg0 == null) {
            this.field4604.glDisableClientState(32884);
        } else {
            this.field4604.glEnableClientState(32884);
            arg0.method2235(-9047);
        }
        if (arg1 == null) {
            this.field4604.glDisableClientState(32885);
        } else {
            this.field4604.glEnableClientState(32885);
            arg1.method2234(-20741);
        }
        if (arg2 == null) {
            this.field4604.glDisableClientState(32886);
        } else {
            this.field4604.glEnableClientState(32886);
            arg2.method2236(-108);
        }
        if (arg3 == null) {
            this.field4604.glDisableClientState(32888);
        } else {
            this.field4604.glEnableClientState(32888);
            arg3.method2237(true);
        }
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(IIII)V", line = 554)
    public final void method1981(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4622) {
            arg2 = this.field4622;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4628) {
            arg3 = this.field4628;
        }
        this.field4646 = arg0;
        this.field4718 = arg1;
        this.field4710 = arg2;
        this.field4705 = arg3;
        this.field4604.glEnable(3089);
        this.method2027();
        this.method2056();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIIII)Ljd;", line = 575)
    public final class139 method1982(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class269(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "()V", line = 578)
    public final void method1983() {
        this.field4604.glPopMatrix();
    }

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "(I)V", line = 581)
    public final void method1984(int arg0) {
        if (arg0 == 0) {
            this.method1994(7681, 7681);
        } else if (arg0 == 1) {
            this.method1994(8448, 8448);
        } else if (arg0 == 2) {
            this.method1994(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIILkf;II)V", line = 597)
    public final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class152 arg6, int arg7, int arg8) {
        class415 var10 = (class415) arg6;
        class234 var11 = var10.field5655;
        this.method2055();
        this.method2106(var10.field5655);
        this.method1957(arg5);
        this.method1994(7681, 8448);
        this.method1990(0, 34167, 768);
        float var12 = var11.field3110 / (float) var11.field3109;
        float var13 = var11.field3111 / (float) var11.field3108;
        this.field4604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4604.glBegin(1);
        this.field4604.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4604.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4604.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4604.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4604.glEnd();
        this.method1990(0, 5890, 768);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[I)V", line = 620)
    public final void method1986(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4688.field2437 + (float) arg0 * this.field4688.field2434 + (float) arg1 * this.field4688.field2441 + this.field4688.field2442;
        if ((var5 < (float) this.field4731) || (var5 > (float) this.field4732)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4688.field2440 + (float) arg0 * this.field4688.field2438 + (float) arg1 * this.field4688.field2433 + this.field4688.field2443) * (float) this.field4660 / var5);
        int var7 = (int) (((float) arg2 * this.field4688.field2439 + (float) arg0 * this.field4688.field2444 + (float) arg1 * this.field4688.field2435 + this.field4688.field2436) * (float) this.field4671 / var5);
        if ((float) var6 >= this.field4680 && (float) var6 <= this.field4677 && (float) var7 >= this.field4650 && (float) var7 <= this.field4741) {
            arg3[0] = (int) ((float) var6 - this.field4680);
            arg3[1] = (int) ((float) var7 - this.field4650);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "()V", line = 645)
    public final void method1987() {
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "()V", line = 649)
    public final void method1988() {
        this.field4622 = this.field4607.getWidth();
        this.field4628 = this.field4607.getHeight();
        this.field4604.glViewport(this.field4733, this.field4657, this.field4622, this.field4628);
        this.method2025();
        this.method2006();
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(IIII)V", line = 659)
    public final void method1989(int arg0, int arg1, int arg2, int arg3) {
        this.field4708 = true;
        this.field4715 = arg1;
        this.field4726 = arg2;
        this.field4713 = arg3;
        this.method2030();
        this.method2076();
        this.field4606.method811(false, -70, false, 3);
        this.field4606.method810(3, true, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 669)
    public final void method1990(int arg0, int arg1, int arg2) {
        this.field4604.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4604.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "()Z", line = 675)
    public final boolean method1991() {
        return this.field4606.method812(3, true);
    }

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "()Z", line = 678)
    public final boolean method1992() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ltp;)V", line = 681)
    public final void method1993(class342 arg0) {
        this.field4614.method2726(this, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(II)V", line = 684)
    public final void method1994(int arg0, int arg1) {
        if (this.field4712 != 0) {
            this.field4604.glTexEnvi(8960, 34161, arg0);
            this.field4604.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4658 != arg0) {
            this.field4604.glTexEnvi(8960, 34161, arg0);
            this.field4658 = arg0;
            var3 = true;
        }
        if (this.field4724 != arg1) {
            this.field4604.glTexEnvi(8960, 34162, arg1);
            this.field4724 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4678 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "()Z", line = 716)
    public final boolean method1995() {
        return this.field4612.method1018();
    }

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "()Z", line = 719)
    public final boolean method1996() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FF)V", line = 724)
    public final void method1997(float arg0, float arg1) {
        if (this.field4686 == arg0 && this.field4725 == arg1) {
            return;
        }
        this.field4686 = arg0;
        this.field4725 = arg1;
        this.method2037();
        if (this.field4639 == 3) {
            this.method2013();
        } else if (this.field4639 == 2) {
            this.method2054();
        }
    }

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "()I", line = 740)
    public final int method1998() {
        return this.field4731;
    }

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "()Z", line = 745)
    public final boolean method1999() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "()V", line = 750)
    private final void method2000() {
        this.method1963(-2);
        for (int var1 = this.field4665 - 1; var1 >= 0; var1--) {
            this.method2067(var1);
            this.method2106((class386) null);
            this.field4604.glTexEnvi(8960, 8704, 34160);
        }
        this.method1994(8448, 8448);
        this.method1990(2, 34168, 770);
        this.method2044();
        this.field4690 = 1;
        this.field4604.glEnable(3042);
        this.field4604.glBlendFunc(770, 771);
        this.field4693 = 1;
        this.field4604.glEnable(3008);
        this.field4604.glAlphaFunc(516, 0.0F);
        this.field4694 = true;
        this.field4604.glColorMask(true, true, true, true);
        this.field4685 = true;
        this.method1971(true);
        this.method1961(true);
        this.method2035(true);
        this.method2040(true);
        this.method2025();
        this.field4604.setSwapInterval(0);
        this.field4604.glShadeModel(7425);
        this.field4604.glClearDepth(1.0F);
        this.field4604.glDepthFunc(515);
        this.field4604.glPolygonMode(1028, 6914);
        this.field4604.glEnable(2884);
        this.field4604.glCullFace(1029);
        this.field4604.glMatrixMode(5888);
        this.field4604.glLoadIdentity();
        this.field4604.glColorMaterial(1028, 5634);
        this.field4604.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4604.glLightfv(var4, 4608, var2, 0);
            this.field4604.glLightf(var4, 4615, 0.0F);
            this.field4604.glLightf(var4, 4616, 0.0F);
        }
        this.field4604.glEnable(16384);
        this.field4604.glEnable(16385);
        this.field4604.glFogf(2914, 0.95F);
        this.field4604.glFogi(2917, 9729);
        this.field4604.glHint(3156, 4353);
        this.field4730 = this.field4723 = -1;
        this.method2006();
    }

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "()V", line = 814)
    private final void method2001() {
        this.field4604.glDepthMask(this.field4668 && this.field4689);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 822)
    public final synchronized void method2002(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4629.method651((byte) -118)) {
            class37 var4 = (class37) this.field4629.method650((byte) -3);
            field4609[var2++] = (int) var4.field6047;
            this.field4621 -= var4.field555;
            if (var2 == 1000) {
                this.field4604.glDeleteBuffersARB(var2, field4609, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4604.glDeleteBuffersARB(var2, field4609, 0);
            var2 = 0;
        }
        while (!this.field4630.method651((byte) -117)) {
            class37 var5 = (class37) this.field4630.method650((byte) -3);
            field4609[var2++] = (int) var5.field6047;
            this.field4626 -= var5.field555;
            if (var2 == 1000) {
                this.field4604.glDeleteTextures(var2, field4609, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4604.glDeleteTextures(var2, field4609, 0);
            var2 = 0;
        }
        while (!this.field4631.method651((byte) -120)) {
            class37 var6 = (class37) this.field4631.method650((byte) -3);
            field4609[var2++] = var6.field555;
            if (var2 == 1000) {
                this.field4604.glDeleteFramebuffersEXT(var2, field4609, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4604.glDeleteFramebuffersEXT(var2, field4609, 0);
            var2 = 0;
        }
        while (!this.field4632.method651((byte) -108)) {
            class37 var7 = (class37) this.field4632.method650((byte) -3);
            field4609[var2++] = (int) var7.field6047;
            this.field4627 -= var7.field555;
            if (var2 == 1000) {
                this.field4604.glDeleteRenderbuffersEXT(var2, field4609, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4604.glDeleteRenderbuffersEXT(var2, field4609, 0);
            var2 = 0;
        }
        while (!this.field4633.method651((byte) -109)) {
            class37 var8 = (class37) this.field4633.method650((byte) -3);
            field4609[var2++] = (int) var8.field6047;
            if (var2 == 1000) {
                this.field4604.glDeleteProgramsARB(var2, field4609, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4604.glDeleteProgramsARB(var2, field4609, 0);
            boolean var9 = false;
        }
        while (!this.field4624.method651((byte) -128)) {
            class37 var10 = (class37) this.field4624.method650((byte) -3);
            this.field4604.glDeleteLists((int) var10.field6047, var10.field555);
        }
        while (!this.field4634.method651((byte) -127)) {
            class37 var11 = (class37) this.field4634.method650((byte) -3);
            this.field4604.glDeleteObjectARB(var11.field555);
        }
        while (!this.field4624.method651((byte) -116)) {
            class37 var12 = (class37) this.field4624.method650((byte) -3);
            this.field4604.glDeleteLists((int) var12.field6047, var12.field555);
        }
        if (this.method2086() > 100663296 && class440.method2583(25267) > this.field4670 + 60000L) {
            System.gc();
            this.field4670 = class440.method2583(25267);
        }
        this.field4625 = var3;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(IIIIII)V", line = 991)
    public final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1959();
        this.method1957(arg5);
        this.field4604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4691) {
            this.field4604.glDisable(32925);
        }
        this.field4604.glBegin(7);
        this.field4604.glVertex2f(var7, var8);
        this.field4604.glVertex2f(var7, var10);
        this.field4604.glVertex2f(var9, var10);
        this.field4604.glVertex2f(var9, var8);
        this.field4604.glEnd();
        if (this.field4691) {
            this.field4604.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "()V", line = 1015)
    private final void method2004() {
        if (this.field4728 && !this.field4640) {
            this.field4604.glEnable(2896);
        } else {
            this.field4604.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "()V", line = 1027)
    public final void method2005() {
        this.method2040(true);
        this.field4604.glClear(256);
    }

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "()V", line = 1039)
    public final void method2006() {
        this.field4646 = 0;
        this.field4718 = 0;
        this.field4710 = this.field4622;
        this.field4705 = this.field4628;
        this.field4604.glDisable(3089);
        this.method2027();
    }

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "()Z", line = 1050)
    public final boolean method2007() {
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "(I)I", line = 1054)
    public final int method2008(int arg0) {
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

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()F", line = 1066)
    public final float method2009() {
        return this.field4686;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V", line = 1071)
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4604.glLineWidth((float) arg5);
        this.method2031(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4604.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "()Z", line = 1077)
    public final boolean method2011() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "()Lon;", line = 1083)
    public final class203 method2012() {
        return new class180();
    }

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "()V", line = 1088)
    private final void method2013() {
        float var1 = (float) (-this.field4698) * this.field4664 / (float) this.field4660;
        float var2 = (float) (-this.field4734) * this.field4664 / (float) this.field4671;
        float var3 = (float) (this.field4622 - this.field4698) * this.field4664 / (float) this.field4660;
        float var4 = (float) (this.field4628 - this.field4734) * this.field4664 / (float) this.field4671;
        this.field4604.glMatrixMode(5889);
        this.field4604.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field4604.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4731 - this.field4725), (double) ((float) this.field4732 - this.field4725));
        }
        this.field4604.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(Z)V", line = 1105)
    public final void method2014(boolean arg0) {
        if (this.field4640 != arg0) {
            this.field4640 = arg0;
            this.method2004();
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V", line = 1115)
    public final void method2015(int arg0) {
        this.method2024();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lfd;)V", line = 1120)
    public final void method2016(class337 arg0) {
        if (this.field4697 != arg0 && this.field4662) {
            this.field4604.glBindBufferARB(34963, arg0.method125());
            this.field4697 = arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[I[I)Lkf;", line = 1128)
    public final class152 method2017(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class415.method2479(arg0, this, -105, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lfg;", line = 1131)
    public final class74 method2018(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class74) (this.field4662 && !arg2 || this.field4707 ? new class355(this, arg0, arg1, arg2) : new class426(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "()V", line = 1141)
    public final void method2019() {
        if (this.field4622 <= 0 && this.field4628 <= 0) {
            return;
        }
        int var1 = this.field4646;
        int var2 = this.field4710;
        int var3 = this.field4718;
        int var4 = this.field4705;
        this.method2006();
        this.field4604.glReadBuffer(1028);
        this.field4604.glDrawBuffer(1029);
        this.method2025();
        this.method1971(false);
        this.method1961(false);
        this.method2035(false);
        this.method2040(false);
        this.method2106((class386) null);
        this.method1963(-2);
        this.method1984(0);
        this.method1957(0);
        this.field4604.glMatrixMode(5889);
        this.field4604.glLoadIdentity();
        this.field4604.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4604.glMatrixMode(5888);
        this.field4604.glLoadIdentity();
        this.field4604.glRasterPos2i(0, 0);
        this.field4604.glCopyPixels(0, 0, this.field4622, this.field4628, 6144);
        this.field4604.glFlush();
        this.field4604.glReadBuffer(1029);
        this.field4604.glDrawBuffer(1029);
        this.method1981(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(II)V", line = 1178)
    public final synchronized void method2020(int arg0, int arg1) {
        class37 var3 = new class37(arg1);
        var3.field6047 = (long) arg0;
        this.field4630.method641(var3, (byte) -93);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFF)V", line = 1183)
    public final void method2021(float arg0, float arg1, float arg2, float arg3) {
        field4608[0] = arg0;
        field4608[1] = arg1;
        field4608[2] = arg2;
        field4608[3] = arg3;
        this.field4604.glTexEnvfv(8960, 8705, field4608, 0);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V", line = 1196)
    public final void method2022(int arg0, int arg1) {
        if (this.field4731 == arg0 && this.field4732 == arg1) {
            return;
        }
        this.field4731 = arg0;
        this.field4732 = arg1;
        this.method2082();
        this.method2030();
        if (this.field4639 == 3) {
            this.method2013();
        } else if (this.field4639 == 2) {
            this.method2054();
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 1215)
    public final void method2023(boolean arg0) {
    }

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "()V", line = 1218)
    private final void method2024() {
        try {
            this.field4605.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "()V", line = 1225)
    public final void method2025() {
        if (this.field4639 != 0) {
            this.field4639 = 0;
            this.field4678 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lci;IILml;)V", line = 1234)
    public class344(Canvas arg0, class287 arg1, int arg2, int arg3, class241 arg4) {
        super(arg2, arg1);
        this.field4607 = arg0;
        int var6 = 0;
        while (!this.field4607.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class374.method2298(-28114, 1000L);
        }
        this.field4607.setIgnoreRepaint(true);
        try {
            if (field4613 == null || !field4613) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4613 = Boolean.TRUE;
                } else {
                    class474 var7 = arg4.method1336(113, this.getClass());
                    while (var7.field6534 == 0) {
                        class374.method2298(-28114, 100L);
                    }
                    if (var7.field6534 == 1) {
                        field4613 = Boolean.TRUE;
                    }
                }
            }
            if (field4613 == null || !field4613) {
                throw new RuntimeException("");
            }
            this.field4605 = new context();
            if (!this.field4605.choosePixelFormat(this.field4607, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4605.createContext()) {
                this.method2061();
                this.field4604 = this.field4605.getGL();
                int var8 = this.method1976();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4652 = this.field4721 ? 33639 : 5121;
                String var9 = this.field4676.toLowerCase();
                String var10 = this.field4695.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class490.method2852(0, ' ', var10.replace('/', ' '));
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class59.method419(false, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class59.method419(false, var16.substring(0, 4))) {
                                        var11 = class455.method2673(109, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4662 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4739 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4714 = false;
                    }
                    this.field4684 &= this.field4604.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4707 = this.field4662;
                }
                if (var9.contains("intel")) {
                    this.field4656 = false;
                }
                if (this.field4662) {
                    try {
                        int[] var18 = new int[1];
                        this.field4604.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2028(this);
                this.method1988();
                this.method2042();
                new class340(this);
                this.field4611 = new class353(this, this.field4988);
                class301.method1686((byte) 72, true, true);
                this.field4616 = true;
                this.field4606 = new class133(this);
                this.field4603 = new class204(this);
                this.field4612 = new class179(this);
                this.method2000();
                this.field4604.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4605.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class374.method2298(-28114, 100L);
                    }
                }
                this.field4604.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method2111();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ)Ljd;", line = 1417)
    public final class139 method2026(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class269(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "()V", line = 1420)
    private final void method2027() {
        this.field4680 = (float) (this.field4646 - this.field4698);
        this.field4677 = (float) (this.field4710 - this.field4698);
        this.field4650 = (float) (this.field4718 - this.field4734);
        this.field4741 = (float) (this.field4705 - this.field4734);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lmf;)V", line = 1426)
    public final void method2028(class264 arg0) {
        if (this.field4618 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4618 >= 0) {
            this.field4619[this.field4618].method1496();
        }
        this.field4617 = this.field4619[++this.field4618] = arg0;
        this.field4617.method1495();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILkf;II)V", line = 1437)
    public final void method2029(int arg0, class152 arg1, int arg2, int arg3) {
        class415 var5 = (class415) arg1;
        class234 var6 = var5.field5655;
        this.method2055();
        this.method2106(var5.field5655);
        this.method1957(1);
        this.method1994(7681, 8448);
        this.method1990(0, 34167, 768);
        float var7 = var6.field3110 / (float) var6.field3109;
        float var8 = var6.field3111 / (float) var6.field3108;
        this.field4604.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4604.glBegin(7);
        this.field4604.glTexCoord2f((float) (this.field4646 - arg2) * var7, (float) (this.field4718 - arg3) * var8);
        this.field4604.glVertex2i(this.field4646, this.field4718);
        this.field4604.glTexCoord2f((float) (this.field4646 - arg2) * var7, (float) (this.field4705 - arg3) * var8);
        this.field4604.glVertex2i(this.field4646, this.field4705);
        this.field4604.glTexCoord2f((float) (this.field4710 - arg2) * var7, (float) (this.field4705 - arg3) * var8);
        this.field4604.glVertex2i(this.field4710, this.field4705);
        this.field4604.glTexCoord2f((float) (this.field4710 - arg2) * var7, (float) (this.field4718 - arg3) * var8);
        this.field4604.glVertex2i(this.field4710, this.field4718);
        this.field4604.glEnd();
        this.method1990(0, 5890, 768);
    }

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "()V", line = 1464)
    private final void method2030() {
        int var1;
        if (this.field4708) {
            this.field4604.glFogf(2915, 0.0F);
            this.field4604.glFogf(2916, 1.0F);
            var1 = this.field4715;
        } else {
            this.field4638 = (float) (this.field4732 - 256) - this.field4700;
            this.field4644 = this.field4638 - (float) this.field4673 * this.field4679;
            if (this.field4644 < (float) this.field4731) {
                this.field4644 = (float) this.field4731;
            }
            this.field4604.glFogf(2915, this.field4644);
            this.field4604.glFogf(2916, this.field4638);
            var1 = this.field4723;
        }
        field4608[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4608[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4608[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4604.glFogfv(2918, field4608, 0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V", line = 1490)
    public final void method2031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1959();
        this.method1957(arg5);
        this.field4604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4604.glBegin(2);
        this.field4604.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4604.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4604.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "()V", line = 1500)
    private final void method2032() {
        this.field4604.glLoadIdentity();
        this.field4604.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4604.glMultMatrixf(this.field4688.method1033((byte) -39), 0);
        this.method2036();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lfd;III)V", line = 1507)
    public final void method2033(class337 arg0, int arg1, int arg2, int arg3) {
        this.method2016(arg0);
        arg0.method126(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "()V", line = 1513)
    private final void method2034() {
        field4608[0] = this.field4661 * this.field4635;
        field4608[1] = this.field4719 * this.field4661;
        field4608[2] = this.field4661 * this.field4649;
        field4608[3] = 1.0F;
        this.field4604.glLightfv(16384, 4609, field4608, 0);
        field4608[0] = -this.field4701 * this.field4635;
        field4608[1] = -this.field4701 * this.field4719;
        field4608[2] = -this.field4701 * this.field4649;
        field4608[3] = 1.0F;
        this.field4604.glLightfv(16385, 4609, field4608, 0);
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(Z)V", line = 1526)
    public final void method2035(boolean arg0) {
        if (this.field4703 == arg0) {
            return;
        }
        if (arg0) {
            this.field4604.glEnable(2929);
        } else {
            this.field4604.glDisable(2929);
        }
        this.field4703 = arg0;
        this.field4678 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "()V", line = 1539)
    public final void method2036() {
        this.field4604.glLightfv(16384, 4611, this.field4637, 0);
        this.field4604.glLightfv(16385, 4611, this.field4687, 0);
    }

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "()V", line = 1543)
    private final void method2037() {
        if (this.field4725 == 0.0F) {
            this.field4720[10] = this.field4704;
            this.field4720[14] = this.field4696;
        } else {
            float var1 = this.field4686 / (this.field4725 + this.field4686);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4696 * (1.0F - var1) / this.field4725;
            this.field4720[10] = this.field4704 + var3;
            this.field4720[14] = this.field4696 * var2;
        }
        this.field4709 = (this.field4720[14] - (float) this.field4732) / this.field4720[10];
        this.field4643 = (float) this.field4732 - this.field4725;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[BIZ)Lfg;", line = 1568)
    public final class74 method2038(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class74) (this.field4662 && !arg3 || this.field4707 ? new class355(this, arg0, arg1, arg2, arg3) : new class426(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(IIIIII)Lrc;", line = 1576)
    public final class346 method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4663 ? new class229(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(Z)V", line = 1579)
    public final void method2040(boolean arg0) {
        if (this.field4668 != arg0) {
            this.field4668 = arg0;
            this.method2001();
            this.field4678 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V", line = 1588)
    public final void method2041(int arg0) {
        this.method2061();
    }

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "()V", line = 1592)
    private final void method2042() {
        this.field4688 = new class180();
        this.field4645 = new class180();
        this.field4659 = new class386[this.field4665];
        this.field4674 = new class58(this, 3553, 6408, 1, 1);
        this.field4717 = new class58(this, 3553, 6408, 1, 1);
        this.field4729 = new class58(this, 3553, 6408, 1, 1);
        this.field4699 = new class493(this);
        this.field4648 = new class493(this);
        this.field4666 = new class493(this);
        this.field4735 = new class493(this);
        this.field4711 = new class493(this);
        this.field4672 = new class493(this);
        this.field4727 = new class493(this);
        this.field4722 = new class493(this);
        if (this.field4656) {
            this.field4654 = new class435(this);
        }
        this.field4614.method2728(this);
    }

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "()Z", line = 1614)
    public final boolean method2043() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "()V", line = 1617)
    private final void method2044() {
        if (this.field4647) {
            this.field4604.glMatrixMode(5890);
            this.field4604.glLoadIdentity();
            this.field4604.glMatrixMode(5888);
            this.field4647 = false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "(I)V", line = 1628)
    public final synchronized void method2045(int arg0) {
        class37 var2 = new class37(arg0);
        this.field4634.method641(var2, (byte) -93);
    }

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "()I", line = 1633)
    public final int method2046() {
        int var1 = this.field4737;
        this.field4737 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "()I", line = 1645)
    public final int method2047() {
        int var1 = this.field4740;
        this.field4740 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[BII)V", line = 1654)
    public final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4683 == null || this.field4683.field782 < arg2 || this.field4683.field783 < arg3) {
            this.field4683 = class234.method1307(false, 6406, this, arg6, arg3, 6406, 124, arg2);
            this.field4683.method415(false, false);
            var10 = this.field4683.field3111;
            var11 = this.field4683.field3110;
        } else {
            this.field4683.method412(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4683.field3111 / (float) this.field4683.field783;
            var11 = (float) arg2 * this.field4683.field3110 / (float) this.field4683.field782;
        }
        this.method2055();
        this.method2106(this.field4683);
        this.method1957(arg8);
        this.field4604.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1958(arg5);
        this.method1994(34165, 34165);
        this.method1990(0, 34166, 768);
        this.method1990(2, 5890, 770);
        this.method2068(0, 34166, 770);
        this.method2068(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4604.glBegin(7);
        this.field4604.glTexCoord2f(0.0F, 0.0F);
        this.field4604.glVertex2f(var12, var13);
        this.field4604.glTexCoord2f(0.0F, var11);
        this.field4604.glVertex2f(var12, var15);
        this.field4604.glTexCoord2f(var10, var11);
        this.field4604.glVertex2f(var14, var15);
        this.field4604.glTexCoord2f(var10, 0.0F);
        this.field4604.glVertex2f(var14, var13);
        this.field4604.glEnd();
        this.method1990(0, 5890, 768);
        this.method1990(2, 34166, 770);
        this.method2068(0, 5890, 770);
        this.method2068(2, 34166, 770);
    }

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "()Lmf;", line = 1704)
    public final class264 method2049() {
        return this.field4617;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ldk;Z)Ljd;", line = 1708)
    public final class139 method2050(class325 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field4333 * arg0.field4331];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4330 == null) {
            for (int var8 = 0; var8 < arg0.field4333; var8++) {
                for (int var9 = 0; var9 < arg0.field4331; var9++) {
                    int var10 = arg0.field4334[arg0.field4337[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field4333; var6++) {
                for (int var7 = 0; var7 < arg0.field4331; var7++) {
                    var3[var5++] = arg0.field4330[var4] << 24 | arg0.field4334[arg0.field4337[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class139 var11 = this.method1982(var3, 0, arg0.field4331, arg0.field4331, arg0.field4333);
        var11.method772(arg0.field4336, arg0.field4329, arg0.field4332, arg0.field4335);
        return var11;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lgn;Ltp;Lon;Lau;I)V", line = 1764)
    public final void method2051(class456 arg0, class342 arg1, class203 arg2, class478 arg3, int arg4) {
        arg0.method1880(arg2, arg3, arg4);
        this.method1993(arg1);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIII)V", line = 1771)
    public final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1959();
        this.method1957(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4604.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4604.glBegin(1);
        this.field4604.glVertex2f(var6, var7);
        this.field4604.glVertex2f(var6, (float) arg2 + var7);
        this.field4604.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "(I)V", line = 1785)
    public final synchronized void method2053(int arg0) {
        class37 var2 = new class37(arg0);
        this.field4631.method641(var2, (byte) -93);
    }

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "()V", line = 1789)
    private final void method2054() {
        this.field4604.glMatrixMode(5889);
        this.field4604.glLoadMatrixf(this.field4720, 0);
        this.field4604.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "()V", line = 1795)
    public final void method2055() {
        if (this.field4678 == 2) {
            return;
        }
        this.method1974();
        this.method1971(false);
        this.method1961(false);
        this.method2035(false);
        this.method2040(false);
        this.method1963(-2);
        this.field4678 = 2;
    }

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "()V", line = 1811)
    private final void method2056() {
        if (this.field4646 <= this.field4710 && this.field4718 <= this.field4705) {
            this.field4604.glScissor(this.field4733 + this.field4646, this.field4657 + this.field4628 - this.field4705, this.field4710 - this.field4646, this.field4705 - this.field4718);
        } else {
            this.field4604.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(F)V", line = 1818)
    public final void method2057(float arg0) {
        if (this.field4664 != arg0) {
            this.field4664 = arg0;
            if (this.field4639 == 3) {
                this.method2013();
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "()V", line = 1829)
    private final void method2058() {
        if (this.field4639 != 3) {
            this.field4639 = 3;
            this.method2013();
            this.method2032();
            this.field4678 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 1841)
    public final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "()V", line = 1844)
    public final void method2060() {
        if (this.field4639 != 2) {
            this.field4639 = 2;
            this.method2054();
            this.method2032();
            this.field4678 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "()V", line = 1857)
    private final void method2061() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4605.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class374.method2298(-28114, 1000L);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 1878)
    public final void method2062(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lmf;)V", line = 1885)
    public final void method2063(class264 arg0) {
        if (this.field4618 < 0 || this.field4619[this.field4618] != arg0) {
            throw new RuntimeException();
        }
        this.field4619[this.field4618--] = null;
        arg0.method1496();
        if (this.field4618 >= 0) {
            this.field4617 = this.field4619[this.field4618];
            this.field4617.method1495();
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V", line = 1901)
    public final void method2064(int arg0) {
        this.method1957(0);
        this.field4604.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4604.glClear(16384);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lmu;)V", line = 1909)
    public final void method2065(class180 arg0) {
        this.field4604.glPushMatrix();
        this.field4604.glMultMatrixf(arg0.method1033((byte) -39), 0);
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(IIII)V", line = 1914)
    public final void method2066(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4708) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4715 = arg1;
        this.field4726 = arg2;
        this.field4713 = arg3;
        this.method2030();
        this.field4606.method810(3, true, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "(I)V", line = 1926)
    public final void method2067(int arg0) {
        if (this.field4712 != arg0) {
            this.field4604.glActiveTexture(arg0 + 33984);
            this.field4712 = arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V", line = 1938)
    public final void method2068(int arg0, int arg1, int arg2) {
        this.field4604.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4604.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 1944)
    public final void method2069(boolean arg0) {
        this.field4689 = arg0;
        this.method2001();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(FFF)V", line = 1948)
    private final void method2070(float arg0, float arg1, float arg2) {
        this.field4604.glMatrixMode(5890);
        if (this.field4647) {
            this.field4604.glLoadIdentity();
        }
        this.field4604.glTranslatef(arg0, arg1, arg2);
        this.field4604.glMatrixMode(5888);
        this.field4647 = true;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V", line = 1957)
    public final void method2071(int arg0, int arg1, int arg2) {
        this.field4604.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "(I)V", line = 1964)
    public final synchronized void method2072(int arg0) {
        class37 var2 = new class37(arg0);
        this.field4633.method641(var2, (byte) -93);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)V", line = 1970)
    public final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1959();
        this.method1957(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4604.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4604.glBegin(1);
        this.field4604.glVertex2f(var6, var7);
        this.field4604.glVertex2f((float) arg2 + var6, var7);
        this.field4604.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([I)V", line = 1985)
    public final void method2074(int[] arg0) {
        arg0[0] = this.field4646;
        arg0[1] = this.field4718;
        arg0[2] = this.field4710;
        arg0[3] = this.field4705;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IFFFFF)V", line = 1994)
    public final void method2075(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4730 != arg0;
        if (var7 || this.field4661 != arg1 || this.field4701 != arg2) {
            this.field4730 = arg0;
            this.field4661 = arg1;
            this.field4701 = arg2;
            if (var7) {
                this.field4635 = (float) (this.field4730 & 0xFF0000) / 1.671168E7F;
                this.field4719 = (float) (this.field4730 & 0xFFFF) / 65535.0F;
                this.field4649 = (float) (this.field4730 & 0xFF) / 255.0F;
                this.method2090();
            }
            this.method2034();
        }
        if (this.field4675[0] == arg3 && this.field4675[1] == arg4 && this.field4675[2] == arg5) {
            return;
        }
        this.field4675[0] = arg3;
        this.field4675[1] = arg4;
        this.field4675[2] = arg5;
        this.field4636[0] = -arg3;
        this.field4636[1] = -arg4;
        this.field4636[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4637[0] = arg3 * var8;
        this.field4637[1] = arg4 * var8;
        this.field4637[2] = arg5 * var8;
        this.field4687[0] = -this.field4637[0];
        this.field4687[1] = -this.field4637[1];
        this.field4687[2] = -this.field4637[2];
        this.method2036();
        this.field4651 = (int) (arg3 * 256.0F / arg4);
        this.field4669 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "()V", line = 2034)
    private final void method2076() {
        if (this.field4716 && this.field4708 | this.field4673 >= 0) {
            this.field4604.glEnable(2912);
        } else {
            this.field4604.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "()Lqd;", line = 2041)
    public final class286 method2077() {
        return this.field4736 == null ? null : this.field4736.method36(25067);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I[BIZ)Lfd;", line = 2046)
    public final class337 method2078(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class337) (this.field4662 && !arg3 || this.field4707 ? new class20(this, arg0, arg1, arg2, arg3) : new class319(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "()Z", line = 2054)
    public final boolean method2079() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "()Z", line = 2058)
    public final boolean method2080() {
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lgn;Ltp;Lon;[Lau;I)V", line = 2061)
    public final void method2081(class456[] arg0, class342 arg1, class203 arg2, class478[] arg3, int arg4) {
        this.method2102(arg0, arg2, arg3, arg4);
        this.method1993(arg1);
    }

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "()V", line = 2066)
    private final void method2082() {
        float[] var1 = this.field4720;
        float var2 = (float) (-this.field4698 * this.field4731) / (float) this.field4660;
        float var3 = (float) ((this.field4622 - this.field4698) * this.field4731) / (float) this.field4660;
        float var4 = (float) (this.field4734 * this.field4731) / (float) this.field4671;
        float var5 = (float) ((this.field4734 - this.field4628) * this.field4731) / (float) this.field4671;
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
            float var6 = (float) this.field4731 * 2.0F;
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
            var1[10] = this.field4704 = (float) (-(this.field4732 + this.field4731)) / (float) (this.field4732 - this.field4731);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field4696 = -((float) this.field4732 * var6) / (float) (this.field4732 - this.field4731);
            var1[15] = 0.0F;
        }
        this.method2037();
    }

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "()V", line = 2121)
    public final void method2083() {
        this.field4603.method1163();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lvi;[Ldk;Z)Lur;", line = 2124)
    public final class345 method2084(class347 arg0, class325[] arg1, boolean arg2) {
        return new class320(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "()Z", line = 2127)
    public final boolean method2085() {
        return !this.field4702;
    }

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "()I", line = 2130)
    public final int method2086() {
        return this.field4626 + this.field4621 + this.field4627;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 2134)
    public final void method1496() {
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(F)V", line = 2138)
    public final void method2087(float arg0) {
        if (this.field4641 != arg0) {
            this.field4641 = arg0;
            this.method2090();
        }
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(II)V", line = 2147)
    public final synchronized void method2088(int arg0, int arg1) {
        class37 var3 = new class37(arg1);
        var3.field6047 = (long) arg0;
        this.field4629.method641(var3, (byte) -93);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[I[[IIII)Ltf;", line = 2152)
    public final class177 method2089(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class238(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()I", line = 2155)
    public final int method1497() {
        return this.field4628;
    }

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "()V", line = 2159)
    private final void method2090() {
        field4608[0] = this.field4641 * this.field4635;
        field4608[1] = this.field4719 * this.field4641;
        field4608[2] = this.field4649 * this.field4641;
        field4608[3] = 1.0F;
        this.field4604.glLightModelfv(2899, field4608, 0);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(IIII)V", line = 2169)
    public final void method2091(int arg0, int arg1, int arg2, int arg3) {
        this.field4603.method1167(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(II)V", line = 2172)
    public final void method2092(int arg0, int arg1) {
        this.field4733 = arg0;
        this.field4657 = arg1;
        this.field4604.glViewport(arg0, arg1, this.field4622, this.field4628);
        this.method2056();
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V", line = 2178)
    public final void method2093(boolean arg0) {
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lpr;IIII)Lgn;", line = 2180)
    public final class456 method2094(class284 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class493(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "()V", line = 2183)
    public final void method2095() {
        if (this.field4678 == 4) {
            return;
        }
        this.method1974();
        this.method1971(false);
        this.method1961(false);
        this.method2035(false);
        this.method2040(false);
        this.method1963(-2);
        this.method1957(1);
        this.method1984(1);
        this.field4678 = 4;
    }

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "()V", line = 2202)
    public final void method2096() {
        if (this.field4678 == 16) {
            return;
        }
        this.method2058();
        this.method1971(true);
        this.method2035(true);
        this.method2040(true);
        this.method1957(1);
        this.method1984(1);
        this.field4678 = 16;
    }

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "()Z", line = 2215)
    public final boolean method2097() {
        return this.field4691;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lrc;Lrc;FLrc;)Lrc;", line = 2218)
    public final class346 method2098(class346 arg0, class346 arg1, float arg2, class346 arg3) {
        if (arg0 != null && arg1 != null && this.field4663 && this.field4656) {
            class5 var5 = null;
            class43 var6 = (class43) arg0;
            class43 var7 = (class43) arg1;
            class286 var8 = var6.method36(25067);
            class286 var9 = var7.method36(25067);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3873 > var9.field3873 ? var8.field3873 : var9.field3873;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class5) {
                    class5 var11 = (class5) arg3;
                    if (var11.method35(1) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class5(this, var10);
                }
                var5.method37(arg2, var9, (byte) 96, var8);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIIII)Z", line = 2256)
    public final boolean method2099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4688.field2437 + (float) arg0 * this.field4688.field2434 + (float) arg1 * this.field4688.field2441 + this.field4688.field2442;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4688.field2437 + (float) arg3 * this.field4688.field2434 + (float) arg4 * this.field4688.field2441 + this.field4688.field2442;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4731) || !(var8 < (float) this.field4731)) || !(!(var7 > (float) this.field4732) || !(var8 > (float) this.field4732))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4688.field2440 + (float) arg0 * this.field4688.field2438 + (float) arg1 * this.field4688.field2433 + this.field4688.field2443) * (float) this.field4660 / var7);
        int var10 = (int) (((float) arg5 * this.field4688.field2440 + (float) arg3 * this.field4688.field2438 + (float) arg4 * this.field4688.field2433 + this.field4688.field2443) * (float) this.field4660 / var8);
        if ((float) var9 < this.field4680 && (float) var10 < this.field4680 || (float) var9 > this.field4677 && (float) var10 > this.field4677) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4688.field2439 + (float) arg0 * this.field4688.field2444 + (float) arg1 * this.field4688.field2435 + this.field4688.field2436) * (float) this.field4671 / var7);
            int var12 = (int) (((float) arg5 * this.field4688.field2439 + (float) arg3 * this.field4688.field2444 + (float) arg4 * this.field4688.field2435 + this.field4688.field2436) * (float) this.field4671 / var8);
            return (!((float) var11 < this.field4650) || !((float) var12 < this.field4650)) && (!((float) var11 > this.field4741) || !((float) var12 > this.field4741));
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lkg;)V", line = 2287)
    public final void method2100(class163 arg0) {
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZZ)V", line = 2289)
    public final void method2101(int arg0, boolean arg1, boolean arg2) {
        if (this.field4667 != arg0) {
            if (arg0 < 0) {
                this.method2044();
                this.method2106((class386) null);
                if (!this.field4708) {
                    this.field4606.method811(arg2, 32, arg1, 0);
                }
            } else {
                class58 var4 = this.field4611.method2178(arg0, (byte) -119);
                class23 var5 = this.field4988.method1621(18318, arg0);
                if (var5.field307 == 0 && var5.field311 == 0) {
                    this.method2044();
                } else {
                    int var6 = var5.field309 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2070((float) (this.field4625 % var7 * var5.field307) / (float) var7, (float) (this.field4625 % var7 * var5.field311) / (float) var7, 0.0F);
                }
                if (this.field4708) {
                    this.field4606.method811(arg2, -78, arg1, 3);
                    this.method2106(var4);
                } else {
                    this.field4606.method811(arg2, 62, arg1, var5.field301);
                    this.field4606.method810(3, false, var5.field315);
                    if (!this.field4606.method813(var4, 106)) {
                        this.method2106(var4);
                    }
                }
            }
            this.field4667 = arg0;
        }
        this.field4678 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lgn;Lon;[Lau;I)V", line = 2340)
    public final void method2102(class456[] arg0, class203 arg1, class478[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1880(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I", line = 2351)
    public final int method2103(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIII)[I", line = 2357)
    public final int[] method2104(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4604.glReadPixels(arg0, this.field4628 - arg1 - var6, arg2, 1, 32993, this.field4652, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 2370)
    public final void method1495() {
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(FF)V", line = 2374)
    public final void method2105(float arg0, float arg1) {
        this.field4679 = arg0;
        this.field4700 = arg1;
        if (!this.field4708) {
            this.method2030();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lkq;)V", line = 2382)
    public final void method2106(class386 arg0) {
        class386 var2 = this.field4659[this.field4712];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4604.glDisable(var2.field5342);
            } else {
                if (var2 == null) {
                    this.field4604.glEnable(arg0.field5342);
                } else if (arg0.field5342 != var2.field5342) {
                    this.field4604.glDisable(var2.field5342);
                    this.field4604.glEnable(arg0.field5342);
                }
                this.field4604.glBindTexture(arg0.field5342, arg0.method2368());
            }
            this.field4659[this.field4712] = arg0;
        }
        this.field4678 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "()F", line = 2412)
    public final float method2107() {
        return this.field4725;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V", line = 2426)
    public final void method2108(int arg0, int arg1) {
        if (this.field4723 == arg0 && this.field4673 == arg1) {
            return;
        }
        this.field4723 = arg0;
        this.field4673 = arg1;
        if (!this.field4708) {
            this.method2030();
            this.method2076();
        }
    }

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "()Z", line = 2440)
    public final boolean method2109() {
        return this.field4612.method920((byte) -42);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2446)
    public final void method2110(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "()V", line = 2450)
    public final void method2111() {
        if (this.field4604 != null) {
            try {
                this.field4603.method1166();
            } catch (Throwable var4) {
            }
            this.field4604 = null;
        }
        if (this.field4605 != null) {
            this.method2024();
            try {
                this.field4605.destroy();
            } catch (Throwable var3) {
            }
            this.field4605 = null;
        }
        if (this.field4616) {
            class136.method823(true, -1, true);
            this.field4616 = false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lrc;)V", line = 2484)
    public final void method2112(class346 arg0) {
        this.field4736 = (class43) arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFF)V", line = 2489)
    public final void method2113(float arg0, float arg1, float arg2) {
        class179.field2432 = arg0;
        class179.field2419 = arg1;
        class179.field2418 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "()V", line = 2497)
    public final void method2114() {
        if (this.field4678 == 8) {
            return;
        }
        this.method2060();
        this.method1971(true);
        this.method2035(true);
        this.method2040(true);
        this.method1957(1);
        this.method1984(1);
        this.field4678 = 8;
    }
}
