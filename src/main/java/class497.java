import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class497 extends class179 implements class241 {

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Lea;")
    public static class547 field6759 = new class547(105, 6);

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field6763 = 0;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Lfc;")
    public static class262 field6761 = new class262(3000000, 200);

    @OriginalMember(owner = "client!va", name = "z", descriptor = "B")
    private byte field6752;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lda;")
    public static class61 field6764;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I", line = 4)
    public final int method2768(byte arg0) {
        ++field6754;
        if (arg0 != -22) {
            method2769(-35, -56, (byte[]) null);
        }
        return this.field6752;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B)[B", line = 16)
    public static final byte[] method2769(int arg0, int arg1, byte[] arg2) {
        ++field6762;
        byte[] var3 = new byte[arg0];
        class373.method2194(arg2, 0, var3, 0, arg0);
        if (arg1 < 58) {
            field6761 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)Ljha;", line = 34)
    public static final class695 method2770(int arg0) {
        ++field6755;
        if (arg0 != 200) {
            field6759 = null;
        }
        return class670.field9317 < class688.field9635.length ? class688.field9635[class670.field9317++] : null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method1448(int arg0) {
        ++field6751;
        if (arg0 != 13623) {
            this.method177(94);
        }
        return super.method1025((byte) -68, super.field2195.field7186);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lhl;Z)V", line = 61)
    public class497(class529 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z", line = 64)
    public final boolean method1450(int arg0, int arg1, int arg2) {
        ++field6760;
        this.field6752 = (byte) arg1;
        if (arg0 != -20279) {
            this.method1449((byte) 58, 121, 8, (Source) null);
        }
        super.method180(arg2, arg0 + 41058);
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V", line = 80)
    public final void method176(boolean arg0) {
        ++field6756;
        super.method176(arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BZ)Ljava/lang/String;", line = 88)
    public static final String method2771(byte[] arg0, boolean arg1) {
        if (!arg1) {
            field6759 = null;
        }
        ++field6757;
        return class324.method1933(arg0.length, 0, (byte) -110, arg0);
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V", line = 103)
    public static void method2772(int arg0) {
        if (arg0 != 7315) {
            field6761 = null;
        }
        field6761 = null;
        field6764 = null;
        field6759 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIILjaclib/memory/Source;)Z", line = 117)
    public final boolean method1449(byte arg0, int arg1, int arg2, Source arg3) {
        this.field6752 = (byte) arg2;
        ++field6758;
        super.method1019(arg3, 1, arg1);
        if (arg0 > -79) {
            field6764 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I", line = 138)
    public final int method177(int arg0) {
        ++field6753;
        if (arg0 != 200) {
            this.field6752 = 44;
        }
        return super.method177(200);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 155)
    public final Buffer method1451(boolean arg0, byte arg1) {
        if (arg1 != 27) {
            return null;
        } else {
            ++field6750;
            return super.method1016(arg0, super.field2195.field7186, -15793);
        }
    }
}
