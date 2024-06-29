import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class57 extends class130 {

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lqj;")
    public static class196 field762 = class80.method502("mem=", -48);

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field768 = 0;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Lqj;")
    public static class196 field771 = class80.method502("::fps ", -48);

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Lqj;")
    public static class196 field767 = class80.method502("mapflag", -48);

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Lqj;")
    private static class196 field775 = class80.method502("yellow:", -48);

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lqj;")
    public static class196 field765 = field775;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lqj;")
    public static class196 field764 = null;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Lqj;")
    public static class196 field769 = field775;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lh;")
    public static class139 field773;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Lra;")
    public class69 field774;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lnb;")
    public class95 field760;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[B")
    public byte[] field759;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
    public static final int method368(int arg0) {
        field776++;
        int var1 = 104 % (-arg0 / 54);
        return 6;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBIIZII)V")
    public static final void method369(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field772++;
        if (class223.field4001 == arg6 && class192.field3375 == arg2 && (class67.field948 == arg5 || class9.method37(0))) {
            return;
        }
        class67.field948 = arg5;
        class223.field4001 = arg6;
        class192.field3375 = arg2;
        if (class9.method37(0)) {
            class67.field948 = 0;
        }
        if (arg4) {
            class180.method1182((byte) -101, 28);
        } else {
            class180.method1182((byte) -101, 25);
        }
        class104.method636((byte) 34, true, class242.field4300);
        int var7 = class106.field1523;
        class106.field1523 = arg6 * 8 - 48;
        int var8 = class106.field1523 - var7;
        int var9 = class106.field1523;
        int var10 = class178.field3011;
        class178.field3011 = (arg2 - 6) * 8;
        if (arg1 != -66) {
            field768 = -121;
        }
        int var11 = class178.field3011 - var10;
        int var12 = class178.field3011;
        if (arg4) {
            class63.field863 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class164 var14 = class153.field2482[var13];
                if (var14 != null) {
                    var14.field2085 -= var11 * 128;
                    var14.field2081 -= var8 * 128;
                    if (var14.field2081 >= 0 && var14.field2081 <= 13184 && var14.field2085 >= 0 && var14.field2085 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2102[var15] -= var8;
                            var14.field2046[var15] -= var11;
                        }
                        class188.field3295[class63.field863++] = var13;
                    } else {
                        class153.field2482[var13].field2648 = null;
                        class153.field2482[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class164 var32 = class153.field2482[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2102[var33] -= var8;
                        var32.field2046[var33] -= var11;
                    }
                    var32.field2081 -= var8 * 128;
                    var32.field2085 -= var11 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class134 var30 = class247.field4397[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2102[var31] -= var8;
                    var30.field2046[var31] -= var11;
                }
                var30.field2085 -= var11 * 128;
                var30.field2081 -= var8 * 128;
            }
        }
        class27.field335 = arg5;
        class102.field1477.method859(false, (byte) 119, arg0, arg3);
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 0;
        byte var21 = 1;
        if (var8 < 0) {
            var18 = 103;
            var19 = -1;
            var21 = -1;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var11 < 0) {
            var22 = -1;
            var20 = 103;
            var23 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var21) {
            for (int var26 = var20; var26 != var22; var26 += var23) {
                int var27 = var24 + var8;
                int var28 = var26 + var11;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class178.field3040[var29][var24][var26] = class178.field3040[var29][var27][var28];
                    } else {
                        class178.field3040[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class234 var25 = (class234) class144.field2222.method1651((byte) -16); var25 != null; var25 = (class234) class144.field2222.method1656(-55)) {
            var25.field4153 -= var8;
            var25.field4152 -= var11;
            if (var25.field4153 < 0 || var25.field4152 < 0 || var25.field4153 >= 104 || var25.field4152 >= 104) {
                var25.method797((byte) 123);
            }
        }
        if (class12.field133 != 0) {
            class80.field1151 -= var11;
            class12.field133 -= var8;
        }
        if (arg4) {
            class52.field653 -= var11;
            class209.field3766 -= var11;
            class86.field1273 -= var8;
            class210.field3788 -= var8;
        } else {
            class202.field3597 = 1;
        }
        class181.field3208 = -1;
        class219.field3933 = 0;
        class198.field3518.method1653(-119);
        class91.field1328.method1653(arg1 ^ 0x17);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static final void method370(byte arg0) {
        field766++;
        int var1 = class229.field4077.method1170(8, (byte) -69);
        if (class252.field4451 > var1) {
            for (int var2 = var1; var2 < class252.field4451; var2++) {
                class232.field4128[class96.field1413++] = class14.field153[var2];
            }
        }
        if (var1 > class252.field4451) {
            throw new RuntimeException("gppov1");
        }
        class252.field4451 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var5 = class14.field153[var3];
            class134 var6 = class247.field4397[var5];
            int var7 = class229.field4077.method1170(1, (byte) 97);
            if (var7 == 0) {
                class14.field153[class252.field4451++] = var5;
                var6.field2055 = class171.field2879;
            } else {
                int var8 = class229.field4077.method1170(2, (byte) 96);
                if (var8 == 0) {
                    class14.field153[class252.field4451++] = var5;
                    var6.field2055 = class171.field2879;
                    class104.field1507[class148.field2336++] = var5;
                } else if (var8 == 1) {
                    class14.field153[class252.field4451++] = var5;
                    var6.field2055 = class171.field2879;
                    int var9 = class229.field4077.method1170(3, (byte) -44);
                    var6.method852(var9, false, 9);
                    int var10 = class229.field4077.method1170(1, (byte) -97);
                    if (var10 == 1) {
                        class104.field1507[class148.field2336++] = var5;
                    }
                } else if (var8 == 2) {
                    class14.field153[class252.field4451++] = var5;
                    var6.field2055 = class171.field2879;
                    int var11 = class229.field4077.method1170(3, (byte) -84);
                    var6.method852(var11, true, 9);
                    int var12 = class229.field4077.method1170(3, (byte) -91);
                    var6.method852(var12, true, 9);
                    int var13 = class229.field4077.method1170(1, (byte) 120);
                    if (var13 == 1) {
                        class104.field1507[class148.field2336++] = var5;
                    }
                } else if (var8 == 3) {
                    class232.field4128[class96.field1413++] = var5;
                }
            }
        }
        int var4 = 88 % ((-arg0 - 5) / 54);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIIIIIIIBIIII)Z")
    public static final boolean method371(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field763++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class30.field380[var13][var40] = 0;
                class109.field1555[var13][var40] = 99999999;
            }
        }
        class30.field380[arg9][arg6] = 99;
        int var14 = arg9;
        class109.field1555[arg9][arg6] = 0;
        byte var15 = 0;
        int var16 = 0;
        int var17 = arg6;
        class30.field375[var15] = arg9;
        if (arg8 >= -125) {
            return true;
        }
        int var41 = var15 + 1;
        class172.field2892[var15] = arg6;
        int[][] var18 = class188.field3298[class27.field335].field2462;
        boolean var19 = false;
        label372: while (var41 != var16) {
            var14 = class30.field375[var16];
            var17 = class172.field2892[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg7 == var14 && arg1 == var17) {
                var19 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class188.field3298[class27.field335].method969(arg2 - 1, arg7, (byte) -108, var17, var14, arg5, arg1, arg12)) {
                    var19 = true;
                    break;
                }
                if (arg2 < 10 && class188.field3298[class27.field335].method971(var17, -77, arg1, arg2 - 1, var14, arg5, arg7, arg12)) {
                    var19 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg11 != 0 && class188.field3298[class27.field335].method961(arg4, arg3, arg7, var17, arg11, var14, -1, arg1, arg12)) {
                var19 = true;
                break;
            }
            int var31 = class109.field1555[var14][var17] + 1;
            if (var14 > 0 && class30.field380[var14 - 1][var17] == 0 && (var18[var14 - 1][var17] & 0x12C010E) == 0 && (var18[var14 - 1][arg12 + var17 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg12 - 1) {
                        class30.field375[var41] = var14 - 1;
                        class172.field2892[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class30.field380[var14 - 1][var17] = 2;
                        class109.field1555[var14 - 1][var17] = var31;
                        break;
                    }
                    if ((var18[var14 - 1][var17 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class30.field380[var14 + 1][var17] == 0 && (var18[var14 + arg12][var17] & 0x12C0183) == 0 && (var18[var14 + arg12][arg12 + var17 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg12 - 1) {
                        class30.field375[var41] = var14 + 1;
                        class172.field2892[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class30.field380[var14 + 1][var17] = 8;
                        class109.field1555[var14 + 1][var17] = var31;
                        break;
                    }
                    if ((var18[arg12 + var14][var17 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var17 > 0 && class30.field380[var14][var17 - 1] == 0 && (var18[var14][var17 - 1] & 0x12C010E) == 0 && (var18[arg12 + var14 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg12 - 1 <= var34) {
                        class30.field375[var41] = var14;
                        class172.field2892[var41] = var17 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class30.field380[var14][var17 - 1] = 1;
                        class109.field1555[var14][var17 - 1] = var31;
                        break;
                    }
                    if ((var18[var14 + var34][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var17 < 102 && class30.field380[var14][var17 + 1] == 0 && (var18[var14][arg12 + var17] & 0x12C0138) == 0 && (var18[var14 + arg12 - 1][arg12 + var17] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg12 - 1) {
                        class30.field375[var41] = var14;
                        class172.field2892[var41] = var17 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class30.field380[var14][var17 + 1] = 4;
                        class109.field1555[var14][var17 + 1] = var31;
                        break;
                    }
                    if ((var18[var14 + var35][arg12 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var17 > 0 && class30.field380[var14 - 1][var17 - 1] == 0 && (var18[var14 - 1][arg12 + var17 - 1 - 1] & 0x12C0138) == 0 && (var18[var14 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[arg12 + var14 - 1 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (arg12 - 1 <= var36) {
                        class30.field375[var41] = var14 - 1;
                        class172.field2892[var41] = var17 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class30.field380[var14 - 1][var17 - 1] = 3;
                        class109.field1555[var14 - 1][var17 - 1] = var31;
                        break;
                    }
                    if ((var18[var14 - 1][var17 + var36 - 1] & 0x12C013E) != 0 || (var18[var14 + var36 - 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var17 > 0 && class30.field380[var14 + 1][var17 - 1] == 0 && (var18[var14 + 1][var17 - 1] & 0x12C010E) == 0 && (var18[var14 + arg12][var17 - 1] & 0x12C0183) == 0 && (var18[arg12 + var14][arg12 + var17 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg12 - 1 <= var37) {
                        class30.field375[var41] = var14 + 1;
                        class172.field2892[var41] = var17 - 1;
                        class30.field380[var14 + 1][var17 - 1] = 9;
                        class109.field1555[var14 + 1][var17 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[arg12 + var14][var17 + var37 - 1] & 0x12C01E3) != 0 || (var18[var37 + var14 + 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var17 < 102 && class30.field380[var14 - 1][var17 + 1] == 0 && (var18[var14 - 1][var17 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][arg12 + var17] & 0x12C0138) == 0 && (var18[var14][arg12 + var17] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg12 - 1) {
                        class30.field375[var41] = var14 - 1;
                        class172.field2892[var41] = var17 + 1;
                        class30.field380[var14 - 1][var17 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class109.field1555[var14 - 1][var17 + 1] = var31;
                        break;
                    }
                    if ((var18[var14 - 1][var17 + var38 + 1] & 0x12C013E) != 0 || (var18[var14 + var38 - 1][arg12 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var17 < 102 && class30.field380[var14 + 1][var17 + 1] == 0 && (var18[var14 + 1][arg12 + var17] & 0x12C0138) == 0 && (var18[arg12 + var14][arg12 + var17] & 0x12C01E0) == 0 && (var18[arg12 + var14][var17 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg12 - 1; var39++) {
                    if ((var18[var14 + var39 + 1][arg12 + var17] & 0x12C01F8) != 0 || (var18[arg12 + var14][var17 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class30.field375[var41] = var14 + 1;
                class172.field2892[var41] = var17 + 1;
                class30.field380[var14 + 1][var17 + 1] = 12;
                class109.field1555[var14 + 1][var17 + 1] = var31;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class195.field3427 = 0;
        if (!var19) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg7 - var22; var23 <= arg7 + var22; var23++) {
                for (int var24 = arg1 - var22; var24 <= arg1 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class109.field1555[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg7) {
                            var25 = arg7 - var23;
                        } else if (var23 > arg4 + arg7 - 1) {
                            var25 = var23 + 1 - arg4 - arg7;
                        }
                        int var26 = 0;
                        if (var24 < arg1) {
                            var26 = arg1 - var24;
                        } else if (var24 > arg1 + arg11 - 1) {
                            var26 = var24 + 1 - arg1 - arg11;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class109.field1555[var23][var24] < var21) {
                            var17 = var24;
                            var14 = var23;
                            var20 = var27;
                            var21 = class109.field1555[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg9 == var14 && arg6 == var17) {
                return false;
            }
            class195.field3427 = 1;
        }
        byte var28 = 0;
        class30.field375[var28] = var14;
        int var42 = var28 + 1;
        class172.field2892[var28] = var17;
        int var29;
        int var30 = var29 = class30.field380[var14][var17];
        while (arg9 != var14 || arg6 != var17) {
            if (var29 != var30) {
                var29 = var30;
                class30.field375[var42] = var14;
                class172.field2892[var42++] = var17;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var17++;
            } else if ((var30 & 0x4) != 0) {
                var17--;
            }
            var30 = class30.field380[var14][var17];
        }
        if (var42 > 0) {
            class33.method175(var42, -26, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method372(int arg0) {
        field762 = null;
        field775 = null;
        field771 = null;
        field767 = null;
        field764 = null;
        if (arg0 != -103) {
            method370((byte) -125);
        }
        field773 = null;
        field769 = null;
        field765 = null;
    }
}
