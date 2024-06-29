import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class178 extends class64 {

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    private int field3530 = 4;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    private int field3531 = 4;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Lcd;")
    public static class23 field3528 = class54.method414("http:)4)4", -1);

    @OriginalMember(owner = "client!th", name = "V", descriptor = "Lcf;")
    public static class25 field3534 = new class25();

    @OriginalMember(owner = "client!th", name = "X", descriptor = "Lcd;")
    public static class23 field3536 = class54.method414("Null", -1);

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static volatile int field3538 = -1;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "[Lea;")
    public static class38[] field3535;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            field3536 = null;
        }
        ++field3532;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int var4 = class2.field24 / this.field3530;
            int var5 = arg0 % var4;
            int[][] var6 = this.method482(0, class2.field24 * var5 / var4, (byte) -123);
            int[] var7 = var6[0];
            int[] var8 = var6[1];
            int[] var9 = var3[0];
            int[] var10 = var6[2];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            for (int var13 = 0; class168.field3367 > var13; ++var13) {
                int var14 = class168.field3367 / this.field3531;
                int var15 = var13 % var14;
                int var16 = class168.field3367 * var15 / var14;
                var9[var13] = var7[var16];
                var12[var13] = var8[var16];
                var11[var13] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field3535 = null;
        field3528 = null;
        int var1 = 114 / ((28 - arg0) / 49);
        field3536 = null;
        field3534 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            return null;
        } else {
            ++field3529;
            int[] var3 = super.field1513.method1033(-75, arg0);
            if (super.field1513.field3368) {
                int var4 = class2.field24 / this.field3530;
                int var5 = arg0 % var4;
                int[] var6 = this.method479(-1, class2.field24 * var5 / var4, 0);
                for (int var7 = 0; class168.field3367 > var7; ++var7) {
                    int var8 = class168.field3367 / this.field3531;
                    int var9 = var7 % var8;
                    var3[var7] = var6[class168.field3367 * var9 / var8];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 64 % ((7 - arg0) / 43);
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3530 = arg2.method1202(-106);
            }
        } else {
            this.field3531 = arg2.method1202(-29);
        }
        ++field3533;
    }
}
