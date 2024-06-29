import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class188 extends class264 {

    @OriginalMember(owner = "client!gk", name = "ib", descriptor = "I")
    private int field2939 = 0;

    @OriginalMember(owner = "client!gk", name = "rb", descriptor = "I")
    private int field2948 = 0;

    @OriginalMember(owner = "client!gk", name = "tb", descriptor = "I")
    private int field2950 = 1;

    @OriginalMember(owner = "client!gk", name = "ob", descriptor = "[J")
    public static long[] field2945 = new long[100];

    @OriginalMember(owner = "client!gk", name = "qb", descriptor = "I")
    public static int field2947 = 0;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!gk", name = "jb", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!gk", name = "kb", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!gk", name = "lb", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!gk", name = "mb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!gk", name = "pb", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!gk", name = "sb", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!gk", name = "nb", descriptor = "Lje;")
    public static class158 field2944;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)Ljf;", line = 5)
    public static final class82 method1233(byte[] arg0, byte arg1) {
        field2938++;
        if (arg0 == null) {
            return null;
        } else if (arg1 < 97) {
            return (class82) null;
        } else {
            class82 var2 = new class82(arg0, class88.field1315, class287.field4836, class112.field1665, class179.field2718, class37.field590);
            class207.method1365(9);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[[[Lek;IZZI)Z", line = 26)
    public static final boolean method1234(int arg0, class198[][][] arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        byte var6 = arg3 ? 1 : (byte) (class60.field938 & 0xFF);
        field2941++;
        if (class141.field2081[class276.field4701][arg2][arg0] == var6) {
            return false;
        } else if ((class18.field321[class276.field4701][arg2][arg0] & 0x4) == 0) {
            return false;
        } else {
            if (arg4) {
                field2944 = (class158) null;
            }
            byte var7 = 0;
            class111.field1649[var7] = arg2;
            int var31 = var7 + 1;
            class65.field1021[var7] = arg0;
            class141.field2081[class276.field4701][arg2][arg0] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class111.field1649[var8] >> 24 & 0xFF;
                int var10 = (class111.field1649[var8] & 0xFF0845) >> 16;
                int var11 = class65.field1021[var8] & 0xFFFF;
                int var12 = class111.field1649[var8] & 0xFFFF;
                boolean var13 = false;
                boolean var14 = false;
                if ((class18.field321[class276.field4701][var12][var11] & 0x4) == 0) {
                    var13 = true;
                }
                int var15 = (class65.field1021[var8] & 0xFFE256) >> 16;
                label239: for (int var16 = class276.field4701 + 1; var16 <= 3; var16++) {
                    if ((class18.field321[var16][var12][var11] & 0x8) == 0) {
                        if (var13 && arg1[var16][var12][var11] != null) {
                            if (arg1[var16][var12][var11].field3149 != null) {
                                int var17 = class89.method585(26918, var10);
                                if (arg1[var16][var12][var11].field3149.field1339 == var17 || arg1[var16][var12][var11].field3149.field1325 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class89.method585(26918, var9);
                                    if (arg1[var16][var12][var11].field3149.field1339 == var18 || arg1[var16][var12][var11].field3149.field1325 == var18) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var19 = class89.method585(26918, var15);
                                    if (arg1[var16][var12][var11].field3149.field1339 == var19 || arg1[var16][var12][var11].field3149.field1325 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var12][var11].field3166 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var12][var11].field3162; var20++) {
                                    int var21 = (int) (arg1[var16][var12][var11].field3166[var20].field1590 >> 20 & 0x3L);
                                    int var22 = (int) (arg1[var16][var12][var11].field3166[var20].field1590 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = var21 << 6 | var22;
                                    if (var10 == var23 || var9 != 0 && var9 == var23 || var15 != 0 && var15 == var23) {
                                        continue label239;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class198 var24 = arg1[var16][var12][var11];
                        if (var24 != null && var24.field3162 > 0) {
                            for (int var25 = 0; var25 < var24.field3162; var25++) {
                                class107 var26 = var24.field3166[var25];
                                if (var26.field1597 != var26.field1587 || var26.field1598 != var26.field1595) {
                                    for (int var27 = var26.field1597; var27 <= var26.field1587; var27++) {
                                        for (int var28 = var26.field1595; var28 <= var26.field1598; var28++) {
                                            class141.field2081[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class141.field2081[var16][var12][var11] = var6;
                    }
                }
                if (var14) {
                    if (class209.field3313[arg5] < class208.field3304[class276.field4701 + 1][var12][var11]) {
                        class209.field3313[arg5] = class208.field3304[class276.field4701 + 1][var12][var11];
                    }
                    int var29 = var12 << 7;
                    int var30 = var11 << 7;
                    if (var29 < class281.field4761[arg5]) {
                        class281.field4761[arg5] = var29;
                    } else if (class29.field478[arg5] < var29) {
                        class29.field478[arg5] = var29;
                    }
                    if (class275.field4687[arg5] > var30) {
                        class275.field4687[arg5] = var30;
                    } else if (class257.field4395[arg5] < var30) {
                        class257.field4395[arg5] = var30;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (!var13) {
                    if (var12 >= 1 && class141.field2081[class276.field4701][var12 - 1][var11] != var6) {
                        class111.field1649[var31] = class264.method1820(-754974720, class264.method1820(1179648, var12 - 1));
                        class65.field1021[var31] = class264.method1820(1245184, var11);
                        class141.field2081[class276.field4701][var12 - 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var12 - 1 >= 0 && class141.field2081[class276.field4701][var12 - 1][var11] != var6 && (class18.field321[class276.field4701][var12][var11] & 0x4) == 0 && (class18.field321[class276.field4701][var12 - 1][var11 - 1] & 0x4) == 0) {
                            class111.field1649[var31] = class264.method1820(class264.method1820(1179648, var12 - 1), 1375731712);
                            class65.field1021[var31] = class264.method1820(var11, 1245184);
                            class141.field2081[class276.field4701][var12 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class141.field2081[class276.field4701][var12][var11] != var6) {
                            class111.field1649[var31] = class264.method1820(class264.method1820(var12, 5373952), 318767104);
                            class65.field1021[var31] = class264.method1820(5439488, var11);
                            class141.field2081[class276.field4701][var12][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var12 + 1 < 104 && class141.field2081[class276.field4701][var12 + 1][var11] != var6 && (class18.field321[class276.field4701][var12][var11] & 0x4) == 0 && (class18.field321[class276.field4701][var12 + 1][var11 - 1] & 0x4) == 0) {
                            class111.field1649[var31] = class264.method1820(class264.method1820(5373952, var12 + 1), -1845493760);
                            class65.field1021[var31] = class264.method1820(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class141.field2081[class276.field4701][var12 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if ((var12 + 1) < 104 && class141.field2081[class276.field4701][var12 + 1][var11] != var6) {
                        class111.field1649[var31] = class264.method1820(class264.method1820(9568256, var12 + 1), 1392508928);
                        class65.field1021[var31] = class264.method1820(9633792, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class141.field2081[class276.field4701][var12 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var12 - 1) >= 0 && class141.field2081[class276.field4701][var12 - 1][var11] != var6 && (class18.field321[class276.field4701][var12][var11] & 0x4) == 0 && (class18.field321[class276.field4701][var12 - 1][var11 + 1] & 0x4) == 0) {
                            class111.field1649[var31] = class264.method1820(class264.method1820(13762560, var12 - 1), 301989888);
                            class65.field1021[var31] = class264.method1820(var11, 13828096);
                            class141.field2081[class276.field4701][var12 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class141.field2081[class276.field4701][var12][var11] != var6) {
                            class111.field1649[var31] = class264.method1820(-1828716544, class264.method1820(13762560, var12));
                            class65.field1021[var31] = class264.method1820(13828096, var11);
                            class141.field2081[class276.field4701][var12][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var12 + 1 < 104 && class141.field2081[class276.field4701][var12 + 1][var11] != var6 && (class18.field321[class276.field4701][var12][var11] & 0x4) == 0 && (class18.field321[class276.field4701][var12 + 1][var11 + 1] & 0x4) == 0) {
                            class111.field1649[var31] = class264.method1820(class264.method1820(var12 + 1, 9568256), -771751936);
                            class65.field1021[var31] = class264.method1820(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class141.field2081[class276.field4701][var12 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class209.field3313[arg5] != -1000000) {
                class209.field3313[arg5] += 10;
                class281.field4761[arg5] -= 50;
                class29.field478[arg5] += 50;
                class257.field4395[arg5] += 50;
                class275.field4687[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 335)
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)[F", line = 344)
    public static final float[] method1235(int arg0, boolean arg1) {
        if (!arg1) {
            method1235(0, false);
        }
        field2936++;
        float var2 = class293.method1969() + class293.method1973();
        int var3 = class293.method1976();
        float var4 = (float) ((var3 & 0xFF20FA) >> 16) / 255.0F;
        class237.field3920[3] = 1.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class237.field3920[1] = (float) class204.method1354(255, arg0 >> 8) / 255.0F * var6 * var7 * var2;
        class237.field3920[2] = var2 * var7 * (float) class204.method1354(255, arg0) / 255.0F * var5;
        class237.field3920[0] = var2 * var7 * (float) (class204.method1354(16747104, arg0) >> 16) / 255.0F * var4;
        return class237.field3920;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V", line = 370)
    public static final void method1236(int arg0, int arg1, int arg2, int arg3) {
        if (class264.field4492 != arg2 && arg1 != 0 && class186.field2934 < 50 && arg0 != -1) {
            class152.field2222[class186.field2934] = arg0;
            class24.field411[class186.field2934] = arg1;
            class29.field470[class186.field2934] = arg3;
            class142.field2085[class186.field2934] = null;
            class185.field2894[class186.field2934] = 0;
            class186.field2934++;
        }
        field2949++;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)Lrd;", line = 389)
    public static final class130 method1237(int arg0, int arg1) {
        field2946++;
        class130 var2 = (class130) class249.field4123.method521((long) arg1, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field703.method1342(-124, class280.method1899(-10995, arg1), class11.method112(arg1, -95));
        if (arg0 < 109) {
            field2947 = 79;
        }
        class130 var4 = new class130();
        if (var3 != null) {
            var4.method859((byte) 11, new class221(var3));
        }
        class249.field4123.method519((byte) -95, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILii;)V", line = 423)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field2939 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field2948 = arg2.method1509(true);
        } else if (arg0 == 3) {
            this.field2950 = arg2.method1509(true);
        }
        if (arg1 >= -27) {
            field2945 = (long[]) null;
        }
        field2943++;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)V", line = 458)
    public static void method1238(byte arg0) {
        field2944 = null;
        if (arg0 < 7) {
            field2945 = (long[]) null;
        }
        field2945 = null;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 469)
    public final void method111(int arg0) {
        field2942++;
        int var2 = 106 % ((arg0 - 66) / 44);
        class90.method592(0);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 489)
    public static final void method1239(boolean arg0) {
        class249.field4123.method522(49);
        if (!arg0) {
            method1237(-8, -39);
        }
        field2940++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[I", line = 504)
    public final int[] method5(int arg0, int arg1) {
        field2937++;
        int[] var3 = this.field4501.method1176(arg1, 123);
        if (this.field4501.field2741) {
            int var4 = class116.field1726[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class226.field3716; var6++) {
                int var7 = class251.field4159[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field2939 == 0) {
                    var9 = (var7 - var4) * this.field2950;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2950 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field2948 == 0) {
                    var12 = class257.field4404[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2948 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 >= -58) {
            method1239(false);
        }
        return var3;
    }
}
