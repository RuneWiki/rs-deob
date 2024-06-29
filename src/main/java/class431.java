import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class431 extends class214 {

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    private int field5947 = 0;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    private int field5948 = 4096;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "[I")
    public static int[] field5944 = new int[13];

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field5946;

    static {
        new class112(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lbn;I)I", line = 4)
    public static final int method2523(class106 arg0, int arg1) {
        ++field5942;
        String var2 = class239.method1500(46, arg0);
        int var3 = -107 % ((arg1 - -39) / 37);
        int[] var4 = null;
        if (class290.method1786((byte) 29, arg0.field1517)) {
            var4 = class58.field918.method344((int) arg0.field1515, 31757).field2409;
        } else if (~arg0.field1524 == 0) {
            if (class43.method355(5, arg0.field1517)) {
                class196 var5 = class256.field3581[(int) arg0.field1515];
                if (var5 != null) {
                    class127 var6 = var5.field2789;
                    if (var6.field1780 != null) {
                        var6 = var6.method767(class320.field4376, (byte) 108);
                    }
                    if (var6 != null) {
                        var4 = var6.field1802;
                    }
                }
            } else if (class103.method649(arg0.field1517, (byte) -85)) {
                Object var7 = null;
                class475 var8;
                if (arg0.field1517 == 1007) {
                    var8 = class304.field4160.method2075((int) arg0.field1515, false);
                } else {
                    var8 = class304.field4160.method2075((int) (2147483647L & arg0.field1515 >>> 32), false);
                }
                if (var8.field6690 != null) {
                    var8 = var8.method2797(class320.field4376, -128);
                }
                if (var8 != null) {
                    var4 = var8.field6676;
                }
            }
        } else {
            var4 = class58.field918.method344(arg0.field1524, 31757).field2409;
        }
        if (var4 != null) {
            var2 = var2 + class318.method1922(0, var4);
        }
        int var9 = class328.field4531.method524(class167.field2458, var2, 76);
        if (arg0.field1518) {
            var9 += 4 + class490.field6912.method388();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 73)
    public class431() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(Z)V", line = 80)
    public static void method2524(boolean arg0) {
        field5944 = null;
        if (!arg0) {
            method2523((class106) null, 9);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Llk;II)V", line = 90)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 < -114) {
            ++field5941;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field3032 = arg0.method2503(true) == 1;
                    }
                } else {
                    this.field5948 = arg0.method2508(true);
                }
            } else {
                this.field5947 = arg0.method2508(true);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)[I", line = 135)
    public final int[] method14(byte arg0, int arg1) {
        ++field5945;
        if (arg0 != 123) {
            return null;
        } else {
            int[] var3 = super.field3024.method2585(arg1, 0);
            if (super.field3024.field6135) {
                int[] var4 = this.method1352(arg1, 0, -101);
                for (int var5 = 0; ~class399.field5585 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (var6 >= this.field5947) {
                        if (this.field5948 < var6) {
                            var3[var5] = this.field5948;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field5947;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 178)
    public static final void method2525(int arg0, int arg1) {
        int var2 = 48 / ((-13 - arg1) / 36);
        ++field5943;
        class136.field1930 = arg0;
        class70.field1032.method656(122);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[[I", line = 202)
    public final int[][] method11(int arg0, byte arg1) {
        ++field5946;
        if (arg1 != 92) {
            this.field5947 = 114;
        }
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644) {
            int[][] var4 = this.method1354(0, arg0, (byte) 23);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class399.field5585 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field5947 < ~var12) {
                    var8[var11] = this.field5947;
                } else if (this.field5948 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field5948;
                }
                if (this.field5947 <= var13) {
                    if (~this.field5948 > ~var13) {
                        var9[var11] = this.field5948;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field5947;
                }
                if (~this.field5947 >= ~var14) {
                    if (~this.field5948 > ~var14) {
                        var10[var11] = this.field5948;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field5947;
                }
            }
        }
        return var3;
    }
}
