import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class573 extends class62 {

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    private int field8433 = 4096;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    private int field8436 = 4096;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    private int field8438 = 4096;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
    public static int[] field8437 = new int[8];

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field8435;

    static {
        new class572("Use", "Benutzen", "Utiliser", "Usar");
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 6)
    public class573() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lgw;II)V", line = 9)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field8433 = arg0.method1045(true);
                }
            } else {
                this.field8438 = arg0.method1045(true);
            }
        } else {
            this.field8436 = arg0.method1045(true);
        }
        if (arg1 != -1) {
            this.method409(40, (byte) 73);
        }
        ++field8432;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[[I", line = 52)
    public final int[][] method409(int arg0, byte arg1) {
        if (arg1 >= -20) {
            this.field8436 = 4;
        }
        ++field8434;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class438.field5847 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field8436 * var12 >> 12;
                    var9[var11] = this.field8438 * var13 >> 12;
                    var10[var11] = this.field8433 * var14 >> 12;
                } else {
                    var8[var11] = this.field8436;
                    var9[var11] = this.field8438;
                    var10[var11] = this.field8433;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V", line = 114)
    public static void method3411(int arg0) {
        if (arg0 == 1) {
            field8437 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IBI)Z", line = 127)
    public static final boolean method3412(int arg0, byte arg1, int arg2) {
        ++field8435;
        int var3 = 121 % ((arg1 - 65) / 49);
        return (arg2 & 34) != 0;
    }
}
