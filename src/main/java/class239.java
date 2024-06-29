import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class239 extends class446 {

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field3398 = 0;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "Lkn;")
    public static class442 field3394 = new class442("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "[I")
    public static int[] field3411 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public int field3397;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "Ltr;")
    public static class161 field3410;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "Ljava/lang/String;")
    public String field3404;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "[Lsg;")
    public static class226[] field3413;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
    public static final void method1621(int arg0) {
        ++field3400;
        int var1 = -70 / ((arg0 - -20) / 47);
        class285.field4015.method900(0);
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V")
    public final void method1622(int arg0) {
        int var2 = -7 % ((arg0 - -54) / 32);
        super.field6253 |= Long.MIN_VALUE;
        ++field3406;
        if (~this.method1624(true) == -1L) {
            class7.field111.method2478(this, false);
        }
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)Z")
    public static final boolean method1623(byte arg0) {
        int var1 = -106 / ((arg0 - -56) / 42);
        ++field3409;
        if (class373.field5238) {
            try {
                if ((Boolean) class262.method1715("showingVideoAd", class241.field3426.field4121, (byte) -112)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)J")
    public final long method1624(boolean arg0) {
        if (!arg0) {
            method1627(-95, (class268) null);
        }
        ++field3403;
        return super.field6253 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
    public static final void method1625(int arg0, int arg1, int arg2) {
        if (arg1 == 4) {
            ++field3396;
            if (!(class354.field4838 > class354.field4834)) {
                if (class354.field4838 < class354.field4834) {
                    class354.field4834 = (float) ((double) class354.field4834 - (double) class354.field4834 / 30.0D);
                    if (class354.field4838 > class354.field4834) {
                        class354.field4834 = class354.field4838;
                    }
                    class410.method2564((byte) -42);
                    class354.field4839 = (int) class354.field4834 >> 1;
                    class354.field4832 = class157.method1054(arg1 + -4, class354.field4839);
                }
            } else {
                class354.field4834 = (float) ((double) class354.field4834 / 30.0D + (double) class354.field4834);
                if (class354.field4834 > class354.field4838) {
                    class354.field4834 = class354.field4838;
                }
                class410.method2564((byte) -42);
                class354.field4839 = (int) class354.field4834 >> 1;
                class354.field4832 = class157.method1054(0, class354.field4839);
            }
            if (class277.field3854 != -1 && ~class192.field2649 != 0) {
                int var3 = class277.field3854 - class222.field3100;
                if (var3 < 2 || ~var3 < -3) {
                    var3 /= 8;
                }
                int var4 = -class254.field3580 + class192.field2649;
                class222.field3100 += var3;
                if (~var4 > -3 || ~var4 < -3) {
                    var4 /= 8;
                }
                class254.field3580 -= -var4;
                if (var3 == 0 && var4 == 0) {
                    class192.field2649 = -1;
                    class277.field3854 = -1;
                }
                class410.method2564((byte) -42);
            }
            if (~class222.field3105 < -1) {
                --class377.field5396;
                if (class377.field5396 == 0) {
                    class377.field5396 = 100;
                    --class222.field3105;
                }
            } else {
                class223.field3122 = -1;
                class352.field4820 = -1;
            }
            if (class189.field2610 && class135.field1963 != null) {
                for (class248 var5 = (class248) class135.field1963.method646(48); var5 != null; var5 = (class248) class135.field1963.method641(false)) {
                    class25 var6 = class328.method2113(var5.field3511.field851, (byte) -125);
                    if (class395.field5654 == 0 && var5.method1669(arg0, arg2, 0)) {
                        if (var6.field425 != null) {
                            if (var6.field425[4] != null) {
                                class66.method514(0, var6.field429, 1012, var6.field443, (byte) -16, -1, (long) var5.field3511.field851, var6.field425[4]);
                            }
                            if (var6.field425[3] != null) {
                                class66.method514(0, var6.field429, 1001, var6.field443, (byte) -16, -1, (long) var5.field3511.field851, var6.field425[3]);
                            }
                            if (var6.field425[2] != null) {
                                class66.method514(0, var6.field429, 1007, var6.field443, (byte) -16, -1, (long) var5.field3511.field851, var6.field425[2]);
                            }
                            if (var6.field425[1] != null) {
                                class66.method514(0, var6.field429, 1009, var6.field443, (byte) -16, -1, (long) var5.field3511.field851, var6.field425[1]);
                            }
                            if (var6.field425[0] != null) {
                                class66.method514(0, var6.field429, 1008, var6.field443, (byte) -16, -1, (long) var5.field3511.field851, var6.field425[0]);
                            }
                        }
                        if (!var5.field3511.field850) {
                            var5.field3511.field850 = true;
                            class177.method1166(15, var5.field3511.field851, var6.field429);
                        }
                        if (var5.field3511.field850) {
                            class177.method1166(17, var5.field3511.field851, var6.field429);
                        }
                    } else if (var5.field3511.field850) {
                        var5.field3511.field850 = false;
                        class177.method1166(16, var5.field3511.field851, var6.field429);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)I")
    public final int method1626(byte arg0) {
        ++field3405;
        return arg0 >= -92 ? -81 : (int) super.field5600;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILnq;)V")
    public static final void method1627(int arg0, class268 arg1) {
        class14.field282 = arg1;
        int var2 = -111 % ((20 - arg0) / 51);
        ++field3401;
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
    public final void method1628(int arg0) {
        ++field3402;
        super.field6253 = Long.MIN_VALUE & super.field6253 | class385.method2442(-6631) + 500L;
        class428.field6041.method2478(this, false);
        if (arg0 != 14478) {
            field3411 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I")
    public final int method1629(int arg0) {
        ++field3407;
        if (arg0 != 255) {
            this.method1624(false);
        }
        return (int) (255L & super.field5600 >>> 32);
    }

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)V")
    public static void method1630(int arg0) {
        field3411 = null;
        field3410 = null;
        if (arg0 == 0) {
            field3413 = null;
            field3394 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIIZ)I")
    public static final int method1631(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field3395;
        class304 var4 = class356.method2281(arg2, arg3, 0);
        if (var4 == null) {
            return 0;
        } else {
            if (!arg0) {
                method1627(126, (class268) null);
            }
            return arg1 >= 0 && ~var4.field4194.length < ~arg1 ? var4.field4194[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(II)V")
    public class239(int arg0, int arg1) {
        super.field5600 = (long) arg0 << 32 | (long) arg1;
    }
}
