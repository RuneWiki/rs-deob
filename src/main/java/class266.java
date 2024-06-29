import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class266 extends class214 {

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "Z")
    private boolean field3702 = true;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Z")
    private boolean field3701 = true;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Lcs;")
    public static class351 field3705 = new class351(49, -1);

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field3706 = -1;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "[Lqg;")
    public static class372[] field3710 = new class372[14];

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "Lcs;")
    public static class351 field3709 = new class351(36, 0);

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method11(int arg0, byte arg1) {
        if (arg1 != 92) {
            return null;
        } else {
            ++field3704;
            int[][] var3 = super.field3030.method2780(false, arg0);
            if (super.field3030.field6644) {
                int[][] var4 = this.method1354(0, this.field3701 ? class183.field2659 - arg0 : arg0, (byte) 23);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field3702) {
                    for (int var11 = 0; var11 < class399.field5585; ++var11) {
                        var8[var11] = var5[-var11 + class467.field6551];
                        var9[var11] = var6[-var11 + class467.field6551];
                        var10[var11] = var7[class467.field6551 - var11];
                    }
                } else {
                    for (int var12 = 0; class399.field5585 > var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V", line = 73)
    public static final void method1678(boolean arg0) {
        ++field3700;
        class33.field532.method2562(5, 16139);
        class59.field928.method1977(5, 1);
        class393.field5529.method1240(false, 5);
        class304.field4160.method2077(5, 12790);
        class467.field6550.method1365(5, -1);
        class58.field918.method341(5, (byte) -92);
        class31.field505.method955(5, 14346);
        class163.field2348.method541((byte) -116, 5);
        class147.field2084.method405(-32689, 5);
        class181.field2632.method2426(5, -15384);
        class363.field5161.method2803((byte) 110, 5);
        class292.field4009.method86(9060, 5);
        class425.field5861.method375((byte) -82, 5);
        class68.field1007.method968(5, (byte) -94);
        class192.field2728.method419(68, 5);
        class487.field6864.method2537(5, (byte) 114);
        class191.field2725.method683(5, -119);
        class448.field6178.method1196((byte) -111, 5);
        class38.field659.method1407(5, (byte) -123);
        class375.field5314.method2358(-3946, 5);
        class443.method2577(5, 29);
        class216.method1366(50, 100);
        class429.method2519((byte) -80, 5);
        class39.method319(2048, 5);
        class344.field4712.method666(5, false);
        class196.field2786.method666(5, arg0);
        class479.field6770.method666(5, false);
        class90.field1345.method666(5, false);
        class212.field3006.method666(5, false);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 109)
    public class266() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I", line = 113)
    public final int[] method14(byte arg0, int arg1) {
        if (arg0 != 123) {
            field3708 = -100;
        }
        ++field3703;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int[] var4 = this.method1352(this.field3701 ? -arg1 + class183.field2659 : arg1, 0, -115);
            if (!this.field3702) {
                class415.method2425(var4, 0, var3, 0, class399.field5585);
            } else {
                for (int var5 = 0; ~var5 > ~class399.field5585; ++var5) {
                    var3[var5] = var4[class467.field6551 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)V", line = 159)
    public static void method1679(boolean arg0) {
        field3710 = null;
        if (arg0) {
            field3711 = 123;
        }
        field3709 = null;
        field3705 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Llk;II)V", line = 178)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field3707;
        if (arg1 <= -114) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field3032 = ~arg0.method2503(true) == -2;
                    }
                } else {
                    this.field3701 = ~arg0.method2503(true) == -2;
                }
            } else {
                this.field3702 = arg0.method2503(true) == 1;
            }
        }
    }
}
