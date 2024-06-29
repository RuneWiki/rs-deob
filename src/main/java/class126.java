import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class126 extends class225 implements class722 {

    @OriginalMember(owner = "client!sfa", name = "V", descriptor = "Z")
    private boolean field1728;

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "Z")
    private boolean field1719;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "S")
    private short field1722;

    @OriginalMember(owner = "client!sfa", name = "R", descriptor = "B")
    private byte field1724;

    @OriginalMember(owner = "client!sfa", name = "hb", descriptor = "B")
    private byte field1740;

    @OriginalMember(owner = "client!sfa", name = "N", descriptor = "Z")
    private boolean field1720;

    @OriginalMember(owner = "client!sfa", name = "gb", descriptor = "Lka;")
    private class284 field1739;

    @OriginalMember(owner = "client!sfa", name = "fb", descriptor = "Lr;")
    private class709 field1738;

    @OriginalMember(owner = "client!sfa", name = "ab", descriptor = "Z")
    public static boolean field1733 = false;

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!sfa", name = "Q", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!sfa", name = "S", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!sfa", name = "T", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!sfa", name = "W", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!sfa", name = "X", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!sfa", name = "Y", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!sfa", name = "Z", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!sfa", name = "bb", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!sfa", name = "cb", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!sfa", name = "db", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!sfa", name = "eb", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!sfa", name = "ib", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sfa", name = "jb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sfa", name = "kb", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sfa", name = "lb", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sfa", name = "mb", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!sfa", name = "nb", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!sfa", name = "ob", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!sfa", name = "pb", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!sfa", name = "U", descriptor = "Liha;")
    private class613 field1727;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method781(int arg0) {
        ++field1731;
        return arg0 > -86 ? true : this.field1720;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I", line = 15)
    public final int method782(byte arg0) {
        ++field1737;
        int var2 = -35 / ((arg0 - -5) / 54);
        return 65535 & this.field1722;
    }

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)Z", line = 26)
    public final boolean method783(int arg0) {
        if (arg0 != 0) {
            field1733 = true;
        }
        ++field1736;
        if (this.field1739 == null) {
            return true;
        } else {
            return !this.field1739.method1689();
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)I", line = 41)
    public final int method784(int arg0) {
        ++field1746;
        return arg0 != -4532 ? -122 : this.field1724;
    }

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "(I)Z", line = 55)
    public final boolean method785(int arg0) {
        if (arg0 >= -117) {
            field1735 = -11;
        }
        ++field1742;
        return this.field1739 != null ? this.field1739.method1673() : false;
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Lha;B)Liha;", line = 70)
    public final class613 method653(class548 arg0, byte arg1) {
        if (this.field1727 == null) {
            this.field1727 = class491.method2980(super.field4418, -79, super.field4413, this.method789(0, true, arg0), super.field4410);
        }
        ++field1744;
        if (arg1 != 13) {
            this.field1739 = null;
        }
        return this.field1727;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZLha;)V", line = 86)
    public final void method659(boolean arg0, class548 arg1) {
        if (!arg0) {
            ++field1741;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;Z)V", line = 98)
    public final void method786(class548 arg0, boolean arg1) {
        ++field1732;
        Object var3 = null;
        class709 var5;
        if (this.field1738 == null && this.field1720) {
            class308 var4 = this.method791((byte) -83, true, 262144, arg0);
            var5 = var4 != null ? var4.field4321 : null;
        } else {
            var5 = this.field1738;
            this.field1738 = null;
        }
        if (arg1) {
            if (var5 != null) {
                class569.method3337(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZZLjava/lang/String;IILjava/lang/String;I)V", line = 133)
    public static final void method787(boolean arg0, boolean arg1, String arg2, int arg3, int arg4, String arg5, int arg6) {
        ++field1730;
        class589.field8029.field3498 = 1;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (~arg6 != arg3) {
            class648 var11 = class360.field5161.method2279(arg3 ^ -103, arg6);
            if (var11 == null || !var11.method3628((byte) -16) != !arg1) {
                return;
            }
            if (!var11.method3628((byte) -16)) {
                var9 = var11.field8689;
            } else {
                var10 = var11.field8687;
            }
        }
        int var12 = 0;
        for (int var13 = 0; ~var13 > ~class291.field4179.field2993; ++var13) {
            class671 var16 = class291.field4179.method1313(var13, true);
            if ((!arg0 || var16.field9308) && var16.field9324 == -1 && ~var16.field9268 == 0 && var16.field9315 == 0 && ~var16.field9281.toLowerCase().indexOf(var7) != 0) {
                if (~arg6 != 0) {
                    if (arg1) {
                        if (!arg5.equals(var16.method3793(arg6, var10, 20526))) {
                            continue;
                        }
                    } else if (~var16.method3783(0, var9, arg6) != ~arg4) {
                        continue;
                    }
                }
                if (~var12 <= -251) {
                    class602.field8142 = null;
                    class619.field8309 = -1;
                    return;
                }
                if (~var12 <= ~var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class619.field8309 = var12;
        class602.field8142 = var8;
        class232.field3271 = 0;
        String[] var14 = new String[class619.field8309];
        for (int var15 = 0; ~var15 > ~class619.field8309; ++var15) {
            var14[var15] = class291.field4179.method1313(var8[var15], true).field9281;
        }
        class450.method2758((byte) -98, class602.field8142, var14);
        class589.field8029.method1594((byte) 124);
        class589.field8029.field3498 = 2;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V", line = 243)
    public static final void method788() {
        class745.method4148(1, class370.field5229);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILha;IB)Z", line = 247)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        if (arg3 >= -58) {
            this.field1740 = -105;
        }
        ++field1725;
        class284 var5 = this.method789(131072, true, arg1);
        if (var5 != null) {
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            return class301.field4261 ? var5.method1653(arg0, arg2, var6, false, 0, class3.field30) : var5.method1669(arg0, arg2, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IZLha;)Lka;", line = 268)
    private final class284 method789(int arg0, boolean arg1, class548 arg2) {
        ++field1748;
        if (!arg1) {
            this.field1722 = 54;
        }
        if (this.field1739 != null && ~arg2.method1484(this.field1739.method1703(), arg0) == -1) {
            return this.field1739;
        } else {
            class308 var4 = this.method791((byte) -111, false, arg0, arg2);
            return var4 != null ? var4.field4319 : null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "(I)I", line = 292)
    public final int method790(int arg0) {
        if (arg0 != -11692) {
            return 9;
        } else {
            ++field1734;
            return this.field1739 == null ? 0 : this.field1739.method1668();
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;I)Lua;", line = 305)
    public final class3 method660(class548 arg0, int arg1) {
        ++field1721;
        if (this.field1739 == null) {
            return null;
        } else {
            class744 var3 = arg0.method1404();
            var3.method905(super.field3029 + super.field4410, super.field4413, super.field3022 + super.field4418);
            if (arg1 != -1) {
                this.method784(-96);
            }
            class3 var4 = class682.method3841(1, this.field1719, 28389);
            if (class301.field4261) {
                this.field1739.method1682(var3, var4.field18[0], class3.field30, 0);
            } else {
                this.field1739.method1686(var3, var4.field18[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BZILha;)Lcn;", line = 331)
    private final class308 method791(byte arg0, boolean arg1, int arg2, class548 arg3) {
        if (arg0 > -40) {
            return null;
        } else {
            ++field1745;
            class220 var5 = class20.field192.method716(6, 65535 & this.field1722);
            class341 var6;
            class341 var7;
            if (!this.field1728) {
                if (~super.field4419 > -4) {
                    var6 = class550.field7649[super.field4419 + 1];
                } else {
                    var6 = null;
                }
                var7 = class550.field7649[super.field4419];
            } else {
                var7 = class371.field5240[super.field4419];
                var6 = class550.field7649[0];
            }
            return var5.method1295(this.field1740, -5488, (class77) null, arg2, arg3, this.field1724, super.field4418, arg1, super.field4413, var6, var7, super.field4410);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lha;Lts;IIIIIZIIII)V", line = 361)
    public class126(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1728 = arg7;
        super.field4418 = arg6;
        this.field1719 = arg1.field2948 != 0 && !arg7;
        this.field1722 = (short) arg1.field2964;
        super.field4410 = arg4;
        this.field1724 = (byte) arg10;
        this.field1740 = (byte) arg11;
        this.field1720 = arg0.method1490() && arg1.field2956 && !this.field1728 && class332.field4707.field4787.method942(0) != 0;
        class308 var13 = this.method791((byte) -128, this.field1720, 2048, arg0);
        if (var13 != null) {
            this.field1739 = var13.field4319;
            this.field1738 = var13.field4321;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lha;B)V", line = 385)
    public final void method792(class548 arg0, byte arg1) {
        ++field1723;
        Object var3 = null;
        class709 var5;
        if (this.field1738 == null && this.field1720) {
            class308 var4 = this.method791((byte) -70, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field4321;
        } else {
            var5 = this.field1738;
            this.field1738 = null;
        }
        if (arg1 > -105) {
            this.method793((byte) 106);
        }
        if (var5 != null) {
            class569.method3336(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)I", line = 412)
    public final int method793(byte arg0) {
        ++field1743;
        if (arg0 != -86) {
            return 109;
        } else {
            return this.field1739 == null ? 0 : this.field1739.method1697();
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)I", line = 426)
    public final int method794(int arg0) {
        if (arg0 <= 92) {
            method788();
        }
        ++field1726;
        return this.field1740;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V", line = 437)
    public final void method795(int arg0) {
        if (this.field1739 != null) {
            this.field1739.method1705();
        }
        if (arg0 < 31) {
            this.field1722 = -97;
        }
        ++field1747;
    }
}
