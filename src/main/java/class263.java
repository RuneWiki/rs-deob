import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class263 extends class142 {

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "Lmn;")
    public static class162 field4264;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "[B")
    private byte[] field4260;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "[Lo;")
    public static class139[] field4258;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method1802(int arg0, int arg1) {
        field4261++;
        class456 var2 = class233.method1654(arg0, arg1, -16);
        var2.method2862(0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILlm;)V")
    public static final void method1803(int arg0, class31 arg1) {
        field4262++;
        if (class289.field4569 == arg1) {
            int var2 = class279.field4428.method1455(-3387);
            byte var3 = class279.field4428.method1430((byte) -108);
            int var4 = class279.field4428.method1475(255);
            int var5 = (var4 >> 4 & 0x7) + class153.field2044;
            int var6 = (var4 & 0x7) + class52.field698;
            byte var7 = class279.field4428.method1457((byte) -39);
            int var8 = class279.field4428.method1417(2);
            int var9 = class279.field4428.method1465(-551528472);
            byte var10 = class279.field4428.method1430((byte) -96);
            int var11 = class279.field4428.method1426(arg0 - 247);
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = class279.field4428.method1455(arg0 - 3509);
            byte var15 = class279.field4428.method1427(false);
            if (!class19.field198.method1267()) {
                class321.method2145(var15, class219.field3709, var10, var8, var3, var14, var7, var9, var5, var12, var13, (byte) 76, var2, var6);
            }
        } else if (class162.field2355 == arg1) {
            int var16 = class279.field4428.method1445(53);
            int var17 = (var16 & 0x7) + class52.field698;
            int var18 = class126.field1718 + var17;
            int var19 = ((var16 & 0x7A) >> 4) + class153.field2044;
            int var20 = var19 + class453.field7018;
            int var21 = class279.field4428.method1455(-3387);
            int var22 = class279.field4428.method1455(arg0 - 3509);
            int var23 = class279.field4428.method1455(-3387);
            if (class328.field5157 != null) {
                class257 var24 = (class257) class328.field5157.method1122((byte) 59, (long) (class219.field3709 << 28 | var18 << 14 | var20));
                if (var24 != null) {
                    for (class454 var25 = (class454) var24.field4153.method2123(-118); var25 != null; var25 = (class454) var24.field4153.method2126((byte) 61)) {
                        if ((var21 & 0x7FFF) == var25.field7033 && var25.field7025 == var22) {
                            var25.method3149(arg0 - 57);
                            var25.field7025 = var23;
                            class202.method1375(-6407, var20, var25, class219.field3709, var18);
                            break;
                        }
                    }
                    if (var19 >= 0 && var17 >= 0 && class135.field1839 > var19 && class197.field3038 > var17) {
                        class498.method3047((byte) -57, var17, class219.field3709, var19);
                    }
                }
            }
        } else if (class336.field5247 == arg1) {
            int var26 = class279.field4428.method1460(4);
            int var27 = class279.field4428.method1426(-126);
            int var28 = (var27 & 0x7) + class52.field698;
            int var29 = var28 + class126.field1718;
            int var30 = ((var27 & 0x7A) >> 4) + class153.field2044;
            int var31 = class453.field7018 + var30;
            class257 var32 = (class257) class328.field5157.method1122((byte) 59, (long) (var31 | class219.field3709 << 28 | var29 << 14));
            if (var32 != null) {
                for (class454 var33 = (class454) var32.field4153.method2123(92); var33 != null; var33 = (class454) var32.field4153.method2126((byte) 61)) {
                    if ((var26 & 0x7FFF) == var33.field7033) {
                        var33.method3149(52);
                        break;
                    }
                }
                if (var32.field4153.method2122(-12191)) {
                    var32.method3149(113);
                }
                if (var30 >= 0 && var28 >= 0 && class135.field1839 > var30 && class197.field3038 > var28) {
                    class498.method3047((byte) -82, var28, class219.field3709, var30);
                }
            }
        } else if (class409.field6203 == arg1) {
            class279.field4428.method1445(23);
            int var34 = class279.field4428.method1445(41);
            int var35 = (var34 >> 4 & 0x7) + class153.field2044;
            int var36 = (var34 & 0x7) + class52.field698;
            int var37 = class279.field4428.method1455(arg0 - 3509);
            int var38 = class279.field4428.method1445(arg0 ^ 0xFFFFFFCD);
            int var39 = class279.field4428.method1452(3);
            String var40 = class279.field4428.method1448(65535);
            class32.method206(var35, var39, 4, var40, var37, var38, var36, class219.field3709);
        } else if (class165.field2413 == arg1) {
            int var41 = class279.field4428.method1426(arg0 - 250);
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = class361.field5586[var42];
            int var45 = class279.field4428.method1426(-124);
            int var46 = class153.field2044 + (var45 >> 4 & 0x7);
            int var47 = (var45 & 0x7) + class52.field698;
            if (class350.method2314((byte) 89, class357.field5545) || var46 >= 0 && var47 >= 0 && class135.field1839 > var46 && class197.field3038 > var47) {
                class184.method1154(var44, var42, var46, var47, -1, -1, class219.field3709, var43, arg0 - 14, 0);
            }
        } else if (class403.field6073 == arg1) {
            int var48 = class279.field4428.method1417(2);
            if (var48 == 65535) {
                var48 = -1;
            }
            int var49 = class279.field4428.method1422(-121);
            int var50 = ((var49 & 0x70) >> 4) + class153.field2044;
            int var51 = class52.field698 + (var49 & 0x7);
            int var52 = class279.field4428.method1422(73);
            int var53 = var52 >> 2;
            int var54 = var52 & 0x3;
            int var55 = class361.field5586[var53];
            class428.method2708(class219.field3709, arg0 - 110, var50, var53, var54, var51, var48, var55);
        } else if (class536.field7843 == arg1) {
            int var56 = class279.field4428.method1445(53);
            int var57 = ((var56 & 0xF9) >> 4) + class153.field2044 * 2;
            int var58 = (var56 & 0xF) + class52.field698 * 2;
            boolean var59 = class279.field4428.method1445(32) != 0;
            int var60 = class279.field4428.method1427(false) + var57;
            int var61 = class279.field4428.method1427(false) + var58;
            int var62 = class279.field4428.method1456(13329);
            int var63 = class279.field4428.method1456(13329);
            int var64 = class279.field4428.method1455(-3387);
            byte var65 = class279.field4428.method1427(false);
            int var66 = class279.field4428.method1445(41) * 4;
            int var67 = class279.field4428.method1455(-3387);
            int var68 = class279.field4428.method1455(-3387);
            int var69 = class279.field4428.method1445(-106);
            if (var69 == 255) {
                var69 = -1;
            }
            int var70 = class279.field4428.method1455(arg0 ^ 0xFFFFF2BF);
            if (var57 >= 0 && var58 >= 0 && (class135.field1839 * 2) > var57 && var58 < class135.field1839 * 2 && var60 >= 0 && var61 >= 0 && var60 < class197.field3038 * 2 && var61 < class197.field3038 * 2 && var64 != 65535) {
                int var71 = var65 << 0;
                int var72 = var66 << 0;
                int var73 = var61 * 64;
                int var74 = var70 << 0;
                int var75 = var58 * 64;
                int var76 = var60 * 64;
                int var77 = var57 * 64;
                if (var62 != 0) {
                    class55 var78 = null;
                    int var81;
                    if (var62 >= 0) {
                        int var79 = var62 - 1;
                        int var80 = var79 & 0x7FF;
                        var81 = var79 >> 11 & 0xF;
                        class38 var82 = (class38) class365.field5659.method1122((byte) 59, (long) var80);
                        if (var82 != null) {
                            var78 = var82.field378;
                        }
                    } else {
                        int var83 = -var62 - 1;
                        int var84 = var83 & 0x7FF;
                        var81 = var83 >> 11 & 0xF;
                        if (class528.field7772 == var84) {
                            var78 = class358.field5565;
                        } else {
                            var78 = class264.field4276[var84];
                        }
                    }
                    if (var78 != null) {
                        class289 var85 = var78.method418((byte) -41);
                        if (var85.field4520 != null && var85.field4520[var81] != null) {
                            int var86 = var85.field4520[var81][0];
                            int var87 = var85.field4520[var81][2];
                            int var88 = var78.field887.method2986((byte) -125);
                            int var89 = class147.field1988[var88];
                            int var90 = class147.field1986[var88];
                            int var91 = var86 * var90 + var87 * var89 >> 15;
                            int var92 = var87 * var90 - (var86 * var89) >> 15;
                            var77 += var91;
                            var75 += var92;
                            var71 -= var85.field4520[var81][1];
                        }
                    }
                }
                class441 var94 = new class441(var64, class219.field3709, var77, var75, var71, class88.field1278 + var67, var68 - -class88.field1278, var69, var74, var63, var72, var59);
                var94.method2793(class88.field1278 + var67, class532.method3165(class219.field3709, var76, false, var73) + -var72, var76, var73, arg0 - 121);
                class322.field5026.method2124(new class60(var94), (byte) -29);
            }
        } else if (class523.field7738 == arg1) {
            int var95 = class279.field4428.method1455(-3387);
            int var96 = class279.field4428.method1475(255);
            int var97 = (var96 & 0x7) + class52.field698;
            int var98 = class126.field1718 + var97;
            int var99 = ((var96 & 0x7F) >> 4) + class153.field2044;
            int var100 = class453.field7018 + var99;
            int var101 = class279.field4428.method1417(2);
            boolean var102 = var99 >= 0 && var97 >= 0 && class135.field1839 > var99 && class197.field3038 > var97;
            if (var102 || class350.method2314((byte) 84, class357.field5545)) {
                class202.method1375(arg0 ^ 0xFFFFE683, var100, new class454(var101, var95), class219.field3709, var98);
                if (var102) {
                    class498.method3047((byte) -90, var97, class219.field3709, var99);
                }
            }
        } else if (class116.field1618 == arg1) {
            int var103 = class279.field4428.method1445(-128);
            int var104 = (var103 >> 4 & 0xF) + class153.field2044 * 2;
            int var105 = (var103 & 0xF) + class52.field698 * 2;
            boolean var106 = class279.field4428.method1445(arg0 - 244) != 0;
            int var107 = var104 + class279.field4428.method1427(false);
            int var108 = class279.field4428.method1427(false) + var105;
            int var109 = class279.field4428.method1456(13329);
            int var110 = class279.field4428.method1455(arg0 - 3509);
            int var111 = class279.field4428.method1445(53) * 4;
            int var112 = class279.field4428.method1445(arg0 - 243) * 4;
            int var113 = class279.field4428.method1455(-3387);
            int var114 = class279.field4428.method1455(-3387);
            int var115 = class279.field4428.method1445(69);
            if (var115 == 255) {
                var115 = -1;
            }
            int var116 = class279.field4428.method1455(arg0 ^ 0xFFFFF2BF);
            if (var104 >= 0 && var105 >= 0 && (class135.field1839 * 2) > var104 && (class135.field1839 * 2) > var105 && var107 >= 0 && var108 >= 0 && (class197.field3038 * 2) > var107 && var108 < (class197.field3038 * 2) && var110 != 65535) {
                int var117 = var111 << 0;
                int var118 = var105 * 64;
                int var119 = var108 * 64;
                int var120 = var107 * 64;
                int var121 = var112 << 0;
                int var122 = var104 * 64;
                int var123 = var116 << 0;
                class441 var124 = new class441(var110, class219.field3709, var122, var118, var117, class88.field1278 + var113, var114 - -class88.field1278, var115, var123, var109, var121, var106);
                var124.method2793(class88.field1278 + var113, -var121 + class532.method3165(class219.field3709, var120, false, var119), var120, var119, arg0 ^ 0x7B);
                class322.field5026.method2124(new class60(var124), (byte) 112);
            }
        } else if (class154.field2057 == arg1) {
            int var125 = class279.field4428.method1460(arg0 - 118);
            int var126 = class279.field4428.method1426(-128);
            int var127 = class52.field698 + (var126 & 0x7);
            int var128 = var127 + class126.field1718;
            int var129 = class153.field2044 + (var126 >> 4 & 0x7);
            int var130 = class453.field7018 + var129;
            int var131 = class279.field4428.method1431(65280);
            int var132 = class279.field4428.method1431(65280);
            if (class528.field7772 != var132) {
                boolean var133 = var129 >= 0 && var127 >= 0 && class135.field1839 > var129 && class197.field3038 > var127;
                if (var133 || class350.method2314((byte) 121, class357.field5545)) {
                    class202.method1375(arg0 - 6529, var130, new class454(var131, var125), class219.field3709, var128);
                    if (var133) {
                        class498.method3047((byte) -47, var127, class219.field3709, var129);
                    }
                }
            }
        } else if (class335.field5241 == arg1) {
            int var134 = class279.field4428.method1445(-122);
            int var135 = (var134 >> 4 & 0x7) + class153.field2044;
            int var136 = class52.field698 + (var134 & 0x7);
            int var137 = class279.field4428.method1455(-3387);
            if (var137 == 65535) {
                var137 = -1;
            }
            int var138 = class279.field4428.method1445(102);
            int var139 = var138 >> 4 & 0xF;
            int var140 = var138 & 0x7;
            int var141 = class279.field4428.method1445(arg0 ^ 0x2B);
            int var142 = class279.field4428.method1445(57);
            if (var135 >= 0 && var136 >= 0 && class135.field1839 > var135 && var136 < class197.field3038) {
                int var143 = var139 + 1;
                if (var135 - var143 <= class358.field5565.field894[0] && var135 + var143 >= class358.field5565.field894[0] && var136 - var143 <= class358.field5565.field899[0] && class358.field5565.field899[0] <= var136 + var143) {
                    class33.method208(var140, (class219.field3709 << 24) + (var135 << 16) - (-(var136 << 8) - var139), var142, var141, arg0 - 248, var137);
                }
            }
        } else {
            if (arg0 != 122) {
                method1807(66);
            }
            if (class52.field703 == arg1) {
                int var144 = class279.field4428.method1455(arg0 - 3509);
                int var145 = class279.field4428.method1445(90);
                class454.field7029.method3002(-1, var144).method953(var145, 4095);
            } else if (class289.field4567 == arg1) {
                int var146 = class279.field4428.method1445(-101);
                int var147 = ((var146 & 0x72) >> 4) + class153.field2044;
                int var148 = (var146 & 0x7) + class52.field698;
                int var149 = class279.field4428.method1455(arg0 ^ 0xFFFFF2BF);
                int var150 = class279.field4428.method1445(arg0 - 40);
                int var151 = class279.field4428.method1455(-3387);
                int var152 = class279.field4428.method1445(93);
                if (var147 >= 0 && var148 >= 0 && class135.field1839 > var147 && class197.field3038 > var148) {
                    int var153 = var147 * 128 + 64;
                    int var154 = var148 * 128 + 64;
                    int var155 = class219.field3709;
                    if (var155 < 3 && class303.method2041(var148, var147, (byte) 63)) {
                        var155++;
                    }
                    class414 var156 = new class414(var149, var151, class88.field1278, class219.field3709, var155, var153, class532.method3165(class219.field3709, var153, false, var154) - var150, var154, var147, var147, var148, var148, var152);
                    class286.field4506.method2124(new class209(var156), (byte) -122);
                }
            } else if (class517.field7676 == arg1) {
                int var157 = class279.field4428.method1422(-122);
                int var158 = ((var157 & 0x71) >> 4) + class153.field2044;
                int var159 = (var157 & 0x7) + class52.field698;
                int var160 = class279.field4428.method1445(40);
                int var161 = var160 >> 2;
                int var162 = var160 & 0x3;
                int var163 = class361.field5586[var161];
                int var164 = class279.field4428.method1417(arg0 - 120);
                if (class350.method2314((byte) 20, class357.field5545) || var158 >= 0 && var159 >= 0 && var158 < class135.field1839 && class197.field3038 > var159) {
                    class184.method1154(var163, var161, var158, var159, -1, var164, class219.field3709, var162, arg0 - 26, 0);
                }
            } else if (class177.field2583 == arg1) {
                int var165 = class279.field4428.method1445(arg0);
                boolean var166 = (var165 & 0x80) != 0;
                int var167 = class153.field2044 + (var165 >> 3 & 0x7);
                int var168 = (var165 & 0x7) + class52.field698;
                int var169 = var167 + class279.field4428.method1427(false);
                int var170 = var168 + class279.field4428.method1427(false);
                int var171 = class279.field4428.method1456(arg0 ^ 0x346B);
                int var172 = class279.field4428.method1455(-3387);
                int var173 = class279.field4428.method1445(-89) * 4;
                int var174 = class279.field4428.method1445(arg0 ^ 0xFFFFFFC2) * 4;
                int var175 = class279.field4428.method1455(arg0 - 3509);
                int var176 = class279.field4428.method1455(-3387);
                int var177 = class279.field4428.method1445(54);
                int var178 = class279.field4428.method1455(-3387);
                if (var177 == 255) {
                    var177 = -1;
                }
                if (var167 >= 0 && var168 >= 0 && var167 < class135.field1839 && class197.field3038 > var168 && var169 >= 0 && var170 >= 0 && var169 < class135.field1839 && var170 < class197.field3038 && var172 != 65535) {
                    int var179 = var168 * 128 + 64;
                    int var180 = var169 * 128 + 64;
                    int var181 = var170 * 128 + 64;
                    int var182 = var178 << 0;
                    int var183 = var167 * 128 + 64;
                    int var184 = var174 << 0;
                    int var185 = var173 << 0;
                    class441 var186 = new class441(var172, class219.field3709, var183, var179, var185, var175 + class88.field1278, class88.field1278 + var176, var177, var182, var171, var184, var166);
                    var186.method2793(class88.field1278 + var175, -var184 + class532.method3165(class219.field3709, var180, false, var181), var180, var181, arg0 - 121);
                    class322.field5026.method2124(new class60(var186), (byte) 96);
                }
            } else {
                class80.method575(null, "T3 - " + arg1, (byte) -77);
                class496.method3034(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)V")
    public final void method858(int arg0, int arg1, byte arg2) {
        field4263++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4260[var10001] = (byte) (var5 * 3 >> 5);
        this.field4260[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 != -1934) {
            this.field4260 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1804(String arg0, byte arg1) throws ClassNotFoundException {
        field4259++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg1 <= 100) {
                field4264 = null;
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIBIIII)Z")
    public static final boolean method1805(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4257++;
        if (arg5 + arg2 > arg0 && arg0 + arg1 > arg5) {
            if (arg4 <= 78) {
                field4264 = null;
            }
            return (arg3 + arg8) > arg7 && arg6 + arg7 > arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method1806(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -22) {
            method1807(28);
        }
        field4266++;
        this.field4260 = new byte[arg0 * arg1 * 2 * arg2];
        this.method1955(arg0, arg1, arg2, 13698);
        return this.field4260;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class263() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method1807(int arg0) {
        if (arg0 != 3) {
            field4264 = null;
        }
        field4258 = null;
        field4264 = null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)V")
    public static final void method1808(int arg0, int arg1, int arg2) {
        field4265++;
        if (class385.method2479(0, arg0)) {
            class385.method2480(-78, arg2, class433.field6540[arg0]);
            if (arg1 != 5759) {
                method1803(-108, null);
            }
        }
    }
}
