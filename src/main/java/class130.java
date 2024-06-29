import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class130 extends class736 implements class362 {

    @OriginalMember(owner = "client!laa", name = "S", descriptor = "Z")
    private boolean field1702 = false;

    @OriginalMember(owner = "client!laa", name = "W", descriptor = "Lkm;")
    public class371 field1706;

    @OriginalMember(owner = "client!laa", name = "mb", descriptor = "Z")
    private boolean field1722;

    @OriginalMember(owner = "client!laa", name = "cb", descriptor = "Lke;")
    public static class622 field1712 = new class622(123, 0);

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!laa", name = "N", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!laa", name = "Q", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!laa", name = "R", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!laa", name = "U", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!laa", name = "V", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!laa", name = "X", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!laa", name = "Y", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!laa", name = "ab", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!laa", name = "bb", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!laa", name = "db", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!laa", name = "eb", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!laa", name = "fb", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!laa", name = "hb", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!laa", name = "ib", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!laa", name = "jb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!laa", name = "kb", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!laa", name = "lb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!laa", name = "nb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!laa", name = "gb", descriptor = "Lpw;")
    private class733 field1716;

    @OriginalMember(owner = "client!laa", name = "Z", descriptor = "Z")
    public static boolean field1709;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;B)Lpw;")
    public final class733 method255(class66 arg0, byte arg1) {
        ++field1711;
        int var3 = -75 / ((arg1 - -45) / 63);
        return this.field1716;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;B)Lhq;")
    public final class167 method258(class66 arg0, byte arg1) {
        ++field1718;
        class495 var3 = this.field1706.method2292(false, arg0, 2048, true, 15514);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 10) {
                this.field1722 = false;
            }
            class378 var4 = arg0.method433();
            var4.method1959(super.field7718, super.field7723, super.field7719);
            class167 var5 = class653.method3739(arg1 + -10, 1, this.field1722);
            int var6 = super.field7718 >> 9;
            int var7 = super.field7719 >> 9;
            this.field1706.method2300(var7, arg1 + -135, var7, var6, arg0, var3, var4, true, var6);
            if (class475.field6760) {
                var3.method91(var4, var5.field2426[0], class412.field5822, 0);
            } else {
                var3.method108(var4, var5.field2426[0], 0);
            }
            if (this.field1706.field5347 != null) {
                class443 var8 = this.field1706.field5347.method184();
                if (class475.field6760) {
                    arg0.method464(var8, class412.field5822);
                } else {
                    arg0.method437(var8);
                }
            }
            this.field1702 = var3.method88() || this.field1706.field5347 != null;
            if (this.field1716 == null) {
                this.field1716 = class302.method2004(super.field7718, super.field7719, -125, super.field7723, var3);
            } else {
                class299.method1997(var3, super.field7723, 5378, super.field7718, this.field1716, super.field7719);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method939(byte arg0, String arg1) {
        ++field1710;
        int var2 = arg1.length();
        if (arg0 <= 69) {
            field1709 = true;
        }
        if (var2 == 0) {
            return new byte[0];
        } else {
            int var3 = var2 - -3 & -4;
            int var4 = var3 / 4 * 3;
            if (var3 + -2 < var2 && ~class583.method3384((byte) 97, arg1.charAt(var3 + -2)) != 0) {
                if (~(var3 + -1) <= ~var2 || class583.method3384((byte) 97, arg1.charAt(var3 + -1)) == -1) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class538.method3106(var5, arg1, 0, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "(I)Z")
    public final boolean method244(int arg0) {
        ++field1708;
        int var2 = -19 % ((-19 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZLha;I)Z")
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field1714;
        class495 var5 = this.field1706.method2292(false, arg2, 131072, false, 15514);
        if (var5 == null) {
            return false;
        } else if (!arg1) {
            return true;
        } else {
            class378 var6 = arg2.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            return class475.field6760 ? var5.method84(arg3, arg0, var6, false, 0, class412.field5822) : var5.method83(arg3, arg0, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "(I)I")
    public final int method239(int arg0) {
        if (arg0 > -9) {
            field1712 = null;
        }
        ++field1703;
        return this.field1706.method2304((byte) 14);
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)V")
    public static void method940(byte arg0) {
        if (arg0 == 53) {
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)I")
    public final int method643(boolean arg0) {
        ++field1698;
        if (arg0) {
            method939((byte) -47, (String) null);
        }
        return this.field1706.field5339;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Z")
    public final boolean method642(int arg0) {
        ++field1699;
        int var2 = 1 % ((77 - arg0) / 38);
        return this.field1706.method2297(-101);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lpi;I)V")
    public final void method941(class521 arg0, int arg1) {
        this.field1706.method2298(arg0, arg1 ^ 15890);
        ++field1707;
        if (arg1 != 618) {
            method943(61, (String) null, 37);
        }
    }

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "(I)I")
    public final int method246(int arg0) {
        if (arg0 > -104) {
            return -101;
        } else {
            ++field1701;
            return this.field1706.method2303((byte) 26);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILsf;Lha;BIIZ)V")
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field1713;
        if (arg3 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(ILha;)V")
    public final void method645(int arg0, class66 arg1) {
        this.field1706.method2294((byte) 94, arg1);
        ++field1696;
        int var3 = -119 / ((arg0 - -72) / 36);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
    public final int method650(int arg0) {
        int var2 = 3 / ((arg0 - 24) / 53);
        ++field1700;
        return this.field1706.field5354;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IC)Z")
    public static final boolean method942(int arg0, char arg1) {
        ++field1720;
        if (arg1 >= ' ' && ~arg1 >= -127) {
            return true;
        } else {
            if (arg0 >= -80) {
                field1709 = true;
            }
            if (~arg1 <= -161 && arg1 <= 255) {
                return true;
            } else {
                return ~arg1 == -8365 || arg1 == 338 || ~arg1 == -8213 || ~arg1 == -340 || arg1 == 376;
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
    public final int method646(byte arg0) {
        ++field1715;
        return arg0 != 45 ? -106 : this.field1706.field5323;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method943(int arg0, String arg1, int arg2) {
        if (arg2 != Integer.MIN_VALUE) {
            method943(-126, (String) null, 45);
        }
        ++field1723;
        class678 var3 = class630.method3597(29636, 2, (long) arg0);
        var3.method3834((byte) 93);
        var3.field9641 = arg1;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            method943(44, (String) null, -21);
        }
        while (~class636.field8961 < ~var1) {
            class472 var2 = class458.field6558[var1];
            if (var2.field6730 == 3) {
                if (var2.field6723 != null) {
                    class229.field3307.method3439(var2.field6723);
                } else {
                    var2.field6728 = Integer.MIN_VALUE;
                }
            }
            ++var1;
        }
        ++field1695;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)Z")
    public final boolean method248(byte arg0) {
        if (arg0 != -55) {
            return true;
        } else {
            ++field1721;
            return this.field1702;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lha;Ldja;IIIIIZII)V")
    public class130(class66 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4803);
        this.field1706 = new class371(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field1722 = arg1.field4761 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
    public final void method647(int arg0) {
        if (arg0 != 32653) {
            method944(false);
        }
        ++field1719;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILha;)V")
    public final void method651(int arg0, class66 arg1) {
        if (arg0 != -8836) {
            this.field1722 = false;
        }
        this.field1706.method2299(arg1, (byte) -94);
        ++field1717;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;I)V")
    public final void method257(class66 arg0, int arg1) {
        ++field1704;
        if (arg1 <= 60) {
            field1712 = null;
        }
        class495 var3 = this.field1706.method2292(true, arg0, 262144, true, 15514);
        if (var3 != null) {
            int var4 = super.field7718 >> 9;
            int var5 = super.field7719 >> 9;
            class378 var6 = arg0.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            this.field1706.method2300(var5, -122, var5, var4, arg0, var3, var6, false, var4);
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(B)Z")
    public final boolean method254(byte arg0) {
        if (arg0 != 104) {
            this.method240(5);
        }
        ++field1705;
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "(I)V")
    public final void method240(int arg0) {
        if (arg0 == -1) {
            ++field1697;
            throw new IllegalStateException();
        }
    }
}
