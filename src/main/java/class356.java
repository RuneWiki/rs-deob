import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class356 extends class306 {

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    private int field5659 = 0;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    private int field5657 = 4096;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field5656 = 1;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 3)
    public class356() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILlf;I)V", line = 18)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field5659 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field5657 = arg1.method1051(1);
        } else if (arg2 == 2) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        if (arg0 != -15334) {
            field5654 = -89;
        }
        field5655++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Ldj;", line = 51)
    public static final class360 method2454(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        return var3 == null || var3.field3003 == null ? null : var3.field3003;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I", line = 62)
    public final int[] method47(int arg0, int arg1) {
        field5658++;
        if (arg1 != -1546337535) {
            method2455(40, -95, 99, 6, 16);
        }
        int[] var3 = this.field4757.method903(arg0, -114);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 119, 0);
            for (int var5 = 0; var5 < class31.field367; var5++) {
                int var6 = var4[var5];
                if (this.field5659 > var6) {
                    var3[var5] = this.field5659;
                } else if (this.field5657 < var6) {
                    var3[var5] = this.field5657;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V", line = 104)
    public static final void method2455(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5653++;
        if (arg2 < 16) {
            method2455(-32, 16, 37, 20, 31);
        }
        for (int var5 = 0; var5 < class63.field765; var5++) {
            if (arg3 < class280.field4417[var5] + class213.field3239[var5] && (arg1 + arg3) > class213.field3239[var5] && (class71.field891[var5] + class116.field1612[var5]) > arg0 && class116.field1612[var5] < (arg0 + arg4)) {
                class135.field2012[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I", line = 130)
    public final int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            method2455(117, 43, 1, 34, -4);
        }
        int[][] var3 = this.field4752.method1866(arg0, arg1 ^ 0xFFFFFF89);
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) 107, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class31.field367; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field5659 > var12) {
                    var9[var11] = this.field5659;
                } else if (var12 > this.field5657) {
                    var9[var11] = this.field5657;
                } else {
                    var9[var11] = var12;
                }
                if (this.field5659 > var13) {
                    var8[var11] = this.field5659;
                } else if (this.field5657 >= var13) {
                    var8[var11] = var13;
                } else {
                    var8[var11] = this.field5657;
                }
                if (this.field5659 > var14) {
                    var10[var11] = this.field5659;
                } else if (var14 > this.field5657) {
                    var10[var11] = this.field5657;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        field5660++;
        return var3;
    }
}
