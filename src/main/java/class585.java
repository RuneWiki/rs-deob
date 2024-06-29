import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class585 {

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "Lpt;")
    private class451 field8496 = new class451(256);

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "Lpt;")
    private class451 field8504 = new class451(256);

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Ldn;")
    private class438 field8503;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "Ldn;")
    private class438 field8490;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field8494 = -1;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "[[I")
    public static int[][] field8491 = new int[128][128];

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field8495 = 0;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field8498 = -1;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Lcea;")
    public static class180 field8492 = new class180("Profiling", "Profiling", "Profilage", "Profiling");

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "Lcea;")
    public static class180 field8505 = new class180("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II[II)Lmr;", line = 8)
    private final class123 method3397(int arg0, int arg1, int[] arg2, int arg3) {
        field8493++;
        int var5 = (arg3 >>> 12 | (arg3 & 0xE0000FFF) << 4) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class123 var9 = (class123) this.field8504.method2645(var7, (byte) -96);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class568 var10 = (class568) this.field8496.method2645(var7, (byte) -79);
            if (var10 == null) {
                var10 = class568.method3307(this.field8503, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field8496.method2640(1, var7, var10);
            }
            class123 var11 = var10.method3312(arg2);
            int var12 = 54 / ((61 - arg0) / 57);
            if (var11 == null) {
                return null;
            } else {
                var10.method3187(true);
                this.field8504.method2640(1, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(II[II)Lmr;", line = 59)
    private final class123 method3398(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != 739586604) {
            this.field8490 = null;
        }
        field8502++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF4) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class123 var9 = (class123) this.field8504.method2645(var7, (byte) -94);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class26 var10 = class26.method159(this.field8490, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class123 var11 = var10.method158();
            this.field8504.method2640(1, var7, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field1521.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BI[I)Lmr;", line = 122)
    public final class123 method3399(byte arg0, int arg1, int[] arg2) {
        field8499++;
        int var4 = -94 % ((21 - arg0) / 54);
        if (this.field8490.method2565((byte) 90) == 1) {
            return this.method3398(0, 739586604, arg2, arg1);
        } else if (this.field8490.method2554(arg1, 126) == 1) {
            return this.method3398(arg1, 739586604, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 141)
    public static final void method3400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field8500++;
        if (arg9) {
            method3400(104, 105, 57, 117, 32, -74, -3, 54, -20, true);
        }
        if (arg1 == arg6 && arg0 == arg4 && arg5 == arg7 && arg2 == arg3) {
            class256.method1447(arg5, arg0, arg3, (byte) 79, arg8, arg6);
            return;
        }
        int var10 = arg6;
        int var11 = arg0;
        int var12 = arg6 * 3;
        int var13 = arg0 * 3;
        int var14 = arg1 * 3;
        int var15 = arg4 * 3;
        int var16 = arg7 * 3;
        int var17 = arg2 * 3;
        int var18 = arg5 + var14 - var16 - arg6;
        int var19 = arg3 + var15 - arg0 - var17;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg6;
            int var34 = (var28 + var30 + var32 >> 12) + arg0;
            class256.method1447(var33, var11, var34, (byte) 78, arg8, var10);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ldn;Ldn;)V", line = 263)
    public class585(class438 arg0, class438 arg1) {
        this.field8503 = arg1;
        this.field8490 = arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V", line = 228)
    public static void method3401(int arg0) {
        field8505 = null;
        field8491 = null;
        if (arg0 != 0) {
            method3401(-5);
        }
        field8492 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([III)Lmr;", line = 243)
    public final class123 method3402(int[] arg0, int arg1, int arg2) {
        field8501++;
        if (this.field8503.method2565((byte) -20) == 1) {
            return this.method3397(118, arg2, arg0, 0);
        } else if (this.field8503.method2554(arg2, arg1 ^ 0xFFFF884E) == 1) {
            return this.method3397(123, 0, arg0, arg2);
        } else if (arg1 == -30667) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }
}
