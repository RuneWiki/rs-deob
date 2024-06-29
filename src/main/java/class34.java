import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class34 extends class139 {

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    private int field435 = 2000;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    private int field434 = 16;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    private int field438 = 4096;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field437 = 0;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    private int field440 = 0;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "Lus;")
    public static class1 field439 = new class1(51, 4);

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Lcp;")
    public static class470 field443 = new class470(512);

    @OriginalMember(owner = "client!na", name = "W", descriptor = "[I")
    public static int[] field444 = new int[2];

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Lkr;")
    public static class486 field445 = new class486();

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Lgm;")
    public static class70 field446 = new class70(0, 0);

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        class224.method1439(-114);
        if (arg0 != 7) {
            method227((byte) 65);
        }
        ++field430;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            field439 = null;
        }
        ++field441;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int var4 = this.field438 >> 1;
            int[][] var5 = super.field1844.method2175(-120);
            Random var6 = new Random((long) this.field440);
            for (int var7 = 0; this.field435 > var7; ++var7) {
                int var8 = ~this.field438 >= -1 ? this.field437 : this.field437 + -var4 + class351.method2194(arg1 + -27903, var6, this.field438);
                int var9 = (var8 & 4086) >> 4;
                int var10 = class351.method2194(-113, var6, class356.field5147);
                int var11 = class351.method2194(-126, var6, class241.field3615);
                int var12 = (class311.field4401[var9] * this.field434 >> 12) + var10;
                int var13 = (class253.field3720[var9] * this.field434 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class351.method2194(25, var6, 4096) >> 2);
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = var28 & class414.field5822;
                        int var31 = var21 & class388.field5511;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(B)V")
    public static void method227(byte arg0) {
        field443 = null;
        field446 = null;
        field439 = null;
        if (arg0 <= 74) {
            method229((byte) 127, 100);
        }
        field445 = null;
        field444 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)I")
    public static final int method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field431;
        if (~(arg3 & 1) == -2) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        int var8 = arg2 & 3;
        if (var8 == 0) {
            return arg6;
        } else {
            if (arg4 != 4096) {
                field445 = null;
            }
            if (~var8 == -2) {
                return arg5;
            } else {
                return var8 == 2 ? -arg1 + 7 + 1 + -arg6 : -arg0 + 1 + -arg5 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field438 = arg0.method1729(65280);
                        }
                    } else {
                        this.field437 = arg0.method1729(65280);
                    }
                } else {
                    this.field434 = arg0.method1701(-23121);
                }
            } else {
                this.field435 = arg0.method1729(65280);
            }
        } else {
            this.field440 = arg0.method1701(-23121);
        }
        if (arg1 != -45) {
            this.field438 = 105;
        }
        ++field433;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
    public static final void method229(byte arg0, int arg1) {
        ++field436;
        class489 var2 = class116.method731(-625541408, 12, arg1);
        var2.method2861(-229012000);
        if (arg0 >= -37) {
            method227((byte) -111);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)[Lus;")
    public static final class1[] method230(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field442;
            return new class1[] { class184.field2712, class63.field829, class343.field4995, class249.field3677, class93.field1179, class480.field6732, class225.field3414, class124.field1555, class492.field6933, class412.field5805, class327.field4734, class405.field5700, class303.field4312, class333.field4845, class459.field6435, class427.field5981, class132.field1737, class142.field1884, class431.field6037, class216.field3229, class125.field1633, class125.field1634, class225.field3412, class182.field2639, class50.field676, class33.field426, class252.field3719, class252.field3713, class268.field3919, class412.field5803, class424.field5950, class138.field1829, class327.field4715, class206.field3160, class393.field5569, class441.field6120, class125.field1618, class492.field6937, class172.field2505, class179.field2585, class170.field2484, class111.field1416, class373.field5385, class370.field5338, class30.field403, class339.field4950, class261.field3826, class289.field4204, class90.field1125, class446.field6180, class407.field5714, field439, class428.field6006, class305.field4339, class132.field1742, class250.field3690, class388.field5505, class20.field273, class481.field6742, class286.field4171, class339.field4949, class362.field5203, class267.field3904, class206.field3150, class157.field2342, class142.field1891, class222.field3379, class466.field6510, class224.field3395, class368.field5323, class229.field3455, class170.field2482, class361.field5192, class483.field6804, class349.field5054, class265.field3884, class401.field5674, class8.field77, class275.field3988, class332.field4837, class180.field2595, class326.field4706, class491.field6918, class266.field3889, class306.field4355, class177.field2535, class61.field803, class431.field6042, class55.field743, class38.field509, class306.field4345, class325.field4683, class94.field1207, class306.field4354, class305.field4341, class160.field2362, class240.field3601, class37.field486, class167.field2445, class351.field5084, class191.field2836, class7.field68, class231.field3497, class209.field3184, class58.field759, class145.field2017 };
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V")
    public static final void method231(int arg0, int arg1, int arg2) {
        if (arg0 < -65) {
            ++field432;
            class489 var3 = class116.method731(-625541408, 16, arg1);
            var3.method2863(255);
            var3.field6895 = arg2;
        }
    }
}
