import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class185 extends class11 {

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    private int field2693 = 4;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    private int field2694 = 4;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2688 = 0;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field2691 = 0;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class185() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 >= -40) {
            this.field2694 = 80;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field2693 = arg0.method2348(-2);
            }
        } else {
            this.field2694 = arg0.method2348(-2);
        }
        ++field2690;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 >= -42) {
            field2692 = -39;
        }
        ++field2695;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int var4 = class90.field1316 / this.field2694;
            int var5 = class508.field7537 / this.field2693;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method48(class508.field7537 * var6 / var5, 0, (byte) -82);
            } else {
                var7 = this.method48(0, 0, (byte) -63);
            }
            for (int var8 = 0; var8 < class90.field1316; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class90.field1316 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field2687;
        int var3 = 20 / ((arg0 - -75) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int var5 = class90.field1316 / this.field2694;
            int var6 = class508.field7537 / this.field2693;
            int[][] var7;
            if (~var6 >= -1) {
                var7 = this.method49(0, 0, 116);
            } else {
                int var8 = arg1 % var6;
                var7 = this.method49(class508.field7537 * var8 / var6, 0, 107);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class90.field1316 < ~var15; ++var15) {
                int var16;
                if (~var5 >= -1) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class90.field1316 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I[ILdw;[II)V")
    public static final void method1170(int[] arg0, int[] arg1, class502 arg2, int[] arg3, int arg4) {
        if (arg4 == 1) {
            for (int var5 = 0; ~var5 > ~arg3.length; ++var5) {
                int var6 = arg3[var5];
                int var7 = arg1[var5];
                int var8 = arg0[var5];
                int var9 = 0;
                while (~var7 != -1 && arg2.field1058.length > var9) {
                    if (~(var7 & 1) != -1) {
                        if (var6 != -1) {
                            class104 var10 = class222.field3168.method126(-119, var6);
                            int var11 = var10.field1566;
                            class431 var12 = arg2.field1058[var9];
                            if (var12 != null) {
                                if (var12.field6335 != var6) {
                                    if (var10.field1570 >= class222.field3168.method126(-110, var12.field6335).field1570) {
                                        var12 = arg2.field1058[var9] = null;
                                    }
                                } else if (~var11 == -1) {
                                    var12 = arg2.field1058[var9] = null;
                                } else if (~var11 == -2) {
                                    var12.field6329 = var8;
                                    var12.field6331 = 0;
                                    var12.field6337 = 1;
                                    var12.field6330 = 0;
                                    var12.field6333 = 0;
                                    class441.method2618(arg2.field1732, arg2.field1735, arg2.field1738, false, var10, 0, arg4 ^ 113);
                                } else if (~var11 == -3) {
                                    var12.field6333 = 0;
                                }
                            }
                            if (var12 == null) {
                                class431 var13 = arg2.field1058[var9] = new class431();
                                var13.field6335 = var6;
                                var13.field6330 = 0;
                                var13.field6337 = 1;
                                var13.field6329 = var8;
                                var13.field6333 = 0;
                                var13.field6331 = 0;
                                class441.method2618(arg2.field1732, arg2.field1735, arg2.field1738, false, var10, 0, 99);
                            }
                        } else {
                            arg2.field1058[var9] = null;
                        }
                    }
                    ++var9;
                    var7 >>>= 1;
                }
            }
            ++field2689;
        }
    }
}
