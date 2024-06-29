import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class190 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lad;")
    private class244 field2632 = new class244();

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field2637;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lbr;")
    private class223 field2630;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
    public static boolean field2645 = false;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2646 = "Examine";

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lqj;")
    public static class296 field2638;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field2652;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1261(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 6)
    public final void method1243(int arg0) {
        class189 var2 = (class189) this.field2632.method1527((byte) 84);
        if (arg0 != 1000) {
            return;
        }
        while (var2 != null) {
            if (var2.method1239(-1)) {
                var2.method2459(198);
                var2.method2788((byte) -118);
                this.field2637++;
            }
            var2 = (class189) this.field2632.method1532(-11786);
        }
        field2628++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I", line = 31)
    public final int method1244(int arg0) {
        field2642++;
        if (arg0 != 3) {
            field2645 = false;
        }
        return this.field2637;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLrg;I)V", line = 42)
    public static final void method1245(int arg0, byte arg1, class383 arg2, int arg3) {
        if (arg2.field5471 == 0) {
            arg2.field5428 = arg2.field5581;
        } else if (arg2.field5471 == 1) {
            arg2.field5428 = (arg3 - arg2.field5491) / 2 + arg2.field5581;
        } else if (arg2.field5471 == 2) {
            arg2.field5428 = arg3 - arg2.field5491 - arg2.field5581;
        } else if (arg2.field5471 == 3) {
            arg2.field5428 = arg2.field5581 * arg3 >> 14;
        } else if (arg2.field5471 == 4) {
            arg2.field5428 = (arg2.field5581 * arg3 >> 14) + (arg3 - arg2.field5491) / 2;
        } else {
            arg2.field5428 = arg3 - (arg2.field5491 + (arg2.field5581 * arg3 >> 14));
        }
        int var4 = -17 % ((22 - arg1) / 56);
        if (arg2.field5546 == 0) {
            arg2.field5470 = arg2.field5439;
        } else if (arg2.field5546 == 1) {
            arg2.field5470 = (arg0 - arg2.field5431) / 2 + arg2.field5439;
        } else if (arg2.field5546 == 2) {
            arg2.field5470 = arg0 - (arg2.field5439 + arg2.field5431);
        } else if (arg2.field5546 == 3) {
            arg2.field5470 = arg2.field5439 * arg0 >> 14;
        } else if (arg2.field5546 == 4) {
            arg2.field5470 = (arg0 - arg2.field5431) / 2 + (arg2.field5439 * arg0 >> 14);
        } else {
            arg2.field5470 = arg0 - arg2.field5431 - (arg2.field5439 * arg0 >> 14);
        }
        field2636++;
        if (!class280.field3829 || client.method1119(arg2).field3612 == 0 && arg2.field5488 != 0) {
            return;
        }
        if (arg2.field5470 < 0) {
            arg2.field5470 = 0;
        } else if (arg0 < (arg2.field5470 + arg2.field5431)) {
            arg2.field5470 = arg0 - arg2.field5431;
        }
        if (arg2.field5428 < 0) {
            arg2.field5428 = 0;
        } else if (arg2.field5491 + arg2.field5428 > arg3) {
            arg2.field5428 = arg3 - arg2.field5491;
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 117)
    public final Object method1246(byte arg0, long arg1) {
        if (arg0 >= -12) {
            this.field2632 = null;
        }
        field2640++;
        class189 var4 = (class189) this.field2630.method1412((byte) -54, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1242(-117);
        if (var5 == null) {
            var4.method2459(198);
            var4.method2788((byte) -107);
            this.field2637++;
            return null;
        }
        if (var4.method1239(-1)) {
            class237 var6 = new class237(var5);
            this.field2630.method1419(var4.field5363, 92, var6);
            this.field2632.method1530(var6, true);
            var6.field6446 = 0L;
            var4.method2459(198);
            var4.method2788((byte) -108);
        } else {
            this.field2632.method1530(var4, true);
            var4.field6446 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JBLjava/lang/Object;)V", line = 163)
    public final void method1247(long arg0, byte arg1, Object arg2) {
        field2650++;
        this.method1251(arg0, (byte) 46);
        if (this.field2637 == 0) {
            class189 var5 = (class189) this.field2632.method1533(-4174);
            var5.method2459(198);
            var5.method2788((byte) -109);
        } else {
            this.field2637--;
        }
        class237 var6 = new class237(arg2);
        this.field2630.method1419(arg0, 98, var6);
        this.field2632.method1530(var6, true);
        var6.field6446 = 0L;
        int var7 = 83 / ((-arg1 - 32) / 33);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 194)
    public final Object method1248(int arg0) {
        field2631++;
        class189 var2 = (class189) this.field2630.method1413(30381);
        if (arg0 != 2) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method1242(arg0 ^ 0xFFFFFFFE);
            if (var3 != null) {
                return var3;
            }
            class189 var4 = var2;
            var2 = (class189) this.field2630.method1420((byte) -62);
            var4.method2459(198);
            var4.method2788((byte) -107);
            this.field2637++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 229)
    public final void method1249(int arg0) {
        field2633++;
        this.field2632.method1529(-125);
        this.field2630.method1418((byte) -110);
        if (arg0 != 1) {
            field2634 = 100;
        }
        this.field2637 = this.field2629;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V", line = 320)
    public class190(int arg0) {
        this.field2629 = arg0;
        this.field2637 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2630 = new class223(var2);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I", line = 246)
    public final int method1250(boolean arg0) {
        field2643++;
        int var2 = 0;
        for (class189 var3 = (class189) this.field2632.method1527((byte) 84); var3 != null; var3 = (class189) this.field2632.method1532(-11786)) {
            if (!var3.method1239(-1)) {
                var2++;
            }
        }
        if (!arg0) {
            this.method1244(75);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JB)V", line = 271)
    private final void method1251(long arg0, byte arg1) {
        field2644++;
        if (arg1 != 46) {
            method1259(119, -87, -65, (byte) 36);
        }
        class189 var4 = (class189) this.field2630.method1412((byte) -54, arg0);
        if (var4 != null) {
            var4.method2459(198);
            var4.method2788((byte) -93);
            this.field2637++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)I", line = 290)
    public static final int method1252(int arg0, byte arg1, int arg2) {
        field2641++;
        int var3 = arg2 * 57 + arg0;
        int var4 = -8 / ((47 - arg1) / 53);
        int var5 = var3 ^ var3 << 13;
        int var6 = Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589;
        return (var6 & 0x7FB9379) >> 19;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V", line = 307)
    public static void method1253(boolean arg0) {
        field2646 = null;
        if (arg0) {
            method1253(true);
        }
        field2638 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V", line = 336)
    public final void method1254(int arg0, int arg1) {
        field2635++;
        if (class65.field1021 != null) {
            for (class189 var3 = (class189) this.field2632.method1527((byte) 84); var3 != null; var3 = (class189) this.field2632.method1532(-11786)) {
                if (var3.method1239(-1)) {
                    if (var3.method1242(5) == null) {
                        var3.method2459(198);
                        var3.method2788((byte) -102);
                        this.field2637++;
                    }
                } else if (++var3.field6446 > (long) arg0) {
                    class189 var4 = class65.field1021.method819(var3, (byte) 119);
                    this.field2630.method1419(var3.field5363, 53, var4);
                    class294.method1884(var4, var3, (byte) 92);
                    var3.method2459(198);
                    var3.method2788((byte) -102);
                }
            }
        }
        int var5 = 36 / ((60 - arg1) / 58);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)I", line = 383)
    public final int method1255(int arg0) {
        field2651++;
        if (arg0 <= 104) {
            field2634 = 87;
        }
        return this.field2629;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V", line = 394)
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2648++;
        if (arg0 >= 1 && arg3 >= 1 && class432.field6220 - 2 >= arg0 && arg3 <= class267.field3646 - 2) {
            if (!class67.method457(31862) && !class76.method542(client.field2349, arg0, arg8, (byte) -120, arg3)) {
                return;
            }
            if (class5.field79 == null) {
                return;
            }
            int var9 = arg8;
            if (arg8 < 3 && class199.method1326(arg3, arg0, (byte) 74)) {
                var9 = arg8 + 1;
            }
            class62.method418(var9, arg0, arg3, arg6, class24.field326[arg8], arg8, class408.field5920, (byte) 91);
            if (arg1 >= 0) {
                boolean var10 = class21.field280;
                class21.field280 = true;
                class196.method1311(class24.field326[arg8], arg5, arg2, false, class408.field5920, arg3, var9, arg0, false, arg7, -3, arg8, arg1);
                class21.field280 = var10;
            }
        }
        if (arg4 != 2) {
            method1253(false);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 439)
    public final Object method1257(byte arg0) {
        if (arg0 != -28) {
            this.method1249(74);
        }
        field2649++;
        class189 var2 = (class189) this.field2630.method1420((byte) 70);
        while (var2 != null) {
            Object var3 = var2.method1242(arg0 - 98);
            if (var3 != null) {
                return var3;
            }
            class189 var4 = var2;
            var2 = (class189) this.field2630.method1420((byte) -33);
            var4.method2459(198);
            var4.method2788((byte) -128);
            this.field2637++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lcn;I)V", line = 470)
    private static final void method1258(class300 arg0, int arg1) {
        arg0.field4157 = null;
        if (arg1 <= 84) {
            return;
        }
        field2639++;
        int var2 = arg0.field4152.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field4152[var3].field569 = false;
        }
        class357[] var4 = class327.field4463;
        synchronized (class327.field4463) {
            if (class327.field4463.length > var2 && class180.field2519[var2] < 200) {
                class327.field4463[var2].method2310(arg0, -12918);
                int var10002 = class180.field2519[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIB)Z", line = 498)
    public static final boolean method1259(int arg0, int arg1, int arg2, byte arg3) {
        field2647++;
        class161 var4 = (class161) class57.method381(arg0, arg2, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class445.method2777(0, var4);
        }
        class161 var6 = (class161) class32.method245(arg0, arg2, arg1, field2652 == null ? (field2652 = method1261("tr")) : field2652);
        if (arg3 < 22) {
            field2638 = null;
        }
        if (var6 != null) {
            var5 &= class445.method2777(0, var6);
        }
        class161 var7 = (class161) class207.method1350(arg0, arg2, arg1);
        if (var7 != null) {
            var5 &= class445.method2777(0, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Laa;IILci;III[[[B[I[I[I[I[IIBIIZ)V", line = 526)
    public static final void method1260(class281 arg0, int arg1, int arg2, class261 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class352.field4917 = arg0;
        class336.field4550 = arg1;
        class258.field3539 = arg3;
        class105.field1575 = class352.field4917.method1797() > 0;
        class451.field6574 = arg4 >> 7;
        class48.field738 = arg6 >> 7;
        class167.field2387 = arg4;
        class180.field2514 = arg6;
        class166.field2372 = arg5;
        class265.field3623 = class451.field6574 - class245.field3380;
        if (class265.field3623 < 0) {
            class8.field127 = -class265.field3623;
            class265.field3623 = 0;
        } else {
            class8.field127 = 0;
        }
        class179.field2506 = class48.field738 - class245.field3380;
        if (class179.field2506 < 0) {
            class299.field4136 = -class179.field2506;
            class179.field2506 = 0;
        } else {
            class299.field4136 = 0;
        }
        class350.field4887 = class451.field6574 + class245.field3380;
        if (class350.field4887 > class386.field5629) {
            class350.field4887 = class386.field5629;
        }
        class426.field6112 = class48.field738 + class245.field3380;
        if (class426.field6112 > class371.field5311) {
            class426.field6112 = class371.field5311;
        }
        for (int var18 = 0; var18 < class245.field3380 + class245.field3380 + 2; var18++) {
            for (int var23 = 0; var23 < class245.field3380 + class245.field3380 + 2; var23++) {
                int var24 = class451.field6574 + var18 - class245.field3380;
                int var25 = class48.field738 + var23 - class245.field3380;
                if (var24 >= 0 && var25 >= 0 && var24 < class386.field5629 && var25 < class371.field5311) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class156.field2213[3].method275(var24, var25) - 1000;
                    int var29 = class435.field6248 == null ? class156.field2213[0].method275(var24, var25) + 128 : class435.field6248[0].method275(var24, var25) + 128;
                    class4.field43[var18][var23] = class352.field4917.method1743(var26, var28, var27, var26, var29, var27);
                } else {
                    class4.field43[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class245.field3380 + class245.field3380 + 1; var19++) {
            for (int var22 = 0; var22 < class245.field3380 + class245.field3380 + 1; var22++) {
                class3.field39[var19][var22] = class4.field43[var19][var22] || class4.field43[var19 + 1][var22] || class4.field43[var19][var22 + 1] || class4.field43[var19 + 1][var22 + 1];
            }
        }
        class414.field6016 = arg8;
        class349.field4877 = arg9;
        class34.field539 = arg10;
        class142.field2028 = arg11;
        class221.field2914 = arg12;
        class398.method2575();
        class270.method1659(2);
        for (class300 var20 = (class300) class145.field2112.method2307(false); var20 != null; var20 = (class300) class145.field2112.method2311(-5116)) {
            var20.method2552(-1);
            method1258(var20, 109);
        }
        if (class105.field1575) {
            for (int var21 = 0; var21 < class155.field2185; var21++) {
                class84.field1302[var21].method2228((byte) 72, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class352.field4917.method1757(0);
            if (class165.field2357 == null || class165.field2357 instanceof class431) {
                class165.field2357 = new class247();
            }
        } else if (class165.field2357 == null || class165.field2357 instanceof class247) {
            class165.field2357 = new class431();
        }
        class165.field2357.method1157(arg2, (byte) 60);
        class165.field2357.method1152((byte) -94);
        if (class77.field1200 != null) {
            client.method1112(true);
            class165.field2357.method1161(0, 22);
            class435.method2727(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class165.field2357.method1152((byte) -81);
            class165.field2357.method1161(0, 23);
            client.method1112(false);
        }
        class435.method2727(arg2, arg7, arg13, arg14, arg15, arg16);
        class165.field2357.method1152((byte) -116);
        class165.field2357.method1153(-1);
        class165.field2357.method1152((byte) -114);
        if (arg2 > 1) {
            class352.field4917.method1798(0);
        }
        class352.field4917.method1745(0, (class107[]) null);
    }
}
