import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class233 extends class99 {

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    private int field4079 = 585;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[Lr;")
    public static class66[] field4077 = new class66[200];

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZI)I")
    public static final int method1521(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return 53;
        } else {
            ++field4080;
            int var3 = -128 + class37.method207(4, arg2 + 45365, arg0 + 91923, -1) + ((-128 + class37.method207(2, arg2 + 10294, arg0 + 37821, -1) >> 1) - -(class37.method207(1, arg2, arg0, -1) + -128 >> 2));
            int var4 = (int) ((double) var3 * 0.3D) - -35;
            if (var4 >= 10) {
                if (var4 > 60) {
                    var4 = 60;
                }
            } else {
                var4 = 10;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        if (arg0 != -65) {
            field4075 = -70;
        }
        field4077 = null;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)[Ljb;")
    public static final class256[] method1523(byte arg0) {
        if (arg0 != 15) {
            method1526(91, 31);
        }
        ++field4078;
        class256[] var1 = new class256[class249.field4397];
        for (int var2 = 0; ~var2 > ~class249.field4397; ++var2) {
            byte[] var3 = class44.field777[var2];
            int var4 = class2.field25[var2] * class199.field3443[var2];
            if (class49.field876[var2]) {
                byte[] var5 = class214.field3677[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; ~var4 < ~var7; ++var7) {
                    var6[var7] = class73.method521(class115.method767(var5[var7] << 24, -16777216), class136.field2517[class115.method767(255, var3[var7])]);
                }
                var1[var2] = new class141(class11.field125, class54.field950, class36.field541[var2], class231.field4029[var2], class2.field25[var2], class199.field3443[var2], var6);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; ++var9) {
                    var8[var9] = class136.field2517[class115.method767(var3[var9], 255)];
                }
                var1[var2] = new class168(class11.field125, class54.field950, class36.field541[var2], class231.field4029[var2], class2.field25[var2], class199.field3443[var2], var8);
            }
        }
        class211.method1365((byte) -93);
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lcj;Lcj;Lie;B)V")
    public static final void method1524(class28 arg0, class28 arg1, class18 arg2, byte arg3) {
        ++field4082;
        class19.field260 = arg1;
        class60.field1020 = arg2;
        class29.field435 = arg0;
        if (arg3 != -117) {
            field4075 = 54;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILcj;ZIIZ)V")
    public static final void method1525(int arg0, class28 arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        class244.field4263 = arg1;
        class73.field1453 = 1;
        class96.field1860 = 10000;
        class54.field948 = arg0;
        if (arg2) {
            field4072 = -46;
        }
        class242.field4225 = arg5;
        class248.field4334 = arg4;
        class246.field4292 = arg3;
        ++field4076;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class233() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
    public static final void method1526(int arg0, int arg1) {
        class98.field1912.method866(new class49(arg1), true);
        ++field4071;
        int var2 = 86 % ((71 - arg0) / 53);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field4074;
        if (arg2 != -1) {
            field4072 = 59;
        }
        if (arg1 == 0) {
            this.field4079 = arg0.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            field4072 = -34;
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class19.field261[arg1];
            for (int var5 = 0; var5 < class199.field3432; ++var5) {
                int var6 = class10.field120[var5];
                if (var6 > this.field4079 && ~var6 > ~(-this.field4079 + 4096) && ~var4 < ~(2048 - this.field4079) && ~var4 > ~(this.field4079 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4079);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field4079 < var6 && ~var6 > ~(this.field4079 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4079;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4079 + 2048);
                } else if (~this.field4079 >= ~var4 && -this.field4079 + 4096 >= var4) {
                    if (var6 >= this.field4079 && 4096 - this.field4079 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4079 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field4079;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4079 + 2048);
                }
            }
        }
        ++field4081;
        return var3;
    }
}
