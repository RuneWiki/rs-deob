import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class198 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    private int[] field3129;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private int[] field3133;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Ljf;")
    public static class216 field3137 = new class216(30);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[I")
    public static int[][] field3140 = new int[5][5000];

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
    public static int[] field3141 = new int[32];

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Z")
    public static boolean field3142;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field3143;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    private int field3134;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    private int field3136;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    private final void method1377(int arg0) {
        field3125++;
        if (arg0 <= 34) {
            this.field3129 = null;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var5 + var63;
            int var67 = var65 ^ var64 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var3 + var6;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var63;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3129[var11 + 7] + var2;
            int var38 = this.field3129[var11 + 6] + var3;
            int var39 = this.field3129[var11 + 2] + var7;
            int var40 = this.field3129[var11] + var9;
            int var41 = this.field3129[var11 + 3] + var6;
            int var42 = this.field3129[var11 + 4] + var5;
            int var43 = this.field3129[var11 + 5] + var4;
            int var44 = this.field3129[var11 + 1] + var8;
            int var45 = var40 ^ var44 << 11;
            int var46 = var39 + var44;
            int var47 = var41 + var45;
            int var48 = var46 ^ var39 >>> 2;
            int var49 = var42 + var48;
            int var50 = var39 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var43 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var6 + var38;
            int var56 = var5 + var37;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field3133[var11] = var9;
            this.field3133[var11 + 1] = var8;
            this.field3133[var11 + 2] = var7;
            this.field3133[var11 + 3] = var6;
            this.field3133[var11 + 4] = var5;
            this.field3133[var11 + 5] = var4;
            this.field3133[var11 + 6] = var3;
            this.field3133[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3133[var12 + 4] + var5;
            int var14 = this.field3133[var12 + 5] + var4;
            int var15 = this.field3133[var12 + 2] + var7;
            int var16 = this.field3133[var12 + 6] + var3;
            int var17 = this.field3133[var12] + var9;
            int var18 = this.field3133[var12 + 3] + var6;
            int var19 = this.field3133[var12 + 1] + var8;
            int var20 = this.field3133[var12 + 7] + var2;
            int var21 = var17 ^ var19 << 11;
            int var22 = var18 + var21;
            int var23 = var15 + var19;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var13 + var24;
            int var26 = var15 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var14 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var16;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var20;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field3133[var12] = var9;
            var7 = var2 + var27;
            this.field3133[var12 + 1] = var8;
            this.field3133[var12 + 2] = var7;
            this.field3133[var12 + 3] = var6;
            this.field3133[var12 + 4] = var5;
            this.field3133[var12 + 5] = var4;
            this.field3133[var12 + 6] = var3;
            this.field3133[var12 + 7] = var2;
        }
        this.method1378((byte) -105);
        this.field3132 = 256;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    private final void method1378(byte arg0) {
        this.field3136 += ++this.field3138;
        field3127++;
        if (arg0 != -105) {
            this.field3132 = 66;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3133[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3134 ^= this.field3134 << 13;
                } else {
                    this.field3134 ^= this.field3134 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3134 ^= this.field3134 << 2;
            } else {
                this.field3134 ^= this.field3134 >>> 16;
            }
            this.field3134 += this.field3133[var2 + 128 & 0xFF];
            int var4;
            this.field3133[var2] = var4 = this.field3136 + this.field3134 + this.field3133[class205.method1411(var3, 1020) >> 2];
            this.field3129[var2] = this.field3136 = this.field3133[class205.method1411(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILu;)V")
    public static final void method1379(int arg0, class243 arg1) {
        field3135++;
        if (arg1.field3983 == 0) {
            return;
        }
        class163 var2 = arg1.method1725(-123);
        if (arg1.field3927 != -1 && arg1.field3927 < 32768) {
            class86 var3 = class191.field3045[arg1.field3927];
            if (var3 != null) {
                int var4 = arg1.field3915 - var3.field3915;
                int var5 = arg1.field3920 - var3.field3920;
                if (var4 != 0 || var5 != 0) {
                    arg1.field3924 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 > -19) {
            method1379(69, (class243) null);
        }
        if (arg1.field3927 >= 32768) {
            int var6 = arg1.field3927 - 32768;
            if (class22.field289 == var6) {
                var6 = 2047;
            }
            class1 var7 = class35.field409[var6];
            if (var7 != null) {
                int var8 = arg1.field3915 - var7.field3915;
                int var9 = arg1.field3920 - var7.field3920;
                if (var8 != 0 || var9 != 0) {
                    arg1.field3924 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3905 != 0 || arg1.field3897 != 0) && (arg1.field3974 == 0 || arg1.field3984 > 0)) {
            int var10 = arg1.field3915 - ((arg1.field3905 - class113.field1653 - class113.field1653) * 64);
            int var11 = arg1.field3920 - ((arg1.field3897 - class5.field77 - class5.field77) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field3924 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field3905 = 0;
            arg1.field3897 = 0;
        }
        int var12 = arg1.field3924 - arg1.field3913 & 0x7FF;
        if (var12 == 0) {
            arg1.field3928 = 0;
            arg1.field3978 = 0;
        } else if (var2.field2522 == 0) {
            arg1.field3978++;
            if (var12 > 1024) {
                arg1.field3913 -= arg1.field3983;
                boolean var20 = true;
                if (var12 < arg1.field3983 || var12 > (2048 - arg1.field3983)) {
                    var20 = false;
                    arg1.field3913 = arg1.field3924;
                }
                if (arg1.field3978 > 25 || var20) {
                    arg1.field3946 = var2.field2502;
                    if (arg1.field3974 > 0) {
                        if (arg1.field3896[arg1.field3974 - 1] == 2) {
                            if (var2.field2493 != -1) {
                                arg1.field3946 = var2.field2493;
                            } else if (var2.field2511 != -1) {
                                arg1.field3946 = var2.field2511;
                            }
                        } else if (arg1.field3896[arg1.field3974 - 1] == 0) {
                            if (var2.field2514 != -1) {
                                arg1.field3946 = var2.field2514;
                            } else if (var2.field2523 != -1) {
                                arg1.field3946 = var2.field2523;
                            }
                        } else if (var2.field2535 != -1) {
                            arg1.field3946 = var2.field2535;
                        }
                    } else if (var2.field2516 != -1) {
                        arg1.field3946 = var2.field2516;
                    }
                }
            } else {
                arg1.field3913 += arg1.field3983;
                boolean var21 = true;
                if (var12 < arg1.field3983 || (2048 - arg1.field3983) < var12) {
                    arg1.field3913 = arg1.field3924;
                    var21 = false;
                }
                if (arg1.field3978 > 25 || var21) {
                    arg1.field3946 = var2.field2502;
                    if (arg1.field3974 <= 0) {
                        if (var2.field2533 != -1) {
                            arg1.field3946 = var2.field2533;
                        }
                    } else if (arg1.field3896[arg1.field3974 - 1] == 2) {
                        if (var2.field2513 != -1) {
                            arg1.field3946 = var2.field2513;
                        } else if (var2.field2511 != -1) {
                            arg1.field3946 = var2.field2511;
                        }
                    } else if (arg1.field3896[arg1.field3974 - 1] == 0) {
                        if (var2.field2498 != -1) {
                            arg1.field3946 = var2.field2498;
                        } else if (var2.field2523 != -1) {
                            arg1.field3946 = var2.field2523;
                        }
                    } else if (var2.field2508 != -1) {
                        arg1.field3946 = var2.field2508;
                    }
                }
            }
            arg1.field3913 &= 0x7FF;
        } else {
            arg1.field3946 = -1;
            int var13 = arg1.field3924 << 5;
            if (arg1.field3961 != var13) {
                arg1.field3961 = var13;
                arg1.field3967 = 0;
                int var14 = var13 - arg1.field3908 & 0xFFFF;
                int var15 = arg1.field3928 * arg1.field3928 / (var2.field2522 * 2);
                if (arg1.field3928 > 0 && var15 <= var14 && (var14 - var15) < 32768) {
                    arg1.field3906 = var14 / 2;
                    arg1.field3949 = true;
                    int var16 = var2.field2504 * var2.field2504 / (var2.field2522 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (arg1.field3906 > var16) {
                        arg1.field3906 = var14 - var16;
                    }
                } else if (arg1.field3928 < 0 && var15 <= 65536 - var14 && 65536 - var14 - var15 < 32768) {
                    arg1.field3906 = (65536 - var14) / 2;
                    arg1.field3949 = true;
                    int var17 = var2.field2504 * var2.field2504 / (var2.field2522 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg1.field3906 > var17) {
                        arg1.field3906 = 65536 - (var14 + var17);
                    }
                } else {
                    arg1.field3949 = false;
                }
            }
            if (arg1.field3928 == 0) {
                int var18 = arg1.field3961 - arg1.field3908 & 0xFFFF;
                if (var18 < var2.field2522) {
                    arg1.field3908 = arg1.field3961;
                } else {
                    arg1.field3967 = 0;
                    arg1.field3949 = true;
                    int var19 = var2.field2504 * var2.field2504 / (var2.field2522 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 >= 32768) {
                        arg1.field3928 = -var2.field2522;
                        arg1.field3906 = (65536 - var18) / 2;
                        if (var19 < arg1.field3906) {
                            arg1.field3906 = 65536 - var18 - var19;
                        }
                    } else {
                        arg1.field3906 = var18 / 2;
                        arg1.field3928 = var2.field2522;
                        if (arg1.field3906 > var19) {
                            arg1.field3906 = var18 - var19;
                        }
                    }
                }
            } else if (arg1.field3928 > 0) {
                if (arg1.field3906 <= arg1.field3967) {
                    arg1.field3949 = false;
                }
                if (!arg1.field3949) {
                    arg1.field3928 -= var2.field2522;
                    if (arg1.field3928 < 0) {
                        arg1.field3928 = 0;
                    }
                } else if (arg1.field3928 < var2.field2504) {
                    arg1.field3928 += var2.field2522;
                }
            } else {
                if (arg1.field3967 >= arg1.field3906) {
                    arg1.field3949 = false;
                }
                if (!arg1.field3949) {
                    arg1.field3928 += var2.field2522;
                    if (arg1.field3928 > 0) {
                        arg1.field3928 = 0;
                    }
                } else if (arg1.field3928 > -var2.field2504) {
                    arg1.field3928 -= var2.field2522;
                }
            }
            if (arg1.field3928 > 0) {
                arg1.field3967 += arg1.field3928;
            } else {
                arg1.field3967 -= arg1.field3928;
            }
            arg1.field3908 += arg1.field3928;
            arg1.field3908 &= 0xFFFF;
            arg1.field3913 = arg1.field3908 >> 5;
            if (arg1.field3928 >= 0) {
                if (arg1.field3974 > 0) {
                    if (arg1.field3896[arg1.field3974 - 1] == 2) {
                        if (var2.field2513 != -1) {
                            arg1.field3946 = var2.field2513;
                        } else if (var2.field2511 != -1) {
                            arg1.field3946 = var2.field2511;
                        }
                    } else if (arg1.field3896[arg1.field3974 - 1] == 0) {
                        if (var2.field2498 != -1) {
                            arg1.field3946 = var2.field2498;
                        } else if (var2.field2523 != -1) {
                            arg1.field3946 = var2.field2523;
                        }
                    }
                }
                if (arg1.field3946 == -1) {
                    if (var2.field2508 != -1) {
                        arg1.field3946 = var2.field2508;
                    } else if (var2.field2533 != -1) {
                        arg1.field3946 = var2.field2533;
                    }
                }
            } else {
                if (arg1.field3974 > 0) {
                    if (arg1.field3896[arg1.field3974 - 1] == 2) {
                        if (var2.field2493 != -1) {
                            arg1.field3946 = var2.field2493;
                        } else if (var2.field2511 != -1) {
                            arg1.field3946 = var2.field2511;
                        }
                    } else if (arg1.field3896[arg1.field3974 - 1] == 0) {
                        if (var2.field2514 != -1) {
                            arg1.field3946 = var2.field2514;
                        } else if (var2.field2523 != -1) {
                            arg1.field3946 = var2.field2523;
                        }
                    }
                }
                if (arg1.field3946 == -1) {
                    if (var2.field2535 != -1) {
                        arg1.field3946 = var2.field2535;
                    } else if (var2.field2516 != -1) {
                        arg1.field3946 = var2.field2516;
                    }
                }
            }
            if (arg1.field3946 == -1) {
                arg1.field3946 = var2.field2502;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)I")
    public static final int method1380(boolean arg0) {
        if (arg0) {
            method1383(-103);
        }
        field3128++;
        try {
            if (class181.field2858 == 0) {
                if ((class98.method665(true) - 5000L) < class144.field2139) {
                    return 0;
                }
                class110.field1594 = class95.field1425.method1685(120, class8.field108, class120.field1726);
                class146.field2177 = class98.method665(true);
                class181.field2858 = 1;
            }
            if ((class146.field2177 + 30000L) < class98.method665(true)) {
                return class3.method19((byte) -108, 1000);
            }
            if (class181.field2858 == 1) {
                if (class110.field1594.field2399 == 2) {
                    return class3.method19((byte) -12, 1001);
                }
                if (class110.field1594.field2399 != 1) {
                    return -1;
                }
                class270.field4405 = new class83((Socket) class110.field1594.field2401, class95.field1425);
                class150.field2218.field2676 = 0;
                class110.field1594 = null;
                int var1 = 0;
                if (class287.field4644) {
                    var1 = class39.field473;
                }
                class150.field2218.method1183(23, 984049208);
                class150.field2218.method1210(var1, (byte) -16);
                class270.field4405.method562(class150.field2218.field2676, class150.field2218.field2650, 0, 85);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                int var2 = class270.field4405.method571(true);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                if (var2 != 0) {
                    return class3.method19((byte) 7, var2);
                }
                class181.field2858 = 2;
            }
            if (class181.field2858 == 2) {
                if (class270.field4405.method558(-23644) < 2) {
                    return -1;
                }
                class104.field1519 = class270.field4405.method571(true);
                class104.field1519 <<= 0x8;
                class104.field1519 += class270.field4405.method571(!arg0);
                class46.field580 = new byte[class104.field1519];
                class181.field2858 = 3;
                class82.field1256 = 0;
            }
            if (class181.field2858 != 3) {
                return -1;
            }
            int var3 = class270.field4405.method558(-23644);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class104.field1519 - class82.field1256) {
                var3 = class104.field1519 - class82.field1256;
            }
            class270.field4405.method566(var3, class46.field580, false, class82.field1256);
            class82.field1256 += var3;
            if (class104.field1519 > class82.field1256) {
                return -1;
            } else if (class86.method585(-118, class46.field580)) {
                class68.field1021 = new class210[class296.field4734];
                int var4 = 0;
                for (int var5 = class241.field3883; var5 <= class287.field4641; var5++) {
                    class210 var6 = class187.method1314(89, var5);
                    if (var6 != null) {
                        class68.field1021[var4++] = var6;
                    }
                }
                class270.field4405.method567(0);
                class46.field580 = null;
                class270.field4405 = null;
                class181.field2858 = 0;
                class105.field1536 = 0;
                class144.field2139 = class98.method665(true);
                return 0;
            } else {
                return class3.method19((byte) 104, 1002);
            }
        } catch (IOException var7) {
            return class3.method19((byte) 111, 1003);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIZLvl;)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, boolean arg4, class73 arg5) {
        class294.field4712 = 1;
        class105.field1535 = arg3;
        class68.field1023 = arg1;
        field3126++;
        if (arg2 <= -33) {
            class138.field1992 = arg5;
            class93.field1400 = arg0;
            class92.field1369 = 10000;
            class261.field4244 = arg4;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
    public final int method1382(int arg0) {
        if (arg0 <= 72) {
            this.method1378((byte) -3);
        }
        if ((this.field3132--) == 0) {
            this.method1378((byte) -105);
            this.field3132 = 255;
        }
        field3130++;
        return this.field3129[this.field3132];
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static void method1383(int arg0) {
        field3143 = null;
        if (arg0 != 5) {
            method1381(48, -101, -117, 60, false, (class73) null);
        }
        field3137 = null;
        field3141 = null;
        field3140 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    private class198() {
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([I)V")
    public class198(int[] arg0) {
        this.field3129 = new int[256];
        this.field3133 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3129[var2] = arg0[var2];
        }
        this.method1377(70);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3141[var1] = var0 - 1;
            var0 += var0;
        }
        field3142 = false;
        field3143 = new String[200];
    }
}
