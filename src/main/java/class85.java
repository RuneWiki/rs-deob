import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class85 extends class273 {

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public int field1192 = -1;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field1179 = 0;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lwm;")
    public static class152 field1191 = class157.method1048("rect_debug=", 107);

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Loe;")
    public static class127 field1178 = null;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Lwm;")
    public static class152 field1195 = class157.method1048("null", 119);

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "Lne;")
    public static class235 field1194 = new class235(64);

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static volatile int field1198 = 0;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Lwm;")
    public static class152 field1199 = class157.method1048("brillant1:", 104);

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lse;")
    public static class12 field1176;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Ljava/awt/Frame;")
    public static Frame field1201;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 15)
    public static void method554(boolean arg0) {
        field1199 = null;
        field1176 = null;
        field1201 = null;
        field1191 = null;
        if (arg0) {
            method554(true);
        }
        field1178 = null;
        field1195 = null;
        field1194 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILoe;)V", line = 35)
    public static final void method555(int arg0, int arg1, int arg2, class127 arg3) {
        field1183++;
        if (arg3.field1818 == 1) {
            class146.method915(112, (short) 46, -1, 0, class201.field3252, 0L, arg3.field1868, arg3.field1931);
            class159.field2521++;
        }
        if (arg3.field1818 == 2 && !class125.field1762) {
            class152 var4 = class213.method1442(arg3, -15415);
            if (var4 != null) {
                class307.field5273++;
                class146.method915(88, (short) 43, -1, -1, class195.method1307(new class152[] { class110.field1556, arg3.field1932 }, (byte) 29), 0L, arg3.field1868, var4);
            }
        }
        if (arg3.field1818 == 3) {
            class146.method915(-107, (short) 41, -1, 0, class201.field3252, 0L, arg3.field1868, class282.field4807);
            class79.field1115++;
        }
        if (arg3.field1818 == 4) {
            class80.field1126++;
            class146.method915(-123, (short) 12, -1, 0, class201.field3252, 0L, arg3.field1868, arg3.field1931);
        }
        if (arg3.field1818 == 5) {
            class183.field2905++;
            class146.method915(83, (short) 10, -1, 0, class201.field3252, 0L, arg3.field1868, arg3.field1931);
        }
        if (arg3.field1818 == 6 && class127.field1858 == null) {
            class146.method915(52, (short) 19, -1, -1, class201.field3252, 0L, arg3.field1868, arg3.field1931);
            class3.field52++;
        }
        if (arg3.field1902 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1802; var6++) {
                for (int var7 = 0; var7 < arg3.field1879; var7++) {
                    int var8 = (arg3.field1946 + 32) * var7;
                    int var9 = (arg3.field1840 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field1933[var5];
                        var8 += arg3.field1865[var5];
                    }
                    if (var8 <= arg1 && var9 <= arg2 && arg1 < (var8 + 32) && var9 + 32 > arg2) {
                        class302.field5199 = var5;
                        class208.field3394 = arg3;
                        if (arg3.field1833[var5] > 0) {
                            class84 var10 = client.method1759(arg3);
                            class312 var11 = class189.method1253((byte) 114, arg3.field1833[var5] - 1);
                            if (class268.field4527 == 1 && var10.method541((byte) -117)) {
                                if (class69.field1011 != arg3.field1868 || class227.field3683 != var5) {
                                    class302.field5198++;
                                    class146.method915(-120, (short) 11, -1, var5, class195.method1307(new class152[] { class141.field2142, class184.field2927, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, class147.field2260);
                                }
                            } else if (class125.field1762 && var10.method541((byte) -114)) {
                                class45 var12 = class324.field5660 == -1 ? null : class162.method1088(class324.field5660, (byte) 123);
                                if ((class239.field3926 & 0x10) != 0 && (var12 == null || var11.method2178((byte) -29, var12.field720, class324.field5660) != var12.field720)) {
                                    class197.field3174++;
                                    class146.method915(102, (short) 48, class208.field3393, var5, class195.method1307(new class152[] { class279.field4775, class184.field2927, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, class62.field942);
                                }
                            } else {
                                class152[] var13 = var11.field5400;
                                if (class256.field4418) {
                                    var13 = method557(var13, false);
                                }
                                class30.field493++;
                                if (var10.method541((byte) -108)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class52.field808++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 47;
                                            } else {
                                                var15 = 9;
                                            }
                                            class146.method915(118, var15, -1, var5, class195.method1307(new class152[] { class179.field2844, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, var13[var14]);
                                        }
                                    }
                                }
                                if (var10.method550(64)) {
                                    class146.method915(85, (short) 16, class241.field3944, var5, class195.method1307(new class152[] { class179.field2844, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, class147.field2260);
                                    class173.field2767++;
                                }
                                if (var10.method541((byte) -102) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 15;
                                            }
                                            if (var16 == 1) {
                                                var17 = 31;
                                            }
                                            if (var16 == 2) {
                                                var17 = 1;
                                            }
                                            class146.method915(118, var17, -1, var5, class195.method1307(new class152[] { class179.field2844, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, var13[var16]);
                                            class141.field2154++;
                                        }
                                    }
                                }
                                class152[] var18 = arg3.field1789;
                                if (class256.field4418) {
                                    var18 = method557(var18, false);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class215.field3493++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 29;
                                            }
                                            if (var19 == 1) {
                                                var20 = 33;
                                            }
                                            if (var19 == 2) {
                                                var20 = 51;
                                            }
                                            if (var19 == 3) {
                                                var20 = 18;
                                            }
                                            if (var19 == 4) {
                                                var20 = 39;
                                            }
                                            class146.method915(59, var20, -1, var5, class195.method1307(new class152[] { class179.field2844, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, var18[var19]);
                                        }
                                    }
                                }
                                class146.method915(66, (short) 1006, class127.field1799, var5, class195.method1307(new class152[] { class179.field2844, var11.field5393 }, (byte) 29), (long) var11.field5346, arg3.field1868, class86.field1204);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg3.field1794) {
            if (!class125.field1762) {
                for (int var21 = 9; var21 >= 5; var21--) {
                    class152 var22 = class252.method1745(arg3, 14242, var21);
                    if (var22 != null) {
                        class146.method915(58, (short) 1002, class88.method584(var21, (byte) 127, arg3), arg3.field1934, arg3.field1801, (long) (var21 + 1), arg3.field1868, var22);
                        class219.field3562++;
                    }
                }
                class152 var23 = class213.method1442(arg3, -15415);
                if (var23 != null) {
                    class146.method915(-102, (short) 43, -1, arg3.field1934, arg3.field1801, 0L, arg3.field1868, var23);
                    class307.field5273++;
                }
                for (int var24 = 4; var24 >= 0; var24--) {
                    class152 var25 = class252.method1745(arg3, 14242, var24);
                    if (var25 != null) {
                        class219.field3562++;
                        class146.method915(85, (short) 36, class88.method584(var24, (byte) 112, arg3), arg3.field1934, arg3.field1801, (long) (var24 + 1), arg3.field1868, var25);
                    }
                }
                if (client.method1759(arg3).method546((byte) 115)) {
                    class3.field52++;
                    class146.method915(45, (short) 19, -1, arg3.field1934, class201.field3252, 0L, arg3.field1868, class265.field4479);
                }
            } else if (client.method1759(arg3).method544(-70) && (class239.field3926 & 0x20) != 0) {
                class146.method915(-122, (short) 21, class208.field3393, arg3.field1934, class195.method1307(new class152[] { class279.field4775, class193.field3061, arg3.field1801 }, (byte) 29), 0L, arg3.field1868, class62.field942);
                class97.field1396++;
            }
        }
        if (arg0 >= -57) {
            field1176 = (class12) null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 351)
    public static final Class method556(int arg0, String arg1) throws ClassNotFoundException {
        field1188++;
        if (arg0 < 106) {
            field1201 = (Frame) null;
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lwm;Z)[Lwm;", line = 395)
    public static final class152[] method557(class152[] arg0, boolean arg1) {
        field1186++;
        class152[] var2 = new class152[5];
        if (arg1) {
            return (class152[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class195.method1307(new class152[] { class38.method280(104, var3), class90.field1264 }, (byte) 29);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class195.method1307(new class152[] { var2[var3], arg0[var3] }, (byte) 29);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 425)
    public static final void method558(int arg0, int arg1, int arg2) {
        field1197++;
        if (arg2 != -22134) {
            field1199 = (class152) null;
        }
        class49 var3 = class38.method279(arg1, false);
        int var4 = var3.field769;
        int var5 = var3.field761;
        int var6 = var3.field763;
        int var7 = class275.field4710[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class175.method1168(class249.field4227[var4] & ~var8 | var8 & arg0 << var5, 42, var4);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIIIIII)V", line = 462)
    public static final void method559(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        field1190++;
        class65.method415(true, arg6);
        int var8 = arg6 - arg5;
        int var9 = -arg6;
        int var10 = arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -1;
        if (arg3 >= class157.field2505 && arg3 <= class110.field1553) {
            int[] var13 = class179.field2843[arg3];
            int var14 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 - arg6);
            int var15 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 + arg6);
            int var16 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 - var8);
            int var17 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 + var8);
            class275.method1885(arg1, var13, var14, var16, -2611);
            class275.method1885(arg2, var13, var16, var17, -2611);
            class275.method1885(arg1, var13, var17, var15, -2611);
        }
        int var18 = -var8;
        int var19 = -1;
        while (var7 < var10) {
            var12 += 2;
            var9 += var12;
            var19 += 2;
            var18 += var19;
            if (var18 >= 0 && var11 >= 1) {
                var11--;
                class113.field1607[var11] = var7;
                var18 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                int var20 = arg3 + var10;
                var9 -= var10 << 1;
                int var21 = arg3 - var10;
                if (class157.field2505 <= var20 && class110.field1553 >= var21) {
                    if (var8 > var10) {
                        int var22 = class113.field1607[var10];
                        int var23 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 + var7);
                        int var24 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 - var7);
                        int var25 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 + var22);
                        int var26 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 - var22);
                        if (var20 <= class110.field1553) {
                            int[] var27 = class179.field2843[var20];
                            class275.method1885(arg1, var27, var24, var26, -2611);
                            class275.method1885(arg2, var27, var26, var25, -2611);
                            class275.method1885(arg1, var27, var25, var23, -2611);
                        }
                        if (var21 >= class157.field2505) {
                            int[] var28 = class179.field2843[var21];
                            class275.method1885(arg1, var28, var24, var26, -2611);
                            class275.method1885(arg2, var28, var26, var25, -2611);
                            class275.method1885(arg1, var28, var25, var23, -2611);
                        }
                    } else {
                        int var29 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 + var7);
                        int var30 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 - var7);
                        if (var20 <= class110.field1553) {
                            class275.method1885(arg1, class179.field2843[var20], var30, var29, -2611);
                        }
                        if (class157.field2505 <= var21) {
                            class275.method1885(arg1, class179.field2843[var21], var30, var29, -2611);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class157.field2505 && class110.field1553 >= var31) {
                int var33 = arg4 + var10;
                int var34 = arg4 - var10;
                if (class308.field5283 <= var33 && class238.field3902 >= var34) {
                    int var35 = class150.method944(class238.field3902, class308.field5283, (byte) 42, var33);
                    int var36 = class150.method944(class238.field3902, class308.field5283, (byte) 42, var34);
                    if (var8 > var7) {
                        int var37 = var7 <= var11 ? var11 : class113.field1607[var7];
                        int var38 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 + var37);
                        int var39 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4 - var37);
                        if (class110.field1553 >= var32) {
                            int[] var40 = class179.field2843[var32];
                            class275.method1885(arg1, var40, var36, var39, -2611);
                            class275.method1885(arg2, var40, var39, var38, -2611);
                            class275.method1885(arg1, var40, var38, var35, -2611);
                        }
                        if (var31 >= class157.field2505) {
                            int[] var41 = class179.field2843[var31];
                            class275.method1885(arg1, var41, var36, var39, -2611);
                            class275.method1885(arg2, var41, var39, var38, -2611);
                            class275.method1885(arg1, var41, var38, var35, -2611);
                        }
                    } else {
                        if (var32 <= class110.field1553) {
                            class275.method1885(arg1, class179.field2843[var32], var36, var35, -2611);
                        }
                        if (var31 >= class157.field2505) {
                            class275.method1885(arg1, class179.field2843[var31], var36, var35, -2611);
                        }
                    }
                }
            }
        }
        int var42 = -54 % ((arg0 + 19) / 41);
    }
}
