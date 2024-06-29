import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class637 extends class105 {

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "[I")
    public static int[] field9119 = new int[2];

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "[[B")
    public static byte[][] field9121 = new byte[1000][];

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "[B")
    private byte[] field9123;

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class637() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3633(int arg0, int arg1, int arg2, int arg3) {
        this.field9123 = new byte[arg1 * 2 * arg0 * arg2];
        field9122++;
        this.method2893(arg0, arg2, arg3 + arg3, arg1);
        return this.field9123;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lec;IIIB)V")
    public static final void method3634(class213 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9126++;
        if (arg4 != -29) {
            field9119 = null;
        }
        class573 var5 = arg0.method1280(arg4 ^ 0x1C);
        int var6 = arg0.field2578 - arg0.field2588.field7554 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg0.field2630 > 25) {
                if (arg2 < 0 && var5.field8403 != -1) {
                    arg0.field2634 = var5.field8403;
                    arg0.field2594 = false;
                } else if (arg2 <= 0 || var5.field8385 == -1) {
                    arg0.field2634 = var5.field8366;
                } else {
                    arg0.field2634 = var5.field8385;
                }
                arg0.field2594 = false;
            } else if (!arg0.field2594 || !var5.method3353(-1, arg0.field2634)) {
                arg0.field2634 = var5.method3358(0);
                arg0.field2594 = arg0.field2634 != -1;
            }
        } else if (arg0.field2628 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class71.field1078[arg3] - arg0.field2588.field7554 & 0x3FFF;
            arg0.field2594 = false;
            if (arg1 == 2 && var5.field8386 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field8398 != -1) {
                    arg0.field2634 = var5.field8398;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field8358 != -1) {
                    arg0.field2634 = var5.field8358;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field8382 == -1) {
                    arg0.field2634 = var5.field8386;
                } else {
                    arg0.field2634 = var5.field8382;
                }
            } else if (arg1 == 0 && var5.field8389 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field8405 != -1) {
                    arg0.field2634 = var5.field8405;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field8377 != -1) {
                    arg0.field2634 = var5.field8377;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field8391 == -1) {
                    arg0.field2634 = var5.field8389;
                } else {
                    arg0.field2634 = var5.field8391;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field8356 != -1) {
                arg0.field2634 = var5.field8356;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field8362 != -1) {
                arg0.field2634 = var5.field8362;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field8395 == -1) {
                arg0.field2634 = var5.field8366;
            } else {
                arg0.field2634 = var5.field8395;
            }
        } else if (var6 == 0 && arg0.field2630 <= 25) {
            if (arg1 == 2 && var5.field8386 != -1) {
                arg0.field2634 = var5.field8386;
            } else if (arg1 == 0 && var5.field8389 != -1) {
                arg0.field2634 = var5.field8389;
            } else {
                arg0.field2634 = var5.field8366;
            }
            arg0.field2594 = false;
        } else {
            arg0.field2594 = false;
            if (arg1 == 2 && var5.field8386 != -1) {
                if (arg2 < 0 && var5.field8392 != -1) {
                    arg0.field2634 = var5.field8392;
                } else if (arg2 <= 0 || var5.field8399 == -1) {
                    arg0.field2634 = var5.field8386;
                } else {
                    arg0.field2634 = var5.field8399;
                }
            } else if (arg1 == 0 && var5.field8389 != -1) {
                if (arg2 < 0 && var5.field8396 != -1) {
                    arg0.field2634 = var5.field8396;
                } else if (arg2 <= 0 || var5.field8369 == -1) {
                    arg0.field2634 = var5.field8389;
                } else {
                    arg0.field2634 = var5.field8369;
                }
            } else if (arg2 < 0 && var5.field8383 != -1) {
                arg0.field2634 = var5.field8383;
            } else if (arg2 <= 0 || var5.field8373 == -1) {
                arg0.field2634 = var5.field8366;
            } else {
                arg0.field2634 = var5.field8373;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public static void method3635(boolean arg0) {
        field9121 = null;
        if (arg0) {
            method3636(true);
        }
        field9119 = null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)Lse;")
    public static final class233 method3636(boolean arg0) {
        field9118++;
        if (arg0) {
            method3637(-61, 51, 7);
        }
        class233 var1 = (class233) class264.field3635.method347(0);
        if (var1 != null) {
            var1.method3045(!arg0);
            var1.method1037(-72);
            return var1;
        }
        class233 var2;
        do {
            var2 = (class233) class425.field6104.method347(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method1420(21) > class301.method1787((byte) -70)) {
                return null;
            }
            var2.method3045(true);
            var2.method1037(-102);
        } while ((Long.MIN_VALUE & var2.field2006) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(III)Z")
    public static final boolean method3637(int arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            field9124++;
            return class569.method3339(arg2, arg0, true) & class356.method2007(arg2, -74, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BII)V")
    public final void method767(byte arg0, int arg1, int arg2) {
        if (arg2 >= -96) {
            return;
        }
        field9120++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9123[var10001] = (byte) (var5 * 3 >> 5);
        this.field9123[var6] = (byte) (var5 * 3 >> 5);
    }
}
