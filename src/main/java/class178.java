import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class178 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lvd;")
    private class4 field2487 = new class4(256);

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lvd;")
    private class4 field2500 = new class4(256);

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lhc;")
    private class235 field2497;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lhc;")
    private class235 field2490;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "C")
    public static char field2499;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lwf;")
    public static class1 field2503;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
    public static int[] field2489;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[Lke;")
    public static class110[] field2493;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[I)Lec;")
    private final class24 method1163(int arg0, int arg1, int arg2, int[] arg3) {
        field2502++;
        if (arg2 != -10409) {
            this.method1163(-12, 12, -120, (int[]) null);
        }
        int var5 = arg0 ^ (arg1 << 4 & 0xFFF5 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class24 var9 = (class24) this.field2500.method23(216, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class147 var10 = class147.method986(this.field2490, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class24 var11 = var10.method985();
            this.field2500.method20(var11, var7, 0);
            if (arg3 != null) {
                arg3[0] -= var11.field332.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        field2493 = null;
        field2503 = null;
        if (arg0 == 19) {
            field2489 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)Ldf;")
    public static final class56 method1165(int arg0, byte arg1, int arg2, int arg3) {
        class56 var4 = new class56();
        var4.field808 = arg3;
        if (arg1 != -24) {
            field2494 = 52;
        }
        field2498++;
        var4.field802 = arg0;
        class289.field4559.method20(var4, (long) arg2, 0);
        class38.method251((byte) 106, arg3);
        class211 var5 = class67.method421(arg2, 0);
        if (var5 != null) {
            class236.method1583(var5, 0);
        }
        if (class233.field3524 != null) {
            class236.method1583(class233.field3524, arg1 + 24);
            class233.field3524 = null;
        }
        int var6 = class68.field925;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class66.method416(class221.field3306[var7], true)) {
                class248.method1665(var7, -10872);
            }
        }
        if (class68.field925 == 1) {
            class15.field146 = false;
            class238.method1595((byte) 30, class40.field593, class224.field3406, class175.field2458, class180.field2516);
        } else {
            class238.method1595((byte) 30, class40.field593, class224.field3406, class175.field2458, class180.field2516);
            int var8 = class54.field787.method824(class92.field1277);
            for (int var9 = 0; var9 < class68.field925; var9++) {
                int var10 = class54.field787.method824(class41.method273(0, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class224.field3406 = (class137.field1925 ? 26 : 22) + class68.field925 * 15;
            class175.field2458 = var8 + 8;
        }
        if (var5 != null) {
            class154.method1025(48, false, var5);
        }
        class170.method1113((byte) 94, arg3);
        if (class212.field3193 != -1) {
            class10.method64((byte) -114, 1, class212.field3193);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[IIB)Lec;")
    private final class24 method1166(int arg0, int[] arg1, int arg2, byte arg3) {
        int var5 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF5);
        field2492++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class24 var9 = (class24) this.field2500.method23(216, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class98 var10 = (class98) this.field2487.method23(216, var7);
            if (var10 == null) {
                var10 = class98.method648(this.field2497, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2487.method20(var10, var7, 0);
            }
            class24 var11 = var10.method650(arg1);
            if (arg3 != 93) {
                return null;
            } else if (var11 == null) {
                return null;
            } else {
                var10.method1115(arg3 - 131);
                this.field2500.method20(var11, var7, 0);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[II)Lec;")
    public final class24 method1167(int arg0, int[] arg1, int arg2) {
        int var4 = 77 % ((-arg0 - 38) / 58);
        field2491++;
        if (this.field2497.method1561(-24367) == 1) {
            return this.method1166(0, arg1, arg2, (byte) 93);
        } else if (this.field2497.method1577(arg2, -6339) == 1) {
            return this.method1166(arg2, arg1, 0, (byte) 93);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[IB)Lec;")
    public final class24 method1168(int arg0, int[] arg1, byte arg2) {
        if (arg2 != -83) {
            return null;
        }
        field2496++;
        if (this.field2490.method1561(-24367) == 1) {
            return this.method1163(arg0, 0, -10409, arg1);
        } else if (this.field2490.method1577(arg0, -6339) == 1) {
            return this.method1163(0, arg0, arg2 - 10326, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class104.field1454[arg0][var8][var14] == -class44.field662) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class200.field2788[arg0][arg1][arg3] + arg5;
            if (!class36.method242(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class36.method242(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class36.method242(var9, var11, var13)) {
                return false;
            } else if (class36.method242(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class239.method1600(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class36.method242(var6 + 1, class200.field2788[arg0][arg1][arg3] + arg5, var7 + 1) && class36.method242(var6 + 128 - 1, class200.field2788[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class36.method242(var6 + 128 - 1, class200.field2788[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class36.method242(var6 + 1, class200.field2788[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lhc;Lhc;)V")
    public class178(class235 arg0, class235 arg1) {
        this.field2497 = arg1;
        this.field2490 = arg0;
    }
}
