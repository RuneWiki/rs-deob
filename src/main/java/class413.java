import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class413 extends class176 {

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field5778 = -1;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field5779 = 0;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5776++;
        int var7 = arg0 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg4;
        }
        int var9 = -128 % ((arg3 + 21) / 58);
        if (var7 == 1) {
            return 7 + 1 - arg2 - arg6;
        } else if (var7 == 2) {
            return 7 - arg4 - (arg5 + -1);
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2556(String arg0, int arg1) {
        field5777++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 < 77) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)I")
    public static final int method2557(int arg0, int arg1, byte arg2) {
        field5773++;
        if (arg2 != -86) {
            return -22;
        } else if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[IZ)[I")
    public static final int[] method2558(int arg0, int[] arg1, boolean arg2) {
        field5772++;
        if (arg2) {
            method2555(60, -51, 18, 73, 73, 59, 98);
        }
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg1[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg1[var4 - 1] != 0) {
                        var7 = arg0;
                    } else if (var5 > 0 && arg1[var4 - 36] != 0) {
                        var7 = arg0;
                    } else if (var6 < 35 && arg1[var4 + 1] != 0) {
                        var7 = arg0;
                    } else if (var5 < 31 && arg1[var4 + 36] != 0) {
                        var7 = arg0;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lcc;III)V")
    public static final void method2559(class338 arg0, int arg1, int arg2, int arg3) {
        if ((arg2 & 0x20) != 0) {
            arg0.field4916 = class417.field5851.method1825(-120);
            arg0.field4932 = class417.field5851.method1825(-121);
        }
        field5775++;
        if ((arg2 & 0x80) != 0) {
            arg0.field4975 = class417.field5851.method1871(arg1 ^ 0xFFFFD7FE);
            if (arg0.field4975.charAt(0) == '~') {
                arg0.field4975 = arg0.field4975.substring(1);
                class67.method588(arg0.method2147(arg1 ^ 0x2801, false), 2, 0, arg0.method2144(true, false), true, arg0.field4975);
            } else if (class95.field1379 == arg0) {
                class67.method588(arg0.method2147(arg1 - 10241, false), 2, 0, arg0.method2144(true, false), true, arg0.field4975);
            }
            arg0.field4969 = 150;
            arg0.field4973 = 0;
            arg0.field4915 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            int var4 = class417.field5851.method1853(106);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class417.field5851.method1840((byte) -22);
            class165.method1231(var5, var4, 71, arg0);
        }
        if ((arg2 & 0x8) != 0) {
            int var6 = class417.field5851.method1840((byte) -111);
            byte[] var7 = new byte[var6];
            class289 var8 = new class289(var7);
            class417.field5851.method1839(false, 0, var7, var6);
            class267.field3604[arg3] = var8;
            arg0.method2143(arg1 ^ 0xFFFFD78A, var8);
        }
        if ((arg2 & 0x40) != 0) {
            arg0.field4988 = class417.field5851.method1873(-8409);
            if (arg0.field4988 == 65535) {
                arg0.field4988 = -1;
            }
        }
        if ((arg2 & 0x800) != 0) {
            int var9 = class417.field5851.method1825(-94);
            arg0.field4943 = class417.field5851.method1861((byte) -72);
            arg0.field4930 = class417.field5851.method1852((byte) -21);
            arg0.field4950 = var9 & 0x7FFF;
            arg0.field4920 = (var9 & 0x8000) != 0;
            arg0.field4954 = class414.field5793 - (-arg0.field4950 - arg0.field4943);
        }
        if ((arg2 & 0x4) != 0) {
            int var10 = class417.field5851.method1821(-115);
            int var11 = class417.field5851.method1861((byte) -72);
            arg0.method2269(4, var10, var11, class414.field5793);
            arg0.field4935 = class414.field5793 + 300;
            arg0.field4951 = class417.field5851.method1840((byte) -65);
        }
        if ((arg2 & 0x1000) != 0) {
            int var12 = class417.field5851.method1828((byte) -117);
            int var13 = class417.field5851.method1883(0);
            if (var12 == 65535) {
                var12 = -1;
            }
            boolean var14 = true;
            if (var12 != -1 && arg0.field4974 != -1) {
                if (arg0.field4974 == var12) {
                    class282 var15 = class71.method613(var12, (byte) -107);
                    if (var15.field3768 && var15.field3765 != -1) {
                        class209 var16 = class288.method1819(var15.field3765, (byte) 105);
                        int var17 = var16.field2917;
                        if (var17 == 0) {
                            var14 = false;
                        } else if (var17 == 1) {
                            var14 = true;
                        } else if (var17 == 2) {
                            arg0.field4962 = 0;
                            var14 = false;
                        }
                    }
                } else {
                    class282 var18 = class71.method613(var12, (byte) -112);
                    class282 var19 = class71.method613(arg0.field4974, (byte) -83);
                    if (var18.field3765 != -1 && var19.field3765 != -1) {
                        class209 var20 = class288.method1819(var18.field3765, (byte) 105);
                        class209 var21 = class288.method1819(var19.field3765, (byte) 105);
                        if (var21.field2906 > var20.field2906) {
                            var14 = false;
                        }
                    }
                }
            }
            if (var14) {
                arg0.field4971 = 0;
                arg0.field4978 = 1;
                arg0.field4965 = 0;
                arg0.field4931 = var13 >> 16;
                arg0.field4933 = (var13 & 0xFFFF) + class414.field5793;
                arg0.field4974 = var12;
                if (class414.field5793 < arg0.field4933) {
                    arg0.field4965 = -1;
                }
                if (arg0.field4974 != -1 && class414.field5793 == arg0.field4933) {
                    int var22 = class71.method613(arg0.field4974, (byte) -78).field3765;
                    if (var22 != -1) {
                        class209 var23 = class288.method1819(var22, (byte) 105);
                        if (var23 != null && var23.field2915 != null) {
                            class232.method1547(13238, var23, arg0.field3167, class95.field1379 == arg0, 0, arg0.field3176);
                        }
                    }
                }
            }
        }
        if (arg1 != 10241) {
            field5778 = 64;
        }
        if ((arg2 & 0x100) != 0) {
            arg0.field4961 = class417.field5851.method1861((byte) -72);
            arg0.field4918 = class417.field5851.method1861((byte) -72);
            arg0.field4922 = class417.field5851.method1861((byte) -72);
            arg0.field4964 = class417.field5851.method1861((byte) -72);
            arg0.field4940 = class417.field5851.method1828((byte) -26) + class414.field5793;
            arg0.field4986 = class417.field5851.method1828((byte) -32) + class414.field5793;
            arg0.field4955 = class417.field5851.method1852((byte) -21);
            arg0.field5009 = 1;
            arg0.field4999 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            int var24 = class417.field5851.method1829(24185);
            int[] var25 = new int[var24];
            int[] var26 = new int[var24];
            int[] var27 = new int[var24];
            for (int var28 = 0; var28 < var24; var28++) {
                int var29 = class417.field5851.method1853(-107);
                if (var29 == 65535) {
                    var29 = -1;
                }
                var25[var28] = var29;
                var26[var28] = class417.field5851.method1861((byte) -72);
                var27[var28] = class417.field5851.method1828((byte) -96);
            }
            class356.method2248((byte) 113, arg0, var25, var27, var26);
        }
        if ((arg2 & 0x10) != 0) {
            int var30 = class417.field5851.method1873(-8409);
            int var31 = class417.field5851.method1861((byte) -72);
            int var32 = class417.field5851.method1861((byte) -72);
            int var33 = class417.field5851.field3938;
            boolean var34 = (var30 & 0x8000) != 0;
            if (arg0.field4577 != null && arg0.field4608 != null) {
                boolean var35 = false;
                if (var31 <= 1) {
                    if (!var34 && (class288.field3859 && !class128.field1807 || class236.field3282)) {
                        var35 = true;
                    } else if (class443.method2750(arg0.field4577, (byte) 50)) {
                        var35 = true;
                    }
                }
                if (!var35 && class440.field6320 == 0) {
                    class213.field2952.field3938 = 0;
                    class417.field5851.method1882(-126, var32, 0, class213.field2952.field3882);
                    class213.field2952.field3938 = 0;
                    int var36 = -1;
                    String var38;
                    if (var34) {
                        var30 &= 0x7FFF;
                        class49 var37 = class162.method1214(class213.field2952, 12926);
                        var36 = var37.field833;
                        var38 = var37.field834.method873(97, class213.field2952);
                    } else {
                        var38 = class289.method1860(class316.method2014(127, class384.method2383(class213.field2952, arg1 - 22302)), -4107);
                    }
                    arg0.field4975 = var38.trim();
                    arg0.field4969 = 150;
                    arg0.field4915 = var30 >> 8;
                    arg0.field4973 = var30 & 0xFF;
                    int var39;
                    if (var31 == 1 || var31 == 2) {
                        var39 = var34 ? 17 : 1;
                    } else {
                        var39 = var34 ? 17 : 2;
                    }
                    if (var31 == 2) {
                        class323.method2056(31437, "<img=1>" + arg0.method2144(true, false), var38, 0, "<img=1>" + arg0.method2147(0, false), var39, (String) null, var36);
                    } else if (var31 == 1) {
                        class323.method2056(31437, "<img=0>" + arg0.method2144(true, false), var38, 0, "<img=0>" + arg0.method2147(0, false), var39, (String) null, var36);
                    } else {
                        class323.method2056(31437, arg0.method2144(true, false), var38, 0, arg0.method2147(arg1 ^ 0x2801, false), var39, (String) null, var36);
                    }
                }
            }
            class417.field5851.field3938 = var32 + var33;
        }
        if ((arg2 & 0x400) != 0) {
            int var40 = class417.field5851.method1821(-104);
            int var41 = class417.field5851.method1840((byte) -106);
            arg0.method2269(arg1 - 10237, var40, var41, class414.field5793);
        }
    }
}
