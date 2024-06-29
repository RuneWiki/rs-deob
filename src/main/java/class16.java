import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class16 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[Lgk;")
    public static class184[] field200 = new class184[29];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLpd;)V")
    public static final void method81(byte arg0, class96 arg1) {
        field199++;
        if (arg0 >= -97) {
            return;
        }
        int var2 = class188.field3051 >> 1;
        int var3 = class99.field1323 >> 2 << 10;
        byte[][] var4 = new byte[class44.field562][class7.field88];
        while (arg1.field1228 < arg1.field1218.length) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (arg1.method584(255) == 1) {
                var35 = arg1.method584(255);
                var33 = arg1.method584(255);
                var34 = true;
            }
            int var36 = arg1.method584(255);
            int var37 = arg1.method584(255);
            int var38 = var36 * 64 - class105.field1413;
            int var39 = class42.field524 + class7.field88 - (var37 * 64) - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && (var38 + 63) < class44.field562 && var39 < class7.field88) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var34 || var40 >= (var35 * 8) && (var35 * 8 + 8) > var40 && (var33 * 8) <= var42 && var42 < var33 * 8 + 8) {
                            var41[var39 - var42] = arg1.method587(-26);
                        }
                    }
                }
            } else if (var34) {
                arg1.field1228 += 64;
            } else {
                arg1.field1228 += 4096;
            }
        }
        int var5 = class44.field562;
        int var6 = class7.field88;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class5 var29 = class54.method307(var28 - 1, 4728);
                        var7[var13] += var29.field82;
                        var9[var13] += var29.field73;
                        var8[var13] += var29.field78;
                        var11[var13] += var29.field76;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class5 var32 = class54.method307(var31 - 1, 4728);
                        var7[var13] -= var32.field82;
                        var9[var13] -= var32.field73;
                        var8[var13] -= var32.field78;
                        var11[var13] -= var32.field76;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class41.field516[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var18 += var11[var21];
                        var15 += var7[var21];
                        var19 += var10[var21];
                        var17 += var8[var21];
                        var16 += var9[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var17 -= var8[var22];
                        var18 -= var11[var22];
                        var16 -= var9[var22];
                        var19 -= var10[var22];
                        var15 -= var7[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class269.method1813(var17 / var19, var16 / var19, var15 * 256 / var18, 15242);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + (var3 + var24 & 0xFC00) + var25;
                            var23[class173.method1186(63, var12) + class173.method1186(4032, var20 << 6)] = class174.field2764[class293.method1970(96, var26, (byte) -119)];
                        } else if (var23 != null) {
                            var23[(class173.method1186(63, var20) << 6) + class173.method1186(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BLpd;)Lwg;")
    public static final class164 method82(byte arg0, class96 arg1) {
        int var2 = 51 / ((35 - arg0) / 47);
        field198++;
        return new class164(arg1.method564(-67), arg1.method564(-97), arg1.method564(-78), arg1.method564(-87), arg1.method598(-1235752501), arg1.method598(-1235752501), arg1.method584(255));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method83(boolean arg0);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method84(int arg0) {
        field200 = null;
        if (arg0 >= -96) {
            method85(-20, -105, 121, (byte[][][]) null, -25, (byte) 109, -18, -68);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method85(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class35.field452++;
        class130.field2082 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class276.field4408; var12 < class34.field444; var12++) {
            class246[][] var38 = class46.field585[var12];
            for (int var39 = class253.field4125; var39 < class17.field207; var39++) {
                for (int var40 = class110.field1579; var40 < class107.field1438; var40++) {
                    class246 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class162.field2588[var39 + class194.field3111 - class259.field4198][var40 + class194.field3111 - class99.field1326] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field4048 = true;
                            var41.field4051 = true;
                            if (var41.field4044 > 0) {
                                var41.field4063 = true;
                            } else {
                                var41.field4063 = false;
                            }
                            class130.field2082++;
                        } else {
                            var41.field4048 = false;
                            var41.field4051 = false;
                            var41.field4041 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field4046 != null) {
                                    class187 var42 = var41.field4046;
                                    var42.field2983.method99(0, var12, var42.field2982, var42.field2988, var42.field2986);
                                    if (var42.field2990 != null) {
                                        var42.field2990.method99(0, var12, var42.field2982, var42.field2988, var42.field2986);
                                    }
                                }
                                if (var41.field4054 != null) {
                                    class128 var43 = var41.field4054;
                                    var43.field2043.method99(var43.field2056, var12, var43.field2046, var43.field2058, var43.field2050);
                                    if (var43.field2061 != null) {
                                        var43.field2061.method99(var43.field2056, var12, var43.field2046, var43.field2058, var43.field2050);
                                    }
                                }
                                if (var41.field4056 != null) {
                                    class11 var44 = var41.field4056;
                                    var44.field127.method99(0, var12, var44.field124, var44.field125, var44.field128);
                                }
                                if (var41.field4038 != null) {
                                    for (int var45 = 0; var45 < var41.field4044; var45++) {
                                        class19 var46 = var41.field4038[var45];
                                        var46.field234.method99(var46.field242, var12, var46.field230, var46.field228, var46.field241);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class172.field2739 == class17.field209;
        for (int var14 = class276.field4408; var14 < class34.field444; var14++) {
            class246[][] var27 = class46.field585[var14];
            for (int var28 = -class194.field3111; var28 <= 0; var28++) {
                int var29 = class259.field4198 + var28;
                int var30 = class259.field4198 - var28;
                if (var29 >= class253.field4125 || var30 < class17.field207) {
                    for (int var31 = -class194.field3111; var31 <= 0; var31++) {
                        int var32 = class99.field1326 + var31;
                        int var33 = class99.field1326 - var31;
                        if (var29 >= class253.field4125) {
                            if (var32 >= class110.field1579) {
                                class246 var34 = var27[var29][var32];
                                if (var34 != null && var34.field4048) {
                                    class85.method466(var34, true);
                                }
                            }
                            if (var33 < class107.field1438) {
                                class246 var35 = var27[var29][var33];
                                if (var35 != null && var35.field4048) {
                                    class85.method466(var35, true);
                                }
                            }
                        }
                        if (var30 < class17.field207) {
                            if (var32 >= class110.field1579) {
                                class246 var36 = var27[var30][var32];
                                if (var36 != null && var36.field4048) {
                                    class85.method466(var36, true);
                                }
                            }
                            if (var33 < class107.field1438) {
                                class246 var37 = var27[var30][var33];
                                if (var37 != null && var37.field4048) {
                                    class85.method466(var37, true);
                                }
                            }
                        }
                        if (class130.field2082 == 0) {
                            if (!var13) {
                                class101.field1367 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class276.field4408; var15 < class34.field444; var15++) {
            class246[][] var16 = class46.field585[var15];
            for (int var17 = -class194.field3111; var17 <= 0; var17++) {
                int var18 = class259.field4198 + var17;
                int var19 = class259.field4198 - var17;
                if (var18 >= class253.field4125 || var19 < class17.field207) {
                    for (int var20 = -class194.field3111; var20 <= 0; var20++) {
                        int var21 = class99.field1326 + var20;
                        int var22 = class99.field1326 - var20;
                        if (var18 >= class253.field4125) {
                            if (var21 >= class110.field1579) {
                                class246 var23 = var16[var18][var21];
                                if (var23 != null && var23.field4048) {
                                    class85.method466(var23, false);
                                }
                            }
                            if (var22 < class107.field1438) {
                                class246 var24 = var16[var18][var22];
                                if (var24 != null && var24.field4048) {
                                    class85.method466(var24, false);
                                }
                            }
                        }
                        if (var19 < class17.field207) {
                            if (var21 >= class110.field1579) {
                                class246 var25 = var16[var19][var21];
                                if (var25 != null && var25.field4048) {
                                    class85.method466(var25, false);
                                }
                            }
                            if (var22 < class107.field1438) {
                                class246 var26 = var16[var19][var22];
                                if (var26 != null && var26.field4048) {
                                    class85.method466(var26, false);
                                }
                            }
                        }
                        if (class130.field2082 == 0) {
                            if (!var13) {
                                class101.field1367 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class101.field1367 = false;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BZ)V")
    public abstract void method86(byte[] arg0, boolean arg1);
}
