import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class188 extends class136 {

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Li;")
    public static class88 field3648 = class208.method1425(105, "(Udns");

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Li;")
    public static class88 field3646 = class208.method1425(105, ")3)3)3");

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Li;")
    public static class88 field3653 = class208.method1425(105, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    public abstract void method1164(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
    public abstract void method1163(int arg0, int arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZIIII)V")
    public final void method1311(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3650++;
        int var6 = this.field3647 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field3651 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method1168(var8, var6, var9, var7, arg4, arg3);
        if (!arg0) {
            this.method1164(3, -28, -113, -76);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lcc;BLcc;)V")
    public static final void method1312(class26 arg0, byte arg1, class26 arg2) {
        field3649++;
        if (class209.field3961) {
            class118.method806(arg0, arg2, (byte) -15);
            return;
        }
        if (arg1 < 53) {
            method1315(false);
        }
        if (class229.field4286 == 0 || class229.field4286 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg2.method141(class132.field2468, 382, 245 - var3, 16777215, -1);
            class72.method476(230, var4, 304, 34, 9179409);
            class72.method476(231, var4 + 1, 302, 32, 0);
            class72.method478(232, var4 + 2, class6.field83 * 3, 30, 9179409);
            class72.method478(class6.field83 * 3 + 232, var4 + 2, 300 - class6.field83 * 3, 30, 0);
            arg2.method141(class209.field3965, 382, 276 - var3, 16777215, -1);
        }
        if (class229.field4286 == 20) {
            class242.field4475.method878(382 - class242.field4475.field2436 / 2, 271 - class242.field4475.field2439 / 2);
            short var5 = 211;
            arg2.method141(class209.field3983, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method141(class209.field3981, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method141(class209.field3982, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method154(class166.method1142(new class88[] { class42.field713, class26.method162(class209.field3969) }, -3), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method154(class166.method1142(new class88[] { class89.field1698, class209.field3972.method596(true) }, -3), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class229.field4286 == 10) {
            class242.field4475.method878(202, 171);
            if (class65.field1182 == 0) {
                short var15 = 302;
                short var16 = 251;
                short var17 = 291;
                arg2.method141(class175.field3524, 382, var16, 16776960, 0);
                class129.field2418.method878(var15 - 73, var17 + -20);
                arg2.method153(class184.field3603, var15 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var18 = 462;
                int var35 = var16 + 30;
                class129.field2418.method878(var18 - 73, var17 + -20);
                arg2.method153(class205.field3905, var18 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class65.field1182 == 2) {
                short var6 = 211;
                short var7 = 302;
                short var8 = 321;
                arg2.method141(class209.field3983, 382, var6, 16776960, 0);
                int var27 = var6 + 15;
                arg2.method141(class209.field3981, 382, var27, 16776960, 0);
                int var29 = var27 + 15;
                arg2.method141(class209.field3982, 382, var29, 16776960, 0);
                boolean var9;
                if (class142.field2622 == 0 && class117.field2115 % 40 < 20 && class175.field3522) {
                    var9 = true;
                } else {
                    var9 = false;
                }
                var27 = var29 + 15;
                var27 += 10;
                arg2.method154(class166.method1142(new class88[] { class42.field713, class26.method162(class209.field3969), var9 ? class202.field3845 : class209.field3974 }, -3), 272, var27, 16777215, 0);
                boolean var10;
                if (class142.field2622 == 1 && class117.field2115 % 40 < 20 && class175.field3522) {
                    var10 = true;
                } else {
                    var10 = false;
                }
                var27 += 15;
                arg2.method154(class166.method1142(new class88[] { class89.field1698, class209.field3972.method596(true), var10 ? class202.field3845 : class209.field3974 }, -3), 274, var27, 16777215, 0);
                class129.field2418.method878(var7 - 73, var8 + -20);
                var27 += 15;
                arg2.method141(class218.field4119, var7, var8 + 5, 16777215, 0);
                short var11 = 462;
                class129.field2418.method878(var11 - 73, var8 + -20);
                arg2.method141(class6.field76, var11, var8 + 5, 16777215, 0);
            } else if (class65.field1182 == 3) {
                arg2.method141(class150.field2923, 382, 211, 16776960, 0);
                short var12 = 382;
                short var13 = 236;
                arg2.method141(class196.field3755, 382, var13, 16777215, 0);
                short var14 = 321;
                int var31 = var13 + 15;
                arg2.method141(class87.field1591, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg2.method141(class62.field1152, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg2.method141(class152.field2945, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                class129.field2418.method878(var12 - 73, var14 + -20);
                arg2.method141(class6.field76, var12, var14 + 5, 16777215, 0);
            }
        }
        if (class47.field884 != 1) {
            if (class86.field1550 > 0) {
                class80.method535((byte) 124, class86.field1550);
                class86.field1550 = 0;
            }
            class186.method1309(false);
        }
        class116.field2097[class131.field2462 ? 1 : 0].method878(725, 463);
        if (class229.field4286 <= 5 || class143.field2659 == 2) {
            return;
        }
        if (class32.field518 == null) {
            class32.field518 = class214.method1456(118, class226.field4249, class226.field4245, 0);
        }
        if (class32.field518 == null) {
            return;
        }
        byte var19 = 5;
        short var20 = 463;
        class32.field518.method878(var19, var20);
        byte var21 = 100;
        byte var22 = 35;
        arg2.method141(class166.method1142(new class88[] { class71.field1326, class199.field3789, class170.method1214(class28.field470, -113) }, -3), var21 / 2 + var19, var22 / 2 + var20 + -2, 16777215, 0);
        if (class129.field2416 != null) {
            arg0.method141(class196.field3765, var21 / 2 + var19, var20 + 12 - -(var22 / 2), 16777215, 0);
            return;
        }
        arg0.method141(class93.field1752, var21 / 2 + var19, var22 / 2 + var20 + 12, 16777215, 0);
        return;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIII)Z")
    public static final boolean method1313(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 10880) {
            field3653 = null;
        }
        field3657++;
        class46 var4 = new class46(arg0);
        boolean var5 = true;
        int var6 = -1;
        label72: while (true) {
            int var7 = var4.method332((byte) -112);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var13;
                class148 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method350(120);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var4.method347(26119);
                                    }
                                    int var10 = var4.method350(112);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var4.method347(26119) >> 2;
                                    var14 = arg3 + var11;
                                    var15 = var12 + arg1;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class190.method1323(var6, -12450);
                } while (var13 == 22 && class245.field4499 && var16.field2835 == 0 && var16.field2821 != 1 && !var16.field2828);
                var9 = true;
                if (!var16.method992(-23555)) {
                    var5 = false;
                    class113.field2047++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public abstract void method1176(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lbj;IIBIIZ)V")
    public static final void method1314(class22 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field3659++;
        long var7 = (long) ((arg2 << 16) + arg1);
        class97 var9 = (class97) class241.field4467.method1051(-1, var7);
        if (var9 != null) {
            return;
        }
        class97 var10 = (class97) class151.field2924.method1051(-1, var7);
        if (arg4 != -439631408) {
            method1312(null, (byte) 126, null);
        }
        if (var10 != null) {
            return;
        }
        class97 var11 = (class97) class205.field3909.method1051(-1, var7);
        if (var11 == null) {
            if (!arg6) {
                class97 var12 = (class97) class108.field1953.method1051(-1, var7);
                if (var12 != null) {
                    return;
                }
            }
            class97 var13 = new class97();
            var13.field1784 = arg3;
            var13.field1782 = arg5;
            var13.field1789 = arg0;
            if (arg6) {
                class241.field4467.method1054(var7, var13, -1);
                class208.field3945++;
            } else {
                class138.field2561.method1389(-20038, var13);
                class205.field3909.method1054(var7, var13, -1);
                class220.field4159++;
            }
        } else if (arg6) {
            var11.method909(192);
            class241.field4467.method1054(var7, var11, -1);
            class220.field4159--;
            class208.field3945++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static void method1315(boolean arg0) {
        if (!arg0) {
            method1313(null, 35, 6, -79);
        }
        field3646 = null;
        field3648 = null;
        field3653 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public abstract void method1166(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
    public static final int method1316(byte arg0, int arg1) {
        if (arg0 != 52) {
            method1314(null, 47, 124, (byte) 7, 121, -28, true);
        }
        field3652++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIII)V")
    public abstract void method1162(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
    public abstract void method1157(int arg0, int arg1);
}
