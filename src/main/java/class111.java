import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class111 extends class7 {

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    private int field2130 = 12288;

    @OriginalMember(owner = "client!lb", name = "qb", descriptor = "I")
    private int field2151 = 0;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    private int field2139 = 0;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    private int field2144 = 8192;

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
    private int field2145 = 2048;

    @OriginalMember(owner = "client!lb", name = "zb", descriptor = "I")
    private int field2160 = 2048;

    @OriginalMember(owner = "client!lb", name = "Ab", descriptor = "I")
    private int field2161 = 4096;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "Lob;")
    private static class141 field2129 = class175.method1195(40, "Aug");

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "Lob;")
    private static class141 field2132 = class175.method1195(40, "Nov");

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "Lob;")
    private static class141 field2137 = class175.method1195(40, "Jun");

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Lob;")
    private static class141 field2126 = class175.method1195(40, "Jul");

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "Lob;")
    public static class141 field2128 = class175.method1195(40, "");

    @OriginalMember(owner = "client!lb", name = "pb", descriptor = "Lob;")
    private static class141 field2150 = class175.method1195(40, "Sep");

    @OriginalMember(owner = "client!lb", name = "rb", descriptor = "Lob;")
    private static class141 field2152 = class175.method1195(40, "Dec");

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "Lob;")
    public static class141 field2138 = field2128;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field2127 = 20;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "Lob;")
    private static class141 field2140 = class175.method1195(40, "May");

    @OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lob;")
    private static class141 field2146 = class175.method1195(40, "Apr");

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "Lob;")
    private static class141 field2133 = class175.method1195(40, "Mar");

    @OriginalMember(owner = "client!lb", name = "tb", descriptor = "Lob;")
    private static class141 field2154 = class175.method1195(40, "Feb");

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "Lob;")
    private static class141 field2135 = class175.method1195(40, "Oct");

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "Lob;")
    public static class141 field2141 = class175.method1195(40, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!lb", name = "wb", descriptor = "Lob;")
    private static class141 field2157 = class175.method1195(40, "Jan");

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "[Lob;")
    public static class141[] field2131 = new class141[] { field2157, field2154, field2133, field2146, field2140, field2137, field2126, field2129, field2150, field2135, field2132, field2152 };

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!lb", name = "mb", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!lb", name = "ob", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!lb", name = "sb", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!lb", name = "ub", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!lb", name = "vb", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!lb", name = "xb", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!lb", name = "yb", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!lb", name = "nb", descriptor = "Z")
    public static boolean field2148;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
    public static int[] field2136;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
    public static final void method726(int arg0, int arg1) {
        ++field2156;
        if (arg0 != -1) {
            if (class66.method443(true, arg0)) {
                class170[] var2 = class224.field4232[arg0];
                int var3 = 25 / ((-71 - arg1) / 32);
                for (int var4 = 0; ~var4 > ~var2.length; ++var4) {
                    class170 var5 = var2[var4];
                    if (var5.field3317 != null) {
                        class220 var6 = new class220();
                        var6.field4177 = var5.field3317;
                        var6.field4168 = var5;
                        class214.method1397(var6, 2000000, 26186);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field2147;
        int[] var3 = super.field100.method842(arg1, 12);
        if (arg0 < 13) {
            this.field2145 = -126;
        }
        if (super.field100.field2534) {
            int var4 = class177.field3503[arg1] - 2048;
            for (int var5 = 0; ~var5 > ~class117.field2272; ++var5) {
                int var6 = class15.field272[var5] + -2048;
                int var7 = var4 - -this.field2139;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field2145 + var4;
                int var11 = var6 - -this.field2151;
                int var12 = ~var11 <= 2047 ? var11 : var11 - -4096;
                int var13 = this.field2160 + var6;
                int var14 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var15 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var16 = var14 <= 2048 ? var14 : var14 + -4096;
                int var17 = ~var13 > 2047 ? var13 - -4096 : var13;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method728(var9, var18, true) && !this.method729(var15, (byte) -119, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static void method727(boolean arg0) {
        field2157 = null;
        field2152 = null;
        field2150 = null;
        field2136 = null;
        field2133 = null;
        field2137 = null;
        field2135 = null;
        field2140 = null;
        if (!arg0) {
            field2134 = 20;
        }
        field2129 = null;
        field2128 = null;
        field2154 = null;
        field2126 = null;
        field2132 = null;
        field2146 = null;
        field2138 = null;
        field2141 = null;
        field2131 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -51 % ((arg1 - 66) / 57);
        ++field2149;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field2144 = arg2.method1007(61);
                                }
                            } else {
                                this.field2161 = arg2.method1007(60);
                            }
                        } else {
                            this.field2130 = arg2.method1007(97);
                        }
                    } else {
                        this.field2145 = arg2.method1007(97);
                    }
                } else {
                    this.field2151 = arg2.method1007(75);
                }
            } else {
                this.field2139 = arg2.method1007(84);
            }
        } else {
            this.field2160 = arg2.method1007(44);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)Z")
    private final boolean method728(int arg0, int arg1, boolean arg2) {
        ++field2142;
        int var4 = (-arg1 + arg0) * this.field2130 >> 12;
        int var5 = class135.field2566[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2130;
        int var7 = (var6 << 12) / this.field2144;
        if (!arg2) {
            return false;
        } else {
            int var8 = this.field2161 * var7 >> 12;
            return var8 > arg1 - -arg0 && -var8 < arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field2159;
        class54.method359(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)Z")
    private final boolean method729(int arg0, byte arg1, int arg2) {
        if (arg1 >= -118) {
            return false;
        } else {
            ++field2153;
            int var4 = (arg2 - -arg0) * this.field2130 >> 12;
            int var5 = class135.field2566[(1048289 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field2130;
            int var7 = (var6 << 12) / this.field2144;
            int var8 = this.field2161 * var7 >> 12;
            return -arg0 + arg2 < var8 && -arg0 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)Lkh;")
    public static final class107 method730(int arg0, int arg1) {
        class107 var2 = (class107) class162.field3140.method1383((long) arg0, (byte) 88);
        ++field2158;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class92.field1850.method1065((byte) 46, class46.method304(arg0, 22511), class167.method1151(arg0, -102));
            class107 var4 = new class107();
            if (arg1 >= -39) {
                return null;
            } else {
                var4.field2063 = arg0;
                if (var3 != null) {
                    var4.method707(13737, new class146(var3));
                }
                class162.field3140.method1378(var4, (byte) -77, (long) arg0);
                return var4;
            }
        }
    }
}
