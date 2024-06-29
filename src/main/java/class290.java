import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class290 extends class351 {

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Z")
    public boolean field3821 = false;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Z")
    public boolean field3827 = false;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field3825 = 0;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "Ljc;")
    public static class305 field3826 = new class305("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I", line = 3)
    public final int method1736(int arg0, int arg1) {
        ++field3829;
        if (this.field3821) {
            return 0;
        } else {
            if (arg1 > -17) {
                this.method1739((class396) null, -70);
            }
            if (!this.method1738(0, arg0)) {
                return 1;
            } else {
                return !super.field4682 ? 1 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 22)
    public static void method1737(int arg0) {
        field3826 = null;
        if (arg0 != -2) {
            method1737(-50);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)Z", line = 32)
    public final boolean method1738(int arg0, int arg1) {
        ++field3828;
        return arg0 == arg1 && !this.field3827 ? super.field4668 : true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lug;I)V", line = 44)
    private final void method1739(class396 arg0, int arg1) {
        ++field3830;
        if (~(arg0.field5761.length + -arg0.field5729) <= -2) {
            int var3 = arg0.method2388((byte) -121);
            if (~var3 <= -1 && var3 <= 17) {
                byte var4;
                if (var3 == 17) {
                    var4 = 40;
                } else if (~var3 == -17) {
                    var4 = 38;
                } else if (var3 != 15) {
                    if (~var3 == -15) {
                        var4 = 36;
                    } else if (var3 == 13) {
                        var4 = 35;
                    } else if (~var3 == -13) {
                        var4 = 34;
                    } else if (~var3 != -12) {
                        if (~var3 == -11) {
                            var4 = 32;
                        } else if (~var3 == -10) {
                            var4 = 31;
                        } else if (var3 != 8) {
                            if (var3 != 7) {
                                if (~var3 != -7) {
                                    if (~var3 != -6) {
                                        if (~var3 == -5) {
                                            var4 = 24;
                                        } else if (~var3 != -4) {
                                            if (~var3 != -3) {
                                                if (~var3 != -2) {
                                                    var4 = 19;
                                                } else {
                                                    var4 = 23;
                                                }
                                            } else {
                                                var4 = 22;
                                            }
                                        } else {
                                            var4 = 23;
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
                        var4 = 33;
                    }
                } else {
                    var4 = 37;
                }
                if (~(arg0.field5761.length + -arg0.field5729) <= ~var4) {
                    super.field4667 = arg0.method2388((byte) -126);
                    if (~super.field4667 <= -2) {
                        if (~super.field4667 < -5) {
                            super.field4667 = 4;
                        }
                    } else {
                        super.field4667 = 1;
                    }
                    this.method1740(arg0.method2388((byte) -128) == 1, 91);
                    super.field4682 = ~arg0.method2388((byte) -117) == -2;
                    super.field4687 = ~arg0.method2388((byte) -120) == -2;
                    super.field4659 = arg0.method2388((byte) -119) == 1;
                    super.field4666 = ~arg0.method2388((byte) -115) != -2 ? 0 : 1;
                    super.field4663 = arg0.method2388((byte) -114) == 1;
                    super.field4676 = arg0.method2388((byte) -126) == 1;
                    super.field4669 = arg0.method2388((byte) -113) == 1;
                    super.field4680 = arg0.method2388((byte) -120);
                    if (super.field4680 > 2) {
                        super.field4680 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field4660 = arg0.method2388((byte) -127);
                    }
                    if (~var3 <= -3) {
                        super.field4681 = ~arg0.method2388((byte) -127) == -2;
                        if (~var3 <= -18) {
                            super.field4661 = arg0.method2388((byte) -120) == 1;
                        }
                    } else {
                        super.field4681 = arg0.method2388((byte) -120) == 1;
                        arg0.method2388((byte) -111);
                    }
                    super.field4665 = arg0.method2388((byte) -124) == 1;
                    super.field4653 = ~arg0.method2388((byte) -118) == -2;
                    super.field4674 = arg0.method2388((byte) -114);
                    if (super.field4674 > arg1) {
                        super.field4674 = 2;
                    }
                    super.field4654 = super.field4674;
                    super.field4670 = arg0.method2388((byte) -115) == 1;
                    super.field4652 = arg0.method2388((byte) -110);
                    if (super.field4652 > 127) {
                        super.field4652 = 127;
                    }
                    super.field4655 = arg0.method2388((byte) -114);
                    super.field4650 = arg0.method2388((byte) -121);
                    if (~super.field4650 < -128) {
                        super.field4650 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field4656 = arg0.method2386(arg1 + -23650);
                        super.field4649 = arg0.method2386(arg1 + -23650);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method2388((byte) -111);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method2388((byte) -119);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (class164.field2144 < 96) {
                            var5 = 0;
                        }
                        class468.method2852(-1, var5);
                    }
                    if (var3 >= 5) {
                        super.field4679 = arg0.method2406((byte) -126);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field4675 = var6 = arg0.method2388((byte) -120);
                    }
                    if (~super.field4675 != -2 && ~super.field4675 != -3) {
                        super.field4675 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field4658 = ~arg0.method2388((byte) -128) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field4651 = arg0.method2388((byte) -117) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field4657 = arg0.method2388((byte) -126);
                    }
                    if (~super.field4657 > -1 || ~super.field4657 < ~class387.method2350(class164.field2144, arg1 + -16902)) {
                        super.field4657 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field4685 = ~arg0.method2388((byte) -118) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field4678 = arg0.method2388((byte) -111) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field4666 = arg0.method2388((byte) -126);
                    }
                    if (~super.field4666 > -1 || ~super.field4666 < -3) {
                        super.field4666 = 1;
                    }
                    if (var3 >= 13) {
                        super.field4684 = arg0.method2388((byte) -123) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 == -1) {
                            super.field4648 = 2;
                        } else {
                            super.field4648 = 1;
                        }
                    } else {
                        super.field4648 = arg0.method2388((byte) -121);
                    }
                    if (super.field4648 < 0 || ~super.field4648 < -4) {
                        super.field4648 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field4686 = arg0.method2388((byte) -126);
                        if (~super.field4686 > -1 || super.field4686 > 4) {
                            super.field4686 = class334.field4429 != 1 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field4671 = ~arg0.method2388((byte) -126) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field4671 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field4648 == 0) {
                        super.field4648 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 313)
    public final void method1740(boolean arg0, int arg1) {
        int var3 = -64 % ((20 - arg1) / 63);
        ++field3824;
        super.field4668 = arg0;
        if (class123.field1593 != null) {
            class123.field1593.method2916(0, !this.method1738(0, class20.field183));
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lfq;)V", line = 450)
    public class290(class137 arg0) {
        super.field4667 = 3;
        this.method1740(true, -127);
        super.field4674 = 0;
        super.field4669 = true;
        super.field4687 = true;
        super.field4680 = 2;
        super.field4660 = 0;
        super.field4682 = true;
        super.field4666 = 1;
        super.field4653 = true;
        super.field4663 = true;
        super.field4650 = 127;
        super.field4659 = true;
        super.field4676 = true;
        super.field4652 = 127;
        super.field4655 = 255;
        super.field4656 = 0;
        super.field4670 = true;
        super.field4654 = 0;
        super.field4661 = false;
        super.field4665 = true;
        super.field4681 = true;
        super.field4649 = 0;
        if (~class164.field2144 <= -97) {
            class468.method2852(-1, 2);
        } else {
            class468.method2852(-1, 0);
        }
        super.field4685 = false;
        super.field4675 = 2;
        super.field4658 = false;
        super.field4648 = 2;
        super.field4678 = true;
        super.field4679 = 0;
        super.field4684 = true;
        super.field4686 = class334.field4429 != 1 ? 4 : 2;
        super.field4651 = false;
        super.field4657 = 0;
        class86 var2 = null;
        try {
            class236 var3 = arg0.method850("", true, true);
            while (var3.field3149 == 0) {
                class316.method1873(1L, false);
            }
            if (var3.field3149 == 1) {
                var2 = (class86) var3.field3151;
                byte[] var4 = new byte[(int) var2.method473((byte) 86)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method471(0, var4.length + -var5, var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1739(new class396(var4), 2);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method472(-29827);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lug;", line = 336)
    public final class396 method1741(byte arg0) {
        ++field3820;
        class396 var2 = new class396(41);
        var2.method2449((byte) 126, 17);
        var2.method2449((byte) 116, super.field4667);
        var2.method2449((byte) 118, super.field4668 ? 1 : 0);
        var2.method2449((byte) 126, !super.field4682 ? 0 : 1);
        var2.method2449((byte) 123, super.field4687 ? 1 : 0);
        var2.method2449((byte) 122, !super.field4659 ? 0 : 1);
        var2.method2449((byte) 126, 0);
        int var3 = -52 % ((22 - arg0) / 56);
        var2.method2449((byte) 126, !super.field4663 ? 0 : 1);
        var2.method2449((byte) 124, !super.field4676 ? 0 : 1);
        var2.method2449((byte) 118, !super.field4669 ? 0 : 1);
        var2.method2449((byte) 125, super.field4680);
        var2.method2449((byte) 123, super.field4660);
        var2.method2449((byte) 122, super.field4681 ? 1 : 0);
        var2.method2449((byte) 120, !super.field4661 ? 0 : 1);
        var2.method2449((byte) 122, super.field4665 ? 1 : 0);
        var2.method2449((byte) 122, super.field4653 ? 1 : 0);
        var2.method2449((byte) 127, super.field4674);
        var2.method2449((byte) 121, super.field4670 ? 1 : 0);
        var2.method2449((byte) 124, super.field4652);
        var2.method2449((byte) 124, super.field4655);
        var2.method2449((byte) 117, super.field4650);
        var2.method2444((byte) 65, super.field4656);
        var2.method2444((byte) 65, super.field4649);
        var2.method2449((byte) 125, class310.method1850(true));
        var2.method2398(120, super.field4679);
        var2.method2449((byte) 121, super.field4675);
        var2.method2449((byte) 123, !super.field4658 ? 0 : 1);
        var2.method2449((byte) 121, !super.field4651 ? 0 : 1);
        var2.method2449((byte) 122, super.field4657);
        var2.method2449((byte) 122, !super.field4685 ? 0 : 1);
        var2.method2449((byte) 121, !super.field4678 ? 0 : 1);
        var2.method2449((byte) 122, super.field4666);
        var2.method2449((byte) 124, !super.field4684 ? 0 : 1);
        var2.method2449((byte) 127, super.field4648);
        var2.method2449((byte) 121, super.field4686);
        var2.method2449((byte) 127, super.field4671 ? 1 : 0);
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)Z", line = 384)
    public final boolean method1742(int arg0, int arg1) {
        ++field3822;
        return arg0 == arg1 ? super.field4668 : true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lfq;B)V", line = 400)
    public final void method1743(class137 arg0, byte arg1) {
        ++field3823;
        class86 var3 = null;
        try {
            class236 var4 = arg0.method850("", true, true);
            int var5 = -73 % ((arg1 - 27) / 49);
            while (var4.field3149 == 0) {
                class316.method1873(1L, false);
            }
            if (~var4.field3149 == -2) {
                var3 = (class86) var4.field3151;
                class396 var6 = this.method1741((byte) -121);
                var3.method469(0, var6.field5729, 23609, var6.field5761);
            }
        } catch (Exception var8) {
        }
        try {
            if (var3 != null) {
                var3.method472(-29827);
            }
        } catch (Exception var7) {
        }
    }
}
