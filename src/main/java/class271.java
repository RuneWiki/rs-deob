import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class271 extends class215 {

    @OriginalMember(owner = "client!jh", name = "Ub", descriptor = "I")
    public int field4637 = -1;

    @OriginalMember(owner = "client!jh", name = "Pb", descriptor = "I")
    public int field4632 = 0;

    @OriginalMember(owner = "client!jh", name = "ec", descriptor = "I")
    private int field4647 = 0;

    @OriginalMember(owner = "client!jh", name = "Qb", descriptor = "I")
    public int field4633 = -1;

    @OriginalMember(owner = "client!jh", name = "hc", descriptor = "I")
    public int field4650 = -1;

    @OriginalMember(owner = "client!jh", name = "jc", descriptor = "I")
    public int field4652 = 0;

    @OriginalMember(owner = "client!jh", name = "Tb", descriptor = "I")
    public int field4636 = 0;

    @OriginalMember(owner = "client!jh", name = "oc", descriptor = "I")
    public int field4657 = 0;

    @OriginalMember(owner = "client!jh", name = "bc", descriptor = "I")
    public int field4644 = -1;

    @OriginalMember(owner = "client!jh", name = "Vb", descriptor = "I")
    public int field4638 = 0;

    @OriginalMember(owner = "client!jh", name = "kc", descriptor = "Z")
    public boolean field4653 = false;

    @OriginalMember(owner = "client!jh", name = "ic", descriptor = "S")
    private short field4651 = 0;

    @OriginalMember(owner = "client!jh", name = "rc", descriptor = "I")
    public int field4660 = 0;

    @OriginalMember(owner = "client!jh", name = "tc", descriptor = "S")
    private short field4662 = 0;

    @OriginalMember(owner = "client!jh", name = "yc", descriptor = "I")
    public int field4667 = -1;

    @OriginalMember(owner = "client!jh", name = "ac", descriptor = "I")
    public int field4643 = -1;

    @OriginalMember(owner = "client!jh", name = "Ac", descriptor = "I")
    public int field4669 = 0;

    @OriginalMember(owner = "client!jh", name = "Yb", descriptor = "[[S")
    public static short[][] field4641 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 823, 1837, 4019, 7091, 10169, 14259, 17331, 21427, 27571, 30643, -31821, -27721, -24647, -21593, -16587, -13391, 790, 5014, 7056, 1156, 15124, 19986, 30610, -30830, -27758, -23664, -17518, -14446, -9328, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 } };

    @OriginalMember(owner = "client!jh", name = "gc", descriptor = "Z")
    public static boolean field4649 = true;

    @OriginalMember(owner = "client!jh", name = "sc", descriptor = "I")
    public static volatile int field4661 = 0;

    @OriginalMember(owner = "client!jh", name = "vc", descriptor = "I")
    public static int field4664 = 0;

    @OriginalMember(owner = "client!jh", name = "Nb", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!jh", name = "Rb", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!jh", name = "Sb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!jh", name = "Wb", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!jh", name = "Xb", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!jh", name = "Zb", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!jh", name = "dc", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!jh", name = "fc", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!jh", name = "lc", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!jh", name = "nc", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!jh", name = "pc", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!jh", name = "uc", descriptor = "I")
    public int field4663;

    @OriginalMember(owner = "client!jh", name = "wc", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!jh", name = "xc", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!jh", name = "zc", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!jh", name = "Bc", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!jh", name = "Cc", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!jh", name = "Dc", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!jh", name = "Ec", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!jh", name = "Fc", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!jh", name = "qc", descriptor = "Lqk;")
    public class201 field4659;

    @OriginalMember(owner = "client!jh", name = "mc", descriptor = "Lpj;")
    public class237 field4655;

    @OriginalMember(owner = "client!jh", name = "Ob", descriptor = "Lfa;")
    public static class239 field4631;

    @OriginalMember(owner = "client!jh", name = "cc", descriptor = "Lfb;")
    public class29 field4645;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1799(byte arg0, Component arg1) {
        arg1.addMouseListener(class210.field3585);
        ++field4635;
        if (arg0 != 6) {
            field4661 = 67;
        }
        arg1.addMouseMotionListener(class210.field3585);
        arg1.addFocusListener(class210.field3585);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILqk;IIBIIIIIIII)V")
    private final void method1800(int arg0, class201 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field4646;
        int var14 = arg0 * arg0 - -(arg10 * arg10);
        if (var14 >= 16 && var14 <= 360000) {
            int var15 = 2047 & (int) (Math.atan2((double) arg0, (double) arg10) * 325.949D);
            if (arg4 < 0) {
                this.field4637 = 90;
            }
            class201 var16 = class230.method1524(var15, super.field3695, super.field3710, super.field3700, -121, arg1, arg5);
            if (var16 != null) {
                var16.method183(0, arg12, arg9, arg2, arg11, arg8, arg3, arg7, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lie;B)V")
    public final void method1801(class32 arg0, byte arg1) {
        ++field4630;
        arg0.field647 = 0;
        int var3 = arg0.method316((byte) 111);
        boolean var4 = ~(var3 & 4) != -1;
        if (~(2 & var3) == -3) {
            this.field4662 = (short) (arg0.method316((byte) -114) << 2);
            this.field4651 = (short) (arg0.method316((byte) 108) << 2);
        } else {
            this.field4662 = 0;
            this.field4651 = 0;
        }
        int[] var5 = new int[12];
        int var6 = super.method1441((byte) 89);
        this.method1447((var3 >> 3 & 7) + 1, (byte) 127);
        this.field4647 = var3 >> 6 & 3;
        int var7 = -1;
        super.field3710 += (this.method1441((byte) 51) - var6) * 64;
        super.field3700 += 64 * (this.method1441((byte) 71) + -var6);
        int var8 = var3 & 1;
        this.field4667 = arg0.method325(122);
        this.field4637 = arg0.method325(124);
        this.field4652 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method316((byte) -121);
            if (var10 == 0) {
                var5[var9] = 0;
            } else {
                int var11 = arg0.method316((byte) 105);
                int var12 = (var10 << 8) - -var11;
                if (~var9 == -1 && var12 == 65535) {
                    var7 = arg0.method339(-16777216);
                    break;
                }
                if (~var12 <= -32769) {
                    int var23 = class224.field3863[var12 + -32768];
                    var5[var9] = class34.method362(1073741824, var23);
                    int var24 = class112.method829((byte) -82, var23).field114;
                    if (var24 != 0) {
                        this.field4652 = var24;
                    }
                } else {
                    var5[var9] = class34.method362(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        if (arg1 <= 35) {
            method1805(98, 101);
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var22 = arg0.method316((byte) 111);
            if (var22 < 0 || ~class11.field203[var14].length >= ~var22) {
                var22 = 0;
            }
            var13[var14] = var22;
        }
        super.field3723 = arg0.method339(-16777216);
        if (super.field3723 == 65535) {
            super.field3723 = -1;
        }
        super.field3687 = arg0.method339(-16777216);
        if (~super.field3687 == -65536) {
            super.field3687 = -1;
        }
        super.field3678 = super.field3687;
        super.field3711 = arg0.method339(-16777216);
        if (~super.field3711 == -65536) {
            super.field3711 = -1;
        }
        super.field3712 = arg0.method339(-16777216);
        if (super.field3712 == 65535) {
            super.field3712 = -1;
        }
        super.field3679 = arg0.method339(-16777216);
        if (super.field3679 == 65535) {
            super.field3679 = -1;
        }
        super.field3726 = arg0.method339(-16777216);
        if (~super.field3726 == -65536) {
            super.field3726 = -1;
        }
        super.field3741 = arg0.method339(-16777216);
        if (~super.field3741 == -65536) {
            super.field3741 = -1;
        }
        long var15 = arg0.method298((byte) 50);
        this.field4655 = class146.method995(270, var15).method1581((byte) -124);
        this.field4660 = arg0.method316((byte) 105);
        if (!var4) {
            this.field4669 = 0;
            this.field4657 = arg0.method316((byte) -48);
            this.field4633 = arg0.method316((byte) -37);
            if (~this.field4633 == -256) {
                this.field4633 = -1;
            }
        } else {
            this.field4669 = arg0.method339(-16777216);
            this.field4633 = -1;
            this.field4657 = this.field4660;
        }
        int var17 = this.field4632;
        this.field4632 = arg0.method316((byte) -71);
        if (this.field4632 == 0) {
            class15.method134(true, this);
        } else {
            int var18 = this.field4643;
            int var19 = this.field4650;
            int var20 = this.field4644;
            this.field4650 = arg0.method339(-16777216);
            this.field4643 = arg0.method339(-16777216);
            this.field4644 = arg0.method339(-16777216);
            if (this.field4632 != var17 || this.field4650 != var19 || ~this.field4643 != ~var18 || ~this.field4644 != ~var20) {
                class234.method1557((byte) -125, this);
            }
        }
        if (this.field4645 == null) {
            this.field4645 = new class29();
        }
        int var21 = this.field4645.field575;
        this.field4645.method273(-2844, ~var8 == -2, var7, var13, var5);
        if (var7 != var21) {
            super.field3710 = super.field3715[0] * 128 + this.method1441((byte) 114) * 64;
            super.field3700 = super.field3743[0] * 128 - -(64 * this.method1441((byte) 51));
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Lpj;")
    public final class237 method1802(byte arg0) {
        ++field4671;
        if (arg0 != -18) {
            return null;
        } else {
            class237 var2 = this.field4655;
            if (class139.field2399 != null) {
                var2 = class238.method1626(new class237[] { class139.field2399[this.field4647], var2 }, arg0 + -14);
            }
            if (class90.field1651 != null) {
                var2 = class238.method1626(new class237[] { var2, class90.field1651[this.field4647] }, -45);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()I")
    public final int method176() {
        ++field4658;
        return super.field3693;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
    public final int method1441(byte arg0) {
        if (arg0 < 49) {
            this.method183(-57, 75, -36, 43, -69, 8, -12, -49, 19L);
        }
        ++field4666;
        return this.field4645 != null && this.field4645.field575 != -1 ? method1805(this.field4645.field575, 125).field3989 : super.method1441((byte) 73);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)Z")
    public final boolean method1403(byte arg0) {
        if (arg0 <= 57) {
            return false;
        } else {
            ++field4648;
            return this.field4645 != null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIZ)V")
    public final void method1803(int arg0, int arg1, int arg2, boolean arg3) {
        super.method1444(this.method1441((byte) 122), (byte) 33, arg3, arg1, arg2);
        if (arg0 == 0) {
            ++field4665;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field4654;
        if (this.field4645 != null) {
            class256 var11 = super.field3722 != -1 && super.field3688 == 0 ? class256.method1732(super.field3722, true) : null;
            class256 var12 = super.field3696 == -1 || this.field4653 || ~super.field3723 == ~super.field3696 && var11 != null ? null : class256.method1732(super.field3696, true);
            class201 var13 = this.field4645.method268(var11, -9799, var12, super.field3673, super.field3698);
            if (var13 != null) {
                super.field3693 = var13.method176();
                if (class63.field1256 && (~this.field4645.field575 == 0 || method1805(this.field4645.field575, -50).field3954)) {
                    class201 var14 = class177.method1223(super.field3710, 0, super.field3695, 0, 1, var13, var12 == null ? super.field3673 : super.field3698, super.field3675, arg0, 160, var12 == null ? var11 : var12, (byte) 1, 240, super.field3700);
                    var14.method183(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class229.field3911 == this) {
                    for (int var15 = class144.field2599.length + -1; var15 >= 0; --var15) {
                        class71 var16 = class144.field2599[var15];
                        if (var16 != null && var16.field1393 != -1) {
                            if (~var16.field1397 == -2 && ~var16.field1391 <= -1 && ~class232.field4022.length < ~var16.field1391) {
                                class210 var17 = class232.field4022[var16.field1391];
                                if (var17 != null) {
                                    int var18 = var17.field3700 / 32 - class229.field3911.field3700 / 32;
                                    int var19 = var17.field3710 / 32 + -(class229.field3911.field3710 / 32);
                                    this.method1800(var19, var13, arg3, arg6, (byte) 49, var16.field1393, arg0, arg7, arg5, arg2, var18, arg4, arg1);
                                }
                            }
                            if (var16.field1397 == 2) {
                                int var20 = (var16.field1400 - class235.field4087) * 4 + 2 + -(class229.field3911.field3710 / 32);
                                int var21 = (var16.field1387 - class27.field494) * 4 + 2 - class229.field3911.field3700 / 32;
                                this.method1800(var20, var13, arg3, arg6, (byte) 60, var16.field1393, arg0, arg7, arg5, arg2, var21, arg4, arg1);
                            }
                            if (var16.field1397 == 10 && ~var16.field1391 <= -1 && class232.field4025.length > var16.field1391) {
                                class271 var22 = class232.field4025[var16.field1391];
                                if (var22 != null) {
                                    int var23 = var22.field3710 / 32 + -(class229.field3911.field3710 / 32);
                                    int var24 = var22.field3700 / 32 + -(class229.field3911.field3700 / 32);
                                    this.method1800(var23, var13, arg3, arg6, (byte) 86, var16.field1393, arg0, arg7, arg5, arg2, var24, arg4, arg1);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (~this.field4662 != -1 && this.field4651 != 0) {
                    int var28 = class150.field2670[arg0];
                    int var29 = class150.field2676[arg0];
                    short var30 = this.field4662;
                    short var31 = this.field4651;
                    int var32 = -var30 / 2;
                    int var33 = -var31 / 2;
                    int var34 = var28 * var33 - -(var29 * var32) >> 16;
                    int var35 = var29 * var33 + -(var28 * var32) >> 16;
                    int var36 = var30 / 2;
                    int var37 = class23.method216(-5, super.field3700 + var35, super.field3710 + var34, class274.field4798);
                    int var38 = -var31 / 2;
                    int var39 = var29 * var38 + -(var28 * var36) >> 16;
                    int var40 = var28 * var38 + var29 * var36 >> 16;
                    int var41 = -var30 / 2;
                    int var42 = class23.method216(-71, super.field3700 - -var39, super.field3710 - -var40, class274.field4798);
                    int var43 = var31 / 2;
                    int var44 = var28 * var43 + var29 * var41 >> 16;
                    int var45 = var29 * var43 + -(var28 * var41) >> 16;
                    int var46 = var30 / 2;
                    int var47 = var31 / 2;
                    int var48 = var29 * var47 + -(var28 * var46) >> 16;
                    int var49 = var28 * var47 - -(var29 * var46) >> 16;
                    int var50 = class23.method216(-56, super.field3700 + var45, super.field3710 - -var44, class274.field4798);
                    int var51 = class23.method216(-35, super.field3700 + var48, super.field3710 + var49, class274.field4798);
                    int var52 = ~var51 < ~var42 ? var42 : var51;
                    int var53 = var51 <= var50 ? var51 : var50;
                    int var54 = var37 + var51;
                    if (~var54 < ~(var42 + var50)) {
                        var54 = var42 + var50;
                    }
                    int var55 = var37 >= var50 ? var50 : var37;
                    int var56 = var42 > var37 ? var37 : var42;
                    var25 = (int) (325.95D * Math.atan2((double) (-var53 + var56), (double) var31)) & 2047;
                    if (var25 != 0) {
                        var13.method184(var25);
                    }
                    var27 = 2047 & (int) (Math.atan2((double) (-var52 + var55), (double) var30) * 325.95D);
                    if (~var27 != -1) {
                        var13.method186(var27);
                    }
                    var26 = (var54 >> 1) - super.field3695;
                    if (~var26 != -1) {
                        var13.method190(0, var26, 0);
                    }
                }
                class201 var57 = null;
                if (!this.field4653 && ~super.field3734 != 0 && ~super.field3680 != 0) {
                    class49 var58 = class190.method1288(super.field3734, (byte) 126);
                    var57 = var58.method453((byte) 66, super.field3680);
                    if (var57 != null) {
                        var57.method190(0, -super.field3721, 0);
                        if (var58.field1056) {
                            if (~var25 != -1) {
                                var57.method184(var25);
                            }
                            if (var27 != 0) {
                                var57.method186(var27);
                            }
                            if (~var26 != -1) {
                                var57.method190(0, var26, 0);
                            }
                        }
                    }
                }
                class201 var59 = null;
                if (!this.field4653 && this.field4659 != null) {
                    if (this.field4638 <= class241.field4246) {
                        this.field4659 = null;
                    }
                    if (~class241.field4246 <= ~this.field4636 && class241.field4246 < this.field4638) {
                        var59 = this.field4659;
                        var59.method190(-super.field3710 + this.field4663, -super.field3695 + this.field4642, -super.field3700 + this.field4634);
                        if (~super.field3717 != -513) {
                            if (~super.field3717 != -1025) {
                                if (super.field3717 == 1536) {
                                    var59.method168();
                                }
                            } else {
                                var59.method173();
                            }
                        } else {
                            var59.method185();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class18) var13).method192(var57);
                }
                if (var59 != null) {
                    var13 = ((class18) var13).method192(var59);
                }
                var13.field3461 = true;
                var13.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (~super.field3717 != -513) {
                        if (super.field3717 != 1024) {
                            if (super.field3717 == 1536) {
                                var59.method185();
                            }
                        } else {
                            var59.method173();
                        }
                    } else {
                        var59.method168();
                    }
                    var59.method190(-this.field4663 + super.field3710, -this.field4642 + super.field3695, -this.field4634 + super.field3700);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1804(Component arg0, int arg1) {
        ++field4639;
        Method var2 = class67.field1323;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class87.field1600);
        arg0.addFocusListener(class87.field1600);
        if (arg1 != 26130) {
            field4631 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Leb;")
    public static final class231 method1805(int arg0, int arg1) {
        int var2 = -45 % ((arg1 - 23) / 63);
        ++field4668;
        class231 var3 = (class231) class206.field3510.method940((long) arg0, 78);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class90.field1642.method1645(true, class222.method1475(120, arg0), class234.method1553(arg0, -20));
            class231 var5 = new class231();
            var5.field3970 = arg0;
            if (var4 != null) {
                var5.method1537(new class32(var4), -1);
            }
            var5.method1535(-31565);
            class206.field3510.method937(-15, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V")
    public static void method1806(byte arg0) {
        field4631 = null;
        field4641 = null;
        int var1 = -54 % ((14 - arg0) / 37);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZII)Lkk;")
    public static final class224 method1807(boolean arg0, int arg1, int arg2) {
        ++field4640;
        for (class224 var3 = (class224) class210.field3587.method673(arg0); var3 != null; var3 = (class224) class210.field3587.method680(36)) {
            if (var3.field3848 && var3.method1487(arg2, (byte) -94, arg1)) {
                return var3;
            }
        }
        if (arg0) {
            return null;
        } else {
            return null;
        }
    }
}
