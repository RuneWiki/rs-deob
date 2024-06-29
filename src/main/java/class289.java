import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class289 {

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "[Lsf;")
    public class108[] field5064;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "[S")
    public short[] field5058;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[B")
    public byte[] field5062;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "[S")
    public short[] field5063;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[I")
    public int[] field5055;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field5048 = 0;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Lsf;")
    public static class108 field5057 = class140.method973(255, ")0");

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field5066 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lla;")
    public static class139 field5052;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lvk;")
    public static class173 field5060;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I", line = 4)
    public final int method2061(int arg0, int arg1) {
        if (arg1 != -1608225261) {
            this.method2066(26, 20);
        }
        field5065++;
        return this.field5062[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)Z", line = 17)
    public final boolean method2062(boolean arg0, int arg1) {
        if (arg0) {
            field5047++;
            return (this.field5062[arg1] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BB)V", line = 29)
    public static final void method2063(byte arg0, byte arg1) {
        if (class327.field5582 == null) {
            class327.field5582 = new byte[4][104][104];
        }
        field5056++;
        if (arg0 != -126) {
            method2067(-92, -104, (byte) -44, false);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class327.field5582[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZBII)V", line = 69)
    public static final void method2064(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field5061++;
        if (arg2 < -2 && class219.method1508(arg0, -123)) {
            class270.method1950(arg4, -1, class320.field5485[arg0], (byte) 57, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 85)
    public static void method2065(boolean arg0) {
        field5057 = null;
        field5052 = null;
        field5060 = null;
        if (arg0) {
            method2063((byte) 50, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)Z", line = 98)
    public final boolean method2066(int arg0, int arg1) {
        if (arg0 != -27963) {
            field5059 = -13;
        }
        field5051++;
        return (this.field5062[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIBZ)I", line = 113)
    public static final int method2067(int arg0, int arg1, byte arg2, boolean arg3) {
        int var4 = 126 / ((arg2 - 36) / 43);
        field5054++;
        class117 var5 = (class117) class98.field1620.method1676((long) arg0, (byte) -99);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2028.length; var7++) {
            if (var5.field2028[var7] >= 0 && class197.field3553 > var5.field2028[var7]) {
                class145 var8 = class144.method994(true, var5.field2028[var7]);
                if (var8.field2592 != null) {
                    class236 var9 = (class236) var8.field2592.method1676((long) arg1, (byte) -86);
                    if (var9 != null) {
                        if (arg3) {
                            var6 += var5.field2036[var7] * var9.field4144;
                        } else {
                            var6 += var9.field4144;
                        }
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)J", line = 163)
    public static final long method2068(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        return var3 == null || var3.field1140 == null ? 0L : var3.field1140.field502;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V", line = 171)
    public static final void method2069(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method2065(true);
        }
        method2064(class322.field5511, arg1, (byte) -40, class21.field331, class73.field1110);
        field5049++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZIIII)Lvd;", line = 190)
    public static final class135 method2070(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5050++;
        int var7 = -82 / ((arg0 - 54) / 48);
        int var8 = (arg5 << 19) + arg3 + (arg1 ? 65536 : 0) + (arg4 << 17);
        long var9 = (long) arg2 * 3147483667L + (long) var8 * 3849834839L;
        class135 var11 = (class135) class272.field4753.method642(var9, (byte) -82);
        if (var11 != null) {
            return var11;
        }
        class263.field4659 = false;
        class135 var12 = class144.method995(arg3, arg5, false, arg2, false, arg1, -5117, arg4);
        if (var12 != null && !class263.field4659) {
            class272.field4753.method643((byte) -49, var9, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V", line = 223)
    public class289(int arg0) {
        this.field5053 = arg0;
        this.field5064 = new class108[this.field5053];
        this.field5058 = new short[this.field5053];
        this.field5062 = new byte[this.field5053];
        this.field5063 = new short[this.field5053];
        this.field5055 = new int[this.field5053];
    }
}
