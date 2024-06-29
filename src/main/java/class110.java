import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class110 extends class206 {

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
    private int[] field1790;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[Lee;")
    public class72[] field1779;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[S")
    public short[] field1775;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "[B")
    public byte[] field1778;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[B")
    public byte[] field1781;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "[B")
    public byte[] field1784;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "[Ljf;")
    public class9[] field1777;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lsk;")
    public static class199 field1774 = new class199(64);

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Lmh;")
    private static class62 field1787 = class201.method1405(true, "glow2:");

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Lmh;")
    public static class62 field1789 = field1787;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Lmh;")
    private static class62 field1791 = class201.method1405(true, "Loaded config");

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Lmh;")
    public static class62 field1786 = field1791;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Lmh;")
    public static class62 field1785 = field1787;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[Lfd;")
    public static class61[] field1788;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Lta;", line = 6)
    public static final class200 method843(byte arg0, int arg1) {
        field1776++;
        if (arg0 >= -44) {
            return (class200) null;
        }
        class200 var2 = (class200) class184.field2941.method1396(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field701.method157(arg1, 16, (byte) 19);
        class200 var4 = new class200();
        if (var3 != null) {
            var4.method1403(new class92(var3), (byte) -87);
        }
        class184.field2941.method1397((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 35)
    public static void method844(boolean arg0) {
        field1785 = null;
        field1787 = null;
        field1774 = null;
        field1788 = null;
        field1791 = null;
        if (arg0) {
            method846(34, 25, 28, 17, 78, -126, (class123) null, 41, 110L);
        }
        field1789 = null;
        field1786 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BI[ILdd;)Z", line = 58)
    public final boolean method845(byte[] arg0, int arg1, int[] arg2, class75 arg3) {
        field1780++;
        boolean var5 = true;
        if (arg1 != 24323) {
            return false;
        }
        class9 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1790[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method568(arg2, var9 >> 2, (byte) 75);
                        } else {
                            var6 = arg3.method564((byte) 76, arg2, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1777[var8] = var6;
                        this.field1790[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIILjm;IJ)Z", line = 118)
    private static final boolean method846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class123 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class134.method1011(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIBZLwc;Z)V", line = 141)
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, boolean arg8, class218 arg9, boolean arg10) {
        field1783++;
        if (arg10 && !class149.method1073((byte) -92) && (class42.field641[0][arg0][arg3] & 0x2) == 0) {
            if ((class42.field641[arg2][arg0][arg3] & 0x10) != 0) {
                return;
            }
            if (class281.method1918(arg2, (byte) 95, arg0, arg3) != class190.field3028) {
                return;
            }
        }
        if (class169.field2737 > arg2) {
            class169.field2737 = arg2;
        }
        class216 var11 = class252.method1755(arg1, (byte) -111);
        if (var11.field3710) {
            return;
        }
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var11.field3669;
            var13 = var11.field3676;
        } else {
            var12 = var11.field3676;
            var13 = var11.field3669;
        }
        int var14;
        int var15;
        if ((arg0 + var13) > 104) {
            var14 = arg0 + 1;
            var15 = arg0;
        } else {
            var15 = (var13 >> 1) + arg0;
            var14 = (var13 + 1 >> 1) + arg0;
        }
        int[][] var16 = class37.field569[arg4];
        int var17;
        int var18;
        if ((arg3 + var12) > 104) {
            var17 = arg3 + 1;
            var18 = arg3;
        } else {
            var17 = (var12 + 1 >> 1) + arg3;
            var18 = arg3 + (var12 >> 1);
        }
        int var19 = var16[var14][var18] + var16[var15][var18] + var16[var14][var17] + var16[var15][var17] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = (arg0 << 7) + (var13 << 6);
        int var22 = 0;
        if (arg4 != 0) {
            int[][] var23 = class37.field569[0];
            var22 = var19 - (var23[var15][var17] + var23[var15][var18] + var23[var14][var18] + var23[var14][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg8) {
            var24 = class72.field1106[0];
        } else if (arg4 < 3) {
            var24 = class37.field569[arg4 + 1];
        }
        long var25 = (long) (arg6 | 0x400 << 20 | arg3 << 7 | arg0 | arg5 << 14);
        if (var11.field3732 == 0 || arg8) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field3661 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field3713) {
            var25 |= 0x80000000L;
        }
        if (var11.method1539(-121)) {
            class271.method1857(var11, (class153) null, arg2, arg0, 114, arg6, arg3, (class204) null);
        }
        long var27 = var25 | (long) arg1 << 32;
        boolean var29 = !arg8 & var11.field3716;
        if (arg5 == 22) {
            if (class276.field4733 || var11.field3732 != 0 || var11.field3706 == 1 || var11.field3691) {
                class123 var77;
                if (var11.field3701 == -1 && var11.field3709 == null) {
                    class291 var76 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -73, var19, arg10, 22);
                    if (var29) {
                        class168.method1202(var76.field4937, var21, var22, var20);
                    }
                    var77 = var76.field4947;
                } else {
                    var77 = new class265(arg1, 22, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
                }
                class2.method10(arg2, arg0, arg3, var19, var77, var27, var11.field3677);
                if (var11.field3706 == 1 && arg9 != null) {
                    arg9.method1557(arg0, 262144, arg3);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class123 var71;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var70 = var11.method1534((class61) null, var24, arg5 == 11 ? arg6 + 4 : arg6, var20, var16, var21, var29, (byte) -110, var19, arg10, 10);
                if (var29) {
                    class168.method1202(var70.field4937, var21, var22, var20);
                }
                var71 = var70.field4947;
            } else {
                var71 = new class265(arg1, 10, arg5 == 11 ? arg6 + 4 : arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            if (var71 != null) {
                boolean var72 = method846(arg2, arg0, arg3, var19, var13, var12, var71, 0, var27);
                if (var11.field3730 && var72 && arg10) {
                    int var73 = 15;
                    if (var71 instanceof class138) {
                        var73 = ((class138) var71).method489() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class72.field1110[arg2][arg0 + var74][arg3 + var75] < var73) {
                                class72.field1110[arg2][arg0 + var74][arg3 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1554(arg0, -1, var11.field3695, var12, var13, arg3);
            }
        } else if (arg5 >= 12) {
            class123 var69;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var68 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -113, var19, arg10, arg5);
                if (var29) {
                    class168.method1202(var68.field4937, var21, var22, var20);
                }
                var69 = var68.field4947;
            } else {
                var69 = new class265(arg1, arg5, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            method846(arg2, arg0, arg3, var19, 1, 1, var69, 0, var27);
            if (arg10 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0) {
                class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 4);
            }
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1554(arg0, -1, var11.field3695, var12, var13, arg3);
            }
        } else if (arg5 == 0) {
            class123 var31;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var30 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -97, var19, arg10, 0);
                if (var29) {
                    class168.method1202(var30.field4937, var21, var22, var20);
                }
                var31 = var30.field4947;
            } else {
                var31 = new class265(arg1, 0, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            method850(arg2, arg0, arg3, var19, var31, (class123) null, class161.field2601[arg6], 0, var27);
            if (arg10) {
                if (arg6 == 0) {
                    if (var11.field3730) {
                        class72.field1110[arg2][arg0][arg3] = 50;
                        class72.field1110[arg2][arg0][arg3 + 1] = 50;
                    }
                    if (var11.field3724) {
                        class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 1);
                    }
                } else if (arg6 == 1) {
                    if (var11.field3730) {
                        class72.field1110[arg2][arg0][arg3 + 1] = 50;
                        class72.field1110[arg2][arg0 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field3724) {
                        class143.field2283[arg2][arg0][arg3 + 1] = class270.method1854(class143.field2283[arg2][arg0][arg3 + 1], 2);
                    }
                } else if (arg6 == 2) {
                    if (var11.field3730) {
                        class72.field1110[arg2][arg0 + 1][arg3] = 50;
                        class72.field1110[arg2][arg0 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field3724) {
                        class143.field2283[arg2][arg0 + 1][arg3] = class270.method1854(class143.field2283[arg2][arg0 + 1][arg3], 1);
                    }
                } else if (arg6 == 3) {
                    if (var11.field3730) {
                        class72.field1110[arg2][arg0][arg3] = 50;
                        class72.field1110[arg2][arg0 + 1][arg3] = 50;
                    }
                    if (var11.field3724) {
                        class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 2);
                    }
                }
            }
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1551(arg6, var11.field3695, arg5, (byte) -22, arg3, arg0);
            }
            if (var11.field3697 != 16) {
                class218.method1544(arg2, arg0, arg3, var11.field3697);
            }
        } else if (arg5 == 1) {
            class123 var67;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var66 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -81, var19, arg10, 1);
                if (var29) {
                    class168.method1202(var66.field4937, var21, var22, var20);
                }
                var67 = var66.field4947;
            } else {
                var67 = new class265(arg1, 1, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            method850(arg2, arg0, arg3, var19, var67, (class123) null, class151.field2391[arg6], 0, var27);
            if (var11.field3730 && arg10) {
                if (arg6 == 0) {
                    class72.field1110[arg2][arg0][arg3 + 1] = 50;
                } else if (arg6 == 1) {
                    class72.field1110[arg2][arg0 + 1][arg3 + 1] = 50;
                } else if (arg6 == 2) {
                    class72.field1110[arg2][arg0 + 1][arg3] = 50;
                } else if (arg6 == 3) {
                    class72.field1110[arg2][arg0][arg3] = 50;
                }
            }
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1551(arg6, var11.field3695, arg5, (byte) -22, arg3, arg0);
            }
        } else if (arg5 == 2) {
            int var61 = arg6 + 1 & 0x3;
            class123 var63;
            class123 var65;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var62 = var11.method1534((class61) null, var24, arg6 + 4, var20, var16, var21, var29, (byte) -98, var19, arg10, 2);
                if (var29) {
                    class168.method1202(var62.field4937, var21, var22, var20);
                }
                var63 = var62.field4947;
                class291 var64 = var11.method1534((class61) null, var24, var61, var20, var16, var21, var29, (byte) -97, var19, arg10, 2);
                if (var29) {
                    class168.method1202(var64.field4937, var21, var22, var20);
                }
                var65 = var64.field4947;
            } else {
                var63 = new class265(arg1, 2, arg6 + 4, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
                var65 = new class265(arg1, 2, var61, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            method850(arg2, arg0, arg3, var19, var63, var65, class161.field2601[arg6], class161.field2601[var61], var27);
            if (var11.field3724 && arg10) {
                if (arg6 == 0) {
                    class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 1);
                    class143.field2283[arg2][arg0][arg3 + 1] = class270.method1854(class143.field2283[arg2][arg0][arg3 + 1], 2);
                } else if (arg6 == 1) {
                    class143.field2283[arg2][arg0][arg3 + 1] = class270.method1854(class143.field2283[arg2][arg0][arg3 + 1], 2);
                    class143.field2283[arg2][arg0 + 1][arg3] = class270.method1854(class143.field2283[arg2][arg0 + 1][arg3], 1);
                } else if (arg6 == 2) {
                    class143.field2283[arg2][arg0 + 1][arg3] = class270.method1854(class143.field2283[arg2][arg0 + 1][arg3], 1);
                    class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 2);
                } else if (arg6 == 3) {
                    class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 2);
                    class143.field2283[arg2][arg0][arg3] = class270.method1854(class143.field2283[arg2][arg0][arg3], 1);
                }
            }
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1551(arg6, var11.field3695, arg5, (byte) -22, arg3, arg0);
            }
            if (var11.field3697 != 16) {
                class218.method1544(arg2, arg0, arg3, var11.field3697);
            }
        } else if (arg5 == 3) {
            class123 var60;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var59 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -102, var19, arg10, 3);
                if (var29) {
                    class168.method1202(var59.field4937, var21, var22, var20);
                }
                var60 = var59.field4947;
            } else {
                var60 = new class265(arg1, 3, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            method850(arg2, arg0, arg3, var19, var60, (class123) null, class151.field2391[arg6], 0, var27);
            if (var11.field3730 && arg10) {
                if (arg6 == 0) {
                    class72.field1110[arg2][arg0][arg3 + 1] = 50;
                } else if (arg6 == 1) {
                    class72.field1110[arg2][arg0 + 1][arg3 + 1] = 50;
                } else if (arg6 == 2) {
                    class72.field1110[arg2][arg0 + 1][arg3] = 50;
                } else if (arg6 == 3) {
                    class72.field1110[arg2][arg0][arg3] = 50;
                }
            }
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1551(arg6, var11.field3695, arg5, (byte) -22, arg3, arg0);
            }
        } else if (arg5 == 9) {
            class123 var58;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var57 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -102, var19, arg10, arg5);
                if (var29) {
                    class168.method1202(var57.field4937, var21, var22, var20);
                }
                var58 = var57.field4947;
            } else {
                var58 = new class265(arg1, arg5, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            method846(arg2, arg0, arg3, var19, 1, 1, var58, 0, var27);
            if (var11.field3706 != 0 && arg9 != null) {
                arg9.method1554(arg0, -1, var11.field3695, var12, var13, arg3);
            }
            if (var11.field3697 != 16) {
                class218.method1544(arg2, arg0, arg3, var11.field3697);
            }
        } else if (arg5 == 4) {
            class123 var33;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var32 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -112, var19, arg10, 4);
                if (var29) {
                    class168.method1202(var32.field4937, var21, var22, var20);
                }
                var33 = var32.field4947;
            } else {
                var33 = new class265(arg1, 4, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            class163.method1177(arg2, arg0, arg3, var19, var33, (class123) null, class161.field2601[arg6], 0, 0, 0, var27);
        } else if (arg5 == 5) {
            int var34 = 16;
            long var35 = class150.method1080(arg2, arg0, arg3);
            if (var35 != 0L) {
                var34 = class252.method1755(Integer.MAX_VALUE & (int) (var35 >>> 32), (byte) -110).field3697;
            }
            class123 var38;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var37 = var11.method1534((class61) null, var24, arg6, var20, var16, var21, var29, (byte) -97, var19, arg10, 4);
                if (var29) {
                    class168.method1202(var37.field4937, var21 - class118.field1966[arg6] * 8, var22, var20 - (class87.field1395[arg6] * 8));
                }
                var38 = var37.field4947;
            } else {
                var38 = new class265(arg1, 4, arg6, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            class163.method1177(arg2, arg0, arg3, var19, var38, (class123) null, class161.field2601[arg6], 0, class118.field1966[arg6] * var34, class87.field1395[arg6] * var34, var27);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = class150.method1080(arg2, arg0, arg3);
            if (var40 != 0L) {
                var39 = class252.method1755(Integer.MAX_VALUE & (int) (var40 >>> 32), (byte) -78).field3697 / 2;
            }
            class123 var43;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var42 = var11.method1534((class61) null, var24, arg6 + 4, var20, var16, var21, var29, (byte) -118, var19, arg10, 4);
                if (var29) {
                    class168.method1202(var42.field4937, var21 - (class262.field4398[arg6] * 8), var22, var20 - (class192.field3237[arg6] * 8));
                }
                var43 = var42.field4947;
            } else {
                var43 = new class265(arg1, 4, arg6 + 4, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            class163.method1177(arg2, arg0, arg3, var19, var43, (class123) null, 256, arg6, class262.field4398[arg6] * var39, class192.field3237[arg6] * var39, var27);
        } else if (arg5 == 7) {
            int var54 = arg6 + 2 & 0x3;
            class123 var56;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                class291 var55 = var11.method1534((class61) null, var24, var54 + 4, var20, var16, var21, var29, (byte) -101, var19, arg10, 4);
                if (var29) {
                    class168.method1202(var55.field4937, var21, var22, var20);
                }
                var56 = var55.field4947;
            } else {
                var56 = new class265(arg1, 4, var54 + 4, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            class163.method1177(arg2, arg0, arg3, var19, var56, (class123) null, 256, var54, 0, 0, var27);
        } else if (arg7 >= 120 && arg5 == 8) {
            long var44 = class150.method1080(arg2, arg0, arg3);
            int var46 = 8;
            if (var44 != 0L) {
                var46 = class252.method1755(Integer.MAX_VALUE & (int) (var44 >>> 32), (byte) -121).field3697 / 2;
            }
            int var47 = arg6 + 2 & 0x3;
            class123 var51;
            class123 var53;
            if (var11.field3701 == -1 && var11.field3709 == null) {
                int var48 = class262.field4398[arg6] * 8;
                int var49 = class192.field3237[arg6] * 8;
                class291 var50 = var11.method1534((class61) null, var24, arg6 + 4, var20, var16, var21, var29, (byte) -118, var19, arg10, 4);
                if (var29) {
                    class168.method1202(var50.field4937, var21 - var48, var22, var20 - var49);
                }
                var51 = var50.field4947;
                class291 var52 = var11.method1534((class61) null, var24, var47 + 4, var20, var16, var21, var29, (byte) -81, var19, arg10, 4);
                if (var29) {
                    class168.method1202(var52.field4937, var21 - var48, var22, var20 - var49);
                }
                var53 = var52.field4947;
            } else {
                var51 = new class265(arg1, 4, arg6 + 4, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
                var53 = new class265(arg1, 4, var47 + 4, arg4, arg0, arg3, var11.field3701, var11.field3715, (class123) null);
            }
            class163.method1177(arg2, arg0, arg3, var19, var51, var53, 256, arg6, class262.field4398[arg6] * var46, class192.field3237[arg6] * var46, var27);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 803)
    public final void method848(int arg0) {
        this.field1790 = null;
        field1772++;
        if (arg0 != 6085) {
            this.field1777 = (class9[]) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 814)
    public static final byte[] method849(Object arg0, boolean arg1, boolean arg2) {
        field1771++;
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class81.method626(var4, (byte) 69) : var4;
        } else if (arg0 instanceof class115) {
            class115 var3 = (class115) arg0;
            return var3.method28(0);
        } else {
            if (arg2) {
                method846(-35, -72, -76, 14, 94, 37, (class123) null, 107, -120L);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIILjm;Ljm;IIJ)V", line = 856)
    private static final void method850(int arg0, int arg1, int arg2, int arg3, class123 arg4, class123 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class54 var10 = new class54();
        var10.field787 = arg8;
        var10.field793 = arg1 * 128 + 64;
        var10.field784 = arg2 * 128 + 64;
        var10.field796 = arg3;
        var10.field786 = arg4;
        var10.field788 = arg5;
        var10.field789 = arg6;
        var10.field790 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class256.field4320[var11][arg1][arg2] == null) {
                class256.field4320[var11][arg1][arg2] = new class166(var11, arg1, arg2);
            }
        }
        class256.field4320[arg0][arg1][arg2].field2706 = var10;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 894)
    public class110() {
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "([B)V", line = 896)
    public class110(byte[] arg0) {
        this.field1790 = new int[128];
        this.field1779 = new class72[128];
        this.field1775 = new short[128];
        this.field1778 = new byte[128];
        this.field1781 = new byte[128];
        this.field1784 = new byte[128];
        int var2 = 0;
        this.field1777 = new class9[128];
        class92 var3 = new class92(arg0);
        while (var3.field1495[var3.field1476 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method743((byte) 29);
        }
        var3.field1476++;
        var2++;
        int var6 = 0;
        int var7 = var3.field1476;
        var3.field1476 += var2;
        while (var3.field1495[var3.field1476 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method743((byte) 45);
        }
        var6++;
        var3.field1476++;
        int var10 = 0;
        int var11 = var3.field1476;
        var3.field1476 += var6;
        while (var3.field1495[var3.field1476 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method743((byte) 69);
        }
        var10++;
        var3.field1476++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method702(-1);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class72[] var19 = new class72[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class72 var21 = var19[var20] = new class72();
            int var22 = var3.method702(-1);
            if (var22 > 0) {
                var21.field1104 = new byte[var22 * 2];
            }
            int var23 = var3.method702(-1);
            if (var23 > 0) {
                var21.field1092 = new byte[var23 * 2 + 2];
                var21.field1092[1] = 64;
            }
        }
        int var24 = var3.method702(-1);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = 0;
        int var27 = var3.method702(-1);
        byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
        while (var3.field1495[var3.field1476 + var26] != 0) {
            var26++;
        }
        byte[] var29 = new byte[var26];
        for (int var30 = 0; var30 < var26; var30++) {
            var29[var30] = var3.method743((byte) 70);
        }
        var26++;
        int var31 = 0;
        var3.field1476++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method702(-1);
            this.field1775[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method702(-1);
            this.field1775[var34] = (short) (this.field1775[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var36) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method742(-128);
            }
            var35--;
            this.field1775[var38] = (short) (this.field1775[var38] + class234.method1648(var37 - 1 << 14, 32768));
            this.field1790[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1790[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field1495[var7++] - 1;
                    if (var4.length > var39) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field1784[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1790[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field1495[var11++] + 16 << 2;
                    if (var8.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                var44--;
                this.field1781[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class72 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1790[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 < var12.length) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                this.field1779[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var51 < var29.length) {
                    var53 = var29[var51++];
                } else {
                    var53 = -1;
                }
                if (this.field1790[var54] > 0) {
                    var52 = var3.method702(-1) + 1;
                }
            }
            this.field1778[var54] = (byte) var52;
            var53--;
        }
        this.field1773 = var3.method702(-1) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class72 var56 = var19[var55];
            if (var56.field1104 != null) {
                for (int var57 = 1; var57 < var56.field1104.length; var57 += 2) {
                    var56.field1104[var57] = var3.method743((byte) 37);
                }
            }
            if (var56.field1092 != null) {
                for (int var58 = 3; var58 < var56.field1092.length - 2; var58 += 2) {
                    var56.field1092[var58] = var3.method743((byte) 57);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method743((byte) 78);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method743((byte) 88);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class72 var62 = var19[var61];
            if (var62.field1092 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1092.length; var64 += 2) {
                    var63 = var3.method702(-1) + var63 + 1;
                    var62.field1092[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class72 var66 = var19[var65];
            if (var66.field1104 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1104.length; var68 += 2) {
                    var67 -= -var3.method702(-1) - 1;
                    var66.field1104[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method702(-1);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = (var69 + var3.method702(-1)) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1778[var73] = (byte) (this.field1778[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class203.method1420(200, var75 - var71, var77);
                    this.field1778[var78] = (byte) (this.field1778[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var72 = var76;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field1778[var80] = (byte) (this.field1778[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method702(-1);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 += var3.method702(-1) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1781[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1781[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class203.method1420(200, var89 - var84, var91);
                    var91 += var90 - var85;
                    int var94 = (this.field1781[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1781[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field1781[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field1781[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field1098 = var3.method702(-1);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class72 var100 = var19[var99];
            if (var100.field1104 != null) {
                var100.field1089 = var3.method702(-1);
            }
            if (var100.field1092 != null) {
                var100.field1097 = var3.method702(-1);
            }
            if (var100.field1098 > 0) {
                var100.field1091 = var3.method702(-1);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field1094 = var3.method702(-1);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class72 var103 = var19[var102];
            if (var103.field1094 > 0) {
                var103.field1102 = var3.method702(-1);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class72 var105 = var19[var104];
            if (var105.field1102 > 0) {
                var105.field1095 = var3.method702(-1);
            }
        }
    }
}
