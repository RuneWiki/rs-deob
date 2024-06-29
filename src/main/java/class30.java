import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 extends class226 {

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field628 = -1;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field635 = 1;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Ljd;")
    public static class86 field633 = class122.method868("::fpson", true);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Ljd;")
    public static class86 field630 = class122.method868("rect_debug=", true);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "Ljd;")
    public static class86 field645 = class122.method868("null", true);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "Ljd;")
    public static class86 field646 = class122.method868("Lade Benutzeroberfl-=che )2 ", true);

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lgb;")
    public class144 field634;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "[B")
    public byte[] field636;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method193(byte arg0) {
        field630 = null;
        field633 = null;
        int var1 = 51 % ((-62 - arg0) / 43);
        field645 = null;
        field646 = null;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public static final void method194(int arg0) {
        class21.field545 = 0;
        class204.field3690 = 2;
        class155.field2938 = 0;
        class257.field4560 = null;
        class161.field3024 = 0;
        if (arg0 != 1) {
            method197(42, -33, (Random) null);
        }
        ++field644;
        class176.field3203 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[[[Lsa;ZIII)Z")
    public static final boolean method195(int arg0, class249[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 1) {
            method196(102, -108);
        }
        ++field629;
        byte var6 = !arg2 ? (byte) (255 & class119.field2338) : 1;
        if (class12.field393[class180.field3244][arg3][arg0] == var6) {
            return false;
        } else if ((4 & class86.field1693[class180.field3244][arg3][arg0]) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class111.field2124[var7] = arg3;
            int var8 = 0;
            int var31 = var7 + 1;
            class164.field3068[var7] = arg0;
            class12.field393[class180.field3244][arg3][arg0] = var6;
            while (var31 != var8) {
                int var9 = 65535 & class111.field2124[var8];
                int var10 = (16772600 & class111.field2124[var8]) >> 16;
                int var11 = 255 & class111.field2124[var8] >> 24;
                int var12 = 65535 & class164.field3068[var8];
                int var13 = class164.field3068[var8] >> 16 & 255;
                boolean var14 = false;
                if ((4 & class86.field1693[class180.field3244][var9][var12]) == 0) {
                    var14 = true;
                }
                var8 = var8 - -1 & 4095;
                boolean var15 = false;
                label229: for (int var16 = class180.field3244 + 1; var16 <= 3; ++var16) {
                    if (~(class86.field1693[var16][var9][var12] & 8) == -1) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field4435 != null) {
                                int var19 = class91.method678(true, var10);
                                if (~arg1[var16][var9][var12].field4435.field3981 == ~var19 || arg1[var16][var9][var12].field4435.field3970 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class91.method678(true, var11);
                                    if (~arg1[var16][var9][var12].field4435.field3981 == ~var20 || ~arg1[var16][var9][var12].field4435.field3970 == ~var20) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var21 = class91.method678(true, var13);
                                    if (~arg1[var16][var9][var12].field4435.field3981 == ~var21 || ~arg1[var16][var9][var12].field4435.field3970 == ~var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var12].field4429 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var9][var12].field4445; ++var22) {
                                    int var23 = (int) (63L & arg1[var16][var9][var12].field4429[var22].field4122 >> 14);
                                    int var24 = (int) (3L & arg1[var16][var9][var12].field4429[var22].field4122 >> 20);
                                    if (~var23 == -22) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (~var10 == ~var25 || var11 != 0 && ~var11 == ~var25 || var13 != 0 && ~var13 == ~var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class249 var26 = arg1[var16][var9][var12];
                        if (var26 != null && ~var26.field4445 < -1) {
                            for (int var27 = 0; var26.field4445 > var27; ++var27) {
                                class228 var28 = var26.field4429[var27];
                                if (var28.field4137 != var28.field4135 || var28.field4128 != var28.field4127) {
                                    for (int var29 = var28.field4137; ~var28.field4135 <= ~var29; ++var29) {
                                        for (int var30 = var28.field4127; ~var28.field4128 <= ~var30; ++var30) {
                                            class12.field393[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class12.field393[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    if (class66.field1315[arg4] < class35.field796[class180.field3244 - -1][var9][var12]) {
                        class66.field1315[arg4] = class35.field796[class180.field3244 - -1][var9][var12];
                    }
                    int var17 = var9 << 7;
                    if (var17 < class42.field951[arg4]) {
                        class42.field951[arg4] = var17;
                    } else if (~class234.field4239[arg4] > ~var17) {
                        class234.field4239[arg4] = var17;
                    }
                    int var18 = var12 << 7;
                    if (~var18 <= ~class273.field4799[arg4]) {
                        if (~class271.field4757[arg4] > ~var18) {
                            class271.field4757[arg4] = var18;
                        }
                    } else {
                        class273.field4799[arg4] = var18;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && class12.field393[class180.field3244][var9 - 1][var12] != var6) {
                        class111.field2124[var31] = class49.method377(-754974720, class49.method377(var9 - 1, 1179648));
                        class164.field3068[var31] = class49.method377(var12, 1245184);
                        var31 = var31 - -1 & 4095;
                        class12.field393[class180.field3244][var9 - 1][var12] = var6;
                    }
                    ++var12;
                    if (~var12 > -105) {
                        if (var9 + -1 >= 0 && class12.field393[class180.field3244][var9 + -1][var12] != var6 && ~(4 & class86.field1693[class180.field3244][var9][var12]) == -1 && ~(4 & class86.field1693[class180.field3244][var9 - 1][var12 + -1]) == -1) {
                            class111.field2124[var31] = class49.method377(class49.method377(var9 + -1, 1179648), 1375731712);
                            class164.field3068[var31] = class49.method377(1245184, var12);
                            class12.field393[class180.field3244][var9 + -1][var12] = var6;
                            var31 = 4095 & var31 - -1;
                        }
                        if (~class12.field393[class180.field3244][var9][var12] != ~var6) {
                            class111.field2124[var31] = class49.method377(318767104, class49.method377(5373952, var9));
                            class164.field3068[var31] = class49.method377(var12, 5439488);
                            var31 = 4095 & var31 + 1;
                            class12.field393[class180.field3244][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class12.field393[class180.field3244][var9 - -1][var12] != var6 && ~(4 & class86.field1693[class180.field3244][var9][var12]) == -1 && (4 & class86.field1693[class180.field3244][var9 - -1][var12 + -1]) == 0) {
                            class111.field2124[var31] = class49.method377(class49.method377(5373952, var9 - -1), -1845493760);
                            class164.field3068[var31] = class49.method377(var12, 5439488);
                            class12.field393[class180.field3244][var9 + 1][var12] = var6;
                            var31 = 4095 & var31 + 1;
                        }
                    }
                    --var12;
                    if (~(var9 + 1) > -105 && class12.field393[class180.field3244][var9 - -1][var12] != var6) {
                        class111.field2124[var31] = class49.method377(1392508928, class49.method377(var9 + 1, 9568256));
                        class164.field3068[var31] = class49.method377(9633792, var12);
                        var31 = 4095 & var31 + 1;
                        class12.field393[class180.field3244][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (var9 + -1 >= 0 && ~class12.field393[class180.field3244][var9 + -1][var12] != ~var6 && (4 & class86.field1693[class180.field3244][var9][var12]) == 0 && ~(4 & class86.field1693[class180.field3244][var9 - 1][var12 + 1]) == -1) {
                            class111.field2124[var31] = class49.method377(301989888, class49.method377(13762560, var9 + -1));
                            class164.field3068[var31] = class49.method377(13828096, var12);
                            class12.field393[class180.field3244][var9 + -1][var12] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                        if (class12.field393[class180.field3244][var9][var12] != var6) {
                            class111.field2124[var31] = class49.method377(class49.method377(13762560, var9), -1828716544);
                            class164.field3068[var31] = class49.method377(13828096, var12);
                            class12.field393[class180.field3244][var9][var12] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                        if (~(var9 + 1) > -105 && class12.field393[class180.field3244][var9 + 1][var12] != var6 && ~(class86.field1693[class180.field3244][var9][var12] & 4) == -1 && ~(4 & class86.field1693[class180.field3244][var9 + 1][var12 - -1]) == -1) {
                            class111.field2124[var31] = class49.method377(-771751936, class49.method377(9568256, var9 - -1));
                            class164.field3068[var31] = class49.method377(9633792, var12);
                            class12.field393[class180.field3244][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                    }
                }
            }
            if (~class66.field1315[arg4] != 999999) {
                class66.field1315[arg4] += 10;
                class42.field951[arg4] -= 50;
                class234.field4239[arg4] += 50;
                class271.field4757[arg4] += 50;
                class273.field4799[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public static final void method196(int arg0, int arg1) {
        class227 var2 = class75.field1502;
        synchronized (class75.field1502) {
            if (arg1 <= 107) {
                field635 = -68;
            }
            class147.field2767 = arg0;
        }
        ++field638;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method197(int arg0, int arg1, Random arg2) {
        ++field641;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class137.method982(arg1, 2)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 4294967295L) >> 32);
        } else {
            if (arg0 < 21) {
                method195(53, (class249[][][]) null, true, -105, -77, -67);
            }
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (~var4 <= ~var3);
            return class4.method19((byte) 57, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)I")
    public static final int method198(int arg0, int arg1, int arg2, int arg3) {
        ++field640;
        if (class35.field796 == null) {
            return 0;
        } else {
            int var4 = arg1 >> 7;
            int var5 = arg2 >> 7;
            if (~var4 <= -1 && var5 >= 0 && ~var4 >= -104 && var5 <= 103) {
                int var6 = 127 & arg1;
                int var7 = arg3;
                if (arg3 < 3 && ~(2 & class86.field1693[1][var4][var5]) == -3) {
                    var7 = arg3 + 1;
                }
                int var8 = arg2 & 127;
                int var9 = (128 - var6) * class35.field796[var7][var4][var5 - -1] + class35.field796[var7][var4 + 1][var5 + 1] * var6 >> 7;
                int var10 = (-var6 + 128) * class35.field796[var7][var4][var5] + class35.field796[var7][var4 - -1][var5] * var6 >> 7;
                if (arg0 != 31482) {
                    method196(-115, 88);
                }
                return (-var8 + 128) * var10 + var8 * var9 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)[B")
    public final byte[] method199(byte arg0) {
        if (arg0 != 36) {
            this.field634 = null;
        }
        ++field639;
        if (super.field4099) {
            throw new RuntimeException();
        } else {
            return this.field636;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public static final int method200(int arg0, int arg1, int arg2) {
        ++field637;
        if (arg0 != -1) {
            return 24;
        } else {
            if (arg1 < arg2) {
                int var3 = arg1;
                arg1 = arg2;
                arg2 = var3;
            }
            while (~arg2 != -1) {
                int var4 = arg1 % arg2;
                arg1 = arg2;
                arg2 = var4;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIILeh;IZJ)Z")
    public static final boolean method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class80 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class35.field796 == class219.field3930;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class70.field1424 || var24 >= class126.field2436) {
                    return false;
                }
                class249 var25 = class248.field4406[arg0][var15][var24];
                if (var25 != null && var25.field4445 >= 5) {
                    return false;
                }
            }
        }
        class228 var16 = new class228();
        var16.field4122 = arg11;
        var16.field4141 = arg0;
        var16.field4129 = arg5;
        var16.field4123 = arg6;
        var16.field4131 = arg7;
        var16.field4134 = arg8;
        var16.field4125 = arg9;
        var16.field4137 = arg1;
        var16.field4127 = arg2;
        var16.field4135 = arg1 + arg3 - 1;
        var16.field4128 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class248.field4406[var22][var17][var20] == null) {
                        class248.field4406[var22][var17][var20] = new class249(var22, var17, var20);
                    }
                }
                class249 var23 = class248.field4406[arg0][var17][var20];
                var23.field4429[var23.field4445] = var16;
                var23.field4434[var23.field4445] = var21;
                var23.field4425 |= var21;
                ++var23.field4445;
                if (var13 && class247.field4394[var17][var20] != 0) {
                    var14 = class247.field4394[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class247.field4394[var18][var19] == 0) {
                        class247.field4394[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class158.field2971[class265.field4677++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)I")
    public final int method202(byte arg0) {
        ++field642;
        if (super.field4099) {
            return 0;
        } else {
            int var2 = 27 % ((arg0 - 1) / 43);
            return 100;
        }
    }
}
