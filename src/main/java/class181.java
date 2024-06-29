import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class181 extends class202 {

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field2634 = -1;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "Ljd;")
    public static class426 field2626 = new class426("LIVE", 0);

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "[I")
    public static int[] field2638 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    private int field2625;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    private int field2632;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Lmn;")
    public static class162 field2636;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Ljava/lang/Object;")
    public static Object field2627;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "[I")
    private int[] field2624;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "[I")
    public static int[] field2633;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(III)V")
    public final void method1142(int arg0, int arg1, int arg2) {
        int var4 = -36 / ((-16 - arg0) / 58);
        super.method1142(62, arg1, arg2);
        ++field2639;
        if (this.field2634 >= 0 && class380.field5841 != null) {
            int var5 = !class380.field5841.method1366(this.field2634, (byte) -118).field7295 ? 128 : 64;
            this.field2624 = class380.field5841.method1367(false, 1.0F, this.field2634, var5, -25218, var5);
            this.field2632 = var5;
            this.field2625 = var5;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 27 % ((arg1 - -46) / 50);
        ++field2629;
        if (~arg2 == -1) {
            this.field2634 = arg0.method1455(-3387);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V")
    public static final void method1143(int arg0, int arg1) {
        ++field2637;
        if (arg0 != 1) {
            method1144(109);
        }
        class456 var2 = class233.method1654(arg1, 10, 127);
        var2.method2862(arg0 + -1);
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static void method1144(int arg0) {
        field2633 = null;
        field2626 = null;
        field2638 = null;
        field2636 = null;
        if (arg0 > -33) {
            method1146(40, (byte) -1);
        }
        field2627 = null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field2635;
        if (arg0 != -1) {
            method1146(111, (byte) 81);
        }
        int[][] var3 = super.field3081.method1050(arg1, -100);
        if (super.field3081.field2432) {
            int var4 = this.field2632 * (~class249.field4051 == ~this.field2625 ? arg1 : this.field2625 * arg1 / class249.field4051);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class276.field4375 != this.field2632) {
                for (int var8 = 0; var8 < class276.field4375; ++var8) {
                    int var9 = this.field2632 * var8 / class276.field4375;
                    int var10 = this.field2624[var4 + var9];
                    var7[var8] = class272.method1842(var10, 255) << 4;
                    var6[var8] = class272.method1842(var10 >> 4, 4080);
                    var5[var8] = class272.method1842(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class276.field4375 < ~var11; ++var11) {
                    int var12 = this.field2624[var4++];
                    var7[var11] = class272.method1842(255, var12) << 4;
                    var6[var11] = class272.method1842(4080, var12 >> 4);
                    var5[var11] = class272.method1842(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method1145(int arg0) {
        if (arg0 != 0) {
            this.field2632 = -50;
        }
        ++field2631;
        return this.field2634;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)I")
    public static final int method1146(int arg0, byte arg1) {
        if (arg1 != -66) {
            method1144(-7);
        }
        ++field2628;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public final void method1147(byte arg0) {
        super.method1147((byte) -106);
        ++field2630;
        this.field2624 = null;
        if (arg0 >= -63) {
            field2626 = null;
        }
    }
}
