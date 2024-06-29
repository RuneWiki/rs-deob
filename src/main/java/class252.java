import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class252 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field3988 = -1;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field3995 = 0;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field3999 = -1;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field3992 = -1;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field3994 = 0;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field4000 = -1;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field3996 = -1;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public int field4017 = 0;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public int field4016 = -1;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public int field4007 = -1;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field4002 = 0;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public int field4013 = -1;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field4001 = -1;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field4010 = -1;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field3993 = -1;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public int field4012 = -1;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field4003 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public int field4006 = -1;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field3991 = 0;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field4011 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field3990 = 0;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public int field4020 = 0;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public int field4021 = -1;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public int field4023 = -1;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public int field4022 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field3998 = -1;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "B")
    public static byte field4004;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lqh;")
    public static class201 field4015;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[[I")
    public int[][] field4014;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILog;)V")
    private final void method1714(int arg0, int arg1, class221 arg2) {
        if (arg1 != -7) {
            return;
        }
        if (arg0 == 1) {
            this.field3988 = arg2.method1521((byte) 113);
            this.field4012 = arg2.method1521((byte) 113);
            if (this.field4012 == 65535) {
                this.field4012 = -1;
            }
            if (this.field3988 == 65535) {
                this.field3988 = -1;
            }
        } else if (arg0 == 2) {
            this.field4001 = arg2.method1521((byte) 113);
        } else if (arg0 == 3) {
            this.field4023 = arg2.method1521((byte) 113);
        } else if (arg0 == 4) {
            this.field3992 = arg2.method1521((byte) 113);
        } else if (arg0 == 5) {
            this.field4000 = arg2.method1521((byte) 113);
        } else if (arg0 == 6) {
            this.field4021 = arg2.method1521((byte) 113);
        } else if (arg0 == 7) {
            this.field4016 = arg2.method1521((byte) 113);
        } else if (arg0 == 8) {
            this.field3998 = arg2.method1521((byte) 113);
        } else if (arg0 == 9) {
            this.field3996 = arg2.method1521((byte) 113);
        } else if (arg0 == 26) {
            this.field3991 = (short) (arg2.method1517((byte) -96) * 4);
            this.field3995 = (short) (arg2.method1517((byte) -96) * 4);
        } else if (arg0 == 27) {
            if (this.field4014 == null) {
                this.field4014 = new int[12][];
            }
            int var4 = arg2.method1517((byte) -96);
            this.field4014[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field4014[var4][var5] = arg2.method1550(31);
            }
        } else if (arg0 == 29) {
            this.field4011 = arg2.method1517((byte) -96);
        } else if (arg0 == 30) {
            this.field4020 = arg2.method1521((byte) 113);
        } else if (arg0 == 31) {
            this.field4002 = arg2.method1517((byte) -96);
        } else if (arg0 == 32) {
            this.field3994 = arg2.method1521((byte) 113);
        } else if (arg0 == 33) {
            this.field4022 = arg2.method1550(-115);
        } else if (arg0 == 34) {
            this.field3990 = arg2.method1517((byte) -96);
        } else if (arg0 == 35) {
            this.field4003 = arg2.method1521((byte) 113);
        } else if (arg0 == 36) {
            this.field4017 = arg2.method1550(arg1 ^ 0xFFFFFFE2);
        } else if (arg0 == 37) {
            this.field4013 = arg2.method1517((byte) -96);
        } else if (arg0 == 38) {
            this.field4010 = arg2.method1521((byte) 113);
        } else if (arg0 == 39) {
            this.field3999 = arg2.method1521((byte) 113);
        } else if (arg0 == 40) {
            this.field4007 = arg2.method1521((byte) 113);
        } else if (arg0 == 41) {
            this.field4006 = arg2.method1521((byte) 113);
        } else if (arg0 == 42) {
            this.field3993 = arg2.method1521((byte) 113);
        } else if (arg0 == 43) {
            arg2.method1521((byte) 113);
        } else if (arg0 == 44) {
            arg2.method1521((byte) 113);
        } else if (arg0 == 45) {
            arg2.method1521((byte) 113);
        }
        field4005++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method1715(byte arg0) {
        int var2 = -50 / ((34 - arg0) / 63);
        field4009++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3989++;
        int var6 = 0;
        class56.method420(class29.field452[arg3], arg1, -7, arg2 - arg0, arg0 + arg2);
        int var7 = arg4;
        if (arg5 != -43) {
            method1716(-80, -121, 59, -33, -125, (byte) 96);
        }
        int var8 = arg0 * arg0;
        int var9 = arg4 * arg4;
        int var10 = var8 << 1;
        int var11 = arg4 << 1;
        int var12 = var9 << 1;
        int var13 = (1 - var11) * var8 + var12;
        int var14 = var8 << 2;
        int var15 = var9 - (var11 - 1) * var10;
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = var9 << 2;
        int var18 = ((arg4 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg4 - 1) * var14;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var16;
                    var15 += var19;
                    var16 += var17;
                    var19 += var17;
                }
            }
            var7--;
            int var21 = arg3 + var7;
            int var22 = arg3 - var7;
            if (var15 < 0) {
                var13 += var16;
                var15 += var19;
                var6++;
                var19 += var17;
                var16 += var17;
            }
            var15 += -var18;
            int var23 = arg2 - var6;
            var18 -= var14;
            int var24 = arg2 + var6;
            class56.method420(class29.field452[var22], arg1, -7, var23, var24);
            var13 += -var20;
            class56.method420(class29.field452[var21], arg1, arg5 + 36, var23, var24);
            var20 -= var14;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1717(int arg0) {
        if (arg0 != -9) {
            method1717(-48);
        }
        field4015 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3997++;
        int var11 = arg8 - arg2;
        int var12 = arg0 - arg4;
        int var13 = -1;
        if (arg6 < class280.field4433) {
            if (class190.field3077 > 10) {
                var13 = (10 + 10 - class190.field3077) * 5;
            } else {
                var13 = class190.field3077 * 5;
            }
        }
        int var14 = 983040 / arg9;
        int var15 = 983040 / arg5;
        for (int var16 = -var14; var16 < var11 + var14; var16++) {
            int var18 = arg9 * var16 + arg10 >> 16;
            int var19 = (var16 + 1) * arg9 + arg10 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg1 + var18;
                int var10000 = arg1 + var19;
                int var23 = arg2 + var16 >> 6;
                if (var23 >= 0 && var23 <= class183.field2878.length - 1) {
                    int[][] var24 = class183.field2878[var23];
                    for (int var25 = -var15; var25 < var12 + var15; var25++) {
                        int var26 = arg3 + ((var25 + 1) * arg5) >> 16;
                        int var27 = arg5 * var25 + arg3 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg7 + var27;
                            var10000 = arg7 + var26;
                            int var31 = var25 + arg4 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = ((arg4 + var25 & 0x3F) << 6) + (arg2 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class135 var34 = class209.method1447(var33 - 1, arg6 ^ 0xFFFFE603);
                                    if (!class132.field2102[var34.field2187]) {
                                        if (var13 != -1 && class63.field1030 == var34.field2187) {
                                            class195 var35 = new class195();
                                            var35.field3117 = var34.field2187;
                                            var35.field3124 = var21;
                                            var35.field3114 = var29;
                                            class11.field153.method855(false, var35);
                                        } else {
                                            class282.field4461[var34.field2187].method332(var21 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class195 var17 = (class195) class11.field153.method843(-56); var17 != null; var17 = (class195) class11.field153.method852((byte) 123)) {
            class2.method22(var17.field3124, var17.field3114, 15, 16776960, var13);
            class2.method22(var17.field3124, var17.field3114, 13, 16776960, var13);
            class2.method22(var17.field3124, var17.field3114, 11, 16776960, var13);
            class2.method22(var17.field3124, var17.field3114, 9, 16776960, var13);
            class282.field4461[var17.field3117].method332(var17.field3124 - 7, var17.field3114 - 7);
        }
        class11.field153.method854(true);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Log;B)V")
    public final void method1719(class221 arg0, byte arg1) {
        field4008++;
        if (arg1 > -78) {
            return;
        }
        while (true) {
            int var3 = arg0.method1517((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method1714(var3, -7, arg0);
        }
    }
}
