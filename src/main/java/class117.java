import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class117 extends class194 {

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public final int field2021;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public final int field2034;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Lqk;")
    private static class207 field2017 = class24.method212(255, "purple:");

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Lqk;")
    public static class207 field2024 = field2017;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "[I")
    public static int[] field2036 = new int[32768];

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "Lqk;")
    public static class207 field2026 = field2017;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Lqk;")
    public static class207 field2039 = class24.method212(255, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2033;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Z")
    public static final boolean method822(int arg0) {
        field2037++;
        if (arg0 != 0) {
            return false;
        }
        class247 var1 = class70.field1244;
        synchronized (class70.field1244) {
            if (class41.field814 == class273.field4801) {
                return false;
            } else {
                class252.field4537 = class82.field1515[class41.field814];
                class128.field2234 = class41.field824[class41.field814];
                class41.field814 = class41.field814 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)Z")
    public final boolean method823(byte arg0) {
        if (arg0 != 71) {
            this.method832(26);
        }
        field2030++;
        return (this.field2021 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
    public static final void method824(boolean arg0) {
        field2020++;
        if (arg0) {
            method831(-83, 53);
        }
        class165.field2917.method1390((byte) 111);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
    public static void method825(byte arg0) {
        field2017 = null;
        field2036 = null;
        field2026 = null;
        if (arg0 != 7) {
            field2039 = null;
        }
        field2024 = null;
        field2039 = null;
        field2033 = null;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)Z")
    public final boolean method826(byte arg0) {
        if (arg0 == 40) {
            field2025++;
            return (this.field2021 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
    public final boolean method827(int arg0, int arg1) {
        field2022++;
        int var3 = 107 % ((arg1 + 22) / 58);
        return (this.field2021 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
    public final boolean method828(int arg0) {
        if (arg0 == 1) {
            field2035++;
            return (this.field2021 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Lwg;")
    public static final class173 method829(int arg0, byte arg1) {
        if (arg1 <= 43) {
            field2033 = null;
        }
        field2028++;
        class173 var2 = (class173) class189.field3334.method1387((long) arg0, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class160.field2837.method705(class199.method1379(-1016344952, arg0), class14.method93(-15079, arg0), -1);
        class173 var4 = new class173();
        var4.field3106 = arg0;
        if (var3 != null) {
            var4.method1237(new class149(var3), -11420);
        }
        var4.method1233(4763);
        if (var4.field3117 != -1) {
            var4.method1246(method829(var4.field3080, (byte) 51), method829(var4.field3117, (byte) 115), 15676);
        }
        if (var4.field3064 != -1) {
            var4.method1245(method829(var4.field3064, (byte) 123), method829(var4.field3095, (byte) 102), (byte) -15);
        }
        if (!class55.field1024 && var4.field3071) {
            var4.field3057 = class40.field798;
            var4.field3062 = 0;
            var4.field3077 = class69.field1237;
            var4.field3118 = false;
            var4.field3051 = class25.field523;
        }
        class189.field3334.method1385((long) arg0, var4, (byte) -110);
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(B)Z")
    public final boolean method830(byte arg0) {
        int var2 = 15 / ((-arg0 - 50) / 48);
        field2038++;
        return (this.field2021 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public static final void method831(int arg0, int arg1) {
        field2032++;
        class160.field2830.method1383(-8052, arg1);
        if (arg0 == 1) {
            class191.field3373.method1383(-8052, arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
    public final boolean method832(int arg0) {
        field2023++;
        if (arg0 == 1412416245) {
            return (this.field2021 & 0x225D5C) >> 21 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Llb;IIIIIIIZ)V")
    public static final void method833(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class207.field3676;
        int var11;
        int var12 = var11 = (arg7 << 7) - class59.field1084;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class163.field2881[arg1][arg6][arg7] - class134.field2322;
        int var18 = class163.field2881[arg1][arg6 + 1][arg7] - class134.field2322;
        int var19 = class163.field2881[arg1][arg6 + 1][arg7 + 1] - class134.field2322;
        int var20 = class163.field2881[arg1][arg6][arg7 + 1] - class134.field2322;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class257.field4599;
        int var46 = (var24 << 9) / var25 + class257.field4593;
        int var47 = (var27 << 9) / var31 + class257.field4599;
        int var48 = (var30 << 9) / var31 + class257.field4593;
        int var49 = (var33 << 9) / var37 + class257.field4599;
        int var50 = (var36 << 9) / var37 + class257.field4593;
        int var51 = (var39 << 9) / var43 + class257.field4599;
        int var52 = (var42 << 9) / var43 + class257.field4593;
        class257.field4590 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class15.field243 && class94.method677(class257.field4599 + class180.field3234, class262.field4661 + class257.field4593, var50, var52, var48, var49, var51, var47)) {
                class33.field665 = arg6;
                class27.field559 = arg7;
            }
            if (!arg8) {
                class257.field4592 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class257.field4604 || var51 > class257.field4604 || var47 > class257.field4604) {
                    class257.field4592 = true;
                }
                if (arg0.field2245 == -1) {
                    if (arg0.field2250 != 12345678) {
                        class257.method1801(var50, var52, var48, var49, var51, var47, arg0.field2250, arg0.field2249, arg0.field2255);
                    }
                } else if (!class261.field4655) {
                    int var53 = class257.field4602.method342(arg0.field2245, 65535);
                    class257.method1801(var50, var52, var48, var49, var51, var47, class183.method1292(var53, arg0.field2250), class183.method1292(var53, arg0.field2249), class183.method1292(var53, arg0.field2255));
                } else if (arg0.field2257) {
                    class257.method1782(var50, var52, var48, var49, var51, var47, arg0.field2250, arg0.field2249, arg0.field2255, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2245);
                } else {
                    class257.method1782(var50, var52, var48, var49, var51, var47, arg0.field2250, arg0.field2249, arg0.field2255, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2245);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class15.field243 && class94.method677(class257.field4599 + class180.field3234, class262.field4661 + class257.field4593, var46, var48, var52, var45, var47, var51)) {
            class33.field665 = arg6;
            class27.field559 = arg7;
        }
        if (arg8) {
            return;
        }
        class257.field4592 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class257.field4604 || var47 > class257.field4604 || var51 > class257.field4604) {
            class257.field4592 = true;
        }
        if (arg0.field2245 != -1) {
            if (class261.field4655) {
                class257.method1782(var46, var48, var52, var45, var47, var51, arg0.field2244, arg0.field2255, arg0.field2249, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2245);
                return;
            }
            int var54 = class257.field4602.method342(arg0.field2245, 65535);
            class257.method1801(var46, var48, var52, var45, var47, var51, class183.method1292(var54, arg0.field2244), class183.method1292(var54, arg0.field2255), class183.method1292(var54, arg0.field2249));
        } else if (arg0.field2244 != 12345678) {
            class257.method1801(var46, var48, var52, var45, var47, var51, arg0.field2244, arg0.field2255, arg0.field2249);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(B)Z")
    public final boolean method834(byte arg0) {
        if (arg0 > -23) {
            return false;
        } else {
            field2040++;
            return (this.field2021 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)I")
    public final int method835(int arg0) {
        int var2 = -38 % ((arg0 + 30) / 43);
        field2018++;
        return (this.field2021 & 0x1E7ACC) >> 18;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZBJ)Lqk;")
    public static final class207 method836(int arg0, boolean arg1, byte arg2, long arg3) {
        field2016++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        int var6 = -31 / ((arg2 - 57) / 62);
        for (long var7 = arg3 / (long) arg0; var7 != 0L; var7 /= (long) arg0) {
            var5++;
        }
        int var9 = var5;
        if (arg3 < 0L || arg1) {
            var9 = var5 + 1;
        }
        byte[] var10 = new byte[var9];
        if (arg3 < 0L) {
            var10[0] = 45;
        } else if (arg1) {
            var10[0] = 43;
        }
        for (int var11 = 0; var11 < var5; var11++) {
            int var13 = (int) (arg3 % (long) arg0);
            arg3 /= (long) arg0;
            if (var13 < 0) {
                var13 = -var13;
            }
            if (var13 > 9) {
                var13 += 39;
            }
            var10[var9 - var11 - 1] = (byte) (var13 + 48);
        }
        class207 var12 = new class207();
        var12.field3652 = var10;
        var12.field3663 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I")
    public final int method837(int arg0) {
        if (arg0 == 1) {
            field2019++;
            return class1.method6(this.field2021, 120);
        } else {
            return 122;
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Z")
    public final boolean method838(int arg0) {
        field2031++;
        if (arg0 != 0) {
            this.method827(-48, -18);
        }
        return (this.field2021 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BBII)Z")
    public static final boolean method839(byte[] arg0, byte arg1, int arg2, int arg3) {
        field2027++;
        class149 var4 = new class149(arg0);
        boolean var5 = true;
        int var6 = -1;
        if (arg1 >= -116) {
            method824(false);
        }
        label58: while (true) {
            int var7 = var4.method1064((byte) 120);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method1067(-32768);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var4.method1045((byte) 106) >> 2;
                    int var14 = arg2 + var12;
                    int var15 = (var8 & 0xFFC) >> 6;
                    int var16 = arg3 + var15;
                    if (var16 > 0 && var14 > 0 && var16 < 103 && var14 < 103) {
                        class22 var17 = class33.method251(0, var6);
                        if (var13 != 22 || class278.field4884 || var17.field374 != 0 || var17.field393 == 1 || var17.field387) {
                            if (!var17.method137(-44)) {
                                class260.field4633++;
                                var5 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var4.method1067(-32768);
                if (var10 == 0) {
                    break;
                }
                var4.method1045((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(II)V")
    public class117(int arg0, int arg1) {
        this.field2021 = arg0;
        this.field2034 = arg1;
    }
}
