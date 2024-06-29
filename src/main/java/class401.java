import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class401 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    public static int[] field5848 = new int[3];

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5856 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "S")
    public static short field5850 = 1;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5857 = "";

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5852 = "flash2:";

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field5853 = -1;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lqj;")
    public static class296 field5849;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[Llf;")
    public static class130[] field5855;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5845;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljj;ZI)V", line = 8)
    public static final void method2587(class61 arg0, boolean arg1, int arg2) {
        field5851++;
        class312 var3 = arg0.method402(0);
        if (arg0.field948 == 0) {
            class229.field3050 = -1;
            arg0.field942 = 0;
            class83.field1283 = 0;
            return;
        }
        if (arg0.field931 != -1 && arg0.field880 == 0) {
            class449 var4 = class86.method599(false, arg0.field931);
            if (arg0.field947 > 0 && var4.field6511 == 0) {
                arg0.field942++;
                class83.field1283 = 0;
                class229.field3050 = -1;
                return;
            }
            if (arg0.field947 <= 0 && var4.field6513 == 0) {
                arg0.field942++;
                class83.field1283 = 0;
                class229.field3050 = -1;
                return;
            }
        }
        if (arg0.field877 != -1 && arg0.field897 <= class35.field541) {
            class69 var5 = class221.method1405(arg0.field877, -121);
            if (var5.field1086 && var5.field1076 != -1) {
                class449 var6 = class86.method599(false, var5.field1076);
                if (arg0.field947 > 0 && var6.field6511 == 0) {
                    class229.field3050 = -1;
                    arg0.field942++;
                    class83.field1283 = 0;
                    return;
                }
                if (arg0.field947 <= 0 && var6.field6513 == 0) {
                    class83.field1283 = 0;
                    arg0.field942++;
                    class229.field3050 = -1;
                    return;
                }
            }
        }
        int var7 = arg0.field6197;
        int var8 = arg0.field6192;
        int var9 = arg0.field956[arg0.field948 - 1] * 128 + (arg0.method410((byte) 61) * 64);
        int var10 = arg0.field944[arg0.field948 - 1] * 128 + (arg0.method410((byte) 65) * 64);
        if (!arg1 && (var9 - var7) > 256 || var9 - var7 < -256 || var10 - var8 > 256 || var10 - var8 < -256) {
            arg0.field6197 = var9;
            class83.field1283 = 0;
            arg0.field6192 = var10;
            class229.field3050 = -1;
            return;
        }
        if (var7 >= var9) {
            if (var7 > var9) {
                if (var8 < var10) {
                    arg0.method395(arg2, 6144);
                } else if (var8 <= var10) {
                    arg0.method395(0, 4096);
                } else {
                    arg0.method395(0, 2048);
                }
            } else if (var8 < var10) {
                arg0.method395(arg2, 8192);
            } else if (var10 < var8) {
                arg0.method395(arg2, 0);
            }
        } else if (var8 < var10) {
            arg0.method395(0, 10240);
        } else if (var10 < var8) {
            arg0.method395(0, 14336);
        } else {
            arg0.method395(0, 12288);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg0 instanceof class437) {
            var12 = ((class437) arg0).field6290.field2927;
        }
        if (var12) {
            int var13 = arg0.field863 - arg0.field859.field5373;
            if (var13 != 0 && arg0.field915 == -1 && arg0.field878 != 0) {
                var11 = 2;
            }
            if (!arg1 && arg0.field948 > 2) {
                var11 = 6;
            }
            if (!arg1 && arg0.field948 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg1 && arg0.field948 > 1) {
                var11 = 6;
            }
            if (!arg1 && arg0.field948 > 2) {
                var11 = 8;
            }
        }
        if (arg0.field942 > 0 && arg0.field948 > 1) {
            arg0.field942--;
            var11 = 8;
        }
        byte var14 = arg0.field940[arg0.field948 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        class83.field1283 = 0;
        if (var3.field4281 != -1) {
            int var15 = var11 << 7;
            if (arg0.field948 == 1) {
                int var16 = arg0.field955 * arg0.field955;
                int var17 = (arg0.field6197 <= var9 ? var9 - arg0.field6197 : -var9 + arg0.field6197) << 7;
                int var18 = (var10 < arg0.field6192 ? arg0.field6192 - var10 : var10 - arg0.field6192) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var3.field4281 * 2 * var19;
                if (var20 < var16) {
                    arg0.field955 /= 2;
                } else if (var16 / 2 > var19) {
                    arg0.field955 -= var3.field4281;
                    if (arg0.field955 < 0) {
                        arg0.field955 = 0;
                    }
                } else if (var15 > arg0.field955) {
                    arg0.field955 += var3.field4281;
                    if (var15 < arg0.field955) {
                        arg0.field955 = var15;
                    }
                }
            } else if (var15 > arg0.field955) {
                arg0.field955 += var3.field4281;
                if (arg0.field955 > var15) {
                    arg0.field955 = var15;
                }
            } else if (arg0.field955 > 0) {
                arg0.field955 -= var3.field4281;
                if (arg0.field955 < 0) {
                    arg0.field955 = 0;
                }
            }
            var11 = arg0.field955 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var7 < var9) {
            class83.field1283 |= 0x4;
            arg0.field6197 += var11;
            if (var9 < arg0.field6197) {
                arg0.field6197 = var9;
            }
        } else if (var7 > var9) {
            arg0.field6197 -= var11;
            class83.field1283 |= 0x8;
            if (arg0.field6197 < var9) {
                arg0.field6197 = var9;
            }
        }
        if (var8 < var10) {
            class83.field1283 |= 0x1;
            arg0.field6192 += var11;
            if (arg0.field6192 > var10) {
                arg0.field6192 = var10;
            }
        } else if (var8 > var10) {
            class83.field1283 |= 0x2;
            arg0.field6192 -= var11;
            if (arg0.field6192 < var10) {
                arg0.field6192 = var10;
            }
        }
        if (var11 >= 8) {
            class229.field3050 = 2;
        } else {
            class229.field3050 = var14;
        }
        if (arg2 != 0) {
            method2587((class61) null, true, -80);
        }
        if (arg0.field6197 != var9 || arg0.field6192 != var10) {
            return;
        }
        arg0.field948--;
        if (arg0.field947 > 0) {
            arg0.field947--;
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 312)
    public static final void method2588(int arg0, String arg1) {
        if (arg0 != 4830) {
            return;
        }
        field5847++;
        if (class270.field3680 != null) {
            class442.field6400.method158((byte) 7, 210);
            class248.field3439++;
            class442.field6400.method2396(class322.method2036(arg1, 53), 12450);
            class442.field6400.method2412(-119, arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V", line = 335)
    public static final void method2589(byte arg0, int arg1) {
        field5846++;
        class190 var2 = class26.field422;
        synchronized (class26.field422) {
            if (arg0 > 96) {
                class26.field422.method1254(arg1, 124);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)I", line = 362)
    public static final int method2590(int arg0, byte arg1, String arg2, String arg3) {
        field5859++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class376.method2456(var22, (byte) 64);
            var9 = class376.method2456(var24, (byte) 64);
            char var26 = class156.method1050(var22, -31348, arg0);
            char var27 = class156.method1050(var24, -31348, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class275.method1688(var28, arg0, false) - class275.method1688(var29, arg0, false);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class275.method1688(var20, arg0, false) - class275.method1688(var21, arg0, false);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        } else if (arg1 >= -73) {
            return -85;
        } else {
            for (int var13 = 0; var13 < var10; var13++) {
                char var14 = arg3.charAt(var13);
                char var15 = arg2.charAt(var13);
                if (var14 != var15) {
                    return class275.method1688(var14, arg0, false) - class275.method1688(var15, arg0, false);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 489)
    public static void method2591(byte arg0) {
        if (arg0 != -86) {
            field5848 = null;
        }
        field5852 = null;
        field5856 = null;
        field5848 = null;
        field5845 = null;
        field5855 = null;
        field5849 = null;
        field5857 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)I", line = 517)
    public static final int method2592(int arg0, byte arg1) {
        if (arg1 == 60) {
            field5860++;
            return arg0 >>> 10;
        } else {
            return -90;
        }
    }
}
