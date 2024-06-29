import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class116 extends RuntimeException {

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Ljava/lang/String;")
    public String field2913;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2911;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    public static boolean field2910 = false;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field2916 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lke;")
    public static class65 field2905 = class1.method17("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WMissbrauch melden(W Option benutzen", -114);

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lke;")
    private static class65 field2912 = class1.method17("Your profile will be transferred in:", -116);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lke;")
    public static class65 field2918 = field2912;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lrc;")
    public static class104 field2917 = new class104(4096);

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field2920 = 1;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lke;")
    private static class65 field2921 = class1.method17("Connecting to update server", -128);

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lke;")
    public static class65 field2923 = class1.method17(" zuerst von Ihrer Freunde)2Liste(Q", -122);

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lke;")
    public static class65 field2924 = field2921;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lc;")
    public static class16 field2922;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lkb;")
    public static class61 field2907;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lpa;")
    public static class90 field2909;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method945(boolean arg0) {
        field2906++;
        if (class113.field2823 == 171) {
            int var1 = class58.field1575.method300(122);
            int var2 = class58.field1575.method342(-114);
            int var3 = (var2 >> 4 & 0x7) + class88.field2354;
            int var4 = (var2 & 0x7) + class128.field3104;
            int var5 = class58.field1575.method346((byte) -6);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class104.field2688[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                int var9 = class24.field611[class19.field462][var3][var4];
                int var10 = class24.field611[class19.field462][var3 + 1][var4];
                int var11 = class24.field611[class19.field462][var3 + 1][var4 + 1];
                int var12 = class24.field611[class19.field462][var3][var4 + 1];
                if (var8 == 0) {
                    class26 var13 = class89.field2377.method604(class19.field462, var3, var4);
                    if (var13 != null) {
                        int var14 = var13.field650 >> 14 & 0x7FFF;
                        if (var6 == 2) {
                            var13.field631 = new class99(var14, 2, var7 + 4, var9, var10, var11, var12, var1, false);
                            var13.field646 = new class99(var14, 2, var7 + 1 & 0x3, var9, var10, var11, var12, var1, false);
                        } else {
                            var13.field631 = new class99(var14, var6, var7, var9, var10, var11, var12, var1, false);
                        }
                    }
                }
                if (var8 == 1) {
                    class33 var15 = class89.field2377.method602(class19.field462, var3, var4);
                    if (var15 != null) {
                        var15.field857 = new class99(var15.field872 >> 14 & 0x7FFF, 4, 0, var9, var10, var11, var12, var1, false);
                    }
                }
                if (var8 == 2) {
                    class24 var16 = class89.field2377.method634(class19.field462, var3, var4);
                    if (var6 == 11) {
                        var6 = 10;
                    }
                    if (var16 != null) {
                        var16.field594 = new class99(var16.field616 >> 14 & 0x7FFF, var6, var7, var9, var10, var11, var12, var1, false);
                    }
                }
                if (var8 == 3) {
                    class31 var17 = class89.field2377.method596(class19.field462, var3, var4);
                    if (var17 != null) {
                        var17.field804 = new class99(var17.field810 >> 14 & 0x7FFF, 22, var7, var9, var10, var11, var12, var1, false);
                    }
                }
            }
        } else if (class113.field2823 == 210) {
            int var18 = class58.field1575.method334(127);
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = class104.field2688[var19];
            int var22 = class58.field1575.method334(122);
            int var23 = (var22 & 0x7) + class128.field3104;
            int var24 = (var22 >> 4 & 0x7) + class88.field2354;
            if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                class3.method29(var23, var20, -91, var24, 0, -1, var19, class19.field462, -1, var21);
            }
        } else if (arg0) {
            if (class113.field2823 == 37) {
                int var25 = class58.field1575.method342(-81);
                int var26 = var25 >> 2;
                int var27 = class104.field2688[var26];
                int var28 = class58.field1575.method346((byte) -6);
                int var29 = var25 & 0x3;
                int var30 = (var28 >> 4 & 0x7) + class88.field2354;
                int var31 = (var28 & 0x7) + class128.field3104;
                int var32 = class58.field1575.method326(255);
                if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                    class3.method29(var31, var29, -114, var30, 0, var32, var26, class19.field462, -1, var27);
                }
            } else if (class113.field2823 == 85) {
                int var33 = class58.field1575.method300(123);
                int var34 = class58.field1575.method317(0);
                int var35 = (var34 & 0x7) + class128.field3104;
                int var36 = class88.field2354 + (var34 >> 4 & 0x7);
                int var37 = class58.field1575.method324(13);
                if (var36 >= 0 && var35 >= 0 && var36 < 104 && var35 < 104) {
                    class93 var38 = new class93();
                    var38.field2451 = var37;
                    var38.field2443 = var33;
                    if (class64.field1691[class19.field462][var36][var35] == null) {
                        class64.field1691[class19.field462][var36][var35] = new class53();
                    }
                    class64.field1691[class19.field462][var36][var35].method425(var38, 16);
                    class97.method816(var35, var36, -12);
                }
            } else if (class113.field2823 == 60) {
                int var39 = class58.field1575.method300(127);
                int var40 = class58.field1575.method346((byte) -6);
                int var41 = (var40 >> 4 & 0x7) + class88.field2354;
                int var42 = (var40 & 0x7) + class128.field3104;
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    class53 var43 = class64.field1691[class19.field462][var41][var42];
                    if (var43 != null) {
                        for (class93 var44 = (class93) var43.method421(1); var44 != null; var44 = (class93) var43.method428(22743)) {
                            if ((var39 & 0x7FFF) == var44.field2451) {
                                var44.method133(2);
                                break;
                            }
                        }
                        if (var43.method421(1) == null) {
                            class64.field1691[class19.field462][var41][var42] = null;
                        }
                        class97.method816(var42, var41, -12);
                    }
                }
            } else if (class113.field2823 == 200) {
                int var45 = class58.field1575.method300(121);
                int var46 = class58.field1575.method334(103);
                int var47 = (var46 >> 4 & 0x7) + class88.field2354;
                int var48 = (var46 & 0x7) + class128.field3104;
                int var49 = class58.field1575.method314(false);
                int var50 = class58.field1575.method314(false);
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && class94.field2492 != var49) {
                    class93 var51 = new class93();
                    var51.field2443 = var45;
                    var51.field2451 = var50;
                    if (class64.field1691[class19.field462][var47][var48] == null) {
                        class64.field1691[class19.field462][var47][var48] = new class53();
                    }
                    class64.field1691[class19.field462][var47][var48].method425(var51, 16);
                    class97.method816(var48, var47, -12);
                }
            } else if (class113.field2823 == 51) {
                int var52 = class58.field1575.method334(103);
                int var53 = (var52 & 0x7) + class128.field3104;
                int var54 = (var52 >> 4 & 0x7) + class88.field2354;
                int var55 = class58.field1575.method326(255);
                int var56 = class58.field1575.method334(108);
                int var57 = class58.field1575.method326(255);
                if (var54 >= 0 && var53 >= 0 && var54 < 104 && var53 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    class64 var60 = new class64(var55, class19.field462, var59, var58, class58.method495(var58, var59, true, class19.field462) - var56, var57, class76.field2028);
                    class110.field2720.method425(var60, 16);
                }
            } else {
                if (class113.field2823 == 83) {
                    int var61 = class58.field1575.method334(104);
                    int var62 = (var61 & 0x7) + class128.field3104;
                    int var63 = class88.field2354 + (var61 >> 4 & 0x7);
                    int var64 = class58.field1575.method326(255);
                    int var65 = class58.field1575.method334(116);
                    int var66 = var65 >> 4 & 0xF;
                    int var67 = var65 & 0x7;
                    int var68 = class58.field1575.method334(104);
                    if (var63 >= 0 && var62 >= 0 && var63 < 104 && var62 < 104) {
                        int var69 = var66 + 1;
                        if (var63 - var69 <= class32.field833.field1105[0] && var63 + var69 >= class32.field833.field1105[0] && class32.field833.field1097[0] >= var62 - var69 && var62 + var69 >= class32.field833.field1097[0] && class27.field706 != 0 && var67 > 0 && class4.field73 < 50) {
                            class62.field1652[class4.field73] = var64;
                            class28.field742[class4.field73] = var67;
                            class7.field130[class4.field73] = var68;
                            class81.field2154[class4.field73] = null;
                            class90.field2390[class4.field73] = (var63 << 16) - (-(var62 << 8) - var66);
                            class4.field73++;
                        }
                    }
                }
                if (class113.field2823 == 187) {
                    byte var70 = class58.field1575.method331(119);
                    byte var71 = class58.field1575.method309(-85);
                    int var72 = class58.field1575.method326(255);
                    int var73 = class58.field1575.method326(255);
                    byte var74 = class58.field1575.method331(126);
                    byte var75 = class58.field1575.method309(-90);
                    int var76 = class58.field1575.method317(0);
                    int var77 = var76 >> 2;
                    int var78 = var76 & 0x3;
                    int var79 = class104.field2688[var77];
                    int var80 = class58.field1575.method324(119);
                    int var81 = class58.field1575.method324(123);
                    int var82 = class58.field1575.method317(0);
                    int var83 = class88.field2354 + (var82 >> 4 & 0x7);
                    int var84 = class128.field3104 + (var82 & 0x7);
                    class114 var85;
                    if (class94.field2492 == var81) {
                        var85 = class32.field833;
                    } else {
                        var85 = class52.field1324[var81];
                    }
                    if (var85 != null) {
                        class19 var86 = class54.method435(32247, var72);
                        int var87 = class24.field611[class19.field462][var83][var84];
                        int var88 = class24.field611[class19.field462][var83 + 1][var84];
                        int var89 = class24.field611[class19.field462][var83 + 1][var84 + 1];
                        int var90 = class24.field611[class19.field462][var83][var84 + 1];
                        class37 var91 = var86.method155(var78, var90, (byte) 84, var88, var77, var87, var89);
                        if (var91 != null) {
                            if (var71 > var70) {
                                byte var92 = var71;
                                var71 = var70;
                                var70 = var92;
                            }
                            if (var74 < var75) {
                                byte var93 = var75;
                                var75 = var74;
                                var74 = var93;
                            }
                            class3.method29(var84, 0, 113, var83, var80 + 1, -1, 0, class19.field462, var73 + 1, var79);
                            var85.field2869 = var91;
                            int var94 = var86.field432;
                            int var95 = var86.field415;
                            var85.field2858 = var80 + class76.field2028;
                            if (var78 == 1 || var78 == 3) {
                                var94 = var86.field415;
                                var95 = var86.field432;
                            }
                            var85.field2842 = var83 * 128 + var95 * 64;
                            var85.field2855 = var84 * 128 + var94 * 64;
                            var85.field2841 = class76.field2028 + var73;
                            var85.field2835 = class58.method495(var85.field2855, var85.field2842, true, class19.field462);
                            var85.field2843 = var70 + var83;
                            var85.field2844 = var71 + var83;
                            var85.field2840 = var74 + var84;
                            var85.field2868 = var75 + var84;
                        }
                    }
                }
                if (class113.field2823 == 80) {
                    int var96 = class58.field1575.method334(104);
                    int var97 = (var96 & 0x7) + class128.field3104;
                    int var98 = class88.field2354 + (var96 >> 4 & 0x7);
                    int var99 = class58.field1575.method326(255);
                    int var100 = class58.field1575.method326(255);
                    int var101 = class58.field1575.method326(255);
                    if (var98 >= 0 && var97 >= 0 && var98 < 104 && var97 < 104) {
                        class53 var102 = class64.field1691[class19.field462][var98][var97];
                        if (var102 != null) {
                            for (class93 var103 = (class93) var102.method421(1); var103 != null; var103 = (class93) var102.method428(22743)) {
                                if ((var99 & 0x7FFF) == var103.field2451 && var103.field2443 == var100) {
                                    var103.field2443 = var101;
                                    break;
                                }
                            }
                            class97.method816(var97, var98, -12);
                        }
                    }
                } else if (class113.field2823 == 249) {
                    int var104 = class58.field1575.method334(120);
                    int var105 = (var104 >> 4 & 0x7) + class88.field2354;
                    int var106 = (var104 & 0x7) + class128.field3104;
                    int var107 = var105 + class58.field1575.method307(true);
                    int var108 = class58.field1575.method307(true) + var106;
                    int var109 = class58.field1575.method322((byte) -84);
                    int var110 = class58.field1575.method326(255);
                    int var111 = class58.field1575.method334(127) * 4;
                    int var112 = class58.field1575.method334(104) * 4;
                    int var113 = class58.field1575.method326(255);
                    int var114 = class58.field1575.method326(255);
                    int var115 = class58.field1575.method334(111);
                    int var116 = class58.field1575.method334(109);
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                        int var117 = var106 * 128 + 64;
                        int var118 = var105 * 128 + 64;
                        int var119 = var107 * 128 + 64;
                        class29 var120 = new class29(var110, class19.field462, var118, var117, class58.method495(var117, var118, true, class19.field462) - var111, class76.field2028 + var113, var114 + class76.field2028, var115, var116, var109, var112);
                        int var121 = var108 * 128 + 64;
                        var120.method240(var121, false, class76.field2028 + var113, var119, class58.method495(var121, var119, true, class19.field462) - var112);
                        class17.field356.method425(var120, 16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 551)
    public static final void method946(int arg0) {
        field2919++;
        class29 var1 = (class29) class17.field356.method421(arg0 + 7967);
        if (arg0 != -7966) {
            field2912 = null;
        }
        while (var1 != null) {
            if (class19.field462 != var1.field762 || class76.field2028 > var1.field789) {
                var1.method133(2);
            } else if (class76.field2028 >= var1.field778) {
                if (var1.field793 > 0) {
                    class129 var2 = class31.field817[var1.field793 - 1];
                    if (var2 != null && var2.field1067 >= 0 && var2.field1067 < 13312 && var2.field1070 >= 0 && var2.field1070 < 13312) {
                        var1.method240(var2.field1070, false, class76.field2028, var2.field1067, class58.method495(var2.field1070, var2.field1067, true, var1.field762) - var1.field770);
                    }
                }
                if (var1.field793 < 0) {
                    int var3 = -var1.field793 - 1;
                    class114 var4;
                    if (class94.field2492 == var3) {
                        var4 = class32.field833;
                    } else {
                        var4 = class52.field1324[var3];
                    }
                    if (var4 != null && var4.field1067 >= 0 && var4.field1067 < 13312 && var4.field1070 >= 0 && var4.field1070 < 13312) {
                        var1.method240(var4.field1070, false, class76.field2028, var4.field1067, class58.method495(var4.field1070, var4.field1067, true, var1.field762) - var1.field770);
                    }
                }
                var1.method241(class22.field524, (byte) 101);
                class89.field2377.method599(class19.field462, (int) var1.field787, (int) var1.field776, (int) var1.field772, 60, var1, var1.field767, -1, false);
            }
            var1 = (class29) class17.field356.method428(arg0 ^ 0xFFFFB835);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 608)
    public static final void method947(int arg0, int arg1) {
        field2915++;
        if (!class28.method232(arg1, true)) {
            return;
        }
        class27[] var2 = class88.field2361[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class27 var4 = var2[var3];
            if (var4 != null) {
                var4.field674 = 0;
                var4.field657 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 640)
    public static void method948(int arg0) {
        if (arg0 > -20) {
            field2920 = -82;
        }
        field2909 = null;
        field2918 = null;
        field2905 = null;
        field2912 = null;
        field2922 = null;
        field2921 = null;
        field2923 = null;
        field2924 = null;
        field2907 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 667)
    public class116(Throwable arg0, String arg1) {
        this.field2913 = arg1;
        this.field2911 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILda;IIII)V", line = 689)
    public static final void method949(int arg0, class19 arg1, int arg2, int arg3, int arg4, int arg5) {
        class87 var6 = new class87();
        var6.field2307 = arg1.field448;
        var6.field2316 = arg4;
        var6.field2341 = arg5 * 128;
        var6.field2342 = arg1.field426;
        field2908++;
        var6.field2310 = arg0 * 128;
        if (arg3 != 1) {
            return;
        }
        int var7 = arg1.field432;
        var6.field2313 = arg1.field422;
        int var8 = arg1.field415;
        var6.field2311 = arg1.field450;
        var6.field2305 = arg1.field451 * 128;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg1.field432;
            var7 = arg1.field415;
        }
        var6.field2335 = (arg5 + var7) * 128;
        var6.field2321 = (arg0 + var8) * 128;
        if (arg1.field439 != null) {
            var6.field2308 = arg1;
            var6.method782((byte) -115);
        }
        class13.field262.method425(var6, 16);
        if (var6.field2342 != null) {
            var6.field2333 = (int) ((double) (var6.field2307 - var6.field2311) * Math.random()) + var6.field2311;
        }
    }
}
