import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class240 extends class105 {

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    private int field4186 = 3216;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    private int field4189 = 3216;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    private int field4193 = 4096;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "[I")
    private int[] field4192 = new int[3];

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field4190 = new Random();

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "Lch;")
    public static class117 field4197 = new class117();

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)I")
    public static final int method1603(int arg0) {
        if (arg0 != 20197) {
            return -38;
        } else {
            ++field4191;
            return 6;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class240() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLfl;)V")
    public static final void method1604(byte arg0, class192 arg1) {
        ++field4196;
        class184.field3297 = arg1.method1326((byte) -21, class186.field3369);
        if (arg0 < 62) {
            field4197 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        if (arg0) {
            method1604((byte) 100, (class192) null);
        }
        ++field4185;
        this.method1606(-20648884);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            field4197 = null;
        }
        ++field4184;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class72.field1374 * this.field4193 >> 12;
            int[] var5 = this.method705(class11.field377 & arg1 + -1, (byte) -91, 0);
            int[] var6 = this.method705(arg1, (byte) -85, 0);
            int[] var7 = this.method705(arg1 + 1 & class11.field377, (byte) -16, 0);
            for (int var8 = 0; ~class94.field1668 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[var8 - 1 & class1.field20] + -var6[var8 - -1 & class1.field20]) * var4 >> 12;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                int var12 = var11 >> 4;
                if (var10 > 255) {
                    var10 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class231.field4072[((var10 + 1) * var10 >> 1) + var12] & 255;
                int var14 = var11 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field4192[2] * var15 >> 12;
                int var17 = this.field4192[0] * var14 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field4192[1] * var18 >> 12;
                var3[var8] = var17 - -var16 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(Z)V")
    public static void method1605(boolean arg0) {
        field4190 = null;
        if (arg0) {
            field4197 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field4195;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field4186 = arg2.method927(arg1 ^ 128);
                }
            } else {
                this.field4189 = arg2.method927(126);
            }
        } else {
            this.field4193 = arg2.method927(127);
        }
        if (arg1 != 255) {
            field4190 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    private final void method1606(int arg0) {
        ++field4194;
        if (arg0 == -20648884) {
            double var2 = Math.cos((double) ((float) this.field4186 / 4096.0F));
            this.field4192[0] = (int) (Math.sin((double) ((float) this.field4189 / 4096.0F)) * var2 * 4096.0D);
            this.field4192[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field4189 / 4096.0F)));
            this.field4192[2] = (int) (Math.sin((double) ((float) this.field4186 / 4096.0F)) * 4096.0D);
            int var4 = this.field4192[2] * this.field4192[2] >> 12;
            int var5 = this.field4192[0] * this.field4192[0] >> 12;
            int var6 = this.field4192[1] * this.field4192[1] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field4192[2] = (this.field4192[2] << 12) / var7;
                this.field4192[0] = (this.field4192[0] << 12) / var7;
                this.field4192[1] = (this.field4192[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V")
    public static final void method1607(int arg0) {
        for (int var1 = 0; ~class131.field2376 < ~var1; ++var1) {
            int var2 = class279.field4928[var1];
            class23 var3 = class4.field67[var2];
            int var4 = class207.field3730.method920((byte) 56);
            if ((64 & var4) != 0) {
                int var5 = class207.field3730.method900(arg0 + -9450);
                if (~var5 == -65536) {
                    var5 = -1;
                }
                int var6 = class207.field3730.method893(false);
                class275.method1877(var6, var3, var5, (byte) 100);
            }
            if ((var4 & 1) != 0) {
                if (var3.field681.method1827(26)) {
                    class72.method511((byte) -97, var3);
                }
                var3.method223((byte) -101, class98.method654(class207.field3730.method901((byte) -127), -1));
                var3.method965((byte) -116, var3.field681.field4713);
                var3.field2577 = var3.field681.field4771;
                var3.field2576 = var3.field681.field4777;
                var3.field2553 = var3.field681.field4736;
                var3.field2558 = var3.field681.field4768;
                var3.field2562 = var3.field681.field4751;
                var3.field2601 = var3.field681.field4765;
                var3.field2606 = var3.field681.field4727;
                var3.field2588 = var3.field681.field4742;
                if (var3.field681.method1827(arg0 ^ 9538)) {
                    class10.method75(0, var3.field2536[0], var3.field2575[0], false, class216.field3902, var3, (class130) null, (class122) null);
                }
            }
            if ((var4 & 4) != 0) {
                var3.field2603 = class207.field3730.method942(false);
                var3.field2579 = 100;
            }
            if (~(var4 & 128) != -1) {
                var3.field2604 = class207.field3730.method900(120);
                var3.field2586 = class207.field3730.method927(125);
            }
            if ((8 & var4) != 0) {
                int var7 = class207.field3730.method920((byte) 71);
                int var8 = class207.field3730.method914(0);
                var3.method967(var8, arg0 ^ 9499, class93.field1655, var7);
            }
            if ((32 & var4) != 0) {
                var3.field2584 = class207.field3730.method910(false);
                if (var3.field2584 == 65535) {
                    var3.field2584 = -1;
                }
            }
            if (~(var4 & 16) != -1) {
                int var9 = class207.field3730.method901((byte) -128);
                boolean var10 = true;
                if (~var9 == -65536) {
                    var9 = -1;
                }
                int var11 = class207.field3730.method933(114);
                if (var9 != -1 && ~var3.field2585 != 0 && ~class174.method1142(class210.method1441(var9, -1999596368).field3720, false).field3888 > ~class174.method1142(class210.method1441(var3.field2585, -1999596368).field3720, false).field3888) {
                    var10 = false;
                }
                if (var10) {
                    var3.field2585 = var9;
                    var3.field2583 = var11 >> 16;
                    var3.field2602 = 0;
                    var3.field2538 = 0;
                    var3.field2561 = (65535 & var11) + class93.field1655;
                    if (~var3.field2561 < ~class93.field1655) {
                        var3.field2602 = -1;
                    }
                    if (~var3.field2585 != 0 && class93.field1655 == var3.field2561) {
                        int var12 = class210.method1441(var3.field2585, -1999596368).field3720;
                        if (~var12 != 0) {
                            class216 var13 = class174.method1142(var12, false);
                            if (var13 != null && var13.field3890 != null) {
                                class268.method1832(var13, false, 0, var3.field2600, -2, var3.field2564);
                            }
                        }
                    }
                }
            }
            if (~(2 & var4) != -1) {
                int var14 = class207.field3730.method914(0);
                int var15 = class207.field3730.method893(false);
                var3.method967(var15, 40, class93.field1655, var14);
                var3.field2594 = class93.field1655 - -300;
                var3.field2541 = class207.field3730.method920((byte) 113);
            }
        }
        if (arg0 == 9533) {
            ++field4187;
        }
    }
}
