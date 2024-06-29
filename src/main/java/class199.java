import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class199 extends class301 {

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field3349 = -1;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Ljava/lang/String;")
    public String field3344;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3348;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[I")
    public static int[] field3342;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[Lka;")
    public static class211[] field3347;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 8)
    public final void method1358(int arg0) {
        this.field4902 = class218.method1520((byte) 37) + 500L | Long.MIN_VALUE & this.field4902;
        if (arg0 != -1) {
            this.method1358(-102);
        }
        field3332++;
        class54.field1072.method1585(this, (byte) -12);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)I", line = 25)
    public final int method1359(boolean arg0) {
        field3346++;
        if (arg0) {
            method1363(2);
        }
        return (int) (this.field1291 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V", line = 39)
    public static final void method1360(boolean arg0, int arg1) {
        field3350++;
        class199 var2 = class173.method1231(arg0, 14, arg1);
        var2.method1358(-1);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)I", line = 50)
    public final int method1361(byte arg0) {
        field3337++;
        int var2 = -104 / ((-arg0 - 62) / 61);
        return (int) this.field1291;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 61)
    public static final String method1362(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 2) {
            field3347 = (class211[]) null;
        }
        char[] var4 = new char[arg1];
        field3341++;
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg2[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class57.field1144[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 104)
    public static void method1363(int arg0) {
        field3347 = null;
        int var1 = 5 % ((arg0 - 40) / 46);
        field3348 = null;
        field3342 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqc;Z)V", line = 115)
    public static final void method1364(class6 arg0, boolean arg1) {
        field3335++;
        if (arg0.field135 == 0) {
            return;
        }
        class5 var2 = arg0.method60(arg1);
        if (arg0.field190 != -1 && arg0.field190 < 32768) {
            class314 var3 = class149.field2533[arg0.field190];
            if (var3 != null) {
                int var4 = arg0.field213 - var3.field213;
                int var5 = arg0.field199 - var3.field199;
                if (var5 != 0 || var4 != 0) {
                    arg0.field144 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field190 >= 32768) {
            int var6 = arg0.field190 - 32768;
            if (class96.field1752 == var6) {
                var6 = 2047;
            }
            class98 var7 = class182.field3151[var6];
            if (var7 != null) {
                int var8 = arg0.field199 - var7.field199;
                int var9 = arg0.field213 - var7.field213;
                if (var8 != 0 || var9 != 0) {
                    arg0.field144 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field157 != 0 || arg0.field181 != 0) && (arg0.field179 == 0 || arg0.field121 > 0)) {
            int var10 = arg0.field199 - (arg0.field157 - class272.field4426 - class272.field4426) * 64;
            int var11 = arg0.field213 - ((arg0.field181 - (class21.field543 + class21.field543)) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field144 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field157 = 0;
            arg0.field181 = 0;
        }
        int var12 = arg0.field144 - arg0.field216 & 0x7FF;
        if (var12 == 0) {
            arg0.field146 = 0;
            arg0.field202 = 0;
        } else if (var2.field112 == 0) {
            arg0.field146++;
            if (var12 > 1024) {
                arg0.field216 -= arg0.field135;
                boolean var20 = true;
                if (arg0.field135 > var12 || var12 > (2048 - arg0.field135)) {
                    arg0.field216 = arg0.field144;
                    var20 = false;
                }
                if (arg0.field146 > 25 || var20) {
                    arg0.field206 = var2.field90;
                    if (arg0.field179 <= 0) {
                        if (var2.field97 != -1) {
                            arg0.field206 = var2.field97;
                        }
                    } else if (arg0.field118[arg0.field179 - 1] == 2) {
                        if (var2.field88 != -1) {
                            arg0.field206 = var2.field88;
                        } else if (var2.field80 != -1) {
                            arg0.field206 = var2.field80;
                        }
                    } else if (arg0.field118[arg0.field179 - 1] == 0) {
                        if (var2.field104 != -1) {
                            arg0.field206 = var2.field104;
                        } else if (var2.field82 != -1) {
                            arg0.field206 = var2.field82;
                        }
                    } else if (var2.field109 != -1) {
                        arg0.field206 = var2.field109;
                    }
                }
            } else {
                arg0.field216 += arg0.field135;
                boolean var21 = true;
                if (arg0.field135 > var12 || 2048 - arg0.field135 < var12) {
                    var21 = false;
                    arg0.field216 = arg0.field144;
                }
                if (arg0.field146 > 25 || var21) {
                    arg0.field206 = var2.field90;
                    if (arg0.field179 > 0) {
                        if (arg0.field118[arg0.field179 - 1] == 2) {
                            if (var2.field93 != -1) {
                                arg0.field206 = var2.field93;
                            } else if (var2.field80 != -1) {
                                arg0.field206 = var2.field80;
                            }
                        } else if (arg0.field118[arg0.field179 - 1] == 0) {
                            if (var2.field101 != -1) {
                                arg0.field206 = var2.field101;
                            } else if (var2.field82 != -1) {
                                arg0.field206 = var2.field82;
                            }
                        } else if (var2.field81 != -1) {
                            arg0.field206 = var2.field81;
                        }
                    } else if (var2.field85 != -1) {
                        arg0.field206 = var2.field85;
                    }
                }
            }
            arg0.field216 &= 0x7FF;
        } else {
            arg0.field206 = -1;
            int var13 = arg0.field144 << 5;
            if (arg0.field188 != var13) {
                arg0.field140 = 0;
                int var14 = var13 - arg0.field211 & 0xFFFF;
                arg0.field188 = var13;
                int var15 = arg0.field202 * arg0.field202 / (var2.field112 * 2);
                if (arg0.field202 > 0 && var15 <= var14 && var14 - var15 < 32768) {
                    arg0.field152 = true;
                    arg0.field186 = var14 / 2;
                    int var16 = var2.field86 * var2.field86 / (var2.field112 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (arg0.field186 > var16) {
                        arg0.field186 = var14 - var16;
                    }
                } else if (arg0.field202 < 0 && var15 <= 65536 - var14 && 65536 - (var14 + var15) < 32768) {
                    arg0.field152 = true;
                    arg0.field186 = (65536 - var14) / 2;
                    int var17 = var2.field86 * var2.field86 / (var2.field112 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg0.field186 > var17) {
                        arg0.field186 = 65536 - var17 - var14;
                    }
                } else {
                    arg0.field152 = false;
                }
            }
            if (arg0.field202 == 0) {
                int var18 = arg0.field188 - arg0.field211 & 0xFFFF;
                if (var2.field112 <= var18) {
                    arg0.field152 = true;
                    arg0.field140 = 0;
                    int var19 = var2.field86 * var2.field86 / (var2.field112 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg0.field186 = var18 / 2;
                        arg0.field202 = var2.field112;
                        if (var19 < arg0.field186) {
                            arg0.field186 = var18 - var19;
                        }
                    } else {
                        arg0.field202 = -var2.field112;
                        arg0.field186 = (65536 - var18) / 2;
                        if (var19 < arg0.field186) {
                            arg0.field186 = 65536 - var18 - var19;
                        }
                    }
                } else {
                    arg0.field211 = arg0.field188;
                }
            } else if (arg0.field202 > 0) {
                if (arg0.field186 <= arg0.field140) {
                    arg0.field152 = false;
                }
                if (!arg0.field152) {
                    arg0.field202 -= var2.field112;
                    if (arg0.field202 < 0) {
                        arg0.field202 = 0;
                    }
                } else if (arg0.field202 < var2.field86) {
                    arg0.field202 += var2.field112;
                }
            } else {
                if (arg0.field140 >= arg0.field186) {
                    arg0.field152 = false;
                }
                if (!arg0.field152) {
                    arg0.field202 += var2.field112;
                    if (arg0.field202 > 0) {
                        arg0.field202 = 0;
                    }
                } else if (-var2.field86 < arg0.field202) {
                    arg0.field202 -= var2.field112;
                }
            }
            arg0.field211 += arg0.field202;
            arg0.field211 &= 0xFFFF;
            arg0.field216 = arg0.field211 >> 5;
            if (arg0.field202 > 0) {
                arg0.field140 += arg0.field202;
            } else {
                arg0.field140 -= arg0.field202;
            }
            if (arg0.field202 >= 0) {
                if (arg0.field179 > 0) {
                    if (arg0.field118[arg0.field179 - 1] == 2) {
                        if (var2.field93 != -1) {
                            arg0.field206 = var2.field93;
                        } else if (var2.field80 != -1) {
                            arg0.field206 = var2.field80;
                        }
                    } else if (arg0.field118[arg0.field179 - 1] == 0) {
                        if (var2.field101 != -1) {
                            arg0.field206 = var2.field101;
                        } else if (var2.field82 != -1) {
                            arg0.field206 = var2.field82;
                        }
                    }
                }
                if (arg0.field206 == -1) {
                    if (var2.field81 != -1) {
                        arg0.field206 = var2.field81;
                    } else if (var2.field85 != -1) {
                        arg0.field206 = var2.field85;
                    }
                }
            } else {
                if (arg0.field179 > 0) {
                    if (arg0.field118[arg0.field179 - 1] == 2) {
                        if (var2.field88 != -1) {
                            arg0.field206 = var2.field88;
                        } else if (var2.field80 != -1) {
                            arg0.field206 = var2.field80;
                        }
                    } else if (arg0.field118[arg0.field179 - 1] == 0) {
                        if (var2.field104 != -1) {
                            arg0.field206 = var2.field104;
                        } else if (var2.field82 != -1) {
                            arg0.field206 = var2.field82;
                        }
                    }
                }
                if (arg0.field206 == -1) {
                    if (var2.field109 != -1) {
                        arg0.field206 = var2.field109;
                    } else if (var2.field97 != -1) {
                        arg0.field206 = var2.field97;
                    }
                }
            }
            if (arg0.field206 == -1) {
                arg0.field206 = var2.field90;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)J", line = 551)
    public final long method1365(boolean arg0) {
        if (arg0) {
            this.method1358(121);
        }
        field3334++;
        return this.field4902 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI[Lrm;ZII[BI)[I", line = 563)
    public static final int[] method1366(byte arg0, int arg1, class273[] arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        field3336++;
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (arg0 != -112) {
            method1366((byte) 43, 25, (class273[]) null, true, -104, -79, (byte[]) null, -37);
        }
        if (!arg3) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg1 + var11 > 0 && (arg1 + var11) < 103) {
                            arg2[var9].field4451[arg5 + var10][arg1 + var11] = class83.method613(arg2[var9].field4451[arg5 + var10][arg1 + var11], -2097153);
                        }
                    }
                }
            }
        }
        int var12 = arg4 + arg5;
        class146 var13 = new class146(arg6);
        int var14 = arg7 + arg1;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class205.method1398(var16 + arg5, arg1 + var17, false, arg3, var15, var13, 0, 0, var12 + var16, arg0 ^ 0x58, 0, var14 + var17);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var13.field2435 < var13.field2496.length) {
            int var20 = var13.method1005((byte) 122);
            if (var20 == 128) {
                var18 = true;
                class144.field2418[0] = var13.method989(arg0 + 230);
                class144.field2418[1] = var13.method1050(3);
                class144.field2418[2] = var13.method1050(3);
                class144.field2418[3] = var13.method1050(3);
                class144.field2418[4] = var13.method989(108);
            } else {
                if (var20 != 129) {
                    var13.field2435--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var13.method1029(arg0 ^ 0x6E);
                    if (var22 == 0) {
                        int var32 = arg5;
                        if (arg5 < 0) {
                            var32 = 0;
                        } else if (arg5 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg5 + 64;
                        int var34 = arg1;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        if (arg1 < 0) {
                            var34 = 0;
                        } else if (arg1 >= 104) {
                            var34 = 104;
                        }
                        int var35 = arg1 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var32 < var33) {
                            while (var34 < var35) {
                                class271.field4409[var21][var32][var34] = 0;
                                var34++;
                            }
                            var32++;
                        }
                    } else if (var22 == 1) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            for (int var24 = 0; var24 < 64; var24 += 4) {
                                byte var25 = var13.method1029(-2);
                                for (int var26 = arg5 + var23; var26 < var23 + arg5 + 4; var26++) {
                                    for (int var27 = arg1 + var24; var27 < (var24 + arg1 + 4); var27++) {
                                        if (var26 >= 0 && var26 < 104 && var27 >= 0 && var27 < 104) {
                                            class271.field4409[var21][var26][var27] = var25;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var28 = arg5;
                        int var29 = arg5 + 64;
                        if (arg5 < 0) {
                            var28 = 0;
                        } else if (arg5 >= 104) {
                            var28 = 104;
                        }
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        int var30 = arg1 + 64;
                        int var31 = arg1;
                        if (arg1 < 0) {
                            var31 = 0;
                        } else if (arg1 >= 104) {
                            var31 = 104;
                        }
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        while (var29 > var28) {
                            while (var30 > var31) {
                                class271.field4409[var21][var28][var31] = class271.field4409[var21 - 1][var28][var31];
                                var31++;
                            }
                            var28++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class241.field4016 && !arg3) {
            class134 var36 = null;
            label295: while (true) {
                int var38;
                label288: do {
                    while (true) {
                        while (var13.field2435 < var13.field2496.length) {
                            int var37 = var13.method1005((byte) 122);
                            if (var37 == 0) {
                                var36 = new class134(var13);
                            } else {
                                if (var37 == 1) {
                                    var38 = var13.method1005((byte) 122);
                                    continue label288;
                                }
                                if (var37 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var36 == null) {
                                    var36 = new class134();
                                }
                                var36.method943((byte) 107, var13);
                            }
                        }
                        if (var36 == null) {
                            var36 = new class134();
                        }
                        for (int var44 = 0; var44 < 8; var44++) {
                            for (int var45 = 0; var45 < 8; var45++) {
                                int var46 = (arg5 >> 3) + var44;
                                int var47 = (arg1 >> 3) + var45;
                                if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                    class191.field3233[var46][var47] = var36;
                                }
                            }
                        }
                        break label295;
                    }
                } while (var38 <= 0);
                for (int var39 = 0; var39 < var38; var39++) {
                    class33 var40 = new class33(var13);
                    if (var40.field742 == 31) {
                        class255 var41 = class162.method1164(var13.method989(120), (byte) -81);
                        var40.method240(var41.field4185, var41.field4177, -126, var41.field4178, var41.field4186);
                    }
                    var40.field750 += arg5 << 7;
                    var40.field733 += arg1 << 7;
                    int var42 = var40.field750 >> 7;
                    int var43 = var40.field733 >> 7;
                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                        var40.field749 = (class282.field4615[1][var42][var43] & 0x2) != 0;
                        var40.field737 = class144.field2427[var40.field746][var42][var43] - var40.field737;
                        class2.method24(var40);
                    }
                }
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg1 >> 2) + var50;
                        int var52 = (arg5 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class271.field4409[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class144.field2418 : null;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 986)
    public final void method1367(byte arg0) {
        int var2 = -89 / ((47 - arg0) / 45);
        this.field4902 |= Long.MIN_VALUE;
        if (this.method1365(false) == 0L) {
            class197.field3288.method1585(this, (byte) -12);
        }
        field3339++;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V", line = 1002)
    public class199(int arg0, int arg1) {
        this.field1291 = (long) arg1 | (long) arg0 << 32;
    }
}
