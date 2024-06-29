import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class600 extends class38 {

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    private int field8494 = 0;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    private int field8489 = 16;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field8497 = 0;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    private int field8499 = 4096;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field8500 = 2000;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[B")
    public static byte[] field8488 = new byte[520];

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "[J")
    public static long[] field8498 = new long[10];

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "[I")
    public static int[] field8493;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class600() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V")
    public static final void method3489(byte arg0) {
        ++field8492;
        if (~class459.field6763 <= -1) {
            long var1 = class524.method3075(18);
            class459.field6763 = (int) ((long) class459.field6763 - (-class256.field3685 + var1));
            if (~class459.field6763 < -1) {
                int var3 = (class459.field6763 << 8) / class341.field4952;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class9.field135 = ((class456.field6727 & 16711935) * var3 + (class662.field9261.field7276 & 16711935) * var4 & -16711936) + ((65280 & class456.field6727) * var3 + (65280 & class662.field9261.field7276) * var4 & 16711680) >>> 8;
                float var6 = 1.0F - var5;
                class225.field3313 = (-class256.field3684 + class662.field9261.field7286) * var6 + class256.field3684;
                class281.field3978 = ((65280 & class194.field2947) * var3 + (class662.field9261.field7271 & 65280) * var4 & 16711680) + (-16711936 & (class194.field2947 & 16711935) * var3 + (16711935 & class662.field9261.field7271) * var4) >>> 8;
                class287.field4080 = class70.field1000 * var3 - -(class662.field9261.field7277 * var4) >> 8;
                class37.field376 = (class662.field9261.field7274 - class650.field9157) * var6 + class650.field9157;
                class698.field9624 = (-class460.field6791 + class662.field9261.field7281) * var6 + class460.field6791;
                class310.field4391 = (-class179.field2757 + class662.field9261.field7278) * var6 + class179.field2757;
                class55.field763 = (class662.field9261.field7272 - class616.field8670) * var6 + class616.field8670;
                class444.field6599 = (class662.field9261.field7283 - class262.field3721) * var6 + class262.field3721;
                if (class304.field4314 != class662.field9261.field7280) {
                    class633.field8865 = class729.field10214.method499(class304.field4314, class662.field9261.field7280, var6, class633.field8865);
                }
            } else {
                class9.field135 = class662.field9261.field7276;
                class37.field376 = class662.field9261.field7274;
                class55.field763 = class662.field9261.field7272;
                class698.field9624 = class662.field9261.field7281;
                class225.field3313 = class662.field9261.field7286;
                class281.field3978 = class662.field9261.field7271;
                class310.field4391 = class662.field9261.field7278;
                class459.field6763 = -1;
                class287.field4080 = class662.field9261.field7277;
                class444.field6599 = class662.field9261.field7283;
                class633.field8865 = class662.field9261.field7280;
            }
            class256.field3685 = var1;
        }
        if (arg0 != 113) {
            field8491 = -15;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field8495;
        if (arg0 > 34) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                this.field8499 = arg2.method3712((byte) -107);
                            }
                        } else {
                            this.field8497 = arg2.method3712((byte) -108);
                        }
                    } else {
                        this.field8489 = arg2.method3745(-6314);
                    }
                } else {
                    this.field8500 = arg2.method3712((byte) -120);
                }
            } else {
                this.field8494 = arg2.method3745(-6314);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 > -43) {
            return null;
        } else {
            ++field8487;
            int[] var3 = super.field397.method1376(arg1, (byte) -73);
            if (super.field397.field3005) {
                int var4 = this.field8499 >> 1;
                int[][] var5 = super.field397.method1375((byte) 100);
                Random var6 = new Random((long) this.field8494);
                for (int var7 = 0; ~var7 > ~this.field8500; ++var7) {
                    int var8 = this.field8499 <= 0 ? this.field8497 : this.field8497 + class162.method1180(var6, this.field8499, -115) + -var4;
                    int var9 = (var8 & 4088) >> 4;
                    int var10 = class162.method1180(var6, class729.field10216, -103);
                    int var11 = class162.method1180(var6, class632.field8852, -102);
                    int var12 = (class89.field1268[var9] * this.field8489 >> 12) + var10;
                    int var13 = (class149.field2330[var9] * this.field8489 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = var12 - var10;
                    if (~var15 != -1 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = var14 > var15;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var12 = var13;
                            var11 = var17;
                            var13 = var18;
                        }
                        if (~var10 < ~var12) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = 1024 + -(class162.method1180(var6, 4096, -109) >> 2);
                        int var27 = ~var11 > ~var13 ? 1 : -1;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        for (int var28 = var10; ~var12 < ~var28; ++var28) {
                            int var29 = (-var10 + var28) * var25 + var26 + 1024;
                            int var30 = var28 & class554.field7909;
                            int var31 = var21 & class619.field8708;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (var24 > 0) {
                                var21 -= -var27;
                                var24 += -var22;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        class417.method2634((byte) -118);
        if (arg0 >= 120) {
            ++field8496;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLrg;)Lau;")
    public static final class739 method3490(byte arg0, class645 arg1) {
        ++field8490;
        class651 var2 = class43.method300(false)[arg1.method3745(-6314)];
        int var3 = 32 % ((76 - arg0) / 49);
        class713 var4 = class478.method2882(-82)[arg1.method3745(-6314)];
        int var5 = arg1.method3756(65536);
        int var6 = arg1.method3756(65536);
        int var7 = arg1.method3712((byte) 110);
        int var8 = arg1.method3712((byte) -111);
        int var9 = arg1.method3756(65536);
        int var10 = arg1.method3720(-19541);
        int var11 = arg1.method3720(-19541);
        return new class739(var2, var4, var5, var6, var7, var8, var9, var10, var11);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static void method3491(int arg0) {
        field8488 = null;
        field8498 = null;
        if (arg0 != -1) {
            method3489((byte) -127);
        }
        field8493 = null;
    }
}
