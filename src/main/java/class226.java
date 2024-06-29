import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class226 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public int field3618 = -1;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public int field3619 = -1;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public int field3624 = 0;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
    public boolean field3623 = true;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3627 = new String[100];

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3622 = 1;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field3628 = -1;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "F")
    public static float field3621 = 0.0F;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3630 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILcc;)V")
    public static final void method1558(int arg0, int arg1, int arg2, int arg3, class222 arg4) {
        field3620++;
        if (class52.field824 < 3) {
            ((class51) class297.field4794).method422(arg1, arg3, arg4.field3408, arg4.field3561, class297.field4794.field3273 / 2, class297.field4794.field3265 / 2, (int) class50.field818, 256, arg4.field3452, arg4.field3523);
        } else {
            class66.method522(arg1, arg3, 0, arg4.field3452, arg4.field3523);
        }
        class112.field1729[arg0] = true;
        int var5 = 13 % ((arg2 - 2) / 34);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method1559(boolean arg0) {
        field3627 = null;
        if (arg0) {
            method1561((int[]) null, -58, -101, 122, 115, -117);
        }
        field3630 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1560(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3631++;
        int var7 = 0;
        int var8 = arg3 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        class215.method1482((byte) 40, arg3);
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 < 104) {
            field3621 = 0.5355649F;
        }
        if (arg0 >= class112.field1727 && arg0 <= class278.field4410) {
            int[] var15 = class55.field872[arg0];
            int var16 = class47.method396(class184.field2914, arg5 - arg3, 18, class2.field42);
            int var17 = class47.method396(class184.field2914, arg3 + arg5, -104, class2.field42);
            int var18 = class47.method396(class184.field2914, arg5 - var8, 94, class2.field42);
            int var19 = class47.method396(class184.field2914, arg5 + var8, -127, class2.field42);
            class173.method1240((byte) -57, var18, var15, arg6, var16);
            class173.method1240((byte) -64, var19, var15, arg2, var18);
            class173.method1240((byte) -100, var17, var15, arg6, var19);
        }
        while (var9 > var7) {
            var13 += 2;
            var12 += var13;
            var14 += 2;
            var10 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class204.field3145[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class112.field1727 && class278.field4410 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class47.method396(class184.field2914, arg5 + var7, -105, class2.field42);
                        int var23 = class47.method396(class184.field2914, arg5 - var7, -81, class2.field42);
                        if (class278.field4410 >= var21) {
                            class173.method1240((byte) -126, var22, class55.field872[var21], arg6, var23);
                        }
                        if (class112.field1727 <= var20) {
                            class173.method1240((byte) -58, var22, class55.field872[var20], arg6, var23);
                        }
                    } else {
                        int var24 = class204.field3145[var9];
                        int var25 = class47.method396(class184.field2914, arg5 + var7, 41, class2.field42);
                        int var26 = class47.method396(class184.field2914, arg5 - var7, -91, class2.field42);
                        int var27 = class47.method396(class184.field2914, arg5 + var24, -126, class2.field42);
                        int var28 = class47.method396(class184.field2914, arg5 - var24, -125, class2.field42);
                        if (var21 <= class278.field4410) {
                            int[] var29 = class55.field872[var21];
                            class173.method1240((byte) -48, var28, var29, arg6, var26);
                            class173.method1240((byte) -69, var27, var29, arg2, var28);
                            class173.method1240((byte) -74, var25, var29, arg6, var27);
                        }
                        if (class112.field1727 <= var20) {
                            int[] var30 = class55.field872[var20];
                            class173.method1240((byte) -48, var28, var30, arg6, var26);
                            class173.method1240((byte) -126, var27, var30, arg2, var28);
                            class173.method1240((byte) -117, var25, var30, arg6, var27);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class112.field1727 && var31 <= class278.field4410) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (class184.field2914 <= var33 && class2.field42 >= var34) {
                    int var35 = class47.method396(class184.field2914, var33, -123, class2.field42);
                    int var36 = class47.method396(class184.field2914, var34, 123, class2.field42);
                    if (var8 > var7) {
                        int var37 = var7 <= var11 ? var11 : class204.field3145[var7];
                        int var38 = class47.method396(class184.field2914, arg5 + var37, -109, class2.field42);
                        int var39 = class47.method396(class184.field2914, arg5 - var37, 47, class2.field42);
                        if (var32 <= class278.field4410) {
                            int[] var40 = class55.field872[var32];
                            class173.method1240((byte) -66, var39, var40, arg6, var36);
                            class173.method1240((byte) -58, var38, var40, arg2, var39);
                            class173.method1240((byte) -112, var35, var40, arg6, var38);
                        }
                        if (class112.field1727 <= var31) {
                            int[] var41 = class55.field872[var31];
                            class173.method1240((byte) -91, var39, var41, arg6, var36);
                            class173.method1240((byte) -100, var38, var41, arg2, var39);
                            class173.method1240((byte) -58, var35, var41, arg6, var38);
                        }
                    } else {
                        if (class278.field4410 >= var32) {
                            class173.method1240((byte) -119, var35, class55.field872[var32], arg6, var36);
                        }
                        if (var31 >= class112.field1727) {
                            class173.method1240((byte) -84, var35, class55.field872[var31], arg6, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIIII)V")
    public static final void method1561(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class22 var6 = class149.field2210[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class122 var7 = var6.field368;
        if (var7 != null) {
            int var8 = var7.field1847;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class1 var10 = var6.field373;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field6;
        int var12 = var10.field5;
        int var13 = var10.field14;
        int var14 = var10.field13;
        int[] var15 = class240.field3830[var11];
        int[] var16 = class214.field3282[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)V")
    public static final void method1562(int arg0, long arg1) {
        field3617++;
        if (arg1 == 0L) {
            return;
        }
        if (!(arg0 < ~class181.field2843 || class248.field3935) || class181.field2843 >= 200) {
            class247.method1671(0, class181.field2839, -1, "");
            return;
        }
        String var3 = class292.method1939(arg1, -6);
        for (int var4 = 0; var4 < class181.field2843; var4++) {
            if (class238.field3762[var4] == arg1) {
                class247.method1671(0, var3 + class230.field3646, -1, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class40.field677; var5++) {
            if (class78.field1189[var5] == arg1) {
                class247.method1671(0, class83.field1248 + var3 + class143.field2143, -1, "");
                return;
            }
        }
        if (var3.equals(class263.field4168.field2064)) {
            class247.method1671(0, class215.field3299, -1, "");
            return;
        }
        class64.field1015[class181.field2843] = var3;
        class238.field3762[class181.field2843] = arg1;
        class143.field2139[class181.field2843] = 0;
        class209.field3235++;
        class241.field3873[class181.field2843] = "";
        class157.field2353[class181.field2843] = 0;
        class253.field4049[class181.field2843] = false;
        class181.field2843++;
        class178.field2737 = class216.field3305;
        class240.field3826.method1762(29, true);
        class240.field3826.method313(-6968, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1563(int arg0, boolean arg1, int arg2) {
        field3625++;
        if (!class207.field3185) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            int var3 = arg0 & 0xFFFF;
            int var4 = arg0 >> 16;
            if (class8.field144[var4] == null || class8.field144[var4][var3] == null) {
                return false;
            }
            class222 var5 = class8.field144[var4][var3];
            if (arg2 == -1 && var5.field3552 == 0) {
                for (int var6 = 0; var6 < class14.field174; var6++) {
                    if (class86.field1282[var6] == 38 || class86.field1282[var6] == 1003 || class86.field1282[var6] == 13 || class86.field1282[var6] == 49 || class86.field1282[var6] == 10) {
                        for (class222 var7 = class169.method1217(class240.field3812[var6], 12180); var7 != null; var7 = class112.method834(0, var7)) {
                            if (var5.field3554 == var7.field3554) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < class14.field174; var8++) {
                    if (class49.field803[var8] == arg2 && class240.field3812[var8] == var5.field3554 && (class86.field1282[var8] == 38 || class86.field1282[var8] == 1003 || class86.field1282[var8] == 13 || class86.field1282[var8] == 49 || class86.field1282[var8] == 10)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIILha;)V")
    private final void method1564(byte arg0, int arg1, int arg2, class31 arg3) {
        field3629++;
        if (arg1 == 1) {
            this.field3624 = class77.method604(arg3.method304((byte) 84), 125);
        } else if (arg1 == 2) {
            this.field3618 = arg3.method265(-125);
        } else if (arg1 == 3) {
            this.field3618 = arg3.method260((byte) -67);
            if (this.field3618 == 65535) {
                this.field3618 = -1;
            }
        } else if (arg1 == 5) {
            this.field3623 = false;
        } else if (arg1 == 7) {
            this.field3619 = class77.method604(arg3.method304((byte) 84), 123);
        } else if (arg1 == 8) {
            class189.field2970 = arg2;
        } else if (arg1 == 9) {
            arg3.method260((byte) -67);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg3.method265(-95);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg3.method304((byte) 84);
                } else if (arg1 == 14) {
                    arg3.method265(-101);
                }
            }
        }
        if (arg0 >= -88) {
            this.method1564((byte) 44, 107, 48, (class31) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLha;I)V")
    public final void method1565(byte arg0, class31 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method265(-114);
            if (var4 == 0) {
                int var5 = -117 % ((arg0 + 22) / 63);
                field3632++;
                return;
            }
            this.method1564((byte) -122, var4, arg2, arg1);
        }
    }
}
