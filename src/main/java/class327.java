import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class327 extends class38 {

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    private int field4664 = 4096;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "Z")
    private boolean field4668 = true;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field4665 = 0;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "Lqe;")
    public static class469 field4663 = new class469(44, 6);

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "D")
    public static double field4667;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "(B)V")
    public static void method2073(byte arg0) {
        field4663 = null;
        if (arg0 != 10) {
            field4667 = 1.147012112179479D;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        ++field4661;
        if (arg0 != -18210) {
            this.method196(-91, -13);
        }
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[] var4 = this.method189(arg1 + -1 & class619.field8708, 0, (byte) -92);
            int[] var5 = this.method189(arg1, 0, (byte) -92);
            int[] var6 = this.method189(class619.field8708 & arg1 + 1, 0, (byte) -92);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class729.field10216 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4664;
                int var12 = (var5[class554.field7909 & var10 + 1] + -var5[var10 - 1 & class554.field7909]) * this.field4664;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field4668) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
    public class327() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4668 = ~arg2.method3745(-6314) == -2;
            }
        } else {
            this.field4664 = arg2.method3712((byte) 25);
        }
        if (arg0 >= 34) {
            ++field4666;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZZLmba;Z)V")
    public static final void method2074(boolean arg0, boolean arg1, class421 arg2, boolean arg3) {
        ++field4662;
        int var4 = arg2.field6282;
        int var5 = (int) arg2.field2810;
        arg2.method1304((byte) 7);
        if (arg3) {
            class594.method3466(var4, (byte) -71);
        }
        class12.method82(var4, -1);
        class46 var6 = class405.method2580(var5, 96);
        if (var6 != null) {
            class673.method3850(var6, (byte) 123);
        }
        class693.method3938(35);
        if (!arg0 && ~class87.field1249 != 0) {
            class127.method894(class87.field1249, 1, 8558);
        }
        class270 var7 = new class270(class291.field4168);
        for (class421 var8 = (class421) var7.method1721(0); var8 != null; var8 = (class421) var7.method1723(true)) {
            if (!var8.method1303((byte) 26)) {
                var8 = (class421) var7.method1721(0);
                if (var8 == null) {
                    break;
                }
            }
            if (~var8.field6285 == -4) {
                int var9 = (int) var8.field2810;
                if (var9 >>> 16 == var4) {
                    method2074(arg0, false, var8, true);
                }
            }
        }
        if (arg1) {
            field4663 = null;
        }
    }
}
