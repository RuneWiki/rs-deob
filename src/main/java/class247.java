import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class247 extends class28 {

    @OriginalMember(owner = "client!sg", name = "sb", descriptor = "Z")
    private boolean field4307 = false;

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "Z")
    private volatile boolean field4299 = false;

    @OriginalMember(owner = "client!sg", name = "zb", descriptor = "I")
    private int field4314 = -1;

    @OriginalMember(owner = "client!sg", name = "lb", descriptor = "I")
    private int field4300;

    @OriginalMember(owner = "client!sg", name = "Bb", descriptor = "Lp;")
    private class86 field4316;

    @OriginalMember(owner = "client!sg", name = "nb", descriptor = "Lp;")
    private class86 field4302;

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "[I")
    public static int[] field4296 = new int[2];

    @OriginalMember(owner = "client!sg", name = "mb", descriptor = "Lr;")
    public static class66 field4301 = class93.method641(43, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "Lr;")
    public static class66 field4298 = class93.method641(43, "<col=ffffff>");

    @OriginalMember(owner = "client!sg", name = "rb", descriptor = "[J")
    public static long[] field4306 = new long[100];

    @OriginalMember(owner = "client!sg", name = "tb", descriptor = "Z")
    public static boolean field4308 = false;

    @OriginalMember(owner = "client!sg", name = "yb", descriptor = "[Lr;")
    public static class66[] field4313 = new class66[1000];

    @OriginalMember(owner = "client!sg", name = "qb", descriptor = "Lr;")
    public static class66 field4305 = class93.method641(43, "(Udns");

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!sg", name = "ob", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!sg", name = "pb", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!sg", name = "ub", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!sg", name = "vb", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!sg", name = "wb", descriptor = "I")
    private int field4311;

    @OriginalMember(owner = "client!sg", name = "xb", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!sg", name = "Ab", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!sg", name = "Cb", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!sg", name = "Db", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!sg", name = "Eb", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!sg", name = "Gb", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!sg", name = "Hb", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!sg", name = "Fb", descriptor = "[Z")
    private volatile boolean[] field4320;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
    public final void method131(int arg0, byte arg1) {
        ++field4310;
        if (arg1 < 84) {
            this.field4307 = true;
        }
        if (this.method143(arg0, 0)) {
            class203.method1318(this.field4300, arg0, true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ[BLp;I)V")
    public final void method1622(int arg0, boolean arg1, byte[] arg2, class86 arg3, int arg4) {
        ++field4315;
        if (this.field4316 != arg3) {
            if (!arg1 && this.field4314 == arg4) {
                this.field4299 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4320[arg4] = false;
                if (this.field4307 || arg1) {
                    class244.method1609(arg1, super.field414[arg4], this.field4300, (byte) 2, arg4, this, (byte) 22);
                }
                return;
            }
            class257.field4517.reset();
            class257.field4517.update(arg2, 0, arg2.length + -2);
            int var6 = (int) class257.field4517.getValue();
            int var7 = (arg2[arg2.length + -2] << 8 & 65280) + (255 & arg2[arg2.length + -1]);
            if (~super.field414[arg4] != ~var6 || super.field420[arg4] != var7) {
                this.field4320[arg4] = false;
                if (this.field4307 || arg1) {
                    class244.method1609(arg1, super.field414[arg4], this.field4300, (byte) 2, arg4, this, (byte) 22);
                }
                return;
            }
            this.field4320[arg4] = true;
            if (arg1) {
                super.field381[arg4] = class115.method766(false, (byte) -126, arg2);
            }
        } else {
            if (this.field4299) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class244.method1609(true, this.field4304, 255, (byte) 0, this.field4300, this, (byte) 22);
                return;
            }
            class257.field4517.reset();
            class257.field4517.update(arg2, 0, arg2.length);
            int var8 = (int) class257.field4517.getValue();
            if (~this.field4304 != ~var8) {
                class244.method1609(true, this.field4304, 255, (byte) 0, this.field4300, this, (byte) 22);
                return;
            }
            class249 var9;
            try {
                var9 = new class249(class66.method482(arg2, true));
            } catch (RuntimeException var13) {
                class244.method1609(true, this.field4304, 255, (byte) 0, this.field4300, this, (byte) 22);
                return;
            }
            int var10 = var9.method1677(-6677);
            if (~var10 != -6 && var10 != 6) {
                class244.method1609(true, this.field4304, 255, (byte) 0, this.field4300, this, (byte) 22);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method1652(-5528);
            }
            if (~this.field4311 != ~var11) {
                class244.method1609(true, this.field4304, 255, (byte) 0, this.field4300, this, (byte) 22);
                return;
            }
            this.method146(arg2, -25529);
            this.method1630(-1);
        }
        int var12 = -14 / ((arg0 - 77) / 41);
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)I")
    public final int method1623(int arg0) {
        ++field4318;
        if (this.field4299) {
            return 100;
        } else if (super.field381 != null) {
            return 99;
        } else {
            int var2 = class175.method1182(0, this.field4300, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            int var3 = 120 / ((arg0 - -13) / 59);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V")
    public static final void method1624(int arg0) {
        ++field4312;
        class205.field3511.method1614(-114);
        if (arg0 >= 29) {
            class95.field1823.method1614(-50);
        }
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(II)Z")
    public static final boolean method1625(int arg0, int arg1) {
        if (arg1 != -1) {
            method1628(-14);
        }
        ++field4321;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lp;Lp;IZZZ)V")
    public class247(class86 arg0, class86 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field4300 = arg2;
        this.field4316 = arg1;
        this.field4302 = arg0;
        this.field4307 = arg5;
        class145.method1003(this, -5720, this.field4300);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        ++field4297;
        if (!this.method143(arg1, arg0)) {
            return 0;
        } else if (super.field381[arg1] != null) {
            return 100;
        } else {
            return this.field4320[arg1] ? 100 : class175.method1182(0, arg1, this.field4300);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)V")
    public final void method1626(int arg0, byte arg1, int arg2) {
        ++field4309;
        this.field4304 = arg2;
        this.field4311 = arg0;
        if (this.field4316 != null) {
            class149.method1014(this.field4316, this, 1, this.field4300);
        } else {
            class244.method1609(true, this.field4304, 255, (byte) 0, this.field4300, this, (byte) 22);
        }
        if (arg1 <= 76) {
            field4306 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field4319;
        int var8 = 0;
        if (arg6 < -58) {
            int var9 = arg1;
            int var10 = 0;
            int var11 = -arg0 + arg5;
            int var12 = arg5 * arg5;
            int var13 = -arg0 + arg1;
            int var14 = arg1 * arg1;
            int var15 = var11 * var11;
            int var16 = var13 * var13;
            int var17 = var14 << 1;
            int var18 = var12 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = var13 << 1;
            int var22 = arg1 << 1;
            int var23 = -((var22 + -1) * var18) + var14;
            int var24 = (1 - var22) * var12 + var17;
            int var25 = (-var21 + 1) * var15 - -var19;
            int var26 = var12 << 2;
            int var27 = -((var21 - 1) * var20) + var16;
            int var28 = var15 << 2;
            int var29 = var14 << 2;
            int var30 = var16 << 2;
            int var31 = var19 * 3;
            int var32 = var17 * 3;
            int var33 = (var21 + -3) * var20;
            int var34 = (var22 + -3) * var18;
            int var35 = var29;
            int var36 = (arg1 + -1) * var26;
            int var37 = (var13 + -1) * var28;
            int[] var38 = class15.field183[arg7];
            int var39 = var30;
            class194.method1266(-arg5 + arg3, (byte) -17, arg2, var38, -var11 + arg3);
            class194.method1266(-var11 + arg3, (byte) -17, arg4, var38, arg3 + var11);
            class194.method1266(arg3 + var11, (byte) -17, arg2, var38, arg3 + arg5);
            while (var9 > 0) {
                if (~var24 > -1) {
                    while (~var24 > -1) {
                        ++var8;
                        var24 += var32;
                        var23 += var35;
                        var35 += var29;
                        var32 += var29;
                    }
                }
                boolean var40 = ~var9 >= ~var13;
                if (var40) {
                    if (var25 < 0) {
                        while (~var25 > -1) {
                            ++var10;
                            var27 += var39;
                            var25 += var31;
                            var39 += var30;
                            var31 += var30;
                        }
                    }
                    if (~var27 > -1) {
                        var25 += var31;
                        var27 += var39;
                        ++var10;
                        var39 += var30;
                        var31 += var30;
                    }
                    var25 += -var37;
                    var27 += -var33;
                    var33 -= var28;
                    var37 -= var28;
                }
                if (~var23 > -1) {
                    var24 += var32;
                    var23 += var35;
                    ++var8;
                    var32 += var29;
                    var35 += var29;
                }
                var24 += -var36;
                --var9;
                int var41 = arg3 - -var8;
                int var42 = arg7 - -var9;
                var36 -= var26;
                int var43 = -var9 + arg7;
                int var44 = -var8 + arg3;
                var23 += -var34;
                if (!var40) {
                    class194.method1266(var44, (byte) -17, arg2, class15.field183[var43], var41);
                    class194.method1266(var44, (byte) -17, arg2, class15.field183[var42], var41);
                } else {
                    int var45 = arg3 + var10;
                    int var46 = -var10 + arg3;
                    class194.method1266(var44, (byte) -17, arg2, class15.field183[var43], var46);
                    class194.method1266(var46, (byte) -17, arg4, class15.field183[var43], var45);
                    class194.method1266(var45, (byte) -17, arg2, class15.field183[var43], var41);
                    class194.method1266(var44, (byte) -17, arg2, class15.field183[var42], var46);
                    class194.method1266(var46, (byte) -17, arg4, class15.field183[var42], var45);
                    class194.method1266(var45, (byte) -17, arg2, class15.field183[var42], var41);
                }
                var34 -= var26;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)V")
    public final void method128(byte arg0, int arg1) {
        ++field4322;
        if (this.method143(arg1, 0)) {
            if (this.field4302 != null && this.field4320 != null && this.field4320[arg1]) {
                class149.method1014(this.field4302, this, 1, arg1);
            } else {
                class244.method1609(true, super.field414[arg1], this.field4300, (byte) 2, arg1, this, (byte) 22);
            }
            if (arg0 > -103) {
                field4296 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "(I)V")
    public static void method1628(int arg0) {
        field4305 = null;
        if (arg0 != -677379135) {
            method1624(107);
        }
        field4301 = null;
        field4306 = null;
        field4298 = null;
        field4296 = null;
        field4313 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZII[B)V")
    public final void method1629(boolean arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        if (arg3 >= 122) {
            ++field4303;
            if (arg1) {
                if (this.field4299) {
                    throw new RuntimeException();
                } else {
                    if (this.field4316 != null) {
                        class125.method865(this.field4300, arg4, -30372, this.field4316);
                    }
                    this.method146(arg4, -25529);
                    this.method1630(-1);
                }
            } else {
                arg4[arg4.length + -2] = (byte) (super.field420[arg2] >> 8);
                arg4[arg4.length - 1] = (byte) super.field420[arg2];
                if (this.field4302 != null) {
                    class125.method865(arg2, arg4, -30372, this.field4302);
                    this.field4320[arg2] = true;
                }
                if (arg0) {
                    super.field381[arg2] = class115.method766(false, (byte) 71, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "(I)V")
    private final void method1630(int arg0) {
        ++field4317;
        this.field4320 = new boolean[super.field381.length];
        for (int var2 = 0; ~var2 > ~this.field4320.length; ++var2) {
            this.field4320[var2] = false;
        }
        if (this.field4302 == null) {
            this.field4299 = true;
        } else {
            this.field4314 = arg0;
            for (int var3 = 0; ~this.field4320.length < ~var3; ++var3) {
                if (~super.field387[var3] < -1) {
                    class147.method1013(this, (byte) -119, this.field4302, var3);
                    this.field4314 = var3;
                }
            }
            if (~this.field4314 == 0) {
                this.field4299 = true;
            }
        }
    }
}
