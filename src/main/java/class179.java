import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class179 extends class138 {

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "[I")
    public static int[] field2856 = new int[2000];

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "Lck;")
    public static class119 field2853 = class298.method1987((byte) 71, "256");

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "Lck;")
    public static class119 field2851 = class298.method1987((byte) 79, "T");

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "[I")
    public static int[] field2858 = new int[128];

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Lck;")
    public class119 field2859;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BJ)V", line = 9)
    public static final void method1145(byte arg0, long arg1) {
        int var3 = -82 % ((-arg0 - 27) / 52);
        field2862++;
        if (arg1 == 0L) {
            return;
        }
        for (int var4 = 0; var4 < class151.field2399; var4++) {
            if (class96.field1476[var4] == arg1) {
                class151.field2399--;
                for (int var5 = var4; var5 < class151.field2399; var5++) {
                    class96.field1476[var5] = class96.field1476[var5 + 1];
                    class203.field3214[var5] = class203.field3214[var5 + 1];
                }
                class169.field2655++;
                class261.field4196 = class94.field1456;
                class6.field149.method966(0, 120);
                class6.field149.method29(2069, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 56)
    public final void method1146(byte arg0) {
        field2864++;
        if (arg0 <= -13) {
            this.field2212 = Long.MIN_VALUE & this.field2212 | class110.method707((byte) 68) + 500L;
            class73.field1137.method582(3, this);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)I", line = 76)
    public final int method1147(int arg0) {
        int var2 = -16 / ((54 - arg0) / 35);
        field2861++;
        return (int) (this.field1218 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V", line = 85)
    public static void method1148(byte arg0) {
        field2851 = null;
        field2856 = null;
        field2853 = null;
        if (arg0 >= 23) {
            field2858 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)J", line = 107)
    public final long method1149(int arg0) {
        field2857++;
        if (arg0 != 0) {
            this.method1151(-51);
        }
        return this.field2212 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)I", line = 118)
    public final int method1150(int arg0) {
        field2852++;
        if (arg0 != 1) {
            method1148((byte) 12);
        }
        return (int) this.field1218;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 134)
    public final void method1151(int arg0) {
        if (arg0 != 2000) {
            return;
        }
        field2860++;
        this.field2212 |= Long.MIN_VALUE;
        if (this.method1149(0) == 0L) {
            class126.field1936.method582(3, this);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIB)V", line = 152)
    public static final void method1152(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -43) {
            field2851 = (class119) null;
        }
        if (arg3 > arg0) {
            class36.method282(arg3, arg0, arg1, class256.field4113[arg2], 26175);
        } else {
            class36.method282(arg0, arg3, arg1, class256.field4113[arg2], 26175);
        }
        field2855++;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V", line = 169)
    public class179(int arg0, int arg1) {
        this.field1218 = (long) arg0 << 32 | (long) arg1;
    }
}
