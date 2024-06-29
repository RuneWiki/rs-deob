import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class69 implements class46 {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Z")
    public static boolean field1189 = true;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1183 = -2;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lwa;")
    private static class75 field1192 = class66.method560("Choose Option", false);

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[Lwa;")
    public static class75[] field1190 = new class75[1000];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lwa;")
    public static class75 field1187 = field1192;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Z")
    public static boolean field1193 = true;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[Lbh;")
    public static class258[] field1188;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[[S")
    public static short[][] field1184;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 9)
    public static final int method585(KeyEvent arg0, byte arg1) {
        field1186++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 != 123) {
            method588((byte) 55);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB[IJ)Lwa;", line = 42)
    public final class75 method308(int arg0, byte arg1, int[] arg2, long arg3) {
        field1181++;
        if (arg0 == 0) {
            class302 var8 = class115.method886(-23454, arg2[0]);
            return var8.method2076((int) arg3, false);
        } else if (arg0 == 1 || arg0 == 10) {
            class278 var7 = class199.method1475((int) arg3, (byte) -22);
            return var7.field4770;
        } else if (arg0 == 6 || arg0 == 7) {
            return class115.method886(-23454, arg2[0]).method2076((int) arg3, false);
        } else {
            int var6 = -79 % ((-arg1 - 55) / 63);
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([[I[[BI[[[B[[F[[F[[I[[F[[B[[B[[B[[I[[II[[I)[Lcg;", line = 76)
    public static final class38[] method586(int[][] arg0, byte[][] arg1, int arg2, byte[][][] arg3, float[][] arg4, float[][] arg5, int[][] arg6, float[][] arg7, byte[][] arg8, byte[][] arg9, byte[][] arg10, int[][] arg11, int[][] arg12, int arg13, int[][] arg14) {
        field1185++;
        if (arg2 != 23775) {
            method585((KeyEvent) null, (byte) -111);
        }
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg8[var16][var17];
                if (var18 == 0) {
                    var18 = arg8[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg8[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg8[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class215 var19 = class266.method1891((byte) -96, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field3671 + 1 << 16) + var19.field3676;
                }
            }
        }
        class126 var20 = new class126(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg8[var21][var22] != 0) {
                    int[] var23;
                    if (arg10[var21][var22] == 0) {
                        var23 = class238.field4010[0];
                    } else {
                        var23 = class136.field2337[arg9[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg6 != null) {
                        var24 = arg6[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var24 | (long) var25 << 32;
                    long var31 = (long) var26 << 32 | (long) var24;
                    long var33 = (long) var24 | (long) var28 << 32;
                    int var35 = var23.length / 2;
                    long var36 = (long) var24 | (long) var27 << 32;
                    class38 var38 = (class38) var20.method1007(var29, -17004);
                    if (var38 == null) {
                        var38 = new class38((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg0 != null, var24);
                        var20.method1004((byte) 73, var29, var38);
                    }
                    var38.field559 += var35;
                    var38.field582++;
                    if (var29 != var31) {
                        class38 var39 = (class38) var20.method1007(var31, -17004);
                        if (var39 == null) {
                            var39 = new class38((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg0 != null, var24);
                            var20.method1004((byte) 73, var31, var39);
                        }
                        var39.field559 += var35;
                        var39.field582++;
                    }
                    if (var29 != var36 && var31 != var36) {
                        class38 var40 = (class38) var20.method1007(var36, arg2 ^ 0xFFFFE14B);
                        if (var40 == null) {
                            var40 = new class38((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg0 != null, var24);
                            var20.method1004((byte) 73, var36, var40);
                        }
                        var40.field559 += var35;
                        var40.field582++;
                    }
                    if (var29 != var33 && var31 != var33 && var33 != var36) {
                        class38 var41 = (class38) var20.method1007(var33, -17004);
                        if (var41 == null) {
                            var41 = new class38((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg0 != null, var24);
                            var20.method1004((byte) 73, var33, var41);
                        }
                        var41.field582++;
                        var41.field559 += var35;
                    }
                }
            }
        }
        for (class38 var42 = (class38) var20.method1001((byte) 33); var42 != null; var42 = (class38) var20.method1009(arg2 - 23894)) {
            var42.method258();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg8[var43][var44] != 0) {
                    int var45;
                    if ((arg3[arg13][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg3[1][var43][var44] & 0x2) == 2 && arg13 > 0) {
                        var45 = arg13 - 1;
                    } else {
                        var45 = arg13;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg6 != null) {
                        var46 = arg6[var43][var44] & 0xFFFFFF;
                        var47 = arg6[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    byte var49;
                    int[] var50;
                    if (arg10[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class238.field4010[0];
                    } else {
                        var48 = class2.field11[arg9[var43][var44]];
                        var49 = arg1[var43][var44];
                        var50 = class136.field2337[arg9[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43 + 1][var44 + 1];
                    int var52 = var15[var43][var44];
                    int var53 = var15[var43 + 1][var44];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var52 << 32 | (long) var46;
                    long var57 = (long) var51 << 32 | (long) var46;
                    long var59 = (long) var46 | (long) var53 << 32;
                    long var61 = (long) var54 << 32 | (long) var46;
                    int var63 = arg11[var43][var44];
                    int var64 = arg11[var43 + 1][var44 + 1];
                    int var65 = arg11[var43 + 1][var44];
                    int var66 = arg11[var43][var44 + 1];
                    int var67 = arg14[var43][var44];
                    int var68 = arg14[var43 + 1][var44 + 1];
                    int var69 = arg14[var43 + 1][var44];
                    int var70 = (var52 >> 16) - 1;
                    int var71 = arg14[var43][var44 + 1];
                    int var72 = (var53 >> 16) - 1;
                    int var73 = (var51 >> 16) - 1;
                    int var74 = (var54 >> 16) - 1;
                    class38 var75 = (class38) var20.method1007(var55, arg2 - 40779);
                    class104.method816(var45, var52 <= var52, class16.method91(var70, var64, var68, -30110), var48, class16.method91(var70, var65, var69, -30110), 25856, var49, arg12, class16.method91(var70, var66, var71, -30110), var75, arg0, var43, var52 <= var51, var52 <= var54, var50, arg5, var52 <= var53, var44, class16.method91(var70, var63, var67, -30110), arg4, arg7, var47);
                    if (var55 != var59) {
                        class38 var76 = (class38) var20.method1007(var59, -17004);
                        class104.method816(var45, var53 <= var52, class16.method91(var72, var64, var68, -30110), var48, class16.method91(var72, var65, var69, arg2 ^ 0xFFFFD6BD), arg2 ^ 0x39DF, var49, arg12, class16.method91(var72, var66, var71, -30110), var76, arg0, var43, var53 <= var51, var54 >= var53, var50, arg5, var53 >= var53, var44, class16.method91(var72, var63, var67, -30110), arg4, arg7, var47);
                    }
                    if (var55 != var57 && var57 != var59) {
                        class38 var77 = (class38) var20.method1007(var57, -17004);
                        class104.method816(var45, var51 <= var52, class16.method91(var73, var64, var68, -30110), var48, class16.method91(var73, var65, var69, -30110), 25856, var49, arg12, class16.method91(var73, var66, var71, -30110), var77, arg0, var43, var51 >= var51, var54 >= var51, var50, arg5, var53 >= var51, var44, class16.method91(var73, var63, var67, -30110), arg4, arg7, var47);
                    }
                    if (var55 != var61 && var59 != var61 && var57 != var61) {
                        class38 var78 = (class38) var20.method1007(var61, -17004);
                        class104.method816(var45, var52 >= var54, class16.method91(var74, var64, var68, arg2 - 53885), var48, class16.method91(var74, var65, var69, arg2 - 53885), 25856, var49, arg12, class16.method91(var74, var66, var71, -30110), var78, arg0, var43, var54 <= var51, var54 >= var54, var50, arg5, var53 >= var54, var44, class16.method91(var74, var63, var67, arg2 - 53885), arg4, arg7, var47);
                    }
                }
            }
        }
        for (class38 var79 = (class38) var20.method1001((byte) 33); var79 != null; var79 = (class38) var20.method1009(-120)) {
            if (var79.field586 == 0) {
                var79.method1527(96);
            } else {
                var79.method255();
            }
        }
        int var80 = var20.method999(false);
        long[] var81 = new long[var80];
        class38[] var82 = new class38[var80];
        var20.method1011(var82, (byte) 112);
        for (int var83 = 0; var83 < var80; var83++) {
            var81[var83] = var82[var83].field3488;
        }
        class151.method1158(var81, var82, false);
        return var82;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)Lil;", line = 401)
    public static final class53 method587(int arg0, boolean arg1) {
        field1194++;
        if (arg0 == 0) {
            return new class269();
        } else if (arg0 == 1) {
            return new class13();
        } else if (arg0 == 2) {
            return new class180();
        } else if (arg0 == 3) {
            return new class79();
        } else if (arg0 == 4) {
            return new class299();
        } else if (arg0 == 5) {
            return new class143();
        } else if (arg0 == 6) {
            return new class34();
        } else if (arg0 == 7) {
            return new class65();
        } else if (arg0 == 8) {
            return new class26();
        } else if (arg0 == 9) {
            return new class144();
        } else if (arg0 == 10) {
            return new class178();
        } else if (arg0 == 11) {
            return new class204();
        } else if (arg0 == 12) {
            return new class86();
        } else if (arg0 == 13) {
            return new class245();
        } else if (arg0 == 14) {
            return new class157();
        } else if (arg0 == 15) {
            return new class232();
        } else if (arg0 == 16) {
            return new class48();
        } else if (arg0 == 17) {
            return new class169();
        } else if (arg0 == 18) {
            return new class249();
        } else if (arg0 == 19) {
            return new class301();
        } else if (arg0 == 20) {
            return new class133();
        } else if (arg0 == 21) {
            return new class266();
        } else if (arg0 == 22) {
            return new class40();
        } else if (arg0 == 23) {
            return new class182();
        } else if (arg0 == 24) {
            return new class260();
        } else if (arg0 == 25) {
            return new class94();
        } else if (arg0 == 26) {
            return new class255();
        } else if (arg0 == 27) {
            return new class207();
        } else if (arg0 == 28) {
            return new class61();
        } else if (arg0 == 29) {
            return new class175();
        } else if (arg0 == 30) {
            return new class74();
        } else if (arg0 == 31) {
            return new class305();
        } else if (arg0 == 32) {
            return new class127();
        } else if (arg0 == 33) {
            return new class228();
        } else if (arg0 == 34) {
            return new class42();
        } else if (arg0 == 35) {
            return new class195();
        } else if (arg0 == 36) {
            return new class98();
        } else if (arg0 == 37) {
            return new class132();
        } else if (arg0 == 38) {
            return new class11();
        } else if (arg0 == 39) {
            return new class45();
        } else {
            if (!arg1) {
                method587(-74, false);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 740)
    public static void method588(byte arg0) {
        if (arg0 != 9) {
            return;
        }
        field1187 = null;
        field1192 = null;
        field1184 = (short[][]) null;
        field1188 = null;
        field1190 = null;
    }
}
