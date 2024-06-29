import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class94 extends class167 {

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    private int field1726 = 4096;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    private int field1725 = 0;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "Lkh;")
    public static class117 field1728 = class224.method1450((byte) 121, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "Lhe;")
    public static class82 field1719 = new class82();

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "Lkh;")
    public static class117 field1730 = class224.method1450((byte) -9, "(Z");

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "Lkh;")
    private static class117 field1733 = class224.method1450((byte) -34, "Your account is already logged in)3");

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lkh;")
    public static class117 field1732 = field1733;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "Lkh;")
    public static class117 field1734 = class224.method1450((byte) -20, "(U4");

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "Lff;")
    public static class62 field1731 = new class62(4096);

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "Lmg;")
    public static class138 field1718;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3009 = arg0.method998(69) == 1;
                }
            } else {
                this.field1726 = arg0.method1049((byte) 106);
            }
        } else {
            this.field1725 = arg0.method1049((byte) 100);
        }
        if (arg1) {
            method645(-110, 83);
        }
        ++field1727;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZI)V")
    public static final void method642(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field1730 = null;
        }
        for (int var5 = 0; ~class139.field2530 < ~var5; ++var5) {
            if (~(class7.field114[var5] - -class1.field7[var5]) < ~arg1 && arg0 + arg1 > class7.field114[var5] && ~arg4 > ~(class36.field843[var5] + class100.field1834[var5]) && ~(arg2 + arg4) < ~class36.field843[var5]) {
                class51.field1058[var5] = true;
            }
        }
        ++field1717;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)I")
    public static final int method643(int arg0, int arg1, int arg2) {
        ++field1716;
        if (arg0 != -3) {
            field1728 = null;
        }
        class248 var3 = (class248) class136.field2457.method460((long) arg2, arg0 + 4);
        if (var3 == null) {
            return 0;
        } else {
            return arg1 >= 0 && var3.field4553.length > arg1 ? var3.field4553[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
    public static void method644(byte arg0) {
        field1718 = null;
        field1734 = null;
        if (arg0 != -75) {
            field1730 = null;
        }
        field1733 = null;
        field1728 = null;
        field1731 = null;
        field1719 = null;
        field1730 = null;
        field1732 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)I")
    public static final int method645(int arg0, int arg1) {
        ++field1723;
        return arg0 == arg1 ? -1 : class58.method442(arg1 + -16712061, arg0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lkh;B)Lkh;")
    public static final class117 method646(class117 arg0, byte arg1) {
        ++field1724;
        if (arg1 != -58) {
            field1719 = null;
        }
        class72 var2 = class48.method380(arg1 + 98, arg0);
        return var2 == null ? client.field780 : var2.field1388;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
    public static final void method647(int arg0, byte arg1) {
        ++field1722;
        if (~class150.field2736 != ~arg0) {
            if (class150.field2736 == 0) {
                class231.method1489(true);
            }
            if (arg0 == 20 || arg0 == 40) {
                class228.field4098 = 0;
                class125.field2335 = 0;
                class114.field2130 = 0;
            }
            int var2 = 126 % ((arg1 - -16) / 54);
            if (~arg0 != -21 && arg0 != 40 && class106.field1935 != null) {
                class106.field1935.method748((byte) -84);
                class106.field1935 = null;
            }
            if (~class150.field2736 == -26) {
                class39.field890 = 1;
                class23.field582 = 0;
                class85.field1610 = 0;
                class212.field3858 = 1;
                class4.field50 = 0;
            }
            if (arg0 != 5 && ~arg0 != -11 && arg0 != 20) {
                class232.method1500(false);
            } else {
                class102.method691(class85.field1608, class172.field3108, class6.field101, -57);
            }
            class150.field2736 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class94() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field1721;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, 0, 0);
            for (int var5 = 0; ~class115.field2146 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field1725) {
                    if (~this.field1726 > ~var6) {
                        var3[var5] = this.field1726;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field1725;
                }
            }
        }
        if (arg0 != -96) {
            field1733 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field1720;
        if (arg1 != -9179) {
            return null;
        } else {
            int[][] var3 = super.field3022.method1148(arg0, 8708);
            if (super.field3022.field2957) {
                int[][] var4 = this.method1180(arg0, 26851, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[1];
                int[] var9 = var3[0];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class115.field2146; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (~this.field1725 < ~var13) {
                        var9[var11] = this.field1725;
                    } else if (~this.field1726 > ~var13) {
                        var9[var11] = this.field1726;
                    } else {
                        var9[var11] = var13;
                    }
                    if (~this.field1725 < ~var12) {
                        var8[var11] = this.field1725;
                    } else if (var12 > this.field1726) {
                        var8[var11] = this.field1726;
                    } else {
                        var8[var11] = var12;
                    }
                    if (~this.field1725 >= ~var14) {
                        if (~this.field1726 <= ~var14) {
                            var10[var11] = var14;
                        } else {
                            var10[var11] = this.field1726;
                        }
                    } else {
                        var10[var11] = this.field1725;
                    }
                }
            }
            return var3;
        }
    }
}
