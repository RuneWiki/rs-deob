import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class229 extends class481 {

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "Z")
    public boolean field3343 = false;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "Z")
    public boolean field3344 = false;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "Z")
    public boolean field3351 = false;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "Z")
    public boolean field3350 = false;

    @OriginalMember(owner = "client!kg", name = "rb", descriptor = "Z")
    public boolean field3361 = false;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!kg", name = "kb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!kg", name = "lb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!kg", name = "mb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!kg", name = "ob", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!kg", name = "pb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!kg", name = "qb", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!kg", name = "sb", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!kg", name = "tb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!kg", name = "ub", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!kg", name = "nb", descriptor = "[J")
    public static long[] field3357;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method1471(int arg0) {
        this.method1485((byte) -58, true);
        ++field3345;
        super.field6845 = true;
        super.field6869 = super.field6841 = arg0;
        super.field6862 = super.field6831 = 0;
        super.field6861 = false;
        super.field6844 = true;
        super.field6864 = true;
        super.field6838 = 1;
        super.field6842 = true;
        super.field6868 = true;
        super.field6837 = true;
        super.field6847 = true;
        super.field6836 = true;
        super.field6832 = false;
        super.field6835 = true;
        if (~class467.field6579 < -96) {
            class480.method2892(1, 0);
        } else {
            class480.method2892(0, arg0 ^ 1);
        }
        super.field6853 = true;
        super.field6859 = 0;
        super.field6867 = false;
        this.method1474(26951);
        super.field6857 = 3;
        class226.method1453((byte) 0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Z")
    public final boolean method1472(int arg0, byte arg1) {
        ++field3355;
        if (arg1 <= 75) {
            this.field3344 = false;
        }
        return ~arg0 == -1 && !this.field3343 ? super.field6866 : true;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)I")
    private final int method1473(int arg0, int arg1, int arg2) {
        ++field3359;
        byte var4;
        if (arg1 > 20000) {
            this.method1475(arg2 ^ 1);
            var4 = 4;
        } else if (arg1 > 10000) {
            this.method1471(~arg2);
            var4 = 3;
        } else if (~arg1 < -5001) {
            var4 = 2;
            this.method1484(true);
        } else {
            var4 = 1;
            this.method1478((byte) 1);
        }
        if (~class526.field7533 != ~arg0) {
            super.field6872 = arg0;
            class430.method2521(arg0, arg2);
        }
        this.method1480(class442.field5896, (byte) -69);
        if (arg2 != -2) {
            field3357 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    private final void method1474(int arg0) {
        if (class132.field1814 <= 1) {
            super.field6855 = 2;
        } else {
            super.field6855 = 4;
        }
        if (arg0 != 26951) {
            this.method1471(-55);
        }
        ++field3347;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public final void method1475(int arg0) {
        ++field3364;
        this.method1485((byte) -61, true);
        super.field6836 = true;
        super.field6868 = true;
        super.field6845 = true;
        super.field6847 = true;
        super.field6861 = true;
        super.field6844 = true;
        super.field6864 = true;
        super.field6832 = true;
        super.field6838 = 1;
        super.field6837 = true;
        super.field6842 = true;
        super.field6869 = super.field6841 = 2;
        super.field6862 = super.field6831 = 0;
        super.field6835 = true;
        if (class467.field6579 > 95) {
            class480.method2892(2, arg0 + 1);
        } else {
            class480.method2892(0, 0);
        }
        if (arg0 != -1) {
            this.method1482(-63);
        }
        super.field6859 = 0;
        super.field6867 = false;
        super.field6853 = true;
        this.method1474(26951);
        super.field6857 = 4;
        class226.method1453((byte) 0);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I")
    public final int method1476(byte arg0) {
        ++field3354;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class331.field4576 != 3 && class331.field4576 != 2) {
            if (!class331.field4577.startsWith("win")) {
                var3 = true;
            } else {
                if (!class331.field4566.startsWith("amd64") && !class331.field4566.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
                var3 = true;
            }
        }
        if (this.field3350) {
            var3 = false;
        }
        if (this.field3361) {
            var4 = false;
        }
        if (this.field3344) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method1482(-19603);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class283.method1762(204, 2, 1000);
                } catch (Exception var15) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class283.method1762(204, 3, 1000);
                    if (class526.field7533 == 3) {
                        class493 var8 = class99.field1445.method480();
                        long var9 = var8.field7008 & 281474976710655L;
                        int var11 = var8.field7007;
                        if (var11 != 4318) {
                            if (var11 == 4098) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var14) {
                }
            }
            int var12 = -52 % ((-53 - arg0) / 38);
            if (var3) {
                try {
                    var6 = class283.method1762(204, 1, 1000);
                } catch (Exception var13) {
                }
            }
            if (var5 == -1 && var6 == -1 && ~var7 == 0) {
                return this.method1482(-19603);
            } else if (~var7 > ~var5 && ~var6 > ~var5) {
                return this.method1479(var5, -128);
            } else {
                return ~var6 <= ~var7 ? this.method1473(1, var6, -2) : this.method1473(3, var7, -2);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(II)I")
    public final int method1477(int arg0, int arg1) {
        ++field3346;
        if (this.field3351) {
            return 0;
        } else if (!this.method1472(arg0, (byte) 97)) {
            return 1;
        } else if (arg1 != 1) {
            return -62;
        } else {
            return super.field6864 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public final void method1478(byte arg0) {
        ++field3358;
        this.method1485((byte) -80, false);
        super.field6868 = false;
        super.field6836 = false;
        super.field6845 = false;
        super.field6832 = false;
        super.field6835 = false;
        super.field6864 = false;
        super.field6842 = false;
        super.field6838 = 0;
        super.field6844 = false;
        super.field6861 = false;
        super.field6862 = super.field6831 = 0;
        super.field6837 = false;
        super.field6869 = super.field6841 = 0;
        super.field6847 = false;
        class480.method2892(0, 0);
        super.field6853 = false;
        super.field6859 = 0;
        super.field6867 = false;
        this.method1474(26951);
        int var2 = -52 % ((arg0 - 57) / 44);
        super.field6857 = 1;
        class226.method1453((byte) 0);
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(II)I")
    private final int method1479(int arg0, int arg1) {
        ++field3360;
        byte var3;
        if (~arg0 < -12001) {
            this.method1475(-1);
            var3 = 4;
        } else if (~arg0 < -5001) {
            this.method1471(1);
            var3 = 3;
        } else if (arg0 > 2000) {
            var3 = 2;
            this.method1484(true);
        } else {
            var3 = 1;
            this.method1478((byte) 105);
        }
        if (class526.field7533 != 2) {
            super.field6872 = 2;
            class430.method2521(2, -2);
        }
        this.method1480(class442.field5896, (byte) -69);
        if (arg1 >= -127) {
            this.method1475(-49);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Llp;B)V")
    public final void method1480(class331 arg0, byte arg1) {
        ++field3363;
        class633 var3 = null;
        try {
            class21 var4 = arg0.method2019("", true, true);
            while (var4.field202 == 0) {
                class236.method1513(true, 1L);
            }
            if (~var4.field202 == -2) {
                var3 = (class633) var4.field201;
                class148 var5 = new class148(class604.method3563((byte) -31));
                this.method2898((byte) 11, var5);
                var3.method3682((byte) -13, var5.field2146, var5.field2177, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3685(arg1 + -5879);
            }
            if (arg1 != -69) {
                this.field3343 = false;
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Z")
    public final boolean method1481(byte arg0, int arg1) {
        if (arg0 < 94) {
            this.field3350 = true;
        }
        ++field3352;
        return arg1 == 0 ? super.field6866 : true;
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I")
    private final int method1482(int arg0) {
        if (arg0 != -19603) {
            this.field3350 = true;
        }
        ++field3353;
        byte var3;
        if (class467.field6579 >= 96) {
            int var2 = class457.method2771(true);
            if (~var2 < -101) {
                if (var2 <= 500) {
                    var3 = 3;
                    this.method1471(1);
                } else if (var2 > 1000) {
                    this.method1478((byte) -106);
                    var3 = 1;
                } else {
                    var3 = 2;
                    this.method1484(true);
                }
            } else {
                var3 = 4;
                this.method1475(-1);
            }
        } else {
            var3 = 1;
            this.method1478((byte) 117);
        }
        if (~class526.field7533 != -1) {
            super.field6872 = 0;
            class430.method2521(0, arg0 + 19601);
        }
        this.method1480(class442.field5896, (byte) -69);
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)V")
    public static void method1483(int arg0) {
        if (arg0 != 3) {
            method1483(1);
        }
        field3357 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public final void method1484(boolean arg0) {
        this.method1485((byte) -111, true);
        ++field3349;
        super.field6842 = false;
        super.field6862 = super.field6831 = 0;
        super.field6838 = 0;
        super.field6836 = false;
        super.field6847 = false;
        super.field6844 = false;
        super.field6868 = false;
        super.field6845 = false;
        super.field6869 = super.field6841 = 0;
        super.field6835 = false;
        super.field6832 = false;
        super.field6837 = arg0;
        super.field6861 = false;
        super.field6864 = false;
        class480.method2892(0, 0);
        super.field6853 = true;
        super.field6867 = false;
        super.field6859 = 0;
        this.method1474(26951);
        super.field6857 = 2;
        class226.method1453((byte) 0);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Llp;)V")
    public class229(class331 arg0) {
        super.field6857 = 3;
        super.field6863 = 3;
        this.method1485((byte) -96, true);
        super.field6842 = true;
        super.field6837 = true;
        super.field6861 = false;
        super.field6864 = true;
        super.field6850 = 127;
        super.field6868 = true;
        super.field6845 = true;
        super.field6832 = true;
        super.field6873 = 127;
        super.field6836 = true;
        super.field6869 = 2;
        super.field6841 = 0;
        super.field6840 = 127;
        super.field6831 = 0;
        super.field6862 = 0;
        super.field6865 = 0;
        super.field6839 = 0;
        super.field6871 = true;
        super.field6835 = true;
        super.field6838 = 1;
        super.field6844 = true;
        if (~class467.field6579 <= -97) {
            class480.method2892(2, 0);
        } else {
            class480.method2892(0, 0);
        }
        super.field6858 = 2;
        super.field6867 = false;
        super.field6872 = 2;
        super.field6859 = 0;
        super.field6854 = false;
        super.field6870 = 0;
        super.field6853 = true;
        super.field6852 = false;
        super.field6855 = ~class132.field1814 == -2 ? 2 : 4;
        super.field6834 = true;
        class633 var2 = null;
        try {
            class21 var3 = arg0.method2019("", true, true);
            while (~var3.field202 == -1) {
                class236.method1513(true, 1L);
            }
            if (~var3.field202 == -2) {
                var2 = (class633) var3.field201;
                byte[] var4 = new byte[(int) var2.method3686(97)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method3683(72, var4.length - var5, var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1486(new class148(var4), false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3685(-5948);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZ)V")
    public final void method1485(byte arg0, boolean arg1) {
        ++field3356;
        super.field6866 = arg1;
        if (class216.field3172 != null) {
            class216.field3172.method1498(!this.method1472(class526.field7533, (byte) 117), 1536);
        }
        if (arg0 >= -37) {
            field3357 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lgw;Z)V")
    private final void method1486(class148 arg0, boolean arg1) {
        ++field3348;
        if (~(arg0.field2146.length - arg0.field2177) <= -2) {
            int var3 = arg0.method1032((byte) -33);
            if (~var3 <= -1 && ~var3 >= -19) {
                byte var4;
                if (var3 == 18) {
                    var4 = 41;
                } else if (var3 != 17) {
                    if (~var3 == -17) {
                        var4 = 38;
                    } else if (~var3 == -16) {
                        var4 = 37;
                    } else if (~var3 == -15) {
                        var4 = 36;
                    } else if (~var3 == -14) {
                        var4 = 35;
                    } else if (~var3 == -13) {
                        var4 = 34;
                    } else if (~var3 != -12) {
                        if (~var3 != -11) {
                            if (var3 == 9) {
                                var4 = 31;
                            } else if (var3 == 8) {
                                var4 = 30;
                            } else if (var3 != 7) {
                                if (~var3 == -7) {
                                    var4 = 28;
                                } else if (~var3 == -6) {
                                    var4 = 28;
                                } else if (~var3 != -5) {
                                    if (var3 == 3) {
                                        var4 = 23;
                                    } else if (~var3 == -3) {
                                        var4 = 22;
                                    } else if (var3 != 1) {
                                        var4 = 19;
                                    } else {
                                        var4 = 23;
                                    }
                                } else {
                                    var4 = 24;
                                }
                            } else {
                                var4 = 29;
                            }
                        } else {
                            var4 = 32;
                        }
                    } else {
                        var4 = 33;
                    }
                } else {
                    var4 = 40;
                }
                if (var4 <= arg0.field2146.length + -arg0.field2177) {
                    super.field6863 = arg0.method1032((byte) -33);
                    if (~super.field6863 <= -2) {
                        if (~super.field6863 < -5) {
                            super.field6863 = 4;
                        }
                    } else {
                        super.field6863 = 1;
                    }
                    this.method1485((byte) -93, arg0.method1032((byte) -33) == 1);
                    super.field6864 = ~arg0.method1032((byte) -33) == -2;
                    super.field6837 = arg0.method1032((byte) -33) == 1;
                    super.field6835 = ~arg0.method1032((byte) -33) == -2;
                    super.field6838 = arg0.method1032((byte) -33) == 1 ? 1 : 0;
                    super.field6836 = ~arg0.method1032((byte) -33) == -2;
                    super.field6845 = ~arg0.method1032((byte) -33) == -2;
                    super.field6868 = arg0.method1032((byte) -33) == 1;
                    if (arg1) {
                        this.field3361 = true;
                    }
                    super.field6869 = arg0.method1032((byte) -33);
                    if (super.field6869 > 2) {
                        super.field6869 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field6841 = arg0.method1032((byte) -33);
                    }
                    if (var3 < 2) {
                        super.field6844 = ~arg0.method1032((byte) -33) == -2;
                        arg0.method1032((byte) -33);
                    } else {
                        super.field6844 = arg0.method1032((byte) -33) == 1;
                        if (~var3 <= -18) {
                            super.field6861 = ~arg0.method1032((byte) -33) == -2;
                        }
                    }
                    super.field6832 = arg0.method1032((byte) -33) == 1;
                    super.field6842 = arg0.method1032((byte) -33) == 1;
                    super.field6862 = arg0.method1032((byte) -33);
                    if (~super.field6862 < -3) {
                        super.field6862 = 2;
                    }
                    super.field6831 = super.field6862;
                    super.field6871 = ~arg0.method1032((byte) -33) == -2;
                    super.field6840 = arg0.method1032((byte) -33);
                    if (super.field6840 > 127) {
                        super.field6840 = 127;
                    }
                    super.field6850 = arg0.method1032((byte) -33);
                    super.field6873 = arg0.method1032((byte) -33);
                    if (super.field6873 > 127) {
                        super.field6873 = 127;
                    }
                    if (var3 >= 1) {
                        super.field6839 = arg0.method1045(true);
                        super.field6865 = arg0.method1045(true);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method1032((byte) -33);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method1032((byte) -33);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (class467.field6579 < 96) {
                            var5 = 0;
                        }
                        class480.method2892(var5, 0);
                    }
                    if (~var3 <= -6) {
                        super.field6870 = arg0.method1026(-917302120);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field6858 = var6 = arg0.method1032((byte) -33);
                    }
                    if (super.field6858 != 1 && super.field6858 != 2) {
                        super.field6858 = 2;
                    }
                    if (var3 >= 7) {
                        super.field6854 = ~arg0.method1032((byte) -33) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field6852 = arg0.method1032((byte) -33) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field6859 = arg0.method1032((byte) -33);
                    }
                    if (~super.field6859 > -1 || super.field6859 > class647.method3731((byte) 58, class467.field6579)) {
                        super.field6859 = 0;
                    }
                    if (var3 >= 10) {
                        super.field6867 = arg0.method1032((byte) -33) != 0;
                    }
                    if (~var3 <= -12) {
                        super.field6834 = arg0.method1032((byte) -33) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field6838 = arg0.method1032((byte) -33);
                    }
                    if (super.field6838 < 0 || super.field6838 > 2) {
                        super.field6838 = 1;
                    }
                    if (var3 >= 13) {
                        super.field6853 = arg0.method1032((byte) -33) == 1;
                    }
                    if (~var3 > -15) {
                        if (var6 != 0) {
                            super.field6872 = 1;
                        } else {
                            super.field6872 = 2;
                        }
                    } else {
                        super.field6872 = arg0.method1032((byte) -33);
                    }
                    if (~super.field6872 > -1 || super.field6872 > 5) {
                        super.field6872 = 2;
                    }
                    if (var3 >= 15) {
                        super.field6855 = arg0.method1032((byte) -33);
                        if (super.field6855 < 0 || ~super.field6855 < -5) {
                            super.field6855 = ~class132.field1814 != -2 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field6847 = ~arg0.method1032((byte) -33) == -2;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field6847 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field6872 == -1) {
                        super.field6872 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field6857 = arg0.method1032((byte) -33);
                        if (~super.field6857 > -1 || ~super.field6857 < -5) {
                            super.field6857 = 0;
                        }
                        if (super.field6857 == 2) {
                            super.field6837 = true;
                            return;
                        }
                    }
                }
            }
        }
    }
}
