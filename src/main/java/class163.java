import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class163 extends class270 {

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    private int field2637 = 32768;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "Lr;")
    public static class250 field2639 = new class250();

    @OriginalMember(owner = "client!om", name = "db", descriptor = "[I")
    public static int[] field2645 = new int[1000];

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "Lmh;")
    public static class62 field2643 = class201.method1405(true, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!om", name = "eb", descriptor = "Lmh;")
    public static class62 field2646 = class201.method1405(true, ":");

    @OriginalMember(owner = "client!om", name = "ib", descriptor = "Lmh;")
    public static class62 field2650 = class201.method1405(true, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!om", name = "gb", descriptor = "Z")
    public static volatile boolean field2648 = false;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "Lhi;")
    public static class26 field2638;

    @OriginalMember(owner = "client!om", name = "hb", descriptor = "Lhi;")
    public static class26 field2649;

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "[I")
    public static int[] field2644;

    @OriginalMember(owner = "client!om", name = "fb", descriptor = "[Lqg;")
    public static class95[] field2647;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            this.method11(false, 18);
        }
        field2634++;
        int[] var3 = this.field4573.method919(arg1, arg0 ^ 0x2CDD);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(1, 0, arg1);
            int[] var5 = this.method1850(2, 0, arg1);
            for (int var6 = 0; var6 < class109.field1770; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field2637 >> 12;
                int var9 = class269.field4563[var7] * var8 >> 12;
                int var10 = class63.field953[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + var6 & class49.field717;
                int var12 = (var9 >> 12) + arg1 & class307.field5268;
                int[] var13 = this.method1850(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIILjm;Ljm;IIIIJ)V", line = 67)
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, class123 arg4, class123 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class268 var12 = new class268();
        var12.field4554 = arg10;
        var12.field4556 = arg1 * 128 + 64;
        var12.field4549 = arg2 * 128 + 64;
        var12.field4557 = arg3;
        var12.field4559 = arg4;
        var12.field4552 = arg5;
        var12.field4555 = arg6;
        var12.field4553 = arg7;
        var12.field4543 = arg8;
        var12.field4548 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class256.field4320[var13][arg1][arg2] == null) {
                class256.field4320[var13][arg1][arg2] = new class166(var13, arg1, arg2);
            }
        }
        class256.field4320[arg0][arg1][arg2].field2720 = var12;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lmi;II)V", line = 100)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field2640++;
        if (arg1 == 0) {
            this.field2637 = arg0.method721(116) << 4;
        } else if (arg1 == 1) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        int var5 = 18 % ((-arg2 - 8) / 53);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 133)
    public class163() {
        super(3, false);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)[[I", line = 142)
    public final int[][] method11(boolean arg0, int arg1) {
        field2642++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (arg0) {
            field2648 = false;
        }
        if (this.field4589.field1320) {
            int[] var4 = this.method1850(1, 0, arg1);
            int[] var5 = this.method1850(2, 0, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class109.field1770; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field2637 >> 12;
                int var12 = class63.field953[var10] * var11 >> 12;
                int var13 = class269.field4563[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class49.field717;
                int var15 = class307.field5268 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1855(arg0, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(B)V", line = 195)
    public final void method231(byte arg0) {
        if (arg0 != 90) {
            field2649 = (class26) null;
        }
        field2635++;
        class96.method767((byte) 101);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Loe;", line = 206)
    public static final class56 method1178(int arg0, int arg1) {
        field2636++;
        class56 var2 = (class56) class236.field4060.method263(2013, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 64) {
            method1179(false);
        }
        byte[] var3 = class301.field5180.method157(class278.method1897(arg0, arg1 ^ 0x2E3), class218.method1555(arg0, -105), (byte) 19);
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method367(-118, new class92(var3));
        }
        class236.field4060.method257(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 238)
    public static void method1179(boolean arg0) {
        field2647 = null;
        field2644 = null;
        field2639 = null;
        field2645 = null;
        field2650 = null;
        field2638 = null;
        field2646 = null;
        if (arg0) {
            field2643 = null;
            field2649 = null;
        }
    }
}
