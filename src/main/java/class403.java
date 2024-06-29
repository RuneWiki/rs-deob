import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class403 extends class173 {

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Ljava/lang/String;")
    public String field5366;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Lut;")
    public class719 field5365;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lbs;")
    public static class454 field5359 = new class454();

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Lfca;")
    public static class661 field5363 = new class661();

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIIIILeo;)Z")
    public static final boolean method2353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class340 arg11) {
        field5361++;
        int var12 = arg4;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = arg3 - var15;
        class391.field5073[var14][var15] = 99;
        class384.field4800[var14][var15] = 0;
        byte var18 = 0;
        if (arg9 > -92) {
            method2356(-106);
        }
        class195.field2707[var18] = arg4;
        int var19 = 0;
        int var35 = var18 + 1;
        class57.field763[var18] = arg3;
        int[][] var20 = arg11.field4160;
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
                                    class317.field3948 = var12;
                                    class425.field5594 = var13;
                                    return false;
                                }
                                var13 = class57.field763[var19];
                                var12 = class195.field2707[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg11.field4158;
                                var24 = var13 - arg11.field4157;
                                if (arg10 == -4) {
                                    if (arg2 == var12 && arg5 == var13) {
                                        class317.field3948 = var12;
                                        class425.field5594 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class332.method1918(var13, (byte) -128, arg2, arg1, arg5, arg8, arg0, arg0, var12)) {
                                        class425.field5594 = var13;
                                        class317.field3948 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg11.method1968(arg0, arg0, arg6, arg5, var12, (byte) 91, arg2, arg1, arg8, var13)) {
                                        class317.field3948 = var12;
                                        class425.field5594 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg11.method1972(arg1, var13, (byte) -79, var12, arg6, arg8, arg5, arg0, arg2)) {
                                        class317.field3948 = var12;
                                        class425.field5594 = var13;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg11.method1963(-12959, arg5, var13, arg7, arg2, arg10, arg0, var12)) {
                                        class317.field3948 = var12;
                                        class425.field5594 = var13;
                                        return true;
                                    }
                                } else if (arg11.method1967(arg5, true, arg0, var13, arg10, arg7, var12, arg2)) {
                                    class425.field5594 = var13;
                                    class317.field3948 = var12;
                                    return true;
                                }
                                var26 = class384.field4800[var22][var21] + 1;
                                if (var22 > 0 && class391.field5073[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg0 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg0 - 1) {
                                            class195.field2707[var35] = var12 - 1;
                                            class57.field763[var35] = var13;
                                            class391.field5073[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class384.field4800[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg0 > var22 && class391.field5073[var22 + 1][var21] == 0 && (var20[arg0 + var23][var24] & 0x60E40000) == 0 && (var20[arg0 + var23][var24 - (1 - arg0)] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg0 - 1) <= var28) {
                                            class195.field2707[var35] = var12 + 1;
                                            class57.field763[var35] = var13;
                                            class391.field5073[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class384.field4800[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class391.field5073[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg0 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg0 - 1) <= var29) {
                                            class195.field2707[var35] = var12;
                                            class57.field763[var35] = var13 - 1;
                                            class391.field5073[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class384.field4800[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg0 && class391.field5073[var22][var21 + 1] == 0 && (var20[var23][arg0 + var24] & 0x4E240000) == 0 && (var20[arg0 + var23 - 1][arg0 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg0 - 1) {
                                            class195.field2707[var35] = var12;
                                            class57.field763[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class391.field5073[var22][var21 + 1] = 4;
                                            class384.field4800[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg0 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class391.field5073[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg0) {
                                            class195.field2707[var35] = var12 - 1;
                                            class57.field763[var35] = var13 - 1;
                                            class391.field5073[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class384.field4800[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg0) && var21 > 0 && class391.field5073[var22 + 1][var21 - 1] == 0 && (var20[arg0 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg0) {
                                            class195.field2707[var35] = var12 + 1;
                                            class57.field763[var35] = var13 - 1;
                                            class391.field5073[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class384.field4800[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg0) && class391.field5073[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg0 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg0; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg0 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class195.field2707[var35] = var12 - 1;
                                    class57.field763[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class391.field5073[var22 - 1][var21 + 1] = 6;
                                    class384.field4800[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg0));
                        } while (128 - arg0 <= var21);
                    } while (class391.field5073[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg0 + var23][arg0 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg0; var34++) {
                    if ((var20[var23 + var34][arg0 + var24] & 0x7E240000) != 0 || (var20[var23 + arg0][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class195.field2707[var35] = var12 + 1;
                class57.field763[var35] = var13 + 1;
                class391.field5073[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class384.field4800[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
    public final int method2354(int arg0) {
        if (arg0 != 0) {
            this.method2355(null, -83);
        }
        field5362++;
        return this.field5365.field9453.field2279 == this.field5365.field9453 ? -1 : ((class765) this.field5365.field9453.field2279).field10412;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvba;I)Z")
    public final boolean method2355(class765 arg0, int arg1) {
        field5367++;
        arg0.method1084((byte) 103);
        boolean var3 = true;
        class765 var4 = (class765) this.field5365.method3855(arg1 - 2015625216);
        if (arg1 != 2015625216) {
            return true;
        }
        while (var4 != null) {
            if (class458.method2590(var4.field10412, arg0.field10412, 117)) {
                class231.method1482(12514, var4, arg0);
                this.field5360++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class765) this.field5365.method3861(true);
            var3 = false;
        }
        this.field5365.method3862(arg0, false);
        this.field5360++;
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method2356(int arg0) {
        field5363 = null;
        field5359 = null;
        if (arg0 != 29415) {
            field5363 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILvba;)Z")
    public final boolean method2357(int arg0, class765 arg1) {
        field5364++;
        int var3 = this.method2354(0);
        arg1.method1084((byte) -119);
        if (arg0 != 20488) {
            this.method2357(-32, null);
        }
        this.field5360--;
        if (this.field5360 != 0) {
            return var3 != this.method2354(0);
        }
        this.method1946(-10364);
        this.method1084((byte) -125);
        class486.field6268--;
        class655.field8449.method2918(arg1.field10409, this, 95);
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class403(String arg0) {
        this.field5366 = arg0;
        this.field5365 = new class719();
    }
}
