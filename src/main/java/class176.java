import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class176 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lla;")
    public static class319 field2349 = new class319(42, 3);

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lni;")
    public static class367 field2355 = new class367(76, -1);

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[Lpw;")
    public static class507[] field2356 = new class507[5];

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Z")
    public static boolean field2357;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lrh;")
    public class176 field2348;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lrh;")
    public class176 field2351;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Luu;")
    public static class191 field2358;

    static {
        for (int var0 = 0; var0 < field2356.length; var0++) {
            field2356[var0] = new class507();
        }
        field2357 = true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method1180(int arg0, int arg1, int arg2) {
        if (arg1 == 32322) {
            field2353++;
            return (arg2 & 0x70000) != 0 | class412.method2538(arg2, arg0, 34) || class418.method2556(arg1 - 32450, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 20)
    public static final int method1181(String arg0, int arg1, int arg2) {
        field2352++;
        return arg1 == -1 ? class163.method1051(arg0, arg2, false, true) : 46;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 31)
    public static void method1182(int arg0) {
        field2356 = null;
        field2358 = null;
        field2355 = null;
        if (arg0 <= -76) {
            field2349 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lpa;I)V", line = 45)
    public static final void method1183(class254 arg0, int arg1) {
        field2354++;
        if (arg1 != -1) {
            method1181(null, -63, 16);
        }
        if (class530.field7796 == arg0) {
            int var2 = class409.field6214.method1087(false);
            int var3 = (var2 >> 4 & 0xF) + class337.field5231 * 2;
            int var4 = (var2 & 0xF) + class288.field4215 * 2;
            boolean var5 = class409.field6214.method1087(false) != 0;
            int var6 = var3 + class409.field6214.method1088((byte) -105);
            int var7 = class409.field6214.method1088((byte) 44) + var4;
            int var8 = class409.field6214.method1056(1024);
            int var9 = class409.field6214.method1074(-635989152);
            int var10 = class409.field6214.method1087(false) * 4;
            int var11 = class409.field6214.method1087(false) * 4;
            int var12 = class409.field6214.method1074(arg1 ^ 0x25E86C9F);
            int var13 = class409.field6214.method1074(-635989152);
            int var14 = class409.field6214.method1087(false);
            if (var14 == 255) {
                var14 = -1;
            }
            int var15 = class409.field6214.method1074(arg1 - 635989151);
            if (var3 >= 0 && var4 >= 0 && class398.field6071 * 2 > var3 && (class398.field6071 * 2) > var4 && var6 >= 0 && var7 >= 0 && var6 < (class528.field7734 * 2) && var7 < (class528.field7734 * 2) && var9 != 65535) {
                int var16 = var6 * 64;
                int var17 = var11 << 0;
                int var18 = var7 * 64;
                int var19 = var4 * 64;
                int var20 = var15 << 0;
                int var21 = var10 << 0;
                int var22 = var3 * 64;
                class467 var23 = new class467(var9, class73.field1004, var22, var19, var21, class393.field6017 + var12, class393.field6017 + var13, var14, var20, var8, var17, var5);
                var23.method2812(arg1 ^ 0xFFFFFF80, var18, class352.method2264(-119, class73.field1004, var18, var16) - var17, class393.field6017 + var12, var16);
                client.field2679.method453((byte) 113, new class357(var23));
            }
        } else if (class153.field1992 == arg0) {
            int var24 = class409.field6214.method1087(false);
            boolean var25 = (var24 & 0x80) != 0;
            int var26 = ((var24 & 0x3C) >> 3) + class337.field5231;
            int var27 = class288.field4215 + (var24 & 0x7);
            int var28 = class409.field6214.method1088((byte) -107) + var26;
            int var29 = var27 + class409.field6214.method1088((byte) 44);
            int var30 = class409.field6214.method1056(arg1 ^ 0xFFFFFBFF);
            int var31 = class409.field6214.method1074(-635989152);
            int var32 = class409.field6214.method1087(false) * 4;
            int var33 = class409.field6214.method1087(false) * 4;
            int var34 = class409.field6214.method1074(arg1 - 635989151);
            int var35 = class409.field6214.method1074(-635989152);
            int var36 = class409.field6214.method1087(false);
            int var37 = class409.field6214.method1074(-635989152);
            if (var36 == 255) {
                var36 = -1;
            }
            if (var26 >= 0 && var27 >= 0 && class398.field6071 > var26 && var27 < class528.field7734 && var28 >= 0 && var29 >= 0 && var28 < class398.field6071 && class528.field7734 > var29 && var31 != 65535) {
                int var38 = var28 * 128 + 64;
                int var39 = var29 * 128 + 64;
                int var40 = var33 << 0;
                int var41 = var27 * 128 + 64;
                int var42 = var32 << 0;
                int var43 = var37 << 0;
                int var44 = var26 * 128 + 64;
                class467 var45 = new class467(var31, class73.field1004, var44, var41, var42, class393.field6017 + var34, var35 - -class393.field6017, var36, var43, var30, var40, var25);
                var45.method2812(arg1 ^ 0xFFFFFF80, var39, class352.method2264(arg1 ^ 0x66, class73.field1004, var39, var38) - var40, class393.field6017 + var34, var38);
                client.field2679.method453((byte) 124, new class357(var45));
            }
        } else if (class41.field605 == arg0) {
            int var46 = class409.field6214.method1067(false);
            int var47 = var46 >> 2;
            int var48 = var46 & 0x3;
            int var49 = class23.field334[var47];
            int var50 = class409.field6214.method1067(false);
            int var51 = (var50 >> 4 & 0x7) + class337.field5231;
            int var52 = class288.field4215 + (var50 & 0x7);
            if (class107.method683(arg1 ^ 0x79, class405.field6149) || var51 >= 0 && var52 >= 0 && var51 < class398.field6071 && var52 < class528.field7734) {
                class351.method2258(var51, -1, var52, 0, var49, -1, class73.field1004, var47, var48, true);
            }
        } else if (class276.field3937 == arg0) {
            int var53 = class409.field6214.method1100(arg1 - 25468);
            int var54 = class409.field6214.method1086((byte) -77);
            int var55 = class288.field4215 + (var54 & 0x7);
            int var56 = class328.field5099 + var55;
            int var57 = (var54 >> 4 & 0x7) + class337.field5231;
            int var58 = class331.field5162 + var57;
            int var59 = class409.field6214.method1074(-635989152);
            boolean var60 = var57 >= 0 && var55 >= 0 && class398.field6071 > var57 && var55 < class528.field7734;
            if (var60 || class107.method683(-122, class405.field6149)) {
                class445.method2703(new class274(var53, var59), (byte) 41, var56, class73.field1004, var58);
                if (var60) {
                    class103.method671(class73.field1004, var57, var55, -121);
                }
            }
        } else if (class530.field7784 == arg0) {
            int var61 = class409.field6214.method1086((byte) 110);
            int var62 = ((var61 & 0x73) >> 4) + class337.field5231;
            int var63 = class288.field4215 + (var61 & 0x7);
            int var64 = class409.field6214.method1079(-13703);
            if (var64 == 65535) {
                var64 = -1;
            }
            int var65 = class409.field6214.method1057(arg1 + 123);
            int var66 = var65 >> 2;
            int var67 = var65 & 0x3;
            int var68 = class23.field334[var66];
            class436.method2649(var68, var63, var62, class73.field1004, var66, var64, var67, (byte) -83);
        } else if (class478.field7078 == arg0) {
            class409.field6214.method1087(false);
            int var69 = class409.field6214.method1087(false);
            int var70 = (var69 >> 4 & 0x7) + class337.field5231;
            int var71 = (var69 & 0x7) + class288.field4215;
            int var72 = class409.field6214.method1074(arg1 ^ 0x25E86C9F);
            int var73 = class409.field6214.method1087(false);
            int var74 = class409.field6214.method1090(arg1);
            String var75 = class409.field6214.method1064(false);
            class208.method1431(var71, var70, var75, 0, var73, class73.field1004, var72, var74);
        } else if (class333.field5184 == arg0) {
            int var76 = class409.field6214.method1087(false);
            int var77 = (var76 >> 4 & 0xF) + class337.field5231 * 2;
            int var78 = (var76 & 0xF) + class288.field4215 * 2;
            boolean var79 = class409.field6214.method1087(false) != 0;
            int var80 = class409.field6214.method1088((byte) -124) + var77;
            int var81 = class409.field6214.method1088((byte) -111) + var78;
            int var82 = class409.field6214.method1056(1024);
            int var83 = class409.field6214.method1056(1024);
            int var84 = class409.field6214.method1074(-635989152);
            byte var85 = class409.field6214.method1088((byte) -86);
            int var86 = class409.field6214.method1087(false) * 4;
            int var87 = class409.field6214.method1074(-635989152);
            int var88 = class409.field6214.method1074(-635989152);
            int var89 = class409.field6214.method1087(false);
            if (var89 == 255) {
                var89 = -1;
            }
            int var90 = class409.field6214.method1074(arg1 ^ 0x25E86C9F);
            if (var77 >= 0 && var78 >= 0 && (class398.field6071 * 2) > var77 && class398.field6071 * 2 > var78 && var80 >= 0 && var81 >= 0 && var80 < class528.field7734 * 2 && class528.field7734 * 2 > var81 && var84 != 65535) {
                int var91 = var90 << 0;
                int var92 = var80 * 64;
                int var93 = var78 * 64;
                int var94 = var81 * 64;
                int var95 = var77 * 64;
                int var96 = var85 << 0;
                int var97 = var86 << 0;
                if (var82 != 0) {
                    class275 var98 = null;
                    int var100;
                    if (var82 >= 0) {
                        int var99 = var82 - 1;
                        var100 = (var99 & 0x7C84) >> 11;
                        int var101 = var99 & 0x7FF;
                        class24 var102 = (class24) class406.field6158.method1747((long) var101, false);
                        if (var102 != null) {
                            var98 = var102.field348;
                        }
                    } else {
                        int var103 = -var82 - 1;
                        var100 = (var103 & 0x7E42) >> 11;
                        int var104 = var103 & 0x7FF;
                        if (class350.field5400 == var104) {
                            var98 = class56.field800;
                        } else {
                            var98 = class241.field3398[var104];
                        }
                    }
                    if (var98 != null) {
                        class485 var105 = var98.method1759(-77);
                        if (var105.field7154 != null && var105.field7154[var100] != null) {
                            int var106 = var105.field7154[var100][0];
                            int var107 = var105.field7154[var100][2];
                            int var108 = var98.field3840.method1008(67);
                            int var109 = class428.field6502[var108];
                            int var110 = class428.field6501[var108];
                            int var111 = var106 * var110 + var107 * var109 >> 15;
                            int var112 = var107 * var110 - (var106 * var109) >> 15;
                            var95 += var111;
                            var96 -= var105.field7154[var100][1];
                            var93 += var112;
                        }
                    }
                }
                class467 var114 = new class467(var84, class73.field1004, var95, var93, var96, var87 + class393.field6017, class393.field6017 + var88, var89, var91, var83, var97, var79);
                var114.method2812(127, var94, class352.method2264(arg1 - 94, class73.field1004, var94, var92) - var97, class393.field6017 + var87, var92);
                client.field2679.method453((byte) 117, new class357(var114));
            }
        } else if (class352.field5444 == arg0) {
            int var115 = class409.field6214.method1074(arg1 ^ 0x25E86C9F);
            int var116 = class409.field6214.method1087(false);
            class432.field6575.method1872(var115, false).method1438(-28746, var116);
        } else if (class448.field6744 == arg0) {
            int var117 = class409.field6214.method1079(-13703);
            int var118 = class409.field6214.method1087(false);
            int var119 = (var118 & 0x7) + class288.field4215;
            int var120 = class328.field5099 + var119;
            int var121 = (var118 >> 4 & 0x7) + class337.field5231;
            int var122 = class331.field5162 + var121;
            class247 var123 = (class247) class392.field6005.method1747((long) (class73.field1004 << 28 | var120 << 14 | var122), false);
            if (var123 != null) {
                for (class274 var124 = (class274) var123.field3448.method445(33); var124 != null; var124 = (class274) var123.field3448.method451(false)) {
                    if ((var117 & 0x7FFF) == var124.field3810) {
                        var124.method25(-13489);
                        break;
                    }
                }
                if (var123.field3448.method455(true)) {
                    var123.method25(-13489);
                }
                if (var121 >= 0 && var119 >= 0 && var121 < class398.field6071 && var119 < class528.field7734) {
                    class103.method671(class73.field1004, var121, var119, -118);
                }
            }
        } else if (class49.field700 == arg0) {
            int var125 = class409.field6214.method1087(false);
            int var126 = class337.field5231 + ((var125 & 0x7C) >> 4);
            int var127 = class288.field4215 + (var125 & 0x7);
            int var128 = class409.field6214.method1074(-635989152);
            if (var128 == 65535) {
                var128 = -1;
            }
            int var129 = class409.field6214.method1087(false);
            int var130 = var129 >> 4 & 0xF;
            int var131 = var129 & 0x7;
            int var132 = class409.field6214.method1087(false);
            int var133 = class409.field6214.method1087(false);
            if (var126 >= 0 && var127 >= 0 && class398.field6071 > var126 && var127 < class528.field7734) {
                int var134 = var130 + 1;
                if (var126 - var134 <= class56.field800.field3917[0] && class56.field800.field3917[0] <= var126 + var134 && class56.field800.field3915[0] >= (var127 - var134) && class56.field800.field3915[0] <= (var127 + var134)) {
                    class395.method2456(var128, var131, var133, 50, (class73.field1004 << 24) + (var126 << 16) + (var127 << 8) + var130, var132);
                }
            }
        } else if (class126.field1712 == arg0) {
            int var135 = class409.field6214.method1067(false);
            int var136 = var135 >> 2;
            int var137 = var135 & 0x3;
            int var138 = class23.field334[var136];
            int var139 = class409.field6214.method1058(arg1 - 882090519);
            int var140 = class409.field6214.method1067(false);
            int var141 = ((var140 & 0x71) >> 4) + class337.field5231;
            int var142 = class288.field4215 + (var140 & 0x7);
            if (class107.method683(-117, class405.field6149) || var141 >= 0 && var142 >= 0 && var141 < class398.field6071 && class528.field7734 > var142) {
                class351.method2258(var141, var139, var142, 0, var138, -1, class73.field1004, var136, var137, true);
            }
        } else if (class24.field347 == arg0) {
            byte var143 = class409.field6214.method1088((byte) 71);
            int var144 = class409.field6214.method1100(-25469);
            int var145 = class409.field6214.method1074(-635989152);
            byte var146 = class409.field6214.method1088((byte) 86);
            int var147 = class409.field6214.method1067(false);
            int var148 = var147 >> 2;
            int var149 = var147 & 0x3;
            int var150 = class409.field6214.method1079(-13703);
            byte var151 = class409.field6214.method1088((byte) -94);
            byte var152 = class409.field6214.method1103(0);
            int var153 = class409.field6214.method1056(arg1 + 1025);
            int var154 = class409.field6214.method1067(false);
            int var155 = (var154 >> 4 & 0x7) + class337.field5231;
            int var156 = class288.field4215 + (var154 & 0x7);
            if (!class400.field6090.method755()) {
                class40.method329(var151, var149, var150, arg1 - 32220, var143, var153, var152, var156, var148, var145, var144, class73.field1004, var146, var155);
            }
        } else if (class240.field3375 == arg0) {
            int var157 = class409.field6214.method1087(false);
            int var158 = class337.field5231 + ((var157 & 0x78) >> 4);
            int var159 = (var157 & 0x7) + class288.field4215;
            int var160 = class409.field6214.method1074(arg1 - 635989151);
            int var161 = class409.field6214.method1087(false);
            int var162 = class409.field6214.method1074(-635989152);
            int var163 = class409.field6214.method1087(false);
            if (var158 >= 0 && var159 >= 0 && var158 < class398.field6071 && class528.field7734 > var159) {
                int var164 = var158 * 128 + 64;
                int var165 = var159 * 128 + 64;
                int var166 = class73.field1004;
                if (var166 < 3 && class28.method249(var158, var159, -107)) {
                    var166++;
                }
                class311 var167 = new class311(var160, var162, class393.field6017, class73.field1004, var166, var164, class352.method2264(-116, class73.field1004, var165, var164) - var161, var165, var158, var158, var159, var159, var163);
                class422.field6436.method453((byte) 115, new class266(var167));
            }
        } else if (class279.field3960 == arg0) {
            int var168 = class409.field6214.method1074(-635989152);
            int var169 = class409.field6214.method1079(-13703);
            int var170 = class409.field6214.method1079(-13703);
            int var171 = class409.field6214.method1087(false);
            int var172 = (var171 & 0x7) + class288.field4215;
            int var173 = var172 + class328.field5099;
            int var174 = ((var171 & 0x74) >> 4) + class337.field5231;
            int var175 = class331.field5162 + var174;
            if (class350.field5400 != var170) {
                boolean var176 = var174 >= 0 && var172 >= 0 && class398.field6071 > var174 && class528.field7734 > var172;
                if (var176 || class107.method683(arg1 - 119, class405.field6149)) {
                    class445.method2703(new class274(var168, var169), (byte) 40, var173, class73.field1004, var175);
                    if (var176) {
                        class103.method671(class73.field1004, var174, var172, -116);
                    }
                }
            }
        } else if (class208.field2878 == arg0) {
            int var177 = class409.field6214.method1087(false);
            int var178 = class288.field4215 + (var177 & 0x7);
            int var179 = var178 + class328.field5099;
            int var180 = ((var177 & 0x72) >> 4) + class337.field5231;
            int var181 = class331.field5162 + var180;
            int var182 = class409.field6214.method1074(-635989152);
            int var183 = class409.field6214.method1074(-635989152);
            int var184 = class409.field6214.method1074(-635989152);
            if (class392.field6005 != null) {
                class247 var185 = (class247) class392.field6005.method1747((long) (var179 << 14 | class73.field1004 << 28 | var181), false);
                if (var185 != null) {
                    for (class274 var186 = (class274) var185.field3448.method445(33); var186 != null; var186 = (class274) var185.field3448.method451(false)) {
                        if ((var182 & 0x7FFF) == var186.field3810 && var186.field3808 == var183) {
                            var186.method25(arg1 - 13488);
                            var186.field3808 = var184;
                            class445.method2703(var186, (byte) 88, var179, class73.field1004, var181);
                            break;
                        }
                    }
                    if (var180 >= 0 && var178 >= 0 && var180 < class398.field6071 && class528.field7734 > var178) {
                        class103.method671(class73.field1004, var180, var178, -114);
                    }
                }
            }
        } else {
            class395.method2457("T3 - " + arg0, null, arg1 + 2);
            class420.method2566(-5, false);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 694)
    public final void method1184(int arg0) {
        field2350++;
        if (this.field2351 == null) {
            return;
        }
        this.field2351.field2348 = this.field2348;
        this.field2348.field2351 = this.field2351;
        int var2 = 41 / ((43 - arg0) / 37);
        this.field2351 = null;
        this.field2348 = null;
    }
}
