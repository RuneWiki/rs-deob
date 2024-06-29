import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class276 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lec;")
    public static class25 field4561 = new class25(30);

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4569 = 0;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lul;")
    public static class201 field4572 = new class201(5000);

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[Lve;")
    public static class203[] field4576 = new class203[0];

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field4574 = -1;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4577 = "Loaded title screen";

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[Ljh;")
    public static class308[] field4575 = new class308[50];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lwa;")
    public static class281 field4573 = new class281();

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4578;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[Llb;")
    public static class138[] field4567;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)I")
    public static final int method1918(int arg0, byte arg1) {
        field4568++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = -109 / ((arg1 + 35) / 59);
        int var7 = var5 | var5 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lkj;IIIIIIZ)V")
    public static final void method1919(class153 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2384.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2384[var9] - class160.field2527;
            int var23 = arg0.field2387[var9] - class60.field925;
            int var24 = arg0.field2382[var9] - class60.field927;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2385 != null) {
                class153.field2398[var9] = var25;
                class153.field2386[var9] = var28;
                class153.field2396[var9] = var29;
            }
            class153.field2388[var9] = (var25 << 9) / var29 + class172.field2663;
            class153.field2380[var9] = (var28 << 9) / var29 + class172.field2657;
        }
        class172.field2655 = 0;
        int var10 = arg0.field2392.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2392[var11];
            int var13 = arg0.field2400[var11];
            int var14 = arg0.field2401[var11];
            int var15 = class153.field2388[var12];
            int var16 = class153.field2388[var13];
            int var17 = class153.field2388[var14];
            int var18 = class153.field2380[var12];
            int var19 = class153.field2380[var13];
            int var20 = class153.field2380[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class34.field418 && class152.method1002(class285.field4758 + class172.field2663, class217.field3456 + class172.field2657, var18, var19, var20, var15, var16, var17)) {
                    class74.field1138 = arg5;
                    class299.field4912 = arg6;
                }
                if (!arg7) {
                    class172.field2666 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class172.field2667 || var16 > class172.field2667 || var17 > class172.field2667) {
                        class172.field2666 = true;
                    }
                    if (arg0.field2385 == null || arg0.field2385[var11] == -1) {
                        if (arg0.field2391[var11] != 12345678) {
                            class172.method1133(var18, var19, var20, var15, var16, var17, arg0.field2391[var11], arg0.field2390[var11], arg0.field2399[var11]);
                        }
                    } else if (!class182.field2830) {
                        int var21 = class172.field2670.method1120(arg0.field2385[var11], 124);
                        class172.method1133(var18, var19, var20, var15, var16, var17, class130.method870(var21, arg0.field2391[var11]), class130.method870(var21, arg0.field2390[var11]), class130.method870(var21, arg0.field2399[var11]));
                    } else if (arg0.field2397) {
                        class172.method1150(var18, var19, var20, var15, var16, var17, arg0.field2391[var11], arg0.field2390[var11], arg0.field2399[var11], class153.field2398[0], class153.field2398[1], class153.field2398[3], class153.field2386[0], class153.field2386[1], class153.field2386[3], class153.field2396[0], class153.field2396[1], class153.field2396[3], arg0.field2385[var11]);
                    } else {
                        class172.method1150(var18, var19, var20, var15, var16, var17, arg0.field2391[var11], arg0.field2390[var11], arg0.field2399[var11], class153.field2398[var12], class153.field2398[var13], class153.field2398[var14], class153.field2386[var12], class153.field2386[var13], class153.field2386[var14], class153.field2396[var12], class153.field2396[var13], class153.field2396[var14], arg0.field2385[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1920(int arg0) {
        field4570++;
        if (arg0 >= -11) {
            return;
        }
        for (int var1 = 0; var1 < class70.field1018; var1++) {
            int var2 = class208.field3323[var1];
            class35 var3 = class76.field1188[var2];
            int var4 = class192.field3042.method1420((byte) 0);
            if ((var4 & 0x1) != 0) {
                var4 += class192.field3042.method1420((byte) 0) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class192.field3042.method1410(true);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class192.field3042.method1398((byte) 110);
                class278.method1938(127, var6, var5, var3);
            }
            if ((var4 & 0x8) != 0) {
                var3.field814 = class192.field3042.method1454(true);
                if (var3.field814 == 65535) {
                    var3.field814 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class192.field3042.method1405(-123);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class192.field3042.method1419(79);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var9[var11] = var12;
                    var8[var11] = class192.field3042.method1398((byte) 110);
                    var10[var11] = class192.field3042.method1419(68);
                }
                class142.method947((byte) 48, var10, var9, var8, var3);
            }
            if ((var4 & 0x4) != 0) {
                int var13 = class192.field3042.method1405(-128);
                int var14 = class192.field3042.method1405(-128);
                var3.method352(70, var14, var13, class4.field32);
                var3.field885 = class4.field32 + 300;
                var3.field874 = class192.field3042.method1398((byte) 110);
            }
            if ((var4 & 0x2) != 0) {
                int var15 = class192.field3042.method1405(-121);
                int var16 = class192.field3042.method1398((byte) 110);
                var3.method352(70, var16, var15, class4.field32);
            }
            if ((var4 & 0x20) != 0) {
                int var17 = class192.field3042.method1455((byte) -99);
                if (var17 == 65535) {
                    var17 = -1;
                }
                boolean var18 = true;
                int var19 = class192.field3042.method1440(20404);
                if (var17 != -1 && var3.field870 != -1 && class196.method1359(class278.method1939(var17, (byte) -117).field1810, (byte) 21).field3173 < class196.method1359(class278.method1939(var3.field870, (byte) -97).field1810, (byte) 21).field3173) {
                    var18 = false;
                }
                if (var18) {
                    var3.field799 = 1;
                    var3.field827 = (var19 & 0xFFFF) + class4.field32;
                    var3.field870 = var17;
                    var3.field830 = 0;
                    var3.field829 = 0;
                    if (var3.field827 > class4.field32) {
                        var3.field829 = -1;
                    }
                    var3.field887 = var19 >> 16;
                    if (var3.field870 != -1 && class4.field32 == var3.field827) {
                        int var20 = class278.method1939(var3.field870, (byte) -114).field1810;
                        if (var20 != -1) {
                            class200 var21 = class196.method1359(var20, (byte) 21);
                            if (var21 != null && var21.field3167 != null) {
                                class49.method303(false, false, var3.field836, 0, var21, var3.field850);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field442.method690(0)) {
                    class48.method299(96, var3);
                }
                var3.method214(class145.method974(-85, class192.field3042.method1455((byte) -99)), (byte) -39);
                var3.method365(var3.field442.field1591, -17145);
                var3.field841 = var3.field442.field1644;
                var3.field807 = var3.field442.field1603;
                if (var3.field442.method690(0)) {
                    class16.method103(0, (class208) null, var3.field849[0], class165.field2600, var3.field804[0], 0, (class74) null, 128, var3);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field831 = class192.field3042.method1403(-127);
                var3.field852 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field892 = class192.field3042.method1454(true);
                var3.field803 = class192.field3042.method1454(true);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljk;IIIZ)V")
    public void method1586(class276 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4571++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public static final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4563++;
        if (class127.field1968 < 100) {
            class98.method639(107);
        }
        class62.method391(arg2, arg3, arg1 + arg2, arg3 + arg4);
        if (class127.field1968 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg2;
            int var7 = arg4 / 2 + arg3 - var5 - 18;
            class62.method380(arg2, arg3, arg1, arg4, 0);
            class62.method389(var6 - 152, var7, 304, 34, 9179409);
            class62.method380(var6 - 150, var7 + 2, class127.field1968 * 3, 30, 9179409);
            class202.field3227.method730(class19.field264, var6, var5 + var7, 16777215, -1);
            return;
        }
        class48.field661 = (int) ((float) (arg4 * 2) / class13.field172);
        class67.field979 = class44.field606 - ((int) ((float) arg4 / class13.field172));
        class284.field4749 = class187.field2897 - (int) ((float) arg1 / class13.field172);
        int var8 = class44.field606 - ((int) ((float) arg4 / class13.field172));
        int var9 = class187.field2897 - ((int) ((float) arg1 / class13.field172));
        class89.field1375 = (int) ((float) (arg1 * 2) / class13.field172);
        if (arg0 <= 89) {
            return;
        }
        int var10 = (int) ((float) arg1 / class13.field172) + class187.field2897;
        int var11 = class44.field606 + ((int) ((float) arg4 / class13.field172));
        class13.method76(var9, var8, var10, var11, arg2, arg3, arg1 + arg2, arg3 + arg4 + 1);
        class13.method67();
        class281 var12 = class13.method73();
        class100.method655(var12, 0, true, 0);
        if (class237.field3752 > 0) {
            class273.field4482--;
            if (class273.field4482 == 0) {
                class237.field3752--;
                class273.field4482 = 20;
            }
        }
        if (!class260.field4264) {
            return;
        }
        int var13 = arg2 + arg1 - 5;
        int var14 = arg4 + arg3 - 8;
        int var15 = 16776960;
        class48.field667.method728("Fps:" + class202.field3216, var13, var14, 16776960, -1);
        Runtime var16 = Runtime.getRuntime();
        int var18 = var14 - 15;
        int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
        if (var17 > 65536) {
            var15 = 16711680;
        }
        class48.field667.method728("Mem:" + var17 + "k", var13, var18, var15, -1);
        var14 = var18 - 15;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IIIII)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public abstract void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1922(byte arg0) {
        if (arg0 != -79) {
            method1922((byte) 39);
        }
        field4578 = null;
        field4575 = null;
        field4573 = null;
        field4572 = null;
        field4561 = null;
        field4577 = null;
        field4576 = null;
        field4567 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Ljk;")
    public class276 method1579(int arg0, int arg1, int arg2) {
        field4566++;
        return this;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()Z")
    public boolean method1599() {
        field4564++;
        return false;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()I")
    public abstract int method206();

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIZIIIBZLid;)Lh;")
    public static final class294 method1923(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7, class157 arg8) {
        field4562++;
        class132 var9 = class14.method92(arg1, false);
        if (arg5 > 1 && var9.field2035 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field2032[var11] <= arg5 && var9.field2032[var11] != 0) {
                    var10 = var9.field2035[var11];
                }
            }
            if (var10 != -1) {
                var9 = class14.method92(var10, false);
            }
        }
        class191 var12 = var9.method889(0, arg8);
        if (var12 == null) {
            return null;
        }
        class38 var13 = null;
        if (var9.field2068 != -1) {
            var13 = (class38) method1923(false, var9.field2094, true, 1, 0, 10, (byte) -110, true, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2087 != -1) {
            var13 = (class38) method1923(false, var9.field2045, true, arg3, arg4, arg5, (byte) 108, false, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class62.field932;
        int var15 = class62.field934;
        int var16 = class62.field936;
        int[] var17 = new int[4];
        class62.method400(var17);
        class38 var18 = new class38(36, 32);
        class62.method399(var18.field488, 36, 32);
        int var19 = -121 % ((62 - arg6) / 45);
        class172.method1139();
        class172.method1138(16, 16);
        class172.field2662 = false;
        int var20 = var9.field2091;
        if (arg7) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg3 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class172.field2658[var9.field2049] * var20 >> 16;
        int var22 = class172.field2669[var9.field2049] * var20 >> 16;
        var12.method1314(0, var9.field2038, var9.field2076, var9.field2049, var9.field2046, var9.field2061 + var22 - (var12.method206() / 2), var9.field2061 + var21, -1L);
        if (arg3 >= 1) {
            var18.method256(1);
            if (arg3 >= 2) {
                var18.method256(16777215);
            }
            class62.method399(var18.field488, 36, 32);
        }
        if (arg4 != 0) {
            var18.method247(arg4);
        }
        if (var9.field2068 != -1) {
            var13.method252(0, 0);
        } else if (var9.field2087 != -1) {
            class62.method399(var13.field488, 36, 32);
            var18.method252(0, 0);
            var18 = var13;
        }
        if (arg0 && (var9.field2050 == 1 || arg5 != 1) && arg5 != -1) {
            class74.field1142.method744(class196.method1360(10, arg5), 0, 9, 16776960, 1);
        }
        class62.method399(var14, var15, var16);
        class62.method403(var17);
        class172.method1139();
        class172.field2662 = true;
        return var18;
    }
}
