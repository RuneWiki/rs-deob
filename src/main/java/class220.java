import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class220 extends class235 implements class529 {

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Lrb;")
    public class235 field3163;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "[I")
    public static int[] field3155 = new int[1];

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "[I")
    public static int[] field3159 = new int[13];

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "[[I")
    public static int[][] field3161 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "[[Z")
    public static boolean[][] field3158 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field3173;

    static {
        new class331("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(Lya;I)Lfk;", line = 3)
    public final class462 method38(class38 arg0, int arg1) {
        field3170++;
        return arg1 >= -87 ? null : null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILya;I)Z", line = 15)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        field3164++;
        return arg1 != 0;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 27)
    public final void method29(int arg0) {
        int var2 = 27 % ((57 - arg0) / 44);
        field3168++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lya;II)Lt;", line = 36)
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        int var4 = -34 / ((arg2 - 54) / 56);
        field3172++;
        return null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)I", line = 46)
    public final int method22(byte arg0) {
        field3169++;
        return arg0 == -70 ? 0 : -66;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I", line = 57)
    public final int method28(boolean arg0) {
        if (arg0) {
            field3157++;
            return 0;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Lya;I)V", line = 82)
    public final void method35(class38 arg0, int arg1) {
        field3162++;
        if (arg1 < 53) {
            this.method39(-68);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I", line = 92)
    public static final int method1501(int arg0, int arg1) {
        return class453.field6667 == null ? 0 : class453.field6667[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 98)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg3 != -99) {
            this.method31(null, -127);
        }
        field3156++;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 108)
    public final void method39(int arg0) {
        if (arg0 > -18) {
            this.method38(null, -92);
        }
        field3166++;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I", line = 120)
    public final int method27(int arg0) {
        field3171++;
        int var2 = 4 / ((arg0 - 39) / 41);
        return 0;
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(B)V", line = 131)
    public static void method1502(byte arg0) {
        field3159 = null;
        field3161 = null;
        field3155 = null;
        if (arg0 <= 76) {
            field3158 = null;
        }
        field3158 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lya;I)V", line = 145)
    public final void method31(class38 arg0, int arg1) {
        if (arg1 != -12694) {
            this.method22((byte) 26);
        }
        field3165++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z", line = 159)
    public final boolean method30(int arg0) {
        if (arg0 == 10869) {
            field3167++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIILrb;)V", line = 171)
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, class235 arg5) {
        super(arg2, arg3, arg4, class408.method2502(11369, arg1, arg0));
        this.field3163 = arg5;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLya;)V", line = 180)
    public final void method26(boolean arg0, class38 arg1) {
        if (arg0) {
            field3173++;
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)Z", line = 190)
    public final boolean method32(byte arg0) {
        if (arg0 < 104) {
            field3155 = null;
        }
        field3160++;
        return false;
    }
}
