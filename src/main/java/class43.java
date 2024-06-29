import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class43 extends class44 {

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    private int field912 = -32768;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Lve;")
    public static class223 field913;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BB)V")
    public static final void method320(byte[] arg0, byte arg1) {
        field910++;
        int var2 = 0;
        if (arg1 <= 109) {
            method323((byte) 38);
        }
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class167.field3184;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class59.field1107;
                if (var3 > 0 && var4 > 0 && class99.field1862 > var3 + 64 && class38.field852 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class38.field852 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class179.field3319[var5][var6] == null) {
                                    class179.field3319[var5][var6] = new byte[4096];
                                }
                                class179.field3319[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class130.field2532[var5][var6] == null) {
                                    class130.field2532[var5][var6] = new byte[4096];
                                }
                                class130.field2532[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class140 var20 = new class140(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class204.field3800[var21][arg1][arg2] == null) {
                    class204.field3800[var21][arg1][arg2] = new class121(var21, arg1, arg2);
                }
            }
            class204.field3800[arg0][arg1][arg2].field2313 = var20;
        } else if (arg3 == 1) {
            class140 var22 = new class140(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class204.field3800[var23][arg1][arg2] == null) {
                    class204.field3800[var23][arg1][arg2] = new class121(var23, arg1, arg2);
                }
            }
            class204.field3800[arg0][arg1][arg2].field2313 = var22;
        } else {
            class61 var24 = new class61(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class204.field3800[var25][arg1][arg2] == null) {
                    class204.field3800[var25][arg1][arg2] = new class121(var25, arg1, arg2);
                }
            }
            class204.field3800[arg0][arg1][arg2].field2288 = var24;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lka;B)Lkh;")
    public static final class116 method322(class109 arg0, byte arg1) {
        if (arg1 == -14) {
            field903++;
            return new class116(arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method701(869322848), arg0.method662((byte) -98));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static final void method323(byte arg0) {
        class18.field435.method1043((byte) -123);
        field907++;
        class59.field1099 = 1;
        if (arg0 != -51) {
            method324(false);
        }
        class40.field884 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static final void method324(boolean arg0) {
        class234.field4369.method596(false);
        field909++;
        if (!arg0) {
            field901 = 80;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field906++;
        class49 var11 = class112.method728(this.field911, (byte) 64).method1318(null, this.field902, (byte) -103, 0);
        if (var11 != null) {
            var11.method89(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field912 = var11.method87();
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
    public static final void method325(byte arg0) {
        if (arg0 > -113) {
            return;
        }
        field914++;
        if (class202.field3703 == 73) {
            int var1 = class21.field505.method680(-20040);
            int var2 = (var1 >> 4 & 0x7) + class107.field1979;
            int var3 = class234.field4365 + (var1 & 0x7);
            int var4 = class21.field505.method675(2);
            int var5 = class21.field505.method705((byte) 74);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class71.field1386[var6];
            if (var2 >= 0 && var3 >= 0 && var2 < 103 && var3 < 103) {
                if (var8 == 0) {
                    class94 var9 = class181.method1135(class217.field4036, var2, var3);
                    if (var9 != null) {
                        int var10 = (int) (var9.field1767 >>> 32) & Integer.MAX_VALUE;
                        if (var6 == 2) {
                            var9.field1764 = new class126(var10, 2, var7 + 4, class217.field4036, var2, var3, var4, false, var9.field1764);
                            var9.field1771 = new class126(var10, 2, var7 + 1 & 0x3, class217.field4036, var2, var3, var4, false, var9.field1771);
                        } else {
                            var9.field1764 = new class126(var10, var6, var7, class217.field4036, var2, var3, var4, false, var9.field1764);
                        }
                    }
                }
                if (var8 == 1) {
                    class201 var11 = class28.method239(class217.field4036, var2, var3);
                    if (var11 != null) {
                        int var12 = (int) (var11.field3670 >>> 32) & Integer.MAX_VALUE;
                        if (var6 == 4 || var6 == 5) {
                            var11.field3682 = new class126(var12, 4, var7, class217.field4036, var2, var3, var4, false, var11.field3682);
                        } else if (var6 == 6) {
                            var11.field3682 = new class126(var12, 4, var7 + 4, class217.field4036, var2, var3, var4, false, var11.field3682);
                        } else if (var6 == 7) {
                            var11.field3682 = new class126(var12, 4, (var7 + 2 & 0x3) + 4, class217.field4036, var2, var3, var4, false, var11.field3682);
                        } else if (var6 == 8) {
                            var11.field3682 = new class126(var12, 4, var7 + 4, class217.field4036, var2, var3, var4, false, var11.field3682);
                            var11.field3674 = new class126(var12, 4, (var7 + 2 & 0x3) + 4, class217.field4036, var2, var3, var4, false, var11.field3674);
                        }
                    }
                }
                if (var8 == 2) {
                    class23 var13 = class146.method923(class217.field4036, var2, var3);
                    if (var6 == 11) {
                        var6 = 10;
                    }
                    if (var13 != null) {
                        var13.field543 = new class126(Integer.MAX_VALUE & (int) (var13.field536 >>> 32), var6, var7, class217.field4036, var2, var3, var4, false, var13.field543);
                    }
                }
                if (var8 == 3) {
                    class5 var14 = class65.method447(class217.field4036, var2, var3);
                    if (var14 != null) {
                        var14.field90 = new class126(Integer.MAX_VALUE & (int) (var14.field84 >>> 32), 22, var7, class217.field4036, var2, var3, var4, false, var14.field90);
                    }
                }
            }
        } else if (class202.field3703 == 91) {
            int var15 = class21.field505.method705((byte) 52);
            int var16 = (var15 >> 4 & 0x7) + class107.field1979;
            int var17 = (var15 & 0x7) + class234.field4365;
            int var18 = class21.field505.method705((byte) 121);
            int var19 = var18 >> 2;
            int var20 = class71.field1386[var19];
            int var21 = var18 & 0x3;
            int var22 = class21.field505.method675(2);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class52.method376(var19, var21, var17, class217.field4036, var22, var20, var16, -1, 0, -2);
            }
        } else if (class202.field3703 == 33) {
            int var23 = class21.field505.method686(44);
            int var24 = class21.field505.method679((byte) 113);
            int var25 = class21.field505.method688((byte) -78);
            int var26 = (var25 & 0x7) + class234.field4365;
            int var27 = class107.field1979 + (var25 >> 4 & 0x7);
            int var28 = class21.field505.method675(2);
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104 && class35.field773 != var28) {
                class43 var29 = new class43();
                var29.field902 = var23;
                var29.field911 = var24;
                if (class237.field4408[class217.field4036][var27][var26] == null) {
                    class237.field4408[class217.field4036][var27][var26] = new class28();
                }
                class237.field4408[class217.field4036][var27][var26].method235(new class27(var29), true);
                class183.method1153(var26, var27, (byte) -57);
            }
        } else if (class202.field3703 == 137) {
            int var30 = class21.field505.method662((byte) -83);
            int var31 = (var30 >> 4 & 0x7) + class107.field1979;
            int var32 = (var30 & 0x7) + class234.field4365;
            int var33 = class21.field505.method675(2);
            int var34 = class21.field505.method675(2);
            int var35 = class21.field505.method675(2);
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class28 var36 = class237.field4408[class217.field4036][var31][var32];
                if (var36 != null) {
                    for (class27 var37 = (class27) var36.method236(0); var37 != null; var37 = (class27) var36.method237(true)) {
                        class43 var38 = var37.field598;
                        if ((var33 & 0x7FFF) == var38.field911 && var38.field902 == var34) {
                            var38.field902 = var35;
                            break;
                        }
                    }
                    class183.method1153(var32, var31, (byte) -24);
                }
            }
        } else {
            if (class202.field3703 == 93) {
                int var39 = class21.field505.method662((byte) -95);
                int var40 = class107.field1979 + (var39 >> 4 & 0x7);
                int var41 = (var39 & 0x7) + class234.field4365;
                int var42 = class21.field505.method675(2);
                if (var42 == 65535) {
                    var42 = -1;
                }
                int var43 = class21.field505.method662((byte) -118);
                int var44 = var43 >> 4 & 0xF;
                int var45 = var43 & 0x7;
                int var46 = class21.field505.method662((byte) -100);
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    int var47 = var44 + 1;
                    if (var40 - var47 <= class17.field432.field1333[0] && var40 + var47 >= class17.field432.field1333[0] && var41 - var47 <= class17.field432.field1358[0] && var41 + var47 >= class17.field432.field1358[0] && class210.field3904 != 0 && var45 > 0 && class52.field993 < 50 && var42 != -1) {
                        class121.field2309[class52.field993] = var42;
                        class115.field2198[class52.field993] = var45;
                        class96.field1792[class52.field993] = var46;
                        class91.field1720[class52.field993] = null;
                        class70.field1307[class52.field993] = (var40 << 16) + (var41 << 8) + var44;
                        class52.field993++;
                    }
                }
            }
            if (class202.field3703 == 184) {
                int var48 = class21.field505.method705((byte) 60);
                int var49 = (var48 & 0x7) + class234.field4365;
                int var50 = (var48 >> 4 & 0x7) + class107.field1979;
                int var51 = class21.field505.method662((byte) -101);
                int var52 = var51 & 0x3;
                int var53 = var51 >> 2;
                int var54 = class71.field1386[var53];
                if (var50 >= 0 && var49 >= 0 && var50 < 104 && var49 < 104) {
                    class52.method376(var53, var52, var49, class217.field4036, -1, var54, var50, -1, 0, -2);
                }
            } else if (class202.field3703 == 154) {
                int var55 = class21.field505.method662((byte) -102);
                int var56 = (var55 >> 4 & 0x7) + class107.field1979;
                int var57 = (var55 & 0x7) + class234.field4365;
                int var58 = class21.field505.method679((byte) 21);
                int var59 = class21.field505.method675(2);
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    class43 var60 = new class43();
                    var60.field911 = var58;
                    var60.field902 = var59;
                    if (class237.field4408[class217.field4036][var56][var57] == null) {
                        class237.field4408[class217.field4036][var56][var57] = new class28();
                    }
                    class237.field4408[class217.field4036][var56][var57].method235(new class27(var60), true);
                    class183.method1153(var57, var56, (byte) -38);
                }
            } else {
                if (class202.field3703 == 80) {
                    int var61 = class21.field505.method691(-128);
                    int var62 = class21.field505.method686(-98);
                    byte var63 = class21.field505.method683(-27400);
                    byte var64 = class21.field505.method707(-27280);
                    byte var65 = class21.field505.method707(-27280);
                    int var66 = class21.field505.method662((byte) -109);
                    int var67 = class107.field1979 + (var66 >> 4 & 0x7);
                    int var68 = (var66 & 0x7) + class234.field4365;
                    int var69 = class21.field505.method675(2);
                    int var70 = class21.field505.method662((byte) -106);
                    int var71 = var70 & 0x3;
                    int var72 = var70 >> 2;
                    int var73 = class71.field1386[var72];
                    byte var74 = class21.field505.method661(255);
                    int var75 = class21.field505.method686(98);
                    class38 var76;
                    if (class35.field773 == var69) {
                        var76 = class17.field432;
                    } else {
                        var76 = class54.field1024[var69];
                    }
                    if (var76 != null) {
                        class65 var77 = class174.method1102(var61, 0);
                        int var78;
                        int var79;
                        if (var71 == 1 || var71 == 3) {
                            var78 = var77.field1209;
                            var79 = var77.field1196;
                        } else {
                            var78 = var77.field1196;
                            var79 = var77.field1209;
                        }
                        int var80 = (var78 >> 1) + var67;
                        int var81 = (var78 + 1 >> 1) + var67;
                        int var82 = var68 + (var79 >> 1);
                        int var83 = var68 + (var79 + 1 >> 1);
                        int[][] var84 = class176.field3295[class217.field4036];
                        int var85 = var84[var80][var82] + var84[var81][var82] + var84[var81][var83] + var84[var80][var83] >> 2;
                        int var86 = (var67 << 7) + (var78 << 6);
                        int var87 = (var68 << 7) + (var79 << 6);
                        class231 var88 = var77.method446((byte) -119, var85, var86, false, var72, var84, var87, var71);
                        if (var88 != null) {
                            if (var65 < var63) {
                                byte var89 = var63;
                                var63 = var65;
                                var65 = var89;
                            }
                            class52.method376(0, 0, var68, class217.field4036, -1, var73, var67, var62 + 1, var75 + 1, -2);
                            var76.field837 = var68 * 128 + var79 * 64;
                            var76.field844 = (class49) var88.field4335;
                            var76.field855 = var85;
                            var76.field841 = class175.field3280 + var75;
                            var76.field843 = var67 + var63;
                            var76.field848 = var67 * 128 + var78 * 64;
                            var76.field833 = class175.field3280 + var62;
                            if (var74 > var64) {
                                byte var90 = var74;
                                var74 = var64;
                                var64 = var90;
                            }
                            var76.field846 = var68 + var74;
                            var76.field830 = var67 + var65;
                            var76.field847 = var64 + var68;
                        }
                    }
                }
                if (class202.field3703 == 195) {
                    int var91 = class21.field505.method662((byte) -104);
                    int var92 = class234.field4365 + (var91 & 0x7);
                    int var93 = (var91 >> 4 & 0x7) + class107.field1979;
                    int var94 = class21.field505.method661(255) + var93;
                    int var95 = var92 + class21.field505.method661(255);
                    int var96 = class21.field505.method700((byte) 64);
                    int var97 = class21.field505.method675(2);
                    int var98 = class21.field505.method662((byte) -125) * 4;
                    int var99 = class21.field505.method662((byte) -101) * 4;
                    int var100 = class21.field505.method675(2);
                    int var101 = class21.field505.method675(2);
                    int var102 = class21.field505.method662((byte) -92);
                    int var103 = class21.field505.method662((byte) -107);
                    if (var93 >= 0 && var92 >= 0 && var93 < 104 && var92 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                        int var104 = var95 * 128 + 64;
                        int var105 = var93 * 128 + 64;
                        int var106 = var94 * 128 + 64;
                        int var107 = var92 * 128 + 64;
                        class37 var108 = new class37(var97, class217.field4036, var105, var107, class71.method482(var107, var105, class217.field4036, (byte) 119) - var98, var100 - -class175.field3280, var101 + class175.field3280, var102, var103, var96, var99);
                        var108.method298(17847, var100 + class175.field3280, var106, var104, class71.method482(var104, var106, class217.field4036, (byte) 119) - var99);
                        class76.field1479.method235(new class149(var108), true);
                    }
                } else if (class202.field3703 == 127) {
                    int var109 = class21.field505.method688((byte) -23);
                    int var110 = (var109 & 0x7) + class234.field4365;
                    int var111 = (var109 >> 4 & 0x7) + class107.field1979;
                    int var112 = class21.field505.method675(2);
                    if (var111 >= 0 && var110 >= 0 && var111 < 104 && var110 < 104) {
                        class28 var113 = class237.field4408[class217.field4036][var111][var110];
                        if (var113 != null) {
                            for (class27 var114 = (class27) var113.method236(0); var114 != null; var114 = (class27) var113.method237(true)) {
                                if ((var112 & 0x7FFF) == var114.field598.field911) {
                                    var114.method826(-22101);
                                    break;
                                }
                            }
                            if (var113.method236(0) == null) {
                                class237.field4408[class217.field4036][var111][var110] = null;
                            }
                            class183.method1153(var110, var111, (byte) -13);
                        }
                    }
                } else if (class202.field3703 == 235) {
                    int var115 = class21.field505.method662((byte) -106);
                    int var116 = (var115 & 0x7) + class234.field4365;
                    int var117 = class107.field1979 + (var115 >> 4 & 0x7);
                    int var118 = class21.field505.method675(2);
                    int var119 = class21.field505.method662((byte) -101);
                    int var120 = class21.field505.method675(2);
                    if (var117 >= 0 && var116 >= 0 && var117 < 104 && var116 < 104) {
                        int var121 = var117 * 128 + 64;
                        int var122 = var116 * 128 + 64;
                        class9 var123 = new class9(var118, class217.field4036, var121, var122, class71.method482(var122, var121, class217.field4036, (byte) 120) - var119, var120, class175.field3280);
                        class98.field1850.method235(new class76(var123), true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLr;Lr;)V")
    public static final void method326(boolean arg0, class178 arg1, class178 arg2) {
        field905++;
        if (class5.field81 == null) {
            class5.field81 = class208.method1335(class78.field1508, 101, 0, class125.field2386);
        }
        if (class186.field3434 == null) {
            class186.field3434 = class210.method1338(class201.field3688, -1, class78.field1508, 0);
        }
        if (class98.field1829 == null) {
            class98.field1829 = class210.method1338(class181.field3351, -1, class78.field1508, 0);
        }
        if (!arg0) {
            method321(123, -48, -93, -65, 88, 82, 59, 75, -109, -64, 41, -110, -42, -113, -3, -24, -122, -35, 31, -56);
        }
        if (class228.field4299 == null) {
            class228.field4299 = class210.method1338(class32.field674, -1, class78.field1508, 0);
        }
        class53.method399(0, 23, 765, 480, 0);
        class53.method397(0, 0, 138, 23, 12425273, 9135624);
        class53.method397(138, 0, 640, 23, 5197647, 2697513);
        arg2.method889(class225.field4204, 69, 15, 0, -1);
        if (class228.field4299 != null) {
            class228.field4299[1].method1394(140, 1);
            arg1.method881(class22.field517, 152, 10, 16777215, -1);
            class228.field4299[0].method1394(140, 12);
            arg1.method881(class179.field3321, 152, 21, 16777215, -1);
        }
        if (class98.field1829 != null) {
            short var3 = 280;
            short var4 = 390;
            short var5 = 500;
            if (class42.field894[0] == 0 && class227.field4247[0] == 0) {
                class98.field1829[2].method1394(var3, 4);
            } else {
                class98.field1829[0].method1394(var3, 4);
            }
            if (class42.field894[0] == 0 && class227.field4247[0] == 1) {
                class98.field1829[3].method1394(var3 + 15, 4);
            } else {
                class98.field1829[1].method1394(var3 + 15, 4);
            }
            arg2.method881(class131.field2546, var3 + 32, 17, 16777215, -1);
            short var6 = 610;
            if (class42.field894[0] == 1 && class227.field4247[0] == 0) {
                class98.field1829[2].method1394(var4, 4);
            } else {
                class98.field1829[0].method1394(var4, 4);
            }
            if (class42.field894[0] == 1 && class227.field4247[0] == 1) {
                class98.field1829[3].method1394(var4 + 15, 4);
            } else {
                class98.field1829[1].method1394(var4 + 15, 4);
            }
            arg2.method881(class68.field1278, var4 + 32, 17, 16777215, -1);
            if (class42.field894[0] == 2 && class227.field4247[0] == 0) {
                class98.field1829[2].method1394(var5, 4);
            } else {
                class98.field1829[0].method1394(var5, 4);
            }
            if (class42.field894[0] == 2 && class227.field4247[0] == 1) {
                class98.field1829[3].method1394(var5 + 15, 4);
            } else {
                class98.field1829[1].method1394(var5 + 15, 4);
            }
            arg2.method881(class132.field2556, var5 + 32, 17, 16777215, -1);
            if (class42.field894[0] == 3 && class227.field4247[0] == 0) {
                class98.field1829[2].method1394(var6, 4);
            } else {
                class98.field1829[0].method1394(var6, 4);
            }
            if (class42.field894[0] == 3 && class227.field4247[0] == 1) {
                class98.field1829[3].method1394(var6 + 15, 4);
            } else {
                class98.field1829[1].method1394(var6 + 15, 4);
            }
            arg2.method881(class197.field3602, var6 + 32, 17, 16777215, -1);
        }
        class53.method399(700, 4, 58, 16, 0);
        arg1.method889(class78.field1512, 729, 16, 16777215, -1);
        class104.field1931 = -1;
        if (class5.field81 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 765 / (var7 + 1);
        int var10 = 480 / (var8 + 1);
        int var11;
        int var12;
        do {
            var11 = var9;
            var12 = var10;
            if (class201.field3665 <= (var9 - 1) * var10) {
                var9--;
            }
            if (class201.field3665 <= (var10 - 1) * var9) {
                var10--;
            }
            if ((var10 - 1) * var9 >= class201.field3665) {
                var10--;
            }
        } while (var10 != var12 || var9 != var11);
        int var13 = (765 - var7 * var9) / (var9 + 1);
        int var14 = (480 - var8 * var10) / (var10 + 1);
        if (var14 > 5) {
            var14 = 5;
        }
        if (var13 > 5) {
            var13 = 5;
        }
        int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
        int var16 = (480 - var8 * var10 - (var10 + -1) * var14) / 2;
        int var17 = var16 + 23;
        int var18 = var15;
        int var19 = 0;
        for (int var20 = 0; var20 < class201.field3665; var20++) {
            class151 var21 = class99.field1863[var20];
            boolean var22 = true;
            class222 var23 = class56.method414(-117, var21.field2916);
            if (var21.field2916 == -1) {
                var22 = false;
                var23 = class59.field1110;
            } else if (var21.field2916 > 1980) {
                var22 = false;
                var23 = class124.field2370;
            }
            if (var18 <= class94.field1769 && class137.field2651 >= var17 && var7 + var18 > class94.field1769 && var8 + var17 > class137.field2651 && var22) {
                class104.field1931 = var20;
                class5.field81[var21.field2926 ? 1 : 0].method166(var18, var17, 128, 16777215);
            } else {
                class5.field81[var21.field2926 ? 1 : 0].method172(var18, var17);
            }
            if (class186.field3434 != null) {
                class186.field3434[(var21.field2926 ? 8 : 0) + var21.field2930].method1394(var18 + 29, var17);
            }
            arg2.method889(class56.method414(-114, var21.field2923), var18 + 15, var8 / 2 + var17 + 5, 0, -1);
            arg1.method889(var23, var18 + 60, var8 / 2 + 5 + var17, 268435455, -1);
            var17 += var8 + var14;
            int var10000 = ~var10;
            var19++;
            if (var10000 >= ~var19) {
                var18 += var13 + var7;
                var17 = var16 + 23;
                var19 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    public static void method327(byte arg0) {
        field913 = null;
        if (arg0 != -32) {
            method324(false);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lab;Lab;ILab;)V")
    public static final void method328(class3 arg0, class3 arg1, int arg2, class3 arg3) {
        field904++;
        class20.field452 = arg3.method14(-32249, class237.field4423);
        class212.field3943 = arg0.method14(-32249, class204.field3778);
        class94.field1772 = arg0.method14(-32249, class21.field502);
        class175.field3289 = arg0.method14(-32249, class29.field645);
        class221.field4104 = arg0.method14(-32249, class221.field4100);
        if (arg2 <= 30) {
            return;
        }
        class80.field1546 = arg0.method14(-32249, class103.field1919);
        class125.field2386 = arg0.method14(-32249, class128.field2503);
        class201.field3688 = arg0.method14(-32249, class44.field916);
        class181.field3351 = arg0.method14(-32249, class3.field39);
        class32.field674 = arg0.method14(-32249, class157.field3019);
        class34.field763 = arg0.method14(-32249, class32.field664);
        class35.field774 = arg1.method14(-32249, class187.field3462);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()I")
    public final int method87() {
        field908++;
        return this.field912;
    }
}
