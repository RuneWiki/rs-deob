import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class211 extends class175 {

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    private int field3512 = -1;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "Lij;")
    public static class50 field3502 = class78.method578(126, "Hierhin gehen");

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[Lij;")
    public static class50[] field3511 = new class50[1000];

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "Z")
    public static boolean field3516 = false;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "Ld;")
    public static class75 field3506;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "[I")
    private int[] field3515;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1410(int arg0, int arg1, int arg2, long arg3) {
        ++field3504;
        int var5 = ((int) arg3 & 3655959) >> 20;
        int var6 = 31 & (int) arg3 >> 14;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (~var6 != arg1 && ~var6 != -12 && ~var6 != -23) {
            class26.method243(class239.field4067.field3980[0], true, var6 + 1, false, 0, arg0, arg2, class239.field4067.field3978[0], 0, 0, 2, var5);
        } else {
            class243 var8 = class53.method426((byte) -90, var7);
            int var9 = var8.field4198;
            int var10;
            int var11;
            if (var5 != 0 && var5 != 2) {
                var10 = var8.field4235;
                var11 = var8.field4223;
            } else {
                var11 = var8.field4235;
                var10 = var8.field4223;
            }
            if (var5 != 0) {
                var9 = (15 & var9 << var5) - -(var9 >> -var5 + 4);
            }
            class26.method243(class239.field4067.field3980[0], true, 0, false, var10, arg0, arg2, class239.field4067.field3978[0], var9, var11, 2, 0);
        }
        class258.field4497 = class52.field950;
        class48.field861 = 2;
        class237.field4011 = 0;
        class2.field34 = class56.field1000;
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public final void method803(byte arg0) {
        if (arg0 < 82) {
            this.field3515 = null;
        }
        ++field3508;
        super.method803((byte) 117);
        this.field3515 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (arg0) {
            ++field3503;
            if (~arg1 == -1) {
                this.field3512 = arg2.method1441(-128);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I")
    public final int method1209(int arg0) {
        ++field3513;
        int var2 = 106 % ((44 - arg0) / 42);
        return this.field3512;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)Z")
    private final boolean method1411(int arg0) {
        ++field3509;
        if (arg0 != -5423) {
            field3516 = false;
        }
        if (this.field3515 != null) {
            return true;
        } else if (this.field3512 >= 0) {
            int var2 = field3514;
            int var3 = class220.field3690;
            int var4 = !class154.field2689.method547((byte) -126, this.field3512) ? 128 : 64;
            this.field3515 = class154.field2689.method543((byte) 25, this.field3512);
            this.field3501 = var4;
            this.field3505 = var4;
            class115.method827((byte) -116, var2, var3);
            return this.field3515 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field3517;
        if (arg1 != -20740) {
            this.field3505 = 31;
        }
        int[][] var3 = super.field2920.method117(arg0, (byte) -61);
        if (super.field2920.field356 && this.method1411(arg1 + 15317)) {
            int var4 = this.field3505 * (class220.field3690 != this.field3501 ? this.field3501 * arg0 / class220.field3690 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (field3514 == this.field3505) {
                for (int var8 = 0; ~var8 > ~field3514; ++var8) {
                    int var9 = this.field3515[var4++];
                    var7[var8] = class51.method413(var9, 255) << 4;
                    var6[var8] = class51.method413(4080, var9 >> 4);
                    var5[var8] = class51.method413(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; field3514 > var10; ++var10) {
                    int var11 = this.field3505 * var10 / field3514;
                    int var12 = this.field3515[var4 + var11];
                    var7[var10] = class51.method413(var12, 255) << 4;
                    var6[var10] = class51.method413(4080, var12 >> 4);
                    var5[var10] = class51.method413(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3507;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = -arg2 + arg0;
        int var12 = -arg2 + arg3;
        int var13 = arg0 * arg0;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        if (arg6 == -947238911) {
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var15 << 1;
            int var20 = arg3 << 1;
            int var21 = var16 << 1;
            int var22 = var12 << 1;
            int var23 = (-var20 + 1) * var13 + var17;
            int var24 = -((var20 - 1) * var18) + var14;
            int var25 = (-var22 + 1) * var16 + var19;
            int var26 = var15 - (var22 - 1) * var21;
            int var27 = var13 << 2;
            int var28 = var16 << 2;
            int var29 = var14 << 2;
            int var30 = (var20 - 3) * var18;
            int var31 = var15 << 2;
            int var32 = var17 * 3;
            int var33 = var29;
            int var34 = var19 * 3;
            int var35 = (var22 + -3) * var21;
            int var36 = (arg3 + -1) * var27;
            int var37 = (var12 + -1) * var28;
            int[] var38 = class177.field2963[arg5];
            int var39 = var31;
            class155.method1090(var38, arg4 - arg0, arg1, 160, -var11 + arg4);
            class155.method1090(var38, -var11 + arg4, arg7, 160, arg4 - -var11);
            class155.method1090(var38, arg4 - -var11, arg1, 160, arg4 - -arg0);
            while (var9 > 0) {
                if (var23 < 0) {
                    while (~var23 > -1) {
                        var23 += var32;
                        ++var8;
                        var24 += var33;
                        var32 += var29;
                        var33 += var29;
                    }
                }
                boolean var40 = ~var9 >= ~var12;
                if (var40) {
                    if (var25 < 0) {
                        while (var25 < 0) {
                            var25 += var34;
                            var34 += var31;
                            ++var10;
                            var26 += var39;
                            var39 += var31;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var39;
                        var25 += var34;
                        ++var10;
                        var34 += var31;
                        var39 += var31;
                    }
                    var26 += -var35;
                    var35 -= var28;
                    var25 += -var37;
                    var37 -= var28;
                }
                if (~var24 > -1) {
                    ++var8;
                    var23 += var32;
                    var24 += var33;
                    var32 += var29;
                    var33 += var29;
                }
                --var9;
                var24 += -var30;
                int var41 = arg5 + var9;
                int var42 = -var9 + arg5;
                var30 -= var27;
                int var43 = arg4 + var8;
                int var44 = -var8 + arg4;
                if (var40) {
                    int var45 = arg4 - -var10;
                    int var46 = arg4 - var10;
                    class155.method1090(class177.field2963[var42], var44, arg1, 160, var46);
                    class155.method1090(class177.field2963[var42], var46, arg7, arg6 ^ -947238751, var45);
                    class155.method1090(class177.field2963[var42], var45, arg1, arg6 + 947239071, var43);
                    class155.method1090(class177.field2963[var41], var44, arg1, 160, var46);
                    class155.method1090(class177.field2963[var41], var46, arg7, arg6 + 947239071, var45);
                    class155.method1090(class177.field2963[var41], var45, arg1, arg6 ^ -947238751, var43);
                } else {
                    class155.method1090(class177.field2963[var42], var44, arg1, 160, var43);
                    class155.method1090(class177.field2963[var41], var44, arg1, 160, var43);
                }
                var23 += -var36;
                var36 -= var27;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lcg;")
    public static final class117 method1413(byte arg0, int arg1) {
        class117 var2 = (class117) class221.field3718.method912((long) arg1, (byte) 84);
        ++field3518;
        int var3 = 47 % ((arg0 - -81) / 42);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var4 = class177.field2959.method190((byte) -92, class209.method1401(arg1, 5), class258.method1739(23918, arg1));
            class117 var5 = new class117();
            if (var4 != null) {
                var5.method846(new class217(var4), true);
            }
            class221.field3718.method913(var5, 110, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class211() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
    public static void method1414(int arg0) {
        if (arg0 == 0) {
            field3511 = null;
            field3506 = null;
            field3502 = null;
        }
    }
}
