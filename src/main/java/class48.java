import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class48 extends class154 {

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
    private int field762 = 4096;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    private int field761 = 0;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "Leg;")
    private static class37 field756 = class174.method1167(" is already on your friend list)3", 63);

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "Leg;")
    public static class37 field763 = field756;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field764;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "[Lrk;")
    public static class14[] field767;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            field756 = null;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field762 = arg0.method1244(false);
            }
        } else {
            this.field761 = arg0.method1244(false);
        }
        ++field768;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
    public static final void method316(byte arg0, int arg1, int arg2) {
        if (~class252.field4507 != -1 && arg1 != -1) {
            class148.method1020(class74.field1169, -2744, false, arg1, 0, class252.field4507);
            class108.field1720 = true;
        }
        ++field765;
        if (arg0 != -117) {
            field763 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public static final void method317(int arg0) {
        ++field759;
        int var1 = class262.field4619 * 128 - -64;
        int var2 = class49.field776 * 128 + 64;
        int var3 = class262.method1768(class237.field4140, var2, var1, (byte) -113) + -class17.field235;
        if (class1.field11 >= 100) {
            class213.field3683 = class49.field776 * 128 - -64;
            class200.field3403 = class262.field4619 * 128 - -64;
            class137.field2338 = class262.method1768(class237.field4140, class213.field3683, class200.field3403, (byte) -128) + -class17.field235;
        } else {
            if (class213.field3683 < var2) {
                class213.field3683 += (-class213.field3683 + var2) * class1.field11 / 1000 + class37.field597;
                if (class213.field3683 > var2) {
                    class213.field3683 = var2;
                }
            }
            if (var3 > class137.field2338) {
                class137.field2338 += (-class137.field2338 + var3) * class1.field11 / 1000 + class37.field597;
                if (~class137.field2338 < ~var3) {
                    class137.field2338 = var3;
                }
            }
            if (var1 > class200.field3403) {
                class200.field3403 += (-class200.field3403 + var1) * class1.field11 / 1000 + class37.field597;
                if (var1 < class200.field3403) {
                    class200.field3403 = var1;
                }
            }
            if (var2 < class213.field3683) {
                class213.field3683 -= (-var2 + class213.field3683) * class1.field11 / 1000 + class37.field597;
                if (~var2 < ~class213.field3683) {
                    class213.field3683 = var2;
                }
            }
            if (~var1 > ~class200.field3403) {
                class200.field3403 -= (-var1 + class200.field3403) * class1.field11 / 1000 + class37.field597;
                if (var1 > class200.field3403) {
                    class200.field3403 = var1;
                }
            }
            if (~var3 > ~class137.field2338) {
                class137.field2338 -= (-var3 + class137.field2338) * class1.field11 / 1000 + class37.field597;
                if (~var3 < ~class137.field2338) {
                    class137.field2338 = var3;
                }
            }
        }
        int var4 = class24.field327 * arg0 - -64;
        int var5 = class81.field1268 * 128 + 64;
        int var6 = class262.method1768(class237.field4140, var5, var4, (byte) -123) + -class81.field1262;
        int var7 = -class137.field2338 + var6;
        int var8 = -class213.field3683 + var5;
        int var9 = -class200.field3403 + var4;
        int var10 = (int) Math.sqrt((double) (var8 * var8 - -(var9 * var9)));
        int var11 = (int) (325.949D * Math.atan2((double) var7, (double) var10)) & 2047;
        if (~var11 > -129) {
            var11 = 128;
        }
        int var12 = 2047 & (int) (Math.atan2((double) var8, (double) var9) * -325.949D);
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class117.field1990;
        if (~class159.field2655 > ~var11) {
            class159.field2655 += (-class159.field2655 + var11) * class148.field2507 / 1000 + class86.field1352;
            if (~var11 > ~class159.field2655) {
                class159.field2655 = var11;
            }
        }
        if (~var13 < -1025) {
            var13 -= 2048;
        }
        if (~var11 > ~class159.field2655) {
            class159.field2655 -= class86.field1352 - -((class159.field2655 - var11) * class148.field2507 / 1000);
            if (~class159.field2655 > ~var11) {
                class159.field2655 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (~var13 < -1) {
            class117.field1990 += class148.field2507 * var13 / 1000 + class86.field1352;
            class117.field1990 &= 2047;
        }
        if (var13 < 0) {
            class117.field1990 -= -var13 * class148.field2507 / 1000 + class86.field1352;
            class117.field1990 &= 2047;
        }
        int var14 = -class117.field1990 + var12;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && ~var13 < -1 || var14 > 0 && var13 < 0) {
            class117.field1990 = var12;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field760;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, arg0, (byte) -119);
            for (int var5 = 0; ~class227.field3898 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field761 <= var6 && ~this.field762 <= ~var6 ? 4096 : 0;
            }
        }
        return arg1 != 1075962732 ? null : var3;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    public static void method318(int arg0) {
        field763 = null;
        if (arg0 != -64) {
            field756 = null;
        }
        field764 = null;
        field767 = null;
        field756 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class48() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)I")
    public static final int method319(int arg0, int arg1) {
        ++field766;
        if (arg1 != 26853) {
            method318(-94);
        }
        return (1996888 & arg0) >> 18;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
    public static final void method320(byte arg0) {
        ++field757;
        int var1 = -26 / ((3 - arg0) / 48);
        int var2 = 0;
        for (int var3 = 0; ~var3 > -105; ++var3) {
            for (int var4 = 0; var4 < 104; ++var4) {
                if (class241.method1666(var2, var3, true, var4, class286.field5048, -30742)) {
                    ++var2;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }
}
