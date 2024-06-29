import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class24 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field303 = "Loading textures - ";

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwe;IBLgn;)V", line = 12)
    public static final void method176(class224 arg0, int arg1, byte arg2, class303 arg3) {
        if (arg2 <= 56) {
            field309 = 103;
        }
        class43 var4 = new class43();
        var4.field608 = arg3.method2043((byte) -127);
        var4.field605 = arg3.method1996(-51);
        var4.field601 = new int[var4.field608];
        var4.field600 = new byte[var4.field608][][];
        var4.field599 = new class252[var4.field608];
        var4.field609 = new int[var4.field608];
        var4.field604 = new int[var4.field608];
        var4.field614 = new class252[var4.field608];
        for (int var5 = 0; var5 < var4.field608; var5++) {
            try {
                int var6 = arg3.method2043((byte) -111);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = arg3.method2027(0);
                    String var19 = arg3.method2027(0);
                    if (var6 == 1) {
                        var17 = arg3.method1996(63);
                    }
                    var4.field609[var5] = var6;
                    var4.field601[var5] = var17;
                    var4.field614[var5] = arg0.method1525(class256.method1721(var18, 0), 2, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method2027(0);
                    String var8 = arg3.method2027(0);
                    int var9 = arg3.method2043((byte) -110);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method2027(0);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method1996(-70);
                            var12[var13] = new byte[var14];
                            arg3.method2009(119, 0, var14, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field609[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class256.method1721(var10[var16], 0);
                    }
                    var4.field599[var5] = arg0.method1521(0, var15, class256.method1721(var7, 0), var8);
                    var4.field600[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field604[var5] = -1;
            } catch (SecurityException var26) {
                var4.field604[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field604[var5] = -3;
            } catch (Exception var28) {
                var4.field604[var5] = -4;
            } catch (Throwable var29) {
                var4.field604[var5] = -5;
            }
        }
        class152.field2395.method7((byte) -51, var4);
        field307++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 121)
    public static void method177(byte arg0) {
        field303 = null;
        if (arg0 != -41) {
            method184(82, -85, 27, 56, -71, 36, 7, 36, -18, 70, 76, -77, -107);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwe;B)[Lfi;", line = 140)
    public static final class288[] method178(class224 arg0, byte arg1) {
        field304++;
        if (!arg0.method1522(110)) {
            return new class288[0];
        }
        class252 var2 = arg0.method1519((byte) -118);
        while (var2.field3931 == 0) {
            class96.method657(10L, (byte) -115);
        }
        if (var2.field3931 == 2) {
            return new class288[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field3929);
        class288[] var4 = new class288[var3.length >> 2];
        if (arg1 != 99) {
            field303 = (String) null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class288 var6 = new class288();
            var4[var5] = var6;
            var6.field4414 = var3[var5 << 2];
            var6.field4406 = var3[(var5 << 2) + 1];
            var6.field4411 = var3[(var5 << 2) + 2];
            var6.field4402 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjh;)V", line = 182)
    public static final void method179(int arg0, class207 arg1) {
        field308++;
        if (arg0 != -1) {
            method178((class224) null, (byte) -94);
        }
        int var2 = arg1.field3149;
        if (var2 == 324) {
            if (class275.field4234 == -1) {
                class275.field4234 = arg1.field3211;
                class257.field4004 = arg1.field3272;
            }
            if (class44.field632.field2608) {
                arg1.field3211 = class275.field4234;
            } else {
                arg1.field3211 = class257.field4004;
            }
        } else if (var2 == 325) {
            if (class275.field4234 == -1) {
                class257.field4004 = arg1.field3272;
                class275.field4234 = arg1.field3211;
            }
            if (class44.field632.field2608) {
                arg1.field3211 = class257.field4004;
            } else {
                arg1.field3211 = class275.field4234;
            }
        } else if (var2 == 327) {
            arg1.field3247 = 150;
            arg1.field3215 = (int) (Math.sin((double) class343.field5341 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3204 = 5;
            arg1.field3207 = -1;
        } else if (var2 == 328) {
            if (class79.field1173.field1218 == null) {
                arg1.field3207 = 0;
            } else {
                arg1.field3247 = 150;
                arg1.field3215 = (int) (Math.sin((double) class343.field5341 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3204 = 5;
                arg1.field3207 = ((int) class108.method723(class79.field1173.field1218, -126) << 11) + 2047;
                arg1.field3289 = class79.field1173.field492;
                arg1.field3275 = 0;
                arg1.field3210 = class79.field1173.field465;
                arg1.field3243 = class79.field1173.field474;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 257)
    public static final byte[] method180(boolean arg0, String arg1) {
        int var2 = arg1.length();
        field306++;
        byte[] var3 = new byte[var2];
        if (!arg0) {
            field309 = -35;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V", line = 398)
    public static final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field310++;
        int var8 = arg2;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg2 - arg5;
        int var13 = arg7 * arg7;
        int var14 = var11 * var11;
        int var15 = arg2 * arg2;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = arg2 << 1;
        int var21 = var14 << 1;
        int var22 = (1 - var20) * var13 + var17;
        int var23 = var15 - ((var20 - 1) * var18);
        int var24 = var12 << 1;
        int var25 = (1 - var24) * var14 + var19;
        int var26 = var16 - ((var24 - 1) * var21);
        int var27 = var15 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var20 - 3) * var18;
        int var33 = (var24 - 3) * var21;
        int var34 = var19 * 3;
        int var35 = (arg2 - 1) * var28;
        if (arg3 >= class323.field5030 && arg3 <= class88.field1324) {
            int[] var36 = class175.field2675[arg3];
            int var37 = class3.method20(class256.field3995, arg0 - arg7, class118.field1834, arg1 - 27520);
            int var38 = class3.method20(class256.field3995, arg0 + arg7, class118.field1834, arg1 - 27520);
            int var39 = class3.method20(class256.field3995, arg0 - var11, class118.field1834, -27521);
            int var40 = class3.method20(class256.field3995, arg0 + var11, class118.field1834, -27521);
            class253.method1704(var37, var39, arg6, var36, arg1 + 8);
            class253.method1704(var39, var40, arg4, var36, 7);
            class253.method1704(var40, var38, arg6, var36, arg1 + 8);
        }
        int var41 = var30;
        int var42 = var27;
        int var43 = (arg1 + var12) * var29;
        while (var8 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var23 += var42;
                    var42 += var27;
                    var10++;
                    var22 += var31;
                    var31 += var27;
                }
            }
            if (var23 < 0) {
                var10++;
                var22 += var31;
                var31 += var27;
                var23 += var42;
                var42 += var27;
            }
            var22 += -var35;
            var35 -= var28;
            var23 += -var32;
            var32 -= var28;
            boolean var44 = var8 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var34;
                        var26 += var41;
                        var41 += var30;
                        var9++;
                        var34 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var26 += var41;
                    var9++;
                    var34 += var30;
                    var41 += var30;
                }
                var25 += -var43;
                var43 -= var29;
                var26 += -var33;
                var33 -= var29;
            }
            var8--;
            int var45 = arg3 + var8;
            int var46 = arg3 - var8;
            if (class323.field5030 <= var45 && class88.field1324 >= var46) {
                int var47 = class3.method20(class256.field3995, arg0 + var10, class118.field1834, -27521);
                int var48 = class3.method20(class256.field3995, arg0 - var10, class118.field1834, arg1 - 27520);
                if (var44) {
                    int var49 = class3.method20(class256.field3995, arg0 + var9, class118.field1834, arg1 - 27520);
                    int var50 = class3.method20(class256.field3995, arg0 - var9, class118.field1834, -27521);
                    if (var46 >= class323.field5030) {
                        int[] var51 = class175.field2675[var46];
                        class253.method1704(var48, var50, arg6, var51, 7);
                        class253.method1704(var50, var49, arg4, var51, arg1 + 8);
                        class253.method1704(var49, var47, arg6, var51, 7);
                    }
                    if (class88.field1324 >= var45) {
                        int[] var52 = class175.field2675[var45];
                        class253.method1704(var48, var50, arg6, var52, 7);
                        class253.method1704(var50, var49, arg4, var52, 7);
                        class253.method1704(var49, var47, arg6, var52, 7);
                    }
                } else {
                    if (var46 >= class323.field5030) {
                        class253.method1704(var48, var47, arg6, class175.field2675[var46], 7);
                    }
                    if (class88.field1324 >= var45) {
                        class253.method1704(var48, var47, arg6, class175.field2675[var45], 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 604)
    public static final void method182(byte arg0) {
        if (arg0 != 22) {
            method183(-77, 111);
        }
        class49.method338();
        field300++;
        class151.field2386 = new class145[9];
        class151.field2386[1] = new class316();
        class151.field2386[2] = new class292();
        class151.field2386[3] = new class321();
        class151.field2386[4] = new class241();
        class151.field2386[5] = new class226();
        class151.field2386[6] = new class281();
        class151.field2386[7] = new class46();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 629)
    public static final void method183(int arg0, int arg1) {
        field301++;
        class283.field4351.method1287(arg0, 119);
        class291.field4479.method1287(arg0, 2);
        class336.field5220.method1287(arg0, 114);
        class285.field4377.method1287(arg0, -18);
        if (arg1 != 3) {
            method182((byte) 82);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 646)
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field305++;
        class198 var13 = new class198();
        var13.field2975 = arg2;
        var13.field2976 = arg4;
        var13.field2972 = arg9;
        var13.field2968 = arg11;
        var13.field2969 = arg5;
        var13.field2977 = arg6;
        var13.field2978 = arg1;
        var13.field2981 = arg10;
        if (arg3 >= -65) {
            return;
        }
        var13.field2982 = arg7;
        var13.field2971 = arg12;
        var13.field2970 = arg8;
        var13.field2973 = arg0;
        class269.field4145.method7((byte) -51, var13);
    }
}
