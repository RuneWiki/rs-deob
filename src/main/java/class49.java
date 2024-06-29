import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class49 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field1048 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    private int field1043 = 128;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field1054 = -1;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Z")
    public boolean field1056 = false;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    private int field1060 = 0;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    private int field1052 = 0;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    private int field1062 = 128;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Lpj;")
    public static class237 field1065 = class33.method353("Clientscript error in: ", 32);

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lfa;")
    public static class239 field1049;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[I")
    public static int[] field1058;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[S")
    private short[] field1045;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[S")
    private short[] field1051;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "[S")
    private short[] field1061;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "[S")
    private short[] field1063;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLie;)V")
    public final void method448(byte arg0, class32 arg1) {
        int var3 = 7 % ((arg0 - 67) / 44);
        field1066++;
        while (true) {
            int var4 = arg1.method316((byte) -14);
            if (var4 == 0) {
                return;
            }
            this.method452(var4, 10, arg1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBIIIZIIII)Z")
    public static final boolean method449(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class119.field2092[var12][var31] = 0;
                class203.field3484[var12][var31] = 99999999;
            }
        }
        class119.field2092[arg5][arg11] = 99;
        field1057++;
        class203.field3484[arg5][arg11] = 0;
        int var13 = arg5;
        byte var14 = 0;
        int var15 = 0;
        class36.field793[var14] = arg5;
        int var16 = arg11;
        int var32 = var14 + 1;
        class94.field1673[var14] = arg11;
        if (arg3 >= -55) {
            method450((byte) -58, 2);
        }
        int[][] var17 = class146.field2613[class274.field4798].field470;
        boolean var18 = false;
        while (var32 != var15) {
            var16 = class94.field1673[var15];
            var13 = class36.field793[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg1 == var13 && arg6 == var16) {
                var18 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class146.field2613[class274.field4798].method226(arg6, (byte) -44, 1, arg2, var13, arg4 - 1, var16, arg1)) {
                    var18 = true;
                    break;
                }
                if (arg4 < 10 && class146.field2613[class274.field4798].method224(var13, arg4 - 1, arg2, (byte) 12, arg1, 1, var16, arg6)) {
                    var18 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg8 != 0 && class146.field2613[class274.field4798].method235(arg8, 1, arg1, var13, arg0, arg6, arg10, 8507, var16)) {
                var18 = true;
                break;
            }
            int var30 = class203.field3484[var13][var16] + 1;
            if (var13 > 0 && class119.field2092[var13 - 1][var16] == 0 && (var17[var13 - 1][var16] & 0x12C0108) == 0) {
                class36.field793[var32] = var13 - 1;
                class94.field1673[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var13 - 1][var16] = 2;
                class203.field3484[var13 - 1][var16] = var30;
            }
            if (var13 < 103 && class119.field2092[var13 + 1][var16] == 0 && (var17[var13 + 1][var16] & 0x12C0180) == 0) {
                class36.field793[var32] = var13 + 1;
                class94.field1673[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var13 + 1][var16] = 8;
                class203.field3484[var13 + 1][var16] = var30;
            }
            if (var16 > 0 && class119.field2092[var13][var16 - 1] == 0 && (var17[var13][var16 - 1] & 0x12C0102) == 0) {
                class36.field793[var32] = var13;
                class94.field1673[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var13][var16 - 1] = 1;
                class203.field3484[var13][var16 - 1] = var30;
            }
            if (var16 < 103 && class119.field2092[var13][var16 + 1] == 0 && (var17[var13][var16 + 1] & 0x12C0120) == 0) {
                class36.field793[var32] = var13;
                class94.field1673[var32] = var16 + 1;
                class119.field2092[var13][var16 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class203.field3484[var13][var16 + 1] = var30;
            }
            if (var13 > 0 && var16 > 0 && class119.field2092[var13 - 1][var16 - 1] == 0 && (var17[var13 - 1][var16 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var16] & 0x12C0108) == 0 && (var17[var13][var16 - 1] & 0x12C0102) == 0) {
                class36.field793[var32] = var13 - 1;
                class94.field1673[var32] = var16 - 1;
                class119.field2092[var13 - 1][var16 - 1] = 3;
                class203.field3484[var13 - 1][var16 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && var16 > 0 && class119.field2092[var13 + 1][var16 - 1] == 0 && (var17[var13 + 1][var16 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var16] & 0x12C0180) == 0 && (var17[var13][var16 - 1] & 0x12C0102) == 0) {
                class36.field793[var32] = var13 + 1;
                class94.field1673[var32] = var16 - 1;
                class119.field2092[var13 + 1][var16 - 1] = 9;
                class203.field3484[var13 + 1][var16 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var16 < 103 && class119.field2092[var13 - 1][var16 + 1] == 0 && (var17[var13 - 1][var16 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var16] & 0x12C0108) == 0 && (var17[var13][var16 + 1] & 0x12C0120) == 0) {
                class36.field793[var32] = var13 - 1;
                class94.field1673[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var13 - 1][var16 + 1] = 6;
                class203.field3484[var13 - 1][var16 + 1] = var30;
            }
            if (var13 < 103 && var16 < 103 && class119.field2092[var13 + 1][var16 + 1] == 0 && (var17[var13 + 1][var16 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var16] & 0x12C0180) == 0 && (var17[var13][var16 + 1] & 0x12C0120) == 0) {
                class36.field793[var32] = var13 + 1;
                class94.field1673[var32] = var16 + 1;
                class119.field2092[var13 + 1][var16 + 1] = 12;
                class203.field3484[var13 + 1][var16 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class94.field1678 = 0;
        if (!var18) {
            if (!arg7) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg1 - var21; var22 <= (arg1 + var21); var22++) {
                for (int var23 = arg6 - var21; var23 <= (arg6 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class203.field3484[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg1 > var22) {
                            var24 = arg1 - var22;
                        } else if (var22 > arg10 + arg1 - 1) {
                            var24 = -arg1 - arg10 - (-1 - var22);
                        }
                        int var25 = 0;
                        if (arg6 > var23) {
                            var25 = arg6 - var23;
                        } else if (var23 > arg6 + arg8 - 1) {
                            var25 = 1 - (arg6 + arg8 - var23);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && class203.field3484[var22][var23] < var20) {
                            var20 = class203.field3484[var22][var23];
                            var13 = var22;
                            var19 = var26;
                            var16 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg11 == var16) {
                return false;
            }
            class94.field1678 = 1;
        }
        byte var27 = 0;
        class36.field793[var27] = var13;
        int var33 = var27 + 1;
        class94.field1673[var27] = var16;
        int var28;
        int var29 = var28 = class119.field2092[var13][var16];
        while (arg5 != var13 || arg11 != var16) {
            if (var28 != var29) {
                var28 = var29;
                class36.field793[var33] = var13;
                class94.field1673[var33++] = var16;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var16++;
            } else if ((var29 & 0x4) != 0) {
                var16--;
            }
            var29 = class119.field2092[var13][var16];
        }
        if (var33 > 0) {
            class104.method778(arg9, 3, var33);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lhk;")
    public static final class122 method450(byte arg0, int arg1) {
        field1047++;
        if (class270.field4620 && arg1 >= class31.field620 && arg1 <= class190.field3308) {
            int var2 = -123 / ((-arg0 - 63) / 50);
            return class81.field1521[arg1 - class31.field620];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
    public static final int method451(int arg0, int arg1) {
        field1044++;
        if (arg0 < 96) {
            field1058 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILie;)V")
    private final void method452(int arg0, int arg1, class32 arg2) {
        field1053++;
        if (arg0 == 1) {
            this.field1055 = arg2.method339(-16777216);
        } else if (arg0 == 2) {
            this.field1054 = arg2.method339(-16777216);
        } else if (arg0 == 4) {
            this.field1043 = arg2.method339(-16777216);
        } else if (arg0 == 5) {
            this.field1062 = arg2.method339(-16777216);
        } else if (arg0 == 6) {
            this.field1048 = arg2.method339(-16777216);
        } else if (arg0 == 7) {
            this.field1052 = arg2.method316((byte) -95);
        } else if (arg0 == 8) {
            this.field1060 = arg2.method316((byte) 114);
        } else if (arg0 == 9) {
            this.field1056 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method316((byte) 107);
            this.field1063 = new short[var4];
            this.field1061 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1063[var5] = (short) arg2.method339(-16777216);
                this.field1061[var5] = (short) arg2.method339(-16777216);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method316((byte) 107);
            this.field1045 = new short[var6];
            this.field1051 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1045[var7] = (short) arg2.method339(-16777216);
                this.field1051[var7] = (short) arg2.method339(class38.method384(arg1, -16777206));
            }
        }
        if (arg1 != 10) {
            this.method453((byte) 52, 22);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(BI)Lqk;")
    public final class201 method453(byte arg0, int arg1) {
        class201 var3 = (class201) class238.field4168.method940((long) this.field1046, 44);
        field1059++;
        if (var3 == null) {
            class157 var4 = class157.method1116(class226.field3874, this.field1055, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1063 != null) {
                for (int var5 = 0; var5 < this.field1063.length; var5++) {
                    var4.method1092(this.field1063[var5], this.field1061[var5]);
                }
            }
            if (this.field1045 != null) {
                for (int var6 = 0; var6 < this.field1045.length; var6++) {
                    var4.method1099(this.field1045[var6], this.field1051[var6]);
                }
            }
            var3 = var4.method1110(this.field1052 + 64, this.field1060 + 850, -30, -50, -30);
            class238.field4168.method937(arg0 - 155, var3, (long) this.field1046);
        }
        if (arg0 != 66) {
            method454(-75);
        }
        class201 var7;
        if (this.field1054 == -1 || arg1 == -1) {
            var7 = var3.method182(true, true);
        } else {
            var7 = class256.method1732(this.field1054, true).method1727(arg1, var3, 10610);
        }
        if (this.field1043 != 128 || this.field1062 != 128) {
            var7.method164(this.field1043, this.field1062, this.field1043);
        }
        if (this.field1048 != 0) {
            if (this.field1048 == 90) {
                var7.method168();
            }
            if (this.field1048 == 180) {
                var7.method173();
            }
            if (this.field1048 == 270) {
                var7.method185();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method454(int arg0) {
        field1058 = null;
        if (arg0 < 68) {
            field1064 = 1;
        }
        field1049 = null;
        field1065 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class36 var7 = new class36();
        var7.field800 = arg1 / 128;
        var7.field791 = arg2 / 128;
        var7.field786 = arg3 / 128;
        var7.field823 = arg4 / 128;
        var7.field780 = arg0;
        var7.field802 = arg1;
        var7.field810 = arg2;
        var7.field801 = arg3;
        var7.field782 = arg4;
        var7.field816 = arg5;
        var7.field822 = arg6;
        class164.field2926[class27.field489++] = var7;
    }
}
