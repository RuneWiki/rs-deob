import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class212 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3010 = "cyan:";

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Z")
    public static boolean field3006;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1309(int arg0, int arg1) {
        if (arg0 != -4) {
            method1313(-120, 35, -38, -32, 99);
        }
        field3011++;
        class148.field1948 = arg1;
        class24 var2 = class132.field1770;
        synchronized (class132.field1770) {
            class132.field1770.method212(-118);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1310(boolean arg0) {
        if (arg0) {
            field3008 = -75;
        }
        field3010 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 35)
    public static final String method1311(int arg0, boolean arg1) {
        field3009++;
        if (!arg1) {
            return null;
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class74.field1001 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class40.field636 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1312(int arg0) {
        field3004++;
        if (class72.method446(28804) != 2) {
            return;
        }
        byte var1 = (byte) (class269.field3930 - 4 & 0xFF);
        int var2 = class269.field3930 % class324.field4652;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < class336.field4964; var17++) {
                class115.field1566[var3][var2][var17] = var1;
            }
        }
        int var4 = -94 % ((33 - arg0) / 50);
        if (class193.field2688 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class45.field665[var5] = -1000000;
            class86.field1192[var5] = 1000000;
            class156.field2045[var5] = 0;
            class207.field2978[var5] = 1000000;
            class224.field3166[var5] = 0;
        }
        if (class5.field48 != 1) {
            int var16 = class139.method935(class7.field71, 114, class237.field3326, class193.field2688);
            if ((var16 - class130.field1745) >= 800 || (class37.field606[class193.field2688][class237.field3326 >> 7][class7.field71 >> 7] & 0x4) == 0) {
                return;
            }
            class214.method1348(1, false, class343.field5032, -27508, class7.field71 >> 7, class237.field3326 >> 7);
            return;
        }
        if ((class37.field606[class193.field2688][class100.field1350.field5284 >> 7][class100.field1350.field5298 >> 7] & 0x4) != 0) {
            class214.method1348(0, false, class343.field5032, -27508, class100.field1350.field5298 >> 7, class100.field1350.field5284 >> 7);
        }
        if (class265.field3878 >= 2560) {
            return;
        }
        int var6 = class237.field3326 >> 7;
        int var7 = class7.field71 >> 7;
        int var8 = class100.field1350.field5284 >> 7;
        int var9 = class100.field1350.field5298 >> 7;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if ((var10 != 0 || var11 != 0) && var10 > (-class324.field4652) && var10 < class324.field4652 && var11 > (-class336.field4964) && var11 < class336.field4964) {
            if (var10 <= var11) {
                int var12 = var10 * 65536 / var11;
                int var13 = 32768;
                while (var7 != var9) {
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class37.field606[class193.field2688][var6][var7] & 0x4) != 0) {
                        class214.method1348(1, false, class343.field5032, -27508, var7, var6);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var6 < var8) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class37.field606[class193.field2688][var6][var7] & 0x4) != 0) {
                            class214.method1348(1, false, class343.field5032, -27508, var7, var6);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class37.field606[class193.field2688][var6][var7] & 0x4) != 0) {
                    class214.method1348(1, false, class343.field5032, -27508, var7, var6);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 < var9) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class37.field606[class193.field2688][var6][var7] & 0x4) != 0) {
                        class214.method1348(1, false, class343.field5032, -27508, var7, var6);
                        return;
                    }
                }
            }
            return;
        }
        class226.method1406("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class184.field2482 + "," + class38.field620, (Throwable) null, 0);
        return;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V", line = 260)
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3005++;
        class363 var5 = (class363) class157.field2069.method954(arg4 + 21087, (long) arg1);
        if (arg4 != -21180) {
            field3010 = null;
        }
        if (var5 == null) {
            var5 = new class363();
            class157.field2069.method956(false, (long) arg1, var5);
        }
        if (var5.field5302.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field5302.length; var8++) {
                var6[var8] = var5.field5302[var8];
                var7[var8] = var5.field5312[var8];
            }
            for (int var9 = var5.field5302.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field5312 = var7;
            var5.field5302 = var6;
        }
        var5.field5302[arg2] = arg3;
        var5.field5312[arg2] = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)I", line = 316)
    public static final int method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg1;
            arg1 = var8;
        }
        field3007++;
        if (var7 == 0) {
            return arg5;
        }
        if (arg3 != 65536) {
            method1313(-69, 26, -21, 98, -101);
        }
        if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return 7 + 1 - arg1 - arg0;
        }
    }
}
