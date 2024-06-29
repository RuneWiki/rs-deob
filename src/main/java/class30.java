import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lid;")
    public static class60 field709 = class11.method72("compass", (byte) -116);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lid;")
    private static class60 field712 = class11.method72("Loaded update list", (byte) -105);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lid;")
    public static class60 field704 = field712;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lid;")
    public class60 field710;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lae;")
    public static class6 field700;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Z")
    public boolean field699;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII[Lfd;IIII)V")
    public static final void method226(int arg0, int arg1, int arg2, int arg3, class40[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field705++;
        for (int var9 = 0; var9 < arg4.length; var9++) {
            class40 var10 = arg4[var9];
            if (var10 != null && (!var10.field977 || var10.field938 == 0 || var10.field974 || class97.method770(var10, -1370253216) != 0 || class77.field1888 == var10) && var10.field1028 == arg5 && (!var10.field977 || !class45.method351(var10, 23154))) {
                int var11 = var10.field1033 + arg1;
                int var12 = var10.field1073 + arg2;
                if (class154.field3474 == var10) {
                    class151.field3389 = var12;
                    class75.field1814 = var11;
                    class133.field3037 = true;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field938 == 2) {
                    var13 = arg6;
                    var14 = arg8;
                    var15 = arg0;
                    var16 = arg7;
                } else if (var10.field938 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var10.field1014 + var12;
                    int var20 = var10.field1038 + var11;
                    if (var11 > var20) {
                        var17 = var20;
                        var20 = var11;
                    }
                    if (var19 < var12) {
                        var18 = var19;
                        var19 = var12;
                    }
                    var13 = arg6 >= var18 ? arg6 : var18;
                    var16 = arg7 < var17 ? var17 : arg7;
                    var19++;
                    var20++;
                    var15 = arg0 > var20 ? var20 : arg0;
                    var14 = arg8 <= var19 ? arg8 : var19;
                } else {
                    var13 = arg6 >= var12 ? arg6 : var12;
                    var16 = arg7 < var11 ? var11 : arg7;
                    int var23 = var10.field1038 + var11;
                    var15 = arg0 <= var23 ? arg0 : var23;
                    int var24 = var12 + var10.field1014;
                    var14 = var24 >= arg8 ? arg8 : var24;
                }
                if (!var10.field977 || var16 < var15 && var13 < var14) {
                    if (var10.field966 == 1337) {
                        class12.method79(-30833, var10);
                    } else if (var10.field966 == 1338) {
                        class38.method303(var11, 128, var12);
                    } else {
                        if (var10.field938 == 0) {
                            if (!var10.field977 && class45.method351(var10, 23154) && class67.field1637 != var10) {
                                continue;
                            }
                            method226(var15, var11 - var10.field996, -var10.field1031 + var12, 20476, arg4, var10.field1008, var13, var16, var14);
                            if (var10.field1052 != null) {
                                method226(var15, var11 - var10.field996, var12 - var10.field1031, arg3, var10.field1052, var10.field1008, var13, var16, var14);
                            }
                            class81 var25 = (class81) class39.field929.method716((byte) 9, (long) var10.field1008);
                            if (var25 != null) {
                                class107.method884(var15, var13, var14, var12, var16, -87, var25.field2012, var11);
                            }
                        }
                        if (var10.field977) {
                            boolean var26;
                            if (class43.field1153 >= var16 && class21.field494 >= var13 && var15 > class43.field1153 && var14 > class21.field494) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class28.field672 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class60.field1466 == 1 && class140.field3185 >= var16 && class139.field3174 >= var13 && class140.field3185 < var15 && var14 > class139.field3174) {
                                var28 = true;
                            }
                            if (var28) {
                                class32.method244(var10, false, class140.field3185 - var11, -var12 + class139.field3174);
                            }
                            if (class154.field3474 != null && class154.field3474 != var10 && var26 && class144.method1110(class97.method770(var10, -1370253216), -13055)) {
                                class10.field174 = var10;
                            }
                            if (class77.field1888 == var10) {
                                class87.field2184 = var12;
                                class131.field2983 = true;
                                class9.field151 = var11;
                            }
                            if (var10.field974) {
                                if (var26 && class151.field3392 != 0 && var10.field1057 != null) {
                                    class15 var29 = new class15();
                                    var29.field361 = var10;
                                    var29.field340 = class151.field3392;
                                    var29.field353 = var10.field1057;
                                    class139.field3164.method508(var29, (byte) 113);
                                }
                                if (class154.field3474 != null || class24.field594 != null || class135.field3067) {
                                    var28 = false;
                                    var26 = false;
                                    var27 = false;
                                }
                                if (!var10.field955 && var28) {
                                    var10.field955 = true;
                                    if (var10.field1072 != null) {
                                        class15 var30 = new class15();
                                        var30.field340 = class139.field3174 - var12;
                                        var30.field342 = class140.field3185 - var11;
                                        var30.field353 = var10.field1072;
                                        var30.field361 = var10;
                                        class139.field3164.method508(var30, (byte) 121);
                                    }
                                }
                                if (var10.field955 && var27 && var10.field1030 != null) {
                                    class15 var31 = new class15();
                                    var31.field361 = var10;
                                    var31.field342 = class43.field1153 - var11;
                                    var31.field353 = var10.field1030;
                                    var31.field340 = class21.field494 - var12;
                                    class139.field3164.method508(var31, (byte) 94);
                                }
                                if (var10.field955 && !var27) {
                                    var10.field955 = false;
                                    if (var10.field1048 != null) {
                                        class15 var32 = new class15();
                                        var32.field340 = class21.field494 - var12;
                                        var32.field342 = class43.field1153 - var11;
                                        var32.field361 = var10;
                                        var32.field353 = var10.field1048;
                                        class82.field2049.method508(var32, (byte) 121);
                                    }
                                }
                                if (var27 && var10.field1006 != null) {
                                    class15 var33 = new class15();
                                    var33.field342 = class43.field1153 - var11;
                                    var33.field353 = var10.field1006;
                                    var33.field340 = class21.field494 - var12;
                                    var33.field361 = var10;
                                    class139.field3164.method508(var33, (byte) 97);
                                }
                                if (!var10.field950 && var26) {
                                    var10.field950 = true;
                                    if (var10.field959 != null) {
                                        class15 var34 = new class15();
                                        var34.field342 = class43.field1153 - var11;
                                        var34.field361 = var10;
                                        var34.field353 = var10.field959;
                                        var34.field340 = class21.field494 - var12;
                                        class139.field3164.method508(var34, (byte) 104);
                                    }
                                }
                                if (var10.field950 && var26 && var10.field1004 != null) {
                                    class15 var35 = new class15();
                                    var35.field353 = var10.field1004;
                                    var35.field361 = var10;
                                    var35.field340 = class21.field494 - var12;
                                    var35.field342 = class43.field1153 - var11;
                                    class139.field3164.method508(var35, (byte) 116);
                                }
                                if (var10.field950 && !var26) {
                                    var10.field950 = false;
                                    if (var10.field986 != null) {
                                        class15 var36 = new class15();
                                        var36.field340 = class21.field494 - var12;
                                        var36.field342 = class43.field1153 - var11;
                                        var36.field353 = var10.field986;
                                        var36.field361 = var10;
                                        class82.field2049.method508(var36, (byte) 92);
                                    }
                                }
                                if (var10.field957 != null) {
                                    class15 var37 = new class15();
                                    var37.field361 = var10;
                                    var37.field353 = var10.field957;
                                    class50.field1278.method508(var37, (byte) 88);
                                }
                                if (var10.field967 != null && class7.field103 > var10.field1066) {
                                    if (var10.field978 == null || class7.field103 - var10.field1066 > 32) {
                                        class15 var42 = new class15();
                                        var42.field353 = var10.field967;
                                        var42.field361 = var10;
                                        class139.field3164.method508(var42, (byte) 104);
                                    } else {
                                        label377: for (int var38 = var10.field1066; var38 < class7.field103; var38++) {
                                            int var39 = class17.field414[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field978.length; var40++) {
                                                if (var10.field978[var40] == var39) {
                                                    class15 var41 = new class15();
                                                    var41.field353 = var10.field967;
                                                    var41.field361 = var10;
                                                    class139.field3164.method508(var41, (byte) 90);
                                                    break label377;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1066 = class7.field103;
                                }
                                if (var10.field999 != null && class154.field3459 > var10.field941) {
                                    if (var10.field1042 == null || class154.field3459 - var10.field941 > 32) {
                                        class15 var47 = new class15();
                                        var47.field361 = var10;
                                        var47.field353 = var10.field999;
                                        class139.field3164.method508(var47, (byte) 115);
                                    } else {
                                        label357: for (int var43 = var10.field941; var43 < class154.field3459; var43++) {
                                            int var44 = class157.field3600[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field1042.length; var45++) {
                                                if (var10.field1042[var45] == var44) {
                                                    class15 var46 = new class15();
                                                    var46.field361 = var10;
                                                    var46.field353 = var10.field999;
                                                    class139.field3164.method508(var46, (byte) 127);
                                                    break label357;
                                                }
                                            }
                                        }
                                    }
                                    var10.field941 = class154.field3459;
                                }
                                if (var10.field988 != null && class106.field2627 > var10.field975) {
                                    if (var10.field1059 == null || class106.field2627 - var10.field975 > 32) {
                                        class15 var52 = new class15();
                                        var52.field353 = var10.field988;
                                        var52.field361 = var10;
                                        class139.field3164.method508(var52, (byte) 111);
                                    } else {
                                        label337: for (int var48 = var10.field975; var48 < class106.field2627; var48++) {
                                            int var49 = class22.field523[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field1059.length; var50++) {
                                                if (var10.field1059[var50] == var49) {
                                                    class15 var51 = new class15();
                                                    var51.field361 = var10;
                                                    var51.field353 = var10.field988;
                                                    class139.field3164.method508(var51, (byte) 87);
                                                    break label337;
                                                }
                                            }
                                        }
                                    }
                                    var10.field975 = class106.field2627;
                                }
                                if (var10.field961 < class115.field2719 && var10.field1003 != null) {
                                    class15 var53 = new class15();
                                    var53.field353 = var10.field1003;
                                    var53.field361 = var10;
                                    class139.field3164.method508(var53, (byte) 96);
                                }
                                if (class42.field1112 > var10.field961 && var10.field956 != null) {
                                    class15 var54 = new class15();
                                    var54.field353 = var10.field956;
                                    var54.field361 = var10;
                                    class139.field3164.method508(var54, (byte) 96);
                                }
                                if (var10.field961 < class137.field3102 && var10.field1001 != null) {
                                    class15 var55 = new class15();
                                    var55.field353 = var10.field1001;
                                    var55.field361 = var10;
                                    class139.field3164.method508(var55, (byte) 111);
                                }
                                if (var10.field961 < class78.field1922 && var10.field1037 != null) {
                                    class15 var56 = new class15();
                                    var56.field353 = var10.field1037;
                                    var56.field361 = var10;
                                    class139.field3164.method508(var56, (byte) 102);
                                }
                                var10.field961 = class78.field1921;
                                if (var10.field969 != null) {
                                    for (int var57 = 0; var57 < class77.field1892; var57++) {
                                        class15 var58 = new class15();
                                        var58.field361 = var10;
                                        var58.field354 = class144.field3237[var57];
                                        var58.field334 = class64.field1602[var57];
                                        var58.field353 = var10.field969;
                                        class139.field3164.method508(var58, (byte) 119);
                                    }
                                }
                            }
                        }
                        if (!var10.field977) {
                            if (class154.field3474 != null || class24.field594 != null || class135.field3067) {
                                return;
                            }
                            if ((var10.field1022 >= 0 || var10.field971 != 0) && class43.field1153 >= var16 && var13 <= class21.field494 && var15 > class43.field1153 && class21.field494 < var14) {
                                if (var10.field1022 >= 0) {
                                    class67.field1637 = arg4[var10.field1022];
                                } else {
                                    class67.field1637 = var10;
                                }
                            }
                            if (var10.field938 == 8 && class43.field1153 >= var16 && var13 <= class21.field494 && class43.field1153 < var15 && var14 > class21.field494) {
                                class89.field2206 = var10;
                            }
                            if (var10.field1071 > var10.field1014) {
                                class137.method1069(class43.field1153, var10, var10.field1014, var10.field1038 + var11, var12, var10.field1071, 4, class21.field494);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != 20476) {
            method227(67, 112);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lid;")
    public static final class60 method227(int arg0, int arg1) {
        field711++;
        if (arg0 < 100000) {
            return class104.method853(-83, new class60[] { class4.field65, class98.method774((byte) -121, arg0), class129.field2956 });
        } else if (arg0 < 10000000) {
            return class104.method853(-102, new class60[] { class145.field3274, class98.method774((byte) -121, arg0 / 1000), class74.field1783, class129.field2956 });
        } else {
            int var2 = -33 % ((arg1 - 55) / 43);
            return class104.method853(-86, new class60[] { class113.field2705, class98.method774((byte) -121, arg0 / 1000000), class45.field1194, class129.field2956 });
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BB)[B")
    public static final byte[] method228(byte[] arg0, byte arg1) {
        field701++;
        int var2 = 22 / ((38 - arg1) / 51);
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class149.method1136(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLie;Lie;BLh;)V")
    public static final void method229(boolean arg0, class61 arg1, class61 arg2, byte arg3, class49 arg4) {
        class9.field152 = arg0;
        class112.field2697 = arg2;
        if (arg3 != 91) {
            field704 = null;
        }
        client.field514 = arg1;
        field707++;
        class112.field2697.method479(10, (byte) -98);
        class141.field3226 = arg4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lid;ZLid;Lie;)[Lae;")
    public static final class6[] method230(class60 arg0, boolean arg1, class60 arg2, class61 arg3) {
        field706++;
        if (arg1) {
            method229(true, null, null, (byte) 87, null);
        }
        int var4 = arg3.method482(13975, arg0);
        int var5 = arg3.method464((byte) -113, arg2, var4);
        return class146.method1119(arg3, var5, 16091, var4);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field709 = null;
        field700 = null;
        if (arg0 >= -78) {
            method226(57, -15, -53, -118, null, 35, -96, -124, -16);
        }
        field704 = null;
        field712 = null;
    }
}
