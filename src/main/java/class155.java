import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class155 extends class400 {

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field2434 = -1;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2433 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "Lns;")
    public static class230 field2432 = new class230();

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)Lna;")
    public static final class30 method1089(int arg0, int arg1) {
        field2439++;
        if (arg1 == 0) {
            return new class448();
        } else if (arg1 == 1) {
            return new class217();
        } else if (arg1 == 2) {
            return new class372();
        } else if (arg1 == 3) {
            return new class287();
        } else if (arg1 == 4) {
            return new class61();
        } else if (arg1 == 5) {
            return new class258();
        } else if (arg1 == 6) {
            return new class424();
        } else if (arg1 == 7) {
            return new class441();
        } else if (arg1 == 8) {
            return new class421();
        } else if (arg1 == 9) {
            return new class131();
        } else if (arg1 == 10) {
            return new class411();
        } else if (arg1 == 11) {
            return new class414();
        } else if (arg1 == 12) {
            return new class60();
        } else if (arg1 == 13) {
            return new class373();
        } else if (arg1 == 14) {
            return new class178();
        } else if (arg1 == 15) {
            return new class246();
        } else if (arg1 == 16) {
            return new class140();
        } else if (arg1 == 17) {
            return new class36();
        } else if (arg1 == 18) {
            return new class64();
        } else if (arg1 == 19) {
            return new class41();
        } else if (arg1 == 20) {
            return new class38();
        } else if (arg1 == 21) {
            return new class396();
        } else if (arg1 == 22) {
            return new class291();
        } else if (arg1 == 23) {
            return new class316();
        } else if (arg1 == 24) {
            return new class390();
        } else if (arg1 == 25) {
            return new class323();
        } else if (arg1 == 26) {
            return new class31();
        } else if (arg1 == 27) {
            return new class12();
        } else if (arg1 == 28) {
            return new class263();
        } else if (arg1 == 29) {
            return new class430();
        } else if (arg1 == 30) {
            return new class79();
        } else if (arg1 == 31) {
            return new class288();
        } else if (arg1 == 32) {
            return new class298();
        } else if (arg1 == 33) {
            return new class433();
        } else if (arg1 == 34) {
            return new class358();
        } else if (arg1 == 35) {
            return new class35();
        } else if (arg1 == 36) {
            return new class376();
        } else if (arg1 == 37) {
            return new class238();
        } else if (arg1 == 38) {
            return new class19();
        } else if (arg1 == 39) {
            return new class314();
        } else {
            if (arg0 != -22) {
                method1092(true, -59);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIB)V")
    public static final void method1090(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == 0) {
            class402.field5992++;
            class11.field139.method2224(88, (byte) 0);
        }
        field2436++;
        if (arg0 == 1) {
            class11.field139.method2224(58, (byte) 0);
            class166.field2629++;
        }
        class11.field139.method1309(arg1 + class409.field6048, 126);
        int var4 = 122 % ((-arg3 - 34) / 46);
        class11.field139.method1312(class232.field3856[82] ? 1 : 0, -107);
        class11.field139.method1309(class444.field6481 + arg2, 124);
        class19.field254 = arg1;
        class132.field2062 = arg2;
        class357.field5460 = false;
        class375.method2394((byte) 23);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1091(byte arg0) {
        field2432 = null;
        field2433 = null;
        if (arg0 < 67) {
            method1093(32, 115, 106, -124, -4, -63, -33, 7);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)Lwp;")
    public static final class97 method1092(boolean arg0, int arg1) {
        field2437++;
        class52 var2 = class142.field2250;
        class97 var3;
        synchronized (class142.field2250) {
            if (!arg0) {
                field2434 = -66;
            }
            var3 = (class97) class142.field2250.method331((byte) 69, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class368.field5587.method2771(class27.method180(arg1, -19505), class249.method1724((byte) -104, arg1), 3);
        class97 var5 = new class97();
        var5.field1325 = arg1;
        if (var4 != null) {
            var5.method735(false, new class186(var4));
        }
        var5.method727(129);
        if (var5.field1291 != -1) {
            var5.method738(method1092(true, var5.field1293), (byte) -70, method1092(true, var5.field1291));
        }
        if (var5.field1296 != -1) {
            var5.method723(95, method1092(true, var5.field1296), method1092(arg0, var5.field1339));
        }
        if (!class190.field3107 && var5.field1320) {
            var5.field1370 = class430.field6332;
            var5.field1337 = false;
            var5.field1330 = class317.field4971;
            var5.field1332 = 0;
            var5.field1346 = class119.field1638;
            var5.field1361 = null;
        }
        class52 var6 = class142.field2250;
        synchronized (class142.field2250) {
            class142.field2250.method341(80, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2431++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg6 - arg4;
        int var12 = arg0 - arg4;
        int var13 = arg6 * arg6;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        if (arg2 != -15) {
            return;
        }
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        if (arg5 >= class99.field1378 && class396.field5925 >= arg5) {
            int[] var38 = class277.field4414[arg5];
            int var39 = class21.method153(arg7 - arg6, (byte) -68, class185.field3005, class406.field6033);
            int var40 = class21.method153(arg6 + arg7, (byte) -84, class185.field3005, class406.field6033);
            int var41 = class21.method153(arg7 - var11, (byte) -88, class185.field3005, class406.field6033);
            int var42 = class21.method153(arg7 + var11, (byte) -80, class185.field3005, class406.field6033);
            class256.method1769(var41, var38, (byte) 71, arg3, var39);
            class256.method1769(var42, var38, (byte) 62, arg1, var41);
            class256.method1769(var40, var38, (byte) 84, arg3, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class99.field1378 && var45 <= class396.field5925) {
                int var47 = class21.method153(arg7 + var8, (byte) -74, class185.field3005, class406.field6033);
                int var48 = class21.method153(arg7 - var8, (byte) -118, class185.field3005, class406.field6033);
                if (var44) {
                    int var49 = class21.method153(arg7 + var10, (byte) -104, class185.field3005, class406.field6033);
                    int var50 = class21.method153(arg7 - var10, (byte) -128, class185.field3005, class406.field6033);
                    if (var45 >= class99.field1378) {
                        int[] var51 = class277.field4414[var45];
                        class256.method1769(var50, var51, (byte) 64, arg3, var48);
                        class256.method1769(var49, var51, (byte) 85, arg1, var50);
                        class256.method1769(var47, var51, (byte) 127, arg3, var49);
                    }
                    if (var46 <= class396.field5925) {
                        int[] var52 = class277.field4414[var46];
                        class256.method1769(var50, var52, (byte) 81, arg3, var48);
                        class256.method1769(var49, var52, (byte) 54, arg1, var50);
                        class256.method1769(var47, var52, (byte) 126, arg3, var49);
                    }
                } else {
                    if (var45 >= class99.field1378) {
                        class256.method1769(var47, class277.field4414[var45], (byte) 124, arg3, var48);
                    }
                    if (class396.field5925 >= var46) {
                        class256.method1769(var47, class277.field4414[var46], (byte) 109, arg3, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjg;)V")
    public static final void method1094(byte arg0, class186 arg1) {
        field2435++;
        int var2 = arg1.method1299(-122);
        class298.field4730 = new class179[var2];
        int var3 = 0;
        if (arg0 > -63) {
            method1093(42, 51, -94, -30, -102, -7, -87, 53);
        }
        while (var3 < var2) {
            class298.field4730[var3] = new class179();
            class298.field4730[var3].field2924 = arg1.method1299(-115);
            class298.field4730[var3].field2930 = arg1.method1302(22284);
            var3++;
        }
        class30.field381 = arg1.method1299(-86);
        class199.field3217 = arg1.method1299(-120);
        class137.field2142 = arg1.method1299(-100);
        class41.field512 = new class231[class199.field3217 + 1 - class30.field381];
        for (int var4 = 0; var4 < class137.field2142; var4++) {
            int var5 = arg1.method1299(-82);
            class231 var6 = class41.field512[var5] = new class231();
            var6.field4060 = arg1.method1322(false);
            var6.field4055 = arg1.method1284(8388607);
            var6.field3849 = class30.field381 + var5;
            var6.field3844 = arg1.method1302(22284);
            var6.field3847 = arg1.method1302(22284);
        }
        class375.field5674 = arg1.method1284(8388607);
        class137.field2141 = true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V")
    public static final void method1095(int arg0, boolean arg1) {
        class11.field139.method2224(arg0, (byte) 0);
        class351.field5421++;
        field2438++;
        for (class196 var2 = (class196) class392.field5891.method1776(true); var2 != null; var2 = (class196) class392.field5891.method1773(-1)) {
            if (!var2.method1123((byte) 88)) {
                var2 = (class196) class392.field5891.method1776(true);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field3177 == 0) {
                class140.method1020(true, false, arg1, var2);
            }
        }
        if (class143.field2262 != null) {
            class336.method2219((byte) 6, class143.field2262);
            class143.field2262 = null;
        }
    }
}
