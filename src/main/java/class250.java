import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class250 {

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lqj;")
    public static class511 field3618 = new class511(5, 16);

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field3623 = 0;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)Z")
    public static final boolean method1597(int arg0, int arg1, int arg2) {
        field3620++;
        if (arg2 != 26127) {
            method1600(-98, null, -65, 86);
        }
        return (class582.method3369(-11610, arg1, arg0) | class374.method2232(arg0, arg1, true) | class383.method2341(arg2 - 26234, arg0, arg1)) & class439.method2565(arg0, arg1, arg2 ^ 0x8C5);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)I")
    public static final int method1598(int arg0, int arg1) {
        field3621++;
        if (arg0 != 1518908584) {
            method1597(-2, 12, -115);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
    public static void method1599(boolean arg0) {
        field3618 = null;
        if (!arg0) {
            method1601(62);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILjda;II)Lvfa;")
    public static final class438 method1600(int arg0, class77 arg1, int arg2, int arg3) {
        field3619++;
        int var4 = arg1.field1189 | arg0 << 10;
        class438 var5 = (class438) class43.field584.method3823((long) var4 << 16, -1);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class563.field8216.method2086(1024, class563.field8216.method2070(var4, -1));
        if (var6 == null) {
            int var9 = arg2 + 65536 << 10 | arg1.field1189;
            class438 var10 = (class438) class43.field584.method3823((long) var9 << 16, -1);
            if (arg3 != -6559) {
                method1599(true);
            }
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class563.field8216.method2086(1024, class563.field8216.method2070(var9, -1));
            if (var11 == null) {
                int var14 = arg1.field1189 | 0x3FFFC00;
                class438 var15 = (class438) class43.field584.method3823((long) var14 << 16, -1);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class563.field8216.method2086(1024, class563.field8216.method2070(var14, -1));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class438 var17;
                    try {
                        var17 = class596.method3410(arg3 ^ 0xFFFFE61C, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field6305 = arg1;
                    class43.field584.method3824((long) var14 << 16, -91, var17);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class438 var12;
                try {
                    var12 = class596.method3410(-42, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field6305 = arg1;
                class43.field584.method3824((long) var9 << 16, -91, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class438 var7;
            try {
                var7 = class596.method3410(-48, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field6305 = arg1;
            class43.field584.method3824((long) var4 << 16, arg3 + 6468, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        if (arg0 != -1) {
            method1599(true);
        }
        for (int var1 = 0; var1 < class465.field6718; var1++) {
            class333.field4644[var1] = null;
        }
        field3622++;
        class465.field6718 = 0;
        for (int var2 = 0; var2 < class596.field8626; var2++) {
            for (int var42 = 0; var42 < class33.field474; var42++) {
                for (int var43 = 0; var43 < class687.field9758; var43++) {
                    class293 var44 = class541.field7946[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field4088 > 0) {
                            var44.field4088 = (short) (var44.field4088 * -1);
                        }
                        if (var44.field4096 > 0) {
                            var44.field4096 = (short) (var44.field4096 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class596.field8626; var3++) {
            for (int var4 = 0; var4 < class33.field474; var4++) {
                for (int var5 = 0; var5 < class687.field9758; var5++) {
                    class293 var6 = class541.field7946[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class541.field7946[0][var5][var4] != null && class541.field7946[0][var5][var4].field4098 != null;
                        if (var6.field4088 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class293 var12 = class541.field7946[var3][var5][var4 - 1];
                            int var13 = class621.field8841[var3].method3858(var4, var5, (byte) 67);
                            while (var8 > 0 && var12 != null && var12.field4088 < 0 && var6.field4088 == var12.field4088 && var6.field4099 == var12.field4099 && class621.field8841[var3].method3858(var8 - 1, var5, (byte) 27) == var13 && ((var8 - 1) <= 0 || class621.field8841[var3].method3858(var8 - 2, var5, (byte) 106) == var13)) {
                                var8--;
                                var12 = class541.field7946[var3][var5][var8 - 1];
                            }
                            for (class293 var14 = class541.field7946[var3][var5][var4 + 1]; var9 < class687.field9758 && var14 != null && var14.field4088 < 0 && var6.field4088 == var14.field4088 && var6.field4099 == var14.field4099 && var13 == class621.field8841[var3].method3858(var9 + 1, var5, (byte) 126) && (class687.field9758 <= var9 + 1 || var13 == class621.field8841[var3].method3858(var9 + 2, var5, (byte) 18)); var14 = class541.field7946[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class621.field8841[var7 ? var3 + 1 : var3].method3858(var8, var5, (byte) 127);
                            int var17 = var16 + (var6.field4088 * var15);
                            int var18 = class621.field8841[var7 ? var3 + 1 : var3].method3858(var9 + 1, var5, (byte) 36);
                            int var19 = var6.field4088 * var15 + var18;
                            int var20 = var5 << class49.field637;
                            int var21 = var8 << class49.field637;
                            int var22 = (var9 << class49.field637) + class457.field6576;
                            class333.field4644[class465.field6718++] = new class302(1, var3, var6.field4099 + var20, var6.field4099 + var20, var20 + var6.field4099, var6.field4099 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class541.field7946[var23][var5][var24].field4088 = (short) (class541.field7946[var23][var5][var24].field4088 * -1);
                                }
                            }
                        }
                        if (var6.field4096 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class293 var29 = class541.field7946[var3][var5 - 1][var4];
                            int var30 = class621.field8841[var3].method3858(var4, var5, (byte) 124);
                            while (var25 > 0 && var29 != null && var29.field4096 < 0 && var6.field4096 == var29.field4096 && var6.field4087 == var29.field4087 && var30 == class621.field8841[var3].method3858(var4, var25 - 1, (byte) 94) && (var25 - 1 <= 0 || var30 == class621.field8841[var3].method3858(var4, var25 - 2, (byte) 60))) {
                                var25--;
                                var29 = class541.field7946[var3][var25 - 1][var4];
                            }
                            for (class293 var31 = class541.field7946[var3][var5 + 1][var4]; class33.field474 > var26 && var31 != null && var31.field4096 < 0 && var6.field4096 == var31.field4096 && var6.field4087 == var31.field4087 && class621.field8841[var3].method3858(var4, var26 + 1, (byte) 66) == var30 && (class33.field474 <= (var26 + 1) || class621.field8841[var3].method3858(var4, var26 + 2, (byte) 119) == var30); var31 = class541.field7946[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class621.field8841[var7 ? var3 + 1 : var3].method3858(var4, var25, (byte) 117);
                            int var34 = var6.field4096 * var32 + var33;
                            int var35 = class621.field8841[var7 ? var3 + 1 : var3].method3858(var4, var26 + 1, (byte) 88);
                            int var36 = var6.field4096 * var32 + var35;
                            int var37 = var25 << class49.field637;
                            int var38 = (var26 << class49.field637) + class457.field6576;
                            int var39 = var4 << class49.field637;
                            class333.field4644[class465.field6718++] = new class302(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field4087 + var39, var6.field4087 + var39, var6.field4087 + var39, var6.field4087 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class541.field7946[var40][var41][var4].field4096 = (short) (class541.field7946[var40][var41][var4].field4096 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class305.field4261 = true;
    }
}
