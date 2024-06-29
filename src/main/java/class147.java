import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class147 extends class319 {

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lhn;")
    public static class509 field2232 = new class509(107, -1);

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lhn;")
    public static class509 field2234 = new class509(101, 5);

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lrj;")
    public static class424 field2235;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
    public static int[] field2229;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1036(byte arg0) {
        field2230++;
        int var1 = 73 / ((arg0 - 44) / 48);
        if (class500.field7185 == 5) {
            class500.field7185 = 6;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILul;)V", line = 24)
    public static final void method1037(int arg0, class406 arg1) {
        class227.field3701 = arg1.method2537("titlebg", 102);
        if (arg0 != 0) {
            method1038(87, -25, null, null, -100);
        }
        field2231++;
        class175.field2599 = arg1.method2537("logo", -43);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILcl;Lah;I)V", line = 38)
    public static final void method1038(int arg0, int arg1, class177 arg2, class263 arg3, int arg4) {
        field2233++;
        byte var5 = -1;
        if ((arg0 & 0x800) != 0) {
            arg2.field1898 = arg3.method1550((byte) 28);
            if (arg2.field1898.charAt(0) == '~') {
                arg2.field1898 = arg2.field1898.substring(1);
                class475.method2854(arg2.field1898, 0, arg2.method1190(0, false), -126, arg2.method1185(true, (byte) -93), 2);
            } else if (class398.field5947 == arg2) {
                class475.method2854(arg2.field1898, 0, arg2.method1190(0, false), -128, arg2.method1185(true, (byte) -122), 2);
            }
            arg2.field1933 = 0;
            arg2.field1884 = 0;
            arg2.field1894 = 150;
        }
        if ((arg0 & 0x200) != 0) {
            var5 = arg3.method1503(110);
        }
        if ((arg0 & 0x2) != 0) {
            int var6 = arg3.method1511(89);
            int var7 = arg3.method1523(3643);
            int var8 = arg3.method1532((byte) 122);
            int var9 = arg3.field3556;
            boolean var10 = (var6 & 0x8000) != 0;
            if (arg2.field2660 != null && arg2.field2667 != null) {
                boolean var11 = false;
                if (var7 <= 1) {
                    if (!var10 && !(!class363.field5366 || class382.field5751) || class412.field6177) {
                        var11 = true;
                    } else if (class59.method525(arg2.field2660, -32071)) {
                        var11 = true;
                    }
                }
                if (!var11 && class398.field5950 == 0) {
                    class153.field2272.field3556 = 0;
                    arg3.method1531(var8, -62, 0, class153.field2272.field3572);
                    class153.field2272.field3556 = 0;
                    int var12 = -1;
                    String var14;
                    if (var10) {
                        var6 &= 0x7FFF;
                        class402 var13 = class314.method2014(class153.field2272, 113);
                        var12 = var13.field5973;
                        var14 = var13.field5968.method1820(107, class153.field2272);
                    } else {
                        var14 = class169.method1133(class517.method3067(class153.field2272, (byte) -94), 125);
                    }
                    arg2.field1898 = var14.trim();
                    arg2.field1884 = var6 & 0xFF;
                    arg2.field1933 = var6 >> 8;
                    arg2.field1894 = 150;
                    int var15;
                    if (var7 == 1 || var7 == 2) {
                        var15 = var10 ? 17 : 1;
                    } else {
                        var15 = var10 ? 17 : 2;
                    }
                    if (var7 == 2) {
                        class398.method2507("<img=1>" + arg2.method1190(0, false), "<img=1>" + arg2.method1185(true, (byte) -102), var14, var15, false, null, var12, 0);
                    } else if (var7 == 1) {
                        class398.method2507("<img=0>" + arg2.method1190(0, false), "<img=0>" + arg2.method1185(true, (byte) -95), var14, var15, false, null, var12, 0);
                    } else {
                        class398.method2507(arg2.method1190(0, false), arg2.method1185(true, (byte) -101), var14, var15, false, null, var12, 0);
                    }
                }
            }
            arg3.field3556 = var8 + var9;
        }
        if ((arg0 & 0x1) != 0) {
            int var16 = arg3.method1510(-129);
            int var17 = arg3.method1560(-128);
            arg2.method959(var17, 0, var16, class475.field6854);
            arg2.field1929 = class475.field6854 + 300;
            arg2.field1960 = arg3.method1523(3643);
        }
        if ((arg0 & 0x1000) != 0) {
            int var18 = class475.field6854;
            int var19 = arg3.method1510(-129);
            int var20 = arg3.method1532((byte) -17);
            arg2.method959(var20, 0, var19, var18);
        }
        if ((arg0 & 0x4) != 0) {
            int var21 = arg3.method1547(true);
            if (var21 == 65535) {
                var21 = -1;
            }
            arg2.field1968 = var21;
        }
        if ((arg0 & 0x2000) != 0) {
            int var22 = arg3.method1547(true);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = arg3.method1556(120);
            int var24 = arg3.method1523(3643);
            arg2.method956((byte) -124, var23, var24, false, var22);
        }
        if ((arg0 & 0x10) != 0) {
            class524.field7667[arg4] = arg3.method1565(true);
        }
        if ((arg0 & 0x10000) != 0) {
            int var25 = arg3.method1549(-2);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg3.method1536(127);
            int var27 = arg3.method1532((byte) -109);
            arg2.method956((byte) -124, var26, var27, true, var25);
        }
        if ((arg0 & 0x8000) != 0) {
            arg2.field2639 = arg3.method1523(3643) == 1;
        }
        if ((arg0 & 0x20) != 0) {
            int var28 = arg3.method1511(80);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg3.method1532((byte) 123);
            class403.method2521(58, arg2, var29, var28);
        }
        if ((arg0 & 0x80) != 0) {
            int var30 = arg3.method1523(3643);
            byte[] var31 = new byte[var30];
            class217 var32 = new class217(var31);
            arg3.method1552(0, var31, 96, var30);
            class6.field69[arg4] = var32;
            arg2.method1187((byte) -51, var32);
        }
        if ((arg0 & 0x100) != 0) {
            int var33 = arg3.method1547(true);
            arg2.field1915 = arg3.method1515((byte) 125);
            arg2.field1910 = arg3.method1532((byte) 11);
            arg2.field1908 = (var33 & 0x8000) != 0;
            arg2.field1941 = var33 & 0x7FFF;
            arg2.field1937 = class475.field6854 + arg2.field1941 + arg2.field1915;
        }
        if ((arg0 & 0x40000) != 0) {
            arg2.field1902 = arg3.method1563((byte) -124);
            arg2.field1944 = arg3.method1563((byte) 115);
            arg2.field1970 = arg3.method1563((byte) -107);
            arg2.field1927 = (byte) arg3.method1532((byte) 15);
            arg2.field1954 = class475.field6854 + arg3.method1511(-126);
            arg2.field1928 = class475.field6854 + arg3.method1512((byte) 112);
        }
        int var34 = -41 % ((arg1 + 37) / 39);
        if ((arg0 & 0x40) != 0) {
            arg2.field2644 = arg3.method1511(-87);
            if (arg2.field1981 == 0) {
                arg2.method947(arg2.field2644, -2);
                arg2.field2644 = -1;
            }
        }
        if ((arg0 & 0x4000) != 0) {
            arg2.field1942 = arg3.method1528((byte) -101);
            arg2.field1909 = arg3.method1503(88);
            arg2.field1951 = arg3.method1565(true);
            arg2.field1888 = arg3.method1528((byte) -64);
            arg2.field1940 = arg3.method1512((byte) 127) + class475.field6854;
            arg2.field1893 = arg3.method1512((byte) 109) + class475.field6854;
            arg2.field1956 = arg3.method1560(-128);
            arg2.field1983 = 0;
            if (arg2.field2677) {
                arg2.field1909 += arg2.field2657;
                arg2.field1888 += arg2.field2657;
                arg2.field1942 += arg2.field2646;
                arg2.field1981 = 0;
                arg2.field1951 += arg2.field2646;
            } else {
                arg2.field1981 = 1;
                arg2.field1942 += arg2.field1978[0];
                arg2.field1909 += arg2.field1976[0];
                arg2.field1888 += arg2.field1976[0];
                arg2.field1951 += arg2.field1978[0];
            }
        }
        if ((arg0 & 0x20000) != 0) {
            int var35 = arg3.method1515((byte) 125);
            int[] var36 = new int[var35];
            int[] var37 = new int[var35];
            int[] var38 = new int[var35];
            for (int var39 = 0; var39 < var35; var39++) {
                int var40 = arg3.method1512((byte) 115);
                if (var40 == 65535) {
                    var40 = -1;
                }
                var36[var39] = var40;
                var37[var39] = arg3.method1560(-128);
                var38[var39] = arg3.method1549(-2);
            }
            class310.method1987(79, var37, var36, var38, arg2);
        }
        if (!arg2.field2677) {
            return;
        }
        if (var5 == 127) {
            arg2.method1184(true, arg2.field2657, arg2.field2646);
            return;
        }
        byte var41;
        if (var5 == -1) {
            var41 = class524.field7667[arg4];
        } else {
            var41 = var5;
        }
        arg2.method1188(arg2.field2657, var41, (byte) -121, arg2.field2646);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 378)
    public static void method1039(boolean arg0) {
        field2235 = null;
        if (arg0) {
            field2235 = null;
        }
        field2234 = null;
        field2232 = null;
        field2229 = null;
    }
}
