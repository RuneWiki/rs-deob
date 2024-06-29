import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class2 extends class99 {

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    private int field18 = 0;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    private int field16 = 2000;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    private int field24 = 16;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    private int field29 = 4096;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "[[S")
    public static short[][] field15 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "Lr;")
    private static class66 field17 = class93.method641(43, "Connecting to update server");

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Lr;")
    public static class66 field21 = field17;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Z")
    public static boolean field27 = false;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Ljava/util/Calendar;")
    public static Calendar field22 = Calendar.getInstance();

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lr;")
    public static class66 field31 = class93.method641(43, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "Ltg;")
    public static class215 field33 = new class215(16);

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "Lr;")
    public static class66 field34 = class93.method641(43, "::errortest");

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "[I")
    public static int[] field25;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "[Ljb;")
    public static class256[] field32;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
    public static final void method7(int arg0, int arg1) {
        class192.field3323 = arg0;
        ++field23;
        class15.field196 = -1;
        if (arg1 >= 88) {
            class15.field196 = -1;
            class167.method1130(-1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field15 = null;
        field34 = null;
        field31 = null;
        field22 = null;
        field33 = null;
        field17 = null;
        field32 = null;
        if (arg0 == 24) {
            field21 = null;
            field25 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method9(boolean arg0) {
        if (!arg0) {
            field27 = false;
        }
        ++field14;
        class156.field2768.method1614(110);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field28;
        if (arg0 != -61) {
            return null;
        } else {
            int[] var3 = super.field1943.method749(false, arg1);
            if (super.field1943.field2147) {
                int var4 = this.field29 >> 1;
                int[][] var5 = super.field1943.method748(-32044);
                Random var6 = new Random((long) this.field26);
                for (int var7 = 0; var7 < this.field16; ++var7) {
                    int var8 = this.field29 <= 0 ? this.field18 : this.field18 + (class256.method1717(this.field29, (byte) 70, var6) - var4);
                    int var9 = 255 & var8 >> 4;
                    int var10 = class256.method1717(class199.field3432, (byte) 70, var6);
                    int var11 = class256.method1717(class16.field223, (byte) 70, var6);
                    int var12 = (class143.field2612[var9] * this.field24 >> 12) + var11;
                    int var13 = (class146.field2668[var9] * this.field24 >> 12) + var10;
                    int var14 = -var11 + var12;
                    int var15 = -var10 + var13;
                    if (var15 != 0 || ~var14 != -1) {
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var13;
                            var11 = var17;
                            var13 = var12;
                            var12 = var18;
                        }
                        if (var10 > var13) {
                            int var19 = var10;
                            var10 = var13;
                            var13 = var19;
                            int var20 = var11;
                            var11 = var12;
                            var12 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var13;
                        int var23 = -var22 / 2;
                        int var24 = 2048 / var22;
                        int var25 = -var11 + var12;
                        if (var25 < 0) {
                            var25 = -var25;
                        }
                        int var26 = -(class256.method1717(4096, (byte) 70, var6) >> 2) + 1024;
                        int var27 = var12 <= var11 ? -1 : 1;
                        for (int var28 = var10; ~var13 < ~var28; ++var28) {
                            var23 += var25;
                            int var29 = (-var10 + var28) * var24 + var26 + 1024;
                            int var30 = class98.field1914 & var28;
                            int var31 = var21 & class45.field833;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (var23 > 0) {
                                var23 += -var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field20;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field29 = arg0.method1674(arg2 ^ -1355769545);
                        }
                    } else {
                        this.field18 = arg0.method1674(1355769544);
                    }
                } else {
                    this.field24 = arg0.method1677(arg2 + -6676);
                }
            } else {
                this.field16 = arg0.method1674(1355769544);
            }
        } else {
            this.field26 = arg0.method1677(arg2 + -6676);
        }
        if (arg2 != -1) {
            this.field24 = -69;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 >= -22) {
            method9(true);
        }
        ++field19;
        class49.method347((byte) -127);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class2() {
        super(0, true);
    }
}
