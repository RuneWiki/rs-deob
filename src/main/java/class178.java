import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class178 {

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public static int[] field2560 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    private int field2551;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 3)
    public final void method1107(int arg0, int arg1) {
        this.field2552 = arg0;
        field2555++;
        this.field2551 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)Z", line = 12)
    public static final boolean method1108(int arg0, int arg1, byte arg2) {
        field2558++;
        if ((class82.method608(arg1, arg0, -106) | (arg0 & 0x10000) != 0) || class68.method532(arg0, arg1, -83)) {
            return true;
        } else {
            int var3 = -104 / ((arg2 - 33) / 56);
            return (arg1 & 0x37) == 0 && class414.method2453(arg1, arg0, -120);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 26)
    public final void method1109(int arg0) {
        this.field2552 &= 0x3FFF;
        field2557++;
        if (arg0 != 32) {
            method1112(-36, 114, 66);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I", line = 38)
    public final int method1110(int arg0) {
        if (arg0 != 0) {
            this.field2551 = 8;
        }
        field2549++;
        return this.field2552 & 0x3FFF;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lhm;Lza;III)V", line = 49)
    public static final void method1111(class150 arg0, class290 arg1, int arg2, int arg3, int arg4) {
        field2559++;
        class145 var5 = arg0.method944(arg1, arg3 ^ 0xFFFFC0B5);
        if (var5 == null) {
            return;
        }
        if (arg3 != 16202) {
            method1114(-95);
        }
        arg1.method301(arg4, arg2, arg4 + arg0.field2113, arg0.field2033 + arg2);
        if (class230.field3393 == 2 || class230.field3393 == 5 || class463.field6476 == null) {
            arg1.method300(-16777216, var5, arg4, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class504.field7461 == 4) {
            var6 = 4096;
            var8 = class360.field5147;
            var7 = class168.field2451;
            var9 = (int) (-class153.field2204) & 0x3FFF;
        } else {
            var6 = 4096 - (class98.field1304 * 16);
            var7 = class246.field3587.field1899;
            var8 = class246.field3587.field1896;
            var9 = (int) (-class153.field2204) + class460.field6441 & 0x3FFF;
        }
        int var10 = var8 / 32 + 48 + 208 - (class43.field494 * 2);
        int var11 = class500.field7068 * 4 + 48 - (var7 / 32) - ((class500.field7068 + -104) * 2);
        class463.field6476.method156((float) arg0.field2113 / 2.0F + (float) arg4, (float) arg0.field2033 / 2.0F + (float) arg2, (float) var10, (float) var11, var6, var9 << 2, var5, arg4, arg2);
        for (class254 var12 = (class254) class368.field5249.method2655(15152); var12 != null; var12 = (class254) class368.field5249.method2660((byte) 67)) {
            int var58 = var12.field3757;
            int var59 = (class399.field5628.field3837[var58] >> 14 & 0x3FFF) - class441.field6171;
            int var60 = (class399.field5628.field3837[var58] & 0x3FFF) - class367.field5241;
            int var61 = var59 * 4 + (2 - var8 / 32);
            int var62 = var60 * 4 + 2 - (var7 / 32);
            client.method1289(var61, var62, var5, arg1, class399.field5628.field3840[var58], 1, arg0, arg4, arg2);
        }
        for (int var13 = 0; var13 < class216.field3124; var13++) {
            int var55 = class15.field191[var13] * 4 + 2 - var8 / 32;
            int var56 = class2.field58[var13] * 4 + 2 - (var7 / 32);
            class270 var57 = class377.field5338.method1901(arg3 - 16152, class154.field2214[var13]);
            if (var57.field3998 != null) {
                var57 = var57.method1704((byte) 125, class163.field2413);
                if (var57 == null || var57.field3959 == -1) {
                    continue;
                }
            }
            client.method1289(var55, var56, var5, arg1, var57.field3959, 1, arg0, arg4, arg2);
        }
        for (class176 var14 = (class176) class62.field773.method2414((byte) -128); var14 != null; var14 = (class176) class62.field773.method2410((byte) 123)) {
            int var50 = (int) (var14.field7060 >> 28 & 0x3L);
            if (class156.field2352 == var50) {
                int var51 = (int) (var14.field7060 & 0x3FFFL) - class441.field6171;
                int var52 = (int) (var14.field7060 >> 14 & 0x3FFFL) - class367.field5241;
                int var53 = var51 * 4 + 2 - (var8 / 32);
                int var54 = var52 * 4 + 2 - (var7 / 32);
                class214.method1341(var53, arg0, arg4, 0, var5, class460.field6424[0], arg2, var54);
            }
        }
        for (int var15 = 0; var15 < class434.field6110; var15++) {
            class378 var45 = (class378) class125.field1687.method2405((long) class488.field6834[var15], arg3 ^ 0xFFFFC0FB);
            if (var45 != null) {
                class429 var46 = var45.field5353;
                if (var46.method2538(arg3 - 16203) && class246.field3587.field1904 == var46.field1904) {
                    class322 var47 = var46.field6055;
                    if (var47 != null && var47.field4693 != null) {
                        var47 = var47.method1939(15964, class163.field2413);
                    }
                    if (var47 != null && var47.field4643 && var47.field4701) {
                        int var48 = var46.field1896 / 32 - var8 / 32;
                        int var49 = var46.field1899 / 32 - var7 / 32;
                        if (var47.field4649 == -1) {
                            class214.method1341(var48, arg0, arg4, arg3 ^ 0x3F4A, var5, class460.field6424[1], arg2, var49);
                        } else {
                            client.method1289(var48, var49, var5, arg1, var47.field4649, arg3 ^ 0x3F4B, arg0, arg4, arg2);
                        }
                    }
                }
            }
        }
        int var16 = class144.field1908;
        int[] var17 = class521.field7674;
        for (int var18 = 0; var18 < var16; var18++) {
            class22 var37 = class378.field5355[var17[var18]];
            if (var37 != null && var37.method123(arg3 ^ 0xFFFFC0B5) && class246.field3587 != var37 && class246.field3587.field1904 == var37.field1904) {
                int var38 = var37.field1896 / 32 - var8 / 32;
                int var39 = var37.field1899 / 32 - (var7 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class520.field7656; var41++) {
                    if (var37.field256.equals(class540.field7902[var41]) && class505.field7488[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class305.field4435; var43++) {
                    if (var37.field256.equals(class4.field80[var43].field7749)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class246.field3587.field269 != 0 && var37.field269 != 0 && class246.field3587.field269 == var37.field269) {
                    var44 = true;
                }
                if (var37.field276) {
                    class214.method1341(var38, arg0, arg4, arg3 ^ 0x3F4A, var5, class460.field6424[6], arg2, var39);
                } else if (var40) {
                    class214.method1341(var38, arg0, arg4, 0, var5, class460.field6424[3], arg2, var39);
                } else if (var42) {
                    class214.method1341(var38, arg0, arg4, 0, var5, class460.field6424[5], arg2, var39);
                } else if (var44) {
                    class214.method1341(var38, arg0, arg4, 0, var5, class460.field6424[4], arg2, var39);
                } else {
                    class214.method1341(var38, arg0, arg4, arg3 - 16202, var5, class460.field6424[2], arg2, var39);
                }
            }
        }
        class373[] var19 = class20.field234;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class373 var23 = var19[var20];
            if (var23 != null && var23.field5302 != 0 && (class390.field5481 % 20) < 10) {
                if (var23.field5302 == 1) {
                    class378 var24 = (class378) class125.field1687.method2405((long) var23.field5310, -84);
                    if (var24 != null) {
                        class429 var25 = var24.field5353;
                        int var26 = var25.field1896 / 32 - (var8 / 32);
                        int var27 = var25.field1899 / 32 - (var7 / 32);
                        class419.method2484(var5, var27, (byte) -110, var26, arg2, var23.field5306, arg0, arg4, 360000L);
                    }
                }
                if (var23.field5302 == 2) {
                    int var28 = var23.field5308 / 32 - (var8 / 32);
                    int var29 = var23.field5305 / 32 - (var7 / 32);
                    long var30 = (long) (var23.field5311 << 5);
                    long var32 = var30 * var30;
                    class419.method2484(var5, var29, (byte) -122, var28, arg2, var23.field5306, arg0, arg4, var32);
                }
                if (var23.field5302 == 10 && var23.field5310 >= 0 && var23.field5310 < class378.field5355.length) {
                    class22 var34 = class378.field5355[var23.field5310];
                    if (var34 != null) {
                        int var35 = var34.field1896 / 32 - (var8 / 32);
                        int var36 = var34.field1899 / 32 - (var7 / 32);
                        class419.method2484(var5, var36, (byte) -128, var35, arg2, var23.field5306, arg0, arg4, 360000L);
                    }
                }
            }
        }
        if (class504.field7461 == 4) {
            return;
        }
        if (class243.field3527 != 0) {
            int var21 = class243.field3527 * 4 + (class246.field3587.method125((byte) -111) + -1) * 2 + 2 - (var8 / 32);
            int var22 = (class282.field4153 * 4 - (var7 / 32) - (-(class246.field3587.method125((byte) -124) * 2) + 2)) + 2;
            class214.method1341(var21, arg0, arg4, arg3 ^ 0x3F4A, var5, class357.field5119[class395.field5609 ? 1 : 0], arg2, var22);
        }
        arg1.method1794(3, arg0.field2033 / 2 + arg2 - 1, -1, 3, arg3 ^ 0x3F22, arg0.field2113 / 2 + arg4 - 1);
        return;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I", line = 365)
    public static final int method1112(int arg0, int arg1, int arg2) {
        if (arg2 == -10551) {
            field2553++;
            int var3 = arg1 >> 31 & arg0 - 1;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 391)
    public static void method1113(int arg0) {
        if (arg0 != -1) {
            method1114(-68);
        }
        field2560 = null;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 401)
    public static final void method1114(int arg0) {
        field2550++;
        class22.field267.method550((byte) -4);
        class15.field189 = arg0;
        class234.field3410 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)Z", line = 413)
    public final boolean method1115(int arg0, int arg1, int arg2, int arg3) {
        field2554++;
        int var5 = this.field2551;
        if (this.field2552 == arg0 && this.field2551 == 0) {
            return false;
        }
        boolean var8;
        if (this.field2551 == 0) {
            if (this.field2552 < arg0 && arg0 <= (this.field2552 + arg1) || this.field2552 > arg0 && arg0 >= (this.field2552 - arg1)) {
                this.field2552 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field2551 > 0 && this.field2552 < arg0) {
            int var6 = this.field2551 * this.field2551 / (arg1 * 2);
            int var7 = this.field2552 + var6;
            if (arg0 > var7 && this.field2552 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field2551 < 0 && this.field2552 > arg0) {
            int var9 = this.field2551 * this.field2551 / (arg1 * 2);
            int var10 = this.field2552 - var9;
            if (var10 > arg0 && this.field2552 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field2552 < arg0) {
                this.field2551 += arg1;
                if (arg2 != 0 && arg2 < this.field2551) {
                    this.field2551 = arg2;
                }
            } else {
                this.field2551 -= arg1;
                if (arg2 != 0 && this.field2551 < -arg2) {
                    this.field2551 = -arg2;
                }
            }
            if (this.field2551 != var5) {
                int var11 = this.field2551 * this.field2551 / (arg1 * 2);
                if (arg0 > this.field2552) {
                    if ((this.field2552 + var11) > arg0) {
                        this.field2551 = var5;
                    }
                } else if (arg0 < this.field2552 && arg0 > this.field2552 - var11) {
                    this.field2551 = var5;
                }
            }
        } else if (this.field2551 <= 0) {
            this.field2551 += arg1;
            if (this.field2551 > 0) {
                this.field2551 = 0;
            }
        } else {
            this.field2551 -= arg1;
            if (this.field2551 < 0) {
                this.field2551 = 0;
            }
        }
        if (arg3 != -19500) {
            field2560 = null;
        }
        this.field2552 += this.field2551 + var5 >> 1;
        return var8;
    }
}
