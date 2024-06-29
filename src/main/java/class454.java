import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class454 extends class62 {

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "I")
    private int field6411 = -1;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "Lgf;")
    public static class232 field6410 = new class232();

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "Ltda;")
    public static class546 field6420 = new class546(1, 2, 2, 0);

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "Lada;")
    public static class144 field6422 = new class144(68, 8);

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
    private int field6412;

    @OriginalMember(owner = "client!pt", name = "F", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
    private int field6415;

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!pt", name = "L", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "[I")
    private int[] field6421;

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 8)
    public class454() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)I", line = 11)
    public static final int method2759(int arg0) {
        ++field6417;
        if (arg0 > -51) {
            field6410 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "(I)V", line = 22)
    public static void method2760(int arg0) {
        field6410 = null;
        field6420 = null;
        if (arg0 != 0) {
            method2759(-75);
        }
        field6422 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lgw;II)V", line = 34)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field6416;
        if (~arg2 == arg1) {
            this.field6411 = arg0.method1045(true);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)[[I", line = 48)
    public final int[][] method409(int arg0, byte arg1) {
        ++field6418;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 >= -20) {
            this.field6411 = 92;
        }
        if (super.field772.field6899) {
            int var4 = (~class14.field148 != ~this.field6412 ? this.field6412 * arg0 / class14.field148 : arg0) * this.field6415;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class438.field5847 != ~this.field6415) {
                for (int var8 = 0; var8 < class438.field5847; ++var8) {
                    int var9 = this.field6415 * var8 / class438.field5847;
                    int var10 = this.field6421[var4 + var9];
                    var7[var8] = class37.method245(255, var10) << 4;
                    var6[var8] = class37.method245(4080, var10 >> 4);
                    var5[var8] = class37.method245(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class438.field5847 > var11; ++var11) {
                    int var12 = this.field6421[var4++];
                    var7[var11] = class37.method245(var12, 255) << 4;
                    var6[var11] = class37.method245(var12, 65280) >> 4;
                    var5[var11] = class37.method245(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V", line = 113)
    public final void method405(int arg0) {
        super.method405(arg0);
        ++field6419;
        this.field6421 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I", line = 122)
    public final int method401(int arg0) {
        if (arg0 > -9) {
            return 74;
        } else {
            ++field6413;
            return this.field6411;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)V", line = 136)
    public final void method400(int arg0, boolean arg1, int arg2) {
        ++field6414;
        if (!arg1) {
            this.method400(67, true, -6);
        }
        super.method400(arg0, arg1, arg2);
        if (~this.field6411 <= -1 && class569.field8397 != null) {
            int var4 = !class569.field8397.method110(this.field6411, (byte) 119).field6651 ? 128 : 64;
            this.field6421 = class569.field8397.method113(var4, false, -4074, var4, 1.0F, this.field6411);
            this.field6412 = var4;
            this.field6415 = var4;
        }
    }
}
