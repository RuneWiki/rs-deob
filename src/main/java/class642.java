import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class642 extends class324 {

    @OriginalMember(owner = "client!av", name = "J", descriptor = "Lqe;")
    public static class469 field9004 = new class469(49, -2);

    @OriginalMember(owner = "client!av", name = "I", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!av", name = "K", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!av", name = "M", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!av", name = "N", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!av", name = "P", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!av", name = "Q", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!av", name = "R", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!av", name = "S", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!av", name = "L", descriptor = "Lcr;")
    public static class575 field9006;

    // $FF: synthetic field
    @OriginalMember(owner = "client!av", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field9014;

    @OriginalMember(owner = "client!av", name = "O", descriptor = "[B")
    private byte[] field9009;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "[I")
    public static int[] field9002;

    // $FF: synthetic method
    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3682(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V", line = 3)
    public class642() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)V", line = 6)
    public static void method3676(int arg0) {
        field9004 = null;
        field9006 = null;
        field9002 = null;
        if (arg0 > -82) {
            method3680(53);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBII)[B", line = 21)
    public final byte[] method3677(int arg0, byte arg1, int arg2, int arg3) {
        this.field9009 = new byte[arg0 * arg2 * 2 * arg3];
        if (arg1 <= 24) {
            return null;
        } else {
            field9005++;
            this.method3318(arg0, arg3, arg2, (byte) -22);
            return this.field9009;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BLoo;)V", line = 34)
    public static final void method3678(byte arg0, class629 arg1) {
        field9011++;
        if (class635.field8926 == arg1) {
            int var2 = class469.field6851.method3745(-6314);
            int var3 = ((var2 & 0x74) >> 4) + class326.field4654;
            int var4 = (var2 & 0x7) + class608.field8607;
            int var5 = class469.field6851.method3712((byte) 4);
            int var6 = class469.field6851.method3745(-6314);
            int var7 = class469.field6851.method3712((byte) -105);
            int var8 = class469.field6851.method3745(-6314);
            if (var3 >= 0 && var4 >= 0 && var3 < class194.field2946 && class255.field3656 > var4) {
                int var9 = var3 * 512 + 256;
                int var10 = var4 * 512 + 256;
                int var11 = class456.field6731;
                if (var11 < 3 && class286.method1827(var3, var4, (byte) -24)) {
                    var11++;
                }
                class402 var12 = new class402(var5, var7, class357.field5189, class456.field6731, var11, var9, class384.method2468(true, var9, class456.field6731, var10) - var6, var10, var3, var3, var4, var4, var8);
                class209.field3054.method1203(new class650(var12), (byte) 97);
            }
        } else if (class608.field8608 == arg1) {
            int var13 = class469.field6851.method3717(true);
            int var14 = (var13 & 0x7) + class608.field8607;
            int var15 = class582.field8288 + var14;
            int var16 = (var13 >> 4 & 0x7) + class326.field4654;
            int var17 = class361.field5224 + var16;
            int var18 = class469.field6851.method3755(128);
            int var19 = class469.field6851.method3755(arg0 + 15);
            boolean var20 = var16 >= 0 && var14 >= 0 && class194.field2946 > var16 && var14 < class255.field3656;
            if (var20 || class529.method3091(31, class9.field132)) {
                class114.method844(new class661(var18, var19), var15, class456.field6731, (byte) 112, var17);
                if (var20) {
                    class41.method295(class456.field6731, var16, var14, 0);
                }
            }
        } else if (class555.field7931 == arg1) {
            int var21 = class469.field6851.method3745(-6314);
            int var22 = (var21 & 0x7) + class608.field8607;
            int var23 = var22 + class582.field8288;
            int var24 = ((var21 & 0x77) >> 4) + class326.field4654;
            int var25 = class361.field5224 + var24;
            int var26 = class469.field6851.method3712((byte) 80);
            int var27 = class469.field6851.method3712((byte) 74);
            int var28 = class469.field6851.method3712((byte) -126);
            if (class12.field173 != null) {
                class258 var29 = (class258) class12.field173.method2287((long) (var23 << 14 | class456.field6731 << 28 | var25), (byte) -117);
                if (var29 != null) {
                    for (class661 var30 = (class661) var29.field3693.method1195(arg0 ^ 0x71); var30 != null; var30 = (class661) var29.field3693.method1201(2)) {
                        if ((var26 & 0x7FFF) == var30.field9243 && var30.field9240 == var27) {
                            var30.method1304((byte) 7);
                            var30.field9240 = var28;
                            class114.method844(var30, var23, class456.field6731, (byte) 118, var25);
                            break;
                        }
                    }
                    if (var24 >= 0 && var22 >= 0 && var24 < class194.field2946 && var22 < class255.field3656) {
                        class41.method295(class456.field6731, var24, var22, 0);
                    }
                }
            }
        } else if (class348.field5102 == arg1) {
            class469.field6851.method3745(-6314);
            int var31 = class469.field6851.method3745(arg0 - 6427);
            int var32 = ((var31 & 0x78) >> 4) + class326.field4654;
            int var33 = (var31 & 0x7) + class608.field8607;
            int var34 = class469.field6851.method3712((byte) -120);
            int var35 = class469.field6851.method3745(arg0 - 6427);
            int var36 = class469.field6851.method3747((byte) -74);
            String var37 = class469.field6851.method3752(-2);
            class37.method188(var35, (byte) 90, class456.field6731, var36, var34, var32, var37, var33);
        } else if (class224.field3306 == arg1) {
            int var38 = class469.field6851.method3714((byte) 19);
            int var39 = ((var38 & 0x7C) >> 4) + class326.field4654;
            int var40 = (var38 & 0x7) + class608.field8607;
            int var41 = class469.field6851.method3701(arg0 - 235);
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = class331.field4763[var42];
            int var45 = class469.field6851.method3726(false);
            if (class529.method3091(arg0 + 2, class9.field132) || var39 >= 0 && var40 >= 0 && var39 < class194.field2946 && class255.field3656 > var40) {
                class143.method991(class456.field6731, var44, (byte) 66, var42, var45, var40, var43, var39);
            }
        } else if (class608.field8601 == arg1) {
            int var46 = class469.field6851.method3712((byte) -110);
            int var47 = class469.field6851.method3745(-6314);
            class239.field3470.method388(var46, 100).method1431(var47, (byte) -69);
        } else if (class234.field3409 == arg1) {
            int var48 = class469.field6851.method3745(-6314);
            int var49 = class326.field4654 + ((var48 & 0x7B) >> 4);
            int var50 = (var48 & 0x7) + class608.field8607;
            int var51 = class469.field6851.method3712((byte) -123);
            if (var51 == 65535) {
                var51 = -1;
            }
            int var52 = class469.field6851.method3745(-6314);
            int var53 = (var52 & 0xF3) >> 4;
            int var54 = var52 & 0x7;
            int var55 = class469.field6851.method3745(-6314);
            int var56 = class469.field6851.method3745(arg0 - 6427);
            int var57 = class469.field6851.method3712((byte) -110);
            if (var49 >= 0 && var50 >= 0 && class194.field2946 > var49 && class255.field3656 > var50) {
                int var58 = var53 + 1;
                if (var49 - var58 <= class130.field1749.field6133[0] && class130.field1749.field6133[0] <= (var49 + var58) && (var50 - var58) <= class130.field1749.field6139[0] && class130.field1749.field6139[0] <= (var50 + var58)) {
                    class706.method4016(arg0 - 225, var56, (class456.field6731 << 24) + ((var49 << 16) - (-(var50 << 8) - var53)), var51, var57, var55, var54);
                }
            }
        } else if (class64.field919 == arg1) {
            int var59 = class469.field6851.method3693(75);
            int var60 = class469.field6851.method3714((byte) 19);
            int var61 = (var60 & 0x7) + class608.field8607;
            int var62 = class582.field8288 + var61;
            int var63 = class326.field4654 + (var60 >> 4 & 0x7);
            int var64 = class361.field5224 + var63;
            class258 var65 = (class258) class12.field173.method2287((long) (var64 | class456.field6731 << 28 | var62 << 14), (byte) -117);
            if (var65 != null) {
                for (class661 var66 = (class661) var65.field3693.method1195(arg0 - 113); var66 != null; var66 = (class661) var65.field3693.method1201(2)) {
                    if ((var59 & 0x7FFF) == var66.field9243) {
                        var66.method1304((byte) 7);
                        break;
                    }
                }
                if (var65.field3693.method1197(0)) {
                    var65.method1304((byte) 7);
                }
                if (var63 >= 0 && var61 >= 0 && class194.field2946 > var63 && var61 < class255.field3656) {
                    class41.method295(class456.field6731, var63, var61, arg0 - 113);
                }
            }
        } else if (class96.field1357 == arg1) {
            int var67 = class469.field6851.method3717(true);
            int var68 = var67 >> 2;
            int var69 = var67 & 0x3;
            int var70 = class331.field4763[var68];
            int var71 = class469.field6851.method3717(true);
            int var72 = class326.field4654 + (var71 >> 4 & 0x7);
            int var73 = class608.field8607 + (var71 & 0x7);
            int var74 = class469.field6851.method3693(arg0 ^ 0x1E);
            if (var74 == 65535) {
                var74 = -1;
            }
            class417.method2632(arg0 - 36, class456.field6731, var73, var69, var70, var74, var68, var72);
        } else if (class488.field6982 == arg1) {
            int var75 = class469.field6851.method3745(-6314);
            int var76 = ((var75 & 0x7A) >> 4) + class326.field4654;
            int var77 = (var75 & 0x7) + class608.field8607;
            int var78 = class469.field6851.method3712((byte) -125);
            if (var78 == 65535) {
                var78 = -1;
            }
            int var79 = class469.field6851.method3745(-6314);
            int var80 = (var79 & 0xF7) >> 4;
            int var81 = var79 & 0x7;
            int var82 = class469.field6851.method3745(-6314);
            int var83 = class469.field6851.method3745(-6314);
            int var84 = class469.field6851.method3712((byte) -6);
            if (var76 >= 0 && var77 >= 0 && class194.field2946 > var76 && var77 < class255.field3656) {
                int var85 = var80 + 1;
                if (class130.field1749.field6133[0] >= var76 - var85 && (var76 + var85) >= class130.field1749.field6133[0] && class130.field1749.field6139[0] >= var77 - var85 && var77 + var85 >= class130.field1749.field6139[0]) {
                    class143.method993(var82, (class456.field6731 << 24) + (var76 << 16) + var80 + (var77 << 8), var84, var78, arg0 ^ 0xFFFFC938, false, var83, var81);
                }
            }
        } else if (class110.field1545 == arg1) {
            int var86 = class469.field6851.method3745(arg0 ^ 0xFFFFE727);
            boolean var87 = (var86 & 0x80) != 0;
            int var88 = (var86 >> 3 & 0x7) + class326.field4654;
            int var89 = (var86 & 0x7) + class608.field8607;
            int var90 = var88 + class469.field6851.method3743(true);
            int var91 = var89 + class469.field6851.method3743(true);
            int var92 = class469.field6851.method3756(65536);
            int var93 = class469.field6851.method3712((byte) -121);
            int var94 = class469.field6851.method3745(-6314) * 4;
            int var95 = class469.field6851.method3745(-6314) * 4;
            int var96 = class469.field6851.method3712((byte) -105);
            int var97 = class469.field6851.method3712((byte) -120);
            int var98 = class469.field6851.method3745(-6314);
            if (var98 == 255) {
                var98 = -1;
            }
            int var99 = class469.field6851.method3712((byte) 74);
            if (var88 >= 0 && var89 >= 0 && class194.field2946 > var88 && class255.field3656 > var89 && var90 >= 0 && var91 >= 0 && class194.field2946 > var90 && class255.field3656 > var91 && var93 != 65535) {
                int var100 = var88 * 512 + 256;
                int var101 = var95 << 2;
                int var102 = var99 << 2;
                int var103 = var89 * 512 + 256;
                int var104 = var94 << 2;
                int var105 = var90 * 512 + 256;
                int var106 = var91 * 512 + 256;
                class93 var107 = new class93(var93, class456.field6731, class456.field6731, var100, var103, var104, class357.field5189 + var96, class357.field5189 + var97, var98, var102, 0, var92, var101, var87, -1);
                var107.method735(-1, class384.method2468(true, var105, class456.field6731, var106) - var101, var96 - -class357.field5189, var105, var106);
                class299.field4241.method1203(new class345(var107), (byte) 92);
            }
        } else if (class35.field364 == arg1) {
            int var108 = class469.field6851.method3717(true);
            int var109 = (var108 >> 4 & 0x7) + class326.field4654;
            int var110 = (var108 & 0x7) + class608.field8607;
            int var111 = class469.field6851.method3745(arg0 ^ 0xFFFFE727);
            int var112 = var111 >> 2;
            int var113 = var111 & 0x3;
            int var114 = class331.field4763[var112];
            if (class529.method3091(-98, class9.field132) || var109 >= 0 && var110 >= 0 && var109 < class194.field2946 && var110 < class255.field3656) {
                class143.method991(class456.field6731, var114, (byte) 66, var112, -1, var110, var113, var109);
            }
        } else if (class48.field697 == arg1) {
            int var115 = class469.field6851.method3717(true);
            int var116 = (var115 >> 4 & 0x7) + class326.field4654;
            int var117 = (var115 & 0x7) + class608.field8607;
            int var118 = class469.field6851.method3726(false);
            class211 var119 = class239.field3470.method388(var118, 100);
            int var120 = class469.field6851.method3701(arg0 ^ 0xFFFFFFF1);
            int var121 = var120 >> 2;
            int var122 = class331.field4763[var121];
            int var123 = class469.field6851.method3745(-6314);
            if (var121 == 11) {
                var121 = 10;
            }
            int var124 = 0;
            if (var119.field3094 != null) {
                int var125 = -1;
                for (int var126 = 0; var126 < var119.field3094.length; var126++) {
                    if (var119.field3094[var126] == var121) {
                        var125 = var126;
                        break;
                    }
                }
                var124 = var119.field3168[var125].length;
            }
            int var127 = 0;
            if (var119.field3114 != null) {
                var127 = var119.field3114.length;
            }
            int var128 = 0;
            if (var119.field3143 != null) {
                var128 = var119.field3143.length;
            }
            if ((var123 & 0x1) == 1) {
                class55.method386(-8897, var117, var116, class456.field6731, var122, null);
            } else {
                int[] var129 = null;
                if ((var123 & 0x2) == 2) {
                    var129 = new int[var124];
                    for (int var130 = 0; var130 < var124; var130++) {
                        var129[var130] = class469.field6851.method3712((byte) -128);
                    }
                }
                short[] var131 = null;
                if ((var123 & 0x4) == 4) {
                    var131 = new short[var127];
                    for (int var132 = 0; var132 < var127; var132++) {
                        var131[var132] = (short) class469.field6851.method3712((byte) -107);
                    }
                }
                short[] var133 = null;
                if ((var123 & 0x8) == 8) {
                    var133 = new short[var128];
                    for (int var134 = 0; var134 < var128; var134++) {
                        var133[var134] = (short) class469.field6851.method3712((byte) -112);
                    }
                }
                class55.method386(-8897, var117, var116, class456.field6731, var122, new class572((long) (client.field4278++), var129, var131, var133));
            }
        } else {
            if (arg0 != 113) {
                method3678((byte) -36, null);
            }
            if (class210.field3071 == arg1) {
                int var135 = class469.field6851.method3726(false);
                int var136 = class469.field6851.method3717(true);
                int var137 = (var136 & 0x7) + class608.field8607;
                int var138 = var137 + class582.field8288;
                int var139 = (var136 >> 4 & 0x7) + class326.field4654;
                int var140 = class361.field5224 + var139;
                int var141 = class469.field6851.method3726(false);
                int var142 = class469.field6851.method3726(false);
                if (class701.field9775 != var141) {
                    boolean var143 = var139 >= 0 && var137 >= 0 && class194.field2946 > var139 && var137 < class255.field3656;
                    if (var143 || class529.method3091(-126, class9.field132)) {
                        class114.method844(new class661(var142, var135), var138, class456.field6731, (byte) 124, var140);
                        if (var143) {
                            class41.method295(class456.field6731, var139, var137, arg0 ^ 0x71);
                        }
                    }
                }
            } else if (class716.field10072 == arg1) {
                int var144 = class469.field6851.method3745(arg0 ^ 0xFFFFE727);
                int var145 = (var144 >> 4 & 0xF) + class326.field4654 * 2;
                int var146 = (var144 & 0xF) + class608.field8607 * 2;
                int var147 = class469.field6851.method3745(-6314);
                boolean var148 = (var147 & 0x1) != 0;
                boolean var149 = (var147 & 0x2) != 0;
                int var150 = var149 ? var147 >> 2 : -1;
                int var151 = class469.field6851.method3743(true) + var145;
                int var152 = var146 + class469.field6851.method3743(true);
                int var153 = class469.field6851.method3756(65536);
                int var154 = class469.field6851.method3756(arg0 + 65423);
                int var155 = class469.field6851.method3712((byte) -112);
                int var156 = class469.field6851.method3745(-6314);
                int var157;
                if (var149) {
                    var157 = (byte) var156;
                } else {
                    var157 = var156 * 4;
                }
                int var158 = class469.field6851.method3745(-6314) * 4;
                int var159 = class469.field6851.method3712((byte) -117);
                int var160 = class469.field6851.method3712((byte) 110);
                int var161 = class469.field6851.method3745(arg0 - 6427);
                int var162 = class469.field6851.method3712((byte) -124);
                if (var161 == 255) {
                    var161 = -1;
                }
                if (var145 >= 0 && var146 >= 0 && (class194.field2946 * 2) > var145 && class194.field2946 * 2 > var146 && var151 >= 0 && var152 >= 0 && var151 < (class255.field3656 * 2) && var152 < (class255.field3656 * 2) && var155 != 65535) {
                    int var163 = var162 << 2;
                    int var164 = var157 << 2;
                    int var165 = var158 << 2;
                    int var166 = var146 * 256;
                    int var167 = var145 * 256;
                    int var168 = var151 * 256;
                    int var169 = var152 * 256;
                    if (var153 != 0 && var150 != -1) {
                        class405 var170 = null;
                        if (var153 >= 0) {
                            int var171 = var153 - 1;
                            class432 var172 = (class432) class497.field7067.method2287((long) var171, (byte) -117);
                            if (var172 != null) {
                                var170 = var172.field6439;
                            }
                        } else {
                            int var173 = -var153 - 1;
                            if (class701.field9775 == var173) {
                                var170 = class130.field1749;
                            } else {
                                var170 = class314.field4456[var173];
                            }
                        }
                        if (var170 != null) {
                            class264 var174 = var170.method2577(-1);
                            if (var174.field3730 != null && var174.field3730[var150] != null) {
                                var164 -= var174.field3730[var150][1];
                            }
                            if (var174.field3745 != null && var174.field3745[var150] != null) {
                                var164 -= var174.field3745[var150][1];
                            }
                        }
                    }
                    class93 var175 = new class93(var155, class456.field6731, class456.field6731, var167, var166, var164, class357.field5189 + var159, class357.field5189 + var160, var161, var163, var153, var154, var165, var148, var150);
                    var175.method735(-1, class384.method2468(true, var168, class456.field6731, var169) - var165, class357.field5189 + var159, var168, var169);
                    class299.field4241.method1203(new class345(var175), (byte) -87);
                }
            } else {
                class326.method2072(arg0 ^ 0xFFFFF126, null, "T3 - " + arg1);
                class109.method812(false, (byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z", line = 753)
    public static final boolean method3679(int arg0, int arg1, int arg2) {
        if (arg1 > -51) {
            field9002 = null;
        }
        field9007++;
        return class629.method3630(-124, arg0, arg2) | (arg2 & 0x70000) != 0 || class530.method3102(arg0, arg2, -49);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBI)V", line = 766)
    public final void method1993(int arg0, byte arg1, int arg2) {
        field9008++;
        int var4 = arg2 * 2;
        if (arg0 != 4096) {
            field9012 = -14;
        }
        int var5 = arg1 & 0xFF;
        this.field9009[var4++] = (byte) (var5 * 3 >> 5);
        this.field9009[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)Ltl;", line = 785)
    public static final class622 method3680(int arg0) {
        field9003++;
        if (class84.field1180 == null || class48.field691 == null) {
            return null;
        }
        if (arg0 <= 22) {
            field9013 = 66;
        }
        for (class622 var1 = (class622) class48.field691.method123(29); var1 != null; var1 = (class622) class48.field691.method123(29)) {
            class519 var2 = class84.field1175.method864(-121, var1.field8729);
            if (var2 != null && var2.field7409 && var2.method3065(class84.field1176, -114)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILha;IIIBIII)V", line = 815)
    public static final void method3681(int arg0, class60 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field9010++;
        class721 var9 = (class721) class608.method3529(arg2, arg7, arg8);
        if (var9 != null) {
            class211 var10 = class239.field3470.method388(var9.method317(114), 100);
            int var11 = var9.method327(arg5 - 62) & 0x3;
            int var12 = var9.method309((byte) -73);
            if (var10.field3132 == -1) {
                int var13 = arg6;
                if (var10.field3113 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method437(var13, 4, arg4, arg0, 1);
                    } else if (var11 == 1) {
                        arg1.method448(arg4, 4, (byte) 123, var13, arg0);
                    } else if (var11 == 2) {
                        arg1.method437(var13, 4, arg4, arg0 + 3, 1);
                    } else if (var11 == 3) {
                        arg1.method448(arg4 + 3, 4, (byte) -80, var13, arg0);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method482(arg0, var13, 1, 1, arg4, 1);
                    } else if (var11 == 1) {
                        arg1.method482(arg0 + 3, var13, 1, arg5 + 56, arg4, 1);
                    } else if (var11 == 2) {
                        arg1.method482(arg0 + 3, var13, 1, arg5 + 56, arg4 - -3, 1);
                    } else if (var11 == 3) {
                        arg1.method482(arg0, var13, 1, arg5 ^ 0xFFFFFFC8, arg4 + 3, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method448(arg4, 4, (byte) 107, var13, arg0);
                    } else if (var11 == 1) {
                        arg1.method437(var13, 4, arg4, arg0 + 3, 1);
                    } else if (var11 == 2) {
                        arg1.method448(arg4 + 3, 4, (byte) -9, var13, arg0);
                    } else if (var11 == 3) {
                        arg1.method437(var13, 4, arg4, arg0, 1);
                    }
                }
            } else {
                class112.method839(arg4, arg1, var11, var10, arg0, (byte) -103);
            }
        }
        class721 var14 = (class721) class755.method4208(arg2, arg7, arg8, field9014 == null ? (field9014 = method3682("jn")) : field9014);
        if (var14 != null) {
            class211 var15 = class239.field3470.method388(var14.method317(123), 100);
            int var16 = var14.method327(-124) & 0x3;
            int var17 = var14.method309((byte) -94);
            if (var15.field3132 != -1) {
                class112.method839(arg4, arg1, var16, var15, arg0, (byte) -92);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3113 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method506(arg4 + 3, arg4, (byte) 38, arg0, var18, arg0 + 3);
                } else {
                    arg1.method506(arg4, arg4 + 3, (byte) 60, arg0, var18, arg0 + 3);
                }
            }
        }
        class721 var19 = (class721) class577.method3340(arg2, arg7, arg8);
        if (var19 != null) {
            class211 var20 = class239.field3470.method388(var19.method317(arg5 + 180), 100);
            int var21 = var19.method327(arg5 ^ 0x4F) & 0x3;
            if (var20.field3132 != -1) {
                class112.method839(arg4, arg1, var21, var20, arg0, (byte) -91);
            }
        }
        if (arg5 != -55) {
            method3678((byte) -75, null);
        }
    }
}
