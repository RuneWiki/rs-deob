import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class487 extends class188 {

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "F")
    private float field6741 = 0.0F;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Llja;")
    private class745 field6735;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field6739 = 0;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lmga;")
    public static class739 field6745 = new class739(17, 8);

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public static final void method2828(int arg0) {
        class779.field10689 = -1;
        class227.field3104 = arg0;
        ++field6734;
        class692.field9714 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLbm;)V")
    public final void method959(int arg0, byte arg1, class123 arg2) {
        ++field6733;
        super.field2510.method3520(true, arg2);
        int var4 = 94 / ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)V")
    public final void method955(byte arg0) {
        ++field6737;
        super.field2510.method3470((byte) 124, 1);
        super.field2510.method3513(class364.field5299, class364.field5299, 126);
        super.field2510.method3514((byte) -112, class122.field1782, 0);
        super.field2510.method3509(0, class122.field1782, -128);
        if (arg0 <= 54) {
            field6739 = 53;
        }
        super.field2510.method905(1, 0);
        super.field2510.method3520(true, (class123) null);
        super.field2510.method3470((byte) -34, 0);
        super.field2510.method3509(0, class122.field1782, -95);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V")
    public final void method962(int arg0, boolean arg1) {
        ++field6747;
        super.field2510.method3513(class521.field7150, class364.field5299, arg0 ^ -22902);
        if (arg0 != 22789) {
            this.method962(98, false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lai;Llja;)V")
    public class487(class626 arg0, class745 arg1) {
        super(arg0);
        this.field6735 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIZ)Z")
    public static final boolean method2829(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            ++field6736;
            return class524.method3022(arg1, arg0, -13222) | ~(458752 & arg1) != -1 || class543.method3090(arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Z")
    public final boolean method956(int arg0) {
        ++field6743;
        return arg0 <= 53 ? true : this.field6735.method4123(29925);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2830(byte arg0, byte[] arg1) {
        if (arg0 < 12) {
            return null;
        } else {
            ++field6746;
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class278.method1796(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
    public final void method961(boolean arg0, int arg1) {
        ++field6738;
        super.field2510.method3470((byte) -97, 1);
        super.field2510.method3513(class521.field7150, class187.field2499, -50);
        super.field2510.method907(true, false, (byte) -67, 0, class122.field1782);
        super.field2510.method3509(0, class386.field5627, -82);
        super.field2510.method905(0, arg1 ^ arg1);
        super.field2510.method3470((byte) 45, 0);
        super.field2510.method3525(-16777216, arg1 ^ 3);
        super.field2510.method3509(0, class109.field1493, arg1 ^ -85);
        this.method1304((byte) -56);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V")
    public final void method958(int arg0, int arg1, boolean arg2) {
        super.field2510.method3470((byte) 13, 1);
        ++field6742;
        if (!arg2) {
            method2829(47, 14, false);
        }
        if ((arg0 & 128) != 0) {
            super.field2510.method3520(true, (class123) null);
        } else if ((arg1 & 1) != 1) {
            if (!this.field6735.field10292) {
                super.field2510.method3520(arg2, this.field6735.field10282[0]);
            } else {
                super.field2510.method3520(arg2, this.field6735.field10287);
            }
        } else if (this.field6735.field10292) {
            this.field6741 = (float) (super.field2510.field8699 % 4000) / 4000.0F;
            super.field2510.method3520(true, this.field6735.field10287);
        } else {
            int var4 = super.field2510.field8699 % 4000 * 16 / 4000;
            super.field2510.method3520(true, this.field6735.field10282[var4]);
        }
        super.field2510.method3470((byte) -19, 0);
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    public static void method2831(int arg0) {
        field6745 = null;
        if (arg0 != 4000) {
            method2830((byte) 96, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public final void method1304(byte arg0) {
        if (arg0 != -56) {
            this.field6741 = 0.3830559F;
        }
        ++field6744;
        if (~super.field2510.method3476(arg0 + -38) == -1) {
            class754 var2 = super.field2510.method3452((byte) 13);
            super.field2510.method3470((byte) -106, 1);
            class754 var3 = super.field2510.method3506((byte) -112);
            var3.method986(var2);
            var3.method4193(-100, 1.0F, 0.125F, 0.125F);
            var3.method4208(arg0 + 18701, this.field6741, 0.0F, 0.0F);
            super.field2510.method3471(52, class592.field7968);
            super.field2510.method3470((byte) 123, 0);
        }
    }
}
