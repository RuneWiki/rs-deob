import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class656 extends class747 {

    @OriginalMember(owner = "client!aba", name = "H", descriptor = "I")
    private int field8758 = 4096;

    @OriginalMember(owner = "client!aba", name = "K", descriptor = "Z")
    private boolean field8761 = true;

    @OriginalMember(owner = "client!aba", name = "J", descriptor = "Lkr;")
    public static class602 field8760 = new class602(74, -2);

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!aba", name = "G", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!aba", name = "I", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!aba", name = "L", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!aba", name = "M", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!aba", name = "N", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!aba", name = "O", descriptor = "Luu;")
    public static class237 field8765;

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V", line = 4)
    public class656() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)V", line = 7)
    public static void method3657(int arg0) {
        field8760 = null;
        if (arg0 <= 21) {
            field8760 = null;
        }
        field8765 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ldc;II)V", line = 18)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field8761 = arg0.method505((byte) -119) == 1;
            }
        } else {
            this.field8758 = arg0.method482(-772591672);
        }
        if (arg1 == 11608) {
            ++field8764;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)[[I", line = 55)
    public final int[][] method688(int arg0, int arg1) {
        ++field8762;
        int var3 = -30 / ((arg0 - 35) / 58);
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[] var5 = this.method4156(103, arg1 + -1 & class415.field5878, 0);
            int[] var6 = this.method4156(75, arg1, 0);
            int[] var7 = this.method4156(-115, class415.field5878 & arg1 + 1, 0);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class73.field1095; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field8758;
                int var13 = (var6[class73.field1097 & var11 - -1] + -var6[var11 + -1 & class73.field1097]) * this.field8758;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var17) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (~var18 == -1) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var20 = 16777216 / var18;
                    var21 = var12 / var18;
                    var19 = var13 / var18;
                }
                if (this.field8761) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var19;
                var9[var11] = var21;
                var10[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V", line = 138)
    public static final void method3658(int arg0, String arg1, int arg2, String arg3) {
        class336.field4726 = arg0;
        ++field8763;
        if (arg2 != -29993) {
            method3660(-85, 14);
        }
        class73.field1096 = 2;
        class115.method733(arg3, false, arg1, (byte) 113);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Luu;[ILuu;I)V", line = 157)
    public static final void method3659(class237 arg0, int[] arg1, class237 arg2, int arg3) {
        if (arg1 != null) {
            class96.field1322 = arg1;
        }
        ++field8756;
        class171.field2375 = arg2;
        if (arg3 != -6) {
            method3657(48);
        }
        class676.field9378 = arg0;
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(II)V", line = 177)
    public static final void method3660(int arg0, int arg1) {
        class690 var2 = class301.field4258;
        synchronized (class301.field4258) {
            class301.field4258.method3896(1, arg1);
        }
        ++field8759;
        class690 var3 = class684.field9509;
        synchronized (class684.field9509) {
            class684.field9509.method3896(1, arg1);
            if (arg0 != -2) {
                field8760 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BII)Z", line = 194)
    public static final boolean method3661(byte arg0, int arg1, int arg2) {
        ++field8757;
        if (arg0 != 97) {
            method3661((byte) -39, -87, -102);
        }
        class220 var3 = class20.field192.method716(6, arg1);
        if (~arg2 == -12) {
            arg2 = 10;
        }
        if (~arg2 <= -6 && ~arg2 >= -9) {
            arg2 = 4;
        }
        return var3.method1298(arg2, arg0 + -57);
    }
}
