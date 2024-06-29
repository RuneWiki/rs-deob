import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class43 extends class710 {

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    private int field533 = 0;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)V")
    public static final void method236(int arg0, int arg1, byte arg2) {
        ++field531;
        if (class258.field3735 != 1) {
            if (class258.field3735 == 2) {
                if (class222.field3009) {
                    class435.method2683(-89, arg0 + class580.method3374(24188), class721.method4038(true) + arg1);
                } else {
                    class435.method2683(-99, arg0, arg1);
                }
            }
        } else {
            class673.method3804(class435.field6066, arg0, arg1, true);
        }
        class435.field6066 = null;
        int var3 = -49 / ((arg2 - -62) / 61);
        class258.field3735 = 0;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lcea;BI[I)V")
    public static final void method237(class96 arg0, byte arg1, int arg2, int[] arg3) {
        if (arg0.field7105 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field7105.length; ++var5) {
                if (~arg0.field7105[var5] != ~arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field7132 != -1) {
                class57 var6 = class607.field8188.method3001(-12575, arg0.field7132);
                int var7 = var6.field818;
                if (~var7 == -2) {
                    arg0.field7123 = 0;
                    arg0.field7131 = 0;
                    arg0.field7164 = 1;
                    arg0.field7170 = arg2;
                    arg0.field7127 = 0;
                    if (!arg0.field7134) {
                        class123.method765(arg0.field7127, arg0, var6, false);
                    }
                }
                if (var7 == 2) {
                    arg0.field7123 = 0;
                }
            }
        }
        ++field528;
        if (arg1 >= -83) {
            method237((class96) null, (byte) 109, 39, (int[]) null);
        }
        boolean var8 = true;
        for (int var9 = 0; ~arg3.length < ~var9; ++var9) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg0.field7105 == null || arg0.field7105[var9] == -1 || class607.field8188.method3001(-12575, arg3[var9]).field815 >= class607.field8188.method3001(-12575, arg0.field7105[var9]).field815) {
                arg0.field7105 = arg3;
                arg0.field7170 = arg2;
                break;
            }
        }
        if (var8) {
            arg0.field7105 = arg3;
            arg0.field7170 = arg2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Luu;Lrf;)V")
    public class43(class237 arg0, class754 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BZ)V")
    public final void method201(byte arg0, boolean arg1) {
        ++field529;
        int var3 = super.field9901.field7639.method3281(false, class732.field10164, super.field9905.method1963()) - -super.field9901.field7631;
        if (arg0 > -74) {
            this.field533 = -3;
        }
        int var4 = super.field9901.field7632.method779(super.field9905.method1961(), class84.field1195, 14) + super.field9901.field7634;
        super.field9905.method1960((float) (var3 - -(super.field9905.method1963() / 2)), (float) (var4 + super.field9905.method1961() / 2), 4096, this.field533);
        this.field533 += ((class754) super.field9901).field10382;
    }
}
