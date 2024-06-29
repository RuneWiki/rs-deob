import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class593 {

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public int field8329;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public int field8333;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public int field8332;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public int field8330;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field8327 = 765;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "[I")
    public static int[] field8335;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3259(int arg0) {
        field8326++;
        if (class344.field4422 != null) {
            return;
        }
        class344.field4422 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 <= 46) {
            method3260((byte) 78, -86);
        }
        while (var3 < 65536) {
            double var4 = (double) ((var3 & 0xFC39) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class344.field4422[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)V", line = 126)
    public static final void method3260(byte arg0, int arg1) {
        field8328++;
        class592 var2 = class61.method371(16, arg1, (byte) 113);
        if (arg0 != 74) {
            field8327 = -35;
        }
        var2.method3253(arg0 ^ 0x4A);
    }

    @OriginalMember(owner = "client!baa", name = "toString", descriptor = "()Ljava/lang/String;", line = 139)
    public final String toString() {
        field8324++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lfga;Lfga;I)V", line = 148)
    public static final void method3261(class569 arg0, class569 arg1, int arg2) {
        field8325++;
        if (arg0.field7971 != null) {
            arg0.method3146(2);
        }
        int var3 = 57 % ((arg2 - 33) / 43);
        arg0.field7966 = arg1;
        arg0.field7971 = arg1.field7971;
        arg0.field7971.field7966 = arg0;
        arg0.field7966.field7971 = arg0;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BZI)Ljava/lang/String;", line = 164)
    public static final String method3262(byte arg0, boolean arg1, int arg2) {
        field8331++;
        if (arg0 == 78) {
            return arg1 && arg2 >= 0 ? class85.method485(10, arg1, false, arg2) : Integer.toString(arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 181)
    public static void method3263(byte arg0) {
        if (arg0 < 110) {
            method3261(null, null, -109);
        }
        field8335 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)Z", line = 193)
    public static final boolean method3264(int arg0, int arg1, int arg2) {
        int var3 = -74 / ((arg1 - 34) / 63);
        field8336++;
        return (arg0 & 0x800) != 0 | class285.method1602((byte) 71, arg2, arg0) || class638.method3573(3, arg0, arg2);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(IIII)V", line = 203)
    public class593(int arg0, int arg1, int arg2, int arg3) {
        this.field8329 = arg2;
        this.field8333 = arg0;
        this.field8332 = arg1;
        this.field8330 = arg3;
    }
}
