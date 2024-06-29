import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class133 extends class1 {

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    private int field2428 = 0;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    private int field2423 = 1;

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "I")
    private int field2434 = 0;

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
    public static int field2430 = 7759444;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field2431;
        class182.method1146(false);
        if (arg0 != 3) {
            this.method13(44, -44, (class229) null);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (arg0 != 107) {
            method818((byte[]) null, (byte) 52);
        }
        ++field2435;
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class202.field3603; ++var6) {
                int var7 = class195.field3477[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field2428 == -1) {
                    var9 = (-var4 + var7) * this.field2423;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field2423 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field2434 == -1) {
                    var12 = class22.field476[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field2434 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class133() {
        super(0, true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BB)V")
    public static final void method818(byte[] arg0, byte arg1) {
        ++field2427;
        class229 var2 = new class229(arg0);
        var2.field4101 = arg0.length + -2;
        class196.field3493 = var2.method1490((byte) 73);
        class174.field3147 = new byte[class196.field3493][];
        class159.field2862 = new int[class196.field3493];
        class148.field2650 = new int[class196.field3493];
        if (arg1 == 56) {
            class181.field3271 = new int[class196.field3493];
            class128.field2302 = new int[class196.field3493];
            var2.field4101 = -7 - class196.field3493 * 8 + arg0.length;
            class169.field3079 = var2.method1490((byte) 73);
            class124.field2236 = var2.method1490((byte) 73);
            int var3 = (var2.method1475(arg1 + 199) & 255) - -1;
            for (int var4 = 0; ~var4 > ~class196.field3493; ++var4) {
                class128.field2302[var4] = var2.method1490((byte) 73);
            }
            for (int var5 = 0; ~var5 > ~class196.field3493; ++var5) {
                class148.field2650[var5] = var2.method1490((byte) 73);
            }
            for (int var6 = 0; class196.field3493 > var6; ++var6) {
                class159.field2862[var6] = var2.method1490((byte) 73);
            }
            for (int var7 = 0; class196.field3493 > var7; ++var7) {
                class181.field3271[var7] = var2.method1490((byte) 73);
            }
            var2.field4101 = arg0.length + -7 - class196.field3493 * 8 + -((var3 + -1) * 3);
            class67.field1312 = new int[var3];
            for (int var8 = 1; var8 < var3; ++var8) {
                class67.field1312[var8] = var2.method1450(-23209);
                if (~class67.field1312[var8] == -1) {
                    class67.field1312[var8] = 1;
                }
            }
            var2.field4101 = 0;
            for (int var9 = 0; ~var9 > ~class196.field3493; ++var9) {
                int var10 = class159.field2862[var9];
                int var11 = class181.field3271[var9];
                int var12 = var10 * var11;
                byte[] var13 = new byte[var12];
                class174.field3147[var9] = var13;
                int var14 = var2.method1475(255);
                if (var14 == 0) {
                    for (int var15 = 0; ~var15 > ~var12; ++var15) {
                        var13[var15] = var2.method1457(-2);
                    }
                } else if (var14 == 1) {
                    for (int var16 = 0; var10 > var16; ++var16) {
                        for (int var17 = 0; ~var11 < ~var17; ++var17) {
                            var13[var10 * var17 + var16] = var2.method1457(-2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field2423 = arg2.method1475(255);
                }
            } else {
                this.field2434 = arg2.method1475(255);
            }
        } else {
            this.field2428 = arg2.method1475(255);
        }
        if (arg0 != 0) {
            field2426 = -115;
        }
        ++field2425;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JIZI)Loc;")
    public static final class151 method819(long arg0, int arg1, boolean arg2, int arg3) {
        ++field2429;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            int var5 = 1;
            for (long var6 = arg0 / (long) arg3; ~var6 != -1L; var6 /= (long) arg3) {
                ++var5;
            }
            int var8 = var5;
            if (~arg0 > -1L || arg2) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (~arg0 > -1L) {
                var9[0] = 45;
            } else if (arg2) {
                var9[0] = 43;
            }
            for (int var10 = 0; var5 > var10; ++var10) {
                int var12 = (int) (arg0 % (long) arg3);
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 9) {
                    var12 += 39;
                }
                arg0 /= (long) arg3;
                var9[var8 - var10 - 1] = (byte) (var12 + 48);
            }
            class151 var11 = new class151();
            var11.field2736 = var9;
            if (arg1 != -37) {
                method818((byte[]) null, (byte) -49);
            }
            var11.field2690 = var8;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
    public static final void method820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class166.field3017 == -1 && !class159.field2859) {
            class142.method908(-arg3 + arg1, class134.field2441, (short) 42, 0L, class161.field2905, -59, -arg0 + arg2);
            ++class159.field2857;
        }
        ++field2424;
        long var5 = -1L;
        for (int var7 = 0; class71.field1386 > var7; ++var7) {
            long var8 = class139.field2536[var7];
            int var10 = 127 & (int) var8;
            int var11 = (int) var8 >> 7 & 127;
            int var12 = ((int) var8 & 2066424918) >> 29;
            int var13 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            if (~var5 != ~var8) {
                var5 = var8;
                if (var12 == 2 && class123.method745(class234.field4325, var10, var11, var8)) {
                    class93 var14 = class5.method32((byte) 90, var13);
                    if (var14.field1746 != null) {
                        var14 = var14.method591((byte) -127);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (~class166.field3017 != -2) {
                        if (!class159.field2859) {
                            ++class79.field1523;
                            class151[] var15 = var14.field1728;
                            if (class52.field1046) {
                                var15 = class38.method282(var15, (byte) 34);
                            }
                            if (var15 != null) {
                                for (int var16 = 4; ~var16 <= -1; --var16) {
                                    if (var15[var16] != null) {
                                        short var17 = 0;
                                        if (var16 == 0) {
                                            var17 = 16;
                                        }
                                        ++class72.field1389;
                                        if (~var16 == -2) {
                                            var17 = 29;
                                        }
                                        if (~var16 == -3) {
                                            var17 = 28;
                                        }
                                        if (~var16 == -4) {
                                            var17 = 11;
                                        }
                                        if (~var16 == -5) {
                                            var17 = 1006;
                                        }
                                        class142.method908(var10, class126.method761(new class151[] { class157.field2842, var14.field1686 }, 10260), var17, var8, var15[var16], arg4 + -17238, var11);
                                    }
                                }
                            }
                            class142.method908(var10, class126.method761(new class151[] { class157.field2842, var14.field1686 }, 10260), (short) 1001, (long) var14.field1709, class232.field4262, -26, var11);
                        } else if ((class54.field1103 & 4) == 4) {
                            class142.method908(var10, class126.method761(new class151[] { class20.field447, class46.field945, var14.field1686 }, arg4 ^ 27436), (short) 3, var8, class95.field1770, -124, var11);
                            ++class12.field227;
                        }
                    } else {
                        ++class44.field906;
                        class142.method908(var10, class126.method761(new class151[] { class29.field613, class46.field945, var14.field1686 }, 10260), (short) 58, var8, class14.field318, -128, var11);
                    }
                }
                if (~var12 == -2) {
                    class203 var18 = class122.field2190[var13];
                    if (var18.field3608.field1317 == 1 && (var18.field3976 & 127) == 64 && ~(var18.field4029 & 127) == -65) {
                        for (int var19 = 0; ~var19 > ~class23.field505; ++var19) {
                            class203 var22 = class122.field2190[class81.field1553[var19]];
                            if (var22 != null && var18 != var22 && var22.field3608.field1317 == 1 && var18.field3976 == var22.field3976 && ~var18.field4029 == ~var22.field4029) {
                                class219.method1367(class81.field1553[var19], var10, var11, (byte) -4, var22.field3608);
                            }
                        }
                        for (int var20 = 0; ~var20 > ~class47.field961; ++var20) {
                            class20 var21 = class179.field3229[class159.field2866[var20]];
                            if (var21 != null && ~var18.field3976 == ~var21.field3976 && var18.field4029 == var21.field4029) {
                                class63.method424(class159.field2866[var20], var11, var21, true, var10);
                            }
                        }
                    }
                    class219.method1367(var13, var10, var11, (byte) -4, var18.field3608);
                }
                if (~var12 == -1) {
                    class20 var23 = class179.field3229[var13];
                    if (~(var23.field3976 & 127) == -65 && ~(var23.field4029 & 127) == -65) {
                        for (int var24 = 0; class23.field505 > var24; ++var24) {
                            class203 var27 = class122.field2190[class81.field1553[var24]];
                            if (var27 != null && var27.field3608.field1317 == 1 && var23.field3976 == var27.field3976 && ~var23.field4029 == ~var27.field4029) {
                                class219.method1367(class81.field1553[var24], var10, var11, (byte) -4, var27.field3608);
                            }
                        }
                        for (int var25 = 0; var25 < class47.field961; ++var25) {
                            class20 var26 = class179.field3229[class159.field2866[var25]];
                            if (var26 != null && var23 != var26 && var23.field3976 == var26.field3976 && var23.field4029 == var26.field4029) {
                                class63.method424(class159.field2866[var25], var11, var26, true, var10);
                            }
                        }
                    }
                    class63.method424(var13, var11, var23, true, var10);
                }
                if (var12 == 3) {
                    class218 var28 = class29.field615[class234.field4325][var10][var11];
                    if (var28 != null) {
                        for (class158 var29 = (class158) var28.method1359(-69); var29 != null; var29 = (class158) var28.method1352(46)) {
                            int var30 = var29.field2847.field3256;
                            class12 var31 = class43.method311(var30, arg4 + -17208);
                            if (~class166.field3017 == -2) {
                                class142.method908(var10, class126.method761(new class151[] { class29.field613, class168.field3074, var31.field241 }, 10260), (short) 37, (long) var30, class14.field318, -63, var11);
                                ++class120.field2161;
                            } else if (class159.field2859) {
                                if (~(1 & class54.field1103) == -2) {
                                    class142.method908(var10, class126.method761(new class151[] { class20.field447, class168.field3074, var31.field241 }, arg4 ^ 27436), (short) 35, (long) var30, class95.field1770, -92, var11);
                                    ++class120.field2164;
                                }
                            } else {
                                ++class237.field4419;
                                class151[] var32 = var31.field269;
                                if (class52.field1046) {
                                    var32 = class38.method282(var32, (byte) 34);
                                }
                                for (int var33 = 4; ~var33 <= -1; --var33) {
                                    if (var32 != null && var32[var33] != null) {
                                        ++class92.field1679;
                                        byte var34 = 0;
                                        if (~var33 == -1) {
                                            var34 = 6;
                                        }
                                        if (~var33 == -2) {
                                            var34 = 51;
                                        }
                                        if (var33 == 2) {
                                            var34 = 34;
                                        }
                                        if (var33 == 3) {
                                            var34 = 43;
                                        }
                                        if (var33 == 4) {
                                            var34 = 39;
                                        }
                                        class142.method908(var10, class126.method761(new class151[] { class52.field1053, var31.field241 }, 10260), var34, (long) var30, var32[var33], -55, var11);
                                    } else if (~var33 == -3) {
                                        ++class65.field1262;
                                        class142.method908(var10, class126.method761(new class151[] { class52.field1053, var31.field241 }, 10260), (short) 34, (long) var30, class124.field2231, -56, var11);
                                    }
                                }
                                class142.method908(var10, class126.method761(new class151[] { class52.field1053, var31.field241 }, 10260), (short) 1007, (long) var30, class232.field4262, arg4 ^ -17155, var11);
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != 17208) {
            field2430 = 93;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLwa;)Ldd;")
    public static final class38 method821(boolean arg0, class229 arg1) {
        if (!arg0) {
            field2430 = -74;
        }
        ++field2433;
        return new class38(arg1.method1466(12435), arg1.method1466(12435), arg1.method1466(12435), arg1.method1466(12435), arg1.method1450(-23209), arg1.method1475(255));
    }
}
