import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class90 {

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public int field1598 = -1;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Z")
    public static boolean field1607 = false;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "Lqe;")
    public static class465 field1605 = new class465(40, 3);

    @OriginalMember(owner = "client!in", name = "s", descriptor = "[I")
    public static int[] field1609 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "J")
    private long field1592;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "J")
    private long field1595;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Z")
    public boolean field1594;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
    public int[] field1596;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "[I")
    private int[] field1608;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)V")
    public final void method837(int arg0, boolean arg1) {
        this.field1594 = arg1;
        field1602++;
        this.method840(-21132);
        if (arg0 != -1) {
            method844((byte) 126);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lcp;IBLha;Lhn;ILun;ILpv;ILsd;Ldk;)Lka;")
    public final class469 method838(class721 arg0, int arg1, byte arg2, class58 arg3, class718 arg4, int arg5, class420 arg6, int arg7, class70 arg8, int arg9, class93 arg10, class508 arg11) {
        field1597++;
        if (this.field1598 != -1) {
            return arg11.method3038(this.field1598, (byte) 60).method2931(arg9, false, arg0, arg7, arg3, arg1, arg4, arg5, arg10);
        }
        int var13 = 11 % ((arg2 - 57) / 56);
        int var14 = arg5;
        if (arg4 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            Object var22 = null;
            int var23 = arg4.field10053[arg9];
            var14 = arg5 | 0x20;
            int var24 = var23 >>> 16;
            class755 var25 = arg10.method856(var24, 2);
            int var26 = var23 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method4192(100, var26);
                var15 |= var25.method4195(-27751, var26);
                var18 |= var25.method4194(8243, var26);
                var17 |= arg4.field10040;
            }
            if ((arg4.field10069 || class712.field9957) && arg7 != -1 && arg7 < arg4.field10053.length) {
                int var27 = arg4.field10053[arg7];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class755 var30 = var24 == var28 ? var25 : arg10.method856(var28, 2);
                if (var30 != null) {
                    var16 |= var30.method4192(100, var29);
                    var15 |= var30.method4195(-27751, var29);
                    var18 |= var30.method4194(8243, var29);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class510 var31 = class313.field4417;
        class469 var32;
        synchronized (class313.field4417) {
            var32 = (class469) class313.field4417.method3054((byte) -97, this.field1592);
        }
        if (var32 == null || arg3.method611(var32.method361(), var14) != 0) {
            if (var32 != null) {
                var14 = arg3.method614(var14, var32.method361());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field1608[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg6.method2571(-18, var36 & 0x3FFFFFFF).method43(13)) {
                        var34 = true;
                    }
                } else if (!arg8.method721(113, var36 & 0x3FFFFFFF).method1725(0, this.field1594)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class729[] var37 = new class729[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field1608[var39];
                if ((var40 & 0x40000000) != 0) {
                    class729 var42 = arg8.method721(87, var40 & 0x3FFFFFFF).method1732(this.field1594, (byte) -16);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class729 var41 = arg6.method2571(-98, var40 & 0x3FFFFFFF).method45((byte) 76);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            int var43 = var14 | 0x4000;
            class729 var44 = new class729(var37, var38);
            var32 = arg3.method646(var44, var43, class85.field1547, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                for (int var46 = 0; var46 < class487.field6892.length; var46++) {
                    if (this.field1596[var45] < class487.field6892[var46][var45].length) {
                        var32.method359(class681.field9588[var46][var45], class487.field6892[var46][var45][this.field1596[var45]]);
                    }
                }
            }
            var32.method347(var14);
            class510 var47 = class313.field4417;
            synchronized (class313.field4417) {
                class313.field4417.method3047(false, var32, this.field1592);
            }
        }
        if (arg4 == null) {
            return var32;
        } else {
            var32.method325((byte) 4, var14, true);
            return arg4.method4005(arg7, -122, arg5, var32, arg1, arg9);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLsd;ILha;IIILun;Lhn;II)Lka;")
    public final class469 method839(int arg0, byte arg1, class93 arg2, int arg3, class58 arg4, int arg5, int arg6, int arg7, class420 arg8, class718 arg9, int arg10, int arg11) {
        field1606++;
        int var13 = arg10;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg10 | 0x20;
            Object var21 = null;
            int var22 = arg9.field10053[arg3];
            int var23 = var22 >>> 16;
            class755 var24 = arg2.method856(var23, arg1 ^ 0xFFFFFFFE);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method4192(100, var25);
                var14 |= var24.method4195(-27751, var25);
                var17 |= var24.method4194(arg1 + 8247, var25);
                var16 |= arg9.field10040;
            }
            if ((arg9.field10069 || class712.field9957) && arg7 != -1 && arg7 < arg9.field10053.length) {
                int var26 = arg9.field10053[arg7];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class755 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg2.method856(var28 >>> 16, 2);
                }
                if (var29 != null) {
                    var15 |= var29.method4192(100, var28);
                    var14 |= var29.method4195(-27751, var28);
                    var17 |= var29.method4194(8243, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg1 != -4) {
            return null;
        }
        long var30 = (long) arg11 | (long) (arg6 << 16) | (long) arg0 << 32;
        class510 var32 = class313.field4417;
        class469 var33;
        synchronized (class313.field4417) {
            var33 = (class469) class313.field4417.method3054((byte) -114, var30);
        }
        if (var33 == null || arg4.method611(var33.method361(), var13) != 0) {
            if (var33 != null) {
                var13 = arg4.method614(var13, var33.method361());
            }
            class729[] var35 = new class729[3];
            int var36 = 0;
            if (!arg8.method2571(-27, arg11).method43(13) || !arg8.method2571(-122, arg6).method43(13) || !arg8.method2571(-93, arg0).method43(13)) {
                return null;
            }
            class729 var37 = arg8.method2571(-58, arg11).method45((byte) 61);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class729 var38 = arg8.method2571(-81, arg6).method45((byte) 105);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class729 var39 = arg8.method2571(-119, arg0).method45((byte) 94);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class729 var40 = new class729(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg4.method646(var40, var41, class85.field1547, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class487.field6892.length; var43++) {
                    if (class487.field6892[var43][var42].length > this.field1596[var42]) {
                        var33.method359(class681.field9588[var43][var42], class487.field6892[var43][var42][this.field1596[var42]]);
                    }
                }
            }
            var33.method347(var13);
            class510 var44 = class313.field4417;
            synchronized (class313.field4417) {
                class313.field4417.method3047(false, var33, var30);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class469 var45 = var33.method325((byte) 4, var13, true);
            return arg9.method4005(arg7, -97, arg10, var45, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    private final void method840(int arg0) {
        field1599++;
        this.field1592 = -1L;
        long[] var2 = class674.field9468;
        this.field1592 = this.field1592 >>> 8 ^ var2[(int) (((long) (this.field1600 >> 8) ^ this.field1592) & 0xFFL)];
        this.field1592 = this.field1592 >>> 8 ^ var2[(int) (((long) this.field1600 ^ this.field1592) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1592 = this.field1592 >>> 8 ^ var2[(int) ((this.field1592 ^ (long) (this.field1608[var3] >> 24)) & 0xFFL)];
            this.field1592 = var2[(int) ((this.field1592 ^ (long) (this.field1608[var3] >> 16)) & 0xFFL)] ^ this.field1592 >>> 8;
            this.field1592 = this.field1592 >>> 8 ^ var2[(int) ((this.field1592 ^ (long) (this.field1608[var3] >> 8)) & 0xFFL)];
            this.field1592 = var2[(int) ((this.field1592 ^ (long) this.field1608[var3]) & 0xFFL)] ^ this.field1592 >>> 8;
        }
        if (arg0 == -21132) {
            for (int var4 = 0; var4 < 5; var4++) {
                this.field1592 = var2[(int) (((long) this.field1596[var4] ^ this.field1592) & 0xFFL)] ^ this.field1592 >>> 8;
            }
            this.field1592 = var2[(int) (((long) (this.field1594 ? 1 : 0) ^ this.field1592) & 0xFFL)] ^ this.field1592 >>> 8;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BIILpv;)V")
    public final void method841(byte arg0, int arg1, int arg2, class70 arg3) {
        if (arg0 < 104) {
            return;
        }
        field1601++;
        if (arg2 == -1) {
            this.field1608[arg1] = 0;
        } else if (arg3.method721(93, arg2) != null) {
            this.field1608[arg1] = class164.method1221(arg2, 1073741824);
            this.method840(-21132);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)V")
    public final void method842(int arg0, int arg1, byte arg2) {
        field1591++;
        if (arg2 <= 60) {
            this.field1608 = null;
        }
        this.field1596[arg1] = arg0;
        this.method840(-21132);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILun;II)V")
    public final void method843(int arg0, class420 arg1, int arg2, int arg3) {
        field1604++;
        int var5 = class307.field4339[arg0];
        if (arg1.method2571(-16, arg3) != null) {
            this.field1608[var5] = class164.method1221(arg2, arg3);
            this.method840(arg2 ^ 0x7FFFAD74);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method844(byte arg0) {
        field1609 = null;
        field1605 = null;
        if (arg0 != 41) {
            method844((byte) 67);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIB[I[II)V")
    public final void method845(boolean arg0, int arg1, byte arg2, int[] arg3, int[] arg4, int arg5) {
        if (this.field1600 != arg5) {
            this.field1600 = arg5;
        }
        this.field1598 = arg1;
        if (arg2 > -25) {
            field1607 = false;
        }
        field1593++;
        this.field1594 = arg0;
        this.field1608 = arg3;
        this.field1596 = arg4;
        this.method840(-21132);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III[Llfa;IILhn;ILcp;[ILdk;Lsd;ILgw;ZILun;Lha;ILhn;Lpv;)Lka;")
    public final class469 method846(int arg0, int arg1, int arg2, class114[] arg3, int arg4, int arg5, class718 arg6, int arg7, class721 arg8, int[] arg9, class508 arg10, class93 arg11, int arg12, class169 arg13, boolean arg14, int arg15, class420 arg16, class58 arg17, int arg18, class718 arg19, class70 arg20) {
        field1603++;
        if (this.field1598 != -1) {
            return arg10.method3038(this.field1598, (byte) 25).method2932(arg17, arg2, arg12, arg6, -23434, arg9, arg13, arg7, arg1, arg0, arg4, arg5, arg11, arg8, arg19, arg3, arg15);
        }
        int var22 = arg15;
        long var23 = this.field1592;
        int[] var25 = this.field1608;
        if (arg19 != null && (arg19.field10047 >= 0 || arg19.field10041 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field1608[var26];
            }
            if (arg19.field10047 >= 0) {
                if (arg19.field10047 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class164.method1221(1073741824, arg19.field10047);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg19.field10041 >= 0) {
                if (arg19.field10041 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class164.method1221(arg19.field10041, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg19 != null || arg6 != null;
        int var31 = arg3 == null ? 0 : arg3.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class693.field9751[var32] = null;
            if (arg3[var32] != null) {
                class718 var33 = arg11.method851(arg3[var32].field1824, -2);
                if (var33.field10053 != null) {
                    class102.field1721[var32] = var33;
                    var30 = true;
                    int var34 = arg3[var32].field1827;
                    int var35 = arg3[var32].field1831;
                    int var36 = var33.field10053[var34];
                    class693.field9751[var32] = arg11.method856(var36 >>> 16, 2);
                    int var37 = var36 & 0xFFFF;
                    class375.field5252[var32] = var37;
                    if (class693.field9751[var32] != null) {
                        var28 |= class693.field9751[var32].method4192(100, var37);
                        var27 |= class693.field9751[var32].method4195(-27751, var37);
                        var29 |= class693.field9751[var32].method4194(8243, var37);
                    }
                    if ((var33.field10069 || class712.field9957) && var35 != -1 && var33.field10053.length > var35) {
                        class643.field9140[var32] = var33.field10048[var34];
                        class394.field5520[var32] = arg3[var32].field1822;
                        int var38 = var33.field10053[var35];
                        class465.field6726[var32] = arg11.method856(var38 >>> 16, 2);
                        int var39 = var38 & 0xFFFF;
                        class517.field7352[var32] = var39;
                        if (class465.field6726[var32] != null) {
                            var28 |= class465.field6726[var32].method4192(100, var39);
                            var27 |= class465.field6726[var32].method4195(-27751, var39);
                            var29 |= class465.field6726[var32].method4194(8243, var39);
                        }
                    } else {
                        class643.field9140[var32] = 0;
                        class394.field5520[var32] = 0;
                        class465.field6726[var32] = null;
                        class517.field7352[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class755 var43 = null;
        class755 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class755 var48 = null;
        class755 var49 = null;
        if (var30) {
            var22 = arg15 | 0x20;
            if (arg19 != null) {
                int var50 = arg19.field10053[arg2];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg11.method856(var51, 2);
                if (var43 != null) {
                    var28 |= var43.method4192(100, var40);
                    var27 |= var43.method4195(-27751, var40);
                    var29 |= var43.method4194(8243, var40);
                }
                if ((arg19.field10069 || class712.field9957) && arg7 != -1 && arg19.field10053.length > arg7) {
                    var42 = arg19.field10048[arg2];
                    int var52 = arg19.field10053[arg7];
                    int var53 = var52 >>> 16;
                    var41 = var52 & 0xFFFF;
                    var44 = var51 == var53 ? var43 : arg11.method856(var53, 2);
                    if (var44 != null) {
                        var28 |= var44.method4192(100, var41);
                        var27 |= var44.method4195(-27751, var41);
                        var29 |= var44.method4194(8243, var41);
                    }
                }
            }
            if (arg6 != null) {
                int var54 = arg6.field10053[arg5];
                int var55 = var54 >>> 16;
                var48 = arg11.method856(var55, 2);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method4192(100, var45);
                    var27 |= var48.method4195(-27751, var45);
                    var29 |= var48.method4194(8243, var45);
                }
                if ((arg6.field10069 || class712.field9957) && arg12 != -1 && arg12 < arg6.field10053.length) {
                    var47 = arg6.field10048[arg5];
                    int var56 = arg6.field10053[arg12];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg11.method856(var57, 2);
                    if (var49 != null) {
                        var28 |= var49.method4192(100, var46);
                        var27 |= var49.method4195(-27751, var46);
                        var29 |= var49.method4194(8243, var46);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class510 var58 = class496.field7066;
        class469 var59;
        synchronized (class496.field7066) {
            var59 = (class469) class496.field7066.method3054((byte) -102, var23);
        }
        class500 var60 = null;
        if (this.field1600 != -1) {
            var60 = arg13.method1251(this.field1600, -122);
        }
        if (var59 == null || arg17.method611(var59.method361(), var22) != 0) {
            if (var59 != null) {
                var22 = arg17.method614(var22, var59.method361());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg16.method2571(-107, var64 & 0x3FFFFFFF).method44(-128)) {
                        var62 = true;
                    }
                } else if (!arg20.method721(113, var64 & 0x3FFFFFFF).method1731(111, this.field1594)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field1595 != -1L) {
                    class510 var82 = class496.field7066;
                    synchronized (class496.field7066) {
                        var59 = (class469) class496.field7066.method3054((byte) -111, this.field1595);
                    }
                }
                if (var59 == null || arg17.method611(var59.method361(), var22) != 0) {
                    return null;
                }
            } else {
                class729[] var65 = new class729[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class729 var69 = arg20.method721(106, var67 & 0x3FFFFFFF).method1724((byte) -49, this.field1594);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    } else if ((var67 & Integer.MIN_VALUE) != 0) {
                        class729 var68 = arg16.method2571(-121, var67 & 0x3FFFFFFF).method48(0);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    }
                }
                if (var60 != null && var60.field7113 != null) {
                    for (int var70 = 0; var70 < var60.field7113.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field7113[var70] != null) {
                                var71 = var60.field7113[var70][0];
                                var74 = var60.field7113[var70][3] << 3;
                                var72 = var60.field7113[var70][1];
                                var73 = var60.field7113[var70][2];
                                var75 = var60.field7113[var70][4] << 3;
                                var76 = var60.field7113[var70][5] << 3;
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method4057(var76, var74, 317187278, var75);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method4056(-128, var73, var72, var71);
                            }
                        }
                    }
                }
                int var77 = var22 | 0x4000;
                class729 var78 = new class729(var65, var65.length);
                var59 = arg17.method646(var78, var77, class85.field1547, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class487.field6892.length; var80++) {
                        if (this.field1596[var79] < class487.field6892[var80][var79].length) {
                            var59.method359(class681.field9588[var80][var79], class487.field6892[var80][var79][this.field1596[var79]]);
                        }
                    }
                }
                if (arg14) {
                    var59.method347(var22);
                    class510 var81 = class496.field7066;
                    synchronized (class496.field7066) {
                        class496.field7066.method3047(false, var59, var23);
                    }
                    this.field1595 = var23;
                }
            }
        }
        class469 var83 = var59.method325((byte) 4, var22, true);
        boolean var84 = false;
        if (arg9 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg9[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class280[] var86 = null;
        if (var60 != null) {
            var86 = var60.method3007(arg17, (byte) -75);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method322(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        if (arg18 < 54) {
            this.method842(-86, -83, (byte) -66);
        }
        while (var31 > var88) {
            if (class693.field9751[var88] != null) {
                var83.method2847(class517.field7352[var88], false, class693.field9751[var88], var89, 0, class394.field5520[var88] - 1, null, class465.field6726[var88], class643.field9140[var88], (byte) 127, class375.field5252[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg9[var90] != -1) {
                    int var91 = arg9[var90] - arg1;
                    int var92 = var91 & 0x3FFF;
                    class280 var93 = arg17.method558();
                    var93.method150(var92);
                    var83.method322(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method322(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2845(var41, var49, 63, false, var42, var40, arg19.field10071, var48, arg0 - 1, var47, arg4 - 1, var43, var44, var46, var45);
        } else if (var43 != null) {
            var83.method2844(false, var43, var40, 0, var41, 8985, arg0 - 1, var44, var42);
        } else if (var48 != null) {
            var83.method2844(false, var48, var45, 0, var46, 8985, arg4 - 1, var49, var47);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class693.field9751[var95] = null;
            class465.field6726[var95] = null;
            class102.field1721[var95] = null;
        }
        return var83;
    }
}
