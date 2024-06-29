import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
    private int[] field2137;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "La;")
    public static class1 field2144 = class113.method934(-11538, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "La;")
    private static class1 field2136 = class113.method934(-11538, " has logged in)3");

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "La;")
    private static class1 field2130 = class113.method934(-11538, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "La;")
    public static class1 field2142 = field2130;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "La;")
    private static class1 field2146 = class113.method934(-11538, "Loaded config");

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "La;")
    public static class1 field2141 = field2146;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "La;")
    public static class1 field2129 = field2136;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "La;")
    private static class1 field2131 = class113.method934(-11538, "Unable to connect)3");

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "La;")
    public static class1 field2143 = field2131;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "La;")
    public static class1 field2138 = field2131;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lcb;")
    public static class15 field2139 = new class15(100);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2151 = 2;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "La;")
    private static class1 field2153 = class113.method934(-11538, "Existing user");

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "La;")
    public static class1 field2152 = field2153;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    public static int[] field2154;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[[[B")
    public static byte[][][] field2134;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I", line = 7)
    public final int method748(int arg0, int arg1) {
        if (arg1 > -56) {
            return 76;
        }
        field2133++;
        int var3 = this.field2137.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field2137[var4];
            if (arg0 == var5) {
                return this.field2137[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method749(byte arg0, int arg1) {
        field2132++;
        if (!class134.method1055(arg1, -7)) {
            return;
        }
        class100[] var2 = class117.field2925[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class100 var5 = var2[var3];
            if (var5 != null) {
                var5.field2469 = 0;
                var5.field2463 = 0;
            }
        }
        int var4 = 40 % ((arg0 + 57) / 54);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I", line = 77)
    public static final int method750(int arg0, int arg1, int arg2) {
        if (arg2 != 37821) {
            method753((byte) -6);
        }
        field2135++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbd;ZLbd;I)V", line = 99)
    public static final void method751(class11 arg0, boolean arg1, class11 arg2, int arg3) {
        class95.field2387 = arg1;
        field2140++;
        if (arg3 != -313) {
            field2153 = null;
        }
        class14.field459 = arg2;
        class53.field1408 = arg0;
        class63.field1593 = class53.field1408.method236(10, (byte) 109);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ[BI)V", line = 113)
    public static final void method752(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field2148++;
        if (arg0 != 0 || class9.field312 == null) {
            return;
        }
        if (class122.field3033 >= 0) {
            class8.field303 = arg4;
            if (class122.field3033 == 0) {
                class62.field1551 = 1;
            } else {
                int var5 = class66.method635(arg0 ^ 0x60, class122.field3033);
                int var6 = var5 - class81.field2049;
                class62.field1551 = (var6 + 3600) / arg4;
                if (class62.field1551 < 1) {
                    class62.field1551 = 1;
                }
            }
            class36.field976 = arg1;
            class2.field79 = arg3;
            class67.field1665 = arg2;
        } else if (class62.field1551 == 0) {
            class1.method7(2037, arg2, arg3, arg1);
        } else {
            class36.field976 = arg1;
            class2.field79 = arg3;
            class67.field1665 = arg2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 160)
    public static void method753(byte arg0) {
        field2129 = null;
        field2144 = null;
        field2142 = null;
        field2130 = null;
        field2153 = null;
        field2139 = null;
        field2154 = null;
        field2134 = null;
        field2136 = null;
        field2131 = null;
        field2146 = null;
        if (arg0 != -108) {
            field2144 = null;
        }
        field2138 = null;
        field2152 = null;
        field2143 = null;
        field2141 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)I", line = 185)
    public static final int method754(int arg0, byte arg1, int arg2) {
        int var3 = class6.method125(arg0 + 45365, 15177, 4, arg2 + 91923) + (class6.method125(arg0 - -10294, 15177, 2, arg2 + 37821) - 128 >> 1) + (class6.method125(arg0, 15177, 1, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 != -45) {
            return -24;
        }
        field2145++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 236)
    public static final void method755(int arg0) {
        field2150++;
        if (arg0 < 3) {
            method749((byte) 24, 79);
        }
        while (class15.field489.method408(121, class100.field2550) >= 27) {
            int var1 = class15.field489.method413(15, (byte) -65);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class120.field2995[var1] == null) {
                class120.field2995[var1] = new class130();
                var2 = true;
            }
            class130 var3 = class120.field2995[var1];
            class22.field678[class49.field1343++] = var1;
            var3.field2011 = class82.field2066;
            int var4 = class19.field645[class15.field489.method413(3, (byte) -65)];
            if (var2) {
                var3.field1995 = var4;
            }
            int var5 = class15.field489.method413(5, (byte) -65);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class15.field489.method413(5, (byte) -65);
            int var7 = class15.field489.method413(1, (byte) -65);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class50.field1350[class80.field2030++] = var1;
            }
            int var8 = class15.field489.method413(1, (byte) -65);
            var3.field3185 = class102.method867((byte) -121, class15.field489.method413(13, (byte) -65));
            var3.field2009 = var3.field3185.field1124;
            var3.field2003 = var3.field3185.field1093;
            var3.field1960 = var3.field3185.field1100;
            var3.field2008 = var3.field3185.field1136;
            var3.field1973 = var3.field3185.field1085;
            var3.field1956 = var3.field3185.field1117;
            var3.field2022 = var3.field3185.field1132;
            var3.field1990 = var3.field3185.field1102;
            if (var3.field1990 == 0) {
                var3.field1995 = 0;
            }
            var3.field1952 = var3.field3185.field1129;
            var3.method732(class104.field2624.field2012[0] + var6, -7717, ~var8 == -2, class104.field2624.field1965[0] + var5);
        }
        class15.field489.method409((byte) -110);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([I)V", line = 322)
    public class85(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2137 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2137[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2137[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2137[var5 + var5] = arg0[var4];
            this.field2137[var5 + var5 + 1] = var4++;
        }
    }
}
