import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class52 extends class371 {

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    private int field625 = 4096;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Lrk;")
    public static class419 field628 = new class419();

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field629;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
    public static void method267(int arg0) {
        field628 = null;
        field629 = null;
        if (arg0 != 0) {
            field629 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field626;
        if (arg0 >= -80) {
            method267(43);
        }
        int[] var3 = super.field5378.method1451(124, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -103, arg1 + -1 & class135.field1789, 0);
            int[] var5 = this.method2260((byte) -85, arg1, 0);
            int[] var6 = this.method2260((byte) -84, arg1 - -1 & class135.field1789, 0);
            for (int var7 = 0; ~var7 > ~class41.field455; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field625;
                int var9 = (var5[var7 + 1 & class343.field5013] + -var5[class343.field5013 & var7 + -1]) * this.field625;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field627;
        if (~arg0 == -1) {
            this.field625 = arg2.method2620(108);
        }
        int var4 = 40 / ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, true);
    }
}
