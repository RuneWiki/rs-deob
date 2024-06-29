import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class25 extends class175 {

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    private int field545 = 4096;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "S")
    public static short field539 = 320;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "Lij;")
    public static class50 field547 = class78.method578(125, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lpe;")
    public static class100 field538 = new class100(64);

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "Lij;")
    private static class50 field548 = class78.method578(127, "OFF");

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "Lij;")
    public static class50 field549 = field548;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "Lv;")
    public static class143 field546;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        ++field540;
        if (class148.field2547 != null) {
            class148.field2547.method630(2);
            class148.field2547 = null;
        }
        class36.method289(76);
        class51.method415();
        for (int var1 = 0; var1 < 4; ++var1) {
            class45.field826[var1].method338(arg0 ^ -22440);
        }
        class204.method1381(arg0 ^ 98);
        System.gc();
        class216.method1433(-1, 2);
        class91.field1718 = false;
        class250.field4347 = -1;
        class200.method1335(64, true);
        class163.field2783 = false;
        class254.field4394 = 0;
        class61.field1124 = 0;
        if (arg0 == 54) {
            for (int var2 = 0; ~var2 > ~class36.field707.length; ++var2) {
                class36.field707[var2] = null;
            }
            class6.field77 = 0;
            class78.field1450 = 0;
            for (int var3 = 0; ~var3 > -2049; ++var3) {
                class71.field1370[var3] = null;
                class174.field2913[var3] = null;
            }
            for (int var4 = 0; ~var4 > -32769; ++var4) {
                class41.field764[var4] = null;
            }
            class231.method1577((byte) 3);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            method240(0);
        }
        ++field544;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, class108.field1928 & arg0 + -1, 16745);
            int[] var5 = this.method1210(0, arg0, arg1 + 44491);
            int[] var6 = this.method1210(0, arg0 + 1 & class108.field1928, arg1 ^ -11529);
            for (int var7 = 0; ~var7 > ~class211.field3514; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field545;
                int var9 = (var5[class161.field2765 & var7 + 1] + -var5[var7 - 1 & class161.field2765]) * this.field545;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class25() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public static final void method240(int arg0) {
        class20.field416.method763(arg0 ^ arg0);
        ++field542;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            field541 = 18;
        }
        if (~arg1 == -1) {
            this.field545 = arg2.method1441(-18);
        }
        ++field543;
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)V")
    public static void method241(int arg0) {
        field549 = null;
        if (arg0 != -18193) {
            field549 = null;
        }
        field547 = null;
        field538 = null;
        field546 = null;
        field548 = null;
    }
}
