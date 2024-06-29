import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class337 implements Runnable {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lcs;")
    private class225 field4643 = new class225();

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Z")
    private boolean field4654 = false;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public int field4653 = 0;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4652;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
    public static boolean field4644 = false;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "F")
    public static float field4648;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLlg;)V", line = 5)
    public static final void method1870(boolean arg0, class284 arg1) {
        field4649++;
        if (!arg0) {
            field4651 = 106;
        }
        if (class377.field5308 == arg1) {
            int var2 = class387.field5435.method2099(255);
            int var3 = (var2 >> 4 & 0xF) + class424.field6191 * 2;
            int var4 = (var2 & 0xF) + class17.field180 * 2;
            boolean var5 = class387.field5435.method2099(255) != 0;
            int var6 = var3 + class387.field5435.method2081((byte) 12);
            int var7 = var4 + class387.field5435.method2081((byte) 122);
            int var8 = class387.field5435.method2069(-120);
            int var9 = class387.field5435.method2062((byte) 14);
            int var10 = class387.field5435.method2099(255) * 4;
            int var11 = class387.field5435.method2099(255) * 4;
            int var12 = class387.field5435.method2062((byte) 14);
            int var13 = class387.field5435.method2062((byte) 14);
            int var14 = class387.field5435.method2099(255);
            if (var14 == 255) {
                var14 = -1;
            }
            int var15 = class387.field5435.method2099(255);
            if (var3 >= 0 && var4 >= 0 && var3 < (class442.field6435 * 2) && class442.field6435 * 2 > var4 && var6 >= 0 && var7 >= 0 && var6 < (class232.field3217 * 2) && (class232.field3217 * 2) > var7 && var9 != 65535) {
                int var16 = var10 << 0;
                int var17 = var7 * 64;
                int var18 = var3 * 64;
                int var19 = var6 * 64;
                int var20 = var11 << 0;
                int var21 = var4 * 64;
                class465 var22 = new class465(var9, class105.field1435, var18, var21, var16, var12 + class393.field5484, class393.field5484 + var13, var14, var15, var8, var20, var5);
                var22.method2733(var17, class186.method1118(var19, var17, 12840, class105.field1435) - var20, (byte) -103, var19, class393.field5484 + var12);
                class223.field3129.method3070(new class93(var22), (byte) -120);
            }
        } else if (class215.field3053 == arg1) {
            int var23 = class387.field5435.method2099(255);
            boolean var24 = (var23 & 0x80) != 0;
            int var25 = class424.field6191 + (var23 >> 3 & 0x7);
            int var26 = class17.field180 + (var23 & 0x7);
            int var27 = var25 + class387.field5435.method2081((byte) 1);
            int var28 = class387.field5435.method2081((byte) 105) + var26;
            int var29 = class387.field5435.method2069(-127);
            int var30 = class387.field5435.method2062((byte) 14);
            int var31 = class387.field5435.method2099(255) * 4;
            int var32 = class387.field5435.method2099(255) * 4;
            int var33 = class387.field5435.method2062((byte) 14);
            int var34 = class387.field5435.method2062((byte) 14);
            int var35 = class387.field5435.method2099(255);
            if (var35 == 255) {
                var35 = -1;
            }
            int var36 = class387.field5435.method2099(255);
            if (var25 >= 0 && var26 >= 0 && var25 < class442.field6435 && class232.field3217 > var26 && var27 >= 0 && var28 >= 0 && class442.field6435 > var27 && var28 < class232.field3217 && var30 != 65535) {
                int var37 = var28 * 128 + 64;
                int var38 = var31 << 0;
                int var39 = var25 * 128 + 64;
                int var40 = var27 * 128 + 64;
                int var41 = var26 * 128 + 64;
                int var42 = var32 << 0;
                class465 var43 = new class465(var30, class105.field1435, var39, var41, var38, var33 + class393.field5484, class393.field5484 + var34, var35, var36, var29, var42, var24);
                var43.method2733(var37, class186.method1118(var40, var37, 12840, class105.field1435) - var42, (byte) -118, var40, class393.field5484 + var33);
                class223.field3129.method3070(new class93(var43), (byte) -125);
            }
        } else if (class480.field7018 == arg1) {
            int var44 = class387.field5435.method2093(!arg0);
            int var45 = class387.field5435.method2087(-126);
            int var46 = ((var45 & 0x74) >> 4) + class424.field6191;
            int var47 = class17.field180 + (var45 & 0x7);
            int var48 = class387.field5435.method2093(false);
            if (var46 >= 0 && var47 >= 0 && var46 < class442.field6435 && var47 < class232.field3217) {
                class331.method1840(-828078226, var47, new class493(var44, var48), class105.field1435, var46);
                class469.method2754(class105.field1435, var46, var47, (byte) 125);
            }
        } else if (class45.field625 == arg1) {
            int var49 = class387.field5435.method2099(255);
            int var50 = (var49 >> 4 & 0x7) + class424.field6191;
            int var51 = (var49 & 0x7) + class17.field180;
            int var52 = class387.field5435.method2062((byte) 14);
            int var53 = class387.field5435.method2099(255);
            int var54 = class387.field5435.method2062((byte) 14);
            int var55 = class387.field5435.method2099(255);
            if (var50 >= 0 && var51 >= 0 && var50 < class442.field6435 && class232.field3217 > var51) {
                int var56 = var50 * 128 + 64;
                int var57 = var51 * 128 + 64;
                int var58 = class105.field1435;
                if (var58 < 3 && class426.method2553(var51, var50, 1)) {
                    var58++;
                }
                class423 var59 = new class423(var52, var54, class393.field5484, class105.field1435, var58, var56, class186.method1118(var56, var57, 12840, class105.field1435) - var53, var57, var50, var50, var51, var51, var55);
                class36.field504.method3070(new class309(var59), (byte) -128);
            }
        } else if (class269.field3689 == arg1) {
            int var60 = class387.field5435.method2062((byte) 14);
            int var61 = class387.field5435.method2099(255);
            class82.field1154.method2121(var60, true).method866(var61, (byte) 126);
        } else if (class449.field6491 == arg1) {
            int var62 = class387.field5435.method2099(255);
            int var63 = (var62 >> 4 & 0x7) + class424.field6191;
            int var64 = (var62 & 0x7) + class17.field180;
            int var65 = class387.field5435.method2062((byte) 14);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class387.field5435.method2099(255);
            int var67 = var66 >> 4 & 0xF;
            int var68 = var66 & 0x7;
            int var69 = class387.field5435.method2099(255);
            int var70 = class387.field5435.method2099(255);
            if (var63 >= 0 && var64 >= 0 && var63 < class442.field6435 && var64 < class232.field3217) {
                int var71 = var67 + 1;
                if (var63 - var71 <= class75.field1089.field372[0] && class75.field1089.field372[0] <= var63 + var71 && class75.field1089.field362[0] >= (var64 - var71) && (var64 + var71) >= class75.field1089.field362[0]) {
                    class202.method1237(var68, 2048, var69, var70, var65, (class105.field1435 << 24) + var67 + (var63 << 16) + (var64 << 8));
                }
            }
        } else if (class500.field7349 == arg1) {
            int var72 = class387.field5435.method2099(255);
            int var73 = ((var72 & 0x73) >> 4) + class424.field6191;
            int var74 = (var72 & 0x7) + class17.field180;
            int var75 = class387.field5435.method2057(65280);
            int var76 = class387.field5435.method2057(65280);
            int var77 = class387.field5435.method2064(126);
            if (var73 >= 0 && var74 >= 0 && class442.field6435 > var73 && class232.field3217 > var74 && class202.field2880 != var75) {
                class331.method1840(-828078226, var74, new class493(var76, var77), class105.field1435, var73);
                class469.method2754(class105.field1435, var73, var74, (byte) -92);
            }
        } else if (class51.field691 == arg1) {
            int var78 = class387.field5435.method2087(-124);
            int var79 = ((var78 & 0x72) >> 4) + class424.field6191;
            int var80 = (var78 & 0x7) + class17.field180;
            int var81 = class387.field5435.method2087(-125);
            int var82 = var81 >> 2;
            int var83 = var81 & 0x3;
            int var84 = class180.field2540[var82];
            int var85 = class387.field5435.method2062((byte) 14);
            if (var85 == 65535) {
                var85 = -1;
            }
            class472.method2782(class105.field1435, var80, 2, var85, var83, var79, var82, var84);
        } else if (class296.field4096 == arg1) {
            int var86 = class387.field5435.method2098(120);
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = class180.field2540[var87];
            int var90 = class387.field5435.method2055(true);
            int var91 = ((var90 & 0x76) >> 4) + class424.field6191;
            int var92 = (var90 & 0x7) + class17.field180;
            int var93 = class387.field5435.method2062((byte) 14);
            if (class400.method2319(class65.field897, false) || var91 >= 0 && var92 >= 0 && var91 < class442.field6435 && var92 < class232.field3217) {
                class28.method191(var93, 0, class105.field1435, -73, var88, -1, var91, var89, var92, var87);
            }
        } else if (class36.field502 == arg1) {
            int var94 = class387.field5435.method2099(255);
            int var95 = (var94 >> 4 & 0x7) + class424.field6191;
            int var96 = (var94 & 0x7) + class17.field180;
            int var97 = class387.field5435.method2099(255);
            int var98 = var97 >> 2;
            int var99 = var97 & 0x3;
            int var100 = class180.field2540[var98];
            if (class400.method2319(class65.field897, !arg0) || var95 >= 0 && var96 >= 0 && var95 < class442.field6435 && var96 < class232.field3217) {
                class28.method191(-1, 0, class105.field1435, 110, var99, -1, var95, var100, var96, var98);
            }
        } else if (class192.field2732 == arg1) {
            int var101 = class387.field5435.method2062((byte) 14);
            byte var102 = class387.field5435.method2081((byte) 124);
            int var103 = class387.field5435.method2087(-123);
            int var104 = var103 >> 2;
            int var105 = var103 & 0x3;
            int var106 = class387.field5435.method2062((byte) 14);
            int var107 = class387.field5435.method2080((byte) -58);
            int var108 = class387.field5435.method2093(false);
            int var109 = class387.field5435.method2098(77);
            int var110 = (var109 >> 4 & 0x7) + class424.field6191;
            int var111 = class17.field180 + (var109 & 0x7);
            byte var112 = class387.field5435.method2081((byte) -62);
            byte var113 = class387.field5435.method2081((byte) -36);
            byte var114 = class387.field5435.method2097((byte) 111);
            if (!class418.field6109.method450()) {
                class31.method211(var102, var105, var112, 0, var111, var108, var113, var101, var106, var110, var104, var107, var114, class105.field1435);
            }
        } else if (class215.field3058 == arg1) {
            int var115 = class387.field5435.method2099(255);
            int var116 = class424.field6191 * 2 + (var115 >> 4 & 0xF);
            int var117 = (var115 & 0xF) + class17.field180 * 2;
            boolean var118 = class387.field5435.method2099(255) != 0;
            int var119 = class387.field5435.method2081((byte) -108) + var116;
            int var120 = var117 + class387.field5435.method2081((byte) 124);
            int var121 = class387.field5435.method2069(-123);
            int var122 = class387.field5435.method2069(-126);
            int var123 = class387.field5435.method2062((byte) 14);
            byte var124 = class387.field5435.method2081((byte) 91);
            int var125 = class387.field5435.method2099(255) * 4;
            int var126 = class387.field5435.method2062((byte) 14);
            int var127 = class387.field5435.method2062((byte) 14);
            int var128 = class387.field5435.method2099(255);
            int var129 = class387.field5435.method2099(255);
            if (var128 == 255) {
                var128 = -1;
            }
            if (var116 >= 0 && var117 >= 0 && (class442.field6435 * 2) > var116 && var117 < (class442.field6435 * 2) && var119 >= 0 && var120 >= 0 && var119 < class232.field3217 * 2 && var120 < (class232.field3217 * 2) && var123 != 65535) {
                int var130 = var117 * 64;
                int var131 = var125 << 0;
                int var132 = var124 << 0;
                int var133 = var120 * 64;
                int var134 = var119 * 64;
                int var135 = var116 * 64;
                if (var121 != 0) {
                    int var138;
                    class22 var139;
                    if (var121 >= 0) {
                        int var136 = var121 - 1;
                        int var137 = var136 & 0x7FF;
                        var138 = var136 >> 11 & 0xF;
                        var139 = class179.field2534[var137];
                    } else {
                        int var140 = -var121 - 1;
                        int var141 = var140 & 0x7FF;
                        var138 = (var140 & 0x7E31) >> 11;
                        if (class202.field2880 == var141) {
                            var139 = class75.field1089;
                        } else {
                            var139 = class309.field4234[var141];
                        }
                    }
                    if (var139 != null) {
                        class21 var142 = var139.method165((byte) -85);
                        if (var142.field246 != null && var142.field246[var138] != null) {
                            int var143 = var142.field246[var138][0];
                            int var144 = var142.field246[var138][2];
                            int var145 = var139.field357.method816(77);
                            int var146 = class377.field5316[var145];
                            int var147 = class377.field5315[var145];
                            int var148 = var143 * var147 + var144 * var146 >> 15;
                            int var149 = var144 * var147 - (var143 * var146) >> 15;
                            var132 -= var142.field246[var138][1];
                            var135 += var148;
                            var130 += var149;
                        }
                    }
                }
                class465 var151 = new class465(var123, class105.field1435, var135, var130, var132, class393.field5484 + var126, class393.field5484 + var127, var128, var129, var122, var131, var118);
                var151.method2733(var133, class186.method1118(var134, var133, 12840, class105.field1435) - var131, (byte) -101, var134, class393.field5484 + var126);
                class223.field3129.method3070(new class93(var151), (byte) -127);
            }
        } else if (class26.field404 == arg1) {
            class387.field5435.method2099(255);
            int var152 = class387.field5435.method2099(255);
            int var153 = (var152 >> 4 & 0x7) + class424.field6191;
            int var154 = (var152 & 0x7) + class17.field180;
            int var155 = class387.field5435.method2062((byte) 14);
            int var156 = class387.field5435.method2099(255);
            int var157 = class387.field5435.method2111(-2);
            String var158 = class387.field5435.method2106(-1);
            class50.method313(var156, var158, 4, var153, var154, class105.field1435, var155, var157);
        } else if (class60.field799 == arg1) {
            int var159 = class387.field5435.method2062((byte) 14);
            int var160 = class387.field5435.method2087(-127);
            int var161 = (var160 >> 4 & 0x7) + class424.field6191;
            int var162 = (var160 & 0x7) + class17.field180;
            if (var161 >= 0 && var162 >= 0 && var161 < class442.field6435 && class232.field3217 > var162) {
                class152 var163 = (class152) class456.field6672.method979((byte) 28, (long) (var161 | var162 << 14 | class105.field1435 << 28));
                if (var163 != null) {
                    for (class493 var164 = (class493) var163.field2134.method3072((byte) 110); var164 != null; var164 = (class493) var163.field2134.method3066(2)) {
                        if ((var159 & 0x7FFF) == var164.field7287) {
                            var164.method2946(-112);
                            break;
                        }
                    }
                    if (var163.field2134.method3068(83)) {
                        var163.method2946(-107);
                    }
                    class469.method2754(class105.field1435, var161, var162, (byte) 126);
                }
            }
        } else if (class320.field4429 == arg1) {
            int var165 = class387.field5435.method2099(255);
            int var166 = ((var165 & 0x7D) >> 4) + class424.field6191;
            int var167 = (var165 & 0x7) + class17.field180;
            int var168 = class387.field5435.method2062((byte) 14);
            int var169 = class387.field5435.method2062((byte) 14);
            int var170 = class387.field5435.method2062((byte) 14);
            if (class456.field6672 != null && var166 >= 0 && var167 >= 0 && var166 < class442.field6435 && class232.field3217 > var167) {
                class152 var171 = (class152) class456.field6672.method979((byte) 28, (long) (class105.field1435 << 28 | var167 << 14 | var166));
                if (var171 != null) {
                    for (class493 var172 = (class493) var171.field2134.method3072((byte) 11); var172 != null; var172 = (class493) var171.field2134.method3066(2)) {
                        if ((var168 & 0x7FFF) == var172.field7287 && var172.field7282 == var169) {
                            var172.method2946(-96);
                            var172.field7282 = var170;
                            class331.method1840(-828078226, var167, var172, class105.field1435, var166);
                            break;
                        }
                    }
                    class469.method2754(class105.field1435, var166, var167, (byte) -16);
                }
            }
        } else {
            class162.method1000((byte) -116, null, "T3 - " + arg1);
            class528.method3102(-126);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lpg;I)V", line = 618)
    private final void method1871(class514 arg0, int arg1) {
        class225 var3 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method1335(-571093627, arg0);
            this.field4653++;
            this.field4643.notifyAll();
            if (arg1 <= 13) {
                method1870(false, null);
            }
        }
        field4641++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ldh;II)Lpg;", line = 633)
    public final class514 method1872(class209 arg0, int arg1, int arg2) {
        field4646++;
        class514 var4 = new class514();
        var4.field7553 = 1;
        class225 var5 = this.field4643;
        synchronized (this.field4643) {
            class514 var6 = (class514) this.field4643.method1328((byte) -49);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field1140 && var6.field7549 == arg0 && var6.field7553 == 2) {
                    var4.field7547 = var6.field7547;
                    var4.field3807 = false;
                    return var4;
                }
                var6 = (class514) this.field4643.method1330(192);
            }
        }
        var4.field7547 = arg0.method1264(arg2, 518237192);
        if (arg1 != -5883) {
            this.field4653 = -110;
        }
        var4.field3807 = false;
        var4.field3809 = true;
        return var4;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 668)
    public final void method1873(boolean arg0) {
        field4645++;
        this.field4654 = arg0;
        class225 var2 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.notifyAll();
        }
        try {
            this.field4652.join();
        } catch (InterruptedException var3) {
        }
        this.field4652 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[BZLdh;)Lpg;", line = 684)
    public final class514 method1874(int arg0, byte[] arg1, boolean arg2, class209 arg3) {
        field4650++;
        class514 var5 = new class514();
        var5.field3809 = arg2;
        var5.field1140 = arg0;
        var5.field7553 = 2;
        var5.field7547 = arg1;
        var5.field7549 = arg3;
        this.method1871(var5, 30);
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "run", descriptor = "()V", line = 700)
    public final void run() {
        field4647++;
        while (!this.field4654) {
            class225 var1 = this.field4643;
            class514 var2;
            synchronized (this.field4643) {
                var2 = (class514) this.field4643.method1334(-124);
                if (var2 == null) {
                    try {
                        this.field4643.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4653--;
            }
            try {
                if (var2.field7553 == 2) {
                    var2.field7549.method1267(var2.field7547.length, (int) var2.field1140, var2.field7547, (byte) 42);
                } else if (var2.field7553 == 3) {
                    var2.field7547 = var2.field7549.method1264((int) var2.field1140, 518237192);
                }
            } catch (Exception var6) {
                class162.method1000((byte) -116, var6, null);
            }
            var2.field3807 = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILdh;)Lpg;", line = 754)
    public final class514 method1875(int arg0, int arg1, class209 arg2) {
        field4642++;
        if (arg1 != 4) {
            this.field4652 = null;
        }
        class514 var4 = new class514();
        var4.field3809 = false;
        var4.field7553 = 3;
        var4.field7549 = arg2;
        var4.field1140 = arg0;
        this.method1871(var4, 84);
        return var4;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lkj;)V", line = 786)
    public class337(class397 arg0) {
        class409 var2 = arg0.method2296(5, this, (byte) 32);
        while (var2.field5652 == 0) {
            class496.method2931((byte) 125, 10L);
        }
        if (var2.field5652 == 2) {
            throw new RuntimeException();
        }
        this.field4652 = (Thread) var2.field5654;
    }
}
