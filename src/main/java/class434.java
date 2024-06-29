import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class434 extends class337 {

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    private int field6415 = 32768;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Ljava/lang/Object;")
    public static Object field6424;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class434() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field6423;
        if (arg1 != -11) {
            field6424 = null;
        }
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(arg0, 1, -53);
            int[] var5 = this.method2124(arg0, 2, -107);
            for (int var6 = 0; var6 < class402.field5977; ++var6) {
                int var7 = (var4[var6] & 4091) >> 4;
                int var8 = var5[var6] * this.field6415 >> 12;
                int var9 = class333.field4972[var7] * var8 >> 12;
                int var10 = class60.field716[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class446.field6541;
                int var12 = arg0 - -(var10 >> 12) & class123.field1843;
                int[] var13 = this.method2124(var12, 0, -56);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field6420;
        int var4 = -58 / ((arg0 - 82) / 40);
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field5019 = ~arg2.method1515((byte) 126) == -2;
            }
        } else {
            this.field6415 = arg2.method1511(101) << 4;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)V")
    public static final void method2690(int arg0, long arg1) {
        ++field6422;
        if (~arg1 < -1L) {
            if (~(arg1 % (long) arg0) == -1L) {
                class60.method527(arg1 + -1L, arg0 ^ 10);
                class60.method527(1L, 0);
            } else {
                class60.method527(arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        ++field6416;
        class61.method539((byte) 127);
        if (arg0 < 1) {
            this.field6415 = -13;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    public static void method2691(byte arg0) {
        if (arg0 >= -20) {
            field6424 = null;
        }
        field6424 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field6421;
        int var3 = 127 % ((arg1 - -41) / 49);
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[] var5 = this.method2124(arg0, 1, -125);
            int[] var6 = this.method2124(arg0, 2, -55);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; ~class402.field5977 < ~var10; ++var10) {
                int var11 = 255 & var5[var10] * 255 >> 12;
                int var12 = var6[var10] * this.field6415 >> 12;
                int var13 = class333.field4972[var11] * var12 >> 12;
                int var14 = class60.field716[var11] * var12 >> 12;
                int var15 = class446.field6541 & (var13 >> 12) + var10;
                int var16 = class123.field1843 & (var14 >> 12) + arg0;
                int[][] var17 = this.method2123(var16, 0, -113);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgn;")
    public static final class497 method2692(Throwable arg0, String arg1) {
        ++field6418;
        class497 var2;
        if (!(arg0 instanceof class497)) {
            var2 = new class497(arg0, arg1);
        } else {
            var2 = (class497) arg0;
            var2.field7150 = var2.field7150 + ' ' + arg1;
        }
        return var2;
    }
}
