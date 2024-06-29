import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class31 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
    public static int[] field323 = new int[1000];

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field327 = -1;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "F")
    public static float field326;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILoq;IIILwq;ILgh;)V")
    public static final void method198(int arg0, class156 arg1, int arg2, int arg3, int arg4, class378 arg5, int arg6, class350 arg7) {
        field322++;
        class407 var8 = new class407();
        var8.field6155 = arg4 << 7;
        var8.field6159 = arg0;
        if (arg6 != 1) {
            field326 = 0.81774646F;
        }
        var8.field6160 = arg3 << 7;
        if (arg1 != null) {
            var8.field6157 = arg1;
            int var9 = arg1.field2139;
            int var10 = arg1.field2123;
            if (arg2 == 1 || arg2 == 3) {
                var9 = arg1.field2123;
                var10 = arg1.field2139;
            }
            var8.field6161 = arg1.field2146;
            var8.field6147 = arg3 + var10 << 7;
            var8.field6146 = arg1.field2097;
            var8.field6154 = arg1.field2144 << 7;
            var8.field6162 = arg1.field2107;
            var8.field6143 = arg1.field2070;
            var8.field6164 = arg1.field2140;
            var8.field6163 = arg4 + var9 << 7;
            if (arg1.field2134 != null) {
                var8.field6156 = true;
                var8.method2608(arg6 - 1);
            }
            if (var8.field6161 != null) {
                var8.field6151 = var8.field6146 + ((int) ((double) (var8.field6164 - var8.field6146) * Math.random()));
            }
            class541.field7904.method2124(var8, (byte) 94);
        } else if (arg5 != null) {
            var8.field6149 = arg5;
            class191 var11 = arg5.field5809;
            if (var11.field2798 != null) {
                var8.field6156 = true;
                var11 = var11.method1190(arg6 - 2, class96.field1394);
            }
            if (var11 != null) {
                var8.field6147 = var11.field2809 + arg3 << 7;
                var8.field6163 = var11.field2809 + arg4 << 7;
                var8.field6162 = class316.method2109(arg5, (byte) 79);
                var8.field6143 = var11.field2789;
                var8.field6154 = var11.field2778 << 7;
            }
            class354.field5492.method2124(var8, (byte) 96);
        } else if (arg7 != null) {
            var8.field6165 = arg7;
            var8.field6163 = arg4 + arg7.method415(-4) << 7;
            var8.field6147 = arg3 + arg7.method415(-4) << 7;
            var8.field6162 = class41.method250(arg7, -6);
            var8.field6143 = arg7.field5459;
            var8.field6154 = arg7.field5439 << 7;
            class249.field4049.method1127(var8, (byte) 58, (long) arg7.field847);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method199(byte arg0) {
        if (arg0 == -95) {
            field323 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field324++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
    public static final boolean method200(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class520.field7705; var3++) {
            class135 var4 = class376.field5778[var3];
            if (var4.field1831 == 1) {
                int var5 = var4.field1834 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1829 * var5 >> 8) + var4.field1832;
                    int var7 = (var4.field1819 * var5 >> 8) + var4.field1825;
                    int var8 = (var4.field1837 * var5 >> 8) + var4.field1816;
                    int var9 = (var4.field1833 * var5 >> 8) + var4.field1836;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1831 == 2) {
                int var10 = arg0 - var4.field1834;
                if (var10 > 0) {
                    int var11 = (var4.field1829 * var10 >> 8) + var4.field1832;
                    int var12 = (var4.field1819 * var10 >> 8) + var4.field1825;
                    int var13 = (var4.field1837 * var10 >> 8) + var4.field1816;
                    int var14 = (var4.field1833 * var10 >> 8) + var4.field1836;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1831 == 3) {
                int var15 = var4.field1832 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1821 * var15 >> 8) + var4.field1834;
                    int var17 = (var4.field1817 * var15 >> 8) + var4.field1828;
                    int var18 = (var4.field1837 * var15 >> 8) + var4.field1816;
                    int var19 = (var4.field1833 * var15 >> 8) + var4.field1836;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1831 == 4) {
                int var20 = arg2 - var4.field1832;
                if (var20 > 0) {
                    int var21 = (var4.field1821 * var20 >> 8) + var4.field1834;
                    int var22 = (var4.field1817 * var20 >> 8) + var4.field1828;
                    int var23 = (var4.field1837 * var20 >> 8) + var4.field1816;
                    int var24 = (var4.field1833 * var20 >> 8) + var4.field1836;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1831 == 5) {
                int var25 = arg1 - var4.field1816;
                if (var25 > 0) {
                    int var26 = (var4.field1821 * var25 >> 8) + var4.field1834;
                    int var27 = (var4.field1817 * var25 >> 8) + var4.field1828;
                    int var28 = (var4.field1829 * var25 >> 8) + var4.field1832;
                    int var29 = (var4.field1819 * var25 >> 8) + var4.field1825;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
    public static final void method201(byte arg0) {
        class89.method610(10, (byte) -66);
        field328++;
        if (arg0 != -33) {
            field323 = null;
        }
        class319.method2138((byte) -124);
        System.gc();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIIII)V")
    public static final void method202(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field329++;
        if (arg4 >= class462.field7105 && class222.field3750 >= arg4) {
            int var5 = class405.method2598(class460.field7096, class178.field2609, arg3, (byte) 107);
            int var6 = class405.method2598(class460.field7096, class178.field2609, arg1, (byte) 109);
            class213.method1584(var5, arg2, -109, var6, arg4);
        }
        if (arg0 < 57) {
            method200(-44, 112, -93);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lza;BII)V")
    public static final void method203(class497 arg0, byte arg1, int arg2, int arg3) {
        field325++;
        if (arg2 < 0 || arg3 < 0 || class346.field5391 == 0 || class398.field6014 == 0) {
            return;
        }
        arg0.method1277(class201.field3059, class321.field4985, class346.field5391, class398.field6014);
        arg0.method1307(class506.field7569, class358.field5550, class346.field5391, class398.field6014);
        class205 var4 = arg0.method1254();
        var4.method165(class304.field4789, class274.field4359, class7.field80, class54.field785, class316.field4934, class384.field5881);
        if (arg1 != -122) {
            return;
        }
        arg0.method1314(var4);
        if (class244.field3956 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method1298();
            int var8 = (arg2 - class201.field3059) * var7 / class346.field5391;
            int var9 = (arg3 - class321.field4985) * var7 / class398.field6014;
            int var10 = arg0.method1259();
            int var11 = (arg2 - class201.field3059) * var10 / class346.field5391;
            int var12 = (arg3 - class321.field4985) * var10 / class398.field6014;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method159(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method159(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class135.field1839 > var20 && var22 < class197.field3038) {
                    int var23 = class358.field5565.field6419;
                    if (var23 < 3 && (class416.field6309[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class244.field3956[var23].method692(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class358.field5565.method415(-4) - 1 << 6) >> 7;
                        var6 = var21 + (class358.field5565.method415(arg1 ^ 0x7A) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class128.field1732 && (class535.field7838 & 0x40) != 0) {
                    class437 var24 = class24.method150(true, field327, class398.field6007);
                    if (var24 == null) {
                        class497.method3038(arg1 + 201);
                    } else {
                        class279.method1875(0L, var6, true, false, " ->", -1, var5, class427.field6450, -55, 25, class186.field2716);
                    }
                } else {
                    if (class516.field7674 == class261.field4216) {
                        class279.method1875(0L, var6, true, false, "", -1, var5, class305.field4794.method1583(arg1 ^ 0xFFFFFFF9, class12.field131), -112, 60, -1);
                    }
                    class279.method1875(0L, var6, true, false, "", -1, var5, class390.field5930, -121, 47, class372.field5717);
                    class240.field3911++;
                }
            }
        }
        class410 var25 = class92.field1348;
        for (class514 var26 = (class514) var25.method2616(255); var26 != null; var26 = (class514) var25.method2619(255)) {
            if ((class290.field4577 || class358.field5565.field6419 == var26.field7622) && var26.method3096(arg0, arg2, (byte) -16, arg3)) {
                if (var26.field7625 instanceof class350) {
                    class350 var27 = (class350) var26.field7625;
                    int var28 = var27.method415(-4);
                    if ((var28 & 0x1) == 0 && (var27.field6417 & 0x7F) == 0 && (var27.field6410 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6417 & 0x7F) == 64 && (var27.field6410 & 0x7F) == 64) {
                        int var29 = var27.field6417 - (var27.method415(-4) - 1 << 6);
                        int var30 = var27.field6410 - (var27.method415(-4) - 1 << 6);
                        for (int var31 = 0; var31 < class378.field5815; var31++) {
                            class38 var38 = (class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var31]);
                            if (var38 != null) {
                                class378 var39 = var38.field378;
                                if (class88.field1278 != var39.field860 && var39.field816) {
                                    int var40 = var39.field6417 - (var39.field5809.field2809 - 1 << 6);
                                    int var41 = var39.field6410 - (var39.field5809.field2809 - 1 << 6);
                                    if (var29 <= var40 && var39.field5809.field2809 <= (var27.method415(-4) - (var40 - var29 >> 7)) && var30 <= var41 && var39.field5809.field2809 <= var27.method415(-4) - (var41 - var30 >> 7)) {
                                        class15.method83(true, class358.field5565.field6419 != var26.field7622, var39);
                                        var39.field860 = class88.field1278;
                                    }
                                }
                            }
                        }
                        int var32 = class234.field3861;
                        int[] var33 = class21.field245;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class350 var35 = class264.field4276[var33[var34]];
                            if (var35 != null && class88.field1278 != var35.field860 && var27 != var35 && var35.field816) {
                                int var36 = var35.field6417 - (var35.method415(-4) - 1 << 6);
                                int var37 = var35.field6410 - (var35.method415(-4) - 1 << 6);
                                if (var36 >= var29 && var35.method415(-4) <= (var27.method415(arg1 ^ 0x7A) - (var36 - var29 >> 7)) && var37 >= var30 && var35.method415(-4) <= var27.method415(-4) - (var37 - var30 >> 7)) {
                                    class286.method1931(-15269, var35, class358.field5565.field6419 != var26.field7622);
                                    var35.field860 = class88.field1278;
                                }
                            }
                        }
                    }
                    if (class88.field1278 == var27.field860) {
                        continue;
                    }
                    class286.method1931(-15269, var27, class358.field5565.field6419 != var26.field7622);
                    var27.field860 = class88.field1278;
                }
                if (var26.field7625 instanceof class378) {
                    class378 var42 = (class378) var26.field7625;
                    if (var42.field5809 != null) {
                        if ((var42.field5809.field2809 & 0x1) == 0 && (var42.field6417 & 0x7F) == 0 && (var42.field6410 & 0x7F) == 0 || (var42.field5809.field2809 & 0x1) == 1 && (var42.field6417 & 0x7F) == 64 && (var42.field6410 & 0x7F) == 64) {
                            int var43 = var42.field6417 - (var42.field5809.field2809 - 1 << 6);
                            int var44 = var42.field6410 - (var42.field5809.field2809 - 1 << 6);
                            for (int var45 = 0; var45 < class378.field5815; var45++) {
                                class38 var52 = (class38) class365.field5659.method1122((byte) 59, (long) class81.field1198[var45]);
                                if (var52 != null) {
                                    class378 var53 = var52.field378;
                                    if (class88.field1278 != var53.field860 && var42 != var53 && var53.field816) {
                                        int var54 = var53.field6417 - (var53.field5809.field2809 - 1 << 6);
                                        int var55 = var53.field6410 - (var53.field5809.field2809 - 1 << 6);
                                        if (var54 >= var43 && (var42.field5809.field2809 - (var54 - var43 >> 7)) >= var53.field5809.field2809 && var44 <= var55 && (var42.field5809.field2809 - (var55 - var44 >> 7)) >= var53.field5809.field2809) {
                                            class15.method83(true, class358.field5565.field6419 != var26.field7622, var53);
                                            var53.field860 = class88.field1278;
                                        }
                                    }
                                }
                            }
                            int var46 = class234.field3861;
                            int[] var47 = class21.field245;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class350 var49 = class264.field4276[var47[var48]];
                                if (var49 != null && class88.field1278 != var49.field860 && var49.field816) {
                                    int var50 = var49.field6417 - (var49.method415(arg1 + 118) - 1 << 6);
                                    int var51 = var49.field6410 - (var49.method415(-4) - 1 << 6);
                                    if (var50 >= var43 && var49.method415(-4) <= var42.field5809.field2809 - (var50 - var43 >> 7) && var51 >= var44 && var49.method415(arg1 + 118) <= (var42.field5809.field2809 - (var51 - var44 >> 7))) {
                                        class286.method1931(arg1 - 15147, var49, class358.field5565.field6419 != var26.field7622);
                                        var49.field860 = class88.field1278;
                                    }
                                }
                            }
                        }
                        if (class88.field1278 == var42.field860) {
                            continue;
                        }
                        class15.method83(true, class358.field5565.field6419 != var26.field7622, var42);
                        var42.field860 = class88.field1278;
                    }
                }
                if (var26.field7625 instanceof class466) {
                    int var56 = class453.field7018 + var26.field7624;
                    int var57 = class126.field1718 + var26.field7621;
                    class257 var58 = (class257) class328.field5157.method1122((byte) 59, (long) (var26.field7622 << 28 | var57 << 14 | var56));
                    if (var58 != null) {
                        for (class454 var59 = (class454) var58.field4153.method2125(18007); var59 != null; var59 = (class454) var58.field4153.method2117(-52)) {
                            class196 var60 = class337.field5262.method2077((byte) -65, var59.field7033);
                            if (!class128.field1732) {
                                if (class358.field5565.field6419 == var26.field7622) {
                                    String[] var62 = var60.field3011;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            int var65 = class460.field7099;
                                            if (var63 == 0) {
                                                var64 = 15;
                                            }
                                            if (var63 == 1) {
                                                var64 = 3;
                                            }
                                            if (var63 == 2) {
                                                var64 = 57;
                                            }
                                            if (var63 == 3) {
                                                var64 = 23;
                                            }
                                            if (var60.field3003 == var63) {
                                                var65 = var60.field3007;
                                            }
                                            if (var63 == 4) {
                                                var64 = 44;
                                            }
                                            if (var60.field2964 == var63) {
                                                var65 = var60.field3006;
                                            }
                                            class279.method1875((long) var59.field7033, var26.field7621, true, false, "<col=ff9040>" + var60.field3034, -1, var26.field7624, var62[var63], -41, var64, var65);
                                            class348.field5400++;
                                        }
                                    }
                                }
                                class216.field3669++;
                                class279.method1875((long) var59.field7033, var26.field7621, true, class358.field5565.field6419 != var26.field7622, "<col=ff9040>" + var60.field3034, -1, var26.field7624, class385.field5896.method1583(94, class12.field131), -81, 1006, class511.field7604);
                            } else if (class358.field5565.field6419 == var26.field7622) {
                                class442 var61 = class231.field3822 == -1 ? null : class274.field4353.method1171((byte) 82, class231.field3822);
                                if ((class535.field7838 & 0x1) != 0 && (var61 == null || var60.method1350(var61.field6872, (byte) 72, class231.field3822) != var61.field6872)) {
                                    class279.method1875((long) var59.field7033, var26.field7621, true, false, class283.field4459 + " -> <col=ff9040>" + var60.field3034, -1, var26.field7624, class427.field6450, -88, 45, class186.field2716);
                                    class407.field6153++;
                                }
                            }
                        }
                    }
                }
                if (var26.field7625 instanceof class267) {
                    class267 var66 = (class267) var26.field7625;
                    class156 var67 = class454.field7029.method3002(arg1 ^ 0x79, var66.method96((byte) 112));
                    if (var67.field2134 != null) {
                        var67 = var67.method962((byte) 69, class96.field1394);
                    }
                    if (var67 != null) {
                        if (!class128.field1732) {
                            if (class358.field5565.field6419 == var26.field7622) {
                                String[] var68 = var67.field2068;
                                if (var68 != null) {
                                    for (int var69 = 4; var69 >= 0; var69--) {
                                        if (var68[var69] != null) {
                                            short var70 = 0;
                                            int var71 = class460.field7099;
                                            if (var69 == 0) {
                                                var70 = 51;
                                            }
                                            if (var69 == 1) {
                                                var70 = 50;
                                            }
                                            if (var69 == 2) {
                                                var70 = 9;
                                            }
                                            if (var69 == 3) {
                                                var70 = 12;
                                            }
                                            if (var67.field2065 == var69) {
                                                var71 = var67.field2128;
                                            }
                                            if (var69 == 4) {
                                                var70 = 1002;
                                            }
                                            if (var67.field2136 == var69) {
                                                var71 = var67.field2131;
                                            }
                                            class504.field7537++;
                                            class279.method1875(class270.method1833(var26.field7624, var26.field7621, var66, (byte) -84), var26.field7621, true, false, "<col=00ffff>" + var67.field2083, -1, var26.field7624, var68[var69], -102, var70, var71);
                                        }
                                    }
                                }
                            }
                            class273.field4345++;
                            class279.method1875((long) var67.field2082, var26.field7621, true, class358.field5565.field6419 != var26.field7622, "<col=00ffff>" + var67.field2083, -1, var26.field7624, class385.field5896.method1583(115, class12.field131), -122, 1007, class511.field7604);
                        } else if (class358.field5565.field6419 == var26.field7622) {
                            class442 var72 = class231.field3822 == -1 ? null : class274.field4353.method1171((byte) 82, class231.field3822);
                            if ((class535.field7838 & 0x4) != 0 && (var72 == null || var67.method947(var72.field6872, false, class231.field3822) != var72.field6872)) {
                                class387.field5907++;
                                class279.method1875(class270.method1833(var26.field7624, var26.field7621, var66, (byte) -114), var26.field7621, true, false, class283.field4459 + " -> <col=00ffff>" + var67.field2083, -1, var26.field7624, class427.field6450, -68, 2, class186.field2716);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(II)V")
    public class31(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lot;Lce;)V")
    public static final void method204(class506 arg0, class409 arg1) {
        if (!arg1.field6191) {
            return;
        }
        short var2 = arg1.field6185;
        short var3 = arg1.field6194;
        byte var4 = arg1.field6182;
        byte var5 = arg1.field6174;
        int var6 = (var2 << class56.field908) + class376.field5781;
        int var7 = (var3 << class56.field908) + class376.field5781;
        class409[][] var8 = class217.field3699[var4];
        float var9;
        if (class53.field732 == class103.field1520) {
            class104.field1523.method1321(class244.field3956[0].method692(var6, var7), class153.method935(var2, var3), class334.method2220(var2, var3), class154.method939(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class104.field1523.method1309(3000.0F, var9 * 1.5F);
        if (arg1.field6187) {
            if (class53.field723) {
                if (var4 > 0) {
                    class409 var10 = class217.field3699[var4 - 1][var2][var3];
                    if (var10 != null && var10.field6191) {
                        return;
                    }
                }
                if (var2 <= class192.field2847 && var2 > class363.field5620) {
                    class409 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field6191 && (var11.field6187 || (arg1.field6193 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class192.field2847 && var2 < class315.field4928 - 1) {
                    class409 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field6191 && (var12.field6187 || (arg1.field6193 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class241.field3919 && var3 > class197.field3041) {
                    class409 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field6191 && (var13.field6187 || (arg1.field6193 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class241.field3919 && var3 < class529.field7781 - 1) {
                    class409 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field6191 && (var14.field6187 || (arg1.field6193 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class53.field723 = true;
            }
            arg1.field6187 = false;
            if (arg1.field6195 != null) {
                class409 var15 = arg1.field6195;
                class104.field1523.method1309(3000.0F, (201.5F - (float) (var15.field6174 + 1) * 50.0F) * 1.5F);
                if (!class216.method1591(var15.field6174, var2, var3)) {
                    class53.field732[var15.field6174].method699(var2, var3);
                }
                class477 var16 = var15.field6180;
                if (var16 != null) {
                    if (class310.field4858) {
                        if ((var16.field7302 & arg1.field6179) == 0) {
                            class91.method635(arg0, var4, var2, var3);
                        } else {
                            class341.method2262(arg0, var16.field7302, var5, var2, var3);
                        }
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    var16.method108(2, class104.field1523);
                }
                for (class192 var17 = var15.field6175; var17 != null; var17 = var17.field2841) {
                    class423 var18 = var17.field2845;
                    if (var18 != null) {
                        if (class310.field4858) {
                            class91.method635(arg0, var4, var2, var3);
                            class104.field1523.method1242(arg0.field7561, arg0.field7563);
                        }
                        var18.method108(2, class104.field1523);
                    }
                }
                class104.field1523.method1309(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class216.method1591(var5, var2, var3);
            if (var19) {
                class53.field732[var5].method699(var2, var3);
                class12 var20 = arg1.field6176;
                if (var20 != null && var20.field127) {
                    if (var20.field122) {
                        class104.field1523.method1309(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var21 = var20.method108(2, class104.field1523);
                    if (var21 != null) {
                        var21.field7625 = var20;
                        var21.field7622 = var4;
                        var21.field7624 = var2;
                        var21.field7621 = var3;
                        class92.field1348.method2625(var21, 0);
                    }
                    if (var20.field122) {
                        class104.field1523.method1309(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class477 var24 = arg1.field6180;
            class304 var25 = arg1.field6189;
            if (var24 != null || var25 != null) {
                if (class192.field2847 == var2) {
                    var22++;
                } else if (class192.field2847 < var2) {
                    var22 += 2;
                }
                if (class241.field3919 == var3) {
                    var22 += 3;
                } else if (class241.field3919 > var3) {
                    var22 += 6;
                }
                var23 = class289.field4573[var22];
                arg1.field6179 = class490.field7420[var22];
            }
            if (var24 != null) {
                if ((var24.field7302 & class72.field1089[var22]) == 0) {
                    arg1.field6177 = 0;
                } else if (var24.field7302 == 16) {
                    arg1.field6177 = 3;
                    arg1.field6190 = class305.field4801[var22];
                    arg1.field6197 = (byte) (3 - arg1.field6190);
                } else if (var24.field7302 == 32) {
                    arg1.field6177 = 6;
                    arg1.field6190 = class189.field2762[var22];
                    arg1.field6197 = (byte) (6 - arg1.field6190);
                } else if (var24.field7302 == 64) {
                    arg1.field6177 = 12;
                    arg1.field6190 = class454.field7024[var22];
                    arg1.field6197 = (byte) (12 - arg1.field6190);
                } else {
                    arg1.field6177 = 9;
                    arg1.field6190 = class196.field3027[var22];
                    arg1.field6197 = (byte) (9 - arg1.field6190);
                }
                if ((var24.field7302 & var23) != 0 && !class519.method3111(var5, var2, var3, var24.field7302)) {
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var26 = var24.method108(2, class104.field1523);
                    if (var26 != null) {
                        var26.field7625 = var24;
                        var26.field7622 = var4;
                        var26.field7624 = var2;
                        var26.field7621 = var3;
                        class92.field1348.method2625(var26, 0);
                    }
                }
                class477 var27 = arg1.field6188;
                if (var27 != null && (var27.field7302 & var23) != 0 && !class519.method3111(var5, var2, var3, var27.field7302)) {
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var28 = var27.method108(2, class104.field1523);
                    if (var28 != null) {
                        var28.field7625 = var27;
                        var28.field7622 = var4;
                        var28.field7624 = var2;
                        var28.field7621 = var3;
                        class92.field1348.method2625(var28, 0);
                    }
                }
            }
            if (var25 != null && !class325.method2175(var5, var2, var3, var25.method98(0))) {
                class304 var29 = arg1.field6192;
                class104.field1523.method1309(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field4786 & var23) != 0) {
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var30 = var25.method108(2, class104.field1523);
                    if (var30 != null) {
                        var30.field7625 = var25;
                        var30.field7622 = var4;
                        var30.field7624 = var2;
                        var30.field7621 = var3;
                        class92.field1348.method2625(var30, 0);
                    }
                } else if (var25.field4786 == 256) {
                    int var31 = var25.field4788 - class329.field5178;
                    int var32 = var25.field4790 - class32.field331;
                    int var33 = var25.field4791;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    if (var35 < var34) {
                        class514 var36 = var25.method108(2, class104.field1523);
                        if (var36 != null) {
                            var36.field7625 = var25;
                            var36.field7622 = var4;
                            var36.field7624 = var2;
                            var36.field7621 = var3;
                            class92.field1348.method2625(var36, 0);
                        }
                    } else if (var29 != null) {
                        class514 var37 = var29.method108(2, class104.field1523);
                        if (var37 != null) {
                            var37.field7625 = var29;
                            var37.field7622 = var4;
                            var37.field7624 = var2;
                            var37.field7621 = var3;
                            class92.field1348.method2625(var37, 0);
                        }
                    }
                }
                class104.field1523.method1309(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class12 var38 = arg1.field6176;
                if (var38 != null && !var38.field127) {
                    if (var38.field122) {
                        class104.field1523.method1309(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var39 = var38.method108(2, class104.field1523);
                    if (var39 != null) {
                        var39.field7625 = var38;
                        var39.field7622 = var4;
                        var39.field7624 = var2;
                        var39.field7621 = var3;
                        class92.field1348.method2625(var39, 0);
                    }
                    if (var38.field122) {
                        class104.field1523.method1309(3000.0F, var9 * 1.5F);
                    }
                }
                class528 var40 = arg1.field6186;
                if (var40 != null && !var40.field7771) {
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var41 = var40.method108(2, class104.field1523);
                    if (var41 != null) {
                        var41.field7625 = var40;
                        var41.field7622 = var4;
                        var41.field7624 = var2;
                        var41.field7621 = var3;
                        class92.field1348.method2625(var41, 0);
                    }
                }
            }
            byte var42 = arg1.field6193;
            if (var42 != 0) {
                if (var2 < class192.field2847 && (var42 & 0x4) != 0) {
                    class409 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field6191) {
                        class409.field6200.method911(72, var43);
                    }
                }
                if (var3 < class241.field3919 && (var42 & 0x2) != 0) {
                    class409 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field6191) {
                        class409.field6200.method911(69, var44);
                    }
                }
                if (var2 > class192.field2847 && (var42 & 0x1) != 0) {
                    class409 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field6191) {
                        class409.field6200.method911(95, var45);
                    }
                }
                if (var3 > class241.field3919 && (var42 & 0x8) != 0) {
                    class409 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field6191) {
                        class409.field6200.method911(120, var46);
                    }
                }
            }
        }
        if (arg1.field6177 != 0) {
            boolean var47 = true;
            for (class192 var48 = arg1.field6175; var48 != null; var48 = var48.field2841) {
                if (class397.field5998 != var48.field2845.field6411 && (var48.field2849 & arg1.field6177) == arg1.field6190) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class477 var49 = arg1.field6180;
                if (!class519.method3111(var5, var2, var3, var49.field7302)) {
                    if (class310.field4858) {
                        label682: {
                            if (var49.field7302 >= 16) {
                                int var50 = var2 - class192.field2847;
                                int var51 = var3 - class241.field3919;
                                if (var49.field7302 == 16) {
                                    int var52 = var50 - class376.field5781;
                                    int var53 = class376.field5781 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class131.field1773) {
                                        class91.method635(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7302 == 32) {
                                    int var54 = class376.field5781 + var50;
                                    int var55 = class376.field5781 + var51;
                                    if (var55 < -var54 && var2 < class252.field4075 && var3 < class131.field1773) {
                                        class91.method635(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7302 == 64) {
                                    int var56 = class376.field5781 + var50;
                                    int var57 = var51 - class376.field5781;
                                    if (var57 > var56 && var2 < class252.field4075 && var3 > 0) {
                                        class91.method635(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field7302 == 128) {
                                    int var58 = var50 - class376.field5781;
                                    int var59 = var51 - class376.field5781;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class91.method635(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class91.method635(arg0, var4, var2, var3);
                        }
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var60 = var49.method108(2, class104.field1523);
                    if (var60 != null) {
                        var60.field7625 = var49;
                        var60.field7622 = var4;
                        var60.field7624 = var2;
                        var60.field7621 = var3;
                        class92.field1348.method2625(var60, 0);
                    }
                }
                arg1.field6177 = 0;
            }
        }
        if (arg1.field6198) {
            try {
                arg1.field6198 = false;
                int var61 = 0;
                label625: for (class192 var62 = arg1.field6175; var62 != null; var62 = var62.field2841) {
                    class423 var63 = var62.field2845;
                    if (class397.field5998 != var63.field6411) {
                        for (int var64 = var63.field6423; var64 <= var63.field6420; var64++) {
                            for (int var65 = var63.field6424; var65 <= var63.field6418; var65++) {
                                class409 var66 = var8[var64][var65];
                                if (var66.field6187) {
                                    arg1.field6198 = true;
                                    continue label625;
                                }
                                if (var66.field6177 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6423) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6420) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6424) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6418) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field6177) == arg1.field6197) {
                                        arg1.field6198 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class192.field2847 - var63.field6423;
                        int var69 = var63.field6420 - class192.field2847;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class241.field3919 - var63.field6424;
                        int var71 = var63.field6418 - class241.field3919;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field7564[var61] = var63;
                        arg0.field7565[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class423 var75 = arg0.field7564[var74];
                        if (class397.field5998 != var75.field6411) {
                            int var76 = arg0.field7565[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6417 - class329.field5178;
                                int var78 = var75.field6410 - class32.field331;
                                int var79 = arg0.field7564[var73].field6417 - class329.field5178;
                                int var80 = arg0.field7564[var73].field6410 - class32.field331;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class423 var81 = arg0.field7564[var73];
                    var81.field6411 = class397.field5998;
                    if (!class17.method93(var5, var81.field6423, var81.field6420, var81.field6424, var81.field6418, var81.method1596(true))) {
                        if (class310.field4858) {
                            if (var81.field6416 == 0) {
                                class218.method1601(arg0, var4, var81.field6423, var81.field6424, var81.field6420, var81.field6418);
                            } else {
                                class91.method635(arg0, var4, var2, var3);
                                int var82 = var2 - class192.field2847;
                                int var83 = var3 - class241.field3919;
                                if (var81.field6416 == 2) {
                                    if (var83 > -var82) {
                                        class232.method1653(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class232.method1653(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class232.method1653(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class232.method1653(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class104.field1523.method1242(arg0.field7561, arg0.field7563);
                        }
                        class514 var84 = var81.method108(2, class104.field1523);
                        if (var84 != null) {
                            var84.field7625 = var81;
                            var84.field7622 = var4;
                            var84.field7624 = var81.field6423;
                            var84.field7621 = var81.field6424;
                            class92.field1348.method2625(var84, 0);
                        }
                    }
                    for (int var85 = var81.field6423; var85 <= var81.field6420; var85++) {
                        for (int var86 = var81.field6424; var86 <= var81.field6418; var86++) {
                            class409 var87 = var8[var85][var86];
                            if (var87.field6177 != 0) {
                                class409.field6200.method911(126, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field6191) {
                                class409.field6200.method911(109, var87);
                            }
                        }
                    }
                }
                if (arg1.field6198) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field6198 = false;
            }
        }
        if (arg1.field6181 != null && (byte) (class85.field1239 & 0xFF) == arg1.field6184) {
            class519 var88 = arg1.field6181;
            int var89 = class53.field732[var4].method688(var2, var3);
            int var90;
            if (var4 < class297.field4675 - 1) {
                var90 = class53.field732[var4].method688(var2, var3) - class53.field732[var4 + 1].method688(var2, var3);
            } else {
                var90 = 0x8 << class56.field908;
            }
            class24.field274.method154(var6, var89, var7, arg0.field7560);
            int var91 = arg0.field7560[2];
            class24.field274.method154(var6, var89 - var90, var7, arg0.field7560);
            int var92 = arg0.field7560[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class518.field7684;
            int var96 = class518.field7684 + var94;
            var88.field7692 = var95;
            var88.field7691 = var96;
            var88.field7693 = true;
            class104.field1523.method1306(var88);
        }
        if (!arg1.field6191) {
            return;
        }
        if (arg1.field6177 != 0) {
            return;
        }
        if (var2 <= class192.field2847 && var2 > class363.field5620) {
            class409 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field6191) {
                return;
            }
        }
        if (var2 >= class192.field2847 && var2 < class315.field4928 - 1) {
            class409 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field6191) {
                return;
            }
        }
        if (var3 <= class241.field3919 && var3 > class197.field3041) {
            class409 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field6191) {
                return;
            }
        }
        if (var3 >= class241.field3919 && var3 < class529.field7781 - 1) {
            class409 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field6191) {
                return;
            }
        }
        arg1.field6191 = false;
        class72.field1081--;
        class528 var101 = arg1.field6186;
        if (var101 != null && var101.field7771) {
            if (class310.field4858) {
                class91.method635(arg0, var4, var2, var3);
                class104.field1523.method1242(arg0.field7561, arg0.field7563);
            }
            class514 var102 = var101.method108(2, class104.field1523);
            if (var102 != null) {
                var102.field7625 = var101;
                var102.field7622 = var4;
                var102.field7624 = var2;
                var102.field7621 = var3;
                class92.field1348.method2625(var102, 0);
            }
        }
        if (arg1.field6179 != 0) {
            class304 var103 = arg1.field6189;
            if (var103 != null && !class325.method2175(var5, var2, var3, var103.method98(0))) {
                if ((var103.field4786 & arg1.field6179) != 0) {
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class514 var104 = var103.method108(2, class104.field1523);
                    if (var104 != null) {
                        var104.field7625 = var103;
                        var104.field7622 = var4;
                        var104.field7624 = var2;
                        var104.field7621 = var3;
                        class92.field1348.method2625(var104, 0);
                    }
                } else if (var103.field4786 == 256) {
                    int var105 = var103.field4788 - class329.field5178;
                    int var106 = var103.field4790 - class32.field331;
                    int var107 = var103.field4791;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class310.field4858) {
                        class91.method635(arg0, var4, var2, var3);
                        class104.field1523.method1242(arg0.field7561, arg0.field7563);
                    }
                    class304 var110 = arg1.field6192;
                    if (var109 > var108) {
                        class514 var111 = var103.method108(2, class104.field1523);
                        if (var111 != null) {
                            var111.field7625 = var103;
                            var111.field7622 = var4;
                            var111.field7624 = var2;
                            var111.field7621 = var3;
                            class92.field1348.method2625(var111, 0);
                        }
                    } else if (var110 != null) {
                        class514 var112 = var110.method108(2, class104.field1523);
                        if (var112 != null) {
                            var112.field7625 = var110;
                            var112.field7622 = var4;
                            var112.field7624 = var2;
                            var112.field7621 = var3;
                            class92.field1348.method2625(var112, 0);
                        }
                    }
                }
            }
            class477 var113 = arg1.field6180;
            class477 var114 = arg1.field6188;
            if (var114 != null && (var114.field7302 & arg1.field6179) != 0 && !class519.method3111(var5, var2, var3, var114.field7302)) {
                if (class310.field4858) {
                    class341.method2262(arg0, var114.field7302, var4, var2, var3);
                    class104.field1523.method1242(arg0.field7561, arg0.field7563);
                }
                class514 var115 = var114.method108(2, class104.field1523);
                if (var115 != null) {
                    var115.field7625 = var114;
                    var115.field7622 = var4;
                    var115.field7624 = var2;
                    var115.field7621 = var3;
                    class92.field1348.method2625(var115, 0);
                }
            }
            if (var113 != null && (var113.field7302 & arg1.field6179) != 0 && !class519.method3111(var5, var2, var3, var113.field7302)) {
                if (class310.field4858) {
                    class341.method2262(arg0, var113.field7302, var4, var2, var3);
                    class104.field1523.method1242(arg0.field7561, arg0.field7563);
                }
                class514 var116 = var113.method108(2, class104.field1523);
                if (var116 != null) {
                    var116.field7625 = var113;
                    var116.field7622 = var4;
                    var116.field7624 = var2;
                    var116.field7621 = var3;
                    class92.field1348.method2625(var116, 0);
                }
            }
        }
        if (var4 < class297.field4675 - 1) {
            class409 var117 = class217.field3699[var4 + 1][var2][var3];
            if (var117 != null && var117.field6191) {
                class409.field6200.method910((byte) 126, var117);
            }
        }
        if (var2 < class192.field2847) {
            class409 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field6191) {
                class409.field6200.method911(120, var118);
            }
        }
        if (var3 < class241.field3919) {
            class409 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field6191) {
                class409.field6200.method911(112, var119);
            }
        }
        if (var2 > class192.field2847) {
            class409 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field6191) {
                class409.field6200.method911(76, var120);
            }
        }
        if (var3 > class241.field3919) {
            class409 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field6191) {
                class409.field6200.method911(108, var121);
            }
        }
    }
}
