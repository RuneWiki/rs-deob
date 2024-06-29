import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class6 extends class127 {

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field71 = -1;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lrc;")
    public static class105 field70 = class43.method374(":tradereq:", 0);

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lrc;")
    public static class105 field78 = class43.method374("sideicons", 0);

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Lle;")
    public static class71 field65 = new class71(64);

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lrc;")
    public static class105 field80 = class43.method374("Welt", 0);

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "J")
    public static long field75;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Lbd;")
    public static class11 field66;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lme;")
    public static class77 field79;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Ltb;", line = 4)
    public static final class116 method49(int arg0, int arg1) {
        field63++;
        class116 var2 = (class116) class30.field674.method601((long) arg1, (byte) 118);
        if (arg0 != 103) {
            field76 = -122;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class60.field1335.method766(arg1, (byte) -45, 12);
        class116 var4 = new class116();
        if (var3 != null) {
            var4.method943(new class7(var3), true);
        }
        var4.method941(101);
        class30.field674.method608((long) arg1, var4, (byte) 123);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZJI)V", line = 38)
    public final void method50(int arg0, boolean arg1, long arg2, int arg3) {
        field69++;
        int var6 = (int) ((double) arg3 * Math.pow(0.1D, (double) arg0 * 5.0E-4D) + 0.5D);
        if (!arg1) {
            method49(-31, -86);
        }
        if (class73.field1604 == var6) {
            return;
        }
        class73.field1604 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method51(var7);
            this.method57(var7 + 176, 7, var8 >> 7, arg2);
            this.method57(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)I", line = 71)
    private static final int method51(int arg0) {
        int var1 = class116.field2712[arg0];
        int var2 = (class73.field1604 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IJ)V", line = 76)
    public final void method52(int arg0, long arg1) {
        field62++;
        for (int var4 = 0; var4 < 128; var4++) {
            int var12 = class74.field1655[var4];
            class74.field1655[var4] = 0;
            for (int var13 = 0; var13 < 16; var13++) {
                if ((0x1 << var13 & var12) != 0) {
                    this.method57(var13 + 144, var4, 0, arg1);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method57(var5 + 176, 123, 0, arg1);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method57(var6 + 176, 120, 0, arg1);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method57(var7 + 176, 121, 0, arg1);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method57(var8 + 176, 0, 0, arg1);
        }
        int var9 = -17 / ((arg0 + 65) / 34);
        for (int var10 = 0; var10 < 16; var10++) {
            this.method57(var10 + 176, 32, 0, arg1);
        }
        for (int var11 = 0; var11 < 16; var11++) {
            this.method57(var11 + 192, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 150)
    public static final void method53(int arg0) {
        field74++;
        short var1 = 256;
        if (class125.field3053 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class125.field3053 > 768) {
                    class111.field2566[var4] = class73.method616(17479, class74.field1647[var4], 1024 - class125.field3053, class76.field1711[var4]);
                } else if (class125.field3053 <= 256) {
                    class111.field2566[var4] = class73.method616(17479, class76.field1711[var4], 256 - class125.field3053, class74.field1647[var4]);
                } else {
                    class111.field2566[var4] = class74.field1647[var4];
                }
            }
        } else if (class133.field3220 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class111.field2566[var2] = class76.field1711[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class133.field3220 > 768) {
                    class111.field2566[var3] = class73.method616(17479, class71.field1564[var3], 1024 - class133.field3220, class76.field1711[var3]);
                } else if (class133.field3220 > 256) {
                    class111.field2566[var3] = class71.field1564[var3];
                } else {
                    class111.field2566[var3] = class73.method616(17479, class76.field1711[var3], 256 - class133.field3220, class71.field1564[var3]);
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class45.field1014.field789[var5] = class92.field2156.field613[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var23 = (var1 - var8) * class97.field2230[var8] / var1;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var6 += var24;
            for (int var25 = var24; var25 < 128; var25++) {
                int var26 = class41.field926[var6++];
                if (var26 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var26;
                    int var29 = class45.field1014.field789[var7];
                    int var30 = class111.field2566[var26];
                    class45.field1014.field789[var7++] = class100.method807(16711680, class100.method807(var29, 65280) * var27 + var26 * class100.method807(65280, var30)) + class100.method807(-16711936, var27 * class100.method807(16711935, var29) + class100.method807(var30, 16711935) * var26) >> 8;
                }
            }
            var7 += var24;
        }
        int var9 = 1176;
        for (int var10 = 0; var10 < 33920; var10++) {
            class133.field3234.field789[var10] = class35.field824.field613[var10];
        }
        int var11 = 0;
        int var12 = -112 / ((arg0 + 12) / 41);
        for (int var13 = 1; var13 < var1 - 1; var13++) {
            int var14 = (var1 - var13) * class97.field2230[var13] / var1;
            int var15 = var9 + var14;
            int var16 = 103 - var14;
            for (int var17 = 0; var17 < var16; var17++) {
                int var18 = class41.field926[var11++];
                if (var18 == 0) {
                    var15++;
                } else {
                    int var20 = 256 - var18;
                    int var21 = class111.field2566[var18];
                    int var22 = class133.field3234.field789[var15];
                    class133.field3234.field789[var15++] = class100.method807(var20 * class100.method807(var22, 16711935) + class100.method807(16711935, var21) * var18, -16711936) + class100.method807(class100.method807(65280, var22) * var20 + var18 * class100.method807(65280, var21), 16711680) >> 8;
                }
            }
            var9 = var15 + 128 - var14 - var16;
            var11 += 128 - var16;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 321)
    public static void method54(byte arg0) {
        field79 = null;
        field78 = null;
        field70 = null;
        field65 = null;
        field66 = null;
        field80 = null;
        if (arg0 != -48) {
            field82 = -71;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIJ)Z", line = 336)
    public final boolean method55(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class74.field1655[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class74.field1655[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class74.field1655[arg1] = var7 | var6;
            } else {
                this.method57(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method57(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class116.field2712[var8] = 12800;
                int var9 = method51(var8);
                this.method57(arg0, 7, var9 >> 7, arg3);
                this.method57(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class116.field2712[var10] = (arg2 << 7) + (class116.field2712[var10] & 0x7F);
                } else {
                    class116.field2712[var10] = (class116.field2712[var10] & 0x3F80) + arg2;
                }
                int var11 = method51(var10);
                this.method57(arg0, 7, var11 >> 7, arg3);
                this.method57(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)I", line = 400)
    public static final int method56(boolean arg0) {
        if (!arg0) {
            field75 = 86L;
        }
        field77++;
        return class14.field274++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBJ)V", line = 425)
    public final void method58(int arg0, byte arg1, long arg2) {
        class73.field1604 = arg0;
        field67++;
        int var5 = 0;
        int var6 = 59 / ((arg1 - 70) / 55);
        while (var5 < 16) {
            class116.field2712[var5] = 12800;
            var5++;
        }
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method51(var7);
            this.method57(var7 + 176, 7, var8 >> 7, arg2);
            this.method57(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILkb;IIILsb;II)V", line = 472)
    public static final void method59(int arg0, int arg1, class62 arg2, int arg3, int arg4, int arg5, class110 arg6, int arg7, int arg8) {
        field64++;
        if (class109.field2520 && (class57.field1185[0][arg3][arg7] & 0x2) == 0) {
            if ((class57.field1185[arg8][arg3][arg7] & 0x10) != 0) {
                return;
            }
            if (class110.method894(arg7, arg3, -1, arg8) != class36.field833) {
                return;
            }
        }
        if (arg8 < class132.field3206) {
            class132.field3206 = arg8;
        }
        int var9 = class9.field151[arg8][arg3 + 1][arg7];
        int var10 = class9.field151[arg8][arg3 + 1][arg7 + 1];
        if (arg1 != -24053) {
            field78 = null;
        }
        int var11 = class9.field151[arg8][arg3][arg7];
        int var12 = (arg4 << 14) + (arg7 << 7) + arg3 + 1073741824;
        int var13 = class9.field151[arg8][arg3][arg7 + 1];
        class121 var14 = class12.method149(arg4, (byte) 62);
        int var15 = var10 + var11 + var9 + var13 >> 2;
        int var16 = (arg5 << 6) + arg0;
        if (var14.field2948 == 0) {
            var12 += Integer.MIN_VALUE;
        }
        if (var14.field2910 == 1) {
            var16 += 256;
        }
        if (var14.method987(17)) {
            class64.method546(arg7, (byte) -90, var14, arg5, arg3, arg8);
        }
        if (arg0 == 22) {
            if (!class109.field2520 || var14.field2948 != 0 || var14.field2964) {
                class60 var17;
                if (var14.field2959 == -1 && var14.field2909 == null) {
                    var17 = var14.method983(var10, var13, var9, var11, arg5, (byte) 29, 22);
                } else {
                    var17 = new class67(arg4, 22, arg5, var11, var9, var10, var13, var14.field2959, true, null);
                }
                arg2.method518(arg8, arg3, arg7, var15, var17, var12, var16);
                if (var14.field2931 && var14.field2948 == 1 && arg6 != null) {
                    arg6.method897(arg3, arg7, -111);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class60 var37;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var37 = var14.method983(var10, var13, var9, var11, arg5, (byte) 64, 10);
            } else {
                var37 = new class67(arg4, 10, arg5, var11, var9, var10, var13, var14.field2959, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg5 == 1 || arg5 == 3) {
                    var39 = var14.field2912;
                    var38 = var14.field2906;
                } else {
                    var38 = var14.field2912;
                    var39 = var14.field2906;
                }
                int var40 = 0;
                if (arg0 == 11) {
                    var40 += 256;
                }
                if (arg2.method523(arg8, arg3, arg7, var15, var39, var38, var37, var40, var12, var16) && var14.field2908) {
                    class56 var41;
                    if (var37 instanceof class56) {
                        var41 = (class56) var37;
                    } else {
                        var41 = var14.method983(var10, var13, var9, var11, arg5, (byte) 71, 10);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method446() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (class127.field3100[arg8][arg3 + var42][arg7 + var43] < var44) {
                                    class127.field3100[arg8][arg3 + var42][arg7 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var14.field2931 && arg6 != null) {
                arg6.method896(arg3, var14.field2912, var14.field2906, arg5, var14.field2960, true, arg7);
            }
        } else if (arg0 >= 12) {
            class60 var18;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var18 = var14.method983(var10, var13, var9, var11, arg5, (byte) 88, arg0);
            } else {
                var18 = new class67(arg4, arg0, arg5, var11, var9, var10, var13, var14.field2959, true, null);
            }
            arg2.method523(arg8, arg3, arg7, var15, 1, 1, var18, 0, var12, var16);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg8 > 0) {
                client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 2340);
            }
            if (var14.field2931 && arg6 != null) {
                arg6.method896(arg3, var14.field2912, var14.field2906, arg5, var14.field2960, true, arg7);
            }
        } else if (arg0 == 0) {
            class60 var19;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var19 = var14.method983(var10, var13, var9, var11, arg5, (byte) 16, 0);
            } else {
                var19 = new class67(arg4, 0, arg5, var11, var9, var10, var13, var14.field2959, true, null);
            }
            arg2.method542(arg8, arg3, arg7, var15, var19, null, class98.field2267[arg5], 0, var12, var16);
            if (arg5 == 0) {
                if (var14.field2908) {
                    class127.field3100[arg8][arg3][arg7] = 50;
                    class127.field3100[arg8][arg3][arg7 + 1] = 50;
                }
                if (var14.field2915) {
                    client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 585);
                }
            } else if (arg5 == 1) {
                if (var14.field2908) {
                    class127.field3100[arg8][arg3][arg7 + 1] = 50;
                    class127.field3100[arg8][arg3 + 1][arg7 + 1] = 50;
                }
                if (var14.field2915) {
                    client.field425[arg8][arg3][arg7 + 1] = class14.method156(client.field425[arg8][arg3][arg7 + 1], 1170);
                }
            } else if (arg5 == 2) {
                if (var14.field2908) {
                    class127.field3100[arg8][arg3 + 1][arg7] = 50;
                    class127.field3100[arg8][arg3 + 1][arg7 + 1] = 50;
                }
                if (var14.field2915) {
                    client.field425[arg8][arg3 + 1][arg7] = class14.method156(client.field425[arg8][arg3 + 1][arg7], 585);
                }
            } else if (arg5 == 3) {
                if (var14.field2908) {
                    class127.field3100[arg8][arg3][arg7] = 50;
                    class127.field3100[arg8][arg3 + 1][arg7] = 50;
                }
                if (var14.field2915) {
                    client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 1170);
                }
            }
            if (var14.field2931 && arg6 != null) {
                arg6.method903(var14.field2960, arg0, arg3, (byte) -106, arg5, arg7);
            }
            if (var14.field2922 != 16) {
                arg2.method502(arg8, arg3, arg7, var14.field2922);
            }
        } else if (arg0 == 1) {
            class60 var20;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var20 = var14.method983(var10, var13, var9, var11, arg5, (byte) 113, 1);
            } else {
                var20 = new class67(arg4, 1, arg5, var11, var9, var10, var13, var14.field2959, true, null);
            }
            arg2.method542(arg8, arg3, arg7, var15, var20, null, class100.field2289[arg5], 0, var12, var16);
            if (var14.field2908) {
                if (arg5 == 0) {
                    class127.field3100[arg8][arg3][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    class127.field3100[arg8][arg3 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    class127.field3100[arg8][arg3 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    class127.field3100[arg8][arg3][arg7] = 50;
                }
            }
            if (var14.field2931 && arg6 != null) {
                arg6.method903(var14.field2960, arg0, arg3, (byte) -80, arg5, arg7);
            }
        } else if (arg0 == 2) {
            int var21 = arg5 + 1 & 0x3;
            class60 var22;
            class60 var23;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var22 = var14.method983(var10, var13, var9, var11, arg5 + 4, (byte) 107, 2);
                var23 = var14.method983(var10, var13, var9, var11, var21, (byte) 70, 2);
            } else {
                var22 = new class67(arg4, 2, arg5 + 4, var11, var9, var10, var13, var14.field2959, true, null);
                var23 = new class67(arg4, 2, var21, var11, var9, var10, var13, var14.field2959, true, null);
            }
            arg2.method542(arg8, arg3, arg7, var15, var22, var23, class98.field2267[arg5], class98.field2267[var21], var12, var16);
            if (var14.field2915) {
                if (arg5 == 0) {
                    client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 585);
                    client.field425[arg8][arg3][arg7 + 1] = class14.method156(client.field425[arg8][arg3][arg7 + 1], 1170);
                } else if (arg5 == 1) {
                    client.field425[arg8][arg3][arg7 + 1] = class14.method156(client.field425[arg8][arg3][arg7 + 1], 1170);
                    client.field425[arg8][arg3 + 1][arg7] = class14.method156(client.field425[arg8][arg3 + 1][arg7], 585);
                } else if (arg5 == 2) {
                    client.field425[arg8][arg3 + 1][arg7] = class14.method156(client.field425[arg8][arg3 + 1][arg7], 585);
                    client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 1170);
                } else if (arg5 == 3) {
                    client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 1170);
                    client.field425[arg8][arg3][arg7] = class14.method156(client.field425[arg8][arg3][arg7], 585);
                }
            }
            if (var14.field2931 && arg6 != null) {
                arg6.method903(var14.field2960, arg0, arg3, (byte) -106, arg5, arg7);
            }
            if (var14.field2922 != 16) {
                arg2.method502(arg8, arg3, arg7, var14.field2922);
            }
        } else if (arg0 == 3) {
            class60 var24;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var24 = var14.method983(var10, var13, var9, var11, arg5, (byte) 17, 3);
            } else {
                var24 = new class67(arg4, 3, arg5, var11, var9, var10, var13, var14.field2959, true, null);
            }
            arg2.method542(arg8, arg3, arg7, var15, var24, null, class100.field2289[arg5], 0, var12, var16);
            if (var14.field2908) {
                if (arg5 == 0) {
                    class127.field3100[arg8][arg3][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    class127.field3100[arg8][arg3 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    class127.field3100[arg8][arg3 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    class127.field3100[arg8][arg3][arg7] = 50;
                }
            }
            if (var14.field2931 && arg6 != null) {
                arg6.method903(var14.field2960, arg0, arg3, (byte) -97, arg5, arg7);
            }
        } else if (arg0 == 9) {
            class60 var25;
            if (var14.field2959 == -1 && var14.field2909 == null) {
                var25 = var14.method983(var10, var13, var9, var11, arg5, (byte) 122, arg0);
            } else {
                var25 = new class67(arg4, arg0, arg5, var11, var9, var10, var13, var14.field2959, true, null);
            }
            arg2.method523(arg8, arg3, arg7, var15, 1, 1, var25, 0, var12, var16);
            if (var14.field2931 && arg6 != null) {
                arg6.method896(arg3, var14.field2912, var14.field2906, arg5, var14.field2960, true, arg7);
            }
        } else {
            if (var14.field2962) {
                if (arg5 == 1) {
                    int var26 = var13;
                    var13 = var10;
                    var10 = var9;
                    var9 = var11;
                    var11 = var26;
                } else if (arg5 == 2) {
                    int var27 = var13;
                    var13 = var9;
                    var9 = var27;
                    int var28 = var10;
                    var10 = var11;
                    var11 = var28;
                } else if (arg5 == 3) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var29;
                }
            }
            if (arg0 == 4) {
                class60 var30;
                if (var14.field2959 == -1 && var14.field2909 == null) {
                    var30 = var14.method983(var10, var13, var9, var11, 0, (byte) 89, 4);
                } else {
                    var30 = new class67(arg4, 4, 0, var11, var9, var10, var13, var14.field2959, true, null);
                }
                arg2.method504(arg8, arg3, arg7, var15, var30, class98.field2267[arg5], arg5 * 512, 0, 0, var12, var16);
            } else if (arg0 == 5) {
                int var31 = arg2.method499(arg8, arg3, arg7);
                int var32 = 16;
                if (var31 > 0) {
                    var32 = class12.method149(var31 >> 14 & 0x7FFF, (byte) 62).field2922;
                }
                class60 var33;
                if (var14.field2959 == -1 && var14.field2909 == null) {
                    var33 = var14.method983(var10, var13, var9, var11, 0, (byte) 122, 4);
                } else {
                    var33 = new class67(arg4, 4, 0, var11, var9, var10, var13, var14.field2959, true, null);
                }
                arg2.method504(arg8, arg3, arg7, var15, var33, class98.field2267[arg5], arg5 * 512, class122.field3000[arg5] * var32, class129.field3130[arg5] * var32, var12, var16);
            } else if (arg0 == 6) {
                class60 var34;
                if (var14.field2959 == -1 && var14.field2909 == null) {
                    var34 = var14.method983(var10, var13, var9, var11, 0, (byte) 37, 4);
                } else {
                    var34 = new class67(arg4, 4, 0, var11, var9, var10, var13, var14.field2959, true, null);
                }
                arg2.method504(arg8, arg3, arg7, var15, var34, 256, arg5, 0, 0, var12, var16);
            } else if (arg0 == 7) {
                class60 var35;
                if (var14.field2959 == -1 && var14.field2909 == null) {
                    var35 = var14.method983(var10, var13, var9, var11, 0, (byte) 122, 4);
                } else {
                    var35 = new class67(arg4, 4, 0, var11, var9, var10, var13, var14.field2959, true, null);
                }
                arg2.method504(arg8, arg3, arg7, var15, var35, 512, arg5, 0, 0, var12, var16);
            } else if (arg0 == 8) {
                class60 var36;
                if (var14.field2959 == -1 && var14.field2909 == null) {
                    var36 = var14.method983(var10, var13, var9, var11, 0, (byte) 14, 4);
                } else {
                    var36 = new class67(arg4, 4, 0, var11, var9, var10, var13, var14.field2959, true, null);
                }
                arg2.method504(arg8, arg3, arg7, var15, var36, 768, arg5, 0, 0, var12, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIJ)V")
    public abstract void method57(int arg0, int arg1, int arg2, long arg3);
}
