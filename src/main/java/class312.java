import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class312 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lwk;")
    private class155 field4406 = new class155(256);

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lwk;")
    private class155 field4415 = new class155(256);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lnl;")
    private class435 field4409;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lnl;")
    private class435 field4411;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lrc;")
    public static class108 field4407 = new class108(5, -1);

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field4413 = 0;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lch;")
    public static class151 field4416 = new class151("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
    public static boolean field4419 = false;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lrc;")
    public static class108 field4418 = new class108(26, 4);

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lap;")
    public static class310 field4420 = new class310(50, 8);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[II)Lqq;", line = 3)
    public final class44 method1985(int arg0, int[] arg1, int arg2) {
        field4414++;
        if (this.field4409.method2658(-1) == 1) {
            return this.method1990(8, arg1, arg2, 0);
        } else if (~this.field4409.method2638(1, arg2) == arg0) {
            return this.method1990(8, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[I)Lqq;", line = 24)
    public final class44 method1986(int arg0, int arg1, int[] arg2) {
        int var4 = 21 / ((-arg1 - 11) / 44);
        field4412++;
        if (this.field4411.method2658(-1) == 1) {
            return this.method1989(arg0, arg2, 0, 0);
        } else if (this.field4411.method2638(1, arg0) == 1) {
            return this.method1989(0, arg2, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIBIIII)Z", line = 49)
    public static final boolean method1987(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 21 % ((arg4 + 5) / 50);
        field4408++;
        if (arg8 < (arg3 + arg5) && arg0 + arg8 > arg3) {
            return arg6 < arg2 + arg7 && arg1 + arg6 > arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 65)
    public static void method1988(int arg0) {
        field4418 = null;
        field4407 = null;
        if (arg0 == 9682) {
            field4416 = null;
            field4420 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[III)Lqq;", line = 78)
    private final class44 method1989(int arg0, int[] arg1, int arg2, int arg3) {
        field4417++;
        int var5 = arg0 ^ ((arg3 & 0x80000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class44 var9 = (class44) this.field4415.method1104(-124, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class242 var10 = class242.method1682(this.field4411, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class44 var11 = var10.method1681();
            if (arg2 != 0) {
                return null;
            }
            this.field4415.method1100(var11, -13, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field704.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I[III)Lqq;", line = 115)
    private final class44 method1990(int arg0, int[] arg1, int arg2, int arg3) {
        field4410++;
        int var5 = (arg3 >>> 12 | (arg3 & 0x90000FFF) << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        if (arg0 != 8) {
            this.method1986(-15, 6, (int[]) null);
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class44 var9 = (class44) this.field4415.method1104(arg0 ^ 0xFFFFFF8C, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class246 var10 = (class246) this.field4406.method1104(arg0 ^ 0xFFFFFF88, var7);
            if (var10 == null) {
                var10 = class246.method1696(this.field4409, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4406.method1100(var10, 59, var7);
            }
            class44 var11 = var10.method1700(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method2714(arg0 ^ 0xFFFFFFCF);
                this.field4415.method1100(var11, 39, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lnl;Lnl;)V", line = 184)
    public class312(class435 arg0, class435 arg1) {
        this.field4409 = arg1;
        this.field4411 = arg0;
    }
}
