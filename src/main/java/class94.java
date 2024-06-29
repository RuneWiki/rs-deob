import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class94 extends class189 implements class620 {

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "Lqfa;")
    public static class98 field1098 = new class98(45, 4);

    @OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
    public static int field1104 = -1;

    @OriginalMember(owner = "client!pia", name = "v", descriptor = "Lbd;")
    public static class60 field1103 = new class60(8, 7);

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "C")
    public char field1093;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!pia", name = "u", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "J")
    public long field1096;

    @OriginalMember(owner = "client!pia", name = "y", descriptor = "Lfp;")
    public static class323 field1106;

    @OriginalMember(owner = "client!pia", name = "x", descriptor = "[J")
    public static long[] field1105;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)J", line = 3)
    public final long method693(int arg0) {
        field1101++;
        return arg0 == 32678 ? this.field1096 : -17L;
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(III)Z", line = 17)
    public static final boolean method694(int arg0, int arg1, int arg2) {
        field1100++;
        if (arg0 > -103) {
            field1105 = null;
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "(I)I", line = 28)
    public final int method695(int arg0) {
        field1092++;
        if (arg0 != 2674) {
            this.method697(81);
        }
        return this.field1097;
    }

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)I", line = 39)
    public final int method696(int arg0) {
        field1094++;
        return arg0 == -31285 ? this.field1102 : 114;
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(I)C", line = 56)
    public final char method697(int arg0) {
        if (arg0 == 4152) {
            field1095++;
            return this.field1093;
        } else {
            return (char) 65519;
        }
    }

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "(I)V", line = 70)
    public static void method698(int arg0) {
        field1106 = null;
        field1098 = null;
        int var1 = -85 / ((-arg0 - 24) / 35);
        field1103 = null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)I", line = 84)
    public final int method699(int arg0) {
        field1099++;
        if (arg0 < 106) {
            field1103 = null;
        }
        return this.field1091;
    }
}
