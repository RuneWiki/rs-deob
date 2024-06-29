import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class34 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[Z")
    public static boolean[] field510 = new boolean[100];

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Z")
    public static boolean field512 = false;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field533 = -1;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Lrd;")
    public static class225 field527 = new class225();

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
    public long field531;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lwb;")
    public class253 field516;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Lwb;")
    public class253 field520;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Lwb;")
    public class253 field523;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[[I")
    public static int[][] field525;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "[[[Lff;")
    public static class142[][][] field528;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 14)
    public static void method281(byte arg0) {
        field510 = null;
        field528 = (class142[][][]) null;
        field525 = (int[][]) null;
        int var1 = 105 / ((arg0 - 51) / 33);
        field527 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V", line = 33)
    public static final void method282(int arg0, int arg1, int arg2, int arg3) {
        field529++;
        if (arg2 == 0) {
            class190.field2851++;
            class106.field1642.method753(16, 86);
            class106.field1642.method1132((byte) 29, 5);
        }
        if (arg2 == 1) {
            class110.field1719++;
            class106.field1642.method753(124, 225);
            class106.field1642.method1132((byte) 29, 19);
        }
        class106.field1642.method1150(class213.field3249 + arg1, -628562744);
        class106.field1642.method1150(class342.field5328 + arg3, -628562744);
        class106.field1642.method1135(true, class53.field902[arg0] ? 1 : 0);
        class130.field2042 = arg1;
        class91.field1450 = arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILl;Ll;)I", line = 61)
    public static final int method283(int arg0, class133 arg1, class133 arg2) {
        field519++;
        if (arg0 != 19) {
            method289(-66, -69L);
        }
        int var3 = 0;
        if (arg2.method956(class61.field990, true)) {
            var3++;
        }
        if (arg2.method956(class11.field170, true)) {
            var3++;
        }
        if (arg2.method956(class105.field1627, true)) {
            var3++;
        }
        if (arg1.method956(class61.field990, true)) {
            var3++;
        }
        if (arg1.method956(class11.field170, true)) {
            var3++;
        }
        if (arg1.method956(class105.field1627, true)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)I", line = 102)
    public static final int method284(int arg0, byte arg1) {
        if (arg1 != 18) {
            field533 = 60;
        }
        int var2 = 0;
        field522++;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I", line = 159)
    public static final int method285(int arg0, int arg1) {
        if (arg1 != 160) {
            field509 = 65;
        }
        field511++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B[Ljava/lang/Object;II[J)V", line = 170)
    public static final void method286(byte arg0, Object[] arg1, int arg2, int arg3, long[] arg4) {
        field530++;
        if (arg0 != -63) {
            method283(53, (class133) null, (class133) null);
        }
        if (arg3 <= arg2) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg2;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        Object var9 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var9;
        for (int var10 = arg2; var10 < arg3; var10++) {
            if (arg4[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var13 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6++] = var13;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg1[arg3] = arg1[var6];
        arg1[var6] = var9;
        method286((byte) -63, arg1, arg2, var6 - 1, arg4);
        method286((byte) -63, arg1, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V", line = 228)
    public static final void method287(int arg0, boolean arg1) {
        field521++;
        class202.field3028.method2175(arg0, -1401253017);
        class31.field447.method2175(arg0, -1401253017);
        if (!arg1) {
            field518 = -88;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;IZ)Z", line = 245)
    public static final boolean method288(int arg0, String arg1, int arg2, boolean arg3) {
        field515++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg2 != -37) {
            field510 = (boolean[]) null;
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var5 + var11;
            if ((var10 / arg0) != var5) {
                return false;
            }
            var6 = true;
            var5 = var10;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 326)
    public static final String method289(int arg0, long arg1) {
        field524++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 31 % ((-arg0 - 44) / 36);
            long var4 = arg1;
            int var6 = 0;
            while (var4 != 0L) {
                var6++;
                var4 /= 37L;
            }
            StringBuffer var7 = new StringBuffer(var6);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class166.field2538[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    var10 = ' ';
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }
}
