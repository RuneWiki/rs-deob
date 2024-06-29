import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class481 extends class329 implements Runnable {

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Z")
    private boolean field7337 = true;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field7339 = -1;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Ltr;")
    private class184 field7352;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Loe;")
    public static class127 field7338 = new class127(49, 6);

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field7346 = 0;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field7349 = new String[5];

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field7350 = 0;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Ljc;")
    public static class291 field7351 = null;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Loe;")
    public static class127 field7348 = new class127(21, 4);

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ltr;)V", line = 493)
    public class481(class184 arg0) {
        this.field7352 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "run", descriptor = "()V", line = 8)
    public final void run() {
        while (this.field7337) {
            this.field7352.method1151(this, (byte) -124);
        }
        field7341++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 29)
    public final void method2905(byte arg0) {
        field7340++;
        if (arg0 != 0) {
            this.method2905((byte) 9);
        }
        this.field7337 = false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILea;IIIIIIIBII)Z", line = 43)
    public static final boolean method2906(int arg0, class367 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        field7347++;
        int var12 = arg3;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg3 - var14;
        class397.field5789[var14][var15] = 99;
        int var17 = arg2 - var15;
        class88.field1530[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class165.field2566[var18] = arg3;
        int var35 = var18 + 1;
        class230.field3499[var18] = arg2;
        int[][] var20 = arg1.field5398;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    if (arg9 > -26) {
                                        field7348 = null;
                                    }
                                    class324.field4869 = var13;
                                    class47.field717 = var12;
                                    return false;
                                }
                                var12 = class165.field2566[var19];
                                var13 = class230.field3499[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg1.field5389;
                                var24 = var13 - arg1.field5384;
                                if (arg0 == -4) {
                                    if (arg7 == var12 && arg5 == var13) {
                                        class324.field4869 = var13;
                                        class47.field717 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class169.method1062(arg4, 21264, arg6, var13, arg8, arg7, arg5, var12, arg6)) {
                                        class47.field717 = var12;
                                        class324.field4869 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg1.method2222(arg8, var12, arg11, var13, arg6, arg7, arg4, arg5, arg6, 64)) {
                                        class47.field717 = var12;
                                        class324.field4869 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg1.method2226(var12, var13, arg7, arg8, arg11, arg4, arg6, arg5, (byte) 98)) {
                                        class47.field717 = var12;
                                        class324.field4869 = var13;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg1.method2229(arg7, var12, arg5, arg10, var13, arg6, arg0, 2883872)) {
                                        class47.field717 = var12;
                                        class324.field4869 = var13;
                                        return true;
                                    }
                                } else if (arg1.method2216(arg5, arg10, var13, var12, arg6, arg0, arg7, -1)) {
                                    class47.field717 = var12;
                                    class324.field4869 = var13;
                                    return true;
                                }
                                var26 = class88.field1530[var22][var21] + 1;
                                if (var22 > 0 && class397.field5789[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg6 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var27) {
                                            class165.field2566[var35] = var12 - 1;
                                            class230.field3499[var35] = var13;
                                            class397.field5789[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class88.field1530[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg6 > var22 && class397.field5789[var22 + 1][var21] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][arg6 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg6 - 1)) {
                                            class165.field2566[var35] = var12 + 1;
                                            class230.field3499[var35] = var13;
                                            class397.field5789[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class88.field1530[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class397.field5789[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg6 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var29) {
                                            class165.field2566[var35] = var12;
                                            class230.field3499[var35] = var13 - 1;
                                            class397.field5789[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class88.field1530[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg6) && class397.field5789[var22][var21 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[var23 + arg6 - 1][arg6 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var30) {
                                            class165.field2566[var35] = var12;
                                            class230.field3499[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class397.field5789[var22][var21 + 1] = 4;
                                            class88.field1530[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class397.field5789[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class165.field2566[var35] = var12 - 1;
                                            class230.field3499[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class397.field5789[var22 - 1][var21 - 1] = 3;
                                            class88.field1530[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg6 > var22 && var21 > 0 && class397.field5789[var22 + 1][var21 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg6) {
                                            class165.field2566[var35] = var12 + 1;
                                            class230.field3499[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class397.field5789[var22 + 1][var21 - 1] = 9;
                                            class88.field1530[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg6 > var21 && class397.field5789[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg6 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class165.field2566[var35] = var12 - 1;
                                    class230.field3499[var35] = var13 + 1;
                                    class397.field5789[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class88.field1530[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg6) <= var22);
                        } while (var21 >= 128 - arg6);
                    } while (class397.field5789[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg6 + var23][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class165.field2566[var35] = var12 + 1;
                class230.field3499[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class397.field5789[var22 + 1][var21 + 1] = 12;
                class88.field1530[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 480)
    public static void method2907(int arg0) {
        if (arg0 != 1) {
            field7338 = null;
        }
        field7348 = null;
        field7349 = null;
        field7338 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 501)
    public final void method2908(int arg0) {
        if (arg0 != 1432) {
            field7346 = -34;
        }
        (new Thread(this, "a")).start();
        field7343++;
    }
}
