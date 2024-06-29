import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class624 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lwia;")
    private class791 field8744;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public int field8750;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lef;")
    public static class512 field8745 = new class512();

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "F")
    public static float field8749;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLwv;)V")
    public static final void method3589(boolean arg0, class37 arg1) {
        field8746++;
        if (class40.field529 == arg1) {
            int var2 = class110.field1640.method2998(true);
            int var3 = class110.field1640.method2964((byte) 69);
            class277.field4038.method3919(true, var2).method1832(-1, var3);
        } else if (class719.field9961 == arg1) {
            int var4 = class110.field1640.method2964((byte) 78);
            int var5 = (var4 >> 4 & 0x7) + class515.field7287;
            int var6 = (var4 & 0x7) + class413.field5649;
            int var7 = class110.field1640.method2998(true);
            int var8 = class110.field1640.method2964((byte) 101);
            int var9 = class110.field1640.method2998(true);
            int var10 = class110.field1640.method2964((byte) 44);
            if (var5 >= 0 && var6 >= 0 && var5 < class768.field10571 && class350.field4898 > var6) {
                int var11 = var5 * 512 + 256;
                int var12 = var6 * 512 + 256;
                int var13 = class125.field1932;
                if (var13 < 3 && class124.method941(4, var6, var5)) {
                    var13++;
                }
                class485 var14 = new class485(var7, var9, class192.field2961, class125.field1932, var13, var11, class702.method3970(var11, class125.field1932, -20103, var12) - var8, var12, var5, var5, var6, var6, var10);
                class494.field7055.method1727(new class229(var14), (byte) 121);
            }
        } else if (class253.field3723 == arg1) {
            int var15 = class110.field1640.method2964((byte) 94);
            int var16 = (var15 >> 4 & 0xF) + class515.field7287 * 2;
            int var17 = (var15 & 0xF) + class413.field5649 * 2;
            int var18 = class110.field1640.method2964((byte) 78);
            boolean var19 = (var18 & 0x1) != 0;
            boolean var20 = (var18 & 0x2) != 0;
            int var21 = var20 ? var18 >> 2 : -1;
            int var22 = class110.field1640.method2943((byte) 16) + var16;
            int var23 = class110.field1640.method2943((byte) 16) + var17;
            int var24 = class110.field1640.method2988(-3);
            int var25 = class110.field1640.method2988(-3);
            int var26 = class110.field1640.method2998(true);
            int var27 = class110.field1640.method2964((byte) 49);
            int var28;
            if (var20) {
                var28 = (byte) var27;
            } else {
                var28 = var27 * 4;
            }
            int var29 = class110.field1640.method2964((byte) 100) * 4;
            int var30 = class110.field1640.method2998(arg0);
            int var31 = class110.field1640.method2998(true);
            int var32 = class110.field1640.method2964((byte) 118);
            if (var32 == 255) {
                var32 = -1;
            }
            int var33 = class110.field1640.method2998(true);
            if (var16 >= 0 && var17 >= 0 && (class768.field10571 * 2) > var16 && class768.field10571 * 2 > var17 && var22 >= 0 && var23 >= 0 && class350.field4898 * 2 > var22 && var23 < (class350.field4898 * 2) && var26 != 65535) {
                int var34 = var23 * 256;
                int var35 = var28 << 2;
                int var36 = var22 * 256;
                int var37 = var29 << 2;
                int var38 = var17 * 256;
                int var39 = var16 * 256;
                int var40 = var33 << 2;
                if (var24 != 0 && var21 != -1) {
                    class330 var41 = null;
                    if (var24 >= 0) {
                        int var42 = var24 - 1;
                        class205 var43 = (class205) class645.field9014.method2242((long) var42, -1);
                        if (var43 != null) {
                            var41 = var43.field3181;
                        }
                    } else {
                        int var44 = -var24 - 1;
                        if (class250.field3689 == var44) {
                            var41 = class210.field3250;
                        } else {
                            var41 = class767.field10560[var44];
                        }
                    }
                    if (var41 != null) {
                        class539 var45 = var41.method2096(0);
                        if (var45.field7785 != null && var45.field7785[var21] != null) {
                            var35 -= var45.field7785[var21][1];
                        }
                        if (var45.field7751 != null && var45.field7751[var21] != null) {
                            var35 -= var45.field7751[var21][1];
                        }
                    }
                }
                class120 var46 = new class120(var26, class125.field1932, class125.field1932, var39, var38, var35, class192.field2961 + var30, class192.field2961 + var31, var32, var40, var24, var25, var37, var19, var21);
                var46.method904(2048, class192.field2961 + var30, var36, class702.method3970(var36, class125.field1932, -20103, var34) - var37, var34);
                class115.field1750.method1727(new class184(var46), (byte) 118);
            }
        } else if (class212.field3291 == arg1) {
            int var47 = class110.field1640.method2964((byte) 80);
            int var48 = (var47 & 0x7) + class413.field5649;
            int var49 = var48 + class88.field999;
            int var50 = class515.field7287 + (var47 >> 4 & 0x7);
            int var51 = class124.field1922 + var50;
            int var52 = class110.field1640.method2998(true);
            int var53 = class110.field1640.method2998(true);
            int var54 = class110.field1640.method2998(true);
            if (class250.field3692 != null) {
                class102 var55 = (class102) class250.field3692.method2242((long) (class125.field1932 << 28 | var49 << 14 | var51), -1);
                if (var55 != null) {
                    for (class669 var56 = (class669) var55.field1182.method1731((byte) -123); var56 != null; var56 = (class669) var55.field1182.method1724(0)) {
                        if ((var52 & 0x7FFF) == var56.field9305 && var56.field9304 == var53) {
                            var56.method3387((byte) -89);
                            var56.field9304 = var54;
                            class111.method851(class125.field1932, true, var49, var56, var51);
                            break;
                        }
                    }
                    if (var50 >= 0 && var48 >= 0 && var50 < class768.field10571 && var48 < class350.field4898) {
                        class554.method3297(var50, class125.field1932, var48, 1319321449);
                    }
                }
            }
        } else if (class606.field8482 == arg1) {
            class110.field1640.method2964((byte) 103);
            int var57 = class110.field1640.method2964((byte) 60);
            int var58 = (var57 >> 4 & 0x7) + class515.field7287;
            int var59 = (var57 & 0x7) + class413.field5649;
            int var60 = class110.field1640.method2998(true);
            int var61 = class110.field1640.method2964((byte) 50);
            int var62 = class110.field1640.method2960((byte) 94);
            String var63 = class110.field1640.method2996(123);
            class742.method4132(var60, var62, var58, var59, var61, class125.field1932, (byte) 32, var63);
        } else {
            if (!arg0) {
                field8745 = null;
            }
            if (class514.field7276 == arg1) {
                int var64 = class110.field1640.method2998(true);
                int var65 = class110.field1640.method2974((byte) -99);
                int var66 = class110.field1640.method2940((byte) 114);
                int var67 = (var66 & 0x7) + class413.field5649;
                int var68 = class88.field999 + var67;
                int var69 = ((var66 & 0x78) >> 4) + class515.field7287;
                int var70 = class124.field1922 + var69;
                boolean var71 = var69 >= 0 && var67 >= 0 && var69 < class768.field10571 && class350.field4898 > var67;
                if (var71 || class313.method2011(class472.field6621, 120)) {
                    class111.method851(class125.field1932, true, var68, new class669(var65, var64), var70);
                    if (var71) {
                        class554.method3297(var69, class125.field1932, var67, 1319321449);
                    }
                }
            } else if (class415.field5679 == arg1) {
                int var72 = class110.field1640.method2964((byte) 62);
                boolean var73 = (var72 & 0x80) != 0;
                int var74 = ((var72 & 0x3F) >> 3) + class515.field7287;
                int var75 = class413.field5649 + (var72 & 0x7);
                int var76 = var74 + class110.field1640.method2943((byte) 16);
                int var77 = class110.field1640.method2943((byte) 16) + var75;
                int var78 = class110.field1640.method2988(-3);
                int var79 = class110.field1640.method2998(true);
                int var80 = class110.field1640.method2964((byte) 71) * 4;
                int var81 = class110.field1640.method2964((byte) 68) * 4;
                int var82 = class110.field1640.method2998(true);
                int var83 = class110.field1640.method2998(true);
                int var84 = class110.field1640.method2964((byte) 43);
                int var85 = class110.field1640.method2998(arg0);
                if (var84 == 255) {
                    var84 = -1;
                }
                if (var74 >= 0 && var75 >= 0 && class768.field10571 > var74 && var75 < class350.field4898 && var76 >= 0 && var77 >= 0 && var76 < class768.field10571 && class350.field4898 > var77 && var79 != 65535) {
                    int var86 = var85 << 2;
                    int var87 = var76 * 512 + 256;
                    int var88 = var75 * 512 + 256;
                    int var89 = var74 * 512 + 256;
                    int var90 = var81 << 2;
                    int var91 = var80 << 2;
                    int var92 = var77 * 512 + 256;
                    class120 var93 = new class120(var79, class125.field1932, class125.field1932, var89, var88, var91, class192.field2961 + var82, class192.field2961 + var83, var84, var86, 0, var78, var90, var73, -1);
                    var93.method904(2048, class192.field2961 + var82, var87, class702.method3970(var87, class125.field1932, -20103, var92) - var90, var92);
                    class115.field1750.method1727(new class184(var93), (byte) 61);
                }
            } else if (class647.field9056 == arg1) {
                int var94 = class110.field1640.method2964((byte) 40);
                int var95 = class515.field7287 + ((var94 & 0x71) >> 4);
                int var96 = (var94 & 0x7) + class413.field5649;
                int var97 = class110.field1640.method2998(true);
                if (var97 == 65535) {
                    var97 = -1;
                }
                int var98 = class110.field1640.method2964((byte) 100);
                int var99 = (var98 & 0xFD) >> 4;
                int var100 = var98 & 0x7;
                int var101 = class110.field1640.method2964((byte) 88);
                int var102 = class110.field1640.method2964((byte) 92);
                int var103 = class110.field1640.method2998(arg0);
                if (var95 >= 0 && var96 >= 0 && var95 < class768.field10571 && var96 < class350.field4898) {
                    int var104 = var99 + 1;
                    if ((var95 - var104) <= class210.field3250.field4670[0] && (var95 + var104) >= class210.field3250.field4670[0] && (var96 - var104) <= class210.field3250.field4672[0] && var96 + var104 >= class210.field3250.field4672[0]) {
                        class434.method2599(-113, var103, var100, var102, var97, (class125.field1932 << 24) + (var96 << 8) + (var95 << 16) + var99, var101);
                    }
                }
            } else if (class451.field6189 == arg1) {
                int var105 = class110.field1640.method2964((byte) 120);
                int var106 = ((var105 & 0x73) >> 4) + class515.field7287;
                int var107 = class413.field5649 + (var105 & 0x7);
                int var108 = class110.field1640.method2998(true);
                if (var108 == 65535) {
                    var108 = -1;
                }
                int var109 = class110.field1640.method2964((byte) 86);
                int var110 = (var109 & 0xF6) >> 4;
                int var111 = var109 & 0x7;
                int var112 = class110.field1640.method2964((byte) 43);
                int var113 = class110.field1640.method2964((byte) 117);
                int var114 = class110.field1640.method2998(arg0);
                if (var106 >= 0 && var107 >= 0 && class768.field10571 > var106 && class350.field4898 > var107) {
                    int var115 = var110 + 1;
                    if (class210.field3250.field4670[0] >= var106 - var115 && class210.field3250.field4670[0] <= var106 + var115 && (var107 - var115) <= class210.field3250.field4672[0] && var107 + var115 >= class210.field3250.field4672[0]) {
                        class345.method2185((class125.field1932 << 24) + var110 - (-(var106 << 16) - (var107 << 8)), -51, var111, var113, var112, var108, false, var114);
                    }
                }
            } else if (class123.field1910 == arg1) {
                int var116 = class110.field1640.method2940((byte) -119);
                int var117 = ((var116 & 0x74) >> 4) + class515.field7287;
                int var118 = (var116 & 0x7) + class413.field5649;
                int var119 = class110.field1640.method2940((byte) -56);
                int var120 = var119 >> 2;
                int var121 = var119 & 0x3;
                int var122 = class48.field604[var120];
                if (class313.method2011(class472.field6621, 118) || var117 >= 0 && var118 >= 0 && class768.field10571 > var117 && var118 < class350.field4898) {
                    class752.method4188(-1, var120, var121, var122, var117, var118, class125.field1932, 5175);
                }
            } else if (class216.field3358 == arg1) {
                int var123 = class110.field1640.method2938((byte) -67);
                class282 var124 = class277.field4038.method3919(arg0, var123);
                int var125 = class110.field1640.method2964((byte) 49);
                int var126 = class110.field1640.method2964((byte) 105);
                int var127 = class515.field7287 + ((var126 & 0x78) >> 4);
                int var128 = (var126 & 0x7) + class413.field5649;
                int var129 = class110.field1640.method2986(-20802);
                int var130 = var129 >> 2;
                int var131 = class48.field604[var130];
                if (var130 == 11) {
                    var130 = 10;
                }
                int var132 = 0;
                if (var124.field4186 != null) {
                    int var133 = -1;
                    for (int var134 = 0; var134 < var124.field4186.length; var134++) {
                        if (var124.field4186[var134] == var130) {
                            var133 = var134;
                            break;
                        }
                    }
                    var132 = var124.field4098[var133].length;
                }
                int var135 = 0;
                if (var124.field4176 != null) {
                    var135 = var124.field4176.length;
                }
                int var136 = 0;
                if (var124.field4179 != null) {
                    var136 = var124.field4179.length;
                }
                if ((var125 & 0x1) == 1) {
                    class225.method1537(var131, var128, class125.field1932, null, var127, 23);
                } else {
                    int[] var137 = null;
                    if ((var125 & 0x2) == 2) {
                        var137 = new int[var132];
                        for (int var138 = 0; var138 < var132; var138++) {
                            var137[var138] = class110.field1640.method2998(true);
                        }
                    }
                    short[] var139 = null;
                    if ((var125 & 0x4) == 4) {
                        var139 = new short[var135];
                        for (int var140 = 0; var140 < var135; var140++) {
                            var139[var140] = (short) class110.field1640.method2998(true);
                        }
                    }
                    short[] var141 = null;
                    if ((var125 & 0x8) == 8) {
                        var141 = new short[var136];
                        for (int var142 = 0; var142 < var136; var142++) {
                            var141[var142] = (short) class110.field1640.method2998(arg0);
                        }
                    }
                    class225.method1537(var131, var128, class125.field1932, new class520((long) (class77.field880++), var137, var139, var141), var127, 99);
                }
            } else if (class176.field2740 == arg1) {
                int var143 = class110.field1640.method2998(true);
                int var144 = class110.field1640.method2940((byte) -65);
                int var145 = (var144 >> 4 & 0x7) + class515.field7287;
                int var146 = (var144 & 0x7) + class413.field5649;
                int var147 = class110.field1640.method2986(-20802);
                int var148 = var147 >> 2;
                int var149 = var147 & 0x3;
                int var150 = class48.field604[var148];
                if (class313.method2011(class472.field6621, 119) || var145 >= 0 && var146 >= 0 && class768.field10571 > var145 && class350.field4898 > var146) {
                    class752.method4188(var143, var148, var149, var150, var145, var146, class125.field1932, 5175);
                }
            } else if (class400.field5488 == arg1) {
                int var151 = class110.field1640.method2964((byte) 74);
                int var152 = var151 >> 2;
                int var153 = var151 & 0x3;
                int var154 = class48.field604[var152];
                int var155 = class110.field1640.method2982(-1);
                if (var155 == 65535) {
                    var155 = -1;
                }
                int var156 = class110.field1640.method2940((byte) -47);
                int var157 = ((var156 & 0x79) >> 4) + class515.field7287;
                int var158 = (var156 & 0x7) + class413.field5649;
                class683.method3858(var157, var158, var152, var154, (byte) -36, class125.field1932, var153, var155);
            } else if (class289.field4239 == arg1) {
                int var159 = class110.field1640.method2944((byte) 4);
                int var160 = (var159 & 0x7) + class413.field5649;
                int var161 = class88.field999 + var160;
                int var162 = (var159 >> 4 & 0x7) + class515.field7287;
                int var163 = var162 + class124.field1922;
                int var164 = class110.field1640.method2982(-1);
                class102 var165 = (class102) class250.field3692.method2242((long) (var163 | var161 << 14 | class125.field1932 << 28), -1);
                if (var165 != null) {
                    for (class669 var166 = (class669) var165.field1182.method1731((byte) -107); var166 != null; var166 = (class669) var165.field1182.method1724(0)) {
                        if ((var164 & 0x7FFF) == var166.field9305) {
                            var166.method3387((byte) 118);
                            break;
                        }
                    }
                    if (var165.field1182.method1737(-17429)) {
                        var165.method3387((byte) 118);
                    }
                    if (var162 >= 0 && var160 >= 0 && class768.field10571 > var162 && var160 < class350.field4898) {
                        class554.method3297(var162, class125.field1932, var160, 1319321449);
                    }
                }
            } else if (class658.field9180 == arg1) {
                int var167 = class110.field1640.method2986(-20802);
                int var168 = class413.field5649 + (var167 & 0x7);
                int var169 = var168 + class88.field999;
                int var170 = (var167 >> 4 & 0x7) + class515.field7287;
                int var171 = class124.field1922 + var170;
                int var172 = class110.field1640.method2982(-1);
                int var173 = class110.field1640.method2998(arg0);
                int var174 = class110.field1640.method2938((byte) -67);
                if (class250.field3689 != var174) {
                    boolean var175 = var170 >= 0 && var168 >= 0 && var170 < class768.field10571 && class350.field4898 > var168;
                    if (var175 || class313.method2011(class472.field6621, 122)) {
                        class111.method851(class125.field1932, true, var169, new class669(var172, var173), var171);
                        if (var175) {
                            class554.method3297(var170, class125.field1932, var168, 1319321449);
                        }
                    }
                }
            } else {
                class678.method3848("T3 - " + arg1, null, false);
                class195.method1354((byte) -61, false);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZII)V")
    public static final void method3590(byte arg0, boolean arg1, int arg2, int arg3) {
        field8748++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class114.field1746 = arg2;
        class731.field10120 = arg3;
        class488.field6898 = arg1;
        int var4 = 26 % ((arg0 - 49) / 47);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
    public static final boolean method3591(int arg0, int arg1) {
        field8743++;
        if (arg0 >= -112) {
            method3593();
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method3592(int arg0) {
        if (arg0 == -1) {
            field8745 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public static final void method3593() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class16.field297.length; var1++) {
                if (class16.field297[var1].method4249()) {
                    class233.field3510[var1] = class16.field297[var1].method4244();
                } else {
                    synchronized (class16.field297[var1]) {
                        class16.field297[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class16.field297[class16.field297.length - 1].method4247();
                class347.method2202(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class16.field297.length - 1; var4++) {
                        if (!class16.field297[var4].method4249()) {
                            synchronized (class16.field297[var4]) {
                                class16.field297[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class16.field297.length - 2; var6++) {
                            class16.field297[var6].method4247();
                        }
                        class347.method2202(2);
                        while (!class16.field297[0].method4249()) {
                            synchronized (class16.field297[0]) {
                                class16.field297[0].notify();
                            }
                            try {
                                class107.method828(1L, (byte) 87);
                            } catch (Exception var9) {
                            }
                        }
                        class16.field297[0].method4247();
                        return;
                    }
                    try {
                        class107.method828(1L, (byte) -94);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class107.method828(1L, (byte) -123);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Z")
    public static final boolean method3594(int arg0, int arg1) {
        if (arg1 > -75) {
            field8745 = null;
        }
        field8747++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class624(class252 arg0, int arg1, class791 arg2) {
        new class652(64);
        this.field8744 = arg2;
        this.field8750 = this.field8744.method4353(15, true);
    }
}
