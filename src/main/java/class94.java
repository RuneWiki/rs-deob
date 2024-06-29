import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class94 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lhh;")
    public static class163 field1772 = class137.method1065("<col=ffb000>", 17);

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[S")
    public static short[] field1787 = new short[] { 5, 43, 25, 57, 21, 49, 3, 38 };

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lv;")
    public static class22 field1786;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[I")
    public static int[] field1782;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1781++;
        if (arg7 != -29 || arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
            return;
        }
        if (arg2 == 0) {
            class159 var8 = class17.method113(arg4, arg1, arg5);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field2920 >>> 32);
                if (arg0 == 2) {
                    var8.field2930 = new class3(var9, 2, arg6 + 4, arg4, arg1, arg5, arg3, false, var8.field2930);
                    var8.field2932 = new class3(var9, 2, arg6 + 1 & 0x3, arg4, arg1, arg5, arg3, false, var8.field2932);
                } else {
                    var8.field2930 = new class3(var9, arg0, arg6, arg4, arg1, arg5, arg3, false, var8.field2930);
                }
            }
        }
        if (arg2 == 1) {
            class93 var10 = class5.method39(arg4, arg1, arg5);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field1755 >>> 32);
                if (arg0 == 4 || arg0 == 5) {
                    var10.field1748 = new class3(var11, 4, arg6, arg4, arg1, arg5, arg3, false, var10.field1748);
                } else if (arg0 == 6) {
                    var10.field1748 = new class3(var11, 4, arg6 + 4, arg4, arg1, arg5, arg3, false, var10.field1748);
                } else if (arg0 == 7) {
                    var10.field1748 = new class3(var11, 4, (arg6 + 2 & 0x3) + 4, arg4, arg1, arg5, arg3, false, var10.field1748);
                } else if (arg0 == 8) {
                    var10.field1748 = new class3(var11, 4, arg6 + 4, arg4, arg1, arg5, arg3, false, var10.field1748);
                    var10.field1749 = new class3(var11, 4, (arg6 + 2 & 0x3) + 4, arg4, arg1, arg5, arg3, false, var10.field1749);
                }
            }
        }
        if (arg2 == 2) {
            if (arg0 == 11) {
                arg0 = 10;
            }
            class132 var12 = class48.method343(arg4, arg1, arg5);
            if (var12 != null) {
                var12.field2558 = new class3((int) (var12.field2568 >>> 32) & Integer.MAX_VALUE, arg0, arg6, arg4, arg1, arg5, arg3, false, var12.field2558);
            }
        }
        if (arg2 != 3) {
            return;
        }
        class211 var13 = class90.method692(arg4, arg1, arg5);
        if (var13 != null) {
            var13.field3828 = new class3(Integer.MAX_VALUE & (int) (var13.field3817 >>> 32), 22, arg6, arg4, arg1, arg5, arg3, false, var13.field3828);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILnk;II)V")
    public static final void method746(int arg0, class2 arg1, int arg2, int arg3) {
        field1783++;
        if (arg0 >= -116) {
            field1787 = null;
        }
        if (arg1.field3673 == arg2 && arg2 != -1) {
            class18 var4 = class212.method1511(arg2, -1);
            int var5 = var4.field277;
            if (var5 == 1) {
                arg1.field3665 = 0;
                arg1.field3622 = arg3;
                arg1.field3631 = 0;
                arg1.field3658 = 0;
                class222.method1571(arg1.field3658, arg1.field3615, arg1.field3633, (byte) 73, false, var4);
            }
            if (var5 == 2) {
                arg1.field3631 = 0;
            }
        } else if (arg2 == -1 || arg1.field3673 == -1 || class212.method1511(arg2, -1).field273 >= class212.method1511(arg1.field3673, -1).field273) {
            arg1.field3622 = arg3;
            arg1.field3617 = arg1.field3653;
            arg1.field3673 = arg2;
            arg1.field3658 = 0;
            arg1.field3631 = 0;
            arg1.field3665 = 0;
            if (arg1.field3673 == -1) {
                return;
            }
            class222.method1571(arg1.field3658, arg1.field3615, arg1.field3633, (byte) 125, false, class212.method1511(arg1.field3673, -1));
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method747(byte arg0) {
        int var1 = 65 / ((26 - arg0) / 45);
        field1782 = null;
        field1786 = null;
        field1772 = null;
        field1787 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public abstract void method748(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    public static final void method749(boolean arg0, int arg1) {
        class175.field3192 = -1;
        if (!arg0) {
            class201.field3611 = arg1;
            class175.field3192 = -1;
            field1770++;
            class227.method1583((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[BI[Lcg;IIZIB)V")
    public static final void method750(int arg0, int arg1, int arg2, byte[] arg3, int arg4, class1[] arg5, int arg6, int arg7, boolean arg8, int arg9, byte arg10) {
        class81 var11 = new class81(arg3);
        int var12 = -1;
        field1776++;
        if (arg10 != 119) {
            return;
        }
        while (true) {
            int var13 = var11.method612(true);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method636(arg10 - 73);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method622(true);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var18 && arg1 <= var16 && var16 < (arg1 + 8) && var17 >= arg7 && (arg7 + 8) > var17) {
                    class35 var22 = class9.method64(false, var12);
                    int var23 = arg2 + class186.method1373(var16 & 0x7, var22.field574, var21, arg4, var17 & 0x7, var22.field591, (byte) 62);
                    int var24 = class113.method901(var22.field574, var21, arg4, var17 & 0x7, var22.field591, (byte) 106, var16 & 0x7) + arg9;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class1 var25 = null;
                        if (!arg8) {
                            int var26 = arg6;
                            if ((class123.field2344[1][var23][var24] & 0x2) == 2) {
                                var26 = arg6 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class218.method1549(arg8, true, arg4 + var21 & 0x3, var12, var25, var24, var23, !arg8, arg6, arg6, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public abstract void method751(int arg0, int arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIILqh;)V")
    public static final void method752(boolean arg0, int arg1, int arg2, class69 arg3) {
        field1778++;
        if (class109.field2063 != null || class130.field2530 || arg3 == null || class190.method1397(-117, arg3) == null) {
            return;
        }
        class109.field2063 = arg3;
        class144.field2730 = class190.method1397(-116, arg3);
        if (arg0) {
            class212.field3866 = false;
            class122.field2317 = 0;
            class4.field88 = arg2;
            class204.field3699 = arg1;
        }
    }
}
