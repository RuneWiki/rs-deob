import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class292 {

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lok;")
    public static class41 field4728 = class137.method956("Verbindung zum Update)2Server hergestellt)3", 45);

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lok;")
    private static class41 field4727 = class137.method956("flash1:", 45);

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lok;")
    public static class41 field4730 = field4727;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lok;")
    public static class41 field4725 = field4727;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "S")
    public static short field4734 = 32767;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lfl;")
    public static class86 field4723 = new class86(512);

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field4736 = 2301979;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Lmh;")
    public static class65 field4735;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lti;IIII)V", line = 6)
    public static final void method2021(class147 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4726++;
        int var5 = -54 % ((arg1 + 12) / 38);
        if (class98.field1432 >= 400) {
            return;
        }
        if (arg0.field2284 != null) {
            arg0 = arg0.method1015(-1);
        }
        if (arg0 == null || !arg0.field2235) {
            return;
        }
        class41 var6 = arg0.field2254;
        if (arg0.field2292 != 0) {
            var6 = class187.method1346(new class41[] { var6, class105.method726(true, class62.field913.field3942, arg0.field2292), class288.field4671, class208.field3364, class1.method4(arg0.field2292, (byte) 77), class298.field4832 }, 0);
        }
        if (class101.field1445 == 1) {
            class79.method565((long) arg4, class187.method1346(new class41[] { class74.field1096, class88.field1294, var6 }, 0), (byte) 52, (short) 38, arg2, class18.field237, arg3);
            class223.field3564++;
        } else if (!class128.field1901) {
            class299.field4845++;
            class41[] var7 = arg0.field2278;
            if (class69.field1030) {
                var7 = class153.method1089(var7, true);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class110.field1564 != 0 || !var7[var8].method306(class176.field2864, 27080))) {
                        class5.field50++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 30;
                        }
                        if (var8 == 1) {
                            var9 = 46;
                        }
                        if (var8 == 2) {
                            var9 = 25;
                        }
                        if (var8 == 3) {
                            var9 = 45;
                        }
                        if (var8 == 4) {
                            var9 = 42;
                        }
                        class79.method565((long) arg4, class187.method1346(new class41[] { class75.field1118, var6 }, 0), (byte) 57, var9, arg2, var7[var8], arg3);
                    }
                }
            }
            if (class110.field1564 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method306(class176.field2864, 27080)) {
                        class290.field4702++;
                        short var11 = 0;
                        short var12 = 0;
                        if (arg0.field2292 > class62.field913.field3942) {
                            var11 = 2000;
                        }
                        if (var10 == 0) {
                            var12 = 30;
                        }
                        if (var10 == 1) {
                            var12 = 46;
                        }
                        if (var10 == 2) {
                            var12 = 25;
                        }
                        if (var10 == 3) {
                            var12 = 45;
                        }
                        if (var10 == 4) {
                            var12 = 42;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class79.method565((long) arg4, class187.method1346(new class41[] { class75.field1118, var6 }, 0), (byte) 86, var12, arg2, var7[var10], arg3);
                    }
                }
            }
            class79.method565((long) arg4, class187.method1346(new class41[] { class75.field1118, var6 }, 0), (byte) 98, (short) 1002, arg2, class315.field5311, arg3);
        } else if ((class193.field3108 & 0x2) == 2) {
            class79.method565((long) arg4, class187.method1346(new class41[] { class126.field1871, class88.field1294, var6 }, 0), (byte) 84, (short) 8, arg2, class94.field1389, arg3);
            class79.field1161++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIIII)V", line = 158)
    public static final void method2022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg6 - arg9;
        if (arg0 <= 100) {
            method2025(-34, -44);
        }
        field4731++;
        int var12 = arg10 - arg3;
        int var13 = 983040 / arg4;
        int var14 = 983040 / arg2;
        boolean var15;
        if (class265.field4208 > 0 && class265.field4208 % 10 < 5) {
            var15 = true;
        } else {
            var15 = false;
        }
        for (int var16 = -var13; var16 < var11 + var13; var16++) {
            int var17 = arg4 * var16 + arg8 >> 16;
            int var18 = arg8 + ((var16 + 1) * arg4) >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg7 + var18;
                int var21 = arg7 + var17;
                int var22 = arg9 + var16 >> 6;
                if (var22 >= 0 && var22 <= (class281.field4571.length - 1)) {
                    int[][] var23 = class281.field4571[var22];
                    for (int var24 = -var14; var24 < var12 + var14; var24++) {
                        int var25 = arg2 * var24 + arg5 >> 16;
                        int var26 = arg5 + ((var24 + 1) * arg2) >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg3 + var24 >> 6;
                            var10000 = arg1 + var26;
                            int var30 = arg1 + var25;
                            if (var28 >= 0 && (var23.length - 1) >= var28 && var23[var28] != null) {
                                int var31 = ((var24 + arg3 & 0x3F) << 6) + (arg9 + var16 & 0x3F);
                                int var32 = var23[var28][var31];
                                if (var32 != 0) {
                                    class171 var33 = class234.method1684(-2441, var32 - 1);
                                    if (var15 && class181.field2929 == var33.field2774) {
                                        class176 var34 = new class176();
                                        var34.field2852 = var30;
                                        var34.field2866 = var33.field2774;
                                        var34.field2854 = var21;
                                        class169.field2687.method1503(var34, (byte) -110);
                                    }
                                    class139.field2144[var33.field2774].method83(var21 - 7, var30 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class176 var35 = (class176) class169.field2687.method1495(-312); var35 != null; var35 = (class176) class169.field2687.method1501(-116)) {
            class139.field2144[var35.field2866].method83(var35.field2854 - 7, var35.field2852 + -7);
            class54.method380(var35.field2854, var35.field2852, 15, 16776960, 128);
            class54.method380(var35.field2854, var35.field2852, 7, 16777215, 256);
        }
        class169.field2687.method1499(-3868);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 274)
    public static void method2023(int arg0) {
        field4735 = null;
        field4723 = null;
        field4728 = null;
        field4727 = null;
        field4725 = null;
        if (arg0 != 29582) {
            field4734 = -7;
        }
        field4730 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 297)
    public static final void method2024(byte arg0) {
        if (arg0 != 66) {
            field4737 = 24;
        }
        class70.field1060.method135(18436);
        field4722++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Z", line = 308)
    public static final boolean method2025(int arg0, int arg1) {
        if (arg0 != -3581) {
            return false;
        }
        field4724++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)Z", line = 356)
    public static final boolean method2026(byte arg0) {
        if (arg0 != 7) {
            field4730 = (class41) null;
        }
        field4733++;
        try {
            return class20.method137(859718496);
        } catch (IOException var5) {
            class151.method1042(-2871);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class116.field1679 + "," + class131.field1962 + "," + class295.field4770 + " - " + class1.field7 + "," + (class62.field913.field4341[0] + class88.field1300) + "," + (class62.field913.field4306[0] + class55.field809) + " - ";
            for (int var4 = 0; var4 < class1.field7 && var4 < 50; var4++) {
                var3 = var3 + class164.field2597.field1607[var4] + ",";
            }
            class104.method719(var3, var6, false);
            class238.method1705(arg0 ^ 0xFFFFFF80);
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 385)
    public static final void method2027(int arg0) {
        if (arg0 != 38) {
            method2027(83);
        }
        class151.field2344.method131(arg0 - 40);
        field4729++;
    }
}
