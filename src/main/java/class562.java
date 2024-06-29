import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class562 extends class260 {

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "[[I")
    public static int[][] field7989 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "Lwia;")
    public static class791 field7982;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Lin;")
    public static class97 field7983;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "[I")
    public static int[] field7992;

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lgn;)V", line = 4)
    public class562(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I", line = 8)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return 10;
        } else {
            ++field7984;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILgn;)V", line = 20)
    public class562(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)V", line = 24)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field7981;
        if (arg1 != 122) {
            field7990 = -56;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB[S)[S", line = 35)
    public static final short[] method3316(int arg0, byte arg1, short[] arg2) {
        ++field7986;
        short[] var3 = new short[arg0];
        class595.method3466(arg2, 0, var3, 0, arg0);
        return arg1 > -69 ? null : var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 49)
    public static void method3317(byte arg0) {
        field7992 = null;
        int var1 = 104 % ((arg0 - -6) / 58);
        field7982 = null;
        field7983 = null;
        field7989 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 61)
    public final void method126(int arg0) {
        if (super.field3829.method4081(24) == class422.field5780) {
            if (super.field3829.method4076(-5569)) {
                super.field3828 = 0;
            }
        } else {
            super.field3828 = 1;
        }
        ++field7980;
        if (arg0 < 102) {
            field7982 = null;
        }
        if (~super.field3828 != -1 && ~super.field3828 != -2) {
            super.field3828 = this.method123(4377);
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I", line = 84)
    public final int method3318(int arg0) {
        if (arg0 > -14) {
            method3317((byte) 56);
        }
        ++field7988;
        return super.field3828;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)Z", line = 95)
    public final boolean method3319(int arg0) {
        ++field7987;
        if (arg0 <= 73) {
            field7982 = null;
        }
        if (super.field3829.method4076(-5569)) {
            return false;
        } else {
            return super.field3829.method4081(24) == class422.field5780;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lje;II)V", line = 118)
    public static final void method3320(class421[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class421 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field5744;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field5744 > (var7 & 1) + var6) {
                    class421 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method3320(arg0, arg1, var4 - 1);
            method3320(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)I", line = 158)
    public final int method129(int arg0, int arg1) {
        ++field7985;
        if (super.field3829.method4076(-5569)) {
            return 3;
        } else {
            if (arg0 != -1) {
                this.method128(-113, (byte) -19);
            }
            return super.field3829.method4081(arg0 ^ -25) == class422.field5780 ? 1 : 3;
        }
    }
}
