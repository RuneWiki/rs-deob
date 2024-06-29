import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class335 extends class326 {

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    private int field4522 = 4096;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
    private int field4521 = 4096;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "[I")
    private int[] field4526 = new int[3];

    @OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
    private int field4532 = 4096;

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
    private int field4530 = 409;

    @OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lbc;")
    public static class225 field4531 = new class225("", 10);

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "Ljd;")
    public static class139 field4525;

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 3)
    public class335() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILbt;I)V", line = 6)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field4524;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method219(-120);
                            this.field4526[2] = class99.method612(0, var5 >> 12);
                            this.field4526[0] = class99.method612(267386880, var5 << 4);
                            this.field4526[1] = class99.method612(var5 >> 4, 4080);
                        }
                    } else {
                        this.field4521 = arg1.method215((byte) 119);
                    }
                } else {
                    this.field4532 = arg1.method215((byte) 120);
                }
            } else {
                this.field4522 = arg1.method215((byte) 93);
            }
        } else {
            this.field4530 = arg1.method215((byte) 99);
        }
        if (arg2 > -3) {
            method1910((byte) -69, -55, 56, 90);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)V", line = 72)
    public static final void method1910(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = class488.field6789.field6688 * arg2 >> 8;
        ++field4520;
        int var5 = 82 / ((20 - arg0) / 56);
        if (arg3 == -1 && !class219.field2925) {
            class11.method68(-104);
        } else if (arg3 != -1 && (class60.field811 != arg3 || !class3.method25(-15284)) && ~var4 != -1 && !class219.field2925) {
            class13.method82(-2, 0, arg3, false, arg1, var4, class330.field4383);
        }
        class60.field811 = arg3;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIB)I", line = 102)
    public static final int method1911(int arg0, int arg1, byte arg2) {
        ++field4527;
        int var3 = 5 / ((13 - arg2) / 49);
        int var4 = class428.method2519(0, arg0 - 1, arg1 + -1) + (class428.method2519(0, arg0 + -1, arg1 + 1) - -class428.method2519(0, arg0 + 1, arg1 + -1) - -class428.method2519(0, arg0 + 1, arg1 + 1));
        int var5 = class428.method2519(0, arg0, arg1 + -1) + (class428.method2519(0, arg0, arg1 + 1) - (-class428.method2519(0, arg0 + -1, arg1) - class428.method2519(0, arg0 - -1, arg1)));
        int var6 = class428.method2519(0, arg0, arg1);
        return var4 / 16 + var6 / 4 - -(var5 / 8);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V", line = 120)
    public static final void method1912(int arg0, int arg1) {
        ++field4528;
        if (arg1 != 0) {
            method1911(-101, 53, (byte) -52);
        }
        for (class445 var2 = class128.field1876.method1518((byte) -50); var2 != null; var2 = class128.field1876.method1517(arg1 + -30942)) {
            if (~((long) arg0) == ~(65535L & var2.field6047 >> 48)) {
                var2.method2614((byte) -85);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Lmn;", line = 146)
    public static final class226 method1913(int arg0, int arg1) {
        ++field4523;
        class226 var2 = (class226) class203.field2749.method2635((long) arg1, (byte) -72);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class419.field5700.method702((byte) 28, arg1 & 32767, 0);
            } else {
                var3 = class281.field3792.method702((byte) -94, arg1, 0);
            }
            class226 var4 = new class226();
            if (var3 != null) {
                var4.method1273(new class32(var3), (byte) 126);
            }
            if (arg1 >= 32768) {
                var4.method1269((byte) -120);
            }
            if (arg0 != 19025) {
                field4531 = null;
            }
            class203.field2749.method2638((byte) -76, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 180)
    public static void method1914(byte arg0) {
        if (arg0 <= 17) {
            field4525 = null;
        }
        field4525 = null;
        field4531 = null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)[[I", line = 193)
    public final int[][] method48(int arg0, byte arg1) {
        ++field4529;
        if (arg1 >= -52) {
            this.field4530 = 99;
        }
        int[][] var3 = super.field4343.method2356(arg0, 117);
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class181.field2495; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field4526[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field4530) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4526[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field4530 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4526[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field4530) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4521 * var12 >> 12;
                            var9[var11] = this.field4532 * var14 >> 12;
                            var10[var11] = this.field4522 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
