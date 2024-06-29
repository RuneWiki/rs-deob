import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class169 {

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lud;")
    public static class279 field3059 = class130.method1024("settings", 255);

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lhc;")
    public static class171 field3058 = new class171(50);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lud;")
    public static class279 field3063 = class130.method1024(" (X", 255);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lok;")
    public static class149 field3060;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lok;")
    public static class149 field3062;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 4)
    public static void method1316(byte arg0) {
        field3060 = null;
        field3062 = null;
        if (arg0 != -4) {
            field3059 = (class279) null;
        }
        field3059 = null;
        field3058 = null;
        field3063 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1317(int arg0) {
        field3061++;
        class134.field2444 = null;
        if (arg0 == 1) {
            class129.method1019();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I", line = 41)
    public static final int method1318(byte arg0, int arg1) {
        double var2 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 < 96) {
            return -5;
        }
        field3055++;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var4;
        if (var4 > var2) {
            var8 = var2;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var4;
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var2 > var4) {
            var10 = var2;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var4 == var10) {
                var12 = (var2 - var6) / (var10 - var8);
            } else if (var2 == var10) {
                var12 = (var6 - var4) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var4 - var2) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var14 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var21 > 243) {
            var20 >>= 0x4;
        } else if (var21 > 217) {
            var20 >>= 0x3;
        } else if (var21 > 192) {
            var20 >>= 0x2;
        } else if (var21 > 179) {
            var20 >>= 0x1;
        }
        int var22 = (int) (var18 * 256.0D);
        return (var21 >> 1) + ((var22 >> 2 << 10) + (var20 >> 5 << 7));
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIIIIIIIIIII)Z", line = 154)
    public static final boolean method1319(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3057++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class125.field2309[var13][var14] = 0;
                class15.field480[var13][var14] = 99999999;
            }
        }
        int var15 = arg9;
        class125.field2309[arg9][arg10] = 99;
        byte var16 = 0;
        int var17 = arg10;
        class15.field480[arg9][arg10] = 0;
        class105.field1986[var16] = arg9;
        int var41 = var16 + 1;
        class211.field3709[var16] = arg10;
        boolean var18 = false;
        int var19 = 0;
        int[][] var20 = class90.field1702[class287.field5134].field2215;
        if (arg6 != 14677) {
            method1319(false, -117, 64, -87, 121, 50, 119, -27, -49, 70, 80, 18, -11);
        }
        label392: while (var41 != var19) {
            var15 = class105.field1986[var19];
            var17 = class211.field3709[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg8 == var15 && arg5 == var17) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class90.field1702[class287.field5134].method978(var15, arg5, arg12, arg8, arg3 - 1, var17, arg11, -108)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class90.field1702[class287.field5134].method968(arg11, var17, arg5, -1, arg8, var15, arg3 - 1, arg12)) {
                    var18 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg7 != 0 && class90.field1702[class287.field5134].method983(arg5, arg7, arg12, arg2, var15, -1, arg8, arg4, var17)) {
                var18 = true;
                break;
            }
            int var21 = class15.field480[var15][var17] + 1;
            if (var15 > 0 && class125.field2309[var15 - 1][var17] == 0 && (var20[var15 - 1][var17] & 0x12C010E) == 0 && (var20[var15 - 1][arg12 + var17 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if ((arg12 - 1) <= var22) {
                        class105.field1986[var41] = var15 - 1;
                        class211.field3709[var41] = var17;
                        class125.field2309[var15 - 1][var17] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class15.field480[var15 - 1][var17] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class125.field2309[var15 + 1][var17] == 0 && (var20[arg12 + var15][var17] & 0x12C0183) == 0 && (var20[var15 + arg12][var17 + arg12 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg12 - 1) {
                        class105.field1986[var41] = var15 + 1;
                        class211.field3709[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field2309[var15 + 1][var17] = 8;
                        class15.field480[var15 + 1][var17] = var21;
                        break;
                    }
                    if ((var20[arg12 + var15][var17 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var17 > 0 && class125.field2309[var15][var17 - 1] == 0 && (var20[var15][var17 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg12 - 1) {
                        class105.field1986[var41] = var15;
                        class211.field3709[var41] = var17 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field2309[var15][var17 - 1] = 1;
                        class15.field480[var15][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var17 < 102 && class125.field2309[var15][var17 + 1] == 0 && (var20[var15][arg12 + var17] & 0x12C0138) == 0 && (var20[arg12 + var15 - 1][var17 + arg12] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg12 - 1 <= var25) {
                        class105.field1986[var41] = var15;
                        class211.field3709[var41] = var17 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field2309[var15][var17 + 1] = 4;
                        class15.field480[var15][var17 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg12 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var17 > 0 && class125.field2309[var15 - 1][var17 - 1] == 0 && (var20[var15 - 1][var17 + arg12 - 2] & 0x12C0138) == 0 && (var20[var15 - 1][var17 - 1] & 0x12C010E) == 0 && (var20[var15 - (-arg12 + 1) - 1][var17 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg12 - 1 <= var26) {
                        class105.field1986[var41] = var15 - 1;
                        class211.field3709[var41] = var17 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field2309[var15 - 1][var17 - 1] = 3;
                        class15.field480[var15 - 1][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var26 - 1] & 0x12C013E) != 0 || (var20[var26 + var15 - 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var17 > 0 && class125.field2309[var15 + 1][var17 - 1] == 0 && (var20[var15 + 1][var17 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15][var17 - 1] & 0x12C0183) == 0 && (var20[arg12 + var15][arg12 + var17 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if ((arg12 - 1) <= var27) {
                        class105.field1986[var41] = var15 + 1;
                        class211.field3709[var41] = var17 - 1;
                        class125.field2309[var15 + 1][var17 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class15.field480[var15 + 1][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + arg12][var27 + var17 - 1] & 0x12C01E3) != 0 || (var20[var27 + var15 + 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var17 < 102 && class125.field2309[var15 - 1][var17 + 1] == 0 && (var20[var15 - 1][var17 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg12 + var17] & 0x12C0138) == 0 && (var20[var15][arg12 + var17] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= arg12 - 1) {
                        class105.field1986[var41] = var15 - 1;
                        class211.field3709[var41] = var17 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field2309[var15 - 1][var17 + 1] = 6;
                        class15.field480[var15 - 1][var17 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 - (1 - var28)][arg12 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var17 < 102 && class125.field2309[var15 + 1][var17 + 1] == 0 && (var20[var15 + 1][arg12 + var17] & 0x12C0138) == 0 && (var20[var15 + arg12][arg12 + var17] & 0x12C01E0) == 0 && (var20[arg12 + var15][var17 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg12 - 1; var29++) {
                    if ((var20[var29 + var15 + 1][arg12 + var17] & 0x12C01F8) != 0 || (var20[var15 + arg12][var17 - (-var29 - 1)] & 0x12C01E3) != 0) {
                        continue label392;
                    }
                }
                class105.field1986[var41] = var15 + 1;
                class211.field3709[var41] = var17 + 1;
                var41 = var41 + 1 & 0xFFF;
                class125.field2309[var15 + 1][var17 + 1] = 12;
                class15.field480[var15 + 1][var17 + 1] = var21;
            }
        }
        class100.field1872 = 0;
        if (!var18) {
            if (!arg0) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg8 - var32; var33 <= (arg8 + var32); var33++) {
                for (int var34 = arg5 - var32; var34 <= (arg5 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class15.field480[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg8) {
                            var35 = arg8 - var33;
                        } else if (var33 > arg2 + arg8 - 1) {
                            var35 = var33 + 1 - arg2 - arg8;
                        }
                        int var36 = 0;
                        if (arg5 > var34) {
                            var36 = arg5 - var34;
                        } else if ((arg5 + arg7 - 1) < var34) {
                            var36 = 1 - (arg5 + arg7 - var34);
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var30 > var37 || var30 == var37 && class15.field480[var33][var34] < var31) {
                            var15 = var33;
                            var30 = var37;
                            var17 = var34;
                            var31 = class15.field480[var33][var34];
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg9 == var15 && arg10 == var17) {
                return false;
            }
            class100.field1872 = 1;
        }
        byte var38 = 0;
        class105.field1986[var38] = var15;
        int var42 = var38 + 1;
        class211.field3709[var38] = var17;
        int var39;
        int var40 = var39 = class125.field2309[var15][var17];
        while (arg9 != var15 || arg10 != var17) {
            if (var39 != var40) {
                class105.field1986[var42] = var15;
                class211.field3709[var42++] = var17;
                var39 = var40;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var17++;
            } else if ((var40 & 0x4) != 0) {
                var17--;
            }
            var40 = class125.field2309[var15][var17];
        }
        if (var42 > 0) {
            class322.method2268(-101, var42, arg1);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 648)
    public static final void method1320(int arg0, int arg1) {
        int var2 = -89 / ((arg0 + 52) / 44);
        field3056++;
        class119.field2148.method1339(arg1, 19326);
        class34.field767.method1339(arg1, 19326);
        class172.field3111.method1339(arg1, 19326);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 665)
    public static final void method1321() {
        class222.field3933 = 0;
        label194: for (int var0 = 0; var0 < class167.field3013; var0++) {
            class195 var1 = class37.field840[var0];
            if (class164.field2950 != null) {
                for (int var2 = 0; var2 < class164.field2950.length; var2++) {
                    if (class164.field2950[var2] != -1000000 && (var1.field3509 <= class164.field2950[var2] || var1.field3515 <= class164.field2950[var2]) && (var1.field3517 <= class200.field3581[var2] || var1.field3506 <= class200.field3581[var2]) && (var1.field3517 >= class321.field5605[var2] || var1.field3506 >= class321.field5605[var2]) && (var1.field3522 <= class245.field4352[var2] || var1.field3514 <= class245.field4352[var2]) && (var1.field3522 >= class324.field5665[var2] || var1.field3514 >= class324.field5665[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3520 == 1) {
                int var3 = var1.field3524 + class115.field2091 - class223.field3956;
                if (var3 >= 0 && var3 <= class115.field2091 + class115.field2091) {
                    int var4 = var1.field3510 + class115.field2091 - class45.field951;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3527 + class115.field2091 - class45.field951;
                    if (var5 > class115.field2091 + class115.field2091) {
                        var5 = class115.field2091 + class115.field2091;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class213.field3734[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class306.field5430 - var1.field3517;
                        if (var7 > 32) {
                            var1.field3500 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3500 = 2;
                            var7 = -var7;
                        }
                        var1.field3502 = (var1.field3522 - class233.field4083 << 8) / var7;
                        var1.field3523 = (var1.field3514 - class233.field4083 << 8) / var7;
                        var1.field3512 = (var1.field3509 - class318.field5581 << 8) / var7;
                        var1.field3503 = (var1.field3515 - class318.field5581 << 8) / var7;
                        class77.field1495[class222.field3933++] = var1;
                    }
                }
            } else if (var1.field3520 == 2) {
                int var8 = var1.field3510 + class115.field2091 - class45.field951;
                if (var8 >= 0 && var8 <= class115.field2091 + class115.field2091) {
                    int var9 = var1.field3524 + class115.field2091 - class223.field3956;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3518 + class115.field2091 - class223.field3956;
                    if (var10 > class115.field2091 + class115.field2091) {
                        var10 = class115.field2091 + class115.field2091;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class213.field3734[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class233.field4083 - var1.field3522;
                        if (var12 > 32) {
                            var1.field3500 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3500 = 4;
                            var12 = -var12;
                        }
                        var1.field3508 = (var1.field3517 - class306.field5430 << 8) / var12;
                        var1.field3528 = (var1.field3506 - class306.field5430 << 8) / var12;
                        var1.field3512 = (var1.field3509 - class318.field5581 << 8) / var12;
                        var1.field3503 = (var1.field3515 - class318.field5581 << 8) / var12;
                        class77.field1495[class222.field3933++] = var1;
                    }
                }
            } else if (var1.field3520 == 4) {
                int var13 = var1.field3509 - class318.field5581;
                if (var13 > 128) {
                    int var14 = var1.field3510 + class115.field2091 - class45.field951;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3527 + class115.field2091 - class45.field951;
                    if (var15 > class115.field2091 + class115.field2091) {
                        var15 = class115.field2091 + class115.field2091;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3524 + class115.field2091 - class223.field3956;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3518 + class115.field2091 - class223.field3956;
                        if (var17 > class115.field2091 + class115.field2091) {
                            var17 = class115.field2091 + class115.field2091;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class213.field3734[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3500 = 5;
                            var1.field3508 = (var1.field3517 - class306.field5430 << 8) / var13;
                            var1.field3528 = (var1.field3506 - class306.field5430 << 8) / var13;
                            var1.field3502 = (var1.field3522 - class233.field4083 << 8) / var13;
                            var1.field3523 = (var1.field3514 - class233.field4083 << 8) / var13;
                            class77.field1495[class222.field3933++] = var1;
                        }
                    }
                }
            }
        }
    }
}
