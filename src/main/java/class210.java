import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class210 extends class7 {

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "Z")
    public static boolean field3261 = true;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "Lee;")
    public static class288 field3256;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static void method1405(byte arg0) {
        field3256 = null;
        if (arg0 <= 116) {
            field3259 = 125;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZI)V")
    public static final void method1406(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field3263;
        int var4 = 0;
        if (arg3 != 1) {
            method1405((byte) 81);
        }
        int var10002;
        while (var4 < class62.field1006) {
            class32 var21 = class72.field1144[class198.field3113[var4]];
            if (var21 != null && var21.method229(-18109) && var21.field518.method1442(arg3 + -1)) {
                label270: {
                    int var22 = var21.method226((byte) -97);
                    if (arg2) {
                        if (!var21.field518.field3377) {
                            break label270;
                        }
                    } else if (!arg1 == var21.field518.field3392 || ~arg0 != -1 && arg0 != var22) {
                        break label270;
                    }
                    if (~var22 == -2) {
                        if (~(var21.field4176 & 127) == -65 && (127 & var21.field4123) == 64) {
                            int var29 = var21.field4176 >> 7;
                            int var30 = var21.field4123 >> 7;
                            if (~var29 <= -1 && ~var29 > -105 && ~var30 <= -1 && ~var30 > -105) {
                                var10002 = class295.field4643[var29][var30]++;
                            }
                        }
                    } else if ((~(1 & var22) != -1 || (var21.field4176 & 127) == 0 && (127 & var21.field4123) == 0) && (~(var22 & 1) != -2 || ~(127 & var21.field4176) == -65 && ~(var21.field4123 & 127) == -65)) {
                        int var23 = -(var22 * 64) + var21.field4176 >> 7;
                        int var24 = var21.field4123 - var22 * 64 >> 7;
                        int var25 = var21.method226((byte) -97) + var23;
                        if (~var23 > -1) {
                            var23 = 0;
                        }
                        int var26 = var21.method226((byte) -97) + var24;
                        if (~var25 < -105) {
                            var25 = 104;
                        }
                        if (~var26 < -105) {
                            var26 = 104;
                        }
                        if (~var24 > -1) {
                            var24 = 0;
                        }
                        for (int var27 = var23; var27 < var25; ++var27) {
                            for (int var28 = var24; var28 < var26; ++var28) {
                                var10002 = class295.field4643[var27][var28]++;
                            }
                        }
                    }
                }
            }
            ++var4;
        }
        label208: for (int var5 = 0; ~class62.field1006 < ~var5; ++var5) {
            class32 var6 = class72.field1144[class198.field3113[var5]];
            long var7 = (long) class198.field3113[var5] << 32 | 536870912L;
            if (var6 != null && var6.method229(arg3 + -18110) && var6.field518.method1442(arg3 + -1)) {
                int var9 = var6.method226((byte) -97);
                if (!arg2) {
                    if (var6.field518.field3392 == !arg1 || ~arg0 != -1 && arg0 != var9) {
                        continue;
                    }
                } else if (!var6.field518.field3377) {
                    continue;
                }
                var6.field4124 = true;
                if (var9 != 1) {
                    if (~(1 & var9) == -1 && (127 & var6.field4176) == 0 && (var6.field4123 & 127) == 0 || (1 & var9) == 1 && (var6.field4176 & 127) == 64 && (127 & var6.field4123) == 64) {
                        int var10 = -(var9 * 64) + var6.field4123 >> 7;
                        int var11 = -(var9 * 64) + var6.field4176 >> 7;
                        int var12 = var10 - -var9;
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        boolean var13 = true;
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        int var14 = var11 - -var9;
                        if (~var14 < -105) {
                            var14 = 104;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        for (int var15 = var11; var14 > var15; ++var15) {
                            for (int var18 = var10; ~var18 > ~var12; ++var18) {
                                if (class295.field4643[var15][var18] <= 1) {
                                    var13 = false;
                                    break;
                                }
                            }
                        }
                        if (var13) {
                            int var16 = var11;
                            while (true) {
                                if (var14 <= var16) {
                                    continue label208;
                                }
                                for (int var17 = var10; var17 < var12; ++var17) {
                                    var10002 = class295.field4643[var16][var17]--;
                                }
                                ++var16;
                            }
                        }
                    }
                } else if (~(var6.field4176 & 127) == -65 && ~(127 & var6.field4123) == -65) {
                    int var19 = var6.field4176 >> 7;
                    int var20 = var6.field4123 >> 7;
                    if (var19 < 0 || var19 >= 104 || var20 < 0 || ~var20 <= -105) {
                        continue;
                    }
                    if (~class295.field4643[var19][var20] < -2) {
                        var10002 = class295.field4643[var19][var20]--;
                        continue;
                    }
                }
                if (!var6.field518.field3359) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field4124 = false;
                var6.field4187 = class224.method1502((byte) -128, class274.field4318, var6.field4123, var6.field4176);
                class111.method821(class274.field4318, var6.field4176, var6.field4123, var6.field4187, (var9 + -1) * 64 + 60, var6, var6.field4159, var7, var6.field4157);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field3257;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (arg1 > -112) {
            field3255 = 96;
        }
        if (super.field1248.field550 && this.method90(32)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field121 * super.field121;
            for (int var8 = 0; ~class178.field2662 < ~var8; ++var8) {
                int var9 = super.field128[var8 % super.field123 + var7];
                var6[var8] = class3.method48(var9 << 4, 4080);
                var5[var8] = class3.method48(var9, 65280) >> 4;
                var4[var8] = class3.method48(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == arg3) {
            ++class161.field2464;
            class292.field4607.method1251(157, (byte) -70);
            class292.field4607.method287(arg2 ^ 440742616, 5);
        }
        ++field3262;
        if (~arg3 == -2) {
            ++class127.field1995;
            class292.field4607.method1251(202, (byte) -107);
            class292.field4607.method287(440742616, 19);
        }
        class292.field4607.method286(class129.field2008 + arg0, true);
        class292.field4607.method281(arg2 ^ -14821, class118.field1828 + arg1);
        class292.field4607.method287(arg2 + 440742616, !class145.field2256[82] ? 0 : 1);
        class177.field2656 = arg1;
        class8.field162 = arg0;
    }
}
