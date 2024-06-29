import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class260 {

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public int field3927 = -1;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public int field3925 = -1;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    private int field3918 = -1;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    private int field3926 = -1;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public int field3934 = 16777215;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public int field3924 = 0;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public int field3937 = 0;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    private int field3930 = -1;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    private int field3940 = -1;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "Ljava/lang/String;")
    private String field3942 = "";

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public int field3929 = -1;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public int field3928 = 70;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public int field3936 = 0;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3943 = new String[] { method2197(method2196("T\"7\u007f")), method2197(method2196("Q uV#")), method2197(method2196("Ayu=v")), method2197(method2196("Q uW#")), method2197(method2196("Q uT#")), method2197(method2196("Q uQ#")), method2197(method2196("Q u[#")), method2197(method2196("Q uY#")), method2197(method2196("\u001ff")), method2197(method2196("Q uR#")), method2197(method2196("Q uX#")), method2197(method2196("Q uZ#")), method2197(method2196("Q uU#")) };

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "F")
    public static float field3920 = 0.0F;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "Lrf;")
    public class89 field3932;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Ljava/lang/String;", line = 8)
    public final String method2185(int arg0, int arg1) {
        try {
            field3923++;
            String var3 = this.field3942;
            if (arg1 < 119) {
                return null;
            }
            while (true) {
                int var4 = var3.indexOf(field3943[8]);
                if (var4 < 0) {
                    return var3;
                }
                var3 = var3.substring(0, var4) + class99.method943(false, arg0, (byte) 65) + var3.substring(var4 + 2);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3943[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lwq;IB)V", line = 33)
    private final void method2186(class176 arg0, int arg1, byte arg2) {
        try {
            field3939++;
            if (arg2 >= 20) {
                if (arg1 == 1) {
                    this.field3925 = arg0.method1687((byte) -111);
                } else if (arg1 == 2) {
                    this.field3934 = arg0.method1685(false);
                } else if (arg1 == 3) {
                    this.field3926 = arg0.method1687((byte) -97);
                } else if (arg1 == 4) {
                    this.field3930 = arg0.method1687((byte) -56);
                } else if (arg1 == 5) {
                    this.field3918 = arg0.method1687((byte) -46);
                } else if (arg1 == 6) {
                    this.field3940 = arg0.method1687((byte) -98);
                } else if (arg1 == 7) {
                    this.field3937 = arg0.method1657(93);
                } else if (arg1 == 8) {
                    this.field3942 = arg0.method1629(0);
                } else if (arg1 == 9) {
                    this.field3928 = arg0.method1687((byte) -123);
                } else if (arg1 == 10) {
                    this.field3924 = arg0.method1657(112);
                } else if (arg1 == 11) {
                    this.field3929 = 0;
                } else if (arg1 == 12) {
                    this.field3927 = arg0.method1645((byte) -109);
                } else if (arg1 == 13) {
                    this.field3936 = arg0.method1657(124);
                    return;
                } else if (arg1 == 14) {
                    this.field3929 = arg0.method1687((byte) -66);
                    return;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3943[9] + (arg0 == null ? field3943[0] : field3943[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLha;)Lhk;", line = 106)
    public final class107 method2187(boolean arg0, class63 arg1) {
        try {
            field3921++;
            if (this.field3940 < 0) {
                return null;
            }
            class107 var3 = (class107) this.field3932.field1324.method302(-128, (long) this.field3940);
            if (arg0) {
                this.field3936 = 80;
            }
            if (var3 == null) {
                this.method2195(arg1, false);
                var3 = (class107) this.field3932.field1324.method302(-95, (long) this.field3940);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3943[10] + arg0 + ',' + (arg1 == null ? field3943[0] : field3943[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILwq;)V", line = 132)
    public final void method2188(int arg0, class176 arg1) {
        try {
            if (arg0 == 0) {
                while (true) {
                    int var3 = arg1.method1645((byte) -104);
                    if (var3 == 0) {
                        field3931++;
                        return;
                    }
                    this.method2186(arg1, var3, (byte) 42);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3943[6] + arg0 + ',' + (arg1 == null ? field3943[0] : field3943[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)I", line = 161)
    public static final int method2189(int arg0, int arg1) {
        return class148.field2073 == null ? 0 : class148.field2073[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILha;)Lhk;", line = 165)
    public final class107 method2190(int arg0, class63 arg1) {
        try {
            field3938++;
            if (arg0 > this.field3930) {
                return null;
            }
            class107 var3 = (class107) this.field3932.field1324.method302(-123, (long) this.field3930);
            if (var3 == null) {
                this.method2195(arg1, false);
                var3 = (class107) this.field3932.field1324.method302(-116, (long) this.field3930);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3943[3] + arg0 + ',' + (arg1 == null ? field3943[0] : field3943[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BLmj;)Lmj;", line = 197)
    public static final class683 method2191(byte arg0, class683 arg1) {
        try {
            if (arg0 > -102) {
                method2192(30, -88, true, -73, null, 22, null, 21, (byte) -100, -45, null, false, null, false, null, 87, null, 108);
            }
            field3935++;
            class683 var2 = client.method2719(arg1);
            if (var2 == null) {
                var2 = arg1.field9841;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3943[11] + arg0 + ',' + (arg1 == null ? field3943[0] : field3943[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIZI[[[BI[IIBI[IZ[IZ[II[II)V", line = 217)
    public static final void method2192(int arg0, int arg1, boolean arg2, int arg3, byte[][][] arg4, int arg5, int[] arg6, int arg7, byte arg8, int arg9, int[] arg10, boolean arg11, int[] arg12, boolean arg13, int[] arg14, int arg15, int[] arg16, int arg17) {
        try {
            field3919++;
            if (class184.field2931 != -1 && arg13) {
                int[] var18 = class761.field11182.method212();
                int var19 = var18[0];
                int var20 = var18[1];
                int var21 = var18[2];
                int var22 = var18[3];
                int var23 = var21;
                int var24 = var22;
                if (class184.field2931 == 1) {
                    var24 = (int) ((double) class705.field10114 * (double) var22 / (double) class413.field6569);
                    var23 = (int) ((double) class705.field10114 * (double) var21 / (double) class413.field6569);
                }
                if (!class540.field7961) {
                    if (class184.field2931 == 1) {
                        class242.method2089(0);
                    }
                    int var25 = arg17 - class191.field3017;
                    int var26 = arg0 - class51.field619;
                    int var27 = arg5 - class18.field189;
                    int var28 = (int) (((double) var27 * class612.field8804 + (double) var25 * class659.field9418 + (double) var26 * class428.field6752) * (double) var23 / (double) arg1);
                    int var29 = (int) (((double) var27 * class711.field10294 + (double) var25 * class91.field1345 + (double) var26 * class147.field2058) * (double) var24 / (double) arg1);
                    double var30 = (double) var27 * class455.field7033 + (double) var25 * class586.field8500 + (double) var26 * class59.field761;
                    int var32 = class231.field3575 + var28 - class81.field1240;
                    int var33 = class49.field574 + var29 - class304.field4917;
                    int var34 = class263.field4279 + var32;
                    int var35 = var33 + class705.field10114;
                    if (!(var32 < 0 || var33 < 0 || class82.field1244 < var34 || var35 > class413.field6569) || class184.field2931 == 2) {
                        class633.field9093 = var33;
                        if (class184.field2931 == 2) {
                            class641.field9199 = -var30;
                        }
                        class776.field11329 = var32;
                    } else if (var34 > 0 && var35 > 0 && class82.field1244 > var32 && class413.field6569 > var33) {
                        int var36 = var32 - class231.field3575;
                        int var37 = var33 - class49.field574;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (class184.field2931 == 0) {
                            var42 = class641.field9199 + var30;
                            var38 = var36;
                            var39 = var37;
                        } else if (class184.field2931 == 1) {
                            var40 = var36 / class667.field9483;
                            var41 = var37 / class742.field10924;
                            var38 = class667.field9483 * var40;
                            var39 = class742.field10924 * var41;
                            var42 = (class641.field9199 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                        }
                        double var44 = -var42;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        int var51;
                        int var52;
                        int var53;
                        int var54;
                        if (var38 >= 0) {
                            var51 = class82.field1244 - var38;
                            var52 = 0;
                            var53 = var38;
                            if (class184.field2931 == 1) {
                                var50 = var40;
                                var48 = class152.field2133 - var40;
                            }
                            var54 = var51;
                        } else {
                            var52 = -var38;
                            var51 = class82.field1244 + var38;
                            var54 = 0;
                            if (class184.field2931 == 1) {
                                var48 = 0;
                                var50 = -var40;
                            }
                            var53 = var52;
                        }
                        int var55 = 0;
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (var39 < 0) {
                            var56 = class413.field6569 + var39;
                            var57 = 0;
                            var58 = -var39;
                            var59 = var58;
                            var60 = var58;
                            var61 = var56;
                            if (class184.field2931 == 1) {
                                var47 = -var41;
                                var46 = 0;
                                var55 = class258.field3904 + var41;
                                var49 = var47;
                            }
                        } else {
                            var56 = class413.field6569 - var39;
                            var58 = 0;
                            var57 = var56;
                            var60 = 0;
                            if (class184.field2931 == 1) {
                                var49 = 0;
                                var47 = var41;
                                var46 = class258.field3904 - var41;
                                var55 = var46;
                            }
                            var61 = var56;
                            var59 = var39;
                        }
                        class71 var62 = class212.field3353.field3374;
                        for (class281 var63 = (class281) var62.method749(0); var63 != null; var63 = (class281) var62.method747((byte) 21)) {
                            class463[] var64 = var63.field4578;
                            boolean var65 = true;
                            for (int var66 = 0; var66 < var64.length; var66++) {
                                class463 var67 = var64[var66];
                                int var68 = var67.field7121;
                                int var69 = var67.field7117;
                                int var70 = var67.field7118;
                                int var71 = var67.field7116;
                                int var72;
                                var67.field7118 = var72 = var70 - var38;
                                int var73;
                                var67.field7121 = var73 = var68 - var38;
                                int var74 = var67.field7119;
                                int var75;
                                var67.field7116 = var75 = var71 - var39;
                                int var76;
                                var67.field7117 = var76 = var69 - var39;
                                if (var65) {
                                    int var77 = (var73 >= var72 ? var72 : var73) - var74;
                                    if (var77 <= class82.field1244) {
                                        int var78 = (var75 <= var76 ? var75 : var76) - var74;
                                        if (var78 <= class413.field6569) {
                                            int var79 = (var72 <= var73 ? var73 : var72) + var74;
                                            if (var79 >= 0) {
                                                int var80 = (var76 >= var75 ? var76 : var75) + var74;
                                                if (var80 >= 0) {
                                                    var65 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var65) {
                                var63.method1715(-20685);
                                class234.method2033(var63, (byte) 28);
                            }
                        }
                        if (class184.field2931 == 0) {
                            class761.field11182.method248(class765.field11214);
                        }
                        class761.field11182.method161(-var38, -var39);
                        class761.field11182.method199(var52, var58, var51, var56, var44);
                        class625.method4563(class641.field9199 + var44, -80);
                        class784.field11456 = class641.field9199 + var44;
                        if (class184.field2931 == 1) {
                            class401.field6335 = var19 - class81.field1240 - var38;
                            class25.field277 = var20 - class304.field4917 - var39;
                            class543.field7990 = var24;
                            class22.field213 = var23;
                            class761.field11182.method156(class401.field6335, class25.field277, class22.field213, class543.field7990);
                        } else {
                            class401.field6335 = class231.field3575 + var19 - var38 - class81.field1240;
                            class543.field7990 = var24;
                            class25.field277 = class49.field574 + var20 - class304.field4917 - var39;
                            class22.field213 = var23;
                            class761.field11182.method156(class401.field6335, class25.field277, class22.field213, class543.field7990);
                        }
                        class146.method1339(class212.field3353);
                        if (var59 > 0) {
                            class761.field11182.method221(0, var57, class82.field1244, var57 + var59);
                            class761.field11182.method196();
                            class761.field11182.method182(class781.field11393);
                            class644.method4660(arg7, arg17, arg0, arg5, arg4, arg10, arg6, arg16, arg14, arg12, arg9, arg8, arg3, arg15, arg11, arg2, arg1, 1, false);
                        }
                        if (var53 > 0) {
                            class761.field11182.method221(var54, var60, var54 + var53, var60 - -var61);
                            class761.field11182.method196();
                            class761.field11182.method182(class781.field11393);
                            class644.method4660(arg7, arg17, arg0, arg5, arg4, arg10, arg6, arg16, arg14, arg12, arg9, arg8, arg3, arg15, arg11, arg2, arg1, 1, false);
                        }
                        class761.field11182.method227();
                        class111.method1017();
                        if (class184.field2931 == 0) {
                            class761.field11182.method222();
                        }
                        class81.field1240 += var38;
                        class304.field4917 += var39;
                        class641.field9199 += var44;
                        class633.field9093 = class49.field574 + var29 - class304.field4917;
                        class776.field11329 = class231.field3575 + var28 - class81.field1240;
                        if (class184.field2931 == 1) {
                            class537.field7888 += var41;
                            class574.field8297 += var40;
                            for (int var81 = 0; var81 < class258.field3904; var81++) {
                                int var82 = class207.method1870(class258.field3904, 48, class537.field7888 + var81) * class152.field2133;
                                for (int var83 = 0; var83 < class152.field2133; var83++) {
                                    int var84 = var82 + class207.method1870(class152.field2133, 113, class574.field8297 + var83);
                                    boolean var85 = var46 <= var81 && var46 + var47 > var81 || var81 >= var49 && var49 + var55 > var81 && var83 >= var48 && var48 + var50 > var83;
                                    class574.field8295[var84].method3585(class667.field9483 * var83, class742.field10924 * var81, class667.field9483, class742.field10924, 0, 0, var85, true);
                                }
                            }
                        }
                    } else {
                        class540.field7961 = true;
                    }
                }
                if (class540.field7961) {
                    class641.field9199 = 0.0D;
                    class81.field1240 = 0;
                    class633.field9093 = class49.field574;
                    class191.field3017 = arg17;
                    class18.field189 = arg5;
                    class51.field619 = arg0;
                    class304.field4917 = 0;
                    class776.field11329 = class231.field3575;
                    if (class184.field2931 == 0) {
                        class761.field11182.method248(class765.field11214);
                    }
                    class761.field11182.method227();
                    class761.field11182.method196();
                    class761.field11182.method182(class781.field11393);
                    class102.field1499.method2478(class191.field3017, class51.field619, class18.field189, class276.field4418, class751.field11062, class192.field3021);
                    class761.field11182.method254(class102.field1499);
                    if (class184.field2931 == 1) {
                        class543.field7990 = var24;
                        class22.field213 = var23;
                        class401.field6335 = var19;
                        class25.field277 = var20;
                        class761.field11182.method156(class401.field6335, class25.field277, class22.field213, class543.field7990);
                    } else {
                        class543.field7990 = var24;
                        class401.field6335 = class231.field3575 + var19;
                        class25.field277 = class49.field574 + var20;
                        class22.field213 = var23;
                        class761.field11182.method156(class401.field6335, class25.field277, class22.field213, class543.field7990);
                    }
                    class784.field11456 = 0.0D;
                    class212.field3353.method1923(0);
                    class146.method1339(class212.field3353);
                    class644.method4660(arg7, arg17, arg0, arg5, arg4, arg10, arg6, arg16, arg14, arg12, arg9, arg8, arg3, arg15, arg11, arg2, arg1, 1, false);
                    class111.method1017();
                    class540.field7961 = false;
                    if (class184.field2931 == 0) {
                        class761.field11182.method222();
                    }
                    if (class184.field2931 == 1) {
                        class159.method1421(0);
                    }
                }
                if (class184.field2931 == 0) {
                    class765.field11214.method3587(class776.field11329, class633.field9093, class263.field4279, class705.field10114, 0, 0, true, true);
                }
                class143.field2028++;
                class625.method4563(class641.field9199, -73);
                class656.field9405 = class641.field9199;
                if (class184.field2931 == 0 || class184.field2931 == 2) {
                    if (class184.field2931 == 2) {
                        class761.field11182.method182(class781.field11393);
                        class761.field11182.method196();
                    }
                    class304.field4916 = class231.field3575 + var19 - class81.field1240 - class776.field11329;
                    class698.field10049 = var20 - (class633.field9093 + class304.field4917 - class49.field574);
                    class690.field9956 = var24;
                    class768.field11242 = var23;
                    class761.field11182.method156(class304.field4916, class698.field10049, class768.field11242, class690.field9956);
                } else if (class184.field2931 == 1) {
                    class768.field11242 = var23;
                    class690.field9956 = var24;
                    class698.field10049 = var20 - class304.field4917;
                    class304.field4916 = var19 - class81.field1240;
                    class761.field11182.method156(class304.field4916, class698.field10049, class768.field11242, class690.field9956);
                    class761.field11182.method221(class776.field11329, class633.field9093, class776.field11329 + class263.field4279, class633.field9093 - -class705.field10114);
                }
                class644.method4660(arg7, arg17, arg0, arg5, arg4, arg10, arg6, arg16, arg14, arg12, arg9, arg8, arg3, arg15, arg11, arg2, arg1, class184.field2931 == 2 ? 0 : 2, class184.field2931 == 1);
                class761.field11182.method227();
                class761.field11182.method156(var19, var20, var21, var22);
            }
        } catch (RuntimeException var87) {
            throw class590.method4333(var87, field3943[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3943[0] : field3943[2]) + ',' + arg5 + ',' + (arg6 == null ? field3943[0] : field3943[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field3943[0] : field3943[2]) + ',' + arg11 + ',' + (arg12 == null ? field3943[0] : field3943[2]) + ',' + arg13 + ',' + (arg14 == null ? field3943[0] : field3943[2]) + ',' + arg15 + ',' + (arg16 == null ? field3943[0] : field3943[2]) + ',' + arg17 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(ILha;)Lhk;", line = 675)
    public final class107 method2193(int arg0, class63 arg1) {
        try {
            field3922++;
            if (this.field3926 < 0) {
                return null;
            }
            if (arg0 != -9148) {
                this.method2185(112, 33);
            }
            class107 var3 = (class107) this.field3932.field1324.method302(-77, (long) this.field3926);
            if (var3 == null) {
                this.method2195(arg1, false);
                var3 = (class107) this.field3932.field1324.method302(-79, (long) this.field3926);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3943[4] + arg0 + ',' + (arg1 == null ? field3943[0] : field3943[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lha;I)Lhk;", line = 697)
    public final class107 method2194(class63 arg0, int arg1) {
        try {
            field3941++;
            if (~this.field3918 > arg1) {
                return null;
            }
            class107 var3 = (class107) this.field3932.field1324.method302(-84, (long) this.field3918);
            if (var3 == null) {
                this.method2195(arg0, false);
                var3 = (class107) this.field3932.field1324.method302(-107, (long) this.field3918);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3943[1] + (arg0 == null ? field3943[0] : field3943[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lha;Z)V", line = 716)
    private final void method2195(class63 arg0, boolean arg1) {
        try {
            if (arg1) {
                this.field3927 = -68;
            }
            field3933++;
            class58 var3 = this.field3932.field1321;
            if (this.field3926 >= 0 && this.field3932.field1324.method302(-102, (long) this.field3926) == null && var3.method595(-2, this.field3926)) {
                class174 var4 = class174.method1609(var3, this.field3926);
                this.field3932.field1324.method295(arg1, (long) this.field3926, arg0.method213(var4, true));
            }
            if (this.field3918 >= 0 && this.field3932.field1324.method302(-117, (long) this.field3918) == null && var3.method595(-2, this.field3918)) {
                class174 var5 = class174.method1609(var3, this.field3918);
                this.field3932.field1324.method295(false, (long) this.field3918, arg0.method213(var5, true));
            }
            if (this.field3930 >= 0 && this.field3932.field1324.method302(-96, (long) this.field3930) == null && var3.method595(-2, this.field3930)) {
                class174 var6 = class174.method1609(var3, this.field3930);
                this.field3932.field1324.method295(false, (long) this.field3930, arg0.method213(var6, true));
            }
            if (this.field3940 >= 0 && this.field3932.field1324.method302(-111, (long) this.field3940) == null && var3.method595(-2, this.field3940)) {
                class174 var7 = class174.method1609(var3, this.field3940);
                this.field3932.field1324.method295(false, (long) this.field3940, arg0.method213(var7, true));
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3943[5] + (arg0 == null ? field3943[0] : field3943[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2196(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2197(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
