import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class121 extends class350 implements class3 {

    @OriginalMember(owner = "client!bba", name = "qb", descriptor = "Z")
    private boolean field1749;

    @OriginalMember(owner = "client!bba", name = "N", descriptor = "Z")
    private boolean field1744;

    @OriginalMember(owner = "client!bba", name = "O", descriptor = "Z")
    private boolean field1742;

    @OriginalMember(owner = "client!bba", name = "M", descriptor = "B")
    private byte field1767;

    @OriginalMember(owner = "client!bba", name = "bb", descriptor = "B")
    private byte field1748;

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "S")
    private short field1747;

    @OriginalMember(owner = "client!bba", name = "nb", descriptor = "Z")
    private boolean field1754;

    @OriginalMember(owner = "client!bba", name = "V", descriptor = "Lka;")
    public class499 field1764;

    @OriginalMember(owner = "client!bba", name = "P", descriptor = "Lr;")
    private class192 field1757;

    @OriginalMember(owner = "client!bba", name = "rb", descriptor = "[Ljava/lang/String;")
    private static final String[] field1770 = new String[] { method1184(method1183("yZ\u0013KG3")), method1184(method1183("uM\u001e\t")), method1184(method1183("yZ\u0013KUZ\u0010")), method1184(method1183("`\u0016\\Kj")), method1184(method1183("yZ\u0013K\\3")), method1184(method1183("yZ\u0013KB3")), method1184(method1183("yZ\u0013KE3")), method1184(method1183("yZ\u0013K@3")), method1184(method1183("yZ\u0013KQ3")), method1184(method1183("yZ\u0013K_3")), method1184(method1183("yZ\u0013KTZ\u0010")), method1184(method1183("yZ\u0013KC3")), method1184(method1183("yZ\u0013KY3")), method1184(method1183("yZ\u0013K]3")), method1184(method1183("yZ\u0013KSZ\u0010")), method1184(method1183("yZ\u0013KX3")), method1184(method1183("yZ\u0013K^3")), method1184(method1183("yZ\u0013KZ3")), method1184(method1183("yZ\u0013K+rV\u001b\u0011)3")), method1184(method1183("yZ\u0013KA3")), method1184(method1183("yZ\u0013KF3")), method1184(method1183("yZ\u0013KD3")), method1184(method1183("yZ\u0013K[3")), method1184(method1183("yZ\u0013KP3")), method1184(method1183("yZ\u0013KRZ\u0010")), method1184(method1183("yZ\u0013KVZ\u0010")) };

    @OriginalMember(owner = "client!bba", name = "T", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!bba", name = "kb", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!bba", name = "Z", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!bba", name = "W", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!bba", name = "fb", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!bba", name = "X", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!bba", name = "lb", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!bba", name = "eb", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!bba", name = "gb", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!bba", name = "Q", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!bba", name = "mb", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!bba", name = "ob", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!bba", name = "S", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!bba", name = "ib", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!bba", name = "jb", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!bba", name = "db", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!bba", name = "cb", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!bba", name = "R", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!bba", name = "Y", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!bba", name = "hb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!bba", name = "pb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!bba", name = "ab", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!bba", name = "U", descriptor = "Lrga;")
    private class250 field1763;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lha;I)V")
    public final void method29(class63 arg0, int arg1) {
        try {
            int var3 = -29 / ((arg1 - 22) / 60);
            ++field1766;
            Object var4 = null;
            class192 var6;
            if (this.field1757 == null && this.field1754) {
                class379 var5 = this.method1180(262144, (byte) 116, arg0, true);
                var6 = var5 == null ? null : var5.field6115;
            } else {
                var6 = this.field1757;
                this.field1757 = null;
            }
            if (var6 != null) {
                class28.method283(var6, super.field9974, super.field9985, super.field9983, (boolean[]) null);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1770[9] + (arg0 != null ? field1770[3] : field1770[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lha;Ltk;IIIIIZIIZ)V")
    public class121(class63 arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class254.method2152(arg8, arg9, (byte) 126));
        try {
            this.field1749 = arg7;
            this.field1744 = ~arg1.field5843 != -1 && !arg7;
            this.field1742 = arg10;
            this.field1767 = (byte) arg9;
            this.field1748 = (byte) arg8;
            super.field9985 = arg4;
            this.field1747 = (short) arg1.field5855;
            super.field9983 = arg6;
            this.field1754 = arg0.method158() && arg1.field5875 && !this.field1749 && ~class623.field8996.field6381.method2920(true) != -1;
            int var12 = 2048;
            if (this.field1742) {
                var12 |= 65536;
            }
            class379 var13 = this.method1180(var12, (byte) 116, arg0, this.field1754);
            if (var13 != null) {
                this.field1764 = var13.field6116;
                this.field1757 = var13.field6115;
                if (this.field1742) {
                    this.field1764 = this.field1764.method394((byte) 0, var12, false);
                    return;
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field1770[18] + (arg0 != null ? field1770[3] : field1770[1]) + ',' + (arg1 != null ? field1770[3] : field1770[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field1758;
            class499 var5 = this.method1182(arg3, arg0, (byte) -93);
            if (var5 != null) {
                class486 var6 = arg3.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                return !class200.field3163 ? var5.method425(arg2, arg1, var6, false, 0) : var5.method429(arg2, arg1, var6, false, 0, class547.field8042);
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1770[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1770[3] : field1770[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "(B)V")
    public static final void method1178(byte arg0) {
        try {
            if (arg0 <= 52) {
                field1738 = -44;
            }
            ++field1761;
            class21.field210.method304(1);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1770[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lha;B)Lkv;")
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field1755;
            if (this.field1764 == null) {
                return null;
            } else {
                if (arg1 != 122) {
                    this.field1763 = null;
                }
                class486 var3 = arg0.method251();
                var3.method2465(super.field9985, super.field9972, super.field9983);
                class281 var4 = class349.method2910(this.field1744, 1, (byte) -128);
                if (class200.field3163) {
                    this.field1764.method423(var3, var4.field4578[0], class547.field8042, 0);
                } else {
                    this.field1764.method426(var3, var4.field4578[0], 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1770[24] + (arg0 != null ? field1770[3] : field1770[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLha;)V")
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field1751;
            if (arg0 != -108) {
                this.method1180(84, (byte) 96, (class63) null, true);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1770[2] + arg0 + ',' + (arg1 != null ? field1770[3] : field1770[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method1179(int arg0, String arg1, byte arg2) {
        try {
            if (arg2 >= -11) {
                field1738 = 34;
            }
            ++field1736;
            class551 var3 = class380.method3113(62, (long) arg0, 2);
            var3.method4086(64);
            var3.field8072 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1770[7] + arg0 + ',' + (arg1 != null ? field1770[3] : field1770[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(Lha;B)Lrga;")
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            ++field1752;
            if (arg1 != -118) {
                this.method31(-47, (class63) null);
            }
            if (this.field1763 == null) {
                this.field1763 = class198.method1814(this.method1182(arg0, 0, (byte) -93), 34069, super.field9985, super.field9983, super.field9972);
            }
            return this.field1763;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1770[14] + (arg0 != null ? field1770[3] : field1770[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
    public final int method34(int arg0) {
        try {
            ++field1760;
            return arg0 != 16388 ? 57 : this.field1748;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        try {
            ++field1765;
            return arg0 != 47 ? false : this.field1742;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)I")
    public final int method54(byte arg0) {
        try {
            if (arg0 > -112) {
                this.method50((byte) 99);
            }
            ++field1756;
            return this.field1764 == null ? 0 : this.field1764.method390();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBLha;Z)Lvh;")
    private final class379 method1180(int arg0, byte arg1, class63 arg2, boolean arg3) {
        try {
            ++field1759;
            class362 var5 = class370.field5999.method4002(111, this.field1747 & 65535);
            if (arg1 != 116) {
                this.field1749 = false;
            }
            class293 var6;
            class293 var7;
            if (!this.field1749) {
                if (~super.field9974 <= -4) {
                    var6 = null;
                } else {
                    var6 = class493.field7420[super.field9974 + 1];
                }
                var7 = class493.field7420[super.field9974];
            } else {
                var7 = class757.field11125[super.field9974];
                var6 = class493.field7420[0];
            }
            return var5.method3003((byte) 88, (class729) null, this.field1748, super.field9983, arg2, this.field1767, var6, var7, super.field9985, arg3, arg0, super.field9972);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1770[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1770[3] : field1770[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        try {
            ++field1762;
            class232.field3598 = -1;
            class137.field1930 = 0;
            class83.field1262 = -1;
            int var1 = 102 / ((31 - arg0) / 55);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILha;)V")
    public final void method31(int arg0, class63 arg1) {
        try {
            if (arg0 != -27998) {
                this.method31(102, (class63) null);
            }
            ++field1768;
            Object var3 = null;
            class192 var4;
            if (this.field1757 == null && this.field1754) {
                class379 var5 = this.method1180(262144, (byte) 116, arg1, true);
                var4 = var5 != null ? var5.field6115 : null;
            } else {
                var4 = this.field1757;
                this.field1757 = null;
            }
            if (var4 != null) {
                class681.method4962(var4, super.field9974, super.field9985, super.field9983, (boolean[]) null);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1770[23] + arg0 + ',' + (arg1 != null ? field1770[3] : field1770[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)I")
    public final int method35(byte arg0) {
        try {
            ++field1740;
            if (arg0 != -55) {
                this.method29((class63) null, 1);
            }
            return this.field1767;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lha;IB)Lka;")
    private final class499 method1182(class63 arg0, int arg1, byte arg2) {
        try {
            ++field1753;
            if (this.field1764 != null && arg0.method151(this.field1764.method433(), arg1) == 0) {
                return this.field1764;
            } else {
                class379 var4 = this.method1180(arg1, (byte) 116, arg0, false);
                if (arg2 != -93) {
                    this.field1754 = true;
                }
                return var4 == null ? null : var4.field6116;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1770[15] + (arg0 != null ? field1770[3] : field1770[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)I")
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                this.method50((byte) 91);
            }
            ++field1737;
            return this.field1764 == null ? 0 : this.field1764.method438();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        try {
            if (arg0 != -32768) {
                return true;
            } else {
                ++field1739;
                return this.field1764 == null ? false : this.field1764.method407();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public final void method30(int arg0) {
        try {
            if (this.field1764 != null) {
                this.field1764.method428();
            }
            if (arg0 != 20235) {
                this.field1767 = 109;
            }
            ++field1746;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        try {
            ++field1741;
            if (arg0 <= 54) {
                this.method34(114);
            }
            if (this.field1764 != null) {
                return !this.field1764.method409();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)I")
    public final int method32(byte arg0) {
        try {
            if (arg0 != -95) {
                return -118;
            } else {
                ++field1743;
                return 65535 & this.field1747;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            ++field1750;
            if (!(arg4 instanceof class121)) {
                if (arg4 instanceof class596) {
                    class596 var8 = (class596) arg4;
                    if (this.field1764 != null && var8.field8607 != null) {
                        this.field1764.method412(var8.field8607, arg6, arg1, arg3, arg0);
                    }
                }
            } else {
                class121 var9 = (class121) arg4;
                if (this.field1764 != null && var9.field1764 != null) {
                    this.field1764.method412(var9.field1764, arg6, arg1, arg3, arg0);
                }
            }
            if (arg5 > -10) {
                this.method50((byte) 123);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field1770[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1770[3] : field1770[1]) + ',' + arg3 + ',' + (arg4 != null ? field1770[3] : field1770[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        try {
            if (arg0 != -12) {
                method1181(-106);
            }
            ++field1769;
            return this.field1754;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        try {
            ++field1745;
            this.field1742 = false;
            if (arg0 <= -41) {
                if (this.field1764 != null) {
                    this.field1764.method411(this.field1764.method433() & -65537);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1770[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1183(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1184(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
