import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class79 extends class751 {

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
    private int field1051 = 4096;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1045 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!naa", name = "J", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "Lda;")
    public static class67 field1047;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V")
    public static final void method600(int arg0) {
        ++field1044;
        for (class455 var1 = (class455) class715.field10079.method2508((byte) -110); var1 != null; var1 = (class455) class715.field10079.method2505((byte) -55)) {
            if (var1.field6532) {
                var1.method3117((byte) 99);
            } else {
                var1.field6528 = true;
                if (var1.field6529 >= 0 && var1.field6523 >= 0 && ~class109.field1314 < ~var1.field6529 && ~class760.field10479 < ~var1.field6523) {
                    class729.method4091(var1, (byte) -119);
                }
            }
        }
        for (class455 var2 = (class455) class110.field1360.method2508((byte) -46); var2 != null; var2 = (class455) class110.field1360.method2505((byte) -55)) {
            if (!var2.field6532) {
                var2.field6528 = true;
            } else {
                var2.method3117((byte) -112);
            }
        }
        if (arg0 > -84) {
            field1045 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "()V")
    public class79() {
        super(1, true);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V")
    public static final void method601(boolean arg0) {
        ++field1046;
        if (~class459.field6580 > -1) {
            class265.field3746 = -1;
            class459.field6580 = 0;
            class389.field5537 = -1;
        }
        if (~class436.field6236 > ~class459.field6580) {
            class389.field5537 = -1;
            class265.field3746 = -1;
            class459.field6580 = class436.field6236;
        }
        if (!arg0) {
            method603(113);
        }
        if (~class450.field6465 > -1) {
            class450.field6465 = 0;
            class389.field5537 = -1;
            class265.field3746 = -1;
        }
        if (class436.field6225 < class450.field6465) {
            class265.field3746 = -1;
            class389.field5537 = -1;
            class450.field6465 = class436.field6225;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1051 = arg1.method898((byte) -81);
        }
        ++field1050;
        int var4 = -93 / ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)V")
    public static final void method602(int arg0) {
        ++field1052;
        if (!class533.field7529) {
            if (arg0 != -1) {
                method603(-63);
            }
            class452.field6508 = true;
            class243.field3478 += (-12.0F - class243.field3478) / 2.0F;
            class533.field7529 = true;
        }
    }

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "(I)V")
    public static void method603(int arg0) {
        if (arg0 != 32324) {
            method601(true);
        }
        field1045 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field1049;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0 + -1 & class348.field5094, (byte) -124, 0);
            int[] var5 = this.method4173(arg0, (byte) -123, 0);
            int[] var6 = this.method4173(class348.field5094 & arg0 - -1, (byte) -119, 0);
            for (int var7 = 0; ~class673.field9452 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1051;
                int var9 = (var5[class407.field5754 & var7 - -1] + -var5[var7 + -1 & class407.field5754]) * this.field1051;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != 4095) {
            method602(47);
        }
        return var3;
    }
}
