import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class167 extends class337 {

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    private int field2462 = -1;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[[I")
    public static int[][] field2464 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
    public static int[] field2468 = new int[14];

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field2466;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "[I")
    private int[] field2470;

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 6)
    public class167() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 10)
    public static final void method1120(byte arg0) {
        if (arg0 != 57) {
            method1120((byte) -78);
        }
        ++field2474;
        class446.field6543 = class322.method2052(4, 0.4F, 2048, true, -5607, 8, 8, 35);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V", line = 22)
    public final void method1121(int arg0, int arg1, int arg2) {
        ++field2472;
        super.method1121(arg0, arg1, arg2);
        if (~this.field2462 <= -1 && class503.field7264 != null) {
            int var4 = class503.field7264.method584(true, this.field2462).field4257 ? 64 : 128;
            this.field2470 = class503.field7264.method583(var4, var4, this.field2462, 1.0F, (byte) -124, false);
            this.field2467 = var4;
            this.field2466 = var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V", line = 45)
    public static final void method1122(int arg0, int arg1) {
        ++field2463;
        class211 var2 = class452.method2749(arg1, arg1 + 117, arg0);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILhp;)V", line = 58)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 103 / ((82 - arg0) / 40);
        ++field2473;
        if (arg1 == 0) {
            this.field2462 = arg2.method1511(-51);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I", line = 70)
    public final int method1123(byte arg0) {
        ++field2469;
        if (arg0 != -101) {
            this.method1124(50);
        }
        return this.field2462;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I", line = 81)
    public final int[][] method673(int arg0, int arg1) {
        ++field2460;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        int var4 = -52 / ((arg1 - -41) / 49);
        if (super.field5011.field3346) {
            int var5 = (class329.field4952 == this.field2466 ? arg0 : this.field2466 * arg0 / class329.field4952) * this.field2467;
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class402.field5977 != ~this.field2467) {
                for (int var9 = 0; ~var9 > ~class402.field5977; ++var9) {
                    int var10 = this.field2467 * var9 / class402.field5977;
                    int var11 = this.field2470[var5 - -var10];
                    var8[var9] = class74.method644(var11 << 4, 4080);
                    var7[var9] = class74.method644(65280, var11) >> 4;
                    var6[var9] = class74.method644(var11, 16711680) >> 12;
                }
            } else {
                for (int var12 = 0; ~var12 > ~class402.field5977; ++var12) {
                    int var13 = this.field2470[var5++];
                    var8[var12] = class74.method644(var13, 255) << 4;
                    var7[var12] = class74.method644(var13, 65280) >> 4;
                    var6[var12] = class74.method644(var13 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 152)
    public final void method1124(int arg0) {
        ++field2461;
        super.method1124(arg0);
        this.field2470 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lva;", line = 164)
    public static final class346 method1125(Canvas arg0, byte arg1) {
        ++field2459;
        if (arg1 >= -77) {
            return null;
        } else {
            try {
                Class var2 = Class.forName("ep");
                class346 var3 = (class346) var2.newInstance();
                var3.method1903(arg0, false);
                return var3;
            } catch (Throwable var5) {
                class483 var4 = new class483();
                var4.method1903(arg0, false);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)V", line = 187)
    public static void method1126(int arg0) {
        field2468 = null;
        field2464 = null;
        int var1 = 109 / ((69 - arg0) / 41);
    }
}
