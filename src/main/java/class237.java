import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class237 extends class134 {

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field3748 = -1;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "[I")
    public static int[] field3762;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLpd;)V")
    public static final void method1641(boolean arg0, class58 arg1) {
        if (class4.field32 == arg1.field845 || arg1.field853 == -1 || arg1.field883 != 0 || arg1.field873 + 1 > class196.method1359(arg1.field853, (byte) 21).field3168[arg1.field813]) {
            int var2 = class4.field32 - arg1.field812;
            int var3 = arg1.field845 - arg1.field812;
            int var4 = arg1.field806 * 128 + (arg1.method362(25892) * 64);
            int var5 = arg1.field865 * 128 + (arg1.method362(25892) * 64);
            int var6 = arg1.field888 * 128 + arg1.method362(25892) * 64;
            int var7 = arg1.field868 * 128 + (arg1.method362(25892) * 64);
            arg1.field850 = ((var3 - var2) * var5 + var2 * var7) / var3;
            arg1.field836 = ((var3 - var2) * var4 + (var2 * var6)) / var3;
        }
        arg1.field878 = 0;
        if (arg1.field861 == 0) {
            arg1.field802 = 1024;
        }
        field3750++;
        if (arg1.field861 == 1) {
            arg1.field802 = 1536;
        }
        if (arg1.field861 == 2) {
            arg1.field802 = 0;
        }
        if (!arg0) {
            field3762 = null;
        }
        if (arg1.field861 == 3) {
            arg1.field802 = 512;
        }
        arg1.field855 = arg1.field802;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B[B)Lde;")
    public static final class116 method1642(byte arg0, byte[] arg1) {
        field3757++;
        if (arg0 != 101) {
            method1641(false, (class58) null);
        }
        if (arg1 == null) {
            return null;
        } else {
            class222 var2 = new class222(arg1, class239.field3781, class272.field4457, class184.field2854, class263.field4341, class56.field758);
            class270.method1856(-41);
            return var2;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 >= -12) {
            field3762 = null;
        }
        field3756++;
        if (class235.method1632(112, arg4)) {
            class209.method1484(arg5, arg8, arg3, arg2, class283.field4741[arg4], 21, arg6, -1, arg1, arg0);
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class283.field4731[var9] = true;
            }
        } else {
            class283.field4731[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Z")
    public final boolean method1644(int arg0) {
        int var2 = -46 / ((arg0 - 55) / 48);
        field3766++;
        return ((this.field3765 & 0x3F5AD4) >> 21) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method1645(byte arg0) {
        if (arg0 < 114) {
            field3762 = null;
        }
        field3762 = null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
    public final int method1646(byte arg0) {
        int var2 = -88 % ((arg0 - 68) / 49);
        field3767++;
        return class119.method775((byte) 99, this.field3765);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Z")
    public final boolean method1647(byte arg0, int arg1) {
        if (arg0 >= -21) {
            this.field3758 = -55;
        }
        field3760++;
        return (this.field3765 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)Z")
    public final boolean method1648(byte arg0) {
        if (arg0 != -40) {
            field3752 = -23;
        }
        field3763++;
        return ((this.field3765 & 0x45262DAF) >> 30) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(CB)Z")
    public static final boolean method1649(char arg0, byte arg1) {
        field3764++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class79.method525((byte) -97, arg0)) {
            return true;
        } else if (arg1 < 60) {
            return false;
        } else {
            char[] var2 = class68.field997;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class310.field5020;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)Z")
    public final boolean method1650(byte arg0) {
        field3754++;
        if (arg0 != -110) {
            this.method1646((byte) 52);
        }
        return (this.field3765 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)Z")
    public final boolean method1651(int arg0) {
        if (arg0 != 1) {
            field3752 = 22;
        }
        field3751++;
        return (this.field3765 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Z")
    public final boolean method1652(int arg0) {
        field3753++;
        if (arg0 < 107) {
            return false;
        } else {
            return (this.field3765 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!im", name = "g", descriptor = "(I)Z")
    public final boolean method1653(int arg0) {
        field3755++;
        if (arg0 > -66) {
            return true;
        } else {
            return (this.field3765 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!im", name = "h", descriptor = "(I)Z")
    public final boolean method1654(int arg0) {
        field3761++;
        if (arg0 != 22672) {
            method1643(-79, 101, 61, 125, -55, -46, 48, -93, -75);
        }
        return (this.field3765 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!im", name = "i", descriptor = "(I)I")
    public final int method1655(int arg0) {
        int var2 = 84 / ((-arg0 - 51) / 33);
        field3759++;
        return (this.field3765 & 0x1F9529) >> 18;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZZI)V")
    public static final void method1656(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field3749++;
        if (arg0 == 11701) {
            class306.method2093((byte) -83, arg2, arg3, class276.field4576.length - 1, 0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II)V")
    public class237(int arg0, int arg1) {
        this.field3758 = arg1;
        this.field3765 = arg0;
    }
}
