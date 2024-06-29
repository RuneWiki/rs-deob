import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class194 {

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Ltg;")
    private class277 field3596 = new class277(256);

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Ltg;")
    private class277 field3607 = new class277(256);

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lgf;")
    private class7 field3598;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lgf;")
    private class7 field3595;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    public static boolean field3593 = false;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Llc;")
    public static class143 field3601 = class66.method374("<col=ffffff> )4 ", -1);

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "[I")
    public static int[] field3591 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Llc;")
    public static class143 field3597 = class66.method374(" )2> <col=00ffff>", -1);

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Llc;")
    private static class143 field3608 = class66.method374("", -1);

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Llc;")
    public static class143 field3592 = field3608;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "J")
    public static long field3594;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lgf;")
    public static class7 field3589;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lgf;")
    public static class7 field3609;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([IIII)Lce;")
    private final class216 method1333(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 >>> 12 | (arg1 & 0x70000FFF) << 4) ^ arg3;
        int var6 = var5 | arg1 << 16;
        field3602++;
        long var7 = (long) var6 ^ 0x100000000L;
        class216 var9 = (class216) this.field3607.method1824(var7, 0);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class142 var10 = (class142) this.field3596.method1824(var7, 0);
            if (var10 == null) {
                var10 = class142.method852(this.field3598, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3596.method1825(var10, (byte) 64, var7);
            }
            class216 var11 = var10.method857(arg0);
            if (var11 == null) {
                return null;
            }
            var10.method349(0);
            this.field3607.method1825(var11, (byte) 64, var7);
            if (arg2 >= -40) {
                this.field3607 = null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method1334(int arg0) {
        field3597 = null;
        field3589 = null;
        field3601 = null;
        field3591 = null;
        field3592 = null;
        field3609 = null;
        field3608 = null;
        if (arg0 != 0) {
            field3600 = 43;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)V")
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 0) {
            method1334(-35);
        }
        if (arg1 <= class239.field4321 && arg0 >= class188.field3398) {
            boolean var6;
            if (arg2 < class31.field481) {
                arg2 = class31.field481;
                var6 = false;
            } else if (class9.field173 < arg2) {
                var6 = false;
                arg2 = class9.field173;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class31.field481 > arg3) {
                arg3 = class31.field481;
                var7 = false;
            } else if (arg3 <= class9.field173) {
                var7 = true;
            } else {
                arg3 = class9.field173;
                var7 = false;
            }
            if (class188.field3398 <= arg1) {
                class289.method1927(class15.field268[arg1++], arg5, arg2, -88, arg3);
            } else {
                arg1 = class188.field3398;
            }
            if (class239.field4321 < arg0) {
                arg0 = class239.field4321;
            } else {
                class289.method1927(class15.field268[arg0--], arg5, arg2, -108, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg0; var8++) {
                    int[] var9 = class15.field268[var8];
                    var9[arg2] = var9[arg3] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg0; var10++) {
                    class15.field268[var10][arg2] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg0; var11++) {
                    class15.field268[var11][arg3] = arg5;
                }
            }
        }
        field3599++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[III)Lce;")
    private final class216 method1336(int arg0, int[] arg1, int arg2, int arg3) {
        field3605++;
        int var5 = arg0 ^ (arg3 >>> 12 | (arg3 & 0x60000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class216 var9 = (class216) this.field3607.method1824(var7, arg2);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class78 var10 = class78.method445(this.field3595, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class216 var11 = var10.method446();
            this.field3607.method1825(var11, (byte) 64, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field3963.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[II)Lce;")
    public final class216 method1337(int arg0, int[] arg1, int arg2) {
        int var4 = -119 % ((-arg0 - 26) / 34);
        field3603++;
        if (this.field3598.method32((byte) -47) == 1) {
            return this.method1333(arg1, 0, -103, arg2);
        } else if (this.field3598.method60(-20, arg2) == 1) {
            return this.method1333(arg1, arg2, -105, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I[II)Lce;")
    public final class216 method1338(int arg0, int[] arg1, int arg2) {
        field3604++;
        if (this.field3595.method32((byte) -49) == 1) {
            return this.method1336(arg0, arg1, 0, 0);
        } else if (this.field3595.method60(-103, arg0) == 1) {
            return this.method1336(0, arg1, 0, arg0);
        } else {
            if (arg2 >= -102) {
                method1340((byte) 124, 8);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IIIIII)V")
    public static final void method1339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= class31.field481 && class9.field173 >= arg4 && class188.field3398 <= arg0 && class239.field4321 >= arg5) {
            class178.method1173(-1, arg0, arg4, arg1, arg2, arg5);
        } else {
            class155.method1023(arg1, -67, arg2, arg5, arg0, arg4);
        }
        field3606++;
        if (arg3 != -2) {
            field3593 = true;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Z")
    public static final boolean method1340(byte arg0, int arg1) {
        if (arg0 != 57) {
            method1334(-108);
        }
        field3590++;
        return (arg1 & 0x28117D44) >> 29 != 0;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lgf;Lgf;)V")
    public class194(class7 arg0, class7 arg1) {
        this.field3598 = arg1;
        this.field3595 = arg0;
    }
}
