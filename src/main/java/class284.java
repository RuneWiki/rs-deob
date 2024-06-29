import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class284 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4479 = " has logged out.";

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4483 = "Continue";

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4480 = 255;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4484 = "Loading...";

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
    public static boolean field4487 = true;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Lf;")
    public static class36 field4490 = null;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lqh;")
    public static class201 field4481;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lqh;")
    public static class201 field4485;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lii;")
    public static class256 field4486;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[[[I")
    public static int[][][] field4482;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        field4484 = null;
        field4485 = null;
        field4482 = null;
        int var1 = 110 % ((arg0 + 15) / 57);
        field4481 = null;
        field4486 = null;
        field4483 = null;
        field4490 = null;
        field4479 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lel;Lel;I)V")
    public static final void method1912(class202 arg0, class202 arg1, int arg2) {
        if (arg0.field3248 != null) {
            arg0.method1388(26);
        }
        arg0.field3245 = arg1;
        field4488++;
        arg0.field3248 = arg1.field3248;
        arg0.field3248.field3245 = arg0;
        arg0.field3245.field3248 = arg0;
        if (arg2 >= -103) {
            method1912((class202) null, (class202) null, 60);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIIIIZI)Z")
    public static final boolean method1913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        if (arg2 != -1) {
            field4481 = null;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class100.field1647[var13][var40] = 0;
                class45.field814[var13][var40] = 99999999;
            }
        }
        field4489++;
        class100.field1647[arg1][arg0] = 99;
        int var14 = arg1;
        int var15 = arg0;
        byte var16 = 0;
        class45.field814[arg1][arg0] = 0;
        class238.field3866[var16] = arg1;
        int var17 = 0;
        int var41 = var16 + 1;
        class148.field2387[var16] = arg0;
        boolean var18 = false;
        int[][] var19 = class167.field2657[class250.field3980].field371;
        label372: while (var41 != var17) {
            var15 = class148.field2387[var17];
            var14 = class238.field3866[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg8 == var14 && arg9 == var15) {
                var18 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class167.field2657[class250.field3980].method209(arg2 - 7592, var14, arg8, arg12, var15, arg9, arg4 - 1, arg5)) {
                    var18 = true;
                    break;
                }
                if (arg4 < 10 && class167.field2657[class250.field3980].method213(arg4 - 1, arg5, arg8, arg9, var15, var14, (byte) 64, arg12)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg6 != 0 && class167.field2657[class250.field3980].method204(-1, arg7, arg6, arg10, arg9, arg8, var15, arg5, var14)) {
                var18 = true;
                break;
            }
            int var31 = class45.field814[var14][var15] + 1;
            if (var14 > 0 && class100.field1647[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg5 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if ((arg5 - 1) <= var32) {
                        class238.field3866[var41] = var14 - 1;
                        class148.field2387[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class100.field1647[var14 - 1][var15] = 2;
                        class45.field814[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class100.field1647[var14 + 1][var15] == 0 && (var19[arg5 + var14][var15] & 0x12C0183) == 0 && (var19[arg5 + var14][arg5 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg5 - 1 <= var33) {
                        class238.field3866[var41] = var14 + 1;
                        class148.field2387[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class100.field1647[var14 + 1][var15] = 8;
                        class45.field814[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg5 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class100.field1647[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg5 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg5 - 1) {
                        class238.field3866[var41] = var14;
                        class148.field2387[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class100.field1647[var14][var15 - 1] = 1;
                        class45.field814[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class100.field1647[var14][var15 + 1] == 0 && (var19[var14][arg5 + var15] & 0x12C0138) == 0 && (var19[var14 + arg5 - 1][var15 + arg5] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg5 - 1) {
                        class238.field3866[var41] = var14;
                        class148.field2387[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class100.field1647[var14][var15 + 1] = 4;
                        class45.field814[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg5 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class100.field1647[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg5 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg5 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg5 - 1)) {
                        class238.field3866[var41] = var14 - 1;
                        class148.field2387[var41] = var15 - 1;
                        class100.field1647[var14 - 1][var15 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class45.field814[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 - (1 - var36)] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class100.field1647[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg5 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg5 + var14][arg5 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= (arg5 - 1)) {
                        class238.field3866[var41] = var14 + 1;
                        class148.field2387[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class100.field1647[var14 + 1][var15 - 1] = 9;
                        class45.field814[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[arg5 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class100.field1647[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg5 + var15] & 0x12C0138) == 0 && (var19[var14][arg5 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg5 - 1) {
                        class238.field3866[var41] = var14 - 1;
                        class148.field2387[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class100.field1647[var14 - 1][var15 + 1] = 6;
                        class45.field814[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var38 + var15 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg5 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class100.field1647[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg5 + var15] & 0x12C0138) == 0 && (var19[var14 + arg5][arg5 + var15] & 0x12C01E0) == 0 && (var19[arg5 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg5 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg5 + var15] & 0x12C01F8) != 0 || (var19[arg5 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class238.field3866[var41] = var14 + 1;
                class148.field2387[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class100.field1647[var14 + 1][var15 + 1] = 12;
                class45.field814[var14 + 1][var15 + 1] = var31;
            }
        }
        class84.field1317 = 0;
        if (!var18) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg8 - var22; var23 <= arg8 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class45.field814[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg8 > var23) {
                            var25 = arg8 - var23;
                        } else if (arg8 + arg7 - 1 < var23) {
                            var25 = var23 - arg8 - (arg7 - 1);
                        }
                        int var26 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if ((arg9 - (1 - arg6)) < var24) {
                            var26 = var24 + 1 - arg6 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class45.field814[var23][var24]) {
                            var21 = class45.field814[var23][var24];
                            var15 = var24;
                            var20 = var27;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg0 == var15) {
                return false;
            }
            class84.field1317 = 1;
        }
        byte var28 = 0;
        class238.field3866[var28] = var14;
        int var42 = var28 + 1;
        class148.field2387[var28] = var15;
        int var29;
        int var30 = var29 = class100.field1647[var14][var15];
        while (arg1 != var14 || arg0 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class238.field3866[var42] = var14;
                class148.field2387[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class100.field1647[var14][var15];
        }
        if (var42 > 0) {
            class209.method1445(var42, arg3, true);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
