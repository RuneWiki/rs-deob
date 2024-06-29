import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class162 extends class213 {

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field3135 = -1;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lvc;")
    public static class212 field3140 = new class212(64);

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lob;")
    private static class141 field3146 = class175.method1195(40, "Free world");

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lob;")
    public static class141 field3147 = field3146;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "Z")
    public static boolean field3148 = true;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Lpe;")
    public static class154 field3134;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lqe;")
    public class164 field3133;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lca;")
    public class22 field3142;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Lfa;")
    public static class52 field3150;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "[B")
    public byte[] field3136;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        field3150 = null;
        if (arg0 != 42) {
            field3134 = null;
        }
        field3146 = null;
        field3140 = null;
        field3147 = null;
        field3134 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIBZIIIIII)Z")
    public static final boolean method1130(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class161.field3125[var12][var37] = 0;
                class37.field743[var12][var37] = 99999999;
            }
        }
        field3139++;
        class161.field3125[arg6][arg10] = 99;
        int var13 = arg6;
        int var14 = arg10;
        byte var15 = 0;
        class37.field743[arg6][arg10] = 0;
        class7.field106[var15] = arg6;
        boolean var16 = false;
        int var38 = var15 + 1;
        class118.field2300[var15] = arg10;
        int var17 = 0;
        int var18 = class7.field106.length;
        int[][] var19 = class47.field888[class66.field1287].field1592;
        while (var38 != var17) {
            var14 = class118.field2300[var17];
            var13 = class7.field106[var17];
            var17 = (var17 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var16 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class47.field888[class66.field1287].method560(arg2, var14, arg9 - 1, var13, arg8, arg3, true)) {
                    var16 = true;
                    break;
                }
                if (arg9 < 10 && class47.field888[class66.field1287].method551(var13, arg8, var14, 16816, arg2, arg9 - 1, arg3)) {
                    var16 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg1 != 0 && class47.field888[class66.field1287].method552(-1, arg11, var13, arg2, arg3, var14, arg7, arg1)) {
                var16 = true;
                break;
            }
            int var36 = class37.field743[var13][var14] + 1;
            if (var13 > 0 && class161.field3125[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class7.field106[var38] = var13 - 1;
                class118.field2300[var38] = var14;
                var38 = (var38 + 1) % var18;
                class161.field3125[var13 - 1][var14] = 2;
                class37.field743[var13 - 1][var14] = var36;
            }
            if (var13 < 103 && class161.field3125[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class7.field106[var38] = var13 + 1;
                class118.field2300[var38] = var14;
                var38 = (var38 + 1) % var18;
                class161.field3125[var13 + 1][var14] = 8;
                class37.field743[var13 + 1][var14] = var36;
            }
            if (var14 > 0 && class161.field3125[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class7.field106[var38] = var13;
                class118.field2300[var38] = var14 - 1;
                var38 = (var38 + 1) % var18;
                class161.field3125[var13][var14 - 1] = 1;
                class37.field743[var13][var14 - 1] = var36;
            }
            if (var14 < 103 && class161.field3125[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class7.field106[var38] = var13;
                class118.field2300[var38] = var14 + 1;
                var38 = (var38 + 1) % var18;
                class161.field3125[var13][var14 + 1] = 4;
                class37.field743[var13][var14 + 1] = var36;
            }
            if (var13 > 0 && var14 > 0 && class161.field3125[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class7.field106[var38] = var13 - 1;
                class118.field2300[var38] = var14 - 1;
                class161.field3125[var13 - 1][var14 - 1] = 3;
                var38 = (var38 + 1) % var18;
                class37.field743[var13 - 1][var14 - 1] = var36;
            }
            if (var13 < 103 && var14 > 0 && class161.field3125[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class7.field106[var38] = var13 + 1;
                class118.field2300[var38] = var14 - 1;
                class161.field3125[var13 + 1][var14 - 1] = 9;
                var38 = (var38 + 1) % var18;
                class37.field743[var13 + 1][var14 - 1] = var36;
            }
            if (var13 > 0 && var14 < 103 && class161.field3125[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class7.field106[var38] = var13 - 1;
                class118.field2300[var38] = var14 + 1;
                class161.field3125[var13 - 1][var14 + 1] = 6;
                var38 = (var38 + 1) % var18;
                class37.field743[var13 - 1][var14 + 1] = var36;
            }
            if (var13 < 103 && var14 < 103 && class161.field3125[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class7.field106[var38] = var13 + 1;
                class118.field2300[var38] = var14 + 1;
                class161.field3125[var13 + 1][var14 + 1] = 12;
                class37.field743[var13 + 1][var14 + 1] = var36;
                var38 = (var38 + 1) % var18;
            }
        }
        class15.field283 = 0;
        int var20 = 48 % ((-arg4 - 52) / 54);
        if (!var16) {
            if (!arg5) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg2 - var22; var24 <= arg2 + var22; var24++) {
                for (int var25 = arg3 - var22; var25 <= arg3 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class37.field743[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > arg2 + arg11 - 1) {
                            var26 = var24 + 1 - arg2 - arg11;
                        }
                        int var27 = 0;
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > arg1 + arg3 - 1) {
                            var27 = var25 + 1 - arg1 - arg3;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class37.field743[var24][var25] < var23) {
                            var13 = var24;
                            var23 = class37.field743[var24][var25];
                            var21 = var28;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg10 == var14) {
                return false;
            }
            class15.field283 = 1;
        }
        byte var29 = 0;
        class7.field106[var29] = var13;
        int var39 = var29 + 1;
        class118.field2300[var29] = var14;
        int var30;
        int var31 = var30 = class161.field3125[var13][var14];
        while (arg6 != var13 || arg10 != var14) {
            if (var30 != var31) {
                class7.field106[var39] = var13;
                class118.field2300[var39++] = var14;
                var30 = var31;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class161.field3125[var13][var14];
        }
        if (var39 > 0) {
            int var32 = var39--;
            int var33 = class118.field2300[var39];
            if (var32 > 25) {
                var32 = 25;
            }
            int var34 = class7.field106[var39];
            if (arg0 == 0) {
                class7.field120.method32(110, 12885);
                class78.field1575++;
                class7.field120.method997(94, var32 + var32 + 3);
            }
            if (arg0 == 1) {
                class7.field120.method32(13, 12885);
                class7.field120.method997(82, var32 + var32 + 3 + 14);
                class169.field3255++;
            }
            if (arg0 == 2) {
                class7.field120.method32(25, 12885);
                class210.field3993++;
                class7.field120.method997(105, var32 + var32 + 3);
            }
            class224.field4233 = class7.field106[0];
            class221.field4194 = class118.field2300[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class7.field120.method989(36, class7.field106[var39] - var34);
                class7.field120.method976(class118.field2300[var39] - var33, -1543);
            }
            class7.field120.method966((byte) -72, class60.field1177[82] ? 1 : 0);
            class7.field120.method972(26894, class83.field1644 + var33);
            class7.field120.method994(-122, class83.field1649 + var34);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
    public static final void method1131(int arg0, int arg1) {
        field3137++;
        if (arg1 == -3) {
            class21.method127(class209.field3969, class224.field4221, class22.field391, (byte) -70);
        } else if (arg1 == -2) {
            class21.method127(class209.field3933, class209.field3963, class91.field1834, (byte) -70);
        } else if (arg1 == -1) {
            class21.method127(class209.field3972, class164.field3175, class22.field384, (byte) -70);
        } else if (arg1 == 3) {
            class21.method127(class209.field3934, class209.field3978, class68.field1324, (byte) -70);
        } else if (arg1 == 4) {
            class21.method127(class209.field3961, class63.field1239, class180.field3543, (byte) -70);
        } else if (arg1 == 5) {
            class21.method127(class209.field3968, class3.field38, class91.field1825, (byte) -70);
        } else if (arg1 == 6) {
            class21.method127(class209.field3977, class163.field3155, class125.field2411, (byte) -70);
        } else if (arg1 == 7) {
            class21.method127(class209.field3960, class68.field1326, class114.field2190, (byte) -70);
        } else if (arg1 == 8) {
            class21.method127(class209.field3935, class83.field1641, class12.field239, (byte) -70);
        } else if (arg1 == 9) {
            class21.method127(class209.field3937, class174.field3450, class105.field2023, (byte) -70);
        } else if (arg1 == 10) {
            class21.method127(class209.field3982, class83.field1661, class206.field3921, (byte) -70);
        } else if (arg1 == 11) {
            class21.method127(class209.field3973, class138.field2652, class97.field1917, (byte) -70);
        } else if (arg1 == 12) {
            class21.method127(class209.field3946, class106.field2041, class49.field925, (byte) -70);
        } else if (arg1 == 13) {
            class21.method127(class209.field3974, class175.field3471, class22.field400, (byte) -70);
        } else if (arg1 == 14) {
            class21.method127(class209.field3948, class144.field2793, class35.field704, (byte) -70);
        } else if (arg1 == 16) {
            class21.method127(class209.field3971, class204.field3904, class94.field1874, (byte) -70);
        } else if (arg1 == 17) {
            class21.method127(class209.field3955, class72.field1441, class203.field3836, (byte) -70);
        } else if (arg1 == 18) {
            class21.method127(class209.field3945, class84.field1682, class216.field4121, (byte) -70);
        } else if (arg1 == 19) {
            class21.method127(class114.field2178, class160.field3116, class204.field3899, (byte) -70);
        } else if (arg1 == 20) {
            class21.method127(class209.field3939, class84.field1675, class22.field364, (byte) -70);
        } else if (arg1 == 22) {
            class21.method127(class209.field3941, class136.field2595, class36.field718, (byte) -70);
        } else if (arg1 == 23) {
            class21.method127(class209.field3950, class154.field2998, class35.field700, (byte) -70);
        } else if (arg1 == 24) {
            class21.method127(class209.field3962, class79.field1608, class59.field1157, (byte) -70);
        } else if (arg1 == 25) {
            class21.method127(class209.field3951, class98.field1938, class22.field375, (byte) -70);
        } else if (arg1 == 26) {
            class21.method127(class209.field3940, class204.field3912, class6.field88, (byte) -70);
        } else if (arg1 == 27) {
            class21.method127(class209.field3970, class209.field3943, class142.field2755, (byte) -70);
        } else {
            class21.method127(class209.field3947, class3.field34, class22.field383, (byte) -70);
        }
        if (arg0 == 1) {
            class156.method1086(10, (byte) -95);
        }
    }
}
