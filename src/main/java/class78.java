import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class78 extends class230 {

    @OriginalMember(owner = "client!re", name = "Ob", descriptor = "I")
    public static volatile int field1260 = 0;

    @OriginalMember(owner = "client!re", name = "Wb", descriptor = "Z")
    public static boolean field1268 = true;

    @OriginalMember(owner = "client!re", name = "Jb", descriptor = "Lsc;")
    public static class181 field1255 = class149.method967(255, "Abbrechen");

    @OriginalMember(owner = "client!re", name = "Kb", descriptor = "[Lsc;")
    public static class181[] field1256 = new class181[100];

    @OriginalMember(owner = "client!re", name = "Ib", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!re", name = "Lb", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!re", name = "Mb", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!re", name = "Pb", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!re", name = "Qb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!re", name = "Rb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!re", name = "Tb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!re", name = "Ub", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!re", name = "Vb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!re", name = "Xb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!re", name = "Yb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!re", name = "Zb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!re", name = "ac", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!re", name = "bc", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!re", name = "cc", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!re", name = "dc", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!re", name = "Nb", descriptor = "Llf;")
    private class144 field1259;

    @OriginalMember(owner = "client!re", name = "Sb", descriptor = "[I")
    public static int[] field1264;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "(I)V")
    public static void method538(int arg0) {
        field1255 = null;
        field1264 = null;
        field1256 = null;
        if (arg0 > -15) {
            field1273 = -4;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLsc;)I")
    public static final int method539(byte arg0, class181 arg1) {
        ++field1266;
        return arg0 < 82 ? 73 : 1 + arg1.method1226(-458531486);
    }

    @OriginalMember(owner = "client!re", name = "t", descriptor = "(I)V")
    public static final void method540(int arg0) {
        ++field1257;
        if (arg0 == 0) {
            int var1 = class25.method213(13315);
            if (~var1 != -1) {
                if (~var1 != -2) {
                    class170.method1125((byte) (class94.field1505 + -4 & 255), false);
                    class238.method1626((byte) 108, 2);
                } else {
                    class170.method1125((byte) 0, false);
                    class238.method1626((byte) 108, 512);
                    class238.method1629(true);
                }
            } else {
                class174.field2919 = null;
                class238.method1626((byte) 108, 0);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "k", descriptor = "(II)V")
    public final void method541(int arg0, int arg1) {
        int var3 = -21 / ((arg1 - -17) / 57);
        super.field3977[super.field3933++] = (byte) (arg0 + this.field1259.method926(171));
        ++field1271;
    }

    @OriginalMember(owner = "client!re", name = "u", descriptor = "(I)V")
    public final void method542(int arg0) {
        if (arg0 > 88) {
            super.field3933 = (this.field1269 + 7) / 8;
            ++field1274;
        }
    }

    @OriginalMember(owner = "client!re", name = "v", descriptor = "(I)V")
    public static final void method543(int arg0) {
        class70.field1113.method1798(-84);
        ++field1254;
        int var1 = -127 % ((-10 - arg0) / 63);
        class73.field1164.method1798(-73);
        class188.field3324.method1798(-62);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)I")
    public final int method544(boolean arg0) {
        ++field1265;
        if (!arg0) {
            method546(-76, 118);
        }
        return 255 & super.field3977[super.field3933++] - this.field1259.method926(171);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)V")
    public final void method545(boolean arg0) {
        ++field1267;
        if (!arg0) {
            field1264 = null;
        }
        this.field1269 = super.field3933 * 8;
    }

    @OriginalMember(owner = "client!re", name = "l", descriptor = "(II)V")
    public static final void method546(int arg0, int arg1) {
        for (class124 var2 = (class124) class219.field3773.method1418(arg1); var2 != null; var2 = (class124) class219.field3773.method1421(false)) {
            if (~(var2.field606 >> 48 & 65535L) == ~((long) arg0)) {
                var2.method290((byte) -48);
            }
        }
        ++field1262;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class264 var5 = (class264) class94.field1493.method1686((byte) -83); var5 != null; var5 = (class264) class94.field1493.method1683(140)) {
            class169.method1116(arg1, arg2, -31552, var5, arg4, arg0);
        }
        for (class264 var6 = (class264) class7.field118.method1686((byte) -83); var6 != null; var6 = (class264) class7.field118.method1683(140)) {
            byte var10 = 1;
            if (~var6.field4597.field2655 != ~var6.field4597.field2629) {
                if (var6.field4597.field2629 == var6.field4597.field2625) {
                    var10 = 2;
                }
            } else {
                var10 = 0;
            }
            if (~var6.field4605 != ~var10) {
                int var11 = class19.method176(-1, var6.field4597);
                if (~var6.field4610 != ~var11) {
                    if (var6.field4606 != null) {
                        class90.field1420.method696(var6.field4606);
                        var6.field4606 = null;
                    }
                    var6.field4610 = var11;
                }
                var6.field4605 = var10;
            }
            var6.field4599 = var6.field4597.field2619 * 64 + var6.field4597.field2681;
            var6.field4588 = var6.field4597.field2619 * 64 + var6.field4597.field2654;
            var6.field4589 = var6.field4597.field2654;
            var6.field4596 = var6.field4597.field2681;
            class169.method1116(arg1, arg2, -31552, var6, arg4, arg0);
        }
        ++field1258;
        for (class264 var7 = (class264) class123.field2014.method1418(arg3 ^ arg3); var7 != null; var7 = (class264) class123.field2014.method1421(false)) {
            byte var8 = 1;
            if (var7.field4595.field2655 == var7.field4595.field2629) {
                var8 = 0;
            } else if (var7.field4595.field2629 == var7.field4595.field2625) {
                var8 = 2;
            }
            if (~var7.field4605 != ~var8) {
                int var9 = class20.method189(var7.field4595, true);
                if (~var7.field4610 != ~var9) {
                    if (var7.field4606 != null) {
                        class90.field1420.method696(var7.field4606);
                        var7.field4606 = null;
                    }
                    var7.field4610 = var9;
                }
                var7.field4605 = var8;
            }
            var7.field4588 = var7.field4595.field2619 * 64 + var7.field4595.field2654;
            var7.field4596 = var7.field4595.field2681;
            var7.field4599 = var7.field4595.field2681 - -(var7.field4595.field2619 * 64);
            var7.field4589 = var7.field4595.field2654;
            class169.method1116(arg1, arg2, -31552, var7, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(IB)I")
    public final int method548(int arg0, byte arg1) {
        int var3 = this.field1269 >> 3;
        ++field1275;
        if (arg1 != 67) {
            field1256 = null;
        }
        int var4 = -(7 & this.field1269) + 8;
        this.field1269 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (super.field3977[var3++] & class138.field2253[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field3977[var3] & class138.field2253[var4]) + var5;
        } else {
            var6 = (super.field3977[var3] >> -arg0 + var4 & class138.field2253[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "m", descriptor = "(II)I")
    public final int method549(int arg0, int arg1) {
        ++field1261;
        if (arg0 >= -76) {
            this.method544(true);
        }
        return arg1 * 8 + -this.field1269;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
    public static final void method550(int arg0, boolean arg1, int arg2) {
        ++field1270;
        class247 var3 = class132.field2183[class38.field581][arg0][arg2];
        if (var3 == null) {
            class175.method1172(class38.field581, arg0, arg2);
        } else {
            class44 var4 = null;
            int var5 = -99999999;
            for (class44 var6 = (class44) var3.method1686((byte) -83); var6 != null; var6 = (class44) var3.method1683(140)) {
                class99 var13 = class237.method1620(-29539, var6.field686.field1303);
                int var14 = var13.field1594;
                if (var13.field1639 == 1) {
                    var14 = (var6.field686.field1304 + 1) * var14;
                }
                if (var14 > var5) {
                    var5 = var14;
                    var4 = var6;
                }
            }
            if (!arg1) {
                method546(80, 120);
            }
            if (var4 == null) {
                class175.method1172(class38.field581, arg0, arg2);
            } else {
                var3.method1693(-1, var4);
                class44 var7 = (class44) var3.method1686((byte) -83);
                class81 var8 = null;
                class81 var9 = null;
                while (var7 != null) {
                    class81 var12 = var7.field686;
                    if (var4.field686.field1303 != var12.field1303) {
                        if (var8 == null) {
                            var8 = var12;
                        }
                        if (~var8.field1303 != ~var12.field1303 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var7 = (class44) var3.method1683(140);
                }
                long var10 = (long) ((arg2 << 7) + arg0 + 1610612736);
                class235.method1613(class38.field581, arg0, arg2, class232.method1606(class38.field581, (byte) -54, arg2 * 128 + 64, arg0 * 128 + 64), var4.field686, var10, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II[BI)V")
    public final void method551(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field1263;
        if (arg1 != -1011838301) {
            this.method542(-100);
        }
        for (int var5 = 0; ~var5 > ~arg3; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field3977[super.field3933++] + -this.field1259.method926(171));
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[I)V")
    public final void method552(int arg0, int[] arg1) {
        ++field1272;
        if (arg0 == -16332) {
            this.field1259 = new class144(arg1);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        super(arg0);
    }
}
