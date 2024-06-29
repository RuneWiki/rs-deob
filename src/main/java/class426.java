import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class426 extends class615 {

    @OriginalMember(owner = "client!iga", name = "K", descriptor = "I")
    private int field5854 = 1024;

    @OriginalMember(owner = "client!iga", name = "O", descriptor = "I")
    private int field5858 = 3072;

    @OriginalMember(owner = "client!iga", name = "P", descriptor = "I")
    private int field5859 = 2048;

    @OriginalMember(owner = "client!iga", name = "F", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!iga", name = "G", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!iga", name = "I", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!iga", name = "L", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!iga", name = "M", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!iga", name = "N", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!iga", name = "R", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!iga", name = "H", descriptor = "Lbi;")
    public static class449 field5852;

    @OriginalMember(owner = "client!iga", name = "Q", descriptor = "[[B")
    public static byte[][] field5860;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIILno;IB)Lmn;", line = 3)
    public static final class340 method2435(int arg0, int arg1, int arg2, class658 arg3, int arg4, byte arg5) {
        int var6 = -65 % ((-1 - arg5) / 41);
        ++field5861;
        if (!arg3.field9273 && (!class230.method1441(true, arg2) || !class230.method1441(true, arg0))) {
            return !arg3.field9310 ? new class340(arg3, arg4, arg1, arg2, arg0, class587.method3231(true, arg2), class587.method3231(true, arg0), true) : new class340(arg3, 34037, arg4, arg1, arg2, arg0, true);
        } else {
            return new class340(arg3, 3553, arg4, arg1, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)[I", line = 24)
    public final int[] method8(int arg0, byte arg1) {
        ++field5855;
        int[] var3 = super.field8125.method298(arg0, -22);
        if (arg1 != -18) {
            method2437((byte) 124);
        }
        if (super.field8125.field579) {
            int[] var4 = this.method3366(0, 997, arg0);
            for (int var5 = 0; ~var5 > ~class505.field6740; ++var5) {
                var3[var5] = this.field5854 - -(var4[var5] * this.field5859 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BILeh;)V", line = 61)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field8118 = ~arg2.method2034(255) == -2;
                }
            } else {
                this.field5858 = arg2.method2001((byte) -83);
            }
        } else {
            this.field5854 = arg2.method2001((byte) -83);
        }
        ++field5856;
        if (arg0 < 44) {
            this.method223(-107, -105);
        }
    }

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "(B)V", line = 108)
    public static void method2436(byte arg0) {
        field5852 = null;
        int var1 = -123 / ((arg0 - -26) / 32);
        field5860 = null;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V", line = 119)
    public class426() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V", line = 129)
    public final void method10(int arg0) {
        if (arg0 != 12404) {
            this.field5858 = -108;
        }
        ++field5853;
        this.field5859 = -this.field5854 + this.field5858;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)[[I", line = 140)
    public final int[][] method223(int arg0, int arg1) {
        if (arg0 != 2) {
            field5860 = null;
        }
        ++field5857;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class505.field6740; ++var11) {
                var8[var11] = (var5[var11] * this.field5859 >> 12) + this.field5854;
                var9[var11] = (var6[var11] * this.field5859 >> 12) + this.field5854;
                var10[var11] = this.field5854 - -(var7[var11] * this.field5859 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "(B)V", line = 188)
    public static final void method2437(byte arg0) {
        ++field5850;
        class389 var1 = (class389) class356.field4832.method3257(-52);
        if (arg0 == -30) {
            while (var1 != null) {
                class699 var2 = var1.field5147;
                if (class642.field8626 <= var2.field9828) {
                    if (~var2.field9834 >= ~class642.field8626) {
                        if (~var2.field9806 < -1) {
                            class280 var3 = (class280) class616.field8143.method2918((long) (var2.field9806 + -1), (byte) -34);
                            if (var3 != null) {
                                class287 var4 = var3.field3983;
                                if (~var4.field8620 <= -1 && class34.field530 * 512 > var4.field8620 && ~var4.field8612 <= -1 && ~var4.field8612 > ~(class34.field531 * 512)) {
                                    var2.method3867(class642.field8626, var4.field8620, var4.field8612, class315.method1878(var4.field8620, 2921, var2.field8609, var4.field8612) + -var2.field9808, -18574);
                                }
                            }
                        }
                        if (~var2.field9806 > -1) {
                            int var5 = -var2.field9806 + -1;
                            class403 var6;
                            if (~class416.field5693 != ~var5) {
                                var6 = class572.field7601[var5];
                            } else {
                                var6 = class199.field2897;
                            }
                            if (var6 != null && var6.field8620 >= 0 && ~(class34.field530 * 512) < ~var6.field8620 && var6.field8612 >= 0 && ~var6.field8612 > ~(class34.field531 * 512)) {
                                var2.method3867(class642.field8626, var6.field8620, var6.field8612, class315.method1878(var6.field8620, arg0 + 2951, var2.field8609, var6.field8612) - var2.field9808, arg0 + -18544);
                            }
                        }
                        var2.method3873(class104.field1561, 88);
                        class618.method3385(var2, true);
                    }
                } else {
                    var1.method2797(89);
                    var2.method3872(1);
                }
                var1 = (class389) class356.field4832.method3263((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLbi;)V", line = 255)
    public static final void method2438(byte arg0, class449 arg1) {
        class331.field4537 = 0;
        if (arg0 != 5) {
            method2438((byte) 91, (class449) null);
        }
        ++field5851;
        class311.field4284 = 0;
        class98.field1476 = new class47();
        class154.field2423 = new class183[1024];
        class158.field2495 = new class485[class416.field5684[class671.field9506] - -1];
        client.field3892 = 0;
        class84.field1293 = 0;
        class428.method2441(-33, arg1);
        class624.method3407(arg1, -30121);
    }
}
