import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class98 extends class27 {

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Z")
    public static boolean field1601 = false;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1608 = " from your friend list first.";

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1604 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
    public static int[] field1612 = new int[14];

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field1613 = -1;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "[I")
    public static int[] field1616 = new int[100];

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Lsg;")
    public static class163 field1619;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static final void method720(int arg0) {
        ++field1603;
        class43.field802 = 0;
        class149.field2394 = 0;
        class39.method343(19515);
        class85.method625(true);
        if (arg0 >= -64) {
            field1615 = 109;
        }
        class8.method56(78);
        class55.method412(-115);
        for (int var1 = 0; ~var1 > ~class149.field2394; ++var1) {
            int var3 = class33.field522[var1];
            if (class222.field3682 != class35.field548[var3].field3376) {
                if (class35.field548[var3].field510 > 0) {
                    class167.method1148((byte) 54, class35.field548[var3]);
                }
                class35.field548[var3] = null;
            }
        }
        if (class115.field1912 != class67.field1103.field3655) {
            throw new RuntimeException("gpp1 pos:" + class67.field1103.field3655 + " psize:" + class115.field1912);
        } else {
            for (int var2 = 0; var2 < class155.field2514; ++var2) {
                if (class35.field548[class57.field973[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class155.field2514);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static final void method721(boolean arg0) {
        ++field1609;
        if (!arg0) {
            class193.field3095.method472((byte) -63);
            class227.field3757.method472((byte) -63);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)V")
    public final void method234(int arg0, byte arg1, int arg2) {
        ++field1600;
        int var4 = this.field1617 * arg0 >> 12;
        int var5 = this.field1610 * arg2 >> 12;
        int var6 = this.field1606 * arg0 >> 12;
        int var7 = this.field1607 * arg2 >> 12;
        if (arg1 >= -74) {
            this.field1607 = -30;
        }
        class122.method885(var6, var7, var4, super.field427, -77, var5);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IBI)V")
    public final void method238(int arg0, byte arg1, int arg2) {
        int var4 = this.field1610 * arg2 >> 12;
        ++field1605;
        int var5 = this.field1607 * arg2 >> 12;
        int var6 = this.field1617 * arg0 >> 12;
        int var7 = -6 / ((arg1 - -2) / 58);
        int var8 = this.field1606 * arg0 >> 12;
        class94.method701(super.field427, var5, var8, var6, super.field424, var4, false, super.field423);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V")
    public final void method236(int arg0, int arg1, byte arg2) {
        ++field1602;
        int var4 = 53 / ((33 - arg2) / 54);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZI)V")
    public static final void method722(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1616 = null;
        }
        class259 var3 = class213.method1464((byte) -102, arg2, 13);
        ++field1618;
        var3.method1766(0);
        var3.field4128 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILoi;ZLtg;IIIIIIII)Loi;")
    public static final class80 method723(int arg0, int arg1, int arg2, class80 arg3, boolean arg4, class181 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg2 << 48) + ((long) arg12 << 32) + (long) ((arg13 << 16) + arg7 - -(arg0 << 24));
        class80 var16 = (class80) class131.field2095.method480(var14, 103);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg7 == 1) {
                var18 = 9;
            } else if (arg7 == 2) {
                var18 = 12;
            } else if (~arg7 != -4) {
                if (arg7 == 4) {
                    var18 = 18;
                } else {
                    var18 = 21;
                }
            } else {
                var18 = 15;
            }
            class150 var19 = new class150(var17 * var18 + 1, var18 * 2 * var17 - var18, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int[][] var21 = new int[var17][var18];
            int var22 = var19.method1042(0, 0, 0);
            for (int var23 = 0; var23 < var17; ++var23) {
                int var30 = var20[var23];
                int var31 = var20[var23];
                for (int var32 = 0; ~var18 < ~var32; ++var32) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = class69.field1147[var33] * var30 + arg6 >> 16;
                    int var35 = class69.field1137[var33] * var31 + arg1 >> 16;
                    var21[var23][var32] = var19.method1042(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var24 > ~var17; ++var24) {
                int var25 = (var24 * 256 - -128) / var17;
                int var26 = -var25 + 256;
                byte var27 = (byte) (arg0 * var25 + arg13 * var26 >> 8);
                short var28 = (short) (((arg2 & 896) * var25 + (896 & arg12) * var26 & 229376) + (16515072 & (64512 & arg2) * var25 + (64512 & arg12) * var26) + ((arg2 & 127) * var25 + (127 & arg12) * var26 & 32512) >> 8);
                for (int var29 = 0; ~var29 > ~var18; ++var29) {
                    if (~var24 != -1) {
                        var19.method1026(var21[var24 - 1][var29], var21[var24 + -1][(var29 + 1) % var18], var21[var24][(var29 + 1) % var18], (byte) 1, var28, var27);
                        var19.method1026(var21[var24 + -1][var29], var21[var24][(var29 + 1) % var18], var21[var24][var29], (byte) 1, var28, var27);
                    } else {
                        var19.method1026(var22, var21[0][(var29 + 1) % var18], var21[0][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var19.method1034(64, 768, -50, -10, -50);
            class131.field2095.method474(var14, (byte) 82, var16);
        }
        ++field1611;
        int var36 = arg7 * 64 + -1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = arg3.method563();
        if (arg9 < 11) {
            return null;
        } else {
            int var41 = arg3.method580();
            int var42 = -var36;
            if (arg4) {
                if (arg8 > 1664 || arg8 < 384) {
                    var42 -= 128;
                }
                if (~arg8 < -641 && arg8 < 1408) {
                    var38 = var36 + 128;
                }
                if (~arg8 < -1153 && ~arg8 > -1921) {
                    var39 = var36 + 128;
                }
                if (~arg8 < -129 && arg8 < 896) {
                    var37 -= 128;
                }
            }
            if (~var40 > ~var37) {
                var40 = var37;
            }
            if (var39 < var41) {
                var41 = var39;
            }
            int var43 = arg3.method582();
            int var44 = arg3.method567();
            if (~var44 < ~var38) {
                var44 = var38;
            }
            class129 var45 = null;
            if (~var43 > ~var42) {
                var43 = var42;
            }
            if (arg5 != null) {
                int var46 = arg5.field2848[arg10];
                var45 = class186.method1264(var46 >> 16, true);
                arg10 = var46 & 65535;
            }
            class80 var47;
            if (var45 == null) {
                var47 = var16.method572(true, true, true);
                var47.method564((-var40 + var41) / 2, 128, (-var43 + var44) / 2);
                var47.method568((var40 - -var41) / 2, 0, (var43 - -var44) / 2);
            } else {
                var47 = var16.method572(!var45.method913(-110, arg10), !var45.method920(arg10, (byte) 103), true);
                var47.method564((var41 - var40) / 2, 128, (-var43 + var44) / 2);
                var47.method568((var40 + var41) / 2, 0, (var43 - -var44) / 2);
                var47.method558(var45, arg10);
            }
            if (arg8 != 0) {
                var47.method562(arg8);
            }
            class187 var48 = (class187) var47;
            if (arg11 != class225.method1583(arg1 + var43, arg6 + var40, class250.field3980, 0) || ~arg11 != ~class225.method1583(arg1 + var44, arg6 + var41, class250.field3980, 0)) {
                for (int var49 = 0; ~var49 > ~var48.field2961; ++var49) {
                    var48.field2984[var49] += class225.method1583(var48.field2972[var49] + arg1, var48.field2975[var49] + arg6, class250.field3980, 0) + -arg11;
                }
                var48.field2970 = false;
            }
            return var47;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIILf;III)V")
    public static final void method724(int arg0, int arg1, int arg2, int arg3, class36 arg4, int arg5, int arg6, int arg7) {
        if (class154.field2492) {
            class226.field3745 = 32;
        } else {
            class226.field3745 = 0;
        }
        class154.field2492 = false;
        ++field1614;
        if (class270.field4259 != 0) {
            if (arg0 >= arg2 && ~arg0 > ~(arg2 - -16) && arg6 <= arg3 && arg6 + 16 > arg3) {
                arg4.field571 -= 4;
                class280.method1886(arg4, 32);
            } else if (~arg0 <= ~arg2 && ~arg0 > ~(arg2 + 16) && ~arg3 <= ~(arg1 + arg6 + -16) && ~(arg1 + arg6) < ~arg3) {
                arg4.field571 += 4;
                class280.method1886(arg4, 32);
            } else if (~(arg2 - class226.field3745) >= ~arg0 && ~arg0 > ~(class226.field3745 + arg2 + 16) && ~arg3 <= ~(arg6 + 16) && arg3 < arg1 + arg6 - 16) {
                int var8 = (arg1 + -32) * arg1 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - 16 + -(var8 / 2) + -arg6;
                int var10 = arg1 + -32 - var8;
                arg4.field571 = (arg5 - arg1) * var9 / var10;
                class280.method1886(arg4, 32);
                class154.field2492 = true;
            }
        }
        if (arg7 != 8) {
            method720(59);
        }
        if (~class66.field1096 != -1) {
            int var11 = arg4.field642;
            if (~arg0 <= ~(-var11 + arg2) && arg6 <= arg3 && arg2 + 16 > arg0 && arg1 + arg6 >= arg3) {
                arg4.field571 += class66.field1096 * 45;
                class280.method1886(arg4, 32);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static void method725(int arg0) {
        field1612 = null;
        field1616 = null;
        field1604 = null;
        field1619 = null;
        field1608 = null;
        if (arg0 > -39) {
            field1613 = 71;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIIIII)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1606 = arg3;
        this.field1607 = arg0;
        this.field1617 = arg1;
        this.field1610 = arg2;
    }
}
