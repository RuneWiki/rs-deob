import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class157 extends class37 {

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    private int field3199 = 4096;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    private int field3205 = 4096;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    private int field3201 = 4096;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Ldd;")
    public static class35 field3202 = class180.method1196((byte) 126, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field3198 = 0;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "Ldd;")
    public static class35 field3206 = class180.method1196((byte) 126, "Versteckt");

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field3207;
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (arg1 < 5) {
            return null;
        } else {
            if (super.field832.field1978) {
                int[][] var4 = this.method370(arg0, 0, 3);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                int[] var10 = var3[1];
                for (int var11 = 0; class72.field1719 > var11; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (var12 == var14 && var13 == var14) {
                        var9[var11] = this.field3199 * var12 >> 12;
                        var10[var11] = this.field3201 * var14 >> 12;
                        var8[var11] = this.field3205 * var13 >> 12;
                    } else {
                        var9[var11] = this.field3199;
                        var10[var11] = this.field3201;
                        var8[var11] = this.field3205;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        if (arg0 != 10) {
            field3206 = null;
        }
        field3206 = null;
        field3202 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field3200;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3205 = arg2.method256((byte) -78);
                }
            } else {
                this.field3201 = arg2.method256((byte) -78);
            }
        } else {
            this.field3199 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            this.method1(-56, -18, (class26) null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZIZLag;)V")
    public static final void method1052(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, class8 arg6) {
        if (!arg5) {
            method1052(-109, -119, -75, true, -1, true, (class8) null);
        }
        class201.field4024 = arg4;
        ++field3204;
        class28.field580 = arg2;
        class54.field1204 = 1;
        class127.field2757 = arg6;
        class114.field2540 = arg0;
        class193.field3870 = arg3;
        class56.field1392 = arg1;
    }
}
