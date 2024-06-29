import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class702 extends class301 {

    @OriginalMember(owner = "client!gba", name = "Lb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9928 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gba", name = "Sb", descriptor = "Ltg;")
    public static class605 field9935 = new class605();

    @OriginalMember(owner = "client!gba", name = "Vb", descriptor = "Ltm;")
    public static class334 field9938 = new class334(52, 6);

    @OriginalMember(owner = "client!gba", name = "M", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!gba", name = "Db", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!gba", name = "Fb", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!gba", name = "Gb", descriptor = "I")
    private int field9923;

    @OriginalMember(owner = "client!gba", name = "Hb", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!gba", name = "Ib", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!gba", name = "Jb", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!gba", name = "Kb", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!gba", name = "Mb", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!gba", name = "Nb", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!gba", name = "Ob", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!gba", name = "Pb", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!gba", name = "Qb", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!gba", name = "Tb", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!gba", name = "Ub", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!gba", name = "Eb", descriptor = "Lnp;")
    private class752 field9921;

    @OriginalMember(owner = "client!gba", name = "Wb", descriptor = "Ljava/lang/String;")
    public static String field9939;

    @OriginalMember(owner = "client!gba", name = "Rb", descriptor = "[I")
    public static int[] field9934;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILha;Z)Lda;", line = 5)
    public static final class400 method3896(int arg0, int arg1, class544 arg2, boolean arg3) {
        if (arg0 > -57) {
            method3901((byte) -108);
        }
        ++field9930;
        class484 var4 = class592.method3393((byte) -97, arg3, arg2, arg1);
        return var4 == null ? null : var4.field6993;
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "(I)Z", line = 22)
    public final boolean method3897(int arg0) {
        ++field9924;
        int var2 = super.field4543[super.field4534] + -this.field9921.method4192(256) & arg0;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "([BIIB)V", line = 35)
    public final void method3898(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field9919;
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field4543[super.field4534++] + -this.field9921.method4193((byte) -33));
        }
        int var6 = 78 % ((79 - arg3) / 42);
    }

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "(II)I", line = 51)
    public final int method3899(int arg0, int arg1) {
        if (arg1 != 13509) {
            return 55;
        } else {
            ++field9937;
            return arg0 * 8 + -this.field9923;
        }
    }

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "(I)Leh;", line = 69)
    public static final class256 method3900(int arg0) {
        if (arg0 != -129) {
            field9932 = -33;
        }
        ++field9933;
        try {
            return (class256) Class.forName("cda").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "(B)V", line = 86)
    public static void method3901(byte arg0) {
        if (arg0 <= 93) {
            method3896(73, -91, (class544) null, false);
        }
        field9935 = null;
        field9934 = null;
        field9939 = null;
        field9928 = null;
        field9938 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B[I)V", line = 106)
    public final void method3902(byte arg0, int[] arg1) {
        if (arg0 != -11) {
            field9928 = null;
        }
        this.field9921 = new class752(arg1);
        ++field9927;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILnp;)V", line = 124)
    public final void method3903(int arg0, class752 arg1) {
        int var3 = 44 / ((-26 - arg0) / 55);
        ++field9920;
        this.field9921 = arg1;
    }

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "(I)V", line = 134)
    public static final void method3904(int arg0) {
        ++field9936;
        class243.field3926 = null;
        if (arg0 != 11792) {
            field9934 = null;
        }
        class255.field4028 = null;
    }

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "(II)I", line = 149)
    public final int method3905(int arg0, int arg1) {
        if (arg0 != -4) {
            field9938 = null;
        }
        ++field9926;
        int var3 = this.field9923 >> 3;
        int var4 = -(7 & this.field9923) + 8;
        this.field9923 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (class118.field1814[var4] & super.field4543[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (class118.field1814[var4] & super.field4543[var3]) + var5;
        } else {
            var6 = (super.field4543[var3] >> -arg1 + var4 & class118.field1814[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "(II)V", line = 182)
    public final void method3906(int arg0, int arg1) {
        ++field9929;
        int var3 = -110 % ((arg1 - -83) / 35);
        super.field4543[super.field4534++] = (byte) (this.field9921.method4193((byte) -33) + arg0);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V", line = 196)
    public class702(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)I", line = 205)
    public final int method3907(boolean arg0) {
        ++field9922;
        int var2 = 255 & super.field4543[super.field4534++] + -this.field9921.method4193((byte) -33);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0) {
                field9932 = -25;
            }
            return (super.field4543[super.field4534++] - this.field9921.method4193((byte) -33) & 255) + (var2 - 128 << 8);
        }
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(Z)V", line = 223)
    public final void method3908(boolean arg0) {
        ++field9925;
        this.field9923 = super.field4534 * 8;
        if (!arg0) {
            this.method3909((byte) 42);
        }
    }

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "(B)V", line = 235)
    public final void method3909(byte arg0) {
        ++field9931;
        super.field4534 = (this.field9923 - -7) / 8;
        int var2 = -51 / ((-17 - arg0) / 47);
    }
}
