import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class43 extends class98 {

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
    public static int[] field741 = new int[50];

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "J")
    public static volatile long field742 = 0L;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Lmb;")
    private static class96 field737 = class243.method1708("Allocated memory", (byte) 107);

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lmb;")
    public static class96 field731 = field737;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lmb;")
    public class96 field745;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
    public final int method332(int arg0) {
        ++field743;
        if (arg0 != 1703976672) {
            method337(true, (byte) -7);
        }
        return (int) (super.field4304 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public final void method333(int arg0) {
        super.field1664 |= Long.MIN_VALUE;
        ++field739;
        int var2 = 41 % ((arg0 - -83) / 39);
        if (this.method334(126) == 0L) {
            class216.field3707.method1390(this, -70);
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)J")
    public final long method334(int arg0) {
        ++field744;
        int var2 = -74 / ((-49 - arg0) / 43);
        return super.field1664 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lhg;B)V")
    public static final void method335(class260 arg0, byte arg1) {
        arg0.field4573 = arg0.field4515;
        ++field738;
        if (~arg0.field4563 == -1) {
            arg0.field4549 = 0;
        } else {
            if (~arg0.field4526 != 0 && ~arg0.field4529 == -1) {
                class67 var2 = class189.method1332(arg0.field4526, 2);
                if (~arg0.field4558 < -1 && ~var2.field1156 == -1) {
                    ++arg0.field4549;
                    return;
                }
                if (arg0.field4558 <= 0 && ~var2.field1147 == -1) {
                    ++arg0.field4549;
                    return;
                }
            }
            int var3 = arg0.field4533;
            int var4 = arg0.field4511;
            int var5 = arg0.field4528[arg0.field4563 + -1] * 128 + arg0.method366((byte) 95) * 64;
            int var6 = arg0.field4566[arg0.field4563 + -1] * 128 + 64 * arg0.method366((byte) 95);
            if (~(-var4 + var5) >= -257 && ~(-var4 + var5) <= 255 && ~(-var3 + var6) >= -257 && ~(-var3 + var6) <= 255) {
                if (~var4 <= ~var5) {
                    if (~var4 >= ~var5) {
                        if (var3 >= var6) {
                            if (var3 > var6) {
                                arg0.field4531 = 0;
                            }
                        } else {
                            arg0.field4531 = 1024;
                        }
                    } else if (~var6 < ~var3) {
                        arg0.field4531 = 768;
                    } else if (var3 > var6) {
                        arg0.field4531 = 256;
                    } else {
                        arg0.field4531 = 512;
                    }
                } else if (~var6 < ~var3) {
                    arg0.field4531 = 1280;
                } else if (var6 < var3) {
                    arg0.field4531 = 1792;
                } else {
                    arg0.field4531 = 1536;
                }
                int var7 = arg0.field4508;
                boolean var8 = true;
                int var9 = -arg0.field4534 + arg0.field4531 & 2047;
                if (~var9 < -1025) {
                    var9 -= 2048;
                }
                int var10 = 4;
                if (~var9 <= 255 && var9 <= 256) {
                    var7 = arg0.field4540;
                } else if (~var9 <= -257 && var9 < 768) {
                    var7 = arg0.field4517;
                } else if (~var9 <= 767 && ~var9 >= 255) {
                    var7 = arg0.field4505;
                }
                if (~var7 == 0) {
                    var7 = arg0.field4540;
                }
                arg0.field4573 = var7;
                if (arg0 instanceof class197) {
                    var8 = ((class197) arg0).field3436.field3944;
                }
                if (var8) {
                    if (arg0.field4534 != arg0.field4531 && ~arg0.field4537 == 0 && arg0.field4539 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field4563 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field4563 > 3) {
                        var10 = 8;
                    }
                    if (~arg0.field4549 < -1 && arg0.field4563 > 1) {
                        --arg0.field4549;
                        var10 = 8;
                    }
                } else {
                    if (arg0.field4563 > 1) {
                        var10 = 6;
                    }
                    if (arg0.field4563 > 2) {
                        var10 = 8;
                    }
                    if (arg0.field4549 > 0 && ~arg0.field4563 < -2) {
                        --arg0.field4549;
                        var10 = 8;
                    }
                }
                if (arg0.field4552[arg0.field4563 - 1]) {
                    var10 <<= 1;
                }
                if (var6 > var3) {
                    arg0.field4533 += var10;
                    if (~arg0.field4533 < ~var6) {
                        arg0.field4533 = var6;
                    }
                } else if (var6 < var3) {
                    arg0.field4533 -= var10;
                    if (var6 > arg0.field4533) {
                        arg0.field4533 = var6;
                    }
                }
                if (~var10 <= -9 && ~arg0.field4573 == ~arg0.field4540 && arg0.field4555 != -1) {
                    arg0.field4573 = arg0.field4555;
                }
                if (~var5 >= ~var4) {
                    if (var5 < var4) {
                        arg0.field4511 -= var10;
                        if (~arg0.field4511 > ~var5) {
                            arg0.field4511 = var5;
                        }
                    }
                } else {
                    arg0.field4511 += var10;
                    if (~arg0.field4511 < ~var5) {
                        arg0.field4511 = var5;
                    }
                }
                if (arg0.field4511 == var5 && ~arg0.field4533 == ~var6) {
                    if (arg0.field4558 > 0) {
                        --arg0.field4558;
                    }
                    --arg0.field4563;
                }
                if (arg1 > -116) {
                    field737 = null;
                }
            } else {
                arg0.field4533 = var6;
                arg0.field4511 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static void method336(int arg0) {
        field731 = null;
        if (arg0 > 48) {
            field741 = null;
            field737 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)V")
    public static final void method337(boolean arg0, byte arg1) {
        ++field736;
        class135.field2430 = arg0;
        if (class135.field2430) {
            class1.field4.method1020(23608);
            for (int var2 = 0; ~var2 > -5; ++var2) {
                for (int var22 = 0; ~var22 > -14; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class1.field4.method1017((byte) 126, 1);
                        if (~var24 != -2) {
                            class246.field4273[var2][var22][var23] = -1;
                        } else {
                            class246.field4273[var2][var22][var23] = class1.field4.method1017((byte) 126, 26);
                        }
                    }
                }
            }
            class1.field4.method1018((byte) -99);
            int var3 = (-class1.field4.field4124 + class47.field820) / 16;
            class269.field4696 = new int[var3][4];
            for (int var4 = 0; ~var4 > ~var3; ++var4) {
                for (int var21 = 0; ~var21 > -5; ++var21) {
                    class269.field4696[var4][var21] = class1.field4.method1617((byte) -43);
                }
            }
            int var5 = class1.field4.method1669(255);
            int var6 = class1.field4.method1663((byte) -74);
            int var7 = class1.field4.method1672((byte) -103);
            int var8 = class1.field4.method1623(true);
            int var9 = class1.field4.method1623(true);
            class149.field2625 = new int[var3];
            class25.field433 = new int[var3];
            class157.field2741 = new int[var3];
            class241.field4182 = null;
            class167.field2951 = new byte[var3][];
            class86.field1452 = null;
            class241.field4191 = new byte[var3][];
            class136.field2436 = new int[var3];
            class154.field2705 = new int[var3];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; ++var11) {
                for (int var12 = 0; var12 < 13; ++var12) {
                    for (int var13 = 0; ~var13 > -14; ++var13) {
                        int var14 = class246.field4273[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 1023;
                            int var16 = (16376 & var14) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; ~var10 < ~var18; ++var18) {
                                if (class157.field2741[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (~var17 != 0) {
                                class157.field2741[var10] = var17;
                                int var19 = var17 & 255;
                                int var20 = (65446 & var17) >> 8;
                                class136.field2436[var10] = class92.field1523.method41(class36.method289(-5615, new class96[] { class270.field4702, class31.method205(var20, (byte) -78), class61.field1051, class31.method205(var19, (byte) -78) }), false);
                                class149.field2625[var10] = class92.field1523.method41(class36.method289(-5615, new class96[] { class100.field1686, class31.method205(var20, (byte) -78), class61.field1051, class31.method205(var19, (byte) -78) }), false);
                                class154.field2705[var10] = class92.field1523.method41(class36.method289(-5615, new class96[] { class48.field855, class31.method205(var20, (byte) -78), class61.field1051, class31.method205(var19, (byte) -78) }), false);
                                class25.field433[var10] = class92.field1523.method41(class36.method289(-5615, new class96[] { class37.field638, class31.method205(var20, (byte) -78), class61.field1051, class31.method205(var19, (byte) -78) }), false);
                                ++var10;
                            }
                        }
                    }
                }
            }
            class192.method1343(false, var7, var8, var9, 1, var6, var5);
        } else {
            int var25 = class1.field4.method1672((byte) -119);
            int var26 = class1.field4.method1618(-117);
            int var27 = class1.field4.method1618(-124);
            int var28 = (-class1.field4.field4124 + class47.field820) / 16;
            class269.field4696 = new int[var28][4];
            for (int var29 = 0; ~var29 > ~var28; ++var29) {
                for (int var37 = 0; var37 < 4; ++var37) {
                    class269.field4696[var29][var37] = class1.field4.method1624((byte) -28);
                }
            }
            boolean var30 = false;
            int var31 = class1.field4.method1672((byte) 58);
            int var32 = class1.field4.method1651(4139);
            class136.field2436 = new int[var28];
            class149.field2625 = new int[var28];
            class241.field4191 = new byte[var28][];
            if ((var31 / 8 == 48 || var31 / 8 == 49) && ~(var25 / 8) == -49) {
                var30 = true;
            }
            if (~(var31 / 8) == -49 && ~(var25 / 8) == -149) {
                var30 = true;
            }
            class25.field433 = new int[var28];
            class157.field2741 = new int[var28];
            class154.field2705 = new int[var28];
            class241.field4182 = null;
            class86.field1452 = null;
            class167.field2951 = new byte[var28][];
            int var33 = 0;
            for (int var34 = (var31 + -6) / 8; var34 <= (var31 + 6) / 8; ++var34) {
                for (int var35 = (var25 + -6) / 8; var35 <= (var25 + 6) / 8; ++var35) {
                    int var36 = (var34 << 8) - -var35;
                    if (!var30 || ~var35 != -50 && ~var35 != -150 && ~var35 != -148 && ~var34 != -51 && (~var34 != -50 || var35 != 47)) {
                        class157.field2741[var33] = var36;
                        class136.field2436[var33] = class92.field1523.method41(class36.method289(-5615, new class96[] { class270.field4702, class31.method205(var34, (byte) -78), class61.field1051, class31.method205(var35, (byte) -78) }), false);
                        class149.field2625[var33] = class92.field1523.method41(class36.method289(-5615, new class96[] { class100.field1686, class31.method205(var34, (byte) -78), class61.field1051, class31.method205(var35, (byte) -78) }), false);
                        class154.field2705[var33] = class92.field1523.method41(class36.method289(-5615, new class96[] { class48.field855, class31.method205(var34, (byte) -78), class61.field1051, class31.method205(var35, (byte) -78) }), false);
                        class25.field433[var33] = class92.field1523.method41(class36.method289(-5615, new class96[] { class37.field638, class31.method205(var34, (byte) -78), class61.field1051, class31.method205(var35, (byte) -78) }), false);
                    } else {
                        class157.field2741[var33] = var36;
                        class136.field2436[var33] = -1;
                        class149.field2625[var33] = -1;
                        class154.field2705[var33] = -1;
                        class25.field433[var33] = -1;
                    }
                    ++var33;
                }
            }
            class192.method1343(false, var31, var26, var27, 1, var25, var32);
        }
        if (arg1 <= 36) {
            field742 = 15L;
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)I")
    public final int method338(int arg0) {
        ++field735;
        int var2 = 80 / ((arg0 - 23) / 62);
        return (int) super.field4304;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
    public final void method339(boolean arg0) {
        super.field1664 = super.field1664 & Long.MIN_VALUE | class155.method1133(124) + 500L;
        class224.field3815.method1390(this, -121);
        if (!arg0) {
            field741 = null;
        }
        ++field733;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
    public class43(int arg0, int arg1) {
        super.field4304 = (long) arg0 << 32 | (long) arg1;
    }
}
