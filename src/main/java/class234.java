import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class234 {

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Lhl;")
    private class375 field3494 = new class375(256);

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lhl;")
    private class375 field3498 = new class375(256);

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Lci;")
    private class320 field3493;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Lci;")
    private class320 field3495;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
    public static int[] field3487 = new int[120];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "[[[B")
    public static byte[][][] field3497;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3487[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[III)Lcv;", line = 3)
    private final class407 method1550(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 > -13) {
            this.field3498 = null;
        }
        field3489++;
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class407 var9 = (class407) this.field3498.method2284(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class527 var10 = (class527) this.field3494.method2284(true, var7);
            if (var10 == null) {
                var10 = class527.method3131(this.field3495, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3494.method2292(var7, var10, (byte) -128);
            }
            class407 var11 = var10.method3126(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method421(22071);
                this.field3498.method2292(var7, var11, (byte) -127);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[II)Lcv;", line = 51)
    public final class407 method1551(int arg0, int[] arg1, int arg2) {
        field3496++;
        if (this.field3495.method2033((byte) 60) == 1) {
            return this.method1550(0, arg1, -125, arg2);
        } else if (this.field3495.method2030(-10914, arg2) == 1) {
            return this.method1550(arg2, arg1, -126, 0);
        } else if (arg0 > -23) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 76)
    public static final void method1552(int arg0) {
        if (arg0 == 0) {
            field3488++;
            class211.field3186.method2980(arg0 ^ 0xF51A66E8);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 95)
    public static void method1553(byte arg0) {
        if (arg0 != 35) {
            field3487 = null;
        }
        field3487 = null;
        field3497 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([IIB)Lcv;", line = 110)
    public final class407 method1554(int[] arg0, int arg1, byte arg2) {
        field3490++;
        if (this.field3493.method2033((byte) 60) == 1) {
            return this.method1556(arg0, 0, 0, arg1);
        } else if (this.field3493.method2030(-10914, arg1) == 1) {
            return this.method1556(arg0, 0, arg1, 0);
        } else {
            if (arg2 < 29) {
                method1555(-91, 21, 95);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)B", line = 129)
    public static final byte method1555(int arg0, int arg1, int arg2) {
        if (arg2 > -75) {
            return 10;
        }
        field3491++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([IIII)Lcv;", line = 148)
    private final class407 method1556(int[] arg0, int arg1, int arg2, int arg3) {
        field3492++;
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFFA) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class407 var9 = (class407) this.field3498.method2284(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class61 var10 = class61.method514(this.field3493, arg2, arg3);
            if (arg1 != 0) {
                this.field3494 = null;
            }
            if (var10 == null) {
                return null;
            }
            class407 var11 = var10.method512();
            this.field3498.method2292(var7, var11, (byte) -127);
            if (arg0 != null) {
                arg0[0] -= var11.field5779.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lci;Lci;)V", line = 211)
    public class234(class320 arg0, class320 arg1) {
        this.field3493 = arg0;
        this.field3495 = arg1;
    }
}
