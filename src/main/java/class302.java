import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class302 extends class30 {

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "I")
    private int field4200 = 4096;

    @OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
    private int field4206 = 3216;

    @OriginalMember(owner = "client!pba", name = "I", descriptor = "I")
    private int field4204 = 3216;

    @OriginalMember(owner = "client!pba", name = "H", descriptor = "[I")
    private int[] field4203 = new int[3];

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "Lem;")
    public static class206 field4201 = new class206(43, -2);

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!pba", name = "B", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!pba", name = "C", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!pba", name = "D", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!pba", name = "G", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)V", line = 5)
    private final void method1838(int arg0) {
        ++field4198;
        double var2 = Math.cos((double) ((float) this.field4206 / 4096.0F));
        this.field4203[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field4204 / 4096.0F)));
        this.field4203[1] = (int) (var2 * Math.cos((double) ((float) this.field4204 / 4096.0F)) * 4096.0D);
        this.field4203[2] = (int) (Math.sin((double) ((float) this.field4206 / 4096.0F)) * 4096.0D);
        int var4 = this.field4203[0] * this.field4203[0] >> 12;
        int var5 = this.field4203[1] * this.field4203[1] >> 12;
        int var6 = this.field4203[2] * this.field4203[2] >> 12;
        if (arg0 != -8410) {
            this.field4203 = null;
        }
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4203[0] = (this.field4203[0] << 12) / var7;
            this.field4203[2] = (this.field4203[2] << 12) / var7;
            this.field4203[1] = (this.field4203[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BII)Z", line = 38)
    public static final boolean method1839(byte arg0, int arg1, int arg2) {
        ++field4196;
        if (!class160.method1129(arg1, arg2, 12805)) {
            return false;
        } else if (arg0 < 88) {
            return true;
        } else {
            return class185.method1272(arg2, true, arg1) | ~(arg2 & 36864) != -1 | class59.method489(arg2, arg1, -94) ? true : ~(arg1 & 55) == -1 & (~(8192 & arg2) != -1 | class453.method2575(544, arg2, arg1) | class356.method2044(arg2, arg1, (byte) 94));
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V", line = 58)
    public final void method29(byte arg0) {
        this.method1838(-8410);
        if (arg0 >= -10) {
            this.method1838(120);
        }
        ++field4199;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)[I", line = 71)
    public final int[] method48(int arg0, int arg1) {
        ++field4202;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = class525.field7123 * this.field4200 >> 12;
            int[] var5 = this.method294(arg1 + -1 & class649.field9002, 0, (byte) -119);
            int[] var6 = this.method294(arg1, 0, (byte) 122);
            int[] var7 = this.method294(arg1 + 1 & class649.field9002, 0, (byte) -56);
            for (int var8 = 0; class31.field399 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class353.field4694 & var8 + -1] - var6[var8 + 1 & class353.field4694]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class684.field9763[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field4203[1] * var14 >> 12;
                int var18 = this.field4203[0] * var15 >> 12;
                int var19 = this.field4203[2] * var16 >> 12;
                var3[var8] = var18 - -var19 + var17;
            }
        }
        if (arg0 != 1) {
            this.field4200 = -8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V", line = 310)
    public class302() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "(I)V", line = 148)
    public static final void method1840(int arg0) {
        ++field4197;
        int var1 = class65.field854 * 512 + 256;
        int var2 = class290.field3995 * 512 + 256;
        int var3 = class249.method1533(class367.field4944, var2, var1, -21) - class289.field3987;
        if (class164.field2359 < 100) {
            if (var1 > class666.field9335) {
                class666.field9335 += (var1 - class666.field9335) * class164.field2359 / 1000 + class506.field6939;
                if (~var1 > ~class666.field9335) {
                    class666.field9335 = var1;
                }
            }
            if (var3 > class441.field6102) {
                class441.field6102 += class506.field6939 - -((-class441.field6102 + var3) * class164.field2359 / 1000);
                if (~class441.field6102 < ~var3) {
                    class441.field6102 = var3;
                }
            }
            if (var1 < class666.field9335) {
                class666.field9335 -= (class666.field9335 - var1) * class164.field2359 / 1000 + class506.field6939;
                if (~var1 < ~class666.field9335) {
                    class666.field9335 = var1;
                }
            }
            if (class11.field114 < var2) {
                class11.field114 += (-class11.field114 + var2) * class164.field2359 / 1000 + class506.field6939;
                if (class11.field114 > var2) {
                    class11.field114 = var2;
                }
            }
            if (~class441.field6102 < ~var3) {
                class441.field6102 -= (-var3 + class441.field6102) * class164.field2359 / 1000 + class506.field6939;
                if (~var3 < ~class441.field6102) {
                    class441.field6102 = var3;
                }
            }
            if (~var2 > ~class11.field114) {
                class11.field114 -= (-var2 + class11.field114) * class164.field2359 / 1000 + class506.field6939;
                if (~var2 < ~class11.field114) {
                    class11.field114 = var2;
                }
            }
        } else {
            class666.field9335 = class65.field854 * 512 + 256;
            class11.field114 = class290.field3995 * 512 - -256;
            class441.field6102 = class249.method1533(class367.field4944, class11.field114, class666.field9335, -112) + -class289.field3987;
        }
        int var4 = class314.field4337 * 512 + 256;
        int var5 = class280.field3834 * 512 + 256;
        int var6 = class249.method1533(class367.field4944, var5, var4, -99) - class50.field591;
        int var7 = -class666.field9335 + var4;
        int var8 = -class441.field6102 + var6;
        int var9 = -class11.field114 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10));
        int var12 = 16383 & (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D);
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (~class685.field9771 > ~var11) {
            class685.field9771 += (-class685.field9771 + var11 >> 3) * class133.field1902 / 1000 + class366.field4864 << 3;
            if (~class685.field9771 < ~var11) {
                class685.field9771 = var11;
            }
        }
        if (class685.field9771 > var11) {
            class685.field9771 -= (class685.field9771 - var11 >> 3) * class133.field1902 / 1000 + class366.field4864 << 3;
            if (var11 > class685.field9771) {
                class685.field9771 = var11;
            }
        }
        int var13 = -class41.field475 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (arg0 > -119) {
            field4201 = null;
        }
        if (var14 > 0) {
            class41.field475 += class133.field1902 * var14 / 1000 + class366.field4864 << 3;
            class41.field475 &= 16383;
        }
        if (var14 < 0) {
            class41.field475 -= -var14 * class133.field1902 / 1000 + class366.field4864 << 3;
            class41.field475 &= 16383;
        }
        int var15 = -class41.field475 + var12;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class164.field2363 = 0;
        if (~var15 > -1 && var14 > 0 || var15 > 0 && ~var14 > -1) {
            class41.field475 = var12;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(Z)V", line = 315)
    public static void method1841(boolean arg0) {
        if (arg0) {
            method1840(-89);
        }
        field4201 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BILac;)V", line = 325)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            this.field4206 = -61;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4206 = arg2.method2845(-1);
                }
            } else {
                this.field4204 = arg2.method2845(-1);
            }
        } else {
            this.field4200 = arg2.method2845(-1);
        }
        ++field4195;
    }
}
