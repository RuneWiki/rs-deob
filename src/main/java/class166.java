import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class166 extends class423 {

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
    public static int[] field2528 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lmq;")
    private class85 field2526;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lmq;")
    private class85 field2529;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Lmq;")
    private class85 field2530;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lmq;")
    public class85 field2532;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Lmq;")
    private class85 field2533;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lmq;")
    private class85 field2534;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 10)
    public final void method20(int arg0) {
        ++field2531;
        super.method20(-77);
        class510 var2 = (class510) super.field5885;
        this.field2532 = class663.method3712(95, super.field5887, var2.field7013);
        this.field2530 = class663.method3712(123, super.field5887, var2.field7008);
        if (arg0 >= -50) {
            this.field2529 = null;
        }
        this.field2529 = class663.method3712(97, super.field5887, var2.field7009);
        this.field2534 = class663.method3712(124, super.field5887, var2.field7016);
        this.field2533 = class663.method3712(101, super.field5887, var2.field7005);
        this.field2526 = class663.method3712(120, super.field5887, var2.field7012);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)V", line = 29)
    public final void method784(boolean arg0, int arg1, int arg2, int arg3) {
        ++field2527;
        if (arg2 < 12) {
            this.method623(119, -126, -43, -40, -104);
        }
        int var5 = arg3 + this.field2529.method11();
        int var6 = super.field5885.field9960 + arg3 + -this.field2534.method11();
        int var7 = arg1 + this.field2533.method14();
        int var8 = super.field5885.field9968 + arg1 - this.field2526.method14();
        int var9 = var6 - var5;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method2490(false) / 10000;
        int[] var12 = new int[4];
        class686.field9702.method422(var12);
        class686.field9702.method488(var5, var7, var5 + var11, var8);
        this.method623(12, var7, var10, var5, var9);
        class686.field9702.method488(var5 + var11, var7, var6, var8);
        this.field2530.method757(var5, var7, var9, var10);
        class686.field9702.method488(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V", line = 63)
    public static final void method1239(boolean arg0) {
        ++field2535;
        if (arg0) {
            method1239(true);
        }
        class272.field3827 = true;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lgga;Lgga;Lraa;)V", line = 80)
    public class166(class513 arg0, class513 arg1, class510 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z", line = 83)
    public final boolean method17(int arg0) {
        ++field2536;
        if (!super.method17(-128)) {
            return false;
        } else {
            class510 var2 = (class510) super.field5885;
            if (!super.field5887.method3005(var2.field7013, (byte) -69)) {
                return false;
            } else if (!super.field5887.method3005(var2.field7008, (byte) -69)) {
                return false;
            } else if (!super.field5887.method3005(var2.field7009, (byte) -69)) {
                return false;
            } else if (!super.field5887.method3005(var2.field7016, (byte) -69)) {
                return false;
            } else if (!super.field5887.method3005(var2.field7005, (byte) -69)) {
                return false;
            } else if (arg0 > -93) {
                return true;
            } else {
                return super.field5887.method3005(var2.field7012, (byte) -69);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 121)
    public static void method1240(byte arg0) {
        field2528 = null;
        int var1 = -128 / ((arg0 - 48) / 43);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIB)V", line = 132)
    public final void method786(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field2538;
        if (arg0) {
            int[] var5 = new int[4];
            class686.field9702.method422(var5);
            class686.field9702.method488(arg2, arg1, super.field5885.field9960 + arg2, super.field5885.field9968 + arg1);
            int var6 = this.field2529.method11();
            int var7 = this.field2529.method14();
            int var8 = this.field2534.method11();
            int var9 = this.field2534.method14();
            this.field2529.method759(arg2, arg1 - -((super.field5885.field9968 - var7) / 2));
            this.field2534.method759(-var8 + arg2 - -super.field5885.field9960, arg1 - -((super.field5885.field9968 - var9) / 2));
            class686.field9702.method488(arg2, arg1, super.field5885.field9960 + arg2, arg1 - -this.field2533.method14());
            this.field2533.method757(arg2 + var6, arg1, -var6 + -var8 + super.field5885.field9960, super.field5885.field9968);
            int var10 = this.field2526.method14();
            class686.field9702.method488(arg2, arg1 - (-super.field5885.field9968 + var10), super.field5885.field9960 + arg2, super.field5885.field9968 + arg1);
            this.field2526.method757(arg2 + var6, -var10 + arg1 + super.field5885.field9968, -var6 + -var8 + super.field5885.field9960, super.field5885.field9968);
            class686.field9702.method488(var5[0], var5[1], var5[2], var5[3]);
        }
        if (arg3 != 33) {
            this.field2526 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V", line = 167)
    public void method623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2537;
        if (arg0 != 12) {
            method1240((byte) 121);
        }
        this.field2532.method757(arg3, arg1, arg4, arg2);
    }
}
