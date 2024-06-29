import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class295 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public volatile int field4296 = 0;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[B")
    public byte[] field4298 = new byte[5000];

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public volatile int field4302 = 0;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field4303 = new Object[5000];

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public int field4301 = 0;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[F")
    public float[] field4299 = new float[5000];

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public int field4304 = 0;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "[Z")
    public static boolean[] field4305 = new boolean[100];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lsn;I)V")
    public abstract void method414(class452 arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1883(int arg0) {
        field4300++;
        class526.field7718 = arg0;
        class485.field7177 = arg0;
        class163.field2148 = arg0;
        class375.field5700 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public abstract void method413(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILqa;II)V")
    public static final void method1884(int arg0, class165 arg1, int arg2, int arg3) {
        field4297++;
        if (arg0 < 0 || arg3 < 0 || class409.field6215 == 0 || class473.field7037 == 0) {
            return;
        }
        arg1.method762(class529.field7747, class77.field1116, class409.field6215, class473.field7037);
        if (arg2 > -7) {
            method1884(-89, null, -11, -108);
        }
        arg1.method739(class88.field1262, class308.field4460, class409.field6215, class473.field7037);
        class14 var4 = arg1.method795();
        var4.method140(class487.field7211, class328.field5104, class246.field3445, class28.field404, class520.field7653, class245.field3442);
        arg1.method821(var4);
        if (class414.field6317 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method756();
            int var8 = (arg0 - class529.field7747) * var7 / class409.field6215;
            int var9 = (arg3 - class77.field1116) * var7 / class473.field7037;
            int var10 = arg1.method820();
            int var11 = (arg0 - class529.field7747) * var10 / class409.field6215;
            int var12 = (arg3 - class77.field1116) * var10 / class473.field7037;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method149(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method149(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class398.field6071 > var20 && var22 < class528.field7734) {
                    int var23 = class56.field800.field1866;
                    if (var23 < 3 && (class178.field2382[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class414.field6317[var23].method218(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class56.field800.method637((byte) 52) - 1 << 6) + var19 >> 7;
                        var6 = var21 + (class56.field800.method637((byte) -19) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class44.field641 && (class144.field1922 & 0x40) != 0) {
                    class282 var24 = class178.method1197(class497.field7333, class63.field894, 94);
                    if (var24 == null) {
                        class306.method1922(-1);
                    } else {
                        class24.method227(false, 50, var6, (byte) -66, true, " ->", -1, class48.field691, class468.field7001, 0L, var5);
                    }
                } else {
                    if (class67.field957 == class249.field3474) {
                        class24.method227(false, 9, var6, (byte) -118, true, "", -1, -1, class279.field3963.method2705((byte) 69, class257.field3556), 0L, var5);
                    }
                    class24.method227(false, 8, var6, (byte) -41, true, "", -1, class400.field6096, class179.field2410, 0L, var5);
                    class303.field4432++;
                }
            }
        }
        class507 var25 = class36.field526;
        for (class437 var26 = (class437) var25.method3040(false); var26 != null; var26 = (class437) var25.method3043((byte) -125)) {
            if ((class369.field5631 || class56.field800.field1866 == var26.field6613) && var26.method2657(arg3, 1222, arg0, arg1)) {
                if (var26.field6610 instanceof class96) {
                    class96 var27 = (class96) var26.field6610;
                    int var28 = var27.method637((byte) 21);
                    if ((var28 & 0x1) == 0 && (var27.field1867 & 0x7F) == 0 && (var27.field1862 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1867 & 0x7F) == 64 && (var27.field1862 & 0x7F) == 64) {
                        int var29 = var27.field1867 - (var27.method637((byte) 7) - 1 << 6);
                        int var30 = var27.field1862 - (var27.method637((byte) -118) - 1 << 6);
                        for (int var31 = 0; var31 < class333.field5187; var31++) {
                            class24 var38 = (class24) class406.field6158.method1747((long) class224.field3114[var31], false);
                            if (var38 != null) {
                                class17 var39 = var38.field348;
                                if (class393.field6017 != var39.field3895 && var39.field3884) {
                                    int var40 = var39.field1867 - (var39.field274.field3586 - 1 << 6);
                                    int var41 = var39.field1862 - (var39.field274.field3586 - 1 << 6);
                                    if (var40 >= var29 && var39.field274.field3586 <= (var27.method637((byte) -127) - (var40 - var29 >> 7)) && var41 >= var30 && var39.field274.field3586 <= var27.method637((byte) 64) - (var41 - var30 >> 7)) {
                                        class27.method245((byte) 83, var39, class56.field800.field1866 != var26.field6613);
                                        var39.field3895 = class393.field6017;
                                    }
                                }
                            }
                        }
                        int var32 = class20.field310;
                        int[] var33 = class55.field778;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class96 var35 = class241.field3398[var33[var34]];
                            if (var35 != null && class393.field6017 != var35.field3895 && var27 != var35 && var35.field3884) {
                                int var36 = var35.field1867 - (var35.method637((byte) -28) - 1 << 6);
                                int var37 = var35.field1862 - (var35.method637((byte) -24) - 1 << 6);
                                if (var29 <= var36 && var35.method637((byte) -98) <= var27.method637((byte) -113) - (var36 - var29 >> 7) && var37 >= var30 && var35.method637((byte) -110) <= (var27.method637((byte) -124) - (var37 - var30 >> 7))) {
                                    class462.method2796(false, class56.field800.field1866 != var26.field6613, var35);
                                    var35.field3895 = class393.field6017;
                                }
                            }
                        }
                    }
                    if (class393.field6017 == var27.field3895) {
                        continue;
                    }
                    class462.method2796(false, class56.field800.field1866 != var26.field6613, var27);
                    var27.field3895 = class393.field6017;
                }
                if (var26.field6610 instanceof class17) {
                    class17 var42 = (class17) var26.field6610;
                    if (var42.field274 != null) {
                        if ((var42.field274.field3586 & 0x1) == 0 && (var42.field1867 & 0x7F) == 0 && (var42.field1862 & 0x7F) == 0 || (var42.field274.field3586 & 0x1) == 1 && (var42.field1867 & 0x7F) == 64 && (var42.field1862 & 0x7F) == 64) {
                            int var43 = var42.field1867 - (var42.field274.field3586 - 1 << 6);
                            int var44 = var42.field1862 - (var42.field274.field3586 - 1 << 6);
                            for (int var45 = 0; var45 < class333.field5187; var45++) {
                                class24 var52 = (class24) class406.field6158.method1747((long) class224.field3114[var45], false);
                                if (var52 != null) {
                                    class17 var53 = var52.field348;
                                    if (class393.field6017 != var53.field3895 && var42 != var53 && var53.field3884) {
                                        int var54 = var53.field1867 - (var53.field274.field3586 - 1 << 6);
                                        int var55 = var53.field1862 - (var53.field274.field3586 - 1 << 6);
                                        if (var43 <= var54 && var42.field274.field3586 - (var54 - var43 >> 7) >= var53.field274.field3586 && var44 <= var55 && var53.field274.field3586 <= var42.field274.field3586 - (var55 - var44 >> 7)) {
                                            class27.method245((byte) 103, var53, class56.field800.field1866 != var26.field6613);
                                            var53.field3895 = class393.field6017;
                                        }
                                    }
                                }
                            }
                            int var46 = class20.field310;
                            int[] var47 = class55.field778;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class96 var49 = class241.field3398[var47[var48]];
                                if (var49 != null && class393.field6017 != var49.field3895 && var49.field3884) {
                                    int var50 = var49.field1867 - (var49.method637((byte) 79) - 1 << 6);
                                    int var51 = var49.field1862 - (var49.method637((byte) -112) - 1 << 6);
                                    if (var43 <= var50 && var49.method637((byte) 52) <= var42.field274.field3586 - (var50 - var43 >> 7) && var44 <= var51 && var49.method637((byte) 72) <= var42.field274.field3586 - (var51 - var44 >> 7)) {
                                        class462.method2796(false, class56.field800.field1866 != var26.field6613, var49);
                                        var49.field3895 = class393.field6017;
                                    }
                                }
                            }
                        }
                        if (class393.field6017 == var42.field3895) {
                            continue;
                        }
                        class27.method245((byte) 52, var42, class56.field800.field1866 != var26.field6613);
                        var42.field3895 = class393.field6017;
                    }
                }
                if (var26.field6610 instanceof class13) {
                    int var56 = class331.field5162 + var26.field6609;
                    int var57 = var26.field6612 + class328.field5099;
                    class247 var58 = (class247) class392.field6005.method1747((long) (var56 | var57 << 14 | var26.field6613 << 28), false);
                    if (var58 != null) {
                        for (class274 var59 = (class274) var58.field3448.method457(-2); var59 != null; var59 = (class274) var58.field3448.method458((byte) 114)) {
                            class74 var60 = class103.field1489.method1603((byte) -99, var59.field3810);
                            if (!class44.field641) {
                                if (class56.field800.field1866 == var26.field6613) {
                                    String[] var62 = var60.field1053;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            if (var63 == 0) {
                                                var64 = 17;
                                            }
                                            int var65 = class239.field3364;
                                            if (var63 == 1) {
                                                var64 = 11;
                                            }
                                            if (var63 == 2) {
                                                var64 = 48;
                                            }
                                            if (var63 == 3) {
                                                var64 = 30;
                                            }
                                            if (var60.field1086 == var63) {
                                                var65 = var60.field1058;
                                            }
                                            if (var63 == 4) {
                                                var64 = 5;
                                            }
                                            if (var60.field1068 == var63) {
                                                var65 = var60.field1040;
                                            }
                                            class92.field1367++;
                                            class24.method227(false, var64, var26.field6612, (byte) 101, true, "<col=ff9040>" + var60.field1077, -1, var65, var62[var63], (long) var59.field3810, var26.field6609);
                                        }
                                    }
                                }
                                class244.field3431++;
                                class24.method227(class56.field800.field1866 != var26.field6613, 1003, var26.field6612, (byte) -51, true, "<col=ff9040>" + var60.field1077, -1, class393.field6007, class44.field636.method2705((byte) 69, class257.field3556), (long) var59.field3810, var26.field6609);
                            } else if (class56.field800.field1866 == var26.field6613) {
                                class205 var61 = class364.field5591 == -1 ? null : class83.field1218.method3118(class364.field5591, -13676);
                                if ((class144.field1922 & 0x1) != 0 && (var61 == null || var60.method526(class364.field5591, 0, var61.field2727) != var61.field2727)) {
                                    class24.method227(false, 47, var26.field6612, (byte) -31, true, class466.field6947 + " -> <col=ff9040>" + var60.field1077, -1, class48.field691, class468.field7001, (long) var59.field3810, var26.field6609);
                                    class13.field259++;
                                }
                            }
                        }
                    }
                }
                if (var26.field6610 instanceof class68) {
                    class68 var66 = (class68) var26.field6610;
                    class209 var67 = class432.field6575.method1872(var66.method338(115), false);
                    if (var67.field2934 != null) {
                        var67 = var67.method1435(-1, class288.field4208);
                    }
                    if (var67 != null) {
                        if (!class44.field641) {
                            if (class56.field800.field1866 == var26.field6613) {
                                String[] var69 = var67.field2895;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            if (var70 == 0) {
                                                var71 = 51;
                                            }
                                            int var72 = class239.field3364;
                                            if (var70 == 1) {
                                                var71 = 12;
                                            }
                                            if (var70 == 2) {
                                                var71 = 18;
                                            }
                                            if (var70 == 3) {
                                                var71 = 13;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1012;
                                            }
                                            if (var67.field2957 == var70) {
                                                var72 = var67.field2913;
                                            }
                                            if (var67.field2946 == var70) {
                                                var72 = var67.field2959;
                                            }
                                            class9.field172++;
                                            class24.method227(false, var71, var26.field6612, (byte) 94, true, "<col=00ffff>" + var67.field2919, -1, var72, var69[var70], class278.method1785(var26.field6612, var26.field6609, var66, 6407), var26.field6609);
                                        }
                                    }
                                }
                            }
                            class24.method227(class56.field800.field1866 != var26.field6613, 1007, var26.field6612, (byte) -35, true, "<col=00ffff>" + var67.field2919, -1, class393.field6007, class44.field636.method2705((byte) 69, class257.field3556), (long) var67.field2936, var26.field6609);
                            class505.field7442++;
                        } else if (class56.field800.field1866 == var26.field6613) {
                            class205 var68 = class364.field5591 == -1 ? null : class83.field1218.method3118(class364.field5591, -13676);
                            if ((class144.field1922 & 0x4) != 0 && (var68 == null || var67.method1440(-82, class364.field5591, var68.field2727) != var68.field2727)) {
                                class273.field3805++;
                                class24.method227(false, 25, var26.field6612, (byte) -108, true, class466.field6947 + " -> <col=00ffff>" + var67.field2919, -1, class48.field691, class468.field7001, class278.method1785(var26.field6612, var26.field6609, var66, 6407), var26.field6609);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lsn;I)V")
    public abstract void method424(class452 arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static void method1885(int arg0) {
        field4305 = null;
        if (arg0 != -27832) {
            field4305 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public abstract void method417(byte arg0);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)V")
    public abstract void method416(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLsn;)V")
    public abstract void method420(boolean arg0, class452 arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZFIILo;)V")
    public abstract void method422(boolean arg0, float arg1, int arg2, int arg3, class23 arg4);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public abstract void method419(byte arg0);
}
