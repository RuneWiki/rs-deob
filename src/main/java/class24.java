import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class24 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    private int[] field415;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[I")
    private int[] field411;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "S")
    public static short field410 = 205;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    public static int[] field418 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Z")
    public static boolean field426 = true;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public static int[] field417 = new int[5];

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
    public static String field428 = "red:";

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lej;")
    public static class51 field425;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lub;")
    public static class92 field421;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
    public final int method209(int arg0) {
        if (arg0 != 27244) {
            this.method210(17);
        }
        field422++;
        if (this.field419-- == 0) {
            this.method214(112);
            this.field419 = 255;
        }
        return this.field411[this.field419];
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    private final void method210(int arg0) {
        field420++;
        if (arg0 != 4) {
            return;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field411[var11] + var9;
            int var38 = this.field411[var11 + 2] + var7;
            int var39 = this.field411[var11 + 7] + var2;
            int var40 = this.field411[var11 + 3] + var6;
            int var41 = this.field411[var11 + 6] + var3;
            int var42 = this.field411[var11 + 4] + var5;
            int var43 = this.field411[var11 + 1] + var8;
            int var44 = this.field411[var11 + 5] + var4;
            int var45 = var37 ^ var43 << 11;
            int var46 = var40 + var45;
            int var47 = var38 + var43;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var42 + var48;
            int var50 = var38 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            var5 = var54 ^ var53 << 10;
            int var55 = var6 + var41;
            int var56 = var5 + var39;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field415[var11] = var9;
            this.field415[var11 + 1] = var8;
            this.field415[var11 + 2] = var7;
            this.field415[var11 + 3] = var6;
            this.field415[var11 + 4] = var5;
            this.field415[var11 + 5] = var4;
            this.field415[var11 + 6] = var3;
            this.field415[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field415[var12 + 5] + var4;
            int var14 = this.field415[var12 + 1] + var8;
            int var15 = this.field415[var12] + var9;
            int var16 = var15 ^ var14 << 11;
            int var17 = this.field415[var12 + 6] + var3;
            int var18 = this.field415[var12 + 2] + var7;
            int var19 = this.field415[var12 + 3] + var6;
            int var20 = this.field415[var12 + 4] + var5;
            int var21 = var14 + var18;
            int var22 = this.field415[var12 + 7] + var2;
            int var23 = var16 + var19;
            int var24 = var21 ^ var18 >>> 2;
            int var25 = var20 + var24;
            int var26 = var18 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var13 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var5 + var22;
            int var32 = var6 + var17;
            int var33 = var29 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var16;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            int var36 = var31 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field415[var12] = var9;
            this.field415[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field415[var12 + 2] = var7;
            this.field415[var12 + 3] = var6;
            this.field415[var12 + 4] = var5;
            this.field415[var12 + 5] = var4;
            this.field415[var12 + 6] = var3;
            this.field415[var12 + 7] = var2;
        }
        this.method214(105);
        this.field419 = 256;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field429++;
        if (arg2 >= 0 && arg3 >= 0 && arg2 < 103 && arg3 < 103) {
            if (arg0 == 0) {
                class163 var8 = class156.method1129(arg7, arg2, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2448 >>> 32);
                    if (arg6 == 2) {
                        var8.field2456 = new class67(var9, 2, arg1 + 4, arg7, arg2, arg3, arg4, false, var8.field2456);
                        var8.field2459 = new class67(var9, 2, arg1 + 1 & 0x3, arg7, arg2, arg3, arg4, false, var8.field2459);
                    } else {
                        var8.field2456 = new class67(var9, arg6, arg1, arg7, arg2, arg3, arg4, false, var8.field2456);
                    }
                }
            }
            if (arg0 == 1) {
                class56 var10 = class230.method1582(arg7, arg2, arg3);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field880 >>> 32);
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field886 = new class67(var11, 4, arg1, arg7, arg2, arg3, arg4, false, var10.field886);
                    } else if (arg6 == 6) {
                        var10.field886 = new class67(var11, 4, arg1 + 4, arg7, arg2, arg3, arg4, false, var10.field886);
                    } else if (arg6 == 7) {
                        var10.field886 = new class67(var11, 4, (arg1 + 2 & 0x3) + 4, arg7, arg2, arg3, arg4, false, var10.field886);
                    } else if (arg6 == 8) {
                        var10.field886 = new class67(var11, 4, arg1 + 4, arg7, arg2, arg3, arg4, false, var10.field886);
                        var10.field890 = new class67(var11, 4, (arg1 + 2 & 0x3) + 4, arg7, arg2, arg3, arg4, false, var10.field890);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 11) {
                    arg6 = 10;
                }
                class19 var12 = class138.method1023(arg7, arg2, arg3);
                if (var12 != null) {
                    var12.field266 = new class67(Integer.MAX_VALUE & (int) (var12.field267 >>> 32), arg6, arg1, arg7, arg2, arg3, arg4, false, var12.field266);
                }
            }
            if (arg0 == 3) {
                class106 var13 = class118.method861(arg7, arg2, arg3);
                if (var13 != null) {
                    var13.field1664 = new class67(Integer.MAX_VALUE & (int) (var13.field1668 >>> 32), 22, arg1, arg7, arg2, arg3, arg4, false, var13.field1664);
                }
            }
        }
        int var14 = -42 % ((arg5 - 40) / 52);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static void method212(int arg0) {
        field421 = null;
        field417 = null;
        field428 = null;
        if (arg0 == 9066) {
            field425 = null;
            field418 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
    public static final void method213(int arg0, byte arg1, int arg2) {
        field416++;
        for (int var3 = 0; var3 < class200.field3097; var3++) {
            class226 var4 = class222.method1524(var3, 4);
            if (var4 != null) {
                int var5 = var4.field3618;
                if (var5 >= 0 && !class224.field3596.method729(0, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field3619 >= 0) {
                    int var10 = var4.field3619;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class224.field3602[class35.method335(96, (byte) 15, var12)];
                } else if (var5 >= 0) {
                    var6 = class224.field3602[class35.method335(96, (byte) 15, class224.field3596.method732(true, var5))];
                } else if (var4.field3624 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field3624;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class224.field3602[class35.method335(96, (byte) 15, var9)];
                }
                class86.field1277[var3 + 1] = var6;
            }
        }
        if (arg1 != 69) {
            field421 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    private final void method214(int arg0) {
        this.field423 += ++this.field430;
        field413++;
        if (arg0 < 20) {
            this.field411 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field415[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field431 ^= this.field431 << 13;
                } else {
                    this.field431 ^= this.field431 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field431 ^= this.field431 << 2;
            } else {
                this.field431 ^= this.field431 >>> 16;
            }
            this.field431 += this.field415[var2 + 128 & 0xFF];
            int var4;
            this.field415[var2] = var4 = this.field415[class118.method863(var3 >> 2, 255)] + this.field431 + this.field423;
            this.field411[var2] = this.field423 = this.field415[class118.method863(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBIII)V")
    public static final void method215(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field414++;
        int var5 = 0;
        class173.method1240((byte) -77, arg0 + arg3, class55.field872[arg2], arg4, arg0 - arg3);
        int var6 = -arg3;
        int var7 = arg3;
        int var8 = -1;
        while (var7 > var5) {
            var5++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var7--;
                int[] var9 = class55.field872[arg2 + var7];
                var6 -= var7 << 1;
                int var10 = arg0 + var5;
                int var11 = arg0 - var5;
                int[] var12 = class55.field872[arg2 - var7];
                class173.method1240((byte) -100, var10, var9, arg4, var11);
                class173.method1240((byte) -115, var10, var12, arg4, var11);
            }
            int var13 = arg0 + var7;
            int var14 = arg0 - var7;
            int[] var15 = class55.field872[arg2 + var5];
            int[] var16 = class55.field872[arg2 - var5];
            class173.method1240((byte) -92, var13, var15, arg4, var14);
            class173.method1240((byte) -66, var13, var16, arg4, var14);
        }
        if (arg1 != 37) {
            method216((byte) -100, 67, 127, 24, -4);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIII)V")
    public static final void method216(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class174.field2684 != 0 && arg4 != 0 && class274.field4367 < 50 && arg1 != -1) {
            class181.field2842[class274.field4367] = arg1;
            class98.field1567[class274.field4367] = arg4;
            class48.field792[class274.field4367] = arg3;
            class164.field2488[class274.field4367] = null;
            class63.field994[class274.field4367] = 0;
            class303.field4868[class274.field4367] = arg2;
            class274.field4367++;
        }
        field412++;
        int var5 = 41 / ((-arg0 - 70) / 55);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    private class24() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([I)V")
    public class24(int[] arg0) {
        this.field415 = new int[256];
        this.field411 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field411[var2] = arg0[var2];
        }
        this.method210(4);
    }
}
