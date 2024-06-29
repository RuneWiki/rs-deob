import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class178 extends class601 {

    @OriginalMember(owner = "client!dca", name = "I", descriptor = "I")
    private int field2683 = 4096;

    @OriginalMember(owner = "client!dca", name = "F", descriptor = "Lhda;")
    public static class752 field2680 = new class752(50, -2);

    @OriginalMember(owner = "client!dca", name = "L", descriptor = "S")
    public static short field2685 = 320;

    @OriginalMember(owner = "client!dca", name = "N", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!dca", name = "G", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!dca", name = "H", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!dca", name = "M", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!dca", name = "K", descriptor = "J")
    public static long field2684;

    @OriginalMember(owner = "client!dca", name = "O", descriptor = "Ltea;")
    public static class241 field2688;

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "Lofa;")
    public static class333 field2679;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(Z)V")
    public static final void method1233(boolean arg0) {
        if (!arg0) {
            method1234(-110, -113, (String) null);
        }
        ++field2681;
        if (~class95.field1159 != 0) {
            class491.method2783(-1, false, -2753, class95.field1159, -1);
            class95.field1159 = -1;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1234(int arg0, int arg1, String arg2) {
        if (arg1 == 31663) {
            ++field2686;
            class494.method2789(0, arg2, "", (byte) -15, "", "", arg0);
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field2678;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            field2685 = -27;
        }
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1 - 1 & class112.field1855, 0);
            int[] var5 = this.method3266((byte) 64, arg1, 0);
            int[] var6 = this.method3266((byte) 64, arg1 + 1 & class112.field1855, 0);
            for (int var7 = 0; class171.field2624 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2683;
                int var9 = (var5[class445.field6116 & var7 + 1] + -var5[var7 + -1 & class445.field6116]) * this.field2683;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2679 = null;
        if (arg0 == 19706) {
            field2680 = null;
            field2688 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2683 = arg0.method3807(-1);
        }
        ++field2682;
        if (arg1 != -61) {
            this.field2683 = -68;
        }
    }
}
