import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class243 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[Z")
    public static boolean[] field3988 = new boolean[100];

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3994 = "yellow:";

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lvh;")
    public static class108 field3989;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lkl;")
    public static class215 field3990;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public static final void method1601() {
        if (class4.field56 != null) {
            for (int var0 = 0; var0 < class4.field56.length; var0++) {
                for (int var1 = 0; var1 < class191.field3084; var1++) {
                    for (int var2 = 0; var2 < class277.field4439; var2++) {
                        class4.field56[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class72.field1185 != null) {
            for (int var3 = 0; var3 < class72.field1185.length; var3++) {
                for (int var4 = 0; var4 < class191.field3084; var4++) {
                    for (int var5 = 0; var5 < class277.field4439; var5++) {
                        class72.field1185[var3][var4][var5] = null;
                    }
                }
            }
        }
        class165.field2701 = 0;
        if (class291.field4648 != null) {
            for (int var6 = 0; var6 < class165.field2701; var6++) {
                class291.field4648[var6] = null;
            }
        }
        if (class89.field1579 != null) {
            for (int var7 = 0; var7 < class211.field3561; var7++) {
                class89.field1579[var7] = null;
            }
            class211.field3561 = 0;
        }
        if (class190.field3083 != null) {
            for (int var8 = 0; var8 < class190.field3083.length; var8++) {
                class190.field3083[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method1602(int arg0) {
        field3978++;
        class168.field2783.method58(0);
        class139.field2397.method58(0);
        if (arg0 >= -16) {
            field3987 = -61;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Z")
    public final boolean method1603(byte arg0) {
        field3982++;
        if (arg0 == -73) {
            return (this.field3980 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)I")
    public static final int method1604(int arg0, int arg1, byte arg2) {
        int var3 = 34 % ((arg2 - 56) / 40);
        field3993++;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 13;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return (var6 & 0x7FA597F) >> 19;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lue;IIII)V")
    public static final void method1605(class208 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3984++;
        if (class275.field4399 >= 400) {
            return;
        }
        if (arg0.field3521 != null) {
            arg0 = arg0.method1402((byte) -128);
        }
        if (arg0 == null || !arg0.field3479 || arg4 != -26647) {
            return;
        }
        String var5 = arg0.field3522;
        if (arg0.field3497 != 0) {
            String var6 = class185.field3002 == 1 ? class286.field4517 : class239.field3938;
            var5 = var5 + class205.method1353(class273.field4378.field4598, arg0.field3497, -2931) + " (" + var6 + arg0.field3497 + ")";
        }
        if (class183.field2976 == 1) {
            class37.method247((long) arg2, class45.field631, class258.field4208 + " -> <col=ffff00>" + var5, 10032, arg3, class256.field4179, (short) 20, arg1);
            class266.field4299++;
        } else if (class76.field1241) {
            class2 var14 = class183.field2983 == -1 ? null : class119.method816(class183.field2983, (byte) 72);
            if ((class176.field2898 & 0x2) != 0) {
                if (var14 == null || arg0.method1395(class183.field2983, var14.field25, 255) != var14.field25) {
                    class37.method247((long) arg2, class6.field67, class253.field4145 + " -> <col=ffff00>" + var5, 10032, arg3, class158.field2640, (short) 15, arg1);
                    class102.field1796++;
                }
                return;
            }
        } else {
            class161.field2673++;
            String[] var7 = arg0.field3481;
            if (class29.field433) {
                var7 = class285.method1903(var7, false);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class185.field3002 != 0 || !var7[var8].equalsIgnoreCase(class211.field3560))) {
                        byte var9 = 0;
                        class165.field2699++;
                        if (var8 == 0) {
                            var9 = 59;
                        }
                        int var10 = -1;
                        if (var8 == 1) {
                            var9 = 23;
                        }
                        if (var8 == 2) {
                            var9 = 18;
                        }
                        if (arg0.field3518 == var8) {
                            var10 = arg0.field3502;
                        }
                        if (var8 == 3) {
                            var9 = 35;
                        }
                        if (arg0.field3486 == var8) {
                            var10 = arg0.field3533;
                        }
                        if (var8 == 4) {
                            var9 = 37;
                        }
                        class37.method247((long) arg2, var7[var8], "<col=ffff00>" + var5, arg4 ^ 0xFFFFB0D9, arg3, var10, var9, arg1);
                    }
                }
            }
            if (class185.field3002 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class211.field3560)) {
                        class281.field4480++;
                        short var12 = 0;
                        if (arg0.field3497 > class273.field4378.field4598) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 59;
                        }
                        if (var11 == 1) {
                            var13 = 23;
                        }
                        if (var11 == 2) {
                            var13 = 18;
                        }
                        if (var11 == 3) {
                            var13 = 35;
                        }
                        if (var11 == 4) {
                            var13 = 37;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class37.method247((long) arg2, var7[var11], "<col=ffff00>" + var5, arg4 + 36679, arg3, arg0.field3496, var13, arg1);
                    }
                }
            }
            class37.method247((long) arg2, class277.field4436, "<col=ffff00>" + var5, 10032, arg3, class293.field4678, (short) 1002, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method1606(int arg0) {
        field3994 = null;
        field3988 = null;
        field3989 = null;
        field3990 = null;
        if (arg0 <= 85) {
            method1605((class208) null, 27, 30, 126, 70);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Z")
    public final boolean method1607(int arg0) {
        if (arg0 == 100) {
            field3986++;
            return (this.field3980 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)Z")
    public final boolean method1608(int arg0) {
        if (arg0 <= 62) {
            method1602(51);
        }
        field3985++;
        return (this.field3980 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Z")
    public final boolean method1609(byte arg0) {
        if (arg0 == -16) {
            field3983++;
            return (this.field3980 & 0x4) != 0;
        } else {
            return false;
        }
    }
}
