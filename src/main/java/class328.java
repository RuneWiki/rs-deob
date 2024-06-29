import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class328 {

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field5143 = 0;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field5138 = 0;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "S")
    public static short field5139 = 1;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5146 = "wave2:";

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5145 = "Examine";

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[Luj;")
    public static class169[] field5140;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)Z", line = 6)
    public static final boolean method2300(int arg0, boolean arg1) {
        byte var2 = 0;
        field5142++;
        byte var3 = 0;
        if (class48.field633 == null) {
            if (class109.field1458 || class119.field1663 == null) {
                class48.field633 = new class190(512, 512);
            } else {
                class48.field633 = (class190) class119.field1663;
            }
            int[] var4 = class48.field633.field3038;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < (104 - var2 - 1); var7++) {
                int var8 = ((var2 + 103 - var7) * 4 * 512) + 24628;
                for (int var9 = var3 + 1; var9 < 104 - var3 - 1; var9++) {
                    if ((class134.field1969[arg0][var9][var7] & 0x18) == 0) {
                        class183.method1341(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class134.field1969[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class183.method1341(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class117.field1633 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class145.method1075(class154.field2392, var10 + var3, var2 + var11);
                    if (var12 != 0L) {
                        class121 var14 = class249.method1790(101, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        int var15 = var14.field1699;
                        if (var14.field1690 != null) {
                            for (int var16 = 0; var16 < var14.field1690.length; var16++) {
                                if (var14.field1690[var16] != -1) {
                                    class121 var17 = class249.method1790(31, var14.field1690[var16]);
                                    if (var17.field1699 >= 0) {
                                        var15 = var17.field1699;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var3 + var10;
                            int var19 = var2 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class134.field1970[class154.field2392].field3197;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var10 + 3 > var18 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class32.field475[class117.field1633] = var14.field1705;
                            class327.field5133[class117.field1633] = var18 - var3;
                            class32.field480[class117.field1633] = var19 - var2;
                            class117.field1633++;
                        }
                    }
                }
            }
        }
        class48.field633.method1401();
        int var23 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((238 - -((int) (Math.random() * 20.0D))) + -10 << 8) + 228;
        if (!arg1) {
            method2300(-58, true);
        }
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class134.field1969[arg0][var3 + var26][var2 + var25] & 0x18) == 0 && !class263.method1887(var2, var24, var25, var23, arg0, var3, -3, var26)) {
                    if (class109.field1458) {
                        class280.field4310 = null;
                    } else {
                        class42.field583.method512(22);
                    }
                    return false;
                }
                if (arg0 < 3 && (class134.field1969[arg0 + 1][var3 + var26][var2 + var25] & 0x8) != 0 && !class263.method1887(var2, var24, var25, var23, arg0 + 1, var3, -3, var26)) {
                    if (class109.field1458) {
                        class280.field4310 = null;
                    } else {
                        class42.field583.method512(37);
                    }
                    return false;
                }
            }
        }
        if (class109.field1458) {
            int[] var27 = class48.field633.field3038;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class119.field1663 = new class239(class48.field633);
        } else {
            class119.field1663 = class48.field633;
        }
        if (class109.field1458) {
            class280.field4310 = null;
        } else {
            class42.field583.method512(21);
        }
        class48.field633 = null;
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V", line = 239)
    public static final void method2301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5144++;
        int var5 = -11 % ((arg0 + 7) / 37);
        int var6 = arg1;
        int var7 = 0;
        int var8 = -1;
        int var9 = -arg1;
        int var10 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + arg4);
        int var11 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg4 - arg1);
        class256.method1853(class284.field4402[arg2], var11, arg3, var10, 0);
        while (var7 < var6) {
            var8 += 2;
            var9 += var8;
            if (var9 > 0) {
                var6--;
                var9 -= var6 << 1;
                int var12 = arg2 + var6;
                int var13 = arg2 - var6;
                if (class42.field579 <= var12 && var13 <= class334.field5205) {
                    int var14 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg4 + var7);
                    int var15 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg4 - var7);
                    if (var12 <= class334.field5205) {
                        class256.method1853(class284.field4402[var12], var15, arg3, var14, 0);
                    }
                    if (class42.field579 <= var13) {
                        class256.method1853(class284.field4402[var13], var15, arg3, var14, 0);
                    }
                }
            }
            var7++;
            int var16 = arg2 - var7;
            int var17 = arg2 + var7;
            if (class42.field579 <= var17 && class334.field5205 >= var16) {
                int var18 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg4 + var6);
                int var19 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg4 - var6);
                if (var17 <= class334.field5205) {
                    class256.method1853(class284.field4402[var17], var19, arg3, var18, 0);
                }
                if (class42.field579 <= var16) {
                    class256.method1853(class284.field4402[var16], var19, arg3, var18, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 326)
    public static void method2302(int arg0) {
        if (arg0 < 116) {
            method2301(45, -71, -55, 73, 32);
        }
        field5146 = null;
        field5145 = null;
        field5140 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 342)
    public static final void method2303(int arg0, int arg1) {
        field5137++;
        if (arg1 == -5585) {
            class332.field5174.method1353(-1, arg0);
        }
    }
}
