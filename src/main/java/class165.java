import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class165 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lok;")
    public static class166 field2407 = new class166(6, -1);

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Ljp;")
    public static class236 field2408 = new class236(5);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[I")
    public static int[] field2409 = new int[2];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lkf;")
    public class165 field2400;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ldm;")
    public class37 field2402;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public final void method1113(byte arg0) {
        field2403++;
        if (class213.field2892 >= 500) {
            return;
        }
        int var2 = -18 % ((arg0 + 60) / 50);
        this.field2402 = null;
        this.field2401 = 0;
        this.field2400 = class206.field2848;
        class213.field2892++;
        class206.field2848 = this;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILit;)V")
    public static final void method1114(int arg0, int arg1, int arg2, int arg3, class455 arg4) {
        if (arg3 != 23245) {
            field2407 = null;
        }
        field2405++;
        class20 var5 = arg4.method2600(61);
        int var6 = arg4.field6222 - arg4.field6233.field3755 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg4.field6182 > 25) {
                arg4.field6217 = false;
                if (arg1 < 0 && var5.field334 != -1) {
                    arg4.field6172 = var5.field334;
                } else if (arg1 <= 0 || var5.field346 == -1) {
                    arg4.field6172 = var5.field351;
                } else {
                    arg4.field6172 = var5.field346;
                }
            } else if (!arg4.field6217 || !var5.method192(arg3 - 23245, arg4.field6172)) {
                arg4.field6172 = var5.method190(false);
                arg4.field6217 = arg4.field6172 != -1;
            }
        } else if (arg4.field6202 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class252.field3342[arg2] - arg4.field6233.field3755 & 0x3FFF;
            if (arg0 == 2 && var5.field337 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field340 != -1) {
                    arg4.field6172 = var5.field340;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field370 != -1) {
                    arg4.field6172 = var5.field370;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field333 == -1) {
                    arg4.field6172 = var5.field337;
                } else {
                    arg4.field6172 = var5.field333;
                }
            } else if (arg0 == 0 && var5.field339 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field357 != -1) {
                    arg4.field6172 = var5.field357;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field324 != -1) {
                    arg4.field6172 = var5.field324;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field373 == -1) {
                    arg4.field6172 = var5.field339;
                } else {
                    arg4.field6172 = var5.field373;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field360 != -1) {
                arg4.field6172 = var5.field360;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field372 != -1) {
                arg4.field6172 = var5.field372;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field369 == -1) {
                arg4.field6172 = var5.field351;
            } else {
                arg4.field6172 = var5.field369;
            }
            arg4.field6217 = false;
        } else if (var6 == 0 && arg4.field6182 <= 25) {
            arg4.field6217 = false;
            if (arg0 == 2 && var5.field337 != -1) {
                arg4.field6172 = var5.field337;
            } else if (arg0 == 0 && var5.field339 != -1) {
                arg4.field6172 = var5.field339;
            } else {
                arg4.field6172 = var5.field351;
            }
        } else {
            arg4.field6217 = false;
            if (arg0 == 2 && var5.field337 != -1) {
                if (arg1 < 0 && var5.field344 != -1) {
                    arg4.field6172 = var5.field344;
                } else if (arg1 <= 0 || var5.field329 == -1) {
                    arg4.field6172 = var5.field337;
                } else {
                    arg4.field6172 = var5.field329;
                }
            } else if (arg0 == 0 && var5.field339 != -1) {
                if (arg1 < 0 && var5.field347 != -1) {
                    arg4.field6172 = var5.field347;
                } else if (arg1 <= 0 || var5.field326 == -1) {
                    arg4.field6172 = var5.field339;
                } else {
                    arg4.field6172 = var5.field326;
                }
            } else if (arg1 < 0 && var5.field371 != -1) {
                arg4.field6172 = var5.field371;
            } else if (arg1 <= 0 || var5.field330 == -1) {
                arg4.field6172 = var5.field351;
            } else {
                arg4.field6172 = var5.field330;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static void method1115(byte arg0) {
        field2409 = null;
        field2407 = null;
        field2408 = null;
        if (arg0 != -126) {
            field2406 = -22;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method1116(String[] arg0, boolean arg1) {
        field2399++;
        String[] var2 = new String[5];
        if (arg1) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }
}
