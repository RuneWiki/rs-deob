import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class210 extends OutputStream {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field2850 = -1;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
    public static int[] field2848;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIZI)V", line = 4)
    public static final void method1369(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2855++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class400.method2567(class240.field3368, class136.field1769, (byte) -54, arg1 + arg0);
        int var10 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg1 - arg0);
        class351.method2317(arg3, var9, class444.field6416[arg4], var10, arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class157.field1981 && class312.field4602 >= var11) {
                    int var13 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg1 + var5);
                    int var14 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg1 - var5);
                    if (class312.field4602 >= var12) {
                        class351.method2317(arg3, var13, class444.field6416[var12], var14, arg2);
                    }
                    if (var11 >= class157.field1981) {
                        class351.method2317(false, var13, class444.field6416[var11], var14, arg2);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class157.field1981 <= var16 && class312.field4602 >= var15) {
                int var17 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg1 + var6);
                int var18 = class400.method2567(class240.field3368, class136.field1769, (byte) -66, arg1 - var6);
                if (class312.field4602 >= var16) {
                    class351.method2317(false, var17, class444.field6416[var16], var18, arg2);
                }
                if (class157.field1981 <= var15) {
                    class351.method2317(false, var17, class444.field6416[var15], var18, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)I", line = 79)
    public static final int method1370(int arg0, int arg1, int arg2, int arg3) {
        field2851++;
        int var4 = arg3 & arg2;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BIIIIII)V", line = 108)
    public static final void method1371(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2847++;
        int var7 = arg5 - arg1;
        int var8 = arg4 + arg1;
        for (int var9 = arg4; var9 < var8; var9++) {
            class351.method2317(false, arg3, class444.field6416[var9], arg2, arg6);
        }
        int var10 = arg3 - arg1;
        int var11 = arg1 + arg2;
        for (int var12 = arg5; var12 > var7; var12--) {
            class351.method2317(false, arg3, class444.field6416[var12], arg2, arg6);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class444.field6416[var13];
            class351.method2317(false, var11, var14, arg2, arg6);
            class351.method2317(false, arg3, var14, var10, arg6);
        }
        if (arg0 < 28) {
            field2850 = 33;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 153)
    public static void method1372(boolean arg0) {
        field2848 = null;
        if (arg0) {
            field2850 = -76;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lp;I)V", line = 168)
    public static final void method1373(class438 arg0, int arg1) {
        field2849++;
        arg0.field6354 = null;
        if (class188.field2564 < 20) {
            class266.field3944.method50(arg0, (byte) -105);
            class188.field2564++;
        }
        if (arg1 < 103) {
            field2854 = -6;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BIILkg;)V", line = 187)
    public static final void method1374(byte arg0, int arg1, int arg2, class317 arg3) {
        if ((arg2 & 0x8) != 0) {
            int var4 = class27.field471.method2265(false);
            int var5 = class27.field471.method2207(121);
            int var6 = class27.field471.method2207(-122);
            int var7 = class27.field471.field5049;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg3.field4650 != null && arg3.field4644 != null) {
                boolean var9 = false;
                if (var5 <= 1) {
                    if (!var8 && (class181.field2419 && !class379.field5553 || class406.field5916)) {
                        var9 = true;
                    } else if (class322.method2123(arg3.field4650, (byte) -116)) {
                        var9 = true;
                    }
                }
                if (!var9 && class256.field3745 == 0) {
                    class249.field3677.field5049 = 0;
                    class27.field471.method2241(var6, class249.field3677.field5042, (byte) -65, 0);
                    class249.field3677.field5049 = 0;
                    int var10 = -1;
                    String var12;
                    if (var8) {
                        var4 &= 0x7FFF;
                        class84 var11 = class386.method2500(class249.field3677, 27360);
                        var10 = var11.field1159;
                        var12 = var11.field1164.method796(class249.field3677, -16981);
                    } else {
                        var12 = class43.method304((byte) 23, class321.method2113((byte) 86, class170.method1140(1, class249.field3677)));
                    }
                    arg3.field2104 = var12.trim();
                    arg3.field2175 = var4 & 0xFF;
                    arg3.field2128 = 150;
                    arg3.field2145 = var4 >> 8;
                    int var13;
                    if (var5 == 1 || var5 == 2) {
                        var13 = var8 ? 17 : 1;
                    } else {
                        var13 = var8 ? 17 : 2;
                    }
                    if (var5 == 2) {
                        class237.method1536((String) null, var12, "<img=1>" + arg3.method2078(2047, true), true, var10, var13, 0, "<img=1>" + arg3.method2081(false, 1));
                    } else if (var5 == 1) {
                        class237.method1536((String) null, var12, "<img=0>" + arg3.method2078(2047, true), true, var10, var13, 0, "<img=0>" + arg3.method2081(false, 1));
                    } else {
                        class237.method1536((String) null, var12, arg3.method2078(2047, true), true, var10, var13, 0, arg3.method2081(false, 1));
                    }
                }
            }
            class27.field471.field5049 = var6 + var7;
        }
        field2852++;
        if ((arg2 & 0x200) != 0) {
            int var14 = class27.field471.method2223(-1);
            int var15 = class27.field471.method2233((byte) 104);
            arg3.method1090(var15, (byte) 124, class231.field3179, var14);
        }
        if ((arg2 & 0x10) != 0) {
            arg3.field2179 = class27.field471.method2230(1939718792);
            if (arg3.field2179 == 65535) {
                arg3.field2179 = -1;
            }
        }
        if ((arg2 & 0x1000) != 0) {
            int var16 = class27.field471.method2233((byte) 104);
            int[] var17 = new int[var16];
            int[] var18 = new int[var16];
            int[] var19 = new int[var16];
            for (int var20 = 0; var20 < var16; var20++) {
                int var21 = class27.field471.method2230(1939718792);
                if (var21 == 65535) {
                    var21 = -1;
                }
                var17[var20] = var21;
                var18[var20] = class27.field471.method2238(76);
                var19[var20] = class27.field471.method2265(false);
            }
            class236.method1530(var19, arg3, 14875, var18, var17);
        }
        if (arg0 < 110) {
            method1369(118, -51, -78, false, -105);
        }
        if ((arg2 & 0x1) != 0) {
            int var22 = class27.field471.method2262(true);
            byte[] var23 = new byte[var22];
            class341 var24 = new class341(var23);
            class27.field471.method2241(var22, var23, (byte) -78, 0);
            class329.field4858[arg1] = var24;
            arg3.method2079(-95, var24);
        }
        if ((arg2 & 0x800) != 0) {
            int var25 = class27.field471.method2265(false);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = class27.field471.method2213((byte) -47);
            boolean var27 = true;
            if (var25 != -1 && arg3.field2142 != -1) {
                if (arg3.field2142 == var25) {
                    class235 var32 = class263.method1762(var25, false);
                    if (var32.field3263 && var32.field3271 != -1) {
                        class233 var33 = class73.method597(var32.field3271, -1);
                        int var34 = var33.field3239;
                        if (var34 == 0) {
                            var27 = false;
                        } else if (var34 == 1) {
                            var27 = true;
                        } else if (var34 == 2) {
                            var27 = false;
                            arg3.field2173 = 0;
                        }
                    }
                } else {
                    class235 var28 = class263.method1762(var25, false);
                    class235 var29 = class263.method1762(arg3.field2142, false);
                    if (var28.field3271 != -1 && var29.field3271 != -1) {
                        class233 var30 = class73.method597(var28.field3271, -1);
                        class233 var31 = class73.method597(var29.field3271, -1);
                        if (var30.field3250 < var31.field3250) {
                            var27 = false;
                        }
                    }
                }
            }
            if (var27) {
                arg3.field2142 = var25;
                arg3.field2135 = var26 >> 16;
                arg3.field2117 = 0;
                arg3.field2165 = 1;
                arg3.field2160 = (var26 & 0xFFFF) + class231.field3179;
                arg3.field2113 = 0;
                if (arg3.field2160 > class231.field3179) {
                    arg3.field2113 = -1;
                }
                if (arg3.field2142 != -1 && class231.field3179 == arg3.field2160) {
                    int var35 = class263.method1762(arg3.field2142, false).field3271;
                    if (var35 != -1) {
                        class233 var36 = class73.method597(var35, -1);
                        if (var36 != null && var36.field3242 != null) {
                            class379.method2476(0, false, class383.field5609 == arg3, arg3.field5930, var36, arg3.field5921);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field2133 = class27.field471.method2230(1939718792);
            arg3.field2108 = class27.field471.method2228(-128);
        }
        if ((arg2 & 0x40) != 0) {
            int var37 = class27.field471.method2265(false);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var38 = class27.field471.method2238(83);
            class185.method1204(var38, arg3, (byte) 119, var37);
        }
        if ((arg2 & 0x20) != 0) {
            arg3.field2104 = class27.field471.method2261((byte) 77);
            if (arg3.field2104.charAt(0) == '~') {
                arg3.field2104 = arg3.field2104.substring(1);
                class20.method181(0, 2, arg3.field2104, arg3.method2078(2047, true), 9231, arg3.method2081(false, 1));
            } else if (class383.field5609 == arg3) {
                class20.method181(0, 2, arg3.field2104, arg3.method2078(2047, true), 9231, arg3.method2081(false, 1));
            }
            arg3.field2175 = 0;
            arg3.field2128 = 150;
            arg3.field2145 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var39 = class27.field471.method2223(-1);
            int var40 = class27.field471.method2238(124);
            arg3.method1090(var40, (byte) 126, class231.field3179, var39);
            arg3.field2174 = class231.field3179 + 300;
            arg3.field2182 = class27.field471.method2233((byte) 104);
        }
        if ((arg2 & 0x400) != 0) {
            int var41 = class27.field471.method2230(1939718792);
            arg3.field2121 = class27.field471.method2262(true);
            arg3.field2112 = class27.field471.method2233((byte) 104);
            arg3.field2138 = var41 & 0x7FFF;
            arg3.field2147 = (var41 & 0x8000) != 0;
            arg3.field2176 = class231.field3179 + arg3.field2138 + arg3.field2121;
        }
        if ((arg2 & 0x100) == 0) {
            return;
        }
        arg3.field2134 = class27.field471.method2207(-111);
        arg3.field2180 = class27.field471.method2233((byte) 104);
        arg3.field2153 = class27.field471.method2238(102);
        arg3.field2158 = class27.field471.method2233((byte) 104);
        arg3.field2172 = class27.field471.method2230(1939718792) + class231.field3179;
        arg3.field2115 = class27.field471.method2230(1939718792) + class231.field3179;
        arg3.field2149 = class27.field471.method2233((byte) 104);
        arg3.field2202 = 1;
        arg3.field2198 = 0;
    }

    @OriginalMember(owner = "client!bn", name = "write", descriptor = "(I)V", line = 520)
    public final void write(int arg0) throws IOException {
        field2853++;
        throw new IOException();
    }
}
