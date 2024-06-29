import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class67 extends class303 {

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field1080 = -1;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "[I")
    public static int[] field1082 = new int[5];

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Lea;")
    public static class204 field1071 = new class204();

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field1084 = 1;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "S")
    public static short field1085 = 256;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lja;I)V", line = 8)
    public static final void method506(class64 arg0, int arg1) {
        field1079++;
        class103.field1736 = arg0;
        if (arg1 != 14662) {
            field1082 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I", line = 19)
    public final int[][] method74(int arg0, int arg1) {
        if (arg1 != 82) {
            field1070 = -34;
        }
        field1069++;
        int[][] var3 = this.field4772.method1175(-127, arg0);
        if (this.field4772.field2488) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class70.field1108; var7++) {
                var4[var7] = this.field1077;
                var6[var7] = this.field1081;
                var5[var7] = this.field1076;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)V", line = 59)
    private final void method507(int arg0, int arg1) {
        field1075++;
        this.field1076 = (arg0 & 0xFF) << 4;
        this.field1077 = (arg0 & 0xFF0000) >> 12;
        if (arg1 != 24593) {
            method510(-25, -36, 114);
        }
        this.field1081 = (arg0 & 0xFF00) >> 4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V", line = 74)
    public static final void method508(boolean arg0, int arg1) {
        if (arg1 != 1) {
            field1082 = (int[]) null;
        }
        field1083++;
        class162.method1201(class73.field1127, class122.field1950, arg0, -1, class180.field2880);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILpe;I)V", line = 91)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.method507(arg1.method776(arg0 ^ 0x5DD5664C), 24593);
        }
        if (arg0 == -4004) {
            field1073++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V", line = 114)
    public static void method509(int arg0) {
        if (arg0 > -29) {
            field1080 = 111;
        }
        field1071 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(III)Lqc;", line = 126)
    public static final class4 method510(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field1070 = -17;
        }
        field1078++;
        class4 var3 = (class4) class13.field247.method833(false, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class4(arg1, arg2);
            class13.field247.method845(var3, (byte) -61, var3.field3734);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V", line = 146)
    private class67(int arg0) {
        super(0, false);
        this.method507(arg0, 24593);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V", line = 158)
    public static final void method511(int arg0, byte arg1) {
        class295.field4670 = -1;
        class40.field725 = arg0;
        field1072++;
        int var2 = -72 / ((arg1 - 31) / 60);
        class188.field2994 = -1;
        class40.method326(-1);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)V", line = 171)
    public static final void method512(byte arg0) {
        field1074++;
        int var1 = 96 / ((-arg0 - 2) / 33);
        class216.field3435++;
        class269.field4191.method246(false, 1);
        class269.field4191.method760(0L, true);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 192)
    public class67() {
        this(0);
    }
}
