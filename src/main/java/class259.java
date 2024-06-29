import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class259 extends class4 {

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Lqh;")
    public static class201 field4124;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Ljava/lang/String;")
    public String field4116;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)I")
    public static final int method1764(int arg0) {
        ++field4131;
        if (arg0 != 0) {
            method1767((char) 65486, 24, (byte) 68);
        }
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZIII[Lf;)V")
    public static final void method1765(int arg0, boolean arg1, int arg2, int arg3, int arg4, class36[] arg5) {
        ++field4122;
        for (int var6 = 0; ~var6 > ~arg5.length; ++var6) {
            class36 var7 = arg5[var6];
            if (var7 != null && var7.field632 == arg3) {
                class8.method57(arg1, (byte) 127, arg0, var7, arg2);
                class22.method217(arg2, arg0, var7, (byte) 56);
                if (~(-var7.field676 + var7.field602) > ~var7.field571) {
                    var7.field571 = -var7.field676 + var7.field602;
                }
                if (var7.field571 < 0) {
                    var7.field571 = 0;
                }
                if (var7.field630 > var7.field674 - var7.field642) {
                    var7.field630 = var7.field674 - var7.field642;
                }
                if (~var7.field630 > -1) {
                    var7.field630 = 0;
                }
                if (var7.field709 == 0) {
                    class195.method1330(var7, -1104623792, arg1);
                }
            }
        }
        if (arg4 < 53) {
            method1764(-30);
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    public final void method1766(int arg0) {
        super.field48 |= Long.MIN_VALUE;
        ++field4120;
        if (~this.method1769(true) == -1L) {
            class56.field951.method774(arg0, this);
        }
        if (arg0 != 0) {
            method1774((class201) null, (class201) null, (class201) null, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(CIB)C")
    public static final char method1767(char arg0, int arg1, byte arg2) {
        ++field4119;
        if (~arg0 <= -193 && ~arg0 >= -256) {
            if (~arg0 <= -193 && arg0 <= 198) {
                return 'A';
            }
            if (~arg0 == -200) {
                return 'C';
            }
            if (arg0 >= 200 && arg0 <= 203) {
                return 'E';
            }
            if (~arg0 <= -205 && ~arg0 >= -208) {
                return 'I';
            }
            if (~arg0 == -210 && ~arg1 != -1) {
                return 'N';
            }
            if (arg0 >= 210 && arg0 <= 214) {
                return 'O';
            }
            if (arg0 >= 217 && arg0 <= 220) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (~arg0 == -224) {
                return 's';
            }
            if (arg0 >= 224 && ~arg0 >= -231) {
                return 'a';
            }
            if (arg0 == 231) {
                return 'c';
            }
            if (~arg0 <= -233 && arg0 <= 235) {
                return 'e';
            }
            if (~arg0 <= -237 && ~arg0 >= -240) {
                return 'i';
            }
            if (~arg0 == -242 && arg1 != 0) {
                return 'n';
            }
            if (~arg0 <= -243 && ~arg0 >= -247) {
                return 'o';
            }
            if (~arg0 <= -250 && ~arg0 >= -253) {
                return 'u';
            }
            if (arg0 == 253 || arg0 == 255) {
                return 'y';
            }
        }
        int var3 = -22 / ((arg2 - -55) / 61);
        if (arg0 == 338) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else {
            return arg0 == 376 ? 'Y' : arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)I")
    public final int method1768(boolean arg0) {
        if (!arg0) {
            this.method1769(false);
        }
        ++field4129;
        return (int) super.field3247;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(Z)J")
    public final long method1769(boolean arg0) {
        ++field4130;
        if (!arg0) {
            this.field4113 = -89;
        }
        return Long.MAX_VALUE & super.field48;
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)V")
    public static final void method1770(int arg0) {
        client.field2521 = 0;
        class179.field2823 = 0;
        ++field4126;
        class33.field515 = -3;
        class85.field1352 = 1;
        class111.field1838 = 0;
        class212.field3456 = -1;
        class109.field1800 = false;
        if (arg0 <= 38) {
            method1767('~', -36, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)I")
    public final int method1771(int arg0) {
        if (arg0 != -247) {
            return -21;
        } else {
            ++field4125;
            return (int) (255L & super.field3247 >>> 32);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final void method1772(byte arg0) {
        int var2 = -27 / ((arg0 - 75) / 32);
        super.field48 = 500L + class276.method1861((byte) 122) | Long.MIN_VALUE & super.field48;
        ++field4117;
        class36.field555.method774(0, this);
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)V")
    public static final void method1773(int arg0) {
        if (arg0 != 235) {
            field4124 = null;
        }
        ++field4123;
        class260.field4134.method481(false);
        class68.field1132.method481(false);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lqh;Lqh;Lqh;B)V")
    public static final void method1774(class201 arg0, class201 arg1, class201 arg2, byte arg3) {
        if (arg3 == -8) {
            class136.field2235 = arg1;
            class284.field4485 = arg0;
            ++field4112;
            class22.field385 = arg2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V")
    public class259(int arg0, int arg1) {
        super.field3247 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "(I)V")
    public static void method1775(int arg0) {
        if (arg0 != 14985) {
            method1773(51);
        }
        field4124 = null;
    }
}
