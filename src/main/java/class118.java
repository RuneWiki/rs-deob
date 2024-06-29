import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class118 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    public int[] field1700;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[Lva;")
    public class138[] field1711;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1702 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    public static int[] field1701 = new int[25];

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
    public static boolean field1707 = true;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Lvl;")
    public static class73 field1708;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lll;")
    public static final class147 method775(int arg0, int arg1) {
        field1709++;
        class147 var2 = (class147) class50.field636.method1517((long) arg1, (byte) 93);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field2154.method501(arg0 ^ 0xFFFF8E28, arg1, 16);
        class147 var4 = new class147();
        if (var3 != null) {
            var4.method1001((byte) 3, new class170(var3));
        }
        if (arg0 == 29142) {
            class50.field636.method1518(var4, (long) arg1, (byte) 75);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method776(int arg0) {
        field1702 = null;
        if (arg0 < 56) {
            method775(6, -111);
        }
        field1701 = null;
        field1708 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)V")
    public static final void method777(int arg0, int arg1) {
        class68.field1011.method1514(arg0, (byte) -55);
        int var2 = -62 / ((74 - arg1) / 32);
        class206.field3233.method1514(arg0, (byte) -55);
        field1703++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIBII)V")
    public static final void method778(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1699++;
        class111.method739((byte) -11, arg3);
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg4 != -122) {
            return;
        }
        if (arg0 >= class115.field1678 && class60.field882 >= arg0) {
            int[] var14 = class78.field1180[arg0];
            int var15 = class196.method1369(class187.field2938, arg6 - arg3, true, class56.field816);
            int var16 = class196.method1369(class187.field2938, arg3 + arg6, true, class56.field816);
            int var17 = class196.method1369(class187.field2938, arg6 - var8, true, class56.field816);
            int var18 = class196.method1369(class187.field2938, arg6 + var8, true, class56.field816);
            class16.method97(-7, var14, var17, arg1, var15);
            class16.method97(-7, var14, var18, arg2, var17);
            class16.method97(-7, var14, var16, arg1, var18);
        }
        int var19 = -1;
        while (var9 > var7) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class182.field2861[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                int var20 = arg0 - var9;
                var10 -= var9 << 1;
                int var21 = arg0 + var9;
                if (var21 >= class115.field1678 && var20 <= class60.field882) {
                    if (var9 >= var8) {
                        int var22 = class196.method1369(class187.field2938, arg6 + var7, true, class56.field816);
                        int var23 = class196.method1369(class187.field2938, arg6 - var7, true, class56.field816);
                        if (class60.field882 >= var21) {
                            class16.method97(-7, class78.field1180[var21], var22, arg1, var23);
                        }
                        if (var20 >= class115.field1678) {
                            class16.method97(arg4 ^ 0x7F, class78.field1180[var20], var22, arg1, var23);
                        }
                    } else {
                        int var24 = class182.field2861[var9];
                        int var25 = class196.method1369(class187.field2938, arg6 + var7, true, class56.field816);
                        int var26 = class196.method1369(class187.field2938, arg6 - var7, true, class56.field816);
                        int var27 = class196.method1369(class187.field2938, arg6 + var24, true, class56.field816);
                        int var28 = class196.method1369(class187.field2938, arg6 - var24, true, class56.field816);
                        if (class60.field882 >= var21) {
                            int[] var29 = class78.field1180[var21];
                            class16.method97(arg4 + 115, var29, var28, arg1, var26);
                            class16.method97(arg4 + 115, var29, var27, arg2, var28);
                            class16.method97(-7, var29, var25, arg1, var27);
                        }
                        if (var20 >= class115.field1678) {
                            int[] var30 = class78.field1180[var20];
                            class16.method97(arg4 ^ 0x7F, var30, var28, arg1, var26);
                            class16.method97(arg4 + 115, var30, var27, arg2, var28);
                            class16.method97(-7, var30, var25, arg1, var27);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class115.field1678 && class60.field882 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class56.field816 && class187.field2938 >= var34) {
                    int var35 = class196.method1369(class187.field2938, var33, true, class56.field816);
                    int var36 = class196.method1369(class187.field2938, var34, true, class56.field816);
                    if (var8 > var7) {
                        int var37 = var7 > var11 ? class182.field2861[var7] : var11;
                        int var38 = class196.method1369(class187.field2938, arg6 + var37, true, class56.field816);
                        int var39 = class196.method1369(class187.field2938, arg6 - var37, true, class56.field816);
                        if (class60.field882 >= var32) {
                            int[] var40 = class78.field1180[var32];
                            class16.method97(-7, var40, var39, arg1, var36);
                            class16.method97(arg4 + 115, var40, var38, arg2, var39);
                            class16.method97(-7, var40, var35, arg1, var38);
                        }
                        if (var31 >= class115.field1678) {
                            int[] var41 = class78.field1180[var31];
                            class16.method97(-7, var41, var39, arg1, var36);
                            class16.method97(-7, var41, var38, arg2, var39);
                            class16.method97(-7, var41, var35, arg1, var38);
                        }
                    } else {
                        if (class60.field882 >= var32) {
                            class16.method97(-7, class78.field1180[var32], var35, arg1, var36);
                        }
                        if (class115.field1678 <= var31) {
                            class16.method97(arg4 ^ 0x7F, class78.field1180[var31], var35, arg1, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (!arg6) {
            return;
        }
        if (arg0 == arg7 && arg1 == arg9 && arg2 == arg4 && arg3 == arg8) {
            class14.method84(arg4, arg5, 1510045708, arg9, arg8, arg7);
        } else {
            int var10 = arg9;
            int var11 = arg7 * 3;
            int var12 = arg9 * 3;
            int var13 = arg7;
            int var14 = arg0 * 3;
            int var15 = arg3 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 * 3;
            int var18 = var14 + arg4 - arg7 - var17;
            int var19 = arg8 + var16 - arg9 - var15;
            int var20 = var17 + var11 - var14 - var14;
            int var21 = var15 - var16 - (var16 - var12);
            int var22 = var14 - var11;
            int var23 = var16 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var21 * var25;
                int var27 = var20 * var25;
                int var28 = var22 * var24;
                int var29 = var23 * var24;
                int var30 = var24 * var25 >> 12;
                int var31 = var18 * var30;
                int var32 = var19 * var30;
                int var33 = (var32 - (-var26 - var29) >> 12) + arg9;
                int var34 = arg7 + (var31 + var27 + var28 >> 12);
                class14.method84(var34, arg5, 1510045708, var10, var33, var13);
                var13 = var34;
                var10 = var33;
            }
        }
        field1705++;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)Luj;")
    public static final class134 method780(int arg0, int arg1) {
        field1704++;
        class134 var2 = (class134) class108.field1577.method1517((long) arg0, (byte) -121);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -29837) {
            field1707 = true;
        }
        byte[] var3 = class56.field811.method501(-2, class270.method1884(-35, arg0), class66.method434((byte) -125, arg0));
        class134 var4 = new class134();
        var4.field1944 = arg0;
        if (var3 != null) {
            var4.method850(new class170(var3), 106);
        }
        var4.method853((byte) -78);
        class108.field1577.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvl;Ljd;ILvl;)V")
    public static final void method781(class73 arg0, class133 arg1, int arg2, class73 arg3) {
        if (arg2 > -96) {
            return;
        }
        class138.field1979 = arg0;
        class67.field1001 = arg3;
        class90.field1362 = arg1;
        if (class67.field1001 != null) {
            class80.field1219 = class67.field1001.method481(2688, 1);
        }
        if (class138.field1979 != null) {
            class261.field4245 = class138.field1979.method481(2688, 1);
        }
        field1710++;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
    public class118(int arg0) {
        this.field1698 = arg0;
        this.field1700 = new int[this.field1698];
        this.field1711 = new class138[this.field1698];
    }
}
