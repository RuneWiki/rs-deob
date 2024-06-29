import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class118 {

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field2138 = -1;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Z")
    public static boolean field2147 = false;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Li;")
    private static class88 field2142 = class208.method1425(105, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
    public static volatile boolean field2145 = true;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Li;")
    public static class88 field2144 = field2142;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lid;")
    public static class92 field2135 = new class92(64);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Lgi;")
    public static class75 field2149;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)I")
    public static final int method801(int arg0, boolean arg1) {
        if (arg1) {
            method806(null, null, (byte) -3);
        }
        field2150++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field2142 = null;
        field2135 = null;
        if (arg0 != -1) {
            field2147 = true;
        }
        field2149 = null;
        field2144 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Li;BILi;ILi;)V")
    public static final void method803(class88 arg0, byte arg1, int arg2, class88 arg3, int arg4, class88 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class194.field3710[var6] = class194.field3710[var6 - 1];
            class121.field2208[var6] = class121.field2208[var6 - 1];
            class212.field4021[var6] = class212.field4021[var6 - 1];
            class228.field4282[var6] = class228.field4282[var6 - 1];
            class133.field2485[var6] = class133.field2485[var6 - 1];
        }
        class34.field582++;
        class121.field2208[0] = arg3;
        class212.field4021[0] = arg0;
        if (arg1 != 28) {
            return;
        }
        class194.field3710[0] = arg4;
        class133.field2485[0] = arg2;
        class228.field4282[0] = arg5;
        field2151++;
        class7.field100 = class67.field1211;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public static final void method804(int arg0, int arg1, int arg2) {
        if (class70.field1276 != arg0) {
            class22.field351 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class22.field351[var3] = (var3 << 12) / arg0;
            }
            class43.field738 = arg0 == 64 ? 2048 : 4096;
            class70.field1276 = arg0;
            class45.field789 = arg0 - 1;
        }
        if (class27.field460 != arg2) {
            if (class70.field1276 == arg2) {
                class111.field2023 = class22.field351;
            } else {
                class111.field2023 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class111.field2023[var4] = (var4 << 12) / arg2;
                }
            }
            class27.field460 = arg2;
            class220.field4160 = arg2 - 1;
        }
        field2146++;
        int var5 = -32 / ((28 - arg1) / 42);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method805(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class143.field2629++;
        class176.field3547 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class161.field3107; var12 < class11.field152; var12++) {
            class52[][] var38 = class29.field489[var12];
            for (int var39 = class156.field3009; var39 < class6.field84; var39++) {
                for (int var40 = class102.field1851; var40 < class230.field4316; var40++) {
                    class52 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field950 <= class155.field2995 && class18.field304[var39 + class150.field2913 - class79.field1435][var40 + class150.field2913 - class88.field1636] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field944 = true;
                            var41.field965 = true;
                            if (var41.field962 > 0) {
                                var41.field958 = true;
                            } else {
                                var41.field958 = false;
                            }
                            class176.field3547++;
                        } else {
                            var41.field944 = false;
                            var41.field965 = false;
                            var41.field953 = 0;
                            if (var41.field963 != null && var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                for (int var42 = 0; var42 < var41.field962; var42++) {
                                    class108 var43 = var41.field963[var42];
                                    var43.field1945.method537(50, ((var43.field1942 - var43.field1935 >> 1) + var43.field1935) * 128 + 64, ((var43.field1937 - var43.field1938 >> 1) + var43.field1938) * 128 + 64);
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class62.field1137 == class154.field2981;
        for (int var14 = class161.field3107; var14 < class11.field152; var14++) {
            class52[][] var27 = class29.field489[var14];
            for (int var28 = -class150.field2913; var28 <= 0; var28++) {
                int var29 = class79.field1435 + var28;
                int var30 = class79.field1435 - var28;
                if (var29 >= class156.field3009 || var30 < class6.field84) {
                    for (int var31 = -class150.field2913; var31 <= 0; var31++) {
                        int var32 = class88.field1636 + var31;
                        int var33 = class88.field1636 - var31;
                        if (var29 >= class156.field3009) {
                            if (var32 >= class102.field1851) {
                                class52 var34 = var27[var29][var32];
                                if (var34 != null && var34.field944) {
                                    class81.method542(var34, true);
                                }
                            }
                            if (var33 < class230.field4316) {
                                class52 var35 = var27[var29][var33];
                                if (var35 != null && var35.field944) {
                                    class81.method542(var35, true);
                                }
                            }
                        }
                        if (var30 < class6.field84) {
                            if (var32 >= class102.field1851) {
                                class52 var36 = var27[var30][var32];
                                if (var36 != null && var36.field944) {
                                    class81.method542(var36, true);
                                }
                            }
                            if (var33 < class230.field4316) {
                                class52 var37 = var27[var30][var33];
                                if (var37 != null && var37.field944) {
                                    class81.method542(var37, true);
                                }
                            }
                        }
                        if (class176.field3547 == 0) {
                            if (!var13) {
                                field2147 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class161.field3107; var15 < class11.field152; var15++) {
            class52[][] var16 = class29.field489[var15];
            for (int var17 = -class150.field2913; var17 <= 0; var17++) {
                int var18 = class79.field1435 + var17;
                int var19 = class79.field1435 - var17;
                if (var18 >= class156.field3009 || var19 < class6.field84) {
                    for (int var20 = -class150.field2913; var20 <= 0; var20++) {
                        int var21 = class88.field1636 + var20;
                        int var22 = class88.field1636 - var20;
                        if (var18 >= class156.field3009) {
                            if (var21 >= class102.field1851) {
                                class52 var23 = var16[var18][var21];
                                if (var23 != null && var23.field944) {
                                    class81.method542(var23, false);
                                }
                            }
                            if (var22 < class230.field4316) {
                                class52 var24 = var16[var18][var22];
                                if (var24 != null && var24.field944) {
                                    class81.method542(var24, false);
                                }
                            }
                        }
                        if (var19 < class6.field84) {
                            if (var21 >= class102.field1851) {
                                class52 var25 = var16[var19][var21];
                                if (var25 != null && var25.field944) {
                                    class81.method542(var25, false);
                                }
                            }
                            if (var22 < class230.field4316) {
                                class52 var26 = var16[var19][var22];
                                if (var26 != null && var26.field944) {
                                    class81.method542(var26, false);
                                }
                            }
                        }
                        if (class176.field3547 == 0) {
                            if (!var13) {
                                field2147 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        field2147 = false;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lcc;Lcc;B)V")
    public static final void method806(class26 arg0, class26 arg1, byte arg2) {
        field2134++;
        if (class80.field1448 == null) {
            class80.field1448 = class34.method230(0, class226.field4245, arg2 - 7707, class14.field209);
        }
        if (class23.field372 == null) {
            class23.field372 = class190.method1327(class8.field119, (byte) -101, class226.field4245, 0);
        }
        if (arg2 != -15) {
            return;
        }
        if (class167.field3219 == null) {
            class167.field3219 = class190.method1327(class97.field1785, (byte) -128, class226.field4245, 0);
        }
        if (class43.field736 == null) {
            class43.field736 = class190.method1327(class120.field2197, (byte) -98, class226.field4245, 0);
        }
        class72.method478(0, 23, 765, 480, 0);
        class72.method482(0, 0, 138, 23, 12425273, 9135624);
        class72.method482(138, 0, 640, 23, 5197647, 2697513);
        arg1.method141(class129.field2427, 69, 15, 0, -1);
        if (class43.field736 != null) {
            class43.field736[1].method878(140, 1);
            arg0.method154(class128.field2406, 152, 10, 16777215, -1);
            class43.field736[0].method878(140, 12);
            arg0.method154(class115.field2076, 152, 21, 16777215, -1);
        }
        if (class167.field3219 != null) {
            short var3 = 280;
            if (class27.field461[0] == 0 && class89.field1687[0] == 0) {
                class167.field3219[2].method878(var3, 4);
            } else {
                class167.field3219[0].method878(var3, 4);
            }
            short var4 = 390;
            if (class27.field461[0] == 0 && class89.field1687[0] == 1) {
                class167.field3219[3].method878(var3 + 15, 4);
            } else {
                class167.field3219[1].method878(var3 + 15, 4);
            }
            short var5 = 610;
            arg1.method154(class71.field1312, var3 + 32, 17, 16777215, -1);
            short var6 = 500;
            if (class27.field461[0] == 1 && class89.field1687[0] == 0) {
                class167.field3219[2].method878(var4, 4);
            } else {
                class167.field3219[0].method878(var4, 4);
            }
            if (class27.field461[0] == 1 && class89.field1687[0] == 1) {
                class167.field3219[3].method878(var4 + 15, 4);
            } else {
                class167.field3219[1].method878(var4 + 15, 4);
            }
            arg1.method154(class232.field4364, var4 + 32, 17, 16777215, -1);
            if (class27.field461[0] == 2 && class89.field1687[0] == 0) {
                class167.field3219[2].method878(var6, 4);
            } else {
                class167.field3219[0].method878(var6, 4);
            }
            if (class27.field461[0] == 2 && class89.field1687[0] == 1) {
                class167.field3219[3].method878(var6 + 15, 4);
            } else {
                class167.field3219[1].method878(var6 + 15, 4);
            }
            arg1.method154(class146.field2736, var6 + 32, 17, 16777215, -1);
            if (class27.field461[0] == 3 && class89.field1687[0] == 0) {
                class167.field3219[2].method878(var5, 4);
            } else {
                class167.field3219[0].method878(var5, 4);
            }
            if (class27.field461[0] == 3 && class89.field1687[0] == 1) {
                class167.field3219[3].method878(var5 + 15, 4);
            } else {
                class167.field3219[1].method878(var5 + 15, 4);
            }
            arg1.method154(class208.field3952, var5 + 32, 17, 16777215, -1);
        }
        class72.method478(700, 4, 58, 16, 0);
        arg0.method141(class6.field76, 729, 16, 16777215, -1);
        class87.field1581 = -1;
        if (class80.field1448 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 480 / (var8 + 1);
        int var10 = 765 / (var7 + 1);
        int var11;
        int var12;
        do {
            var11 = var9;
            var12 = var10;
            if (class104.field1897 <= (var10 - 1) * var9) {
                var10--;
            }
            if ((var9 - 1) * var10 >= class104.field1897) {
                var9--;
            }
            if (class104.field1897 <= (var9 - 1) * var10) {
                var9--;
            }
        } while (var9 != var11 || var10 != var12);
        int var13 = (765 - var7 * var10) / (var10 + 1);
        int var14 = (480 - var8 * var9) / (var9 + 1);
        if (var14 > 5) {
            var14 = 5;
        }
        if (var13 > 5) {
            var13 = 5;
        }
        int var15 = (765 - var7 * var10 - (var10 + -1) * var13) / 2;
        int var16 = var15;
        int var17 = (480 - (var9 - 1) * var14 - var8 * var9) / 2;
        int var18 = var17 + 23;
        int var19 = 0;
        for (int var20 = 0; var20 < class104.field1897; var20++) {
            class70 var21 = class202.field3847[var20];
            boolean var22 = true;
            class88 var23 = class170.method1214(var21.field1255, 77);
            if (var21.field1255 == -1) {
                var23 = class48.field901;
                var22 = false;
            } else if (var21.field1255 > 1980) {
                var23 = class93.field1746;
                var22 = false;
            }
            if (class28.field471 >= var16 && class239.field4451 >= var18 && class28.field471 < var7 + var16 && class239.field4451 < var8 + var18 && var22) {
                class87.field1581 = var20;
                class80.field1448[var21.field1257 ? 1 : 0].method1162(var16, var18, 128, 16777215);
            } else {
                class80.field1448[var21.field1257 ? 1 : 0].method1163(var16, var18);
            }
            if (class23.field372 != null) {
                class23.field372[var21.field1260 + (var21.field1257 ? 8 : 0)].method878(var16 + 29, var18);
            }
            arg1.method141(class170.method1214(var21.field1261, -128), var16 + 15, var8 / 2 + var18 + 5, 0, -1);
            arg0.method141(var23, var16 + 60, var8 / 2 + (var18 - -5), 268435455, -1);
            var18 += var8 + var14;
            var19++;
            if (var9 <= var19) {
                var18 = var17 + 23;
                var19 = 0;
                var16 += var7 + var13;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIILq;I)V")
    public static final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class174 arg6, int arg7) {
        if (class1.field9) {
            class126.field2334 = 32;
        } else {
            class126.field2334 = 0;
        }
        field2143++;
        class1.field9 = false;
        if (class156.field3018 != 0) {
            if (arg3 >= arg0 && arg3 < arg0 + 16 && arg7 <= arg5 && arg5 < arg7 + 16) {
                arg6.field3417 -= 4;
                class200.method1373(65280, arg6);
            } else if (arg0 <= arg3 && arg3 < arg0 + 16 && arg5 >= arg7 + arg4 - 16 && arg7 + arg4 > arg5) {
                arg6.field3417 += 4;
                class200.method1373(arg2 ^ 0xFFFF4079, arg6);
            } else if (arg3 >= arg0 - class126.field2334 && arg3 < class126.field2334 + arg0 + 16 && arg7 + 16 <= arg5 && arg5 < arg7 + arg4 - 16) {
                int var8 = (arg4 - 32) * arg4 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - var8 - 32;
                int var10 = arg5 - var8 / 2 - arg7 - 16;
                arg6.field3417 = (arg1 - arg4) * var10 / var9;
                class200.method1373(arg2 + 81799, arg6);
                class1.field9 = true;
            }
        }
        if (class90.field1709 != 0) {
            int var11 = arg6.field3382;
            if (arg3 >= arg0 - var11 && arg7 <= arg5 && arg3 < arg0 + 16 && arg5 <= arg7 + arg4) {
                arg6.field3417 += class90.field1709 * 45;
                class200.method1373(65280, arg6);
            }
        }
        if (arg2 != -16519) {
            method802(-41);
        }
    }
}
