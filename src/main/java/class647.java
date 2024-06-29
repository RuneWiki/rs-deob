import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class647 {

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public int field8938;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public int field8940;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "I")
    public int field8943;

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "I")
    public int field8945;

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "I")
    public int field8946;

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "I")
    public int field8947;

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "I")
    public int field8949;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient;")
    public static client field8937;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "[B")
    public byte[] field8939;

    @OriginalMember(owner = "client!sfa", name = "i", descriptor = "[B")
    public byte[] field8944;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIIIIB)V", line = 5)
    public static final void method3614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (class128.field1831 <= arg4 && arg1 <= class529.field7169 && arg5 >= class469.field6466 && class533.field7200 >= arg3) {
            if (arg0 == 1) {
                class596.method3366(arg5, arg2, 0, arg4, arg3, arg1);
            } else {
                class286.method1763(arg1, (byte) -91, arg0, arg4, arg3, arg5, arg2);
            }
        } else if (arg0 == 1) {
            class58.method485(arg4, arg3, arg1, true, arg2, arg5);
        } else {
            class295.method1803(arg5, arg4, arg3, arg2, arg1, arg0, (byte) -59);
        }
        field8948++;
        int var7 = 117 % ((arg6 + 51) / 54);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIB[Ljava/lang/Object;[J)V", line = 39)
    public static final void method3615(int arg0, int arg1, byte arg2, Object[] arg3, long[] arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg1; var11++) {
                if (arg4[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method3615(arg0, var6 - 1, (byte) -38, arg3, arg4);
            method3615(var6 + 1, arg1, (byte) 42, arg3, arg4);
        }
        field8941++;
        int var15 = -49 % ((arg2 + 82) / 39);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 100)
    public static void method3616(int arg0) {
        field8937 = null;
        if (arg0 != 0) {
            field8937 = null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)I", line = 111)
    public static int method3617(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILr;)V", line = 123)
    public static final void method3618(int arg0, class166 arg1) {
        field8942++;
        int var2 = class603.field8403;
        int var3 = class627.field8692;
        int var4 = class568.field8040;
        int var5 = class426.field5970 - 3;
        byte var6 = 20;
        if (class308.field4265 == null || class564.field7623 == null) {
            if (class508.field6961.method3623(-67, class266.field3607) && class508.field6961.method3623(-92, class651.field9034)) {
                class308.field4265 = arg1.method146(class168.method1193(class508.field6961, class266.field3607, 0), true);
                class168 var7 = class168.method1193(class508.field6961, class651.field9034, 0);
                class564.field7623 = arg1.method146(var7, true);
                var7.method1192();
                class584.field8234 = arg1.method146(var7, true);
            } else {
                arg1.method110(var2, var3, var4, var6, class281.field3836 | 255 - class113.field1566 << 24, 1);
            }
        }
        if (class308.field4265 != null && class564.field7623 != null) {
            int var8 = (var4 - (class564.field7623.method1658() * 2)) / class308.field4265.method1658();
            for (int var9 = 0; var9 < var8; var9++) {
                class308.field4265.method3927(class564.field7623.method1658() + var2 + (class308.field4265.method1658() * var9), var3);
            }
            class564.field7623.method3927(var2, var3);
            class584.field8234.method3927(var2 + var4 - class584.field8234.method1658(), var3);
        }
        class428.field5986.method2423(class65.field812.method555(class697.field9900, true), var2 + 3, false, class698.field9904 | 0xFF000000, var3 + 14, -1);
        arg1.method110(var2, var3 + var6, var4, var5 - var6, 255 - class113.field1566 << 24 | class281.field3836, 1);
        int var10 = class214.field2991.method1499(8);
        int var11 = class214.field2991.method1491((byte) 125);
        int var12 = 0;
        for (class499 var13 = (class499) class588.field8265.method1436(28964); var13 != null; var13 = (class499) class588.field8265.method1443((byte) 6)) {
            int var31 = (class137.field1948 - var12 - 1) * 16 + (var3 - (-var6 - 13));
            var12++;
            if (var10 > var2 && var2 + var4 > var10 && var31 - 13 < var11 && var11 < var31 + 4 && var13.field6776) {
                arg1.method110(var2, var31 - 12, var4, 16, class657.field9138 | 255 - class202.field2858 << 24, 1);
            }
        }
        if ((class263.field3568 == null || class390.field5520 == null || class655.field9114 == null) && class508.field6961.method3623(arg0 ^ 0xFFFFFF9A, class158.field2310) && class508.field6961.method3623(-126, class164.field2345) && class508.field6961.method3623(-109, class615.field8590)) {
            class168 var14 = class168.method1193(class508.field6961, class164.field2345, 0);
            class390.field5520 = arg1.method146(var14, true);
            var14.method1192();
            class474.field6524 = arg1.method146(var14, true);
            class263.field3568 = arg1.method146(class168.method1193(class508.field6961, class158.field2310, 0), true);
            class168 var15 = class168.method1193(class508.field6961, class615.field8590, 0);
            class655.field9114 = arg1.method146(var15, true);
            var15.method1192();
            class474.field6516 = arg1.method146(var15, true);
        }
        int var16 = arg0;
        if (class263.field3568 != null && class390.field5520 != null && class655.field9114 != null) {
            int var17 = (var4 - (class655.field9114.method1658() * 2)) / class263.field3568.method1658();
            for (int var18 = 0; var18 < var17; var18++) {
                class263.field3568.method3927(var2 - (-class655.field9114.method1658() - class263.field3568.method1658() * var18), -class263.field3568.method1653() + var3 + var5);
            }
            int var19 = (var5 - class655.field9114.method1653() - var6) / class390.field5520.method1653();
            for (int var20 = 0; var20 < var19; var20++) {
                class390.field5520.method3927(var2, var3 - (-var6 - var20 * class390.field5520.method1653()));
                class474.field6524.method3927(var4 + var2 - class474.field6524.method1658(), var20 * class390.field5520.method1653() + var3 - -var6);
            }
            class655.field9114.method3927(var2, var3 + var5 - class655.field9114.method1653());
            class474.field6516.method3927(var2 + var4 - class655.field9114.method1658(), var3 - -var5 + -class655.field9114.method1653());
        }
        for (class499 var21 = (class499) class588.field8265.method1436(28964); var21 != null; var21 = (class499) class588.field8265.method1443((byte) 6)) {
            int var22 = (class137.field1948 - var16 - 1) * 16 + var3 + var6 + 13;
            int var23 = class698.field9904 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && (var22 - 13) < var11 && var22 + 4 > var11 && var21.field6776) {
                var23 = class285.field3919 | 0xFF000000;
            }
            int[] var24 = null;
            if (class420.method2434(var21.field6780, (byte) 105)) {
                var24 = class599.field8366.method3949(0, (int) var21.field6787).field9200;
            } else if (var21.field6779 != -1) {
                var24 = class599.field8366.method3949(arg0, var21.field6779).field9200;
            } else if (class628.method3514(var21.field6780, (byte) 49)) {
                class393 var27 = (class393) class299.field4071.method970((byte) 89, (long) ((int) var21.field6787));
                if (var27 != null) {
                    class61 var28 = var27.field5552;
                    class568 var29 = var28.field674;
                    if (var29.field8079 != null) {
                        var29 = var29.method3259((byte) 103, class578.field8156);
                    }
                    if (var29 != null) {
                        var24 = var29.field8056;
                    }
                }
            } else if (class556.method3115(30916, var21.field6780)) {
                Object var25 = null;
                class301 var26;
                if (var21.field6780 == 1010) {
                    var26 = class475.field6543.method2685((int) var21.field6787, arg0 ^ 0xFFFFFFB9);
                } else {
                    var26 = class475.field6543.method2685((int) (var21.field6787 >>> 32 & 0x7FFFFFFFL), -70);
                }
                if (var26.field4113 != null) {
                    var26 = var26.method1833(-91, class578.field8156);
                }
                if (var26 != null) {
                    var24 = var26.field4120;
                }
            }
            String var30 = class91.method664(var21, 105);
            if (var24 != null) {
                var30 = var30 + class90.method656(var24, (byte) -101);
            }
            class428.field5986.method2414(class599.field8362, false, var22, 0, var2 + 3, var23, class66.field862, var30);
            if (var21.field6784) {
                class164.field2361.method3927(class377.field5030.method1736(17046, var30) + var2 + 5, var22 + -12);
            }
            var16++;
        }
        class474.method2670(class568.field8040, (byte) -118, class426.field5970, class627.field8692, class603.field8403);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lls;BZ)V", line = 325)
    public static final void method3619(class124 arg0, byte arg1, boolean arg2) {
        field8936++;
        class67 var3 = arg0.method895(arg1 - 25294);
        if (arg0.field1797 == 0) {
            class477.field6580 = -1;
            class549.field7423 = 0;
            arg0.field1799 = 0;
            return;
        }
        if (arg0.field1779 != -1 && arg0.field1706 == 0) {
            class403 var4 = class192.field2727.method3090(122, arg0.field1779);
            if (arg0.field1802 > 0 && var4.field5661 == 0) {
                class477.field6580 = -1;
                class549.field7423 = 0;
                arg0.field1799++;
                return;
            }
            if (arg0.field1802 <= 0 && var4.field5647 == 0) {
                class549.field7423 = 0;
                class477.field6580 = -1;
                arg0.field1799++;
                return;
            }
        }
        if (arg0.field1724 != -1 && class186.field2697 >= arg0.field1749) {
            class157 var5 = class430.field5994.method1993(arg0.field1724, 64);
            if (var5.field2280 && var5.field2290 != -1) {
                class403 var6 = class192.field2727.method3090(-82, var5.field2290);
                if (arg0.field1802 > 0 && var6.field5661 == 0) {
                    class477.field6580 = -1;
                    class549.field7423 = 0;
                    arg0.field1799++;
                    return;
                }
                if (arg0.field1802 <= 0 && var6.field5647 == 0) {
                    arg0.field1799++;
                    class549.field7423 = 0;
                    class477.field6580 = -1;
                    return;
                }
            }
        }
        if (arg0.field1724 != -1 && arg0.field1749 <= class186.field2697) {
            class157 var7 = class430.field5994.method1993(arg0.field1724, 64);
            if (var7.field2280 && var7.field2290 != -1) {
                class403 var8 = class192.field2727.method3090(arg1 + 13, var7.field2290);
                if (arg0.field1802 > 0 && var8.field5661 == 0) {
                    class549.field7423 = 0;
                    class477.field6580 = -1;
                    arg0.field1799++;
                    return;
                }
                if (arg0.field1802 <= 0 && var8.field5647 == 0) {
                    class477.field6580 = -1;
                    arg0.field1799++;
                    class549.field7423 = 0;
                    return;
                }
            }
        }
        int var9 = arg0.field4042;
        int var10 = arg0.field4047;
        int var11 = arg0.field1807[arg0.field1797 - 1] * 512 + (arg0.method881(-109) * 256);
        int var12 = arg0.field1801[arg0.field1797 - 1] * 512 + arg0.method881(-120) * 256;
        if (var11 > var9) {
            if (var10 < var12) {
                arg0.method886(0, 10240);
            } else if (var10 > var12) {
                arg0.method886(0, 14336);
            } else {
                arg0.method886(arg1 - 67, 12288);
            }
        } else if (var9 <= var11) {
            if (var12 > var10) {
                arg0.method886(0, 8192);
            } else if (var10 > var12) {
                arg0.method886(0, 0);
            }
        } else if (var12 > var10) {
            arg0.method886(0, 6144);
        } else if (var10 > var12) {
            arg0.method886(arg1 - 67, 2048);
        } else {
            arg0.method886(0, 4096);
        }
        byte var13 = arg0.field1803[arg0.field1797 - 1];
        if (!arg2 && var11 - var9 > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || (var12 - var10) < -1024) {
            arg0.field4042 = var11;
            arg0.field4047 = var12;
            arg0.method894((byte) 73, false, arg0.field1695);
            arg0.field1797--;
            class477.field6580 = -1;
            class549.field7423 = 0;
            if (arg0.field1802 > 0) {
                arg0.field1802--;
            }
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg0 instanceof class61) {
            var15 = ((class61) arg0).field674.field8060;
        }
        if (var15) {
            int var16 = arg0.field1695 - arg0.field1738.field7046;
            if (var16 != 0 && arg0.field1701 == -1 && arg0.field1748 != 0) {
                var14 = 8;
            }
            if (!arg2 && arg0.field1797 > 2) {
                var14 = 24;
            }
            if (!arg2 && arg0.field1797 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg2 && arg0.field1797 > 1) {
                var14 = 24;
            }
            if (!arg2 && arg0.field1797 > 2) {
                var14 = 32;
            }
        }
        if (arg0.field1799 > 0 && arg0.field1797 > 1) {
            var14 = 32;
            arg0.field1799--;
        }
        if (arg1 != 67) {
            field8937 = null;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class549.field7423 = 0;
        if (var3.field866 != -1) {
            int var17 = var14 << 9;
            if (arg0.field1797 == 1) {
                int var18 = arg0.field1800 * arg0.field1800;
                int var19 = (arg0.field4042 <= var11 ? var11 - arg0.field4042 : -var11 + arg0.field4042) << 9;
                int var20 = (var12 >= arg0.field4047 ? var12 - arg0.field4047 : -var12 + arg0.field4047) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field866 * var21 * 2;
                if (var22 < var18) {
                    arg0.field1800 /= 2;
                } else if (var21 < var18 / 2) {
                    arg0.field1800 -= var3.field866;
                    if (arg0.field1800 < 0) {
                        arg0.field1800 = 0;
                    }
                } else if (arg0.field1800 < var17) {
                    arg0.field1800 += var3.field866;
                    if (arg0.field1800 > var17) {
                        arg0.field1800 = var17;
                    }
                }
            } else if (var17 > arg0.field1800) {
                arg0.field1800 += var3.field866;
                if (arg0.field1800 > var17) {
                    arg0.field1800 = var17;
                }
            } else if (arg0.field1800 > 0) {
                arg0.field1800 -= var3.field866;
                if (arg0.field1800 < 0) {
                    arg0.field1800 = 0;
                }
            }
            var14 = arg0.field1800 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class477.field6580 = -1;
        } else {
            if (var9 < var11) {
                class549.field7423 |= 0x4;
                arg0.field4042 += var14;
                if (arg0.field4042 > var11) {
                    arg0.field4042 = var11;
                }
            } else if (var11 < var9) {
                class549.field7423 |= 0x8;
                arg0.field4042 -= var14;
                if (arg0.field4042 < var11) {
                    arg0.field4042 = var11;
                }
            }
            if (var12 > var10) {
                arg0.field4047 += var14;
                class549.field7423 |= 0x1;
                if (var12 < arg0.field4047) {
                    arg0.field4047 = var12;
                }
            } else if (var10 > var12) {
                arg0.field4047 -= var14;
                class549.field7423 |= 0x2;
                if (var12 > arg0.field4047) {
                    arg0.field4047 = var12;
                }
            }
            if (var14 < 32) {
                class477.field6580 = var13;
            } else {
                class477.field6580 = 2;
            }
        }
        if (arg0.field4042 == var11 && arg0.field4047 == var12) {
            if (arg0.field1802 > 0) {
                arg0.field1802--;
            }
            arg0.field1797--;
        }
    }
}
