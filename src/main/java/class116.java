import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class116 {

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Lwh;")
    private class236 field2094 = new class236(256);

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Lwh;")
    private class236 field2098 = new class236(256);

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lsd;")
    private class192 field2079;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lsd;")
    private class192 field2076;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Loc;")
    private static class151 field2077 = class137.method873(2, "red:");

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Loc;")
    public static class151 field2083 = field2077;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Loc;")
    public static class151 field2087 = field2077;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2081 = -1;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "[J")
    public static long[] field2093 = new long[32];

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field2091 = -1;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "[I")
    public static int[] field2099 = new int[1000];

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "Lcg;")
    public static class30 field2086;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "[Z")
    public static boolean[] field2089;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([III)Lmg;")
    public final class135 method702(int[] arg0, int arg1, int arg2) {
        field2078++;
        if (this.field2076.method1199(2495) == 1) {
            return this.method708(arg1, false, arg0, 0);
        } else if (~this.field2076.method1210(true, arg1) == arg2) {
            return this.method708(0, false, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZ)V")
    public static final void method703(byte arg0, boolean arg1) {
        if (arg0 >= -72) {
            field2080 = -98;
        }
        field2088++;
        if (class229.field4052 == null) {
            return;
        }
        try {
            class229 var2 = new class229(4);
            var2.method1447(-1, arg1 ? 2 : 3);
            var2.method1483((byte) -93, 0);
            class229.field4052.method331(61, 4, var2.field4087, 0);
        } catch (IOException var4) {
            try {
                class229.field4052.method336(-13112);
            } catch (Exception var3) {
            }
            class229.field4052 = null;
            class215.field3766++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
    public static final int method704(int arg0, int arg1, int arg2, int arg3) {
        field2097++;
        if (arg2 != 27104) {
            field2100 = -75;
        }
        if (arg1 < arg3) {
            return arg3;
        } else if (arg1 <= arg0) {
            return arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method705(byte arg0) {
        field2077 = null;
        field2093 = null;
        field2087 = null;
        field2086 = null;
        field2083 = null;
        field2089 = null;
        field2099 = null;
        if (arg0 < 123) {
            method709(76, -55, 26, true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[II)Lmg;")
    private final class135 method706(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != 1000) {
            method704(38, -123, 89, 9);
        }
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0xB0000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        field2082++;
        long var7 = (long) var6 ^ 0x100000000L;
        class135 var9 = (class135) this.field2098.method1538(var7, (byte) 127);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class127 var10 = (class127) this.field2094.method1538(var7, (byte) 127);
            if (var10 == null) {
                var10 = class127.method765(this.field2079, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2094.method1536((byte) -76, var10, var7);
            }
            class135 var11 = var10.method764(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method636(75);
                this.field2098.method1536((byte) -52, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI[I)Lmg;")
    public final class135 method707(byte arg0, int arg1, int[] arg2) {
        field2092++;
        int var4 = 32 / ((arg0 - 2) / 33);
        if (this.field2079.method1199(2495) == 1) {
            return this.method706(0, 1000, arg2, arg1);
        } else if (this.field2079.method1210(true, arg1) == 1) {
            return this.method706(arg1, 1000, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ[II)Lmg;")
    private final class135 method708(int arg0, boolean arg1, int[] arg2, int arg3) {
        field2085++;
        int var5 = ((arg3 & 0x30000FFF) << 4 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class135 var9 = (class135) this.field2098.method1538(var7, (byte) 127);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class199 var10 = class199.method1246(this.field2076, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            if (arg1) {
                this.method702(null, -73, 113);
            }
            class135 var11 = var10.method1247();
            this.field2098.method1536((byte) -119, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field2454.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZ)Loc;")
    public static final class151 method709(int arg0, int arg1, int arg2, boolean arg3) {
        field2096++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = arg1; var8 < var4; var8++) {
            int var10 = arg0 % arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg0 /= arg2;
        }
        class151 var9 = new class151();
        var9.field2736 = var7;
        var9.field2690 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)Z")
    public static final boolean method710(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class39.field797 * arg2 + class14.field325 * arg0 >> 16;
        int var5 = class14.field325 * arg2 - class39.field797 * arg0 >> 16;
        int var6 = class228.field4027 * arg1 + class142.field2584 * var5 >> 16;
        int var7 = class142.field2584 * arg1 - class228.field4027 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class146.field2617;
            int var9 = (var7 << 9) / var6 + class123.field2203;
            return var8 >= class95.field1774 && var8 <= class4.field80 && var9 >= class90.field1656 && var9 <= class118.field2134;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lsd;Lsd;)V")
    public class116(class192 arg0, class192 arg1) {
        this.field2079 = arg1;
        this.field2076 = arg0;
    }
}
