import java.io.IOException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 extends RuntimeException {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Ljava/lang/String;")
    public String field1250;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1258;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lid;")
    private static class60 field1254 = class11.method72("Please wait 5 minutes before trying again)3", (byte) 98);

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lid;")
    public static class60 field1255 = field1254;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lid;")
    public static class60 field1257 = class11.method72("hel", (byte) -96);

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1253 = Calendar.getInstance();

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lid;")
    public static class60 field1262 = class11.method72(": ", (byte) -107);

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[J")
    public static long[] field1264 = new long[100];

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Z")
    public static volatile boolean field1266 = true;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
    public static int[] field1269 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Lid;")
    public static class60 field1270 = class11.method72("scrollen:", (byte) 127);

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lid;")
    public static class60 field1268 = class11.method72("Zu viele Verbindungen von Ihrer Adresse)3", (byte) 98);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Ln;")
    public static class90 field1261;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
    public static int[] field1263;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
    public static final boolean method373(byte arg0) {
        field1259++;
        long var1 = class39.method307(8);
        int var3 = (int) (var1 - class152.field3415);
        if (var3 > 200) {
            var3 = 200;
        }
        class152.field3415 = var1;
        class17.field408 += var3;
        if (class128.field2933 == 0 && class34.field798 == 0 && class157.field3588 == 0 && class13.field232 == 0) {
            return true;
        } else if (field1261 == null) {
            return false;
        } else {
            try {
                if (class17.field408 > 30000) {
                    throw new IOException();
                }
                if (arg0 <= 120) {
                    method373((byte) 78);
                }
                while (class34.field798 < 20 && class13.field232 > 0) {
                    class93 var4 = (class93) class41.field1080.method713(12421);
                    class103 var5 = new class103(4);
                    var5.method818(false, 1);
                    var5.method839((byte) 86, (int) var4.field2929);
                    field1261.method730(0, 0, var5.field2498, 4);
                    class38.field921.method712(var4.field2929, var4, (byte) 101);
                    class13.field232--;
                    class34.field798++;
                }
                while (class128.field2933 < 20 && class157.field3588 > 0) {
                    class93 var6 = (class93) class104.field2547.method1155(-128);
                    class103 var7 = new class103(4);
                    var7.method818(false, 0);
                    var7.method839((byte) 86, (int) var6.field2929);
                    field1261.method730(0, 0, var7.field2498, 4);
                    var6.method234(115);
                    class111.field2675.method712(var6.field2929, var6, (byte) 105);
                    class128.field2933++;
                    class157.field3588--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = field1261.method735(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class17.field408 = 0;
                    byte var10 = 0;
                    if (class24.field588 == null) {
                        var10 = 8;
                    } else if (class105.field2562 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class47.field1233.field2501;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        field1261.method734(class47.field1233.field2498, var11, -125, class47.field1233.field2501);
                        if (class155.field3547 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class47.field1233.field2498[class47.field1233.field2501 + var12] = (byte) class81.method682(class47.field1233.field2498[class47.field1233.field2501 + var12], class155.field3547);
                            }
                        }
                        class47.field1233.field2501 += var11;
                        if (class47.field1233.field2501 < var10) {
                            break;
                        }
                        if (class24.field588 == null) {
                            class47.field1233.field2501 = 0;
                            int var13 = class47.field1233.method829((byte) -99);
                            int var14 = class47.field1233.method808(-20054);
                            int var15 = class47.field1233.method829((byte) 94);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class47.field1233.method803(false);
                            class93 var19 = (class93) class38.field921.method716((byte) 67, var16);
                            class153.field3426 = true;
                            if (var19 == null) {
                                var19 = (class93) class111.field2675.method716((byte) 119, var16);
                                class153.field3426 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            class24.field588 = var19;
                            class102.field2479 = new class103(class24.field588.field2295 + var20 + var18);
                            class102.field2479.method818(false, var15);
                            class102.field2479.method819(var18, (byte) -76);
                            class105.field2562 = 8;
                            class47.field1233.field2501 = 0;
                        } else if (class105.field2562 == 0) {
                            if (class47.field1233.field2498[0] == -1) {
                                class47.field1233.field2501 = 0;
                                class105.field2562 = 1;
                            } else {
                                class24.field588 = null;
                            }
                        }
                    } else {
                        int var21 = class102.field2479.field2498.length - class24.field588.field2295;
                        int var22 = 512 - class105.field2562;
                        if (var22 > var21 - class102.field2479.field2501) {
                            var22 = var21 - class102.field2479.field2501;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        field1261.method734(class102.field2479.field2498, var22, -44, class102.field2479.field2501);
                        if (class155.field3547 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class102.field2479.field2498[class102.field2479.field2501 + var23] = (byte) class81.method682(class102.field2479.field2498[class102.field2479.field2501 + var23], class155.field3547);
                            }
                        }
                        class105.field2562 += var22;
                        class102.field2479.field2501 += var22;
                        if (class102.field2479.field2501 == var21) {
                            if (class24.field588.field2929 == 16711935L) {
                                class153.field3422 = class102.field2479;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class105 var26 = class151.field3381[var25];
                                    if (var26 != null) {
                                        class153.field3422.field2501 = var25 * 8 + 5;
                                        int var27 = class153.field3422.method803(false);
                                        int var28 = class153.field3422.method803(false);
                                        var26.method860(var27, 83, var28);
                                    }
                                }
                            } else {
                                class124.field2848.reset();
                                class124.field2848.update(class102.field2479.field2498, 0, var21);
                                int var24 = (int) class124.field2848.getValue();
                                if (class24.field588.field2300 != var24) {
                                    try {
                                        field1261.method729(false);
                                    } catch (Exception var30) {
                                    }
                                    field1261 = null;
                                    class85.field2107++;
                                    class155.field3547 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class85.field2107 = 0;
                                class121.field2764 = 0;
                                class24.field588.field2306.method863((class24.field588.field2929 & 0xFF0000L) == 16711680L, (byte) -47, (int) (class24.field588.field2929 & 0xFFFFL), class153.field3426, class102.field2479.field2498);
                            }
                            class24.field588.method1009((byte) 106);
                            class102.field2479 = null;
                            if (class153.field3426) {
                                class34.field798--;
                            } else {
                                class128.field2933--;
                            }
                            class105.field2562 = 0;
                            class24.field588 = null;
                        } else {
                            if (class105.field2562 != 512) {
                                break;
                            }
                            class105.field2562 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    field1261.method729(false);
                } catch (Exception var29) {
                }
                class121.field2764++;
                field1261 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method374(int arg0) {
        field1255 = null;
        field1270 = null;
        field1268 = null;
        field1264 = null;
        if (arg0 != 5) {
            field1268 = null;
        }
        field1262 = null;
        field1254 = null;
        field1253 = null;
        field1263 = null;
        field1257 = null;
        field1261 = null;
        field1269 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIII)V")
    public static final void method375(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class155.field3546 == 0 && !class1.field17) {
            class82.method689(0, 21, (byte) 117, class94.field2314, arg1 - arg2, -arg3 + arg4, class28.field682);
            class109.field2650++;
        }
        field1256++;
        int var5 = -1;
        if (arg0) {
            field1254 = null;
        }
        for (int var6 = 0; var6 < class70.field1709; var6++) {
            int var7 = class70.field1720[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 29 & 0x3;
            int var10 = var7 >> 7 & 0x7F;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var9 == 2 && class43.field1151.method577(class46.field1222, var8, var10, var7) >= 0) {
                    class148 var12 = class31.method238(-29628, var11);
                    if (var12.field3364 != null) {
                        var12 = var12.method1124(-11);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class155.field3546 == 1) {
                        class18.field457++;
                        class82.method689(var7, 6, (byte) 113, class104.method853(-120, new class60[] { class85.field2121, class59.field1437, var12.field3341 }), var8, var10, class81.field2014);
                    } else if (!class1.field17) {
                        class60[] var13 = var12.field3342;
                        class51.field1298++;
                        if (class13.field245) {
                            var13 = class19.method154(var13, -30876);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class109.field2655++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 18;
                                    }
                                    if (var14 == 1) {
                                        var15 = 44;
                                    }
                                    if (var14 == 2) {
                                        var15 = 24;
                                    }
                                    if (var14 == 3) {
                                        var15 = 19;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1005;
                                    }
                                    class82.method689(var7, var15, (byte) -121, class104.method853(-111, new class60[] { class103.field2496, var12.field3341 }), var8, var10, var13[var14]);
                                }
                            }
                        }
                        class82.method689(var12.field3344 << 14, 1007, (byte) -110, class104.method853(-94, new class60[] { class103.field2496, var12.field3341 }), var8, var10, class153.field3450);
                    } else if ((class7.field100 & 0x4) == 4) {
                        class82.method689(var7, 11, (byte) -103, class104.method853(-105, new class60[] { class56.field1389, class59.field1437, var12.field3341 }), var8, var10, class35.field857);
                        class41.field1093++;
                    }
                }
                if (var9 == 1) {
                    class53 var16 = class5.field83[var11];
                    if (var16.field1337.field3463 == 1 && (var16.field854 & 0x7F) == 64 && (var16.field828 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class72.field1748; var17++) {
                            class53 var20 = class5.field83[class1.field1[var17]];
                            if (var20 != null && var16 != var20 && var20.field1337.field3463 == 1 && var16.field854 == var20.field854 && var16.field828 == var20.field828) {
                                class45.method352(var10, var8, var20.field1337, class1.field1[var17], 0);
                            }
                        }
                        for (int var18 = 0; var18 < class44.field1170; var18++) {
                            class1 var19 = class81.field2016[class121.field2781[var18]];
                            if (var19 != null && var16.field854 == var19.field854 && var16.field828 == var19.field828) {
                                class16.method130(class121.field2781[var18], (byte) 102, var19, var10, var8);
                            }
                        }
                    }
                    class45.method352(var10, var8, var16.field1337, var11, 0);
                }
                if (var9 == 0) {
                    class1 var21 = class81.field2016[var11];
                    if ((var21.field854 & 0x7F) == 64 && (var21.field828 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class72.field1748; var22++) {
                            class53 var25 = class5.field83[class1.field1[var22]];
                            if (var25 != null && var25.field1337.field3463 == 1 && var21.field854 == var25.field854 && var21.field828 == var25.field828) {
                                class45.method352(var10, var8, var25.field1337, class1.field1[var22], 0);
                            }
                        }
                        for (int var23 = 0; var23 < class44.field1170; var23++) {
                            class1 var24 = class81.field2016[class121.field2781[var23]];
                            if (var24 != null && var21 != var24 && var21.field854 == var24.field854 && var21.field828 == var24.field828) {
                                class16.method130(class121.field2781[var23], (byte) 117, var24, var10, var8);
                            }
                        }
                    }
                    class16.method130(var11, (byte) 102, var21, var10, var8);
                }
                if (var9 == 3) {
                    class66 var26 = class107.field2637[class46.field1222][var8][var10];
                    if (var26 != null) {
                        for (class97 var27 = (class97) var26.method510(26325); var27 != null; var27 = (class97) var26.method495(true)) {
                            class85 var28 = class85.method710(var27.field2386, 10);
                            if (class155.field3546 == 1) {
                                class82.method689(var27.field2386, 1, (byte) 119, class104.method853(-92, new class60[] { class85.field2121, class146.field3280, var28.field2122 }), var8, var10, class81.field2014);
                                class5.field81++;
                            } else if (!class1.field17) {
                                class60[] var29 = var28.field2134;
                                if (class13.field245) {
                                    var29 = class19.method154(var29, -30876);
                                }
                                class28.field669++;
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 42;
                                        }
                                        if (var30 == 1) {
                                            var31 = 58;
                                        }
                                        if (var30 == 2) {
                                            var31 = 4;
                                        }
                                        class103.field2480++;
                                        if (var30 == 3) {
                                            var31 = 45;
                                        }
                                        if (var30 == 4) {
                                            var31 = 12;
                                        }
                                        class82.method689(var27.field2386, var31, (byte) 109, class104.method853(-105, new class60[] { class131.field2986, var28.field2122 }), var8, var10, var29[var30]);
                                    } else if (var30 == 2) {
                                        class82.method689(var27.field2386, 4, (byte) 110, class104.method853(-117, new class60[] { class131.field2986, var28.field2122 }), var8, var10, class13.field231);
                                        class5.field86++;
                                    }
                                }
                                class82.method689(var27.field2386, 1003, (byte) -110, class104.method853(-94, new class60[] { class131.field2986, var28.field2122 }), var8, var10, class153.field3450);
                            } else if ((class7.field100 & 0x1) == 1) {
                                class2.field43++;
                                class82.method689(var27.field2386, 36, (byte) 116, class104.method853(-121, new class60[] { class56.field1389, class146.field3280, var28.field2122 }), var8, var10, class35.field857);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILid;)V")
    public static final void method376(int arg0, int arg1, class60 arg2) {
        int var3 = -5 / ((-arg0 - 18) / 34);
        field1260++;
        class60 var4 = arg2.method431(97).method434((byte) 34);
        boolean var5 = false;
        for (int var6 = 0; var6 < class44.field1170; var6++) {
            class1 var7 = class81.field2016[class121.field2781[var6]];
            if (var7 != null && var7.field21 != null && var7.field21.method426(var4, (byte) 37)) {
                var5 = true;
                class78.method634(class107.field2640.field827[0], 0, 1, class107.field2640.field841[0], 2, var7.field841[0], false, 0, var7.field827[0], -124, 0, 1);
                if (arg1 == 1) {
                    class22.field519.method1214(140, 0);
                    class86.field2150++;
                    class22.field519.method845(128, class121.field2781[var6]);
                } else if (arg1 == 4) {
                    class133.field3027++;
                    class22.field519.method1214(245, 0);
                    class22.field519.method800(-10255, class121.field2781[var6]);
                } else if (arg1 == 6) {
                    class22.field519.method1214(229, 0);
                    class22.field519.method824(23656, class121.field2781[var6]);
                    class112.field2691++;
                } else if (arg1 == 7) {
                    class93.field2292++;
                    class22.field519.method1214(7, 0);
                    class22.field519.method845(128, class121.field2781[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class43.method342(class94.field2314, 0, class104.method853(-109, new class60[] { class41.field1106, var4 }), 2001);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class48(Throwable arg0, String arg1) {
        this.field1250 = arg1;
        this.field1258 = arg0;
    }
}
