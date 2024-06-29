import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class430 extends class337 {

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    private int field6379 = 4096;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "Lul;")
    public static class406 field6378;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field6380;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(arg0 + -1 & class123.field1843, 0, arg1 + -45);
            int[] var5 = this.method2124(arg0, 0, -116);
            int[] var6 = this.method2124(arg0 - -1 & class123.field1843, 0, -54);
            for (int var7 = 0; class402.field5977 > var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field6379;
                int var9 = (var5[var7 - -1 & class446.field6541] + -var5[var7 + -1 & class446.field6541]) * this.field6379;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != -11) {
            field6377 = -41;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)V")
    public static void method2673(int arg0) {
        int var1 = -128 % ((arg0 - 29) / 39);
        field6378 = null;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class430() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (arg1 == 0) {
            this.field6379 = arg2.method1511(-77);
        }
        int var4 = -34 % ((82 - arg0) / 40);
        ++field6381;
    }
}
