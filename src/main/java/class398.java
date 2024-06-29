import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class398 extends class484 {

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Z")
    public boolean field5487 = false;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "Z")
    public boolean field5491 = false;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
    public static int[] field5497 = new int[64];

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 5)
    public static void method2411(int arg0) {
        field5497 = null;
        if (arg0 != 22) {
            method2420(-81, 85, 7);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I", line = 16)
    public final int method2412(byte arg0, int arg1) {
        int var3 = -3 / ((-33 - arg0) / 59);
        ++field5494;
        if (this.field5491) {
            return 0;
        } else if (!this.method2415(123, arg1)) {
            return 1;
        } else {
            return super.field6666 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V", line = 37)
    public final void method2413(boolean arg0, int arg1) {
        super.field6675 = arg0;
        ++field5489;
        int var3 = 109 / ((arg1 - 74) / 38);
        if (class1.field23 != null) {
            class1.field23.method932(0, !this.method2415(21, class222.field2958));
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lbt;", line = 51)
    public final class32 method2414(int arg0) {
        ++field5495;
        class32 var2 = new class32(39);
        var2.method228(16, 32);
        var2.method228(super.field6664, arg0 + 34);
        var2.method228(super.field6675 ? 1 : 0, arg0 + 34);
        var2.method228(!super.field6666 ? 0 : 1, 32);
        var2.method228(!super.field6683 ? 0 : 1, 32);
        var2.method228(!super.field6668 ? 0 : 1, 32);
        var2.method228(0, arg0 + 34);
        if (arg0 != -2) {
            this.field5487 = false;
        }
        var2.method228(!super.field6673 ? 0 : 1, arg0 + 34);
        var2.method228(super.field6676 ? 1 : 0, arg0 ^ -34);
        var2.method228(super.field6681 ? 1 : 0, arg0 ^ -34);
        var2.method228(super.field6682, 32);
        var2.method228(super.field6696 ? 1 : 0, 32);
        var2.method228(!super.field6686 ? 0 : 1, 32);
        var2.method228(!super.field6665 ? 0 : 1, 32);
        var2.method228(super.field6691, 32);
        var2.method228(super.field6672 ? 1 : 0, 32);
        var2.method228(super.field6687, 32);
        var2.method228(super.field6688, arg0 ^ -34);
        var2.method228(super.field6671, 32);
        var2.method229(super.field6677, arg0 + 1309449546);
        var2.method229(super.field6693, 1309449544);
        var2.method228(class216.method1223(arg0 + 8175), 32);
        var2.method199((byte) -117, super.field6685);
        var2.method228(super.field6695, 32);
        var2.method228(super.field6689 ? 1 : 0, 32);
        var2.method228(super.field6670 ? 1 : 0, arg0 + 34);
        var2.method228(super.field6674, 32);
        var2.method228(super.field6679 ? 1 : 0, 32);
        var2.method228(super.field6694 ? 1 : 0, arg0 ^ -34);
        var2.method228(super.field6697, arg0 + 34);
        var2.method228(!super.field6680 ? 0 : 1, arg0 + 34);
        var2.method228(super.field6663, 32);
        var2.method228(super.field6669, 32);
        var2.method228(super.field6684 ? 0 : 1, 32);
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z", line = 98)
    public final boolean method2415(int arg0, int arg1) {
        ++field5496;
        int var3 = 105 % ((67 - arg0) / 36);
        return ~arg1 == -1 && !this.field5487 ? super.field6675 : true;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lml;)V", line = 444)
    public class398(class241 arg0) {
        super.field6664 = 3;
        this.method2413(true, 114);
        super.field6687 = 127;
        super.field6696 = true;
        super.field6678 = 0;
        super.field6671 = 127;
        super.field6686 = true;
        super.field6697 = 1;
        super.field6677 = 0;
        super.field6676 = true;
        super.field6673 = true;
        super.field6682 = 2;
        super.field6691 = 0;
        super.field6693 = 0;
        super.field6681 = true;
        super.field6665 = true;
        super.field6688 = 255;
        super.field6672 = true;
        super.field6668 = true;
        super.field6683 = true;
        super.field6666 = true;
        if (~class428.field5792 > -97) {
            class146.method869(0, true);
        } else {
            class146.method869(2, true);
        }
        super.field6694 = true;
        super.field6680 = true;
        super.field6689 = false;
        super.field6695 = 2;
        super.field6674 = 0;
        super.field6669 = ~class244.field3242 != -2 ? 4 : 2;
        super.field6679 = false;
        super.field6663 = 2;
        super.field6685 = 0;
        super.field6670 = false;
        class468 var2 = null;
        try {
            class474 var3 = arg0.method1332(43);
            while (var3.field6534 == 0) {
                class374.method2298(-28114, 1L);
            }
            if (~var3.field6534 == -2) {
                var2 = (class468) var3.field6529;
                byte[] var4 = new byte[(int) var2.method2751((byte) -127)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2749(var4.length + -var5, var5, var4, true);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2419(109, new class32(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2748((byte) 112);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Z", line = 116)
    public final boolean method2416(int arg0, byte arg1) {
        ++field5492;
        if (arg1 <= 123) {
            return false;
        } else {
            return arg0 == 0 ? super.field6675 : true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILml;)V", line = 134)
    public final void method2417(int arg0, class241 arg1) {
        ++field5488;
        class468 var3 = null;
        if (arg0 <= 32) {
            this.field5491 = false;
        }
        try {
            class474 var4 = arg1.method1332(35);
            while (var4.field6534 == 0) {
                class374.method2298(-28114, 1L);
            }
            if (~var4.field6534 == -2) {
                var3 = (class468) var4.field6529;
                class32 var5 = this.method2414(-2);
                var3.method2750(0, var5.field472, var5.field456, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2748((byte) 120);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I", line = 171)
    public static final int method2418(int arg0, int arg1) {
        if (arg1 != 704756328) {
            return 79;
        } else {
            ++field5493;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILbt;)V", line = 183)
    private final void method2419(int arg0, class32 arg1) {
        ++field5486;
        if (~(arg1.field472.length + -arg1.field456) <= -2) {
            int var3 = arg1.method201((byte) -124);
            if (var3 >= 0 && ~var3 >= -17) {
                byte var4;
                if (var3 == 16) {
                    var4 = 38;
                } else if (var3 != 15) {
                    if (~var3 != -15) {
                        if (var3 != 13) {
                            if (~var3 == -13) {
                                var4 = 34;
                            } else if (var3 == 11) {
                                var4 = 33;
                            } else if (var3 == 10) {
                                var4 = 32;
                            } else if (var3 != 9) {
                                if (var3 != 8) {
                                    if (~var3 == -8) {
                                        var4 = 29;
                                    } else if (var3 != 6) {
                                        if (~var3 == -6) {
                                            var4 = 28;
                                        } else if (~var3 != -5) {
                                            if (var3 != 3) {
                                                if (var3 != 2) {
                                                    if (var3 == 1) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 22;
                                                }
                                            } else {
                                                var4 = 23;
                                            }
                                        } else {
                                            var4 = 24;
                                        }
                                    } else {
                                        var4 = 28;
                                    }
                                } else {
                                    var4 = 30;
                                }
                            } else {
                                var4 = 31;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 36;
                    }
                } else {
                    var4 = 37;
                }
                if (~var4 >= ~(arg1.field472.length + -arg1.field456)) {
                    super.field6664 = arg1.method201((byte) -107);
                    if (super.field6664 >= 1) {
                        if (super.field6664 > 4) {
                            super.field6664 = 4;
                        }
                    } else {
                        super.field6664 = 1;
                    }
                    this.method2413(~arg1.method201((byte) -113) == -2, 117);
                    super.field6666 = ~arg1.method201((byte) -121) == -2;
                    super.field6683 = arg1.method201((byte) -125) == 1;
                    super.field6668 = ~arg1.method201((byte) -110) == -2;
                    super.field6697 = arg1.method201((byte) -106) != 1 ? 0 : 1;
                    super.field6673 = ~arg1.method201((byte) -119) == -2;
                    super.field6676 = ~arg1.method201((byte) -121) == -2;
                    super.field6681 = arg1.method201((byte) -126) == 1;
                    super.field6682 = arg1.method201((byte) -114);
                    if (~super.field6682 < -3) {
                        super.field6682 = 2;
                    }
                    if (var3 < 2) {
                        super.field6696 = ~arg1.method201((byte) -123) == -2;
                        arg1.method201((byte) -110);
                    } else {
                        super.field6696 = ~arg1.method201((byte) -115) == -2;
                    }
                    super.field6686 = arg1.method201((byte) -120) == 1;
                    super.field6665 = arg1.method201((byte) -127) == 1;
                    super.field6691 = arg1.method201((byte) -107);
                    if (super.field6691 > 2) {
                        super.field6691 = 2;
                    }
                    super.field6678 = super.field6691;
                    super.field6672 = ~arg1.method201((byte) -127) == -2;
                    super.field6687 = arg1.method201((byte) -111);
                    if (~super.field6687 < -128) {
                        super.field6687 = 127;
                    }
                    super.field6688 = arg1.method201((byte) -123);
                    super.field6671 = arg1.method201((byte) -107);
                    if (super.field6671 > 127) {
                        super.field6671 = 127;
                    }
                    if (var3 >= 1) {
                        super.field6677 = arg1.method215((byte) 101);
                        super.field6693 = arg1.method215((byte) 91);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg1.method201((byte) -109);
                    }
                    if (var3 >= 4) {
                        int var5 = arg1.method201((byte) -110);
                        if (var5 < 0 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class428.field5792 > -97) {
                            var5 = 0;
                        }
                        class146.method869(var5, true);
                    }
                    if (var3 >= 5) {
                        super.field6685 = arg1.method222(1024);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field6695 = var6 = arg1.method201((byte) -108);
                    }
                    if (super.field6695 != 1 && super.field6695 != 2) {
                        super.field6695 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field6689 = ~arg1.method201((byte) -115) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field6670 = arg1.method201((byte) -110) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field6674 = arg1.method201((byte) -125);
                    }
                    if (~super.field6674 > -1 || ~super.field6674 < ~class19.method120(class428.field5792, true)) {
                        super.field6674 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field6679 = arg1.method201((byte) -128) != 0;
                    }
                    if (var3 >= 11) {
                        super.field6694 = arg1.method201((byte) -121) != 0;
                    }
                    if (var3 >= 12) {
                        super.field6697 = arg1.method201((byte) -127);
                    }
                    if (~super.field6697 > -1 || super.field6697 > 2) {
                        super.field6697 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field6680 = arg1.method201((byte) -115) == 1;
                    }
                    if (~var3 > -15) {
                        if (~var6 == -1) {
                            super.field6663 = 2;
                        } else {
                            super.field6663 = 1;
                        }
                    } else {
                        super.field6663 = arg1.method201((byte) -124);
                    }
                    if (super.field6663 < 0 || ~super.field6663 < -4) {
                        super.field6663 = 2;
                    }
                    if (var3 >= 15) {
                        super.field6669 = arg1.method201((byte) -124);
                        if (~super.field6669 > -1 || super.field6669 > 4) {
                            super.field6669 = ~class244.field3242 == -2 ? 2 : 4;
                        }
                    }
                    if (arg0 > 3) {
                        if (var3 >= 16) {
                            super.field6684 = ~arg1.method201((byte) -125) != -2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lf;", line = 425)
    public static final class491 method2420(int arg0, int arg1, int arg2) {
        if (class289.field3897[arg0][arg1][arg2] == null) {
            boolean var3 = class289.field3897[0][arg1][arg2] != null && class289.field3897[0][arg1][arg2].field6862 != null;
            if (var3 && arg0 >= class142.field2056 - 1) {
                return null;
            }
            class356.method2187(arg0, arg1, arg2);
        }
        return class289.field3897[arg0][arg1][arg2];
    }
}
