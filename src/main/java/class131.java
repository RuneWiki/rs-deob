import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class131 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2271 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lhi;")
    public static class82 field2270 = class95.method664((byte) -80, "Sprites charg-Bs");

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2274 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lam;")
    public static class277 field2276 = new class277();

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lhi;")
    public static class82 field2279 = class95.method664((byte) -38, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Z")
    public static boolean field2277 = false;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 4)
    public static void method906(boolean arg0) {
        if (!arg0) {
            field2279 = (class82) null;
        }
        field2276 = null;
        field2279 = null;
        field2270 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V", line = 17)
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2275++;
        if (arg5 != 24624) {
            return;
        }
        long var6 = class317.method2173(arg0, arg4, arg2);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x38CC66) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class157 var11 = class99.method682(var10, (byte) -86);
            if (var11.field2709 == -1) {
                int var14 = arg3;
                if (var6 > 0L) {
                    var14 = arg1;
                }
                int[] var15 = class320.field5531;
                int var16 = (52736 - (arg2 * 512)) * 4 + arg4 * 4 + 24624;
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var8 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var8 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var8 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var15[var16] = var14;
                    } else if (var8 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var8 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var8 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var8 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var8 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var8 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else {
                class186 var12 = null;
                int var13 = var11.field2725;
                if (!var11.field2721) {
                    var12 = class197.field3377[var11.field2709];
                } else if (var8 == 0) {
                    var12 = class197.field3377[var11.field2709];
                } else if (var8 == 1) {
                    var13 = var11.field2704;
                    var12 = class27.field362[var11.field2709];
                } else if (var8 == 2) {
                    var12 = class272.field4584[var11.field2709];
                } else if (var8 == 3) {
                    var12 = class16.field147[var11.field2709];
                    var13 = var11.field2704;
                }
                if (var12 != null) {
                    var12.method1284(arg4 * 4 + 48, (-var13 + 104 + -arg2) * 4 + 48);
                }
            }
        }
        long var17 = class297.method2054(arg0, arg4, arg2);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 14 & 0x1F;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 20 & 0x3;
            class157 var22 = class99.method682(var20, (byte) -120);
            if (var22.field2709 != -1) {
                class186 var26 = null;
                int var27 = var22.field2725;
                if (!var22.field2721) {
                    var26 = class197.field3377[var22.field2709];
                } else if (var21 == 0) {
                    var26 = class197.field3377[var22.field2709];
                } else if (var21 == 1) {
                    var27 = var22.field2704;
                    var26 = class27.field362[var22.field2709];
                } else if (var21 == 2) {
                    var26 = class272.field4584[var22.field2709];
                } else if (var21 == 3) {
                    var27 = var22.field2704;
                    var26 = class16.field147[var22.field2709];
                }
                if (var26 != null) {
                    var26.method1284(arg4 * 4 + 48, (-arg2 + -var27 + 104) * 4 + 48);
                }
            } else if (var19 == 9) {
                int[] var23 = class320.field5531;
                int var24 = 15658734;
                if (var17 > 0L) {
                    var24 = 15597568;
                }
                int var25 = (103 - arg2) * 2048 + arg4 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var23[var25 + 1536] = var24;
                    var23[var25 + 1024 + 1] = var24;
                    var23[var25 + 514] = var24;
                    var23[var25 + 3] = var24;
                } else {
                    var23[var25] = var24;
                    var23[var25 + 513] = var24;
                    var23[var25 + 2 + 1024] = var24;
                    var23[var25 + 3 + 1536] = var24;
                }
            }
        }
        long var28 = class262.method1870(arg0, arg4, arg2);
        if (var28 == 0L) {
            return;
        }
        int var30 = ((int) var28 & 0x3A1CB8) >> 20;
        int var31 = (int) (var28 >>> 32) & Integer.MAX_VALUE;
        class157 var32 = class99.method682(var31, (byte) -97);
        if (var32.field2709 == -1) {
            return;
        }
        class186 var33 = null;
        int var34 = var32.field2725;
        if (!var32.field2721) {
            var33 = class197.field3377[var32.field2709];
        } else if (var30 == 0) {
            var33 = class197.field3377[var32.field2709];
        } else if (var30 == 1) {
            var34 = var32.field2704;
            var33 = class27.field362[var32.field2709];
        } else if (var30 == 2) {
            var33 = class272.field4584[var32.field2709];
        } else if (var30 == 3) {
            var34 = var32.field2704;
            var33 = class16.field147[var32.field2709];
        }
        if (var33 != null) {
            var33.method1284((arg4 * 4) + 48, (-arg2 + 104 - var34) * 4 + 48);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIJ)Z", line = 341)
    public static final boolean method908(int arg0, int arg1, int arg2, long arg3) {
        class16 var5 = class15.field120[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field171 != null && var5.field171.field1622 == arg3) {
            return true;
        } else if (var5.field172 != null && var5.field172.field3106 == arg3) {
            return true;
        } else if (var5.field161 != null && var5.field161.field2153 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field165; var6++) {
                if (var5.field158[var6].field1064 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Luh;", line = 373)
    public static final class67 method909(byte arg0) {
        if (arg0 > -70) {
            field2279 = (class82) null;
        }
        class126.field2221 = 0;
        field2272++;
        return class231.method1637(-76);
    }
}
