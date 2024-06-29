import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 extends class273 {

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    private int field47 = 4096;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Z")
    private boolean field48 = true;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field46 = 2;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Ljava/lang/String;")
    public static String field51 = "Drop";

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "[I")
    public static int[] field59 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "[I")
    public static int[] field60 = new int[50];

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "Lsb;")
    public static class124 field58;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "[I")
    public static int[] field52;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[I")
    public static int[] field56;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "[I")
    public static int[] field57;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
    public static final void method20(int arg0, byte arg1) {
        if (arg1 < 110) {
            method23((byte) 29);
        }
        ++field54;
        class194 var2 = (class194) class139.field2322.method1063((byte) -17, (long) arg0);
        if (var2 != null) {
            for (int var3 = 0; ~var3 > ~var2.field3179.length; ++var3) {
                var2.field3179[var3] = -1;
                var2.field3173[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field55;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field48 = ~arg0.method1012(4) == -2;
            }
        } else {
            this.field47 = arg0.method996(65280);
        }
        if (arg2 != 5) {
            method20(-111, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, false);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)Lge;")
    public static final class249 method21(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class249 var4 = var3.field2133;
            var3.field2133 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 <= 122) {
            method22(-65);
        }
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[] var4 = this.method1850(arg1 + -1 & class145.field2392, 0, (byte) 102);
            int[] var5 = this.method1850(arg1, 0, (byte) -122);
            int[] var6 = this.method1850(class145.field2392 & arg1 - -1, 0, (byte) -41);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class26.field458 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field47;
                int var12 = (var5[var10 + 1 & client.field4573] + -var5[var10 + -1 & client.field4573]) * this.field47;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field48) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        ++field49;
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public static final void method22(int arg0) {
        ++class139.field2327;
        int var1 = -60 / ((arg0 - -4) / 53);
        ++field53;
        class87.field1405.method607(165, (byte) 85);
        class87.field1405.method971(3792, class167.field2757);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
    public static void method23(byte arg0) {
        field52 = null;
        if (arg0 < -58) {
            field57 = null;
            field51 = null;
            field56 = null;
            field60 = null;
            field59 = null;
            field58 = null;
        }
    }
}
