import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class464 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "Lsd;")
    private class80 field6896 = new class80(256);

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "Lsd;")
    private class80 field6907 = new class80(256);

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "Lkea;")
    private class203 field6904;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Lkea;")
    private class203 field6903;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "[Lgea;")
    public static class66[] field6895 = new class66[14];

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field6902 = 0;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "[[I")
    public static int[][] field6901 = new int[128][128];

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field6908 = 0;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Lig;")
    public static class206 field6897 = new class206(76, 1);

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(JJ)J", line = 8)
    public static long method2840(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([III)Lte;", line = 15)
    public final class534 method2841(int[] arg0, int arg1, int arg2) {
        if (arg2 < 25) {
            return null;
        }
        field6906++;
        if (this.field6904.method1282(-55) == 1) {
            return this.method2846(0, arg0, arg1, (byte) 43);
        } else if (this.field6904.method1309(1675886592, arg1) == 1) {
            return this.method2846(arg1, arg0, 0, (byte) 43);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V", line = 44)
    public static final void method2842(byte arg0) {
        if (arg0 > 102) {
            field6899++;
            if (class306.field4499 == 6) {
                class306.field4499 = 7;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lkea;Lkea;)V", line = 202)
    public class464(class203 arg0, class203 arg1) {
        this.field6904 = arg1;
        this.field6903 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([IIBI)Lte;", line = 81)
    private final class534 method2843(int[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = 92 / ((-arg2 - 70) / 50);
        field6898++;
        int var6 = (arg1 << 4 & 0xFFF2 | arg1 >>> 12) ^ arg3;
        int var7 = var6 | arg1 << 16;
        long var8 = (long) var7;
        class534 var10 = (class534) this.field6907.method524((byte) 117, var8);
        if (var10 != null) {
            return var10;
        } else if (arg0 == null || arg0[0] > 0) {
            class205 var11 = class205.method1317(this.field6903, arg1, arg3);
            if (var11 == null) {
                return null;
            }
            class534 var12 = var11.method1316();
            this.field6907.method520((byte) -66, var12, var8);
            if (arg0 != null) {
                arg0[0] -= var12.field7704.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 117)
    public static void method2844(int arg0) {
        field6901 = null;
        if (arg0 >= 82) {
            field6897 = null;
            field6895 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[II)Lte;", line = 130)
    public final class534 method2845(int arg0, int[] arg1, int arg2) {
        field6900++;
        if (this.field6903.method1282(-71) == 1) {
            return this.method2843(arg1, 0, (byte) 26, arg0);
        }
        if (arg2 != -6802) {
            field6908 = 107;
        }
        if (this.field6903.method1309(1675886592, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method2843(arg1, arg0, (byte) -123, 0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIB)Lte;", line = 156)
    private final class534 method2846(int arg0, int[] arg1, int arg2, byte arg3) {
        field6905++;
        int var5 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class534 var9 = (class534) this.field6907.method524((byte) 121, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class654 var10 = (class654) this.field6896.method524((byte) 103, var7);
            if (var10 == null) {
                var10 = class654.method3734(this.field6904, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field6896.method520((byte) -77, var10, var7);
            }
            class534 var11 = var10.method3733(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method2108(true);
            this.field6907.method520((byte) -87, var11, var7);
            if (arg3 != 43) {
                this.method2843(null, -74, (byte) -73, 31);
            }
            return var11;
        } else {
            return null;
        }
    }
}
