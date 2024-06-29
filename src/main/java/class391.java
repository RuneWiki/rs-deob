import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class391 {

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5758 = null;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "[I")
    public static int[] field5763 = new int[25];

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Lfs;")
    public static class387 field5757;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)I")
    public static final int method2398(int arg0, int arg1, int arg2) {
        field5762++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != -1669) {
            method2400(-116, true, 37, -7, -107);
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZLr;)V")
    public static final void method2399(int arg0, boolean arg1, class121 arg2) {
        field5760++;
        class531 var3 = arg2.method969(-1);
        if (arg2.field1779 == 0) {
            class247.field3665 = -1;
            class369.field5488 = 0;
            arg2.field1775 = 0;
            return;
        }
        if (arg2.field1696 != -1 && arg2.field1729 == 0) {
            class267 var4 = class153.field2169.method1585(3, arg2.field1696);
            if (arg2.field1783 > 0 && var4.field3922 == 0) {
                arg2.field1775++;
                class369.field5488 = 0;
                class247.field3665 = -1;
                return;
            }
            if (arg2.field1783 <= 0 && var4.field3936 == 0) {
                arg2.field1775++;
                class247.field3665 = -1;
                class369.field5488 = 0;
                return;
            }
        }
        if (arg2.field1707 != -1 && arg2.field1741 <= class263.field3867) {
            class330 var5 = class151.field2145.method2115(-137, arg2.field1707);
            if (var5.field4606 && var5.field4611 != -1) {
                class267 var6 = class153.field2169.method1585(3, var5.field4611);
                if (arg2.field1783 > 0 && var6.field3922 == 0) {
                    class369.field5488 = 0;
                    class247.field3665 = -1;
                    arg2.field1775++;
                    return;
                }
                if (arg2.field1783 <= 0 && var6.field3936 == 0) {
                    class369.field5488 = 0;
                    class247.field3665 = -1;
                    arg2.field1775++;
                    return;
                }
            }
        }
        if (arg2.field1707 != -1 && arg2.field1741 <= class263.field3867) {
            class330 var7 = class151.field2145.method2115(-137, arg2.field1707);
            if (var7.field4606 && var7.field4611 != -1) {
                class267 var8 = class153.field2169.method1585(3, var7.field4611);
                if (arg2.field1783 > 0 && var8.field3922 == 0) {
                    class247.field3665 = -1;
                    arg2.field1775++;
                    class369.field5488 = 0;
                    return;
                }
                if (arg2.field1783 <= 0 && var8.field3936 == 0) {
                    arg2.field1775++;
                    class247.field3665 = -1;
                    class369.field5488 = 0;
                    return;
                }
            }
        }
        int var9 = arg2.field6335;
        int var10 = arg2.field6334;
        int var11 = arg2.field1777[arg2.field1779 - 1] * 128 + arg2.method963((byte) 127) * 64;
        int var12 = arg2.field1778[arg2.field1779 - 1] * 128 + (arg2.method963((byte) 127) * 64);
        if (var11 > var9) {
            if (var12 > var10) {
                arg2.method955(10240, false);
            } else if (var10 <= var12) {
                arg2.method955(12288, false);
            } else {
                arg2.method955(14336, false);
            }
        } else if (var11 >= var9) {
            if (var10 < var12) {
                arg2.method955(8192, false);
            } else if (var10 > var12) {
                arg2.method955(0, false);
            }
        } else if (var12 > var10) {
            arg2.method955(6144, false);
        } else if (var10 <= var12) {
            arg2.method955(4096, false);
        } else {
            arg2.method955(2048, false);
        }
        byte var13 = arg2.field1782[arg2.field1779 - 1];
        if (!arg1 && ((var11 - var9) > 256 || var11 - var9 < -256 || (var12 - var10) > 256 || (var12 - var10) < -256)) {
            arg2.field6335 = var11;
            arg2.field6334 = var12;
            arg2.method957(113, arg2.field1748);
            if (arg2.field1783 > 0) {
                arg2.field1783--;
            }
            class247.field3665 = -1;
            class369.field5488 = 0;
            arg2.field1779--;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg2 instanceof class461) {
            var15 = ((class461) arg2).field6790.field1388;
        }
        if (var15) {
            int var16 = arg2.field1748 - arg2.field1718.field4545;
            if (var16 != 0 && arg2.field1713 == -1 && arg2.field1767 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg2.field1779 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg2.field1779 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg2.field1779 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg2.field1779 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field1775 > 0 && arg2.field1779 > 1) {
            var14 = 8;
            arg2.field1775--;
        }
        if (arg0 >= -39) {
            field5758 = null;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field7780 != -1) {
            int var17 = var14 << 7;
            if (arg2.field1779 == 1) {
                int var18 = arg2.field1784 * arg2.field1784;
                int var19 = (var11 >= arg2.field6335 ? var11 - arg2.field6335 : arg2.field6335 - var11) << 7;
                int var20 = (arg2.field6334 > var12 ? arg2.field6334 - var12 : -arg2.field6334 + var12) << 7;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field7780 * 2 * var21;
                if (var22 < var18) {
                    arg2.field1784 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg2.field1784 -= var3.field7780;
                    if (arg2.field1784 < 0) {
                        arg2.field1784 = 0;
                    }
                } else if (arg2.field1784 < var17) {
                    arg2.field1784 += var3.field7780;
                    if (var17 < arg2.field1784) {
                        arg2.field1784 = var17;
                    }
                }
            } else if (arg2.field1784 < var17) {
                arg2.field1784 += var3.field7780;
                if (var17 < arg2.field1784) {
                    arg2.field1784 = var17;
                }
            } else if (arg2.field1784 > 0) {
                arg2.field1784 -= var3.field7780;
                if (arg2.field1784 < 0) {
                    arg2.field1784 = 0;
                }
            }
            var14 = arg2.field1784 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class369.field5488 = 0;
        if (var9 < var11) {
            arg2.field6335 += var14;
            class369.field5488 |= 0x4;
            if (arg2.field6335 > var11) {
                arg2.field6335 = var11;
            }
        } else if (var11 < var9) {
            arg2.field6335 -= var14;
            class369.field5488 |= 0x8;
            if (var11 > arg2.field6335) {
                arg2.field6335 = var11;
            }
        }
        if (var12 > var10) {
            arg2.field6334 += var14;
            class369.field5488 |= 0x1;
            if (var12 < arg2.field6334) {
                arg2.field6334 = var12;
            }
        } else if (var12 < var10) {
            arg2.field6334 -= var14;
            class369.field5488 |= 0x2;
            if (arg2.field6334 < var12) {
                arg2.field6334 = var12;
            }
        }
        if (arg2.field6335 == var11 && arg2.field6334 == var12) {
            arg2.field1779--;
            if (arg2.field1783 > 0) {
                arg2.field1783--;
            }
        }
        if (var14 >= 8) {
            class247.field3665 = 2;
        } else {
            class247.field3665 = var13;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZIII)V")
    public static final void method2400(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5761++;
        if (class518.method3081(arg0 ^ 0x5C, arg3)) {
            class176.method1233(arg4, arg2, class123.field1803[arg3], 22611, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
    public static final int method2401(int arg0) {
        field5759++;
        if (arg0 >= -101) {
            method2400(55, true, 36, -16, 68);
        }
        return 2;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static void method2402(byte arg0) {
        if (arg0 <= 37) {
            method2399(-47, false, null);
        }
        field5763 = null;
        field5757 = null;
        field5758 = null;
    }
}
