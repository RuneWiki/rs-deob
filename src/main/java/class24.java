import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class440 {

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    private int field326 = 4096;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "Lnea;")
    public static class664 field329 = new class664(10, -1);

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)V")
    public static final void method282(int arg0) {
        ++field327;
        if (!class438.field6398) {
            if (arg0 == -17) {
                class438.field6398 = true;
                class700.field9892 = true;
                if (class287.field4270.field3685) {
                    class105.field1635 = (float) (-16 & (int) class105.field1635 + -17);
                } else {
                    class290.field4303 += (-class290.field4303 + -12.0F) / 2.0F;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 == 5) {
            if (~arg2 == -1) {
                this.field326 = arg1.method3847((byte) 118);
            }
            ++field324;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
    public static void method283(byte arg0) {
        field329 = null;
        if (arg0 < 67) {
            field328 = 60;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBILpu;)Llm;")
    public static final class461 method284(int arg0, byte arg1, int arg2, class522 arg3) {
        if (arg1 <= 2) {
            field328 = -81;
        }
        ++field323;
        byte[] var4 = arg3.method3007(arg0, arg2, 5);
        return var4 == null ? null : new class461(var4);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILpu;B)Loq;")
    public static final class326 method285(int arg0, int arg1, class522 arg2, byte arg3) {
        ++field325;
        class695 var4 = new class695(arg2.method3007(arg1, arg0, 5));
        class326 var5 = new class326(arg0, var4.method3836(false), var4.method3836(false), var4.method3880(8), var4.method3880(8), ~var4.method3826(false) == -2, var4.method3826(false), var4.method3826(false));
        int var6 = var4.method3826(false);
        int var7 = 0;
        int var8 = 61 % ((arg3 - 57) / 39);
        while (var7 < var6) {
            var5.field4831.method474(new class394(var4.method3826(false), var4.method3847((byte) 118), var4.method3847((byte) 118), var4.method3847((byte) 118), var4.method3847((byte) 118), var4.method3847((byte) 118), var4.method3847((byte) 118), var4.method3847((byte) 118), var4.method3847((byte) 118)), 6);
            ++var7;
        }
        var5.method2055((byte) 120);
        return var5;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field330;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int[] var4 = this.method2611(113, class651.field9116 & arg1 + -1, 0);
            int[] var5 = this.method2611(123, arg1, 0);
            int[] var6 = this.method2611(-39, arg1 + 1 & class651.field9116, 0);
            for (int var7 = 0; ~var7 > ~class549.field7715; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field326;
                int var9 = (var5[class420.field6112 & var7 - -1] + -var5[var7 - 1 & class420.field6112]) * this.field326;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        int var16 = 85 / ((arg0 - -56) / 41);
        return var3;
    }
}
