import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class240 extends class107 {

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "Z")
    public static volatile boolean field4220 = true;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field4230 = 0;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "[Lcj;")
    public static class115[] field4221;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)Lpj;")
    public static final class237 method1666(int arg0, boolean arg1) {
        ++field4228;
        if (!arg1) {
            method1672((byte) 9);
        }
        class237 var2 = new class237();
        var2.field4151 = new byte[arg0];
        var2.field4114 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field4227;
        if (arg2 != -32513) {
            field4221 = null;
        }
        if (arg1 == 0) {
            super.field1897 = arg0.method316((byte) 95) == 1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class240() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int[][] var3 = super.field1903.method634(arg1, 13012);
        int var4 = -125 / ((arg0 - 26) / 45);
        ++field4218;
        if (super.field1903.field1551) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class106.field1862; ++var8) {
                this.method1670(var8, arg1, -1);
                int[][] var9 = this.method802(3, class58.field1185, 0);
                var5[var8] = var9[0][class51.field1075];
                var6[var8] = var9[1][class51.field1075];
                var7[var8] = var9[2][class51.field1075];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lpj;IIIJII)V")
    public static final void method1667(class237 arg0, int arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        ++field4222;
        class32 var8 = new class32(arg1);
        var8.method293((byte) 125, 10);
        var8.method350((byte) 19, (int) (99999.0D * Math.random()));
        var8.method350((byte) 19, 515);
        var8.method292(-86, arg4);
        var8.method290((byte) -20, (int) (Math.random() * 9.9999999E7D));
        var8.method334(-121, arg0);
        var8.method290((byte) -20, (int) (9.9999999E7D * Math.random()));
        var8.method350((byte) 19, class106.field1873);
        var8.method293((byte) 125, arg2);
        var8.method293((byte) 125, arg5);
        var8.method290((byte) -20, (int) (Math.random() * 9.9999999E7D));
        var8.method350((byte) 19, arg6);
        var8.method350((byte) 19, arg3);
        var8.method290((byte) -20, (int) (9.9999999E7D * Math.random()));
        var8.method327(-10248, class177.field3116, class104.field1829);
        class223.field3830.field647 = 0;
        class223.field3830.method293((byte) 125, 60);
        class223.field3830.method293((byte) 125, var8.field647);
        class223.field3830.method320(0, var8.field644, var8.field647, 16);
        class182.field3203 = 1;
        class207.field3534 = 0;
        class45.field974 = -3;
        class63.field1259 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V")
    public static void method1668(int arg0) {
        if (arg0 != -2048) {
            method1671(48, -91, -121, 24, 41, 91, 61, -79);
        }
        field4221 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILsb;)V")
    public static final void method1669(int arg0, class215 arg1) {
        if (arg0 != -1) {
            field4220 = true;
        }
        arg1.field3675 = false;
        if (~arg1.field3696 != 0) {
            class256 var2 = class256.method1732(arg1.field3696, true);
            if (var2 != null && var2.field4416 != null) {
                ++arg1.field3709;
                if (~arg1.field3698 > ~var2.field4416.length && arg1.field3709 > var2.field4383[arg1.field3698]) {
                    ++arg1.field3698;
                    arg1.field3709 = 1;
                    class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3698, (byte) 63, arg1.field3710, var2);
                }
                if (var2.field4416.length <= arg1.field3698) {
                    arg1.field3709 = 0;
                    arg1.field3698 = 0;
                    class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3698, (byte) 83, arg1.field3710, var2);
                }
            } else {
                arg1.field3696 = -1;
            }
        }
        if (~arg1.field3734 != 0 && arg1.field3735 <= class241.field4246) {
            int var3 = class190.method1288(arg1.field3734, (byte) 115).field1054;
            if (var3 != -1) {
                class256 var4 = class256.method1732(var3, true);
                if (var4 != null && var4.field4416 != null) {
                    if (~arg1.field3680 > -1) {
                        arg1.field3680 = 0;
                        class95.method706(arg1.field3700, class229.field3911 == arg1, 0, (byte) 97, arg1.field3710, var4);
                    }
                    ++arg1.field3728;
                    if (~var4.field4416.length < ~arg1.field3680 && var4.field4383[arg1.field3680] < arg1.field3728) {
                        ++arg1.field3680;
                        arg1.field3728 = 1;
                        class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3680, (byte) 69, arg1.field3710, var4);
                    }
                    if (~arg1.field3680 <= ~var4.field4416.length) {
                        arg1.field3734 = -1;
                    }
                } else {
                    arg1.field3734 = -1;
                }
            } else {
                arg1.field3734 = -1;
            }
        }
        ++field4224;
        if (~arg1.field3722 != 0 && arg1.field3688 <= 1) {
            class256 var5 = class256.method1732(arg1.field3722, true);
            if (var5.field4392 == 1 && ~arg1.field3703 < -1 && ~class241.field4246 <= ~arg1.field3729 && ~class241.field4246 < ~arg1.field3714) {
                arg1.field3688 = 1;
                return;
            }
        }
        if (~arg1.field3722 != 0 && ~arg1.field3688 == -1) {
            class256 var6 = class256.method1732(arg1.field3722, true);
            if (var6 != null && var6.field4416 != null) {
                ++arg1.field3684;
                if (~var6.field4416.length < ~arg1.field3673 && arg1.field3684 > var6.field4383[arg1.field3673]) {
                    ++arg1.field3673;
                    arg1.field3684 = 1;
                    class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3673, (byte) 80, arg1.field3710, var6);
                }
                if (var6.field4416.length <= arg1.field3673) {
                    ++arg1.field3737;
                    arg1.field3673 -= var6.field4393;
                    if (~arg1.field3737 <= ~var6.field4415) {
                        arg1.field3722 = -1;
                    } else if (~arg1.field3673 <= -1 && ~arg1.field3673 > ~var6.field4416.length) {
                        class95.method706(arg1.field3700, class229.field3911 == arg1, arg1.field3673, (byte) 100, arg1.field3710, var6);
                    } else {
                        arg1.field3722 = -1;
                    }
                }
                arg1.field3675 = var6.field4398;
            } else {
                arg1.field3722 = -1;
            }
        }
        if (arg1.field3688 > 0) {
            --arg1.field3688;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)V")
    private final void method1670(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1671(-89, -52, 96, 9, 76, 39, -72, 32);
        }
        ++field4225;
        int var4 = class182.field3199[arg0];
        int var5 = class185.field3233[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class58.field1185 = arg1;
            class51.field1075 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class51.field1075 = arg1;
            class58.field1185 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class51.field1075 = -arg1 + class106.field1862;
            class58.field1185 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class51.field1075 = arg0;
            class58.field1185 = class193.field3342 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class58.field1185 = -arg1 + class193.field3342;
            class51.field1075 = -arg0 + class106.field1862;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class58.field1185 = -arg0 + class193.field3342;
            class51.field1075 = class106.field1862 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class58.field1185 = -arg0 + class193.field3342;
            class51.field1075 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class58.field1185 = arg1;
            class51.field1075 = -arg0 + class106.field1862;
        }
        class51.field1075 &= class110.field1937;
        class58.field1185 &= class254.field4363;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4229;
        int var8 = class91.method689(arg6, class13.field215, class34.field727, (byte) -88);
        if (arg2 != -2048) {
            field4226 = 2;
        }
        int var9 = class91.method689(arg3, class13.field215, class34.field727, (byte) 48);
        int var10 = class91.method689(arg1, class89.field1637, class94.field1676, (byte) 114);
        int var11 = class91.method689(arg4, class89.field1637, class94.field1676, (byte) -121);
        int var12 = class91.method689(arg0 + arg6, class13.field215, class34.field727, (byte) -92);
        int var13 = class91.method689(arg3 - arg0, class13.field215, class34.field727, (byte) 112);
        for (int var14 = var8; var12 > var14; ++var14) {
            class199.method1361(arg5, var11, class62.field1241[var14], var10, 72);
        }
        for (int var15 = var9; var13 < var15; --var15) {
            class199.method1361(arg5, var11, class62.field1241[var15], var10, arg2 ^ -1993);
        }
        int var16 = class91.method689(arg1 - -arg0, class89.field1637, class94.field1676, (byte) 40);
        int var17 = class91.method689(-arg0 + arg4, class89.field1637, class94.field1676, (byte) -99);
        for (int var18 = var12; ~var18 >= ~var13; ++var18) {
            int[] var19 = class62.field1241[var18];
            class199.method1361(arg5, var16, var19, var10, 94);
            class199.method1361(arg7, var17, var19, var16, 54);
            class199.method1361(arg5, var11, var19, var17, 57);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            ++field4223;
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            if (super.field1921.field3539) {
                for (int var4 = 0; ~var4 > ~class106.field1862; ++var4) {
                    this.method1670(var4, arg1, -1);
                    int[] var5 = this.method797(0, class58.field1185, (byte) -51);
                    var3[var4] = var5[class51.field1075];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
    public static final void method1672(byte arg0) {
        ++field4219;
        int var1 = 0;
        int[] var2 = new int[class148.field2633];
        for (int var3 = 0; var3 < class148.field2633; ++var3) {
            class8 var5 = class112.method829((byte) -82, var3);
            if (var5.field176 >= 0 || var5.field162 >= 0) {
                var2[var1++] = var3;
            }
        }
        if (arg0 != 88) {
            method1672((byte) 91);
        }
        class224.field3863 = new int[var1];
        for (int var4 = 0; var4 < var1; ++var4) {
            class224.field3863[var4] = var2[var4];
        }
    }
}
