import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class714 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public int field9857;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "[I")
    public static int[] field9859 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Z")
    public static boolean field9860 = false;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static final void method4003(byte arg0) {
        if (arg0 >= -58) {
            return;
        }
        for (int var1 = 0; var1 < class92.field1118; var1++) {
            int var2 = class600.field7882[var1];
            class556 var3 = ((class134) class390.field5470.method2135((long) var2, (byte) 31)).field2154;
            int var4 = class3.field63.method3821((byte) -37);
            if ((var4 & 0x4) != 0) {
                var4 += class3.field63.method3821((byte) -73) << 8;
            }
            if ((var4 & 0x8000) != 0) {
                var4 += class3.field63.method3821((byte) 85) << 16;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class3.field63.method3783((byte) -45);
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = class3.field63.method3790((byte) 22);
                        int var10 = -1;
                        if (var9 == 32767) {
                            var9 = class3.field63.method3790((byte) 22);
                            var8 = class3.field63.method3790((byte) 22);
                            var7 = class3.field63.method3790((byte) 22);
                            var10 = class3.field63.method3790((byte) 22);
                        } else if (var9 == 32766) {
                            var9 = -1;
                        } else {
                            var8 = class3.field63.method3790((byte) 22);
                        }
                        int var11 = class3.field63.method3790((byte) 22);
                        int var12 = class3.field63.method3815((byte) -126);
                        var3.method4142(var7, 47, var8, var11, class29.field474, var9, var12, var10);
                    }
                }
            }
            if ((var4 & 0x100) != 0) {
                int var13 = class3.field63.method3821((byte) 76);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class3.field63.method3816(-126);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class3.field63.method3815((byte) 10);
                    var16[var17] = class3.field63.method3816(-112);
                }
                class405.method2379(var15, var3, var16, 117, var14);
            }
            if ((var4 & 0x400) != 0) {
                int var19 = class3.field63.method3809(true);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class3.field63.method3826(-1893167880);
                int var21 = class3.field63.method3791(true);
                int var22 = var21 & 0x7;
                int var23 = (var21 & 0x78) >> 3;
                if (var23 == 15) {
                    var23 = -1;
                }
                var3.method4131(var23, var19, var20, 1, (byte) 109, var22);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field10290 = class3.field63.method3834(-8996);
                var3.field10226 = class3.field63.method3768((byte) 105);
                var3.field10298 = class3.field63.method3811(44);
                var3.field10263 = (byte) class3.field63.method3821((byte) 99);
                var3.field10292 = class29.field474 + class3.field63.method3782(128);
                var3.field10234 = class29.field474 + class3.field63.method3782(128);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field10230 = class3.field63.method3834(-8996);
                var3.field10241 = class3.field63.method3768((byte) 91);
                var3.field10235 = class3.field63.method3825(-33);
                var3.field10228 = class3.field63.method3811(97);
                var3.field10231 = class3.field63.method3809(true) + class29.field474;
                var3.field10273 = class3.field63.method3782(128) + class29.field474;
                var3.field10274 = class3.field63.method3783((byte) -45);
                var3.field10230 += var3.field10322[0];
                var3.field10318 = 0;
                var3.field10228 += var3.field10321[0];
                var3.field10235 += var3.field10322[0];
                var3.field10241 += var3.field10321[0];
                var3.field10316 = 1;
            }
            if ((var4 & 0x8) != 0) {
                int[] var24 = new int[4];
                for (int var25 = 0; var25 < 4; var25++) {
                    var24[var25] = class3.field63.method3816(-113);
                    if (var24[var25] == 65535) {
                        var24[var25] = -1;
                    }
                }
                int var26 = class3.field63.method3815((byte) 85);
                class376.method2213((byte) 4, var24, var3, var26);
            }
            if ((var4 & 0x20000) != 0) {
                var3.field7318 = class3.field63.method3793(15598);
                if ("".equals(var3.field7318) || var3.field7318.equals(var3.field7328.field2567)) {
                    var3.field7318 = var3.field7328.field2567;
                }
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field7328.method1193((byte) -86)) {
                    class474.method2671(false, var3);
                }
                var3.method3099((byte) -92, class292.field4177.method2358(class3.field63.method3807(-1), 8881));
                var3.method4146((byte) 106, var3.field7328.field2544);
                var3.field10293 = var3.field7328.field2562 << 3;
                if (var3.field7328.method1193((byte) -106)) {
                    class153.method1120(var3, 0, var3.field10322[0], null, var3.field3508, var3.field10321[0], -652104791, null);
                }
            }
            if ((var4 & 0x10000) != 0) {
                int var27 = class3.field63.method3807(-1);
                int var28 = class3.field63.method3826(-1893167880);
                if (var27 == 65535) {
                    var27 = -1;
                }
                int var29 = class3.field63.method3791(true);
                int var30 = var29 & 0x7;
                int var31 = (var29 & 0x7C) >> 3;
                if (var31 == 15) {
                    var31 = -1;
                }
                var3.method4131(var31, var27, var28, 2, (byte) 118, var30);
            }
            if ((var4 & 0x2) != 0) {
                int var32 = class3.field63.method3816(-106);
                if (var32 == 65535) {
                    var32 = -1;
                }
                int var33 = class3.field63.method3805((byte) 0);
                int var34 = class3.field63.method3821((byte) -42);
                int var35 = var34 & 0x7;
                int var36 = (var34 & 0x7C) >> 3;
                if (var36 == 15) {
                    var36 = -1;
                }
                var3.method4131(var36, var32, var33, 0, (byte) 116, var35);
            }
            if ((var4 & 0x200) != 0) {
                int var37 = class3.field63.method3816(-128);
                var3.field10225 = class3.field63.method3791(true);
                var3.field10262 = class3.field63.method3815((byte) 2);
                var3.field10253 = var37 & 0x7FFF;
                var3.field10264 = (var37 & 0x8000) != 0;
                var3.field10303 = class29.field474 + var3.field10253 + var3.field10225;
            }
            if ((var4 & 0x1) != 0) {
                var3.field7308 = class3.field63.method3782(128);
                var3.field7316 = class3.field63.method3809(true);
            }
            if ((var4 & 0x80000) != 0) {
                var3.field7322 = class3.field63.method3816(-107);
                if (var3.field7322 == 65535) {
                    var3.field7322 = var3.field7328.field2510;
                }
            }
            if ((var4 & 0x4000) != 0) {
                int var38 = var3.field7328.field2516.length;
                int var39 = 0;
                if (var3.field7328.field2556 != null) {
                    var39 = var3.field7328.field2556.length;
                }
                int var40 = 0;
                if (var3.field7328.field2550 != null) {
                    var40 = var3.field7328.field2550.length;
                }
                int var41 = class3.field63.method3821((byte) -96);
                if ((var41 & 0x1) == 1) {
                    var3.field7326 = null;
                } else {
                    int[] var42 = null;
                    if ((var41 & 0x2) == 2) {
                        var42 = new int[var38];
                        for (int var43 = 0; var43 < var38; var43++) {
                            var42[var43] = class3.field63.method3816(-123);
                        }
                    }
                    short[] var44 = null;
                    if ((var41 & 0x4) == 4) {
                        var44 = new short[var39];
                        for (int var45 = 0; var45 < var39; var45++) {
                            var44[var45] = (short) class3.field63.method3809(true);
                        }
                    }
                    short[] var46 = null;
                    if ((var41 & 0x8) == 8) {
                        var46 = new short[var40];
                        for (int var47 = 0; var47 < var40; var47++) {
                            var46[var47] = (short) class3.field63.method3807(-1);
                        }
                    }
                    long var48 = (long) (var3.field7313++) << 32 | (long) var2;
                    var3.field7326 = new class131(var48, var42, var44, var46);
                }
            }
            if ((var4 & 0x800) != 0) {
                int var50 = class3.field63.method3791(true);
                int[] var51 = new int[var50];
                int[] var52 = new int[var50];
                for (int var53 = 0; var53 < var50; var53++) {
                    int var54 = class3.field63.method3816(-96);
                    if ((var54 & 0xC000) == 49152) {
                        int var55 = class3.field63.method3809(true);
                        var51[var53] = class446.method2556(var55, var54 << 16);
                    } else {
                        var51[var53] = var54;
                    }
                    var52[var53] = class3.field63.method3809(true);
                }
                var3.method4139(var52, false, var51);
            }
            if ((var4 & 0x40000) != 0) {
                int var56 = var3.field7328.field2546.length;
                int var57 = 0;
                if (var3.field7328.field2556 != null) {
                    var57 = var3.field7328.field2556.length;
                }
                byte var58 = 0;
                if (var3.field7328.field2550 != null) {
                    var57 = var3.field7328.field2550.length;
                }
                int var59 = class3.field63.method3783((byte) -45);
                if ((var59 & 0x1) != 1) {
                    int[] var60 = null;
                    if ((var59 & 0x2) == 2) {
                        var60 = new int[var56];
                        for (int var61 = 0; var61 < var56; var61++) {
                            var60[var61] = class3.field63.method3809(true);
                        }
                    }
                    short[] var62 = null;
                    if ((var59 & 0x4) == 4) {
                        var62 = new short[var57];
                        for (int var63 = 0; var63 < var57; var63++) {
                            var62[var63] = (short) class3.field63.method3807(-1);
                        }
                    }
                    short[] var64 = null;
                    if ((var59 & 0x8) == 8) {
                        var64 = new short[var58];
                        for (int var65 = 0; var65 < var58; var65++) {
                            var64[var65] = (short) class3.field63.method3816(-108);
                        }
                    }
                    long var66 = (long) (var3.field7309++) << 32 | (long) var2;
                    new class131(var66, var60, var62, var64);
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field10287 = class3.field63.method3816(-95);
                if (var3.field10287 == 65535) {
                    var3.field10287 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field10267 = class3.field63.method3793(15598);
                var3.field10294 = 100;
            }
        }
        field9861++;
    }

    @OriginalMember(owner = "client!lu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9858++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method4004(int arg0) {
        if (arg0 < 31) {
            method4004(90);
        }
        field9859 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V")
    public class714(int arg0) {
        this.field9857 = arg0;
    }
}
