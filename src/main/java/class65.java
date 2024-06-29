import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class65 extends class285 {

    @OriginalMember(owner = "client!iv", name = "Z", descriptor = "Z")
    public boolean field845 = false;

    @OriginalMember(owner = "client!iv", name = "bb", descriptor = "Z")
    public boolean field847 = false;

    @OriginalMember(owner = "client!iv", name = "U", descriptor = "I")
    public static int field840 = 0;

    @OriginalMember(owner = "client!iv", name = "Q", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!iv", name = "T", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!iv", name = "V", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!iv", name = "W", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!iv", name = "X", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!iv", name = "Y", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!iv", name = "ab", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!iv", name = "cb", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!iv", name = "db", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!iv", name = "R", descriptor = "Lqn;")
    public static class47 field837;

    @OriginalMember(owner = "client!iv", name = "S", descriptor = "Lqn;")
    public static class47 field838;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Z")
    public final boolean method577(int arg0, byte arg1) {
        if (arg1 < 42) {
            return true;
        } else {
            ++field849;
            return arg0 != 0 ? true : super.field3638;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLpc;)V")
    public final void method578(byte arg0, class476 arg1) {
        ++field848;
        class210 var3 = null;
        if (arg0 < 2) {
            field840 = 1;
        }
        try {
            class121 var4 = arg1.method2882("", true, (byte) -58);
            while (~var4.field1628 == -1) {
                class199.method1251(1L, (byte) -33);
            }
            if (~var4.field1628 == -2) {
                var3 = (class210) var4.field1627;
                class463 var5 = this.method586((byte) 116);
                var3.method1301(1, var5.field6618, var5.field6631, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1303((byte) -66);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(II)V")
    public static final void method579(int arg0, int arg1) {
        ++field841;
        class153 var2 = class75.method656(arg0, arg0 + 250, arg1);
        var2.method997((byte) 93);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(IB)Z")
    public final boolean method580(int arg0, byte arg1) {
        ++field843;
        if (arg1 != -35) {
            field840 = 88;
        }
        return ~arg0 == -1 && !this.field847 ? super.field3638 : true;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
    public final void method581(int arg0, boolean arg1) {
        ++field836;
        if (arg0 != 0) {
            field837 = null;
        }
        super.field3638 = arg1;
        if (class315.field4017 != null) {
            class315.field4017.method1956(!this.method580(class377.field4959, (byte) -35), -29111);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static void method582(boolean arg0) {
        if (arg0) {
            method584(-95, false);
        }
        field837 = null;
        field838 = null;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(II)I")
    public final int method583(int arg0, int arg1) {
        ++field839;
        if (this.field845) {
            return 0;
        } else {
            if (arg0 != -21537) {
                this.method586((byte) -12);
            }
            if (!this.method580(arg1, (byte) -35)) {
                return 1;
            } else {
                return super.field3622 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(IZ)Lh;")
    public static final class472 method584(int arg0, boolean arg1) {
        ++field844;
        class472 var2 = (class472) class292.field3717.method2647(-99, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1) {
                field838 = null;
            }
            byte[] var3 = class323.field4095.method481(0, arg0, -62);
            class472 var4 = new class472();
            if (var3 != null) {
                var4.method2847((byte) 121, arg0, new class463(var3));
            }
            class292.field3717.method2635((long) arg0, -26591, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lfh;B)V")
    private final void method585(class463 arg0, byte arg1) {
        ++field846;
        if (~(arg0.field6618.length + -arg0.field6631) <= -2) {
            int var3 = arg0.method2737(false);
            if (~var3 <= -1 && ~var3 >= -18) {
                byte var4;
                if (~var3 != -18) {
                    if (var3 == 16) {
                        var4 = 38;
                    } else if (var3 == 15) {
                        var4 = 37;
                    } else if (~var3 == -15) {
                        var4 = 36;
                    } else if (~var3 != -14) {
                        if (~var3 == -13) {
                            var4 = 34;
                        } else if (~var3 != -12) {
                            if (~var3 != -11) {
                                if (~var3 == -10) {
                                    var4 = 31;
                                } else if (~var3 != -9) {
                                    if (~var3 != -8) {
                                        if (~var3 != -7) {
                                            if (~var3 != -6) {
                                                if (var3 == 4) {
                                                    var4 = 24;
                                                } else if (~var3 == -4) {
                                                    var4 = 23;
                                                } else if (var3 != 2) {
                                                    if (var3 == 1) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 22;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 28;
                                        }
                                    } else {
                                        var4 = 29;
                                    }
                                } else {
                                    var4 = 30;
                                }
                            } else {
                                var4 = 32;
                            }
                        } else {
                            var4 = 33;
                        }
                    } else {
                        var4 = 35;
                    }
                } else {
                    var4 = 40;
                }
                if (var4 <= arg0.field6618.length + -arg0.field6631) {
                    super.field3655 = arg0.method2737(false);
                    if (super.field3655 >= 1) {
                        if (super.field3655 > 4) {
                            super.field3655 = 4;
                        }
                    } else {
                        super.field3655 = 1;
                    }
                    this.method581(0, arg0.method2737(false) == 1);
                    super.field3622 = ~arg0.method2737(false) == -2;
                    super.field3618 = arg0.method2737(false) == 1;
                    super.field3634 = ~arg0.method2737(false) == -2;
                    super.field3639 = arg0.method2737(false) == 1 ? 1 : 0;
                    super.field3652 = ~arg0.method2737(false) == -2;
                    super.field3617 = ~arg0.method2737(false) == -2;
                    super.field3616 = arg0.method2737(false) == 1;
                    super.field3649 = arg0.method2737(false);
                    if (super.field3649 > 2) {
                        super.field3649 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field3645 = arg0.method2737(false);
                    }
                    if (var3 >= 2) {
                        super.field3637 = ~arg0.method2737(false) == -2;
                        if (~var3 <= -18) {
                            super.field3633 = ~arg0.method2737(false) == -2;
                        }
                    } else {
                        super.field3637 = arg0.method2737(false) == 1;
                        arg0.method2737(false);
                    }
                    super.field3623 = ~arg0.method2737(false) == -2;
                    super.field3636 = arg0.method2737(false) == 1;
                    super.field3626 = arg0.method2737(false);
                    if (super.field3626 > 2) {
                        super.field3626 = 2;
                    }
                    super.field3621 = super.field3626;
                    super.field3620 = arg0.method2737(false) == 1;
                    super.field3619 = arg0.method2737(false);
                    if (super.field3619 > 127) {
                        super.field3619 = 127;
                    }
                    super.field3629 = arg0.method2737(false);
                    super.field3630 = arg0.method2737(false);
                    if (super.field3630 > 127) {
                        super.field3630 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field3643 = arg0.method2758((byte) 97);
                        super.field3644 = arg0.method2758((byte) 109);
                    }
                    if (arg1 == -64) {
                        if (var3 >= 3 && ~var3 > -7) {
                            arg0.method2737(false);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg0.method2737(false);
                            if (~var5 > -1 || var5 > 2) {
                                var5 = 0;
                            }
                            if (class105.field1333 < 96) {
                                var5 = 0;
                            }
                            class410.method2436(57, var5);
                        }
                        if (~var3 <= -6) {
                            super.field3650 = arg0.method2727(-120);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field3635 = var6 = arg0.method2737(false);
                        }
                        if (~super.field3635 != -2 && super.field3635 != 2) {
                            super.field3635 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field3628 = arg0.method2737(false) == 1;
                        }
                        if (var3 >= 8) {
                            super.field3615 = ~arg0.method2737(false) == -2;
                        }
                        if (~var3 <= -10) {
                            super.field3624 = arg0.method2737(false);
                        }
                        if (super.field3624 < 0 || super.field3624 > class496.method2999(true, class105.field1333)) {
                            super.field3624 = 0;
                        }
                        if (var3 >= 10) {
                            super.field3640 = arg0.method2737(false) != 0;
                        }
                        if (var3 >= 11) {
                            super.field3627 = ~arg0.method2737(false) != -1;
                        }
                        if (var3 >= 12) {
                            super.field3639 = arg0.method2737(false);
                        }
                        if (super.field3639 < 0 || super.field3639 > 2) {
                            super.field3639 = 1;
                        }
                        if (~var3 <= -14) {
                            super.field3654 = ~arg0.method2737(false) == -2;
                        }
                        if (var3 < 14) {
                            if (~var6 == -1) {
                                super.field3656 = 2;
                            } else {
                                super.field3656 = 1;
                            }
                        } else {
                            super.field3656 = arg0.method2737(false);
                        }
                        if (super.field3656 < 0 || super.field3656 > 3) {
                            super.field3656 = 2;
                        }
                        if (var3 >= 15) {
                            super.field3648 = arg0.method2737(false);
                            if (~super.field3648 > -1 || super.field3648 > 4) {
                                super.field3648 = class323.field4104 != 1 ? 4 : 2;
                            }
                        }
                        if (var3 >= 16) {
                            super.field3625 = arg0.method2737(false) == 1;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field3625 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && ~super.field3656 == -1) {
                            super.field3656 = 2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Lfh;")
    public final class463 method586(byte arg0) {
        ++field842;
        class463 var2 = new class463(41);
        var2.method2729(17, false);
        var2.method2729(super.field3655, false);
        var2.method2729(!super.field3638 ? 0 : 1, false);
        var2.method2729(!super.field3622 ? 0 : 1, false);
        var2.method2729(super.field3618 ? 1 : 0, false);
        var2.method2729(super.field3634 ? 1 : 0, false);
        var2.method2729(0, false);
        var2.method2729(!super.field3652 ? 0 : 1, false);
        var2.method2729(!super.field3617 ? 0 : 1, false);
        var2.method2729(super.field3616 ? 1 : 0, false);
        var2.method2729(super.field3649, false);
        var2.method2729(super.field3645, false);
        var2.method2729(super.field3637 ? 1 : 0, false);
        var2.method2729(!super.field3633 ? 0 : 1, false);
        var2.method2729(super.field3623 ? 1 : 0, false);
        var2.method2729(super.field3636 ? 1 : 0, false);
        var2.method2729(super.field3626, false);
        var2.method2729(!super.field3620 ? 0 : 1, false);
        var2.method2729(super.field3619, false);
        if (arg0 <= 97) {
            field840 = -9;
        }
        var2.method2729(super.field3629, false);
        var2.method2729(super.field3630, false);
        var2.method2759((byte) -105, super.field3643);
        var2.method2759((byte) -38, super.field3644);
        var2.method2729(class451.method2689(-17524), false);
        var2.method2777(super.field3650, -11);
        var2.method2729(super.field3635, false);
        var2.method2729(super.field3628 ? 1 : 0, false);
        var2.method2729(!super.field3615 ? 0 : 1, false);
        var2.method2729(super.field3624, false);
        var2.method2729(super.field3640 ? 1 : 0, false);
        var2.method2729(!super.field3627 ? 0 : 1, false);
        var2.method2729(super.field3639, false);
        var2.method2729(super.field3654 ? 1 : 0, false);
        var2.method2729(super.field3656, false);
        var2.method2729(super.field3648, false);
        var2.method2729(super.field3625 ? 1 : 0, false);
        return var2;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lpc;)V")
    public class65(class476 arg0) {
        super.field3655 = 3;
        this.method581(0, true);
        super.field3645 = 0;
        super.field3637 = true;
        super.field3621 = 0;
        super.field3639 = 1;
        super.field3649 = 2;
        super.field3636 = true;
        super.field3643 = 0;
        super.field3617 = true;
        super.field3633 = false;
        super.field3644 = 0;
        super.field3634 = true;
        super.field3623 = true;
        super.field3619 = 127;
        super.field3652 = true;
        super.field3616 = true;
        super.field3618 = true;
        super.field3629 = 255;
        super.field3622 = true;
        super.field3620 = true;
        super.field3630 = 127;
        super.field3626 = 0;
        if (~class105.field1333 <= -97) {
            class410.method2436(57, 2);
        } else {
            class410.method2436(57, 0);
        }
        super.field3615 = false;
        super.field3640 = false;
        super.field3635 = 2;
        super.field3628 = false;
        super.field3627 = true;
        super.field3654 = true;
        super.field3650 = 0;
        super.field3624 = 0;
        super.field3648 = ~class323.field4104 != -2 ? 4 : 2;
        super.field3656 = 2;
        class210 var2 = null;
        try {
            class121 var3 = arg0.method2882("", true, (byte) -123);
            while (var3.field1628 == 0) {
                class199.method1251(1L, (byte) -99);
            }
            if (var3.field1628 == 1) {
                var2 = (class210) var3.field1627;
                byte[] var4 = new byte[(int) var2.method1306(0)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1305(0, var5, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method585(new class463(var4), (byte) -64);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1303((byte) -66);
            }
        } catch (Exception var7) {
        }
    }
}
