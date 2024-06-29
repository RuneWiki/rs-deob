import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class605 extends class496 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field8904;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field8910;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lqp;")
    public static class586 field8915 = new class586(5, 7);

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lqc;")
    public static class325 field8916 = new class325(8);

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Lqp;")
    public static class586 field8917 = new class586(104, 6);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I", line = 3)
    public final int method3515(int arg0) {
        if (arg0 >= -125) {
            field8913 = 127;
        }
        field8907++;
        return (this.field8904 & 0x1FA701) >> 18;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method3516(int arg0) {
        if (arg0 != -1) {
            this.method3517((byte) -27);
        }
        field8909++;
        return (this.field8904 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 28)
    public final int method3517(byte arg0) {
        field8912++;
        return arg0 < 55 ? -75 : class493.method2984(this.field8904, (byte) 8);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lps;B)Lph;", line = 41)
    public static final class442 method3518(class428 arg0, byte arg1) {
        field8902++;
        if (arg1 != 50) {
            field8917 = null;
        }
        return new class442(arg0.method2622((byte) 125), arg0.method2622((byte) 125), arg0.method2622((byte) 126), arg0.method2622((byte) 124), arg0.method2601(83), arg0.method2601(arg1 - 11), arg0.method2561((byte) 127));
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 54)
    public static void method3519(int arg0) {
        field8915 = null;
        field8917 = null;
        if (arg0 != -1) {
            field8915 = null;
        }
        field8916 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method3520(byte arg0) {
        field8903++;
        if (arg0 != -23) {
            method3518(null, (byte) 31);
        }
        return (this.field8904 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Z", line = 77)
    public final boolean method3521(byte arg0) {
        if (arg0 == -33) {
            field8911++;
            return (this.field8904 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Z", line = 88)
    public final boolean method3522(byte arg0, int arg1) {
        field8914++;
        if (arg0 != 35) {
            field8915 = null;
        }
        return (this.field8904 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V", line = 104)
    public class605(int arg0, int arg1) {
        this.field8904 = arg0;
        this.field8910 = arg1;
    }
}
