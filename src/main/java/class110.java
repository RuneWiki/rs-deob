import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class110 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lja;")
    private static class62 field2513 = class30.method243(43, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lja;")
    public static class62 field2512 = field2513;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lja;")
    private static class62 field2514 = class30.method243(43, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field2521 = 1;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lja;")
    private static class62 field2520 = class30.method243(43, "Players");

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lja;")
    public static class62 field2511 = field2514;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lja;")
    private static class62 field2517 = class30.method243(43, "This computers address has been blocked");

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lja;")
    public static class62 field2515 = field2520;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lja;")
    public static class62 field2519 = field2517;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lic;")
    public static class58 field2518;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[Lic;")
    public static class58[] field2522;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method888(int arg0) {
        field2514 = null;
        field2519 = null;
        field2517 = null;
        field2520 = null;
        field2522 = null;
        if (arg0 <= 5) {
            field2520 = null;
        }
        field2511 = null;
        field2513 = null;
        field2512 = null;
        field2515 = null;
        field2518 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
    public static final void method889(boolean arg0, int arg1) {
        field2523++;
        if (arg1 == -1 || !class29.method241(arg1, -1)) {
            return;
        }
        class54[] var2 = class131.field2990[arg1];
        if (arg0) {
            method891((byte) 56, -63, 127, 82, 21, -69);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class54 var4 = var2[var3];
            if (var4.field1343 != null) {
                class113 var5 = new class113();
                var5.field2610 = var4;
                var5.field2601 = var4.field1343;
                class124.method976(var5, -124);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public abstract void method750(int arg0);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public abstract void method753(boolean arg0);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lja;Lpd;Lja;I)Lic;")
    public static final class58 method890(class62 arg0, class108 arg1, class62 arg2, int arg3) {
        if (arg3 != 1536) {
            field2515 = null;
        }
        int var4 = arg1.method877(80, arg2);
        field2510++;
        int var5 = arg1.method868(arg0, (byte) -123, var4);
        return class111.method906(arg1, var4, arg3 ^ 0xFFFFF9FA, var5);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    public abstract int method752(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIIIII)V")
    public static final void method891(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2516++;
        int var6 = class119.field2703.method570(arg2, arg3, arg1);
        if (var6 != 0) {
            int var7 = class119.field2703.method546(arg2, arg3, arg1, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = arg5;
            int[] var10 = class135.field3106.field1432;
            int var11 = var7 & 0x1F;
            int var12 = var6 >> 14 & 0x7FFF;
            class65 var13 = class84.method653(6, var12);
            int var14 = (103 - arg1) * 4 * 512 + arg3 * 4 + 24624;
            if (var6 > 0) {
                var9 = arg4;
            }
            if (var13.field1604 == -1) {
                if (var11 == 0 || var11 == 2) {
                    if (var8 == 0) {
                        var10[var14] = var9;
                        var10[var14 + 512] = var9;
                        var10[var14 + 1024] = var9;
                        var10[var14 + 1536] = var9;
                    } else if (var8 == 1) {
                        var10[var14] = var9;
                        var10[var14 + 1] = var9;
                        var10[var14 + 2] = var9;
                        var10[var14 + 3] = var9;
                    } else if (var8 == 2) {
                        var10[var14 + 3] = var9;
                        var10[var14 + 515] = var9;
                        var10[var14 + 3 + 1024] = var9;
                        var10[var14 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var10[var14 + 1536] = var9;
                        var10[var14 + 1536 + 1] = var9;
                        var10[var14 + 2 + 1536] = var9;
                        var10[var14 + 1536 + 3] = var9;
                    }
                }
                if (var11 == 3) {
                    if (var8 == 0) {
                        var10[var14] = var9;
                    } else if (var8 == 1) {
                        var10[var14 + 3] = var9;
                    } else if (var8 == 2) {
                        var10[var14 + 1536 + 3] = var9;
                    } else if (var8 == 3) {
                        var10[var14 + 1536] = var9;
                    }
                }
                if (var11 == 2) {
                    if (var8 == 3) {
                        var10[var14] = var9;
                        var10[var14 + 512] = var9;
                        var10[var14 + 1024] = var9;
                        var10[var14 + 1536] = var9;
                    } else if (var8 == 0) {
                        var10[var14] = var9;
                        var10[var14 + 1] = var9;
                        var10[var14 + 2] = var9;
                        var10[var14 + 3] = var9;
                    } else if (var8 == 1) {
                        var10[var14 + 3] = var9;
                        var10[var14 + 3 + 512] = var9;
                        var10[var14 + 1027] = var9;
                        var10[var14 + 1539] = var9;
                    } else if (var8 == 2) {
                        var10[var14 + 1536] = var9;
                        var10[var14 + 1537] = var9;
                        var10[var14 + 1538] = var9;
                        var10[var14 + 3 + 1536] = var9;
                    }
                }
            } else {
                class114 var15 = class42.field960[var13.field1604];
                if (var15 != null) {
                    int var16 = (var13.field1612 * 4 - var15.field2625) / 2;
                    int var17 = (var13.field1615 * 4 - var15.field2624) / 2;
                    var15.method932(arg3 * 4 + var16 + 48, 48 - -((-var13.field1615 + -arg1 + 104) * 4) - -var17);
                }
            }
        }
        int var18 = class119.field2703.method588(arg2, arg3, arg1);
        if (var18 != 0) {
            int var19 = class119.field2703.method546(arg2, arg3, arg1, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class65 var23 = class84.method653(arg0 + 121, var22);
            if (var23.field1604 != -1) {
                class114 var24 = class42.field960[var23.field1604];
                if (var24 != null) {
                    int var25 = (var23.field1615 * 4 - var24.field2624) / 2;
                    int var26 = (var23.field1612 * 4 - var24.field2625) / 2;
                    var24.method932(arg3 * 4 + var26 + 48, (-var23.field1615 + 104 + -arg1) * 4 + (48 - -var25));
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var28 = class135.field3106.field1432;
                int var29 = arg3 * 4 + (52736 - arg1 * 512) * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1024 + 1] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 512 + 1] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 3 + 1536] = var27;
                }
            }
        }
        int var30 = class119.field2703.method584(arg2, arg3, arg1);
        if (arg0 != -115 || var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class65 var32 = class84.method653(arg0 ^ 0xFFFFFF8B, var31);
        if (var32.field1604 == -1) {
            return;
        }
        class114 var33 = class42.field960[var32.field1604];
        if (var33 != null) {
            int var34 = (var32.field1615 * 4 - var33.field2624) / 2;
            int var35 = (var32.field1612 * 4 - var33.field2625) / 2;
            var33.method932(arg3 * 4 + var35 + 48, (-arg1 + 104 + -var32.field1615) * 4 + 48 + var34);
            return;
        }
    }
}
