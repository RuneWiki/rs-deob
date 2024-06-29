import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class619 extends class615 {

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "Lwg;")
    public static class395 field8207 = null;

    @OriginalMember(owner = "client!bca", name = "M", descriptor = "I")
    public static int field8214 = 0;

    @OriginalMember(owner = "client!bca", name = "K", descriptor = "Lcu;")
    public static class206 field8212 = new class206(11, 16);

    @OriginalMember(owner = "client!bca", name = "O", descriptor = "Ldb;")
    public static class298 field8216 = new class298(37, 6);

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!bca", name = "L", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!bca", name = "N", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V", line = 3)
    public static final void method3386(int arg0) {
        ++field8210;
        class388.field5142 = false;
        class221.method1395(class259.field3566, class483.field6540, class342.field4707, class340.field4703, false);
        int var1 = -37 % ((6 - arg0) / 38);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BILeh;)V", line = 14)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 == -1) {
            super.field8118 = ~arg2.method2034(255) == -2;
        }
        if (arg0 < 44) {
            field8214 = 48;
        }
        ++field8208;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB)[I", line = 28)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            ++field8211;
            int[] var3 = super.field8125.method298(arg0, -1);
            if (super.field8125.field579) {
                for (int var4 = 0; var4 < class505.field6740; ++var4) {
                    this.method3388(arg0, arg1 + 273, var4);
                    int[] var5 = this.method3366(0, arg1 + 1015, class505.field6739);
                    var3[var4] = var5[class225.field3182];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)V", line = 61)
    public static void method3387(boolean arg0) {
        field8212 = null;
        field8216 = null;
        if (arg0) {
            field8216 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)[[I", line = 74)
    public final int[][] method223(int arg0, int arg1) {
        if (arg0 != 2) {
            field8214 = 71;
        }
        ++field8209;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class505.field6740; ++var7) {
                this.method3388(arg1, 255, var7);
                int[][] var8 = this.method3368(true, 0, class505.field6739);
                var4[var7] = var8[0][class225.field3182];
                var5[var7] = var8[1][class225.field3182];
                var6[var7] = var8[2][class225.field3182];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(III)V", line = 117)
    private final void method3388(int arg0, int arg1, int arg2) {
        ++field8213;
        if (arg1 != 255) {
            this.method15((byte) 86, -26, (class335) null);
        }
        int var4 = class168.field2599[arg2];
        int var5 = class402.field5353[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class505.field6739 = arg0;
            class225.field3182 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class505.field6739 = arg2;
            class225.field3182 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class225.field3182 = class505.field6740 - arg0;
            class505.field6739 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class505.field6739 = -arg0 + class471.field6301;
            class225.field3182 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class225.field3182 = -arg2 + class505.field6740;
            class505.field6739 = -arg0 + class471.field6301;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class225.field3182 = -arg0 + class505.field6740;
            class505.field6739 = -arg2 + class471.field6301;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class225.field3182 = arg0;
            class505.field6739 = -arg2 + class471.field6301;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class505.field6739 = arg0;
            class225.field3182 = -arg2 + class505.field6740;
        }
        class225.field3182 &= class313.field4306;
        class505.field6739 &= class658.field9107;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V", line = 197)
    public class619() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZ)V", line = 204)
    public static final void method3389(int arg0, boolean arg1) {
        class381.method2226((byte) 110);
        ++field8215;
        if (class530.method2958(class32.field525, -94)) {
            ++class592.field7835;
            if (~class592.field7835 <= -51 || arg1) {
                class592.field7835 = 0;
                if (!class627.field8464 && class370.field4996 != null) {
                    ++class643.field8631;
                    class402 var2 = class390.method2252(class586.field7770, -122, class262.field3644);
                    class36.method278(0, var2);
                    try {
                        class179.method1200(113);
                    } catch (IOException var4) {
                        class627.field8464 = true;
                    }
                }
                class381.method2226((byte) 121);
                int var3 = 8 % ((-77 - arg0) / 36);
            }
        }
    }
}
