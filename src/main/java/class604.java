import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class604 extends class62 {

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    private int field8985 = 0;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    private int field8992 = 20;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field8987 = 0;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    private int field8995 = 1365;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "[I")
    public static int[] field8988 = new int[8];

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Lada;")
    public static class144 field8996 = new class144(80, 7);

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field8998 = 0;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "[Lha;")
    public static class53[] field8997;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "[[I")
    public static int[][] field8993;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field8989;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field8985 = arg0.method1045(true);
                    }
                } else {
                    this.field8987 = arg0.method1045(true);
                }
            } else {
                this.field8992 = arg0.method1045(true);
            }
        } else {
            this.field8995 = arg0.method1045(true);
        }
        if (arg1 != -1) {
            this.field8987 = 18;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8991;
        int var9 = 91 / ((-33 - arg3) / 41);
        if (arg6 >= 1 && ~arg7 <= -2 && class146.field2125 + -2 >= arg6 && class410.field5609 + -2 >= arg7) {
            int var10 = arg0;
            if (arg0 < 3 && class111.method815(arg6, (byte) 45, arg7)) {
                var10 = arg0 + 1;
            }
            if (!class56.field668.method1472(class526.field7533, (byte) 109) && !class615.method3610(15488, class447.field6263, arg7, arg6, var10)) {
                return;
            }
            if (class420.field5697 == null) {
                return;
            }
            class304.field4182.method2043(arg2, arg7, (byte) -85, class127.field1774[arg0], class99.field1445, arg0, arg6);
            if (~arg1 <= -1) {
                boolean var11 = class56.field668.field6837;
                class56.field668.field6837 = true;
                class304.field4182.method2044(arg6, class99.field1445, arg5, arg7, -90, arg1, class127.field1774[arg0], arg8, arg4, var10, arg0);
                class56.field668.field6837 = var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZIILkda;)V")
    public static final void method3561(int arg0, int arg1, boolean arg2, int arg3, int arg4, class328 arg5) {
        if (arg1 == -229575572) {
            class511.field7276 = arg4;
            class219.field3190 = 1;
            ++field8990;
            class514.field7343 = arg5;
            class271.field3843 = arg2;
            class271.field3841 = arg3;
            class624.field9191 = arg0;
            class312.field4298 = 10000;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method3562(byte arg0) {
        field8996 = null;
        field8988 = null;
        field8997 = null;
        int var1 = 94 % ((73 - arg0) / 32);
        field8993 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I")
    public static final int method3563(byte arg0) {
        if (arg0 != -31) {
            return -1;
        } else {
            ++field8994;
            return 42;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field8986;
        if (arg1 != 656024161) {
            return null;
        } else {
            int[] var3 = super.field774.method3086(arg0, -2);
            if (super.field774.field7499) {
                for (int var4 = 0; ~var4 > ~class438.field5847; ++var4) {
                    int var5 = (class200.field2965[var4] << 12) / this.field8995 - -this.field8987;
                    int var6 = (class309.field4265[arg0] << 12) / this.field8995 + this.field8985;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~var13 > ~this.field8992) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var11 - var12 - -var7;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~var13 > ~(this.field8992 + -1) ? (var13 << 12) / this.field8992 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class604() {
        super(0, true);
    }
}
